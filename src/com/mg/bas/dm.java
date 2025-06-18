package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class dm {
    private a d = new a();
    public int a;
    public int b = -1;
    public int c = 0;

    public dm(String string, int n, int n2, int n3) {
        this.a = n3;
        this.a(string, n, n2);
    }

    public final void a(String string, int n, int n2) {
        this.d.a(new dj(string, n, n2));
    }

    public final int a() {
        int n = 0;
        int n2 = 0;
        while (n2 < this.d.d()) {
            n += this.a(n2);
            ++n2;
        }
        return n -= 4;
    }

    public final int a(int n) {
        return this.b(n).c() + 8;
    }

    public final dj b(int n) {
        return (dj)this.d.b(n);
    }

    public final ls c(int n) {
        dj dj2 = this.b(n);
        return dj2.a;
    }

    public final ls b() {
        dj dj2 = this.b(this.c);
        return dj2.a;
    }

    public final int c() {
        return this.d.d();
    }
}
