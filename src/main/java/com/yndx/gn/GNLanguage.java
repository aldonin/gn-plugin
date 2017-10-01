package com.yndx.gn;

import com.intellij.lang.Language;

public class GNLanguage extends Language {
    public static final GNLanguage INSTANCE = new GNLanguage();

    private GNLanguage() {
        super("GN");
    }
}
