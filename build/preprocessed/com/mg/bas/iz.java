package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public class iz
extends is {
    private static byte[][] x;

    static {
        byte[][] byArrayArray = new byte[2][];
        byArrayArray[0] = new byte[1];
        byte[] byArray = new byte[7];
        byArray[2] = 1;
        byArray[3] = 1;
        byArray[4] = 2;
        byArray[5] = 2;
        byArray[6] = 2;
        byArrayArray[1] = byArray;
        x = byArrayArray;
    }

    public iz() {
        mp.a().a(4000);
        this.s = mp.a().D;
        this.t = mp.a().E;
        this.a(x);
        this.r = false;
        this.v = 1;
        this.w = 3;
    }

    public final void d(int n) {
        super.d(n);
        if (n == 1) {
            this.j(3);
        }
    }
}
