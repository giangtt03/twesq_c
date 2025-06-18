package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class jx
extends as {
    private static byte[][] s = new byte[][]{new byte[1]};
    private String t;
    private np u;
    private long v = 0L;
    private byte w = 0;

    public jx(Image image, int n) {
        super(image, 1);
        this.a(s);
        this.g = 0;
    }

    public final void k() {
        if (!this.r) {
            return;
        }
        this.w = (byte)(this.w + 1);
        if (this.w > 5) {
            this.w = 0;
            super.k();
            this.b(this.v - this.u.f());
        }
    }

    public final void a(long l) {
        if (this.u == null) {
            this.u = new np();
        }
        this.u.a();
        this.v = l;
        this.b(l);
    }

    private void b(long l) {
        String string;
        StringBuffer stringBuffer;
        long l2 = l / 1000L;
        long l3 = (int)(l2 / 60L);
        l2 %= 60L;
        int n = (int)(l3 / 60L);
        l3 %= 60L;
        int n2 = n / 24;
        n %= 24;
        if (n2 > 0) {
            stringBuffer = new StringBuffer(String.valueOf(n2)).append("Ngày");
            string = " ";
        } else {
            stringBuffer = new StringBuffer(String.valueOf(n >= 10 ? String.valueOf(n) + ":" : (n > 0 ? "0" + n + ":" : "00:"))).append(l3 >= 10L ? String.valueOf(l3) + ":" : (l3 > 0L ? "0" + l3 + ":" : "00:"));
            string = l2 >= 10L ? String.valueOf(l2) : (l2 > 0L ? "0" + l2 : "00");
        }
        this.t = stringBuffer.append(string).toString();
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (!this.r) {
            return;
        }
        super.a(graphics, n, n2);
        if (this.t != null) {
            bx.c.a(graphics, this.t, n += this.o, n2 += (this.p - bx.c.a()) / 2, 0);
        }
    }
}
