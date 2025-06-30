package com.mg.bas;
// Decompiled with: Procyon 0.6.0
// Class Version: 1
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import com.mg.sq.a;

public final class id extends ht implements bq
{
    private ox k;
    private fg p;
    private fg q;
    private fg r;
    private dc s;
    private ay t;
    private ay u;
    private ay v;
    private k w;
    private k x;
    private k y;
    private lh z;
    private int A;
    private az B;
    private az C;
    private byte D;
    private byte[][] E;
    private ex F;
    private aq[] G;
    private int H;
    private String I;
    private Object J;
    private fw K;
    private int L;
    private lm M;
    private int N;
    private long O;
    private String P;
    private boolean Q;
    private boolean R;
    private k S;
    private String T;
    private by U;
    private d V;
    
    public id(final String i, final String s, final String p4, final ox ox, d v) {
        super();
        this.w = null;
        this.x = null;
        this.y = null;
        this.D = 0;
        this.J = new Object();
        this.L = 0;
        this.Q = false;
        this.R = false;
        this.I = i;
        this.P = p4;
        if (v == null) {
            v = new iff(new int[] { 16711680, 16776960 });
        }
        this.V = v;
        this.k = new ox(ox);
        this.b(241232);
        this.a(new ba());
        this.a(this);
        int n = 240;
        int n2 = 320 - ba.a;
        if (com.mg.sq.a.k == 1) {
            n = 320;
            n2 = com.mg.bas.v.u - ba.a;
        }
        this.S = new k((com.mg.bas.v.t >= n) ? ((com.mg.bas.v.t - n) / 2) : 0, (com.mg.bas.v.u >= n2) ? ((com.mg.bas.v.u - ba.a - n2) / 2) : 0, n, n2);
        this.t();
        this.a(s);
        this.b(this.B, true);
        this.a((az)null);
    }
    
