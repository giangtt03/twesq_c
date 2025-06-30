package com.mg.bas;
// Abstract base class for UI/game elements, provides layout, rendering, and state management utilities.
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public abstract class am {
    protected int e;
    protected int f;
    protected int g;
    protected boolean h = true;
    private boolean a = true;
    protected bf i;
    private ba b = new ba();
    protected az[] j = new az[3];
    private int[] c = new int[3];
    private int d;
    private int k;
    private int l = 13;
    private boolean m = true;
    private boolean n = false;

    public am() {
        this.f = v.t;
        this.g = v.u;
    }

    public final int h() {
        return this.e;
    }

    public final void b(int n) {
        this.e = n;
    }

    public final int i() {
        return this.f;
    }

    public final int j() {
        return this.g;
    }

    public void a(bf bf2) {
        this.i = bf2;
    }

    public final boolean k() {
        return this.a;
    }

    public final void d(boolean bl) {
        this.a = false;
    }

    public boolean l() {
        return this.h;
    }

    public void e(boolean bl) {
        this.h = bl;
    }

    public final void f(boolean bl) {
        this.n = bl;
    }

    public final void g(boolean bl) {
        this.m = false;
    }

    public final void a(ba ba2) {
        this.b = ba2;
    }

    public final void m() {
        int n = 0;
        while (n < this.j.length) {
            this.j[n] = null;
            this.c[n] = 0;
            ++n;
        }
    }

    public final void n() {
        this.j[0] = null;
        this.c[0] = 0;
    }

    public final void o() {
        this.j[1] = null;
        this.c[1] = 0;
    }

    protected void d(Graphics graphics) {
        if (this.b != null) {
            this.b.a(graphics);
        }
        int n = 0;
        while (n < this.j.length) {
            if (this.j[n] != null) {
                this.j[n].a(graphics);
            }
            ++n;
        }
    }

    public final void a(Graphics graphics, boolean bl) {
        this.c(graphics);
        if (bl) {
            this.d(graphics);
        }
    }

    public final void h(boolean bl) {
        int n = 0;
        while (n < this.j.length) {
            if (this.j[n] != null) {
                this.j[n].c();
                if (this.c[n] > 0) {
                    int n2 = n;
                    this.c[n2] = this.c[n2] - 1;
                    if (this.c[n] == 0 && !this.j[n].b(this.e) && this.i != null) {
                        this.i.d(this.e, this.j[n].a());
                    }
                }
            }
            ++n;
        }
        if (bl) {
            am am2 = this;
            if (v.z) {
                int n3;
                int n4;
                int n5;
                n = v.A;
                int n6 = v.B;
                if (n >= 0 && n6 >= 0) {
                    n5 = ag.b ? 1 : 0;
                    ag.c = false;
                    n4 = n6;
                    n6 = n;
                    am am3 = am2;
                    n3 = 0;
                    am3.d = n4;
                    am3.k = n6;
                    if (am3.p() && am3.j[0].a(n6, n4)) {
                        v.c[94] = 2;
                        n3 = 1;
                    }
                    if (am3.a() && am3.j[2].a(n6, n4)) {
                        v.c[93] = 2;
                        n3 = 1;
                    }
                    if (am3.q() && am3.j[1].a(n6, n4)) {
                        v.c[95] = 2;
                        n3 = 1;
                    }
                    if (n3 == 0) {
                        am3.a(n6, n4);
                    }
                    v.B = -1;
                    v.A = -1;
                    if (n5 != 0 && !ag.c) {
                        ag.a().e();
                    }
                } else {
                    n = v.E;
                    n6 = v.F;
                    if (n >= 0 && n6 >= 0) {
                        n4 = n6;
                        n6 = n;
                        am am4 = am2;
                        n3 = n6 - am4.k;
                        n5 = n4 - am4.d;
                        am4.d = n4;
                        am4.k = n6;
                        am4.c(n3, n5);
                        v.F = -1;
                        v.E = -1;
                    }
                }
                int n7 = v.C;
                n6 = v.D;
                if (n7 >= 0 && n6 >= 0) {
                    n4 = n6;
                    n6 = n7;
                    am am5 = am2;
                    am5.b(n6, n4);
                    v.D = -1;
                    v.C = -1;
                }
            }
            am2 = this;
            int n8 = 299;
            while (n8 >= 0) {
                if (v.c[n8] != 0) {
                    if (v.c[n8] == 1) {
                        am2.d(n8);
                        v.c[n8] = 0;
                    } else if (v.c[n8] == 2) {
                        if (!am2.a(n8)) {
                            am2.c(n8);
                        }
                        v.c[n8] = 0;
                    } else if (v.c[n8] >= 3) {
                        if (!(v.c[n8] <= am2.l && v.c[n8] != 3 || am2.a(n8) || !am2.m && v.c[n8] != 3)) {
                            am2.c(n8);
                        }
                        if (v.c[n8] < Integer.MAX_VALUE) {
                            int n9 = n8;
                            v.c[n9] = v.c[n9] + 1;
                        }
                    }
                    if (!am2.n) break;
                }
                --n8;
            }
        }
        this.b_();
    }

    public final boolean p() {
        return this.j[0] != null;
    }

    private boolean a() {
        return this.j[2] != null;
    }

    public final boolean q() {
        return this.j[1] != null;
    }

    public void a(az az2, boolean bl) {
        this.j[0] = az2;
        this.c[0] = 0;
        if (az2 == null) {
            return;
        }
        if (bl) {
            this.j[0].a(6, v.u - ba.a + 3, 20);
        }
    }

    public void b(az az2, boolean bl) {
        this.j[2] = az2;
        this.c[2] = 0;
        if (az2 == null) {
            return;
        }
        if (bl) {
            this.j[2].a(v.t - 6, v.u - ba.a + 3, 24);
        }
    }

    public void a(az az2) {
        boolean bl = true;
        az az3 = az2;
        am am2 = this;
        am2.j[1] = az3;
        am2.c[1] = 0;
        if (az3 != null) {
            am2.j[1].a(v.t / 2, v.u - ba.a + 3, 17);
        }
    }

    private boolean a(int n) {
        boolean bl = false;
        if (this.p() && n == 94) {
            if (this.c[0] == 0) {
                bl = this.j[0].b();
                this.c[0] = 3;
            }
        } else if (this.a() && n == 93) {
            if (this.c[2] == 0) {
                bl = this.j[2].b();
                this.c[2] = 3;
            }
        } else if (this.q() && n == 95 && this.c[1] == 0) {
            bl = this.j[1].b();
            this.c[1] = 3;
        }
        return bl;
    }

    public void c(int n) {
    }

    public void d(int n) {
    }

    public void a(int n, int n2) {
    }

    public void b(int n, int n2) {
    }

    public void c(int n, int n2) {
    }

    protected void r() {
    }

    protected void s() {
    }

    public void i(boolean bl) {
        this.e(true);
    }

    public abstract void b_();

    public abstract void c(Graphics var1);
    
     public void resetHandlerAndArray() {
        this.i = null;
        this.j = null;
    }
    public boolean isM() {
        return this.m;
    }
}
