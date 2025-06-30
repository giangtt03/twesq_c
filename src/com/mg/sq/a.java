// Decompiled with: Procyon 0.6.0
// Class Version: 1
package com.mg.sq;
import com.mg.bas.ah;
import com.mg.bas.aq;
import com.mg.bas.aw;
import com.mg.bas.bn;
import com.mg.bas.df;
import com.mg.bas.dh;
import com.mg.bas.doo;
import com.mg.bas.ih;
import com.mg.bas.iff;
import com.mg.bas.jm;
import com.mg.bas.jn;
import com.mg.bas.jo;
import com.mg.bas.kq;
import com.mg.bas.lf;
import com.mg.bas.lh;
import com.mg.bas.ll;
import com.mg.bas.lm;
import com.mg.bas.lq;
import com.mg.bas.lr;
import com.mg.bas.lt;
import com.mg.bas.lv;
import com.mg.bas.lw;
import com.mg.bas.ns;
import com.mg.bas.il;
import com.mg.bas.d;
import com.mg.bas.oi;
import com.mg.bas.cp;
import com.mg.bas.az;
import com.mg.bas.am;
import com.mg.bas.an;
import com.mg.bas.be;
import com.mg.bas.bf;
import com.mg.bas.al;
import com.mg.bas.he;
import com.mg.bas.hl;
import com.mg.bas.ge;
import com.mg.bas.by;
import com.mg.bas.oy;
import com.mg.bas.bx;
import com.mg.bas.ag;
import com.mg.bas.ax;
import com.mg.bas.co;
import com.mg.bas.ab;
import com.mg.bas.ac;
import com.mg.bas.ct;
import com.mg.bas.ag;
import com.mg.bas.oa;
import com.mg.bas.ob;
import com.mg.bas.og;
import com.mg.bas.nv;
import com.mg.bas.nx;
import com.mg.bas.ny;
import com.mg.bas.of;
import com.mg.bas.od;
import com.mg.bas.nw;
import com.mg.bas.oe;
import com.mg.bas.go;
import com.mg.bas.ci;
import com.mg.bas.pa;
import com.mg.bas.ks;
import com.mg.bas.ff;
import com.mg.bas.ey;
import com.mg.bas.gg;
import com.mg.bas.fx;
import com.mg.bas.du;
import com.mg.bas.pd;
import com.mg.bas.hd;
import com.mg.bas.om;
import com.mg.bas.oq;
import com.mg.bas.v;
import com.mg.bas.ie;
import com.mg.bas.gt;
import com.mg.bas.ol;
import com.mg.bas.os;
import com.mg.bas.gr;
import com.mg.bas.gy;
import com.mg.bas.hs;
import com.mg.bas.hh;
import com.mg.bas.ft;
import com.mg.bas.gi;
import com.mg.bas.ia;
import com.mg.bas.bb;
import com.mg.bas.ex;
import com.mg.bas.bd;
import com.mg.bas.bf;
import com.mg.bas.hp;
import com.mg.bas.ba;
import com.mg.bas.gc;
import com.mg.bas.ay;
import com.mg.bas.fu;
import com.mg.bas.gn;
import com.mg.bas.hq;
import com.mg.bas.hn;
import com.mg.bas.hg;
import com.mg.bas.jz;
import com.mg.bas.lb;
import com.mg.bas.jp;
import com.mg.bas.ll;
import com.mg.bas.hv;
import com.mg.bas.hm;
import com.mg.bas.mb;
import com.mg.bas.ib;
import com.mg.bas.ox;
import com.mg.bas.ho;
import com.mg.bas.id;

import javax.microedition.lcdui.Image;
import com.mg.smsgame.MGMIDlet;

public abstract class a extends ah implements bn, ih, kq
{
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
        j = -1;
        r = new a() {
            public void a(String[] var1, int[] var2, int[] var3, int[] var4, int[] var5) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        l = null;
        m = null;
        n = new ge();
        o = false;
    }
    
    public static void q() {
        (g = new by(4863)).a(4863);
        (h = new iff(new int[] { 16777215, 16646144 })).a(16646144);
        if ((com.mg.bas.v.t >= 230 && com.mg.bas.v.u >= 310) || com.mg.bas.v.u > com.mg.bas.v.t) {
            k = 0;
            return;
        }
        k = 1;
    }
    
    public static void r() {
        g = (h = bx.d);
        oy.b();
    }
    
    public static a s() {
        return (a)ag.b();
    }
    
    public a() {
        super();
        this.a(new ax(5));
    }
    
    public static boolean t() {
        return com.mg.bas.v.O;
    }
    
    protected final void h() {
        if (m != null) {
            m.H();
        }
        com.mg.bas.ks.a().c();
        if (o) {
            com.mg.bas.du.a().g();
        }
    }
    
    private boolean n(final int n) {
        return super.a != null && super.a.h() == 1;
    }
    
    public static void a(final am am) {
        if (am == null) {
            return;
        }
        i(am.h());
    }
    
    public static void i(final int n) {
        if (!com.mg.bas.v.N || (com.mg.bas.v.ah && com.mg.bas.v.O)) {
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
            default: {
                co.b().a("lv1", -1);
                co.b().a(139051);
                co.b().e();
            }
        }
    }
    
    public final void p() {
        super.d = new ab();
        super.c = new ac();
    }
    
    protected final an a(final int n, final int n2, final Object[] array) {
        ct.b("Before createScreen(" + n + ", " + n2 + ")");
        com.mg.bas.v.ag = false;
        an an = null;
        switch (n2) {
            case 1: {
                an = new oa();
                break;
            }
            case 2: {
                an = new ob();
                break;
            }
            case 3: {
                an = new nw();
                break;
            }
            case 4: {
                an = new og();
                break;
            }
            case 6: {
                an = new nv();
                break;
            }
            case 5: {
                if (array != null && array.length > 0) {
                    return new nx((String)array[0]);
                }
                an = new nx();
                break;
            }
            case 7: {
                final ny ny = new ny(((Integer)array[0]).intValue());
                if (array.length == 2) {
                    ny.a((String)array[1]);
                }
                an = ny;
                break;
            }
            case 8: {
                an = new of((String)array[0]);
                break;
            }
            case 9: {
                an = new od(n);
                break;
            }
            case 10: {
                if (array != null && array.length > 0) {
                    an = new oe(n, (byte[])array[0], (byte[])array[1]);
                    break;
                }
                return null;
            }
        }
        ct.b("After createScreen(" + n + ", " + n2 + ")");
        return an;
    }
    
    public static void a(final be be) {
        ci.a("KS " + go.e, "8031", be);
    }
    
    public static void b(final be be) {
        ci.a("MS " + go.e, "8031", be);
    }
    
    public static void c(final be be) {
        ci.a("XT " + go.e, "8031", be);
    }
    
    public final void d(final int n, final int n2) {
        super.d(n, n2);
        switch (n2) {
            case 12357: {
                this.a(false);
                this.S();
                return;
            }
            case 12356: {
                this.a(false);
                c((be)null);
                return;
            }
            case 12353:
            case 12354: {
                MGMIDlet.d();
                MGMIDlet.b("1900588883");
                if (n2 == 12353) {
                    this.a(false);
                    return;
                }
                break;
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
                MGMIDlet.d().notifyDestroyed();
                return;
            }
            case 12361: {
                pa.a().c();
                MGMIDlet.d().notifyDestroyed();
                return;
            }
            case 12345: {
                this.v();
                if (this.p != null) {
                    this.p.t();
                    this.p = null;
                    return;
                }
                break;
            }
            case 12347: {
                X();
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
                final he he;
                final String trim;
                String s;
                if (com.mg.bas.i.b(trim = ((ff)(he = (he)this.d(-241249)).e(1)).r().toLowerCase().trim())) {
                    if (!trim.equals(go.e)) {
                        final ff ff = (ff)he.e(5);
                        long n3 = 0L;
                        if (!ff.r().equals("")) {
                            n3 = Integer.parseInt(ff.r()) * 1000;
                        }
                        if (go.k.aa) {
                            s = "Bạn đang ở bật chế độ chặn khiêu chiến. Bạn không thể chiến đấu ngay lúc này. Hãy tắt chế độ chặn khiêu chiến để chiến đấu nào! (Hướng dẫn: Bạn hãy chọn Menu > Hỗ trợ > Cài đặt)";
                        }
                        else {
                            if (go.s <= -1L || n3 <= go.s) {
                                if (go.s < 0L) {
                                    n3 = 0L;
                                }
                                ag.b().a(false);
                                ks.a().a(trim, "Ngon thì nhào vô đây!", ((ey)he.e(6)).a(), n3, ((ey)he.e(7)).a(), ((ey)he.e(10)).a());
                                this.f(trim);
                                ((oa)super.a).l = trim;
                                return;
                            }
                            s = "Vượt quá số tiền bạn đang có. Vui lòng thử lại!!!";
                        }
                    }
                    else {
                        s = "Nhập trùng tên. Vui lòng nhập lại!!!";
                    }
                }
                else {
                    s = "Bạn chưa nhập tên đối thủ.";
                }
                final al a;
                (a = ag.b().a("Chú ý", s, "Đóng", 199199, 1)).b(199199);
                a.a(this);
                ag.b().a(a, false);
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
                final he he2;
                if ((he2 = (he)this.d(-241249)) == null) {
                    return;
                }
                final String trim2;
                if (com.mg.bas.i.b(trim2 = ((ff)he2.e(1)).r().toLowerCase().trim())) {
                    final al a2;
                    (a2 = ag.b().a("Chú ý", "Bạn chưa nhập tên đối thủ.", "Đóng", 199199, 1)).b(199199);
                    a2.a(this);
                    ag.b().a(a2, false);
                    return;
                }
                if (!trim2.equals(go.e)) {
                    ag.b().a(-241249, false);
                    x(trim2);
                    ks.a().j(trim2);
                    return;
                }
                final al a3;
                (a3 = ag.b().a("Chú ý", "Nhập trùng tên. Vui lòng nhập lại!!!", "Đóng", 199199, 1)).b(199199);
                a3.a(this);
                ag.b().a(a3, false);
                return;
            }
            case 204: {
                this.a(241215, false);
                return;
            }
            case 205: {
                ag.b().a(false);
                if (super.a.h() == 1) {
                    ((oa)super.a).u();
                    return;
                }
                break;
            }
            case 207: {
                this.a(false);
                return;
            }
            case 208: {
                X();
                this.l();
                return;
            }
            case 209: {
                if (this.c(241217)) {
                    try {
                        final he he3;
                        final String r = ((ff)(he3 = (he)this.d(241217)).e(2)).r();
                        final String r2 = ((ff)he3.e(3)).r();
                        if (r == null || r.equals("")) {
                            t("Vui lòng nhập số PIN thẻ cào");
                            return;
                        }
                        if (r2 == null || r2.equals("")) {
                            t("Vui lòng nhập mã số thẻ cào!");
                            return;
                        }
                        ks.a().a(r2, r, v[((gg)he3.e(1)).a()], u);
                        this.a(null, (il)null);
                        return;
                    }
                    catch (final Exception ex) {
//                        final Throwable t;
                        ex.printStackTrace();
                        return;
                    }
                }
                break;
            }
            case 300: {
                if (this.c(0)) {
                    try {
                        ci.a("DEPO", u, w[((fx)((he)this.d(0)).e(1)).a().q()]);
                    }
                    catch (final Exception ex2) {
//                        final Throwable t2;
                        ex2.printStackTrace();
                    }
                    this.a(0, false);
                    return;
                }
                break;
            }
            case 301: {
                ag.b().a(false);
                if (m != null) {
//                    final oi m;
                    m.b(null, "rss://ola/0/2011/12/napken");
                    m.i(true);
                    return;
                }
                break;
            }
            case 302: {
                ag.b().a(false);
                this.m(this.t);
                return;
            }
            case 12358: {
                this.a(false);
                du.a().b((short)2412);
                this.a(null, (il)null, 10000);
                return;
            }
            case 123523: {
                this.l();
                this.Y();
                return;
            }
            case 303: {
                pd.b(((ey)((he)this.d(241221)).e(6)).a());
                this.a(241221, false);
                this.N();
                return;
            }
            case 304: {
                pd.b(((ey)((he)this.d(241221)).e(6)).a());
                this.a(241221, false);
                return;
            }
            case 12359: {
                final he he4;
                if ((he4 = (he)this.d(241223)) == null) {
                    break;
                }
                final String r3;
                if (!com.mg.bas.i.b(r3 = ((ff)he4.e(1)).r())) {
                    du.a().b(r3, null, q);
                    this.e(241223);
                    final al a4;
                    (a4 = this.a("", "Gửi thành công!", "Đóng", 12350, 1)).a(this);
                    ag.b().a(a4);
                    return;
                }
                final al a5;
                (a5 = ag.b().a("Chú ý", "Bạn chưa nhập tên nick", "Đóng", 12350, 1)).a(this);
                ag.b().a(a5);
                return;
            }
            case 12360: {
                if (this.d(241223) != null) {
                    final hd hd;
                    (hd = new hd()).a((ih)this);
                    ag.b().a(hd, false);
                    return;
                }
                break;
            }
            case 305: {
                this.a(false);
                break;
            }
        }
    }
    
