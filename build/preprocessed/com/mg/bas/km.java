package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class km
extends jv {
    private boolean[] a = new boolean[5];
    private int b = 0;
    private int c = 0;

    /*
     * Unable to fully structure code
     */
    public final void a(at var1_1, kh var2_2) {
        block115: {
            if ((var1_1 = (kl)var1_1) == null) break block115;
            var1_1.i();
            var6_3 = (kf)var2_2.a(1);
            var7_4 = var1_1.t;
            var3_5 = var1_1;
            switch (var3_5.j) {
                case 5: {
                    var7_4.b -= var1_1.s;
                    var1_1.w += var1_1.s;
                    --var1_1.s;
                    if (var1_1.s == 0) {
                        var1_1.a(6);
                        break;
                    }
                    var3_6 = (var1_1.o() + 20) / 32;
                    if (!kh.a(var6_3.b(var3_6, var4_29 = (var7_4.a + var7_4.c / 2) / 32))) {
                        var1_1.a(6);
                    }
                    this.a((kl)var1_1, var7_4, var6_3, var2_2);
                    break;
                }
                case 6: {
                    var7_4.b += var1_1.s;
                    var1_1.s += 2;
                    if (var1_1.s > var1_1.a) {
                        var1_1.s = var1_1.a;
                    }
                    var8_37 = (var7_4.b + var7_4.d - var1_1.a) / 32;
                    var3_7 = (var7_4.b + var7_4.d) / 32;
                    var4_30 = var7_4.a / 32;
                    var5_39 = (var7_4.a + var7_4.c) / 32;
                    if (kh.l(var6_3.b(var3_7, var5_39))) {
                        var4_30 = var1_1.k;
                        if (var4_30 == 4) {
                            var4_30 = var1_1.k | 2;
                        } else if (var4_30 == 8) {
                            var4_30 = var1_1.k | 1;
                        }
                        var1_1.a(7, var4_30);
                        var5_39 = 32 - (var7_4.a + var7_4.c) % 32;
                        var1_1.c(var7_4.a, (var3_7 << 5) - var7_4.d + var5_39);
                        break;
                    }
                    if (kh.d(var6_3.b(var3_7, var4_30))) {
                        var4_30 = var1_1.k;
                        if (var4_30 == 4) {
                            var4_30 = var1_1.k | 1;
                        } else if (var4_30 == 8) {
                            var4_30 = var1_1.k | 8;
                        }
                        var1_1.a(7, var4_30);
                        var1_1.c(var7_4.a, (var3_7 << 5) - var7_4.d + var7_4.a % 32);
                        break;
                    }
                    var4_30 = (var7_4.a + 5) / 32;
                    var5_39 = (var7_4.a + var7_4.c - 5) / 32;
                    if (kh.c(var6_3.b(var3_7, var4_30))) {
                        if (var8_37 == var3_7) break;
                        var1_1.a(7);
                        var1_1.c(var7_4.a, (var3_7 - 1 << 5) - (var7_4.d - 32));
                        break;
                    }
                    if (kh.c(var6_3.b(var3_7, var5_39))) {
                        if (var8_37 == var3_7) break;
                        var1_1.a(7);
                        var1_1.c(var7_4.a, (var3_7 - 1 << 5) - (var7_4.d - 32));
                        break;
                    }
                    this.a((kl)var1_1, var7_4, var6_3, var2_2);
                    break;
                }
                case 7: {
                    var3_5 = var1_1;
                    if (var3_5.d.j()) {
                        var1_1.a(0);
                    }
                    this.a(var7_4, var6_3, var2_2, (kl)var1_1);
                    if (!((var1_1.k & 4) != 0 ? km.a(var7_4, (kl)var1_1, var6_3, var2_2, true) != false : (var1_1.k & 8) != 0 && km.b(var7_4, (kl)var1_1, var6_3, var2_2, true) != false)) break;
                    return;
                }
                case 8: {
                    if (var1_1.k != 1 || kh.b(var6_3.b(var3_8 = (var7_4.b + 10) / 32, var4_31 = (var7_4.a + var7_4.c / 2) / 32))) break;
                    this.b = var7_4.b + var7_4.d - (var3_8 + 1 << 5);
                    this.c = this.b / 3;
                    break;
                }
                case 2: {
                    if (this.a[0]) {
                        var1_1.v = true;
                        if (var1_1.k == 2) {
                            var1_1.k = 1;
                            var1_1.g.s();
                        }
                        var1_1.b(0, var1_1.i * kl.c[1]);
                        var3_9 = (var7_4.b + 10) / 32;
                        var4_32 = (var7_4.a + var7_4.c / 2) / 32;
                        if (!kh.b(var6_3.b(var3_9, var4_32))) {
                            this.b = var7_4.b + var7_4.d - (var3_9 + 1 << 5);
                            this.c = this.b / 3;
                            var1_1.a(3);
                        } else {
                            var3_9 = (var7_4.b + var7_4.d) / 32;
                            var5_40 = var7_4.b / 32;
                            if (kh.b(var6_3.b(var5_40, var4_32)) && kh.c(var6_3.b(var3_9, var4_32))) {
                                this.b = var7_4.b + var7_4.d - (var3_9 + 1 << 5);
                                this.c = this.b / 3;
                                var1_1.a(3);
                            }
                        }
                    } else if (this.a[1]) {
                        var1_1.v = true;
                        if (var1_1.k == 1) {
                            var1_1.k = 2;
                            var1_1.g.t();
                        }
                        var1_1.b(0, var1_1.i * kl.c[2]);
                        var3_10 = (var7_4.b + var7_4.d) / 32;
                        var4_33 = (var7_4.a + var7_4.c / 2) / 32;
                        if (!kh.b(var6_3.b(var3_10, var4_33))) {
                            var1_1.g(var3_10 - 1 << 5);
                            var1_1.a(3);
                        } else if (kh.c(var6_3.b(var3_10, var4_33))) {
                            var1_1.g(var3_10 - 1 << 5);
                            var1_1.a(3);
                        }
                    } else {
                        var1_1.v = false;
                    }
                    if (this.a[2]) {
                        this.a[1] = false;
                        this.a[0] = false;
                        var1_1.f(var7_4.a - 16);
                        var1_1.a(6, 4);
                        break;
                    }
                    if (!this.a[3]) break;
                    this.a[1] = false;
                    this.a[0] = false;
                    var1_1.f(var7_4.a + 16);
                    var1_1.a(6, 8);
                    break;
                }
                case 3: {
                    if (var1_1.k == 1) {
                        var7_4.b += this.c * kl.c[var1_1.k];
                    }
                    var3_5 = var1_1;
                    if (!var3_5.d.j()) break;
                    this.c = 0;
                    this.b = 0;
                    var3_11 = var7_4.b / 32;
                    var1_1.g(var3_11 << 5);
                    var1_1.a(0);
                    var3_12 = this;
                    var3_12.a();
                    v.c();
                    var3_13 = (var7_4.b + var7_4.d) / 32;
                    var4_34 = (var7_4.a + var7_4.c / 2) / 32;
                    if (kh.c(var6_3.b(var3_13, var4_34))) break;
                    var1_1.a(6);
                    break;
                }
                case 1: {
    if (this.a[0]) {
        if (!var1_1.y) {
            int var3_14 = (var7_4.b + var7_4.d / 2) / 32;
            int var4_35 = (var7_4.a + var7_4.c / 2) / 32;
            if (kh.b(var6_3.b(var3_14, var4_35))) {
                var1_1.f((var4_35 << 5) + (32 - var7_4.c) / 2);
                var1_1.a(8, 1);
                this.a[3] = false;
                this.a[2] = false;
            } else {
                var3_14 = (var1_1.o() + 20) / 32;
                var4_35 = (var7_4.a + var7_4.c / 2) / 32;
                if (kh.a(var6_3.b(var3_14, var4_35))) {
                    var1_1.a(5);
                    this.a[0] = false;
                }
            }
        } else if (var1_1.k != 1) {
            var1_1.a(1, 1);
        }
    } else if (this.a[1]) {
        int var3_15 = (var7_4.b + var7_4.d + 8) / 32;
        int var4_35 = (var7_4.a + var7_4.c / 2) / 32;
        if (var1_1.y) {
            if (!kh.c(var6_3.b(var3_15, var4_35)) || kh.b(var6_3.b(var3_15, var4_35))) {
                if (var1_1.k != 2) {
                    var1_1.a(1, 2);
                }
            } else {
                var1_1.a(0);
            }
        }
    }

    // Phần xử lý cho this.a[2]
    if (this.a[2]) {
        if (var1_1.k == 4) {
            if (!km.a(var7_4, (kl)var1_1, var6_3, var2_2, true)) {
                int var3_16 = (var7_4.b + var7_4.d) / 32;
                int var4_35 = (var7_4.a + var7_4.c - 5) / 32;
                int var5_41 = (var7_4.a + 5) / 32;
                var6_3.b(var3_16, var4_35);
                if (!kh.c(var6_3.b(var3_16, var5_41)) && !kh.c(var6_3.b(var3_16, var4_35))) {
                    if (!var1_1.y) {
                        var1_1.a(6);
                    }
                } else {
                    var3_16 = (var7_4.b + var7_4.d) / 32;
                    var4_35 = (var7_4.a + var7_4.c - var1_1.i) / 32;
                    int v0 = var6_3.b(var3_16, var4_35);
                    var5_41 = v0;
                    if (kh.l(v0)) {
                        var1_1.c(((var4_35 + 1) << 5) - var7_4.c, (var3_16 << 5) - var7_4.d);
                        var1_1.a(1, 6);
                    } else {
                        var3_16 = (var7_4.b + var7_4.d - var1_1.i) / 32;
                        var4_35 = (var7_4.a - var1_1.i) / 32;
                        int v1 = var6_3.b(var3_16, var4_35);
                        var5_41 = v1;
                        if (kh.d(v1)) {
                            var1_1.c((var4_35 + 1) << 5, (var3_16 << 5) - (var7_4.d - 32));
                            var1_1.a(1, 5);
                        }
                    }
                }
            }
        } else if (var1_1.k == 5) {
            int var3_17 = (var7_4.b + var7_4.d) / 32;
            int var4_35 = var7_4.a / 32;
            int var5_41 = (var7_4.b + var7_4.d - var1_1.i) / 32;
            int var8_38 = (var7_4.a - var1_1.i) / 32;
            if (var3_17 != var5_41) {
                if (var4_35 == var8_38) {
                    if (!kh.d(var6_3.b(var5_41, var8_38 - 1)) && !kh.d(var6_3.b(var5_41, var8_38))) {
                        var1_1.c(var8_38 << 5, ((var5_41 + 1) << 5) - var7_4.d);
                        var1_1.a(1, 4);
                    }
                } else if (!kh.d(var6_3.b(var5_41, var8_38))) {
                    var1_1.c(var4_35 << 5, ((var5_41 + 1) << 5) - var7_4.d);
                    var1_1.a(1, 4);
                }
            }
        } else if (var1_1.k == 6) {
            int var3_18 = (var7_4.b + var7_4.d) / 32;
            int var4_35 = (var7_4.a + var7_4.c) / 32;
            int var5_41 = (var7_4.b + var7_4.d + var1_1.i) / 32;
            int var8_38 = (var7_4.a + var7_4.c - var1_1.i) / 32;
            if (var3_18 != var5_41) {
                if (var4_35 == var8_38) {
                    if (!kh.l(var6_3.b(var5_41, var8_38 - 1)) && !kh.l(var6_3.b(var5_41, var8_38))) {
                        var1_1.c((var8_38 << 5) - var7_4.c, (var5_41 << 5) - var7_4.d);
                        var1_1.a(1, 4);
                    }
                } else if (!kh.l(var6_3.b(var5_41, var8_38))) {
                    var1_1.c(((var8_38 + 1) << 5) - var7_4.c, (var5_41 << 5) - var7_4.d);
                    var1_1.a(1, 4);
                }
            }
        } else {
            if (var1_1.k == 10) {
                var1_1.a(1, 5);
            } else if (var1_1.k == 9) {
                var1_1.a(1, 6);
            } else {
                var1_1.a(1, 4);
            }
        }
    } else if (this.a[3]) {
        if (!km.b(var7_4, (kl)var1_1, var6_3, var2_2, true)) {
            if (var1_1.k == 8) {
                int var3_19 = (var7_4.b + var7_4.d) / 32;
                int var4_35 = (var7_4.a + 5) / 32;
                int var5_41 = (var7_4.a + var7_4.c - 5) / 32;
                var6_3.b(var3_19, var4_35);
                if (!kh.c(var6_3.b(var3_19, var5_41)) && !kh.c(var6_3.b(var3_19, var4_35))) {
                    if (!var1_1.y) {
                        var1_1.a(6);
                    }
                } else {
                    var3_19 = (var7_4.b + var7_4.d + var1_1.i) / 32;
                    var4_35 = (var7_4.a + var1_1.i) / 32;
                    int v2 = var6_3.b(var3_19, var4_35);
                    var5_41 = v2;
                    if (kh.d(v2)) {
                        var1_1.c((var4_35 << 5) + 1, (var3_19 << 5) - var7_4.d + 1);
                        var1_1.a(1, 10);
                    } else {
                        var3_19 = (var7_4.b + var7_4.d - var1_1.i) / 32;
                        var4_35 = (var7_4.a + var7_4.c + var1_1.i) / 32;
                        var6_3.b(var3_19, var4_35);
                        if (kh.l(var6_3.b(var3_19, var4_35))) {
                            var1_1.c((var4_35 << 5) - var7_4.c, (var3_19 << 5) + (32 - var7_4.d));
                            var1_1.a(1, 9);
                        }
                    }
                }
            } else if (var1_1.k == 10) {
                int var3_20 = (var7_4.b + var7_4.d) / 32;
                int var4_35 = var7_4.a / 32;
                int var5_41 = (var7_4.b + var7_4.d + var1_1.i) / 32;
                int var8_38 = (var7_4.a + var1_1.i) / 32;
                if (var3_20 != var5_41) {
                    if (var4_35 != var8_38 && !kh.d(var6_3.b(var5_41, var8_38))) {
                        var1_1.c(var8_38 << 5, (var5_41 << 5) - var7_4.d);
                        var1_1.a(1, 8);
                    }
                } else if (var4_35 != var8_38 && !kh.d(var6_3.b(var5_41, var8_38)) && !kh.d(var6_3.b(var5_41 + 1, var8_38))) {
                    var1_1.c(var8_38 << 5, ((var5_41 + 1) << 5) - var7_4.d);
                    var1_1.a(1, 8);
                }
            } else if (var1_1.k == 9) {
                int var3_21 = (var7_4.b + var7_4.d) / 32;
                int var4_35 = (var7_4.a + var7_4.c) / 32;
                int var5_41 = (var7_4.b + var7_4.d - var1_1.i) / 32;
                int var8_38 = (var7_4.a + var7_4.c + var1_1.i) / 32;
                if (var3_21 != var5_41) {
                    if (var4_35 != var8_38 && !kh.l(var6_3.b(var5_41, var8_38))) {
                        var1_1.c((var8_38 << 5) - var7_4.c, (var5_41 << 5) + (32 - var7_4.d));
                        var1_1.a(1, 8);
                    }
                } else if (var4_35 != var8_38 && !kh.l(var6_3.b(var3_21, var8_38)) && !kh.l(var6_3.b(var3_21 - 1, var8_38))) {
                    var1_1.c((var8_38 << 5) - var7_4.c, (var5_41 << 5) - var7_4.d);
                    var1_1.a(1, 8);
                }
            } else {
                if (var1_1.k == 6) {
                    var1_1.a(1, 9);
                } else if (var1_1.k == 5) {
                    var1_1.a(1, 10);
                } else {
                    var1_1.a(1, 8);
                }
            }
        }
    } else {
        if (!var1_1.y) {
            var1_1.a(0);
        }
    }

    // Kiểm tra nếu không còn a[] nào true thì reset
    boolean anyTrue = false;
    for (int i = 0; i < this.a.length; i++) {
        if (this.a[i]) {
            anyTrue = true;
            break;
        }
    }
    if (!anyTrue) {
        var1_1.a(0);
    }

    // Xử lý cuối cùng cho var1_1.j == 1
    if (var1_1.j == 1) {
        var1_1.b(kl.b[var1_1.k] * var1_1.i, kl.c[var1_1.k] * var1_1.i);
        if (var1_1.k == 4) {
            int var3_23 = (var7_4.b + var7_4.d - 1) / 32;
            int var4_35 = (var7_4.a - 1) / 32;
            if (var2_2.n(var6_3.b(var3_23, var4_35))) {
                var1_1.f((var4_35 + 1) << 5);
            }
        } else if (var1_1.k == 8) {
            int var3_24 = (var7_4.b + var7_4.d - 1) / 32;
            int var4_35 = (var7_4.a + var7_4.c) / 32;
            if (var2_2.n(var6_3.b(var3_24, var4_35))) {
                var1_1.f(((var4_35 - 1) << 5) - (var7_4.c - 32));
            }
        }
    }
    break;
}
                case 0: {
                    if (this.a[0]) {
                        if (!var1_1.y) {
                            var3_25 = (var7_4.b + var7_4.d / 2) / 32;
                            var4_36 = (var7_4.a + var7_4.c / 2) / 32;
                            if (kh.b(var6_3.b(var3_25, var4_36))) {
                                var1_1.f((var4_36 << 5) + (32 - var7_4.c) / 2);
                                var1_1.a(8, 1);
                            } else {
                                var3_25 = (var1_1.o() + 20) / 32;
                                if (kh.a(var6_3.b(var3_25, var4_36 = (var7_4.a + var7_4.c / 2) / 32))) {
                                    var1_1.a(5);
                                    this.a[0] = false;
                                }
                            }
                        } else {
                            var1_1.a(1, 1);
                        }
                    } else if (this.a[1]) {
                        var3_26 = (var7_4.b + var7_4.d + 8) / 32;
                        var4_36 = (var7_4.a + var7_4.c / 2) / 32;
                        if (!var1_1.y) {
                            if (kh.b(var6_3.b(var3_26, var4_36))) {
                                var1_1.c((var4_36 << 5) + (32 - var7_4.c) / 2, var3_26 << 5);
                                var1_1.a(8, 2);
                                break;
                            }
                        } else if (!kh.c(var6_3.b(var3_26, var4_36)) || kh.b(var6_3.b(var3_26, var4_36))) {
                            var1_1.a(1, 2);
                        } else {
                            var1_1.a(0);
                        }
                    }
                    if (!var1_1.y) {
                        if (var1_1.k == 4) {
                            var3_27 = (var7_4.b + var7_4.d) / 32;
                            var4_36 = (var7_4.a + var7_4.c - 5) / 32;
                            var5_42 = (var7_4.a + 5) / 32;
                            if (!kh.c(var6_3.b(var3_27, var5_42)) && !kh.c(var6_3.b(var3_27, var4_36))) {
                                if (var1_1.y) break;
                                var1_1.a(6);
                                break;
                            }
                        } else if (var1_1.k == 8) {
                            var3_28 = (var7_4.b + var7_4.d) / 32;
                            var4_36 = (var7_4.a + 5) / 32;
                            var5_43 = (var7_4.a + var7_4.c - 5) / 32;
                            if (!kh.c(var6_3.b(var3_28, var5_43)) && !kh.c(var6_3.b(var3_28, var4_36))) {
                                var3_28 = (var7_4.b + var7_4.d) / 32;
                                var4_36 = var7_4.a / 32;
                                if (!kh.d(var6_3.b(var3_28, var4_36))) {
                                    if (var1_1.y) break;
                                    var1_1.a(6);
                                    break;
                                }
                            }
                        }
                    }
                    this.a(var7_4, var6_3, var2_2, (kl)var1_1);
                }
            }
            var2_2.b(var7_4);
        }
    }

    private static boolean a(k k2, kl kl2, kf kf2, kh kh2, boolean bl) {
        int n = (k2.b + k2.d / 2) / 32;
        int n2 = (k2.a - kl2.i) / 32;
        if (kh2.n(kf2.b(n, n2))) {
            if (bl) {
                kl2.f(n2 + 1 << 5);
            }
            return true;
        }
        return false;
    }

    private static boolean b(k k2, kl kl2, kf kf2, kh kh2, boolean bl) {
        int n = (k2.b + k2.d / 2) / 32;
        int n2 = (k2.a + k2.c + kl2.i) / 32;
        if (kh2.m(kf2.b(n, n2))) {
            if (bl) {
                kl2.f((n2 - 1 << 5) - (k2.c - 32));
            }
            return true;
        }
        return false;
    }

    private void a(k k2, kf kf2, kh kh2, kl kl2) {
        if (this.a[2]) {
            int n = (k2.b + k2.d) / 32;
            int n2 = k2.a / 32;
            int n3 = (k2.a + k2.c) / 32;
            if (!kl2.y) {
                if (!kh.c(kf2.b(n, n3)) && kh.d(kf2.b(n, n2))) {
                    kl2.a(1, 5);
                    return;
                }
                if (!kh.c(kf2.b(n, n2)) && kh.l(kf2.b(n, n3))) {
                    kl2.a(1, 6);
                    return;
                }
                if (kh.l(kf2.b(n, n3))) {
                    kl2.a(1, 6);
                    return;
                }
                if (kh.d(kf2.b(n, n2))) {
                    kl2.a(1, 5);
                    return;
                }
                kl2.a(1, 4);
                return;
            }
            kl2.a(1, 4);
            return;
        }
        if (this.a[3]) {
            int n = (k2.b + k2.d) / 32;
            int n4 = k2.a / 32;
            int n5 = (k2.a + k2.c) / 32;
            if (!kl2.y) {
                if (!kh.c(kf2.b(n, n5)) && kh.d(kf2.b(n, n4))) {
                    kl2.a(1, 10);
                    return;
                }
                n4 = (k2.a + k2.c) / 32;
                n5 = k2.a / 32;
                if (!kh.c(kf2.b(n, n5)) && kh.l(kf2.b(n, n4))) {
                    kl2.a(1, 9);
                    return;
                }
                if (kh.l(kf2.b(n, n4))) {
                    kl2.a(1, 9);
                    return;
                }
                if (kh.d(kf2.b(n, n5))) {
                    kl2.a(1, 10);
                    return;
                }
                kl2.a(1, 8);
                return;
            }
            kl2.a(1, 8);
        }
    }

    private void a(kl kl2, k k2, kf kf2, kh kh2) {
        int n;
        int n2 = (k2.b + k2.d) / 32;
        if (this.a[2]) {
            n = (k2.a - kl2.i) / 32;
            if ((kl2.k & 4) == 0) {
                kl2.b(4);
            } else if (!km.a(k2, kl2, kf2, kh2, false) && !kh2.n(kf2.b(n2, n))) {
                k2.a += kl2.i * kl.b[4];
            }
        } else if (this.a[3]) {
            n = (k2.a + k2.c + kl2.i) / 32;
            if ((kl2.k & 8) == 0) {
                kl2.b(8);
            } else if (!km.b(k2, kl2, kf2, kh2, false) && !kh2.m(kf2.b(n2, n))) {
                k2.a += kl2.i * kl.b[8];
            }
        }
        if (this.a[0] || this.a[1] || this.a[4]) {
            n = (k2.a + k2.c / 2) / 32;
            n2 = (k2.b + k2.d - 5) / 32;
            int n3 = (k2.b + 10) / 32;
            if (kh.b(kf2.b(n2, n)) && kh.b(kf2.b(n3, n))) {
                kl2.f((n << 5) + (32 - k2.c) / 2);
                kl2.a(8, this.a[1] ? 2 : 1);
                this.a[3] = false;
                this.a[2] = false;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void a(int var1_1, kl var2_3) {
        switch (var1_1) {
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
    var1_2 = var2_3;
    if (var1_2.j == 0 || var1_2.j == 1) {
        var2_3.a(4);
    }
    this.a();
    return;
}

            case 149: {
                this.a[2] = true;
                this.a[0] = true;
                return;
            }
            case 151: {
                this.a[3] = true;
                this.a[0] = true;
            }
        }
    }

    public final void a(int n) {
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
                this.a[2] = false;
                this.a[0] = false;
                return;
            }
            case 151: {
                this.a[3] = false;
                this.a[0] = false;
            }
        }
    }

    public final void a() {
        this.a[4] = false;
        this.a[1] = false;
        this.a[0] = false;
        this.a[3] = false;
        this.a[2] = false;
    }
}
