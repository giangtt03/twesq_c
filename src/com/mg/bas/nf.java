package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class nf
extends ng {
    private static int[][] F;

    static {
        int[][] nArrayArray = new int[9][];
        nArrayArray[0] = new int[]{299, 123, 124, 75, 91, 50};
        nArrayArray[1] = new int[]{140, 123, 159, 95, 41, 30};
        int[] nArray = new int[6];
        nArray[0] = 230;
        nArray[2] = 127;
        nArray[3] = 121;
        nArray[4] = 17;
        nArrayArray[2] = nArray;
        int[] nArray2 = new int[6];
        nArray2[2] = 136;
        nArray2[3] = 123;
        nArray2[5] = 14;
        nArrayArray[3] = nArray2;
        int[] nArray3 = new int[6];
        nArray3[0] = 357;
        nArray3[2] = 99;
        nArray3[3] = 108;
        nArray3[4] = 4;
        nArray3[5] = 32;
        nArrayArray[4] = nArray3;
        nArrayArray[5] = new int[]{423, 123, 128, 73, 2, 63};
        int[] nArray4 = new int[6];
        nArray4[1] = 123;
        nArray4[2] = 140;
        nArray4[3] = 96;
        nArray4[4] = 19;
        nArray4[5] = 26;
        nArrayArray[6] = nArray4;
        int[] nArray5 = new int[6];
        nArray5[0] = 136;
        nArray5[2] = 94;
        nArray5[3] = 122;
        nArray5[4] = 126;
        nArray5[5] = 3;
        nArrayArray[7] = nArray5;
        int[] nArray6 = new int[6];
        nArray6[0] = 456;
        nArray6[2] = 96;
        nArray6[3] = 88;
        nArray6[4] = 143;
        nArray6[5] = 41;
        nArrayArray[8] = nArray6;
        F = nArrayArray;
    }

    public nf(int n, Image[] imageArray, byte[][] byArray, int[] nArray) {
        super(n, imageArray, byArray, nArray);
        this.f = 6;
    }

    protected final void a() {
        if (this.a.f() == 0) {
            if (this.x) {
                ag.a().a(20);
            }
            this.x = false;
            this.g.a(this.w, this.y);
        }
        if (this.a.j() && this.t == 0) {
            --this.t;
            this.s = this.j - 148;
            this.k = at.a(this.s, this.a.n(), 6);
            this.i = false;
            this.a(5);
            this.a.c(0);
        }
    }

    protected final void b() {
        if (this.i) {
            if (this.a.e(this.s, this.k)) {
                this.a(1);
                return;
            }
        } else if (this.a.e(this.s, this.k)) {
            this.a.c(0);
            this.a.f(this.j);
            this.a(0);
        }
    }

    public final void a(int n) {
        if (n == 0 || n == 1) {
            this.a.a(true);
        } else {
            this.a.a(false);
        }
        if (n == 2 || n == 5 || n == 1) {
            this.a.a(this.b[2], F);
            this.a.i(140);
            this.a.h(239);
            if (n == 2) {
                this.a.f(this.a.n() - 90);
            }
        } else {
            this.a.a(this.b[n], this.c[n]);
        }
        this.a.d(n);
    }

    public final void a(Graphics graphics, int n, int n2) {
        this.z.b(graphics);
        if (this.a.h() == 1 || this.a.h() == 5) {
            n2 = 8;
        }
        this.a.a(graphics, n, n2);
        this.z.c(graphics);
        this.C.a(graphics, n, n2);
    }
}
