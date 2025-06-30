package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class ol
extends fb
implements bf,
r {
    private oa u;
    public aq p;
    private int v = -1;
    private int w;
    public int q;
    private az[] x;
    public String r;
    public boolean s = false;
    public boolean t = false;
    private int y;

    public ol(int n, int n2, String string, oa oa2) {
        super(100, 0, string, true);
        try {
            ct.b("main tab");
            this.u = oa2;
            this.a((bf)this);
            ol ol2 = this;
            if (oa.b == null || oa.c == null) {
                pa.a().a(go.w, oa2);
            } else {
                this.k(1);
            }
            this.d(com.mg.bas.v.t);
            this.e(com.mg.bas.v.u);
            this.a(new ba());
            this.m = new ax(3);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public final void c(boolean bl) {
        super.c(bl);
        if (this.p != null) {
            this.p.c(bl);
        }
    }

    public final void n() {
        if (this.v >= 0) {
            this.k(this.v);
            return;
        }
        if (this.p != null) {
            this.p.n();
        }
    }

    protected final void r() {
        if (this.p != null) {
            switch (this.p.b()) {
                case 1: {
                    ((om)this.p).a();
                    return;
                }
                case 3: {
                    ((os)this.p).a();
                    return;
                }
                case 2: {
                    oq oq2 = (oq)this.p;
                    oq2.n();
                }
            }
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (this.p != null) {
            this.p.a(graphics, n, n2);
        }
        this.c(true);
    }

    public final boolean f(int n) {
        if (this.p != null) {
            this.p.f(n);
        }
        return true;
    }

    public final boolean g(int n) {
        if (this.p != null) {
            this.p.g(n);
        }
        return true;
    }

    public final boolean c(int n, int n2) {
        if (this.p != null) {
            this.p.c(n, n2);
        }
        return true;
    }

    public final boolean f(int n, int n2) {
        if (this.p != null) {
            this.p.f(n, n2);
        }
        return true;
    }

    public final boolean e(int n, int n2) {
        return super.e(n, n2);
    }

    public final void d(int n, int n2) {
        if (n2 == 0) {
            ag.b().a(false);
        }
    }

    public final void j(int n) {
        this.v = n;
    }

    private void k(int n) {
        this.v = -1;
        this.a((bf)null);
        if (this.p != null) {
            if (this.p.b() != n) {
                this.q = this.p.b();
            }
            if (n == 1) {
                this.r = null;
            }
            switch (this.p.b()) {
                case 1: {
                    ((om)this.p).r();
                    oa.c = null;
                    oa.b = null;
                    ((om)this.p).w();
                    this.r = null;
                    break;
                }
                case 3: {
                    this.r = ((os)this.p).j;
                }
            }
        }
        this.w = n;
        this.p = null;
        System.gc();
        com.mg.bas.ct.b("[processChangeView]");
        com.mg.bas.s.a().a(this);
    }

    public final void y() {
        this.p = null;
    }

    public final void v() {
        this.x = new az[this.k.length];
        int n = 0;
        while (n < this.x.length) {
            this.x[n] = this.k[n];
            ++n;
        }
    }

    public final void w() {
        this.k = this.x;
    }

    public final void z() {
        int n = 0;
        while (n < this.k.length) {
            this.k[n] = null;
            ++n;
        }
    }

    public final void a() {
        block14: {
            try {
                int n = this.p == null ? -1 : this.p.b();
                mb.a();
                switch (this.w) {
                    case 1: {
                        this.t = false;
                        this.p = new om(1, this, this.u);
                        break;
                    }
                    case 2: {
                        this.p = new oq(2, this, this.u);
                        break;
                    }
                    case 3: {
                        this.p = new os(3, this.u, this);
                        if (this.r == null) break;
                        this.a(this.r, null, 0L, this.y);
                    }
                }
                this.a((bf)this.p);
                if (this.w != 1 && this.w != 3) break block14;
                try {
                    Thread.sleep(100L);
                }
                catch (InterruptedException interruptedException) {
                    InterruptedException interruptedException2 = interruptedException;
                    interruptedException.printStackTrace();
                }
                this.s = this.u.w();
                if (go.t) {
                    if (go.s == 0L) {
                        com.mg.sq.a.g("Bạn chưa có KEN. Bạn có muốn nạp không?");
                        go.t = false;
                    } else if (go.s <= 2000L) {
                        com.mg.sq.a.g("Bạn sắp hết KEN. Bạn có muốn nạp không?");
                        go.t = false;
                    }
                }
                this.u.f();
                if (n == 2) {
                    ks.a().d();
                    return;
                }
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
    }

    public final void a(String string, String string2, long l, int n) {
        this.t = true;
        this.y = n;
        if (this.p instanceof os) {
            ((os)this.p).a(string, string2, l, n);
        }
    }

    public final void a(lh object, lh lh2, boolean bl, byte[] object2, byte[] byArray, byte[] byArray2, byte by, byte by2) {
        ha ha2 = null;
        if (this.p instanceof om) {
            ha2 = ((om)this.p).q;
            ((om)this.p).r();
        } else if (this.p instanceof oq) {
            ((oq)this.p).a((lh)object, lh2, (byte[])object2, byArray, byArray2, by, by2);
        }
        if (ha2 == null) {
            ag.b().l();
            mg mgFrom;
            mg mgTo;
            if (this.p instanceof om) {
                mgFrom = ((om)this.p).l.e.u();
                mgFrom.a(lc.a((lh)object));
                mgFrom.a(nr.a((lh)object));
                ((om)this.p).e(false);
            } else {
                mgFrom = mb.a((lh)object, false);
                mgFrom.a(lc.a((lh)object));
                mgFrom.a(nr.a((lh)object));
            }
            mgTo = mb.a(lh2, false);
            mgTo.a(lc.a(lh2));
            mgTo.a(nr.a(lh2));
            ha2 = new ha((at)mgFrom, (at)mgTo, true, bl, 99030, (bf)this.u);
            ha2.a(this);
            ha2.a(lh2);
            ag.b().a(ha2, false);
        }
        com.mg.sq.a.s().v();
        ha2.t();
        com.mg.sq.a.s().b().b();
    }

    public final void A() {
        oq.v();
        if (this.p != null) {
            switch (this.p.b()) {
                case 1: {
                    ((om)this.p).w();
                    break;
                }
                case 2: {
                    ((oq)this.p).u();
                }
            }
        }
        this.a((bf)null);
        this.p = null;
        this.u = null;
        ct.b("Finish MainTab.destroy()");
    }

    public final void a(int[] nArray, String[] stringArray) {
        boolean bl = true;
        ol ol2 = this;
        if (ol2.p != null && ol2.p.b() == 1) {
            ((om)this.p).a(nArray, stringArray);
        }
    }

    public final void x() {
    }

    public final void t() {
        super.t();
        if (this.p != null && this.p.b() == 2) {
            this.a((ba)null);
        }
    }
}
