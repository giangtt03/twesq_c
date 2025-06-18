package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// UI/game menu or list component, manages items, selection, and rendering. Extends aq.
import javax.microedition.lcdui.Graphics;

public final class bs
extends aq {
    private static int i = 1;
    private static int j = 20;
    private int k;
    private boolean l = true;
    private br[] m;
    private bs n;
    private int o;
    private int p;
    private bf q;
    private bg r;
    private az[] s = new az[3];

    public bs() {
    }

    public bs(br[] brArray) {
        if (brArray != null) {
            this.a(brArray);
        }
    }

    public final void a(az az2) {
        boolean bl = true;
        az az3 = az2;
        bs bs2 = this;
        bs2.s[0] = az3;
        if (az3 != null) {
            bs2.s[0].a(6, v.u - ba.a + 3, 20);
        }
    }

    public final void b(az az2) {
        boolean bl = true;
        az az3 = az2;
        bs bs2 = this;
        bs2.s[2] = az3;
        if (az3 != null) {
            bs2.s[2].a(v.t - 6, v.u - ba.a + 3, 24);
        }
    }

    public final void c(az az2) {
        boolean bl = true;
        az az3 = az2;
        bs bs2 = this;
        bs2.s[1] = az3;
        if (az3 != null) {
            bs2.s[1].a(v.t / 2, v.u - ba.a + 3, 17);
        }
    }

    public final az[] a() {
        return this.s;
    }

    public final int q() {
        if (this.n != null) {
            return -(this.k << 16 | this.n.q());
        }
        return this.k;
    }

    private int u() {
        while (bs2.n != null) {
            bs bs2 = bs2.n;
        }
        return bs2.m[bs2.k].c();
    }

    public final void a(bf bf2) {
        this.q = bf2;
    }

    public final void a(bg bg2) {
        this.r = bg2;
    }

    public final void a(br[] brArray) {
        int n = 0;
        while (n < brArray.length) {
            this.a(brArray[n]);
            ++n;
        }
    }

    public final void a(br br2) {
        if (this.m != null) {
            br[] brArray = new br[this.m.length + 1];
            System.arraycopy(this.m, 0, brArray, 0, this.m.length);
            brArray[this.m.length] = br2;
            this.e(this.f() + j);
            this.m = brArray;
        } else {
            this.m = new br[1];
            this.m[0] = br2;
            this.e(this.m.length * j + 18 + (i << 1));
        }
        int n = 0;
        int n2 = 0;
        while (n2 < this.m.length) {
            if (this.m[n2].p() > n) {
                n = this.m[n2].p();
            }
            ++n2;
        }
        if (n < 50) {
            n = 50;
        }
        this.d(n + (i << 1) + 16 + 18);
        this.k = 0;
    }

    public final void a_(int n, int n2) {
        super.a_(n, n2);
        this.d(n, n2);
    }

    public final void d(int n, int n2) {
        this.o = n;
        this.p = n2;
    }

    public final void n() {
        while (true) {
            int n = 0;
            if (bs2.o != bs2.c()) {
                n = bs2.o - bs2.c();
                if (Math.abs(n) > 4) {
                    n /= 2;
                }
                bs2.b_(bs2.c() + n);
                n = 1;
            }
            if (bs2.p != bs2.d()) {
                n = bs2.p - bs2.d();
                if (Math.abs(n) > 4) {
                    n /= 2;
                }
                bs2.c(bs2.d() + n);
                n = 1;
            }
            if (n != 0) {
                bs2.c(true);
            }
            if (bs2.n == null) break;
            bs bs2 = bs2.n;
        }
    }

    public final void c(boolean bl) {
        super.c(bl);
        if (this.l() != null && bl) {
            this.l().c(true);
        }
    }

    public final boolean k() {
        if (this.b == null) {
            this.c = true;
        }
        if (this.b != null) {
            return this.b.k() || super.k();
        }
        return super.k();
    }

    public final void a(Graphics graphics, int n, int n2) {
        while (true) {
            int n3 = bs2.c() + n;
            int n4 = bs2.d() + n2;
            ag.c().b(graphics, n3, n4, bs2.e(), bs2.f());
            n3 += 4 + i;
            n4 += 10 + i;
            int n5 = bs2.e() - 8 - (i << 1);
            int n6 = 0;
            while (n6 < bs2.m.length) {
                boolean bl = n6 == bs2.k;
                if (bl) {
                    ag.c().c(graphics, n3, n4, n5, j);
                }
                bs2.m[n6].a(graphics, n3 + 14, n4 + 3, bl);
                if (bs2.m[n6].e()) {
                    if (bl) {
                        bx.c.a(graphics, ">", n3 + n5 - 3, n4 + 3, 2);
                    } else {
                        bx.d.a(graphics, ">", n3 + n5 - 4, n4 + 2, 2);
                    }
                }
                n4 += j;
                ++n6;
            }
            if (bs2.n == null) break;
            bs bs2 = bs2.n;
        }
    }

    private void v() {
        this.n = new bs(this.m[this.k].d());
        int n = this.c() + 8 + i;
        int n2 = this.d() + 10 + i + this.k * j + 5;
        if (n2 + this.n.f() > this.d() + this.f()) {
            n2 = this.d() + this.f() - this.n.f();
        }
        this.n.a_(v.t, n2);
        this.n.d(n, n2);
        Object object = this.q;
        bs bs2 = this.n;
        this.n.q = object;
        object = this.r;
        bs2 = this.n;
        this.n.r = object;
        this.n.a(this);
    }

    public final boolean f(int n) {
        if (this.b != null) {
            this.b.c(true);
        }
        if (this.m == null) {
            return false;
        }
        if (this.o != this.c() || this.p != this.d()) {
            this.b_(this.o);
            this.c(this.p);
        }
        if (this.n != null) {
            if (!this.n.f(n)) {
                this.n = null;
                this.c(true);
                return false;
            }
            return true;
        }
        int n2 = this.k;
        switch (n) {
            case 99: {
                if (n2 > 0) {
                    --n2;
                    break;
                }
                if (!this.l) break;
                n2 = this.m.length - 1;
                break;
            }
            case 98: {
                if (n2 < this.m.length - 1) {
                    ++n2;
                    break;
                }
                if (!this.l) break;
                n2 = 0;
                break;
            }
            case 97: {
                bs bs2 = this;
                if (bs2.b instanceof bs) {
                    ((bs)bs2.b).n = null;
                    return true;
                }
                return false;
            }
            case 96: {
                if (this.m[this.k].e()) {
                    this.v();
                    return true;
                }
                return false;
            }
            case 95: {
                if (this.m[this.k].e()) {
                    this.v();
                } else {
                    if (this.q != null) {
                        v.c();
                        this.q.d(0, this.u());
                    }
                    if (this.r != null) {
                        v.c();
                        this.r.a(0, this.u(), this.r());
                    }
                }
                return true;
            }
        }
        if (n2 != this.k) {
            this.k = n2;
            this.c(true);
            return true;
        }
        return false;
    }

    public final boolean c(int n, int n2) {
        if (this.b != null) {
            this.b.c(true);
        }
        if (this.o != this.c() || this.p != this.d()) {
            this.b_(this.o);
            this.c(this.p);
        }
        if (this.n != null) {
            boolean bl = this.n.c(n, n2);
            if (!bl) {
                this.n = null;
                this.c(true);
                return false;
            }
            return true;
        }
        int n3 = this.c() + 4 + i;
        int n4 = this.d() + 10 + i;
        int n5 = this.e() - 8 - (i << 1);
        int n6 = 0;
        while (n6 < this.m.length) {
            if (n >= n3 && n <= n3 + n5 && n2 >= n4 && n2 <= n4 + j) {
                this.k = n6;
                this.c(true);
                return this.f(95);
            }
            n4 += j;
            ++n6;
        }
        if (this.d.a(n, n2)) {
            return true;
        }
        bs bs2 = this.g(n, n2);
        if (bs2 != null) {
            bs2.n = null;
            return true;
        }
        return false;
    }

    private bs g(int n, int n2) {
        while (bs2.b instanceof bs) {
            if (!bs2.b.h().a(n, n2)) {
                bs bs2 = (bs)bs2.b;
                continue;
            }
            return (bs)bs2.b;
        }
        return null;
    }

    public final br r() {
        return this.m[this.k];
    }

    public final br[] s() {
        return this.m;
    }

    public final void t() {
        v.c();
        this.n = null;
        this.k = 0;
    }
}
