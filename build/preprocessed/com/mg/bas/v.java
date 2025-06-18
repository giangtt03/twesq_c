package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// Global game state and configuration variables (flags, arrays, settings).
public final class v {
    public static boolean a = true;
    public static boolean b = false;
    public static int[] c = new int[300];
    public static int d = 0;
    public static int e;
    public static int f;
    public static boolean g;
    public static final byte[][] h;
    public static final byte[][] i;
    public static final byte[][] j;
    public static final byte[][] k;
    public static boolean l;
    public static byte[] m;
    public static long n;
    public static boolean o;
    public static int p;
    public static int[] q;
    public static int r;
    public static int s;
    public static int t;
    public static int u;
    public static int v;
    public static int w;
    public static int x;
    public static int y;
    public static boolean z;
    public static int A;
    public static int B;
    public static int C;
    public static int D;
    public static int E;
    public static int F;
    public static boolean G;
    public static boolean H;
    public static boolean I;
    public static int J;
    public static int K;
    public static int L;
    public static boolean M;
    public static boolean N;
    public static boolean O;
    public static boolean P;
    public static int Q;
    public static int R;
    public static boolean S;
    public static int T;
    public static boolean U;
    public static boolean V;
    public static boolean W;
    public static boolean X;
    public static int Y;
    public static boolean Z;
    public static int aa;
    public static int ab;
    public static String ac;
    public static String ad;
    public static boolean ae;
    public static boolean af;
    public static boolean ag;
    public static boolean ah;
    public static boolean ai;
    public static int aj;
    public static int ak;
    public static int al;
    public static int am;

    static {
        g = true;
        h = new byte[][]{{103, 3, -118, -86}, {-67, -99, -59, -116}, {32, 4, -32, -14}, {7, 108, -51, -109}, {-10, -107, 67, -96}, {116, -102, -114, 108}, {71, 56, -88, -10}, {-128, -87, -17, -45}, {-65, 67, 52, -94}, {50, -72, -110, 61}};
        i = new byte[][]{{-125, 12, -1, -80}, {-70, -61, 100, -82}, {-110, -45, -90, -81}, {-14, 55, 7, -104}, {-37, -45, -18, -18}, {119, 86, -37, 35}, {-103, -82, -106, 49}, {-30, 53, 17, -110}, {-86, 23, 98, -98}, {-102, 103, 86, 74}};
        j = new byte[][]{{5, -1, -84, 81}, {122, -7, 6, -51}, {-73, 70, 85, -18}, {-83, 104, -66, 81}, {-15, -79, -56, 68}, {35, 24, 49, -17}, {-6, -71, 55, -40}, {124, 98, -53, -34}, {66, 28, 84, 78}, {-62, 32, 35, -48}};
        k = new byte[][]{{68, 65, -8, -61}, {-35, 76, 8, 72}, {107, -37, 102, 38}, {-114, -109, 73, 6}, {48, -22, 4, 4}, {11, 67, 89, -56}, {-66, -85, 17, 111}, {-104, 58, 67, -42}, {82, 2, -100, -95}, {29, 69, -46, 16}};
        l = true;
        m = new byte[]{-84, -43, -55, -93, -4, -23, 108, -50, 92, -81, -74, -27, 96, 12, -104, -108};
        n = 40L;
        o = false;
        p = 6;
        q = new int[]{3, 3, 1000, 3, 3, 3};
        r = 176;
        s = 220;
        t = 10;
        u = 10;
        v = 10;
        w = 10;
        z = false;
        A = -1;
        B = -1;
        C = -1;
        D = -1;
        E = -1;
        F = -1;
        G = false;
        H = false;
        I = false;
        J = 1;
        K = 1;
        L = 0;
        N = true;
        O = true;
        P = true;
        Q = 80;
        R = 100;
        S = true;
        T = 4;
        U = true;
        V = true;
        X = false;
        Y = 0;
        Z = false;
        aa = 4;
        ae = false;
        af = false;
        ag = false;
        ah = false;
        ai = false;
        al = 0;
        am = 200038;
        v.a(200038);
    }

    public static boolean a() {
        return L == 1 || L == 0;
    }

    public static boolean b() {
        return ai || L == 2 || z;
    }

    public static void c() {
        int n = 0;
        while (n < 300) {
            v.c[n] = 0;
            ++n;
        }
    }

    public static final String d() {
        return "" + (X ? 1 : 0) + 0 + ci.f + ci.g + ci.h + ci.i + ci.j + 5 + 300000L;
    }

    public static void a(int n) {
        aj = n;
        int n2 = n >> 16 & 0xFF;
        int n3 = n >> 8 & 0xFF;
        ak = (255 - n2) / 6 + n2 << 16 | (255 - n3) / 6 + n3 << 8 | (255 - (n &= 0xFF)) / 6 + n;
    }

    public static final void a(int n, int n2, boolean bl) {
        t = n;
        u = n2;
        if (t > v) {
            t = v;
        }
        if (u > w) {
            u = w;
        }
        if (!bl) {
            if (t > 240) {
                t = 240;
            }
            if (u > 320) {
                u = 320;
            }
        }
        if ((u < 320 || t < 240) && u >= 240) {
        }
        v.e();
        ag.a().d();
    }

    public static void e() {
        x = (v - t) / 2;
        y = (w - u) / 2;
    }
}
