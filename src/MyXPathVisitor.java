import java.util.*;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;


public class MyXPathVisitor extends XPathBaseVisitor<List<Node>> {
	List<Node> scannedNodes = new ArrayList<>();
	Document gDoc;
	
	@Override
	public List<Node> visitDoc(XPathParser.DocContext ctx){  
	    List<Node> res = new ArrayList<>();
	    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	    System.out.print(ctx.fileName().getText());
	    File f = new File(ctx.fileName().getText());
	    DocumentBuilder db = null;
	    try {
	    	db = dbf.newDocumentBuilder();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    try {
	        if (db != null) {
	        	gDoc = db.parse(f);
	        }
	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	    if (gDoc != null) {
	    	gDoc.getDocumentElement().normalize();
	    }
	    
	    res.add(gDoc);
	    scannedNodes = res;
	    return res;
	}
	
	
	
	@Override public List<Node> visitAp_child(XPathParser.Ap_childContext ctx) {
		visit(ctx.doc());
		List<Node> res = visit(ctx.rp());
        scannedNodes = res;
        return res;
	}
	
	@Override public List<Node> visitAp_all(XPathParser.Ap_allContext ctx) {
		List<Node> res;
		visit(ctx.doc());
		List<Node> allDescendant = new ArrayList<>();
		for(int i=0;i<scannedNodes.size();i++) {
			allDescendant.addAll(dfsGetNodes(scannedNodes.get(i),true));
		}
		scannedNodes.addAll(allDescendant);
		res = visit(ctx.rp());
		return res;
	}
	
	
	
	@Override public List<Node> visitRp_dslash(XPathParser.Rp_dslashContext ctx) { 
		List<Node> res;
		visit(ctx.rp(0));
		List<Node> allDescendant = new ArrayList<>();
		for(int i=0;i<scannedNodes.size();i++) {
			allDescendant.addAll(dfsGetNodes(scannedNodes.get(i),true));
		}
		scannedNodes.addAll(allDescendant);
		res = visit(ctx.rp(1));
		return res; 
	}
	
	@Override public List<Node> visitRp_star(XPathParser.Rp_starContext ctx) {
		List<Node> res = new ArrayList<>();
		for(int i=0;i<scannedNodes.size();i++) {
			for(int j=0;j<scannedNodes.get(i).getChildNodes().getLength();j++) {
				res.add(scannedNodes.get(i).getChildNodes().item(j));
			}
		}
		scannedNodes = res;
		return res;
	}
	
	@Override public List<Node> visitRp_dot(XPathParser.Rp_dotContext ctx) {
		return scannedNodes;
	}
	
	@Override public List<Node> visitRp_comma(XPathParser.Rp_commaContext ctx) {
		List<Node> res = new ArrayList<>();
		List<Node> copy = new ArrayList<>(scannedNodes);
		List<Node> res1 = new ArrayList<>(visit(ctx.rp(0)));
		scannedNodes = copy;
		List<Node> res2 = new ArrayList<>(visit(ctx.rp(1)));
		res.addAll(res1);
		res.addAll(res2);
		scannedNodes = res;
		return res;
	}
	
	@Override public List<Node> visitRp_ddot(XPathParser.Rp_ddotContext ctx) {
		Set<Node> set = new HashSet<>();
		List<Node> res = new ArrayList<>();
		for(int i=0;i<scannedNodes.size();i++) {
			if(!set.contains(scannedNodes.get(i).getParentNode())) {
				set.add(scannedNodes.get(i).getParentNode());
				res.add(scannedNodes.get(i).getParentNode());
			}
		}
		scannedNodes = res;
		return res;
	}
	
	@Override public List<Node> visitRp_text(XPathParser.Rp_textContext ctx) {
		List<Node> res = new ArrayList<>();
		for(Node n:scannedNodes) {
			for(int i=0;i<n.getChildNodes().getLength();i++) {
				Node child = n.getChildNodes().item(i);
				if(child.getNodeType()==Node.TEXT_NODE&&!child.getTextContent().equals("\n")&&!child.getTextContent().isEmpty())
					res.add(child);
			}
		}
		scannedNodes = res;
		return res;
	}
	
	@Override public List<Node> visitRp_tagName(XPathParser.Rp_tagNameContext ctx) {
		List<Node> res = new ArrayList<>();
		for(Node n:scannedNodes) {
			for(int i=0;i<n.getChildNodes().getLength();i++) {
				Node child = n.getChildNodes().item(i);
				if(child.getNodeType()==Node.ELEMENT_NODE&&child.getNodeName().equals(ctx.getText()))
					res.add(child);
			}
		}
		scannedNodes = res;
		return res;
	}
	
	@Override public List<Node> visitRp_filter(XPathParser.Rp_filterContext ctx) {
		List<Node> res = new ArrayList<>();
		visit(ctx.rp());
		res = visit(ctx.filter());
		scannedNodes = res;
		return res;
	}
	
	@Override public List<Node> visitRp_paren(XPathParser.Rp_parenContext ctx) {
		return visit(ctx.rp());
	}
	
	@Override public List<Node> visitRp_at(XPathParser.Rp_atContext ctx) {
		List<Node> res = new ArrayList<>();
		for(Node n:scannedNodes) {
			if(n.getNodeType()==Node.ELEMENT_NODE&&n.hasAttributes()) {
				Element elem = (Element) n;
				if(elem.hasAttribute(ctx.attName().toString()))
					res.add(n);
			}
		}
		scannedNodes = res;
		return res;
	}
	
	@Override public List<Node> visitRp_slash(XPathParser.Rp_slashContext ctx) {
		visit(ctx.rp(0));
		return visit(ctx.rp(1));
	}
	
	@Override public List<Node> visitFilter_rp(XPathParser.Filter_rpContext ctx) {
		List<Node> res = new ArrayList<>();
		List<Node> copy = new ArrayList<>(scannedNodes);
		for(Node n:copy) {
			scannedNodes = new ArrayList<>();
			scannedNodes.add(n);
			if(visit(ctx.rp()).size()>0)
				res.add(n);
		}
		scannedNodes = res;
		return res;
	}
	
	@Override public List<Node> visitFilter_and(XPathParser.Filter_andContext ctx) {
		Set<Node> res = new HashSet<>();
		Set<Node> f1 = new HashSet<>(visit(ctx.filter(0)));
		Set<Node> f2 = new HashSet<>(visit(ctx.filter(1)));
		res.addAll(f1);
		res.retainAll(f2);
		scannedNodes = new ArrayList<>(res);
		return new ArrayList<>(res);
	}
	
	@Override public List<Node> visitFilter_eq(XPathParser.Filter_eqContext ctx) {
		Set<Node> res = new HashSet<>();
		List<Node> copy = new ArrayList<>(scannedNodes);
		List<Node> result = new ArrayList<>();
		for(Node n:copy) {
			int flag = 0;
			scannedNodes = new ArrayList<>();
			scannedNodes.add(n);
			List<Node> res1 = visit(ctx.rp(0));
			scannedNodes = new ArrayList<>();
			scannedNodes.add(n);
			List<Node> res2 = visit(ctx.rp(1));
			for(int i=0;i<res1.size();i++) {
				for(int j=0;j<res2.size();j++) {
					if(res1.get(i).isEqualNode(res2.get(j))) {
						if(!res.contains(n)) {
							res.add(n);
							result.add(n);
						}
						flag = 1;
						break;
					}
				}
				if(flag==1)
					break;
			}
		}
		scannedNodes = new ArrayList<>(result);
		return result;
	}
	
	@Override public List<Node> visitFilter_is(XPathParser.Filter_isContext ctx) {
		Set<Node> res = new HashSet<>();
		List<Node> copy = new ArrayList<>(scannedNodes);
		List<Node> result = new ArrayList<>();
		for(Node n:copy) {
			int flag = 0;
			scannedNodes = new ArrayList<>();
			scannedNodes.add(n);
			List<Node> res1 = visit(ctx.rp(0));
			scannedNodes = new ArrayList<>();
			scannedNodes.add(n);
			List<Node> res2 = visit(ctx.rp(1));
			for(int i=0;i<res1.size();i++) {
				for(int j=0;j<res2.size();j++) {
					if(res1.get(i).isSameNode(res2.get(j))) {
						if(!res.contains(n)) {
							res.add(n);
							result.add(n);
						}
						flag = 1;
						break;
					}
				}
				if(flag==1)
					break;
			}
		}
		scannedNodes = new ArrayList<>(result);
		return result;
	}
	
	@Override public List<Node> visitFilter_paren(XPathParser.Filter_parenContext ctx) {
		return visit(ctx.filter());
	}
	
	@Override public List<Node> visitFilter_ceq(XPathParser.Filter_ceqContext ctx) {
		Set<Node> res = new HashSet<>();
		List<Node> copy = new ArrayList<>(scannedNodes);
		List<Node> result = new ArrayList<>();
		for(Node n:copy) {
			int flag = 0;
			scannedNodes = new ArrayList<>();
			scannedNodes.add(n);
			List<Node> res1 = visit(ctx.rp(0));
			scannedNodes = new ArrayList<>();
			scannedNodes.add(n);
			List<Node> res2 = visit(ctx.rp(1));
			for(int i=0;i<res1.size();i++) {
				for(int j=0;j<res2.size();j++) {
					if(res1.get(i).isEqualNode(res2.get(j))) {
						if(!res.contains(n)) {
							res.add(n);
							result.add(n);
						}
						flag = 1;
						break;
					}
				}
				if(flag==1)
					break;
			}
		}
		scannedNodes = new ArrayList<>(result);
		return result;
	}
	
	@Override public List<Node> visitFilter_deq(XPathParser.Filter_deqContext ctx) {
		Set<Node> res = new HashSet<>();
		List<Node> copy = new ArrayList<>(scannedNodes);
		List<Node> result = new ArrayList<>();
		for(Node n:copy) {
			int flag = 0;
			scannedNodes = new ArrayList<>();
			scannedNodes.add(n);
			List<Node> res1 = visit(ctx.rp(0));
			scannedNodes = new ArrayList<>();
			scannedNodes.add(n);
			List<Node> res2 = visit(ctx.rp(1));
			for(int i=0;i<res1.size();i++) {
				for(int j=0;j<res2.size();j++) {
					if(res1.get(i).isSameNode(res2.get(j))) {
						if(!res.contains(n)) {
							res.add(n);
							result.add(n);
						}
						flag = 1;
						break;
					}
				}
				if(flag==1)
					break;
			}
		}
		scannedNodes = new ArrayList<>(result);
		return result;
	}
	
	@Override public List<Node> visitFilter_or(XPathParser.Filter_orContext ctx) {
		Set<Node> res = new HashSet<>();
		Set<Node> f1 = new HashSet<>(visit(ctx.filter(0)));
		Set<Node> f2 = new HashSet<>(visit(ctx.filter(1)));
		res.addAll(f1);
		res.addAll(f2);
		scannedNodes = new ArrayList<>(res);
		return new ArrayList<>(res);
	}
	
	@Override public List<Node> visitFilter_not(XPathParser.Filter_notContext ctx) {
		Set<Node> res = new HashSet<>();
		Set<Node> f1 = new HashSet<>(scannedNodes);
		Set<Node> f2 = new HashSet<>(visit(ctx.filter()));
		res.addAll(f1);
		res.removeAll(f2);
		scannedNodes = new ArrayList<>(res);
		return new ArrayList<>(res);
	}
	
	@Override public List<Node> visitTagName(XPathParser.TagNameContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override public List<Node> visitAttName(XPathParser.AttNameContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override public List<Node> visitFileName(XPathParser.FileNameContext ctx) { 
		return visitChildren(ctx); 
	}
	
	public List<Node> dfsGetNodes(Node root, boolean isRoot){
		List<Node> res = new ArrayList<>();
		if(root.getChildNodes().getLength()>0) {
			for(int i=0;i<root.getChildNodes().getLength();i++) {
				res.addAll(dfsGetNodes(root.getChildNodes().item(i),false));
			}
		}
		if(!isRoot)
			res.add(root);
		return res;
	}
}
