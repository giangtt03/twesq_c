package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class fq
extends aq {
    private dm i;
    private int j = 0;
    private int k = 15;

    public final int a() {
        return this.j;
    }

    public fq(dm dm2, int n) {
        this.i = dm2;
        this.d(n);
        this.e(dm2.a() + 15);
        this.r();
    }

    public final void c(boolean bl) {
        super.c(bl);
        if (!this.b.m() && bl) {
            if (this.i.c() <= 0) {
                return;
            }
            ls ls2 = this.i.b();
            ls2.a(this.i.b, false);
        }
    }

    public final void d(boolean bl) {
        if (bl || this.g != bl) {
            this.c = true;
            this.a(this.i.c, this.i.b, bl);
        }
        super.d(bl);
    }

    public final void q() {
        int n2 = this.i.c() - 1;
        this.a(n2, this.i.c(n2).k(), this.g);
        this.s();
    }

    public final void r() {
        try {
            this.a(0, this.i.c(0).j(), this.g);
            this.s();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void s() {
        this.j = 0;
        int n2 = 0;
        while (n2 < this.i.c) {
            this.j += this.i.a(n2);
            ++n2;
        }
    }

    public final boolean c(int n2, int n3) {
        n2 -= this.c();
        n3 -= this.d();
        n2 -= 10;
        int n4 = 10;
        int n5 = 10;
        int n6 = 0;
        int n7 = this.i.c();
        while (n6 < n7) {
            ls ls2 = this.i.b(n6).a();
            if (n3 <= (n4 += this.i.b(n6).c() + 4)) {
                n4 = n6;
                this.b.c(true);
                n6 = ls2.d().d();
                n3 -= n5;
                n5 = 0;
                while (n5 < n6) {
                    n n8 = ls2.a(n5);
                    if (n2 >= n8.d() && n2 <= n8.d() + n8.f() && n3 >= n8.e() && n3 <= n8.e() + n8.g()) {
                        if (n8.c() == 0 || n8.c() == 2) break;
                        n2 = n5;
                        this.a(n4, n2, this.g);
                        this.s();
                        return false;
                    }
                    ++n5;
                }
                this.a(n4, -1, this.g);
                this.s();
                break;
            }
            n5 = n4 += 4;
            ++n6;
        }
        return false;
    }

    private void a(int n2, int n3, boolean bl) {
        if (this.i.c() <= 0) {
            return;
        }
        ls ls2 = this.i.b();
        ls2.a(this.i.b, false);
        this.i.c = n2;
        this.i.b = n3;
        ls2 = this.i.b();
        ls2.a(this.i.b, bl);
    }

    public final boolean f(int n2) {
        if (this.i.c() <= 0) {
            return false;
        }
        int n3 = this.i.b;
        if (n3 >= 0) {
            switch (n2) {
                case 97: {
                    n3 = this.i.c(this.i.c).b(n3);
                    break;
                }
                case 96: {
                    n3 = this.i.c(this.i.c).c(n3);
                    break;
                }
                case 99: {
                    n3 = this.i.c(this.i.c).d(n3);
                    break;
                }
                case 98: {
                    n3 = this.i.c(this.i.c).e(n3);
                    break;
                }
                default: {
                    return false;
                }
            }
            if (n3 != this.i.b && n3 >= 0 && n3 < this.i.c(this.i.c).d().d()) {
                this.a(this.i.c, n3, this.g);
                this.s();
                this.b.c(true);
                return true;
            }
        }
        if (n3 < 0) {
            switch (n2) {
                case 99: {
                    if (this.i.c <= 0) break;
                    this.a(this.i.c - 1, this.i.c(this.i.c - 1).k(), this.g);
                    this.s();
                    ay ay2 = (ay)this.l().l();
                    if (!ay2.t()) {
                        ay2.j(-18);
                    }
                    this.b.c(true);
                    return true;
                }
                case 98: {
                    if (this.i.c >= this.i.c() - 1) break;
                    this.a(this.i.c + 1, this.i.c(this.i.c + 1).j(), this.g);
                    this.s();
                    ay ay3 = (ay)this.l().l();
                    if (!ay3.s()) {
                        ay3.j(18);
                    }
                    this.b.c(true);
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final void a(Graphics graphics, int n2, int n3) {
        if (!this.c) {
            return;
        }
        int n4 = n2 += this.c();
        int n5 = n3 += this.d();
        if (this.i.a == 0) {
            cw.a(graphics, n2, n3, this.e(), this.f(), this.e() - this.k, 14808319, 152707);
            n2 += 10;
        } else if (this.i.a == 1) {
            cw.a(graphics, n2, n3, this.e(), this.f(), this.k, 16775619, 8023552);
            n2 += 10;
        } else {
            cw.a(graphics, n2, n3, this.e(), this.f(), -1, 13931764, 6102397);
            n2 += 10;
        }
        n3 += 10;
        int n6 = this.e() - 34;
        int n7 = 0;
        int n8 = this.i.c() - 1;
        while (n7 <= n8) {
            dj dj2 = this.i.b(n7);
            if (dj2 != null) {
                if (dj2.a() != null) {
                    dj2.a().a(graphics, n2, n3);
                }
                if (dj2.b() >= 0) {
                    oy.a(graphics, dj2.b(), n2, n3, 0);
                }
                if (n7 < n8) {
                    graphics.setColor(0xD4D2D2);
                    graphics.fillRect(n2 + 5, n3 += dj2.c() + 4, n6, 1);
                }
                n3 += 4;
            }
            ++n7;
        }
        n5 += 4;
        if (this.g && this.b.m()) {
            if (this.i.b < 0) {
                n5 += this.j + this.i.b().c();
                if (this.i.a == 2) {
                    graphics.drawImage(pc.e, n4 + this.e() - 20, n5 - 10, 0);
                } else {
                    graphics.drawImage(pc.f, n4 + this.e() - 20, n5, 0);
                }
            } else {
                n n9 = this.i.b().a(this.i.b);
                graphics.drawImage(pc.e, n2 + n9.d() + n9.f() / 2 + 6, n5 + 8 + this.j + n9.e() + n9.g() / 2, 17);
            }
        }
        this.c = false;
    }
}
