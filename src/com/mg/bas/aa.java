package com.mg.bas;
// Abstract base class for UI/game elements with position, size, and state. Provides basic interface for rendering and state management.
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public abstract class aa {
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected int h;
    protected boolean i;

    public abstract void a(int var1, int var2, int var3, int var4, int var5, int var6);

    public final boolean a() {
        return this.i;
    }

    public void b() {
        if (this.i) {
            return;
        }
    }

    public void a(Graphics graphics) {
    }

    public final int c() {
        return this.a - this.e / 2;
    }

    public final int d() {
        return this.b - this.f / 2;
    }

    public final int e() {
        return this.e;
    }

    public final int f() {
        return this.f;
    }
}
