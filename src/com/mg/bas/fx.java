package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class fx
extends aq {
    private a i;
    private int j = 0;
    private String k;
    private int l;
    private k m;
    private boolean n = false;
    private bh o = null;

    public fx(String string) {
        this.k = string;
        this.d = new k(0, 0, v.t - 20, v.u);
        this.m = new k(0, 0, this.d.c, 9 + bx.d.a());
        this.i = new a();
        this.l = this.m.d + 5;
    }

    public final void d(boolean bl) {
        super.d(bl);
        this.c = true;
    }

    public final void a(ey ey2) {
        int n;
        ey2.a(this);
        ey2.a(9, this.l, 13, 13);
        this.l += ey2.f() + 5;
        this.d.d = this.l + 5;
        this.e(this.d.d);
        int n2 = this.i.d();
        this.i.a(ey2);
        if (this.i.d() == 1) {
            this.j = 0;
            ey2.d(true);
            ey2.e(true);
        } else if (ey2.a()) {
            n = 0;
            while (n < n2) {
                ((ey)this.i.b(n)).e(false);
                ++n;
            }
        }
        if (ey2.m()) {
            this.j = n2;
            n = 0;
            while (n < n2) {
                ((ey)this.i.b(n)).d(false);
                ++n;
            }
        }
    }

    public final void b(int n, int n2) {
        super.b(n, n2);
        this.m = new k(0, 0, this.d.c, 9 + bx.d.a());
    }

    public final void a(int n, int n2, int n3, int n4) {
        super.a(n, n2, n3, n4);
        this.m = new k(this.d.a, this.d.b, this.d.c, 9 + bx.d.a());
        this.k = com.mg.sq.a.a(this.k, this.d.c - 4);
    }

    public final boolean f(int n) {
        if (this.i.d() <= 0) {
            return false;
        }
        int n2 = this.j;
        int n3 = 0;
        switch (n) {
            case 98: {
                if (this.j >= this.i.d() - 1) break;
                ++this.j;
                n3 = 1;
                break;
            }
            case 99: {
                if (this.j <= 0) break;
                --this.j;
                n3 = 1;
                break;
            }
            case 95: {
                ey ey2 = (ey)this.i.b(this.j);
                ey2.e(true);
                int n4 = 0;
                n3 = this.i.d();
                while (n4 < n3) {
                    if (n4 != this.j) {
                        ((ey)this.i.b(n4)).e(false);
                    }
                    ++n4;
                }
                if (this.b != null) {
                    this.b.c(true);
                }
                this.c(true);
                n3 = 1;
            }
        }
        if (n2 != this.j) {
            ((ey)this.i.b(n2)).d(false);
            ((ey)this.i.b(this.j)).d(true);
            this.c = true;
            if (this.b != null) {
                this.b.c(true);
            }
        }
        return n3 != 0;
    }

    public final boolean c(int n, int n2) {
        n -= this.c();
        n2 -= this.d();
        int n3 = 0;
        int n4 = this.i.d();
        while (n3 < n4) {
            ey ey2 = (ey)this.i.b(n3);
            if (ey2.h().a(n, n2)) {
                this.j = n3;
                ey2.d(true);
                ey2.e(true);
                n2 = 0;
                while (n2 < n4) {
                    if (n3 != n2) {
                        ey ey3 = (ey)this.i.b(n2);
                        ey3.d(false);
                        ey3.e(false);
                    }
                    ++n2;
                }
                this.c(true);
                if (this.b == null) break;
                this.b.c(true);
                break;
            }
            ++n3;
        }
        return true;
    }

    public final void h(int n) {
        int n2 = 0;
        while (n2 < this.i.d()) {
            ey ey2 = (ey)this.i.b(n2);
            if (ey2.q() == 0) {
                ey2.e(true);
            } else {
                ey2.e(false);
            }
            ++n2;
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.c) {
            return;
        }
        if (this.m()) {
            pc.a(graphics, this.c() + n, this.d() + n2, this.e(), this.f(), 7070703, -1);
            graphics.setColor(7267055);
            graphics.fillRect(this.c() + n, this.d() + n2, this.m.c, this.m.d);
        }
        int n3 = (n2 += this.d()) + 4;
        int n4 = (n += this.c()) + 4;
        bx.d.c(true);
        bx.d.a(graphics, this.k, n4, n3, 0);
        bx.d.c(false);
        n4 = 0;
        int n5 = this.i.d();
        while (n4 < n5) {
            ey ey2 = (ey)this.i.b(n4);
            if (n4 == this.j) {
                graphics.setColor(0xFF0000);
                graphics.fillRect(n + ey2.c(), n2 + ey2.d(), ey2.e(), ey2.f());
            }
            ey2.a(graphics, n, n2);
            ++n4;
        }
        this.c = false;
    }

    public final ey a() {
        int n = 0;
        while (n < this.i.d()) {
            ey ey2 = (ey)this.i.b(n);
            if (ey2.a()) {
                return ey2;
            }
            ++n;
        }
        return null;
    }
}
