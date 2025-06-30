package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class mz
extends mq {
    public mz(ms ms2, mt mt2, oq oq2) {
        super(ms2, mt2, oq2);
        ct.a(" [ViewMatchControler] =======================View========================");
    }

    public final void c(int n, int n2) {
    }

    public final void b(int n, int n2) {
    }

    public final void a(int n, int n2) {
    }

    public final void b(int n) {
    }

    public final void c(int n) {
    }

    public final void a(String s, String string) {
        this.b.b(string);
    }

    public final void a() {
        this.b.k();
    }

    public final void c() {
        oa.d = false;
        this.p();
    }

    protected final void d() {
    }

    protected final void e() {
        this.d(7);
    }

    protected final void a(int n, int n2, int n3, int n4, int n5, int[] nArray, int[] nArray2, ll[] llArray, lm[] lmArray) {
        this.g = n;
        this.d(9);
    }

    protected final void c(nq nq2) {
        ct.a("[ViewMathchController]=====processSwap===== rv =" + nq2.b);
        this.a(nq2, true);
        if (nq2.g != null) {
            int n = 0;
            while (n < nq2.g.length) {
                this.b(nq2.g[n]);
                ++n;
            }
        }
        this.a(nq2.h);
        this.a(1, nq2.j, nq2.k, nq2.l, nq2.m);
        this.v = nq2;
        this.b.e();
        this.m = nq2.b;
    }
}
