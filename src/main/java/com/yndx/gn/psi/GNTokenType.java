package com.yndx.gn.psi;

import com.intellij.psi.tree.IElementType;
import com.yndx.gn.GNLanguage;
import org.jetbrains.annotations.NotNull;

public class GNTokenType extends IElementType {
    GNTokenType(@NotNull String debugName) {
        super(debugName, GNLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "GNTokenType." + super.toString();
    }
}
