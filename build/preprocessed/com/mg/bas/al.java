package com.mg.bas;
// Abstract base class for UI/game components with timing and state management, extends am.
// Decompiled with: CFR 0.152
// Class Version: 1
public abstract class al
extends am {
    public static int a = 2000;
    private int k = 0;
    protected boolean b = false;
    private boolean l;
    private boolean m;
    private int n;
    protected int c;
    protected int d;

    public al(int n) {
        this.k = n;
        if (this.k == 1) {
            this.n = -1;
            return;
        }
        if (this.k == 0) {
            this.n = a;
        }
    }

    public final int a() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public void a(int n, int n2, int n3, int n4) {
        this.c = n;
        this.d = n2;
        this.f = n3;
        this.g = n4;
    }

    public final void a(boolean bl) {
        this.b = bl;
    }

    public final boolean d() {
        return this.b;
    }

    public final boolean e() {
        return this.l;
    }

    public final void b(boolean bl) {
        this.l = true;
    }

    public final boolean f() {
        return this.m;
    }

    public final void c(boolean bl) {
        this.m = true;
    }

    public void a(int n) {
        this.n = n;
    }

    public final void b_() {
        if (this.n > 0) {
            --this.n;
            if (this.n == 1) {
                ag.b().o();
                return;
            }
        }
        this.g();
    }

    protected void g() {
    }
}
