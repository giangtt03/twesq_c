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

    public final void d() {
        az az2;
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
        Object object = this;
        byte[] byArray = cs.e();
        this.d = byArray == null;
        ((cd)object).m = new cc[(null).length];
        int n2 = 0;
        while (n2 < ((cd)object).m.length) {
            if (((cd)object).a[n2] != -1 && ((cd)object).a[n2] != 0) {
                int[] cfr_ignored_0 = ((cd)object).a;
            }
            ((cd)object).m[n2] = new cc(null, (int)null[n2], (int)null[n2]);
            ((cd)object).m[n2].k(0);
            ++n2;
        }
        if (!((cd)object).d) {
            cd cd2 = object;
            cd cd3 = cd2;
            az2 = cd.a("Trở về", 5);
            cd3 = cd2;
            cd2.b(az2, true);
        }
        cd cd4 = object;
        Object object2 = cd4;
        az2 = cd.a("Cần biết", 6);
        object2 = cd4;
        cd4.a(az2, true);
        ((cd)object).k = cd.a("Mở", 1);
        ((am)object).a((az)null);
        if (((cd)object).a[((cd)object).b] < 0) {
            ((am)object).a(((cd)object).k);
        }
        this.l = cs.a(this.a);
        if (this.l) {
            byte[] byArray2 = cs.g();
            object = byArray2;
            if (byArray2 == null) {
                cs.i();
                object2 = MGMIDlet.d();
                object2.notifyDestroyed();
                return;
            }
            if (this.c != null) {
                bx.a("Chúc mừng bạn đã sưu tập đủ bộ Vật phẩm. Hãy bấm nút gửi để nhận phần thưởng: " + this.c, this.f - 10);
            }
            az2 = null;
            object2 = this;
            object2.b(az2, true);
            this.a((az)null);
            az2 = null;
            object2 = this;
            object2.a(az2, true);
            this.a(cd.a("Gửi", 2));
        }
    }

    private static az a(String string, int n) {
        return new bd(string, n);
    }
}
