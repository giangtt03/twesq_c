package com.mg.bas;
// Login or authentication screen, handles user input and rendering.
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.smsgame.MGMIDlet;
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ob
extends an
implements bf {
    private int[] a;
    private Image b;
    private aq[] c;
    private int d;
    private boolean k;

    public ob() {
        super(2);
        int[] nArray = new int[4];
        nArray[2] = 234;
        nArray[3] = 125;
        this.a = nArray;
        this.d(false);
        this.b(true);
        this.a(false);
        v.ae = true;
        this.b = f.d("/bklogin");
        int n = v.t - this.a[2] >> 1;
        int n2 = v.u - 166;
        this.a[0] = n;
        this.a[1] = n2;
        this.c = new aq[4];
        this.c[0] = new ff("", 100, 2);
        this.c[0].a(this.a[0] + 83, this.a[1] + 35, 119, 16);
        ((ff)this.c[0]).a("Nhập nick ola");
        this.c[1] = new ff("", 100, 3);
        this.c[1].a(this.a[0] + 83, this.a[1] + 54, 119, 16);
        ((ff)this.c[1]).a("Nhập mật khẩu ola");
        this.c[2] = new ey("", gr.e);
        this.c[2].a(this.a[0] + 83, this.a[1] + 73, 11, 11);
        this.c[3] = new ey("", false);
        this.c[3].a(this.a[0] + 83, this.a[1] + 90, 11, 11);
        ob ob2 = this;
        Object object = cs.a.a(107);
        if (object != null) {
            object = new String((byte[])object);
            ((ff)ob2.c[0]).c((String)object);
        }
        if ((object = cs.a.a(108)) != null) {
            object = new String((byte[])object);
            ((ff)ob2.c[1]).c((String)object);
        }
        if (cs.a.c(109)) {
            object = cs.a.a(109);
            ((ey)ob2.c[2]).e(object[0] == 1);
        }
        if (cs.a.c(110)) {
            object = cs.a.a(110);
            ((ey)ob2.c[3]).e(object[0] == 1);
        }
        this.a(com.mg.sq.a.n);
        this.a(new ba());
        com.mg.sq.a.s().l();
        ks.a().a(com.mg.sq.a.s());
        pa.a();
        this.c[0].d(true);
        com.mg.sq.a.s().c();
        ob2 = this;
        br br2 = new br("Hỗ trợ", -1);
        object = br2;
        br2.a(new br[]{new br("Quên mật khẩu", 202), new br("Tổng đài", 203), new br("Cài đặt", 204)});
        bs bs2 = new bs(new br[]{new br("Đăng nhập", 200), new br("Đăng ký", 201), object, new br("Thoát", 205)});
        object = bs2;
        bs2.a(ob2);
        ob2.a((bs)object);
    }

    protected final void r() {
        boolean bl = true;
        boolean bl2 = ((ey)this.c[3]).a();
        if (gr.f && bl2) {
            bl = false;
            this.f();
        } else if (com.mg.sq.a.l != null && com.mg.sq.a.l.length > 0) {
            com.mg.sq.a.b(com.mg.sq.a.l);
            com.mg.sq.a.l = null;
        }
        gr.f = false;
        if (bl) {
            com.mg.sq.a.a(this);
        }
        ct.b("init SQLoginScreen");
    }

    protected final void e(int n, int n2) {
        if (this.k) {
            return;
        }
        int n3 = 0;
        while (n3 < this.c.length) {
            if (this.c[n3].c(n, n2)) {
                if (this.d == n3) break;
                this.c[this.d].d(false);
                this.d = n3;
                this.c[this.d].d(true);
                return;
            }
            ++n3;
        }
    }

    protected final void a(int n) {
        if (this.k) {
            return;
        }
        int n2 = this.d--;
        switch (n) {
            case 99: {
                if (this.d < 0) {
                    this.d = 0;
                }
            }
            case 98: {
                if (n == 98) {
                    ++this.d;
                    if (this.d > this.c.length - 1) {
                        this.d = this.c.length - 1;
                    }
                }
                this.c[n2].d(false);
                this.c[this.d].d(true);
                return;
            }
        }
        this.c[this.d].f(n);
    }

    protected final void e(int n) {
        if (this.k) {
            return;
        }
        switch (n) {
            case 98: 
            case 99: {
                return;
            }
        }
        this.c[this.d].g(n);
    }

    protected final void c() {
        int n = 0;
        while (n < this.c.length) {
            this.c[n].n();
            ++n;
        }
    }

    protected final void a(Graphics graphics) {
        if (v.u > this.b.getHeight() || v.t > this.b.getWidth()) {
            graphics.setColor(0);
            graphics.fillRect(0, 0, v.t, v.u);
        }
        graphics.drawImage(this.b, v.t / 2, this.a[1] + 166, 33);
        int n = 0;
        while (n < this.c.length) {
            this.c[n].a(graphics, 0, 0);
            ++n;
        }
    }

    public final void d(int n, int n2) {
        switch (n2) {
            case 6: {
                String string = com.mg.sq.a.k(241220).toLowerCase().trim();
                ci.b(string);
                com.mg.sq.a.s().l();
                break;
            }
            case 7: {
                com.mg.sq.a.s().a(false);
                break;
            }
            case 200: {
                this.f();
                break;
            }
            case 201: {
                com.mg.sq.a.s().L();
                break;
            }
            case 202: {
                he he2 = com.mg.sq.a.a("Nhập nick muốn lấy lại mật khẩu vào bên dưới", null, "Xong", 6, "Đóng", 7);
                he2.a(this);
                ag.b().a(he2);
                break;
            }
            case 203: {
                MGMIDlet.d();
                MGMIDlet.b("1900588883");
                break;
            }
            case 204: {
                com.mg.sq.a.F();
                break;
            }
            case 205: {
                MGMIDlet mGMIDlet = MGMIDlet.d();
                mGMIDlet.notifyDestroyed();
            }
        }
        this.c(false);
    }

    private void f() {
        String string = ((ff)this.c[0]).r();
        String string2 = ((ff)this.c[1]).r();
        if (!i.a(string) && !i.a(string2)) {
            ob ob2 = this;
            ey ey2 = (ey)ob2.c[2];
            ff ff2 = (ff)ob2.c[1];
            if (ey2.a()) {
                cs.a.a(108, ff2.r().getBytes());
                cs.a.a(109, new byte[]{1});
            } else {
                cs.a.a(109, new byte[1]);
                cs.a.b(108);
            }
            ey2 = (ey)ob2.c[3];
            if (ey2.a()) {
                cs.a.a(110, new byte[]{1});
            } else {
                cs.a.a(110, new byte[1]);
            }
            ff2 = (ff)ob2.c[0];
            cs.a.a(107, ff2.r().getBytes());
            cs.a.a();
            go.e = string = string.trim().toLowerCase();
            go.f = string2;
            com.mg.sq.a.s().a((String)null, (il)null);
            ks ks2 = ks.a();
            pd.k();
            ks2.a(string, string2, go.a);
        }
        go.t = true;
        go.t = pd.G() == 0;
        pc.d();
    }

    public static void d() {
        go.c = pd.x();
        Object object = pd.r();
        if (object != null && !((String)object).equals(go.e)) {
            pd.s();
        }
        object = new dz();
        new dz().b = "vn";
        ((dz)object).e = v.t;
        ((dz)object).f = v.u;
        ((dz)object).g = 0;
        ((dz)object).c = "123456789";
        ((dz)object).d = "patriot";
        String string = System.getProperty("microedition.platform");
        String string2 = ((dz)object).a = string == null ? " " : string;
        if (com.mg.sq.a.m == null) {
            com.mg.sq.a.m = new oi();
        }
        du.a().a(com.mg.sq.a.m);
        du.a().a((dz)object);
        oi.r = System.currentTimeMillis();
        com.mg.sq.a.o = false;
    }

    protected final void s() {
        this.b = null;
        this.c = null;
        System.gc();
    }

    public final void e() {
        this.k = true;
        gy gy2 = new gy();
        gy2.b(241222);
        this.h();
        gy2.t();
        ag.b().a(gy2);
        co.b().a("lv1", -1);
        co.b().e();
    }
}
