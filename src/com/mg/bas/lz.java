package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class lz
extends at {
    private int a;
    private int b;
    private int[] c;
    private int[] d;
    private byte e = (byte)10;
    private int f = 30;

    public lz(int n, int n2, int n3, byte by) {
        this.o = n;
        this.p = n2;
        this.f = 30;
        this.e = (byte)10;
        lz lz2 = this;
        n2 = lz2.o / 2;
        n3 = (lz2.p + lz2.f) / 2 - lz2.f + lz2.e;
        by = (byte)(lz2.f / 2);
        int n4 = -90;
        lz2.c = new int[9];
        lz2.d = new int[9];
        int n5 = 0;
        while (n5 < 9) {
            lz2.c[n5] = n2 + (by * l.b(n4) >> 14);
            lz2.d[n5] = n3 + (by * l.a(n4) >> 14);
            n4 += 40;
            ++n5;
        }
    }

    public final void i() {
        if (!this.r) {
            return;
        }
        this.b = this.a;
        this.a = (this.a + 1) % this.c.length;
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.r) {
            return;
        }
        n += this.m;
        n2 += this.n;
        int n3 = pc.b.getWidth() / 3;
        int n4 = pc.b.getHeight();
        int n5 = (this.b - 2 + this.c.length) % this.c.length;
        int n6 = 0;
        while (n6 < 2) {
            int n7 = (n5 + n6 + this.c.length) % this.c.length;
            cw.a(graphics, pc.b, 0, 0, n3, n4, this.c[n7] + n, this.d[n7] + n2, 3);
            ++n6;
        }
        cw.a(graphics, pc.b, n3, 0, n3, n4, this.c[this.b] + n, this.d[this.b] + n2, 3);
        cw.a(graphics, pc.b, n3 + n3, 0, n3, n4, this.c[this.a] + n, this.d[this.a] + n2, 3);
    }
}
