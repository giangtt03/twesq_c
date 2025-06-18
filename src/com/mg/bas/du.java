package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

public final class du
implements eg,
Runnable {
    private static du D;
    private boolean E = false;
    boolean a = false;
    boolean b = false;
    private String[] F;
    private String G = "1236";
    private int H = 0;
    private Object I = new Object();
    private dv J;
    boolean c = false;
    private em K;
    private en L;
    private a M;
    private int N = 3;
    boolean d;
    boolean e;
    String f;
    String g;
    String h;
    short i;
    short j;
    int k;
    byte[] l;
    byte[] m;
    byte[] n;
    private byte[] O;
    dz o;
    private long P = 0L;
    long p = 0L;
    private long Q = 0L;
    int q = 0;
    int r = 0;
    int s = 0;
    private int R = 0;
    int t = 0;
    int u;
    private int S;
    int v;
    int w;
    private int T;
    private int U;
    int x;
    private long V = 0L;
    String y;
    private short W;
    private long X;
    short z = 0;
    short A = 0;
    private SocketConnection Y;

    private du() {
        this.F = eg.B;
        this.M = new a(10);
    }

    public static du a() {
        if (D == null) {
            D = new du();
        }
        return D;
    }

    public final void a(dz dz2) {
        if (this.H == 0) {
            if (this.F == null || this.F.length == 0) {
                throw new RuntimeException("No IP address for connection. Please use setIp() to assign array of IP address");
            }
            this.H = 1;
        }
        this.o = dz2;
        if (!this.E) {
            this.E = true;
            new Thread(this).start();
            return;
        }
        this.t();
    }

    public final void b() {
        this.h = null;
        this.a = false;
        this.c = false;
        this.b = false;
        this.H = 0;
        this.M.a();
        if (this.K != null) {
            this.K.a();
            this.K = null;
        }
        if (this.L != null) {
            this.L.a();
            this.L = null;
        }
        if (this.Y != null) {
            try {
                this.Y.close();
                return;
            }
            catch (Exception exception) {}
        }
    }

    public final void c() {
        this.b();
        this.E = false;
        this.t();
        D = null;
        System.gc();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void t() {
        try {
            Object object = this.I;
            synchronized (object) {
                this.I.notify();
                return;
            }
        }
        catch (Throwable throwable) {
            return;
        }
    }

    final void d() {
        this.b();
        this.b = true;
        this.H = 4;
        this.t();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void run() {
        block114: while (this.E) {
            try {
                switch (this.H) {
                    case 0: {
                        Object object2 = this.I;
                        synchronized (object2) {
                            try {
                                this.I.wait();
                            }
                            catch (Throwable throwable) {}
                            break;
                        }
                    }
                    case 4: {
                        Object object2;
                        short s = 0;
                        while (s < this.F.length) {
                            try {
                                ct.a("[OLA] Reconnecting to " + this.F[s]);
                                this.Y = (SocketConnection)Connector.open((String)("socket://" + this.F[s].trim() + ":" + this.G));
                                this.Y.setSocketOption((byte)1, 5);
                                this.K = new em(this.Y.openInputStream());
                                this.L = new en(this.Y.openOutputStream());
                                if (this.J != null) {
                                    this.K.a(this.J);
                                    this.L.a(this.J);
                                }
                                object2 = this.F[0];
                                this.F[0] = this.F[s];
                                this.F[s] = object2;
                                this.H = 2;
                                this.u();
                                break;
                            }
                            catch (SecurityException securityException) {
                                this.H = 0;
                                if (this.J == null) break;
                                this.J.a(31, null, (short)0);
                                break;
                            }
                            catch (Throwable throwable) {
                                ++s;
                            }
                        }
                        if (s < this.F.length) continue block114;
                        this.H = 0;
                        if (this.J == null) continue block114;
                        this.J.a(1, null, (short)0);
                        break;
                    }
                    case 1: {
                        Object object;
                        Object object2;
                        short s = 0;
                        while (s < this.F.length) {
                            try {
                                object2 = this.F[s].trim();
                                if (this.J != null) {
                                    this.J.i_();
                                }
                                ct.a("[OLA] Connect to " + this.F[s]);
                                this.Y = (SocketConnection)Connector.open((String)("socket://" + (String)object2 + ":" + this.G));
                                this.Y.setSocketOption((byte)1, 5);
                                this.K = new em(this.Y.openInputStream());
                                this.L = new en(this.Y.openOutputStream());
                                if (this.J != null) {
                                    this.K.a(this.J);
                                    this.L.a(this.J);
                                }
                                object = this.F[0];
                                this.F[0] = this.F[s];
                                this.F[s] = object;
                                this.H = 2;
                                this.u();
                                break;
                            }
                            catch (SecurityException securityException) {
                                this.H = 0;
                                if (this.J == null) break;
                                this.J.a(31, null, (short)0);
                                break;
                            }
                            catch (Throwable throwable) {
                                ++s;
                            }
                        }
                        if (s < this.F.length) continue block114;
                        this.H = 0;
                        if (this.J == null) continue block114;
                        this.J.a(1, null, (short)0);
                        break;
                    }
                    case 3: {
                        Object object;
                        Object object2;
                        short s = 0;
                        while (s < this.F.length) {
                            try {
                                ct.a("[OLA] Changing to " + this.F[s]);
                                object2 = this.F[s].trim();
                                if (this.J != null) {
                                    this.J.i_();
                                }
                                this.Y = (SocketConnection)Connector.open((String)("socket://" + (String)object2 + ":" + this.G));
                                this.Y.setSocketOption((byte)1, 5);
                                this.K = new em(this.Y.openInputStream());
                                this.L = new en(this.Y.openOutputStream());
                                if (this.J != null) {
                                    this.K.a(this.J);
                                    this.L.a(this.J);
                                }
                                object = this.F[0];
                                this.F[0] = this.F[s];
                                this.F[s] = object;
                                this.H = 2;
                                ct.a("[OLA] Connect success to " + this.F[s]);
                                this.v();
                                break;
                            }
                            catch (SecurityException securityException) {
                                this.H = 0;
                                if (this.J == null) break;
                                this.J.a(31, null, (short)0);
                                break;
                            }
                            catch (Throwable throwable) {
                                ++s;
                            }
                        }
                        if (s < this.F.length) continue block114;
                        this.H = 0;
                        if (this.J == null) continue block114;
                        this.J.a(1, null, (short)0);
                        break;
                    }
                    case 2: {
                        Object object;
                        short s;
                        Object object2;
                        if (this.M.d() > 0) {
                            object2 = (eh)this.M.a(0);
                            object = new el();
                            short s2 = ((eh)object2).C;
                            s = s2;
                            switch (s2) {
                                case 95: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)52, "5.1.2");
                                    ((el)object3).a((short)38, ((eh)object4).D);
                                    ((el)object3).a((short)61, ((eh)object4).c);
                                    if (((eh)object4).o != null) {
                                        ((el)object3).a((short)94, ((eh)object4).o);
                                    }
                                    ((el)object3).a((short)50, ((eh)object4).d);
                                    if (((eh)object4).a != null) {
                                        ((el)object3).a((short)86, ((eh)object4).a);
                                    }
                                    ((el)object3).a((short)51, String.valueOf(String.valueOf(((eh)object4).x)) + "x" + String.valueOf(((eh)object4).y));
                                    if (((eh)object4).p == null) break;
                                    ((el)object3).a((short)14, ((eh)object4).p);
                                    break;
                                }
                                case 96: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)52, "5.1.2");
                                    ((el)object3).a((short)38, ((eh)object4).D);
                                    ((el)object3).a((short)61, ((eh)object4).c);
                                    if (((eh)object4).o != null) {
                                        ((el)object3).a((short)94, ((eh)object4).o);
                                    }
                                    ((el)object3).a((short)50, ((eh)object4).d);
                                    if (((eh)object4).a != null) {
                                        ((el)object3).a((short)86, ((eh)object4).a);
                                    }
                                    ((el)object3).a((short)51, String.valueOf(String.valueOf(((eh)object4).x)) + "x" + String.valueOf(((eh)object4).y));
                                    if (((eh)object4).p == null) break;
                                    ((el)object3).a((short)14, ((eh)object4).p);
                                    break;
                                }
                                case 97: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)2, ((eh)object4).b);
                                    ((el)object3).a((short)43, ((eh)object4).M);
                                    ((el)object3).a((short)12, (byte)((eh)object4).E);
                                    ((el)object3).a((short)52, ((eh)object4).f);
                                    ((el)object3).a((short)38, (byte)((eh)object4).D);
                                    ((el)object3).a((short)61, ((eh)object4).c);
                                    if (((eh)object4).o != null) {
                                        ((el)object3).a((short)94, ((eh)object4).o);
                                    }
                                    if (((eh)object4).d != null) {
                                        ((el)object3).a((short)50, ((eh)object4).d);
                                    }
                                    if (((eh)object4).a != null) {
                                        ((el)object3).a((short)86, ((eh)object4).a);
                                    }
                                    ((el)object3).a((short)51, String.valueOf(((eh)object4).x) + "x" + ((eh)object4).y);
                                    if (((eh)object4).p != null) {
                                        ((el)object3).a((short)14, ((eh)object4).p);
                                    }
                                    if (((eh)object4).n != null) {
                                        ((el)object3).a((short)79, ((eh)object4).n);
                                        break;
                                    }
                                    String string = g.a();
                                    String string2 = g.b();
                                    String string3 = g.c();
                                    String string4 = g.d();
                                    if (string != null) {
                                        ((el)object3).a((short)81, string);
                                    }
                                    if (string2 != null) {
                                        ((el)object3).a((short)82, string2);
                                    }
                                    if (string4 != null) {
                                        ((el)object3).a((short)80, string4);
                                    }
                                    if (string3 == null) break;
                                    ((el)object3).a((short)79, string3);
                                    break;
                                }
                                case 14: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    if (((eh)object4).J > 0) {
                                        ((el)object3).a((short)220, (byte)((eh)object4).J);
                                    }
                                    ((el)object3).a((short)7, ((eh)object4).h);
                                    ((el)object3).a((short)8, ((eh)object4).g);
                                    if (i.a(((eh)object4).q)) break;
                                    ((el)object3).a((short)109, ((eh)object4).q);
                                    break;
                                }
                                case 42: {
                                    break;
                                }
                                case 50: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)7, ((eh)object4).j);
                                    if (((eh)object4).K == 0) break;
                                    ((el)object3).a((short)255, (byte)((eh)object4).K);
                                    break;
                                }
                                case 54: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)7, ((eh)object4).j);
                                    if (i.a(null)) break;
                                    ((el)object3).a((short)22, (String)null);
                                    break;
                                }
                                case 55: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)7, ((eh)object4).j);
                                    ((el)object3).a((short)62, (byte)0);
                                    break;
                                }
                                case 65: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    if (((eh)object4).j != null) {
                                        ((el)object3).a((short)7, ((eh)object4).j);
                                    }
                                    ((el)object3).a((short)30, ((eh)object4).m);
                                    break;
                                }
                                case 66: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    if (((eh)object4).B == 0) break;
                                    ((el)object3).a((short)124, ((eh)object4).B);
                                    break;
                                }
                                case 67: {
                                    break;
                                }
                                case 44: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)7, ((eh)object4).j);
                                    break;
                                }
                                case 21: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)12, (byte)((eh)object4).E);
                                    String string = ((eh)object4).k;
                                    if (!i.a(string)) {
                                        ((el)object3).a((short)13, string);
                                    }
                                    if (((eh)object4).Q) break;
                                    ((el)object3).a((short)10, new byte[]{1});
                                    break;
                                }
                                case 23: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)200, ((eh)object4).u);
                                    ((el)object3).a((short)204, ((eh)object4).A);
                                    break;
                                }
                                case 25: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    if (((eh)object4).K != 0) {
                                        ((el)object3).a((short)255, (byte)((eh)object4).K);
                                    }
                                    ((el)object3).a((short)43, ((eh)object4).M);
                                    ((el)object3).a((short)46, (byte[])null);
                                    break;
                                }
                                case 115: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    if (((eh)object4).l == null) {
                                        ((el)object3).a((short)214, (short)((eh)object4).A);
                                        break;
                                    }
                                    ((el)object3).a((short)218, ((eh)object4).B);
                                    break;
                                }
                                case 6: {
                                    break;
                                }
                                case 9: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)39, ((eh)object4).B);
                                    ((el)object3).a((short)53, (byte)0);
                                    break;
                                }
                                case 11: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)7, ((eh)object4).j);
                                    if (((eh)object4).K == 0) break;
                                    ((el)object3).a((short)255, (byte)((eh)object4).K);
                                    break;
                                }
                                case 12: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    String string = ((eh)object4).e;
                                    if (string != null) {
                                        ((el)object3).a((short)4, string);
                                    }
                                    if (((eh)object4).N != null) {
                                        ((el)object3).a((short)23, ((eh)object4).N);
                                        break;
                                    }
                                    if (((eh)object4).l == null) break;
                                    ((el)object3).a((short)24, ((eh)object4).l);
                                    break;
                                }
                                case 15: {
                                    du.a((eh)object2, (el)object);
                                    break;
                                }
                                case 16: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)7, ((eh)object4).j);
                                    if (((eh)object4).i == null) break;
                                    ((el)object3).a((short)21, ((eh)object4).i);
                                    break;
                                }
                                case 17: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)21, ((eh)object4).i);
                                    break;
                                }
                                case 35: {
                                    break;
                                }
                                case 103: {
                                    long l;
                                    Object object3 = object;
                                    Object object4 = object2;
                                    String string = ((eh)object4).j;
                                    if (string != null) {
                                        ((el)object3).a((short)7, string.toLowerCase());
                                    }
                                    if (0L != (l = ((eh)object4).v)) {
                                        ((el)object3).a((short)72, l);
                                    }
                                    if (((eh)object4).K == 0) break;
                                    ((el)object3).a((short)255, (byte)((eh)object4).K);
                                    break;
                                }
                                case 116: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    String string = ((eh)object4).m;
                                    if (string != null) {
                                        ((el)object3).a((short)30, string);
                                    }
                                    if (((eh)object4).K == 0) break;
                                    ((el)object3).a((short)255, (byte)((eh)object4).K);
                                    break;
                                }
                                case 124: {
                                    if (((eh)object2).K == 0) break;
                                    ((el)object).a((short)255, (byte)((eh)object2).K);
                                    break;
                                }
                                case 125: {
                                    el el2 = object;
                                    Object object3 = object2;
                                    Object object4 = this;
                                    if (!((eh)object3).j.toLowerCase().equals(((du)object4).f.toLowerCase())) {
                                        el2.a((short)7, ((eh)object3).j);
                                    }
                                    el2.a((short)205, ((eh)object3).A);
                                    el2.a((short)45, (byte)((eh)object3).F);
                                    break;
                                }
                                case 106: {
                                    long l;
                                    String string;
                                    Object object3 = object;
                                    Object object4 = object2;
                                    String string5 = ((eh)object4).g;
                                    if (string5 != null) {
                                        ((el)object3).a((short)8, string5);
                                    }
                                    if ((string = ((eh)object4).l) != null) {
                                        ((el)object3).a((short)24, string);
                                    }
                                    if (((eh)object4).L != 0) {
                                        ((el)object3).a((short)12, (byte)((eh)object4).L);
                                    }
                                    if (((eh)object4).J != 0) {
                                        ((el)object3).a((short)220, (byte)((eh)object4).J);
                                    }
                                    if ((l = ((eh)object4).v) != 0L) {
                                        ((el)object3).a((short)72, l);
                                    }
                                    string5 = g.a();
                                    String string6 = g.b();
                                    object4 = g.c();
                                    String string7 = g.d();
                                    if (string5 == null || string6 == null || object4 == null || string7 == null) break;
                                    ((el)object3).a((short)81, string5);
                                    ((el)object3).a((short)82, string6);
                                    ((el)object3).a((short)79, (String)object4);
                                    ((el)object3).a((short)80, string7);
                                    break;
                                }
                                case 109: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)7, ((eh)object4).j);
                                    ((el)object3).a((short)209, ((eh)object4).O);
                                    break;
                                }
                                case 111: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)72, ((eh)object4).v);
                                    break;
                                }
                                case 114: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    String string = ((eh)object4).l;
                                    if (string != null) {
                                        ((el)object3).a((short)24, string);
                                    } else {
                                        ((el)object3).a((short)214, (short)((eh)object4).A);
                                    }
                                    if (((eh)object4).K == 0) break;
                                    ((el)object3).a((short)255, (byte)((eh)object4).K);
                                    break;
                                }
                                case 39: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)7, ((eh)object4).h);
                                    ((el)object3).a((short)24, ((eh)object4).l);
                                    if (i.a(((eh)object4).q)) break;
                                    ((el)object3).a((short)109, ((eh)object4).q);
                                    break;
                                }
                                case 104: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    String string = ((eh)object4).j;
                                    short s3 = ((eh)object4).H;
                                    String string3 = ((eh)object4).g;
                                    if (string != null) {
                                        ((el)object3).a((short)7, string);
                                    }
                                    if (s3 != 0) {
                                        ((el)object3).a((short)66, (byte)s3);
                                    }
                                    if (string3 == null) break;
                                    ((el)object3).a((short)8, string3);
                                    break;
                                }
                                case 129: {
                                    break;
                                }
                                case 130: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)20, (byte)0);
                                    break;
                                }
                                case 131: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)20, (byte)0);
                                    ((el)object3).a((short)7, ((eh)object4).j);
                                    break;
                                }
                                case 132: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)20, (byte)0);
                                    ((el)object3).a((short)7, ((eh)object4).j);
                                    break;
                                }
                                case 133: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)20, (byte)0);
                                    break;
                                }
                                case 134: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)4, ((eh)object4).e);
                                    break;
                                }
                                case 135: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)4, ((eh)object4).e);
                                    break;
                                }
                                case 136: {
                                    break;
                                }
                                case 137: {
                                    break;
                                }
                                case 138: {
                                    break;
                                }
                                case 140: {
                                    break;
                                }
                                case 144: {
                                    break;
                                }
                                case 193: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)4, ((eh)object4).e);
                                    if (((eh)object4).K == 0) break;
                                    ((el)object3).a((short)255, (byte)((eh)object4).K);
                                    break;
                                }
                                case 194: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)72, ((eh)object4).v);
                                    if (((eh)object4).K == 0) break;
                                    ((el)object3).a((short)255, (byte)((eh)object4).K);
                                    break;
                                }
                                case 199: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    if (((eh)object4).q != null) {
                                        ((el)object3).a((short)109, ((eh)object4).q);
                                    }
                                    if (((eh)object4).K == 0) break;
                                    ((el)object3).a((short)255, (byte)((eh)object4).K);
                                    break;
                                }
                                case 147: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    if (((eh)object4).j == null) break;
                                    ((el)object3).a((short)7, ((eh)object4).j);
                                    break;
                                }
                                case 148: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)114, (byte)((eh)object4).E);
                                    break;
                                }
                                case 149: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)110, ((eh)object4).j);
                                    ((el)object3).a((short)114, (byte)0);
                                    break;
                                }
                                case 150: {
                                    ((el)object).a((short)110, ((eh)object2).j);
                                    break;
                                }
                                case 158: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    if (((eh)object4).K != 0) {
                                        ((el)object3).a((short)255, (byte)((eh)object4).K);
                                    }
                                    if (((eh)object4).j != null) {
                                        ((el)object3).a((short)7, ((eh)object4).j);
                                    }
                                    ((el)object3).a((short)22, (String)null);
                                    break;
                                }
                                case 159: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)7, ((eh)object4).j);
                                    ((el)object3).a((short)129, (String)null);
                                    break;
                                }
                                case 160: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)129, (String)null);
                                    ((el)object3).a((short)12, (byte)((eh)object4).E);
                                    break;
                                }
                                case 162: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)129, (String)null);
                                    if (((eh)object4).g != null) {
                                        ((el)object3).a((short)8, ((eh)object4).g);
                                    }
                                    if (((eh)object4).J != 0) {
                                        ((el)object3).a((short)220, (byte)((eh)object4).J);
                                    }
                                    if (i.a(((eh)object4).q)) break;
                                    ((el)object3).a((short)109, ((eh)object4).q);
                                    break;
                                }
                                case 163: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)129, (String)null);
                                    ((el)object3).a((short)24, ((eh)object4).l);
                                    if (i.a(((eh)object4).q)) break;
                                    ((el)object3).a((short)109, ((eh)object4).q);
                                    break;
                                }
                                case 164: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)39, ((eh)object4).B);
                                    break;
                                }
                                case 165: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)129, (String)null);
                                    break;
                                }
                                case 166: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)7, ((eh)object4).j);
                                    ((el)object3).a((short)110, (String)null);
                                    if (0L != 0L) {
                                        ((el)object3).a((short)130, 0L);
                                    }
                                    if (0L == 0L) break;
                                    ((el)object3).a((short)59, 0L);
                                    break;
                                }
                                case 167: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)111, ((eh)object4).j);
                                    ((el)object3).a((short)114, ((eh)object4).P);
                                    break;
                                }
                                case 168: {
                                    break;
                                }
                                case 169: {
                                    if (0L != 0L) {
                                        ((el)object).a((short)9, 0L);
                                    }
                                    if (((eh)object2).K == 0) break;
                                    ((el)object).a((short)255, (byte)((eh)object2).K);
                                    break;
                                }
                                case 170: {
                                    ((el)object).a((short)109, ((eh)object2).j);
                                    break;
                                }
                                case 171: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    if (((eh)object4).j != null) {
                                        ((el)object3).a((short)7, ((eh)object4).j);
                                    }
                                    ((el)object3).a((short)115, ((eh)object4).P);
                                    if (((eh)object4).K == 0) break;
                                    ((el)object3).a((short)255, (byte)((eh)object4).K);
                                    break;
                                }
                                case 175: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    if (((eh)object4).K == 0) break;
                                    ((el)object3).a((short)255, (byte)((eh)object4).K);
                                    break;
                                }
                                case 172: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    if (((eh)object4).g != null) {
                                        ((el)object3).a((short)8, ((eh)object4).g);
                                    }
                                    if (((eh)object4).K == 0) break;
                                    ((el)object3).a((short)255, (byte)((eh)object4).K);
                                    break;
                                }
                                case 173: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)110, ((eh)object4).j);
                                    ((el)object3).a((short)114, (byte)0);
                                    break;
                                }
                                case 161: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)129, (String)null);
                                    break;
                                }
                                case 113: {
                                    String string6;
                                    String string4;
                                    String string3;
                                    Object object3 = object;
                                    Object object4 = object2;
                                    byte by = ((eh)object4).P;
                                    if (by == 1) {
                                        ((el)object3).a((short)213, m.a((short)((eh)object4).A));
                                        ((el)object3).a((short)212, ((eh)object4).P);
                                        ((el)object3).a((short)37, 0);
                                        ((el)object3).a((short)68, (byte)0);
                                        string3 = g.a();
                                        string4 = g.b();
                                        String string = g.c();
                                        string6 = g.d();
                                        if (string3 != null && string4 != null && string != null && string6 != null) {
                                            ((el)object3).a((short)81, string3);
                                            ((el)object3).a((short)82, string4);
                                            ((el)object3).a((short)79, string);
                                            ((el)object3).a((short)80, string6);
                                        }
                                    } else {
                                        ((el)object3).a((short)214, m.a((short)((eh)object4).A));
                                        ((el)object3).a((short)23, ((eh)object4).N);
                                    }
                                    if (((eh)object4).K == 0) break;
                                    ((el)object3).a((short)255, (byte)((eh)object4).K);
                                    break;
                                }
                                case 100: {
                                    break;
                                }
                                case 101: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)200, ((eh)object4).u);
                                    ((el)object3).a((short)204, ((eh)object4).z);
                                    if (((eh)object4).K == 0) break;
                                    ((el)object3).a((short)255, (byte)((eh)object4).K);
                                    break;
                                }
                                case 102: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)65, ((eh)object4).t);
                                    if (((eh)object4).K == 0) break;
                                    ((el)object3).a((short)255, (byte)((eh)object4).K);
                                    break;
                                }
                                case 20: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)21, ((eh)object4).i);
                                    ((el)object3).a((short)26, (String)null);
                                    break;
                                }
                                case 18: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)21, ((eh)object4).i);
                                    break;
                                }
                                case 19: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)7, ((eh)object4).j);
                                    ((el)object3).a((short)21, ((eh)object4).i);
                                    break;
                                }
                                case 91: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)72, ((eh)object4).v);
                                    if (((eh)object4).E == 0) break;
                                    ((el)object3).a((short)90, (byte)((eh)object4).E);
                                    break;
                                }
                                case 92: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    ((el)object3).a((short)108, ((eh)object4).w);
                                    if (((eh)object4).v != 0L) {
                                        ((el)object3).a((short)72, ((eh)object4).v);
                                    }
                                    if (((eh)object4).K == 0) break;
                                    ((el)object3).a((short)255, (byte)((eh)object4).K);
                                    break;
                                }
                                case 79: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    if (((eh)object4).j != null) {
                                        ((el)object3).a((short)7, ((eh)object4).j);
                                    }
                                    if (((eh)object4).q != null) {
                                        ((el)object3).a((short)109, ((eh)object4).q);
                                    }
                                    ((el)object3).a((short)114, (byte)0);
                                    break;
                                }
                                case 80: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    if (((eh)object4).K != 0) {
                                        ((el)object3).a((short)255, (byte)((eh)object4).K);
                                    }
                                    ((el)object3).a((short)114, (byte)0);
                                    ((el)object3).a((short)109, ((eh)object4).q);
                                    break;
                                }
                                case 82: {
                                    Object object3 = object;
                                    Object object4 = object2;
                                    if (((eh)object4).K != 0) {
                                        ((el)object3).a((short)255, (byte)((eh)object4).K);
                                    }
                                    ((el)object3).a((short)109, ((eh)object4).q);
                                }
                            }
                            try {
                                this.L.a((el)object, s);
                            }
                            catch (Exception exception) {
                                this.M.a(object2);
                            }
                            continue block114;
                        }
                        object2 = this.I;
                        synchronized (object2) {
                            try {
                                this.I.wait();
                            }
                            catch (Throwable throwable) {}
                            break;
                        }
                    }
                }
            }
            catch (Exception exception) {}
        }
    }

    private static void a(eh eh2, el el2) {
        el2.a((short)21, eh2.i);
        int n2 = 0;
        while (n2 < eh2.r.length) {
            el2.a((short)7, ds.e(eh2.r[n2]));
            if (eh2.s != null && !i.a(eh2.s[n2])) {
                el2.a((short)22, eh2.s[n2]);
            }
            ++n2;
        }
    }

    public final void a(dv dv2) {
        this.J = dv2;
        if (this.K != null) {
            this.K.a(dv2);
        }
        if (this.L != null) {
            this.L.a(dv2);
        }
    }

    public final void a(String string, String string2, short s) {
        this.b = false;
        if (!this.a) {
            throw new RuntimeException("Connection is not READY. Please wait until ChatConnectionListener with method notifyConnected returns");
        }
        if (!i.a(string) && !i.b(string2)) {
            this.f = string.toLowerCase().trim();
            this.g = string2;
            this.i = s;
            this.e();
        }
    }

    private void u() {
        if (this.o == null) {
            throw new RuntimeException("There's no device information. Please call setDevice before start connection");
        }
        eh eh2 = new eh(95);
        new eh(95).D = 0;
        eh2.c = this.o.b;
        eh2.o = null;
        eh2.d = this.o.a;
        eh2.a = this.o.d;
        eh2.x = this.o.e;
        eh2.y = this.o.f;
        eh2.p = this.o.c;
        this.M.a(eh2);
    }

    final void a(String string) {
        if (string != null) {
            if (this.K != null) {
                this.K.a();
                this.K = null;
            }
            if (this.L != null) {
                this.L.a();
                this.L = null;
            }
            this.H = 3;
            if (this.F == null) {
                this.F = new String[]{string};
            } else {
                Object object;
                int n2 = 0;
                while (n2 < this.F.length) {
                    if (i.a(string, this.F[n2])) {
                        object = this.F[0];
                        this.F[0] = string;
                        this.F[n2] = object;
                        break;
                    }
                    ++n2;
                }
                if (n2 >= this.F.length) {
                    object = new String[this.F.length + 1];
                    System.arraycopy(this.F, 0, object, 1, this.F.length);
                    object[0] = string;
                    this.F = object;
                }
            }
            if (this.J != null && !this.b) {
            }
            this.t();
            return;
        }
        this.v();
    }

    private void v() {
        ct.a("[OLA] Request Authentication");
        eh eh2 = new eh(96);
        new eh(96).D = 0;
        eh2.c = this.o.b;
        eh2.o = null;
        eh2.d = this.o.a;
        eh2.a = this.o.d;
        eh2.x = this.o.e;
        eh2.y = this.o.f;
        eh2.p = this.o.c;
        this.M.a(eh2);
        this.t();
    }

    final void e() {
        ct.a("[OLA] Submit Authentication");
        if (this.J != null && !this.b) {
        }
        this.l = j.a(this.m, this.g);
        eh eh2 = new eh(97);
        new eh(97).E = this.i;
        eh2.b = this.f;
        eh2.M = this.l;
        eh2.D = 0;
        eh2.c = this.o.b;
        eh2.f = "5.1.2";
        eh2.o = null;
        eh2.d = this.o.a;
        eh2.a = this.o.d;
        eh2.x = this.o.e;
        eh2.y = this.o.f;
        eh2.p = this.o.c;
        if (!i.b(null)) {
            if (!i.b(null)) {
                eh2.n = String.valueOf(null) + " " + null;
            }
        }
        this.M.a(eh2);
        this.t();
    }

    final void f() {
        this.N = 3;
        this.P = 0L;
    }

    public final void g() {
        if (this.c) {
            long l = System.currentTimeMillis();
            if (l - this.P >= 120000L) {
                if (this.N == 0) {
                    this.d();
                    return;
                }
                --this.N;
                if (this.H == 2) {
                    eh eh2 = new eh(42);
                    this.M.a(eh2);
                }
                this.P = l;
                this.t();
            }
            du du2 = this;
            long l2 = System.currentTimeMillis();
            if (l2 - du2.Q >= 300000L) {
                du2.Q = System.currentTimeMillis();
                eh eh3 = new eh(168);
                du2.M.a(eh3);
                du2.t();
            }
        }
    }

    final void h() {
        this.N = 3;
    }

    public final void a(int n2) {
        eh eh2 = new eh(9);
        new eh(9).B = n2;
        eh2.G = 0;
        this.M.a(eh2);
        this.t();
    }

    public final void i() {
        eh eh2 = new eh(140);
        this.M.a(eh2);
        this.t();
    }

    public final void a(String string, String string2, String string3) {
        this.a(string, string2, null, (short)0);
    }

    public final void a(String string, String string2, String string3, short s) {
        if (string == null) {
            throw new RuntimeException("Null receiver Id");
        }
        eh eh2 = new eh(14);
        if (s > 0) {
            eh2.J = s;
        }
        eh2.h = ds.e(string);
        eh2.g = string2;
        if (!i.a(string3)) {
            eh2.q = "id=" + string3;
        }
        this.M.a(eh2);
        this.t();
    }

    public final void b(String string) {
        eh eh2 = new eh(44);
        new eh(44).j = ds.e(string);
        this.M.a(eh2);
        this.t();
    }

    private void a(short s, String string, boolean bl) {
        this.h = string;
        this.i = s;
        eh eh2 = new eh(21);
        new eh(21).E = s;
        if (!i.a(string)) {
            this.i = (short)2;
            eh2.k = string;
            eh2.E = this.i;
        } else {
            this.h = null;
        }
        eh2.Q = true;
        this.M.a(eh2);
        this.t();
    }

    public final void c(String string) {
        this.a((short)2, string, true);
    }

    public final void a(short s) {
        this.a(s, null, true);
    }

    public final void j() {
        eh eh2 = new eh(6);
        this.M.a(eh2);
        this.t();
    }

    public final void b(int n2) {
        this.q = 0;
        this.R = 0;
        this.t = 0;
        this.X = 0L;
        this.r = 0;
        this.q = 0;
        eh eh2 = new eh(115);
        new eh(115).l = "Test";
        eh2.B = n2;
        this.M.a(eh2);
        this.t();
    }

    final void c(int n2) {
        ++this.R;
        if (n2 > 0) {
            if (this.R % 9 == 0) {
                long l = System.currentTimeMillis();
                if (l - this.X <= 1000L) {
                    try {
                        Thread.sleep(1000L);
                    }
                    catch (Throwable throwable) {
                        Throwable throwable2 = throwable;
                        throwable.printStackTrace();
                    }
                }
                this.X = System.currentTimeMillis();
            }
        } else {
            this.X = System.currentTimeMillis();
        }
        eh eh2 = new eh(115);
        eh2.A = this.t = n2 + 1;
        this.M.a(eh2);
        this.t();
    }

    public final void a(String object, String string) {
        String string2 = object;
        object = null;
        String[] stringArray = new String[]{string};
        string = string2;
        object = this;
        Object object2 = stringArray;
        if (!(stringArray == null || ((String[])object2).length == 0)) {
            object2 = new eh(15);
            new eh(15).i = string;
            object2.r = stringArray;
            object2.s = null;
            ((du)object).M.a(object2);
            super.t();
        }
    }

    public final void a(String string, long l, short s) {
        eh eh2 = new eh(103);
        new eh(103).j = string;
        eh2.v = l;
        eh2.K = s;
        this.z = s;
        this.M.a(eh2);
        this.t();
    }

    public final void a(long l, long l2, short s) {
        eh eh2 = new eh(92);
        new eh(92).v = l2;
        eh2.w = l;
        this.p = l;
        eh2.K = s;
        this.z = s;
        this.M.a(eh2);
        this.t();
    }

    public final void a(long l, short s) {
        eh eh2 = new eh(91);
        new eh(91).v = l;
        eh2.E = s;
        this.M.a(eh2);
        this.t();
    }

    public final void b(String string, String string2, short s) {
        this.a(string, 0L, string2, (short)0, s);
    }

    public final void a(String string, long l, String string2, short s) {
        this.a(string, l, null, (short)1, s);
    }

    private void a(String string, long l, String string2, short s, short s2) {
        eh eh2 = new eh(106);
        new eh(106).g = string;
        eh2.v = l;
        eh2.l = string2;
        eh2.L = s;
        eh2.J = s2;
        this.M.a(eh2);
        this.t();
    }

    final void b(String string, String object) {
        byte[] byArray;
        if (i.a((String)object)) {
            return;
        }
        eh eh2 = new eh(109);
        try {
            byArray = i.c((String)object, null);
        }
        catch (Exception exception) {
            byArray = ((String)object).getBytes();
        }
        if (byArray != null) {
            byte[] byArray2 = new byte[byArray.length + 1];
            object = byArray2;
            byArray2[0] = 5;
            System.arraycopy(byArray, 0, object, 1, byArray.length);
            eh2.j = string;
            eh2.O = (byte[])object;
            this.M.a(eh2);
            this.t();
        }
    }

    public final void a(long l) {
        eh eh2 = new eh(111);
        new eh(111).v = l;
        this.M.a(eh2);
        this.t();
    }

    public final void a(String string, short s) {
        eh eh2 = new eh(116);
        new eh(116).m = string;
        eh2.K = s;
        this.M.a(eh2);
        this.A = s;
        this.t();
    }

    public final void b(String string, short s) {
        if (this.d) {
            this.J.c_();
            return;
        }
        du du2 = this;
        this.d = true;
        du2.n = null;
        du2.u = 0;
        du2.w = 0;
        du2.U = 0;
        du2.v = 0;
        int cfr_ignored_0 = du2.U;
        short cfr_ignored_1 = du2.W;
        du2.J.a(du2.u, du2.w);
        this.y = string;
        this.W = s;
        eh eh2 = new eh(114);
        new eh(114).l = string;
        eh2.K = this.W;
        this.M.a(eh2);
        this.t();
    }

    public final void c(String object, short s) {
        this.l();
        this.y = null;
        this.W = s;
        object = new eh(114);
        new eh(114).l = null;
        ((eh)object).K = this.W;
        this.M.a(object);
        this.t();
    }

    public final void k() {
        this.d(0);
    }

    final void d(int n2) {
        int n3 = n2;
        Object object = this;
        if (((du)object).d) {
            ++((du)object).U;
            int cfr_ignored_0 = ((du)object).U;
            int cfr_ignored_1 = ((du)object).x;
            short cfr_ignored_2 = ((du)object).W;
            ((du)object).J.a(((du)object).u, ((du)object).w);
            if (n3 > 0) {
                if (((du)object).U % 9 == 0) {
                    long l = System.currentTimeMillis();
                    if (l - ((du)object).V <= 1000L) {
                        try {
                            Thread.sleep(1000L);
                        }
                        catch (Throwable throwable) {
                            Throwable throwable2 = throwable;
                            throwable.printStackTrace();
                        }
                    }
                    ((du)object).V = System.currentTimeMillis();
                }
            } else {
                ((du)object).V = System.currentTimeMillis();
            }
        }
        object = new eh(114);
        ((eh)object).A = this.v = n2 + 1;
        ((eh)object).K = this.W;
        this.M.a(object);
        this.t();
    }

    public final void l() {
        this.y = null;
        this.d = false;
        this.n = null;
        this.u = 0;
        this.w = 0;
        this.W = 0;
    }

    public final void m() {
        this.e = false;
        this.O = null;
        this.S = 0;
        this.T = 0;
    }

    public final void b(String string, String object, String string2) {
        object = new eh(39);
        new eh(39).h = ds.e(string);
        ((eh)object).l = string2;
        if (!i.a(null)) {
            ((eh)object).q = "id=" + null;
        }
        this.M.a(object);
        this.t();
    }

    private void a(String string, short s, String object) {
        object = new eh(104);
        new eh(104).j = ds.e(string);
        ((eh)object).H = s;
        ((eh)object).g = null;
        this.M.a(object);
        this.t();
    }

    public final void d(String string) {
        this.a(string, (short)1, null);
    }

    public final void e(String string) {
        this.a(string, (short)0, null);
        if (this.J != null) {
        }
    }

    public final void n() {
        eh eh2 = new eh(100);
        this.M.a(eh2);
        this.t();
    }

    public final void a(long l, int n2) {
        eh eh2 = new eh(101);
        new eh(101).u = l;
        eh2.z = n2;
        this.M.a(eh2);
        this.t();
    }

    public final void b(long l) {
        eh eh2 = new eh(102);
        new eh(102).t = l;
        this.M.a(eh2);
        this.t();
    }

    public final void o() {
        eh eh2 = new eh(128);
        this.M.a(eh2);
        this.t();
    }

    public final void b(short s) {
        eh eh2 = new eh(124);
        new eh(124).K = (short)2412;
        this.M.a(eh2);
        this.t();
    }

    public final void a(String string, int n2, short s) {
        eh eh2 = new eh(125);
        new eh(125).j = ds.e(string);
        eh2.A = n2;
        eh2.F = s;
        this.M.a(eh2);
        this.t();
    }

    public final void f(String string) {
        if (i.a(string)) {
            return;
        }
        eh eh2 = new eh(134);
        new eh(134).e = string;
        this.M.a(eh2);
        this.t();
    }

    public final void g(String string) {
        if (i.a(string)) {
            return;
        }
        eh eh2 = new eh(135);
        new eh(135).e = string;
        this.M.a(eh2);
        this.t();
    }

    public final void p() {
        eh eh2 = new eh(136);
        this.M.a(eh2);
        this.t();
    }

    public final void q() {
        eh eh2 = new eh(35);
        this.M.a(eh2);
        this.t();
    }

    public final void r() {
        eh eh2 = new eh(137);
        this.M.a(eh2);
        this.t();
    }

    public final void s() {
        eh eh2 = new eh(138);
        this.M.a(eh2);
        this.t();
    }

    public final void c(String string, String string2) {
        eh eh2 = new eh(65);
        new eh(65).j = string2;
        eh2.m = string;
        this.M.a(eh2);
        this.t();
    }
}
