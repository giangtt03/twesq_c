package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class nc
extends as {
    private boolean s = false;
    private int t;
    private int u;

    public nc(Image image, int n, int n2, int n3) {
        this.b = image;
        this.o = n;
        this.p = n2;
        this.u = n3;
    }

    public final void a(int n, int n2, int n3, int n4, int n5) {
        this.c(n, n2);
        this.h = n3;
        this.i = n4;
        this.r = true;
        this.j = at.a(this.m, n3, 20) + cv.a(3);
        this.k = at.a(this.n, n4, 20) + cv.a(3);
        this.s = false;
        this.t = n5;
    }

    public final void k() {
        if (this.t > 0) {
            --this.t;
            return;
        }
        if (this.s) {
            ++this.k;
            ++this.j;
        } else {
            this.j = at.a(this.m, this.h, 4) + cv.a(2);
            this.k = at.a(this.n, this.i, 8) + cv.a(2);
        }
        if (this.b(this.h, this.i, this.j, this.k)) {
            if (this.s) {
                this.r = false;
                return;
            }
            this.h = this.m + cv.a(20);
            this.i = this.n + 40 + cv.a(100);
            this.j = at.a(this.m, this.h, 14) + cv.a(2);
            this.k = at.a(this.n, this.i, 10) + cv.a(2);
            this.s = true;
            this.b(this.h, this.i, this.j, this.k);
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.r || this.t > 0) {
            return;
        }
        if (this.g >= 0 && this.f[this.e][this.g] >= 0 && this.b != null) {
            cw.a(graphics, this.b, this.f[this.e][this.g] * this.o, this.u, this.o, this.p, this.m + n, this.n + n2, this.q);
        }
    }
}
