// This is a generated file. Not intended for manual editing.
package com.yndx.gn.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GNPrimaryExpression extends PsiElement {

  @Nullable
  GNArrayAccess getArrayAccess();

  @Nullable
  GNBlock getBlock();

  @Nullable
  GNCall getCall();

  @Nullable
  GNExpression getExpression();

  @Nullable
  GNExpressionList getExpressionList();

  @Nullable
  GNScopeAccess getScopeAccess();

  @Nullable
  GNString getString();

  @Nullable
  PsiElement getIntegerLiteral();

  @Nullable
  PsiElement getIdentifier();

}
