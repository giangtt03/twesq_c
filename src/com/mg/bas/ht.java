package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public abstract class ht
extends al
implements bf {
    protected a l;
    protected bs m;
    protected boolean n = false;
    private k k = new k();
    az[] o = new az[3];

    public ht() {
        super(1);
        this.l = com.mg.sq.a.s();
    }

    public final void d(int n, int n2) {
        if (this.g(n2)) {
            this.A();
            return;
        }
        this.e(n2);
    }

    protected final void g() {
        if (this.m != null) {
            this.m.n();
        }
        this.u();
    }

    public final void c(Graphics graphics) {
        this.a(graphics);
        cw.a(graphics, this.k);
        cw.a(graphics, this.c, this.d, this.f + 1, this.g + 1);
        this.b(graphics);
        if (this.m != null && this.n) {
            this.m.a(graphics, 0, 0);
        }
        cw.c(graphics, this.k);
        if (this.m != null && !this.n) {
            this.m.a(graphics, 0, 0);
        }
    }

    protected abstract boolean g(int var1);

    protected abstract void e(int var1);

    public abstract void u();

    public abstract void b(Graphics var1);

    public abstract void a(Graphics var1);

    public final void c(int n) {
        if (this.m != null) {
            boolean bl;
            int n2 = n;
            az[] azArray = this.m.a();
            ht ht2 = this;
            if (n2 == 94 && azArray[0] != null && azArray[0].b()) {
                if (ht2.i != null) {
                    ht2.i.d(-1, azArray[0].a());
                }
                bl = true;
            } else if (n2 == 95 && azArray[1] != null && azArray[1].b()) {
                if (ht2.i != null) {
                    ht2.i.d(-1, azArray[1].a());
                }
                bl = true;
            } else if (n2 == 93 && azArray[2] != null && azArray[2].b()) {
                if (ht2.i != null) {
                    ht2.i.d(-1, azArray[2].a());
                }
                bl = true;
            } else {
                bl = false;
            }
            if (bl) {
                v.c();
                return;
            }
            if (this.m.f(n)) {
                return;
            }
            this.A();
            return;
        }
        this.f(n);
    }

    protected void f(int n) {
    }

    protected final void a(bs bs2, az az2, az az3, az az4) {
        this.m = bs2;
        this.o = new az[this.j.length];
        int n = 0;
        while (n < this.j.length) {
            this.o[n] = this.j[n];
            ++n;
        }
        ht ht2 = this;
        ht2.a(az2, true);
        az2 = az4;
        ht2 = this;
        ht2.b(az2, true);
        this.a(az3);
        this.e(true);
    }

    protected final void A() {
        if (this.m == null) {
            return;
        }
        this.m = null;
        this.n = false;
        int n = 0;
        while (n < this.o.length) {
            this.j[n] = this.o[n];
            ++n;
        }
        this.e(true);
    }

    public final void d(int n) {
        if (this.m != null) {
            this.m.g(n);
            return;
        }
    }

    public final void c(int n, int n2) {
        if (this.m != null) {
            this.m.e(n, n2);
            return;
        }
        this.e(n, n2);
    }

    public void e(int n, int n2) {
    }

    public final void a(int n, int n2) {
        if (this.m != null) {
            boolean bl;
            block6: {
                int n3 = n2;
                int n4 = n;
                az[] azArray = this.m.a();
                ht ht2 = this;
                int n5 = 0;
                while (n5 < azArray.length) {
                    if (azArray[n5] != null && azArray[n5].a(n4, n3)) {
                        if (ht2.i != null) {
                            ht2.i.d(-1, azArray[n5].a());
                        }
                        bl = true;
                        break block6;
                    }
                    ++n5;
                }
                bl = false;
            }
            if (bl) {
                return;
            }
            if (this.m.c(n, n2)) {
                return;
            }
            this.A();
            return;
        }
        this.f(n, n2);
    }

    public void f(int n, int n2) {
    }

    public final void b(int n, int n2) {
        if (this.m != null) {
            this.m.f(n, n2);
            return;
        }
        this.g(n, n2);
    }

    public void g(int n, int n2) {
    }

    public final void a(br[] brArray, az az2, az az3, az az4) {
        bs bs2 = new bs();
        bs2.a(brArray);
        int n = bs2.e() > bs2.f() ? bs2.e() : bs2.f();
        bs2.a_(-n, this.j() - bs2.f() + n);
        bs2.d(0, v.u - ba.a - bs2.f());
        bs2.a(this);
        this.a(bs2, az2, az3, az4);
    }

    public void a(k k2) {
    }
}
