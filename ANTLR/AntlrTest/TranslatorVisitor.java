import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class TranslatorVisitor extends RenderingBaseVisitor<Void> {

  @Override public Void visitDocument(RenderingParser.DocumentContext ctx) {
    System.out.println("<html>");
    this.visitBlocks(ctx.blocks());
    System.out.println("</html>");
    return null;
  }

  @Override public Void visitBlocks(RenderingParser.BlocksContext ctx) {
    for(RenderingParser.BlockContext blockContext : ctx.block()) {
      this.visit(blockContext);
    };
    return null;
  }

  @Override public Void visitSTAR(RenderingParser.STARContext ctx) {
    int starNum = ctx.STARs().getText().length();
    String printToken ="";

    for(int i=0 ;i<starNum; i++)
        printToken += "<ul>";
    printToken += "<li>" + ctx.TEXT().getText() + "</li>";
    for(int i=0 ;i<starNum; i++)
        printToken += "</ul>";
    
    System.out.println(printToken);

    return null;
  }

  @Override public Void visitPLAINTEXT(RenderingParser.PLAINTEXTContext ctx) {
    System.out.println(ctx.TEXT().getText());
    return null;
  }

  @Override public Void visitHEADER(RenderingParser.HEADERContext ctx) {
    int open = ctx.EQs(0).getText().length();
    int close = ctx.EQs(1).getText().length();
    if (open == close && open <= 6) {
      System.out.print("<h"+open+">");
      System.out.print(ctx.TEXT().getText());
      System.out.println("</h"+close+">");
    } else {
      System.out.print(ctx.EQs(0).getText());
      System.out.print(ctx.TEXT().getText());
      System.out.println(ctx.EQs(1).getText());
    }
    return null;
  }
  @Override public  Void visitHLINE(RenderingParser.HLINEContext ctx){
      int hLineNum = ctx.HLINEs().getText().length();
      if(hLineNum>3)  System.out.println("<hr />");
      else System.out.println(ctx.HLINEs().getText());
    return null;
  }

}