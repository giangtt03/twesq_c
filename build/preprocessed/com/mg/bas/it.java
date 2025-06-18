package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class it
extends im {
    private static byte[][] s;
    private int t;

    static {
        byte[][] byArrayArray = new byte[2][];
        byArrayArray[0] = new byte[]{-1};
        byte[] byArray = new byte[11];
        byArray[2] = 1;
        byArray[3] = 1;
        byArray[4] = 2;
        byArray[5] = 2;
        byArray[6] = 3;
        byArray[7] = 3;
        byArray[8] = 4;
        byArray[9] = 4;
        byArray[10] = 4;
        byArrayArray[1] = byArray;
        s = byArrayArray;
    }

    public it() {
        mp.a().a(1001);
        this.a(mp.a().m, 5);
        this.a(s);
        this.r = false;
        this.j(3);
    }

    public final void a(int n, int n2, int n3, int n4, int n5) {
        this.c(n, n2);
        this.g = 0;
        if (n5 <= 0) {
            this.d(1);
        } else {
            this.d(0);
        }
        this.r = true;
        this.t = n5;
    }

    public final void k() {
        if (this.t > 0) {
            --this.t;
            if (this.t == 0) {
                this.d(1);
            }
        }
        if (this.e == 1 && this.j()) {
            this.r = false;
        }
    }
}
