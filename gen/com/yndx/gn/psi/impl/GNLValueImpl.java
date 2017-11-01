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

public class GNLValueImpl extends ASTWrapperPsiElement implements GNLValue {

  public GNLValueImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GNVisitor visitor) {
    visitor.visitLValue(this);
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
  public GNScopeAccess getScopeAccess() {
    return findChildByClass(GNScopeAccess.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}
