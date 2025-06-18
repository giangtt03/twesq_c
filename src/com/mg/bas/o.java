package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public class o {
    private String b;
    protected a a;
    private int c;
    private int d;
    private int e;
    private int f;
    private d g = null;
    private boolean h = false;

    public o() {
    }

    public final void a(boolean bl) {
        this.h = true;
    }

    public o(d object, String object2, int n2, int n3, int n4, int n5, int n6) {
        int n7 = n6;
        n6 = n5;
        n5 = n4;
        n4 = n3;
        n3 = n2;
        Object object3 = object2;
        object2 = object;
        object = this;
        object3 = ((String)object3).replace('\r', '\n');
        int n8 = n7;
        n7 = n6;
        n6 = n5;
        n5 = n4;
        n4 = n3;
        String string = object3;
        object3 = g.c((String)object3);
        ((o)v0).g = object2;
        ((o)object).b = string;
        ((o)object).a = new a(10);
        ((o)object).e = n4;
        ((o)object).f = n5;
        ((o)object).c = n6;
        if (n6 <= 0 || ((a)object3).d() <= 0) {
            return;
        }
        super.a((a)object3, ((o)object).b, n6, n7, n8);
        if (((o)object).a.d() > 0) {
            object2 = (n)((o)object).a.b(((o)object).a.d() - 1);
            ((o)object).d = ((n)object2).e() + n7;
            object3 = (n)((o)object).a.b(0);
            if (((n)object3).e() == ((n)object2).e()) {
                ((o)object).c = ((n)object2).d() + ((n)object2).f();
            }
        }
    }

    private void a(a a2, String string, int n2, int n3, int n4) {
        n4 = n3 + n4;
        int n5 = 0;
        long l = 0L;
        int n6 = 0;
        int n7 = a2.d();
        while (n6 < n7) {
            Object object = (String)a2.b(n6);
            if (this.a.d() > 0) {
                n n8 = (n)this.a.b(this.a.d() - 1);
                long l2 = n8.d() + n8.f();
                l = l2 << 32 | (long)n8.e();
            }
            int n9 = 10;
            if (((String)object).length() > 0) {
                n9 = ((String)object).charAt(0);
            }
            int n10 = 0;
            if (n9 == 26) {
                n9 = Integer.parseInt(String.valueOf(((String)object).charAt(1)));
                switch (n9) {
                    case 3: 
                    case 4: 
                    case 5: {
                        n10 = ((String)object).length() - 2;
                        String string2 = string.substring(n5, n5 + n10);
                        this.b(string2, n9, n6, l, n2, n4);
                        break;
                    }
                    case 1: {
                        n10 = ((String)object).length() - 2;
                        String string3 = string.substring(n5, n5 + n10);
                        this.a(string3, 1, n6, l, n4, n2);
                        break;
                    }
                    case 2: {
                        n9 = Integer.parseInt(String.valueOf(((String)object).charAt(2)) + ((String)object).charAt(3));
                        n10 = ((String)object).length() - 4;
                        String string4 = string.substring(n5, n5 + n10);
                        int n11 = n2;
                        int n12 = n4;
                        long l3 = l;
                        int n13 = n6;
                        int n14 = 2;
                        String string5 = string4;
                        object = this;
                        int n15 = (int)(l3 >>> 32);
                        int n16 = (int)l3;
                        if (n15 + p.l[n9] > n11) {
                            n16 += n12;
                            n15 = 0;
                        }
                        ((o)object).a.a(new p(n9, string5, 2, n13, n15, n16, p.l[n9]));
                    }
                }
            } else {
                n10 = ((String)object).length();
                String string6 = string.substring(n5, n5 + n10);
                this.b(string6, 0, n6, l, n2, n4);
            }
            n5 += n10;
            ++n6;
        }
        n6 = this.a.d() - 1;
        while (n6 >= 0) {
            n n17 = (n)this.a.b(n6);
            n17.a(n3);
            --n6;
        }
    }

    public final d a() {
        return this.g;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final a d() {
        return this.a;
    }

    public final n a(int n2) {
        return (n)this.a.b(n2);
    }

    public final int e() {
        return this.e;
    }

    public final int f() {
        return this.f;
    }

    public final void a(int n2, int n3) {
        this.e = 4;
        this.f = n3;
    }

    public final String g() {
        return g.a(this.a, 1, this.h);
    }

    public final String h() {
        return g.a(this.a, 3, this.h);
    }

    public final void a(int n2, boolean bl) {
        block9: {
            if (n2 < 0 || n2 >= this.a.d()) {
                return;
            }
            n n3 = (n)this.a.b(n2);
            int n4 = n3.b();
            if (!this.h) {
                while (n2 >= 0) {
                    n3 = (n)this.a.b(n2);
                    if (n3.b() != n4) {
                        ++n2;
                        break;
                    }
                    --n2;
                }
                if (n2 < 0) {
                    n2 = 0;
                }
                while (n2 < this.a.d()) {
                    n3 = (n)this.a.b(n2);
                    if (n3.b() == n4) {
                        n3.a(bl);
                        ++n2;
                        continue;
                    }
                    break block9;
                }
                return;
            }
            n2 = 0;
            while (n2 < this.a.d()) {
                n3 = (n)this.a.b(n2);
                if (n3.b() == n4) {
                    n3.a(bl);
                }
                ++n2;
            }
        }
    }

    public final String b(int n2, int n3) {
        return g.a(this.a, n2, n3, this.h);
    }

    public final void a(Graphics graphics, int n2, int n3) {
        n2 += this.e;
        n3 += this.f;
        int n4 = 0;
        while (n4 < this.a.d()) {
            n n5 = (n)this.a.b(n4);
            n5.a(graphics, n2, n3);
            ++n4;
        }
    }

    public final String i() {
        return this.b;
    }

    public final int b(int n2) {
        return g.b(this.a, n2);
    }

    public final int c(int n2) {
        return g.c(this.a, n2);
    }

    public final int d(int n2) {
        return g.d(this.a, n2);
    }

    public final int e(int n2) {
        return g.e(this.a, n2);
    }

    public final int j() {
        a a2 = this.a;
        int n2 = 0;
        while (n2 < a2.d()) {
            n n3 = (n)a2.b(n2);
            if (g.a(n3.c())) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    public final int k() {
        a a2 = this.a;
        int n2 = a2.d() - 1;
        while (n2 >= 0) {
            n n3 = (n)a2.b(n2);
            if (g.a(n3.c())) {
                return n2;
            }
            --n2;
        }
        return -1;
    }

    private void b(String string, int n2, int n3, long l, int n4, int n5) {
        int n6 = (int)(l >>> 32);
        int n7 = (int)l;
        int n8 = 0;
        int n9 = 0;
        int n10 = n6;
        while (n8 < string.length()) {
            String string2;
            char c = string.charAt(n9);
            int n11 = this.g.a(c);
            ++n9;
            if (c == '\n') {
                string2 = string.substring(0, n9 - 1);
                if (string2.length() > 0) {
                    this.a.a(this.a(string2, n2, n3, n6, n7, n10 - n6));
                }
                n7 += n5;
                if (n9 >= string.length()) {
                    this.a.a(this.a("", n2, n3, 0, n7, 0));
                    return;
                }
                string = string.substring(n9);
                n10 = 0;
                n6 = 0;
                n9 = 0;
                n8 = 0;
                continue;
            }
            if (c == ' ') {
                n8 = n9;
            }
            if ((n10 += n11) > n4) {
                int n12 = string.indexOf(32, n9);
                String string3 = n12 >= 0 ? string.substring(n8, n12) : string.substring(n8);
                int n13 = this.g.a(string3);
                if (n13 <= n4) {
                    String string4 = string.substring(0, n8);
                    if (string4.length() > 0) {
                        this.a.a(this.a(string4, n2, n3, n6, n7, this.g.a(string4)));
                    }
                    n7 += n5;
                    n6 = 0;
                    string = string.substring(n8);
                    if (n12 < 0) {
                        if (string.length() <= 0) break;
                        this.a.a(this.a(string, n2, n3, 0, n7, this.g.a(string3)));
                        return;
                    }
                    n9 = n8 = n12 - n8;
                    n10 = n13;
                    continue;
                }
                if (c != ' ') {
                    --n9;
                }
                n10 -= n11;
                String string5 = string.substring(0, n9);
                if (string5.length() > 0) {
                    this.a.a(this.a(string5, n2, n3, n6, n7, n10 - n6));
                }
                n7 += n5;
                n10 = 0;
                n6 = 0;
                string = string.substring(n9);
                n9 = 0;
                n8 = 0;
                continue;
            }
            if (n9 < string.length()) continue;
            string2 = string;
            if (string2.length() <= 0) break;
            this.a.a(this.a(string2, n2, n3, n6, n7, this.g.a(string2)));
            return;
        }
    }

    protected n a(String string, int n2, int n3, int n4, int n5, int n6) {
        return new q(string, n2, n3, n4, n5, n6, this.g);
    }

    protected void a(String string, int n2, int n3, long l, int n4, int n5) {
    }
}
