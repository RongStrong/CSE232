import java.util.*;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import java.io.*;



public class XQueryTest {
	public static void main(String[] args) throws IOException, TransformerException {
		XQueryLexer lexer = new XQueryLexer(new ANTLRFileStream("xPathTest.txt"));
		XQueryParser parser = new XQueryParser(new CommonTokenStream(lexer));
		ParseTree tree = parser.xq();
		String rewriteRes = rewriter(tree);
		MyXQueryVisitor visitor = new MyXQueryVisitor();
		List<Node> res = visitor.visit(tree);
		writeFile(res, "output.xml");
		System.out.print(res.size());
	}
	
	private static String rewriter(ParseTree inputTree) {
		String res = "";
		if(inputTree==null||inputTree.getChildCount()!=3)
			return res;
		ParseTree forClause = inputTree.getChild(0);
		ParseTree whereClause = inputTree.getChild(1);
		ParseTree returnClause = inputTree.getChild(2);
		/*if(!forClause.getText().startsWith("for"))
			return res;
		if(!whereClause.getText().startsWith("where"))
			return res;
		if(!returnClause.getText().startsWith("return"))
			return res;*/
		Map<String,List<String>> varToList = new HashMap<>();
		//Map<String,Set<String>> varToSet = new HashMap<>();
		List<List<String>> varCatList = new ArrayList<>();
		//List<Set<String>> varCatSet = new ArrayList<>();
		Map<String,String> varToXq = new HashMap<>();
		//System.out.println(whereClause.getText());
		for(int i=0;i<forClause.getChildCount();i++) {
			ParseTree forChild = forClause.getChild(i);
			if(forChild.getText().equals("in")) {
				String var = forClause.getChild(i-1).getText();
				String xq = forClause.getChild(i+1).getText();
				varToXq.put(var, xq);
				//redefine of $var
				if(varToList.containsKey(var)) {
					//varToSet.get(var).remove(var);
					for(int j=0;j<varToList.get(var).size();j++) {
						if(varToList.get(var).get(j).equals(var)) {
							varToList.get(var).remove(j);
							break;
						}
					}
				}
				if(xq.contains("doc")) {
					List<String> newCatList = new ArrayList<>();
					newCatList.add(var);
					//Set<String> newCatSet = new HashSet<>();
					//newCatSet.add(var);
					varCatList.add(newCatList);
					//varCatSet.add(newCatSet);
					varToList.put(var, varCatList.get(varCatList.size()-1));
					//varToSet.put(var, varCatSet.get(varCatSet.size()-1));
				}
				else {
					for(String pastVar:varToList.keySet()) {
						if(xq.contains(pastVar)) {
							varToList.get(pastVar).add(var);
							varToList.put(var, varToList.get(pastVar));
							break;
						}
					}
				}
				
			}
		}
		
		//whereClause
		Set<String> leftVar = new HashSet<>();
		leftVar.addAll(varCatList.get(0));
		List<String[]> nonJoinPairs = new ArrayList<>();
		List<List<String[]>> joinPairs = new ArrayList<>();

		String[] conds = whereClause.getChild(1).getText().split("and");
		for(int i=0;i<conds.length;i++) {
			String[] varPair = conds[i].split("eq");
			//has one non-var
			if(!varToList.containsKey(varPair[0])||!varToList.containsKey(varPair[1])) {
				nonJoinPairs.add(varPair);
				conds[i] = "pass";
			}
			//same catogary
			else if(varToList.get(varPair[0])==varToList.get(varPair[1])) {
				nonJoinPairs.add(varPair);
				conds[i] = "pass";
			}
		}
		for(int i=1;i<varCatList.size();i++) {
			List<String[]> curJoinPairs = new ArrayList<>();
			Set<String> rightVar = new HashSet<>();
			rightVar.addAll(varCatList.get(i));
			for(int j=0;j<conds.length;j++) {
				if(conds[j].equals("pass"))
					continue;
				String[] varPair = conds[j].split("eq");
				//vars in diff cat
				if((leftVar.contains(varPair[0])&&rightVar.contains(varPair[1]))||(leftVar.contains(varPair[1])&&rightVar.contains(varPair[0]))) {
					curJoinPairs.add(varPair);
					conds[j] = "pass";
				}
			}
			joinPairs.add(curJoinPairs);
			leftVar.addAll(rightVar);
		}
		
		String ret = "";
		String oldRet = returnClause.getText();
		for(int i=0;i<oldRet.length();i++) {
			if(oldRet.charAt(i)!='$') {
				ret += oldRet.charAt(i)+"";
				continue;
			}
			else {
				int start = i+1;
				while(i<oldRet.length()&&oldRet.charAt(i)!='/'&&oldRet.charAt(i)!='}'&&oldRet.charAt(i)!=',')
					i++;
				String v = oldRet.substring(start,i);
				ret += "$tuple/"+v+"/*";
				i--;
			}
		}
		
		//rewrite
		String leftBlock = genJoinBlock(varCatList.get(0),varToXq,nonJoinPairs);
		for(int i=0;i<joinPairs.size();i++) {
			String tmpJoin = "join (";
			String rightBlock = genJoinBlock(varCatList.get(i+1),varToXq,nonJoinPairs);
			String leftParam = "[";
			String rightParam = "[";
			Set<String> set = new HashSet<>(varCatList.get(i+1));
			for(int j=0;j<joinPairs.get(i).size();j++) {
				String[] pair = joinPairs.get(i).get(j);
				if(set.contains(pair[0])) {
					String tmp = pair[1];
					pair[1] = pair[0];
					pair[0] = tmp;
				}
				if(j==joinPairs.get(i).size()-1) {
					leftParam += pair[0].substring(1, pair[0].length());
					rightParam += pair[1].substring(1, pair[1].length());
				}
				else {
					leftParam += pair[0].substring(1, pair[0].length())+",";
					rightParam += pair[1].substring(1, pair[1].length())+",";
				}
			}
			leftParam += "]";
			rightParam += "]";
			tmpJoin += leftBlock + ",\n";
			tmpJoin += rightBlock + ",\n";
			tmpJoin += leftParam + ", " + rightParam +")";
			leftBlock = tmpJoin;
		}
		
		res += "for $tuple in " + leftBlock + "\n" + ret;
		
		return res;
	}
	
