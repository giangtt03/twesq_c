package com.mg.bas;
// Utility for managing and drawing VIP icons in the UI.
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class pe {
    private static pe b;
    public ep[] a = null;

    private pe() {
    }

    public static pe a() {
        if (b == null) {
            b = new pe();
        }
        return b;
    }

    public static void a(pe pe2) {
        b = null;
    }

    public final void a(ep[] epArray) {
        g.a(epArray, new pf(this));
        this.a = epArray;
    }

    public final void a(Graphics graphics, int n2, int n3, int n4, int n5) {
        n2 = this.d(n2);
        try {
            if (this.a == null || n2 < 0) {
                pc.d(graphics, -20, n3, n4, 0);
                return;
            }
            graphics.drawImage(this.a[n2].a, n3, n4, 0);
            return;
        }
        catch (Exception exception) {
            ct.a("[VipIconUtil] Exception in drawVipIcon");
            exception.printStackTrace();
            pc.d(graphics, -20, n3, n4, 0);
            return;
        }
    }

    private int d(int n2) {
        if (this.a != null) {
            return g.a(this.a, 0, this.a.length - 1, new Integer(n2), new pg(this));
        }
        return -1;
    }

    public final int a(int n2) {
        if ((n2 = this.d(n2)) < 0 || this.a[n2] == null || n2 >= this.a.length) {
            return 16;
        }
        return this.a[n2].a.getWidth();
    }

    public final int b(int n2) {
        if ((n2 = this.d(n2)) < 0 || this.a[n2] == null || n2 >= this.a.length) {
            return 16;
        }
        return this.a[n2].a.getHeight();
    }

    public final String c(int n2) {
        if ((n2 = this.d(n2)) < 0 || this.a[n2] == null || n2 >= this.a.length || this.a[n2].b == null) {
            return "";
        }
        return this.a[n2].b;
    }
}
