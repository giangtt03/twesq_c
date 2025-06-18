package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class kc
extends ke {
    private Image b;
    private int c = 0;
    private int d = 0;
    private int f = 20;
    private int g = 0;

    public kc(Image image) {
        this.b = image;
        this.m = 0;
        this.g = v.u;
        this.f = 36;
    }

    public final void i() {
        int n = 0;
        int n2 = this.e.d();
        while (n < n2) {
            ((at)this.e.b(n)).i();
            ++n;
        }
    }

    public final void a(Graphics graphics, int n, int n2, k k2) {
        int n3 = this.d;
        while (n3 <= this.c) {
            graphics.drawImage(this.b, this.m + n3 * this.b.getWidth(), this.g, this.f);
            ++n3;
        }
        n3 = 0;
        int n4 = this.e.d();
        while (n3 < n4) {
            ((at)this.e.b(n3)).a(graphics, n, n2);
            ++n3;
        }
    }

    public final void c(int n, int n2) {
        super.c(n, n2);
    }

    public final void f(int n) {
        super.f(n);
    }

    public final void g(int n) {
        super.g(n);
    }

    public final void a(int n, int n2) {
        super.a(n, n2);
        n = this.b.getWidth();
        this.c = (v.t - (this.m + n)) / n + 1;
        if (this.m > 0) {
            n2 = this.m / n + (this.m % n > 0 ? 1 : 0);
            this.c += n2;
            this.m -= n2 * n;
        }
        if (this.a != null) {
            n2 = this.a.c / n + 1;
            this.d = this.c >= n2 ? this.c - n2 : 0;
        }
    }
}
