package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class dl {
    public ls a;
    public String b;
    public String c;
    public lo d;
    public long e;
    public int f;
    public int g;
    public int h = -1;
    public int i = 0;
    public int j = 0;
    public int k = 0;
    public boolean l = false;
    public int[] m;
    public boolean n = false;
    public boolean o = false;
    public ls p = null;

    public dl(ef object, int n2) {
        Object[] objectArray;
        this.e = ((ef)object).e();
        this.f = ((ef)object).h();
        this.c = ((ef)object).b();
        this.g = ((ef)object).f() - 1;
        this.i = ((ef)object).j();
        this.j = ((ef)object).k();
        this.k = ((ef)object).i();
        boolean bl = this.l = ((ef)object).m() == 1;
        if (!oy.g) {
            this.g = -1;
        }
        int n3 = 0;
        if (this.g >= 0 && this.g < 20) {
            n3 = oy.c[this.g] + 2;
        } else {
            this.g = -1;
        }
        if (((ef)object).g() != null) {
            this.d = new lo("#" + ((ef)object).g() + "#", 1, -1, 0, 0, 16);
        }
        this.a = new ls(((ef)object).c(), n3, 0, n2 - n3, bx.d.a(), 2);
        if (pc.a(this.f)) {
            n3 -= 20;
        }
        q q2 = new q("@" + go.e, 4, -1, 3 - n3, -21, bx.c.a(this.c), bx.c);
        this.a.d().b(q2, 0);
        if (this.c.equals(go.e)) {
            this.m = new int[0];
        } else {
            objectArray = g.a(this.a.d(), 4);
            this.m = new int[objectArray.length - 1];
            System.arraycopy(objectArray, 1, this.m, 0, this.m.length);
        }
        if (!i.b(((ef)object).l())) {
            String[] stringArray = i.a(((ef)object).l(), ";", -1, true);
            objectArray = stringArray;
            if (stringArray != null && objectArray.length > 0) {
                object = String.valueOf(this.j) + " người thích: ";
                boolean bl2 = false;
                if (objectArray[0].equals(go.e)) {
                    object = String.valueOf(object) + "Bạn ";
                    bl2 = true;
                } else {
                    object = String.valueOf(object) + "@" + (String)objectArray[0];
                }
                int n4 = 1;
                int n5 = objectArray.length;
                while (n4 < n5) {
                    object = n4 == 1 && bl2 ? String.valueOf(object) + "và @" + (String)objectArray[n4] : String.valueOf(object) + ", @" + (String)objectArray[n4];
                    ++n4;
                }
                if (objectArray.length < this.j) {
                    object = String.valueOf(object) + ",...";
                }
                this.p = new ls((String)object, 0, 0, n2 - 4, bx.d.a(), 2);
            }
        }
        q2.a("");
        this.h = 0;
        this.a.a(true);
    }

    public final ls a() {
        return this.a(this.h);
    }

    public final ls a(int n2) {
        if (n2 >= 1000) {
            return this.p;
        }
        return this.a;
    }

    public static int b(int n2) {
        if (n2 >= 1000) {
            return n2 - 1000;
        }
        return n2;
    }

    public final void a(long l) {
        long l2;
        long l3 = l2 = l;
        l3 = Math.abs(l2);
        this.b = (l3 /= 1000L) == 0L ? "vừa tức thì" : (l3 < 60L ? String.valueOf(l3) + " giây trước" : ((l3 /= 60L) < 60L ? String.valueOf(l3) + " phút trước" : ((l3 /= 60L) < 24L ? String.valueOf(l3) + " giờ trước" : ((l3 /= 24L) < 30L ? String.valueOf(l3) + " ngày trước" : (l3 < 365L ? String.valueOf(l3 / 30L) + " tháng trước" : String.valueOf(l3 /= 365L) + " năm trước")))));
    }
}