	private static String genJoinBlock(List<String> varSeq, Map<String,String> map, List<String[]> conds) {
		Set<String> set = new HashSet<>(varSeq);
		String res = "for ";
		for(int i=0;i<varSeq.size();i++) {
			res += varSeq.get(i)+" ";
			res += "in ";
			res += map.get(varSeq.get(i));
			if(i==varSeq.size()-1)
				res+="\n";
			else
				res+=",\n";
		}
		boolean whereFlag = false;
		String where = "where ";
		for(String[] pair:conds) {
			if(set.contains(pair[0])||set.contains(pair[1])) {
				if(whereFlag==false) {
					whereFlag = true;
					where += pair[0]+" eq "+pair[1];
				}
				else {
					where += " and "+pair[0]+" eq "+pair[1];
				}
			}	
		}
		if(whereFlag) {
			res+= where+"\n";
		}
		String ret = "return <tuple>\n";
		for(int i=0;i<varSeq.size();i++) {
			ret+="<"+varSeq.get(i).substring(1, varSeq.get(i).length())+">";
			ret+="{"+varSeq.get(i)+"}";
			ret+="</"+varSeq.get(i).substring(1, varSeq.get(i).length())+">";;
			if(i==varSeq.size()-1) {
				ret+="\n";
			}
			else
				ret+=",\n";
		}
		ret+="</tuple>";
		
		res+=ret;
		return res;
		
	} 
	
	private static void writeFile(List<Node> result, String outputFile) throws TransformerException, FileNotFoundException
    {
        File out = new File(outputFile);
        if(out.exists()){
            out.delete();
        }

        FileOutputStream os = new FileOutputStream(outputFile,true);
        for(Node node : result) {
            Transformer t = TransformerFactory.newInstance().newTransformer();
            t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            t.setOutputProperty(OutputKeys.INDENT, "yes");
            t.transform(new DOMSource(node), new StreamResult(os));
        }
    }
}