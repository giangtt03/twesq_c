package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class fl
extends aq
implements bf {
    private int i = -23232323;
    private String j;
    private String k;
    private String l;
    private cu m;

    public fl(String string, String string2) {
        this.j = string;
        this.k = string2;
    }

    public final void a(int n, int n2, int n3, int n4) {
        super.a(n, n2, n3, n4);
        this.b(this.k);
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.c) {
            return;
        }
        cw.a(graphics);
        cw.a(graphics, this.c() + n, this.d() + n2 - 1, this.e(), bx.d.a());
        bx.d.c(true);
        bx.d.b(true);
        bx.d.a(graphics, this.j, this.c() + n, this.d() + n2, 0);
        bx.d.c();
        if (this.l != null) {
            com.mg.sq.a.g.a(graphics, this.l, this.c() + n + this.m.a, this.d() + n2 + this.m.b, 0);
        }
        cw.b(graphics);
        this.c(true);
    }

    public final boolean f(int n) {
        switch (n) {
            case 95: {
                he he2 = com.mg.sq.a.a("Câu trả lời tự động " + this.j, null, "Xong", 0, "Hủy", 1);
                ff ff2 = (ff)he2.e(1);
                ff2.c(this.k);
                ff2.h(100);
                he2.b(this.i);
                he2.a(this);
                ag.b().a(he2);
                return true;
            }
        }
        return false;
    }

    public final boolean c(int n, int n2) {
        if (n > this.c() && n < this.c() + this.e() && n2 > this.d() && n2 < this.d() + this.f()) {
            if (this.g) {
                this.f(95);
            } else {
                this.d(true);
            }
            return true;
        }
        return false;
    }

    public final void d(int n, int n2) {
        switch (n2) {
            case 0: {
                String string = com.mg.sq.a.k(this.i);
                if (string != null && string.length() > 0) {
                    this.a(string);
                }
                ag.b().a(this.i, false);
                return;
            }
            case 1: {
                ag.b().a(this.i, false);
            }
        }
    }

    public final String a() {
        return this.k;
    }

    public final void a(String string) {
        this.k = string;
        this.b(string);
    }

    private void b(String string) {
        if (string == null || this.d == null) {
            return;
        }
        this.m = new cu(this.d.a + bx.d.a(this.j) + 12, 0);
        int n = this.d.c - this.m.a - this.d.a;
        this.l = com.mg.sq.a.a(string, n);
    }
}
