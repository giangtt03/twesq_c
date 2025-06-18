package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class gd
extends aq {
    private String i = "";
    private ff j;
    private Image k;
    private cu l;

    public gd(String string) {
        this.i = string;
        this.j = new ff("", 300, 2);
        this.j.a(this.c() + 3, bx.d.a() + 10, this.e() - 6, 20);
        this.e(bx.d.a() + this.j.f() + 15);
    }

    public gd(byte[] byArray) {
        this.i = "Nhập lại những ký tự sau:";
        if (byArray != null && byArray.length > 0) {
            this.k = f.a(byArray);
        }
        int n = bx.d.a() + 10;
        if (this.k != null) {
            this.l = new cu((v.t - this.k.getWidth()) / 2, n);
            n += this.k.getHeight() + 5;
        }
        this.j = new ff("", 300, 2);
        this.j.a(this.c() + 3, n, this.e() - 6, 20);
        this.e(n + this.j.f() + 3);
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
            bx.d.a(graphics, this.i, n4 + 1, n3 + 3, 0);
            bx.d.c();
        }
        if (this.k != null) {
            graphics.drawImage(this.k, this.l.a + n4, this.l.b + n3, 20);
        }
        this.j.a(graphics, n4, n3);
    }

    public final void n() {
        this.j.n();
    }

    public final void a(int n, int n2, int n3, int n4) {
        super.a(n, n2, n3, n4);
        this.j.a(this.c() + 3, bx.d.a() + 10, this.e() - 10, 20);
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
        return this.j.c(n -= this.c(), n2 -= this.d());
    }

    public final void h(int n) {
        this.j.j(4);
    }

    public final void d(boolean bl) {
        super.d(bl);
        if (this.j != null) {
            this.j.d(bl);
        }
    }

    public final String a() {
        return this.j.r();
    }

    public final void i(int n) {
        this.j.k(1);
    }

    public final void a(String string) {
        this.j.c(string);
    }

    public final void b(boolean bl) {
        super.b(bl);
        this.j.b(bl);
    }
}
