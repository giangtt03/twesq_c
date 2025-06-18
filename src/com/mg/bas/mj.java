package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class mj
extends at {
    private int a;
    private int b;
    private String[] c;
    private int d;
    private k e;
    private int f = 0;
    private int g;
    private int h;
    private int i;

    public mj(int n, int n2, int n3, int n4) {
        this.a(n, n2, n3, 20);
        this.g = n3;
        this.h = n;
        this.f = this.o() + 20;
        this.e = new k();
    }

    public final void a(String string, int n, int n2, int n3) {
        this.a = n2;
        this.d = n;
        this.c = bx.a(string, this.g, bx.d);
        this.i(this.c.length * 20);
        this.g(this.f - this.q());
        if (n == 0) {
            int n4 = bx.d.a(this.c[0]) + 20;
            if (this.c.length == 1 && n4 < this.g) {
                this.h(n4);
            }
            this.m = this.h;
            this.b = this.m + 20;
            return;
        }
        int n5 = bx.d.a(this.c[0]) + 20;
        if (this.c.length == 1 && n5 < this.g) {
            this.h(n5);
        }
        this.m = this.h + this.g - this.p();
        this.b = this.m + this.o - 20;
    }

    public final void a(String string, int n) {
        this.a(string, n, 100, 20);
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (this.c == null) {
            return;
        }
        n2 += this.o() + (this.d == 1 ? this.i : 0);
        if (this.d == 0) {
            cw.a(graphics, this.n(), n2, this.p(), this.q(), this.b, 14808319, 152707);
        } else {
            cw.a(graphics, this.n(), n2, this.p(), this.q(), this.b, 16775619, 8023552);
        }
        cw.a(graphics, this.e);
        cw.a(graphics, this.m + 6, n2 + 4, this.p() - 8, this.q());
        bx.a(graphics, bx.d, this.c, this.m + 6, n2 + 4, this.p() - 8, this.q(), 0);
        cw.c(graphics, this.e);
    }

    public final void i() {
        if (this.a > 0) {
            --this.a;
            if (this.a == 0) {
                this.c = null;
                this.h(this.g);
                this.f(this.h);
            }
        }
    }

    public final void a(int n) {
        if (n > 0) {
            return;
        }
        this.i = n;
    }
}
