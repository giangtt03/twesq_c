package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class fy
extends aq {
    private dh i;
    private int[] j;
    private int k;
    private String l;
    private boolean m = false;
    private d n;

    public fy(dh dh2) {
        this.i = dh2;
        this.e(20);
        this.d(v.t);
        this.n = bx.c;
    }

    public final void a(d d2) {
        this.n = d2;
    }

    public final void a(int[] nArray) {
        this.j = nArray;
        this.k = nArray[2] - nArray[1] - 10;
        this.l = com.mg.sq.a.a(this.i.c, this.k);
    }

    public final void e(boolean bl) {
        this.m = true;
    }

    public final void a(Graphics graphics, int n, int n2) {
        n += this.c();
        n2 += this.d();
        if (this.g) {
            pc.e(graphics, n, n2, this.e(), this.f());
        } else if (this.m) {
            int n3 = n + 7;
            int n4 = this.e() - 14;
            int n5 = this.f() - 2;
            int n6 = n2 + 1;
            graphics.setColor(12644863);
            graphics.fillRect(n3, n6, n4, n5);
            graphics.setColor(12644849);
            graphics.drawRect(n3, n6, n4, n5);
            graphics.drawRect(n3 - 1, n6 - 1, n4 + 2, n5 + 2);
        }
        this.n.a(graphics, this.i.b, this.j[0] + n, n2 += 2, 0);
        this.n.a(graphics, this.l, this.j[1] + n, n2, 0);
        this.n.a(graphics, this.i.d, this.j[2] + n, n2, 0);
    }
}
