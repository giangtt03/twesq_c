package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class mh
extends at
implements mr {
    private static byte[][] b = new byte[][]{{-1}, new byte[1], {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6}, new byte[1], new byte[1], new byte[1], new byte[1]};
    private Image[] c;
    private nd[][] d;
    k a;

    public static void a() {
        b = null;
    }

    public mh() {
        int n;
        if (b == null) {
            b = new byte[][]{{-1}, new byte[1], {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6}, new byte[1], new byte[1], new byte[1], new byte[1]};
        }
        mh mh2 = this;
        this.c = mp.a().c;
        this.d = new nd[8][8];
        this.a = new k();
        this.o = 224;
        this.p = 224;
        this.a.a(this.m, this.n, this.o, this.p);
        int n2 = 0;
        while (n2 < 8) {
            n = 0;
            while (n < 8) {
                this.d[n2][n] = new nd(this.c);
                this.d[n2][n].j(3);
                this.d[n2][n].a(b);
                this.d[n2][n].i();
                ++n;
            }
            ++n2;
        }
        n2 = 0;
        n = 1000;
        int n3 = 3;
        while (n3 >= 0) {
            int n4 = 0;
            int n5 = n;
            int n6 = 3;
            while (n6 >= 0) {
                this.d[n3][n6].d(n5, 1035);
                this.d[n2 + 4][n6].d(n5, 1035);
                this.d[n3][n4 + 4].d(n5, 1035);
                this.d[n2 + 4][n4 + 4].d(n5, 1035);
                n5 += 2;
                ++n4;
                --n6;
            }
            ++n2;
            n += 2;
            --n3;
        }
    }

    public final void c(int n, int n2) {
        super.c(n, n2);
        this.a.a(this.m - 14, this.n - 14, this.o, this.p);
    }

    public final void a(int n, int n2, nj nj2, int n3) {
        this.d[n -= 2][n2 -= 2].a(this.m + n2 * 28, this.n + n * 28, nj2.g, nj2.f, n3);
    }

    public final void a(int n, int n2, int n3, int n4, nj nj2, nj nj3) {
        int n5 = this.m + (n2 -= 2) * 28;
        int n6 = this.n + (n -= 2) * 28;
        int n7 = this.m + (n4 -= 2) * 28;
        int n8 = this.n + (n3 -= 2) * 28;
        this.d[n][n2].a(n7, n8, n5, n6, nj3.g, nj3.f);
        this.d[n3][n4].a(n5, n6, n7, n8, nj2.g, nj2.f);
    }

    public final void a(int n, int n2, int n3, int n4, nj nj2, int n5) {
        try {
            int n6 = this.m + (n2 -= 2) * 28;
            int n7 = this.n + (n -= 2) * 28;
            int n8 = this.m + (n4 -= 2) * 28;
            int n9 = this.n + (n3 -= 2) * 28;
            this.d[n3][n4].a(n6, n7, n8, n9, nj2.g, nj2.f, n5);
            return;
        }
        catch (Exception exception) {
            ct.a("[boardview] setfall  " + n + "   " + n2 + "     " + n3 + "    " + n4 + nj2 + exception);
            return;
        }
    }

    public final int a(mw mw2) {
        int n = mw2.b - 2;
        int n2 = mw2.c - 2;
        int n3 = n2 * 28 + this.m;
        int n4 = n * 28 + this.n;
        byte[][] byArray = b;
        int n5 = n2;
        n2 += mw2.d;
        while (n5 < n2) {
            this.d[n][n5].a(byArray);
            this.d[n][n5].c(n3, n4, mw2.a.g, mw2.j);
            n3 += 28;
            ++n5;
        }
        return 10 + mw2.j;
    }

    public final int b(mw mw2) {
        int n = mw2.e - 2;
        int n2 = mw2.f - 2;
        int n3 = n2 * 28 + this.m;
        int n4 = n * 28 + this.n;
        byte[][] byArray = b;
        int n5 = n;
        n += mw2.g;
        while (n5 < n) {
            this.d[n5][n2].a(byArray);
            this.d[n5][n2].c(n3, n4, mw2.a.g, mw2.j);
            n4 += 28;
            ++n5;
        }
        return 10 + mw2.j;
    }

    public final nd a(int n, int n2) {
        return this.d[n][n2];
    }

    public final void a(Graphics graphics, int n, int n2) {
        n = 0;
        while (n < 8) {
            n2 = 0;
            while (n2 < 8) {
                this.d[n][n2].a(graphics);
                ++n2;
            }
            ++n;
        }
    }

    public final void i() {
        int n = 0;
        while (n < 8) {
            int n2 = 0;
            while (n2 < 8) {
                this.d[n][n2].i();
                ++n2;
            }
            ++n;
        }
    }
}
