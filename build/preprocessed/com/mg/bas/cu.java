package com.mg.bas;
// Data model for a 2D point or coordinate with equals and hashCode implementations.
// Decompiled with: CFR 0.152
// Class Version: 1
public final class cu {
    public int a;
    public int b;

    public cu(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    public cu() {
        this(0, 0);
    }

    public final boolean equals(Object object) {
        if (object != null && object instanceof cu) {
            object = (cu)object;
            return this.a == ((cu)object).a && this.b == ((cu)object).b;
        }
        return false;
    }

    public final int hashCode() {
        int n = 629 + this.a;
        n = n * 17 + this.b;
        return n;
    }
}
