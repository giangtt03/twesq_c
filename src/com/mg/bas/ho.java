package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class ho
extends ht
implements bq {
    private ox k;
    private fg p;
    private fg q;
    private dc r;
    private ay s;
    private ay t;
    private k u = null;
    private k v = null;
    private lh w;
    private int x;
    private az y;
    private az z;
    private byte A = 0;
    private byte[][] B;
    private ex C;
    private aq[] D;
    private int E;
    private String F;
    private final Object G = new Object();
    private fw H;
    private int I = 0;
    private lm J;
    private int K;
    private long L;
    private String M;
    private boolean N = false;
    private boolean O = false;
    private k P;
    private String Q;
    private by R;
    private d S;

    public ho(String string, String string2, ox ox2, d d2) {
        this.F = string;
        this.M = string2;
        if (d2 == null) {
            d2 = new iff(new int[]{0xFF0000, 0xFFFF00});
        }
        this.S = d2;
        this.k = new ox(ox2);
        this.b(241231);
        this.a(new ba());
        this.a(this);
        int n = 240;
        int n2 = 320 - ba.a;
        if (com.mg.sq.a.k == 1) {
            n = 320;
            n2 = com.mg.bas.v.u - ba.a;
        }
        int n3 = com.mg.bas.v.t >= n ? (com.mg.bas.v.t - n) / 2 : 0;
        int n4 = com.mg.bas.v.u >= n2 ? (com.mg.bas.v.u - ba.a - n2) / 2 : 0;
        this.P = new k(n3, n4, n, n2);
        this.t();
        az az2 = this.y;
        ho ho2 = this;
        ho2.b(az2, true);
        this.a((az)null);
    }

    private void t() {
        int n = com.mg.bas.v.t - 20;
        this.u = new k((com.mg.bas.v.t - n) / 2, 140, n, this.g - 174);
        this.v = new k((com.mg.bas.v.t - n) / 2, 30, n, 44);
        this.p = new fg(false);
        this.p.e(true);
        this.p.i = new k(this.u.a, this.u.b, this.u.c, this.u.d);
        this.w = go.k.a();
        Object object = this.w;
        int n2 = go.l.length - this.w.D.length;
        int n3 = 0;
        while (n3 < go.m.length) {
            n2 = go.m[n3].l == 1 ? (n2 += go.m[n3].g) : (go.m[n3].l > 1 ? (n2 += go.m[n3].g / go.m[n3].l + (go.m[n3].g % go.m[n3].l > 0 ? 1 : 0)) : ++n2);
            ++n3;
        }
        this.x = n2;
        if (this.x < go.n) {
            this.x = go.n;
        }
        this.p.d(this.x, 1);
        this.p.a(this);
        ll[] llArray = go.l;
        n3 = this.w.D.length;
        this.p.t();
        int n4 = 0;
        while (n4 < llArray.length) {
            if (llArray[n4] != null) {
                boolean bl = false;
                if (n3 > 0) {
                    int n5 = 0;
                    while (n5 < this.w.D.length) {
                        if (llArray[n4].c.equals(this.w.D[n5].c)) {
                            --n3;
                            bl = true;
                            break;
                        }
                        ++n5;
                    }
                }
                if (!bl) {
                    dc dc2 = new dc(this.k.a(mb.a(llArray[n4]) + 98, true), llArray[n4], 0, this.S);
                    this.p.a((Object)dc2);
                }
            }
            ++n4;
        }
        this.q = new fg(false);
        this.q.i = new k(this.v.a, this.v.b, this.v.c, this.v.d);
        this.q.d(6, 0);
        this.q.a(this);
        this.q.j = true;
        this.q.d(true);
        this.q.i(0);
        lm[] lmArray = new lm[go.m.length];
        int n6 = 0;
        while (n6 < lmArray.length) {
            lmArray[n6] = go.m[n6].b();
            ++n6;
        }
        this.a(lmArray);
        this.B = new byte[4][3];
        this.B[0] = new byte[]{1, -1, 1, -1};
        byte[] byArray = new byte[4];
        byArray[0] = 2;
        byArray[2] = 2;
        this.B[1] = byArray;
        this.B[2] = new byte[]{-1, 1, -1, 1};
        this.t = new ay();
        this.t.a(new k(this.v.a, this.v.b, this.v.c, this.v.d + 2));
        this.t.b(this.q);
        this.t.h(2);
        this.s = new ay();
        this.s.a(new k(this.u.a, this.u.b, this.u.c, this.u.d));
        this.s.b(this.p);
        this.s.h(2);
        this.C = new ex("Kết hợp", 2);
        n6 = bx.d.a("Kết hợp") + 10;
        this.C.a(this.c + (com.mg.bas.v.t - n6) / 2, this.u.b - 25, n6, 18);
        this.D = new aq[]{this.t, this.C, this.s};
        this.R = new by(0xFF0000);
        this.y = new gb(1, 3);
        this.z = new gb(3, 2);
    }

    private void a(lm[] lmArray) {
        int n = 0;
        while (n < lmArray.length) {
            int n2;
            int n3 = n2 = lmArray[n].e == 3 ? 2 : 1;
            if (lmArray[n].g > 0) {
                if (lmArray[n].l > 0) {
                    int n4 = lmArray[n].g;
                    int n5 = lmArray[n].g / lmArray[n].l;
                    int n6 = 0;
                    while (n6 < n5) {
                        lm lm2 = lmArray[n].b();
                        lmArray[n].b().g = lmArray[n].l;
                        n4 -= lmArray[n].l;
                        this.p.a((Object)new dc(null, lm2, n2, this.S));
                        ++n6;
                    }
                    if (n4 > 0) {
                        lm lm3 = lmArray[n].b();
                        lmArray[n].b().g = n4;
                        this.p.a((Object)new dc(null, lm3, n2, this.S));
                    }
                } else {
                    this.p.a((Object)new dc(null, lmArray[n], n2, this.S));
                }
            }
            ++n;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void v() {
        Object object = this.G;
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
            ks.a().a(this.F, stringArray, nArray, nArray2, this.L);
            com.mg.sq.a.s().a((String)null, (il)null);
            return;
        }
    }

    protected final boolean g(int n) {
        switch (n) {
            case 4: {
                if (this.r.k == null) break;
                ho ho2 = this;
                if (ho2.r.k != null) {
                    if (ho2.r.j == 0) {
                        ks.a().a(ho2.F, (byte)1, ((ll)ho2.r.k).c);
                    } else {
                        ho2.J = (lm)ho2.r.k;
                        int n2 = 0;
                        int n3 = 0;
                        while (n3 < ho2.q.s()) {
                            lm lm2;
                            if ((((dc)ho2.q.k((int)n3)).j == 1 || ((dc)ho2.q.k((int)n3)).j == 2) && (lm2 = (lm)((dc)ho2.q.k((int)n3)).k) != null && lm2.a == ho2.J.a) {
                                n2 += lm2.g;
                            }
                            ++n3;
                        }
                        ks.a().a(ho2.F, (byte)1, ho2.J.a, n2);
                    }
                }
                ho2.N = true;
                com.mg.sq.a.s().a((String)null, (il)null);
                if (this.m == null) break;
                this.A();
                break;
            }
            case 5: {
                gu gu2;
                if (!this.l.c(-7524) || (gu2 = (gu)this.l.d(-7524)) == null) break;
                this.J = gu2.t();
                int n4 = this.J.g = gu2.u();
                ks.a().a(this.F, (byte)0, this.J.a, n4);
                com.mg.sq.a.s().a((String)null, (il)null);
                this.l.a(-7524, false);
                break;
            }
            case 6: {
                this.l.a(false);
                break;
            }
            case 2: {
                if (this.K == 0 && !this.O) {
                    ho ho3 = this;
                    al al2 = ho3.l.a("Chú ý", "Chưa đủ nguyên liệu. Vui lòng thử lại!!!", "Đóng", 1, 1);
                    al2.b(199199);
                    al2.a(ho3);
                    ho3.l.a(al2, false);
                    break;
                }
                if (this.K != 1 || this.O) break;
                if (go.s > -1L && this.L > go.s) {
                    ho ho4 = this;
                    al al3 = ho4.l.a("Chú ý", "Vượt quá số tiền bạn đang có. Vui lòng thử lại!!!", "Đóng", 1, 1);
                    al3.b(199199);
                    al3.a(ho4);
                    ho4.l.a(al3, false);
                    break;
                }
                ho ho5 = this;
                hc hc2 = new hc(String.valueOf(ho5.M) + ". Bạn có muốn kết hợp không?", "Kết hợp", 7, "Không", 1);
                hc2.a(ho5);
                ho5.l.a(hc2, false);
                break;
            }
            case 7: {
                this.l.a(false);
                this.v();
            }
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(ll[] llArray, lm[] lmArray, byte by2) {
        this.l.v();
        Object object = this.G;
        synchronized (object) {
            dc dc2;
            this.e(true);
            int n = 0;
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
            this.q.t();
            n = 0;
            while (n < llArray.length) {
                if (llArray[n] != null) {
                    dc2 = new dc(this.k.a(mb.a(llArray[n]) + 98, true), llArray[n], 0, this.S);
                    this.q.a((Object)dc2);
                    go.a(llArray[n]);
                }
                ++n;
            }
            n = 0;
            while (n < lmArray.length) {
                if (lmArray[n] != null) {
                    dc2 = new dc(null, lmArray[n], lmArray[n].e, this.S);
                    this.q.a((Object)dc2);
                    go.a(lmArray[n], lmArray[n].g);
                }
                ++n;
            }
            this.Q = by2 == 1 ? "Kết hợp thành công" : "Kết hợp thất bại";
            this.O = true;
            return;
        }
    }

    protected final void e(int n) {
        switch (n) {
            case 1: {
                if (this.m != null) {
                    this.A();
                    return;
                }
                this.l.a(false);
                this.l.M();
                return;
            }
            case 3: {
                this.c(95);
            }
        }
    }

    protected final void f(int n) {
        byte by2 = this.A;
        switch (n) {
            case 96: 
            case 97: 
            case 98: 
            case 99: {
                if (!this.D[this.A].f(n)) {
                    int n2 = n - 96;
                    ho ho2 = this;
                    if (n2 >= 0 && (n2 = ho2.B[ho2.A][n2]) >= 0) {
                        ho2.A = (byte)n2;
                    }
                }
                if (by2 != this.A) {
                    this.D[this.A].d(true);
                    this.D[by2].d(false);
                    if (this.D[this.A] instanceof ay) {
                        fg fg2 = (fg)((ay)this.D[this.A]).w();
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
                this.H = null;
                return;
            }
            case 95: {
                if (this.D[1].m()) {
                    this.i.d(0, ((ex)this.D[1]).a());
                    return;
                }
                this.D[this.A].f(n);
                return;
            }
        }
        this.D[this.A].f(n);
    }

    public final void f(int n, int n2) {
        this.e(true);
        if (this.m != null) {
            boolean bl;
            block10: {
                int n3 = n2;
                int n4 = n;
                az[] azArray = this.m.a();
                ho ho2 = this;
                int n5 = 0;
                while (n5 < azArray.length) {
                    if (azArray[n5] != null && azArray[n5].a(n4, n3)) {
                        if (ho2.i != null) {
                            ho2.i.d(-1, azArray[n5].a());
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
        byte by2 = this.A;
        int n6 = 0;
        while (n6 < this.D.length) {
            k k2 = this.D[n6].equals(this.s) ? new k(this.p.i.a + this.P.a, this.p.i.b + this.P.b, this.p.i.c, this.p.i.d) : (this.D[n6].equals(this.t) ? new k(this.q.i.a + this.P.a, this.q.i.b + this.P.b, this.q.i.c, this.q.i.d) : new k(this.D[n6].c() + this.P.a, this.D[n6].d() + this.P.b, this.D[n6].e(), this.D[n6].f()));
            if (k2.a(n, n2)) {
                if (n6 != by2) {
                    this.A = (byte)n6;
                    this.D[by2].d(false);
                    this.D[this.A].d(true);
                }
                this.D[n6].c(n - this.P.a, n2 - this.P.b);
                if (this.D[n6] instanceof ex) {
                    this.d(-1, ((ex)this.D[n6]).a());
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
        this.I = 0;
        this.H = null;
        this.r = (dc)object;
    }

    public final void u() {
        int n = 0;
        while (n < this.D.length) {
            if (this.D[n] != null) {
                this.D[n].n();
                this.D[n].c(true);
            }
            ++n;
        }
        if (this.H != null) {
            this.H.i();
        }
        if (this.I < 7) {
            ++this.I;
            if (this.I == 7 && this.r != null && this.r.k != null) {
                Object object = this.r.k;
                ho ho2 = this;
                this.H = new fw(object);
                int n2 = ho2.g - 18;
                ho2.H.a(9, n2, ho2.f - 20, ho2.g / 4);
                ho2.H.c(9, n2);
                ho2.H.a(9, n2 - ho2.H.q() - 7);
            }
        }
        if (this.h) {
            --this.E;
            if (this.E <= 0) {
                this.e(false);
                this.E = 0;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(String string, String object, byte by2, long l) {
        this.l.v();
        Object lock = this.G;
        synchronized (lock) {
            this.e(true);
            this.K = by2;
            this.M = object;
            this.L = l;
            int n = 0;
            while (n < this.q.s()) {
                dc dcObj = (dc)this.q.k(n);
                if (dcObj.j == 0 && dcObj.k != null) {
                    ll ll2 = (ll)dcObj.k;
                    if (ll2.c.equals(string)) {
                        this.q.a(dcObj);
                        this.p.a(dcObj);
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
        this.l.v();
        if (this.N) {
            this.K = by2;
            this.M = object;
            this.L = l;
            this.q.a(this.r);
            lm lm2 = (lm)this.r.k;
            int n = 0;
            a a2 = new a();
            int n2 = 0;
            while (n2 < this.p.s()) {
                dc dc2 = (dc)this.p.k(n2);
                if ((dc2.j == 1 || dc2.j == 2) && dc2.k != null) {
                    lm lm3 = (lm)dc2.k;
                    if (lm3.a == lm2.a) {
                        n += lm3.g;
                        a2.a(dc2);
                    }
                }
                ++n2;
            }
            n += lm2.g;
            n2 = 0;
            while (n2 < a2.d()) {
                this.p.a((dc)a2.b(n2));
                ++n2;
            }
            if (lm2.l <= 0) {
                lm lm4 = lm2.b();
                lm4.g = n;
                dc dc2 = new dc(null, lm4, lm2.e == 3 ? 2 : 1, this.S);
                this.p.a((Object)dc2);
            } else {
                n2 = n / lm2.l + (n % lm2.l > 0 ? 1 : 0);
                int n3 = 0;
                int remaining = n;
                while (n3 < n2) {
                    lm lmObj = lm2.b();
                    if (remaining >= lm2.l) {
                        lmObj.g = lm2.l;
                        remaining -= lm2.l;
                    } else if (remaining > 0) {
                        lmObj.g = remaining;
                        remaining = 0;
                    }
                    dc dcObj = new dc(null, lmObj, lm2.e == 3 ? 2 : 1, this.S);
                    this.p.a(dcObj);
                    ++n3;
                }
            }
            this.w();
            this.N = false;
            this.r = null;
            this.a(this.q.r());
            return;
        }
    }

    public final void b(String string, String object, byte by2, long l) {
        this.l.v();
        Object lock = this.G;
        synchronized (lock) {
            this.e(true);
            this.K = by2;
            this.M = object;
            this.L = l;
            int n = 0;
            while (n < this.p.s()) {
                dc dcObj = (dc)this.p.k(n);
                if (dcObj.j == 0 && dcObj.k != null) {
                    ll ll2 = (ll)dcObj.k;
                    if (ll2.c.equals(string)) {
                        this.p.a(dcObj);
                        this.q.a(dcObj);
                        this.a(this.p.r());
                        return;
                    }
                }
                ++n;
            }
            return;
        }
    }

    public final void b(String object, byte by2, long l) {
        this.l.v();
        if (this.J != null) {
            this.K = by2;
            this.M = object;
            this.L = l;
            byte total = 0;
            a a2 = new a();
            int n = 0;
            while (n < this.q.s()) {
                dc dcObj = (dc)this.q.k(n);
                if (dcObj.j == 1 && dcObj.k != null && ((ld)dcObj.k).a == this.J.a) {
                    total = (byte)(total + ((lm)dcObj.k).g);
                    a2.a(this.q.k(n));
                }
                ++n;
            }
            total = (byte)(total + this.J.g);
            n = 0;
            while (n < a2.d()) {
                this.q.a((dc)a2.b(n));
                ++n;
            }
            if (this.J.l <= 0) {
                lm lmObj = this.J.b();
                this.J.b().g = total;
                dc dc2 = new dc(null, lmObj, 1, this.S);
                this.q.a((Object)dc2);
            } else {
                int count = total / this.J.l + (total % this.J.l > 0 ? 1 : 0);
                int n2 = 0;
                int remaining = total;
                while (n2 < count) {
                    lm lmObj = this.J.b();
                    if (remaining >= this.J.l) {
                        lmObj.g = this.J.l;
                        remaining = (byte)(remaining - this.J.l);
                    } else if (remaining > 0) {
                        lmObj.g = remaining;
                        remaining = 0;
                    }
                    dc dcObj = new dc(null, lmObj, 1, this.S);
                    this.q.a(dcObj);
                    ++n2;
                }
            }
            lm lm2 = this.J;
            int n3 = 0;
            lm lm3 = lm2.b();
            a a3 = new a();
            int n4 = 0;
            while (n4 < this.p.s()) {
                this.r = (dc)this.p.k(n4);
                if (this.r != null && this.r.k != null && (this.r.j == 1 || this.r.j == 2)) {
                    lm lm4 = (lm)this.r.k;
                    if (lm4 != null && lm4.a == lm2.a) {
                        n3 += lm4.g;
                        a3.a(this.r);
                    }
                }
                ++n4;
            }
            lm3.g = n3 - lm2.g;
            n4 = 0;
            while (n4 < a3.d()) {
                this.p.a((dc)a3.b(n4));
                ++n4;
            }
            if (lm3.g > 0) {
                this.a(new lm[]{lm3});
            }
            this.w();
            this.a(this.p.r());
        }
    }

    public final void e(boolean bl) {
        super.e(bl);
        this.E = 5;
    }

    public final void b(Graphics graphics) {
        this.R.a(graphics, "Phí kết hợp: " + com.mg.bas.i.a(this.L, ",") + " KEN", (com.mg.bas.v.t - bx.d.a("Phí kết hợp: ")) / 2 - 10, 10, 0);
        int n = 0;
        if (!this.O) {
            if (this.M != null) {
                String[] stringArray = bx.a(this.M, com.mg.bas.v.t - 20);
                int n2 = 0;
                while (n2 < stringArray.length) {
                    this.R.a(graphics, stringArray[n2], (com.mg.bas.v.t - bx.d.a(stringArray[n2])) / 2, this.q.d() + this.q.f() + 8 + n, 0);
                    n += this.R.a();
                    ++n2;
                }
            }
        } else if (this.Q != null) {
            this.R.a(graphics, this.Q, (com.mg.bas.v.t - bx.d.a(this.Q)) / 2, this.q.d() + this.q.f() + 8, 0);
        }
        if (this.t != null) {
            this.t.a(graphics, this.c, this.d);
            this.t.c(true);
        }
        this.C.a(graphics, 0, 12);
        if (this.s != null) {
            this.s.a(graphics, this.c, this.d + 12);
            this.s.c(true);
        }
        if (!this.n && this.H != null) {
            this.H.a(graphics, this.c, this.d);
        }
        bx.d.a(graphics, String.valueOf(this.p.s()) + "/" + go.n, this.u.a, this.u.b - 16, 0);
    }

    private void w() {
        this.p.i(this.p.q());
    }

    public final void a(Graphics graphics) {
        pc.a(graphics, this.c, this.d, this.f, this.g, com.mg.bas.v.aj, true);
    }

    public final void b(aq object, int n) {
        this.a(object);
        if (this.D[this.A] instanceof ay) {
            k k2 = ((fg)((ay)this.D[this.A]).w()).u();
            if (this.r != null) {
                Object object2;
                bs bs2 = new bs();
                if (this.t.m() && !this.O && this.q != null && this.r.j != 3) {
                    bs2.a(new br("Bỏ ra", 4));
                }
                if (this.s.m() && !this.O && this.p != null) {
                    int n2 = 0;
                    int n3 = 0;
                    while (n3 < this.q.a()) {
                        if (this.q.k(n3) != null) {
                            ++n2;
                        }
                        ++n3;
                    }
                    if (n2 < this.q.a()) {
                        if (this.r.k != null) {
                            if (this.r.j == 1) {
                                lm lmObj = (lm)this.r.k;
                                dc dcObj = new dc(null, lmObj.b(), this.r.j, this.S);
                                gu guObj = new gu(dcObj);
                                ((am)guObj).a((bf)this);
                                guObj.e(lmObj.g);
                                bd bdDone = new bd("Xong", 5);
                                ((am)guObj).a((az)bdDone, true);
                                ((am)guObj).a(new bd("", 5));
                                bd bdCancel = new bd("Hủy", 6);
                                ((am)guObj).b((az)bdCancel, true);
                                ((am)guObj).b(-7524);
                                guObj.j(true);
                                ((ht)this).l.a((al)guObj, false);
                            } else if (this.r.j == 0) {
                                ks.a().a(this.F, (byte)0, ((ll)this.r.k).c);
                                com.mg.sq.a.s().a((String)null, (il)null);
                            }
                        }
                    }
                }
                if (bs2.s() == null || bs2.s().length == 0) {
                    return;
                }
                int n4 = k2.a + ((al)this).c + (k2.c - bs2.e()) / 2;
                int n5 = k2.b + ((al)this).d + k2.d;
                if (n5 + bs2.f() > com.mg.bas.v.u - ba.a) {
                    n5 = com.mg.bas.v.u - ba.a - bs2.f();
                }
                bs2.a_(((al)this).c + ((am)this).f + bs2.e(), n5);
                bs2.d(n4 < ((al)this).c ? ((al)this).c : (n4 + bs2.e() > ((al)this).c + ((am)this).f ? ((al)this).c + ((am)this).f - bs2.e() : n4), n5);
                bs2.a((bf)this);
                az az2 = this.y;
                ((am)this).b(az2, true);
                az2 = this.z;
                ((am)this).a(az2, true);
                bs2.a_(1);
                ((ht)this).n = true;
                ((ht)this).a(bs2, this.z, null, this.y);
            }
        }
    }

    public final void a(aq aq2, int n) {
    }

    public final void a(aq aq2, int n, int n2) {
    }
}
