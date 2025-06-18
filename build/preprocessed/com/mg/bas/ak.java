package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// UI or game logic class extending am, manages state, rendering, and transitions for a specific component.
import javax.microedition.lcdui.Graphics;

public class ak
extends am {
    private int c = 0;
    protected int a = 0;
    private int d = 5;
    private an k;
    private ad l;
    private boolean m;
    private boolean n;
    protected int b = v.am;

    public ak() {
        this.e = -100001;
        this.a();
    }

    public final void a() {
        this.f = v.t;
        this.g = v.u;
        this.c = 0;
        this.a = 0;
        this.d = 5;
        this.k = null;
        this.m = false;
    }

    public final void a(an an2, ad ad2, boolean bl) {
        if (an2 != null) {
            this.k = an2;
            this.l = ad2;
            this.m = true;
            this.n = bl;
        }
    }

    public final void a(int n) {
        this.a = 0;
    }

    public void b_() {
        if (this.a >= 100) {
            if (this.k != null) {
                ag.b().a(this.k, this.n, this.l);
                this.k = null;
                return;
            }
        } else {
            if (this.m) {
                this.d += 3;
            }
            this.a += this.d;
            if (this.a > 100) {
                this.a = 100;
            }
        }
    }

    protected void a(Graphics graphics) {
        graphics.setColor(this.b);
        graphics.fillRect(0, 0, this.f, this.g);
    }

    protected void b(Graphics graphics) {
        graphics.setColor(0xFFFFFF);
        graphics.drawRect(0, this.g - 20, this.f, 19);
        int n = this.g - 20;
        graphics.setColor(15484506);
        graphics.fillRect(0, n + 1, this.a * this.f / 100, 18);
        bx.b.a(graphics, "Vui lòng chờ...", this.f / 2, n + 3, 1);
    }

    public final void c(Graphics graphics) {
        if (this.c <= 2) {
            this.a(graphics);
            ++this.c;
        }
        this.b(graphics);
    }
}
