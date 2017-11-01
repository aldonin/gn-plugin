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

public class GNAssignmentImpl extends ASTWrapperPsiElement implements GNAssignment {

  public GNAssignmentImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GNVisitor visitor) {
    visitor.visitAssignment(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GNVisitor) accept((GNVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public GNAssignmentOperator getAssignmentOperator() {
    return findNotNullChildByClass(GNAssignmentOperator.class);
  }

  @Override
  @NotNull
  public GNExpression getExpression() {
    return findNotNullChildByClass(GNExpression.class);
  }

  @Override
  @NotNull
  public GNLValue getLValue() {
    return findNotNullChildByClass(GNLValue.class);
  }

}
