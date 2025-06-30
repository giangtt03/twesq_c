package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// Represents a UI or game element with state and rendering logic, possibly a score or status display, extending as.
import javax.microedition.lcdui.Graphics;

public final class db
extends as {
    private int s = 0;
    private static final int[][] t;

    static {
        int[][] nArrayArray = new int[2][];
        nArrayArray[0] = new int[2];
        int[] nArray = new int[3];
        nArray[1] = 1;
        nArray[2] = 2;
        nArrayArray[1] = nArray;
        t = nArrayArray;
    }

    public db() {
        int n = 30098;
        pa pa2 = pa.a();
        byte[] arr = pa2.b(n, false);
        byte[][] arr2d = new byte[1][];
        arr2d[0] = arr;
        this.a(arr2d);
        this.a(t);
        this.d(0);
        this.g = 0;
    }

    public final void l(int n) {
        this.s = n;
    }

    public final int r() {
        return this.s;
    }

    public final void a(Graphics graphics, int n, int n2) {
        cw.a(graphics, this.b, this.f[this.e][this.g] * this.o, 0, this.o, this.p, this.m + n, this.n + n2, 36);
        if (this.e == 0) {
            bx.c.a(graphics, String.valueOf(this.s), this.m + this.o + n, this.n - 15 + n2, 2);
        }
    }
}
