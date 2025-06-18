package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class lm
extends ld {
    public byte e = 0;
    public int f = 0;
    public int g;
    public long h;
    public int i;
    public int j;
    public long k;
    public int l = -1;
    public byte m = 1;

    public lm(int n) {
        super(n);
    }

    public final boolean a() {
        return this.m == 1;
    }

    public final String toString() {
        return "Item[id=" + this.a + "; qty=" + this.g + "; $=" + this.h + "        type = " + this.e + " res id = " + this.j + "     ] name = " + this.b + "  displaynam = " + this.c + "  requireKen = " + this.k + "  des = " + this.d + "  slotCapacity = " + this.l + "   trade   " + this.m;
    }

    public final lm b() {
        lm lm2 = new lm(this.a);
        new lm(this.a).e = this.e;
        lm2.d = this.d;
        lm2.g = this.g;
        lm2.f = this.f;
        lm2.h = this.h;
        lm2.i = this.i;
        lm2.b = this.b;
        lm2.c = this.c;
        lm2.j = this.j;
        lm2.k = this.k;
        lm2.l = this.l;
        lm2.m = this.m;
        return lm2;
    }
}
