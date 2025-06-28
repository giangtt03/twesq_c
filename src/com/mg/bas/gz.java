package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class gz
extends al
implements b,
bf {
    private lh k;
    private Image[] l;
    private Image[] m;
    private k[] n;
    private int o;
    private int p;
    private int[] q;
    private int[][] r;
    private int s = 0;
    private String[][] t;
    private String u;
    private lv[] v;
    private bf w;
    private int x = 6;
    private boolean y = false;

    public gz(lh object) {
        super(1);
        int n2;
        Object object2;
        int n3;
        this.b(241205);
        this.a(new ba());
        this.a(this);
        this.k = object;
        // this.v = (lv[])g.a(this.k.E, this); 
        this.l = new Image[this.v.length];
        this.m = new Image[this.v.length];
        int n4 = 0;
        while (n4 < this.l.length) {
            int n5 = n3 = this.v[n4].a * 1000;
            object2 = pa.a();
            byte[] byArray = ((pa)object2).b(n5, false);
            this.l[n4] = Image.createImage(byArray, 0, byArray.length);
            // h.a(byArray); 
            this.m[n4] = Image.createImage(byArray, 0, byArray.length);
            ++n4;
        }
        this.o = this.l[0].getWidth();
        this.p = this.l[0].getHeight();
        int n6 = this.k.E.length;
        this.t = new String[n6][0];
        this.n = new k[n6];
        n4 = 3;
        if (com.mg.sq.a.k == 1) {
            if (com.mg.bas.v.t >= 320) {
                this.f = 300;
            }
            n4 = 5;
        } else if (com.mg.bas.v.t >= 240) {
            this.f = 220;
        }
        n3 = (this.f - n4 * this.o) / 3 / (n4 - 1);
        n4 = n4 > n6 ? n6 : n4;
        int n7 = n6 / n4 + (n6 % n4 != 0 ? 1 : 0);
        int n8 = this.o * n4 + n3 * (n4 - 1);
        n8 = (this.f - n8) / 2;
        int n9 = 0;
        while (n9 < n7) {
            int n10 = 0;
            while (n10 < n4) {
                n2 = n9 * n4 + n10;
                if (n2 >= n6) break;
                this.n[n2] = new k((n3 + this.o) * n10 + n8, (5 + this.p) * n9 + 10, this.o, this.p);
                int n11 = -1;
                int n12 = 0;
                while (n12 < go.r.length) {
                    object2 = this.v[n2];
                    if (go.r[n12].a == ((ld)object2).a) {
                        n11 = n12;
                        break;
                    }
                    ++n12;
                }
                if (n11 >= 0) {
                    this.t[n2] = bx.a(go.r[n11].c[this.v[n2].f - 1].e, this.f - 10 - 10);
                }
                ++n10;
            }
            ++n9;
        }
        n3 = this.n.length;
        gz gz2 = this;
        this.r = new int[n3][4];
        n2 = 0;
        while (n2 < n7) {
            n9 = 0;
            while (n9 < n4) {
                n8 = n2 * n4 + n9;
                if (n8 >= n3) break;
                int[] nArray = new int[4];
                nArray[0] = n8 < n3 - 1 ? n8 + 1 : -1;
                int n13 = nArray[1] = n8 > 0 ? n8 - 1 : -1;
                nArray[2] = n2 < n7 - 1 ? (n8 + n4 >= n3 ? n3 - 1 : n8 + n4) : -1;
                nArray[3] = n2 > 0 ? n8 - n4 : -1;
                gz2.r[n8] = nArray;
                ++n9;
            }
            ++n2;
        }
        this.q = new int[]{10, this.n[this.n.length - 1].b + this.n[this.n.length - 1].d + 10};
        this.g = this.q[1] + 10 + 5 + bx.d.a() * this.x;
        this.c = (com.mg.bas.v.t - this.f) / 2;
        this.d = (com.mg.bas.v.u - this.g - ba.a) / 2;
        this.e(this.s);
        bd bd2 = new bd("Đóng", 0);
        object2 = this;
        ((am)object2).b(bd2, true);
        this.c(true);
        this.b(true);
    }

    public final void b(bf bf2) {
        this.w = bf2;
        this.s = 0;
        this.e(this.s);
        ag.b().a(this, false);
    }

    public final void c(Graphics graphics) {
        pc.d(graphics, this.c, this.d, this.f, this.g, com.mg.bas.v.aj);
        int n2 = 0;
        while (n2 < this.n.length) {
            graphics.fillRect(this.n[n2].a + this.c, this.n[n2].b + this.d, this.n[n2].c, this.n[n2].d);
            Image image = this.k.u >= this.v[n2].e ? this.l[n2] : this.m[n2];
            graphics.drawImage(image, this.n[n2].a + this.c, this.n[n2].b + this.d, 0);
            ++n2;
        }
        pc.a(graphics, this.q[0] + this.c, this.q[1] + this.d, this.f - 10 - 10);
        n2 = this.q[1] + this.d + 5;
        if (this.u != null) {
            bx.d.c(true);
            bx.d.a(graphics, this.u, this.q[0] + this.c, n2, 0);
            bx.d.c(false);
        }
        if (this.t[this.s] != null) {
            bx.a(graphics, bx.c, this.t[this.s], this.q[0] + this.c, n2 += bx.d.a() + 2, this.f, this.g, 0);
        }
        pc.e(graphics, this.n[this.s].a - 4 + this.c, this.n[this.s].b - 4 + this.d, this.n[this.s].c + 8, this.n[this.s].d + 8, 1);
    }

    public final void d(int n2, int n3) {
        switch (n3) {
            case 0: {
                ag.b().a(this.h(), false);
                return;
            }
        }
        gz gz2 = this;
        if (gz2.k.u >= gz2.v[gz2.s].e) {
            if (gz2.w != null) {
                gz2.w.d(gz2.v[gz2.s].a, 999999);
            }
            ag.b().a(gz2.h(), false);
        }
    }

    public final void c(int n2) {
        switch (n2) {
            case 96: 
            case 97: 
            case 98: 
            case 99: {
                int n3 = n2 - 96;
                gz gz2 = this;
                if (n3 < 0) break;
                gz2.s = gz2.r[gz2.s][n3] >= 0 ? gz2.r[gz2.s][n3] : gz2.s;
                gz2.e(gz2.s);
            }
        }
    }

    public final void a(int n2, int n3) {
        n2 -= this.c;
        n3 -= this.d;
        int n4 = 0;
        while (n4 < this.v.length) {
            if (this.n[n4].a(n2, n3)) {
                if (this.s != n4) {
                    this.s = n4;
                    this.e(this.s);
                    return;
                }
                this.d(-1, 1);
                return;
            }
            ++n4;
        }
    }

    private void e(int n2) {
        int n3 = 0;
        int n4 = 0;
        while (n4 < go.r.length) {
            if (go.r[n4].a == this.v[n2].a) {
                n3 = n4;
                break;
            }
            ++n4;
        }
        this.u = go.r[n3].b;
        if (go.r[n3].c[0].e != null) {
            if (this.t[n2].length > this.x) {
                this.g = (this.t[n2].length - this.x) * bx.d.a();
                this.d = (com.mg.bas.v.u - this.g - ba.a) / 2;
                this.y = true;
            } else if (this.y) {
                this.y = false;
                this.g = this.q[1] + 10 + 5 + bx.d.a() * this.x;
                this.d = (com.mg.bas.v.u - this.g - ba.a) / 2;
            }
        }
        if (this.k.u >= this.v[n2].e) {
            bd bd2 = new bd("Dùng", 1);
            gz gz2 = this;
            gz2.a(bd2, true);
            this.a(new bd("", 1));
            return;
        }
        az az2 = null;
        gz gz3 = this;
        gz3.a(az2, true);
        this.a((az)null);
    }

    public final int a(Object object, Object object2) {
        if (object instanceof lv) {
            object = (lv)object;
            object2 = (lv)object2;
            return ((lv)object).e - ((lv)object2).e;
        }
        object = (lw)object;
        object2 = (lw)object2;
        return ((lw)object).a - ((lw)object2).a;
    }
}
