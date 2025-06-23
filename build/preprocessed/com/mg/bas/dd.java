package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// UI component for displaying player or object stats, with custom rendering for level and other attributes, extending at.
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class dd
extends at {
    private k a;
    private k b;
    private k c;
    private k d;
    private lh e;
    private mg f;

    public dd(lh object) {
        this.e = object;
        this.f = mb.a((lh)object, false);
        this.f.a(lc.a((lh)object));
        this.f.a(nr.a((lh)object));
        this.f.c(2);
        this.o = 240;
        this.p = 70;
        this.a = new k(5, 2, 56, 63);
        this.b = new k(112, 2, 122, 16);
        this.c = new k(112, 21, 122, 16);
        this.d = new k(112, 38, 122, 16);
        new k(112, 55, 122, 16);
    }

    public final void a(Graphics graphics, int n, int n2) {
        graphics.setColor(v.aj);
        pc.b(graphics, this.c.a + n, this.c.b + n2, this.c.c, this.c.d, 1070484, 16579764, 14542575);
        bx.d.a(graphics, "Cấp", this.c.a + n - 6, this.c.b + n2, 2);
        pc.b(graphics, this.d.a + n, this.d.b + n2, this.d.c, this.d.d, 1070484, 16579764, 14542575);
        bx.d.a(graphics, "D.Vọng", this.d.a + n - 6, this.d.b + n2, 2);
        if (this.f != null) {
            com.mg.sq.a.h.a(graphics, this.e.Q, this.b.a + n + this.b.c - 5, this.b.b + n2, 2);
            bx.c.a(graphics, String.valueOf(this.e.G), this.c.a + n + 5, this.c.b + n2 + 1, 0);
            bx.c.a(graphics, "[" + this.e.S + "]", this.c.a + n + this.b.c - 5, this.c.b + n2 + 1, 2);
            bx.c.a(graphics, String.valueOf(this.e.ab), this.d.a + n + 5, this.d.b + n2 + 1, 0);
            bx.c.a(graphics, "[" + this.e.R + "]", this.d.a + n + this.b.c - 5, this.d.b + n2 + 1, 2);
        }
        pc.c(graphics, this.a.a + n, this.a.b + n2, this.a.c, this.a.d);
        if (this.f != null) {
            pc.b(graphics, this.a.a + n + this.a.c - 13, this.a.b + n2 + this.a.d - 16, this.e.g);
            this.f.a(graphics, this.a.a + n + 2, this.a.b + n2 + 7);
        }
    }

    public final void i() {
        if (this.f != null) {
            this.f.i();
        }
    }
}
