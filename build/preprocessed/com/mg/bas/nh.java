package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class nh
extends at {
    private static final int[][] a;
    private no[] b;
    private int c;
    private final Image d;

    static {
        int[][] nArrayArray = new int[1][];
        int[] nArray = new int[13];
        nArray[3] = 1;
        nArray[4] = 1;
        nArray[5] = 2;
        nArray[6] = 2;
        nArray[7] = 3;
        nArray[8] = 3;
        nArray[9] = 4;
        nArray[10] = 4;
        nArray[11] = 5;
        nArray[12] = 5;
        nArrayArray[0] = nArray;
        a = nArrayArray;
    }

    public nh(Image image) {
        this(image, 6);
    }

    private nh(Image image, int n) {
        this.d = image;
        if (image == null) {
            return;
        }
        this.o = image.getWidth() / 6;
        this.p = image.getHeight() / 9;
        this.b = new no[6];
        int n2 = 0;
        while (n2 < this.b.length) {
            this.b[n2] = new no();
            this.b[n2].a(a);
            ++n2;
        }
    }

    public final void a(int n, int n2, k k2, int n3, int n4, boolean bl) {
        if (this.d == null) {
            return;
        }
        n3 = this.d.getHeight() / 9 * n3;
        this.c = n4;
        n4 = 0;
        while (n4 < this.b.length) {
            this.b[n4].a(cv.a(a[0].length));
            this.b[n4].a(n, n2, k2, this.d, n3, this.o, this.p, bl);
            ++n4;
        }
        this.r = true;
    }

    public final void i() {
        block7: {
            block8: {
                if (!this.r) break block7;
                if (this.c > 0) {
                    --this.c;
                    return;
                }
                int n = 0;
                if (this.b == null) break block8;
                int n2 = this.b.length - 1;
                while (n2 >= 0) {
                    if (this.b[n2] != null && this.b[n2].m()) {
                        this.b[n2].i();
                    } else {
                        ++n;
                    }
                    --n2;
                }
                if (n < this.b.length) break block7;
            }
            this.r = false;
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (this.r) {
            if (this.c > 0) {
                return;
            }
            if (this.b != null) {
                n = this.b.length - 1;
                while (n >= 0) {
                    if (this.b[n] != null) {
                        this.b[n].a(graphics);
                    }
                    --n;
                }
            }
        }
    }
}
