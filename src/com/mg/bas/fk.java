package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class fk
extends fn {
    public boolean i;

    public final void a(int n2, int n3, int n4, int n5) {
        super.a(n2, n3, n4, n5);
        this.j = new g(n4, 0);
    }

    public final synchronized void b(aq aq2) {
        aq2.a_(0, this.j.b);
        this.j.b += aq2.f() + 1;
        super.b(aq2);
    }

    public final synchronized void a(aq aq2, int n2) {
        aq2.a_(0, this.j.b);
        this.j.b += aq2.f() + 1;
        super.a(aq2, n2);
    }

    public final synchronized void c(aq aq2) {
        this.j.b -= aq2.f() + 1;
        super.c(aq2);
    }

    public final boolean f(int n2) {
        if (this.l < 0) {
            return false;
        }
        int n3 = this.u().f(n2);
        if (n3 != 0) {
            return true;
        }
        switch (n2) {
            case 99: {
                fk fk2 = this;
                if (fk2.b == null) {
                    if (fk2.i) {
                        n3 = fk2.l - 1;
                        if (fk2.l < 0) {
                            fk2.l = fk2.r() - 1;
                        }
                        fk2.i(n3);
                        return true;
                    }
                    if (fk2.l > 0) {
                        fk2.i(fk2.l - 1);
                        return true;
                    }
                    return false;
                }
                ay ay2 = (ay)fk2.b;
                k k2 = fk2.x();
                return fk2.a(ay2, k2, -1);
            }
            case 98: {
                fk fk3 = this;
                if (fk3.b == null) {
                    if (fk3.i) {
                        n3 = fk3.l + 1;
                        if (n3 >= fk3.r()) {
                            n3 = 0;
                        }
                        fk3.i(n3);
                        return true;
                    }
                    if (fk3.l < fk3.r() - 1) {
                        fk3.i(fk3.l - 1);
                        return true;
                    }
                    return false;
                }
                ay ay3 = (ay)fk3.b;
                k k3 = fk3.x();
                return fk3.a(ay3, k3, 1);
            }
            case 95: {
                if (this.n == null) break;
                this.n.b(this.u(), this.l);
            }
        }
        return false;
    }

    private k x() {
        if (this.b != null) {
            return ((ay)this.b).r();
        }
        return new k(0, 0, this.e(), this.f());
    }

    public final boolean g(int n2) {
        aq aq2 = this.u();
        if (aq2 != null) {
            return aq2.g(n2);
        }
        return false;
    }

    public final boolean c(int n2, int n3) {
        n2 -= this.c();
        n3 -= this.d();
        int n4 = 0;
        while (n4 < this.k.d()) {
            aq aq2 = (aq)this.k.b(n4);
            if (aq2 != null && aq2.j() && aq2.h().a(n2, n3)) {
                int n5;
                if (n4 != this.l) {
                    this.i(n4);
                    if (this.b != null && this.b instanceof ay) {
                        n5 = 1;
                        int n6 = 0;
                        while (n6 <= this.l) {
                            n5 += this.j(n6).f() + 1;
                            ++n6;
                        }
                        n6 = n5 - this.u().f() - 1;
                        if (n5 > this.m.b + this.m.d) {
                            ((ay)this.l()).j(n5 - (this.m.b + this.m.d));
                        }
                        if (n6 < this.m.b) {
                            ((ay)this.l()).j(n6 - this.m.b);
                        }
                    }
                }
                if ((n5 = aq2.c(n2, n3)) != 0) {
                    return true;
                }
                this.f(95);
            }
            ++n4;
        }
        return false;
    }

    public final boolean f(int n2, int n3) {
        n2 -= this.c();
        n3 -= this.d();
        aq aq2 = this.u();
        if (aq2 != null) {
            return aq2.f(n2, n3);
        }
        return false;
    }

    public final boolean e(int n2, int n3) {
        if (this.b != null && this.b instanceof ay) {
            ((ay)this.l()).j(n3);
            return true;
        }
        return false;
    }

    public final void a() {
        this.j.b = 0;
        int n2 = 0;
        int n3 = this.k.d();
        while (n2 < n3) {
            aq aq2 = (aq)this.k.b(n2);
            aq2.a_(0, this.j.b);
            this.j.b += aq2.f() + 1;
            ++n2;
        }
        this.c(true);
    }

    private int d(int n2, int n3) {
        int n4 = 0;
        while (n2 <= n3) {
            aq aq2 = (aq)this.k.b(n2++);
            n4 += aq2.f() + 1;
        }
        return n4;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean a(ay ay2, k k2, int n2) {
        int n3;
        block16: {
            block17: {
                int n4;
                int n5;
                block14: {
                    block15: {
                        n5 = this.d(0, this.l - 1);
                        aq aq2 = (aq)this.k.b(this.l);
                        n4 = aq2.f();
                        n3 = 0;
                        if (n2 >= 0) break block14;
                        if (this.l <= 0) break block15;
                        aq aq3 = (aq)this.k.b(this.l - 1);
                        n2 = aq3.f();
                        int n6 = n5 - 1 - n2;
                        if (n6 + n2 <= k2.b + 5) {
                            ay2.d(2, -1);
                            return true;
                        }
                        this.i(this.l - 1);
                        n5 = this.d(0, this.l - 1);
                        aq3 = (aq)this.k.b(this.l);
                        int n7 = aq3.f();
                        if (n5 <= k2.b) {
                            n3 = n5 - k2.b;
                            if (n7 >= k2.d) {
                                n3 += n7 - k2.d;
                                break block16;
                            } else if (this.l > 0) {
                                aq aq4 = (aq)this.k.b(this.l - 1);
                                n3 = n5 - n3 + aq4.f() + n7 > k2.b + k2.d ? (n3 -= k2.d - n7) : (n3 -= aq4.f());
                            }
                        }
                        break block16;
                    }
                    if (this.i) {
                        this.i(this.r() - 1);
                        ay2.g(true);
                        return true;
                    }
                    if (ay2.t()) {
                        return false;
                    }
                    ay2.d(2, -1);
                    return true;
                }
                if (this.l >= this.r() - 1) break block17;
                this.k.b(this.l + 1);
                n2 = n5 + n4 + 1;
                if (n2 >= k2.b + k2.d - 5) {
                    ay2.d(2, 1);
                    return true;
                }
                this.i(this.l + 1);
                n5 = this.d(0, this.l - 1);
                aq aq5 = (aq)this.k.b(this.l);
                int n8 = aq5.f();
                if (n5 + n8 >= k2.b + k2.d) {
                    n3 = n5 + n8 - k2.b - k2.d;
                    if (n8 >= k2.d) {
                        n3 -= n8 - k2.d;
                        break block16;
                    } else if (this.l < this.r() - 1) {
                        aq aq6 = (aq)this.k.b(this.l + 1);
                        n3 = n5 - n3 - aq6.f() < k2.b ? (n3 += k2.d - n8) : (n3 += aq6.f());
                    }
                }
                break block16;
            }
            if (this.i) {
                this.i(0);
                ay2.f(true);
                return true;
            }
            if (ay2.s()) {
                return false;
            }
            ay2.d(2, 1);
            return true;
        }
        ay2.j(n3);
        return true;
    }
}
