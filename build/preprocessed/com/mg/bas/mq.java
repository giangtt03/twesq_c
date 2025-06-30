package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public abstract class mq implements bf, bg, kp, mr
{
    protected ms a;
    protected mt b;
    protected mk[] c;
    protected int d;
    protected a e;
    private int z;
    private int[] A;
    private int B;
    private int C;
    protected boolean f;
    protected int g;
    private boolean D;
    private boolean E;
    protected int h;
    protected int i;
    protected int j;
    private int F;
    private int G;
    private int H;
    private int I;
    private byte[] J;
    private byte[] K;
    private byte[] L;
    private byte[] M;
    private boolean N;
    private static int[] O;
    private static int[] P;
    private oq Q;
    private long R;
    protected boolean k;
    protected kr l;
    private boolean S;
    protected int m;
    protected int n;
    protected int o;
    private long T;
    protected long p;
    protected boolean q;
    protected int r;
    private boolean U;
    private boolean V;
    protected boolean s;
    private String[][] W;
    boolean t;
    public boolean u;
    private a X;
    protected nq v;
    nq w;
    
    static {
        mq.O = new int[] { -1, -1, 0, 1, 1, 1, 0, -1 };
        mq.P = new int[] { 0, 1, 1, 1, 0, -1, -1, -1 };
    }
    
    public mq(final ms a, final mt b, final oq q) {
        super();
        this.A = new int[21];
        this.f = false;
        this.g = -1;
        this.D = false;
        this.E = false;
        this.h = 0;
        this.i = 5;
        this.j = 6;
        this.F = 5;
        this.G = 6;
        this.N = false;
        this.l = new kr(16);
        this.S = false;
        this.m = 0;
        this.o = -1;
        this.T = -1L;
        this.V = false;
        this.W = new String[][] { { "Ngươi chán sống rồi!!", "Hừ, ngươi to gan lắm!", "Ngươi chưa đủ sức!", "Ta sẽ hạ ngươi trong vòng 3 bước", "Muốn chết? Thích thì chiều!" }, { "Xem đây!!!", "Tiếp chiêu!!!", "Chết nè!!!" } };
        this.t = false;
        this.X = new a();
        this.w = null;
        this.Q = q;
        this.a = a;
        this.b = b;
        this.a.p = new int[64];
        this.a.i = new mw[64];
        for (int i = 0; i < this.a.i.length; ++i) {
            this.a.i[i] = new mw();
        }
        (this.c = new mk[2])[0] = new mn(this, 0);
        this.c[1] = new mn(this, 1);
        ks.a().a(this);
        this.d(0);
        if (this.a.a(1, 0).b()) {
            this.k = true;
            b.a(this.W[0][cv.a(this.W[0].length)], 50);
        }
        this.f(oq.p);
        this.m = 0;
        this.R = System.currentTimeMillis();
    }
    
    public boolean f() {
        return false;
    }
    
    private void a(final int n, final int n2, final int n3, final int n4, final boolean k, final int j) {
        final mw mw;
        (mw = this.a.i[this.a.j]).a = this.a.b(n, n2);
        mw.h = n2;
        mw.i = n;
        mw.b = n;
        mw.c = n2 - (n3 >> 16 & 0xFF);
        mw.d = (n3 & 0xFF);
        mw.e = n - (n4 >> 16 & 0xFF);
        mw.f = n2;
        mw.g = (n4 & 0xFF);
        mw.k = k;
        mw.j = j;
        final ms a = this.a;
        ++a.j;
        if (this.k && (mw.a.e & 0x1) != 0x0 && cv.a(3) == 1 && this.h == 1) {
            this.b.a(this.W[1][cv.a(this.W[1].length)], 50);
        }
    }
    
    private void a(final String s, final nl[] array) {
        ct.a("[SQControllerManager]convertAttributeBufferToAttributeCharacter owner" + s);
        if (array == null) {
            return;
        }
        final lg[][] a;
        final boolean[][] array2 = new boolean[(a = this.a.a()).length][];
        int n = 0;
        int n2 = 0;
        for (int i = 0; i < a.length; ++i) {
            array2[i] = new boolean[a[i].length];
            for (int j = 0; j < a[i].length; ++j) {
                if (a[i][j].j().equals(s)) {
                    n = i;
                    n2 = j;
                }
                array2[i][j] = a[i][j].p();
            }
        }
        for (int k = 0; k < array.length; ++k) {
            for (int l = 0; l < a.length; ++l) {
                for (int n3 = 0; n3 < a[l].length; ++n3) {
                    if (array[k].a.equals(a[l][n3].j())) {
                        final lg lg = a[l][n3];
                        this.b.b.a(array[k].b, array[k].c, array[k].d, array[k].a, array[k].f);
                        if (array[k].b >= 0) {
                            final int n4 = array[k].b - lg.m();
                            ct.a(" convertAttributeBufferToAttributeCharacter   " + n4);
                            if (n4 < 0 && array[Math.abs(k - 1)].e > 0) {
                                this.b.a(lg.j(), l, -array[Math.abs(k - 1)].e, array2[n][n2]);
                            }
                            lg.g(array[k].b);
                        }
                        if (array[k].c >= 0) {
                            lg.h(array[k].c);
                        }
                        if (array[k].d >= 0) {
                            lg.j(array[k].d);
                        }
                    }
                }
            }
        }
    }
    
    public void b() {
        if (this.z > 0) {
            --this.z;
            return;
        }
        switch (this.d) {
            case 16: {
                this.c();
                return;
            }
            case 20: {
                this.d(10);
                return;
            }
            case 19: {
                this.d(15);
                return;
            }
            case 9: {
                this.z = this.b.a(this.g);
                switch (this.g) {
                    case 1: {
                        this.b.b.l(1);
                        break;
                    }
                    case 0: {
                        this.b.b.l(0);
                        break;
                    }
                }
                this.d(16);
                return;
            }
            case 15: {
                final nq v = this.v;
                Label_0435: {
                    if (v != null) {
                        this.a(v.a, v.f);
                        final byte d = v.D;
                        if (d != 0) {
                            int n;
                            if ((n = this.a.g + d) <= 0) {
                                n = 1;
                            }
                            this.b.b.j();
                            this.f(n);
                        }
                        final byte f = v.F;
                        if (oq.o != 1) {
                            this.B += f;
                        }
                        this.v = null;
                        if (!this.N) {
                            final long a = oz.a(this.a.l);
                            if (ct.a()) {
                                ct.a("SQControllerManager.checkSumToSyncDataWithServer()  server=" + this.T + ", client=" + a);
                            }
                            boolean b;
                            if (this.T > -1L && this.T != a) {
                                this.T = -1L;
                                this.l.c();
                                ks.a().t();
                                b = true;
                            }
                            else {
                                b = false;
                            }
                            if (b) {
                                break Label_0435;
                            }
                        }
                        this.e(v);
                    }
                }
                if (this.D) {
                    this.D = false;
                    this.a.e();
                    if (this.a.f()) {
                        if (this.N) {
                            this.d(20);
                        }
                        else {
                            this.d(10);
                        }
                    }
                }
                else if (this.S && this.a.f()) {
                    if (this.N) {
                        this.d(20);
                    }
                    else {
                        this.d(10);
                    }
                }
                this.t();
                return;
            }
            case 0: {
                this.e();
                return;
            }
            case 11: {
                if (this.a.h > 0) {
                    this.d(5);
                    return;
                }
                this.d(3);
                return;
            }
            case 10: {
                this.d(0);
                return;
            }
            case 7: {
                this.d(8);
                if (oq.o == 1 && this.V) {
                    break;
                }
                this.V = true;
                if (this.h == 0 || !this.k) {
                    this.b.b(this.h, this.i, this.j);
                    return;
                }
                break;
            }
            case 1: {
                this.t();
                if (this.b.f.m() || this.d != 1) {
                    break;
                }
                ct.a("getAreaScoreFromSwapNode");
                this.a.j = 0;
                final int a2 = this.a.k.a;
                final int b2 = this.a.k.b;
                final int n2;
                final boolean b3 = ((n2 = this.a.k.e[0]) & 0xFF) >= 3;
                final int n3;
                final boolean b4 = ((n3 = this.a.k.e[1]) & 0xFF) >= 3;
                if (b3 || b4) {
                    this.a(a2, b2, n2, n3, true, 0);
                }
                final int c = this.a.k.c;
                final int d2 = this.a.k.d;
                final int n4;
                final boolean b5 = ((n4 = this.a.k.e[2]) & 0xFF) >= 3;
                final int n5;
                final boolean b6 = ((n5 = this.a.k.e[3]) & 0xFF) >= 3;
                if (b5 || b6) {
                    this.a(c, d2, n4, n5, true, 0);
                }
                if (this.a.j > 0) {
                    this.d(3);
                    break;
                }
                this.U = false;
                this.d(2);
                return;
            }
            case 2: {
                this.d(15);
                return;
            }
            case 8: {
                this.d();
                this.t();
                return;
            }
            case 3: {
                this.d(4);
                return;
            }
            case 4: {
                this.d(5);
                return;
            }
            case 5: {
                this.d(3);
                break;
            }
        }
    }
    
    protected abstract void c();
    
    protected abstract void d();
    
    protected abstract void e();
    
    protected final void a(final nq nq, final boolean b) {
        switch (nq.C) {
            case 2: {
                this.a.a(false);
                this.a.e = false;
                this.a.a = true;
                this.a.f = false;
                break;
            }
            case 1: {
                this.a.a(true);
                this.a.e = false;
                this.a.a = false;
                this.a.f = false;
                break;
            }
            case 3: {
                this.a.a(false);
                this.a.e = true;
                this.a.a = false;
                this.a.f = false;
                break;
            }
            case 4: {
                this.a.a(false);
                this.a.e = false;
                this.a.a = false;
                this.a.f = true;
                break;
            }
            default: {
                this.a.a(false);
                this.a.e = false;
                this.a.a = false;
                this.a.f = false;
                break;
            }
        }
        if (b) {
            this.a.d = this.a.a(this.a(nq.a), 0).p();
        }
    }
    
    protected final void d(int d) {
    Label_1199:
        while (true) {
            if (ct.a()) {
                ct.a("SQControllerManager.changeState(" + d + "): keepTimerNextTurn=" + this.q);
            }
            this.b.f();
            if (oq.o != 1) {
                this.b.g();
            }
            if (d != 1 && d != 2 && d != 7 && d != 8) {
                if (!this.q) {
                    this.b.e.b();
                }
                this.q = false;
            }
            switch (d) {
                case 7: {
                    this.s = true;
                    this.a.b(false);
                    final int h = this.h;
                    if (this.E) {
                        this.h = 0;
                    }
                    else {
                        this.h = 1;
                    }
                    if (this.B <= 0) {
                        this.B = 0;
                    }
                    else {
                        if (this.B > 0 || this.C > 0) {
                            this.b.a(this.h, this.B, 6, 6);
                        }
                        this.C = this.B;
                        final mq mq = this;
                        --mq.B;
                    }
                    for (int i = 0; i < 2; ++i) {
                        final lg a;
                        final boolean e = (a = this.a.a(i, 0)).e();
                        final boolean g = a.g();
                        final boolean h2 = a.h();
                        final boolean j = a.i();
                        final boolean f = a.f();
                        a.s();
                        if (e && !a.e()) {
                            this.b.a(i, 1, true);
                        }
                        if (g && !a.g()) {
                            this.b.a(i, 0, true);
                        }
                        if (h2 && !a.h()) {
                            this.b.a(i, 2, true);
                        }
                        if (j && !a.i()) {
                            this.b.a(i, 1, false);
                        }
                        if (f && !a.f()) {
                            this.b.a(i, 1, false);
                        }
                        this.b.b(i);
                    }
                    for (int k = 0; k < this.A.length; ++k) {
                        this.A[k] = 0;
                    }
                    this.b.b.d(this.h);
                    this.b.a(false);
                    if (this.a.a(this.h, 0).b()) {
                        this.z = 15;
                        break Label_1199;
                    }
                    if (h != this.h) {
                        this.z = 5;
                        break Label_1199;
                    }
                    break Label_1199;
                }
                case 8: {
                    this.a.d = false;
                    if (this.h != 0) {
                        break Label_1199;
                    }
                    this.b.e.a();
                    if (this.Q != null) {
                        this.Q.r();
                        break Label_1199;
                    }
                    break Label_1199;
                }
                case 3: {
                    if (this.a.j <= 0) {
                        if (this.a.o != null) {
                            this.S = true;
                        }
                        final mq mq2 = this;
                        d = 15;
//                        this = mq2;
                        continue;
                    }
                    this.z = 0;
                    this.a(this.a.l);
                    break Label_1199;
                }
                default: {
                    break Label_1199;
                }
                case 20: {
                    this.z = 20;
                    this.N = false;
                    this.b.j();
                    break Label_1199;
                }
                case 19: {
                    this.z = 15;
                    break Label_1199;
                }
                case 15: {
                    this.b.a(true);
                    this.b.f();
                    if (oq.o != 1) {
                        this.b.g();
                    }
                    ag.b().e(241205);
                    break Label_1199;
                }
                case 16: {
                    this.z = 15;
                    break Label_1199;
                }
                case 9: {
                    this.z = 30;
                    this.b.a(true);
                    break Label_1199;
                }
                case 0: {
                    this.b.a(true);
                    final mq mq3 = this;
                    this.b.i();
                    mq3.z = 26;
                    break Label_1199;
                }
                case 10: {
                    this.b.a(true);
                    this.z = this.b.h();
                    break Label_1199;
                }
                case 1: {
                    this.b.a(this.a.k.a, this.a.k.b, this.a.k.c, this.a.k.d, this.a.b(this.a.k.a, this.a.k.b), this.a.b(this.a.k.c, this.a.k.d));
                    this.z = 10;
                    this.a.a(this.a.k.a, this.a.k.b, this.a.k.c, this.a.k.d);
                    this.a.b(false);
                    break Label_1199;
                }
                case 2: {
                    final mq mq4;
                    (mq4 = this).b.a(mq4.a.k.a, mq4.a.k.b, mq4.a.k.c, mq4.a.k.d, mq4.a.b(mq4.a.k.a, mq4.a.k.b), mq4.a.b(mq4.a.k.c, mq4.a.k.d));
                    mq4.a.a(mq4.a.k.a, mq4.a.k.b, mq4.a.k.c, mq4.a.k.d);
                    mq4.z = 10;
                    break Label_1199;
                }
                case 4: {
                    this.r();
                    break Label_1199;
                }
                case 5: {
                    this.s();
                    break Label_1199;
                }
                case 11: {
                    this.a(this.r, this.H, this.J, this.K, this.L, this.M);
                    break Label_1199;
                }
            }
        }
        this.d = d;
    }
    
    private void a(final nj[][] array) {
        if (oq.n == 1) {
            final mw[] array2 = new mw[this.a.j];
            System.arraycopy(this.a.i, 0, array2, 0, this.a.j);
            final mw[] array3 = array2;
            this.X.a();
            if (array3.length != 0) {
                ct.a("=============================================checkMixing======================================" + array3.length);
                final a a = new a(5);
                final a a2 = new a(5);
                for (int i = 0; i < array3.length; ++i) {
                    if (array3[i].d == 1 && array3[i].g == 1) {
                        this.X.a(array3[i]);
                    }
                    else if (array3[i].d >= 3) {
                        a.a(array3[i]);
                    }
                    else {
                        a2.a(array3[i]);
                    }
                }
                a(a, true);
                a(a2, false);
                if (a.d() == 0 || a2.d() == 0) {
                    for (int j = 0; j < a.d(); ++j) {
                        this.a((mw)a.b(j));
                        this.X.a(a.b(j));
                    }
                    for (int k = 0; k < a2.d(); ++k) {
                        this.a((mw)a2.b(k));
                        this.X.a(a2.b(k));
                    }
                }
                else {
                    this.a(a, a2);
                }
            }
        }
        final int l = this.a.j;
        this.a(array, l);
        this.b(array, l);
        final int[] array4 = new int[100];
        for (int n = 0; n < this.a.j; ++n) {
            final mw mw = this.a.i[n];
            final int a3;
            if ((a3 = this.b.a(mw, this.h)) > this.z) {
                this.z = a3;
            }
            if (mw.a.d < 70) {
                final int n2 = this.A[mw.a.d] + 1;
                if (mw.d != 1 || mw.g != 1) {
                    final int[] array5 = array4;
                    final byte d = mw.a.d;
                    ++array5[d];
                    if (n2 > 1) {
                        if (mw.d < 3) {
                            this.b.c(n2, mw.e, mw.f, mw.g, mw.d);
                        }
                        else if (mw.g < 3) {
                            this.b.c(n2, mw.b, mw.c, mw.g, mw.d);
                        }
                        else {
                            this.b.c(n2, mw.e, mw.f, mw.g, mw.d);
                            this.b.c(n2, mw.b, mw.c, mw.g, mw.d);
                        }
                    }
                }
            }
        }
        if (oq.n == 1) {
            for (int n3 = 0; n3 < this.X.d(); ++n3) {
                final mw mw2;
                if ((mw2 = (mw)this.X.b(n3)).a.e < 64) {
                    if ((mw2.g >= 3 && mw2.d >= 3) || mw2.g >= 5 || mw2.d >= 5) {
                        final byte b = mr.y[mw2.a.d];
                        this.a.a(mw2.i, mw2.h, b);
                        this.b.a(mw2.i, mw2.h, nj.a(b), 0);
                    }
                    else if (mw2.g >= 4 || mw2.d >= 4) {
                        final byte b2 = mr.x[mw2.a.d];
                        this.a.a(mw2.i, mw2.h, b2);
                        this.b.a(mw2.i, mw2.h, nj.a(b2), 0);
                    }
                }
            }
        }
        for (int n4 = 0; n4 < 100; ++n4) {
            if (array4[n4] > 0) {
                final int[] a4 = this.A;
                final int n5 = n4;
                ++a4[n5];
            }
        }
    }
    
    private void a(final nj[][] array, final int n) {
        for (int i = 0; i < n; ++i) {
            final mw mw;
            if ((mw = this.a.i[i]).d == 1 && mw.g == 1) {
                for (int j = mw.c + mw.d - 1; j >= mw.c; --j) {
                    if (array[mw.b][j].f > 1) {
                        this.a(mw.b, j, -16777215, 1, mw.k, mw.j);
                    }
                    array[mw.b][j] = nj.a;
                }
            }
            else if (mw.d < 3) {
                for (int k = mw.e + mw.g - 1; k >= mw.e; --k) {
                    if (array[k][mw.f].f > 1) {
                        this.a(k, mw.f, -16777215, 1, mw.k, mw.j);
                    }
                    array[k][mw.f] = nj.a;
                }
            }
            else if (mw.g < 3) {
                for (int l = mw.c + mw.d - 1; l >= mw.c; --l) {
                    if (array[mw.b][l].f > 1) {
                        this.a(mw.b, l, -16777215, 1, mw.k, mw.j);
                    }
                    array[mw.b][l] = nj.a;
                }
            }
            else {
                for (int n2 = mw.c + mw.d - 1; n2 >= mw.c; --n2) {
                    if (array[mw.b][n2].f > 1) {
                        this.a(mw.b, n2, -16777215, 1, mw.k, mw.j);
                    }
                    array[mw.b][n2] = nj.a;
                }
                for (int n3 = mw.e + mw.g - 1; n3 >= mw.e; --n3) {
                    if (array[n3][mw.f].f > 1) {
                        this.a(n3, mw.f, -16777215, 1, mw.k, mw.j);
                    }
                    array[n3][mw.f] = nj.a;
                }
            }
        }
    }
    
    private void b(final nj[][] array, int i) {
        mw mw;
        int n;
        int j;
        int n2;
        int n3;
        int[] o;
        int k;
        int b;
        int n4;
        int l;
        int n5;
        int c;
        for (i = i; i < this.a.j; ++i) {
            switch ((mw = this.a.i[i]).a.f) {
                case 2: {
                    for (n = 0; n < 8; ++n) {
                        n2 = mw.b + mq.O[n];
                        n3 = mw.c + mq.P[n];
                        if (array[n2][n3].d < 90) {
                            this.a(n2, n3, -16777215, 1, mw.k, mw.j);
                            array[n2][n3] = nj.a;
                        }
                    }
                    break;
                }
                case 4: {
                    for (k = 2; k <= 10; ++k) {
                        b = mw.b;
                        n4 = k;
                        if (array[b][n4].d < 90) {
                            this.a(b, n4, -16777215, 1, mw.k, mw.j);
                            array[b][n4] = nj.a;
                        }
                    }
                    for (l = 2; l <= 10; ++l) {
                        n5 = l;
                        c = mw.c;
                        if (array[n5][c].d < 90) {
                            this.a(n5, c, -16777215, 1, mw.k, mw.j);
                            array[n5][c] = nj.a;
                        }
                    }
                    break;
                }
            }
            array[mw.b][mw.c] = nj.a;
        }
    }
    
    private void r() {
        ct.a(" dropAllRows ");
        this.a.h = 0;
        final nj[][] l = this.a.l;
        final int[] array = new int[12];
        final int[] array2 = new int[12];
        for (int i = 2; i < 10; ++i) {
            array[i] = 9;
        }
        int n = 0;
        for (int j = 2; j < 10; ++j) {
            boolean b = false;
            for (int k = 9; k >= 2; --k) {
                if ((l[k][j].e & 0xFF) != 0x0) {
                    if (k != array[j]) {
                        this.a.p[this.a.h++] = (array[j] << 8 | j);
                        l[array[j]][j] = l[k][j];
                        l[k][j] = nj.a;
                        this.b.a(k, j, array[j], j, l[array[j]][j], array2[j] + n);
                        final int[] array3 = array2;
                        final int n2 = j;
                        ++array3[n2];
                        b = true;
                    }
                    final int[] array4 = array;
                    final int n3 = j;
                    --array4[n3];
                }
            }
            if (b) {
                ++n;
            }
        }
        int n4 = 0;
        for (int n5 = 2; n5 < 10; ++n5) {
            int n6 = 0;
            if (array[n5] >= 2) {
                for (int n7 = array[n5]; n7 >= 2; --n7) {
                    this.a.p[this.a.h++] = (n7 << 8 | n5);
                    final ms a = this.a;
                    final int n8 = n7;
                    final int n9 = n5;
                    final int n10 = n8;
                    final ms ms = a;
                    if (a.m == null || ms.n >= ms.m.length) {
                        ms.d();
                    }
                    ms.l[n10][n9] = nj.a(ms.m[ms.n++]);
                    this.b.a(n6, n5, n7, n5, l[n7][n5], array2[n5] + n4);
                    final int[] array5 = array2;
                    final int n11 = n5;
                    ++array5[n11];
                    --n6;
                    this.z = 10;
                }
                ++n4;
            }
        }
    }
    
    private void s() {
        this.a.j = 0;
        for (int i = 0; i < this.a.h; ++i) {
            final int n = this.a.p[i] >> 8 & 0xFF;
            final int n2 = this.a.p[i] & 0xFF;
            final int a;
            final boolean b = ((a = a(this.a.l, n, n2)) & 0xFF) >= 3;
            final int b3;
            final boolean b2 = ((b3 = b(this.a.l, n, n2)) & 0xFF) >= 3;
            if (b || b2) {
                this.a(n, n2, a, b3, true, 0);
            }
        }
        this.a.h = 0;
    }
    
    private static int a(final nj[][] array, final int n, final int n2) {
        int n3;
        int n4;
        int e;
        for (n3 = 1, n4 = 1, e = array[n][n2].e; (e & array[n][n2 - n4].e) != 0x0; ++n4, ++n3) {}
        final int n5 = 0xFF000000 | (n4 - 1 & 0xFF) << 16;
        int n6;
        for (n6 = 1; (e & array[n][n2 + n6].e) != 0x0; ++n6, ++n3) {}
        return n5 | (n6 - 1 & 0xFF) << 8 | (n3 & 0xFF);
    }
    
    private static int b(final nj[][] array, final int n, final int n2) {
        int n3;
        int n4;
        int e;
        for (n3 = 1, n4 = 1, e = array[n][n2].e; (e & array[n - n4][n2].e) != 0x0; ++n4, ++n3) {}
        final int n5 = 0x0 | (n4 - 1 & 0xFF) << 16;
        int n6;
        for (n6 = 1; (e & array[n + n6][n2].e) != 0x0; ++n6, ++n3) {}
        return n5 | (n6 - 1 & 0xFF) << 8 | (n3 & 0xFF);
    }
    
    public abstract void b(final int p0);
    
    public abstract void c(final int p0);
    
    public abstract void a(final int p0, final int p1);
    
    public abstract void b(final int p0, final int p1);
    
    public abstract void c(final int p0, final int p1);
    
    public final k k() {
        return this.b.a.a;
    }
    
    public final boolean a(final int n, final int n2, final int c, final int d, final boolean b) {
        final my a = this.a(this.a, n, n2, c, d);
        this.a.k = a;
        if (this.a.k == null) {
            this.a.k = new my();
            this.a.k.b = n2;
            this.a.k.a = n;
            this.a.k.d = d;
            this.a.k.c = c;
        }
        this.F = n;
        this.G = n2;
        this.d(1);
        return a != null;
    }
    
    public final my a(final ms ms, final int a, final int b, final int c, final int d) {
        try {
            if (ms.l[a][b] == ms.l[c][d]) {
                return null;
            }
            ms.a(ms.l, a, b, c, d);
            boolean b2 = false;
            final int a2 = a(ms.l, a, b);
            final int b3 = b(ms.l, a, b);
            final int a3 = a(ms.l, c, d);
            final int b4 = b(ms.l, c, d);
            if ((a2 & 0xFF) >= 3 || (b3 & 0xFF) >= 3 || (a3 & 0xFF) >= 3 || (b4 & 0xFF) >= 3) {
                b2 = true;
            }
            ms.a(ms.l, a, b, c, d);
            if (b2) {
                final int[] e = { a2, b3, a3, b4 };
                final my my;
                (my = new my()).a = a;
                my.b = b;
                my.c = c;
                my.d = d;
                my.e = e;
                return my;
            }
        }
        catch (final Exception ex) {
//            final Throwable t;
            ex.printStackTrace();
        }
        return null;
    }
    
    public final void l() {
        if (!this.f || this.b.f.m() || this.d != 8) {
            return;
        }
        if (this.a.b()) {
            this.a.b(false);
            this.b.a(0, this.i, this.j);
            return;
        }
        final nj[][] l = this.a.l;
        final int i = this.i;
        final int j = this.j;
        this.a.b(true);
        this.b.a(this.i, this.j);
        this.b.f();
        this.h(this.i, this.j);
    }
    
    public final void g(final int i, final int j) {
        this.i = i;
        this.j = j;
        this.a.b(false);
        this.h(i, j);
        this.b.a(0, this.i, this.j);
    }
    
    protected final void h(final int n, final int n2) {
        if (!this.k && oq.o != 1 && System.currentTimeMillis() - this.R >= 500L) {
            ks.a().a(n, n2, this.m);
            this.R = System.currentTimeMillis();
        }
    }
    
    public final boolean m() {
        return this.a.b();
    }
    
    public final int n() {
        return this.i;
    }
    
    public final int o() {
        return this.j;
    }
    
    public boolean g() {
        return false;
    }
    
    public boolean h() {
        return false;
    }
    
    public boolean i() {
        return false;
    }
    
    public boolean j() {
        return false;
    }
    
    public boolean a(final int n, final int n2, final int n3, final int n4) {
        return false;
    }
    
    protected final void e(final int n) {
        this.b.a();
        if (this.Q != null) {
            this.b.d.b(this.Q.q[n]);
        }
    }
    
    public final void a(int intValue, final int n, final Object o) {
        final br br = (br)o;
        switch (n) {
            case 11111: {
                final al a;
                (a = ag.b().a("Chú ý", "Bạn muốn thoát khỏi trận đấu", "Có", -1, "Không", -2, 1)).b(15000);
                a.a(this);
                a.c(true);
                a.b(true);
                ag.b().a(a, false);
                break;
            }
            case 11112: {
                if (this.f()) {
                    this.b.a(this);
                    break;
                }
                break;
            }
            case 11113: {
                if (this.f()) {
                    this.b.g.a(this);
                    ag.b().a(this.b.g);
                    break;
                }
                break;
            }
            case 11115: {
                final Object a2;
                if ((a2 = br.a()) != null) {
                    intValue = ((Integer) a2).intValue();
                    this.e(intValue);
                    break;
                }
                break;
            }
        }
        if (this.Q != null) {
            this.Q.q();
        }
    }
    
    public final void d(final int n, final int n2) {
        try {
            switch (n2) {
                case 1009: {
                    com.mg.sq.a.s().a(-241439, false);
                    return;
                }
                case 1008: {
                    this.d(15);
                    ks.a().c(this.b.g.t(), this.m);
                    ++this.m;
                    this.o = 4;
                    com.mg.sq.a.s().a(-241439, false);
                    return;
                }
                case 1000: {
                    if (this.Q != null) {
                        this.Q.a();
                    }
                    return;
                }
                case 1002: {
                    if (this.Q != null) {
                        this.Q.q();
                    }
                    return;
                }
                case 1001: {
                    if (this.Q != null) {
                        this.Q.f(95);
                    }
                    return;
                }
                case 1003: {
                    long u = 0L;
                    if (ag.b().e() instanceof gt) {
                        u = ((gt)ag.b().e()).u();
                    }
                    if (go.s < u) {
                        this.d(-1, 1004);
                        final al a;
                        (a = ag.b().a("Chú ý", "Bạn không đủ KEN để tham gia trận đánh này!", "Đóng", 1006, 1)).a(this);
                        ag.b().a(a, false);
                        return;
                    }
                    com.mg.sq.a.s().a(true, null);
                    return;
                }
                case 1004: {
                    com.mg.sq.a.s().a(false, "Đang đánh quái, đợi tí!");
                    return;
                }
                case -1: {
                    this.d(15);
                    ag.b().a(false);
                    if (oq.o == 9) {
                        this.p();
                        ks.a().g();
                        return;
                    }
                    this.p();
                    ks.a().h();
                    return;
                }
                case -2: {
                    ag.b().a(false);
                    return;
                }
                case -6: {
                    ag.b().a(false);
                    this.g = 1;
                    return;
                }
                case 1006: {
                    ag.b().a(false);
                    return;
                }
                case 999999: {
                    if (this.b.e.d() && oq.o == 0) {
                        return;
                    }
                    this.b.e.b();
                    this.d(15);
                    this.z = 14;
                    if (!this.a.a(this.h, 0).a().O) {
                        final mx b = this.b.b;
                        final int h = this.h;
                        final mx mx = b;
                        if (h == 1) {
                            mx.a[1].e();
                        }
                        else {
                            mx.a[0].e();
                        }
                    }
                    ks.a().b(n, this.m);
                    ++this.m;
                    this.o = 5;
                    return;
                }
                case 1010: {
                    if (this.Q != null) {
                        this.Q.x();
                        break;
                    }
                }
            }
        }
        catch (final Exception ex) {
//            final Throwable t;
            ex.printStackTrace();
        }
    }
    
    protected final void a(final byte[] o) {
        if (o != null) {
            this.N = true;
            this.a.o = o;
        }
    }
    
    protected final void b(final byte[] array) {
        if (array != null) {
            this.a.a(array);
        }
    }
    
    protected void a(final int n, final int n2, final int n3, final int n4, final int n5) {
        ct.a("[SQControllerManager ]=============receiveOpponentSwapChess====================");
        this.b.b(n, n2, n3, n4, n5);
        this.a(n2, n3, n4, n5, false);
    }
    
    protected void a(final boolean e) {
        this.E = e;
        this.D = true;
        if (!this.f) {
            this.b.c.a(0);
            this.f = true;
            if (this.k && !e) {
                try {
                    Thread.sleep(1000L);
                }
                catch (final InterruptedException ex) {
//                    final Throwable t;
                    ex.printStackTrace();
                }
            }
        }
        mp.a().b();
    }
    
    public final void a(final byte[] array, final byte[] array2, final byte[] array3, final lh[] array4, final lh[] array5, final boolean b, final int m) {
        this.o = -1;
        this.w = null;
        this.l.c();
        this.m = m;
        this.a.a(array, array2, array3, array4, array5);
        for (int i = 0; i <= 0; ++i) {
            this.b.b.a(array5[0].s, array5[0].u, array5[0].w, array5[0].b, array5[0].T);
        }
        for (int j = 0; j <= 0; ++j) {
            this.b.b.a(array4[0].s, array4[0].u, array4[0].w, array4[0].b, array4[0].T);
        }
        this.S = true;
        this.a(b);
        if (this.f) {
            this.d(10);
        }
        else {
            this.d(0);
        }
        this.b.c("Lỗi! do mạng quá chậm...");
        this.b.c.a(30);
        this.b.e();
    }
    
    private void a(final int r, final int h, final int n, final byte[] j, final byte[] k, final byte[] l, final byte[] m) {
        ct.a("[SQCOntrollerManager]==========receiveSkillAffect================");
        this.r = r;
        this.H = h;
        this.I = n + 1;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.d(11);
    }
    
    private void a(final int n, int i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        ct.a("[SQCOntrollerManager]=============processSkill=================" + i);
        this.a.j = 0;
        this.a.h = 0;
        final int n2 = (n + 1) % 2;
        final lg a = this.a.a(n, 0);
        int z = 0;
        final lv j = a.i(i);
        boolean b = true;
        if (j == null) {
            this.d(15);
            return;
        }
        switch (i) {
            case 1000: {
                for (i = 0; i < array.length; ++i) {
                    this.a(array[i], array2[i], -16777215, 1, true, 0);
                }
                break;
            }
            case 1001: {
                if (array != null) {
                    for (i = 0; i < array.length; ++i) {
                        this.a.a(array[i], array2[i], 10);
                        this.a.p[this.a.h++] = (array[i] << 8 | (array2[i] & 0xFF));
                    }
                    break;
                }
                break;
            }
            case 1002: {
                this.a.a(n, 0).a(this.I);
                b = false;
                break;
            }
            case 1003:
            case 1005: {
                b = false;
                break;
            }
            case 1006: {
                for (i = 0; i < array.length; ++i) {
                    this.a(array[i], array2[i], -16777215, 1, true, 0);
                }
                break;
            }
            case 1007: {
                for (i = 0; i < array.length; ++i) {
                    this.a(array[i], array2[i], -16777215, 1, true, 0);
                }
                break;
            }
            case 1008: {
                i = 16;
                z = 16;
                final int n3 = array.length / 8;
                int k = 0;
                while (k < array.length) {
                    for (int l = 0; l < n3; ++l) {
                        this.a(array[k], array2[k], -16777215, 1, true, i);
                        ++k;
                    }
                    i -= 2;
                }
                break;
            }
            case 2000: {
                if (array != null) {
                    for (int n4 = 0; n4 < array.length; ++n4) {
                        this.a(array[n4], array2[n4], -16777215, 1, true, 0);
                    }
                    break;
                }
                break;
            }
            case 2001: {
                this.a.a(n, 0).c(this.I);
                b = false;
                break;
            }
            case 2002: {
                this.a.a(n, 0).d(this.I);
                b = false;
                break;
            }
            case 2003: {
                if (array != null) {
                    for (int n5 = 0; n5 < array.length; ++n5) {
                        this.a(array[n5], array2[n5], -16777215, 1, true, 0);
                    }
                    break;
                }
                break;
            }
            case 2004: {
                this.a.a(n2, 0).e(this.I);
            }
            case 2005: {
                b = false;
                break;
            }
            case 2006: {
                if (array != null) {
                    for (int n6 = 0; n6 < array3.length; ++n6) {
                        byte b2;
                        for (i = n6 + 1; i < array3.length; ++i) {
                            if (array3[i] < array3[n6]) {
                                b2 = array3[i];
                                array3[i] = array3[n6];
                                array3[n6] = b2;
                            }
                        }
                    }
                    if (n == 0) {
                        for (int n7 = 0; n7 < array3.length; ++n7) {
                            i = -2;
                            if (n7 == 1) {
                                i = 0;
                            }
                            for (int n8 = 2; n8 < 10; ++n8) {
                                this.a(array3[n7], n8, -16777215, 1, true, i + n8);
                            }
                        }
                    }
                    else {
                        for (int n9 = 0; n9 < array3.length; ++n9) {
                            i = 9;
                            if (n9 == 1) {
                                i = 11;
                            }
                            for (int n10 = 9; n10 >= 2; --n10) {
                                this.a(array3[n9], n10, -16777215, 1, true, i - n10);
                            }
                        }
                    }
                }
                b = false;
                break;
            }
            case 2007: {
                if (array != null) {
                    for (int n11 = 0; n11 < array.length; ++n11) {
                        this.a(array[n11], array2[n11], -16777215, 1, true, 0);
                    }
                    break;
                }
                break;
            }
            case 2008: {
                if (array != null) {
                    for (int n12 = 0; n12 < array.length; ++n12) {
                        this.a(array[n12], array2[n12], -16777215, 1, true, 0);
                    }
                    break;
                }
                break;
            }
            case 4000: {
                if (array != null) {
                    for (int n13 = 0; n13 < array.length; ++n13) {
                        this.a(array[n13], array2[n13], -16777215, 1, true, 0);
                    }
                    break;
                }
                break;
            }
            case 4001: {
                b = false;
                break;
            }
            case 4002: {
                this.a.a(n2, 0).b(this.I);
                b = false;
                break;
            }
            case 4004:
            case 4005: {
                b = false;
                break;
            }
            case 4006: {
                if (array != null) {
                    for (int n14 = 0; n14 < array.length; ++n14) {
                        this.a(array[n14], array2[n14], -16777215, 1, true, 0);
                    }
                    break;
                }
                break;
            }
            case 4007: {
                if (array != null) {
                    for (int n15 = 0; n15 < array.length; ++n15) {
                        this.a(array[n15], array2[n15], -16777215, 1, true, 0);
                    }
                    break;
                }
                break;
            }
            case 4008: {
                if (array != null) {
                    for (int n16 = 0; n16 < array.length; ++n16) {
                        this.a(array[n16], array2[n16], -16777215, 1, true, 0);
                    }
                    break;
                }
                break;
            }
        }
        final mx b3 = this.b.b;
        final boolean b4 = b;
        final mx mx = b3;
        if (n == 1) {
            mx.a[1].a(b4);
        }
        else {
            mx.a[0].a(b4);
        }
        this.z = this.b.a(j, array, array2, array3, array4, n);
        if (this.z < z) {
            this.z = z;
        }
        this.z += 10;
    }
    
    protected final void p() {
        ks.a().a((kp)null);
        if (this.Q != null) {
            this.Q.t();
        }
    }
    
    protected void a(final int g, final int n, final int t, final int o, final int s, final int[] p9, final int[] q, final ll[] u, final lm[] v) {
        this.g = g;
        hs.n = ((g == 1) ? (n - t) : 0);
        hs.o = o;
        hs.p = p9;
        hs.q = q;
        hs.r = (g == 1);
        hs.s = s;
        hs.t = t;
        go.u = u;
        go.v = v;
        this.d(9);
    }
    
    private void f(final int g) {
        this.a.g = g;
        np.a = g * 1000;
    }
    
    public final void a(final int g) {
        ct.a("[SQCOntrollerManager] receiveCancelGame  " + g);
        if (g < 0) {
            this.g = g;
            final al a;
            (a = ag.b().a("", "Kết quả trận đấu hòa!!! Lỗi mất kết nối do đường truyền mạng...", "Đóng", 1006, 1)).a(this);
            ag.b().a(a);
            this.d(9);
            this.D = false;
        }
    }
    
    public void a(final String s, String s2) {
        final mt b = this.b;
        s2 = s2;
        b.b(s2);
    }
    
    public void a() {
        this.b.k();
    }
    
    protected void e(final int n, final int n2) {
        if (n2 == 199000009 || n2 == 199000059) {
            this.b.b(n, 1);
        }
        else if (n2 == 199000019 || n2 == 199000069) {
            this.b.b(n, 2);
        }
        else if (n2 == 199000079) {
            this.b.b(n, 3);
        }
        this.d(19);
    }
    
    public final void a(final lh lh, final String s, final long n, final String s2, final boolean b, final boolean b2) {
        if (this.d == 16 || !this.k) {
            com.mg.sq.a.s().a(false, null);
            return;
        }
        final al a;
        (a = com.mg.sq.a.a(lh, 1003, 1004, this, n, s2, b, b2)).c(true);
        a.b(true);
    }
    
    private static void a(final a a, final boolean b) {
        for (int i = 1; i < a.d(); ++i) {
            int j = i;
            mw mw = (mw)a.b(j - 1);
            mw mw2 = (mw)a.b(j);
            while (j > 0) {
                if (b) {
                    if (mw.d >= mw2.d) {
                        break;
                    }
                }
                else if (mw.g >= mw2.g) {
                    break;
                }
                a.a(j - 1, j);
                if (--j > 0) {
                    mw = (mw)a.b(j - 1);
                    mw2 = (mw)a.b(j);
                }
            }
        }
        for (int k = a.d() - 1; k > 0; --k) {
            final mw mw3 = (mw)a.b(k - 1);
            final mw mw4 = (mw)a.b(k);
            if (b) {
                if (mw3.d == mw4.d && mw3.c == mw4.c) {
                    if (mw3.h < mw4.h) {
                        a.a(k);
                    }
                    else {
                        a.a(k - 1);
                    }
                }
            }
            else if (mw3.g == mw4.g && mw3.e == mw4.e) {
                if (mw3.i < mw4.i) {
                    a.a(k);
                }
                else {
                    a.a(k - 1);
                }
            }
        }
    }
    
    private void a(final a a, final a a2) {
        for (int i = 0, d = a.d(); i < d; ++i) {
            mw mw = (mw)a.b(i);
            for (int j = 0; j < a2.d(); ++j) {
                final mw mw2 = (mw)a2.b(j);
                final mw mw3 = mw;
                final mw mw4 = mw2;
                final mw mw5 = mw3;
                final int n = mw4.f - mw5.c;
                final int n2 = mw4.f - (mw5.c + mw5.d - 1);
                final int n3 = mw5.b - mw4.e;
                final int n4 = mw5.b - (mw4.e + mw4.g - 1);
                mw mw7;
                mw mw6;
                if (mw5.a.e != mw4.a.e || n < 0 || n2 > 0 || n3 < 0 || n4 > 0) {
                    mw6 = (mw7 = null);
                }
                else {
                    final mw mw8;
                    (mw8 = new mw()).c = mw5.c;
                    mw8.b = mw5.b;
                    mw8.d = mw5.d;
                    mw8.f = mw4.f;
                    mw8.e = mw4.e;
                    mw8.g = mw4.g;
                    mw8.i = mw5.b;
                    mw8.h = mw4.f;
                    mw8.a = mw5.a;
                    mw6 = (mw7 = mw8);
                }
                final mw mw9 = mw7;
                if (mw6 != null) {
                    this.X.a(mw9);
                    a.a(i);
                    a2.a(j);
                    --d;
                    --i;
                    mw = null;
                    break;
                }
            }
            if (mw != null) {
                this.a(mw);
            }
        }
        for (int k = 0; k < a2.d(); ++k) {
            this.a((mw)a2.b(k));
        }
    }
    
    private void a(final mw mw) {
        if (mw.d < 3 || mw.g < 3) {
            if (mw.d > 3) {
                mw.h = mw.c + (mw.d - 1 >> 1);
            }
            else if (mw.g > 3) {
                mw.i = mw.e + (mw.g - 1 >> 1);
            }
        }
        this.X.a(mw);
    }
    
    public void a(final nq nq) {
        this.l.a(nq);
        if (nq.b >= 0) {
            this.n = nq.b;
        }
    }
    
    private void d(final nq v) {
        ct.a("[SQControllerManager ]================processUseItem=================  turnModel.owner = " + v.a + "   rv = " + v.b);
        if (oq.o == 1) {
            ag.b().e(15000);
            if (this.a.b()) {
                this.a.b(false);
                this.b.a(0, this.i, this.j);
            }
        }
        this.a(v, true);
        if (v.g != null) {
            for (int i = 0; i < v.g.length; ++i) {
                this.b(v.g[i]);
            }
        }
        this.a(v.h);
        this.e(this.a(v.a), v.e);
        this.v = v;
        this.b.e();
        this.m = v.b;
    }
    
    private void e(final nq nq) {
        this.o = -1;
        if (nq.E) {
            this.u = true;
            this.D = false;
            return;
        }
        this.a(nq.d);
        this.d(7);
    }
    
    protected void c(final nq v) {
        if (ct.a()) {
            ct.a("SQControlManager.processSwapChess(): " + v);
        }
        this.a(v, true);
        if (v.g != null) {
            for (int i = 0; i < v.g.length; ++i) {
                this.b(v.g[i]);
            }
        }
        this.a(v.h);
        if (this.a(v.a) == 1) {
            this.a(1, v.j, v.k, v.l, v.m);
        }
        this.v = v;
        this.b.e();
        this.m = v.b;
    }
    
    protected boolean b(final nq nq) {
        return false;
    }
    
    private void t() {
        final mx b;
        if (!(b = this.b.b).a[0].f() || !b.a[1].f()) {
            return;
        }
        final Object b2;
        if (this.v == null && !this.l.a() && (b2 = this.l.b()) != null) {
            final nq nq = (nq)b2;
            if (this.b(nq)) {
                return;
            }
            if (oq.o == 1 && this.a(nq.a) != 0) {
                this.f(oq.p);
                final mx b3;
                (b3 = this.b.b).c.b();
                b3.c.a();
            }
            switch (nq.c) {
                case 5: {
                    this.T = nq.i;
                    final nq v = nq;
                    ct.a("[SQControllerManager ]=============processUsingSkill   turnModel==== " + v.a + "  rv = " + v.b);
                    if (oq.o == 1) {
                        ag.b().e(15000);
                        if (this.a.b()) {
                            this.a.b(false);
                            this.b.a(0, this.i, this.j);
                        }
                    }
                    this.a(v, true);
                    if (v.g != null) {
                        for (int i = 0; i < v.g.length; ++i) {
                            this.b(v.g[i]);
                        }
                    }
                    this.a(v.h);
                    this.a(this.a(v.a), v.n, v.r, v.s, v.o, v.q, v.p);
                    this.v = v;
                    this.b.e();
                    this.m = v.b;
                    return;
                }
                case 3: {
                    this.T = nq.i;
                    this.c(nq);
                    return;
                }
                case 2: {
                    final nq nq2 = nq;
                    ct.a("[SQControllerManager ]========processUpdateMatch=========== rv = " + nq2.b);
                    this.a(nq2.a, nq2.f);
                    this.m = nq2.b;
                    this.e(nq2);
                    this.b.e();
                    return;
                }
                case 4: {
                    this.T = nq.i;
                    this.d(nq);
                    return;
                }
                case 6: {
                    final nq nq3 = nq;
                    ct.a("[SQControllerManager ]========processAttack=========== rv = " + nq3.b);
                    if (oq.o == 1) {
                        ag.b().e(15000);
                        if (this.a.b()) {
                            this.a.b(false);
                            this.b.a(0, this.i, this.j);
                        }
                    }
                    this.a(nq3, false);
                    this.a(nq3.a, nq3.f);
                    final int a = this.a(nq3.a);
                    this.z = 10;
                    this.b.a((a != 1) ? 1 : 0, 14, 4, true);
                    com.mg.sq.a.s().a(-241439, false);
                    this.m = nq3.b;
                    this.e(nq3);
                    this.b.e();
                    return;
                }
                case 8: {
                    final nq nq4 = nq;
                    this.b.b(true);
                    com.mg.sq.a.s().l();
                    this.a(nq4.t, nq4.u, nq4.v, nq4.w, nq4.x, nq4.y, nq4.z, nq4.A, nq4.B);
                    return;
                }
                case 1: {
                    this.f(nq.k, nq.j);
                    return;
                }
                case 0: {
                    final nq nq5 = nq;
                    this.m = nq5.b;
                    this.e(nq5);
                    break;
                }
            }
        }
    }
    
    protected final nq a(final String a, final int j, final int k, final int l, final int m, final int n) {
        final nq nq;
        (nq = new nq(n, (byte)3)).a = a;
        nq.d = true;
        nq.i = this.p;
        nq.j = j;
        nq.k = k;
        nq.l = l;
        nq.m = m;
        return nq;
    }
    
    protected void f(final int g, final int f) {
        this.b.a(this.h, this.F, this.G, f, g);
        this.F = f;
        this.G = g;
        if (oq.o == 9 && this.s) {
            this.s = false;
            this.b.b(true);
        }
    }
    
    private int a(final String s) {
        for (int i = 0; i < this.a.a().length; ++i) {
            for (int j = 0; j < this.a.a()[i].length; ++j) {
                if (s.equals(this.a.a(i, j).j())) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    public final void q() {
        this.l = null;
        this.Q = null;
        this.b = null;
        this.a = null;
        this.M = null;
        this.K = null;
        this.c = null;
        this.A = null;
        this.L = null;
        this.J = null;
    }
}
