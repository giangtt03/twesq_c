package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class gj
extends at {
    private String[] a;
    private byte b = (byte)10;
    private int c = 15;
    private k d;
    private int e;
    private int f = 0;
    private int g = 0;
    private int h = 0;
    private boolean i;
    private gj j;
    private a k;
    private boolean s;
    private boolean t = false;
    private int u = 150;

    public gj(String string, int n, int n2, int n3) {
        this(string, n, n2, v.t >= 200 ? 200 : v.t, n3, false);
    }

    public gj(String string, int n, int n2, int n3, int n4, boolean bl) {
        this.o = n3;
        this.p = n4;
        this.a = bx.a(string, n3 - this.b - this.b);
        this.e = this.a.length * bx.c.a();
        this.p = this.e + 20 >= n4 ? n4 : this.e + 20;
        this.c = n3 / 2;
        this.m = n - this.c;
        this.n = n2 - this.p;
        this.d = new k(this.m + this.b - 1, this.n + this.b - 1, this.o - this.b - this.b, this.p - this.b - this.b);
        this.h = 0;
        this.s = true;
    }

    public final void a(boolean bl) {
        this.t = true;
    }

    public final boolean a() {
        return this.t;
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.r || !this.s) {
            return;
        }
        cw.a(graphics, this.m + n, this.n + n2, this.o, this.p, this.m + this.c + n, this.t, 14808319, 152707);
        cw.a(graphics);
        cw.a(graphics, this.d.a + n, this.d.b + n2, this.d.c, this.d.d);
        int n3 = this.a.length - this.h;
        bx.a(graphics, bx.c, this.a, this.h, n3 >= 3 ? 3 : n3, this.m + this.b + n, this.n + this.b + n2, this.o - this.b - this.b, this.e, 0);
        cw.b(graphics);
    }

    public final void i() {
        if (!this.r) {
            return;
        }
        if (this.i) {
            --this.g;
            if (this.g == this.u / 2) {
                boolean bl = false;
                gj gj2 = this;
                this.s = bl;
            }
            if (this.g <= 0) {
                this.b(false);
                if (this.j != null) {
                    this.j.b(this.m());
                }
            }
        }
    }

    public final void a(int n) {
        this.c = n;
    }

    public final void a(k k2) {
        this.d = k2;
    }

    public final void c(boolean bl) {
        this.i = true;
        int n = this.u;
        gj gj2 = this;
        this.g = n;
    }

    public final void a(gj gj2) {
        this.j = gj2;
    }

    public final void a(String[] stringArray) {
        if (this.k == null) {
            this.k = new a(2);
        }
        int n = 0;
        while (n < 2) {
            this.k.a(stringArray[n]);
            ++n;
        }
    }

    public final String b() {
        if (this.k != null) {
            return (String)this.k.b(0);
        }
        return "";
    }

    public final void c() {
        if (this.k != null) {
            this.k.a(0);
        }
    }

    public final void d(boolean bl) {
        this.s = bl;
    }

    public final boolean d() {
        return this.s;
    }
}
