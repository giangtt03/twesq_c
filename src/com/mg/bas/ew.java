package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class ew
extends aq {
    public doo i;
    private String j;
    private String k;
    private int l;
    private int m;
    private boolean n = true;
    private d o = bx.d;
    private d p = com.mg.sq.a.g;
    private String q;
    private long r;

    public ew(doo doo2, int n) {
        this.d(n);
        this.a(doo2, null, 0L);
    }

    public ew(doo doo2, int n, d d2) {
        this.o = d2;
        this.d(n);
        this.a(doo2, null, 0L);
    }

    public final void a(doo doo2, String string, long l) {
        this.i = doo2;
        this.j = String.valueOf(doo2.a) + (!com.mg.bas.i.b(doo2.e) ? " - " + doo2.e : "");
        this.l = bx.d.a(this.j);
        this.k = "Cấp " + doo2.b + "  --  Danh vọng" + " " + doo2.d;
        this.q = string;
        this.r = l + System.currentTimeMillis();
        byte cfr_ignored_0 = doo2.c;
    }

    public final void d(boolean bl) {
        if (bl) {
            this.m = 0;
            this.n = true;
            this.e(42);
        } else {
            this.e(32);
        }
        if (bl || this.g != bl) {
            this.c = true;
        }
        super.d(bl);
    }

    public final void a(Graphics graphics, int n, int n2) {
        boolean bl;
        n2 += this.d();
        n += this.c() + 2;
        if (this.g) {
            pc.e(graphics, n - 2, n2, this.e(), this.f());
            n2 += 7;
        } else {
            n2 += 3;
        }
        if (bl = this.g && this.l > this.e() - 25 - 2) {
            cw.a(graphics);
            cw.a(graphics, n, n2, this.e(), this.f());
        }
        int n3 = n + 25;
        this.o.a(graphics, this.j, n3 + (this.g ? this.m : 0), n2, 0);
        if (bl) {
            cw.b(graphics);
        }
        pc.a(graphics, n, n2, this.i.c);
        this.p.a(graphics, this.k, n3, n2 + 13, 0);
        if (this.q != null) {
            long l = this.r - System.currentTimeMillis() > 0L ? this.r - System.currentTimeMillis() : 0L;
            n = v.t - bx.c.a(this.q) - bx.c.a(com.mg.bas.i.b(l, "hh:mm:ss")) - 5;
            com.mg.sq.a.h.a(graphics, String.valueOf(this.q) + " " + com.mg.bas.i.b(l, "hh:mm:ss"), n, v.u - 35, 0);
        }
    }

    public final void n() {
        int n = this.e() - 25 - 2;
        if (this.g && this.l > n) {
            if (this.n) {
                --this.m;
                if (this.m < (n -= this.l)) {
                    this.m = n;
                    this.n = false;
                }
            } else {
                ++this.m;
                if (this.m > 0) {
                    this.m = 0;
                    this.n = true;
                }
            }
            this.c = true;
        }
    }
}
