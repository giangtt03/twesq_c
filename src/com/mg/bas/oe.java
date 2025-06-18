package com.mg.bas;
// Registration or account creation screen, manages user input and validation.
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;

public final class oe
extends nz
implements bf {
    private byte[] b;
    private int c;

    public oe(int n, byte[] object, byte[] object2) {
        super((byte)0);
        this.c = n;
        oe oe2 = this;
        this.b = object2;
        this.a(this);
        new cu(10, 22);
        int n2 = this.i();
        this.g -= ba.a;
        this.j(true);
        gh gh2 = new gh("Đăng ký");
        object2 = gh2;
        gh2.a_(-1919);
        ((aq)object2).d(n2);
        ((gh)object2).d(5, 5);
        ((aq)object2).b(false);
        this.a((aq)object2);
        object2 = new gd("Tên đăng nhập");
        ((gd)object2).d(n2);
        this.a((aq)object2);
        object2 = new gd("Mật Khẩu");
        ((gd)object2).i(1);
        ((gd)object2).d(n2);
        this.a((aq)object2);
        object2 = new gd("Nhập lại mật khẩu");
        ((gd)object2).i(1);
        ((gd)object2).d(n2);
        this.a((aq)object2);
        object2 = new gd("Họ tên: ");
        ((gd)object2).d(n2);
        this.a((aq)object2);
        object2 = new ga("Ngày sinh ");
        ((ga)object2).d(n2);
        this.a((aq)object2);
        object2 = new gd("Số điện thoại: ");
        ((gd)object2).h(4);
        ((gd)object2).d(n2);
        this.a((aq)object2);
        fx fx2 = new fx("Giới tính");
        fx2.a(0, 0, n2, 50);
        object2 = new ey("Nam", false);
        ((ey)object2).h(0);
        fx2.a((ey)object2);
        object2 = new ey("Nữ", false);
        ((ey)object2).h(1);
        fx2.a((ey)object2);
        if (!gr.i) {
            fx2.h(0);
        }
        this.a(fx2);
        this.g(1);
        object2 = new gd((byte[])object);
        ((gd)object2).d(n2);
        this.a((aq)object2);
        this.b(10);
        this.a(new ba());
        object = new bd("Đăng ký", 1001);
        oe oe3 = this;
        oe3.a((az)object, true);
        object = new bd("Hủy", 1000);
        oe3 = this;
        oe3.b((az)object, true);
        this.d(false);
    }

    public final void d(int n2, int n3) {
        switch (n3) {
            case 1001: {
                if (this.d().trim().equals("")) {
                    al al2 = ag.b().a("Chú ý", "Bạn chưa nhập tên nick. Vui lòng nhập tên nick!", "Đóng", 1005, 1);
                    al2.a(this);
                    ag.b().a(al2);
                    return;
                }
                am am2 = this;
                if (this.e().equals(((gd)((nz)am2).f(3)).a())) {
                    oe oe2 = this;
                    am2 = oe2;
                    oe oe3 = this;
                    am2 = oe3;
                    am2 = this;
                    Long l = new Long(((ga)((nz)am2).f(5)).a());
                    oe oe4 = this;
                    am2 = oe4;
                    am2 = this;
                    ks.a().a(this.d(), g.a(this.b, this.e()), ((gd)oe2.f(4)).a(), ((gd)oe3.f(6)).a(), l, ((gd)oe4.f(8)).a(), (byte)((fx)((nz)am2).f(7)).a().q());
                    com.mg.sq.a.s().a((String)null, (il)null);
                    return;
                }
                am2 = ag.b().a("Chú ý", "Mật khẩu không trùng nhau, vui lòng nhập lại!", "Đóng", 1005, 1);
                am2.a(this);
                ag.b().a((al)am2);
                return;
            }
            case 1006: {
                go.e = this.d();
                go.f = this.e();
                ag.b().f(this.c);
                com.mg.sq.a.s().l();
                return;
            }
            case 1005: {
                ag.b().a(false);
                return;
            }
        }
        ag.b().f(this.c);
    }

    private String d() {
        return ((gd)this.f(1)).a();
    }

    private String e() {
        return ((gd)this.f(2)).a();
    }

    public final void a(String object) {
        if (this.c == 2) {
            object = ag.b().a("Chú ý", (String)(object == null ? "Chúc mừng bạn đã đăng ký thành công!" : object), "Đóng", 1006, 1);
            ((am)object).a(this);
            ag.b().a((al)object);
        }
    }
}
