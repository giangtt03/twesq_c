package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// UI component for displaying and managing a labeled element with custom rendering.
import javax.microedition.lcdui.Graphics;

public final class q
extends n {
    private d i = null;
    private boolean j = false;

    public final void a(d d2) {
        this.i = d2;
    }

    public q(String string, int n2, int n3, int n4, int n5, int n6, d d2) {
        this.i = d2;
        this.g = string;
        this.a = n2;
        this.f = n3;
        this.b = n4;
        this.c = n5;
        this.d = n6;
        this.a(d2.a());
        if (n2 == 3) {
            boolean bl = true;
            q q2 = this;
            this.j = true;
        }
    }

    public final String toString() {
        return this.g;
    }

    public final void a(Graphics graphics, int n2, int n3) {
        n2 += this.b;
        n3 += this.c;
        if (this.h && (this.a == 3 || this.a == 4 || this.a == 5)) {
            graphics.setColor(0xD8D8D8);
            graphics.fillRect(n2 - 1, n3, this.d + 1, this.e);
        }
        if (this.j) {
            this.i.b(true);
            this.i.a(graphics, this.g, n2, n3 + (this.e - this.i.a()) / 2, 0);
            this.i.c();
            return;
        }
        this.i.a(graphics, this.g, n2, n3 + (this.e - this.i.a()) / 2, 0);
    }
}
