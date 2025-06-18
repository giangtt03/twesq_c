package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class nl {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public nl(String string, int n, int n2, int n3, int n4, int n5) {
        this.a = string;
        this.e = n;
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.f = n5;
    }

    public final String toString() {
        return "PlayerAttribute " + this.a + "   dam  " + this.e + "  life" + this.f + "   hp = " + this.b + "  mana = " + this.c + "  power = " + this.d;
    }
}
