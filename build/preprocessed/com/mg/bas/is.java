package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class is
extends im {
    private static byte[][] x;
    protected Image s;
    protected Image t;
    protected int u;
    protected int v;
    protected int w;

    static {
        byte[][] byArrayArray = new byte[2][];
        byArrayArray[0] = new byte[1];
        byte[] byArray = new byte[13];
        byArray[2] = 1;
        byArray[3] = 1;
        byArray[4] = 1;
        byArray[5] = 2;
        byArray[6] = 2;
        byArray[7] = 3;
        byArray[8] = 3;
        byArray[9] = 3;
        byArray[10] = 4;
        byArray[11] = 4;
        byArray[12] = 4;
        byArrayArray[1] = byArray;
        x = byArrayArray;
    }

    public is() {
        mp.a().a(1000);
        this.s = mp.a().k;
        this.t = mp.a().l;
        this.a(x);
        this.r = false;
        this.v = 1;
        this.w = 5;
    }

    public void d(int n) {
        super.d(n);
        this.g = 0;
    }

    public final void a(int n, int n2, int n3, int n4, int n5) {
        this.b(n3, n4);
        this.c(n, n2);
        if (n < n3) {
            this.c(2);
        } else {
            this.c(0);
        }
        this.a(this.s, this.v);
        this.d(0);
        this.j(33);
        this.j = at.a(n, n3, 10);
        this.k = at.a(n2, n4, 10);
        this.r = true;
        this.u = n5;
    }

    public final void k() {
        if (this.u > 0) {
            --this.u;
            return;
        }
        if (this.e == 0) {
            if (this.b(this.h, this.i, this.j, this.k)) {
                this.a(this.t, this.w);
                this.j(3);
                this.d(1);
                return;
            }
        } else if (this.e == 1 && this.j()) {
            this.r = false;
        }
    }

    public void a(Graphics graphics, int n, int n2) {
        if (this.u > 0) {
            return;
        }
        super.a(graphics, n, n2);
    }
}
