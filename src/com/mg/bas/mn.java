package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class mn
extends mk {
    public mn(mq mq2, int n) {
        super(mq2, n);
    }

    public final void a(int n) {
        switch (n) {
            case 99: {
                this.a.g();
                return;
            }
            case 98: {
                this.a.h();
                return;
            }
            case 97: {
                this.a.i();
                return;
            }
            case 96: {
                this.a.j();
                return;
            }
            case 95: {
                this.a.l();
            }
        }
    }

    public final void a(int n, int n2) {
        k k2 = this.a.k();
        if (k2.b(n, n2)) {
            n = (n - k2.a) / 28 + 2;
            n2 = (n2 - k2.b) / 28 + 2;
            int n3 = this.a.n();
            int n4 = this.a.o();
            if (n2 == n3 && n == n4) {
                this.a.l();
                return;
            }
            if (this.a.m()) {
                n -= n4;
                if ((n2 -= n3) == 1) {
                    this.a.h();
                    return;
                }
                if (n2 == -1) {
                    this.a.g();
                    return;
                }
                if (n == 1) {
                    this.a.j();
                    return;
                }
                if (n == -1) {
                    this.a.i();
                    return;
                }
            } else {
                this.a.g(n2, n);
            }
        }
    }

    public final void b(int n, int n2) {
        k k2 = this.a.k();
        if (k2.b(n, n2)) {
            n = (n - k2.a) / 28 + 2;
            n2 = (n2 - k2.b) / 28 + 2;
            int n3 = this.a.n();
            int n4 = this.a.o();
            if (n2 != n3 || n != n4) {
                boolean bl = this.a.m();
                if (!bl) {
                    this.a.l();
                }
                if (Math.abs(n2 -= n3) > Math.abs(n -= n4)) {
                    if (n2 > 0) {
                        this.a.h();
                        return;
                    }
                    if (n2 < 0) {
                        this.a.g();
                        return;
                    }
                } else {
                    if (n > 0) {
                        this.a.j();
                        return;
                    }
                    if (n < 0) {
                        this.a.i();
                        return;
                    }
                    if (!bl) {
                        this.a.l();
                    }
                }
            }
        }
    }
}
