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
    public int idx = 0; 
    public int j = 0;
    public int k = 0;
    public boolean l = false;
    public int[] m;
    public boolean n = false;
    public boolean o = false;
    public ls p = null;

    public dl(ef efObj, int n2) {
        this.e = efObj.e();
        this.f = efObj.h();
        this.c = efObj.b();
        this.g = efObj.f() - 1;
        this.idx = efObj.j();
        this.j = efObj.k();
        this.k = efObj.i();
        boolean isLiked = this.l = efObj.m() == 1;
        if (!oy.g) {
            this.g = -1;
        }
        int n3 = 0;
        if (this.g >= 0 && this.g < 20) {
            n3 = oy.c[this.g] + 2;
        } else {
            this.g = -1;
        }
        if (efObj.g() != null) {
            this.d = new lo("#\u001b" + efObj.g() + "#", 1, -1, 0, 0, 16);
        }
        this.a = new ls(efObj.c(), n3, 0, n2 - n3, bx.d.a(), 2);
        if (pc.a(this.f)) {
            n3 -= 20;
        }
        q q2 = new q("@" + go.e, 4, -1, 3 - n3, -21, bx.c.a(this.c), bx.c);
        a dynamicArr = ((o)this.a).d();
        int[] likeArr = com.mg.bas.g.a(dynamicArr, 4); 
        if (this.c.equals(go.e)) {
            this.m = new int[0];
        } else {
            this.m = new int[likeArr.length - 1];
            System.arraycopy(likeArr, 1, this.m, 0, this.m.length);
        }
        if (!com.mg.bas.i.b(efObj.l())) { 
            String[] likeStrArr = com.mg.bas.i.a(efObj.l(), ";", -1, true);
            if (likeStrArr != null && likeStrArr.length > 0) {
                String likeString = String.valueOf(this.j) + " người thích: ";
                boolean bl2 = false;
                if (likeStrArr[0].equals(go.e)) {
                    likeString = String.valueOf(likeString) + "Bạn ";
                    bl2 = true;
                } else {
                    likeString = String.valueOf(likeString) + "@" + likeStrArr[0];
                }
                int n4 = 1;
                int n5 = likeStrArr.length;
                while (n4 < n5) {
                    likeString = n4 == 1 && bl2 ? String.valueOf(likeString) + "và @" + likeStrArr[n4] : String.valueOf(likeString) + ", @" + likeStrArr[n4];
                    ++n4;
                }
                if (likeStrArr.length < this.j) {
                    likeString = String.valueOf(likeString) + ",...";
                }
                this.p = new ls(likeString, 0, 0, n2 - 4, bx.d.a(), 2);
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
