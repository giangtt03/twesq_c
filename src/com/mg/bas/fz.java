package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fz
extends aq {
    public lr i;
    private static Image j;
    private static Image k;
    private static Image l;

    public fz(lr lr2) {
        this.i = lr2;
        this.e(22 + bx.d.a());
        this.d(v.t);
        if (lr2.a() && j == null) {
            j = f.d("/m/lock");
        }
        if (l == null) {
            l = f.d("/m/arena");
        }
        if (k == null) {
            k = f.d("/m/room");
        }
    }

    public final void d(boolean bl) {
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
        d d2 = bx.d;
        d2.c(true);
        if (this.g) {
            pc.e(graphics, n - 2, n2, this.e(), this.f());
        }
        if (this.i.e != null) {
            bx.a(graphics, com.mg.sq.a.g, this.i.e, n + 50, n2 + 6 + d2.a(), this.e(), this.f(), 0);
        }
        d2.a(graphics, this.i.c, n + 50, n2 + 4, 0);
        d2.c();
        if (this.i.g == 2) {
            if (l != null) {
                graphics.drawImage(l, n + 3, n2 + 3, 0);
            }
        } else if (k != null) {
            graphics.drawImage(k, n + 3, n2 + 3, 0);
        }
        if (this.i.a() && j != null) {
            graphics.drawImage(j, n + v.t - j.getWidth() - 4, n2 + 6, 0);
        }
        this.c = false;
    }
}
