package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class mm
extends at {
    private Image a;
    private int b;
    private int c;
    private int d;

    public mm() {
        this.a = mp.a().e[0];
    }

    public final void b(int n, int n2, int n3) {
        this.c(n, n2);
        this.b = -1;
        this.c = n3;
    }

    public final void a() {
        this.b = 0;
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (this.b != 0) {
            n = 8;
            if (this.d >= 3) {
                ++n;
            }
            if ((this.c & 1) == 1) {
                graphics.drawRegion(this.a, 0, 0, this.a.getWidth(), this.a.getHeight(), 6, this.m - n, this.n, 10);
            }
            if ((this.c & 2) == 2) {
                graphics.drawRegion(this.a, 0, 0, this.a.getWidth(), this.a.getHeight(), 5, this.m + n, this.n, 6);
            }
            if ((this.c & 4) == 4) {
                graphics.drawRegion(this.a, 0, 0, this.a.getWidth(), this.a.getHeight(), 0, this.m, this.n - n, 33);
            }
            if ((this.c & 8) == 8) {
                graphics.drawRegion(this.a, 0, 0, this.a.getWidth(), this.a.getHeight(), 3, this.m, this.n + n, 17);
            }
        }
    }

    public final void i() {
        if (this.b != 0) {
            if (this.b > 0) {
                --this.b;
            }
            ++this.d;
            if (this.d > 6) {
                this.d = 0;
            }
        }
    }
}
