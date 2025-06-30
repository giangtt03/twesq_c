package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class gy
extends ht {
    public da k;
    private ay p;
    private az q;
    private az r;
    private az s;
    private boolean t;
    private Image u;

    public gy() {
        new ox(null);
        this.b(241201);
        this.a(new ba());
        this.a(this);
        try {
            this.f = 240;
            this.g = 320 - ba.a;
            if (com.mg.sq.a.k == 1) {
                this.f = v.t;
                this.g = 240 - ba.a;
            }
            this.c = v.t >= this.f ? (v.t - this.f) / 2 : 0;
            this.d = v.u >= this.g ? (v.u - ba.a - this.g) / 2 : 0;
            this.a(this.c, this.d, this.f, this.g);
            Object object = new k(0, 0, this.f, this.g);
            this.k = new da();
            this.k.a((k)object);
            this.s = new gb(3, 3);
            this.r = new gb(2, 2);
            this.q = new gb(1, 0);
            az az2 = this.s;
            object = this;
            ((am)object).b(az2, true);
            az2 = this.q;
            object = this;
            ((am)object).a(az2, true);
            object = this;
            this.p = new ay(2);
            ((gy)object).p.a(0, 0, v.t, v.u - ba.a);
            ((gy)object).p.h(1);
            ((gy)object).k.a(go.k);
            ((gy)object).k.q();
            ((gy)object).k.a(((gy)object).k.j.a, ((gy)object).k.j.b, ((gy)object).k.j.c, ((gy)object).k.j.d);
            if (v.u > ((gy)object).k.j.d) {
                ((am)object).g = ((gy)object).k.j.d;
                ((al)object).d = v.u - ba.a - ((am)object).g >> 1;
            }
            ((gy)object).p.b(((gy)object).k);
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public final void t() {
        this.u = com.mg.bas.f.d("/createcs/bk");
        this.k.i = false;
        this.t = true;
        az az2 = null;
        gy gy2 = this;
        gy2.a(az2, true);
        az2 = null;
        gy2 = this;
        gy2.b(az2, true);
        this.a(new bd("Bắt đầu", 4));
    }

    public final void a(Graphics graphics) {
        if (this.t) {
            if (this.u != null) {
                if (v.u > this.u.getHeight()) {
                    graphics.setColor(555256);
                    graphics.fillRect(0, 0, v.t, v.u - this.u.getHeight());
                }
                int n = 0;
                while (n < v.t) {
                    graphics.drawImage(this.u, n, v.u, 36);
                    n += this.u.getWidth();
                }
                return;
            }
            graphics.setColor(0);
            graphics.fillRect(0, 0, v.t, v.u);
        }
    }

    public final void b(Graphics graphics) {
        if (this.p != null) {
            this.p.a(graphics, this.c, this.d);
            this.p.c(true);
        }
    }

    public final void u() {
        this.p.n();
    }

    public final void e(int n) {
        switch (n) {
            case 1: {
                if (!this.t) {
                    br[] brArray = this.k.a() ? new br[]{new br("Cập nhật", 21), new br("Tuyệt Chiêu", 20), new br("Rương Đồ", 22), new br("Đóng", 24)} : new br[]{new br("Tuyệt Chiêu", 20), new br("Rương Đồ", 22), new br("Đóng", 24)};
                    this.a(brArray, this.r, null, this.s);
                }
                this.a(this.r, true);
                if (this.t) break;
                this.b(this.s, true);
                return;
            }
            case 2: {
                this.m.f(95);
                this.a(this.q, true);
                return;
            }
            case 3: {
                if (this.m == null) {
                    this.k.a(this, "Có", 5, "Không", 6);
                    ag.b().a(this.h(), false);
                    return;
                }
                this.A();
                return;
            }
            case 4: {
                com.mg.sq.a.s().a((String)null, (il)null, 2000);
                ks.a().c(go.e);
                return;
            }
            case 6: {
                ag.b().e(241226);
                this.A();
                return;
            }
            case 5: {
                ag.b().e(241226);
                this.k.r();
                this.A();
                com.mg.sq.a.s().a((String)null, (il)null);
            }
        }
    }

    public final void f(int n) {
        this.p.f(n);
        switch (n) {
            case 98: {
                this.p.j(30);
                return;
            }
            case 99: {
                this.p.j(-30);
                return;
            }
            case 97: {
                this.p.i(-30);
                return;
            }
            case 96: {
                this.p.i(30);
            }
        }
    }

    public final void e(int n, int n2) {
        this.p.e(n, n2);
    }

    public final void f(int n, int n2) {
        this.p.c(n -= this.c, n2 -= this.d);
    }

    public final void g(int n, int n2) {
        this.p.c(n -= this.c, n2 -= this.d);
    }

    public final boolean g(int n) {
        switch (n) {
            case 20: {
                ib ib2 = new ib();
                ag.b().a(ib2);
                ag.b().a(this.h(), false);
                this.k.a(this, "Có", 5, "Không", 6);
                return true;
            }
            case 21: {
                this.k.r();
                com.mg.sq.a.s().a((String)null, (il)null);
                return true;
            }
            case 22: {
                if (com.mg.sq.a.s().c(241202)) {
                    com.mg.sq.a.s().e(241202);
                }
                hh hh2 = new hh(null, null);
                ag.b().a(hh2);
                ag.b().a(this.h(), false);
                this.k.a(this, "Có", 5, "Không", 6);
                return true;
            }
            case 24: {
                this.k.a(this, "Có", 5, "Không", 6);
                ag.b().a(this.h(), false);
                return true;
            }
        }
        return false;
    }

    public static void a(String string, String string2, int n) {
        if (go.e.equals(string)) {
            if (string2.equals("M99")) {
                ag.b().f(4);
                return;
            }
            go.x = n;
            go.w = string2;
            ag.b().a(5, new Object[]{string2});
        }
    }
}
