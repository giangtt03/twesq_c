package com.mg.bas;
// Utility class for encoding, validation, and static state management, used in game logic.
// Decompiled with: CFR 0.152
// Class Version: 1
import java.io.UnsupportedEncodingException;

public final class cr {
    private static byte a = 0;
    private static byte b;
    private static boolean c;
    private static long d;
    private static boolean e;

    static {
        c = true;
        d = 0L;
        e = false;
    }

    public static void a() {
        e = true;
    }

    public static void b() {
        switch (v.L) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 6: 
            case 7: {
                c = false;
                break;
            }
            default: {
                c = false;
            }
        }
        if (!c) {
            return;
        }
        cr.j();
    }

    private static final void j() {
        if (!cs.a()) {
            if (v.Y > 5) {
                a = (byte)2;
                return;
            }
            cr.l();
            cr.k();
            return;
        }
        byte[] byArray = cs.b();
        byte[] byArray2 = new byte[3];
        byte[] byArray3 = byArray2;
        byArray2[0] = byArray[10];
        byArray3[1] = byArray[11];
        byArray3[2] = byArray[12];
        byArray[10] = 0;
        byArray[11] = 0;
        byArray[12] = 0;
        byte[] byArray4 = cx.a(byArray);
        if (byArray3[0] != byArray4[byArray4.length - 3] || byArray3[1] != byArray4[byArray4.length - 2] || byArray3[2] != byArray4[byArray4.length - 1]) {
            a = (byte)2;
            return;
        }
        a = byArray[0];
        b = byArray[1];
        byte[] byArray5 = new byte[8];
        byArray3 = byArray5;
        byArray5[0] = byArray[2];
        byArray3[1] = byArray[3];
        byArray3[2] = byArray[4];
        byArray3[3] = byArray[5];
        byArray3[4] = byArray[6];
        byArray3[5] = byArray[7];
        byArray3[6] = byArray[8];
        byArray3[7] = byArray[9];
        d = m.d(byArray3);
    }

    private static final void k() {
        byte[] byArray = new byte[13];
        byte[] byArray2 = byArray;
        byArray[0] = a;
        byArray2[1] = b;
        byte[] byArray3 = m.a(d);
        byArray2[2] = byArray3[0];
        byArray2[3] = byArray3[1];
        byArray2[4] = byArray3[2];
        byArray2[5] = byArray3[3];
        byArray2[6] = byArray3[4];
        byArray2[7] = byArray3[5];
        byArray2[8] = byArray3[6];
        byArray2[9] = byArray3[7];
        byArray2[10] = 0;
        byArray2[11] = 0;
        byArray2[12] = 0;
        byArray3 = cx.a(byArray2);
        byArray2[10] = byArray3[byArray3.length - 3];
        byArray2[11] = byArray3[byArray3.length - 2];
        byArray2[12] = byArray3[byArray3.length - 1];
        cs.a(byArray2);
    }

    public static final boolean c() {
        cr.j();
        return a == 2;
    }

    public static final boolean d() {
        return a == 1;
    }

    public static final void e() {
        a = (byte)2;
        b = (byte)6;
        cr.k();
    }

    private static void l() {
        a = 0;
        b = 0;
        d = 0L;
    }

    public static final void f() {
        long l;
        if (e) {
            e = false;
            return;
        }
        if (!c) {
            return;
        }
        if (a == 1) {
            return;
        }
        cr.j();
        if (d == 0L) {
            d = System.currentTimeMillis();
        }
        if ((l = System.currentTimeMillis()) - d >= 300000L || b >= 5) {
            a = 1;
        } else {
            b = (byte)(b + 1);
        }
        cr.k();
    }

    public static final void g() {
        if (!c) {
            return;
        }
        cr.l();
        cr.k();
    }

    public static final void h() {
        Object object = i.a("Kích thước màn hình của bạn: %d:%d, không phù hợp với yêu cầu của game (%d:%d)", "%d", new String[]{String.valueOf(v.t), String.valueOf(v.u), String.valueOf(v.r), String.valueOf(v.s)});
        object = ag.b().a("Chú ý", (String)object, "Đóng", 4, 1);
        ((am)object).a(ag.b());
        ag.b().a((al)object);
    }

    public static final void i() {
        Object object = "Thiết bị không phù hợp để chơi game! Xin cảm ơn.";
        object = ag.b().a("Chú ý", (String)object, "Đóng", 4, "Hỗ trợ", 8, 1);
        ((am)object).a(ag.b());
        ag.b().a((al)object);
    }

    public static final boolean a(boolean bl) {
        try {
            byte[] byArray = cx.a(v.d());
            return cx.a(v.m, byArray);
        } catch (Exception exception) {
            return true;
        }
    }
}
