package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
final class js
extends jp {
    js() {
    }

    public final int a() {
        return this.d << 2;
    }

    public final int b() {
        return (this.b * 80 + (this.a << 4)) / 100;
    }

    public final int c() {
        return this.b + this.a / 5;
    }

    public final int d() {
        return this.b / 2;
    }

    public final int e() {
        return this.b * 15 / 10;
    }

    public final int f() {
        return this.b * 3;
    }

    public final int g() {
        return Math.min(5 + this.b / 8, 30);
    }
}
