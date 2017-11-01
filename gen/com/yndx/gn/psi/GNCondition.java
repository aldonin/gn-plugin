// This is a generated file. Not intended for manual editing.
package com.yndx.gn.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GNCondition extends PsiElement {

  @NotNull
  List<GNBlock> getBlockList();

  @Nullable
  GNCondition getCondition();

  @NotNull
  GNExpression getExpression();

}
