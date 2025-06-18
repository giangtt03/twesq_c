package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class ft
extends at {
    private int a = 50;
    private long b = 0L;
    private long c = 0L;
    private long d = 0L;
    private String e = "";
    private int f = 0;

    public ft(long l) {
        this.b = l;
        this.e = String.valueOf(l) + "Ken";
        this.m = v.t - 5;
        this.n = v.u - ba.a - bx.c.a();
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.r) {
            return;
        }
        n = bx.c.a(this.e) + 5;
        pc.a(graphics, this.m - n, this.n - 2, n + 5, bx.c.a() + 2, 0, 0xFFFFFF);
        bx.c.a(graphics, this.e, this.m, this.n, 2);
    }

    public final void i() {
        if (this.b == -1L) {
            return;
        }
        if (!this.r) {
            return;
        }
        if (this.b != this.c) {
            this.c += this.d;
            this.e = String.valueOf(i.a(this.c, ".")) + "Ken";
            long l = this.b - this.c;
            this.d = l / 2L + l % 2L;
            return;
        }
        if (this.f < this.a) {
            ++this.f;
            return;
        }
        this.b(false);
    }

    public final void a(long l) {
        this.c = this.b;
        this.b = l;
        if (this.b == -1L) {
            this.e = "?Ken";
            return;
        }
        if (this.c != this.b) {
            long l2 = this.b - this.c;
            this.d = l2 / 2L + l2 % 2L;
        }
        this.e = String.valueOf(i.a(this.c, ".")) + "Ken";
        this.b(true);
        this.f = 0;
    }
}
