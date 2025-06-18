package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// UI/game element extending aa, manages position, size, and animation state. Handles resizing and state transitions.
import javax.microedition.lcdui.Graphics;

public final class ab
extends aa {
    private boolean j;

    public final void a(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n6 < 18) {
            n6 = 18;
        }
        if (n5 < 18) {
            n5 = 18;
        }
        this.a = n + n5 / 2;
        this.b = n2 + n6 / 2;
        this.c = n3 + n5 / 2;
        this.d = n4;
        this.g = 18;
        this.h = 18;
        this.e = n5;
        this.f = n6;
        this.c = this.a;
        this.d = this.b;
        this.j = true;
        this.i = false;
    }

    public final void b() {
        if (this.i) {
            return;
        }
        if (this.j) {
            int n;
            if (this.e != this.g) {
                n = this.g - this.e;
                this.e = Math.abs(n) < 10 ? (this.e += n) : (this.e += n / 2);
            }
            if (this.f != this.h) {
                n = this.h - this.f;
                this.f = Math.abs(n) < 10 ? (this.f += n) : (this.f += n / 2);
            }
            this.i = this.f == this.h && this.e == this.g;
            return;
        }
        int n = this.d;
        if (Math.abs(n -= this.b) < 2) {
            this.b += n;
            this.i = true;
            return;
        }
        this.b += n / 2;
    }

    public final void a(Graphics graphics) {
        ag.c().a(graphics, this.c(), this.d(), this.e(), this.f());
    }
}
