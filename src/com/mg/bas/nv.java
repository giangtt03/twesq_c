package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.smsgame.MGMIDlet;
import com.mg.sq.a;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Graphics;

public final class nv
extends an
implements bf {
    private String[] a;
    private ex b;

    public nv() {
        super(6);
        this.a(new ba());
        this.a(com.mg.sq.a.n);
        this.a = bx.a("\nBạn có chấp nhận các quy định của Ola tại http://term.ola.vn không?", com.mg.bas.v.t - 4, bx.d);
        int n = 15 + bx.d.a() * (this.a.length + 1) + 4 + 10;
        this.b = new ex("Đồng ý", 3);
        this.b.a((com.mg.bas.v.t - 80) / 2, n, 80, 20);
        this.b.d(true);
        bs bs2 = new bs(new br[]{new br("Đồng ý", 0), new br("Quy định", 1), new br("Thoát", 2)});
        bs2.a(this);
        this.a(bs2);
    }

    protected final void a(int n) {
        if (n == 95) {
            this.d(this.e, 0);
        }
    }

    protected final void e(int n, int n2) {
        if (this.b.h().b(n, n2)) {
            this.d(this.e, 0);
        }
    }

    protected final void c() {
    }

    protected final void a(Graphics graphics) {
        graphics.setColor(com.mg.bas.v.am);
        graphics.fillRect(0, 0, com.mg.bas.v.t, com.mg.bas.v.u - ba.a);
        graphics.drawImage(pc.d, com.mg.bas.v.t, com.mg.bas.v.u - ba.a, 40);
        bx.d.c(true);
        bx.d.a(graphics, "Quy định", com.mg.bas.v.t / 2, 15, 1);
        bx.d.c();
        int n = 15 + (bx.d.a() + 4);
        int n2 = 0;
        while (n2 < this.a.length) {
            bx.d.a(graphics, this.a[n2], com.mg.bas.v.t / 2, n, 1);
            n += bx.d.a();
            ++n2;
        }
        this.b.a(graphics, 0, 0);
    }

    public final void d(int n, int n2) {
        switch (n2) {
            case 0: {
                pd.z();
                ag.b().f(5);
                break;
            }
            case 2: {
                MGMIDlet mGMIDlet = MGMIDlet.d();
                mGMIDlet.notifyDestroyed();
                break;
            }
            case 1: {
                try {
                    MGMIDlet.d().platformRequest("http://term.ola.vn");
                    break;
                }
                catch (ConnectionNotFoundException connectionNotFoundException) {
                    ConnectionNotFoundException connectionNotFoundException2 = connectionNotFoundException;
                    connectionNotFoundException.printStackTrace();
                }
            }
        }
        this.c(false);
    }
}
