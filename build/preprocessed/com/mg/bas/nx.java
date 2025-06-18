package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// Main game logic/controller class, handles graphics, state, and user interaction.
import com.mg.smsgame.MGMIDlet;
import com.mg.sq.a;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class nx
extends an
implements bf,
ij,
ik {
    public static int a;
    public static int b;
    public static long c;
    private Image d;
    private Image k;
    private Image l;
    private static int m;
    private int n = 0;
    private static String o;
    private int p = -1;
    private boolean q;
    private String r;
    private String s;
    private int t;
    private int[] u;
    private int v;

    static {
        c = 0L;
        m = 2;
    }

    public nx() {
        this(null);
    }

    public nx(String string) {
        super(5);
        this.r = string;
        com.mg.sq.a.s().l();
        try {
            this.f();
            return;
        }
        catch (OutOfMemoryError outOfMemoryError) {
            if (com.mg.sq.a.m != null) {
                com.mg.sq.a.m.G();
            }
            System.gc();
            try {
                this.f();
                return;
            }
            catch (OutOfMemoryError outOfMemoryError2) {
                com.mg.sq.a.s().j(1);
                return;
            }
        }
    }

    private void f() {
        this.b(5);
        this.a((ba)null);
        this.p = this.r == null ? 1 : 2;
        this.q = true;
        b = 0;
        a = 0;
        if (this.d == null) {
            this.d = f.d("/offline/avatardownloadscreen");
        }
        if (this.k == null) {
            this.k = f.d("/bardownloadscreen");
        }
        if (this.l == null) {
            this.l = f.d("/fillbardownloadscreen");
        }
    }

    public final boolean e() {
        return this.p != 2;
    }

    public final void a(boolean bl, String object, int n, int[] nArray, int n2) {
        this.s = object;
        this.t = n;
        this.u = nArray;
        this.v = n2;
        if (bl) {
            nx nx2 = this;
            object = ag.b().a("Thông báo", "Có phiên bản mới, vui lòng cập nhật!", "Cập nhật", -4, 1);
            ((am)object).a(nx2);
            ((am)object).b(3000);
            ag.b().a((al)object, false);
            return;
        }
        if (!i.b((String)object)) {
            nx nx3 = this;
            object = ag.b().a("Thông báo", "Có phiên bản mới, bạn có muốn cập nhật không?", "Cập nhật", -4, "Không", -5, 1);
            ((am)object).a(nx3);
            ((am)object).b(3000);
            ag.b().a((al)object, false);
            return;
        }
        this.a(n, nArray, n2);
    }

    private void a(int n, int[] nArray, int n2) {
        if (n < 0) {
            this.n = 4;
            return;
        }
        o = "Đang cài đặt...";
        m = 2;
        pa.a().a(n, nArray, n2, this);
    }

    protected final void a(Graphics graphics) {
        int n = 0;
        if (this.d != null && v.u > this.d.getHeight()) {
            n = (v.u - this.d.getHeight()) / 2;
        }
        if (m > 0 && this.d != null) {
            if (v.t > this.d.getWidth() || v.u > this.d.getHeight()) {
                graphics.setColor(0);
                graphics.fillRect(0, 0, this.f, this.g);
            }
            graphics.drawImage(this.d, this.f / 2, this.g - n, 33);
            if (o != null) {
                bx.c.a(graphics, o, this.f / 2, this.g - n - 17, 1);
            }
            if (this.e()) {
                com.mg.sq.a.g.a(graphics, "0.18.0" + (ct.a() ? " TEST SVIP = 210.211.116.157" : ""), v.t / 2, 0, 1);
            }
            --m;
        }
        if (this.l != null && this.k != null) {
            int n2 = (this.f - this.k.getWidth()) / 2;
            n = this.g - 33 - n;
            graphics.drawImage(this.k, n2, n, 0);
            if (a > 0) {
                if (b > a) {
                    b = a;
                }
                int n3 = b * 144 / a;
                this.a(graphics, n2 + 2, n + 2, n3, 1);
                bx.d.a(graphics, String.valueOf(b * 100 / a) + "%", n2 + this.k.getWidth() / 2, n, 1);
            }
        }
    }

    private void a(Graphics graphics, int n, int n2, int n3, int n4) {
        if (n3 <= 0) {
            return;
        }
        while (n3 > 0) {
            n4 = 10;
            if (10 > n3) {
                n4 = n3;
            }
            cw.a(graphics, this.l, 0, 0, n4, this.l.getHeight(), n, n2, 0);
            n3 -= n4;
            n += n4;
        }
    }

    protected final void c() {
        if (this.q) {
            if (this.p == 1) {
                o = "Kiểm tra phiên bản...";
                m = 2;
                int n = pd.C();
                ks.a().a(n, go.a, true);
            } else {
                String string = this.r;
                nx nx2 = this;
                o = "Đang nạp màn chơi...";
                m = 2;
                pa.a().a(string, nx2);
            }
            this.q = false;
        }
        if (this.n > 0) {
            --this.n;
            if (this.n == 1) {
                this.a();
            }
        }
        if (this.p == 1 && a > 0 && System.currentTimeMillis() - c >= 18000000L) {
            pa.a().e();
            com.mg.sq.a.s().a(1, (String)null);
            return;
        }
    }

    public final void e(boolean bl) {
        super.e(bl);
        m = 2;
    }

    public final void a() {
        pc.b();
        ag.b().f(2);
    }

    public final void b() {
        MGMIDlet mGMIDlet = MGMIDlet.d();
        mGMIDlet.notifyDestroyed();
    }

    public final void d() {
    }

    public final void a(jn jn2, byte[][] byArray) {
        oa.c = jn2;
        oa.b = byArray;
        ag.b().f(1);
    }

    public final void d(int n, int n2) {
        switch (n2) {
            case -4: {
                try {
                    MGMIDlet.d().a(this.s);
                    return;
                }
                catch (ConnectionNotFoundException connectionNotFoundException) {
                    MGMIDlet mGMIDlet = MGMIDlet.d();
                    mGMIDlet.notifyDestroyed();
                    connectionNotFoundException.printStackTrace();
                    return;
                }
            }
            case -5: {
                com.mg.sq.a.s().a(3000, false);
                this.a(this.t, this.u, this.v);
            }
        }
    }

    public static void a(String string) {
        o = "Cài đặt " + string + cv.a(1000) + ".pak";
        m = 1;
    }

    public static void f(int n) {
        b += n;
        c = System.currentTimeMillis();
    }
}