    public static void u() {
        b(true);
    }
    
    public static void b(final boolean b) {
        if (b) {
            final al a;
            (a = ag.b().a("Chú ý", "Bạn có muốn đăng xuất không?", "Có", 12347, "Không", 12350, 1)).a(ag.b());
            ag.b().a(a, false);
            return;
        }
        X();
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
        ag.b().l();
        if (com.mg.bas.v.ae) {
            ((a)ag.b()).a(null, (il)null);
            ag.b().f(2);
            return;
        }
        MGMIDlet.d().notifyDestroyed();
    }
    
    public final void o() {
        this.v();
        int n = 12350;
        if (super.a != null && super.a.h() == 1) {
            if (this.d(-241249) != null) {
                this.a(-241249, false);
                n = 100;
            }
            if (this.d(241214) != null) {
                ks.a().l();
                this.a(241214, false);
                n = 203;
            }
            ((oa)super.a).y();
        }
        this.c("Hết thời gian thực thi.", n);
    }
    
    public final void v() {
        this.a(11111, false);
    }
    
    public final void a(final String s) {
        this.c(s, 12350);
    }
    
    private void c(final String s, final int n) {
        final al a;
        (a = this.a("Thông tin", s, "Đóng", n, "Hỗ trợ", 12353, 1)).a(this);
        this.a(a, false);
    }
    
    public final void a(final String s, final il il) {
        this.a(s, il, al.a);
    }
    
    public final void a(final String s, final il p3, final int n) {
        this.p = p3;
        final ie ie;
        (ie = new ie(s)).b(11111);
        ie.a(n);
        this.a(ie);
    }
    
    public static al a(final lh lh, final int n, final int n2, final bf bf, final long x, final String s, final boolean b, final boolean b2) {
        try {
            lh.X = x;
            final gt gt = new gt(lh, s, b, b2);
            ag.b().a(gt, false);
            return gt;
        }
        catch (final Exception ex) {
            final al a;
            (a = ag.b().a("", String.valueOf(lh.b) + " muốn khiêu chiến bạn. Bạn đồng ý không?", "Đồng ý", n, "Không", n2, 1)).b(-241209);
            a.a(bf);
            ag.b().a(a, false);
            return a;
        }
    }
    
    public final void j(final int n) {
        int n2 = 12349;
        String s = "Lỗi ứng dụng số: " + n;
        if (n == 3) {
            n2 = 12361;
            s = String.valueOf(s) + ". Máy không đủ bộ nhớ. Vui lòng xóa bớt ứng dụng hoặc chuyển game qua bộ nhớ máy hoặc thẻ. Yêu cầu bộ nhớ trống ít nhất 5Mb. Mọi chi tiết xin liên hệ tổng đài để hỗ trợ!";
        }
        final al a;
        (a = this.a("Thông tin", s, "Thoát", n2, "Hỗ trợ", 12354, 1)).a(this);
        this.a(a, false);
    }
    
    public final void a(int n, String s) {
        r.a();
        if (super.b != null && super.b.h() == 241219) {
            final al a;
            (a = ag.b().a("Thông tin", s, "Đóng", 12350, 1)).a(ag.b());
            ag.b().a(a, false);
            return;
        }
        if (super.a != null && super.a.h() != 2 && !this.c(241222)) {
            this.a(false);
        }
        if (n == 13) {
            if (super.a instanceof oa) {
                ((oa)super.a).a(s);
            }
            return;
        }
        if (n == 35) {
            final al a2;
            (a2 = ag.b().a("Chú ý", "Tài khoản chưa được xác thưc. Vui lòng xác thực, để sử dụng các tính năng này!", "Xác thực", 123523, "Đóng", 12350, 1)).a(ag.b());
            ag.b().a(a2, false);
            return;
        }
        if (n == 12) {
            final al a3;
            (a3 = ag.b().a("Chú ý", (s == null) ? "Rương đã đầy. Vui lòng bỏ bớt đồ ra hoặc mua thêm ngăn chứa" : s, "Đóng", 305, 1)).a(ag.b());
            ag.b().a(a3, false);
            return;
        }
        s = ((s == null) ? " - Lỗi không xác định." : s);
        this.a(11111, false);
        int n2 = 12350;
        String s2 = "Đóng";
        int n3 = 12353;
        String s3 = "Hỗ trợ";
        if (n == 18) {
            n2 = 12352;
            s2 = "Nạp KEN";
            n3 = 12350;
            s3 = "Đóng";
        }
        else if (n == 1 || n == 2) {
            if (super.a != null && super.a.h() == 5 && (n = ((((nx)super.a).e() || n == 2) ? 1 : 0)) != 0) {
                s = "Không thể kết nối tới máy chủ. Vui lòng kiểm tra cấu hình và kết nối GPRS";
                n2 = 12349;
                s2 = "Thoát";
                n3 = 12354;
            }
        }
        else if (n == 11) {
            ((oa)super.a).A();
        }
        else if (n == 0 && super.a != null) {
            if (super.a.h() == 8) {
                ((of)super.a).f();
            }
            else if (super.a.h() == 1) {
                ((oa)super.a).x();
            }
        }
        final al a4;
        (a4 = ag.b().a("Thông tin", s, s2, n2, s3, n3, 1)).a(ag.b());
        ag.b().a(a4, false);
    }
    
    public final void w() {
        final al a;
        (a = this.a(" ", "Tài khoản của bạn vừa được đăng nhập ở một nơi khác.", "Đóng", 12347, 1)).a(false);
        a.b(241227);
        a.a(this);
        this.a(a);
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
        final al a;
        (a = this.a("Chú ý", "Mất kết nối với máy chủ!", "Đóng", 12347, 1)).a(this);
        this.a(a, false);
    }
    
    public final void a(final String s, final doo doo, final String s2, final long n) {
        final oa oa;
        final ol k;
        if (super.a != null && super.a.h() == 1 && (oa = (oa)super.a).k != null && (k = oa.k).p instanceof os) {
            ((os)k.p).b(s, doo, s2, n);
        }
    }
    
    public final void b(final String s, final doo doo, final String s2, final long n) {
        final oa oa;
        final ol k;
        if (super.a != null && super.a.h() == 1 && (oa = (oa)super.a).k != null && (k = oa.k).p instanceof os) {
            ((os)k.p).a(s, doo, s2, n);
        }
    }
    
    public final void a(final String s, String s2) {
        if (super.a != null && super.a.h() == 1) {
            final oa oa = (oa)super.a;
            final String s3 = s2;
            s2 = s;
            final oa oa2 = oa;
            if (oa.k != null) {
                final ol k = oa2.k;
                final String s4 = s2;
                final String s5 = s3;
                s2 = s4;
                final ol ol = k;
                if (k.p instanceof os) {
                    ((os)ol.p).a(s2, s5);
                }
            }
        }
    }
    
    public final void A() {
        if (super.a != null && super.a.h() == 1) {
            ((oa)super.a).g();
        }
    }
    
    public final void a(final ns[] array) {
        if (super.a != null && super.a.h() == 1) {
            ((oa)super.a).a(array);
        }
        this.v();
    }
    
    public final void B() {
        if (super.a != null && super.a.h() == 1) {
            ((oa)super.a).t();
        }
        this.v();
    }
    
