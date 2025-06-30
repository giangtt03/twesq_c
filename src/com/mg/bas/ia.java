package com.mg.bas;
// Decompiled with: Procyon 0.6.0
// Class Version: 1

import javax.microedition.lcdui.Graphics;
import com.mg.sq.a;
import javax.microedition.lcdui.Image;

public final class ia extends ht implements bn, bq {

    private ay k;
    private aw p;
    private dk[] q;
    private lh r;
    private cz s;
    private ox t;
    private ll[] u;
    private boolean v;
    private lq w;
    private boolean x;
    private lq[] y;
    private boolean[] z;
    private lq[] A;
    private ft B;
    private az C;
    private az D;
    private az E;
    private d F;
    private Image G;

    public ia(final lf[] array) {
        super();
        this.v = false;
        this.F = new iff(new int[]{16711680, 16776960});
        this.G = com.mg.bas.f.d("/taythuytinh");
        this.t = new ox(null);
        this.b(241210);
        this.a(0, 0, com.mg.bas.v.t, com.mg.bas.v.u);
        this.r = go.k.a();
        for (int i = 0; i < this.r.D.length; ++i) {
            for (int j = 0; j < go.l.length; ++j) {
                if (this.r.D[i].c.equals(go.l[j].c)) {
                    this.r.D[i] = go.l[j];
                }
            }
        }
        this.s = new cz(this.r);
        (this.k = new ay(0)).a(this.a(), this.s.q() + 6, this.i(), this.j() - this.s.q() - 6 - ba.a);
        (this.p = new aw()).a((bn) this);
        this.p.a((bq) this);
        this.p.e(true);
        this.k.b(this.p);
        this.q = new dk[array.length];
        for (int k = 0; k < this.q.length; ++k) {
            this.q[k] = new dk(array[k]);
        }
        this.t();
        this.a(com.mg.sq.a.n);
        this.a(this);
        this.y = new lq[4];
        this.z = new boolean[4];
        (this.u = new ll[4])[0] = this.r.a(0);
        this.u[1] = this.r.a(1);
        this.u[2] = this.r.a(2);
        this.u[3] = this.r.a(3);
        (this.B = new ft(go.s / 2L)).a(go.s);
        this.a(this.C = new gb(1, 0), true);
        this.D = new gb(2, 2);
        this.E = new gb(3, 3);
    }

    private void t() {
        if (this.q == null) {
            return;
        }
        int n = 0;
        for (int i = 0; i < this.q.length; ++i) {
            ++n;
            if (this.q[i].a && !this.q[i].e()) {
                n += this.q[i].b.length;
                if (this.q[i].b.length < this.q[i].d()) {
                    ++n;
                }
            }
        }
        final Object[] array = new Object[n];
        int n2 = 0;
        for (int j = 0; j < this.q.length; ++j) {
            array[n2++] = this.q[j];
            if (this.q[j].a && !this.q[j].e()) {
                for (int k = 0; k < this.q[j].b.length; ++k) {
                    array[n2++] = this.q[j].b[k];
                }
                if (this.q[j].b.length < this.q[j].d()) {
                    array[n2++] = new dp("Xem thêm", this.q[j]);
                }
            }
        }
        final int s = this.p.s();
        final int b = this.k.r().b;
        synchronized (this.p) {
            this.p.q();
            this.p.a(array);
            this.p.k(s);
            int n3 = b;
            final aq o = this.p.o(this.p.s());
            final aq o2;
            if (this.p.s() < this.p.a() - 1 && (o2 = this.p.o(this.p.s() + 1)).d() + o2.f() - n3 > this.p.f()) {
                n3 = o2.d() + o2.f() - this.p.f();
            }
            if (o.d() + o.f() - n3 > this.p.f()) {
                n3 = o.d() + o.f() - this.p.f();
            }
            this.k.k(n3);
            this.e(true);
//            monitorexit(this.p);
        }
    }

    public final void e(final boolean b) {
        super.e(b);
        this.k.c(b);
    }

    public final void a(final int n, final lq[] array) {
        for (int i = 0; i < this.q.length; ++i) {
            if (this.q[i].b() == n) {
                this.q[i].a(array);
                this.q[i].a = true;
                this.q[i].c = array.length;
                this.t();
                break;
            }
        }
        com.mg.sq.a.s().v();
    }

    private static void a(final dk dk) {
        ks.a().d(dk.b(), (dk.b == null) ? 0 : dk.b.length);
        com.mg.sq.a.s().a(null, (il) null);
    }

