package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class nn
extends nk {
    private as c = new as();
    private as d;
    private Image[] e;
    private int[] f;
    private boolean F = false;
    private int G = -1000;
    public int a = 0;
    public int b = 0;

    public nn(int n, Image[] imageArray, byte[][] byArray, int[] nArray, Image image, byte[][] byArray2, int n2) {
        super(n);
        this.e = imageArray;
        this.f = nArray;
        this.c.a(byArray);
        this.a(0);
        this.d = new as(image, n2);
        this.d.a(byArray2);
        this.d.a(false);
        if (n == 0) {
            this.c.c(2);
            this.d.c(2);
        } else {
            this.c.c(0);
            this.d.c(0);
        }
        this.d.d(2);
        this.C = new z();
        this.C.a(20);
        this.C.a(com.mg.sq.a.h);
        this.j(36);
        this.D = new k(this.c.n(), this.c.o(), this.c.p(), this.c.q());
    }

    public final int c() {
        return this.c.h();
    }

    public final void j(int n) {
        super.j(n);
        this.c.j(n);
    }

    public final void a(int n) {
        this.E = n;
        if (n == 4) {
            this.c.a(false);
        } else {
            this.c.a(true);
        }
        this.c.d(n);
        this.c.a(this.e[n], this.f[n]);
    }

    public final int n() {
        return this.c.n();
    }

    public final int o() {
        return this.c.o() - this.c.q();
    }

    public final int p() {
        return this.c.p();
    }

    public final int q() {
        return this.c.q();
    }

    public final void c(int n, int n2) {
        this.c.c(n, n2);
        this.j = n;
    }

    public final void d() {
        if (this.c.e().length > 4) {
            this.a(4);
        }
    }

    public final void a(int n, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.w = bl;
        if (!this.x) {
            this.x = bl2;
        }
        if (this.h == 0) {
            nn nn2 = this;
            this.s = this.g.n() + this.g.p() / 2 - nn2.c.p();
            nn nn3 = this;
            nn2 = nn3;
            nn nn4 = this;
            nn2 = nn4;
            nn2 = this;
            this.d.c(nn3.c.n() + nn4.c.p() / 2, this.o() - nn2.c.q());
        } else {
            this.s = this.g.n() + this.g.p() / 2 - 10;
        }
        nn nn5 = this;
        this.d.c(nn5.c.n() - this.a, this.o() - this.b);
        this.k = at.a(this.s, this.c.n(), 6);
        this.t = n - 6;
        this.i = true;
        this.d.d(2);
        if (bl3) {
            this.h();
        }
        this.a(2);
    }

    public final void a(boolean bl, boolean bl2) {
        if (bl) {
            this.F = bl;
            if (this.G == -1000) {
                this.G = this.c.n();
                if (!this.C.a()) {
                    nn nn2 = this;
                    nn nn3 = nn2;
                    nn3 = this;
                    this.C.a("Xí Hụt", nn2.c.n() + nn3.c.p() / 2, this.o() + 20);
                }
                this.s = this.h == 0 ? this.c.n() - 15 : this.c.n() + 15;
                this.k = 7;
                this.i = false;
                return;
            }
        } else if (this.c.e().length > 3) {
            this.a(3);
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        this.z.b(graphics);
        this.c.a(graphics, n, n2);
        this.d.a(graphics, n, n2);
        this.z.c(graphics);
        this.C.a(graphics, n, n2);
    }

    public final void i() {
        if (this.t > 0) {
            --this.t;
        }
        this.z.i();
        switch (this.c.h()) {
            case 1: {
                if (this.d.h() == 0) {
                    if (!this.d.e(this.s, this.k)) break;
                    this.d.d(1);
                    this.d.j(17);
                    if (this.x) {
                        ag.a().a(20);
                    }
                    this.x = false;
                    this.g.a(this.w, this.y);
                    break;
                }
                if (this.d.h() != 1 || !this.d.j()) break;
                this.d.d(2);
                this.a(0);
                break;
            }
            case 2: {
                if (!this.i || this.t <= 0 || this.t != 1) break;
                this.d.d(0);
                this.d.j(20);
                this.a(1);
                break;
            }
            case 3: {
                if (!this.c.j()) break;
                this.a(0);
            }
        }
        if (this.F) {
            if (this.i) {
                if (this.c.e(this.s, this.k)) {
                    this.a(0);
                    this.G = -1000;
                    this.F = false;
                }
            } else if (this.c.e(this.s, this.k)) {
                this.s = this.G;
                this.i = true;
                this.k = 7;
            } else if (this.k > 2) {
                this.k -= 2;
            }
        }
        this.c.i();
        this.d.i();
        this.C.b();
        this.D.a = this.c.n();
        this.D.b = this.c.o();
    }

    public final void a(boolean bl) {
    }

    public final void e() {
    }
}
