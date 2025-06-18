package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class hf
extends at {
    private String a = "";
    private int b = 0;
    private byte c;
    private d d = bx.d;

    public hf(String string, byte by, d d2) {
        this.c = by;
        if (string != null) {
            this.a = string;
        }
        if (d2 != null) {
            this.d = d2;
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        switch (this.c) {
            case 0: {
                graphics.setColor(16686236);
                break;
            }
            case 1: {
                graphics.setColor(16775619);
                break;
            }
            default: {
                graphics.setColor(14808319);
            }
        }
        graphics.fillRect(n + this.b, n2, this.o, this.p);
        this.d.a(graphics, this.a, n, n2, 0);
    }

    public final void i() {
    }

    public final void a(int n) {
        this.b = -5;
    }
}
