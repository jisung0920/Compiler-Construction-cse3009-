// Generated from Expr.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;


public class EvalVisitor extends ExprBaseVisitor<Integer> {

	@Override public Integer visitProg(ExprParser.ProgContext ctx) { 
		return visit(ctx.expr());
	 }

	@Override public Integer visitAS(ExprParser.ASContext ctx) { 
		int left = visit(ctx.expr(0));
		int right = visit(ctx.expr(1));
		if(ctx.op().getText() == "+"){
			return left+right;
		}	
		else
			return left-right;
	 }

	@Override public Integer visitPS(ExprParser.PSContext ctx) { 
		return visit(ctx.expr());
	 }

	@Override public Integer visitMD(ExprParser.MDContext ctx) { 
		int left = visit(ctx.expr(0));//0은 앞에거 1은 뒤에거 : expr + expr, expr 출력은 integer type
		int right = visit(ctx.expr(1));
		if(ctx.op().getText() == "*"){
			return left*right;
		}	
		else
			return left/right;
	}

	@Override public Integer visitINT(ExprParser.INTContext ctx) { 
		return Integer.valueOf(ctx.INT().getText());
	}
}