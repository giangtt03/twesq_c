package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import java.util.Random;

public final class m {
    static {
        new Random(System.currentTimeMillis());
    }

    public static int a(byte by) {
        return by & 0xFF;
    }

    public static int a(byte[] byArray) {
        if (byArray.length < 2) {
            return 0;
        }
        return m.a(byArray[0], byArray[1]);
    }

    public static int a(byte by, byte by2) {
        return ((by & 0xFF) << 8) + (by2 & 0xFF);
    }

    public static int b(byte[] byArray) {
        if (byArray.length < 3) {
            return 0;
        }
        byte by = byArray[2];
        byte by2 = byArray[1];
        byte by3 = byArray[0];
        return ((by3 & 0xFF) << 16) + ((by2 & 0xFF) << 8) + (by & 0xFF);
    }

    public static int c(byte[] byArray) {
        if (byArray.length < 4) {
            return 0;
        }
        return m.a(byArray[0], byArray[1], byArray[2], byArray[3]);
    }

    public static int a(byte[] byArray, int n) {
        return m.a(byArray[n], byArray[n + 1], byArray[n + 2], byArray[n + 3]);
    }

    public static int a(byte by, byte by2, byte by3, byte by4) {
        return ((by & 0xFF) << 24) + ((by2 & 0xFF) << 16) + ((by3 & 0xFF) << 8) + (by4 & 0xFF);
    }

    public static short b(byte by, byte by2) {
        return (short)(((by & 0xFF) << 8) + (by2 & 0xFF));
    }

    public static byte[] a(short s) {
        return new byte[]{(byte)(s >>> 8), (byte)s};
    }

    public static byte[] a(int n) {
        return new byte[]{(byte)(n >>> 24), (byte)(n >>> 16), (byte)(n >>> 8), (byte)n};
    }

    public static byte[] a(long l) {
        return new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
    }

    public static long b(byte[] byArray, int n) {
        int n2 = byArray.length - n;
        if (n2 < 8) {
            long l = 0L;
            n2 = 56;
            int n3 = n;
            while (n3 < byArray.length) {
                l += ((long)byArray[n3] & 0xFFL) << n2;
                n2 -= 8;
                ++n3;
            }
            n3 -= n;
            while (n3 < 8) {
                l += (long)(0 << n2);
                n2 -= 8;
                ++n3;
            }
            return l;
        }
        if (n2 > 8) {
            long l = 0L;
            n2 = 56;
            int n4 = n;
            n += 8;
            while (n4 < n) {
                l += ((long)byArray[n4] & 0xFFL) << n2;
                n2 -= 8;
                ++n4;
            }
            return l;
        }
        byte by = byArray[n];
        byte by2 = byArray[n + 7];
        byte by3 = byArray[n + 6];
        byte by4 = byArray[n + 5];
        byte by5 = byArray[n + 4];
        byte by6 = byArray[n + 3];
        n2 = byArray[n + 2];
        n = byArray[n + 1];
        byte by7 = by;
        return ((long)by << 56) + ((long)(n & 0xFF) << 48) + ((long)(n2 & 0xFF) << 40) + ((long)(by6 & 0xFF) << 32) + ((long)(by5 & 0xFF) << 24) + (long)((by4 & 0xFF) << 16) + (long)((by3 & 0xFF) << 8) + (long)(by2 & 0xFF);
    }

    public static long d(byte[] byArray) {
        return m.b(byArray, 0);
    }
}
