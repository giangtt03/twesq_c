package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class id
extends ht
implements bq {
    private ox k;
    private fg p;
    private fg q;
    private fg r;
    private dc s;
    private ay t;
    private ay u;
    private ay v;
    private k w = null;
    private k x = null;
    private k y = null;
    private lh z;
    private int A;
    private az B;
    private az C;
    private byte D = 0;
    private byte[][] E;
    private ex F;
    private aq[] G;
    private int H;
    private String I;
    private Object J = new Object();
    private fw K;
    private int L = 0;
    private lm M;
    private int N;
    private long O;
    private String P;
    private boolean Q = false;
    private boolean R = false;
    private k S;
    private String T;
    private by U;
    private d V;

    public id(String string, String object, String string2, ox ox2, d d2) {
        this.I = string;
        this.P = string2;
        if (d2 == null) {
            d2 = new iff(new int[]{0xFF0000, 0xFFFF00});
        }
        this.V = d2;
        this.k = new ox(ox2);
        this.b(241232);
        this.a(new ba());
        this.a(this);
        int n = 240;
        int n2 = 320 - ba.a;
        if (com.mg.sq.a.k == 1) {
            n = 320;
            n2 = v.u - ba.a;
        }
        int n3 = v.t >= n ? (v.t - n) / 2 : 0;
        int n4 = v.u >= n2 ? (v.u - ba.a - n2) / 2 : 0;
        this.S = new k(n3, n4, n, n2);
        this.t();
        this.a((String)object);
        object = this.B;
        id id2 = this;
        id2.b((az)object, true);
        this.a((az)null);
    }

    private void t() {
        int n = v.t - 20;
        this.w = new k((v.t - n) / 2, 130, n, this.g - 155);
        this.y = new k((v.t - n) / 2 - 4, 30, 44, 44);
        this.x = new k((v.t - n) / 2 + 46, 30, n - 44, 44);
        this.p = new fg(false);
        this.p.e(true);
        this.p.i = new k(this.w.a, this.w.b, this.w.c, this.w.d);
        this.z = go.k.a();
        Object object = this.z;
        int n2 = go.l.length - object.D.length;
        int n3 = 0;
        while (n3 < go.m.length) {
            n2 = go.m[n3].l == 1 ? (n2 += go.m[n3].g) : (go.m[n3].l > 1 ? (n2 += go.m[n3].g / go.m[n3].l + (go.m[n3].g % go.m[n3].l > 0 ? 1 : 0)) : ++n2);
            ++n3;
        }
        this.A = n2;
        if (this.A < go.n) {
            this.A = go.n;
        }
        this.p.d(this.A, 1);
        this.p.a(this);
        ll[] llArray = go.l;
        object = this;
        n3 = object.z.D.length;
        object.p.t();
        int n4 = 0;
        while (n4 < llArray.length) {
            if (llArray[n4] != null) {
                boolean bl = false;
                if (n3 > 0) {
                    int n5 = 0;
                    while (n5 < object.z.D.length) {
                        if (llArray[n4].c.equals(object.z.D[n5].c)) {
                            --n3;
                            bl = true;
                            break;
                        }
                        ++n5;
                    }
                }
                if (!bl) {
                    dc dc2 = new dc(object.k.a(mb.a(llArray[n4]) + 98, true), llArray[n4], 0, object.V);
                    object.p.a((Object)dc2);
                }
            }
            ++n4;
        }
        this.q = new fg(false);
        this.q.i = new k(this.x.a, this.x.b, this.x.c, this.x.d);
        this.q.d(5, 0);
        this.q.a(this);
        this.q.j = true;
        this.r = new fg(false);
        this.r = new fg(false);
        this.r.i = new k(this.y.a + 2, this.y.b, this.y.c, this.y.d);
        this.r.d(1, 0);
        this.r.a(this);
        this.r.j = true;
        this.r.d(true);
        this.r.i(0);
        object = new lm[go.m.length];
        int n6 = 0;
        while (n6 < ((lm[])object).length) {
            object[n6] = go.m[n6].b();
            ++n6;
        }
        this.a((lm[])object);
        object = this;
        this.E = new byte[4][4];
        object.E[0] = new byte[]{1, -1, 2, -1};
        byte[] byArray = new byte[4];
        byArray[0] = 2;
        byArray[2] = 2;
        byArray[3] = -1;
        object.E[1] = byArray;
        byte[] byArray2 = new byte[4];
        byArray2[0] = 3;
        byArray2[1] = 2;
        byArray2[2] = 3;
        object.E[2] = byArray2;
        object.E[3] = new byte[]{-1, 2, -1, 2};
        this.u = new ay();
        this.u.a(new k(this.x.a, this.x.b, this.x.c, this.x.d + 2));
        this.u.b(this.q);
        this.u.h(2);
        this.t = new ay();
        this.t.a(new k(this.w.a, this.w.b, this.w.c, this.w.d));
        this.t.b(this.p);
        this.t.h(2);
        this.v = new ay();
        this.v.a(new k(this.y.a, this.y.b, this.y.c, this.y.d + 2));
        this.v.b(this.r);
        this.v.h(2);
        this.F = new ex("Nâng cấp", 2);
        n6 = bx.d.a("Nâng cấp") + 10;
        this.F.a(this.c + (v.t - n6) / 2, this.w.b - 25, n6, 18);
        this.G = new aq[]{this.v, this.u, this.F, this.t};
        this.U = new by(0xFF0000);
        this.B = new gb(1, 3);
        this.C = new gb(3, 2);
    }

    private void a(lm[] lmArray) {
        int n = 0;
        while (n < lmArray.length) {
            int n2;
            int n3 = n2 = lmArray[n].e == 3 ? 2 : 1;
            if (lmArray[n].g > 0) {
                if (lmArray[n].l > 0) {
                    Object object;
                    int n4 = lmArray[n].g;
                    int n5 = lmArray[n].g / lmArray[n].l;
                    int n6 = 0;
                    while (n6 < n5) {
                        object = lmArray[n].b();
                        lmArray[n].b().g = lmArray[n].l;
                        n4 -= lmArray[n].l;
                        object = new dc(null, object, n2, this.V);
                        this.p.a(object);
                        ++n6;
                    }
                    if (n4 > 0) {
                        lm lm2 = lmArray[n].b();
                        lmArray[n].b().g = n4;
                        object = new dc(null, lm2, n2, this.V);
                        this.p.a(object);
                    }
                } else {
                    dc dc2 = new dc(null, lmArray[n], n2, this.V);
                    this.p.a((Object)dc2);
                }
            }
            ++n;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void v() {
        Object object = this.J;
        synchronized (object) {
            dc dc2;
            this.e(true);
            int n = 0;
            int n2 = 0;
            int n3 = 0;
            while (n3 < this.q.s()) {
                dc2 = (dc)this.q.k(n3);
                if (dc2.j == 0) {
                    if (dc2.k != null) {
                        ++n;
                    }
                } else if (dc2.j == 1) {
                    ++n2;
                }
                ++n3;
            }
            n3 = 0;
            int n4 = 0;
            String[] stringArray = new String[n];
            int[] nArray = new int[n2];
            int[] nArray2 = new int[n2];
            int n5 = 0;
            while (n5 < this.q.s()) {
                dc2 = (dc)this.q.k(n5);
                if (dc2.j == 0) {
                    if (dc2.k != null) {
                        stringArray[n3] = ((ll)dc2.k).c;
                        ++n3;
                    }
                } else if (dc2.j == 1 && dc2.k != null) {
                    nArray[n4] = ((lm)dc2.k).a;
                    nArray2[n4] = ((lm)dc2.k).g;
                    ++n4;
                }
                ++n5;
            }
            ks.a().b(this.I, stringArray, nArray, nArray2, this.O);
            com.mg.sq.a.s().a((String)null, (il)null);
            return;
        }
    }

    protected final boolean g(int n) {
        switch (n) {
            case 4: {
                if (this.s.k == null) break;
                id id2 = this;
                if (id2.s.k != null) {
                    if (id2.s.j == 0) {
                        ks.a().b(id2.I, (byte)1, ((ll)id2.s.k).c);
                    } else {
                        id2.M = (lm)id2.s.k;
                        int n2 = 0;
                        int n3 = 0;
                        while (n3 < id2.q.s()) {
                            lm lm2;
                            if ((((dc)id2.q.k((int)n3)).j == 1 || ((dc)id2.q.k((int)n3)).j == 2) && (lm2 = (lm)((dc)id2.q.k((int)n3)).k) != null && lm2.a == id2.M.a) {
                                n2 += lm2.g;
                            }
                            ++n3;
                        }
                        ks.a().b(id2.I, (byte)1, id2.M.a, n2);
                    }
                }
                id2.Q = true;
                com.mg.sq.a.s().a((String)null, (il)null);
                if (this.m == null) break;
                this.A();
                break;
            }
            case 5: {
                gu gu2;
                if (!com.mg.sq.a.s().c(-7524) || (gu2 = (gu)com.mg.sq.a.s().d(-7524)) == null) break;
                this.M = gu2.t();
                int n4 = this.M.g = gu2.u();
                ks.a().b(this.I, (byte)0, this.M.a, n4);
                com.mg.sq.a.s().a((String)null, (il)null);
                ag.b().a(-7524, false);
                break;
            }
            case 6: {
                ag.b().a(false);
                break;
            }
            case 2: {
                ct.a("Command Upgradeready " + this.N + "processUpgrade" + this.R);
                if (!this.R) {
                    if (this.N == 0) {
                        id id3 = this;
                        al al2 = ag.b().a("Chú ý", "Chưa đủ nguyên liệu. Vui lòng thử lại!!!", "Đóng", 6, 1);
                        al2.b(199199);
                        al2.a(id3);
                        ag.b().a(al2, false);
                        break;
                    }
                    if (this.N != 1) break;
                    if (go.s > -1L && this.O > go.s) {
                        id id4 = this;
                        al al3 = ag.b().a("Chú ý", "Vượt quá số tiền bạn đang có. Vui lòng thử lại!!!", "Đóng", 6, 1);
                        al3.b(199199);
                        al3.a(id4);
                        ag.b().a(al3, false);
                        break;
                    }
                    id id5 = this;
                    hc hc2 = new hc(String.valueOf(id5.P) + ". Bạn có muốn nâng cấp không?", "Nâng cấp", 7, "Không", 6);
                    hc2.a(id5);
                    ag.b().a(hc2, false);
                    break;
                }
                this.w();
                this.F.a("Nâng cấp");
                this.R = false;
                this.T = null;
                this.P = null;
                break;
            }
            case 7: {
                ag.b().a(false);
                this.v();
            }
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(ll[] llArray, lm[] lmArray, byte by2) {
        if (ct.a()) {
            ct.a("Receive " + llArray.length + " equips, " + lmArray.length + " items after upgrade.");
        }
        com.mg.sq.a.s().v();
        Object object = this.J;
        synchronized (object) {
            dc dc2;
            this.e(true);
            int n = 0;
            while (n < this.r.s()) {
                dc2 = (dc)this.r.k(n);
                if (dc2.k != null) {
                    if (dc2.j == 0) {
                        go.b((ll)dc2.k);
                    } else {
                        go.a((lm)dc2.k);
                    }
                }
                ++n;
            }
            n = 0;
            while (n < this.q.s()) {
                dc2 = (dc)this.q.k(n);
                if (dc2.k != null) {
                    if (dc2.j == 0) {
                        go.b((ll)dc2.k);
                    } else {
                        go.a((lm)dc2.k);
                    }
                }
                ++n;
            }
            this.r.t();
            this.q.t();
            n = 0;
            while (n < llArray.length) {
                if (llArray[n] != null) {
                    dc2 = new dc(this.k.a(mb.a(llArray[n]) + 98, true), llArray[n], 0, this.V);
                    this.r.a((Object)dc2);
                    go.a(llArray[n]);
                }
                ++n;
            }
            n = 0;
            while (n < lmArray.length) {
                if (lmArray[n] != null) {
                    dc2 = new dc(null, lmArray[n], lmArray[n].e, this.V);
                    this.r.a((Object)dc2);
                    go.a(lmArray[n], lmArray[n].g);
                }
                ++n;
            }
        }
        this.T = by2 == 1 ? "Nâng cấp thành công" : "Nâng cấp thất bại";
        this.R = true;
        this.F.a("Tiếp tục");
    }

    protected final void e(int n) {
        switch (n) {
            case 1: {
                if (this.m != null) {
                    this.A();
                    return;
                }
                ag.b().a(false);
                if (com.mg.sq.a.s().c(241202)) {
                    com.mg.sq.a.s().e(241202);
                }
                hh hh2 = new hh(null, null);
                ag.b().a(hh2);
                return;
            }
            case 3: {
                this.c(95);
            }
        }
    }

    protected final void f(int n) {
        byte by2 = this.D;
        switch (n) {
            case 96: 
            case 97: 
            case 98: 
            case 99: {
                if (!this.G[this.D].f(n)) {
                    int n2 = n - 96;
                    id id2 = this;
                    if (n2 >= 0 && (n2 = id2.E[id2.D][n2]) >= 0) {
                        id2.D = (byte)n2;
                    }
                }
                if (by2 != this.D) {
                    this.G[this.D].d(true);
                    this.G[by2].d(false);
                    if (this.G[this.D] instanceof ay) {
                        fg fg2 = (fg)((ay)this.G[this.D]).w();
                        fg2.i(0);
                    }
                }
                if (this.p.m()) {
                    this.a(this.p.r());
                    return;
                }
                if (this.q.m()) {
                    this.a(this.q.r());
                    return;
                }
                if (this.r.m()) {
                    this.a(this.r.r());
                    return;
                }
                this.K = null;
                return;
            }
            case 95: {
                if (this.G[2].m()) {
                    this.i.d(0, ((ex)this.G[2]).a());
                    return;
                }
                this.G[this.D].f(n);
                return;
            }
        }
        this.G[this.D].f(n);
    }

    public final void f(int n, int n2) {
        this.e(true);
        if (this.m != null) {
            boolean bl;
            block10: {
                int n3 = n2;
                int n4 = n;
                az[] azArray = this.m.a();
                id id2 = this;
                int n5 = 0;
                while (n5 < azArray.length) {
                    if (azArray[n5] != null && azArray[n5].a(n4, n3)) {
                        if (id2.i != null) {
                            id2.i.d(-1, azArray[n5].a());
                        }
                        bl = true;
                        break block10;
                    }
                    ++n5;
                }
                bl = false;
            }
            if (bl) {
                return;
            }
            if (this.m.c(n, n2)) {
                return;
            }
            this.A();
            return;
        }
        byte by2 = this.D;
        int n6 = 0;
        while (n6 < this.G.length) {
            k k2 = this.G[n6].equals(this.t) ? new k(this.p.i.a + this.S.a, this.p.i.b + this.S.b, this.p.i.c, this.p.i.d) : (this.G[n6].equals(this.u) ? new k(this.q.i.a + this.S.a, this.q.i.b + this.S.b, this.q.i.c, this.q.i.d) : new k(this.G[n6].c() + this.S.a, this.G[n6].d() + this.S.b, this.G[n6].e(), this.G[n6].f()));
            if (k2.a(n, n2)) {
                if (n6 != by2) {
                    this.D = (byte)n6;
                    this.G[by2].d(false);
                    this.G[this.D].d(true);
                }
                this.G[n6].c(n - this.S.a, n2 - this.S.b);
                if (this.G[n6] instanceof ex) {
                    this.d(-1, ((ex)this.G[n6]).a());
                }
                return;
            }
            n6 = (byte)(n6 + 1);
        }
    }

    public final void e(int n, int n2) {
        if (this.p.m()) {
            this.p.e(n, n2);
        }
    }

    private void a(Object object) {
        this.L = 0;
        this.K = null;
        this.s = (dc)object;
    }

    public final void u() {
        int n = 0;
        while (n < this.G.length) {
            if (this.G[n] != null) {
                this.G[n].n();
                this.G[n].c(true);
            }
            ++n;
        }
        if (this.K != null) {
            this.K.i();
        }
        if (this.L < 7) {
            ++this.L;
            if (this.L == 7 && this.s != null && this.s.k != null) {
                Object object = this.s.k;
                id id2 = this;
                this.K = new fw(object);
                int n2 = id2.g - 18;
                id2.K.a(9, n2, id2.f - 20, id2.g / 4);
                id2.K.c(9, n2);
                id2.K.a(9, n2 - id2.K.q() - 7);
            }
        }
        if (this.h) {
            --this.H;
            if (this.H <= 0) {
                this.e(false);
                this.H = 0;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(String string, String object, byte by2, long l) {
        com.mg.sq.a.s().v();
        Object object2 = this.J;
        synchronized (object2) {
            this.e(true);
            this.N = by2;
            this.P = object;
            this.O = l;
            int n = 0;
            while (n < this.q.s()) {
                object = (dc)this.q.k(n);
                if (((dc)object).j == 0 && ((dc)object).k != null) {
                    ll ll2 = (ll)((dc)object).k;
                    if (ll2.c.equals(string)) {
                        this.q.a((dc)object);
                        this.p.a(object);
                        this.a(this.q.r());
                        return;
                    }
                }
                ++n;
            }
            return;
        }
    }

    public final void a(String object, byte by2, long l) {
        com.mg.sq.a.s().v();
        if (this.Q) {
            this.N = by2;
            this.P = object;
            this.O = l;
            this.q.a(this.s);
            lm lm2 = (lm)this.s.k;
            object = this;
            int n = 0;
            a a2 = new a();
            int n2 = 0;
            while (n2 < ((id)object).p.s()) {
                lm lm3;
                if ((((dc)((id)object).p.k((int)n2)).j == 1 || ((dc)((id)object).p.k((int)n2)).j == 2) && (lm3 = (lm)((dc)((id)object).p.k((int)n2)).k) != null && lm3.a == lm2.a) {
                    n += lm3.g;
                    a2.a(((id)object).p.k(n2));
                }
                ++n2;
            }
            n += lm2.g;
            n2 = 0;
            while (n2 < a2.d()) {
                ((id)object).p.a((dc)a2.b(n2));
                ++n2;
            }
            if (lm2.l <= 0) {
                lm lm4 = lm2.b();
                lm2.b().g = n;
                dc dc2 = new dc(null, lm4, lm2.e == 3 ? 2 : 1, ((id)object).V);
                ((id)object).p.a((Object)dc2);
            } else {
                n2 = n / lm2.l + (n % lm2.l > 0 ? 1 : 0);
                int n3 = 0;
                while (n3 < n2) {
                    Object object2 = lm2.b();
                    if (n >= lm2.l) {
                        ((lm)object2).g = lm2.l;
                        n -= lm2.l;
                    } else if (n > 0) {
                        ((lm)object2).g = n;
                        n = 0;
                    }
                    object2 = new dc(null, object2, lm2.e == 3 ? 2 : 1, ((id)object).V);
                    ((id)object).p.a(object2);
                    ++n3;
                }
            }
            this.x();
            this.Q = false;
            this.s = null;
            this.a(this.q.r());
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void b(String string, String object, byte by2, long l) {
        com.mg.sq.a.s().v();
        Object object2 = this.J;
        synchronized (object2) {
            this.e(true);
            this.N = by2;
            this.P = object;
            this.O = l;
            int n = 0;
            while (n < this.p.s()) {
                object = (dc)this.p.k(n);
                if (((dc)object).j == 0 && ((dc)object).k != null) {
                    ll ll2 = (ll)((dc)object).k;
                    if (ll2.c.equals(string)) {
                        this.p.a((dc)object);
                        this.q.a(object);
                        this.a(this.p.r());
                        return;
                    }
                }
                ++n;
            }
            return;
        }
    }

    private void a(String string) {
        int n = 0;
        while (n < this.p.s()) {
            dc dc2 = (dc)this.p.k(n);
            if (dc2.j == 0 && dc2.k != null) {
                ll ll2 = (ll)dc2.k;
                if (ll2.c.equals(string)) {
                    this.p.a(dc2);
                    this.r.a((Object)dc2);
                    this.a(this.r.r());
                    return;
                }
            }
            ++n;
        }
    }

    private void w() {
        int n = 0;
        while (n < this.r.s()) {
            dc dc2 = (dc)this.r.k(n);
            ks.a().r(((ll)dc2.k).c);
            ++n;
        }
    }

    public final void b(String object, byte by2, long l) {
        com.mg.sq.a.s().v();
        if (this.M != null) {
            this.N = by2;
            this.P = object;
            this.O = l;
            by2 = 0;
            a a2 = new a();
            int n = 0;
            while (n < this.q.s()) {
                if (((dc)this.q.k((int)n)).j == 1 && (object = (lm)((dc)this.q.k((int)n)).k) != null && ((ld)object).a == this.M.a) {
                    by2 = (byte)(by2 + ((lm)object).g);
                    a2.a(this.q.k(n));
                }
                ++n;
            }
            by2 = (byte)(by2 + this.M.g);
            n = 0;
            while (n < a2.d()) {
                this.q.a((dc)a2.b(n));
                ++n;
            }
            if (this.M.l <= 0) {
                object = this.M.b();
                this.M.b().g = by2;
                dc dc2 = new dc(null, object, 1, this.V);
                this.q.a((Object)dc2);
            } else {
                n = by2 / this.M.l + (by2 % this.M.l > 0 ? 1 : 0);
                int n2 = 0;
                while (n2 < n) {
                    object = this.M.b();
                    if (by2 >= this.M.l) {
                        ((lm)object).g = this.M.l;
                        by2 = (byte)(by2 - this.M.l);
                    } else if (by2 > 0) {
                        ((lm)object).g = by2;
                        by2 = 0;
                    }
                    object = new dc(null, object, 1, this.V);
                    this.q.a(object);
                    ++n2;
                }
            }
            lm lm2 = this.M;
            object = this;
            int n3 = 0;
            lm lm3 = lm2.b();
            a a3 = new a();
            int n4 = 0;
            while (n4 < ((id)object).p.s()) {
                lm lm4;
                ((id)object).s = (dc)((id)object).p.k(n4);
                if (((id)object).s != null && ((id)object).s.k != null && (((id)object).s.j == 1 || ((id)object).s.j == 2) && (lm4 = (lm)((id)object).s.k) != null && lm4.a == lm2.a) {
                    n3 += lm4.g;
                    a3.a(((id)object).s);
                }
                ++n4;
            }
            lm3.g = n3 - lm2.g;
            n4 = 0;
            while (n4 < a3.d()) {
                ((id)object).p.a((dc)a3.b(n4));
                ++n4;
            }
            if (lm3.g > 0) {
                super.a(new lm[]{lm3});
            }
            super.x();
            this.a(this.p.r());
        }
    }

    public final void e(boolean bl) {
        super.e(bl);
        this.H = 5;
    }

    public final void b(Graphics graphics) {
        this.U.a(graphics, "Phí kết hợp: " + i.a(this.O, ",") + " KEN", (v.t - bx.d.a("Phí kết hợp: ")) / 2 - 10, 10, 0);
        if (!this.R) {
            if (this.P != null) {
                this.U.a(graphics, this.P, (v.t - bx.d.a(this.P)) / 2, this.q.d() + this.q.f() + 8, 0);
            }
        } else if (this.T != null) {
            this.U.a(graphics, this.T, (v.t - bx.d.a(this.T)) / 2, this.q.d() + this.q.f() + 8, 0);
        }
        if (this.u != null) {
            this.u.a(graphics, this.c, this.d);
            this.u.c(true);
        }
        if (this.v != null) {
            this.v.a(graphics, this.c, this.d);
            this.v.c(true);
        }
        this.F.a(graphics, 0, 0);
        if (this.t != null) {
            this.t.a(graphics, this.c, this.d);
            this.t.c(true);
        }
        if (!this.n && this.K != null) {
            this.K.a(graphics, this.c, this.d);
        }
        bx.d.a(graphics, String.valueOf(this.p.s()) + "/" + go.n, this.w.a, this.w.b - 16, 0);
    }

    private void x() {
        this.p.i(this.p.q());
    }

    public final void a(Graphics graphics) {
        pc.a(graphics, this.c, this.d, this.f, this.g, v.aj, true);
    }

    public final void b(aq object, int n) {
        this.a(object);
        if (this.G[this.D] instanceof ay) {
            k k2 = ((fg)((ay)this.G[this.D]).w()).u();
            object = this;
            if (((id)object).s != null) {
                Object object2;
                bs bs2 = new bs();
                if (((id)object).u.m() && !((id)object).R && ((id)object).q != null && ((id)object).s.j != 3) {
                    bs2.a(new br("Bỏ ra", 4));
                }
                if (((id)object).t.m() && !((id)object).R && ((id)object).p != null) {
                    Object object3 = object;
                    int n2 = 0;
                    int n3 = 0;
                    while (n3 < ((id)object3).q.a()) {
                        if (((id)object3).q.k(n3) != null) {
                            ++n2;
                        }
                        ++n3;
                    }
                    if (n2 < ((id)object).q.a()) {
                        object2 = object3 = object;
                        if (((id)object3).s.k != null) {
                            object2 = object3;
                            if (((id)object2).s.j == 1) {
                                object2 = object3;
                                lm lm2 = (lm)((id)object2).s.k;
                                object2 = object3;
                                Object object4 = new dc(null, lm2.b(), ((id)object2).s.j, ((id)object3).V);
                                object4 = new gu((dc)object4);
                                ((am)object4).a((bf)object3);
                                ((gu)object4).e(lm2.g);
                                object3 = new bd("Xong", 5);
                                object2 = object4;
                                ((am)object2).a((az)object3, true);
                                ((am)object4).a(new bd("", 5));
                                object3 = new bd("Hủy", 6);
                                object2 = object4;
                                ((am)object2).b((az)object3, true);
                                ((am)object4).b(-7524);
                                ((gu)object4).j(true);
                                ag.b().a((al)object4, false);
                            } else {
                                object2 = object3;
                                if (((id)object2).s.j == 0) {
                                    object2 = object3;
                                    ks.a().b(((id)object3).I, (byte)0, ((ll)((id)object2).s.k).c);
                                    com.mg.sq.a.s().a((String)null, (il)null);
                                }
                            }
                        }
                    }
                }
                if (bs2.s() == null || bs2.s().length == 0) {
                    return;
                }
                int n4 = k2.a + ((al)object).c + (k2.c - bs2.e()) / 2;
                int n5 = k2.b + ((al)object).d + k2.d;
                if (n5 + bs2.f() > v.u - ba.a) {
                    n5 = v.u - ba.a - bs2.f();
                }
                bs2.a_(((al)object).c + ((am)object).f + bs2.e(), n5);
                bs2.d(n4 < ((al)object).c ? ((al)object).c : (n4 + bs2.e() > ((al)object).c + ((am)object).f ? ((al)object).c + ((am)object).f - bs2.e() : n4), n5);
                bs2.a((bf)object);
                az az2 = ((id)object).B;
                object2 = object;
                ((am)object2).b(az2, true);
                az2 = ((id)object).C;
                object2 = object;
                ((am)object2).a(az2, true);
                bs2.a_(1);
                ((ht)object).n = true;
                ((ht)object).a(bs2, ((id)object).C, null, ((id)object).B);
            }
        }
    }

    public final void a(aq aq2, int n) {
    }

    public final void a(aq aq2, int n, int n2) {
    }
}
