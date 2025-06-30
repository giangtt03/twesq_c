package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import java.io.ByteArrayOutputStream;

public final class kx {
    private ByteArrayOutputStream a = new ByteArrayOutputStream();

    public final void a(short s, byte[] byArray) {
        if (byArray == null) {
            return;
        }
        this.a.write((byte)s);
        kx kx2 = this;
        try {
            byte[] byArray2 = m.a(byArray.length);
            kx2.a.write(byArray2, 0, 4);
            kx2.a.write(byArray, 0, byArray.length);
            return;
        }
        catch (Throwable throwable) {
            Throwable throwable2 = throwable;
            throwable.printStackTrace();
            return;
        }
    }

    public final void a(short s, String object) {
        if (object == null) {
            return;
        }
        this.a.write((byte)s);
        Object object2 = this;
        try {
            byte[] byArray = ((String)object).getBytes("UTF-8");
            if (byArray == null || byArray.length == 0) {
                byArray = ((String)object).getBytes();
            }
            byte[] byArray2 = m.a(byArray.length);
            ((kx)object2).a.write(byArray2, 0, 4);
            ((kx)object2).a.write(byArray, 0, byArray.length);
            return;
        }
        catch (Throwable throwable) {
            byte[] byArray = ((String)object).getBytes();
            byte[] byArray2 = m.a(byArray.length);
            try {
                ((kx)object2).a.write(byArray2, 0, 4);
                ((kx)object2).a.write(byArray, 0, byArray.length);
                return;
            }
            catch (Throwable throwable2) {
                object2 = throwable2;
                throwable2.printStackTrace();
                return;
            }
        }
    }

    public final void a(short s, byte by) {
        this.a(s, new byte[]{by});
    }

    public final void a(short s, int n) {
        this.a(s, new byte[]{(byte)n});
    }

    public final void b(short s, int n) {
        this.a(s, m.a(n));
    }

    public final void a(short s, long l) {
        this.a(s, m.a(l));
    }

    public final byte[] a() {
        return this.a.toByteArray();
    }
}
