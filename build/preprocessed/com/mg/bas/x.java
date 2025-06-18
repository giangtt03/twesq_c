package com.mg.bas;
// Abstract base class for animated or timed UI/game elements.
// Decompiled with: CFR 0.152
// Class Version: 1
public abstract class x {
    protected int a;
    protected int b;
    protected boolean c;
    protected String d;
    protected int e;
    protected int f = 8;
    protected d g = bx.c;

    public final void a(int n) {
        this.f = n;
    }

    public final boolean a() {
        return this.c;
    }

    public final void a(d d2) {
        this.g = d2;
    }

    public void a(String string, int n, int n2) {
        this.e = 0;
        this.d = string;
        this.a = n;
        this.b = n2;
        this.c = true;
    }

    public void b() {
        if (this.e < this.f) {
            ++this.e;
            return;
        }
        this.c = false;
    }
}
