package com.mg.bas;
// Data structure and manager for storing objects with index, supports event callbacks via bp interface.
// Decompiled with: CFR 0.152
// Class Version: 1
public final class bm
implements bo {
    private a a = new a();
    private bp b;

    public final void a(Object[] objectArray, int n) {
        int n2 = 0;
        int n3 = n;
        int n4 = n + objectArray.length;
        while (n3 < n4) {
            this.a.b(objectArray[n2++], n3);
            ++n3;
        }
        if (this.b != null) {
            this.b.d(n, objectArray.length);
        }
    }

    public final void a(Object object, int n) {
        this.a.b(object, n);
        if (this.b != null) {
            this.b.m(n);
        }
    }

    public final void a(bp bp2) {
        this.b = bp2;
    }

    public final Object a(int n) {
        return this.a.b(n);
    }

    public final int a() {
        return this.a.d();
    }

    public final void a(Object object) {
        this.b(this.a.c(object));
    }

    public final void b(int n) {
        this.a.a(n);
        if (this.b != null) {
            this.b.n(n);
        }
    }

    public final void b(Object object, int n) {
        this.a.a(object, n);
        if (this.b != null) {
            this.b.l(n);
        }
    }

    public final void b() {
        this.a.a();
        if (this.b != null) {
            this.b.n(-1);
        }
    }
}
