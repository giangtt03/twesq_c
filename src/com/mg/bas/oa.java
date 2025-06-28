package com.mg.bas;
// Main platform/game screen, manages state, rendering, and user input.
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.smsgame.MGMIDlet;
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class oa
extends an
implements bf,
ik {
    public boolean a = false;
    private ns m;
    private fc n;
    public static byte[][] b;
    public static jn c;
    public static boolean d;
    private ks o;
    public ol k;
    private or p;
    private boolean q;
    private boolean r;
    private boolean s;
    public String l;
    private boolean t = false;
    private byte u = 0;
    private boolean v = true;
    private final a w;

    public oa() {
        super(1);
        ct.b("Initializing platform");
        this.a((ba)null);
        this.a((bf)this);
        this.f(true);
        this.a(false);
        this.d(false);
        this.w = com.mg.sq.a.s();
        try {
            this.B();
        }
        catch (OutOfMemoryError outOfMemoryError) {
            OutOfMemoryError outOfMemoryError2 = outOfMemoryError;
            outOfMemoryError.printStackTrace();
            if (com.mg.sq.a.m != null) {
                com.mg.sq.a.m.G();
            }
            System.gc();
            this.v = false;
            try {
                this.B();
            }
            catch (OutOfMemoryError outOfMemoryError3) {
                ct.a("[platformscreen contructor] outof memory");
                this.w.j(1);
            }
            catch (Exception exception) {
                outOfMemoryError2.printStackTrace();
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            this.w.j(6);
        }
        this.w.c();
        if (this.v && com.mg.sq.a.m != null) {
            this.e();
        } else {
            pc.a();
        }
        if (com.mg.sq.a.l != null && com.mg.sq.a.l.length > 0) {
            com.mg.sq.a.b(com.mg.sq.a.l);
            com.mg.sq.a.l = null;
        }
        if (ct.c()) {
            ct.b("Platform initialized");
        }
    }

    private void B() {
        this.n = new fc(1, 2, 3);
        this.n.a(this);
        this.b(1);
        this.o = ks.a();
        this.k = new ol(100, 0, "Bản Đồ", this);
        this.n.c(this.k);
        this.w.v();
        if (!co.b().f()) {
            this.w.a(this);
        }
    }

    public final void e() {
        try {
            if (com.mg.sq.a.m != null && com.mg.sq.a.o) {
                this.n.c(com.mg.sq.a.m);
                com.mg.sq.a.m.C();
            }
            oi.w();
            if (com.mg.sq.a.o) {
                com.mg.sq.a.m.g(false);
                return;
            }
        }
        catch (OutOfMemoryError outOfMemoryError) {
            oi.v();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }

    public final void f() {
        if (!d) {
            return;
        }
        if (hs.q != null || hs.p != null) {
            hs hs2 = new hs(1, go.k);
            hs2.a(this);
            hs2.a(new bd("Đóng", 113));
            az az2 = null;
            hs hs3 = hs2;
            hs3.a(az2, true);
            az2 = null;
            hs3 = hs2;
            hs3.b(az2, true);
            this.w.a(hs2);
        }
    }

    protected final void a(Graphics graphics) {
        this.n.a(graphics, 0, 0);
    }

    protected final void c() {
        this.n.n();
    }

    public final void d(int n, int n2) {
        switch (n2) {
            case 125: {
                if (this.k != null) {
                    ol ol2 = this.k;
                    if (ol2.p != null && ol2.p.b() == 3) {
                        ((os)ol2.p).s();
                    }
                }
                os.l = null;
                this.w.a(false);
                com.mg.sq.a.s().a((String)null, (il)null);
                pa.a().a(go.w, this);
                return;
            }
            case 11: {
                this.w.e(-241229);
                this.r = false;
                this.C();
                if (go.k.G == hs.l) break;
                com.mg.sq.a.G();
                if (this.k == null) break;
                hs.l = go.k.G;
                return;
            }
            case 113: {
                this.w.e(-241219);
                this.u();
                if (!this.r) {
                    this.C();
                    if (go.k.G != hs.l) {
                        com.mg.sq.a.G();
                        this.o.o();
                        this.s = true;
                        if (this.k != null) {
                            hs.l = go.k.G;
                            ol ol3 = this.k;
                            if (ol3.p instanceof om) {
                                ((om)ol3.p).t();
                            }
                        }
                    }
                }
                if (this.k != null) {
                    ol ol4 = this.k;
                    if (ol4.p instanceof om) {
                        ((om)ol4.p).s();
                    }
                }
                hs.t();
                return;
            }
            case 114: {
                this.w.e(-241439);
                return;
            }
            case 12: {
                this.w.a(false);
                return;
            }
            case 10: {
                com.mg.sq.a.s().a(true, null);
                this.t = true;
                return;
            }
            case 13: {
                com.mg.sq.a.s().a(false, null);
                return;
            }
            case 122: {
                this.w.e(199199);
                return;
            }
            case 120: {
                if (go.v != null && go.v.length > 0) {
                    n = 0;
                    while (n < go.v.length) {
                        go.a(go.v[n], go.v[n].g);
                        ++n;
                    }
                }
                this.w.e(-241439);
                return;
            }
            case 121: {
                this.w.a(false);
                com.mg.sq.a.s().a((String)null, (il)null);
                ks.a().f(this.l);
                return;
            }
            case 123: {
                this.w.l();
                this.o.a(true);
                return;
            }
            case 124: {
                this.w.a(false);
                this.o.a(false);
                return;
            }
            case 127: {
                this.w.a(false);
                hh hh2 = (hh)this.v();
                hh2.i(this.u);
                if (this.a) break;
                this.a = true;
                return;
            }
            case 2: {
                this.c(this.n.i);
                this.n.s();
                return;
            }
            case 1: {
                if (com.mg.sq.a.m == null || com.mg.sq.a.m.A() == null || !this.n.b(com.mg.sq.a.m.A())) break;
                this.n.a((fb)com.mg.sq.a.m.A());
                return;
            }
            case 3: {
                if (com.mg.sq.a.m == null || com.mg.sq.a.m.z() == null || !this.n.b(com.mg.sq.a.m.z())) break;
                this.n.a((fb)com.mg.sq.a.m.z());
                return;
            }
            case 99030: {
                if (this.k == null) break;
                this.k.j(2);
            }
        }
    }

    public final void a(String object, int n, int n2) {
        if (this.k != null && this.k.p instanceof om) {
            ((om)this.k.p).n = null;
        }
        switch (n2) {
            case 1: {
                hs.k = go.k.J;
                hs.l = go.k.G;
                return;
            }
            case 0: {
                go.x = n;
                go.w = object;
                if (object.equals("M99")) {
                    this.f(4);
                    return;
                }
                String string = object;
                oa oaInstance = this;
                System.gc();
                try {
                    com.mg.sq.a.s().a((String)null, (il)null, 3000);
                    oaInstance.w.a(5, new Object[]{string});
                    return;
                } catch (Exception caughtException) {
                    caughtException.printStackTrace();
                }
            }
        }
    }

    private void f(int n) {
        try {
            this.n.r();
            System.gc();
            this.w.f(4);
            this.w.l();
        }
        catch (Exception exception) {
            ct.b("out memmory");
            ct.a(exception.toString());
        }
        System.gc();
    }

    public final void a(ns[] nsArray) {
        if (this.s) {
            if (nsArray != null && nsArray.length > 0) {
                this.n.a((String)null);
            }
            this.s = false;
            return;
        }
        if (this.q) {
            this.q = false;
            if (this.w.c(241204)) {
                hr hr2 = (hr)this.w.d(241204);
                hr2.a(nsArray);
                hr2.a((byte)0);
                return;
            }
        } else if (this.w.c(241204)) {
            hr hr3 = (hr)this.w.d(241204);
            hr3.a(nsArray);
            hr3.a((byte)0);
        }
    }

    public final void a(ns ns2, boolean bl) {
        if (this.w.c(241204)) {
            hr hr2 = (hr)this.w.d(241204);
            hr2.a(ns2);
            if (bl) {
                hr2.a((byte)2);
            } else {
                hr2.a((byte)1);
            }
        }
        this.w.v();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(lh lh2, String object, long l, String string, boolean bl, boolean bl2) {
        if (this.t) {
            return;
        }
        ha haInstance = null;
        if (this.w.c(191919)) {
            haInstance = (ha)this.w.d(191919);
        }
        if (haInstance != null) {
            this.d(1, 13);
            return;
        }
        fb fbInstance = this.n.q();
        if (fbInstance != null) {
            fbInstance.t();
        }
        if (this.k != null) {
            boolean bl3 = bl2;
            boolean bl4 = bl;
            String string2 = string;
            long l2 = l;
            String object3 = object;
            lh lhInstance = lh2;
            ol currentOl = this.k;
            if (currentOl.p != null) {
                
                if (currentOl.p instanceof om) {
                    ((om)currentOl.p).m.a();
                    com.mg.bas.v.c();
                } else if (currentOl.p instanceof oq) {
                    ((oq)currentOl.p).a(lhInstance, object3, l2, string2, bl4, bl3);
                    return;
                }
            }
            boolean bl5 = false;
            if (bl5) {
                return;
            }
        }
        com.mg.sq.a.a(lh2, 10, 13, this, l, string, bl, bl2);
    }

    public final void a(String string, String object) {
        this.w.a(false);
        al dialog = this.w.a("", (object == null ? String.valueOf(string) + " không muốn đánh với bạn." : object), "Đóng", 12, 1);
        this.l = string;
        ((am)dialog).a(this);
        this.w.a(dialog, false);
    }

    public final void a(lh lh2, lh lh3, boolean bl, byte[] byArray, byte[] byArray2, byte[] byArray3, int n, byte by, byte by2) {
        this.t = false;
        c = null;
        b = null;
        if (this.k != null) {
            this.k.a(lh2, lh3, bl, byArray, byArray2, byArray3, by, by2);
        }
    }

    public final void a(lh lh2, lh lh3, boolean bl) {
        this.t = false;
        c = null;
        b = null;
        ha ha2 = null;
        if (this.w.c(191919)) {
            ha2 = (ha)this.w.d(191919);
        }
        if (ha2 == null) {
            this.w.e(-241209);
            this.w.e(-241249);
            ha2 = new ha(lh2, lh3, true, bl, 99030, (bf)this);
            ha2.a(this.k);
            this.w.a(ha2, false);
        }
        this.w.v();
        ha2.t();
    }

    public final void d() {
        com.mg.sq.a.b(false);
    }

    public final void a(jn jn2, byte[][] byArray) {
        c = jn2;
        b = byArray;
        System.gc();
        if (this.k != null) {
            this.k.j(1);
        }
        this.w.v();
    }

    protected final void a(int n) {
        this.n.f(n);
    }

    protected final void e(int n) {
        this.n.g(n);
    }

    protected final void g(int n, int n2) {
        this.n.e(n, n2);
    }

    protected final void e(int n, int n2) {
        this.n.c(n, n2);
    }

    protected final void f(int n, int n2) {
        this.n.f(n, n2);
    }

    public final void g() {
        this.w.v();
        if (this.w.c(241204)) {
            ((hr)this.w.d(241204)).w();
        }
    }

    public final void t() {
        this.w.v();
        if (this.w.c(241204)) {
            ((hr)this.w.d(241204)).v();
        }
    }

    public final void u() {
        Object object;
        ct.a("[QUEST] Check complete quests");
        if (this.k != null) {
            boolean bl;
            object = this.k;
            if (((ol)object).p instanceof oq) {
                bl = true;
            } else {
                if (((ol)object).p instanceof om) {
                    ((om)((ol)object).p).m.a();
                    com.mg.bas.v.c();
                }
                bl = false;
            }
            if (bl) {
                return;
            }
        }
        this.m = nu.a();
        if (this.m != null) {
            ct.a("[QUEST] Has completed quest " + this.m);
            this.r = true;
            object = new hb(this.m, this.m.g);
            ((am)object).a(this);
            ((am)object).a(new bd("Đóng", 11));
            az az2 = null;
            Object object2 = object;
            ((am)object2).a(az2, true);
            az2 = null;
            object2 = object;
            ((am)object2).b(az2, true);
            this.q = true;
            this.w.a((al)object);
            this.s = true;
            this.o.b(go.e);
            this.o.a(go.e, (byte)1);
            return;
        }
        object = nu.b();
        if (object != null) {
            this.c(((nt)object).a);
            nu.c();
            return;
        }
        object = nu.c();
        if (object != null) {
            this.n.a(((ns)object).a);
        }
    }

    public final void a(jo[] joArray, String joArray2) {
        if (!go.w.equals(joArray2)) {
            return;
        }
        ol ol2 = this.k;
        if (ol2.p instanceof om) {
            ((om)ol2.p).a(joArray, false);
        }
    }

    public final void e(boolean bl) {
        fb fb2;
        if (bl && (fb2 = this.n.q()) != null) {
            fb2.c(true);
        }
    }

    public static br[] a(fb fb2) {
        br br2 = new br("Hỗ trợ", 99001);
        br br3 = new br("Mua bán", 99002);
        br br4 = new br("Nạp KEN", 99003);
        br4.a(new br[]{new br("Nhắn tin", 99004), new br("Thẻ cào ĐT", 99005), new br("DS điện thoại", 99006)});
        if (com.mg.sq.a.m != null && com.mg.sq.a.o) {
            br2.a(new br[]{new br("Thông Tin #12", 99031), new br("Giới thiệu", 99007), new br("Hướng dẫn", 99008), new br("Thảo luận #SQ", 99009), new br("Hỗ trợ", 99012), new br("Đổi SĐT", 99010), new br("Cài đặt", 99011)});
            br3.a(new br[]{new br("Cửa hàng", 99013), new br("Chợ trời", 99034), new br("Giao dịch", 99014), br4, new br("Mua vip", 99015), new br("Rao vặt #sqgd", 99017)});
        } else {
            br2.a(new br[]{new br("Giới thiệu", 99007), new br("Hỗ trợ", 99001), new br("Đổi SĐT", 99010), new br("Cài đặt", 99011)});
            br3.a(new br[]{new br("Cửa hàng", 99013), new br("Chợ trời", 99034), new br("Giao dịch", 99014)});
        }
        br br5 = new br("Đăng nhập OLA", 99032);
        br br6 = new br("Nhân Vật", 99018);
        br6.a(new br[]{new br("Thông tin", 99019), new br("Tuyệt Chiêu", 99020), new br("Rương Đồ", 99021), new br("Chế tạo", 99033), new br(gs.c[0], 99022), new br(gs.c[1], 99023)});
        br[] brArray = null;
        if (fb2 instanceof ol) {
            fb2 = (ol)fb2;
            if (((ol)fb2).p != null) {
                brArray = ((ol)fb2).p instanceof os ? (!com.mg.sq.a.o ? (((os)((ol)fb2).p).q() == 1 ? new br[]{new br("Trở về", 99028), new br("Khiêu Chiến", 99024), br6, br3, new br("Nhiệm Vụ", 99025), br5, br2, new br("Thoát", 99027)} : new br[]{new br("Khiêu Chiến", 99024), br6, br3, new br("Nhiệm Vụ", 99025), br5, br2, new br("Thoát", 99027)}) : (((os)((ol)fb2).p).q() == 1 ? new br[]{new br("Trở về", 99028), new br("Khiêu Chiến", 99024), br6, br3, new br("Nhiệm Vụ", 99025), br2, new br("Thoát", 99027)} : new br[]{new br("Khiêu Chiến", 99024), br6, br3, new br("Nhiệm Vụ", 99025), br2, new br("Thoát", 99027)})) : (!com.mg.sq.a.o ? new br[]{new br("Về Bản đồ", 99035), new br("Lôi Đài", 99028), new br("Khiêu Chiến", 99024), br6, br3, br4, new br("Nhiệm Vụ", 99025), br5, br2, new br("Đăng Xuất", 99026)} : new br[]{new br("Về Bản đồ", 99035), new br("Lôi Đài", 99028), new br("Khiêu Chiến", 99024), br6, br3, br4, new br("Nhiệm Vụ", 99025), br2, new br("Đăng Xuất", 99026)});
            }
        }
        if (com.mg.sq.a.m != null) {
            brArray = com.mg.sq.a.m.a(brArray, 4);
        }
        return brArray;
    }

    public final boolean a(int n, br object) {
        switch (n) {
            case 99001: {
                return true;
            }
            case 99002: {
                return true;
            }
            case 99003: {
                com.mg.sq.a.s().N();
                return true;
            }
            case 99004: 
            case 99005: 
            case 99006: {
                if (!com.mg.sq.a.s().m(n)) {
                    if (com.mg.sq.a.m != null) {
                        return com.mg.sq.a.m.b(((br)object).b());
                    }
                    return false;
                }
                return true;
            }
            case 99007: {
                com.mg.sq.a.D();
                return true;
            }
            case 99031: {
                if (com.mg.sq.a.m != null) {
                    com.mg.sq.a.m.g(true);
                }
                return true;
            }
            case 99009: {
                if (com.mg.sq.a.m != null) {
                    com.mg.sq.a.m.h(true);
                }
                return true;
            }
            case 99008: {
                if (com.mg.sq.a.m != null) {
                    com.mg.sq.a.m.F();
                }
                return true;
            }
            case 99010: {
                com.mg.sq.a.s().S();
                return true;
            }
            case 99011: {
                com.mg.sq.a.F();
                return true;
            }
            case 99012: {
                MGMIDlet.d();
                MGMIDlet.b("1900588883");
                return true;
            }
            case 99013: {
                com.mg.sq.a.s().H();
                return true;
            }
            case 99034: {
                com.mg.sq.a.s().I();
                return true;
            }
            case 99014: {
                com.mg.sq.a.e("Nhập tên người cần giao dịch");
                return true;
            }
            case 99015: {
                du.a().b((short)2412);
                com.mg.sq.a.s().a((String)null, (il)null);
                return true;
            }
            case 99017: {
                if (com.mg.sq.a.m != null) {
                    com.mg.sq.a.m.E();
                }
                return true;
            }
            case 99018: {
                return true;
            }
            case 99019: {
                com.mg.sq.a.G();
                return true;
            }
            case 99020: {
                oa oa2 = this;
                al dialog = new ib(); 
                oa2.w.a(dialog);
                return true;
            }
            case 99021: {
                this.v();
                return true;
            }
            case 99033: {
                this.w.a(false);
                com.mg.sq.a.s().J();
                return true;
            }
            case 99022: {
                this.w.Q();
                return true;
            }
            case 99023: {
                this.w.R();
                return true;
            }
            case 99024: {
                com.mg.sq.a.d("");
                return true;
            }
            case 99025: {
                this.c((String)null);
                return true;
            }
            case 99026: {
                com.mg.sq.a.u();
                return true;
            }
            case 99027: {
                al al2 = this.w.a("Chú ý", "Bạn muốn thoát khỏi Lôi Đài?", "Có", 125, "Không", 12, 1);
                al2.a(this);
                this.w.a(al2, false);
                return true;
            }
            case 99028: {
                this.o.r();
                com.mg.sq.a.s().a((String)null, (il)null);
                return true;
            }
            case 11399: {
                if (com.mg.sq.a.m == null) break;
                com.mg.sq.a.m.b(((br)object).b());
                break;
            }
            case 99032: {
                ob.d();
                break;
            }
            case 99035: {
                go.w = "M99";
                go.x = 0;
                this.f(4);
            }
        }
        return false;
    }

    public final void a(String string, boolean bl, int n, boolean bl2, boolean bl3) {
        this.w.f(string);
        this.o.a(string, "", false, 0L, false, false);
    }

    public final al v() {
        if (this.w.c(241202)) {
            this.w.e(241202);
        }
        hh hh2 = new hh(null, null);
        this.w.a(hh2);
        return hh2;
    }

    private void c(String string) {
        hr hr2 = new hr();
        hr2.a((Object)this.k);
        this.w.a(hr2);
        if (string == null) {
            this.o.o();
        } else {
            this.o.o(string);
        }
        com.mg.sq.a.s().a((String)null, (il)null);
    }

    private void C() {
        if (go.v != null && go.v.length > 0) {
            hl hl2 = new hl("Bạn nhận được: ", go.v);
            hl2.a(this);
            az az2 = null;
            hl hl3 = hl2;
            hl3.a(az2, true);
            az2 = null;
            hl3 = hl2;
            hl3.b(az2, true);
            ((am)hl2).a(new bd("Đóng", 120));
            this.w.a(hl2);
        }
    }

    public final void a(String object) {
        al dialog = this.w.a("", String.valueOf(this.l) + " đang đánh nhau với " + object + ". Muốn xem trận đánh không?", "Xem", 121, "Đóng", 12, 1);
        ((am)dialog).a(this);
        this.w.a(dialog, false);
    }

    public final void b(String object) {
        if (this.k != null && this.k.p instanceof oq) {
            this.o.a(false);
            return;
        }
        al dialog = this.w.a("", String.valueOf(object) + " muốn giao dịch với bạn. Bạn có đồng ý không?", "Đồng ý", 123, "Không", 124, 1);
        ((am)dialog).b(241207);
        ((am)dialog).a(this);
        this.w.a(dialog, false);
    }

    public final boolean w() {
        int n = 0;
        while (n < go.k.D.length) {
            int n2 = 0;
            while (n2 < go.l.length) {
                if (go.k.D[n].c.equals(go.l[n2].c) && go.l[n2].p == 0 && go.l[n2].p < go.l[n2].q) {
                    if (!this.a) {
                        al al2 = this.w.a("", "Trang bị đã hư hỏng sẽ mất tác dụng. Bạn có muốn sửa chữa không? ", "Đồng ý", 127, "Không", 12, 1);
                        al2.a(this);
                        this.w.a(al2, false);
                        this.u = go.l[n2].e;
                    }
                    return true;
                }
                ++n2;
            }
            ++n;
        }
        return false;
    }

    public final void x() {
        if (this.k != null) {
            ol ol2 = this.k;
            if (ol2.p != null && ol2.p.b() == 1) {
                ((om)ol2.p).u();
            }
        }
        this.w.l();
    }

    public final void a(int n, dh[] dhArray) {
        if (dhArray == null || dhArray.length <= 0) {
            al al2 = this.w.a("Chú ý", "Tính năng đang được bảo trì, vui lòng thử lại sau.", "Đóng", 12, 1);
            al2.a(this);
            this.w.a(al2, false);
            return;
        }
        if (this.p == null) {
            this.p = new or(this);
        }
        this.p.a(n, dhArray);
        if (!this.n.b(this.p)) {
            this.n.c(this.p);
        }
        this.n.a((bf)this.p);
    }

    public final void y() {
        this.t = false;
    }

    public final void z() {
        this.n.d(this.p);
        this.p = null;
        if (this.k != null) {
            this.n.a((bf)this.p);
        }
    }

    public final void a(lr[] lrArray) {
        if (this.k != null) {
            ol olInstance = this.k;
            this.k.t = false;
            if (olInstance.p == null || olInstance.p.b() != 3) {
                olInstance.j(3);
                os.l = lrArray;
            } else if (olInstance.p.b() == 3) {
                ((os)olInstance.p).a(lrArray);
            }
        }
        this.w.v();
    }

    public final void b(lr[] lrArray) {
        if (this.k != null) {
            ol olInstance = this.k;
            if (olInstance.p != null && olInstance.p.b() == 3) {
                ((os)olInstance.p).b(lrArray);
            }
        }
        this.w.v();
    }

    public final void A() {
        this.t = false;
    }

    protected final void s() {
        this.k.A();
        this.k = null;
        this.n.r();
        this.n = null;
        this.p = null;
        this.i = null;
        this.m = null;
        this.o = null;
        pa.a().d();
        c = null;
        b = null;
        go.v = null;
        go.u = null;
        go.v = null;
        d = false;
        ct.b("Finish PlatformScreen.destroyed()");
    }
}
