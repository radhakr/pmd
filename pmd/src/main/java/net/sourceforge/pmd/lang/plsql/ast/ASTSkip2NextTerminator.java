/* Generated By:JJTree: Do not edit this line. ASTSkip2NextTerminator.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTSkip2NextTerminator extends SimpleNode {
  public ASTSkip2NextTerminator(int id) {
    super(id);
  }

  public ASTSkip2NextTerminator(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=55fe8c560711cf52715a6ddc82ebc389 (do not edit this line) */
