package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class kl
extends at {
    public int a;
    public static final byte[] b;
    public static final byte[] c;
    public mg d = null;
    public mg e;
    private mg z;
    public mg f;
    private mg A;
    public md g;
    public mg h;
    private int B = 0;
    public int i = 4;
    public int j = -1;
    private int C = -1;
    public int k = 0;
    public int s;
    public k t = new k(this.m, this.n, this.E, 32);
    public k u = new k(this.m, this.n, 26, 32);
    private int D = 0;
    private int E = 17;
    public boolean v = false;
    private lh F;
    private int G;
    private int H;
    private k I = null;
    private int J;
    public int w = 0;
    public int x = 50;
    private boolean K = true;
    private int L = 0;
    private int M;
    private int N = 0;
    public boolean y = false;
    private nr O;
    private static final byte[] P;
    private int Q;
    private int R;

    static {
        byte[] byArray = new byte[11];
        byArray[4] = -1;
        byArray[5] = -1;
        byArray[6] = -1;
        byArray[8] = 1;
        byArray[9] = 1;
        byArray[10] = 1;
        b = byArray;
        byte[] byArray2 = new byte[11];
        byArray2[1] = -1;
        byArray2[2] = 1;
        byArray2[5] = -1;
        byArray2[6] = 1;
        byArray2[9] = -1;
        byArray2[10] = 1;
        c = byArray2;
        P = new byte[]{-1, 1};
    }

    public kl() {
        this.b(false);
        this.e(10);
    }

    public final void a(lh lh2) {
        this.F = lh2;
        this.y = lh2.ad;
        mb[] mbArray = mb.a(this.F);
        this.e = null;
        this.z = null;
        this.f = null;
        this.A = null;
        this.h = null;
        this.g = null;
        System.gc();
        lc lc2 = lc.a(this.F);
        this.O = nr.a(this.F);
        this.e = mb.a(lh2, mbArray[0], mbArray[1], mbArray[3], mbArray[2], true);
        this.e.a(lc2);
        this.e.a(this.O);
        this.z = mb.b(lh2, mbArray[0], mbArray[1], mbArray[3], mbArray[2], true);
        this.z.a(lc2);
        this.z.a(this.O);
        this.f = mb.c(lh2, mbArray[0], mbArray[1], mbArray[3], mbArray[2], true);
        this.f.a(lc2);
        this.f.a(this.O);
        this.A = mb.g(lh2, mbArray[0], mbArray[1], mbArray[3], mbArray[2], true);
        this.A.a(lc2);
        this.h = mb.h(lh2, mbArray[0], mbArray[1], mbArray[3], mbArray[2], true);
        this.h.a(lc2);
        this.g = mb.i(lh2, mbArray[0], mbArray[1], mbArray[3], mbArray[2], true);
        this.g.a(lc2);
        this.G = -this.t.c;
        this.H = this.t.d - this.e.q();
        this.o = this.e.p();
        this.p = this.e.q();
        this.d = this.e;
        this.J = this.d.q() - this.t.d;
        this.I = new k(this.t.a, this.t.b - this.J, this.t.c, this.d.q());
        this.a(0, 8);
        this.b(this.F);
    }

    public final void b(lh lh2) {
        this.i = 4 + lh2.G / 10;
        if (this.i > 9) {
            this.i = 9;
        }
        this.a = 11 + lh2.G / 10;
        if (this.a > 16) {
            this.a = 16;
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (this.K && this.d != null) {
            this.d.a(graphics, this.t.a + this.G + this.L + n, this.t.b + this.H + n2);
        }
    }

    public final void i() {
        block21: {
            int n;
            block20: {
                kl kl2;
                block19: {
                    if (this.x > 0) {
                        --this.x;
                        boolean bl = this.K = !this.K;
                        if (this.x == 0) {
                            this.K = true;
                            this.b(true);
                        }
                    }
                    if (this.N > 0) {
                        --this.N;
                        if (this.N == 0) {
                            this.i = this.i;
                            this.M = 0;
                        }
                    }
                    switch (this.j) {
                        case 5: {
                            if (this.d.h() != 0 || !this.d.j()) break;
                            this.d.d(1);
                            break;
                        }
                        case 6: {
                            if (this.d.h() != 0 || !this.d.j()) break;
                            this.d.d(1);
                            break;
                        }
                        case 7: {
                            break;
                        }
                        case 0: {
                            if (!this.y) break;
                            ++this.R;
                            if (this.R <= 10) break;
                            this.H += P[this.Q];
                            ++this.Q;
                            if (this.Q > 1) {
                                this.Q = 0;
                            }
                            this.R = 0;
                            break;
                        }
                        case 2: {
                            if (this.v) break;
                            return;
                        }
                        case 8: {
                            kl kl3 = this;
                            if (kl3.d.j()) {
                                this.a(2);
                            }
                            int n2 = this.B;
                            this.B = this.d.f();
                            if (n2 == this.B) break;
                            this.t.b += 3 * c[this.k];
                            break;
                        }
                        case 4: {
                            kl kl4 = this;
                            if (!kl4.d.j()) break;
                            this.a(0);
                        }
                    }
                    if (this.j != 2 && this.j != 8 && this.j != 3) break block19;
                    this.m = this.t.a - (this.o - this.t.c) / 2;
                    this.n = this.t.b - (this.p - this.t.d);
                    kl2 = this;
                    n = -2;
                    break block20;
                }
                this.m = this.t.a;
                this.n = this.t.b - (this.p - this.t.d);
                if (this.d == null) break block21;
                kl2 = this;
                n = this.d.g() == 0 ? -4 : 2;
            }
            kl2.L = n;
        }
        this.I.b = this.t.b - this.J;
        this.I.a = this.t.a;
        if (this.d != null) {
            this.d.i();
        }
    }

    public final void a(int n, int n2) {
        this.b(n2);
        this.a(n);
    }

    public final void a(int n) {
        this.y = this.F.ad;
        this.C = this.j;
        mg mg2 = this.d;
        this.j = n;
        if (this.O != null) {
            this.O.d(0);
        }
        switch (n) {
            case 1: {
                if (this.C != this.j) {
                    this.d = this.z;
                    if (mg2 != null) {
                        this.d.c(mg2.g());
                    }
                }
                if (this.O == null) break;
                this.O.d(1);
                break;
            }
            case 6: {
                this.d = this.h;
                if (mg2 != null) {
                    this.d.c(mg2.g());
                }
                this.d.d(0);
                this.s = 1;
                break;
            }
            case 7: {
                this.d = this.h;
                this.d.d(2);
                this.B = 0;
                break;
            }
            case 5: {
                this.d = this.A;
                if (mg2 != null) {
                    this.d.c(mg2.g());
                }
                this.d.d(0);
                this.s = this.a;
                this.w = 0;
                break;
            }
            case 0: {
                this.d = this.e;
                if (mg2 == null) break;
                this.d.c(mg2.g());
                break;
            }
            case 2: {
                if (this.d != this.g) {
                    this.d = this.g;
                }
                this.d.d(1);
                break;
            }
            case 3: {
                this.d.d(0);
                if (mg2 == null) break;
                this.d.c(mg2.g());
                break;
            }
            case 8: {
                this.d = this.g;
                this.d.d(1);
                if (mg2 == null) break;
                this.d.c(mg2.g());
                break;
            }
            case 4: {
                this.b(true);
                this.d = this.f;
                this.d.a(0);
                if (mg2 != null) {
                    this.d.c(mg2.g());
                }
                this.u.b = this.t.b;
                this.u.a = this.d.g() == 0 ? this.t.a - this.u.c : this.t.a + this.t.c;
                if (this.O == null) break;
                this.O.d(2);
            }
        }
        this.d.r();
        if (this.d.f() < 0) {
            this.d.i();
        }
    }

    public final void b(int n) {
        if (this.d != null) {
            this.d.c((n & 8) != 0 ? 2 : ((n & 4) != 0 ? 0 : this.d.g()));
        }
        this.k = n;
    }

    public final void b(int n, int n2) {
        this.t.a += n;
        this.t.b += n2;
    }

    public final void c(int n, int n2) {
        this.t.a = n;
        this.t.b = n2;
        this.m = this.t.a;
        this.n = this.t.b - (this.p - this.t.d);
    }

    public final void g(int n) {
        this.t.b = n;
        this.n = this.t.b - (this.p - this.t.d);
    }

    public final void f(int n) {
        this.m = this.t.a = n;
    }

    public final int n() {
        return this.t.a - (this.o - this.t.c) / 2;
    }

    public final int o() {
        return this.t.b + this.H;
    }
}
