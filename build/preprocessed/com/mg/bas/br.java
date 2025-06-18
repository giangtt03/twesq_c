package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// Data model for a menu or tree node, stores label, value, children, and associated object. Extends at.
import javax.microedition.lcdui.Graphics;

public final class br
extends at {
    private String a;
    private int b;
    private br[] c;
    private Object d;

    public br(String string, int n) {
        this.a = string;
        this.b = n;
        this.h(bx.c.a(string));
    }

    public final Object a() {
        return this.d;
    }

    public final void a(Object object) {
        this.d = object;
    }

    public final String b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final void a(br[] brArray) {
        this.c = brArray;
    }

    public final br[] d() {
        return this.c;
    }

    public final boolean e() {
        return this.c != null && this.c.length > 0;
    }

    public final void a(Graphics graphics, int n, int n2, boolean bl) {
        if (bl) {
            bx.c.a(graphics, this.a, n, n2, 0);
        } else {
            bx.d.a(graphics, this.a, n, n2, 0);
        }
        this.f(n);
        this.g(n2);
    }

    public final void a(Graphics graphics, int n, int n2) {
    }

    public final void i() {
    }

    public final String toString() {
        return "popupItem id= " + this.l + "     caption= " + this.a + "      command= " + this.b;
    }
}
