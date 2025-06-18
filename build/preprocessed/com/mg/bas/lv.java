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
        Object object = this;
        object = "Skill " + ((ld)object).a + ": " + this.b + "\n";
        object = String.valueOf(object) + this.d + "\n";
        object = String.valueOf(object) + "Level: " + this.f + "  Mana: " + this.e + "\n";
        object = String.valueOf(object) + "Max Level: " + this.g + "\n";
        if (this.h != null) {
            int n = 0;
            while (n < this.h.length) {
                object = String.valueOf(object) + this.h[n] + "\n";
                ++n;
            }
        }
        return object;
    }
}
