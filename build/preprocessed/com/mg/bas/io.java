package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class io
extends at {
    private mt a;
    private int b;
    private int c = 0;
    private lp[] d;

    public io(int n, mt mt2) {
        this.a = mt2;
        this.b = n;
        this.r = false;
    }

    public final void a(int n, ni ni2, int n2, int n3) {
        int n4 = n3 + 30;
        if (this.d == null) {
            this.d = new lp[6];
            n3 = 0;
            while (n3 < this.d.length) {
                this.d[n3] = new lp(n);
                ++n3;
            }
        }
        n3 = 0;
        while (n3 < 3) {
            this.d[n3 << 1].b(n2 - 10 + cv.a() % 5, n4 + cv.a() % 10, cv.a(6) + 25);
            this.d[(n3 << 1) + 1].b(n2 + 10 + cv.a() % 5, n4 + cv.a() % 10, cv.a(6) + 25);
            n4 -= 25;
            ++n3;
        }
        switch (n) {
            case 0: {
                mp.a().a(1003);
                break;
            }
            case 1: {
                mp.a().a(2005);
                break;
            }
            case 2: {
                mp.a().a(4004);
            }
        }
        this.c = 10;
        this.r = true;
    }

    public final void a() {
        this.r = false;
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.r) {
            return;
        }
        int n3 = 0;
        while (n3 < this.d.length) {
            this.d[n3].a(graphics, n, n2);
            ++n3;
        }
    }

    public final void i() {
        if (this.r) {
            if (this.c > 0) {
                --this.c;
                if (this.c == 0) {
                    this.a.a((this.b + 1) % 2, 34, 24, true);
                }
            }
            int n = 0;
            while (n < this.d.length) {
                this.d[n].i();
                ++n;
            }
        }
    }
}
