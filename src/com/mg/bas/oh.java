package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

final class oh
extends aq
implements bu {
    private k[] i;
    private short[][] j;
    private short[][] k;
    private Image l;
    private short m;
    private int n;
    private cu o;
    private Image p;
    private d q;
    private Image r;
    private og s;

    public oh(og og2) {
        this.s = og2;
        this.j = new short[][]{{183, 399}, {405, 311}, {26, 432}, {408, 236}, {206, 261}, {304, 220}, {350, 184}, {183, 216}, {80, 181}, {256, 119}, {367, 116}, {229, 100}, {58, 119}, {16, 91}, {34, 317}, {402, 170}, {166, 59}};
        this.k = new short[][]{{149, 363}, {389, 345}, {15, 408}, {411, 266}, {243, 289}, {305, 247}, {341, 161}, {214, 192}, {77, 203}, {284, 150}, {374, 90}, {245, 90}, {84, 93}, {23, 65}, {30, 297}, {414, 155}, {190, 39}};
        this.m = (short)5;
        this.n = -1987;
        ct.b("WorldrMap");
        this.i = new k[17];
        this.i[0] = new k(146, 342, 61, 48);
        this.i[1] = new k(381, 319, 62, 48);
        this.i[2] = new k(9, 386, 64, 48);
        this.i[3] = new k(407, 245, 65, 47);
        this.i[4] = new k(236, 271, 64, 44);
        this.i[5] = new k(300, 227, 63, 44);
        this.i[6] = new k(332, 142, 62, 48);
        this.i[7] = new k(173, 169, 64, 48);
        this.i[8] = new k(68, 185, 62, 48);
        this.i[9] = new k(242, 128, 62, 48);
        this.i[10] = new k(369, 70, 64, 44);
        this.i[11] = new k(229, 74, 63, 45);
        this.i[12] = new k(84, 73, 63, 47);
        this.i[13] = new k(18, 38, 62, 48);
        this.i[14] = new k(34, 271, 52, 46);
        this.i[15] = new k(391, 131, 66, 44);
        this.i[16] = new k(157, 27, 71, 26);
        this.o = new cu(this.i[0].a + this.i[0].c / 2, this.i[0].b + this.i[0].d / 2);
        this.q = new iff(new int[]{0xFF0000, 0xFFFFFF});
        this.l = f.d("/m/m");
        this.p = pc.e;
        this.r = f.d("/m/lock");
    }

    public final boolean f(int n) {
        switch (n) {
            case 96: 
            case 97: 
            case 98: 
            case 99: {
                if (this.n == n) {
                    if (this.m < 50) {
                        this.m = (short)(this.m + 2);
                    }
                } else {
                    this.m = (short)25;
                    this.n = n;
                }
                if (n == 99) {
                    if (this.o.b > 0) {
                        this.o.b -= this.m;
                    }
                } else if (n == 98) {
                    if (this.o.b < this.l.getHeight()) {
                        this.o.b += this.m;
                    }
                } else if (n == 97) {
                    if (this.o.a > 0) {
                        this.o.a -= this.m;
                    }
                } else if (n == 96 && this.o.a < this.l.getWidth()) {
                    this.o.a += this.m;
                }
                if (this.o.a < 0) {
                    this.o.a = 0;
                } else if (this.o.a > this.l.getWidth() - this.p.getWidth()) {
                    this.o.a = this.l.getWidth() - this.p.getWidth();
                }
                if (this.o.b < 0) {
                    this.o.b = 0;
                } else if (this.o.b > this.l.getHeight() - this.p.getHeight()) {
                    this.o.b = this.l.getHeight() - this.p.getHeight();
                }
                int n2 = this.q();
                if (n2 >= 0) {
                    if (go.x == n2) {
                        if (n == 99) {
                            this.o.b = this.i[n2].b - 1;
                        } else if (n == 98) {
                            this.o.b = this.i[n2].b + this.i[n2].d + 1;
                        } else if (n == 97) {
                            this.o.a = this.i[n2].a - 1;
                        } else if (n == 96) {
                            this.o.a = this.i[n2].a + this.i[n2].c + 1;
                        }
                        n2 = -1;
                    } else {
                        this.o.a = this.i[n2].a + this.i[n2].c / 2;
                        this.o.b = this.i[n2].b + this.i[n2].d / 2;
                    }
                }
                if (n2 >= 0 && this.s.a != null) {
                    bd bd2 = new bd("Vào Thành", -1);
                    og og2 = this.s;
                    og2.a(bd2, true);
                } else {
                    this.s.n();
                }
                go.x = n2;
                this.a();
                return true;
            }
            case 95: {
                if (this.s.p()) {
                    this.s.d(-1, -1);
                }
                return true;
            }
        }
        return false;
    }

    final void a() {
        ay ay2 = (ay)this.b;
        k k2 = ay2.r();
        int n = this.o.a - k2.c / 2;
        int n2 = this.o.b - k2.d / 2;
        if (n < 0) {
            n = 0;
        } else if (n + k2.c > this.l.getWidth()) {
            n = this.l.getWidth() - k2.c;
        }
        if (n2 < 0) {
            n2 = 0;
        } else if (n2 + k2.d > this.l.getHeight()) {
            n2 = this.l.getHeight() - k2.d;
        }
        if (n != k2.a) {
            ay2.i(n - k2.a);
        }
        if (n2 != k2.b) {
            ay2.j(n2 - k2.b);
        }
    }

    private int q() {
        int n = this.o.a;
        int n2 = this.o.b;
        int n3 = 0;
        while (n3 < this.i.length) {
            int n4 = this.i[n3].c;
            int n5 = this.i[n3].d;
            if (n >= this.i[n3].a && n <= this.i[n3].a + n4 && n2 >= this.i[n3].b && n2 <= this.i[n3].b + n5) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    public final boolean g(int n) {
        this.n = -1987;
        this.m = (short)25;
        return false;
    }

    public final boolean c(int n, int n2) {
        this.o.a = n;
        this.o.b = n2;
        n = this.q();
        if (n >= 0 && this.s.a != null) {
            bd bd2 = new bd("Vào Thành", -1);
            og og2 = this.s;
            og2.a(bd2, true);
            if (n == go.x) {
                go.x = n;
                og.a(this.s);
            }
        } else {
            this.s.n();
        }
        go.x = n;
        return true;
    }

    public final g v() {
        return new g(this.l.getWidth(), this.l.getHeight());
    }

    public final int w() {
        return this.m;
    }

    public final void n() {
        this.c = true;
    }

    public final void a(Graphics graphics, int n2, int n3) {
        if (v.t > this.e() || v.u - ba.a > this.f()) {
            graphics.setColor(0);
            graphics.fillRect(0, 0, v.t, v.u - ba.a);
        }
        Object object = this;
        object = ((ay)((aq)object).b).q();
        cw.a(graphics);
        cw.a(graphics, this.c(), this.d(), this.e(), this.f());
        graphics.drawImage(this.l, this.c() - ((k)object).a, this.d() - ((k)object).b, 0);
        if (this.s.a != null) {
            n3 = 0;
            while (n3 < this.s.a.length) {
                if (n3 < this.k.length && this.s.a[n3].h) {
                    graphics.drawImage(this.r, this.k[n3][0] - ((k)object).a, this.k[n3][1] - ((k)object).b, 20);
                }
                ++n3;
            }
        }
        n3 = 0;
        while (n3 < this.j.length) {
            d d2 = bx.c;
            if (n3 == go.x) {
                d2 = this.q;
            }
            d2.a(graphics, og.b(this.s)[n3], this.j[n3][0] - ((k)object).a, this.j[n3][1] - ((k)object).b, 0);
            ++n3;
        }
        n3 = this.o.a - ((k)object).a;
        int n4 = this.o.b - ((k)object).b;
        if (go.x >= 0) {
            graphics.drawImage(this.p, n3, n4, 0);
        } else {
            graphics.drawImage(pc.f, n3, n4, 0);
        }
        cw.b(graphics);
    }

    static Image a(oh oh2) {
        return oh2.l;
    }

    static void a(oh oh2, int n2, int n3) {
        int n4 = 0;
        while (n4 < oh2.i.length) {
            oh2.i[n4].a += n2;
            oh2.i[n4].b += n3;
            ++n4;
        }
        n4 = 0;
        while (n4 < oh2.j.length) {
            short[] sArray = oh2.j[n4];
            sArray[0] = (short)(sArray[0] + n2);
            short[] sArray2 = oh2.j[n4];
            sArray2[1] = (short)(sArray2[1] + n3);
            ++n4;
        }
        n4 = 0;
        while (n4 < oh2.k.length) {
            short[] sArray = oh2.k[n4];
            sArray[0] = (short)(sArray[0] + n2);
            short[] sArray3 = oh2.k[n4];
            sArray3[1] = (short)(sArray3[1] + n3);
            ++n4;
        }
    }

    static k[] b(oh oh2) {
        return oh2.i;
    }

    static void a(oh oh2, cu cu2) {
        oh2.o = cu2;
    }

    static void c(oh oh2) {
        v0.p = null;
        oh2.r = null;
        oh2.l = null;
        oh2.i = null;
        oh2.k = null;
        System.gc();
    }
}
