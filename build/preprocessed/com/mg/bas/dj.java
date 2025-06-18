package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// Represents a UI label or stat display, with logic for positioning and sizing based on game state.
public final class dj {
    ls a;
    private int b;

    public final ls a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public dj(String string, int n2, int n3) {
        this.b = n2 - 1;
        if (!oy.g) {
            this.b = -1;
        }
        n2 = 0;
        if (this.b >= 0 && this.b < 20) {
            n2 = oy.c[this.b] + 2;
        } else {
            this.b = -1;
        }
        if (string.equals("") || string.equals("")) {
            string = " ";
        }
        this.a = new ls(bx.d, string, n2, 0, n3 - n2, bx.d.a(), 2);
    }

    public final int c() {
        int n2 = this.a.c();
        if (this.b >= 0 && n2 < oy.d[this.b]) {
            n2 = oy.d[this.b];
        }
        return n2;
    }
}
