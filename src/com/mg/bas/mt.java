package com.mg.bas;
// Decompiled with: Procyon 0.6.0
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class mt implements mr
{
    private ms h;
    public mh a;
    private ml i;
    private Image j;
    private Image k;
    private a[] l;
    private a m;
    private a n;
    private a o;
    private a p;
    private mm q;
    public mx b;
    private k r;
    private na s;
    private y t;
    public y c;
    private y u;
    private nm[][] v;
    private gz w;
    public ff d;
    private mj z;
    public np e;
    private mv A;
    lz f;
    private io[] B;
    private in[] C;
    public hl g;
    private String[][] D;
    
    public mt(final ms h) {
        super();
        this.f = new lz(30, 30, 30, (byte)10);
        this.D = new String[][] { { "Đại hiệp tha mạng!!", "Em vô tội T.T", "Hey! Có gì từ từ nói...", "Eck eck...Sợ quá!!" } };
        try {
            this.h = h;
            this.r = new k();
            this.m();
        }
        catch (final Exception ex) {
//            final Throwable t;
            ex.printStackTrace();
        }
        this.f.b(false);
    }
    
    public final void a(final String s) {
        if (s == null || s.length() <= 0) {
            return;
        }
        this.z.a(s, 0);
        if (!this.h.a(1, 0).a().O) {
            if (com.mg.sq.a.m != null) {
                com.mg.sq.a.m.a(this.h.a(1, 0).j(), s);
                return;
            }
            final String[] array = new String[this.h.a()[1].length];
            for (int i = 0; i < array.length; ++i) {
                array[i] = this.h.a()[1][i].j();
            }
            ks.a().a(array, s);
        }
    }
    
    public final void b(final String s) {
        this.z.a(s, 1);
    }
    
    public final void a(final String s, final int n) {
        this.z.a(s, 1, 50, 20);
    }
    
    public final void a() {
        if (this.h.a(1, 0).b()) {
            return;
        }
        if (!this.d.i()) {
            this.d.a(true);
            if (com.mg.bas.v.z) {
                this.d.g(true);
            }
        }
    }
    
    public final void b() {
        this.d.a(false);
        ag.a().e();
    }
    
    public final void a(final lm[] array) {
        (this.g = new hl(array, new bd("Dùng", 1008), new bd("Đóng", 1009), new bd("", 1008))).c(true);
        this.g.b(true);
    }
    
    public final void c() {
        this.B = null;
        this.n = null;
        this.m = null;
        this.o = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.c = null;
        this.s = null;
        this.a = null;
        this.z = null;
        this.w = null;
        this.p = null;
        this.b.b = null;
        this.b = null;
        if (this.h != null) {
            this.h.g();
        }
        this.h = null;
        this.g = null;
        if (this.A != null) {
            this.A.c();
        }
        this.A = null;
        this.k = null;
        this.j = null;
        this.i = null;
        this.q = null;
        this.C = null;
        this.l = null;
        this.d = null;
    }
    
    private void m() {
        this.A = new mv(this, gr.r);
        this.m = new a();
        this.B = new io[2];
        this.C = new in[2];
        this.l = new a[2];
        for (int i = 0; i < this.l.length; ++i) {
            this.l[i] = new a();
        }
        (this.v = new nm[2][])[0] = new nm[oq.i.length];
        this.v[1] = new nm[oq.j.length];
        for (int j = 0; j < this.v.length; ++j) {
            for (int k = 0; k < this.v[j].length; ++k) {
                (this.v[j][k] = new nm()).a(com.mg.sq.a.h);
                this.v[j][k].a(40);
            }
        }
        this.n = new a();
        this.o = new a();
        this.p = new a();
        this.s = new na(com.mg.bas.v.t / 2, com.mg.bas.v.u / 2 - 15);
        (this.t = new y()).a(40);
        (this.c = new y()).a(Integer.MAX_VALUE);
        (this.u = new y()).a(20);
        this.k = mp.a().b;
        this.a = new mh();
        final mh a = this.a;
        final int t = com.mg.bas.v.t;
        final mv a2 = this.A;
        final int n = (t - mv.a()) / 2 + ((com.mg.sq.a.k == 0) ? 8 : 48) + 14;
        final int u = com.mg.bas.v.u;
        final mv a3 = this.A;
        final int n2 = (u - mv.b()) / 2;
        final byte l = com.mg.sq.a.k;
        a.c(n, n2 + 4 + 14);
        this.i = new ml();
        final nd a4 = this.a.a(0, 0);
        this.i.a(a4.n(), a4.o());
        final lg[][] a5 = this.h.a();
        final ms h = this.h;
        final k a6 = this.a.a;
        final byte m = com.mg.sq.a.k;
        final int t2 = com.mg.bas.v.t;
        final mv a7 = this.A;
        final int n3 = (t2 - mv.a()) / 2;
        final int u2 = com.mg.bas.v.u;
        final mv a8 = this.A;
        this.b = new mx(h, a6, m, n3, (u2 - mv.b()) / 2);
        this.j = mp.a().a;
        this.q = new mm();
        if (oq.o != 9) {
            final lg[][] array = a5;
            int n4 = 0;
            while (n4 < array[0].length) {
                if (array[0][n4].j().equals(go.k.b)) {
                    final lh a9;
                    if ((a9 = array[0][n4].a()).E.length != 0) {
                        for (int n5 = 0; n5 < a9.E.length; ++n5) {
                            for (int n6 = 0; n6 < go.k.E.length; ++n6) {
                                if (a9.E[n5].a == go.k.E[n6].a) {
                                    a9.E[n5] = go.k.E[n6];
                                    for (int n7 = 0; n7 < go.r.length; ++n7) {
                                        if (go.r[n7].a == a9.E[n5].a) {
                                            a9.E[n5].e = go.r[n7].c[a9.E[n5].f - 1].d;
                                            break;
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                        (this.w = new gz(a9)).b(true);
                        this.w.c(true);
                        break;
                    }
                    break;
                }
                else {
                    ++n4;
                }
            }
        }
        (this.d = new ff(null, 255, 2)).a(0, com.mg.bas.v.u - 20, com.mg.bas.v.t, 20);
        this.d.h(30);
        this.d.a(new mu(this));
        this.d.d(true);
        this.b();
        this.e = new np();
        final k a10 = this.a.a;
        final int n8 = this.b.h()[0];
        (this.z = new mj(n8, this.b.h()[1], this.b.g()[0] + this.b.g()[2] - n8, 20)).a(this.b.g()[1] - this.b.h()[1]);
        if (com.mg.sq.a.k == 0) {
            this.e.c(a10.a + a10.c / 2 - 5, a10.b + a10.d + 10);
            return;
        }
        this.e.c(this.b.e()[0], this.b.e()[1] + this.b.e()[3] + 6);
    }
    
    public final void d() {
        try {
            this.a.i();
            this.i.i();
            for (int i = this.m.d() - 1; i >= 0; --i) {
                if (this.m.b(i) != null) {
                    if (!((ne)this.m.b(i)).m()) {
                        this.m.a(i);
                    }
                    else if (this.m.b(i) != null) {
                        ((ne)this.m.b(i)).i();
                    }
                }
            }
            for (int j = this.n.d() - 1; j >= 0; --j) {
                if (this.n.b(j) != null) {
                    if (!((nb)this.n.b(j)).m()) {
                        this.n.a(j);
                    }
                    else if (this.n.b(j) != null) {
                        ((nb)this.n.b(j)).i();
                    }
                }
            }
            for (int k = this.o.d() - 1; k >= 0; --k) {
                if (this.o.b(k) != null) {
                    if (!((im)this.o.b(k)).m()) {
                        this.o.a(k);
                    }
                    else if (this.o.b(k) != null) {
                        ((im)this.o.b(k)).i();
                    }
                }
            }
            for (int l = this.p.d() - 1; l >= 0; --l) {
                if (this.p.b(l) != null) {
                    ((nh)this.p.b(l)).i();
                }
            }
            for (int n = 0; n < this.v.length; ++n) {
                for (int n2 = 0; n2 < this.v[n].length; ++n2) {
                    this.v[n][n2].b();
                }
            }
            for (int n3 = 0; n3 < this.B.length; ++n3) {
                if (this.B[n3] != null) {
                    this.B[n3].i();
                }
            }
            for (int n4 = 0; n4 < this.C.length; ++n4) {
                if (this.C[n4] != null) {
                    this.C[n4].i();
                }
            }
            for (int n5 = 0; n5 < this.l.length; ++n5) {
                final a a;
                if ((a = this.l[n5]) != null) {
                    for (int n6 = 0; n6 < a.d(); ++n6) {
                        if (a.b(n6) != null) {
                            ((ip)a.b(n6)).i();
                        }
                    }
                }
            }
            this.q.i();
            this.b.i();
            this.s.i();
            this.t.b();
            this.c.b();
            this.u.b();
            this.e.i();
            this.d.n();
            this.z.i();
            if (this.f != null) {
                this.f.i();
            }
        }
        catch (final Exception ex) {
//            final Throwable t;
            ex.printStackTrace();
        }
    }
    
    public final void a(final Graphics graphics) {
        try {
            final int t = com.mg.bas.v.t;
            final mv a = this.A;
            Label_0187: {
                if (t <= mv.a()) {
                    final int u = com.mg.bas.v.u;
                    final mv a2 = this.A;
                    if (u <= mv.b()) {
                        break Label_0187;
                    }
                }
                graphics.setColor(0);
                final int n = 0;
                final int n2 = 0;
                final int t2 = com.mg.bas.v.t;
                final int u2 = com.mg.bas.v.u;
                final mv a3 = this.A;
                graphics.fillRect(n, n2, t2, (u2 - mv.b()) / 2);
                final int n3 = 0;
                final int u3 = com.mg.bas.v.u;
                final mv a4 = this.A;
                final int n4 = (u3 + mv.b()) / 2;
                final int t3 = com.mg.bas.v.t;
                final int u4 = com.mg.bas.v.u;
                final mv a5 = this.A;
                graphics.fillRect(n3, n4, t3, (u4 - mv.b()) / 2);
                final int n5 = 0;
                final int u5 = com.mg.bas.v.u;
                final mv a6 = this.A;
                final int n6 = (u5 - mv.b()) / 2;
                final int t4 = com.mg.bas.v.t;
                final mv a7 = this.A;
                final int n7 = (t4 - mv.a()) / 2;
                final mv a8 = this.A;
                graphics.fillRect(n5, n6, n7, mv.b());
                final int t5 = com.mg.bas.v.t;
                final mv a9 = this.A;
                final int n8 = (t5 + mv.a()) / 2;
                final int u6 = com.mg.bas.v.u;
                final mv a10 = this.A;
                final int n9 = (u6 - mv.b()) / 2;
                final int t6 = com.mg.bas.v.t;
                final mv a11 = this.A;
                final int n10 = (t6 - mv.a()) / 2;
                final mv a12 = this.A;
                graphics.fillRect(n8, n9, n10, mv.b());
            }
            final int t7 = com.mg.bas.v.t;
            final mv a13 = this.A;
            final int n11 = (t7 - mv.a()) / 2;
            final int u7 = com.mg.bas.v.u;
            final mv a14 = this.A;
            final int n12 = (u7 - mv.b()) / 2;
            final int n13 = n11;
            final int n14 = n12;
            final mv a15 = this.A;
            final int a16 = mv.a();
            final mv a17 = this.A;
            graphics.setClip(n13, n14, a16, mv.b());
            this.A.a(graphics, n11, n12, 0);
            cw.a(graphics, this.r);
            cw.a(graphics, this.a.a, this.r);
            this.a.a(graphics);
            cw.c(graphics, this.r);
            this.i.a(graphics);
            if (this.f != null) {
                this.f.a(graphics);
            }
            try {
                if (this.q != null) {
                    this.q.a(graphics);
                }
            }
            catch (final Exception ex) {
                ct.a("[SQCViewManager] loi view" + ex.toString());
            }
            this.b.a(graphics);
            this.t.a(graphics, 0, 0);
            this.c.a(graphics, 0, 0);
            this.u.a(graphics, 0, 0);
            for (int i = 0; i < this.l.length; ++i) {
                final a a18 = this.l[i];
                final nk nk;
                int n15 = (nk = this.b.a[i]).n() + (nk.p() - a18.d() * 17) / 2;
                final int n16 = nk.o() - 15;
                for (int j = 0; j < a18.d(); ++j) {
                    ((ip)a18.b(j)).a(graphics, n15 + ((i == 0) ? (nk.p() / 2 - 20) : (-nk.p() / 2 + 20)), n16);
                    n15 += 15;
                }
            }
            for (int k = 0; k < this.m.d(); ++k) {
                ((ne)this.m.b(k)).a(graphics, 0, 0);
            }
            for (int l = this.p.d() - 1; l >= 0; --l) {
                ((nh)this.p.b(l)).a(graphics);
            }
            for (int n17 = 0; n17 < this.n.d(); ++n17) {
                ((nb)this.n.b(n17)).a(graphics, 0, 0);
            }
            for (int n18 = 0; n18 < this.o.d(); ++n18) {
                ((im)this.o.b(n18)).a(graphics);
            }
            for (int n19 = 0; n19 < this.B.length; ++n19) {
                if (this.B[n19] != null) {
                    this.B[n19].a(graphics);
                }
            }
            for (int n20 = 0; n20 < this.C.length; ++n20) {
                if (this.C[n20] != null) {
                    this.C[n20].a(graphics);
                }
            }
            if (oq.o != 1) {
                this.e.a(graphics);
            }
            this.z.a(graphics);
            for (int n21 = 0; n21 < this.v.length; ++n21) {
                for (int n22 = 0; n22 < this.v[n21].length; ++n22) {
                    this.v[n21][n22].a(graphics, 0, 0);
                }
            }
            this.s.a(graphics);
            graphics.setClip(0, 0, com.mg.bas.v.t, com.mg.bas.v.u);
            this.d.a(graphics, 0, 0);
        }
        catch (final Exception ex2) {
//            final Throwable t8;
            ex2.printStackTrace();
        }
    }
    
    public final void a(final int n, final int n2, final int n3) {
        this.i.a(n);
        final nd a = this.a.a(n2 - 2, n3 - 2);
        this.i.a(a.n(), a.o());
    }
    
    public final void b(final int n, final int n2, final int n3) {
        this.i.a(n);
        final nd a = this.a.a(n2 - 2, n3 - 2);
        if (n == 0 && oq.o != 9) {
            this.i.b(a.n(), a.o());
            return;
        }
        this.i.a(a.n(), a.o());
    }
    
    public final void a(final int n, final int n2) {
        this.i.a(0);
        final nd a = this.a.a(n - 2, n2 - 2);
        int n3 = 0;
        if (n2 > 2) {
            n3 = 1;
        }
        if (n2 < 9) {
            n3 |= 0x2;
        }
        if (n > 2) {
            n3 |= 0x4;
        }
        if (n < 9) {
            n3 |= 0x8;
        }
        this.i.b(n3, a.n(), a.o());
    }
    
    private static int b(final int n, final int n2, final int n3, final int n4) {
        int n5 = 0;
        if (n2 < n4) {
            n5 = 2;
        }
        else if (n2 > n4) {
            n5 = 1;
        }
        else if (n < n3) {
            n5 = 8;
        }
        else if (n > n3) {
            n5 = 4;
        }
        return n5;
    }
    
    public final void a(final int n, final int n2, final int n3, final int n4, final int n5) {
        this.i.a(n);
        final nd a = this.a.a(n4 - 2, n5 - 2);
        final nd a2 = this.a.a(n2 - 2, n3 - 2);
        this.i.c(a2.n(), a2.o(), a.n(), a.o());
    }
    
    public final void e() {
        this.f.b(false);
    }
    
    public final void b(final int n, final int n2, final int n3, int b, final int n4) {
        b = b(n2, n3, b, n4);
        this.i.a(n);
        final nd a = this.a.a(n2 - 2, n3 - 2);
        this.i.b(b, a.n(), a.o());
    }
    
    public final void a(final my my) {
        int n = my.a;
        int n2 = my.b;
        int n3;
        if ((my.e[0] & 0xFF) >= 3 || (my.e[1] & 0xFF) >= 3) {
            n3 = b(my.c, my.d, my.a, my.b);
            n = my.c;
            n2 = my.d;
        }
        else {
            n3 = b(my.a, my.b, my.c, my.d);
        }
        this.q.b((n2 - 2) * 28 + this.a.n(), (n - 2) * 28 + this.a.o(), n3);
    }
    
    public final void f() {
        this.q.a();
    }
    
    public final void g() {
        this.i.a();
    }
    
    public final int h() {
        int n = 0;
        for (int i = 0; i < 8; ++i) {
            int n2 = n + 0;
            for (int j = 0; j < 8; ++j) {
                this.a.a(i, j).i(28, n2);
                ++n2;
            }
            ++n;
        }
        return 22;
    }
    
    public final int i() {
        int n = 0;
        final nj[][] l = this.h.l;
        final int[] array = new int[12];
        for (int i = 2; i < 10; ++i) {
            int n2 = 0;
            for (int j = 9; j >= 2; --j) {
                this.a(n2, i, j, i, l[j][i], array[i] + n);
                final int[] array2 = array;
                final int n3 = i;
                ++array2[n3];
                --n2;
            }
            ++n;
        }
        return 21;
    }
    
    public final void a(final int n, final int n2, final nj nj, final int n3) {
        this.a.a(n, n2, nj, n3);
    }
    
    public final void a(final int n, final int n2, final int n3, final int n4, final nj nj, final nj nj2) {
        this.a.a(n, n2, n3, n4, nj, nj2);
    }
    
    public final void a(final int n, final int n2, final int n3, final int n4, final nj nj, final int n5) {
        this.a.a(n, n2, n3, n4, nj, n5);
    }
    
    public final int a(final mw mw, int a) {
        int n = 0;
        if (mw.k) {
            if ((mw.a.e & 0x1) != 0x0) {
                final int n2;
                a = (n2 = (a + 1) % 2);
                int[] array3;
                int[] array2;
                if (n2 == 0) {
                    final int[] array = array2 = (array3 = new int[4]);
                    array[0] = this.b.a[0].n();
                    array[1] = this.b.a[0].o();
                    array[2] = this.b.a[0].p();
                    array[3] = this.b.a[0].q();
                }
                else {
                    final int[] array4 = array2 = (array3 = new int[4]);
                    array4[0] = this.b.a[1].n();
                    array4[1] = this.b.a[1].o();
                    array4[2] = this.b.a[1].p();
                    array4[3] = this.b.a[1].q();
                }
                final int[] array5 = array2;
                final int n3 = array3[0] + array5[2] / 2 + cv.a() % 10;
                final int n4 = array5[1] + array5[3] / 2 + cv.a() % 10;
                if (mw.d == 1 && mw.g == 1) {
                    this.a(mw, n3, n4);
                }
                else if (mw.d == 1) {
                    this.b(mw, n3, n4);
                }
                else if (mw.g == 1) {
                    this.a(mw, n3, n4);
                }
                else {
                    this.a(mw, n3, n4);
                    this.b(mw, n3, n4);
                }
                this.a(n2, 36, 26, true);
            }
            final nj a2 = mw.a;
            int[] array6 = null;
            final k k = new k();
            switch (a2.e) {
                case 1:
                case 16:
                case 32:
                case 64: {
                    if (a == 0) {
                        this.b.a[0].g();
                        break;
                    }
                    this.b.a[1].g();
                    break;
                }
                case 2:
                case 4:
                case 8: {
                    if ((a2.e & 0x2) != 0x0) {
                        array6 = ((a == 0) ? this.b.a() : this.b.b());
                    }
                    else if ((a2.e & 0x4) != 0x0) {
                        array6 = ((a == 0) ? this.b.c() : this.b.d());
                    }
                    else if ((a2.e & 0x8) != 0x0) {
                        array6 = ((a == 0) ? this.b.e() : this.b.f());
                    }
                    if (array6 != null) {
                        k.a = array6[0] + array6[2] / 2;
                        k.b = array6[1] + array6[3] / 2;
                        k.c = array6[2] - 2;
                        k.d = array6[3] - 2;
                        break;
                    }
                    break;
                }
            }
            this.a.n();
            this.a.o();
            int n5;
            if (mw.d == 1 && mw.g == 1) {
                n5 = this.a(mw);
            }
            else if (mw.d < 3) {
                n5 = this.a(mw);
            }
            else if (mw.g < 3) {
                n5 = this.b(mw);
            }
            else {
                a = this.a(mw);
                final int b = this.b(mw);
                n5 = ((a > b) ? a : b);
            }
            n = n5;
        }
        return n;
    }
    
    private int a(final mw mw) {
        return this.a.b(mw);
    }
    
    private int b(final mw mw) {
        return this.a.a(mw);
    }
    
    public final int a(final int n) {
        Image image = null;
        switch (n) {
            case 1: {
                image = com.mg.bas.f.d("/strwin");
                break;
            }
            case 0: {
                image = com.mg.bas.f.d("/strlose");
                break;
            }
        }
        return this.s.a(image);
    }
    
    private void a(final int n, final int n2, final k k, final nj nj, final int n3, final boolean b) {
        if ((nj.e & 0x1) != 0x0) {
            return;
        }
        try {
            nh nh = null;
            for (int i = this.p.d() - 1; i >= 0; --i) {
                final nh nh2;
                if (!(nh2 = (nh)this.p.b(i)).m()) {
                    nh = nh2;
                    break;
                }
            }
            if (nh == null) {
                nh = new nh(this.k);
                this.p.a(nh);
            }
            nh.a(n, n2, k, nj.g, 0, false);
        }
        catch (final OutOfMemoryError outOfMemoryError) {
            this.b(true);
            if (com.mg.sq.a.m != null) {
                com.mg.sq.a.m.G();
            }
        }
    }
    
    public final void b(int n, final int n2) {
        int[] array = null;
        final k k = new k();
        switch (n2) {
            case 1: {
                array = ((n == 0) ? this.b.a() : this.b.b());
                break;
            }
            case 2: {
                array = ((n == 0) ? this.b.c() : this.b.d());
                break;
            }
            case 3: {
                array = ((n == 0) ? this.b.e() : this.b.f());
                break;
            }
        }
        if (array != null) {
            k.a = array[0] + array[2] / 2;
            k.b = array[1] + array[3] / 2;
            k.c = array[2] - 2;
            k.d = array[3] - 2;
            if (com.mg.sq.a.k == 0) {
                n = array[0] + array[2] + 30;
                int n3 = array[1] - 50;
                for (int i = 0; i < 9; ++i) {
                    if (i == 0 || i == 8) {
                        this.a(n + 30, n3, k, nj.a(n2), 0, false);
                    }
                    else {
                        this.a(n, n3, k, nj.a(n2), 0, false);
                    }
                    n3 += 12;
                }
                return;
            }
            n = array[0] - 50;
            final int n4 = array[1] - 30;
            for (int j = 0; j < 9; ++j) {
                if (j == 0 || j == 8) {
                    this.a(n, n4 - 30, k, nj.a(n2), 0, false);
                }
                else {
                    this.a(n, n4, k, nj.a(n2), 0, false);
                }
                n += 12;
            }
        }
    }
    
    public final void a(final String s, int i, final int n, final boolean b) {
        if (n == 0) {
            return;
        }
        final boolean b2 = this.h.b;
        final boolean e = this.h.e;
        d d = com.mg.sq.a.h;
        final lg[][] a = this.h.a();
        final String string = String.valueOf((n >= 0) ? ((n == 0) ? ((i != 0) ? "-" : "+") : "+") : "") + n;
        int j;
        for (i = 0; i < a.length; ++i) {
            for (j = 0; j < a[i].length; ++j) {
                if (a[i][j].j().equals(s)) {
                    if ((b2 || b || e) && n < 0) {
                        d = bx.a;
                        if (b2 && b) {
                            d.a(12067023);
                        }
                        else if (b2) {
                            d.a(6290199);
                        }
                        else if (e && b) {
                            d.a(16753920);
                        }
                        else if (e) {
                            d.a(16776960);
                        }
                        else {
                            d.a(2371791);
                        }
                    }
                    this.v[i][j].a(string, this.b.a(i)[j].n() + this.b.a(i)[j].p() / 2, this.b.a(i)[j].o());
                    this.v[i][j].a(this.b.a(i)[j]);
                    this.v[i][j].a(d);
                    if (i == 1 && this.h.a(1, 0).b() && n < 0 && this.h.a(1, 0).c() <= 50) {
                        this.a(this.D[0][cv.a(this.D[0].length)], 50);
                    }
                    return;
                }
            }
        }
    }
    
    public final void c(final int n, int n2, final int n3, final int n4, final int n5) {
        ne ne = null;
        for (int i = this.m.d() - 1; i >= 0; --i) {
            final ne ne2;
            if (!(ne2 = (ne)this.m.b(i)).a()) {
                ne = ne2;
                break;
            }
        }
        if (ne == null) {
            ne = new ne(this.j);
            this.m.a(ne);
        }
        final int n6 = (n3 + n5 / 2 - 2) * 28 - ((n5 % 2 == 0) ? 14 : 4) + this.a.n();
        final int n7 = (n2 + n4 / 2 - 2) * 28 - ((n4 % 2 == 0) ? 14 : 5) + this.a.o();
        n2 = n - 1;
        ne.a(n6, n7, n2, "x" + n);
    }
    
    private void c(final int n, final int n2, final int n3) {
        this.a(n, n2, n3, false);
    }
    
    public final void a(final int n, final int n2, final int n3, final boolean b) {
        this.b.a(n, n2, b);
        this.b.c(n3);
    }
    
    private void a(final mw mw, final int n, final int n2) {
        for (int i = mw.c; i < mw.c + mw.d; ++i) {
            nb nb = null;
            final nd a = this.a.a(mw.b - 2, i - 2);
            for (int j = this.n.d() - 1; j >= 0; --j) {
                final nb nb2;
                if (!(nb2 = (nb)this.n.b(j)).m()) {
                    nb = nb2;
                    break;
                }
            }
            if (nb == null) {
                nb = new nb(this.k);
                this.n.a(nb);
            }
            nb.a(a.n(), a.o(), n, n2, mw.a.d * nb.q());
        }
    }
    
    private void b(final mw mw, final int n, final int n2) {
        for (int i = mw.e; i < mw.e + mw.g; ++i) {
            nb nb = null;
            final nd a = this.a.a(i - 2, mw.f - 2);
            for (int j = this.n.d() - 1; j >= 0; --j) {
                final nb nb2;
                if (!(nb2 = (nb)this.n.b(j)).m()) {
                    nb = nb2;
                    break;
                }
            }
            if (nb == null) {
                nb = new nb(this.k);
                this.n.a(nb);
            }
            nb.a(a.n(), a.o(), n, n2, mw.a.d * nb.q());
        }
    }
    
    private void a(final int n, final int n2, final boolean b, final boolean b2) {
        final a a = this.l[n];
        ip ip = null;
        for (int i = 0; i < a.d(); ++i) {
            final ip ip2;
            if ((ip2 = (ip)a.b(i)).b == b && ip2.a == n2) {
                ip = ip2;
                break;
            }
        }
        if (ip == null) {
            a.a(new ip(n2, b, 8));
        }
        if (b2) {
            this.c(n);
        }
    }
    
    public final void a(final int n, final int n2, final boolean b) {
        final a a = this.l[n];
        for (int i = 0; i < a.d(); ++i) {
            final ip ip;
            if ((ip = (ip)a.b(i)).b == b && ip.a == n2) {
                a.a(i);
                return;
            }
        }
    }
    
    private void c(final int n) {
        final int n2 = this.h.a(n, 0).a().g / 2;
        if (this.C[n] == null) {
            this.C[n] = new in(n2);
            int[] array;
            if (n == 0) {
                array = new int[] { this.b.a[0].n(), this.b.a[0].o(), this.b.a[0].p(), this.b.a[0].q() };
            }
            else {
                array = new int[] { this.b.a[1].n(), this.b.a[1].o(), this.b.a[1].p(), this.b.a[1].q() };
            }
            this.C[n].c(array[0] + array[2] / 2, array[1] + array[3]);
        }
        this.C[n].r();
    }
    
    private void d(final int n) {
        if (this.h.a(n, 0).b()) {
            return;
        }
        this.h.d = false;
        if (this.B[n] == null) {
            this.B[n] = new io(n, this);
        }
        int[] array;
        if (n == 0) {
            array = new int[] { this.b.a[1].n(), this.b.a[1].o(), this.b.a[1].p(), this.b.a[1].q() };
        }
        else {
            array = new int[] { this.b.a[0].n(), this.b.a[0].o(), this.b.a[0].p(), this.b.a[0].q() };
        }
        this.B[n].a(this.h.a(n, 0).a().g / 2, (ni)this.b.a[n], array[0] + array[2] / 2, array[1] + array[3] / 2);
        this.c(n);
    }
    
    public final void b(final int n) {
        if (this.h.a(n, 0).b()) {
            return;
        }
        if (this.B[n] != null) {
            this.B[n].a();
        }
        this.B[n] = null;
    }
    
    public final int a(final lv lv, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, int i) {
        final int n = i + 1 & 0x1;
        int n2 = 10;
        int n3 = 0;
        int n4 = -180;
        if (i == 0) {
            n4 = 180;
        }
        final int n5 = this.a.a(0, 0).p() >> 1;
        final int n6 = this.a.a(0, 0).q() >> 1;
        int[] array5;
        int[] array6;
        if (i == 0) {
            array5 = new int[] { this.b.a[1].n(), this.b.a[1].o(), this.b.a[1].p(), this.b.a[1].q() };
            array6 = new int[] { this.b.a[0].n(), this.b.a[0].o(), this.b.a[0].p(), this.b.a[0].q() };
        }
        else {
            array5 = new int[] { this.b.a[0].n(), this.b.a[0].o(), this.b.a[0].p(), this.b.a[0].q() };
            array6 = new int[] { this.b.a[1].n(), this.b.a[1].o(), this.b.a[1].p(), this.b.a[1].q() };
        }
        switch (lv.a) {
            case 1000: {
                i = array5[0] + array5[2] / 2;
                final int n7 = array5[1] + array5[3] / 2;
                int n8 = this.a(0, lv.a, i - n4, n7 - 180, i, n7, 10);
                this.a(n, 32, 22, false);
                n2 = 10 + (cv.a(7) + 5);
                for (int j = 0; j < array4.length; ++j) {
                    final nd a;
                    i = (a = this.a.a(array3[j] - 2, array4[j] - 2)).n() + n5;
                    final int n9 = a.o() + n6;
                    final int n10 = 10 + cv.a(15);
                    n8 = this.a(n8, lv.a, i - n4, n9 - 180, i, n9, n10);
                    if (n10 > n2) {
                        n2 = n10;
                    }
                }
                break;
            }
            case 1001: {
                if (array != null) {
                    for (int k = 0; k < array.length; ++k) {
                        final nd a2 = this.a.a(array[k] - 2, array2[k] - 2);
                        this.a(array[k], array2[k], nj.a(10), n2 + 5);
                        i = a2.n();
                        final int o = a2.o();
                        n3 = this.a(n3, lv.a, i, o, i, o, n2);
                        n2 += 4;
                    }
                    n2 -= 4;
                    break;
                }
                break;
            }
            case 1002: {
                this.a(i, 1, true, true);
                break;
            }
            case 1003: {
                this.d(i);
                n2 += 30;
                break;
            }
            case 1004: {
                final int n11 = array5[0] + array5[2] / 2;
                final int n12 = array5[1] + array5[3];
                this.a(0, lv.a, n11, n12, n11, n12, 0);
                this.c(n, 26, 16);
                break;
            }
            case 1005: {
                i = array6[0] + array6[2] / 2;
                this.a(0, lv.a, i, array6[1] + array6[3] / 2, array5[0] + array5[2] / 2, array5[1] + array5[3] / 2, 4);
                this.c(n, 20, 10);
                break;
            }
            case 1006: {
                i = array5[0] + array5[2] / 2;
                final int n13 = array5[1] + array5[3];
                int n14 = this.a(0, lv.a, i - n4, n13 - 180, i, n13, 10);
                this.c(n, 36, 26);
                for (int l = 0; l < array4.length; ++l) {
                    final int n15 = cv.a(7) + 4;
                    final nd a3;
                    i = (a3 = this.a.a(array3[l] + 1 - 2, array4[l] + 1 - 2)).n();
                    final int o2 = a3.o();
                    n14 = this.a(n14, lv.a, i - n4, o2 - 180, i, o2, n15);
                    if (n15 > n2) {
                        n2 = n15;
                    }
                }
                break;
            }
            case 1007: {
                i = array5[0] + array5[2] / 2;
                final int n16 = array5[1] + array5[3];
                int n17 = this.a(0, lv.a, i, n16, i, n16, 10);
                this.c(n, 30, 11);
                for (int n18 = 0; n18 < array4.length; ++n18) {
                    final int n19 = cv.a(7) + 10;
                    final nd a4;
                    i = (a4 = this.a.a(array3[n18] + 4 - 1 - 2, array4[n18] + 2 - 1 - 2)).n() + n5;
                    final int n20 = a4.o() + n6;
                    n17 = this.a(n17, lv.a, i, n20, i, n20, n19);
                    if (n19 > n2) {
                        n2 = n19;
                    }
                }
                break;
            }
            case 1008: {
                this.c(n, 10, 4);
                final nd a5;
                i = (a5 = this.a.a(7, array4[0] + 1 - 2)).n() + n5;
                this.a(0, lv.a, i, a5.o() + n6, i, 0, 10);
                break;
            }
            case 2000: {
                final int[] array7 = new int[array.length + 1];
                int[] array8;
                int n21;
                nd a6;
                for (n21 = (array8 = new int[array.length + 1]).length - 1, i = 0; i < n21; ++i) {
                    a6 = this.a.a(array[i] - 2, array2[i] - 2);
                    array7[i] = a6.n();
                    array8[i] = a6.o();
                }
                n2 = 10 + (array8.length * 5 + 5);
                this.c(n, n2, n2 - 6);
                i = array5[0] + array5[2] / 2;
                final int n22 = array5[1] + array5[3] / 2;
                array7[array7.length - 1] = i;
                array8[array7.length - 1] = n22;
                ((jg)this.o.b(this.a(0, lv.a, i, n22, i, n22, n2))).a(array7, array8);
                break;
            }
            case 2001: {
                this.a(i, 0, true, true);
                break;
            }
            case 2002: {
                this.a(i, 2, true, true);
                break;
            }
            case 2003: {
                i = array5[0] + array5[2] / 2;
                final int n23 = array5[1] + array5[3] / 2;
                this.a(0, lv.a, i - n4, n23 - 180, i, n23, 10);
                this.c(n, 36, 26);
                n2 = 14;
                break;
            }
            case 2004: {
                final int n24 = array6[1] + array6[3] / 2 + 6;
                int n25 = array5[0] + array5[2] / 2;
                final int n26 = array5[1] + array5[3] / 2 + 6;
                if (i == 0) {
                    n25 += 60;
                    i = array6[0] + array6[2];
                }
                else {
                    i = array6[0];
                    n25 -= 60;
                }
                this.a(0, lv.a, i, n24, n25, n26, 10);
                this.c(n, 20, 10);
                n2 = 10;
                if (this.h.a(n, 0).i()) {
                    this.a(n, 1, false, false);
                    break;
                }
                break;
            }
            case 2005: {
                this.d(i);
                n2 += 30;
                break;
            }
            case 2006: {
                int n27 = array6[1] + array6[3] / 2 + 4;
                final int n28 = array5[0] + array5[2] / 2;
                final int t = com.mg.bas.v.t;
                final mv a7 = this.A;
                int n29 = (t - mv.a()) / 2;
                if (i == 0) {
                    n29 -= 56;
                    int n30 = this.a(0, lv.a, n29 - cv.a(150), n27, n28, n27, 6);
                    this.c(n, 16, 10);
                    final int n31 = n29;
                    final mv a8 = this.A;
                    final int n32 = n31 + mv.a() + 100;
                    for (int n33 = 0; n33 < array3.length; ++n33) {
                        final nd a9 = this.a.a(array3[n33] - 2, 0);
                        n30 = this.a(n30, lv.a, n29 - (((n33 & 0x1) == 0x1) ? 40 : 0), a9.o(), n32, a9.o(), 6);
                    }
                    n27 -= 40;
                    for (int n34 = 0; n34 < 3; ++n34) {
                        n30 = this.a(n30, lv.a, n29 - cv.a(150), n27, n32, n27, 6);
                        n27 += 20;
                    }
                }
                else {
                    final int n35 = 0;
                    final int a10 = lv.a;
                    final int n36 = n29;
                    final mv a11 = this.A;
                    int n37 = this.a(n35, a10, n36 + mv.a() + cv.a(150), n27, n28, n27, 6);
                    this.c(n, 16, 10);
                    final int n38 = n29 - 100;
                    final int n39 = n29;
                    final mv a12 = this.A;
                    final int n40 = n39 + mv.a();
                    for (int n41 = 0; n41 < array3.length; ++n41) {
                        final nd a13 = this.a.a(array3[n41] - 2, 0);
                        n37 = this.a(n37, lv.a, n40 + (((n41 & 0x1) == 0x1) ? 40 : 0), a13.o(), n38, a13.o(), 6);
                    }
                    n27 -= 40;
                    for (int n42 = 0; n42 < 3; ++n42) {
                        n37 = this.a(n37, lv.a, n40 + cv.a(150), n27, n38, n27, 6);
                        n27 += 20;
                    }
                }
                n2 = 5;
                break;
            }
            case 2007: {
                for (int n43 = 0; n43 < array4.length; ++n43) {
                    final nd a14;
                    i = (a14 = this.a.a(array3[n43] + 1 - 2, array4[n43] + 1 - 2)).n();
                    final int n44 = a14.o() - n6;
                    final int n45 = 10 + cv.a(10) + 5;
                    n3 = this.a(n3, lv.a, i, n44, i, 0, n45 + (n43 << 1));
                    if (n45 > n2) {
                        n2 = n45;
                    }
                }
                i = array5[0] + array5[2] / 2;
                this.a(n3, lv.a, i, array5[1] + array5[3] - 10, i, 0, n2 - 15);
                this.c(n, n2, n2 - 6);
                break;
            }
            case 2008: {
                final jl jl;
                (jl = (jl)this.o.b(this.a(0, lv.a, 0, 0, array5[0] + array5[2] / 2, array5[1] + array5[3] / 2, 0))).s = array.length;
                for (int n46 = 0; n46 < array.length; ++n46) {
                    final nd a15 = this.a.a(array[n46] - 2, array2[n46] - 2);
                    jl.t[n46].c(a15.n(), a15.o());
                }
                this.a(n, 32, 22, false);
                n2 = 0;
                break;
            }
            case 4000: {
                i = array5[0] + array5[2] / 2;
                final int n47 = array5[1] + array5[3] / 2;
                int n48 = this.a(0, lv.a, i - n4, n47 - 180, i, n47, 10);
                this.a(n, 32, 22, false);
                n2 = 10 + (cv.a(7) + 5);
                for (int n49 = 0; n49 < array4.length; ++n49) {
                    final nd a16;
                    i = (a16 = this.a.a(array3[n49] - 2, array4[n49] - 2)).n() + n5;
                    final int n50 = a16.o() + n6;
                    final int n51 = 10 + cv.a(15);
                    n48 = this.a(n48, lv.a, i - n4, n50 - 180, i, n50, n51);
                    if (n51 > n2) {
                        n2 = n51;
                    }
                }
                break;
            }
            case 4001: {
                i = array6[0] + array6[2] / 2;
                final int n52 = array6[1] + array6[3] - 10;
                this.a(0, lv.a, i, n52, i, n52, 10);
                this.b.c(10);
                n2 = 14;
                break;
            }
            case 4002: {
                i = array6[0] + array6[2] / 2;
                final int n53 = array6[1] + array6[3] / 2 + 6;
                this.a(0, lv.a, i, n53, array5[0] + array5[2] / 2, n53, 10);
                this.a(n, 1, false, false);
                n2 = 15;
                break;
            }
            case 4003: {
                final int n54 = array5[0] + array5[2] / 2;
                final int n55 = array5[1] + array5[3];
                this.a(0, lv.a, n54, n55, n54, n55, 10);
                this.b.a(n, 10);
                this.c(n, 15, 16);
                n2 = 13;
                break;
            }
            case 4004: {
                this.d(i);
                n2 += 30;
                break;
            }
            case 4005: {
                i = array6[0] + array6[2] / 2;
                this.a(0, lv.a, i, array6[1] + array6[3] / 2, array5[0] + array5[2] / 2, array5[1] + array5[3] / 2, 4);
                this.c(n, 26, 16);
                break;
            }
            case 4006: {
                final int n56 = array5[0] + array5[2] / 2;
                final int n57 = array5[1] + array5[3] / 2;
                int n58 = this.a(0, lv.a, n56, n57 - 180, n56, n57, 0);
                this.c(n, 20, 10);
                for (int n59 = 0; n59 < array4.length; ++n59) {
                    final int n60 = cv.a(15) + 10;
                    final nd a17;
                    i = (a17 = this.a.a(array3[n59] + 1 - 2, array4[n59] + 1 - 2)).n();
                    final int o3 = a17.o();
                    n58 = this.a(n58, lv.a, i, o3 - 180, i, o3, n60);
                    if (n60 > n2) {
                        n2 = n60;
                    }
                }
                break;
            }
            case 4007: {
                for (int n61 = 0; n61 < array4.length; ++n61) {
                    final nd a18;
                    i = (a18 = this.a.a(array3[n61] + 3 - 1 - 2, array4[n61] + 1 - 2)).n();
                    final int n62 = a18.o() + n6;
                    final int n63 = 10 + cv.a(15);
                    n3 = this.a(n3, lv.a, i, n62, i, 0, n63);
                    if (n63 > n2) {
                        n2 = n63;
                    }
                }
                this.c(n, n2, n2 - 6);
                break;
            }
            case 4008: {
                i = array5[0] + array5[2] / 2;
                final int n64 = array5[1] + array5[3] / 2;
                int n65 = this.a(0, lv.a, i - n4, n64 - 180, i, n64, 10);
                this.a(n, 32, 22, false);
                n2 = 10 + (cv.a(7) + 5);
                for (int n66 = 0; n66 < array4.length; ++n66) {
                    final nd a19;
                    i = (a19 = this.a.a(array3[n66] - 2, array4[n66] - 2)).n() + n5;
                    final int n67 = a19.o() + n6;
                    final int n68 = 10 + cv.a(20);
                    n65 = this.a(n65, lv.a, i - n4, n67 - 180, i, n67, n68);
                    if (n68 > n2) {
                        n2 = n68;
                    }
                }
                break;
            }
        }
        return n2 - 3;
    }
    
    private int a(int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        final int n8 = n;
        int n10 = 0;
        int n9 = 0;
        Label_0076: {
            if (n8 < 0) {
                n9 = (n10 = -1);
            }
            else {
                for (int i = n8; i < this.o.d(); ++i) {
                    final im im;
                    if (!(im = (im)this.o.b(i)).m() && im.r() == n2) {
                        n9 = (n10 = i);
                        break Label_0076;
                    }
                }
                n9 = (n10 = -1);
            }
        }
        n = n10;
        Object o = null;
        if (n9 > 0) {
            o = this.o.b(n);
        }
        else {
            switch (n2) {
                case 1000: {
                    o = new is();
                    break;
                }
                case 1001: {
                    o = new it();
                    break;
                }
                case 1004: {
                    o = new iu();
                    break;
                }
                case 1005: {
                    o = new iv();
                    break;
                }
                case 1006: {
                    o = new iw();
                    break;
                }
                case 1007: {
                    o = new ix();
                    break;
                }
                case 1008: {
                    o = new iy();
                    break;
                }
                case 2000: {
                    o = new jg();
                    break;
                }
                case 2003: {
                    o = new jh();
                    break;
                }
                case 2004: {
                    o = new ji();
                    break;
                }
                case 2006: {
                    o = new jj();
                    break;
                }
                case 2007: {
                    o = new jk();
                    break;
                }
                case 2008: {
                    o = new jl();
                    break;
                }
                case 4000: {
                    o = new iz();
                    break;
                }
                case 4001: {
                    o = new ja();
                    break;
                }
                case 4002: {
                    o = new jb();
                    break;
                }
                case 4003: {
                    o = new jc();
                    break;
                }
                case 4005: {
                    o = new jd();
                    break;
                }
                case 4006: {
                    o = new je();
                    break;
                }
                case 4007: {
                    o = new jf();
                    break;
                }
                case 4008: {
                    o = new iz();
                    break;
                }
                default: {
                    return -1;
                }
            }
            ((im)o).l(n2);
            this.o.a(o);
            n = this.o.d() - 1;
        }
        ((im)o).a(n3, n4, n5, n6, n7);
        return n;
    }
    
    public final void a(final boolean b) {
        this.b.a(b);
    }
    
    public final void a(final bf bf) {
        if (this.w != null) {
            this.w.b(bf);
            return;
        }
        com.mg.sq.a.s().a("Kiểu quyết đấu: Không chơi Tuyệt Chiêu");
    }
    
    public final void a(final int n, final int n2, int n3, int n4) {
        n3 = 112 + this.a.n() - 14;
        n4 = 112 + this.a.o() - 14;
        this.t.a("Còn " + n2 + " lượt", n3, n4);
        if (n == 0) {
            this.t.a(bx.c);
            return;
        }
        this.t.a(com.mg.sq.a.h);
    }
    
    public final void j() {
        final k a = this.a.a;
        this.u.a("Hết nước đi!", a.a + a.c / 2, a.b + a.d / 2);
    }
    
    public final void c(final String s) {
        final k a = this.a.a;
        this.c.a(s, a.a + a.c / 2, a.b + a.d / 2);
    }
    
    public final void k() {
        this.z.a("Vui lòng đừng gửi quá nhanh!", 0);
    }
    
    public final void l() {
        this.o.a();
    }
    
    public final void b(final boolean b) {
        this.n.a();
        this.m.a();
        this.p.a();
        if (b) {
            this.o.a();
        }
        System.gc();
    }
}
