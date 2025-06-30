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
        this.a(0, 0, com.mg.bas.v.t, com.mg.bas.v.u);
        this.a((byte)0);
        this.x.a(new gb(105, 0));
        this.x.b(new gb(109, 1));
        this.x.c(com.mg.sq.a.n);
        this.x.a(new ba());
        this.x.a((aq)this);
    }

    private void a(byte by) {
        this.u = by;
        os os2 = this;
        switch (os2.u) {
            case 1: {
                os2.n = new k(0, 73, com.mg.bas.v.t, 1);
                os2.o = new k(0, os2.n.b + 4, os2.e(), os2.f() - (os2.n.b + 4) - ba.a);
                break;
            }
            default: {
                os2.n = new k(0, 5, com.mg.bas.v.t, 1);
                os2.o = new k(0, os2.n.b + 5, os2.e(), os2.f() - (os2.n.b + 4) - ba.a);
            }
        }
        this.k = new fk();
        this.k.i = true;
        this.k.a((bq)this);
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

    public final void a(final Graphics graphics, final int n, int n2) {
        if (this.p != null && this.p.k()) {
            graphics.setColor(com.mg.bas.v.am);
            graphics.fillRect(0, 0, this.e(), this.f());
            graphics.drawImage(pc.d, this.c() + this.e(), this.d() + this.f() - ba.a, 40);
            switch (this.u) {
                case 1: {
                    if (this.t != null) {
                        this.t.a(graphics, 0, 0);
                    }
                    pc.a(graphics, this.n.a, this.n.b, this.n.c);
                    if (this.z != null) {
                        final long n3 = (this.A - System.currentTimeMillis() > 0L) ? (this.A - System.currentTimeMillis()) : 0L;
                        n2 = com.mg.bas.v.t - bx.c.a(this.z) - bx.c.a(com.mg.bas.i.b(n3, "hh:mm:ss")) - 5;
                        com.mg.sq.a.h.a(graphics, String.valueOf(this.z) + " " + com.mg.bas.i.b(n3, "hh:mm:ss"), n2, com.mg.bas.v.u - 35, 0);
                        break;
                    }
                    break;
                }
            }
            if (this.p != null) {
                cw.a(graphics);
                cw.b(graphics, this.p.h());
                this.p.a(graphics, this.c(), this.d());
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

    private void a(final doo doo) {
        try {
            ew ew;
            if (doo.a.length() < 6) {
                ew = new ew(doo, this.e(), this.y);
            }
            else {
                ew = new ew(doo, this.e());
            }
            ew.a_(this.v++);
            final String a = doo.a;
            int n2;
            int n;
            if (this.k.r() == 0) {
                n = (n2 = -1);
            }
            else {
                int n3 = 0;
                int r = this.k.r();
                int n4 = r + 0 >> 1;
                while (true) {
                    final doo i = ((ew)this.k.j(n4)).i;
                    if (a.compareTo(i.a) > 0) {
                        n4 = (n3 = n4) + r >> 1;
                    }
                    else {
                        if (a.compareTo(i.a) >= 0) {
                            n = (n2 = n4);
                            break;
                        }
                        r = n4;
                        n4 = n3 + r >> 1;
                    }
                    if (n3 == n4) {
                        final doo j = ((ew)this.k.j(n4)).i;
                        if (a.compareTo(j.a) > 0) {
                            n = (n2 = ((r == this.k.r()) ? -1 : r));
                            break;
                        }
                        if (a.compareTo(j.a) < 0) {
                            n = (n2 = n3);
                            break;
                        }
                        continue;
                    }
                }
            }
            final int n5 = n2;
            if (n == -1) {
                this.k.b(ew);
                return;
            }
            this.k.a(ew, n5);
        }
        catch (final OutOfMemoryError outOfMemoryError) {
            com.mg.sq.a.m.G();
            ct.a("[RoomTab] khong du bo nho them ng choi vao room");
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

    public final void b(final aq aq, final int n) {
        if (aq instanceof ew) {
            if (this.k.r() > 1) {
                final doo i = ((ew)aq).i;
                if (!i.a.equals(go.k.b)) {
                    this.s = i;
                    final bs bs = new bs();
                    if (com.mg.sq.a.m != null && com.mg.sq.a.o) {
                        final fc fc = (fc)this.x.l();
                        switch (this.s.c) {
                            case 2: {
                                if (fc.b(com.mg.sq.a.m)) {
                                    if ((this.B & 0x2) != 0x0) {
                                        bs.a(new br("Giao dịch", 10100));
                                    }
                                    bs.a(new br[] { new br("Chat!", 10101), new br("Xem ME", 10102) });
                                    break;
                                }
                                bs.a(new br[] { new br("Giao dịch", 10100) });
                                break;
                            }
                            case 3: {
                                if (fc.b(com.mg.sq.a.m)) {
                                    bs.a(new br[] { new br("Chat!", 10101), new br("Xem ME", 10102) });
                                    break;
                                }
                                return;
                            }
                            case 1: {
                                if (fc.b(com.mg.sq.a.m)) {
                                    if ((this.B & 0x4) != 0x0) {
                                        bs.a(new br("Xem Trận đánh", 10103));
                                    }
                                    bs.a(new br[] { new br("Chat!", 10101), new br("Xem ME", 10102) });
                                    break;
                                }
                                bs.a(new br[] { new br("Xem Trận đánh", 10103) });
                                break;
                            }
                            default: {
                                if (fc.b(com.mg.sq.a.m)) {
                                    if (this.s.f > 0L) {
                                        bs.a(new br[] { new br("Đánh!", 10104), new br("Giao dịch", 10100), new br("Chat!", 10101), new br("Xem ME", 10102) });
                                        break;
                                    }
                                    if ((this.B & 0x1) != 0x0) {
                                        bs.a(new br("Khiêu Chiến", 10105));
                                    }
                                    if ((this.B & 0x2) != 0x0) {
                                        bs.a(new br("Giao dịch", 10100));
                                    }
                                    bs.a(new br[] { new br("Chat!", 10101), new br("Xem ME", 10102) });
                                    break;
                                }
                                else {
                                    if (this.s.f > 0L) {
                                        bs.a(new br[] { new br("Đánh!", 10104), new br("Giao dịch", 10100) });
                                        break;
                                    }
                                    if ((this.B & 0x1) != 0x0) {
                                        bs.a(new br("Khiêu Chiến", 10105));
                                    }
                                    if ((this.B & 0x2) != 0x0) {
                                        bs.a(new br("Giao dịch", 10100));
                                        break;
                                    }
                                    break;
                                }
//                                break;
                            }
                        }
                    }
                    else {
                        switch (this.s.c) {
                            case 2: {
                                if ((this.B & 0x2) != 0x0) {
                                    bs.a(new br("Giao dịch", 10100));
                                    break;
                                }
                                break;
                            }
                            case 3: {
                                return;
                            }
                            case 1: {
                                if ((this.B & 0x4) != 0x0) {
                                    bs.a(new br("Xem Trận đánh", 10103));
                                    break;
                                }
                                break;
                            }
                            default: {
                                if (this.s.f > 0L) {
                                    bs.a(new br[] { new br("Đánh!", 10104), new br("Giao dịch", 10100) });
                                    break;
                                }
                                if ((this.B & 0x1) != 0x0) {
                                    bs.a(new br("Khiêu Chiến", 10105));
                                }
                                if ((this.B & 0x2) != 0x0) {
                                    bs.a(new br("Giao dịch", 10100));
                                    break;
                                }
                                break;
                            }
                        }
                    }
                    final aq u = this.k.u();
                    final k r = this.p.r();
                    final int n2 = (com.mg.bas.v.t - bs.e()) / 2;
                    int n3;
                    if ((n3 = this.p.d() + u.d() - r.b) + bs.f() > com.mg.bas.v.u - ba.a) {
                        n3 = com.mg.bas.v.u - ba.a - bs.f();
                    }
                    bs.a_(com.mg.bas.v.t + bs.e(), n3);
                    bs.d(n2, n3);
                    bs.a((bg)this);
                    bs.a(new gb(113, 2));
                    bs.b(new gb(106, 3));
                    bs.c(com.mg.sq.a.n);
                    bs.a_(1);
                    this.x.a(bs);
                }
            }
        }
        else {
            final fz fz;
            if (aq instanceof fz && !(fz = (fz)aq).i.a()) {
                ks.a().q(fz.i.b);
                com.mg.sq.a.s().a(null, (il)null);
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

    public final void d(final int n, final int n2) {
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
                final bs bs2;
                final bs bs = bs2 = new bs();
                final oa m = this.m;
                bs.a(oa.a((fb)this.x));
                final int n3 = (bs2.e() > bs2.f()) ? bs2.e() : bs2.f();
                bs2.a_(-n3, this.f() - bs2.f() + n3);
                bs2.d(0, com.mg.bas.v.u - ba.a - bs2.f());
                bs2.a((bg)this);
                final gb gb = new gb(113, 2);
                final gb gb2 = new gb(106, 3);
                bs2.c(com.mg.sq.a.n);
                bs2.a(gb);
                bs2.b(gb2);
                this.x.a(bs2);
                return;
            }
            case 0: {
                ag.b().a(-9, false);
                break;
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
