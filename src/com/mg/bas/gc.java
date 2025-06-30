package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class gc
extends aq {
    private d i;
    private int[] j;
    private String[] k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private int p;
    private int q;

    private gc(String string, int n, d d2, int n2) {
        this(string, 0, n, d2, 1);
    }

    public gc(String string, int n, d d2) {
        this(string, n, d2, 1);
    }

    public gc(String string, int n, int n2, d d2, int n3) {
        int n4;
        block9: {
            block8: {
                this.l = 0;
                this.n = 0;
                this.p = 0;
                this.q = 0;
                if (string == null || string.equals("")) {
                    ct.a("Bạn chưa nhập nội dung ");
                    return;
                }
                this.b(false);
                this.n = n;
                if (n == n2) {
                    n = 0;
                    this.n = 0;
                }
                this.i = d2;
                if (n <= 0 || n >= n2 || string == null || !string.equals("")) break block8;
                String[] arr = bx.a(string, n2 - n, d2);
                if (arr.length <= 0) break block9;
                n4 = arr[0].length();
                String rest = string.substring(n4);
                String[] arr2 = bx.a(rest, n2, d2);
                this.k = new String[arr2.length + 1];
                this.k[0] = string.substring(0, n4);
                System.arraycopy(arr2, 0, this.k, 1, arr2.length);
                n = 1;
                n4 = 0;
                while (n4 < this.k[0].length()) {
                    if (this.k[0].charAt(n4) == ' ') {
                        n = 0;
                        break;
                    }
                    ++n4;
                }
                if (n == 0) break block9;
                this.n = 0;
            }
            this.k = bx.a(string, n2, d2);
        }
        this.j = new int[this.k.length - 1];
        int n5 = 0;
        n4 = this.j.length;
        while (n5 < n4) {
            this.j[n5] = n3;
            ++n5;
        }
        this.a(0, 0, n2, this.k.length * d2.a());
    }

    public final void h(int n) {
        this.l = 1;
        this.m = this.e() >> 1;
    }

    public final int f() {
        if (this.k == null) {
            return 0;
        }
        int n = 0;
        int n2 = 0;
        while (n2 < this.j.length) {
            n += this.j[n2];
            ++n2;
        }
        return this.i.a() * this.k.length + n + this.q;
    }

    public final void i(int n) {
        this.p = 10;
    }

    public final void j(int n) {
        this.q = 6;
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (this.k == null) {
            return;
        }
        if (this.f && this.m()) {
            pc.e(graphics, n + this.c(), n2 + this.d() + this.q / 2, this.e(), this.f());
        }
        int n3 = 0;
        int n4 = 0;
        int n5 = this.k.length;
        int n6 = this.n;
        this.i.c(this.o);
        while (n4 < n5) {
            this.i.a(graphics, this.k[n4], this.c() + n6 + this.m + this.p + n, this.d() + n3 + this.q + n2, this.l);
            n3 += this.i.a() + (n4 < this.j.length ? this.j[n4] : 0);
            ++n4;
            n6 = 0;
        }
        this.i.c(false);
    }

    public final String toString() {
        return "sqstringcomponent   " + this.c() + "   " + this.d();
    }

    public final void e(boolean bl) {
        this.o = true;
    }
}
