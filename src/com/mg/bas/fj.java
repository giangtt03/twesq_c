package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fj
extends aq {
    private String k;
    private String l;
    private Image m;
    public boolean i;
    public int j;
    private int n;
    private int o;
    private String p;
    private Image q = f.d("/staricon");
    private Image r = f.d("/shoppingcarticon");
    private int s = -1;
    private int t = 0;
    private boolean u;
    private int v = -1;
    private d w;
    private d x;
    private long y;

    public fj(String object, int n, int n2, int n3, long l, int n4, boolean bl, Image image, String string, long l2) {
        this((String)object, n, l, -1, false, null, -1, -1, bx.d, string, l2);
        this.t = n3;
        this.p = string;
        this.u = true;
        this.y = l2 + System.currentTimeMillis();
        n = n2;
        object = this;
        this.v = n;
    }

    public fj(String string, int n, long l, Image image) {
        this.k = string;
        this.l = i.a(l);
        this.m = image;
        this.j = n;
        this.x = bx.d;
        this.e(40);
        this.d(v.t);
    }

    public fj(String string, int n, long l, int n2, boolean bl, Image image, int n3, int n4, d d2, String string2, long l2) {
        this.k = string;
        this.l = i.a(l);
        this.m = image;
        this.i = bl;
        this.j = n;
        this.n = n2;
        this.s = n3;
        this.o = n4;
        this.w = d2;
        this.p = string2;
        this.y = l2 + System.currentTimeMillis();
        this.x = ll.a(n2);
        if (string2 == null) {
            this.e(40);
        } else {
            this.e(55);
        }
        this.d(v.t);
    }

    public final void d(boolean bl) {
        if (bl || this.g != bl) {
            this.c = true;
        }
        super.d(bl);
    }

    public final void a(Graphics graphics, int n, int n2) {
        int n3;
        int n4;
        if (!this.c) {
            return;
        }
        n2 += this.d();
        n += this.c() + 2;
        if (this.i) {
            if (this.g) {
                pc.a(graphics, n - 2, n2, this.e(), this.f(), true, 7470469);
            } else {
                graphics.setColor(7470469);
                graphics.fillRect(n, n2, this.e(), this.f());
            }
        } else if (this.g) {
            pc.e(graphics, n - 2, n2, this.e(), this.f());
        }
        n2 += 3;
        int n5 = 0;
        if (this.s > 0) {
            pc.b(graphics, n + 35, n2 + 1, this.s);
            n5 = 15;
        }
        if (this.x != null) {
            if (this.o > 0) {
                this.x.a(graphics, String.valueOf(this.k) + " +" + this.o, n + 35 + n5, n2 + 5, 0);
            } else {
                this.x.a(graphics, this.k, n + 35 + n5, n2 + 5, 0);
            }
        }
        String string = "Giá: " + this.l + " Ken";
        com.mg.sq.a.h.a(graphics, string, n + 35, n2 + 20, 0);
        if (this.y - System.currentTimeMillis() > 0L) {
            long l = Math.max(this.y - System.currentTimeMillis(), 0L);
            n4 = v.t - bx.c.a(i.b(l, "hh:mm:ss")) - 5;
            long l2 = l;
            int n6 = Math.max((int)(l2 / 3600000L), 0);
            StringBuffer stringBuffer = new StringBuffer(String.valueOf(n6 < 10 ? "0" + n6 : String.valueOf(n6))).append(":");
            l2 = l;
            n6 = (int)Math.max(l2 % 3600000L, 0L);
            n6 = Math.max(n6 / 60000, 0);
            StringBuffer stringBuffer2 = stringBuffer.append(n6 < 10 ? "0" + n6 : String.valueOf(n6)).append(":");
            l2 = l;
            n6 = (int)Math.max(l2 % 3600000L, 0L);
            n6 = Math.max(n6 % 60000, 0);
            n3 = Math.max(n6 / 1000, 0);
            com.mg.sq.a.h.a(graphics, stringBuffer2.append(n3 < 10 ? "0" + n3 : String.valueOf(n3)).toString(), n4, n2 + 20, 0);
        }
        if (this.p != null) {
            com.mg.sq.a.g.a(graphics, "@" + this.p, n + 35, n2 + 35, 0);
        }
        if (this.m != null || this.u) {
            int n7;
            n3 = this.m != null ? this.m.getWidth() : 32;
            int n8 = n7 = this.m != null ? this.m.getHeight() : 32;
            if (this.u) {
                if (this.p != null) {
                    pc.g(graphics, this.v, n, n2 + 10, 0);
                } else {
                    pc.g(graphics, this.v, n, n2 + 1, 0);
                }
            } else {
                if (this.p != null) {
                    graphics.drawImage(this.m, n, n2 + 10, 0);
                } else {
                    graphics.drawImage(this.m, n, n2 + 1, 0);
                }
                if (this.o > 0 && this.w != null) {
                    if (this.p == null) {
                        this.w.a(graphics, "+" + this.o, n + n3 - bx.d.a("+" + this.o) - 4, n2 + 32 - bx.d.a(), 0);
                    } else {
                        this.w.a(graphics, "+" + this.o, n + n3 - bx.d.a("+" + this.o) - 4, n2 + 9 + 32 - bx.d.a(), 0);
                    }
                }
            }
            if (this.t > 0) {
                if (this.p == null) {
                    bx.c.a(graphics, String.valueOf(this.t), n + n3 - 1, n2 + n7 - 15, 2);
                } else {
                    bx.c.a(graphics, String.valueOf(this.t), n + n3 - 1, n2 + n7 - 4, 2);
                }
            }
            if (this.i) {
                graphics.drawImage(this.r, n + n3 - this.r.getWidth() - 1, n2 + 1 + n7 - this.r.getHeight() - 1, 0);
            }
            if (this.n > 0) {
                n4 = n + 35 + com.mg.sq.a.g.a(string) + 5;
                n = n2 + 20;
                graphics.drawImage(this.q, n4, n, 0);
            }
        }
        this.c = false;
    }
}
