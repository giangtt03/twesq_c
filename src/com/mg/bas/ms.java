package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class ms
implements mr {
    private lg[][] q;
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = true;
    public int g = 0;
    public int h;
    public mw[] i;
    public int j;
    public my k;
    public nj[][] l;
    private byte[] r;
    private byte[] s;
    public byte[] m;
    public int n = 0;
    private boolean t;
    private byte[] u;
    public byte[] o;
    public int[] p;
    private boolean v;
    private Object w = new Object();
    private boolean z = false;

    public ms(lh[] lhArray, lh[] lhArray2) {
        this.h();
        this.q = new lg[2][];
        this.q[0] = new lg[lhArray.length];
        this.q[1] = new lg[lhArray2.length];
        int n = 0;
        while (n < lhArray.length) {
            this.q[0][n] = ms.a(lhArray[n]);
            this.q[0][n].f(3);
            ++n;
        }
        n = 0;
        while (n < lhArray2.length) {
            this.q[1][n] = ms.a(lhArray2[n]);
            this.q[1][n].f(3);
            ++n;
        }
    }

    public final void a(boolean bl) {
        this.b = bl;
        boolean bl2 = bl;
        ms ms2 = this;
        this.c = bl2;
    }

    private static lg a(lh lh2) {
        return new lg(lh2);
    }

    public final lg[][] a() {
        return this.q;
    }

    public final lg a(int n, int n2) {
        return this.q[n][n2];
    }

    public final boolean b() {
        return this.v;
    }

    public final void b(boolean bl) {
        this.v = bl;
    }

    public final boolean c() {
        return this.v;
    }

    public final void a(int n, int n2, int n3, int n4) {
        ms.a(this.l, n, n2, n3, n4);
    }

    public static void a(nj[][] njArray, int n, int n2, int n3, int n4) {
        nj nj2 = njArray[n][n2];
        njArray[n][n2] = njArray[n3][n4];
        njArray[n3][n4] = nj2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(byte[] object) {
        Object object2 = this.w;
        synchronized (object2) {
            this.u = object;
            this.e();
            return;
        }
    }

    public final void a(byte[] object, byte[] object2, byte[] byArray, lh[] lhArray, lh[] lhArray2) {
        this.t = false;
        this.s = null;
        this.r = null;
        this.m = null;
        this.u = null;
        byte[] byArray2 = object;
        this.o = byArray2;
        this.f();
        this.n = 0;
        this.a((byte[])object2);
        this.a(byArray);
        int n = 0;
        while (n < this.q[0].length) {
            this.q[0][n] = ms.a(lhArray[n]);
            this.q[0][n].f(3);
            lh lh0 = this.q[0][n].a();
            lh0.r = lhArray[n].r;
            lh0.s = lhArray[n].s;
            lh0.t = lhArray[n].t;
            lh0.u = lhArray[n].u;
            lh0.v = lhArray[n].v;
            lh0.w = lhArray[n].w;
            ++n;
        }
        n = 0;
        while (n < this.q[1].length) {
            this.q[1][n] = ms.a(lhArray2[n]);
            this.q[1][n].f(3);
            lh lh1 = this.q[1][n].a();
            lh1.r = lhArray2[n].r;
            lh1.s = lhArray2[n].s;
            lh1.t = lhArray2[n].t;
            lh1.u = lhArray2[n].u;
            lh1.v = lhArray2[n].v;
            lh1.w = lhArray2[n].w;
            ++n;
        }
    }

    public final void a(int n, int n2, int n3) {
        this.l[n][n2] = nj.a(n3);
    }

    public final nj b(int n, int n2) {
        return this.l[n][n2];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void d() {
        Object object = this.w;
        synchronized (object) {
            this.e();
            if (this.t) {
                if (this.s == null) {
                    this.f();
                }
                this.m = this.s;
                this.s = null;
            } else {
                if (this.r == null) {
                    this.f();
                }
                this.m = this.r;
                this.r = null;
            }
            this.t = !this.t;
            this.n = 0;
            return;
        }
    }

    public final boolean e() {
        if (this.u == null) {
            return false;
        }
        if (this.t) {
            if (this.s == null) {
                this.s = this.u;
                this.u = null;
            } else if (this.r == null) {
                this.r = this.u;
                this.u = null;
            }
        } else if (this.r == null) {
            this.r = this.u;
            this.u = null;
        } else if (this.s == null) {
            this.s = this.u;
            this.u = null;
        }
        return true;
    }

    public final boolean f() {
        if (this.o == null) {
            return false;
        }
        int n = 0;
        int n2 = 2;
        while (n2 < 10) {
            int n3 = 2;
            while (n3 < 10) {
                this.l[n2][n3] = nj.a(this.o[n++]);
                ++n3;
            }
            ++n2;
        }
        this.o = null;
        return true;
    }

    private void h() {
        this.l = new nj[12][12];
        int n = 11;
        while (n >= 0) {
            this.l[0][n] = nj.b;
            --n;
        }
        n = 11;
        while (n >= 0) {
            this.l[11][n] = nj.b;
            --n;
        }
        n = 11;
        while (n >= 0) {
            this.l[n][0] = nj.b;
            --n;
        }
        n = 11;
        while (n >= 0) {
            this.l[n][11] = nj.b;
            --n;
        }
        n = 10;
        while (n > 0) {
            this.l[1][n] = nj.b;
            --n;
        }
        n = 10;
        while (n > 0) {
            this.l[10][n] = nj.b;
            --n;
        }
        n = 10;
        while (n > 0) {
            this.l[n][1] = nj.b;
            --n;
        }
        n = 10;
        while (n > 0) {
            this.l[n][10] = nj.b;
            --n;
        }
        n = 9;
        while (n >= 2) {
            int n2 = 9;
            while (n2 >= 2) {
                this.l[n][n2] = nj.a;
                --n2;
            }
            --n;
        }
    }

    public final void g() {
        this.q = null;
        this.m = null;
        this.r = null;
        this.s = null;
        this.l = null;
        this.p = null;
        this.o = null;
        this.u = null;
        this.i = null;
    }
}
