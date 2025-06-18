package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class in
extends as {
    private static int[][] s;
    private static int[][] t;

    static {
        int[][] nArrayArray = new int[4][];
        int[] nArray = new int[6];
        nArray[2] = 95;
        nArray[3] = 11;
        nArray[5] = 54;
        nArrayArray[0] = nArray;
        int[] nArray2 = new int[6];
        nArray2[1] = 11;
        nArray2[2] = 95;
        nArray2[3] = 19;
        nArray2[5] = 43;
        nArrayArray[1] = nArray2;
        int[] nArray3 = new int[6];
        nArray3[1] = 30;
        nArray3[2] = 95;
        nArray3[3] = 43;
        nArray3[5] = 17;
        nArrayArray[2] = nArray3;
        int[] nArray4 = new int[6];
        nArray4[1] = 73;
        nArray4[2] = 95;
        nArray4[3] = 34;
        nArray4[5] = 7;
        nArrayArray[3] = nArray4;
        s = nArrayArray;
        int[][] nArrayArray2 = new int[1][];
        int[] nArray5 = new int[9];
        nArray5[2] = 1;
        nArray5[3] = 1;
        nArray5[4] = 2;
        nArray5[5] = 2;
        nArray5[6] = 3;
        nArray5[7] = 3;
        nArray5[8] = 3;
        nArrayArray2[0] = nArray5;
        t = nArrayArray2;
    }

    public in(int n) {
        switch (n) {
            case 0: {
                mp.a().c();
                this.a(mp.a().n, s);
                break;
            }
            case 1: {
                mp.a().d();
                this.a(mp.a().z, s);
                break;
            }
            case 2: {
                mp.a().e();
                this.a(mp.a().I, s);
            }
        }
        this.a(t);
        this.j(33);
        this.a(false);
        this.r = false;
        this.o = 95;
        this.p = 62;
    }

    public final void r() {
        this.r = true;
        this.a(-1);
    }

    public final void k() {
        if (this.j()) {
            this.r = false;
        }
    }
}
