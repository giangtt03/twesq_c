package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ip
extends at {
    public int a;
    public boolean b;
    private int c;
    private Image d;
    private int e;
    private int f = 0;
    private int g;

    public ip(int n, boolean bl, int n2) {
        this.a = n;
        this.b = bl;
        this.f = (bl ? 0 : 1) * 3 + n;
        if (!bl) {
            this.f = 3;
        }
        this.d = mp.a().P;
        this.e = 8;
        this.o = 17;
        this.p = 17;
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (this.e > 0) {
            return;
        }
        cw.a(graphics, this.d, this.f * this.o, 0, this.o, this.p, n, n2 + this.c / 2, 0);
    }

    public final void i() {
        if (this.e > 0) {
            --this.e;
            return;
        }
        if (this.c > 6) {
            this.c = 0;
            return;
        }
        if (++this.g > 3) {
            ++this.c;
            this.g = 0;
        }
    }
}
