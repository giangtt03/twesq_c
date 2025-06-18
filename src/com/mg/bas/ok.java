package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class ok
extends fb
implements bf,
bg,
bn,
bq {
    aw p;
    private ay t;
    fa[] q;
    fa[][] r;
    public boolean s = false;
    private ex u;
    private String[] v;
    private int w = 0;

    public ok() {
        super(110, 4, "Kho Game", false);
        this.a(0, 0, v.t, v.u);
        this.v = bx.a("Cài đặt MIỄN PHÍ vô số trò chơi và ứng dụng cực kỳ hấp dẫn. Ngoài ra, bạn còn có cơ hội nhận ngay các phần quà GIÁ TRỊ từ hệ thống.", v.t, bx.d);
        this.u = new ex("Kho Game", -2);
        this.u.a((v.t - 100) / 2, 10 + bx.d.a() + 10 + 10 + bx.d.a() * this.v.length, 100, 20);
        this.t = new ay(0);
        this.t.a(this.c(), bx.d.a() + 10, this.e(), this.f() - bx.d.a() - 10 - ba.a);
        this.p = new aw();
        this.p.a(this);
        this.p.a(this);
        this.p.e(true);
        this.t.b(this.p);
        this.a(new ba());
        this.a(new gb(-1, 0));
        this.b(new gb(-2, 1));
        this.c(com.mg.sq.a.n);
        this.a(this);
        boolean bl = false;
        ok ok2 = this;
        this.w = 0;
        ok2.u.d(true);
        ok2.c(true);
    }

    public final void c(boolean bl) {
        super.c(bl);
        if (bl && this.w == 4) {
            this.t.c(true);
        }
    }

    public final void x() {
        this.s = false;
        this.c(true);
    }

    public final void y() {
    }

    public final boolean f(int n) {
        if (n == 97 || n == 96) {
            return false;
        }
        if (this.w == 0) {
            if (n == 95) {
                ok.v();
                return true;
            }
            return false;
        }
        return this.t.f(n);
    }

    private static void v() {
        com.mg.sq.a.s().a((String)null, (il)null);
        du.a().n();
    }

    public final boolean c(int n, int n2) {
        if (this.w == 0) {
            if (this.u.h().b(n, n2)) {
                this.f(95);
                return true;
            }
        } else {
            return this.t.c(n, n2);
        }
        return super.c(n, n2);
    }

    public final boolean e(int n, int n2) {
        if (this.w != 0) {
            return this.t.e(n, n2);
        }
        return super.e(n, n2);
    }

    public final boolean f(int n, int n2) {
        if (this.w != 0) {
            return this.t.f(n, n2);
        }
        return super.f(n, n2);
    }

    public final void n() {
        if (this.w != 0) {
            this.t.n();
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (this.w == 0) {
            if (this.c) {
                this.a(graphics);
                bx.d.c(true);
                bx.d.a(graphics, "Giới thiệu", v.t >>> 1, 10, 1);
                bx.d.c();
                n = 10 + (10 + bx.d.a());
                bx.a(graphics, bx.d, this.v, 0, n, v.t, v.u, 1);
                this.u.a(graphics, this.c(), this.d());
                this.c(false);
                return;
            }
        } else {
            boolean bl = this.t.k();
            n = bl ? 1 : 0;
            if (bl) {
                this.a(graphics);
                pc.a(graphics, 4, 20, v.t - 8);
                bx.d.c(true);
                bx.d.a(graphics, "Kho Game", this.e() / 2, 2, 1);
                bx.d.c();
            }
            this.t.a(graphics, this.c(), this.d());
        }
    }

    private void a(Graphics graphics) {
        graphics.setColor(v.am);
        graphics.fillRect(this.c(), this.d(), this.e(), this.f());
        graphics.drawImage(pc.d, this.c() + this.e(), this.d() + this.f() - ba.a, 40);
    }

    public final void a(ea[] eaArray) {
        if (eaArray == null) {
            com.mg.sq.a.s().v();
            return;
        }
        this.w = 4;
        this.q = new fa[eaArray.length];
        this.r = new fa[eaArray.length][];
        int n = 0;
        while (n < eaArray.length) {
            this.q[n] = new fa(true, eaArray[n].d(), String.valueOf(eaArray[n].b()) + "(" + eaArray[n].e() + ")", eaArray[n].b(), eaArray[n].e(), this.p.e());
            ++n;
        }
        this.p.q();
        this.p.a(this.q);
        com.mg.sq.a.s().v();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a() {
        int n;
        if (this.q == null) {
            return;
        }
        int n2 = 0;
        int n3 = 0;
        while (n3 < this.q.length) {
            ++n2;
            if (this.q[n3].i && this.r[n3] != null && this.r[n3].length > 0) {
                n2 += this.r[n3].length;
                if (this.r[n3].length < this.q[n3].l) {
                    ++n2;
                }
            }
            ++n3;
        }
        Object object = new Object[n2];
        n2 = 0;
        int n4 = 0;
        while (n4 < this.q.length) {
            object[n2++] = this.q[n4];
            if (this.q[n4].i && this.r[n4] != null && this.r[n4].length > 0) {
                n = 0;
                while (n < this.r[n4].length) {
                    object[n2++] = this.r[n4][n];
                    ++n;
                }
                if (this.r[n4].length < this.q[n4].l) {
                    object[n2++] = new dp("Xem thêm", String.valueOf(this.q[n4].k) + '' + this.r[n4].length);
                }
            }
            ++n4;
        }
        n4 = this.p.s();
        n = this.t.r().b;
        aw aw2 = this.p;
        synchronized (aw2) {
            aq aq2;
            this.p.q();
            this.p.a((Object[])object);
            this.p.k(n4);
            n4 = n;
            object = this;
            aq aq3 = object.p.o(object.p.s());
            if (object.p.s() < object.p.a() - 1 && (aq2 = object.p.o(object.p.s() + 1)).d() + aq2.f() - n4 > object.p.f()) {
                n4 = aq2.d() + aq2.f() - object.p.f();
            }
            if (aq3.d() + aq3.f() - n4 > object.p.f()) {
                n4 = aq3.d() + aq3.f() - object.p.f();
            }
            object.t.k(n4);
            this.c(true);
            return;
        }
    }

    public final void d(int n, int n2) {
        switch (n2) {
            case -1: {
                ok ok2 = this;
                bs bs2 = new bs();
                bs2.a(new gb(0, 2));
                bs2.b(new gb(1, 3));
                br[] brArray = ok2.w == 0 ? new br[]{new br("Kho Game", 6), new br("Đóng", 5)} : new br[]{new br("Đóng", 5)};
                if (com.mg.sq.a.m != null) {
                    brArray = com.mg.sq.a.m.a(brArray, brArray.length - 1);
                    brArray = oi.b(brArray, brArray.length - 1);
                }
                bs2.a(brArray);
                int n3 = bs2.e() > bs2.f() ? bs2.e() : bs2.f();
                bs2.a_(-n3, v.u);
                bs2.d(0, v.u - ba.a - bs2.f());
                bs2.a(ok2);
                ok2.a(bs2);
                return;
            }
            case 1: {
                this.t();
                return;
            }
            case 0: {
                this.l.f(95);
                return;
            }
            case 5: {
                this.s = true;
                if (this.b == null) break;
                ((fc)this.b).d(this);
                return;
            }
            default: {
                ((fc)this.b).a();
            }
        }
    }

    public final void a(int n, int n2, Object object) {
        if (object == null) {
            return;
        }
        br br2 = (br)object;
        switch (n2) {
            case 5: {
                this.s = true;
                if (this.b == null) break;
                ((fc)this.b).d(this);
                break;
            }
            case 6: {
                ok.v();
                break;
            }
            case 11399: {
                if (com.mg.sq.a.m == null) break;
                com.mg.sq.a.m.b(br2.b());
                break;
            }
            default: {
                if (com.mg.sq.a.m == null) break;
                com.mg.sq.a.m.j(n2);
            }
        }
        this.t();
    }

    private static void a(long l, int n) {
        com.mg.sq.a.s().a((String)null, (il)null);
        du.a().a(l, n);
    }

    public final void b(aq object, int n) {
        if (this.p.i(n) instanceof dp) {
            object = (dp)this.p.i(n);
            String string = (String)((dp)object).b;
            int n2 = string.indexOf("");
            long l = Long.parseLong(string.substring(0, n2));
            n2 = Integer.parseInt(string.substring(n2 + 1));
            ok.a(l, n2);
            return;
        }
        object = (fa)this.p.i(n);
        if (((fa)object).j) {
            n = 0;
            while (n < this.q.length) {
                if (this.q[n].equals(object)) {
                    if (this.r[n] != null) {
                        ((fa)object).i = !((fa)object).i;
                        this.a();
                        return;
                    }
                    ok.a(((fa)object).k, 0);
                }
                ++n;
            }
            return;
        }
        com.mg.sq.a.s().a((String)null, (il)null);
        du.a().b(((fa)object).k);
    }

    public final void a(aq aq2, int n) {
    }

    public final void a(aq aq2, int n, int n2) {
    }

    public final aq a(aw aw2, int n) {
        if (aw2.i(n) instanceof dp) {
            return new gl(25);
        }
        return (aq)aw2.i(n);
    }
}
