package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public class j {
    public int a;
    public int b;
    public int c;
    public int d;

    public j(int n, int n2, int n3, int n4) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    public static byte[] a(byte[] byArray, String string) {
        try {
            byte by = byArray[0];
            byte[] byArray2 = string.getBytes("UTF-8");
            byte[] byArray3 = new byte[Math.max(byArray.length - 1, byArray2.length + by) + 1];
            byte[] byArray4 = byArray3;
            byArray3[0] = (byte)byArray2.length;
            int n = 0;
            while (n < byArray4.length - 1) {
                int n2 = 17;
                int n3 = 0;
                if (n + 1 < byArray.length) {
                    n2 = byArray[n + 1];
                }
                if (n >= by && n - by < byArray2.length) {
                    n3 = byArray2[n - by];
                }
                byArray4[n + 1] = (byte)(n2 ^ n3);
                ++n;
            }
            return byArray4;
        }
        catch (Throwable throwable) {
            try {
                byte by = byArray[0];
                byte[] byArray5 = string.getBytes();
                byte[] byArray6 = new byte[Math.max(byArray.length - 1, byArray5.length + by) + 1];
                byte[] byArray7 = byArray6;
                byArray6[0] = (byte)byArray5.length;
                int n = 0;
                while (n < byArray7.length - 1) {
                    int n4 = 17;
                    int n5 = 0;
                    if (n + 1 < byArray.length) {
                        n4 = byArray[n + 1];
                    }
                    if (n >= by && n - by < byArray5.length) {
                        n5 = byArray5[n - by];
                    }
                    byArray7[n + 1] = (byte)(n4 ^ n5);
                    ++n;
                }
                return byArray7;
            }
            catch (Throwable throwable2) {
                return null;
            }
        }
    }
}
