package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// UI utility class for drawing menu corners, backgrounds, and providing menu item objects.
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class ap {
    private Image a = f.d("/_corner");
    private int b = v.am & 0xFFFFFF;
    private int c;

    public ap() {
        int n = this.b >> 16 & 0xFF;
        int n2 = this.b >> 8 & 0xFF;
        int n3 = this.b & 0xFF;
        this.c = (255 - n) / 6 + n << 16 | (255 - n2) / 6 + n2 << 8 | (255 - n3) / 6 + n3;
    }

    public az a(int n) {
        return new bd("Menu", -90000);
    }

    public az b(int n) {
        return new bd("Chọn", -90001);
    }

    public az c(int n) {
        return new bd("Trở về", -90002);
    }

    public final void a(Graphics graphics, int n, int n2, int n3, int n4) {
        graphics.setColor(v.aj);
        graphics.fillRect(n + 3, n2 + 3, n3 - 6, n4 - 6);
        graphics.setColor(v.al);
        graphics.drawRect(n + 2, n2 + 2, n3 - 5, n4 - 5);
        graphics.setColor(v.ak);
        graphics.drawRect(n + 1, n2 + 1, n3 - 3, n4 - 3);
        int n5 = this.a.getWidth();
        int n6 = this.a.getHeight();
        graphics.drawRegion(this.a, 0, 0, n5, n6, 0, n, n2, 20);
        graphics.drawRegion(this.a, 0, 0, n5, n6, 2, n + n3, n2, 24);
        graphics.drawRegion(this.a, 0, 0, n5, n6, 1, n, n2 + n4, 36);
        graphics.drawRegion(this.a, 0, 0, n5, n6, 3, n + n3, n2 + n4, 40);
    }

    public void b(Graphics graphics, int n, int n2, int n3, int n4) {
        graphics.setColor(0xFF0000);
        graphics.fillRect(n, n2, n3, n4);
    }

    public void c(Graphics graphics, int n, int n2, int n3, int n4) {
        graphics.setColor(this.c);
        graphics.drawRect(n, n2 + 1, n3 - 1, n4 - 1);
        graphics.setColor(this.b);
        graphics.fillRect(n + 1, n2 + 2, n3 - 2, n4 - 2);
    }

    public void d(Graphics graphics, int n, int n2, int n3, int n4) {
        graphics.setColor(this.c);
        graphics.drawRect(n, n2 + 1, n3 - 1, n4 - 1);
        graphics.setColor(this.b);
        graphics.fillRect(n + 1, n2 + 2, n3 - 2, n4 - 2);
    }
}
