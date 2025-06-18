package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class mv {
    private Image a;
    private Image b;
    private boolean c;

    public mv(mt mt2, boolean bl) {
        this.c = bl;
        if (!this.c) {
            if (com.mg.sq.a.k == 0) {
                this.a = f.d("/play/bkboardv");
                return;
            }
            this.a = f.d("/play/bkboardh");
            return;
        }
        this.b = f.d("/play/ground");
    }

    public final void a(Graphics graphics, int n, int n2, int n3) {
        if (!this.c) {
            graphics.drawImage(this.a, n, n2, 0);
            return;
        }
        graphics.setColor(9828603);
        if (com.mg.sq.a.k == 0) {
            graphics.drawLine(n, n2, n + 240, n2);
            graphics.fillRect(n, n2, 5, 232);
            graphics.fillRect(n + 235, n2, 5, 232);
            graphics.fillRect(n, n2 + 232, mv.a(), mv.b());
        } else {
            graphics.drawLine(n, n2, n + 320, n2);
            graphics.fillRect(n, n2, 45, 232);
            graphics.fillRect(n + 275, n2, 45, 232);
        }
        n3 = 0;
        while (n3 <= mv.a() / this.b.getWidth()) {
            graphics.drawImage(this.b, n + this.b.getWidth() * n3, n2 + mv.b() - this.b.getHeight(), 0);
            ++n3;
        }
        if (com.mg.sq.a.k == 0) {
            ow.a(n, n2, graphics);
            return;
        }
        ow.b(n, n2, graphics);
    }

    public static int a() {
        if (com.mg.sq.a.k == 0) {
            return 240;
        }
        return 320;
    }

    public static int b() {
        if (com.mg.sq.a.k == 0) {
            return 320;
        }
        return 240;
    }

    public final void c() {
        this.a = null;
        this.b = null;
    }
}
