package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class kj
extends jv {
    public final void a(ki ki2, kl kl2, byte[][] byArray, kh kh2, boolean bl) {
        if (ki2 != null) {
            ki ki3;
            ki2.i();
            switch (ki2.a()) {
                case 0: {
                    if (kl2 != null && bl && ki2.m() && (kl2.j == 1 || kl2.j == 0)) {
                        ki3 = ki2;
                        k object = ki3.e;
                        kl kl3 = kl2;
                        if (kl3.t.a(object) && kl2.m()) {
                            int n = ki2.e.a > kl2.t.a ? 2 : 3;
                            ki2.a(1, n);
                            kl2.b(n == 2 ? 8 : 4);
                            return;
                        }
                    }
                    ki2.b(ki2.d * ki.a[ki2.c], ki2.d * ki.b[ki2.c]);
                    ki ki4 = ki2;
                    int n = (ki4.o() + ki4.q() - 5) / 32;
                    ki3 = ki4;
                    int n2 = (ki4.n() + (ki3.c == 2 ? 0 : ki4.e.c)) / 32;
                    if (byArray[n][n2] == 0) break;
                    ki3 = ki4;
                    ki4.a(0, ki3.c == 2 ? 3 : 2);
                }
            }
            if (kh2.a(ki2)) {
                int n;
                ki3 = ki2;
                if (ki3.c == 2) {
                    n = 3;
                } else {
                    ki3 = ki2;
                    if (ki3.c == 3) {
                        n = 2;
                    } else {
                        ki3 = ki2;
                        n = ki3.c == 0 ? 1 : 0;
                    }
                }
                ki2.a(0, n);
            }
        }
    }

    public final void a(int n, kl kl2) {
    }

    public final void a(int n) {
    }

    public final void a(at at2, kh kh2) {
    }
}
