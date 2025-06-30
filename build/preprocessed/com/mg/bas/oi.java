package com.mg.bas;
// Decompiled with: Procyon 0.6.0

// Class Version: 1
import javax.microedition.lcdui.DateField;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Item;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Form;
import com.mg.smsgame.MGMIDlet;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;

public final class oi extends fb implements bf, bg, bn, bq, dv, CommandListener, r
{
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
    private int C;
    public static long r;
    private boolean D;
    public String[] s;
    public String[] t;
    private eb[] E;
    private long F;
    private br G;
    private eu H;
    private eb I;
    private la J;
    private boolean K;
    private String L;
    private long M;
    private int N;
    
    public static void v() {
        j(false);
    }
    
    private static void j(final boolean b) {
        if (com.mg.bas.v.ah || b) {
            com.mg.bas.p.i();
            pc.c();
            ly.g();
            fo.q();
            oy.b();
            pe.a((pe)null);
        }
        System.gc();
    }
    
    public static void w() {
        com.mg.bas.p.h();
        pc.a();
        pc.b();
        ly.f();
        fo.a();
        try {
            oy.a();
            if (pe.a().a == null) {
                final pe a = pe.a();
                final byte[] q = pd.q();
                final pe pe = a;
                if (q != null) {
                    try {
                        pe.a(ep.a(q));
                    }
                    catch (final Throwable t) {}
                }
            }
        }
        catch (final Throwable t2) {
//            final Throwable t3;
            t2.printStackTrace();
            oy.b();
            pe.a((pe)null);
        }
    }
    
