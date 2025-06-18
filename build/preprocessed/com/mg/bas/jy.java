package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class jy
extends kg {
    public jy(Image image, jm jm2, int n) {
        super(image, 1);
        this.d = jm2;
        if (jm2.d / 32 < oa.c.e / 2) {
            this.a(0);
        } else {
            this.a(1);
        }
        this.b(jm2.b);
        this.m = this.c == 0 ? 0 : n - this.o;
        this.n = jm2.e + (jm2.g - this.p) / 2;
    }

    protected final void a(String string) {
        int n = bx.b.a(string);
        int n2 = 1 + n / 32;
        this.o = n2 << 5;
        --n2;
        if (this.o <= 32) {
            this.o += 32;
        }
        this.p = 32;
        if (this.a == null) {
            int n3;
            int n4 = 0;
            this.a = Image.createImage((int)this.o, (int)32);
            Graphics graphics = this.a.getGraphics();
            graphics.setColor(65280);
            graphics.fillRect(0, 0, this.o, 32);
            if (this.c == 1) {
                graphics.drawRegion(this.f, 32, 0, 32, 32, 0, this.o, 0, 24);
                graphics.drawRegion(this.f, 0, 0, 32, 32, 0, 0, 0, 20);
                n3 = 0;
                this.m = this.m - this.o + 32;
            } else {
                n4 = 2;
                graphics.drawRegion(this.f, 32, 0, 32, 32, 2, 0, 0, 20);
                graphics.drawRegion(this.f, 0, 0, 32, 32, 2, this.o, 0, 24);
                n3 = 32;
            }
            int n5 = 0;
            while (n5 < n2) {
                graphics.drawRegion(this.f, 0, 0, 32, 32, n4, n3, 0, 20);
                n3 += 32;
                ++n5;
            }
            bx.b.a(graphics, string, this.o >> 1, 5, 1);
            this.a = ki.a(this.a, 65280);
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (this.a != null) {
            graphics.drawImage(this.a, this.m + n, this.n + n2, this.q);
        }
    }

    public final void c(int n, int n2) {
        super.c(n, n2);
    }
}
