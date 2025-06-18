package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class gk
extends ey {
    private String i;
    private bh j = null;
    private byte k;
    private int[] l = new int[]{8076544, 12410368, 14052096, 16746248, 16746248, 12935680, 12935680, 10243584};
    private int[] m = new int[]{0x888888, 0xEEEEEE, 0xFFFFFF, 0xFFFFFF, 0xDBDBDB, 0xDBDBDB, 0xCADADAD, 0xCADADAD, 0x9C9C9C};
    private int[] n = new int[]{0x3D3D3D, 0x5E5E5E, 0x6B6B6B, 0x838383, 0x838383, 0x626262, 0x626262, 0x4E4E4E, 0x4E4E4E, 0x464646, 0x464646};

    public gk(String string) {
        this.i = string;
        this.d = new k(0, 0, this.d.c, 9 + bx.d.a());
    }

    public final void a(byte by) {
        this.k = 1;
    }

    public final void d(boolean bl) {
        super.d(bl);
        this.c = true;
    }

    public final void b(int n, int n2) {
        super.b(n, n2);
        this.d = new k(this.c(), this.d(), this.d.c, 9 + bx.d.a());
    }

    public final void a(int n, int n2, int n3, int n4) {
        this.d = new k(n, n2, n3, 9 + bx.d.a());
        this.i = com.mg.sq.a.a(this.i, this.d.c - 30);
    }

    public final void e(boolean bl) {
        super.e(bl);
        this.j.a(this, bl);
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.c) {
            return;
        }
        if (this.m()) {
            pc.a(graphics, this.c() + n, this.d() + n2, this.e(), this.f(), 7070703, -1);
            graphics.setColor(7267055);
            graphics.fillRect(this.c() + n, this.d() + n2, this.d.c, this.d.d);
        }
        int n3 = (n2 += this.d()) + 4;
        int n4 = (n += this.c()) + 4;
        bx.d.c(true);
        bx.d.a(graphics, this.i, n4, n3, 0);
        bx.d.c(false);
        n += this.e() - 30;
        n3 = this.f() - 6;
        n3 = (n2 += 3) + (n3 - bx.d.b()) / 2;
        k k2 = new k(0, 0, 30, this.f() - 6);
        k k3 = new k(0, 0, 32, this.f() - 4);
        switch (this.k) {
            case 0: {
                if (this.a()) {
                    pc.a(graphics, k3, 32, new int[]{0x2D2D2D}, n - 1, n2 - 1);
                    pc.a(graphics, k2, 30, this.l, n, n2);
                    bx.d.a(graphics, "O", n + 7, n3, 1);
                    k2 = new k(0, 0, 15, k2.d);
                    pc.a(graphics, k2, 15, this.n, n + 15, n2);
                    break;
                }
                pc.a(graphics, k3, 32, new int[]{0x2D2D2D}, n - 1, n2 - 1);
                pc.a(graphics, k2, 30, this.m, n, n2);
                bx.d.a(graphics, "I", n + 22, n3, 1);
                k2 = new k(0, 0, 15, k2.d);
                pc.a(graphics, k2, 15, this.n, n, n2);
                break;
            }
            default: {
                if (this.a()) {
                    com.mg.sq.a.g.a(graphics, "Mở", n + 7, n3, 1);
                    break;
                }
                com.mg.sq.a.g.a(graphics, "Tắt", n + 7, n3, 1);
            }
        }
        this.c = false;
    }

    public final void a(bh bh2) {
        this.j = bh2;
    }
}
