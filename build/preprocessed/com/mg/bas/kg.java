package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class kg
extends at {
    private String i = null;
    protected Image a = null;
    protected int b = 64;
    protected int c = 1;
    public jm d;
    public ln e = null;
    public Image f;
    protected boolean g = false;
    protected int h = 0;

    public kg(Image image, int n) {
        this.f = image;
        if (image == null) {
            ct.a("location object truyen hình vao null");
            return;
        }
        this.o = this.f.getWidth();
        this.p = image.getHeight() / n;
    }

    public kg(ln ln2, jm jm2) {
        this.e = ln2;
        this.d = jm2;
        if (ln2 != null) {
            this.m = this.d.d + (this.d.f - ln2.p()) / 2;
            this.n = this.d.e + (this.d.g - ln2.q()) / 2;
        } else {
            this.m = this.d.d;
            this.n = this.d.e;
        }
        this.j(20);
        this.b(jm2.b);
        this.h(this.d.f);
        this.i(this.d.g);
    }

    public void a(Graphics graphics, int n, int n2) {
        if (this.f != null) {
            graphics.drawImage(this.f, this.m + n, this.n + n2, this.q);
        }
        if (this.e != null) {
            this.e.a(graphics, this.m + n, this.n + n2);
            if (this.i != null) {
                bx.c.a(graphics, this.i, this.m + this.e.p() / 2 + n, this.n - this.b + n2, 1);
            }
        }
    }

    public final void b(String string) {
        this.i = string;
        this.a(string);
    }

    public final String a() {
        return this.i;
    }

    protected void a(String string) {
    }

    public void a(int n) {
        this.c = n;
    }

    public final int b() {
        return this.c;
    }

    public void i() {
    }

    public final void a(boolean bl, int n) {
        this.g = false;
        this.h = 0;
    }

    public final boolean c() {
        return this.g;
    }

    public String toString() {
        return String.valueOf(this.i) + "   x = " + this.m + "  y = " + this.n + "   w = " + this.o + "  h= " + this.p;
    }
}
