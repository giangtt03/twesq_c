package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class jg
extends im {
    private int[] s;
    private int[] t;
    private int u;
    private Image[] v;
    private int w;
    private int x;
    private int y;
    private int z;
    private int A;
    private int B;

    public jg() {
        mp.a().a(2000);
        this.a(mp.a().u, 2);
        this.v = mp.a().v;
        this.A = this.v[0].getWidth() >> 1;
        this.B = this.v[1].getWidth() >> 1;
        byte[][] byArrayArray = new byte[1][];
        byte[] byArray = new byte[4];
        byArray[2] = 1;
        byArray[3] = 1;
        byArrayArray[0] = byArray;
        this.a(byArrayArray);
        this.q = 3;
    }

    public final void a(int n, int n2, int n3, int n4, int n5) {
        this.u = 1;
        this.r = true;
        this.w = n5;
        this.x = 5;
    }

    public final void a(int[] nArray, int[] nArray2) {
        this.s = nArray;
        this.t = nArray2;
    }

    public final void k() {
        if (this.x <= 0) {
            if (this.u < this.s.length) {
                ++this.u;
            }
            this.x = 5;
        } else {
            --this.x;
        }
        if (this.w > 0) {
            --this.w;
            if (this.w == 0) {
                this.r = false;
            }
        }
        if (this.z > 0) {
            --this.z;
            return;
        }
        this.z = 1;
        if (this.y == 0) {
            this.y = 1;
            return;
        }
        this.y = 0;
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.r) {
            return;
        }
        n = 0;
        while (n < this.u) {
            super.a(graphics, this.s[n], this.t[n]);
            ++n;
        }
        n = this.u - 1;
        n2 = 0;
        while (n2 < n) {
            int n3 = this.t[n2 + 1];
            int n4 = this.s[n2 + 1];
            int n5 = this.t[n2];
            int n6 = this.s[n2];
            Graphics graphics2 = graphics;
            jg jg2 = this;
            int n7 = 0;
            int n8 = 0;
            boolean bl = true;
            boolean bl2 = true;
            do {
                if (bl) {
                    bl = n6 > n4;
                    n7 = bl ? n6 - 28 : n6 + 28;
                    if (!(bl = bl == n7 > n4)) {
                        n7 = n4;
                    }
                }
                if (bl2) {
                    bl2 = n5 > n3;
                    n8 = bl2 ? n5 - 28 : n5 + 28;
                    if (!(bl2 = bl2 == n8 > n3)) {
                        n8 = n3;
                    }
                }
                if (n6 < n7) {
                    if (n5 < n8) {
                        cw.a(graphics2, jg2.v[0], jg2.A * jg2.y, 0, jg2.A, jg2.v[0].getHeight(), n6, n5, 20);
                    } else if (n5 > n8) {
                        graphics2.drawRegion(jg2.v[0], jg2.A * jg2.y, 0, jg2.A, jg2.v[0].getHeight(), 2, n6, n8, 20);
                    } else {
                        cw.a(graphics2, jg2.v[1], jg2.B * jg2.y, 0, jg2.B, jg2.v[1].getHeight(), n6, n5, 6);
                    }
                } else if (n6 > n7) {
                    if (n5 < n8) {
                        graphics2.drawRegion(jg2.v[0], jg2.A * jg2.y, 0, jg2.A, jg2.v[0].getHeight(), 2, n7, n5, 20);
                    } else if (n5 > n8) {
                        cw.a(graphics2, jg2.v[0], jg2.A * jg2.y, 0, jg2.A, jg2.v[0].getHeight(), n7, n8, 20);
                    } else {
                        cw.a(graphics2, jg2.v[1], jg2.B * jg2.y, 0, jg2.B, jg2.v[1].getHeight(), n7, n8, 6);
                    }
                } else if (n5 < n8) {
                    graphics2.drawRegion(jg2.v[1], jg2.B * jg2.y, 0, jg2.B, jg2.v[1].getHeight(), 5, n6, n5, 17);
                } else if (n5 > n8) {
                    graphics2.drawRegion(jg2.v[1], jg2.B * jg2.y, 0, jg2.B, jg2.v[1].getHeight(), 5, n6, n8, 17);
                }
                n6 = n7;
                n5 = n8;
            } while (bl || bl2);
            ++n2;
        }
    }
}
