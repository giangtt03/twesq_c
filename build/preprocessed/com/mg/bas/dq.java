package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class dq {
    private String d;
    public final String a;
    private short e;
    public final short b;
    public final eb[] c;

    public dq(String string, String string2, short s, short s2, eb[] ebArray) {
        this.d = string;
        this.a = string2;
        this.e = s;
        this.b = s2;
        this.c = ebArray;
    }

    public final String toString() {
        String string = "[Type] " + (this.e == 3 ? "Inline" : "Popup") + " [Spot] " + String.valueOf(this.b) + (this.d != null ? " [Title] " + this.d : " [Description] " + this.a);
        if (this.c != null) {
            int n = 0;
            while (n < this.c.length) {
                if (this.c[n] != null) {
                    string = String.valueOf(string) + " [Inline " + n + "] " + this.c[n].toString();
                }
                ++n;
            }
        }
        return string;
    }
}
