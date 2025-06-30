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
        Image result = null;
        if (this.b != null) {
            result = this.b.a(n, false);
            if (result != null) {
                return result;
            }
        }
        long l = n;
        int n2 = 0;
        while (n2 < this.a.d()) {
            ov ov2 = (ov)this.a.b(n2);
            if ((long)ov2.a == l) {
                result = ov2.b;
                break;
            }
            ++n2;
        }
        if (result == null && bl) {
            byte[] byArray = pa.a().b(n, false);
            if (byArray != null) {
                result = f.a(byArray);
                this.a.a(new ov(n, result));
            }
        }
        return result;
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
