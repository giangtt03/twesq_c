package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import java.io.UnsupportedEncodingException;

public final class jm {
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;

    public final byte[] a() {
        byte[] byArray = null;
//        try {
            byte[] byArray2 = com.mg.bas.i.c(this.b);
            int n = 12 + byArray2.length + 16;
            byArray = new byte[n];
            System.arraycopy(m.a(this.a), 0, byArray, 0, 4);
            System.arraycopy(m.a(this.c), 0, byArray, 4, 4);
            System.arraycopy(m.a(this.d), 0, byArray, 8, 4);
            System.arraycopy(m.a(this.e), 0, byArray, 12, 4);
            System.arraycopy(m.a(this.f), 0, byArray, 16, 4);
            System.arraycopy(m.a(this.g), 0, byArray, 20, 4);
            System.arraycopy(m.a(byArray2.length), 0, byArray, 24, 4);
            System.arraycopy(byArray2, 0, byArray, 28, byArray2.length);
        return null;
        }
////        catch (UnsupportedEncodingException unsupportedEncodingException) {
////            UnsupportedEncodingException unsupportedEncodingException2 = unsupportedEncodingException;
////            unsupportedEncodingException.printStackTrace();
////        }
//        return byArray;
//    }

    public final String toString() {
        String string = " x = " + this.d + " y= " + this.e + "       w = " + this.f + " h = " + this.g + "        " + this.b + "   type = " + this.a;
        return string;
    }
}
