package com.mg.bas;
// Data model for an entity with an integer array, supporting deserialization from bytes and deep copying.
// Decompiled with: CFR 0.152
// Class Version: 1
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

public final class dg {
    public int a;
    public String b;
    public int[] c;

    private dg(int n, int[] nArray) {
        this.a = n;
        this.c = nArray;
    }

    public dg(int n, byte[] byArray) {
        this(n, dg.a(byArray));
    }

    private static int[] a(byte[] byArray) {
        try {
            int[] nArray = new int[byArray.length / 4];
            DataInputStream dis = new DataInputStream(new ByteArrayInputStream(byArray));
            int n = 0;
            while (n < nArray.length) {
                nArray[n] = dis.readInt();
                ++n;
            }
            dis.close();
            return nArray;
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public final dg a() {
        int[] copy = new int[this.c.length];
        System.arraycopy(this.c, 0, copy, 0, this.c.length);
        dg v0 = new dg(this.a, copy);
        v0.b = this.b;
        return v0;
    }

    public final String toString() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dg) {
            dg dg2 = (dg)obj;
            int[] nArray = this.c;
            int[] otherArray = dg2.c;
            if (otherArray == null || nArray == null) {
                return otherArray == nArray;
            }
            if (otherArray.length != nArray.length) {
                return false;
            }
            int n = 0;
            while (n < otherArray.length) {
                if (otherArray[n] != nArray[n]) {
                    return false;
                }
                ++n;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int[] nArray = this.c;
        if (this.c == null) {
            return 0;
        }
        int n = 1;
        int n2 = 0;
        while (n2 < nArray.length) {
            n = n * 31 + nArray[n2];
            ++n2;
        }
        return n;
    }
}
