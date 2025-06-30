package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import java.util.Calendar;
import javax.microedition.lcdui.Graphics;

public final class gw
extends al {
    private int k = 30;
    private int l = 18;
    private int m = 20;
    private int n = 1900;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s = 0;
    private int t;
    private int u;
//    private int v;
    private int w = 2;
    private int vWidth;

    public gw() {
        this(1900, com.mg.bas.i.c(System.currentTimeMillis()).get(1));
    }

    private gw(int n, int n2) {
        super(1);
        this.o = n2;
        Object object = com.mg.bas.i.c(System.currentTimeMillis());
        this.p = ((Calendar)object).get(5);
        this.q = ((Calendar)object).get(2) + 1;
        this.r = ((Calendar)object).get(1);
        this.vWidth = this.k * 7 + 5;
        this.u = 6 * this.l + 5;
        this.a((v.t - this.vWidth - 6 - 6) / 2, (v.u - ba.a - this.u - this.m - this.m - 3 - 15 - 15) / 2, this.vWidth + 6 + 6, this.u + this.m + this.m + 3 + 15 + 15);
        gb gb2 = new gb(-1099, 2);
        object = this;
        ((am)object).a(gb2, true);
        gb2 = new gb(-1100, 3);
        object = this;
        ((am)object).b(gb2, true);
        this.C();
    }

    public final void a(int n, int n2, int n3) {
        this.p = n;
        this.q = n2;
        this.r = n3;
        this.C();
    }

    private void C() {
        int n = this.r;
        int n2 = this.q;
        int n3 = this.p;
        this.p = n3 > (n2 = gw.d(n2, n)) ? n2 : n3;
        Calendar calendar = com.mg.bas.i.a;
        calendar.set(5, 1);
        calendar.set(2, this.q - 1);
        calendar.set(1, this.r);
        this.s = (calendar.get(7) - 2 + 7) % 7;
        this.t = gw.d(this.q, this.r);
    }

    public final int t() {
        return this.p;
    }

    public final int u() {
        return this.r;
    }

    public final int v() {
        return this.q;
    }

    public final String w() {
        if (this.p > 9) {
            return String.valueOf(this.p);
        }
        return "0" + this.p;
    }

    public final String x() {
        return String.valueOf(this.r);
    }

    public final String y() {
        if (this.q > 9) {
            return String.valueOf(this.q);
        }
        return "0" + this.q;
    }

    public final int z() {
        return this.t;
    }

    public final int A() {
        return this.n;
    }

    public final int B() {
        return this.o;
    }

    public final void c(int n) {
        if (n == 98) {
            if (this.w == 2) {
                this.w = 1;
                return;
            }
            if (this.w == 1) {
                this.w = 0;
                return;
            }
            if (this.w == 0) {
                n = this.p + 7;
                if (n > this.t) {
                    n = this.t;
                }
                this.p = n;
                return;
            }
        } else if (n == 99) {
            if (this.w == 1) {
                this.w = 2;
                return;
            }
            if (this.w == 0) {
                n = this.p - 7;
                if (n <= 0) {
                    this.w = 1;
                    return;
                }
                this.p = n;
                return;
            }
        } else if (n == 97) {
            if (this.w == 2) {
                if (this.r > this.n) {
                    --this.r;
                    this.C();
                    return;
                }
            } else if (this.w == 1) {
                if (this.q > 1) {
                    --this.q;
                    this.C();
                    return;
                }
            } else if (this.w == 0 && this.p > 1) {
                --this.p;
                return;
            }
        } else if (n == 96) {
            if (this.w == 2) {
                if (this.r < this.o) {
                    ++this.r;
                    this.C();
                    return;
                }
            } else if (this.w == 1) {
                if (this.q < 12) {
                    ++this.q;
                    this.C();
                    return;
                }
            } else if (this.w == 0 && this.p < this.t) {
                ++this.p;
            }
        }
    }

    public final void a(int n, int n2) {
        int n3 = this.a() + 6;
        int n4 = this.c() + 15;
        if (n2 >= n4 && n2 <= n4 + this.m) {
            if (this.w == 2) {
                if (n < n3 + this.i() / 2) {
                    this.c(97);
                    return;
                }
                this.c(96);
                return;
            }
            this.w = 2;
            return;
        }
        if (n2 >= (n4 += this.m + 2) && n2 <= n4 + this.m) {
            if (this.w == 1) {
                if (n < n3 + this.i() / 2) {
                    this.c(97);
                    return;
                }
                this.c(96);
                return;
            }
            this.w = 1;
            return;
        }
        if (n2 >= (n4 += this.m + 3) && n2 <= n4 + this.l * 6 && n >= n3 && n <= n3 + this.k * 7) {
            this.w = 0;
            n -= n3;
            if ((n = n / this.k + (n2 -= n4) / this.l * 7 - this.s + 1) > 0 && n <= this.t) {
                this.p = n;
            }
        }
    }

    public final void c(Graphics graphics) {
        graphics.setColor(16244470);
        graphics.fillRect(0, 0, v.t, v.u);
        cw.b(graphics, 13092820, this.a(), this.c(), this.i(), this.j());
        graphics.setColor(16244470);
        graphics.fillRect(this.a() + 10, this.c(), 33, 1);
        bx.d.c(true);
        bx.d.a(graphics, "Ngày", this.a() + 12, this.c() - 7, 0);
        bx.d.c();
        int n = this.a() + 6;
        int n2 = this.c() + 15;
        int n3 = n + (this.vWidth - 60) / 2;
        int n4 = n2;
        if (this.w == 2) {
            pc.c(graphics, n3 - 25, n4 + 1, 19, 17, 857589, 0);
            pc.c(graphics, n3 + 5 + 60, n4 + 1, 19, 17, 857589, 1);
        }
        pc.a(graphics, n3, n4, 60, this.m, this.w == 2);
        bx.d.a(graphics, String.valueOf(this.r), n + this.vWidth / 2, n2 + 3, 1);
        n3 = n + (this.vWidth - 100) / 2;
        n4 = n2 += this.m + 2;
        if (this.w == 1) {
            pc.c(graphics, n3 - 25, n4 + 1, 19, 17, 857589, 0);
            pc.c(graphics, n3 + 5 + 100, n4 + 1, 19, 17, 857589, 1);
        }
        pc.a(graphics, n3, n4, 100, this.m, this.w == 1);
        bx.d.a(graphics, "Tháng " + this.q, n + this.vWidth / 2, n2 + 3, 1);
        this.a(graphics, n, n2 += this.m + 1);
    }

    private void a(Graphics graphics, int n, int n2) {
        int n3;
        int n4;
        int n5 = 10323806;
        int n6 = 15722458;
        if (this.w == 0) {
            n5 = 22523;
            n6 = 13295359;
        }
        graphics.setColor(12564408);
        graphics.fillRect(n + 2, n2 + 2, this.vWidth - 4, 1);
        pc.b(graphics, n + 1, n2 + 1, this.vWidth - 2, this.u - 2, n5, n6, -1);
        n5 = 0;
        int n7 = n2 + 3 + this.l;
        int n8 = n2 + this.u - 1;
        while (n7 <= n8) {
            n6 = 0xFFFFFF;
            n4 = 12966138;
            n3 = 16371412;
            if (n5 == 0) {
                n6 = 14013930;
                n4 = 7184895;
                n3 = 16550298;
            }
            graphics.setColor(n6);
            graphics.fillRect(n + 2, n7 - this.l, this.vWidth - 4 - this.k - this.k, this.l);
            graphics.setColor(n4);
            graphics.fillRect(n + this.vWidth - 2 - this.k - this.k, n7 - this.l, this.k, this.l);
            graphics.setColor(n3);
            graphics.fillRect(n + this.vWidth - 2 - this.k, n7 - this.l, this.k, this.l);
            graphics.setColor(12564408);
            graphics.fillRect(n + 2, n7 - 1, this.vWidth - 4, 1);
            n5 = n5 != 0 ? 0 : 1;
            n7 += this.l;
        }
        graphics.setColor(12564408);
        n7 = n + 2 + this.k;
        n8 = n + this.vWidth - 2;
        while (n7 < n8) {
            graphics.fillRect(n7, n2 + 2, 1, this.u - 4);
            n7 += this.k;
        }
        n7 = this.s;
        n8 = 1;
        while (n8 <= this.t) {
            n6 = n7 % 7;
            n4 = n7 / 7;
            n3 = -1;
            n5 = n + n6 * this.k + 2;
            n6 = n2 + n4 * this.l + 3;
            if (n8 == this.p) {
                if (this.w == 0) {
                    n3 = 16048180;
                }
                graphics.setColor(0);
                graphics.drawRect(n5, n6 - 1, this.k, this.l);
            }
            if (n3 >= 0) {
                graphics.setColor(n3);
                graphics.fillRect(n5 + 1, n6, this.k - 1, this.l - 1);
            }
            bx.d.a(graphics, String.valueOf(n8), n5 + this.k - 1, n6 + 2, 2);
            ++n7;
            ++n8;
        }
    }

    protected final void g() {
    }

    private static int d(int n, int n2) {
        switch (n) {
            case 2: {
                n = n2;
                if (n % 400 == 0 || n % 100 != 0 && n % 4 == 0) {
                    return 29;
                }
                return 28;
            }
            case 4: 
            case 6: 
            case 9: 
            case 11: {
                return 30;
            }
        }
        return 31;
    }
}
