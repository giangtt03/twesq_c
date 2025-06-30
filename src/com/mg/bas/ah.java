package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// Abstract base class for game scenes or UI screens, manages state, rendering, and transitions. Implements bf and r.
import com.mg.smsgame.MGMIDlet;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public abstract class ah
implements bf,
r {
    private static final int[] g;
    private static final int[] h;
    private boolean i = false;
    private final a j;
    protected an a;
    private final a k = new a(8);
    protected al b;
    private al l;
    private ad m;
    private aa n;
    public aa c;
    public aa d;
    private ak o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean flagS;
    private Object[] t;
    private int u;
    private int vValue;
    private int w;
    al e = null;
    protected ax f;
    private boolean x = false;
    private static final cb y;
    private boolean z;

    static {
        int[] nArray = new int[5];
        nArray[0] = -2;
        nArray[1] = 2;
        g = nArray;
        int[] nArray2 = new int[5];
        nArray2[2] = 2;
        nArray2[3] = -2;
        h = nArray2;
        y = new cb();
    }

    public ah() {
        this.j = new a(4);
        s.a().a(6);
        this.p();
    }

    public final ax b() {
        return this.f;
    }

    public final void a(ax ax2) {
        this.f = ax2;
    }

    public final void c() {
        this.x = false;
    }

    public final void a(ak ak2) {
        this.o = ak2;
    }

    public final an d() {
        return this.a;
    }

    public final al e() {
        return this.b;
    }

    public final void f() {
        if (this.b != null) {
            this.b.e(true);
            return;
        }
        if (this.a != null) {
            this.a.e(true);
        }
    }

    public static void g() {
    }

    final void a(int n) {
        if (this.i || this.flagS) {
            return;
        }
        if (this.b != null) {
            if (!this.b.k()) {
                int n2 = n;
                v.c[n2] = v.c[n2] + 1;
                this.b.c(n);
            }
            return;
        }
        if (this.a != null && !this.a.k()) {
            int n3 = n;
            v.c[n3] = v.c[n3] + 1;
            this.a.c(n);
        }
    }

    final void b(int n) {
        if (this.i || this.flagS) {
            return;
        }
        if (this.b != null) {
            if (!this.b.k()) {
                v.c[n] = 0;
                this.b.d(n);
            }
            return;
        }
        if (this.a != null && !this.a.k()) {
            v.c[n] = 0;
            this.a.d(n);
        }
    }

    final void a(int n, int n2) {
        if (this.i || this.flagS) {
            return;
        }
        v.A = n;
        v.B = n2;
    }

    final void b(int n, int n2) {
        if (this.i || this.flagS) {
            return;
        }
        v.C = n;
        v.D = n2;
    }

    final void c(int n, int n2) {
        if (this.i || this.flagS) {
            return;
        }
        if (v.E < 0) {
            v.E = n;
        }
        if (v.F < 0) {
            v.F = n2;
        }
    }

    protected void h() {
    }

    final void i() {
        block13: {
            an an2;
            al al2;
            Object object;
            block12: {
                block11: {
                    this.h();
                    object = this;
                    if (((ah)object).f != null) {
                        ((ah)object).f.i();
                    }
                    if (((ah)object).u > 0) {
                        --((ah)object).u;
                        int n = ((ah)object).u % 5;
                        ((ah)object).vValue = g[n];
                        ((ah)object).w = h[n];
                        if (((ah)object).u == 0) {
                            ((ah)object).w = 0;
                            ((ah)object).vValue = 0;
                        }
                    }
                    al2 = ((ah)object).b;
                    an2 = ((ah)object).a;
                    if (((ah)object).flagS) break block11;
                    if (((ah)object).n == null) break block12;
                    ((ah)object).m = null;
                    ((ah)object).n.b();
                    if (((ah)object).n.a()) {
                        ((ah)object).n = null;
                        ((ah)object).l = null;
                        ((ah)object).i = false;
                        if (al2 != null) {
                            al2.i(false);
                        }
                    }
                    break block13;
                }
                ((ah)object).o.b_();
                break block13;
            }
            if (((ah)object).m != null) {
                ad cfr_ignored_0 = ((ah)object).m;
                object = ((ah)object).m;
            } else if (al2 != null) {
                al2.h(true);
                if (al2.f() && an2 != null) {
                    an2.h(false);
                }
            } else if (an2 != null) {
                an2.h(true);
            }
        }
        cq.a().e();
    }

    protected static void a(Graphics graphics) {
        graphics.setColor(0);
        graphics.fillRect(0, 0, com.mg.bas.v.v, com.mg.bas.v.w);
    }

    final void a(Graphics object, Image image, Graphics graphics) {
        try {
            if (this.flagS) {
                if (this.r) {
                    this.o.a((Graphics)object, true);
                }
            } else {
                if (this.n != null) {
                    try {
                        if (this.a != null) {
                            this.a.a((Graphics)object, false);
                        }
                        this.n.a((Graphics)object);
                        if (this.l != null) {
                            object.setClip(this.n.c() + 10, this.n.d() + 10, this.n.e() - 20, this.n.f() - 20);
                            this.l.c((Graphics)object);
                        }
                    }
                    catch (Exception exception) {
                        Exception exception2 = exception;
                        exception.printStackTrace();
                    }
                } else if (this.b != null) {
                    try {
                        if (!this.z) {
                            if (this.a != null) {
                                this.a.a((Graphics)object, false);
                            }
                            int n = 0;
                            int n2 = this.k.d();
                            while (n < n2) {
                                ((al)this.k.b(n)).c((Graphics)object);
                                ++n;
                            }
                            if (!this.b.e()) {
                                this.z = true;
                            }
                        }
                        this.b.a((Graphics)object, true);
                    }
                    catch (Exception exception) {
                        Exception exception3 = exception;
                        exception.printStackTrace();
                    }
                } else if (this.a != null) {
                    try {
                        this.a.a((Graphics)object, true);
                    }
                    catch (Exception exception) {
                        Exception exception4 = exception;
                        exception.printStackTrace();
                    }
                }
                if (this.m != null) {
                    return;
                }
            }
            if (this.f != null) {
                this.f.a((Graphics)object);
            }
            graphics.drawImage(image, com.mg.bas.v.x + this.vValue, com.mg.bas.v.y + this.w, 20);
            return;
        }
        catch (Exception exception) {
            Exception exception5 = exception;
            exception.printStackTrace();
            return;
        }
    }

    final boolean j() {
        if (this.b != null) {
            return false;
        }
        if (this.a != null) {
            return this.a.a_();
        }
        return false;
    }

    public final boolean k() {
        if (this.b != null) {
            return this.b.q();
        }
        if (this.a != null) {
            return this.a.q();
        }
        return false;
    }

    public al a(String string, String string2, String[] stringArray, int[] nArray, int n) {
        return new bv(string, string2, stringArray, nArray, n);
    }

    public final al a(String string, String string2, String object, int n, int n2) {
        String[] stringArray = new String[1];
        String[] stringArray2 = stringArray;
        stringArray[0] = object;
        int[] nArray = new int[1];
        int[] intArray = nArray;
        nArray[0] = n;
        return this.a(string, string2, stringArray2, intArray, 1);
    }

    public final al a(String string, String string2, String object, int n, String string3, int n2, int n3) {
        String[] stringArray = new String[2];
        String[] stringArray2 = stringArray;
        stringArray[0] = object;
        stringArray2[1] = string3;
        int[] nArray = new int[2];
        int[] intArray = nArray;
        nArray[0] = n;
        intArray[1] = n2;
        return this.a(string, string2, stringArray2, intArray, 1);
    }

    public final al a(String string, String string2, boolean bl) {
        return this.a(string, string2, null, null, 1);
    }

    public final void a(al al2, boolean bl) {
        if (al2 != null) {
            v.c();
            al2.a(false);
            if (this.b != null) {
                al al3;
                al al4 = al3 = this.b;
                al3.e(true);
                this.k.a(al3);
            } else if (this.a != null) {
                an an2 = this.a;
                an2.e(true);
            }
            this.z = false;
            this.b = al2;
            if (this.b.d() && this.c != null) {
                this.m = null;
                this.n = this.c;
                this.n.a(this.b.c, this.b.d, this.b.c, this.b.d, this.b.f, this.b.g);
                this.i = true;
                this.l = this.b;
                return;
            }
            this.b.i(false);
        }
    }

    public final void a(al al2) {
        this.a(al2, false);
    }

    public final boolean c(int n) {
        if (this.b != null && this.b.h() == n) {
            return true;
        }
        int n2 = 0;
        while (n2 < this.k.d()) {
            al al2 = (al)this.k.b(n2);
            if (al2.h() == n) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public final al d(int n) {
        if (this.b != null && this.b.h() == n) {
            return this.b;
        }
        int n2 = 0;
        while (n2 < this.k.d()) {
            al al2 = (al)this.k.b(n2);
            if (al2.h() == n) {
                return al2;
            }
            ++n2;
        }
        return null;
    }

    public final void a(int n, boolean bl) {
        al al2 = this.d(n);
        if (al2 != null) {
            this.b(al2, false);
        }
    }

    public final void e(int n) {
        this.a(n, false);
    }

    public final void b(al al2, boolean bl) {
        this.z = false;
        if (this.b != null && al2.equals(this.b)) {
            this.a(bl);
            return;
        }
        this.k.b(al2);
        al2.s();
    }

    public final void a(boolean bl) {
        v.c();
        if (this.b != null) {
            if (bl && (this.a == null || this.a.h() != -100001) && this.d != null) {
                this.m = null;
                this.n = this.d;
                this.n.a(this.b.c, this.b.d, this.b.c, this.b.d, this.b.f, this.b.g);
                this.i = true;
                this.l = this.b;
            }
            this.b.s();
        }
        this.b = null;
        if (this.k.d() > 0) {
            this.b = (al)this.k.a(this.k.d() - 1);
            if (this.b != null) {
                this.b.i(true);
            }
            if (this.a != null) {
                this.a.e(true);
            }
        } else if (this.a != null) {
            this.a.i(true);
        }
        System.gc();
    }

    public final void l() {
        v.c();
        if (this.b != null) {
            this.b.s();
        }
        this.b = null;
        int n = 0;
        while (n < this.k.d()) {
            ((al)this.k.b(n)).s();
            ++n;
        }
        this.k.a();
        this.n = null;
        System.gc();
    }

    protected final void a(an an2, boolean bl, ad ad2) {
        if (an2 != null) {
            v.c();
            this.a = an2;
            this.m = ad2;
            if (this.m != null && this.n == null) {
                this.i = true;
                return;
            }
            this.m = null;
            this.n = null;
            this.a.i(false);
            this.flagS = false;
            if (bl) {
                this.a.r();
            }
        }
    }

    public final void a(an an2) {
        this.a(an2, true, null);
    }

    public final void a(int n, boolean bl, boolean bl2, ad ad2, Object[] objectArray) {
        if (this.a == null || this.a.h() != n) {
            this.p = n;
            this.q = bl;
            this.r = false;
            this.m = null;
            this.t = objectArray;
            v.c();
            ah ahObj = this;
            if (ahObj.o == null) {
                ahObj.o = new ak();
            }
            ahObj.m = null;
            ahObj.n = null;
            ag.a().e();
            ahObj.o.a();
            v.ag = false;
            ahObj.flagS = true;
            if (ahObj.r) {
                ahObj.o.a(0);
            }
            s.a().a(this);
        }
    }

    public final void f(int n) {
        this.a(n, false, false, null, null);
    }

    public final void a(int n, Object[] objectArray) {
        this.a(5, false, false, null, objectArray);
    }

    public final void a() {
        an an2 = null;
        int n = 0;
        int n2 = this.j.d();
        while (n < n2) {
            an an3 = (an)this.j.b(n);
            if (an3.h() == this.p) {
                an2 = an3;
                this.j.b(an3);
                break;
            }
            ++n;
        }
        n = -1;
        if (this.a != null) {
            an an4 = this.a;
            this.a = y;
            if (this.q) {
                this.j.a(an4);
            } else {
                an4.s();
            }
            n = an4.h();
            System.gc();
        }
        n2 = 0;
        if (an2 == null) {
            an2 = this.a(n, this.p, this.t);
            this.t = null;
            n2 = 1;
        }
        this.o.a(an2, null, n2 != 0);
    }

    public final void m() {
        this.m = null;
        this.n = null;
        if (this.a != null) {
        }
    }

    public final void n() {
        if (this.a != null) {
        }
    }

    public final void g(int n) {
        this.u = n;
    }

    public void o() {
        this.a(-10006, false);
        this.a(-10001, false);
        Object object = this.a("Chú ý", "Mạng di động đang có vấn đề hoặc quá tải, vui lòng thử lại sau", "Đóng", 3, 1);
        ((am)object).a(this);
        al al2 = (al) object;
        object = this;
        ((ah)object).a(al2, false);
    }

    public final void a(int n, String object, String string, String string2) {
        v.M = false;
        v.ab = n;
        v.ac = object;
        v.ad = string;
        if (string2 != null && string2.length() >= 5) {
            String string3 = string2.toLowerCase().substring(0, 4);
            string2 = string2.trim().substring(4);
            int n2 = Integer.parseInt(string2);
            if ("reco".toLowerCase().equals(string3)) {
                cs.a(n2, n, string, object);
                if (MGMIDlet.b) {
                    MGMIDlet midlet = MGMIDlet.d();
                    midlet.notifyDestroyed();
                    return;
                }
                n = n2;
                ah ahObj = this;
                if (ahObj.a != null && ahObj.a.h() == -100004) {
                    cd cdObj = (cd)ahObj.a;
                    if (cdObj != null) {
                        ahObj.a((an) cdObj, true, null);
                        ahObj.a(-10006, false);
                    }
                }
                return;
            }
            "chal".toLowerCase().equals(string3);
        }
    }

    public void d(int n, int n2) {
        if (n2 == -2) {
            this.a(-9999, false);
            if (this.a != null) {
                return;
            }
        } else {
            if (n2 == -1) {
                cs.a(0, new ai(this));
                return;
            }
            if (n2 == 1) {
                this.n();
                this.a(-10003, false);
                return;
            }
            if (n2 == 3) {
                this.a(true);
                return;
            }
            if (n2 == 2) {
                this.a(false);
                return;
            }
            if (n2 == 4) {
                MGMIDlet midlet = MGMIDlet.d();
                midlet.notifyDestroyed();
                return;
            }
            if (n2 == 6) {
                this.a(true);
                return;
            }
            if (n2 == 5) {
                try {
                    MGMIDlet.d().a("http://game.ola.vn");
                } catch (Exception e) {}
                this.a(false);
                return;
            }
            if (n2 == 7) {
                this.a(false);
                MGMIDlet.d();
                MGMIDlet.b("1900588883");
                return;
            }
            if (n2 == 8) {
                MGMIDlet.d();
                MGMIDlet.b("1900588883");
            }
        }
    }

    protected abstract an a(int var1, int var2, Object[] var3);

    public abstract void p();

    public static bt h(int n) {
        bt bt2 = new bt(n);
        if (n == 1) {
            bt2.e(2);
        } else {
            bt2.d(2);
        }
        return bt2;
    }
}
