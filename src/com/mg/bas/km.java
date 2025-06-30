package com.mg.bas;
// Decompiled with: Procyon 0.6.0
// Class Version: 1
public final class km extends jv
{
    private boolean[] a;
    private int b;
    private int c;
    
    public km() {
        super();
        this.a = new boolean[5];
        this.b = 0;
        this.c = 0;
    }
    
    public final void a(final at at, final kh kh) {
        final kl kl;
        if ((kl = (kl)at) != null) {
            kl.i();
            final kf kf = (kf)kh.a(1);
            final k t = kl.t;
            Label_4022: {
                switch (kl.j) {
                    case 5: {
                        final k k = t;
                        k.b -= kl.s;
                        final kl kl2 = kl;
                        kl2.w += kl.s;
                        final kl kl3 = kl;
                        --kl3.s;
                        if (kl.s == 0) {
                            kl.a(6);
                            break;
                        }
                        if (!kh.a(kf.b((kl.o() + 20) / 32, (t.a + t.c / 2) / 32))) {
                            kl.a(6);
                        }
                        this.a(kl, t, kf, kh);
                        break;
                    }
                    case 6: {
                        final k i = t;
                        i.b += kl.s;
                        final kl kl4 = kl;
                        kl4.s += 2;
                        if (kl.s > kl.a) {
                            kl.s = kl.a;
                        }
                        final int n = (t.b + t.d - kl.a) / 32;
                        final int n2 = (t.b + t.d) / 32;
                        final int n3 = t.a / 32;
                        if (kh.l(kf.b(n2, (t.a + t.c) / 32))) {
                            int j;
                            if ((j = kl.k) == 4) {
                                j = (kl.k | 0x2);
                            }
                            else if (j == 8) {
                                j = (kl.k | 0x1);
                            }
                            kl.a(7, j);
                            kl.c(t.a, (n2 << 5) - t.d + (32 - (t.a + t.c) % 32));
                            break;
                        }
                        if (kh.d(kf.b(n2, n3))) {
                            int l;
                            if ((l = kl.k) == 4) {
                                l = (kl.k | 0x1);
                            }
                            else if (l == 8) {
                                l = (kl.k | 0x8);
                            }
                            kl.a(7, l);
                            kl.c(t.a, (n2 << 5) - t.d + t.a % 32);
                            break;
                        }
                        final int n4 = (t.a + 5) / 32;
                        final int n5 = (t.a + t.c - 5) / 32;
                        if (kh.c(kf.b(n2, n4))) {
                            if (n != n2) {
                                kl.a(7);
                                kl.c(t.a, (n2 - 1 << 5) - (t.d - 32));
                                break;
                            }
                            break;
                        }
                        else {
                            if (!kh.c(kf.b(n2, n5))) {
                                this.a(kl, t, kf, kh);
                                break;
                            }
                            if (n != n2) {
                                kl.a(7);
                                kl.c(t.a, (n2 - 1 << 5) - (t.d - 32));
                                break;
                            }
                            break;
                        }
//                        break;
                    }
                    case 7: {
                        if (kl.d.j()) {
                            kl.a(0);
                        }
                        this.a(t, kf, kh, kl);
                        if ((kl.k & 0x4) != 0x0) {
                            if (a(t, kl, kf, kh, true)) {
                                return;
                            }
                            break;
                        }
                        else {
                            if ((kl.k & 0x8) != 0x0 && b(t, kl, kf, kh, true)) {
                                return;
                            }
                            break;
                        }
//                        break;
                    }
                    case 8: {
                        if (kl.k != 1) {
                            break;
                        }
                        final int n6 = (t.b + 10) / 32;
                        if (!kh.b(kf.b(n6, (t.a + t.c / 2) / 32))) {
                            this.b = t.b + t.d - (n6 + 1 << 5);
                            this.c = this.b / 3;
                            break;
                        }
                        break;
                    }
                    case 2: {
                        if (this.a[0]) {
                            kl.v = true;
                            if (kl.k == 2) {
                                kl.k = 1;
                                kl.g.s();
                            }
                            kl.b(0, kl.i * kl.c[1]);
                            final int n7 = (t.b + 10) / 32;
                            final int n8 = (t.a + t.c / 2) / 32;
                            if (!kh.b(kf.b(n7, n8))) {
                                this.b = t.b + t.d - (n7 + 1 << 5);
                                this.c = this.b / 3;
                                kl.a(3);
                            }
                            else {
                                final int n9 = (t.b + t.d) / 32;
                                if (kh.b(kf.b(t.b / 32, n8)) && kh.c(kf.b(n9, n8))) {
                                    this.b = t.b + t.d - (n9 + 1 << 5);
                                    this.c = this.b / 3;
                                    kl.a(3);
                                }
                            }
                        }
                        else if (this.a[1]) {
                            kl.v = true;
                            if (kl.k == 1) {
                                kl.k = 2;
                                kl.g.t();
                            }
                            kl.b(0, kl.i * kl.c[2]);
                            final int n10 = (t.b + t.d) / 32;
                            final int n11 = (t.a + t.c / 2) / 32;
                            if (!kh.b(kf.b(n10, n11))) {
                                kl.g(n10 - 1 << 5);
                                kl.a(3);
                            }
                            else if (kh.c(kf.b(n10, n11))) {
                                kl.g(n10 - 1 << 5);
                                kl.a(3);
                            }
                        }
                        else {
                            kl.v = false;
                        }
                        if (this.a[2]) {
                            this.a[0] = (this.a[1] = false);
                            kl.f(t.a - 16);
                            kl.a(6, 4);
                            break;
                        }
                        if (this.a[3]) {
                            this.a[0] = (this.a[1] = false);
                            kl.f(t.a + 16);
                            kl.a(6, 8);
                            break;
                        }
                        break;
                    }
                    case 3: {
                        if (kl.k == 1) {
                            final k m = t;
                            m.b += this.c * kl.c[kl.k];
                        }
                        if (!kl.d.j()) {
                            break;
                        }
                        this.c = 0;
                        this.b = 0;
                        final int n12 = t.b / 32;
                        final int a = t.a;
                        final int c = t.c;
                        kl.g(n12 << 5);
                        kl.a(0);
                        this.a();
                        v.c();
                        if (!kh.c(kf.b((t.b + t.d) / 32, (t.a + t.c / 2) / 32))) {
                            kl.a(6);
                            break;
                        }
                        break;
                    }
                    case 1: {
                        if (this.a[0]) {
                            if (!kl.y) {
                                final int n13 = (t.b + t.d / 2) / 32;
                                final int n14 = (t.a + t.c / 2) / 32;
                                if (kh.b(kf.b(n13, n14))) {
                                    kl.f((n14 << 5) + (32 - t.c) / 2);
                                    kl.a(8, 1);
                                    this.a[2] = (this.a[3] = false);
                                }
                                else if (kh.a(kf.b((kl.o() + 20) / 32, (t.a + t.c / 2) / 32))) {
                                    kl.a(5);
                                    this.a[0] = false;
                                }
                            }
                            else if (kl.k != 1) {
                                kl.a(1, 1);
                            }
                        }
                        else if (this.a[1]) {
                            final int n15 = (t.b + t.d + 8) / 32;
                            final int n16 = (t.a + t.c / 2) / 32;
                            if (kl.y) {
                                if (!kh.c(kf.b(n15, n16)) || kh.b(kf.b(n15, n16))) {
                                    if (kl.k != 2) {
                                        kl.a(1, 2);
                                    }
                                }
                                else {
                                    kl.a(0);
                                }
                            }
                        }
                        if (this.a[2]) {
                            if (kl.k == 4) {
                                if (a(t, kl, kf, kh, true)) {
                                    break;
                                }
                                final int n17 = (t.b + t.d) / 32;
                                final int n18 = (t.a + t.c - 5) / 32;
                                final int n19 = (t.a + 5) / 32;
                                kf.b(n17, n18);
                                if (!kh.c(kf.b(n17, n19)) && !kh.c(kf.b(n17, n18))) {
                                    if (!kl.y) {
                                        kl.a(6);
                                    }
                                }
                                else {
                                    final int n20 = (t.b + t.d) / 32;
                                    final int n21 = (t.a + t.c - kl.i) / 32;
                                    if (kh.l(kf.b(n20, n21))) {
                                        kl.c((n21 + 1 << 5) - t.c, (n20 << 5) - t.d);
                                        kl.a(1, 6);
                                    }
                                    else {
                                        final int n22 = (t.b + t.d - kl.i) / 32;
                                        final int n23 = (t.a - kl.i) / 32;
                                        if (kh.d(kf.b(n22, n23))) {
                                            kl.c(n23 + 1 << 5, (n22 << 5) - (t.d - 32));
                                            kl.a(1, 5);
                                        }
                                    }
                                }
                            }
                            else if (kl.k == 5) {
                                final int n24 = (t.b + t.d) / 32;
                                final int n25 = t.a / 32;
                                final int n26 = (t.b + t.d - kl.i) / 32;
                                final int n27 = (t.a - kl.i) / 32;
                                if (n24 != n26) {
                                    if (n25 == n27) {
                                        if (!kh.d(kf.b(n26, n27 - 1)) && !kh.d(kf.b(n26, n27))) {
                                            kl.c(n27 << 5, (n26 + 1 << 5) - t.d);
                                            kl.a(1, 4);
                                        }
                                    }
                                    else if (!kh.d(kf.b(n26, n27))) {
                                        kl.c(n25 << 5, (n26 + 1 << 5) - t.d);
                                        kl.a(1, 4);
                                    }
                                }
                            }
                            else if (kl.k == 6) {
                                final int n28 = (t.b + t.d) / 32;
                                final int n29 = (t.a + t.c) / 32;
                                final int n30 = (t.b + t.d + kl.i) / 32;
                                final int n31 = (t.a + t.c - kl.i) / 32;
                                if (n28 != n30) {
                                    if (n29 == n31) {
                                        if (!kh.l(kf.b(n30, n31 - 1)) && !kh.l(kf.b(n30, n31))) {
                                            kl.c((n31 << 5) - t.c, (n30 << 5) - t.d);
                                            kl.a(1, 4);
                                        }
                                    }
                                    else if (!kh.l(kf.b(n30, n31))) {
                                        kl.c((n31 + 1 << 5) - t.c, (n30 << 5) - t.d);
                                        kl.a(1, 4);
                                    }
                                }
                            }
                            else {
                                if (kl.k == 10) {
                                    kl.a(1, 5);
                                    break;
                                }
                                if (kl.k == 9) {
                                    kl.a(1, 6);
                                    break;
                                }
                                kl.a(1, 4);
                                break;
                            }
                        }
                        else if (this.a[3]) {
                            if (b(t, kl, kf, kh, true)) {
                                break;
                            }
                            if (kl.k == 8) {
                                final int n32 = (t.b + t.d) / 32;
                                final int n33 = (t.a + 5) / 32;
                                final int n34 = (t.a + t.c - 5) / 32;
                                kf.b(n32, n33);
                                if (!kh.c(kf.b(n32, n34)) && !kh.c(kf.b(n32, n33))) {
                                    if (!kl.y) {
                                        kl.a(6);
                                    }
                                }
                                else {
                                    final int n35 = (t.b + t.d + kl.i) / 32;
                                    final int n36 = (t.a + kl.i) / 32;
                                    if (kh.d(kf.b(n35, n36))) {
                                        kl.c((n36 << 5) + 1, (n35 << 5) - t.d + 1);
                                        kl.a(1, 10);
                                    }
                                    else {
                                        final int n37 = (t.b + t.d - kl.i) / 32;
                                        final int n38 = (t.a + t.c + kl.i) / 32;
                                        kf.b(n37, n38);
                                        if (kh.l(kf.b(n37, n38))) {
                                            kl.c((n38 << 5) - t.c, (n37 << 5) + (32 - t.d));
                                            kl.a(1, 9);
                                        }
                                    }
                                }
                            }
                            else if (kl.k == 10) {
                                final int n39 = (t.b + t.d) / 32;
                                final int n40 = t.a / 32;
                                final int n41 = (t.b + t.d + kl.i) / 32;
                                final int n42 = (t.a + kl.i) / 32;
                                if (n39 != n41) {
                                    if (n40 != n42 && !kh.d(kf.b(n41, n42))) {
                                        kl.c(n42 << 5, (n41 << 5) - t.d);
                                        kl.a(1, 8);
                                    }
                                }
                                else if (n40 != n42 && !kh.d(kf.b(n41, n42)) && !kh.d(kf.b(n41 + 1, n42))) {
                                    kl.c(n42 << 5, (n41 + 1 << 5) - t.d);
                                    kl.a(1, 8);
                                }
                            }
                            else if (kl.k == 9) {
                                final int n43 = (t.b + t.d) / 32;
                                final int n44 = (t.a + t.c) / 32;
                                final int n45 = (t.b + t.d - kl.i) / 32;
                                final int n46 = (t.a + t.c + kl.i) / 32;
                                if (n43 != n45) {
                                    if (n44 != n46 && !kh.l(kf.b(n45, n46))) {
                                        kl.c((n46 << 5) - t.c, (n45 << 5) + (32 - t.d));
                                        kl.a(1, 8);
                                    }
                                }
                                else if (n44 != n46 && !kh.l(kf.b(n43, n46)) && !kh.l(kf.b(n43 - 1, n46))) {
                                    kl.c((n46 << 5) - t.c, (n45 << 5) - t.d);
                                    kl.a(1, 8);
                                }
                            }
                            else {
                                if (kl.k == 6) {
                                    kl.a(1, 9);
                                    break;
                                }
                                if (kl.k == 5) {
                                    kl.a(1, 10);
                                    break;
                                }
                                kl.a(1, 8);
                                break;
                            }
                        }
                        else if (!kl.y) {
                            kl.a(0);
                        }
                        int n47 = 0;
                        while (true) {
                            while (n47 < this.a.length) {
                                if (this.a[n47]) {
                                    final boolean b = true;
                                    if (!b) {
                                        kl.a(0);
                                    }
                                    if (kl.j != 1) {
                                        break Label_4022;
                                    }
                                    kl.b(kl.b[kl.k] * kl.i, kl.c[kl.k] * kl.i);
                                    if (kl.k == 4) {
                                        final int n48 = (t.b + t.d - 1) / 32;
                                        final int n49 = (t.a - 1) / 32;
                                        if (kh.n(kf.b(n48, n49))) {
                                            kl.f(n49 + 1 << 5);
                                            break Label_4022;
                                        }
                                        break Label_4022;
                                    }
                                    else {
                                        if (kl.k != 8) {
                                            break Label_4022;
                                        }
                                        final int n50 = (t.b + t.d - 1) / 32;
                                        final int n51 = (t.a + t.c) / 32;
                                        if (kh.n(kf.b(n50, n51))) {
                                            kl.f((n51 - 1 << 5) - (t.c - 32));
                                            break Label_4022;
                                        }
                                        break Label_4022;
                                    }
                                }
                                else {
                                    ++n47;
                                }
                            }
                            final boolean b = false;
                            continue;
                        }
                    }
                    case 0: {
                        if (this.a[0]) {
                            if (!kl.y) {
                                final int n52 = (t.b + t.d / 2) / 32;
                                final int n53 = (t.a + t.c / 2) / 32;
                                if (kh.b(kf.b(n52, n53))) {
                                    kl.f((n53 << 5) + (32 - t.c) / 2);
                                    kl.a(8, 1);
                                }
                                else if (kh.a(kf.b((kl.o() + 20) / 32, (t.a + t.c / 2) / 32))) {
                                    kl.a(5);
                                    this.a[0] = false;
                                }
                            }
                            else {
                                kl.a(1, 1);
                            }
                        }
                        else if (this.a[1]) {
                            final int n54 = (t.b + t.d + 8) / 32;
                            final int n55 = (t.a + t.c / 2) / 32;
                            if (!kl.y) {
                                if (kh.b(kf.b(n54, n55))) {
                                    kl.c((n55 << 5) + (32 - t.c) / 2, n54 << 5);
                                    kl.a(8, 2);
                                    break;
                                }
                            }
                            else if (!kh.c(kf.b(n54, n55)) || kh.b(kf.b(n54, n55))) {
                                kl.a(1, 2);
                            }
                            else {
                                kl.a(0);
                            }
                        }
                        if (!kl.y) {
                            if (kl.k == 4) {
                                final int n56 = (t.b + t.d) / 32;
                                final int n57 = (t.a + t.c - 5) / 32;
                                if (!kh.c(kf.b(n56, (t.a + 5) / 32)) && !kh.c(kf.b(n56, n57))) {
                                    if (!kl.y) {
                                        kl.a(6);
                                        break;
                                    }
                                    break;
                                }
                            }
                            else if (kl.k == 8) {
                                final int n58 = (t.b + t.d) / 32;
                                final int n59 = (t.a + 5) / 32;
                                if (!kh.c(kf.b(n58, (t.a + t.c - 5) / 32)) && !kh.c(kf.b(n58, n59))) {
                                    final int n60 = (t.b + t.d) / 32;
                                    final int n61 = t.a / 32;
                                    final int a2 = t.a;
                                    final int c2 = t.c;
                                    if (!kh.d(kf.b(n60, n61))) {
                                        if (!kl.y) {
                                            kl.a(6);
                                            break;
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                        this.a(t, kf, kh, kl);
                        break;
                    }
                }
            }
            kh.b(t);
        }
    }
    
    private static boolean a(final k k, final kl kl, final kf kf, final kh kh, final boolean b) {
        final int n = (k.b + k.d / 2) / 32;
        final int n2 = (k.a - kl.i) / 32;
        if (kh.n(kf.b(n, n2))) {
            if (b) {
                kl.f(n2 + 1 << 5);
            }
            return true;
        }
        return false;
    }
    
    private static boolean b(final k k, final kl kl, final kf kf, final kh kh, final boolean b) {
        final int n = (k.b + k.d / 2) / 32;
        final int n2 = (k.a + k.c + kl.i) / 32;
        if (kh.m(kf.b(n, n2))) {
            if (b) {
                kl.f((n2 - 1 << 5) - (k.c - 32));
            }
            return true;
        }
        return false;
    }
    
    private void a(final k k, final kf kf, final kh kh, final kl kl) {
        if (!this.a[2]) {
            if (this.a[3]) {
                final int n = (k.b + k.d) / 32;
                final int n2 = k.a / 32;
                final int n3 = (k.a + k.c) / 32;
                if (!kl.y) {
                    if (!kh.c(kf.b(n, n3)) && kh.d(kf.b(n, n2))) {
                        kl.a(1, 10);
                        return;
                    }
                    final int n4 = (k.a + k.c) / 32;
                    final int n5 = k.a / 32;
                    if (!kh.c(kf.b(n, n5)) && kh.l(kf.b(n, n4))) {
                        kl.a(1, 9);
                        return;
                    }
                    if (kh.l(kf.b(n, n4))) {
                        kl.a(1, 9);
                        return;
                    }
                    if (kh.d(kf.b(n, n5))) {
                        kl.a(1, 10);
                        return;
                    }
                    kl.a(1, 8);
                }
                else {
                    kl.a(1, 8);
                }
            }
            return;
        }
        final int n6 = (k.b + k.d) / 32;
        final int n7 = k.a / 32;
        final int n8 = (k.a + k.c) / 32;
        if (kl.y) {
            kl.a(1, 4);
            return;
        }
        if (!kh.c(kf.b(n6, n8)) && kh.d(kf.b(n6, n7))) {
            kl.a(1, 5);
            return;
        }
        if (!kh.c(kf.b(n6, n7)) && kh.l(kf.b(n6, n8))) {
            kl.a(1, 6);
            return;
        }
        if (kh.l(kf.b(n6, n8))) {
            kl.a(1, 6);
            return;
        }
        if (kh.d(kf.b(n6, n7))) {
            kl.a(1, 5);
            return;
        }
        kl.a(1, 4);
    }
    
    private void a(final kl kl, final k k, final kf kf, final kh kh) {
        final int n = (k.b + k.d) / 32;
        if (this.a[2]) {
            final int n2 = (k.a - kl.i) / 32;
            if ((kl.k & 0x4) == 0x0) {
                kl.b(4);
            }
            else if (!a(k, kl, kf, kh, false) && !kh.n(kf.b(n, n2))) {
                k.a += kl.i * kl.b[4];
            }
        }
        else if (this.a[3]) {
            final int n3 = (k.a + k.c + kl.i) / 32;
            if ((kl.k & 0x8) == 0x0) {
                kl.b(8);
            }
            else if (!b(k, kl, kf, kh, false) && !kh.m(kf.b(n, n3))) {
                k.a += kl.i * kl.b[8];
            }
        }
        if (this.a[0] || this.a[1] || this.a[4]) {
            final int n4 = (k.a + k.c / 2) / 32;
            final int n5 = (k.b + k.d - 5) / 32;
            final int n6 = (k.b + 10) / 32;
            if (kh.b(kf.b(n5, n4)) && kh.b(kf.b(n6, n4))) {
                kl.f((n4 << 5) + (32 - k.c) / 2);
                kl.a(8, this.a[1] ? 2 : 1);
                this.a[2] = (this.a[3] = false);
            }
        }
    }
    
    public final void a(final int n, final kl kl) {
        switch (n) {
            case 99:
            case 150: {
                this.a[0] = true;
                this.a[1] = false;
                return;
            }
            case 98:
            case 156: {
                this.a[1] = true;
                this.a[0] = false;
                return;
            }
            case 97:
            case 152: {
                this.a[2] = true;
                this.a[3] = false;
                return;
            }
            case 96:
            case 154: {
                this.a[3] = true;
                this.a[2] = false;
                return;
            }
            case 95:
            case 153: {
                if (kl.j == 0 || kl.j == 1) {
                    kl.a(4);
                }
                this.a();
                return;
            }
            case 149: {
                this.a[0] = (this.a[2] = true);
                return;
            }
            case 151: {
                this.a[0] = (this.a[3] = true);
                break;
            }
        }
    }
    
    public final void a(final int n) {
        switch (n) {
            case 99:
            case 150: {
                this.a[0] = false;
                return;
            }
            case 98:
            case 156: {
                this.a[1] = false;
                return;
            }
            case 97:
            case 152: {
                this.a[2] = false;
                return;
            }
            case 96:
            case 154: {
                this.a[3] = false;
                return;
            }
            case 95:
            case 153: {
                return;
            }
            case 149: {
                this.a[0] = (this.a[2] = false);
                return;
            }
            case 151: {
                this.a[0] = (this.a[3] = false);
                break;
            }
        }
    }
    
    public final void a() {
        final boolean[] a = this.a;
        final int n = 2;
        final boolean[] a2 = this.a;
        final int n2 = 3;
        final boolean[] a3 = this.a;
        final int n3 = 0;
        final boolean[] a4 = this.a;
        final int n4 = 1;
        final boolean[] a5 = this.a;
        final int n5 = 4;
        final boolean b = false;
        a5[n5] = b;
        a3[n3] = (a4[n4] = b);
        a[n] = (a2[n2] = b);
    }
}
