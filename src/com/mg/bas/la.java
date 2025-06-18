package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class la {
    private final int[] a;
    private final dq[] b;
    private int c;

    public la(int n, dq[] dqArray) {
        this.a = new int[n];
        this.b = dqArray;
        if (dqArray != null) {
            n = 0;
            int n2 = 0;
            while (n2 < dqArray.length) {
                int n3 = 0;
                while (n3 < dqArray[n2].b) {
                    this.a[n++] = n2;
                    ++n3;
                }
                ++n2;
            }
        }
        if (this.a.length > 0) {
            this.c = cv.a(this.a.length);
        }
    }

    public final dq a() {
        if (this.b == null) {
            return null;
        }
        dq dq2 = this.b[this.a[this.c]];
        ++this.c;
        if (this.c >= this.a.length) {
            this.c = 0;
        }
        return dq2;
    }
}
