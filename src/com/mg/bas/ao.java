package com.mg.bas;
// Helper class implementing bf, manages event handling and state changes for an objects.
// Decompiled with: CFR 0.152
// Class Version: 1
final class ao
implements bf {
    private an a;

    private ao(an an2) {
        this.a = an2;
    }

    public final void d(int n, int n2) {
        if (n == this.a.e) {
            switch (n2) {
                case -90000: {
                    this.a.c(true);
                    return;
                }
                case -90001: {
                    if (an.a(this.a).f(95)) break;
                }
                case -90002: {
                    this.a.c(false);
                }
            }
        }
    }

    ao(an an2, byte by) {
        this(an2);
    }
}
