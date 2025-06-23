package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class lv
extends ld {
    public int e;
    public int f;
    public int g;
    public String[] h;

    public lv(int n) {
        super(n);
    }

    public final String toString() {
        String result = "Skill " + this.a + ": " + this.b + "\n";
        result = String.valueOf(result) + this.d + "\n";
        result = String.valueOf(result) + "Level: " + this.f + "  Mana: " + this.e + "\n";
        result = String.valueOf(result) + "Max Level: " + this.g + "\n";
        if (this.h != null) {
            int n = 0;
            while (n < this.h.length) {
                result = String.valueOf(result) + this.h[n] + "\n";
                ++n;
            }
        }
        return result;
    }
}
