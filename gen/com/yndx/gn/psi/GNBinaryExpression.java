// This is a generated file. Not intended for manual editing.
package com.yndx.gn.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GNBinaryExpression extends GNExpression {

  @NotNull
  GNBinaryOperator getBinaryOperator();

  @NotNull
  List<GNExpression> getExpressionList();

}
