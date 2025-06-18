package com.mg.bas;
// Data model for an entity with a name, value, and references to dg objects. Supports deep copying and string representation.
// Decompiled with: CFR 0.152
// Class Version: 1
public final class df {
    public int a;
    public String b;
    public int c;
    public dg d;
    public dg e;
    public dg[] f;

    public df(int n) {
        this.a = n;
    }

    public final String toString() {
        return this.b;
    }

    public final df a() {
        df df2 = new df(this.a);
        new df(this.a).b = this.b;
        df2.c = this.c;
        df2.d = this.d.a();
        df2.e = this.e.a();
        df2.f = new dg[this.f.length];
        int n = 0;
        while (n < this.f.length) {
            df2.f[n] = this.f[n].a();
            ++n;
        }
        return df2;
    }
}