    public final void f(final int n) {
        this.k.f(n);
    }

    public final void f(final int n, final int n2) {
        this.k.c(n, n2);
    }

    public final void e(final int n, final int n2) {
        this.k.e(n, n2);
    }

    public final void g(final int n, final int n2) {
        this.k.f(n, n2);
    }

    public final void u() {
        this.s.i();
        this.k.n();
        if (this.B != null) {
            this.B.i();
            this.B.b(true);
        }
    }

    public final void a(final Graphics graphics) {
        if (super.m != null) {
            this.k.c(true);
        }
        if (this.k.k()) {
            graphics.setColor(com.mg.bas.v.am);
            graphics.fillRect(0, 0, this.i(), this.j());
            graphics.drawImage(pc.d, this.a() + this.i(), this.c() + this.j() - ba.a, 40);
            pc.a(graphics, 2, this.s.q() + 5, this.i() - 4);
        }
        this.k.a(graphics, this.a(), this.c());
        this.k.c(true);
        graphics.setColor(com.mg.bas.v.am);
        graphics.fillRect(0, 0, this.s.p(), this.s.q());
        this.s.a(graphics);
        if (this.B != null) {
            this.B.a(graphics, 0, 0);
        }
    }

    public final void b(final Graphics graphics) {
    }

    private void a(final ll ll) {
        if (ll != null) {
            for (int i = 0; i < this.p.a(); ++i) {
                final fj fj;
                if (this.p.o(i) instanceof fj && (fj = (fj) this.p.o(i)).j == ll.b) {
                    fj.i = false;
                    fj.c(true);
                    return;
                }
            }
        }
    }

    public final void b(final aq aq, int n) {
        final Object i;
        if ((i = this.p.i(n)) instanceof dk) {
            final dk dk;
            if ((dk = (dk) i).a) {
                dk.a = false;
                this.t();
                return;
            }
            if (dk.d() <= 0 || (dk.b != null && dk.b.length > 0)) {
                dk.a = true;
                this.t();
                return;
            }
            a(dk);
        } else {
            if (i instanceof dp) {
                a((dk) ((dp) i).b);
                return;
            }
            if (i instanceof lq) {
                final lq w = (lq) i;
                this.w = w;
                final bs bs = new bs();
                String[] array = null;
                int[] array2 = null;
                final ll ll;
                if (w.e instanceof ll && ((ll = (ll) w.e).h == 2 || ll.h == this.r.f)) {
                    if (this.y[ll.e] != null && this.y[ll.e].e.equals(ll)) {
                        array = new String[]{"Cởi ra", "Mua", "C.Tiết"};
                        array2 = new int[]{11113, 11111, 11112};
                    } else {
                        array = new String[]{"Mặc thử", "Mua", "C.Tiết"};
                        array2 = new int[]{11114, 11111, 11112};
                    }
                }
                if (array == null) {
                    array = new String[]{"Mua", "C.Tiết"};
                    array2 = new int[]{11111, 11112};
                }
                final br[] array3 = new br[array.length];
                for (int j = 0; j < array3.length; ++j) {
                    array3[j] = new br(array[j], array2[j]);
                }
                bs.a(array3);
                final aq o = this.p.o(this.p.s());
                final k r = this.k.r();
                final int n2 = (com.mg.bas.v.t - bs.e()) / 2;
                if ((n = this.k.d() + o.d() - r.b) + bs.f() > com.mg.bas.v.u - ba.a) {
                    n = com.mg.bas.v.u - ba.a - bs.f();
                }
                bs.a_(com.mg.bas.v.t + bs.e(), n);
                bs.d(n2, n);
                bs.a_(1);
                bs.a(this);
                this.a(bs, this.D, com.mg.sq.a.n, this.E);
                super.n = true;
            }
        }
    }

    public final void a(final aq aq, final int n) {
    }

    public final void a(final aq aq, final int n, final int n2) {
    }

