package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class hc
extends ht {
    private String k;
    private String[] p;
    private ex q;
    private ex r;
    private aq[] s;
    private byte t = 0;
    private byte[][] u;
    private le v = null;
    private d w;

    public hc(String object, String string, int n, String string2, int n2) {
        this.k = object;
        n = 7;
        object = this;
        if (((am)object).f > ((am)object).g) {
            if (((am)object).f >= 320) {
                ((am)object).f = 320;
            }
        } else if (((am)object).f >= 240) {
            ((am)object).f = 240;
        }
        ((am)object).f -= 20;
        ((hc)object).p = bx.a(((hc)object).k, ((am)object).f - 16, bx.b);
        ((am)object).g = 100 + bx.c.a() * ((hc)object).p.length;
        ((al)object).c = (v.t - ((am)object).f) / 2;
        ((al)object).d = (v.u - ((am)object).g - ba.a) / 2;
        ((hc)object).v = new le();
        ((hc)object).q = new ex(string, n);
        int n3 = bx.d.a("Nâng cấp") + 20;
        n = (((am)object).f - n3 - n3) / 4;
        ((hc)object).q.a(((al)object).c + n, ((al)object).d + ((am)object).g - 30, n3, 18);
        ((hc)object).q.d(true);
        ((hc)object).r = new ex(string2, n2);
        ((hc)object).r.a(((al)object).c + ((am)object).f - n - n3, ((al)object).d + ((am)object).g - 30, n3, 18);
        Object object2 = object;
        ((hc)object).u = new byte[2][4];
        ((hc)object2).u[0] = new byte[]{1, 1, -1, -1};
        byte[] byArray = new byte[4];
        byArray[2] = -1;
        byArray[3] = -1;
        ((hc)object2).u[1] = byArray;
        ((hc)object).s = new aq[]{((hc)object).q, ((hc)object).r};
        ((hc)object).w = new by(0xFF0000);
    }

    protected final void s() {
        this.v = null;
    }

    public final void f(int n, int n2) {
        this.e(true);
        byte by2 = this.t;
        int n3 = 0;
        while (n3 < this.s.length) {
            if (this.s[n3].h().a(n, n2)) {
                if (n3 != by2) {
                    this.t = (byte)n3;
                    this.s[by2].d(false);
                    this.s[this.t].d(true);
                }
                this.s[n3].c(n, n2);
                if (this.s[n3].m()) {
                    this.i.d(0, ((ex)this.s[n3]).a());
                }
                return;
            }
            n3 = (byte)(n3 + 1);
        }
    }

    protected final void f(int n) {
        byte by2 = this.t;
        switch (n) {
            case 96: 
            case 97: 
            case 98: 
            case 99: {
                if (!this.s[this.t].f(n)) {
                    int n2 = n - 96;
                    hc hc2 = this;
                    if (n2 >= 0 && (n2 = hc2.u[hc2.t][n2]) >= 0) {
                        hc2.t = (byte)n2;
                    }
                }
                if (by2 == this.t) break;
                this.s[this.t].d(true);
                this.s[by2].d(false);
                return;
            }
            case 95: {
                if (!this.s[this.t].m()) break;
                this.i.d(0, ((ex)this.s[this.t]).a());
            }
        }
    }

    public final void u() {
        if (this.v != null) {
            this.v.i();
        }
    }

    public final void b(Graphics graphics) {
        pc.a(graphics, this.c, this.d, this.f, this.g, v.aj, false);
        if (this.v != null) {
            this.v.a(graphics, this.c + (this.f - this.v.p()) / 2, this.d + 10);
        }
        int n = 0;
        int n2 = 0;
        while (n2 < this.p.length) {
            this.w.a(graphics, this.p[n2], this.c + this.f / 2, this.d + 15 + this.v.q() + n, 1);
            n += bx.b.a();
            ++n2;
        }
        this.q.a(graphics, 0, 0);
        this.r.a(graphics, 0, 0);
    }

    public final void a(Graphics graphics) {
    }

    protected final boolean g(int n) {
        return false;
    }

    protected final void e(int n) {
    }
}
