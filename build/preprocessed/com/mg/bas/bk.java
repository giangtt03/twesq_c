package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

// UI/game menu or dialog component, manages a list of items, rendering, and user interaction. Extends at and implements bf.
public final class bk
extends at
implements bf {
    private static int c = 0;
    private bj[] d;
    public int a;
    private static String e = "OK";
    private static int f;
    private static int g;
    private static int h;
    private static int i;
    public static be b;

    static {
        i = 8160656;
        b = null;
    }

    public static void a(int n) {
        bj.a = 0xFFFFFF;
    }

    public bk(int n) {
        this.b(n);
        bk bk2 = this;
        this.n = v.u;
        bk2.a = v.u - bk2.p;
    }

    private void b(int n) {
        int n2;
        int n3;
        this.m = 0;
        this.o = v.t;
        this.p = v.u / 2;
        if (this.p < 160) {
            this.p = 160;
        }
        this.n = v.u - this.p;
        int n4 = 4;
        int n5 = 8;
        if (v.d != 3) {
            n4 = 2;
            n5 = 4;
        }
        if ((n3 = (this.p - 5 * n5) / 4) > (n2 = (this.o - n4 * 11) / 10) * 5 / 4) {
            n3 = n2 * 5 / 4;
            this.p = 4 * n3 + 5 * n5;
            this.n = v.u - this.p;
        }
        if (n == 0 || n == 1 || n == 2) {
            c = n;
            this.d = new bj[34];
            String string = c == 2 ? "qwertyuiop" : "QWERTYUIOP";
            n2 = (this.o - n4 * 11) / 10;
            int n6 = (this.o - n2 * 10 - n4 * 9) / 2;
            int n7 = 0;
            while (n7 < string.length()) {
                this.d[n7 + 0] = new bj(n6 + n4 * n7 + n7 * n2, n5, n2, n3, "" + string.charAt(n7), string.charAt(n7));
                ++n7;
            }
            int n8 = 0 + string.length();
            string = c == 2 ? "asdfghjkl" : "ASDFGHJKL";
            n7 = 0;
            while (n7 < string.length()) {
                this.d[n8 + n7] = new bj((v.t - n2 * 9 - n4 * 8) / 2 + n4 * n7 + n7 * n2, 2 * n5 + n3, n2, n3, "" + string.charAt(n7), string.charAt(n7));
                ++n7;
            }
            n8 = n8 + string.length() + 1;
            string = c == 2 ? "zxcvbnm" : "ZXCVBNM";
            n6 = (v.t - n2 * 7 - n4 * 6) / 2;
            n7 = 0;
            while (n7 < string.length()) {
                this.d[n8 + n7] = new bj(n6 + n4 * n7 + n7 * n2, 3 * n5 + 2 * n3, n2, n3, "" + string.charAt(n7), string.charAt(n7));
                ++n7;
            }
            if (c == 2) {
                this.d[n8 - 1] = new bj(n4, 3 * n5 + 2 * n3, n6 - 2 * n4, n3, "shift", 0);
            } else if (c == 1) {
                this.d[n8 - 1] = new bj(n4, 3 * n5 + 2 * n3, n6 - 2 * n4, n3, "Shift", 0);
            } else if (c == 0) {
                this.d[n8 - 1] = new bj(n4, 3 * n5 + 2 * n3, n6 - 2 * n4, n3, "SHIFT", 0);
            }
            f = n8 - 1;
            this.d[n8 - 1].a(this, 6);
            this.d[n8 + 7] = new bj(this.o - n4 - this.d[n8 - 1].d, 3 * n5 + 2 * n3, n6 - 2 * n4, n3, "DEL", -8);
            n8 = n8 + string.length() + 1;
            n6 = (v.t - 5 * n2 - 4 * n4) / 2;
            this.d[n8 + 2] = new bj(n6, 4 * n5 + 3 * n3, 4 * n2 + 4 * n4, n3, v.a && v.b ? "Khoảng trắng" : "SpaceBar", 32);
            h = n8 + 2;
            this.d[n8] = new bj(n4, 4 * n5 + 3 * n3, n6 - 3 * n4 - n2, n3, ".?123", 0);
            this.d[n8].a(this, 3);
            this.d[n8 + 1] = new bj(2 * n4 + this.d[n8].d, 4 * n5 + 3 * n3, n2, n3, v.a && v.b ? "Vi" : "En", -3);
            this.d[n8 + 1].a(this, 9);
            g = n8 + 1;
            this.d[n8 + 3] = new bj(this.d[n8 + 2].b + this.d[n8 + 2].d + n4, 4 * n5 + 3 * n3, n2, n3, "<", -3);
            this.d[n8 + 4] = new bj(this.d[n8 + 3].b + this.d[n8 + 3].d + n4, 4 * n5 + 3 * n3, n2, n3, ">", -4);
            this.d[n8 + 5] = new bj(this.d[n8 + 4].b + this.d[n8 + 4].d + n4, 4 * n5 + 3 * n3, n6 - 3 * n4 - n2, n3, e, 0);
            this.d[n8 + 5].a(this, 5);
            return;
        }
        if (n == 3) {
            this.d = new bj[33];
            String string = "1234567890";
            n2 = (this.o - n4 * 11) / 10;
            int n9 = (this.o - n2 * 10 - n4 * 9) / 2;
            int n10 = 0;
            while (n10 < string.length()) {
                this.d[n10 + 0] = new bj(n9 + n4 * n10 + n10 * n2, n5, n2, n3, "" + string.charAt(n10), string.charAt(n10));
                ++n10;
            }
            int n11 = 0 + string.length();
            string = "-/:;()$&@\"";
            n10 = 0;
            while (n10 < string.length()) {
                this.d[n11 + n10] = new bj((v.t - n2 * 10 - n4 * 9) / 2 + n4 * n10 + n10 * n2, 2 * n5 + n3, n2, n3, "" + string.charAt(n10), string.charAt(n10));
                ++n10;
            }
            n11 = n11 + string.length() + 1;
            string = ".,?!'";
            n9 = (v.t - n2 * 7 - 4 * n4) / 2;
            n10 = 0;
            while (n10 < string.length()) {
                this.d[n11 + n10] = new bj(n9 + n4 * n10 + n10 * n2 * 7 / 5, 3 * n5 + 2 * n3, n2 * 7 / 5, n3, "" + string.charAt(n10), string.charAt(n10));
                ++n10;
            }
            this.d[n11 - 1] = new bj(n4, 3 * n5 + 2 * n3, n9 - 2 * n4, n3, "#+=", 0);
            this.d[n11 - 1].a(this, 7);
            f = n11 - 1;
            this.d[n11 + 5] = new bj(this.o - n4 - this.d[n11 - 1].d, 3 * n5 + 2 * n3, n9 - 2 * n4, n3, "DEL", -8);
            n11 = n11 + string.length() + 1;
            n9 = (v.t - 5 * n2 - 4 * n4) / 2;
            this.d[n11 + 2] = new bj(n9, 4 * n5 + 3 * n3, 4 * n2 + 4 * n4, n3, v.a && v.b ? "Khoảng trắng" : "SpaceBar", 32);
            h = n11 + 2;
            this.d[n11] = new bj(n4, 4 * n5 + 3 * n3, n9 - 3 * n4 - n2, n3, "ABC", 0);
            this.d[n11].a(this, 8);
            this.d[n11 + 1] = new bj(2 * n4 + this.d[n11].d, 4 * n5 + 3 * n3, n2, n3, v.a && v.b ? "Vi" : "En", -3);
            this.d[n11 + 1].a(this, 9);
            g = n11 + 1;
            this.d[n11 + 3] = new bj(this.d[n11 + 2].b + this.d[n11 + 2].d + n4, 4 * n5 + 3 * n3, n2, n3, "<", -3);
            this.d[n11 + 4] = new bj(this.d[n11 + 3].b + this.d[n11 + 3].d + n4, 4 * n5 + 3 * n3, n2, n3, ">", -4);
            this.d[n11 + 5] = new bj(this.d[n11 + 4].b + this.d[n11 + 4].d + n4, 4 * n5 + 3 * n3, n9 - 3 * n4 - n2, n3, e, 0);
            this.d[n11 + 5].a(this, 5);
            return;
        }
        if (n == 4) {
            this.d = new bj[33];
            String string = "[]{}#%^*+=";
            n2 = (this.o - n4 * 11) / 10;
            int n12 = (this.o - n2 * 10 - n4 * 9) / 2;
            int n13 = 0;
            while (n13 < string.length()) {
                this.d[n13 + 0] = new bj(n12 + n4 * n13 + n13 * n2, n5, n2, n3, "" + string.charAt(n13), string.charAt(n13));
                ++n13;
            }
            int n14 = 0 + string.length();
            string = "_\\|~<>$&@\"";
            n13 = 0;
            while (n13 < string.length()) {
                this.d[n14 + n13] = new bj((v.t - n2 * 10 - n4 * 9) / 2 + n4 * n13 + n13 * n2, 2 * n5 + n3, n2, n3, "" + string.charAt(n13), string.charAt(n13));
                ++n13;
            }
            n14 = n14 + string.length() + 1;
            string = ".,?!'";
            n12 = (v.t - n2 * 7 - 4 * n4) / 2;
            n13 = 0;
            while (n13 < string.length()) {
                this.d[n14 + n13] = new bj(n12 + n4 * n13 + n13 * n2 * 7 / 5, 3 * n5 + 2 * n3, n2 * 7 / 5, n3, "" + string.charAt(n13), string.charAt(n13));
                ++n13;
            }
            this.d[n14 - 1] = new bj(n4, 3 * n5 + 2 * n3, n12 - 2 * n4, n3, "123", 0);
            f = n14 - 1;
            this.d[n14 - 1].a(this, 3);
            this.d[n14 + 5] = new bj(this.o - n4 - this.d[n14 - 1].d, 3 * n5 + 2 * n3, n12 - 2 * n4, n3, "DEL", -8);
            n14 = n14 + string.length() + 1;
            n12 = (v.t - 5 * n2 - 4 * n4) / 2;
            this.d[n14 + 2] = new bj(n12, 4 * n5 + 3 * n3, 4 * n2 + 4 * n4, n3, v.a && v.b ? "Khoảng trắng" : "SpaceBar", 32);
            h = n14 + 2;
            this.d[n14] = new bj(n4, 4 * n5 + 3 * n3, n12 - 3 * n4 - n2, n3, "ABC", 0);
            this.d[n14].a(this, 8);
            this.d[n14 + 1] = new bj(2 * n4 + this.d[n14].d, 4 * n5 + 3 * n3, n2, n3, v.a && v.b ? "Vi" : "En", -3);
            this.d[n14 + 1].a(this, 9);
            g = n14 + 1;
            this.d[n14 + 3] = new bj(this.d[n14 + 2].b + this.d[n14 + 2].d + n4, 4 * n5 + 3 * n3, n2, n3, "<", -3);
            this.d[n14 + 4] = new bj(this.d[n14 + 3].b + this.d[n14 + 3].d + n4, 4 * n5 + 3 * n3, n2, n3, ">", -4);
            this.d[n14 + 5] = new bj(this.d[n14 + 4].b + this.d[n14 + 4].d + n4, 4 * n5 + 3 * n3, n12 - 3 * n4 - n2, n3, e, 0);
            this.d[n14 + 5].a(this, 5);
        }
    }

    public final void a(Graphics graphics, int n, int n2) {
        graphics.setColor(i);
        graphics.fillRect(n + this.m, n2 + this.n, this.o, this.p);
        if (this.d != null && this.d.length > 0) {
            int n3 = 0;
            while (n3 < this.d.length) {
                int n4 = n2 + this.n;
                int n5 = this.m + n;
                Graphics graphics2 = graphics;
                bj bj2 = this.d[n3];
                int n6 = bj.a;
                if (bj2.g == 0) {
                    cw.b(graphics2, 0x555555, bj2.b + 1 + n5, bj2.c + 1 + n4, bj2.d, bj2.e);
                    graphics2.setColor(n6);
                    graphics2.fillRect(bj2.b + 1 + n5, bj2.c + 1 + n4, bj2.d - 2, bj2.e - 2);
                    cw.b(graphics2, 0x888888, bj2.b + n5, bj2.c + n4, bj2.d, bj2.e);
                    bx.d.a(graphics2, bj2.f, bj2.b + bj2.d / 2 + n5, bj2.c + n4 + (bj2.e - bx.d.a()) / 2, 1);
                } else if (bj2.g == 1) {
                    graphics2.setColor(n6);
                    graphics2.fillRect(bj2.b + n5 + 1, bj2.c + n4 + 1 - 2 - bj2.e, bj2.d - 1, bj2.e + 4 + bj2.e);
                    cw.b(graphics2, 0x555555, bj2.b + n5, bj2.c - bj2.e + 2 + n4 - 4, bj2.d + 1, bj2.e + 6 + bj2.e);
                    bx.d.a(graphics2, bj2.f, bj2.b + bj2.d / 2 + n5, bj2.c - bj2.e + n4 + (bj2.e - bx.d.a()) / 2, 1);
                }
                ++n3;
            }
        }
    }

    public final void i() {
        if (this.n != this.a) {
            if (this.a - this.n >= -3 && this.a - this.n <= 3) {
                this.n = this.a;
                return;
            }
            this.n += (this.a - this.n) / 2;
        }
    }

    public final void g(int n, int n2) {
        n2 -= this.n;
        try {
            if (this.d != null && this.d.length > 0) {
                int n3 = 0;
                while (n3 < this.d.length) {
                    if (n >= this.d[n3].b && n <= this.d[n3].b + this.d[n3].d && n2 >= this.d[n3].c && n2 <= this.d[n3].c + this.d[n3].e) {
                        bj bj2 = this.d[n3];
                        n3 = n2;
                        n2 = n;
                        bj bj3 = bj2;
                        if (n2 >= bj3.b && n2 <= bj3.b + bj3.d && n3 >= bj3.c && n3 <= bj3.c + bj3.e) {
                            bj3.g = 1;
                            if (bj3.i == null && bj3.h != -1987) {
                                ag.c(bj3.h);
                            }
                        }
                        return;
                    }
                    ++n3;
                }
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }

    public final void h(int n, int n2) {
        n2 -= this.n;
        try {
            if (this.d != null && this.d.length > 0) {
                int n3 = 0;
                while (n3 < this.d.length) {
                    if (this.d[n3].g == 1) {
                        int n4 = n2;
                        int n5 = n;
                        bj bj2 = this.d[n3];
                        this.d[n3].g = 0;
                        if (bj2.i != null && n5 >= bj2.b && n5 <= bj2.b + bj2.d && n4 >= bj2.c && n4 <= bj2.c + bj2.e) {
                            bj2.i.d(-1, bj2.j);
                        } else if (bj2.h != 0) {
                            ag.d(bj2.h);
                        }
                        if (this.d[n3].h >= 65 && this.d[n3].h <= 90 && this.d[bk.f].f.equals("Shift")) {
                            int n6 = 0;
                            while (n6 < this.d.length) {
                                if (this.d[n6].h >= 65 && this.d[n6].h <= 90) {
                                    this.d[n6].f = this.d[n6].f.toLowerCase();
                                    this.d[n6].h += 32;
                                }
                                ++n6;
                            }
                            this.d[bk.f].f = "shift";
                        }
                    }
                    ++n3;
                }
                return;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }

    public final void d(int n, int n2) {
        if (n2 == 6) {
            if (this.d[bk.f].f.equals("SHIFT")) {
                n = 0;
                while (n < this.d.length) {
                    if (this.d[n].h >= 65 && this.d[n].h <= 90) {
                        this.d[n].f = this.d[n].f.toLowerCase();
                        this.d[n].h = this.d[n].f.charAt(0);
                    }
                    ++n;
                }
                this.d[bk.f].f = "shift";
                c = 2;
                return;
            }
            if (this.d[bk.f].f.equals("shift")) {
                n = 0;
                while (n < this.d.length) {
                    if (this.d[n].h >= 97 && this.d[n].h <= 122) {
                        this.d[n].f = this.d[n].f.toUpperCase();
                        this.d[n].h = this.d[n].f.charAt(0);
                    }
                    ++n;
                }
                this.d[bk.f].f = "Shift";
                c = 1;
                return;
            }
            if (this.d[bk.f].f.equals("Shift")) {
                this.d[bk.f].f = "SHIFT";
                c = 0;
                return;
            }
        } else {
            if (n2 == 5) {
                if (b != null) {
                    b.a();
                }
                ag.a().e();
                return;
            }
            if (n2 == 3) {
                this.b(3);
                return;
            }
            if (n2 == 7) {
                this.b(4);
                return;
            }
            if (n2 == 8) {
                this.b(c);
                return;
            }
            if (n2 == 9) {
                if (!v.a) {
                    return;
                }
                v.b = !v.b;
                this.d[bk.g].f = v.b ? "Vi" : "En";
                this.d[bk.h].f = v.b ? "Khoảng trắng" : "SpaceBar";
            }
        }
    }
}
