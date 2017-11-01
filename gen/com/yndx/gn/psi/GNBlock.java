// This is a generated file. Not intended for manual editing.
package com.yndx.gn.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GNBlock extends PsiElement {

  @Nullable
  GNAssignment getAssignment();

  @Nullable
  GNCall getCall();

  @Nullable
  GNCondition getCondition();

}
