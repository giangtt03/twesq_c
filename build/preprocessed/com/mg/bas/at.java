package com.mg.bas;
// Abstract base class for UI/game layout elements, providing position, size, and state management.
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public abstract class at {
    protected int l;
    protected int m;
    protected int n;
    protected int o;
    protected int p;
    protected int q;
    protected boolean r = true;

    public final int l() {
        return this.l;
    }

    public final void e(int n) {
        this.l = 10;
    }

    public final boolean m() {
        return this.r;
    }

    public void b(boolean bl) {
        this.r = bl;
    }

    public void c(int n, int n2) {
        this.f(n);
        this.g(n2);
    }

    public void a(int n, int n2, int n3, int n4) {
        this.f(n);
        this.g(n2);
        n2 = n3;
        at at2 = this;
        this.o = n2;
        n2 = n4;
        at2 = this;
        this.p = n2;
    }

    public int n() {
        return this.m;
    }

    public void f(int n) {
        this.m = n;
    }

    public int o() {
        return this.n;
    }

    public void g(int n) {
        this.n = n;
    }

    public int p() {
        return this.o;
    }

    public final void h(int n) {
        this.o = n;
    }

    public int q() {
        return this.p;
    }

    public final void i(int n) {
        this.p = n;
    }

    public void j(int n) {
        this.q = n;
    }

    public final void k(int n) {
        if ((n & 0x20) == 32) {
            this.n -= this.p;
        } else if ((n & 2) == 2) {
            this.n -= this.p / 2;
        }
        if ((n & 8) == 8) {
            this.m -= this.o;
            return;
        }
        if ((n & 1) == 1) {
            this.m -= this.o / 2;
        }
    }

    public abstract void i();

    public abstract void a(Graphics var1, int var2, int var3);

    public void a(Graphics graphics) {
        this.a(graphics, 0, 0);
    }

    public final boolean b(int n, int n2, int n3, int n4) {
        n = this.e(n, n3) ? 1 : 0;
        n2 = this.f(n2, n4) ? 1 : 0;
        return n != 0 && n2 != 0;
    }

    public static int a(int n, int n2, int n3) {
        if ((n = Math.abs(n2 - n)) <= n3) {
            return 1;
        }
        return n / n3;
    }

    public final boolean e(int n, int n2) {
        int n3 = this.m > n ? 1 : 0;
        this.m = n3 != 0 ? (this.m -= n2) : (this.m += n2);
        int n4 = n2 = this.m > n ? 1 : 0;
        if (n3 != n2) {
            this.m = n;
        }
        return this.m == n;
    }

    public final boolean f(int n, int n2) {
        int n3 = this.n > n ? 1 : 0;
        this.n = n3 != 0 ? (this.n -= n2) : (this.n += n2);
        int n4 = n2 = this.n > n ? 1 : 0;
        if (n3 != n2) {
            this.n = n;
        }
        return this.n == n;
    }

    public void g(int n, int n2) {
    }

    public void h(int n, int n2) {
    }
}
