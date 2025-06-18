package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class iy
extends im {
    private static final byte[][] s;
    private static final int[][] t;

    static {
        byte[][] byArrayArray = new byte[2][];
        byte[] byArray = new byte[26];
        byArray[4] = 1;
        byArray[5] = 1;
        byArray[6] = 1;
        byArray[7] = 2;
        byArray[8] = 2;
        byArray[9] = 2;
        byArray[10] = 3;
        byArray[11] = 3;
        byArray[12] = 3;
        byArray[13] = 4;
        byArray[14] = 4;
        byArray[15] = 4;
        byArray[16] = 5;
        byArray[17] = 5;
        byArray[18] = 5;
        byArray[19] = 6;
        byArray[20] = 6;
        byArray[21] = 6;
        byArray[22] = 7;
        byArray[23] = 7;
        byArray[24] = 8;
        byArray[25] = 8;
        byArrayArray[0] = byArray;
        byArrayArray[1] = new byte[]{9};
        s = byArrayArray;
        int[][] nArrayArray = new int[10][];
        nArrayArray[0] = new int[]{121, 106, 14, 27, 48, 105};
        nArrayArray[1] = new int[]{96, 93, 24, 39, 38, 93};
        int[] nArray = new int[6];
        nArray[0] = 189;
        nArray[2] = 50;
        nArray[3] = 45;
        nArray[4] = 12;
        nArray[5] = 86;
        nArrayArray[2] = nArray;
        nArrayArray[3] = new int[]{142, 72, 32, 79, 30, 52};
        nArrayArray[4] = new int[]{175, 73, 52, 77, 10, 54};
        int[] nArray2 = new int[6];
        nArray2[0] = 33;
        nArray2[1] = 92;
        nArray2[2] = 62;
        nArray2[3] = 58;
        nArray2[5] = 73;
        nArrayArray[5] = nArray2;
        int[] nArray3 = new int[6];
        nArray3[0] = 142;
        nArray3[2] = 47;
        nArray3[3] = 73;
        nArray3[4] = 16;
        nArray3[5] = 57;
        nArrayArray[6] = nArray3;
        int[] nArray4 = new int[6];
        nArray4[0] = 92;
        nArray4[2] = 50;
        nArray4[3] = 93;
        nArray4[4] = 13;
        nArray4[5] = 37;
        nArrayArray[7] = nArray4;
        int[] nArray5 = new int[6];
        nArray5[2] = 31;
        nArray5[3] = 130;
        nArray5[4] = 31;
        nArrayArray[8] = nArray5;
        int[] nArray6 = new int[6];
        nArray6[0] = 31;
        nArray6[2] = 61;
        nArray6[3] = 92;
        nArray6[4] = 2;
        nArray6[5] = 40;
        nArrayArray[9] = nArray6;
        t = nArrayArray;
    }

    public iy() {
        this.a(false);
        this.a(s);
        mp.a().a(1008);
        this.a(mp.a().t, t);
        this.o = 63;
        this.p = 130;
    }

    public final void a(int n, int n2, int n3, int n4, int n5) {
        this.d(0);
        this.g = 0;
        this.k = 1;
        this.c(n - this.o, n2 - this.p);
        this.b(n - this.o, n4 - this.p);
        this.r = true;
    }

    public final void k() {
        switch (this.e) {
            case 0: {
                if (!this.j()) break;
                this.d(1);
                return;
            }
            case 1: {
                this.k += 2;
                if (!this.f(this.i, this.k)) break;
                this.r = false;
            }
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.r) {
            return;
        }
        n = this.f[this.e][this.g];
        if (n >= 0) {
            int[] nArray = t[n];
            n2 = this.n + nArray[5];
            int n3 = this.m + nArray[4];
            cw.a(graphics, this.b, nArray[0], nArray[1], nArray[2], nArray[3], n3, n2, 0);
            graphics.drawRegion(this.b, nArray[0], nArray[1], nArray[2], nArray[3], 2, n3 + nArray[2] - 1, n2, 0);
        }
    }
}
