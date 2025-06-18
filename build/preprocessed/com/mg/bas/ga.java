package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class ga
extends aq {
    private String i = "";
    private ez j;

    public ga(String string) {
        this.i = string;
        this.j = new ez();
        this.j.a(this.c(), bx.d.a() + 10, this.e(), 20);
        this.e(bx.d.a() + this.j.f() + 15);
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.c) {
            return;
        }
        int n3 = this.d() + n2;
        int n4 = this.c() + n;
        if (this.m()) {
            pc.a(graphics, this.c() + n, this.d() + n2, this.e(), this.f(), 7070703, -1);
            graphics.setColor(7267055);
            graphics.fillRect(n4, n3, this.e(), bx.d.a() + 6);
        }
        if (this.i != null) {
            bx.d.c(true);
            bx.d.a(graphics, this.i, n4, n3 + 3, 0);
            bx.d.c();
        }
        this.j.a(graphics, n4 + 3, n3);
    }

    public final void n() {
        this.j.n();
    }

    public final void a(int n, int n2, int n3, int n4) {
        super.a(n, n2, n3, n4);
        this.j.a(n, n2 + 20, this.e(), 18);
    }

    public final void d(int n) {
        super.d(n);
        this.j.d(n - 5);
    }

    public final boolean f(int n) {
        return this.j.f(n);
    }

    public final boolean g(int n) {
        return this.j.g(n);
    }

    public final boolean c(int n, int n2) {
        return this.j.c(n, n2);
    }

    public final boolean f(int n, int n2) {
        return this.j.f(n, n2);
    }

    public final void d(boolean bl) {
        super.d(bl);
        if (this.j != null) {
            this.j.d(bl);
        }
    }

    public final long a() {
        return this.j.a();
    }
}
