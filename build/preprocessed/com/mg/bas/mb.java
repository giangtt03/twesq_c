package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FilterInputStream;
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

    private void a(byte[] object) {
        try {
            object = new ByteArrayInputStream((byte[])object);
            DataInputStream dataInputStream = new DataInputStream((InputStream)object);
            object = dataInputStream;
            dataInputStream.readByte();
            this.e = ((DataInputStream)object).readInt();
            int n = ((DataInputStream)object).readByte();
            this.b = new int[n][][];
            this.d = new byte[n][];
            this.c = new int[n];
            n = 0;
            while (n < this.b.length) {
                byte by = ((DataInputStream)object).readByte();
                this.c[n] = ((DataInputStream)object).readByte();
                int n2 = ((DataInputStream)object).readByte();
                this.b[by] = new int[n2][2];
                this.d[by] = new byte[n2];
                int n3 = 0;
                while (n3 < n2) {
                    this.d[by][n3] = ((DataInputStream)object).readByte();
                    this.b[by][n3][0] = ((DataInputStream)object).readShort();
                    this.b[by][n3][1] = ((DataInputStream)object).readShort();
                    ++n3;
                }
                ++n;
            }
            ((FilterInputStream)object).close();
            return;
        }
        catch (Exception exception) {
            ct.a(String.valueOf(this.a));
            exception.printStackTrace();
            return;
        }
    }

    private static Image b(int n) {
        int n2 = n;
        pa pa2 = pa.a();
        return f.a(pa2.b(n2, false));
    }

    private static Image a(int n, df df2) {
        int n2 = n;
        Object object = pa.a();
        object = ((pa)object).b(n2, false);
        if (df2 != null && df2.d != null && df2.e != null && !df2.d.equals(df2.e)) {
            h.a((byte[])object, df2.d.c, df2.e.c);
        }
        return f.a((byte[])object);
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
        return f.a((byte[])object);
    }

    private static ma a(lh lh2, mb object, mb object2, mb object3, mb object4, int n2, int n3, boolean bl) {
        int n4 = mb.a(lh2, (mb)object, (mb)object2, (mb)object3, (mb)object4, n2);
        ma ma2 = mb.c(n4);
        if (ma2 != null) {
            return ma2;
        }
        int n5 = ((mb)object2).c[n2];
        int n6 = ((mb)object).c[n2];
        int n7 = ((mb)object3).c[n2];
        int n8 = ((mb)object4).c[n2];
        Image image = mb.a(n2 + 99000, lh2.W);
        int n9 = n2;
        Object mb2 = object2;
        Image image2 = mb.a(((mb)mb2).e + n9, lh2.V, lh2.W);
        n9 = n2;
        mb2 = object;
        lh2 = mb.a(((mb)mb2).e + n9, lh2.U);
        n9 = n2;
        mb2 = object3;
        Image image3 = mb.b(((mb)mb2).e + n9);
        n9 = n2;
        mb2 = object4;
        mb2 = mb.b(((mb)mb2).e + n9);
        n9 = image.getWidth() / n3;
        n5 = image2.getWidth() / n5;
        n7 = image3.getWidth() / n7;
        n8 = mb2.getWidth() / n8;
        n6 = lh2.getWidth() / n6;
        int n10 = image.getHeight();
        int n11 = image2.getHeight();
        int n12 = lh2.getHeight();
        int n13 = image3.getHeight();
        int n14 = mb2.getHeight();
        byte[] byArray = ((mb)object2).d[n2];
        byte[] byArray2 = ((mb)object).d[n2];
        byte[] byArray3 = ((mb)object3).d[n2];
        byte[] byArray4 = ((mb)object4).d[n2];
        object2 = ((mb)object2).b[n2];
        object = ((mb)object).b[n2];
        object3 = ((mb)object3).b[n2];
        object4 = ((mb)object4).b[n2];
        int[][] nArray = new int[n3][2];
        int[][] nArray2 = new int[n3][2];
        g g2 = new g();
        Image[] imageArray = new Image[n3];
        g2.a = n9;
        g2.b = n10;
        int n15 = 0;
        while (n15 < n3) {
            Object object5;
            Object object6;
            Object object7;
            Object object8;
            boolean n16 = false;
            Object object9 = n9;
            int n17 = false;
            Object object10 = n10;
            if (object2[n15][0] < 0) {
                object8 = object2[n15][0];
            }
            if (object[n15][0] < object8) {
                object7 = object[n15][0];
            }
            if (object3[n15][0] < object7) {
                object6 = object3[n15][0];
            }
            if (object4[n15][0] < object6) {
                object5 = object4[n15][0];
            }
            int n18 = Math.abs((int)object5);
            if (object9 < object2[n15][0] + n5) {
                object9 = object2[n15][0] + n5;
            }
            if (object9 < object[n15][0] + n6) {
                object9 = object[n15][0] + n6;
            }
            if (object9 < object3[n15][0] + n7) {
                object9 = object3[n15][0] + n7;
            }
            if (object9 < object4[n15][0] + n8) {
                object9 = object4[n15][0] + n8;
            }
            nArray[n15][0] = -n18;
            nArray[n15][1] = n9 - object9;
            if (object2[n15][1] < 0) {
                n17 = object2[n15][1];
            }
            if (object[n15][1] < n17) {
                n17 = object[n15][1];
            }
            if (object3[n15][1] < n17) {
                n17 = object3[n15][1];
            }
            if (object4[n15][1] < n17) {
                n17 = object4[n15][1];
            }
            n17 = Math.abs(n17);
            if (n10 < object2[n15][1] + n11) {
                object10 = object2[n15][1] + n11;
            }
            if (object10 < object[n15][1] + n12) {
                object10 = object[n15][1] + n12;
            }
            if (object10 < object3[n15][1] + n13) {
                object10 = object3[n15][1] + n13;
            }
            if (object10 < object4[n15][1] + n14) {
                object10 = object4[n15][1] + n14;
            }
            nArray2[n15][0] = -n17;
            nArray2[n15][1] = n10 - object10;
            object9 = n18 + object9;
            object10 = n17 + object10;
            Image image4 = Image.createImage((int)object9, (int)object10);
            Graphics graphics = image4.getGraphics();
            graphics.setColor(0xFF00FF);
            graphics.fillRect(0, 0, object9, object10);
            cw.a(graphics, image, n15 * n9, 0, n9, n10, n18, n17, 0);
            if (image2 != null) {
                cw.a(graphics, image2, byArray[n15] * n5, 0, n5, n11, n18 + object2[n15][0], n17 + object2[n15][1], 0);
            }
            if (lh2 != null) {
                cw.a(graphics, (Image)lh2, byArray2[n15] * n6, 0, n6, n12, n18 + object[n15][0], n17 + object[n15][1], 0);
            }
            if (mb2 != null) {
                cw.a(graphics, (Image)mb2, byArray4[n15] * n8, 0, n8, n14, n18 + object4[n15][0], n17 + object4[n15][1], 0);
            }
            if (image3 != null) {
                cw.a(graphics, image3, byArray3[n15] * n7, 0, n7, n13, n18 + object3[n15][0], n17 + object3[n15][1], 0);
            }
            int[] nArray3 = new int[object9 * object10];
            image4.getRGB(nArray3, 0, object9, 0, 0, object9, object10);
            n17 = 0;
            while (n17 < nArray3.length) {
                if ((nArray3[n17] & 0xFFFFFF) == 0xFF00FF) {
                    nArray3[n17] = 0;
                }
                ++n17;
            }
            imageArray[n15] = Image.createRGBImage((int[])nArray3, (int)object9, (int)object10, (boolean)true);
            ++n15;
        }
        ma ma3 = new ma(n4, imageArray, nArray, nArray2, n3, g2);
        if (bl) {
            mb.a(ma3);
        }
        return ma3;
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

    public static mg a(lh lh2, mb object, mb mb2, mb mb3, mb mb4, boolean bl) {
        lh2.b();
        object = !lh2.ad ? mb.a(lh2, (mb)object, mb2, mb3, mb4, 0, 2, bl) : mb.a(lh2, (mb)object, mb2, mb3, mb4, 3, 2, bl);
        object = new mg(((ma)object).b, ((ma)object).c, ((ma)object).d, ((ma)object).e);
        if (!lh2.ad) {
            ((as)object).a(mg.u);
        } else {
            ((as)object).a(mf.s);
        }
        if (lh2.ad) {
            ((as)object).d(1);
        } else {
            ((as)object).d(0);
        }
        return object;
    }

    public static mg b(lh lh2, mb object, mb mb2, mb mb3, mb mb4, boolean bl) {
        object = mb.a(lh2, (mb)object, mb2, mb3, mb4, 1, 6, true);
        object = new mg(((ma)object).b, ((ma)object).c, ((ma)object).d, ((ma)object).e);
        ((as)object).a(mg.w);
        if (lh2.ad) {
            ((as)object).d(1);
        } else {
            ((as)object).d(0);
        }
        return object;
    }

    public static mg c(lh lh2, mb object, mb mb2, mb mb3, mb mb4, boolean bl) {
        object = mb.a(lh2, (mb)object, mb2, mb3, mb4, 2, 4, bl);
        object = new mg(((ma)object).b, ((ma)object).c, ((ma)object).d, ((ma)object).e);
        ((as)object).a(mg.v);
        if (lh2.ad) {
            ((as)object).d(1);
        } else {
            ((as)object).d(0);
        }
        return object;
    }

    public static mg d(lh lh2, mb object, mb mb2, mb mb3, mb mb4, boolean bl) {
        object = mb.a(lh2, (mb)object, mb2, mb3, mb4, 9, 1, true);
        object = new mg(((ma)object).b, ((ma)object).c, ((ma)object).d, ((ma)object).e);
        ((as)object).a(mg.z);
        if (lh2.ad) {
            ((as)object).d(1);
        } else {
            ((as)object).d(0);
        }
        return object;
    }

    public static mg e(lh lh2, mb object, mb mb2, mb mb3, mb mb4, boolean bl) {
        object = mb.a(lh2, (mb)object, mb2, mb3, mb4, 7, 1, true);
        object = new mg(((ma)object).b, ((ma)object).c, ((ma)object).d, ((ma)object).e);
        ((as)object).a(mg.x);
        if (lh2.ad) {
            ((as)object).d(1);
        } else {
            ((as)object).d(0);
        }
        return object;
    }

    public static mg f(lh lh2, mb object, mb mb2, mb mb3, mb mb4, boolean bl) {
        object = mb.a(lh2, (mb)object, mb2, mb3, mb4, 8, 1, true);
        object = new mg(((ma)object).b, ((ma)object).c, ((ma)object).d, ((ma)object).e);
        ((as)object).a(mg.y);
        if (lh2.ad) {
            ((as)object).d(1);
        } else {
            ((as)object).d(0);
        }
        return object;
    }

    public static mc a(lh lh2, Image image, mb object, mb object2, mb object3, mb object4, boolean bl) {
        int n2 = 3;
        n2 = 6;
        Object object5 = lh2;
        int n3 = mb.a((lh)object5, (mb)object, (mb)object2, (mb)object3, (mb)object4, 6);
        ma ma2 = mb.c(n3);
        if (ma2 == null) {
            int n4 = ((mb)object2).c[6];
            int n5 = ((mb)object).c[6];
            int n6 = ((mb)object3).c[6];
            int n7 = ((mb)object4).c[6];
            Image image2 = mb.a(99006, ((lh)object5).W);
            int n8 = 6;
            Object mb2 = object2;
            Image image3 = mb.a(((mb)mb2).e + n8, ((lh)object5).V, ((lh)object5).W);
            n8 = 6;
            mb2 = object;
            object5 = mb.a(((mb)mb2).e + n8, ((lh)object5).U);
            n8 = 6;
            mb2 = object3;
            Image image4 = mb.b(((mb)mb2).e + n8);
            n8 = 6;
            mb2 = object4;
            mb2 = mb.b(((mb)mb2).e + n8);
            n8 = image2.getWidth() / 3;
            n4 = image3.getWidth() / n4;
            n6 = image4.getWidth() / n6;
            n7 = mb2.getWidth() / n7;
            n5 = object5.getWidth() / n5;
            int n9 = image2.getHeight();
            int n10 = image3.getHeight();
            int n11 = object5.getHeight();
            int n12 = image4.getHeight();
            int n13 = mb2.getHeight();
            byte[] byArray = ((mb)object2).d[6];
            byte[] byArray2 = ((mb)object).d[6];
            byte[] byArray3 = ((mb)object3).d[6];
            byte[] byArray4 = ((mb)object4).d[6];
            object2 = ((mb)object2).b[6];
            object = ((mb)object).b[6];
            object3 = ((mb)object3).b[6];
            object4 = ((mb)object4).b[6];
            int[][] nArray = new int[3][2];
            int[][] nArray2 = new int[3][2];
            g g2 = new g();
            Image[] imageArray = new Image[3];
            g2.a = n8;
            g2.b = n9;
            int n14 = 0;
            while (n14 < 3) {
                Object object6;
                Object object7;
                Object object8;
                Object object9;
                boolean n15 = false;
                Object object10 = n8;
                int n16 = false;
                Object object11 = n9;
                if (object2[n14][0] < 0) {
                    object9 = object2[n14][0];
                }
                if (object[n14][0] < object9) {
                    object8 = object[n14][0];
                }
                if (object3[n14][0] < object8) {
                    object7 = object3[n14][0];
                }
                if (object4[n14][0] < object7) {
                    object6 = object4[n14][0];
                }
                int n17 = Math.abs((int)object6);
                if (n8 < object2[n14][0] + n4) {
                    object10 = object2[n14][0] + n4;
                }
                if (object10 < object[n14][0] + n5) {
                    object10 = object[n14][0] + n5;
                }
                if (object10 < object3[n14][0] + n6) {
                    object10 = object3[n14][0] + n6;
                }
                if (object10 < object4[n14][0] + n7) {
                    object10 = object4[n14][0] + n7;
                }
                nArray[n14][0] = -n17;
                nArray[n14][1] = n8 - object10;
                if (object2[n14][1] < 0) {
                    n16 = object2[n14][1];
                }
                if (object[n14][1] < n16) {
                    n16 = object[n14][1];
                }
                if (object3[n14][1] < n16) {
                    n16 = object3[n14][1];
                }
                if (object4[n14][1] < n16) {
                    n16 = object4[n14][1];
                }
                n16 = Math.abs(n16);
                if (n9 < object2[n14][1] + n10) {
                    object11 = object2[n14][1] + n10;
                }
                if (object11 < object[n14][1] + n11) {
                    object11 = object[n14][1] + n11;
                }
                if (object11 < object3[n14][1] + n12) {
                    object11 = object3[n14][1] + n12;
                }
                if (object11 < object4[n14][1] + n13) {
                    object11 = object4[n14][1] + n13;
                }
                nArray2[n14][0] = -n16;
                nArray2[n14][1] = n9 - object11;
                object10 = n17 + object10;
                object11 = n16 + object11;
                Image image5 = Image.createImage((int)object10, (int)object11);
                Graphics graphics = image5.getGraphics();
                graphics.setColor(0xFF00FF);
                graphics.fillRect(0, 0, object10, object11);
                cw.a(graphics, image2, n14 * n8, 0, n8, n9, n17, n16, 0);
                if (image3 != null) {
                    cw.a(graphics, image3, byArray[n14] * n4, 0, n4, n10, n17 + object2[n14][0], n16 + object2[n14][1], 0);
                }
                if (object5 != null) {
                    cw.a(graphics, (Image)object5, byArray2[n14] * n5, 0, n5, n11, n17 + object[n14][0], n16 + object[n14][1], 0);
                }
                if (mb2 != null) {
                    cw.a(graphics, (Image)mb2, byArray4[n14] * n7, 0, n7, n13, n17 + object4[n14][0], n16 + object4[n14][1], 0);
                }
                if (image4 != null) {
                    cw.a(graphics, image4, byArray3[n14] * n6, 0, n6, n12, n17 + object3[n14][0], n16 + object3[n14][1], 0);
                }
                int[] nArray3 = new int[object10 * object11];
                image5.getRGB(nArray3, 0, object10, 0, 0, object10, object11);
                n16 = 0;
                while (n16 < nArray3.length) {
                    if ((nArray3[n16] & 0xFFFFFF) == 0xFF00FF) {
                        nArray3[n16] = 0;
                    }
                    ++n16;
                }
                imageArray[n14] = Image.createRGBImage((int[])nArray3, (int)object10, (int)object11, (boolean)true);
                ++n14;
            }
            ma2 = new ma(n3, imageArray, nArray, nArray2, 3, g2);
            if (bl) {
                mb.a(ma2);
            }
        }
        object5 = ma2;
        object5 = new mc(((ma)object5).b, ((ma)object5).c, ((ma)object5).d, ((ma)object5).e, image);
        ((as)object5).a(mc.s);
        return object5;
    }

    public static mf g(lh object, mb mb2, mb mb3, mb mb4, mb mb5, boolean bl) {
        object = mb.a((lh)object, mb2, mb3, mb4, mb5, 3, 2, true);
        object = new mf(((ma)object).b, ((ma)object).c, ((ma)object).d, ((ma)object).e);
        ((as)object).a(mf.s);
        return object;
    }

    public static me h(lh object, mb mb2, mb mb3, mb mb4, mb mb5, boolean bl) {
        object = mb.a((lh)object, mb2, mb3, mb4, mb5, 4, 3, bl);
        object = new me(((ma)object).b, ((ma)object).c, ((ma)object).d, ((ma)object).e);
        ((as)object).a(me.s);
        return object;
    }

    public static md i(lh lh2, mb object, mb object2, mb object3, mb object4, boolean bl) {
        bl = true;
        int n2 = 4;
        n2 = 5;
        Object object5 = lh2;
        int n3 = mb.a((lh)object5, (mb)object, (mb)object2, (mb)object3, (mb)object4, 5);
        ma ma2 = mb.c(n3);
        if (ma2 == null) {
            int n4 = ((mb)object2).c[5];
            int n5 = ((mb)object).c[5];
            int n6 = ((mb)object3).c[5];
            int n7 = ((mb)object4).c[5];
            Image image = mb.a(99005, ((lh)object5).W);
            int n8 = 5;
            Object mb2 = object2;
            Image image2 = mb.a(((mb)mb2).e + n8, ((lh)object5).V, ((lh)object5).W);
            n8 = 5;
            mb2 = object;
            object5 = mb.a(((mb)mb2).e + n8, ((lh)object5).U);
            n8 = 5;
            mb2 = object3;
            Image image3 = mb.b(((mb)mb2).e + n8);
            n8 = 5;
            mb2 = object4;
            mb2 = mb.b(((mb)mb2).e + n8);
            n8 = image.getWidth() / 4;
            n4 = image2.getWidth() / n4;
            n6 = image3.getWidth() / n6;
            n7 = mb2.getWidth() / n7;
            n5 = object5.getWidth() / n5;
            int n9 = image.getHeight();
            int n10 = image2.getHeight();
            int n11 = object5.getHeight();
            int n12 = image3.getHeight();
            int n13 = mb2.getHeight();
            byte[] byArray = ((mb)object2).d[5];
            byte[] byArray2 = ((mb)object).d[5];
            byte[] byArray3 = ((mb)object3).d[5];
            byte[] byArray4 = ((mb)object4).d[5];
            object2 = ((mb)object2).b[5];
            object = ((mb)object).b[5];
            object3 = ((mb)object3).b[5];
            object4 = ((mb)object4).b[5];
            int[][] nArray = new int[4][2];
            int[][] nArray2 = new int[4][2];
            g g2 = new g();
            Image[] imageArray = new Image[4];
            g2.a = n8;
            g2.b = n9;
            int n14 = 0;
            while (n14 < 4) {
                Object object6;
                Object object7;
                Object object8;
                Object object9;
                boolean n15 = false;
                Object object10 = n8;
                int n16 = false;
                Object object11 = n9;
                if (object2[n14][0] < 0) {
                    object9 = object2[n14][0];
                }
                if (object[n14][0] < object9) {
                    object8 = object[n14][0];
                }
                if (object3[n14][0] < object8) {
                    object7 = object3[n14][0];
                }
                if (object4[n14][0] < object7) {
                    object6 = object4[n14][0];
                }
                int n17 = Math.abs((int)object6);
                if (n8 < object2[n14][0] + n4) {
                    object10 = object2[n14][0] + n4;
                }
                if (object10 < object[n14][0] + n5) {
                    object10 = object[n14][0] + n5;
                }
                if (object10 < object3[n14][0] + n6) {
                    object10 = object3[n14][0] + n6;
                }
                if (object10 < object4[n14][0] + n7) {
                    object10 = object4[n14][0] + n7;
                }
                nArray[n14][0] = -n17;
                nArray[n14][1] = n8 - object10;
                if (object2[n14][1] < 0) {
                    n16 = object2[n14][1];
                }
                if (object[n14][1] < n16) {
                    n16 = object[n14][1];
                }
                if (object3[n14][1] < n16) {
                    n16 = object3[n14][1];
                }
                if (object4[n14][1] < n16) {
                    n16 = object4[n14][1];
                }
                n16 = Math.abs(n16);
                if (n9 < object2[n14][1] + n10) {
                    object11 = object2[n14][1] + n10;
                }
                if (object11 < object[n14][1] + n11) {
                    object11 = object[n14][1] + n11;
                }
                if (object11 < object3[n14][1] + n12) {
                    object11 = object3[n14][1] + n12;
                }
                if (object11 < object4[n14][1] + n13) {
                    object11 = object4[n14][1] + n13;
                }
                nArray2[n14][0] = -n16;
                nArray2[n14][1] = n9 - object11;
                object10 = n17 + object10;
                object11 = n16 + object11;
                Image image4 = Image.createImage((int)object10, (int)object11);
                Graphics graphics = image4.getGraphics();
                graphics.setColor(0xFF00FF);
                graphics.fillRect(0, 0, object10, object11);
                cw.a(graphics, image, n14 * n8, 0, n8, n9, n17, n16, 0);
                if (image2 != null) {
                    cw.a(graphics, image2, byArray[n14] * n4, 0, n4, n10, n17 + object2[n14][0], n16 + object2[n14][1], 0);
                }
                if (object5 != null) {
                    cw.a(graphics, (Image)object5, byArray2[n14] * n5, 0, n5, n11, n17 + object[n14][0], n16 + object[n14][1], 0);
                }
                if (mb2 != null) {
                    cw.a(graphics, (Image)mb2, byArray4[n14] * n7, 0, n7, n13, n17 + object4[n14][0], n16 + object4[n14][1], 0);
                }
                if (image3 != null) {
                    cw.a(graphics, image3, byArray3[n14] * n6, 0, n6, n12, n17 + object3[n14][0], n16 + object3[n14][1], 0);
                }
                int[] nArray3 = new int[object10 * object11];
                image4.getRGB(nArray3, 0, object10, 0, 0, object10, object11);
                n16 = 0;
                while (n16 < nArray3.length) {
                    if ((nArray3[n16] & 0xFFFFFF) == 0xFF00FF) {
                        nArray3[n16] = 0;
                    }
                    ++n16;
                }
                imageArray[n14] = Image.createRGBImage((int[])nArray3, (int)object10, (int)object11, (boolean)true);
                ++n14;
            }
            ma2 = new ma(n3, imageArray, nArray, nArray2, 4, g2);
            if (bl) {
                mb.a(ma2);
            }
        }
        object5 = ma2;
        object5 = new md(((ma)object5).b, ((ma)object5).c, ((ma)object5).d, ((ma)object5).e);
        ((as)object5).a(md.s);
        return object5;
    }

    public static mb[] a(lh lh2) {
        mb[] mbArray;
        int n2;
        int[] nArray = null;
        if (lh2.D != null) {
            nArray = new int[4];
            n2 = 0;
            while (n2 < lh2.D.length) {
                mbArray = lh2.D[n2];
                if (mbArray.e < 4) {
                    int n3 = mbArray.n;
                    nArray[mbArray.e] = n3 - n3 % 10;
                }
                ++n2;
            }
        } else {
            ct.a("[BodyPartLoader.loadMetadata()] charaterInfo.equipments is Null");
            return new mb[0];
        }
        mb[] mbArray2 = new mb[4];
        mbArray = mbArray2;
        mbArray2[1] = new mb(lh2.V.a + 99);
        int n4 = lh2.U.a + 99;
        n2 = lh2.f == 1 ? 79999 : 79899;
        mbArray[0] = nArray[0] > 0 && !lh2.Z ? new mb(nArray[0] + 99) : new mb(n4);
        mbArray[2] = nArray[1] > 0 ? new mb(nArray[1] + 99) : new mb(n2);
        mbArray[3] = nArray[2] > 0 ? new mb(nArray[2] + 99) : new mb(89999);
        return mbArray;
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

    private static int a(lh object, mb mb2, mb mb3, mb mb4, mb mb5, int n2) {
        int n3;
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append(n2).append(':');
        mb.a(stringBuffer, ((lh)object).W.e.c).append(':');
        if (mb3 != null) {
            n3 = n2;
            stringBuffer.append(mb3.e + n3).append(':');
            if (((lh)object).V != null) {
                mb.a(stringBuffer, ((lh)object).V.e.c).append(':');
            }
        }
        if (mb2 != null) {
            n3 = n2;
            mb3 = mb2;
            stringBuffer.append(mb3.e + n3).append(':');
            if (((lh)object).U != null) {
                mb.a(stringBuffer, ((lh)object).U.e.c).append(':');
            }
        }
        if (mb4 != null) {
            n3 = n2;
            mb3 = mb4;
            stringBuffer.append(mb3.e + n3).append(':');
        }
        if (mb5 != null) {
            n3 = n2;
            mb3 = mb5;
            stringBuffer.append(mb3.e + n3).append(':');
        }
        object = stringBuffer.toString();
        return ((String)object).hashCode();
    }

    public static int a(ll ll2) {
        int n2 = ll2.n;
        return n2 - n2 % 10;
    }

    public static int a(int n2) {
        return n2 - n2 % 10 + 98;
    }
}
