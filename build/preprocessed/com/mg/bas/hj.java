package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class hj
extends at {
    private int a;
    private int b;
    private int c;
    private Image d;
    private int e = 1;
    private boolean f;
    private boolean g = true;
    private int h = 3;
    private int i = 0;
    private int[] j;
    private int[] k;

    public hj(int n, int n2) {
        this.m = n;
        this.n = n2;
        this.d = pc.b;
        this.a = this.d.getWidth() / 3;
        this.b = this.d.getHeight();
        this.a(1);
    }

    public final void i() {
        if (!this.g) {
            if (!this.f) {
                ++this.c;
                this.i = 0;
                if (this.c >= 2) {
                    this.c = 2;
                    this.f = true;
                }
            } else {
                ++this.i;
                if (this.i > 1) {
                    this.e += 12;
                    --this.c;
                    if (this.c < 0) {
                        this.c = 0;
                        if (this.h == 0) {
                            this.g = true;
                        } else {
                            --this.h;
                            this.f = false;
                            this.e = 1;
                        }
                    }
                    this.i = 0;
                }
            }
        }
        this.a(this.e);
    }

    private void a(int n) {
        n /= 2;
        int n2 = this.m;
        int n3 = this.n;
        int n4 = -90;
        this.j = new int[8];
        this.k = new int[8];
        int n5 = 0;
        while (n5 < 8) {
            this.j[n5] = n2 + (n * l.b(n4) >> 14);
            this.k[n5] = n3 + (n * l.a(n4) >> 14);
            n4 += 45;
            ++n5;
        }
    }

    public final void a() {
        this.g = false;
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (this.g) {
            return;
        }
        int n3 = 0;
        while (n3 < this.j.length) {
            cw.a(graphics, this.d, this.c * this.a, 0, this.a, this.b, this.j[n3] + n, this.k[n3] + n2, 3);
            ++n3;
        }
    }
}
