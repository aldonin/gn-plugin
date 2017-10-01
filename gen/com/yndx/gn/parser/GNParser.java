// This is a generated file. Not intended for manual editing.
package com.yndx.gn.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.yndx.gn.psi.GNTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class GNParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == SOME_RULE) {
      r = some_rule(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return gn_file(b, l + 1);
  }

  /* ********************************************************** */
  // statement_list
  static boolean gn_file(PsiBuilder b, int l) {
    return statement_list(b, l + 1);
  }

  /* ********************************************************** */
  // COMMA identifier
  public static boolean some_rule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "some_rule")) return false;
    if (!nextTokenIs(b, COMMA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFIER);
    exit_section_(b, m, SOME_RULE, r);
    return r;
  }

  /* ********************************************************** */
  // identifier | some_rule
  static boolean statement_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_list")) return false;
    if (!nextTokenIs(b, "", COMMA, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = some_rule(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
