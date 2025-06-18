package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
final class gp
implements b {
    private gp() {
    }

    public final int a(Object object, Object object2) {
        object = (ll)object;
        object2 = (ll)object2;
        int n = ll.a[((ll)object2).m] - ll.a[((ll)object).m];
        if (n == 0) {
            n = ((ll)object).h - ((ll)object2).h;
            if (n == 0) {
                n = ((ll)object).e - ((ll)object2).e;
                if (n == 0) {
                    n = ((ll)object2).j - ((ll)object).j;
                    if (n == 0) {
                        n = ((ll)object2).i - ((ll)object).i;
                        if (n == 0) {
                            return ((ll)object).c.compareTo(((ll)object2).c);
                        }
                        return n;
                    }
                    return n;
                }
                return n;
            }
            return n;
        }
        return n;
    }

    gp(byte by) {
        this();
    }
}
