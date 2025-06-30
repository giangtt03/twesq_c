// Decompiled with: CFR 0.152
// Class Version: 1
package com.mg.sq;

import com.mg.bas.ct;
import com.mg.bas.go;
import com.mg.bas.ba;
import com.mg.bas.gr;
import com.mg.bas.ag;
import com.mg.bas.al;
import com.mg.bas.ig;
import com.mg.bas.i;
import com.mg.bas.ff;
import com.mg.bas.bx;
import com.mg.bas.bk;
import com.mg.bas.pd;
import com.mg.bas.v;
import com.mg.bas.m;
import com.mg.bas.by;
import com.mg.bas.iff;
import com.mg.bas.oc;
import com.mg.bas.ks;
import com.mg.bas.gs;
import com.mg.bas.am;
import com.mg.bas.od;
import com.mg.bas.pa;

import com.mg.smsgame.MGMIDlet;
import com.mg.sq.a;

public class SQMIDlet
extends MGMIDlet {
    public SQMIDlet() {
        super(true, "SQOL", "OLA", "17537", "42");
    }

    protected final void e() {
        v.m = new byte[]{-17, 96, 78, -104, 8, -54, -4, 110, -50, -101, -42, 50, -31, -19, -88, -93};
        ct.a(false, 1);
        v.e = i.c(0L).get(1);
        v.f = i.a.getTimeZone().getRawOffset();
        pd.m();
        v.l = false;
        v.U = false;
        v.N = false;
        v.p = 6;
        v.q = new int[]{3, 3, 1000, 3, 3, 3};
        v.G = true;
        v.aa = 3;
        ba.a = 20;
        al.a = 750;
        v.Q = 50;
        go.b = pd.y();
        go.a = pd.w();
        go.d = pd.v();
        gr.j = pd.n();
        v.g = false;
        ag.a(new ig());
    }

    protected final void f() {
        Object object;
        v.a(0xF0FBFF);
        v.am = 0xF0FBFF;
        v.al = 0xFFFFFF;
        v.ak = 15698432;
        if (v.a()) {
            ff.q();
        } else if (v.L == 2) {
            ff.a();
        }
        bx.a.c(true);
        bx.a.a(6290199);
        bx.d = new by();
        bx.c = bx.e = new iff();
        bx.b = bx.e;
        bx.a(bx.e);
        bk.a(0xFFFFFF);
        v.a(480, 480, true);
        ag.a(new a() {
            public void a(String[] var1, int[] var2, int[] var3, int[] var4, int[] var5) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        ag.b().a(new oc());
        if (v.ai) {
            v.b = true;
        }
        if (!pd.D()) {
            ag.b().f(6);
            object = ag.b().a("Chú ý", "Bạn nên cài Game vào bộ nhớ máy (không nên cài vào thẻ nhớ), muốn Game chạy nhanh hơn bạn phải để bộ nhớ của máy 5Mb trở lên.", "Đóng", 2, 1);
            ((am)object).a(ag.b());
            ag.b().a((al)object, false);
        } else {
            ag.b().f(5);
        }
        if (!pd.B()) {
            com.mg.sq.a.a(gs.a);
            pd.A();
        }
        ks.a().a(com.mg.sq.a.s());
        com.mg.sq.a.q();
        object = Runtime.getRuntime();
        long l = ((Runtime)object).totalMemory() / 1024L;
        if (l <= 2048L && v.ah) {
            if (ct.b()) {
                ct.a("[SYSTEM] Detect low memory device: " + l + "Kb");
            }
            gr.r = true;
        }
        od.d();
    }

    protected void destroyApp(boolean bl) {
        pa.a().b();
        super.destroyApp(bl);
    }
}
