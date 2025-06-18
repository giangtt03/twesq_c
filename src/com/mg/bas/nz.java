package com.mg.bas;
// UI/game component for managing and rendering a custom view with overlays.
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public class nz
extends an {
    private ay b;
    public fn a;

    public nz(byte by) {
        super(-1);
        this.a(new av(0xFFFFFF, 0, 0, this.f, this.g));
        this.a = new fk();
        this.a.a(0, 0, this.f, this.g);
    }

    public final void j(boolean bl) {
        this.b = new ay(0);
        this.b.a(0, 0, this.f, this.g);
        this.b.b(this.a);
        this.b.h(1);
    }

    public final void a(aq aq2) {
        this.a.b(aq2);
    }

    public final aq f(int n) {
        return this.a.j(n);
    }

    public final void g(int n) {
        this.a.i(1);
    }

    protected final void a(Graphics graphics) {
        if (this.b != null) {
            this.b.a(graphics, 0, 0);
            return;
        }
        this.a.a(graphics, 0, 0);
    }

    protected final void c() {
        if (this.b != null) {
            this.b.n();
            return;
        }
        this.a.n();
    }

    protected final void a(int n) {
        if (this.b != null) {
            this.b.f(n);
            return;
        }
        this.a.f(n);
    }

    protected final void e(int n) {
        if (this.b != null) {
            this.b.g(n);
            return;
        }
        this.a.g(n);
    }

    protected final void e(int n, int n2) {
        if (this.b != null) {
            this.b.c(n, n2);
            return;
        }
        this.a.c(n, n2);
    }

    protected final void f(int n, int n2) {
        if (this.b != null) {
            this.b.f(n, n2);
            return;
        }
        this.a.f(n, n2);
    }

    protected final void g(int n, int n2) {
        if (this.b != null) {
            this.b.e(n, n2);
            return;
        }
        this.a.e(n, n2);
    }
}
