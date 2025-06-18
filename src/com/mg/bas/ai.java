package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// Helper class extending be, manages state transitions and notifications for ah objects.
final class ai
extends be {
    private ah a;

    ai(ah ah2) {
        this.a = ah2;
    }

    public final void a() {
        v.af = true;
        if (this.a.e == null) {
            this.a.e = this.a.a("Chú ý", "Mua lượt chơi thành công. Đang lưu...", false);
            this.a.e.b(-10000);
            this.a.e.a(false);
        }
        this.a.a(this.a.e);
        an cfr_ignored_0 = this.a.a;
        this.a.a(-9999, false);
        this.a.b(this.a.e, false);
    }
}