    public final void a(final lh lh, final byte b) {
        if (b == 103) {
            b(lh);
            this.v();
            return;
        }
        if (b == 1) {
            go.k = lh;
        }
        else if (b == 101) {
            if (super.a != null && super.a.h() == 1) {
                final oa oa;
                if ((oa = (oa)super.a).k != null) {
                    final ol k = oa.k;
                    if (b == 101 && k.p instanceof os) {
                        ((os)k.p).b(lh);
                    }
                }
            }
        }
        else if (b == 99) {
            this.v();
            go.k = lh;
            G();
            return;
        }
        if (super.a != null) {
            if (super.a.h() == 3) {
                final an a = super.a;
            }
            else if (super.a.h() == 1) {
                if (b == 104 || b == 106) {
                    b(lh);
                    this.v();
                }
                return;
            }
            else {
                if (super.a.h() != 2) {
                    return;
                }
                final an a2 = super.a;
                if (gr.k) {
                    ob.d();
                }
            }
            ks.a().b(go.k.g);
        }
    }
    
    public final void a(df[] array, df[] array2, df[] array3, df[] array4, df[] array5, df[] array6) {
        if (super.a != null && super.a.h() == 2) {
            final an a = super.a;
            final df[] array7 = array;
            final df[] array8 = array2;
            final df[] array9 = array3;
            final df[] array10 = array4;
            final df[] array11 = array5;
            array6 = array6;
            array5 = array11;
            array4 = array10;
            array3 = array9;
            array2 = array8;
            array = array7;
            if (gr.k) {
                ob.d();
            }
            final nw nw;
            (nw = new nw()).a(array, array2, array3, array4, array5, array6);
            ag.b().a(nw);
            co.b().a("lv1", -1);
            co.b().e();
            ((a)ag.b()).v();
        }
    }
    
    public final void a(final String s, final doo[] array) {
        final oa oa;
        final ol k;
        if (super.a != null && super.a.h() == 1 && (oa = (oa)super.a).k != null && (k = oa.k).p instanceof os) {
            ((os)k.p).a(s, array);
        }
    }
    
    public final void b(final String s, final String s2) {
        if (super.a != null && super.a.h() == 1) {
            ((oa)super.a).a(s, s2);
        }
    }
    
    public final void a(final String s, final String s2, final int n) {
        if (this.d(241222) != null) {
            gy.a(s, s2, n);
            return;
        }
        if (super.a != null && super.a instanceof og) {
            final an a = super.a;
        }
    }
    
    public final void a(String w, int x, int n) {
        if (super.a != null) {
            if (super.a.h() == 4) {
                final an a = super.a;
                final String s = w;
                final int n2 = x;
                n = n;
                x = n2;
                w = s;
                if (n == 0 && !w.equals("M99")) {
                    go.x = x;
                    go.w = w;
                    ag.b().a(5, new Object[] { w });
                }
                return;
            }
            if (super.a.h() == 1) {
                ((oa)super.a).a(w, x, n);
            }
        }
    }
    
    public final void a(final jn jn, final int[] array, final int n, final int[] array2, final int n2) {
        pa.a().a(jn, array, n, array2, n2);
    }
    
    public final void a(final String s, final jm[] array) {
        pa.a().a(s, array);
    }
    
    public final void a(final jo[] array, final String s) {
        if (super.a != null && super.a.h() == 1) {
            ((oa)super.a).a(array, s);
        }
    }
    
    public final void b(final jo[] array, final String s) {
        if (super.a != null && super.a.h() == 1) {
            ((oa)super.a).a(array, s);
        }
    }
    
    public final void c(final jo[] array, final String s) {
        if (super.a != null && super.a.h() == 1) {
            final oa oa = (oa)super.a;
            final ol k;
            if (go.w.equals(s) && (k = oa.k).p instanceof om) {
                ((om)k.p).a(array);
            }
        }
    }
    
    public final void a(final lh lh, final lh lh2, final boolean b, final byte[] k, final byte[] l, final byte[] m, final int p9, final byte n, final byte o) {
        final lh[] i = { lh };
        final lh[] j = { lh2 };
        hs.k = go.k.J;
        oq.i = i;
        oq.j = j;
        oq.n = n;
        oq.o = o;
        oq.k = k;
        oq.l = l;
        oq.m = m;
        oq.p = p9;
        hs.k = go.k.J;
        hs.l = go.k.G;
        hs.m = go.k.H;
        if (super.a != null && super.a.h() == 1) {
            if (o == 9) {
                ((oa)super.a).a(lh, lh2, b);
                return;
            }
            ((oa)super.a).a(lh, lh2, b, k, l, m, p9, n, o);
        }
    }
    
    public final void a(final ns ns, final boolean b) {
        if (super.a != null && super.a.h() == 1) {
            ((oa)super.a).a(ns, b);
        }
    }
    
    public final void a(final lw[] r) {
        go.r = r;
        if (super.a != null) {
            if (super.a.h() == 2) {
                final an a = super.a;
                ks.a().b(go.e);
                return;
            }
            if (super.a.h() == 3) {
                final an a2 = super.a;
                ks.a().b(go.e);
            }
        }
    }
    
    public final void b(String s) {
        if (super.a != null) {
            if (super.a.h() == 4) {
                final an a = super.a;
                s = s;
                ((a)ag.b()).v();
                final al a2;
                (a2 = ag.b().a("", s, "Đóng", 2, 1)).a(ag.b());
                ag.b().a(a2);
                return;
            }
            if (super.a.h() == 1) {
                final oa oa = (oa)super.a;
                final String s2 = s;
                final ol k = oa.k;
                final String s3 = s2;
                final ol ol = k;
                if (k.p == null || !(ol.p instanceof om)) {
                    return;
                }
                ((a)ag.b()).v();
                ((om)ol.p).e(true);
                ((om)ol.p).l.a(0);
                ((om)ol.p).m.a();
                ((om)ol.p).o = false;
                final al a3;
                (a3 = ag.b().a("Chú ý", s3, "Đóng", 0, 1)).a(ol);
                ag.b().a(a3, false);
            }
        }
    }
    
    public final void e(final int n, int n2) {
        final ah b = ag.b();
        go.a(n, n2);
        if (b.c(241202)) {
            final hh hh = (hh)b.d(241202);
            final int n3 = n2;
            n2 = n;
            final hh hh2 = hh;
            ((a)ag.b()).v();
            hh2.h(n2, n3);
        }
        if (com.mg.bas.v.O) {
            if (this.s == null) {
                this.s = new cp("useitem");
            }
            this.s.b();
        }
    }
    
    public final void c(final String s) {
        super.f.a(new gi(s));
    }
    
    public final void a(final long s) {
        if (s <= 2000L && go.s > s) {
            go.t = true;
        }
        go.s = s;
        final ft ft;
        (ft = new ft(0L)).a(s);
        this.b().a(ft);
        if (this.c(241210)) {
            ((ia)this.d(241210)).a(s);
        }
    }
    
    public final void C() {
        final al a;
        (a = this.a("Thông tin", "Phiên bản hiện tại chưa hỗ trợ tính năng này!", "Đóng", 2, 1)).a(this);
        this.a(a, false);
    }
    
    public static void d(final String s) {
        final he he = new he();
        final bb bb;
        (bb = new bb("Nhập nick", 157, bx.d)).a_(10, 10);
        he.a(bb);
        final int n = 10 + (bb.f() + 3);
        final ff ff;
        (ff = new ff(null, 100, 2)).a_(1);
        ff.a(10, n, 154, 20);
        ff.d(true);
        ff.c(s);
        he.a((aq)ff);
        final int n2 = n + (ff.f() + 5);
        final ff ff2 = new ff("Đặt Cược:", 4, 4);
        final int n3 = n2 + bx.d.a();
        ff2.a(10, n3, bx.d.a("99999"), 18);
        ff2.d(false);
        ff2.a_(5);
        he.a((aq)ff2);
        final bb bb2;
        (bb2 = new bb(".000 KEN", 157, bx.d)).a_(10 + ff2.e() + 1, n3 + 2);
        he.a(bb2);
        final ey ey;
        (ey = new ey("Cho xem", (boolean)(1 != 0))).a(bb2.c() + bx.d.a(".000 KEN0"), ff2.d() + 2, 13, 13);
        ey.d(false);
        ey.a_(6);
        he.a(ey);
        final int n4 = n3 + (ff2.f() + 5);
        final bb bb3;
        (bb3 = new bb("Kiểu quyết đấu:", 157, bx.d)).a_(10, n4);
        he.a(bb3);
        final int n5 = n4 + (bb3.f() + 3);
        final ey ey2;
        (ey2 = new ey("1 chiều", (boolean)(0 != 0))).a(10, n5, 13, 13);
        ey2.d(false);
        ey2.a_(7);
        he.a(ey2);
        final int n6 = n5 + (ey2.f() + 5);
        final ey ey3;
        (ey3 = new ey("Không chơi Tuyệt Chiêu", (boolean)(0 != 0))).a(10, n6, 13, 13);
        ey3.d(false);
        ey3.a_(10);
        he.a(ey3);
        final int n7 = n6 + (ey3.f() + 5);
        final ex a;
        (a = ex.a("Gửi", 102)).a(ag.b());
        a.a_(2);
        a.a_((87 - a.e() >> 1), n7);
        he.a(a);
        final ex a2;
        (a2 = ex.a("Hủy", 101)).a(ag.b());
        a2.a_(3);
        a2.a_((87 - a2.e() >> 1) + 87, n7);
        he.a(a2);
        final int n8 = n7 + (a2.f() + 10);
        he.a(com.mg.bas.v.t - 174 >> 1, com.mg.bas.v.u - n8 >> 1, 174, n8);
        he.a(ag.b());
        he.b(-241249);
        he.a(new bd("", 102), true);
        he.b(new bd("", 101), true);
        ag.b().a(he);
        he.a(new int[][] { { 1, 1, 1, 1 }, { 1, 2, 1, 2 }, { 1, 6, 1, 4 }, { 2, 4, 2, 4 }, { 1, 6, 2, 6 }, { 6, 6, 6, 6 }, { 2, 7, 4, 7 }, { 6, 8, 6, 8 }, { 7, 8, 9, 9 }, { 7, 9, 8, 8 } });
    }
    
