package com.yndx.gn;

import com.intellij.lang.Language;

class GNLanguage extends Language {
    static final GNLanguage INSTANCE = new GNLanguage();

    private GNLanguage() {
        super("GN");
    }
}
