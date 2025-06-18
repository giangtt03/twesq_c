package com.mg.bas;
// Data model for a UI/game item with position, label, and event handler reference.
// Decompiled with: CFR 0.152
// Class Version: 1
public final class bj {
    static int a = 0x383837;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f = " ";
    public int g = 0;
    public int h = -1;
    bf i;
    int j = -1987;

    public bj(int n, int n2, int n3, int n4, String string, int n5) {
        this.b = n;
        this.c = n2;
        this.d = n3;
        this.e = n4;
        this.f = string;
        this.h = n5;
    }

    public final void a(bf bf2, int n) {
        this.i = bf2;
        this.j = n;
    }
}
