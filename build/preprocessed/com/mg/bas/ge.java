package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class ge
extends az {
    private byte e = (byte)100;
    private String f = "";

    public ge() {
        super(Integer.MIN_VALUE);
        this.c = bx.d.a("77:77");
    }

    public final boolean a(int n, int n2) {
        return false;
    }

    public final boolean b() {
        return false;
    }

    public final void c() {
        this.e = (byte)(this.e + 1);
        if (this.e >= 100) {
            this.e = 0;
            this.f = i.a();
        }
    }

    public final void a(Graphics graphics) {
        bx.d.a(graphics, this.f, this.a - 40, this.b + 1, 0);
        bx.d.a(graphics, String.valueOf(ks.h / 1024) + "Kb", this.a + 75, this.b + 1, 2);
    }
}
