package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class ev
extends aq {
    private boolean i = true;
    private dt j;
    private String k = "";

    public ev(dt object, boolean bl, int n) {
        int n2;
        StringBuffer stringBuffer;
        Object object2;
        this.d(n);
        dt dt2 = object;
        object = this;
        this.j = dt2;
        ds[] dsArray = dt2.c();
        if (gr.c && dsArray != null) {
            int n3 = 0;
            int n4 = 0;
            while (n4 < dsArray.length) {
                if (dsArray[n4].e() == 2) {
                    ++n3;
                }
                ++n4;
            }
            object2 = object;
            stringBuffer = new StringBuffer(String.valueOf(dt2.b())).append("(").append(n3).append("/");
            n2 = dsArray.length;
        } else {
            object2 = object;
            stringBuffer = new StringBuffer(String.valueOf(dt2.b())).append("(");
            n2 = dsArray == null ? 0 : dsArray.length;
        }
        ((ev)object2).k = stringBuffer.append(n2).append(")").toString();
        boolean bl2 = bl;
        object = this;
        this.i = bl2;
    }

    public final void d(boolean bl) {
        super.d(bl);
        if (bl) {
            this.e(40);
            return;
        }
        this.e(22);
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
        }
        d2.a(graphics, this.k, n + 25, n2 + 6, 0);
        d2.c();
        if (this.g) {
            d2 = bx.c;
            d2.a(graphics, this.j.b(), n + 25, n2 + 19, 0);
        }
        if (this.i) {
            pc.d(graphics, -18, n + 3, n2 + 9, 0);
        } else {
            pc.d(graphics, -17, n + 3, n2 + 9, 0);
        }
        this.c = false;
    }
}
