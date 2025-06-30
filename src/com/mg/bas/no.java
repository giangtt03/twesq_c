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

    public final void a(final int n, int n2, final k x, final Image b, int i, final int o, int u, final boolean y) {
        this.y = y;
        this.x = x;
        final int n3 = x.c >> 1;
        final int n4 = x.d >> 1;
        final int n5 = (n3 <= 0) ? 1 : n3;
        final int n6 = (n4 <= 0) ? 1 : n4;
        final int n7 = n + cv.a() % 13;
        final int n8 = n2 + cv.a() % 13;
        final int n9 = x.a + cv.a() % n5;
        final int n10 = x.b + cv.a() % n6;
        final int n11 = i;
        final int p8 = u;
        u = n11;
        i = n10;
        final int h = n9;
        final int n12 = n8;
        n2 = n7;
        this.c(n2, n12);
        super.h = h;
        super.i = i;
        super.r = true;
        super.j = at.a(super.m, h, this.s) + cv.a(4);
        super.k = at.a(super.n, i, this.t) + cv.a(4);
        super.b = b;
        this.u = u;
        super.o = o;
        super.p = p8;
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
