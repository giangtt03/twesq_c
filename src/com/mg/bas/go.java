package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class go {
    public static int a = 0;
    public static int b = 0;
    public static int c = 0;
    public static int d = 0;
    public static String e = "";
    public static String f = "";
    public static String g = "";
    public static boolean h = false;
    public static boolean i;
    public static boolean j;
    public static lh k;
    public static ll[] l;
    public static lm[] m;
    public static int n;
    public static int o;
    public static b p;
    public static b q;
    public static lw[] r;
    public static long s;
    public static boolean t;
    public static ll[] u;
    public static lm[] v;
    public static String w;
    public static int x;

    static {
        j = false;
        l = new ll[0];
        m = new lm[0];
        n = 50;
        o = 0;
        p = new gp(0);
        q = new gq(0);
        s = -1L;
        t = true;
        u = null;
        v = null;
    }

    public static void a() {
        k = null;
        r = null;
        l = new ll[0];
        m = new lm[0];
        s = -1L;
    }

    public static void a(ll[] llArray, lm[] lmArray, int n, int n2) {
        l = llArray;
        m = lmArray;
        go.n = n;
        o = n2;
    }

    public static void a(ll ll2) {
        ll[] llArray = new ll[l.length + 1];
        System.arraycopy(l, 0, llArray, 0, l.length);
        llArray[llArray.length - 1] = ll2;
        l = llArray;
    }

    public static void b(ll ll2) {
        ll[] llArray = new ll[l.length - 1];
        int n = 0;
        int n2 = 0;
        while (n2 < l.length) {
            if (l[n2] != ll2) {
                llArray[n] = l[n2];
                ++n;
            }
            ++n2;
        }
        l = llArray;
    }

    public static void a(lm lm2, int n) {
        int n2 = 0;
        while (n2 < m.length) {
            if (lm2.a == go.m[n2].a) {
                go.m[n2].g += n;
                return;
            }
            ++n2;
        }
        lm[] lmArray = new lm[m.length + 1];
        System.arraycopy(m, 0, lmArray, 0, m.length);
        lmArray[lmArray.length - 1] = lm2;
        m = lmArray;
    }

    public static void a(lm lm2) {
        go.b(lm2.a, lm2.g);
    }

    public static void a(int n, int n2) {
        if (n2 == 0) {
            go.b(n, Integer.MAX_VALUE);
            return;
        }
        int n3 = 0;
        while (n3 < m.length) {
            if (go.m[n3].a == n) {
                go.m[n3].g = n2;
                return;
            }
            ++n3;
        }
    }

    public static void b(int n, int n2) {
        int n3 = 0;
        while (n3 < m.length) {
            if (go.m[n3].a == n) {
                go.m[n3].g -= n2;
                if (go.m[n3].g <= 0) {
                    lm[] lmArray = new lm[m.length - 1];
                    System.arraycopy(m, 0, lmArray, 0, n3);
                    n2 = n3 + 1;
                    System.arraycopy(m, n2, lmArray, n3, m.length - n2);
                }
                return;
            }
            ++n3;
        }
    }

    public static boolean b() {
        int n = l.length;
        n -= go.k.D.length;
        int n2 = 0;
        while (n2 < m.length) {
            n = go.m[n2].e == 7 ? (n += go.m[n2].g) : ++n;
            ++n2;
        }
        return n >= go.n;
    }
}
