import java.util.*;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class MyXQueryVisitor extends XQueryBaseVisitor<List<Node>>{
	Document outDoc;
	private Document inDoc;
	List<Node> scannedNodes = new ArrayList<>();
	private Map<String,List<Node>> contextMap = new HashMap<>();
	private Stack<Map<String,List<Node>>> contextStack = new Stack<>();
	
	public MyXQueryVisitor(){
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            outDoc = db.newDocument();
            inDoc = db.newDocument();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

    }
	
	
	private Node makeElem(String tagName, List<Node> nodes) {
		Node res = outDoc.createElement(tagName);
		for(Node n:nodes) {
			if(n!=null) {
				Node child = outDoc.importNode(n, true);
				res.appendChild(child);
			}
		}
		return res;
	}
	
	private Node makeText(String text) {
		Node res = inDoc.createTextNode(text);
		return res;
	}
	
	private List<Node> dfsGetNodes(Node root, boolean isRoot){
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
	
	@Override public List<Node> visitXq_stringconst(XQueryParser.Xq_stringconstContext ctx) { 
		List<Node> res = new ArrayList<>(); 
		String name = ctx.StringConstant().getText();
		name = name.substring(1, name.length()-1);
		Node n = makeText(name);
		res.add(n);
		return res;
	}

	@Override public List<Node> visitXq_paren(XQueryParser.Xq_parenContext ctx) { 
		return visit(ctx.xq()); 
	}
	
	@Override public List<Node> visitXq_slash(XQueryParser.Xq_slashContext ctx) { 
		List<Node> tmp = visit(ctx.xq());
		scannedNodes = new ArrayList<>(tmp);
		Set<Node> set = new HashSet<>();
		List<Node> dupres = visit(ctx.rp());
		List<Node> res = new ArrayList<>();
		for(Node n:dupres) {
			if(!set.contains(n)) {
				set.add(n);
				res.add(n);
			}
		}
		return res;
	}

	
	@Override public List<Node> visitXq_ap(XQueryParser.Xq_apContext ctx) { 
		return visit(ctx.ap());
	}
	
	@Override public List<Node> visitXq_var(XQueryParser.Xq_varContext ctx) { 
		return contextMap.get(ctx.var().getText());
	}


	@Override public List<Node> visitXq_join(XQueryParser.Xq_joinContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitXq_dslash(XQueryParser.Xq_dslashContext ctx) { 
		List<Node> tmp = visit(ctx.xq());
		scannedNodes = new ArrayList<>(tmp);
		Set<Node> set = new HashSet<>();
		List<Node> allDescendant = new ArrayList<>();
		for(int i=0;i<scannedNodes.size();i++) {
			allDescendant.addAll(dfsGetNodes(scannedNodes.get(i),true));
		}
		scannedNodes.addAll(allDescendant);
		List<Node> dupres = visit(ctx.rp());
		List<Node> res = new ArrayList<>();
		for(Node n:dupres) {
			if(!set.contains(n)) {
				set.add(n);
				res.add(n);
			}
		}
		return res;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitXq_flwr(XQueryParser.Xq_flwrContext ctx) {
		List<Node> res = new ArrayList<Node>();
		flwr(0, res, ctx);
		return res;
	}
	
	private void flwr(int n, List<Node> res, XQueryParser.Xq_flwrContext ctx) {
		if(n < ctx.forClause().var().size()) {
			
			//contextStack.push(new HashMap<String, List<Node>>(contextMap));
			int size = visit(ctx.forClause().xq(n)).size();
			for(int i = 0; i < size; i++) {
				List<Node> v = new ArrayList<Node>();
				v.add(visit(ctx.forClause().xq(n)).get(i));
				contextStack.push(new HashMap<String, List<Node>>(contextMap));
				contextMap.put(ctx.forClause().var(n).getText(), v);
				flwr(n + 1, res, ctx);
				contextMap = contextStack.pop();
			}
			
			//contextMap = contextStack.pop();
		}
		else {
<<<<<<< HEAD
			contextStack.push(new HashMap<String, List<Node>>(contextMap));
			if(ctx.letClause() != null) visit(ctx.letClause());
			if(ctx.whereClause() == null || !visit(ctx.whereClause()).isEmpty()) {
				res.addAll(visit(ctx.returnClause()));
=======
			//contextStack.push(new HashMap<String, List<Node>>(contextMap));
			if(ctx.letClause()!=null)
				visit(ctx.letClause());
			if(ctx.whereClause()!=null) {
				if(!visit(ctx.whereClause()).isEmpty()) 
					res.addAll(visit(ctx.returnClause()));
>>>>>>> origin/master
			}
			//contextMap = contextStack.pop();
		}
	}

	
	@Override public List<Node> visitXq_tag(XQueryParser.Xq_tagContext ctx) { 
		String tagName = ctx.tagName(0).getText();
		List<Node> tmp = visit(ctx.xq());
		Node n = makeElem(tagName,tmp);
		List<Node> res = new ArrayList<>();
		res.add(n);
		return res;	
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitXq_let(XQueryParser.Xq_letContext ctx) {
		//contextStack.push(new HashMap<String, List<Node>>(contextMap));
		int size = ctx.letClause().var().size();
		List<Node> res = new ArrayList<>();
		for(int i = 0; i < size; i++) {
			contextMap.put(ctx.letClause().var(i).getText(), visit(ctx.letClause().xq(i)));
			if(i==size-1)
				res = new ArrayList<>(contextMap.get(ctx.letClause().var(i).getText()));
		}
		//contextMap = contextStack.pop();
		return res;
	}
	
	
	@Override public List<Node> visitXq_comma(XQueryParser.Xq_commaContext ctx) { 
		Map<String,List<Node>> preContext = new HashMap<>(contextMap);
		List<Node> res = new ArrayList<>(visit(ctx.xq(0)));
		contextMap = new HashMap<>(preContext);
		res.addAll(new ArrayList<>(visit(ctx.xq(1))));
		contextMap = new HashMap<>(preContext);
		return res;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitJoinClause(XQueryParser.JoinClauseContext ctx) {
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitForClause(XQueryParser.ForClauseContext ctx) {
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitLetClause(XQueryParser.LetClauseContext ctx) {
		for(int i = 0; i < ctx.var().size(); i++) {
			contextMap.put(ctx.var(i).getText(), visit(ctx.xq(i)));
		}
		return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitWhereClause(XQueryParser.WhereClauseContext ctx) {
		List<Node> res = new ArrayList<Node>();
		List<Node> child = visit(ctx.cond());
		if(!child.isEmpty()) {
			res.add(inDoc.createTextNode("true"));
		}
		return res;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitReturnClause(XQueryParser.ReturnClauseContext ctx) {
		return(visit(ctx.xq()));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitCond_and(XQueryParser.Cond_andContext ctx) {
		List<Node> l = new ArrayList<Node>(visit(ctx.cond(0)));
		List<Node> r = new ArrayList<Node>(visit(ctx.cond(1)));
		List<Node> res = new ArrayList<Node>();
		if(!l.isEmpty() && !r.isEmpty()) {
			res.add(inDoc.createTextNode("true"));
		}
		return res;
	}

	@Override public List<Node> visitCond_empty(XQueryParser.Cond_emptyContext ctx) { 
		List<Node> tmp = visit(ctx.xq());
		List<Node> res = new ArrayList<>();
		if(tmp.isEmpty()) {
			Node True = inDoc.createTextNode("true");
            res.add(True);
		}
		return res;
	}

	@Override public List<Node> visitCond_eq(XQueryParser.Cond_eqContext ctx) { 
		List<Node> tmp = new ArrayList<>(scannedNodes);
		List<Node> left = visit(ctx.xq(0));
		scannedNodes = tmp;
		List<Node> right = visit(ctx.xq(1));
		scannedNodes = tmp;
		List<Node> res = new ArrayList<>();
		for(Node n1:left) {
			for(Node n2:right) {
				if(n1.isEqualNode(n2)) {
					Node True = inDoc.createTextNode("true");
                    res.add(True);
                    return res;
				}
			}
		}
		return res;
	}

	@Override public List<Node> visitCond_ceq(XQueryParser.Cond_ceqContext ctx) { 
		List<Node> tmp = new ArrayList<>(scannedNodes);
		List<Node> left = visit(ctx.xq(0));
		scannedNodes = tmp;
		List<Node> right = visit(ctx.xq(1));
		scannedNodes = tmp;
		List<Node> res = new ArrayList<>();
		for(Node n1:left) {
			for(Node n2:right) {
				if(n1.isEqualNode(n2)) {
					Node True = inDoc.createTextNode("true");
                    res.add(True);
                    return res;
				}
			}
		}
		return res;
	}

	@Override public List<Node> visitCond_deq(XQueryParser.Cond_deqContext ctx) { 
		List<Node> tmp = new ArrayList<>(scannedNodes);
		List<Node> left = visit(ctx.xq(0));
		scannedNodes = tmp;
		List<Node> right = visit(ctx.xq(1));
		scannedNodes = tmp;
		List<Node> res = new ArrayList<>();
		for(Node n1:left) {
			for(Node n2:right) {
				if(n1.isSameNode(n2)) {
					Node True = inDoc.createTextNode("true");
                    res.add(True);
                    return res;
				}
			}
		}
		return res;
	}

	@Override public List<Node> visitCond_is(XQueryParser.Cond_isContext ctx) { 
		List<Node> tmp = new ArrayList<>(scannedNodes);
		List<Node> left = visit(ctx.xq(0));
		scannedNodes = tmp;
		List<Node> right = visit(ctx.xq(1));
		scannedNodes = tmp;
		List<Node> res = new ArrayList<>();
		for(Node n1:left) {
			for(Node n2:right) {
				if(n1.isSameNode(n2)) {
					Node True = inDoc.createTextNode("true");
                    res.add(True);
                    return res;
				}
			}
		}
		return res;
	}
	
	private boolean dfsSatisfy(XQueryParser.Cond_satisfyContext ctx, int level) {
		int size = ctx.var().size();
		System.out.println("size = "+size);
		System.out.println("level = "+level);
		if(level==size) {
			if(visit(ctx.cond()).size()>0)
				return true;
			else
				return false;
		}
		
		List<Node> values = visit(ctx.xq(level));
		String varName = ctx.var(level).getText();
		for(Node n:values) {
			List<Node> binding = new ArrayList<>();
			binding.add(n);
			Map<String,List<Node>> preContext = new HashMap<>(contextMap);
			contextStack.push(preContext);
			contextMap.put(varName, binding);
			
			if(level<size) {
				if(dfsSatisfy(ctx,level+1)) {
					contextMap = contextStack.pop();
					return true;
				}
			}
			contextMap = contextStack.pop();
		}
		return false;
	}
	
	@Override public List<Node> visitCond_satisfy(XQueryParser.Cond_satisfyContext ctx) { 
		List<Node> res = new ArrayList<>();
		Boolean sat = dfsSatisfy(ctx,0);
		if(sat) {
			Node True = inDoc.createTextNode("true");
            res.add(True);
		}
		return res;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitCond_paren(XQueryParser.Cond_parenContext ctx) {
		return visit(ctx.cond());
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitCond_not(XQueryParser.Cond_notContext ctx) {
		List<Node> res = new ArrayList<Node>(visit(ctx.cond()));
		if(res.isEmpty()) {
			res.add(inDoc.createTextNode("true"));
		}
		else {
			res.remove(0);
		}
		return res;
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitCond_or(XQueryParser.Cond_orContext ctx) {
		List<Node> l = new ArrayList<Node>(visit(ctx.cond(0)));
		List<Node> r = new ArrayList<Node>(visit(ctx.cond(1)));
		List<Node> res = new ArrayList<Node>();
		if(!l.isEmpty() || !r.isEmpty()) {
			res.add(inDoc.createTextNode("true"));
		}
		return res;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitJoinAttr(XQueryParser.JoinAttrContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitVar(XQueryParser.VarContext ctx) {
		return(contextMap.get(ctx.getText()));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitAp_child(XQueryParser.Ap_childContext ctx) {
		visit(ctx.doc());
		List<Node> res = visit(ctx.rp());
        scannedNodes = res;
        return res;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitAp_all(XQueryParser.Ap_allContext ctx) {
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
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitRp_dslash(XQueryParser.Rp_dslashContext ctx) {
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
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitRp_star(XQueryParser.Rp_starContext ctx) {
		List<Node> res = new ArrayList<>();
		for(int i=0;i<scannedNodes.size();i++) {
			for(int j=0;j<scannedNodes.get(i).getChildNodes().getLength();j++) {
				res.add(scannedNodes.get(i).getChildNodes().item(j));
			}
		}
		scannedNodes = res;
		return res;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitRp_dot(XQueryParser.Rp_dotContext ctx) {
		return scannedNodes;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitRp_comma(XQueryParser.Rp_commaContext ctx) {
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
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitRp_ddot(XQueryParser.Rp_ddotContext ctx) {
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
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitRp_text(XQueryParser.Rp_textContext ctx) {
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
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitRp_tagName(XQueryParser.Rp_tagNameContext ctx) {
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
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitRp_filter(XQueryParser.Rp_filterContext ctx) {
		List<Node> res = new ArrayList<>();
		visit(ctx.rp());
		res = visit(ctx.filter());
		scannedNodes = res;
		return res;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitRp_paren(XQueryParser.Rp_parenContext ctx) {
		return visit(ctx.rp());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitRp_at(XQueryParser.Rp_atContext ctx) {
		
		List<Node> res = new ArrayList<>();
		for(Node n:scannedNodes) {
			if(n.getNodeType()==Node.ELEMENT_NODE&&n.hasAttributes()) {
				Element elem = (Element) n;
				if(elem.hasAttribute(ctx.attName().getText())) {
					res.add(n.getAttributes().getNamedItem(ctx.attName().getText()));
					//System.out.println(n.getAttributes().getNamedItem(ctx.attName().getText()).getNodeName());
				}
			}
		}
		scannedNodes = res;
		return res;
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitRp_slash(XQueryParser.Rp_slashContext ctx) {
		visit(ctx.rp(0));
		return visit(ctx.rp(1));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitDoc(XQueryParser.DocContext ctx) { 
		List<Node> res = new ArrayList<>();
	    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
<<<<<<< HEAD
	    System.out.println(ctx.fileName().getText());
=======
	    //System.out.print(ctx.fileName().getText());
>>>>>>> origin/master
	    File f = new File(ctx.fileName().getText());
	    DocumentBuilder db = null;
	    try {
	    	db = dbf.newDocumentBuilder();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    try {
	        if (db != null) {
	        	inDoc = db.parse(f);
	        }
	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	    if (inDoc != null) {
	    	inDoc.getDocumentElement().normalize();
	    }
	    
	    res.add(inDoc);
	    scannedNodes = res;
	    return res;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitFilter_rp(XQueryParser.Filter_rpContext ctx) {
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
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitFilter_and(XQueryParser.Filter_andContext ctx) {
		Set<Node> res = new HashSet<>();
		Set<Node> f1 = new HashSet<>(visit(ctx.filter(0)));
		Set<Node> f2 = new HashSet<>(visit(ctx.filter(1)));
		res.addAll(f1);
		res.retainAll(f2);
		scannedNodes = new ArrayList<>(res);
		return new ArrayList<>(res);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitFilter_eq(XQueryParser.Filter_eqContext ctx) {
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
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitFilter_is(XQueryParser.Filter_isContext ctx) {
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
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitFilter_paren(XQueryParser.Filter_parenContext ctx) {
		return visit(ctx.filter());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitFilter_ceq(XQueryParser.Filter_ceqContext ctx) {
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
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitFilter_deq(XQueryParser.Filter_deqContext ctx) { 
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
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitFilter_or(XQueryParser.Filter_orContext ctx) {
		Set<Node> res = new HashSet<>();
		Set<Node> f1 = new HashSet<>(visit(ctx.filter(0)));
		Set<Node> f2 = new HashSet<>(visit(ctx.filter(1)));
		res.addAll(f1);
		res.addAll(f2);
		scannedNodes = new ArrayList<>(res);
		return new ArrayList<>(res);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitFilter_not(XQueryParser.Filter_notContext ctx) { 
		Set<Node> res = new HashSet<>();
		Set<Node> f1 = new HashSet<>(scannedNodes);
		Set<Node> f2 = new HashSet<>(visit(ctx.filter()));
		res.addAll(f1);
		res.removeAll(f2);
		scannedNodes = new ArrayList<>(res);
		return new ArrayList<>(res);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitTagName(XQueryParser.TagNameContext ctx) {
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitAttName(XQueryParser.AttNameContext ctx) {
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitFileName(XQueryParser.FileNameContext ctx) {
		return visitChildren(ctx); 
	}

}
