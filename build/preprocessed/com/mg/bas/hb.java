package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class hb
extends al
implements bf {
    private String k = null;
    private String[] l = null;
    private k m = null;
    private int n = 20;
    private d o = null;
    private int p = 10;
    private String[][] q = null;
    private int r = 0;
    private boolean s = true;

    public hb(ns ns2, String[] stringArray) {
        super(1);
        this.k = "Đã hoàn thành nhiệm vụ: " + ns2.b;
        this.a(this.k, stringArray);
    }

    private void a(String string, String[] stringArray) {
        int n;
        this.b(-241229);
        this.a(new ba());
        this.o = bx.d;
        this.c = this.p;
        this.f -= this.p << 1;
        int n2 = this.f - 20;
        this.l = bx.a(string, n2, this.o);
        int n3 = 0;
        if (stringArray != null) {
            this.q = new String[stringArray.length + 1][];
            this.q[0] = new String[]{"Bạn nhận được: "};
            n = 1;
            n3 = 0;
            while (n3 < stringArray.length) {
                this.q[n3 + 1] = bx.a(stringArray[n3], n2 - 4, this.o);
                n += this.q[n3 + 1].length;
                ++n3;
            }
            n3 = n * (this.o.a() + 5);
        }
        this.r = n = this.l.length * this.o.a();
        this.m = new k(10, 30, n2, n += n3 + 10);
        this.g = n + 65;
        this.d = v.u - this.g >> 1;
    }

    public final void c(Graphics graphics) {
        pc.a(graphics, this.c, this.d, this.f, this.g - this.n, v.aj, this.s);
        com.mg.sq.a.h.a(graphics, "Chúc mừng", this.c + (this.f >> 1), this.d + 10, 1);
        pc.a(graphics, this.m.a + this.c, this.m.b + this.d, this.m.c);
        bx.a(graphics, this.o, this.l, this.m.a + 5 + this.c, this.m.b + 5 + this.d, this.m.c - 10, this.m.d, 0);
        if (this.q != null) {
            int n = 5;
            int n2 = this.m.a + 5 + this.c;
            int n3 = this.m.b + this.r + this.d;
            int n4 = 0;
            while (n4 < this.q.length) {
                if (n4 > 0) {
                    pc.a(graphics, n2, n3 + n + this.o.a() / 2);
                }
                bx.a(graphics, this.o, this.q[n4], n2 + 10, n3 + n, this.m.c - 10, this.m.d, 0);
                n += this.q[n4].length * this.o.a() + 5;
                ++n4;
            }
        }
    }

    public final void d(int n, int n2) {
        if (n2 == 0) {
            ag.b().a(true);
        }
    }
}
