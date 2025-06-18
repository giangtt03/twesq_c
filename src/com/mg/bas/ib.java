package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class ib
extends al
implements b,
bf,
bq {
    private lh k;
    private ay l;
    private boolean m = false;
    private k n = new k(0, 0, v.t, v.u);
    private int o;
    private String[] p;
    private cu q = null;
    private k r = null;
    private cu s = null;
    private k t = null;
    private k u = null;
    private int v = 0;
    private int w = 2;
    private int x = 0;
    private String[] y = null;
    private byte z;
    private az A;
    private az B;
    private az C;
    private az D;
    private k E;
    private de F;
    private k G;
    private cu H;
    private bs I;
    private boolean J;
    private fv K;
    private k L;
    private gj M;
    private int N = 0;
    private boolean O = false;
    private String[] P = new String[]{"Chọn tuyệt chiêu có biểu tượng + màu đỏ. Bấm phím giữa. Rồi chọn nâng cấp.", "Bấm phím lên để tăng cấp, nếu sau khi tăng muốn giảm lại phấm phím xuống. Xong rồi thì bấm phím giữa", "Chọn menu trái > Cập nhật. Để cập nhật tuyệt chiêu cho nhân vật"};

    public ib() {
        super(1);
        this.b(241203);
        this.a(new ba());
        this.f = 240;
        this.g = 320 - ba.a;
        this.c = 0;
        this.d = 0;
        if (ib.t()) {
            this.f = v.t;
            this.g = 240 - ba.a;
        }
        this.c = v.t >= this.f ? (v.t - this.f) / 2 : 0;
        this.d = v.u >= this.g ? (v.u - ba.a - this.g) / 2 : 0;
        this.a(this.c, this.d, this.f, this.g);
        this.a(go.k);
        ib ib2 = this;
        this.H = new cu(10, 22);
        ib2.q = new cu(ib2.H.a, ib2.H.b + 30 + 4);
        ib2.r = new k(ib2.H.a, 0, ib2.f - 30, 100);
        ib2.t = new k(12, 32, 218, 218);
        ib2.t.a = (ib2.f - ib2.t.c) / 2;
        ib2.u = new k(161, 10, 69, 14);
        if (ib.t()) {
            ib2.q = new cu(ib2.H.a + 30 + 4, ib2.H.b + 4);
            ib2.t.d = 138;
            ib2.u.a = ib2.f - ib2.u.c - 10;
        }
        ib2.s = new cu(ib2.u.a + ib2.u.c / 2, ib2.u.b + 1);
        ib2.G = new k(ib2.t.a, ib2.t.b + ib2.t.d + 4, ib2.t.c, 34);
        ib2.A = new gb(0, 0);
        ib2.B = new bd("Đóng", 10);
        ib2.D = new gb(12, 2);
        ib2.C = new gb(13, 3);
        ib2.F = new de(ib2.k.g / 2);
        ib2.F.a(ib2.k);
        ib2.F.i = new k(ib2.t.a, ib2.t.b, 218, 218);
        ib2.F.a(ib2);
        ib2.l = new ay();
        ib2.l.a(new k(ib2.t.a, ib2.t.b, ib2.t.c, ib2.t.d));
        ib2.l.b(ib2.F);
        ib2.l.h(1);
        ib2.a((byte)0);
        this.a(this);
        if (!cs.a.c(142)) {
            od.h(142);
            gr.n = false;
        }
    }

    private static boolean t() {
        return com.mg.sq.a.k == 1;
    }

    public final void c(Graphics graphics) {
        cw.a(graphics, this.n);
        pc.d(graphics, this.c, this.d, this.f, this.g, v.aj);
        cw.b(graphics, new k(this.c, this.d, this.f, this.g));
        int n = this.u.a + this.c;
        int n2 = this.u.b + this.d;
        pc.b(graphics, n, n2, this.u.c, this.u.d, 1070484, 16579764, 14542575);
        bx.d.c(true);
        bx.d.a(graphics, "Điểm Kỹ Năng", n - 5, n2, 2);
        bx.d.c(false);
        bx.e.a(graphics, String.valueOf(this.F.y()), this.s.a + this.c, this.s.b + this.d, 1);
        switch (this.z) {
            case 0: {
                int n3 = this.d;
                int n4 = this.c;
                Graphics graphics2 = graphics;
                ib ib2 = this;
                if (ib2.l != null) {
                    ib2.l.a(graphics2, n4, n3);
                    ib2.l.c(true);
                }
                if (this.F.t().b == null) break;
                bx.d.c(true);
                int n5 = this.c + this.G.a;
                int n6 = this.d + this.G.b;
                bx.d.a(graphics, this.F.t().b, n5 + 8, n6 + 4, 0);
                bx.d.c(false);
                if (this.F.r() > 0) break;
                bx.d.a(graphics, "Chưa học", n5 + 8, n6 + bx.d.a() + 4, 0);
                break;
            }
            default: {
                int n7 = this.d;
                int n8 = this.c;
                Graphics graphics3 = graphics;
                ib ib3 = this;
                if (ib3.F.r() > 0) {
                    graphics3.drawImage(ib3.F.j[ib3.v], ib3.H.a + n8, ib3.H.b + n7, 0);
                } else {
                    graphics3.drawImage(ib3.F.k[ib3.v], ib3.H.a + n8, ib3.H.b + n7, 0);
                }
                bx.c.a(graphics3, String.valueOf(ib3.F.r()), ib3.H.a + n8 + ib3.F.j[ib3.v].getWidth(), ib3.H.b + n7 + ib3.F.j[ib3.v].getHeight() - bx.c.a(), 2);
                int n9 = ib3.q.a + n8;
                if (ib3.F.t().b != null) {
                    bx.d.c(true);
                    bx.d.a(graphics3, ib3.F.t().b, ib3.q.a + n8, ib3.q.b + n7, 0);
                    bx.d.c(false);
                }
                n7 = ib3.q.b + n7 + bx.d.a();
                if (ib3.F.r() <= 0) {
                    com.mg.sq.a.h.a(graphics3, "Chưa học", n9, n7, 0);
                    n7 += bx.d.a();
                } else {
                    bx.c.a(graphics3, " - Tiêu hao nội lực: " + ib3.o / 9 + " thành nội lực", n9, n7, 0);
                    n7 += com.mg.sq.a.h.a();
                }
                pc.a(graphics3, ib3.c + 4, n7 + 4, ib3.f - 8);
                com.mg.sq.a.g.a(graphics3, "Mô Tả: ", ib3.c + ib3.f / 2, n7 += 8, 1);
                n7 += bx.d.a();
                if (ib3.y != null) {
                    bx.a(graphics3, bx.c, ib3.y, ib3.r.a + n8, n7, ib3.r.c, ib3.r.d, 0);
                    String[] cfr_ignored_0 = ib3.y;
                    bx.c.a();
                }
                if (ib3.F.r() >= ib3.F.t().c.length) break;
                pc.b(graphics3, ib3.E.a, ib3.E.b, ib3.E.c, ib3.E.d, v.aj, false);
                n7 = ib3.E.b + 5;
                com.mg.sq.a.h.a(graphics3, ib3.F.r() > 0 ? "Điều kiện tăng cấp: " : "Điều kiện được học: ", ib3.E.a + 4, n7, 0);
                bx.a(graphics3, com.mg.sq.a.h, ib3.p, ib3.E.a + 4, n7 += com.mg.sq.a.h.a(), ib3.E.c, ib3.E.d, 0);
                n8 = ib3.F.r() > 0 ? ib3.F.r() - 1 : 0;
                com.mg.sq.a.h.a(graphics3, " + Tiêu hao: " + ib3.F.t().c[n8].c + " điểm kỹ năng", ib3.E.a + 4, n7 += ib3.p.length * com.mg.sq.a.h.a(), 0);
            }
        }
        if (this.K != null) {
            this.K.a(graphics, 0, 0);
        }
        if (!this.J) {
            cw.c(graphics, this.n);
        }
        if (this.I != null) {
            this.I.a(graphics, 0, 0);
        }
        if (this.M != null) {
            this.M.a(graphics);
        }
    }

    private void a(byte by) {
        this.z = by;
        switch (this.z) {
            case 0: {
                this.a(com.mg.sq.a.n);
                Object object = this.A;
                Object object2 = this;
                ((am)object2).a((az)object, true);
                object = object2 = new gb(1112, 3);
                object2 = this;
                ((am)object2).b((az)object, true);
                return;
            }
            case 1: {
                this.e(this.v);
                az az2 = null;
                ib ib2 = this;
                ib2.a(az2, true);
                az2 = null;
                ib2 = this;
                ib2.b(az2, true);
                this.a(this.B);
            }
        }
    }

    protected final void g() {
        if (this.l != null) {
            this.l.n();
        }
        ++this.x;
        if (this.x > 3) {
            this.x = 0;
            this.w = -this.w;
        }
        if (this.I != null) {
            this.I.n();
            return;
        }
        if (this.K != null) {
            this.K.i();
        }
        if (this.M != null) {
            this.M.i();
        }
    }

    public final void a(lh lh2) {
        this.k = lh2;
        if (this.F != null) {
            this.F.a(lh2);
        }
    }

    private void e(int n) {
        int n2;
        String string;
        int n3 = n;
        de de2 = this.F;
        this.F.l = n3;
        int n4 = this.F.r();
        lw[] lwArray = this.F.s();
        if (n4 == 0) {
            this.p = new String[2];
            this.p[0] = " + Nhân vật đạt cấp: " + lwArray[n].c[n4].b;
            string = "";
            n2 = 0;
            while (n2 < lwArray.length) {
                if (lwArray[n2].a == lwArray[n].d) {
                    string = lwArray[n2].b;
                    break;
                }
                ++n2;
            }
            this.p[1] = " + Phải học: " + string;
        } else if (this.F.r() < lwArray[n].c.length) {
            this.p = new String[1];
            this.p[0] = " + Nhân vật đạt cấp: " + lwArray[n].c[n4].b;
        }
        this.o = n4 - 1 < 0 ? lwArray[n].c[0].d : lwArray[n].c[n4 - 1].d;
        string = n4 - 1 < 0 ? "Nếu sau khi học sẽ: " + lwArray[n].c[0].e : lwArray[n].c[n4 - 1].e;
        this.y = bx.a(string, this.r.c, bx.c);
        if (this.p != null) {
            n2 = (this.p.length + 2) * bx.c.a() + 4 + 4;
            this.E = new k(this.c + 7, this.d + this.g - n2 - 10, this.f - 15, n2);
        }
    }

    public final void c(int n) {
        if (this.I != null) {
            boolean bl;
            int n2 = n;
            az[] azArray = this.I.a();
            ib ib2 = this;
            if (n2 == 94 && azArray[0] != null && azArray[0].b()) {
                if (ib2.i != null) {
                    ib2.i.d(-1, azArray[0].a());
                }
                bl = true;
            } else if (n2 == 95 && azArray[1] != null && azArray[1].b()) {
                if (ib2.i != null) {
                    ib2.i.d(-1, azArray[1].a());
                }
                bl = true;
            } else if (n2 == 93 && azArray[2] != null && azArray[2].b()) {
                if (ib2.i != null) {
                    ib2.i.d(-1, azArray[2].a());
                }
                bl = true;
            } else {
                bl = false;
            }
            if (bl) {
                v.c();
                return;
            }
            if (this.I.f(n)) {
                return;
            }
            this.u();
            return;
        }
        if (this.z == 1) {
            switch (n) {
                case 97: 
                case 99: {
                    --this.v;
                    if (this.v < 0) {
                        this.v = this.F.s().length - 1;
                    }
                    this.e(this.v);
                    return;
                }
                case 96: 
                case 98: {
                    ++this.v;
                    if (this.v >= this.F.s().length) {
                        this.v = 0;
                    }
                    this.e(this.v);
                }
            }
            return;
        }
        if (this.l != null) {
            this.l.f(n);
        }
    }

    public final void d(int n) {
        if (this.I != null && this.I.g(n)) {
            return;
        }
    }

    public final int a(Object object, Object object2) {
        if (object instanceof lv) {
            object = (lv)object;
            object2 = (lv)object2;
            return ((ld)object2).a - ((ld)object).a;
        }
        object = (lw)object;
        object2 = (lw)object2;
        return ((lw)object2).a - ((lw)object).a;
    }

    private void a(bs object) {
        this.I = object;
        az az2 = this.C;
        object = this;
        ((am)object).b(az2, true);
        az2 = this.D;
        object = this;
        ((am)object).a(az2, true);
        this.a(new bd("", 12));
    }

    private void u() {
        v.c();
        this.I = null;
        this.e(true);
        this.a(this.z);
        this.J = false;
        if (this.m) {
            this.m = false;
            this.a(new bd("Xong", 20));
        }
    }

    public final void d(int n, int n2) {
        boolean bl;
        int n3 = n2;
        ib ib2 = this;
        switch (n3) {
            case 1111: {
                com.mg.sq.a.G();
                if (ib2.F.u()) {
                    ib2.w();
                    bl = true;
                    break;
                }
                ag.b().a(ib2.h(), false);
                bl = true;
                break;
            }
            case 1112: {
                if (ib2.F.u()) {
                    ib2.w();
                    bl = true;
                    break;
                }
                ag.b().a(ib2.h(), false);
                bl = true;
                break;
            }
            case 1113: {
                ib2.v();
                bl = true;
                break;
            }
            case 1114: {
                ib2.a((byte)1);
                bl = true;
                break;
            }
            case 1115: {
                ib2.k(true);
                ib2.m = true;
                k k2 = ib2.L;
                ib ib3 = ib2;
                String string = ib3.F.r() - 1 < 0 ? "Bấm phím lên để nâng cấp." : ib3.F.t().c[ib3.F.r() - 1].e;
                ib3.K = new fv();
                int n4 = ib3.c + 10;
                int n5 = ib3.d + k2.b + k2.d + 3;
                ib3.K.a(n4, n5, ib3.f - 20, ib3.g / 4);
                ib3.K.a(string);
                if (n5 + ib3.K.q() > ib3.d + ib3.g) {
                    n5 = ib3.d + k2.b - ib3.K.q() - 3;
                }
                ib3.K.c(v.t + ib3.K.p(), n5);
                ib3.K.a(n4, n5);
                if (ib2.O && ib2.N < 2) {
                    ib2.M = null;
                    ib2.M = new gj(ib2.P[ib2.N], ib2.f / 2 + ib2.c, ib2.d + ib2.g - 8, ib2.f - 20, 75, false);
                    ++ib2.N;
                }
                bl = true;
                break;
            }
            default: {
                bl = false;
            }
        }
        if (bl) {
            this.u();
            return;
        }
        switch (n2) {
            case 9: {
                return;
            }
            case 0: {
                ib2 = this;
                bs bs2 = new bs();
                if (ib2.F.u()) {
                    bs2.a(new br[]{new br("Cập nhật", 1113), new br("Chi Tiết", 1114), new br("Nhân Vật", 1111), new br("Đóng", 1112)});
                } else {
                    bs2.a(new br[]{new br("Chi Tiết", 1114), new br("Nhân Vật", 1111), new br("Đóng", 1112)});
                }
                int n6 = bs2.e() > bs2.f() ? bs2.e() : bs2.f();
                bs2.a_(-n6, ib2.j() - bs2.f() + n6);
                bs2.d(0, v.u - ba.a - bs2.f());
                bs2.a(ib2);
                ib2.a(bs2);
                ib2.k(false);
                if (ib2.O && ib2.N > 2) {
                    ib2.M = null;
                    ib2.O = false;
                }
                return;
            }
            case 10: {
                this.a((byte)0);
                return;
            }
            case 13: {
                this.u();
                return;
            }
            case 12: {
                this.I.f(95);
                return;
            }
            case 16: {
                ag.b().e(-4561239);
                this.u();
                ag.b().a(this.h(), false);
                return;
            }
            case 15: {
                ag.b().e(-4561239);
                this.v();
                this.u();
                com.mg.sq.a.s().e(this.h());
                return;
            }
            case 19: {
                this.u();
                return;
            }
            case 20: {
                this.k(false);
                this.a(com.mg.sq.a.n);
                return;
            }
            case 21: {
                this.I.f(95);
            }
        }
    }

    public final void a(int n, int n2) {
        if (this.I != null) {
            boolean bl;
            block7: {
                int n3 = n2;
                int n4 = n;
                az[] azArray = this.I.a();
                ib ib2 = this;
                int n5 = 0;
                while (n5 < azArray.length) {
                    if (azArray[n5] != null && azArray[n5].a(n4, n3)) {
                        if (ib2.i != null) {
                            ib2.i.d(-1, azArray[n5].a());
                        }
                        bl = true;
                        break block7;
                    }
                    ++n5;
                }
                bl = false;
            }
            if (bl) {
                return;
            }
            if (this.I.c(n, n2)) {
                return;
            }
            this.u();
            return;
        }
        if (this.z == 1) {
            return;
        }
        this.l.c(n -= this.c, n2 -= this.d);
    }

    public final void b(int n, int n2) {
        if (this.I != null && this.I.f(n, n2)) {
            return;
        }
        if (this.z == 1) {
            return;
        }
        this.l.c(n, n2);
    }

    public final void c(int n, int n2) {
        if (this.I != null && this.I.e(n, n2)) {
            return;
        }
        if (this.z == 1) {
            return;
        }
        this.l.e(n, n2);
    }

    private void v() {
        com.mg.sq.a.s().a((String)null, (il)null);
        int[] nArray = new int[this.F.s().length];
        int n = 0;
        while (n < nArray.length) {
            nArray[n] = this.F.j((int)n).a;
            ++n;
        }
        ks.a().a(nArray, this.F.x());
    }

    private void w() {
        al al2 = ag.b().a("Chú ý", "Chưa cập nhật điểm cho nhân vật. Bạn muốn cập nhật không?", "Có", 15, "Không", 16, 1);
        al2.a(this);
        al2.b(-4561239);
        ag.b().a(al2, false);
    }

    private void k(boolean bl) {
        if (this.F != null) {
            this.F.e(bl);
        }
        if (!bl) {
            this.K = null;
            if (this.O && this.N == 2) {
                this.M = new gj(this.P[this.N], 10, v.u - ba.a - 8, 200, 70, false);
                this.M.f(10);
                this.M.a(10);
                this.M.a(new k(this.M.n() + 9, this.M.o() + 9, this.M.p() - 20, this.M.q() - 20));
                this.M.c(true);
                ++this.N;
            }
        }
    }

    public final void j(boolean n) {
        if (gr.q && go.k.G < 10) {
            od.h(145);
            gr.q = false;
            n = 0;
            while (n < go.r.length) {
                if (this.F.i(n)) {
                    this.O = true;
                    this.N = 0;
                    cu cu2 = this.F.h(n);
                    this.M = new gj(this.P[this.N], 10 + this.c, cu2.b - 10 + this.d, this.f - 20, 70, false);
                    this.M.f(10 + this.c);
                    this.M.a(cu2.a + 15);
                    if (this.M.o() < 0) {
                        this.M.g(cu2.b + 35 + this.d);
                        this.M.a(true);
                    }
                    this.M.a(new k(this.M.n() + 9, this.M.o() + 9, this.M.p() - 20, this.M.q() - 20));
                    ++this.N;
                    return;
                }
                ++n;
            }
        }
    }

    public final void b(aq object, int n) {
        int n2 = this.F.i(n);
        k k2 = this.F.a();
        object = this;
        this.L = k2;
        bs bs2 = new bs();
        if (n2 != 0) {
            bs2.a(new br[]{new br("Nâng cấp", 1115), new br("Chi Tiết", 1114), new br("Đóng", 1112)});
        } else {
            bs2.a(new br[]{new br("Chi Tiết", 1114), new br("Đóng", 1112)});
        }
        n2 = ((al)object).c + k2.a + (k2.c - bs2.e()) / 2;
        int n3 = ((al)object).d + k2.b + k2.d;
        if (n3 + bs2.f() > ((al)object).d + ((am)object).g) {
            n3 = ((al)object).d + ((am)object).g - bs2.f();
        }
        n2 = n2 < ((al)object).c ? ((al)object).c : (n2 + bs2.e() > ((al)object).c + ((am)object).f ? ((al)object).c + ((am)object).f - bs2.e() : n2);
        bs2.a_(v.t + bs2.e(), n3);
        bs2.d(n2, n3);
        bs2.a((bf)object);
        bs2.a_(1);
        super.a(bs2);
        ((ib)object).J = true;
        if (((ib)object).N == 1 && ((ib)object).M != null) {
            ((ib)object).M.g(((ib)object).M.o() + (((ib)object).M.a() ? 70 : 0));
            ((ib)object).M.a(new k(((ib)object).M.n() + 9, ((ib)object).M.o() + 9, ((ib)object).M.p() - 20, ((ib)object).M.q() - 20));
        }
    }

    public final void a(aq aq2, int n) {
    }

    public final void a(aq object, int n, int n2) {
        if (this.F.q()) {
            if (this.K != null) {
                Object object2 = object = this.F.r() - 1 < 0 ? "Chưa học" : this.F.t().c[this.F.r() - 1].e;
                k k2 = this.L;
                object = this;
                ((ib)object).K.a((String)object2);
                int n3 = ((al)object).c + 10;
                int n4 = ((al)object).d + k2.b + k2.d + 3;
                if (n4 + ((ib)object).K.q() > ((al)object).d + ((am)object).g) {
                    n4 = ((al)object).d + k2.b - ((ib)object).K.q() - 3;
                }
                ((ib)object).K.a(n3, n4);
                if (((ib)object).K.o() != n4) {
                    ((ib)object).K.g(n4);
                }
                return;
            }
        } else {
            this.v = n2;
        }
    }
}
