package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class jc
extends im {
    private static byte[][] s;

    static {
        byte[][] byArrayArray = new byte[1][];
        byte[] byArray = new byte[16];
        byArray[4] = 1;
        byArray[5] = 1;
        byArray[6] = 1;
        byArray[7] = 2;
        byArray[8] = 2;
        byArray[9] = 3;
        byArray[10] = 3;
        byArray[11] = 4;
        byArray[12] = 4;
        byArray[13] = 5;
        byArray[14] = 5;
        byArray[15] = 5;
        byArrayArray[0] = byArray;
        s = byArrayArray;
    }

    public jc() {
        mp.a().a(4003);
        this.a(mp.a().H, 6);
        this.a(s);
        this.a(false);
        this.j(33);
        this.r = false;
    }

    public final void a(int n, int n2, int n3, int n4, int n5) {
        if (n3 >= v.t / 2) {
            this.c(0);
        } else {
            this.c(2);
        }
        this.c(n3, n4);
        this.a(-1);
        this.b(true);
    }

    public final void k() {
        if (this.j()) {
            this.r = false;
        }
    }
}
