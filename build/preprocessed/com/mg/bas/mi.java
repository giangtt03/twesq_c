package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class mi {
    private boolean d = false;
    private long e = 0L;
    private long f = 0L;
    int a = 0;
    private long g;
    int b;
    int c;

    public mi(int n, int n2) {
        this.a = n;
        this.g = n2;
    }

    public final void a(int n, int n2, int n3, int n4) {
        this.e = n;
        this.f = n2;
        this.g = n3;
        this.d = true;
        this.c = n4;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        long l = this.f - this.e;
        if (l < 0L) {
            if (Math.abs(l) >= 6L) {
                l /= 6L;
            }
            this.e += l;
        } else if (l > 0L) {
            if (l <= this.g * 30L / 100L || l == this.g) {
                if (Math.abs(l) >= 6L) {
                    l /= 6L;
                }
                this.e += l;
            } else {
                this.e += l;
            }
        } else {
            this.d = false;
        }
        this.b = (int)(this.e * (long)this.a / this.g);
        if (this.b > this.a) {
            this.b = this.a;
            return;
        }
        if (this.b == 0 && this.e > 0L) {
            this.b = 1;
        }
    }

    public final void a(Graphics graphics, Image image, int n, int n2, int n3) {
        if (n3 == 0) {
            mi mi2 = this;
            int n4 = mi2.b;
            int n5 = image.getHeight();
            cw.a(graphics, image, 0, 0, n4, n5, n, n2, 0);
            return;
        }
        mi mi3 = this;
        int n6 = mi3.b;
        int n7 = image.getWidth();
        int n8 = image.getHeight() - n6;
        cw.a(graphics, image, 0, n8, n7, n6, n, n2 + n8, 0);
    }
}
