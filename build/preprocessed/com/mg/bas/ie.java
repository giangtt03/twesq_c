package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ie
extends al
implements bf {
    private static int k;
    private static int lIndex;
    private int[] m;
    private int[] n;
    private int o = 60;
    private static int p;
    private int q = 38;
    private String r = "Vui lòng chờ...";
    private boolean s;
    private String t = "";
    private String[] u;
    private np v;
    private Image w = pc.b;
    private Image x = null;
    private int y = -1;

    static {
        p = 10;
    }

    public ie(String string) {
        this(null, string);
    }

    private ie(Image image, String string) {
        super(0);
        this.v = new np();
        this.a((ba)null);
        if (string != null) {
            this.r = string;
        }
        this.t();
    }

    private void t() {
        this.q = 30;
        if (this.s) {
            this.q = 36;
        }
        if (this.f > this.g) {
            if (this.f >= 320) {
                this.f = 320;
            }
        } else if (this.f >= 240) {
            this.f = 240;
        }
        this.f -= 20;
        this.u = bx.a(this.r, this.f - 16, bx.b);
        this.g = this.q + p + p + p + bx.c.a() * this.u.length;
        this.c = (com.mg.bas.v.t - this.f) / 2;
        this.d = (com.mg.bas.v.u - this.g - ba.a) / 2;
        int n = this.f / 2;
        int n2 = this.d + p + this.q / 2;
        int n3 = this.q / 2;
        int n4 = -90;
        this.m = new int[9];
        this.n = new int[9];
        int n5 = 0;
        while (n5 < 9) {
            this.m[n5] = n + (n3 * l.b(n4) >> 14) + this.c;
            this.n[n5] = n2 + (n3 * l.a(n4) >> 14);
            n4 += 40;
            ++n5;
        }
    }

    public final void c(Graphics graphics) {
        if (this.x != null) {
            graphics.fillRect(0, 0, com.mg.bas.v.t, com.mg.bas.v.u);
            graphics.drawImage(this.x, com.mg.bas.v.t >> 1, com.mg.bas.v.u >> 1, 3);
        } else {
            pc.a(graphics, this.c, this.d, this.f, this.g, com.mg.bas.v.aj, false);
        }
        if (this.s) {
            com.mg.sq.a.h.a(graphics, this.t, this.c + this.f / 2, this.d + p + this.q / 2 - 5, 1);
        }
        Graphics graphics2 = graphics;
        ie ie2 = this;
        int n = ie2.w.getWidth() / 3;
        int n2 = ie2.w.getHeight();
        int n3 = (lIndex - 2 + ie2.m.length) % ie2.m.length;
        int n4 = 0;
        while (n4 < 2) {
            int n5 = (n3 + n4 + ie2.m.length) % ie2.m.length;
            cw.a(graphics2, ie2.w, 0, 0, n, n2, ie2.m[n5], ie2.n[n5], 3);
            ++n4;
        }
        if (ie2.y >= 0) {
            bx.c.a(graphics2, String.valueOf(ie2.y) + "%", ie2.c + ie2.f / 2, ie2.d + (p + ie2.q) / 2, 3);
        }
        cw.a(graphics2, ie2.w, n, 0, n, n2, ie2.m[lIndex], ie2.n[lIndex], 3);
        cw.a(graphics2, ie2.w, n + n, 0, n, n2, ie2.m[k], ie2.n[k], 3);
        int n6 = 0;
        int n7 = 0;
        while (n7 < this.u.length) {
            bx.b.a(graphics, this.u[n7], this.c + this.f / 2 + 5, this.d + p + p + this.q + n6, 1);
            n6 += bx.b.a();
            ++n7;
        }
    }

    protected final void g() {
        if (this.s) {
            int n = (int)((long)this.o - this.v.g());
            if (n <= 0) {
                n = 0;
                com.mg.sq.a.s().o();
            }
            this.t = String.valueOf(n);
        }
        lIndex = k;
        k = (k + 1) % this.m.length;
    }

    public final void d(int n, int n2) {
    }

    public final void a(int n) {
        super.a(n);
        this.o = n;
    }

    public final void e(int n) {
        this.o = 30;
        this.v.a();
    }

    public final void j(boolean bl) {
        this.s = true;
        this.t();
    }
}
