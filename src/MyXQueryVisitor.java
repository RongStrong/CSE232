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


	@Override public T visitXq_join(XQueryParser.Xq_joinContext ctx) { return visitChildren(ctx); }
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
	@Override public T visitXq_flwr(XQueryParser.Xq_flwrContext ctx) { return visitChildren(ctx); }

	
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
	@Override public T visitXq_let(XQueryParser.Xq_letContext ctx) { return visitChildren(ctx); }
	
	
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
	@Override public T visitJoinClause(XQueryParser.JoinClauseContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitForClause(XQueryParser.ForClauseContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLetClause(XQueryParser.LetClauseContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitWhereClause(XQueryParser.WhereClauseContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitReturnClause(XQueryParser.ReturnClauseContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCond_and(XQueryParser.Cond_andContext ctx) { return visitChildren(ctx); }

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
		if(level==size) {
			if(visit(ctx.cond()).size()>0)
				return true;
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
	@Override public T visitCond_paren(XQueryParser.Cond_parenContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCond_not(XQueryParser.Cond_notContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitCond_or(XQueryParser.Cond_orContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitJoinAttr(XQueryParser.JoinAttrContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVar(XQueryParser.VarContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAp_child(XQueryParser.Ap_childContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAp_all(XQueryParser.Ap_allContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitRp_dslash(XQueryParser.Rp_dslashContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitRp_star(XQueryParser.Rp_starContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitRp_dot(XQueryParser.Rp_dotContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitRp_comma(XQueryParser.Rp_commaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitRp_ddot(XQueryParser.Rp_ddotContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitRp_text(XQueryParser.Rp_textContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitRp_tagName(XQueryParser.Rp_tagNameContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitRp_filter(XQueryParser.Rp_filterContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitRp_paren(XQueryParser.Rp_parenContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitRp_at(XQueryParser.Rp_atContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitRp_slash(XQueryParser.Rp_slashContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public List<Node> visitDoc(XQueryParser.DocContext ctx) { 
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
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFilter_rp(XQueryParser.Filter_rpContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFilter_and(XQueryParser.Filter_andContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFilter_eq(XQueryParser.Filter_eqContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFilter_is(XQueryParser.Filter_isContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFilter_paren(XQueryParser.Filter_parenContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFilter_ceq(XQueryParser.Filter_ceqContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFilter_deq(XQueryParser.Filter_deqContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFilter_or(XQueryParser.Filter_orContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFilter_not(XQueryParser.Filter_notContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTagName(XQueryParser.TagNameContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAttName(XQueryParser.AttNameContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFileName(XQueryParser.FileNameContext ctx) { return visitChildren(ctx); }

}
