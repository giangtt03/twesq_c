package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class nb
extends at {
    private int a;
    private int b;
    private int c;
    private int d;
    private boolean e = false;
    private Image f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    public nb(Image image) {
        this.f = image;
        if (image == null) {
            return;
        }
        this.o = image.getWidth() / 6;
        this.p = image.getHeight() / 10;
    }

    public final void a(int n, int n2, int n3, int n4, int n5) {
        this.c(n, n2);
        this.k = n5;
        this.a = n3;
        this.b = n4;
        this.c = n;
        this.d = n2;
        n5 = 20 + cv.a(40);
        n = Math.abs(n - n3);
        n2 = Math.abs(n2 - n4);
        if (n > n2) {
            this.d -= n - n2;
            this.d -= n5;
            this.c = n3 < v.t / 2 ? (this.c += n5) : (this.c -= n5);
        } else {
            this.d -= n5;
            this.c = n3 < v.t / 2 ? (this.c += n5) : (this.c -= (n5 += n2 - n));
        }
        this.j = n3 < v.t / 2 ? 2 : 0;
        this.i = 0;
        this.e = false;
        this.r = true;
        this.g = at.a(this.m, this.c, 14) + cv.a(4);
        this.h = at.a(this.n, this.d, 14) + cv.a(4);
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.r || this.f == null) {
            return;
        }
        graphics.drawRegion(this.f, this.i * this.o, this.k, this.o, this.p, this.j, this.m, this.n, 3);
    }

    public final void i() {
        if (!this.r) {
            return;
        }
        if (this.e) {
            if (this.i < 2) {
                ++this.i;
            }
            ++this.g;
            ++this.h;
            if (this.b(this.a, this.b, this.g, this.h)) {
                this.r = false;
                this.i = 1;
                return;
            }
        } else if (this.b(this.c, this.d, this.g, this.h)) {
            this.e = true;
            this.g = at.a(this.m, this.a, 28);
            this.h = at.a(this.n, this.b, 28);
        }
    }
}
