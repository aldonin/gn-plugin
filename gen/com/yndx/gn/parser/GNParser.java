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
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ARRAY_ACCESS) {
      r = array_access(b, 0);
    }
    else if (t == ASSIGNMENT) {
      r = assignment(b, 0);
    }
    else if (t == ASSIGNMENT_OPERATOR) {
      r = assignment_operator(b, 0);
    }
    else if (t == BINARY_OPERATOR) {
      r = binary_operator(b, 0);
    }
    else if (t == BLOCK) {
      r = block(b, 0);
    }
    else if (t == BRACKET_EXPANSION) {
      r = bracket_expansion(b, 0);
    }
    else if (t == CALL) {
      r = call(b, 0);
    }
    else if (t == CONDITION) {
      r = condition(b, 0);
    }
    else if (t == ESCAPE) {
      r = escape(b, 0);
    }
    else if (t == EXPANSION) {
      r = expansion(b, 0);
    }
    else if (t == EXPRESSION) {
      r = expression(b, 0, -1);
    }
    else if (t == EXPRESSION_LIST) {
      r = expression_list(b, 0);
    }
    else if (t == L_VALUE) {
      r = l_value(b, 0);
    }
    else if (t == PRIMARY_EXPRESSION) {
      r = primary_expression(b, 0);
    }
    else if (t == SCOPE_ACCESS) {
      r = scope_access(b, 0);
    }
    else if (t == STRING) {
      r = string(b, 0);
    }
    else if (t == UNARY_GROUP) {
      r = unary_group(b, 0);
    }
    else if (t == UNARY_OPERATOR) {
      r = unary_operator(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return gn_file(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(BINARY_EXPRESSION, EXPRESSION, UNARY_EXPRESSION, UNARY_GROUP),
  };

  /* ********************************************************** */
  // identifier '[' expression ']'
  public static boolean array_access(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_access")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, BRACE_LEFT);
    r = r && expression(b, l + 1, -1);
    r = r && consumeToken(b, BRACE_RIGHT);
    exit_section_(b, m, ARRAY_ACCESS, r);
    return r;
  }

  /* ********************************************************** */
  // l_value assignment_operator expression
  public static boolean assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = l_value(b, l + 1);
    r = r && assignment_operator(b, l + 1);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, ASSIGNMENT, r);
    return r;
  }

  /* ********************************************************** */
  // '=' | '+=' | '-='
  public static boolean assignment_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT_OPERATOR, "<assignment operator>");
    r = consumeToken(b, OPERATOR_ASSIGNMENT);
    if (!r) r = consumeToken(b, OPERATOR_ADDITION_ASSIGNMENT);
    if (!r) r = consumeToken(b, OPERATOR_SUBTRACTION_ASSIGNMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '+' | '-'               // highest priority
  //                       | '<' | '<=' | '>' | '>='
  //                       | '==' | '!='
  //                       | '&&'
  //                       | '||'
  public static boolean binary_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binary_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_OPERATOR, "<binary operator>");
    r = consumeToken(b, OPERATOR_ADDITION);
    if (!r) r = consumeToken(b, OPERATOR_SUBTRACTION);
    if (!r) r = consumeToken(b, OPERATOR_LESS_THAN);
    if (!r) r = consumeToken(b, OPERATOR_LESS_THAN_OR_EQUAL);
    if (!r) r = consumeToken(b, OPERATOR_GREATER_THAN);
    if (!r) r = consumeToken(b, OPERATOR_GREATER_THAN_OR_EQUAL);
    if (!r) r = consumeToken(b, OPERATOR_EQUALITY);
    if (!r) r = consumeToken(b, OPERATOR_INEQUALITY);
    if (!r) r = consumeToken(b, OPERATOR_AND);
    if (!r) r = consumeToken(b, OPERATOR_OR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{' statement_list '}'
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    if (!nextTokenIs(b, CURLY_BRACE_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CURLY_BRACE_LEFT);
    r = r && statement_list(b, l + 1);
    r = r && consumeToken(b, CURLY_BRACE_RIGHT);
    exit_section_(b, m, BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // '{' ( identifier | array_access | scope_access ) '}'
  public static boolean bracket_expansion(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bracket_expansion")) return false;
    if (!nextTokenIs(b, CURLY_BRACE_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CURLY_BRACE_LEFT);
    r = r && bracket_expansion_1(b, l + 1);
    r = r && consumeToken(b, CURLY_BRACE_RIGHT);
    exit_section_(b, m, BRACKET_EXPANSION, r);
    return r;
  }

  // identifier | array_access | scope_access
  private static boolean bracket_expansion_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bracket_expansion_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = array_access(b, l + 1);
    if (!r) r = scope_access(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier '(' [ expression_list ] ')' [ block ]
  public static boolean call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, PARENTHESIS_LEFT);
    r = r && call_2(b, l + 1);
    r = r && consumeToken(b, PARENTHESIS_RIGHT);
    r = r && call_4(b, l + 1);
    exit_section_(b, m, CALL, r);
    return r;
  }

  // [ expression_list ]
  private static boolean call_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_2")) return false;
    expression_list(b, l + 1);
    return true;
  }

  // [ block ]
  private static boolean call_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_4")) return false;
    block(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'if' '(' expression ')' block [ 'else' (condition | block) ]
  public static boolean condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITION, "<condition>");
    r = consumeToken(b, "if");
    r = r && consumeToken(b, PARENTHESIS_LEFT);
    r = r && expression(b, l + 1, -1);
    r = r && consumeToken(b, PARENTHESIS_RIGHT);
    r = r && block(b, l + 1);
    r = r && condition_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ 'else' (condition | block) ]
  private static boolean condition_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_5")) return false;
    condition_5_0(b, l + 1);
    return true;
  }

  // 'else' (condition | block)
  private static boolean condition_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "else");
    r = r && condition_5_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // condition | block
  private static boolean condition_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_5_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = condition(b, l + 1);
    if (!r) r = block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '\' ( '$' | '"' | CHAR )
  public static boolean escape(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "escape")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ESCAPE, "<escape>");
    r = consumeToken(b, "\\");
    r = r && escape_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '$' | '"' | CHAR
  private static boolean escape_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "escape_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "$");
    if (!r) r = consumeToken(b, "\"");
    if (!r) r = consumeToken(b, CHAR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '$' ( identifier | bracket_expansion | HEX )
  public static boolean expansion(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expansion")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPANSION, "<expansion>");
    r = consumeToken(b, "$");
    r = r && expansion_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identifier | bracket_expansion | HEX
  private static boolean expansion_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expansion_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = bracket_expansion(b, l + 1);
    if (!r) r = consumeToken(b, HEX);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression { ',' expression }
  public static boolean expression_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_LIST, "<expression list>");
    r = expression(b, l + 1, -1);
    r = r && expression_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ',' expression
  private static boolean expression_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // statement_list
  static boolean gn_file(PsiBuilder b, int l) {
    return statement_list(b, l + 1);
  }

  /* ********************************************************** */
  // identifier | array_access | scope_access
  public static boolean l_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "l_value")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = array_access(b, l + 1);
    if (!r) r = scope_access(b, l + 1);
    exit_section_(b, m, L_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  //                       | INTEGER_LITERAL
  //                       | string
  //                       | call
  //                       | array_access
  //                       | scope_access | block
  //                       | '(' expression ')'
  //                       | '[' [ expression_list [ ',' ] ] ']'
  public static boolean primary_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_EXPRESSION, "<primary expression>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, INTEGER_LITERAL);
    if (!r) r = string(b, l + 1);
    if (!r) r = call(b, l + 1);
    if (!r) r = array_access(b, l + 1);
    if (!r) r = scope_access(b, l + 1);
    if (!r) r = block(b, l + 1);
    if (!r) r = primary_expression_7(b, l + 1);
    if (!r) r = primary_expression_8(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' expression ')'
  private static boolean primary_expression_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_LEFT);
    r = r && expression(b, l + 1, -1);
    r = r && consumeToken(b, PARENTHESIS_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' [ expression_list [ ',' ] ] ']'
  private static boolean primary_expression_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_LEFT);
    r = r && primary_expression_8_1(b, l + 1);
    r = r && consumeToken(b, BRACE_RIGHT);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ expression_list [ ',' ] ]
  private static boolean primary_expression_8_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression_8_1")) return false;
    primary_expression_8_1_0(b, l + 1);
    return true;
  }

  // expression_list [ ',' ]
  private static boolean primary_expression_8_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression_8_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_list(b, l + 1);
    r = r && primary_expression_8_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ ',' ]
  private static boolean primary_expression_8_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression_8_1_0_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // identifier '.' identifier
  public static boolean scope_access(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scope_access")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, DOT, IDENTIFIER);
    exit_section_(b, m, SCOPE_ACCESS, r);
    return r;
  }

  /* ********************************************************** */
  // assignment | call | condition
  static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignment(b, l + 1);
    if (!r) r = call(b, l + 1);
    if (!r) r = condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // { statement }
  static boolean statement_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '"' { CHAR | escape | expansion } '"'
  public static boolean string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING, "<string>");
    r = consumeToken(b, "\"");
    r = r && string_1(b, l + 1);
    r = r && consumeToken(b, "\"");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CHAR | escape | expansion
  private static boolean string_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CHAR);
    if (!r) r = escape(b, l + 1);
    if (!r) r = expansion(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // unary_operator unary_expression
  public static boolean unary_group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_group")) return false;
    if (!nextTokenIs(b, OPERATOR_NOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unary_operator(b, l + 1);
    r = r && unary_expression(b, l + 1);
    exit_section_(b, m, UNARY_GROUP, r);
    return r;
  }

  /* ********************************************************** */
  // '!'
  public static boolean unary_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_operator")) return false;
    if (!nextTokenIs(b, OPERATOR_NOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPERATOR_NOT);
    exit_section_(b, m, UNARY_OPERATOR, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: expression
  // Operator priority table:
  // 0: ATOM(unary_expression)
  // 1: BINARY(binary_expression)
  public static boolean expression(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expression")) return false;
    addVariant(b, "<expression>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expression>");
    r = unary_expression(b, l + 1);
    p = r;
    r = r && expression_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean expression_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expression_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 1 && binary_operator(b, l + 1)) {
        r = expression(b, l, 1);
        exit_section_(b, l, m, BINARY_EXPRESSION, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // primary_expression | unary_group
  public static boolean unary_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, UNARY_EXPRESSION, "<unary expression>");
    r = primary_expression(b, l + 1);
    if (!r) r = unary_group(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
