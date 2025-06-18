package com.mg.bas;
// Data model for an entity with an integer array, supporting deserialization from bytes and deep copying.
// Decompiled with: CFR 0.152
// Class Version: 1
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FilterInputStream;

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

    private static int[] a(byte[] object) {
        try {
            int[] nArray = new int[((byte[])object).length / 4];
            object = new DataInputStream(new ByteArrayInputStream((byte[])object));
            int n = 0;
            while (n < nArray.length) {
                nArray[n] = ((DataInputStream)object).readInt();
                ++n;
            }
            ((FilterInputStream)object).close();
            return nArray;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return null;
        }
    }

    public final dg a() {
        Object object = new int[this.c.length];
        System.arraycopy(this.c, 0, object, 0, this.c.length);
        object = new dg(this.a, (int[])object);
        v0.b = this.b;
        return object;
    }

    public final String toString() {
        return this.b;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dg) {
            dg dg2 = (dg)object;
            object = dg2;
            int[] nArray = this.c;
            object = dg2.c;
            if (dg2.c == null || nArray == null) {
                return object == nArray;
            }
            if (((Object)object).length != nArray.length) {
                return false;
            }
            int n = 0;
            while (n < ((Object)object).length) {
                if (object[n] != nArray[n]) {
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
