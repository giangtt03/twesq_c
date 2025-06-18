package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class je
extends iz {
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

    public je() {
        mp.a().a(4006);
        this.s = mp.a().K;
        this.t = mp.a().L;
        this.a(x);
        this.r = false;
        this.v = 1;
        this.w = 3;
    }
}
