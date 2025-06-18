package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class hd
extends al
implements bf,
bn,
bq {
    private dt[] k;
    private ay l = new ay(0);
    private aw m;
    private boolean[] n;
    private ih o;

    public final void a(ih ih2) {
        this.o = ih2;
    }

    public hd() {
        super(1);
        dt dt2;
        this.l.a(this.a(), this.c(), this.i(), this.j() - 20);
        this.m = new aw();
        this.m.a(this);
        this.m.a(this);
        this.m.e(true);
        this.l.b(this.m);
        hd hd2 = this;
        int n = 0;
        dt dt3 = new dt("Đàm Đạo");
        Object[] objectArray = com.mg.sq.a.m.A().z();
        int n2 = 0;
        int n3 = 0;
        while (n3 < objectArray.length) {
            if (objectArray[n3].a().length() >= 3) {
                ++n2;
            }
            ++n3;
        }
        ds[] dsArray = new ds[n2];
        int n4 = objectArray.length - 1;
        while (n4 >= 0) {
            if (objectArray[n4].a().length() >= 3) {
                dsArray[--n2] = objectArray[n4];
            }
            --n4;
        }
        if (dsArray.length <= 0) {
            dt2 = null;
        } else {
            dt3.a(dsArray);
            dt2 = dt3 = dt3;
        }
        if (dt2 != null) {
            n = 1;
        }
        objectArray = com.mg.sq.a.m.B();
        n2 = 0;
        int n5 = 0;
        while (n5 < objectArray.length) {
            if (((dt)objectArray[n5]).a() == 0) {
                ++n2;
            }
            ++n5;
        }
        hd2.k = new dt[n2 + n];
        if (n > 0) {
            hd2.k[0] = dt3;
        }
        n5 = objectArray.length - 1;
        while (n5 >= 0) {
            if (((dt)objectArray[n5]).a() == 0) {
                hd2.k[--n2 + n] = objectArray[n5];
            }
            --n5;
        }
        this.n = new boolean[this.k.length];
        int n6 = 0;
        while (n6 < this.n.length) {
            this.n[n6] = true;
            ++n6;
        }
        this.t();
        this.a(new ba());
        gb gb2 = new gb(-1, 2);
        hd hd3 = this;
        hd3.a(gb2, true);
        gb2 = new gb(-2, 3);
        hd3 = this;
        hd3.b(gb2, true);
        this.a(this);
    }

    public final void e(boolean bl) {
        super.e(bl);
        if (bl) {
            this.l.c(true);
        }
    }

    public final void c(int n) {
        this.l.f(n);
    }

    public final void c(int n, int n2) {
        this.l.e(n, n2);
    }

    public final void a(int n, int n2) {
        this.l.c(n, n2);
    }

    public final void b(int n, int n2) {
        this.l.f(n, n2);
    }

    public final void c(Graphics graphics) {
        boolean bl = this.l.k();
        if (bl) {
            this.e(true);
            graphics.setColor(v.am);
            graphics.fillRect(this.a(), this.c(), this.i(), this.j() - 20);
            graphics.drawImage(pc.d, this.a() + this.i(), this.c() + this.j() - ba.a, 40);
        }
        this.l.a(graphics, this.a(), this.c());
    }

    protected final void g() {
        this.l.n();
    }

    public final aq a(aw object, int n) {
        if ((object = ((aw)object).i(n)) instanceof ds) {
            ds ds2 = (ds)object;
            return new eu(ds2, this.m.e());
        }
        int n2 = 0;
        while (n2 < this.k.length) {
            dt dt2 = this.k[n2];
            --n;
            if (this.n[n2]) {
                n -= dt2.c().length;
            }
            if (n < 0) {
                n = n2;
                break;
            }
            ++n2;
        }
        dt dt3 = (dt)object;
        return new ev(dt3, this.n[n], this.m.e());
    }

    public final void b(aq object, int n) {
        object = this.m.i(n);
        if (object instanceof ds) {
            this.d(0, -1);
            return;
        }
        int n2 = 0;
        while (n2 < this.k.length) {
            if (object.equals(this.k[n2]) && n2 <= this.n.length) {
                this.n[n2] = !this.n[n2];
                this.t();
                this.m.k(n);
                object = this;
                n = ((hd)object).l.r().b;
                n2 = ((hd)object).m.s();
                if (n2 * 22 - n >= ((hd)object).m.f() - 40 - 22) {
                    n = n2 * 22 - (((hd)object).m.f() - 40 - 22);
                }
                ((hd)object).l.k(n);
                return;
            }
            ++n2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void t() {
        Object object;
        int n = 0;
        int n2 = 0;
        while (n2 < this.k.length) {
            dt dt2 = this.k[n2];
            object = dt2.c();
            ++n;
            if (this.n[n2]) {
                n += ((ds[])object).length;
            }
            ++n2;
        }
        Object[] objectArray = new Object[n];
        n = 0;
        int n3 = 0;
        while (n3 < this.k.length) {
            object = this.k[n3];
            objectArray[n++] = object;
            if (this.n[n3]) {
                object = ((dt)object).c();
                int n4 = 0;
                while (n4 < ((Object)object).length) {
                    objectArray[n++] = object[n4];
                    ++n4;
                }
            }
            ++n3;
        }
        aw aw2 = this.m;
        synchronized (aw2) {
            this.m.q();
            this.m.a(objectArray);
            return;
        }
    }

    public final void a(aq aq2, int n) {
    }

    public final void a(aq object, int n, int n2) {
        object = this.m.i(n2);
        if (object instanceof ds) {
            gb gb2 = new gb(-1, 2);
            object = this;
            ((am)object).a(gb2, true);
            return;
        }
        this.n();
    }

    public final void d(int n, int n2) {
        ag.b().a(false);
        if (n2 == -1 && this.o != null) {
            ds ds2 = (ds)this.m.t();
            this.o.u(ds2.a());
        }
    }
}
