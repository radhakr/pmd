/* Generated By:JJTree: Do not edit this line. ASTPrimaryPrefix.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTPrimaryPrefix extends SimpleNode {
  public ASTPrimaryPrefix(int id) {
    super(id);
  }

  public ASTPrimaryPrefix(PLSQLParser p, int id) {
    super(p, id);
  }

  private boolean usesSelfModifier;

  public void setUsesSelfModifier() {
  usesSelfModifier = true;
  }

  public boolean usesSelfModifier() {
  return this.usesSelfModifier;
  }



  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=cad5b1adb1db798b825f4a042785d1ce (do not edit this line) */
