package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class eu
extends aq {
    public ds i;
    public ls j;
    private int l;
    private int m;
    private int n;
    private boolean o = true;
    public boolean k = false;
    private d p;

    public eu(ds ds2, int n2) {
        this.d(n2);
        this.i = ds2;
        boolean bl = ds2.e() == 2;
        String string = String.valueOf(ds2.b()) + (bl ? ((ds2.f() != null && ds2.f().length() > 0) ? " - " + ds2.f() : "") : "");
        string = string.replace('\r', ' ');
        string = string.replace('\n', ' ');
        this.p = bx.d;
        boolean bl2 = ds2.g() != null && ds2.g().equals("patriot");
        if (bl2) {
            this.p = com.mg.sq.a.g;
        }
        this.j = new ls(this.p, string, 0, 0, Integer.MAX_VALUE, this.p.a(), 1);
        if (!bl2) {
            this.p = bx.c;
        }
        this.m = ds2.d() == 3 ? -3 : (ds2.d() == 1 ? -5 : 10000);
        short s = ds2.c();
        if (this.i.c() == -13) {
            this.l = -13;
        } else {
            this.l = this.i.e() == 2 ? (int)s : -19;
        }
    }

    public final void d(boolean bl) {
        if (bl) {
            this.e(40);
            this.n = 0;
            this.o = true;
        } else {
            this.e(22);
        }
        if (bl || this.g != bl) {
            this.c = true;
        }
        super.d(bl);
    }

    public final void a(Graphics graphics, int n2, int n3) {
        if (!this.c) {
            return;
        }
        n3 += this.d();
        n2 += this.c() + 2;
        if (this.g) {
            pc.e(graphics, n2 - 2, n3, this.e(), this.f());
        }
        n3 += 3;
        boolean bl = this.g && this.j.b() > this.e() - 25;
        if (bl) {
            cw.a(graphics);
            cw.a(graphics, n2, n3, this.e(), this.f());
        }
        int n4 = n3 + 4;
        try {
            this.j.a(graphics, n2 + 25 + (this.g ? this.n : 0), n4);
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        if (bl) {
            cw.b(graphics);
        }
        n4 += (this.j.c() - pe.a().b(this.l)) / 2;
        int n5 = n2 + 25;
        if (this.g) {
            n4 = n3 + 18;
            this.p.a(graphics, this.i.a(), n5, n4, 0);
            n4 += this.p.b() - pe.a().b(this.l);
        }
        if (this.l < 0) {
            pc.d(graphics, this.l, n5 - 2 - pc.g[Math.abs(this.l)], n4, 0);
        } else {
            pe.a().a(graphics, this.l, n5 - 2 - pe.a().a(this.l), n4, 0);
        }
        if (this.i.e() == 2 && this.m <= 0) {
            pc.d(graphics, this.m, n2, n4, 0);
        }
        if (this.k) {
            pc.d(graphics, -23, n2 - 2, n3 - 2, 0);
        }
        this.c = false;
    }

    public final void n() {
        if (this.g) {
            int n2 = this.e() - 4 - 25;
            if (this.j.b() > n2) {
                if (this.o) {
                    --this.n;
                    if (this.n < (n2 -= this.j.b())) {
                        this.n = n2;
                        this.o = false;
                    }
                } else {
                    ++this.n;
                    if (this.n > 0) {
                        this.n = 0;
                        this.o = true;
                    }
                }
                this.c = true;
            }
        }
    }
}
