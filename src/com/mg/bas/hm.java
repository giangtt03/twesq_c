package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class hm
extends he
implements af,
bf,
bq {
    private ay m;
    private aw n;
    private bs o;
    private az p;
    private az q;
    private az r;
    private String s;

    public hm(String[] object) {
        this.b(241218);
        this.a(this);
        this.a(new ba());
        int n = this.f - 10 - 10;
        this.g -= ba.a;
        bb bb2 = new bb("Danh sách số điện thoại có thể nạp KEN", n, bx.d);
        bb2.a_(10, 10);
        this.a(bb2);
        int n2 = 10 + (bb2.f() + 6);
        ff ff2 = new ff("", 20, 4);
        ff2.d(true);
        ff2.a(10, n2, n / 2, 20);
        this.a((bf)ff2);
        int n3 = bx.d.a("Thêm") + 30;
        ex ex2 = new ex("Thêm", 1);
        ex2.a(ff2.c() + ff2.e() + 10, n2, n3, 20);
        this.a(ex2);
        this.m = new ay(1);
        n = n - 3 - 3;
        this.m.a(this.f - n >> 1, n2 += ex2.f() + 10 + 3, n, this.g - n2 - 10);
        this.m.e(false);
        this.n = new aw();
        this.n.a((af)this);
        this.m.b(this.n);
        this.a((String[])object);
        this.a(this.m);
        this.m.d(false);
        this.m.f();
        this.a(this.c, this.d, this.f, this.g);
        this.p = new gb(2, 0);
        this.r = new gb(3, 2);
        this.q = new gb(0, 3);
        this.a(com.mg.sq.a.n);
        this.a(this.p, true);
        this.b(this.q, true);
        this.f(1);
    }

    public final void d(int n2, int n3) {
        if (this.h(n3)) {
            this.t();
            return;
        }
        switch (n3) {
            case 1: {
                Object object = (ff)this.k.b(1);
                String string = ((ff)object).r();
                if (string == null || string.equals("")) {
                    return;
                }
                aw aw2 = (aw)((ay)this.k.b(3)).w();
                ((ff)object).c("");
                int n4 = 0;
                while (n4 < aw2.a()) {
                    object = ((bb)aw2.o(n4)).a();
                    if (((o)object).i().equals(string)) {
                        return;
                    }
                    ++n4;
                }
                du.a().f(string);
                com.mg.sq.a.s().a((String)null, (il)null);
                return;
            }
            case 4: {
                du.a().g(this.s);
                this.s = null;
                com.mg.sq.a.s().a((String)null, (il)null);
                return;
            }
            case 0: {
                if (this.o != null) {
                    this.t();
                    return;
                }
                ag.b().a(this.h(), false);
                return;
            }
            case 2: {
                hm hm2 = this;
                bs bs2 = new bs();
                hm hm3 = hm2;
                if (hm3.l == 3) {
                    bs2.a(new br("Bỏ ra", 111));
                }
                bs2.a(new br("Thêm", 113));
                bs2.a(new br("Đóng", 112));
                int n5 = bs2.e() > bs2.f() ? bs2.e() : bs2.f();
                bs2.a_(-n5, hm2.j() - bs2.f() + n5);
                bs2.d(0, v.u - ba.a - bs2.f());
                bs2.a((af)hm2);
                hm2.a(bs2);
                az az2 = hm2.q;
                hm hm4 = hm2;
                ((am)hm4).b(az2, true);
                az2 = hm2.r;
                hm4 = hm2;
                ((am)hm4).a(az2, true);
                bs2.c(com.mg.sq.a.n);
                return;
            }
            case 3: {
                if (this.o == null) break;
                this.h(this.o.r().c());
            }
        }
    }

    protected final void a(Graphics graphics) {
        super.a(graphics);
        if (this.m != null) {
            int n2 = 7070703;
            if (this.m.m()) {
                n2 = 0xEE5C5C;
                k k2 = this.m.q();
                aq aq2 = this.n.u();
                if (aq2 != null) {
                    graphics.setColor(10223465);
                    graphics.fillRect(this.m.c() - k2.a + this.c - 2, aq2.d() - k2.b + this.m.d() + this.d - 2, this.m.e() + 4, aq2.f());
                }
            }
            pc.a(graphics, this.m.c() + this.c - 3, this.m.d() + this.d - 6, this.m.e() + 3 + 3, this.m.f() + 3 + 3, n2, -1);
        }
    }

    public final void c(Graphics graphics) {
        super.c(graphics);
        if (this.o != null) {
            this.o.a(graphics, 0, 0);
        }
    }

    private void a(bs bs2) {
        this.o = bs2;
        this.e(true);
    }

    private void t() {
        this.o = null;
        az az2 = this.q;
        hm hm2 = this;
        ((am)hm2).b(az2, true);
        az2 = this.p;
        hm2 = this;
        ((am)hm2).a(az2, true);
        this.e(true);
    }

    protected final void g() {
        super.g();
        if (this.o != null) {
            this.o.n();
            this.e(true);
        }
    }

    public final void a(ae ae2) {
    }

    public final void b(aq object, int n2) {
        object = ((aw)object).o(n2);
        k kObj = new k(this.m.c() - ((k)this.m.q()).a + this.c, ((aq)object).d() - ((k)this.m.q()).b + this.m.d() + this.d, this.m.e(), ((aq)object).f());
        bs bs2 = new bs();
        bs2.a(new br("Bỏ ra", 111));
        int n3 = kObj.a + kObj.c + (kObj.c - bs2.e()) / 2;
        int n4 = kObj.b + kObj.d + kObj.d;
        if (n4 + bs2.f() > v.u - ba.a) {
            n4 = v.u - ba.a - bs2.f();
        }
        bs2.a_(kObj.c + this.f + bs2.e(), n4);
        bs2.d(n3 < kObj.c ? kObj.c : (n3 + bs2.e() > kObj.c + this.f ? kObj.c + this.f - bs2.e() : n3), n4);
        bs2.a((bf)this);
        bs2.a_(1);
        super.a(bs2);
        this.b(this.q, true);
        this.a(this.r, true);
    }

    public final void a(aq aq2, int n2) {
    }

    public final void a(aq aq2, int n2, int n3) {
    }

    private boolean h(int n2) {
        switch (n2) {
            case 111: {
                o o2 = ((bb)this.n.u()).a();
                this.s = o2.i();
                this.e(true);
                this.d(-1, 4);
                return true;
            }
            case 112: {
                ag.b().a(this.h(), false);
                return true;
            }
            case 113: {
                this.f(1);
                this.e(true);
                return true;
            }
        }
        return false;
    }

    public final void c(int n2) {
        if (this.o != null) {
            boolean bl;
            int n3 = n2;
            az[] azArray = this.o.a();
            hm hm2 = this;
            if (n3 == 94 && azArray[0] != null && azArray[0].b()) {
                if (hm2.i != null) {
                    hm2.i.d(-1, azArray[0].a());
                }
                bl = true;
            } else if (n3 == 95 && azArray[1] != null && azArray[1].b()) {
                if (hm2.i != null) {
                    hm2.i.d(-1, azArray[1].a());
                }
                bl = true;
            } else if (n3 == 93 && azArray[2] != null && azArray[2].b()) {
                if (hm2.i != null) {
                    hm2.i.d(-1, azArray[2].a());
                }
                bl = true;
            } else {
                bl = false;
            }
            if (bl) {
                v.c();
                return;
            }
            if (this.o.f(n2)) {
                return;
            }
            this.t();
            return;
        }
        super.c(n2);
    }

    public final void a(int n2, int n3) {
        if (this.o != null) {
            boolean bl;
            block6: {
                int n4 = n3;
                int n5 = n2;
                az[] azArray = this.o.a();
                hm hm2 = this;
                int n6 = 0;
                while (n6 < azArray.length) {
                    if (azArray[n6] != null && azArray[n6].a(n5, n4)) {
                        if (hm2.i != null) {
                            hm2.i.d(-1, azArray[n6].a());
                        }
                        bl = true;
                        break block6;
                    }
                    ++n6;
                }
                bl = false;
            }
            if (bl) {
                return;
            }
            if (this.o.c(n2, n3)) {
                return;
            }
            this.t();
            return;
        }
        super.a(n2, n3);
    }

    public final void a(String[] stringArray) {
        this.n.q();
        int n2 = 0;
        while (n2 < stringArray.length) {
            this.n.a(stringArray[n2]);
            ++n2;
        }
    }
}