    private void t() {
        final int n = com.mg.bas.v.t - 20;
        this.w = new k((com.mg.bas.v.t - n) / 2, 130, n, super.g - 155);
        this.y = new k((com.mg.bas.v.t - n) / 2 - 4, 30, 44, 44);
        this.x = new k((com.mg.bas.v.t - n) / 2 + 46, 30, n - 44, 44);
        (this.p = new fg(false)).e(true);
        this.p.i = new k(this.w.a, this.w.b, this.w.c, this.w.d);
        this.z = go.k.a();
        int a = go.l.length - this.z.D.length;
        for (int i = 0; i < go.m.length; ++i) {
            if (go.m[i].l == 1) {
                a += go.m[i].g;
            }
            else if (go.m[i].l > 1) {
                a += go.m[i].g / go.m[i].l + ((go.m[i].g % go.m[i].l > 0) ? 1 : 0);
            }
            else {
                ++a;
            }
        }
        this.A = a;
        if (this.A < go.n) {
            this.A = go.n;
        }
        this.p.d(this.A, 1);
        this.p.a(this);
        final ll[] l = go.l;
        int length = this.z.D.length;
        this.p.t();
        for (int j = 0; j < l.length; ++j) {
            if (l[j] != null) {
                boolean b = false;
                if (length > 0) {
                    for (int k = 0; k < this.z.D.length; ++k) {
                        if (l[j].c.equals(this.z.D[k].c)) {
                            --length;
                            b = true;
                            break;
                        }
                    }
                }
                if (!b) {
                    this.p.a((Object)new dc(this.k.a(mb.a(l[j]) + 98, true), l[j], 0, this.V));
                }
            }
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
        final lm[] array = new lm[go.m.length];
        for (int n2 = 0; n2 < array.length; ++n2) {
            array[n2] = go.m[n2].b();
        }
        this.a(array);
        (this.E = new byte[4][4])[0] = new byte[] { 1, -1, 2, -1 };
        this.E[1] = new byte[] { 2, 0, 2, -1 };
        this.E[2] = new byte[] { 3, 2, 3, 0 };
        this.E[3] = new byte[] { -1, 2, -1, 2 };
        (this.u = new ay()).a(new k(this.x.a, this.x.b, this.x.c, this.x.d + 2));
        this.u.b(this.q);
        this.u.h(2);
        (this.t = new ay()).a(new k(this.w.a, this.w.b, this.w.c, this.w.d));
        this.t.b(this.p);
        this.t.h(2);
        (this.v = new ay()).a(new k(this.y.a, this.y.b, this.y.c, this.y.d + 2));
        this.v.b(this.r);
        this.v.h(2);
        this.F = new ex("Nâng cấp", 2);
        final int n3 = bx.d.a("Nâng cấp") + 10;
        this.F.a(super.c + (com.mg.bas.v.t - n3) / 2, this.w.b - 25, n3, 18);
        this.G = new aq[] { this.v, this.u, this.F, this.t };
        this.U = new by(16711680);
        this.B = new gb(1, 3);
        this.C = new gb(3, 2);
    }
    
    private void a(final lm[] array) {
        for (int i = 0; i < array.length; ++i) {
            final int n = (array[i].e == 3) ? 2 : 1;
            if (array[i].g > 0) {
                if (array[i].l > 0) {
                    int g = array[i].g;
                    for (int n2 = array[i].g / array[i].l, j = 0; j < n2; ++j) {
                        final lm b;
                        (b = array[i].b()).g = array[i].l;
                        g -= array[i].l;
                        this.p.a((Object)new dc(null, b, n, this.V));
                    }
                    if (g > 0) {
                        final lm b2;
                        (b2 = array[i].b()).g = g;
                        this.p.a((Object)new dc(null, b2, n, this.V));
                    }
                }
                else {
                    this.p.a((Object)new dc(null, array[i], n, this.V));
                }
            }
        }
    }
    
    private void v() {
        synchronized (this.J) {
            this.e(true);
            int n = 0;
            int n2 = 0;
            for (int i = 0; i < this.q.s(); ++i) {
                final dc dc;
                if ((dc = (dc)this.q.k(i)).j == 0) {
                    if (dc.k != null) {
                        ++n;
                    }
                }
                else if (dc.j == 1) {
                    ++n2;
                }
            }
            int n3 = 0;
            int n4 = 0;
            final String[] array = new String[n];
            final int[] array2 = new int[n2];
            final int[] array3 = new int[n2];
            for (int j = 0; j < this.q.s(); ++j) {
                final dc dc2;
                if ((dc2 = (dc)this.q.k(j)).j == 0) {
                    if (dc2.k != null) {
                        array[n3] = ((ll)dc2.k).c;
                        ++n3;
                    }
                }
                else if (dc2.j == 1 && dc2.k != null) {
                    array2[n4] = ((lm)dc2.k).a;
                    array3[n4] = ((lm)dc2.k).g;
                    ++n4;
                }
            }
            ks.a().b(this.I, array, array2, array3, this.O);
            com.mg.sq.a.s().a(null, (il)null);
//            monitorexit(this.J);
        }
    }
    
    protected final boolean g(int g) {
        switch (g) {
            case 4: {
                if (this.s.k == null) {
                    break;
                }
                if (this.s.k != null) {
                    if (this.s.j == 0) {
                        ks.a().b(this.I, (byte)1, ((ll)this.s.k).c);
                    }
                    else {
                        this.M = (lm)this.s.k;
                        int n = 0;
                        for (int i = 0; i < this.q.s(); ++i) {
                            final lm lm;
                            if ((((dc)this.q.k(i)).j == 1 || ((dc)this.q.k(i)).j == 2) && (lm = (lm)((dc)this.q.k(i)).k) != null && lm.a == this.M.a) {
                                n += lm.g;
                            }
                        }
                        ks.a().b(this.I, (byte)1, this.M.a, n);
                    }
                }
                this.Q = true;
                com.mg.sq.a.s().a(null, (il)null);
                if (super.m != null) {
                    this.A();
                    break;
                }
                break;
            }
            case 5: {
                final gu gu;
                if (com.mg.sq.a.s().c(-7524) && (gu = (gu)com.mg.sq.a.s().d(-7524)) != null) {
                    this.M = gu.t();
                    this.M.g = gu.u();
                    g = this.M.g;
                    ks.a().b(this.I, (byte)0, this.M.a, g);
                    com.mg.sq.a.s().a(null, (il)null);
                    ag.b().a(-7524, false);
                    break;
                }
                break;
            }
            case 6: {
                ag.b().a(false);
                break;
            }
            case 2: {
                ct.a("Command Upgradeready " + this.N + "processUpgrade" + this.R);
                if (this.R) {
                    this.w();
                    this.F.a("Nâng cấp");
                    this.R = false;
                    this.T = null;
                    this.P = null;
                    break;
                }
                if (this.N == 0) {
                    final al a;
                    (a = ag.b().a("Chú ý", "Chưa đủ nguyên liệu. Vui lòng thử lại!!!", "Đóng", 6, 1)).b(199199);
                    a.a(this);
                    ag.b().a(a, false);
                    break;
                }
                if (this.N != 1) {
                    break;
                }
                if (go.s > -1L && this.O > go.s) {
                    final al a2;
                    (a2 = ag.b().a("Chú ý", "Vượt quá số tiền bạn đang có. Vui lòng thử lại!!!", "Đóng", 6, 1)).b(199199);
                    a2.a(this);
                    ag.b().a(a2, false);
                    break;
                }
                final hc hc;
                (hc = new hc(String.valueOf(this.P) + ". Bạn có muốn nâng cấp không?", "Nâng cấp", 7, "Không", 6)).a(this);
                ag.b().a(hc, false);
                break;
            }
            case 7: {
                ag.b().a(false);
                this.v();
                break;
            }
        }
        return false;
    }
    
    public final void a(final ll[] array, final lm[] array2, final byte b) {
        if (ct.a()) {
            ct.a("Receive " + array.length + " equips, " + array2.length + " items after upgrade.");
        }
        com.mg.sq.a.s().v();
        synchronized (this.J) {
            this.e(true);
            for (int i = 0; i < this.r.s(); ++i) {
                final dc dc;
                if ((dc = (dc)this.r.k(i)).k != null) {
                    if (dc.j == 0) {
                        go.b((ll)dc.k);
                    }
                    else {
                        go.a((lm)dc.k);
                    }
                }
            }
            for (int j = 0; j < this.q.s(); ++j) {
                final dc dc2;
                if ((dc2 = (dc)this.q.k(j)).k != null) {
                    if (dc2.j == 0) {
                        go.b((ll)dc2.k);
                    }
                    else {
                        go.a((lm)dc2.k);
                    }
                }
            }
            this.r.t();
            this.q.t();
            for (int k = 0; k < array.length; ++k) {
                if (array[k] != null) {
                    this.r.a((Object)new dc(this.k.a(mb.a(array[k]) + 98, true), array[k], 0, this.V));
                    go.a(array[k]);
                }
            }
            for (int l = 0; l < array2.length; ++l) {
                if (array2[l] != null) {
                    this.r.a((Object)new dc(null, array2[l], array2[l].e, this.V));
                    go.a(array2[l], array2[l].g);
                }
            }
//            monitorexit(this.J);
        }
        if (b == 1) {
            this.T = "Nâng cấp thành công";
        }
        else {
            this.T = "Nâng cấp thất bại";
        }
        this.R = true;
        this.F.a("Tiếp tục");
    }
    
    protected final void e(final int n) {
        switch (n) {
            case 1: {
                if (super.m != null) {
                    this.A();
                    return;
                }
                ag.b().a(false);
                if (com.mg.sq.a.s().c(241202)) {
                    com.mg.sq.a.s().e(241202);
                }
                ag.b().a(new hh(null, null));
                return;
            }
            case 3: {
                this.c(95);
                break;
            }
        }
    }
    
    protected final void f(final int n) {
        final byte d = this.D;
        switch (n) {
            case 96:
            case 97:
            case 98:
            case 99: {
                if (!this.G[this.D].f(n)) {
                    final int n2 = n - 96;
                    final byte d2;
                    if (n2 >= 0 && (d2 = this.E[this.D][n2]) >= 0) {
                        this.D = d2;
                    }
                }
                if (d != this.D) {
                    this.G[this.D].d(true);
                    this.G[d].d(false);
                    if (this.G[this.D] instanceof ay) {
                        ((fg)((ay)this.G[this.D]).w()).i(0);
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
                    super.i.d(0, ((ex)this.G[2]).a());
                    return;
                }
                this.G[this.D].f(n);
                return;
            }
            default: {
                this.G[this.D].f(n);
            }
        }
    }
    
    public final void f(final int n, final int n2) {
        this.e(true);
        if (super.m != null) {
            final az[] a = super.m.a();
            int i = 0;
            while (true) {
                while (i < a.length) {
                    if (a[i] != null && a[i].a(n, n2)) {
                        if (super.i != null) {
                            super.i.d(-1, a[i].a());
                        }
                        final boolean b = true;
                        if (b) {
                            return;
                        }
                        if (super.m.c(n, n2)) {
                            return;
                        }
                        this.A();
                        return;
                    }
                    else {
                        ++i;
                    }
                }
                final boolean b = false;
                continue;
            }
        }
        final byte d = this.D;
        for (byte d2 = 0; d2 < this.G.length; ++d2) {
            k k;
            if (this.G[d2].equals(this.t)) {
                k = new k(this.p.i.a + this.S.a, this.p.i.b + this.S.b, this.p.i.c, this.p.i.d);
            }
            else if (this.G[d2].equals(this.u)) {
                k = new k(this.q.i.a + this.S.a, this.q.i.b + this.S.b, this.q.i.c, this.q.i.d);
            }
            else {
                k = new k(this.G[d2].c() + this.S.a, this.G[d2].d() + this.S.b, this.G[d2].e(), this.G[d2].f());
            }
            if (k.a(n, n2)) {
                if (d2 != d) {
                    this.D = d2;
                    this.G[d].d(false);
                    this.G[this.D].d(true);
                }
                this.G[d2].c(n - this.S.a, n2 - this.S.b);
                if (this.G[d2] instanceof ex) {
                    this.d(-1, ((ex)this.G[d2]).a());
                }
                return;
            }
        }
    }
    
    public final void e(final int n, final int n2) {
        if (this.p.m()) {
            this.p.e(n, n2);
        }
    }
    
    private void a(final Object o) {
        this.L = 0;
        this.K = null;
        this.s = (dc)o;
    }
    
    public final void u() {
        for (int i = 0; i < this.G.length; ++i) {
            if (this.G[i] != null) {
                this.G[i].n();
                this.G[i].c(true);
            }
        }
        if (this.K != null) {
            this.K.i();
        }
        if (this.L < 7) {
            ++this.L;
            if (this.L == 7 && this.s != null && this.s.k != null) {
                this.K = new fw(this.s.k);
                final int n = super.g - 18;
                this.K.a(9, n, super.f - 20, super.g / 4);
                this.K.c(9, n);
                this.K.a(9, n - this.K.q() - 7);
            }
        }
        if (super.h) {
            --this.H;
            if (this.H <= 0) {
                this.e(false);
                this.H = 0;
            }
        }
    }
    
    public final void a(final String s, final String p4, final byte n, final long o) {
        com.mg.sq.a.s().v();
        synchronized (this.J) {
            this.e(true);
            this.N = n;
            this.P = p4;
            this.O = o;
            for (int i = 0; i < this.q.s(); ++i) {
                final dc dc;
                if ((dc = (dc)this.q.k(i)).j == 0 && dc.k != null && ((ll)dc.k).c.equals(s)) {
                    this.q.a(dc);
                    this.p.a((Object)dc);
                    this.a(this.q.r());
//                    monitorexit(this.J);
                    return;
                }
            }
//            monitorexit(this.J);
            return;
        }
    }
    
    public final void a(final String p3, final byte n, final long o) {
        com.mg.sq.a.s().v();
        if (this.Q) {
            this.N = n;
            this.P = p3;
            this.O = o;
            this.q.a(this.s);
            final lm lm = (lm)this.s.k;
            int n2 = 0;
            Vector toRemove = new Vector();
            for (int i = 0; i < this.p.s(); ++i) {
                final lm lm2;
                if ((((dc)this.p.k(i)).j == 1 || ((dc)this.p.k(i)).j == 2) && (lm2 = (lm)((dc)this.p.k(i)).k) != null && lm2.a == lm.a) {
                    n2 += lm2.g;
                    toRemove.addElement((dc)this.p.k(i));
                }
            }
            int n3 = n2 + lm.g;
            for (int j = 0; j < toRemove.size(); ++j) {
                this.p.a((dc)toRemove.elementAt(j));
            }
            if (lm.l <= 0) {
                final lm b;
                (b = lm.b()).g = n3;
                this.p.a((Object)new dc(null, b, (lm.e == 3) ? 2 : 1, this.V));
            }
            else {
                for (int n4 = n3 / lm.l + ((n3 % lm.l > 0) ? 1 : 0), k = 0; k < n4; ++k) {
                    final lm b2 = lm.b();
                    if (n3 >= lm.l) {
                        b2.g = lm.l;
                        n3 -= lm.l;
                    }
                    else if (n3 > 0) {
                        b2.g = n3;
                        n3 = 0;
                    }
                    this.p.a((Object)new dc(null, b2, (lm.e == 3) ? 2 : 1, this.V));
                }
            }
            this.x();
            this.Q = false;
            this.s = null;
            this.a(this.q.r());
        }
    }
    
    public final void b(final String s, final String p4, final byte n, final long o) {
        com.mg.sq.a.s().v();
        synchronized (this.J) {
            this.e(true);
            this.N = n;
            this.P = p4;
            this.O = o;
            for (int i = 0; i < this.p.s(); ++i) {
                final dc dc;
                if ((dc = (dc)this.p.k(i)).j == 0 && dc.k != null && ((ll)dc.k).c.equals(s)) {
                    this.p.a(dc);
                    this.q.a((Object)dc);
                    this.a(this.p.r());
//                    monitorexit(this.J);
                    return;
                }
            }
//            monitorexit(this.J);
        }
    }
    
    private void a(final String s) {
        for (int i = 0; i < this.p.s(); ++i) {
            final dc dc;
            if ((dc = (dc)this.p.k(i)).j == 0 && dc.k != null && ((ll)dc.k).c.equals(s)) {
                this.p.a(dc);
                this.r.a((Object)dc);
                this.a(this.r.r());
                return;
            }
        }
    }
    
    private void w() {
        for (int i = 0; i < this.r.s(); ++i) {
            ks.a().r(((ll)((dc)this.r.k(i)).k).c);
        }
    }
    
    public final void b(final String p3, final byte n, final long o) {
        com.mg.sq.a.s().v();
        if (this.M != null) {
            this.N = n;
            this.P = p3;
            this.O = o;
            int n2 = 0;
            Vector toRemoveQ = new Vector();
            for (int i = 0; i < this.q.s(); ++i) {
                final lm lm;
                if (((dc)this.q.k(i)).j == 1 && (lm = (lm)((dc)this.q.k(i)).k) != null && lm.a == this.M.a) {
                    n2 += lm.g;
                    toRemoveQ.addElement((dc)this.q.k(i));
                }
            }
            int n3 = n2 + this.M.g;
            for (int j = 0; j < toRemoveQ.size(); ++j) {
                this.q.a((dc)toRemoveQ.elementAt(j));
            }
            if (this.M.l <= 0) {
                final lm b;
                (b = this.M.b()).g = n3;
                this.q.a((Object)new dc(null, b, 1, this.V));
            }
            else {
                for (int n4 = n3 / this.M.l + ((n3 % this.M.l > 0) ? 1 : 0), k = 0; k < n4; ++k) {
                    final lm b2 = this.M.b();
                    if (n3 >= this.M.l) {
                        b2.g = this.M.l;
                        n3 -= this.M.l;
                    }
                    else if (n3 > 0) {
                        b2.g = n3;
                        n3 = 0;
                    }
                    this.q.a((Object)new dc(null, b2, 1, this.V));
                }
            }
            final lm m = this.M;
            int n5 = 0;
            final lm b3 = m.b();
            Vector toRemoveP = new Vector();
            for (int l = 0; l < this.p.s(); ++l) {
                this.s = (dc)this.p.k(l);
                final lm lm2;
                if (this.s != null && this.s.k != null && (this.s.j == 1 || this.s.j == 2) && (lm2 = (lm)this.s.k) != null && lm2.a == m.a) {
                    n5 += lm2.g;
                    toRemoveP.addElement(this.s);
                }
            }
            b3.g = n5 - m.g;
            for (int n6 = 0; n6 < toRemoveP.size(); ++n6) {
                this.p.a((dc)toRemoveP.elementAt(n6));
            }
            if (b3.g > 0) {
                this.a(new lm[] { b3 });
            }
            this.x();
            this.a(this.p.r());
        }
    }
    
    public final void e(final boolean b) {
        super.e(b);
        this.H = 5;
    }
    
    public final void b(final Graphics graphics) {
        this.U.a(graphics, "Phí kết hợp: " + com.mg.bas.i.a(this.O, ",") + " KEN", (com.mg.bas.v.t - bx.d.a("Phí kết hợp: ")) / 2 - 10, 10, 0);
        if (!this.R) {
            if (this.P != null) {
                this.U.a(graphics, this.P, (com.mg.bas.v.t - bx.d.a(this.P)) / 2, this.q.d() + this.q.f() + 8, 0);
            }
        }
        else if (this.T != null) {
            this.U.a(graphics, this.T, (com.mg.bas.v.t - bx.d.a(this.T)) / 2, this.q.d() + this.q.f() + 8, 0);
        }
        if (this.u != null) {
            this.u.a(graphics, super.c, super.d);
            this.u.c(true);
        }
        if (this.v != null) {
            this.v.a(graphics, super.c, super.d);
            this.v.c(true);
        }
        this.F.a(graphics, 0, 0);
        if (this.t != null) {
            this.t.a(graphics, super.c, super.d);
            this.t.c(true);
        }
        if (!super.n && this.K != null) {
            this.K.a(graphics, super.c, super.d);
        }
        bx.d.a(graphics, String.valueOf(this.p.s()) + "/" + go.n, this.w.a, this.w.b - 16, 0);
    }
    
    private void x() {
        this.p.i(this.p.q());
    }
    
    public final void a(final Graphics graphics) {
        pc.a(graphics, super.c, super.d, super.f, super.g, com.mg.bas.v.aj, true);
    }
    
    public final void b(final aq aq, int n) {
        this.a(aq);
        if (this.G[this.D] instanceof ay) {
            final k u = ((fg)((ay)this.G[this.D]).w()).u();
            if (this.s != null) {
                final bs bs = new bs();
                if (this.u.m() && !this.R && this.q != null && this.s.j != 3) {
                    bs.a(new br("Bỏ ra", 4));
                }
                if (this.t.m() && !this.R && this.p != null) {
                    int n2 = 0;
                    for (int i = 0; i < this.q.a(); ++i) {
                        if (this.q.k(i) != null) {
                            ++n2;
                        }
                    }
                    if (n2 < this.q.a() && this.s.k != null) {
                        if (this.s.j == 1) {
                            final lm lm = (lm)this.s.k;
                            final gu gu;
                            (gu = new gu(new dc(null, lm.b(), this.s.j, this.V))).a(this);
                            gu.e(lm.g);
                            gu.a(new bd("Xong", 5), true);
                            gu.a(new bd("", 5));
                            gu.b(new bd("Hủy", 6), true);
                            gu.b(-7524);
                            gu.j(true);
                            ag.b().a(gu, false);
                        }
                        else if (this.s.j == 0) {
                            ks.a().b(this.I, (byte)0, ((ll)this.s.k).c);
                            com.mg.sq.a.s().a(null, (il)null);
                        }
                    }
                }
                if (bs.s() == null || bs.s().length == 0) {
                    return;
                }
                final int n3 = u.a + super.c + (u.c - bs.e()) / 2;
                if ((n = u.b + super.d + u.d) + bs.f() > com.mg.bas.v.u - ba.a) {
                    n = com.mg.bas.v.u - ba.a - bs.f();
                }
                bs.a_(super.c + super.f + bs.e(), n);
                bs.d((n3 < super.c) ? super.c : ((n3 + bs.e() > super.c + super.f) ? (super.c + super.f - bs.e()) : n3), n);
                bs.a(this);
                this.b(this.B, true);
                this.a(this.C, true);
                bs.a_(1);
                super.n = true;
                this.a(bs, this.C, null, this.B);
            }
        }
    }
    
    public final void a(final aq aq, final int n) {
    }
    
    public final void a(final aq aq, final int n, final int n2) {
    }
}
