package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class jl
extends im {
    private static final byte[][] u;
    private int v = -1;
    public int s;
    public as[] t;

    static {
        byte[][] byArrayArray = new byte[4][];
        byArrayArray[0] = new byte[]{-1};
        byte[] byArray = new byte[6];
        byArray[2] = 1;
        byArray[3] = 2;
        byArray[4] = 2;
        byArray[5] = 2;
        byArrayArray[1] = byArray;
        byArrayArray[2] = new byte[]{2};
        byArrayArray[3] = new byte[]{3, 3, 4, 4, 4};
        u = byArrayArray;
    }

    public jl() {
        mp.a().a(2008);
        Image image = mp.a().C;
        this.t = new as[36];
        int n = 0;
        while (n < this.t.length) {
            this.t[n] = new as(image, 5);
            this.t[n].a(u);
            this.t[n].a(false);
            this.t[n].j(3);
            this.t[n].b(false);
            ++n;
        }
        this.a(u);
    }

    public final void a(int n, int n2, int n3, int n4, int n5) {
        this.c(n, n2);
        this.b(n3, n4);
        this.d(0);
        this.r = true;
    }

    public final void k() {
        int n = 0;
        while (n < this.s) {
            this.t[n].i();
            ++n;
        }
        switch (this.e) {
            case 0: {
                this.v = 5;
                n = 0;
                while (n < this.s) {
                    int n2 = n;
                    this.t[n2].b(true);
                    this.t[n2].d(1);
                    int n3 = this.h + cv.a() % 60;
                    int n4 = this.i + cv.a() % 60;
                    int n5 = 7 + cv.a(10);
                    int n6 = Math.abs(this.t[n2].n() - n3) / n5;
                    n5 = Math.abs(this.t[n2].o() - n4) / n5;
                    if (n6 <= 0) {
                        n6 = 1;
                    }
                    if (n5 <= 0) {
                        n5 = 1;
                    }
                    this.t[n2].b(n3, n4);
                    this.t[n2].a(n6, n5);
                    ++n;
                }
                this.d(1);
                return;
            }
            case 1: {
                if (this.v < 0) break;
                --this.v;
                if (this.v != 0) break;
                n = 0;
                while (n < this.s) {
                    int n7 = n++;
                    this.t[n7].d(2);
                }
                this.d(2);
                return;
            }
            case 2: {
                n = 1;
                int n8 = 0;
                while (n8 < this.s) {
                    if (this.t[n8].h() == 2) {
                        if (this.t[n8].b(this.t[n8].a(), this.t[n8].b(), this.t[n8].c(), this.t[n8].d())) {
                            this.t[n8].d(3);
                        }
                        n = 0;
                    } else if (this.t[n8].m() && this.t[n8].h() == 3) {
                        if (this.t[n8].j()) {
                            this.t[n8].b(false);
                        } else {
                            n = 0;
                        }
                    }
                    ++n8;
                }
                if (n == 0) break;
                this.b(false);
            }
        }
    }

    public final void a(Graphics graphics) {
        if (!this.r) {
            return;
        }
        int n = 0;
        while (n < this.s) {
            this.t[n].a(graphics);
            ++n;
        }
    }
}
