package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public abstract class jp
implements jz {
    protected int a;
    protected int b;
    protected int c;
    protected int d;

    protected jp() {
    }

    public final void a(int n, int n2, int n3, int n4) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    public static final jz a(int n) {
        switch (n) {
            case 1: {
                return new jq();
            }
            case 2: {
                return new js();
            }
            case 4: {
                return new jr();
            }
        }
        return null;
    }
}
