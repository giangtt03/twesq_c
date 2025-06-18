package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Image;

public final class er
extends ChoiceGroup
implements eq {
    private String[] a;
    private int b;

    public er(String string, int n, String[] stringArray, Image[] imageArray, String[] stringArray2) {
        super(string, n, stringArray, null);
        this.b = n;
        this.a = stringArray2;
    }

    public final String a() {
        String string = "";
        Object object = this;
        if (((er)object).b == 2) {
            object = new boolean[this.size()];
            this.getSelectedFlags((boolean[])object);
            try {
                int n = 0;
                while (n < ((Object)object).length) {
                    if (object[n] != false) {
                        string = string.length() > 0 ? String.valueOf(string) + " " + this.a[n] : this.a[n];
                    }
                    ++n;
                }
            }
            catch (Throwable throwable) {}
        } else {
            try {
                string = this.a[this.getSelectedIndex()];
            }
            catch (Throwable throwable) {}
        }
        if (string != null && string.length() >= 0) {
            if ((string = string.trim()).indexOf(" ") > 0) {
                string = "\"" + string + "\"";
            }
            return string;
        }
        return null;
    }
}
