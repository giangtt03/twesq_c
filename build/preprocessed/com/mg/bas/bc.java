package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// UI component for displaying multi-line text, extends au, manages text layout and rendering.
import javax.microedition.lcdui.Graphics;

public final class bc
extends au {
    private String c = null;
    private String[] d;
    private int e;
    private d f;
    private int g = 41377;
    private d h;

    public final void a(d d2) {
        this.f = d2;
    }

    public bc(String text, int n) {
        this.c = text;
        this.e = 0;
        this.f = bx.c;
        this.h = bx.b;
    }

    public final void a(k k2) {
        super.a(k2);
        if (this.c != null) {
            this.d = bx.a(this.c, k2.c, this.f);
        }
        if (this.d != null) {
            this.b = this.d.length * 15;
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (this.d != null) {
            int n3 = this.a.b + this.a.d;
            int n4 = 0;
            while (n4 < this.d.length) {
                if (n2 > n3) break;
                this.f.a(graphics, this.d[n4], n, n2, this.e);
                n2 += 15;
                ++n4;
            }
        }
    }
}
