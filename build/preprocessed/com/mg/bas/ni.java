package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ni
extends nk {
    private mg a;
    private mg b;
    private mg c;
    private mg d;
    private mg e;
    private mg f;
    private mc F;
    private mg G;
    private int[] H;
    private int I;
    private int J;
    private Image K;
    private int L;
    private int M;
    private int N;
    private nr O;
    private int P;

    public ni(int n, mg mg2, mg mg3, mg mg4, mg mg5, mg mg6, mg mg7, mc mc2, nr nr2) {
        super(n);
        int[] nArray = new int[9];
        nArray[0] = -10;
        nArray[1] = -10;
        nArray[2] = 10;
        nArray[3] = 10;
        this.H = nArray;
        this.L = -1000;
        this.a = mg2;
        this.b = mg3;
        this.c = mg4;
        this.d = mg6;
        this.e = mg5;
        this.f = mg7;
        this.F = mc2;
        this.O = nr2;
        this.G = this.a;
        if (n == 0) {
            this.G.c(2);
        } else {
            this.G.c(0);
        }
        this.K = mp.a().i;
        this.a(0);
        this.C = new z();
        this.C.a(20);
        this.C.a(com.mg.sq.a.h);
        this.D = new k(this.G.n(), this.G.o(), this.G.p(), this.G.q());
    }

    public final void a(int n, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.w = bl;
        this.y = bl5;
        if (!this.x) {
            this.x = bl2;
        }
        if (this.h == 0) {
            ni ni2 = this;
            this.s = this.g.n() + this.g.p() / 2 - ni2.G.p();
        } else {
            this.s = this.g.n() + this.g.p() / 2;
        }
        this.M = this.g.o() + this.g.q() - this.G.q();
        if (this.v <= 0 && (this.E == 0 || this.E == 6)) {
            this.k = at.a(this.s, this.G.n(), 2);
            if (this.k < 5) {
                this.k = 5;
            }
            this.N = at.a(this.M, this.G.o(), 2);
        }
        if (n < 11) {
            n = 11;
        }
        this.t = n;
        this.i = true;
        if (bl3) {
            this.h();
            this.v = 13;
            this.u = 2;
            return;
        }
        if (bl4) {
            this.j();
            this.v = 13;
            this.u = 2;
            return;
        }
        if (this.v <= 0 && (this.E == 0 || this.E == 6)) {
            this.a(2);
        }
    }

    public final void a(boolean bl, boolean bl2) {
        if (bl) {
            if (this.L == -1000) {
                this.L = this.G.n();
                this.s = this.h == 0 ? this.G.n() - 10 : this.G.n() + 10;
                this.k = 5;
                this.i = false;
                this.a(7);
                if (!this.C.a()) {
                    ni ni2 = this;
                    ni ni3 = ni2;
                    ni ni4 = this;
                    ni3 = ni4;
                    ni3 = this;
                    this.C.a("Xí Hụt", ni2.G.n() + ni4.G.p() / 2, ni3.G.o() + 20);
                    return;
                }
            }
        } else if (bl2) {
            this.k();
            if (!this.C.a()) {
                ni ni5 = this;
                ni ni6 = ni5;
                ni ni7 = this;
                ni6 = ni7;
                ni6 = this;
                this.C.a("Đỡ đòn", ni5.G.n() + ni7.G.p() / 2, ni6.G.o() + 20);
                return;
            }
        } else {
            this.a(3);
        }
    }

    public final void d() {
        this.a(4);
    }

    public final void a(boolean bl) {
        this.F.t = bl;
        this.F.d(2);
        this.a(6);
    }

    public final void e() {
        this.F.d(0);
        this.a(6);
    }

    public final int c() {
        return this.E;
    }

    public final void a(int n) {
        this.v = 0;
        mg mg2 = this.G;
        this.E = n;
        if (this.O != null) {
            this.O.d(0);
        }
        if (n == 0) {
            this.G = this.a;
        } else if (n == 1) {
            this.G = this.b;
            if (this.O != null) {
                this.O.d(2);
            }
        } else if (n == 3) {
            this.G = this.e;
        } else if (n == 4) {
            this.G = this.f;
        } else if (n == 6) {
            this.G = this.F;
        } else if (n == 7) {
            this.G = this.i ? this.c : this.d;
        } else if (n == 8) {
            this.G = this.e;
        } else {
            this.G = this.i ? this.c : this.d;
            if (this.O != null) {
                this.O.d(1);
            }
        }
        this.G.r();
        this.G.c(mg2.n(), mg2.o());
        this.G.c(mg2.g());
        if (n == 0) {
            n = cv.a(mg.u[0].length);
            this.G.a(n);
        }
    }

    public final int n() {
        return this.G.n();
    }

    public final int o() {
        return this.G.o();
    }

    public final int p() {
        return this.G.p();
    }

    public final int q() {
        return this.G.q();
    }

    public final void c(int n, int n2) {
        this.G.c(n, n2 - this.G.q());
        this.j = n;
        this.P = this.G.o();
        this.J = n2 - 2;
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.r) {
            return;
        }
        this.z.b(graphics);
        graphics.drawImage(this.K, n + this.G.n() + this.G.p() / 2 + (this.G.g() == 2 ? -4 : 4), this.J, 17);
        this.G.a(graphics, n, n2);
        this.z.c(graphics);
        this.C.a(graphics, n, n2);
        this.A.a(graphics);
        this.B.a(graphics);
    }

    public final void i() {
        if (!this.r) {
            return;
        }
        if (this.t > 0) {
            --this.t;
        }
        if (this.v > 0) {
            --this.v;
            if (this.v == 0) {
                this.a(this.u);
            }
        }
        this.z.i();
        this.A.i();
        this.B.i();
        switch (this.E) {
            case 1: {
                if (this.G.f() == this.G.e()[this.G.h()].length - 6) {
                    if (this.x) {
                        ag.a().a(20);
                    }
                    this.x = false;
                    this.g.a(this.w, this.y);
                }
                if (!this.G.j() || this.t != 0) break;
                --this.t;
                this.s = this.j;
                this.M = this.P;
                this.I = 0;
                this.k = at.a(this.s, this.G.n(), 2);
                this.N = at.a(this.M, this.G.o(), 2);
                this.i = false;
                this.a(5);
                break;
            }
            case 2: {
                if (this.i) {
                    if (!this.G.b(this.s, this.M, this.k, this.N)) break;
                    this.a(1);
                    break;
                }
                this.G.g(this.P + this.H[this.I++]);
                if (!this.G.e(this.j, this.k)) break;
                this.G.g(this.P);
                this.a(0);
                break;
            }
            case 5: {
                this.G.g(this.P + this.H[this.I++]);
                if (!this.G.e(this.j, this.k)) break;
                this.G.g(this.P);
                this.a(0);
                break;
            }
            case 3: {
                if (!this.G.j()) break;
                this.a(0);
                break;
            }
            case 6: {
                int n = this.F.h();
                if (n != 2 || !this.F.j()) break;
                this.a(0);
                break;
            }
            case 7: {
                if (this.i) {
                    if (!this.G.e(this.s, this.k)) break;
                    this.a(0);
                    this.L = -1000;
                    break;
                }
                if (this.G.e(this.s, this.k)) {
                    this.i = true;
                    this.a(7);
                    this.s = this.L;
                    this.k = 5;
                    break;
                }
                if (this.k <= 2) break;
                this.k -= 2;
            }
        }
        this.G.i();
        this.C.b();
        this.D.a = this.G.n();
        this.D.b = this.G.o();
    }
}
