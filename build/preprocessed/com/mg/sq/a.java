// Decompiled with: CFR 0.152
// Class Version: 1
package com.mg.sq;

import com.mg.smsgame.MGMIDlet;
import com.mg.sq.b;
import javax.microedition.lcdui.Image;

public final class a
extends ah
implements bn,
ih,
kq {
    private il p;
    public static d g;
    public static d h;
    public static String i;
    public static byte j;
    private static String q;
    private static a r;
    public static byte k;
    public static String[] l;
    public static oi m;
    private cp s;
    public static final az n;
    private int t;
    public static boolean o;
    private static String u;
    private static String[] v;
    private static String[] w;

    static {
        i = null;
        j = (byte)-1;
        r = new a();
        l = null;
        m = null;
        n = new ge();
        o = false;
    }

    public static void q() {
        g = new by(4863);
        g.a(4863);
        h = new iff(new int[]{0xFFFFFF, 0xFE0000});
        h.a(0xFE0000);
        if (v.t >= 230 && v.u >= 310 || v.u > v.t) {
            k = 0;
            return;
        }
        k = 1;
    }

    public static void r() {
        g = h = bx.d;
        oy.b();
    }

    public static a s() {
        return (a)ag.b();
    }

    public a() {
        this.a(new ax(5));
    }

    public static boolean t() {
        return v.O;
    }

    protected final void h() {
        if (m != null) {
            m.H();
        }
        ks.a().c();
        if (o) {
            du.a().g();
        }
    }

    private boolean n(int n) {
        return this.a != null && this.a.h() == 1;
    }

    public static void a(am am2) {
        if (am2 == null) {
            return;
        }
        com.mg.sq.a.i(am2.h());
    }

    public static void i(int n) {
        if (!(v.N && (!v.ah || !v.O))) {
            return;
        }
        switch (n) {
            case 0: {
                co.b().a("battle", -1);
                co.b().a(155141);
                co.b().e();
                return;
            }
            case 2: {
                co.b().a("title", 1);
                co.b().a(250000);
                co.b().e();
                return;
            }
        }
        co.b().a("lv1", -1);
        co.b().a(139051);
        co.b().e();
    }

    public final void p() {
        this.d = new ab();
        this.c = new ac();
    }

    protected final an a(int n, int n2, Object[] object) {
        ct.b("Before createScreen(" + n + ", " + n2 + ")");
        v.ag = false;
        Object object2 = null;
        switch (n2) {
            case 1: {
                object2 = new oa();
                break;
            }
            case 2: {
                object2 = new ob();
                break;
            }
            case 3: {
                object2 = new nw();
                break;
            }
            case 4: {
                object2 = new og();
                break;
            }
            case 6: {
                object2 = new nv();
                break;
            }
            case 5: {
                if (object != null && ((Object[])object).length > 0) {
                    object2 = (String)object[0];
                    return new nx((String)object2);
                }
                object2 = new nx();
                break;
            }
            case 7: {
                int n3 = (Integer)object[0];
                object2 = new ny(n3);
                if (((Object[])object).length == 2) {
                    ((ny)object2).a((String)object[1]);
                }
                break;
            }
            case 8: {
                object = (String)object[0];
                object2 = new of((String)object);
                break;
            }
            case 9: {
                object2 = new od(n);
                break;
            }
            case 10: {
                if (object == null || ((Object[])object).length <= 0) {
                    return null;
                }
                object2 = (byte[])object[0];
                object = (byte[])object[1];
                object2 = new oe(n, (byte[])object2, (byte[])object);
            }
        }
        ct.b("After createScreen(" + n + ", " + n2 + ")");
        return object2;
    }

    public static void a(be be2) {
        ci.a("KS " + go.e, "8031", be2);
    }

    public static void b(be be2) {
        ci.a("MS " + go.e, "8031", be2);
    }

    public static void c(be be2) {
        ci.a("XT " + go.e, "8031", be2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void d(int var1_1, int var2_14) {
        super.d(var1_1, var2_14);
        switch (var2_14) {
            case 12357: {
                this.a(false);
                this.S();
                return;
            }
            case 12356: {
                this.a(false);
                com.mg.sq.a.c(null);
                return;
            }
            case 12353: 
            case 12354: {
                MGMIDlet.d();
                MGMIDlet.b("1900588883");
                if (var2_14 != 12353) break;
                this.a(false);
                return;
            }
            case 12352: {
                this.a(false);
                this.N();
                return;
            }
            case 12350: {
                this.a(false);
                return;
            }
            case 12349: {
                var1_2 = MGMIDlet.d();
                var1_2.notifyDestroyed();
                return;
            }
            case 12361: {
                pa.a().c();
                var1_3 = MGMIDlet.d();
                var1_3.notifyDestroyed();
                return;
            }
            case 12345: {
                this.v();
                if (this.p == null) break;
                this.p.t();
                this.p = null;
                return;
            }
            case 12347: {
                com.mg.sq.a.X();
                return;
            }
            case 100: {
                ks.a().f();
                ag.b().a(false);
                return;
            }
            case 203: {
                ks.a().l();
                ag.b().a(false);
                return;
            }
            case 102: {
    if (!this.c(-241249)) {
        return;
    }
    he var1_4 = (he)this.d(-241249);
    ff var3_17 = (ff)var1_4.e(1);
    String var2_15 = var3_17.r().toLowerCase().trim();
    String message = null;

    if (i.b(var2_15)) {
        message = "Bạn chưa nhập tên đối thủ.";
    } else if (var2_15.equals(go.e)) {
        message = "Nhập trùng tên. Vui lòng nhập lại!!!";
    } else {
        var3_17 = (ff)var1_4.e(5);
        long var8_19 = 0L;
        if (!var3_17.r().equals("")) {
            var8_19 = Integer.parseInt(var3_17.r()) * 1000;
        }
        if (go.k.aa) {
            message = "Bạn đang ở bật chế độ chặn khiêu chiến. Bạn không thể chiến đấu ngay lúc này. Hãy tắt chế độ chặn khiêu chiến để chiến đấu nào! (Hướng dẫn: Bạn hãy chọn Menu > Hỗ trợ > Cài đặt)";
        } else if (go.s > -1L && var8_19 > go.s) {
            message = "Vượt quá số tiền bạn đang có. Vui lòng thử lại!!!";
        } else {
            if (go.s < 0L) {
                var8_19 = 0L;
            }
            ag.b().a(false);
            ey var3_ey = (ey)var1_4.e(6);
            ey var4_ey = (ey)var1_4.e(7);
            ey var1_ey = (ey)var1_4.e(10);
            ks.a().a(var2_15, "Ngon thì nhào vô đây!", var3_ey.a(), var8_19, var4_ey.a(), var1_ey.a());
            this.f(var2_15);
            ((oa)this.a).l = var2_15;
            return;
        }
    }
    al alert = ag.b().a("Chú ý", message, "Đóng", 199199, 1);
    alert.b(199199);
    alert.a(this);
    ag.b().a(alert, false);
    return;
}
            case 101: {
                ag.b().e(-241249);
                return;
            }
            case 199199: {
                ag.b().e(199199);
                return;
            }
            case 202: {
                ks.a().f();
                ag.b().e(-241249);
                return;
            }
            case 201: {
                ks.a().l();
                ag.b().e(241214);
                return;
            }
            case 200: {
                var8_20 = (he)this.d(-241249);
                if (var8_20 == null) {
                    return;
                }
                var2_16 = ((ff)var8_20.e(1)).r().toLowerCase().trim();
                if (!i.b(var2_16)) {
                    if (!var2_16.equals(go.e)) {
                        ag.b().a(-241249, false);
                        com.mg.sq.a.x(var2_16);
                        ks.a().j(var2_16);
                        return;
                    }
                    var1_5 = ag.b().a("Chú ý", "Nhập trùng tên. Vui lòng nhập lại!!!", "Đóng", 199199, 1);
                    var1_5.b(199199);
                    var1_5.a(this);
                    ag.b().a(var1_5, false);
                    return;
                }
                var1_6 = ag.b().a("Chú ý", "Bạn chưa nhập tên đối thủ.", "Đóng", 199199, 1);
                var1_6.b(199199);
                var1_6.a(this);
                ag.b().a(var1_6, false);
                return;
            }
            case 204: {
                this.a(241215, false);
                return;
            }
            case 205: {
                ag.b().a(false);
                if (this.a.h() != 1) break;
                ((oa)this.a).u();
                return;
            }
            case 207: {
                this.a(false);
                return;
            }
            case 208: {
                com.mg.sq.a.X();
                this.l();
                return;
            }
            case 209: {
                if (!this.c(241217)) break;
                try {
                    var1_7 = (he)this.d(241217);
                    var9_23 = ((ff)var1_7.e(2)).r();
                    var3_18 = ((ff)var1_7.e(3)).r();
                    if (var9_23 == null || var9_23.equals("")) {
                        com.mg.sq.a.t("Vui lòng nhập số PIN thẻ cào");
                        return;
                    }
                    if (var3_18 == null || var3_18.equals("")) {
                        com.mg.sq.a.t("Vui lòng nhập mã số thẻ cào!");
                        return;
                    }
                    var4_22 = (gg)var1_7.e(1);
                    ks.a().a(var3_18, var9_23, com.mg.sq.a.v[var4_22.a()], com.mg.sq.a.u);
                    this.a((String)null, (il)null);
                    return;
                }
                catch (Exception v0) {
                    var9_24 = v0;
                    v0.printStackTrace();
                    return;
                }
            }
            case 300: {
                if (!this.c(0)) break;
                try {
                    var1_8 = (he)this.d(0);
                    var9_25 = com.mg.sq.a.w[((fx)var1_8.e(1)).a().q()];
                    ci.a("DEPO", com.mg.sq.a.u, var9_25);
                }
                catch (Exception v1) {
                    var9_26 = v1;
                    v1.printStackTrace();
                }
                this.a(0, false);
                return;
            }
            case 301: {
                ag.b().a(false);
                if (com.mg.sq.a.m == null) break;
                var1_9 = com.mg.sq.a.m;
                var1_9.b(null, "rss://ola/0/2011/12/napken");
                var1_9.i(true);
                return;
            }
            case 302: {
                ag.b().a(false);
                this.m(this.t);
                return;
            }
            case 12358: {
                this.a(false);
                du.a().b((short)2412);
                this.a((String)null, (il)null, 10000);
                return;
            }
            case 123523: {
                this.l();
                this.Y();
                return;
            }
            case 303: {
                var1_10 = (he)this.d(241221);
                pd.b(((ey)var1_10.e(6)).a());
                this.a(241221, false);
                this.N();
                return;
            }
            case 304: {
                var1_11 = (he)this.d(241221);
                pd.b(((ey)var1_11.e(6)).a());
                this.a(241221, false);
                return;
            }
            case 12359: {
                var1_12 /* !! */  = (he)this.d(241223);
                if (var1_12 /* !! */  == null) break;
                var9_27 = ((ff)var1_12 /* !! */ .e(1)).r();
                if (!i.b(var9_27)) {
                    du.a().b(var9_27, null, com.mg.sq.a.q);
                    this.e(241223);
                    var1_12 /* !! */  = this.a("", "Gửi thành công!", "Đóng", 12350, 1);
                    var1_12 /* !! */ .a(this);
                    ag.b().a(var1_12 /* !! */ );
                    return;
                }
                var1_12 /* !! */  = ag.b().a("Chú ý", "Bạn chưa nhập tên nick", "Đóng", 12350, 1);
                var1_12 /* !! */ .a(this);
                ag.b().a(var1_12 /* !! */ );
                return;
            }
            case 12360: {
                var1_13 = (he)this.d(241223);
                if (var1_13 == null) break;
                var9_28 = new hd();
                var9_28.a(this);
                ag.b().a(var9_28, false);
                return;
            }
            case 305: {
                this.a(false);
            }
        }
    }

    public static void u() {
        com.mg.sq.a.b(true);
    }

    public static void b(boolean bl) {
        if (bl) {
            al al2 = ag.b().a("Chú ý", "Bạn có muốn đăng xuất không?", "Có", 12347, "Không", 12350, 1);
            al2.a(ag.b());
            ag.b().a(al2, false);
            return;
        }
        com.mg.sq.a.X();
    }

    private static void X() {
        co.b().d();
        ks.a().b();
        go.a();
        go.w = null;
        oa.b = null;
        oa.c = null;
        om.i = null;
        om.k = 8;
        om.j = 0;
        o = false;
        oq.v();
        i = null;
        if (m != null) {
            m.G();
        }
        pa.a().d();
        ((a)ag.b()).l();
        if (v.ae) {
            ((a)ag.b()).a((String)null, (il)null);
            ((a)ag.b()).f(2);
            return;
        }
        MGMIDlet mGMIDlet = MGMIDlet.d();
        mGMIDlet.notifyDestroyed();
    }

    public final void o() {
        this.v();
        int n = 12350;
        if (this.a != null && this.a.h() == 1) {
            if (this.d(-241249) != null) {
                this.a(-241249, false);
                n = 100;
            }
            if (this.d(241214) != null) {
                ks.a().l();
                this.a(241214, false);
                n = 203;
            }
            ((oa)this.a).y();
        }
        this.c("Hết thời gian thực thi.", n);
    }

    public final void v() {
        this.a(11111, false);
    }

    public final void a(String string) {
        this.c(string, 12350);
    }

    private void c(String object, int n) {
        object = this.a("Thông tin", (String)object, "Đóng", n, "Hỗ trợ", 12353, 1);
        ((am)object).a(this);
        this.a((al)object, false);
    }

    public final void a(String string, il il2) {
        this.a(string, il2, al.a);
    }

    public final void a(String object, il il2, int n) {
        this.p = il2;
        object = new ie((String)object);
        ((am)object).b(11111);
        ((al)object).a(n);
        this.a((al)object);
    }

    public static al a(lh object, int n, int n2, bf bf2, long l, String string, boolean bl, boolean bl2) {
        try {
            ((lh)object).X = l;
            gt gt2 = new gt((lh)object, string, bl, bl2);
            ag.b().a(gt2, false);
            return gt2;
        }
        catch (Exception exception) {
            object = ag.b().a("", String.valueOf(((ld)object).b) + " muốn khiêu chiến bạn. Bạn đồng ý không?", "Đồng ý", n, "Không", n2, 1);
            ((am)object).b(-241209);
            ((am)object).a(bf2);
            ag.b().a((al)object, false);
            return object;
        }
    }

    public final void j(int n) {
        int n2 = 12349;
        String string = "Lỗi ứng dụng số: " + n;
        if (n == 3) {
            n2 = 12361;
            string = String.valueOf(string) + ". Máy không đủ bộ nhớ. Vui lòng xóa bớt ứng dụng hoặc chuyển game qua bộ nhớ máy hoặc thẻ. Yêu cầu bộ nhớ trống ít nhất 5Mb. Mọi chi tiết xin liên hệ tổng đài để hỗ trợ!";
        }
        al al2 = this.a("Thông tin", string, "Thoát", n2, "Hỗ trợ", 12354, 1);
        al2.a(this);
        this.a(al2, false);
    }

    public final void a(int n, String string) {
        r.a();
        if (this.b != null && this.b.h() == 241219) {
            al al2 = ag.b().a("Thông tin", string, "Đóng", 12350, 1);
            al2.a((a)ag.b());
            ag.b().a(al2, false);
            return;
        }
        if (this.a != null && this.a.h() != 2 && !this.c(241222)) {
            this.a(false);
        }
        if (n == 13) {
            if (this.a instanceof oa) {
                ((oa)this.a).a(string);
            }
            return;
        }
        if (n == 35) {
            al al3 = ag.b().a("Chú ý", "Tài khoản chưa được xác thưc. Vui lòng xác thực, để sử dụng các tính năng này!", "Xác thực", 123523, "Đóng", 12350, 1);
            al3.a((a)ag.b());
            ag.b().a(al3, false);
            return;
        }
        if (n == 12) {
            al al4 = ag.b().a("Chú ý", string == null ? "Rương đã đầy. Vui lòng bỏ bớt đồ ra hoặc mua thêm ngăn chứa" : string, "Đóng", 305, 1);
            al4.a((a)ag.b());
            ag.b().a(al4, false);
            return;
        }
        string = string == null ? " - Lỗi không xác định." : string;
        this.a(11111, false);
        int n2 = 12350;
        String string2 = "Đóng";
        int n3 = 12353;
        String string3 = "Hỗ trợ";
        if (n == 18) {
            n2 = 12352;
            string2 = "Nạp KEN";
            n3 = 12350;
            string3 = "Đóng";
        } else if (n == 1 || n == 2) {
            if (this.a != null && this.a.h() == 5 && (n = !((nx)this.a).e() && n != 2 ? 0 : 1) != 0) {
                string = "Không thể kết nối tới máy chủ. Vui lòng kiểm tra cấu hình và kết nối GPRS";
                n2 = 12349;
                string2 = "Thoát";
                n3 = 12354;
            }
        } else if (n == 11) {
            ((oa)this.a).A();
        } else if (n == 0 && this.a != null) {
            if (this.a.h() == 8) {
                ((of)this.a).f();
            } else if (this.a.h() == 1) {
                ((oa)this.a).x();
            }
        }
        al al5 = ag.b().a("Thông tin", string, string2, n2, string3, n3, 1);
        al5.a((a)ag.b());
        ag.b().a(al5, false);
    }

    public final void w() {
        al al2 = this.a(" ", "Tài khoản của bạn vừa được đăng nhập ở một nơi khác.", "Đóng", 12347, 1);
        al2.a(false);
        al2.b(241227);
        al2.a(this);
        this.a(al2);
    }

    public final void x() {
        if (this.d(11111) != null) {
            this.v();
        }
        this.a("Mã hóa dữ liệu...", (il)null);
    }

    public final void y() {
        if (this.d(11111) != null) {
            this.v();
        }
        this.a("Chuyển máy chủ...", (il)null);
    }

    public final void z() {
        al al2 = this.a("Chú ý", "Mất kết nối với máy chủ!", "Đóng", 12347, 1);
        al2.a(this);
        this.a(al2, false);
    }

    public final void a(String object, doo object2, String object3, long l) {
        if (this.a != null && this.a.h() == 1) {
            long l2 = l;
            String string = object3;
            object3 = object2;
            object2 = object;
            object = (oa)this.a;
            if (((oa)object).k != null) {
                long l3 = l2;
                object = ((oa)object).k;
                if (((ol)object).p instanceof os) {
                    ((os)((ol)object).p).b((String)object2, (doo)object3, string, l3);
                }
            }
        }
    }

    public final void b(String object, doo object2, String object3, long l) {
        if (this.a != null && this.a.h() == 1) {
            long l2 = l;
            String string = object3;
            object3 = object2;
            object2 = object;
            object = (oa)this.a;
            if (((oa)object).k != null) {
                long l3 = l2;
                object = ((oa)object).k;
                if (((ol)object).p instanceof os) {
                    ((os)((ol)object).p).a((String)object2, (doo)object3, string, l3);
                }
            }
        }
    }

    public final void a(String object, String string) {
        if (this.a != null && this.a.h() == 1) {
            String string2 = string;
            string = object;
            object = (oa)this.a;
            if (((oa)object).k != null) {
                object = ((oa)object).k;
                if (((ol)object).p instanceof os) {
                    ((os)((ol)object).p).a(string, string2);
                }
            }
        }
    }

    public final void A() {
        if (this.a != null && this.a.h() == 1) {
            ((oa)this.a).g();
        }
    }

    public final void a(ns[] nsArray) {
        if (this.a != null && this.a.h() == 1) {
            ((oa)this.a).a(nsArray);
        }
        this.v();
    }

    public final void B() {
        if (this.a != null && this.a.h() == 1) {
            ((oa)this.a).t();
        }
        this.v();
    }

    public final void a(lh lh2, byte by2) {
        block16: {
            block18: {
                block19: {
                    block17: {
                        if (by2 == 103) {
                            com.mg.sq.a.b(lh2);
                            this.v();
                            return;
                        }
                        if (by2 == 1) {
                            go.k = lh2;
                        } else if (by2 == 101) {
                            if (this.a != null && this.a.h() == 1) {
                                byte by3 = by2;
                                lh lh3 = lh2;
                                bf bf2 = (oa)this.a;
                                if (bf2.k != null) {
                                    bf2 = bf2.k;
                                    if (by3 == 101 && ((ol)bf2).p instanceof os) {
                                        ((os)((ol)bf2).p).b(lh3);
                                    }
                                }
                            }
                        } else if (by2 == 99) {
                            this.v();
                            go.k = lh2;
                            com.mg.sq.a.G();
                            return;
                        }
                        if (this.a == null) break block16;
                        if (this.a.h() != 3) break block17;
                        break block18;
                    }
                    if (this.a.h() != 1) break block19;
                    if (by2 == 104 || by2 == 106) {
                        com.mg.sq.a.b(lh2);
                        this.v();
                        return;
                    }
                    break block16;
                }
                if (this.a.h() != 2) break block16;
                if (gr.k) {
                    ob.d();
                }
            }
            ks.a().b(go.k.g);
        }
    }

    public final void a(df[] dfArray, df[] dfArray2, df[] dfArray3, df[] dfArray4, df[] dfArray5, df[] dfArray6) {
        if (this.a != null && this.a.h() == 2) {
            if (gr.k) {
                ob.d();
            }
            nw nw2 = new nw();
            nw2.a(dfArray, dfArray2, dfArray3, dfArray4, dfArray5, dfArray6);
            ag.b().a(nw2);
            co.b().a("lv1", -1);
            co.b().e();
            ((a)ag.b()).v();
        }
    }

    public final void a(String object, doo[] object2) {
        if (this.a != null && this.a.h() == 1) {
            doo[] dooArray = object2;
            object2 = object;
            object = (oa)this.a;
            if (((oa)object).k != null) {
                object = ((oa)object).k;
                if (((ol)object).p instanceof os) {
                    ((os)((ol)object).p).a((String)object2, dooArray);
                }
            }
        }
    }

    public final void b(String string, String string2) {
        if (this.a != null && this.a.h() == 1) {
            ((oa)this.a).a(string, string2);
        }
    }

    public final void a(String string, String string2, int n) {
        al al2 = this.d(241222);
        if (al2 != null) {
            gy.a(string, string2, n);
            return;
        }
        if (this.a != null && this.a instanceof og) {
        }
    }

    public final void a(String string, int n, int n2) {
        if (this.a != null) {
            if (this.a.h() == 4) {
                if (n2 == 0 && !string.equals("M99")) {
                    go.x = n;
                    go.w = string;
                    ag.b().a(5, new Object[]{string});
                }
                return;
            }
            if (this.a.h() == 1) {
                ((oa)this.a).a(string, n, n2);
            }
        }
    }

    public final void a(jn jn2, int[] nArray, int n, int[] nArray2, int n2) {
        pa.a().a(jn2, nArray, n, nArray2, n2);
    }

    public final void a(String string, jm[] jmArray) {
        pa.a().a(string, jmArray);
    }

    public final void a(jo[] joArray, String string) {
        if (this.a != null && this.a.h() == 1) {
            ((oa)this.a).a(joArray, string);
        }
    }

    public final void b(jo[] joArray, String string) {
        if (this.a != null && this.a.h() == 1) {
            ((oa)this.a).a(joArray, string);
        }
    }

    public final void c(jo[] object, String joArray) {
        if (this.a != null && this.a.h() == 1) {
            jo[] joArray2 = joArray;
            joArray = object;
            object = (oa)this.a;
            if (go.w.equals(joArray2)) {
                object = object.k;
                if (object.p instanceof om) {
                    ((om)object.p).a(joArray);
                }
            }
        }
    }

    public final void a(lh lh2, lh lh3, boolean bl, byte[] byArray, byte[] byArray2, byte[] byArray3, int n, byte by2, byte by3) {
        lh[] lhArray = new lh[1];
        lh[] lhArray2 = lhArray;
        lhArray[0] = lh2;
        lh[] lhArray3 = new lh[1];
        lh[] lhArray4 = lhArray3;
        lhArray3[0] = lh3;
        hs.k = go.k.J;
        oq.i = lhArray2;
        oq.j = lhArray4;
        oq.n = by2;
        oq.o = by3;
        oq.k = byArray;
        oq.l = byArray2;
        oq.m = byArray3;
        oq.p = n;
        hs.k = go.k.J;
        hs.l = go.k.G;
        hs.m = go.k.H;
        if (this.a != null && this.a.h() == 1) {
            if (by3 == 9) {
                ((oa)this.a).a(lh2, lh3, bl);
                return;
            }
            ((oa)this.a).a(lh2, lh3, bl, byArray, byArray2, byArray3, n, by2, by3);
        }
    }

    public final void a(ns ns2, boolean bl) {
        if (this.a != null && this.a.h() == 1) {
            ((oa)this.a).a(ns2, bl);
        }
    }

    public final void a(lw[] lwArray) {
        go.r = lwArray;
        if (this.a != null) {
            if (this.a.h() == 2) {
                ks.a().b(go.e);
                return;
            }
            if (this.a.h() == 3) {
                ks.a().b(go.e);
            }
        }
    }

    public final void b(String object) {
        if (this.a != null) {
            if (this.a.h() == 4) {
                ((a)ag.b()).v();
                object = ag.b().a("", (String)object, "Đóng", 2, 1);
                ((am)object).a(ag.b());
                ag.b().a((al)object);
                return;
            }
            if (this.a.h() == 1) {
                Object object2 = object;
                object = (oa)this.a;
                object = ((oa)object).k;
                if (((ol)object).p == null || !(((ol)object).p instanceof om)) {
                    return;
                }
                ((a)ag.b()).v();
                ((om)((ol)object).p).e(true);
                ((om)((ol)object).p).l.a(0);
                ((om)((ol)object).p).m.a();
                ((om)((ol)object).p).o = false;
                object2 = ag.b().a("Chú ý", (String)object2, "Đóng", 0, 1);
                ((am)object2).a((bf)object);
                ag.b().a((al)object2, false);
            }
        }
    }

    public final void e(int n, int n2) {
        ah ah2 = ag.b();
        go.a(n, n2);
        if (ah2.c(241202)) {
            int n3 = n2;
            n2 = n;
            hh hh2 = (hh)ah2.d(241202);
            ((a)ag.b()).v();
            hh2.h(n2, n3);
        }
        if (v.O) {
            if (this.s == null) {
                this.s = new cp("useitem");
            }
            this.s.b();
        }
    }

    public final void c(String string) {
        this.f.a(new gi(string));
    }

    public final void a(long l) {
        if (l <= 2000L && go.s > l) {
            go.t = true;
        }
        go.s = l;
        Object object = new ft(0L);
        ((ft)object).a(l);
        this.b().a((at)object);
        if (this.c(241210)) {
            object = (ia)this.d(241210);
            ((ia)object).a(l);
        }
    }

    public final void C() {
        al al2 = this.a("Thông tin", "Phiên bản hiện tại chưa hỗ trợ tính năng này!", "Đóng", 2, 1);
        al2.a(this);
        this.a(al2, false);
    }

    public static void d(String object) {
        he he2 = new he();
        bb bb2 = new bb("Nhập nick", 157, bx.d);
        bb2.a_(10, 10);
        he2.a(bb2);
        int n = 10 + (bb2.f() + 3);
        ff ff2 = new ff(null, 100, 2);
        ff2.a_(1);
        ff2.a(10, n, 154, 20);
        ff2.d(true);
        ff2.c((String)object);
        he2.a(ff2);
        n += ff2.f() + 5;
        ff2 = new ff("Đặt Cược:", 4, 4);
        ff2.a(10, n += bx.d.a(), bx.d.a("99999"), 18);
        ff2.d(false);
        ff2.a_(5);
        he2.a(ff2);
        bb2 = new bb(".000 KEN", 157, bx.d);
        bb2.a_(10 + ff2.e() + 1, n + 2);
        he2.a(bb2);
        object = new ey("Cho xem", true);
        ((aq)object).a(bb2.c() + bx.d.a(".000 KEN0"), ff2.d() + 2, 13, 13);
        ((aq)object).d(false);
        ((aq)object).a_(6);
        he2.a((aq)object);
        bb2 = new bb("Kiểu quyết đấu:", 157, bx.d);
        bb2.a_(10, n += ff2.f() + 5);
        he2.a(bb2);
        object = new ey("1 chiều", false);
        ((aq)object).a(10, n += bb2.f() + 3, 13, 13);
        ((aq)object).d(false);
        ((aq)object).a_(7);
        he2.a((aq)object);
        n += ((aq)object).f() + 5;
        object = new ey("Không chơi Tuyệt Chiêu", false);
        ((aq)object).a(10, n, 13, 13);
        ((aq)object).d(false);
        ((aq)object).a_(10);
        he2.a((aq)object);
        n += ((aq)object).f() + 5;
        object = ex.a("Gửi", 102);
        ((ex)object).a((a)ag.b());
        ((aq)object).a_(2);
        int n2 = 87 - ((aq)object).e() >> 1;
        ((aq)object).a_(n2, n);
        he2.a((aq)object);
        object = ex.a("Hủy", 101);
        ((ex)object).a((a)ag.b());
        ((aq)object).a_(3);
        n2 = (87 - ((aq)object).e() >> 1) + 87;
        ((aq)object).a_(n2, n);
        he2.a((aq)object);
        int n3 = n += ((aq)object).f() + 10;
        he2.a(v.t - 174 >> 1, v.u - n3 >> 1, 174, n3);
        he2.a((a)ag.b());
        he2.b(-241249);
        bd bd2 = new bd("", 102);
        Object object2 = he2;
        ((am)object2).a(bd2, true);
        bd2 = new bd("", 101);
        object2 = he2;
        ((am)object2).b(bd2, true);
        ag.b().a(he2);
        object2 = new int[][]{{1, 1, 1, 1}, {1, 2, 1, 2}, {1, 6, 1, 4}, {2, 4, 2, 4}, {1, 6, 2, 6}, {6, 6, 6, 6}, {2, 7, 4, 7}, {6, 8, 6, 8}, {7, 8, 9, 9}, {7, 9, 8, 8}};
        he2.a((int[][])object2);
    }

    public static void e(String object) {
        object = com.mg.sq.a.a((String)object, "Nhập nick", "Gửi", 200, "Hủy", 101);
        ((am)object).b(-241249);
        ag.b().a((al)object);
    }

    public static he a(String object, String object2, String string, int n, String string2, int n2) {
        he he2 = new he();
        object = new bb((String)object, 158, bx.d);
        ((aq)object).a_(5, 10);
        he2.a((aq)object);
        int n3 = 10 + (((aq)object).f() + (object2 != null ? bx.d.a() : 0) + 3);
        object2 = new ff((String)object2, 100, 2);
        ((aq)object2).a_(1);
        ((ff)object2).a(5, n3, 165, 20);
        ((ff)object2).d(true);
        he2.a((aq)object2);
        n3 += ((aq)object2).f() + 5;
        boolean bl = bx.d.a(string) >= bx.d.a(string2);
        ex ex2 = ex.a(string, n);
        if (!bl) {
            ex2.d(ex.a(string2, n2).e());
        }
        ex2.a_(2);
        int n4 = 87 - ex2.e() >> 1;
        ex2.a_(n4, n3);
        he2.a(ex2);
        ex2 = ex.a(string2, n2);
        if (bl) {
            ex2.d(ex.a(string, n).e());
        }
        ex2.a_(3);
        n4 = (87 - ex2.e() >> 1) + 87;
        ex2.a_(n4, n3);
        he2.a(ex2);
        n3 += ex2.f() + 10;
        he2.a(v.t - 175 >> 1, v.u - n3 >> 1, 175, n3);
        he2.a((a)ag.b());
        he2.b(241220);
        bd bd2 = new bd("", n);
        he he3 = he2;
        ((am)he3).a(bd2, true);
        bd2 = new bd("", n2);
        he3 = he2;
        ((am)he3).b(bd2, true);
        return he2;
    }

    public static he a(String object, String object2, String object3, int n, String string, int n2, int n3, bf bf2) {
        object2 = new he();
        object = new bb((String)object, 158, bx.d);
        ((aq)object).a_(5, 10);
        ((he)object2).a((aq)object);
        int n4 = 10 + (((aq)object).f() + 3);
        Object object4 = new hp(1);
        ff ff2 = new ff(null, 300, 2);
        ff2.a((hp)object4);
        ff2.f(true);
        ff2.a_(1);
        ff2.a(5, n4, 165, 20);
        ff2.d(true);
        ((he)object2).a(ff2);
        n4 += ff2.f() + 5;
        n4 += 2;
        if (oy.f != null) {
            fu fu2 = new fu(null, n3);
            fu2.a((175 - oy.e) / 2, n4, oy.e, oy.e);
            fu2.a(bf2);
            fu2.a_(4);
            ((he)object2).a(fu2);
            n4 += fu2.f() + 5;
        }
        n3 = bx.d.a((String)object3) >= bx.d.a(string) ? 1 : 0;
        object4 = ex.a((String)object3, n);
        ((ex)object4).a(bf2);
        if (n3 == 0) {
            ((aq)object4).d(ex.a(string, n2).e());
        }
        ((aq)object4).a_(2);
        int n5 = 87 - ((aq)object4).e() >> 1;
        ((aq)object4).a_(n5, n4);
        ((he)object2).a((aq)object4);
        object4 = ex.a(string, n2);
        ((ex)object4).a(bf2);
        if (n3 != 0) {
            ((aq)object4).d(ex.a((String)object3, n).e());
        }
        ((aq)object4).a_(3);
        n5 = (87 - ((aq)object4).e() >> 1) + 87;
        ((aq)object4).a_(n5, n4);
        ((he)object2).a((aq)object4);
        n4 += ((aq)object4).f() + 10;
        ff2.e(true);
        ((al)object2).a(v.t - 175 >> 1, v.u - n4 >> 1, 175, n4);
        ((am)object2).a(bf2);
        ((am)object2).b(241220);
        object3 = new bd("", n);
        Object object5 = object2;
        ((am)object5).a((az)object3, true);
        object3 = new bd("", n2);
        object5 = object2;
        ((am)object5).b((az)object3, true);
        return object2;
    }

    public static void D() {
        String[] stringArray = new String[]{"- Thanh kiếm để tấn công đối phương.", "- Trái tim có tác dụng hồi sinh lực trong trận chiến.", "- Xoáy âm dương giúp phục hồi nội lực trong trận đấu để sử dụng tuyệt chiêu.", "- Trái đào giúp phục hồi sức mạnh trong trận chiến để nhân đôi lực tấn công cho một lượt.", "- Giọt nước có tác dụng tăng điểm kinh nghiệm để lên cấp, nhưng điểm chỉ bằng 1/2 ngôi sao.", "- Ngôi sao có tác dụng tăng điểm kinh nghiệm để lên cấp.", "- Thỏi vàng để đổi KEN, khi đủ 10.000 lượng vàng hệ thống sẽ tự động nạp vào tài khoản của nhân vật 10.000 KEN.", "", "- Kiếm lửa có lực tấn công mạnh hơn và làm nổ các biểu tượng bao quanh nó. Kiếm lửa có thể xếp cùng với kiếm thường."};
        he he2 = new he();
        he2.a(new ba());
        he2.g(he2.j() - ba.a);
        aq aq2 = new gc("Hướng dẫn", he2.i() - 20, bx.d);
        ((gc)aq2).e(true);
        aq2.a_(10, 10);
        ((gc)aq2).h(1);
        he2.a(aq2);
        aq2 = new ay(0);
        aq2.a(3, 32, he2.i() - 6, he2.j() - 35);
        aw aw2 = new aw();
        aw2.a((a)ag.b());
        aw2.e(true);
        ((ay)aq2).b(aw2);
        Image[] imageArray = new Image[9];
        int n = 0;
        while (n < 9) {
            if (n != 7) {
                imageArray[n] = f.d("/chess" + n);
                gn gn2 = new gn(imageArray[n], stringArray[n], aq2.e());
                aw2.a((Object)gn2);
            }
            ++n;
        }
        he2.a(aq2);
        he2.a((a)ag.b());
        he2.a(new bd("Đóng", 12350));
        ag.b().a(he2, false);
    }

    public static void a(String[] stringArray) {
        he he2 = new he();
        he2.a(new ba());
        he2.g(he2.j() - ba.a);
        aq aq2 = new gc("Những tính năng mới:", he2.i() - 20, bx.d);
        ((gc)aq2).e(true);
        aq2.a_(10, 10);
        ((gc)aq2).h(1);
        he2.a(aq2);
        aq2 = new gc("Phiên Bản 0.18.0", he2.i() - 20, bx.d);
        ((gc)aq2).e(true);
        aq2.a_(10, 28);
        ((gc)aq2).h(1);
        he2.a(aq2);
        aq2 = new ay(0);
        aq2.a(3, 50, he2.i() - 6, he2.j() - 50 - 2);
        aw aw2 = new aw();
        aw2.a((a)ag.b());
        aw2.e(true);
        ((ay)aq2).b(aw2);
        int n = 0;
        while (n < stringArray.length) {
            if (n != 8) {
                gn gn2 = new gn(null, stringArray[n], aq2.e());
                aw2.a((Object)gn2);
            }
            ++n;
        }
        he2.a(aq2);
        he2.a((a)ag.b());
        he2.a(new bd("Đóng", 12350));
        ag.b().a(he2, false);
    }

    public static void b(String[] stringArray) {
        he he2 = new he();
        he2.a(new ba());
        he2.g(he2.j() - ba.a);
        aq aq2 = new gc("Thông báo:", he2.i() - 20, bx.d);
        ((gc)aq2).e(true);
        aq2.a_(10, 10);
        ((gc)aq2).h(1);
        he2.a(aq2);
        aq2 = new ay(0);
        aq2.a(3, 28, he2.i() - 6, he2.j() - 28 - 2);
        aw aw2 = new aw();
        aw2.a((a)ag.b());
        aw2.e(true);
        ((ay)aq2).b(aw2);
        int n = 0;
        while (n < stringArray.length) {
            if (n != 8) {
                gn gn2 = new gn(null, stringArray[n], aq2.e());
                aw2.a((Object)gn2);
            }
            ++n;
        }
        he2.a(aq2);
        he2.a((a)ag.b());
        he2.a(new bd("Đóng", 12350));
        ag.b().a(he2, false);
    }

    public static String k(int n) {
        he he2 = (he)((a)ag.b()).d(n);
        if (he2 == null) {
            return "";
        }
        return ((ff)he2.e(1)).r().toLowerCase().trim();
    }

    public final void a(lh lh2, String string, long l, String string2, boolean bl, boolean bl2) {
        if (this.a != null && this.a.h() == 1) {
            r.a(string2);
            ((oa)this.a).a(lh2, string, l, string2, bl, bl2);
            return;
        }
        ks.a().a(false, string2, "Tui chưa sẵn sàng!!!");
    }

    public final void a(boolean bl, String string) {
        gt gt2 = (gt)((a)ag.b()).d(-241209);
        String string2 = "";
        if (gt2 != null) {
            string2 = gt2.t();
            this.b(gt2, false);
        }
        if (bl) {
            int n = r.d() - 1;
            while (n >= 0) {
                if (string2.equals(r.b(n))) {
                    ks.a().a(bl, string2, string);
                } else {
                    ks.a().a(false, (String)r.b(n), string);
                }
                --n;
            }
            r.a();
            this.l();
            this.a((String)null, (il)null);
            return;
        }
        ks.a().a(bl, string2, string);
        r.a(r.d() - 1);
    }

    public final void f(String object) {
        object = new ie("Đang khiêu chiến \"" + (String)object + "\". Vui lòng chờ...");
        ((am)object).a(this);
        ((am)object).a(new ba());
        bd bd2 = new bd("Hủy", 202);
        Object object2 = object;
        ((am)object2).b(bd2, true);
        ((am)object).b(-241249);
        ((ie)object).j(true);
        ((ie)object).e(30);
        this.a((al)object, false);
    }

    private static al x(String object) {
        object = new ie("Đang mời \"" + (String)object + "\" Giao dịch. Vui lòng chờ...");
        ((am)object).a(ag.b());
        ((am)object).a(new ba());
        bd bd2 = new bd("Hủy", 201);
        Object object2 = object;
        ((am)object2).b(bd2, true);
        ((am)object).b(241214);
        ((ie)object).j(true);
        ((ie)object).e(30);
        ag.b().a((al)object, false);
        return object;
    }

    public final al a(String object, String object2, String[] stringArray, int[] nArray, int n) {
        try {
            n = v.t;
            int n2 = v.u;
            if (n > n2) {
                if (n >= 320) {
                    n = 320;
                }
            } else if (n >= 240) {
                n = 240;
            }
            n -= 20;
            n2 = 6;
            he he2 = new he();
            if (object != null && !((String)object).equals("")) {
                object = new gc((String)object, n - 10 - 10, bx.d);
                ((gc)object).e(true);
                ((aq)object).a_(10, 6);
                ((gc)object).h(1);
                he2.a((aq)object);
                n2 = 6 + (((gc)object).f() + 6);
            }
            object = new gc((String)object2, n - 10 - 10, bx.d);
            ((aq)object).a_(10, n2);
            ((gc)object).h(1);
            he2.a((aq)object);
            n2 += ((gc)object).f() + 6;
            if (stringArray != null && nArray != null) {
                int n3 = n / stringArray.length;
                object2 = ex.a(stringArray[0], nArray[0]);
                ((aq)object2).a_(2);
                int n4 = n3 - ((aq)object2).e() >> 1;
                ((aq)object2).a_(n4, n2);
                ((aq)object2).d(true);
                bd bd2 = new bd("", nArray[0]);
                he he3 = he2;
                ((am)he3).a(bd2, true);
                he2.a((aq)object2);
                if (nArray.length > 1) {
                    int n5 = bx.d.a(stringArray[0]) >= bx.d.a(stringArray[1]) ? 1 : 0;
                    if (n5 == 0) {
                        ((aq)object2).d(ex.a(stringArray[1], nArray[1]).e());
                        ((aq)object2).a_(n3 - ((aq)object2).e() >> 1, n2);
                    }
                    object2 = ex.a(stringArray[1], nArray[1]);
                    if (n5 != 0) {
                        ((aq)object2).d(ex.a(stringArray[0], nArray[0]).e());
                    }
                    ((aq)object2).a_(3);
                    n5 = (n3 - ((aq)object2).e() >> 1) + n3;
                    ((aq)object2).a_(n5, n2);
                    he2.a((aq)object2);
                    bd2 = new bd("", nArray[1]);
                    he he4 = he2;
                    ((am)he4).b(bd2, true);
                }
                n2 += ((aq)object2).f();
            }
            he2.a(v.t - n >> 1, v.u - (n2 += 10) >> 1, n, n2);
            return he2;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return null;
        }
    }

    public static void g(String object) {
        int n = v.t;
        int n2 = v.u;
        if (n > n2) {
            if (n >= 320) {
                n = 320;
            }
        } else if (n >= 240) {
            n = 240;
        }
        he he2 = new he();
        aq aq2 = new gc("Chú ý", (n -= 20) - 10 - 10, bx.d);
        ((gc)aq2).e(true);
        aq2.a_(10, 6);
        ((gc)aq2).h(1);
        he2.a(aq2);
        n2 = 6 + (((gc)aq2).f() + 6);
        aq2 = new gc((String)object, n - 10 - 10, bx.d);
        aq2.a_(10, n2);
        ((gc)aq2).h(1);
        he2.a(aq2);
        object = new ey("Không nhắc nữa", false);
        ((aq)object).a_(6);
        ((aq)object).a(16, n2 += ((gc)aq2).f() + 6, 13, 13);
        he2.a((aq)object);
        n2 += ((aq)object).f() + 6;
        int n3 = n / 2;
        aq2 = ex.a("Có", 303);
        aq2.d(ex.a("Không", 304).e());
        aq2.a_(2);
        int n4 = n3 - aq2.e() >> 1;
        aq2.a_(n4, n2);
        aq2.d(true);
        bd bd2 = new bd("", 303);
        he he3 = he2;
        ((am)he3).a(bd2, true);
        he2.a(aq2);
        aq2 = ex.a("Không", 304);
        aq2.a_(3);
        int n5 = (n3 - aq2.e() >> 1) + n3;
        aq2.a_(n5, n2);
        he2.a(aq2);
        bd2 = new bd("", 304);
        he he4 = he2;
        ((am)he4).b(bd2, true);
        int n6 = aq2.e();
        aq2 = (ex)he2.e(2);
        aq2.d(n6);
        aq2.b_(n3 - aq2.e() >> 1);
        n2 += aq2.f();
        he2.a(v.t - n >> 1, v.u - (n2 += 10) >> 1, n, n2);
        he2.a((a)ag.b());
        he2.b(241221);
        ag.b().a(he2, false);
    }

    public static void E() {
        al al2 = ag.b().a("Thông tin", "Đã gửi Me thành công", "Đóng", 2, 1);
        al2.a(ag.b());
        ag.b().a(al2, false);
    }

    private static void b(lh object) {
        object = new gt((lh)object, 1, false, false);
        ag.b().a((al)object, false);
    }

    public final void a(boolean bl, String string, int n, int[] nArray, int n2) {
        if (this.a != null && this.a.h() == 5) {
            ((nx)this.a).a(bl, string, n, nArray, n2);
        }
    }

    public final void a(int n, String[] stringArray) {
        if (stringArray.length > 0) {
            pd.g(n);
            l = stringArray;
        }
    }

    public static String a(String string, int n) {
        return com.mg.sq.a.a(string, g, n);
    }

    public static String a(String object, d d2, int n) {
        if (d2.a((String)object) > n) {
            int n2 = 0;
            object = ((String)object).toCharArray();
            int n3 = 0;
            while (n3 < ((Object)object).length) {
                if ((n2 += d2.a((char)object[n3])) >= n) break;
                ++n3;
            }
            if (n3 >= ((Object)object).length) {
                n3 = ((Object)object).length - 1;
            }
            int n4 = n3 - 3;
            while (n4 <= n3) {
                object[n4] = 46;
                ++n4;
            }
            object = String.valueOf((char[])object, 0, n3);
        }
        return object;
    }

    public static void F() {
        ag.b().a(9, true, false, null, null);
    }

    public final void a(ll[] llArray, lm[] lmArray, int n, int n2) {
        go.a(llArray, lmArray, n, n2);
        if (this.a.h() == 2) {
            ((ob)this.a).e();
        } else if (this.a.h() == 3) {
            ((nw)this.a).d();
        }
        this.v();
    }

    public static void G() {
        gy gy2 = new gy();
        ag.b().a(gy2);
    }

    public static al a(ll object, bf object2, String object3, int n, String string, int n2) {
        object = new hg((ll)object);
        if (object2 != null) {
            ((am)object).a((bf)object2);
            object3 = new bd((String)object3, n);
            object2 = object;
            ((am)object2).a((az)object3, true);
            object3 = new bd(string, n2);
            object2 = object;
            ((am)object2).b((az)object3, true);
        }
        ag.b().a((al)object, false);
        return object;
    }

    public static void a(bf bf2, String object, int n, String string, int n2) {
        object = ag.b().a("Chú ý", "Thùng đồ đã đầy. Bạn có phải bỏ bớt đồ đi!", (String)object, n, string, n2, 1);
        ((am)object).a(bf2);
        ((am)object).b(241209);
        ag.b().a((al)object, false);
    }

    public static String[] a(ll stringArray) {
        String[] stringArray2 = new String[10];
        int n = 0;
        if (stringArray.r.a > 0) {
            stringArray2[0] = "+ " + stringArray.r.a + " cường lực";
            ++n;
        } else if (stringArray.r.a < 0) {
            stringArray2[0] = "- " + stringArray.r.a + " cường lực";
            ++n;
        }
        if (stringArray.r.c > 0) {
            stringArray2[n] = "+ " + stringArray.r.c + " nội lực";
            ++n;
        } else if (stringArray.r.c < 0) {
            stringArray2[n] = "- " + stringArray.r.c + " nội lực";
            ++n;
        }
        if (stringArray.r.b > 0) {
            stringArray2[n] = "+ " + stringArray.r.b + " thân pháp";
            ++n;
        } else if (stringArray.r.b < 0) {
            stringArray2[n] = "- " + stringArray.r.b + " thân pháp";
            ++n;
        }
        if (stringArray.r.d > 0) {
            stringArray2[n] = "+ " + stringArray.r.d + " thể lực";
            ++n;
        } else if (stringArray.r.d < 0) {
            stringArray2[n] = "- " + stringArray.r.d + " thể lực";
            ++n;
        }
        if (stringArray.r.e > 0) {
            stringArray2[n] = "+ " + stringArray.r.e + " sức tấn công";
            ++n;
        } else if (stringArray.r.e < 0) {
            stringArray2[n] = "- " + stringArray.r.e + " sức tấn công";
            ++n;
        }
        if (stringArray.r.f > 0) {
            stringArray2[n] = "+ " + stringArray.r.f + " phòng thủ";
            ++n;
        } else if (stringArray.r.f < 0) {
            stringArray2[n] = "- " + stringArray.r.f + " phòng thủ";
            ++n;
        }
        if (stringArray.r.h > 0) {
            stringArray2[n] = "+ " + stringArray.r.h + " né tránh";
            ++n;
        } else if (stringArray.r.h < 0) {
            stringArray2[n] = "- " + stringArray.r.h + " né tránh";
            ++n;
        }
        if (stringArray.r.g > 0) {
            stringArray2[n] = "+ " + stringArray.r.g + "% chí mạng";
            ++n;
        } else if (stringArray.r.g < 0) {
            stringArray2[n] = "- " + stringArray.r.g + "% chí mạng";
            ++n;
        }
        if (stringArray.r.i > 0) {
            stringArray2[n] = "+ " + stringArray.r.i + " sinh lực";
            ++n;
        } else if (stringArray.r.i < 0) {
            stringArray2[n] = "- " + stringArray.r.i + " sinh lực";
            ++n;
        }
        if (stringArray.r.j > 0) {
            stringArray2[n] = "+ " + stringArray.r.j + "% hấp thu sát thương";
            ++n;
        } else if (stringArray.r.j < 0) {
            stringArray2[n] = "- " + stringArray.r.j + "% hấp thu sát thương";
            ++n;
        }
        if (stringArray.r.k > 0) {
            stringArray2[n] = "+ " + stringArray.r.k + "% đánh xuyên giáp";
            ++n;
        } else if (stringArray.r.k < 0) {
            stringArray2[n] = "- " + stringArray.r.k + "% đánh xuyên giáp";
            ++n;
        }
        if (stringArray.r.l > 0) {
            stringArray2[n] = "+ " + stringArray.r.l + "% cản đòn";
            ++n;
        } else if (stringArray.r.l < 0) {
            stringArray2[n] = "- " + stringArray.r.l + "% cản đòn";
            ++n;
        }
        if (stringArray.r.m > 0) {
            stringArray2[n] = "+ " + stringArray.r.m + "% hồi sinh";
            ++n;
        } else if (stringArray.r.m < 0) {
            stringArray2[n] = "- " + stringArray.r.m + "% hồi sinh";
            ++n;
        }
        if (stringArray.r.n > 0) {
            stringArray2[n] = "+ " + stringArray.r.n + "% sức tấn công";
            ++n;
        } else if (stringArray.r.n < 0) {
            stringArray2[n] = "- " + stringArray.r.n + "% sức tấn công";
            ++n;
        }
        if (stringArray.r.o > 0) {
            stringArray2[n] = "+ " + stringArray.r.o + "% sinh lực";
            ++n;
        } else if (stringArray.r.o < 0) {
            stringArray2[n] = "- " + stringArray.r.o + "% sinh lực";
            ++n;
        }
        stringArray = new String[n];
        System.arraycopy(stringArray2, 0, stringArray, 0, n);
        return stringArray;
    }

    public final void b(String object, int n, int n2) {
        ll ll2 = null;
        if (go.l != null) {
            int n3 = 0;
            while (n3 < go.l.length) {
                if (go.l[n3].c.equals(object)) {
                    go.l[n3].p = go.l[n3].q;
                    ll2 = go.l[n3];
                    break;
                }
                ++n3;
            }
            n3 = 0;
            while (n3 < go.m.length) {
                if (go.m[n3].a == n) {
                    go.m[n3].g = n2;
                    break;
                }
                ++n3;
            }
        }
        if (this.a != null && this.a.h() == 1) {
            object = (oa)this.a;
            ((oa)this.a).a = false;
            if (((oa)object).k != null) {
                ((oa)object).k.s = false;
            }
        }
        if (this.b != null && this.b.h() == 241202) {
            ((hh)this.b).a(ll2);
            ((hh)this.b).j(n2);
        }
    }

    public static hl a(bf bf2, az az2, az az3, az az4, ll object) {
        Object object2;
        lm[] lmArray = new lm[go.m.length];
        int n = 0;
        int n2 = 0;
        while (n2 < go.m.length) {
            if (go.m[n2].e == 1) {
                lmArray[n] = go.m[n2];
                ++n;
            }
            ++n2;
        }
        lm[] lmArray2 = new lm[n];
        System.arraycopy(lmArray, 0, lmArray2, 0, n);
        int n3 = 1;
        int n4 = lmArray2.length;
        while (n3 < n4) {
            n = n3;
            while (n > 0 && lmArray2[n - 1].f > lmArray2[n].f) {
                object2 = lmArray2[n];
                lmArray2[n] = lmArray2[n - 1];
                lmArray2[n - 1] = object2;
                --n;
            }
            ++n3;
        }
        object2 = new hl("Búa sửa chữa: ", lmArray2);
        ((hl)object2).a((ll)object);
        az az5 = az2;
        object = object2;
        ((am)object).a(az5, true);
        ((hl)object2).b(az2);
        az5 = az3;
        object = object2;
        ((am)object).b(az5, true);
        ((hl)object2).a(az4);
        ((am)object2).a(bf2);
        ag.b().a((al)object2);
        return object2;
    }

    public final void H() {
        ks.a().k();
        this.a((String)null, (il)null);
    }

    public final void I() {
        ks.a().j();
        this.a((String)null, (il)null);
    }

    public final void J() {
        ks.a().v();
        this.a((String)null, (il)null);
    }

    public final void h(String string) {
        ks.a().r(string);
        this.a((String)null, (il)null);
    }

    public final void a(lf[] object) {
        if (this.c(241210)) {
            this.e(241210);
        }
        object = new ia((lf[])object);
        ag.b().a((al)object, false);
        this.v();
    }

    public final void a(int n, lq[] lqArray) {
        al al2 = this.d(241210);
        if (al2 != null) {
            ((ia)al2).a(n, lqArray);
        }
    }

    public final void a(String[] stringArray, int[] nArray) {
        if (this.c(241210)) {
            ia ia2 = (ia)this.d(241210);
            ia2.a(stringArray, nArray);
        }
    }

    public final void a(int[] nArray, int[] nArray2) {
        if (this.c(241210)) {
            ia ia2 = (ia)this.d(241210);
            ia2.a(nArray, nArray2);
        }
    }

    public final void i(String string) {
        if (this.a != null && this.a.h() == 8) {
            ((of)this.a).c(string);
        }
        this.v();
    }

    public final void j(String string) {
        if (this.a != null && this.a.h() == 8) {
            ((of)this.a).a(string);
        }
    }

    public final void a(lm lm2) {
        if (this.a != null && this.a.h() == 8) {
            ((of)this.a).a(lm2);
        }
        this.v();
    }

    public final void k(String object) {
        if (this.c(241207) || this.a.h() != 1 || gr.l) {
            ks.a().a(false);
            String string = object;
            object = this;
            ((ah)object).f.a(new gi("Vừa tự động từ chối giao dịch từ @" + string));
            return;
        }
        ((oa)this.a).b((String)object);
    }

    public final void a(ll[] llArray, lm[] lmArray, int n) {
        if (this.a != null && this.a.h() == 8) {
            ((of)this.a).a(llArray, lmArray, n);
        }
        this.v();
    }

    public final void l(String object) {
        if (this.a != null && this.a.h() == 8) {
            ((of)this.a).b((String)object);
        }
        this.v();
        object = ag.b().a("Chúc mừng", "Giao dịch thành công!", "Đóng", 12350, 1);
        ((am)object).a(this);
        ag.b().a((al)object, false);
    }

    public final void b(ll ll2) {
        if (this.a != null && this.a.h() == 8) {
            ((of)this.a).a(ll2);
        }
    }

    public final void a(lm lm2, int n) {
        if (this.a != null && this.a.h() == 8) {
            ((of)this.a).a(lm2, n);
        }
    }

    public final void l(int n) {
        if (this.a != null && this.a.h() == 8) {
            ((of)this.a).a(n, true);
        }
    }

    public final void K() {
        if (this.a != null && this.a.h() == 8) {
            ((of)this.a).d();
        }
        this.v();
    }

    public final void m(String object) {
        this.a(241214, false);
        object = ag.b().a("", String.valueOf(object) + " Không muốn giao dịch với bạn!", "Đóng", 12350, 1);
        ((am)object).a(this);
        ag.b().a((al)object, false);
    }

    public final void n(String string) {
        ag.b().a(8, true, false, null, new Object[]{string});
        this.a(241214, false);
    }

    public static lh a(lh lh2) {
        jz jz2 = jp.a(lh2.g);
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        jz2.a(lh2.h + lh2.l, lh2.j + lh2.m, lh2.i + lh2.n, lh2.k + lh2.o);
        int n10 = 0;
        while (n10 < lh2.D.length) {
            lb lb2 = lh2.D[n10].r;
            if (lb2 != null) {
                n += lb2.a;
                n2 += lb2.d;
                n3 += lb2.b;
                n4 += lb2.c;
                n5 += lb2.e;
                n5 += jz2.c() * lb2.n / 100;
                n6 += lb2.g;
                n7 += lb2.f;
                n8 += lb2.h;
                n9 += lb2.i;
            }
            ++n10;
        }
        jz2.a(lh2.h + n + lh2.l, lh2.j + n3 + lh2.m, lh2.i + n4 + lh2.n, lh2.k + n2 + lh2.o);
        lh2.r = jz2.a() + n9;
        lh2.A = jz2.e() + n8;
        lh2.C = jz2.g() + n6;
        lh2.z = jz2.d() + n7;
        lh2.B = jz2.f();
        lh2.x = jz2.b() + n5;
        lh2.y = jz2.c() + n5;
        return lh2;
    }

    public static al a(lm object, bf object2) {
        object = new hl("Chi Tiết", (lm)object);
        ((am)object).b(241215);
        ((am)object).a((a)ag.b());
        bd bd2 = null;
        object2 = object;
        ((am)object2).a(bd2, true);
        bd2 = new bd("", 204);
        object2 = object;
        ((am)object2).b(bd2, true);
        ((am)object).a(new bd("Đóng", 204));
        ag.b().a((al)object);
        return object;
    }

    public final void L() {
        ks.a().p();
        this.a((String)null, (il)null);
    }

    public final void o(String string) {
        this.v();
        if (this.a != null && this.a.h() == 10) {
            ((oe)this.a).a(string);
        }
    }

    public final void c(String object, String string) {
        if (this.a != null) {
            if (this.a.h() == 8) {
                ((of)this.a).a(string, (byte)1, bx.d);
                return;
            }
            if (this.a.h() == 1) {
                String string2 = string;
                string = object;
                object = (oa)this.a;
                if (((oa)object).k != null) {
                    object = ((oa)object).k;
                    if (((ol)object).p != null && ((ol)object).p.b() == 2) {
                        ((oq)((ol)object).p).a(string, string2);
                    }
                }
            }
        }
    }

    public static void p(String object) {
        if (go.e.equals(object)) {
            object = ag.b().a("", "Bạn không thể giao dịch với chính bạn! vui lòng kiểm tra lại", "Đóng", 12350, 1);
            ((am)object).a((a)ag.b());
            ag.b().a((al)object, false);
            return;
        }
        com.mg.sq.a.x((String)object);
        ks.a().j((String)object);
    }

    public final void a(String string, byte by2) {
        if (string == null) {
            return;
        }
        if (this.a.h() == 1) {
            boolean bl;
            byte by3 = 0;
            String string2 = string;
            bf bf2 = (oa)this.a;
            if (bf2.k != null) {
                bf2 = bf2.k;
                if (((ol)bf2).p != null && ((ol)bf2).p.b() == 1) {
                    ((om)((ol)bf2).p).a(string2, by3);
                    bl = true;
                } else {
                    bl = false;
                }
            } else {
                bl = false;
            }
            if (!bl) {
                this.q(string);
            }
        } else {
            i = string;
            j = 0;
        }
        this.v();
    }

    public final void q(String object) {
        object = this.a("", (String)object, "Đóng", 205, 1);
        ((am)object).a(this);
        this.a((al)object, false);
    }

    public final void M() {
        if (this.a != null && this.a.h() == 1) {
            ((oa)this.a).u();
        }
    }

    public static String b(long l) {
        String string = l < 0L ? "?  KEN" : String.valueOf(i.a(l, ".")) + "  KEN";
        return string;
    }

    public final void r(String string) {
        this.a((String)null, (il)null);
        ks.a().f(string);
    }

    public final void b(String string, int n) {
        ks.a().a(string, (byte)n);
        this.a((String)null, (il)null);
    }

    public final void N() {
        if (m != null && o) {
            this.m(99004);
            return;
        }
        al al2 = this.a("Thông tin", "Vui lòng đăng nhập Ola để sử dụng tính năng nạp KEN", "Đóng", 12350, "Hỗ trợ", 12353, 1);
        al2.a(this);
        this.a(al2, false);
    }

    public final void c(String[] object) {
        if (this.a.h() == 1) {
            String[] stringArray = object;
            object = (oa)this.a;
            if (object.k != null) {
                object = object.k;
                if (object.p != null && object.p.b() == 1) {
                    ((om)object.p).a(stringArray);
                }
            }
        }
    }

    public final void d(String[] stringArray) {
        hh hh2 = (hh)this.d(241202);
        if (hh2 != null) {
            hh2.a(stringArray);
        }
    }

    public final void O() {
        this.a((String)null, (il)null);
    }

    public final void P() {
        if (this.a != null && this.a.h() == 8) {
            ((of)this.a).e();
        }
        this.v();
    }

    public final void a(int n, dh[] dhArray) {
        if (this.a != null && this.a.h() == 1) {
            ((oa)this.a).a(n, dhArray);
        }
        this.v();
    }

    public final void Q() {
        ks.a().c(0);
        this.a((String)null, (il)null);
    }

    public final void R() {
        ks.a().c(1);
        this.a((String)null, (il)null);
    }

    public final void s(String object) {
        this.l();
        object = this.a(null, (String)object, "Đóng", 208, 1);
        ((am)object).a(this);
        this.a((al)object, false);
    }

    public final void a(String string, boolean bl, boolean bl2) {
        if (string == null) {
            string = "";
        }
        go.h = bl;
        go.i = bl2;
        go.g = string;
    }

    public final void a(String string, boolean bl, boolean bl2, boolean bl3) {
        if (string == null) {
            string = "";
        }
        go.h = bl2;
        go.i = bl3;
        go.g = string;
        go.j = bl;
        this.Y();
    }

    public final void b(String string, boolean bl, boolean bl2, boolean bl3) {
        if (string == null) {
            string = "";
        }
        go.h = bl2;
        go.i = bl3;
        go.g = string;
        go.j = bl;
        if (this.c(241216)) {
            hv hv2 = (hv)this.d(241216);
            hv2.a(string, bl, bl2);
        }
        this.v();
    }

    private void Y() {
        hv hv2 = new hv(go.g, go.j, go.h);
        this.a(hv2);
        this.v();
    }

    public final void S() {
        ks.a().q();
        this.a((String)null, (il)null);
    }

    public static final void d(String object, String object2) {
        q = object2;
        object2 = new he();
        ((am)object2).b(241223);
        object = new bb((String)object, 163, bx.d);
        ((aq)object).a_(10, 10);
        ((he)object2).a((aq)object);
        int n = 10 + (((aq)object).f() + 3);
        aq aq2 = new ff(null, 100, 2);
        aq2.a_(1);
        ((ff)aq2).a(10, n, 136, 20);
        ((ff)aq2).d(true);
        ((he)object2).a(aq2);
        int n2 = 10 + (aq2.e() + 4);
        Image image = f.d("/iconbt");
        fu fu2 = new fu(null, 12360);
        fu2.a((a)ag.b());
        fu2.a_(4);
        fu2.a(n2, n, 20, 20);
        fu2.a(image);
        fu2.b(0, 0, 20, 20);
        fu2.a(22523, 9287679, 22523);
        ((he)object2).a(fu2);
        n += aq2.f() + 5;
        n2 = aq2.c() + 9;
        aq2 = new ex("Gửi", 12359);
        aq2.a(n2, n, 50, 18);
        aq2.a_(2);
        ((he)object2).a(aq2);
        aq2 = new ex("Đóng", 12350);
        aq2.a(n2 += 68, n, 50, 18);
        aq2.a_(3);
        ((he)object2).a(aq2);
        n2 = n += aq2.f() + 10;
        ((al)object2).a(v.t - 180 >> 1, v.u - n2 >> 1, 180, n2);
        ((am)object2).a((a)ag.b());
        ((am)object2).b(241223);
        bd bd2 = new bd("", 12359);
        Object object3 = object2;
        ((am)object3).a(bd2, true);
        bd2 = new bd("", 12350);
        object3 = object2;
        ((am)object3).b(bd2, true);
        ag.b().a((al)object2);
    }

    public static void a(String string, String string2, String[] stringArray, String[] object) {
        ((a)ag.b()).v();
        u = string2;
        w = object;
        int n = v.t < 320 ? v.t - 20 : 200;
        object = new he();
        aq aq2 = new bb(string != null ? string : "Vui lòng chọn số Ken muốn mua!", n - 20, bx.c);
        aq2.a_(10, 10);
        int n2 = 10 + (aq2.f() + 5);
        ((he)object).a(aq2);
        aq2 = new fx("Mua Ken");
        aq2.a_(1);
        ((fx)aq2).d(true);
        ((fx)aq2).a(10, n2, n - 20, 70);
        int n3 = 0;
        int n4 = stringArray.length;
        while (n3 < n4) {
            ey ey2 = new ey(stringArray[n3], false);
            ey2.h(n3);
            if (n3 == n4 - 1) {
                ey2.e(true);
            }
            ((fx)aq2).a(ey2);
            ++n3;
        }
        ((he)object).a(aq2);
        n2 += aq2.f();
        int n5 = n / 2 - 70;
        ex ex2 = new ex("Nạp", 300);
        ex2.a(n5, n2 += 5, 50, 20);
        ((he)object).a(ex2);
        n5 = ex2.c() + ex2.e() + 40;
        ex2 = new ex("Đóng", 12350);
        ex2.a(n5, n2, 50, 20);
        ((he)object).a(ex2);
        n2 += ex2.f();
        ((al)object).a(v.t - n >> 1, v.u - (n2 += 10) >> 1, n, n2);
        ((am)object).a((a)ag.b());
        ((am)object).b(0);
        bd bd2 = new bd("", 300);
        Object object2 = object;
        ((am)object2).a(bd2, true);
        bd2 = new bd("", 12350);
        object2 = object;
        ((am)object2).b(bd2, true);
        ag.b().a((al)object);
    }

    public static al t(String object) {
        object = ag.b().a("Thông tin", (String)object, "Đóng", 12350, 1);
        ((am)object).a((a)ag.b());
        ag.b().a((al)object, false);
        return object;
    }

    public final boolean m(int n) {
        if (n == 99006) {
            du.a().p();
            this.a((String)null, (il)null);
            return true;
        }
        if (m == null || !o || gr.b) {
            if (n == 99005) {
                ks.a().w();
                this.a((String)null, (il)null);
                return true;
            }
            if (n == 99004) {
                du.a().o();
                this.a((String)null, (il)null);
                return true;
            }
            return false;
        }
        if (n == 99005 || n == 99004) {
            if (n == 99005) {
                ks.a().w();
                this.a((String)null, (il)null);
                return true;
            }
            if (!gr.b) {
                this.t = n;
                al al2 = this.a("Chú ý", "Bạn nên tham khảo những điều khoản về nạp KEN.", "Nạp KEN", 302, "Xem", 301, 1);
                al2.a(this);
                this.a(al2, false);
                gr.b = true;
                return true;
            }
            if (n == 99004) {
                du.a().o();
                this.a((String)null, (il)null);
                return true;
            }
        }
        return false;
    }

    public static void e(String[] stringArray) {
        if (((a)ag.b()).c(241218)) {
            hm hm2 = (hm)((a)ag.b()).d(241218);
            hm2.a(stringArray);
            return;
        }
        hm hm3 = new hm(stringArray);
        ag.b().a(hm3, false);
    }

    public final void c(boolean bl) {
        go.k.Z = bl;
        if (this.c(241202)) {
            hh hh2 = (hh)this.d(241202);
            hh2.j(bl);
        }
        if (this.a != null && this.a.h() == 1) {
            bf bf2 = (oa)this.a;
            if (bf2.k != null) {
                bf2 = bf2.k;
                if (((ol)bf2).p != null && ((ol)bf2).p.b() == 1) {
                    ((om)((ol)bf2).p).a(go.k, true);
                }
            }
        }
        this.v();
    }

    public final void d(boolean bl) {
        go.k.aa = bl;
        this.v();
        if (bl) {
            go.k.e = (byte)2;
            return;
        }
        if (go.k.e == 2) {
            go.k.e = 0;
        }
    }

    public final void a(int[] object, String[] objectArray) {
        this.v();
        if (this.n(1)) {
            oa oa2 = (oa)this.a;
            String[] stringArray = objectArray;
            objectArray = (Object[])object;
            object = oa2;
            if (oa2.k != null) {
                object.k.a((int[])objectArray, stringArray);
            }
        }
    }

    public final void a(lr[] lrArray) {
        if (this.n(1)) {
            g.a(lrArray, new b(this));
            ((oa)this.a).a(lrArray);
        }
    }

    public final void a(String object, String string, long l, int n2) {
        if (this.a != null && this.a.h() == 1) {
            int n3 = n2;
            long l2 = l;
            String string2 = string;
            string = object;
            object = (oa)this.a;
            if (((oa)object).k != null) {
                ((oa)object).k.a(string, string2, l2, n3);
            }
        }
    }

    public final void a(byte[] byArray, byte[] byArray2) {
        this.v();
        ag.b().a(10, true, false, null, new Object[]{byArray, byArray2});
    }

    public final aq a(aw object, int n2) {
        if ((object = ((aw)object).i(n2)) instanceof gn) {
            return (gn)object;
        }
        return null;
    }

    public final void u(String string) {
        he he2 = (he)this.d(241223);
        ((ff)he2.e(1)).c(string);
    }

    public final void T() {
        if (this.a.h() == 2) {
            ct.a("[SQLOGIN] login thanh cong!");
            ks.a().a(go.e, (byte)1);
            return;
        }
        if (this.a.h() == 3) {
            ct.a("[SQLOGIN] login thanh cong!");
            ks.a().a(go.e, (byte)1);
        }
    }

    public final void a(String object, byte by2, byte by3, df df2, df df3, df df4) {
        Object object2;
        byte by4;
        df df5;
        df df6;
        if (go.k != null && go.k.b.equals(object)) {
            df6 = df4;
            df5 = df3;
            df df7 = df2;
            by4 = by3;
            byte by5 = by2;
            object2 = go.k;
            go.k.g = by5;
            ((lh)object2).f = by4;
            ((lh)object2).U = df7;
            ((lh)object2).V = df5;
            ((lh)object2).W = df6;
        }
        if (this.a != null && this.a.h() == 1) {
            String string = object;
            object = df4;
            df6 = df3;
            df5 = df2;
            byte by6 = by3;
            by4 = by2;
            String string2 = string;
            object2 = (oa)this.a;
            if (((oa)object2).k != null) {
                ol cfr_ignored_0 = ((oa)object2).k;
            }
        }
    }

    public final void a(String string, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12) {
        int n13;
        if (go.k != null && go.k.b.equals(string)) {
            int n14 = n12;
            int n15 = n11;
            int n16 = n10;
            int n17 = n9;
            int n18 = n8;
            n13 = n7;
            n12 = n6;
            n11 = n5;
            n10 = n4;
            n9 = n3;
            n8 = n2;
            lh lh2 = go.k;
            go.k.G = n8;
            lh2.h = n9;
            lh2.j = n10;
            lh2.i = n11;
            lh2.k = n12;
            lh2.l = n13;
            lh2.m = n18;
            lh2.n = n17;
            lh2.o = n16;
            lh2.p = n15;
            lh2.q = n14;
        }
        if (this.a != null && this.a.h() == 1) {
            n13 = n6;
            n12 = n5;
            n11 = n4;
            n10 = n3;
            n9 = n2;
            String string2 = string;
            oa oa2 = (oa)this.a;
            if (oa2.k != null) {
                ol ol2 = oa2.k;
                if (ol2.p != null && ol2.p.b() == 1) {
                    ((om)ol2.p).a(go.k, true);
                }
            }
        }
    }

    public final void a(String string, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        Object object;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        if (go.k != null && go.k.b.equals(string)) {
            n14 = n8;
            n13 = n7;
            n12 = n6;
            n11 = n5;
            n10 = n4;
            n9 = n3;
            int n15 = n2;
            object = go.k;
            go.k.s = n15;
            ((lh)object).r = n9;
            ((lh)object).J = n10;
            ((lh)object).M = n11;
            ((lh)object).N = n12;
            ((lh)object).H = n13;
            ((lh)object).I = n14;
        }
        if (this.a != null && this.a.h() == 1) {
            int n16 = n8;
            n14 = n7;
            n13 = n6;
            n12 = n5;
            n11 = n4;
            n10 = n3;
            n9 = n2;
            String string2 = string;
            object = (oa)this.a;
            if (((oa)object).k != null) {
                ol ol2 = ((oa)object).k;
                if (ol2.p != null && ol2.p.b() == 1) {
                    ((om)ol2.p).a(go.k, false);
                }
            }
        }
    }

    public final void a(String object, ll[] llArray) {
        if (go.k != null && object.equals(go.k.b)) {
            mb.a();
            go.k.D = llArray;
        }
        if (this.a != null && this.a.h() == 1) {
            ll[] llArray2 = object;
            object = llArray;
            object = llArray2;
            object = (oa)this.a;
            if (object.k != null) {
                object = object.k;
                if (object.p != null && object.p.b() == 1) {
                    ((om)object.p).a(go.k, true);
                }
            }
        }
        if ((object = this.d(241202)) != null) {
            ((hh)object).w();
        }
    }

    public final void a(lv[] lvArray) {
        go.k.E = lvArray;
    }

    public final void a(String object, int n2, int n3, int n4, String string, String string2, String string3) {
        Object object2;
        int n5;
        int n6;
        String string4;
        String string5;
        if (go.k != null && go.k.b.equals(object)) {
            string5 = string3;
            string4 = string2;
            String string6 = string;
            n6 = n4;
            n5 = n3;
            int n7 = n2;
            object2 = go.k;
            go.k.K = n7;
            ((lh)object2).L = n5;
            ((lh)object2).ab = n6;
            ((lh)object2).S = string6;
            ((lh)object2).R = string4;
            ((lh)object2).Q = string5;
        }
        if (this.a != null && this.a.h() == 1) {
            String string7 = object;
            object = string3;
            string5 = string2;
            string4 = string;
            int n8 = n4;
            n6 = n3;
            n5 = n2;
            String string8 = string7;
            object2 = (oa)this.a;
            if (((oa)object2).k != null) {
                object = ((oa)object2).k;
                if (((ol)object).p != null && ((ol)object).p.b() == 1) {
                    ((om)((ol)object).p).a(go.k, true);
                }
            }
        }
    }

    public final void U() {
        this.v();
        al al2 = ((a)ag.b()).d(241201);
        if (al2 != null) {
            lh lh2 = go.k;
            al2 = (gy)al2;
            ((gy)al2).k.b(lh2);
        }
        if ((al2 = ((a)ag.b()).d(241203)) != null) {
            ((ib)al2).a(go.k);
        }
    }

    public final void a(String[] stringArray, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4) {
        int n2;
        int n3 = 0;
        while (n3 < stringArray.length) {
            n2 = 0;
            while (n2 < go.l.length) {
                if (go.l[n2].c.equals(stringArray[n3])) {
                    go.l[n2].p = nArray[n3];
                    go.l[n2].q = nArray2[n3];
                    break;
                }
                ++n2;
            }
            ++n3;
        }
        n3 = 0;
        while (n3 < nArray3.length) {
            n2 = 0;
            while (n2 < go.m.length) {
                if (go.m[n2].a == nArray3[n3]) {
                    go.m[n2].g = nArray4[n3];
                    break;
                }
                ++n2;
            }
            ++n3;
        }
    }

    public final void v(String string) {
        if (this.c(241202)) {
            hh hh2 = (hh)this.d(241202);
            hh2.b(string);
            return;
        }
        com.mg.sq.a.t(string);
    }

    public final void c(ll ll2) {
        go.a(ll2);
        if (this.c(241202)) {
            hh hh2 = (hh)this.d(241202);
            hh2.b(ll2);
        }
    }

    public final void a(lm[] lmArray) {
        int n2 = 0;
        while (n2 < lmArray.length) {
            lm lm2 = lmArray[n2];
            go.a(lm2, lm2.g);
            if (this.c(241202)) {
                hh hh2 = (hh)this.d(241202);
                hh2.c(lm2);
            }
            ++n2;
        }
    }

    public final void f(int n2, int n3) {
        al al2 = this.d(241202);
        if (al2 != null) {
            ((hh)al2).j(n2, n3);
            return;
        }
        int n4 = 0;
        while (n4 < go.m.length) {
            if (go.m[n4].a == n2) {
                go.b(n2, go.m[n4].g - n3);
                return;
            }
            ++n4;
        }
    }

    public final void a(lt[] object) {
        go.k.ac = object;
        if (this.a != null && this.a.h() == 1) {
            lt[] ltArray = object;
            object = (oa)this.a;
            if (object.k != null) {
                object = object.k;
                if (object.p instanceof om) {
                    ((om)object.p).a(ltArray);
                }
            }
        }
    }

    public final void e(String object, String string) {
        if (this.c(241231)) {
            this.e(241231);
        }
        ox ox2 = null;
        d d2 = null;
        hh hh2 = (hh)this.d(241202);
        if (hh2 != null) {
            ox2 = hh2.y();
            d2 = hh2.z();
        }
        object = new ho((String)object, string, ox2, d2);
        this.a((al)object, false);
        this.v();
    }

    public final void a(String object, String string, String string2) {
        if (this.c(241232)) {
            this.e(241232);
        }
        ox ox2 = null;
        d d2 = null;
        hh hh2 = (hh)this.d(241202);
        if (hh2 != null) {
            ox2 = hh2.y();
            d2 = hh2.z();
        }
        object = new id((String)object, string, string2, ox2, d2);
        this.a((al)object, false);
        this.v();
    }

    public final void a(String object, ll[] llArray, lm[] lmArray, byte by2) {
        object = this.d(241231);
        if (object != null) {
            ((ho)object).a(llArray, lmArray, by2);
        }
    }

    public final void a(String string, String string2, byte by2, long l) {
        al al2 = this.d(241231);
        if (al2 != null) {
            ((ho)al2).b(string, string2, by2, l);
        }
    }

    public final void b(String string, String string2, byte by2, long l) {
        al al2 = this.d(241231);
        if (al2 != null) {
            ((ho)al2).a(string, string2, by2, l);
        }
    }

    public final void a(String string, byte by2, long l) {
        al al2 = this.d(241231);
        if (al2 != null) {
            ((ho)al2).b(string, by2, l);
        }
    }

    public final void a(int n2, int n3, String string, byte by2, long l) {
        al al2 = this.d(241231);
        if (al2 != null) {
            ((ho)al2).a(string, by2, l);
        }
    }

    public final void c(String string, String string2, byte by2, long l) {
        al al2 = this.d(241232);
        if (al2 != null) {
            ((id)al2).a(string, string2, by2, l);
        }
    }

    public final void b(String string, byte by2, long l) {
        al al2 = this.d(241232);
        if (al2 != null) {
            ((id)al2).b(string, by2, l);
        }
    }

    public final void b(int n2, int n3, String string, byte by2, long l) {
        al al2 = this.d(241232);
        if (al2 != null) {
            ((id)al2).a(string, by2, l);
        }
    }

    public final void d(String string, String string2, byte by2, long l) {
        al al2 = this.d(241232);
        if (al2 != null) {
            ((id)al2).b(string, string2, by2, l);
        }
    }

    public final void b(String object, ll[] llArray, lm[] lmArray, byte by2) {
        object = this.d(241232);
        if (object != null) {
            ((id)object).a(llArray, lmArray, by2);
        }
    }

    public final void w(String string) {
        this.v();
        ((a)ag.b()).a(241217, false);
        if (i.b(string)) {
            string = "Nạp thẻ thành công";
        }
        com.mg.sq.a.t(string);
    }

    public final void b(String string, String string2, String[] object, String[] object2) {
        this.v();
        ((a)ag.b()).v();
        u = string2;
        v = object2;
        int n2 = v.t < 320 ? v.t - 20 : 200;
        object2 = new he();
        aq aq2 = new bb(string, n2 - 20, bx.c);
        aq2.a_(10, 10);
        int n3 = 10 + (aq2.f() + 5 + bx.d.a());
        ((he)object2).a(aq2);
        aq2 = new gg("Mạng điện thoại");
        aq2.a_(1);
        ((gg)aq2).a((Object[])object);
        ((gg)aq2).a(10, n3, n2 - 20, 20);
        ((gg)aq2).d(true);
        ((he)object2).a(aq2);
        object = new ff("Số Seri", 100, 2);
        ((ff)object).i(2);
        ((aq)object).a_(3);
        ((ff)object).a(10, n3 += aq2.f() + 5 + bx.d.a(), n2 - 20, 20);
        n3 += ((aq)object).f() + 5 + bx.d.a();
        ((he)object2).a((aq)object);
        object = new ff("Mã số nạp tiền", 100, 4);
        ((ff)object).i(3);
        ((aq)object).a_(2);
        ((ff)object).a(10, n3, n2 - 20, 20);
        ((he)object2).a((aq)object);
        int n4 = n2 / 2 - 70;
        aq2 = new ex("Nạp", 209);
        aq2.a(n4, n3 += ((aq)object).f() + 5, 50, 20);
        ((he)object2).a(aq2);
        n4 = aq2.c() + aq2.e() + 40;
        aq2 = new ex("Đóng", 12350);
        aq2.a(n4, n3, 50, 20);
        ((he)object2).a(aq2);
        n3 += aq2.f();
        ((al)object2).a(v.t - n2 >> 1, v.u - (n3 += 10) >> 1, n2, n3);
        ((am)object2).a((a)ag.b());
        ((am)object2).b(241217);
        bd bd2 = new bd("", 209);
        Object object3 = object2;
        ((am)object3).a(bd2, true);
        bd2 = new bd("", 12350);
        object3 = object2;
        ((am)object3).b(bd2, true);
        ag.b().a((al)object2);
    }

    public final void V() {
        ct.a("[SQGameBoard]======================receiveQuitRoom=============");
        bf bf2 = (oa)this.a;
        if (bf2.k != null) {
            bf2 = bf2.k;
            if (((ol)bf2).p != null && ((ol)bf2).p.b() == 3) {
                ((os)((ol)bf2).p).r();
                return;
            }
            ((ol)bf2).r = null;
        }
    }

    public final void b(lr[] lrArray) {
        ((oa)this.a).b(lrArray);
    }

    public final void W() {
        ks.a().b();
        Object object = "SnbcnF`ldjgnmfahmgsgtnmf+jdsmnhunhl`xbgtrdahmf`s";
        object = "SnbcnF`ldjgnmfahmgsgtnmf+jdsmnhunhl`xbgtrdahmf`s".toCharArray();
        int n2 = 0;
        while (n2 < ((Object)object).length) {
            object[n2] = (char)(object[n2] + true);
            ++n2;
        }
        object = new String((char[])object);
        al al2 = ag.b().a(" ", (String)object, "Đóng", 12349, 1);
        al2.a(false);
        al2.a(this);
        ag.b().a(al2);
    }

    public final void a(String string, long l) {
        this.v();
        System.out.println("[receiveAddEquipToMarket]====================" + l);
        ((a)ag.b()).e(241234);
        if (this.c(241202)) {
            hh hh2 = (hh)this.d(241202);
            hh2.a(string);
            return;
        }
        if (this.c(241235)) {
            this.d(241235);
            hq.t();
        }
    }

    public final void a(String string, ll[] llArray, lm[] lmArray) {
        this.v();
        if (this.c(241235)) {
            hq hq2 = (hq)this.d(241235);
            hq2.a(string, llArray, lmArray);
        }
    }

    public final void g(int n2, int n3) {
        block4: {
            this.v();
            this.e(241234);
            if (this.c(241202)) {
                hh hh2 = (hh)this.d(241202);
                int n4 = n3;
                n3 = n2;
                hh hh3 = hh2;
                ((a)ag.b()).e(-446456);
                ((a)ag.b()).e(-1122154);
                hh3.i(n3, n4);
                int n5 = 0;
                while (n5 < go.m.length) {
                    if (go.m[n5].a == n3) {
                        go.b(n3, n4);
                        break block4;
                    }
                    ++n5;
                }
                return;
            }
            if (this.c(241235)) {
                this.d(241235);
                hq.t();
            }
        }
    }

    public final void a(int n2, int n3, lq[] lqArray) {
        if (n2 != -1) {
            al al2 = this.d(241233);
            if (al2 != null) {
                ((hn)al2).a(n2, n3, lqArray);
                return;
            }
        } else {
            if (this.c(241233)) {
                this.e(241233);
            }
            if (this.c(241235)) {
                al al3 = this.d(241235);
                ((hq)al3).a(lqArray);
                return;
            }
            hq hq2 = new hq(lqArray);
            this.a(hq2, false);
            this.v();
        }
    }

    public final void b(String string, ll[] llArray, lm[] lmArray) {
        if (this.c(241233)) {
            hn hn2 = (hn)this.d(241233);
            hn2.a(string, llArray, lmArray);
        }
    }

    public final void b(lf[] object) {
        if (this.c(241233)) {
            this.e(241233);
        } else if (this.c(241235)) {
            this.e(241235);
        }
        object = new hn((lf[])object);
        this.a((al)object, false);
        this.v();
    }
}
