package com.mg.bas;
// Main game play screen, handles rendering, input, and game state.
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class of
extends an
implements af,
bf,
bq {
    private boolean a;
    private k b;
    private ay c;
    private fg d = null;
    private ay k;
    private fg l = null;
    private k m;
    private k n;
    private az o;
    private az p;
    private az q;
    private Image r;
    private ff s;
    private int[] t = new int[2];
    private int[] u = new int[2];
    private int v = 0;
    private ex w;
    private ex x;
    private int y = 0;
    private int z = 6;
    private String A = "";
    private cu B;
    private cu C;
    private k D;
    private bs E;
    private boolean F;
    private hh G;
    private dc H;
    private cu I;
    private cu J;
    private cu K;
    private int L = 0;
    private int M;
    private boolean N = false;
    private boolean O = false;
    private boolean P = false;
    private boolean Q = false;
    private lm R;
    private ff S;
    private a T = new a();
    private int U;
    private aq[] V;
    private byte[][] W;
    private byte X = 0;
    private ox Y;
    private int Z = 0;
    private boolean aa;
    private int ab = 0;
    private boolean ac;
    private int ad = 0;
    private ex ae;
    private int af = 0;
    private np ag = new np();
    private lz ah;
    private Object ai = new Object();
    private int aj = 0;
    private String ak = null;
    private d al = new iff(new int[]{0xFF0000, 0xFFFF00});

    public of(String object) {
        super(8);
        this.Y = new ox(null);
        String string = object;
//        object = this;
        this.A = string;
        this.a(false);
        this.d(false);
        this.a(new ba());
        this.a((bf)this);
        int n = com.mg.bas.v.t;
        int n2 = com.mg.bas.v.u - ba.a;
        if (com.mg.bas.v.t >= com.mg.bas.v.u && com.mg.bas.v.t == 320) {
            n = 320;
            n2 = com.mg.bas.v.u - ba.a;
            this.a = true;
        }
        int n3 = com.mg.bas.v.t >= n ? (com.mg.bas.v.t - n) / 2 : 0;
        int n4 = com.mg.bas.v.u >= n2 ? (com.mg.bas.v.u - ba.a - n2) / 2 : 0;
        this.b = new k(n3, n4, n, n2);
        of of2 = this;
        this.r = com.mg.bas.f.d("/info/gold");
        of2.I = new cu(7, 7);
        if (of2.a) {
            of2.K = new cu(of2.b.c / 2 - 7, of2.I.b);
            of2.m = new k(10, 25, 112, 78);
            of2.u[0] = 10;
            of2.u[1] = of2.m.b + of2.m.d + 7;
            of2.s = new ff(null, 6, 4);
            of2.s.a(10 + bx.d.a("Giá bán: ") + 4, of2.u[1] - 3, 50, 18);
            of2.t[0] = of2.s.c() + of2.s.e() + 1;
            of2.t[1] = of2.s.d() + 3;
            n2 = bx.d.a("Đồng ý(5)") + 30;
            of2.w = new ex("Đồng ý", 6);
            of2.w.a(of2.s.c() + (of2.s.e() - n2) / 2, of2.s.d() + of2.s.f() + 5, n2, 18);
            n2 = bx.d.a("K. đồng ý") + 20;
            of2.x = new ex("K. đồng ý", 14);
            of2.x.a(of2.s.c() + (of2.s.e() - n2) / 2, of2.s.d() + of2.s.f() + 5, n2, 18);
            of2.B = null;
            of2.J = new cu(of2.f / 2 + 7, 7);
            of2.n = new k(184, 25, 112, 78);
            of2.C = new cu(of2.f / 2 + 7, of2.t[1]);
            of2.w.d();
            of2.w.f();
            n2 = of2.w.d() + of2.w.f() + 5;
            of2.D = new k(7, n2, of2.f - 7 - 7, of2.b.d - n2 - 7);
        } else {
            of2.K = new cu(of2.b.c - 7, of2.I.b);
            n3 = of2.b.c - 7 - 7;
            of2.m = new k(7, 25, n3, 44);
            of2.u[0] = 7;
            of2.u[1] = of2.m.b + of2.m.d + 7;
            of2.s = new ff(null, 6, 4);
            of2.s.a(7 + bx.d.a("Giá bán: ") + 4, of2.u[1] - 3, 50, 18);
            of2.s.a(of2);
            of2.t[0] = of2.s.c() + of2.s.e() + 1;
            of2.t[1] = of2.s.d() + 3;
            n2 = bx.d.a("Đồng ý(5)") + 20;
            of2.w = new ex("Đồng ý", 6);
            of2.w.a(of2.t[0] + bx.d.a(".000 KEN") + 7, of2.s.d(), n2, 18);
            n2 = bx.d.a("K. đồng ý") + 10;
            of2.x = new ex("K. đồng ý", 14);
            of2.x.a(of2.t[0] + bx.d.a(".000 KEN") + 10, of2.s.d(), n2, 18);
            of2.B = new cu(7, of2.s.d() + of2.s.f() + 7);
            n2 = of2.B.b + bx.d.a() + 7;
            of2.n = new k(7, n2, n3, 44);
            of2.J = new cu(7, of2.n.b - bx.d.a() - 3);
            of2.C = new cu(7, of2.n.b + of2.n.d + 5);
            n2 = of2.C.b + bx.d.a() + 3;
            of2.D = new k(7, n2, n3, of2.b.d - n2 - 7);
        }
        of2.d = new fg(false);
        of2.d.a((af)of2);
        of2.d.i = new k(of2.m.a, of2.m.b, of2.m.c, of2.m.d);
        of2.d.d(of2.z, 0);
        of2.d.j = true;
        of2.c = new ay();
        of2.c.a(new k(of2.m.a, of2.m.b, of2.m.c, of2.m.d + 2));
        of2.c.b(of2.d);
        of2.c.h(2);
        of2.c.d(true);
        of2.d.i(0);
        of2.l = new fg(false);
        of2.l.a((bq)of2);
        of2.l.i = new k(of2.n.a, of2.n.b, of2.n.c, of2.n.d);
        of2.l.d(of2.z, 0);
        of2.l.j = true;
        of2.k = new ay();
        of2.k.a(new k(of2.n.a, of2.n.b, of2.n.c, of2.n.d + 2));
        of2.k.b(of2.l);
        of2.c.h(2);
        of2.o = new gb(0, 0);
        of2.q = new gb(3, 2);
        of2.p = new gb(4, 3);
        of2.a(com.mg.sq.a.n);
        az az2 = of2.o;
        of of3 = of2;
        of3.a(az2, true);
        az2 = of2.p;
        of3 = of2;
        of3.b(az2, true);
        of2.S = new ff("", 100, 2);
        of2.S.f(true);
        if (com.mg.bas.v.z) {
            int n5 = 2;
            if (of2.a) {
                of2.S.a(0, com.mg.bas.v.u - ba.a, com.mg.bas.v.t - 40, ba.a);
                n5 = 0;
            } else {
                of2.S.a(of2.D.a, of2.D.b + of2.D.d - 18, of2.D.c - 45, 18);
            }
            of2.S.a(false);
            of2.ae = new ex("Gửi", -2);
            of2.ae.a(of2.S.e() + of2.S.c() + n5, of2.a ? com.mg.bas.v.u - 20 : of2.S.d(), 40, 18);
        } else {
            of2.S.a(of2.D.a, of2.D.b + of2.D.d - 18, of2.D.c, 18);
        }
        of2.S.a(false);
        of2.U = (of2.D.d - 6) / bx.c.a();
        of2.T = new a(of2.U);
        of2.V = new aq[]{of2.c, of2.s, of2.w, of2.k};
        of of4 = of2;
        of2.W = new byte[4][4];
        if (of4.a) {
            of4.W[0] = new byte[]{3, -1, 1, 3};
            byte[] byArray = new byte[4];
            byArray[0] = 3;
            byArray[1] = -1;
            byArray[2] = 2;
            of4.W[1] = byArray;
            of4.W[2] = new byte[]{3, -1, 3, 1};
            byte[] byArray2 = new byte[4];
            byArray2[0] = -1;
            byArray2[3] = 2;
            of4.W[3] = byArray2;
        } else {
            of4.W[0] = new byte[]{1, -1, 1, -1};
            byte[] byArray = new byte[4];
            byArray[0] = 2;
            byArray[2] = 3;
            of4.W[1] = byArray;
            byte[] byArray3 = new byte[4];
            byArray3[0] = 3;
            byArray3[1] = 1;
            byArray3[2] = 3;
            of4.W[2] = byArray3;
            of4.W[3] = new byte[]{-1, 2, -1, 2};
        }
        of2.ah = new lz(of2.f, of2.g, (byte)30, (byte)10);
    }

    protected final void r() {
    }

    protected final void c() {
        if (this.E != null) {
            this.E.n();
            this.e(true);
        }
        if (this.af > 0) {
            if (this.ah != null) {
                this.ah.i();
            }
            this.e(true);
            if (this.ag != null && this.ag.c() && this.ag.g() >= 60L) {
                this.ag.b();
                com.mg.bas.ag.b().a("", "Xin lỗi! kết nối tạm thời bị gián đoạn! Giao dịch sẽ bị hủy bỏ. Vui lòng thử lại sau!", "Đóng", 15, 1);
            }
            return;
        }
        int n = 0;
        while (n < this.V.length) {
            if (this.V[n] != null) {
                this.V[n].n();
            }
            ++n;
        }
        if (this.S != null) {
            this.S.n();
            if (this.ae != null) {
                this.ae.n();
            }
        }
        if (this.Z > 0) {
            ex ex2 = (ex)this.V[2];
            if (this.ak == null) {
                this.ak = ex2.q();
            }
            ex2.a(String.valueOf(this.ak) + " (" + this.Z / 25 + ")");
            --this.Z;
            this.e(true);
            if (this.Z <= 0) {
                ex2.a(this.ak);
                this.ak = null;
            }
        }
        if (this.h) {
            --this.aj;
            if (this.aj <= 0) {
                this.e(false);
                this.aj = 0;
            }
        }
    }

    public final void e(boolean bl) {
        super.e(bl);
        this.aj = 5;
    }

    protected final void a(Graphics object) {
        int n;
        int n2;
        if (this.h) {
            pc.a(object, this.b.a, this.b.b, this.b.c, this.b.d, com.mg.bas.v.aj, true);
            bx.d.c(true);
            bx.d.a((Graphics)object, go.e, this.b.a + 7, this.b.b + 7, 0);
            bx.d.c(false);
            String string = com.mg.sq.a.b(go.s);
            object.drawImage(this.r, this.K.a + this.b.a - bx.d.a(string), this.K.b + this.b.b + 2, 24);
            bx.d.a((Graphics)object, string, this.K.a + this.b.a, this.K.b + this.b.b, 2);
            bx.d.a((Graphics)object, "Tiền gửi: ", this.b.a + this.u[0], this.b.b + this.u[1], 0);
            bx.d.a((Graphics)object, ".000 KEN", this.t[0] + this.b.a, this.t[1] + this.b.b, 0);
            if (this.B != null) {
                pc.a(object, this.B.a + this.b.a, this.B.b + this.b.b, this.m.c);
            }
            if (this.a) {
                object.setColor(11972261);
                object.drawLine(this.b.a + this.b.c / 2, this.b.b + 4, this.b.a + this.b.c / 2, this.b.b + this.b.d - 8);
            }
            bx.d.c(true);
            bx.d.a((Graphics)object, this.A, this.J.a + this.b.a, this.J.b + this.b.b, 0);
            bx.d.c(false);
            pc.b(object, this.D.a + this.b.a, this.D.b + this.b.b, this.D.c, this.D.d, com.mg.bas.v.aj, true);
            n2 = 0;
            n = 0;
            while (n < this.T.d()) {
                ((hf)this.T.b(n)).a((Graphics)object, this.D.a + 7 + this.b.a, this.D.b + 3 + n2 + this.b.b);
                n2 += bx.c.a();
                ++n;
            }
        }
        if (this.V != null) {
            n = 0;
            n2 = this.V.length;
            while (n < n2) {
                this.V[n].a((Graphics)object, this.b.a, this.b.b);
                ++n;
            }
        }
        String string = "Tiền gửi: " + com.mg.bas.i.a(this.v, ".");
        string = this.v == 0 ? String.valueOf(string) + " KEN" : String.valueOf(string) + ".000 KEN";
        if (this.ac) {
            n2 = com.mg.bas.v.aj;
            if (this.ad % 2 == 0) {
                n2 = 15081495;
            }
            object.setColor(n2);
            object.fillRect(this.C.a + this.b.a, this.C.b + this.b.b - 2, bx.d.a(string), 18);
            --this.ad;
            if (this.ad == 0) {
                this.ac = false;
            }
        }
        bx.d.a((Graphics)object, string, this.C.a + this.b.a, this.C.b + this.b.b, 0);
        if (this.O || this.N) {
            pc.b(object, this.m.a + this.b.a, this.m.b + this.b.b, this.m.c, this.m.d, 16686236, true);
        } else if (this.c.m()) {
            pc.b(object, this.m.a + this.b.a, this.m.b + this.b.b, this.m.c, this.m.d, 7070703, true);
        }
        if (this.O || this.N) {
            pc.b(object, this.n.a + this.b.a, this.n.b + this.b.b, this.n.c, this.n.d, 16686236, true);
        } else if (this.k.m()) {
            pc.b(object, this.n.a + this.b.a, this.n.b + this.b.b, this.n.c, this.n.d, 7070703, true);
        } else if (this.aa) {
            n2 = com.mg.bas.v.aj;
            if (this.ab % 2 == 0) {
                n2 = 15081495;
            }
            pc.b(object, this.n.a + this.b.a, this.n.b + this.b.b, this.n.c, this.n.d, n2, true);
            --this.ab;
            if (this.ab == 0) {
                this.aa = false;
            }
        }
        this.k.a((Graphics)object, this.b.a, this.b.b);
        this.c.a((Graphics)object, this.b.a, this.b.b);
        if (this.E != null && this.F) {
            this.E.a((Graphics)object, 0, 0);
        }
        if (this.E != null && !this.F) {
            this.E.a((Graphics)object, 0, 0);
        }
        if (this.af > 0) {
            if (this.ah != null) {
                this.ah.a(object);
            }
        }
    }

    protected final void d(Graphics graphics) {
        super.d(graphics);
        if (this.S.i()) {
            if (this.a) {
                graphics.setColor(0xFFFFFF);
                graphics.fillRect(0, com.mg.bas.v.u - ba.a, com.mg.bas.v.t, ba.a);
            }
            this.S.a(graphics, this.b.a, this.b.b);
            if (this.ae != null) {
                this.ae.a(graphics, this.b.a, this.b.b);
            }
        }
    }

    protected final void a(int n) {
        this.e(true);
        if (this.af > 0) {
            return;
        }
        if (this.E != null) {
            boolean bl;
            int n2 = n;
            az[] azArray = this.E.a();
            of of2 = this;
            if (n2 == 94 && azArray[0] != null && azArray[0].b()) {
                if (of2.i != null) {
                    of2.i.d(-1, azArray[0].a());
                }
                bl = true;
            } else if (n2 == 95 && azArray[1] != null && azArray[1].b()) {
                if (of2.i != null) {
                    of2.i.d(-1, azArray[1].a());
                }
                bl = true;
            } else if (n2 == 93 && azArray[2] != null && azArray[2].b()) {
                if (of2.i != null) {
                    of2.i.d(-1, azArray[2].a());
                }
                bl = true;
            } else {
                bl = false;
            }
            if (bl) {
                com.mg.bas.v.c();
                return;
            }
            if (this.E.f(n)) {
                return;
            }
            this.v();
            return;
        }
        if (this.S.i()) {
            if (n == 95 || n == 110) {
                this.g();
                return;
            }
            if (!this.S.f(n)) {
                this.u();
            }
            return;
        }
        if (!this.s.m()) {
            switch (n) {
                case 95: 
                case 96: 
                case 97: 
                case 98: 
                case 99: {
                    break;
                }
                default: {
                    if (!this.S.i()) {
                        this.t();
                        this.S.f(n);
                    }
                    return;
                }
            }
        }
        byte by = this.X;
        switch (n) {
            case 96: 
            case 97: 
            case 98: 
            case 99: {
                if (!this.V[this.X].f(n)) {
                    byte by2;
                    int n3 = n - 96;
                    of of3 = this;
                    if (n3 >= 0 && (by2 = of3.W[of3.X][n3]) >= 0) {
                        of3.X = by2;
                    }
                }
                if (by == this.X) break;
                this.V[this.X].d(true);
                this.V[by].d(false);
                if (this.V[by].equals(this.s)) {
                    this.y();
                }
                if (!(this.V[this.X] instanceof ay)) break;
                fg fg2 = (fg)((ay)this.V[this.X]).w();
                fg2.i(0);
                return;
            }
            case 95: {
                if (this.V[2].m()) {
                    this.i.d(0, ((ex)this.V[2]).a());
                    return;
                }
                this.V[this.X].f(n);
                return;
            }
            default: {
                this.V[this.X].f(n);
            }
        }
    }

    private void g() {
        String string = this.S.r();
        if (string == null || string.equals("")) {
            return;
        }
        ks.a().a(this.A, string);
        this.a(string, (byte)2, bx.d);
        this.S.c("");
    }

    private void f(int n) {
        this.af = n;
        this.ag.b();
        this.ag.a();
    }

    protected final void e(int n, int n2) {
        this.e(true);
        if (this.af > 0) {
            return;
        }
        if (this.E != null) {
            boolean bl;
            block16: {
                int n3 = n2;
                int n4 = n;
                az[] azArray = this.E.a();
                of of2 = this;
                int n5 = 0;
                while (n5 < azArray.length) {
                    if (azArray[n5] != null && azArray[n5].a(n4, n3)) {
                        if (of2.i != null) {
                            of2.i.d(-1, azArray[n5].a());
                        }
                        bl = true;
                        break block16;
                    }
                    ++n5;
                }
                bl = false;
            }
            if (bl) {
                return;
            }
            if (this.E.c(n, n2)) {
                return;
            }
            this.v();
            return;
        }
        byte by = this.X;
        int n6 = 0;
        while (n6 < this.V.length) {
            k k2 = this.V[n6].equals(this.c) ? new k(this.d.i.a + this.b.a, this.d.i.b + this.b.b, this.d.i.c, this.d.i.d) : (this.V[n6].equals(this.k) ? new k(this.l.i.a + this.b.a, this.l.i.b + this.b.b, this.l.i.c, this.l.i.d) : new k(this.V[n6].c() + this.b.a, this.V[n6].d() + this.b.b, this.V[n6].e(), this.V[n6].f()));
            if (k2.a(n, n2)) {
                if (this.S.i()) {
                    this.u();
                }
                if (n6 != by) {
                    this.X = (byte)n6;
                    this.V[by].d(false);
                    if (this.V[by].equals(this.s)) {
                        this.y();
                    }
                    this.V[this.X].d(true);
                }
                this.V[n6].c(n - this.b.a, n2 - this.b.b);
                if (this.V[n6] instanceof ex) {
                    this.d(-1, ((ex)this.V[n6]).a());
                }
                return;
            }
            n6 = (byte)(n6 + 1);
        }
        if (!this.S.i()) {
            this.t();
        } else if (this.ae != null && this.ae.h().a(n - this.b.a, n2 - this.b.b)) {
            this.g();
        }
        this.S.c(n, n2);
    }

    private void t() {
        this.S.a(true);
        this.S.d(true);
        this.S.c("");
        az az2 = null;
        of of2 = this;
        of2.a(az2, true);
        az2 = null;
        of2 = this;
        of2.b(az2, true);
        this.e(true);
    }

    private void u() {
        this.S.d(false);
        this.S.a(false);
        az az2 = this.o;
        of of2 = this;
        of2.a(az2, true);
        az2 = this.p;
        of2 = this;
        of2.b(az2, true);
        if (this.X != 0) {
            this.V[this.X].d(false);
            this.X = 0;
            this.V[this.X].d(true);
            this.d.i(0);
        }
    }

    public final void d(int n, int n2) {
        this.e(true);
        if (n2 == 15) {
            ks.a().l();
            com.mg.bas.ag.b().l();
            return;
        }
        if (this.af > 0) {
            return;
        }
        if (this.g(n2)) {
            this.v();
            return;
        }
        switch (n2) {
            case 4: {
                if (this.E != null) {
                    this.v();
                    return;
                }
                this.x();
                return;
            }
            case 0: {
                of of2 = this;
                bs bs2 = new bs();
                if (of2.N) {
                    bs2.a(new br("Đồng ý", 11119));
                } else {
                    bs2.a(new br[]{of2.O ? new br("K. đồng ý", 14) : new br("Đồng ý", 11119)});
                }
                bs2.a(new br("Hủy giao dịch", 11117));
                int n3 = bs2.e() > bs2.f() ? bs2.e() : bs2.f();
                bs2.a_(-n3, of2.j() - bs2.f() + n3);
                bs2.d(0, com.mg.bas.v.u - ba.a - bs2.f());
                bs2.a((af)of2);
                of2.b(bs2);
                az az2 = of2.p;
                of of3 = of2;
                of3.b(az2, true);
                az2 = of2.q;
                of3 = of2;
                of3.a(az2, true);
                bs2.c(com.mg.sq.a.n);
                return;
            }
            case 3: {
                this.c(95);
                return;
            }
            case 5: {
                return;
            }
            case 6: {
                this.g(11119);
                return;
            }
            case 1: {
                return;
            }
            case 1235: {
                com.mg.bas.ag.b().a(241202, false);
                return;
            }
            case 1234: {
                if (this.G.t().k == null) break;
                if (this.G.t().j == 1 || this.G.t().j == 2) {
                    lm lm2 = (lm)this.G.t().k;
                    dc dc2 = new dc(null, lm2.b(), this.G.t().j, this.al);
                    gu gu2 = new gu(dc2);
                    gu2.a(this);
                    gu2.e(lm2.g);
                    bd bd2 = new bd("Xong", 12);
                    gu gu3 = gu2;
                    gu3.a(bd2, true);
                    gu2.a(new bd("", 12));
                    bd2 = new bd("Hủy", 13);
                    gu3 = gu2;
                    gu3.b(bd2, true);
                    gu2.b(-7524);
                    gu2.j(true);
                    com.mg.bas.ag.b().a(gu2, false);
                    com.mg.bas.ag.b().a(241202, false);
                    return;
                }
                if (this.y >= this.z) break;
                this.M = 0;
                if (this.G.t().j != 0 || !((ll)this.G.t().k).a()) break;
                ks.a().k(((ll)this.G.t().k).c);
                this.f(this.af + 1);
                com.mg.bas.ag.b().a(241202, false);
                return;
            }
            case 7: {
                com.mg.bas.ag.b().a(241212, false);
                return;
            }
            case 8: {
                of of4 = this;
                n2 = go.l.length;
                n2 -= go.k.D.length;
                int n4 = 0;
                while (n4 < go.m.length) {
                    ++n2;
                    ++n4;
                }
                int n5 = 0;
                while (n5 < of4.l.s()) {
                    dc dc3 = (dc)of4.l.k(n5);
                    if (dc3.k != null) {
                        int cfr_ignored_0 = dc3.j;
                        ++n2;
                    }
                    ++n5;
                }
                n5 = 0;
                while (n5 < of4.d.s()) {
                    dc dc4 = (dc)of4.d.k(n5);
                    if (dc4.k != null) {
                        int cfr_ignored_1 = dc4.j;
                        --n2;
                    }
                    ++n5;
                }
                boolean bl = of4.G != null ? n2 > of4.G.x() : n2 > go.n;
                if (bl) {
                    com.mg.sq.a.a((bf)this, "Hành Trang", 1110, "Đóng", 110);
                    return;
                }
                this.P = true;
                ks.a().m();
                com.mg.bas.ag.b().a(-7894, false);
                this.f(this.af + 1);
                return;
            }
            case 9: {
                com.mg.bas.ag.b().a(-7894, false);
                return;
            }
            case 10: {
                com.mg.bas.ag.b().l();
                ks.a().l();
                com.mg.bas.ag.b().f(1);
                return;
            }
            case 11: {
                com.mg.bas.ag.b().a(-7946, false);
                return;
            }
            case 12: {
                Object object;
                if (!com.mg.sq.a.s().c(-7524) || (object = (gu)com.mg.sq.a.s().d(-7524)) == null) break;
                n2 = 0;
                this.R = ((gu)object).t();
                int n6 = this.R.g = ((gu)object).u();
                int n7 = 0;
                while (n7 < this.d.s()) {
                    dc dc5 = (dc)this.d.k(n7);
                    if (dc5.k != null && dc5.j == 1 && (object = (lm)dc5.k) != null && ((ld)object).a == this.R.a) {
                        n6 += ((lm)object).g;
                        n2 = 1;
                    }
                    ++n7;
                }
                if (n2 != 0 || this.y < this.z) {
                    this.M = 2;
                    ks.a().e(this.R.a, n6);
                    this.f(this.af + 1);
                }
                com.mg.bas.ag.b().a(-7524, false);
                return;
            }
            case 13: {
                com.mg.bas.ag.b().a(-7524, false);
                return;
            }
            case 14: {
                ks.a().n();
                this.f(this.af + 1);
                this.v();
                return;
            }
            case 16: {
                com.mg.bas.ag.b().a(-7426, false);
                return;
            }
            case 17: {
                com.mg.bas.ag.b().a(false);
                com.mg.bas.ag.b().f(1);
                return;
            }
            case 1110: {
                com.mg.bas.ag.b().a(241209, false);
                hh hh2 = new hh(this.Y, this.al);
                com.mg.bas.ag.b().a(hh2);
                return;
            }
            case 110: {
                com.mg.bas.ag.b().a(241209, false);
            }
        }
    }

    private void b(bs bs2) {
        this.E = bs2;
        if (this.s != null && this.s.m()) {
            this.y();
            return;
        }
        if (this.S.i()) {
            this.g();
        }
    }

    private void v() {
        this.E = null;
        az az2 = this.p;
        of of2 = this;
        of2.b(az2, true);
        az2 = this.o;
        of2 = this;
        of2.a(az2, true);
        this.e(true);
        this.F = false;
    }

     private boolean g(int n) {
        switch (n) {
            case 11119: {
                if (this.Z > 0) {
                    final al a;
                    (a = com.mg.bas.ag.b().a("Chú ý", "Vui lòng kiểm tra các món hàng giao dịch trước khi đồng ý! vui lòng chớ hết thơi gian đếm ngược.", "Đóng", 16, 1)).a(this);
                    a.b(-7426);
                    com.mg.bas.ag.b().a(a, false);
                    return true;
                }
                this.d(-1, 8);
                return true;
            }
            case 11118: {
                if (this.G == null) {
                    (this.G = new hh(this.Y, this.al)).a(this);
                    this.G.h(2);
                }
                com.mg.bas.ag.b().a(this.G);
                return true;
            }
            case 11117: {
                this.x();
                return true;
            }
            case 11116: {
                if (this.H != null && this.H.k != null) {
                    if (this.H.j == 0) {
                        com.mg.sq.a.a((ll)this.H.k, this, "", -23434, "Đóng", 7);
                    }
                    else {
                        com.mg.sq.a.a((lm)this.H.k, null);
                    }
                }
                return true;
            }
            case 11115: {
                if (this.H.k != null) {
                    if (this.H.j == 0) {
                        ks.a().l(((ll)this.H.k).c);
                        this.M = 0;
                    }
                    else {
                        this.R = (lm)this.H.k;
                        n = 0;
                        for (int i = 0; i < this.d.s(); ++i) {
                            final lm lm;
                            if ((((dc)this.d.k(i)).j == 1 || ((dc)this.d.k(i)).j == 2) && (lm = (lm)((dc)this.d.k(i)).k) != null && lm.a == this.R.a) {
                                n += lm.g;
                            }
                        }
                        ks.a().e(this.R.a, n - this.R.g);
                        this.M = 2;
                    }
                }
                this.Q = true;
                this.f(this.af + 1);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public final void d() {
        --this.af;
        this.w();
        switch (this.M) {
            case 1: {
                if (this.Q) {
                    this.Q = false;
                    this.d.a(this.H);
                    this.G.b(this.H);
                    this.d.i(this.d.q());
                    --this.y;
                    return;
                }
                ++this.y;
                this.d.a((Object)this.G.t());
                this.G.a(this.G.t());
                this.d.i(this.d.q());
                return;
            }
            case 2: {
                if (this.Q) {
                    this.d.a(this.H);
                    this.G.b((lm)this.H.k);
                    this.G.v();
                    this.Q = false;
                    this.H = null;
                    --this.y;
                    return;
                }
                if (this.R != null) {
                    Object object;
                    int n = 0;
                    a a2 = new a();
                    int n2 = 0;
                    while (n2 < this.d.s()) {
                        if (((dc)this.d.k((int)n2)).j == 1 && (object = (lm)((dc)this.d.k((int)n2)).k) != null && ((ld)object).a == this.R.a) {
                            n += ((lm)object).g;
                            a2.a(this.d.k(n2));
                        }
                        ++n2;
                    }
                    n += this.R.g;
                    n2 = 0;
                    while (n2 < a2.d()) {
                        this.d.a((dc)a2.b(n2));
                        --this.y;
                        ++n2;
                    }
                    if (this.R.l <= 0 || this.R.l == Integer.MAX_VALUE) {
                        object = this.R.b();
                        this.R.b().g = n;
                        dc dc2 = new dc(null, object, 1, this.al);
                        this.d.a((Object)dc2);
                        ++this.y;
                    } else {
                        n2 = n / this.R.l + (n % this.R.l > 0 ? 1 : 0);
                        int n3 = 0;
                        while (n3 < n2) {
                            object = this.R.b();
                            if (n >= this.R.l) {
                                ((lm)object).g = this.R.l;
                                n -= this.R.l;
                            } else if (n > 0) {
                                ((lm)object).g = n;
                                n = 0;
                            }
                            object = new dc(null, object, 1, this.al);
                            this.d.a(object);
                            ++this.y;
                            ++n3;
                        }
                    }
                    this.G.a(this.R);
                }
                this.d.i(this.d.q());
                return;
            }
            case 3: {
                this.s.c(String.valueOf(this.L));
                return;
            }
            case 0: {
                if (this.Q) {
                    this.Q = false;
                    this.d.a(this.H);
                    this.G.b(this.H);
                    this.d.i(this.d.q());
                    --this.y;
                    return;
                }
                ++this.y;
                this.d.a((Object)this.G.t());
                this.G.a(this.G.t());
                this.d.i(this.d.q());
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void w() {
        Object object = this.ai;
        synchronized (object) {
            if (this.O || this.N) {
                this.a("----- Không chấp nhận -----", (byte)0, bx.d);
                this.e(true);
                this.N = false;
                this.O = false;
                this.P = false;
                this.V[2] = this.w;
                this.V[2].d(this.x.m());
                this.x.d(false);
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(ll ll2) {
        Object object = this.ai;
        synchronized (object) {
            this.e(true);
            this.Z = 125;
            this.w();
            dc dc2 = new dc(this.Y.a(mb.a(ll2) + 98, true), ll2, 0, this.al);
            new dc(this.Y.a(mb.a(ll2) + 98, true), ll2, 0, this.al).k = ll2;
            this.l.a((Object)dc2);
            this.ab = 10;
            this.aa = true;
            this.a(String.valueOf(this.A) + " vừa cập nhật " + ll2.d, (byte)0, com.mg.sq.a.g);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(final lm lm, int g) {
        synchronized (this.ai) {
            this.e(true);
            this.Z = 125;
            this.a(String.valueOf(this.A) + " vừa cập nhật " + g + " " + lm.b, (byte)0, com.mg.sq.a.g);
            this.w();
            final a a = new a();
            for (int i = 0; i < this.l.s(); ++i) {
                final dc dc;
                final lm lm2;
                if ((dc = (dc)this.l.k(i)) != null && dc.j != 0 && (lm2 = (lm)dc.k) != null && lm2.a == lm.a) {
                    a.a(dc);
                }
            }
            for (int j = 0; j < a.d(); ++j) {
                this.l.a((dc)a.b(j));
            }
            if (g > 0) {
                final int n = (lm.e == 3) ? 2 : 1;
                if (lm.l <= 0 || lm.l == Integer.MAX_VALUE) {
                    this.l.a((Object)new dc(null, lm, n, this.al));
//                    monitorexit(this.ai);
                    return;
                }
                int n2;
                if (lm.l == 1) {
                    n2 = g;
                }
                else {
                    n2 = g / lm.l + ((g % lm.l > 0) ? 1 : 0);
                }
                final lm[] array = new lm[n2];
                for (int k = 0; k < n2; ++k) {
                    array[k] = lm.b();
                    if (lm.l > 1) {
                        if (g >= lm.l) {
                            array[k].g = lm.l;
                            g -= lm.l;
                        }
                        else if (g > 0) {
                            array[k].g = g;
                        }
                    }
                    else {
                        array[k].g = 1;
                    }
                    this.l.a((Object)new dc(null, array[k], n, this.al));
                }
            }
            this.ab = 10;
            this.aa = true;
//            monitorexit(this.ai);
            return; 
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(int n, boolean bl) {
        Object object = this.ai;
        synchronized (object) {
            this.e(true);
            if (bl) {
                this.Z = 125;
                this.w();
                this.a(String.valueOf(this.A) + " vừa cập nhật " + com.mg.sq.a.b(n), (byte)0, com.mg.sq.a.g);
            }
            this.v = n / 1000;
            this.ad = 10;
            this.ac = true;
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(ll[] llArray, lm[] lmArray, int n) {
        Object object = this.ai;
        synchronized (object) {
            dc dc2;
            this.e(true);
            --this.af;
            if (this.P) {
                this.O = true;
                this.V[2] = this.x;
                this.V[2].d(this.w.m());
                this.w.d(false);
                this.Z = 0;
            } else {
                this.N = true;
                this.Z = 125;
            }
            this.a(n, false);
            this.l.t();
            this.T.a();
            this.a("Kiểm tra thông tin:", (byte)0, com.mg.sq.a.g);
            int n2 = 0;
            while (n2 < llArray.length) {
                dc2 = new dc(this.Y.a(mb.a(llArray[n2]) + 98, true), llArray[n2], 0, this.al);
                this.l.a((Object)dc2);
                this.a("- " + llArray[n2].d, (byte)0, com.mg.sq.a.g);
                ++n2;
            }
            n2 = 0;
            while (n2 < lmArray.length) {
                int n3 = lmArray[n2].g;
                if (n3 > 0) {
                    int n4;
                    int n5 = n4 = lmArray[n2].e == 3 ? 2 : 1;
                    if (lmArray[n2].l <= 0 || lmArray[n2].l == Integer.MAX_VALUE) {
                        dc2 = new dc(null, lmArray[n2], n4, this.al);
                        this.l.a((Object)dc2);
                    } else {
                        int n6 = lmArray[n2].l == 1 ? n3 : n3 / lmArray[n2].l + (n3 % lmArray[n2].l > 0 ? 1 : 0);
                        lm[] lmArray2 = new lm[n6];
                        int n7 = 0;
                        while (n7 < n6) {
                            lmArray2[n7] = lmArray[n2].b();
                            if (lmArray[n2].l > 1) {
                                if (n3 >= lmArray[n2].l) {
                                    lmArray2[n7].g = lmArray[n2].l;
                                    n3 -= lmArray[n2].l;
                                } else if (n3 > 0) {
                                    lmArray2[n7].g = n3;
                                }
                            } else {
                                lmArray2[n7].g = 1;
                            }
                            dc2 = new dc(null, lmArray2[n7], n4, this.al);
                            this.l.a((Object)dc2);
                            ++n7;
                        }
                    }
                }
                this.a("- " + lmArray[n2].g + " " + lmArray[n2].b, (byte)0, com.mg.sq.a.g);
                ++n2;
            }
            this.a("- Số KEN giao dịch: " + com.mg.sq.a.b(n), (byte)0, com.mg.sq.a.g);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(String string) {
        Object object = this.ai;
        synchronized (object) {
            this.e(true);
            this.Z = 125;
            this.w();
            this.ab = 10;
            this.aa = true;
            int n = 0;
            while (n < this.l.s()) {
                Object object2 = (dc)this.l.k(n);
                if (((dc)object2).j == 0 && ((dc)object2).k != null) {
                    object2 = (ll)((dc)object2).k;
                    if (((ll)object2).c.equals(string)) {
                        this.a(String.valueOf(this.A) + " vừa lấy lại " + ((ll)object2).d, (byte)0, com.mg.sq.a.g);
                        this.l.l(n);
                        return;
                    }
                }
                ++n;
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(lm lm2) {
        Object object = this.ai;
        synchronized (object) {
            this.e(true);
            this.Z = 125;
            this.w();
            int n = 0;
            while (n < this.l.s()) {
                Object object2 = (dc)this.l.k(n);
                if (((dc)object2).k != null && (((dc)object2).j == 1 || ((dc)object2).j == 2)) {
                    object2 = (lm)((dc)object2).k;
                    if (((ld)object2).a == lm2.a) {
                        this.a(String.valueOf(this.A) + " vừa lấy lại " + ((ld)object2).b, (byte)0, com.mg.sq.a.g);
                        this.l.l(n);
                        break;
                    }
                }
                ++n;
            }
            this.ab = 10;
            this.aa = true;
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
     public final void b(final String s) {
        synchronized (this.ai) {
            this.e(true);
            if (!s.equals(this.A)) {
                ct.a("[TradeScreen ] khac tên ng giao dịch nen huy");
//                monitorexit(this.ai);
                return;
            }
            for (int i = 0; i < this.l.s(); ++i) {
                final dc dc;
                if ((dc = (dc)this.l.k(i)).k != null) {
                    if (dc.j == 0) {
                        go.a((ll)dc.k);
                    }
                    else {
                        final lm lm = (lm)dc.k;
                        go.a(lm, lm.g);
                    }
                }
            }
            for (int j = 0; j < this.d.s(); ++j) {
                final dc dc2;
                if ((dc2 = (dc)this.d.k(j)).k != null) {
                    if (dc2.j == 0) {
                        go.b((ll)dc2.k);
                    }
                    else {
                        go.a((lm)dc2.k);
                    }
                }
            }
            com.mg.bas.ag.b().l();
            com.mg.bas.ag.b().f(1);
//            monitorexit(this.ai);
        }
    }
    
    private void x() {
        final al a;
        (a = com.mg.bas.ag.b().a("Chú ý", "Bạn muốn hủy bỏ giao dịch?", "Có", 10, "Không", 11, 1)).a(this);
        a.b(-7946);
        com.mg.bas.ag.b().a(a, false);
    }

    public final void a(final String s, final byte b, final d d) {
        this.e(true);
        final String[] a = bx.a(s, this.D.c - 10, d);
        for (int i = 0; i < a.length; ++i) {
            if (this.T.d() >= this.U) {
                this.T.a(0);
            }
            final hf hf;
            (hf = new hf(a[i], b, d)).a(-5);
            hf.h(this.D.c - 3);
            hf.i(d.a());
            this.T.a(hf);
        }
    }

    public final void e() {
        this.w();
        --this.af;
    }

    protected final void e(int n) {
        if (this.S.i()) {
            this.S.g(n);
            return;
        }
        if (this.s.m()) {
            this.s.g(n);
        }
    }

    private void y() {
        int n = this.L;
        String string = this.s.r();
        this.L = !string.equals("") ? Integer.parseInt(string) : 0;
        if (n != this.L) {
            if ((long)(this.L * 1000) > go.s) {
                this.L = (int)(go.s / 1000L);
            }
            this.M = 3;
            ks.a().g(this.L * 1000);
            this.f(this.af + 1);
        }
    }

    public final void a(ae ae2) {
        char c2 = ae2.a();
        if (c2 < '0' || c2 > '9') {
            ae2.a('');
        }
    }

    public final void f() {
        if (this.af != 0) {
            this.af = 0;
        }
    }

    public final void b(aq aq, int n) {
        if (aq == null && n >= 6) {
            aq = new dc(this.l.k, null, 3, this.al);
        }
        this.H = (dc)aq;
        if (this.V[this.X] instanceof ay) {
            final k u = ((fg)((ay)this.V[this.X]).w()).u();
            final bs bs = new bs();
            if (this.H != null && this.H.j != 3) {
                bs.a(new br("Chi Tiết", 11116));
            }
            if (this.c.m()) {
                if (this.H != null) {
                    if (this.H.j != 3) {
                        bs.a(new br("Bỏ ra", 11115));
                    }
                }
                else {
                    bs.a(new br[] { new br("Rương Đồ", 11118) });
                }
            }
            if (bs.s() == null || bs.s().length == 0) {
                return;
            }
            final int n2 = u.a + this.b.a + (u.c - bs.e()) / 2;
            if ((n = u.b + this.b.b + u.d) + bs.f() > com.mg.bas.v.u - ba.a) {
                n = com.mg.bas.v.u - ba.a - bs.f();
            }
            bs.a_(this.b.a + this.b.c + bs.e(), n);
            bs.d((n2 < this.b.a) ? this.b.a : ((n2 + bs.e() > this.b.a + this.b.c) ? (this.b.a + this.b.c - bs.e()) : n2), n);
            bs.a((bf)this);
            this.b(this.p, true);
            this.a(this.q, true);
            bs.a_(1);
            this.b(bs);
            this.F = true;
        }
    }

    public final void a(aq aq2, int n) {
    }

    public final void a(aq aq2, int n, int n2) {
    }

    public final void c(final String s) {
        this.af = 0;
        if (s == null) {
            com.mg.bas.ag.b().l();
            final al a;
            (a = com.mg.bas.ag.b().a("", "Giao dịch đã bị hủy bởi hệ thống!", "Đóng", 17, 1)).a(this);
            com.mg.bas.ag.b().a(a, false);
            return;
        }
        if (s.equals(this.A)) {
            com.mg.bas.ag.b().l();
            final al a2;
            (a2 = com.mg.bas.ag.b().a("", String.valueOf(s) + " đã hủy giao dịch!", "Đóng", 17, 1)).a(this);
            com.mg.bas.ag.b().a(a2, false);
            return;
        }
        com.mg.bas.ag.b().l();
        com.mg.bas.ag.b().f(1);
    }
}
