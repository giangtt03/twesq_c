package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class fm
extends ex {
    public fm(String string, int n) {
        super(string, -10);
    }

    public final void d(boolean bl) {
        if (bl || this.g != bl) {
            this.c = true;
        }
        super.d(bl);
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.e || !this.c) {
            return;
        }
        n += this.c();
        n2 += this.d();
        if (this.g) {
            graphics.setColor(7267055);
        } else {
            graphics.setColor(14722016);
        }
        int n3 = this.f() - 2;
        graphics.fillRect(n + 1, n2 + 1, this.e() - 2, n3);
        pc.a(graphics, n, n2, this.e(), this.f(), 2401717, -1);
        if (this.g) {
            com.mg.sq.a.h.a(graphics, this.i, n + this.e() / 2, n2 + 3, 1);
            graphics.drawImage(pc.e, n + this.e() / 2, n2 + 9, 17);
        } else {
            bx.c.a(graphics, this.i, n + this.e() / 2, n2 + 3, 1);
        }
        this.c = false;
    }
}
