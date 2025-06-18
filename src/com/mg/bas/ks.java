package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.io.SocketConnection;

public final class ks
implements Runnable,
kn {
    private short k;
    private static ks l = null;
    private static final Object m = new Object();
    private boolean n;
    private final kr o;
    private SocketConnection p = null;
    private ky q = null;
    private kz r = null;
    private String[] s = null;
    private int t;
    int b = 3;
    private int u = 0;
    private kq v;
    private kp w;
    private ko x;
    String c;
    String d;
    private String y;
    private long z;
    String e;
    String f;
    a g = new a();
    public static int h = 0;
    public static String i;
    public static int j;
    private long A = 0L;
    private int B = 0;

    protected ks() {
        this.s = new String[1];
        this.s[0] = "210.211.116.157";
        this.t = 1238;
        this.y = System.getProperty("microedition.platform");
        if (this.y == null || this.y.length() == 0) {
            this.y = "OlaJ2ME";
        }
        this.b = 3;
        this.n = false;
        this.o = new kr(16);
        this.k = 1;
        this.z = 0L;
        new Thread(this).start();
    }

    public static ks a() {
        if (l == null) {
            l = new ks();
        }
        return l;
    }

    public final void b() {
        this.k = (short)4;
        l = null;
        this.d(false);
    }

    private static kx a(kw kw2) {
        kx kx2 = new kx();
        block0 : switch (kw2.a) {
            case 3: {
                break;
            }
            case 2: {
                break;
            }
            case 4: {
                kx2.a((short)9, kw2.c);
                kx2.a((short)10, kw2.d);
                kx2.a((short)1, kw2.i);
                kx2.a((short)11, kw2.z);
                kx2.b((short)37, kw2.as);
                break;
            }
            case 5: {
                kx2.b((short)41, kw2.m);
                kx2.a((short)11, "0.18.0");
                kx2.b((short)170, kw2.n);
                if (!kw2.o) break;
                kx2.a((short)254, 1);
                break;
            }
            case 8: {
                kx2.a((short)16, kw2.p);
                kx2.a((short)15, kw2.q);
                int n = 0;
                while (n < kw2.O.length) {
                    kx2.b((short)90, kw2.O[n].a);
                    kx2.b((short)96, kw2.O[n].e.a);
                    ++n;
                }
                break;
            }
            case 9: {
                kx2.a((short)9, kw2.c);
                if (kw2.P >= 0) {
                    kx2.a((short)134, kw2.P);
                }
                if (kw2.ao <= 0) break;
                kx2.b((short)23, kw2.ao);
                break;
            }
            case 30: {
                kx2.a((short)15, kw2.q);
                break;
            }
            case 29: {
                kx2.a((short)9, kw2.c);
                break;
            }
            case 10: {
                kx2.b((short)118, kw2.E);
                kx2.b((short)119, kw2.F);
                kx2.b((short)120, kw2.G);
                kx2.b((short)121, kw2.H);
                break;
            }
            case 27: {
                int n = 0;
                while (n < kw2.I.length) {
                    kx2.b((short)64, kw2.I[n]);
                    kx2.b((short)67, kw2.J[n]);
                    ++n;
                }
                break;
            }
            case 6: {
                kx2.b((short)4, kw2.e);
                if (kw2.f < 0) break;
                kx2.b((short)7, kw2.f);
                break;
            }
            case 11: {
                kx2.a((short)20, kw2.B);
                if (kw2.m == 0) break;
                kx2.b((short)41, kw2.m);
                break;
            }
            case 13: {
                kx2.a((short)20, kw2.B);
                kx2.b((short)21, kw2.D);
                break;
            }
            case 43: {
                kx2.a((short)20, kw2.B);
                break;
            }
            case 12: {
                kx2.a((short)192, kw2.k);
                break;
            }
            case 16: {
                kx2.a((short)9, kw2.c);
                if (kw2.i != null) {
                    kx2.a((short)1, kw2.i);
                }
                if (kw2.L) {
                    kx2.b((short)25, 1);
                }
                if (kw2.ad > 0L) {
                    kx2.a((short)132, kw2.ad);
                }
                if (kw2.ac) {
                    kx2.a((short)141, 1);
                }
                if (kw2.ae) {
                    kx2.a((short)167, 1);
                }
                if (!kw2.af) break;
                kx2.a((short)169, 1);
                break;
            }
            case 17: {
                kx2.a((short)31, kw2.l ? 1 : 0);
                kx2.a((short)28, kw2.y);
                if (i.b(kw2.i)) break;
                kx2.a((short)1, kw2.i);
                break;
            }
            case 23: {
                kx2.a((short)28, kw2.y);
                break;
            }
            case 14: {
                kx2.a((short)28, ks.a().e);
                kx2.b((short)41, kw2.m);
                break;
            }
            case 19: {
                kx2.a((short)28, ks.a().e);
                kx2.b((short)41, kw2.m);
                kx2.b((short)33, kw2.s);
                kx2.b((short)34, kw2.t);
                kx2.b((short)33, kw2.u);
                kx2.b((short)34, kw2.v);
                break;
            }
            case 20: {
                kx2.a((short)28, ks.a().e);
                kx2.b((short)41, kw2.m);
                kx2.b((short)64, kw2.r);
                break;
            }
            case 44: {
                kx2.a((short)28, ks.a().e);
                kx2.b((short)41, kw2.m);
                kx2.b((short)114, kw2.M);
                break;
            }
            case 47: {
                kx2.a((short)28, ks.a().e);
                kx2.b((short)41, kw2.m);
                kx2.b((short)33, kw2.w);
                kx2.b((short)34, kw2.x);
                break;
            }
            case 84: {
                kx2.b((short)114, kw2.M);
                break;
            }
            case 40: {
                kx2.a((short)28, kw2.y);
                break;
            }
            case 25: {
                int n = 0;
                while (n < kw2.j.length) {
                    kx2.a((short)9, kw2.j[n]);
                    ++n;
                }
                kx2.a((short)1, kw2.i);
                break;
            }
            case 32: {
                kx2.a((short)77, kw2.K);
                break;
            }
            case 41: {
                kx2.a((short)77, kw2.K);
                break;
            }
            case 33: {
                kx2.a((short)77, kw2.K);
                break;
            }
            case 42: {
                kx2.a((short)9, kw2.c);
                break;
            }
            case 37: {
                int n = 0;
                while (n < kw2.R.length) {
                    if (kw2.R[n] != null) {
                        kx2.a((short)83, kw2.R[n]);
                    }
                    ++n;
                }
                kx2.a((short)89, kw2.S);
                break;
            }
            case 127: {
                kx2.a((short)191, kw2.N);
                break;
            }
            case 48: {
                kx2.b((short)114, kw2.M);
                kx2.a((short)83, kw2.Q);
                break;
            }
            case 49: {
                kx2.a((short)9, kw2.c);
                kx2.a((short)40, kw2.ab ? (byte)1 : 0);
                break;
            }
            case 55: {
                kx2.a((short)147, kw2.T);
                switch (kw2.T) {
                    case 0: {
                        kx2.a((short)9, kw2.c);
                        break;
                    }
                    case 1: {
                        kx2.a((short)150, kw2.ag);
                        kx2.a((short)31, kw2.l ? 1 : 0);
                        break;
                    }
                    case 4: {
                        kx2.a((short)150, kw2.ag);
                        kx2.a((short)83, kw2.Q);
                        kx2.b((short)106, kw2.g);
                        break;
                    }
                    case 3: {
                        kx2.a((short)150, kw2.ag);
                        kx2.b((short)114, kw2.M);
                        kx2.b((short)106, kw2.g);
                        break;
                    }
                    case 2: {
                        kx2.a((short)150, kw2.ag);
                        kx2.a((short)132, kw2.ah);
                        break;
                    }
                    case 5: {
                        if (kw2.ag == null) break;
                        kx2.a((short)150, kw2.ag);
                        break;
                    }
                    case 6: {
                        kx2.a((short)150, kw2.ag);
                        kx2.b((short)41, j);
                        break;
                    }
                    case 7: {
                        kx2.a((short)150, kw2.ag);
                    }
                }
                break;
            }
            case 56: {
                kx2.a((short)147, kw2.T);
                switch (kw2.T) {
                    case 0: {
                        break;
                    }
                    case 1: {
                        kx2.a((short)152, kw2.U);
                        kx2.b((short)148, kw2.V);
                        break;
                    }
                    case 2: {
                        if (kw2.Z == null) break;
                        int n = 0;
                        while (n < kw2.Z.length) {
                            kx2.b((short)153, kw2.Z[n]);
                            ++n;
                        }
                        break;
                    }
                }
                break;
            }
            case 129: {
                kx2.a((short)147, kw2.T);
                switch (kw2.T) {
                    case 1: {
                        break;
                    }
                    case 2: {
                        kx2.a((short)162, kw2.ai);
                    }
                }
                break;
            }
            case 7: {
                kx2.a((short)147, kw2.T);
                switch (kw2.T) {
                    case 0: {
                        kx2.a((short)165, kw2.aj ? 1 : 0);
                        break;
                    }
                    case 1: {
                        kx2.a((short)166, kw2.aj ? 1 : 0);
                    }
                }
                break;
            }
            case 57: {
                kx2.a((short)147, kw2.ak);
                kx2.a((short)20, kw2.B);
                kx2.b((short)21, kw2.D);
                break;
            }
            case 64: {
                break;
            }
            case 65: {
                kx2.a((short)192, kw2.k);
                break;
            }
            case 18: {
                kx2.a((short)28, kw2.y);
                break;
            }
            case 130: {
                break;
            }
            case 131: {
                kx2.a((short)9, kw2.c);
                kx2.a((short)10, kw2.d);
                kx2.a((short)26, kw2.al);
                kx2.a((short)162, kw2.ai);
                kx2.a((short)179, kw2.am);
                kx2.a((short)177, kw2.an);
                kx2.a((short)16, kw2.p);
                break;
            }
            case 51: {
                kx2.b((short)114, kw2.M);
                break;
            }
            case 83: {
                kx2.b((short)114, kw2.M);
                kx2.b((short)106, kw2.g);
                break;
            }
            case 86: {
                break;
            }
            case 99: {
                break;
            }
            case 100: {
                kx2.a((short)186, kw2.C);
                kx2.a((short)187, kw2.A);
                if (kw2.Q != null) {
                    kx2.a((short)83, kw2.Q);
                }
                if (kw2.M <= 0) break;
                kx2.b((short)114, kw2.M);
                kx2.b((short)106, kw2.g);
                break;
            }
            case 112: {
                if (kw2.Q != null) {
                    kx2.a((short)83, kw2.Q);
                    kx2.a((short)132, kw2.ah);
                    break;
                }
                if (kw2.M > 0) {
                    kx2.b((short)114, kw2.M);
                    kx2.b((short)106, kw2.g);
                    kx2.a((short)132, kw2.ah);
                    break;
                }
                if (kw2.aa == null) break;
                kx2.a((short)175, kw2.aa);
                break;
            }
            case 113: {
                kx2.a((short)175, kw2.aa);
                break;
            }
            case 116: {
                break;
            }
            case 114: {
                switch (kw2.W) {
                    case 0: {
                        break block0;
                    }
                    case 1: {
                        kx2.a((short)152, kw2.U);
                        kx2.b((short)13, kw2.X);
                        kx2.b((short)148, kw2.V);
                        break block0;
                    }
                }
                break;
            }
            case 115: {
                kx2.a((short)175, kw2.aa);
                break;
            }
            case 101: {
                int n;
                kx2.a((short)186, kw2.C);
                if (kw2.R != null) {
                    n = 0;
                    while (n < kw2.R.length) {
                        kx2.a((short)83, kw2.R[n]);
                        ++n;
                    }
                }
                if (kw2.Y != null) {
                    n = 0;
                    while (n < kw2.Y.length) {
                        kx2.b((short)114, kw2.Y[n]);
                        kx2.b((short)106, kw2.h[n]);
                        ++n;
                    }
                }
                if (kw2.ah <= 0L) break;
                kx2.a((short)132, kw2.ah);
                break;
            }
            case 96: {
                kx2.a((short)83, kw2.Q);
                break;
            }
            case 97: {
                kx2.a((short)186, kw2.C);
                kx2.a((short)187, kw2.A);
                if (kw2.Q != null) {
                    kx2.a((short)83, kw2.Q);
                }
                if (kw2.M <= 0) break;
                kx2.b((short)114, kw2.M);
                kx2.b((short)106, kw2.g);
                break;
            }
            case 98: {
                int n;
                kx2.a((short)186, kw2.C);
                if (kw2.R != null) {
                    n = 0;
                    while (n < kw2.R.length) {
                        kx2.a((short)83, kw2.R[n]);
                        ++n;
                    }
                }
                if (kw2.Y != null) {
                    n = 0;
                    while (n < kw2.Y.length) {
                        kx2.b((short)114, kw2.Y[n]);
                        kx2.b((short)106, kw2.h[n]);
                        ++n;
                    }
                }
                if (kw2.ah <= 0L) break;
                kx2.a((short)132, kw2.ah);
                break;
            }
            case 52: {
                kx2.a((short)208, kw2.T);
                break;
            }
            case 132: {
                break;
            }
            case 133: {
                if (kw2.an != null) {
                    kx2.a((short)182, kw2.an);
                }
                kx2.a((short)183, kw2.ar);
                kx2.a((short)185, kw2.ap);
                kx2.a((short)184, kw2.aq);
                break;
            }
            case 0: {
                kx2.a((short)0, kw2.b);
                kx2.a((short)1, kw2.i);
            }
        }
        return kx2;
    }

    private void x() {
        if (this.q != null) {
            this.q.b = this.v;
            this.q.c = this.w;
            this.q.d = this.x;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void y() {
        Object object = m;
        synchronized (object) {
            try {
                m.wait();
            }
            catch (Throwable throwable) {}
            return;
        }
    }

    private void b(kw kw2) {
        this.o.a(kw2);
    }

    private final void a(kw kw2, boolean bl) {
        this.o.a(kw2);
        this.d(true);
    }

    /*
     * Unable to fully structure code
     */
    public final void run() {
        block19: while (!this.n) {
            try {
                switch (this.k) {
                    case 4: {
                        ct.a("[ConnetionHanldle] Disconnecting...");
                        var1_1 = this;
                        var1_1.o.c();
                        var1_1 = this;
                        if (var1_1.q != null) {
                            var1_1.v = null;
                            var1_1.q.b = null;
                            var1_1.w = null;
                            var1_1.q.c = null;
                            var1_1.x = null;
                            var1_1.q.d = null;
                        }
                        try {
                            if (this.q != null) {
                                this.q.a();
                            }
                            if (this.r != null) {
                                this.r.a();
                            }
                            if (this.p != null) {
                                this.p.close();
                            }
                        }
                        catch (Throwable v0) {}
                        this.q = null;
                        this.r = null;
                        this.p = null;
                        this.b = 3;
                        this.n = true;
                        this.k = 0;
                        ct.a(" [ConnetionHanldle] Disconnected!!");
                        return;
                    }
                    case 0: {
                        ks.y();
                        break;
                    }
                    case 1: {
                        var1_1 = this;
                        ct.a("[ConnetionHanldle] Opening connection ...");
                        var2_2 = pd.l();
                        if (var2_2 != null) {
                            var1_1.s = var2_2;
                        }
                        var2_3 = 0;
                        while (var2_3 < var1_1.s.length) {
                            try {
                                var1_1.p = g.a(var1_1.s[var2_3].trim(), var1_1.t);
                                var1_1.q = new ky(var1_1.p.openInputStream());
                                var1_1.r = new kz(var1_1.p.openOutputStream());
                                super.x();
                                var3_5 = var1_1.s[0];
                                var1_1.s[0] = var1_1.s[var2_3];
                                var1_1.s[var2_3] = var3_5;
                                pd.a(var1_1.s);
                                var1_1.k = (short)3;
                                ct.a("[ConnetionHanldle] Connected to " + var1_1.s[0]);
                                break;
                            }
                            catch (SecurityException v1) {
                                var1_1.k = 0;
                                if (var1_1.v != null) {
                                    var1_1.v.a(2, "Thiết bị không cho phép kết nối mạng.");
                                }
                                ct.a("[ConnetionHanldle] Connection FAIL!!!");
                                break;
                            }
                            catch (Throwable v2) {
                                ct.a("[ConnetionHanldle] Connection FAIL!!!");
                                ++var2_3;
                            }
                        }
                        if (var2_3 < var1_1.s.length) continue block19;
                        var1_1.k = 0;
                        if (var1_1.v == null) continue block19;
                        var1_1.v.a(1, "Không thể kết nối với máy chủ.");
                        break;
                    }
                    case 2: {
                        try {
                            ct.a(" [ConnetionHanldle] Changing connection ...");
                            if (this.q != null) {
                                this.q.a();
                            }
                            if (this.r != null) {
                                this.r.a();
                            }
                            if (this.p != null) {
                                this.p.close();
                            }
                            this.q = null;
                            this.r = null;
                            this.p = null;
                            this.p = g.a(this.s[0].trim(), this.t);
                            this.q = new ky(this.p.openInputStream());
                            this.r = new kz(this.p.openOutputStream());
                            this.x();
                            ct.a("[ConnetionHanldle] Change success to " + this.s[0]);
                            pd.a(this.s);
                            this.k = (short)3;
                            var1_1 = new kw(3);
                            new kw(3).c = go.e;
                            this.b((kw)var1_1);
                            if (this.v == null) continue block19;
                            this.v.x();
                            break;
                        }
                        catch (SecurityException v3) {
                            if (this.v != null) {
                                this.v.a(2, (String)null);
                            }
                        }
                        catch (Throwable v4) {
    if (this.v != null) {
        this.v.a(1, (String) null);
    }
    this.k = 0;
    break;
}
                    }
                    case 3: {
                        var1_1 = this;
                        var1_1 = (kw)var1_1.o.b();
                        if (var1_1 != null) {
                            var2_4 = ks.a((kw)var1_1);
                            try {
                                this.r.a(var2_4, var1_1.a);
                            }
                            catch (Throwable v5) {
                                var1_1 = v5;
                                v5.printStackTrace();
                                this.z();
                            }
                            continue block19;
                        }
                        ks.y();
                    }
                }
            }
            catch (Throwable v6) {
                var1_1 = v6;
                v6.printStackTrace();
                this.z();
            }
        }
    }

    private void z() {
        if (this.k == 0) {
            return;
        }
        if (this.v != null) {
            this.v.z();
        }
        this.k = 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void d(boolean bl) {
        if (bl && this.k != 3 && this.k != 2) {
            return;
        }
        try {
            Object object = m;
            synchronized (object) {
                m.notify();
                return;
            }
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public final void a(kq kq2) {
        this.v = kq2;
        if (this.q != null) {
            this.q.b = kq2;
        }
    }

    public final void a(kp kp2) {
        this.w = kp2;
        if (this.q != null) {
            this.q.c = kp2;
        }
    }

    public final void a(ko ko2) {
        this.x = ko2;
        if (this.q != null) {
            this.q.d = ko2;
        }
    }

    public final void c() {
        long l = System.currentTimeMillis();
        if (this.A == 0L) {
            this.A = l;
        } else {
            ++this.B;
            if (this.B >= 100) {
                if (l - this.A <= 3000L && this.v != null) {
                    this.v.W();
                }
                this.B = 0;
                this.A = l;
            }
        }
        if (l - this.z >= 30000L) {
            if (this.b == 0) {
                this.z();
                return;
            }
            --this.b;
            if (this.k == 3) {
                kw kw2 = new kw(1);
                this.b(kw2);
            }
            this.z = l;
            this.d(true);
        }
    }

    public final void a(String object) {
        ct.a((String)object);
        if (object != null) {
            String[] stringArray;
            if (this.v != null) {
                this.v.y();
            }
            int n2 = 0;
            while (n2 < this.s.length) {
                if (((String)object).equals(this.s[n2])) {
                    stringArray = this.s[0];
                    this.s[0] = object;
                    this.s[n2] = stringArray;
                    break;
                }
                ++n2;
            }
            if (n2 >= this.s.length) {
                String[] stringArray2 = new String[this.s.length + 1];
                stringArray = stringArray2;
                stringArray2[0] = object;
                System.arraycopy(this.s, 0, stringArray, 1, this.s.length);
                this.s = stringArray;
            }
            this.k = (short)2;
            this.d(false);
            return;
        }
        if (this.v != null) {
            this.v.x();
        }
        object = this;
        kw kw2 = new kw(3);
        super.b(kw2);
        super.d(true);
    }

    final void a(String string, byte[] byArray, byte[] object) {
        int n2;
        object = new kw(4);
        new kw(4).c = string;
        object.d = byArray;
        object.m = this.u;
        object.z = "0.18.0";
        object.i = System.getProperty("microedition.platform");
        if (string != null) {
            int n3 = 17;
            int n4 = 0;
            while (n4 < string.length()) {
                n3 = n3 * 31 + string.charAt(n4);
                ++n4;
            }
            n2 = n3;
        } else {
            n2 = -1;
        }
        object.as = n2;
        this.b((kw)object);
        this.d(true);
    }

    public final void a(String object, String string, int n2) {
        ks ks2 = this;
        if (ks2.k == 0) {
            ks2.k = 1;
            ks2.d(false);
        }
        this.c = object;
        this.d = string;
        this.u = n2;
        object = new kw(2);
        this.b((kw)object);
        this.d(true);
    }

    public final void a(int n2) {
        kw kw2 = new kw(6);
        new kw(6).e = n2;
        kw2.f = -1;
        this.b(kw2);
        this.d(true);
    }

    public final void a(int n2, int n3) {
        kw kw2 = new kw(6);
        new kw(6).e = n2;
        kw2.f = n3;
        this.b(kw2);
        this.d(true);
    }

    public final void a(int n2, int n3, boolean bl) {
        ct.a("Request installation: resRev=" + n3 + ", offlineResMode=true");
        kw kw2 = new kw(5);
        new kw(5).m = n3;
        kw2.n = n2;
        kw2.o = true;
        this.b(kw2);
        this.d(true);
    }

    public final void a(int n2, int n3, df df2, df df3, df df4) {
        kw kw2 = new kw(8);
        new kw(8).p = (byte)n2;
        kw2.q = (byte)n3;
        kw2.O = new df[3];
        kw2.O[0] = df2;
        kw2.O[1] = df3;
        kw2.O[2] = df4;
        this.b(kw2);
        this.d(true);
    }

    public final void b(String string) {
        kw kw2 = new kw(42);
        new kw(42).c = string;
        this.b(kw2);
        this.d(true);
    }

    public final void a(String[] stringArray) {
        kw kw2 = new kw(37);
        new kw(37).R = stringArray;
        kw2.S = (byte)2;
        this.b(kw2);
        this.d(true);
    }

    public final void b(String[] stringArray) {
        kw kw2 = new kw(37);
        new kw(37).R = stringArray;
        kw2.S = 1;
        this.b(kw2);
        this.d(true);
    }

    public final void c(String[] stringArray) {
        kw kw2 = new kw(37);
        new kw(37).R = stringArray;
        kw2.S = 0;
        this.b(kw2);
        this.d(true);
    }

    public final void d() {
        kw kw2 = new kw(127);
        new kw(127).N = 1;
        this.b(kw2);
        this.d(true);
    }

    public final void a(int n2, String string) {
        kw kw2 = new kw(48);
        new kw(48).M = n2;
        kw2.Q = string;
        this.b(kw2);
        this.d(true);
    }

    public final void a(String string, byte by) {
        kw kw2 = new kw(9);
        new kw(9).c = string;
        kw2.P = by;
        this.b(kw2);
        this.d(true);
    }

    public final void a(String string, int n2, byte by) {
        kw kw2 = new kw(9);
        new kw(9).ao = 91;
        kw2.c = string;
        kw2.P = (byte)101;
        this.b(kw2);
        this.d(true);
    }

    public final void b(int n2) {
        kw kw2 = new kw(30);
        new kw(30).q = (byte)n2;
        this.b(kw2);
        this.d(true);
    }

    public final void a(int n2, int n3, int n4, int n5) {
        kw kw2 = new kw(10);
        new kw(10).E = n2;
        kw2.F = n3;
        kw2.G = n4;
        kw2.H = n5;
        this.b(kw2);
        this.d(true);
    }

    public final void a(int[] nArray, int[] nArray2) {
        kw kw2 = new kw(27);
        new kw(27).I = nArray;
        kw2.J = nArray2;
        this.b(kw2);
        this.d(true);
    }

    public final void c(int n2) {
        kw kw2 = new kw(52);
        new kw(52).T = (byte)n2;
        this.b(kw2);
        this.d(true);
    }

    public final void a(String string, int n2) {
        kw kw2 = new kw(11);
        new kw(11).B = string;
        kw2.m = n2;
        this.a(kw2, true);
    }

    public final void c(String string) {
        System.out.println("requestCurrentLocation()");
        kw kw2 = new kw(29);
        new kw(29).c = string;
        this.a(kw2, true);
    }

    public final void b(String string, int n2) {
        kw kw2 = new kw(13);
        new kw(13).B = string;
        kw2.D = n2;
        this.a(kw2, true);
    }

    public final void d(String string) {
        kw kw2 = new kw(43);
        new kw(43).B = string;
        this.b(kw2);
        this.d(true);
    }

    public final void e(String string) {
        kw kw2 = new kw(12);
        new kw(12).k = string;
        this.b(kw2);
        this.d(true);
    }

    public final void e() {
        kw kw2 = new kw(28);
        this.b(kw2);
        this.d(true);
    }

    public final void a(String string, boolean bl) {
        kw kw2 = new kw(16);
        new kw(16).c = string;
        kw2.L = bl;
        this.b(kw2);
        this.d(true);
    }

    public final void a(String string, String string2, boolean bl, long l, boolean bl2, boolean bl3) {
        kw kw2 = new kw(16);
        new kw(16).c = string;
        kw2.i = string2;
        kw2.ac = bl;
        kw2.ad = l;
        kw2.ae = bl2;
        kw2.af = bl3;
        this.b(kw2);
        this.d(true);
    }

    public final void a(boolean bl, String string, String string2) {
        kw kw2 = new kw(17);
        new kw(17).l = bl;
        kw2.y = string;
        kw2.i = string2;
        this.b(kw2);
        this.d(true);
    }

    public final void f() {
        kw kw2 = new kw(126);
        this.b(kw2);
        this.d(true);
    }

    public final void f(String string) {
        kw kw2 = new kw(49);
        new kw(49).c = string;
        kw2.ab = true;
        this.b(kw2);
        this.d(true);
    }

    public final void g() {
        kw kw2 = new kw(49);
        new kw(49).c = this.c;
        kw2.ab = false;
        this.b(kw2);
        this.d(true);
    }

    public final void d(int n2) {
        kw kw2 = new kw(14);
        new kw(14).y = this.e;
        kw2.m = n2;
        this.b(kw2);
        this.d(true);
    }

    public final void a(int n2, int n3, int n4, int n5, int n6) {
        kw kw2 = new kw(19);
        new kw(19).s = (byte)n2;
        kw2.t = (byte)n3;
        kw2.u = (byte)n4;
        kw2.v = (byte)n5;
        kw2.m = n6;
        this.b(kw2);
        this.d(true);
    }

    public final void b(int n2, int n3) {
        kw kw2 = new kw(20);
        new kw(20).r = n2;
        kw2.m = n3;
        this.b(kw2);
        this.d(true);
    }

    public final void c(int n2, int n3) {
        kw kw2 = new kw(44);
        new kw(44).M = n2;
        kw2.m = n3;
        this.b(kw2);
        this.d(true);
    }

    public final void h() {
        kw kw2 = new kw(40);
        new kw(40).y = this.e;
        this.b(kw2);
        this.d(true);
    }

    public final void a(int n2, int n3, int n4) {
        kw kw2 = new kw(47);
        new kw(47).w = n2;
        kw2.x = n3;
        kw2.m = n4;
        this.b(kw2);
        this.d(true);
    }

    public final void e(int n2) {
        kw kw2 = new kw(84);
        new kw(84).M = n2;
        this.b(kw2);
        this.d(true);
    }

    public final void a(String string, long l) {
        kw kw2 = new kw(112);
        new kw(112).Q = string;
        kw2.ah = l;
        this.b(kw2);
        this.d(true);
    }

    public final void g(String string) {
        kw kw2 = new kw(112);
        new kw(112).aa = string;
        this.b(kw2);
        this.d(true);
    }

    public final void a(int n2, int n3, long l) {
        kw kw2 = new kw(112);
        new kw(112).M = n2;
        kw2.g = n3;
        kw2.ah = l;
        this.b(kw2);
        this.d(true);
    }

    public final void h(String string) {
        kw kw2 = new kw(113);
        new kw(113).aa = string;
        this.b(kw2);
        this.d(true);
    }

    public final void b(int n2, int n3, int n4) {
        kw kw2 = new kw(114);
        new kw(114).W = 1;
        kw2.U = n2;
        kw2.X = 10;
        kw2.V = n4;
        this.b(kw2);
        this.d(true);
    }

    public final void i() {
        kw kw2 = new kw(114);
        new kw(114).W = 0;
        this.b(kw2);
        this.d(true);
    }

    public final void j() {
        kw kw2 = new kw(116);
        this.b(kw2);
        this.d(true);
    }

    public final void i(String string) {
        kw kw2 = new kw(115);
        new kw(115).aa = string;
        this.b(kw2);
        this.d(true);
    }

    public final void f(int n2) {
        kw kw2 = new kw(51);
        new kw(51).M = n2;
        this.b(kw2);
        this.d(true);
    }

    public final void k() {
        kw kw2 = new kw(56);
        new kw(56).T = 0;
        this.b(kw2);
        this.d(true);
    }

    public final void d(int n2, int n3) {
        kw kw2 = new kw(56);
        new kw(56).T = 1;
        kw2.U = n2;
        kw2.V = n3;
        this.b(kw2);
        this.d(true);
    }

    public final void a(int[] nArray) {
        kw kw2 = new kw(56);
        new kw(56).T = (byte)2;
        kw2.Z = nArray;
        this.b(kw2);
        this.d(true);
    }

    public final void j(String string) {
        kw kw2 = new kw(55);
        new kw(55).c = string;
        kw2.T = 0;
        this.b(kw2);
        this.d(true);
    }

    public final void a(boolean n2) {
        kw kw2 = new kw(55);
        new kw(55).l = n2;
        kw2.T = 1;
        kw2.ag = (String)this.g.c();
        if (n2 == 0) {
            this.g.a(this.g.d() - 1);
        } else {
            n2 = 0;
            int n3 = this.g.d() - 1;
            while (n2 < n3) {
                kw kw3 = new kw(55);
                new kw(55).l = false;
                kw3.T = 1;
                kw3.ag = (String)this.g.b(n2);
                this.b(kw3);
                ++n2;
            }
            this.g.a();
            j = 0;
        }
        this.b(kw2);
        this.d(true);
    }

    public final void k(String string) {
        kw kw2 = new kw(55);
        new kw(55).T = (byte)4;
        kw2.ag = this.f;
        kw2.Q = string;
        kw2.g = 1;
        this.b(kw2);
        this.d(true);
    }

    public final void l(String string) {
        kw kw2 = new kw(55);
        new kw(55).T = (byte)4;
        kw2.ag = this.f;
        kw2.Q = string;
        kw2.g = 0;
        this.b(kw2);
        this.d(true);
    }

    public final void e(int n2, int n3) {
        kw kw2 = new kw(55);
        new kw(55).T = (byte)3;
        kw2.ag = this.f;
        kw2.M = n2;
        kw2.g = n3;
        this.b(kw2);
        this.d(true);
    }

    public final void g(int n2) {
        kw kw2 = new kw(55);
        new kw(55).T = (byte)2;
        kw2.ag = this.f;
        kw2.ah = n2;
        this.b(kw2);
        this.d(true);
    }

    public final void l() {
        kw kw2 = new kw(55);
        new kw(55).T = (byte)5;
        kw2.ag = this.f;
        this.b(kw2);
        this.d(true);
    }

    public final void m() {
        kw kw2 = new kw(55);
        new kw(55).T = (byte)6;
        kw2.ag = this.f;
        this.b(kw2);
        this.d(true);
    }

    public final void n() {
        kw kw2 = new kw(55);
        new kw(55).T = (byte)7;
        kw2.ag = this.f;
        this.b(kw2);
        this.d(true);
    }

    public final void o() {
        kw kw2 = new kw(31);
        this.b(kw2);
        this.d(true);
    }

    public final void m(String string) {
        kw kw2 = new kw(32);
        new kw(32).K = string;
        this.b(kw2);
        this.d(true);
    }

    public final void n(String string) {
        kw kw2 = new kw(41);
        new kw(41).K = string;
        this.b(kw2);
        this.d(true);
    }

    public final void o(String string) {
        kw kw2 = new kw(33);
        new kw(33).K = string;
        this.b(kw2);
        this.d(true);
    }

    public final void a(String[] stringArray, String string) {
        kw kw2 = new kw(25);
        new kw(25).i = string;
        kw2.j = stringArray;
        this.b(kw2);
        this.d(true);
    }

    public final void a(String string, String string2) {
        kw kw2 = new kw(25);
        new kw(25).i = string2;
        kw2.j = new String[1];
        kw2.j[0] = string;
        this.b(kw2);
        this.d(true);
    }

    public final void a(String string, byte[] byArray, String string2, String string3, Long l, String string4, byte by) {
        kw kw2 = new kw(131);
        new kw(131).c = string;
        kw2.d = byArray;
        kw2.al = string2;
        kw2.ai = string3;
        kw2.am = l;
        kw2.an = string4;
        kw2.p = by;
        this.b(kw2);
        this.d(true);
    }

    public final void p() {
        kw kw2 = new kw(130);
        this.b(kw2);
        this.d(true);
    }

    public final void q() {
        kw kw2 = new kw(129);
        new kw(129).T = 1;
        this.b(kw2);
        this.d(true);
    }

    public final void p(String string) {
        kw kw2 = new kw(129);
        new kw(129).T = (byte)2;
        kw2.ai = string;
        this.b(kw2);
        this.d(true);
    }

    public final void b(boolean bl) {
        kw kw2 = new kw(7);
        new kw(7).T = 0;
        kw2.aj = bl;
        this.b(kw2);
        this.d(true);
    }

    public final void c(boolean bl) {
        kw kw2 = new kw(7);
        new kw(7).T = 1;
        kw2.aj = bl;
        this.b(kw2);
        this.d(true);
    }

    public final void a(int n2, String string, int n3) {
        kw kw2 = new kw(57);
        new kw(57).ak = n2;
        kw2.B = string;
        kw2.D = n3;
        this.b(kw2);
        this.d(true);
    }

    public final void r() {
        kw kw2 = new kw(64);
        this.b(kw2);
        this.d(true);
    }

    public final void q(String string) {
        kw kw2 = new kw(65);
        new kw(65).k = string;
        this.b(kw2);
        this.d(true);
    }

    public final void s() {
        ct.a("[ConnetionHanldle] requestMatchReady");
        kw kw2 = new kw(18);
        new kw(18).y = this.e;
        this.b(kw2);
        this.d(true);
    }

    public final void t() {
        ct.a("[ConnetionHanldle] requestSyncData");
        kw kw2 = new kw(23);
        new kw(23).y = this.e;
        this.b(kw2);
        this.d(true);
    }

    public final void u() {
        kw kw2 = new kw(86);
        this.b(kw2);
        this.d(true);
    }

    public final void f(int n2, int n3) {
        kw kw2 = new kw(83);
        new kw(83).M = n2;
        kw2.g = n3;
        this.b(kw2);
        this.d(true);
    }

    public final void v() {
        kw kw2 = new kw(99);
        this.b(kw2);
        this.d(true);
    }

    public final void a(String string, byte by, String string2) {
        kw kw2 = new kw(100);
        new kw(100).C = string;
        kw2.A = by;
        kw2.Q = string2;
        this.b(kw2);
        this.d(true);
    }

    public final void b(String string, byte by, String string2) {
        kw kw2 = new kw(97);
        new kw(97).C = string;
        kw2.A = by;
        kw2.Q = string2;
        this.b(kw2);
        this.d(true);
    }

    public final void a(String string, byte by, int n2, int n3) {
        kw kw2 = new kw(100);
        new kw(100).C = string;
        kw2.A = by;
        kw2.M = n2;
        kw2.g = n3;
        this.b(kw2);
        this.d(true);
    }

    public final void b(String string, byte by, int n2, int n3) {
        kw kw2 = new kw(97);
        new kw(97).C = string;
        kw2.A = by;
        kw2.M = n2;
        kw2.g = n3;
        this.b(kw2);
        this.d(true);
    }

    public final void a(String string, String[] stringArray, int[] nArray, int[] nArray2, long l) {
        kw kw2 = new kw(101);
        new kw(101).C = string;
        kw2.R = stringArray;
        kw2.Y = nArray;
        kw2.h = nArray2;
        kw2.ah = l;
        this.b(kw2);
        this.d(true);
    }

    public final void b(String string, String[] stringArray, int[] nArray, int[] nArray2, long l) {
        kw kw2 = new kw(98);
        new kw(98).C = string;
        kw2.R = stringArray;
        kw2.Y = nArray;
        kw2.h = nArray2;
        kw2.ah = l;
        this.b(kw2);
        this.d(true);
    }

    public final void r(String string) {
        if (ct.b()) {
            ct.a("[requestUpgradeEquipment] eqipKey  " + string);
        }
        kw kw2 = new kw(96);
        new kw(96).Q = string;
        this.b(kw2);
        this.d(true);
    }

    public final void w() {
        kw kw2 = new kw(132);
        this.b(kw2);
        this.d(true);
    }

    public final void a(String string, String string2, String string3, String string4) {
        kw kw2 = new kw(133);
        new kw(133).ap = string;
        kw2.aq = string2;
        kw2.ar = string3;
        kw2.an = string4;
        this.b(kw2);
        this.d(true);
    }

    public final void b(int n2, String string) {
        kw kw2 = new kw(0);
        new kw(0).b = (byte)n2;
        kw2.i = string;
        this.a(kw2, true);
    }
}
