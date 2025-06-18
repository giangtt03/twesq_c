package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class mx
extends at {
    private int d;
    private int[] e = new int[]{81208, 85576, 23637};
    private int[] f = new int[]{5046585, 6095173, 7209297};
    private int g;
    private int h;
    private int i;
    private Image j;
    private int k = 0;
    private boolean s;
    private int t;
    private nc[] u;
    private nc[] v;
    private int w;
    private int x;
    private int[] y;
    private int[] z;
    private byte A;
    private int[][] B;
    private Image[] C;
    private Image D;
    private Image E;
    private Image F;
    private lg[][] G;
    private nk[] H;
    private nk[] I;
    nk[] a;
    private String[] J;
    private k K;
    private ir[] L;
    ms b;
    private int[] M;
    private int[] N = new int[2];
    private int[] O = new int[2];
    private mi[] P;
    private mi[] Q;
    private mi[] R;
    private mi S;
    public np c;
    private int T;
    private boolean U;
    private int V;

    public mx(ms object, k object2, byte by, int n, int n2) {
        this.b = object;
        this.G = ((ms)object).a();
        this.K = object2;
        this.y = new int[2];
        object2 = this;
        try {
            ((mx)object2).a = new nk[2];
            ((mx)object2).J = new String[2];
            ((mx)object2).H = new nk[((mx)object2).G[0].length];
            ((mx)object2).I = new nk[((mx)object2).G[1].length];
            int n3 = 0;
            while (n3 < ((mx)object2).H.length) {
                ((mx)object2).H[n3] = mx.b(((mx)object2).G[0][n3].a(), 0);
                ++n3;
            }
            n3 = 0;
            while (n3 < ((mx)object2).I.length) {
                try {
                    ((mx)object2).I[n3] = ((mx)object2).G[1][n3].b() && ((mx)object2).G[1][n3].a().Y > 0 ? super.a(((mx)object2).G[1][n3].a(), 1) : mx.b(((mx)object2).G[1][n3].a(), 1);
                }
                catch (Exception exception) {
                    Exception exception2 = exception;
                    exception.printStackTrace();
                    System.err.println(((mx)object2).G[1][n3]);
                }
                ++n3;
            }
            ((mx)object2).a[0] = ((mx)object2).H[0];
            ((mx)object2).a[1] = ((mx)object2).I[0];
        }
        catch (Exception exception) {
            Exception exception3 = exception;
            exception.printStackTrace();
        }
        this.j = mp.a().f;
        this.A = by;
        this.c(n, n2);
        if (by == 0) {
            this.c(false);
            int[][] nArrayArray = new int[12][];
            nArrayArray[0] = new int[]{10, 233, this.C[0].getWidth(), this.C[0].getHeight()};
            nArrayArray[1] = new int[]{10, 240, this.D.getWidth(), this.D.getHeight()};
            nArrayArray[2] = new int[]{10, 247, this.E.getWidth(), this.E.getHeight()};
            nArrayArray[3] = new int[]{154, 233, this.C[0].getWidth(), this.C[0].getHeight()};
            nArrayArray[4] = new int[]{154, 240, this.D.getWidth(), this.D.getHeight()};
            nArrayArray[5] = new int[]{154, 247, this.E.getWidth(), this.E.getHeight()};
            nArrayArray[6] = new int[]{50, 316, this.H[0].p(), this.H[0].q()};
            nArrayArray[7] = new int[]{20, 316, this.H[0].p(), this.H[0].q()};
            int[] nArray = new int[4];
            nArray[1] = 316;
            nArray[2] = this.H[0].p();
            nArray[3] = this.H[0].q();
            nArrayArray[8] = nArray;
            nArrayArray[9] = new int[]{200, 316, this.I[0].p(), this.I[0].q()};
            nArrayArray[10] = new int[]{230, 316, this.I[0].p(), this.I[0].q()};
            nArrayArray[11] = new int[]{240, 316, this.I[0].p(), this.I[0].q()};
            this.B = nArrayArray;
            if (this.G[0].length == 3) {
                int[] nArray2 = this.B[6];
                nArray2[1] = nArray2[1] + 5;
                int[] nArray3 = this.B[7];
                nArray3[1] = nArray3[1] - 5;
                int[] nArray4 = this.B[8];
                nArray4[1] = nArray4[1] + 5;
            } else if (this.G[0].length == 2) {
                int[] nArray5 = this.B[7];
                nArray5[1] = nArray5[1] + 5;
                int[] nArray6 = this.B[8];
                nArray6[1] = nArray6[1] - 5;
            }
            if (this.G[1].length == 3) {
                int[] nArray7 = this.B[9];
                nArray7[1] = nArray7[1] + 5;
                int[] nArray8 = this.B[10];
                nArray8[1] = nArray8[1] - 5;
                int[] nArray9 = this.B[11];
                nArray9[1] = nArray9[1] + 5;
            } else if (this.G[1].length == 2) {
                int[] nArray10 = this.B[10];
                nArray10[1] = nArray10[1] + 5;
                int[] nArray11 = this.B[11];
                nArray11[1] = nArray11[1] - 5;
            }
        } else {
            this.c(true);
            this.B = new int[][]{{38, 6, this.C[0].getWidth(), this.C[0].getHeight()}, {31, 6, this.D.getWidth(), this.D.getHeight()}, {24, 6, this.E.getWidth(), this.E.getHeight()}, {277, 6, this.C[0].getWidth(), this.C[0].getHeight()}, {284, 6, this.D.getWidth(), this.D.getHeight()}, {291, 6, this.E.getWidth(), this.E.getHeight()}, {75 - this.H[0].p() / 2, 236, this.H[0].p(), this.H[0].q()}, {35 - this.H[0].p() / 2, 236, this.H[0].p(), this.H[0].q()}, {15 - this.H[0].p() / 2, 236, this.H[0].p(), this.H[0].q()}, {280, 236, this.I[0].p(), this.I[0].q()}, {310, 236, this.I[0].p(), this.I[0].q()}, {330, 236, this.I[0].p(), this.I[0].q()}};
            if (this.G[0].length == 2) {
                int[] nArray = this.B[7];
                nArray[1] = nArray[1] + 4;
                int[] nArray12 = this.B[7];
                nArray12[0] = nArray12[0] + 10;
                int[] nArray13 = this.B[8];
                nArray13[1] = nArray13[1] - 4;
            } else if (this.G[0].length == 3) {
                int[] nArray = this.B[6];
                nArray[1] = nArray[1] + 4;
                int[] nArray14 = this.B[7];
                nArray14[1] = nArray14[1] - 4;
                int[] nArray15 = this.B[8];
                nArray15[1] = nArray15[1] + 4;
            } else {
                int[] nArray = this.B[8];
                nArray[0] = nArray[0] + 5;
            }
            if (this.G[1].length == 2) {
                int[] nArray = this.B[10];
                nArray[1] = nArray[1] + 4;
                int[] nArray16 = this.B[11];
                nArray16[1] = nArray16[1] - 4;
            } else if (this.G[1].length == 3) {
                int[] nArray = this.B[9];
                nArray[1] = nArray[1] + 4;
                int[] nArray17 = this.B[10];
                nArray17[1] = nArray17[1] - 4;
                int[] nArray18 = this.B[11];
                nArray18[1] = nArray18[1] + 4;
            }
        }
        int n4 = 0;
        while (n4 < 2) {
            this.O[n4] = this.G[n4].length == 1 ? 2 : (this.G[n4].length == 2 ? 1 : 0);
            ++n4;
        }
        n4 = 0;
        while (n4 < this.B.length) {
            int[] nArray = this.B[n4];
            nArray[0] = nArray[0] + n;
            int[] nArray19 = this.B[n4];
            nArray19[1] = nArray19[1] + n2;
            ++n4;
        }
        if (this.G[1][0].b() && by == 0) {
            int[] nArray = this.B[9];
            nArray[0] = nArray[0] + 4;
            n4 = this.G[1][0].a().Y;
            if ((n4 = n4 / 10 % 1000) == 18) {
                int[] nArray20 = this.B[9];
                nArray20[0] = nArray20[0] + 35;
                int[] nArray21 = this.B[10];
                nArray21[0] = nArray21[0] + 35;
                int[] nArray22 = this.B[11];
                nArray22[0] = nArray22[0] + 35;
            } else if (n4 == 21 || n4 == 22) {
                int[] nArray23 = this.B[9];
                nArray23[0] = nArray23[0] + 15;
                int[] nArray24 = this.B[10];
                nArray24[0] = nArray24[0] + 15;
                int[] nArray25 = this.B[11];
                nArray25[0] = nArray25[0] + 15;
                int[] nArray26 = this.B[9];
                nArray26[1] = nArray26[1] + 5;
                int[] nArray27 = this.B[10];
                nArray27[1] = nArray27[1] + 5;
                int[] nArray28 = this.B[11];
                nArray28[1] = nArray28[1] + 5;
            } else if (n4 >= 63 && n4 <= 78) {
                int[] nArray29 = this.B[9];
                nArray29[1] = nArray29[1] + 5;
                int[] nArray30 = this.B[10];
                nArray30[1] = nArray30[1] + 5;
                int[] nArray31 = this.B[11];
                nArray31[1] = nArray31[1] + 5;
            } else if (n4 == 25) {
                int[] nArray32 = this.B[9];
                nArray32[1] = nArray32[1] + 1;
                int[] nArray33 = this.B[10];
                nArray33[1] = nArray33[1] + 1;
                int[] nArray34 = this.B[11];
                nArray34[1] = nArray34[1] + 1;
            } else if (n4 == 26) {
                int[] nArray35 = this.B[9];
                nArray35[1] = nArray35[1] + 3;
                int[] nArray36 = this.B[10];
                nArray36[1] = nArray36[1] + 3;
                int[] nArray37 = this.B[11];
                nArray37[1] = nArray37[1] + 3;
            } else if (n4 == 27) {
                int[] nArray38 = this.B[9];
                nArray38[1] = nArray38[1] + 5;
                int[] nArray39 = this.B[10];
                nArray39[1] = nArray39[1] + 5;
                int[] nArray40 = this.B[11];
                nArray40[1] = nArray40[1] + 5;
            }
        }
        String[] stringArray = new String[this.G[0].length];
        n = 0;
        while (n < stringArray.length) {
            stringArray[n] = this.G[0][n].j();
            ++n;
        }
        this.a(stringArray, 0);
        stringArray = new String[this.G[1].length];
        n = 0;
        while (n < stringArray.length) {
            stringArray[n] = this.G[1][n].j();
            ++n;
        }
        this.a(stringArray, 1);
        byte[][] byArrayArray = new byte[1][];
        byte[] byArray = new byte[13];
        byArray[2] = 1;
        byArray[3] = 1;
        byArray[4] = 2;
        byArray[5] = 2;
        byArray[6] = 3;
        byArray[7] = 3;
        byArray[8] = 4;
        byArray[9] = 4;
        byArray[10] = 5;
        byArray[11] = 5;
        byArray[12] = 5;
        byArrayArray[0] = byArray;
        byte[][] byArrayArray2 = byArrayArray;
        this.u = new nc[25];
        int n5 = mp.a().b.getWidth() / 6;
        n2 = mp.a().b.getHeight() / 9;
        int n6 = 1 * n2;
        int n7 = 0;
        while (n7 < this.u.length) {
            this.u[n7] = new nc(mp.a().b, n5, n2, n6);
            this.u[n7].a(byArrayArray2);
            this.u[n7].b(false);
            ++n7;
        }
        n6 = 2 * n2;
        this.v = new nc[10];
        n7 = 0;
        while (n7 < this.v.length) {
            this.v[n7] = new nc(mp.a().b, n5, n2, n6);
            this.v[n7].a(byArrayArray2);
            this.v[n7].b(false);
            ++n7;
        }
        this.z = new int[2];
        this.y = new int[2];
        this.M = new int[2];
        this.L = new ir[2];
        n5 = by == 0 ? this.C[0].getWidth() : this.C[0].getHeight();
        this.P = new mi[2];
        n7 = 0;
        while (n7 < this.P.length) {
            this.P[n7] = new mi(n5, this.G[n7][0].l());
            this.P[n7].a(0, this.G[n7][0].m(), this.G[n7][0].l(), this.G[n7][0].d());
            ++n7;
        }
        n5 = by == 0 ? this.D.getWidth() : this.D.getHeight();
        this.Q = new mi[2];
        n7 = 0;
        while (n7 < this.Q.length) {
            this.Q[n7] = new mi(n5, this.G[n7][0].o());
            this.Q[n7].a(0, this.G[n7][0].n(), this.G[n7][0].o(), 0);
            ++n7;
        }
        n5 = by == 0 ? this.E.getWidth() : this.E.getHeight();
        this.R = new mi[2];
        n7 = 0;
        while (n7 < this.R.length) {
            this.R[n7] = new mi(n5, this.G[n7][0].r());
            this.R[n7].a(0, this.G[n7][0].q(), this.G[n7][0].r(), 0);
            ++n7;
        }
        if (oq.o == 1) {
            this.S = new mi(n5, ((ms)object).g);
            n5 = 1;
            object = this.S;
            this.S.b = n5;
            this.c = new np();
            this.c.a();
        }
    }

    private void a(String[] stringArray, int n) {
        if (n == 0) {
            int n2 = 0;
            while (n2 < stringArray.length) {
                int n3 = 0;
                while (n3 < this.G[n].length) {
                    if (stringArray[n2].equals(this.G[n][n3].j())) {
                        this.H[n3].c(this.B[6 + this.O[n] + n2][0], this.B[6 + this.O[n] + n2][1]);
                        if (n2 == 0) {
                            this.a[n] = this.H[n3];
                            this.J[n] = stringArray[n2];
                            this.N[n] = n3;
                        }
                    }
                    ++n3;
                }
                ++n2;
            }
        } else {
            int n4 = 0;
            while (n4 < stringArray.length) {
                int n5 = 0;
                while (n5 < this.G[n].length) {
                    if (stringArray[n4].equals(this.G[n][n5].j())) {
                        this.I[n5].c(this.B[9 + this.O[n] + n4][0] - this.I[n5].p(), this.B[9 + this.O[n] + n4][1]);
                        if (n4 == 0) {
                            this.a[n] = this.I[n5];
                            this.J[n] = stringArray[n4];
                            this.N[n] = n5;
                        }
                    }
                    ++n5;
                }
                ++n4;
            }
        }
        this.a[0].a(this.a[1]);
        this.a[1].a(this.a[0]);
    }

    private static Image m(int n) {
        return pa.a().a(n, false);
    }

    private nk a(lh lh2, int n) {
        Image image;
        int n2 = lh2.Y;
        Object object = mx.m(n2 + 5);
        Image image2 = mx.m(n2 + 1);
        Image image3 = mx.m(n2 + 4);
        Image image4 = image = mx.m(n2 + 3);
        Image image5 = mx.m(n2 + 6);
        if ((n2 = n2 / 10 % 1000) == 0 || n2 == 19 || n2 == 20 || n2 == 21) {
            byte[][] byArrayArray = new byte[5][];
            byte[] byArray = new byte[28];
            byArray[7] = 1;
            byArray[8] = 1;
            byArray[9] = 1;
            byArray[10] = 1;
            byArray[11] = 1;
            byArray[12] = 1;
            byArray[13] = 1;
            byArray[14] = 2;
            byArray[15] = 2;
            byArray[16] = 2;
            byArray[17] = 2;
            byArray[18] = 2;
            byArray[19] = 2;
            byArray[20] = 2;
            byArray[21] = 1;
            byArray[22] = 1;
            byArray[23] = 1;
            byArray[24] = 1;
            byArray[25] = 1;
            byArray[26] = 1;
            byArray[27] = 1;
            byArrayArray[0] = byArray;
            byte[] byArray2 = new byte[8];
            byArray2[4] = 1;
            byArray2[5] = 1;
            byArray2[6] = 1;
            byArray2[7] = 1;
            byArrayArray[1] = byArray2;
            byArrayArray[2] = new byte[1];
            byArrayArray[3] = new byte[8];
            byte[] byArray3 = new byte[12];
            byArray3[1] = -1;
            byArray3[3] = -1;
            byArray3[5] = -1;
            byArray3[7] = -1;
            byArray3[9] = -1;
            byArray3[11] = -1;
            byArrayArray[4] = byArray3;
            return new ng(1, new Image[]{object, image2, image3, image, image4}, byArrayArray, new int[]{3, 2, 1, 1, 1});
        }
        if (n2 == 2 || n2 == 3 || n2 == 7) {
            byte[][] byArrayArray = new byte[5][];
            byte[] byArray = new byte[28];
            byArray[7] = 1;
            byArray[8] = 1;
            byArray[9] = 1;
            byArray[10] = 1;
            byArray[11] = 1;
            byArray[12] = 1;
            byArray[13] = 1;
            byArray[14] = 2;
            byArray[15] = 2;
            byArray[16] = 2;
            byArray[17] = 2;
            byArray[18] = 2;
            byArray[19] = 2;
            byArray[20] = 2;
            byArray[21] = 1;
            byArray[22] = 1;
            byArray[23] = 1;
            byArray[24] = 1;
            byArray[25] = 1;
            byArray[26] = 1;
            byArray[27] = 1;
            byArrayArray[0] = byArray;
            byte[] byArray4 = new byte[8];
            byArray4[2] = 1;
            byArray4[3] = 1;
            byArray4[4] = 2;
            byArray4[5] = 2;
            byArray4[6] = 3;
            byArray4[7] = 3;
            byArrayArray[1] = byArray4;
            byArrayArray[2] = new byte[1];
            byArrayArray[3] = new byte[8];
            byte[] byArray5 = new byte[12];
            byArray5[1] = -1;
            byArray5[3] = -1;
            byArray5[5] = -1;
            byArray5[7] = -1;
            byArray5[9] = -1;
            byArray5[11] = -1;
            byArrayArray[4] = byArray5;
            object = new ng(1, new Image[]{object, image2, image3, image, image4}, byArrayArray, new int[]{3, 4, 1, 1, 1});
            new ng(1, new Image[]{object, image2, image3, image, image4}, byArrayArray, new int[]{3, 4, 1, 1, 1}).d = 20;
            object.e = -5;
            return object;
        }
        if (n2 >= 63 && n2 <= 78) {
            byte[][] byArrayArray = new byte[5][];
            byte[] byArray = new byte[28];
            byArray[7] = 1;
            byArray[8] = 1;
            byArray[9] = 1;
            byArray[10] = 1;
            byArray[11] = 1;
            byArray[12] = 1;
            byArray[13] = 1;
            byArray[14] = 2;
            byArray[15] = 2;
            byArray[16] = 2;
            byArray[17] = 2;
            byArray[18] = 2;
            byArray[19] = 2;
            byArray[20] = 2;
            byArray[21] = 1;
            byArray[22] = 1;
            byArray[23] = 1;
            byArray[24] = 1;
            byArray[25] = 1;
            byArray[26] = 1;
            byArray[27] = 1;
            byArrayArray[0] = byArray;
            byte[] byArray6 = new byte[8];
            byArray6[2] = 1;
            byArray6[3] = 1;
            byArray6[4] = 2;
            byArray6[5] = 2;
            byArray6[6] = 3;
            byArray6[7] = 3;
            byArrayArray[1] = byArray6;
            byArrayArray[2] = new byte[1];
            byArrayArray[3] = new byte[8];
            byte[] byArray7 = new byte[12];
            byArray7[1] = -1;
            byArray7[3] = -1;
            byArray7[5] = -1;
            byArray7[7] = -1;
            byArray7[9] = -1;
            byArray7[11] = -1;
            byArrayArray[4] = byArray7;
            object = new ng(1, new Image[]{object, image2, image3, image, image4}, byArrayArray, new int[]{3, 4, 1, 1, 1});
            new ng(1, new Image[]{object, image2, image3, image, image4}, byArrayArray, new int[]{3, 4, 1, 1, 1}).d = 20;
            object.e = -8;
            return object;
        }
        if (n2 == 1 || n2 == 14 || n2 == 16) {
            byte[][] byArrayArray = new byte[5][];
            byte[] byArray = new byte[16];
            byArray[7] = 1;
            byArray[8] = 1;
            byArray[9] = 1;
            byArray[10] = 1;
            byArray[11] = 1;
            byArray[12] = 1;
            byArray[13] = 1;
            byArray[14] = 1;
            byArray[15] = 1;
            byArrayArray[0] = byArray;
            byte[] byArray8 = new byte[4];
            byArray8[2] = 1;
            byArray8[3] = 1;
            byArrayArray[1] = byArray8;
            byArrayArray[2] = new byte[1];
            byArrayArray[3] = new byte[8];
            byte[] byArray9 = new byte[12];
            byArray9[1] = -1;
            byArray9[3] = -1;
            byArray9[5] = -1;
            byArray9[7] = -1;
            byArray9[9] = -1;
            byArray9[11] = -1;
            byArrayArray[4] = byArray9;
            return new ng(1, new Image[]{object, image2, image3, image, image4}, byArrayArray, new int[]{2, 2, 1, 1, 1});
        }
        if (n2 == 4 || n2 == 12) {
            byte[][] byArrayArray = new byte[5][];
            byte[] byArray = new byte[16];
            byArray[7] = 1;
            byArray[8] = 1;
            byArray[9] = 1;
            byArray[10] = 1;
            byArray[11] = 1;
            byArray[12] = 1;
            byArray[13] = 1;
            byArray[14] = 1;
            byArray[15] = 1;
            byArrayArray[0] = byArray;
            byte[] byArray10 = new byte[8];
            byArray10[4] = 1;
            byArray10[5] = 1;
            byArray10[6] = 1;
            byArray10[7] = 1;
            byArrayArray[1] = byArray10;
            byArrayArray[2] = new byte[1];
            byArrayArray[3] = new byte[8];
            byte[] byArray11 = new byte[12];
            byArray11[1] = -1;
            byArray11[3] = -1;
            byArray11[5] = -1;
            byArray11[7] = -1;
            byArray11[9] = -1;
            byArray11[11] = -1;
            byArrayArray[4] = byArray11;
            return new ng(1, new Image[]{object, image2, image3, image, image4}, byArrayArray, new int[]{2, 2, 1, 1, 1});
        }
        if (n2 == 5 || n2 == 11) {
            byte[][] byArrayArray = new byte[5][];
            byte[] byArray = new byte[16];
            byArray[7] = 1;
            byArray[8] = 1;
            byArray[9] = 1;
            byArray[10] = 1;
            byArray[11] = 1;
            byArray[12] = 1;
            byArray[13] = 1;
            byArray[14] = 1;
            byArray[15] = 1;
            byArrayArray[0] = byArray;
            byte[] byArray12 = new byte[8];
            byArray12[4] = 1;
            byArray12[5] = 1;
            byArray12[6] = 1;
            byArray12[7] = 1;
            byArrayArray[1] = byArray12;
            byArrayArray[2] = new byte[1];
            byArrayArray[3] = new byte[8];
            byte[] byArray13 = new byte[12];
            byArray13[1] = -1;
            byArray13[3] = -1;
            byArray13[5] = -1;
            byArray13[7] = -1;
            byArray13[9] = -1;
            byArray13[11] = -1;
            byArrayArray[4] = byArray13;
            object = new ng(1, new Image[]{object, image2, image3, image, image4}, byArrayArray, new int[]{2, 2, 1, 1, 1});
            new ng(1, new Image[]{object, image2, image3, image, image4}, byArrayArray, new int[]{2, 2, 1, 1, 1}).d = 20;
            object.e = 0;
            return object;
        }
        if (n2 == 6) {
            byte[][] byArrayArray = new byte[5][];
            byte[] byArray = new byte[16];
            byArray[7] = 1;
            byArray[8] = 1;
            byArray[9] = 1;
            byArray[10] = 1;
            byArray[11] = 1;
            byArray[12] = 1;
            byArray[13] = 1;
            byArray[14] = 1;
            byArray[15] = 1;
            byArrayArray[0] = byArray;
            byte[] byArray14 = new byte[8];
            byArray14[4] = 1;
            byArray14[5] = 1;
            byArray14[6] = 2;
            byArray14[7] = 2;
            byArrayArray[1] = byArray14;
            byArrayArray[2] = new byte[1];
            byArrayArray[3] = new byte[10];
            byte[] byArray15 = new byte[12];
            byArray15[1] = -1;
            byArray15[3] = -1;
            byArray15[5] = -1;
            byArray15[7] = -1;
            byArray15[9] = -1;
            byArray15[11] = -1;
            byArrayArray[4] = byArray15;
            object = new ng(1, new Image[]{object, image2, image3, image, image4}, byArrayArray, new int[]{2, 3, 1, 1, 1});
            new ng(1, new Image[]{object, image2, image3, image, image4}, byArrayArray, new int[]{2, 3, 1, 1, 1}).d = 30;
            return object;
        }
        if (n2 == 17 || n2 == 61) {
            byte[][] byArrayArray = new byte[5][];
            byte[] byArray = new byte[16];
            byArray[7] = 1;
            byArray[8] = 1;
            byArray[9] = 1;
            byArray[10] = 1;
            byArray[11] = 1;
            byArray[12] = 1;
            byArray[13] = 1;
            byArray[14] = 1;
            byArray[15] = 1;
            byArrayArray[0] = byArray;
            byArrayArray[1] = new byte[1];
            byte[] byArray16 = new byte[16];
            byArray16[7] = 1;
            byArray16[8] = 1;
            byArray16[9] = 1;
            byArray16[10] = 1;
            byArray16[11] = 1;
            byArray16[12] = 1;
            byArray16[13] = 1;
            byArray16[14] = 1;
            byArray16[15] = 1;
            byArrayArray[2] = byArray16;
            byArrayArray[3] = new byte[8];
            byte[] byArray17 = new byte[12];
            byArray17[1] = -1;
            byArray17[3] = -1;
            byArray17[5] = -1;
            byArray17[7] = -1;
            byArray17[9] = -1;
            byArray17[11] = -1;
            byArrayArray[4] = byArray17;
            byte[][] byArrayArray2 = new byte[3][];
            byte[] byArray18 = new byte[6];
            byArray18[4] = 1;
            byArray18[5] = 1;
            byArrayArray2[0] = byArray18;
            byArrayArray2[1] = new byte[]{2, 2, 3, 3, 3};
            byArrayArray2[2] = new byte[]{-1};
            object = new nn(1, new Image[]{object, image2, object, image, image4}, byArrayArray, new int[]{2, 1, 2, 1, 1}, image5, byArrayArray2, 4);
            new nn(1, new Image[]{object, image2, object, image, image4}, byArrayArray, new int[]{2, 1, 2, 1, 1}, image5, byArrayArray2, 4).b = -27;
            object.a = 42;
            return object;
        }
        if (n2 == 8) {
            byte[][] byArrayArray = new byte[5][];
            byte[] byArray = new byte[23];
            byArray[11] = 1;
            byArray[12] = 1;
            byArray[13] = 1;
            byArray[14] = 1;
            byArray[15] = 1;
            byArray[16] = 1;
            byArray[17] = 1;
            byArray[18] = 1;
            byArray[19] = 1;
            byArray[20] = 1;
            byArray[21] = 1;
            byArray[22] = 1;
            byArrayArray[0] = byArray;
            byArrayArray[1] = new byte[4];
            byte[] byArray19 = new byte[16];
            byArray19[7] = 1;
            byArray19[8] = 1;
            byArray19[9] = 1;
            byArray19[10] = 1;
            byArray19[11] = 1;
            byArray19[12] = 1;
            byArray19[13] = 1;
            byArray19[14] = 1;
            byArray19[15] = 1;
            byArrayArray[2] = byArray19;
            byArrayArray[3] = new byte[8];
            byte[] byArray20 = new byte[12];
            byArray20[1] = -1;
            byArray20[3] = -1;
            byArray20[5] = -1;
            byArray20[7] = -1;
            byArray20[9] = -1;
            byArray20[11] = -1;
            byArrayArray[4] = byArray20;
            byte[][] byArrayArray3 = new byte[3][];
            byte[] byArray21 = new byte[5];
            byArray21[1] = 1;
            byArray21[2] = 1;
            byArray21[3] = 2;
            byArray21[4] = 2;
            byArrayArray3[0] = byArray21;
            byArrayArray3[1] = new byte[3];
            byArrayArray3[2] = new byte[]{-1};
            object = new nn(1, new Image[]{object, image2, object, image, image4}, byArrayArray, new int[]{2, 1, 2, 1, 2}, image5, byArrayArray3, 4);
            new nn(1, new Image[]{object, image2, object, image, image4}, byArrayArray, new int[]{2, 1, 2, 1, 2}, image5, byArrayArray3, 4).b = 0;
            object.a = 60;
            return object;
        }
        if (n2 == 10) {
            byte[][] byArrayArray = new byte[5][];
            byte[] byArray = new byte[16];
            byArray[7] = 1;
            byArray[8] = 1;
            byArray[9] = 1;
            byArray[10] = 1;
            byArray[11] = 1;
            byArray[12] = 1;
            byArray[13] = 1;
            byArray[14] = 1;
            byArray[15] = 1;
            byArrayArray[0] = byArray;
            byte[] byArray22 = new byte[10];
            byArray22[2] = 1;
            byArray22[3] = 1;
            byArray22[4] = 1;
            byArray22[5] = 1;
            byArray22[6] = 1;
            byArray22[7] = 1;
            byArray22[8] = 1;
            byArray22[9] = 1;
            byArrayArray[1] = byArray22;
            byte[] byArray23 = new byte[16];
            byArray23[7] = 1;
            byArray23[8] = 1;
            byArray23[9] = 1;
            byArray23[10] = 1;
            byArray23[11] = 1;
            byArray23[12] = 1;
            byArray23[13] = 1;
            byArray23[14] = 1;
            byArray23[15] = 1;
            byArrayArray[2] = byArray23;
            byArrayArray[3] = new byte[8];
            byte[] byArray24 = new byte[12];
            byArray24[1] = -1;
            byArray24[3] = -1;
            byArray24[5] = -1;
            byArray24[7] = -1;
            byArray24[9] = -1;
            byArray24[11] = -1;
            byArrayArray[4] = byArray24;
            byte[][] byArrayArray4 = new byte[3][];
            byte[] byArray25 = new byte[4];
            byArray25[2] = 1;
            byArray25[3] = 1;
            byArrayArray4[0] = byArray25;
            byArrayArray4[1] = new byte[]{2, 2, 3, 3, 3};
            byArrayArray4[2] = new byte[]{-1};
            object = new nn(1, new Image[]{object, image2, object, image, image4}, byArrayArray, new int[]{2, 2, 2, 1, 1}, image5, byArrayArray4, 4);
            new nn(1, new Image[]{object, image2, object, image, image4}, byArrayArray, new int[]{2, 2, 2, 1, 1}, image5, byArrayArray4, 4).b = 35;
            object.a = 20;
            return object;
        }
        if (n2 == 13) {
            byte[][] byArrayArray = new byte[5][];
            byte[] byArray = new byte[16];
            byArray[7] = 1;
            byArray[8] = 1;
            byArray[9] = 1;
            byArray[10] = 1;
            byArray[11] = 1;
            byArray[12] = 1;
            byArray[13] = 1;
            byArray[14] = 1;
            byArray[15] = 1;
            byArrayArray[0] = byArray;
            byte[] byArray26 = new byte[4];
            byArray26[2] = 1;
            byArray26[3] = 1;
            byArrayArray[1] = byArray26;
            byte[] byArray27 = new byte[16];
            byArray27[7] = 1;
            byArray27[8] = 1;
            byArray27[9] = 1;
            byArray27[10] = 1;
            byArray27[11] = 1;
            byArray27[12] = 1;
            byArray27[13] = 1;
            byArray27[14] = 1;
            byArray27[15] = 1;
            byArrayArray[2] = byArray27;
            byArrayArray[3] = new byte[8];
            byte[] byArray28 = new byte[12];
            byArray28[1] = -1;
            byArray28[3] = -1;
            byArray28[5] = -1;
            byArray28[7] = -1;
            byArray28[9] = -1;
            byArray28[11] = -1;
            byArrayArray[4] = byArray28;
            byte[][] byArrayArray5 = new byte[3][];
            byArrayArray5[0] = new byte[]{-1};
            byte[] byArray29 = new byte[8];
            byArray29[2] = 1;
            byArray29[3] = 1;
            byArray29[4] = 2;
            byArray29[5] = 2;
            byArray29[6] = 3;
            byArray29[7] = 3;
            byArrayArray5[1] = byArray29;
            byArrayArray5[2] = new byte[]{-1};
            object = new nn(1, new Image[]{object, image2, object, image, image4}, byArrayArray, new int[]{2, 2, 2, 1, 1}, image5, byArrayArray5, 4);
            new nn(1, new Image[]{object, image2, object, image, image4}, byArrayArray, new int[]{2, 2, 2, 1, 1}, image5, byArrayArray5, 4).b = -25;
            object.a = 0;
            return object;
        }
        if (n2 == 9 || n2 == 15) {
            byte[][] byArrayArray = new byte[5][];
            byte[] byArray = new byte[16];
            byArray[7] = 1;
            byArray[8] = 1;
            byArray[9] = 1;
            byArray[10] = 1;
            byArray[11] = 1;
            byArray[12] = 1;
            byArray[13] = 1;
            byArray[14] = 1;
            byArray[15] = 1;
            byArrayArray[0] = byArray;
            byArrayArray[1] = new byte[1];
            byte[] byArray30 = new byte[16];
            byArray30[7] = 1;
            byArray30[8] = 1;
            byArray30[9] = 1;
            byArray30[10] = 1;
            byArray30[11] = 1;
            byArray30[12] = 1;
            byArray30[13] = 1;
            byArray30[14] = 1;
            byArray30[15] = 1;
            byArrayArray[2] = byArray30;
            byArrayArray[3] = new byte[8];
            byte[] byArray31 = new byte[12];
            byArray31[1] = -1;
            byArray31[3] = -1;
            byArray31[5] = -1;
            byArray31[7] = -1;
            byArray31[9] = -1;
            byArray31[11] = -1;
            byArrayArray[4] = byArray31;
            byte[][] byArrayArray6 = new byte[3][];
            byte[] byArray32 = new byte[4];
            byArray32[2] = 1;
            byArray32[3] = 1;
            byArrayArray6[0] = byArray32;
            byArrayArray6[1] = new byte[]{2, 2, 2};
            byArrayArray6[2] = new byte[]{-1};
            object = new nn(1, new Image[]{object, image2, object, image, image4}, byArrayArray, new int[]{2, 1, 2, 1, 1}, image5, byArrayArray6, 3);
            new nn(1, new Image[]{object, image2, object, image, image4}, byArrayArray, new int[]{2, 1, 2, 1, 1}, image5, byArrayArray6, 3).b = 0;
            object.a = 80;
            return object;
        }
        if (n2 == 18) {
            byte[][] byArrayArray = new byte[5][];
            byte[] byArray = new byte[16];
            byArray[7] = 1;
            byArray[8] = 1;
            byArray[9] = 1;
            byArray[10] = 1;
            byArray[11] = 1;
            byArray[12] = 1;
            byArray[13] = 1;
            byArray[14] = 1;
            byArray[15] = 1;
            byArrayArray[0] = byArray;
            byte[] byArray33 = new byte[5];
            byArray33[2] = 1;
            byArray33[3] = 1;
            byArray33[4] = 1;
            byArrayArray[1] = byArray33;
            byte[] byArray34 = new byte[16];
            byArray34[7] = 1;
            byArray34[8] = 1;
            byArray34[9] = 1;
            byArray34[10] = 1;
            byArray34[11] = 1;
            byArray34[12] = 1;
            byArray34[13] = 1;
            byArray34[14] = 1;
            byArray34[15] = 1;
            byArrayArray[2] = byArray34;
            byArrayArray[3] = new byte[8];
            byte[] byArray35 = new byte[12];
            byArray35[1] = -1;
            byArray35[3] = -1;
            byArray35[5] = -1;
            byArray35[7] = -1;
            byArray35[9] = -1;
            byArray35[11] = -1;
            byArrayArray[4] = byArray35;
            byte[][] byArrayArray7 = new byte[3][];
            byte[] byArray36 = new byte[4];
            byArray36[2] = 1;
            byArray36[3] = 1;
            byArrayArray7[0] = byArray36;
            byArrayArray7[1] = new byte[]{2, 2, 2};
            byArrayArray7[2] = new byte[]{-1};
            object = new nn(1, new Image[]{object, image2, object, image, image4}, byArrayArray, new int[]{2, 2, 2, 1, 1}, image5, byArrayArray7, 3);
            new nn(1, new Image[]{object, image2, object, image, image4}, byArrayArray, new int[]{2, 2, 2, 1, 1}, image5, byArrayArray7, 3).b = -15;
            object.a = 10;
            return object;
        }
        if (n2 == 22 || n2 == 51) {
            byte[][] byArrayArray = new byte[5][];
            byte[] byArray = new byte[16];
            byArray[7] = 1;
            byArray[8] = 1;
            byArray[9] = 1;
            byArray[10] = 1;
            byArray[11] = 1;
            byArray[12] = 1;
            byArray[13] = 1;
            byArray[14] = 1;
            byArray[15] = 1;
            byArrayArray[0] = byArray;
            byte[] byArray37 = new byte[4];
            byArray37[2] = 1;
            byArray37[3] = 1;
            byArrayArray[1] = byArray37;
            byte[] byArray38 = new byte[16];
            byArray38[7] = 1;
            byArray38[8] = 1;
            byArray38[9] = 1;
            byArray38[10] = 1;
            byArray38[11] = 1;
            byArray38[12] = 1;
            byArray38[13] = 1;
            byArray38[14] = 1;
            byArray38[15] = 1;
            byArrayArray[2] = byArray38;
            byArrayArray[3] = new byte[8];
            byte[] byArray39 = new byte[12];
            byArray39[1] = -1;
            byArray39[3] = -1;
            byArray39[5] = -1;
            byArray39[7] = -1;
            byArray39[9] = -1;
            byArray39[11] = -1;
            byArrayArray[4] = byArray39;
            byte[][] byArrayArray8 = new byte[3][];
            byte[] byArray40 = new byte[5];
            byArray40[2] = 1;
            byArray40[3] = 2;
            byArray40[4] = 2;
            byArrayArray8[0] = byArray40;
            byArrayArray8[1] = new byte[]{3, 3, 3};
            byArrayArray8[2] = new byte[]{-1};
            object = new nn(1, new Image[]{object, image2, object, image, image4}, byArrayArray, new int[]{2, 2, 2, 1, 1}, image5, byArrayArray8, 4);
            object.b = n2 == 22 ? -25 : -15;
            object.a = 50;
            return object;
        }
        if (n2 == 43) {
            byte[][] byArrayArray = new byte[5][];
            byte[] byArray = new byte[16];
            byArray[7] = 1;
            byArray[8] = 1;
            byArray[9] = 1;
            byArray[10] = 1;
            byArray[11] = 1;
            byArray[12] = 1;
            byArray[13] = 1;
            byArray[14] = 1;
            byArray[15] = 1;
            byArrayArray[0] = byArray;
            byte[] byArray41 = new byte[7];
            byArray41[2] = 1;
            byArray41[3] = 1;
            byArray41[4] = 1;
            byArray41[5] = 1;
            byArray41[6] = 1;
            byArrayArray[1] = byArray41;
            byte[] byArray42 = new byte[16];
            byArray42[7] = 1;
            byArray42[8] = 1;
            byArray42[9] = 1;
            byArray42[10] = 1;
            byArray42[11] = 1;
            byArray42[12] = 1;
            byArray42[13] = 1;
            byArray42[14] = 1;
            byArray42[15] = 1;
            byArrayArray[2] = byArray42;
            byArrayArray[3] = new byte[8];
            byte[] byArray43 = new byte[12];
            byArray43[1] = -1;
            byArray43[3] = -1;
            byArray43[5] = -1;
            byArray43[7] = -1;
            byArray43[9] = -1;
            byArray43[11] = -1;
            byArrayArray[4] = byArray43;
            byte[][] byArrayArray9 = new byte[3][];
            byte[] byArray44 = new byte[5];
            byArray44[2] = 1;
            byArray44[3] = 1;
            byArray44[4] = 1;
            byArrayArray9[0] = byArray44;
            byArrayArray9[1] = new byte[]{2, 2, 3, 3, 3};
            byArrayArray9[2] = new byte[]{-1};
            object = new nn(1, new Image[]{object, image2, object, image, image4}, byArrayArray, new int[]{2, 2, 2, 1, 1}, image5, byArrayArray9, 4);
            new nn(1, new Image[]{object, image2, object, image, image4}, byArrayArray, new int[]{2, 2, 2, 1, 1}, image5, byArrayArray9, 4).b = 0;
            object.a = 50;
            return object;
        }
        if (n2 == 47) {
            byte[][] byArrayArray = new byte[5][];
            byte[] byArray = new byte[16];
            byArray[7] = 1;
            byArray[8] = 1;
            byArray[9] = 1;
            byArray[10] = 1;
            byArray[11] = 1;
            byArray[12] = 1;
            byArray[13] = 1;
            byArray[14] = 1;
            byArray[15] = 1;
            byArrayArray[0] = byArray;
            byte[] byArray45 = new byte[7];
            byArray45[2] = 1;
            byArray45[3] = 1;
            byArray45[4] = 2;
            byArray45[5] = 2;
            byArray45[6] = 2;
            byArrayArray[1] = byArray45;
            byte[] byArray46 = new byte[16];
            byArray46[7] = 1;
            byArray46[8] = 1;
            byArray46[9] = 1;
            byArray46[10] = 1;
            byArray46[11] = 1;
            byArray46[12] = 1;
            byArray46[13] = 1;
            byArray46[14] = 1;
            byArray46[15] = 1;
            byArrayArray[2] = byArray46;
            byArrayArray[3] = new byte[8];
            byte[] byArray47 = new byte[12];
            byArray47[1] = -1;
            byArray47[3] = -1;
            byArray47[5] = -1;
            byArray47[7] = -1;
            byArray47[9] = -1;
            byArray47[11] = -1;
            byArrayArray[4] = byArray47;
            object = new nn(1, new Image[]{object, image2, object, image, image4}, byArrayArray, new int[]{2, 3, 2, 1, 1}, image5, new byte[][]{new byte[2], {1, 1, 1, 1}, {-1}}, 2);
            new nn(1, new Image[]{object, image2, object, image, image4}, byArrayArray, new int[]{2, 3, 2, 1, 1}, image5, new byte[][]{new byte[2], {1, 1, 1, 1}, {-1}}, 2).b = -5;
            object.a = 50;
            return object;
        }
        if (n2 == 30 || n2 == 31 || n2 == 32) {
            byte[][] byArrayArray = new byte[5][];
            byte[] byArray = new byte[16];
            byArray[7] = 1;
            byArray[8] = 1;
            byArray[9] = 1;
            byArray[10] = 1;
            byArray[11] = 1;
            byArray[12] = 1;
            byArray[13] = 1;
            byArray[14] = 1;
            byArray[15] = 1;
            byArrayArray[0] = byArray;
            byArrayArray[1] = new byte[]{-1};
            byte[] byArray48 = new byte[16];
            byArray48[7] = 1;
            byArray48[8] = 1;
            byArray48[9] = 1;
            byArray48[10] = 1;
            byArray48[11] = 1;
            byArray48[12] = 1;
            byArray48[13] = 1;
            byArray48[14] = 1;
            byArray48[15] = 1;
            byArrayArray[2] = byArray48;
            byArrayArray[3] = new byte[8];
            byte[] byArray49 = new byte[12];
            byArray49[1] = -1;
            byArray49[3] = -1;
            byArray49[5] = -1;
            byArray49[7] = -1;
            byArray49[9] = -1;
            byArray49[11] = -1;
            byArrayArray[4] = byArray49;
            byte[][] byArrayArray10 = new byte[3][];
            byte[] byArray50 = new byte[5];
            byArray50[2] = 1;
            byArray50[3] = 2;
            byArray50[4] = 2;
            byArrayArray10[0] = byArray50;
            byArrayArray10[1] = new byte[]{3, 3, 3, 3, 3};
            byArrayArray10[2] = new byte[]{-1};
            object = new nn(1, new Image[]{object, image2, object, image, image4}, byArrayArray, new int[]{2, 2, 2, 1, 1}, image5, byArrayArray10, 4);
            new nn(1, new Image[]{object, image2, object, image, image4}, byArrayArray, new int[]{2, 2, 2, 1, 1}, image5, byArrayArray10, 4).b = 10;
            object.a = 20;
            return object;
        }
        if (n2 == 24 || n2 == 33 || n2 == 34) {
            byte[][] byArrayArray = new byte[5][];
            byte[] byArray = new byte[16];
            byArray[7] = 1;
            byArray[8] = 1;
            byArray[9] = 1;
            byArray[10] = 1;
            byArray[11] = 1;
            byArray[12] = 1;
            byArray[13] = 1;
            byArray[14] = 1;
            byArray[15] = 1;
            byArrayArray[0] = byArray;
            byte[] byArray51 = new byte[7];
            byArray51[2] = 1;
            byArray51[3] = 1;
            byArray51[4] = 1;
            byArray51[5] = 1;
            byArray51[6] = 1;
            byArrayArray[1] = byArray51;
            byte[] byArray52 = new byte[16];
            byArray52[7] = 1;
            byArray52[8] = 1;
            byArray52[9] = 1;
            byArray52[10] = 1;
            byArray52[11] = 1;
            byArray52[12] = 1;
            byArray52[13] = 1;
            byArray52[14] = 1;
            byArray52[15] = 1;
            byArrayArray[2] = byArray52;
            byArrayArray[3] = new byte[8];
            byte[] byArray53 = new byte[12];
            byArray53[1] = -1;
            byArray53[3] = -1;
            byArray53[5] = -1;
            byArray53[7] = -1;
            byArray53[9] = -1;
            byArray53[11] = -1;
            byArrayArray[4] = byArray53;
            byte[][] byArrayArray11 = new byte[3][];
            byte[] byArray54 = new byte[5];
            byArray54[2] = 1;
            byArray54[3] = 2;
            byArray54[4] = 2;
            byArrayArray11[0] = byArray54;
            byArrayArray11[1] = new byte[]{3, 3, 3};
            byArrayArray11[2] = new byte[]{-1};
            object = new nn(1, new Image[]{object, image2, object, image, image4}, byArrayArray, new int[]{2, 2, 2, 1, 1}, image5, byArrayArray11, 4);
            new nn(1, new Image[]{object, image2, object, image, image4}, byArrayArray, new int[]{2, 2, 2, 1, 1}, image5, byArrayArray11, 4).b = 0;
            object.a = 50;
            return object;
        }
        if (n2 == 100) {
            byte[][] byArrayArray = new byte[6][];
            byte[] byArray = new byte[20];
            byArray[5] = 1;
            byArray[6] = 1;
            byArray[7] = 1;
            byArray[8] = 1;
            byArray[9] = 1;
            byArray[10] = 2;
            byArray[11] = 2;
            byArray[12] = 2;
            byArray[13] = 2;
            byArray[14] = 2;
            byArray[15] = 1;
            byArray[16] = 1;
            byArray[17] = 1;
            byArray[18] = 1;
            byArray[19] = 1;
            byArrayArray[0] = byArray;
            byArrayArray[1] = new byte[]{3, 3, 4, 4};
            byte[] byArray55 = new byte[7];
            byArray55[3] = 1;
            byArray55[4] = 1;
            byArray55[5] = 2;
            byArray55[6] = 2;
            byArrayArray[2] = byArray55;
            byArrayArray[3] = new byte[8];
            byte[] byArray56 = new byte[12];
            byArray56[1] = 1;
            byArray56[3] = 1;
            byArray56[5] = 1;
            byArray56[7] = 1;
            byArray56[9] = 1;
            byArray56[11] = -1;
            byArrayArray[4] = byArray56;
            byArrayArray[5] = new byte[]{5, 5, 5, 6, 7, 8};
            return new nf(1, new Image[]{object, image2, image2, image4, image4, image2}, byArrayArray, new int[]{3, 3, 2, 2, 2, 4});
        }
        if (n2 == 44 || n2 == 45 || n2 == 46 || n2 == 56 || n2 == 57 || n2 == 58 || n2 == 60 || n2 == 62) {
            byte[][] byArrayArray = new byte[5][];
            byte[] byArray = new byte[16];
            byArray[7] = 1;
            byArray[8] = 1;
            byArray[9] = 1;
            byArray[10] = 1;
            byArray[11] = 1;
            byArray[12] = 1;
            byArray[13] = 1;
            byArray[14] = 1;
            byArray[15] = 1;
            byArrayArray[0] = byArray;
            byte[] byArray57 = new byte[8];
            byArray57[4] = 1;
            byArray57[5] = 1;
            byArray57[6] = 1;
            byArray57[7] = 1;
            byArrayArray[1] = byArray57;
            byArrayArray[2] = new byte[1];
            byArrayArray[3] = new byte[8];
            byte[] byArray58 = new byte[12];
            byArray58[1] = -1;
            byArray58[3] = -1;
            byArray58[5] = -1;
            byArray58[7] = -1;
            byArray58[9] = -1;
            byArray58[11] = -1;
            byArrayArray[4] = byArray58;
            object = new ng(1, new Image[]{object, image2, image3, image, image4}, byArrayArray, new int[]{2, 2, 1, 1, 1});
            object.f = this.A == 0 ? 4 : 8;
            return object;
        }
        if (n2 == 23 || n2 == 25 || n2 == 26 || n2 == 27 || n2 == 28 || n2 == 29 || n2 == 35 || n2 == 36 || n2 == 37 || n2 == 38 || n2 == 39 || n2 == 40 || n2 == 41 || n2 == 42 || n2 == 48 || n2 == 49 || n2 == 50 || n2 == 52 || n2 == 53 || n2 == 54 || n2 == 55) {
            byte[][] byArrayArray = new byte[5][];
            byte[] byArray = new byte[16];
            byArray[7] = 1;
            byArray[8] = 1;
            byArray[9] = 1;
            byArray[10] = 1;
            byArray[11] = 1;
            byArray[12] = 1;
            byArray[13] = 1;
            byArray[14] = 1;
            byArray[15] = 1;
            byArrayArray[0] = byArray;
            byte[] byArray59 = new byte[8];
            byArray59[4] = 1;
            byArray59[5] = 1;
            byArray59[6] = 1;
            byArray59[7] = 1;
            byArrayArray[1] = byArray59;
            byArrayArray[2] = new byte[1];
            byArrayArray[3] = new byte[8];
            byte[] byArray60 = new byte[12];
            byArray60[1] = -1;
            byArray60[3] = -1;
            byArray60[5] = -1;
            byArray60[7] = -1;
            byArray60[9] = -1;
            byArray60[11] = -1;
            byArrayArray[4] = byArray60;
            return new ng(1, new Image[]{object, image2, image3, image, image4}, byArrayArray, new int[]{2, 2, 1, 1, 1});
        }
        if (n2 == 101) {
            byte[][] byArrayArray = new byte[5][];
            byte[] byArray = new byte[16];
            byArray[7] = 1;
            byArray[8] = 1;
            byArray[9] = 1;
            byArray[10] = 1;
            byArray[11] = 1;
            byArray[12] = 1;
            byArray[13] = 1;
            byArray[14] = 1;
            byArray[15] = 1;
            byArrayArray[0] = byArray;
            byte[] byArray61 = new byte[12];
            byArray61[4] = 1;
            byArray61[5] = 1;
            byArray61[6] = 1;
            byArray61[7] = 1;
            byArray61[8] = 2;
            byArray61[9] = 2;
            byArray61[10] = 2;
            byArray61[11] = 2;
            byArrayArray[1] = byArray61;
            byArrayArray[2] = new byte[4];
            byArrayArray[3] = new byte[8];
            byte[] byArray62 = new byte[12];
            byArray62[1] = -1;
            byArray62[3] = -1;
            byArray62[5] = -1;
            byArray62[7] = -1;
            byArray62[9] = -1;
            byArray62[11] = -1;
            byArrayArray[4] = byArray62;
            object = new ng(1, new Image[]{object, image2, image3, image, image4}, byArrayArray, new int[]{2, 3, 1, 1, 1});
            return object;
        }
        if (n2 == 102) {
            byte[][] byArrayArray = new byte[5][];
            byte[] byArray = new byte[16];
            byArray[7] = 1;
            byArray[8] = 1;
            byArray[9] = 1;
            byArray[10] = 1;
            byArray[11] = 1;
            byArray[12] = 1;
            byArray[13] = 1;
            byArray[14] = 1;
            byArray[15] = 1;
            byArrayArray[0] = byArray;
            byte[] byArray63 = new byte[7];
            byArray63[2] = 1;
            byArray63[3] = 1;
            byArray63[4] = 1;
            byArray63[5] = 2;
            byArray63[6] = 2;
            byArrayArray[1] = byArray63;
            byte[] byArray64 = new byte[16];
            byArray64[7] = 1;
            byArray64[8] = 1;
            byArray64[9] = 1;
            byArray64[10] = 1;
            byArray64[11] = 1;
            byArray64[12] = 1;
            byArray64[13] = 1;
            byArray64[14] = 1;
            byArray64[15] = 1;
            byArrayArray[2] = byArray64;
            byArrayArray[3] = new byte[8];
            byte[] byArray65 = new byte[12];
            byArray65[1] = -1;
            byArray65[3] = -1;
            byArray65[5] = -1;
            byArray65[7] = -1;
            byArray65[9] = -1;
            byArray65[11] = -1;
            byArrayArray[4] = byArray65;
            byte[][] byArrayArray12 = new byte[3][];
            byte[] byArray66 = new byte[5];
            byArray66[2] = 1;
            byArray66[3] = 2;
            byArray66[4] = 2;
            byArrayArray12[0] = byArray66;
            byArrayArray12[1] = new byte[]{3, 3, 3};
            byArrayArray12[2] = new byte[]{-1};
            object = new nn(1, new Image[]{object, image2, object, image, image4}, byArrayArray, new int[]{2, 3, 2, 1, 1}, image5, byArrayArray12, 4);
            return object;
        }
        if (n2 == 103) {
            byte[][] byArrayArray = new byte[5][];
            byte[] byArray = new byte[16];
            byArray[7] = 1;
            byArray[8] = 1;
            byArray[9] = 1;
            byArray[10] = 1;
            byArray[11] = 1;
            byArray[12] = 1;
            byArray[13] = 1;
            byArray[14] = 1;
            byArray[15] = 1;
            byArrayArray[0] = byArray;
            byArrayArray[1] = new byte[7];
            byte[] byArray67 = new byte[16];
            byArray67[7] = 1;
            byArray67[8] = 1;
            byArray67[9] = 1;
            byArray67[10] = 1;
            byArray67[11] = 1;
            byArray67[12] = 1;
            byArray67[13] = 1;
            byArray67[14] = 1;
            byArray67[15] = 1;
            byArrayArray[2] = byArray67;
            byArrayArray[3] = new byte[8];
            byte[] byArray68 = new byte[12];
            byArray68[1] = -1;
            byArray68[3] = -1;
            byArray68[5] = -1;
            byArray68[7] = -1;
            byArray68[9] = -1;
            byArray68[11] = -1;
            byArrayArray[4] = byArray68;
            byte[][] byArrayArray13 = new byte[3][];
            byte[] byArray69 = new byte[5];
            byArray69[2] = 1;
            byArray69[3] = 1;
            byArray69[4] = 1;
            byArrayArray13[0] = byArray69;
            byArrayArray13[1] = new byte[]{2, 2, 3, 3};
            byArrayArray13[2] = new byte[]{-1};
            object = new nn(1, new Image[]{object, image2, object, image, image4}, byArrayArray, new int[]{2, 1, 2, 1, 1}, image5, byArrayArray13, 4);
            return object;
        }
        if (n2 == 104) {
            byte[][] byArrayArray = new byte[5][];
            byte[] byArray = new byte[21];
            byArray[7] = 1;
            byArray[8] = 1;
            byArray[9] = 1;
            byArray[10] = 1;
            byArray[11] = 1;
            byArray[12] = 1;
            byArray[13] = 1;
            byArray[14] = 2;
            byArray[15] = 2;
            byArray[16] = 2;
            byArray[17] = 2;
            byArray[18] = 2;
            byArray[19] = 2;
            byArray[20] = 2;
            byArrayArray[0] = byArray;
            byte[] byArray70 = new byte[8];
            byArray70[4] = 1;
            byArray70[5] = 1;
            byArray70[6] = 1;
            byArray70[7] = 1;
            byArrayArray[1] = byArray70;
            byte[] byArray71 = new byte[21];
            byArray71[7] = 1;
            byArray71[8] = 1;
            byArray71[9] = 1;
            byArray71[10] = 1;
            byArray71[11] = 1;
            byArray71[12] = 1;
            byArray71[13] = 1;
            byArray71[14] = 2;
            byArray71[15] = 2;
            byArray71[16] = 2;
            byArray71[17] = 2;
            byArray71[18] = 2;
            byArray71[19] = 2;
            byArray71[20] = 2;
            byArrayArray[2] = byArray71;
            byArrayArray[3] = new byte[8];
            byte[] byArray72 = new byte[12];
            byArray72[1] = -1;
            byArray72[3] = -1;
            byArray72[5] = -1;
            byArray72[7] = -1;
            byArray72[9] = -1;
            byArray72[11] = -1;
            byArrayArray[4] = byArray72;
            object = new nn(1, new Image[]{object, image2, object, image, image4}, byArrayArray, new int[]{3, 2, 3, 1, 1}, image5, new byte[][]{new byte[5], {1, 1, 2, 2}, {-1}}, 3);
            return object;
        }
        object = mx.m(100005);
        image2 = mx.m(100001);
        image3 = mx.m(100004);
        image = mx.m(100003);
        image4 = mx.m(100002);
        mx.m(100006);
        byte[][] byArrayArray = new byte[5][];
        byte[] byArray = new byte[28];
        byArray[7] = 1;
        byArray[8] = 1;
        byArray[9] = 1;
        byArray[10] = 1;
        byArray[11] = 1;
        byArray[12] = 1;
        byArray[13] = 1;
        byArray[14] = 2;
        byArray[15] = 2;
        byArray[16] = 2;
        byArray[17] = 2;
        byArray[18] = 2;
        byArray[19] = 2;
        byArray[20] = 2;
        byArray[21] = 1;
        byArray[22] = 1;
        byArray[23] = 1;
        byArray[24] = 1;
        byArray[25] = 1;
        byArray[26] = 1;
        byArray[27] = 1;
        byArrayArray[0] = byArray;
        byte[] byArray73 = new byte[8];
        byArray73[4] = 1;
        byArray73[5] = 1;
        byArray73[6] = 1;
        byArray73[7] = 1;
        byArrayArray[1] = byArray73;
        byArrayArray[2] = new byte[1];
        byArrayArray[3] = new byte[8];
        byte[] byArray74 = new byte[12];
        byArray74[1] = -1;
        byArray74[3] = -1;
        byArray74[5] = -1;
        byArray74[7] = -1;
        byArray74[9] = -1;
        byArray74[11] = -1;
        byArrayArray[4] = byArray74;
        return new ng(1, new Image[]{object, image2, image3, image, image4}, byArrayArray, new int[]{3, 2, 1, 1, 1});
    }

    private static nk b(lh object, int n) {
        try {
            mb[] mbArray = mb.a((lh)object);
            lc lc2 = lc.a((lh)object);
            nr nr2 = nr.a((lh)object);
            mg mg2 = mb.a((lh)object, mbArray[0], mbArray[1], mbArray[3], mbArray[2], true);
            mg2.a(lc2);
            mg2.a(nr2);
            mg mg3 = mb.b((lh)object, mbArray[0], mbArray[1], mbArray[3], mbArray[2], true);
            mg3.a(lc2);
            mg3.a(nr2);
            mg mg4 = mb.c((lh)object, mbArray[0], mbArray[1], mbArray[3], mbArray[2], true);
            mg4.a(lc2);
            mg4.a(nr2);
            mg mg5 = mb.e((lh)object, mbArray[0], mbArray[1], mbArray[3], mbArray[2], true);
            mg5.a(lc2);
            mg5.a(nr2);
            mg mg6 = mb.d((lh)object, mbArray[0], mbArray[1], mbArray[3], mbArray[2], true);
            mg6.a(lc2);
            mg6.a(nr2);
            mg mg7 = mb.f((lh)object, mbArray[0], mbArray[1], mbArray[3], mbArray[2], true);
            mg7.a(lc2);
            mg7.a(nr2);
            object = mb.a((lh)object, mp.a().h, mbArray[0], mbArray[1], mbArray[3], mbArray[2], true);
            ((mg)object).a(lc2);
            ((mg)object).a(nr2);
            return new ni(n, mg2, mg4, mg3, mg5, mg6, mg7, (mc)object, nr2);
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return null;
        }
    }

    private void c(boolean bl) {
        Object object = this;
        Image image = f.d("/play/hpbar");
        Object object2 = f.b("/play/hpbar");
        h.a(object2, 100);
        Image image2 = f.a(object2);
        h.a(object2, 150);
        Image image3 = f.a(object2);
        h.a(object2, -110);
        Image image4 = f.a(object2);
        h.a(object2, -30);
        object2 = f.a(object2);
        ((mx)object).C = new Image[]{image, image2, image3, image4, (Image)object2};
        this.D = f.d("/play/manabar");
        this.E = f.d("/play/powerbar");
        if (bl) {
            int n = 0;
            while (n < this.C.length) {
                this.C[n] = Image.createImage((Image)this.C[n], (int)0, (int)0, (int)this.C[n].getWidth(), (int)this.C[n].getHeight(), (int)7);
                ++n;
            }
            this.D = Image.createImage((Image)this.D, (int)0, (int)0, (int)this.D.getWidth(), (int)this.D.getHeight(), (int)7);
            this.E = Image.createImage((Image)this.E, (int)0, (int)0, (int)this.E.getWidth(), (int)this.E.getHeight(), (int)7);
        }
        if (oq.o == 1) {
            byte[] byArray = f.b("/play/hpbar");
            object = byArray;
            h.a(byArray, 160);
            this.F = f.a((byte[])object);
            if (bl) {
                this.F = Image.createImage((Image)this.F, (int)0, (int)0, (int)this.F.getWidth(), (int)this.F.getHeight(), (int)7);
            }
        }
    }

    public final int[] a() {
        return this.B[0];
    }

    public final int[] b() {
        return this.B[3];
    }

    public final int[] c() {
        return this.B[1];
    }

    public final int[] d() {
        return this.B[4];
    }

    public final int[] e() {
        return this.B[2];
    }

    public final int[] f() {
        return this.B[5];
    }

    public final int[] g() {
        return new int[]{this.a[1].n(), this.a[1].o(), this.a[1].p(), this.a[1].q()};
    }

    public final int[] h() {
        return new int[]{this.a[0].n(), this.a[0].o(), this.a[0].p(), this.a[0].q()};
    }

    public final nk[] a(int n) {
        if (n == 0) {
            return this.H;
        }
        return this.I;
    }

    /*
     * Unable to fully structure code
     */
   public final void a(Graphics var1_1, int var2_2, int var3_3) {
    // --- Khối hiệu ứng viền ---
    if (!this.s) {
        int[] var4_4 = this.e;
        if (this.k == 1) {
            var4_4 = this.f;
        }
        int var5_6 = 0;
        if (this.d >= 10) {
            if (this.d < 18) {
                var5_6 = (this.d - 3) & 3;
            } else {
                var5_6 = 3;
            }
        } else {
            if (this.d % 2 == 0) {
                var5_6 = 3;
            }
            // else giữ nguyên var5_6 = 0
        }
        int var6_7 = this.K.a - 1;
        int var7_10 = this.K.b - 1;
        int var8_15 = this.K.c + 1;
        int var9_18 = this.K.d + 1;
        --var5_6;
        int var10_19 = 0;
        while (var10_19 < var5_6) {
            var1_1.setColor(var4_4[var10_19]);
            var1_1.drawRect(var6_7, var7_10, var8_15, var9_18);
            --var6_7;
            --var7_10;
            var8_15 += 2;
            var9_18 += 2;
            ++var10_19;
        }
        if (var5_6 >= 0) {
            cw.b(var1_1, var4_4[var5_6], var6_7, var7_10, var8_15 + 1, var9_18 + 1);
        }
    }

    // --- Khối vẽ các thành phần P, Q, R ---
    int var4_5 = 0;
    int var5_6 = 0;
    while (var5_6 < this.G.length) {
        nj var11_20 = this.P[var5_6];
        if (var11_20.b > 1 || this.M[var5_6] < 2) {
            int var11_21 = this.A;
            int var10_19 = this.B[var4_5 + 0][1];
            int var9_18 = this.B[var4_5 + 0][0];
            Image[] var8_16 = this.C;
            Graphics var7_11 = var1_1;
            nj var6_8 = this.P[var5_6];
            int var12_26 = var6_8.c;
            int var13_27 = var12_26 - 1;
            if (var11_21 == 0) {
                nj var11_22 = var6_8;
                int var11_23 = var11_22.b;
                int var14_28 = var8_16[0].getHeight();
                cw.a(var7_11, var8_16[var12_26], 0, 0, var11_23, var14_28, var9_18, var10_19, 0);
                if (var13_27 >= 0) {
                    cw.a(var7_11, var8_16[var13_27], var11_23, 0, var6_8.a - var11_23, var14_28, var9_18 + var11_23, var10_19, 0);
                }
            } else {
                nj var11_24 = var6_8;
                int var14_28 = var11_24.b;
                int var11_25 = var8_16[0].getWidth();
                int var6_9 = var8_16[0].getHeight() - var14_28;
                cw.a(var7_11, var8_16[var12_26], 0, var6_9, var11_25, var14_28, var9_18, var10_19 + var6_9, 0);
                if (var13_27 >= 0) {
                    cw.a(var7_11, var8_16[var13_27], 0, 0, var11_25, var6_9, var9_18, var10_19, 0);
                }
            }
        }
        this.Q[var5_6].a(var1_1, this.D, this.B[var4_5 + 1][0], this.B[var4_5 + 1][1], this.A);
        if (this.y[var5_6] <= 0) {
            this.R[var5_6].a(var1_1, this.E, this.B[var4_5 + 2][0], this.B[var4_5 + 2][1], this.A);
        }
        var4_5 += 3;
        ++var5_6;
    }

    // --- Vẽ S nếu cần ---
    if (oq.o == 1 && this.S != null && this.T <= 0) {
        this.S.a(var1_1, this.F, this.B[5][0], this.B[5][1], this.A);
    }

    // --- Vẽ L[0] và L[1] nếu có ---
    int var5_6_c = this.a[1].c();
    if (this.L[0] != null) {
        this.L[0].b(var1_1, this.a[0].n() + this.a[0].p() / 2, this.a[0].o() + this.a[0].q() - 15);
    }
    if (this.L[1] != null) {
        this.L[1].b(var1_1, this.a[1].n() + this.a[1].p() / 2, this.a[1].o() + this.a[1].q() - 15);
    }

    // --- Vẽ H/I và a[0]/a[1] theo trạng thái ---
    if (var5_6_c == 2 || var5_6_c == 5 || var5_6_c == 1) {
        int var7_12 = 0;
        while (var7_12 < this.H.length) {
            if (this.a[0] != this.H[var7_12]) {
                this.H[var7_12].a(var1_1, var2_2, var3_3);
            }
            ++var7_12;
        }
        this.a[0].a(var1_1);
        var7_12 = 0;
        while (var7_12 < this.I.length) {
            if (this.a[1] != this.I[var7_12]) {
                this.I[var7_12].a(var1_1, var2_2, var3_3);
            }
            ++var7_12;
        }
        this.a[1].a(var1_1);
    } else {
        int var7_12 = 0;
        while (var7_12 < this.I.length) {
            if (this.a[1] != this.I[var7_12]) {
                this.I[var7_12].a(var1_1, var2_2, var3_3);
            }
            ++var7_12;
        }
        this.a[1].a(var1_1);
        var7_12 = 0;
        while (var7_12 < this.H.length) {
            if (this.a[0] != this.H[var7_12]) {
                this.H[var7_12].a(var1_1, var2_2, var3_3);
            }
            ++var7_12;
        }
        this.a[0].a(var1_1);
    }

    // --- Vẽ L[0] và L[1] với phương thức c ---
    if (this.L[0] != null) {
        this.L[0].c(var1_1, this.H[0].n() + this.H[0].p() / 2, this.H[0].o() + this.H[0].q() - 15);
    }
    if (this.L[1] != null) {
        this.L[1].c(var1_1, this.H[1].n() + this.H[1].p() / 2, this.H[1].o() + this.H[1].q() - 15);
    }

    // --- Hiệu ứng j nếu có ---
    if (this.h > 0 && this.h <= 10) {
        int[] var7_13 = this.g == 0 ? this.B[6] : this.B[9];
        if (this.h <= 6 && !this.b.a) {
            int var8_17 = this.j.getWidth() / 5;
            int var9_18 = this.j.getHeight();
            int var5_6_j = (6 - this.h) % 5;
            int var10_19 = (this.g == 0) ? 2 : 0;
            var1_1.drawRegion(this.j, var5_6_j * var8_17, 0, var8_17, var9_18, var10_19,
                var7_13[0] + var7_13[2] / 2, var7_13[1] + var7_13[3] / 2, 3);
        }
    }

    // --- Vẽ các đối tượng v và u ---
    int var7_14 = this.v.length - 1;
    while (var7_14 >= 0) {
        this.v[var7_14].a(var1_1);
        --var7_14;
    }
    var7_14 = this.u.length - 1;
    while (var7_14 >= 0) {
        this.u[var7_14].a(var1_1);
        --var7_14;
    }
}

    public final void b(int n) {
        this.a[0].a(0);
    }

    public final void i() {
        Object object;
        int n;
        int n2 = 0;
        while (n2 < this.H.length) {
            this.H[n2].i();
            ++n2;
        }
        n2 = 0;
        while (n2 < this.I.length) {
            this.I[n2].i();
            ++n2;
        }
        if (this.L[0] != null) {
            this.L[0].i();
        }
        if (this.L[1] != null) {
            this.L[1].i();
        }
        if (!this.s) {
            ++this.t;
            if (this.t == 10) {
                this.t = 0;
            }
            if (this.d < 20) {
                ++this.d;
            }
        }
        if (this.h > 0) {
            --this.h;
            if (this.h == 9) {
                if (!this.U && this.a[this.g].c() != 3) {
                    this.a[this.g].a(this.b.a, this.b.f);
                }
                if (!this.b.a && this.g == 0) {
                    ag.a().b(250);
                }
            } else if (this.h == 15) {
                if (this.b.c) {
                    n = 0;
                    object = this.b;
                    this.b.c = n;
                    ag.a().a(20);
                }
            } else if (this.h == 0) {
                this.U = this.i > 0;
                this.h = this.i;
                this.i = 0;
            }
        }
        n2 = 0;
        while (n2 < this.G.length) {
            if (this.y[n2] > 0) {
                int n3 = n2;
                this.y[n3] = this.y[n3] - 1;
            } else if (this.G[n2][0].p()) {
                this.y[n2] = 1;
            }
            int n4 = n2;
            this.M[n4] = this.M[n4] + 1;
            if (this.M[n2] > 2) {
                this.M[n2] = 0;
            }
            if (this.g == n2 && this.w > 0) {
                --this.w;
            } else {
                this.P[n2].a();
                this.Q[n2].a();
                this.R[n2].a();
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < this.z.length) {
            lg lg2 = this.G[n2][this.N[n2]];
            if (0 <= this.G[n2][this.N[n2]].k()) {
                int n5 = n2;
                this.z[n5] = this.z[n5] + 1;
                if (this.z[n2] > 1) {
                    this.z[n2] = 0;
                }
            }
            ++n2;
        }
        n2 = this.u.length - 1;
        while (n2 >= 0) {
            this.u[n2].i();
            --n2;
        }
        n2 = this.v.length - 1;
        while (n2 >= 0) {
            this.v[n2].i();
            --n2;
        }
        if (this.x > 0) {
            --this.x;
        }
        if (this.S != null) {
            n2 = com.mg.sq.a.k == 0 ? this.E.getWidth() : this.E.getHeight();
            int n6 = (int)(this.c.g() * (long)n2 / (long)this.b.g);
            if (n6 <= 0) {
                n6 = 1;
            } else if (n6 > n2) {
                n6 = n2;
            }
            n = n6;
            object = this.S;
            this.S.b = n;
            if (this.V > 0) {
                --this.V;
                if (this.V == 0) {
                    this.T = 0;
                    return;
                }
                if (this.T > 0) {
                    --this.T;
                    return;
                }
                this.T = 1;
                return;
            }
            if (this.T > 0) {
                --this.T;
                return;
            }
            if (n6 == n2) {
                this.T = 1;
            }
        }
    }

    public final void c(int n) {
        if (this.w == 0) {
            this.w = n;
            return;
        }
        if (this.w < n) {
            this.w = this.w + n >> 1;
        }
    }

    public final void a(int n, int n2) {
        lg lg2 = this.G[n][this.N[0]];
        int n3 = n = n == 0 ? 1 : 4;
        if (this.A == 0) {
            int n4 = this.B[n][0] + this.C[0].getWidth() * lg2.n() / lg2.o();
            n = this.B[n][1] + this.B[n][3] / 2;
            int n5 = 0;
            while (n5 < this.v.length) {
                if (!this.v[n5].m()) {
                    this.v[n5].a(n4, n, n4 - 5 + cv.a(80), n + cv.a() % 100, 10);
                    this.v[n5].a(cv.a(10));
                }
                ++n5;
            }
            return;
        }
        int n6 = this.B[n][0] + this.B[n][2] / 2;
        n = this.B[n][1] + (lg2.o() - lg2.n()) * this.D.getHeight() / lg2.o();
        int n7 = 0;
        while (n7 < this.v.length) {
            if (!this.v[n7].m()) {
                this.v[n7].a(n6, n, n6 + cv.a() % 100, n + 5 - cv.a(80), 10);
                this.v[n7].a(cv.a(10));
            }
            ++n7;
        }
    }

    public final void a(int n, int n2, boolean bl) {
        this.U = bl;
        this.c(this.w);
        lg lg2 = this.G[n][this.N[n]];
        if (this.h <= 0) {
            this.h = n2;
        }
        if (this.h < n2) {
            this.i = n2 - this.h;
            if (this.i < 6) {
                this.i = 0;
            }
        } else {
            this.i = this.h - n2;
            this.h = n2;
        }
        if ((n2 -= 5) < 0) {
            n2 = 0;
        }
        this.g = n;
        int n3 = n == 0 ? 0 : 3;
        int n4 = 15;
        if (this.A == 0) {
            int n5 = this.B[n3][0] + this.C[0].getWidth() * lg2.m() / lg2.l();
            int n6 = this.B[n3][1] + this.B[n3][3] / 2;
            n3 = 0;
            while (n3 < this.u.length) {
                if (!this.u[n3].m()) {
                    this.u[n3].a(n5, n6, n5 - 5 + cv.a(80), n6 + cv.a() % 100, n2);
                    this.u[n3].a(cv.a(10));
                    if (--n4 <= 0) break;
                }
                ++n3;
            }
        } else {
            int n7 = this.B[n3][0] + this.B[n3][2] / 2;
            int n8 = this.B[n3][1] + (lg2.l() - lg2.m()) * this.C[0].getHeight() / lg2.l();
            n3 = 0;
            while (n3 < this.u.length) {
                if (!this.u[n3].m()) {
                    this.u[n3].a(n7, n8, n7 + cv.a() % 100, n8 + 5 - cv.a(80), n2);
                    this.u[n3].a(cv.a(10));
                    if (--n4 <= 0) break;
                }
                ++n3;
            }
        }
        if (bl) {
            if (n == 1) {
                this.a[0].a(n2, this.b.a, this.b.c, this.b.d, this.b.e, this.b.f);
            } else {
                this.a[1].a(n2, this.b.a, this.b.c, this.b.d, this.b.e, this.b.f);
            }
            n2 = 0;
            ms ms2 = this.b;
            this.b.c = n2;
            this.b.d = false;
        }
    }

    public final void d(int n) {
        if (this.k != n) {
            this.d = 0;
        }
        this.k = n;
    }

    public final void a(boolean bl) {
        this.s = bl;
    }

    public final void l(int n) {
        if (n == 0) {
            n = 0;
            while (n < this.H.length) {
                this.H[n].d();
                ++n;
            }
            return;
        }
        n = 0;
        while (n < this.I.length) {
            this.I[n].d();
            ++n;
        }
    }

    public final void a(int n, int n2, int n3, String string, int n4) {
        try {
            int n5;
            int n6 = 0;
            int n7 = 0;
            while (n7 < this.J.length) {
                if (this.J[n7].equals(string)) {
                    n6 = 1;
                    break;
                }
                ++n7;
            }
            if (n6 == 0) {
                return;
            }
            lg lg2 = null;
            n6 = 0;
            int n8 = 0;
            while (n8 < this.G.length) {
                n5 = 0;
                while (n5 < this.G[n8].length) {
                    if (this.G[n8][n5].j().equals(string)) {
                        lg2 = this.G[n8][n5];
                        n6 = n8;
                        break;
                    }
                    ++n5;
                }
                ++n8;
            }
            if (lg2 == null) {
                return;
            }
            if (n >= 0) {
                n8 = lg2.m();
                n5 = lg2.l();
                this.P[n6].a(n8, n, n5, n4);
            }
            if (n2 >= 0) {
                n8 = lg2.n();
                n5 = lg2.o();
                this.Q[n6].a(n8, n2, n5, n4);
            }
            if (n3 >= 0) {
                n8 = lg2.q();
                n5 = lg2.r();
                this.R[n6].a(n8, n3, n5, n4);
            }
            n2 = n4;
            mi mi2 = this.P[n6];
            this.P[n6].c = n2;
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public final void j() {
        this.V = 15;
    }
}
