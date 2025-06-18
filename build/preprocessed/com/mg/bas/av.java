package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// UI utility class for drawing colored rectangles, used for backgrounds or highlights.
import javax.microedition.lcdui.Graphics;

public class av {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public av() {
    }

    public void a(Graphics graphics) {
        graphics.setColor(this.a);
        graphics.fillRect(this.b, this.c, this.d, this.e);
    }

    public av(int n, int n2, int n3, int n4, int n5) {
        this();
        this.a = 0xFFFFFF;
        this.b = 0;
        this.c = 0;
        this.d = n4;
        this.e = n5;
    }
}
