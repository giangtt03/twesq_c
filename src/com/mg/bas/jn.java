package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1

import java.io.UnsupportedEncodingException;

public final class jn {

    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public byte[] h;
    public byte[] i;
    public byte[] j;
    public int k;
    public jm[] l;
    public int[] m;
    public int n;

    public final byte[] a() {
        try {
            byte[] byArray = null;
//        try {
            byte[] byArray2 = com.mg.bas.i.c(this.a);
            int n = 32 + (byArray2.length + 4);
            byte[] byArray3 = com.mg.bas.i.c(this.b);
            n += byArray3.length + 4;
            n += this.h.length + 4 + this.i.length + 4 + this.j.length + 4;
            byte[] byArray4 = new byte[this.m.length << 2];
            int n2 = 0;
            int n3 = 0;
            while (n3 < this.m.length) {
                System.arraycopy(com.mg.bas.m.a(this.m[n3]), 0, byArray4, n2, 4);
                n2 += 4;
                ++n3;
            }
            n += byArray4.length;
            n += 4;
            byte[][] byArrayArray = new byte[this.l.length][];
            int n4 = 0;
            int n5 = 0;
            while (n5 < byArrayArray.length) {
                byArrayArray[n5] = this.l[n5].a();
                n += byArrayArray[n5].length + 4;
                n4 += byArrayArray[n5].length + 4;
                ++n5;
            }
            byArray = new byte[n += 4];
            System.arraycopy(com.mg.bas.m.a(this.f), 0, byArray, 0, 4);
            System.arraycopy(com.mg.bas.m.a(this.e), 0, byArray, 4, 4);
            System.arraycopy(com.mg.bas.m.a(this.g), 0, byArray, 8, 4);
            System.arraycopy(com.mg.bas.m.a(this.c), 0, byArray, 12, 4);
            System.arraycopy(com.mg.bas.m.a(this.d), 0, byArray, 16, 4);
            System.arraycopy(com.mg.bas.m.a(this.k), 0, byArray, 20, 4);
            System.arraycopy(com.mg.bas.m.a(byArray2.length), 0, byArray, 24, 4);
            System.arraycopy(byArray2, 0, byArray, 28, byArray2.length);
            n2 = 28 + byArray2.length;
            System.arraycopy(com.mg.bas.m.a(byArray3.length), 0, byArray, n2, 4);
            System.arraycopy(byArray3, 0, byArray, n2 += 4, byArray3.length);
            System.arraycopy(com.mg.bas.m.a(this.h.length), 0, byArray, n2 += byArray3.length, 4);
            System.arraycopy(this.h, 0, byArray, n2 += 4, this.h.length);
            System.arraycopy(com.mg.bas.m.a(this.i.length), 0, byArray, n2 += this.h.length, 4);
            System.arraycopy(this.i, 0, byArray, n2 += 4, this.i.length);
            System.arraycopy(com.mg.bas.m.a(this.j.length), 0, byArray, n2 += this.i.length, 4);
            System.arraycopy(this.j, 0, byArray, n2 += 4, this.j.length);
            System.arraycopy(com.mg.bas.m.a(byArray4.length), 0, byArray, n2 += this.j.length, 4);
            System.arraycopy(byArray4, 0, byArray, n2 += 4, byArray4.length);
            System.arraycopy(com.mg.bas.m.a(n4), 0, byArray, n2 += byArray4.length, 4);
            n2 += 4;
            n5 = 0;
            while (n5 < byArrayArray.length) {
                System.arraycopy(com.mg.bas.m.a(byArrayArray[n5].length), 0, byArray, n2, 4);
                System.arraycopy(byArrayArray[n5], 0, byArray, n2 += 4, byArrayArray[n5].length);
                n2 += byArrayArray[n5].length;
                ++n5;
            }
            return null;
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
        return null;
    }
//        catch (UnsupportedEncodingException unsupportedEncodingException) {
//            UnsupportedEncodingException unsupportedEncodingException2 = unsupportedEncodingException;
//            unsupportedEncodingException.printStackTrace();
//        }
//        return byArray;
//    }
}
