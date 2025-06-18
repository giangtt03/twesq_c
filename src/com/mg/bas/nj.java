package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class nj
implements mr {
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

    private nj(byte by, byte by2, int n, byte by3, byte by4) {
        this.c = by;
        this.d = by2;
        this.e = n;
        this.f = by3;
        this.g = by4;
    }

    public static void a() {
        h = new nj(0, 0, 1, 1, 0);
        i = new nj(1, 1, 2, 1, 1);
        j = new nj(2, 2, 4, 1, 2);
        k = new nj(3, 3, 8, 1, 3);
        l = new nj(4, 4, 16, 1, 4);
        m = new nj(5, 5, 32, 1, 5);
        n = new nj(10, 0, 1, 2, 8);
        o = new nj(11, 1, 2, 2, 1);
        p = new nj(12, 2, 4, 2, 2);
        q = new nj(13, 3, 8, 2, 3);
        r = new nj(14, 4, 16, 2, 4);
        s = new nj(15, 5, 32, 2, 5);
        t = new nj(20, 0, 1, 4, 0);
        u = new nj(21, 1, 2, 4, 1);
        v = new nj(22, 2, 4, 4, 2);
        w = new nj(23, 3, 8, 4, 3);
        z = new nj(24, 4, 16, 4, 4);
        A = new nj(25, 5, 32, 4, 5);
        B = new nj(70, 70, 64, 1, 6);
        a = new nj(90, 90, 0, 1, -1);
        b = new nj(99, 99, 0x1000000, 1, -1);
    }

    public static void b() {
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        z = null;
        A = null;
        B = null;
        a = null;
        b = null;
    }

    public static nj a(int n) {
        switch (n) {
            case 0: {
                return h;
            }
            case 1: {
                return i;
            }
            case 2: {
                return j;
            }
            case 3: {
                return k;
            }
            case 4: {
                return l;
            }
            case 5: {
                return m;
            }
            case 10: {
                return nj.n;
            }
            case 11: {
                return o;
            }
            case 12: {
                return p;
            }
            case 13: {
                return q;
            }
            case 14: {
                return r;
            }
            case 15: {
                return s;
            }
            case 20: {
                return t;
            }
            case 21: {
                return u;
            }
            case 22: {
                return v;
            }
            case 23: {
                return w;
            }
            case 24: {
                return z;
            }
            case 25: {
                return A;
            }
            case 70: {
                return B;
            }
            case 71: {
                break;
            }
            case 90: {
                return a;
            }
            case 99: {
                return b;
            }
        }
        ct.a("[NodeChess]==========khoong co id nay " + n);
        return null;
    }

    public final String toString() {
        return "Nodechess id = " + this.d + "  indexIma = " + this.g + "  mask = " + this.e + " typoe  " + this.f;
    }
}
