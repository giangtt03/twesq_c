package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class hk
extends al
implements bf {
    private int k = 10;
    private ls l;
    private Image[] m;
    private String n;
    private int o;
    private int p;
    private int q;
    private int r;
    private eb[] s;
    private bs t;

    public hk(String object, String string, ee[] eeArray, eb[] ebArray) {
        super(1);
        this.n = object;
        this.s = ebArray;
        if (eeArray == null) {
            eeArray = new ee[]{};
        }
        this.m = new Image[eeArray.length];
        try {
            int n2 = 0;
            while (n2 < this.m.length) {
                this.m[n2] = Image.createImage((byte[])eeArray[n2].h, (int)0, (int)eeArray[n2].h.length);
                ++n2;
            }
        }
        catch (Throwable throwable) {
//            object = throwable;
            throwable.printStackTrace();
        }
        this.l = new ls(bx.d, string, 0, 0, v.t - 4, bx.d.a(), 1);
        this.r = v.u - bx.d.a() - ba.a - this.k;
        this.q = this.l.c() + this.k;
        int n3 = 0;
        while (n3 < this.m.length) {
            if (this.m[n3] != null) {
                this.q += this.k + this.m[n3].getHeight();
            }
            ++n3;
        }
        this.a(new ba());
        this.t();
        this.a(this);
    }

    private void t() {
        this.m();
        if (this.s == null || this.s.length < 2) {
            bd bd2 = new bd("Đóng", -2);
            hk hk2 = this;
            hk2.b(bd2, true);
            if (this.s != null && this.s.length > 0) {
                bd2 = new bd(this.s[0].e(), 1);
                hk2 = this;
                hk2.a(bd2, true);
                return;
            }
        } else {
            gb gb2 = new gb(-1, 0);
            hk hk3 = this;
            hk3.a(gb2, true);
        }
    }

    public final void c(int n2) {
        if (this.q <= this.r) {
            return;
        }
        if (n2 == 99) {
            this.e(-bx.d.a());
            return;
        }
        if (n2 == 98) {
            this.e(bx.d.a());
            this.e(true);
        }
    }

    public final void c(int n2, int n3) {
        if (this.q < this.r) {
            return;
        }
        this.e(-n3);
    }

    protected final void g() {
        if (this.o != this.p) {
            int n2 = this.o - this.p;
            if (Math.abs(n2) > 4) {
                n2 /= 4;
            }
            this.p += n2;
            this.e(true);
        }
        if (this.t != null) {
            this.t.n();
        }
    }

    private void e(int n2) {
        this.o += n2;
        if (this.o < 0) {
            this.o = 0;
        }
        if (this.q - this.o < this.r) {
            this.o = this.q - this.r;
        }
        this.e(true);
    }

    public final void c(Graphics graphics) {
        if (!this.h && this.t == null) {
            return;
        }
        graphics.setColor(v.am);
        graphics.fillRect(this.a(), this.c(), this.i(), this.j());
        graphics.drawImage(pc.d, this.a() + this.i(), this.c() + this.j() - ba.a, 40);
        pc.a(graphics, 4, 20, v.t - 8);
        bx.d.c(true);
        bx.d.a(graphics, this.n, this.i() / 2, 2, 1);
        bx.d.c();
        int n2 = bx.d.a() + this.k;
        graphics.setClip(0, n2, v.t, this.r);
        n2 -= this.p;
        int n3 = 0;
        while (n3 < this.m.length) {
            if (this.m[n3] != null) {
                graphics.drawImage(this.m[n3], v.t / 2, n2, 17);
                n2 += this.k + this.m[n3].getHeight();
            }
            ++n3;
        }
        this.l.a(graphics, 2, n2);
        graphics.setClip(0, 0, v.t, v.u);
        if (this.t != null) {
            this.t.a(graphics, 0, 0);
        }
        this.e(false);
    }

    public final void d(int n2, int n3) {
        switch (n3) {
            case -1: {
                hk hk2 = this;
                hk2.m();
                Object object = new bs();
                br[] brArray = oi.a(hk2.s);
                br[] brArray2 = new br[brArray.length + 1];
                System.arraycopy(brArray, 0, brArray2, 0, brArray.length);
                brArray2[brArray.length] = new br("Đóng", 0);
                ((bs)object).a(brArray2);
                int n4 = ((aq)object).e() > ((aq)object).f() ? ((aq)object).e() : ((aq)object).f();
                ((bs)object).a_(-n4, hk2.j() - ((aq)object).f() + n4);
                ((bs)object).d(0, v.u - ba.a - ((aq)object).f());
                ((bs)object).a(hk2);
//                v0.t = object;
                hk2.t.a(hk2);
                gb gb2 = new gb(-3, 2);
                object = hk2;
                ((am)object).a(gb2, true);
                gb2 = new gb(-4, 3);
                object = hk2;
                ((am)object).b(gb2, true);
                hk2.e(true);
                return;
            }
            case -2: {
                com.mg.sq.a.s().a(false);
                return;
            }
            case -3: {
                this.t.f(95);
                return;
            }
            case -4: {
                this.u();
                return;
            }
            case 1: {
                com.mg.sq.a.m.a(this.s[0]);
                return;
            }
            case 0: {
                br br2 = this.t.r();
                this.u();
                if (com.mg.sq.a.m.b(br2.b(), this.s)) break;
                com.mg.sq.a.s().a(false);
            }
        }
    }

    private void u() {
        this.t = null;
        this.t();
        this.e(true);
    }
}
