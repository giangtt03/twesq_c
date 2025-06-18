package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public class ix
extends im {
    private static final byte[][] s;
    private static final int[][] t;
    private int u = 0;

    static {
        byte[][] byArrayArray = new byte[2][];
        byte[] byArray = new byte[12];
        byArray[2] = 1;
        byArray[3] = 1;
        byArray[4] = 2;
        byArray[5] = 2;
        byArray[6] = 3;
        byArray[7] = 3;
        byArray[8] = 3;
        byArray[9] = 4;
        byArray[10] = 4;
        byArray[11] = 4;
        byArrayArray[0] = byArray;
        byArrayArray[1] = new byte[]{-1};
        s = byArrayArray;
        int[][] nArrayArray = new int[5][];
        nArrayArray[0] = new int[]{190, 99, 82, 27, 11, 99};
        int[] nArray = new int[6];
        nArray[0] = 103;
        nArray[2] = 87;
        nArray[3] = 105;
        nArray[4] = 8;
        nArray[5] = 19;
        nArrayArray[1] = nArray;
        int[] nArray2 = new int[6];
        nArray2[2] = 103;
        nArray2[3] = 126;
        nArrayArray[2] = nArray2;
        int[] nArray3 = new int[6];
        nArray3[0] = 190;
        nArray3[2] = 75;
        nArray3[3] = 99;
        nArray3[4] = 14;
        nArray3[5] = 25;
        nArrayArray[3] = nArray3;
        int[] nArray4 = new int[6];
        nArray4[0] = 265;
        nArray4[2] = 52;
        nArray4[3] = 94;
        nArray4[4] = 26;
        nArray4[5] = 29;
        nArrayArray[4] = nArray4;
        t = nArrayArray;
    }

    public ix() {
        this.a(false);
        this.a(s);
        mp.a().a(1007);
        this.a(mp.a().s, t);
        this.o = 103;
        this.p = 126;
    }

    public final void a(int n, int n2, int n3, int n4, int n5) {
        if (n5 > 0) {
            this.d(1);
        } else {
            this.d(0);
        }
        this.u = n5;
        this.g = 0;
        this.k = 1;
        this.c(n - this.o / 2, n2 - this.p);
        this.r = true;
    }

    public final void k() {
        if (this.u > 0) {
            --this.u;
            return;
        }
        if (this.e == 1) {
            this.d(0);
            return;
        }
        if (this.j()) {
            this.r = false;
        }
    }
}
