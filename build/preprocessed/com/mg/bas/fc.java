package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fc
extends aq {
    private a j;
    private a k;
    private int l;
    private int m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private Image s;
    private int t;
    private int u;
//    private int v;
    private int[] w;
    private Image x;
    private Image y;
    private Image z = null;
    private int A;
    private int B;
    private int C;
    private int D = -1;
    private int E = 0;
    private int F;
    public String i;
    private bf G;
    private Image H = com.mg.bas.f.d("/corner/4");
    private Image I = com.mg.bas.f.d("/corner/5");
    private int vIndex;

    public fc() {
        this.j = new a();
        this.k = new a();
        this.w = new int[0];
        this.x = pc.c;
        this.y = com.mg.bas.f.d("/questnotifyicon");
        this.a(0, v.u, v.t, 69);
        this.t = this.d();
        this.s = com.mg.bas.f.d("/focustab");
        this.u = this.s.getWidth();
        this.k(0);
    }

    public fc(int n, int n2, int n3) {
        this();
        this.A = 1;
        this.B = 2;
        this.C = 3;
    }

    /*
     * Unable to fully structure code
     */
private void j(int var1_1) {
    if (this.j.d() <= 0) {
        return;
    }
    if (this.l < this.j.d()) {
        this.vIndex = this.q().i;
    }
    this.l = var1_1;
    int var2_4 = var1_1;
    if (var2_4 >= 0) {
        this.w[var2_4] = 0;
        this.D = -1;
        for (int i = 0; i < this.w.length; i++) {
            switch (this.w[i]) {
                case 105:
                    this.D = this.A;
                    break;
                case 107:
                    this.D = this.C;
                    break;
            }
        }
    }
    this.k(this.l);
    try {
        this.q().x();
    } catch (OutOfMemoryError e) {
        int var1_3 = 0;
        while (var1_3 < this.j.d()) {
            fb var2_5 = (fb) this.j.b(var1_3);
            var2_5.y();
            ++var1_3;
        }
        try {
            this.q().x();
        } catch (OutOfMemoryError v1) {
            com.mg.sq.a.r();
            this.q().x();
        }
    }
    ag.a().e();
}

    public final void a(fb fb2) {
        if (fb2 == null) {
            return;
        }
        int n = 0;
        while (n < this.j.d()) {
            fb fb3 = (fb)this.j.b(n);
            if (fb2.i == fb3.i) {
                this.j(n);
                return;
            }
            ++n;
        }
    }

    private void k(int n) {
        if (this.j.d() <= 0) {
            return;
        }
        int n2 = this.j.d() * this.u;
        if (n2 > this.e()) {
            if (n < this.m) {
                if (this.q + n * this.u < 2) {
                    this.q = 2 - n * this.u;
                }
                if (n > 0 && this.q + n * this.u - this.u < 2) {
                    n2 = 2 - n * this.u + this.u;
                    this.q = n2 + n * this.u + this.u + this.u > this.c() + this.e() - 2 ? n2 - (n2 + this.u + this.u - this.e() - 2) : n2;
                }
            } else {
                if (this.q + n * this.u + this.u > this.e() - 2) {
                    this.q = this.e() - 2 - n * this.u - this.u;
                }
                if (n < this.j.d() - 1 && this.q + n * this.u + this.u + this.u > this.e() - 2) {
                    n2 = this.e() - 2 - n * this.u - this.u - this.u;
                    this.q = n2 + n * this.u < 2 ? 2 - n * this.u : n2;
                }
            }
        }
        this.m = n;
    }

    public final void a() {
        if (this.G != null) {
            fc fc2 = this;
            int n = fc2.D;
            this.G.d(-1, n);
            if (n == this.A || n == this.B) {
                return;
            }
        }
        this.c(v.u);
        this.t = this.d() - this.f();
        this.p = 0;
        this.n = true;
        fc fc3 = this;
        int n = fc3.u * fc3.j.d();
        if (n <= fc3.e()) {
            fc3.q = (fc3.e() - n) / 2;
            return;
        }
        fc3.q = (fc3.e() - fc3.u) / 2 - fc3.l * fc3.u;
        if (fc3.q > 2) {
            fc3.q = 2;
            return;
        }
        if (fc3.q + fc3.j.d() * fc3.u < fc3.e()) {
            fc3.q = -fc3.j.d() * fc3.u + fc3.e() - 2;
        }
    }

    private void t() {
        this.t = v.u;
        this.n = false;
        this.o = 0;
        if (this.m != this.l) {
            this.j(this.m);
        }
        v.c();
    }

    private int l(int n) {
        int n2 = 0;
        while (n2 < this.j.d()) {
            fb fb2 = (fb)this.j.b(n2);
            if (fb2.i == n) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    public final boolean b(fb fb2) {
        return this.j.c(fb2) >= 0;
    }

    public final fb q() {
        if (this.j.d() <= 0) {
            return null;
        }
        return (fb)this.j.b(this.l);
    }

    public final fb h(int n) {
        n = this.l(100);
        if (n >= 0) {
            return (fb)this.j.b(n);
        }
        return null;
    }

    public final void c(fb fb2) {
        if (fb2 == null || this.b(fb2)) {
            return;
        }
        if (fb2.o) {
            this.k.a(fb2);
        }
        if (fb2.i == 107 && this.z == null) {
            this.z = com.mg.bas.f.d("/notificationnewsicon");
        }
        int[] nArray = new int[this.j.d() + 1];
        fb fb3 = this.q();
        int n = 0;
        while (n < this.j.d()) {
            fb fb4 = (fb)this.j.b(n);
            if (fb2.i == fb4.i) {
                throw new ArrayIndexOutOfBoundsException("Đã tồn tại 1 gametab có id trùng với id của gametab mà bạn muốn thêm vào");
            }
            if (fb2.i < fb4.i) {
                System.arraycopy(this.w, 0, nArray, 0, n);
                System.arraycopy(this.w, n, nArray, n + 1, this.w.length - n);
                this.w = nArray;
                this.j.b(fb2, n);
                fb2.u();
                fb2.a(this);
                if (fb3 != null && this.q() != null && fb3.i != this.q().i || this.q() == null) {
                    this.a(fb3);
                }
                return;
            }
            ++n;
        }
        System.arraycopy(this.w, 0, nArray, 0, this.w.length);
        this.w = nArray;
        this.j.a(fb2);
        fb2.u();
        fb2.a(this);
        if (fb3 != null && (this.q() == null || this.q() != null && fb3.i != this.q().i)) {
            this.a(fb3);
        }
    }

    public final boolean i(int n) {
        n = 0;
        while (n < this.j.d()) {
            fb fb2 = (fb)this.j.b(n);
            if (100 == fb2.i) {
                return true;
            }
            ++n;
        }
        return false;
    }

    public final void d(fb fb2) {
        int n = this.j.c(fb2);
        this.f(fb2);
        if (fb2.i == 107) {
            this.z = null;
        }
        if (n >= 0) {
            int[] nArray = new int[this.w.length - 1];
            System.arraycopy(this.w, 0, nArray, 0, n);
            System.arraycopy(this.w, n + 1, nArray, n, nArray.length - n);
            this.w = nArray;
            Object object = this.j.a(n);
            if (object != null) {
                fb2.a((aq)null);
            }
            if (this.j.d() <= 0) {
                this.m = 0;
                this.l = 0;
                this.t();
                return;
            }
            int n2 = this.l(this.vIndex);
            if (n2 >= 0) {
                this.j(n2);
                return;
            }
            if (this.l >= this.j.d()) {
                this.l = this.j.d() - 1;
            }
            this.j(this.l);
        }
    }

    public final void r() {
        int n = 0;
        while (n < this.j.d()) {
            if (this.j.b(n) != null) {
                fb fb2 = (fb)this.j.b(n);
                fb2.a((aq)null);
            }
            ++n;
        }
        this.j.a();
        this.m = 0;
        this.l = 0;
        this.w = new int[0];
        this.t();
    }

    public final boolean f(int n) {
        if (this.n) {
            int n2 = this.m;
            switch (n) {
                case 97: {
                    if (--n2 >= 0) break;
                    n2 = this.j.d() - 1;
                    break;
                }
                case 96: {
                    if (++n2 < this.j.d()) break;
                    n2 = 0;
                    break;
                }
                case 95: {
                    this.t();
                    return true;
                }
                default: {
                    this.t();
                    if (n != 94 && n != 93) {
                        fb fb2 = this.q();
                        fb2.h(n);
                    }
                    return true;
                }
            }
            if (n2 != this.m) {
                this.k(n2);
                this.o = 7;
                this.p = 0;
                return true;
            }
        }
        if (!this.n) {
            fb fb3;
            if (this.j.d() > 0 && (fb3 = this.q()).h(n)) {
                return true;
            }
            switch (n) {
                case 96: 
                case 97: {
                    this.a();
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean g(int n) {
        fb fb2;
        return this.j.d() > 0 && (fb2 = this.q()).i(n);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean c(int n, int n2) {
        block5: {
            if (!this.n) {
                if (this.j.d() <= 0) return false;
                fb fb2 = this.q();
                if (!fb2.g(n, n2)) return false;
                return true;
            }
            if (n >= this.c() && n <= this.c() + this.e() && n2 >= this.d() && n2 <= this.d() + this.f()) {
                this.p = 0;
                int n3 = this.d() + 8 + bx.c.a();
                if (n2 < n3) return true;
                if (n2 > n3 + this.f()) return true;
                n2 = this.r;
                n3 = 0;
                while (n3 < this.j.d()) {
                    if (n >= n2 && n <= n2 + this.u) {
                        if (this.m != n3) {
                            this.k(n3);
                            this.o = 7;
                            this.p = 0;
                            return true;
                        }
                        break block5;
                    }
                    n2 += this.u;
                    ++n3;
                }
                return true;
            }
        }
        this.t();
        return true;
    }

    public final boolean f(int n, int n2) {
        fb fb2;
        if (this.n) {
            return true;
        }
        return this.j.d() > 0 && (fb2 = this.q()).h(n, n2);
    }

    public final boolean e(int n, int n2) {
        if (this.n) {
            int n3 = this.u * this.j.d();
            if (n3 > this.e()) {
                this.p = 0;
                this.q += n;
                if (this.q >= 0) {
                    this.q = 0;
                } else if (this.q + n3 < this.e()) {
                    this.q = this.e() - n3;
                }
            }
            return true;
        }
        if (this.j.d() > 0) {
            fb fb2 = this.q();
            int n4 = n2;
            n2 = n;
            fb fb3 = fb2;
            if (fb2.l != null && fb3.l.e(n2, n4) ? true : fb3.e(n2, n4)) {
                return true;
            }
        }
        return false;
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.j()) {
            return;
        }
        if (this.j.d() > 0) {
            fb fb2 = this.q();
            fb2.b(graphics, n, n2);
        }
        if (this.n || this.t != this.d()) {
            int n3 = this.f();
            int n4 = this.e();
            int n5 = this.d();
            int n6 = this.c();
            Graphics g = graphics;
            fc fc2 = this;
            int n7 = n6 + fc2.H.getWidth() - 1;
            int n8 = n5 + 2;
            int n9 = n4 - fc2.H.getWidth() - fc2.H.getWidth() + 2;
            g.setColor(16764571);
            g.fillRect(n7, n8 + 2, n9, 15);
            g.setColor(13077582);
            g.drawLine(n7, n8, n7 + n9, n8);
            g.drawLine(n7, n8 + 17, n7 + n9, n8 + 17);
            g.setColor(7225619);
            g.drawLine(n7, n8 + 1, n7 + n9, n8 + 1);
            n7 = n6 + 1;
            n8 = n5 + 20;
            n9 = n4 - 2;
            int n10 = n3 - fc2.H.getHeight() + 2 - 1;
            g.setColor(7225619);
            g.drawRect(n7, n8, n9 - 1, n10 - 1);
            g.setColor(13077582);
            g.drawRect(n7 + 1, n8 + 1, n9 - 3, n10 - 3);
            g.setColor(14854509);
            g.drawRect(n7 + 2, n8 + 2, n9 - 5, n10 - 5);
            g.setColor(16764571);
            g.fillRect(n7 + 1, n8 + 3, n9 - 4, n10 - 6);
            g.drawImage(fc2.H, n6, n5, 0);
            g.drawRegion(fc2.H, 0, 0, fc2.H.getWidth(), fc2.H.getHeight(), 2, n6 + n4, n5, 24);
            g.setColor(13077582);
            g.drawLine(n6, n5 + 10, n6, n5 + n3);
            g.setColor(0x333333);
            g.drawLine(n6 + n4 - 1, n5 + 10, n6 + n4 - 1, n5 + n3);
            g.drawLine(n6, n5 + n3 - 1, n6 + n4 - 1, n5 + n3 - 1);
            g.drawImage(fc2.I, n6 + 2, n5 + fc2.H.getHeight() - 1, 0);
            g.drawRegion(fc2.I, 0, 0, fc2.I.getWidth(), fc2.I.getHeight(), 2, n6 + n4 - 2, n5 + fc2.H.getHeight() - 1, 24);
            g.drawRegion(fc2.I, 0, 0, fc2.I.getWidth(), fc2.I.getHeight(), 1, n6 + 2, n5 + n3 - 2, 36);
            g.drawRegion(fc2.I, 0, 0, fc2.I.getWidth(), fc2.I.getHeight(), 3, n6 + n4 - 2, n5 + n3 - 2, 40);
            n6 = this.r;
            int n11 = this.d() + 4;
            if (this.j.d() <= 0) {
                return;
            }
            fb selectedFb = (fb)this.j.b(this.m);
            if (selectedFb.j != null) {
                bx.e.a(graphics, selectedFb.j, this.e() / 2, n11 + 1, 1);
            }
            n11 += bx.e.a() + 6;
            cw.a(graphics);
            cw.a(graphics, this.c() + 3, this.d(), this.e() - 6, this.f());
            int n12 = this.s.getWidth();
            n5 = this.s.getHeight();
            n4 = 0;
            while (n4 < this.j.d()) {
                fb fb3 = (fb)this.j.b(n4);
                if (n4 == this.m) {
                    graphics.drawRegion(this.s, 0, 0, n12, n5, 0, n6, n11, 0);
                }
                pc.b(graphics, n6 + this.u / 2, n11 + n5 / 2, fb3.n, 3);
                if (this.w[n4] > 0) {
                    graphics.drawImage(this.x, n6 + this.u - 10, n11, 0);
                }
                n6 += this.u;
                ++n4;
            }
            cw.b(graphics);
            return;
        }
        if (this.E < 16) {
            if (this.D == this.A) {
                int n13 = this.d() - 36;
                n2 = this.c() + this.e() - 16;
                Graphics graphics2 = graphics;
                pc.d(graphics2, -21, n2, n13, 0);
                pc.d(graphics2, -23, n2 - 3, n13 - 3, 0);
                return;
            }
            if (this.D == this.B) {
                graphics.drawImage(this.y, this.c() + this.e() - 16, this.d() - 36, 0);
                return;
            }
            if (this.D == this.C && this.z != null) {
                graphics.drawImage(this.z, this.c() + this.e() - 16, this.d() - 36, 0);
            }
        }
    }

    public final void n() {
        int n;
        if (!this.j()) {
            return;
        }
        if (this.D >= this.A) {
            this.E = this.E >= 20 ? 1 : ++this.E;
            if (this.D == this.B) {
                if (this.F < 500) {
                    ++this.F;
                } else {
                    this.s();
                }
            }
        }
        if (this.n) {
            if (this.p < 50) {
                ++this.p;
            } else {
                this.t();
            }
        }
        if (this.o > 0) {
            --this.o;
            if (this.o == 0 && this.l != this.m) {
                this.j(this.m);
            }
        }
        if (this.t != this.d()) {
            int n2;
            int n3 = this.d();
            n = n3 > this.t ? 1 : 0;
            n3 = n != 0 ? (n3 -= 20) : (n3 += 20);
            int n4 = n2 = n3 > this.t ? 1 : 0;
            if (n != n2) {
                n3 = this.t;
            }
            this.c(n3);
            fb fb2 = this.q();
            if (fb2 != null) {
                fb2.c(true);
            }
        }
        if (this.q != this.r) {
            int n5 = this.q - this.r;
            if (Math.abs(n5) > 3) {
                n5 /= 3;
            }
            this.r += n5;
        }
        if (!this.n && this.j.d() > 0) {
            fb fb3 = this.q();
            fb3.q();
        }
        n = 0;
        while (n < this.k.d()) {
            fb fb4 = (fb)this.k.b(n);
            if (!fb4.equals(this.q())) {
                fb4.q();
            }
            ++n;
        }
    }

    public final void a(String string) {
        this.D = this.B;
        this.F = 1;
        this.i = string;
    }

    public final void s() {
        this.E = 0;
        this.D = -1;
        int n = 0;
        while (n < this.w.length) {
            switch (this.w[n]) {
                case 105: {
                    this.D = this.A;
                    break;
                }
                case 107: {
                    this.D = this.C;
                }
            }
            ++n;
        }
    }

    public final void e(fb fb2) {
        int n = this.j.c(fb2);
        if (n < 0) {
            return;
        }
        if (n != this.l) {
            this.w[n] = fb2.i;
            if (this.D == this.B) {
                return;
            }
            if (fb2.i == 105) {
                this.D = this.A;
                return;
            }
            if (fb2.i == 107) {
                this.D = this.C;
            }
        }
    }

    public final void f(fb fb2) {
        if (fb2 == null) {
            return;
        }
        int n = 0;
        while (n < this.w.length) {
            if (fb2.i == this.w[n]) {
                this.w[n] = -1;
            }
            switch (this.w[n]) {
                case 1: {
                    this.D = this.A;
                    break;
                }
                case 3: {
                    this.D = this.C;
                }
            }
            ++n;
        }
    }

    public final void a(bf bf2) {
        this.G = bf2;
    }
}
