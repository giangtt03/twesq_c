package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class hq
extends ht
implements bn,
bq {
    private ay k;
    private aw p;
    private dk[] q;
    private lf r;
    private ox s;
    private boolean t = false;
    private ft u;
    private az v;
    private az w;
    private az x;
    private lq y;
    private d z = new iff(new int[]{0xFF0000, 0xFFFF00});

    public hq(lq[] lqArray) {
        this.s = new ox(null);
        this.b(241235);
        this.a(0, 0, com.mg.bas.v.t, com.mg.bas.v.u);
        this.k = new ay(0);
        this.k.a(this.a(), this.c(), this.i(), this.j() - ba.a);
        this.p = new aw();
        this.p.a((bn)this);
        this.p.a((bq)this);
        this.p.e(true);
        this.k.b(this.p);
        this.r = new lf(999, "Đang bán", lqArray.length);
        this.q = new dk[1];
        int n = 0;
        while (n < this.q.length) {
            this.q[n] = new dk(this.r);
            ++n;
        }
        if (0 < this.q.length) {
            this.q[0].a(lqArray);
            this.q[0].a = true;
            this.q[0].c = lqArray.length;
            this.v();
        }
        this.z = new iff(new int[]{0xFF0000, 0xFFFF00});
        this.a(com.mg.sq.a.n);
        this.a(this);
        this.u = new ft(go.s / 2L);
        this.u.a(go.s);
        az az2 = this.v = new gb(1, 0);
        this.a(az2, true);
        this.w = new gb(2, 2);
        this.x = new gb(3, 3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void v() {
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
        Object[] objArr = new Object[n2];
        n2 = 0;
        int n4 = 0;
        while (n4 < this.q.length) {
            objArr[n2++] = this.q[n4];
            if (this.q[n4].a && !this.q[n4].e()) {
                n = 0;
                while (n < this.q[n4].b.length) {
                    objArr[n2++] = this.q[n4].b[n];
                    ++n;
                }
                if (this.q[n4].b.length < this.q[n4].d()) {
                    objArr[n2++] = new dp("Xem thêm", this.q[n4]);
                }
            }
            ++n4;
        }
        n4 = this.p.s();
        n = this.k.r().b;
        aw aw2 = this.p;
        synchronized (aw2) {
            this.p.q();
            this.p.a(objArr);
            this.p.k(n4);
            int scrollY = n;
            aq aq2 = this.p.o(this.p.s());
            if (aq2 != null) {
                aq aq3;
                if (this.p.s() < this.p.a() - 1 && (aq3 = this.p.o(this.p.s() + 1)).d() + aq3.f() - scrollY > this.p.f()) {
                    scrollY = aq3.d() + aq3.f() - this.p.f();
                }
                if (aq2.d() + aq2.f() - scrollY > this.p.f()) {
                    scrollY = aq2.d() + aq2.f() - this.p.f();
                }
                this.k.k(scrollY);
            }
            this.e(true);
            return;
        }
    }

    public final void e(boolean bl) {
        super.e(bl);
        this.k.c(bl);
    }

    public final void a(lq[] lqArray) {
        com.mg.sq.a.s().v();
        this.q[0] = new dk(new lf(999, "Đang bán", lqArray.length));
        this.q[0].a(lqArray);
        this.q[0].a = true;
        this.q[0].c = lqArray.length;
        this.v();
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
        if (this.u != null) {
            this.u.i();
            this.u.b(true);
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
        if (this.u != null) {
            this.u.a(graphics, 0, 0);
        }
    }

    public final void b(Graphics graphics) {
    }

    public final void b(aq cell, int n) {
        Object obj = this.p.i(n);
        if (obj instanceof dk) {
            dk dkObj = (dk)obj;
            if (dkObj.a) {
                dkObj.a = false;
                this.v();
                return;
            }
            hq.t();
            return;
        }
        if (obj instanceof dp) {
            dp dpObj = (dp)obj;
            dk dkObj = (dk)dpObj.b;
            int len = (dkObj.b == null ? 0 : dkObj.b.length);
            ks.a().b(dkObj.b(), 10, len);
            com.mg.sq.a.s().a((String)null, (il)null);
            return;
        }
        if (obj instanceof lq) {
            lq lqObj = (lq)obj;
            this.y = lqObj;
            bs bsObj = new bs();
            String[] options = new String[]{"Ngưng bán", "C.Tiết", "Gia hạn"};
            int[] codes = new int[]{11111, 11112, 11114};
            br[] brArray = new br[3];
            int i = 0;
            while (i < 3) {
                brArray[i] = new br(options[i], codes[i]);
                ++i;
            }
            bsObj.a(brArray);
            int selIdx = this.p.s();
            aq aqObj = this.p.o(selIdx);
            k kRect = this.k.r();
            int n3 = (com.mg.bas.v.t - bsObj.e()) / 2;
            int n4 = this.k.d() + aqObj.d() - kRect.b;
            if (n4 + bsObj.f() > com.mg.bas.v.u - ba.a) {
                n4 = com.mg.bas.v.u - ba.a - bsObj.f();
            }
            bsObj.a_(com.mg.bas.v.t + bsObj.e(), n4);
            bsObj.d(n3, n4);
            bsObj.a_(1);
            bsObj.a((bf)this);
            ((ht)this).a(bsObj, this.w, com.mg.sq.a.n, this.x);
            ((ht)this).n = true;
        }
    }

    public static void t() {
        ks.a().i();
        com.mg.sq.a.s().a((String)null, (il)null);
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
        ct.a("[getListCellRenderer]========================");
        Image image = null;
        if (obj instanceof lq) {
            lq lqObj = (lq)obj;
            if (lqObj.e instanceof lm) {
                lm lm2 = (lm)lqObj.e;
                return new fj(lm2.b, lm2.a, lm2.j, lm2.g, lm2.h, -1, false, null, null, lqObj.g);
            }
            if (lqObj.e instanceof ll) {
                ll ll2 = (ll)lqObj.e;
                try {
                    image = this.s.a(mb.a(ll2.n), true);
                }
                catch (Throwable throwable) {}
                return new fj(ll2.d, ll2.b, ll2.l, ll2.m, false, image, ll2.f, ll2.j, this.z, null, lqObj.g);
            }
        }
        return null;
    }

    private void a(String string) {
        dk dk2 = null;
        int n = 0;
        while (n < this.p.a()) {
            Object object = this.p.i(n);
            if (object instanceof dk) {
                dk2 = (dk)object;
            } else if (object instanceof lq) {
                object = (lq)object;
                if (((lq)object).b.equals(string)) {
                    this.p.j(n);
                    dk2.a(string);
                    return;
                }
            }
            ++n;
        }
    }

    public final void a(String string, ll[] llArray, lm[] lmArray) {
        this.a(string);
        if (llArray != null && llArray.length > 0) {
            go.a(llArray[0]);
        }
        if (lmArray != null && lmArray.length > 0) {
            go.a(lmArray[0], lmArray[0].g);
        }
    }

    public final boolean g(int n) {
        switch (n) {
            case 11111: {
                hq hq2 = this;
                ks.a().h(hq2.y.b);
                com.mg.sq.a.s().a((String)null, (il)null);
                return true;
            }
            case 11112: {
                hq hq3 = this;
                if (hq3.y != null) {
                    if (hq3.y.e instanceof ll) {
                        ll ll2 = (ll)hq3.y.e;
                        com.mg.sq.a.a(ll2, hq3, "", -123233, "Đóng", 5);
                    } else if (hq3.y.e instanceof lm) {
                        com.mg.sq.a.a((lm)hq3.y.e, null);
                    } else if (hq3.y.e instanceof lu) {
                        Object object = (lu)hq3.y.e;
                        object = ag.b().a(((lu)object).a, ((lu)object).b, "Đóng", 11119, 1);
                        ((am)object).b(1515);
                        ag.b().a((al)object);
                        ((am)object).a(hq3);
                    }
                }
                return true;
            }
            case 11114: {
                hq hq4 = this;
                hq4.a(hq4.y.b);
                ks.a().g(hq4.y.b);
                com.mg.sq.a.s().a((String)null, (il)null);
                return true;
            }
            case 11116: {
                hq hq5 = this;
                com.mg.sq.a.s().e(hq5.h());
                return true;
            }
            case 11115: {
                com.mg.sq.a.s().I();
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
                hq hq2 = this;
                br[] brArray = new br[]{new br("Chợ trời", 11115), new br("Đóng", 11116)};
                hq2.a(brArray, hq2.w, com.mg.sq.a.n, hq2.x);
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
                hq hq3 = this;
                if (hq3.y != null) {
                    ks.a().i(hq3.y.b);
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
}
