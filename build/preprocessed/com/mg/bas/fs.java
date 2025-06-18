package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class fs
extends aq {
    private dn i;
    private boolean j = false;

    public fs(dn dn2, boolean bl, int n2) {
        this.i = dn2;
        this.j = bl;
        this.d(n2);
        this.e(dn2.c.c() + 4);
    }

    public final void d(boolean bl) {
        if (bl || this.g != bl) {
            this.c = true;
        }
        super.d(bl);
    }

    public final boolean f(int n2) {
        int n3 = this.i.d;
        if (n3 < 0) {
            return false;
        }
        switch (n2) {
            case 97: {
                n3 = this.i.c.b(this.i.d);
                break;
            }
            case 96: {
                n3 = this.i.c.c(this.i.d);
                break;
            }
            case 99: {
                n3 = this.i.c.d(this.i.d);
                break;
            }
            case 98: {
                n3 = this.i.c.e(this.i.d);
                break;
            }
            default: {
                return false;
            }
        }
        if (n3 >= 0 && n3 < this.i.c.d().d()) {
            this.i.d = n3;
            this.b.c(true);
            return true;
        }
        return false;
    }

    public final boolean c(int n2, int n3) {
        if (this.i.d < 0) {
            return false;
        }
        n2 -= this.c();
        n3 -= this.d();
        int n4 = this.i.c.d().d();
        int n5 = 0;
        while (n5 < n4) {
            n n6 = this.i.c.a(n5);
            if (n2 >= n6.d() && n2 <= n6.d() + n6.f() && n3 >= n6.e() && n3 <= n6.e() + n6.g()) {
                if (n6.c() == 0 || n6.c() == 2) break;
                this.i.d = n5;
                return false;
            }
            ++n5;
        }
        return false;
    }

    public final void a(Graphics graphics, int n2, int n3) {
        if (!this.c) {
            return;
        }
        n3 += this.d();
        n2 += this.c();
        if (this.i.b == 0) {
            if (this.g) {
                graphics.setColor(7267055);
            } else {
                graphics.setColor(2401717);
            }
            graphics.fillRect(n2, n3, this.e(), this.f());
            bx.d.c(true);
            this.i.c.a(graphics, n2 + 2, n3 + 2);
            bx.d.c();
        } else if (this.i.b == 1) {
            int n4 = -1;
            if (!this.j) {
                n4 = 13365492;
                graphics.fillRect(n2, n3, this.e(), this.f());
            }
            if (this.g) {
                n4 = 7267055;
            }
            if (n4 >= 0) {
                graphics.setColor(n4);
                graphics.fillRect(n2, n3, this.e(), this.f());
            }
            this.i.c.a(graphics, n2 + 2, n3 + 2);
            if (this.g) {
                graphics.drawImage(pc.e, n2 + this.e() - 20, n3 + this.f() - 18, 0);
            }
        } else {
            if (this.g) {
                graphics.setColor(7267055);
                graphics.fillRect(n2, n3, this.e(), this.f());
            }
            this.i.c.a(graphics, n2 + 2, n3 + 2);
            if (this.g && this.i.d >= 0) {
                n n5 = this.i.c.a(this.i.d);
                graphics.drawImage(pc.e, n2 + n5.d() + n5.f() / 2 + 6, n3 + n5.e() + n5.g() / 2, 17);
            }
        }
        this.c = false;
    }
}
