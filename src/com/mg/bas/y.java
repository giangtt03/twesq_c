package com.mg.bas;
// Animated UI/game element with custom rendering and state toggling.
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class y
extends x {
    private boolean h;

    public final void b() {
        super.b();
        if (this.e % 3 == 0) {
            this.h = !this.h;
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.c) {
            return;
        }
        if (this.h) {
            this.g.a(graphics, this.d, 0 + this.a, 0 + this.b, 1);
        }
    }
}
