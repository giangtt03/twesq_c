package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class mt
implements mr {
    private ms h;
    public mh a;
    private ml i;
    private Image j;
    private Image k;
    private a[] l;
    private a m;
    private a n;
    private a o;
    private a p;
    private mm q;
    public mx b;
    private k r;
    private na s;
    private y t;
    public y c;
    private y u;
    private nm[][] v;
    private gz w;
    public ff d;
    private mj z;
    public np e;
    private mv A;
    lz f = new lz(30, 30, 30, 10);
    private io[] B;
    private in[] C;
    public hl g;
    private String[][] D = new String[][]{{"Đại hiệp tha mạng!!", "Em vô tội T.T", "Hey! Có gì từ từ nói...", "Eck eck...Sợ quá!!"}};

    public mt(ms object) {
        try {
            this.h = object;
            this.r = new k();
            this.m();
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
        }
        this.f.b(false);
    }

    public final void a(String string) {
        if (string == null || string.length() <= 0) {
            return;
        }
        this.z.a(string, 0);
        if (!this.h.a((int)1, (int)0).a().O) {
            if (com.mg.sq.a.m != null) {
                com.mg.sq.a.m.a(this.h.a(1, 0).j(), string);
                return;
            }
            String[] stringArray = new String[this.h.a()[1].length];
            int n = 0;
            while (n < stringArray.length) {
                stringArray[n] = this.h.a()[1][n].j();
                ++n;
            }
            ks.a().a(stringArray, string);
        }
    }

    public final void b(String string) {
        this.z.a(string, 1);
    }

    public final void a(String string, int n) {
        this.z.a(string, 1, 50, 20);
    }

    public final void a() {
        if (this.h.a(1, 0).b()) {
            return;
        }
        if (!this.d.i()) {
            this.d.a(true);
            if (v.z) {
                this.d.g(true);
            }
        }
    }

    public final void b() {
        this.d.a(false);
        ag.a().e();
    }

    public final void a(lm[] lmArray) {
        this.g = new hl(lmArray, new bd("Dùng", 1008), new bd("Đóng", 1009), new bd("", 1008));
        this.g.c(true);
        this.g.b(true);
    }

    public final void c() {
        this.B = null;
        this.n = null;
        this.m = null;
        this.o = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.c = null;
        this.s = null;
        this.a = null;
        this.z = null;
        this.w = null;
        this.p = null;
        this.b.b = null;
        this.b = null;
        if (this.h != null) {
            this.h.g();
        }
        this.h = null;
        this.g = null;
        if (this.A != null) {
            this.A.c();
        }
        this.A = null;
        this.k = null;
        this.j = null;
        this.i = null;
        this.q = null;
        this.C = null;
        this.l = null;
        this.d = null;
    }

    private void m() {
        int n;
        this.A = new mv(this, gr.r);
        this.m = new a();
        this.B = new io[2];
        this.C = new in[2];
        this.l = new a[2];
        int n2 = 0;
        while (n2 < this.l.length) {
            this.l[n2] = new a();
            ++n2;
        }
        this.v = new nm[2][];
        this.v[0] = new nm[oq.i.length];
        this.v[1] = new nm[oq.j.length];
        n2 = 0;
        while (n2 < this.v.length) {
            int n3 = 0;
            while (n3 < this.v[n2].length) {
                this.v[n2][n3] = new nm();
                this.v[n2][n3].a(com.mg.sq.a.h);
                this.v[n2][n3].a(40);
                ++n3;
            }
            ++n2;
        }
        this.n = new a();
        this.o = new a();
        this.p = new a();
        this.s = new na(v.t / 2, v.u / 2 - 15);
        this.t = new y();
        this.t.a(40);
        this.c = new y();
        this.c.a(Integer.MAX_VALUE);
        this.u = new y();
        this.u.a(20);
        this.k = mp.a().b;
        this.a = new mh();
        mt mt2 = this;
        mt mt3 = this;
        this.a.c((v.t - mt2.A.a()) / 2 + (com.mg.sq.a.k == 0 ? 8 : 48) + 14, (v.u - mt3.A.b()) / 2 + 4 + 14);
        this.i = new ml();
        mr mr2 = this.a.a(0, 0);
        this.i.a(mr2.n(), mr2.o());
        Object object = this.h.a();
        mr2 = this.a;
        mt mt4 = this;
        mt mt5 = this;
        this.b = new mx(this.h, ((mh)mr2).a, com.mg.sq.a.k, (v.t - mt4.A.a()) / 2, (v.u - mt5.A.b()) / 2);
        this.j = mp.a().a;
        this.q = new mm();
        if (oq.o != 9) {
            mr2 = this;
            n = 0;
            while (n < object[0].length) {
                if (object[0][n].j().equals(go.k.b)) {
                    object = object[0][n].a();
                    if (object.E.length == 0) break;
                    n = 0;
                    while (n < object.E.length) {
                        int n4 = 0;
                        block5: while (n4 < go.k.E.length) {
                            if (object.E[n].a == go.k.E[n4].a) {
                                object.E[n] = go.k.E[n4];
                                n4 = 0;
                                while (n4 < go.r.length) {
                                    if (go.r[n4].a == object.E[n].a) {
                                        object.E[n].e = go.r[n4].c[object.E[n].f - 1].d;
                                        break block5;
                                    }
                                    ++n4;
                                }
                                break;
                            }
                            ++n4;
                        }
                        ++n;
                    }
                    ((mt)mr2).w = new gz((lh)object);
                    ((mt)mr2).w.b(true);
                    ((mt)mr2).w.c(true);
                    break;
                }
                ++n;
            }
        }
        this.d = new ff(null, 255, 2);
        int n5 = v.t;
        this.d.a(0, v.u - 20, n5, 20);
        this.d.h(30);
        this.d.a(new mu(this));
        this.d.d(true);
        this.b();
        this.e = new np();
        Object object2 = this.a;
        object2 = ((mh)object2).a;
        int n6 = this.b.h()[0];
        n = this.b.g()[0];
        this.z = new mj(n6, this.b.h()[1], (n += this.b.g()[2]) - n6, 20);
        this.z.a(this.b.g()[1] - this.b.h()[1]);
        if (com.mg.sq.a.k == 0) {
            this.e.c(((k)object2).a + ((k)object2).c / 2 - 5, ((k)object2).b + ((k)object2).d + 10);
            return;
        }
        this.e.c(this.b.e()[0], this.b.e()[1] + this.b.e()[3] + 6);
    }

    public final void d() {
        try {
            this.a.i();
            this.i.i();
            int n = this.m.d() - 1;
            while (n >= 0) {
                if (this.m.b(n) != null) {
                    if (!((ne)this.m.b(n)).m()) {
                        this.m.a(n);
                    } else if (this.m.b(n) != null) {
                        ((ne)this.m.b(n)).i();
                    }
                }
                --n;
            }
            n = this.n.d() - 1;
            while (n >= 0) {
                if (this.n.b(n) != null) {
                    if (!((nb)this.n.b(n)).m()) {
                        this.n.a(n);
                    } else if (this.n.b(n) != null) {
                        ((nb)this.n.b(n)).i();
                    }
                }
                --n;
            }
            n = this.o.d() - 1;
            while (n >= 0) {
                if (this.o.b(n) != null) {
                    if (!((im)this.o.b(n)).m()) {
                        this.o.a(n);
                    } else if (this.o.b(n) != null) {
                        ((im)this.o.b(n)).i();
                    }
                }
                --n;
            }
            n = this.p.d() - 1;
            while (n >= 0) {
                if (this.p.b(n) != null) {
                    ((nh)this.p.b(n)).i();
                }
                --n;
            }
            n = 0;
            while (n < this.v.length) {
                int n2 = 0;
                while (n2 < this.v[n].length) {
                    this.v[n][n2].b();
                    ++n2;
                }
                ++n;
            }
            n = 0;
            while (n < this.B.length) {
                if (this.B[n] != null) {
                    this.B[n].i();
                }
                ++n;
            }
            n = 0;
            while (n < this.C.length) {
                if (this.C[n] != null) {
                    this.C[n].i();
                }
                ++n;
            }
            n = 0;
            while (n < this.l.length) {
                a a2 = this.l[n];
                if (a2 != null) {
                    int n3 = 0;
                    while (n3 < a2.d()) {
                        if (a2.b(n3) != null) {
                            ((ip)a2.b(n3)).i();
                        }
                        ++n3;
                    }
                }
                ++n;
            }
            this.q.i();
            this.b.i();
            this.s.i();
            this.t.b();
            this.c.b();
            this.u.b();
            this.e.i();
            this.d.n();
            this.z.i();
            if (this.f != null) {
                this.f.i();
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }

    public final void a(Graphics graphics) {
        try {
            block24: {
                block23: {
                    mt mt2 = this;
                    if (v.t > mt2.A.a()) break block23;
                    mt mt3 = this;
                    if (v.u <= mt3.A.b()) break block24;
                }
                graphics.setColor(0);
                mt mt4 = this;
                graphics.fillRect(0, 0, v.t, (v.u - mt4.A.b()) / 2);
                mt mt5 = this;
                mt mt6 = this;
                graphics.fillRect(0, (v.u + mt5.A.b()) / 2, v.t, (v.u - mt6.A.b()) / 2);
                mt mt7 = this;
                mt mt8 = this;
                mt mt9 = this;
                graphics.fillRect(0, (v.u - mt7.A.b()) / 2, (v.t - mt8.A.a()) / 2, mt9.A.b());
                mt mt10 = this;
                mt mt11 = this;
                mt mt12 = this;
                mt mt13 = this;
                graphics.fillRect((v.t + mt10.A.a()) / 2, (v.u - mt11.A.b()) / 2, (v.t - mt12.A.a()) / 2, mt13.A.b());
            }
            mt mt14 = this;
            int n = (v.t - mt14.A.a()) / 2;
            mt mt15 = this;
            int n2 = (v.u - mt15.A.b()) / 2;
            mt mt16 = this;
            mt mt17 = this;
            graphics.setClip(n, n2, mt16.A.a(), mt17.A.b());
            this.A.a(graphics, n, n2, 0);
            cw.a(graphics, this.r);
            at at2 = this.a;
            cw.a(graphics, at2.a, this.r);
            this.a.a(graphics);
            cw.c(graphics, this.r);
            this.i.a(graphics);
            if (this.f != null) {
                this.f.a(graphics);
            }
            try {
                if (this.q != null) {
                    this.q.a(graphics);
                }
            }
            catch (Exception exception) {
                ct.a("[SQCViewManager] loi view" + exception.toString());
            }
            this.b.a(graphics);
            this.t.a(graphics, 0, 0);
            this.c.a(graphics, 0, 0);
            this.u.a(graphics, 0, 0);
            n2 = 0;
            while (n2 < this.l.length) {
                a a2 = this.l[n2];
                nk nk2 = this.b.a[n2];
                int n3 = nk2.n() + (nk2.p() - a2.d() * 17) / 2;
                int n4 = nk2.o() - 15;
                int n5 = 0;
                while (n5 < a2.d()) {
                    at2 = (ip)a2.b(n5);
                    ((ip)at2).a(graphics, n3 + (n2 == 0 ? nk2.p() / 2 - 20 : -nk2.p() / 2 + 20), n4);
                    n3 += 15;
                    ++n5;
                }
                ++n2;
            }
            n2 = 0;
            while (n2 < this.m.d()) {
                ((ne)this.m.b(n2)).a(graphics, 0, 0);
                ++n2;
            }
            n2 = this.p.d() - 1;
            while (n2 >= 0) {
                ((nh)this.p.b(n2)).a(graphics);
                --n2;
            }
            n2 = 0;
            while (n2 < this.n.d()) {
                ((nb)this.n.b(n2)).a(graphics, 0, 0);
                ++n2;
            }
            n2 = 0;
            while (n2 < this.o.d()) {
                ((im)this.o.b(n2)).a(graphics);
                ++n2;
            }
            n2 = 0;
            while (n2 < this.B.length) {
                if (this.B[n2] != null) {
                    this.B[n2].a(graphics);
                }
                ++n2;
            }
            n2 = 0;
            while (n2 < this.C.length) {
                if (this.C[n2] != null) {
                    this.C[n2].a(graphics);
                }
                ++n2;
            }
            if (oq.o != 1) {
                this.e.a(graphics);
            }
            this.z.a(graphics);
            n2 = 0;
            while (n2 < this.v.length) {
                int n6 = 0;
                while (n6 < this.v[n2].length) {
                    this.v[n2][n6].a(graphics, 0, 0);
                    ++n6;
                }
                ++n2;
            }
            this.s.a(graphics);
            graphics.setClip(0, 0, v.t, v.u);
            this.d.a(graphics, 0, 0);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public final void a(int n, int n2, int n3) {
        this.i.a(n);
        nd nd2 = this.a.a(n2 - 2, n3 - 2);
        this.i.a(nd2.n(), nd2.o());
    }

    public final void b(int n, int n2, int n3) {
        this.i.a(n);
        nd nd2 = this.a.a(n2 - 2, n3 - 2);
        if (n == 0 && oq.o != 9) {
            this.i.b(nd2.n(), nd2.o());
            return;
        }
        this.i.a(nd2.n(), nd2.o());
    }

    public final void a(int n, int n2) {
        this.i.a(0);
        nd nd2 = this.a.a(n - 2, n2 - 2);
        int n3 = 0;
        if (n2 > 2) {
            n3 = 1;
        }
        if (n2 < 9) {
            n3 |= 2;
        }
        if (n > 2) {
            n3 |= 4;
        }
        if (n < 9) {
            n3 |= 8;
        }
        this.i.b(n3, nd2.n(), nd2.o());
    }

    private static int b(int n, int n2, int n3, int n4) {
        int n5 = 0;
        if (n2 < n4) {
            n5 = 2;
        } else if (n2 > n4) {
            n5 = 1;
        } else if (n < n3) {
            n5 = 8;
        } else if (n > n3) {
            n5 = 4;
        }
        return n5;
    }

    public final void a(int n, int n2, int n3, int n4, int n5) {
        this.i.a(n);
        nd nd2 = this.a.a(n4 - 2, n5 - 2);
        nd nd3 = this.a.a(n2 - 2, n3 - 2);
        this.i.c(nd3.n(), nd3.o(), nd2.n(), nd2.o());
    }

    public final void e() {
        this.f.b(false);
    }

    public final void b(int n, int n2, int n3, int n4, int n5) {
        n4 = mt.b(n2, n3, n4, n5);
        this.i.a(n);
        nd nd2 = this.a.a(n2 - 2, n3 - 2);
        this.i.b(n4, nd2.n(), nd2.o());
    }

    public final void a(my my2) {
        int n;
        int n2 = my2.a;
        int n3 = my2.b;
        if ((my2.e[0] & 0xFF) >= 3 || (my2.e[1] & 0xFF) >= 3) {
            n = mt.b(my2.c, my2.d, my2.a, my2.b);
            n2 = my2.c;
            n3 = my2.d;
        } else {
            n = mt.b(my2.a, my2.b, my2.c, my2.d);
        }
        int n4 = (n3 - 2) * 28 + this.a.n();
        n2 = (n2 - 2) * 28 + this.a.o();
        this.q.b(n4, n2, n);
    }

    public final void f() {
        this.q.a();
    }

    public final void g() {
        this.i.a();
    }

    public final int h() {
        int n = 0;
        int n2 = 0;
        while (n2 < 8) {
            int n3 = n + 0;
            int n4 = 0;
            while (n4 < 8) {
                nd nd2 = this.a.a(n2, n4);
                nd2.i(28, n3);
                ++n3;
                ++n4;
            }
            ++n;
            ++n2;
        }
        return 22;
    }

    public final int i() {
        int n = 0;
        nj[][] njArray = this.h;
        njArray = this.h.l;
        int[] nArray = new int[12];
        int n2 = 2;
        while (n2 < 10) {
            int n3 = 0;
            int n4 = 9;
            while (n4 >= 2) {
                this.a(n3, n2, n4, n2, njArray[n4][n2], nArray[n2] + n);
                int n5 = n2;
                nArray[n5] = nArray[n5] + 1;
                --n3;
                --n4;
            }
            ++n;
            ++n2;
        }
        return 21;
    }

    public final void a(int n, int n2, nj nj2, int n3) {
        this.a.a(n, n2, nj2, n3);
    }

    public final void a(int n, int n2, int n3, int n4, nj nj2, nj nj3) {
        this.a.a(n, n2, n3, n4, nj2, nj3);
    }

    public final void a(int n, int n2, int n3, int n4, nj nj2, int n5) {
        this.a.a(n, n2, n3, n4, nj2, n5);
    }

    public final int a(mw mw2, int n) {
        int n2 = 0;
        if (mw2.k) {
            int n3;
            Object object;
            if ((mw2.a.e & 1) != 0) {
                int[] nArray;
                int n4 = n = (n + 1) % 2;
                object = mw2;
                mt mt2 = this;
                if (n4 == 0) {
                    int[] nArray2 = new int[4];
                    nArray2[0] = mt2.b.a[0].n();
                    nArray2[1] = mt2.b.a[0].o();
                    nArray2[2] = mt2.b.a[0].p();
                    nArray = nArray2;
                    nArray2[3] = mt2.b.a[0].q();
                } else {
                    int[] nArray3 = new int[4];
                    nArray3[0] = mt2.b.a[1].n();
                    nArray3[1] = mt2.b.a[1].o();
                    nArray3[2] = mt2.b.a[1].p();
                    nArray = nArray3;
                    nArray3[3] = mt2.b.a[1].q();
                }
                int[] nArray4 = nArray;
                int n5 = nArray[0] + nArray4[2] / 2 + cv.a() % 10;
                int n6 = nArray4[1] + nArray4[3] / 2 + cv.a() % 10;
                if (((mw)object).d == 1 && ((mw)object).g == 1) {
                    mt2.a((mw)object, n5, n6);
                } else if (((mw)object).d == 1) {
                    mt2.b((mw)object, n5, n6);
                } else if (((mw)object).g == 1) {
                    mt2.a((mw)object, n5, n6);
                } else {
                    mt2.a((mw)object, n5, n6);
                    mt2.b((mw)object, n5, n6);
                }
                mt2.a(n4, 36, 26, true);
            }
            nj nj2 = mw2.a;
            object = null;
            k k2 = new k();
            switch (nj2.e) {
                case 1: 
                case 16: 
                case 32: 
                case 64: {
                    if (n == 0) {
                        this.b.a[0].g();
                        break;
                    }
                    this.b.a[1].g();
                    break;
                }
                case 2: 
                case 4: 
                case 8: {
                    if ((nj2.e & 2) != 0) {
                        object = n == 0 ? this.b.a() : this.b.b();
                    } else if ((nj2.e & 4) != 0) {
                        object = n == 0 ? this.b.c() : this.b.d();
                    } else if ((nj2.e & 8) != 0) {
                        object = n == 0 ? this.b.e() : this.b.f();
                    }
                    if (object == null) break;
                    k2.a = (int)(object[0] + object[2] / 2);
                    k2.b = (int)(object[1] + object[3] / 2);
                    k2.c = (int)(object[2] - 2);
                    k2.d = (int)(object[3] - 2);
                }
            }
            this.a.n();
            this.a.o();
            n2 = mw2.d == 1 && mw2.g == 1 ? this.a(mw2) : (mw2.d < 3 ? this.a(mw2) : (mw2.g < 3 ? this.b(mw2) : ((n = this.a(mw2)) > (n3 = this.b(mw2)) ? n : n3)));
        }
        return n2;
    }

    private int a(mw mw2) {
        return this.a.b(mw2);
    }

    private int b(mw mw2) {
        return this.a.a(mw2);
    }

    public final int a(int n) {
        Image image = null;
        switch (n) {
            case 1: {
                image = f.d("/strwin");
                break;
            }
            case 0: {
                image = f.d("/strlose");
            }
        }
        return this.s.a(image);
    }

    private void a(int n, int n2, k k2, nj nj2, int n3, boolean n4) {
        if ((nj2.e & 1) != 0) {
            return;
        }
        try {
            nh nh2 = null;
            n4 = this.p.d() - 1;
            while (n4 >= 0) {
                nh nh3 = (nh)this.p.b(n4);
                if (!nh3.m()) {
                    nh2 = nh3;
                    break;
                }
                --n4;
            }
            if (nh2 == null) {
                nh2 = new nh(this.k);
                this.p.a(nh2);
            }
            nh2.a(n, n2, k2, nj2.g, 0, false);
            return;
        }
        catch (OutOfMemoryError outOfMemoryError) {
            this.b(true);
            if (com.mg.sq.a.m != null) {
                com.mg.sq.a.m.G();
            }
            return;
        }
    }

    public final void b(int n, int n2) {
        int[] nArray = null;
        k k2 = new k();
        switch (n2) {
            case 1: {
                nArray = n == 0 ? this.b.a() : this.b.b();
                break;
            }
            case 2: {
                nArray = n == 0 ? this.b.c() : this.b.d();
                break;
            }
            case 3: {
                int[] nArray2 = nArray = n == 0 ? this.b.e() : this.b.f();
            }
        }
        if (nArray != null) {
            k2.a = nArray[0] + nArray[2] / 2;
            k2.b = nArray[1] + nArray[3] / 2;
            k2.c = nArray[2] - 2;
            k2.d = nArray[3] - 2;
            if (com.mg.sq.a.k == 0) {
                n = nArray[0] + nArray[2] + 30;
                int n3 = nArray[1] - 50;
                int n4 = 0;
                while (n4 < 9) {
                    if (n4 == 0 || n4 == 8) {
                        this.a(n + 30, n3, k2, nj.a(n2), 0, false);
                    } else {
                        this.a(n, n3, k2, nj.a(n2), 0, false);
                    }
                    n3 += 12;
                    ++n4;
                }
                return;
            }
            n = nArray[0] - 50;
            int n5 = nArray[1] - 30;
            int n6 = 0;
            while (n6 < 9) {
                if (n6 == 0 || n6 == 8) {
                    this.a(n, n5 - 30, k2, nj.a(n2), 0, false);
                } else {
                    this.a(n, n5, k2, nj.a(n2), 0, false);
                }
                n += 12;
                ++n6;
            }
        }
    }

    public final void a(String string, int n, int n2, boolean bl) {
        if (n2 == 0) {
            return;
        }
        boolean bl2 = this.h.b;
        boolean bl3 = this.h.e;
        d d2 = com.mg.sq.a.h;
        lg[][] lgArray = this.h.a();
        String string2 = String.valueOf(n2 >= 0 ? (n2 == 0 ? (n != 0 ? "-" : "+") : "+") : "") + n2;
        n = 0;
        while (n < lgArray.length) {
            int n3 = 0;
            while (n3 < lgArray[n].length) {
                if (lgArray[n][n3].j().equals(string)) {
                    if ((bl2 || bl || bl3) && n2 < 0) {
                        d2 = bx.a;
                        if (bl2 && bl) {
                            d2.a(12067023);
                        } else if (bl2) {
                            d2.a(6290199);
                        } else if (bl3 && bl) {
                            d2.a(16753920);
                        } else if (bl3) {
                            d2.a(0xFFFF00);
                        } else {
                            d2.a(2371791);
                        }
                    }
                    this.v[n][n3].a(string2, this.b.a(n)[n3].n() + this.b.a(n)[n3].p() / 2, this.b.a(n)[n3].o());
                    this.v[n][n3].a(this.b.a(n)[n3]);
                    this.v[n][n3].a(d2);
                    if (n == 1 && this.h.a(1, 0).b() && n2 < 0 && this.h.a(1, 0).c() <= 50) {
                        this.a(this.D[0][cv.a(this.D[0].length)], 50);
                    }
                    return;
                }
                ++n3;
            }
            ++n;
        }
    }

    public final void c(int n, int n2, int n3, int n4, int n5) {
        ne ne2 = null;
        int n6 = this.m.d() - 1;
        while (n6 >= 0) {
            ne ne3 = (ne)this.m.b(n6);
            if (!ne3.a()) {
                ne2 = ne3;
                break;
            }
            --n6;
        }
        if (ne2 == null) {
            ne2 = new ne(this.j);
            this.m.a(ne2);
        }
        n6 = (n3 + n5 / 2 - 2) * 28 - (n5 % 2 == 0 ? 14 : 4) + this.a.n();
        int n7 = (n2 + n4 / 2 - 2) * 28 - (n4 % 2 == 0 ? 14 : 5) + this.a.o();
        n2 = n - 1;
        ne2.a(n6, n7, n2, "x" + n);
    }

    private void c(int n, int n2, int n3) {
        this.a(n, n2, n3, false);
    }

    public final void a(int n, int n2, int n3, boolean bl) {
        this.b.a(n, n2, bl);
        this.b.c(n3);
    }

    private void a(mw mw2, int n, int n2) {
        int n3 = mw2.c;
        int n4 = mw2.c + mw2.d;
        while (n3 < n4) {
            nb nb2 = null;
            nd nd2 = this.a.a(mw2.b - 2, n3 - 2);
            int n5 = this.n.d() - 1;
            while (n5 >= 0) {
                nb nb3 = (nb)this.n.b(n5);
                if (!nb3.m()) {
                    nb2 = nb3;
                    break;
                }
                --n5;
            }
            if (nb2 == null) {
                nb2 = new nb(this.k);
                this.n.a(nb2);
            }
            nb2.a(nd2.n(), nd2.o(), n, n2, mw2.a.d * nb2.q());
            ++n3;
        }
    }

    private void b(mw mw2, int n, int n2) {
        int n3 = mw2.e;
        int n4 = mw2.e + mw2.g;
        while (n3 < n4) {
            nb nb2 = null;
            nd nd2 = this.a.a(n3 - 2, mw2.f - 2);
            int n5 = this.n.d() - 1;
            while (n5 >= 0) {
                nb nb3 = (nb)this.n.b(n5);
                if (!nb3.m()) {
                    nb2 = nb3;
                    break;
                }
                --n5;
            }
            if (nb2 == null) {
                nb2 = new nb(this.k);
                this.n.a(nb2);
            }
            nb2.a(nd2.n(), nd2.o(), n, n2, mw2.a.d * nb2.q());
            ++n3;
        }
    }

    private void a(int n, int n2, boolean bl, boolean bl2) {
        a a2 = this.l[n];
        ip ip2 = null;
        int n3 = 0;
        while (n3 < a2.d()) {
            ip ip3 = (ip)a2.b(n3);
            if (ip3.b == bl && ip3.a == n2) {
                ip2 = ip3;
                break;
            }
            ++n3;
        }
        if (ip2 == null) {
            a2.a(new ip(n2, bl, 8));
        }
        if (bl2) {
            this.c(n);
        }
    }

    public final void a(int n, int n2, boolean bl) {
        a a2 = this.l[n];
        int n3 = 0;
        while (n3 < a2.d()) {
            ip ip2 = (ip)a2.b(n3);
            if (ip2.b == bl && ip2.a == n2) {
                a2.a(n3);
                return;
            }
            ++n3;
        }
    }

    private void c(int n) {
        int n2 = this.h.a((int)n, (int)0).a().g / 2;
        if (this.C[n] == null) {
            this.C[n] = new in(n2);
            int[] nArray = n == 0 ? new int[]{this.b.a[0].n(), this.b.a[0].o(), this.b.a[0].p(), this.b.a[0].q()} : new int[]{this.b.a[1].n(), this.b.a[1].o(), this.b.a[1].p(), this.b.a[1].q()};
            this.C[n].c(nArray[0] + nArray[2] / 2, nArray[1] + nArray[3]);
        }
        this.C[n].r();
    }

    private void d(int n) {
        if (this.h.a(n, 0).b()) {
            return;
        }
        this.h.d = false;
        if (this.B[n] == null) {
            this.B[n] = new io(n, this);
        }
        int[] nArray = n == 0 ? new int[]{this.b.a[1].n(), this.b.a[1].o(), this.b.a[1].p(), this.b.a[1].q()} : new int[]{this.b.a[0].n(), this.b.a[0].o(), this.b.a[0].p(), this.b.a[0].q()};
        int n2 = this.h.a((int)n, (int)0).a().g / 2;
        this.B[n].a(n2, (ni)this.b.a[n], nArray[0] + nArray[2] / 2, nArray[1] + nArray[3] / 2);
        this.c(n);
    }

    public final void b(int n) {
        if (this.h.a(n, 0).b()) {
            return;
        }
        if (this.B[n] != null) {
            this.B[n].a();
        }
        this.B[n] = null;
    }

    public final int a(lv lv2, byte[] byArray, byte[] byArray2, byte[] objectArray, byte[] byArray3, int object) {
        Object object2;
        int[] nArray;
        int n = object + 1 & 1;
        int n2 = 10;
        int n3 = 0;
        int n4 = -180;
        if (object == 0) {
            n4 = 180;
        }
        int n5 = this.a.a(0, 0).p() >> 1;
        int n6 = this.a.a(0, 0).q() >> 1;
        if (object == 0) {
            nArray = new int[]{this.b.a[1].n(), this.b.a[1].o(), this.b.a[1].p(), this.b.a[1].q()};
            object2 = new int[]{this.b.a[0].n(), this.b.a[0].o(), this.b.a[0].p(), this.b.a[0].q()};
        } else {
            nArray = new int[]{this.b.a[0].n(), this.b.a[0].o(), this.b.a[0].p(), this.b.a[0].q()};
            object2 = new int[]{this.b.a[1].n(), this.b.a[1].o(), this.b.a[1].p(), this.b.a[1].q()};
        }
        switch (lv2.a) {
            case 1000: {
                object = nArray[0] + nArray[2] / 2;
                int n7 = nArray[1] + nArray[3] / 2;
                lv lv3 = lv2;
                n3 = this.a(0, lv3.a, object - n4, n7 - 180, (int)object, n7, 10);
                this.a(n, 32, 22, false);
                n2 = 10 + (cv.a(7) + 5);
                int n8 = 0;
                while (n8 < byArray3.length) {
                    object2 = this.a.a(objectArray[n8] - 2, byArray3[n8] - 2);
                    object = ((at)object2).n() + n5;
                    n7 = ((at)object2).o() + n6;
                    int n9 = 10 + cv.a(15);
                    lv3 = lv2;
                    n3 = this.a(n3, lv3.a, object - n4, n7 - 180, (int)object, n7, n9);
                    if (n9 > n2) {
                        n2 = n9;
                    }
                    ++n8;
                }
                break;
            }
            case 1001: {
                if (byArray == null) break;
                int n10 = 0;
                while (n10 < byArray.length) {
                    object2 = this.a.a(byArray[n10] - 2, byArray2[n10] - 2);
                    this.a((int)byArray[n10], (int)byArray2[n10], nj.a(10), n2 + 5);
                    object = ((at)object2).n();
                    int n11 = ((at)object2).o();
                    lv lv4 = lv2;
                    n3 = this.a(n3, lv4.a, (int)object, n11, (int)object, n11, n2);
                    n2 += 4;
                    ++n10;
                }
                n2 -= 4;
                break;
            }
            case 1002: {
                this.a((int)object, 1, true, true);
                break;
            }
            case 1003: {
                this.d((int)object);
                n2 += 30;
                break;
            }
            case 1004: {
                n4 = nArray[0] + nArray[2] / 2;
                n3 = nArray[1] + nArray[3];
                lv lv5 = lv2;
                this.a(0, lv5.a, n4, n3, n4, n3, 0);
                this.c(n, 26, 16);
                break;
            }
            case 1005: {
                object = object2[0] + object2[2] / 2;
                int n12 = object2[1] + object2[3] / 2;
                n4 = nArray[0] + nArray[2] / 2;
                n3 = nArray[1] + nArray[3] / 2;
                lv lv6 = lv2;
                this.a(0, lv6.a, (int)object, n12, n4, n3, 4);
                this.c(n, 20, 10);
                break;
            }
            case 1006: {
                object = nArray[0] + nArray[2] / 2;
                int n13 = nArray[1] + nArray[3];
                lv lv7 = lv2;
                n3 = this.a(0, lv7.a, object - n4, n13 - 180, (int)object, n13, 10);
                this.c(n, 36, 26);
                int n14 = 0;
                while (n14 < byArray3.length) {
                    int n15 = cv.a(7) + 4;
                    object2 = this.a.a(objectArray[n14] + 1 - 2, byArray3[n14] + 1 - 2);
                    object = ((at)object2).n();
                    n13 = ((at)object2).o();
                    lv7 = lv2;
                    n3 = this.a(n3, lv7.a, object - n4, n13 - 180, (int)object, n13, n15);
                    if (n15 > n2) {
                        n2 = n15;
                    }
                    ++n14;
                }
                break;
            }
            case 1007: {
                object = nArray[0] + nArray[2] / 2;
                int n16 = nArray[1] + nArray[3];
                lv lv8 = lv2;
                n3 = this.a(0, lv8.a, (int)object, n16, (int)object, n16, 10);
                this.c(n, 30, 11);
                int n17 = 0;
                while (n17 < byArray3.length) {
                    int n18 = cv.a(7) + 10;
                    object2 = this.a.a(objectArray[n17] + 4 - 1 - 2, byArray3[n17] + 2 - 1 - 2);
                    object = ((at)object2).n() + n5;
                    n16 = ((at)object2).o() + n6;
                    lv8 = lv2;
                    n3 = this.a(n3, lv8.a, (int)object, n16, (int)object, n16, n18);
                    if (n18 > n2) {
                        n2 = n18;
                    }
                    ++n17;
                }
                break;
            }
            case 1008: {
                this.c(n, 10, 4);
                nd nd2 = this.a.a(7, byArray3[0] + 1 - 2);
                object2 = nd2;
                object = nd2.n() + n5;
                int n19 = ((at)object2).o() + n6;
                lv lv9 = lv2;
                this.a(0, lv9.a, (int)object, n19, (int)object, 0, 10);
                break;
            }
            case 2000: {
                int[] nArray2 = new int[byArray.length + 1];
                int[] nArray3 = new int[byArray.length + 1];
                objectArray = nArray3;
                int n20 = nArray3.length - 1;
                object = 0;
                while (object < n20) {
                    object2 = this.a.a(byArray[object] - 2, byArray2[object] - 2);
                    nArray2[object] = ((at)object2).n();
                    objectArray[object] = ((at)object2).o();
                    ++object;
                }
                n2 = 10 + (objectArray.length * 5 + 5);
                this.c(n, n2, n2 - 6);
                object = nArray[0] + nArray[2] / 2;
                int n21 = nArray[1] + nArray[3] / 2;
                nArray2[nArray2.length - 1] = object;
                objectArray[nArray2.length - 1] = n21;
                lv lv10 = lv2;
                n3 = this.a(0, lv10.a, (int)object, n21, (int)object, n21, n2);
                jg jg2 = (jg)this.o.b(n3);
                jg2.a(nArray2, (int[])objectArray);
                break;
            }
            case 2001: {
                this.a((int)object, 0, true, true);
                break;
            }
            case 2002: {
                this.a((int)object, 2, true, true);
                break;
            }
            case 2003: {
                object = nArray[0] + nArray[2] / 2;
                int n22 = nArray[1] + nArray[3] / 2;
                lv lv11 = lv2;
                this.a(0, lv11.a, object - n4, n22 - 180, (int)object, n22, 10);
                this.c(n, 36, 26);
                n2 = 14;
                break;
            }
            case 2004: {
                int n23 = object2[1] + object2[3] / 2 + 6;
                n4 = nArray[0] + nArray[2] / 2;
                n3 = nArray[1] + nArray[3] / 2 + 6;
                if (object == 0) {
                    n4 += 60;
                    object = object2[0] + object2[2];
                } else {
                    object = object2[0];
                    n4 -= 60;
                }
                lv lv12 = lv2;
                this.a(0, lv12.a, (int)object, n23, n4, n3, 10);
                this.c(n, 20, 10);
                n2 = 10;
                if (!this.h.a(n, 0).i()) break;
                this.a(n, 1, false, false);
                break;
            }
            case 2005: {
                this.d((int)object);
                n2 += 30;
                break;
            }
            case 2006: {
                int n24 = object2[1] + object2[3] / 2 + 4;
                n4 = nArray[0] + nArray[2] / 2;
                mt mt2 = this;
                int n25 = (v.t - mt2.A.a()) / 2;
                if (object == 0) {
                    lv lv13 = lv2;
                    n3 = this.a(0, lv13.a, (n25 -= 56) - cv.a(150), n24, n4, n24, 6);
                    this.c(n, 16, 10);
                    mt mt3 = this;
                    n4 = n25 + mt3.A.a() + 100;
                    n5 = 0;
                    while (n5 < objectArray.length) {
                        object2 = this.a.a(objectArray[n5] - 2, 0);
                        lv13 = lv2;
                        n3 = this.a(n3, lv13.a, n25 - ((n5 & 1) == 1 ? 40 : 0), ((at)object2).o(), n4, ((at)object2).o(), 6);
                        ++n5;
                    }
                    n24 -= 40;
                    n5 = 0;
                    while (n5 < 3) {
                        lv13 = lv2;
                        n3 = this.a(n3, lv13.a, n25 - cv.a(150), n24, n4, n24, 6);
                        n24 += 20;
                        ++n5;
                    }
                } else {
                    lv lv14 = lv2;
                    mt mt4 = this;
                    n3 = this.a(0, lv14.a, n25 + mt4.A.a() + cv.a(150), n24, n4, n24, 6);
                    this.c(n, 16, 10);
                    n4 = n25 - 100;
                    mt mt5 = this;
                    n25 += mt5.A.a();
                    n5 = 0;
                    while (n5 < objectArray.length) {
                        object2 = this.a.a(objectArray[n5] - 2, 0);
                        lv14 = lv2;
                        n3 = this.a(n3, lv14.a, n25 + ((n5 & 1) == 1 ? 40 : 0), ((at)object2).o(), n4, ((at)object2).o(), 6);
                        ++n5;
                    }
                    n24 -= 40;
                    n5 = 0;
                    while (n5 < 3) {
                        lv14 = lv2;
                        n3 = this.a(n3, lv14.a, n25 + cv.a(150), n24, n4, n24, 6);
                        n24 += 20;
                        ++n5;
                    }
                }
                n2 = 5;
                break;
            }
            case 2007: {
                lv lv15;
                int n26;
                n5 = 0;
                while (n5 < byArray3.length) {
                    object2 = this.a.a(objectArray[n5] + 1 - 2, byArray3[n5] + 1 - 2);
                    object = ((at)object2).n();
                    n26 = ((at)object2).o() - n6;
                    int n27 = 10 + cv.a(10) + 5;
                    lv15 = lv2;
                    n3 = this.a(n3, lv15.a, (int)object, n26, (int)object, 0, n27 + (n5 << 1));
                    if (n27 > n2) {
                        n2 = n27;
                    }
                    ++n5;
                }
                object = nArray[0] + nArray[2] / 2;
                n26 = nArray[1] + nArray[3] - 10;
                lv15 = lv2;
                this.a(n3, lv15.a, (int)object, n26, (int)object, 0, n2 - 15);
                this.c(n, n2, n2 - 6);
                break;
            }
            case 2008: {
                n4 = nArray[0] + nArray[2] / 2;
                n3 = nArray[1] + nArray[3] / 2;
                lv lv16 = lv2;
                n3 = this.a(0, lv16.a, 0, 0, n4, n3, 0);
                jl jl2 = (jl)this.o.b(n3);
                ((jl)this.o.b(n3)).s = byArray.length;
                int n28 = 0;
                while (n28 < byArray.length) {
                    object2 = this.a.a(byArray[n28] - 2, byArray2[n28] - 2);
                    jl2.t[n28].c(((at)object2).n(), ((at)object2).o());
                    ++n28;
                }
                this.a(n, 32, 22, false);
                n2 = 0;
                break;
            }
            case 4000: {
                object = nArray[0] + nArray[2] / 2;
                int n29 = nArray[1] + nArray[3] / 2;
                lv lv17 = lv2;
                n3 = this.a(0, lv17.a, object - n4, n29 - 180, (int)object, n29, 10);
                this.a(n, 32, 22, false);
                n2 = 10 + (cv.a(7) + 5);
                int n30 = 0;
                while (n30 < byArray3.length) {
                    object2 = this.a.a(objectArray[n30] - 2, byArray3[n30] - 2);
                    object = ((at)object2).n() + n5;
                    n29 = ((at)object2).o() + n6;
                    int n31 = 10 + cv.a(15);
                    lv17 = lv2;
                    n3 = this.a(n3, lv17.a, object - n4, n29 - 180, (int)object, n29, n31);
                    if (n31 > n2) {
                        n2 = n31;
                    }
                    ++n30;
                }
                break;
            }
            case 4001: {
                object = object2[0] + object2[2] / 2;
                int n32 = object2[1] + object2[3] - 10;
                lv lv18 = lv2;
                this.a(0, lv18.a, (int)object, n32, (int)object, n32, 10);
                this.b.c(10);
                n2 = 14;
                break;
            }
            case 4002: {
                object = object2[0] + object2[2] / 2;
                int n33 = object2[1] + object2[3] / 2 + 6;
                n4 = nArray[0] + nArray[2] / 2;
                lv lv19 = lv2;
                this.a(0, lv19.a, (int)object, n33, n4, n33, 10);
                this.a(n, 1, false, false);
                n2 = 15;
                break;
            }
            case 4003: {
                n4 = nArray[0] + nArray[2] / 2;
                n3 = nArray[1] + nArray[3];
                lv lv20 = lv2;
                this.a(0, lv20.a, n4, n3, n4, n3, 10);
                this.b.a(n, 10);
                this.c(n, 15, 16);
                n2 = 13;
                break;
            }
            case 4004: {
                this.d((int)object);
                n2 += 30;
                break;
            }
            case 4005: {
                object = object2[0] + object2[2] / 2;
                int n34 = object2[1] + object2[3] / 2;
                n4 = nArray[0] + nArray[2] / 2;
                n3 = nArray[1] + nArray[3] / 2;
                lv lv21 = lv2;
                this.a(0, lv21.a, (int)object, n34, n4, n3, 4);
                this.c(n, 26, 16);
                break;
            }
            case 4006: {
                n4 = nArray[0] + nArray[2] / 2;
                n3 = nArray[1] + nArray[3] / 2;
                lv lv22 = lv2;
                n3 = this.a(0, lv22.a, n4, n3 - 180, n4, n3, 0);
                this.c(n, 20, 10);
                int n35 = 0;
                while (n35 < byArray3.length) {
                    int n36 = cv.a(15) + 10;
                    object2 = this.a.a(objectArray[n35] + 1 - 2, byArray3[n35] + 1 - 2);
                    object = ((at)object2).n();
                    int n37 = ((at)object2).o();
                    lv22 = lv2;
                    n3 = this.a(n3, lv22.a, (int)object, n37 - 180, (int)object, n37, n36);
                    if (n36 > n2) {
                        n2 = n36;
                    }
                    ++n35;
                }
                break;
            }
            case 4007: {
                int n38 = 0;
                while (n38 < byArray3.length) {
                    object2 = this.a.a(objectArray[n38] + 3 - 1 - 2, byArray3[n38] + 1 - 2);
                    object = ((at)object2).n();
                    int n39 = ((at)object2).o() + n6;
                    int n40 = 10 + cv.a(15);
                    lv lv23 = lv2;
                    n3 = this.a(n3, lv23.a, (int)object, n39, (int)object, 0, n40);
                    if (n40 > n2) {
                        n2 = n40;
                    }
                    ++n38;
                }
                this.c(n, n2, n2 - 6);
                break;
            }
            case 4008: {
                object = nArray[0] + nArray[2] / 2;
                int n41 = nArray[1] + nArray[3] / 2;
                lv lv24 = lv2;
                n3 = this.a(0, lv24.a, object - n4, n41 - 180, (int)object, n41, 10);
                this.a(n, 32, 22, false);
                n2 = 10 + (cv.a(7) + 5);
                int n42 = 0;
                while (n42 < byArray3.length) {
                    object2 = this.a.a(objectArray[n42] - 2, byArray3[n42] - 2);
                    object = ((at)object2).n() + n5;
                    n41 = ((at)object2).o() + n6;
                    int n43 = 10 + cv.a(20);
                    lv24 = lv2;
                    n3 = this.a(n3, lv24.a, object - n4, n41 - 180, (int)object, n41, n43);
                    if (n43 > n2) {
                        n2 = n43;
                    }
                    ++n42;
                }
                break;
            }
        }
        return n2 - 3;
    }

    private int a(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        im im2;
        int n8;
        int n9;
        block29: {
            int n10 = n2;
            int n11 = n;
            mt mt2 = this;
            if (n11 < 0) {
                n9 = -1;
            } else {
                while (n11 < mt2.o.d()) {
                    im im3 = (im)mt2.o.b(n11);
                    if (!im3.m() && im3.r() == n10) {
                        n9 = n11;
                        break block29;
                    }
                    ++n11;
                }
                n9 = n8 = -1;
            }
        }
        if (n9 > 0) {
            im2 = (im)this.o.b(n8);
        } else {
            switch (n2) {
                case 1000: {
                    im2 = new is();
                    break;
                }
                case 1001: {
                    im2 = new it();
                    break;
                }
                case 1004: {
                    im2 = new iu();
                    break;
                }
                case 1005: {
                    im2 = new iv();
                    break;
                }
                case 1006: {
                    im2 = new iw();
                    break;
                }
                case 1007: {
                    im2 = new ix();
                    break;
                }
                case 1008: {
                    im2 = new iy();
                    break;
                }
                case 2000: {
                    im2 = new jg();
                    break;
                }
                case 2003: {
                    im2 = new jh();
                    break;
                }
                case 2004: {
                    im2 = new ji();
                    break;
                }
                case 2006: {
                    im2 = new jj();
                    break;
                }
                case 2007: {
                    im2 = new jk();
                    break;
                }
                case 2008: {
                    im2 = new jl();
                    break;
                }
                case 4000: {
                    im2 = new iz();
                    break;
                }
                case 4001: {
                    im2 = new ja();
                    break;
                }
                case 4002: {
                    im2 = new jb();
                    break;
                }
                case 4003: {
                    im2 = new jc();
                    break;
                }
                case 4005: {
                    im2 = new jd();
                    break;
                }
                case 4006: {
                    im2 = new je();
                    break;
                }
                case 4007: {
                    im2 = new jf();
                    break;
                }
                case 4008: {
                    im2 = new iz();
                    break;
                }
                default: {
                    return -1;
                }
            }
            im2.l(n2);
            this.o.a(im2);
            n8 = this.o.d() - 1;
        }
        im2.a(n3, n4, n5, n6, n7);
        return n8;
    }

    public final void a(boolean bl) {
        this.b.a(bl);
    }

    public final void a(bf bf2) {
        if (this.w != null) {
            this.w.b(bf2);
            return;
        }
        com.mg.sq.a.s().a("Kiểu quyết đấu: Không chơi Tuyệt Chiêu");
    }

    public final void a(int n, int n2, int n3, int n4) {
        n3 = 112 + this.a.n() - 14;
        n4 = 112 + this.a.o() - 14;
        this.t.a("Còn " + n2 + " lượt", n3, n4);
        if (n == 0) {
            this.t.a(bx.c);
            return;
        }
        this.t.a(com.mg.sq.a.h);
    }

    public final void j() {
        Object object = this.a;
        object = ((mh)object).a;
        this.u.a("Hết nước đi!", ((k)object).a + ((k)object).c / 2, ((k)object).b + ((k)object).d / 2);
    }

    public final void c(String string) {
        Object object = this.a;
        object = ((mh)object).a;
        this.c.a(string, ((k)object).a + ((k)object).c / 2, ((k)object).b + ((k)object).d / 2);
    }

    public final void k() {
        this.z.a("Vui lòng đừng gửi quá nhanh!", 0);
    }

    public final void l() {
        this.o.a();
    }

    public final void b(boolean bl) {
        mt mt2 = this;
        mt2.n.a();
        mt2 = this;
        mt2.m.a();
        mt2 = this;
        mt2.p.a();
        if (bl) {
            mt mt3 = this;
            mt3.o.a();
        }
        System.gc();
    }
}
