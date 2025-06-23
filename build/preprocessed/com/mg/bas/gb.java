package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class gb
extends az {
    public static byte[][] e;
    private int g;
    public static Image f;
    private static boolean h;

    static {
        byte[][] byArrayArray = new byte[4][];
        byte[] byArray = new byte[4];
        byArray[2] = 14;
        byArray[3] = 16;
        byArrayArray[0] = byArray;
        byte[] byArray2 = new byte[4];
        byArray2[0] = 14;
        byArray2[2] = 16;
        byArray2[3] = 16;
        byArrayArray[1] = byArray2;
        byte[] byArray3 = new byte[4];
        byArray3[0] = 30;
        byArray3[2] = 14;
        byArray3[3] = 16;
        byArrayArray[2] = byArray3;
        byte[] byArray4 = new byte[4];
        byArray4[0] = 44;
        byArray4[2] = 14;
        byArray4[3] = 16;
        byArrayArray[3] = byArray4;
        e = byArrayArray;
        f = com.mg.bas.f.d("/skicon");
        h = false;
    }

    public gb(int n2, int n3) {
        super(n2);
        if (v.z && !h) {
            f = com.mg.bas.g.a(f, f.getWidth() + 16, 18);
            byte[][] byArrayArray = new byte[4][];
            byte[] byArray = new byte[4];
            byArray[2] = 18;
            byArray[3] = 18;
            byArrayArray[0] = byArray;
            byte[] byArray2 = new byte[4];
            byArray2[0] = 18;
            byArray2[2] = 20;
            byArray2[3] = 18;
            byArrayArray[1] = byArray2;
            byte[] byArray3 = new byte[4];
            byArray3[0] = 38;
            byArray3[2] = 18;
            byArray3[3] = 18;
            byArrayArray[2] = byArray3;
            byte[] byArray4 = new byte[4];
            byArray4[0] = 56;
            byArray4[2] = 18;
            byArray4[3] = 18;
            byArrayArray[3] = byArray4;
            e = byArrayArray;
            h = true;
            ig.a = com.mg.bas.g.a(ig.a, ig.a.getWidth(), ba.a);
        }
        this.c = e[n3][2];
        this.g = n3;
    }

    public final void a(Graphics graphics) {
        if (this.d > 0) {
            cw.a(graphics, f, (int)e[this.g][0], (int)e[this.g][1], (int)e[this.g][2], (int)e[this.g][3], this.a, this.b, 0);
            return;
        }
        cw.a(graphics, f, (int)e[this.g][0], (int)e[this.g][1], (int)e[this.g][2], (int)e[this.g][3], this.a, this.b - 1, 0);
    }
}
