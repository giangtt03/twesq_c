package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class k {
    public int a;
    public int b;
    public int c;
    public int d;

    public k() {
    }

    public k(int n, int n2, int n3, int n4) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    public final void a(int n, int n2, int n3, int n4) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    public final boolean a(int n, int n2) {
        return n > this.a && n < this.a + this.c && n2 > this.b && n2 < this.b + this.d;
    }

    public final boolean a(k k2) {
        return this.b(k2.a, k2.b, k2.c, k2.d);
    }

    public final boolean b(int n, int n2, int n3, int n4) {
        int n5 = this.c;
        int n6 = this.d;
        if (n3 <= 0 || n4 <= 0 || n5 <= 0 || n6 <= 0) {
            return false;
        }
        int n7 = this.a;
        int n8 = this.b;
        return !((n3 += n) >= n && n3 <= n7 || (n4 += n2) >= n2 && n4 <= n8 || (n5 += n7) >= n7 && n5 <= n || (n6 += n8) >= n8 && n6 <= n2);
    }

    public final boolean b(int n, int n2) {
        int n3 = this.c;
        int n4 = this.d;
        if ((n3 | n4) < 0) {
            return false;
        }
        int n5 = this.a;
        int n6 = this.b;
        if (n < n5 || n2 < n6) {
            return false;
        }
        return !((n3 += n5) >= n5 && n3 <= n || (n4 += n6) >= n6 && n4 <= n2);
    }

    public final String toString() {
        String string = "[X]: " + this.a + " [Y]: " + this.b + " [W]: " + this.c + " [H]: " + this.d;
        return string;
    }
}
