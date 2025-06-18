package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public class he
extends al
implements b {
    a k;
    int l = -1;
    private az m = null;
    private az n = null;
    private int[][] o;

    public he() {
        super(1);
        this.a((ba)null);
        this.k = new a();
    }

    public final void a(int[][] nArray) {
        this.o = nArray;
    }

    public final void a(aq aq2) {
        this.a(new aq[]{aq2});
    }

    public final void a(aq[] object) {
        int n2 = 0;
        while (n2 < ((aq[])object).length) {
            this.k.a(object[n2]);
            ++n2;
        }
        he he2 = this;
        object = this.k;
        he he3 = he2;
        int n3 = ((a)object).d();
        boolean bl = false;
        Object object2 = this.k;
        if (n3 > 0) {
            Object[] objectArray = object2;
            he he4 = he3;
            int n4 = n3;
            n3 = 0;
            if ((object2 = object2.e()) != null) {
                n4 = n3 + n4;
                ++n3;
                while (n3 < n4) {
                    int n5 = 0;
                    int n6 = n3 - 1;
                    int n7 = n6 / 2;
                    do {
                        int n8;
                        if ((n8 = he4.a(object2[n7], object2[n3])) < 0) {
                            n5 = n7 + 1;
                        } else if (n8 > 0) {
                            n6 = n7;
                        } else {
                            n5 = n6 = n7 + 1;
                        }
                        n7 = (n6 + n5) / 2;
                    } while (n6 > n5);
                    if (n7 < n3 - 1) {
                        Object object3 = object2[n3];
                        n5 = n3;
                        while (n5 > n7) {
                            g.a(object2, n5, n5 - 1);
                            --n5;
                        }
                        object2[n7] = object3;
                    } else if (he4.a(object2[n3 - 1], object2[n3]) > 0) {
                        g.a(object2, n3, n3 - 1);
                    }
                    ++n3;
                }
            }
            objectArray.a((Object[])object2);
        }
        n3 = 0;
        while (n3 < this.k.d()) {
            object2 = this.h(n3);
            if (object2.m()) {
                this.l = n3;
                return;
            }
            ++n3;
        }
    }

    public final void e(boolean n2) {
        super.e(n2 != 0);
        if (n2 != 0) {
            n2 = 0;
            while (n2 < this.k.d()) {
                this.h(n2).c(true);
                ++n2;
            }
        }
    }

    public final void a(az az2, boolean bl) {
        bd bd2;
        if (az2 == null) {
            super.a(az2, bl);
            this.m = null;
            return;
        }
        if (az2 instanceof bd && i.b((bd2 = (bd)az2).d())) {
            this.m = az2;
            return;
        }
        super.a(az2, bl);
    }

    public final void b(az az2, boolean bl) {
        bd bd2;
        if (az2 == null) {
            super.b(az2, bl);
            this.n = null;
            return;
        }
        if (az2 instanceof bd && i.b((bd2 = (bd)az2).d())) {
            this.n = az2;
            return;
        }
        super.b(az2, bl);
    }

    private aq h(int n2) {
        return (aq)this.k.b(n2);
    }

    public final aq e(int n2) {
        int n3 = 0;
        while (n3 < this.k.d()) {
            aq aq2 = this.h(n3);
            if (aq2.b() == n2) {
                return aq2;
            }
            ++n3;
        }
        return null;
    }

    public final void f(int n2) {
        this.i(n2);
    }

    private aq t() {
        if (this.l < 0) {
            return null;
        }
        return this.h(this.l);
    }

    public final boolean l() {
        if (this.k.d() > 0) {
            int n2 = 0;
            while (n2 < this.k.d()) {
                if (this.h(n2).k()) {
                    return true;
                }
                ++n2;
            }
        }
        return super.l();
    }

    public void c(Graphics graphics) {
        if (this.l()) {
            this.e(true);
            this.a(graphics);
        }
        int n2 = 0;
        while (n2 < this.k.d()) {
            this.h(n2).a(graphics, this.a(), this.c());
            ++n2;
        }
        this.h = false;
    }

    protected void a(Graphics graphics) {
        pc.a(graphics, this.c, this.d, this.f, this.g, v.aj, true);
    }

    protected void g() {
        int n2 = 0;
        while (n2 < this.k.d()) {
            this.h(n2).n();
            ++n2;
        }
    }

    public void a(int n2, int n3) {
        n2 -= this.a();
        n3 -= this.c();
        int n4 = 0;
        while (n4 < this.k.d()) {
            aq aq2 = this.h(n4);
            if (aq2.j() && aq2.h().a(n2, n3)) {
                if (aq2.j()) {
                    n2 = aq2.c(n2, n3) ? 1 : 0;
                    if (n4 == this.l) {
                        if (n2 == 0) {
                            this.u();
                            return;
                        }
                    } else {
                        this.i(n4);
                        if (n2 == 0) {
                            this.u();
                        }
                    }
                }
                return;
            }
            ++n4;
        }
    }

    public final void b(int n2, int n3) {
        this.h(this.l).f(n2, n3);
    }

    public final void c(int n2, int n3) {
        this.h(this.l).e(n2, n3);
    }

    public final void g(int n2) {
        this.g = n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void c(int n2) {
        if (this.l < 0) {
            return;
        }
        int n3 = this.t().f(n2);
        if (n3 != 0) {
            return;
        }
        switch (n2) {
            case 97: {
                he he2 = this;
                if (he2.o != null) {
                    n3 = he2.o[he2.l][2];
                    if (n3 < 0) {
                        n3 = he2.l;
                    }
                    he2.i(n3);
                    return;
                }
                n3 = he2.l - 1;
                while (n3 >= 0) {
                    aq aq2 = he2.h(n3);
                    if (aq2.j()) {
                        he2.i(n3);
                        return;
                    }
                    --n3;
                }
                return;
            }
            case 96: {
                he he3 = this;
                if (he3.o != null) {
                    n3 = he3.o[he3.l][3];
                    if (n3 < 0) {
                        n3 = he3.l;
                    }
                    he3.i(n3);
                    return;
                }
                n3 = he3.l + 1;
                while (n3 < he3.k.d()) {
                    aq aq3 = he3.h(n3);
                    if (aq3.j()) {
                        he3.i(n3);
                        return;
                    }
                    ++n3;
                }
                return;
            }
            case 99: {
                he he4 = this;
                if (he4.o != null) {
                    n3 = he4.o[he4.l][0];
                    if (n3 < 0) {
                        n3 = he4.l;
                    }
                    he4.i(n3);
                    return;
                }
                aq aq4 = he4.t();
                int n4 = aq4.d();
                int n5 = aq4.c() + aq4.e() / 2;
                int n6 = he4.l - 1;
                while (n6 >= 0) {
                    aq4 = he4.h(n6);
                    if (aq4.j() && aq4.d() < n4) {
                        int n7 = n6;
                        n4 = n6 - 1;
                        while (n4 >= 0) {
                            aq aq5 = he4.h(n4);
                            if (aq5.d() != aq4.d()) break;
                            if (aq4.b() > aq5.b()) {
                                n7 = n6;
                            } else if (aq4.b() < aq5.b()) {
                                aq4 = aq5;
                                n7 = n4;
                            } else if (Math.abs(aq5.c() + aq5.e() / 2 - n5) < Math.abs(aq4.c() + aq4.e() / 2 - n5)) {
                                aq4 = aq5;
                                n7 = n4;
                            }
                            --n4;
                        }
                        he4.i(n7);
                        return;
                    }
                    --n6;
                }
                return;
            }
            case 98: {
                he he5 = this;
                if (he5.o != null) {
                    n3 = he5.o[he5.l][1];
                    if (n3 < 0) {
                        n3 = he5.l;
                    }
                    he5.i(n3);
                    return;
                }
                aq aq6 = he5.t();
                int n8 = aq6.d();
                int n9 = aq6.c() + aq6.e() / 2;
                int n10 = aq6.f();
                int n11 = he5.l + 1;
                while (n11 < he5.k.d()) {
                    aq6 = he5.h(n11);
                    if (aq6.j() && aq6.d() + aq6.f() > n8 + n10) {
                        n8 = n11;
                        int n12 = n11 + 1;
                        while (n12 < he5.k.d()) {
                            aq aq7 = he5.h(n12);
                            if (aq7.d() != aq6.d()) break;
                            if (aq6.b() > aq7.b()) {
                                aq6 = aq7;
                                n8 = n12;
                            } else if (aq6.b() < aq7.b()) {
                                n8 = n11;
                            } else if (Math.abs(aq7.c() + aq7.e() / 2 - n9) < Math.abs(aq6.c() + aq6.e() / 2 - n9)) {
                                aq6 = aq7;
                                n8 = n12;
                            }
                            ++n12;
                        }
                        he5.i(n8);
                        return;
                    }
                    ++n11;
                }
                return;
            }
            case 95: {
                this.u();
                return;
            }
            case 94: {
                this.b(this.m);
                return;
            }
            case 93: {
                this.b(this.n);
            }
        }
    }

    public final void d(int n2) {
        if (this.l < 0) {
            return;
        }
        this.t().g(n2);
    }

    private void b(az az2) {
        if (az2 == null || this.i == null) {
            return;
        }
        aq aq2 = this.t();
        if (aq2 == null || !(aq2 instanceof ff)) {
            this.i.d(this.e, az2.a());
        }
    }

    private void u() {
        aq aq2 = this.t();
        if (aq2 == null) {
            return;
        }
        if (this.i != null && aq2 instanceof ex) {
            aq2 = (ex)aq2;
            this.i.d(this.e, ((ex)aq2).a());
            return;
        }
    }

    private void i(int n2) {
        if (n2 != this.l) {
            if (this.l >= 0) {
                this.h(this.l).d(false);
            }
            this.l = n2;
            this.h(this.l).d(true);
        }
    }

    public final int a(Object object, Object object2) {
        object = (aq)object;
        object2 = (aq)object2;
        if (((aq)object).d() > ((aq)object2).d()) {
            return 1;
        }
        if (((aq)object).d() == ((aq)object2).d()) {
            if (((aq)object).c() > ((aq)object2).c()) {
                return 1;
            }
            if (((aq)object).c() < ((aq)object2).c()) {
                return -1;
            }
            return 0;
        }
        return -1;
    }
}
