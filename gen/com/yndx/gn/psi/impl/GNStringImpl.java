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

public class GNStringImpl extends ASTWrapperPsiElement implements GNString {

  public GNStringImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GNVisitor visitor) {
    visitor.visitString(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GNVisitor) accept((GNVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GNEscape getEscape() {
    return findChildByClass(GNEscape.class);
  }

  @Override
  @Nullable
  public GNExpansion getExpansion() {
    return findChildByClass(GNExpansion.class);
  }

  @Override
  @Nullable
  public PsiElement getChar() {
    return findChildByType(CHAR);
  }

}
