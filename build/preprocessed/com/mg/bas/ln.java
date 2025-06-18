package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class ln
extends as {
    private static byte[][] s;
    private static int[] t;
    private static int[] u;

    static {
        byte[][] byArrayArray = new byte[1][];
        byte[] byArray = new byte[8];
        byArray[2] = 1;
        byArray[3] = 1;
        byArray[4] = 2;
        byArray[5] = 2;
        byArray[6] = 3;
        byArray[7] = 3;
        byArrayArray[0] = byArray;
        s = byArrayArray;
        int[] nArray = new int[8];
        nArray[4] = 3;
        nArray[5] = 3;
        nArray[6] = 3;
        nArray[7] = 3;
        t = nArray;
        int[] nArray2 = new int[8];
        nArray2[0] = -1;
        nArray2[1] = -2;
        nArray2[2] = -3;
        nArray2[3] = -4;
        nArray2[4] = -3;
        nArray2[5] = -2;
        nArray2[6] = -1;
        u = nArray2;
    }

    public ln() {
        this.a(f.d("/magicgate"), 4);
        this.a(s);
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (this.g < 0) {
            return;
        }
        this.c(t[this.g]);
        super.a(graphics, n, n2);
    }
}
