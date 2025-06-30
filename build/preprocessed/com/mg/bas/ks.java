package com.mg.bas;
// Decompiled with: Procyon 0.6.0
// Class Version: 1
import javax.microedition.io.OutputConnection;
import javax.microedition.io.InputConnection;
import javax.microedition.io.Connection;
import javax.microedition.io.SocketConnection;

public final class ks implements Runnable, kn
{
    private short k;
    private static ks l;
    private static final Object m;
    private boolean n;
    private final kr o;
    private SocketConnection p;
    private ky q;
    private kz r;
    private String[] s;
    private int t;
    int b;
    private int u;
    private kq v;
    private kp w;
    private ko x;
    String c;
    String d;
    private String y;
    private long z;
    String e;
    String f;
    a g;
    public static int h;
    public static String i;
    public static int j;
    private long A;
    private int B;
    
    static {
        ks.l = null;
        m = new Object();
        ks.h = 0;
    }
    
    protected ks() {
        super();
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.b = 3;
        this.u = 0;
        this.g = new a();
        this.A = 0L;
        this.B = 0;
        (this.s = new String[1])[0] = "210.211.116.157";
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
        if (ks.l == null) {
            ks.l = new ks();
        }
        return ks.l;
    }
    
    public final void b() {
        this.k = 4;
        ks.l = null;
        this.d(false);
    }
    
