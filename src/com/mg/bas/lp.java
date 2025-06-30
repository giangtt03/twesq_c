package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class lp
extends as {
    private static byte[][] s;
    private int t;

    static {
        byte[][] byArrayArray = new byte[2][];
        byArrayArray[0] = new byte[]{-1};
        byte[] byArray = new byte[9];
        byArray[2] = 1;
        byArray[3] = 1;
        byArray[4] = 2;
        byArray[5] = 2;
        byArray[6] = 3;
        byArray[7] = 3;
        byArray[8] = 3;
        byArrayArray[1] = byArray;
        s = byArrayArray;
    }

    public lp(int n) {
        switch (n) {
            case 0: {
                mp mp2 = mp.a();
                if (mp2.Q == null) {
                    mp2.Q = com.mg.bas.f.d("/miniexplosionfire");
                }
                this.a(mp2.Q, 4);
                break;
            }
            case 2: {
                mp mp3 = mp.a();
                if (mp3.R == null) {
                    byte[] byArray = com.mg.bas.f.b("/miniexplosionfire");
                    com.mg.bas.h.a(byArray, 138);
                    mp3.R = com.mg.bas.f.a(byArray);
                }
                this.a(mp3.R, 4);
                break;
            }
            case 1: {
                mp mp4 = mp.a();
                if (mp4.S == null) {
                    byte[] byArray = com.mg.bas.f.b("/miniexplosionfire");
                    com.mg.bas.h.a(byArray, -111);
                    mp4.S = com.mg.bas.f.a(byArray);
                }
                this.a(mp4.S, 4);
            }
        }
        this.a(s);
        this.j(3);
        this.r = false;
    }

    public final void b(int n, int n2, int n3) {
        this.c(n, n2);
        this.r = true;
        this.t = n3;
        if (n3 <= 0) {
            this.d(1);
            return;
        }
        this.d(0);
    }

    public final void k() {
        if (this.t > 0) {
            --this.t;
            if (this.t == 0) {
                this.d(1);
            }
        }
        if (this.e == 1 && this.j()) {
            this.r = false;
        }
    }
}
