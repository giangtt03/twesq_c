package com.mg.bas;
// Decompiled with: Procyon 0.6.0
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class fd extends aq implements bu
{
    private int i;
    private int j;
    private int k;
    private int l;
    private ay m;
    private int n;
    private int o;
    private k p;
    private ii q;
    private boolean r;
    private int s;
    
    public fd(final int n, final int o) {
        super();
        this.p = new k();
        this.r = false;
        this.n = n;
        this.o = o;
        (this.m = new ay()).b(this);
        this.m.e(false);
    }
    
    public final int a() {
        return this.s;
    }
    
    public final void e(final boolean b) {
        this.r = true;
    }
    
    public final void a(final ii q) {
        this.q = q;
    }
    
    public final void a(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.j = 4;
        this.i = 4;
        this.m.a(new j(5, 5, 5, 5));
    }
    
    public final void d(final int k, final int l) {
        this.k = k;
        this.l = l;
    }
    
    public final void a(final Graphics graphics, int n, int n2) {
        if (!super.c) {
            return;
        }
        n += this.c();
        n2 += this.d();
        final k q = this.m.q();
        final j a = this.m.a();
        if (this.q != null) {
            this.q.b(graphics, n - a.b, n2 - a.a, this.e() + a.b + a.d, this.f() + a.a + a.c);
        }
        cw.a(graphics, this.p);
        cw.a(graphics, this.p, n, n2, this.e(), this.f());
        final int n3 = q.b + q.d;
        n -= q.a;
        n2 -= q.b;
        for (int i = 0; i < this.o; ++i) {
            final int n4 = i / this.n;
            final int n5 = (this.i + this.k) * (i % this.n);
            final int n6 = (this.j + this.l) * n4;
            if (!q.b(n5, n6, this.k, this.l)) {
                if (n6 + this.l > n3) {
                    break;
                }
            }
            else if (this.q != null) {
                final int n7 = n + n5;
                final int n8 = n2 + n6;
                if (i == this.s) {
                    if (!this.r) {
                        this.q.a(graphics, n7, n8, this.k, this.l, i);
                        this.q.a(graphics, n7, n8, this.k, this.l);
                        continue;
                    }
                    this.q.a(graphics, n7, n8, this.k, this.l);
                }
                this.q.a(graphics, n7, n8, this.k, this.l, i);
            }
        }
        cw.c(graphics, this.p);
        super.c = false;
    }
    
    private int g(final int n, final int n2) {
        if (n2 < 0) {
            return 0;
        }
        return n2 * (this.l + this.j);
    }
    
    private int h(final int n, final int n2) {
        if (n2 < 0) {
            return 0;
        }
        return n2 * (this.k + this.i);
    }
    
    private boolean a(final ay ay, final k k, int n, int n2) {
        if (2 == n) {
            if (n2 < 0) {
                if (this.s >= this.n) {
                    if ((n = this.g(0, this.s / this.n)) > k.b + this.j) {
                        n2 = this.s - this.n;
                        this.s = n2;
                        this.a(ay, k);
                        return true;
                    }
                    ay.d(2, -1);
                    return true;
                }
                else {
                    if (ay.t()) {
                        return false;
                    }
                    ay.d(2, -1);
                    return true;
                }
            }
            else {
                if ((n = this.s + this.n) >= this.o) {
                    n = this.o - 1;
                }
                if (n / this.n != this.s / this.n) {
                    if ((n2 = this.g(0, this.s / this.n)) + this.l + this.j < k.b + k.d) {
                        n2 = n;
                        this.s = n2;
                        this.b(ay, k);
                        return true;
                    }
                    ay.d(2, 1);
                    return true;
                }
                else {
                    if (ay.s()) {
                        return false;
                    }
                    ay.d(2, 1);
                    return true;
                }
            }
        }
        else if (n2 < 0) {
            if (this.s > 0) {
                if (this.s % this.n == 0) {
                    ay.i(true);
                    n2 = this.s - 1;
                    this.s = n2;
                    this.a(ay, k);
                    return true;
                }
                if ((n = this.h(0, this.s % this.n)) > k.a + this.i) {
                    n2 = this.s - 1;
                    this.s = n2;
                    if ((n2 = this.g(0, this.s % this.n)) <= k.a) {
                        int n3 = n2 - k.a;
                        if (this.k >= k.c) {
                            n3 += this.k - k.c;
                        }
                        else if (this.s % this.n > 0) {
                            if (n2 - n3 + this.k + this.i + this.k > k.a + k.c) {
                                n3 -= k.c - this.k - this.i;
                            }
                            else {
                                n3 -= this.k;
                            }
                        }
                        ay.i(n3);
                    }
                    return true;
                }
                ay.d(1, -1);
                return true;
            }
            else {
                if (ay.u()) {
                    return false;
                }
                ay.d(1, -1);
                return true;
            }
        }
        else if (this.s < this.o - 1) {
            if (this.s % this.n == this.n - 1) {
                ay.h(true);
                n2 = this.s + 1;
                this.s = n2;
                this.b(ay, k);
                return true;
            }
            if ((n = this.h(0, this.s % this.n)) + this.k + this.i < k.a + k.c) {
                n2 = this.s + 1;
                this.s = n2;
                if ((n2 = this.g(0, this.s % this.n)) + this.k + this.i > k.a + k.c) {
                    int n4 = n2 + this.k + this.i - (k.a + k.c);
                    if (this.k >= k.c) {
                        n4 -= this.k - k.c;
                    }
                    else if (this.s % this.n < this.n - 1) {
                        if (n2 - n4 - this.k - this.i < k.a) {
                            n4 += k.c - this.k - this.i;
                        }
                        else {
                            n4 += this.k + this.i;
                        }
                    }
                    ay.i(n4);
                }
                return true;
            }
            ay.d(1, 1);
            return true;
        }
        else {
            if (ay.v()) {
                return false;
            }
            ay.d(1, 1);
            return true;
        }
    }
    
    private void a(final ay ay, final k k) {
        final int g;
        if ((g = this.g(0, this.s / this.n)) <= k.b) {
            int n = g - k.b;
            if (this.l >= k.d) {
                n += this.l - k.d;
            }
            else if (this.s >= this.n) {
                if (g - n + this.l + this.j + this.l > k.b + k.d) {
                    n -= k.d - this.l - this.j;
                }
                else {
                    n -= this.l;
                }
            }
            ay.j(n);
        }
    }
    
    private void b(final ay ay, final k k) {
        final int g;
        if ((g = this.g(0, this.s / this.n)) + this.l + this.j > k.b + k.d) {
            int n = g + this.l + this.j - (k.b + k.d);
            if (this.l >= k.d) {
                n -= this.l - k.d;
            }
            else {
                int n2;
                if ((n2 = this.s + this.n) >= this.o) {
                    n2 = this.o - 1;
                }
                if (n2 / this.n != this.s / this.n) {
                    if (g - n - this.l - this.j < k.b) {
                        n += k.d - this.l - this.j;
                    }
                    else {
                        n += this.l + this.j;
                    }
                }
            }
            ay.j(n);
        }
    }
    
    public final boolean f(final int n) {
        if (n >= 96 && n <= 99) {
            final k r = this.m.r();
            switch (n) {
                case 99: {
                    return this.a(this.m, r, 2, -1);
                }
                case 98: {
                    return this.a(this.m, r, 2, 1);
                }
                case 97: {
                    return this.a(this.m, r, 1, -1);
                }
                case 96: {
                    return this.a(this.m, r, 1, 1);
                }
            }
        }
        else if (n == 95) {
            if (this.q != null && this.s >= 0 && this.s < this.o) {
                final ii q = this.q;
                final int s = this.s;
                q.t();
            }
            return true;
        }
        return false;
    }
    
    public final boolean c(final int n, int s) {
        final int n2;
        if ((n2 = (s - this.d()) / (this.l + this.j) * this.n + (n - this.c()) / (this.k + this.i)) < this.o) {
            if (n2 != this.s) {
                s = n2;
                this.s = s;
            }
            else {
                this.f(95);
            }
            return true;
        }
        return super.c(n, s);
    }
    
    public final aq q() {
        return this.m;
    }
    
    public final g v() {
        final int n = this.o / this.n + ((this.o % this.n != 0) ? 1 : 0);
        return new g(this.n * this.k + (this.n - 1) * this.i, n * this.l + (n - 1) * this.j);
    }
    
    public final int w() {
        return 10;
    }
}
