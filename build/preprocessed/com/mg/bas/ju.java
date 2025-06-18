package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ju
extends ka {
    public int s = 7;
    public int t = 0;
    public int u = 2;
    private np x = new np();
    private boolean y = true;
    private int z = 60;

    public ju(Image image, int n) {
        super(image, 1);
        this.a(image, 1);
        this.a((byte)0);
        this.u = cv.a(4);
        this.s = cv.a(3, 7);
        this.x.a();
        this.g = 0;
    }

    public final void l(int n) {
        this.z = 60;
    }

    public final void a(byte by) {
        this.e = by;
        switch (by) {
            case 0: {
                return;
            }
            case 1: {
                this.t = this.s;
            }
        }
    }

    public final void k() {
        super.k();
        if (this.x.g() > (long)this.z) {
            this.b(false);
        }
        if (this.x.g() > (long)(this.z - 1)) {
            this.y = !this.y;
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.y) {
            return;
        }
        super.a(graphics, n, n2);
    }
}
