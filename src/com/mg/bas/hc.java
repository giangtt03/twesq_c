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

    public hc(String k, String string, int n, String string2, int n2) {
        this.k = k;
        n = 7; 
        if (this.f > this.g) {
            if (this.f >= 320) {
                this.f = 320;
            }
        } else if (this.f >= 240) {
            this.f = 240;
        }
        this.f -= 20;
        this.p = bx.a(this.k, this.f - 16, bx.b);
        this.g = 100 + bx.c.a() * this.p.length;
        this.c = (com.mg.bas.v.t - this.f) / 2; 
        this.d = (com.mg.bas.v.u - this.g - ba.a) / 2; 
        this.v = new le();
        this.q = new ex(string, n);
        int n3 = bx.d.a("Nâng cấp") + 20;
        n = (this.f - n3 - n3) / 4;
        this.q.a(this.c + n, this.d + this.g - 30, n3, 18);
        this.q.d(true);
        this.r = new ex(string2, n2);
        this.r.a(this.c + this.f - n - n3, this.d + this.g - 30, n3, 18);
        this.u = new byte[2][4];
        this.u[0] = new byte[]{1, 1, -1, -1};
        byte[] byArray = new byte[4];
        byArray[2] = -1;
        byArray[3] = -1;
        this.u[1] = byArray;
        this.s = new aq[]{this.q, this.r};
        this.w = new by(0xFF0000);
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
        pc.a(graphics, this.c, this.d, this.f, this.g, com.mg.bas.v.aj, false); // Adjust ht.aj if needed
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
