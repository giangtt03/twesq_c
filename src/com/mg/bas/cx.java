package com.mg.bas;
// Utility class for cryptographic or encoding operations, manages byte and char arrays for hashing or encoding.
// Decompiled with: CFR 0.152

import java.io.UnsupportedEncodingException;

// Class Version: 1
public final class cx {
    private cy a = new cy();
    private cy b = null;
    private static byte[] c;

    static {
        byte[] byArray = new byte[64];
        byArray[0] = -128;
        c = byArray;
        char[] cArray = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    private cx() {
    }

    private void a(cy cy2, byte[] byArray, int n, int[] nArray) {
        int n2 = cy2.a[0];
        int n3 = cy2.a[1];
        int n4 = cy2.a[2];
        int n5 = cy2.a[3];
        int[] nArray2 = nArray;
        nArray[0] = byArray[n] & 0xFF | (byArray[n + 1] & 0xFF) << 8 | (byArray[n + 2] & 0xFF) << 16 | byArray[n + 3] << 24;
        nArray[1] = byArray[n + 4] & 0xFF | (byArray[n + 5] & 0xFF) << 8 | (byArray[n + 6] & 0xFF) << 16 | byArray[n + 7] << 24;
        nArray[2] = byArray[n + 8] & 0xFF | (byArray[n + 9] & 0xFF) << 8 | (byArray[n + 10] & 0xFF) << 16 | byArray[n + 11] << 24;
        nArray[3] = byArray[n + 12] & 0xFF | (byArray[n + 13] & 0xFF) << 8 | (byArray[n + 14] & 0xFF) << 16 | byArray[n + 15] << 24;
        nArray[4] = byArray[n + 16] & 0xFF | (byArray[n + 17] & 0xFF) << 8 | (byArray[n + 18] & 0xFF) << 16 | byArray[n + 19] << 24;
        nArray[5] = byArray[n + 20] & 0xFF | (byArray[n + 21] & 0xFF) << 8 | (byArray[n + 22] & 0xFF) << 16 | byArray[n + 23] << 24;
        nArray[6] = byArray[n + 24] & 0xFF | (byArray[n + 25] & 0xFF) << 8 | (byArray[n + 26] & 0xFF) << 16 | byArray[n + 27] << 24;
        nArray[7] = byArray[n + 28] & 0xFF | (byArray[n + 29] & 0xFF) << 8 | (byArray[n + 30] & 0xFF) << 16 | byArray[n + 31] << 24;
        nArray[8] = byArray[n + 32] & 0xFF | (byArray[n + 33] & 0xFF) << 8 | (byArray[n + 34] & 0xFF) << 16 | byArray[n + 35] << 24;
        nArray[9] = byArray[n + 36] & 0xFF | (byArray[n + 37] & 0xFF) << 8 | (byArray[n + 38] & 0xFF) << 16 | byArray[n + 39] << 24;
        nArray[10] = byArray[n + 40] & 0xFF | (byArray[n + 41] & 0xFF) << 8 | (byArray[n + 42] & 0xFF) << 16 | byArray[n + 43] << 24;
        nArray[11] = byArray[n + 44] & 0xFF | (byArray[n + 45] & 0xFF) << 8 | (byArray[n + 46] & 0xFF) << 16 | byArray[n + 47] << 24;
        nArray[12] = byArray[n + 48] & 0xFF | (byArray[n + 49] & 0xFF) << 8 | (byArray[n + 50] & 0xFF) << 16 | byArray[n + 51] << 24;
        nArray[13] = byArray[n + 52] & 0xFF | (byArray[n + 53] & 0xFF) << 8 | (byArray[n + 54] & 0xFF) << 16 | byArray[n + 55] << 24;
        nArray[14] = byArray[n + 56] & 0xFF | (byArray[n + 57] & 0xFF) << 8 | (byArray[n + 58] & 0xFF) << 16 | byArray[n + 59] << 24;
        nArray[15] = byArray[n + 60] & 0xFF | (byArray[n + 61] & 0xFF) << 8 | (byArray[n + 62] & 0xFF) << 16 | byArray[n + 63] << 24;
        n2 += (n3 & n4 | ~n3 & n5) + nArray2[0] + -680876936;
        n2 = (n2 << 7 | n2 >>> 25) + n3;
        n5 += (n2 & n3 | ~n2 & n4) + nArray2[1] + -389564586;
        n5 = (n5 << 12 | n5 >>> 20) + n2;
        n4 += (n5 & n2 | ~n5 & n3) + nArray2[2] + 606105819;
        n4 = (n4 << 17 | n4 >>> 15) + n5;
        n3 += (n4 & n5 | ~n4 & n2) + nArray2[3] + -1044525330;
        n3 = (n3 << 22 | n3 >>> 10) + n4;
        n2 += (n3 & n4 | ~n3 & n5) + nArray2[4] + -176418897;
        n2 = (n2 << 7 | n2 >>> 25) + n3;
        n5 += (n2 & n3 | ~n2 & n4) + nArray2[5] + 1200080426;
        n5 = (n5 << 12 | n5 >>> 20) + n2;
        n4 += (n5 & n2 | ~n5 & n3) + nArray2[6] + -1473231341;
        n4 = (n4 << 17 | n4 >>> 15) + n5;
        n3 += (n4 & n5 | ~n4 & n2) + nArray2[7] + -45705983;
        n3 = (n3 << 22 | n3 >>> 10) + n4;
        n2 += (n3 & n4 | ~n3 & n5) + nArray2[8] + 1770035416;
        n2 = (n2 << 7 | n2 >>> 25) + n3;
        n5 += (n2 & n3 | ~n2 & n4) + nArray2[9] + -1958414417;
        n5 = (n5 << 12 | n5 >>> 20) + n2;
        n4 += (n5 & n2 | ~n5 & n3) + nArray2[10] + -42063;
        n4 = (n4 << 17 | n4 >>> 15) + n5;
        n3 += (n4 & n5 | ~n4 & n2) + nArray2[11] + -1990404162;
        n3 = (n3 << 22 | n3 >>> 10) + n4;
        n2 += (n3 & n4 | ~n3 & n5) + nArray2[12] + 1804603682;
        n2 = (n2 << 7 | n2 >>> 25) + n3;
        n5 += (n2 & n3 | ~n2 & n4) + nArray2[13] + -40341101;
        n5 = (n5 << 12 | n5 >>> 20) + n2;
        n4 += (n5 & n2 | ~n5 & n3) + nArray2[14] + -1502002290;
        n4 = (n4 << 17 | n4 >>> 15) + n5;
        n3 += (n4 & n5 | ~n4 & n2) + nArray2[15] + 1236535329;
        n3 = (n3 << 22 | n3 >>> 10) + n4;
        n2 += (n3 & n5 | n4 & ~n5) + nArray2[1] + -165796510;
        n2 = (n2 << 5 | n2 >>> 27) + n3;
        n5 += (n2 & n4 | n3 & ~n4) + nArray2[6] + -1069501632;
        n5 = (n5 << 9 | n5 >>> 23) + n2;
        n4 += (n5 & n3 | n2 & ~n3) + nArray2[11] + 643717713;
        n4 = (n4 << 14 | n4 >>> 18) + n5;
        n3 += (n4 & n2 | n5 & ~n2) + nArray2[0] + -373897302;
        n3 = (n3 << 20 | n3 >>> 12) + n4;
        n2 += (n3 & n5 | n4 & ~n5) + nArray2[5] + -701558691;
        n2 = (n2 << 5 | n2 >>> 27) + n3;
        n5 += (n2 & n4 | n3 & ~n4) + nArray2[10] + 38016083;
        n5 = (n5 << 9 | n5 >>> 23) + n2;
        n4 += (n5 & n3 | n2 & ~n3) + nArray2[15] + -660478335;
        n4 = (n4 << 14 | n4 >>> 18) + n5;
        n3 += (n4 & n2 | n5 & ~n2) + nArray2[4] + -405537848;
        n3 = (n3 << 20 | n3 >>> 12) + n4;
        n2 += (n3 & n5 | n4 & ~n5) + nArray2[9] + 568446438;
        n2 = (n2 << 5 | n2 >>> 27) + n3;
        n5 += (n2 & n4 | n3 & ~n4) + nArray2[14] + -1019803690;
        n5 = (n5 << 9 | n5 >>> 23) + n2;
        n4 += (n5 & n3 | n2 & ~n3) + nArray2[3] + -187363961;
        n4 = (n4 << 14 | n4 >>> 18) + n5;
        n3 += (n4 & n2 | n5 & ~n2) + nArray2[8] + 1163531501;
        n3 = (n3 << 20 | n3 >>> 12) + n4;
        n2 += (n3 & n5 | n4 & ~n5) + nArray2[13] + -1444681467;
        n2 = (n2 << 5 | n2 >>> 27) + n3;
        n5 += (n2 & n4 | n3 & ~n4) + nArray2[2] + -51403784;
        n5 = (n5 << 9 | n5 >>> 23) + n2;
        n4 += (n5 & n3 | n2 & ~n3) + nArray2[7] + 1735328473;
        n4 = (n4 << 14 | n4 >>> 18) + n5;
        n3 += (n4 & n2 | n5 & ~n2) + nArray2[12] + -1926607734;
        n3 = (n3 << 20 | n3 >>> 12) + n4;
        n2 += (n3 ^ n4 ^ n5) + nArray2[5] + -378558;
        n2 = (n2 << 4 | n2 >>> 28) + n3;
        n5 += (n2 ^ n3 ^ n4) + nArray2[8] + -2022574463;
        n5 = (n5 << 11 | n5 >>> 21) + n2;
        n4 += (n5 ^ n2 ^ n3) + nArray2[11] + 1839030562;
        n4 = (n4 << 16 | n4 >>> 16) + n5;
        n3 += (n4 ^ n5 ^ n2) + nArray2[14] + -35309556;
        n3 = (n3 << 23 | n3 >>> 9) + n4;
        n2 += (n3 ^ n4 ^ n5) + nArray2[1] + -1530992060;
        n2 = (n2 << 4 | n2 >>> 28) + n3;
        n5 += (n2 ^ n3 ^ n4) + nArray2[4] + 1272893353;
        n5 = (n5 << 11 | n5 >>> 21) + n2;
        n4 += (n5 ^ n2 ^ n3) + nArray2[7] + -155497632;
        n4 = (n4 << 16 | n4 >>> 16) + n5;
        n3 += (n4 ^ n5 ^ n2) + nArray2[10] + -1094730640;
        n3 = (n3 << 23 | n3 >>> 9) + n4;
        n2 += (n3 ^ n4 ^ n5) + nArray2[13] + 681279174;
        n2 = (n2 << 4 | n2 >>> 28) + n3;
        n5 += (n2 ^ n3 ^ n4) + nArray2[0] + -358537222;
        n5 = (n5 << 11 | n5 >>> 21) + n2;
        n4 += (n5 ^ n2 ^ n3) + nArray2[3] + -722521979;
        n4 = (n4 << 16 | n4 >>> 16) + n5;
        n3 += (n4 ^ n5 ^ n2) + nArray2[6] + 76029189;
        n3 = (n3 << 23 | n3 >>> 9) + n4;
        n2 += (n3 ^ n4 ^ n5) + nArray2[9] + -640364487;
        n2 = (n2 << 4 | n2 >>> 28) + n3;
        n5 += (n2 ^ n3 ^ n4) + nArray2[12] + -421815835;
        n5 = (n5 << 11 | n5 >>> 21) + n2;
        n4 += (n5 ^ n2 ^ n3) + nArray2[15] + 530742520;
        n4 = (n4 << 16 | n4 >>> 16) + n5;
        n3 += (n4 ^ n5 ^ n2) + nArray2[2] + -995338651;
        n3 = (n3 << 23 | n3 >>> 9) + n4;
        n2 += (n4 ^ (n3 | ~n5)) + nArray2[0] + -198630844;
        n2 = (n2 << 6 | n2 >>> 26) + n3;
        n5 += (n3 ^ (n2 | ~n4)) + nArray2[7] + 1126891415;
        n5 = (n5 << 10 | n5 >>> 22) + n2;
        n4 += (n2 ^ (n5 | ~n3)) + nArray2[14] + -1416354905;
        n4 = (n4 << 15 | n4 >>> 17) + n5;
        n3 += (n5 ^ (n4 | ~n2)) + nArray2[5] + -57434055;
        n3 = (n3 << 21 | n3 >>> 11) + n4;
        n2 += (n4 ^ (n3 | ~n5)) + nArray2[12] + 1700485571;
        n2 = (n2 << 6 | n2 >>> 26) + n3;
        n5 += (n3 ^ (n2 | ~n4)) + nArray2[3] + -1894986606;
        n5 = (n5 << 10 | n5 >>> 22) + n2;
        n4 += (n2 ^ (n5 | ~n3)) + nArray2[10] + -1051523;
        n4 = (n4 << 15 | n4 >>> 17) + n5;
        n3 += (n5 ^ (n4 | ~n2)) + nArray2[1] + -2054922799;
        n3 = (n3 << 21 | n3 >>> 11) + n4;
        n2 += (n4 ^ (n3 | ~n5)) + nArray2[8] + 1873313359;
        n2 = (n2 << 6 | n2 >>> 26) + n3;
        n5 += (n3 ^ (n2 | ~n4)) + nArray2[15] + -30611744;
        n5 = (n5 << 10 | n5 >>> 22) + n2;
        n4 += (n2 ^ (n5 | ~n3)) + nArray2[6] + -1560198380;
        n4 = (n4 << 15 | n4 >>> 17) + n5;
        n3 += (n5 ^ (n4 | ~n2)) + nArray2[13] + 1309151649;
        n3 = (n3 << 21 | n3 >>> 11) + n4;
        n2 += (n4 ^ (n3 | ~n5)) + nArray2[4] + -145523070;
        n2 = (n2 << 6 | n2 >>> 26) + n3;
        n5 += (n3 ^ (n2 | ~n4)) + nArray2[11] + -1120210379;
        n5 = (n5 << 10 | n5 >>> 22) + n2;
        n4 += (n2 ^ (n5 | ~n3)) + nArray2[2] + 718787259;
        n4 = (n4 << 15 | n4 >>> 17) + n5;
        n3 += (n5 ^ (n4 | ~n2)) + nArray2[9] + -343485551;
        n3 = (n3 << 21 | n3 >>> 11) + n4;
        cy2.a[0] = cy2.a[0] + n2;
        cy2.a[1] = cy2.a[1] + n3;
        cy2.a[2] = cy2.a[2] + n4;
        cy2.a[3] = cy2.a[3] + n5;
    }

    private void a(cy cy2, byte[] byArray, int n, int n2) {
        int n3;
        this.b = null;
        if (n2 > byArray.length) {
            n2 = byArray.length;
        }
        n = (int)(cy2.b & 0x3FL);
        cy2.b += (long)n2;
        int n4 = 64 - n;
        if (n2 >= n4) {
            int[] nArray = new int[16];
            if (n4 == 64) {
                n4 = 0;
            } else {
                n3 = 0;
                while (n3 < n4) {
                    cy2.c[n3 + n] = byArray[n3];
                    ++n3;
                }
                this.a(cy2, cy2.c, 0, nArray);
            }
            n3 = n4;
            while (n3 + 63 < n2) {
                this.a(cy2, byArray, n3, nArray);
                n3 += 64;
            }
            n = 0;
        } else {
            n3 = 0;
        }
        if (n3 < n2) {
            n4 = n3;
            while (n3 < n2) {
                cy2.c[n + n3 - n4] = byArray[n3];
                ++n3;
            }
        }
    }

    private static byte[] a(int[] nArray, int n) {
        byte[] byArray = new byte[n];
        int n2 = 0;
        int n3 = 0;
        while (n2 < n) {
            byArray[n2] = (byte)nArray[n3];
            byArray[n2 + 1] = (byte)(nArray[n3] >>> 8);
            byArray[n2 + 2] = (byte)(nArray[n3] >>> 16);
            byArray[n2 + 3] = (byte)(nArray[n3] >>> 24);
            ++n3;
            n2 += 4;
        }
        return byArray;
    }

    public static byte[] a(String string) {
        String string2 = string;
        string = null;
        string = string2;
        try {
            return cx.a(com.mg.bas.i.c(string2, null));
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static byte[] a(byte[] byArray) {
        cx cx2 = new cx();
        cx2.a(cx2.a, byArray, 0, byArray.length);
        if (cx2.b == null) {
            cy cy2 = new cy(cx2.a);
            int[] nArray = new int[]{(int)(cy2.b << 3), (int)(cy2.b >> 29)};
            byte[] pad = cx.a(nArray, 8);
            int n = (int)(cy2.b & 0x3FL);
            n = n < 56 ? 56 - n : 120 - n;
            cx2.a(cy2, c, 0, n);
            cx2.a(cy2, pad, 0, 8);
            cx2.b = cy2;
        }
        return cx.a(cx2.b.a, 16);
    }

    public static boolean a(byte[] byArray, byte[] byArray2) {
        if (byArray == null) {
            return byArray2 == null;
        }
        if (byArray2 == null) {
            return false;
        }
        int n = 16;
        if (byArray.length < 16) {
            if (byArray2.length != byArray.length) {
                return false;
            }
            n = byArray.length;
        } else if (byArray2.length < 16) {
            return false;
        }
        int n2 = 0;
        while (n2 < n) {
            if (byArray[n2] != byArray2[n2]) {
                return false;
            }
            ++n2;
        }
        return true;
    }
}
