package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public abstract class nk
extends at {
    protected nk g;
    protected int h;
    protected boolean i;
    protected int j;
    protected int k;
    protected int s;
    protected int t = 0;
    protected int u = -1;
    protected int v = 0;
    protected boolean w = false;
    protected boolean x = false;
    protected boolean y = false;
    protected iq z;
    protected lk A;
    protected lj B;
    protected z C;
    protected k D;
    protected int E;

    public nk(int n) {
        this.h = n;
        this.z = new iq(mp.a().N, mp.a().O);
        this.A = new lk();
        this.B = new lj();
    }

    public abstract void a(boolean var1, boolean var2);

    public abstract void a(int var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6);

    public abstract void d();

    public abstract void e();

    public abstract void a(boolean var1);

    public abstract void a(int var1);

    public abstract int c();

    public final boolean f() {
        return this.E == 0 || this.E == 6;
    }

    public final k g() {
        return this.D;
    }

    public final void h() {
        int n = this.n() + this.p() / 2;
        int n2 = this.o() + this.q() + 11;
        n = this.h == 0 ? (n -= 5) : (n += 5);
        this.z.a(n, n2, n, n2, 0);
    }

    public final void j() {
        int n = this.n() + this.p() / 2;
        int n2 = this.o() + this.q() + 11;
        n = this.h == 0 ? (n -= 5) : (n += 5);
        this.A.d(n, n2);
    }

    public final void k() {
        int n = this.n() + this.p() / 2;
        int n2 = this.o() + this.q() + 11;
        n = this.h == 0 ? (n -= 5) : (n += 5);
        this.B.d(n, n2);
    }

    public final void a(nk nk2) {
        this.g = nk2;
    }
}
