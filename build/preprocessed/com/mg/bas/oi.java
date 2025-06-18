package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.smsgame.MGMIDlet;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.DateField;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Item;

public final class oi
extends fb
implements bf,
bg,
bn,
bq,
dv,
CommandListener,
r {
    private oj u;
    private ot v;
    on p;
    oo q;
    private ok w;
    private a x;
    private a y;
    private boolean[] z;
    private ay A;
    private aw B;
    private int C = 0;
    public static long r;
    private boolean D;
    public String[] s;
    public String[] t;
    private eb[] E;
    private long F;
    private br G;
    private eu H = null;
    private eb I = null;
    private la J = null;
    private boolean K = false;
    private String L = "";
    private long M;
    private int N;

    public static void v() {
        oi.j(false);
    }

    private static void j(boolean bl) {
        if (v.ah || bl) {
            p.i();
            pc.c();
            ly.g();
            fo.q();
            oy.b();
            pe.a(null);
        }
        System.gc();
    }

    public static void w() {
        block5: {
            p.h();
            pc.a();
            pc.b();
            ly.f();
            fo.a();
            try {
                oy.a();
                pe pe2 = pe.a();
                if (pe2.a != null) break block5;
                byte[] byArray = pd.q();
                pe2 = pe.a();
                if (byArray != null) {
                    try {
                        pe2.a(ep.a(byArray));
                        break block5;
                    }
                    catch (Throwable throwable) {}
                }
                return;
            }
            catch (Throwable throwable) {
                Throwable throwable2 = throwable;
                throwable.printStackTrace();
                oy.b();
                pe.a(null);
            }
        }
    }

    public oi() {
        super(104, 1, "Bằng Hữu", false);
        this.a(0, 0, v.t, v.u);
        this.x = new a();
        this.A = new ay(0);
        this.A.a(this.c(), this.d(), this.e(), this.f() - 20);
        this.B = new aw();
        this.B.a(this);
        this.B.a(this);
        this.B.e(true);
        this.A.b(this.B);
        if (!v.z) {
            this.A.h(1);
        }
        this.a(new ba());
        this.u = new oj(105, 2, "Danh Sách Đàm Đạo");
        this.v = new ot(109, 7, "Báo online");
        this.p = new on(107, 5, "Ola Me");
        this.q = new oo(108, 6, "Xem Ảnh");
        this.w = new ok();
        this.a(new gb(-1, 0));
        this.b(new gb(-2, 1));
        this.c(new ge());
        this.a(this);
        com.mg.sq.a.o = false;
    }

    public final on z() {
        return this.p;
    }

    public final oj A() {
        return this.u;
    }

    public final void commandAction(Command object, Displayable displayable) {
        if (i.a(object.getLabel(), "Xong")) {
            object = "";
            ec[] ecArray = this.I.f();
            if (ecArray != null) {
                int n2 = 0;
                while (n2 < ecArray.length) {
                    eq eq2 = (eq)oi.a(ecArray[n2]);
                    object = String.valueOf(object) + " " + eq2.a();
                    ++n2;
                }
            }
            object = String.valueOf(this.I.g()) + (String)object;
            ci.a((String)object, this.I.d(), null);
            MGMIDlet.d().a((Displayable)ag.a(), true);
        } else if (i.a(object.getLabel(), "Hủy")) {
            MGMIDlet.d().a((Displayable)ag.a(), true);
        }
        ((Form)displayable).deleteAll();
    }

    public final boolean b(String string) {
        return this.b(string, this.E);
    }

    public final boolean b(String object, eb[] ebArray) {
        if (ebArray == null) {
            return false;
        }
        int n2 = 0;
        while (n2 < ebArray.length) {
            eb eb2 = ebArray[n2];
            if (eb2.e().equals(object)) {
                this.I = eb2;
                object = "FREE";
                if (!(i.b("FREE") || ((String)(object = ((String)object).toUpperCase())).equals("FREE") || ((String)object).equals("MIỄN PHÍ"))) {
                    object = ag.b().a("Chú ý", "Bạn sẽ tốn " + (String)object, "Có", -1006, "Không", 6, 1);
                    ((am)object).a(this);
                    ag.b().a((al)object, false);
                    return true;
                }
                this.a(eb2);
                return true;
            }
            ++n2;
        }
        return false;
    }

    public final void a(eb eb2) {
        String string = eb2.a();
        if (string.equals("wap")) {
            this.a(null, eb2.b(), false);
            return;
        }
        if (string.equals("app")) {
            try {
                long l = Long.parseLong(eb2.b());
                du.a().b(l);
                return;
            }
            catch (Exception exception) {
                return;
            }
        }
        if (string.equals("rss")) {
            this.a(null, "rss://" + eb2.b(), false);
            return;
        }
        if (string.equals("call")) {
            MGMIDlet.d();
            MGMIDlet.b(eb2.c());
            return;
        }
        if (string.equals("msg") || string.equals("sms")) {
            Form form = new Form(eb2.e());
            ec[] ecArray = eb2.f();
            if (ecArray != null) {
                int n2 = 0;
                while (n2 < ecArray.length) {
                    form.append(oi.a(ecArray[n2]));
                    ++n2;
                }
            }
            form.addCommand(new Command("Xong", 4, 1));
            form.addCommand(new Command("Hủy", 3, 1));
            form.setCommandListener((CommandListener)this);
            MGMIDlet.d().a((Displayable)form, true);
        }
    }

    private void a(dt[] object, boolean bl) {
        int n2;
        int n3 = 0;
        while (n3 < ((dt[])object).length) {
            n2 = 0;
            while (n2 < this.x.d()) {
                dt dt2 = this.k(n2);
                if (dt2.b().equals(object[n3].b())) {
                    this.x.a(n2);
                    break;
                }
                ++n2;
            }
            ++n3;
        }
        n3 = 0;
        while (n3 < ((dt[])object).length) {
            if (object[n3].c() == null) {
                object[n3].a(new ds[0]);
            }
            if (bl) {
                this.x.b(object[n3], 0);
            } else {
                this.x.a(object[n3]);
            }
            ++n3;
        }
        object = this;
        boolean[] blArray = new boolean[((oi)object).x.d()];
        n3 = 0;
        while (n3 < blArray.length) {
            blArray[n3] = true;
            ++n3;
        }
        if (((oi)object).z != null) {
            n3 = blArray.length > ((oi)object).z.length ? ((oi)object).z.length : blArray.length;
            n2 = 0;
            while (n2 < n3) {
                blArray[n2] = ((oi)object).z[n2];
                ++n2;
            }
        }
        ((oi)object).z = blArray;
        super.M();
        super.N();
    }

    private void M() {
        if (gr.c) {
            this.y = this.x;
            return;
        }
        this.y = new a();
        int n2 = 0;
        while (n2 < this.x.d()) {
            dt dt2 = this.k(n2);
            ds[] dsArray = dt2.c();
            dt dt3 = new dt(dt2.b());
            dt3.a(dt2.a());
            int n3 = 0;
            int n4 = 0;
            while (n4 < dsArray.length) {
                if (dsArray[n4].e() == 2) {
                    ++n3;
                }
                ++n4;
            }
            ds[] dsArray2 = new ds[n3];
            n3 = 0;
            int n5 = 0;
            while (n5 < dsArray.length) {
                if (dsArray[n5].e() == 2) {
                    dsArray2[n3++] = dsArray[n5];
                }
                ++n5;
            }
            dt3.a(dsArray2);
            this.y.a(dt3);
            ++n2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void N() {
        int n2;
        a a2 = new a(this.y.d());
        int n3 = 0;
        while (n3 < this.y.d()) {
            ds[] dsArray = (ds[])this.y.b(n3);
            a2.a((Object)dsArray);
            if (this.z[n3]) {
                dsArray = dsArray.c();
                n2 = 0;
                while (n2 < dsArray.length) {
                    a2.a(dsArray[n2]);
                    ++n2;
                }
            }
            ++n3;
        }
        aw aw2 = this.B;
        synchronized (aw2) {
            this.B.q();
            n2 = 0;
            while (n2 < a2.d()) {
                this.B.a(a2.b(n2));
                ++n2;
            }
            return;
        }
    }

    public final dt[] B() {
        dt[] dtArray = new dt[this.x.d()];
        int n2 = 0;
        while (n2 < dtArray.length) {
            dtArray[n2] = this.k(n2);
            ++n2;
        }
        return dtArray;
    }

    private dt k(int n2) {
        return (dt)this.x.b(n2);
    }

    public final void x() {
        this.A.c(true);
    }

    public final void y() {
    }

    public final void c(boolean bl) {
        super.c(bl);
        if (bl) {
            this.A.c(true);
        }
    }

    public final boolean f(int n2) {
        if (n2 == 97 || n2 == 96) {
            return false;
        }
        if (n2 == 142) {
            Object object = this.B.t();
            String string = null;
            if (object instanceof ds) {
                string = ((ds)object).f();
            }
            if (!i.b(string)) {
                al al2 = ag.b().a(null, string, "Đóng", 2, 1);
                al2.a(ag.b());
                ag.b().a(al2, false);
                return true;
            }
        }
        return this.A.f(n2);
    }

    public final boolean e(int n2, int n3) {
        return this.A.e(n2, n3);
    }

    public final boolean c(int n2, int n3) {
        return this.A.c(n2, n3);
    }

    public final boolean f(int n2, int n3) {
        return this.A.f(n2, n3);
    }

    public final void n() {
        if (this.C > 0) {
            --this.C;
            this.c(true);
        }
        this.A.n();
    }

    public final void a(Graphics graphics, int n2, int n3) {
        boolean bl = this.A.k();
        n2 = bl ? 1 : 0;
        if (bl) {
            this.c(true);
            graphics.setColor(v.am);
            graphics.fillRect(this.c(), this.d(), this.e(), this.f() - 20);
            graphics.drawImage(pc.d, this.c() + this.e(), this.d() + this.f() - ba.a, 40);
        }
        this.A.a(graphics, this.c(), this.d());
    }

    public final aq a(aw object, int n2) {
        if ((object = ((aw)object).i(n2)) instanceof ds) {
            ds ds2 = (ds)object;
            return new eu(ds2, this.B.e());
        }
        int n3 = 0;
        while (n3 < this.y.d()) {
            dt dt2 = (dt)this.y.b(n3);
            --n2;
            if (this.z[n3]) {
                n2 -= dt2.c().length;
            }
            if (n2 < 0) {
                n2 = n3;
                break;
            }
            ++n3;
        }
        dt dt3 = (dt)object;
        return new ev(dt3, this.z[n2], this.B.e());
    }

    public final void a(aq aq2) {
        super.a(aq2);
        if (aq2 != null) {
            if (this.u.a()) {
                this.O();
                this.u.A();
            }
            aq2 = this.u.v();
            if (((op)aq2).p != null) {
                fc fc2;
                aq2 = this;
                if (aq2.b != null && !(fc2 = (fc)aq2.l()).b(((oi)aq2).u.v())) {
                    fc2.c(((oi)aq2).u.v());
                }
            }
        }
    }

    private void O() {
        if (this.b == null) {
            return;
        }
        fc fc2 = (fc)this.l();
        if (!fc2.b(this.u)) {
            fc2.c(this.u);
        }
    }

    private void a(ds ds2, boolean bl, boolean bl2) {
        this.O();
        this.u.a(ds2, bl, bl2);
    }

    private ds a(String string, boolean bl) {
        if (string == null) {
            return null;
        }
        ds ds2 = this.d(string = string.toLowerCase());
        if (ds2 != null) {
            this.a(ds2, false, bl);
        } else {
            ds2 = oi.e(string);
            this.a(ds2, true, bl);
        }
        return ds2;
    }

    public final ds c(String string) {
        return this.a(string, true);
    }

    public final void a(String string, long l) {
        this.f(true);
        this.p.a(string, 0L);
    }

    private ds d(String string) {
        int n2 = 0;
        while (n2 < this.x.d()) {
            ds[] dsArray = this.k(n2);
            if ((dsArray = dsArray.c()) != null) {
                int n3 = 0;
                while (n3 < dsArray.length) {
                    if (dsArray[n3].a().equals(string)) {
                        return dsArray[n3];
                    }
                    ++n3;
                }
            }
            ++n2;
        }
        return null;
    }

    public final void b(aq object, int n2) {
        object = this.B.i(n2);
        if (object instanceof ds) {
            boolean bl;
            boolean bl2;
            String[] stringArray;
            Object object2;
            String[] stringArray2;
            String[] stringArray3 = (String[])this.B.o(n2);
            Object object3 = this;
            this.H = stringArray3;
            bs bs2 = new bs();
            if (stringArray3.i.a().length() < 3) {
                stringArray2 = new String[]{"Chat!"};
                object2 = new int[]{10400};
            } else {
                stringArray2 = new String[]{"Chat!", "Xem ME"};
                object2 = new int[]{10400, 10401};
            }
            int n3 = stringArray3.j.f(3);
            int n4 = stringArray3.j.f(1);
            String[] stringArray4 = null;
            if (n4 >= 0 && (stringArray = lo.a(((lo)stringArray3.j.a((int)n4)).i)) != null) {
                stringArray4 = stringArray;
            }
            if (n3 >= 0 && n4 >= 0 && !i.b(stringArray4)) {
                stringArray = new String[stringArray2.length + 2];
                int[] nArray = new int[((int[])object2).length + 2];
                System.arraycopy(stringArray2, 0, stringArray, 0, stringArray2.length);
                System.arraycopy(object2, 0, nArray, 0, ((int[])object2).length);
                stringArray[stringArray.length - 2] = "Xem tin";
                nArray[nArray.length - 2] = 10420;
                stringArray[stringArray.length - 1] = stringArray4;
                nArray[nArray.length - 1] = 10421;
                stringArray2 = stringArray;
                object2 = nArray;
            } else {
                if (n3 >= 0) {
                    stringArray = new String[stringArray2.length + 1];
                    int[] nArray = new int[((int[])object2).length + 1];
                    System.arraycopy(stringArray2, 0, stringArray, 0, stringArray2.length);
                    System.arraycopy(object2, 0, nArray, 0, ((int[])object2).length);
                    stringArray[stringArray.length - 1] = "Xem tin";
                    nArray[nArray.length - 1] = 10420;
                    stringArray2 = stringArray;
                    object2 = nArray;
                }
                if (n4 >= 0 && !i.b(stringArray4)) {
                    stringArray = new String[stringArray2.length + 1];
                    int[] nArray = new int[((int[])object2).length + 1];
                    System.arraycopy(stringArray2, 0, stringArray, 0, stringArray2.length);
                    System.arraycopy(object2, 0, nArray, 0, ((int[])object2).length);
                    stringArray[stringArray.length - 1] = stringArray4;
                    nArray[nArray.length - 1] = 10421;
                    stringArray2 = stringArray;
                    object2 = nArray;
                }
            }
            if ((bl2 = stringArray3.i.g() != null && stringArray3.i.g().equals("patriot")) && !stringArray3.i.a().equals(go.e) && ((aq)object3).l() instanceof fc && ((fc)((aq)object3).l()).i(100)) {
                Object object4 = (ol)((fc)((aq)object3).l()).h(100);
                if (object4 != null && ((ol)object4).p != null && ((ol)object4).p.b() == 2) {
                    stringArray3 = new String[stringArray2.length + 1];
                    object4 = new int[((int[])object2).length + 1];
                    System.arraycopy(stringArray2, 1, stringArray3, 2, stringArray2.length - 1);
                    System.arraycopy(object2, 1, object4, 2, ((int[])object2).length - 1);
                    stringArray3[0] = stringArray2[0];
                    object4[0] = object2[0];
                    stringArray3[1] = "Xem thông tin";
                    object4[1] = 10424;
                    stringArray2 = stringArray3;
                    object2 = object4;
                } else {
                    stringArray3 = new String[stringArray2.length + 3];
                    object4 = new int[((int[])object2).length + 3];
                    System.arraycopy(stringArray2, 1, stringArray3, 4, stringArray2.length - 1);
                    System.arraycopy(object2, 1, object4, 4, ((int[])object2).length - 1);
                    stringArray3[0] = stringArray2[0];
                    object4[0] = object2[0];
                    stringArray3[1] = "Khiêu Chiến";
                    object4[1] = 10422;
                    stringArray3[2] = "Giao dịch";
                    object4[2] = 10423;
                    stringArray3[3] = "Xem thông tin";
                    object4[3] = 10424;
                    stringArray2 = stringArray3;
                    object2 = object4;
                }
            }
            if (stringArray2.length < 2) {
                bl = false;
            } else {
                Object object5 = new br[stringArray2.length];
                int n5 = 0;
                while (n5 < stringArray2.length) {
                    object5[n5] = new br(stringArray2[n5], object2[n5]);
                    ++n5;
                }
                bs2.a((br[])object5);
                n5 = ((oi)object3).B.s();
                object5 = ((oi)object3).B.o(n5);
                k k2 = ((oi)object3).A.r();
                int n6 = (v.t - bs2.e()) / 2;
                int n7 = ((oi)object3).A.d() + ((aq)object5).d() - k2.b;
                if (n7 + bs2.f() > v.u - ba.a) {
                    n7 = v.u - ba.a - bs2.f();
                }
                bs2.a_(v.t + bs2.e(), n7);
                bs2.d(n6, n7);
                bs2.a((bg)object3);
                bs2.a(new gb(1, 2));
                bs2.b(new gb(2, 3));
                bs2.c(new ge());
                bs2.a_(1);
                ((fb)object3).a(bs2);
                bl = true;
            }
            if (!bl) {
                boolean bl3 = false;
                object3 = (ds)object;
                oi oi2 = this;
                oi2.a((ds)object3, false, true);
                return;
            }
        } else {
            int n8 = 0;
            while (n8 < this.y.d()) {
                if (object.equals(this.y.b(n8)) && n8 <= this.z.length) {
                    this.z[n8] = !this.z[n8];
                    this.N();
                    this.B.k(n2);
                    this.P();
                    return;
                }
                ++n8;
            }
        }
    }

    private void P() {
        int n2 = this.A.r().b;
        int n3 = this.B.s();
        if (n3 * 22 - n2 >= this.B.f() - 40 - 22) {
            n2 = n3 * 22 - (this.B.f() - 40 - 22);
        }
        this.A.k(n2);
    }

    public final void a(aq aq2, int n2) {
    }

    public final void a(aq aq2, int n2, int n3) {
    }

    public final void a(int n2) {
        ks.h += n2;
    }

    public final void b(int n2) {
        ks.h += n2;
    }

    public final void a(dt[] dtArray) {
        if (dtArray != null) {
            dt[] dtArray2 = dtArray;
            int n2 = 0;
            while (n2 < dtArray2.length) {
                ds[] dsArray;
                if (dtArray2[n2].a() == 1 && (dsArray = dtArray2[n2].c()) != null) {
                    int n3 = 0;
                    while (n3 < dsArray.length) {
                        dsArray[n3].b((short)0);
                        ++n3;
                    }
                }
                ++n2;
            }
            this.a(dtArray, true);
        }
    }

    public final void a(dt[] object, int n2) {
        if (object == null) {
            return;
        }
        oi oi2 = this;
        if (oi2.x != null) {
            int n3 = oi2.x.d() - 1;
            while (n3 >= 0) {
                dt dt2 = (dt)oi2.x.b(n3);
                if (dt2.a() != 1) {
                    oi2.x.a(n3);
                }
                --n3;
            }
        }
        if (gr.h) {
            pd.a(object, n2);
            go.d = n2;
        }
        dt[] dtArray = object;
        object = this;
        object.a(dtArray, false);
        object = pd.t();
        if (object != null) {
            int n4 = 0;
            while (n4 < ((dt[])object).length) {
                this.a((String)((Object)object[n4]), false);
                ++n4;
            }
        }
    }

    public final void C() {
        if (!this.v.p) {
            this.i(false);
        }
        if (!this.p.q) {
            this.f(false);
        }
        if (!this.w.s) {
            this.k(false);
        }
        oi oi2 = this;
        if (!oi2.K && oi2.b != null) {
            oi2.K = true;
            du.a().j();
        }
    }

    public static br[] a(eb[] ebArray) {
        br[] brArray = new br[ebArray.length];
        int n2 = 0;
        while (n2 < brArray.length) {
            brArray[n2] = new br(ebArray[n2].e(), 11399);
            brArray[n2].a(ebArray[n2]);
            ++n2;
        }
        return brArray;
    }

    public final br[] a(br[] brArray, int n2) {
        if (brArray == null || this.G == null) {
            return brArray;
        }
        br[] brArray2 = new br[brArray.length + 1];
        System.arraycopy(brArray, 0, brArray2, 0, n2);
        brArray2[n2] = this.G;
        System.arraycopy(brArray, n2, brArray2, n2 + 1, brArray.length - n2);
        return brArray2;
    }

    public final boolean j(int n2) {
        if (n2 == 99031) {
            this.g(true);
            return true;
        }
        if (n2 == 99009) {
            this.h(true);
            return true;
        }
        if (n2 == 99017) {
            this.E();
            return true;
        }
        if (n2 == 99012) {
            MGMIDlet.d();
            MGMIDlet.b("1900588883");
            return true;
        }
        if (n2 == 99011) {
            com.mg.sq.a.F();
            return true;
        }
        if (n2 == 99008) {
            this.F();
            return true;
        }
        if (n2 == 99007) {
            com.mg.sq.a.D();
            return true;
        }
        return false;
    }

    public static br[] b(br[] brArray, int n2) {
        br[] brArray2 = new br[brArray.length + 1];
        br br2 = new br("Giới thiệu", 99007);
        if (!com.mg.sq.a.o) {
            System.arraycopy(brArray, 0, brArray2, 0, n2);
            brArray2[n2] = br2;
            System.arraycopy(brArray, n2, brArray2, n2 + 1, brArray.length - n2);
            return brArray2;
        }
        br br3 = new br("Hỗ trợ", 99001);
        br3.a(new br[]{br2, new br("Hướng dẫn", 99008), new br("Thông Tin #12", 99031), new br("Thảo luận #SQ", 99009), new br("Rao vặt #sqgd", 99017), new br("Hỗ trợ", 99012), new br("Cài đặt", 99011)});
        System.arraycopy(brArray, 0, brArray2, 0, n2);
        brArray2[n2] = br3;
        System.arraycopy(brArray, n2, brArray2, n2 + 1, brArray.length - n2);
        return brArray2;
    }

    public final void a(String string, String string2) {
        Object object = this.u.a(string, string2, 0);
        if (object == null) {
            String string3 = string;
            object = this;
            object = ((oi)object).a(string3, true);
            ((ds)object).d("patriot");
            this.u.a(string, string2, 0);
        }
        du.a().a(string, string2, null);
    }

    public final void a(ef ef2, short s) {
        boolean bl = false;
        Object object = ag.b().d();
        if (object != null && ((am)object).h() == 1) {
            String string;
            Object object2;
            object = (oa)object;
            an an2 = object;
            if (((oa)object).k != null) {
                object2 = an2.k;
                string = ((ol)object2).p != null && ((ol)object2).p.b() == 2 ? ((oq)((ol)object2).p).s() : "";
            } else {
                string = "";
            }
            if (string.equals(ef2.b())) {
                object2 = ef2.c();
                an2 = object;
                if (an2.k != null) {
                    object = object2;
                    ol ol2 = an2.k;
                    if (ol2.p != null && ol2.p.b() == 2) {
                        ((oq)ol2.p).a((String)object);
                    }
                }
                bl = true;
            }
        } else if (System.currentTimeMillis() - this.F >= 15000L && ef2.c().equals(gs.f)) {
            this.F = System.currentTimeMillis();
            ag.a().a(50);
            ag.a().b(100);
        }
        this.O();
        object = this.u.b(ef2.b(), ef2.c(), (int)ef2.f());
        if (object == null) {
            boolean bl2;
            object = this.d(ef2.b());
            if (object == null) {
                object = oi.e(ef2.b());
                bl2 = true;
            } else {
                bl2 = false;
            }
            object = this.u.a((ds)object, ef2.c(), (int)ef2.f(), bl2);
        }
        if (!bl && s != 2 && object != null) {
            ((di)object).a = true;
            if (this.b != null) {
                fc fc2 = (fc)this.l();
                if (this.u.v().p != null && this.u.v().p.equals(object) && fc2.q().equals(this.u.v())) {
                    ((di)object).a = false;
                    return;
                }
            }
            if (((di)object).a) {
                this.u.A();
            }
        }
    }

    public final void D() {
        if (this.b == null) {
            return;
        }
        fc fc2 = (fc)this.l();
        fc2.d(this.q);
    }

    private void k(boolean bl) {
        if (this.b == null) {
            return;
        }
        fc fc2 = (fc)this.l();
        if (!fc2.b(this.w)) {
            fc2.c(this.w);
        }
        if (bl) {
            fc2.a(this.w);
        }
    }

    public final void e(boolean bl) {
        if (this.b == null) {
            return;
        }
        fc fc2 = (fc)this.l();
        if (!fc2.b(this.q)) {
            fc2.c(this.q);
        }
        fc2.a(this.q);
    }

    public final void f(boolean bl) {
        if (this.b == null) {
            return;
        }
        fc fc2 = (fc)this.l();
        if (!fc2.b(this.p)) {
            fc2.c(this.p);
        }
        if (bl) {
            fc2.a(this.p);
        }
    }

    public final void a(String object, String string, boolean bl) {
        int n2 = string.toLowerCase().indexOf("rss://");
        if (n2 == 0) {
            this.v.a(string.substring(6));
            return;
        }
        if (bl) {
            com.mg.sq.a.s().a("Đang kiểm tra đường dẫn...", (il)null);
            du.a().c(string, (String)object);
            return;
        }
        try {
            MGMIDlet.d().platformRequest(string);
            return;
        }
        catch (ConnectionNotFoundException connectionNotFoundException) {
            object = connectionNotFoundException;
            connectionNotFoundException.printStackTrace();
            return;
        }
    }

    public final void b(String string, String string2) {
        this.a(string, string2, true);
    }

    public final void E() {
        this.p.a("#sqgd", 0L);
        this.f(true);
    }

    public final void g(boolean bl) {
        this.p.a("#12", 0L);
        this.f(bl);
    }

    public final void h(boolean bl) {
        this.p.a("#sq", 0L);
        this.f(true);
    }

    public final void F() {
        String string = "rss://faq/sq";
        String string2 = null;
        oi oi2 = this;
        oi2.a(string2, string, true);
        this.i(true);
    }

    public final void i(boolean bl) {
        if (this.b == null) {
            return;
        }
        fc fc2 = (fc)this.l();
        if (!fc2.b(this.v)) {
            fc2.c(this.v);
        }
        if (bl) {
            fc2.a(this.v);
        }
    }

    private static ds e(String string) {
        if (string == null) {
            return null;
        }
        string = string.toLowerCase();
        ds ds2 = new ds();
        ds2.a(string);
        ds2.b(string);
        ds2.a((short)-13);
        return ds2;
    }

    public final void a(ds[] dsArray) {
        if (this.u.a()) {
            this.O();
        }
        int n2 = 0;
        while (n2 < dsArray.length) {
            int n3 = 0;
            while (n3 < this.x.d()) {
                ds[] dsArray2 = this.k(n3).c();
                if (dsArray2 != null) {
                    boolean bl = false;
                    int n4 = 0;
                    while (n4 < dsArray2.length) {
                        if (dsArray2[n4].a().equals(dsArray[n2].a())) {
                            if (dsArray[n2].e() == 2) {
                                dsArray2[n4].c(dsArray[n2].f());
                                dsArray2[n4].a(dsArray[n2].c());
                                dsArray2[n4].b(dsArray[n2].d());
                            }
                            ef ef2 = null;
                            if (dsArray[n2].e() != dsArray2[n4].e() && this.u.a(dsArray2[n4].a()) >= 0) {
                                ef2 = new ef();
                                ef2.a(System.currentTimeMillis());
                                ef2.a(dsArray2[n4].a());
                                String string = dsArray2[n4].a();
                                if (!i.b(dsArray2[n4].b())) {
                                    string = dsArray2[n4].b();
                                }
                                if (dsArray[n2].e() == 2) {
                                    ef2.b("[" + string + " đã đăng nhập trở lại]");
                                } else {
                                    ef2.b("[" + string + " đã đăng xuất]");
                                }
                            }
                            dsArray2[n4].d(dsArray[n2].g());
                            dsArray2[n4].c(dsArray[n2].e());
                            this.u.a(dsArray2[n4]);
                            if (ef2 != null) {
                                this.a(ef2, (short)2);
                            }
                            bl = true;
                            break;
                        }
                        ++n4;
                    }
                    if (bl) {
                        this.k(n3).d();
                        break;
                    }
                }
                ++n3;
            }
            ++n2;
        }
        n2 = this.B.s();
        this.M();
        this.N();
        this.C = 1;
        if (n2 >= this.B.a()) {
            n2 = this.B.a() - 1;
        }
        this.B.k(n2);
        this.P();
    }

    public final void a(ef[] efArray, short s) {
        if (efArray != null) {
            Object object;
            this.O();
            if (this.b != null) {
                object = (fc)this.l();
                ((fc)object).e(this.u);
            }
            int n2 = 0;
            while (n2 < efArray.length) {
                object = efArray[n2].c() == null ? "" : efArray[n2].c();
                efArray[n2].b("(" + i.b(efArray[n2].d()) + "): " + (String)object);
                this.a(efArray[n2], s);
                ++n2;
            }
        }
    }

    public final void G() {
        if (com.mg.sq.a.o && gr.i) {
            pd.b(this.u.w());
        }
        com.mg.sq.a.o = false;
        du.a().a((dv)null);
        aq aq2 = this.l();
        if (aq2 != null) {
            aq2 = (fc)aq2;
            ((fc)aq2).d(this);
            ((fc)aq2).d(this.u);
            ((fc)aq2).d(this.v);
            ((fc)aq2).d(this.p);
            ((fc)aq2).d(this.q);
            ((fc)aq2).d(this.w);
            ((fc)aq2).d(this.u.v());
        }
        this.u = null;
        this.v = null;
        this.p = null;
        this.q = null;
        this.w = null;
        this.u = null;
        du.a().c();
        oi.j(true);
        com.mg.sq.a.m = null;
        System.gc();
        ct.b("Logged out OLA");
    }

    public final void a(ds[] dsArray, String string) {
        dt dt2;
        oi oi2;
        dt[] dtArray;
        block5: {
            dtArray = string;
            oi2 = this;
            int n2 = 0;
            while (n2 < oi2.x.d()) {
                dt dt3 = oi2.k(n2);
                if (dt3.b().equals(dtArray)) {
                    dt2 = dt3;
                    break block5;
                }
                ++n2;
            }
            dt2 = null;
        }
        dt dt4 = dt2;
        int n3 = 0;
        while (n3 < dsArray.length) {
            ds ds2 = dsArray[n3];
            if (dt4 == null) {
                dt4 = new dt(string);
                oi oi3 = this;
                dtArray = dt4;
                oi2 = oi3;
                dtArray = new dt[]{dtArray};
                oi2 = oi3;
                oi3.a(dtArray, false);
                this.a(ds2, string, dt4);
            } else {
                this.a(ds2, string, dt4);
                this.M();
                this.N();
            }
            ++n3;
        }
    }

    private void a(ds ds2, String dsArray, dt dt2) {
        ds2.b((short)0);
        int n2 = 0;
        while (n2 < this.x.d()) {
            dt dt3 = this.k(n2);
            if (dt3.b().compareTo((String)dsArray) == 0) {
                if (dt3.c() != null) {
                    dsArray = new ds[dt3.c().length + 1];
                    n2 = 0;
                    while (n2 < dt3.c().length) {
                        dsArray[n2] = dt3.c()[n2];
                        ++n2;
                    }
                    dsArray[n2] = ds2;
                } else {
                    ds[] dsArray2 = new ds[1];
                    dsArray = dsArray2;
                    dsArray2[0] = ds2;
                }
                dt2.a(dsArray);
                return;
            }
            ++n2;
        }
    }

    public static void c(String string, String string2) {
        du.a().a(string, string2);
    }

    public final void H() {
        if (com.mg.sq.a.o) {
            return;
        }
        if (!this.D && System.currentTimeMillis() - r > 120000L) {
            this.D = true;
            this.a(1, null, (short)0);
        }
    }

    public final void a(int n2, int n3, Object object) {
        if (object == null) {
            return;
        }
        Object object2 = (br)object;
        this.t();
        switch (n3) {
            case 10400: {
                boolean bl = false;
                ds ds2 = this.H.i;
                object2 = this;
                ((oi)object2).a(ds2, false, true);
                return;
            }
            case 10401: {
                this.p.a(this.H.i.a(), 0L);
                this.f(true);
                return;
            }
            case 10408: {
                du.a().b((short)2412);
                com.mg.sq.a.s().a((String)null, (il)null);
                return;
            }
            case 10409: {
                object2 = ag.b().a("Chú ý", "Bạn muốn thoát hệ thống chat", "Có", 5, "Không", 6, 1);
                ((am)object2).a(this);
                ag.b().a((al)object2, false);
                return;
            }
            case 10410: {
                this.f(true);
                return;
            }
            case 10411: {
                this.i(true);
                if (this.b == null) break;
                ((fc)this.b).a(this.v);
                return;
            }
            case 10412: {
                this.e(true);
                return;
            }
            case 10413: {
                this.k(true);
                return;
            }
            case 10414: {
                gr.d = false;
                this.I();
                return;
            }
            case 10415: {
                gr.d = true;
                this.I();
                return;
            }
            case 10416: 
            case 10417: {
                byte[] byArray;
                gr.c = !gr.c;
                this.J();
                object2 = cs.a;
                if (gr.c) {
                    byArray = new byte[1];
                } else {
                    byte[] byArray2 = new byte[1];
                    byArray = byArray2;
                    byArray2[0] = 1;
                }
                ((u)object2).b(133, byArray);
                return;
            }
            case 10418: {
                ah ah2 = ag.b();
                object2 = this;
                he he2 = com.mg.sq.a.a("Nhập thông điệp mới", null, "Đổi", 3, "Hủy", 4);
                object = (ff)he2.e(1);
                if (object != null) {
                    ((ff)object).e(true);
                }
                he2.a((bf)object2);
                he2.b(-9999991);
                ah2.a(he2);
                return;
            }
            case 10419: {
                ah ah3 = ag.b();
                object2 = this;
                he he3 = com.mg.sq.a.a("Nhập nick muốn chat", null, "Xong", 7, "Hủy", 8);
                he3.a((bf)object2);
                he3.b(-9999992);
                ah3.a(he3, false);
                return;
            }
            case 0: {
                com.mg.sq.a.s().C();
                return;
            }
            case 10420: {
                object2 = this.H.j.h();
                if (object2 == null) break;
                object = object2;
                String string = this.H.i.a();
                object2 = this;
                ((oi)object2).a(string, (String)object, true);
                return;
            }
            case 10421: {
                if (((br)object2).b().equals("Xem Ảnh")) {
                    object2 = this.H.j.g();
                    if (object2 == null) break;
                    n3 = 1;
                    this.q.a((String)((object2 = ((String)object2).trim()) == null || ((String)object2).length() <= 2 ? object2 : ((String)object2).substring(2, ((String)object2).length() - 1)));
                    return;
                }
                com.mg.sq.a.s().C();
                return;
            }
            case 10422: {
                com.mg.sq.a.d(this.H.i.a());
                return;
            }
            case 10423: {
                com.mg.sq.a.p(this.H.i.a());
                return;
            }
            case 10424: {
                com.mg.sq.a.s().b(this.H.i.a(), this.i);
                return;
            }
            case 11399: {
                this.b(((br)object2).b());
            }
            default: {
                if (com.mg.sq.a.s().m(n3)) break;
                this.j(n3);
            }
        }
    }

    public final void d(int n2, int n3) {
        switch (n3) {
            case -1007: {
                pd.e(go.c);
                ag.b().a(false);
                com.mg.sq.a.s().a((String)null, (il)null);
                this.k(true);
                du.a().n();
                if (this.M < 1L) {
                    return;
                }
                du.a().b(this.M);
                return;
            }
            case -1006: {
                ag.b().a(false);
                this.a(this.I);
                return;
            }
            case -1002: {
                com.mg.sq.a.s().a(false);
                du.a().c(null, (short)this.q.i);
                return;
            }
            case -1003: {
                com.mg.sq.a.s().a(false);
                return;
            }
            case -1004: {
                com.mg.sq.a.s().a(false);
                du.a().k();
                return;
            }
            case -1005: {
                com.mg.sq.a.s().a(false);
                du.a().l();
                return;
            }
            case -1: {
                oi oi2 = this;
                bs bs2 = new bs();
                bs2.a(new gb(1, 2));
                bs2.b(new gb(2, 3));
                br[] brArray = null;
                if (com.mg.sq.a.m != null && com.mg.sq.a.o) {
                    brArray = new br("Nạp KEN", 99003);
                    brArray.a(new br[]{new br("Nhắn tin", 99004), new br("Thẻ cào ĐT", 99005), new br("DS điện thoại", 99006)});
                }
                br br2 = new br("Thao tác", 10407);
                br br3 = new br("Tính năng", 10406);
                br br4 = new br("Đóng", 10409);
                br br5 = new br("Mua vip", 10408);
                if (com.mg.sq.a.o) {
                    brArray = new br[]{br3, br2, brArray, br5, br4};
                    brArray = oi.b(brArray, 3);
                } else {
                    brArray = new br[]{br3, br2, br4};
                    brArray = oi.b(brArray, 2);
                }
                br3.a(new br[]{new br("Ola Me", 10410), new br("Báo online", 10411), new br("Media", 10412), new br("Kho Game", 10413)});
                br3 = gr.d ? new br("Ẩn Nick", 10414) : new br("Hiện Nick", 10415);
                br4 = gr.c ? new br("Chỉ hiện Online", 10416) : new br("Hiện Offline", 10417);
                br5 = new br("Đổi thông điệp", 10418);
                br br6 = new br("Chat với", 10419);
                br br7 = new br("Khoe Nhân Vật", 0);
                br2.a(new br[]{br3, br4, br5, br6, br7});
                brArray = oi2.a(brArray, 2);
                bs2.a(brArray);
                bs2.a(oi2);
                bs2.a_(-bs2.e(), oi2.f());
                bs2.d(0, oi2.f() - ba.a - bs2.f());
                oi2.a(bs2);
                return;
            }
            case -2: {
                if (this.b == null) break;
                ((fc)this.b).a();
                return;
            }
            case -1001: {
                ag.b().a(-10001988, false);
                return;
            }
            case -1000: {
                this.G();
                com.mg.sq.a.s().l();
                return;
            }
            case 1: {
                this.l.f(95);
                return;
            }
            case 2: {
                this.t();
                return;
            }
            case 3: {
                String string = com.mg.sq.a.k(-9999991);
                gr.d = true;
                oi.f(string == null ? "" : string);
                ag.b().a(-9999991, false);
                return;
            }
            case 4: {
                ag.b().a(-9999991, false);
                return;
            }
            case 5: {
                ag.b().a(false);
                this.G();
                return;
            }
            case 6: {
                ag.b().a(false);
                return;
            }
            case 7: {
                Object object = com.mg.sq.a.k(-9999992);
                if (!i.b((String)object)) {
                    String string = object;
                    object = this;
                    ((oi)object).a(string, true);
                }
                ag.b().a(-9999992, false);
                return;
            }
            case 8: {
                ag.b().a(-9999992, false);
                return;
            }
            case 0: {
                du.a().m();
                ag.b().e(241231);
            }
        }
    }

    private static void f(String string) {
        if (string == null) {
            string = pd.p();
        } else if (gr.g) {
            pd.a(string);
        }
        if (string == null) {
            string = "Đang chơi game 12 Sứ Quân Online! http://sq.ola.vn";
        } else if (string.length() <= 0) {
            du.a().a((short)2);
            return;
        }
        du.a().c(string);
    }

    public final void I() {
        if (gr.d) {
            od.f();
            oi.f(null);
            return;
        }
        od.f();
        du.a().a((short)1);
    }

    public final void J() {
        this.M();
        this.N();
        this.C = 1;
    }

    public final void a(String object) {
        com.mg.sq.a.s().v();
        try {
            MGMIDlet.d().platformRequest((String)object);
            return;
        }
        catch (ConnectionNotFoundException connectionNotFoundException) {
            object = connectionNotFoundException;
            connectionNotFoundException.printStackTrace();
            return;
        }
    }

    public final void a(int n2, dq[] dqArray) {
        this.J = new la(n2, dqArray);
    }

    public final dq K() {
        if (this.J == null) {
            return null;
        }
        return this.J.a();
    }

    public final void a(ea[] eaArray) {
        this.w.a(eaArray);
    }

    public final void a(String string, String string2, ee[] eeArray, eb[] ebArray) {
        if (this.b == null) {
            return;
        }
        ag.b().a(new hk(string, string2, eeArray, ebArray), false);
        com.mg.sq.a.s().v();
    }

    public final void a(long l, ea[] eaArray) {
        ea[] eaArray2 = eaArray;
        long l2 = l;
        ok ok2 = this.w;
        if (ok2.q == null || eaArray2 == null) {
            com.mg.sq.a.s().v();
            return;
        }
        int n2 = 0;
        while (n2 < ok2.q.length) {
            if (ok2.q[n2].k == l2) {
                ok2.q[n2].i = true;
                int n3 = 0;
                if (ok2.r[n2] != null) {
                    n3 = ok2.r[n2].length;
                    fa[] faArray = new fa[ok2.r[n2].length + eaArray2.length];
                    System.arraycopy(ok2.r[n2], 0, faArray, 0, ok2.r[n2].length);
                    ok2.r[n2] = faArray;
                } else {
                    ok2.r[n2] = new fa[eaArray2.length];
                }
                int n4 = 0;
                while (n4 < eaArray2.length) {
                    ok2.r[n2][n3 + n4] = new fa(false, eaArray2[n4].c(), eaArray2[n4].a(), "Bấm vào để xem", 0, ok2.p.e());
                    ++n4;
                }
            }
            ++n2;
        }
        ok2.a();
        com.mg.sq.a.s().v();
    }

    public final void a(String string, long l, int n2) {
        this.M = l;
        this.L = string;
        this.N = n2;
        if (this.b != null) {
            this.L();
        }
    }

    public final void L() {
        if (go.c < this.N) {
            go.c = this.N;
            al al2 = ag.b().a("Thông tin", "Vừa ra mắt: " + this.L, "Chơi thử", -1007, "Đóng", 6, 1);
            al2.a(this);
            ag.b().a(al2, false);
        }
    }

    public final void a(String[] stringArray) {
        com.mg.sq.a.s().v();
        if (stringArray == null) {
            stringArray = new String[]{};
        }
        com.mg.sq.a.e(stringArray);
    }

    public final void a(int n2, String object, short s) {
        Object object2 = object = i.b((String)object) ? " - Lỗi không xác định." : object;
        if (n2 == 1 || n2 == 7) {
            if (n2 == 7) {
                return;
            }
        } else {
            com.mg.sq.a.s().v();
            if (this.b == null) {
                return;
            }
            if (n2 == 34 || n2 == 27 || n2 == 26 || n2 == 35) {
                if (n2 == 35 && s == (short)this.q.i) {
                    du.a().l();
                    com.mg.sq.a.s().b().b(null);
                }
                object = "Nội dung không tồn tại hoặc đã hết";
            } else if (n2 == 8) {
                com.mg.sq.a.s().v();
            } else if (n2 == 24) {
                object = "Không được thực hiện cùng 1 hành động quá nhanh!";
            } else if (n2 == 38) {
                object = "Chức năng cần có VIP. Bạn có muốn mua VIP không?";
                com.mg.sq.a a2 = com.mg.sq.a.s();
                object = a2.a("Chú ý", (String)object, "Có", 12358, "Đóng", 12350, 1);
                ((am)object).a(a2);
                a2.a((al)object, false);
                return;
            }
            com.mg.sq.a.s().a((String)object);
        }
    }

    private static Item a(ec ec2) {
        ct.a("[BuddyListTab] createItem(...)  " + ec2.a + "  " + ec2.b);
        Object object = null;
        switch (ec2.a) {
            case 4: {
                object = new er(ec2.b, 2, ec2.d, null, ec2.e);
                break;
            }
            case 6: {
                object = new er(ec2.b, 4, ec2.d, null, ec2.e);
                break;
            }
            case 5: {
                object = new er(ec2.b, 1, ec2.d, null, ec2.e);
                break;
            }
            case 3: {
                object = new es(ec2.b, "", 20, 3);
                break;
            }
            case 1: {
                object = new es(ec2.b, "", 20, 0);
                break;
            }
            case 2: {
                object = new es(ec2.b, "", 20, 2);
                break;
            }
            case 10: {
                object = new es(ec2.b, ec2.c, 20, 131072);
                break;
            }
            case 8: {
                object = new DateField(ec2.b, 3);
                break;
            }
            case 7: {
                object = new DateField(ec2.b, 1);
                break;
            }
            case 9: {
                object = new DateField(ec2.b, 2);
            }
        }
        return object;
    }

    public final void a(String[] stringArray, String[] stringArray2) {
        this.t = stringArray2;
        this.s = stringArray;
    }

    public final void a(String string, short s, ef[] efArray) {
        this.f(false);
        this.p.a(string, s, efArray);
    }

    public final void a(String string, String string2, String[] stringArray, String[] stringArray2) {
        com.mg.sq.a.s().v();
        com.mg.sq.a.a(string, string2, stringArray, stringArray2);
    }

    public final void a(ee ee2) {
        com.mg.sq.a.s().b().b(null);
        pd.a(ee2.h, ee2.a());
        this.q.a(ee2);
    }

    public final void a(int n2, int n3) {
        com.mg.sq.a.s().b().b(new li(n2, n3));
    }

    public final void a(int n2, ep[] epArray, byte[] byArray) {
        if (go.b >= n2) {
            return;
        }
        pd.b(byArray);
        pd.f(n2);
        pe.a().a(epArray);
        go.b = n2;
    }

    public final void c_() {
        al al2 = ag.b().a("Chú ý", "File khác đang được tải. Bạn có muốn tải file khác không?", "Có", -1002, "Không", -1003, 1);
        al2.a(this);
        ag.b().a(al2, false);
    }

    public final void d_() {
        al al2 = ag.b().a("Chú ý", "File có kích thước lớn. Bạn có chắc muốn tải về không?", "Có", -1004, "Không", -1005, 1);
        al2.a(this);
        ag.b().a(al2, false);
    }

    public final void e_() {
        com.mg.sq.a.s().b().b(null);
        al al2 = ag.b().a("Thông tin", "Không đủ bộ nhớ để tải file", "Đóng", -1003, 1);
        al2.a(this);
        ag.b().a(al2, false);
    }

    public final void a(short s, long l, long l2) {
        al al2 = ag.b().a("", "Bạn vừa mua thành công VIP " + pe.a().c(s) + ". Với giá: " + com.mg.sq.a.b(l2) + ". Bạn còn " + i.a(l / 86400000L, ".") + " ngày sử dụng", "Đóng", -1003, 1);
        al2.a(this);
        ag.b().a(al2);
    }

    public final void a(String object, short s, long l) {
        object = ag.b().a("", "Bạn vừa nhận đươc VIP " + pe.a().c(s) + " với " + l + " ngày sử dụng từ " + (String)object, "Đóng", -1003, 1);
        ((am)object).a(this);
        ag.b().a((al)object);
    }

    public final void a(String string, eb[] ebArray) {
        this.E = ebArray;
        this.G = new br(string, 0);
        if (this.E != null) {
            this.G.a(oi.a(this.E));
        }
    }

    public final void f_() {
        this.G();
        al al2 = ag.b().a("Thông tin", "Hệ thống chat Ola của bạn đã bị đăng nhập bởi một người khác hoặc thiết bị khác!", "Đóng", 2, 1);
        al2.a(ag.b());
        ag.b().a(al2, false);
    }

    public final void g_() {
        Object object;
        com.mg.sq.a.o = true;
        pd.b(go.e);
        Object object2 = pd.u();
        if (object2 != null) {
            object = object2;
            object2 = this;
            object2.a((dt[])object, false);
        }
        if ((object2 = pd.t()) != null) {
            int n2 = 0;
            while (n2 < ((Object[])object2).length) {
                this.a((String)object2[n2], false);
                ++n2;
            }
        }
        du.a().i();
        du.a().a(go.d);
        du.a().s();
        du.a().q();
        du.a().r();
        du.a().b(go.b);
        if (gr.d) {
            object = pd.p();
            if (object == null) {
                object = "Đang chơi game 12 Sứ Quân Online! http://sq.ola.vn";
            }
            du.a().c((String)object);
        }
        object = ag.b().d();
        if (this.b != null) {
            this.C();
            return;
        }
        if (object != null && ((am)object).h() == 1) {
            ((oa)object).e();
        }
    }

    public final void h_() {
        dz dz2 = new dz();
        new dz().b = "vn";
        dz2.e = v.t;
        dz2.f = v.u;
        dz2.g = 0;
        dz2.c = "123456789";
        dz2.d = "patriot";
        String string = System.getProperty("microedition.platform");
        dz2.a = string == null ? " " : string;
        du.a().a(go.e, go.f, gr.d ? (short)2 : 1);
    }

    public final void i_() {
        du.a().l();
    }

    public final void a(String string, ee ee2) {
        ef ef2 = new ef();
        ef2.b("#" + ee2.a() + "#");
        ef2.a(string);
        ef2.a(ee2.d);
        this.a(ef2, (short)0);
    }

    public final void b(String string, String[] stringArray, String[] stringArray2) {
        this.i(true);
        this.v.a(string, stringArray, stringArray2);
    }

    public final void c(String string, String[] stringArray, String[] stringArray2) {
        this.i(true);
        this.v.b(string, stringArray, stringArray2);
    }

    public final void a(String string, String[] stringArray, String[] stringArray2) {
        this.i(true);
        oi oi2 = this;
        oi2.v.a();
    }

    public final void a() {
    }

    public final void a(ef ef2, ef[] efArray) {
        this.f(false);
        this.p.a(ef2, efArray);
    }

    public final void a(String string, ef[] efArray) {
        this.i(true);
        this.v.a(string, efArray);
    }

    public final void a(int[] object, long[] object2, short[] objectArray) {
        com.mg.sq.a.s().v();
        short[] sArray = objectArray;
        long[] lArray = object2;
        objectArray = (Object[])object;
        object2 = "Vui lòng chọn VIPICON và thời gian mà bạn muốn mua!";
        object = com.mg.sq.a.s();
        if (sArray == null || sArray.length == 0) {
            object2 = ((ah)object).a("Chú ý", "Chưa có danh sách Vip Icon!", "Đóng", 12350, 1);
            ((ah)object).a((al)object2, false);
            return;
        }
        ((ah)object).a(new gv((String)object2, go.e, (int[])objectArray, lArray, sArray), false);
    }
}
