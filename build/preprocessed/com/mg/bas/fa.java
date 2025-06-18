package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class fa
extends aq {
    public boolean i;
    public boolean j;
    public long k;
    private String m;
    private String n;
    public int l = 0;

    public fa(boolean bl, long l, String string, String string2, int n, int n2) {
        this.j = bl;
        this.k = l;
        this.m = string;
        this.n = string2;
        this.l = n;
        this.d(n2);
    }

    public final void d(boolean bl) {
        if (bl) {
            this.e(40);
        } else {
            this.e(22);
        }
        if (bl || this.g != bl) {
            this.c = true;
        }
        super.d(bl);
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.c) {
            return;
        }
        n2 += this.d();
        n += this.c() + 2;
        if (this.g) {
            pc.e(graphics, n - 2, n2, this.e(), this.f());
        }
        n2 += 3;
        if (this.j) {
            d d2 = bx.d;
            d2.c(true);
            d2.a(graphics, this.m, n + 25, n2 + 3, 0);
            d2.c();
            if (this.g) {
                d2 = bx.c;
                d2.a(graphics, this.n, n + 25, n2 + 19, 0);
            }
            if (this.i) {
                pc.d(graphics, -18, n + 3, n2 + 4, 0);
            } else {
                pc.d(graphics, -17, n + 3, n2 + 4, 0);
            }
        } else {
            bx.d.a(graphics, this.m, n + 25, n2 + 4, 0);
            pc.d(graphics, -11, n + 3, n2 + 4, 0);
            if (this.g) {
                com.mg.sq.a.g.a(graphics, this.n, n + 25, n2 + 18, 0);
            }
        }
        this.c = false;
    }
}
