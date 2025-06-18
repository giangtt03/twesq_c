package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class ls
extends o {
    public ls() {
    }

    public ls(d d2, String string, int n2, int n3, int n4, int n5, int n6) {
        super(d2, string, n2, n3, n4, n5, n6);
    }

    public ls(String string, int n2, int n3, int n4, int n5, int n6) {
        super(bx.d, string, n2, 0, n4, n5, n6);
    }

    protected final void a(String string, int n2, int n3, long l, int n4, int n5) {
        n2 = (int)(l >>> 32);
        int n6 = (int)l;
        if (n2 + 16 > n5) {
            n6 += n4;
            n2 = 0;
        }
        this.a.a(new lo(string, 1, n3, n2, n6, 16));
    }

    protected final n a(String object, int n2, int n3, int n4, int n5, int n6) {
        object = super.a((String)object, n2, n3, n4, n5, n6);
        switch (((n)object).c()) {
            case 3: 
            case 4: 
            case 5: {
                ((q)object).a(com.mg.sq.a.g);
            }
        }
        return object;
    }

    public final int f(int n2) {
        int n3 = n2;
        a a2 = this.a;
        int n4 = 0;
        while (n4 < a2.d()) {
            n n5 = (n)a2.b(n4);
            if (n5.c() == n3) {
                return n4;
            }
            ++n4;
        }
        return -1;
    }
}
