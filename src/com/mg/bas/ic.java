package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ic
extends al
implements bf {
    private cu k;
    private k l = null;
    private int m;
    private as n;
    private String[] o = null;
    private cu p;
    private k q;
    private k r;
    private int s = 3;
    private int t = 3;
    private int u = 0;
    private String v;
    private Image w = com.mg.bas.f.d("/push");
    private int x = 1;
    private int y;
    private a z;

    public ic(int g, int n, final k l, final as n2, final String s, final String v) {
        super(1);
        this.l = null;
        this.o = null;
        this.s = 3;
        this.t = 3;
        this.u = 0;
        this.w = com.mg.bas.f.d("/push");
        this.x = 1;
        this.v = v;
        super.f = com.mg.bas.v.t - 20;
        super.g = bx.d.a() * this.s + 20;
        super.c = com.mg.bas.v.t - super.f >> 1;
        this.r = new k(35, 20, super.f - 35, super.g);
        if (this.v != null) {
            int n3 = bx.d.a(this.v) + 20;
            final int n4 = super.f - 30;
            if (n3 > n4) {
                n3 = n4;
                com.mg.sq.a.a(this.v, bx.d, n4);
            }
            this.q = new k(5, 0, n3 + 10, 18);
        }
        else {
            this.q = new k(5, 0, super.f - 30, 18);
        }
        this.p = new cu(5, 10);
        this.l = l;
        if (l != null && this.k != null) {
            this.m = this.k.a - l.a;
        }
        this.k = new cu(g, n);
        if (this.l != null) {
            this.m = this.k.a - this.l.a;
            g = this.k.b - this.l.b;
            if (super.g > g) {
                super.g = g;
                super.d = 0;
                if (super.g < bx.d.a() * this.s - 20) {
                    n = (super.g - 20) / bx.d.a();
                    if (n == 0) {
                        n = 1;
                    }
                    this.s = n;
                    this.t = n;
                }
            }
            else {
                super.d = g - super.g;
            }
        }
        if ((this.n = n2) != null) {
            this.n.i();
            super.g = ((n2.q() > super.g) ? (n2.q() + 20) : super.g);
            this.r.a = this.p.a + n2.p() + 3;
            this.r.c = super.f - this.r.a - 5;
            this.p.b = super.g - n2.q();
        }
        this.o = bx.a(s, this.r.c);
        this.t = ((this.o.length < this.s) ? this.o.length : this.s);
        this.z = com.mg.sq.a.s();
    }
    

    protected final void g() {
        if (this.n != null) {
            this.n.i();
        }
        ++this.y;
        if (this.y > 0) {
            this.y = 0;
            ++this.x;
            if (this.x > 6) {
                this.x = 0;
                this.y = -6;
            }
        }
    }

    public final void d(int n, int n2) {
    }

     public final void c(final Graphics graphics) {
        final int n = 0 + super.c;
        final int n2 = 0 + super.d;
        cw.a(graphics, n, n2 + 9, super.f, super.g, this.m + n, false, 14808319, 152707);
        if (this.n != null) {
            this.n.a(graphics, n + this.p.a, n2 + this.p.b);
        }
        pc.a(graphics, n + this.q.a, n2 + this.q.b, this.q.c, this.q.d, 8023552, 16775619);
        if (this.v != null) {
            bx.d.c(true);
            bx.d.a(graphics, this.v, this.q.a + n + 3, this.q.b + n2 + 2, 0);
            bx.d.c(false);
        }
        if (this.o != null) {
            bx.a(graphics, bx.c, this.o, this.u, this.t, this.r.a + n, this.r.b + n2, this.r.c, this.r.d, 0);
        }
        final int n3 = this.w.getWidth() >> 1;
        final int n4 = n + super.f - 10;
        final int n5 = n2 + super.g - 5;
        graphics.drawRegion(this.w, 0, 0, n3, this.w.getHeight(), 0, n4, n5 + this.x, 33);
        graphics.drawRegion(this.w, n3, 0, n3, this.w.getHeight(), 0, n4, n5 + 10, 33);
    }

    public final void c(int n) {
        n = this.u + this.s;
        if (n >= this.o.length) {
            this.z.a(false);
            this.z.M();
            return;
        }
        if (n >= this.o.length - this.s) {
            this.t = this.o.length - n;
        }
        this.u = n;
    }

    public final void a(int n, int n2) {
        if (new k(this.c + this.p.a, this.d + this.p.b, this.n.p(), this.n.q()).a(n, n2) || new k(this.c + this.f - 25, this.d + this.g - 25, 25, 25).a(n, n2)) {
            this.c(95);
        }
    }
}
