package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.smsgame.MGMIDlet;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class on
extends fb
implements bf,
bg,
bn,
bq {
    private aw r;
    private ay s;
    private int t = 0;
    private ex u;
    private String[] v;
    private String w;
    private String x;
    private int y;
    private int z;
    private boolean A;
    private long B = 0L;
    private String[][] C;
    public a p;
    public boolean q = false;
    private int D;
    private long E = -1L;
    private aw F = null;
    private ay G = null;
    private a H = null;
    private String I = null;
    private String J;
    private int K;
    private boolean L = false;
    private int M = -1987;
    private fu N;
    private int O = 0;
    private long P;
    private String[] Q = new String[]{"Bạn đang làm gì?", "Bạn đang nghĩ gì?", "Hôm nay có gì HOT?", "Ngoài trời đang...?", "Bạn đang xem gì?", "Hôm nay có gì vui?", "Nếu có 1 điều ước..."};

    public on(int n, int n2, String string) {
        super(107, 5, string, false);
        this.a(0, 0, v.t, v.u);
        this.v = bx.a("Ola Me - Loan tin tức thời. Bạn có thể lắng nghe và chia sẻ tâm sự với những người được quan tâm. Phiên bản web tại http://me.ola.vn ", v.t, bx.d);
        this.u = new ex("Xem ME", -2);
        this.u.a((v.t - 100) / 2, 10 + bx.d.a() + 10 + 10 + bx.d.a() * this.v.length, 100, 20);
        this.a();
        this.a(new ba());
        this.j(0);
        this.C = pd.E();
        this.p = new a();
        this.a(new gb(-1, 0));
        this.c(com.mg.sq.a.n);
        this.b(new gb(-2, 1));
        this.a(this);
    }

    private void a() {
        this.r = new aw();
        this.r.a(this);
        this.r.a(this);
        this.r.h(5);
        this.s = new ay(0);
        this.s.a(1, 0, v.t - 2, v.u - ba.a);
        this.s.b(this.r);
    }

    private he a(String object) {
        object = com.mg.sq.a.a((String)object, null, "Xong", -5, "Hủy", -3, -9, this);
        ((am)object).b(-989858);
        this.N = (fu)((he)object).e(4);
        return object;
    }

    private void v() {
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
    }

    private void w() {
        this.r = this.F;
        this.s = this.G;
        this.p = this.H;
        this.z = this.K;
        this.w = this.I;
        this.x = this.J;
        if (this.x != null) {
            bx.d.c(true);
            this.y = bx.d.a(this.x) + 6;
            bx.d.c();
        }
        this.v();
        this.c(true);
    }

    public final void a(ef ef2, ef[] efArray) {
        ef[] efArray2;
        if (!this.z()) {
            efArray2 = this;
            this.F = efArray2.r;
            efArray2.G = efArray2.s;
            efArray2.K = efArray2.z;
            efArray2.I = efArray2.w;
            efArray2.J = efArray2.x;
            efArray2.H = efArray2.p;
            super.a();
        }
        if (this.w == null || !this.w.equals("Bình luận") || this.A) {
            this.p = new a();
            if (efArray == null) {
                efArray = new ef[]{ef2};
            } else {
                efArray2 = new ef[efArray.length + 1];
                System.arraycopy(efArray, 0, efArray2, 1, efArray.length);
                efArray2[0] = ef2;
                efArray = efArray2;
            }
        }
        super.a("Bình luận", (short)3, efArray, true);
    }

    public final void a(String string, short s, ef[] efArray) {
        this.a(string, s, efArray, false);
        if (string != null && string.equals("#12")) {
            if (efArray == null || efArray.length == 0) {
                return;
            }
            if (efArray.length > 1) {
                if (efArray[0].e() < efArray[1].e()) {
                    this.P = efArray[1].e();
                }
            } else {
                this.P = efArray[0].e();
            }
            if (!pd.d(this.P)) {
                boolean bl = true;
                on on2 = this;
                if (on2.b != null) {
                    fc fc2 = (fc)on2.l();
                    fc2.e(on2);
                    on2.c(true);
                }
            }
        }
    }

    private void a(String object, short s, ef[] efArray, boolean bl) {
        com.mg.sq.a.s().v();
        if (efArray == null || efArray.length == 0) {
            return;
        }
        if (!bl) {
            this.v();
        }
        Object object2 = new dl[efArray.length];
        int n2 = 0;
        while (n2 < ((dl[])object2).length) {
            object2[n2] = new dl(efArray[n2], this.r.e() - 4);
            object2[n2].a(efArray[n2].d());
            ++n2;
        }
        short s2 = s;
        String string = object;
        object = this;
        try {
            Object object3;
            int n3;
            n2 = ((on)object).r.s();
            ((on)object).z = s2;
            try {
                if (((on)object).w == null && string != null || ((on)object).w != null && string == null || ((on)object).w != null && !((on)object).w.equals(string) || ((on)object).A) {
                    ((on)object).r.q();
                    ((on)object).p.a();
                    if (com.mg.sq.a.m != null) {
                        com.mg.sq.a.m.q.a();
                    }
                    n2 = 1;
                    ((on)object).A = false;
                }
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
            ((on)object).w = string;
            if (((on)object).w == null) {
                ((on)object).x = "Trang chủ";
            } else {
                ((on)object).x = string;
                oi oi2 = com.mg.sq.a.m;
                if (oi2 != null && oi2.s != null) {
                    n3 = 0;
                    while (n3 < oi2.s.length) {
                        if (oi2.s[n3].equals(string)) {
                            ((on)object).x = oi2.t[n3];
                            break;
                        }
                        ++n3;
                    }
                }
            }
            if (((on)object).x != null) {
                bx.d.c(true);
                ((on)object).y = bx.d.a(((on)object).x) + 6;
                bx.d.c();
            }
            boolean bl2 = super.z();
            if (((on)object).r.a() > 0) {
                if (((on)object).L) {
                    if (bl2) {
                        ((on)object).r.a((Object[])object2, 2);
                    } else {
                        ((on)object).r.a((Object[])object2, 1);
                    }
                } else {
                    ((on)object).r.a((Object[])object2, ((on)object).r.a() - 1);
                }
            } else {
                if (bl2) {
                    object2[0].n = true;
                }
                ((on)object).r.a(new dp("Xem mới nhất", null));
                ((on)object).r.a((Object[])object2);
                ((on)object).r.a(new dp("Xem thêm", null));
            }
            n3 = 0;
            while (n3 < ((Object[])object2).length) {
                if (bl2 && ((on)object).E >= 0L && ((dl)object2[n3]).e == ((on)object).E && !((dl)object2[n3]).n) {
                    ((dl)object2[n3]).o = true;
                }
                a a2 = ((on)object).p;
                object3 = object2[n3];
                a a3 = ((dl)object3).a.d();
                if (((dl)object3).d != null && ((dl)object3).d.j == -10) {
                    a2.a(((dl)object3).d.i);
                }
                int n4 = 0;
                while (n4 < a3.d()) {
                    n n5 = ((dl)object3).a.a(n4);
                    if (n5.c() == 1) {
                        n5 = (lo)n5;
                        if (((lo)n5).j == -10) {
                            a2.a(((lo)n5).i);
                        }
                    }
                    ++n4;
                }
                ++n3;
            }
            dp dp2 = (dp)((on)object).r.i(((on)object).r.a() - 1);
            object2 = (dl)((on)object).r.i(1);
            object3 = (dl)((on)object).r.i(((on)object).r.a() - 2);
            dp2.b = new long[]{((dl)object3).e, ((dl)object3).e};
            dp2 = (dp)((on)object).r.i(0);
            if (bl2 && ((on)object).r.a() >= 4) {
                object2 = (dl)((on)object).r.i(2);
            }
            dp2.b = new long[]{object2.e, -object2.e};
            if (n2 > 1) {
                --n2;
            }
            ((on)object).r.k(n2);
            super.j(4);
            if (!bl2) {
                ((on)object).C = pd.a(((on)object).C, ((on)object).x, string);
                return;
            }
        }
        catch (Exception exception) {
            Exception exception3 = exception;
            exception.printStackTrace();
        }
    }

    private boolean z() {
        return this.w != null && this.w.equals("Bình luận");
    }

    private void j(int n2) {
        this.t = n2;
        if (n2 == 0) {
            this.u.d(true);
        }
        this.c(true);
    }

    private void A() {
        long l = 0L;
        String string = null;
        on on2 = this;
        on2.a(string, l, true);
    }

    public final void c(boolean bl) {
        super.c(bl);
        if (bl) {
            this.s.c(true);
        }
    }

    public final boolean f(int n2) {
        if (this.t == 0) {
            if (n2 == 95) {
                this.A();
                return true;
            }
        } else {
            if (n2 == 153) {
                this.C();
                return true;
            }
            if (n2 == 148) {
                this.A();
                return true;
            }
            if (n2 == this.M) {
                fp fp2;
                boolean bl = false;
                if (this.r.t() instanceof dl) {
                    fp2 = (fp)this.r.u();
                    if (n2 == 99) {
                        bl = fp2.r();
                    } else if (n2 == 98) {
                        bl = fp2.q();
                    }
                    if (bl) {
                        fp2.a();
                        return true;
                    }
                }
                if (n2 == 99) {
                    bl = this.r.x();
                } else if (n2 == 98) {
                    bl = this.r.y();
                }
                if (bl) {
                    if (this.r.t() instanceof dl) {
                        fp2 = (fp)this.r.u();
                        fp2.a();
                    }
                    return true;
                }
            } else {
                this.M = n2;
            }
            return this.s.f(n2);
        }
        return false;
    }

    public final boolean g(int n2) {
        this.M = -1987;
        return true;
    }

    public final boolean c(int n2, int n3) {
        if (this.t == 0) {
            if (this.u.h().b(n2, n3)) {
                this.u.d(true);
                this.f(95);
                return true;
            }
        } else {
            return this.s.c(n2, n3);
        }
        return super.c(n2, n3);
    }

    public final boolean e(int n2, int n3) {
        if (this.t != 0) {
            return this.s.e(n2, n3);
        }
        return super.e(n2, n3);
    }

    public final boolean f(int n2, int n3) {
        if (this.t != 0) {
            return this.s.f(n2, n3);
        }
        return super.f(n2, n3);
    }

    public final void n() {
        if (this.t != 0) {
            this.s.n();
        }
    }

    private static void a(Graphics graphics) {
        graphics.setColor(v.am);
        graphics.fillRect(0, 0, v.t, v.u - ba.a);
    }

    public final void a(Graphics graphics, int n2, int n3) {
        if (this.t == 0) {
            if (this.c) {
                on.a(graphics);
                bx.d.c(true);
                bx.d.a(graphics, "Giới thiệu", v.t >>> 1, 10, 1);
                bx.d.c();
                n2 = 10 + (10 + bx.d.a());
                bx.a(graphics, bx.d, this.v, 0, n2, v.t, v.u, 1);
                this.u.a(graphics, this.c(), this.d());
                this.c(false);
                return;
            }
        } else if (this.s.k()) {
            on.a(graphics);
            this.s.a(graphics, this.c(), this.d());
            if (this.x != null) {
                n2 = v.t - this.y;
                pc.a(graphics, n2, 0, this.y, 18, 0xEF0000, 16177368);
                bx.d.c(true);
                bx.d.a(graphics, this.x, n2 + 3, 2, 0);
                bx.d.c();
            }
        }
    }

    public final void x() {
        this.q = false;
        this.c(true);
        if (this.w != null && this.w.equals("#12")) {
            pd.c(this.P);
        }
    }

    public final void y() {
    }

    public final void a(aq aq2, int n2) {
    }

    public final void a(aq aq2, int n2, int n3) {
    }

    public final void d(int n2, int n3) {
        switch (n3) {
            case -1: {
                on on2 = this;
                bs bs2 = new bs();
                bs2.a(new gb(0, 2));
                bs2.b(new gb(1, 3));
                oi oi2 = com.mg.sq.a.m;
                if (oi2 != null) {
                    Object[] objectArray;
                    if (on2.t == 4) {
                        Object[] objectArray2;
                        if (on2.z()) {
                            objectArray2 = new br[]{new br("Gửi Me", 1070007), new br("Trở về", 1070008), new br("Đóng", 1070009)};
                        } else {
                            int n4;
                            int n5;
                            Object[] objectArray3;
                            objectArray2 = new br[]{new br("Gửi Me", 1070007), new br("Xem ME", 1070002), new br("Cập nhật", 1070010), new br("Đóng", 1070009)};
                            if (on2.C != null && on2.C.length > 0) {
                                objectArray = new br[5];
                                System.arraycopy(objectArray2, 0, objectArray, 0, 2);
                                objectArray[2] = new br("Nhật ký", 1070011);
                                objectArray3 = new br[on2.C.length];
                                n5 = 0;
                                while (n5 < objectArray3.length) {
                                    objectArray3[n5] = (int)new br(on2.C[n5][0], 1070011);
                                    ++n5;
                                }
                                ((br)objectArray[2]).a((br[])objectArray3);
                                System.arraycopy(objectArray2, 2, objectArray, 3, 2);
                                objectArray2 = objectArray;
                            }
                            objectArray = new String[2 + (oi2.s != null ? oi2.s.length : 0)];
                            objectArray3 = new int[objectArray.length];
                            objectArray[0] = "Trang chủ";
                            objectArray3[0] = 1070013;
                            objectArray[objectArray.length - 1] = "Trang khác";
                            objectArray3[objectArray3.length - 1] = 1070014;
                            if (oi2.s != null) {
                                n5 = 0;
                                int n6 = 1;
                                while (n6 < objectArray.length - 1) {
                                    objectArray[n6] = oi2.t[n5++];
                                    objectArray3[n6] = 1070019;
                                    ++n6;
                                }
                            }
                            String[] stringArray = new String[objectArray.length - 1];
                            int[] nArray = new int[objectArray3.length - 1];
                            int n7 = -1;
                            if (on2.w == null) {
                                n7 = 0;
                            } else if (oi2.s != null) {
                                int n8 = 0;
                                n4 = 1;
                                while (n4 < objectArray.length - 1) {
                                    if (on2.w.equals(oi2.s[n8++])) {
                                        n7 = n4;
                                        break;
                                    }
                                    ++n4;
                                }
                            }
                            if (n7 >= 0) {
                                System.arraycopy(objectArray, 0, stringArray, 0, n7);
                                System.arraycopy(objectArray, n7 + 1, stringArray, n7, stringArray.length - n7);
                                System.arraycopy(objectArray3, 0, nArray, 0, n7);
                                System.arraycopy(objectArray3, n7 + 1, nArray, n7, nArray.length - n7);
                                objectArray = stringArray;
                                objectArray3 = nArray;
                            }
                            br[] brArray = new br[objectArray.length];
                            n4 = 0;
                            while (n4 < brArray.length) {
                                brArray[n4] = new br((String)objectArray[n4], objectArray3[n4]);
                                ++n4;
                            }
                            ((br)objectArray2[1]).a(brArray);
                            if (!(on2.z != 1 && on2.z != 0 || on2.w == null || (on2.w.length() < 3 || on2.w.equals(go.e)) && on2.w.charAt(0) != '#')) {
                                br[] brArray2 = new br[objectArray2.length + 1];
                                System.arraycopy(objectArray2, 0, brArray2, 1, objectArray2.length);
                                brArray2[0] = on2.w.charAt(0) == '#' ? (on2.z == 1 ? new br("Rời clan", 1070015) : new br("Gia nhập", 1070016)) : (on2.z == 1 ? new br("Ngừng quan tâm", 1070017) : new br("Quan tâm", 1070018));
                                objectArray2 = brArray2;
                            }
                            if (com.mg.sq.a.m != null) {
                                objectArray2 = com.mg.sq.a.m.a((br[])objectArray2, objectArray2.length - 2);
                                objectArray2 = oi.b((br[])objectArray2, objectArray2.length - 2);
                            }
                        }
                        bs2.a((br[])objectArray2);
                    } else {
                        int n9;
                        br[] brArray = new br[]{new br("Gửi Me", 1070007), new br("Xem ME", 1070002), new br("Đóng", 1070009)};
                        objectArray = new String[2 + (oi2.s != null ? oi2.s.length : 0)];
                        int[] nArray = new int[objectArray.length];
                        objectArray[0] = "Trang chủ";
                        nArray[0] = 1070013;
                        objectArray[objectArray.length - 1] = "Trang khác";
                        nArray[nArray.length - 1] = 1070014;
                        if (oi2.s != null) {
                            int n10 = 0;
                            n9 = 1;
                            while (n9 < objectArray.length - 1) {
                                objectArray[n9] = oi2.t[n10++];
                                nArray[n9] = 1070019;
                                ++n9;
                            }
                        }
                        br[] brArray3 = new br[objectArray.length];
                        n9 = 0;
                        while (n9 < brArray3.length) {
                            brArray3[n9] = new br((String)objectArray[n9], nArray[n9]);
                            ++n9;
                        }
                        brArray[1].a(brArray3);
                        if (com.mg.sq.a.m != null) {
                            brArray = com.mg.sq.a.m.a(brArray, 2);
                            brArray = oi.b(brArray, brArray.length - 1);
                        }
                        bs2.a(brArray);
                    }
                    int n11 = bs2.e() > bs2.f() ? bs2.e() : bs2.f();
                    bs2.a_(-n11, v.u);
                    bs2.d(0, v.u - ba.a - bs2.f());
                    bs2.a(on2);
                    on2.a(bs2);
                }
                return;
            }
            case 1: {
                this.t();
                return;
            }
            case 0: {
                this.l.f(95);
                return;
            }
            case -4: {
                Object object = com.mg.sq.a.k(241220).trim();
                if (!i.b((String)object)) {
                    long l = 0L;
                    String string = object;
                    object = this;
                    ((on)object).a(string, l, true);
                }
                com.mg.sq.a.s().a(241220, false);
                return;
            }
            case -5: {
                Object object = com.mg.sq.a.k(-989858);
                n3 = this.N.r() + 1;
                if (!i.b((String)object)) {
                    short s = (short)n3;
                    String string = object;
                    object = this;
                    ((on)object).a(string, ((on)object).B, (int)s);
                    ((on)object).B = 0L;
                }
                com.mg.sq.a.s().a(-989858, false);
                return;
            }
            case -3: {
                com.mg.sq.a.s().a(241220, false);
                com.mg.sq.a.s().a(-989858, false);
                return;
            }
            case -7: {
                ++this.D;
                this.B();
                com.mg.sq.a.s().a(false);
                return;
            }
            case -8: {
                com.mg.sq.a.s().a(false);
                return;
            }
            case -9: {
                hp hp2 = new hp(2);
                hp2.e(this.N.r());
                hp2.f(this.O);
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
                if (this.N == null || hp3 == null || oy.f == null) break;
                this.O = hp3.v();
                this.N.a(oy.f);
                this.N.h(this.O);
                this.N.b(oy.a[this.O], oy.b[this.O], oy.c[this.O], oy.d[this.O]);
                hp3.e(this.O);
                ag.b().e(999999223);
                return;
            }
            case -8883: {
                hp hp4 = (hp)com.mg.sq.a.s().d(999999223);
                if (hp4 != null) {
                    hp4.u();
                    this.N.a((Image)null);
                    this.N.h(-1);
                }
                ag.b().e(999999223);
                return;
            }
            default: {
                ((fc)this.b).a();
            }
        }
    }

    public final void a(String string, long l, int n2) {
        if (this.t != 0 && this.r.a() > 0 && (this.w == null || i.a(this.w, go.e) || l > 0L && this.w.equals("Bình luận"))) {
            Object object = new ef();
            ((ef)object).b(-1L);
            ((ef)object).b(string);
            ((ef)object).a(go.e);
            ((ef)object).a((short)n2);
            object = new dl((ef)object, this.r.e() - 4);
            ((dl)object).a(0L);
            if (l > 0L && this.z()) {
                this.r.a(object, 2);
            } else {
                this.r.a(object, 1);
            }
        }
        if (l > 0L) {
            du.a().a(string, l, null, (short)n2);
        } else {
            du.a().b(string, null, (short)n2);
        }
        com.mg.sq.a.E();
    }

    private void a(long l, long l2, boolean bl) {
        this.A = bl;
        com.mg.sq.a.s().a((String)null, (il)null, 375);
        du.a().a(l, l2, (short)this.i);
    }

    public final void a(String string, long l) {
        this.a(string, l, true);
    }

    private void a(String string, long l, boolean bl) {
        this.A = bl;
        com.mg.sq.a.s().a((String)null, (il)null, 375);
        du.a().a(string, l, (short)this.i);
    }

    private void B() {
        dl dl2 = (dl)this.r.t();
        this.r.j(this.r.s());
        du.a().a(dl2.e);
    }

    private void e(boolean n2) {
        Object object;
        dl dl2 = (dl)this.r.t();
        he he2 = this.a("Trả lời");
        String string = "@" + dl2.c + " ";
        int n3 = string.length() - 1;
        if (n2 != 0) {
            n2 = 0;
            while (n2 < dl2.m.length) {
                object = dl2.a.a(dl2.m[n2]);
                string = String.valueOf(string) + dl2.a.b(((n)object).b(), dl2.m[n2]) + " ";
                ++n2;
            }
        }
        if (this.w != null && this.w.charAt(0) == '#') {
            string = String.valueOf(string) + this.w + " ";
        }
        n2 = string.length() - n3;
        this.B = dl2.e;
        object = (ff)he2.e(1);
        ((ff)object).c(string);
        ((ff)object).g(n3, n2);
        ag.b().a(he2);
    }

    public final void a(int n2, int n3, Object object) {
        if (object == null) {
            return;
        }
        n2 = this.l.b();
        object = (br)object;
        Object object2 = null;
        Object object3 = null;
        Object object4 = null;
        int n4 = 0;
        if (n2 == 1 && (object2 = (dl)this.r.t()) != null) {
            object3 = ((dl)object2).a();
            object4 = object2;
            n4 = dl.b(((dl)object4).h);
            object4 = ((o)object3).b(((o)object3).a(n4).b(), n4);
            if (object4 == null || ((String)object4).length() <= 0) {
                object4 = ((dl)object2).c;
            }
            if (((String)object4).charAt(0) == '@') {
                object4 = ((String)object4).substring(1);
            }
        }
        switch (n3) {
            case 1070000: {
                String string = ((o)object3).b(((o)object3).a(n4).b(), n4);
                long l = 0L;
                object3 = string;
                object4 = this;
                ((on)object4).a((String)object3, l, true);
                break;
            }
            case 1070020: {
                if (((br)object).b().equals("Xem Ảnh")) {
                    if (com.mg.sq.a.m == null) break;
                    lo lo2 = (lo)((dl)object2).a.a(((dl)object2).h);
                    object4 = com.mg.sq.a.m;
                    ((oi)object4).q.a(lo2.i.a());
                    break;
                }
                if (!((br)object).b().equals("Xem video") && !((br)object).b().equals("Nghe audio")) break;
                com.mg.sq.a.s().C();
                break;
            }
            case 1070001: {
                if (com.mg.sq.a.m == null) break;
                com.mg.sq.a.m.c((String)object4);
                break;
            }
            case 1070002: {
                long l = 0L;
                object3 = object4;
                object4 = this;
                ((on)object4).a((String)object3, l, true);
                break;
            }
            case 1070003: {
                String string;
                ff.i = string = ((o)object3).b(((o)object3).a(n4).b(), n4);
                break;
            }
            case 1070004: {
                String string = ((o)object3).b(((o)object3).a(n4).b(), n4);
                if (com.mg.sq.a.m == null) break;
                String string2 = string;
                object3 = ((dl)object2).c;
                object4 = com.mg.sq.a.m;
                ((oi)object4).a((String)object3, string2, true);
                break;
            }
            case 1070005: {
                lo lo3 = (lo)((o)object3).a(n4);
                com.mg.sq.a.d("Nhập nick muốn gửi", lo3.i.a());
                break;
            }
            case 1070006: {
                String string = ((dl)object2).a.i();
                if (((dl)object2).d != null) {
                    string = String.valueOf(string) + ((dl)object2).d.a();
                }
                ff.i = string;
                break;
            }
            case 1070007: {
                he he2 = this.a(this.Q[cv.a(this.Q.length)]);
                ff ff2 = (ff)he2.e(1);
                if (!i.b(this.w)) {
                    if (this.w.charAt(0) == '#') {
                        ff2.c(String.valueOf(this.w) + " ");
                    } else if (!this.z() && this.w.length() > 3) {
                        ff2.c("@" + this.w + " ");
                    }
                }
                this.B = 0L;
                ag.b().a(he2);
                break;
            }
            case 1070008: {
                this.w();
                break;
            }
            case 1070009: {
                this.q = true;
                if (this.b == null) break;
                ((fc)this.b).d(this);
                break;
            }
            case 1070010: {
                this.C();
                break;
            }
            case 1070011: {
                n2 = this.l.q();
                if (n2 >= 0) break;
                n2 = Math.abs(n2);
                n2 &= 0xFF;
                object2 = this.l.r();
                if (!((br)object2).b().equals("Nhật ký")) break;
                long l = 0L;
                object3 = this.C[n2][1];
                object4 = this;
                ((on)object4).a((String)object3, l, true);
                this.t();
                return;
            }
            case 1070013: {
                this.A();
                break;
            }
            case 1070014: {
                ah ah2 = ag.b();
                on on2 = this;
                he he3 = com.mg.sq.a.a("Nhập nick bạn muốn xem Me", null, "Xong", -4, "Hủy", -3);
                he3.a(on2);
                ah2.a(he3);
                break;
            }
            case 1070015: {
                du.a().e(this.w);
                this.z = 0;
                break;
            }
            case 1070016: {
                du.a().d(this.w);
                this.z = 1;
                break;
            }
            case 1070017: {
                du.a().e(this.w);
                this.z = 0;
                break;
            }
            case 1070018: {
                du.a().d(this.w);
                this.z = 1;
                break;
            }
            case 1070019: {
                boolean bl;
                oi oi2 = com.mg.sq.a.m;
                if (oi2.s != null) {
                    int n5 = 0;
                    while (n5 < oi2.s.length) {
                        if (oi2.t[n5].equals(((br)object).b())) {
                            long l = 0L;
                            object3 = oi2.s[n5];
                            object4 = this;
                            ((on)object4).a((String)object3, l, true);
                        }
                        ++n5;
                    }
                }
                if (com.mg.sq.a.m == null) break;
                int n6 = n3;
                if (n6 == 99031) {
                    if (com.mg.sq.a.m != null) {
                        com.mg.sq.a.m.g(true);
                    }
                    bl = true;
                } else if (n6 == 99009) {
                    if (com.mg.sq.a.m != null) {
                        com.mg.sq.a.m.h(true);
                    }
                    bl = true;
                } else if (n6 == 99017) {
                    if (com.mg.sq.a.m != null) {
                        com.mg.sq.a.m.E();
                    }
                    bl = true;
                } else if (n6 == 99012) {
                    MGMIDlet.d();
                    MGMIDlet.b("1900588883");
                    bl = true;
                } else if (n6 == 99011) {
                    com.mg.sq.a.F();
                    bl = true;
                } else if (n6 == 99008) {
                    if (com.mg.sq.a.m != null) {
                        com.mg.sq.a.m.F();
                    }
                    bl = true;
                } else if (n6 == 99007) {
                    com.mg.sq.a.D();
                    bl = true;
                } else {
                    bl = false;
                }
                if (bl) break;
                com.mg.sq.a.m.b(((br)object).b());
                break;
            }
            case 11399: {
                if (com.mg.sq.a.m == null) break;
                com.mg.sq.a.m.b(((br)object).b());
                break;
            }
            default: {
                if (com.mg.sq.a.m == null) break;
                com.mg.sq.a.m.j(n3);
            }
        }
        this.t();
    }

    private void C() {
        if (this.z()) {
            Object object = (dp)this.r.i(this.r.a() - 1);
            object = (long[])((dp)object).b;
            long l = 0L;
            Object object2 = object[0];
            object = this;
            ((on)object).a((long)object2, 0L, true);
            return;
        }
        long l = 0L;
        String string = this.w;
        on on2 = this;
        on2.a(string, l, true);
    }

    public final aq a(aw object, int n2) {
        if ((object = ((aw)object).i(n2)) instanceof dp) {
            object = new fm(((dp)object).a, -10);
            ((aq)object).a(0, 0, this.e() - 2, 20);
            return object;
        }
        return new fp((dl)object, this.r.e(), (n2 & 1) == 1);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void b(aq var1_1, int var2_2) {
        block34: {
            block38: {
                block37: {
                    block35: {
                        block36: {
                            if (this.r.a() <= 0) break block34;
                            if (var2_2 != this.r.a() - 1) break block35;
                            this.L = false;
                            if (!this.z()) break block36;
                            var1_1 = this;
                            if (var1_1.r.a() > 0) {
                                var2_3 = (dp)var1_1.r.i(var1_1.r.a() - 1);
                                var3_6 = (long[])var2_3.b;
                                super.a(var3_6[0], var3_6[1], false);
                                return;
                            }
                            break block34;
                        }
                        var1_1 = this;
                        var2_4 = (dp)var1_1.r.i(var1_1.r.a() - 1);
                        var3_7 = (long[])var2_4.b;
                        super.a(var1_1.w, var3_7[1], false);
                        return;
                    }
                    if (var2_2 == 0) {
                        this.L = true;
                        this.C();
                        return;
                    }
                    var1_1 = this;
                    var3_8 = (dl)var1_1.r.i(var2_2);
                    var4_10 = var3_8.a();
                    var5_16 = var3_8;
                    var5_17 = dl.b(var5_16.h);
                    var6_20 = new bs();
                    var6_20.a(new gb(0, 2));
                    var6_20.b(new gb(1, 3));
                    if (var3_8.h < 0) break block37;
                    var7_21 /* !! */  = new String[]{"Chép nội dung"};
                    var8_22 /* !! */  = new int[]{1070006};
                    var9_23 = var4_10.a(var5_17);
                    var10_25 = null;
                    var11_28 /* !! */  = null;
                    switch (var9_23.c()) {
                        case 5: {
                            var10_25 = new String[]{"Xem Bang"};
                            var11_28 /* !! */  = new int[]{1070000};
                            break;
                        }
                        case 4: {
                            var9_23 = var4_10.b(var9_23.b(), var5_17);
                            if (var9_23 == null || var9_23.length() <= 0) {
                                var9_23 = var3_8.c;
                            }
                            if (var9_23.charAt(0) == '@') {
                                if (!(var9_23 = var9_23.substring(1)).equals(go.e)) {
                                    var10_25 = new String[]{"Chat!", "Xem ME"};
                                    var11_28 /* !! */  = new int[]{1070001, 1070002};
                                    break;
                                }
                                var10_25 = new String[]{"Xem ME"};
                                var11_28 /* !! */  = new int[]{1070002};
                                break;
                            }
                            if (!var9_23.equals(go.e)) {
                                var10_25 = new String[]{"Chat!", "Xem ME"};
                                var11_28 /* !! */  = new int[]{1070001, 1070002};
                                break;
                            }
                            var10_25 = new String[]{"Xem ME"};
                            var11_28 /* !! */  = new int[]{1070002};
                            break;
                        }
                        case 3: {
                            var10_25 = new String[]{"Xem tin", "Chép link"};
                            var11_28 /* !! */  = new int[]{1070004, 1070003};
                            break;
                        }
                        case 1: {
                            var12_29 = lo.a(((lo)var9_23).i);
                            if (var12_29 == null) break;
                            var10_25 = new String[]{var12_29, "Gửi tiếp"};
                            var11_28 /* !! */  = new int[]{1070020, 1070005};
                        }
                    }
                    if (var10_25 != null && var10_25.length > 0) {
                        var9_23 = new String[1 + var10_25.length];
                        var12_29 = new int[1 + var11_28 /* !! */ .length];
                        System.arraycopy(var10_25, 0, var9_23, 0, var10_25.length);
                        System.arraycopy(var11_28 /* !! */ , 0, var12_29, 0, var11_28 /* !! */ .length);
                        var13_31 = var10_25.length;
                        while (var13_31 < ((Object)var9_23).length) {
                            var9_23[var13_31] = var7_21 /* !! */ [var13_31 - var10_25.length];
                            var12_29[var13_31] = var8_22 /* !! */ [var13_31 - var11_28 /* !! */ .length];
                            ++var13_31;
                        }
                        var7_21 /* !! */  = var9_23;
                        var8_22 /* !! */  = (int[])var12_29;
                    }
                    break block38;
                }
                var3_9 = var2_2;
                var2_5 = var3_8;
                var4_11 = var2_5.h + 6;
                switch (var4_11) {
                    case 0: {
                        var4_12 = var2_5.d;
                        if (var4_12 != null && var4_12.i != null) {
                            if (var4_12.j == -10) {
                                if (com.mg.sq.a.m != null) {
                                    var5_18 = com.mg.sq.a.m;
                                    var1_1 = var4_12;
                                    var5_18.q.a(var1_1.i.a());
                                }
                            } else {
                                com.mg.sq.a.s().C();
                            }
                        }
                        v0 = true;
                        break;
                    }
                    case 1: {
    if (var2_5.m.length > 0) {
        super.e(true);
        v0 = false;
    } else {
        super.e(false);
    }
    break;
}
                    case 5: {
                        var4_13 = var1_1;
                        if (var4_13.D >= 2) {
                            super.B();
                        } else {
                            var1_1 = ag.b().a("Thông tin", "Bạn muốn xóa nội dung ME này?", "Có", -7, "Không", -8, 1);
                            var1_1.a((bf)var4_13);
                            ag.b().a((al)var1_1, false);
                        }
                        v0 = true;
                        break;
                    }
                   case 2: {
    var1_1.E = var2_5.e;
    long var26_32 = 0L;
    int var24_33 = var2_5.e;
    var5_19 = var1_1;
    super.a(var24_33, 0L, true);
    v0 = true;
    break;
}
case 3: {
    var4_14 = var2_5;
    var2_5.h = -2;
    --var4_14.j;
    var4_14.i = 0;
    var1_1.r.b(var2_5, var3_9);
    du.a().a(var2_5.e, (short)0);
    v0 = true;
    break;
}
case 4: {
    var4_15 = var2_5;
    var2_5.h = -3;
    ++var4_15.j;
    var4_15.i = 1;
    var1_1.r.b(var2_5, var3_9);
    du.a().a(var2_5.e, (short)1);
    v0 = true;
    break;
}
default: {
    v0 = true;
    break;
}
                }
                return;
            }
            var9_23 = new br[var7_21 /* !! */ .length];
            var10_26 = 0;
            while (var10_26 < ((Object)var9_23).length) {
                var9_23[var10_26] = new br(var7_21 /* !! */ [var10_26], var8_22 /* !! */ [var10_26]);
                ++var10_26;
            }
            var6_20.a((br[])var9_23);
            var10_27 = var1_1.s.r();
            var11_28 /* !! */  = (int[])var1_1.r.o(var2_2);
            var9_24 = var1_1.r.c() + (var1_1.r.e() - var6_20.e()) / 2;
            var12_30 = var1_1.r.d() + var11_28 /* !! */ .d() - var10_27.b;
            if (var3_8.h >= 0) {
                var12_30 += var4_10.f() + var4_10.a(var5_17).e();
            }
            if (var12_30 + var6_20.f() > var1_1.r.d() + var1_1.r.f()) {
                var12_30 = var1_1.r.d() + var1_1.r.f() - var6_20.f();
            } else if (var12_30 < var1_1.r.d()) {
                var12_30 = var1_1.r.d();
            }
            var6_20.a_(v.t, var12_30);
            var6_20.d(var9_24, var12_30);
            var6_20.a((bg)var1_1);
            var6_20.a_(1);
            var1_1.a(var6_20);
        }
    }
}
