package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class gi
extends at {
    private String a = "";
    private int b = 60;

    public gi(String string) {
        this.a = string;
        this.m = v.t;
        this.n = 0;
        this.o = bx.d.a(string);
        this.b = 40;
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.r) {
            return;
        }
        pc.b(graphics, 0, 0, v.t, 20, false);
        bx.d.a(graphics, this.a, this.m, 4, 0);
    }

    public final void i() {
        if (!this.r) {
            return;
        }
        if (this.m > v.t / 3) {
            this.m /= 10;
            return;
        }
        if (this.b > 0) {
            --this.b;
            return;
        }
        if (this.m > 0 || this.m > -this.o) {
            this.m -= 2;
            return;
        }
        this.r = false;
        com.mg.sq.a.s().f();
    }
}
