package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// UI component for displaying a text box or label, extends aq, manages rendering and state.
import javax.microedition.lcdui.Graphics;

public final class bb
extends aq {
    private o i;
    private boolean j = false;

    private bb(String string, int n2, d d2, boolean bl, int n3) {
        this.i = new o(d2, string, 0, 0, n2 - 2, d2.a(), n3);
        d2.c();
        this.a(1, 1, n2, this.i.c() + 2);
        this.b(false);
    }

    private bb(String string, int n2, d d2, int n3) {
        this(string, n2, d2, false, 1);
    }

    public bb(String string, int n2, d d2) {
        this(string, n2, d2, 1);
    }

    public final o a() {
        return this.i;
    }

    public final void d(boolean bl) {
        if (bl || this.g != bl) {
            this.c = true;
        }
        super.d(bl);
    }

    public final void a(Graphics graphics, int n2, int n3) {
        if (this.c) {
            if (this.j) {
                this.i.a().c(true);
            }
            this.i.a(graphics, n2 + this.c(), n3 + this.d());
            this.c = false;
            if (this.j) {
                this.i.a().c();
            }
        }
    }
}
