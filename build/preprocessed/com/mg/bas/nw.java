package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class nw
extends an
implements bf,
bg {
    private Image a;
    private Image b;
    private int[] c;
    private int[] d;
    private by k;
    private d l;
    private gg[] m;
    private int n;
    private mg o;
    private df[][] p;
    private df[][] q;
    private df[] r;
    private mb s;
    private mb t;
    private int u;
    private mb[][] v;
    private mb[][] w;
    private mb[] x;
    private boolean y;
    private gg z;
    private String[] A;

    public nw() {
        super(3);
        int[] nArray = new int[4];
        nArray[2] = 135;
        nArray[3] = 220;
        this.c = nArray;
        this.d = new int[2];
        this.A = new String[]{"Hỏa", "Lôi", "Thủy"};
        this.a = f.d("/createcs/bk");
        this.b = f.d("/createcs/stone");
        this.k = new by();
        this.k.c(true);
        this.l = bx.c;
        int n = v.t - this.c[2] - this.b.getWidth();
        int n2 = 5;
        if (n > 80) {
            n2 = 50;
        }
        n = n - n2 >> 1;
        this.c[0] = n + this.b.getWidth() + n2;
        this.c[1] = (v.u - ba.a - this.c[3]) / 2;
        this.d[0] = n;
        this.d[1] = this.c[1] + this.c[3] - 60;
        Object object = this;
        String[] stringArray = new String[]{"Giới Tính", "Hệ", "Khuôn Mặt", "Kiểu Tóc", "Màu Tóc", "Màu Da"};
        int[] nArray2 = new int[]{100, 101, 102, 103, 104, 105};
        ((nw)object).m = new gg[6];
        int n3 = ((nw)object).c[0] + 8;
        int n4 = ((nw)object).c[1] + 25;
        int n5 = 0;
        while (n5 < ((nw)object).m.length) {
            ((nw)object).m[n5] = new gg(stringArray[n5]);
            ((nw)object).m[n5].h(nArray2[n5]);
            ((nw)object).m[n5].a(((nw)object).l);
            ((nw)object).m[n5].a_(n5);
            ((nw)object).m[n5].a(n3, n4, 120, 16);
            ((nw)object).m[n5].a((bg)object);
            n4 += 33;
            ++n5;
        }
        ((nw)object).m[0].a(new String[]{"Nam", "Nữ"});
        ((nw)object).m[1].a(((nw)object).A);
        ((nw)object).m[0].d(true);
        this.g(false);
        this.f(false);
        this.a(com.mg.sq.a.n);
        object = new bs(new br[]{new br("Bắt đầu", 301), new br("Đăng Xuất", 302)});
        ((bs)object).a(this);
        this.a((bs)object);
    }

    private void e() {
        this.t = this.x[this.m[0].a()];
        int n = this.m[0].a();
        lh lh2 = new lh(0);
        new lh(0).W = this.r[n];
        lh2.U = this.p[n][this.m[3].a()];
        this.o = mb.a(lh2, this.w[n][this.m[3].a()], this.v[n][this.m[2].a()], this.s, this.t, false);
        this.o.c(2);
        this.o.c(this.d[0] + 30, this.d[1] - this.o.q() + 5);
    }

    protected final void e(int n, int n2) {
        int n3 = 0;
        while (n3 < this.m.length) {
            boolean bl = this.m[n3].c(n, n2);
            if (bl) {
                if (this.n != n3) {
                    this.m[this.n].d(false);
                    this.n = n3;
                    this.m[this.n].d(true);
                    return;
                }
            } else {
                this.u = 5;
            }
            ++n3;
        }
    }

    protected final void a(int n) {
        int n2 = this.m[this.n].f(n);
        if (n2 == 0) {
            n2 = this.n--;
            if (n == 99) {
                if (this.n < 0) {
                    this.n = this.m.length - 1;
                }
            } else if (n == 98) {
                ++this.n;
                if (this.n >= this.m.length) {
                    this.n = 0;
                }
            }
            if (n2 != this.n) {
                this.m[n2].d(false);
                this.m[this.n].d(true);
            }
        }
    }

    protected final void a(Graphics graphics) {
        if (v.u > this.a.getHeight()) {
            graphics.setColor(555256);
            graphics.fillRect(0, 0, v.t, v.u - this.a.getHeight());
        }
        int n = 0;
        while (n < v.t) {
            graphics.drawImage(this.a, n, v.u, 36);
            n += this.a.getWidth();
        }
        if (this.y) {
            return;
        }
        graphics.drawImage(this.b, this.d[0], this.d[1], 0);
        pc.a(graphics, this.c[0], this.c[1], this.c[2], this.c[3], 0xF0FBFF, true);
        if (this.o != null) {
            this.o.a(graphics);
        }
        n = 0;
        while (n < this.m.length) {
            this.m[n].a(graphics, 0, 0);
            ++n;
        }
    }

    protected final void c() {
        if (this.u > 0) {
            --this.u;
            if (this.u == 0) {
                nw nw2 = this;
                switch (nw2.z.b()) {
                    case 0: {
                        nw2.g();
                        break;
                    }
                    case 3: {
                        Object object = nw2;
                        df df2 = (df)((nw)object).m[3].q();
                        ((nw)object).m[4].a(df2.f);
                        ((nw)object).f();
                        break;
                    }
                    case 4: {
                        nw2.f();
                        break;
                    }
                    case 5: {
                        Object object = nw2;
                        df df2 = ((nw)object).r[((nw)object).m[0].a()];
                        df2.e = object = (dg)((nw)object).m[5].q();
                    }
                }
                nw2.e();
            }
        }
        if (this.o != null) {
            this.o.i();
        }
        int n = 0;
        while (n < this.m.length) {
            this.m[n].n();
            ++n;
        }
    }

    private void f() {
        df df2 = (df)this.m[3].q();
        ((df)this.m[3].q()).e = (dg)this.m[4].q();
    }

    private void g() {
        Object[] objectArray = this.p[this.m[0].a()];
        Object[] objectArray2 = this.q[this.m[0].a()];
        df df2 = this.r[this.m[0].a()];
        this.m[0].a();
        int n = 0;
        while (n < objectArray.length) {
            objectArray[n].e = objectArray[n].d;
            ++n;
        }
        n = 0;
        while (n < objectArray2.length) {
            objectArray2[n].e = objectArray2[n].d;
            ++n;
        }
        df2.e = df2.d;
        this.m[2].a(objectArray2);
        this.m[3].a(objectArray);
        this.m[4].a(((df)objectArray[0]).f);
        this.m[5].a(df2.f);
        this.e();
    }

    public final void a(df[] dfArray, df[] dfArray2, df[] dfArray3, df[] dfArray4, df[] dfArray5, df[] dfArray6) {
        this.p = new df[2][];
        this.p[0] = dfArray;
        this.p[1] = dfArray4;
        this.q = new df[2][];
        this.q[0] = dfArray2;
        this.q[1] = dfArray5;
        this.r = new df[2];
        this.r[0] = dfArray3[0];
        this.r[1] = dfArray6[0];
        this.s = new mb(89999);
        this.x = new mb[2];
        this.x[1] = new mb(79999);
        this.x[0] = new mb(79899);
        this.v = new mb[2][];
        int n = 0;
        while (n < 2) {
            this.v[n] = new mb[this.q[n].length];
            int n2 = 0;
            while (n2 < this.v[n].length) {
                this.v[n][n2] = new mb(this.q[n][n2].a + 99);
                ++n2;
            }
            ++n;
        }
        this.w = new mb[2][];
        n = 0;
        while (n < 2) {
            this.w[n] = new mb[this.p[n].length];
            int n3 = 0;
            while (n3 < this.w[n].length) {
                this.w[n][n3] = new mb(this.p[n][n3].a + 99);
                ++n3;
            }
            ++n;
        }
        this.g();
        com.mg.sq.a.s().v();
    }

    public final void d(int n, int n2) {
        switch (n2) {
            case 301: {
                com.mg.sq.a.s().a((String)null, (il)null);
                int[] nArray = new int[]{1, 2, 4};
                ks.a().a(this.m[0].a(), nArray[this.m[1].a()], this.p[this.m[0].a()][this.m[3].a()], this.q[this.m[0].a()][this.m[2].a()], this.r[this.m[0].a()]);
                break;
            }
            case 302: {
                com.mg.sq.a.u();
            }
        }
        this.c(false);
    }

    public final void d() {
        this.y = true;
        gy gy2 = new gy();
        gy2.b(241222);
        this.h();
        gy2.t();
        ag.b().a(gy2);
        co.b().a("lv1", -1);
        co.b().e();
    }

    public final void a(int n, int n2, Object object) {
        this.u = 5;
        this.z = (gg)object;
    }
}
