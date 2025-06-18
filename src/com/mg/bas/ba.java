package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// UI component for displaying a status or info bar at the bottom of the screen, extends at.
import javax.microedition.lcdui.Graphics;

public final class ba
extends at {
    public static int a = 17;

    public ba() {
        if (v.z) {
            a = 21;
        }
        this.a(0, v.u - a, v.t, a);
    }

    public final void a(Graphics graphics, int n, int n2) {
        ag.c().c(graphics, this.m, this.n, this.o, this.p);
    }

    public final void i() {
    }
}
