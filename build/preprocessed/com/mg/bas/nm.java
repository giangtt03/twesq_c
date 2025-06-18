package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class nm
extends z {
    private at h;

    public final void a(at at2) {
        this.h = at2;
    }

    public final void a(String string, int n, int n2) {
        this.d = string;
        this.a = n;
        this.b = n2;
        this.c = false;
        this.e = 0;
    }

    public final void b() {
        if (this.c || this.d == null) {
            return;
        }
        ++this.e;
        if (this.e >= 30) {
            this.c = true;
            this.d = null;
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (this.d == null || this.c) {
            return;
        }
        int n3 = this.a;
        int n4 = this.b;
        if (this.h != null) {
            n3 = this.h.n() + this.h.p() / 2;
            n4 = this.h.o();
        }
        if (this.g != null) {
            this.g.a(graphics, this.d, n3 + n, n4 + n2 - this.e, 1);
        }
    }
}
