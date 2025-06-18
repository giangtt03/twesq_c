package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class gn
extends aq {
    private Image i;
    private String[] j;
    private int k = 3;

    public gn(Image image, String string, int n) {
        this.i = image;
        this.j = bx.a(string, n - 4);
        if (image != null) {
            this.k = image.getHeight() + 2;
        }
        this.e(this.k + (this.j.length * bx.d.a() + 5));
        this.d(n);
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (this.m()) {
            graphics.setColor(7267055);
            graphics.fillRect(this.c() + n, this.d() + n2, this.e(), this.f());
        }
        if (this.i != null) {
            cw.a(graphics, this.i, 0, 0, this.i.getWidth() / 7, this.i.getHeight(), this.c() + this.e() / 2 + n, this.d() + n2, 17);
        }
        bx.a(graphics, bx.d, this.j, this.c() + 3 + n, this.d() + n2 + this.k, this.e(), this.f(), 0);
    }
}
