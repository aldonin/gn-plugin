// This is a generated file. Not intended for manual editing.
package com.yndx.gn.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.yndx.gn.psi.GNTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.yndx.gn.psi.*;

public class GNPrimaryExpressionImpl extends ASTWrapperPsiElement implements GNPrimaryExpression {

  public GNPrimaryExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GNVisitor visitor) {
    visitor.visitPrimaryExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GNVisitor) accept((GNVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GNArrayAccess getArrayAccess() {
    return findChildByClass(GNArrayAccess.class);
  }

  @Override
  @Nullable
  public GNBlock getBlock() {
    return findChildByClass(GNBlock.class);
  }

  @Override
  @Nullable
  public GNCall getCall() {
    return findChildByClass(GNCall.class);
  }

  @Override
  @Nullable
  public GNExpression getExpression() {
    return findChildByClass(GNExpression.class);
  }

  @Override
  @Nullable
  public GNExpressionList getExpressionList() {
    return findChildByClass(GNExpressionList.class);
  }

  @Override
  @Nullable
  public GNScopeAccess getScopeAccess() {
    return findChildByClass(GNScopeAccess.class);
  }

  @Override
  @Nullable
  public GNString getString() {
    return findChildByClass(GNString.class);
  }

  @Override
  @Nullable
  public PsiElement getIntegerLiteral() {
    return findChildByType(INTEGER_LITERAL);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}
