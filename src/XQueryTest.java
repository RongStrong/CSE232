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
		MyXQueryVisitor visitor = new MyXQueryVisitor();
		List<Node> res = visitor.visit(tree);
		writeFile(res, "output.xml");
		System.out.print(res.size());
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