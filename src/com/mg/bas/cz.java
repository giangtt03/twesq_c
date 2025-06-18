package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class cz
extends at {
    private lh a;
    private mg b;
    private k c;
    private k d;
    private k e;
    private boolean f;
    private boolean g = true;
    private lh h;
    private String[][] i = new String[][]{{"Công", "C.Xác", "S.Lực"}, {"P.Thủ", "N.Tránh", "C.Mạng"}};

    public cz(lh lh2) {
        this.a(lh2, true);
        this.h = com.mg.sq.a.a(lh2.a());
        this.c = new k(5, 5, 50, 59);
        if (v.t >= v.u && v.t == 320) {
            this.f = true;
        }
        int n = this.f ? 60 : 45;
        this.d = new k(this.c.a + this.c.c + 40, 9, n, 15);
        this.e = new k(this.d.a + this.d.c + n + 5, this.d.b, n, 15);
        this.o = 240;
        this.p = 70;
    }

    public final void a(Graphics graphics, int n, int n2) {
        pc.c(graphics, this.c.a + n, this.c.b + n2, this.c.c, this.c.d);
        if (this.g) {
            int n3 = 0;
            int n4 = 0;
            while (n4 < 3) {
                pc.b(graphics, this.d.a + n, this.d.b + n3 + n2, this.d.c, this.d.d, 1070484, 16579764, 14542575);
                bx.c.a(graphics, this.i[0][n4], this.d.a - 3 + n, this.d.b + n2 + n3, 2);
                n3 += this.d.d + 3;
                ++n4;
            }
            n4 = this.d.a + this.d.c / 2 + n;
            n3 = (this.d.d - bx.d.a()) / 2 + 1;
            int n5 = this.a.x - this.h.x;
            d d2 = cz.a(n5);
            d2.a(graphics, String.valueOf(this.a.x), n4, this.d.b + n3 + n2, 1);
            int n6 = this.a.B - this.h.B;
            d d3 = cz.a(n6);
            d3.a(graphics, String.valueOf(this.a.B), n4, this.d.b + (n3 += this.d.d + 3) + n2, 1);
            int n7 = this.a.r - this.h.r;
            d d4 = cz.a(n7);
            d4.a(graphics, String.valueOf(this.a.r), n4, this.d.b + (n3 += this.d.d + 3) + n2, 1);
            n3 = 0;
            n4 = 0;
            while (n4 < 3) {
                pc.b(graphics, this.e.a + n, this.e.b + n3 + n2, this.e.c, this.e.d, 1070484, 16579764, 14542575);
                bx.c.a(graphics, this.i[1][n4], this.e.a - 3 + n, this.e.b + n2 + n3, 2);
                n3 += this.e.d + 3;
                ++n4;
            }
            n4 = this.e.a + this.e.c / 2 + n;
            n3 = (this.e.d - bx.d.a()) / 2 + 1;
            int n8 = this.a.z - this.h.z;
            d d5 = cz.a(n8);
            d5.a(graphics, String.valueOf(this.a.z), n4, this.e.b + n3 + n2, 1);
            int n9 = this.a.A - this.h.A;
            d d6 = cz.a(n9);
            d6.a(graphics, String.valueOf(this.a.A), n4, this.e.b + (n3 += this.e.d + 3) + n2, 1);
            int n10 = this.a.C - this.h.C;
            d d7 = cz.a(n10);
            d7.a(graphics, String.valueOf(this.a.C) + "%", n4, this.e.b + (n3 += this.e.d + 3) + n2, 1);
        }
        if (this.b != null) {
            pc.b(graphics, this.c.a + n, this.c.b + this.c.d + n2 - 17, this.a.g);
            this.b.a(graphics, n + this.c.a, n2 + this.c.b + 4);
        }
    }

    private static d a(int n) {
        d d2 = n > 0 ? com.mg.sq.a.g : (n < 0 ? com.mg.sq.a.h : bx.d);
        return d2;
    }

    public final void i() {
        if (this.b != null) {
            this.b.i();
        }
    }

    private void a(lh lh2, boolean bl) {
        this.a = com.mg.sq.a.a(lh2);
        if (bl) {
            this.b = mb.a(lh2, false);
            this.b.a(lc.a(lh2));
            this.b.a(nr.a(lh2));
            this.b.c(2);
            this.g = true;
        }
    }

    public final void a(ll ll2) {
        if (ll2 == null) {
            return;
        }
        ll[] llArray = this.a.D;
        boolean bl = false;
        if (llArray != null && llArray.length > 0) {
            int n = 0;
            while (n < llArray.length) {
                if (llArray[n].e == ll2.e) {
                    if (llArray[n].b == ll2.b) {
                        return;
                    }
                    this.a.D[n] = ll2;
                    bl = true;
                    break;
                }
                ++n;
            }
        }
        if (!bl) {
            if (this.a.D == null || this.a.D.length == 0) {
                this.a.D = new ll[]{ll2};
            } else {
                ll[] llArray2 = new ll[this.a.D.length + 1];
                System.arraycopy(this.a.D, 0, llArray2, 0, this.a.D.length);
                llArray2[this.a.D.length] = ll2;
                this.a.D = llArray2;
            }
        }
        this.a(this.a, ll2.e != 3);
    }

    public final void b(ll ll2) {
        if (ll2 == null) {
            return;
        }
        ll[] llArray = this.a.D;
        if (this.a.D != null && llArray.length > 0) {
            int n = 0;
            while (n < llArray.length) {
                if (llArray[n].equals(ll2)) {
                    if (llArray.length == 1) {
                        this.a.D = new ll[0];
                    } else {
                        this.a.D = new ll[llArray.length - 1];
                        System.arraycopy(llArray, 0, this.a.D, 0, n);
                        System.arraycopy(llArray, n + 1, this.a.D, n, this.a.D.length - n);
                    }
                }
                ++n;
            }
        }
        if (ll2.e != 3) {
            this.b = mb.a(this.a, false);
            this.b.a(lc.a(this.a));
            this.b.a(nr.a(this.a));
            this.b.c(2);
        }
        this.a = com.mg.sq.a.a(this.a);
    }
}
