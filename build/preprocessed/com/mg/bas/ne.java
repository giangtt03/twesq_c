package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ne
extends at {
    private as[] a;
    private int b = 3;
    private int c = 100;
    private boolean d = true;
    private int e = 35;
    private int f;
    private z g;

    public final boolean a() {
        return this.d;
    }

    public ne(Image image) {
        byte[][] byArrayArray = new byte[1][];
        byte[] byArray = new byte[3];
        byArray[1] = 1;
        byArray[2] = 2;
        byArrayArray[0] = byArray;
        byte[][] byArrayArray2 = byArrayArray;
        this.a = new as[20];
        int n = 0;
        while (n < this.a.length) {
            this.a[n] = new as(image, 3);
            this.a[n].a(byArrayArray2);
            ++n;
        }
        this.g = new z();
        this.g.a(12);
        this.f = 360 / this.a.length;
    }

    public final void a(int n, int n2, int n3, String string) {
        this.b = 3;
        this.c(n, n2);
        this.d = true;
        this.g.a(string, n, n2 + 3);
        this.c = this.e + (n3 - 1) * 5;
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.d) {
            return;
        }
        n = 0;
        n2 = 0;
        while (n2 < this.a.length) {
            int n3 = this.m + (this.b * com.mg.bas.l.b(n) >> 14);
            int n4 = this.n + (this.b * com.mg.bas.l.a(n) >> 14);
            if (this.a[n2] != null) {
                this.a[n2].a(graphics, n3, n4);
            }
            n += this.f;
            ++n2;
        }
        if (this.b >= 7) {
            this.g.a(graphics, 0, 0);
        }
    }

    public final void i() {
        if (!this.d) {
            return;
        }
        int n = 0;
        while (n < this.a.length) {
            if (this.a[n] != null) {
                this.a[n].i();
            }
            ++n;
        }
        this.b += 3;
        if (this.b >= this.c) {
            this.d = false;
        }
        if (this.b >= 7) {
            this.g.b();
        }
    }
}
