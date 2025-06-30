package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ki
extends at {
    public static final byte[] a;
    public static final byte[] b;
    private int h = 0;
    private static byte[] i;
    private static byte[] j;
    public int c;
    private Image k = null;
    private int s = 0;
    public int d = 0;
    private byte[] t = null;
    private int u;
    public k e;
    private int v;
    public jo f;
    public Image g = null;
    private int w = 0;
    private int x = 0;
    private int y = 0;
    private lh z;
    private int A = 12;
    private d B = bx.c;
    private int C = 0;
    private int D;
    private int E;

    static {
        byte[] byArray = new byte[4];
        byArray[2] = -1;
        byArray[3] = 1;
        a = byArray;
        byte[] byArray2 = new byte[4];
        byArray2[0] = -1;
        byArray2[1] = 1;
        b = byArray2;
        byte[] byArray3 = new byte[9];
        byArray3[3] = 4;
        byArray3[4] = 4;
        byArray3[5] = 4;
        byArray3[6] = 5;
        byArray3[7] = 5;
        byArray3[8] = 5;
        i = byArray3;
        j = new byte[]{3, 3, 3, 2, 2, 3, 1, 1, 1};
    }

     public ki(final Image k, final int n, int n2, final jo f, final lh z, final Image g) {
        super();
        this.h = 0;
        this.k = null;
        this.s = 0;
        this.d = 0;
        this.t = null;
        this.g = null;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.A = 12;
        this.B = bx.c;
        this.C = 0;
        final int n3 = 1;
        final int n4 = 6;
        n2 = n3;
        this.k = k;
        super.o = k.getWidth() / n4;
        super.p = k.getHeight() / n2;
        this.z = z;
        this.f = f;
        this.a(super.m, super.n, super.o - 12, 20);
        this.w = super.o >> 1;
        if (g == null) {
            if (f != null) {
                final int n5 = f.d - z.G;
                switch (f.g) {
                    case 1: {
                        this.C = 16711680;
                        break;
                    }
                    case 2: {
                        this.C = 9008914;
                        break;
                    }
                    default: {
                        if (n5 >= 5) {
                            this.C = 1471487;
                            break;
                        }
                        if (n5 < -9) {
                            this.C = 11184810;
                            break;
                        }
                        this.B = bx.c;
                        this.C = 14540253;
                        break;
                    }
                }
                this.D = this.B.a(f.b);
                this.E = this.B.a();
            }
            return;
        }
        this.g = g;
    }
    
    public ki() {
        this.a(this.m, this.n, this.o, this.p);
    }

     public final void a(final Graphics graphics, final int n, int n2) {
        this.b(graphics, n, n2);
        final int n3 = n2;
        n2 = n;
        if (this.f.b != null) {
            graphics.setColor(this.C);
            graphics.fillRect(super.m + this.w + n2 - this.D / 2, super.n + this.A + n3 - this.E / 2, this.D, this.E);
            this.B.a(graphics, this.f.b, super.m + this.w + n2 - this.D / 2, super.n + this.A + n3 - this.E / 2, 0);
        }
    }

    public final void b(Graphics graphics, int n, int n2) {
        if (this.k != null) {
            graphics.drawRegion(this.k, this.t[this.u] * this.o, 0, this.o, this.p, this.v, this.m + n, this.n + this.A + n2, 0);
            return;
        }
        graphics.setColor(0);
        graphics.fillArc(this.m + n, this.n + n2, this.o, this.p, 0, 360);
    }

    public final void a(int n) {
        this.h = n;
        this.u = 0;
        switch (this.h) {
            case 0: {
                byte[] byArray = i;
                ki ki2 = this;
                this.t = byArray;
                return;
            }
            case 1: {
                byte[] byArray = j;
                ki ki3 = this;
                this.t = byArray;
            }
        }
    }

    public final void a(int n, int n2) {
        this.b(n2);
        this.a(n);
    }

    public final void i() {
        switch (this.h) {
            case 0: {
                ++this.u;
                if (this.u < this.t.length) break;
                this.u = 0;
                break;
            }
            default: {
                ++this.u;
                if (this.u < this.t.length) break;
                this.u = 0;
            }
        }
        if (this.e != null) {
            this.e.a = this.m + this.x;
            this.e.b = this.n + this.y;
        }
    }

    public final void b(int n) {
        this.c = n;
        this.v = n == 2 ? 0 : (n == 3 ? 2 : this.v);
    }

    public final int a() {
        return this.h;
    }

    public final void b(int n, int n2) {
        this.m += n;
        this.n += n2;
    }

    public final void a(int n, int n2, int n3, int n4) {
        this.e = new k(n, n2, n3, n4);
        this.x = (this.o - this.e.c) / 2;
        this.y = this.p - this.e.d;
    }

    public static Image a(Image image, int n) {
        int n2 = image.getWidth();
        int n3 = image.getHeight();
        int[] nArray = new int[n2 * n3];
        image.getRGB(nArray, 0, n2, 0, 0, n2, n3);
        int n4 = 0;
        while (n4 < n3) {
            int n5 = 0;
            while (n5 < n2) {
                int n6 = n5 + n4 * n2;
                if ((nArray[n6] & 0xFFFFFF) == n) {
                    nArray[n6] = 0;
                }
                ++n5;
            }
            ++n4;
        }
        image = Image.createRGBImage((int[])nArray, (int)n2, (int)n3, (boolean)true);
        return image;
    }

    public final void c(int n, int n2) {
        super.c(n, n2);
        if (this.e != null) {
            this.e.a = n + this.x;
            this.e.b = n2 + this.y;
        }
    }

    public final void c(int n) {
        this.A = n;
    }

    public final ki b() {
        ki ki2 = new ki(this.k, 1, 6, this.f, this.z, this.g);
        ki2.h(this.o);
        ki2.i(this.p);
        ki2.a(0, 2);
        ki2.g = null;
        ki2.w = this.w;
        ki2.A = this.A;
        return ki2;
    }
}
