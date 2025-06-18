package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class fd
extends aq
implements bu {
    private int i;
    private int j;
    private int k;
    private int l;
    private ay m;
    private int n;
    private int o;
    private k p = new k();
    private ii q;
    private boolean r = false;
    private int s;

    public fd(int n, int n2) {
        this.n = n;
        this.o = n2;
        this.m = new ay();
        this.m.b(this);
        this.m.e(false);
    }

    public final int a() {
        return this.s;
    }

    public final void e(boolean bl) {
        this.r = true;
    }

    public final void a(ii ii2) {
        this.q = ii2;
    }

    public final void a(int n, int n2, int n3, int n4, int n5, int n6) {
        this.j = 4;
        this.i = 4;
        this.m.a(new j(5, 5, 5, 5));
    }

    public final void d(int n, int n2) {
        this.k = n;
        this.l = n2;
    }

    /*
     * Unable to fully structure code
     */
    public final void a(Graphics g, int x, int y) {
    if (!this.c) {
        return;
    }

    x += this.c(); // offset x
    y += this.d(); // offset y

    final Rect padding = this.m.q(); // có thể là padding (a, b, c, d)
    final Rect margin = this.m.a();  // có thể là margin (a, b, c, d)

    if (this.q != null) {
        this.q.b(g, 
            x - margin.b, 
            y - margin.a, 
            this.e() + margin.b + margin.d, 
            this.f() + margin.a + margin.c
        );
    }

    cw.a(g, this.p); // vẽ khung nền gì đó
    cw.a(g, this.p, x, y, this.e(), this.f()); // vẽ background?

    int contentHeight = padding.b + padding.d;
    x -= padding.a;
    y -= padding.b;

    for (int i = 0; i < this.o; i++) {
        int row = i / this.n;
        int col = i % this.n;

        int drawX = (this.i + this.k) * col;
        int drawY = (this.j + this.l) * row;

        // nếu vị trí này không nằm trong vùng visible thì bỏ qua
        if (!padding.b(drawX, drawY, this.k, this.l)) {
            if (drawY + this.l > contentHeight) {
                break;
            }
            continue;
        }

        if (this.q == null) continue;

        int finalX = x + drawX;
        int finalY = y + drawY;

        // xử lý khi là ô được chọn (ví dụ hiệu ứng selection)
        if (i == this.s) {
            if (!this.r) {
                this.q.a(g, finalX, finalY, this.k, this.l, i); // có thể là draw item với chỉ số
                this.q.a(g, finalX, finalY, this.k, this.l);     // có thể là vẽ hiệu ứng highlight
            } else {
                this.q.a(g, finalX, finalY, this.k, this.l);     // vẽ thường
                this.q.a(g, finalX, finalY, this.k, this.l, i);  // vẽ index?
            }
        } else {
            this.q.a(g, finalX, finalY, this.k, this.l, i);      // vẽ ô bình thường
        }
    }

    cw.c(g, this.p); // có thể là vẽ viền/khung
    this.c = false; // reset cờ cần vẽ
}


    private int g(int n, int n2) {
        if (n2 < 0) {
            return 0;
        }
        return n2 * (this.l + this.j);
    }

    private int h(int n, int n2) {
        if (n2 < 0) {
            return 0;
        }
        return n2 * (this.k + this.i);
    }

    private boolean a(ay aq2, k object, int n, int n2) {
        if (2 == n) {
            if (n2 < 0) {
                if (this.s >= this.n) {
                    n = this.g(0, this.s / this.n);
                    if (n > ((k)object).b + this.j) {
                        n2 = this.s - this.n;
                        fd fd2 = this;
                        this.s = n2;
                        this.a((ay)aq2, (k)object);
                        return true;
                    }
                    ((ay)aq2).d(2, -1);
                    return true;
                }
                if (((ay)aq2).t()) {
                    return false;
                }
                ((ay)aq2).d(2, -1);
                return true;
            }
            n = this.s + this.n;
            if (n >= this.o) {
                n = this.o - 1;
            }
            if (n / this.n != this.s / this.n) {
                n2 = this.g(0, this.s / this.n);
                if (n2 + this.l + this.j < ((k)object).b + ((k)object).d) {
                    n2 = n;
                    fd fd3 = this;
                    this.s = n2;
                    this.b((ay)aq2, (k)object);
                    return true;
                }
                ((ay)aq2).d(2, 1);
                return true;
            }
            if (((ay)aq2).s()) {
                return false;
            }
            ((ay)aq2).d(2, 1);
            return true;
        }
        if (n2 < 0) {
            if (this.s > 0) {
                if (this.s % this.n == 0) {
                    ((ay)aq2).i(true);
                    n2 = this.s - 1;
                    fd fd4 = this;
                    this.s = n2;
                    this.a((ay)aq2, (k)object);
                    return true;
                }
                n = this.h(0, this.s % this.n);
                if (n > ((k)object).a + this.i) {
                    n2 = this.s - 1;
                    Object object2 = this;
                    this.s = n2;
                    object2 = object;
                    object = aq2;
                    aq2 = this;
                    n2 = ((fd)aq2).g(0, ((fd)aq2).s % ((fd)aq2).n);
                    if (n2 <= ((k)object2).a) {
                        int n3 = n2 - ((k)object2).a;
                        if (((fd)aq2).k >= ((k)object2).c) {
                            n3 += ((fd)aq2).k - ((k)object2).c;
                        } else if (((fd)aq2).s % ((fd)aq2).n > 0) {
                            n3 = n2 - n3 + ((fd)aq2).k + ((fd)aq2).i + ((fd)aq2).k > ((k)object2).a + ((k)object2).c ? (n3 -= ((k)object2).c - ((fd)aq2).k - ((fd)aq2).i) : (n3 -= ((fd)aq2).k);
                        }
                        ((ay)object).i(n3);
                    }
                    return true;
                }
                ((ay)aq2).d(1, -1);
                return true;
            }
            if (((ay)aq2).u()) {
                return false;
            }
            ((ay)aq2).d(1, -1);
            return true;
        }
        if (this.s < this.o - 1) {
            if (this.s % this.n == this.n - 1) {
                ((ay)aq2).h(true);
                n2 = this.s + 1;
                fd fd5 = this;
                this.s = n2;
                this.b((ay)aq2, (k)object);
                return true;
            }
            n = this.h(0, this.s % this.n);
            if (n + this.k + this.i < ((k)object).a + ((k)object).c) {
                n2 = this.s + 1;
                Object object3 = this;
                this.s = n2;
                object3 = object;
                object = aq2;
                aq2 = this;
                n2 = ((fd)aq2).g(0, ((fd)aq2).s % ((fd)aq2).n);
                if (n2 + ((fd)aq2).k + ((fd)aq2).i > ((k)object3).a + ((k)object3).c) {
                    int n4 = n2 + ((fd)aq2).k + ((fd)aq2).i - (((k)object3).a + ((k)object3).c);
                    if (((fd)aq2).k >= ((k)object3).c) {
                        n4 -= ((fd)aq2).k - ((k)object3).c;
                    } else if (((fd)aq2).s % ((fd)aq2).n < ((fd)aq2).n - 1) {
                        n4 = n2 - n4 - ((fd)aq2).k - ((fd)aq2).i < ((k)object3).a ? (n4 += ((k)object3).c - ((fd)aq2).k - ((fd)aq2).i) : (n4 += ((fd)aq2).k + ((fd)aq2).i);
                    }
                    ((ay)object).i(n4);
                }
                return true;
            }
            ((ay)aq2).d(1, 1);
            return true;
        }
        if (((ay)aq2).v()) {
            return false;
        }
        ((ay)aq2).d(1, 1);
        return true;
    }

    private void a(ay ay2, k k2) {
        int n = this.g(0, this.s / this.n);
        if (n <= k2.b) {
            int n2 = n - k2.b;
            if (this.l >= k2.d) {
                n2 += this.l - k2.d;
            } else if (this.s >= this.n) {
                n2 = n - n2 + this.l + this.j + this.l > k2.b + k2.d ? (n2 -= k2.d - this.l - this.j) : (n2 -= this.l);
            }
            ay2.j(n2);
        }
    }

    private void b(ay ay2, k k2) {
        int n = this.g(0, this.s / this.n);
        if (n + this.l + this.j > k2.b + k2.d) {
            int n2 = n + this.l + this.j - (k2.b + k2.d);
            if (this.l >= k2.d) {
                n2 -= this.l - k2.d;
            } else {
                int n3 = this.s + this.n;
                if (n3 >= this.o) {
                    n3 = this.o - 1;
                }
                if (n3 / this.n != this.s / this.n) {
                    n2 = n - n2 - this.l - this.j < k2.b ? (n2 += k2.d - this.l - this.j) : (n2 += this.l + this.j);
                }
            }
            ay2.j(n2);
        }
    }

    public final boolean f(int n) {
        if (n >= 96 && n <= 99) {
            k k2 = this.m.r();
            switch (n) {
                case 99: {
                    return this.a(this.m, k2, 2, -1);
                }
                case 98: {
                    return this.a(this.m, k2, 2, 1);
                }
                case 97: {
                    return this.a(this.m, k2, 1, -1);
                }
                case 96: {
                    return this.a(this.m, k2, 1, 1);
                }
            }
        } else if (n == 95) {
            if (this.q != null && this.s >= 0 && this.s < this.o) {
                this.q.t();
            }
            return true;
        }
        return false;
    }

    public final boolean c(int n, int n2) {
        int n3 = n2 - this.d();
        int n4 = n - this.c();
        n3 /= this.l + this.j;
        if ((n3 = n3 * this.n + (n4 /= this.k + this.i)) < this.o) {
            if (n3 != this.s) {
                n2 = n3;
                fd fd2 = this;
                this.s = n2;
            } else {
                this.f(95);
            }
            return true;
        }
        return super.c(n, n2);
    }

    public final aq q() {
        return this.m;
    }

    public final g v() {
        int n2 = this.o / this.n + (this.o % this.n != 0 ? 1 : 0);
        return new g(this.n * this.k + (this.n - 1) * this.i, n2 * this.l + (n2 - 1) * this.j);
    }

    public final int w() {
        return 10;
    }
}
