package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;

public final class os
extends aq
implements bf,
bg,
bq {
    private oa m;
    private k n;
    private k o;
    private ay p;
    private int q;
    private boolean r = false;
    private doo s;
    lh i;
    private dd t;
    private byte u = (byte)-1;
    public String j;
    fk k = new fk();
    private int v = 0;
    private String w;
    private ol x;
    private iff y = new iff(new int[]{5939728, 0xFFFF00});
    public static lr[] l;
    private String z;
    private long A;
    private int B;

    public os(int n, oa oa2, ol ol2) {
        this.m = oa2;
        this.x = ol2;
        this.a_(3);
        this.a(0, 0, v.t, v.u);
        this.a((byte)0);
        this.x.a(new gb(105, 0));
        this.x.b(new gb(109, 1));
        this.x.c(com.mg.sq.a.n);
        this.x.a(new ba());
        this.x.a(this);
    }

    private void a(byte by) {
        this.u = by;
        os os2 = this;
        switch (os2.u) {
            case 1: {
                os2.n = new k(0, 73, v.t, 1);
                os2.o = new k(0, os2.n.b + 4, os2.e(), os2.f() - (os2.n.b + 4) - ba.a);
                break;
            }
            default: {
                os2.n = new k(0, 5, v.t, 1);
                os2.o = new k(0, os2.n.b + 5, os2.e(), os2.f() - (os2.n.b + 4) - ba.a);
            }
        }
        this.k = new fk();
        this.k.i = true;
        this.k.a(this);
        this.k.a_(this.o.a, this.o.b);
        this.p = new ay(0);
        this.p.a(this.o);
        this.p.b(this.k);
        this.p.h(1);
        switch (by) {
            case 1: {
                this.v = 0;
                boolean bl = go.k.aa;
                if (bl) {
                    go.k.e = (byte)2;
                } else if (go.k.e == 2) {
                    go.k.e = 0;
                }
                doo doo2 = new doo();
                new doo().a = go.k.b;
                doo2.d = go.k.ab;
                doo2.b = go.k.G;
                doo2.c = go.k.e;
                doo2.f = go.k.X;
                doo2.e = go.k.P;
                this.a(this.j, new doo[]{doo2});
                ks.a().d();
                break;
            }
            case 0: {
                this.j = null;
                if (l == null) break;
                this.a(l);
            }
        }
        this.x.c(true);
    }

    public final void c(boolean bl) {
        this.p.c(true);
    }

    public final void a(Graphics object, int n, int n2) {
        if (this.p != null && this.p.k()) {
            Graphics graphics = object;
            object = this;
            graphics.setColor(v.am);
            graphics.fillRect(0, 0, ((aq)object).e(), ((aq)object).f());
            graphics.drawImage(pc.d, ((aq)object).c() + ((aq)object).e(), ((aq)object).d() + ((aq)object).f() - ba.a, 40);
            switch (((os)object).u) {
                case 1: {
                    if (((os)object).t != null) {
                        ((os)object).t.a(graphics, 0, 0);
                    }
                    pc.a(graphics, ((os)object).n.a, ((os)object).n.b, ((os)object).n.c);
                    if (((os)object).z == null) break;
                    long l = ((os)object).A - System.currentTimeMillis() > 0L ? ((os)object).A - System.currentTimeMillis() : 0L;
                    n2 = v.t - bx.c.a(((os)object).z) - bx.c.a(i.b(l, "hh:mm:ss")) - 5;
                    com.mg.sq.a.h.a(graphics, String.valueOf(((os)object).z) + " " + i.b(l, "hh:mm:ss"), n2, v.u - 35, 0);
                }
            }
            if (((os)object).p != null) {
                cw.a(graphics);
                cw.b(graphics, ((os)object).p.h());
                ((os)object).p.a(graphics, ((aq)object).c(), ((aq)object).d());
                cw.b(graphics);
            }
        }
    }

    public final void n() {
        if (this.t != null) {
            this.t.i();
        }
        if (this.p != null) {
            this.p.n();
        }
        if (this.q > 0) {
            --this.q;
            if (this.q == 1) {
                ks.a().a(this.w, 91, (byte)101);
            }
        }
    }

    public final void a() {
        this.x.c(true);
    }

    public final boolean f(int n) {
        if (n == 97 || n == 96) {
            return false;
        }
        boolean bl = this.p.f(n);
        n = bl ? 1 : 0;
        return bl;
    }

    public final boolean e(int n, int n2) {
        return this.p.e(n, n2);
    }

    public final boolean c(int n, int n2) {
        return this.p.c(n, n2);
    }

    public final boolean f(int n, int n2) {
        return this.p.f(n, n2);
    }

    public final synchronized void a(String string, doo[] dooArray) {
        int n;
        if (string == null || !this.x.t) {
            return;
        }
        com.mg.sq.a.s().v();
        if (this.u != 1) {
            this.a((byte)1);
        }
        try {
            if (this.a(string)) {
                int n2 = 0;
                while (n2 < dooArray.length) {
                    if (dooArray[n2] != null) {
                        this.a(dooArray[n2]);
                    }
                    ++n2;
                }
            }
        }
        catch (OutOfMemoryError outOfMemoryError) {
            com.mg.sq.a.m.G();
        }
        if ((n = this.b(go.k.b)) >= 0) {
            this.k.i(n);
        } else {
            this.k.i(0);
        }
        this.t();
    }

    private void a(doo object) {
        try {
            int n;
            ew ew2;
            block10: {
                ew2 = ((doo)object).a.length() < 6 ? new ew((doo)object, this.e(), this.y) : new ew((doo)object, this.e());
                ew2.a_(this.v++);
                String string = ((doo)object).a;
                object = this;
                if (((os)object).k.r() == 0) {
                    n = -1;
                } else {
                    int n2 = 0;
                    int n3 = ((os)object).k.r();
                    int n4 = n3 + 0 >> 1;
                    while (true) {
                        doo doo2 = ((ew)((os)object).k.j((int)n4)).i;
                        if (string.compareTo(doo2.a) > 0) {
                            n2 = n4;
                            n4 = n2 + n3 >> 1;
                        } else {
                            if (string.compareTo(doo2.a) >= 0) {
                                n = n4;
                                break block10;
                            }
                            n3 = n4;
                            n4 = n2 + n3 >> 1;
                        }
                        if (n2 != n4) continue;
                        doo2 = ((ew)((os)object).k.j((int)n4)).i;
                        if (string.compareTo(doo2.a) > 0) {
                            n = n3 == ((os)object).k.r() ? -1 : n3;
                            break block10;
                        }
                        if (string.compareTo(doo2.a) < 0) break;
                    }
                    n = n2;
                }
            }
            int n5 = n;
            if (n == -1) {
                this.k.b(ew2);
                return;
            }
            this.k.a(ew2, n5);
            return;
        }
        catch (OutOfMemoryError outOfMemoryError) {
            com.mg.sq.a.m.G();
            ct.a("[RoomTab] khong du bo nho them ng choi vao room");
            return;
        }
    }

    private boolean a(String string) {
        return string.equals(this.j);
    }

    public final void a(lh lh2) {
        this.i = lh2;
        this.t = new dd(this.i);
        this.c(true);
    }

    public final void b(aq aq2, int n) {
        block28: {
            block27: {
                block29: {
                    aq aq3;
                    Object object;
                    block31: {
                        block30: {
                            if (!(aq2 instanceof ew)) break block27;
                            if (this.k.r() <= 1) break block28;
                            aq2 = (ew)aq2;
                            object = ((ew)aq2).i;
                            aq2 = this;
                            if (((doo)object).a.equals(go.k.b)) break block29;
                            ((os)aq2).s = object;
                            object = new bs();
                            if (com.mg.sq.a.m == null || !com.mg.sq.a.o) break block30;
                            aq3 = (fc)((os)aq2).x.l();
                            switch (((os)aq2).s.c) {
                                case 2: {
                                    if (((fc)aq3).b(com.mg.sq.a.m)) {
                                        if ((((os)aq2).B & 2) != 0) {
                                            ((bs)object).a(new br("Giao dịch", 10100));
                                        }
                                        ((bs)object).a(new br[]{new br("Chat!", 10101), new br("Xem ME", 10102)});
                                        break;
                                    }
                                    ((bs)object).a(new br[]{new br("Giao dịch", 10100)});
                                    break;
                                }
                                case 3: {
                                    if (((fc)aq3).b(com.mg.sq.a.m)) {
                                        ((bs)object).a(new br[]{new br("Chat!", 10101), new br("Xem ME", 10102)});
                                        break;
                                    }
                                    break block28;
                                }
                                case 1: {
                                    if (((fc)aq3).b(com.mg.sq.a.m)) {
                                        if ((((os)aq2).B & 4) != 0) {
                                            ((bs)object).a(new br("Xem Trận đánh", 10103));
                                        }
                                        ((bs)object).a(new br[]{new br("Chat!", 10101), new br("Xem ME", 10102)});
                                        break;
                                    }
                                    ((bs)object).a(new br[]{new br("Xem Trận đánh", 10103)});
                                    break;
                                }
                                default: {
                                    if (((fc)aq3).b(com.mg.sq.a.m)) {
                                        if (((os)aq2).s.f > 0L) {
                                            ((bs)object).a(new br[]{new br("Đánh!", 10104), new br("Giao dịch", 10100), new br("Chat!", 10101), new br("Xem ME", 10102)});
                                            break;
                                        }
                                        if ((((os)aq2).B & 1) != 0) {
                                            ((bs)object).a(new br("Khiêu Chiến", 10105));
                                        }
                                        if ((((os)aq2).B & 2) != 0) {
                                            ((bs)object).a(new br("Giao dịch", 10100));
                                        }
                                        ((bs)object).a(new br[]{new br("Chat!", 10101), new br("Xem ME", 10102)});
                                        break;
                                    }
                                    if (((os)aq2).s.f > 0L) {
                                        ((bs)object).a(new br[]{new br("Đánh!", 10104), new br("Giao dịch", 10100)});
                                        break;
                                    }
                                    if ((((os)aq2).B & 1) != 0) {
                                        ((bs)object).a(new br("Khiêu Chiến", 10105));
                                    }
                                    if ((((os)aq2).B & 2) != 0) {
                                        ((bs)object).a(new br("Giao dịch", 10100));
                                        break;
                                    }
                                    break block31;
                                }
                            }
                            break block31;
                        }
                        switch (((os)aq2).s.c) {
                            case 2: {
                                if ((((os)aq2).B & 2) == 0) break;
                                ((bs)object).a(new br("Giao dịch", 10100));
                                break;
                            }
                            case 3: {
                                break block28;
                            }
                            case 1: {
                                if ((((os)aq2).B & 4) == 0) break;
                                ((bs)object).a(new br("Xem Trận đánh", 10103));
                                break;
                            }
                            default: {
                                if (((os)aq2).s.f > 0L) {
                                    ((bs)object).a(new br[]{new br("Đánh!", 10104), new br("Giao dịch", 10100)});
                                    break;
                                }
                                if ((((os)aq2).B & 1) != 0) {
                                    ((bs)object).a(new br("Khiêu Chiến", 10105));
                                }
                                if ((((os)aq2).B & 2) == 0) break;
                                ((bs)object).a(new br("Giao dịch", 10100));
                            }
                        }
                    }
                    aq3 = ((os)aq2).k.u();
                    k k2 = ((os)aq2).p.r();
                    int n2 = (v.t - ((aq)object).e()) / 2;
                    int n3 = ((os)aq2).p.d() + aq3.d() - k2.b;
                    if (n3 + ((aq)object).f() > v.u - ba.a) {
                        n3 = v.u - ba.a - ((aq)object).f();
                    }
                    ((bs)object).a_(v.t + ((aq)object).e(), n3);
                    ((bs)object).d(n2, n3);
                    ((bs)object).a((bg)((Object)aq2));
                    ((bs)object).a(new gb(113, 2));
                    ((bs)object).b(new gb(106, 3));
                    ((bs)object).c(com.mg.sq.a.n);
                    ((aq)object).a_(1);
                    ((os)aq2).x.a((bs)object);
                }
                return;
            }
            if (aq2 instanceof fz) {
                aq2 = (fz)aq2;
                if (!((fz)aq2).i.a()) {
                    ks.a().q(((fz)aq2).i.b);
                    com.mg.sq.a.s().a((String)null, (il)null);
                }
            }
        }
    }

    public final void a(aq aq2, int n) {
    }

    public final void a(aq aq2, int n, int n2) {
        this.t();
        aq2 = this.k.j(n2);
        if (aq2 instanceof ew) {
            aq2 = (ew)this.k.j(n2);
            if (this.i != null && this.i.b.equals(((ew)aq2).i.a)) {
                return;
            }
            if (((ew)aq2).i.a.equals(go.k.b)) {
                this.a(go.k);
                return;
            }
            this.w = ((ew)aq2).i.a;
            this.q = 10;
        }
    }

    public final void d(int n, int n2) {
        switch (n2) {
            case 106: {
                this.x.t();
                return;
            }
            case 113: {
                this.x.l.f(95);
                return;
            }
            case 109: {
                ((fc)this.x.l()).a();
                return;
            }
            case 105: {
                os os2 = this;
                bs bs2 = new bs();
                oa cfr_ignored_0 = os2.m;
                bs2.a(oa.a(os2.x));
                int n3 = bs2.e() > bs2.f() ? bs2.e() : bs2.f();
                bs2.a_(-n3, os2.f() - bs2.f() + n3);
                bs2.d(0, v.u - ba.a - bs2.f());
                bs2.a(os2);
                gb gb2 = new gb(113, 2);
                gb gb3 = new gb(106, 3);
                bs2.c(com.mg.sq.a.n);
                bs2.a(gb2);
                bs2.b(gb3);
                os2.x.a(bs2);
                return;
            }
            case 0: {
                ag.b().a(-9, false);
            }
        }
    }

    public final void a(int n, int n2, Object object) {
        if (object == null) {
            return;
        }
        Object object2 = (br)object;
        switch (n2) {
            case 10101: {
                if (com.mg.sq.a.m == null) break;
                object2 = com.mg.sq.a.m.c(this.s.a);
                ((ds)object2).d("patriot");
                break;
            }
            case 10105: {
                com.mg.sq.a.d(this.s.a);
                break;
            }
            case 10102: {
                if (com.mg.sq.a.m == null) break;
                com.mg.sq.a.m.a(this.s.a, 0L);
                break;
            }
            case 10103: {
                com.mg.sq.a.s().r(this.s.a);
                break;
            }
            case 10100: {
                com.mg.sq.a.p(this.s.a);
                break;
            }
            case 10104: {
                this.m.a(this.s.a, false, 0, false, false);
                break;
            }
            case 99028: {
                ks.a().e();
                ks.a().r();
                com.mg.sq.a.s().a((String)null, (il)null);
                break;
            }
            default: {
                this.m.a(n2, (br)object2);
            }
        }
        this.x.t();
    }

    public final void b(lh lh2) {
        aq aq2 = this.k.u();
        if (aq2 instanceof ew) {
            aq2 = (ew)aq2;
            if (((ew)aq2).i.a.equals(lh2.b)) {
                this.a(lh2);
                this.i = lh2;
            }
        }
    }

    public final synchronized void a(String string, doo doo2, String string2, long l) {
        int n;
        if (doo2 == null) {
            return;
        }
        if (this.u == 0) {
            return;
        }
        if (this.a(string) && (n = this.b(doo2.a)) >= 0) {
            try {
                ((ew)this.k.j(n)).a(doo2, string2, l);
                return;
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                System.gc();
            }
        }
    }

    public final void a(lr[] lrArray) {
        if (this.u != 0) {
            this.a((byte)0);
        }
        this.k.t();
        int n = 0;
        while (n < lrArray.length) {
            this.k.b(new fz(lrArray[n]));
            ++n;
        }
        this.k.i(0);
        com.mg.sq.a.s().v();
        this.c(true);
    }

    public final void b(lr[] lrArray) {
        if (this.u == 0) {
            this.a((byte)0);
            int n = 0;
            while (n < lrArray.length) {
                int n2 = 0;
                while (n2 < l.length) {
                    if (lrArray[n].b.equals(os.l[n2].b)) {
                        os.l[n2].f = lrArray[n].f;
                        os.l[n2].e = lrArray[n].e;
                        os.l[n2].a = lrArray[n].a;
                        os.l[n2].c = lrArray[n].c;
                        os.l[n2].d = lrArray[n].d;
                        os.l[n2].b = lrArray[n].b;
                        os.l[n2].g = lrArray[n].g;
                    }
                    ++n2;
                }
                ++n;
            }
        }
    }

    private int b(String string) {
        doo doo2;
        if (this.k.r() == 0) {
            return -1;
        }
        int n = 0;
        int n2 = this.k.r();
        int n3 = n2 + 0 >> 1;
        do {
            doo2 = ((ew)this.k.j((int)n3)).i;
            if (string.compareTo(doo2.a) > 0) {
                n = n3;
                n3 = n + n2 >> 1;
                continue;
            }
            if (string.compareTo(doo2.a) < 0) {
                n2 = n3;
                n3 = n + n2 >> 1;
                continue;
            }
            return n3;
        } while (n != n3);
        doo2 = ((ew)this.k.j((int)n3)).i;
        if (string.equals(doo2.a)) {
            return n3;
        }
        return -1;
    }

    public final synchronized void a(String string, String string2) {
        int n;
        if (this.a(string) && (n = this.b(string2)) >= 0) {
            this.k.c(this.k.j(n));
            if (n == this.k.q()) {
                if (this.k.q() >= this.k.r()) {
                    this.k.i(this.k.r() - 1);
                } else {
                    this.k.i(n);
                }
            }
            this.t();
        }
    }

    private void t() {
        int n = this.p.r().b;
        int n2 = this.k.q();
        aq aq2 = this.k.j(n2);
        int n3 = 0;
        if (aq2.d() - n < 0) {
            n3 = aq2.d() - n;
        } else if (aq2.d() + aq2.f() > n + this.p.r().d) {
            n3 = aq2.d() + aq2.f() - (n + this.p.r().d);
        }
        this.p.j(n3);
    }

    public final void a(String string, String string2, long l, int n) {
        this.j = string;
        this.z = string2;
        this.A = l + System.currentTimeMillis();
        this.B = n;
        if (this.u != 1) {
            this.a((byte)1);
        }
        ks.a().e(string);
    }

    public final byte q() {
        return this.u;
    }

    public final synchronized void b(String string, doo doo2, String string2, long l) {
        if (doo2 == null) {
            return;
        }
        if (this.a(string)) {
            int n = this.b(doo2.a);
            if (n >= 0) {
                this.a(string, doo2, string2, l);
                return;
            }
            this.a(doo2);
            this.t();
        }
    }

    public final void r() {
        if (this.u == 1) {
            this.a((byte)0);
        }
    }

    public final void s() {
        if (this.u == 1) {
            ks.a().e();
            this.k.t();
            System.gc();
        }
    }
}
