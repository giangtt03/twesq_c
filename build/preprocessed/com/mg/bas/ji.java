package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class ji
extends im {
    private static final byte[][] s;
    private int[] t = new int[10];
    private static final int[][] u;

    static {
        byte[][] byArrayArray = new byte[1][];
        byte[] byArray = new byte[9];
        byArray[2] = 1;
        byArray[3] = 2;
        byArray[4] = 2;
        byArray[5] = 2;
        byArray[6] = 2;
        byArray[7] = 2;
        byArray[8] = 2;
        byArrayArray[0] = byArray;
        s = byArrayArray;
        int[][] nArrayArray = new int[5][];
        int[] nArray = new int[4];
        nArray[2] = 42;
        nArray[3] = 35;
        nArrayArray[0] = nArray;
        int[] nArray2 = new int[4];
        nArray2[1] = 35;
        nArray2[2] = 73;
        nArray2[3] = 50;
        nArrayArray[1] = nArray2;
        int[] nArray3 = new int[4];
        nArray3[1] = 85;
        nArray3[2] = 58;
        nArray3[3] = 73;
        nArrayArray[2] = nArray3;
        int[] nArray4 = new int[4];
        nArray4[1] = 158;
        nArray4[2] = 34;
        nArray4[3] = 27;
        nArrayArray[3] = nArray4;
        int[] nArray5 = new int[4];
        nArray5[1] = 185;
        nArray5[2] = 66;
        nArray5[3] = 27;
        nArrayArray[4] = nArray5;
        u = nArrayArray;
    }

    public ji() {
        mp.a().a(2004);
        this.b = mp.a().y;
        this.a(s);
        this.a(false);
        this.r = false;
    }

    public final void a(int n, int n2, int n3, int n4, int n5) {
        this.c(n, n2);
        n2 = n3 - n;
        n4 = this.t.length - 6;
        n5 = this.t.length - 4;
        while (n4 < n5) {
            this.t[n4] = n + n2 / 3;
            ++n4;
        }
        n4 = this.t.length - 4;
        n5 = this.t.length - 5;
        while (n4 < n5) {
            this.t[n4] = n + (n2 << 1) / 3;
            ++n4;
        }
        n4 = this.t.length - 5;
        n5 = this.t.length;
        while (n4 < n5) {
            this.t[n4] = n3;
            ++n4;
        }
        if (n3 > n) {
            this.c(0);
            this.j(6);
        } else {
            this.c(2);
            this.j(10);
        }
        this.a(-1);
        this.r = true;
    }

    public final void k() {
        if (this.j()) {
            this.r = false;
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.r || this.g < 0) {
            return;
        }
        n = this.f[this.e][this.g];
        if (n >= 0) {
            switch (n) {
                case 0: 
                case 1: {
                    graphics.drawRegion(this.b, u[n][0], u[n][1], u[n][2], u[n][3], this.a, this.m, this.n, this.q);
                    return;
                }
                case 2: {
                    n2 = this.t[this.g];
                    graphics.drawRegion(this.b, u[n][0], u[n][1], u[n][2], u[n][3], this.a, this.m, this.n, this.q);
                    n = Math.abs(this.m - n2) - u[2][2] - u[4][2];
                    n2 = this.m;
                    n2 = this.a == 0 ? (n2 += u[2][2]) : (n2 -= u[2][2]);
                    if (n < 0) {
                        n = 0;
                    }
                    while (n > 0) {
                        int n3 = u[3][2];
                        if (n3 > n) {
                            n3 = n;
                        }
                        graphics.drawRegion(this.b, u[3][0], u[3][1], n3, u[3][3], this.a, n2, this.n, this.q);
                        n -= n3;
                        if (this.a == 0) {
                            n2 += n3;
                            continue;
                        }
                        n2 -= n3;
                    }
                    graphics.drawRegion(this.b, u[4][0], u[4][1], u[4][2], u[4][3], this.a, n2, this.n, this.q);
                }
            }
        }
    }
}
