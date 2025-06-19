package com.mg.bas;
// Game screen or dialog for displaying and managing in-game messages or actions.
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.sq.a;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public final class od
extends nz
implements bf,
bh,
bi {
    private boolean b;
    private int c;
    private gk d;
    private gm k;
    private String[][] l = new String[][]{{"Nút 0:", "He he"}, {"Nút 1:", "Hi hi"}, {"Nút 2:", "Chết nè!"}, {"Nút 3:", "Yếu mà ra gió!"}, {"Nút 4:", "Tưởng bở hả!"}, {"Nút 5:", "Tiếp chiêu nè!"}, {"Nút 6:", "Ăn đòn nè!"}, {"Nút 7:", "Xem đây!"}, {"Nút 8:", "Tha mạng!! hix hix"}, {"Nút 9:", "Không chưởng nha!"}};

    public od(int n) {
        super((byte)0);
        int n2;
        Object object;
        bf bf2;
        try {
            this.c = n;
            this.a(this);
            this.a(new ba());
            bd bd2 = new bd("Lưu", 1);
            bf2 = this;
            bf2.a(bd2, true);
            bd2 = new bd("Hủy", 0);
            bf2 = this;
            bf2.b(bd2, true);
            this.g -= ba.a;
            this.j(true);
            new cu(10, 22);
            int n3 = this.i();
            object = new gh("Game");
            ((aq)object).a_(-1919);
            ((aq)object).d(n3);
            ((gh)object).d(5, 5);
            this.a((aq)object);
            if (go.k != null) {
                object = new gk("Chặn khiêu chiến");
                ((gk)object).a((byte)1);
                ((aq)object).a_(122);
                ((gk)object).a(0, 0, n3, 20);
                ((gk)object).a(this);
                ((gk)object).e(go.k.aa);
                this.a((aq)object);
                object = new gk("Chặn giao dịch");
                ((gk)object).a((byte)1);
                ((aq)object).a_(139);
                ((gk)object).a(0, 0, n3, 20);
                ((gk)object).a(this);
                ((gk)object).e(go.k.aa);
                this.a((aq)object);
            }
            object = new gk("Tự động đăng nhập Ola");
            ((gk)object).a((byte)1);
            ((aq)object).a_(138);
            ((gk)object).a(0, 0, n3, 20);
            ((gk)object).a(this);
            ((gk)object).e(gr.k);
            this.a((aq)object);
            object = new gk("Hiệu ứng đồ họa");
            ((gk)object).a((byte)1);
            ((aq)object).a_(137);
            ((gk)object).a(0, 0, n3, 20);
            ((gk)object).a(this);
            ((gk)object).e(!gr.r);
            this.a((aq)object);
            object = new gk("Hiệu ứng âm thanh");
            ((gk)object).a((byte)1);
            ((aq)object).a_(123);
            ((gk)object).a(0, 0, n3, 20);
            ((gk)object).a(this);
            ((gk)object).e(v.O);
            this.a((aq)object);
            this.d = new gk("Nhạc nền");
            this.d.a((byte)1);
            this.d.a_(124);
            this.d.a(0, 0, n3, 20);
            this.a(this.d);
            this.k = new gm("Âm lượng");
            this.k.a_(125);
            this.k.d(n3);
            this.k.h(v.Q);
            this.k.a(this);
            this.d.a(this);
            this.a(this.k);
            if (!v.N) {
                this.d.e(false);
                v.Q = 0;
            }
            object = new gk("Báo rung");
            ((gk)object).a((byte)1);
            ((aq)object).a_(126);
            ((gk)object).a(0, 0, n3, 20);
            ((gk)object).a(this);
            ((gk)object).e(v.P);
            this.a((aq)object);
            object = new fe("Câu trả lời tự động ");
            ((aq)object).a_(136);
            ((fe)object).a(0, 0, n3, 20);
            n2 = 0;
            while (n2 < this.l.length) {
                bf2 = new fl(this.l[n2][0], this.l[n2][1]);
                ((fe)object).a((fl)bf2);
                ++n2;
            }
            this.a((aq)object);
            object = new gh("Ola");
            ((aq)object).a_(-1919);
            ((aq)object).d(n3);
            ((gh)object).d(12, 5);
            this.a((aq)object);
            object = new gk("Hỗ trợ gõ tiếng Việt có dấu");
            ((gk)object).a((byte)1);
            ((aq)object).a_(127);
            ((gk)object).a(0, 0, n3, 20);
            ((gk)object).a(this);
            ((gk)object).e(v.a);
            this.a((aq)object);
            object = new gk("Đăng nhập ẩn");
            ((gk)object).a((byte)1);
            ((aq)object).a_(132);
            ((gk)object).a(0, 0, n3, 20);
            ((gk)object).a(this);
            ((gk)object).e(!gr.d);
            this.a((aq)object);
            object = new gk("Hiện danh sách nick ẩn");
            ((gk)object).a((byte)1);
            ((aq)object).a_(133);
            ((gk)object).a(0, 0, n3, 20);
            ((gk)object).a(this);
            ((gk)object).e(gr.c);
            this.a((aq)object);
            object = new gk("Lưu thông điệp");
            ((gk)object).a((byte)1);
            ((aq)object).a_(128);
            ((gk)object).a(0, 0, n3, 20);
            ((gk)object).a(this);
            ((gk)object).e(gr.g);
            this.a((aq)object);
            object = new gk("Lưu danh sách nick");
            ((gk)object).a((byte)1);
            ((aq)object).a_(129);
            ((gk)object).a(0, 0, n3, 20);
            ((gk)object).a(this);
            ((gk)object).e(gr.h);
            this.a((aq)object);
            object = new gk("Lưu danh sách chat");
            ((gk)object).a((byte)1);
            ((aq)object).a_(131);
            ((gk)object).a(0, 0, n3, 20);
            ((gk)object).a(this);
            ((gk)object).e(gr.i);
            this.a((aq)object);
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        this.g(1);
        od od2 = this;
        object = cs.a;
        n2 = 0;
        bf2 = od2;
        int n4 = bf2.a.s().length;
        while (n2 < n4) {
            int n5 = od2.f(n2).b();
            if (n5 > 0 && ((u)object).c(n5)) {
                aq aq2;
                Object object2 = ((u)object).a(n5);
                if (od2.f(n2) instanceof gm) {
                    aq2 = (gf)od2.f(n2);
                    ((gf)aq2).h(object2[0]);
                } else if (od2.f(n2) instanceof fe) {
                    aq2 = (fe)od2.f(n2);
                    try {
                        ((fe)aq2).a((byte[])object2);
                    }
                    catch (IOException iOException) {
                        object2 = iOException;
                        iOException.printStackTrace();
                    }
                } else if (od2.f(n2) instanceof gk) {
                    aq2 = (gk)od2.f(n2);
                    ((gk)aq2).e(object2[0] == 0);
                }
            }
            ++n2;
        }
        this.b = v.N;
    }

    public static void d() {
        u u2 = cs.a;
        int n = 0;
        while (n < 17) {
            int n2 = n + 123;
            if (u2.c(n2)) {
                byte[] byArray = u2.a(n2);
                od.h(n2, byArray[0]);
            }
            ++n;
        }
        if (u2.c(140)) {
            gr.m = false;
        }
        u2.c(141);
        if (u2.c(142)) {
            gr.n = false;
        }
        if (u2.c(143)) {
            gr.o = false;
        }
        if (u2.c(144)) {
            gr.p = false;
        }
        if (u2.c(145)) {
            gr.q = false;
        }
    }

    private static void h(int n, int n2) {
        switch (n) {
            case 123: {
                v.O = n2 != 1;
                return;
            }
            case 137: {
                gr.r = n2 != 0;
                return;
            }
            case 124: {
                v.N = n2 != 1;
                return;
            }
            case 126: {
                v.P = n2 != 1;
                return;
            }
            case 138: {
                gr.k = n2 != 1;
                return;
            }
            case 139: {
                gr.l = n2 != 1;
                return;
            }
            case 127: {
                v.a = n2 != 1;
                if (!v.a || !v.ai) break;
                v.b = true;
                return;
            }
            case 129: {
                gr.h = n2 != 1;
                return;
            }
            case 128: {
                gr.g = n2 != 1;
                return;
            }
            case 130: {
                return;
            }
            case 131: {
                gr.i = n2 != 1;
                return;
            }
            case 125: {
                v.Q = n2;
                return;
            }
            case 132: {
                boolean bl = gr.d = n2 != 0;
                if (com.mg.sq.a.m == null || !com.mg.sq.a.o) break;
                com.mg.sq.a.m.I();
                return;
            }
            case 133: {
                boolean bl = gr.c = n2 != 1;
                if (com.mg.sq.a.m == null || !com.mg.sq.a.o) break;
                com.mg.sq.a.m.J();
            }
        }
    }

    public static String[] e() {
        Object object = new String[][]{{"Nút 0:", "He he"}, {"Nút 1:", "Hi hi"}, {"Nút 2:", "Chết nè!"}, {"Nút 3:", "Yếu mà ra gió!"}, {"Nút 4:", "Tưởng bở hả!"}, {"Nút 5:", "Tiếp chiêu nè!"}, {"Nút 6:", "Ăn đòn nè!"}, {"Nút 7:", "Xem đây!"}, {"Nút 8:", "Tha mạng!! hix hix"}, {"Nút 9:", "Không chưởng nha!"}};
        String[] stringArray = null;
        if (cs.a.c(136)) {
            object = cs.a.a(136);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object);
            object = new DataInputStream(byteArrayInputStream);
            String[] stringArray2 = new String[10];
            try {
                int n = 0;
                while (n < 10) {
                    stringArray2[n] = ((DataInputStream)object).readUTF();
                    ++n;
                }
                stringArray = stringArray2;
                byteArrayInputStream.close();
            }
            catch (IOException iOException) {
                IOException iOException2 = iOException;
                iOException.printStackTrace();
            }
        } else {
            stringArray = new String[10];
            int n = 0;
            while (n < 10) {
                stringArray[n] = object[n][1];
                ++n;
            }
        }
        return stringArray;
    }

    public static final void f() {
        byte[] byArray;
        u u2 = cs.a;
        if (gr.d) {
            byte[] byArray2 = new byte[1];
            byArray = byArray2;
            byArray2[0] = 1;
        } else {
            byArray = new byte[1];
        }
        u2.b(132, byArray);
    }

    public static void h(int n) {
        u u2 = cs.a;
        u2.b(n, new byte[]{1});
    }

    /*
     * Unable to fully structure code
     */
   public final void d(int var1_1, int var2_3) {
    switch (var2_3) {
        case 0: {
            ag.b().f(this.c);
            return;
        }
        case 1: {
            Object var1_2 = this;
            cs var2_4 = cs.a;
            int var5_5 = 0;
            int len = ((YourType)var1_2).a.s().length; // Thay YourType bằng kiểu thực tế của this
            while (var5_5 < len) {
                Object var3_6 = ((YourType)var1_2).f(var5_5);
                int var4_8 = ((YourType)var3_6).b();
                byte var6_9 = 0;
                if (var3_6 instanceof gf) {
                    var6_9 = (byte)((gf)var3_6).a();
                    var2_4.a(var4_8, new byte[]{var6_9});
                    od.h(var4_8, var6_9);
                } else if (var3_6 instanceof fe) {
                    var2_4.a(var4_8, ((fe)var3_6).a());
                    od.h(var4_8, var6_9);
                } else if (var3_6 instanceof gk) {
                    boolean var3_7 = ((gk)var3_6).a();
                    var6_9 = (byte)(var3_7 ? 0 : 1);
                    switch (var4_8) {
                        case 124: {
                            if (var3_7 != ((YourType)var1_2).b) {
                                ((YourType)var1_2).b = var3_7;
                                v.N = var3_7;
                                if (var3_7) {
                                    com.mg.sq.a.a(com.mg.sq.a.s().d());
                                    v.Q = ((YourType)var1_2).k.a();
                                    co.b().g();
                                } else {
                                    co.b().d();
                                }
                            }
                            var2_4.a(var4_8, new byte[]{var6_9});
                            break;
                        }
                        case 122: {
                            if (go.k != null && var3_7 != go.k.aa) {
                                ks.a().c(var3_7);
                                com.mg.sq.a.s().a((String) null, (il) null);
                            }
                            var2_4.a(var4_8, new byte[]{var6_9});
                            break;
                        }
                        default: {
                            var2_4.a(var4_8, new byte[]{var6_9});
                        }
                    }
                    od.h(var4_8, var6_9);
                }
                var5_5++;
            }
            var2_4.a();
            ag.b().f(this.c);
            break;
        }
    }
}

    public final void a(aq aq2, boolean bl) {
        if (aq2.equals(this.d)) {
            if (bl) {
                this.k.h(50);
                return;
            }
            this.k.h(0);
        }
    }

    public final void a(aq aq2, int n) {
        boolean bl;
        if (aq2.equals(this.k) && (bl = n > 0) != this.d.a()) {
            this.d.e(bl);
        }
    }
}
