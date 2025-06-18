package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// Game logic or state handler, manages transitions and triggers based on state.
import javax.microedition.lcdui.Graphics;

public final class ny
extends an
implements ik {
    private final int a;
    private boolean b;
    private int c;
    private String d;

    public final void a(String string) {
        this.d = string;
    }

    public ny(int n) {
        super(7);
        this.a((ba)null);
        this.a = n;
        this.c = 5;
        this.b = false;
    }

    protected final void r() {
        System.gc();
    }

    protected final void c() {
        if (this.b) {
            return;
        }
        --this.c;
        if (this.c == 1) {
            System.gc();
            this.b = true;
            switch (this.a) {
                case 0: {
                    ag.b().f(0);
                    return;
                }
                case 1: {
                    pa.a().a(go.w, this);
                    return;
                }
                case 5: {
                    ag.b().a(5, new Object[]{this.d});
                }
            }
        }
    }

    protected final void a(Graphics graphics) {
    }

    public final void a(jn jn2, byte[][] byArray) {
        oa.c = jn2;
        oa.b = byArray;
        ag.b().f(1);
    }

    public final void d() {
    }
}
