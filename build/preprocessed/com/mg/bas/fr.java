package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class fr
extends aq {
    private int i = 0;
    private aq j;
    private int k = 0;
    private ls l;
    private d m = bx.d;
    private long n;

    public fr(String object, aq object2, int n2) {
        this.d(v.t - 20);
        this.j = object2;
        this.i = 0;
        object2 = object;
        object = this;
        this.l = new ls(((fr)object).m, (String)object2, 10, 10, ((aq)object).e() - 10 - 10, ((fr)object).m.a(), 2);
        ((aq)object).e(((fr)object).l.c() + 10 + 10);
        ((fr)object).k = (((fr)object).l.c() / (((fr)object).m.a() + 2) + 1) * 3000;
        this.e = false;
    }

    public final void a() {
        this.a(true);
        this.n = System.currentTimeMillis();
    }

    public final void n() {
        if (this.e && System.currentTimeMillis() - this.n >= (long)this.k) {
            fr fr2 = this;
            fr2.a(false);
        }
    }

    public final void a(Graphics graphics, int n2, int n3) {
        if (this.e) {
            n3 += this.j.d();
            n3 = this.i == 0 ? (n3 -= this.f() + 8) : (n3 += this.f() - 2);
            if ((n2 += this.j.c() + this.j.e() / 2 - this.e() / 2) < 0) {
                n2 = 0;
            }
            cw.a(graphics, n2, n3, this.e(), this.f(), n2 + this.e() / 2, this.i != 0, 13288681, 5915121);
            this.l.a(graphics, n2, n3);
        }
    }
}
