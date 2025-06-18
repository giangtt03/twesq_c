package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class ek
implements b {
    private int a = 1;

    public ek() {
        this(true);
    }

    public ek(boolean bl) {
    }

    public final int a(Object object, Object object2) {
        object = (ef)object;
        object2 = (ef)object2;
        long l = ((ef)object).d() - ((ef)object2).d();
        int n = 0;
        if (l < 0L) {
            n = -1;
        } else if (l > 0L) {
            n = 1;
        }
        return this.a * n;
    }
}
