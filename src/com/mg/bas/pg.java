package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// Comparator for comparing ep objects to integer values (used in VIP icon management).
final class pg
implements b {
    pg(pe pe2) {
    }

    public final int a(Object object, Object object2) {
        int value = ((Integer)object2).intValue();
        if (((ep)object).c > value) {
            return 1;
        }
        if (((ep)object).c < value) {
            return -1;
        }
        return 0;
    }
}
