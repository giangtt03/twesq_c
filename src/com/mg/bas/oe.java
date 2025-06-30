package com.mg.bas;
// Decompiled with: Procyon 0.6.0
// Class Version: 1
import com.mg.sq.a;

public final class oe extends nz implements bf
{
    private byte[] b;
    private int c;
    
    public oe(int i, final byte[] array, byte[] b) {
        super((byte)0);
        this.c = i;
        b = b;
        this.b = b;
        this.a((bf)this);
        new cu(10, 22);
        i = this.i();
        super.g -= ba.a;
        this.j(true);
        final gh gh;
        (gh = new gh("Đăng ký")).a_(-1919);
        gh.d(i);
        gh.d(5, 5);
        gh.b(false);
        this.a(gh);
        final gd gd;
        (gd = new gd("Tên đăng nhập")).d(i);
        this.a(gd);
        final gd gd2;
        (gd2 = new gd("Mật Khẩu")).i(1);
        gd2.d(i);
        this.a(gd2);
        final gd gd3;
        (gd3 = new gd("Nhập lại mật khẩu")).i(1);
        gd3.d(i);
        this.a(gd3);
        final gd gd4;
        (gd4 = new gd("Họ tên: ")).d(i);
        this.a(gd4);
        final ga ga;
        (ga = new ga("Ngày sinh ")).d(i);
        this.a(ga);
        final gd gd5;
        (gd5 = new gd("Số điện thoại: ")).h(4);
        gd5.d(i);
        this.a(gd5);
        final fx fx;
        (fx = new fx("Giới tính")).a(0, 0, i, 50);
        final ey ey;
        (ey = new ey("Nam", false)).h(0);
        fx.a(ey);
        final ey ey2;
        (ey2 = new ey("Nữ", false)).h(1);
        fx.a(ey2);
        if (!gr.i) {
            fx.h(0);
        }
        this.a(fx);
        this.g(1);
        final gd gd6;
        (gd6 = new gd(array)).d(i);
        this.a(gd6);
        this.b(10);
        this.a(new ba());
        this.a(new bd("Đăng ký", 1001), true);
        this.b(new bd("Hủy", 1000), true);
        this.d(false);
    }
    
    public final void d(final int n, final int n2) {
        switch (n2) {
            case 1001: {
                if (this.d().trim().equals("")) {
                    final al a;
                    (a = ag.b().a("Chú ý", "Bạn chưa nhập tên nick. Vui lòng nhập tên nick!", "Đóng", 1005, 1)).a(this);
                    ag.b().a(a);
                    return;
                }
                if (this.e().equals(((gd)this.f(3)).a())) {
                    ks.a().a(this.d(), com.mg.bas.g.a(this.b, this.e()), ((gd)this.f(4)).a(), ((gd)this.f(6)).a(), new Long(((ga)this.f(5)).a()), ((gd)this.f(8)).a(), (byte)((fx)this.f(7)).a().q());
                    com.mg.sq.a.s().a(null, (il)null);
                    return;
                }
                final al a2;
                (a2 = ag.b().a("Chú ý", "Mật khẩu không trùng nhau, vui lòng nhập lại!", "Đóng", 1005, 1)).a(this);
                ag.b().a(a2);
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
            default: {
                ag.b().f(this.c);
            }
        }
    }
    
    private String d() {
        return ((gd)this.f(1)).a();
    }
    
    private String e() {
        return ((gd)this.f(2)).a();
    }
    
    public final void a(final String s) {
        if (this.c == 2) {
            final al a;
            (a = ag.b().a("Chú ý", (s == null) ? "Chúc mừng bạn đã đăng ký thành công!" : s, "Đóng", 1006, 1)).a(this);
            ag.b().a(a);
        }
    }
}
