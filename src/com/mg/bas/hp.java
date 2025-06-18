package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class hp
extends al {
    private int k = 54;
    private int l = 53;
    private int m = 5;
    private int n = 4;
    private int o = 0;
    private int p = -1;
    private int q;
    private byte r;

    public final void e(int n) {
        this.p = n;
    }

    public final void f(int n) {
        this.o = n;
    }

    public final String t() {
        return p.i[this.o];
    }

    public final void u() {
        this.p = -1;
        this.o = 0;
        this.o();
    }

    public final int v() {
        return this.o;
    }

    public hp(byte by) {
        super(1);
        this.r = by;
        if (by == 2) {
            this.q = 20;
            this.b(999999223);
        } else {
            this.q = 28;
            this.b(241224);
            this.k = 35;
            this.l = 30;
            this.m = 6;
            p.h();
        }
        if (v.t > v.u) {
            this.n = by == 2 ? 5 : 7;
        }
        this.f = this.n * this.k + this.m + this.m;
        this.g = this.q / this.n * this.l + this.m + this.m;
        this.c = (v.t - this.f) / 2;
        this.d = (v.u - this.g - ba.a) / 2;
        this.a(new ba());
        gb gb2 = new gb(-8881, 2);
        hp hp2 = this;
        hp2.a(gb2, true);
        gb2 = new gb(-8882, 3);
        hp2 = this;
        hp2.b(gb2, true);
        this.a(com.mg.sq.a.n);
    }

    public final void c(int n2) {
        if (n2 == 95) {
            if (this.i != null) {
                this.p = this.o;
                this.i.d(this.h(), -8881);
            }
        } else if (n2 == 97) {
            --this.o;
            if (this.o < 0) {
                this.o = this.q - 1;
            }
            this.e(true);
        } else if (n2 == 96) {
            ++this.o;
            if (this.o >= this.q) {
                this.o = 0;
            }
            this.e(true);
        } else if (n2 == 99) {
            this.o = (this.o - this.n + this.q) % this.q;
            this.e(true);
        } else if (n2 == 98) {
            this.o = (this.o + this.n) % this.q;
            this.e(true);
        }
        this.w();
    }

    public final void w() {
        if (this.o == this.p && this.r == 2) {
            this.a(new bd("Hủy", -8883));
            return;
        }
        this.o();
    }

    public final void a(int n2, int n3) {
        int n4 = this.a() + this.m;
        int n5 = this.c() + this.m;
        int n6 = 0;
        while (n6 < this.q) {
            int n7 = n4 + n6 % this.n * this.k;
            int n8 = n5 + n6 / this.n * this.l;
            if (n2 >= n7 && n2 <= n7 + this.k && n3 >= n8 && n3 <= n8 + this.l) {
                if (this.o == n6) {
                    if (this.o == this.p && this.r == 2) {
                        if (this.i == null) break;
                        this.i.d(this.h(), -8883);
                        return;
                    }
                    this.c(95);
                    return;
                }
                this.o = n6;
                this.e(true);
                this.w();
                return;
            }
            ++n6;
        }
    }

    public final void c(Graphics graphics) {
        if (this.r == 2) {
            graphics.setColor(0xF0FBFF);
            graphics.fillRect(this.c, this.d, this.f, this.g);
            int n2 = this.c + this.m + this.k / 2;
            int n3 = this.d + this.m + this.l / 2;
            int n4 = n2 + this.o % this.n * this.k - oy.c[this.o] / 2;
            int n5 = n3 + this.o / this.n * this.l - oy.d[this.o] / 2;
            graphics.setColor(16177368);
            graphics.fillRect(n4, n5, oy.c[this.o] + 2, oy.d[this.o] + 2);
            pc.a(graphics, n4 - 1, n5, oy.c[this.o] + 2, oy.d[this.o] + 1, 0xFBB5B5, -1);
            cw.b(graphics, 0xF88989, n4 - 2, n5 - 1, oy.c[this.o] + 4, oy.d[this.o] + 3);
            n4 = 0;
            while (n4 < this.q) {
                oy.a(graphics, n4, n2 + n4 % this.n * this.k, n3 + n4 / this.n * this.l, 3);
                ++n4;
            }
            pc.d(graphics, this.c, this.d, this.f, this.g, -1);
            return;
        }
        pc.d(graphics, this.c, this.d, this.f, this.g, 0xF0FBFF);
        int n6 = this.c + this.m + this.k / 2;
        int n7 = this.d + this.m + this.l / 2;
        int n8 = n6 + this.o % this.n * this.k + p.o[this.o] - p.l[this.o] / 2 - 1;
        int n9 = n7 + this.o / this.n * this.l + p.n[this.o] - p.m[this.o] / 2 - 1;
        graphics.setColor(16177368);
        graphics.fillRect(n8, n9, p.l[this.o] + 2, p.m[this.o] + 2);
        pc.a(graphics, n8, n9, p.l[this.o] + 2, p.m[this.o] + 2, 0xFBB5B5, -1);
        cw.b(graphics, 0xF88989, n8 - 1, n9 - 1, p.l[this.o] + 4, p.m[this.o] + 4);
        n8 = 0;
        while (n8 < 28) {
            cw.a(graphics, p.p, p.j[n8], p.k[n8], p.l[n8], p.m[n8], n6 + n8 % this.n * this.k + p.o[n8], n7 + n8 / this.n * this.l + p.n[n8], 3);
            ++n8;
        }
    }
}
