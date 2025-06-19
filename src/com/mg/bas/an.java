package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// Abstract base class for UI/game panels or containers, manages child elements and state. Extends am.
import javax.microedition.lcdui.Graphics;

public abstract class an
extends am {
    private av a;
    private boolean b;
    private bs c;
    private boolean d;
    private boolean k;
    private az[] l;

    public an(int n) {
        this.b(n);
        this.b = false;
        this.c = null;
        this.d = false;
        this.k = false;
        this.l = new az[3];
        this.a = null;
    }

    public final void a(bf bf2) {
        super.a(bf2);
    }

    public final boolean a_() {
        return this.b;
    }

    public final void a(boolean bl) {
        this.b = false;
    }

    public final void a(av av2) {
        this.a = av2;
    }

    public final void a(bs object) {
        Object object2 = null;
        object2 = null;
        object2 = null;
        bs bs2 = object;
        an anObj = this;
        ao aoObj = new ao(anObj, (byte) 0);
        object2 = ag.c().b(-90001);
        ((az)object2).a(-90001);
        ((az)object2).a((bf)aoObj);
        bs2.a((az)object2);
        object2 = ag.c().c(-90002);
        ((az)object2).a(-90002);
        ((az)object2).a((bf)aoObj);
        bs2.b((az)object2);
        object2 = ag.c().a(-90000);
        ((az)object2).a(-90000);
        ((az)object2).a((bf)aoObj);
        Object object3 = object2;
        Object object4 = anObj;
        ((am)object4).a((az)object3, true);
        ((an)anObj).c = bs2;
        ((an)anObj).d = false;
    }

    public final void b(boolean bl) {
        this.k = true;
    }

    protected final void c(boolean flag) {
        v.c();
        if (this.c != null) {
            this.d = flag;
            if (flag) {
                int i = 0;
                while (i < this.j.length) {
                    this.l[i] = this.j[i];
                    ++i;
                }
                az az2 = this.c.a()[0];
                an an2 = this;
                an2.a(az2, true);
                this.a((az)null);
                az2 = this.c.a()[2];
                an2 = this;
                an2.b(az2, true);
                int n2 = this.c.e() > this.c.f() ? this.c.e() : this.c.f();
                this.c.a_(-n2, v.u);
                this.c.d(0, v.u - ba.a - this.c.f());
                return;
            }
            int n = 0;
            while (n < this.j.length) {
                this.j[n] = this.l[n];
                ++n;
            }
            this.c.t();
            return;
        }
        this.d = false;
    }

    protected void a(int n) {
    }

    public final void c(int n) {
        if (this.d) {
            if (this.c != null && !this.c.f(n)) {
                this.c(false);
            }
            return;
        }
        this.a(n);
    }

    protected void e(int n) {
    }

    public final void d(int n) {
        if (this.d) {
            return;
        }
        this.e(n);
    }

    protected void e(int n, int n2) {
    }

    public final void a(int n, int n2) {
        if (this.d) {
            if (this.c != null && !this.c.c(n, n2)) {
                this.c(false);
            }
            return;
        }
        this.e(n, n2);
    }

    protected void f(int n, int n2) {
    }

    public final void b(int n, int n2) {
        if (this.d) {
            return;
        }
        this.f(n, n2);
    }

    protected void g(int n, int n2) {
    }

    public final void c(int n, int n2) {
        if (this.d) {
            return;
        }
        this.g(n, n2);
    }

    protected abstract void c();

    public final void b_() {
        if (this.d) {
            if (this.c == null) {
                this.d = false;
            } else {
                this.c.n();
            }
            if (!this.k) {
                return;
            }
        }
        if (this.a != null) {
        }
        this.c();
    }

    protected abstract void a(Graphics var1);

    public final void c(Graphics graphics) {
        if (this.a != null) {
            this.a.a(graphics);
        }
        this.a(graphics);
        if (this.d) {
            if (this.c == null) {
                this.d = false;
                return;
            }
            this.c.a(graphics, 0, 0);
        }
    }

    static bs a(an an2) {
        return an2.c;
    }
}
