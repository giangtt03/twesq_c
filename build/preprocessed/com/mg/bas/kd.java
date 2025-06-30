package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class kd
extends ke {
    private kl f;
    public a b = new a();
    public kg[] c;
    public a d = new a();
    private a g = new a();

    public final void a(Graphics graphics, int n, int n2) {
        this.a(graphics, n, n2, null);
    }

    public final void a(Graphics graphics, int n, int n2, k k2) {
        int n3;
        int n4;
        int n5 = 0;
        while (n5 < this.c.length) {
            if (this.c[n5].m()) {
                this.c[n5].a(graphics, n, n2 + 5);
            }
            ++n5;
        }
        if (this.d != null) {
            n4 = 0;
            n3 = this.d.d();
            while (n4 < n3) {
                ka ka2 = (ka)this.d.b(n4);
                ka2.a(graphics, n, n2 + (ka2.r() == 1 ? 5 : 7));
                ++n4;
            }
        }
        n3 = 0;
        int n6 = this.g.d();
        while (n3 < n6) {
            at at2 = (at)this.g.b(n3);
            n4 = at2.l() == 10 ? 7 : 5;
            at2.a(graphics, n, n2 + n4);
            ++n3;
        }
    }

    public final void i() {
        if (this.d != null) {
            int n = 0;
            int n2 = this.d.d();
            while (n < n2) {
                ka ka2 = (ka)this.d.b(n);
                ka2.i();
                ++n;
            }
        }
    }

    public final void a() {
        int n;
        this.g.a();
        int n2 = 0;
        while (n2 < this.c.length) {
            this.c[n2].i();
            ++n2;
        }
        if (this.f != null) {
            this.g.a(this.f);
        }
        if (this.b != null) {
            n = 0;
            while (n < this.b.d()) {
                if (this.b.b(n) instanceof ki) {
                    at at2 = (at)this.b.b(n);
                    if (this.a.b(at2.n(), at2.o(), at2.p(), at2.q())) {
                        at2.b(true);
                        this.g.a(at2);
                    } else {
                        at2.b(false);
                    }
                }
                ++n;
            }
        }
        int n3 = 0;
        while (n3 < this.c.length) {
            if (this.a.b(this.c[n3].n(), this.c[n3].o(), this.c[n3].p(), this.c[n3].q())) {
                this.c[n3].b(true);
            } else {
                this.c[n3].b(false);
            }
            ++n3;
        }
        a a2 = this.g;
        n = 1;
        int n4 = a2.d();
        while (n < n4) {
            int n5 = n;
            at at3 = (at)a2.b(n5);
            at at4 = (at)a2.b(n5 - 1);
            while (n5 > 0 && (at4.o() + at4.q() > at3.o() + at3.q() || at4.l() > at3.l() && at4.o() + at4.q() == at3.o() + at3.q())) {
                a2.a(n5, n5 - 1);
                at3 = (at)a2.b(--n5);
                at4 = (at)a2.b(n5 - 1);
            }
            ++n;
        }
    }

    public final void b(Graphics graphics, int n, int n2) {
        int n3 = 0;
        while (n3 < this.c.length) {
            if (this.c[n3].d.a == 2) {
                ((kk)this.c[n3]).b(graphics, n, n2);
            }
            ++n3;
        }
    }

    public final void a(kl kl2) {
        this.f = kl2;
        this.b.a(kl2);
    }

    public final kl c() {
        return this.f;
    }

    public final void b() {
        super.b();
        this.d.a();
        this.g.a();
        this.b.a();
        this.f = null;
    }
}
