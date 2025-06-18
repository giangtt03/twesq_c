package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class gl
extends aq {
    private int i;

    public gl(int n) {
        this.i = n;
        this.e(22);
        this.d(v.t);
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
        n += this.c();
        n2 += this.d();
        if (this.g) {
            pc.e(graphics, n - 2, n2, this.e(), this.f());
        }
        com.mg.sq.a.g.c(true);
        com.mg.sq.a.g.a(graphics, "Xem thêm...", n + this.i, n2 + 4, 0);
        com.mg.sq.a.g.c();
        this.c = false;
    }
}
