package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class hr
extends ht
implements bn,
bq,
il {
    private ns[] k;
    private int p;
    private ns q = null;
    private byte r = 0;
    private k s;
    private ay t;
    private aw u;
    private az v;
    private az w;
    private az x;
    private az y;
    private az z;
    private Object A = null;
    private final d B;
    private final d C;
    private final d D;
    private final d E;
    private final d F;

    public hr() {
        this.a(this);
        this.b(241204);
        this.a(new ba());
        int n = v.t;
        int n2 = v.u - ba.a;
        this.a(0, 0, n, n2);
        this.t = new ay();
        this.t.h(1);
        hr hr2 = this;
        this.x = new gb(9, 0);
        hr2.v = new gb(7, 2);
        hr2.w = new gb(8, 3);
        hr2.z = new bd("Nhận", 1112);
        hr2.y = new bd("C.Tiết", 1113);
        az az2 = hr2.x;
        hr hr3 = hr2;
        hr3.a(az2, true);
        az2 = hr2.w;
        hr3 = hr2;
        hr3.b(az2, true);
        hr2.a(hr2.r);
        if (!cs.a.c(140)) {
            od.h(140);
            gr.m = false;
        }
        this.B = new iff(new int[]{16754176, 0xFF0000});
        int[] nArray = new int[2];
        nArray[0] = 0xBABABA;
        this.C = new iff(nArray);
        this.D = bx.c;
        this.E = new iff(new int[]{11251967, 255});
        this.F = com.mg.sq.a.g;
    }

    public final void a(Graphics graphics) {
        graphics.setColor(0);
        graphics.fillRect(0, 0, v.t, v.u);
        pc.a(graphics, this.c, this.d, this.f, this.g, v.aj, true);
    }

    public final void b(Graphics graphics) {
        switch (this.r) {
            case 0: {
                this.E.a(graphics, "Nhiệm Vụ", this.c + 15, this.d + this.t.d() - 20, 0);
                pc.a(graphics, this.c + 10, this.d + this.t.d() - 3, this.f - 20);
                this.t.a(graphics, this.c, this.d);
                this.t.c(true);
                if (this.k != null && this.k.length > 0) break;
                this.D.a(graphics, "Chưa có nhiệm vụ mới.", this.c + 5, this.d + 30, 0);
                return;
            }
            case 1: 
            case 2: {
                this.E.a(graphics, this.q.b, this.c + 15, this.d + this.t.d() - 20, 0);
                pc.a(graphics, this.c + 10, this.d + this.t.d() - 3, this.f - 20);
                this.t.a(graphics, this.c, this.d);
                this.t.c(true);
            }
        }
    }

    public final void u() {
        if (this.t != null) {
            this.t.n();
        }
    }

    public final void a(byte by) {
        this.u = null;
        this.r = by;
        switch (this.r) {
            case 0: {
                this.p = 0;
                this.t = new ay();
                this.t.h(1);
                this.s = new k(this.c + 4, this.d + 34, this.f - 8, this.g - 44);
                this.t.a(this.s);
                this.u = new aw();
                this.u.a(this);
                this.u.a(this);
                this.u.e(true);
                this.t.b(this.u);
                if (this.k != null && this.k.length > 0) {
                    int n = 0;
                    while (n < this.k.length) {
                        gc gc2 = new gc(String.valueOf(n + 1) + ". " + this.k[n].b, this.t.e() - 20, this.k[n].e ? this.C : this.D);
                        gc2.i(10);
                        gc2.j(6);
                        gc2.d(this.t.e());
                        gc2.b(true);
                        this.u.a((Object)gc2);
                        ++n;
                    }
                    this.o[1] = this.y;
                    this.a(this.y);
                } else {
                    this.a(com.mg.sq.a.n);
                }
                this.u.k(this.p);
                return;
            }
            case 1: {
                this.s = new k(this.c + 8, this.d + 34, this.f - 8, this.g - 44);
                this.t = new ay();
                this.t.h(1);
                this.t.a(this.s);
                this.u = new aw();
                this.u.f(true);
                this.u.a(this);
                this.t.b(this.u);
                gc gc3 = new gc(this.q.c, this.s.c - 10, this.D);
                this.u.a((Object)gc3);
                if (this.q.f != null) {
                    int n = 0;
                    while (n < this.q.f.length) {
                        gc3 = new gc("- " + this.q.f[n].b, 10, this.s.c - 10, this.F, 2);
                        gc3.j(6);
                        this.u.a((Object)gc3);
                        ++n;
                    }
                }
                this.a((az)null);
                return;
            }
            case 2: {
                this.s = new k(this.c + 8, this.d + 34, this.f - 8, this.g - 44);
                this.t = new ay();
                this.t.h(1);
                this.t.a(this.s);
                this.u = new aw();
                this.u.f(true);
                this.u.a(this);
                this.t.b(this.u);
                if (this.q.d > 0L) {
                    this.u.a((Object)new gc("Giá: " + i.a(this.q.d, ",") + " KEN", this.s.c - 10, this.B));
                }
                this.u.a((Object)new gc(this.q.c, this.s.c - 10, this.D));
                this.a(this.z);
            }
        }
    }

    public final void e(int n) {
        switch (n) {
            case 2: {
                this.l.a(false);
                return;
            }
            case 3: {
                ks.a().o(this.k[this.p].a);
                com.mg.sq.a.s().a(null, this);
                return;
            }
            case 8: {
                if (this.m != null) {
                    this.A();
                    return;
                }
                this.l.a(this.h(), false);
                return;
            }
            case 7: {
                this.m.f(95);
                return;
            }
            case 9: {
                br[] brArray;
                hr hr2 = this;
                switch (hr2.r) {
                    case 0: {
                        if (hr2.k != null && hr2.k.length > 0) {
                            brArray = new br[]{new br("Chi Tiết", 1113), new br("Đóng", 1114)};
                            break;
                        }
                        brArray = new br[]{new br("Đóng", 1114)};
                        break;
                    }
                    case 1: {
                        brArray = new br[]{new br("Danh Sách Nhiệm Vụ", 1116), new br("Hủy nhiệm vụ", 1115), new br("Đóng", 1114)};
                        break;
                    }
                    default: {
                        brArray = new br[]{new br("Danh Sách Nhiệm Vụ", 1116), new br("Nhận", 1112), new br("Đóng", 1114)};
                    }
                }
                hr2.a(brArray, hr2.v, (az)new bd("", hr2.v.a()), hr2.w);
                return;
            }
            case 11: {
                this.l.a(false);
                ks.a().n(this.q.a);
                com.mg.sq.a.s().a(null, this);
                if (this.A == null || !(this.A instanceof om)) break;
                ((om)this.A).v();
                nu.b();
                nu.c();
                return;
            }
            case 12: {
                this.l.a(false);
                if (this.q.e) break;
                ks.a().m(this.q.a);
                com.mg.sq.a.s().a(null, this);
                if (this.A == null || !(this.A instanceof om)) break;
                ((om)this.A).v();
            }
        }
    }

    public final void a(ns[] nsArray) {
        this.k = nsArray;
        if (this.r == 0) {
            if (nsArray == null || nsArray.length <= 0) {
                this.a(com.mg.sq.a.n);
                return;
            }
            this.a(this.y);
        }
    }

    public final void f(int n) {
        switch (n) {
            case 98: 
            case 99: {
                if (this.r == 0) {
                    if (this.u == null) break;
                    this.u.f(n);
                    this.p = this.u.s();
                    return;
                }
                this.t.f(n);
            }
        }
    }

    public final void t() {
        al al2 = this.l.a("Chú ý", "Server bận! bạn có muốn thử lại không?", "Có", 3, "Không", 2, 1);
        al2.a(new ba());
        al2.a(this);
        this.l.a(al2, false);
    }

    public final void a(ns ns2) {
        this.q = ns2;
    }

    public final void f(int n, int n2) {
        if (this.r == 0) {
            this.t.c(n, n2);
        }
    }

    public final void e(int n, int n2) {
        if (this.t != null) {
            this.t.j(-n2);
        }
    }

    public final boolean g(int n) {
        switch (n) {
            case 1112: {
                if (!this.q.e) {
                    if (this.q.d > 0L) {
                        hr hr2 = this;
                        al al2 = hr2.l.a("Chú ý", "Bạn sẽ tốn " + i.a(hr2.q.d, ",") + " khi nhận nhiệm vụ này. Bạn có muốn nhận hay không?", "Có", 12, "Không", 2, 1);
                        al2.a(new ba());
                        al2.a(hr2);
                        hr2.l.a(al2, false);
                    } else {
                        ks.a().m(this.q.a);
                        com.mg.sq.a.s().a(null, this);
                        if (this.A != null && this.A instanceof om) {
                            ((om)this.A).v();
                        }
                    }
                }
                return true;
            }
            case 1113: {
                if (this.k == null || this.k.length <= 0) {
                    this.A();
                    return true;
                }
                ks.a().o(this.k[this.p].a);
                com.mg.sq.a.s().a((String)null, (il)null);
                return true;
            }
            case 1114: {
                this.l.a(this.h(), false);
                return true;
            }
            case 1115: {
                hr hr3 = this;
                al al3 = hr3.l.a("Chú ý", "Bạn có chắc muốn hủy nhiệm vụ này không?", "Có", 11, "Không", 2, 1);
                al3.a(new ba());
                al3.a(hr3);
                hr3.l.a(al3, false);
                return true;
            }
            case 1116: {
                if (this.k == null) {
                    ks.a().o();
                    com.mg.sq.a.s().a((String)null, (il)null);
                } else {
                    this.a((byte)0);
                }
                return true;
            }
        }
        return false;
    }

    public final void a(Object object) {
        this.A = object;
    }

    public final void v() {
        if (this.k != null) {
            int n = 0;
            while (n < this.k.length) {
                if (this.q.a.equals(this.k[n].a)) {
                    this.k[n].e = false;
                    break;
                }
                ++n;
            }
        }
        this.a((byte)0);
    }

    public final void w() {
        if (this.k != null) {
            int n = 0;
            while (n < this.k.length) {
                if (this.q.a.equals(this.k[n].a)) {
                    this.k[n].e = true;
                    break;
                }
                ++n;
            }
        }
        this.a((byte)1);
    }

    public final aq a(aw object, int n) {
        if ((object = ((aw)object).i(n)) instanceof gc) {
            return (gc)object;
        }
        return null;
    }

    public final void b(aq object, int n) {
        object = this.u.i(n);
        if (object instanceof gc && this.r == 0) {
            this.g(1113);
        }
    }

    public final void a(aq aq2, int n) {
    }

    public final void a(aq aq2, int n, int n2) {
        this.p = n2;
    }
}
