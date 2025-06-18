package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class jd
extends iv {
    private static int[][] t;
    private static byte[][] u;

    static {
        int[][] nArrayArray = new int[3][];
        int[] nArray = new int[6];
        nArray[0] = 142;
        nArray[2] = 52;
        nArray[3] = 24;
        nArray[4] = 45;
        nArray[5] = 17;
        nArrayArray[0] = nArray;
        nArrayArray[1] = new int[]{142, 24, 75, 28, 33, 15};
        int[] nArray2 = new int[6];
        nArray2[2] = 142;
        nArray2[3] = 58;
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

    public jd() {
        mp.a().a(4005);
        this.a(mp.a().J, t);
        this.a(u);
        this.o = 142;
        this.p = 58;
        this.s = new lp[6];
        int n = 0;
        while (n < this.s.length) {
            this.s[n] = new lp(2);
            ++n;
        }
        this.r = false;
        this.a(false);
    }
}
