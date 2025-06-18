package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public class iv
extends im {
    private static int[][] t;
    private static byte[][] u;
    protected lp[] s;
    private int v;
    private int w;
    private int x = 0;

    static {
        int[][] nArrayArray = new int[3][];
        int[] nArray = new int[6];
        nArray[0] = 138;
        nArray[2] = 26;
        nArray[3] = 19;
        nArray[4] = 56;
        nArray[5] = 24;
        nArrayArray[0] = nArray;
        nArrayArray[1] = new int[]{138, 19, 57, 27, 41, 20};
        int[] nArray2 = new int[6];
        nArray2[2] = 138;
        nArray2[3] = 66;
        nArrayArray[2] = nArray2;
        t = nArrayArray;
        byte[][] byArrayArray = new byte[2][];
        byArrayArray[0] = new byte[]{-1};
        byte[] byArray = new byte[7];
        byArray[2] = 1;
        byArray[3] = 1;
        byArray[4] = 2;
        byArray[5] = 2;
        byArray[6] = 2;
        byArrayArray[1] = byArray;
        u = byArrayArray;
    }

    public iv() {
        mp.a().a(1005);
        this.a(mp.a().p, t);
        this.a(u);
        this.o = 155;
        this.p = 66;
        this.s = new lp[6];
        int n = 0;
        while (n < this.s.length) {
            this.s[n] = new lp(0);
            ++n;
        }
        this.r = false;
        this.a(false);
    }

    public final void a(int n, int n2, int n3, int n4, int n5) {
        if ((n -= 60) < n3) {
            this.c(n, n2);
            this.c(0);
            this.j(6);
            this.h = n3;
        } else {
            this.h = n3 - 50;
            this.c(n, n2);
            this.c(2);
            this.j(6);
        }
        this.v = n3;
        this.j = 0;
        this.x = 0;
        if (n5 > 0) {
            this.w = n5;
            this.d(0);
        } else {
            this.d(1);
        }
        this.d(1);
        this.r = true;
    }

    public final void k() {
        int n;
        int n2 = 0;
        while (n2 < this.s.length) {
            this.s[n2].i();
            ++n2;
        }
        if (this.e == 1) {
            ++this.x;
            this.j += this.x;
            if (this.e(this.h, this.j)) {
                n2 = this.o() + 30;
                n = 0;
                while (n < 3) {
                    this.s[n << 1].b(this.v - 10 + cv.a() % 5, n2 + cv.a() % 10, cv.a(6));
                    this.s[(n << 1) + 1].b(this.v + 10 + cv.a() % 5, n2 + cv.a() % 10, cv.a(6));
                    n2 -= 25;
                    ++n;
                }
                this.d(0);
            }
        }
        if (this.e == 0) {
            if (this.w > 0) {
                --this.w;
                if (this.w == 0) {
                    this.d(1);
                }
                return;
            }
            n2 = 0;
            n = 0;
            while (n < this.s.length) {
                if (this.s[n].m()) {
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
        while (n < this.s.length) {
            this.s[n].a(graphics);
            ++n;
        }
        super.a(graphics);
    }
}
