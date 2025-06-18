package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class jb
extends im {
    private static byte[][] s;

    static {
        byte[][] byArrayArray = new byte[2][];
        byte[] byArray = new byte[7];
        byArray[2] = 1;
        byArray[3] = 1;
        byArray[4] = 2;
        byArray[5] = 2;
        byArray[6] = 2;
        byArrayArray[0] = byArray;
        byArrayArray[1] = new byte[]{3, 3, 4, 4, 5, 5, 6, 6};
        s = byArrayArray;
    }

    public jb() {
        mp.a().a(4002);
        this.a(mp.a().G, 7);
        this.a(false);
        this.a(s);
        this.b(false);
    }

    public final void a(int n, int n2, int n3, int n4, int n5) {
        if (n < n3) {
            this.c(0);
            n += 26;
            this.j(10);
        } else {
            this.c(2);
            n -= 26;
            this.j(6);
        }
        this.d(0);
        this.c(n, n2);
        this.b(n3, n4);
        this.j = Math.abs(n3 - n) / 6;
        this.b(true);
    }

    public final void k() {
        if (this.e == 0) {
            if (this.e(this.h, this.j)) {
                this.d(1);
                return;
            }
        } else if (this.j()) {
            this.b(false);
        }
    }
}
