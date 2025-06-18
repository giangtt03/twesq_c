package com.mg.bas;
// Abstract base class for UI/game menu or button elements, with event handling and rendering support.
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public abstract class az {
    private int e;
    private bf f;
    protected int a;
    protected int b;
    private int g;
    private int h;
    protected int c;
    protected int d;

    public az(int n) {
        int n2 = n;
        az az2 = this;
        this.e = n2;
    }

    public final int a() {
        return this.e;
    }

    public final void a(int n) {
        this.e = n;
    }

    public final void a(bf bf2) {
        this.f = bf2;
    }

    public final boolean b(int n) {
        if (this.f != null) {
            this.f.d(n, this.e);
            return true;
        }
        return false;
    }

    public final void a(int n, int n2, int n3) {
        this.a = n;
        this.g = n;
        switch (n3) {
            case 24: {
                this.a = n - this.c;
                this.g = n - v.t / 3;
                break;
            }
            case 17: {
                this.a = n - this.c / 2;
                this.g = n - v.t / 6;
            }
        }
        this.b = n2;
        this.h = n2;
    }

    public boolean a(int n, int n2) {
        return n2 >= this.h && n >= this.g && n <= this.g + v.t / 3;
    }

    public boolean b() {
        this.d = 3;
        return true;
    }

    public abstract void a(Graphics var1);

    public void c() {
        if (this.d > 0) {
            --this.d;
        }
    }
}
