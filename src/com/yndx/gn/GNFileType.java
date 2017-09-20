package com.yndx.gn;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class GNFileType extends LanguageFileType {
    public static final GNFileType INSTANCE = new GNFileType();

    private GNFileType() {
        super(GNLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "GN file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Build GN file language";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "gn";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return GNIcons.FILE;
    }
}
