package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ia
extends ht
implements bn,
bq {
    private ay k;
    private aw p;
    private dk[] q;
    private lh r;
    private cz s;
    private ox t;
    private ll[] u;
    private boolean v = false;
    private lq w;
    private boolean x;
    private lq[] y;
    private boolean[] z;
    private lq[] A;
    private ft B;
    private az C;
    private az D;
    private az E;
    private d F = new iff(new int[]{0xFF0000, 0xFFFF00});
    private Image G = f.d("/taythuytinh");

    public ia(lf[] object) {
        this.t = new ox(null);
        this.b(241210);
        this.a(0, 0, v.t, v.u);
        this.r = go.k.a();
        int n = 0;
        while (n < this.r.D.length) {
            int n2 = 0;
            while (n2 < go.l.length) {
                if (this.r.D[n].c.equals(go.l[n2].c)) {
                    this.r.D[n] = go.l[n2];
                }
                ++n2;
            }
            ++n;
        }
        this.s = new cz(this.r);
        this.k = new ay(0);
        this.k.a(this.a(), this.s.q() + 6, this.i(), this.j() - this.s.q() - 6 - ba.a);
        this.p = new aw();
        this.p.a(this);
        this.p.a(this);
        this.p.e(true);
        this.k.b(this.p);
        this.q = new dk[((lf[])object).length];
        n = 0;
        while (n < this.q.length) {
            this.q[n] = new dk(object[n]);
            ++n;
        }
        this.t();
        this.a(com.mg.sq.a.n);
        this.a(this);
        this.y = new lq[4];
        this.z = new boolean[4];
        this.u = new ll[4];
        this.u[0] = this.r.a(0);
        this.u[1] = this.r.a(1);
        this.u[2] = this.r.a(2);
        this.u[3] = this.r.a(3);
        this.B = new ft(go.s / 2L);
        this.B.a(go.s);
        az az2 = this.C = new gb(1, 0);
        object = this;
        object.a(az2, true);
        this.D = new gb(2, 2);
        this.E = new gb(3, 3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void t() {
        int n;
        if (this.q == null) {
            return;
        }
        int n2 = 0;
        int n3 = 0;
        while (n3 < this.q.length) {
            ++n2;
            if (this.q[n3].a && !this.q[n3].e()) {
                n2 += this.q[n3].b.length;
                if (this.q[n3].b.length < this.q[n3].d()) {
                    ++n2;
                }
            }
            ++n3;
        }
        Object object = new Object[n2];
        n2 = 0;
        int n4 = 0;
        while (n4 < this.q.length) {
            object[n2++] = this.q[n4];
            if (this.q[n4].a && !this.q[n4].e()) {
                n = 0;
                while (n < this.q[n4].b.length) {
                    object[n2++] = this.q[n4].b[n];
                    ++n;
                }
                if (this.q[n4].b.length < this.q[n4].d()) {
                    object[n2++] = new dp("Xem thêm", this.q[n4]);
                }
            }
            ++n4;
        }
        n4 = this.p.s();
        n = this.k.r().b;
        aw aw2 = this.p;
        synchronized (aw2) {
            aq aq2;
            this.p.q();
            this.p.a((Object[])object);
            this.p.k(n4);
            n4 = n;
            object = this;
            aq aq3 = object.p.o(object.p.s());
            if (object.p.s() < object.p.a() - 1 && (aq2 = object.p.o(object.p.s() + 1)).d() + aq2.f() - n4 > object.p.f()) {
                n4 = aq2.d() + aq2.f() - object.p.f();
            }
            if (aq3.d() + aq3.f() - n4 > object.p.f()) {
                n4 = aq3.d() + aq3.f() - object.p.f();
            }
            object.k.k(n4);
            this.e(true);
            return;
        }
    }

    public final void e(boolean bl) {
        super.e(bl);
        this.k.c(bl);
    }

    public final void a(int n, lq[] lqArray) {
        int n2 = 0;
        while (n2 < this.q.length) {
            if (this.q[n2].b() == n) {
                this.q[n2].a(lqArray);
                this.q[n2].a = true;
                this.q[n2].c = lqArray.length;
                this.t();
                break;
            }
            ++n2;
        }
        com.mg.sq.a.s().v();
    }

    private static void a(dk dk2) {
        int n = dk2.b == null ? 0 : dk2.b.length;
        ks.a().d(dk2.b(), n);
        com.mg.sq.a.s().a((String)null, (il)null);
    }

    public final void f(int n) {
        this.k.f(n);
    }

    public final void f(int n, int n2) {
        this.k.c(n, n2);
    }

    public final void e(int n, int n2) {
        this.k.e(n, n2);
    }

    public final void g(int n, int n2) {
        this.k.f(n, n2);
    }

    public final void u() {
        this.s.i();
        this.k.n();
        if (this.B != null) {
            this.B.i();
            this.B.b(true);
        }
    }

    public final void a(Graphics graphics) {
        if (this.m != null) {
            this.k.c(true);
        }
        if (this.k.k()) {
            graphics.setColor(v.am);
            graphics.fillRect(0, 0, this.i(), this.j());
            graphics.drawImage(pc.d, this.a() + this.i(), this.c() + this.j() - ba.a, 40);
            pc.a(graphics, 2, this.s.q() + 5, this.i() - 4);
        }
        this.k.a(graphics, this.a(), this.c());
        this.k.c(true);
        graphics.setColor(v.am);
        graphics.fillRect(0, 0, this.s.p(), this.s.q());
        this.s.a(graphics);
        if (this.B != null) {
            this.B.a(graphics, 0, 0);
        }
    }

    public final void b(Graphics graphics) {
    }

    private void a(ll ll2) {
        if (ll2 != null) {
            int n = 0;
            while (n < this.p.a()) {
                if (this.p.o(n) instanceof fj) {
                    fj fj2 = (fj)this.p.o(n);
                    if (fj2.j == ll2.b) {
                        fj2.i = false;
                        fj2.c(true);
                        return;
                    }
                }
                ++n;
            }
        }
    }

    public final void b(aq object, int n) {
        object = this.p.i(n);
        if (object instanceof dk) {
            object = (dk)object;
            if (((dk)object).a) {
                ((dk)object).a = false;
                this.t();
                return;
            }
            if (((dk)object).d() <= 0 || ((dk)object).b != null && ((dk)object).b.length > 0) {
                ((dk)object).a = true;
                this.t();
                return;
            }
            ia.a((dk)object);
            return;
        }
        if (object instanceof dp) {
            object = (dp)object;
            ia.a((dk)((dp)object).b);
            return;
        }
        if (object instanceof lq) {
            Object object2 = (lq)object;
            object = this;
            this.w = object2;
            bs bs2 = new bs();
            Object object3 = null;
            int[] nArray = null;
            if (((lq)object2).e instanceof ll) {
                object2 = (ll)((lq)object2).e;
                if (((ll)object2).h == 2 || ((ll)object2).h == ((ia)object).r.f) {
                    if (((ia)object).y[((ll)object2).e] != null && ((ia)object).y[((ll)object2).e].e.equals(object2)) {
                        object3 = new String[]{"Cởi ra", "Mua", "C.Tiết"};
                        nArray = new int[]{11113, 11111, 11112};
                    } else {
                        object3 = new String[]{"Mặc thử", "Mua", "C.Tiết"};
                        nArray = new int[]{11114, 11111, 11112};
                    }
                }
            }
            if (object3 == null) {
                object3 = new String[]{"Mua", "C.Tiết"};
                nArray = new int[]{11111, 11112};
            }
            object2 = new br[(object3).length];
            int n2 = 0;
            while (n2 < ((br[])object2).length) {
                object2[n2] = new br(object3[n2], (int)nArray[n2]);
                ++n2;
            }
            bs2.a((br[])object2);
            n2 = ((ia)object).p.s();
            object2 = ((ia)object).p.o(n2);
            object3 = ((ia)object).k.r();
            int n3 = (v.t - bs2.e()) / 2;
            int n4 = ((ia)object).k.d() + ((aq)object2).d() - object3.b;
            if (n4 + bs2.f() > v.u - ba.a) {
                n4 = v.u - ba.a - bs2.f();
            }
            bs2.a_(v.t + bs2.e(), n4);
            bs2.d(n3, n4);
            bs2.a_(1);
            bs2.a((bf)object);
            ((ht)object).a(bs2, ((ia)object).D, com.mg.sq.a.n, ((ia)object).E);
            ((ht)object).n = true;
        }
    }

    public final void a(aq aq2, int n) {
    }

    public final void a(aq aq2, int n, int n2) {
    }

    public final aq a(aw object, int n) {
        if ((object = ((aw)object).i(n)) == null) {
            return null;
        }
        if (object instanceof dk) {
            return new fi((dk)object);
        }
        if (object instanceof dp) {
            return new gl(37);
        }
        Image image = null;
        if (object instanceof lq) {
            object = (lq)object;
            if (((lq)object).e instanceof lm) {
                object = (lm)((lq)object).e;
                return new fj(((ld)object).b, ((ld)object).a, ((lm)object).j, ((lm)object).g, ((lm)object).h, -1, false, null, null, 0L);
            }
            if (((lq)object).e instanceof lu) {
                object = (lu)((lq)object).e;
                return new fj(((lu)object).a, ((lu)object).d, ((lu)object).c, this.G);
            }
            if (((lq)object).e instanceof ll) {
                object = (ll)((lq)object).e;
                boolean bl = false;
                if (this.y[((ll)object).e] != null && this.y[((ll)object).e].e.equals(object)) {
                    bl = true;
                }
                try {
                    image = this.t.a(mb.a(((ll)object).n), true);
                }
                catch (Throwable throwable) {}
                return new fj(((ll)object).d, ((ll)object).b, ((ll)object).l, ((ll)object).m, bl, image, ((ll)object).f, ((ll)object).j, this.F, null, 0L);
            }
        }
        return null;
    }

    public final boolean g(int n) {
        switch (n) {
            case 11111: {
                ia ia2 = this;
                boolean cfr_ignored_0 = ia2.w.e instanceof lu;
                al al2 = ag.b().a("Chú ý", "Bạn muốn mua món đồ này không?", "Có", 13, "Không", 12, 1);
                al2.a(ia2);
                ag.b().a(al2, false);
                return true;
            }
            case 11112: {
                ia ia3 = this;
                if (ia3.w != null) {
                    if (ia3.w.e instanceof ll) {
                        ll ll2 = (ll)ia3.w.e;
                        ((ll)ia3.w.e).p = ll2.q == 0 ? -1 : ll2.q;
                        com.mg.sq.a.a(ll2, ia3, "", -123233, "Đóng", 5);
                    } else if (ia3.w.e instanceof lm) {
                        com.mg.sq.a.a((lm)ia3.w.e, null);
                    } else if (ia3.w.e instanceof lu) {
                        lu lu2 = (lu)ia3.w.e;
                        al al3 = ag.b().a(lu2.a, lu2.b, "Đóng", 11119, 1);
                        al3.b(1515);
                        ag.b().a(al3);
                        al3.a(ia3);
                    }
                }
                return true;
            }
            case 11113: {
                ia ia4 = this;
                if (ia4.w != null && ia4.w.e instanceof ll) {
                    ll ll3 = (ll)ia4.w.e;
                    fj fj2 = (fj)ia4.p.o(ia4.p.s());
                    ((fj)ia4.p.o(ia4.p.s())).i = false;
                    ia4.y[ll3.e] = null;
                    ia4.z[ll3.e] = false;
                    if (ia4.u[ll3.e] == null) {
                        ia4.s.b(ll3);
                    } else {
                        ia4.s.a(ia4.u[ll3.e]);
                    }
                }
                return true;
            }
            case 11114: {
                ia ia5 = this;
                if (ia5.w != null && ia5.w.e instanceof ll) {
                    ll ll4 = (ll)ia5.w.e;
                    Object object = ia5.y[ll4.e] != null ? (ll)ia5.y[ll4.e].e : null;
                    ia5.a((ll)object);
                    object = (fj)ia5.p.o(ia5.p.s());
                    ((fj)ia5.p.o(ia5.p.s())).i = true;
                    ia5.y[ll4.e] = ia5.w;
                    ia5.z[ll4.e] = true;
                    ia5.s.a(ll4);
                }
                return true;
            }
            case 11115: {
                a a2 = new a();
                int n2 = 0;
                while (n2 < this.y.length) {
                    if (this.y[n2] != null & this.z[n2]) {
                        a2.a(this.y[n2]);
                    }
                    ++n2;
                }
                if (a2.d() == 0) {
                    this.v();
                } else {
                    lq[] lqArray = new lq[a2.d()];
                    int n3 = 0;
                    while (n3 < lqArray.length) {
                        lqArray[n3] = (lq)a2.b(n3);
                        ++n3;
                    }
                    this.a(lqArray);
                }
                return true;
            }
            case 11116: {
                int n4 = 0;
                while (n4 < this.y.length) {
                    if (this.y[n4] != null && this.z[n4]) {
                        ia ia6 = this;
                        al al4 = ag.b().a("Chú ý", "Bạn đã chọn một số món đồ. Bạn có muốn mua không?", "Có", 11, "Đóng", 8, 1);
                        al4.a(ia6);
                        al4.b(1345779);
                        ag.b().a(al4, false);
                        this.v = true;
                        return true;
                    }
                    ++n4;
                }
                this.w();
                return true;
            }
            case 11117: {
                com.mg.sq.a.s().l();
                hh hh2 = new hh(null, null);
                ag.b().a(hh2);
                return true;
            }
            case 11118: {
                ag.b().a(241209, false);
                return true;
            }
        }
        return false;
    }

    public final void e(int n) {
        switch (n) {
            case 2: {
                if (this.m == null) break;
                this.m.f(95);
                return;
            }
            case 3: {
                this.A();
                return;
            }
            case 1: {
                ia ia2 = this;
                br[] brArray = new br[]{new br("Giỏ hàng", 11115), new br("Đóng", 11116)};
                ia2.a(brArray, ia2.D, com.mg.sq.a.n, ia2.E);
                return;
            }
            case 5: {
                com.mg.sq.a.s().a(241212, false);
                return;
            }
            case 8: {
                com.mg.sq.a.s().a(1345779, false);
                if (!this.v) break;
                this.w();
                return;
            }
            case 9: {
                if (go.b()) {
                    com.mg.sq.a.a((bf)this, "Hành Trang", 11117, "Đóng", 11118);
                    return;
                }
                this.x = true;
                com.mg.sq.a.s().a(154896, false);
                int[] nArray = new int[this.A.length];
                int n2 = 0;
                while (n2 < nArray.length) {
                    nArray[n2] = this.A[n2].a;
                    ++n2;
                }
                ks.a().a(nArray);
                com.mg.sq.a.s().a((String)null, (il)null);
                return;
            }
            case 10: {
                com.mg.sq.a.s().a(154896, false);
                if (!this.v) break;
                this.w();
                return;
            }
            case 11: {
                com.mg.sq.a.s().a(1345779, false);
                a a2 = new a();
                int n3 = 0;
                while (n3 < this.y.length) {
                    if (this.y[n3] != null & this.z[n3]) {
                        a2.a(this.y[n3]);
                    }
                    ++n3;
                }
                if (a2.d() == 0) {
                    this.v();
                    return;
                }
                lq[] lqArray = new lq[a2.d()];
                int n4 = 0;
                while (n4 < lqArray.length) {
                    lqArray[n4] = (lq)a2.b(n4);
                    ++n4;
                }
                this.a(lqArray);
                return;
            }
            case 13: {
                ag.b().a(false);
                ia ia3 = this;
                this.x = false;
                if (ia3.w != null) {
                    ks.a().a(new int[]{ia3.w.a});
                    com.mg.sq.a.s().a((String)null, (il)null);
                }
                return;
            }
            case 12: {
                ag.b().a(false);
                return;
            }
            case 11119: {
                ag.b().e(1515);
            }
        }
    }

    public final void a(String[] stringArray, int[] nArray) {
        com.mg.sq.a.s().v();
        if (this.x) {
            int n = 0;
            while (n < this.y.length) {
                int n2 = 0;
                while (n2 < nArray.length) {
                    if (this.y[n] != null && this.y[n].a == nArray[n2]) {
                        this.z[n] = false;
                        ll ll2 = ((ll)this.y[n].e).d();
                        ((ll)this.y[n].e).d().p = ll2.q == 0 ? -1 : ll2.q;
                        ll2.c = stringArray[n2];
                        go.a(ll2);
                        this.a((ll)this.y[n].e);
                        break;
                    }
                    ++n2;
                }
                ++n;
            }
            if (this.v) {
                this.w();
                return;
            }
        } else {
            if (this.w == null) {
                return;
            }
            if (this.w.e instanceof ll) {
                ll ll3 = ((ll)this.w.e).d();
                ((ll)this.w.e).d().p = ll3.q == 0 ? -1 : ll3.q;
                ll3.c = stringArray[0];
                go.a(ll3);
                int n = 0;
                while (n < nArray.length) {
                    int n3 = 0;
                    while (n3 < this.y.length) {
                        if (this.y[n3] != null && this.y[n3].a == nArray[n]) {
                            this.z[n3] = false;
                            this.a((ll)this.y[n3].e);
                            break;
                        }
                        ++n3;
                    }
                    ++n;
                }
                this.a(ll3.d);
            }
            return;
        }
    }

    public final void a(int[] nArray, int[] nArray2) {
        if (this.w == null) {
            return;
        }
        if (this.w.e instanceof lm) {
            lm lm2 = ((lm)this.w.e).b();
            if (lm2.a == nArray[0]) {
                go.a(lm2, nArray2[0]);
                this.a(String.valueOf(nArray2[0]) + " " + lm2.b);
            }
        }
        com.mg.sq.a.s().v();
        if (this.v) {
            this.w();
        }
    }

    private void v() {
        al al2 = ag.b().a("Chú ý", "Giỏ hàng trống. Bạn chưa chọn món đồ nào", "Đóng", 8, 1);
        al2.a(this);
        al2.b(1345779);
        ag.b().a(al2, false);
    }

    private void a(String object) {
        object = ag.b().a("Chú ý", "Bạn vừa mua thành công! " + (String)object, "Đóng", 8, 1);
        ((am)object).a(this);
        ((am)object).b(1345779);
        ag.b().a((al)object, false);
    }

    private void a(lq[] object) {
        this.A = object;
        object = new gx(this.A);
        bd bd2 = new bd("Mua", 9);
        Object object2 = object;
        ((am)object).a(bd2, true);
        bd2 = new bd("Đóng", 10);
        object2 = object;
        ((am)object2).b(bd2, true);
        ((am)object).a(this);
        ((am)object).b(154896);
        ag.b().a((al)object, false);
    }

    public final void a(long l) {
        if (this.B != null) {
            this.B.a(l);
        }
    }

    private void w() {
        com.mg.sq.a.s().e(this.h());
        al al2 = com.mg.sq.a.s().d(241202);
        if (al2 != null) {
            com.mg.sq.a.s().b(al2, false);
            al2 = new hh(null, null);
            ag.b().a(al2);
        }
    }
}
