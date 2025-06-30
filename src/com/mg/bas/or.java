package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class or
extends fb
implements bf,
bg,
bn,
bq {
    private dh[][] p = new dh[2][0];
    private int q;
    private String r = "";
    private aw s;
    private ay t;
    private final int[][] u;
    private gb v;
    private gb w;
    private gb x;
    private gb y;
    private oa z;
    private final d A;
    private final d B;
    private final d C;
    private final d D;
    private final d E;
    private final d F;

    public or(oa oa2) {
        super(103, 8, "Xếp Hạng", false);
        this.z = oa2;
        this.a((bf)this);
        this.a(new ba());
        this.d(com.mg.bas.v.t);
        this.e(com.mg.bas.v.u - ba.a);
        int n = this.e() / 10;
        this.u = new int[][]{{10, (n << 1) + 10, 10 + (n << 3)}, {10, (n << 1) + 10, n << 3}};
        this.t = new ay(0);
        this.t.a(this.c(), this.d() + 50, this.e(), this.f() - 60);
        this.t.h(1);
        this.s = new aw();
//        this.s.a(this);
        this.s.a((bn)this);
        this.s.a((bq)this);
        this.s.e(true);
        this.t.b(this.s);
        this.y = new gb(5, 1);
        this.v = new gb(3, 0);
        this.w = new gb(2, 2);
        this.x = new gb(1, 3);
        this.c(com.mg.sq.a.n);
        this.a(this.v);
        this.b(this.y);
        this.A = com.mg.sq.a.g;
        this.A.c(true);
        this.B = com.mg.sq.a.g;
        this.F = bx.c;
        this.C = new iff(new int[]{0xFF0000, 0xFFFFFF});
        this.D = new iff(new int[]{32512, 0xFFFFFF});
        this.E = new iff(new int[]{127, 0xFFFFFF});
    }

    public final void x() {
    }

    public final void y() {
    }

    public final void d(int n, int n2) {
        switch (n2) {
            case 5: {
                ((fc)this.b).a();
                return;
            }
            case 1: {
                if (this.l != null) {
                    this.t();
                    return;
                }
                this.z.z();
                return;
            }
            case 3: {
                or or2 = this;
                bs bs2 = new bs();
                if (or2.q == 0) {
                    bs2.a(new br[]{new br(gs.d[1], 9), new br("Tải lại", 10), new br("Đóng", 11)});
                } else {
                    bs2.a(new br[]{new br(gs.d[0], 8), new br("Tải lại", 10), new br("Đóng", 11)});
                }
                int n3 = bs2.e() > bs2.f() ? bs2.e() : bs2.f();
                bs2.a_(-n3, or2.f() - bs2.f() + n3);
                bs2.d(0, com.mg.bas.v.u - ba.a - bs2.f());
//                bs2.a(or2);
                bs2.a((bg)or2);
                bs2.c(com.mg.sq.a.n);
                bs2.a(or2.w);
                bs2.b(or2.x);
                return;
            }
            case 2: {
                this.l.f(95);
                this.t();
            }
        }
    }

    public final aq a(aw object, int n) {
        Object item = object.i(n);
        if (item instanceof fy) {
            return (fy)item;
        }
        if (item instanceof dp) {
            return new gl(15);
        }
        return null;
    }

    public final void b(aq object, int n) {
        Object item = this.s.i(n);
        if (item instanceof fy) {
            this.r = this.p[this.q][n].c;
            or orObj = this;
            bs bs2 = new bs();
            if (com.mg.sq.a.m != null && com.mg.sq.a.o) {
                bs2.a(new br[]{new br("Xem ME", 6), new br("Chi Tiết", 7)});
            } else {
                bs2.a(new br[]{new br("Chi Tiết", 7)});
            }
            int n2 = orObj.s.s();
            aq aq2 = orObj.s.o(n2);
            k k2 = orObj.t.r();
            int n3 = (com.mg.bas.v.t - bs2.e()) / 2;
            int n4 = orObj.t.d() + aq2.d() - k2.b;
            if (n4 + bs2.f() > com.mg.bas.v.u - ba.a) {
                n4 = com.mg.bas.v.u - ba.a - bs2.f();
            }
            bs2.a_(com.mg.bas.v.t + bs2.e(), n4);
            bs2.d(n3, n4);
            bs2.a((bg)orObj);
            bs2.a(orObj.w);
            bs2.b(orObj.x);
            bs2.c(com.mg.sq.a.n);
            bs2.a_(1);
            orObj.a(bs2);
        }
    }

    public final void a(bs bs2) {
        v.c();
        this.l = bs2;
        this.c(true);
    }

    public final void t() {
        v.c();
        this.l = null;
        this.c(true);
    }

    public final void a(aq aq2, int n) {
    }

    public final void a(aq aq2, int n, int n2) {
    }

    public final void a(Graphics graphics, int n, int n2) {
        graphics.setColor(com.mg.bas.v.am);
        graphics.fillRect(this.c(), this.d(), this.e(), this.f());
        this.A.a(graphics, gs.c[this.q], this.c() + this.e() / 2, this.d() + 5, 1);
        pc.a(graphics, 10 + this.c(), 25 + this.d(), this.e() - 20);
        n = 30 + this.d();
        this.B.a(graphics, gs.e[this.q][0], this.u[this.q][0] - 5 + this.c(), n, 0);
        this.B.a(graphics, gs.e[this.q][1], this.u[this.q][1] + this.c(), n, 0);
        this.B.a(graphics, gs.e[this.q][2], this.u[this.q][2] + this.c(), n, 0);
        this.t.c(true);
        this.t.a(graphics, this.c(), this.d());
        pc.d(graphics, this.c(), this.d(), this.e(), this.f(), -1);
    }

    public final void n() {
        this.t.n();
    }

    public final boolean f(int n) {
        return this.t.f(n);
    }

    public final boolean c(int n, int n2) {
        return this.t.c(n, n2);
    }

    public final boolean e(int n, int n2) {
        return this.t.e(n, n2);
    }

    public final boolean f(int n, int n2) {
        return this.t.f(n, n2);
    }

    public final void a(int n, int n2, Object object) {
        if (object == null) {
            return;
        }
        br br2 = (br)object;
        switch (n2) {
            case 7: {
                ks.a().a(this.r, (byte)103);
                com.mg.sq.a.s().a((String)null, (com.mg.bas.il)null);
                break;
            }
            case 11: {
                this.z.z();
                break;
            }
            case 6: {
                if (com.mg.sq.a.m == null) break;
                com.mg.sq.a.m.a(this.r, 0L);
                break;
            }
            case 11399: {
                if (com.mg.sq.a.m == null) break;
                com.mg.sq.a.m.b(br2.b());
                break;
            }
            case 10: {
                if (this.q == 1) {
                    com.mg.sq.a.s().R();
                    break;
                }
                com.mg.sq.a.s().Q();
                break;
            }
            case 9: {
                if (this.p[1].length > 0) {
                    this.a(1, this.p[1]);
                    break;
                }
                com.mg.sq.a.s().R();
                break;
            }
            case 8: {
                if (this.p[0].length > 0) {
                    this.a(0, this.p[0]);
                    break;
                }
                com.mg.sq.a.s().Q();
                break;
            }
            default: {
                if (com.mg.sq.a.m == null) break;
                com.mg.sq.a.m.j(n2);
            }
        }
        this.t();
    }

    public final void a(int n, dh[] dhArray) {
        this.q = n;
        this.p[n] = dhArray;
        this.s.q();
        n = 0;
        while (n < dhArray.length) {
            fy fy2 = new fy(dhArray[n]);
            fy2.a(this.u[this.q]);
            if (n == 0) {
                fy2.a(this.C);
            } else if (n < 3) {
                fy2.a(this.D);
            } else if (n < 10) {
                fy2.a(this.E);
            } else {
                fy2.a(this.F);
            }
            if (n % 2 == 0) {
                fy2.e(true);
            }
            this.s.a((Object)fy2);
            ++n;
        }
        this.c(true);
    }
}
