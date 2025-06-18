package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class lx {
    private int f;
    public int a;
    public int b;
    public int c;
    public int d;
    public String e;

    public lx(int n) {
        this.f = n;
    }

    public final String toString() {
        String string = "[skill level ] levevl = " + this.a + "   id = " + this.f + "\n";
        string = String.valueOf(string) + "   - request level: " + this.b + "\n";
        string = String.valueOf(string) + "   - Point: " + this.c + "\n";
        return string;
    }
}
