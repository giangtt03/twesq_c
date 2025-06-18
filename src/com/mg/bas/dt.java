package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class dt {
    private String a;
    private short b;
    private ds[] c;

    public dt(String string) {
        this.a = string;
    }

    public final short a() {
        return this.b;
    }

    public final void a(short s) {
        this.b = s;
    }

    public final String b() {
        return this.a;
    }

    public final ds[] c() {
        return this.c;
    }

    public final void a(ds[] dsArray) {
        this.c = dsArray;
        this.d();
    }

    public final void d() {
        if (this.c == null) {
            return;
        }
        int n = 0;
        while (n < this.c.length) {
            if (this.c[n].e() != 2) {
                boolean bl = false;
                int n2 = this.c.length - 1;
                while (n2 > n) {
                    if (this.c[n2].e() == 2) {
                        bl = true;
                        ds ds2 = this.c[n];
                        this.c[n] = this.c[n2];
                        this.c[n2] = ds2;
                    }
                    --n2;
                }
                if (!bl) {
                    return;
                }
            }
            ++n;
        }
    }
}
