package com.mg.bas;
// Helper class for handling data transfer and callbacks, used by pa for persistence.
// Decompiled with: CFR 0.152
// Class Version: 1
final class pb
implements ko {
    private int b;
    private int c;
    byte[] a;
    private pa d;

    pb(pa pa2) {
        this.d = pa2;
    }

    public final void a(int n, int n2, byte[] byArray) {
        System.arraycopy(byArray, 0, this.a, this.c, byArray.length);
        this.c += byArray.length;
        nx.f(byArray.length);
        if (++n2 < this.b) {
            ks.a().a(n, n2);
            return;
        }
        pa.a(this.d);
    }

    public final void a(int n, int n2, int n3) {
        this.a = new byte[n2];
        this.b = n3;
        this.c = 0;
        ks.a().a(n, 0);
    }
}
