package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// Game map or world navigation screen, manages locations and transitions.
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class og
extends an
implements bf,
ik {
    private ay b;
    private oh c;
    jm[] a;
    private String[] d = new String[]{"Hoa Lư", "Kỳ Bố", "Bình Kiều", "Đằng Châu", "Đỗ Động Giang", "Tế Giang", "Siêu Loại", "Tây Phù Liệt", "Đường Lâm", "Cổ Loa", "Tiên Du", "Tam Đái", "Phong Châu", "Hồi Hồ", "Luyện Ngục", "Thiên Môn", "Mẫu Sơn"};

    public og() {
        super(4);
        bd bd2 = new bd("Đăng Xuất", -2);
        og og2 = this;
        og2.b(bd2, true);
        this.a(new ba());
        this.a(this);
        ag.b().l();
        try {
            this.e();
            return;
        }
        catch (OutOfMemoryError outOfMemoryError) {
            if (com.mg.sq.a.m != null) {
                com.mg.sq.a.m.G();
            }
            try {
                this.e();
                return;
            }
            catch (OutOfMemoryError outOfMemoryError2) {
                com.mg.sq.a.s().j(1);
                return;
            }
        }
    }

    private void e() {
        this.c = new oh(this);
        this.b = new ay(2);
        this.b.h(1);
        int n = 0;
        int n2 = 0;
        int n3 = v.t;
        int n4 = v.u - ba.a;
        if (n3 > oh.a(this.c).getWidth()) {
            n = (n3 - oh.a(this.c).getWidth()) / 2;
            n3 = oh.a(this.c).getWidth();
        }
        if (n4 > oh.a(this.c).getHeight()) {
            n2 = (n4 - oh.a(this.c).getHeight()) / 2;
            n4 = oh.a(this.c).getHeight();
        }
        this.b.a(n, n2, n3, n4);
        oh.a(this.c, n, n2);
        this.b.b(this.c);
        this.c.a();
    }

    protected final void r() {
        go.x = 0;
        oh.a(this.c, new cu(oh.b((oh)this.c)[0].a + oh.b((oh)this.c)[0].c / 2, oh.b((oh)this.c)[0].b + oh.b((oh)this.c)[0].d / 2));
        this.c.a();
        pa.a().a("M99", this);
    }

    protected final void a(Graphics graphics) {
        this.b.a(graphics, 0, 0);
    }

    protected final void c() {
        this.b.n();
    }

    protected final void a(int n) {
        this.b.f(n);
    }

    protected final void e(int n) {
        this.b.g(n);
    }

    protected final void g(int n, int n2) {
        this.b.e(n, n2);
    }

    protected final void e(int n, int n2) {
        this.b.c(n, n2);
    }

    protected final void f(int n, int n2) {
        this.b.f(n, n2);
    }

    protected final void s() {
        this.a = null;
        this.b = null;
        this.i = null;
        oh.c(this.c);
        this.c = null;
    }

    public final void d(int n, int n2) {
        if (n2 == -2) {
            com.mg.sq.a.u();
            return;
        }
        if (n2 == -1) {
            og.f();
        }
    }

    private static void f() {
        com.mg.sq.a.s().a((String)null, (il)null, 5000);
        ks.a().b("M99", go.x);
    }

    public final void d() {
    }

    public final void a(jn object, byte[][] object2) {
        com.mg.sq.a.s().v();
        if (object2 == null || ((byte[][])object2).length <= 0) {
            try {
                this.a = ((jn)object).l;
                if (go.x >= 0 && this.a != null && !this.a[go.x].h) {
                    object2 = new bd("Vào Thành", -1);
                    object = this;
                    ((am)object).a((az)object2, true);
                    return;
                }
                this.n();
                return;
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
            }
        }
    }

    static void a(og og2) {
        og.f();
    }

    static String[] b(og og2) {
        return og2.d;
    }
}
