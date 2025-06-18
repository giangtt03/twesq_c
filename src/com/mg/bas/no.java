package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class no
extends as {
    private int s = 30;
    private int t = 40;
    private int u;
    private int v;
    private int w;
    private k x;
    private boolean y;

    public no() {
        this.q = 3;
    }

    public final void a(int n, int n2, k k2, Image image, int n3, int n4, int n5, boolean n6) {
        this.y = n6;
        this.x = k2;
        n6 = k2.c >> 1;
        int n7 = k2.d >> 1;
        n6 = n6 <= 0 ? 1 : n6;
        n7 = n7 <= 0 ? 1 : n7;
        int n8 = k2.a + cv.a() % n6;
        int n9 = k2.b + cv.a() % n7;
        n7 = n5;
        n6 = n4;
        n5 = n3;
        Image image2 = image;
        n3 = n9;
        int n10 = n8;
        int n11 = n2 + cv.a() % 13;
        n2 = n + cv.a() % 13;
        no no2 = this;
        no2.c(n2, n11);
        no2.h = n10;
        no2.i = n3;
        no2.r = true;
        no2.j = at.a(no2.m, n10, no2.s) + cv.a(4);
        no2.k = at.a(no2.n, n3, no2.t) + cv.a(4);
        no2.b = image2;
        no2.u = n5;
        no2.o = n6;
        no2.p = n7;
    }

    public final void k() {
        if (this.y) {
            if (this.v != this.x.a) {
                this.h = this.x.a + this.x.c / 2 + cv.a() % (this.x.c >> 1);
                this.v = this.x.a;
            }
            if (this.w != this.x.b) {
                this.i = this.x.b + this.x.d / 2 + cv.a() % (this.x.d >> 1);
                this.w = this.x.b;
            }
        }
        if (this.b(this.h, this.i, this.j, this.k)) {
            this.r = false;
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (this.r && this.b != null && this.g >= 0 && this.f[this.e][this.g] >= 0) {
            cw.a(graphics, this.b, this.f[this.e][this.g] * this.o, this.u, this.o, this.p, this.m + n, this.n + n2, this.q);
        }
    }
}
