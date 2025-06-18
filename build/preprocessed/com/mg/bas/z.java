package com.mg.bas;
// Animated UI/game element for displaying text with movement.
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public class z
extends x {
    public z() {
        this.f = 10;
    }

    public void a(Graphics graphics, int n, int n2) {
        if (!this.c) {
            return;
        }
        this.g.a(graphics, this.d, n + this.a, n2 + this.b - this.e, 1);
    }
}
