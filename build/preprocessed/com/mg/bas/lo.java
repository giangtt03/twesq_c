package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class lo
extends n {
    public ee i;
    public int j;
    private int k;

    public lo(String string, int n2, int n3, int n4, int n5, int n6) {
        this.g = string;
        this.a = n2;
        this.f = n3;
        this.b = n4;
        this.c = n5;
        this.d = 16;
        this.e = 16;
        this.i = new ee();
        this.i.a(string.substring(2, string.length() - 1));
        this.j = this.i.f == 1 ? -10 : (this.i.f == 3 ? -8 : (this.i.f == 2 ? -9 : -7));
        if (this.i.g == '0') {
            this.k = -24;
            return;
        }
        if (this.i.g == '2') {
            this.k = -6;
            return;
        }
        if (this.i.g == '1') {
            this.k = -5;
            return;
        }
        this.k = 1000;
    }

    public final void a(Graphics graphics, int n2, int n3) {
        pc.d(graphics, this.j, n2 + this.d(), n3 + this.e(), 0);
        if (this.k <= 0) {
            pc.d(graphics, this.k, n2 + this.d() + this.f(), n3 + this.e() - 2, 24);
        }
    }

    public static String a(ee ee2) {
        short s = ee2.f;
        if (s == 1) {
            return "Xem Ảnh";
        }
        if (s == 3) {
            return "Nghe audio";
        }
        if (s == 2) {
            return "Xem video";
        }
        return null;
    }
}
