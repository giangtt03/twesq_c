package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class ka
extends as {
    private byte s = 0;
    public ll v;
    public int w = 1;

    public ka(Image image, int n) {
        this.b = image;
        this.c = n;
        this.o = image.getWidth() / n;
        this.p = image.getHeight();
    }

    public final void a(byte[][] byArray, int n) {
        this.a(byArray);
        this.d = new int[4][];
        int n2 = 0;
        while (n2 < 4) {
            this.d[n2] = new int[byArray[n2].length];
            int n3 = 0;
            while (n3 < byArray[n2].length) {
                this.d[n2][n3] = n * byArray[n2][n3];
                ++n3;
            }
            ++n2;
        }
    }

    public void a(Graphics graphics, int n, int n2) {
        if (!this.r) {
            return;
        }
        if (this.b == null || this.d == null) {
            return;
        }
        cw.a(graphics, this.b, this.d[this.e][this.g], 0, this.o, this.p, this.m + n, this.n + n2, 20);
    }

    public final void b(byte by) {
        this.s = 1;
    }

    public final byte r() {
        return this.s;
    }

    public void a(byte by) {
    }
}
