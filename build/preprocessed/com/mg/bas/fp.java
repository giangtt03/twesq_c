package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class fp
extends aq {
    private dl i;
    private boolean j = false;
    private fo k;
    private int l = 0;

  public fp(dl dl2, int n2, boolean s) {
    this.i = dl2;
    this.j = s;
    this.k = new fo();
    int n3 = dl2.a.c() + this.k.f();
    short s2 = 0;
    if (dl2.g >= 0 && n3 < oy.d[dl2.g]) {
        s2 = oy.d[dl2.g];
    }
    int var3_6 = s2 + (bx.d.a() + 26);
    int n4 = 0;
    if (dl2.n) {
        n4 = 7;
    }
    if (this.s()) {
        n4 += dl2.p.c() + 8;
    }
    this.b(n2, var3_6 + n4);
    if (dl2.d != null) {
        this.k.a(dl2.d);
    }
    if (!(dl2.m.length <= 0 && go.e.equals(dl2.c))) {
        this.k.h(1);
    }
    if (dl2.k > 0 || dl2.l) {
        this.k.d(2, dl2.k);
    }
    if (dl2.i == 0) {
        this.k.d(4, dl2.j);
    } else if (dl2.i == 1) {
        this.k.d(3, dl2.j);
    }
    if (dl2.e > 0L) {
        this.k.h(5);
    }
    if (dl2.h < 0) {
        this.k.i(dl2.h + 6);
    }
    this.k.s();
    this.k.a_(this.e() - this.k.e() - 5, this.f() - 6 - this.k.f() - n4);
    if (this.s()) {
        dl2.p.a(4, this.k.d() + this.k.f() + 6);
    }
}

    public final void d(boolean bl) {
        if (bl || this.g != bl) {
            this.c = true;
            if (!bl) {
                this.l = 0;
            }
            this.a(this.i.h, bl);
        }
        super.d(bl);
    }

    public final boolean f(int n2) {
        dl dl2 = this.i;
        int n3 = dl.b(dl2.h);
        ls ls2 = this.i.a();
        if (n3 >= 0) {
            switch (n2) {
                case 97: {
                    n3 = ls2.b(n3);
                    break;
                }
                case 96: {
                    n3 = ls2.c(n3);
                    break;
                }
                case 99: {
                    n3 = ls2.d(n3);
                    break;
                }
                case 98: {
                    n3 = ls2.e(n3);
                    break;
                }
                default: {
                    return false;
                }
            }
            if (n3 < 0) {
                if (n2 == 98 && this.i.h < 1000 || n2 == 99 && this.i.h >= 1000) {
                    if (this.k.t() < 0) {
                        return false;
                    }
                    this.a(this.k.t() - 6, this.g);
                    this.b.c(true);
                    return true;
                }
                return false;
            }
        }
        if (n3 >= 0 && n3 < ls2.d().d()) {
            if (this.i.h >= 1000) {
                this.a(n3 + 1000, this.g);
            } else {
                this.a(n3, this.g);
            }
            this.b.c(true);
            return true;
        }
        if (this.k.f(n2)) {
            this.b.c(true);
            this.a(this.k.t() - 6, this.g);
            return true;
        }
        if (this.i.h < 0 && n2 == 99) {
            n2 = this.i.a.k();
            if (n2 >= 0) {
                this.b.c(true);
                this.a(n2, this.g);
                return true;
            }
            return false;
        }
        if (this.i.h < 1000 && n2 == 98 && this.s()) {
            n2 = this.i.p.j();
            if (n2 >= 0) {
                this.b.c(true);
                this.a(n2 + 1000, this.g);
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a() {
        this.l = 13;
    }

    public final boolean q() {
        int n2;
        if (this.s()) {
            if (this.i.h >= 1000) {
                return false;
            }
            n2 = this.i.p.k();
            if (n2 >= 0) {
                this.b.c(true);
                this.a(n2 + 1000, this.g);
                return true;
            }
        }
        if (this.k.t() >= 0) {
            if (this.i.h < 0) {
                return false;
            }
            this.a(this.k.t() - 6, this.g);
            this.b.c(true);
            return true;
        }
        n2 = this.i.a.k();
        if (n2 == this.i.h) {
            return false;
        }
        this.a(n2, this.g);
        this.b.c(true);
        return true;
    }

    public final boolean r() {
        int n2 = this.i.a.j();
        if (n2 == this.i.h) {
            return false;
        }
        this.a(n2, this.g);
        this.b.c(true);
        return true;
    }

    private boolean s() {
        return this.i.p != null;
    }

    private void a(int n2, boolean bl) {
        boolean bl2;
        int n3;
        Object object;
        Object object2;
        int n4 = this.i.h;
        this.i.h = n2;
        fp fp2 = this;
        int n5 = bx.d.a() + 4;
        n5 += 6;
        if (fp2.i.h >= 0) {
            object2 = fp2.i.a();
            dl dl2 = fp2.i;
            object = ((o)object2).a(dl.b(dl2.h));
            n5 = fp2.i.h >= 1000 ? ((o)object2).f() + ((n)object).e() + ((n)object).g() / 2 : n5 + ((n)object).e() + ((n)object).g() / 2;
            n3 = ((n)object).g();
        } else {
            n5 = fp2.k.d() + 5;
            n3 = fp2.k.f();
        }
        if (fp2.l() == null || fp2.l().l() == null) {
            bl2 = false;
        } else {
            object2 = (ay)fp2.b.l();
            object = ((ay)object2).r();
            if ((n5 += fp2.d() - ((k)object).b) < 0 || n5 + n3 > ((k)object).d) {
                if (n5 < 0) {
                    ((ay)object2).d(2, -1);
                } else {
                    ((ay)object2).d(2, 1);
                }
                bl2 = true;
            } else {
                boolean bl3;
                bl2 = bl3 = false;
            }
        }
        if (bl2) {
            this.i.h = n4;
            return;
        }
        this.i.a(n4).a(dl.b(n4), false);
        this.i.a(n2).a(dl.b(n2), bl);
    }

    public final boolean c(int n2, int n3) {
        int n4;
        int n5;
        if (this.k.c(n2 -= this.c(), n3 -= this.d())) {
            this.a(this.k.t() - 6, this.g);
            return false;
        }
        if (this.s()) {
            n5 = n2 - (2 + this.i.p.e());
            n4 = n3 - this.i.p.f();
            int n6 = this.i.p.d().d();
            int n7 = 0;
            while (n7 < n6) {
                n n8 = this.i.p.a(n7);
                if (n5 >= n8.d() && n5 <= n8.d() + n8.f() && n4 >= n8.e() && n4 <= n8.e() + n8.g()) {
                    if (n8.c() == 0 || n8.c() == 2) break;
                    this.a(n7 + 1000, this.g);
                    return false;
                }
                ++n7;
            }
        }
        n2 -= 2 + this.i.a.e();
        n3 -= bx.d.a() + 4 + 6;
        n5 = this.i.a.d().d();
        n4 = 0;
        while (n4 < n5) {
            n n9 = this.i.a.a(n4);
            if (n2 >= n9.d() && n2 <= n9.d() + n9.f() && n3 >= n9.e() && n3 <= n9.e() + n9.g()) {
                if (n9.c() == 0 || n9.c() == 2) break;
                this.a(n4, this.g);
                return false;
            }
            ++n4;
        }
        return false;
    }

    public final void n() {
        if (this.l > 0) {
            --this.l;
            if (this.g) {
                this.b.c(true);
            }
        }
    }

    public final void a(Graphics graphics, int n2, int n3) {
        Object object;
        int n4;
        if (!this.c) {
            return;
        }
        n3 += this.d();
        n2 += this.c();
        if (this.g) {
            graphics.setColor(7267055);
        } else if (this.j) {
            graphics.setColor(13365492);
        } else {
            graphics.setColor(15916258);
        }
        int n5 = bx.d.a() + 4;
        graphics.fillRect(n2 + 1, n3 + 1, this.e() - 2, n5);
        int n6 = 0;
        if (this.i.n) {
            n6 = 7;
        }
        n6 = this.f() - n6;
        if (this.i.o) {
            graphics.setColor(0xFFFFDD);
            graphics.fillRect(n2 + 1, n3 + n5 + 1, this.e() - 2, n6 - n5 - 2);
        }
        pc.a(graphics, n2, n3, this.e(), n6, 2401717, -1);
        if (this.i.n) {
            n4 = n2 + 20;
            graphics.drawLine(n4, n3 + n6 + 7, n4 - 8, n3 + n6 - 1);
            graphics.drawLine(n4, n3 + n6 + 7, n4 + 8, n3 + n6 - 1);
            graphics.setColor(v.am);
            graphics.fillRect(n4 - 7, n3 + n6 - 1, 15, 1);
        }
        if (this.s()) {
            graphics.setColor(13489618);
            graphics.fillRect(n2 + 1, n3 + this.i.p.f(), this.e() - 2, this.i.p.c());
            this.i.p.a(graphics, n2 + 2, n3);
        }
        n4 = n3 + n5 + 6;
        n5 = n2 + 2;
        if (this.i.g >= 0) {
            oy.a(graphics, this.i.g, n5, n4, 0);
        }
        this.i.a.a(graphics, n5, n4);
        this.k.a(graphics, n2 + 2, n3);
        Object object2 = object = this.g ? com.mg.sq.a.h : bx.c;
        if (pc.c(graphics, n2 + 4, n3 + 2, this.i.f)) {
            ((d)object).a(graphics, this.i.c, n2 + 4 + 20, n3 + 3, 0);
        } else {
            ((d)object).a(graphics, this.i.c, n2 + 4, n3 + 3, 0);
        }
        ((d)object).a(graphics, this.i.b, n2 + this.e() - 4, n3 + 3, 2);
        if (this.g && (this.l & 1) == 0) {
            int n7;
            if (this.i.h >= 0) {
                ls ls2 = this.i.a();
                object = this.i;
                n n8 = ls2.a(dl.b(((dl)object).h));
                n7 = n2 + ls2.e() + n8.d() + n8.f() / 2 + 6;
                n2 = this.i.h >= 1000 ? n3 + ls2.f() + n8.e() + n8.g() / 2 : n4 + n8.e() + n8.g() / 2;
            } else {
                n7 = n2 + this.k.c() + this.k.r() + 10;
                n2 = n3 + this.k.d() + 5;
            }
            graphics.drawImage(pc.e, n7, n2, 17);
        }
        this.c = false;
    }
}
