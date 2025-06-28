package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class ha
extends al
implements bf {
    private at k;
    private at l;
    private k m;
    private k n;
    private k o;
    private int p = 0;
    private int q = 0;
    private k r;
    private k s;
    private boolean t;
    private int u = 20;
    private int v = 8;
    private int w = 0;
    private int x = 0;
    private boolean y;
    private int z = 20;
    private boolean A = false;
    private lh B;
    private lh C;
    private ol D = null;
    private int E;
    private hi F = null;
    private String G;
    private String H;
    private String I;
    private boolean J = false;
    private int K = 2000;
    private bf L;
    private int M;
    private int N;

    /*
     * WARNING - void declaration
     */
public ha(at at2, at at3, boolean bl, boolean bl2, int n, bf bf2) {
    super(1);
    try {
        this.M = 99030;
        this.L = bf2;
        this.C = go.k;
        this.a((ba) null);
        this.z = 20;
        this.A = false;
        this.k = at2;
        this.l = at3;
        this.y = bl;
        this.p = this.C.g;
        this.t = bl2;
        int n3 = (this.f - 200) / 2;
        int n4 = (this.g - 164) / 2;
        this.m = new k(n3 - (this.u << 1), n4, 200, 68);
        this.n = new k((this.f - 20) / 2, n4 + 68 + 4, 20, 20);
        this.o = new k(n3 + (this.u << 1), n4 + 68 + 8 + 20, 200, 68);
        this.w = 4;
        this.x = this.o.c - 58 - this.w;
        this.r = new k(this.w, this.m.b + this.w, 58, 68 - (this.w << 1));
        this.s = new k(this.x, this.o.b + this.w, 58, 68 - (this.w << 1));
        this.H = com.mg.sq.a.a(this.C.b, bx.d, 100);
        if (!this.y) {
            if (bl2) {
                ((as) at2).c(2);
                ((ki) at3).b(2);
            } else {
                ((as) at2).c(0);
                ((ki) at3).b(3);
            }
            this.q = ((ki) at3).f.c;
            this.N = ((ki) at3).f.e;
            this.G = this.N < 3 ? "Siêu gà" : (this.N < 7 ? "Bờm" : (this.N < 10 ? "Ma lanh" : (this.N == 11 ? "Tốc chiến" : "Tuyệt đỉnh")));
            this.I = com.mg.sq.a.a(((ki) at3).f.b, bx.d, 100);
        } else if (bl2) {
            ((as) at2).c(2);
            ((as) at3).c(0);
        } else {
            ((as) at2).c(0);
            ((as) at3).c(2);
        }
        this.E = bx.d.b() - pc.h.getHeight();
        this.F = new hi();
        this.F.c(this.n.a + this.n.c / 2, this.n.b + this.n.d / 2);
        this.F.a();
        this.b(true);
        this.b(191919);
        return;
    } catch (Throwable throwable) {
        ct.b("combat dialog");
        return;
    }
}

    public ha(lh object, lh object2, boolean bl, boolean bl2, int n, bf bf2) {
        super(1);
        this.M = 99030;
        bf bf3 = bf2;
        ha ha2 = this;
        this.L = bf3;
        this.C = object;
        this.B = object2;
        this.a((ba)null);
        this.z = 20;
        this.A = false;
        this.k = (at) mb.a((lh)object, false);
        this.l = (at) mb.a((lh)object2, false);
        this.y = true;
        this.p = this.C.g;
        this.t = bl2;
        int n2 = (this.f - 200) / 2;
        int n3 = (this.g - 164) / 2;
        this.m = new k(n2 - (this.u << 1), n3, 200, 68);
        this.n = new k((this.f - 20) / 2, n3 + 68 + 4, 20, 20);
        this.o = new k(n2 + (this.u << 1), n3 + 68 + 8 + 20, 200, 68);
        this.w = 4;
        this.x = this.o.c - 58 - this.w;
        this.r = new k(this.w, this.m.b + this.w, 58, 68 - (this.w << 1));
        this.s = new k(this.x, this.o.b + this.w, 58, 68 - (this.w << 1));
        this.H = com.mg.sq.a.a(this.C.b, bx.d, 100);
        if (bl2) {
            if (this.k instanceof as) {
                ((as)this.k).c(2);
            }
            if (this.l instanceof as) {
                ((as)this.l).c(0);
            }
        } else {
            if (this.k instanceof as) {
                ((as)this.k).c(0);
            }
            if (this.l instanceof as) {
                ((as)this.l).c(2);
            }
        }
        this.q = this.B.g;
        this.I = com.mg.sq.a.a(this.B.c, bx.d, 100);
        this.E = bx.d.b() - pc.h.getHeight();
        this.F = new hi();
        this.F.c(this.n.a + this.n.c / 2, this.n.b + this.n.d / 2);
        this.F.a();
        this.b(true);
        this.b(191919);
    }

    public final void a(lh lh2) {
        this.B = lh2;
        this.q = lh2.g;
        this.I = com.mg.sq.a.a(lh2.c, bx.d, 100);
    }

    protected final void g() {
        if (this.J) {
            return;
        }
        if (this.u > 0) {
            this.u -= this.v;
            this.m.a += this.v;
            this.o.a -= this.v;
            --this.v;
            if (this.v <= 0) {
                this.v = 1;
            }
            if (this.u < 0) {
                this.m.a += this.u;
                this.o.a -= this.u;
                this.u = 0;
            }
            this.r.a = this.m.a + this.w;
            this.s.a = this.o.a + this.x;
        } else {
            --this.z;
            if (this.z <= 0) {
                if (this.A) {
                    if (this.D != null) {
                        this.D = null;
                        System.gc();
                    }
                    if (this.L != null) {
                        this.L.d(com.mg.sq.a.s().d().h(), this.M);
                    }
                    ag.b().e(this.h());
                    this.A = false;
                    this.J = true;
                }
                this.z = 0;
            }
        }
        if (this.k != null) {
            this.k.i();
        }
        if (this.l != null) {
            this.l.i();
        }
        if (this.F != null) {
            this.F.i();
        }
        --this.K;
        if (this.K < 0) {
            this.J = true;
            ag.b().b(this, false);
            if (this.D != null && !this.y) {
                ol ol2 = this.D;
                if (ol2.p != null && ol2.p.b() == 1) {
                    ((om)ol2.p).q();
                }
            }
        }
    }

    public final void c(Graphics graphics) {
        int n;
        if (this.J) {
            return;
        }
        int n2 = com.mg.bas.v.aj;
        if (this.N == 11) {
            n2 = 0xFDBDBD;
        }
        pc.c(graphics, this.m.a, this.m.b, this.m.c, this.m.d, n2);
        pc.c(graphics, this.o.a, this.o.b, this.o.c, this.o.d, n2);
        graphics.drawRegion(pc.d, 39, 0, 68, 48, 2, this.m.a + this.m.c - 3, this.r.b + this.r.d, 40);
        graphics.drawRegion(pc.d, 39, 0, 68, 48, 0, this.o.a + 3, this.s.b + this.s.d, 36);
        if (this.k != null) {
            k k2;
            if (!this.t) {
                k2 = this.s;
                n = -1;
            } else {
                k2 = this.r;
                n = 1;
            }
            if (this.k instanceof ki) {
                ((ki)this.k).b(graphics, k2.a + 4 + (k2.c - this.k.p()) / 2, k2.b + (k2.d - this.k.q()) / 2);
            } else {
                this.k.a(graphics, k2.a + 4 + (k2.c - this.k.p()) / 2, k2.b + (k2.d - this.k.q()) / 2);
            }
            this.a(graphics, k2, this.p, this.C.G, this.H, n, this.C.Q);
        }
        if (this.l != null) {
            k k3;
            if (!this.t) {
                k3 = this.r;
                n = 1;
            } else {
                k3 = this.s;
                n = -1;
            }
            if (this.l instanceof ki) {
                ((ki)this.l).b(graphics, k3.a + 4 + (k3.c - this.l.p()) / 2, k3.b + (k3.d - this.l.q()) / 2);
            } else {
                this.l.a(graphics, k3.a + 4 + (k3.c - this.l.p()) / 2, k3.b + k3.d - this.l.q() - 3);
            }
            if (!this.y) {
                ki ki2 = (ki)this.l;
                this.a(graphics, k3, this.q, ki2.f.d, this.I, n, "IQ: " + this.G);
            } else if (this.B != null) {
                this.a(graphics, k3, this.q, this.B.G, this.I, n, this.B.Q);
            }
        }
        this.F.a(graphics);
    }

    private void a(Graphics graphics, k k2, int n, int n2, String string, int n3, String string2) {
        int n4 = k2.a + k2.c + 4;
        int n5 = k2.b + 5 + 3;
        if (n3 == 1) {
            pc.b(graphics, n4, n5 + this.E, n);
            bx.d.c(true);
            bx.d.a(graphics, string, n4 + 17, n5, 0);
            bx.d.c(false);
            bx.d.a(graphics, "Cấp: " + n2, n4, n5 += bx.d.b() + 5, 0);
            bx.d.a(graphics, string2, n4, n5 += bx.d.b() + 5, 0);
            return;
        }
        n4 = k2.a - 4;
        n5 = k2.b + 5 + 3;
        pc.b(graphics, n4 - pc.h.getWidth() / 3, n5 + this.E, n);
        bx.d.c(true);
        bx.d.a(graphics, string, n4 - 17, n5, 2);
        bx.d.c(false);
        bx.d.a(graphics, "Cấp: " + n2, n4, n5 += bx.d.b() + 5, 2);
        bx.d.a(graphics, string2, n4, n5 += bx.d.b() + 5, 2);
    }

    public final void d(int n, int n2) {
    }

    public final void t() {
        this.A = true;
    }

    public final void a(ol ol2) {
        this.D = ol2;
    }
}
