package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class jw
extends jv {
    public final void a(int n, kl kl2) {
    }

    public final void a(int n) {
    }

    public final void a(at at2, kh kh2) {
        kf kf2 = (kf)kh2.a(1);
        ju ju2 = (ju)at2;
        ju2.i();
        switch (ju2.h()) {
            case 1: {
                ju2.g(ju2.o() - ju2.t);
                ju2.f(ju2.n() + ju2.u * ju2.w);
                --ju2.t;
                if (ju2.t == 0) {
                    ju2.a((byte)2);
                }
                jw.a(ju2, kh2, kf2);
                break;
            }
            case 2: {
                ju2.g(ju2.o() + ju2.t);
                ju2.f(ju2.n() + ju2.u * ju2.w);
                ++ju2.t;
                if (ju2.t > ju2.s) {
                    ju2.t = ju2.s;
                }
                int n = (ju2.n() + ju2.p() / 2) / 32;
                int n2 = (ju2.o() + ju2.q()) / 32;
                int n3 = ju2.n() / 32;
                int n4 = (ju2.n() + ju2.p()) / 32;
                if (kh.l(kf2.b(n2, n4))) {
                    n = 32 - (ju2.n() + ju2.p()) % 32;
                    ju2.c(ju2.n(), (n2 << 5) - ju2.q() + n);
                    break;
                }
                if (kh.d(kf2.b(n2, n3))) {
                    ju2.c(ju2.n(), (n2 << 5) - ju2.q() + ju2.n() % 32);
                    break;
                }
                if (!kh.c(kf2.b(n2, n))) break;
                ju2.a((byte)0);
                ju2.g((n2 << 5) - ju2.q());
            }
        }
        jw.a(ju2, kh2, kf2);
    }

    private static void a(ju ju2, kh kh2, kf kf2) {
        if (ju2.n() < 0) {
            ju2.f(0);
        } else if (ju2.n() + ju2.p() > kh2.p()) {
            ju2.f(kh2.p() - ju2.p());
        }
        if (ju2.w == -1) {
            int n = ju2.n() / 32;
            int n2 = (ju2.o() + ju2.q() / 2) / 32;
            if (kh2.n(kf2.b(n2, n))) {
                ju2.f(n + 1 << 5);
                ju2.w = 0;
                return;
            }
        } else if (ju2.w == 1) {
            int n = (ju2.n() + ju2.p()) / 32;
            int n3 = (ju2.o() + ju2.q() / 2) / 32;
            if (kh2.n(kf2.b(n3, n))) {
                ju2.f(n - 1 << 5);
                ju2.w = 0;
            }
        }
    }
}
