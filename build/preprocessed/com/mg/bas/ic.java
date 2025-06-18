package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ic
extends al
implements bf {
    private cu k;
    private k l = null;
    private int m;
    private as n;
    private String[] o = null;
    private cu p;
    private k q;
    private k r;
    private int s = 3;
    private int t = 3;
    private int u = 0;
    private String v;
    private Image w = f.d("/push");
    private int x = 1;
    private int y;
    private a z;

    public ic(int n, int n2, k k2, as as2, String string, String object) {
        super(1);
        int n3;
        this.v = object;
        object = this;
        this.f = v.t - 20;
        ((am)object).g = bx.d.a() * ((ic)object).s + 20;
        ((al)object).c = v.t - ((am)object).f >> 1;
        ((ic)object).r = new k(35, 20, ((am)object).f - 35, ((am)object).g);
        if (((ic)object).v != null) {
            int n4 = bx.d.a(((ic)object).v) + 20;
            if (n4 > (n3 = ((am)object).f - 30)) {
                n4 = n3;
                com.mg.sq.a.a(((ic)object).v, bx.d, n3);
            }
            ((ic)object).q = new k(5, 0, n4 + 10, 18);
        } else {
            ((ic)object).q = new k(5, 0, ((am)object).f - 30, 18);
        }
        ((ic)object).p = new cu(5, 10);
        k k3 = k2;
        object = this;
        this.l = k3;
        if (k3 != null && ((ic)object).k != null) {
            ((ic)object).m = ((ic)object).k.a - k3.a;
        }
        n3 = n2;
        int n5 = n;
        object = this;
        this.k = new cu(n5, n3);
        if (((ic)object).l != null) {
            ((ic)object).m = ((ic)object).k.a - ((ic)object).l.a;
            n = ((ic)object).k.b - ((ic)object).l.b;
            if (((am)object).g > n) {
                ((am)object).g = n;
                ((al)object).d = 0;
                if (((am)object).g < bx.d.a() * ((ic)object).s - 20) {
                    n2 = (((am)object).g - 20) / bx.d.a();
                    Object object2 = object;
                    if (n2 == 0) {
                        n2 = 1;
                    }
                    ((ic)object2).s = n2;
                    ((ic)object2).t = n2;
                }
            } else {
                ((al)object).d = n - ((am)object).g;
            }
        }
        Object object3 = as2;
        object = this;
        this.n = object3;
        if (object3 != null) {
            ((ic)object).n.i();
            ((am)object).g = ((at)object3).q() > ((am)object).g ? ((at)object3).q() + 20 : ((am)object).g;
            ((ic)object).r.a = ((ic)object).p.a + ((at)object3).p() + 3;
            ((ic)object).r.c = ((am)object).f - ((ic)object).r.a - 5;
            ((ic)object).p.b = ((am)object).g - ((at)object3).q();
        }
        object3 = string;
        object = this;
        this.o = bx.a((String)object3, ((ic)object).r.c);
        ((ic)object).t = ((ic)object).o.length < ((ic)object).s ? ((ic)object).o.length : ((ic)object).s;
        this.z = com.mg.sq.a.s();
    }

    protected final void g() {
        if (this.n != null) {
            this.n.i();
        }
        ++this.y;
        if (this.y > 0) {
            this.y = 0;
            ++this.x;
            if (this.x > 6) {
                this.x = 0;
                this.y = -6;
            }
        }
    }

    public final void d(int n, int n2) {
    }

    public final void c(Graphics object) {
        int n = 0;
        int n2 = 0;
        Graphics graphics = object;
        object = this;
        n2 = 0 + object.c;
        n = 0 + object.d;
        cw.a(graphics, n2, n + 9, object.f, object.g, object.m + n2, false, 14808319, 152707);
        if (object.n != null) {
            object.n.a(graphics, n2 + object.p.a, n + object.p.b);
        }
        pc.a(graphics, n2 + object.q.a, n + object.q.b, object.q.c, object.q.d, 8023552, 16775619);
        if (object.v != null) {
            bx.d.c(true);
            bx.d.a(graphics, object.v, object.q.a + n2 + 3, object.q.b + n + 2, 0);
            bx.d.c(false);
        }
        if (object.o != null) {
            bx.a(graphics, bx.c, object.o, object.u, object.t, object.r.a + n2, object.r.b + n, object.r.c, object.r.d, 0);
        }
        int n3 = object.w.getWidth() >> 1;
        n2 = n2 + object.f - 10;
        n = n + object.g - 5;
        graphics.drawRegion(object.w, 0, 0, n3, object.w.getHeight(), 0, n2, n + object.x, 33);
        graphics.drawRegion(object.w, n3, 0, n3, object.w.getHeight(), 0, n2, n + 10, 33);
    }

    public final void c(int n) {
        n = this.u + this.s;
        if (n >= this.o.length) {
            this.z.a(false);
            this.z.M();
            return;
        }
        if (n >= this.o.length - this.s) {
            this.t = this.o.length - n;
        }
        this.u = n;
    }

    public final void a(int n, int n2) {
        if (new k(this.c + this.p.a, this.d + this.p.b, this.n.p(), this.n.q()).a(n, n2) || new k(this.c + this.f - 25, this.d + this.g - 25, 25, 25).a(n, n2)) {
            this.c(95);
        }
    }
}
