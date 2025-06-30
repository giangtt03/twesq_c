package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class lc
extends as {
    private static Image s = null;
    private int[][] t;
    private static Image u = null;
    private static Image v = null;
    private as w;
    private as x;
    private as y;
    private int[][] z;
    private int[][] A;
    private int[][] B;

    private lc(int n) {
        int[][] nArrayArray = new int[1][];
        int[] nArray = new int[18];
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        nArray[4] = 4;
        nArray[5] = 5;
        nArray[6] = 6;
        nArray[7] = 7;
        nArray[8] = 8;
        nArray[9] = 9;
        nArray[10] = 10;
        nArray[11] = 11;
        nArray[12] = 12;
        nArray[13] = 13;
        nArray[14] = 14;
        nArray[15] = -1;
        nArray[16] = -1;
        nArray[17] = -1;
        nArrayArray[0] = nArray;
        this.t = nArrayArray;
        this.w = null;
        this.x = null;
        this.y = null;
        int[][] nArrayArray2 = new int[15][];
        nArrayArray2[0] = new int[]{34, 23, 5, 5, 9, 31};
        nArrayArray2[1] = new int[]{34, 16, 7, 7, 5, 28};
        int[] nArray2 = new int[6];
        nArray2[0] = 32;
        nArray2[2] = 13;
        nArray2[3] = 13;
        nArray2[5] = 22;
        nArrayArray2[2] = nArray2;
        int[] nArray3 = new int[6];
        nArray3[0] = 13;
        nArray3[2] = 10;
        nArray3[3] = 14;
        nArray3[4] = 2;
        nArray3[5] = 20;
        nArrayArray2[3] = nArray3;
        int[] nArray4 = new int[6];
        nArray4[1] = 16;
        nArray4[2] = 7;
        nArray4[3] = 13;
        nArray4[4] = 4;
        nArray4[5] = 19;
        nArrayArray2[4] = nArray4;
        nArrayArray2[5] = new int[]{26, 16, 8, 12, 6, 17};
        int[] nArray5 = new int[6];
        nArray5[1] = 29;
        nArray5[2] = 13;
        nArray5[3] = 10;
        nArray5[4] = 6;
        nArray5[5] = 15;
        nArrayArray2[6] = nArray5;
        nArrayArray2[7] = new int[]{7, 16, 19, 13, 8, 11};
        int[] nArray6 = new int[6];
        nArray6[1] = 39;
        nArray6[2] = 19;
        nArray6[3] = 9;
        nArray6[4] = 11;
        nArray6[5] = 12;
        nArrayArray2[8] = nArray6;
        nArrayArray2[9] = new int[]{19, 39, 18, 6, 15, 13};
        nArrayArray2[10] = new int[]{27, 29, 16, 7, 20, 11};
        nArrayArray2[11] = new int[]{13, 29, 14, 10, 25, 7};
        int[] nArray7 = new int[6];
        nArray7[2] = 13;
        nArray7[3] = 16;
        nArray7[4] = 29;
        nArrayArray2[12] = nArray7;
        int[] nArray8 = new int[6];
        nArray8[0] = 23;
        nArray8[2] = 9;
        nArray8[3] = 14;
        nArray8[4] = 30;
        nArrayArray2[13] = nArray8;
        nArrayArray2[14] = new int[]{41, 16, 4, 7, 32, 4};
        this.z = nArrayArray2;
        int[][] nArrayArray3 = new int[15][];
        nArrayArray3[0] = new int[]{35, 39, 5, 5, 9, 31};
        nArrayArray3[1] = new int[]{27, 29, 7, 7, 5, 28};
        int[] nArray9 = new int[6];
        nArray9[1] = 16;
        nArray9[2] = 13;
        nArray9[3] = 13;
        nArray9[5] = 22;
        nArrayArray3[2] = nArray9;
        int[] nArray10 = new int[6];
        nArray10[0] = 13;
        nArray10[2] = 10;
        nArray10[3] = 14;
        nArray10[4] = 2;
        nArray10[5] = 20;
        nArrayArray3[3] = nArray10;
        int[] nArray11 = new int[6];
        nArray11[0] = 32;
        nArray11[2] = 7;
        nArray11[3] = 13;
        nArray11[4] = 4;
        nArray11[5] = 19;
        nArrayArray3[4] = nArray11;
        nArrayArray3[5] = new int[]{32, 16, 8, 12, 6, 17};
        int[] nArray12 = new int[6];
        nArray12[1] = 29;
        nArray12[2] = 13;
        nArray12[3] = 10;
        nArray12[4] = 6;
        nArray12[5] = 15;
        nArrayArray3[6] = nArray12;
        nArrayArray3[7] = new int[]{13, 16, 19, 13, 8, 11};
        int[] nArray13 = new int[6];
        nArray13[1] = 39;
        nArray13[2] = 19;
        nArray13[3] = 9;
        nArray13[4] = 11;
        nArray13[5] = 12;
        nArrayArray3[8] = nArray13;
        int[] nArray14 = new int[6];
        nArray14[1] = 48;
        nArray14[2] = 18;
        nArray14[3] = 6;
        nArray14[4] = 15;
        nArray14[5] = 13;
        nArrayArray3[9] = nArray14;
        nArrayArray3[10] = new int[]{19, 39, 16, 7, 20, 11};
        nArrayArray3[11] = new int[]{13, 29, 14, 10, 25, 7};
        int[] nArray15 = new int[6];
        nArray15[2] = 13;
        nArray15[3] = 16;
        nArray15[4] = 29;
        nArrayArray3[12] = nArray15;
        int[] nArray16 = new int[6];
        nArray16[0] = 23;
        nArray16[2] = 9;
        nArray16[3] = 14;
        nArray16[4] = 30;
        nArrayArray3[13] = nArray16;
        nArrayArray3[14] = new int[]{34, 29, 4, 7, 32, 4};
        this.A = nArrayArray3;
        int[][] nArrayArray4 = new int[15][];
        int[] nArray17 = new int[6];
        nArray17[0] = 78;
        nArray17[2] = 5;
        nArray17[3] = 5;
        nArray17[4] = 9;
        nArray17[5] = 35;
        nArrayArray4[0] = nArray17;
        int[] nArray18 = new int[6];
        nArray18[1] = 85;
        nArray18[2] = 29;
        nArray18[3] = 10;
        nArray18[4] = 5;
        nArray18[5] = 29;
        nArrayArray4[1] = nArray18;
        int[] nArray19 = new int[6];
        nArray19[1] = 71;
        nArray19[2] = 38;
        nArray19[3] = 14;
        nArray19[5] = 25;
        nArrayArray4[2] = nArray19;
        int[] nArray20 = new int[6];
        nArray20[2] = 40;
        nArray20[3] = 20;
        nArray20[4] = 2;
        nArray20[5] = 18;
        nArrayArray4[3] = nArray20;
        int[] nArray21 = new int[6];
        nArray21[0] = 40;
        nArray21[2] = 34;
        nArray21[3] = 20;
        nArray21[4] = 4;
        nArray21[5] = 16;
        nArrayArray4[4] = nArray21;
        nArrayArray4[5] = new int[]{38, 20, 30, 17, 6, 16};
        nArrayArray4[6] = new int[]{35, 40, 30, 15, 6, 14};
        int[] nArray22 = new int[6];
        nArray22[1] = 56;
        nArray22[2] = 26;
        nArray22[3] = 15;
        nArray22[4] = 8;
        nArray22[5] = 13;
        nArrayArray4[7] = nArray22;
        nArrayArray4[8] = new int[]{68, 20, 20, 15, 10, 10};
        nArrayArray4[9] = new int[]{60, 56, 26, 13, 7, 10};
        nArrayArray4[10] = new int[]{38, 71, 31, 13, 5, 9};
        int[] nArray23 = new int[6];
        nArray23[1] = 40;
        nArray23[2] = 35;
        nArray23[3] = 16;
        nArray23[4] = 4;
        nArray23[5] = 5;
        nArrayArray4[11] = nArray23;
        int[] nArray24 = new int[6];
        nArray24[1] = 20;
        nArray24[2] = 38;
        nArray24[3] = 20;
        nArray24[4] = 4;
        nArrayArray4[12] = nArray24;
        nArrayArray4[13] = new int[]{26, 56, 34, 15, 5, 3};
        int[] nArray25 = new int[6];
        nArray25[0] = 74;
        nArray25[2] = 4;
        nArray25[3] = 7;
        nArray25[4] = 32;
        nArray25[5] = 8;
        nArrayArray4[14] = nArray25;
        this.B = nArrayArray4;
        if (n == 1) {
            if (s == null) {
                s = com.mg.bas.f.d("/aura1");
            }
            this.w = new as(s, this.z);
            this.w.h(45);
            this.w.i(50);
            this.w.a(this.t);
            this.w.d(0);
            this.w.b(2);
            return;
        }
        if (n == 2) {
            if (u == null) {
                u = com.mg.bas.f.d("/aura2");
            }
            this.x = new as(u, this.A);
            this.x.h(40);
            this.x.i(55);
            this.x.a(this.t);
            this.x.d(0);
            this.x.b(2);
            return;
        }
        if (n == 3) {
            if (v == null) {
                v = com.mg.bas.f.d("/aura3");
            }
            this.y = new as(v, this.B);
            this.y.h(88);
            this.y.i(95);
            this.y.a(this.t);
            this.y.d(0);
            this.y.b(2);
            return;
        }
        if (n == 4) {
            if (v == null) {
                v = com.mg.bas.f.d("/aura3");
            }
            this.y = new as(v, this.B);
            this.y.h(88);
            this.y.i(95);
            this.y.a(this.t);
            this.y.d(0);
            this.y.b(2);
            if (u == null) {
                u = com.mg.bas.f.d("/aura2");
            }
            this.x = new as(u, this.A);
            this.x.h(40);
            this.x.i(55);
            this.x.a(this.t);
            this.x.d(0);
            this.x.b(2);
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (this.y != null) {
            this.y.a(graphics, n, n2);
        }
        if (this.w != null) {
            this.w.a(graphics, n, n2);
        }
        if (this.x != null) {
            this.x.a(graphics, n, n2);
        }
    }

    public final void k() {
        if (this.y != null) {
            this.y.i();
        }
        if (this.w != null) {
            this.w.i();
        }
        if (this.x != null) {
            this.x.i();
        }
    }

    public static lc a(lh lh2) {
        if (lh2.c() > 0) {
            return new lc(lh2.c());
        }
        return null;
    }
}
