package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fo
extends aq {
    private static final int i = ly.c("99+") + 1;
    private int[] j = new int[6];
    private static Image k;
    private int l = -1;
    private int[] m;
    private lo n;

    public static void a() {
        if (k == null) {
            k = f.d("/mecommands");
        }
    }

    public static void q() {
        k = null;
    }

    public fo() {
        int n = 0;
        while (n < this.j.length) {
            this.j[n] = -1;
            ++n;
        }
        this.e(12);
    }

    public final int r() {
        if (this.l < 0) {
            return 0;
        }
        return this.m[this.l];
    }

    public final void h(int n) {
        this.d(n, 0);
    }

    public final void d(int n, int n2) {
        this.j[n] = n2;
        if (this.l == -1) {
            this.l = n;
        }
    }

    public final void a(lo object) {
        this.n = object;
        int n2 = 0;
        object = this;
        ((fo)object).d(n2, 0);
    }

    public final void s() {
        int n2 = 0;
        this.m = new int[this.j.length];
        int n3 = 0;
        while (n3 < this.j.length) {
            if (this.j[n3] >= 0) {
                this.m[n3] = n2;
                n2 += 23;
                if (this.j[n3] > 0) {
                    n2 = this.j[n3] > 99 ? (n2 += i) : (n2 += ly.b(this.j[n3]) + 2);
                }
            }
            ++n3;
        }
        this.d(n2);
    }

    public final void a(Graphics graphics, int n2, int n3) {
        if (k == null) {
            return;
        }
        n2 += this.c();
        n3 += this.d();
        int n4 = 0;
        while (n4 < this.j.length) {
            if (this.j[n4] >= 0) {
                int n5 = n2 + this.m[n4];
                if (n4 != 0) {
                    cw.a(graphics, k, (n4 - 1) * 15, 0, 15, 12, n5, n3, 0);
                } else if (this.n != null) {
                    this.n.a(graphics, n5, n3 - 4);
                }
                if (this.j[n4] > 0) {
                    ly.a(graphics, String.valueOf(this.j[n4]), n5 += 17, n3 + 2);
                }
            }
            ++n4;
        }
    }

    public final int t() {
        return this.l;
    }

    public final void i(int n2) {
        if (this.j[n2] >= 0) {
            this.l = n2;
        }
    }

    public final boolean c(int n2, int n3) {
        if (this.h().b(n2, n3)) {
            n2 -= this.c();
            n3 = this.j.length - 1;
            while (n3 >= 0) {
                if (this.j[n3] >= 0 && n2 >= this.m[n3]) {
                    this.l = n3;
                    return true;
                }
                --n3;
            }
        }
        return false;
    }

    public final boolean f(int n2) {
        if (this.l < 0) {
            return false;
        }
        switch (n2) {
            case 97: {
                n2 = this.l - 1;
                while (n2 >= 0) {
                    if (this.j[n2] >= 0) {
                        this.l = n2;
                        return true;
                    }
                    --n2;
                }
                break;
            }
            case 96: {
                n2 = this.l + 1;
                while (n2 < this.j.length) {
                    if (this.j[n2] >= 0) {
                        this.l = n2;
                        return true;
                    }
                    ++n2;
                }
                break;
            }
        }
        return false;
    }
}
