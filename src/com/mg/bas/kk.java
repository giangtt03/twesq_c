package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class kk
extends kg {
    private gj j;
    private int k;
    private int s = 3;
    private boolean t = false;
    private String[] u = null;
    public boolean i = false;
    private boolean v = false;
    private int w = 0;

    public kk(Image image, jm jm2, int n) {
        super(image, 1);
        this.d = jm2;
        this.i();
        this.m = jm2.d + (jm2.f - this.o) / 2;
        this.n = jm2.e + 16 + jm2.g - this.p;
        this.b(jm2.b);
        this.k = bx.c.a() * this.s + 20;
    }

    protected final void a(String string) {
        int n = bx.c.a(string);
        int n2 = bx.c.a();
        this.b = this.p;
        if (this.a == null) {
            this.a = Image.createImage((int)n, (int)n2);
            Graphics graphics = this.a.getGraphics();
            graphics.setColor(0xFF0000);
            graphics.fillRect(0, 0, n, n2);
            bx.c.a(graphics, string, 0, 0, 0);
            this.a = ki.a(this.a, 0xFF0000);
        }
    }

    public final void a(int n) {
        super.a(n);
    }

    public final void a(Graphics graphics, int n, int n2) {
        super.a(graphics, n, n2);
        if (this.a != null) {
            graphics.drawImage(this.a, this.m + this.o / 2 + n, this.n + n2, 33);
        }
        if (!this.g && this.v) {
            graphics.drawImage(pc.c, this.m + this.o / 2 + n, this.n + 15 + n2, 33);
        }
    }

    public final void b(Graphics graphics, int n, int n2) {
        if (this.j != null) {
            this.j.a(graphics, n, n2);
        }
    }

    public final void c(int n, int n2) {
        super.c(n, n2);
        this.m = n - this.o / 2;
        this.n = n2 - this.p;
    }

    public final void i() {
        if (this.j != null) {
            this.j.i();
        }
        ++this.w;
        if (this.v) {
            if (this.w >= 40) {
                this.v = false;
                this.w = 0;
            }
        } else if (this.w == 200) {
            this.v = true;
            this.w = 0;
        }
        if (this.g) {
            --this.h;
            if (this.h < 0) {
                this.h = 0;
                this.g = false;
            }
        }
    }

    public final void d() {
        this.j = null;
        this.t = false;
        om.p = false;
    }
}
