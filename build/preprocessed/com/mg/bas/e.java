package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class e {
    private static int a = 0;
    private static int[] b;

    static {
        int[] nArray = new int[256];
        int n = 0;
        while (n < 256) {
            int n2 = n;
            int n3 = 8;
            while (--n3 >= 0) {
                if ((n2 & 1) != 0) {
                    n2 = 0xEDB88320 ^ n2 >>> 1;
                    continue;
                }
                n2 >>>= 1;
            }
            nArray[n] = n2;
            ++n;
        }
        b = nArray;
    }

    private static long b() {
        return (long)a & 0xFFFFFFFFL;
    }

    public static void a() {
        a = 0;
    }

    public static long a(byte[] byArray) {
        int n = byArray.length;
        int n2 = 0;
        int n3 = ~a;
        while (--n >= 0) {
            n3 = b[(n3 ^ byArray[n2++]) & 0xFF] ^ n3 >>> 8;
        }
        a = ~n3;
        e.b();
        return e.b();
    }
}
