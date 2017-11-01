// This is a generated file. Not intended for manual editing.
package com.yndx.gn.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.yndx.gn.psi.impl.*;

public interface GNTypes {

  IElementType ARRAY_ACCESS = new GNElementType("ARRAY_ACCESS");
  IElementType ASSIGNMENT = new GNElementType("ASSIGNMENT");
  IElementType ASSIGNMENT_OPERATOR = new GNElementType("ASSIGNMENT_OPERATOR");
  IElementType BINARY_EXPRESSION = new GNElementType("BINARY_EXPRESSION");
  IElementType BINARY_OPERATOR = new GNElementType("BINARY_OPERATOR");
  IElementType BLOCK = new GNElementType("BLOCK");
  IElementType BRACKET_EXPANSION = new GNElementType("BRACKET_EXPANSION");
  IElementType CALL = new GNElementType("CALL");
  IElementType CONDITION = new GNElementType("CONDITION");
  IElementType ESCAPE = new GNElementType("ESCAPE");
  IElementType EXPANSION = new GNElementType("EXPANSION");
  IElementType EXPRESSION = new GNElementType("EXPRESSION");
  IElementType EXPRESSION_LIST = new GNElementType("EXPRESSION_LIST");
  IElementType L_VALUE = new GNElementType("L_VALUE");
  IElementType PRIMARY_EXPRESSION = new GNElementType("PRIMARY_EXPRESSION");
  IElementType SCOPE_ACCESS = new GNElementType("SCOPE_ACCESS");
  IElementType STRING = new GNElementType("STRING");
  IElementType UNARY_EXPRESSION = new GNElementType("UNARY_EXPRESSION");
  IElementType UNARY_GROUP = new GNElementType("UNARY_GROUP");
  IElementType UNARY_OPERATOR = new GNElementType("UNARY_OPERATOR");

  IElementType BRACE_LEFT = new GNTokenType("[");
  IElementType BRACE_RIGHT = new GNTokenType("]");
  IElementType CHAR = new GNTokenType("CHAR");
  IElementType COMMA = new GNTokenType(",");
  IElementType CURLY_BRACE_LEFT = new GNTokenType("{");
  IElementType CURLY_BRACE_RIGHT = new GNTokenType("}");
  IElementType DOT = new GNTokenType(".");
  IElementType HEX = new GNTokenType("HEX");
  IElementType IDENTIFIER = new GNTokenType("identifier");
  IElementType INTEGER_LITERAL = new GNTokenType("INTEGER_LITERAL");
  IElementType LINE_COMMENT = new GNTokenType("LINE_COMMENT");
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
       if (type == ARRAY_ACCESS) {
        return new GNArrayAccessImpl(node);
      }
      else if (type == ASSIGNMENT) {
        return new GNAssignmentImpl(node);
      }
      else if (type == ASSIGNMENT_OPERATOR) {
        return new GNAssignmentOperatorImpl(node);
      }
      else if (type == BINARY_EXPRESSION) {
        return new GNBinaryExpressionImpl(node);
      }
      else if (type == BINARY_OPERATOR) {
        return new GNBinaryOperatorImpl(node);
      }
      else if (type == BLOCK) {
        return new GNBlockImpl(node);
      }
      else if (type == BRACKET_EXPANSION) {
        return new GNBracketExpansionImpl(node);
      }
      else if (type == CALL) {
        return new GNCallImpl(node);
      }
      else if (type == CONDITION) {
        return new GNConditionImpl(node);
      }
      else if (type == ESCAPE) {
        return new GNEscapeImpl(node);
      }
      else if (type == EXPANSION) {
        return new GNExpansionImpl(node);
      }
      else if (type == EXPRESSION_LIST) {
        return new GNExpressionListImpl(node);
      }
      else if (type == L_VALUE) {
        return new GNLValueImpl(node);
      }
      else if (type == PRIMARY_EXPRESSION) {
        return new GNPrimaryExpressionImpl(node);
      }
      else if (type == SCOPE_ACCESS) {
        return new GNScopeAccessImpl(node);
      }
      else if (type == STRING) {
        return new GNStringImpl(node);
      }
      else if (type == UNARY_EXPRESSION) {
        return new GNUnaryExpressionImpl(node);
      }
      else if (type == UNARY_GROUP) {
        return new GNUnaryGroupImpl(node);
      }
      else if (type == UNARY_OPERATOR) {
        return new GNUnaryOperatorImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
