package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public class fv
extends at {
    private int a = 7;
    private String[] b;
    private int c;
    private int d;

    public void a(Graphics graphics, int n, int n2) {
        if (!this.r) {
            return;
        }
        pc.b(graphics, n += this.m, n2 += this.n, this.o, this.p, 0xFFFFFF, true);
        bx.a(graphics, bx.c, this.b, n += this.a, n2 += this.a, this.o, this.p, 0);
    }

    public void a(int n, int n2, int n3, int n4) {
        super.a(n, n2, n3, n4);
    }

    public final void a(String string) {
        this.b = bx.a(string, this.o - this.a - this.a);
        this.p = 0 + this.b.length * bx.c.a() + this.a + this.a;
    }

    public final void i() {
        int n;
        if (!this.r) {
            return;
        }
        if (this.c != this.n()) {
            n = this.c - this.n();
            if (Math.abs(n) > 4) {
                n /= 2;
            }
            this.f(this.n() + n);
        }
        if (this.d != this.o()) {
            n = this.d - this.o();
            if (Math.abs(n) > 4) {
                n /= 2;
            }
            this.g(this.o() + n);
        }
    }

    public final void a(int n, int n2) {
        this.c = n;
        this.d = n2;
    }
}
