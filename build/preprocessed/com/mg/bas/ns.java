package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class ns {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public boolean e;
    public nt[] f;
    public String[] g;

    public ns(String string, String string2, String string3, long l) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = l;
        this.g = new String[0];
        this.f = new nt[0];
    }

    public final String toString() {
        String string = "QUEST: id=" + this.a + "-" + this.b + "-" + this.c;
        if (this.f != null && this.f.length > 0) {
            int n = 0;
            while (n < this.f.length) {
                if (this.f[n] != null) {
                    string = String.valueOf(string) + "\n  " + this.f[n].toString();
                }
                ++n;
            }
        }
        return string;
    }
}
