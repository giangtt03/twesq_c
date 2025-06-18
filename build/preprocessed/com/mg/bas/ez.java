package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import java.util.Calendar;
import javax.microedition.lcdui.Graphics;

public final class ez
extends aq
implements bf {
    private int i;
    private int j;
    private int[] k = new int[]{2, 2, 4};
    private String[] l = new String[]{"", "", ""};
    private gw m = new gw();

    public ez() {
        this.m.a(this);
        this.q();
    }

    private void q() {
        this.l[0] = this.m.w();
        this.l[1] = this.m.y();
        this.l[2] = this.m.x();
    }

    public final boolean f(int n) {
        if (n == 97) {
            --this.i;
            if (this.i < 0) {
                this.i = 2;
            }
            this.j = 0;
            return true;
        }
        if (n == 96) {
            ++this.i;
            if (this.i > 2) {
                this.i = 0;
            }
            this.j = 0;
            return true;
        }
        if (n == 95) {
            com.mg.sq.a.s().a(this.m);
            return true;
        }
        if (n >= 148 && n <= 157) {
            int n2;
            int n3;
            String string = this.l[this.i].substring(0, this.j);
            Object object = this.l[this.i].substring(this.j + 1);
            String string2 = String.valueOf(string == null ? "" : string) + (n - 148) + (String)(object == null ? "" : object);
            int n4 = Integer.parseInt(string2);
            int n5 = this.i;
            object = this;
            switch (n5) {
                case 0: {
                    gw cfr_ignored_0 = ((ez)object).m;
                    n3 = 1;
                    break;
                }
                case 1: {
                    gw cfr_ignored_1 = ((ez)object).m;
                    n3 = 1;
                    break;
                }
                default: {
                    n3 = ((ez)object).m.A();
                }
            }
            int n6 = n3;
            n5 = this.i;
            object = this;
            switch (n5) {
                case 0: {
                    int n7 = ((ez)object).m.z();
                    break;
                }
                case 1: {
                    gw cfr_ignored_2 = ((ez)object).m;
                    int n7 = 12;
                    break;
                }
                default: {
                    int n7 = n2 = ((ez)object).m.B();
                }
            }
            if (n4 < n6) {
                n4 = n6;
            }
            if (n4 > n2) {
                n4 = n2;
            }
            int n8 = n4;
            n4 = this.i;
            n5 = n8;
            ez ez2 = this;
            if (n4 == 1) {
                ez2.m.a(ez2.m.t(), n5, ez2.m.u());
            } else if (n4 == 2) {
                ez2.m.a(ez2.m.t(), ez2.m.v(), n5);
            } else {
                ez2.m.a(n5, ez2.m.v(), ez2.m.u());
            }
            ez2.q();
            ++this.j;
            if (this.j >= this.k[this.i]) {
                ++this.i;
                if (this.i >= 2) {
                    this.i = 2;
                }
                this.j = 0;
            }
            return true;
        }
        return super.f(n);
    }

    public final boolean c(int n, int n2) {
        com.mg.sq.a.s().a(this.m);
        return true;
    }

    public final void a(Graphics graphics, int n, int n2) {
        pc.a(graphics, this.c() + n, this.d() + n2, this.e(), this.f(), this.g);
        String string = "";
        String string2 = this.l[0];
        if (this.i == 1) {
            string = String.valueOf(this.l[0]) + " - ";
            string2 = this.l[1];
        } else if (this.i == 2) {
            string = String.valueOf(this.l[0]) + " - " + this.l[1] + " - ";
            string2 = this.l[2];
        }
        String string3 = String.valueOf(this.l[0]) + " - " + this.l[1] + " - " + this.l[2];
        n = n + this.c() + (this.e() - bx.d.a(string3)) / 2;
        if (this.g) {
            graphics.setColor(16048180);
            graphics.fillRect(n + bx.d.a(string) - 2, n2 + this.d() + 2, bx.d.a(string2) + 3, this.f() - 4);
        }
        bx.d.a(graphics, string3, n, n2 + this.d() + 2, 0);
    }

    public final long a() {
        Calendar calendar = i.a;
        ez ez2 = this;
        calendar.set(5, Integer.parseInt(ez2.l[0]));
        ez2 = this;
        calendar.set(2, Integer.parseInt(ez2.l[1]) - 1);
        ez2 = this;
        calendar.set(1, Integer.parseInt(ez2.l[2]));
        return calendar.getTime().getTime();
    }

    public final void d(int n, int n2) {
        if (n2 == -1099) {
            this.q();
        }
        this.j = 0;
        com.mg.sq.a.s().a(false);
    }
}
