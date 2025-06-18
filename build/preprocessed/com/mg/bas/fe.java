package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Graphics;

public final class fe
extends aq {
    private a i;
    private int j = 0;
    private String k;
    private int l;
    private k m;

    public fe(String string) {
        this.k = string;
        this.d = new k(0, 0, v.t - 20, v.u);
        this.m = new k(0, 0, this.d.c, 9 + bx.d.a());
        this.i = new a();
        this.l = this.m.d + 5;
    }

    public final void d(boolean bl) {
        super.d(bl);
        this.c = true;
    }

    public final void a(fl fl2) {
        fl2.a(this);
        fl2.a(0, this.l, this.d.c, bx.d.a());
        this.l += fl2.f() + 5;
        this.d.d = this.l + 5;
        this.e(this.d.d);
        this.i.a(fl2);
        if (this.i.d() == 1) {
            this.j = 0;
            fl2.d(true);
        }
        if (fl2.m()) {
            this.j = this.i.d() - 1;
        }
    }

    public final void b(int n, int n2) {
        super.b(n, n2);
        this.m = new k(0, 0, this.d.c, 9 + bx.d.a());
    }

    public final void a(int n, int n2, int n3, int n4) {
        super.a(n, n2, n3, n4);
        this.m = new k(this.d.a, this.d.b, this.d.c, 9 + bx.d.a());
        this.k = com.mg.sq.a.a(this.k, this.d.c - 4);
    }

    public final boolean f(int n) {
        if (this.i.d() <= 0) {
            return false;
        }
        int n2 = this.j;
        boolean bl = false;
        switch (n) {
            case 98: {
                if (this.j >= this.i.d() - 1) break;
                ++this.j;
                bl = true;
                break;
            }
            case 99: {
                if (this.j <= 0) break;
                --this.j;
                bl = true;
                break;
            }
            case 95: {
                ((fl)this.i.b(this.j)).f(n);
            }
        }
        if (n2 != this.j) {
            ((fl)this.i.b(n2)).d(false);
            ((fl)this.i.b(this.j)).d(true);
            this.c = true;
            this.b.c(true);
        }
        return bl;
    }

    public final boolean c(int n, int n2) {
        n -= this.c() + 5 + 4;
        n2 -= this.d();
        int n3 = 0;
        int n4 = this.i.d();
        while (n3 < n4) {
            fl fl2 = (fl)this.i.b(n3);
            if (fl2.c(n, n2)) {
                this.j = n3;
            } else {
                fl2.d(false);
            }
            ++n3;
        }
        return true;
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.c) {
            return;
        }
        if (this.m()) {
            pc.a(graphics, this.c() + n, this.d() + n2, this.e(), this.f(), 7070703, -1);
            graphics.setColor(7267055);
            graphics.fillRect(this.c() + n, this.d() + n2, this.m.c, this.m.d);
        }
        int n3 = n2 + this.d() + 4;
        int n4 = this.c() + n + 4;
        bx.d.c(true);
        bx.d.a(graphics, this.k, n4, n3, 0);
        bx.d.c(false);
        n3 = n2 + this.d.b;
        n4 += 5;
        int n5 = 0;
        int n6 = this.i.d();
        while (n5 < n6) {
            fl fl2 = (fl)this.i.b(n5);
            if (n5 == this.j && this.m()) {
                int n7 = n3;
                int n8 = this.c() + n;
                Graphics graphics2 = graphics;
                fl fl3 = fl2;
                if (fl3.m()) {
                    graphics2.setColor(7267055);
                    graphics2.fillRect(fl3.c() + n8, fl3.d() + n7 - 1, fl3.e(), bx.d.a() + 2);
                }
            }
            fl2.a(graphics, n4, n3);
            ++n5;
        }
        this.c = false;
    }

    public final byte[] a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        byte[] byArray = null;
        try {
            int n = 0;
            while (n < this.i.d()) {
                fl fl2 = (fl)this.i.b(n);
                dataOutputStream.writeUTF(fl2.a());
                ++n;
            }
            dataOutputStream.flush();
            byArray = byteArrayOutputStream.toByteArray();
            dataOutputStream.close();
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        return byArray;
    }

    public final void a(byte[] object) {
        object = new ByteArrayInputStream((byte[])object);
        DataInputStream dataInputStream = new DataInputStream((InputStream)object);
        int n = 0;
        while (n < this.i.d()) {
            fl fl2 = (fl)this.i.b(n);
            fl2.a(dataInputStream.readUTF());
            ++n;
        }
        dataInputStream.close();
        ((ByteArrayInputStream)object).close();
    }
}
