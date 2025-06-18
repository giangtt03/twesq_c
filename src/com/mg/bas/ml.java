package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ml
extends at {
    private int a;
    private Image[] b;
    private Image[] c;
    private Image[] d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    public ml() {
        ml ml2 = this;
        this.c = mp.a().d;
        ml2.d = mp.a().e;
        ml2.b = new Image[1];
        ml2.b[0] = mp.a().g;
    }

    public final void a(Graphics graphics, int n, int n2) {
        switch (this.a) {
            case 2: 
            case 3: {
                graphics.drawImage(this.c[this.g], this.m, this.n, 3);
                return;
            }
            case 1: {
                graphics.drawImage(this.c[this.g], this.m, this.n, 3);
                n = 14;
                if (this.e >= 3) {
                    ++n;
                }
                if ((this.f & 1) == 1) {
                    graphics.drawRegion(this.d[this.g], 0, 0, this.d[this.g].getWidth(), this.d[this.g].getHeight(), 6, this.m - n, this.n, 10);
                }
                if ((this.f & 2) == 2) {
                    graphics.drawRegion(this.d[this.g], 0, 0, this.d[this.g].getWidth(), this.d[this.g].getHeight(), 5, this.m + n, this.n, 6);
                }
                if ((this.f & 4) == 4) {
                    graphics.drawRegion(this.d[this.g], 0, 0, this.d[this.g].getWidth(), this.d[this.g].getHeight(), 0, this.m, this.n - n, 33);
                }
                if ((this.f & 8) != 8) break;
                graphics.drawRegion(this.d[this.g], 0, 0, this.d[this.g].getWidth(), this.d[this.g].getHeight(), 3, this.m, this.n + n, 17);
                return;
            }
            case 4: {
                n = this.b[this.g].getWidth() >> 1;
                n2 = 0;
                if (this.j >= 2) {
                    n2 = 1;
                }
                cw.a(graphics, this.b[this.g], n2 * n, 0, n, this.b[this.g].getHeight(), this.m, this.n, 3);
            }
        }
    }

    public final void i() {
        switch (this.a) {
            case 4: {
                ++this.j;
                if (this.j < 4) break;
                int n = 2;
                ml ml2 = this;
                this.a = 2;
                return;
            }
            case 3: {
                int n = Math.abs(this.i - this.n);
                n = n < 2 ? 2 : (n /= 2);
                boolean bl = this.f(this.i, n);
                n = Math.abs(this.h - this.m);
                n = n < 2 ? 2 : (n /= 2);
                if (bl &= this.e(this.h, n)) {
                    n = 2;
                    ml ml3 = this;
                    this.a = 2;
                }
            }
            case 1: {
                ++this.e;
                if (this.e <= 6) break;
                this.e = 0;
            }
        }
    }

    public final void a() {
        this.a = 0;
    }

    public final void a(int n) {
        this.g = n;
    }

    public final void c(int n, int n2, int n3, int n4) {
        this.a = 3;
        this.h = n3;
        this.i = n4;
        this.c(n, n2);
    }

    public final void a(int n, int n2) {
        this.a = 2;
        this.c(n, n2);
    }

    public final void b(int n, int n2, int n3) {
        this.a = 1;
        this.f = n;
        this.c(n2, n3);
    }

    public final void b(int n, int n2) {
        this.a = 4;
        this.c(n, n2);
        this.j = 0;
        this.e = 0;
    }
}
