package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class jt
extends at {
    private Image a;
    private k b;
    private k c;
    private int d = 0;
    private int e = 0;
    private int[] f = new int[]{7930113, 12386818, 13894146, 0xFD0D0D, 12911106, 10289666, 9372162};
    private int[] g = new int[]{2193665, 3456258, 3855362, 5111053, 3589378, 2858242, 2592514};

    public jt(lh lh2) {
        this.b = new k(3, 2, 87, 8);
        this.c = new k(3, 12, 87, 8);
        this.a = f.d("/info/gauge");
        this.a(lh2);
        this.h(this.a.getWidth());
        this.i(this.a.getHeight());
    }

    public final void a(Graphics graphics, int n, int n2) {
        graphics.drawImage(this.a, n, n2, 0);
        pc.a(graphics, this.b, this.d, this.f, n, n2);
        pc.a(graphics, this.c, this.e, this.g, n, n2);
    }

    public final void i() {
    }

    public final void a(lh lh2) {
        this.d = lh2.s * (this.b.c - 2) / lh2.r;
        int n = lh2.J - lh2.M;
        int n2 = lh2.N - lh2.M;
        this.e = n * (this.c.c - 2) / n2;
        if (this.e > this.c.c) {
            this.e = this.c.c - 2;
        }
        if (this.d > this.b.c) {
            this.d = this.b.c - 2;
        }
    }
}
