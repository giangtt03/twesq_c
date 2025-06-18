package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class gh
extends aq {
    private int i = 0;
    private int j = 0;
    private String k = "";

    public gh(String string) {
        this.k = string;
        this.e(bx.d.a() + this.j + this.i);
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.c) {
            return;
        }
        if (this.m()) {
            graphics.setColor(7267055);
            graphics.fillRect(this.c() + n, this.d() + n2 + this.i - 1, this.e(), bx.d.a() + 2);
        }
        cw.a(graphics);
        cw.a(graphics, this.c() + n, this.d() + n2 + this.i - 1, this.e(), bx.d.a());
        bx.d.c(true);
        bx.d.b(true);
        bx.d.a(graphics, this.k, this.c() + this.e() / 2 + n, this.d() + n2 + this.i, 1);
        bx.d.c();
        cw.b(graphics);
        this.c(true);
    }

    public final void d(int n, int n2) {
        this.i = n;
        this.j = 5;
        this.e(bx.d.a() + this.j + this.i);
    }

    public final void a(int n, int n2, int n3, int n4) {
        super.a(n, n2, n3, n4 + this.i + this.j);
    }
}
