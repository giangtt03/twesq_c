package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import java.io.ByteArrayOutputStream;

public final class el {
    private ByteArrayOutputStream a = new ByteArrayOutputStream();

    public final void a(short s, byte[] byArray) {
        this.a.write((byte)s);
        el el2 = this;
        try {
            byte[] byArray2 = m.a(byArray.length);
            el2.a.write(byArray2, 0, 4);
            el2.a.write(byArray, 0, byArray.length);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public final void a(short s, String object) {
        this.a.write((byte)s);
        el el2 = this;
        try {
            byte[] byArray = ((String)object).getBytes("UTF-8");
            if (byArray == null || byArray.length == 0) {
                byArray = ((String)object).getBytes();
            }
            byte[] byArray2 = m.a(byArray.length);
            el2.a.write(byArray2, 0, 4);
            el2.a.write(byArray, 0, byArray.length);
            return;
        }
        catch (Throwable throwable) {
            byte[] byArray = ((String)object).getBytes();
            object = m.a(byArray.length);
            try {
                el2.a.write((byte[])object, 0, 4);
                el2.a.write(byArray, 0, byArray.length);
                return;
            }
            catch (Throwable throwable2) {
                return;
            }
        }
    }

    public final void a(short s, long l) {
        this.a(s, m.a(l));
    }

    public final void a(short s, int n) {
        this.a(s, m.a(n));
    }

    public final void a(short s, short s2) {
        this.a(s, m.a(s2));
    }

    public final void a(short s, byte by) {
        this.a(s, new byte[]{by});
    }

    public final byte[] a() {
        return this.a.toByteArray();
    }
}
