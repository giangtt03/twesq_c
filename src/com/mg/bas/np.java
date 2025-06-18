package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class np
extends at {
    public static int a = 15000;
    private boolean b = false;
    private long c;
    private boolean d;
    private long e = 0L;

    public np() {
        a = 15000;
    }

    public final void a() {
        if (!this.b) {
            this.c = System.currentTimeMillis();
            this.d = true;
        }
        this.b = true;
    }

    public final void b() {
        this.b = false;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean d() {
        return System.currentTimeMillis() - this.c >= (long)a;
    }

    public final boolean e() {
        boolean bl = false;
        if (System.currentTimeMillis() - this.c >= 10000L && this.d) {
            this.d = false;
            bl = true;
        }
        return bl;
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.b) {
            return;
        }
        bx.b.a(graphics, String.valueOf(this.e), this.m, this.n, 0);
    }

    public final void i() {
        if (!this.b) {
            return;
        }
        long l = (long)a - (System.currentTimeMillis() - this.c);
        if (l >= 0L) {
            this.e = l / 1000L + (long)(l % 1000L != 0L ? 1 : 0);
        }
    }

    public final long f() {
        return System.currentTimeMillis() - this.c;
    }

    public final long g() {
        return this.f() / 1000L;
    }
}
