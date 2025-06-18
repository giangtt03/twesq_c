package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class md
extends mg {
    static final byte[][] s = new byte[][]{new byte[3], {1, 2, 3, 1, 2, 3}};

    public md(Image[] imageArray, int[][] nArray, int[][] nArray2, g g2) {
        super(imageArray, nArray, nArray2, g2);
    }

    public final void d(int n) {
        super.d(n);
    }

    public final void s() {
        ++this.g;
        if (this.g >= this.f[this.e].length) {
            this.g = 0;
        }
    }

    public final void t() {
        --this.g;
        if (this.g < 0) {
            this.g = this.f[this.e].length - 1;
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.r || this.g < 0) {
            return;
        }
        if (this.e == 1) {
            n -= 5;
        }
        super.a(graphics, n + (this.a == 2 ? 10 : 0), n2);
    }
}