    private static kx a(final kw kw) {
        final kx kx = new kx();
        Label_2982: {
            switch (kw.a) {
                case 3: {}
                case 4: {
                    kx.a((short)9, kw.c);
                    kx.a((short)10, kw.d);
                    kx.a((short)1, kw.i);
                    kx.a((short)11, kw.z);
                    kx.b((short)37, kw.as);
                    break;
                }
                case 5: {
                    kx.b((short)41, kw.m);
                    kx.a((short)11, "0.18.0");
                    kx.b((short)170, kw.n);
                    if (kw.o) {
                        kx.a((short)254, 1);
                        break;
                    }
                    break;
                }
                case 8: {
                    kx.a((short)16, kw.p);
                    kx.a((short)15, kw.q);
                    for (int i = 0; i < kw.O.length; ++i) {
                        kx.b((short)90, kw.O[i].a);
                        kx.b((short)96, kw.O[i].e.a);
                    }
                    break;
                }
                case 9: {
                    kx.a((short)9, kw.c);
                    if (kw.P >= 0) {
                        kx.a((short)134, kw.P);
                    }
                    if (kw.ao > 0) {
                        kx.b((short)23, kw.ao);
                        break;
                    }
                    break;
                }
                case 30: {
                    kx.a((short)15, kw.q);
                    break;
                }
                case 29: {
                    kx.a((short)9, kw.c);
                    break;
                }
                case 10: {
                    kx.b((short)118, kw.E);
                    kx.b((short)119, kw.F);
                    kx.b((short)120, kw.G);
                    kx.b((short)121, kw.H);
                    break;
                }
                case 27: {
                    for (int j = 0; j < kw.I.length; ++j) {
                        kx.b((short)64, kw.I[j]);
                        kx.b((short)67, kw.J[j]);
                    }
                    break;
                }
                case 6: {
                    kx.b((short)4, kw.e);
                    if (kw.f >= 0) {
                        kx.b((short)7, kw.f);
                        break;
                    }
                    break;
                }
                case 11: {
                    kx.a((short)20, kw.B);
                    if (kw.m != 0) {
                        kx.b((short)41, kw.m);
                        break;
                    }
                    break;
                }
                case 13: {
                    kx.a((short)20, kw.B);
                    kx.b((short)21, kw.D);
                    break;
                }
                case 43: {
                    kx.a((short)20, kw.B);
                    break;
                }
                case 12: {
                    kx.a((short)192, kw.k);
                    break;
                }
                case 16: {
                    kx.a((short)9, kw.c);
                    if (kw.i != null) {
                        kx.a((short)1, kw.i);
                    }
                    if (kw.L) {
                        kx.b((short)25, 1);
                    }
                    if (kw.ad > 0L) {
                        kx.a((short)132, kw.ad);
                    }
                    if (kw.ac) {
                        kx.a((short)141, 1);
                    }
                    if (kw.ae) {
                        kx.a((short)167, 1);
                    }
                    if (kw.af) {
                        kx.a((short)169, 1);
                        break;
                    }
                    break;
                }
                case 17: {
                    kx.a((short)31, kw.l ? 1 : 0);
                    kx.a((short)28, kw.y);
                    if (!com.mg.bas.i.b(kw.i)) {
                        kx.a((short)1, kw.i);
                        break;
                    }
                    break;
                }
                case 23: {
                    kx.a((short)28, kw.y);
                    break;
                }
                case 14: {
                    kx.a((short)28, a().e);
                    kx.b((short)41, kw.m);
                    break;
                }
                case 19: {
                    kx.a((short)28, a().e);
                    kx.b((short)41, kw.m);
                    kx.b((short)33, kw.s);
                    kx.b((short)34, kw.t);
                    kx.b((short)33, kw.u);
                    kx.b((short)34, kw.v);
                    break;
                }
                case 20: {
                    kx.a((short)28, a().e);
                    kx.b((short)41, kw.m);
                    kx.b((short)64, kw.r);
                    break;
                }
                case 44: {
                    kx.a((short)28, a().e);
                    kx.b((short)41, kw.m);
                    kx.b((short)114, kw.M);
                    break;
                }
                case 47: {
                    kx.a((short)28, a().e);
                    kx.b((short)41, kw.m);
                    kx.b((short)33, kw.w);
                    kx.b((short)34, kw.x);
                    break;
                }
                case 84: {
                    kx.b((short)114, kw.M);
                    break;
                }
                case 40: {
                    kx.a((short)28, kw.y);
                    break;
                }
                case 25: {
                    for (int k = 0; k < kw.j.length; ++k) {
                        kx.a((short)9, kw.j[k]);
                    }
                    kx.a((short)1, kw.i);
                    break;
                }
                case 32: {
                    kx.a((short)77, kw.K);
                    break;
                }
                case 41: {
                    kx.a((short)77, kw.K);
                    break;
                }
                case 33: {
                    kx.a((short)77, kw.K);
                    break;
                }
                case 42: {
                    kx.a((short)9, kw.c);
                    break;
                }
                case 37: {
                    for (int l = 0; l < kw.R.length; ++l) {
                        if (kw.R[l] != null) {
                            kx.a((short)83, kw.R[l]);
                        }
                    }
                    kx.a((short)89, kw.S);
                    break;
                }
                case 127: {
                    kx.a((short)191, kw.N);
                    break;
                }
                case 48: {
                    kx.b((short)114, kw.M);
                    kx.a((short)83, kw.Q);
                    break;
                }
                case 49: {
                    kx.a((short)9, kw.c);
                    kx.a((short)40, (byte)(kw.ab ? 1 : 0));
                    break;
                }
                case 55: {
                    kx.a((short)147, kw.T);
                    switch (kw.T) {
                        case 0: {
                            kx.a((short)9, kw.c);
                            break;
                        }
                        case 1: {
                            kx.a((short)150, kw.ag);
                            kx.a((short)31, kw.l ? 1 : 0);
                            break;
                        }
                        case 4: {
                            kx.a((short)150, kw.ag);
                            kx.a((short)83, kw.Q);
                            kx.b((short)106, kw.g);
                            break;
                        }
                        case 3: {
                            kx.a((short)150, kw.ag);
                            kx.b((short)114, kw.M);
                            kx.b((short)106, kw.g);
                            break;
                        }
                        case 2: {
                            kx.a((short)150, kw.ag);
                            kx.a((short)132, kw.ah);
                            break;
                        }
                        case 5: {
                            if (kw.ag != null) {
                                kx.a((short)150, kw.ag);
                                break;
                            }
                            break;
                        }
                        case 6: {
                            kx.a((short)150, kw.ag);
                            kx.b((short)41, ks.j);
                            break;
                        }
                        case 7: {
                            kx.a((short)150, kw.ag);
                            break;
                        }
                    }
                    break;
                }
                case 56: {
                    kx.a((short)147, kw.T);
                    switch (kw.T) {
                        case 1: {
                            kx.a((short)152, kw.U);
                            kx.b((short)148, kw.V);
                            break;
                        }
                        case 2: {
                            if (kw.Z != null) {
                                for (int n = 0; n < kw.Z.length; ++n) {
                                    kx.b((short)153, kw.Z[n]);
                                }
                                break;
                            }
                            break;
                        }
                    }
                    break;
                }
                case 129: {
                    kx.a((short)147, kw.T);
                    switch (kw.T) {
                        case 2: {
                            kx.a((short)162, kw.ai);
                            break;
                        }
                    }
                    break;
                }
                case 7: {
                    kx.a((short)147, kw.T);
                    switch (kw.T) {
                        case 0: {
                            kx.a((short)165, kw.aj ? 1 : 0);
                            break;
                        }
                        case 1: {
                            kx.a((short)166, kw.aj ? 1 : 0);
                            break;
                        }
                    }
                    break;
                }
                case 57: {
                    kx.a((short)147, kw.ak);
                    kx.a((short)20, kw.B);
                    kx.b((short)21, kw.D);
                }
                case 65: {
                    kx.a((short)192, kw.k);
                    break;
                }
                case 18: {
                    kx.a((short)28, kw.y);
                }
                case 131: {
                    kx.a((short)9, kw.c);
                    kx.a((short)10, kw.d);
                    kx.a((short)26, kw.al);
                    kx.a((short)162, kw.ai);
                    kx.a((short)179, kw.am.longValue());
                    kx.a((short)177, kw.an);
                    kx.a((short)16, kw.p);
                    break;
                }
                case 51: {
                    kx.b((short)114, kw.M);
                    break;
                }
                case 83: {
                    kx.b((short)114, kw.M);
                    kx.b((short)106, kw.g);
                }
                case 86: {}
                case 100: {
                    kx.a((short)186, kw.C);
                    kx.a((short)187, kw.A);
                    if (kw.Q != null) {
                        kx.a((short)83, kw.Q);
                    }
                    if (kw.M > 0) {
                        kx.b((short)114, kw.M);
                        kx.b((short)106, kw.g);
                        break;
                    }
                    break;
                }
                case 112: {
                    if (kw.Q != null) {
                        kx.a((short)83, kw.Q);
                        kx.a((short)132, kw.ah);
                        break;
                    }
                    if (kw.M > 0) {
                        kx.b((short)114, kw.M);
                        kx.b((short)106, kw.g);
                        kx.a((short)132, kw.ah);
                        break;
                    }
                    if (kw.aa != null) {
                        kx.a((short)175, kw.aa);
                        break;
                    }
                    break;
                }
                case 113: {
                    kx.a((short)175, kw.aa);
                }
                case 114: {
                    switch (kw.W) {
                        case 0: {
                            break Label_2982;
                        }
                        case 1: {
                            kx.a((short)152, kw.U);
                            kx.b((short)13, kw.X);
                            kx.b((short)148, kw.V);
                            break Label_2982;
                        }
                        default: {
                            break Label_2982;
                        }
                    }
//                    break;
                }
                case 115: {
                    kx.a((short)175, kw.aa);
                    break;
                }
                case 101: {
                    kx.a((short)186, kw.C);
                    if (kw.R != null) {
                        for (int n2 = 0; n2 < kw.R.length; ++n2) {
                            kx.a((short)83, kw.R[n2]);
                        }
                    }
                    if (kw.Y != null) {
                        for (int n3 = 0; n3 < kw.Y.length; ++n3) {
                            kx.b((short)114, kw.Y[n3]);
                            kx.b((short)106, kw.h[n3]);
                        }
                    }
                    if (kw.ah > 0L) {
                        kx.a((short)132, kw.ah);
                        break;
                    }
                    break;
                }
                case 96: {
                    kx.a((short)83, kw.Q);
                    break;
                }
                case 97: {
                    kx.a((short)186, kw.C);
                    kx.a((short)187, kw.A);
                    if (kw.Q != null) {
                        kx.a((short)83, kw.Q);
                    }
                    if (kw.M > 0) {
                        kx.b((short)114, kw.M);
                        kx.b((short)106, kw.g);
                        break;
                    }
                    break;
                }
                case 98: {
                    kx.a((short)186, kw.C);
                    if (kw.R != null) {
                        for (int n4 = 0; n4 < kw.R.length; ++n4) {
                            kx.a((short)83, kw.R[n4]);
                        }
                    }
                    if (kw.Y != null) {
                        for (int n5 = 0; n5 < kw.Y.length; ++n5) {
                            kx.b((short)114, kw.Y[n5]);
                            kx.b((short)106, kw.h[n5]);
                        }
                    }
                    if (kw.ah > 0L) {
                        kx.a((short)132, kw.ah);
                        break;
                    }
                    break;
                }
                case 52: {
                    kx.a((short)208, kw.T);
                }
                case 133: {
                    if (kw.an != null) {
                        kx.a((short)182, kw.an);
                    }
                    kx.a((short)183, kw.ar);
                    kx.a((short)185, kw.ap);
                    kx.a((short)184, kw.aq);
                    break;
                }
                case 0: {
                    kx.a((short)0, kw.b);
                    kx.a((short)1, kw.i);
                    break;
                }
            }
        }
        return kx;
    }
    
