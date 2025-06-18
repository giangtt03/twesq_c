package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// Abstract base class for UI/game elements with a reference to k and rendering method.
import javax.microedition.lcdui.Graphics;

public abstract class au {
    protected k a;
    protected int b;

    public final int a() {
        return this.b;
    }

    public void a(k k2) {
        this.a = k2;
    }

    public abstract void a(Graphics var1, int var2, int var3);
}
