package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// UI component for displaying and managing emoticons and related images in the game.
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class p
extends n {
    public static final String[] i = new String[]{":-)", ":-P", ">:D<", ":))", ":\">", "B-)", ":-X", ":-*", ":-|", ":-D", ";-)", "I-)", "(:|", ":-/", ":-<", ":-&", ":-(", ":-B", ":-O", ":-h", ":-S", ":-?", ":((", "=((", "=;", ":-W", "X-(", ">:)", "<3", "(y)", "(n)", "@;-", "(*)"};
    public static final int[] j;
    public static final int[] k;
    public static final int[] l;
    public static final int[] m;
    public static final int[] n;
    public static final int[] o;
    private int q;
    public static Image p;

    static {
        int[] nArray = new int[33];
        nArray[1] = 20;
        nArray[2] = 40;
        nArray[3] = 81;
        nArray[4] = 101;
        nArray[5] = 121;
        nArray[6] = 143;
        nArray[7] = 166;
        nArray[8] = 186;
        nArray[9] = 206;
        nArray[10] = 226;
        nArray[11] = 247;
        nArray[12] = 272;
        nArray[13] = 292;
        nArray[14] = 319;
        nArray[15] = 339;
        nArray[16] = 362;
        nArray[17] = 382;
        nArray[18] = 409;
        nArray[19] = 431;
        nArray[20] = 453;
        nArray[21] = 473;
        nArray[22] = 497;
        nArray[23] = 526;
        nArray[24] = 557;
        nArray[25] = 581;
        nArray[26] = 606;
        nArray[27] = 628;
        nArray[28] = 650;
        nArray[29] = 670;
        nArray[30] = 692;
        nArray[31] = 714;
        nArray[32] = 736;
        j = nArray;
        k = new int[33];
        l = new int[]{20, 20, 41, 20, 20, 22, 23, 20, 20, 20, 21, 25, 20, 27, 20, 23, 20, 27, 22, 22, 20, 24, 29, 31, 24, 25, 22, 22, 20, 22, 22, 22, 19};
        m = new int[]{20, 20, 20, 21, 20, 20, 20, 20, 20, 22, 21, 21, 21, 20, 20, 20, 20, 20, 20, 20, 20, 22, 20, 22, 20, 20, 21, 22, 20, 22, 22, 20, 20};
        int[] nArray2 = new int[33];
        nArray2[0] = 2;
        nArray2[1] = 2;
        nArray2[2] = 2;
        nArray2[3] = 1;
        nArray2[4] = 2;
        nArray2[5] = 2;
        nArray2[6] = 2;
        nArray2[7] = 2;
        nArray2[8] = 2;
        nArray2[10] = 1;
        nArray2[11] = 1;
        nArray2[12] = 1;
        nArray2[13] = 2;
        nArray2[14] = 2;
        nArray2[15] = 2;
        nArray2[16] = 2;
        nArray2[17] = 2;
        nArray2[18] = 2;
        nArray2[19] = 2;
        nArray2[20] = 2;
        nArray2[21] = 1;
        nArray2[22] = 2;
        nArray2[23] = 1;
        nArray2[24] = 2;
        nArray2[25] = 2;
        nArray2[26] = 1;
        nArray2[27] = 1;
        nArray2[28] = 2;
        nArray2[31] = 2;
        nArray2[32] = 1;
        n = nArray2;
        int[] nArray3 = new int[33];
        nArray3[3] = -1;
        nArray3[6] = 1;
        nArray3[7] = -1;
        nArray3[10] = -1;
        nArray3[11] = 1;
        nArray3[13] = 3;
        nArray3[15] = -2;
        nArray3[17] = 2;
        nArray3[19] = -2;
        nArray3[21] = 2;
        nArray3[23] = 3;
        nArray3[24] = 1;
        nArray3[25] = 1;
        nArray3[27] = -1;
        nArray3[29] = 1;
        nArray3[30] = 1;
        nArray3[32] = -1;
        o = nArray3;
    }

    public static void h() {
        if (p == null) {
            p = com.mg.bas.f.d("/smileys");
        }
    }

    public static void i() {
        p = null;
    }

    public p(int n2, String string, int n3, int n4, int n5, int n6, int n7) {
        this.g = string;
        this.q = n2;
        this.a = n3;
        this.f = n4;
        this.b = n5;
        this.c = n6;
        this.d = n7;
        com.mg.bas.p.h();
    }

    public final void a(Graphics graphics, int n2, int n3) {
        if (p != null) {
            int n4 = n3 + this.c + (this.e - m[this.q]) / 2;
            n3 = n2 + this.b;
            n2 = this.q;
            if (p != null) {
                graphics.drawRegion(p, j[n2], k[n2], l[n2], m[n2], 0, n3, n4, 0);
            }
        }
    }
}