    private void x() {
        if (this.q != null) {
            this.q.b = this.v;
            this.q.c = this.w;
            this.q.d = this.x;
        }
    }
    
    private static void y() {
        synchronized (ks.m) {
            try {
                ks.m.wait();
            }
            catch (final Throwable t) {}
//            monitorexit(ks.m);
        }
    }
    
    private void b(final kw kw) {
        this.o.a(kw);
    }
    
    private final void a(final kw kw, final boolean b) {
        this.o.a(kw);
        this.d(true);
    }
    
    public final void run() {
        while (!this.n) {
            try {
                switch (this.k) {
                    case 4: {
                        ct.a("[ConnetionHanldle] Disconnecting...");
                        final kr o = this.o;
                        this.o.c();
                        if (this.q != null) {
                            final ky q = this.q;
                            final kq kq = null;
                            this.v = kq;
                            q.b = kq;
                            final ky q2 = this.q;
                            final kp kp = null;
                            this.w = kp;
                            q2.c = kp;
                            final ky q3 = this.q;
                            final ko ko = null;
                            this.x = ko;
                            q3.d = ko;
                        }
                        try {
                            if (this.q != null) {
                                this.q.a();
                            }
                            if (this.r != null) {
                                this.r.a();
                            }
                            if (this.p != null) {
                                ((Connection)this.p).close();
                            }
                        }
                        catch (final Throwable t) {}
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
                        y();
                        continue;
                    }
                    case 1: {
                        ct.a("[ConnetionHanldle] Opening connection ...");
                        final String[] l;
                        if ((l = pd.l()) != null) {
                            this.s = l;
                        }
                        int i = 0;
                        while (i < this.s.length) {
                            try {
                                this.p = com.mg.bas.g.a(this.s[i].trim(), this.t);
                                this.q = new ky(((InputConnection)this.p).openInputStream());
                                this.r = new kz(((OutputConnection)this.p).openOutputStream());
                                this.x();
                                final String s = this.s[0];
                                this.s[0] = this.s[i];
                                this.s[i] = s;
                                pd.a(this.s);
                                this.k = 3;
                                ct.a("[ConnetionHanldle] Connected to " + this.s[0]);
                                if (this.v != null) {
                                    final kq v = this.v;
                                    final String[] s2 = this.s;
                                    final int t2 = this.t;
                                    break;
                                }
                                break;
                            }
                            catch (final SecurityException ex) {
                                this.k = 0;
                                if (this.v != null) {
                                    this.v.a(2, "Thiết bị không cho phép kết nối mạng.");
                                }
                                ct.a("[ConnetionHanldle] Connection FAIL!!!");
                                break;
                            }
                            catch (final Throwable t3) {
                                ct.a("[ConnetionHanldle] Connection FAIL!!!");
                                ++i;
                            }
                        }
                        if (i < this.s.length) {
                            continue;
                        }
                        this.k = 0;
                        if (this.v == null) {
                            continue;
                        }
                        this.v.a(1, "Không thể kết nối với máy chủ.");
                        continue;
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
                                ((Connection)this.p).close();
                            }
                            this.q = null;
                            this.r = null;
                            this.p = null;
                            this.p = com.mg.bas.g.a(this.s[0].trim(), this.t);
                            this.q = new ky(((InputConnection)this.p).openInputStream());
                            this.r = new kz(((OutputConnection)this.p).openOutputStream());
                            this.x();
                            ct.a("[ConnetionHanldle] Change success to " + this.s[0]);
                            pd.a(this.s);
                            this.k = 3;
                            final kw kw;
                            (kw = new kw((short)3)).c = go.e;
                            this.b(kw);
                            if (this.v != null) {
                                this.v.x();
                                continue;
                            }
                            continue;
                        }
                        catch (final SecurityException ex2) {
                            if (this.v != null) {
                                this.v.a(2, (String)null);
                            }
                        }
                        catch (final Throwable t4) {
                            if (this.v != null) {
                                this.v.a(1, (String)null);
                            }
                        }
                        this.k = 0;
                        continue;
                    }
                    case 3: {
                        final kw kw2;
                        if ((kw2 = (kw)this.o.b()) != null) {
                            final kx a = a(kw2);
                            try {
                                this.r.a(a, kw2.a);
                            } catch (final Throwable t5) {
                                t5.printStackTrace();
                                this.z();
                            }
                            continue;
                        }
                        y();
                        continue;
                    }
                }
            }
            catch (final Throwable t8) {
//                final Throwable t8;
                t8.printStackTrace();
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
    
    private void d(final boolean b) {
        if (b && this.k != 3 && this.k != 2) {
            return;
        }
        try {
            synchronized (ks.m) {
                ks.m.notify();
//                monitorexit(ks.m);
            }
        }
        catch (final Throwable t) {}
    }
    
    public final void a(final kq kq) {
        this.v = kq;
        if (this.q != null) {
            this.q.b = kq;
        }
    }
    
    public final void a(final kp kp) {
        this.w = kp;
        if (this.q != null) {
            this.q.c = kp;
        }
    }
    
    public final void a(final ko ko) {
        this.x = ko;
        if (this.q != null) {
            this.q.d = ko;
        }
    }
    
    public final void c() {
        final long currentTimeMillis = System.currentTimeMillis();
        if (this.A == 0L) {
            this.A = currentTimeMillis;
        }
        else {
            ++this.B;
            if (this.B >= 100) {
                if (currentTimeMillis - this.A <= 3000L && this.v != null) {
                    this.v.W();
                }
                this.B = 0;
                this.A = currentTimeMillis;
            }
        }
        if (currentTimeMillis - this.z >= 30000L) {
            if (this.b == 0) {
                this.z();
                return;
            }
            --this.b;
            if (this.k == 3) {
                this.b(new kw((short)1));
            }
            this.z = currentTimeMillis;
            this.d(true);
        }
    }
    
    public final void a(final String s) {
        ct.a(s);
        if (s != null) {
            if (this.v != null) {
                this.v.y();
            }
            int i;
            for (i = 0; i < this.s.length; ++i) {
                if (s.equals(this.s[i])) {
                    final String s2 = this.s[0];
                    this.s[0] = s;
                    this.s[i] = s2;
                    break;
                }
            }
            if (i >= this.s.length) {
                final String[] s3;
                (s3 = new String[this.s.length + 1])[0] = s;
                System.arraycopy(this.s, 0, s3, 1, this.s.length);
                this.s = s3;
            }
            this.k = 2;
            this.d(false);
            return;
        }
        if (this.v != null) {
            this.v.x();
        }
        this.b(new kw((short)3));
        this.d(true);
    }
    
    final void a(String c, final byte[] d, final byte[] array) {
        final kw kw;
        (kw = new kw((short)4)).c = c;
        kw.d = d;
        kw.m = this.u;
        kw.z = "0.18.0";
        kw.i = System.getProperty("microedition.platform");
        final kw kw2 = kw;
        int as;
        if ((c = c) != null) {
            int n = 17;
            for (int i = 0; i < c.length(); ++i) {
                n = n * 31 + c.charAt(i);
            }
            as = n;
        }
        else {
            as = -1;
        }
        kw2.as = as;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final String c, final String d, final int u) {
        if (this.k == 0) {
            this.k = 1;
            this.d(false);
        }
        this.c = c;
        this.d = d;
        this.u = u;
        this.b(new kw((short)2));
        this.d(true);
    }
    
    public final void a(final int e) {
        final kw kw;
        (kw = new kw((short)6)).e = e;
        kw.f = -1;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final int e, final int f) {
        final kw kw;
        (kw = new kw((short)6)).e = e;
        kw.f = f;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final int n, final int m, final boolean b) {
        ct.a("Request installation: resRev=" + m + ", offlineResMode=true");
        final kw kw;
        (kw = new kw((short)5)).m = m;
        kw.n = n;
        kw.o = true;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final int n, final int n2, final df df, final df df2, final df df3) {
        final kw kw;
        (kw = new kw((short)8)).p = (byte)n;
        kw.q = (byte)n2;
        (kw.O = new df[3])[0] = df;
        kw.O[1] = df2;
        kw.O[2] = df3;
        this.b(kw);
        this.d(true);
    }
    
    public final void b(final String c) {
        final kw kw;
        (kw = new kw((short)42)).c = c;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final String[] r) {
        final kw kw;
        (kw = new kw((short)37)).R = r;
        kw.S = 2;
        this.b(kw);
        this.d(true);
    }
    
    public final void b(final String[] r) {
        final kw kw;
        (kw = new kw((short)37)).R = r;
        kw.S = 1;
        this.b(kw);
        this.d(true);
    }
    
    public final void c(final String[] r) {
        final kw kw;
        (kw = new kw((short)37)).R = r;
        kw.S = 0;
        this.b(kw);
        this.d(true);
    }
    
    public final void d() {
        final kw kw;
        (kw = new kw((short)127)).N = 1;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final int m, final String q) {
        final kw kw;
        (kw = new kw((short)48)).M = m;
        kw.Q = q;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final String c, final byte p2) {
        final kw kw;
        (kw = new kw((short)9)).c = c;
        kw.P = p2;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final String c, final int n, final byte b) {
        final kw kw;
        (kw = new kw((short)9)).ao = 91;
        kw.c = c;
        kw.P = 101;
        this.b(kw);
        this.d(true);
    }
    
    public final void b(final int n) {
        final kw kw;
        (kw = new kw((short)30)).q = (byte)n;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final int e, final int f, final int g, final int h) {
        final kw kw;
        (kw = new kw((short)10)).E = e;
        kw.F = f;
        kw.G = g;
        kw.H = h;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final int[] i, final int[] j) {
        final kw kw;
        (kw = new kw((short)27)).I = i;
        kw.J = j;
        this.b(kw);
        this.d(true);
    }
    
    public final void c(final int n) {
        final kw kw;
        (kw = new kw((short)52)).T = (byte)n;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final String b, final int m) {
        final kw kw;
        (kw = new kw((short)11)).B = b;
        kw.m = m;
        this.a(kw, true);
    }
    
    public final void c(final String c) {
        System.out.println("requestCurrentLocation()");
        final kw kw;
        (kw = new kw((short)29)).c = c;
        this.a(kw, true);
    }
    
    public final void b(final String b, final int d) {
        final kw kw;
        (kw = new kw((short)13)).B = b;
        kw.D = d;
        this.a(kw, true);
    }
    
    public final void d(final String b) {
        final kw kw;
        (kw = new kw((short)43)).B = b;
        this.b(kw);
        this.d(true);
    }
    
    public final void e(final String k) {
        final kw kw;
        (kw = new kw((short)12)).k = k;
        this.b(kw);
        this.d(true);
    }
    
    public final void e() {
        this.b(new kw((short)28));
        this.d(true);
    }
    
    public final void a(final String c, final boolean l) {
        final kw kw;
        (kw = new kw((short)16)).c = c;
        kw.L = l;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final String c, final String i, final boolean ac, final long ad, final boolean ae, final boolean af) {
        final kw kw;
        (kw = new kw((short)16)).c = c;
        kw.i = i;
        kw.ac = ac;
        kw.ad = ad;
        kw.ae = ae;
        kw.af = af;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final boolean l, final String y, final String i) {
        final kw kw;
        (kw = new kw((short)17)).l = l;
        kw.y = y;
        kw.i = i;
        this.b(kw);
        this.d(true);
    }
    
    public final void f() {
        this.b(new kw((short)126));
        this.d(true);
    }
    
    public final void f(final String c) {
        final kw kw;
        (kw = new kw((short)49)).c = c;
        kw.ab = true;
        this.b(kw);
        this.d(true);
    }
    
    public final void g() {
        final kw kw;
        (kw = new kw((short)49)).c = this.c;
        kw.ab = false;
        this.b(kw);
        this.d(true);
    }
    
    public final void d(final int m) {
        final kw kw;
        (kw = new kw((short)14)).y = this.e;
        kw.m = m;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final int n, final int n2, final int n3, final int n4, final int m) {
        final kw kw;
        (kw = new kw((short)19)).s = (byte)n;
        kw.t = (byte)n2;
        kw.u = (byte)n3;
        kw.v = (byte)n4;
        kw.m = m;
        this.b(kw);
        this.d(true);
    }
    
    public final void b(final int r, final int m) {
        final kw kw;
        (kw = new kw((short)20)).r = r;
        kw.m = m;
        this.b(kw);
        this.d(true);
    }
    
    public final void c(final int m, final int i) {
        final kw kw;
        (kw = new kw((short)44)).M = m;
        kw.m = i;
        this.b(kw);
        this.d(true);
    }
    
    public final void h() {
        final kw kw;
        (kw = new kw((short)40)).y = this.e;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final int w, final int x, final int m) {
        final kw kw;
        (kw = new kw((short)47)).w = w;
        kw.x = x;
        kw.m = m;
        this.b(kw);
        this.d(true);
    }
    
    public final void e(final int m) {
        final kw kw;
        (kw = new kw((short)84)).M = m;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final String q, final long ah) {
        final kw kw;
        (kw = new kw((short)112)).Q = q;
        kw.ah = ah;
        this.b(kw);
        this.d(true);
    }
    
    public final void g(final String aa) {
        final kw kw;
        (kw = new kw((short)112)).aa = aa;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final int m, final int g, final long ah) {
        final kw kw;
        (kw = new kw((short)112)).M = m;
        kw.g = g;
        kw.ah = ah;
        this.b(kw);
        this.d(true);
    }
    
    public final void h(final String aa) {
        final kw kw;
        (kw = new kw((short)113)).aa = aa;
        this.b(kw);
        this.d(true);
    }
    
    public final void b(final int u, final int n, final int v) {
        final kw kw;
        (kw = new kw((short)114)).W = 1;
        kw.U = u;
        kw.X = 10;
        kw.V = v;
        this.b(kw);
        this.d(true);
    }
    
    public final void i() {
        final kw kw;
        (kw = new kw((short)114)).W = 0;
        this.b(kw);
        this.d(true);
    }
    
    public final void j() {
        this.b(new kw((short)116));
        this.d(true);
    }
    
    public final void i(final String aa) {
        final kw kw;
        (kw = new kw((short)115)).aa = aa;
        this.b(kw);
        this.d(true);
    }
    
    public final void f(final int m) {
        final kw kw;
        (kw = new kw((short)51)).M = m;
        this.b(kw);
        this.d(true);
    }
    
    public final void k() {
        final kw kw;
        (kw = new kw((short)56)).T = 0;
        this.b(kw);
        this.d(true);
    }
    
    public final void d(final int u, final int v) {
        final kw kw;
        (kw = new kw((short)56)).T = 1;
        kw.U = u;
        kw.V = v;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final int[] z) {
        final kw kw;
        (kw = new kw((short)56)).T = 2;
        kw.Z = z;
        this.b(kw);
        this.d(true);
    }
    
    public final void j(final String c) {
        final kw kw;
        (kw = new kw((short)55)).c = c;
        kw.T = 0;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final boolean l) {
        final kw kw;
        (kw = new kw((short)55)).l = l;
        kw.T = 1;
        kw.ag = (String)this.g.c();
        if (!l) {
            this.g.a(this.g.d() - 1);
        }
        else {
            for (int i = 0; i < this.g.d() - 1; ++i) {
                final kw kw2;
                (kw2 = new kw((short)55)).l = false;
                kw2.T = 1;
                kw2.ag = (String)this.g.b(i);
                this.b(kw2);
            }
            this.g.a();
            ks.j = 0;
        }
        this.b(kw);
        this.d(true);
    }
    
    public final void k(final String q) {
        final kw kw;
        (kw = new kw((short)55)).T = 4;
        kw.ag = this.f;
        kw.Q = q;
        kw.g = 1;
        this.b(kw);
        this.d(true);
    }
    
    public final void l(final String q) {
        final kw kw;
        (kw = new kw((short)55)).T = 4;
        kw.ag = this.f;
        kw.Q = q;
        kw.g = 0;
        this.b(kw);
        this.d(true);
    }
    
    public final void e(final int m, final int g) {
        final kw kw;
        (kw = new kw((short)55)).T = 3;
        kw.ag = this.f;
        kw.M = m;
        kw.g = g;
        this.b(kw);
        this.d(true);
    }
    
    public final void g(final int n) {
        final kw kw;
        (kw = new kw((short)55)).T = 2;
        kw.ag = this.f;
        kw.ah = n;
        this.b(kw);
        this.d(true);
    }
    
    public final void l() {
        final kw kw;
        (kw = new kw((short)55)).T = 5;
        kw.ag = this.f;
        this.b(kw);
        this.d(true);
    }
    
    public final void m() {
        final kw kw;
        (kw = new kw((short)55)).T = 6;
        kw.ag = this.f;
        this.b(kw);
        this.d(true);
    }
    
    public final void n() {
        final kw kw;
        (kw = new kw((short)55)).T = 7;
        kw.ag = this.f;
        this.b(kw);
        this.d(true);
    }
    
    public final void o() {
        this.b(new kw((short)31));
        this.d(true);
    }
    
    public final void m(final String k) {
        final kw kw;
        (kw = new kw((short)32)).K = k;
        this.b(kw);
        this.d(true);
    }
    
    public final void n(final String k) {
        final kw kw;
        (kw = new kw((short)41)).K = k;
        this.b(kw);
        this.d(true);
    }
    
    public final void o(final String k) {
        final kw kw;
        (kw = new kw((short)33)).K = k;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final String[] j, final String i) {
        final kw kw;
        (kw = new kw((short)25)).i = i;
        kw.j = j;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final String s, final String i) {
        final kw kw;
        (kw = new kw((short)25)).i = i;
        (kw.j = new String[1])[0] = s;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final String c, final byte[] d, final String al, final String ai, final Long am, final String an, final byte p7) {
        final kw kw;
        (kw = new kw((short)131)).c = c;
        kw.d = d;
        kw.al = al;
        kw.ai = ai;
        kw.am = am;
        kw.an = an;
        kw.p = p7;
        this.b(kw);
        this.d(true);
    }
    
    public final void p() {
        this.b(new kw((short)130));
        this.d(true);
    }
    
    public final void q() {
        final kw kw;
        (kw = new kw((short)129)).T = 1;
        this.b(kw);
        this.d(true);
    }
    
    public final void p(final String ai) {
        final kw kw;
        (kw = new kw((short)129)).T = 2;
        kw.ai = ai;
        this.b(kw);
        this.d(true);
    }
    
    public final void b(final boolean aj) {
        final kw kw;
        (kw = new kw((short)7)).T = 0;
        kw.aj = aj;
        this.b(kw);
        this.d(true);
    }
    
    public final void c(final boolean aj) {
        final kw kw;
        (kw = new kw((short)7)).T = 1;
        kw.aj = aj;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final int ak, final String b, final int d) {
        final kw kw;
        (kw = new kw((short)57)).ak = ak;
        kw.B = b;
        kw.D = d;
        this.b(kw);
        this.d(true);
    }
    
    public final void r() {
        this.b(new kw((short)64));
        this.d(true);
    }
    
    public final void q(final String k) {
        final kw kw;
        (kw = new kw((short)65)).k = k;
        this.b(kw);
        this.d(true);
    }
    
    public final void s() {
        ct.a("[ConnetionHanldle] requestMatchReady");
        final kw kw;
        (kw = new kw((short)18)).y = this.e;
        this.b(kw);
        this.d(true);
    }
    
    public final void t() {
        ct.a("[ConnetionHanldle] requestSyncData");
        final kw kw;
        (kw = new kw((short)23)).y = this.e;
        this.b(kw);
        this.d(true);
    }
    
    public final void u() {
        this.b(new kw((short)86));
        this.d(true);
    }
    
    public final void f(final int m, final int g) {
        final kw kw;
        (kw = new kw((short)83)).M = m;
        kw.g = g;
        this.b(kw);
        this.d(true);
    }
    
    public final void v() {
        this.b(new kw((short)99));
        this.d(true);
    }
    
    public final void a(final String c, final byte a, final String q) {
        final kw kw;
        (kw = new kw((short)100)).C = c;
        kw.A = a;
        kw.Q = q;
        this.b(kw);
        this.d(true);
    }
    
    public final void b(final String c, final byte a, final String q) {
        final kw kw;
        (kw = new kw((short)97)).C = c;
        kw.A = a;
        kw.Q = q;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final String c, final byte a, final int m, final int g) {
        final kw kw;
        (kw = new kw((short)100)).C = c;
        kw.A = a;
        kw.M = m;
        kw.g = g;
        this.b(kw);
        this.d(true);
    }
    
    public final void b(final String c, final byte a, final int m, final int g) {
        final kw kw;
        (kw = new kw((short)97)).C = c;
        kw.A = a;
        kw.M = m;
        kw.g = g;
        this.b(kw);
        this.d(true);
    }
    
    public final void a(final String c, final String[] r, final int[] y, final int[] h, final long ah) {
        final kw kw;
        (kw = new kw((short)101)).C = c;
        kw.R = r;
        kw.Y = y;
        kw.h = h;
        kw.ah = ah;
        this.b(kw);
        this.d(true);
    }
    
    public final void b(final String c, final String[] r, final int[] y, final int[] h, final long ah) {
        final kw kw;
        (kw = new kw((short)98)).C = c;
        kw.R = r;
        kw.Y = y;
        kw.h = h;
        kw.ah = ah;
        this.b(kw);
        this.d(true);
    }
    
    public final void r(final String q) {
        if (ct.b()) {
            ct.a("[requestUpgradeEquipment] eqipKey  " + q);
        }
        final kw kw;
        (kw = new kw((short)96)).Q = q;
        this.b(kw);
        this.d(true);
    }
    
    public final void w() {
        this.b(new kw((short)132));
        this.d(true);
    }
    
    public final void a(final String ap, final String aq, final String ar, final String an) {
        final kw kw;
        (kw = new kw((short)133)).ap = ap;
        kw.aq = aq;
        kw.ar = ar;
        kw.an = an;
        this.b(kw);
        this.d(true);
    }
    
    public final void b(final int n, final String i) {
        final kw kw;
        (kw = new kw((short)0)).b = (byte)n;
        kw.i = i;
        this.a(kw, true);
    }
}
