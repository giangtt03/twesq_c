package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.TextField;

public final class es
extends TextField
implements eq {
    public es(String string, String string2, int n, int n2) {
        super(string, string2, 20, n2);
    }

    public final String a() {
        String string = this.getString();
        if (string != null && string.length() >= 0) {
            if ((string = string.trim()).indexOf(" ") > 0) {
                string = "\"" + string + "\"";
            }
            return string;
        }
        return null;
    }
}
