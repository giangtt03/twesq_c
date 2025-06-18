package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// Comparator for sorting ep objects by their c field (used in VIP icon management).
final class pf
implements b {
    pf(pe pe2) {
    }

    public final int a(Object object, Object object2) {
        if (((ep)object).c > ((ep)object2).c) {
            return 1;
        }
        if (((ep)object).c < ((ep)object2).c) {
            return -1;
        }
        return 0;
    }
}
