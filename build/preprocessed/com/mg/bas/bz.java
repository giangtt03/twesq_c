package com.mg.bas;
// Font renderer using javax.microedition.lcdui.Font, provides string and substring drawing. Extends d.
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class bz
extends d {
    private Font a = Font.getDefaultFont();

    public final int a() {
        return this.a.getHeight();
    }

    public final int a(String string) {
        return this.a.stringWidth(string);
    }

    public final void a(Graphics graphics, String string, int n, int n2, int n3) {
        graphics.setColor(this.j);
        if (n3 == 0) {
            graphics.drawString(string, n, n2, 0);
            return;
        }
        if (n3 == 2) {
            graphics.drawString(string, n, n2, 24);
            return;
        }
        if (n3 == 1) {
            graphics.drawString(string, n, n2, 17);
        }
    }

    public final void a(Graphics graphics, String string, int n, int n2, int n3, int n4, int n5) {
        if (n5 == 0) {
            graphics.drawSubstring(string, 0, n2, n3, n4, 0);
            return;
        }
        if (n5 == 2) {
            graphics.drawSubstring(string, 0, n2, n3, n4, 24);
            return;
        }
        if (n5 == 1) {
            graphics.drawSubstring(string, 0, n2, n3, n4, 17);
        }
    }

    public final int a(char c) {
        return this.a.charWidth(c);
    }

    public final int b() {
        return this.a.getBaselinePosition();
    }

    public final void c(boolean bl) {
        this.a = Font.getFont((int)0, (int)1, (int)0);
    }

    public final void a(boolean bl) {
    }

    public final void c() {
    }

    public final void b(boolean bl) {
    }
}
