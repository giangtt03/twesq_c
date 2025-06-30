package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

import com.mg.bas.hp;
import com.mg.bas.f;



public final class ot
extends fb
implements bf,
bg,
bn,
bq {
    private static final String[] q = new String[]{"rss://faq/sq", "rss://ola/0/2011/12/napken", "rss://gdken", "rss://session"};
    private static final String[] r = new String[]{"Thông tin", "Hướng dẫn nạp KEN", "Lịch sử giao dịch KEN", "Các phiên đăng nhập hiện tại"};
    private aw s;
    private ay t;
    private int u = 0;
    private Object[] v;
    private Object[] w;
    private Object[] x;
    private final a y;
    private int z;
    private String A;
    public boolean p = false;
    private fu B;
    private Object C;

    public ot(int n, int n2, String string) {
        super(109, 7, string, false);
        this.a(0, 0, com.mg.bas.v.t, com.mg.bas.v.u);
        this.a(new ba());
        this.a(new gb(-1, 0));
        this.c(com.mg.sq.a.n);
        this.b(new gb(-2, 1));
        this.a((aq)this);
        this.s = new aw();
        this.s.a((bn)this);
        this.s.a((bq)this);
        this.s.f(true);
        this.t = new ay(0);
        this.t.a(0, 0, com.mg.bas.v.t, com.mg.bas.v.u - ba.a);
        this.t.b(this.s);
        this.y = new a();
        this.z = 0;
    }

    private void j(int n) {
        this.u = n;
        this.c(true);
    }

    public final void c(boolean bl) {
        super.c(bl);
        if (bl) {
            this.t.c(true);
        }
    }

    public final boolean f(int n) {
        if (n == 135) {
            this.F();
            return true;
        }
        if (n == 142) {
            this.E();
            return true;
        }
        if (n == 148) {
            this.D();
            return true;
        }
        return this.t.f(n);
    }

    public final boolean c(int n, int n2) {
        return this.t.c(n, n2);
    }

    public final boolean e(int n, int n2) {
        return this.t.e(n, n2);
    }

    public final boolean f(int n, int n2) {
        return this.t.f(n, n2);
    }

    public final void n() {
        this.t.n();
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (this.t.k()) {
            Graphics graphics2 = graphics;
            graphics2.setColor(com.mg.bas.v.am);
            graphics2.fillRect(0, 0, com.mg.bas.v.t, com.mg.bas.v.u - ba.a);
            graphics2.drawImage(pc.d, com.mg.bas.v.t, com.mg.bas.v.u - ba.a, 40);
            this.t.a(graphics, this.c(), this.d());
        }
    }

    public final void u() {
        this.a(".");
    }

    public final void x() {
        this.p = false;
        this.c(true);
    }

    public final aq a(aw awObj, int n) {
        Object item = awObj.i(n);
        if (item instanceof dn) {
            return new fs((dn)item, (n - 1 & 1) == 1, this.s.e());
        }
        return new et((dq)item, this.s.e());
    }

    private void v() {
        if (this.y.d() <= 0 || this.z < 0 || this.z >= this.y.d()) {
            return;
        }
        String string = (String)this.y.b(this.z);
        if (string.charAt(0) == '' && Integer.parseInt(String.valueOf(string.charAt(1))) == this.u) {
            this.y.a(this.B(), this.z);
        }
    }

    private void b(String string) {
        this.c(true);
        if (string.charAt(0) == '') {
            int n = Integer.parseInt(String.valueOf(string.charAt(1)));
            int n2 = string.indexOf(26, 1) + 1;
            int n3 = string.indexOf(26, n2);
            this.A = string.substring(n2, n3);
            n2 = n3 + 1;
            n3 = string.indexOf(26, n2);
            n2 = Integer.parseInt(string.substring(n2, n3));
            int n4 = Integer.parseInt(string.substring(n3 + 1));
            if (n == 1 && this.v != null) {
                this.C();
                this.s.k(n2);
                this.t.k(n4);
                return;
            }
            if (n == 2 && this.w != null) {
                this.z();
                this.s.k(n2);
                this.t.k(n4);
                return;
            }
            if (n == 3 && this.x != null) {
                this.A();
                this.s.k(n2);
                this.t.k(n4);
                return;
            }
            this.y.a();
            this.z = 0;
            this.A = null;
            if (this.w != null) {
                this.z();
                return;
            }
            this.a((String)null);
            return;
        }
        this.a(string);
    }

    public final void a(String string, String[] stringArray, String[] stringArray2) {
        this.v();
        try {
            this.w = new Object[stringArray.length + 2];
            this.w[0] = new dn("Các danh mục", 0, this.s.e());
            int n = 1;
            int n2 = this.w.length - 1;
            while (n < n2) {
                int n3 = n - 1;
                String string2 = n < 10 ? "  " + n : String.valueOf(n);
                this.w[n] = new dn(String.valueOf(string2) + ". " + stringArray[n3], stringArray2[n3], this.s.e() - 2);
                ++n;
            }
            this.w[this.w.length - 1] = com.mg.sq.a.m.K();
            this.z();
            this.A = string;
            this.c(this.B());
        }
        catch (OutOfMemoryError outOfMemoryError) {
            this.w();
        }
        catch (Throwable throwable) {
            Throwable throwable2 = throwable;
            ct.b(throwable.toString());
        }
        this.t();
        com.mg.sq.a.s().v();
    }

    private void w() {
        al al2 = ag.b().a("Chú ý", "Máy bạn không đủ bộ nhớ để xem trang báo này!", "Đóng", 5, 1);
        al2.a(this);
        ag.b().a(al2, false);
    }

    private void z() {
        this.s.q();
        this.s.h(0);
        this.s.a(this.w);
        if (this.s.a() > 1) {
            this.s.k(1);
        } else {
            this.s.k(0);
        }
        this.j(2);
    }

    public final void b(String string, String[] stringArray, String[] stringArray2) {
        this.v();
        try {
            this.x = new Object[stringArray.length + 2];
            this.x[0] = new dn("Các tin mới", 0, this.s.e());
            int n = 1;
            int n2 = this.x.length - 1;
            while (n < n2) {
                int n3 = n - 1;
                String string2 = n < 10 ? "  " + n : String.valueOf(n);
                this.x[n] = new dn(String.valueOf(string2) + ". " + stringArray[n3], stringArray2[n3], this.s.e() - 2);
                ++n;
            }
            this.x[this.x.length - 1] = com.mg.sq.a.m.K();
            this.A();
            this.A = string;
            this.c(this.B());
        }
        catch (OutOfMemoryError outOfMemoryError) {
            this.w();
        }
        catch (Throwable throwable) {
            Throwable throwable2 = throwable;
            ct.b(throwable.toString());
        }
        this.t();
        com.mg.sq.a.s().v();
    }

    private void A() {
        this.s.q();
        this.s.h(0);
        this.s.a(this.x);
        if (this.s.a() > 1) {
            this.s.k(1);
        } else {
            this.s.k(0);
        }
        this.j(3);
    }

    public static void a() {
        ct.a("Receive pulishers list");
    }

    private String B() {
        int n = this.s.s();
        String string = String.valueOf(n);
        return "" + this.u + '' + this.A + '' + string + '' + this.t.r().b;
    }

    private void C() {
        this.s.q();
        this.s.h(0);
        this.s.a(this.v);
        if (this.s.a() > 1) {
            this.s.k(1);
        } else {
            this.s.k(0);
        }
        this.j(1);
    }

    public final void a(String string, ef[] object) {
        this.v();
        try {
            Object[] objectArray = new Object[((ef[])object).length + 1];
            Object[] objectArray2 = objectArray;
            objectArray[0] = new dn(((ef)object[0]).c(), 0, this.s.e());
            int n = 1;
            int n2 = 1;
            int n3 = objectArray2.length - 1;
            while (n2 < n3) {
                int n4 = n2;
                ef efObj = (ef)object[n4];
                if (!com.mg.bas.i.b(efObj.c())) {
                    objectArray2[n] = new dn(efObj.c(), 2, this.s.e() - 2);
                    ++n;
                }
                ++n2;
            }
            objectArray2[n] = com.mg.sq.a.m.K();
            if (++n < objectArray2.length) {
                Object[] objectArray3 = new Object[n];
                System.arraycopy(objectArray2, 0, objectArray3, 0, n);
                objectArray2 = objectArray3;
            }
            this.s.q();
            this.s.h(10);
            this.s.a(objectArray2);
            if (this.s.a() > 1) {
                this.s.k(1);
            } else {
                this.s.k(0);
            }
            this.j(4);
            this.A = string;
            this.c(string);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            this.w();
        }
        catch (Throwable throwable) {
            Throwable throwable2 = throwable;
            ct.b(throwable.toString());
        }
        this.t();
        com.mg.sq.a.s().v();
    }

    private void c(String string) {
        if (this.z < this.y.d() - 1 || this.y.d() > 5) {
            while (this.y.d() - 1 > this.z) {
                this.y.a(this.y.d() - 1);
            }
            while (this.y.d() > 5) {
                this.y.a(0);
            }
        }
        if (this.z >= this.y.d()) {
            this.z = this.y.d() - 1;
        }
        if (this.z < 0) {
            this.z = 0;
        }
        if (string != null) {
            String string2;
            if (this.y.d() > 0 && (string2 = (String)this.y.b(this.z)).equals(string)) {
                return;
            }
            this.y.a(string);
        }
        this.z = this.y.d() - 1;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
public final void b(aq object, int n2) {
    int var2_6 = n2;
    if (var2_6 <= 0) {
        return;
    }
    Object object2 = this.s.i(var2_6);
    if (object2 instanceof dq) {
        dq dq2 = (dq) object2;
        ot ot2 = this;
        this.C = dq2;
        br[] brArray = oi.a(dq2.c);
        bs bs2 = new bs();
        bs2.a(new gb(0, 2));
        bs2.b(new gb(1, 3));
        bs2.a(brArray);
        int n4 = ot2.s.s();
        aq aq2 = ot2.s.o(n4);
        k k2 = ot2.t.r();
        int n5 = (com.mg.bas.v.t - bs2.e()) / 2;
        int n6 = ot2.t.d() + aq2.d() - k2.b;
        int n7 = 0;
        if (n6 + bs2.f() > com.mg.bas.v.u - ba.a) {
            n7 = com.mg.bas.v.u - ba.a - bs2.f();
        } else if (n6 < 0) {
        } else {
            n7 = n6;
        }
        bs2.a_(com.mg.bas.v.t + bs2.e(), n7);
        bs2.d(n5, n7);
        bs2.a((bf)ot2);
        bs2.a(new gb(0, 2));
        bs2.b(new gb(1, 3));
        bs2.c(com.mg.sq.a.n);
        bs2.a_(1);
        ot2.a(bs2);
        return;
 }
        dn dn2 = (dn)object2;
        if (this.u != 4) {
            if (var2_6 <= 0) return;
            this.a(dn2.a);
            return;
        }
        Object object3 = dn2;
        ot ot3 = this;
        this.C = object3;
        String[] stringArray = new String[]{"Chép nội dung"};
        int[] nArray = new int[]{10901};
        if (((dn)object3).d >= 0) {
            n n8 = ((dn)object3).c.a(((dn)object3).d);
            String[] stringArray2 = null;
            int[] nArray2 = null;
            switch (n8.c()) {
                case 5: {
                    stringArray2 = new String[]{"Xem Bang"};
                    nArray2 = new int[]{10902};
                    break;
                }
                case 4: {
                    object3 = ((dn)object3).c.b(n8.b(), ((dn)object3).d);
                    if (com.mg.bas.i.b((String)object3)) return;
                    if (((String)object3).charAt(0) == '@') {
                        object3 = ((String)object3).substring(1);
                    }
                    if (!((String)object3).equals(go.e)) {
                        stringArray2 = new String[]{"Chat!", "Xem ME"};
                        nArray2 = new int[]{10903, 10913};
                        break;
                    }
                    stringArray2 = new String[]{"Xem ME"};
                    nArray2 = new int[]{10913};
                    break;
                }
                case 3: {
                    stringArray2 = new String[]{"Xem tin", "Chép link"};
                    nArray2 = new int[]{10905, 10904};
                    break;
                }
                case 1: {
                    String string = lo.a(((lo)n8).i);
                    if (string == null) break;
                    stringArray2 = new String[]{string, "Gửi tiếp"};
                    nArray2 = new int[]{10914, 10906};
                }
            }
            if (stringArray2 != null && stringArray2.length > 0) {
                String[] newStringArray = new String[1 + stringArray2.length];
                int[] nArray3 = new int[1 + nArray2.length];
                System.arraycopy(stringArray2, 0, newStringArray, 0, stringArray2.length);
                System.arraycopy(nArray2, 0, nArray3, 0, nArray2.length);
                int n3 = stringArray2.length;
                while (n3 < newStringArray.length) {
                    newStringArray[n3] = stringArray[n3 - stringArray2.length];
                    nArray3[n3] = nArray[n3 - nArray2.length];
                    ++n3;
                }
                stringArray = newStringArray;
                int[] brArray = new int[]{10903, 10913};
                bs bs3 = new bs();
                bs3.a(new gb(0, 2));
                bs3.b(new gb(1, 3));
//                bs3.a(brArray);
                int n10 = ot3.s.s();
                object3 = ot3.s.o(n10);
                k k3 = ot3.t.r();
                int nCenter = (com.mg.bas.v.t - bs3.e()) / 2;
                int n11 = ot3.t.d() + ((aq)object3).d() - k3.b;
                if (n11 + bs3.f() > com.mg.bas.v.u - ba.a) {
                    n11 = com.mg.bas.v.u - ba.a - bs3.f();
                } else if (n11 < 0) {
                    n11 = 0;
                }
                bs3.a_(com.mg.bas.v.t + bs3.e(), n11);
                bs3.d(nCenter, n11);
                bs3.a((bf)ot3);
                bs3.a(new gb(0, 2));
                bs3.b(new gb(1, 3));
                bs3.c(com.mg.sq.a.n);
                bs3.a_(1);
                ot3.a(bs3);
            }
        }
    }

    public final void a(String string) {
        if (string == null || string.equals(".")) {
            this.v = new Object[5];
            this.v[0] = new dn("Các trang báo", 0, this.s.e());
            int n2 = 1;
            int n3 = this.v.length - 1;
            while (n2 < n3) {
                int n4 = n2 - 1;
                String string2 = n2 < 10 ? "  " + n2 : String.valueOf(n2);
                this.v[n2] = new dn(String.valueOf(string2) + ". " + r[n4], q[n4], this.s.e() - 2);
                ++n2;
            }
            if (com.mg.sq.a.m != null) {
                this.v[this.v.length - 1] = com.mg.sq.a.m.K();
            }
            this.A = ".";
            this.j(1);
            this.C();
            return;
        }
        com.mg.sq.a.s().a((String)null, (il)null, 375);
        du.a().a(string, (short)this.i);
    }

    public final void a(aq aq2, int n2) {
    }

    public final void a(aq aq2, int n2, int n3) {
    }

    public final void d(int n2, int n3) {
        switch (n3) {
            case -1: {
                int[] nArray;
                String[] stringArray;
                ot ot2 = this;
                bs bs2 = new bs();
                bs2.a(new gb(0, 2));
                bs2.b(new gb(1, 3));
                if (ot2.y.d() > 0) {
                    if (ot2.z < ot2.y.d() - 1) {
                        if (ot2.z > 0) {
                            stringArray = new String[]{"Trang trước", "Trang kế", "Trang chủ", "Đóng"};
                            nArray = new int[]{10907, 10909, 10908, 10900};
                        } else {
                            stringArray = new String[]{"Trang kế", "Trang chủ", "Đóng"};
                            nArray = new int[]{10909, 10908, 10900};
                        }
                    } else if (ot2.z > 0) {
                        stringArray = new String[]{"Trang trước", "Trang chủ", "Đóng"};
                        nArray = new int[]{10907, 10908, 10900};
                    } else {
                        stringArray = new String[]{"Trang chủ", "Đóng"};
                        nArray = new int[]{10908, 10900};
                    }
                } else {
                    stringArray = new String[]{"Trang chủ", "Đóng"};
                    nArray = new int[]{10908, 10900};
                }
                br[] brArray = new br[stringArray.length];
                int n4 = 0;
                int n5 = stringArray.length;
                while (n4 < n5) {
                    brArray[n4] = new br(stringArray[n4], nArray[n4]);
                    ++n4;
                }
                if (com.mg.sq.a.m != null) {
                    brArray = com.mg.sq.a.m.a(brArray, brArray.length - 1);
                    brArray = oi.b(brArray, brArray.length - 1);
                }
                if (ot2.u == 4) {
                    br[] brArray2 = new br[brArray.length + 1];
                    System.arraycopy(brArray, 0, brArray2, 0, brArray.length - 1);
                    brArray2[brArray2.length - 1] = brArray[brArray.length - 1];
                    brArray2[brArray2.length - 2] = new br("Thao tác", 10911);
                    br[] brArray3 = new br[]{new br("Gửi Me", 10912), new br("Chép link", 10904)};
                    brArray2[brArray2.length - 2].a(brArray3);
                    brArray = brArray2;
                }
                bs2.a(brArray);
                int n6 = bs2.e() > bs2.f() ? bs2.e() : bs2.f();
                bs2.a_(-n6, com.mg.bas.v.u);
                bs2.d(0, com.mg.bas.v.u - ba.a - bs2.f());
                bs2.a((bf)ot2);
                ot2.a(bs2);
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
            case 4: {
                Object object = (he)com.mg.sq.a.s().d(-989858);
                object = (ff)((he)object).e(1);
                object = String.valueOf(((ff)object).r()) + " " + ot.d(this.A);
                n3 = this.B.r() + 1;
                com.mg.sq.a.s().a(false);
                oi oi2 = com.mg.sq.a.m;
                oi2.p.a((String)object, 0L, n3);
                return;
            }
            case 5: {
                com.mg.sq.a.s().a(false);
                if (this.z >= 0 && this.z < this.y.d()) {
                    this.b((String)this.y.b(this.z));
                    return;
                }
                this.a((String)null);
                return;
            }
            case -7: {
                hp hp2 = new hp((byte)2);
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
                if (this.B == null || hp3 == null || oy.f == null) break;
                n3 = hp3.v();
                this.B.a(oy.f);
                this.B.h(n3);
                this.B.b(oy.a[n3], oy.b[n3], oy.c[n3], oy.d[n3]);
                hp3.e(n3);
                ag.b().e(999999223);
                return;
            }
            case -8883: {
                hp hp4 = (hp)com.mg.sq.a.s().d(999999223);
                if (hp4 != null) {
                    hp4.u();
                    this.B.a((Image)null);
                }
                ag.b().e(999999223);
                return;
            }
            default: {
                ((fc)this.b).a();
            }
        }
    }

    private static String d(String string) {
        return "rss://" + string;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(int n2, int n3, Object object) {
        Object object2;
        Object object3;
        if (object == null) {
            return;
        }
        Object object4 = (br)object;
        int n4 = this.l.b();
        if (n4 == 1) {
            if (this.C instanceof dn) {
                Object object5 = (dn)this.C;
                object3 = ((dn)object5).c.b(((dn)object5).c.a(((dn)object5).d).b(), ((dn)object5).d);
                switch (n3) {
                    case 10901: {
                        object2 = ((dn)object5).c.i();
                        ff.i = (String)object2;
                        break;
                    }
                    case 10914: {
                        if (((br)object4).b().equals("Xem Ảnh")) {
                            if (com.mg.sq.a.m == null) break;
                            object5 = (lo)((dn)object5).c.a(((dn)object5).d);
                            object3 = com.mg.sq.a.m;
                            ((oi)object3).q.a(((lo)object5).i.a());
                            break;
                        }
                        if (!((br)object4).b().equals("Xem video") && !((br)object4).b().equals("Nghe audio")) break;
                        com.mg.sq.a.s().C();
                        break;
                    }
                    case 10906: {
                        object5 = (lo)((dn)object5).c.a(((dn)object5).d);
                        com.mg.sq.a.d("Nhập nick muốn gửi", ((lo)object5).i.a());
                        break;
                    }
                    case 10905: {
                        object5 = ((dn)object5).c.b(((dn)object5).c.a(((dn)object5).d).b(), ((dn)object5).d);
                        if (com.mg.sq.a.m == null) break;
                        object2 = object5;
                        object5 = null;
                        object3 = com.mg.sq.a.m;
                        ((oi)object3).a((String)object5, (String)object2, true);
                        break;
                    }
                    case 10904: {
                        object5 = ((dn)object5).c.b(((dn)object5).c.a(((dn)object5).d).b(), ((dn)object5).d);
                        ff.i = (String)object5;
                        break;
                    }
                    case 10913: {
                        if (com.mg.bas.i.b((String)object3)) break;
                        if (((String)object3).charAt(0) == '@') {
                            object3 = ((String)object3).substring(1);
                        }
                        if (com.mg.sq.a.m == null) break;
                        com.mg.sq.a.m.a((String)object3, 0L);
                        break;
                    }
                    case 10903: {
                        if (com.mg.bas.i.b((String)object3)) break;
                        if (((String)object3).charAt(0) == '@') {
                            object3 = ((String)object3).substring(1);
                        }
                        if (com.mg.sq.a.m == null) break;
                        com.mg.sq.a.m.c((String)object3);
                        break;
                    }
                    case 10902: {
                        object5 = ((dn)object5).c.b(((dn)object5).c.a(((dn)object5).d).b(), ((dn)object5).d);
                        if (com.mg.sq.a.m == null) break;
                        com.mg.sq.a.m.a((String)object5, 0L);
                        break;
                    }
                    default: {
                        if (((br)object4).b().equals("Xem Ảnh")) {
                            if (com.mg.sq.a.m == null) break;
                            object5 = (lo)((dn)object5).c.a(((dn)object5).d);
                            object3 = com.mg.sq.a.m;
                            ((oi)object3).q.a(((lo)object5).i.a());
                            break;
                        }
                        com.mg.sq.a.s().C();
                        break;
                    }
                }
            } else if (com.mg.sq.a.m != null) {
                com.mg.sq.a.m.b(((br)object4).b(), ((dq)this.C).c);
            }
            this.t();
        }
        switch (n3) {
            case 10908: {
                this.D();
                break;
            }
            case 10907: {
                this.E();
                break;
            }
            case 10909: {
                this.F();
                break;
            }
            case 10912: {
                int n5 = ot.d(this.A).length() + 1;
                object4 = this;
                he he2 = com.mg.sq.a.a("Bạn nghĩ gì nào?", null, "Xong", 4, "Hủy", 3, -7, (bf)object4);
                he2.b(-989858);
                ((ot)object4).B = (fu)he2.e(4);
                object3 = he2;
                object2 = (ff)((he)object3).e(1);
                ((ff)object2).h(300 - n5);
                ag.b().a((al)object3, false);
                break;
            }
            case 10904: {
                ff.i = ot.d(this.A);
                break;
            }
            case 10900: {
                this.p = true;
                if (this.b == null) break;
                ((fc)this.b).d(this);
                break;
            }
            case 11399: {
                if (com.mg.sq.a.m == null) break;
                com.mg.sq.a.m.b(((br)object4).b());
                break;
            }
            default: {
                if (com.mg.sq.a.m == null) break;
                com.mg.sq.a.m.j(n3);
            }
        }
        this.t();
    }

    private void D() {
        if (this.v != null) {
            this.v();
            this.C();
            this.A = null;
            this.c(this.B());
            return;
        }
        this.a((String)null);
    }

    private void E() {
        if (this.z > 0) {
            this.v();
            --this.z;
            this.b((String)this.y.b(this.z));
        }
    }

    private void F() {
        if (this.z < this.y.d() - 1) {
            this.v();
            ++this.z;
            this.b((String)this.y.b(this.z));
        }
    }
}
