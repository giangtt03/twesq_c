package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class mo
extends mq {
    private int z;
    private int A;
    private int B;
    private int C;
    private int D;

    public mo(ms ms2, mt mt2, oq oq2) {
        super(ms2, mt2, oq2);
        this.o = 0;
        ct.a("[playingController]=======================Fighting========================");
    }

    public final void b(int n) {
        if (this.t) {
            if (n >= 148 && n <= 157) {
                this.t = false;
                this.e(n - 148);
                return;
            }
        } else if (com.mg.bas.v.a() && n == 142 || !com.mg.bas.v.a() && n == 135) {
            this.t = true;
        }
        mt mt2 = this.b;
        if (mt2.d.i()) {
            if (n == 99) {
                this.b.b();
                return;
            }
            if (n == 95) {
                this.b.a(this.b.d.r());
                this.b.d.c("");
                this.b.b();
                return;
            }
            this.b.d.f(n);
            return;
        }
        if (com.mg.bas.v.ai && (n < 93 || n > 99) || n >= 148 && n <= 157) {
            this.b.a();
            this.b.d.f(n);
            return;
        }
        if (oq.o == 1) {
            if (this.h == 0 && !this.u) {
                this.c[this.h].a(n);
                return;
            }
        } else if (this.d == 8 && this.h == 0 && !this.u) {
            this.c[this.h].a(n);
        }
    }

    public final void c(int n) {
        if (this.t && (com.mg.bas.v.a() && n == 142 || !com.mg.bas.v.a() && n == 135)) {
            this.t = false;
        }
        mt mt2 = this.b;
        if (mt2.d.i()) {
            this.b.d.g(n);
        }
    }

    public final void a(int n, int n2) {
        if (this.b.d.h().b(n, n2)) {
            mt mt2 = this.b;
            if (mt2.d.i()) {
                this.b.d.g(false);
                return;
            }
            this.b.a();
            return;
        }
        mt mt3 = this.b;
        if (mt3.d.i()) {
            if (!this.b.d.h().b(n, n2)) {
                this.b.b();
            }
            return;
        }
        if (oq.o == 1) {
            if (this.h == 0 && !this.u) {
                this.c[this.h].a(n, n2);
                return;
            }
        } else if (this.d == 8 && this.h == 0 && !this.u) {
            this.c[this.h].a(n, n2);
        }
    }

    public final void b(int n, int n2) {
        if (this.d == 8 && this.h == 0 && !this.u) {
            this.c[this.h].b(n, n2);
        }
    }

    public final void c(int n, int n2) {
        if (this.d == 8 && this.h == 0) {
        }
    }

    protected final void a(int n, int n2, int n3, int n4, int n5) {
        ct.a("[playingcontroller ]  actionOpponentSwapChess");
        if (this.k) {
            this.b.a(n, this.i, this.j, n2, n3);
            this.z = 20;
            this.A = n2;
            this.B = n4;
            this.C = n3;
            this.D = n5;
            this.r = n;
            return;
        }
        super.a(n, n2, n3, n4, n5);
    }

    public final void a(boolean bl) {
        ct.a(String.valueOf(go.k.b) + "    receiveTurn = " + bl);
        if (!bl && this.k) {
            this.b.a(1, this.i, this.j);
        }
        super.a(bl);
        if (oq.o != 1 && !bl && this.k) {
            ks.a().d(this.m);
        }
    }

    protected final void e(int n, int n2) {
        block4: {
            if (n != 0) break block4;
            lm[] lmArray = this.b.g.w();
            a a2 = new a();
            int n3 = 0;
            while (n3 < lmArray.length) {
                block6: {
                    block5: {
                        if (lmArray[n3].a != n2) break block5;
                        --lmArray[n3].g;
                        if (lmArray[n3].g <= 0) break block6;
                    }
                    a2.a(lmArray[n3]);
                }
                ++n3;
            }
            lmArray = new lm[a2.d()];
            n3 = 0;
            while (n3 < lmArray.length) {
                lmArray[n3] = (lm)a2.b(n3);
                ++n3;
            }
            this.b.a(lmArray);
        }
        super.e(n, n2);
    }

    protected final void f(int n, int n2) {
        if (this.d != 8 || this.h != 1) {
            return;
        }
        super.f(n, n2);
    }

    public final void b() {
        if (this.z > 0) {
            --this.z;
            if (this.z == 0) {
                super.a(this.r, this.A, this.C, this.B, this.D);
            }
            return;
        }
        super.b();
    }

    protected final void c() {
        switch (this.g) {
            case 2: {
                oa.d = false;
                break;
            }
            default: {
                oa.d = true;
            }
        }
        this.p();
    }

    protected final void d() {
        if (this.h == 0) {
            Object object = this.b;
            if (((mt)object).e.d() && oq.o == 0) {
                this.d(15);
                return;
            }
            if (this.b.e.e()) {
                ms ms2 = this.a;
                object = this;
                a a2 = new a();
                int n = 2;
                while (n < 9) {
                    int n2 = 2;
                    while (n2 < 9) {
                        my my2 = ((mq)object).a(ms2, n, n2, n + 1, n2);
                        if (my2 != null) {
                            a2.a(my2);
                        }
                        if ((my2 = ((mq)object).a(ms2, n, n2, n, n2 + 1)) != null) {
                            a2.a(my2);
                        }
                        ++n2;
                    }
                    ++n;
                }
                this.e = a2;
                if (this.e != null) {
                    object = (my)this.e.b(cv.a(this.e.d()));
                    this.b.a((my)object);
                }
                this.e = null;
            }
        }
    }

    protected final void e() {
        if (!this.f) {
            ks.a().s();
            this.d(15);
            this.b.c("Đang đợi đối thủ!");
            return;
        }
        this.d(7);
    }

    public final boolean f() {
        return this.h == 0 && this.d == 8;
    }

    protected final boolean b(nq nq2) {
        if (this.o != -1) {
            if (this.m == nq2.b && this.o != nq2.c) {
                if (oq.o != 1) {
                    this.o = -1;
                    this.l.c();
                    ks.a().t();
                    return true;
                }
                if (this.o == 5) {
                    this.b.b.b(0);
                } else if (this.o == 3) {
                    this.d(2);
                }
                this.o = -1;
                return false;
            }
            if (this.m != nq2.b) {
                this.l.c();
                ks.a().t();
                this.o = -1;
            }
        } else if (this.n > this.m + 1) {
            this.l.c();
            ks.a().t();
            return true;
        }
        return false;
    }

    public final boolean g() {
        return this.a(this.i, this.j, this.i - 1, this.j);
    }

    public final boolean h() {
        return this.a(this.i, this.j, this.i + 1, this.j);
    }

    public final boolean i() {
        return this.a(this.i, this.j, this.i, this.j - 1);
    }

    public final boolean j() {
        return this.a(this.i, this.j, this.i, this.j + 1);
    }

    public final boolean a(int n, int n2, int n3, int n4) {
        if (this.s) {
            this.s = false;
            this.b.b(false);
        }
        int n5 = n4;
        int n6 = n3;
        boolean bl = this.a.c();
        if (!(!bl || n6 >= 2 && n6 < 10 && n5 >= 2 && n5 < 10)) {
            return false;
        }
        if (this.a.b()) {
            nj[][] cfr_ignored_0 = this.a.l;
            ms ms2 = this.a;
            this.p = oz.a(ms2.l);
            boolean bl2 = this.a(n, n2, n3, n4, false);
            this.o = 3;
            if (bl2) {
                ks.a().a(n, n2, n3, n4, this.m);
                ++this.m;
                int n7 = n4;
                int n8 = n3;
                n5 = n2;
                n6 = n;
                mt mt2 = this.b;
                nd nd2 = mt2.a.a(n6 - 2, n5 - 2);
                nd nd3 = mt2.a.a(n8 - 2, n7 - 2);
                n8 = nd2.n() - (nd2.n() - nd3.n() >> 1) - (mt2.f.p() >> 1);
                int n9 = nd2.o() - (nd2.o() - nd3.b() >> 1) - (mt2.f.q() >> 1);
                mt2.f.c(n8, n9);
                mt2.f.b(true);
            } else {
                this.a(this.a(this.a.a(0, 0).j(), n, n2, n3, n4, this.m));
                this.q = true;
            }
            if (oq.o == 1) {
                this.a.b(false);
                this.b.a(0, n3, n4, n, n2);
                this.i = n3;
                this.j = n4;
            }
            return bl2;
        }
        if (n3 < 2) {
            n3 = 9;
        } else if (n3 >= 10) {
            n3 = 2;
        }
        if (n4 < 2) {
            n4 = 9;
        } else if (n4 >= 10) {
            n4 = 2;
        }
        this.h(n3, n4);
        this.b.a(0, this.i, this.j, n3, n4);
        this.i = n3;
        this.j = n4;
        return true;
    }

    public final void a(nq nq2) {
        while (this.o != -1) {
            if (this.m == nq2.b) {
                if (this.w != null) {
                    this.l.a(nq2);
                    this.n = nq2.b;
                    this.o = -1;
                    nq2 = this.w;
                    this.w = null;
                    continue;
                }
                if (this.o == nq2.c) break;
                if (this.o == 5) {
                    this.b.b.b(0);
                    break;
                }
                if (this.o != 3) break;
                this.d(2);
                break;
            }
            if (this.m + 1 == nq2.b) {
                this.w = nq2;
                return;
            }
            this.l.c();
            ks.a().t();
            this.o = -1;
            break;
        }
        this.l.a(nq2);
        if (nq2.b >= 0) {
            this.n = nq2.b;
        }
        this.o = -1;
    }
}
