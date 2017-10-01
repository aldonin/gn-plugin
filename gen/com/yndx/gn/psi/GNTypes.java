// This is a generated file. Not intended for manual editing.
package com.yndx.gn.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.yndx.gn.psi.impl.*;

public interface GNTypes {

  IElementType SOME_RULE = new GNElementType("SOME_RULE");

  IElementType BRACE_LEFT = new GNTokenType("[");
  IElementType BRACE_RIGHT = new GNTokenType("]");
  IElementType COMMA = new GNTokenType(",");
  IElementType CURLY_BRACE_LEFT = new GNTokenType("{");
  IElementType CURLY_BRACE_RIGHT = new GNTokenType("}");
  IElementType DOT = new GNTokenType(".");
  IElementType IDENTIFIER = new GNTokenType("identifier");
  IElementType INTEGER_LITERAL = new GNTokenType("INTEGER_LITERAL");
  IElementType OPERATOR_ADDITION = new GNTokenType("+");
  IElementType OPERATOR_ADDITION_ASSIGNMENT = new GNTokenType("+=");
  IElementType OPERATOR_AND = new GNTokenType("&&");
  IElementType OPERATOR_ASSIGNMENT = new GNTokenType("=");
  IElementType OPERATOR_EQUALITY = new GNTokenType("==");
  IElementType OPERATOR_GREATER_THAN = new GNTokenType(">");
  IElementType OPERATOR_GREATER_THAN_OR_EQUAL = new GNTokenType(">=");
  IElementType OPERATOR_INEQUALITY = new GNTokenType("!=");
  IElementType OPERATOR_LESS_THAN = new GNTokenType("<");
  IElementType OPERATOR_LESS_THAN_OR_EQUAL = new GNTokenType("<=");
  IElementType OPERATOR_NOT = new GNTokenType("!");
  IElementType OPERATOR_OR = new GNTokenType("||");
  IElementType OPERATOR_SUBTRACTION = new GNTokenType("-");
  IElementType OPERATOR_SUBTRACTION_ASSIGNMENT = new GNTokenType("-=");
  IElementType PARENTHESIS_LEFT = new GNTokenType("(");
  IElementType PARENTHESIS_RIGHT = new GNTokenType(")");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == SOME_RULE) {
        return new GNSomeRuleImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
