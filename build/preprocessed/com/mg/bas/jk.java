package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class jk
extends im {
    private static final byte[][] s;
    private static final int[][] t;
    private static final int[][] u;
    private as v;
    private int w;

    static {
        byte[][] byArrayArray = new byte[2][];
        byte[] byArray = new byte[13];
        byArray[2] = 1;
        byArray[3] = 1;
        byArray[4] = 2;
        byArray[5] = 2;
        byArray[6] = 3;
        byArray[7] = 3;
        byArray[8] = 4;
        byArray[9] = 4;
        byArray[10] = 5;
        byArray[11] = 5;
        byArray[12] = 5;
        byArrayArray[0] = byArray;
        byArrayArray[1] = new byte[]{-1};
        s = byArrayArray;
        int[][] nArrayArray = new int[6][];
        int[] nArray = new int[6];
        nArray[2] = 21;
        nArray[3] = 173;
        nArray[4] = 7;
        nArrayArray[0] = nArray;
        int[] nArray2 = new int[6];
        nArray2[0] = 21;
        nArray2[2] = 28;
        nArray2[3] = 168;
        nArray2[4] = 3;
        nArrayArray[1] = nArray2;
        int[] nArray3 = new int[6];
        nArray3[0] = 49;
        nArray3[2] = 35;
        nArray3[3] = 176;
        nArrayArray[2] = nArray3;
        int[] nArray4 = new int[6];
        nArray4[0] = 84;
        nArray4[2] = 22;
        nArray4[3] = 176;
        nArray4[4] = 6;
        nArrayArray[3] = nArray4;
        int[] nArray5 = new int[6];
        nArray5[0] = 106;
        nArray5[2] = 22;
        nArray5[3] = 176;
        nArray5[4] = 6;
        nArrayArray[4] = nArray5;
        int[] nArray6 = new int[6];
        nArray6[0] = 128;
        nArray6[2] = 27;
        nArray6[3] = 176;
        nArray6[4] = 4;
        nArrayArray[5] = nArray6;
        t = nArrayArray;
        int[][] nArrayArray2 = new int[6][];
        int[] nArray7 = new int[6];
        nArray7[0] = 155;
        nArray7[2] = 10;
        nArray7[3] = 25;
        nArray7[4] = 13;
        nArrayArray2[0] = nArray7;
        int[] nArray8 = new int[6];
        nArray8[0] = 165;
        nArray8[2] = 11;
        nArray8[3] = 43;
        nArray8[4] = -2;
        nArrayArray2[1] = nArray8;
        int[] nArray9 = new int[6];
        nArray9[0] = 155;
        nArray9[1] = 43;
        nArray9[2] = 87;
        nArray9[3] = 52;
        nArray9[4] = -8;
        nArrayArray2[2] = nArray9;
        int[] nArray10 = new int[6];
        nArray10[0] = 91;
        nArray10[1] = 176;
        nArray10[2] = 115;
        nArray10[3] = 55;
        nArray10[4] = -3;
        nArrayArray2[3] = nArray10;
        int[] nArray11 = new int[6];
        nArray11[0] = 155;
        nArray11[1] = 95;
        nArray11[2] = 103;
        nArray11[3] = 47;
        nArrayArray2[4] = nArray11;
        int[] nArray12 = new int[6];
        nArray12[1] = 176;
        nArray12[2] = 91;
        nArray12[3] = 55;
        nArray12[4] = -4;
        nArrayArray2[5] = nArray12;
        u = nArrayArray2;
    }

    public jk() {
        mp.a().a(2007);
        this.a(mp.a().B, t);
        this.a(s);
        this.j(33);
        this.h(35);
        this.i(176);
        this.v = new as();
        this.v.a(mp.a().B, u);
        this.v.a(s);
        this.v.j(17);
        this.v.i(55);
        this.v.d(1);
        this.v.b(false);
    }

    public final void a(int n, int n2, int n3, int n4, int n5) {
        this.c(n, n2 -= this.v.q() / 2);
        this.v.c(n, n2);
        this.w = n5;
        if (n5 <= 0) {
            this.d(0);
        } else {
            this.d(1);
        }
        this.b(true);
    }

    public final void d(int n) {
        super.d(n);
        this.v.d(n);
    }

    public final void b(boolean bl) {
        super.b(bl);
        this.v.b(bl);
    }

    public final void k() {
        if (this.w > 0) {
            --this.w;
            if (this.w == 0) {
                this.d(0);
            }
        }
        if (this.e == 0 && this.j()) {
            this.b(false);
        }
        this.v.i();
        if (!this.v.m() || this.v.f() < 0) {
            return;
        }
        byte by = s[this.v.h()][this.v.f()];
        if (by >= 0) {
            this.v.h(u[by][2]);
            this.h(t[by][2]);
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        super.a(graphics, n, n2);
        this.v.a(graphics, n, n2);
    }
}
