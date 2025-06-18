package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class ja
extends im {
    private static final byte[][] s;

    static {
        byte[][] byArrayArray = new byte[1][];
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
        s = byArrayArray;
    }

    public ja() {
        mp.a().a(4001);
        this.a(mp.a().F, 6);
        this.j(33);
        this.a(s);
        this.a(false);
    }

    public final void a(int n, int n2, int n3, int n4, int n5) {
        this.c(n, n2);
        this.a(-1);
        this.b(true);
    }

    public final void k() {
        if (this.j()) {
            this.b(false);
        }
    }
}
