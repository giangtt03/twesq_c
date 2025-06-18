package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class iw
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

    public iw() {
        mp.a().a(1006);
        this.s = mp.a().q;
        this.t = mp.a().r;
        this.a(x);
        this.r = false;
        this.v = 1;
        this.w = 4;
    }

    public final void j(int n) {
        this.q = 33;
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (this.u > 0 || !this.r) {
            return;
        }
        int n3 = this.f[this.e][this.g];
        if (this.e == 1 && n3 != 3) {
            graphics.drawRegion(this.b, n3 * this.o, 0, this.o, this.p, 0, this.m + n, this.n + n2, 36);
            graphics.drawRegion(this.b, n3 * this.o, 0, this.o, this.p, 2, this.m + n, this.n + n2, 40);
            return;
        }
        super.a(graphics, n, n2);
    }
}
