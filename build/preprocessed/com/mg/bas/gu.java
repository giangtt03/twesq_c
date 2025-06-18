package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class gu
extends al
implements bf {
    private dc k;
    private int l = 1;
    private k m;
    private Image n = f.d("/info/increase");
    private Image o = f.d("/info/decrease");
    private int p = 0;
    private int q = 0;
    private int r = 50;
    private boolean s = false;

    public gu(dc object) {
        super(1);
        bd bd2;
        this.k = object;
        object = (lm)((dc)object).k;
        this.a(this);
        this.f = 200;
        this.g = 100;
        this.c = (v.t - this.f) / 2;
        this.d = (v.u - this.g) / 2;
        this.b(241213);
        this.a(new ba());
        this.m = new k(bx.d.a("Số lượng:   "), 0, 20, 18);
        this.q = this.p = (int)(((lm)object).h / 1000L);
        if (go.s < ((lm)object).h) {
            bd2 = null;
            object = this;
            ((am)object).a(bd2, true);
        } else {
            bd2 = new bd("Mua", 0);
            object = this;
            ((am)object).a(bd2, true);
        }
        bd2 = new bd("Hủy", 0);
        object = this;
        ((am)object).b(bd2, true);
    }

    public final void c(Graphics graphics) {
        pc.a(graphics, this.c, this.d, this.f, this.g, v.aj, false);
        int n = this.c + 10;
        int n2 = this.d + 10;
        this.k.a(graphics, n, n2);
        bx.d.c(true);
        bx.d.a(graphics, ((lm)this.k.k).b, n + this.k.e() + 5, n2, 0);
        bx.d.c(false);
        n = this.c + 10;
        bx.d.b(true);
        bx.d.a(graphics, "Số lượng: ", n, n2 += this.k.f() + 3, 0);
        bx.d.b(false);
        if (this.s) {
            n += 55;
        } else {
            pc.b(graphics, n, this.m.b + (n2 += bx.d.a() + 3), this.m.c, this.m.d, 1070484, 16579764, 14542575);
        }
        bx.d.a(graphics, "" + this.l, n + 3, n2 + 2, 0);
        n += this.m.c;
        if (this.l < this.r) {
            graphics.drawImage(this.n, n + 3, n2 + this.m.d / 2, 36);
        }
        if (this.l > 1) {
            graphics.drawImage(this.o, n + 3, n2 + this.m.d / 2, 20);
        }
        if (!this.s) {
            bx.d.a(graphics, " x " + this.p + ".000 KEN = " + this.q + ".000 KEN", n += this.o.getWidth() + 3, n2, 0);
            n = this.c + 10;
            com.mg.sq.a.g.a(graphics, "Ken của bạn: " + go.s + " KEN", n, n2 += bx.d.a() + 10, 0);
        }
    }

    protected final void g() {
        super.g();
    }

    public final void d(int n, int n2) {
        switch (n2) {
            case 0: {
                ag.b().a(this.h(), false);
                return;
            }
        }
        ag.b().a(this.h(), false);
    }

    public final void c(int n) {
        switch (n) {
            case 99: {
                if (this.l >= this.r) {
                    return;
                }
                gu gu2 = this;
                if (gu2.s) {
                    ++this.l;
                    return;
                }
                int n2 = this.l + 1;
                long l = (long)n2 * ((lm)this.k.k).h;
                if (l > go.s) break;
                this.l = n2;
                this.q = this.p * this.l;
                return;
            }
            case 98: {
                if (this.l <= 1) break;
                --this.l;
                gu gu3 = this;
                if (!gu3.s) break;
                this.q = this.p * this.l;
            }
        }
    }

    public final void a(int n, int n2) {
        if (this.l < this.r && new k(this.c + 88, this.d + 42, 12, 12).a(n, n2)) {
            this.c(99);
            return;
        }
        if (this.l > 1 && new k(this.c + 88, this.d + 54, 12, 12).a(n, n2)) {
            this.c(98);
        }
    }

    public final void e(int n) {
        this.r = n;
    }

    public final lm t() {
        return (lm)this.k.k;
    }

    public final int u() {
        return this.l;
    }

    public final void j(boolean bl) {
        this.s = true;
        this.g = 80;
        this.m.b = 80;
    }
}
