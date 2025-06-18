package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class gv
extends al
implements bf,
ii {
    private String[] k;
    private aq[] l;
    private int m = 0;
    private int[][] n;
    private short[] o;
    private String p;
    private fd q;
    private int[] r;
    private int[] s = new int[2];
    private int t = 10;

    public gv(String string, String string2, int[] nArray, long[] lArray, short[] object) {
        super(1);
        int n;
        int n2;
        this.p = string2;
        this.a(this);
        this.a((ba)null);
        this.f = v.t >= 240 ? v.t - 20 : 174;
        this.g = 125;
        this.r = nArray;
        this.o = object;
        this.k = bx.a(string, this.f - 10);
        this.l = new aq[2];
        int n3 = 5 + this.k.length * bx.c.a() + 6;
        int n4 = pe.a().a(object[0]);
        int n5 = pe.a().b(object[0]);
        int n6 = 1;
        while (n6 < ((short[])object).length) {
            n2 = pe.a().a(object[n6]);
            n = pe.a().b(object[n6]);
            if (n2 > n4) {
                n4 = n2;
            }
            if (n > n5) {
                n5 = n;
            }
            ++n6;
        }
        n6 = (n5 + 4 << 2) + 5 + 5 - 10;
        n2 = this.f - 5 - 5;
        n = n2 / (n4 + 4);
        n2 = n * (n4 + 4) + 5 + 5;
        this.f = n2 + 10 + 10;
        int n7 = this.f - n2 >> 1;
        this.q = new fd(n, ((short[])object).length);
        this.q.q().a(n7, n3, n2, n6);
        this.q.e(true);
        this.q.a(this);
        this.q.d(n4, n5);
        this.q.a(5, 5, 5, 5, 4, 4);
        this.l[0] = this.q.q();
        this.s[0] = 5;
        this.s[1] = n3 += this.l[0].f() + 6;
        Object object2 = new fx("Bảng giá:");
        ((fx)object2).d(false);
        ((fx)object2).a(5, n3 += 30, this.f - 10, 70);
        this.l[1] = object2;
        n5 = 0;
        while (n5 < nArray.length) {
            ey ey2 = new ey(String.valueOf(nArray[n5]) + "ngày <" + lArray[n5] + "KEN>", false);
            object = ey2;
            ey2.h(n5);
            ((fx)object2).a((ey)object);
            ++n5;
        }
        ((fx)object2).h(0);
        this.g = (n3 += this.l[1].f() + 6) + 5;
        this.c = v.t - this.f >> 1;
        this.d = v.u - ba.a - this.g >> 1;
        int[][] nArrayArray = new int[2][];
        int[] nArray2 = new int[4];
        nArray2[0] = 1;
        nArray2[2] = 1;
        nArrayArray[0] = nArray2;
        int[] nArray3 = new int[4];
        nArray3[0] = 1;
        nArray3[1] = 1;
        nArray3[2] = 1;
        nArrayArray[1] = nArray3;
        this.n = nArrayArray;
        this.l[this.m].d(true);
        this.a(new ba());
        object2 = new bd("Mua", 1);
        gv gv2 = this;
        gv2.a((az)object2, true);
        object2 = new bd("Đóng", 0);
        gv2 = this;
        gv2.b((az)object2, true);
    }

    public final void e(boolean bl) {
        super.e(bl);
        if (bl) {
            this.t = 10;
        }
    }

    public final void c(Graphics graphics) {
        if (!this.h) {
            return;
        }
        pc.a(graphics, this.c, this.d, this.f, this.g, v.aj, true);
        bx.a(graphics, bx.c, this.k, this.c + 10, this.d + 5, this.f - 10 - 10, this.k.length * bx.c.a(), 0);
        int n = 0;
        while (n < this.l.length) {
            if (this.l[n] != null) {
                this.l[n].a(graphics, this.c, this.d);
                this.l[n].c(true);
            }
            ++n;
        }
        n = this.s[0] + this.c;
        int n2 = this.s[1] + this.d;
        pe.a().a(graphics, this.o[this.q.a()], n, n2, 0);
        bx.d.a(graphics, pe.a().c(this.o[this.q.a()]), n + pe.a().a(this.o[this.q.a()]) + 5, n2, 0);
    }

    public final void d(int n, int n2) {
        switch (n2) {
            case 0: {
                ag.b().a(false);
                return;
            }
            case 1: {
                ag.b().a(false);
                if (!(this.l[1] instanceof fx)) break;
                du.a().a(this.p, this.r[((fx)this.l[1]).a().q()], this.o[this.q.a()]);
            }
        }
    }

    protected final void g() {
        int n = 0;
        while (n < this.l.length) {
            if (this.l[n] != null) {
                this.l[n].n();
            }
            ++n;
        }
        --this.t;
        if (this.t == 0) {
            this.e(false);
        }
    }

    public final void c(int n) {
        this.e(true);
        int n2 = this.m;
        switch (n) {
            case 95: {
                this.l[this.m].f(n);
                break;
            }
            case 96: 
            case 97: 
            case 98: 
            case 99: {
                if (this.l[this.m].f(n)) break;
                this.m = this.n[this.m][n - 96];
            }
        }
        if (this.m != n2) {
            this.l[n2].d(false);
            this.l[this.m].d(true);
        }
        this.h = true;
    }

    public final void a(int n, int n2) {
        this.e(true);
        n -= this.c;
        n2 -= this.d;
        int n3 = 0;
        while (n3 < this.l.length) {
            if (n > this.l[n3].c() && n < this.l[n3].c() + this.l[n3].e() && n2 > this.l[n3].d() && n2 < this.l[n3].d() + this.l[n3].f()) {
                if (this.m == n3) {
                    this.l[n3].c(n, n2);
                    return;
                }
                this.l[this.m].d(false);
                this.m = n3;
                this.l[this.m].d(true);
                return;
            }
            ++n3;
        }
    }

    public final void b(int n, int n2) {
        n -= this.c;
        n2 -= this.d;
        int n3 = 0;
        while (n3 < this.l.length) {
            this.l[n3].f(n, n2);
            ++n3;
        }
    }

    public final void c(int n, int n2) {
        this.e(true);
        int n3 = 0;
        while (n3 < this.l.length) {
            this.l[n3].e(n, n2);
            ++n3;
        }
    }

    public final void t() {
        this.m = 1;
        this.l[0].d(false);
        this.l[this.m].d(true);
    }

    public final void a(Graphics graphics, int n, int n2, int n3, int n4) {
        graphics.setColor(16177368);
        graphics.fillRect(n + 2, n2, n3, n4);
        pc.a(graphics, n + 2, n2, n3, n4 + 1, 0xFBB5B5, -1);
    }

    public final void b(Graphics graphics, int n, int n2, int n3, int n4) {
        int n5 = v.aj;
        int n6 = 10126946;
        if (this.l[0].m()) {
            n6 = 22523;
            n5 = 14479097;
        }
        pc.b(graphics, n, n2, n3, n4, n6, 0xFFFFFF, n5);
    }

    public final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5) {
        pe.a().a(graphics, this.o[n5], n + (n3 - pe.a().a(this.o[n5])) / 2 + 2, n2 + (n4 - pe.a().b(this.o[n5])) / 2, 0);
    }
}
