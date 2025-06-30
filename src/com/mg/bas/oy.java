package com.mg.bas;
// Utility for managing and rendering short arrays and images, likely for a UI/game feature.
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class oy {
    public static short[] a;
    public static short[] b;
    public static short[] c;
    public static short[] d;
    public static short e;
    public static Image f;
    public static boolean g;

    static {
        short[] sArray = new short[20];
        sArray[1] = 50;
        sArray[2] = 100;
        sArray[3] = 150;
        sArray[4] = 200;
        sArray[6] = 50;
        sArray[7] = 100;
        sArray[8] = 150;
        sArray[9] = 200;
        sArray[11] = 50;
        sArray[12] = 100;
        sArray[13] = 150;
        sArray[14] = 200;
        sArray[16] = 50;
        sArray[17] = 100;
        sArray[18] = 150;
        sArray[19] = 200;
        a = sArray;
        short[] sArray2 = new short[20];
        sArray2[5] = 50;
        sArray2[6] = 50;
        sArray2[7] = 50;
        sArray2[8] = 50;
        sArray2[9] = 50;
        sArray2[10] = 100;
        sArray2[11] = 100;
        sArray2[12] = 100;
        sArray2[13] = 100;
        sArray2[14] = 100;
        sArray2[15] = 150;
        sArray2[16] = 150;
        sArray2[17] = 150;
        sArray2[18] = 150;
        sArray2[19] = 150;
        b = sArray2;
        c = new short[]{50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50};
        d = new short[]{50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50};
        e = (short)50;
        g = false;
    }

    public static void a() {
        if (f != null && g) {
            return;
        }
        g = false;
        try {
            if (f == null) {
                f = com.mg.bas.f.d("/onions");
                g = true;
                short[] sArray = new short[20];
                sArray[1] = 50;
                sArray[2] = 100;
                sArray[3] = 150;
                sArray[4] = 200;
                sArray[6] = 50;
                sArray[7] = 100;
                sArray[8] = 150;
                sArray[9] = 200;
                sArray[11] = 50;
                sArray[12] = 100;
                sArray[13] = 150;
                sArray[14] = 200;
                sArray[16] = 50;
                sArray[17] = 100;
                sArray[18] = 150;
                sArray[19] = 200;
                a = sArray;
                short[] sArray2 = new short[20];
                sArray2[5] = 50;
                sArray2[6] = 50;
                sArray2[7] = 50;
                sArray2[8] = 50;
                sArray2[9] = 50;
                sArray2[10] = 100;
                sArray2[11] = 100;
                sArray2[12] = 100;
                sArray2[13] = 100;
                sArray2[14] = 100;
                sArray2[15] = 150;
                sArray2[16] = 150;
                sArray2[17] = 150;
                sArray2[18] = 150;
                sArray2[19] = 150;
                b = sArray2;
                c = new short[]{50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50};
                d = new short[]{50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50};
                return;
            }
        }
        catch (Throwable throwable) {
            Throwable throwable2 = throwable;
            throwable.printStackTrace();
            f = null;
            g = false;
        }
    }

    public static void b() {
        g = false;
        f = null;
        d = null;
        c = null;
        a = null;
        b = null;
        g = false;
    }

    public static void a(Graphics graphics, int n, int n2, int n3, int n4) {
        if (g && f != null && n >= 0 && n < 20) {
            graphics.drawRegion(f, (int)a[n], (int)b[n], (int)c[n], (int)d[n], 0, n2, n3, n4);
        }
    }
}
