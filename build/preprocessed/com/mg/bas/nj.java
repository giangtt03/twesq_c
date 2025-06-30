package com.mg.bas;
// Decompiled with: Procyon 0.6.0
// Class Version: 1
public final class nj implements mr
{
    private static nj h;
    private static nj i;
    private static nj j;
    private static nj k;
    private static nj l;
    private static nj m;
    private static nj n;
    private static nj o;
    private static nj p;
    private static nj q;
    private static nj r;
    private static nj s;
    private static nj t;
    private static nj u;
    private static nj v;
    private static nj w;
    private static nj z;
    private static nj A;
    private static nj B;
    public static nj a;
    public static nj b;
    public byte c;
    public byte d;
    public int e;
    public byte f;
    public byte g;
    
    private nj(final byte c, final byte d, final int e, final byte f, final byte g) {
        super();
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static void a() {
        nj.h = new nj((byte)0, (byte)0, 1, (byte)1, (byte)0);
        nj.i = new nj((byte)1, (byte)1, 2, (byte)1, (byte)1);
        nj.j = new nj((byte)2, (byte)2, 4, (byte)1, (byte)2);
        nj.k = new nj((byte)3, (byte)3, 8, (byte)1, (byte)3);
        nj.l = new nj((byte)4, (byte)4, 16, (byte)1, (byte)4);
        nj.m = new nj((byte)5, (byte)5, 32, (byte)1, (byte)5);
        nj.n = new nj((byte)10, (byte)0, 1, (byte)2, (byte)8);
        nj.o = new nj((byte)11, (byte)1, 2, (byte)2, (byte)1);
        nj.p = new nj((byte)12, (byte)2, 4, (byte)2, (byte)2);
        nj.q = new nj((byte)13, (byte)3, 8, (byte)2, (byte)3);
        nj.r = new nj((byte)14, (byte)4, 16, (byte)2, (byte)4);
        nj.s = new nj((byte)15, (byte)5, 32, (byte)2, (byte)5);
        nj.t = new nj((byte)20, (byte)0, 1, (byte)4, (byte)0);
        nj.u = new nj((byte)21, (byte)1, 2, (byte)4, (byte)1);
        nj.v = new nj((byte)22, (byte)2, 4, (byte)4, (byte)2);
        nj.w = new nj((byte)23, (byte)3, 8, (byte)4, (byte)3);
        nj.z = new nj((byte)24, (byte)4, 16, (byte)4, (byte)4);
        nj.A = new nj((byte)25, (byte)5, 32, (byte)4, (byte)5);
        nj.B = new nj((byte)70, (byte)70, 64, (byte)1, (byte)6);
        nj.a = new nj((byte)90, (byte)90, 0, (byte)1, (byte)(-1));
        nj.b = new nj((byte)99, (byte)99, 16777216, (byte)1, (byte)(-1));
    }
    
    public static void b() {
        nj.h = null;
        nj.i = null;
        nj.j = null;
        nj.k = null;
        nj.l = null;
        nj.m = null;
        nj.n = null;
        nj.o = null;
        nj.p = null;
        nj.q = null;
        nj.r = null;
        nj.s = null;
        nj.t = null;
        nj.u = null;
        nj.v = null;
        nj.w = null;
        nj.z = null;
        nj.A = null;
        nj.B = null;
        nj.a = null;
        nj.b = null;
    }
    
    public static nj a(final int n) {
        switch (n) {
            case 0: {
                return nj.h;
            }
            case 1: {
                return nj.i;
            }
            case 2: {
                return nj.j;
            }
            case 3: {
                return nj.k;
            }
            case 4: {
                return nj.l;
            }
            case 5: {
                return nj.m;
            }
            case 10: {
                return nj.n;
            }
            case 11: {
                return nj.o;
            }
            case 12: {
                return nj.p;
            }
            case 13: {
                return nj.q;
            }
            case 14: {
                return nj.r;
            }
            case 15: {
                return nj.s;
            }
            case 20: {
                return nj.t;
            }
            case 21: {
                return nj.u;
            }
            case 22: {
                return nj.v;
            }
            case 23: {
                return nj.w;
            }
            case 24: {
                return nj.z;
            }
            case 25: {
                return nj.A;
            }
            case 70: {
                return nj.B;
            }
            case 90: {
                return nj.a;
            }
            case 99: {
                return nj.b;
            }
        }
        ct.a("[NodeChess]==========khoong co id nay " + n);
        return null;
    }
    
    public final String toString() {
        return "Nodechess id = " + this.d + "  indexIma = " + this.g + "  mask = " + this.e + " typoe  " + this.f;
    }
}
