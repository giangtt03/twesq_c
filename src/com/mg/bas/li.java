package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class li
extends at {
    private String a = "";

    public li(int n, int n2) {
        this.a = String.valueOf(n / 1024) + "/" + n2 / 1024 + "KB";
        this.o = bx.d.a(this.a) + 8;
        this.m = (v.t - this.o) / 2;
        this.n = 2;
    }

    public final void a(Graphics graphics, int n, int n2) {
        pc.a(graphics, this.m, 0, this.o, 18, 0xEF0000, 16177368);
        bx.d.a(graphics, this.a, this.m + 4, this.n + 2, 0);
    }

    public final void i() {
    }
}
