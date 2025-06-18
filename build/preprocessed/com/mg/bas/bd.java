package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// UI component for displaying a menu item or button, extends az, manages label and rendering.
import javax.microedition.lcdui.Graphics;

public final class bd
extends az {
    private String e;

    public final String d() {
        return this.e;
    }

    public bd(String string, int n) {
        super(n);
        this.e = string;
        this.c = bx.b.a(string);
    }

    public final void a(Graphics graphics) {
        if (this.d > 0) {
            bx.b.a(graphics, this.e, this.a, this.b + 1, 0);
            return;
        }
        bx.c.a(graphics, this.e, this.a, this.b, 0);
    }
}
