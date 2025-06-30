package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class le
extends as {
    private Image s = com.mg.bas.f.d("/blacksmith");
    private Image t = com.mg.bas.f.d("/effblacksmith");
    private int u = 40;
    private as v;
    private static final int[][] w;
    private static final int[][] x;

    static {
        int[][] nArrayArray = new int[1][];
        int[] nArray = new int[4];
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        nArrayArray[0] = nArray;
        w = nArrayArray;
        int[][] nArrayArray2 = new int[7][];
        nArrayArray2[0] = new int[]{1};
        int[] nArray2 = new int[8];
        nArray2[1] = 1;
        nArray2[2] = 2;
        nArray2[3] = 3;
        nArray2[4] = 2;
        nArray2[5] = 3;
        nArray2[6] = 2;
        nArray2[7] = 1;
        nArrayArray2[1] = nArray2;
        int[] nArray3 = new int[16];
        nArray3[1] = 1;
        nArray3[2] = 2;
        nArray3[3] = 3;
        nArray3[4] = 2;
        nArray3[5] = 3;
        nArray3[6] = 2;
        nArray3[7] = 1;
        nArray3[9] = 1;
        nArray3[10] = 2;
        nArray3[11] = 3;
        nArray3[12] = 2;
        nArray3[13] = 3;
        nArray3[14] = 2;
        nArray3[15] = 1;
        nArrayArray2[2] = nArray3;
        int[] nArray4 = new int[24];
        nArray4[1] = 1;
        nArray4[2] = 2;
        nArray4[3] = 3;
        nArray4[4] = 2;
        nArray4[5] = 3;
        nArray4[6] = 2;
        nArray4[7] = 1;
        nArray4[9] = 1;
        nArray4[10] = 2;
        nArray4[11] = 3;
        nArray4[12] = 2;
        nArray4[13] = 3;
        nArray4[14] = 2;
        nArray4[15] = 1;
        nArray4[17] = 1;
        nArray4[18] = 2;
        nArray4[19] = 3;
        nArray4[20] = 2;
        nArray4[21] = 3;
        nArray4[22] = 2;
        nArray4[23] = 1;
        nArrayArray2[3] = nArray4;
        int[] nArray5 = new int[32];
        nArray5[1] = 1;
        nArray5[2] = 2;
        nArray5[3] = 3;
        nArray5[4] = 2;
        nArray5[5] = 3;
        nArray5[6] = 2;
        nArray5[7] = 1;
        nArray5[9] = 1;
        nArray5[10] = 2;
        nArray5[11] = 3;
        nArray5[12] = 2;
        nArray5[13] = 3;
        nArray5[14] = 2;
        nArray5[15] = 1;
        nArray5[17] = 1;
        nArray5[18] = 2;
        nArray5[19] = 3;
        nArray5[20] = 2;
        nArray5[21] = 3;
        nArray5[22] = 2;
        nArray5[23] = 1;
        nArray5[25] = 1;
        nArray5[26] = 2;
        nArray5[27] = 3;
        nArray5[28] = 2;
        nArray5[29] = 3;
        nArray5[30] = 2;
        nArray5[31] = 1;
        nArrayArray2[4] = nArray5;
        int[] nArray6 = new int[40];
        nArray6[1] = 1;
        nArray6[2] = 2;
        nArray6[3] = 3;
        nArray6[4] = 2;
        nArray6[5] = 3;
        nArray6[6] = 2;
        nArray6[7] = 1;
        nArray6[9] = 1;
        nArray6[10] = 2;
        nArray6[11] = 3;
        nArray6[12] = 2;
        nArray6[13] = 3;
        nArray6[14] = 2;
        nArray6[15] = 1;
        nArray6[17] = 1;
        nArray6[18] = 2;
        nArray6[19] = 3;
        nArray6[20] = 2;
        nArray6[21] = 3;
        nArray6[22] = 2;
        nArray6[23] = 1;
        nArray6[25] = 1;
        nArray6[26] = 2;
        nArray6[27] = 3;
        nArray6[28] = 2;
        nArray6[29] = 3;
        nArray6[30] = 2;
        nArray6[31] = 1;
        nArray6[33] = 1;
        nArray6[34] = 2;
        nArray6[35] = 3;
        nArray6[36] = 2;
        nArray6[37] = 3;
        nArray6[38] = 2;
        nArray6[39] = 1;
        nArrayArray2[5] = nArray6;
        int[] nArray7 = new int[40];
        nArray7[1] = 1;
        nArray7[2] = 2;
        nArray7[3] = 3;
        nArray7[4] = 2;
        nArray7[5] = 3;
        nArray7[6] = 2;
        nArray7[7] = 1;
        nArray7[9] = 1;
        nArray7[10] = 2;
        nArray7[11] = 3;
        nArray7[12] = 2;
        nArray7[13] = 3;
        nArray7[14] = 2;
        nArray7[15] = 1;
        nArray7[17] = 1;
        nArray7[18] = 2;
        nArray7[19] = 3;
        nArray7[20] = 2;
        nArray7[21] = 3;
        nArray7[22] = 2;
        nArray7[23] = 1;
        nArray7[25] = 1;
        nArray7[26] = 2;
        nArray7[27] = 3;
        nArray7[28] = 2;
        nArray7[29] = 3;
        nArray7[30] = 2;
        nArray7[31] = 1;
        nArray7[33] = 1;
        nArray7[34] = 2;
        nArray7[35] = 3;
        nArray7[36] = 2;
        nArray7[37] = 3;
        nArray7[38] = 2;
        nArray7[39] = 1;
        nArrayArray2[6] = nArray7;
        x = nArrayArray2;
    }

    public le() {
        this.a(this.s, 4);
        this.a(x);
        this.d(0);
        this.b(2);
    }

    public final void a(Graphics graphics, int n, int n2) {
        super.a(graphics, n, n2);
        if (this.v != null) {
            this.v.a(graphics, this.m + (this.o - this.v.p() / 2) - this.v.p() + n, this.n + (this.p - this.v.q()) / 2 + n2 + 5);
        }
    }

    public final void k() {
        if (!this.r) {
            return;
        }
        switch (this.e) {
            case 0: {
                ++this.u;
                if (this.u != 50) break;
                this.u = 0;
                this.d(cv.a(1, 6));
                break;
            }
            default: {
                if (this.j()) {
                    this.d(0);
                }
                if (this.g != this.f[this.e].length - 5) break;
                le le2 = this;
                this.v = new as(le2.t, 4);
                le2.v.a(w);
                le2.v.d(0);
                le2.v.b(2);
                return;
            }
        }
        if (this.v != null) {
            this.v.i();
            if (this.v.j()) {
                this.v = null;
            }
        }
    }
}
