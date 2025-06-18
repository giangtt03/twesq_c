package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import java.io.InputStream;

final class ed {
    private InputStream a;
    private dv b;

    public ed(InputStream inputStream) {
        this.a = inputStream;
    }

    public final dy a() {
        int n;
        int n2;
        dy dy2 = new dy();
        byte[] byArray = new byte[7];
        int n3 = this.a(byArray);
        if (n3 <= 0) {
            return null;
        }
        int n4 = m.a(byArray[0], byArray[1]);
        dy2.a = n2 = m.a(byArray[2], byArray[3], byArray[4], byArray[5]);
        dy2.b = n = m.a(byArray[6]);
        if (n2 > 0) {
            dx[] dxArray = new dx[n4];
            n4 = 0;
            while (n4 < dxArray.length) {
                byte[] byArray2 = new byte[5];
                if (this.a(byArray2) < 0) {
                    return null;
                }
                short s = (short)m.a(byArray2[0]);
                int n5 = m.a(byArray2[1], byArray2[2], byArray2[3], byArray2[4]);
                if (this.a(byArray2 = new byte[n5]) < 0) {
                    return null;
                }
                dxArray[n4] = new dx();
                dxArray[n4].a = s;
                dxArray[n4].b = byArray2;
                ++n4;
            }
            dy2.c = dxArray;
        }
        n3 += n2;
        if (this.b != null) {
            this.b.a(n3);
        }
        return dy2;
    }

    private int a(byte[] byArray) {
        int n = 0;
        while (n < byArray.length) {
            int n2 = this.a.read(byArray, n, byArray.length - n);
            if (n2 < 0) {
                return -1;
            }
            n += n2;
        }
        return n;
    }

    public final void b() {
        try {
            this.a.close();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public final void a(dv dv2) {
        this.b = dv2;
    }
}
