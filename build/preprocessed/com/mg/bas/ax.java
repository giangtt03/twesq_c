package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// UI/game container class extending at, manages a fixed-size list of at elements with synchronization.
import javax.microedition.lcdui.Graphics;

public final class ax
extends at {
    private a a;
    private int b;
    private at c;
    private at d;

    public ax(int n) {
        this.a = new a(n);
        this.b = n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(at at2) {
        a a2 = this.a;
        synchronized (a2) {
            if (this.c == null) {
                this.c = at2;
                return;
            }
            if (this.a.d() >= this.b) {
                this.a.a(0);
            }
            this.a.a(at2);
            return;
        }
    }

    public final at a() {
        return this.c;
    }

    public final void b() {
        this.a.a();
        this.c = null;
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (this.d != null) {
            this.d.a(graphics);
        }
        if (this.c != null) {
            this.c.a(graphics);
        }
    }

    public final void b(at at2) {
        this.d = at2;
    }

    public final void i() {
        if (this.d != null) {
            this.d.i();
        }
        if (this.c != null) {
            this.c.i();
            if (!this.c.m()) {
                this.c = null;
                if (this.a.d() > 0) {
                    this.c = (at)this.a.b();
                    this.a.a(0);
                }
            }
        }
    }
}