    public static void e(final String s) {
        final he a;
        (a = a(s, "Nhập nick", "Gửi", 200, "Hủy", 101, null)).b(-241249);
        ag.b().a(a);
    }
    
    public static he a(final String s, final String s2, final String s3, final int n, final String s4, final int n2, final bf bf) {
        final he he = new he();
        final bb bb;
        (bb = new bb(s, 158, bx.d)).a_(5, 10);
        he.a(bb);
        final int n3 = 10 + (bb.f() + ((s2 != null) ? bx.d.a() : 0) + 3);
        final ff ff;
        (ff = new ff(s2, 100, 2)).a_(1);
        ff.a(5, n3, 165, 20);
        ff.d(true);
        he.a((aq)ff);
        final int n4 = n3 + (ff.f() + 5);
        final boolean b = bx.d.a(s3) >= bx.d.a(s4);
        final ex a;
        (a = ex.a(s3, n)).a(bf);
        if (!b) {
            a.d(ex.a(s4, n2).e());
        }
        a.a_(2);
        a.a_((87 - a.e() >> 1), n4);
        he.a(a);
        final ex a2;
        (a2 = ex.a(s4, n2)).a(bf);
        if (b) {
            a2.d(ex.a(s3, n).e());
        }
        a2.a_(3);
        a2.a_((87 - a2.e() >> 1) + 87, n4);
        he.a(a2);
        final int n5 = n4 + (a2.f() + 10);
        he.a(com.mg.bas.v.t - 175 >> 1, com.mg.bas.v.u - n5 >> 1, 175, n5);
        he.a(ag.b());
        he.b(241220);
        he.a(new bd("", n), true);
        he.b(new bd("", n2), true);
        return he;
    }
    
    public static he a(final String s, final String s2, final String s3, final int n, final String s4, final int n2, int n3, final bf bf) {
        final he he = new he();
        final bb bb;
        (bb = new bb(s, 158, bx.d)).a_(5, 10);
        he.a(bb);
        final int n4 = 10 + (bb.f() + 3);
        final ff ff;
        (ff = new ff(null, 300, 2)).a(new hp((byte)1));
        ff.f(true);
        ff.a_(1);
        ff.a(5, n4, 165, 20);
        ff.d(true);
        he.a((aq)ff);
        int n5 = n4 + (ff.f() + 5);
        n5 += 2;
        if (oy.f != null) {
            final fu fu;
            (fu = new fu((Image)null, n3)).a((175 - oy.e) / 2, n5, oy.e, oy.e);
            fu.a(bf);
            fu.a_(4);
            he.a(fu);
            n5 += fu.f() + 5;
        }
        n3 = ((bx.d.a(s3) >= bx.d.a(s4)) ? 1 : 0);
        final ex a;
        (a = ex.a(s3, n)).a(bf);
        if (n3 == 0) {
            a.d(ex.a(s4, n2).e());
        }
        a.a_(2);
        a.a_((87 - a.e() >> 1), n5);
        he.a(a);
        final ex a2;
        (a2 = ex.a(s4, n2)).a(bf);
        if (n3 != 0) {
            a2.d(ex.a(s3, n).e());
        }
        a2.a_(3);
        a2.a_((87 - a2.e() >> 1) + 87, n5);
        he.a(a2);
        final int n6 = n5 + (a2.f() + 10);
        ff.e(true);
        final int n7 = n6;
        he.a(com.mg.bas.v.t - 175 >> 1, com.mg.bas.v.u - n7 >> 1, 175, n7);
        he.a(bf);
        he.b(241220);
        he.a(new bd("", n), true);
        he.b(new bd("", n2), true);
        return he;
    }
    
    public static void D() {
        final String[] array = { "- Thanh kiếm để tấn công đối phương.", "- Trái tim có tác dụng hồi sinh lực trong trận chiến.", "- Xoáy âm dương giúp phục hồi nội lực trong trận đấu để sử dụng tuyệt chiêu.", "- Trái đào giúp phục hồi sức mạnh trong trận chiến để nhân đôi lực tấn công cho một lượt.", "- Giọt nước có tác dụng tăng điểm kinh nghiệm để lên cấp, nhưng điểm chỉ bằng 1/2 ngôi sao.", "- Ngôi sao có tác dụng tăng điểm kinh nghiệm để lên cấp.", "- Thỏi vàng để đổi KEN, khi đủ 10.000 lượng vàng hệ thống sẽ tự động nạp vào tài khoản của nhân vật 10.000 KEN.", "", "- Kiếm lửa có lực tấn công mạnh hơn và làm nổ các biểu tượng bao quanh nó. Kiếm lửa có thể xếp cùng với kiếm thường." };
        final he he;
        (he = new he()).a(new ba());
        he.g(he.j() - ba.a);
        final gc gc;
        (gc = new gc("Hướng dẫn", he.i() - 20, bx.d)).e(true);
        gc.a_(10, 10);
        gc.h(1);
        he.a(gc);
        final ay ay;
        (ay = new ay(0)).a(3, 32, he.i() - 6, he.j() - 35);
        final aw aw;
        (aw = new aw()).a((bn)ag.b());
        aw.e(true);
        ay.b(aw);
        final Image[] array2 = new Image[9];
        for (int i = 0; i < 9; ++i) {
            if (i != 7) {
                array2[i] = com.mg.bas.f.d("/chess" + i);
                aw.a((Object)new gn(array2[i], array[i], ay.e()));
            }
        }
        he.a(ay);
        he.a(ag.b());
        he.a(new bd("Đóng", 12350));
        ag.b().a(he, false);
    }
    
    public static void a(final String[] array) {
        final he he;
        (he = new he()).a(new ba());
        he.g(he.j() - ba.a);
        final gc gc;
        (gc = new gc("Những tính năng mới:", he.i() - 20, bx.d)).e(true);
        gc.a_(10, 10);
        gc.h(1);
        he.a(gc);
        final gc gc2;
        (gc2 = new gc("Phiên Bản 0.18.0", he.i() - 20, bx.d)).e(true);
        gc2.a_(10, 28);
        gc2.h(1);
        he.a(gc2);
        final ay ay;
        (ay = new ay(0)).a(3, 50, he.i() - 6, he.j() - 50 - 2);
        final aw aw;
        (aw = new aw()).a((bn)ag.b());
        aw.e(true);
        ay.b(aw);
        for (int i = 0; i < array.length; ++i) {
            if (i != 8) {
                aw.a((Object)new gn(null, array[i], ay.e()));
            }
        }
        he.a(ay);
        he.a(ag.b());
        he.a(new bd("Đóng", 12350));
        ag.b().a(he, false);
    }
    
    public static void b(final String[] array) {
        final he he;
        (he = new he()).a(new ba());
        he.g(he.j() - ba.a);
        final gc gc;
        (gc = new gc("Thông báo:", he.i() - 20, bx.d)).e(true);
        gc.a_(10, 10);
        gc.h(1);
        he.a(gc);
        final ay ay;
        (ay = new ay(0)).a(3, 28, he.i() - 6, he.j() - 28 - 2);
        final aw aw;
        (aw = new aw()).a((bn)ag.b());
        aw.e(true);
        ay.b(aw);
        for (int i = 0; i < array.length; ++i) {
            if (i != 8) {
                aw.a((Object)new gn(null, array[i], ay.e()));
            }
        }
        he.a(ay);
        he.a(ag.b());
        he.a(new bd("Đóng", 12350));
        ag.b().a(he, false);
    }
    
    public static String k(final int n) {
        final he he;
        if ((he = (he)ag.b().d(n)) == null) {
            return "";
        }
        return ((ff)he.e(1)).r().toLowerCase().trim();
    }
    
    public final void a(final lh lh, final String s, final long n, final String s2, final boolean b, final boolean b2) {
        if (super.a != null && super.a.h() == 1) {
            r.a(s2);
            ((oa)super.a).a(lh, s, n, s2, b, b2);
            return;
        }
        ks.a().a(false, s2, "Tui chưa sẵn sàng!!!");
    }
    
