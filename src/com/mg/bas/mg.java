package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class mg
extends as {
    public static final int[][] u;
    public static final int[][] v;
    public static final int[][] w;
    public static final int[][] x;
    public static final int[][] y;
    public static final int[][] z;
    private Image[] s = null;
    private int[][] t;
    private int[][] A;
    private lc B;
    private nr C;

    static {
        int[][] nArrayArray = new int[2][];
        int[] nArray = new int[18];
        nArray[10] = 1;
        nArray[11] = 1;
        nArray[12] = 1;
        nArray[13] = 1;
        nArray[14] = 1;
        nArray[15] = 1;
        nArray[16] = 1;
        nArray[17] = 1;
        nArrayArray[0] = nArray;
        nArrayArray[1] = new int[]{1};
        u = nArrayArray;
        int[][] nArrayArray2 = new int[2][];
        int[] nArray2 = new int[9];
        nArray2[2] = 1;
        nArray2[3] = 1;
        nArray2[4] = 2;
        nArray2[5] = 2;
        nArray2[6] = 3;
        nArray2[7] = 3;
        nArray2[8] = 3;
        nArrayArray2[0] = nArray2;
        int[] nArray3 = new int[9];
        nArray3[2] = 1;
        nArray3[3] = 1;
        nArray3[4] = 2;
        nArray3[5] = 2;
        nArray3[6] = 3;
        nArray3[7] = 3;
        nArray3[8] = 3;
        nArrayArray2[1] = nArray3;
        v = nArrayArray2;
        int[][] nArrayArray3 = new int[2][];
        int[] nArray4 = new int[18];
        nArray4[3] = 1;
        nArray4[4] = 1;
        nArray4[5] = 1;
        nArray4[6] = 2;
        nArray4[7] = 2;
        nArray4[8] = 2;
        nArray4[9] = 3;
        nArray4[10] = 3;
        nArray4[11] = 3;
        nArray4[12] = 4;
        nArray4[13] = 4;
        nArray4[14] = 4;
        nArray4[15] = 5;
        nArray4[16] = 5;
        nArray4[17] = 5;
        nArrayArray3[0] = nArray4;
        nArrayArray3[1] = new int[1];
        w = nArrayArray3;
        x = new int[][]{new int[9], new int[9]};
        y = new int[][]{new int[1], new int[1]};
        z = new int[][]{new int[5], new int[5]};
    }

    public mg(Image[] object, int[][] nArray, int[][] nArray2, g g2) {
        this.s = object;
        object = this;
        this.t = nArray;
        nArray = nArray2;
        object = this;
        this.A = nArray;
        this.h(g2.a);
        this.i(g2.b);
    }

    public void r() {
        this.g = 0;
    }

    public final void j(int n2) {
        super.j(n2);
    }

    public final boolean j() {
        return this.g >= this.f[this.e].length - 1;
    }

    public void k() {
    }

    public void a(Graphics graphics, int n2, int n3) {
        if (!this.r || this.g < 0) {
            return;
        }
        n2 += this.m;
        n3 += this.n;
        if (this.s != null) {
            int n4;
            if (this.C != null) {
                this.C.k();
                this.C.c(this.a);
                this.C.a(graphics, n2, n3);
            }
            int n5 = this.f[this.e][this.g];
            int n6 = n4 = (this.q & 0x20) != 0 ? 1 : 0;
            if (this.a == 0) {
                graphics.drawRegion(this.s[n5], 0, 0, this.s[n5].getWidth(), this.s[n5].getHeight(), 0, n2 + this.t[n5][0], n3 + this.A[n5][n4], this.q);
            } else {
                graphics.drawRegion(this.s[n5], 0, 0, this.s[n5].getWidth(), this.s[n5].getHeight(), 2, n2 + this.t[n5][1], n3 + this.A[n5][n4], this.q);
            }
            if (this.B != null) {
                this.B.k();
                if (this.a == 2) {
                    this.B.a(graphics, n2 + 3, n3 + this.s[n5].getHeight() / 3);
                    return;
                }
                this.B.a(graphics, n2 + 13, n3 + this.s[n5].getHeight() / 3);
            }
        }
    }

    public final void a(nr nr2) {
        this.C = nr2;
    }

    public final void a(lc lc2) {
        this.B = lc2;
    }

    public final mg u() {
        mg mg2 = new mg(this.s, this.t, this.A, new g(this.o, this.p));
        lc lc2 = this.B;
        mg mg3 = mg2;
        mg2.B = lc2;
        mg2.a(this.f);
        return mg2;
    }
}
