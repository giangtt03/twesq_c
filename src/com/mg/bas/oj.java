package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class oj
extends fb
implements bf,
bg,
bn,
bq {
    private aw p;
    private ay q;
    private op r;

    public oj(int n, int n2, String string) {
        super(105, 2, string, false);
        this.a(0, 0, v.t, v.u);
        this.p = new aw();
        this.p.a((bn)this);
        this.p.a((bq)this);
        this.q = new ay(2);
        this.q.a(this.c(), this.d() + 22, this.e(), this.f() - 22 - ba.a);
        this.q.b(this.p);
        this.p.e(true);
        this.a(new ba());
        this.a(new gb(-1, 0));
        this.b(new gb(-2, 1));
        this.c(com.mg.sq.a.n);
        this.a((aq)this);
        this.a((bf)this);
        this.r = new op(this, 106, 3, "Đàm Đạo");
    }

    public final boolean a() {
        return this.p.a() > 0;
    }

    public final op v() {
        return this.r;
    }

    public final void x() {
        this.q.c(true);
    }

    public final void y() {
    }

    public final void c(boolean bl) {
        super.c(bl);
        if (bl) {
            this.q.c(true);
        }
    }

    public final int a(String string) {
        int n = 0;
        while (n < this.p.a()) {
            di di2 = (di)this.p.i(n);
            if (di2.b().a().equals(string)) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    private di b(String string) {
        di di2 = null;
        int n = this.a(string);
        if (n >= 0) {
            di2 = (di)this.p.i(n);
        }
        return di2;
    }

    public final void a(ds ds2) {
        int n = this.a(ds2.a());
        if (n >= 0) {
            di di2 = (di)this.p.i(n);
            di2.a(ds2);
            this.p.b(di2, n);
        }
    }

    public final void a(di diObj) {
        try {
            this.p.b(diObj);
            if (this.b != null) {
                fc fcObj = (fc)this.b;
                if (this.p.a() <= 0) {
                    fcObj.d(this);
                }
                fcObj.d(this.r);
                this.r.a();
                return;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public final di a(String key, String string, int n) {
        di diObj = this.b(key);
        if (diObj != null) {
            boolean bl = diObj.a(string, 0);
            if (this.r.p != null && diObj.b().a().equals(this.r.p.b().a())) {
                this.r.a(diObj.a(diObj.d() - 1), bl);
            }
        }
        return diObj;
    }

    public final di b(String key, String string, int n) {
        di diObj = this.b(key);
        if (diObj != null) {
            boolean bl = diObj.b(string, n);
            if (this.r.p != null && diObj.b().a().equals(this.r.p.b().a())) {
                this.r.a(diObj.a(diObj.d() - 1), bl);
            }
        }
        return diObj;
    }

    public final di a(ds dsObj, String string, int n, boolean bl) {
        di diObj = new di(dsObj, this.p.e() - 20, bl, com.mg.sq.a.m.K());
        this.p.a(diObj);
        diObj.b(string, n);
        if (this.p.a() < 2) {
            this.a(diObj, false);
        }
        return diObj;
    }

    public final void a(ds ds2, boolean bl, boolean bl2) {
        di di2 = this.b(ds2.a());
        if (di2 == null) {
            di2 = new di(ds2, this.p.e() - 20, bl, com.mg.sq.a.m.K());
            this.p.a(di2);
            du.a().b(ds2.a());
        }
        if (bl2) {
            this.a(di2, true);
        }
    }

    private void a(di diObj, boolean bl) {
        if (this.r.p == null || !diObj.b().a().equals(this.r.p.b().a())) {
            this.r.a(diObj);
        }
        if (this.b == null) {
            return;
        }
        fc fcObj = (fc)this.l();
        if (!fcObj.b(this.r)) {
            fcObj.c(this.r);
        }
        if (bl) {
            fcObj.a((fb)this.r);
        }
    }

    public final boolean f(int n) {
        if (n == 97 || n == 96) {
            return false;
        }
        return this.q.f(n);
    }

    public final boolean e(int n, int n2) {
        return this.q.e(n, n2);
    }

    public final boolean c(int n, int n2) {
        return this.q.c(n, n2);
    }

    public final boolean f(int n, int n2) {
        return this.q.f(n, n2);
    }

    public final void n() {
        this.q.n();
    }

    public final void a(Graphics graphics, int n, int n2) {
        boolean bl = this.q.k();
        n = bl ? 1 : 0;
        if (bl) {
            graphics.setColor(v.am);
            graphics.fillRect(this.c(), this.d(), this.e(), this.f());
            graphics.drawImage(pc.d, this.c() + this.e(), this.d() + this.f() - ba.a, 40);
            pc.a(graphics, 4, 20, v.t - 8);
            bx.d.c(true);
            bx.d.a(graphics, "Đàm Đạo", this.e() / 2, 2, 1);
            bx.d.c();
        }
        this.q.a(graphics, this.c(), this.d());
    }

    public final String[] w() {
        String[] stringArray = new String[this.p.a()];
        int n = 0;
        while (n < stringArray.length) {
            di di2 = (di)this.p.i(n);
            stringArray[n] = di2.b().a();
            ++n;
        }
        return stringArray;
    }

    public final ds[] z() {
        ds[] dsArray = new ds[this.p.a()];
        int n = 0;
        while (n < dsArray.length) {
            di di2 = (di)this.p.i(n);
            dsArray[n] = di2.b();
            ++n;
        }
        return dsArray;
    }

    public final aq a(aw awObj, int n) {
        Object item = awObj.i(n);
        if (item instanceof di) {
            di diObj = (di)item;
            return new eu(diObj.b(), this.q.e());
        }
        return null;
    }

    public final void b(aq aqObj, int n) {
        Object item = this.p.i(n);
        if (item instanceof di) {
            this.a((di)item, true);
        }
    }

    public final void a(aq aq2, int n) {
        if (this.p.s() == n) {
            this.p.k(n);
        }
    }

    public final void a(aq aq2, int n, int n2) {
    }

    public final void d(int n, int n2) {
        switch (n2) {
            case -1: {
                oj oj2 = this;
                bs bs2 = new bs();
                bs2.a(new gb(0, 2));
                bs2.b(new gb(1, 3));
                br[] brArray = new br[]{new br("Đóng", 10001), new br("Đóng Hết", 10000)};
                if (com.mg.sq.a.m != null) {
                    brArray = oi.b(brArray, 2);
                }
                bs2.a(brArray);
                int n3 = bs2.e() > bs2.f() ? bs2.e() : bs2.f();
                bs2.a_(-n3, v.u);
                bs2.d(0, v.u - ba.a - bs2.f());
                bs2.a((bf)oj2);
                oj2.a(bs2);
                return;
            }
            case 1: {
                this.t();
                return;
            }
            case 0: {
                this.l.f(95);
                return;
            }
        }
        ((fc)this.b).a();
    }

    public final void a(int n, int n2, Object object) {
        switch (n2) {
            case 10001: {
                if (this.p.a() > 0) {
                    di di2 = (di)this.p.t();
                    fc fc2 = null;
                    if (this.b != null) {
                        fc2 = (fc)this.b;
                    }
                    if (this.r.p != null && this.r.p.equals(di2)) {
                        if (fc2 != null) {
                            fc2.d(this.r);
                        }
                        this.r.a();
                    }
                    this.p.b(di2);
                    if (this.p.a() <= 0 && fc2 != null) {
                        fc2.d(this);
                    }
                }
                this.t();
                break;
            }
            case 10000: {
                this.p.q();
                if (this.b != null) {
                    fc fc3 = (fc)this.b;
                    fc3.d(this);
                    fc3.d(this.r);
                    this.r.a();
                }
                this.t();
                break;
            }
            default: {
                if (com.mg.sq.a.m == null || this.l == null) break;
                com.mg.sq.a.m.j(n2);
            }
        }
        this.t();
    }

    public final void A() {
        if (this.b == null) {
            return;
        }
        fc fc2 = (fc)this.l();
        oj oj2 = this;
        boolean bl = false;
        int n = 0;
        while (n < oj2.p.a()) {
            di di2 = (di)oj2.p.i(n);
            eu eu2 = (eu)oj2.p.o(n);
            if (di2.a) {
                bl = true;
            }
            eu2.k = di2.a;
            ++n;
        }
        if (bl) {
            fc2.e(this);
            this.c(true);
            return;
        }
        fc2.f(this);
    }
}
