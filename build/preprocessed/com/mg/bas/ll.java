package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;

public final class ll {
    public static final int[] a;
    public int b;
    public String c;
    public String d;
    public byte e;
    public byte f;
    public String g;
    public byte h;
    public int i;
    public int j;
    public long k = -1L;
    public long l;
    private String u;
    public int m = 0;
    public int n;
    public long o;
    public int p;
    public int q;
    public lb r;
    public byte s;
    public byte t = 1;

    static {
        int[] nArray = new int[13];
        nArray[0] = 1;
        nArray[1] = 4;
        nArray[2] = 2;
        nArray[3] = 3;
        nArray[4] = 5;
        nArray[5] = 9;
        nArray[7] = 6;
        nArray[8] = 10;
        nArray[9] = 99;
        nArray[10] = 99;
        nArray[11] = 99;
        nArray[12] = 99;
        a = nArray;
    }

    public ll(String string, byte by) {
        this.c = string;
        this.e = by;
    }

    public final boolean a() {
        return this.t == 1;
    }

    public final boolean b() {
        return this.q > 0 && this.p < this.q;
    }

    public final boolean c() {
        return this.k > 0L;
    }

    public final ll d() {
        ll ll2 = new ll(this.c, this.e);
        new ll(this.c, this.e).d = this.d;
        ll2.f = this.f;
        ll2.h = this.h;
        ll2.i = this.i;
        ll2.k = this.k;
        ll2.j = this.j;
        ll2.m = this.m;
        ll2.n = this.n;
        ll2.p = this.p;
        ll2.q = this.q;
        ll2.r = this.r;
        ll2.b = this.b;
        ll2.u = this.u;
        ll2.s = this.s;
        ll2.t = this.t;
        return ll2;
    }

    public final String toString() {
        return "Equip[key=" + this.c + " resid = " + this.n + " ; name=" + this.d + "; type=" + this.e + " rank = " + this.m + "    \n" + this.r + " levle = " + this.j + " tradeable" + this.t;
    }

    public static d a(int n) {
        d d2;
        try {
            switch (n) {
                case 2: 
                case 3: {
                    d2 = new by(11731964);
                    break;
                }
                case 4: 
                case 7: 
                case 8: {
                    d2 = new iff(new int[]{9008914, 0xFFFF00});
                    break;
                }
                case 1: {
                    d2 = com.mg.sq.a.g;
                    break;
                }
                case 0: {
                    d2 = bx.d;
                    break;
                }
                default: {
                    d2 = bx.d;
                    break;
                }
            }
        }
        catch (Exception exception) {
            d2 = bx.d;
        }
        return d2;
    }
}
