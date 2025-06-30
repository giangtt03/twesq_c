package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class gt
extends al
implements bf {
    private byte k = 0;
    private lh l = null;
    private String m = null;
    private k n;
    private k o;
    private k p;
    private mg q;
    private String[] r = new String[]{"Danh Hiệu", "Hạng ", "Cấp: "};
    private cu s;
    private k t;
    private String[] u;
    private String v;
    private np w;
    private String x;
    private int y;
    private boolean z;
    private boolean A;

    public gt(lh lh2, String string, boolean bl, boolean bl2) {
        this(lh2, (byte)0, bl, bl2);
        this.x = string;
        this.z = bl;
    }

    /*
     * WARNING - void declaration
     */
 public gt(lh lh2, byte by, boolean bl, boolean n) {
    super(1);
    int[] nArray = new int[]{7037769, 12628615, 15720104, 12628615, 7037769};
    this.y = 50;
    this.z = false;
    this.A = false;
    this.k = by;
    gt gt2 = this;
    if (by == 0) {
        bd bd2 = new bd("Không", 24);
        gt2.b(bd2, true);
    } else {
        gt2.a(new bd("Đóng", 87));
    }
    this.b(-241209);
    this.a(new ba());
    this.a(this);
    this.z = bl;
    this.A = n;
    if (lh2 != null) {
        int n32 = 220;
        gt2.l = lh2;
        gt2.o = new k(10, 10, 60, 70);
        int n4 = gt2.o.b + gt2.o.d + 4;
        gt2.p = new k(gt2.o.a + gt2.o.c + 65, gt2.o.b + bx.d.a() + 4, 75, 16);
        int n2 = bx.c.a(lh2.Q) + 4;
        if (n2 > gt2.p.c) {
            int n3 = n2 - gt2.p.c;
            gt2.p.c = n2;
            n32 = n3 + 220;
        }
        int height = n4;
        if (gt2.k == 0) {
            height += 4 + bx.d.a() + 4;
            if (gt2.z) {
                height += 4 + bx.d.a() + 4;
            }
            if (gt2.A) {
                height += 4 + bx.d.a() + 4;
            }
            if (lh2.X > 0L) {
                gt2.m = com.mg.bas.i.a(lh2.X, ".");
                height += 4;
                gt2.s = new cu(gt2.o.a, height);
                int labelWidth = bx.c.a("Đặt Cược:");
                int valueWidth = bx.c.a(gt2.m);
                height += 6;
                gt2.t = new k(gt2.o.a + 4 + 2 + labelWidth, height, valueWidth, 16);
                height += gt2.t.d + 4;
            }
        }
        height += 4 + 4;
        gt2.n = new k((gt2.f - n32) / 2, (gt2.g - height - ba.a) / 2, n32, height);
        gt2.u = new String[3];
        gt2.u[0] = lh2.Q;
        gt2.u[1] = lh2.R;
        gt2.u[2] = String.valueOf(lh2.G);
        gt2.v = com.mg.sq.a.a(gt2.l.b, gt2.f / 2 - 5);
        gt2.q = mb.a(lh2, false);
        gt2.q.a(lc.a(lh2));
        gt2.q.a(nr.a(lh2));
        gt2.q.c(2);
    }
    this.w = new np();
    this.w.a();
}
    public final String t() {
        return this.x;
    }

    public final void c(Graphics graphics) {
        pc.d(graphics, this.n.a, this.n.b, this.n.c, this.n.d, com.mg.bas.v.aj);
        int n = this.o.a + this.n.a;
        int n2 = this.n.b + this.o.b;
        pc.c(graphics, n, n2, this.o.c, this.o.d);
        if (this.q != null) {
            this.q.a(graphics, n + 4, n2 + this.o.d - 4 - this.q.q());
        }
        int n3 = n + this.o.c + 4;
        pc.b(graphics, n3, n2 + bx.d.b() - pc.h.getHeight(), this.l.g);
        bx.d.c(true);
        bx.d.a(graphics, this.v, n3 += 15, n2, 0);
        bx.d.c(false);
        n2 += bx.d.a() + 4;
        n3 = 0;
        while (n3 < this.r.length) {
            pc.b(graphics, this.p.a + this.n.a, n2, this.p.c, this.p.d, 1070484, 16579764, 14542575);
            bx.d.a(graphics, this.r[n3], this.p.a + this.n.a - 4, n2 + 1, 2);
            bx.c.a(graphics, this.u[n3], this.p.a + this.n.a + this.p.c / 2, n2 + 1, 1);
            n2 += this.p.d + 4;
            ++n3;
        }
        if (this.k == 0) {
            com.mg.sq.a.h.a(graphics, "Muốn khiêu chiến với bạn!", this.n.a + this.n.c / 2, n2 + 2, 1);
            n2 += 4 + com.mg.sq.a.h.a();
            if (this.z) {
                com.mg.sq.a.g.a(graphics, "Kiểu quyết đấu: 1 chiều", n, n2 + 2, 0);
                n2 += 4 + com.mg.sq.a.g.a();
            }
            if (this.A) {
                com.mg.sq.a.g.a(graphics, "Không chơi Tuyệt Chiêu", n, n2 + 2, 0);
                com.mg.sq.a.g.a();
            }
            if (this.m != null) {
                pc.a(graphics, this.s.a + this.n.a, this.s.b + this.n.b, this.n.c - 20);
                n2 = this.t.b + this.n.b + 2;
                bx.d.c(true);
                bx.d.a(graphics, "Đặt Cược:", n, n2 + 2, 0);
                bx.d.c(false);
                n = this.t.a + this.n.a + 4;
                com.mg.sq.a.h.a(graphics, this.m, n, n2 + 2, 0);
                bx.d.a(graphics, " KEN", n + this.t.c + 2, n2 + 2, 0);
                com.mg.sq.a.h.a();
            }
        }
    }

    public final void d(int n, int n2) {
        switch (n2) {
            case 24: {
                com.mg.sq.a.s().a(false, null);
                return;
            }
            case 12: {
                com.mg.sq.a.s().a(true, null);
                return;
            }
        }
        ag.b().a(this.h(), false);
    }

    protected final void g() {
        if (this.q != null) {
            this.q.i();
        }
        if (this.k == 0) {
            if (this.y > 0) {
                --this.y;
                if (this.y == 1) {
                    bd bd2 = new bd("Đồng ý", 12);
                    gt gt2 = this;
                    gt2.a(bd2, true);
                    return;
                }
            }
            if (this.w.g() > 29L) {
                com.mg.sq.a.s().a(false, null);
                this.w.b();
            }
        }
    }

    public final long u() {
        return this.l.X;
    }
}
