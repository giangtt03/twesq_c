package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class jf
extends ix {
    private static final byte[][] s;
    private static final int[][] t;

    static {
        byte[][] byArrayArray = new byte[2][];
        byte[] byArray = new byte[13];
        byArray[2] = 1;
        byArray[3] = 1;
        byArray[4] = 1;
        byArray[5] = 2;
        byArray[6] = 2;
        byArray[7] = 3;
        byArray[8] = 3;
        byArray[9] = 3;
        byArray[10] = 4;
        byArray[11] = 4;
        byArray[12] = 4;
        byArrayArray[0] = byArray;
        byArrayArray[1] = new byte[]{-1};
        s = byArrayArray;
        int[][] nArrayArray = new int[5][];
        nArrayArray[0] = new int[]{132, 95, 28, 31, 52, 51};
        int[] nArray = new int[6];
        nArray[0] = 260;
        nArray[2] = 63;
        nArray[3] = 73;
        nArray[4] = 34;
        nArray[5] = 30;
        nArrayArray[1] = nArray;
        nArrayArray[2] = new int[]{260, 73, 63, 74, 34, 29};
        int[] nArray2 = new int[6];
        nArray2[0] = 132;
        nArray2[2] = 128;
        nArray2[3] = 95;
        nArray2[4] = 2;
        nArray2[5] = 19;
        nArrayArray[3] = nArray2;
        int[] nArray3 = new int[6];
        nArray3[2] = 132;
        nArray3[3] = 133;
        nArrayArray[4] = nArray3;
        t = nArrayArray;
    }

    public jf() {
        this.a(false);
        this.a(s);
        mp.a().a(4007);
        this.a(mp.a().M, t);
        this.o = 132;
        this.p = 133;
    }
}
