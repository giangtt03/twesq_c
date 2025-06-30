package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.smsgame.MGMIDlet;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import com.mg.bas.hp;

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
        this.a(0, 0, com.mg.bas.v.t, com.mg.bas.v.u);
        this.v = bx.a("Ola Me - Loan tin tức thời. Bạn có thể lắng nghe và chia sẻ tâm sự với những người được quan tâm. Phiên bản web tại http://me.ola.vn ", com.mg.bas.v.t, bx.d);
        this.u = new ex("Xem ME", -2);
        this.u.a((com.mg.bas.v.t - 100) / 2, 10 + bx.d.a() + 10 + 10 + bx.d.a() * this.v.length, 100, 20);
        this.a();
        this.a(new ba());
        this.j(0);
        this.C = pd.E();
        this.p = new a();
        this.a(new gb(-1, 0));
        this.c(com.mg.sq.a.n);
        this.b(new gb(-2, 1));
        this.a((aq)this);
    }

    private void a() {
        this.r = new aw();
        this.r.a((bn)this);
        this.r.a((bq)this);
        this.r.h(5);
        this.s = new ay(0);
        this.s.a(1, 0, com.mg.bas.v.t - 2, com.mg.bas.v.u - ba.a);
        this.s.b(this.r);
    }

    private he a(String str) {
        he dialog = com.mg.sq.a.a(str, null, "Xong", -5, "Hủy", -3, -9, this);
        ((am)dialog).b(-989858);
        this.N = (fu)dialog.e(4);
        return dialog;
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
        if (!this.z()) {
            this.F = this.r;
            this.G = this.s;
            this.K = this.z;
            this.I = this.w;
            this.J = this.x;
            this.H = this.p;
            // super.a(); // 
        }
        if (this.w == null || !this.w.equals("Bình luận") || this.A) {
            this.p = new a();
            if (efArray == null) {
                efArray = new ef[]{ef2};
            } else {
                ef[] efArray2 = new ef[efArray.length + 1];
                System.arraycopy(efArray, 0, efArray2, 1, efArray.length);
                efArray2[0] = ef2;
                efArray = efArray2;
            }
        }
        this.a("Bình luận", (short)3, efArray, true);
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

    private void a(String title, short s, ef[] efArray, boolean bl) {
        com.mg.sq.a.s().v();
        if (efArray == null || efArray.length == 0) {
            return;
        }
        if (!bl) {
            this.v();
        }
        dl[] object2 = new dl[efArray.length];
        for (int n2 = 0; n2 < object2.length; n2++) {
            object2[n2] = new dl(efArray[n2], this.r.e() - 4);
            object2[n2].a(efArray[n2].d());
        }
        short s2 = s;
        String string = title;
        try {
            int n2 = this.r.s();
            this.z = s2;
            try {
                if ((this.w == null && string != null) || (this.w != null && string == null) || (this.w != null && !this.w.equals(string)) || this.A) {
                    this.r.q();
                    this.p.a();
                    if (com.mg.sq.a.m != null) {
                        com.mg.sq.a.m.q.a();
                    }
                    n2 = 1;
                    this.A = false;
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            this.w = string;
            if (this.w == null) {
                this.x = "Trang chủ";
            } else {
                this.x = string;
                oi oi2 = com.mg.sq.a.m;
                if (oi2 != null && oi2.s != null) {
                    int n3 = 0;
                    while (n3 < oi2.s.length) {
                        if (oi2.s[n3].equals(string)) {
                            this.x = oi2.t[n3];
                            break;
                        }
                        ++n3;
                    }
                }
            }
            if (this.x != null) {
                bx.d.c(true);
                this.y = bx.d.a(this.x) + 6;
                bx.d.c();
            }
            boolean bl2 = this.z();
            if (this.r.a() > 0) {
                if (this.L) {
                    if (bl2) {
                        this.r.a(object2, 2);
                    } else {
                        this.r.a(object2, 1);
                    }
                } else {
                    this.r.a(object2, this.r.a() - 1);
                }
            } else {
                if (bl2) {
                    object2[0].n = true;
                }
                this.r.a(new dp("Xem mới nhất", null));
                this.r.a(object2);
                this.r.a(new dp("Xem thêm", null));
            }
            int n3 = 0;
            while (n3 < object2.length) {
                if (bl2 && this.E >= 0L && object2[n3].e == this.E && !object2[n3].n) {
                    object2[n3].o = true;
                }
                a a2 = this.p;
                Object object3 = object2[n3];
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
            dp dp2 = (dp)this.r.i(this.r.a() - 1);
            dl dl2 = (dl)this.r.i(1);
            dl dl3 = (dl)this.r.i(this.r.a() - 2);
            dp2.b = new long[]{dl3.e, dl3.e};
            dp2 = (dp)this.r.i(0);
            if (bl2 && this.r.a() >= 4) {
                dl2 = (dl)this.r.i(2);
            }
            dp2.b = new long[]{dl2.e, -dl2.e};
            if (n2 > 1) {
                --n2;
            }
            this.r.k(n2);
            this.j(4);
            if (!bl2) {
                this.C = pd.a(this.C, this.x, string);
                return;
            }
        } catch (Exception exception) {
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
        graphics.setColor(com.mg.bas.v.am);
        graphics.fillRect(0, 0, com.mg.bas.v.t, com.mg.bas.v.u - ba.a);
    }

    public final void a(Graphics graphics, int n2, int n3) {
        if (this.t == 0) {
            if (this.c) {
                on.a(graphics);
                bx.d.c(true);
                bx.d.a(graphics, "Giới thiệu", com.mg.bas.v.t >>> 1, 10, 1);
                bx.d.c();
                n2 = 10 + (10 + bx.d.a());
                bx.a(graphics, bx.d, this.v, 0, n2, com.mg.bas.v.t, com.mg.bas.v.u, 1);
                this.u.a(graphics, this.c(), this.d());
                this.c(false);
                return;
            }
        } else if (this.s.k()) {
            on.a(graphics);
            this.s.a(graphics, this.c(), this.d());
            if (this.x != null) {
                n2 = com.mg.bas.v.t - this.y;
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
                                br[] brArray3 = new br[on2.C.length];
                                n5 = 0;
                                while (n5 < brArray3.length) {
                                    brArray3[n5] = new br(on2.C[n5][0], 1070011);
                                    ++n5;
                                }
                                ((br)objectArray[2]).a(brArray3);
                                System.arraycopy(objectArray2, 2, objectArray, 3, 2);
                                objectArray2 = objectArray;
                            }
                            objectArray = new String[2 + (oi2.s != null ? oi2.s.length : 0)];
                            int[] intArray = new int[objectArray.length];
                            objectArray[0] = "Trang chủ";
                            intArray[0] = 1070013;
                            objectArray[objectArray.length - 1] = "Trang khác";
                            intArray[intArray.length - 1] = 1070014;
                            if (oi2.s != null) {
                                n5 = 0;
                                int n6 = 1;
                                while (n6 < objectArray.length - 1) {
                                    objectArray[n6] = oi2.t[n5++];
                                    intArray[n6] = 1070019;
                                    ++n6;
                                }
                            }
                            String[] stringArray = new String[objectArray.length - 1];
                            int[] nArray = new int[intArray.length - 1];
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
                                System.arraycopy(intArray, 0, nArray, 0, n7);
                                System.arraycopy(intArray, n7 + 1, nArray, n7, nArray.length - n7);
                                objectArray = stringArray;
                                intArray = nArray;
                            }
                            br[] brArray = new br[objectArray.length];
                            n4 = 0;
                            while (n4 < brArray.length) {
                                brArray[n4] = new br((String)objectArray[n4], intArray[n4]);
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
                    bs2.a_(-n11, com.mg.bas.v.u);
                    bs2.d(0, com.mg.bas.v.u - ba.a - bs2.f());
                    bs2.a((bf)on2);
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
                if (!com.mg.bas.i.b((String)object)) {
                    long l = 0L;
                    String string = (String)object;
                    object = this;
                    ((on)object).a(string, l, true);
                }
                com.mg.sq.a.s().a(241220, false);
                return;
            }
            case -5: {
                Object object = com.mg.sq.a.k(-989858);
                n3 = this.N.r() + 1;
                if (!com.mg.bas.i.b((String)object)) {
                    short s = (short)n3;
                    String string = (String)object;
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
                hp hp2 = new hp((byte)2);
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
        if (this.t != 0 && this.r.a() > 0 && (this.w == null || com.mg.bas.i.a(this.w, go.e) || l > 0L && this.w.equals("Bình luận"))) {
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

    private void e(boolean replyAll) {
        Object object;
        dl dl2 = (dl)this.r.t();
        he he2 = this.a("Trả lời");
        String string = "@" + dl2.c + " ";
        int n3 = string.length() - 1;
        if (replyAll) {
            for (int i = 0; i < dl2.m.length; i++) {
                object = dl2.a.a(dl2.m[i]);
                string = String.valueOf(string) + dl2.a.b(((n)object).b(), dl2.m[i]) + " ";
            }
        }
        if (this.w != null && this.w.charAt(0) == '#') {
            string = String.valueOf(string) + this.w + " ";
        }
        int n2 = string.length() - n3;
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
                if (!com.mg.bas.i.b(this.w)) {
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
                he he3 = com.mg.sq.a.a("Nhập nick bạn muốn xem Me", null, "Xong", -4, "Hủy", -3, (bf)this);
                he3.a((bf)on2);
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
            dp dpObj = (dp)this.r.i(this.r.a() - 1);
            long[] arr = (long[])dpObj.b;
            long l = arr[0];
            this.a(l, 0L, true);
            return;
        }
        long l = 0L;
        String string = this.w;
        on on2 = this;
        on2.a(string, l, true);
    }

    public final aq a(final aw aw, final int n) {
        final Object i;
        if ((i = aw.i(n)) instanceof dp) {
            final fm fm;
            (fm = new fm(((dp)i).a, -10)).a(0, 0, this.e() - 2, 20);
            return fm;
        }
        return new fp((dl)i, this.r.e(), (n & 0x1) == 0x1);
    }
    
    public final void b(final aq aq, int n) {
        if (this.r.a() > 0) {
            if (n == this.r.a() - 1) {
                this.L = false;
                if (!this.z()) {
                    this.a(this.w, ((long[])((dp)this.r.i(this.r.a() - 1)).b)[1], false);
                    return;
                }
                if (this.r.a() > 0) {
                    final long[] array = (long[])((dp)this.r.i(this.r.a() - 1)).b;
                    this.a(array[0], array[1], false);
                }
            }
            else {
                if (n == 0) {
                    this.L = true;
                    this.C();
                    return;
                }
                n = n;
                final dl dl;
                final ls a = (dl = (dl)this.r.i(n)).a();
                final int b = dl.b(dl.h);
                final bs bs;
                (bs = new bs()).a(new gb(0, 2));
                bs.b(new gb(1, 3));
                if (dl.h < 0) {
                    final dl dl2 = dl;
                    final int n2 = n;
                    final dl dl3 = dl2;
                    switch (dl3.h + 6) {
                        case 0: {
                            final lo d;
                            if ((d = dl3.d) != null && d.i != null) {
                                if (d.j == -10) {
                                    if (com.mg.sq.a.m != null) {
                                        com.mg.sq.a.m.q.a(d.i.a());
                                    }
                                }
                                else {
                                    com.mg.sq.a.s().C();
                                }
                            }
                            break;
                        }
                        case 1: {
                            if (dl3.m.length > 0) {
                                this.e(true);
                                break;
                            }
                            this.e(false);
                            break;
                        }
                        case 5: {
                            if (this.D >= 2) {
                                this.B();
                            }
                            else {
                                final al a2;
                                (a2 = ag.b().a("Thông tin", "Bạn muốn xóa nội dung ME này?", "Có", -7, "Không", -8, 1)).a(this);
                                ag.b().a(a2, false);
                            }
                            break;
                        }
                        case 2: {
                            this.E = dl3.e;
                            this.a(dl3.e, 0L, true);
                            break;
                        }
                        case 3: {
                            final dl dl4;
                            (dl4 = dl3).h = -2;
                            final dl dl5 = dl4;
                            --dl5.j;
//                            dl4.i = 0;
                            this.r.b(dl3, n2);
                            du.a().a(dl3.e, (short)0);
                            break;
                        }
                        case 4: {
                            final dl dl6;
                            (dl6 = dl3).h = -3;
                            final dl dl7 = dl6;
                            ++dl7.j;
//                            dl6.i = 1;
                            this.r.b(dl3, n2);
                            du.a().a(dl3.e, (short)1);
                            break;
                        }
                    }
                    return;
                }
                String[] array2 = { "Chép nội dung" };
                int[] array3 = { 1070006 };
                final n a3 = a.a(b);
                String[] o = null;
                int[] o2 = null;
                switch (a3.c()) {
                    case 5: {
                        o = new String[] { "Xem Bang" };
                        o2 = new int[] { 1070000 };
                        break;
                    }
                    case 4: {
                        String s;
                        if ((s = a.b(a3.b(), b)) == null || s.length() <= 0) {
                            s = dl.c;
                        }
                        if (s.charAt(0) == '@') {
                            if (!s.substring(1).equals(go.e)) {
                                o = new String[] { "Chat!", "Xem ME" };
                                o2 = new int[] { 1070001, 1070002 };
                                break;
                            }
                            o = new String[] { "Xem ME" };
                            o2 = new int[] { 1070002 };
                            break;
                        } else {
                            if (!s.equals(go.e)) {
                                o = new String[] { "Chat!", "Xem ME" };
                                o2 = new int[] { 1070001, 1070002 };
                                break;
                            }
                            o = new String[] { "Xem ME" };
                            o2 = new int[] { 1070002 };
                            break;
                        }
                    }
                    case 3: {
                        o = new String[] { "Xem tin", "Chép link" };
                        o2 = new int[] { 1070004, 1070003 };
                        break;
                    }
                    case 1: {
                        final String a4;
                        if ((a4 = lo.a(((lo)a3).i)) != null) {
                            o = new String[] { a4, "Gửi tiếp" };
                            o2 = new int[] { 1070020, 1070005 };
                            break;
                        }
                        break;
                    }
                }
                if (o != null && o.length > 0) {
                    final String[] array4 = new String[1 + o.length];
                    final int[] array5 = new int[1 + o2.length];
                    System.arraycopy(o, 0, array4, 0, o.length);
                    System.arraycopy(o2, 0, array5, 0, o2.length);
                    for (int i = o.length; i < array4.length; ++i) {
                        array4[i] = array2[i - o.length];
                        array5[i] = array3[i - o2.length];
                    }
                    array2 = array4;
                    array3 = array5;
                }
                final br[] array6 = new br[array2.length];
                for (int j = 0; j < array6.length; ++j) {
                    array6[j] = new br(array2[j], array3[j]);
                }
                bs.a(array6);
                final k r = this.s.r();
                final aq o3 = this.r.o(n);
                final int n3 = this.r.c() + (this.r.e() - bs.e()) / 2;
                int d2 = this.r.d() + o3.d() - r.b;
                if (dl.h >= 0) {
                    d2 += a.f() + a.a(b).e();
                }
                if (d2 + bs.f() > this.r.d() + this.r.f()) {
                    d2 = this.r.d() + this.r.f() - bs.f();
                }
                else if (d2 < this.r.d()) {
                    d2 = this.r.d();
                }
                bs.a_(com.mg.bas.v.t, d2);
                bs.d(n3, d2);
                bs.a((bg)this);
                bs.a_(1);
                this.a(bs);
            }
        }
    }
}
