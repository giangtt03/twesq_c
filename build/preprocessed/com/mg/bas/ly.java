package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ly
extends ea {
    private static int[] a = new int[]{4, 3, 4, 4, 5, 4, 4, 4, 4, 4, 5};
    private static int[] b;
    private static Image c;

    static {
        int[] nArray = new int[11];
        nArray[1] = 4;
        nArray[2] = 7;
        nArray[3] = 11;
        nArray[4] = 15;
        nArray[5] = 20;
        nArray[6] = 24;
        nArray[7] = 28;
        nArray[8] = 32;
        nArray[9] = 36;
        nArray[10] = 40;
        b = nArray;
    }

    public static void f() {
        if (c == null) {
            c = f.d("/tinynumber");
        }
    }

    public static void g() {
        c = null;
    }

    public static int b(int n) {
        return ly.c(String.valueOf(n));
    }

    public static int c(String string) {
        if (i.b(string)) {
            return 0;
        }
        int n = 0;
        int n2 = 0;
        while (n2 < string.length()) {
            char c = string.charAt(n2);
            n = c == '+' ? (n += a[10] + 1) : (n += a[c - 48] + 1);
            ++n2;
        }
        return n - 1;
    }

    public static void a(Graphics graphics, String string, int n, int n2) {
        if (c == null) {
            return;
        }
        int n3 = 0;
        while (n3 < string.length()) {
            char c = string.charAt(n3);
            int n4 = 10;
            if (c != '+') {
                n4 = c - 48;
            }
            cw.a(graphics, ly.c, b[n4], 0, a[n4], 7, n, n2, 0);
            n += a[n4] + 1;
            ++n3;
        }
    }
}
