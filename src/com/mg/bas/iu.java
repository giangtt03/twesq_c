package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class iu
extends im {
    private static byte[][] s;
    private lp[] t;
    private int u;
    private int v = 0;

    static {
        byte[][] byArrayArray = new byte[2][];
        byArrayArray[0] = new byte[]{-1};
        byte[] byArray = new byte[16];
        byArray[3] = 1;
        byArray[4] = 1;
        byArray[5] = 2;
        byArray[6] = 2;
        byArray[7] = 3;
        byArray[8] = 3;
        byArray[9] = 4;
        byArray[10] = 4;
        byArray[11] = 5;
        byArray[12] = 5;
        byArray[13] = 6;
        byArray[14] = 6;
        byArray[15] = 6;
        byArrayArray[1] = byArray;
        s = byArrayArray;
    }

    public iu() {
        mp.a().a(1004);
        this.a(mp.a().o, 7);
        this.a(s);
        this.t = new lp[6];
        int n = 0;
        while (n < this.t.length) {
            this.t[n] = new lp(0);
            ++n;
        }
        this.r = false;
    }

    public final void a(int n, int n2, int n3, int n4, int n5) {
        this.r = true;
        if (n3 >= com.mg.bas.v.t / 2) {
            this.c(0);
            this.j(40);
            this.b(n3 + 20, n4);
            this.c(this.h - this.o - 20, n4);
            this.u = n3;
        } else {
            this.c(2);
            this.j(36);
            this.b(n3 - 20, n4);
            this.c(this.h + this.o + 20, n4);
            this.u = n3;
        }
        this.f(this.h);
        this.v = 1;
        this.d(1);
    }

    public final void k() {
        int n;
        int n2 = 0;
        while (n2 < this.t.length) {
            this.t[n2].i();
            ++n2;
        }
        if (this.e == 1) {
            if (this.v == 0) {
                if (this.j()) {
                    ++this.v;
                    this.f(this.h);
                    this.a(-1);
                }
            } else {
                if (this.g == s[1].length - 5) {
                    n2 = this.o() - 10;
                    n = 0;
                    while (n < 3) {
                        this.t[n << 1].b(this.u - 10 + cv.a() % 5, n2 + cv.a() % 10, cv.a(6));
                        this.t[(n << 1) + 1].b(this.u + 10 + cv.a() % 5, n2 + cv.a() % 10, cv.a(6));
                        n2 -= 25;
                        ++n;
                    }
                }
                if (this.j()) {
                    this.d(0);
                }
            }
        }
        if (this.e == 0) {
            n2 = 0;
            n = 0;
            while (n < this.t.length) {
                if (this.t[n].m()) {
                    n2 = 1;
                    break;
                }
                ++n;
            }
            if (n2 == 0) {
                this.r = false;
            }
        }
    }

    public final void a(Graphics graphics) {
        int n = 0;
        while (n < this.t.length) {
            this.t[n].a(graphics);
            ++n;
        }
        super.a(graphics);
    }
}
