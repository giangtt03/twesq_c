package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public class fn
extends aq
implements bu {
    protected g j;
    protected a k = new a();
    protected int l;
    protected k m;
    bq n;

    public fn() {
        this.j = new g();
    }

    public final void a(bq bq2) {
        this.n = bq2;
    }

    public final int q() {
        return this.l;
    }

    public final int r() {
        return this.k.d();
    }

    public final aq[] s() {
        aq[] aqArray = new aq[this.k.d()];
        int n2 = 0;
        while (n2 < aqArray.length) {
            aqArray[n2] = (aq)this.k.b(n2);
            ++n2;
        }
        return aqArray;
    }

    public synchronized void b(aq aq2) {
        this.k.a(aq2);
        aq2.a(this);
        if (this.k.d() == 1) {
            this.i(0);
        } else {
            this.a();
        }
        if (this.b != null && this.b instanceof ay) {
            ((ay)this.b).o();
        }
    }

    public synchronized void a(aq aq2, int n2) {
        this.k.b(aq2, n2);
        aq2.a(this);
        if (n2 < this.l) {
            this.i(this.l + 1);
        }
        this.a();
        if (this.b != null && this.b instanceof ay) {
            ((ay)this.b).o();
        }
    }

    public synchronized void c(aq aq2) {
        int n2 = 0;
        while (n2 < this.k.d()) {
            if (this.k.b(n2).equals(aq2)) {
                this.h(n2);
                return;
            }
            ++n2;
        }
    }

    public synchronized void h(int n2) {
        if (n2 < 0 || n2 >= this.k.d()) {
            return;
        }
        this.k.a(n2);
        if (n2 == this.l) {
            if (n2 == this.k.d() - 1) {
                this.i(this.l - 1);
            } else {
                this.i(this.l);
            }
        } else if (n2 < this.l) {
            this.i(this.l - 1);
        }
        this.a();
        if (this.b != null && this.b instanceof ay) {
            ((ay)this.b).o();
        }
    }

    public final synchronized void t() {
        this.k.a();
        if (this.b != null && this.b instanceof ay) {
            ((ay)this.b).o();
        }
        this.a();
        this.l = 0;
    }

    public final void a(aq aq2) {
        super.a(aq2);
        if (aq2 instanceof ay) {
            this.m = ((ay)aq2).r();
        }
    }

    public final aq u() {
        return this.j(this.l);
    }

    public final void i(int n2) {
        if (n2 < 0 || n2 >= this.k.d()) {
            ct.a("[MGLayout]setSelectedComponent(...) vuot qua mang index = " + n2);
            return;
        }
        aq aq2 = null;
        int n3 = 0;
        while (n3 < this.k.d()) {
            aq2 = this.j(n3);
            if (n3 != n2) {
                aq2.d(false);
            } else {
                aq2.d(true);
                this.l = n2;
            }
            ++n3;
        }
        if (this.n != null) {
            this.n.a(aq2, 0, n2);
        }
        this.a();
    }

    public final aq j(int n2) {
        if (n2 < 0) {
            return null;
        }
        aq aq2 = (aq)this.k.b(n2);
        return aq2;
    }

    public final void a(Graphics graphics, int n2, int n3) {
        if (this.m == null) {
            this.m = this.l() != null ? ((ay)this.l()).r() : new k(0, 0, this.e(), this.f());
        }
        n2 += this.c() - this.m.a;
        n3 += this.d() - this.m.b;
        int n4 = this.k.d();
        int n5 = 0;
        while (n5 < n4) {
            aq aq2 = (aq)this.k.b(n5);
            if (aq2 != null && aq2.h().a(this.m)) {
                aq2.a(graphics, n2, n3);
                aq2.c(true);
            }
            ++n5;
        }
    }

    public final void n() {
        aq aq2 = this.u();
        if (aq2 != null) {
            aq2.n();
        }
    }

    public final g v() {
        return new g(this.j.a, this.j.b);
    }

    public int w() {
        return 10;
    }

    protected void a() {
    }
}
