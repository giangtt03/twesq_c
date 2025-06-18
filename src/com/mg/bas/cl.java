package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// Callback class for showing a notification dialog and delegating to another callback, extends be.
final class cl
extends be {
    private final be a;

    cl(be be2) {
        this.a = be2;
    }

    public final void a() {
        al al2 = ag.b().a("Chú ý", "Đã gửi tin nhắn thành công", "Đóng", 2, 1);
        al2.b(-10009);
        al2.a(ci.a());
        ag.b().a(al2);
        if (this.a != null) {
            this.a.a();
        }
    }
}
