package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// UI/game component extending aq, manages state, rendering, and user interaction for a specific screen or feature.
import javax.microedition.lcdui.Graphics;

public final class ay
extends aq {
    private int i = 0;
    private int j = 0;
    private j k;
    private aq l;
    private bt m;
    private bt n;
    private k o;
    private k p;
    private boolean q = true;
    private boolean r = false;
    private int s = 50;
    private cu t = new cu(-1987, -1987);
    private boolean u = false;
    private long v = -1L;

    public ay() {
        this(0);
    }

    public ay(int n) {
        this.i = n;
        ag.b();
        this.m = ah.h(2);
        ag.b();
        this.n = ah.h(1);
        this.o = new k();
        this.p = new k();
        int n2 = 100;
        int n3 = 100;
        ay ay2 = this;
        super.b(n3, n2);
        this.d(true);
    }

    public final void e(boolean bl) {
        this.q = false;
    }

    public final void h(int n) {
        this.j = n;
    }

    public final void b(aq aq2) {
        if (this.l != null) {
            this.l.b = null;
        }
        if (aq2 != null && aq2 instanceof bu) {
            this.l = aq2;
            this.l.a(this);
            this.r = true;
            this.x();
        }
    }

    private void x() {
        Object object = (bu)((Object)this.l);
        Object object2 = object = object.v();
        Object object3 = this;
        g g2 = ((aq)object3).g();
        j j2 = ((ay)object3).a();
        int n2 = g2.a - ((ay)object3).k.b - j2.d;
        int n3 = g2.b - ((ay)object3).k.a - j2.c;
        if (((ay)object3).i != 2 && ((ay)object3).i == 0) {
            int cfr_ignored_0 = ((g)object2).a;
            int cfr_ignored_1 = ((g)object2).b;
        }
        object3 = new g(n2, n3);
        object2 = this.a();
        if (this.r || this.l.e() != ((g)object3).a || this.l.f() != ((g)object3).b) {
            this.l.a(((j)object2).b + this.c(), this.d() + ((j)object2).a, ((g)object3).a, ((g)object3).b);
            this.r = false;
        }
        this.n.b(this.n.q(), ((g)object3).a, 0, ((g)object).a);
        this.n.a(this.c() + ((j)object2).b, this.d() + ((g)object3).b, this.e() - ((j)object2).b - ((j)object2).d, this.n.f());
        this.m.b(this.m.q(), ((g)object3).b, 0, ((g)object).b);
        this.m.a(this.c() + ((j)object2).b + ((g)object3).a, this.d() + ((j)object2).a, this.m.e(), this.f() - ((j)object2).a - ((j)object2).c);
        this.o.a(this.n.q(), this.m.q(), this.n.r(), this.m.r());
        this.p.a(this.n.q(), this.m.q(), this.n.r(), this.m.r());
    }

    public final j a() {
        if (this.k == null) {
            this.k = new j(0, 0, 0, 0);
        }
        return this.k;
    }

    public final void b(int n2, int n3) {
        super.b(n2, n3);
    }

    public final void a(j j2) {
        this.k = j2;
        this.x();
    }

    public final k q() {
        return this.o;
    }

    public final k r() {
        return this.p;
    }

    private void y() {
        this.p.a = this.n.q();
        this.p.b = this.m.q();
    }

    public final void d(int n2, int n3) {
        int n4;
        int n5 = n4 = ((bu)((Object)this.l)).w();
        n4 = n3;
        n3 = n2;
        ay ay2 = this;
        if (n4 < 0) {
            n5 = -n5;
        }
        if (n3 == 1) {
            ay2.i(n5);
            return;
        }
        ay2.j(n5);
    }

    public final void i(int n2) {
        if (this.j == 0) {
            if (this.o.a < 0 || this.o.a + this.n.r() > this.n.a()) {
                this.o.a += n2 / 3;
                Math.abs(n2);
                return;
            }
            n2 += this.n.q();
            if (this.n.r() < this.n.a()) {
                if (n2 < 0 && this.o.a <= 0) {
                    this.o.a = n2;
                } else if (n2 + this.o.c > this.n.a() && this.o.a >= this.n.q()) {
                    this.o.a = n2;
                }
                this.n.h(n2);
            } else {
                this.n.h(n2);
                this.o.a = this.n.q();
            }
        } else {
            this.n.h(this.n.q() + n2);
        }
        this.y();
    }

    public final void j(int n2) {
        if (this.j == 0) {
            if (this.o.b < 0 || this.o.b + this.m.r() > this.m.a()) {
                if (Math.abs(n2) > 3) {
                    n2 /= 3;
                }
                if (Math.abs(n2) > 30) {
                    n2 = n2 < 0 ? -30 : 30;
                }
                this.o.b += n2;
                return;
            }
            n2 += this.m.q();
            if (this.m.r() < this.m.a()) {
                if (n2 < 0 && this.o.b <= 0) {
                    this.o.b = n2;
                } else if (n2 + this.o.d > this.m.a() && this.o.b >= this.m.q()) {
                    this.o.b = n2;
                }
                this.m.h(n2);
            } else {
                this.m.h(n2);
                this.o.b = this.m.q();
            }
        } else {
            this.m.h(this.m.q() + n2);
        }
        this.y();
    }

    public final boolean s() {
        return this.m.q() + this.m.r() >= this.m.a();
    }

    public final boolean t() {
        return this.m.q() <= 0;
    }

    public final boolean u() {
        return this.n.q() <= 0;
    }

    public final boolean v() {
        return this.n.q() + this.n.r() >= this.n.a();
    }

    public final void k(int n2) {
        this.m.h(n2);
        this.o.b = this.m.q();
        this.y();
    }

    public final void f(boolean bl) {
        this.m.h(0);
        this.y();
    }

    public final void g(boolean bl) {
        this.m.h(this.m.a());
        this.y();
        if (!bl) {
            this.o.b = this.m.q();
        }
    }

    public final void h(boolean bl) {
        this.n.h(0);
        this.y();
    }

    public final void i(boolean bl) {
        this.n.h(this.n.a() - this.n.r());
        this.y();
    }

    public final aq w() {
        return this.l;
    }

    public final void n() {
        if (this.l == null) {
            return;
        }
        if (this.v > 0L && System.currentTimeMillis() - this.v > 100L) {
            this.v = -1L;
            if (this.m.q() != this.o.b) {
                this.k(this.o.b);
                this.u = true;
            }
            if (this.n.q() != this.o.a) {
                int n2 = this.o.a;
                ay ay2 = this;
                ay2.n.h(n2);
                ay2.o.a = ay2.n.q();
                ay2.y();
                this.u = true;
            }
            if (this.t.a >= 0 && this.t.b >= 0) {
                this.l.c(this.t.a + this.o.a, this.t.b + this.o.b);
            }
        }
        int n3 = 0;
        if (this.u && (this.o.b < 0 || this.o.b + this.m.r() > this.m.a())) {
            n3 = 1;
        } else {
            if (this.n.q() != this.o.a) {
                n3 = this.n.q() - this.o.a;
                if (Math.abs(n3) > 3) {
                    n3 /= 3;
                }
                if (v.z && Math.abs(n3) > this.s) {
                    n3 = n3 < 0 ? -this.s : this.s;
                }
                this.o.a += n3;
                n3 = 1;
            }
            if (this.m.q() != this.o.b) {
                n3 = this.m.q() - this.o.b;
                if (Math.abs(n3) > 3) {
                    n3 /= 3;
                }
                if (v.z && Math.abs(n3) > this.s) {
                    n3 = n3 < 0 ? -this.s : this.s;
                }
                this.o.b += n3;
                n3 = 1;
            }
        }
        if (n3 != 0) {
            this.c(true);
        }
        this.l.n();
    }

    public final void c(boolean bl) {
        super.c(bl);
        if (this.l != null) {
            this.l.c(bl);
        }
    }

    public final boolean k() {
        if (this.l != null) {
            return this.l.k();
        }
        return super.k();
    }

    public final boolean m() {
        if (this.l != null) {
            return this.l.m();
        }
        return super.m();
    }

    public final void d(boolean bl) {
        super.d(bl);
        if (this.l != null) {
            this.l.d(bl);
        }
    }

    public final void a(Graphics graphics, int n2, int n3) {
        if (this.l != null) {
            this.l.a(graphics, n2, n3);
            if (this.q && this.i != 2) {
                if (this.m.r() < this.m.a()) {
                    this.m.a(graphics, n2, n3);
                }
                if (this.n.r() < this.n.a()) {
                    this.n.a(graphics, n2, n3);
                }
            }
            this.c(false);
        }
    }

    public final boolean f(int n2) {
        if (this.l != null) {
            boolean bl = this.l.f(n2);
            if (!bl) {
                switch (n2) {
                    case 99: {
                        if (this.t()) {
                            return false;
                        }
                        this.d(2, -1);
                        return true;
                    }
                    case 98: {
                        if (this.s()) {
                            return false;
                        }
                        this.d(2, 1);
                        return true;
                    }
                    case 97: {
                        if (this.u()) {
                            return false;
                        }
                        this.d(1, -1);
                        return true;
                    }
                    case 96: {
                        if (this.v()) {
                            return false;
                        }
                        this.d(1, 1);
                        return true;
                    }
                }
            }
            return bl;
        }
        return false;
    }

    public final boolean g(int n2) {
        if (this.l != null) {
            return this.l.g(n2);
        }
        return false;
    }

    public final boolean c(int n2, int n3) {
        if (this.l.h().a(n2, n3)) {
            if (!this.m()) {
                this.d(true);
            }
            this.u = false;
            this.v = System.currentTimeMillis();
            this.t.a = n2;
            this.t.b = n3;
            return true;
        }
        if (this.n.h().a(n2, n3)) {
            return this.n.c(n2, n3);
        }
        if (this.m.h().a(n2, n3)) {
            return this.m.c(n2, n3);
        }
        return false;
    }

    public final boolean f(int n2, int n3) {
        if (this.u) {
            this.u = false;
            if (this.t.a >= 0 && this.t.b >= 0) {
                n2 = (n2 - this.t.a) / 15 * 180;
                n3 = (n3 - this.t.b) / 15 * 180;
                if (n2 != 0) {
                    this.i(-n2);
                }
                if (n3 != 0) {
                    this.j(-n3);
                }
            }
            this.t.b = -1;
            this.t.a = -1;
            return true;
        }
        if (this.v >= 0L && !this.u && this.t.a >= 0 && this.t.b >= 0 && this.l != null && this.l.c(this.t.a + this.o.a, this.t.b + this.o.b)) {
            this.t.a = -1;
            this.t.b = -1;
            this.v = -1L;
            this.u = false;
            return true;
        }
        this.t.a = -1;
        this.t.b = -1;
        this.v = -1L;
        this.u = false;
        this.u = false;
        if (this.n.h().a(n2, n3)) {
            return this.n.f(n2, n3);
        }
        if (this.m.h().a(n2, n3)) {
            return this.m.f(n2, n3);
        }
        return false;
    }

    public final boolean e(int n2, int n3) {
        this.v = -1L;
        if (this.t.a >= 0 && this.t.b >= 0) {
            if (this.u) {
                this.t.a += n2;
                this.t.b += n3;
            }
            this.u = true;
            if (n2 != 0) {
                this.i(-n2);
            }
            if (n3 != 0) {
                this.j(-n3);
            }
            return true;
        }
        return false;
    }

    public final void o() {
        this.x();
    }

    public final void p() {
        this.x();
    }
}
