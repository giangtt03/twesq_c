package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class mb {
    private int a;
    private int[][][] b;
    private int[] c;
    private byte[][] d;
    private int e;
    private static a f = new a();

    public mb(int n) {
        this(n, pa.a().a(n, false, true));
    }

    private mb(int n, byte[] byArray) {
        this.a = n;
        this.a(byArray);
    }

     private void a(final byte[] array) {
        try {
            final DataInputStream dataInputStream;
            (dataInputStream = new DataInputStream(new ByteArrayInputStream(array))).readByte();
            this.e = dataInputStream.readInt();
            final byte byte1 = dataInputStream.readByte();
            this.b = new int[byte1][][];
            this.d = new byte[byte1][];
            this.c = new int[byte1];
            for (int i = 0; i < this.b.length; ++i) {
                final byte byte2 = dataInputStream.readByte();
                this.c[i] = dataInputStream.readByte();
                final byte byte3 = dataInputStream.readByte();
                this.b[byte2] = new int[byte3][2];
                this.d[byte2] = new byte[byte3];
                for (byte b = 0; b < byte3; ++b) {
                    this.d[byte2][b] = dataInputStream.readByte();
                    this.b[byte2][b][0] = dataInputStream.readShort();
                    this.b[byte2][b][1] = dataInputStream.readShort();
                }
            }
            dataInputStream.close();
        }
        catch (final Exception ex) {
            ct.a(new StringBuffer(String.valueOf(this.a)).toString());
            ex.printStackTrace();
        }
    }
    

    private static Image b(int n) {
        int n2 = n;
        pa pa2 = pa.a();
        return com.mg.bas.f.a(pa2.b(n2, false));
    }

    private static Image a(int n, df df2) {
        int n2 = n;
        Object object = pa.a();
        object = ((pa)object).b(n2, false);
        if (df2 != null && df2.d != null && df2.e != null && !df2.d.equals(df2.e)) {
            h.a((byte[])object, df2.d.c, df2.e.c);
        }
        return com.mg.bas.f.a((byte[])object);
    }

    private static Image a(int n, df df2, df df3) {
        int n2 = n;
        Object object = pa.a();
        object = ((pa)object).b(n2, false);
        if (df2 != null && df2.d != null && df2.e != null && !df2.d.equals(df2.e)) {
            h.a((byte[])object, df2.d.c, df2.e.c);
        }
        if (df3 != null && df3.d != null && df3.e != null && !df3.d.equals(df3.e)) {
            h.a((byte[])object, df3.d.c, df3.e.c);
        }
        return com.mg.bas.f.a((byte[])object);
    }

    private static ma a(final lh lh, final mb mb, final mb mb2, final mb mb3, final mb mb4, final int n, final int n2, final boolean b) {
        final int a;
        final ma c;
        if ((c = c(a = a(lh, mb, mb2, mb3, mb4, n))) != null) {
            return c;
        }
        final int n3 = mb2.c[n];
        final int n4 = mb.c[n];
        final int n5 = mb3.c[n];
        final int n6 = mb4.c[n];
        final Image a2 = a(n + 99000, lh.W);
        final Image a3 = a(mb2.e + n, lh.V, lh.W);
        final Image a4 = a(mb.e + n, lh.U);
        final Image b2 = b(mb3.e + n);
        final Image b3 = b(mb4.e + n);
        final int a5 = a2.getWidth() / n2;
        final int n7 = a3.getWidth() / n3;
        final int n8 = b2.getWidth() / n5;
        final int n9 = b3.getWidth() / n6;
        final int n10 = a4.getWidth() / n4;
        final int height = a2.getHeight();
        final int height2 = a3.getHeight();
        final int height3 = a4.getHeight();
        final int height4 = b2.getHeight();
        final int height5 = b3.getHeight();
        final byte[] array = mb2.d[n];
        final byte[] array2 = mb.d[n];
        final byte[] array3 = mb3.d[n];
        final byte[] array4 = mb4.d[n];
        final int[][] array5 = mb2.b[n];
        final int[][] array6 = mb.b[n];
        final int[][] array7 = mb3.b[n];
        final int[][] array8 = mb4.b[n];
        final int[][] array9 = new int[n2][2];
        final int[][] array10 = new int[n2][2];
        final g g = new g();
        final Image[] array11 = new Image[n2];
        g.a = a5;
        g.b = height;
        for (int i = 0; i < n2; ++i) {
            int n11 = 0;
            int n12 = a5;
            int n13 = 0;
            int n14 = height;
            if (array5[i][0] < 0) {
                n11 = array5[i][0];
            }
            if (array6[i][0] < n11) {
                n11 = array6[i][0];
            }
            if (array7[i][0] < n11) {
                n11 = array7[i][0];
            }
            if (array8[i][0] < n11) {
                n11 = array8[i][0];
            }
            final int abs = Math.abs(n11);
            if (n12 < array5[i][0] + n7) {
                n12 = array5[i][0] + n7;
            }
            if (n12 < array6[i][0] + n10) {
                n12 = array6[i][0] + n10;
            }
            if (n12 < array7[i][0] + n8) {
                n12 = array7[i][0] + n8;
            }
            if (n12 < array8[i][0] + n9) {
                n12 = array8[i][0] + n9;
            }
            array9[i][0] = -abs;
            array9[i][1] = a5 - n12;
            if (array5[i][1] < 0) {
                n13 = array5[i][1];
            }
            if (array6[i][1] < n13) {
                n13 = array6[i][1];
            }
            if (array7[i][1] < n13) {
                n13 = array7[i][1];
            }
            if (array8[i][1] < n13) {
                n13 = array8[i][1];
            }
            final int abs2 = Math.abs(n13);
            if (height < array5[i][1] + height2) {
                n14 = array5[i][1] + height2;
            }
            if (n14 < array6[i][1] + height3) {
                n14 = array6[i][1] + height3;
            }
            if (n14 < array7[i][1] + height4) {
                n14 = array7[i][1] + height4;
            }
            if (n14 < array8[i][1] + height5) {
                n14 = array8[i][1] + height5;
            }
            array10[i][0] = -abs2;
            array10[i][1] = height - n14;
            final int n15 = abs + n12;
            final int n16 = abs2 + n14;
            final Image image;
            final Graphics graphics;
            (graphics = (image = Image.createImage(n15, n16)).getGraphics()).setColor(16711935);
            graphics.fillRect(0, 0, n15, n16);
            cw.a(graphics, a2, i * a5, 0, a5, height, abs, abs2, 0);
            if (a3 != null) {
                cw.a(graphics, a3, array[i] * n7, 0, n7, height2, abs + array5[i][0], abs2 + array5[i][1], 0);
            }
            if (a4 != null) {
                cw.a(graphics, a4, array2[i] * n10, 0, n10, height3, abs + array6[i][0], abs2 + array6[i][1], 0);
            }
            if (b3 != null) {
                cw.a(graphics, b3, array4[i] * n9, 0, n9, height5, abs + array8[i][0], abs2 + array8[i][1], 0);
            }
            if (b2 != null) {
                cw.a(graphics, b2, array3[i] * n8, 0, n8, height4, abs + array7[i][0], abs2 + array7[i][1], 0);
            }
            final int[] array12 = new int[n15 * n16];
            image.getRGB(array12, 0, n15, 0, 0, n15, n16);
            for (int j = 0; j < array12.length; ++j) {
                if ((array12[j] & 0xFFFFFF) == 0xFF00FF) {
                    array12[j] = 0;
                }
            }
            array11[i] = Image.createRGBImage(array12, n15, n16, true);
        }
        final ma ma = new ma(a, array11, array9, array10, n2, g);
        if (b) {
            a(ma);
        }
        return ma;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(ma ma2) {
        a a2 = f;
        synchronized (a2) {
            int n2 = 0;
            while (n2 < f.d()) {
                ma ma3 = (ma)f.b(n2);
                if (ma3.a == ma2.a) {
                    f.a(ma2, n2);
                    return;
                }
                ++n2;
            }
            f.a(ma2);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static ma c(int n2) {
        a a2 = f;
        synchronized (a2) {
            int n3 = 0;
            while (n3 < f.d()) {
                ma ma2 = (ma)f.b(n3);
                if (ma2.a == n2) {
                    return ma2;
                }
                ++n3;
            }
            return null;
        }
    }

    public static void a() {
        f.a();
    }

     
    public static mg a(final lh lh, final mb mb, final mb mb2, final mb mb3, final mb mb4, final boolean b) {
        lh.b();
        ma ma;
        if (!lh.ad) {
            ma = a(lh, mb, mb2, mb3, mb4, 0, 2, b);
        }
        else {
            ma = a(lh, mb, mb2, mb3, mb4, 3, 2, b);
        }
        final mg mg = new mg(ma.b, ma.c, ma.d, ma.e);
        if (!lh.ad) {
            mg.a(mg.u);
        }
        else {
            mg.a(mf.s);
        }
        if (lh.ad) {
            mg.d(1);
        }
        else {
            mg.d(0);
        }
        return mg;
    }

    public static mg b(final lh lh, final mb mb, final mb mb2, final mb mb3, final mb mb4, final boolean b) {
        final ma a = a(lh, mb, mb2, mb3, mb4, 1, 6, true);
        final mg mg;
        (mg = new mg(a.b, a.c, a.d, a.e)).a(mg.w);
        if (lh.ad) {
            mg.d(1);
        }
        else {
            mg.d(0);
        }
        return mg;
    }

    public static mg c(final lh lh, final mb mb, final mb mb2, final mb mb3, final mb mb4, final boolean b) {
        final ma a = a(lh, mb, mb2, mb3, mb4, 2, 4, b);
        final mg mg;
        (mg = new mg(a.b, a.c, a.d, a.e)).a(mg.v);
        if (lh.ad) {
            mg.d(1);
        }
        else {
            mg.d(0);
        }
        return mg;
    }
    
    public static mg d(final lh lh, final mb mb, final mb mb2, final mb mb3, final mb mb4, final boolean b) {
        final ma a = a(lh, mb, mb2, mb3, mb4, 9, 1, true);
        final mg mg;
        (mg = new mg(a.b, a.c, a.d, a.e)).a(mg.z);
        if (lh.ad) {
            mg.d(1);
        }
        else {
            mg.d(0);
        }
        return mg;
    }
    
    public static mg e(final lh lh, final mb mb, final mb mb2, final mb mb3, final mb mb4, final boolean b) {
        final ma a = a(lh, mb, mb2, mb3, mb4, 7, 1, true);
        final mg mg;
        (mg = new mg(a.b, a.c, a.d, a.e)).a(mg.x);
        if (lh.ad) {
            mg.d(1);
        }
        else {
            mg.d(0);
        }
        return mg;
    }
    
    public static mg f(final lh lh, final mb mb, final mb mb2, final mb mb3, final mb mb4, final boolean b) {
        final ma a = a(lh, mb, mb2, mb3, mb4, 8, 1, true);
        final mg mg;
        (mg = new mg(a.b, a.c, a.d, a.e)).a(mg.y);
        if (lh.ad) {
            mg.d(1);
        }
        else {
            mg.d(0);
        }
        return mg;
    }

    public static mc a(lh lh, final Image image, mb mb, mb mb2, mb mb3, mb mb4, final boolean b) {
        final lh lh2 = lh;
        final mb mb5 = mb;
        final mb mb6 = mb2;
        final mb mb7 = mb3;
        mb4 = mb4;
        mb3 = mb7;
        mb2 = mb6;
        mb = mb5;
        lh = lh2;
        final int a;
        ma c;
        if ((c = c(a = a(lh2, mb, mb2, mb3, mb4, 6))) == null) {
            final int n = mb2.c[6];
            final int n2 = mb.c[6];
            final int n3 = mb3.c[6];
            final int n4 = mb4.c[6];
            final Image a2 = a(99006, lh.W);
            final Image a3 = a(mb2.e + 6, lh.V, lh.W);
            final Image a4 = a(mb.e + 6, lh.U);
            final Image b2 = b(mb3.e + 6);
            final Image b3 = b(mb4.e + 6);
            final int a5 = a2.getWidth() / 3;
            final int n5 = a3.getWidth() / n;
            final int n6 = b2.getWidth() / n3;
            final int n7 = b3.getWidth() / n4;
            final int n8 = a4.getWidth() / n2;
            final int height = a2.getHeight();
            final int height2 = a3.getHeight();
            final int height3 = a4.getHeight();
            final int height4 = b2.getHeight();
            final int height5 = b3.getHeight();
            final byte[] array = mb2.d[6];
            final byte[] array2 = mb.d[6];
            final byte[] array3 = mb3.d[6];
            final byte[] array4 = mb4.d[6];
            final int[][] array5 = mb2.b[6];
            final int[][] array6 = mb.b[6];
            final int[][] array7 = mb3.b[6];
            final int[][] array8 = mb4.b[6];
            final int[][] array9 = new int[3][2];
            final int[][] array10 = new int[3][2];
            final g g = new g();
            final Image[] array11 = new Image[3];
            g.a = a5;
            g.b = height;
            for (int i = 0; i < 3; ++i) {
                int n9 = 0;
                int n10 = a5;
                int n11 = 0;
                int n12 = height;
                if (array5[i][0] < 0) {
                    n9 = array5[i][0];
                }
                if (array6[i][0] < n9) {
                    n9 = array6[i][0];
                }
                if (array7[i][0] < n9) {
                    n9 = array7[i][0];
                }
                if (array8[i][0] < n9) {
                    n9 = array8[i][0];
                }
                final int abs = Math.abs(n9);
                if (a5 < array5[i][0] + n5) {
                    n10 = array5[i][0] + n5;
                }
                if (n10 < array6[i][0] + n8) {
                    n10 = array6[i][0] + n8;
                }
                if (n10 < array7[i][0] + n6) {
                    n10 = array7[i][0] + n6;
                }
                if (n10 < array8[i][0] + n7) {
                    n10 = array8[i][0] + n7;
                }
                array9[i][0] = -abs;
                array9[i][1] = a5 - n10;
                if (array5[i][1] < 0) {
                    n11 = array5[i][1];
                }
                if (array6[i][1] < n11) {
                    n11 = array6[i][1];
                }
                if (array7[i][1] < n11) {
                    n11 = array7[i][1];
                }
                if (array8[i][1] < n11) {
                    n11 = array8[i][1];
                }
                final int abs2 = Math.abs(n11);
                if (height < array5[i][1] + height2) {
                    n12 = array5[i][1] + height2;
                }
                if (n12 < array6[i][1] + height3) {
                    n12 = array6[i][1] + height3;
                }
                if (n12 < array7[i][1] + height4) {
                    n12 = array7[i][1] + height4;
                }
                if (n12 < array8[i][1] + height5) {
                    n12 = array8[i][1] + height5;
                }
                array10[i][0] = -abs2;
                array10[i][1] = height - n12;
                final int n13 = abs + n10;
                final int n14 = abs2 + n12;
                final Image image2;
                final Graphics graphics;
                (graphics = (image2 = Image.createImage(n13, n14)).getGraphics()).setColor(16711935);
                graphics.fillRect(0, 0, n13, n14);
                cw.a(graphics, a2, i * a5, 0, a5, height, abs, abs2, 0);
                if (a3 != null) {
                    cw.a(graphics, a3, array[i] * n5, 0, n5, height2, abs + array5[i][0], abs2 + array5[i][1], 0);
                }
                if (a4 != null) {
                    cw.a(graphics, a4, array2[i] * n8, 0, n8, height3, abs + array6[i][0], abs2 + array6[i][1], 0);
                }
                if (b3 != null) {
                    cw.a(graphics, b3, array4[i] * n7, 0, n7, height5, abs + array8[i][0], abs2 + array8[i][1], 0);
                }
                if (b2 != null) {
                    cw.a(graphics, b2, array3[i] * n6, 0, n6, height4, abs + array7[i][0], abs2 + array7[i][1], 0);
                }
                final int[] array12 = new int[n13 * n14];
                image2.getRGB(array12, 0, n13, 0, 0, n13, n14);
                for (int j = 0; j < array12.length; ++j) {
                    if ((array12[j] & 0xFFFFFF) == 0xFF00FF) {
                        array12[j] = 0;
                    }
                }
                array11[i] = Image.createRGBImage(array12, n13, n14, true);
            }
            c = new ma(a, array11, array9, array10, 3, g);
            if (b) {
                a(c);
            }
        }
        final ma ma = c;
        final mc mc;
        (mc = new mc(ma.b, ma.c, ma.d, ma.e, image)).a(mc.s);
        return mc;
    }

        public static mf g(final lh lh, final mb mb, final mb mb2, final mb mb3, final mb mb4, final boolean b) {
        final ma a = a(lh, mb, mb2, mb3, mb4, 3, 2, true);
        final mf mf;
        (mf = new mf(a.b, a.c, a.d, a.e)).a(mf.s);
        return mf;
    }
    
    public static me h(final lh lh, final mb mb, final mb mb2, final mb mb3, final mb mb4, final boolean b) {
        final ma a = a(lh, mb, mb2, mb3, mb4, 4, 3, b);
        final me me;
        (me = new me(a.b, a.c, a.d, a.e)).a(me.s);
        return me;
    }

    public static md i(lh lh, mb mb, mb mb2, mb mb3, mb mb4, final boolean b) {
        final lh lh2 = lh;
        final mb mb5 = mb;
        final mb mb6 = mb2;
        final mb mb7 = mb3;
        final mb mb8 = mb4;
        final boolean b2 = true;
        mb4 = mb8;
        mb3 = mb7;
        mb2 = mb6;
        mb = mb5;
        lh = lh2;
        final int a;
        ma c;
        if ((c = c(a = a(lh2, mb, mb2, mb3, mb4, 5))) == null) {
            final int n = mb2.c[5];
            final int n2 = mb.c[5];
            final int n3 = mb3.c[5];
            final int n4 = mb4.c[5];
            final Image a2 = a(99005, lh.W);
            final Image a3 = a(mb2.e + 5, lh.V, lh.W);
            final Image a4 = a(mb.e + 5, lh.U);
            final Image b3 = b(mb3.e + 5);
            final Image b4 = b(mb4.e + 5);
            final int a5 = a2.getWidth() / 4;
            final int n5 = a3.getWidth() / n;
            final int n6 = b3.getWidth() / n3;
            final int n7 = b4.getWidth() / n4;
            final int n8 = a4.getWidth() / n2;
            final int height = a2.getHeight();
            final int height2 = a3.getHeight();
            final int height3 = a4.getHeight();
            final int height4 = b3.getHeight();
            final int height5 = b4.getHeight();
            final byte[] array = mb2.d[5];
            final byte[] array2 = mb.d[5];
            final byte[] array3 = mb3.d[5];
            final byte[] array4 = mb4.d[5];
            final int[][] array5 = mb2.b[5];
            final int[][] array6 = mb.b[5];
            final int[][] array7 = mb3.b[5];
            final int[][] array8 = mb4.b[5];
            final int[][] array9 = new int[4][2];
            final int[][] array10 = new int[4][2];
            final g g = new g();
            final Image[] array11 = new Image[4];
            g.a = a5;
            g.b = height;
            for (int i = 0; i < 4; ++i) {
                int n9 = 0;
                int n10 = a5;
                int n11 = 0;
                int n12 = height;
                if (array5[i][0] < 0) {
                    n9 = array5[i][0];
                }
                if (array6[i][0] < n9) {
                    n9 = array6[i][0];
                }
                if (array7[i][0] < n9) {
                    n9 = array7[i][0];
                }
                if (array8[i][0] < n9) {
                    n9 = array8[i][0];
                }
                final int abs = Math.abs(n9);
                if (a5 < array5[i][0] + n5) {
                    n10 = array5[i][0] + n5;
                }
                if (n10 < array6[i][0] + n8) {
                    n10 = array6[i][0] + n8;
                }
                if (n10 < array7[i][0] + n6) {
                    n10 = array7[i][0] + n6;
                }
                if (n10 < array8[i][0] + n7) {
                    n10 = array8[i][0] + n7;
                }
                array9[i][0] = -abs;
                array9[i][1] = a5 - n10;
                if (array5[i][1] < 0) {
                    n11 = array5[i][1];
                }
                if (array6[i][1] < n11) {
                    n11 = array6[i][1];
                }
                if (array7[i][1] < n11) {
                    n11 = array7[i][1];
                }
                if (array8[i][1] < n11) {
                    n11 = array8[i][1];
                }
                final int abs2 = Math.abs(n11);
                if (height < array5[i][1] + height2) {
                    n12 = array5[i][1] + height2;
                }
                if (n12 < array6[i][1] + height3) {
                    n12 = array6[i][1] + height3;
                }
                if (n12 < array7[i][1] + height4) {
                    n12 = array7[i][1] + height4;
                }
                if (n12 < array8[i][1] + height5) {
                    n12 = array8[i][1] + height5;
                }
                array10[i][0] = -abs2;
                array10[i][1] = height - n12;
                final int n13 = abs + n10;
                final int n14 = abs2 + n12;
                final Image image;
                final Graphics graphics;
                (graphics = (image = Image.createImage(n13, n14)).getGraphics()).setColor(16711935);
                graphics.fillRect(0, 0, n13, n14);
                cw.a(graphics, a2, i * a5, 0, a5, height, abs, abs2, 0);
                if (a3 != null) {
                    cw.a(graphics, a3, array[i] * n5, 0, n5, height2, abs + array5[i][0], abs2 + array5[i][1], 0);
                }
                if (a4 != null) {
                    cw.a(graphics, a4, array2[i] * n8, 0, n8, height3, abs + array6[i][0], abs2 + array6[i][1], 0);
                }
                if (b4 != null) {
                    cw.a(graphics, b4, array4[i] * n7, 0, n7, height5, abs + array8[i][0], abs2 + array8[i][1], 0);
                }
                if (b3 != null) {
                    cw.a(graphics, b3, array3[i] * n6, 0, n6, height4, abs + array7[i][0], abs2 + array7[i][1], 0);
                }
                final int[] array12 = new int[n13 * n14];
                image.getRGB(array12, 0, n13, 0, 0, n13, n14);
                for (int j = 0; j < array12.length; ++j) {
                    if ((array12[j] & 0xFFFFFF) == 0xFF00FF) {
                        array12[j] = 0;
                    }
                }
                array11[i] = Image.createRGBImage(array12, n13, n14, true);
            }
            c = new ma(a, array11, array9, array10, 4, g);
            if (b2) {
                a(c);
            }
        }
        final ma ma = c;
        final md md;
        (md = new md(ma.b, ma.c, ma.d, ma.e)).a(md.s);
        return md;
    
    }

    public static mb[] a(lh lh) {
        if ((lh = lh).D != null) {
            final int[] array = new int[4];
            for (int i = 0; i < lh.D.length; ++i) {
                final ll ll;
                if ((ll = lh.D[i]).e < 4) {
                    final int[] array2 = array;
                    final byte e = ll.e;
                    final int n = ll.n;
                    array2[e] = n - n % 10;
                }
            }
            final mb[] array3;
            (array3 = new mb[4])[1] = new mb(lh.V.a + 99);
            final int n2 = lh.U.a + 99;
            int n3;
            if (lh.f == 1) {
                n3 = 79999;
            }
            else {
                n3 = 79899;
            }
            if (array[0] > 0 && !lh.Z) {
                array3[0] = new mb(array[0] + 99);
            }
            else {
                array3[0] = new mb(n2);
            }
            if (array[1] > 0) {
                array3[2] = new mb(array[1] + 99);
            }
            else {
                array3[2] = new mb(n3);
            }
            if (array[2] > 0) {
                array3[3] = new mb(array[2] + 99);
            }
            else {
                array3[3] = new mb(89999);
            }
            return array3;
        }
        ct.a("[BodyPartLoader.loadMetadata()] charaterInfo.equipments is Null");
        return new mb[0];
    }

    public static mg a(lh lh2, boolean bl) {
        mb[] mbArray = mb.a(lh2);
        return mb.a(lh2, mbArray[0], mbArray[1], mbArray[3], mbArray[2], false);
    }

    private static StringBuffer a(StringBuffer stringBuffer, int[] nArray) {
        if (nArray != null && nArray.length > 0) {
            int n2 = 0;
            while (n2 < nArray.length) {
                stringBuffer.append(nArray[n2]);
                ++n2;
            }
        }
        return stringBuffer;
    }

        private static int a(final lh lh, final mb mb, mb mb2, final mb mb3, final mb mb4, final int n) {
        final StringBuffer sb;
        (sb = new StringBuffer(100)).append(n).append(':');
        a(sb, lh.W.e.c).append(':');
        if (mb2 != null) {
            sb.append((mb2 = mb2).e + n).append(':');
            if (lh.V != null) {
                a(sb, lh.V.e.c).append(':');
            }
        }
        if (mb != null) {
            final StringBuffer sb2 = sb;
            mb2 = mb;
            sb2.append(mb.e + n).append(':');
            if (lh.U != null) {
                a(sb, lh.U.e.c).append(':');
            }
        }
        if (mb3 != null) {
            final StringBuffer sb3 = sb;
            mb2 = mb3;
            sb3.append(mb3.e + n).append(':');
        }
        if (mb4 != null) {
            final StringBuffer sb4 = sb;
            mb2 = mb4;
            sb4.append(mb4.e + n).append(':');
        }
        return sb.toString().hashCode();
    }
    public static int a(ll ll2) {
        int n2 = ll2.n;
        return n2 - n2 % 10;
    }

    public static int a(int n2) {
        return n2 - n2 % 10 + 98;
    }
}
