package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class ir
extends at {
    private int a;
    private int b;
    private int c;

    public final void j(int n) {
        ((at)null).j(n);
    }

    public final void a(Graphics graphics, int n, int n2) {
    }

    public final void b(Graphics graphics, int n, int n2) {
        if (!((at)null).m() || this.a < 5) {
            return;
        }
        ((as)null).a(graphics, n + null[0], n2 + null[1]);
    }

    public final void c(Graphics graphics, int n, int n2) {
        if (!((at)null).m() || this.a >= 5) {
            return;
        }
        ((as)null).a(graphics, n + null[0], n2 + null[1]);
    }

    public final void i() {
        if (!this.r) {
            return;
        }
        if (this.b > 0) {
            --this.b;
            if (this.b == 0) {
                ((at)null).b(true);
            } else {
                return;
            }
        }
        ((as)null).i();
        if (this.c > 0) {
            --this.c;
            return;
        }
        this.c = 2;
        this.a = (this.a + 1) % (null).length;
    }
}
