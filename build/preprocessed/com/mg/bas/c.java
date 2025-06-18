package com.mg.bas;
// Bitmap font manager and renderer, handles special character logic for the game. Extends d.
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class c
extends d {
    protected Image a;
    protected int[] b;
    protected int[] c;
    protected int[] d;
    protected int[] e;
    protected int[] f;
    protected int g;
    private int k = -1;
    private static String l = " 0123456789.,:!?()+-*/#$%abcdefghijklmnopqrstuvwxyzáàảãạăắằẳẵặâấầ̉ẫậéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵđABCDĐEFGHIJKLMNOPQRSTUVWXYZÁÀẢÃẠĂẮẰẲẴẶÂẤẦ̉ẫậÉÈẺẼẸÊẾỀỂỄỆÍÌỈĨỊÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢÚÙỦŨỤƯỨỪỬỮỰÝỲỶỸỴ\\\"@<=>;_&'`^~{}[]";
    private static byte[] m;
    protected int h;
    private boolean n = false;
    private boolean o = false;
    private boolean p;
    protected int i = 1;

    static {
        char c2 = '\u0000';
        int n = 0;
        while (n < l.length()) {
            if (c2 < l.charAt(n)) {
                c2 = l.charAt(n);
            }
            ++n;
        }
        m = new byte[c2 + 1];
        n = 0;
        while (n < m.length) {
            c.m[n] = 0;
            ++n;
        }
        n = 0;
        while (n < l.length()) {
            c.m[c.l.charAt((int)n)] = (byte)n;
            ++n;
        }
    }

    public final void a(Graphics graphics, String string, int n, int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        int n8;
        int n9;
        block19: {
            block18: {
                n9 = 0 + string.length();
                n = graphics.getClipY();
                int n10 = graphics.getClipHeight();
                n8 = graphics.getClipX();
                n7 = graphics.getClipWidth();
                if (n4 > n + n10) break block18;
                c c2 = this;
                if (n4 + c2.h >= n) break block19;
            }
            return;
        }
        int n11 = 0;
        if (n5 == 0) {
            n6 = n3;
            if (this.o) {
                n11 = n2 == string.length() ? this.a(string) : this.a(string.substring(0, n9));
            }
        } else {
            n11 = n2 == string.length() ? this.a(string) : this.a(string.substring(0, n9));
            n6 = n5 == 2 ? n3 - n11 : n3 - (n11 >> 1);
        }
        if (this.k != -1) {
            graphics.setColor(this.k);
            graphics.fillRect(n6, n4, n11, this.h);
        }
        n2 = 0;
        while (n2 < n9) {
            try {
                n = m[string.charAt(n2)] & 0xFF;
            }
            catch (Throwable throwable) {
                n = 0;
            }
            if (this.n && this.f[n] <= this.h >> 1 && this.e[n] - (this.h >> 1) + this.f[n] > 1) {
                int n12 = this.e[n] >>> 1;
                int n13 = this.e[n] - n12;
                graphics.drawRegion(this.a, this.b[n], this.c[n], this.d[n], n12, 0, n6 + 1, n4 + this.f[n] - 1, 0);
                graphics.drawRegion(this.a, this.b[n], this.c[n] + n12, this.d[n], n13, 0, n6, n4 + n12 + this.f[n] - 1, 0);
            } else {
                graphics.drawRegion(this.a, this.b[n], this.c[n], this.d[n], this.e[n], 0, n6, n4 + this.f[n] - 1, 0);
                if (this.p) {
                    graphics.drawRegion(this.a, this.b[n], this.c[n], this.d[n], this.e[n], 0, n6 + 1, n4 + this.f[n] - 1, 0);
                }
            }
            if ((n6 += this.d[n] + this.i) > n8 + n7) break;
            ++n2;
        }
        if (this.o) {
            graphics.setColor(this.j);
            if (n5 == 2) {
                n3 -= n11;
            } else if (n5 == 1) {
                n3 -= n11 / 2;
            }
            graphics.drawLine(n3, n4 + this.g + 1, n3 + n11 - 1, n4 + this.g + 1);
        }
    }

    public final int a() {
        return this.h;
    }

    public final int a(String string) {
        if (string == null || string.length() == 0) {
            return 0;
        }
        int n = 0;
        int n2 = 0;
        while (n2 < string.length()) {
            n += this.a(string.charAt(n2));
            ++n2;
        }
        return n;
    }

    public final int a(char c2) {
        try {
            c2 = (char)(m[c2] & 0xFF);
        }
        catch (Exception exception) {
            c2 = '\u0000';
        }
        return this.d[c2] + this.i;
    }

    public final int b() {
        return this.g;
    }

    public final void a(boolean bl) {
        this.n = bl;
    }

    public final void c() {
        boolean bl = false;
        c c2 = this;
        this.n = bl;
        bl = false;
        c2 = this;
        this.o = bl;
        this.c(false);
    }

    public final void b(boolean bl) {
        this.o = bl;
    }

    public void c(boolean bl) {
        this.p = bl;
    }
}
