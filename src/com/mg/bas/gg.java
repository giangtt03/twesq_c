package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class gg
extends aq {
    private Object[] i;
    private int j;
    private String k;
    private int l;
    private int m;
    private int n;
    private d o = bx.d;
    private Image p;
    private bg q;
    private int r;

    public final void a(d d2) {
        this.o = d2;
    }

    public gg(String string) {
        this.k = string;
        this.p = com.mg.bas.f.d("/info/increase");
    }

    public final void a(int n, int n2, int n3, int n4) {
        super.a(n, n2, n3, n4);
        this.m = this.l = n + n3 / 2;
    }

    public final int a() {
        return this.j;
    }

    public final Object q() {
        return this.i[this.j];
    }

    public final void a(Object[] objectArray) {
        this.i = objectArray;
        this.j = 0;
    }

    private void i(int n) {
        this.j = n;
        if (this.q != null) {
            gg gg2 = this;
            this.q.a(this.b(), gg2.r, this);
        }
    }

    public final boolean f(int n) {
        if (this.i.length > 1) {
            if (n == 97) {
                this.i((this.j - 1 + this.i.length) % this.i.length);
                this.m = this.c() - this.o.a(this.i[this.j].toString()) / 2;
                return true;
            }
            if (n == 96) {
                this.i((this.j + 1) % this.i.length);
                this.m = this.c() + this.e() + this.o.a(this.i[this.j].toString()) / 2;
                return true;
            }
        }
        return false;
    }

    public final boolean c(int n, int n2) {
        if (n >= this.c() && n < this.c() + this.e() && n2 >= this.d() && n2 <= this.d() + this.f()) {
            if (this.g) {
                if (n <= this.c() + this.e() / 2) {
                    this.f(97);
                } else {
                    this.f(96);
                }
            }
            return true;
        }
        return false;
    }

    public final void d(boolean bl) {
        super.d(bl);
        if (!bl) {
            this.m = this.l;
            return;
        }
        this.n = 0;
    }

    public final void n() {
        if (this.g) {
            if (this.m != this.l) {
                int n = this.l - this.m;
                if (Math.abs(n) > 3) {
                    n /= 3;
                }
                this.m += n;
            }
            if (this.n < 6) {
                ++this.n;
                return;
            }
            this.n = 0;
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        int n3 = this.m + n;
        pc.a(graphics, n += this.c(), n2 += this.d(), this.e(), this.f(), this.m());
        cw.a(graphics);
        if (this.i != null) {
            cw.a(graphics, n, n2, this.e(), this.f());
            this.o.a(graphics, this.i[this.j].toString(), n3, n2 + (this.f() - this.o.a() >> 1) + 1, 1);
            cw.b(graphics);
        }
        if (this.k != null) {
            bx.d.c(true);
            bx.d.a(graphics, this.k, n, n2 - bx.d.a(), 0);
            bx.d.c();
        }
        if (this.g && this.i != null && this.i.length > 1) {
            graphics.drawRegion(this.p, 0, 0, this.p.getHeight(), this.p.getWidth(), 4, n + 4 - this.n / 2, n2 += this.f() - this.p.getWidth() >> 1, 20);
            graphics.drawRegion(this.p, 0, 0, this.p.getHeight(), this.p.getWidth(), 7, n + this.e() - 4 + this.n / 2, n2, 24);
        }
    }

    public final void a(bg bg2) {
        this.q = bg2;
    }

    public final void h(int n) {
        this.r = n;
    }
}
