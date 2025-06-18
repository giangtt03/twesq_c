package com.mg.bas;
// Data model for a single character, with conversion and assignment utilities.
// Decompiled with: CFR 0.152
// Class Version: 1
public final class ae {
    private char a;

    public final char a() {
        return this.a;
    }

    public final void a(char c) {
        this.a = c;
    }

    public static final char a(int n) {
        if (n < 132 || n > 226) {
            return '';
        }
        return " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~".charAt(n - 132);
    }
}
