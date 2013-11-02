package daicy.formula;

import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class Test {
	public static void main(String[] args) throws Exception {

		String[] testStr = { "max(3,max(1,2))", "a + b + 3", "a - (b + 3)",

		"2"

		// "a + (b * 3",
		// "11.1+12b+a*b",

		};

		for (String s : testStr) {
			System.out.println("Input expr: " + s);
			run(s);
			compile(s);
		}

	}

	public static void run(String expr) throws Exception {
		ANTLRStringStream in = new ANTLRStringStream(expr);
		// 词法分析器
		FormulaLexer lexer = new FormulaLexer(in);

		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// 语法分析器
		FormulaParser parser = new FormulaParser(tokens);

		FormulaParser.prog_return ret = parser.prog();

		System.out.println(toStringTree(((BaseTree) ret.getTree())));
		// System.out.println(((BaseTree)ret.getTree()).toStringTree());
		// toStringTree(((BaseTree)ret.getTree()));
	}

	/** Print out a whole tree not just a node */
	public static String toStringTree(BaseTree tree) {
		List<Object> children = tree.getChildren();
		if (children == null || children.size() == 0) {
			System.out.println(tree.toString());
			return tree.toString();
		}
		StringBuffer buf = new StringBuffer();
		if (true) {
			buf.append("(");
			buf.append(tree.toString());
			buf.append(' ');
		}
		for (int i = 0; children != null && i < children.size(); i++) {
			BaseTree t = (BaseTree) children.get(i);
			if (i > 0) {
				buf.append(' ');
			}
			buf.append(t.toStringTree());
			// System.out.println(t.toStringTree());
			toStringTree(t);
		}
		if (true) {
			buf.append(")");
		}
		return buf.toString();
	}

	public static void compile(String in) throws Exception {
		ANTLRStringStream input = new ANTLRStringStream(in);

		// lexer
		FormulaLexer lexer = new FormulaLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// parser
		FormulaParser parser = new FormulaParser(tokens);
		FormulaParser.prog_return ret = parser.prog();

		// AST
		CommonTree t = (CommonTree) ret.getTree();
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
		nodes.setTokenStream(tokens);

		// // type checker
		// FormulaTypeChecker tc = new FormulaTypeChecker(nodes);
		// tc.prog();

		nodes = new CommonTreeNodeStream(t);
		nodes.setTokenStream(tokens);
		// compiler
		// compiler
		FormulaComplier c = new FormulaComplier(nodes);
		c.prog();

		// print compile result
		// Map<String, List<Instruction>> FormulaMap = c.getFunctionMap();
		// Set<Entry<String, List<Instruction>>> set = FormulaMap.entrySet();
		// for (Entry<String, List<Instruction>> e : set) {
		// System.out.println();
		// System.out.println(e.getKey());
		// for(Instruction ins: e.getValue()){
		// System.out.println(ins.toString());
		// }
		// }

		List<Instruction> list = c.getInstruction();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}

		AbstractMachine am = new AbstractMachine(list);
		System.out.println(am.compute());
	}
}
