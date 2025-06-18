package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// UI/game element extending aa, manages position, size, and animation state. Handles vertical movement and state transitions.
import javax.microedition.lcdui.Graphics;

public final class ac
extends aa {
    private boolean j;
    private boolean k;

    public final void a(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n6 < 18) {
            n6 = 18;
        }
        if (n5 < 18) {
            n5 = 18;
        }
        this.a = n + n5 / 2;
        this.b = n2;
        this.c = n3 + n5 / 2;
        this.d = n4 + n6 / 2;
        this.g = n5;
        this.h = n6;
        this.f = 18;
        this.e = 18;
        this.a = this.c;
        this.b = this.d;
        this.k = this.b > n4;
        this.j = false;
        this.i = false;
    }

    public final void b() {
        if (this.i) {
            return;
        }
        if (this.j) {
            int n;
            this.b = this.d;
            if (this.f != this.h) {
                n = this.h - this.f;
                this.f = Math.abs(n) < 10 ? (this.f += n) : (this.f += n / 2);
            }
            if (this.e != this.g) {
                n = this.g - this.e;
                this.e = Math.abs(n) < 10 ? (this.e += n) : (this.e += n / 2);
            }
            this.i = this.f == this.h && this.e == this.g;
            return;
        }
        int n = this.k ? this.d - 2 : this.d + 2;
        if (Math.abs(n = n - this.b) < 2) {
            this.b += n;
            this.j = true;
            return;
        }
        this.b += n / 2;
    }

    public final void a(Graphics graphics) {
        ag.c().a(graphics, this.c(), this.d(), this.e(), this.f());
    }
}
