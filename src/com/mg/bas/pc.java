package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// UI/game component for rendering various images and graphical elements (e.g., chess, icons).
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class pc
extends cw {
    private static final Image i = f.d("/focusmovechess1");
    public static Image b = f.d("/crystalblue");
    public static Image c = f.d("/notifygtmicon");
    private static Image j = f.d("/tab");
    private static Image k = f.d("/dialog/corner");
    private static Image l = f.d("/corner/2");
    public static Image d = f.d("/hiddendragon");
    public static final Image e = f.d("/m/hand");
    public static final Image f = f.d("/m/arrow");
    private static Image m = null;
    private static int[] n;
    private static int[] o;
    public static final int[] g;
    private static int[] p;
    private static Image q;
    private static Image r;
    public static Image h;
    private static int s;
    private static Image t;
    private static Image u;
    private static int v;
    private static int w;

    static {
        int[] nArray = new int[25];
        nArray[1] = 9;
        nArray[2] = 24;
        nArray[3] = 33;
        nArray[4] = 43;
        nArray[5] = 59;
        nArray[6] = 67;
        nArray[7] = 73;
        nArray[8] = 89;
        nArray[9] = 105;
        nArray[10] = 121;
        nArray[11] = 137;
        nArray[12] = 152;
        nArray[13] = 163;
        nArray[14] = 179;
        nArray[15] = 202;
        nArray[16] = 210;
        nArray[17] = 221;
        nArray[18] = 229;
        nArray[19] = 243;
        nArray[20] = 259;
        nArray[21] = 275;
        nArray[22] = 291;
        nArray[23] = 305;
        nArray[24] = 315;
        n = nArray;
        o = new int[25];
        g = new int[]{9, 15, 9, 10, 16, 8, 6, 16, 16, 16, 16, 15, 11, 16, 23, 8, 11, 8, 14, 16, 16, 16, 14, 10, 6};
        p = new int[]{9, 15, 15, 12, 16, 11, 10, 16, 16, 16, 16, 13, 15, 16, 20, 8, 10, 14, 8, 16, 16, 16, 14, 11, 12};
        q = f.d("/hiddenphoenix");
        r = f.d("/roomicon");
        h = f.d("/elementsicon");
        s = 0;
        t = null;
    }

    public static void a(Graphics graphics, int n, int n2, int n3, int n4, boolean bl) {
        int n5 = 10323806;
        int n6 = 14273459;
        int n7 = 15722458;
        if (bl) {
            n5 = 22523;
            n6 = 9287679;
            n7 = 13295359;
        }
        pc.b(graphics, n, n2, n3, n4, n5, n7, n6);
    }

    public static void b(Graphics graphics, int n, int n2, int n3, int n4) {
        cw.a(graphics, j, n3 * 35, 0, 35, 37, n, n2, 3);
    }

    public static void b(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        pc.a(graphics, n, n2, n3, n4, n5, n7);
        graphics.setColor(n6);
        graphics.fillRect(n + 1, n2 + n4 - 2, n3 - 2, 1);
        graphics.fillRect(n + n3 - 2, n2 + 1, 1, n4 - 2);
    }

    public static void c(Graphics graphics, int n, int n2, int n3, int n4, int n5) {
        cw.b(graphics, 22246, n, n2, n3, n4);
        graphics.setColor(16579546);
        graphics.drawRect(n + 1, n2 + 1, n3 - 3, n4 - 3);
        graphics.setColor(230911);
        graphics.drawRect(n + 2, n2 + 2, n3 - 5, n4 - 5);
        if (n5 > 0) {
            graphics.setColor(n5);
            graphics.fillRect(n + 3, n2 + 3, n3 - 6, n4 - 6);
        }
        graphics.drawImage(k, n, n2, 0);
        graphics.drawRegion(k, 0, 0, k.getWidth(), k.getHeight(), 2, n + n3, n2, 24);
        graphics.drawRegion(k, 0, 0, k.getWidth(), k.getHeight(), 1, n, n2 + n4, 36);
        graphics.drawRegion(k, 0, 0, k.getWidth(), k.getHeight(), 3, n + n3, n2 + n4, 40);
    }

    public static void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, boolean bl) {
        if (n5 >= 0) {
            graphics.setColor(n5);
            graphics.fillRect(n + 3, n2 + 4, n3 - 6, n4 - 8);
        }
        if (bl) {
            graphics.drawImage(d, n + n3, n2 + n4 - 4, 40);
        }
        graphics.setColor(51967);
        graphics.drawRect(n + 1, n2 + 1, n3 - 3, n4 - 3);
        graphics.setColor(9975807);
        graphics.drawRect(n + 2, n2 + 3, n3 - 5, n4 - 7);
        graphics.setColor(8972031);
        graphics.fillRect(n + 2, n2 + 2, n3 - 4, 1);
        graphics.fillRect(n + 2, n2 + n4 - 3, n3 - 4, 1);
        graphics.setColor(22246);
        graphics.fillRect(n + 4, n2, n3 - 8, 1);
        graphics.fillRect(n + 4, n2 + n4 - 1, n3 - 8, 1);
        graphics.fillRect(n, n2 + 4, 1, n4 - 8);
        graphics.fillRect(n + n3 - 1, n2 + 4, 1, n4 - 8);
        graphics.drawImage(l, n, n2, 0);
        graphics.drawRegion(l, 0, 0, l.getWidth(), l.getHeight(), 2, n + n3, n2, 24);
        graphics.drawRegion(l, 0, 0, l.getWidth(), l.getHeight(), 1, n, n2 + n4, 36);
        graphics.drawRegion(l, 0, 0, l.getWidth(), l.getHeight(), 3, n + n3, n2 + n4, 40);
    }

    public static void d(Graphics graphics, int n, int n2, int n3, int n4, int n5) {
        pc.a(graphics, n, n2, n3, n4, n5, false);
    }

    public static void c(Graphics graphics, int n, int n2, int n3, int n4) {
        graphics.setColor(19, 87, 151);
        graphics.drawRect(n, n2, n3, n4);
        graphics.drawRect(++n, ++n2, n3 -= 2, n4 -= 2);
        graphics.setColor(32, 165, 222);
        graphics.drawLine(++n, n2, n + (n3 -= 2), n2);
        graphics.drawLine(n, n2 + n4, n + n3, n2 + n4);
        graphics.drawLine(n, n2 + 1, n, n2 + 1);
        graphics.drawLine(n, n2 + n4 - 1, n + 1, n2 + n4);
        graphics.drawLine(--n, ++n2, n, n2 + (n4 -= 2));
        graphics.drawLine(n += n3 + 2, n2, n, n2 + n4);
        graphics.drawLine(n - 1, n2, n, n2 + 1);
        graphics.drawLine(n - 1, n2 + n4, n, n2 + n4);
    }

    public static void a(Graphics graphics, k k2, int n, int[] nArray, int n2, int n3) {
        graphics.setColor(nArray[0]);
        graphics.drawLine(k2.a + n2 + 1, k2.b + n3, k2.a + n2 + k2.c - 2, k2.b + n3);
        graphics.drawLine(k2.a + n2 + 1, k2.b + n3 + k2.d - 1, k2.a + n2 + k2.c - 2, k2.b + n3 + k2.d - 1);
        graphics.drawLine(k2.a + n2, k2.b + n3 + 1, k2.a + n2, k2.b + n3 + k2.d - 2);
        graphics.drawLine(k2.a + n2 + k2.c - 1, k2.b + n3 + 1, k2.a + n2 + k2.c - 1, k2.b + n3 + k2.d - 2);
        int n4 = 1;
        if (n > 0) {
            int n5 = 1;
            while (n5 < k2.d - 1) {
                if (n5 < nArray.length) {
                    graphics.setColor(nArray[n5]);
                }
                graphics.drawLine(k2.a + n2 + 1, k2.b + n3 + n4, k2.a + n2 + n, k2.b + n3 + n4);
                ++n4;
                ++n5;
            }
        }
    }

    public static void a(Graphics graphics, k k2, int n) {
        pc.a(graphics, k2, 0, 0, n);
    }

    public static void a(Graphics graphics, k k2, int n, int n2, int n3) {
        pc.e(graphics, k2.a + n, k2.b + n2, k2.c, k2.d, n3);
    }

    public static void e(Graphics graphics, int n, int n2, int n3, int n4, int n5) {
        int n6 = i.getWidth() - 7;
        int n7 = i.getHeight() - 7;
        cw.a(graphics, i, 0, 0, 7, 7, n + n5, n2 + n5, 20);
        cw.a(graphics, i, n6, 0, 7, 7, n + n3 - n5, n2 + n5, 24);
        cw.a(graphics, i, 0, n7, 7, 7, n + n5, n2 + n4 - n5, 36);
        cw.a(graphics, i, n6, n7, 7, 7, n + n3 - n5, n2 + n4 - n5, 40);
    }

    public static final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6) {
        if (n6 >= 0) {
            graphics.setColor(n6);
            graphics.fillRect(n + 1, n2 + 1, n3 - 2, n4 - 2);
        }
        graphics.setColor(n5);
        graphics.fillRect(n + 1, n2, n3 - 2, 1);
        graphics.fillRect(n + 1, n2 + n4 - 1, n3 - 2, 1);
        graphics.fillRect(n, n2 + 1, 1, n4 - 2);
        graphics.fillRect(n + n3 - 1, n2 + 1, 1, n4 - 2);
    }

    public static void b(Graphics graphics, int n, int n2, int n3, int n4, int n5, boolean bl) {
        graphics.setColor(230911);
        graphics.drawLine(n + 2, n2, n + n3 - 2, n2);
        graphics.drawLine(n + 2, n2 + n4, n + n3 - 2, n2 + n4);
        graphics.drawLine(n, n2 + 2, n, n2 + n4 - 2);
        graphics.drawLine(n + n3, n2 + 2, n + n3, n2 + n4 - 2);
        graphics.drawLine(n + 1, n2 + 1, n + 1, n2 + 1);
        graphics.drawLine(n + 1, n2 + n4 - 1, n + 1, n2 + n4 - 1);
        graphics.drawLine(n + n3 - 1, n2 + 1, n + n3 - 1, n2 + 1);
        graphics.drawLine(n + n3 - 1, n2 + n4 - 1, n + n3 - 1, n2 + n4 - 1);
        graphics.setColor(14612735);
        graphics.drawLine(n + 2, n2 + 1, n + n3 - 2, n2 + 1);
        graphics.drawLine(n + 2, n2 + n4 - 1, n + n3 - 2, n2 + n4 - 1);
        graphics.drawLine(n + 1, n2 + 2, n + 1, n2 + n4 - 2);
        graphics.drawLine(n + n3 - 1, n2 + 2, n + n3 - 1, n2 + n4 - 2);
        if (bl) {
            graphics.setColor(0xFFFFFF);
            graphics.fillRect(n + 2, n2 + 2, n3 - 3, n4 - 3);
            graphics.setColor(n5);
            graphics.fillRect(n + 2, n2 + 2, n3 - 4, n4 - 4);
        }
        graphics.setColor(14612735);
        graphics.drawLine(n + 2, n2 + 2, n + 2, n2 + 2);
        graphics.drawLine(n + 2, n2 + n4 - 2, n + 2, n2 + n4 - 2);
        graphics.drawLine(n + n3 - 2, n2 + 2, n + n3 - 2, n2 + 2);
        graphics.drawLine(n + n3 - 2, n2 + n4 - 2, n + n3 - 2, n2 + n4 - 2);
    }

    public static void a() {
        if (m == null) {
            m = f.d("/olaicons");
        }
    }

    public static void d(Graphics graphics, int n, int n2, int n3, int n4) {
        n = Math.abs(n);
        if (m != null) {
            cw.a(graphics, m, pc.n[n], o[n], g[n], p[n], n2, n3, n4);
        }
    }

    public static void a(Graphics graphics, int n, int n2, int n3, int n4, boolean bl, int n5) {
        graphics.setColor(16742661);
        graphics.fillRect(n, n2, n3, 1);
        graphics.fillRect(n, n2 + n4 - 1, n3, 1);
        graphics.setColor(16167168);
        graphics.fillRect(n, n2 + 1, n3, 1);
        graphics.fillRect(n, n2 + n4 - 2, n3, 1);
        graphics.setColor(0xFFFF8B);
        graphics.fillRect(n, n2 + 2, n3, 2);
        graphics.fillRect(n, n2 + n4 - 4, n3, 2);
        graphics.setColor(0xFFFFB7);
        graphics.fillRect(n, n2 + 4, n3, 1);
        graphics.fillRect(n, n2 + n4 - 5, n3, 1);
        graphics.setColor(n5);
        graphics.fillRect(n, n2 + 5, n3, n4 - 10);
        if (bl) {
            if (n4 - 4 < q.getHeight()) {
                cw.a(graphics, q, 0, q.getHeight() - n4 + 4, q.getWidth(), n4 - 4, n + n3, n2 + n4 - 2, 40);
                return;
            }
            graphics.drawImage(q, n + n3, n2 + n4 - 2, 40);
        }
    }

    public static void b(Graphics graphics, int n, int n2, int n3, int n4, boolean bl) {
        pc.a(graphics, n, n2, n3, n4, bl, 0xFFFFFF);
    }

    public static void e(Graphics graphics, int n, int n2, int n3, int n4) {
        pc.b(graphics, n, n2, n3, n4, true);
    }

    public static void f(Graphics graphics, int n, int n2, int n3, int n4, int n5) {
        n += (n3 - 7) / 2;
        n2 += (n4 - 7) / 2;
        n2 += 2;
        graphics.setColor(0);
        n3 = n + 3;
        while (n < n3) {
            graphics.fillRect(n, n2++, 1, 3);
            ++n;
        }
        n2 -= 2;
        n3 = n + 4;
        while (n < n3) {
            graphics.fillRect(n, n2--, 1, 3);
            ++n;
        }
    }

    public static void b(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6) {
        graphics.setColor(16069679);
        graphics.fillRect(n - 1, n2 - 1, 8, 8);
        graphics.setColor(0xFFFFFF);
        graphics.drawLine(n, n2 + 2, n + 5, n2 + 2);
        graphics.drawLine(n, n2 + 2 + 1, n + 5, n2 + 2 + 1);
        graphics.drawLine(n + 2, n2, n + 2, n2 + 5);
        graphics.drawLine(n + 2 + 1, n2, n + 2 + 1, n2 + 5);
    }

    public static void a(Graphics graphics, int n, int n2, int n3) {
        int n4 = n3 / 2;
        graphics.setColor(11383216);
        graphics.drawLine(n + n4 - 1, n2, n + n4 - 1, n2 - 4);
        graphics.drawLine(n + n4 + 1, n2, n + n4 + 1, n2 - 4);
        graphics.drawLine(n + n4 - 1, n2 - 4, n + n4 - 4, n2 - 4);
        graphics.drawLine(n + n4 + 1, n2 - 4, n + n4 + 4, n2 - 4);
        graphics.drawLine(n + n4 - 4, n2 - 4, n + n4 - 4, n2 - 2);
        graphics.drawLine(n + n4 + 4, n2 - 4, n + n4 + 4, n2 - 2);
        graphics.drawLine(n + n4 - 4, n2 - 2, n + n4 - 3, n2 - 2);
        graphics.drawLine(n + n4 + 4, n2 - 2, n + n4 + 3, n2 - 2);
        graphics.drawLine(n + n4 - 1, n2, n + 17, n2);
        graphics.drawLine(n + n4 + 1, n2, n + n3 - 18, n2);
        graphics.setColor(0xBABABA);
        graphics.drawLine(n + 16, n2, n + 14, n2);
        graphics.drawLine(n + n3 - 17, n2, n + n3 - 15, n2);
        graphics.setColor(13026498);
        graphics.drawLine(n + 13, n2, n + 11, n2);
        graphics.drawLine(n + n3 - 14, n2, n + n3 - 12, n2);
        graphics.setColor(0xD1D2D2);
        graphics.drawLine(n + 10, n2, n + 9, n2);
        graphics.drawLine(n + n3 - 11, n2, n + n3 - 10, n2);
        graphics.setColor(0xCFCCCB);
        graphics.drawLine(n + 8, n2, n + 8, n2);
        graphics.drawLine(n + n3 - 9, n2, n + n3 - 9, n2);
        graphics.setColor(0xDFDFDF);
        graphics.drawLine(n + 7, n2, n + 7, n2);
        graphics.drawLine(n + n3 - 8, n2, n + n3 - 8, n2);
        graphics.setColor(13687516);
        graphics.drawLine(n + 6, n2, n + 5, n2);
        graphics.drawLine(n + n3 - 7, n2, n + n3 - 6, n2);
        graphics.setColor(0xDFDFDF);
        graphics.drawLine(n + 4, n2, n + 2, n2);
        graphics.drawLine(n + n3 - 5, n2, n + n3 - 3, n2);
        graphics.setColor(0xE9E9E9);
        graphics.drawLine(n + 1, n2, n, n2);
        graphics.drawLine(n + n3 - 2, n2, n + n3 - 1, n2);
    }

    public static void a(Graphics graphics, int n, int n2, byte by) {
        int n3 = r.getWidth() / 4;
        cw.a(graphics, r, n3 * by, 0, n3, r.getHeight(), n, n2, 0);
    }

    public static void b(Graphics graphics, int n, int n2, int n3) {
        int n4 = h.getWidth() / 4;
        cw.a(graphics, h, n4 * (n3 /= 2), 0, n4, h.getHeight(), n, n2, 0);
    }

    public static void b() {
        byte[] byArray;
        if (t == null && (byArray = pa.a().a(1000, false, true)) != null) {
            s = m.a(byArray, 0);
            t = f.a(byArray, 4, byArray.length - 4);
        }
    }

    public static void c() {
        s = 0;
        t = null;
    }

    public static boolean a(int n) {
        return t != null && n > 0 && n <= s && s > 0;
    }

    public static boolean c(Graphics graphics, int n, int n2, int n3) {
        if (!pc.a(n3)) {
            return false;
        }
        int n4 = t.getWidth() / s;
        cw.a(graphics, t, n4 * (n3 - 1), 0, n4, t.getHeight(), n, n2, 0);
        return true;
    }

    public static void a(Graphics graphics, int n, int n2) {
        graphics.setColor(0);
        graphics.drawLine(n, n2, n + 3, n2);
        graphics.fillTriangle(n + 1, n2 + 1, n + 3, n2 + 1, n + 1, n2 + 3);
        graphics.setColor(0x6E6E6E);
        graphics.fillTriangle(n + 1, n2, n + 1, n2 - 3, n + 3, n2);
    }

    public static void c(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6) {
        if (n6 == 0) {
            n3 = n + 12 + 1;
            n4 = n2 + 8;
            graphics.setColor(157, 159, 251);
            graphics.fillTriangle(n, n4, n + 19, n2, n3, n4);
            graphics.setColor(85, 90, 248);
            graphics.fillTriangle(n, n4, n + 19, n2 + 17, n3, n4);
            graphics.setColor(857589);
            graphics.drawLine(n, n4, n + 19, n2);
            graphics.drawLine(n3, n4, n + 19, n2);
            graphics.drawLine(n, n4, n + 19, n2 + 17);
            graphics.drawLine(n3, n4, n + 19, n2 + 17);
            graphics.setColor(109, 113, 249);
            graphics.drawLine(n + 1, n4, n3 - 1, n4);
            return;
        }
        if (n6 == 1) {
            n3 = n + 6 - 1;
            n4 = n2 + 8;
            graphics.setColor(157, 159, 251);
            graphics.fillTriangle(n + 19, n4, n, n2, n3, n4);
            graphics.setColor(85, 90, 248);
            graphics.fillTriangle(n + 19, n4, n, n2 + 17, n3, n4);
            graphics.setColor(857589);
            graphics.drawLine(n + 19, n4, n, n2);
            graphics.drawLine(n3, n4, n, n2);
            graphics.drawLine(n + 19, n4, n, n2 + 17);
            graphics.drawLine(n3, n4, n, n2 + 17);
            graphics.setColor(109, 113, 249);
            graphics.drawLine(n + 19 - 1, n4, n3 + 1, n4);
        }
    }

    public static void f(Graphics graphics, int n, int n2, int n3, int n4) {
        graphics.setColor(13669730);
        graphics.fillRect(n - 1, n2 - 1, n3 + 2, n4 + 2);
        pc.a(graphics, n - 1, n2 - 1, n3 + 2, n4 + 2, 14593669, -1);
        cw.b(graphics, 15320744, n - 2, n2 - 2, n3 + 4, n4 + 4);
    }

    public static void d() {
        if (u == null) {
            u = f.a(pa.a().a(30099, false, false));
            v = u.getHeight() / 32;
            w = u.getWidth() / 32;
        }
    }

    public static void g(Graphics graphics, int n, int n2, int n3, int n4) {
        n = Math.abs(n);
        int n5 = n / w;
        n %= w;
        if (u != null && n5 < v) {
            cw.a(graphics, u, n << 5, n5 << 5, 32, 32, n2, n3, n4);
        }
    }

    public static final fu a(bf bf2, int n, int n2, int n3) {
        pc.a();
        fu fu2 = new fu(m, -3);
        fu2.a(bf2);
        fu2.b(pc.n[20], o[20], g[20], p[20]);
        fu2.a(n2, n3, 16, 16);
        return fu2;
    }
}
