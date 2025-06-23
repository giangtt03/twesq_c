package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// UI/game dialog or menu component with selectable items, supports images and custom layout. Extends al.
public final class bw
extends al {
    private au[] k;
    private int l;
    private int m;
    private k n;
    private int o;
    private Image p;
    private String q;
    private d r = bx.b;
    private int s = 2;
    private int t;
    private int u = 0;

    public bw(String string) {
        this(string, null);
    }

    public final void a(au[] auArray) {
        this.k = auArray;
        this.t();
    }

    private bw(String string, au[] auArray) {
        super(1);
        this.b = false;
        try {
            this.p = ag.a;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        this.n = new k(10, 41, this.f - 15, this.g - (47 + ba.a + 5));
        this.q = string;
        this.k = null;
        int n = this.u;
        this.u = n;
        if (this.q != null && this.q.length() > 0) {
            this.t = this.r.a(this.q);
            switch (n) {
                case 0:
                    this.s = this.n.a + 2;
                    break;
                case 1:
                    this.s = this.n.a + this.n.c / 2 - this.t / 2;
                    break;
                case 2:
                    this.s = this.n.a + this.n.c - 2 - this.t;
                    break;
            }
        }
        this.t();
    }

    private void t() {
        if (this.k == null) {
            return;
        }
        this.o = 0;
        this.m = 0;
        this.l = 0;
        int n = 0;
        while (n < this.k.length) {
            this.k[n].a(this.n);
            this.o += this.k[n].a() + 8;
            ++n;
        }
    }

    public final void a(int n, int n2) {
        int n3;
        int n4;
        super.a(n, n2);
        if (this.l > 0) {
            n4 = this.f / 2 + 2 - 5;
            n3 = this.n.b - 2 - 15;
            if (n > n4 && n < n4 + 10 && n2 > n3 && n2 < n3 + 15) {
                v.c[99] = 2;
                return;
            }
        }
        if (this.o > this.n.d && this.o - this.l - this.n.d > 0) {
            n4 = this.f / 2 + 2 - 5;
            n3 = this.n.b + this.n.d + 2;
            if (n > n4 && n < n4 + 10 && n2 > n3 && n2 < n3 + 15) {
                v.c[98] = 2;
                return;
            }
        }
    }

    public final void c(int n) {
        super.c(n);
        if (n == 99 || n == 150) {
            n = this.l;
            this.l -= 15;
            if (this.l < 0) {
                this.l = 0;
            }
            if (this.l != this.m && n == this.m) {
                return;
            }
        } else if (n == 98 || n == 156) {
            this.l += 15;
            if (this.o - this.l < this.n.d) {
                this.l = this.o - this.n.d;
            }
            if (this.l < 0) {
                this.l = 0;
            }
            if (this.l != this.m) {
            }
        }
    }

    protected final void g() {
        int n;
        if (this.m != this.l) {
            n = this.l - this.m;
            this.m = Math.abs(n) < 3 ? (this.m += n) : (this.m += n / 2);
        }
        if (this.k != null) {
            n = 0;
            while (n < this.k.length) {
                ++n;
            }
        }
    }

    public final void c(Graphics graphics) {
        graphics.setColor(v.am);
        graphics.fillRect(0, 0, this.f, this.g);
        if (this.q != null) {
            this.r.a(graphics, this.q, this.s, 2, 0);
            graphics.setColor(0xFF0000);
            graphics.fillRect(this.s, this.r.a() + 1, this.t + 2, 2);
        }
        if (this.k != null) {
            graphics.setClip(this.n.a, this.n.b, this.n.c, this.n.d);
            int n = this.n.b - this.m;
            int n2 = this.n.b + this.n.d;
            k k2 = new k();
            int n3 = 0;
            while (n3 < this.k.length) {
                if (n > n2) break;
                k2.a(this.n.a, n, this.n.c, this.k[n3].a());
                if (this.n.a(k2)) {
                    this.k[n3].a(graphics, this.n.a, n);
                }
                n += this.k[n3].a() + 8;
                ++n3;
            }
            graphics.setClip(0, 0, this.f, this.g);
        }
        try {
            if (this.p != null) {
                if (this.l > 0) {
                    graphics.drawRegion(this.p, 0, 0, this.p.getWidth(), this.p.getHeight(), 6, this.f / 2 + 2, this.n.b - 2, 33);
                }
                if (this.o > this.n.d && this.o - this.l - this.n.d > 0) {
                    graphics.drawRegion(this.p, 0, 0, this.p.getWidth(), this.p.getHeight(), 5, this.f / 2 + 2, this.n.b + this.n.d + 2, 17);
                    return;
                }
            }
        }
        catch (Throwable throwable) {
            Throwable throwable2 = throwable;
            throwable.printStackTrace();
        }
    }
}
