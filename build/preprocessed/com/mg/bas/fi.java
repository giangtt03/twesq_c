package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class fi
extends aq {
    private dk i;
    private String j;
    private String[] k;

    public fi(dk dk2) {
        this.i = dk2;
        this.j = String.valueOf(dk2.c()) + " (" + dk2.a() + ")";
        this.k = new String[0];
        this.e(22);
        this.d(v.t);
    }

    public final void d(boolean bl) {
        if (bl || this.g != bl) {
            this.c = true;
        }
        if (bl) {
            this.e(22 + this.k.length * bx.d.a() + 5);
        } else {
            this.e(22);
        }
        super.d(bl);
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.c) {
            return;
        }
        n2 += this.d();
        n += this.c() + 2;
        d d2 = bx.d;
        d2.c(true);
        if (this.g) {
            pc.e(graphics, n - 2, n2, this.e(), this.f());
            if (this.k != null) {
                bx.a(graphics, com.mg.sq.a.g, this.k, n + 25, n2 + 6 + d2.a(), this.e(), this.f(), 0);
            }
        }
        d2.a(graphics, this.j, n + 25, n2 + 4, 0);
        d2.c();
        if (this.i.a) {
            pc.d(graphics, -18, n + 3, n2 + 6, 0);
        } else {
            pc.d(graphics, -17, n + 3, n2 + 4, 0);
        }
        this.c = false;
    }
}
