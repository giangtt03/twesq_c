package com.mg.bas;

// Decompiled with: CFR 0.152
// Class Version: 1
// UI/game dialog or message box component, displays multi-line text and manages layout. Extends al.
import javax.microedition.lcdui.Graphics;

public final class bv
extends al {
    private String[] k;
    private int l;
    private int m;
    private String n;
    private int o = 0;
    private int p = 2;
    private boolean q = false;
    private int r = 20;
    private int s = 0;
    private int t = 6;
    private int u;
    private int vLen;

    public bv(String n, String string, String[] stringArray, int[] nArray, int param) {
        super(param);
        this.n = n;
        this.s = 1;
        if (this.s == 0) {
            this.c = 0;
            this.u = this.f = v.t;
        } else {
            this.c = 10;
            this.u = this.f = v.t - 20;
        }
        this.k = bx.a(string, this.u - (this.t << 1));
        if (this.s == 0) {
            this.l = 0;
            this.m = v.u - ba.a;
        } else {
            int n2 = this.k.length;
            n2 = (n2 + 2) * bx.c.a();
            this.l = (this.g - ba.a - n2) / 2;
            this.m = (this.g - ba.a + n2) / 2 + bx.c.a();
            if (this.l < 0) this.l = 0;
            if (this.m > v.u - ba.a) this.m = v.u - ba.a;
        }
        this.d = this.l;
        this.vLen = this.m - this.l;
        if (this.s != 0) {
            this.f = this.u;
            this.g = this.vLen;
        }
        if (stringArray != null) {
            if (stringArray.length == 1) {
                this.a(new bd(stringArray[0], nArray[0]));
                return;
            }
            if (stringArray.length == 2) {
                bd bd2 = new bd(stringArray[0], nArray[0]);
                this.a(bd2, true);
                bd2 = new bd(stringArray[1], nArray[1]);
                this.b(bd2, true);
                return;
            }
            bd bd3 = new bd(stringArray[0], nArray[0]);
            this.a(bd3, true);
            this.a(new bd(stringArray[1], nArray[1]));
            bd3 = new bd(stringArray[1], nArray[2]);
            this.b(bd3, true);
        }
    }

    public final void c(int n) {
        if (n == 99) {
            this.r = 20;
            if (this.o < 0) {
                this.o += this.p;
                return;
            }
        } else if (n == 98) {
            this.r = 20;
        }
    }

    public final void a(int n, int n2) {
        this.r = 20;
    }

    protected final void g() {
        if (this.r > 0) {
            --this.r;
        }
    }

    public final void c(Graphics graphics) {
        ag.c().a(graphics, this.c, this.d, this.u, this.vLen);
        if (this.n != null && this.n.length() > 0) {
            bx.b.a(graphics, this.n, this.c + this.f / 2, this.l + bx.b.a() - 5, 1);
        }
        cw.a(graphics, this.c + this.t, this.l + (bx.c.a() << 1) - 5, this.u - (this.t << 1), this.vLen - 2 * bx.c.a());
        bx.a(graphics, bx.c, this.k, this.c + this.t, this.l + (bx.c.a() << 1) - 5 + this.o + (this.n.length() > 1 ? 5 : 0), this.u - (this.t << 1), this.vLen - 2 * bx.c.a() + 5 - this.o, 1);
        cw.a(graphics, this.c + this.t, this.l + bx.c.a() - 5, this.u - (this.t << 1), this.vLen - bx.c.a());
        bx.a(graphics, bx.c, this.k, this.c + this.t, this.l + bx.c.a() - 5 + this.o + 5, this.u - (this.t << 1), this.vLen - bx.c.a() + 5 - this.o, 1);
    }
}
