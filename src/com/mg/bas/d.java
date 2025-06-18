package com.mg.bas;
// Abstract base class for font rendering and text drawing logic.
// Provides methods for measuring and rendering strings and characters, as well as font style management.

// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public abstract class d {
    protected int j;

    public abstract int a();

    public abstract int a(String var1);

    public void a(Graphics graphics, String string, int n, int n2, int n3) {
        this.a(graphics, string, 0, string.length(), n, n2, n3);
    }

    public abstract void a(Graphics var1, String var2, int var3, int var4, int var5, int var6, int var7);

    public abstract int a(char var1);

    public abstract int b();

    public abstract void a(boolean var1);

    public abstract void b(boolean var1);

    public abstract void c(boolean var1);

    public abstract void c();

    public final void a(int n) {
        this.j = n;
    }
}
