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

public class GNConditionImpl extends ASTWrapperPsiElement implements GNCondition {

  public GNConditionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GNVisitor visitor) {
    visitor.visitCondition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GNVisitor) accept((GNVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GNBlock> getBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GNBlock.class);
  }

  @Override
  @Nullable
  public GNCondition getCondition() {
    return findChildByClass(GNCondition.class);
  }

  @Override
  @NotNull
  public GNExpression getExpression() {
    return findNotNullChildByClass(GNExpression.class);
  }

}
