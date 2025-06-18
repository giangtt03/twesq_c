package com.mg.bas;
// Data structure for cryptographic state, holds integer and byte arrays for hashing operations.
// Decompiled with: CFR 0.152
// Class Version: 1
final class cy {
    int[] a;
    long b = 0L;
    byte[] c = new byte[64];

    public cy() {
        this.a = new int[4];
        this.a[0] = 1732584193;
        this.a[1] = -271733879;
        this.a[2] = -1732584194;
        this.a[3] = 271733878;
    }

    public cy(cy cy2) {
        this();
        int n = 0;
        while (n < this.c.length) {
            this.c[n] = cy2.c[n];
            ++n;
        }
        n = 0;
        while (n < this.a.length) {
            this.a[n] = cy2.a[n];
            ++n;
        }
        this.b = cy2.b;
    }
}
