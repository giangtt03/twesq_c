package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// UI/game sprite or image handler, manages animation frames, rendering, and state. Extends at.
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class as
extends at {
    protected int a = 0;
    protected Image b;
    protected int c;
    protected int[][] d;
    protected int e;
    protected int[][] f;
    private int s;
    private int t;
    protected int g;
    private boolean u = true;
    protected int h;
    protected int i;
    protected int j;
    protected int k;

    public as() {
    }

    public as(Image image, int n) {
        this.a(image, n);
    }

    public as(Image image, int[][] nArray) {
        this.a(image, nArray);
    }

    public final void a(Image image, int n) {
        if (image == null) {
            throw new NullPointerException("Image is NULL!!!");
        }
        this.c = n;
        this.g = -1;
        this.o = image.getWidth() / this.c;
        this.p = image.getHeight();
        this.b = image;
        this.d = null;
    }

    public final void a(Image image, int[][] nArray) {
        if (image == null) {
            throw new NullPointerException("Image is NULL!!!");
        }
        if (nArray == null) {
            throw new NullPointerException("Regions are NULL!!!");
        }
        this.g = -1;
        this.b = image;
        this.d = nArray;
    }

    public void a(Graphics graphics, int n, int n2) {
        try {
            if (!this.r || this.g < 0 || this.b == null) {
                return;
            }
            int n3 = this.f[this.e][this.g];
            if (n3 >= 0) {
                if (this.d != null) {
                    int[] nArray = this.d[n3];
                    n = this.a == 0 ? this.m + n + nArray[4] : this.m + n + (this.o - nArray[2] - nArray[4]);
                    n2 = this.n + n2 + nArray[5];
                    if ((this.q & 1) > 0) {
                        n -= this.o >> 1;
                    } else if ((this.q & 8) > 0) {
                        n -= this.o;
                    }
                    if ((this.q & 2) > 0) {
                        n2 -= this.p >> 1;
                    } else if ((this.q & 0x20) > 0) {
                        n2 -= this.p;
                    }
                    if (this.a == 0) {
                        cw.a(graphics, this.b, nArray[0], nArray[1], nArray[2], nArray[3], n, n2, 0);
                        return;
                    }
                    graphics.drawRegion(this.b, nArray[0], nArray[1], nArray[2], nArray[3], this.a, n, n2, 0);
                    return;
                }
                if (this.a == 0) {
                    cw.a(graphics, this.b, this.f[this.e][this.g] * this.o, 0, this.o, this.p, this.m + n, this.n + n2, this.q);
                    return;
                }
                graphics.drawRegion(this.b, this.f[this.e][this.g] * this.o, 0, this.o, this.p, this.a, this.m + n, this.n + n2, this.q);
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            ct.a(" Framanimate error: " + this.f.length + "            " + this.e + "             " + this.g);
            illegalArgumentException.printStackTrace();
            return;
        }
        catch (Exception exception) {
            ct.a(" Framanimate error: frames = " + this.f);
        }
    }

    public final int a() {
        return this.h;
    }

    public final int b() {
        return this.i;
    }

    public final int c() {
        return this.j;
    }

    public final int d() {
        return this.k;
    }

    public final void a(int n, int n2) {
        this.j = n;
        this.k = n2;
    }

    public final void b(int n, int n2) {
        this.h = n;
        this.i = n2;
    }

    public final int[][] e() {
        return this.f;
    }

    public final void a(int[][] nArray) {
        this.f = nArray;
    }

    public final void a(byte[][] byArray) {
        this.f = new int[byArray.length][];
        int n = 0;
        while (n < byArray.length) {
            this.f[n] = new int[byArray[n].length];
            int n2 = 0;
            while (n2 < byArray[n].length) {
                this.f[n][n2] = byArray[n][n2];
                ++n2;
            }
            ++n;
        }
    }

    public final void a(int n) {
        this.g = n;
    }

    public final int f() {
        return this.g;
    }

    public final void b(int n) {
        this.s = n;
        this.t = 0;
    }

    public final int g() {
        return this.a;
    }

    public void c(int n) {
        this.a = n;
    }

    public final void a(boolean bl) {
        this.u = bl;
    }

    public void d(int n) {
        this.g = n != this.e ? 0 : (this.g %= this.f[n].length);
        this.e = n;
    }

    public final int h() {
        return this.e;
    }

    public final void i() {
        if (this.r) {
            this.k();
            if (this.f != null && this.f[this.e] != null) {
                ++this.t;
                if (this.t >= this.s) {
                    this.t = 0;
                    if (this.u) {
                        this.g = (this.g + 1) % this.f[this.e].length;
                    } else {
                        ++this.g;
                        if (this.g >= this.f[this.e].length) {
                            this.g = this.f[this.e].length - 1;
                        }
                    }
                }
            }
            if (this.e < 0) {
                this.e = 0;
                return;
            }
            if (this.e >= this.f.length) {
                this.e = this.f.length - 1;
            }
        }
    }

    public boolean j() {
        return this.g >= this.f[this.e].length - 1;
    }

    public void k() {
    }
}
