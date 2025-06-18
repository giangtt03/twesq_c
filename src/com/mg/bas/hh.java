package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class hh
extends ht
implements bq {
    private Image k = f.d("/info/hidenobj");
    private int p = 32;
    private cu q = null;
    private cu r = null;
    private k s = null;
    private k t = null;
    private k[] u;
    private fg v = null;
    private int w = 0;
    private byte[][] x;
    private mg y = null;
    private boolean z = false;
    private az A;
    private az B;
    private az C;
    private ay D;
    private dc E = null;
    private dc[] F = new dc[6];
    private boolean G = false;
    private boolean H = false;
    private boolean I = false;
    private int J = 0;
    private int K = 0;
    private int L = 0;
    private lh M;
    private ox N;
    private boolean O = false;
    private db P = null;
    private boolean Q;
    private gj R;
    private fw S;
    private int T = 0;
    private String U;
    private boolean V = false;
    private dc W;
    private boolean X;
    private int Y;
    private d Z;
    private boolean aa = false;

    public hh(ox object, d d2) {
        k k2;
        k k3;
        k k4;
        k k5;
        k k6;
        Object object2;
        this.b(241202);
        this.a(new ba());
        this.a(this);
        if (d2 == null) {
            d2 = new iff(new int[]{0xFF0000, 0xFFFF00});
        }
        this.Z = d2;
        int n = 240;
        int n2 = 320 - ba.a;
        if (hh.B()) {
            n = 320;
            n2 = v.u - ba.a;
        }
        int n3 = v.t >= n ? (v.t - n) / 2 : 0;
        int n4 = v.u >= n2 ? (v.u - ba.a - n2) / 2 : 0;
        this.a(n3, n4, n, n2);
        this.N = new ox((ox)object);
        object = this;
        this.q = new cu(6, 4);
        ((hh)object).r = new cu(22, 6);
        if (hh.B()) {
            ((hh)object).s = new k(13, 24, 54, 60);
            object2 = new k(6, 90, 32, 32);
            k6 = new k(6, 126, 32, 32);
            k5 = new k(42, 90, 32, 32);
            k4 = new k(42, 126, 32, 32);
            k3 = new k(6, 162, 32, 32);
            k2 = new k(42, 162, 32, 32);
            ((hh)object).t = new k(79, 23, 226, ((am)object).g - 33);
        } else {
            ((hh)object).s = new k(95, 21, 54, 60);
            object2 = new k(60, 18, 32, 32);
            k6 = new k(60, 53, 32, 32);
            k5 = new k(153, 18, 32, 32);
            k4 = new k(153, 53, 32, 32);
            k3 = new k(189, 18, 32, 32);
            k2 = new k(189, 53, 32, 32);
            ((hh)object).t = new k(9, 88, 220, ((am)object).g - 96);
        }
        ((hh)object).v = new fg(hh.B());
        ((hh)object).v.e(true);
        ((hh)object).v.i = new k(((hh)object).t.a, ((hh)object).t.b, ((hh)object).t.c, ((hh)object).t.d);
        ((hh)object).M = go.k.a();
        Object object3 = ((hh)object).M;
        int n5 = go.l.length - object3.D.length;
        int n6 = 0;
        while (n6 < go.m.length) {
            n5 = go.m[n6].l == 1 ? (n5 += go.m[n6].g) : (go.m[n6].l > 1 ? (n5 += go.m[n6].g / go.m[n6].l + (go.m[n6].g % go.m[n6].l > 0 ? 1 : 0)) : ++n5);
            ++n6;
        }
        ((hh)object).Y = n5;
        if (((hh)object).Y < go.n) {
            ((hh)object).Y = go.n;
        }
        ((hh)object).v.d(((hh)object).Y, 2);
        ((hh)object).v.a((bq)object);
        ((hh)object).h(0);
        ll[] llArray = go.l;
        object3 = object;
        n6 = object3.M.D.length;
        object3.v.t();
        int n7 = 0;
        while (n7 < llArray.length) {
            if (llArray[n7] != null) {
                boolean bl = false;
                if (n6 > 0) {
                    int n8 = 0;
                    while (n8 < object3.M.D.length) {
                        if (llArray[n7].c.equals(object3.M.D[n8].c)) {
                            if (llArray[n7].e != 8) {
                                lm[] lmArray = object3;
                                object3.F[llArray[n7].e] = new dc(object3.N.a(mb.a(llArray[n7]) + 98, true), llArray[n7], 0, object3.Z);
                            }
                            --n6;
                            bl = true;
                            break;
                        }
                        ++n8;
                    }
                }
                if (!bl) {
                    lm[] lmArray = object3;
                    dc dc2 = new dc(object3.N.a(mb.a(llArray[n7]) + 98, true), llArray[n7], 0, object3.Z);
                    object3.v.a((Object)dc2);
                }
            }
            ++n7;
        }
        object3 = new lm[go.m.length];
        int n9 = 0;
        while (n9 < ((lm[])object3).length) {
            object3[n9] = go.m[n9].b();
            ++n9;
        }
        super.a((lm[])object3);
        ((hh)object).D = new ay();
        ((hh)object).D.a(new k(((hh)object).t.a, ((hh)object).t.b, ((hh)object).t.c, ((hh)object).t.d));
        ((hh)object).D.b(((hh)object).v);
        ((hh)object).D.h(1);
        ((hh)object).u = new k[]{object2, k6, k5, k4, k3, k2, ((hh)object).t};
        object3 = object;
        ((hh)object).x = new byte[6][4];
        if (hh.B()) {
            byte[] byArray = new byte[4];
            byArray[0] = 2;
            byArray[2] = 1;
            object3.x[0] = byArray;
            byte[] byArray2 = new byte[4];
            byArray2[0] = 3;
            byArray2[1] = 1;
            byArray2[2] = 4;
            object3.x[1] = byArray2;
            byte[] byArray3 = new byte[4];
            byArray3[0] = -3;
            byArray3[2] = 3;
            byArray3[3] = 2;
            object3.x[2] = byArray3;
            object3.x[3] = new byte[]{-3, 1, 5, 2};
            object3.x[4] = new byte[]{5, 4, 4, 1};
            object3.x[5] = new byte[]{-3, 4, 5, 3};
        } else {
            object3.x[0] = new byte[]{2, -2, 1, -2};
            byte[] byArray = new byte[4];
            byArray[0] = 3;
            byArray[1] = -1;
            byArray[2] = -3;
            object3.x[1] = byArray;
            byte[] byArray4 = new byte[4];
            byArray4[0] = 4;
            byArray4[2] = 3;
            byArray4[3] = -1;
            object3.x[2] = byArray4;
            object3.x[3] = new byte[]{5, 1, -3, 2};
            object3.x[4] = new byte[]{4, 2, 5, 4};
            object3.x[5] = new byte[]{5, 3, -3, 4};
        }
        super.a(((hh)object).M, null);
        ((hh)object).A = new gb(0, 0);
        ((hh)object).C = new gb(3, 2);
        ((hh)object).B = new gb(4, 3);
        ((am)object).a(com.mg.sq.a.n);
        object2 = ((hh)object).A;
        Object object4 = object;
        ((am)object4).a((az)object2, true);
        object2 = ((hh)object).B;
        object4 = object;
        ((am)object4).b((az)object2, true);
        ((hh)object).i(((hh)object).w);
        ((hh)object).U = com.mg.sq.a.a(((hh)object).M.b, ((am)object).i() - 85);
        this.a((az)null);
        this.h(0);
        if (!cs.a.c(143)) {
            od.h(143);
            gr.o = false;
        }
    }

    private static boolean B() {
        return com.mg.sq.a.k == 1;
    }

    public final void a(int n, int n2, int n3, int n4) {
        super.a(n, n2, n3, n4);
    }

    public final void h(int n) {
        this.L = n;
        switch (this.L) {
            case 0: {
                this.W = null;
                this.v.a((db)null);
                az az2 = this.A;
                hh hh2 = this;
                hh2.a(az2, true);
                this.a((az)null);
                az2 = this.B;
                hh2 = this;
                hh2.b(az2, true);
                this.O = false;
                return;
            }
            case 1: {
                this.P = new db();
                if (this.v != null) {
                    this.v.a(this.P);
                }
                az az3 = null;
                hh hh3 = this;
                hh3.a(az3, true);
                return;
            }
            case 2: {
                gb gb2 = null;
                hh hh4 = this;
                hh4.a(gb2, true);
                this.a((az)null);
                gb2 = new gb(1235, 3);
                hh4 = this;
                hh4.b(gb2, true);
            }
        }
    }

    private void a(lm[] lmArray) {
        int n = 0;
        while (n < lmArray.length) {
            int n2;
            int n3 = n2 = lmArray[n].e == 3 ? 2 : 1;
            if (lmArray[n].g > 0) {
                Object object;
                if (lmArray[n].l > 0) {
                    int n4 = lmArray[n].g;
                    int n5 = lmArray[n].g / lmArray[n].l;
                    int n6 = 0;
                    while (n6 < n5) {
                        object = lmArray[n].b();
                        lmArray[n].b().g = lmArray[n].l;
                        n4 -= lmArray[n].l;
                        Object object2 = object;
                        object = this;
                        object = new dc(null, object2, n2, ((hh)object).Z);
                        this.v.a(object);
                        ++n6;
                    }
                    if (n4 > 0) {
                        lm lm2 = lmArray[n].b();
                        lmArray[n].b().g = n4;
                        object = this;
                        object = new dc(null, lm2, n2, ((hh)object).Z);
                        this.v.a(object);
                    }
                } else {
                    object = this;
                    dc dc2 = new dc(null, lmArray[n], n2, ((hh)object).Z);
                    this.v.a((Object)dc2);
                }
            }
            ++n;
        }
    }

    public final void a(lm lm2) {
        int n = 0;
        lm lm3 = lm2.b();
        a a2 = new a();
        int n2 = 0;
        while (n2 < this.v.s()) {
            lm lm4;
            this.E = (dc)this.v.k(n2);
            if (this.E != null && this.E.k != null && (this.E.j == 1 || this.E.j == 2) && (lm4 = (lm)this.E.k) != null && lm4.a == lm2.a) {
                n += lm4.g;
                a2.a(this.E);
            }
            ++n2;
        }
        lm3.g = n - lm2.g;
        n2 = 0;
        while (n2 < a2.d()) {
            this.v.a((dc)a2.b(n2));
            ++n2;
        }
        if (lm3.g > 0) {
            this.a(new lm[]{lm3});
        }
        this.v();
    }

    public final void h(int n, int n2) {
        if (n2 == 0) {
            this.i(n, Integer.MAX_VALUE);
            return;
        }
        int n3 = this.v.s() - 1;
        while (n3 >= 0) {
            this.E = (dc)this.v.k(n3);
            if (this.E.k instanceof lm) {
                lm lm2 = (lm)this.E.k;
                if (lm2.a == n) {
                    lm2.g = n2;
                }
            }
            --n3;
        }
        this.v();
    }

    public final void i(int n, int n2) {
        a a2 = new a();
        int n3 = this.v.s() - 1;
        while (n3 >= 0) {
            this.E = (dc)this.v.k(n3);
            if (this.E.k instanceof lm) {
                lm lm2 = (lm)this.E.k;
                if (lm2.a == n) {
                    if (lm2.g > n2) {
                        lm2.g -= n2;
                        break;
                    }
                    n2 -= lm2.g;
                    a2.a(this.E);
                }
            }
            --n3;
        }
        n3 = 0;
        while (n3 < a2.d()) {
            this.v.a((dc)a2.b(n3));
            ++n3;
        }
        this.v();
    }

    public final void j(int n, int n2) {
        com.mg.sq.a.s().v();
        int n3 = 0;
        while (n3 < go.m.length) {
            if (go.m[n3].a == n) {
                go.b(n, go.m[n3].g - n2);
                break;
            }
            ++n3;
        }
        if (this.E != null && this.E.j != 0) {
            this.v.a(this.E);
        }
        this.v();
    }

    public final void a(dc dc2) {
        this.v.a(dc2);
        this.v();
    }

    public final void b(dc dc2) {
        this.v.a((Object)dc2);
        this.v();
    }

    private void a(lh lh2, dc[] dcArray) {
        int n = 0;
        if (dcArray != null) {
            int n2 = 0;
            while (n2 < dcArray.length) {
                if (dcArray[n2] != null) {
                    ++n;
                }
                ++n2;
            }
            ll[] llArray = new ll[n];
            n2 = 0;
            int n3 = 0;
            while (n3 < dcArray.length) {
                if (dcArray[n3] != null && dcArray[n3].j == 0) {
                    llArray[n2] = (ll)dcArray[n3].k;
                    ++n2;
                }
                ++n3;
            }
            lh2.D = llArray;
        }
        this.y = null;
        System.gc();
        ct.b("[upgradeAnimation]");
        this.y = mb.a(lh2, false);
        this.y.a(lc.a(lh2));
        this.y.a(nr.a(lh2));
        this.y.c(2);
        this.y.i();
    }

    public final void u() {
        if (!this.v.m()) {
            ++this.K;
            if (this.K >= 5) {
                this.J = this.J == 0 ? -2 : 0;
                this.K = 0;
            }
        }
        if (this.y != null) {
            this.y.i();
        }
        if (this.D != null) {
            this.D.n();
        }
        int n = 0;
        while (n < this.F.length) {
            if (this.F[n] != null) {
                this.F[n].n();
            }
            ++n;
        }
        if (this.P != null) {
            this.P.i();
        }
        if (this.R != null) {
            this.R.i();
            if (!this.R.m()) {
                this.R = null;
            }
        }
        if (this.S != null) {
            this.S.i();
        }
        if (this.T < 7) {
            ++this.T;
            if (this.T == 7 && this.E != null && this.E.k != null) {
                Object object = this.E.k;
                hh hh2 = this;
                this.S = new fw(object);
                int n2 = hh2.g;
                hh2.S.a(9, n2, hh2.f - 20, hh2.g / 4);
                hh2.S.c(9, n2);
                hh2.S.a(9, n2 - hh2.S.q() - 7);
            }
        }
    }

    public final void e(int n) {
        switch (n) {
            case 0: {
                hh hh2 = this;
                br[] brArray = null;
                if (hh2.L == 0) {
                    brArray = hh2.G ? new br[]{new br("Cập nhật", 111111), new br("Nhân Vật", 111112), new br("Cửa hàng", 111113), new br("Đóng", 111114)} : new br[]{new br("Nhân Vật", 111112), new br("Cửa hàng", 111113), new br("Đóng", 111114)};
                }
                hh2.a(brArray, hh2.C, (az)new bd("", hh2.C.a()), hh2.B);
                return;
            }
            case 4: {
                switch (this.L) {
                    case 1: {
                        this.h(0);
                        return;
                    }
                }
                if (this.m == null) {
                    this.D();
                    return;
                }
                this.A();
                return;
            }
            case 3: {
                this.m.f(95);
                return;
            }
            case 6: {
                ag.b().e(-4561238);
                this.A();
                ag.b().a(this.h(), false);
                if (!this.V) break;
                com.mg.sq.a.G();
                return;
            }
            case 5: {
                ag.b().e(-4561238);
                this.C();
                this.A();
                com.mg.sq.a.s().a((String)null, (il)null);
                return;
            }
            case 9: {
                if (this.E.j == 0) {
                    ks.a().a(new String[]{((ll)this.E.k).c});
                } else if (((lm)this.E.k).l == 1) {
                    lm lm2 = (lm)this.E.k;
                    ks.a().f(lm2.a, 1);
                } else {
                    lm lm3 = (lm)this.E.k;
                    ks.a().f(lm3.a, lm3.g);
                }
                ag.b().e(-4561239);
                com.mg.sq.a.s().a((String)null, (il)null);
                return;
            }
            case 10: {
                ag.b().e(-4561239);
                return;
            }
            case 14: {
                ag.b().e(241212);
                return;
            }
            case 20: {
                ag.b().e(-241439);
                if (!this.Q) break;
                this.Q = false;
                n = 0;
                if (this.P != null) {
                    n = this.P.r();
                }
                this.h(this.L);
                this.P.l(n);
                return;
            }
            case 21: {
                Object object = (hl)ag.b().e();
                object = ((hl)object).v();
                this.h(1);
                this.d(this.v.a((lm)object));
                this.a((ll)this.E.k);
                ag.b().e(-241439);
                return;
            }
            case 23: {
                this.h(0);
                return;
            }
            case 22: {
                this.O = true;
                ks.a().a(((lm)this.W.k).a, ((ll)this.E.k).c);
                this.P.d(1);
                return;
            }
            case 27: {
                if (this.E == null) break;
                this.Q = true;
                this.c((ll)this.E.k);
                return;
            }
            case 26: {
                ag.b().a(false);
                com.mg.sq.a.s().H();
                return;
            }
            case 112: {
                ag.b().a(false);
                return;
            }
            case 114: {
                ag.b().a(false);
                return;
            }
            case 111: {
                ag.b().a(false);
                lm lm4 = (lm)this.E.k;
                this.i(lm4.a, 1);
                ks.a().f(lm4.a);
                com.mg.sq.a.s().a("Đợi xíu nhé...", (il)null, 500);
                return;
            }
            case 113: {
                ag.b().a(false);
                com.mg.sq.a.s().N();
                return;
            }
            case 118: {
                com.mg.sq.a.s().e(123456);
                ks.a().u();
                return;
            }
            case 119: {
                com.mg.sq.a.s().e(123456);
            }
        }
    }

    public final void a(String[] stringArray) {
        int n = 0;
        while (n < stringArray.length) {
            dc dc2 = this.v.a(stringArray[n]);
            if (dc2 != null) {
                if (this.v.m()) {
                    this.v.a(dc2);
                    this.v.i(this.v.q());
                }
                go.b((ll)dc2.k);
            }
            ++n;
        }
        com.mg.sq.a.s().v();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void f(int n) {
        switch (this.L) {
            case 1: {
                if (!this.O) break;
                return;
            }
        }
        if (!this.v.m()) {
            switch (n) {
                case 96: 
                case 97: 
                case 98: 
                case 99: {
                    int n2 = n - 96;
                    hh hh2 = this;
                    if (n2 < 0) return;
                    if ((n2 = hh2.x[hh2.w][n2]) == -3) {
                        hh2.I = false;
                        hh2.v.d(true);
                        hh2.v.i(0);
                        return;
                    }
                    if (n2 < 0) return;
                    hh2.i(n2);
                    return;
                }
                case 95: {
                    if (this.E == null) return;
                    this.a(this.u[this.w]);
                }
                default: {
                    return;
                }
            }
        }
        this.v.f(n);
        if (this.v.m()) return;
        this.i(this.w);
    }

    public final void f(int n, int n2) {
        if (this.S != null) {
            this.S.g(n - this.c, n2 - this.d);
        }
        switch (this.L) {
            case 1: {
                if (!this.O) break;
                return;
            }
        }
        int n3 = 0;
        while (n3 < this.u.length - 1) {
            if (new k(this.u[n3].a + this.c, this.u[n3].b + this.d, this.u[n3].c, this.u[n3].d).a(n, n2)) {
                this.v.d(false);
                String string = "";
                if (this.E != null) {
                    string = ((ll)this.E.k).c;
                }
                this.i(n3);
                if (this.E != null && ((ll)this.E.k).c.equals(string)) {
                    this.a(this.u[this.w]);
                }
                return;
            }
            ++n3;
        }
        if (new k(this.v.i.a + this.c, this.v.i.b + this.d, this.v.i.c, this.v.i.d).a(n, n2)) {
            if (!this.v.m()) {
                this.v.d(true);
            }
            this.I = false;
            this.D.c(n - this.c, n2 - this.d);
            return;
        }
    }

    public final void i(int n) {
        this.w = n;
        this.a((Object)this.F[n]);
        if (this.E != null) {
            this.I = true;
            this.H = true;
            if (gr.p && this.E.k != null && ((ll)this.E.k).p == 0 && ((ll)this.E.k).c()) {
                gr.p = false;
                od.h(144);
                int n2 = this.u[n].b - 10 + this.d;
                this.R = new gj("Bấm phim giữa. Rối chọn sửa chữa", this.c + this.f / 2, n2, this.f - 20, 80, false);
                this.R.a(this.u[this.w].a - 10 + this.u[n].c / 2);
                if (!hh.B()) {
                    this.R.g(this.u[n].b + 35 + this.d);
                    this.R.a(true);
                }
                this.R.a(new k(this.R.n() + 9, this.R.o() + 9, this.R.p() - 20, this.R.q() - 20));
                return;
            }
        } else {
            this.I = false;
        }
    }

    public final void e(int n, int n2) {
        if (this.v.m()) {
            this.v.e(n, n2);
        }
    }

    public final void a(k k2) {
        if (this.E == null) {
            return;
        }
        if (this.L == 2) {
            if (this.i != null && this.v.m()) {
                this.i.d(-1, 1234);
            }
            return;
        }
        if (this.L != 0) {
            return;
        }
        bs bs2 = new bs();
        if (this.E.k != null) {
            switch (this.E.j) {
                case 0: {
                    ll ll2 = (ll)this.E.k;
                    if (ll2.b() && ll2.c()) {
                        bs2.a(new br("Sửa chữa", 111115));
                    }
                    if (this.I) {
                        br br2 = new br("Cởi ra", 111116);
                        bs2.a(new br("Chi Tiết", 111117));
                        if (this.v.s() >= go.n) {
                            br2 = new br("Vứt bỏ", 111118);
                        }
                        if (ll2.e == 0) {
                            bs2.a(new br[]{this.M.Z ? new br("Hiện Nón", 1111110) : new br("Ẩn Nón", 111119), br2});
                            break;
                        }
                        bs2.a(br2);
                        break;
                    }
                    if (this.H) {
                        if (((ll)this.E.k).e == 8) {
                            bs2.a(new br("Dùng", 1111117));
                        } else {
                            bs2.a(new br("Trang bị", 1111111));
                        }
                        bs2.a(new br("Chi Tiết", 111117));
                        bs2.a(new br("Nâng cấp", 1111116));
                        if (((ll)this.E.k).a()) {
                            bs2.a(new br("Rao bán", 1111118));
                        }
                        bs2.a(new br("Vứt bỏ", 111118));
                        break;
                    }
                    bs2.a(new br("Chi Tiết", 111117));
                    bs2.a(new br("Nâng cấp", 1111116));
                    if (((ll)this.E.k).a()) {
                        bs2.a(new br("Rao bán", 1111118));
                    }
                    bs2.a(new br("Vứt bỏ", 111118));
                    break;
                }
                case 1: 
                case 2: {
                    switch (((lm)this.E.k).e) {
                        case 1: {
                            bs2.a(new br("Dùng", 1111112));
                            break;
                        }
                        case 3: {
                            bs2.a(new br("Dùng", 1111115));
                            break;
                        }
                        case 9: {
                            bs2.a(new br("Mở", 1111113));
                        }
                    }
                    if (((lm)this.E.k).a()) {
                        bs2.a(new br("Rao bán", 1111118));
                    }
                    bs2.a(new br("Vứt bỏ", 111118));
                }
            }
        } else if (this.E.j == 3) {
            bs2.a(new br("Mua Ngăn Chứa", 1111114));
        }
        int n = k2.a + this.c + (k2.c - bs2.e()) / 2;
        int n2 = k2.b + this.d + k2.d;
        if (n2 + bs2.f() > this.d + this.g) {
            n2 = this.d + k2.b - bs2.f();
        }
        n = n < this.c ? this.c : (n + bs2.e() > this.c + this.f ? this.c + this.f - bs2.e() : n);
        bs2.a_(v.t + bs2.e(), n2);
        bs2.d(n, n2);
        bs2.a(this);
        bs2.a_(1);
        this.a(bs2, this.C, (az)new bd("", this.C.a()), this.B);
        this.n = true;
    }

    public final void a(String string) {
        com.mg.sq.a.s().e(-446456);
        dc dc2 = this.v.a(string);
        this.v.a(dc2);
        this.a(this.v.r());
        int n = 0;
        while (n < go.l.length) {
            if (go.l[n].c.equals(string)) {
                go.b(go.l[n]);
                return;
            }
            ++n;
        }
    }

    public final boolean g(int n) {
        switch (n) {
            case 111111: {
                this.C();
                com.mg.sq.a.s().a((String)null, (il)null);
                return true;
            }
            case 111112: {
                this.V = true;
                if (this.G) {
                    this.D();
                    return true;
                }
                ag.b().a(this.h(), false);
                com.mg.sq.a.G();
                return true;
            }
            case 1111121: {
                gu gu2;
                if (com.mg.sq.a.s().c(-1122154) && (gu2 = (gu)com.mg.sq.a.s().d(-1122154)) != null) {
                    lm lm2 = gu2.t();
                    gu2.t().g = gu2.u();
                    Object object = this;
                    object = new dc(null, lm2, lm2.e == 3 ? 2 : 1, ((hh)object).Z);
                    this.c((dc)object);
                }
                return true;
            }
            case 1111122: {
                com.mg.sq.a.s().e(-1122154);
                return true;
            }
            case 29: {
                com.mg.sq.a.s().e(-446456);
                return true;
            }
            case 1111119: {
                al al2 = (hu)com.mg.sq.a.s().d(241234);
                long l = ((hu)al2).t() * 1000L;
                al2 = com.mg.sq.a.s().a("Chú ý", "Bạn có muốn bán " + ((hu)al2).k + " giá: " + i.a(l, ",") + " Ken không?", "Có", 28, "Không", 29, 1);
                al2.b(-446456);
                al2.a(this);
                com.mg.sq.a.s().a(al2);
                return true;
            }
            case 28: {
                Object object = (hu)com.mg.sq.a.s().d(241234);
                long l = ((hu)object).t() * 1000L;
                if (((hu)object).v().j == 0) {
                    object = (ll)((hu)object).v().k;
                    ks.a().a(((ll)object).c, l);
                    com.mg.sq.a.s().a((String)null, (il)null);
                } else if (((hu)object).v().j == 1) {
                    object = (lm)((hu)object).v().k;
                    ks.a().a(((ld)object).a, ((lm)object).g, l);
                    com.mg.sq.a.s().a((String)null, (il)null);
                }
                return true;
            }
            case 1111120: {
                com.mg.sq.a.s().e(241234);
                return true;
            }
            case 111113: {
                com.mg.sq.a.s().H();
                return true;
            }
            case 111114: {
                if (this.n) {
                    this.A();
                } else {
                    this.D();
                }
                return true;
            }
            case 111115: {
                if (this.E != null) {
                    this.c((ll)this.E.k);
                }
                if (this.R != null) {
                    this.R = null;
                }
                return true;
            }
            case 111116: {
                this.G = true;
                dc dc2 = this.F[this.w];
                this.F[this.w] = null;
                this.v.a((Object)dc2);
                this.E = null;
                this.a(this.M, this.F);
                return true;
            }
            case 111117: {
                com.mg.sq.a.a((ll)this.E.k, this, "", -1, "Đóng", 14);
                ag.b().e();
                return true;
            }
            case 111118: {
                hh hh2 = this;
                String string = hh2.E.j == 0 ? ((ll)hh2.E.k).d : ((lm)hh2.E.k).b;
                al al3 = ag.b().a("Chú ý", "Bạn có chắc là muốn vứt bỏ " + string + " này không?", "Có", 9, "Không", 10, 1);
                al3.a(hh2);
                al3.b(-4561239);
                ag.b().a(al3, false);
                return true;
            }
            case 111119: {
                ks.a().b(true);
                com.mg.sq.a.s().a((String)null, (il)null);
                return true;
            }
            case 1111110: {
                ks.a().b(false);
                com.mg.sq.a.s().a((String)null, (il)null);
                return true;
            }
            case 1111111: {
                this.G = true;
                n = ((ll)this.E.k).e;
                ((ll)this.E.k).o = -1L;
                dc dc3 = null;
                if (this.F[n] != null) {
                    dc3 = this.F[n];
                }
                this.F[n] = this.E;
                if (dc3 != null) {
                    this.v.a(dc3, this.v.b(this.E));
                } else {
                    this.v.a(this.E);
                }
                if (this.v.q() >= this.v.s()) {
                    n = this.v.s() - 1;
                    this.v.j(n < 0 ? 0 : n);
                }
                this.a(this.M, this.F);
                this.a(this.v.r());
                return true;
            }
            case 1111117: {
                ag.b().e(-4561238);
                String[] stringArray = new String[]{((ll)this.E.k).c};
                int n2 = 0;
                while (n2 <= 0) {
                    dc dc4 = this.v.a(stringArray[0]);
                    this.v.a(dc4);
                    ++n2;
                }
                ks.a().c(stringArray);
                this.A();
                com.mg.sq.a.s().a((String)null, (il)null);
                break;
            }
            case 1111112: {
                this.h(1);
                this.d(this.E);
                return true;
            }
            case 1111115: {
                ks.a().e(((lm)this.E.k).a);
                return true;
            }
            case 1111113: {
                lm lm3 = (lm)this.E.k;
                hh hh3 = this;
                if (lm3.k > 0L) {
                    al al4 = lm3.k > go.s ? ag.b().a("Chú ý", "Bạn không đủ Ken để đập trứng, Bạn có muốn nạp Ken không", "Có", 113, "Không", 114, 1) : ag.b().a("Chú ý", "Đập 1 quả trứng bạn phải mất " + lm3.k + " Ken. Bạn có muốn đập không?", "Có", 111, "Không", 112, 1);
                    al4.a(hh3);
                    ag.b().a(al4);
                } else {
                    lm lm4 = (lm)hh3.E.k;
                    ks.a().f(lm4.a);
                    hh3.i(lm4.a, 1);
                    com.mg.sq.a.s().a("Đợi xíu nhé...", (il)null);
                }
                return true;
            }
            case 1111114: {
                hh hh4 = this;
                al al5 = ag.b().a("Chú ý", "Bạn có chắc muốn mua thêm ngăn chứa đồ không? Phí mua 1 ngăn chứa là " + go.o, "Có", 118, "Không", 119, 1);
                al5.b(123456);
                al5.a(hh4);
                ag.b().a(al5);
                return true;
            }
            case 1111116: {
                Object object;
                if (this.G) {
                    object = ag.b().a("Chú ý", "Chưa cập nhật đồ cho nhân vật. Bạn có muốn cập nhật ngay không?", "Có", 5, "Không", 6, 1);
                    ((am)object).a(this);
                    ((am)object).b(-4561238);
                    ag.b().a((al)object, false);
                    this.A();
                    this.G = false;
                } else {
                    String string = ((ll)this.E.k).c;
                    ag.b().a(false);
                    com.mg.sq.a.s().h(string);
                    return true;
                }
            }
            case 1111118: {
                Object object;
                if (this.G) {
                    object = ag.b().a("Chú ý", "Chưa cập nhật đồ cho nhân vật. Bạn có muốn cập nhật ngay không?", "Có", 5, "Không", 6, 1);
                    ((am)object).a(this);
                    ((am)object).b(-4561238);
                    ag.b().a((al)object, false);
                    this.A();
                    this.G = false;
                } else {
                    Object object2;
                    Object object3 = object2 = this;
                    if (((hh)object2).E.k != null) {
                        object3 = object2;
                        if (((hh)object3).E.j == 1) {
                            object3 = object2;
                            object = (lm)((hh)object3).E.k;
                            object3 = object2;
                            Object object4 = new dc(null, ((lm)object).b(), ((hh)object3).E.j, ((hh)object2).Z);
                            object4 = new gu((dc)object4);
                            ((am)object4).a((bf)object2);
                            ((gu)object4).e(((lm)object).g);
                            object2 = new bd("Xong", 1111121);
                            object3 = object4;
                            ((am)object3).a((az)object2, true);
                            ((am)object4).a(new bd("", 1111121));
                            object2 = new bd("Hủy", 1111122);
                            object3 = object4;
                            ((am)object3).b((az)object2, true);
                            ((am)object4).b(-1122154);
                            ((gu)object4).j(true);
                            ag.b().a((al)object4, false);
                        } else {
                            object3 = object2;
                            if (((hh)object3).E.j == 0) {
                                object3 = object2;
                                ((hh)object2).c(((hh)object3).E);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    private void c(dc object) {
        object = new hu((dc)object, "Rao bán", 1111119, "Hủy", 1111120);
        ((am)object).a(this);
        ag.b().a((al)object, false);
    }

    protected final void s() {
    }

    private void C() {
        int n = 0;
        int n2 = 0;
        while (n2 < this.F.length) {
            if (this.F[n2] != null) {
                ++n;
            }
            ++n2;
        }
        String[] stringArray = new String[n];
        n = 0;
        int n3 = 0;
        while (n3 < this.F.length) {
            if (this.F[n3] != null) {
                ll ll2 = (ll)this.F[n3].k;
                stringArray[n] = ll2.c;
                ++n;
            }
            ++n3;
        }
        ks.a().c(stringArray);
        this.G = false;
    }

    private void D() {
        this.X = true;
        if (this.G) {
            al al2 = ag.b().a("Chú ý", "Chưa cập nhật đồ cho nhân vật. Bạn có muốn cập nhật ngay không?", "Có", 5, "Không", 6, 1);
            al2.a(this);
            al2.b(-4561238);
            ag.b().a(al2, false);
            this.A();
            this.G = false;
            return;
        }
        ag.b().a(this.h(), false);
    }

    private void a(Object object) {
        this.H = false;
        this.E = (dc)object;
        this.T = 0;
        this.S = null;
        if (this.E != null) {
            if (this.E.j == 3) {
                if (this.L == 2) {
                    this.a((az)null);
                    az az2 = null;
                    object = this;
                    ((am)object).a(az2, true);
                }
                return;
            }
            object = null;
            if (this.E.j == 0 && this.E.k != null) {
                object = (ll)this.E.k;
                int n = 0;
                if (((ll)object).i <= this.M.G) {
                    ++n;
                }
                if (((ll)object).h == 2 || ((ll)object).h == this.M.f) {
                    ++n;
                }
                this.H = n == 2;
            }
            switch (this.L) {
                case 1: {
                    this.a((ll)object);
                    return;
                }
                case 2: {
                    if (this.v.m()) {
                        this.a(new bd("", 1234));
                        bd bd2 = new bd("Bán", 1234);
                        object = this;
                        ((am)object).a(bd2, true);
                        return;
                    }
                    this.a((az)null);
                    az az3 = null;
                    object = this;
                    ((am)object).a(az3, true);
                }
            }
            return;
        }
        switch (this.L) {
            case 1: {
                this.a((az)null);
                return;
            }
            case 2: {
                this.a((az)null);
                az az4 = null;
                object = this;
                ((am)object).a(az4, true);
            }
        }
    }

    public final void a(ll object) {
        if (object == null) {
            this.a((az)null);
            az az2 = null;
            object = this;
            ((am)object).a(az2, true);
            return;
        }
        if (this.L != 0) {
            if (((ll)object).b()) {
                if (((ll)object).c()) {
                    this.a(new bd("", 22));
                    bd bd2 = new bd("Sửa chữa", 22);
                    object = this;
                    ((am)object).a(bd2, true);
                    return;
                }
            } else {
                this.a((az)null);
                az az3 = null;
                object = this;
                ((am)object).a(az3, true);
            }
        }
    }

    public final void j(int n) {
        lm lm2 = (lm)this.W.k;
        this.O = false;
        lm2.g = n;
        this.P.d(0);
        this.P.l(n);
        if (n <= 0) {
            this.v.a(this.W);
        }
        if (lm2.g == 0) {
            this.h(0);
        }
    }

    private void c(ll object) {
        if (((hl)(object = com.mg.sq.a.a((bf)this, new bd("Chọn", 21), new bd("Đóng", 20), new bd("", 21), (ll)object))).u() <= 0) {
            ((hl)object).a("Hiện tại bạn không còn cây búa nào để sữa chữa! Bạn có muốn vào cửa hàng mua không?");
            bd bd2 = new bd("C.Hàng", 26);
            Object object2 = object;
            ((am)object2).a(bd2, true);
            ((hl)object).a(new bd("", 26));
        }
        ((hl)object).e(2);
        this.A();
    }

    private void d(dc dc2) {
        if (dc2 == null || dc2.k == null) {
            return;
        }
        this.W = dc2;
        if (this.P != null) {
            this.P.l(((lm)dc2.k).g);
        }
    }

    public final dc t() {
        return this.E;
    }

    public final void v() {
        this.v.i(this.v.q());
    }

    public final void j(boolean bl) {
        this.M.Z = bl;
        this.a(this.M, this.F);
        this.G = true;
    }

    public final void b(aq aq2, int n) {
        this.a(this.v.u());
    }

    public final void a(aq object, int n) {
        if (object == null && n > this.Y - 1) {
            object = this;
            object = new dc(this.v.k, null, 3, ((hh)object).Z);
        }
        this.a(object);
    }

    public final void a(aq aq2, int n, int n2) {
        this.a(aq2);
    }

    public final void w() {
        com.mg.sq.a.s().v();
        if (this.V) {
            com.mg.sq.a.G();
        }
        if (this.X) {
            ag.b().a(this.h(), false);
        }
    }

    public final void b(lm lm2) {
        Object object;
        int n = 0;
        a a2 = new a();
        int n2 = 0;
        while (n2 < this.v.s()) {
            if ((((dc)this.v.k((int)n2)).j == 1 || ((dc)this.v.k((int)n2)).j == 2) && (object = (lm)((dc)this.v.k((int)n2)).k) != null && ((ld)object).a == lm2.a) {
                n += ((lm)object).g;
                a2.a(this.v.k(n2));
            }
            ++n2;
        }
        n += lm2.g;
        n2 = 0;
        while (n2 < a2.d()) {
            this.v.a((dc)a2.b(n2));
            ++n2;
        }
        if (lm2.l <= 0) {
            object = lm2.b();
            lm2.b().g = n;
            lm lm3 = object;
            object = this;
            dc dc2 = new dc(null, lm3, lm2.e == 3 ? 2 : 1, ((hh)object).Z);
            this.v.a((Object)dc2);
            return;
        }
        n2 = n / lm2.l + (n % lm2.l > 0 ? 1 : 0);
        int n3 = 0;
        while (n3 < n2) {
            object = lm2.b();
            if (n >= lm2.l) {
                ((lm)object).g = lm2.l;
                n -= lm2.l;
            } else if (n > 0) {
                ((lm)object).g = n;
                n = 0;
            }
            Object object2 = object;
            object = this;
            object = new dc(null, object2, lm2.e == 3 ? 2 : 1, ((hh)object).Z);
            this.v.a(object);
            ++n3;
        }
    }

    public final void b(Graphics graphics) {
        bx.d.c(true);
        bx.d.a(graphics, this.U, this.r.a + this.c, this.r.b + this.d, 0);
        bx.d.c(false);
        pc.b(graphics, this.q.a + this.c, this.q.b + this.d, this.M.g);
        bx.d.a(graphics, "Cấp: " + this.M.G, this.c + this.f - 14 + this.c, this.r.b + this.d, 2);
        int n = 0;
        while (n < this.u.length - 1) {
            pc.b(graphics, this.u[n].a + this.c, this.u[n].b + this.d, this.u[n].c, this.u[n].d, 6647295, 0xFFFFFF, 8369663);
            cw.a(graphics, this.k, n * this.p, 0, this.p, this.p, this.u[n].a + this.c + (this.u[n].c - this.p) / 2, this.u[n].b + this.d + (this.u[n].d - this.p) / 2, 0);
            ++n;
        }
        int n2 = 0;
        while (n2 < this.F.length) {
            if (this.F[n2] != null) {
                ll ll2 = (ll)this.F[n2].k;
                this.F[n2].a(graphics, this.u[ll2.e].a + this.c, this.u[ll2.e].b + this.d);
            }
            ++n2;
        }
        if (this.D != null) {
            this.D.a(graphics, this.c, this.d);
            this.D.c(true);
        }
        if (this.E != null && !this.I && this.E.k != null && this.E.j == 0) {
            ll ll3 = (ll)this.E.k;
            if (ll3.e < this.u.length) {
                int n3 = this.d;
                int n4 = this.c;
                k k2 = this.u[ll3.e];
                ll3 = graphics;
                ll3.setColor(0xFEFF77);
                ll3.drawRect(k2.a + n4, k2.b + n3, k2.c, k2.d);
                ll3.setColor(16776624);
                ll3.drawRect(k2.a - 1 + n4, k2.b - 1 + n3, k2.c + 2, k2.d + 2);
                ll3.setColor(0xFFFDD3);
                ll3.drawRect(k2.a - 2 + n4, k2.b - 2 + n3, k2.c + 4, k2.d + 4);
            }
        }
        if (!this.v.m()) {
            pc.a(graphics, this.u[this.w], this.c, this.d, this.J);
            switch (this.L) {
                case 1: {
                    if (this.P == null) break;
                    this.P.a(graphics, this.u[this.w].a + this.c, this.u[this.w].b + this.u[this.w].d + this.d);
                }
            }
        }
        if (this.R != null) {
            this.R.a(graphics, 0, 0);
        }
        if (hh.B()) {
            bx.d.a(graphics, String.valueOf(this.v.s()) + "/" + go.n, this.t.a, this.t.b + this.t.d - 16, 2);
        } else {
            bx.d.a(graphics, String.valueOf(this.v.s()) + "/" + go.n, this.t.a, this.t.b - 16, 0);
        }
        if (!this.n && this.S != null) {
            this.S.a(graphics, this.c, this.d);
        }
        pc.c(graphics, this.s.a + this.c, this.s.b + this.d, this.s.c, this.s.d);
        if (this.y != null) {
            this.y.a(graphics, this.s.a + this.c, this.s.b + 5 + this.d);
        }
    }

    public final void a(Graphics graphics) {
        pc.a(graphics, this.c, this.d, this.f, this.g, v.aj, true);
    }

    public final void b(ll object) {
        Image image = this.N.a(mb.a((ll)object) + 98, true);
        ll ll2 = object;
        object = this;
        object = new dc(image, ll2, 0, ((hh)object).Z);
        this.b((dc)object);
        this.a(this.v.r());
        this.v.h(this.v.a() + 1);
        com.mg.sq.a.s().v();
    }

    public final void c(lm lm2) {
        this.b(lm2);
        this.a(this.v.r());
        com.mg.sq.a.s().v();
    }

    public final void b(String string) {
        this.a(this.v.r());
        com.mg.sq.a.s().v();
        com.mg.sq.a.t(string);
    }

    public final int x() {
        return this.Y;
    }

    public final ox y() {
        return this.N;
    }

    public final d z() {
        return this.Z;
    }
}
