package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class om
extends aq
implements bf,
bg {
    private Image r;
    private Image s;
    private Image t;
    private final ks u;
    private az v;
    private az w;
    private az x;
    private az y;
    private az z;
    private az A;
    private az B;
    private az C;
    private az D;
    public static cu i = null;
    private static cu E = null;
    public static byte j = 0;
    public static int k = 8;
    private kh F;
    public kl l;
    private kf G;
    private kd H;
    private a I;
    private kj J;
    public jv m;
    private byte[][] K;
    private kg[] L;
    private kg M;
    private boolean N;
    private boolean O;
    private boolean P;
    private ln Q;
    private cu R;
    private String S;
    private int T;
    public a n;
    private int U;
    private jt V;
    private a W;
    private oa X;
    private int Y;
    private boolean Z;
    public boolean o;
    private jw aa;
    private ka ab;
    private int ac;
    private int[] ad;
    private boolean ae;
    private String af;
    private a ag;
    private az ah;
    public static boolean p = false;
    public ha q;
    private gj ai;
    private br aj;
    private int ak;
    private ox al;
    private ol am;
    private ax an;
    private byte ao;
    private jx[] ap;
    private boolean aq;

    /*
     * Unable to fully structure code
     */
    public om(int var1_1, ol var2_4, oa var3_5) {
    super();
    this.r = com.mg.bas.f.d("/monster");
    this.s = com.mg.bas.f.d("/zap");
    this.t = com.mg.bas.f.d("/ice");
    this.u = ks.a();
    this.D = null;
    this.l = null;
    this.G = null;
    this.H = null;
    this.I = new a();
    this.J = new kj();
    this.m = new km();
    this.K = null;
    this.M = null;
    this.N = false;
    this.O = false;
    this.P = false;
    this.S = null;
    this.U = -1;
    this.W = new a();
    this.X = null;
    this.o = false;
    this.aa = new jw();
    this.ab = null;
    this.ac = 0;
    this.ae = false;
    this.af = null;
    this.ag = new a();
    this.q = null;
    this.ai = null;
    this.aj = null;
    this.ak = -1;
    this.ao = 0;
    this.aq = true;
    ct.b("map");
    this.am = var2_4;
    this.X = var3_5;
    this.a_(1);
    this.al = new ox(null);
    this.ad = new int[20];

    if (!com.mg.bas.v.ah) {
        java.util.Calendar var1_2 = com.mg.bas.i.c(System.currentTimeMillis());
        int hour = var1_2.get(11);
        if (hour < 6) {
            this.ac = -40;
        } else if (hour < 19) {
            this.ac = 0;
        } else if (hour <= 21) {
            this.ac = -25;
        } else {
            this.ac = -40;
        }
    }

    this.an = new ax(3);
    var2_4.a(this.an);
    this.d(com.mg.bas.v.t);
    this.e(com.mg.bas.v.u);
    var2_4.a(new ba());
    om.p = false;

    if (!this.P) {
        try {
            this.P = true;
            this.Z = true;
            this.am.a((aq)this);
            this.w = new gb(109, 1);
            this.x = new gb(105, 0);
            this.y = new gb(113, 2);
            this.z = new gb(106, 3);
            this.v = new bd("Vào", 101);
            this.B = new bd("Nói Chuyện", 107);
            this.ah = new bd("Tiếp tục", 118);
            this.A = new bd("Nhặt", 110);
            this.C = com.mg.sq.a.n;
            this.am.a(this.x);
            this.am.b(this.w);
            this.am.c(this.C);
            try {
                this.x();
            } catch (OutOfMemoryError v0) {
                ct.a("out of memory " + com.mg.sq.a.m);
                if (com.mg.sq.a.m != null) {
                    com.mg.sq.a.m.G();
                    com.mg.sq.a.s().v();
                }
                try {
                    this.x();
                } catch (OutOfMemoryError v1) {
                    v1.printStackTrace();
                    com.mg.sq.a.s().j(1);
                    com.mg.sq.a.i(1);
                    return;
                }
            } catch (Exception v2) {
                v2.printStackTrace();
                ou.a().a(4, v2, "MapTabView.init()#1");
                com.mg.sq.a.i(1);
                return;
            }
            com.mg.sq.a s = com.mg.sq.a.s();
            if (com.mg.sq.a.i != null) {
                s.q(com.mg.sq.a.i);
                com.mg.sq.a.i = null;
            }
            com.mg.sq.a.s().e(241230);
        } catch (OutOfMemoryError v3) {
            com.mg.sq.a.s().j(1);
            com.mg.sq.a.i(1);
            return;
        } catch (Exception v4) {
            v4.printStackTrace();
            ou.a().a(4, v4, "MapTabView.init()#2");
        }
        if (com.mg.sq.a.m != null) {
            com.mg.sq.a.m.L();
        }
        this.t();
        oa.c = null;
        oa.b = null;
        this.ad = null;
        System.gc();
    }
    com.mg.sq.a.i(1);
}

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.O) {
            return;
        }
        graphics.setColor(0);
        graphics.fillRect(0, 0, com.mg.bas.v.t, com.mg.bas.v.u);
        try {
            this.F.a(graphics);
            if (this.S != null) {
                pc.b(graphics, this.R.a - (this.T >> 1), this.R.b, this.T, 17, 1070484, 16579764, 14542575);
                bx.d.a(graphics, this.S, this.R.a, this.R.b + 2, 1);
            }
            if (gr.a && this.V != null) {
                this.V.a(graphics);
                if (this.am != null && this.am.s) {
                    graphics.drawImage(dc.i, this.V.p() + 1, (this.V.q() - dc.i.getHeight()) / 2, 20);
                }
                if (this.ap != null) {
                    n = this.V.q() + 2;
                    n2 = 0;
                    while (n2 < this.ap.length) {
                        this.ap[n2].a(graphics, 0, n);
                        n += this.ap[n2].q() + 2;
                        ++n2;
                    }
                }
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        this.am.c(true);
    }

    private void x() {
        System.out.println("Loading map " + oa.c);
        this.F = new kh(this.g(oa.c.f, this.ac));
        this.K = a(oa.c.j, oa.c.d, oa.c.e);
        this.n = new a();
        for (int i = 0; i < oa.c.d; ++i) {
            for (int j = 0; j < oa.c.e; ++j) {
                if (this.K[i][j] == 2) {
                    this.n.a(new cu(j, i));
                    this.K[i][j] = 0;
                }
            }
        }
        this.F.a(new kc(this.g(oa.c.g, this.ac)));
        final byte[] array;
        com.mg.bas.h.b(array = oa.b[a(oa.c.k, oa.c.m)], (this.ac << 1) / 3);
        this.G = new kf(com.mg.bas.f.a(array), a(oa.c.h, oa.c.d, oa.c.e), (byte)32, (byte)32);
        this.F.a(this.G);
        this.F.h(this.G.p());
        this.F.i(this.G.q());
        this.H = new kd();
        this.F.a(this.H);
        this.Q = new ln();
        this.L = new kg[oa.c.l.length];
        final byte[] b;
        com.mg.bas.h.b(b = com.mg.bas.f.b("/gate"), (this.ac << 1) / 3);
        final Image a = com.mg.bas.f.a(b);
        for (int k = 0; k < oa.c.l.length; ++k) {
            final jm jm;
            if ((jm = oa.c.l[k]).a == 1) {
                this.L[k] = new kg(this.Q, jm);
                this.L[k].e = this.Q;
            }
            else if (jm.a == 0) {
                this.L[k] = new jy(a, jm, this.F.p());
            }
            else {
                Image image;
                if ((image = this.al.a(jm.i, true)) == null) {
                    image = this.g(jm.i, 0);
                    this.al.a(jm.i, image);
                }
                this.L[k] = new kk(image, jm, 1);
            }
            if (jm.c == go.x && om.i == null) {
                int f = 0;
                if (jm.a == 0) {
                    if (this.L[k].b() == 0) {
                        f = this.L[k].d.f;
                    }
                    else {
                        f -= 26;
                    }
                }
                om.i = new cu(jm.d + f, jm.e);
            }
        }
        (this.l = new kl()).a(go.k);
        this.l.c(om.i.a, om.i.b);
        if (om.j == 4) {
            om.j = 0;
        }
        this.l.a(om.j, om.k);
        om.i = null;
        this.H.a(this.l);
        this.H.c = this.L;
        if (go.u != null && go.u.length > 0 && om.E != null) {
            final Image d = com.mg.bas.f.d("/info/itemchest");
            for (int l = 0; l < go.u.length; ++l) {
                final ju ju;
                (ju = new ju(d, 1)).l(60);
                ju.v = go.u[l];
                ju.c(om.E.a, om.E.b - ju.q());
                ju.a(new byte[][] { new byte[1], new byte[1], new byte[1], new byte[1] }, ju.p());
                ju.a(new byte[][] { new byte[1], new byte[1], new byte[1], new byte[1] });
                ju.b((byte)1);
                ju.a((byte)1);
                ju.w = ((cv.a(2) == 0) ? -1 : 1);
                this.H.d.a(ju);
            }
            go.u = new ll[0];
        }
        this.G.a(a(oa.c.i, oa.c.d, oa.c.e));
        this.F.a(this.l.t);
        this.S = oa.c.b;
        this.T = bx.d.a(this.S) + 10;
        this.R = new cu(com.mg.bas.v.t - this.T / 2, 0);
        this.V = new jt(go.k);
        this.a(go.k.ac);
        this.O = true;
    }

    public final void a(jo[] joArray, boolean bl) {
        this.W.a();
        int n = (this.l.t.a + this.l.t.c / 2) / 32;
        int n2 = (this.l.t.b + this.l.t.d / 2) / 32;
        int n3 = n;
        while (n3 < this.K[n2].length) {
            if (this.K[n2][n3] != 0) break;
            this.W.a(new cu(n3, n2));
            ++n3;
        }
        n3 = n;
        while (n3 >= 0) {
            if (this.K[n2][n3] != 0) break;
            this.W.a(new cu(n3, n2));
            --n3;
        }
        a a2 = new a();
        boolean bl2 = false;
        int n4 = 0;
        while (n4 < joArray.length) {
            Image image = null;
            int n5 = 0;
            while (n5 < joArray[n4].f) {
                Object object;
                Object object2;
                if (this.n.d() <= 0) {
                    this.n = a2;
                    if (bl) {
                        return;
                    }
                    if (bl2) {
                        return;
                    }
                    bl2 = true;
                    a2 = new a();
                }
                n3 = cv.a(this.n.d());
                cu cu2 = (cu)this.n.b(n3);
                int n6 = 0;
                while (n6 < this.W.d()) {
                    object2 = (cu)this.W.b(n6);
                    if (((cu)object2).b != cu2.b) break;
                    if (cu2.a == ((cu)object2).a) {
                        a2.a(cu2);
                        this.n.a(n3);
                        if (this.n.d() > 0) {
                            n3 = cv.a(this.n.d());
                            cu2 = (cu)this.n.b(n3);
                        } else {
                            this.n = a2;
                            if (bl) {
                                return;
                            }
                            if (bl2) {
                                return;
                            }
                            bl2 = true;
                            a2 = new a();
                        }
                    }
                    ++n6;
                }
                if (bl2) {
                    object2 = this.a(cu2.a << 5, cu2.b << 5, joArray[n4], n5 == 0 ? null : image);
                    if (object2 == null) break;
                    int n7 = 0;
                    while (n7 < this.I.d()) {
                        ki ki2 = (ki)this.I.b(n7);
                        if (ki2.n() == ((at)object2).n() && ki2.o() == ((at)object2).o()) {
                            ((ki)object2).a(0, ki2.c == 2 ? 3 : 2);
                            break;
                        }
                        k k2 = ki2.e;
                        object = object2;
                        if (((ki)object).e.a(k2)) {
                            ((ki)object2).a(0, ki2.c == 2 ? 3 : 2);
                            break;
                        }
                        ++n7;
                    }
                    this.I.a(object2);
                } else {
                    object2 = this.a(cu2.a << 5, cu2.b << 5, joArray[n4], n5 == 0 ? null : image);
                    if (object2 == null) break;
                    this.I.a(object2);
                }
                if (n5 == 0) {
                    object = object2;
                    image = ((ki)object).g;
                }
                a2.a(cu2);
                this.n.a(n3);
                ++n5;
            }
            ++n4;
        }
        n4 = 0;
        while (n4 < a2.d()) {
            this.n.a(a2.b(n4));
            ++n4;
        }
    }

    public final void a(jo[] joArray) {
        int n = 0;
        while (n < joArray.length) {
            int n2 = 0;
            block1: while (n2 < this.I.d()) {
                Object object = (ki)this.I.b(n2);
                if (object != null && ((ki)object).f.a.equals(joArray[n].a)) {
                    this.I.a(n2);
                    object = joArray[n].a;
                    kd kd2 = this.H;
                    int n3 = 0;
                    while (n3 < kd2.b.d()) {
                        if (kd2.b.b(n3) instanceof ki) {
                            ki ki2 = (ki)kd2.b.b(n3);
                            if (ki2.f.a.equals(object)) {
                                kd2.b.a(n3);
                                break block1;
                            }
                        }
                        ++n3;
                    }
                    break;
                }
                ++n2;
            }
            ++n;
        }
    }

    private ki a(final int n, final int n2, final jo jo, final Image image) {
        if (jo == null) {
            return null;
        }
        Image image2 = null;
        int n3 = 0;
        switch (jo.c >> 1) {
            case 0: {
                image2 = this.r;
                n3 = 14;
                break;
            }
            case 1: {
                image2 = this.s;
                n3 = 5;
                break;
            }
            default: {
                image2 = this.t;
                n3 = 13;
                break;
            }
        }
        final ki ki;
        (ki = new ki(image2, 1, 6, jo, go.k, image)).c(n3);
        ki.a(ki.n(), ki.o(), ki.p() - 12, 20);
        ki.d = cv.a(2, 4);
        ki.c(n - (ki.p() - 32), n2 - (ki.q() - 32));
        ki.a(0, cv.a(2, 3));
        this.H.b.a(ki);
        return ki;
    }

    private static int a(int n, int[] nArray) {
        int n2 = 0;
        int n3 = 0;
        while (n3 < nArray.length) {
            if (n == nArray[n3]) {
                n2 = n3;
                break;
            }
            ++n3;
        }
        return n2;
    }

    private static byte[][] a(byte[] byArray, int n, int n2) {
        byte[][] byArray2 = new byte[n][n2];
        int n3 = 0;
        while (n3 < byArray2.length) {
            System.arraycopy(byArray, n3 * n2, byArray2[n3], 0, n2);
            ++n3;
        }
        return byArray2;
    }

    public final void n() {
        try {
            int n;
            Object object;
            int n2;
            block54: {
                block53: {
                    Object object2;
                    block55: {
                        block57: {
                            block58: {
                                block56: {
                                    if (!this.O) {
                                        ct.b("chua init map complete k update");
                                        return;
                                    }
                                    if (this.Z) {
                                        this.u.d(go.w);
                                        this.Z = false;
                                    }
                                    if (this.Y > 0) {
                                        --this.Y;
                                        if (this.Y == 0) {
                                           com.mg.bas.ag.b().a(this.q, false);
                                        } else if (this.Y < 0) {
                                            this.q();
                                        }
                                    }
                                    if (this.N) {
                                        this.l.i();
                                        kl kl2 = this.l;
                                        if (kl2.j != 4) {
                                            this.l.a(4);
                                        }
                                        return;
                                    }
                                    if (this.l == null) break block54;
                                    this.m.a(this.l, this.F);
                                    object2 = this.l;
                                    if (((kl)object2).j == 4) break block55;
                                    if (this.M != null) break block56;
                                    n2 = 0;
                                    while (n2 < this.L.length) {
                                        if (this.l.t.b(this.L[n2].d.d, this.L[n2].d.e, this.L[n2].d.f, this.L[n2].d.g)) {
                                            this.M = this.L[n2];
                                            this.ab = null;
                                            this.D = this.am.s();
                                            if (this.M.d.a == 2) {
                                                if (this.M.c()) break;
                                                object = this;
                                                ((om)object).am.v();
                                                object2 = (kk)this.M;
                                                this.am.c(this.B);
                                                break;
                                            }
                                            this.am.c(this.v);
                                            break;
                                        }
                                        ++n2;
                                    }
                                    if (this.M == null) {
                                        n2 = this.H.d.d();
                                        n = 0;
                                        while (n < n2) {
                                            if (this.H.d.b(n) instanceof ju) {
                                                this.ab = (ka)this.H.d.b(n);
                                                if (this.ab.r() == 1 && this.ab.h() == 0 && this.l.t.b(this.ab.n(), this.ab.o(), this.ab.p(), this.ab.q())) {
                                                    this.D = this.am.s();
                                                    this.am.c(this.A);
                                                    break block53;
                                                }
                                            }
                                            if (n == n2 - 1) {
                                                this.ab = null;
                                                this.am.c(this.C);
                                            }
                                            ++n;
                                        }
                                    }
                                    break block53;
                                }
                                if (this.M.d.a != 0) break block57;
                                object2 = this.l;
                                if (((kl)object2).j == 1) break block58;
                                object2 = this.l;
                                if (((kl)object2).j != 7) break block57;
                            }
                            switch (this.M.b()) {
                                case 0: {
                                    if (this.o || (this.l.k & 4) == 0 || this.l.t.a > this.M.n() + (this.M.p() >> 1)) break;
                                    this.e(false);
                                    this.u.b(go.w, this.M.d.c);
                                    com.mg.sq.a.s().a((String)null, (il)null);
                                    this.m.a();
                                    this.o = true;
                                    return;
                                }
                                default: {
                                    if (this.o || (this.l.k & 8) == 0 || this.l.t.a + this.l.t.c < this.M.n() + (this.M.p() >> 1)) break;
                                    this.u.b(go.w, this.M.d.c);
                                    com.mg.sq.a.s().a((String)null, (il)null);
                                    this.m.a();
                                    this.o = true;
                                    return;
                                }
                            }
                        }
                        if (!this.l.t.b(this.M.d.d, this.M.d.e, this.M.d.f, this.M.d.g)) {
                            if (this.M.d.a == 2) {
                                object2 = this;
                                ((om)object2).am.w();
                            }
                            this.M = null;
                            this.am.c(this.D);
                            this.D = null;
                        }
                        break block53;
                    }
                    if (this.l.m()) {
                        n2 = this.I.d();
                        n = 0;
                        while (n < n2) {
                            object = (ki)this.I.b(n);
                            if (((at)object).m()) {
                                object2 = object;
                                if (this.l.u.a(((ki)object2).e)) {
                                    this.a((ki)object, true);
                                    this.U = n;
                                    if (((ki)object).e.a < this.l.t.a) {
                                        ((ki)object).b(3);
                                        this.l.b(4);
                                    } else {
                                        ((ki)object).b(2);
                                        this.l.b(8);
                                    }
                                    break;
                                }
                            }
                            ++n;
                        }
                    }
                }
                this.F.a(this.l.t);
            }
            try {
                n2 = 0;
                n = this.I.d();
                while (n2 < n) {
                    object = (ki)this.I.b(n2);
                    if (object == null) break;
                    if (this.U != n2) {
                        this.J.a((ki)object, this.l, this.K, this.F, this.aq);
                        if (((ki)object).a() == 1 && !com.mg.sq.a.s().c(191919)) {
                            this.U = n2;
                            this.a((ki)object, false);
                            this.am.c(null);
                        }
                    }
                    if (this.N && this.U == n2) {
                        ((ki)object).i();
                        if (((ki)object).a() != 1) {
                            ((ki)object).a(1);
                        }
                    }
                    ++n2;
                }
                n = 0;
                int n3 = this.H.d.d();
                while (n < n3) {
                    ka ka2 = (ka)this.H.d.b(n);
                    if (ka2.r() == 1) {
                        this.aa.a(ka2, this.F);
                        if (!ka2.m()) {
                            if (this.am.s().equals(this.A)) {
                                this.am.c(this.C);
                            }
                            this.H.d.a(n);
                            --n3;
                            --n;
                        }
                    }
                    ++n;
                }
            }
            catch (Exception exception) {
                ct.a("[Map] Loi update monster");
            }
            if (this.Q != null) {
                this.Q.i();
            }
            if (this.F != null) {
                this.F.i();
            }
            if (this.ae) {
                this.ae = false;
                this.X.u();
            }
            if (this.ap != null) {
                int n4 = 0;
                while (n4 < this.ap.length) {
                    this.ap[n4].i();
                    ++n4;
                }
            }
        }
        catch (OutOfMemoryError outOfMemoryError) {
            com.mg.sq.a.s().j(1);
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            if (this.ao > 9) {
                this.ao = 0;
                com.mg.sq.a.s().j(0);
            }
            this.ao = (byte)(this.ao + 1);
            ct.a("Null pointer map " + this.ao);
            return;
        }
        this.ao = 0;
    }

    protected final void a() {
        if (this.aj == null || this.ai == null) {
            return;
        }
        try {
            this.ai = (gj)this.an.a();
            int n = this.aj.n() + this.aj.p();
            this.ai.f(n + 5);
            this.ai.g(this.aj.o() - this.ai.q() - 5);
            this.ai.a(10);
            this.ai.a(new k(this.ai.n() + 9, this.ai.o() + 9, this.ai.p() - 20, this.ai.q() - 20));
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void q() {
        ki ki2;
        this.Y = 0;
        com.mg.bas.ag.b().a(false);
        this.l.a(0);
        this.e(false);
        if (this.U >= 0 && (ki2 = (ki)this.I.b(this.U)) != null) {
            ki2.a(0);
        }
        this.m.a();
        this.l.x = 30;
        this.N = false;
        this.U = -1;
    }

    private void a(ki ki2, boolean bl) {
        this.y();
        ct.b("fightingMonster");
        try {
            if (!bl) {
                com.mg.bas.ag.a().b(10);
            }
            com.mg.bas.ag.b().l();
            this.N = true;
            this.Y = 10;
            this.r();
            this.e(false);
            E = new cu(ki2.e.a + ki2.e.c / 2, ki2.e.b + ki2.e.d);
            this.q = new ha(this.l.e.u(), ki2.b(), false, bl, 99030, (bf)this.X);
            this.q.a(this.am);
            int cfr_ignored_0 = ki2.f.d;
            int cfr_ignored_1 = ki2.f.e;
            ks.a().a(ki2.f.a, bl);
            return;
        }
        catch (Throwable throwable) {
            ct.b("fightering monster err");
            throwable.printStackTrace();
            return;
        }
    }

    public final void r() {
        if (this.l != null) {
            i = new cu(this.l.t.a, this.l.t.b);
            j = (byte)(this.l.j == 5 ? 6 : (byte)this.l.j);
            k = this.l.k;
        }
    }

    public final void s() {
        if (!this.O) {
            return;
        }
        try {
            int n = 0;
            while (n < this.H.d.d()) {
                if (this.H.d.b(n) instanceof ka) {
                    this.H.d.b(n);
                }
                ++n;
            }
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public final void d(final int n, final int n2) {
        switch (n2) {
            case 105: {
                if (this.N || this.X == null || this.am == null) {
                    break;
                }
                final bs bs = new bs();
                final oa x = this.X;
                final br[] a;
                if ((a = oa.a((fb)this.am)) != null) {
                    bs.a(a);
                    final int n3 = (bs.e() > bs.f()) ? bs.e() : bs.f();
                    bs.a_(-n3, this.f() - bs.f() + n3);
                    bs.d(0, com.mg.bas.v.u - ba.a - bs.f());
                    bs.a((bg)this);
                    bs.c(this.C);
                    bs.a(this.y);
                    bs.b(this.z);
                    this.m.a();
                    if (this.an.a() != null && this.an.a() instanceof gj) {
                        this.an.a().b(false);
                        this.an.i();
                        final gj ai = (gj)this.an.a();
                        final br[] s = bs.s();
                        br aj = null;
                        if (ai != null) {
                            for (int i = 0; i < s.length; ++i) {
                                if (s[i].b().equals(ai.b())) {
                                    aj = s[i];
                                }
                            }
                            if (aj != null) {
                                ai.f(aj.n() + aj.p() + 5);
                                ai.g(aj.o());
                                ai.a(ai.n() + 10);
                                ai.a(new k(ai.n() + 9, ai.o() + 9, ai.p() - 20, ai.q() - 20));
                                ai.c(true);
                                this.aj = aj;
                                (this.ai = ai).c();
                            }
                        }
                    }
                    this.am.a(bs);
                }
                return;
            }
            case 101: {
                com.mg.sq.a.s().a(null, (il)null);
                om.i = null;
                this.e(false);
                this.m.a();
                this.l.a(0);
                this.u.b(go.w, this.M.d.c);
                return;
            }
            case 107: {
                this.am.c(this.C);
                this.m.a();
                this.af = this.M.a();
                this.ak = this.M.d.c;
                this.u.b(go.w, this.ak);
                com.mg.sq.a.s().a(null, (il)null);
                return;
            }
            case 109: {
                this.m.a();
                ((fc)this.am.l()).a();
                return;
            }
            case 106: {
                this.y();
                return;
            }
            case 113: {
                this.am.l.f(95);
                return;
            }
            case 110: {
                if (go.b()) {
                    com.mg.sq.a.a(this, "Hành Trang", 114, "Đóng", 115);
                    return;
                }
                com.mg.sq.a.a(this.ab.v, this, "Nhặt", 2000, "Bỏ qua", 1000);
                return;
            }
            case 2000: {
                this.ag.a(this.ab.v);
                this.u.b(new String[] { this.ab.v.c });
                com.mg.bas.ag.b().a(241212, false);
                this.H.d.b(this.ab);
                this.ab = null;
                this.am.c(this.C);
                return;
            }
            case 1000: {
                com.mg.bas.ag.b().a(241212, false);
                this.H.d.b(this.ab);
                this.ab = null;
                this.am.c(this.C);
                return;
            }
            case 112: {
                if (com.mg.bas.ag.b().c(241212)) {
                    final ll k;
                    go.a(k = ((hg)com.mg.bas.ag.b().d(241212)).k);
                    this.u.b(new String[] { k.c });
                    com.mg.bas.ag.b().a(241212, false);
                }
                this.am.c(this.C);
                return;
            }
            case 114: {
                com.mg.bas.ag.b().a(241209, false);
                this.X.v();
                return;
            }
            case 115: {
                com.mg.bas.ag.b().a(241209, false);
                return;
            }
            case 118: {
                final kk kk = (kk)this.M;
                if (this.M != null) {
                    break;
                }
                break;
            }
            case -999: {
                com.mg.bas.ag.b().a(false);
                return;
            }
            default: {
                ks.a().a(n2 - 99999990, go.w, this.ak);
                com.mg.sq.a.s().a(null, (il)null);
                com.mg.bas.ag.b().a(-9898989, false);
                break;
            }
        }
    }

    public final boolean f(int n) {
        if (!this.O) {
            return false;
        }
        if (this.am.l != null) {
            this.d(0, 106);
            return true;
        }
        if (this.N) {
            return true;
        }
        if (com.mg.bas.v.ai) {
            final char a;
            if ((a = com.mg.bas.ae.a(n)) == 'w' || a == 'W') {
                n = 99;
            }
            else if (a == 'a' || a == 'A') {
                n = 97;
            }
            else if (a == 'd' || a == 'D') {
                n = 96;
            }
            else if (a == 's' || a == 'x' || a == 'X' || a == 'S') {
                n = 98;
            }
        }
        if (this.M != null && this.M.d.a == 0) {
            switch (n) {
                case 97: {
                    if (this.M.b() == 0 && !this.o && this.l.t.a <= this.M.n() + this.M.p() / 2) {
                        om.i = null;
                        this.e(false);
                        this.u.b(go.w, this.M.d.c);
                        com.mg.sq.a.s().a(null, (il)null);
                        this.o = true;
                        break;
                    }
                    break;
                }
                case 96: {
                    if (this.M.b() == 1 && !this.o && this.l.t.a + this.l.t.c + 10 >= this.M.n() + this.M.p() / 2) {
                        om.i = null;
                        this.e(false);
                        this.u.b(go.w, this.M.d.c);
                        com.mg.sq.a.s().a(null, (il)null);
                        this.o = true;
                        break;
                    }
                    break;
                }
            }
        }
        if (this.F == null) {
            return true;
        }
        if (this.l != null) {
            final jv m = this.m;
            final int n2 = n;
            final kl l = this.l;
            final kh f = this.F;
            m.a(n2, l);
        }
        return true;
    }

    public final boolean g(int n) {
        if (!this.O) {
            return false;
        }
        if (com.mg.bas.v.ai) {
            final char a;
            if ((a = com.mg.bas.ae.a(n)) == 'w' || a == 'W') {
                n = 99;
            }
            else if (a == 'a' || a == 'A') {
                n = 97;
            }
            else if (a == 'd' || a == 'D') {
                n = 96;
            }
            else if (a == 's' || a == 'x' || a == 'X' || a == 'S') {
                n = 98;
            }
        }
        if (this.l != null) {
            final jv m = this.m;
            final int n2 = n;
            final kl l = this.l;
            m.a(n2);
        }
        return true;
    }

    public final void a(lh lh2, boolean bl) {
        this.V.a(lh2);
        if (bl) {
            this.l.b(lh2);
            this.l.a(lh2);
        }
    }

    public final void e(boolean bl) {
        this.l.b(bl);
    }

    public final boolean c(int n, int n2) {
        if (!this.O) {
            return false;
        }
        if (new k(this.l.n() - com.mg.bas.v.t / 2, this.l.o(), com.mg.bas.v.t / 2, this.l.q()).a(n -= this.F.n(), n2 -= this.F.o())) {
            this.f(97);
            return true;
        }
        if (new k(this.l.n() + this.l.p(), this.l.o(), com.mg.bas.v.t / 2, this.l.p()).a(n, n2)) {
            this.f(96);
            return true;
        }
        if (new k(this.l.n(), this.l.o() - com.mg.bas.v.u / 2, this.l.p(), com.mg.bas.v.u / 2).a(n, n2)) {
            this.f(99);
            return true;
        }
        if (new k(this.l.n(), this.l.o() + this.l.q(), this.l.p(), com.mg.bas.v.u / 2).a(n, n2)) {
            this.f(98);
            return true;
        }
        if (new k(this.l.n() - com.mg.bas.v.t / 2, this.l.o() - com.mg.bas.v.u / 2, com.mg.bas.v.t / 2, com.mg.bas.v.u / 2).a(n, n2)) {
            this.f(99);
            this.f(97);
            return true;
        }
        if (new k(this.l.n() + this.l.p(), this.l.o() - com.mg.bas.v.u / 2, com.mg.bas.v.t / 2, com.mg.bas.v.u / 2).a(n, n2)) {
            this.f(99);
            this.f(96);
            return true;
        }
        if (new k(this.l.n(), this.l.o(), this.l.p(), this.l.q()).a(n, n2)) {
            this.f(95);
        }
        return false;
    }

    public final boolean f(int n, int n2) {
        if (!this.O) {
            return false;
        }
        n -= this.F.n();
        n2 -= this.F.o();
        if (this.l.j == 7) {
            this.g(97);
            this.g(96);
            this.g(99);
            this.g(98);
        }
        if (new k(this.l.n() - com.mg.bas.v.t / 2, this.l.o(), com.mg.bas.v.t / 2, this.l.q()).a(n, n2)) {
            this.g(97);
            return true;
        }
        if (new k(this.l.n() + this.l.p(), this.l.o(), com.mg.bas.v.t / 2, this.l.p()).a(n, n2)) {
            this.g(96);
            return true;
        }
        if (new k(this.l.n(), this.l.o() - com.mg.bas.v.u / 2, this.l.p(), com.mg.bas.v.u / 2).a(n, n2)) {
            this.g(99);
            return true;
        }
        if (new k(this.l.n(), this.l.o() + this.l.q(), this.l.p(), com.mg.bas.v.u / 2).a(n, n2)) {
            this.g(98);
            return true;
        }
        if (new k(this.l.n() - com.mg.bas.v.t / 2, this.l.o() - com.mg.bas.v.u / 2, com.mg.bas.v.t / 2, com.mg.bas.v.u / 2).a(n, n2)) {
            this.g(99);
            this.g(97);
            return true;
        }
        if (new k(this.l.n() + this.l.p(), this.l.o() - com.mg.bas.v.u / 2, com.mg.bas.v.t / 2, com.mg.bas.v.u / 2).a(n, n2)) {
            this.g(99);
            this.g(96);
            return true;
        }
        if (new k(this.l.n(), this.l.o(), this.l.p(), this.l.q()).a(n, n2)) {
            return this.g(95);
        }
        return false;
    }

    public final void a(int n, int n2, Object object) {
        if (object == null) {
            return;
        }
        br br2 = (br)object;
        if (this.ai != null && br2.b().equals(this.ai.b())) {
            this.ai.b(false);
        }
        this.X.a(n2, br2);
        this.y();
    }

    private void y() {
        Object object;
        this.am.t();
        this.aj = null;
        this.ai = null;
        if (this.an.a() != null && this.an.a() instanceof gj) {
            this.an.i();
            object = (gj)this.an.a();
            if (object != null && ((gj)object).d()) {
                ((at)object).b(false);
                this.an.i();
                object = (gj)this.an.a();
            }
            if (object != null) {
                ((gj)object).d(true);
                ((at)object).g(this.d() + this.f() - ((at)object).q() - 30);
                ((at)object).f(this.c() + 5);
                ((gj)object).a(10);
                ((gj)object).a(new k(((at)object).n() + 9, ((at)object).o() + 9, ((at)object).p() - 20, ((at)object).q() - 20));
                ((gj)object).c(true);
            }
        }
        if ((object = com.mg.bas.ag.b().e()) != null && ((am)object).h() == 241203) {
            object = (ib)object;
            ((ib)object).j(true);
        }
    }

    private Image g(int n, int n2) {
        byte[] byArray = oa.b[om.a(n, oa.c.m)];
        if (n2 != 0) {
            boolean bl = true;
            int n3 = 0;
            while (n3 < this.ad.length) {
                if (this.ad[n3] == 0) {
                    this.ad[n3] = n;
                    break;
                }
                if (this.ad[n3] == n) {
                    bl = false;
                    break;
                }
                ++n3;
            }
            if (n3 == this.ad.length) {
                int[] nArray = new int[n3 + 10];
                System.arraycopy(this.ad, 0, nArray, 0, n3);
                this.ad = nArray;
            }
            if (bl) {
                com.mg.bas.h.b(byArray, n2);
            }
        }
        return com.mg.bas.f.a(byArray);
    }

    public final void t() {
        Object object;
        boolean bl = true;
        if (gr.m && go.k.G < 3) {
            gr.m = false;
            try {
                int n = bx.c.a() * 3 + 20;
                object = new gj("Chào mừng đến với sứ quân online! Hãy kiểm tra nhiệm vụ. Chọn Menu > Nhiệm vụ", this.c() + 15, this.d() + this.f() - 30, n);
                ((at)object).f(this.c() + 5);
                ((gj)object).a(10);
                ((gj)object).a(new k(((at)object).n() + 9, ((at)object).o() + 9, ((at)object).p() - 20, ((at)object).q() - 20));
                ((gj)object).c(true);
                this.an.a((at)object);
                gj gj2 = this.e() > 240 ? new gj("Tốt lắm! Hãy chọn Nhiệm vụ", this.c() + 15, this.d() + this.f() - 30, n) : new gj("Tốt lắm! Hãy chọn Nhiệm vụ", this.c() + 15, this.d() + this.f() - 30, this.e() - 80, n, false);
                gj2.a(new String[]{"Nhiệm Vụ", "Nhiệm Vụ"});
                gj2.f(this.c() + 5);
                gj2.a(10);
                gj2.a(new k(gj2.n() + 9, gj2.o() + 9, gj2.p() - 20, gj2.q() - 20));
                gj2.c(true);
                ((gj)object).a(gj2);
                this.an.a(gj2);
                bl = false;
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        if (gr.n && go.k.G <= 6) {
            int[] nArray = new int[9];
            try {
                int n = 0;
                while (n < go.k.E.length) {
                    lv lv2 = go.k.E[n];
                    int n2 = lv2.a % 100;
                    nArray[n2] = go.k.E[n].f;
                    ++n;
                }
                int n3 = 0;
                while (n3 < go.r.length) {
                    n = nArray[n3];
                    if (n == 2) {
                        n = 1;
                    }
                    if (n < go.r[n3].c.length && go.r[n3].c[n].b <= go.k.G && go.k.L >= go.r[n3].c[n].c) {
                        gr.n = false;
                        int n4 = bx.c.a() * 3 + 20;
                        gj gj3 = new gj("Bạn vừa lên cấp, có thể tăng điểm tuyệt chiêu. Bấm menu trái > Nhân vật > Tuyệt chiêu", this.c() + 15, this.d() + this.f() - 30, n4);
                        gj3.f(this.c() + 5);
                        gj3.a(10);
                        gj3.a(new k(gj3.n() + 9, gj3.o() + 9, gj3.p() - 20, gj3.q() - 20));
                        gj3.c(true);
                        gj3.d(bl);
                        this.an.a(gj3);
                        gj gj4 = this.e() > 240 ? new gj("Chọn Nhân vật > Tuyệt chiêu", this.c() + 15, this.d() + this.f() - 30, n4) : new gj("Chọn Nhân vật > Tuyệt chiêu", this.c() + 15, this.d() + this.f() - 30, this.e() - 80, n4, false);
                        gj4.f(this.c() + 5);
                        gj4.a(10);
                        gj4.a(new k(gj4.n() + 9, gj4.o() + 9, gj4.p() - 20, gj4.q() - 20));
                        gj4.a(new String[]{"Nhân Vật", "Tuyệt Chiêu"});
                        gj4.c(true);
                        gj3.a(gj4);
                        this.an.a(gj4);
                        return;
                    }
                    ++n3;
                }
                return;
            }
            catch (Exception exception) {
                object = exception;
                ct.a(exception);
            }
        }
    }

      public final void a(final String s, final byte b) {
        if (s == null) {
            this.X.u();
            return;
        }
        try {
            if (this.M == null) {
                com.mg.sq.a.s().q(s);
                return;
            }
            if (this.M.d.b.equals(this.af)) {
                final as as;
                (as = new as(this.M.f, 1)).a(new byte[][] { new byte[1] });
                as.c(2);
                com.mg.bas.ag.b().a(new ic(this.M.n(), this.M.o() - 10, this.F.a(), as, s, this.M.d.b));
                return;
            }
            this.af = null;
        }
        catch (final Exception ex) {
//            final Throwable t;
            ex.printStackTrace();
        }
    }

    public final void u() {
        if (this.N) {
            this.q();
        }
    }

    public final void v() {
        int n = 0;
        while (n < this.L.length) {
            if (this.L[n].d.a == 2) {
                kk kk2 = (kk)this.L[n];
                kk2.a(false, 0);
                kk2.d();
                this.ae = false;
                if (this.l.t.b(this.L[n].d.d, this.L[n].d.e, this.L[n].d.f, this.L[n].d.g)) {
                    this.M = this.L[n];
                    this.ab = null;
                    if (this.M.c()) break;
                    this.am.c(this.B);
                    return;
                }
            }
            ++n;
        }
    }

    public final void a(final String[] array) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < this.ag.d(); ++j) {
                final ll ll = (ll)this.ag.b(j);
                if (array[i].equals(ll.c)) {
                    go.a(ll);
                    this.ag.a(j);
                    break;
                }
            }
        }
        if (gr.o) {
            gr.o = false;
            final int n = bx.c.a() * 3 + 20;
            final gj gj;
            (gj = new gj("Bạn vừa có vật phẩm. Hãy bấm phím menu trái > Nhân vật > Rương đồ", this.c() + 15, this.d() + this.f() - 30, n)).f(this.c() + 5);
            gj.a(10);
            gj.a(new k(gj.n() + 9, gj.o() + 9, gj.p() - 20, gj.q() - 20));
            gj.c(true);
            this.an.a(gj);
            gj gj2;
            if (this.e() > 240) {
                gj2 = new gj("Tốt lắm! Hãy chọn Nhân vật > Rương đồ", this.c() + 15, this.d() + this.f() - 30, n);
            }
            else {
                gj2 = new gj("Tốt lắm! Hãy chọn Nhân vật > Rương đồ", this.c() + 15, this.d() + this.f() - 30, this.e() - 80, n, false);
            }
            gj2.a(new String[] { "Nhân Vật", "Rương Đồ" });
            gj2.f(this.c() + 5);
            gj2.a(10);
            gj2.a(new k(gj2.n() + 9, gj2.o() + 9, gj2.p() - 20, gj2.q() - 20));
            gj2.c(true);
            gj.a(gj2);
            this.an.a(gj2);
        }
    }

    public final void a(final int[] array, final String[] array2) {
        final he he;
        (he = new he()).b(-9898989);
        he.a(new ba());
        he.a((bf)this);
        int n = 10;
        final ex[] array3 = new ex[array.length];
        int n2 = 0;
        for (int i = 0; i < array.length; ++i) {
            final int n3;
            if ((n3 = bx.d.a(array2[i]) + 30) > n2) {
                n2 = n3;
            }
            (array3[i] = new ex(array2[i], array[i] + 99999990)).a(10, n, n2, 18);
            n += array3[i].f() + 5;
        }
        he.a(array3);
        for (int j = array3.length - 1; j >= 0; --j) {
            array3[j].d(n2);
        }
        n2 += 20;
        final int n4 = n + 5;
        he.a(com.mg.bas.v.t - n2 >> 1, com.mg.bas.v.u - n4 >> 1, n2, n4);
        he.b(new gb(-999, 3), true);
        if (this.M != null) {
            he.a(he.a(), this.M.o() + this.F.o() - he.j(), he.i(), he.j());
        }
        he.f(0);
        com.mg.bas.ag.b().a(he, false);
    }

    public final void w() {
        this.am.a((bf)null);
        this.al = null;
        this.I = null;
        this.q = null;
        this.W = null;
        this.V = null;
        this.aa = null;
        this.ab = null;
        this.K = null;
        this.ag = null;
        this.t = null;
        this.r = null;
        this.s = null;
        if (this.H != null) {
            this.H.b();
        }
        this.H = null;
        this.G.b();
        this.G = null;
        this.n = null;
        this.l = null;
        this.af = null;
        this.X = null;
        ct.b("Finish Map.destroy()");
    }

      public final void a(final lt[] array) {
        if (array != null) {
            this.ap = new jx[array.length];
            for (int i = 0; i < array.length; ++i) {
                (this.ap[i] = new jx(com.mg.bas.f.a(pa.a().b(array[i].a, false)), 1)).a(array[i].b);
                if (array[i].a == 200000 && array[i].b > 0L) {
                    this.aq = false;
                }
                else {
                    this.aq = true;
                }
            }
        }
    }
}