    public final aq a(aw aw, int n) {
        Object i = aw.i(n);
        if (i == null) {
            return null;
        }
        if (i instanceof dk) {
            return new fi((dk) i);
        }
        if (i instanceof dp) {
            return new gl(37);
        }
        if (i instanceof lq) {
            lq lqObj = (lq) i;
            if (lqObj.e instanceof lm) {
                lm lmObj = (lm) lqObj.e;
                return new fj(lmObj.b, lmObj.a, lmObj.j, lmObj.g, lmObj.h, -1, false, null, null, 0L);
            }
            if (lqObj.e instanceof lu) {
                lu luObj = (lu) lqObj.e;
                return new fj(luObj.a, luObj.d, luObj.c, this.G);
            }
            if (lqObj.e instanceof ll) {
                ll llObj = (ll) lqObj.e;
                boolean selected = false;
                if (this.y[llObj.e] != null && this.y[llObj.e].e.equals(llObj)) {
                    selected = true;
                }
                Image img = null;
                try {
                    img = this.t.a(mb.a(llObj.n), true);
                } catch (Throwable t) {}
                return new fj(llObj.d, llObj.b, llObj.l, llObj.m, selected, img, llObj.f, llObj.j, this.F, null, 0L);
            }
        }
        return null;
    }

    public final boolean g(final int n) {
        switch (n) {
            case 11111: {
                final boolean b = this.w.e instanceof lu;
                final al a;
                (a = ag.b().a("Chú ý", "Bạn muốn mua món đồ này không?", "Có", 13, "Không", 12, 1)).a(this);
                ag.b().a(a, false);
                return true;
            }
            case 11112: {
                if (this.w != null) {
                    if (this.w.e instanceof ll) {
                        final ll ll2;
                        final ll ll = ll2 = (ll) this.w.e;
                        ll.p = ((ll2.q == 0) ? -1 : ll2.q);
                        com.mg.sq.a.a(ll2, this, "", -123233, "Đóng", 5);
                    } else if (this.w.e instanceof lm) {
                        com.mg.sq.a.a((lm) this.w.e, null);
                    } else if (this.w.e instanceof lu) {
                        final lu lu = (lu) this.w.e;
                        final al a2;
                        (a2 = ag.b().a(lu.a, lu.b, "Đóng", 11119, 1)).b(1515);
                        ag.b().a(a2);
                        a2.a(this);
                    }
                }
                return true;
            }
            case 11113: {
                if (this.w != null && this.w.e instanceof ll) {
                    final ll ll3 = (ll) this.w.e;
                    ((fj) this.p.o(this.p.s())).i = false;
                    this.y[ll3.e] = null;
                    this.z[ll3.e] = false;
                    if (this.u[ll3.e] == null) {
                        this.s.b(ll3);
                    } else {
                        this.s.a(this.u[ll3.e]);
                    }
                }
                return true;
            }
            case 11114: {
                if (this.w != null && this.w.e instanceof ll) {
                    final ll ll4 = (ll) this.w.e;
                    this.a((this.y[ll4.e] != null) ? ((ll) this.y[ll4.e].e) : null);
                    ((fj) this.p.o(this.p.s())).i = true;
                    this.y[ll4.e] = this.w;
                    this.z[ll4.e] = true;
                    this.s.a(ll4);
                }
                return true;
            }
            case 11115: {
                int count = 0;
                for (int i = 0; i < this.y.length; ++i) {
                    if (this.y[i] != null && this.z[i]) {
                        count++;
                    }
                }
                if (count == 0) {
                    this.v();
                } else {
                    lq[] lqArray = new lq[count];
                    int idx = 0;
                    for (int i = 0; i < this.y.length; ++i) {
                        if (this.y[i] != null && this.z[i]) {
                            lqArray[idx++] = this.y[i];
                        }
                    }
                    this.a(lqArray);
                }
                return true;
            }
            
            case 11116: {
                int n4 = 0;
                while (n4 < this.y.length) {
                    if (this.y[n4] != null && this.z[n4]) {
                        ia ia6 = this;
                        al al4 = ag.b().a("Chú ý", "Bạn đã chọn một số món đồ. Bạn có muốn mua không?", "Có", 11, "Đóng", 8, 1);
                        al4.a(ia6);
                        al4.b(1345779);
                        ag.b().a(al4, false);
                        this.v = true;
                        return true;
                    }
                    ++n4;
                }
                this.w();
                return true;
            }
            case 11117: {
                com.mg.sq.a.s().l();
                ag.b().a(new hh(null, null));
                return true;
            }
            case 11118: {
                ag.b().a(241209, false);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public final void e(final int n) {
        switch (n) {
            case 2: {
                if (super.m != null) {
                    super.m.f(95);
                    return;
                }
                break;
            }
            case 3: {
                this.A();
                return;
            }
            case 1: {
                this.a(new br[]{new br("Giỏ hàng", 11115), new br("Đóng", 11116)}, this.D, com.mg.sq.a.n, this.E);
                return;
            }
            case 5: {
                com.mg.sq.a.s().a(241212, false);
                return;
            }
            case 8: {
                com.mg.sq.a.s().a(1345779, false);
                if (this.v) {
                    this.w();
                    return;
                }
                break;
            }
            case 9: {
                if (go.b()) {
                    com.mg.sq.a.a(this, "Hành Trang", 11117, "Đóng", 11118);
                    return;
                }
                this.x = true;
                com.mg.sq.a.s().a(154896, false);
                final int[] array = new int[this.A.length];
                for (int i = 0; i < array.length; ++i) {
                    array[i] = this.A[i].a;
                }
                ks.a().a(array);
                com.mg.sq.a.s().a(null, (il) null);
                return;
            }
            case 10: {
                com.mg.sq.a.s().a(154896, false);
                if (this.v) {
                    this.w();
                    return;
                }
                break;
            }
            case 11: {
                com.mg.sq.a.s().a(1345779, false);
                java.util.Vector selected = new java.util.Vector();
                for (int j = 0; j < this.y.length; ++j) {
                    if (this.y[j] != null && this.z[j]) {
                        selected.addElement(this.y[j]);
                    }
                }
                if (selected.size() == 0) {
                    this.v();
                    return;
                }
                lq[] array2 = new lq[selected.size()];
                selected.copyInto(array2);
                this.a(array2);
                return;
            }
            case 13: {
                ag.b().a(false);
                this.x = false;
                if (this.w != null) {
                    ks.a().a(new int[]{this.w.a});
                    com.mg.sq.a.s().a(null, (il) null);
                }
                return;
            }
            case 12: {
                ag.b().a(false);
                return;
            }
            case 11119: {
                ag.b().e(1515);
                break;
            }
        }
    }

    public final void a(final String[] array, final int[] array2) {
        com.mg.sq.a.s().v();
        if (this.x) {
            for (int i = 0; i < this.y.length; ++i) {
                for (int j = 0; j < array2.length; ++j) {
                    if (this.y[i] != null && this.y[i].a == array2[j]) {
                        this.z[i] = false;
                        final ll d;
                        final ll ll = d = ((ll) this.y[i].e).d();
                        ll.p = ((d.q == 0) ? -1 : d.q);
                        d.c = array[j];
                        go.a(d);
                        this.a((ll) this.y[i].e);
                        break;
                    }
                }
            }
            if (this.v) {
                this.w();
            }
        } else {
            if (this.w == null) {
                return;
            }
            if (this.w.e instanceof ll) {
                final ll d2;
                final ll ll2 = d2 = ((ll) this.w.e).d();
                ll2.p = ((d2.q == 0) ? -1 : d2.q);
                d2.c = array[0];
                go.a(d2);
                for (int k = 0; k < array2.length; ++k) {
                    for (int l = 0; l < this.y.length; ++l) {
                        if (this.y[l] != null && this.y[l].a == array2[k]) {
                            this.z[l] = false;
                            this.a((ll) this.y[l].e);
                            break;
                        }
                    }
                }
                this.a(d2.d);
            }
        }
    }

    public final void a(final int[] array, final int[] array2) {
        if (this.w == null) {
            return;
        }
        final lm b;
        if (this.w.e instanceof lm && (b = ((lm) this.w.e).b()).a == array[0]) {
            go.a(b, array2[0]);
            this.a(String.valueOf(array2[0]) + " " + b.b);
        }
        com.mg.sq.a.s().v();
        if (this.v) {
            this.w();
        }
    }

    private void v() {
        final al a;
        (a = ag.b().a("Chú ý", "Giỏ hàng trống. Bạn chưa chọn món đồ nào", "Đóng", 8, 1)).a(this);
        a.b(1345779);
        ag.b().a(a, false);
    }

    private void a(final String s) {
        final al a;
        (a = ag.b().a("Chú ý", "Bạn vừa mua thành công! " + s, "Đóng", 8, 1)).a(this);
        a.b(1345779);
        ag.b().a(a, false);
    }

    private void a(final lq[] a) {
        this.A = a;
        final gx gx;
        (gx = new gx(this.A)).a(new bd("Mua", 9), true);
        gx.b(new bd("Đóng", 10), true);
        gx.a(this);
        gx.b(154896);
        ag.b().a(gx, false);
    }

    public final void a(final long n) {
        if (this.B != null) {
            this.B.a(n);
        }
    }

    private void w() {
        com.mg.sq.a.s().e(this.h());
        final al d;
        if ((d = com.mg.sq.a.s().d(241202)) != null) {
            com.mg.sq.a.s().b(d, false);
            ag.b().a(new hh(null, null));
        }
    }
}
