package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class lj
extends as {
    private static int[][] s;

    static {
        int[][] nArrayArray = new int[1][];
        int[] nArray = new int[6];
        nArray[2] = 1;
        nArray[3] = 1;
        nArray[4] = 2;
        nArray[5] = 2;
        nArrayArray[0] = nArray;
        s = nArrayArray;
    }

    public lj() {
        this.a(mp.a().j, 3);
        this.a(s);
        this.j(33);
        this.a(false);
        this.r = false;
    }

    public final void d(int n, int n2) {
        this.c(n, n2);
        this.r = true;
        this.a(0);
    }

    public final void k() {
        if (this.j()) {
            this.r = false;
        }
    }
}
