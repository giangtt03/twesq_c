package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// UI/game slider or progress bar component, manages value and rendering. Extends aq.
import javax.microedition.lcdui.Graphics;

public final class bt
extends aq {
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    public bt() {
        this(2);
    }

    public bt(int n) {
        this(n, 0, 100, 0, 100);
    }

    private bt(int n, int n2, int n3, int n4, int n5) {
        this.m = n;
        this.b(0, 100, 0, 100);
    }

    public final int a() {
        return this.j;
    }

    public final int q() {
        return this.i;
    }

    public final void h(int n) {
        this.b(n, this.l, this.k, this.j);
    }

    public final int r() {
        return this.l;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void b(int n, int n2, int n3, int n4) {
        bt bt2 = this;
        synchronized (bt2) {
            long l;
            if (n3 == Integer.MAX_VALUE) {
                n3 = 0x7FFFFFFE;
            }
            if (n4 <= n3) {
                n4 = n3 + 1;
            }
            if ((l = (long)n4 - (long)n3) > Integer.MAX_VALUE) {
                l = Integer.MAX_VALUE;
                n4 = n3 + Integer.MAX_VALUE;
            }
            if (n2 > (int)l) {
                n2 = (int)l;
            }
            if (n2 <= 0) {
                n2 = 1;
            }
            if (n < n3) {
                n = n3;
            }
            if (n > n4 - n2) {
                n = n4 - n2;
            }
            this.i = n;
            this.l = n2;
            this.k = n3;
            this.j = n4;
            return;
        }
    }

    public final boolean c(int n, int n2) {
        return false;
    }

    public final void a(Graphics graphics, int n, int n2) {
        int n3 = this.j - this.k - this.l;
        if (n3 > 0) {
            if (this.m == 2) {
                n2 += this.d() + this.i * (this.l - 3) / n3;
                n += this.c() - this.e() - 1;
            } else {
                n2 += this.d() - this.f() - 1;
                n += this.c() + this.i * (this.l - 3) / n3;
            }
            graphics.setColor(0xFF0000);
            graphics.fillRect(n, n2 + 1, 1, 1);
            graphics.fillRect(n + 1, n2, 1, 1);
            graphics.fillRect(n + 1, n2 + 2, 1, 1);
            graphics.fillRect(n + 2, n2 + 1, 1, 1);
        }
    }
}
