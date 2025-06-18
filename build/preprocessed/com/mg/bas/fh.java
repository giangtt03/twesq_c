package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
final class fh
implements b {
    private fh() {
    }

    public final int a(Object object, Object object2) {
        object = (dc)object;
        object2 = (dc)object2;
        if (((dc)object).j != ((dc)object2).j) {
            return ((dc)object).j - ((dc)object2).j;
        }
        if (((dc)object).k instanceof ll) {
            return go.p.a(((dc)object).k, ((dc)object2).k);
        }
        if (((dc)object).k instanceof lm) {
            return go.q.a(((dc)object).k, ((dc)object2).k);
        }
        return 0;
    }

    fh(byte by) {
        this();
    }
}
