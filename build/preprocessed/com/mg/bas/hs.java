package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class hs
extends al
implements bf {
    private k u;
    private cu v = null;
    private cu w;
    private k x;
    private k y;
    private k z;
    private cu A;
    private cu B;
    private cu C;
    private cu D;
    private cu E;
    public static int k;
    public static int l;
    public static int m;
    public static int n;
    public static int o;
    public static int[] p;
    public static int[] q;
    public static boolean r;
    public static int s;
    public static int t;
    private int F = 75;
    private int G;
    private lh H;
    private Image I;
    private Image J;
    private Image K;
    private int L;
    private int M;
    private int N = 3;
    private String O = null;
    private boolean P;
    private String Q;
    private int R;
    private int S;
    private az T = null;
    private boolean U = true;
    private hj V;
    private hj W;
    private hj X;
    private cp Y;
    private boolean Z = true;
    private int[] aa = new int[]{7930113, 12386818, 13894146, 0xFD0D0D, 0xFD0D0D, 12911106, 12911106, 10289666, 10289666, 9372162, 9372162, 9372162, 9372162, 9372162};
    private int[] ab = new int[]{227841, 375554, 381954, 719882, 719882, 377602, 377602, 3710992, 236033, 236033, 231937, 231937, 231937, 231937};
    private int[] ac = new int[]{14067456, 15579392, 15579392, 16765211, 16765211, 14593280, 14593280, 12095488, 12095488, 12095488, 11109376, 11109376, 11109376, 11109376};
    private Image ad = null;

    static {
        l = 1;
    }

    public hs(int n, lh lh2) {
        super(1);
        this.a(this);
        this.a(new ba());
        this.u = new k(this.f - 184 >> 1, this.g - 186 >> 1, 184, 186);
        this.v = new cu(8, 7);
        this.w = new cu(42, 5);
        this.y = new k(30, 27, 144, 15);
        this.x = new k(30, this.y.b + this.y.d + 4, 144, 15);
        this.z = new k(30, this.x.b + this.x.d + 4, 144, 15);
        this.F = this.z.b + this.z.d + 8;
        this.A = new cu(8, this.F + 4 + 2);
        this.C = new cu(19, this.A.b + 19 + 7);
        this.D = new cu(19, this.C.b + 19);
        this.B = new cu(8, this.D.b + 10);
        this.E = new cu(19, this.B.b + 19 + 10);
        this.I = f.d("/info/gold");
        this.K = f.d("/info/heart");
        this.J = f.d("/info/expicon");
        this.u.d = this.E.b + this.J.getHeight() + 8;
        this.u.b = this.g - this.u.d >> 1;
        this.H = lh2;
        this.G = 0;
        if (!r) {
            this.O = "Điểm Phạt";
            this.P = true;
            this.Q = " - ";
        } else {
            this.P = false;
            this.O = "Thưởng";
            this.Q = "+";
        }
        this.N = (int)(l.a((long)t) * 7L / 100L);
        this.S = l;
        this.L = p[this.G];
        this.M = q[this.G];
        this.b(-241219);
        if (lh2.G > this.S && com.mg.sq.a.t()) {
            this.Y = new cp("lvu");
        }
        if (r) {
            this.ad = f.d("/strwin");
            return;
        }
        this.ad = f.d("/strlose");
    }

    protected final void s() {
        if (this.Y != null) {
            this.Y.a();
        }
    }

    public final void c(Graphics graphics) {
        pc.a(graphics, this.u.a, this.u.b, this.u.c, this.u.d, v.aj, false);
        if (this.ad != null) {
            cw.a(graphics, this.ad, 0, 0, this.ad.getWidth() / 3, this.ad.getHeight(), this.u.a + this.u.c - 5, this.u.b + this.u.d - 5, 40);
        }
        bx.d.c(true);
        bx.d.a(graphics, "Cấp: ", this.v.a + this.u.a, this.v.b + this.u.b, 0);
        int n = this.v.b + bx.d.b();
        bx.d.c(false);
        bx.d.a(graphics, String.valueOf(this.S), this.w.a + this.u.a, (n -= bx.d.b()) + this.u.b, 0);
        pc.a(graphics, this.x.a + this.u.a, this.x.b + this.u.b, this.x.c, this.x.d, 6729912, 16579546);
        pc.a(graphics, this.y.a + this.u.a, this.y.b + this.u.b, this.y.c, this.y.d, 6729912, 16579546);
        pc.a(graphics, this.z.a + this.u.a, this.z.b + this.u.b, this.y.c, this.y.d, 6729912, 16579546);
        pc.a(graphics, this.y, this.H.s * (this.y.c - 2) / this.H.r, this.aa, this.u.a, this.u.b);
        bx.d.a(graphics, String.valueOf(i.a(this.H.s, ".")) + "/" + i.a(this.H.r, "."), this.y.a + (this.y.c >> 1) + this.u.a, this.y.b + this.u.b + 1, 1);
        n = k - this.L;
        int n2 = this.M + 1 - this.L;
        if (n > n2) {
            n = n2;
        }
        pc.a(graphics, this.x, n * (this.x.c - 1) / n2, this.ab, this.u.a, this.u.b);
        n = n * 1000 / n2;
        if (n < 0) {
            n = 0;
        }
        bx.d.a(graphics, String.valueOf(n / 10) + "," + n % 10 + "%", this.x.a + (this.x.c >> 1) + this.u.a, this.x.b + this.u.b + 1, 1);
        graphics.drawImage(this.J, this.x.a - 11 + this.u.a, this.x.b + this.x.d + this.u.b, 33);
        graphics.drawImage(this.K, this.y.a - 11 + this.u.a, this.y.b + this.y.d + this.u.b, 33);
        graphics.drawImage(this.I, this.z.a - 11 + this.u.a, this.z.b + this.z.d + this.u.b, 33);
        n = m * this.z.c / this.H.I;
        if (n > this.z.c) {
            n %= this.z.c;
        }
        pc.a(graphics, this.z, n, this.ac, this.u.a, this.u.b);
        bx.d.a(graphics, String.valueOf(i.a(m, ".")) + "/" + i.a(this.H.I, "."), this.z.a + (this.z.c >> 1) + this.u.a, this.z.b + this.u.b + 1, 1);
        pc.a(graphics, this.u.a + 3, this.u.b + this.F, this.u.c - 6);
        bx.d.c(true);
        bx.d.a(graphics, "Điểm Thu Thập", this.A.a + this.u.a, this.A.b + this.u.b, 0);
        bx.d.c(false);
        graphics.drawImage(this.J, this.D.a + this.u.a, this.D.b + this.u.b, 33);
        String string = hs.n <= 0 ? "   " : this.Q;
        bx.d.a(graphics, String.valueOf(string) + hs.n, this.D.a + 10 + this.u.a, this.D.b + this.u.b - bx.d.a() + 3, 0);
        graphics.drawImage(this.I, this.C.a + this.u.a, this.C.b + this.u.b, 33);
        string = o <= 0 ? "   " : this.Q;
        bx.d.a(graphics, String.valueOf(string) + o, this.C.a + 10 + this.u.a, this.C.b + this.u.b - bx.d.a() + 3, 0);
        bx.d.c(true);
        bx.d.a(graphics, this.O, this.B.a + this.u.a, this.B.b + this.u.b, 0);
        bx.d.c(false);
        graphics.drawImage(this.J, this.E.a + this.u.a, this.E.b + this.u.b, 33);
        string = t <= 0 ? "   " : this.Q;
        bx.d.a(graphics, String.valueOf(string) + t, this.E.a + 10 + this.u.a, this.E.b + this.u.b - bx.d.a() + 3, 0);
        if (this.W != null) {
            this.W.a(graphics, 0, 0);
        }
        if (this.V != null) {
            this.V.a(graphics, 0, 0);
        }
        if (this.X != null) {
            this.X.a(graphics, 0, 0);
        }
    }

    public final void a(az az2) {
        super.a(az2);
        if (this.T == null) {
            this.T = az2;
            super.a((az)null);
        }
    }

    protected final void g() {
        super.g();
        if (this.U) {
            ++this.R;
            if (this.R == 10) {
                this.a(this.T);
                this.U = false;
                this.R = 0;
            }
        } else {
            if (!this.P) {
                int n = this.N = hs.n > 1 ? hs.n / 2 : 1;
                if (hs.n > 0) {
                    k += this.N;
                    if ((hs.n -= this.N) < 0) {
                        k += hs.n;
                        hs.n = 0;
                    }
                    if (k > this.M) {
                        ++this.G;
                        this.L = p[this.G];
                        this.M = q[this.G];
                        ++this.S;
                        if (this.W == null) {
                            this.W = new hj(this.u.a + this.x.a + this.x.c / 2, this.u.b + this.x.b + this.x.d / 2);
                            this.X = new hj(this.w.a + this.u.a, this.v.b + bx.d.b() + this.u.b);
                            this.X.a();
                            this.W.a();
                        }
                    }
                }
                int n2 = this.N = o > 1 ? o / 2 : 1;
                if (o > 0) {
                    m += this.N;
                    if ((o -= this.N) < 0) {
                        m += o;
                        o = 0;
                    }
                }
                if (o <= 0 && hs.n <= 0) {
                    this.P = true;
                }
            } else if (r) {
                int n = this.N = t > 1 ? t / 2 : 1;
                if (t > 0) {
                    k += this.N;
                    if ((t -= this.N) < 0) {
                        k += t;
                        t = 0;
                    }
                    if (k > this.M) {
                        ++this.G;
                        this.L = p[this.G];
                        this.M = q[this.G];
                        ++this.S;
                        if (this.W == null) {
                            this.W = new hj(this.u.a + this.x.a + this.x.c / 2, this.u.b + this.x.b + this.x.d / 2);
                            this.X = new hj(this.w.a + this.u.a, this.v.b + bx.d.b() + this.u.b);
                            this.X.a();
                            this.W.a();
                        }
                    }
                }
                int n3 = this.N = s > 1 ? s / 2 : 1;
                if (s > 0) {
                    m += this.N;
                    if ((s -= this.N) < 0) {
                        m += s;
                        s = 0;
                    }
                }
            } else {
                int n = (int)l.a((long)t);
                int n4 = this.N = n > 1 ? n / 2 : 1;
                if (t < 0) {
                    k -= this.N;
                    if ((t += this.N) > 0) {
                        k += t;
                        t = 0;
                    }
                    if (k <= this.L) {
                        t = 0;
                        k = this.L;
                    }
                }
                int n5 = this.N = (n = (int)l.a((long)s)) > 1 ? n / 2 : 1;
                if (s < 0) {
                    m -= this.N;
                    if ((s += this.N) < 0) {
                        m += s;
                        s = 0;
                    }
                }
            }
            if (m >= this.H.I) {
                m -= this.H.I;
                if (this.V == null) {
                    this.V = new hj(this.u.a + this.z.a + this.z.c / 2, this.u.b + this.z.b + this.z.d / 2);
                    this.V.a();
                }
            }
        }
        if (this.W != null) {
            if (this.Z) {
                if (this.Y != null) {
                    this.Y.b();
                }
                this.Z = false;
            }
            this.W.i();
        }
        if (this.V != null) {
            this.V.i();
        }
        if (this.X != null) {
            this.X.i();
        }
    }

    public final void d(int n, int n2) {
        switch (n2) {
            case 0: {
                o = 0;
                s = 0;
                t = 0;
                hs.n = 0;
                k = 0;
                l = 0;
                ag.b().e(-241219);
            }
        }
    }

    public static void t() {
        p = null;
        q = null;
    }
}
