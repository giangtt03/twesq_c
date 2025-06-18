package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// Utility class for graphics clipping and drawing helpers, provides static methods for manipulating Graphics and k.
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class cw {
    public static k a;

    static {
        byte[][] byArrayArray = new byte[][]{{1, 2, 1}, {2, 4, 2}, {1, 2, 1}};
        byte[][] byArrayArray2 = new byte[5][];
        byte[] byArray = new byte[5];
        byArray[1] = 1;
        byArray[2] = 2;
        byArray[3] = 1;
        byArrayArray2[0] = byArray;
        byArrayArray2[1] = new byte[]{1, 3, 5, 3, 1};
        byArrayArray2[2] = new byte[]{2, 5, 9, 5, 2};
        byArrayArray2[3] = new byte[]{1, 3, 5, 3, 1};
        byte[] byArray2 = new byte[5];
        byArray2[1] = 1;
        byArray2[2] = 2;
        byArray2[3] = 1;
        byArrayArray2[4] = byArray2;
        a = new k(0, 0, v.t, v.u);
    }

    public static void a(Graphics graphics) {
        cw.a(graphics, a);
    }

    public static void a(Graphics graphics, k k2) {
        k2.a = graphics.getClipX();
        k2.b = graphics.getClipY();
        k2.c = graphics.getClipWidth();
        k2.d = graphics.getClipHeight();
    }

    public static void b(Graphics graphics, k k2) {
        cw.a(graphics, k2, a);
    }

    public static void a(Graphics graphics, k k2, k k3) {
        cw.a(graphics, k2.a, k2.b, k2.c, k2.d, k3.a, k3.b, k3.c, k3.d);
    }

    public static void a(Graphics graphics, k k2, int n, int n2, int n3, int n4) {
        cw.a(graphics, k2.a, k2.b, k2.c, k2.d, n, n2, n3, n4);
    }

    public static void a(Graphics graphics, int n, int n2, int n3, int n4) {
        cw.a(graphics, graphics.getClipX(), graphics.getClipY(), graphics.getClipWidth(), graphics.getClipHeight(), n, n2, n3, n4);
    }

    private static void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        long l = n;
        l += (long)n3;
        long l2 = n2;
        l2 += (long)n4;
        long l3 = n5;
        l3 += (long)n7;
        long l4 = n6;
        l4 += (long)n8;
        if (n < n5) {
            n = n5;
        }
        if (n2 < n6) {
            n2 = n6;
        }
        if (l > l3) {
            l = l3;
        }
        if (l2 > l4) {
            l2 = l4;
        }
        l2 -= (long)n2;
        if ((l -= (long)n) < Integer.MIN_VALUE) {
            l = Integer.MIN_VALUE;
        }
        if (l2 < Integer.MIN_VALUE) {
            l2 = Integer.MIN_VALUE;
        }
        graphics.setClip(n, n2, (int)l, (int)l2);
    }

    public static void c(Graphics graphics, k k2) {
        graphics.setClip(k2.a, k2.b, k2.c, k2.d);
    }

    public static void b(Graphics graphics) {
        cw.c(graphics, a);
    }

    public static final void a(Graphics graphics, Image image, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        if ((n7 & 1) > 0) {
            n5 -= n3 >> 1;
        } else if ((n7 & 8) > 0) {
            n5 -= n3;
        }
        if ((n7 & 2) > 0) {
            n6 -= n4 >> 1;
        } else if ((n7 & 0x20) > 0) {
            n6 -= n4;
        }
        graphics.drawRegion(image, n, n2, n3, n4, 0, n5, n6, 0);
    }

    public static void a(Graphics graphics, int n, int n2, int n3, int n4, int n5) {
        graphics.setColor(0xE7E7E7);
        n = n2;
        int n6 = n3;
        int n7 = n2;
        int n8 = n3;
        while (true) {
            graphics.drawLine(n, n6, n7, n8);
            if (n6 < n3 + n5) {
                n6 += 2;
            } else if ((n += 2) > n2 + n4) break;
            if (n7 < n2 + n4) {
                n7 += 2;
                continue;
            }
            if ((n8 += 2) > n3 + n5) break;
        }
    }

    public static void b(Graphics graphics, int n, int n2, int n3, int n4, int n5) {
        graphics.setColor(n);
        graphics.fillRect(n2 + 2, n3, n4 - 4, 1);
        graphics.fillRect(n2 + 2, n3 + n5 - 1, n4 - 4, 1);
        graphics.fillRect(n2, n3 + 2, 1, n5 - 4);
        graphics.fillRect(n2 + n4 - 1, n3 + 2, 1, n5 - 4);
        graphics.fillRect(n2 + 1, n3 + 1, 1, 1);
        graphics.fillRect(n2 + 1, n3 + n5 - 2, 1, 1);
        graphics.fillRect(n2 + n4 - 2, n3 + 1, 1, 1);
        graphics.fillRect(n2 + n4 - 2, n3 + n5 - 2, 1, 1);
    }

    public static final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        cw.a(graphics, n, n2, n3, n4, n5, false, n6, n7);
    }

    public static final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, boolean bl, int n6, int n7) {
        if (n6 >= 0) {
            graphics.setColor(n6);
            graphics.fillRect(n + 1, n2 + 2, n3 - 2, n4 - 4);
            graphics.fillRect(n + 4, n2 + 1, n3 - 8, 1);
            graphics.fillRect(n + 4, n2 + n4 - 2, n3 - 8, 1);
        }
        graphics.setColor(n7);
        graphics.fillRect(n + 4, n2, n3 - 8, 1);
        graphics.fillRect(n + 4, n2 + n4 - 1, n3 - 8, 1);
        graphics.fillRect(n + 2, n2 + 1, 2, 1);
        graphics.fillRect(n + n3 - 4, n2 + 1, 2, 1);
        graphics.fillRect(n + 2, n2 + n4 - 2, 2, 1);
        graphics.fillRect(n + n3 - 4, n2 + n4 - 2, 2, 1);
        graphics.fillRect(n, n2 + 4, 1, n4 - 8);
        graphics.fillRect(n + n3 - 1, n2 + 4, 1, n4 - 8);
        graphics.fillRect(n + 1, n2 + 2, 1, 2);
        graphics.fillRect(n + 1, n2 + n4 - 4, 1, 2);
        graphics.fillRect(n + n3 - 2, n2 + 2, 1, 2);
        graphics.fillRect(n + n3 - 2, n2 + n4 - 4, 1, 2);
        if (n5 >= 0) {
            graphics.setColor(n6);
            if (bl) {
                graphics.fillTriangle(n5 - 5, n2 + 1, n5 + 5, n2 + 1, n5, n2 - 7);
                graphics.setColor(n7);
                graphics.drawLine(n5, n2 - 7, n5 - 5, n2 + 1);
                graphics.drawLine(n5, n2 - 7, n5 + 5, n2 + 1);
                return;
            }
            graphics.fillTriangle(n5 - 5, n2 + n4 - 1, n5 + 5, n2 + n4 - 1, n5, n2 + n4 + 7);
            graphics.setColor(n7);
            graphics.drawLine(n5, n2 + n4 + 7, n5 - 5, n2 + n4 - 1);
            graphics.drawLine(n5, n2 + n4 + 7, n5 + 5, n2 + n4 - 1);
        }
    }
}
