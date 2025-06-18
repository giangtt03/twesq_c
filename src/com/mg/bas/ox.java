package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Image;

public final class ox {
    private a a;
    private ox b;

    public ox(ox ox2) {
        this.b = ox2;
        this.a = new a();
    }

    public final void a() {
        this.a.a();
    }

    public final Image a(int n, boolean bl) {
        Object object;
        int n2;
        ox ox2;
        block5: {
            if (this.b != null && (ox2 = this.b.a(n, false)) != null) {
                return ox2;
            }
            long l = n;
            ox2 = this;
            n2 = 0;
            while (n2 < ox2.a.d()) {
                ov ov2 = (ov)ox2.a.b(n2);
                if ((long)ov2.a == l) {
                    object = ov2.b;
                    break block5;
                }
                ++n2;
            }
            object = ox2 = null;
        }
        if (object == null && bl) {
            n2 = n;
            Object object2 = pa.a();
            byte[] byArray = ((pa)object2).b(n2, false);
            object2 = byArray;
            if (byArray != null) {
                ox2 = f.a((byte[])object2);
                this.a.a(new ov(n, (Image)ox2));
            }
        }
        return ox2;
    }

    public final void a(int n, Image image) {
        int n2 = 0;
        while (n2 < this.a.d()) {
            ov ov2 = (ov)this.a.b(n2);
            if (ov2.a == n) {
                ov2.b = image;
                return;
            }
            ++n2;
        }
        this.a.a(new ov(n, image));
    }
}
