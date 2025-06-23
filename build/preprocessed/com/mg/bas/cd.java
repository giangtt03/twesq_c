package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// Abstract base class for UI/game panels with menu logic, manages children and rendering. Extends an and implements bf.
import com.mg.smsgame.MGMIDlet;

public abstract class cd
extends an
implements bf {
    private int[] a;
    private int b;
    private String c;
    private boolean d;
    private az k;
    private boolean l;
    private cc[] m;

    public cd(int n) {
        super(n);
    }

    public final void d() {
        this.c = cs.h();
        this.a = cs.f();
        this.b = 0;
        int n = this.a.length - 1;
        while (n >= 0) {
            if (this.a[n] < 0) {
                this.b = n;
                break;
            }
            --n;
        }
        this.m = new cc[this.a.length];
        int n2 = 0;
        while (n2 < this.m.length) {
            if (this.a[n2] != -1 && this.a[n2] != 0) {
                int[] cfr_ignored_0 = this.a;
            }
            this.m[n2] = new cc(null, this.a[n2], this.a[n2]);
            this.m[n2].k(0);
            ++n2;
        }
        this.d = cs.e() == null;
        if (!this.d) {
            az az2 = cd.a("Trở về", 5);
            this.b(az2, true);
        }
        az az2 = cd.a("Cần biết", 6);
        this.a(az2, true);
        this.k = cd.a("Mở", 1);
        ((am)this).a((az)null);
        if (this.a[this.b] < 0) {
            ((am)this).a(this.k);
        }
        this.l = cs.a(this.a);
        if (this.l) {
            byte[] byArray2 = cs.g();
            if (byArray2 == null) {
                cs.i();
                MGMIDlet.d().notifyDestroyed();
                return;
            }
            if (this.c != null) {
                bx.a("Chúc mừng bạn đã sưu tập đủ bộ Vật phẩm. Hãy bấm nút gửi để nhận phần thưởng: " + this.c, this.f - 10);
            }
            az2 = null;
            this.b(az2, true);
            this.a((az)null);
            az2 = null;
            this.a(az2, true);
            this.a(cd.a("Gửi", 2));
        }
    }

    private static az a(String string, int n) {
        return new bd(string, n);
    }
}
