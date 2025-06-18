package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ig
extends ap {
    private final Image b = f.d("/corner/3");
    public static Image a;
    private final Image c;

    public ig() {
        a = f.d("/corner/cornerskb");
        this.c = f.d("/corner/1");
    }

    public final az a(int n) {
        return new gb(-90000, 0);
    }

    public final az b(int n) {
        return new gb(-90001, 2);
    }

    public final az c(int n) {
        return new gb(-90002, 3);
    }

    public final void b(Graphics graphics, int n, int n2, int n3, int n4) {
        graphics.setColor(3236863);
        graphics.drawRect(n, n2, n3 - 1, n4 - 1);
        graphics.setColor(0xFBFBFB);
        graphics.drawRect(n + 1, n2 + 1, n3 - 3, n4 - 3);
        graphics.setColor(16512242);
        graphics.fillRect(n + 2, n2 + 2, n3 - 4, n4 - 4);
        graphics.setColor(3968767);
        graphics.drawRect(n + 2, n2 + 2, n3 - 5, n4 - 5);
        cw.a(graphics, this.b, 0, 2, 8, 8, n, n2, 0);
        graphics.drawRegion(this.b, 0, 2, 8, 8, 6, n, n2 + n4, 36);
        graphics.drawRegion(this.b, 0, 2, 8, 8, 1, n, n2 + n4, 36);
        graphics.drawRegion(this.b, 0, 2, 8, 8, 5, n + n3, n2, 24);
        graphics.drawRegion(this.b, 0, 2, 8, 8, 3, n + n3, n2 + n4, 40);
    }

    public final void c(Graphics graphics, int n, int n2, int n3, int n4) {
        n4 = a.getHeight();
        int n5 = n3 - 18 + 1;
        int n6 = n + 9;
        int n7 = 35;
        while (n5 > 0) {
            if (n7 > n5) {
                n7 = n5;
            }
            graphics.drawRegion(a, 9, 0, n7, n4, 0, n6, n2, 0);
            n5 -= n7;
            n6 += n7;
        }
        graphics.drawRegion(a, 0, 0, 9, n4, 0, n, n2, 0);
        graphics.drawRegion(a, 0, 0, 9, n4, 2, n + n3 - 9, n2, 0);
    }

    public final void d(Graphics graphics, int n, int n2, int n3, int n4) {
        n4 = this.c.getHeight();
        int n5 = n3 - 18 + 1;
        int n6 = n + 9;
        int n7 = 35;
        while (n5 > 0) {
            if (n7 > n5) {
                n7 = n5;
            }
            graphics.drawRegion(this.c, 9, 0, n7, n4, 0, n6, n2, 0);
            n5 -= n7;
            n6 += n7;
        }
        graphics.drawRegion(this.c, 0, 0, 9, n4, 0, n, n2, 0);
        graphics.drawRegion(this.c, 0, 0, 9, n4, 2, n + n3, n2, 24);
    }
}
