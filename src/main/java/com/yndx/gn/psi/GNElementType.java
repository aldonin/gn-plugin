package com.yndx.gn.psi;

import com.intellij.psi.tree.IElementType;
import com.yndx.gn.GNLanguage;
import org.jetbrains.annotations.NotNull;

public class GNElementType extends IElementType {
    GNElementType(@NotNull String debugName) {
        super(debugName, GNLanguage.INSTANCE);
    }
}
