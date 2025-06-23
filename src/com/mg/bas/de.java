package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// Manages a UI or game component with multiple images, states, and rendering logic. Handles user interaction and display updates, extending aq.
public final class de
extends aq
implements bu {
    public k i;
    private Image m;
    public Image[] j;
    public Image[] k;
    private cu n;
    private boolean[] o;
    private boolean[] p;
    private int[][] q;
    private int[] r;
    private int[] s;
    public int l;
    private k t;
    private byte[] u;
    private Image v = com.mg.bas.f.d("/info/increase");
    private Image w = com.mg.bas.f.d("/info/decrease");
    private boolean x = false;
    private lw[] y = null;
    private bq z;
    private lh A;
    private int B = 0;
    private int[][] C;
    private int D;

    public de(int n) {
        int[][] nArrayArray = new int[9][];
        nArrayArray[0] = new int[]{-1, 1, 3, 6};
        int[] nArray = new int[4];
        nArray[1] = 2;
        nArray[2] = 3;
        nArray[3] = 6;
        nArrayArray[1] = nArray;
        nArrayArray[2] = new int[]{1, -1, 4, 7};
        int[] nArray2 = new int[4];
        nArray2[1] = 4;
        nArray2[2] = -1;
        nArray2[3] = 1;
        nArrayArray[3] = nArray2;
        nArrayArray[4] = new int[]{3, 5, -1, 2};
        nArrayArray[5] = new int[]{4, -1, -1, 8};
        int[] nArray3 = new int[4];
        nArray3[1] = 7;
        nArray3[2] = 1;
        nArray3[3] = -1;
        nArrayArray[6] = nArray3;
        nArrayArray[7] = new int[]{6, 8, 2, -1};
        nArrayArray[8] = new int[]{7, -1, 5, -1};
        this.C = nArrayArray;
        de de2 = this;
        this.j = new Image[go.r.length];
        de2.k = new Image[go.r.length];
        de2.m = com.mg.bas.f.d("/info/skilltree");
        int n2 = 0;
        while (n2 < go.r.length) {
            int n3;
            int n4 = n3 = go.r[n2].a * 1000;
            Object object = pa.a();
            object = ((pa)object).b(n4, false);
            de2.j[n2] = Image.createImage((byte[])object, 0, ((byte[])object).length);
            com.mg.bas.h.a((byte[])object, 0);
            de2.k[n2] = Image.createImage((byte[])object, 0, ((byte[])object).length);
            ++n2;
        }
        this.n = new cu(28, 9);
        this.i = new k(0, 0, 218, 218);
        this.q = new int[][]{{94, 11}, {94, 101}, {94, 152}, {29, 76}, {29, 127}, {29, 178}, {160, 76}, {160, 127}, {160, 178}};
    }

    public final void a(bq bq2) {
        this.z = bq2;
    }

    public final k a() {
        return new k(this.q[this.l][0] - this.t.a + this.i.a, this.q[this.l][1] - this.t.b + this.i.b, 30, 30);
    }

    public final void a(Graphics graphics, int n, int n2) {
        try {
            int n3 = this.d.a + n;
            int n4 = this.d.b + n2;
            pc.a(graphics, this.i.a + n, this.i.b + n2, this.i.c);
            pc.a(graphics, n3, n4 + this.d.d, this.d.c);
            cw.a(graphics, cw.a);
            cw.a(graphics, n3, n4 + 4, this.d.c, this.d.d - 8);
            if (this.t == null) {
                this.t = ((ay)this.l()).q();
            }
            graphics.drawImage(this.m, this.n.a + (n += this.i.a - this.t.a), this.n.b + (n2 += this.i.b - this.t.b), 20);
            graphics.drawRegion(this.m, 0, 0, this.m.getWidth(), this.m.getHeight(), 2, this.n.a + n + this.m.getWidth() - 1, this.n.b + n2, 20);
            int n5 = 0;
            while (n5 < this.q.length) {
                Image image = this.k[n5];
                n3 = this.q[n5][0] + n;
                n4 = this.q[n5][1] + n2;
                if (this.o[n5]) {
                    image = this.j[n5];
                    graphics.drawImage(image, n3, n4, 0);
                    d d2 = this.s[n5] > 0 ? com.mg.sq.a.h : bx.c;
                    d2.a(graphics, String.valueOf(this.r[n5]), n3 + image.getWidth(), n4 + image.getHeight() - bx.c.a(), 2);
                } else {
                    graphics.drawImage(image, n3, n4, 0);
                }
                ++n5;
            }
            n5 = 0;
            while (n5 < this.o.length) {
                if (this.p[n5]) {
                    pc.b(graphics, this.q[n5][0] + n + 30 - 6, this.q[n5][1] + n2 + 1, 5, 5, 0xFFFFFF, 16069679);
                }
                ++n5;
            }
            if (this.l < 0) {
                return;
            }
            n3 = this.q[this.l][0] + n;
            n4 = this.q[this.l][1] + n2;
            pc.a(graphics, new k(n3 - 4, n4 - 4, 38, 38), 0);
            if (this.x) {
                int n6 = this.j[0].getHeight();
                n3 += this.j[0].getWidth();
                Graphics graphics2 = graphics;
                de de2 = this;
                switch (de2.u[de2.l]) {
                    case 2: {
                        graphics2.drawImage(de2.w, n3 + 5, n4 + n6, 36);
                        break;
                    }
                    case 4: {
                        graphics2.drawImage(de2.v, n3 + 5, n4, 20);
                        break;
                    }
                    case 3: {
                        graphics2.drawImage(de2.v, n3 + 5, n4, 20);
                        graphics2.drawImage(de2.w, n3 + 5, n4 + n6, 36);
                    }
                    default: {
                        break;
                    }
                }
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        cw.c(graphics, cw.a);
    }

    public final void a(lh object) {
        int n;
        Object object2;
        this.A = object;
        this.D = this.B = ((lh)object).L;
        this.s = new int[go.r.length];
        this.u = new byte[go.r.length];
        this.r = new int[go.r.length];
        this.o = new boolean[go.r.length];
        this.A = object;
        int n2 = 0;
        while (n2 < ((lh)object).E.length) {
            object2 = ((lh)object).E[n2];
            n = ((ld)object2).a % 100;
            this.o[n] = true;
            this.r[n] = ((lh)object).E[n2].f;
            ++n2;
        }
        Object[] objectArray = go.r;
        this.y = go.r;
        objectArray = this.A.E;
        this.o = new boolean[this.y.length];
        n = 0;
        while (n < objectArray.length) {
            object2 = objectArray[n];
            int n3 = ((ld)object2).a % 100;
            this.o[n3] = true;
            ++n;
        }
        n = 0;
        while (n < this.y.length) {
            if (!this.o[n] && this.i(n)) {
                this.o[n] = true;
            }
            ++n;
        }
        this.z();
    }

    public final cu h(int n) {
        if (this.t == null) {
            this.t = ((ay)this.l()).q();
        }
        int n2 = this.i.a - this.t.a;
        int n3 = this.i.b - this.t.b;
        return new cu(this.q[n][0] + n2, this.q[n][1] + n3);
    }

    private boolean k(int n) {
        boolean bl;
        boolean bl2 = bl = this.y[n].d < 0 || this.r[this.y[n].d % 100] > 0;
        return this.B > 0 && this.r[n] < this.y[n].c.length && this.B >= this.y[n].c[this.r[n]].c && this.A.G >= this.y[n].c[this.r[n]].b && bl;
    }

    private void l(int n) {
        if (this.s[n] > 0) {
            this.u[n] = (byte)(this.r[n] < this.y[n].c.length && this.k(n) ? 3 : 2);
        } else {
            if (this.B >= this.y[n].c[this.r[n]].c && this.k(n)) {
                this.u[n] = 4;
            }
            n = 0;
            while (n < this.r.length) {
                if (this.r[n] == 0) {
                    int n2 = n;
                    while (n2 < this.r.length) {
                        if (this.y[n2].d == this.y[n].a) {
                            while (this.r[n2] > 0) {
                                int n3 = n2;
                                this.s[n3] = this.s[n3] - 1;
                                int n4 = n2;
                                this.r[n4] = this.r[n4] - 1;
                                this.B += this.y[n2].c[this.r[n2]].c;
                            }
                        }
                        ++n2;
                    }
                }
                ++n;
            }
        }
        this.z();
    }

    public final g v() {
        return new g(this.i.c, this.i.d);
    }

    public final int w() {
        return 10;
    }

    public final void e(boolean bl) {
        this.x = bl;
        this.l(this.l);
    }

    public final boolean q() {
        return this.x;
    }

    public final boolean c(int n2, int n3) {
        if (this.t == null) {
            this.t = ((ay)this.l()).q();
        }
        n2 -= this.i.a;
        n3 -= this.i.b;
        int n4 = this.q[this.l][1];
        if (this.x) {
            if (new k(this.q[this.l][0] + 30, this.q[this.l][1], 15, 15).a(n2, n3)) {
                this.f(99);
                return true;
            }
            if (new k(this.q[this.l][0] + 30, this.q[this.l][1] + 15, 15, 15).a(n2, n3)) {
                this.f(98);
                return true;
            }
        } else {
            if (new k(this.q[this.l][0], this.q[this.l][1], 30, 30).a(n2, n3)) {
                this.f(95);
                return true;
            }
            int n5 = 0;
            while (n5 < this.q.length) {
                if (new k(this.q[n5][0], this.q[n5][1], 30, 30).a(n2, n3)) {
                    this.l = n5;
                    if (this.z != null) {
                        this.z.a(this, this.l);
                    }
                    this.e(0, n4 - this.q[n5][1]);
                    return true;
                }
                ++n5;
            }
        }
        return false;
    }

    private void z() {
        if (this.p == null) {
            this.p = new boolean[go.r.length];
        }
        int n2 = 0;
        while (n2 < this.p.length) {
            if (this.r[n2] < this.y[n2].c.length && this.i(n2)) {
                this.o[n2] = true;
            } else if (this.r[n2] == 0) {
                this.o[n2] = false;
            }
            this.p[n2] = this.i(n2) & this.o[n2];
            ++n2;
        }
    }

    public final boolean i(int n2) {
        boolean bl;
        boolean bl2 = bl = this.y[n2].d < 0 || this.r[this.y[n2].d % 100] > 0;
        if (this.B > 0 && this.r[n2] < this.y[n2].c.length && this.B >= this.y[n2].c[this.r[n2]].c && this.A.G >= this.y[n2].c[this.r[n2]].b && bl) {
            return true;
        }
        return this.s[n2] > 0 && bl;
    }

    public final boolean f(int n2) {
        int n3 = this.l;
        switch (n2) {
            case 99: {
                if (this.x) {
                    if (this.u[this.l] <= 2) break;
                    this.B -= this.y[this.l].c[this.r[this.l]].c;
                    int n4 = this.l;
                    this.s[n4] = this.s[n4] + 1;
                    int n5 = this.l;
                    this.r[n5] = this.r[n5] + 1;
                    this.l(this.l);
                    break;
                }
                if (this.C[this.l][0] < 0) break;
                this.l = this.C[this.l][0];
                ((ay)this.l()).j(-40);
                break;
            }
            case 98: {
                if (this.x) {
                    if (this.s[this.l] <= 0) break;
                    int n6 = this.l;
                    this.s[n6] = this.s[n6] - 1;
                    int n7 = this.l;
                    this.r[n7] = this.r[n7] - 1;
                    this.B += this.y[this.l].c[this.r[this.l]].c;
                    this.l(this.l);
                    break;
                }
                if (this.C[this.l][1] < 0) break;
                this.l = this.C[this.l][1];
                ((ay)this.l()).j(40);
                break;
            }
            case 97: {
                if (this.x) {
                    return true;
                }
                if (this.C[this.l][2] < 0) break;
                this.l = this.C[this.l][2];
                break;
            }
            case 96: {
                if (this.x) {
                    return true;
                }
                if (this.C[this.l][3] < 0) break;
                this.l = this.C[this.l][3];
                break;
            }
            case 95: {
                if (this.z == null) break;
                this.z.b(this, this.l);
            }
        }
        if (this.z != null && n2 != 95) {
            this.z.a(this, n3, this.l);
        }
        return true;
    }

    public final boolean e(int n2, int n3) {
        ay ay2 = (ay)this.l();
        ay2.j(-n3);
        return false;
    }

    public final int r() {
        return this.r[this.l];
    }

    public final lw[] s() {
        return this.y;
    }

    public final lw t() {
        return this.y[this.l];
    }

    public final lw j(int n2) {
        return this.y[n2];
    }

    public final boolean u() {
        return this.D - this.B > 0;
    }

    public final int[] x() {
        return this.s;
    }

    public final int y() {
        return this.B;
    }
}
