// This is a generated file. Not intended for manual editing.
package com.yndx.gn.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.yndx.gn.psi.GNTypes.*;
import com.yndx.gn.psi.*;

public class GNUnaryGroupImpl extends GNUnaryExpressionImpl implements GNUnaryGroup {

  public GNUnaryGroupImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GNVisitor visitor) {
    visitor.visitUnaryGroup(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GNVisitor) accept((GNVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public GNUnaryExpression getUnaryExpression() {
    return findNotNullChildByClass(GNUnaryExpression.class);
  }

  @Override
  @NotNull
  public GNUnaryOperator getUnaryOperator() {
    return findNotNullChildByClass(GNUnaryOperator.class);
  }

}