     public final void a(boolean bl, String string) {
        gt gt2 = (gt)((a)ag.b()).d(-241209);
        String string2 = "";
        if (gt2 != null) {
            string2 = gt2.t();
            this.b(gt2, false);
        }
        if (bl) {
            int n = r.l.length - 1;
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
        r.a(r.l.length - 1);
    }
    
    public final void f(final String s) {
        final ie ie;
        (ie = new ie("Đang khiêu chiến \"" + s + "\". Vui lòng chờ...")).a(this);
        ie.a(new ba());
        ie.b(new bd("Hủy", 202), true);
        ie.b(-241249);
        ie.j(true);
        ie.e(30);
        this.a(ie, false);
    }
    
    private static al x(final String s) {
        final ie ie;
        (ie = new ie("Đang mời \"" + s + "\" Giao dịch. Vui lòng chờ...")).a(ag.b());
        ie.a(new ba());
        ie.b(new bd("Hủy", 201), true);
        ie.b(241214);
        ie.j(true);
        ie.e(30);
        ag.b().a(ie, false);
        return ie;
    }
    
    public final al a(final String s, final String s2, final String[] array, final int[] array2, int t) {
        try {
            t = com.mg.bas.v.t;
            if (t > com.mg.bas.v.u) {
                if (t >= 320) {
                    t = 320;
                }
            }
            else if (t >= 240) {
                t = 240;
            }
            t -= 20;
            int n = 6;
            final he he = new he();
            if (s != null && !s.equals("")) {
                final gc gc;
                (gc = new gc(s, t - 10 - 10, bx.d)).e(true);
                gc.a_(10, 6);
                gc.h(1);
                he.a(gc);
                n = 6 + (gc.f() + 6);
            }
            final gc gc2;
            (gc2 = new gc(s2, t - 10 - 10, bx.d)).a_(10, n);
            gc2.h(1);
            he.a(gc2);
            int n2 = n + (gc2.f() + 6);
            if (array != null && array2 != null) {
                final int n3 = t / array.length;
                ex ex;
                (ex = com.mg.bas.ex.a(array[0], array2[0])).a_(2);
                ex.a_(n3 - ex.e() >> 1, n2);
                ex.d(true);
                he.a(new bd("", array2[0]), true);
                he.a(ex);
                if (array2.length > 1) {
                    final boolean b;
                    if (!(b = (bx.d.a(array[0]) >= bx.d.a(array[1])))) {
                        ex.d(ex.a(array[1], array2[1]).e());
                        ex.a_(n3 - ex.e() >> 1, n2);
                    }
                    ex = ex.a(array[1], array2[1]);
                    if (b) {
                        ex.d(ex.a(array[0], array2[0]).e());
                    }
                    ex.a_(3);
                    ex.a_((n3 - ex.e() >> 1) + n3, n2);
                    he.a(ex);
                    he.b(new bd("", array2[1]), true);
                }
                n2 += ex.f();
            }
            final int n4 = n2 + 10;
            he.a(com.mg.bas.v.t - t >> 1, com.mg.bas.v.u - n4 >> 1, t, n4);
            return he;
        }
        catch (final Exception ex2) {
//            final Throwable t2;
            ex2.printStackTrace();
            return null;
        }
    }
    
    public static void g(final String s) {
        int t = com.mg.bas.v.t;
        if (t > com.mg.bas.v.u) {
            if (t >= 320) {
                t = 320;
            }
        }
        else if (t >= 240) {
            t = 240;
        }
        final int n = t - 20;
        final he he = new he();
        final gc gc;
        (gc = new gc("Chú ý", n - 10 - 10, bx.d)).e(true);
        gc.a_(10, 6);
        gc.h(1);
        he.a(gc);
        final int n2 = 6 + (gc.f() + 6);
        final gc gc2;
        (gc2 = new gc(s, n - 10 - 10, bx.d)).a_(10, n2);
        gc2.h(1);
        he.a(gc2);
        final int n3 = n2 + (gc2.f() + 6);
        final ey ey;
        (ey = new ey("Không nhắc nữa", false)).a_(6);
        ey.a(16, n3, 13, 13);
        he.a(ey);
        final int n4 = n3 + (ey.f() + 6);
        final int n5 = n / 2;
        final ex a;
        (a = ex.a("Có", 303)).d(ex.a("Không", 304).e());
        a.a_(2);
        a.a_((n5 - a.e() >> 1), n4);
        a.d(true);
        he.a(new bd("", 303), true);
        he.a(a);
        final ex a2;
        (a2 = ex.a("Không", 304)).a_(3);
        a2.a_((n5 - a2.e() >> 1) + n5, n4);
        he.a(a2);
        he.b(new bd("", 304), true);
        final ex ex;
        (ex = (ex)he.e(2)).d(a2.e());
        ex.b_(n5 - ex.e() >> 1);
        final int n6 = n4 + ex.f() + 10;
        he.a(com.mg.bas.v.t - n >> 1, com.mg.bas.v.u - n6 >> 1, n, n6);
        he.a(ag.b());
        he.b(241221);
        ag.b().a(he, false);
    }
    
    public static void E() {
        final al a;
        (a = ag.b().a("Thông tin", "Đã gửi Me thành công", "Đóng", 2, 1)).a(ag.b());
        ag.b().a(a, false);
    }
    
    private static void b(final lh lh) {
        ag.b().a(new gt(lh, (byte)1, false, false), false);
    }
    
    public final void a(final boolean b, final String s, final int n, final int[] array, final int n2) {
        if (super.a != null && super.a.h() == 5) {
            ((nx)super.a).a(b, s, n, array, n2);
        }
    }
    
     public final void a(int n, String[] stringArray) {
        if (stringArray.length > 0) {
            pd.g(n);
            l = stringArray;
        }
    }
    
    public static String a(final String s, final int n) {
        return a(s, g, n);
    }
    
    public static String a(String value, final d d, final int n) {
        if (d.a(value) > n) {
            int n2;
            char[] charArray;
            int n3;
            for (n2 = 0, charArray = value.toCharArray(), n3 = 0; n3 < charArray.length && (n2 += d.a(charArray[n3])) < n; ++n3) {}
            if (n3 >= charArray.length) {
                n3 = charArray.length - 1;
            }
            for (int i = n3 - 3; i <= n3; ++i) {
                charArray[i] = '.';
            }
            value = String.valueOf(charArray, 0, n3);
        }
        return value;
    }
    
    public static void F() {
        ag.b().a(9, true, false, null, null);
    }
    
    public final void a(final ll[] array, final lm[] array2, final int n, final int n2) {
        go.a(array, array2, n, n2);
        if (super.a.h() == 2) {
            ((ob)super.a).e();
        }
        else if (super.a.h() == 3) {
            ((nw)super.a).d();
        }
        this.v();
    }
    
    public static void G() {
        ag.b().a(new gy());
    }
    
    public static al a(final ll ll, final bf bf, final String s, final int n, final String s2, final int n2) {
        final hg hg = new hg(ll);
        if (bf != null) {
            hg.a(bf);
            hg.a(new bd(s, n), true);
            hg.b(new bd(s2, n2), true);
        }
        ag.b().a(hg, false);
        return hg;
    }
    
    public static void a(final bf bf, final String s, final int n, final String s2, final int n2) {
        final al a;
        (a = ag.b().a("Chú ý", "Thùng đồ đã đầy. Bạn có phải bỏ bớt đồ đi!", s, n, s2, n2, 1)).a(bf);
        a.b(241209);
        ag.b().a(a, false);
    }
    
    public static String[] a(final ll ll) {
        final String[] array = new String[10];
        int n = 0;
        if (ll.r.a > 0) {
            array[0] = "+ " + ll.r.a + " cường lực";
            ++n;
        }
        else if (ll.r.a < 0) {
            array[0] = "- " + ll.r.a + " cường lực";
            ++n;
        }
        if (ll.r.c > 0) {
            array[n] = "+ " + ll.r.c + " nội lực";
            ++n;
        }
        else if (ll.r.c < 0) {
            array[n] = "- " + ll.r.c + " nội lực";
            ++n;
        }
        if (ll.r.b > 0) {
            array[n] = "+ " + ll.r.b + " thân pháp";
            ++n;
        }
        else if (ll.r.b < 0) {
            array[n] = "- " + ll.r.b + " thân pháp";
            ++n;
        }
        if (ll.r.d > 0) {
            array[n] = "+ " + ll.r.d + " thể lực";
            ++n;
        }
        else if (ll.r.d < 0) {
            array[n] = "- " + ll.r.d + " thể lực";
            ++n;
        }
        if (ll.r.e > 0) {
            array[n] = "+ " + ll.r.e + " sức tấn công";
            ++n;
        }
        else if (ll.r.e < 0) {
            array[n] = "- " + ll.r.e + " sức tấn công";
            ++n;
        }
        if (ll.r.f > 0) {
            array[n] = "+ " + ll.r.f + " phòng thủ";
            ++n;
        }
        else if (ll.r.f < 0) {
            array[n] = "- " + ll.r.f + " phòng thủ";
            ++n;
        }
        if (ll.r.h > 0) {
            array[n] = "+ " + ll.r.h + " né tránh";
            ++n;
        }
        else if (ll.r.h < 0) {
            array[n] = "- " + ll.r.h + " né tránh";
            ++n;
        }
        if (ll.r.g > 0) {
            array[n] = "+ " + ll.r.g + "% chí mạng";
            ++n;
        }
        else if (ll.r.g < 0) {
            array[n] = "- " + ll.r.g + "% chí mạng";
            ++n;
        }
        if (ll.r.i > 0) {
            array[n] = "+ " + ll.r.i + " sinh lực";
            ++n;
        }
        else if (ll.r.i < 0) {
            array[n] = "- " + ll.r.i + " sinh lực";
            ++n;
        }
        if (ll.r.j > 0) {
            array[n] = "+ " + ll.r.j + "% hấp thu sát thương";
            ++n;
        }
        else if (ll.r.j < 0) {
            array[n] = "- " + ll.r.j + "% hấp thu sát thương";
            ++n;
        }
        if (ll.r.k > 0) {
            array[n] = "+ " + ll.r.k + "% đánh xuyên giáp";
            ++n;
        }
        else if (ll.r.k < 0) {
            array[n] = "- " + ll.r.k + "% đánh xuyên giáp";
            ++n;
        }
        if (ll.r.l > 0) {
            array[n] = "+ " + ll.r.l + "% cản đòn";
            ++n;
        }
        else if (ll.r.l < 0) {
            array[n] = "- " + ll.r.l + "% cản đòn";
            ++n;
        }
        if (ll.r.m > 0) {
            array[n] = "+ " + ll.r.m + "% hồi sinh";
            ++n;
        }
        else if (ll.r.m < 0) {
            array[n] = "- " + ll.r.m + "% hồi sinh";
            ++n;
        }
        if (ll.r.n > 0) {
            array[n] = "+ " + ll.r.n + "% sức tấn công";
            ++n;
        }
        else if (ll.r.n < 0) {
            array[n] = "- " + ll.r.n + "% sức tấn công";
            ++n;
        }
        if (ll.r.o > 0) {
            array[n] = "+ " + ll.r.o + "% sinh lực";
            ++n;
        }
        else if (ll.r.o < 0) {
            array[n] = "- " + ll.r.o + "% sinh lực";
            ++n;
        }
        final String[] array2 = new String[n];
        System.arraycopy(array, 0, array2, 0, n);
        return array2;
    }
    
    public final void b(final String s, final int n, final int g) {
        ll ll = null;
        if (go.l != null) {
            for (int i = 0; i < go.l.length; ++i) {
                if (go.l[i].c.equals(s)) {
                    go.l[i].p = go.l[i].q;
                    ll = go.l[i];
                    break;
                }
            }
            for (int j = 0; j < go.m.length; ++j) {
                if (go.m[j].a == n) {
                    go.m[j].g = g;
                    break;
                }
            }
        }
        if (super.a != null && super.a.h() == 1) {
            final oa oa;
            (oa = (oa)super.a).a = false;
            if (oa.k != null) {
                oa.k.s = false;
            }
        }
        if (super.b != null && super.b.h() == 241202) {
            ((hh)super.b).a(ll);
            ((hh)super.b).j(g);
        }
    }
    
    public static hl a(final bf bf, final az az, final az az2, final az az3, final ll ll) {
        final lm[] array = new lm[go.m.length];
        int n = 0;
        for (int i = 0; i < go.m.length; ++i) {
            if (go.m[i].e == 1) {
                array[n] = go.m[i];
                ++n;
            }
        }
        final lm[] array2 = new lm[n];
        System.arraycopy(array, 0, array2, 0, n);
        for (int j = 1; j < array2.length; ++j) {
            for (int n2 = j; n2 > 0 && array2[n2 - 1].f > array2[n2].f; --n2) {
                final lm lm = array2[n2];
                array2[n2] = array2[n2 - 1];
                array2[n2 - 1] = lm;
            }
        }
        final hl hl;
        (hl = new hl("Búa sửa chữa: ", array2)).a(ll);
        hl.a(az, true);
        hl.b(az);
        hl.b(az2, true);
        hl.a(az3);
        hl.a(bf);
        ag.b().a(hl);
        return hl;
    }
    
    public final void H() {
        ks.a().k();
        this.a(null, (il)null);
    }
    
    public final void I() {
        ks.a().j();
        this.a(null, (il)null);
    }
    
    public final void J() {
        ks.a().v();
        this.a(null, (il)null);
    }
    
    public final void h(final String s) {
        ks.a().r(s);
        this.a(null, (il)null);
    }
    
    public final void a(final lf[] array) {
        if (this.c(241210)) {
            this.e(241210);
        }
        ag.b().a(new ia(array), false);
        this.v();
    }
    
    public final void a(final int n, final lq[] array) {
        final al d;
        if ((d = this.d(241210)) != null) {
            ((ia)d).a(n, array);
        }
    }
    
    public final void a(final String[] array, final int[] array2) {
        if (this.c(241210)) {
            ((ia)this.d(241210)).a(array, array2);
        }
    }
    
    public final void a(final int[] array, final int[] array2) {
        if (this.c(241210)) {
            ((ia)this.d(241210)).a(array, array2);
        }
    }
    
    public final void i(final String s) {
        if (super.a != null && super.a.h() == 8) {
            ((of)super.a).c(s);
        }
        this.v();
    }
    
    public final void j(final String s) {
        if (super.a != null && super.a.h() == 8) {
            ((of)super.a).a(s);
        }
    }
    
    public final void a(final lm lm) {
        if (super.a != null && super.a.h() == 8) {
            ((of)super.a).a(lm);
        }
        this.v();
    }
    
    public final void k(final String s) {
        if (this.c(241207) || super.a.h() != 1 || gr.l) {
            ks.a().a(false);
            super.f.a(new gi("Vừa tự động từ chối giao dịch từ @" + s));
            return;
        }
        ((oa)super.a).b(s);
    }
    
    public final void a(final ll[] array, final lm[] array2, final int n) {
        if (super.a != null && super.a.h() == 8) {
            ((of)super.a).a(array, array2, n);
        }
        this.v();
    }
    
    public final void l(final String s) {
        if (super.a != null && super.a.h() == 8) {
            ((of)super.a).b(s);
        }
        this.v();
        final al a;
        (a = ag.b().a("Chúc mừng", "Giao dịch thành công!", "Đóng", 12350, 1)).a(this);
        ag.b().a(a, false);
    }
    
    public final void b(final ll ll) {
        if (super.a != null && super.a.h() == 8) {
            ((of)super.a).a(ll);
        }
    }
    
    public final void a(final lm lm, final int n) {
        if (super.a != null && super.a.h() == 8) {
            ((of)super.a).a(lm, n);
        }
    }
    
    public final void l(final int n) {
        if (super.a != null && super.a.h() == 8) {
            ((of)super.a).a(n, true);
        }
    }
    
    public final void K() {
        if (super.a != null && super.a.h() == 8) {
            ((of)super.a).d();
        }
        this.v();
    }
    
    public final void m(final String s) {
        this.a(241214, false);
        final al a;
        (a = ag.b().a("", String.valueOf(s) + " Không muốn giao dịch với bạn!", "Đóng", 12350, 1)).a(this);
        ag.b().a(a, false);
    }
    
    public final void n(String s) {
        s = s;
        ag.b().a(8, true, false, null, new Object[] { s });
        this.a(241214, false);
    }
    
    public static lh a(final lh lh) {
        final jz a = jp.a(lh.g);
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        a.a(lh.h + lh.l, lh.j + lh.m, lh.i + lh.n, lh.k + lh.o);
        for (int i = 0; i < lh.D.length; ++i) {
            final lb r;
            if ((r = lh.D[i].r) != null) {
                n += r.a;
                n2 += r.d;
                n3 += r.b;
                n4 += r.c;
                n5 = n5 + r.e + a.c() * r.n / 100;
                n6 += r.g;
                n7 += r.f;
                n8 += r.h;
                n9 += r.i;
            }
        }
        a.a(lh.h + n + lh.l, lh.j + n3 + lh.m, lh.i + n4 + lh.n, lh.k + n2 + lh.o);
        lh.r = a.a() + n9;
        lh.A = a.e() + n8;
        lh.C = a.g() + n6;
        lh.z = a.d() + n7;
        lh.B = a.f();
        lh.x = a.b() + n5;
        lh.y = a.c() + n5;
        return lh;
    }

    public static al a(lm lmObj, bf bfObj) {
        hl hlObj = new hl("Chi Tiết", lmObj); 
        hlObj.b(241215);
        hlObj.a((a)ag.b());
        bd bd2 = null;
        hlObj.a(bd2, true);
        bd2 = new bd("", 204);
        hlObj.b(bd2, true);
        hlObj.a(new bd("Đóng", 204));
        ag.b().a(hlObj);
        return hlObj;
    }
    
    public final void L() {
        ks.a().p();
        this.a(null, (il)null);
    }
    
    public final void o(final String s) {
        this.v();
        if (super.a != null && super.a.h() == 10) {
            ((oe)super.a).a(s);
        }
    }
    
    public final void c(final String s, String s2) {
        if (super.a != null) {
            if (super.a.h() == 8) {
                ((of)super.a).a(s2, (byte)1, bx.d);
                return;
            }
            if (super.a.h() == 1) {
                final oa oa = (oa)super.a;
                final String s3 = s2;
                s2 = s;
                final oa oa2 = oa;
                if (oa.k != null) {
                    final ol k = oa2.k;
                    final String s4 = s2;
                    final String s5 = s3;
                    s2 = s4;
                    final ol ol = k;
                    if (k.p != null && ol.p.b() == 2) {
                        ((oq)ol.p).a(s2, s5);
                    }
                }
            }
        }
    }
    
    public static void p(final String s) {
        if (go.e.equals(s)) {
            final al a;
            (a = ag.b().a("", "Bạn không thể giao dịch với chính bạn! vui lòng kiểm tra lại", "Đóng", 12350, 1)).a(ag.b());
            ag.b().a(a, false);
            return;
        }
        x(s);
        ks.a().j(s);
    }
    
    public final void a(final String i, final byte b) {
        if (i == null) {
            return;
        }
        if (super.a.h() == 1) {
            final oa oa = (oa)super.a;
            final byte b2 = 0;
            final oa oa2 = oa;
            boolean b4;
            if (oa.k != null) {
                final ol k = oa2.k;
                final byte b3 = b2;
                final ol ol = k;
                if (k.p != null && ol.p.b() == 1) {
                    ((om)ol.p).a(i, b3);
                    b4 = true;
                }
                else {
                    b4 = false;
                }
            }
            else {
                b4 = false;
            }
            if (!b4) {
                this.q(i);
            }
        }
        else {
            this.i = null; 
            this.j = 0;    
        }
        this.v();
    }
    
    public final void q(final String s) {
        final al a;
        (a = this.a("", s, "Đóng", 205, 1)).a(this);
        this.a(a, false);
    }
    
    public final void M() {
        if (super.a != null && super.a.h() == 1) {
            ((oa)super.a).u();
        }
    }
    
    public static String b(final long n) {
        final String s;
        return s = ((n < 0L) ? "?  KEN" : (String.valueOf(com.mg.bas.i.a(n, ".")) + "  KEN"));
    }
    
    public final void r(final String s) {
        this.a(null, (il)null);
        ks.a().f(s);
    }
    
    public final void b(final String s, final int n) {
        ks.a().a(s, (byte)n);
        this.a(null, (il)null);
    }
    
    public final void N() {
        if (com.mg.sq.a.m != null && com.mg.sq.a.o) {
            this.m(99004);
            return;
        }
        final al a;
        (a = this.a("Thông tin", "Vui lòng đăng nhập Ola để sử dụng tính năng nạp KEN", "Đóng", 12350, "Hỗ trợ", 12353, 1)).a(this);
        this.a(a, false);
    }
    
    public final void c(final String[] array) {
        final oa oa;
        final ol k;
        if (super.a.h() == 1 && (oa = (oa)super.a).k != null && (k = oa.k).p != null && k.p.b() == 1) {
            ((om)k.p).a(array);
        }
    }
    
    public final void d(final String[] array) {
        final hh hh;
        if ((hh = (hh)this.d(241202)) != null) {
            hh.a(array);
        }
    }
    
    public final void O() {
        this.a(null, (il)null);
    }
    
    public final void P() {
        if (super.a != null && super.a.h() == 8) {
            ((of)super.a).e();
        }
        this.v();
    }
    
    public final void a(final int n, final dh[] array) {
        if (super.a != null && super.a.h() == 1) {
            ((oa)super.a).a(n, array);
        }
        this.v();
    }
    
    public final void Q() {
        ks.a().c(0);
        this.a(null, (il)null);
    }
    
    public final void R() {
        ks.a().c(1);
        this.a(null, (il)null);
    }
    
    public final void s(final String s) {
        this.l();
        final al a;
        (a = this.a(null, s, "Đóng", 208, 1)).a(this);
        this.a(a, false);
    }
    
    public final void a(String g, final boolean h, final boolean i) {
        if (g == null) {
            g = "";
        }
        go.h = h;
        go.i = i;
        go.g = g;
    }
    
    public final void a(String g, final boolean j, final boolean h, final boolean i) {
        if (g == null) {
            g = "";
        }
        go.h = h;
        go.i = i;
        go.g = g;
        go.j = j;
        this.Y();
    }
    
    public final void b(String g, final boolean j, final boolean h, final boolean i) {
        if (g == null) {
            g = "";
        }
        go.h = h;
        go.i = i;
        go.g = g;
        go.j = j;
        if (this.c(241216)) {
            ((hv)this.d(241216)).a(g, j, h);
        }
        this.v();
    }
    
    private void Y() {
        this.a(new hv(go.g, go.j, go.h));
        this.v();
    }
    
    public final void S() {
        ks.a().q();
        this.a(null, (il)null);
    }
    
    public static final void d(final String s, final String q) {
//        a.q = q;
        final he he;
        (he = new he()).b(241223);
        final bb bb;
        (bb = new bb(s, 163, bx.d)).a_(10, 10);
        he.a(bb);
        final int n = 10 + (bb.f() + 3);
        final ff ff;
        (ff = new ff(null, 100, 2)).a_(1);
        ff.a(10, n, 136, 20);
        ff.d(true);
        he.a((aq)ff);
        final int n2 = 10 + (ff.e() + 4);
        final Image d = com.mg.bas.f.d("/iconbt");
        final fu fu;
        (fu = new fu((Image)null, 12360)).a(ag.b());
        fu.a_(4);
        fu.a(n2, n, 20, 20);
        fu.a(d);
        fu.b(0, 0, 20, 20);
        fu.a(22523, 9287679, 22523);
        he.a(fu);
        final int n3 = n + (ff.f() + 5);
        final int n4 = ff.c() + 9;
        final ex ex;
        (ex = new ex("Gửi", 12359)).a(n4, n3, 50, 18);
        ex.a_(2);
        he.a(ex);
        final ex ex2;
        (ex2 = new ex("Đóng", 12350)).a(n4 + 68, n3, 50, 18);
        ex2.a_(3);
        he.a(ex2);
        final int n5 = n3 + (ex2.f() + 10);
        he.a(com.mg.bas.v.t - 180 >> 1, com.mg.bas.v.u - n5 >> 1, 180, n5);
        he.a(ag.b());
        he.b(241223);
        he.a(new bd("", 12359), true);
        he.b(new bd("", 12350), true);
        ag.b().a(he);
    }
    
    public static void a(final String s, final String u, final String[] array, final String[] w) {
        ((a)ag.b()).v();
//        a.u = u;
//        a.w = w;
        final int n = (com.mg.bas.v.t < 320) ? (com.mg.bas.v.t - 20) : 200;
        final he he = new he();
        final bb bb;
        (bb = new bb((s != null) ? s : "Vui lòng chọn số Ken muốn mua!", n - 20, bx.c)).a_(10, 10);
        final int n2 = 10 + (bb.f() + 5 + bx.d.a());
        he.a(bb);
        final fx fx;
        (fx = new fx("Mua Ken")).a_(1);
        fx.d(true);
        fx.a(10, n2, n - 20, 70);
        for (int i = 0, length = array.length; i < length; ++i) {
            final ey ey;
            (ey = new ey(array[i], false)).h(i);
            if (i == length - 1) {
                ey.e(true);
            }
            fx.a(ey);
        }
        he.a(fx);
        final int n3 = n2 + fx.f() + 5;
        final aq aq;
        (aq = new ex("Nạp", 300)).a(n / 2 - 70, n3, 50, 20);
        he.a(aq);
        final aq aq2;
        (aq2 = new ex("Đóng", 12350)).a(aq.c() + aq.e() + 40, n3, 50, 20);
        he.a(aq2);
        final int n4 = n3 + aq2.f() + 10;
        he.a(com.mg.bas.v.t - n >> 1, com.mg.bas.v.u - n4 >> 1, n, n4);
        he.a(ag.b());
        he.b(0);
        he.a(new bd("", 300), true);
        he.b(new bd("", 12350), true);
        ag.b().a(he);
    }
    
    public static al t(final String s) {
        final al a;
        (a = ag.b().a("Thông tin", s, "Đóng", 12350, 1)).a(ag.b());
        ag.b().a(a, false);
        return a;
    }
    
    public final boolean m(final int t) {
        if (t == 99006) {
            du.a().p();
            this.a(null, (il)null);
            return true;
        }
        if (com.mg.sq.a.m != null && com.mg.sq.a.o) {
            if (t == 99005 || t == 99004) {
                if (t == 99005) {
                    ks.a().w();
                    this.a(null, (il)null);
                    return true;
                }
                if (!gr.b) {
                    this.t = t;
                    final al a;
                    (a = this.a("Chú ý", "Bạn nên tham khảo những điều khoản về nạp KEN.", "Nạp KEN", 302, "Xem", 301, 1)).a(this);
                    this.a(a, false);
                    return gr.b = true;
                }
                if (t == 99004) {
                    du.a().o();
                    this.a(null, (il)null);
                    return true;
                }
            }
            return false;
        }
        if (t == 99005) {
            ks.a().w();
            this.a(null, (il)null);
            return true;
        }
        if (t == 99004) {
            du.a().o();
            this.a(null, (il)null);
            return true;
        }
        return false;
    }
    
    public static void e(final String[] array) {
        if (ag.b().c(241218)) {
            ((hm)ag.b().d(241218)).a(array);
            return;
        }
        ag.b().a(new hm(array), false);
    }
    
    public final void c(final boolean z) {
        go.k.Z = z;
        if (this.c(241202)) {
            ((hh)this.d(241202)).j(z);
        }
        final oa oa;
        final ol k;
        if (super.a != null && super.a.h() == 1 && (oa = (oa)super.a).k != null && (k = oa.k).p != null && k.p.b() == 1) {
            ((om)k.p).a(go.k, true);
        }
        this.v();
    }
    
    public final void d(final boolean aa) {
        go.k.aa = aa;
        this.v();
        if (aa) {
            go.k.e = 2;
            return;
        }
        if (go.k.e == 2) {
            go.k.e = 0;
        }
    }
    
    public final void a(final int[] array, final String[] array2) {
        this.v();
        final oa oa;
        if (this.n(1) && (oa = (oa)super.a).k != null) {
            oa.k.a(array, array2);
        }
    }
    
    public final void a(final lr[] array) {
        if (this.n(1)) {
            com.mg.bas.g.a(array, new b(this));
            ((oa)super.a).a(array);
        }
    }
    
    public final void a(final String s, final String s2, final long n, final int n2) {
        if (super.a != null && super.a.h() == 1) {
            final oa oa = (oa)super.a;
            if (oa.k != null) {
                oa.k.a(s, s2, n, n2);
            }
        }
    }
    
    public final void a(byte[] array, byte[] array2) {
        this.v();
        final byte[] array3 = array;
        array2 = array2;
        array = array3;
        ag.b().a(10, true, false, null, new Object[] { array, array2 });
    }
    
    public final aq a(final aw aw, final int n) {
        final Object i;
        if ((i = aw.i(n)) instanceof gn) {
            return (gn)i;
        }
        return null;
    }
    
    public final void u(final String s) {
        ((ff)((he)this.d(241223)).e(1)).c(s);
    }
    
    public final void T() {
        if (super.a.h() == 2) {
            final an a = super.a;
            ct.a("[SQLOGIN] login thanh cong!");
            ks.a().a(go.e, (byte)1);
            return;
        }
        if (super.a.h() == 3) {
            final an a2 = super.a;
            ct.a("[SQLOGIN] login thanh cong!");
            ks.a().a(go.e, (byte)1);
        }
    }
    
    public final void a(final String s, final byte g, final byte f, final df u, final df v, final df w) {
        if (go.k != null && go.k.b.equals(s)) {
            final lh k;
            (k = go.k).g = g;
            k.f = f;
            k.U = u;
            k.V = v;
            k.W = w;
        }
        final oa oa;
        if (super.a != null && super.a.h() == 1 && (oa = (oa)super.a).k != null) {
            final ol i = oa.k;
        }
    }
    
    public final void a(final String s, final int n, final int n2, final int n3, final int n4, final int n5, final int l, int g, int h, int j, int i, int k) {
        if (go.k != null && go.k.b.equals(s)) {
            final lh m = go.k;
            final int n6 = g;
            final int n7 = h;
            final int n8 = j;
            final int n9 = i;
            final int q = k;
            final int p12 = n9;
            final int o = n8;
            final int n10 = n7;
            final int m2 = n6;
            k = n5;
            i = n4;
            j = n3;
            h = n2;
            g = n;
            final lh lh = m;
            m.G = g;
            lh.h = h;
            lh.j = j;
            lh.i = i;
            lh.k = k;
            lh.l = l;
            lh.m = m2;
            lh.n = n10;
            lh.o = o;
            lh.p = p12;
            lh.q = q;
        }
        if (super.a != null && super.a.h() == 1) {
            final oa oa = (oa)super.a;
            k = n4;
            i = n3;
            j = n2;
            h = n;
            final oa oa2 = oa;
            final ol k2;
            if (oa.k != null && (k2 = oa2.k).p != null && k2.p.b() == 1) {
                ((om)k2.p).a(go.k, true);
            }
        }
    }
    
    public final void a(final String s, final int s2, final int r, final int j, final int m, final int n, final int h, final int i) {
        if (go.k != null && go.k.b.equals(s)) {
            final lh k;
            (k = go.k).s = s2;
            k.r = r;
            k.J = j;
            k.M = m;
            k.N = n;
            k.H = h;
            k.I = i;
        }
        final oa oa;
        final ol l;
        if (super.a != null && super.a.h() == 1 && (oa = (oa)super.a).k != null && (l = oa.k).p != null && l.p.b() == 1) {
            ((om)l.p).a(go.k, false);
        }
    }
    
    public final void a(String s, final ll[] d) {
        if (go.k != null && s.equals(go.k.b)) {
            mb.a();
            go.k.D = d;
        }
        if (super.a != null && super.a.h() == 1) {
            final oa oa = (oa)super.a;
            s = s;
            final oa oa2 = oa;
            final ol k;
            if (oa.k != null && (k = oa2.k).p != null && k.p.b() == 1) {
                ((om)k.p).a(go.k, true);
            }
        }
        final al d2;
        if ((d2 = this.d(241202)) != null) {
            ((hh)d2).w();
        }
    }
    
    public final void a(final lv[] e) {
        go.k.E = e;
    }
    
    public final void a(String s, final int k, final int l, final int ab, final String s2, final String r, final String q) {
        if (go.k != null && go.k.b.equals(s)) {
            final lh i;
            (i = go.k).K = k;
            i.L = l;
            i.ab = ab;
            i.S = s2;
            i.R = r;
            i.Q = q;
        }
        if (super.a != null && super.a.h() == 1) {
            final oa oa = (oa)super.a;
            s = q;
            final oa oa2 = oa;
            final ol j;
            if (oa.k != null && (j = oa2.k).p != null && j.p.b() == 1) {
                ((om)j.p).a(go.k, true);
            }
        }
    }
    
    public final void U() {
        this.v();
        final al d;
        if ((d = ag.b().d(241201)) != null) {
            ((gy)d).k.b(go.k);
        }
        final al d2;
        if ((d2 = ag.b().d(241203)) != null) {
            ((ib)d2).a(go.k);
        }
    }
    
    public final void a(final int[] array, final String[] array2, final int[] array3, final int[] array4, final int[] array5) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < go.l.length; ++j) {
                if (go.l[j].c.equals(String.valueOf(array[i]))) {
                    go.l[j].p = Integer.parseInt(array2[i]);
                    go.l[j].q = array3[i];
                    break;
                }
            }
        }
        for (int k = 0; k < array4.length; ++k) {
            for (int l = 0; l < go.m.length; ++l) {
                if (go.m[l].a == array4[k]) {
                    go.m[l].g = array5[k];
                    break;
                }
            }
        }
    }
    
    public final void v(final String s) {
        if (this.c(241202)) {
            ((hh)this.d(241202)).b(s);
            return;
        }
        t(s);
    }
    
    public final void c(final ll ll) {
        go.a(ll);
        if (this.c(241202)) {
            ((hh)this.d(241202)).b(ll);
        }
    }
    
    public final void a(final lm[] array) {
        for (int i = 0; i < array.length; ++i) {
            final lm lm;
            go.a(lm = array[i], lm.g);
            if (this.c(241202)) {
                ((hh)this.d(241202)).c(lm);
            }
        }
    }
    
    public final void f(final int n, final int n2) {
        final al d;
        if ((d = this.d(241202)) != null) {
            ((hh)d).j(n, n2);
            return;
        }
        for (int i = 0; i < go.m.length; ++i) {
            if (go.m[i].a == n) {
                go.b(n, go.m[i].g - n2);
                return;
            }
        }
    }
    
    public final void a(final lt[] ac) {
        go.k.ac = ac;
        final oa oa;
        final ol k;
        if (super.a != null && super.a.h() == 1 && (oa = (oa)super.a).k != null && (k = oa.k).p instanceof om) {
            ((om)k.p).a(ac);
        }
    }
    
    public final void e(final String s, final String s2) {
        if (this.c(241231)) {
            this.e(241231);
        }
        ox y = null;
        d z = null;
        final hh hh;
        if ((hh = (hh)this.d(241202)) != null) {
            y = hh.y();
            z = hh.z();
        }
        this.a(new ho(s, s2, y, z), false);
        this.v();
    }
    
    public final void a(final String s, final String s2, final String s3) {
        if (this.c(241232)) {
            this.e(241232);
        }
        ox y = null;
        d z = null;
        final hh hh;
        if ((hh = (hh)this.d(241202)) != null) {
            y = hh.y();
            z = hh.z();
        }
        this.a(new id(s, s2, s3, y, z), false);
        this.v();
    }
    
    public final void a(final String s, final ll[] array, final lm[] array2, final byte b) {
        final al d;
        if ((d = this.d(241231)) != null) {
            ((ho)d).a(array, array2, b);
        }
    }
    
    public final void a(final String s, final String s2, final byte b, final long n) {
        final al d;
        if ((d = this.d(241231)) != null) {
            ((ho)d).b(s, s2, b, n);
        }
    }
    
    public final void b(final String s, final String s2, final byte b, final long n) {
        final al d;
        if ((d = this.d(241231)) != null) {
            ((ho)d).a(s, s2, b, n);
        }
    }
    
    public final void a(final String s, final byte b, final long n) {
        final al d;
        if ((d = this.d(241231)) != null) {
            ((ho)d).b(s, b, n);
        }
    }
    
    public final void a(final int n, final int n2, final String s, final byte b, final long n3) {
        final al d;
        if ((d = this.d(241231)) != null) {
            ((ho)d).a(s, b, n3);
        }
    }
    
    public final void c(final String s, final String s2, final byte b, final long n) {
        final al d;
        if ((d = this.d(241232)) != null) {
            ((id)d).a(s, s2, b, n);
        }
    }
    
    public final void b(final String s, final byte b, final long n) {
        final al d;
        if ((d = this.d(241232)) != null) {
            ((id)d).b(s, b, n);
        }
    }
    
    public final void b(final int n, final int n2, final String s, final byte b, final long n3) {
        final al d;
        if ((d = this.d(241232)) != null) {
            ((id)d).a(s, b, n3);
        }
    }
    
    public final void d(final String s, final String s2, final byte b, final long n) {
        final al d;
        if ((d = this.d(241232)) != null) {
            ((id)d).b(s, s2, b, n);
        }
    }
    
    public final void b(final String s, final ll[] array, final lm[] array2, final byte b) {
        final al d;
        if ((d = this.d(241232)) != null) {
            ((id)d).a(array, array2, b);
        }
    }
    
    public final void w(String s) {
        this.v();
        ag.b().a(241217, false);
        if (com.mg.bas.i.b(s)) {
            s = "Nạp thẻ thành công";
        }
        t(s);
    }
    
    public final void b(String s, String u, String[] array, String[] v) {
        this.v();
        final String s2 = s;
        final String s3 = u;
        final String[] array2 = array;
        com.mg.sq.a.v = v;
        array = array2;
        u = s3;
        s = s2;
        ((a)ag.b()).v();
        com.mg.sq.a.u = u;
        com.mg.sq.a.v = v;
        final int n = (com.mg.bas.v.t < 320) ? (com.mg.bas.v.t - 20) : 200;
        final he he = new he();
        final bb bb;
        (bb = new bb(s, n - 20, bx.c)).a_(10, 10);
        final int n2 = 10 + (bb.f() + 5 + bx.d.a());
        he.a(bb);
        final gg gg;
        (gg = new gg("Mạng điện thoại")).a_(1);
        gg.a(array);
        gg.a(10, n2, n - 20, 20);
        gg.d(true);
        he.a(gg);
        final int n3 = n2 + (gg.f() + 5 + bx.d.a());
        final ff ff;
        (ff = new ff("Số Seri", 100, 2)).i(2);
        ff.a_(3);
        ff.a(10, n3, n - 20, 20);
        final int n4 = n3 + (ff.f() + 5 + bx.d.a());
        he.a((aq)ff);
        final ff ff2;
        (ff2 = new ff("Mã số nạp tiền", 100, 4)).i(3);
        ff2.a_(2);
        ff2.a(10, n4, n - 20, 20);
        final int n5 = n4 + (ff2.f() + 5);
        he.a((aq)ff2);
        final ex ex;
        (ex = new ex("Nạp", 209)).a(n / 2 - 70, n5, 50, 20);
        he.a(ex);
        final ex ex2;
        (ex2 = new ex("Đóng", 12350)).a(ex.c() + ex.e() + 40, n5, 50, 20);
        he.a(ex2);
        final int n6 = n5 + ex2.f() + 10;
        he.a(com.mg.bas.v.t - n >> 1, com.mg.bas.v.u - n6 >> 1, n, n6);
        he.a(ag.b());
        he.b(241217);
        he.a(new bd("", 209), true);
        he.b(new bd("", 12350), true);
        ag.b().a(he);
    }
    
    public final void V() {
        ct.a("[SQGameBoard]======================receiveQuitRoom=============");
        final oa oa;
        if ((oa = (oa)super.a).k != null) {
            final ol k;
            if ((k = oa.k).p != null && k.p.b() == 3) {
                ((os)k.p).r();
                return;
            }
            k.r = null;
        }
    }
    
    public final void b(final lr[] array) {
        ((oa)super.a).b(array);
    }
    
    public final void W() {
        ks.a().b();
        final char[] charArray = "SnbcnF`ldjgnmfahmgsgtnmf+jdsmnhunhl`xbgtrdahmf`s".toCharArray();
        for (int i = 0; i < charArray.length; ++i) {
            ++charArray[i];
        }
        final al a;
        (a = ag.b().a(" ", new String(charArray), "Đóng", 12349, 1)).a(false);
        a.a(this);
        ag.b().a(a);
    }
    
    public final void a(final String s, final long n) {
        this.v();
        System.out.println("[receiveAddEquipToMarket]====================" + n);
        ag.b().e(241234);
        if (this.c(241202)) {
            ((hh)this.d(241202)).a(s);
            return;
        }
        if (this.c(241235)) {
            this.d(241235);
            hq.t();
        }
    }
    
    public final void a(final String s, final ll[] array, final lm[] array2) {
        this.v();
        if (this.c(241235)) {
            ((hq)this.d(241235)).a(s, array, array2);
        }
    }
    
    public final void g(int i, int n) {
        this.v();
        this.e(241234);
        if (this.c(241202)) {
            final hh hh = (hh)this.d(241202);
            final int n2 = i;
            final int n3 = n;
            n = n2;
            final hh hh2 = hh;
            ag.b().e(-446456);
            ag.b().e(-1122154);
            hh2.i(n, n3);
            for (i = 0; i < go.m.length; ++i) {
                if (go.m[i].a == n) {
                    go.b(n, n3);
                    return;
                }
            }
            return;
        }
        if (this.c(241235)) {
            this.d(241235);
            hq.t();
        }
    }
    
    public final void a(final int n, final int n2, final lq[] array) {
        if (n != -1) {
            final al d;
            if ((d = this.d(241233)) != null) {
                ((hn)d).a(n, n2, array);
            }
        }
        else {
            if (this.c(241233)) {
                this.e(241233);
            }
            if (this.c(241235)) {
                ((hq)this.d(241235)).a(array);
                return;
            }
            this.a(new hq(array), false);
            this.v();
        }
    }
    
    public final void b(final String s, final ll[] array, final lm[] array2) {
        if (this.c(241233)) {
            ((hn)this.d(241233)).a(s, array, array2);
        }
    }
    
    public final void b(final lf[] array) {
        if (this.c(241233)) {
            this.e(241233);
        }
        else if (this.c(241235)) {
            this.e(241235);
        }
        this.a(new hn(array),   false);
        this.v();
    }
}
