package com.mg.bas;
// Decompiled with: Procyon 0.6.0
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class mx extends at
{
    private int d;
    private int[] e;
    private int[] f;
    private int g;
    private int h;
    private int i;
    private Image j;
    private int k;
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
    private int[] N;
    private int[] O;
    private mi[] P;
    private mi[] Q;
    private mi[] R;
    private mi S;
    public np c;
    private int T;
    private boolean U;
    private int V;
    
    public mx(final ms b, k k, final byte a, int i, int n) {
        super();
        this.e = new int[] { 81208, 85576, 23637 };
        this.f = new int[] { 5046585, 6095173, 7209297 };
        this.k = 0;
        this.N = new int[2];
        this.O = new int[2];
        this.b = b;
        this.G = b.a();
        this.K = k;
        this.y = new int[2];
        try {
            this.a = new nk[2];
            this.J = new String[2];
            this.H = new nk[this.G[0].length];
            this.I = new nk[this.G[1].length];
            for (int j = 0; j < this.H.length; ++j) {
                this.H[j] = b(this.G[0][j].a(), 0);
            }
            for (int l = 0; l < this.I.length; ++l) {
                try {
                    this.I[l] = ((this.G[1][l].b() && this.G[1][l].a().Y > 0) ? this.a(this.G[1][l].a(), 1) : b(this.G[1][l].a(), 1));
                } catch (final Exception ex) {
                    ex.printStackTrace();
                    System.err.println(this.G[1][l]);
                }
            }
            this.a[0] = this.H[0];
            this.a[1] = this.I[0];
        } catch (final Exception ex2) {
            ex2.printStackTrace();
        }
        this.j = mp.a().f;
        this.A = a;
        this.c(i, n);
        if (a == 0) {
            this.c(false);
            this.B = new int[][] { { 10, 233, this.C[0].getWidth(), this.C[0].getHeight() }, { 10, 240, this.D.getWidth(), this.D.getHeight() }, { 10, 247, this.E.getWidth(), this.E.getHeight() }, { 154, 233, this.C[0].getWidth(), this.C[0].getHeight() }, { 154, 240, this.D.getWidth(), this.D.getHeight() }, { 154, 247, this.E.getWidth(), this.E.getHeight() }, { 50, 316, this.H[0].p(), this.H[0].q() }, { 20, 316, this.H[0].p(), this.H[0].q() }, { 0, 316, this.H[0].p(), this.H[0].q() }, { 200, 316, this.I[0].p(), this.I[0].q() }, { 230, 316, this.I[0].p(), this.I[0].q() }, { 240, 316, this.I[0].p(), this.I[0].q() } };
            if (this.G[0].length == 3) {
                final int[] array = this.B[6];
                final int n2 = 1;
                array[n2] += 5;
                final int[] array2 = this.B[7];
                final int n3 = 1;
                array2[n3] -= 5;
                final int[] array3 = this.B[8];
                final int n4 = 1;
                array3[n4] += 5;
            }
            else if (this.G[0].length == 2) {
                final int[] array4 = this.B[7];
                final int n5 = 1;
                array4[n5] += 5;
                final int[] array5 = this.B[8];
                final int n6 = 1;
                array5[n6] -= 5;
            }
            if (this.G[1].length == 3) {
                final int[] array6 = this.B[9];
                final int n7 = 1;
                array6[n7] += 5;
                final int[] array7 = this.B[10];
                final int n8 = 1;
                array7[n8] -= 5;
                final int[] array8 = this.B[11];
                final int n9 = 1;
                array8[n9] += 5;
            }
            else if (this.G[1].length == 2) {
                final int[] array9 = this.B[10];
                final int n10 = 1;
                array9[n10] += 5;
                final int[] array10 = this.B[11];
                final int n11 = 1;
                array10[n11] -= 5;
            }
        }
        else {
            this.c(true);
            this.B = new int[][] { { 38, 6, this.C[0].getWidth(), this.C[0].getHeight() }, { 31, 6, this.D.getWidth(), this.D.getHeight() }, { 24, 6, this.E.getWidth(), this.E.getHeight() }, { 277, 6, this.C[0].getWidth(), this.C[0].getHeight() }, { 284, 6, this.D.getWidth(), this.D.getHeight() }, { 291, 6, this.E.getWidth(), this.E.getHeight() }, { 75 - this.H[0].p() / 2, 236, this.H[0].p(), this.H[0].q() }, { 35 - this.H[0].p() / 2, 236, this.H[0].p(), this.H[0].q() }, { 15 - this.H[0].p() / 2, 236, this.H[0].p(), this.H[0].q() }, { 280, 236, this.I[0].p(), this.I[0].q() }, { 310, 236, this.I[0].p(), this.I[0].q() }, { 330, 236, this.I[0].p(), this.I[0].q() } };
            if (this.G[0].length == 2) {
                final int[] array11 = this.B[7];
                final int n12 = 1;
                array11[n12] += 4;
                final int[] array12 = this.B[7];
                final int n13 = 0;
                array12[n13] += 10;
                final int[] array13 = this.B[8];
                final int n14 = 1;
                array13[n14] -= 4;
            }
            else if (this.G[0].length == 3) {
                final int[] array14 = this.B[6];
                final int n15 = 1;
                array14[n15] += 4;
                final int[] array15 = this.B[7];
                final int n16 = 1;
                array15[n16] -= 4;
                final int[] array16 = this.B[8];
                final int n17 = 1;
                array16[n17] += 4;
            }
            else {
                final int[] array17 = this.B[8];
                final int n18 = 0;
                array17[n18] += 5;
            }
            if (this.G[1].length == 2) {
                final int[] array18 = this.B[10];
                final int n19 = 1;
                array18[n19] += 4;
                final int[] array19 = this.B[11];
                final int n20 = 1;
                array19[n20] -= 4;
            }
            else if (this.G[1].length == 3) {
                final int[] array20 = this.B[9];
                final int n21 = 1;
                array20[n21] += 4;
                final int[] array21 = this.B[10];
                final int n22 = 1;
                array21[n22] -= 4;
                final int[] array22 = this.B[11];
                final int n23 = 1;
                array22[n23] += 4;
            }
        }
        for (int n24 = 0; n24 < 2; ++n24) {
            this.O[n24] = (this.G[n24].length == 1) ? 2 : 1;
        }
        for (int n25 = 0; n25 < this.B.length; ++n25) {
            final int[] array23 = this.B[n25];
            final int n26 = 0;
            array23[n26] += i;
            final int[] array24 = this.B[n25];
            final int n27 = 1;
            array24[n27] += n;
        }
        if (this.G[1][0].b() && a == 0) {
            final int[] array25 = this.B[9];
            final int n28 = 0;
            array25[n28] += 4;
            final int n29;
            if ((n29 = this.G[1][0].a().Y / 10 % 1000) == 18) {
                final int[] array26 = this.B[9];
                final int n30 = 0;
                array26[n30] += 35;
                final int[] array27 = this.B[10];
                final int n31 = 0;
                array27[n31] += 35;
                final int[] array28 = this.B[11];
                final int n32 = 0;
                array28[n32] += 35;
            }
            else if (n29 == 21 || n29 == 22) {
                final int[] array29 = this.B[9];
                final int n33 = 0;
                array29[n33] += 15;
                final int[] array30 = this.B[10];
                final int n34 = 0;
                array30[n34] += 15;
                final int[] array31 = this.B[11];
                final int n35 = 0;
                array31[n35] += 15;
                final int[] array32 = this.B[9];
                final int n36 = 1;
                array32[n36] += 5;
                final int[] array33 = this.B[10];
                final int n37 = 1;
                array33[n37] += 5;
                final int[] array34 = this.B[11];
                final int n38 = 1;
                array34[n38] += 5;
            }
            else if (n29 >= 63 && n29 <= 78) {
                final int[] array35 = this.B[9];
                final int n39 = 1;
                array35[n39] += 5;
                final int[] array36 = this.B[10];
                final int n40 = 1;
                array36[n40] += 5;
                final int[] array37 = this.B[11];
                final int n41 = 1;
                array37[n41] += 5;
            }
            else if (n29 == 25) {
                final int[] array38 = this.B[9];
                final int n42 = 1;
                ++array38[n42];
                final int[] array39 = this.B[10];
                final int n43 = 1;
                ++array39[n43];
                final int[] array40 = this.B[11];
                final int n44 = 1;
                ++array40[n44];
            }
            else if (n29 == 26) {
                final int[] array41 = this.B[9];
                final int n45 = 1;
                array41[n45] += 3;
                final int[] array42 = this.B[10];
                final int n46 = 1;
                array42[n46] += 3;
                final int[] array43 = this.B[11];
                final int n47 = 1;
                array43[n47] += 3;
            }
            else if (n29 == 27) {
                final int[] array44 = this.B[9];
                final int n48 = 1;
                array44[n48] += 5;
                final int[] array45 = this.B[10];
                final int n49 = 1;
                array45[n49] += 5;
                final int[] array46 = this.B[11];
                final int n50 = 1;
                array46[n50] += 5;
            }
        }
        String[] array47;
        for (array47 = new String[this.G[0].length], i = 0; i < array47.length; ++i) {
            array47[i] = this.G[0][i].j();
        }
        this.a(array47, 0);
        String[] array48;
        for (array48 = new String[this.G[1].length], i = 0; i < array48.length; ++i) {
            array48[i] = this.G[1][i].j();
        }
        this.a(array48, 1);
        final byte[][] array49 = { { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5 } };
        this.u = new nc[25];
        final int n51 = mp.a().b.getWidth() / 6;
        n = mp.a().b.getHeight() / 9;
        final int n52 = 1 * n;
        for (int n53 = 0; n53 < this.u.length; ++n53) {
            (this.u[n53] = new nc(mp.a().b, n51, n, n52)).a(array49);
            this.u[n53].b(false);
        }
        final int n54 = 2 * n;
        this.v = new nc[10];
        for (int n55 = 0; n55 < this.v.length; ++n55) {
            (this.v[n55] = new nc(mp.a().b, n51, n, n54)).a(array49);
            this.v[n55].b(false);
        }
        this.z = new int[2];
        this.y = new int[2];
        this.M = new int[2];
        this.L = new ir[2];
        int n56;
        if (a == 0) {
            n56 = this.C[0].getWidth();
        }
        else {
            n56 = this.C[0].getHeight();
        }
        this.P = new mi[2];
        for (int n57 = 0; n57 < this.P.length; ++n57) {
            (this.P[n57] = new mi(n56, this.G[n57][0].l())).a(0, this.G[n57][0].m(), this.G[n57][0].l(), this.G[n57][0].d());
        }
        int n58;
        if (a == 0) {
            n58 = this.D.getWidth();
        }
        else {
            n58 = this.D.getHeight();
        }
        this.Q = new mi[2];
        for (int n59 = 0; n59 < this.Q.length; ++n59) {
            (this.Q[n59] = new mi(n58, this.G[n59][0].o())).a(0, this.G[n59][0].n(), this.G[n59][0].o(), 0);
        }
        int n60;
        if (a == 0) {
            n60 = this.E.getWidth();
        }
        else {
            n60 = this.E.getHeight();
        }
        this.R = new mi[2];
        for (int n61 = 0; n61 < this.R.length; ++n61) {
            (this.R[n61] = new mi(n60, this.G[n61][0].r())).a(0, this.G[n61][0].q(), this.G[n61][0].r(), 0);
        }
        if (oq.o == 1) {
            this.S = new mi(n60, b.g);
            this.S.b = 1;
            (this.c = new np()).a();
        }
    }
    
    private void a(final String[] array, final int n) {
        if (n == 0) {
            for (int i = 0; i < array.length; ++i) {
                for (int j = 0; j < this.G[n].length; ++j) {
                    if (array[i].equals(this.G[n][j].j())) {
                        this.H[j].c(this.B[6 + this.O[n] + i][0], this.B[6 + this.O[n] + i][1]);
                        if (i == 0) {
                            this.a[n] = this.H[j];
                            this.J[n] = array[i];
                            this.N[n] = j;
                        }
                    }
                }
            }
        }
        else {
            for (int k = 0; k < array.length; ++k) {
                for (int l = 0; l < this.G[n].length; ++l) {
                    if (array[k].equals(this.G[n][l].j())) {
                        this.I[l].c(this.B[9 + this.O[n] + k][0] - this.I[l].p(), this.B[9 + this.O[n] + k][1]);
                        if (k == 0) {
                            this.a[n] = this.I[l];
                            this.J[n] = array[k];
                            this.N[n] = l;
                        }
                    }
                }
            }
        }
        this.a[0].a(this.a[1]);
        this.a[1].a(this.a[0]);
    }
    
    private static Image m(final int n) {
        return pa.a().a(n, false);
    }
    
    private nk a(final lh lh, final int n) {
        final int y;
        final Image m = m((y = lh.Y) + 5);
        final Image i = m(y + 1);
        final Image j = m(y + 4);
        final Image k;
        final Image image = k = m(y + 3);
        final Image l = m(y + 6);
        final int n2;
        if ((n2 = y / 10 % 1000) == 0 || n2 == 19 || n2 == 20 || n2 == 21) {
            return new ng(1, new Image[] { m, i, j, image, k }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, new byte[1], new byte[8], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 3, 2, 1, 1, 1 });
        }
        if (n2 == 2 || n2 == 3 || n2 == 7) {
            final ng ng;
            (ng = new ng(1, new Image[] { m, i, j, image, k }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, new byte[1], new byte[8], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 3, 4, 1, 1, 1 })).d = 20;
            ng.e = -5;
            return ng;
        }
        if (n2 >= 63 && n2 <= 78) {
            final ng ng2;
            (ng2 = new ng(1, new Image[] { m, i, j, image, k }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, new byte[1], new byte[8], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 3, 4, 1, 1, 1 })).d = 20;
            ng2.e = -8;
            return ng2;
        }
        if (n2 == 1 || n2 == 14 || n2 == 16) {
            return new ng(1, new Image[] { m, i, j, image, k }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 1, 1 }, new byte[1], new byte[8], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 2, 2, 1, 1, 1 });
        }
        if (n2 == 4 || n2 == 12) {
            return new ng(1, new Image[] { m, i, j, image, k }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, new byte[1], new byte[8], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 2, 2, 1, 1, 1 });
        }
        if (n2 == 5 || n2 == 11) {
            final ng ng3;
            (ng3 = new ng(1, new Image[] { m, i, j, image, k }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, new byte[1], new byte[8], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 2, 2, 1, 1, 1 })).d = 20;
            ng3.e = 0;
            return ng3;
        }
        if (n2 == 6) {
            final ng ng4;
            (ng4 = new ng(1, new Image[] { m, i, j, image, k }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 2, 2 }, new byte[1], new byte[10], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 2, 3, 1, 1, 1 })).d = 30;
            return ng4;
        }
        if (n2 == 17 || n2 == 61) {
            final nn nn;
            (nn = new nn(1, new Image[] { m, i, m, image, k }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, new byte[1], { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, new byte[8], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 2, 1, 2, 1, 1 }, l, new byte[][] { { 0, 0, 0, 0, 1, 1 }, { 2, 2, 3, 3, 3 }, { -1 } }, 4)).b = -27;
            nn.a = 42;
            return nn;
        }
        if (n2 == 8) {
            final nn nn2;
            (nn2 = new nn(1, new Image[] { m, i, m, image, k }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, new byte[4], { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, new byte[8], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 2, 1, 2, 1, 2 }, l, new byte[][] { { 0, 1, 1, 2, 2 }, new byte[3], { -1 } }, 4)).b = 0;
            nn2.a = 60;
            return nn2;
        }
        if (n2 == 10) {
            final nn nn3;
            (nn3 = new nn(1, new Image[] { m, i, m, image, k }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, new byte[8], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 2, 2, 2, 1, 1 }, l, new byte[][] { { 0, 0, 1, 1 }, { 2, 2, 3, 3, 3 }, { -1 } }, 4)).b = 35;
            nn3.a = 20;
            return nn3;
        }
        if (n2 == 13) {
            final nn nn4;
            (nn4 = new nn(1, new Image[] { m, i, m, image, k }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, new byte[8], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 2, 2, 2, 1, 1 }, l, new byte[][] { { -1 }, { 0, 0, 1, 1, 2, 2, 3, 3 }, { -1 } }, 4)).b = -25;
            nn4.a = 0;
            return nn4;
        }
        if (n2 == 9 || n2 == 15) {
            final nn nn5;
            (nn5 = new nn(1, new Image[] { m, i, m, image, k }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, new byte[1], { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, new byte[8], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 2, 1, 2, 1, 1 }, l, new byte[][] { { 0, 0, 1, 1 }, { 2, 2, 2 }, { -1 } }, 3)).b = 0;
            nn5.a = 80;
            return nn5;
        }
        if (n2 == 18) {
            final nn nn6;
            (nn6 = new nn(1, new Image[] { m, i, m, image, k }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, new byte[8], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 2, 2, 2, 1, 1 }, l, new byte[][] { { 0, 0, 1, 1 }, { 2, 2, 2 }, { -1 } }, 3)).b = -15;
            nn6.a = 10;
            return nn6;
        }
        if (n2 == 22 || n2 == 51) {
            final nn nn7 = new nn(1, new Image[] { m, i, m, image, k }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, new byte[8], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 2, 2, 2, 1, 1 }, l, new byte[][] { { 0, 0, 1, 2, 2 }, { 3, 3, 3 }, { -1 } }, 4);
            if (n2 == 22) {
                nn7.b = -25;
            }
            else {
                nn7.b = -15;
            }
            nn7.a = 50;
            return nn7;
        }
        if (n2 == 43) {
            final nn nn8;
            (nn8 = new nn(1, new Image[] { m, i, m, image, k }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, new byte[8], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 2, 2, 2, 1, 1 }, l, new byte[][] { { 0, 0, 1, 1, 1 }, { 2, 2, 3, 3, 3 }, { -1 } }, 4)).b = 0;
            nn8.a = 50;
            return nn8;
        }
        if (n2 == 47) {
            final nn nn9;
            (nn9 = new nn(1, new Image[] { m, i, m, image, k }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 1, 1, 2, 2, 2 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, new byte[8], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 2, 3, 2, 1, 1 }, l, new byte[][] { new byte[2], { 1, 1, 1, 1 }, { -1 } }, 2)).b = -5;
            nn9.a = 50;
            return nn9;
        }
        if (n2 == 30 || n2 == 31 || n2 == 32) {
            final nn nn10;
            (nn10 = new nn(1, new Image[] { m, i, m, image, k }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { -1 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, new byte[8], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 2, 2, 2, 1, 1 }, l, new byte[][] { { 0, 0, 1, 2, 2 }, { 3, 3, 3, 3, 3 }, { -1 } }, 4)).b = 10;
            nn10.a = 20;
            return nn10;
        }
        if (n2 == 24 || n2 == 33 || n2 == 34) {
            final nn nn11;
            (nn11 = new nn(1, new Image[] { m, i, m, image, k }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, new byte[8], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 2, 2, 2, 1, 1 }, l, new byte[][] { { 0, 0, 1, 2, 2 }, { 3, 3, 3 }, { -1 } }, 4)).b = 0;
            nn11.a = 50;
            return nn11;
        }
        if (n2 == 100) {
            return new nf(1, new Image[] { m, i, i, k, k, i }, new byte[][] { { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1 }, { 3, 3, 4, 4 }, { 0, 0, 0, 1, 1, 2, 2 }, new byte[8], { 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, -1 }, { 5, 5, 5, 6, 7, 8 } }, new int[] { 3, 3, 2, 2, 2, 4 });
        }
        if (n2 == 44 || n2 == 45 || n2 == 46 || n2 == 56 || n2 == 57 || n2 == 58 || n2 == 60 || n2 == 62) {
            final ng ng5 = new ng(1, new Image[] { m, i, j, image, k }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, new byte[1], new byte[8], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 2, 2, 1, 1, 1 });
            if (this.A == 0) {
                ng5.f = 4;
            }
            else {
                ng5.f = 8;
            }
            return ng5;
        }
        if (n2 == 23 || n2 == 25 || n2 == 26 || n2 == 27 || n2 == 28 || n2 == 29 || n2 == 35 || n2 == 36 || n2 == 37 || n2 == 38 || n2 == 39 || n2 == 40 || n2 == 41 || n2 == 42 || n2 == 48 || n2 == 49 || n2 == 50 || n2 == 52 || n2 == 53 || n2 == 54 || n2 == 55) {
            return new ng(1, new Image[] { m, i, j, image, k }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, new byte[1], new byte[8], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 2, 2, 1, 1, 1 });
        }
        if (n2 == 101) {
            return new ng(1, new Image[] { m, i, j, image, k }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2 }, new byte[4], new byte[8], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 2, 3, 1, 1, 1 });
        }
        if (n2 == 102) {
            return new nn(1, new Image[] { m, i, m, image, k }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 1, 1, 1, 2, 2 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, new byte[8], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 2, 3, 2, 1, 1 }, l, new byte[][] { { 0, 0, 1, 2, 2 }, { 3, 3, 3 }, { -1 } }, 4);
        }
        if (n2 == 103) {
            return new nn(1, new Image[] { m, i, m, image, k }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, new byte[7], { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, new byte[8], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 2, 1, 2, 1, 1 }, l, new byte[][] { { 0, 0, 1, 1, 1 }, { 2, 2, 3, 3 }, { -1 } }, 4);
        }
        if (n2 == 104) {
            return new nn(1, new Image[] { m, i, m, image, k }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2 }, new byte[8], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 3, 2, 3, 1, 1 }, l, new byte[][] { new byte[5], { 1, 1, 2, 2 }, { -1 } }, 3);
        }
        final Image m2 = m(100005);
        final Image m3 = m(100001);
        final Image m4 = m(100004);
        final Image m5 = m(100003);
        final Image m6 = m(100002);
        m(100006);
        return new ng(1, new Image[] { m2, m3, m4, m5, m6 }, new byte[][] { { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 1, 1 }, new byte[1], new byte[8], { 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1 } }, new int[] { 3, 2, 1, 1, 1 });
    }
    
    private static nk b(final lh lh, final int n) {
        try {
            final mb[] a = mb.a(lh);
            final lc a2 = lc.a(lh);
            final nr a3 = nr.a(lh);
            final mg a4;
            (a4 = mb.a(lh, a[0], a[1], a[3], a[2], (boolean)(1 != 0))).a(a2);
            a4.a(a3);
            final mg b;
            (b = mb.b(lh, a[0], a[1], a[3], a[2], (boolean)(1 != 0))).a(a2);
            b.a(a3);
            final mg c;
            (c = mb.c(lh, a[0], a[1], a[3], a[2], (boolean)(1 != 0))).a(a2);
            c.a(a3);
            final mg e;
            (e = mb.e(lh, a[0], a[1], a[3], a[2], (boolean)(1 != 0))).a(a2);
            e.a(a3);
            final mg d;
            (d = mb.d(lh, a[0], a[1], a[3], a[2], (boolean)(1 != 0))).a(a2);
            d.a(a3);
            final mg f;
            (f = mb.f(lh, a[0], a[1], a[3], a[2], (boolean)(1 != 0))).a(a2);
            f.a(a3);
            final mc a5;
            (a5 = mb.a(lh, mp.a().h, a[0], a[1], a[3], a[2], (boolean)(1 != 0))).a(a2);
            a5.a(a3);
            return new ni(n, a4, c, b, e, d, f, a5, a3);
        }
        catch (final Exception ex) {
//            final Throwable t;
            ex.printStackTrace();
            return null;
        }
    }
    
    private void c(final boolean b) {
        final Image d = com.mg.bas.f.d("/play/hpbar");
        final byte[] b2;
        com.mg.bas.h.a(b2 = com.mg.bas.f.b("/play/hpbar"), 100);
        final Image a = com.mg.bas.f.a(b2);
        com.mg.bas.h.a(b2, 150);
        final Image a2 = com.mg.bas.f.a(b2);
        com.mg.bas.h.a(b2, -110);
        final Image a3 = com.mg.bas.f.a(b2);
        com.mg.bas.h.a(b2, -30);
        this.C = new Image[] { d, a, a2, a3, com.mg.bas.f.a(b2) };
        this.D = com.mg.bas.f.d("/play/manabar");
        this.E = com.mg.bas.f.d("/play/powerbar");
        if (b) {
            for (int i = 0; i < this.C.length; ++i) {
                this.C[i] = Image.createImage(this.C[i], 0, 0, this.C[i].getWidth(), this.C[i].getHeight(), 7);
            }
            this.D = Image.createImage(this.D, 0, 0, this.D.getWidth(), this.D.getHeight(), 7);
            this.E = Image.createImage(this.E, 0, 0, this.E.getWidth(), this.E.getHeight(), 7);
        }
        if (oq.o == 1) {
            final byte[] b3;
            com.mg.bas.h.a(b3 = com.mg.bas.f.b("/play/hpbar"), 160);
            this.F = com.mg.bas.f.a(b3);
            if (b) {
                this.F = Image.createImage(this.F, 0, 0, this.F.getWidth(), this.F.getHeight(), 7);
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
        return new int[] { this.a[1].n(), this.a[1].o(), this.a[1].p(), this.a[1].q() };
    }
    
    public final int[] h() {
        return new int[] { this.a[0].n(), this.a[0].o(), this.a[0].p(), this.a[0].q() };
    }
    
    public final nk[] a(final int n) {
        if (n == 0) {
            return this.H;
        }
        return this.I;
    }
    
    public final void a(final Graphics graphics, final int n, final int n2) {
        if (!this.s) {
            int[] array = this.e;
            if (this.k == 1) {
                array = this.f;
            }
            int n3 = 0;
            Label_0076: {
                if (this.d < 10) {
                    if (this.d % 2 != 0) {
                        break Label_0076;
                    }
                }
                else if (this.d < 18) {
                    n3 = (this.d - 3 & 0x3);
                    break Label_0076;
                }
                n3 = 3;
            }
            int n4 = this.K.a - 1;
            int n5 = this.K.b - 1;
            int n6 = this.K.c + 1;
            int n7 = this.K.d + 1;
            final int n8 = n3 - 1;
            for (int i = 0; i < n8; ++i) {
                graphics.setColor(array[i]);
                graphics.drawRect(n4, n5, n6, n7);
                --n4;
                --n5;
                n6 += 2;
                n7 += 2;
            }
            if (n8 >= 0) {
                cw.b(graphics, array[n8], n4, n5, n6 + 1, n7 + 1);
            }
        }
        int n9 = 0;
        for (int j = 0; j < this.G.length; ++j) {
            if (this.P[j].b > 1 || this.M[j] < 2) {
                final mi mi = this.P[j];
                final Image[] c = this.C;
                final int n10 = this.B[n9 + 0][0];
                final int n11 = this.B[n9 + 0][1];
                final byte a = this.A;
                final int n12 = n11;
                final int n13 = n10;
                final Image[] array2 = c;
                final mi mi2 = mi;
                final int c2;
                final int n14 = (c2 = mi.c) - 1;
                if (a == 0) {
                    final int b = mi2.b;
                    final int height = array2[0].getHeight();
                    cw.a(graphics, array2[c2], 0, 0, b, height, n13, n12, 0);
                    if (n14 >= 0) {
                        cw.a(graphics, array2[n14], b, 0, mi2.a - b, height, n13 + b, n12, 0);
                    }
                }
                else {
                    final int b2 = mi2.b;
                    final int width = array2[0].getWidth();
                    final int n15 = array2[0].getHeight() - b2;
                    cw.a(graphics, array2[c2], 0, n15, width, b2, n13, n12 + n15, 0);
                    if (n14 >= 0) {
                        cw.a(graphics, array2[n14], 0, 0, width, n15, n13, n12, 0);
                    }
                }
            }
            this.Q[j].a(graphics, this.D, this.B[n9 + 1][0], this.B[n9 + 1][1], this.A);
            if (this.y[j] <= 0) {
                this.R[j].a(graphics, this.E, this.B[n9 + 2][0], this.B[n9 + 2][1], this.A);
            }
            n9 += 3;
        }
        if (oq.o == 1 && this.S != null && this.T <= 0) {
            this.S.a(graphics, this.F, this.B[5][0], this.B[5][1], this.A);
        }
        final int c3 = this.a[1].c();
        if (this.L[0] != null) {
            this.L[0].b(graphics, this.a[0].n() + this.a[0].p() / 2, this.a[0].o() + this.a[0].q() - 15);
        }
        if (this.L[1] != null) {
            this.L[1].b(graphics, this.a[1].n() + this.a[1].p() / 2, this.a[1].o() + this.a[1].q() - 15);
        }
        if (c3 == 2 || c3 == 5 || c3 == 1) {
            for (int k = 0; k < this.H.length; ++k) {
                if (this.a[0] != this.H[k]) {
                    this.H[k].a(graphics, n, n2);
                }
            }
            this.a[0].a(graphics);
            for (int l = 0; l < this.I.length; ++l) {
                if (this.a[1] != this.I[l]) {
                    this.I[l].a(graphics, n, n2);
                }
            }
            this.a[1].a(graphics);
        }
        else {
            for (int n16 = 0; n16 < this.I.length; ++n16) {
                if (this.a[1] != this.I[n16]) {
                    this.I[n16].a(graphics, n, n2);
                }
            }
            this.a[1].a(graphics);
            for (int n17 = 0; n17 < this.H.length; ++n17) {
                if (this.a[0] != this.H[n17]) {
                    this.H[n17].a(graphics, n, n2);
                }
            }
            this.a[0].a(graphics);
        }
        if (this.L[0] != null) {
            this.L[0].c(graphics, this.H[0].n() + this.H[0].p() / 2, this.H[0].o() + this.H[0].q() - 15);
        }
        if (this.L[1] != null) {
            this.L[1].c(graphics, this.H[1].n() + this.H[1].p() / 2, this.H[1].o() + this.H[1].q() - 15);
        }
        if (this.h > 0 && this.h <= 10) {
            final int[] array3 = (this.g == 0) ? this.B[6] : this.B[9];
            if (this.h <= 6 && !this.b.a) {
                final int n18 = this.j.getWidth() / 5;
                final int height2 = this.j.getHeight();
                final int n19 = (6 - this.h) % 5;
                int n20 = 2;
                if (this.g == 0) {
                    n20 = 0;
                }
                graphics.drawRegion(this.j, n19 * n18, 0, n18, height2, n20, array3[0] + array3[2] / 2, array3[1] + array3[3] / 2, 3);
            }
        }
        for (int n21 = this.v.length - 1; n21 >= 0; --n21) {
            this.v[n21].a(graphics);
        }
        for (int n22 = this.u.length - 1; n22 >= 0; --n22) {
            this.u[n22].a(graphics);
        }
    }
    
    public final void b(final int n) {
        this.a[0].a(0);
    }
    
    public final void i() {
        for (int i = 0; i < this.H.length; ++i) {
            this.H[i].i();
        }
        for (int j = 0; j < this.I.length; ++j) {
            this.I[j].i();
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
            }
            else if (this.h == 15) {
                if (this.b.c) {
                    this.b.c = false;
                    ag.a().a(20);
                }
            }
            else if (this.h == 0) {
                if (this.i > 0) {
                    this.U = true;
                }
                else {
                    this.U = false;
                }
                this.h = this.i;
                this.i = 0;
            }
        }
        for (int k = 0; k < this.G.length; ++k) {
            if (this.y[k] > 0) {
                final int[] y = this.y;
                final int n = k;
                --y[n];
            }
            else if (this.G[k][0].p()) {
                this.y[k] = 1;
            }
            final int[] m = this.M;
            final int n2 = k;
            ++m[n2];
            if (this.M[k] > 2) {
                this.M[k] = 0;
            }
            if (this.g == k && this.w > 0) {
                --this.w;
            }
            else {
                this.P[k].a();
                this.Q[k].a();
                this.R[k].a();
            }
        }
        for (int l = 0; l < this.z.length; ++l) {
            final lg lg = this.G[l][this.N[l]];
            if (0 <= this.G[l][this.N[l]].k()) {
                final int[] z = this.z;
                final int n3 = l;
                ++z[n3];
                if (this.z[l] > 1) {
                    this.z[l] = 0;
                }
            }
        }
        for (int n4 = this.u.length - 1; n4 >= 0; --n4) {
            this.u[n4].i();
        }
        for (int n5 = this.v.length - 1; n5 >= 0; --n5) {
            this.v[n5].i();
        }
        if (this.x > 0) {
            --this.x;
        }
        if (this.S != null) {
            int n6;
            if (com.mg.sq.a.k == 0) {
                n6 = this.E.getWidth();
            }
            else {
                n6 = this.E.getHeight();
            }
            int b;
            if ((b = (int)(this.c.g() * n6 / this.b.g)) <= 0) {
                b = 1;
            }
            else if (b > n6) {
                b = n6;
            }
            this.S.b = b;
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
            }
            else {
                if (this.T > 0) {
                    --this.T;
                    return;
                }
                if (b == n6) {
                    this.T = 1;
                }
            }
        }
    }
    
    public final void c(final int w) {
        if (this.w == 0) {
            this.w = w;
            return;
        }
        if (this.w < w) {
            this.w = this.w + w >> 1;
        }
    }
    
    public final void a(int n, int i) {
        final lg lg = this.G[n][this.N[0]];
        n = ((n == 0) ? 1 : 4);
        if (this.A == 0) {
            final int n2 = this.B[n][0] + this.C[0].getWidth() * lg.n() / lg.o();
            n = this.B[n][1] + this.B[n][3] / 2;
            for (i = 0; i < this.v.length; ++i) {
                if (!this.v[i].m()) {
                    this.v[i].a(n2, n, n2 - 5 + cv.a(80), n + cv.a() % 100, 10);
                    this.v[i].a(cv.a(10));
                }
            }
            return;
        }
        final int n3 = this.B[n][0] + this.B[n][2] / 2;
        n = this.B[n][1] + (lg.o() - lg.n()) * this.D.getHeight() / lg.o();
        for (i = 0; i < this.v.length; ++i) {
            if (!this.v[i].m()) {
                this.v[i].a(n3, n, n3 + cv.a() % 100, n + 5 - cv.a(80), 10);
                this.v[i].a(cv.a(10));
            }
        }
    }
    
    public final void a(final int g, int c, final boolean u) {
        this.U = u;
        this.c(this.w);
        final lg lg = this.G[g][this.N[g]];
        if (this.h <= 0) {
            this.h = c;
        }
        if (this.h < c) {
            this.i = c - this.h;
            if (this.i < 6) {
                this.i = 0;
            }
        }
        else {
            this.i = this.h - c;
            this.h = c;
        }
        c -= 5;
        if (c < 0) {
            c = 0;
        }
        this.g = g;
        final int n = (g == 0) ? 0 : 3;
        int n2 = 15;
        if (this.A == 0) {
            final int n3 = this.B[n][0] + this.C[0].getWidth() * lg.m() / lg.l();
            final int n4 = this.B[n][1] + this.B[n][3] / 2;
            for (int i = 0; i < this.u.length; ++i) {
                if (!this.u[i].m()) {
                    this.u[i].a(n3, n4, n3 - 5 + cv.a(80), n4 + cv.a() % 100, c);
                    this.u[i].a(cv.a(10));
                    if (--n2 <= 0) {
                        break;
                    }
                }
            }
        }
        else {
            final int n5 = this.B[n][0] + this.B[n][2] / 2;
            final int n6 = this.B[n][1] + (lg.l() - lg.m()) * this.C[0].getHeight() / lg.l();
            for (int j = 0; j < this.u.length; ++j) {
                if (!this.u[j].m()) {
                    this.u[j].a(n5, n6, n5 + cv.a() % 100, n6 + 5 - cv.a(80), c);
                    this.u[j].a(cv.a(10));
                    if (--n2 <= 0) {
                        break;
                    }
                }
            }
        }
        if (u) {
            if (g == 1) {
                this.a[0].a(c, this.b.a, this.b.c, this.b.d, this.b.e, this.b.f);
            }
            else {
                this.a[1].a(c, this.b.a, this.b.c, this.b.d, this.b.e, this.b.f);
            }
            final ms b = this.b;
            c = 0;
            b.c = (c != 0);
            this.b.d = false;
        }
    }
    
    public final void d(final int k) {
        if (this.k != k) {
            this.d = 0;
        }
        this.k = k;
    }
    
    public final void a(final boolean s) {
        this.s = s;
    }
    
    public final void l(int i) {
        if (i == 0) {
            for (i = 0; i < this.H.length; ++i) {
                this.H[i].d();
            }
            return;
        }
        for (i = 0; i < this.I.length; ++i) {
            this.I[i].d();
        }
    }
    
    public final void a(final int n, int c, final int n2, final String s, final int n3) {
        try {
            boolean b = false;
            for (int i = 0; i < this.J.length; ++i) {
                if (this.J[i].equals(s)) {
                    b = true;
                    break;
                }
            }
            if (!b) {
                return;
            }
            lg lg = null;
            int n4 = 0;
            for (int j = 0; j < this.G.length; ++j) {
                for (int k = 0; k < this.G[j].length; ++k) {
                    if (this.G[j][k].j().equals(s)) {
                        lg = this.G[j][k];
                        n4 = j;
                        break;
                    }
                }
            }
            if (lg == null) {
                return;
            }
            if (n >= 0) {
                this.P[n4].a(lg.m(), n, lg.l(), n3);
            }
            if (c >= 0) {
                this.Q[n4].a(lg.n(), c, lg.o(), n3);
            }
            if (n2 >= 0) {
                this.R[n4].a(lg.q(), n2, lg.r(), n3);
            }
            final mi mi = this.P[n4];
            c = n3;
            mi.c = c;
        }
        catch (final Exception ex) {
//            final Throwable t;
            ex.printStackTrace();
        }
    }
    
    public final void j() {
        this.V = 15;
    }
}
