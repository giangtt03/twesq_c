package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class hn
extends ht
implements bn,
bq {
    private ay k;
    private aw p;
    private dk[] q;
    private ox r = new ox(null);
    private boolean s = false;
    private ft t;
    private az u;
    private az v;
    private az w;
    private lq x;
    private d y;
    private boolean z;
    private int A;

    public hn(lf[] object) {
        this.b(241233);
        this.a(0, 0, com.mg.bas.v.t, com.mg.bas.v.u);
        this.k = new ay(0);
        this.k.a(this.a(), this.c(), this.i(), this.j() - ba.a);
        this.p = new aw();
        this.p.a((bn)this);
        this.p.a((bq)this);
        this.p.e(true);
        this.k.b(this.p);
        if (this.y == null) {
            this.y = new iff(new int[]{0xFF0000, 0xFFFF00});
        }
        this.q = new dk[((lf[])object).length];
        int n = 0;
        while (n < this.q.length) {
            this.q[n] = new dk(object[n]);
            ++n;
        }
        this.t();
        this.a(com.mg.sq.a.n);
        this.a(this);
        this.t = new ft(go.s / 2L);
        this.t.a(go.s);
        az az2 = this.u = new gb(1, 0);
        this.a(this.u, true);
        this.v = new gb(2, 2);
        this.w = new gb(3, 3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void t() {
        if (this.q == null) {
            return;
        }
        int n = 0;
        int n2 = 0;
        while (n2 < this.q.length) {
            ++n;
            if (this.q[n2].a && !this.q[n2].e()) {
                n += this.q[n2].b.length;
                if (this.q[n2].b.length < this.q[n2].d()) {
                    ++n;
                }
            }
            ++n2;
        }
        Object[] objectArray = new Object[n];
        n = 0;
        int n3 = 0;
        while (n3 < this.q.length) {
            objectArray[n++] = this.q[n3];
            if (this.q[n3].a && !this.q[n3].e()) {
                int n4 = 0;
                while (n4 < this.q[n3].b.length) {
                    objectArray[n++] = this.q[n3].b[n4];
                    ++n4;
                }
                if (this.q[n3].b.length < this.q[n3].d()) {
                    objectArray[n++] = new dp("Xem thêm", this.q[n3]);
                }
            }
            ++n3;
        }
        n3 = this.p.s();
        ct.b("[reloadShop()]=================");
        aw aw2 = this.p;
        synchronized (aw2) {
            this.p.q();
            this.p.a(objectArray);
            this.p.k(n3);
            this.e(true);
            return;
        }
    }

    public final void e(boolean bl) {
        super.e(bl);
        this.k.c(bl);
    }

    public final void a(int n, int n2, lq[] lqArray) {
        dk dk2;
        int n3 = -1;
        int n4 = 0;
        while (n4 < this.q.length) {
            if (this.q[n4].b() != n) {
                this.q[n4].a = false;
                this.q[n4].c = 0;
            } else {
                n3 = n4;
            }
            ++n4;
        }
        if (n3 >= 0 && (dk2 = this.q[n3]).b() == n) {
            dk2.c += lqArray.length;
            dk dk3 = dk2;
            dk2.b = null;
            this.p.k(n3);
            this.r.a();
            if (!dk2.a) {
                dk2.a = true;
            }
            dk2.a(lqArray);
            dk2.a(n2);
            this.t();
        }
        com.mg.sq.a.s().v();
    }

    private void a(dk dk2) {
        if (!this.z) {
            if (this.A <= dk2.d()) {
                this.A = this.A + dk2.b.length <= dk2.d() ? (this.A += dk2.b.length) : (this.A += dk2.d() - this.A);
            }
        } else {
            this.A = 0;
        }
        ks.a().b(dk2.b(), 10, this.A);
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
        this.k.n();
        if (this.t != null) {
            this.t.i();
            this.t.b(true);
        }
    }

    public final void a(Graphics graphics) {
        if (this.m != null) {
            this.k.c(true);
        }
        if (this.k.k()) {
            graphics.setColor(com.mg.bas.v.am);
            graphics.fillRect(0, 0, this.i(), this.j());
            graphics.drawImage(pc.d, this.a() + this.i(), this.c() + this.j() - ba.a, 40);
        }
        this.k.a(graphics, this.a(), this.c());
        this.k.c(true);
        graphics.setColor(com.mg.bas.v.am);
        if (this.t != null) {
            this.t.a(graphics, 0, 0);
        }
    }

    public final void b(Graphics graphics) {
    }

    public final void b(aq aqObj, int n) {
        Object obj = this.p.i(n);
        if (obj instanceof dk) {
            dk dkObj = (dk)obj;
            if (dkObj.a) {
                dkObj.a = false;
                this.t();
                return;
            }
            this.z = true;
            this.a(dkObj);
            dkObj.c = 0;
            return;
        }
        if (obj instanceof dp) {
            dp dpObj = (dp)obj;
            this.z = false;
            this.a((dk)dpObj.b);
            return;
        }
        if (obj instanceof lq) {
            lq lqObj = (lq)obj;
            this.x = lqObj;
            String[] labels;
            int[] codes;
            if (!go.e.equals(lqObj.f)) {
                labels = new String[]{"Mua", "C.Tiết"};
                codes = new int[]{11111, 11112};
            } else {
                labels = new String[]{"C.Tiết"};
                codes = new int[]{11112};
            }
            br[] brArray = new br[labels.length];
            for (int i = 0; i < labels.length; i++) {
                brArray[i] = new br(labels[i], codes[i]);
            }
            bs bs2 = new bs();
            bs2.a(brArray);
            int idx = this.p.s();
            Object o2 = this.p.o(idx);
            k kObj = this.k.r();
            int n3 = (com.mg.bas.v.t - bs2.e()) / 2;
            int n4 = this.k.d() + ((aq)o2).d() - kObj.b;
            if (n4 + bs2.f() > com.mg.bas.v.u - ba.a) {
                n4 = com.mg.bas.v.u - ba.a - bs2.f();
            }
            bs2.a_(com.mg.bas.v.t + bs2.e(), n4);
            bs2.d(n3, n4);
            bs2.a_(1);
            bs2.a((bf)this);
            this.a(bs2, this.v, com.mg.sq.a.n, this.w);
            this.n = true;
        }
    }

    public final void a(aq aq2, int n) {
    }

    public final void a(aq aq2, int n, int n2) {
    }

    public final aq a(aw awObj, int n) {
        Object obj = awObj.i(n);
        if (obj == null) {
            return null;
        }
        if (obj instanceof dk) {
            return new fi((dk)obj);
        }
        if (obj instanceof dp) {
            return new gl(37);
        }
        Image image = null;
        if (obj instanceof lq) {
            lq lqObj = (lq)obj;
            if (lqObj.e instanceof lm) {
                lm lm2 = (lm)lqObj.e;
                return new fj(lm2.b, lm2.a, lm2.j, lm2.g, lm2.h, -1, false, null, lqObj.f, 0L);
            }
            if (lqObj.e instanceof ll) {
                ll ll2 = (ll)lqObj.e;
                try {
                    image = this.r.a(mb.a(ll2.n), true);
                } catch (Throwable throwable) {}
                return new fj(ll2.d, ll2.b, ll2.l, ll2.m, false, image, ll2.f, ll2.j, this.y, lqObj.f, 0L);
            }
        }
        return null;
    }

    public final boolean g(int n) {
        switch (n) {
            case 11111: {
                hn hn2 = this;
                boolean cfr_ignored_0 = hn2.x.e instanceof lu;
                al al2 = ag.b().a("Chú ý", "Bạn muốn mua món đồ này không?", "Có", 13, "Không", 12, 1);
                al2.a(hn2);
                ag.b().a(al2, false);
                return true;
            }
            case 11112: {
                hn hn3 = this;
                if (hn3.x != null) {
                    if (hn3.x.e instanceof ll) {
                        ll ll2 = (ll)hn3.x.e;
                        com.mg.sq.a.a(ll2, hn3, "", -123233, "Đóng", 5);
                    } else if (hn3.x.e instanceof lm) {
                        com.mg.sq.a.a((lm)hn3.x.e, null);
                    } else if (hn3.x.e instanceof lu) {
                        Object object = (lu)hn3.x.e;
                        object = ag.b().a(((lu)object).a, ((lu)object).b, "Đóng", 11119, 1);
                        ((am)object).b(1515);
                        ag.b().a((al)object);
                        ((am)object).a(hn3);
                    }
                }
                return true;
            }
            case 11116: {
                hn hn4 = this;
                com.mg.sq.a.s().e(hn4.h());
                al al3 = com.mg.sq.a.s().d(241202);
                if (al3 != null) {
                    com.mg.sq.a.s().b(al3, false);
                    al3 = new hh(null, null);
                    ag.b().a(al3);
                }
                return true;
            }
            case 11114: {
                ag.b().a(199199, false);
                return true;
            }
            case 11115: {
                ks.a().i();
                com.mg.sq.a.s().a((String)null, (il)null);
                return true;
            }
            case 11113: {
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
                hn hn2 = this;
                br[] brArray = new br[]{new br("Đang bán", 11115), new br("Rao bán", 11113), new br("Đóng", 11116)};
                hn2.a(brArray, hn2.v, com.mg.sq.a.n, hn2.w);
                return;
            }
            case 5: {
                com.mg.sq.a.s().a(241212, false);
                return;
            }
            case 8: {
                com.mg.sq.a.s().a(1345779, false);
                return;
            }
            case 13: {
                ag.b().a(false);
                if (go.s > -1L && (long)this.x.d > go.s) {
                    hn hn3 = this;
                    al al2 = ag.b().a("Chú ý", "Vượt quá số tiền bạn đang có. Vui lòng thử lại!!!", "Đóng", 11114, 1);
                    al2.b(199199);
                    al2.a(hn3);
                    ag.b().a(al2, false);
                    return;
                }
                hn hn4 = this;
                if (hn4.x != null) {
                    ks.a().i(hn4.x.b);
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

    public final void a(String title, ll[] llArray, lm[] lmArray) {
        com.mg.sq.a.s().v();
        if (this.x == null) {
            return;
        }
        dk dk2 = null;
        for (int n = 0; n < this.p.a(); n++) {
            Object obj = this.p.i(n);
            if (obj instanceof dk) {
                dk2 = (dk)obj;
            } else if (obj instanceof lq) {
                lq lqObj = (lq)obj;
                if (lqObj.b.equals(title)) {
                    this.p.j(n);
                    dk2.a(title);
                    break;
                }
            }
        }
        if (llArray != null && llArray.length > 0) {
            go.a(llArray[0]);
            this.a(llArray[0].d);
        }
        if (lmArray != null && lmArray.length > 0) {
            go.a(lmArray[0], lmArray[0].g);
            this.a(String.valueOf(lmArray[0].g) + " " + lmArray[0].b);
        }
    }

    private void a(String msg) {
        al dialog = ag.b().a("Chú ý", "Bạn vừa mua thành công! " + msg, "Đóng", 8, 1);
        ((am)dialog).a(this);
        ((am)dialog).b(1345779);
        ag.b().a(dialog, false);
    }
}
