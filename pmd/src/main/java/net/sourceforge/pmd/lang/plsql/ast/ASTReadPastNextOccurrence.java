/* Generated By:JJTree: Do not edit this line. ASTReadPastNextOccurrence.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTReadPastNextOccurrence extends SimpleNode {
  public ASTReadPastNextOccurrence(int id) {
    super(id);
  }

  public ASTReadPastNextOccurrence(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=c93993f5d8f34b1e34469d4d93741de2 (do not edit this line) */
