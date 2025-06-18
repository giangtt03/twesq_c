package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// UI/game dialog or message box component, displays multi-line text and manages layout. Extends al.
import javax.microedition.lcdui.Graphics;

public final class bv
extends al {
    private String[] k;
    private int l;
    private int m;
    private String n;
    private int o = 0;
    private int p = 2;
    private boolean q = false;
    private int r = 20;
    private int s = 0;
    private int t = 6;
    private int u;
    private int v;

    public bv(String object, String string, String[] stringArray, int[] nArray, int n) {
        super(n);
        this.n = object;
        this.s = 1;
        if (this.s == 0) {
            this.c = 0;
            this.u = this.f = v.t;
        } else {
            this.c = 10;
            this.u = this.f = v.t - 20;
        }
        object = this;
        this.k = bx.a(string, ((bv)object).u - (((bv)object).t << 1));
        if (((bv)object).s == 0) {
            ((bv)object).l = 0;
            ((bv)object).m = v.u - ba.a;
        } else {
            int n2 = ((bv)object).k.length;
            n2 = (n2 + 2) * bx.c.a();
            ((bv)object).l = (((am)object).g - ba.a - n2) / 2;
            ((bv)object).m = (((am)object).g - ba.a + n2) / 2 + bx.c.a();
            if (((bv)object).l < 0) {
                ((bv)object).l = 0;
            }
            if (((bv)object).m > v.u - ba.a) {
                ((bv)object).m = v.u - ba.a;
            }
        }
        ((al)object).d = ((bv)object).l;
        ((bv)object).v = ((bv)object).m - ((bv)object).l;
        if (((bv)object).s != 0) {
            ((am)object).f = ((bv)object).u;
            ((am)object).g = ((bv)object).v;
        }
        if (stringArray != null) {
            if (stringArray.length == 1) {
                this.a(new bd(stringArray[0], nArray[0]));
                return;
            }
            if (stringArray.length == 2) {
                bd bd2 = new bd(stringArray[0], nArray[0]);
                object = this;
                ((am)object).a(bd2, true);
                bd2 = new bd(stringArray[1], nArray[1]);
                object = this;
                ((am)object).b(bd2, true);
                return;
            }
            bd bd3 = new bd(stringArray[0], nArray[0]);
            object = this;
            ((am)object).a(bd3, true);
            this.a(new bd(stringArray[1], nArray[1]));
            bd3 = new bd(stringArray[1], nArray[2]);
            object = this;
            ((am)object).b(bd3, true);
        }
    }

    public final void c(int n) {
        if (n == 99) {
            this.r = 20;
            if (this.o < 0) {
                this.o += this.p;
                return;
            }
        } else if (n == 98) {
            this.r = 20;
        }
    }

    public final void a(int n, int n2) {
        this.r = 20;
    }

    protected final void g() {
        if (this.r > 0) {
            --this.r;
        }
    }

    public final void c(Graphics object) {
        ag.c().a((Graphics)object, this.c, this.d, this.u, this.v);
        Graphics graphics = object;
        object = this;
        this.t = 6;
        cw.a(graphics, cw.a);
        if (object.n != null && object.n.length() > 0) {
            bx.b.a(graphics, object.n, object.c + object.f / 2, object.l + bx.b.a() - 5, 1);
            bx.a(bx.c);
            cw.a(graphics, object.c + object.t, object.l + (bx.c.a() << 1) - 5, object.u - (object.t << 1), object.v - 2 * bx.c.a());
            bx.a(graphics, bx.c, object.k, object.c + object.t, object.l + (bx.c.a() << 1) - 5 + object.o + (object.n.length() > 1 ? 5 : 0), object.u - (object.t << 1), object.v - 2 * bx.c.a() + 5 - object.o, 1);
        } else {
            cw.a(graphics, object.c + object.t, object.l + bx.c.a() - 5, object.u - (object.t << 1), object.v - bx.c.a());
            bx.a(graphics, bx.c, object.k, object.c + object.t, object.l + bx.c.a() - 5 + object.o + 5, object.u - (object.t << 1), object.v - bx.c.a() + 5 - object.o, 1);
        }
        cw.c(graphics, cw.a);
    }
}
