package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class fw
extends fv
implements bf {
    private ll a;
    private byte b;
    private lm c;
    private d d;
    private String[] e;
    private boolean f;
    private k g;
    private boolean h;
    private String i;
    private String j;
    private fu k;
    private String s;
    private String[] t = null;
    private String[] u = new String[]{"Đồ giành cho NAM", "Đồ giành cho NỮ", "Giành cho cả NAM & NỮ"};

    public fw(Object object) {
        if (object instanceof lm) {
            this.c = (lm)object;
            this.j = this.c.b;
            this.d = bx.d;
            this.a();
            return;
        }
        if (object instanceof ll) {
            this.a = (ll)object;
            this.j = this.a.d;
            this.b = (byte)this.a.j;
            if (v.t >= v.u && v.t == 320) {
                this.f = true;
            }
            int n = 0;
            if (this.a.i > go.k.G) {
                this.i = "Chưa đủ cấp độ yêu cầu";
            } else {
                ++n;
            }
            if (this.a.h == 2 || this.a.h == go.k.f) {
                ++n;
            } else {
                this.i = this.u[this.a.h == 9 ? 2 : (int)this.a.h];
            }
            this.h = n == 2;
            this.d = ll.a(this.a.m);
            this.e = com.mg.sq.a.a(this.a);
            if (this.a.q > 0) {
                n = this.a.p * 100 / this.a.q < 30 ? 1 : 0;
                this.s = "Độ bền: " + this.a.p + "/" + this.a.q + (this.a.p == 0 ? " (Đã hư hoàn toàn)" : (n != 0 ? " (Đã hư hỏng nặng)" : ""));
            }
            this.a();
            return;
        }
        throw new IllegalArgumentException("Object must be instance GameItem or Equipment");
    }

    private void a() {
        if (v.z) {
            this.k = new fu(gb.f, 0);
            byte[] byArray = gb.e[3];
            this.k.b(byArray[0], byArray[1], byArray[2], byArray[3]);
            this.k.b(byArray[2], byArray[3]);
            this.k.a(this);
        }
    }

    public final void a(int n, int n2, int n3, int n4) {
        super.a(n, n2, n3, n4);
        if (this.c != null) {
            this.e = bx.a(this.c.d, this.o - 10, bx.d);
            this.i((this.d.a() << 1) + this.e.length * (bx.d.a() + 1) + 10);
        } else {
            if (this.e != null) {
                this.i((this.f ? (this.e.length + 1) / 2 : this.e.length) * bx.d.a() + (this.h ? 55 : 70) + 15);
            }
            if (this.a.g != null && !this.a.g.equals("")) {
                this.t = bx.a(this.a.g, this.o - 20);
                this.p += this.t.length * (bx.c.a() + 1);
            }
        }
        this.g = new k(5, 5, this.o - 10, this.p - 10);
        if (this.k != null) {
            this.k.a(this.o - this.k.e() - 2, 2, this.k.e(), this.k.f());
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.r) {
            return;
        }
        pc.b(graphics, n += this.m, n2 += this.n, this.p(), this.q(), v.aj, true);
        if (this.a != null) {
            int n3;
            if (this.a.f > 0) {
                pc.b(graphics, n + 5, n2 + 5 - (pc.h.getHeight() - bx.d.b()), this.a.f);
            }
            if (this.b <= 0) {
                this.d.a(graphics, this.j, n + 5 + 15, n2 + 5, 0);
            } else {
                this.d.a(graphics, String.valueOf(this.j) + " +" + this.b, n + 5 + 15, n2 + 5, 0);
            }
            int n4 = 5 + (bx.d.a() + 1);
            d d2 = this.a.i > go.k.G ? com.mg.sq.a.h : bx.c;
            d2.a(graphics, "Yêu cầu cấp: " + this.a.i, n + 3, n2 + n4, 0);
            n4 += bx.c.a() + 1;
            d2 = this.a.p < 10 ? com.mg.sq.a.h : bx.c;
            if (this.s != null) {
                d2.a(graphics, this.s, n + 3, n2 + n4, 0);
                n4 += bx.c.a() + 1;
            }
            if (this.e != null) {
                n3 = this.e.length;
                d2 = com.mg.sq.a.g;
                if (this.f) {
                    n3 = (this.e.length + 1) / 2;
                    int n5 = n4;
                    int n6 = this.g.c / 2;
                    int n7 = 0;
                    while (n7 < this.e.length) {
                        d2.a(graphics, this.e[n7], n + 3 + n7 % 2 * n6, n2 + n5, 0);
                        n5 += n7 % 2 == 0 ? 0 : bx.c.a();
                        ++n7;
                    }
                } else {
                    bx.a(graphics, d2, this.e, n + 3, n2 + n4, this.g.c, this.g.d, 0);
                }
                n4 += n3 * d2.a() + 1;
            }
            if (this.t != null) {
                n3 = 0;
                while (n3 < this.t.length) {
                    bx.c.a(graphics, this.t[n3], n + 3, n2 + n4, 0);
                    n4 += d2.a() + 1;
                    ++n3;
                }
            }
            if (!this.h) {
                com.mg.sq.a.h.a(graphics, this.i, n + 3, n2 + n4, 0);
                n4 += com.mg.sq.a.h.a() + 1;
            }
            if (this.s != null) {
                String string = !this.a.c() ? "Không thể sửa chữa" : "Cần " + this.a.k + " búa để sửa chữa";
                com.mg.sq.a.h.a(graphics, string, n + 3, n2 + n4, 0);
                n4 += n4 + (com.mg.sq.a.h.a() + 1);
            }
            if (!this.a.a()) {
                com.mg.sq.a.h.a(graphics, "Không thể giao dịch", n + 3, n2 + n4, 0);
            }
        } else {
            this.d.c(true);
            this.d.a(graphics, this.j, n + 5, n2 + 5, 0);
            this.d.c(false);
            int n8 = 5 + (this.d.a() + 1);
            bx.a(graphics, bx.c, this.e, n + 3, n2 + n8, this.g.c, this.g.d, 0);
            n8 += this.e.length * bx.c.a() + 1;
            if (!this.c.a()) {
                com.mg.sq.a.h.a(graphics, "Không thể giao dịch", n + 3, n2 + n8, 0);
            }
            switch (this.c.e) {
                case 3: {
                    break;
                }
                case 2: {
                    break;
                }
                case 0: {
                    com.mg.sq.a.h.a(graphics, "Chỉ sử dụng trong trận đấu", n + 3, n2 + n8, 0);
                }
            }
        }
        if (this.k != null) {
            this.k.a(graphics, n, n2);
        }
    }

    public final void d(int n, int n2) {
        this.r = false;
    }

    public final void g(int n, int n2) {
        if (this.k != null && this.k.h().a(n - this.n(), n2 - this.o())) {
            n = this.k.a();
            n = -1;
            fw fw2 = this;
            this.r = false;
        }
    }
}
