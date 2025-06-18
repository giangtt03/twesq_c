package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class hv
extends al
implements bf {
    private byte k = (byte)113;
    private cu l;
    private boolean m = false;
    private a n = new a(3);
    private String o;
    private int p;
    private String[] q;
    private String[] r;
    private gd s;
    private ex t;
    private ex u;
    private cu v;
    private cu w;
    private String[] x = new String[]{"Để bảo vệ tài khoản, bấm \"Khóa\" để người khác không thể đánh cắp tài khoản của bạn trong trường hợp bị lộ mật khẩu.", "Tài khoản của bạn đã được bảo vệ theo số đt trên."};
    private String[] y = new String[]{"Bạn cần xác thực số đt để được sử dụng các dịch vụ KEN tiện lợi hơn.", "Tài khoản của bạn đã xác thực với số đt trên."};

    /*
     * WARNING - void declaration
     */
    public hv(String object, boolean bl, boolean bl2) {
        super(1);
        boolean var3_5 = bl2;
        this.m = var3_5;
        this.o = object;
        this.a(this);
        this.l = new cu(this.a() + 10, this.c() + 30);
        int n = this.i() - 2 - 2;
        int n2 = this.l.b + 8;
        this.p = bl ? 1 : 0;
        this.s = new gd("Số điện thoại: ");
        this.s.h(4);
        this.s.a(2, n2, n, this.s.f());
        this.s.a((String)object);
        this.s.b(!bl);
        this.n.a(this.s);
        this.v = new cu(2, n2 += this.s.f() + 4);
        this.q = bx.a(this.x[bl ? 1 : 0], this.i() - 10 - 10);
        n2 += this.q.length * bx.c.a() + 4;
        object = bl ? "Mở khóa" : "Khóa";
        int bd2 = bl ? 10 : 11;
        n = bx.d.a((String)object) + 30;
        int n3 = bx.d.a() + 2;
        this.t = new ex((String)object, bd2);
        this.t.a(this.f - n >> 1, n2, n, n3);
        this.n.a(this.t);
        this.w = new cu(2, n2 += this.t.f() + 10);
        this.r = bx.a(this.y[var3_5 != false ? 1 : 0], this.i() - 10 - 10);
        this.u = new ex("Xác thực", 15);
        n = bx.d.a("Xác thực") + 30;
        this.u.a(this.f - n >> 1, n2 += this.r.length * bx.c.a() + 4, n, n3);
        this.k((boolean)var3_5);
        this.b(241216);
        this.a(new ba());
        bd bd3 = new bd("Đóng", 5);
        object = this;
        ((am)object).b(bd3, true);
        this.d(false);
        ((aq)this.n.b(this.p)).d(true);
    }

    public final void c(Graphics graphics) {
        graphics.setColor(0xFFFFFF);
        graphics.fillRect(this.a(), this.c(), this.i(), this.j());
        graphics.drawImage(pc.d, this.a() + this.i(), this.c() + this.j() - 4, 40);
        pc.a(graphics, this.l.a, this.l.b, this.i() - (this.l.a << 1));
        bx.d.c(true);
        bx.d.a(graphics, "Bảo Mật Tài Khoản", this.a() + this.i() / 2, this.c() + 6, 1);
        bx.d.c(false);
        int n = 0;
        while (n < this.n.d()) {
            ((aq)this.n.b(n)).a(graphics, this.a(), this.c());
            ++n;
        }
        bx.a(graphics, bx.c, this.q, this.v.a + 2, this.v.b, this.i(), this.j(), 0);
        bx.a(graphics, bx.c, this.r, this.w.a + 2, this.w.b, this.i(), this.j(), 0);
        if (this.p == 1) {
            n = this.v.b - 4;
            graphics.setColor(7267055);
            graphics.drawRect(this.v.a, n, this.f - this.v.a - this.v.a - 1, this.t.d() + this.t.f() + 4 + 2 - n);
            return;
        }
        if (this.p == 2) {
            n = this.w.b - 4;
            graphics.setColor(7267055);
            graphics.drawRect(this.w.a, n, this.f - this.w.a - this.w.a - 1, this.u.d() + this.u.f() + 4 + 2 - n);
        }
    }

    protected final void g() {
        ((aq)this.n.b(this.p)).n();
    }

    public final void i(boolean bl) {
        super.i(bl);
    }

    public final void d(int n, int n2) {
        switch (n2) {
            case 0: {
                return;
            }
            case 5: {
                ag.b().a(false);
                return;
            }
            case 11: {
                al al2 = this.s.a() == null ? ag.b().a("Chú ý", "Bạn chưa nhập số điện thoại!", "Đóng", 13, 1) : ag.b().a("Chú ý", "Bạn có chắc muốn khóa tài khoản với số đt đang sử dụng không?", "Có", 12, "Không", 13, 1);
                al2.a(this);
                al2.b(this.k);
                ag.b().a(al2, false);
                return;
            }
            case 10: {
                al al3 = ag.b().a("Chú ý", "Bạn có chắc là muốn mở khóa không? Chú ý khi mở khóa, tài khoản của bạn có thể bị người khác đánh cắp.", "Có", 114, "Không", 13, 1);
                al3.a(this);
                al3.b(this.k);
                ag.b().a(al3, false);
                return;
            }
            case 15: {
                al al4 = this.s.a() == null ? ag.b().a("Chú ý", "Bạn chưa nhập số điện thoại!", "Đóng", 13, 1) : ag.b().a("Chú ý", "Bạn có chắc muốn xác thực tài khoản với số đt đang sử dụng không?", "Có", 17, "Không", 13, 1);
                al4.a(this);
                al4.b(this.k);
                ag.b().a(al4, false);
                return;
            }
            case 13: {
                ag.b().e(this.k);
                return;
            }
            case 17: {
                com.mg.sq.a.c(new hw(this));
                return;
            }
            case 12: {
                if (this.s.a() == null) break;
                com.mg.sq.a.a(new hx(this));
                return;
            }
            case 114: {
                com.mg.sq.a.b(new hy(this));
                return;
            }
            case 18: {
                com.mg.sq.a.c(new hz(this));
                return;
            }
            default: {
                ag.b().a(this.h(), false);
            }
        }
    }

    public final void d(int n) {
    }

    public final void c(int n) {
        if ((aq)this.n.b(this.p) instanceof gd) {
            ((aq)this.n.b(this.p)).f(n);
        }
        int n2 = this.p;
        switch (n) {
            case 98: {
                if (this.p >= this.n.d() - 1) break;
                ++this.p;
                break;
            }
            case 99: {
                if (this.p <= 0) break;
                --this.p;
                break;
            }
            case 95: {
                int n3;
                int n4;
                hv hv2;
                aq aq2 = (aq)this.n.b(this.p);
                if (aq2 instanceof ex) {
                    hv2 = this;
                    n4 = -1;
                    n3 = ((ex)aq2).a();
                } else {
                    if (!(aq2 instanceof ey)) break;
                    boolean bl = ((ey)aq2).a();
                    hv2 = this;
                    n4 = -1;
                    n3 = bl ? 16 : 15;
                }
                hv2.d(n4, n3);
            }
        }
        if (n2 != this.p) {
            Object object = (aq)this.n.b(n2);
            if (object instanceof gd && !((String)(object = ((gd)object).a())).equals(this.o)) {
                ks.a().p((String)object);
                com.mg.sq.a.s().a((String)null, (il)null);
            }
            ((aq)this.n.b(n2)).d(false);
            ((aq)this.n.b(this.p)).d(true);
        }
    }

    public final void a(String string, boolean bl, boolean n) {
        this.m = n;
        this.o = string;
        this.s.a(string);
        this.s.b(!bl);
        int n2 = this.p;
        this.j(bl);
        this.k(n != 0);
        this.p = n2;
        n = 0;
        while (n < this.n.d()) {
            aq aq2 = (aq)this.n.b(n);
            if (n == n2) {
                aq2.d(true);
            } else {
                aq2.d(false);
            }
            ++n;
        }
    }

    public final void j(boolean bl) {
        this.s.b(!bl);
        String string = bl ? "Mở khóa" : "Khóa";
        int n = bl ? 10 : 11;
        int n2 = bx.d.a(string) + 30;
        int n3 = bx.d.a() + 2;
        int n4 = this.s.d() + this.s.f() + 4;
        this.v = new cu(2, n4);
        this.q = bx.a(this.x[bl ? 1 : 0], this.i() - 10 - 10);
        this.t = new ex(string, n);
        this.t.a(this.f - n2 >> 1, n4 += this.q.length * bx.c.a() + 4, n2, n3);
        this.n.a(this.t, 1);
        this.w = new cu(2, n4 += this.t.f() + 10);
        this.k(this.m);
        if (!bl) {
            ((aq)this.n.b(this.p)).d(false);
            this.p = 0;
        }
        ((aq)this.n.b(this.p)).d(true);
    }

    public final void k(boolean bl) {
        this.m = bl;
        this.r = bx.a(this.y[this.m ? 1 : 0], this.i() - 10 - 10);
        int n = this.w.b + this.r.length * bx.c.a() + 4;
        this.u.a(this.u.c(), n, this.u.e(), this.u.f());
        this.u.a(!bl);
        if (this.u.i()) {
            bl = false;
            n = 0;
            while (n < this.n.d()) {
                if (this.n.b(n).equals(this.u)) {
                    bl = true;
                    break;
                }
                ++n;
            }
            if (!bl) {
                this.n.a(this.u);
                return;
            }
        } else {
            this.p = this.p == this.n.d() - 1 ? this.p - 1 : this.p;
            ((aq)this.n.b(this.p)).d(true);
            this.n.b(this.u);
            this.u.d(false);
        }
    }

    public final void a(int n, int n2) {
        n -= this.c;
        n2 -= this.d;
        int n3 = 0;
        while (n3 < this.n.d()) {
            aq aq2 = (aq)this.n.b(n3);
            if (n > aq2.c() && n < aq2.c() + aq2.e() && n2 > aq2.d() && n2 < aq2.d() + aq2.f()) {
                String string;
                if (this.p == n3) {
                    this.c(95);
                    return;
                }
                aq2 = (aq)this.n.b(this.p);
                if (aq2 instanceof gd && !(string = ((gd)aq2).a()).equals(this.o)) {
                    ks.a().p(string);
                    com.mg.sq.a.s().a((String)null, (il)null);
                }
                ((aq)this.n.b(this.p)).d(false);
                this.p = n3;
                ((aq)this.n.b(this.p)).d(true);
                return;
            }
            ++n3;
        }
    }

    static byte a(hv hv2) {
        return hv2.k;
    }
}
