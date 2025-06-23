package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// Manages a game or UI state, with logic for updating, copying, and interacting with other objects (ds, dq, a).
public final class di {
    private ds c;
    private a d;
    private int e;
    private boolean f;
    public boolean a = false;
    public dq b = null;

    public final boolean a() {
        return this.f;
    }

    public final void a(boolean bl) {
        this.f = bl;
    }

    public di(ds object, int n, boolean bl, dq dq2) {
        ds ds2 = object;
        this.c = ds2;
        boolean bl2 = bl;
        this.f = bl2;
        this.e = n;
        this.d = new a(30);
        this.b = dq2;
        if (dq2 != null) {
            this.a(dq2.a, 0, 2);
        }
    }

    public final void a(ds ds2) {
        this.c = ds2;
    }

    public final boolean a(String string, int n) {
        return this.a(string, n, 0);
    }

    public final boolean b(String string, int n) {
        return this.a(string, n, 1);
    }

    private boolean a(String string, int n, int n2) {
        boolean bl = false;
        if (this.d.d() >= 30) {
            this.d.a(0);
            bl = true;
        }
        dm dm2 = null;
        if (this.d.d() > 0) {
            dm2 = this.a(this.d.d() - 1);
        }
        if (dm2 != null && dm2.a == n2) {
            dm2.a(string, n, this.e);
            return bl;
        }
        this.d.a(new dm(string, n, this.e, n2));
        return bl;
    }

    public final ds b() {
        return this.c;
    }

    public final a c() {
        return this.d;
    }

    public final int d() {
        return this.d.d();
    }

    public final dm a(int n) {
        return (dm)this.d.b(n);
    }
}
