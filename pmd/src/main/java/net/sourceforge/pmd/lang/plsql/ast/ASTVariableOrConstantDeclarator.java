/* Generated By:JJTree: Do not edit this line. ASTVariableOrConstantDeclarator.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTVariableOrConstantDeclarator extends SimpleNode {
  public ASTVariableOrConstantDeclarator(int id) {
    super(id);
  }

  public ASTVariableOrConstantDeclarator(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=57c480e3a370d7aa6a5189936d83b148 (do not edit this line) */
