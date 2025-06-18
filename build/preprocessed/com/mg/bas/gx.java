package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class gx
extends al
implements bf {
    private Image[] k = null;
    private cu l;
    private cu m;
    private cu[] n;
    private lq[] o;
    private d p = bx.d;
    private String[][] q;
    private int r = 0;
    private long s = 0L;
    private String t;

    public gx(lq[] lqArray) {
        super(1);
        Object object;
        this.b(241212);
        this.a(this);
        this.a(new ba());
        this.f = 240;
        this.g = 320 - ba.a;
        if (com.mg.sq.a.k == 1) {
            this.f = 320;
            this.g = v.u - ba.a;
        } else if (v.t < 240) {
            this.f = v.t;
            this.g = v.u - ba.a;
        }
        this.f -= 20;
        int n = this.f - 32 * lqArray.length;
        n /= lqArray.length + 1;
        this.o = lqArray;
        this.k = new Image[lqArray.length];
        this.n = new cu[lqArray.length];
        this.q = new String[lqArray.length][];
        int n2 = 0;
        try {
            int n3 = 0;
            while (n3 < lqArray.length) {
                ll ll2 = (ll)lqArray[n3].e;
                int n4 = mb.a(ll2) + 98;
                object = pa.a();
                this.k[n3] = ((pa)object).a(n4, false);
                this.n[n3] = new cu(n3 * (n + 32) + n, 10);
                this.q[n3] = com.mg.sq.a.a(ll2);
                if (n2 < this.q[n3].length) {
                    n2 = this.q[n3].length;
                }
                this.s += (long)lqArray[n3].d;
                ++n3;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        this.l = new cu(this.f / 2, this.n[0].b + this.k[0].getHeight() + 4);
        this.m = new cu(10, this.l.b + bx.d.a() + 5);
        this.g = this.m.b + 10 - 2 + (bx.c.a() + 2) + (bx.c.a() + 2) * (n2 += 2);
        this.c = v.t >= this.f ? (v.t - this.f) / 2 : 0;
        this.d = v.u >= this.g ? (v.u - ba.a - this.g) / 2 : 0;
        this.p = ll.a(((ll)lqArray[this.r].e).m);
        this.t = "Tổng tiền: " + com.mg.sq.a.b(this.s);
        bd bd2 = new bd("Bỏ qua", 1000);
        object = this;
        ((am)object).b(bd2, true);
        bd2 = new bd("Nhặt", 2000);
        object = this;
        ((am)object).a(bd2, true);
    }

    public final void c(Graphics graphics) {
        pc.a(graphics, this.c, this.d, this.f, this.g, v.aj, true);
        int n = 0;
        while (n < this.k.length) {
            graphics.drawImage(this.k[n], this.n[n].a + this.c, this.n[n].b + this.d, 20);
            ++n;
        }
        pc.e(graphics, this.n[this.r].a + this.c, this.n[this.r].b + this.d, 32, 32, 0);
        ll ll2 = (ll)this.o[this.r].e;
        if (ll2.d != null) {
            this.p.a(graphics, ll2.d, this.l.a + this.c, this.l.b + this.d, 1);
            pc.a(graphics, this.m.a + this.c, this.m.b + this.d, this.f - 10 - 10);
            int n2 = this.d + this.m.b + 10 - 2;
            int n3 = this.c + 5;
            pc.a(graphics, n3, n2 + com.mg.sq.a.g.a() / 2);
            if (go.k.G >= ll2.i) {
                bx.d.a(graphics, "Yêu cầu cấp: " + ll2.i, n3 + 7, n2, 0);
            } else {
                com.mg.sq.a.h.a(graphics, "Yêu cầu cấp: " + ll2.i, n3 + 7, n2, 0);
            }
            n2 += bx.d.a() + 2;
            if (this.q[this.r] != null) {
                int n4 = 0;
                while (n4 < this.q[this.r].length) {
                    pc.a(graphics, n3, n2 + bx.c.a() / 2);
                    bx.d.a(graphics, this.q[this.r][n4], n3 + 7, n2, 0);
                    n2 += bx.d.a() + 2;
                    ++n4;
                }
            }
            pc.a(graphics, this.m.a + this.c, n2 += 4, this.f - 10 - 10);
            bx.d.c(true);
            bx.d.a(graphics, this.t, n3 + 7, n2 += 8, 0);
            bx.d.c(false);
        }
    }

    public final void c(int n) {
        switch (n) {
            case 96: {
                this.r = this.r == this.o.length - 1 ? 0 : this.r + 1;
                this.p = ll.a(((ll)this.o[this.r].e).m);
                return;
            }
            case 97: {
                this.r = this.r == 0 ? this.o.length - 1 : this.r - 1;
                this.p = ll.a(((ll)this.o[this.r].e).m);
            }
        }
    }

    public final void d(int n, int n2) {
        ag.b().a(this.h(), false);
    }
}
