package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class kf
extends kb {
    private Image b;
    private byte[][] c;
    private byte[][] d;
    private byte e = (byte)32;
    private byte f = (byte)32;
    private int g = 0;
    private int h = 0;
    private int i = 0;

    public kf(Image image, byte[][] byArray, byte by, byte by2) {
        Object object = image;
        kf kf2 = this;
        this.b = object;
        object = byArray;
        kf2 = this;
        this.c = (byte[][])object;
        kf2.g = ((Image)object).length;
        kf2.h = ((Image)object[0]).length;
        this.i = image.getWidth() / 32;
        this.p = byArray.length * this.e;
        this.o = byArray[0].length * this.e;
    }

    public final void a(k k2) {
        super.a(k2);
        this.c(k2.a, k2.b);
    }

    public final void a(Graphics graphics) {
    }

    public final void a(Graphics graphics, int n, int n2, k k2) {
        int n3;
        int n4;
        int n5 = k2.a / this.e - 1;
        if (n5 < 0) {
            n5 = 0;
        }
        if ((n4 = k2.b / this.f - 1) < 0) {
            n4 = 0;
        }
        n3 = (n3 = (k2.a + k2.c) / this.e + 1) > this.h ? this.h : n3;
        int n6 = (k2.b + k2.d) / this.f + 1;
        n6 = n6 > this.g ? this.g : n6;
        int n7 = n4;
        while (n7 < n6) {
            int n8 = n5;
            while (n8 < n3) {
                n4 = (this.c[n7][n8] & 0xFF) - 1;
                if (n4 >= 0) {
                    cw.a(graphics, this.b, n4 % this.i * this.e, n4 / this.i * this.f, (int)this.e, (int)this.f, n8 * this.e + n, n7 * this.f + n2, 0);
                }
                ++n8;
            }
            ++n7;
        }
    }

    public final void i() {
    }

    public final void a(Graphics graphics, int n, int n2) {
    }

    public final byte b(int n, int n2) {
        if (this.d == null || n2 < 0 || n < 0 || n >= this.g || n2 >= this.h) {
            return 0;
        }
        return this.d[n][n2];
    }

    public final void a(byte[][] byArray) {
        this.d = byArray;
    }

    public final void b() {
        this.c = null;
        this.d = null;
        this.b = null;
    }
}
