package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class et
extends aq {
    private ls i;

    public et(dq dq2, int n2) {
        this.i = new ls(dq2.a, 0, 0, n2, bx.c.a() + 4, 1);
        this.d(n2);
        this.e(this.i.c() + 14);
    }

    public final void d(boolean bl) {
        if (bl || this.g != bl) {
            this.c = true;
        }
        super.d(bl);
    }

    public final void a(Graphics graphics, int n2, int n3) {
        if (!this.c) {
            return;
        }
        n3 += this.d() + 10;
        n2 += this.c();
        if (this.g) {
            graphics.setColor(7267055);
            graphics.fillRect(n2, n3, this.e(), this.f() - 10);
        } else {
            graphics.setColor(13931764);
            graphics.fillRect(n2, n3, this.e(), this.f() - 10);
        }
        this.i.a(graphics, n2 + 2, n3 + 2);
        if (this.g) {
            graphics.drawImage(pc.e, n2 + this.e() - 20, n3 + this.f() - 27, 0);
        }
        this.c = false;
    }
}
