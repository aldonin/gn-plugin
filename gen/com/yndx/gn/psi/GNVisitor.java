// This is a generated file. Not intended for manual editing.
package com.yndx.gn.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class GNVisitor extends PsiElementVisitor {

  public void visitArrayAccess(@NotNull GNArrayAccess o) {
    visitPsiElement(o);
  }

  public void visitAssignment(@NotNull GNAssignment o) {
    visitPsiElement(o);
  }

  public void visitAssignmentOperator(@NotNull GNAssignmentOperator o) {
    visitPsiElement(o);
  }

  public void visitBinaryExpression(@NotNull GNBinaryExpression o) {
    visitExpression(o);
  }

  public void visitBinaryOperator(@NotNull GNBinaryOperator o) {
    visitPsiElement(o);
  }

  public void visitBlock(@NotNull GNBlock o) {
    visitPsiElement(o);
  }

  public void visitBracketExpansion(@NotNull GNBracketExpansion o) {
    visitPsiElement(o);
  }

  public void visitCall(@NotNull GNCall o) {
    visitPsiElement(o);
  }

  public void visitCondition(@NotNull GNCondition o) {
    visitPsiElement(o);
  }

  public void visitEscape(@NotNull GNEscape o) {
    visitPsiElement(o);
  }

  public void visitExpansion(@NotNull GNExpansion o) {
    visitPsiElement(o);
  }

  public void visitExpression(@NotNull GNExpression o) {
    visitPsiElement(o);
  }

  public void visitExpressionList(@NotNull GNExpressionList o) {
    visitPsiElement(o);
  }

  public void visitLValue(@NotNull GNLValue o) {
    visitPsiElement(o);
  }

  public void visitPrimaryExpression(@NotNull GNPrimaryExpression o) {
    visitPsiElement(o);
  }

  public void visitScopeAccess(@NotNull GNScopeAccess o) {
    visitPsiElement(o);
  }

  public void visitString(@NotNull GNString o) {
    visitPsiElement(o);
  }

  public void visitUnaryExpression(@NotNull GNUnaryExpression o) {
    visitExpression(o);
  }

  public void visitUnaryGroup(@NotNull GNUnaryGroup o) {
    visitUnaryExpression(o);
  }

  public void visitUnaryOperator(@NotNull GNUnaryOperator o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