    public oi() {
        super(104, 1, "Bằng Hữu", false);
        this.C = 0;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = false;
        this.L = "";
        this.a(0, 0, com.mg.bas.v.t, com.mg.bas.v.u);
        this.x = new a();
        (this.A = new ay(0)).a(this.c(), this.d(), this.e(), this.f() - 20);
        (this.B = new aw()).a((bn)this);
        this.B.a((bq)this);
        this.B.e(true);
        this.A.b(this.B);
        if (!com.mg.bas.v.z) {
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
        this.a((bf)this);
        com.mg.sq.a.o = false;
    }
    
    public final on z() {
        return this.p;
    }
    
    public final oj A() {
        return this.u;
    }
    
    public final void commandAction(final Command command, final Displayable displayable) {
        if (com.mg.bas.i.a(command.getLabel(), "Xong")) {
            String string = "";
            final ec[] f;
            if ((f = this.I.f()) != null) {
                for (int i = 0; i < f.length; ++i) {
                    string = String.valueOf(string) + " " + ((eq)a(f[i])).a();
                }
            }
            ci.a(String.valueOf(this.I.g()) + string, this.I.d(), (be)null);
            MGMIDlet.d().a((Displayable)ag.a(), true);
        }
        else if (com.mg.bas.i.a(command.getLabel(), "Hủy")) {
            MGMIDlet.d().a((Displayable)ag.a(), true);
        }
        ((Form)displayable).deleteAll();
    }
    
    public final boolean b(final String s) {
        return this.b(s, this.E);
    }
    
    public final boolean b(String upperCase, final eb[] array) {
        if (array == null) {
            return false;
        }
        int i = 0;
        while (i < array.length) {
            final eb j;
            if ((j = array[i]).e().equals(upperCase)) {
                this.I = j;
                if (!com.mg.bas.i.b(upperCase = "FREE") && !(upperCase = upperCase.toUpperCase()).equals("FREE") && !upperCase.equals("MIỄN PHÍ")) {                    final al a;
                    (a = ag.b().a("Chú ý", "Bạn sẽ tốn " + upperCase, "Có", -1006, "Không", 6, 1)).a(this);
                    ag.b().a(a, false);
                    return true;
                }
                this.a(j);
                return true;
            }
            else {
                ++i;
            }
        }
        return false;
    }
    
    public final void a(final eb eb) {
        final String a;
        if ((a = eb.a()).equals("wap")) {
            this.a(null, eb.b(), false);
            return;
        }
        if (a.equals("app")) {
            try {
                du.a().b(Long.parseLong(eb.b()));
                return;
            }
            catch (final Exception ex) {
                return;
            }
        }
        if (a.equals("rss")) {
            this.a(null, "rss://" + eb.b(), false);
            return;
        }
        if (a.equals("call")) {
            MGMIDlet.d();
            MGMIDlet.b(eb.c());
            return;
        }
        if (a.equals("msg") || a.equals("sms")) {
            final Form form = new Form(eb.e());
            final ec[] f;
            if ((f = eb.f()) != null) {
                for (int i = 0; i < f.length; ++i) {
                    form.append(a(f[i]));
                }
            }
            ((Displayable)form).addCommand(new Command("Xong", 4, 1));
            ((Displayable)form).addCommand(new Command("Hủy", 3, 1));
            ((Displayable)form).setCommandListener((CommandListener)this);
            MGMIDlet.d().a((Displayable)form, true);
        }
    }
    
    private void a(final dt[] array, final boolean b) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < this.x.d(); ++j) {
                if (this.k(j).b().equals(array[i].b())) {
                    this.x.a(j);
                    break;
                }
            }
        }
        for (int k = 0; k < array.length; ++k) {
            if (array[k].c() == null) {
                array[k].a(new ds[0]);
            }
            if (b) {
                this.x.b(array[k], 0);
            }
            else {
                this.x.a(array[k]);
            }
        }
        final boolean[] z = new boolean[this.x.d()];
        for (int l = 0; l < z.length; ++l) {
            z[l] = true;
        }
        if (this.z != null) {
            for (int n = (z.length > this.z.length) ? this.z.length : z.length, n2 = 0; n2 < n; ++n2) {
                z[n2] = this.z[n2];
            }
        }
        this.z = z;
        this.M();
        this.N();
    }
    
    private void M() {
        if (gr.c) {
            this.y = this.x;
            return;
        }
        this.y = new a();
        for (int i = 0; i < this.x.d(); ++i) {
            final dt k;
            final ds[] c = (k = this.k(i)).c();
            final dt dt;
            (dt = new dt(k.b())).a(k.a());
            int n = 0;
            for (int j = 0; j < c.length; ++j) {
                if (c[j].e() == 2) {
                    ++n;
                }
            }
            final ds[] array = new ds[n];
            int n2 = 0;
            for (int l = 0; l < c.length; ++l) {
                if (c[l].e() == 2) {
                    array[n2++] = c[l];
                }
            }
            dt.a(array);
            this.y.a(dt);
        }
    }
    
    private void N() {
        final a a = new a(this.y.d());
        for (int i = 0; i < this.y.d(); ++i) {
            final dt dt = (dt)this.y.b(i);
            a.a(dt);
            if (this.z[i]) {
                final ds[] c = dt.c();
                for (int j = 0; j < c.length; ++j) {
                    a.a(c[j]);
                }
            }
        }
        synchronized (this.B) {
            this.B.q();
            for (int k = 0; k < a.d(); ++k) {
                this.B.a(a.b(k));
            }
        }
    }
    
    public final dt[] B() {
        final dt[] array = new dt[this.x.d()];
        for (int i = 0; i < array.length; ++i) {
            array[i] = this.k(i);
        }
        return array;
    }
    
    private dt k(final int n) {
        return (dt)this.x.b(n);
    }
    
    public final void x() {
        this.A.c(true);
    }
    
    public final void y() {
    }
    
    public final void c(final boolean b) {
        super.c(b);
        if (b) {
            this.A.c(true);
        }
    }
    
    public final boolean f(final int n) {
        if (n == 97 || n == 96) {
            return false;
        }
        if (n == 142) {
            final Object t = this.B.t();
            String f = null;
            if (t instanceof ds) {
                f = ((ds)t).f();
            }
            if (!com.mg.bas.i.b(f)) {
                final al a;
                (a = ag.b().a(null, f, "Đóng", 2, 1)).a(ag.b());
                ag.b().a(a, false);
                return true;
            }
        }
        return this.A.f(n);
    }
    
    public final boolean e(final int n, final int n2) {
        return this.A.e(n, n2);
    }
    
    public final boolean c(final int n, final int n2) {
        return this.A.c(n, n2);
    }
    
    public final boolean f(final int n, final int n2) {
        return this.A.f(n, n2);
    }
    
    public final void n() {
        if (this.C > 0) {
            --this.C;
            this.c(true);
        }
        this.A.n();
    }
    
    public final void a(final Graphics graphics, int k, final int n) {
        if ((k = (this.A.k() ? 1 : 0)) != 0) {
            this.c(true);
            graphics.setColor(com.mg.bas.v.am);
            graphics.fillRect(this.c(), this.d(), this.e(), this.f() - 20);
            graphics.drawImage(pc.d, this.c() + this.e(), this.d() + this.f() - ba.a, 40);
        }
        this.A.a(graphics, this.c(), this.d());
    }
    
    public final aq a(final aw aw, int n) {
        final Object i;
        if ((i = aw.i(n)) instanceof ds) {
            return new eu((ds)i, this.B.e());
        }
        for (int j = 0; j < this.y.d(); ++j) {
            final dt dt = (dt)this.y.b(j);
            --n;
            if (this.z[j]) {
                n -= dt.c().length;
            }
            if (n < 0) {
                n = j;
                break;
            }
        }
        return new ev((dt)i, this.z[n], this.B.e());
    }
    
    public final void a(final aq aq) {
        super.a(aq);
        if (aq != null) {
            if (this.u.a()) {
                this.O();
                this.u.A();
            }
            final fc fc;
            if (this.u.v().p != null && super.b != null && !(fc = (fc)this.l()).b(this.u.v())) {
                fc.c(this.u.v());
            }
        }
    }
    
    private void O() {
        if (super.b == null) {
            return;
        }
        final fc fc;
        if (!(fc = (fc)this.l()).b(this.u)) {
            fc.c(this.u);
        }
    }
    
    private void a(final ds ds, final boolean b, final boolean b2) {
        this.O();
        this.u.a(ds, b, b2);
    }
    
    private ds a(String lowerCase, final boolean b) {
        if (lowerCase == null) {
            return null;
        }
        lowerCase = lowerCase.toLowerCase();
        ds ds;
        if ((ds = this.d(lowerCase)) != null) {
            this.a(ds, false, b);
        }
        else {
            ds = e(lowerCase);
            this.a(ds, true, b);
        }
        return ds;
    }
    
    public final ds c(final String s) {
        return this.a(s, true);
    }
    
    public final void a(final String s, final long n) {
        this.f(true);
        this.p.a(s, 0L);
    }
    
    private ds d(final String s) {
        for (int i = 0; i < this.x.d(); ++i) {
            final ds[] c;
            if ((c = this.k(i).c()) != null) {
                for (int j = 0; j < c.length; ++j) {
                    if (c[j].a().equals(s)) {
                        return c[j];
                    }
                }
            }
        }
        return null;
    }
    
    public final void b(final aq aq, final int n) {
        final Object i;
        if ((i = this.B.i(n)) instanceof ds) {
            final eu h = (eu)this.B.o(n);
            this.H = h;
            final bs bs = new bs();
            String[] array;
            int[] array2;
            if (h.i.a().length() < 3) {
                array = new String[] { "Chat!" };
                array2 = new int[] { 10400 };
            }
            else {
                array = new String[] { "Chat!", "Xem ME" };
                array2 = new int[] { 10400, 10401 };
            }
            final int f = h.j.f(3);
            final int f2 = h.j.f(1);
            String s = null;
            final String a;
            if (f2 >= 0 && (a = lo.a(((lo)h.j.a(f2)).i)) != null) {
                s = a;
            }
            if (f >= 0 && f2 >= 0 && !com.mg.bas.i.b(s)) {
                final String[] array3 = new String[array.length + 2];
                final int[] array4 = new int[array2.length + 2];
                System.arraycopy(array, 0, array3, 0, array.length);
                System.arraycopy(array2, 0, array4, 0, array2.length);
                array3[array3.length - 2] = "Xem tin";
                array4[array4.length - 2] = 10420;
                array3[array3.length - 1] = s;
                array4[array4.length - 1] = 10421;
                array = array3;
                array2 = array4;
            }
            else {
                if (f >= 0) {
                    final String[] array5 = new String[array.length + 1];
                    final int[] array6 = new int[array2.length + 1];
                    System.arraycopy(array, 0, array5, 0, array.length);
                    System.arraycopy(array2, 0, array6, 0, array2.length);
                    array5[array5.length - 1] = "Xem tin";
                    array6[array6.length - 1] = 10420;
                    array = array5;
                    array2 = array6;
                }
                if (f2 >= 0 && !com.mg.bas.i.b(s)) {
                    final String[] array7 = new String[array.length + 1];
                    final int[] array8 = new int[array2.length + 1];
                    System.arraycopy(array, 0, array7, 0, array.length);
                    System.arraycopy(array2, 0, array8, 0, array2.length);
                    array7[array7.length - 1] = s;
                    array8[array8.length - 1] = 10421;
                    array = array7;
                    array2 = array8;
                }
            }
            final boolean b;
            if ((b = (h.i.g() != null && h.i.g().equals("patriot"))) && !h.i.a().equals(go.e) && this.l() instanceof fc && ((fc)this.l()).i(100)) {
                final ol ol;
                if ((ol = (ol)((fc)this.l()).h(100)) != null && ol.p != null && ol.p.b() == 2) {
                    final String[] array9 = new String[array.length + 1];
                    final int[] array10 = new int[array2.length + 1];
                    System.arraycopy(array, 1, array9, 2, array.length - 1);
                    System.arraycopy(array2, 1, array10, 2, array2.length - 1);
                    array9[0] = array[0];
                    array10[0] = array2[0];
                    array9[1] = "Xem thông tin";
                    array10[1] = 10424;
                    array = array9;
                    array2 = array10;
                }
                else {
                    final String[] array11 = new String[array.length + 3];
                    final int[] array12 = new int[array2.length + 3];
                    System.arraycopy(array, 1, array11, 4, array.length - 1);
                    System.arraycopy(array2, 1, array12, 4, array2.length - 1);
                    array11[0] = array[0];
                    array12[0] = array2[0];
                    array11[1] = "Khiêu Chiến";
                    array12[1] = 10422;
                    array11[2] = "Giao dịch";
                    array12[2] = 10423;
                    array11[3] = "Xem thông tin";
                    array12[3] = 10424;
                    array = array11;
                    array2 = array12;
                }
            }
            boolean b2;
            if (array.length < 2) {
                b2 = false;
            }
            else {
                final br[] array13 = new br[array.length];
                for (int j = 0; j < array.length; ++j) {
                    array13[j] = new br(array[j], array2[j]);
                }
                bs.a(array13);
                final aq o = this.B.o(this.B.s());
                final k r = this.A.r();
                final int n2 = (com.mg.bas.v.t - bs.e()) / 2;
                int n3;
                if ((n3 = this.A.d() + o.d() - r.b) + bs.f() > com.mg.bas.v.u - ba.a) {
                    n3 = com.mg.bas.v.u - ba.a - bs.f();
                }
                bs.a_(com.mg.bas.v.t + bs.e(), n3);
                bs.d(n2, n3);
                bs.a((bg)this);
                bs.a(new gb(1, 2));
                bs.b(new gb(2, 3));
                bs.c(new ge());
                bs.a_(1);
                this.a(bs);
                b2 = true;
            }
            if (!b2) {
                this.a((ds)i, false, true);
            }
        }
        else {
            for (int k = 0; k < this.y.d(); ++k) {
                if (i.equals(this.y.b(k)) && k <= this.z.length) {
                    this.z[k] = !this.z[k];
                    this.N();
                    this.B.k(n);
                    this.P();
                    return;
                }
            }
        }
    }
    
    private void P() {
        int b = this.A.r().b;
        final int s;
        if ((s = this.B.s()) * 22 - b >= this.B.f() - 40 - 22) {
            b = s * 22 - (this.B.f() - 40 - 22);
        }
        this.A.k(b);
    }
    
    public final void a(final aq aq, final int n) {
    }
    
    public final void a(final aq aq, final int n, final int n2) {
    }
    
    public final void a(final int n) {
        ks.h += n;
    }
    
    public final void b(final int n) {
        ks.h += n;
    }
    
    public final void a(final dt[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                final ds[] c;
                if (array[i].a() == 1 && (c = array[i].c()) != null) {
                    for (int j = 0; j < c.length; ++j) {
                        c[j].b((short)0);
                    }
                }
            }
            this.a(array, true);
        }
    }
    
    public final void a(final dt[] array, int i) {
        if (array == null) {
            return;
        }
        if (this.x != null) {
            for (int j = this.x.d() - 1; j >= 0; --j) {
                if (((dt)this.x.b(j)).a() != 1) {
                    this.x.a(j);
                }
            }
        }
        if (gr.h) {
            pd.a(array, i);
            go.d = i;
        }
        this.a(array, false);
        final String[] t;
        if ((t = pd.t()) != null) {
            for (i = 0; i < t.length; ++i) {
                this.a(t[i], false);
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
        if (!this.K && super.b != null) {
            this.K = true;
            du.a().j();
        }
    }
    
    public static br[] a(final eb[] array) {
        final br[] array2 = new br[array.length];
        for (int i = 0; i < array2.length; ++i) {
            (array2[i] = new br(array[i].e(), 11399)).a(array[i]);
        }
        return array2;
    }
    
    public final br[] a(final br[] array, final int n) {
        if (array == null || this.G == null) {
            return array;
        }
        final br[] array2 = new br[array.length + 1];
        System.arraycopy(array, 0, array2, 0, n);
        array2[n] = this.G;
        System.arraycopy(array, n, array2, n + 1, array.length - n);
        return array2;
    }
    
    public final boolean j(final int n) {
        if (n == 99031) {
            this.g(true);
            return true;
        }
        if (n == 99009) {
            this.h(true);
            return true;
        }
        if (n == 99017) {
            this.E();
            return true;
        }
        if (n == 99012) {
            MGMIDlet.d();
            MGMIDlet.b("1900588883");
            return true;
        }
        if (n == 99011) {
            com.mg.sq.a.F();
            return true;
        }
        if (n == 99008) {
            this.F();
            return true;
        }
        if (n == 99007) {
            com.mg.sq.a.D();
            return true;
        }
        return false;
    }
    
    public static br[] b(final br[] array, final int n) {
        final br[] array2 = new br[array.length + 1];
        final br br = new br("Giới thiệu", 99007);
        if (!com.mg.sq.a.o) {
            System.arraycopy(array, 0, array2, 0, n);
            array2[n] = br;
            System.arraycopy(array, n, array2, n + 1, array.length - n);
            return array2;
        }
        final br br2;
        (br2 = new br("Hỗ trợ", 99001)).a(new br[] { br, new br("Hướng dẫn", 99008), new br("Thông Tin #12", 99031), new br("Thảo luận #SQ", 99009), new br("Rao vặt #sqgd", 99017), new br("Hỗ trợ", 99012), new br("Cài đặt", 99011) });
        System.arraycopy(array, 0, array2, 0, n);
        array2[n] = br2;
        System.arraycopy(array, n, array2, n + 1, array.length - n);
        return array2;
    }
    
    public final void a(final String s, final String s2) {
        if (this.u.a(s, s2, 0) == null) {
            this.a(s, true).d("patriot");
            this.u.a(s, s2, 0);
        }
        du.a().a(s, s2, null);
    }
    
    public final void a(final ef ef, final short n) {
        boolean b = false;
        final an d;
        if ((d = ag.b().d()) != null && d.h() == 1) {
            final oa oa2;
            final oa oa;
            ol k;
            if ((((oa = (oa2 = (oa)d)).k != null) ? (((k = oa.k).p != null && k.p.b() == 2) ? ((oq)k.p).s() : "") : "").equals(ef.b())) {
                final oa oa3 = oa2;
                final String c = ef.c();
                final oa oa4 = oa3;
                if (oa3.k != null) {
                    final ol i = oa4.k;
                    final String s = c;
                    final ol ol = i;
                    if (i.p != null && ol.p.b() == 2) {
                        ((oq)ol.p).a(s);
                    }
                }
                b = true;
            }
        }
        else if (System.currentTimeMillis() - this.F >= 15000L && ef.c().equals(gs.f)) {
            this.F = System.currentTimeMillis();
            ag.a().a(50);
            ag.a().b(100);
        }
        this.O();
        di di;
        if ((di = this.u.b(ef.b(), ef.c(), ef.f())) == null) {
            ds ds;
            boolean b2;
            if ((ds = this.d(ef.b())) == null) {
                ds = e(ef.b());
                b2 = true;
            }
            else {
                b2 = false;
            }
            di = this.u.a(ds, ef.c(), ef.f(), b2);
        }
        if (!b && n != 2 && di != null) {
            di.a = true;
            if (super.b != null) {
                final fc fc = (fc)this.l();
                if (this.u.v().p != null && this.u.v().p.equals(di) && fc.q().equals(this.u.v())) {
                    di.a = false;
                    return;
                }
            }
            if (di.a) {
                this.u.A();
            }
        }
    }
    
    public final void D() {
        if (super.b == null) {
            return;
        }
        ((fc)this.l()).d(this.q);
    }
    
    private void k(final boolean b) {
        if (super.b == null) {
            return;
        }
        final fc fc;
        if (!(fc = (fc)this.l()).b(this.w)) {
            fc.c(this.w);
        }
        if (b) {
            fc.a((fb)this.w);
        }
    }
    
    public final void e(final boolean b) {
        if (super.b == null) {
            return;
        }
        final fc fc;
        if (!(fc = (fc)this.l()).b(this.q)) {
            fc.c(this.q);
        }
        fc.a((fb)this.q);
    }
    
    public final void f(final boolean b) {
        if (super.b == null) {
            return;
        }
        final fc fc;
        if (!(fc = (fc)this.l()).b(this.p)) {
            fc.c(this.p);
        }
        if (b) {
            fc.a((fb)this.p);
        }
    }
    
    public final void a(final String s, final String s2, final boolean b) {
        if (s2.toLowerCase().indexOf("rss://") == 0) {
            this.v.a(s2.substring(6));
            return;
        }
        if (b) {
            com.mg.sq.a.s().a("Đang kiểm tra đường dẫn...", (il)null);
            du.a().c(s2, s);
            return;
        }
        try {
            MGMIDlet.d().platformRequest(s2);
        }
        catch (final ConnectionNotFoundException ex) {
//            final Throwable t;
            ex.printStackTrace();
        }
    }
    
    public final void b(final String s, final String s2) {
        this.a(s, s2, true);
    }
    
    public final void E() {
        this.p.a("#sqgd", 0L);
        this.f(true);
    }
    
    public final void g(final boolean b) {
        this.p.a("#12", 0L);
        this.f(b);
    }
    
    public final void h(final boolean b) {
        this.p.a("#sq", 0L);
        this.f(true);
    }
    
    public final void F() {
        this.a(null, "rss://faq/sq", true);
        this.i(true);
    }
    
    public final void i(final boolean b) {
        if (super.b == null) {
            return;
        }
        final fc fc;
        if (!(fc = (fc)this.l()).b(this.v)) {
            fc.c(this.v);
        }
        if (b) {
            fc.a((fb)this.v);
        }
    }
    
    private static ds e(String lowerCase) {
        if (lowerCase == null) {
            return null;
        }
        lowerCase = lowerCase.toLowerCase();
        final ds ds;
        (ds = new ds()).a(lowerCase);
        ds.b(lowerCase);
        ds.a((short)(-13));
        return ds;
    }
    
    public final void a(final ds[] array) {
        if (this.u.a()) {
            this.O();
        }
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < this.x.d(); ++j) {
                final ds[] c;
                if ((c = this.k(j).c()) != null) {
                    boolean b = false;
                    for (int k = 0; k < c.length; ++k) {
                        if (c[k].a().equals(array[i].a())) {
                            if (array[i].e() == 2) {
                                c[k].c(array[i].f());
                                c[k].a(array[i].c());
                                c[k].b(array[i].d());
                            }
                            ef ef = null;
                            if (array[i].e() != c[k].e() && this.u.a(c[k].a()) >= 0) {
                                (ef = new ef()).a(System.currentTimeMillis());
                                ef.a(c[k].a());
                                String s = c[k].a();
                                if (!com.mg.bas.i.b(c[k].b())) {
                                    s = c[k].b();
                                }
                                if (array[i].e() == 2) {
                                    ef.b("[" + s + " đã đăng nhập trở lại]");
                                }
                                else {
                                    ef.b("[" + s + " đã đăng xuất]");
                                }
                            }
                            c[k].d(array[i].g());
                            c[k].c(array[i].e());
                            this.u.a(c[k]);
                            if (ef != null) {
                                this.a(ef, (short)2);
                            }
                            b = true;
                            break;
                        }
                    }
                    if (b) {
                        this.k(j).d();
                        break;
                    }
                }
            }
        }
        int s2 = this.B.s();
        this.M();
        this.N();
        this.C = 1;
        if (s2 >= this.B.a()) {
            s2 = this.B.a() - 1;
        }
        this.B.k(s2);
        this.P();
    }
    
    public final void a(final ef[] array, final short n) {
        if (array != null) {
            this.O();
            if (super.b != null) {
                ((fc)this.l()).e(this.u);
            }
            for (int i = 0; i < array.length; ++i) {
                array[i].b("(" + com.mg.bas.i.b(array[i].d()) + "): " + ((array[i].c() == null) ? "" : array[i].c()));
                this.a(array[i], n);
            }
        }
    }
    
    public final void G() {
        if (com.mg.sq.a.o && gr.i) {
            pd.b(this.u.w());
        }
        com.mg.sq.a.o = false;
        du.a().a((dv)null);
        final aq l;
        if ((l = this.l()) != null) {
            final fc fc;
            (fc = (fc)l).d(this);
            fc.d(this.u);
            fc.d(this.v);
            fc.d(this.p);
            fc.d(this.q);
            fc.d(this.w);
            fc.d(this.u.v());
        }
        this.u = null;
        this.v = null;
        this.p = null;
        this.q = null;
        this.w = null;
        this.u = null;
        du.a().c();
        j(true);
        com.mg.sq.a.m = null;
        System.gc();
        ct.b("Logged out OLA");
    }
    
    public final void a(final ds[] array, final String s) {
        while (true) {
            for (int i = 0; i < this.x.d(); ++i) {
                final dt k;
                if ((k = this.k(i)).b().equals(s)) {
                    final dt dt = k;
                    dt dt2 = dt;
                    for (int j = 0; j < array.length; ++j) {
                        final ds ds = array[j];
                        if (dt2 == null) {
                            dt2 = new dt(s);
                            this.a(new dt[] { dt2 }, false);
                            this.a(ds, s, dt2);
                        }
                        else {
                            this.a(ds, s, dt2);
                            this.M();
                            this.N();
                        }
                    }
                    return;
                }
            }
            final dt dt = null;
            continue;
        }
    }
    
    private void a(final ds ds, final String s, final dt dt) {
        ds.b((short)0);
        for (int i = 0; i < this.x.d(); ++i) {
            final dt k;
            if ((k = this.k(i)).b().compareTo(s) == 0) {
                ds[] array;
                if (k.c() != null) {
                    array = new ds[k.c().length + 1];
                    int j;
                    for (j = 0; j < k.c().length; ++j) {
                        array[j] = k.c()[j];
                    }
                    array[j] = ds;
                }
                else {
                    final ds[] array2 = array = new ds[] { null };
                    array2[0] = ds;
                }
                dt.a(array);
                return;
            }
        }
    }
    
    public static void c(final String s, final String s2) {
        du.a().a(s, s2);
    }
    
    public final void H() {
        if (com.mg.sq.a.o) {
            return;
        }
        if (!this.D && System.currentTimeMillis() - oi.r > 120000L) {
            this.D = true;
            this.a(1, null, (short)0);
        }
    }
    
    public final void a(final int n, int n2, final Object o) {
        if (o == null) {
            return;
        }
        final br br = (br)o;
        this.t();
        switch (n2) {
            case 10400: {
                this.a(this.H.i, false, true);
                return;
            }
            case 10401: {
                this.p.a(this.H.i.a(), 0L);
                this.f(true);
                return;
            }
            case 10408: {
                du.a().b((short)2412);
                com.mg.sq.a.s().a(null, (il)null);
                return;
            }
            case 10409: {
                final al a;
                (a = ag.b().a("Chú ý", "Bạn muốn thoát hệ thống chat", "Có", 5, "Không", 6, 1)).a(this);
                ag.b().a(a, false);
                return;
            }
            case 10410: {
                this.f(true);
                return;
            }
            case 10411: {
                this.i(true);
                if (super.b != null) {
                    ((fc)super.b).a((fb)this.v);
                }
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
                gr.c = !gr.c;
                this.J();
                cs.a.b(133, gr.c ? new byte[] { 0 } : new byte[] { 1 });
                return;
            }
            case 10418: {
                final ah b = ag.b();
                final he a2;
                final ff ff;
                if ((ff = (ff)(a2 = com.mg.sq.a.a("Nhập thông điệp mới", null, "Đổi", 3, "Hủy", 4, this)).e(1)) != null) {
                    ff.e(true);
                }
                a2.a((bf)this);
                a2.b(-9999991);
                b.a(a2);
                return;
            }
            
            case 10419: {
                final ah b2 = ag.b();
                final he a3;
                (a3 = com.mg.sq.a.a("Nhập nick muốn chat", null, "Xong", 7, "Hủy", 8, this)).a((bf)this);
                a3.b(-9999992);
                b2.a(a3, false);
                return;
            }
            case 0: {
                com.mg.sq.a.s().C();
                return;
            }
            case 10420: {
                final String h;
                if ((h = this.H.j.i()) != null) {
                    this.a(this.H.i.a(), h, true);
                }
                return;
            }
            case 10421: {
                if (!br.b().equals("Xem Ảnh")) {
                    com.mg.sq.a.s().C();
                    return;
                }
                final String g;
                if ((g = this.H.j.i()) != null) {
                    final oo q = this.q;
                    final String s = g;
                    n2 = 1;
                    final String trim;
                    q.a(((trim = s.trim()) == null || trim.length() <= 2) ? trim : trim.substring(2, trim.length() - 1));
                }
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
                com.mg.sq.a.s().b(this.H.i.a(), super.i);
                return;
            }
            case 11399: {
                this.b(br.b());
                break;
            }
        }
        if (!com.mg.sq.a.s().m(n2)) {
            this.j(n2);
        }
    }
    
    public final void d(final int n, final int n2) {
        switch (n2) {
            case -1007: {
                pd.e(go.c);
                ag.b().a(false);
                com.mg.sq.a.s().a(null, (il)null);
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
                final bs bs;
                (bs = new bs()).a(new gb(1, 2));
                bs.b(new gb(2, 3));
                br br = null;
                if (com.mg.sq.a.m != null && com.mg.sq.a.o) {
                    (br = new br("Nạp KEN", 99003)).a(new br[] { new br("Nhắn tin", 99004), new br("Thẻ cào ĐT", 99005), new br("DS điện thoại", 99006) });
                }
                final br br2 = new br("Thao tác", 10407);
                final br br3 = new br("Tính năng", 10406);
                final br br4 = new br("Đóng", 10409);
                final br br5 = new br("Mua vip", 10408);
                br[] array;
                if (com.mg.sq.a.o) {
                    array = b(new br[] { br3, br2, br, br5, br4 }, 3);
                }
                else {
                    array = b(new br[] { br3, br2, br4 }, 2);
                }
                br3.a(new br[] { new br("Ola Me", 10410), new br("Báo online", 10411), new br("Media", 10412), new br("Kho Game", 10413) });
                br br6;
                if (gr.d) {
                    br6 = new br("Ẩn Nick", 10414);
                }
                else {
                    br6 = new br("Hiện Nick", 10415);
                }
                br br7;
                if (gr.c) {
                    br7 = new br("Chỉ hiện Online", 10416);
                }
                else {
                    br7 = new br("Hiện Offline", 10417);
                }
                br2.a(new br[] { br6, br7, new br("Đổi thông điệp", 10418), new br("Chat với", 10419), new br("Khoe Nhân Vật", 0) });
                bs.a(this.a(array, 2));
                bs.a((bg)this);
                bs.a_(-bs.e(), this.f());
                bs.d(0, this.f() - ba.a - bs.f());
                this.a(bs);
                return;
            }
            case -2: {
                if (super.b != null) {
                    ((fc)super.b).a();
                    return;
                }
                break;
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
                super.l.f(95);
                return;
            }
            case 2: {
                this.t();
                return;
            }
            case 3: {
                final String k = com.mg.sq.a.k(-9999991);
                gr.d = true;
                f((k == null) ? "" : k);
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
                final String i;
                if (!com.mg.bas.i.b(i = com.mg.sq.a.k(-9999992))) {
                    this.a(i, true);
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
                break;
            }
        }
    }
    
    private static void f(String p) {
        if (p == null) {
            p = pd.p();
        }
        else if (gr.g) {
            pd.a(p);
        }
        if (p == null) {
            p = "Đang chơi game 12 Sứ Quân Online! http://sq.ola.vn";
        }
        else if (p.length() <= 0) {
            du.a().a((short)2);
            return;
        }
        du.a().c(p);
    }
    
    public final void I() {
        if (gr.d) {
            od.f();
            f(null);
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
    
    public final void a(final String s) {
        com.mg.sq.a.s().v();
        try {
            MGMIDlet.d().platformRequest(s);
        }
        catch (final ConnectionNotFoundException ex) {
//            final Throwable t;
            ex.printStackTrace();
        }
    }
    
    public final void a(final int n, final dq[] array) {
        this.J = new la(n, array);
    }
    
    public final dq K() {
        if (this.J == null) {
            return null;
        }
        return this.J.a();
    }
    
    public final void a(final ea[] array) {
        this.w.a(array);
    }
    
    public final void a(final String s, final String s2, final ee[] array, final eb[] array2) {
        if (super.b == null) {
            return;
        }
        ag.b().a(new hk(s, s2, array, array2), false);
        com.mg.sq.a.s().v();
    }
    
    public final void a(final long n, final ea[] array) {
        final ok w;
        if ((w = this.w).q == null || array == null) {
            com.mg.sq.a.s().v();
            return;
        }
        for (int i = 0; i < w.q.length; ++i) {
            if (w.q[i].k == n) {
                w.q[i].i = true;
                int length = 0;
                if (w.r[i] != null) {
                    length = w.r[i].length;
                    final fa[] array2 = new fa[w.r[i].length + array.length];
                    System.arraycopy(w.r[i], 0, array2, 0, w.r[i].length);
                    w.r[i] = array2;
                }
                else {
                    w.r[i] = new fa[array.length];
                }
                for (int j = 0; j < array.length; ++j) {
                    w.r[i][length + j] = new fa(false, array[j].c(), array[j].a(), "Bấm vào để xem", 0, w.p.e());
                }
            }
        }
        w.a();
        com.mg.sq.a.s().v();
    }
    
    public final void a(final String l, final long m, final int n) {
        this.M = m;
        this.L = l;
        this.N = n;
        if (super.b != null) {
            this.L();
        }
    }
    
    public final void L() {
        if (go.c < this.N) {
            go.c = this.N;
            final al a;
            (a = ag.b().a("Thông tin", "Vừa ra mắt: " + this.L, "Chơi thử", -1007, "Đóng", 6, 1)).a(this);
            ag.b().a(a, false);
        }
    }
    
    public final void a(String[] array) {
        com.mg.sq.a.s().v();
        if (array == null) {
            array = new String[0];
        }
        com.mg.sq.a.e(array);
    }
    
    public final void a(final int n, String s, final short n2) {
        s = (com.mg.bas.i.b(s) ? " - Lỗi không xác định." : s);
        if (n == 1 || n == 7) {
            if (n == 7) {
                return;
            }
        }
        else {
            com.mg.sq.a.s().v();
            if (super.b == null) {
                return;
            }
            if (n == 34 || n == 27 || n == 26 || n == 35) {
                if (n == 35 && n2 == (short)this.q.i) {
                    du.a().l();
                    com.mg.sq.a.s().b().b(null);
                }
                s = "Nội dung không tồn tại hoặc đã hết";
            }
            else if (n == 8) {
                com.mg.sq.a.s().v();
            }
            else if (n == 24) {
                s = "Không được thực hiện cùng 1 hành động quá nhanh!";
            }
            else if (n == 38) {
                final com.mg.sq.a s2 = com.mg.sq.a.s();
                final String e = go.e;
                s = "Chức năng cần có VIP. Bạn có muốn mua VIP không?";
                final com.mg.sq.a a = s2;
                final al a2;
                (a2 = s2.a("Chú ý", s, "Có", 12358, "Đóng", 12350, 1)).a(a);
                a.a(a2, false);
                return;
            }
            com.mg.sq.a.s().a(s);
        }
    }
    
    private static Item a(final ec ec) {
        ct.a("[BuddyListTab] createItem(...)  " + ec.a + "  " + ec.b);
        Object o = null;
        switch (ec.a) {
            case 4: {
                o = new er(ec.b, 2, ec.d, null, ec.e);
                break;
            }
            case 6: {
                o = new er(ec.b, 4, ec.d, null, ec.e);
                break;
            }
            case 5: {
                o = new er(ec.b, 1, ec.d, null, ec.e);
                break;
            }
            case 3: {
                o = new es(ec.b, "", 20, 3);
                break;
            }
            case 1: {
                o = new es(ec.b, "", 20, 0);
                break;
            }
            case 2: {
                o = new es(ec.b, "", 20, 2);
                break;
            }
            case 10: {
                o = new es(ec.b, ec.c, 20, 131072);
                break;
            }
            case 8: {
                o = new DateField(ec.b, 3);
                break;
            }
            case 7: {
                o = new DateField(ec.b, 1);
                break;
            }
            case 9: {
                o = new DateField(ec.b, 2);
                break;
            }
        }
        return (Item)o;
    }
    
    public final void a(final String[] s, final String[] t) {
        this.t = t;
        this.s = s;
    }
    
    public final void a(final String s, final short n, final ef[] array) {
        this.f(false);
        this.p.a(s, n, array);
    }
    
    public final void a(final String s, final String s2, final String[] array, final String[] array2) {
        com.mg.sq.a.s().v();
        com.mg.sq.a.a(s, s2, array, array2);
    }
    
    public final void a(final ee ee) {
        com.mg.sq.a.s().b().b(null);
        pd.a(ee.h, ee.a());
        this.q.a(ee);
    }
    
    public final void a(final int n, final int n2) {
        com.mg.sq.a.s().b().b(new li(n, n2));
    }
    
    public final void a(final int b, final ep[] array, final byte[] array2) {
        if (go.b >= b) {
            return;
        }
        pd.b(array2);
        pd.f(b);
        pe.a().a(array);
        go.b = b;
    }
    
    public final void c_() {
        final al a;
        (a = ag.b().a("Chú ý", "File khác đang được tải. Bạn có muốn tải file khác không?", "Có", -1002, "Không", -1003, 1)).a(this);
        ag.b().a(a, false);
    }
    
    public final void d_() {
        final al a;
        (a = ag.b().a("Chú ý", "File có kích thước lớn. Bạn có chắc muốn tải về không?", "Có", -1004, "Không", -1005, 1)).a(this);
        ag.b().a(a, false);
    }
    
    public final void e_() {
        com.mg.sq.a.s().b().b(null);
        final al a;
        (a = ag.b().a("Thông tin", "Không đủ bộ nhớ để tải file", "Đóng", -1003, 1)).a(this);
        ag.b().a(a, false);
    }

    public final void a(final short n, final long n2, final long n3) {
        final al a;
        (a = ag.b().a("", "Bạn vừa mua thành công VIP " + pe.a().c(n) + ". Với giá: " + com.mg.sq.a.b(n3) + ". Bạn còn " + com.mg.bas.i.a(n2 / 86400000L, ".") + " ngày sử dụng", "Đóng", -1003, 1)).a(this);
        ag.b().a(a);
    }
    
    public final void a(final String s, final short n, final long n2) {
        final al a;
        (a = ag.b().a("", "Bạn vừa nhận đươc VIP " + pe.a().c(n) + " với " + n2 + " ngày sử dụng từ " + s, "Đóng", -1003, 1)).a(this);
        ag.b().a(a);
    }
    
    public final void a(final String s, final eb[] e) {
        this.E = e;
        this.G = new br(s, 0);
        if (this.E != null) {
            this.G.a(a(this.E));
        }
    }
    
    public final void f_() {
        this.G();
        final al a;
        (a = ag.b().a("Thông tin", "Hệ thống chat Ola của bạn đã bị đăng nhập bởi một người khác hoặc thiết bị khác!", "Đóng", 2, 1)).a(ag.b());
        ag.b().a(a, false);
    }
    
    public final void g_() {
        com.mg.sq.a.o = true;
        pd.b(go.e);
        final dt[] u;
        if ((u = pd.u()) != null) {
            this.a(u, false);
        }
        final String[] t;
        if ((t = pd.t()) != null) {
            for (int i = 0; i < t.length; ++i) {
                this.a(t[i], false);
            }
        }
        du.a().i();
        du.a().a(go.d);
        du.a().s();
        du.a().q();
        du.a().r();
        du.a().b(go.b);
        if (gr.d) {
            String p;
            if ((p = pd.p()) == null) {
                p = "Đang chơi game 12 Sứ Quân Online! http://sq.ola.vn";
            }
            du.a().c(p);
        }
        final an d = ag.b().d();
        if (super.b != null) {
            this.C();
            return;
        }
        if (d != null && d.h() == 1) {
            ((oa)d).e();
        }
    }
    
    public final void h_() {
        final dz dz;
        (dz = new dz()).b = "vn";
        dz.e = com.mg.bas.v.t;
        dz.f = com.mg.bas.v.u;
        dz.g = 0;
        final String l = ci.l;
        dz.c = "123456789";
        dz.d = "patriot";
        final String property = System.getProperty("microedition.platform");
        dz.a = ((property == null) ? " " : property);
        du.a().a(go.e, go.f, (short)(gr.d ? 2 : 1));
    }
    
    public final void i_() {
        du.a().l();
    }
    
    public final void a(final String s, final ee ee) {
        final ef ef;
        (ef = new ef()).b("#" + ee.a() + "#");
        ef.a(s);
        ef.a(ee.d);
        this.a(ef, (short)0);
    }
    
    public final void b(final String s, final String[] array, final String[] array2) {
        this.i(true);
        this.v.a(s, array, array2);
    }
    
    public final void c(final String s, final String[] array, final String[] array2) {
        this.i(true);
        this.v.b(s, array, array2);
    }
    
    public final void a(final String s, final String[] array, final String[] array2) {
        this.i(true);
        final ot v = this.v;
        ot.a();
    }
    
    public final void a() {
    }
    
    public final void a(final ef ef, final ef[] array) {
        this.f(false);
        this.p.a(ef, array);
    }
    
    public final void a(final String s, final ef[] array) {
        this.i(true);
        this.v.a(s, array);
    }
    
    public final void a(final int[] array, final long[] array2, final short[] array3) {
        com.mg.sq.a.s().v();
        final com.mg.sq.a s = com.mg.sq.a.s();
        final String s2 = "Vui lòng chọn VIPICON và thời gian mà bạn muốn mua!";
        final com.mg.sq.a a = s;
        if (array3 == null || array3.length == 0) {
            a.a(a.a("Chú ý", "Chưa có danh sách Vip Icon!", "Đóng", 12350, 1), false);
            return;
        }
        a.a(new gv(s2, go.e, array, array2, array3), false);
    }
}
