package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class jh
extends is {
    private static byte[][] x;

    static {
        byte[][] byArrayArray = new byte[2][];
        byArrayArray[0] = new byte[1];
        byte[] byArray = new byte[9];
        byArray[2] = 1;
        byArray[3] = 1;
        byArray[4] = 2;
        byArray[5] = 2;
        byArray[6] = 3;
        byArray[7] = 3;
        byArray[8] = 3;
        byArrayArray[1] = byArray;
        x = byArrayArray;
    }

    public jh() {
        mp.a().a(2003);
        this.s = mp.a().w;
        this.t = mp.a().x;
        this.a(x);
        this.r = false;
        this.v = 1;
        this.w = 4;
    }
}
