package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fu
extends ex {
    private int k;
    private Image l;
    private k m;
    private int n;
    private int o;
    private String[] p;
    private int q = 16177368;
    private int r = 0xFBB5B5;
    private int s = 0xF88989;
    private int t = -1;

    public fu(Image image, int n) {
        super("", n);
        this.l = image;
        this.k = n;
        this.e(20);
    }

    public final void a(int n, int n2, int n3, int n4) {
        super.a(n, n2, n3, n4);
        if (this.l == null) {
            this.p = bx.a("Thêm Kul", this.e() - 6);
        }
    }

    public final void a(String string) {
        this.p = bx.a(string, this.e() - 6);
    }

    public final void b(int n, int n2, int n3, int n4) {
        this.m = new k(n, n2, n3, n4);
    }

    public final void a(Image image) {
        this.l = image;
    }

    public final void a(int n, int n2, int n3) {
        this.q = 22523;
        this.r = 9287679;
        this.s = 22523;
    }

    public final void a(Graphics graphics, int n, int n2) {
        int n3;
        int n4;
        n += this.c();
        n2 += this.d();
        if (this.g) {
            n4 = n;
            n3 = n2;
            int n5 = this.f();
            int n6 = this.e();
            graphics.setColor(this.q);
            graphics.fillRect(n4, n3, n6, n5);
            pc.a(graphics, n4 - 1, n3 - 1, n6 + 2, n5 + 2, this.r, -1);
            cw.b(graphics, this.s, n4 - 2, n3 - 2, n6 + 4, n5 + 4);
        }
        if (this.l == null) {
            if (!this.g) {
                graphics.setColor(10659250);
                graphics.fillRect(n, n2, this.e(), this.f());
                graphics.setColor(0xD2D0D2);
                graphics.drawRect(n, n2, this.e(), this.f());
                graphics.drawRect(n - 1, n2 - 1, this.e() + 2, this.f() + 2);
            }
            if (this.p != null) {
                n4 = 10;
                n3 = 0;
                while (n3 < this.p.length) {
                    bx.d.a(graphics, this.p[n3], n + this.e() / 2, n2 + n4, 1);
                    n4 += bx.d.a();
                    ++n3;
                }
                return;
            }
        } else {
            try {
                cw.a(graphics, this.l, this.m.a, this.m.b, this.m.c, this.m.d, n, n2, 20);
                return;
            }
            catch (Exception exception) {
                ct.a("[pictureButon] error in  draw method " + this.m);
            }
        }
    }

    public final int a() {
        return this.k;
    }

    public final void n() {
        ++this.o;
        if (this.o > 5) {
            this.n = -this.n;
            this.o = 0;
        }
    }

    public final int r() {
        return this.t;
    }

    public final void h(int n) {
        this.t = n;
    }

    public final String toString() {
        fu fu2 = this;
        return "PictureButton " + fu2.k + "   " + this.j;
    }
}
