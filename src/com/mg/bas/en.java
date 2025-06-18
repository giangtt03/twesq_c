package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import java.io.DataOutputStream;
import java.io.OutputStream;

final class en
implements eg {
    private DataOutputStream a;
    private dv b;

    public en(OutputStream outputStream) {
        this.a = new DataOutputStream(outputStream);
    }

    public final void a() {
        if (this.a != null) {
            try {
                this.a.close();
                this.a = null;
                return;
            }
            catch (Exception exception) {}
        }
    }

    final void a(el object, short s) {
        if (this.a == null) {
            return;
        }
        object = ((el)object).a();
        int n = 0;
        if (object != null) {
            this.a.writeByte(4);
            this.a.write(eg.C, 0, 4);
            this.a.writeInt(((Object)object).length);
            this.a.writeByte(s);
            this.a.write((byte[])object, 0, ((Object)object).length);
            n = 0 + (10 + ((Object)object).length);
        } else {
            this.a.writeByte(4);
            this.a.write(eg.C, 0, 4);
            this.a.writeInt(0);
            this.a.writeByte(s);
            n += 10;
        }
        if (this.b != null) {
            this.b.b(n);
        }
        this.a.flush();
    }

    public final void a(dv dv2) {
        this.b = dv2;
    }
}
