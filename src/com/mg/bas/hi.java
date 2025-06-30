package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class hi
extends at {
    private Image a = com.mg.bas.f.d("/m/fsw");
    private Image b = pc.b;
    private int c;
    private int d = this.b.getWidth() / 3;
    private int e = this.b.getHeight();
    private int f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private cp k;

    public hi() {
        try {
            this.k = new cp("vs");
            this.k.b();
            return;
        }
        catch (Exception exception) {
            if (this.k != null) {
                this.k.a();
                this.k = null;
            }
            ct.a("[FightEffect]  Loi am thanh fighteffect");
            return;
        }
    }

    public final void a() {
        this.g = 15;
        this.h = 0;
        this.j = false;
        this.i = false;
        this.c = 0;
    }

    public final void i() {
        if (this.i) {
            return;
        }
        ++this.c;
        if (this.c % 2 == 0) {
            return;
        }
        if (this.g > 0) {
            this.g -= 3;
        }
        if (!this.j) {
            ++this.f;
            if (this.f >= 2) {
                this.f = 2;
                this.j = true;
                return;
            }
        } else {
            this.h += 5;
            --this.f;
            if (this.f < 0) {
                this.f = 0;
                this.i = true;
                if (this.k != null) {
                    this.k.a();
                    this.k = null;
                }
            }
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        graphics.drawImage(this.a, n + this.m + this.g, n2 + this.n + this.g, 3);
        graphics.drawRegion(this.a, 0, 0, 24, 24, 2, n + this.m - this.g, n2 + this.n + this.g, 3);
        if (this.i) {
            return;
        }
        if (!this.j) {
            cw.a(graphics, this.b, this.d * this.f, 0, this.d, this.e, n + this.m, n2 + this.n, 3);
            return;
        }
        cw.a(graphics, this.b, this.d * this.f, 0, this.d, this.e, n + this.m + this.h, n2 + this.n, 3);
        cw.a(graphics, this.b, this.d * this.f, 0, this.d, this.e, n + this.m, n2 + this.n + this.h, 3);
        cw.a(graphics, this.b, this.d * this.f, 0, this.d, this.e, n + this.m - this.h, n2 + this.n, 3);
        cw.a(graphics, this.b, this.d * this.f, 0, this.d, this.e, n + this.m, n2 + this.n - this.h, 3);
        cw.a(graphics, this.b, this.d * this.f, 0, this.d, this.e, n + this.m + this.h, n2 + this.n + this.h, 3);
        cw.a(graphics, this.b, this.d * this.f, 0, this.d, this.e, n + this.m + this.h, n2 + this.n - this.h, 3);
        cw.a(graphics, this.b, this.d * this.f, 0, this.d, this.e, n + this.m - this.h, n2 + this.n + this.h, 3);
        cw.a(graphics, this.b, this.d * this.f, 0, this.d, this.e, n + this.m - this.h, n2 + this.n - this.h, 3);
    }
}
