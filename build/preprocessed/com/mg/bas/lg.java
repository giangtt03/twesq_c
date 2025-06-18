package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class lg {
    private lh a = null;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h;

    public lg(lh object) {
        lh lh2 = object;
        object = this;
        this.a = lh2;
    }

    public final lh a() {
        return this.a;
    }

    public final boolean b() {
        return this.a.O;
    }

    public final int c() {
        return this.a.G;
    }

    public final byte d() {
        return this.a.T;
    }

    public final boolean e() {
        return this.d > 0;
    }

    public final void a(int n) {
        this.d = n;
    }

    public final boolean f() {
        return this.g > 0;
    }

    public final void b(int n) {
        this.g = n;
    }

    public final boolean g() {
        return this.e > 0;
    }

    public final void c(int n) {
        this.e = n;
    }

    public final boolean h() {
        return this.f > 0;
    }

    public final void d(int n) {
        this.f = n;
    }

    public final void e(int n) {
        this.h = n;
    }

    public final boolean i() {
        return this.h > 0;
    }

    public final String j() {
        return this.a.b;
    }

    public final void f(int n) {
        this.b = 3;
    }

    public final int k() {
        return this.b;
    }

    public final int l() {
        return this.a.r;
    }

    public final int m() {
        return this.a.s;
    }

    public final void g(int n) {
        this.a.s = n;
    }

    public final int n() {
        return this.a.u;
    }

    public final int o() {
        return this.a.t;
    }

    public final void h(int n) {
        this.a.u = n;
    }

    public final lv i(int n) {
        lv lv2 = null;
        int n2 = 0;
        while (n2 < this.a.E.length) {
            if (this.a.E[n2].a == n) {
                lv2 = this.a.E[n2];
                break;
            }
            ++n2;
        }
        return lv2;
    }

    public final boolean p() {
        return this.a.w >= this.a.v;
    }

    public final int q() {
        return this.a.w;
    }

    public final void j(int n) {
        this.a.w = n;
    }

    public final int r() {
        return this.a.v;
    }

    public final String toString() {
        return this.a.toString();
    }

    public final void s() {
        if (this.d > 0) {
            --this.d;
        }
        if (this.e > 0) {
            --this.e;
        }
        if (this.f > 0) {
            --this.f;
        }
        if (this.g > 0) {
            --this.g;
        }
        if (this.h > 0) {
            --this.h;
        }
    }
}
