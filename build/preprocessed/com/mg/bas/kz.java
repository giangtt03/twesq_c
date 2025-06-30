package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

final class kz
implements kn {
    private DataOutputStream b;

    public kz(OutputStream outputStream) {
        this.b = new DataOutputStream(outputStream);
    }

    public final void a() {
        if (this.b != null) {
            try {
                this.b.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            this.b = null;
        }
    }

    final void a(kx object, short s) {
        if (this.b == null) {
            return;
        }
        try {
            byte[] byArray = object.a();
            if (byArray != null) {
                int n = 6 + byArray.length;
                this.b.writeInt(n);
                this.b.writeByte(1);
                this.b.write(kn.a, 0, 4);
                this.b.writeByte(s);
                this.b.write(byArray, 0, byArray.length);
                ks.h += 6 + byArray.length;
            } else {
                this.b.writeInt(10);
                this.b.writeByte(1);
                this.b.write(kn.a, 0, 4);
                this.b.writeByte(s);
                ks.h += 10;
            }
            this.b.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
