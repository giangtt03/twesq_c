package com.mg.bas;
// Utility for serializing nj object arrays into a byte array and computing a hash.
// Decompiled with: CFR 0.152
// Class Version: 1
public final class oz {
    private static byte[] a = new byte[64];

    public static long a(nj[][] njArray) {
        e.a();
        int n = 0;
        int n2 = 2;
        while (n2 < 10) {
            int n3 = 2;
            while (n3 < 10) {
                byte by = njArray[n2][n3].c;
                oz.a[n++] = by;
                ++n3;
            }
            ++n2;
        }
        return e.a(a);
    }
}
