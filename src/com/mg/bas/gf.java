package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class gf
extends aq {
    private Image j = com.mg.bas.f.d("/info/btinscrease");
    private int k;
    private int l = 0;
    private k m;
    private String n = null;
    protected int i = 0;
    private k o;
    private bi p;
    private int q = 100;
    private int r = 0;

    public gf(String string) {
        int n = 0;
        this.n = string;
        if (string != null) {
            n = bx.d.a() + 4;
        }
        this.k = this.j.getWidth() / 4;
        this.m = new k(this.k + 4, n, v.t, this.k);
        this.o = new k(this.m.a, this.m.b, this.k / 2, this.k);
        this.e(n + this.m.d + 4);
    }

    public final void d(int n) {
        super.d(n);
        this.m.c = this.l = this.e() - (this.k + 4 << 1);
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.k()) {
            return;
        }
        n += this.c();
        n2 += this.d();
        if (this.n != null) {
            bx.d.a(graphics, this.n, n, n2, 0);
        }
        cw.a(graphics, this.j, this.m() ? (this.k << 1) + this.k : this.k << 1, 0, this.k, this.k, this.m.a - 4 + n, this.m.b + n2, 24);
        cw.a(graphics, this.j, this.m() ? this.k : 0, 0, this.k, this.k, this.m.a + this.m.c + 4 + n, this.m.b + n2, 20);
        int n3 = this.m.b + this.m.d / 2 + n2;
        graphics.setColor(this.m() ? 14210926 : 0xAFAFAF);
        graphics.drawLine(this.m.a + n, n3, this.m.a + this.m.c + n, n3);
        graphics.drawLine(this.m.a + n, n3 + 1, this.m.a + this.m.c + n, n3 + 1);
        graphics.drawLine(this.m.a + n + this.m.c / 2, n3 - 2, this.m.a + n + this.m.c / 2, n3 + 3);
        graphics.setColor(this.m() ? 0xFF1010 : 0xAFAF00);
        graphics.fillRect(this.o.a + n, this.o.b + n2, this.o.c, this.o.d);
        this.c(false);
    }

    public void h(int n) {
        this.i = n > this.q ? this.q : (n < 0 ? 0 : n);
        n = this.l;
        this.o.a = this.m.a + this.i * n / this.q - this.o.c / 2;
        if (this.p != null) {
            this.p.a(this, this.i);
        }
    }

    public final int a() {
        return this.i;
    }

    public final boolean f(int n) {
        if (this.b != null) {
            this.b.c(true);
        }
        switch (n) {
            case 97: {
                this.h(this.i - 10);
                return true;
            }
            case 96: {
                this.h(this.i + 10);
                return true;
            }
            case 98: 
            case 99: {
                return false;
            }
        }
        return true;
    }

    public final boolean c(int n, int n2) {
        if (new k(this.m.a - 4 - this.k, this.m.b, this.k, this.k).a(n -= this.c(), n2 -= this.d())) {
            this.h(this.i - 10);
            return true;
        }
        if (new k(this.m.a + this.m.c + 4, this.m.b, this.k, this.k).a(n, n2)) {
            this.h(this.i + 10);
            return true;
        }
        if (this.m.a(n, n2)) {
            this.h((n -= this.m.a) * 100 / this.m.c);
            return true;
        }
        return false;
    }

    public final void a(bi bi2) {
        this.p = bi2;
    }
}
