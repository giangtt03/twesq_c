package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class oo
extends fb
implements bf,
bg,
bu {
    private Image p;
    private ay q;
    private String r;
    private int s = -1;
    private boolean t;
    private boolean u;
    private int[] v;
    private fu w;
    private int x;
    private String[] y = new String[]{"Bạn đang làm gì?", "Bạn đang nghĩ gì?", "Hôm nay có gì HOT?", "Ngoài trời đang...?", "Bạn đang xem gì?", "Hôm nay có gì vui?", "Nếu có 1 điều ước..."};

    public oo(int n, int n2, String string) {
        super(108, 6, string, false);
        this.a(0, 0, 100, 100);
        this.q = new ay(0);
        this.q.h(1);
        this.q.a(0, 0, com.mg.bas.v.t, com.mg.bas.v.u - ba.a);
        this.q.b(this);
        this.a(new ba());
        this.a(new gb(-1, 0));
        this.b(new gb(-2, 1));
        this.c(com.mg.sq.a.n);
        this.a((aq)this);
        this.v = null;
    }

    public final void a(String string) {
        if (com.mg.sq.a.m != null) {
            int n = string.hashCode();
            if (pd.b(n)) {
                this.r = string;
                this.j(n);
                return;
            }
            du.a().b(string, (short)this.i);
        }
    }

    private void j(int n) {
        byte[] byArray = pd.c(n);
        if (byArray != null) {
            ee ee2 = new ee();
            int n2 = ((byArray[4] & 0xFF) << 24) | ((byArray[5] & 0xFF) << 16) | ((byArray[6] & 0xFF) << 8) | (byArray[7] & 0xFF);
            String str = new String(byArray, 4, n2);
            ee2.a(str);
            ee2.h = new byte[byArray.length - 4 - n2];
            System.arraycopy(byArray, n2 + 4, ee2.h, 0, ee2.h.length);
            this.a(ee2);
        }
    }

    public final void a(ee ee2) {
        block5: {
            this.v = null;
            this.p = null;
            this.s = -1;
            this.u = false;
            this.t = false;
            try {
                this.r = ee2.a();
                // NOTE: The following lines require J2ME libraries for Image:
                this.p = com.mg.bas.f.a(ee2.h);
                this.q.o();
                if (com.mg.sq.a.m != null) {
                    a a2 = com.mg.sq.a.m.p.p;
                    int n = 0;
                    while (n < a2.d()) {
                        ee ee3 = (ee)a2.b(n);
                        if (ee3.a().equals(ee2.a())) {
                            this.s = n;
                            break;
                        }
                        ++n;
                    }
                    com.mg.sq.a.m.e(true);
                    return;
                }
            }
            catch (OutOfMemoryError outOfMemoryError) {
                this.p = null;
                this.r = null;
                if (com.mg.sq.a.m == null) break block5;
                com.mg.sq.a.m.D();
                System.gc();
                com.mg.sq.a.m.e_();
            }
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.k()) {
            return;
        }
        if (this.p != null) {
            if (this.p.getWidth() < com.mg.bas.v.t || this.p.getHeight() < com.mg.bas.v.u) {
                graphics.setColor(0xFFFFFF);
                graphics.fillRect(0, 0, com.mg.bas.v.t, com.mg.bas.v.u);
            }
            k k2 = this.q.q();
            if (!this.t && !this.u) {
                graphics.drawImage(this.p, -k2.a, -k2.b, 0);
            } else {
                n2 = this.t && this.u ? 1 : (this.t ? 2 : 3);
                graphics.drawRegion(this.p, 0, 0, this.p.getWidth(), this.p.getHeight(), n2, -k2.a, -k2.b, 0);
            }
            if (this.s > 0) {
                com.mg.sq.a.h.a(graphics, "<*", 0, (com.mg.bas.v.u - ba.a) / 2, 0);
            }
            if (this.s >= 0 && this.s < com.mg.sq.a.m.p.p.d() - 1) {
                com.mg.sq.a.h.a(graphics, "#>", com.mg.bas.v.t, (com.mg.bas.v.u - ba.a) / 2, 2);
            }
        } else {
            graphics.setColor(0xFFFFFF);
            graphics.fillRect(0, 0, com.mg.bas.v.t, com.mg.bas.v.u);
            bx.d.c(true);
            bx.d.a(graphics, "Chọn hình muốn xem!", com.mg.bas.v.t / 2, com.mg.bas.v.u / 2 - ba.a, 1);
            bx.d.c();
        }
        this.c = false;
    }

    public final boolean f(int n) {
        if (this.s >= 0) {
            if (n == 142 && this.s > 0) {
                --this.s;
                this.a(((ee)com.mg.sq.a.m.p.p.b(this.s)).a());
                return true;
            }
            if (n == 135 && this.s < com.mg.sq.a.m.p.p.d() - 1) {
                ++this.s;
                this.a(((ee)com.mg.sq.a.m.p.p.b(this.s)).a());
                return true;
            }
        }
        return super.f(n);
    }

    public final boolean c(int n, int n2) {
        if (this.s < 0) {
            return false;
        }
        k k2 = this.q.r();
        n -= k2.a;
        int n3 = (com.mg.bas.v.u - ba.a) / 2 - 30;
        if ((n2 -= k2.b) >= n3 && n2 <= n3 + 60) {
            if (n < 40) {
                this.f(142);
                return true;
            }
            if (n > com.mg.bas.v.t - 40) {
                this.f(135);
                return true;
            }
        }
        return super.c(n, n2);
    }

    public final void x() {
        this.q.c(true);
    }

    public final void y() {
        this.p = null;
    }

    private static void a(String string, String string2, int n) {
        du.a().b(string, string2, (short)n);
        com.mg.sq.a.E();
    }

    public final void d(int n, int n2) {
        switch (n2) {
            case 9991: {
                Object object = (he)com.mg.sq.a.s().d(-989858);
                if (object == null) {
                    oo.a("", null, -1);
                    return;
                }
                String string = ((ff)((he)object).e(1)).r().toLowerCase().trim();
                int n3 = -1;
                if ((object = ((he)object).e(4)) != null && object instanceof fu) {
                    n3 = ((fu)object).r() + 1;
                }
                if (com.mg.bas.i.b(string)) {
                    com.mg.sq.a.t("Bạn chưa nhập nội dung ME");
                    return;
                }
                oo.a(string, this.r, (short)n3);
                this.w = null;
                this.x = 0;
                com.mg.sq.a.s().a(-989858, false);
                return;
            }
            case 9992: {
                this.w = null;
                this.x = 0;
                com.mg.sq.a.s().a(-989858, false);
                return;
            }
            case 9993: {
                hp hp2 = new hp((byte)2);
                hp2.e(this.w.r());
                hp2.f(this.x);
                hp2.w();
                hp2.a(this);
                ag.b().a(hp2, false);
                return;
            }
            case -8882: {
                ag.b().e(999999223);
                return;
            }
            case -8881: {
                hp hp3 = (hp)com.mg.sq.a.s().d(999999223);
                if (this.w == null || hp3 == null || oy.f == null) break;
                this.x = hp3.v();
                this.w.a(oy.f);
                this.w.h(this.x);
                this.w.b(oy.a[this.x], oy.b[this.x], oy.c[this.x], oy.d[this.x]);
                hp3.e(this.x);
                ag.b().e(999999223);
                return;
            }
            case -8883: {
                hp hp4 = (hp)com.mg.sq.a.s().d(999999223);
                if (hp4 != null) {
                    hp4.u();
                    this.w.a((Image)null);
                    this.w.h(-1);
                }
                ag.b().e(999999223);
                return;
            }
            default: {
                if (n2 == -1) {
                    oo oo2 = this;
                    bs bs2 = new bs();
                    bs2.a(new gb(1, 2));
                    bs2.b(new gb(2, 3));
                    br brLat = new br("Lật", 10802);
                    brLat.a(new br[]{new br("Dọc", 10801), new br("Ngang", 10803), new br("Thông thường", 10800)});
                    br br2 = new br("Thao tác", 10804);
                    br2.a(new br[]{new br("Gửi Me", 10809), new br("Gửi tiếp", 10805), new br("Chép nội dung", 10806)});
                    br[] brArray;
                    if (oo2.v != null && oo2.v.length > 0) {
                        br br3 = new br("Hình đã tải", 10807);
                        br[] brArray2 = new br[oo2.v.length];
                        int n4 = 0;
                        while (n4 < brArray2.length) {
                            brArray2[n4] = new br("Hình " + (n4 + 1), 10807);
                            ++n4;
                        }
                        br3.a(brArray2);
                        brArray = new br[]{brLat, br3, br2, new br("Đóng", 10808)};
                    } else {
                        brArray = new br[]{brLat, br2, new br("Đóng", 10808)};
                    }
                    if (com.mg.sq.a.m != null) {
                        brArray = com.mg.sq.a.m.a(brArray, brArray.length - 1);
                        brArray = oi.b(brArray, brArray.length - 1);
                    }
                    bs2.a(brArray);
                    int n5 = bs2.e() > bs2.f() ? bs2.e() : bs2.f();
                    bs2.a_(-n5, com.mg.bas.v.u);
                    bs2.d(0, com.mg.bas.v.u - ba.a - bs2.f());
                    bs2.a((bf)oo2);
                    oo2.a(bs2);
                    return;
                }
                if (n2 == -2) {
                    if (com.mg.sq.a.m == null || com.mg.sq.a.m.l() == null) break;
                    fc fc2 = (fc)com.mg.sq.a.m.l();
                    fc2.a();
                    return;
                }
                if (n2 == 2) {
                    this.t();
                    return;
                }
                if (n2 != 1) break;
                this.l.f(95);
            }
        }
    }

    public final void a(int n, int n2, Object object) {
        if (object == null) {
            return;
        }
        Object object2 = (br)object;
        switch (n2) {
            case 10801: {
                this.u = !this.u;
                this.q.c(true);
                break;
            }
            case 10802: {
                break;
            }
            case 10803: {
                this.t = !this.t;
                this.q.c(true);
                break;
            }
            case 10800: {
                this.t = false;
                this.u = false;
                this.q.c(true);
                break;
            }
            case 10804: {
                break;
            }
            case 10805: {
                com.mg.sq.a.d("Nhập nick muốn gửi", this.r);
                break;
            }
            case 10809: {
                Object object3 = this.y[cv.a(this.y.length)];
                object2 = this;
                object3 = com.mg.sq.a.a((String)object3, null, "Xong", 9991, "Hủy", 9992, 9993, (bf)object2);
                ((am)object3).b(-989858);
                ((oo)object2).w = (fu)((he)object3).e(4);
                object2 = object3;
                ag.b().a((al)object2);
                break;
            }
            case 10806: {
                ff.i = "#" + this.r + "#";
                break;
            }
            case 10807: {
                int n3;
                n2 = ((br)object2).b().lastIndexOf(32);
                if (n2 < 0 || (n3 = Integer.parseInt(((br)object2).b().substring(n2 + 1))) > this.v.length) break;
                this.j(this.v[n3 - 1]);
                break;
            }
            case 10808: {
                this.p = null;
                this.r = null;
                if (com.mg.sq.a.m == null) break;
                com.mg.sq.a.m.D();
                break;
            }
            case 11399: {
                if (com.mg.sq.a.m == null) break;
                com.mg.sq.a.m.b(((br)object2).b());
                break;
            }
            default: {
                if (com.mg.sq.a.m == null) break;
                com.mg.sq.a.m.j(n2);
            }
        }
        this.t();
    }

    public final void a() {
        this.s = -1;
        this.q.c(true);
    }

    public final g v() {
        int n2 = com.mg.bas.v.t;
        int n3 = com.mg.bas.v.u - ba.a;
        if (this.p != null) {
            if (this.p.getHeight() > n3) {
                n3 = this.p.getHeight();
            }
            if (this.p.getWidth() > n2) {
                n2 = this.p.getWidth();
            }
        }
        return new g(n2, n3);
    }

    public final int w() {
        return 10;
    }
}
