package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// Callback wrapper class, delegates event handling to another be instance.
final class cj
extends be {
    private final be a;

    cj(be be2) {
        this.a = be2;
    }

    public final void a() {
        if (this.a != null) {
            this.a.a();
        }
    }
}
