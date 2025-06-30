package com.mg.bas;
// Decompiled with: Procyon 0.6.0
// Class Version: 1
import com.mg.smsgame.MGMIDlet;
import java.io.InputStream;

final class ky implements Runnable, kn
{
    public kq b;
    public kp c;
    public ko d;
    private kv e;
    private boolean f;
    
    public ky(final InputStream inputStream) {
        super();
        this.f = false;
        this.e = new kv(inputStream);
        this.f = false;
        new Thread(this).start();
    }
    
    public final void run() {
        int n = 10;
        this.f = false;
        while (!this.f) {
            ku ku4;
            try {
                ku ku2 = null;
                ku ku = null;
                Label_0293: {
                    if (this.e == null) {
                        ct.a("[SocketReader] input null");
                        ku = (ku2 = null);
                    }
                    else {
                        final kv e = this.e;
                        final byte[] array = new byte[7];
                        final int a = g.a(e.a, array, 0);
                        final ku ku3 = new ku();
                        if (a <= 0) {
                            ct.a("[InputBuffer] readPacket() PACKET_FAIL");
                            ku = (ku2 = null);
                        }
                        else {
                            ks.h += a;
                            final int a2 = m.a(array[0], array[1]);
                            final int a3 = m.a(array[2], array[3], array[4], array[5]);
                            ku3.a = a3;
                            ku3.b = m.a(array[6]);
                            if (a3 > 0) {
                                ks.h += a3;
                                final kt[] c = new kt[a2];
                                for (int i = 0; i < c.length; ++i) {
                                    final byte[] array2 = new byte[5];
                                    if (g.a(e.a, array2, 0) < 0) {
                                        ku = (ku2 = null);
                                        break Label_0293;
                                    }
                                    final short n2 = (short)m.a(array2[0]);
                                    final byte[] array3 = new byte[m.a(array2[1], array2[2], array2[3], array2[4])];
                                    if (g.a(e.a, array3, 0) < 0) {
                                        ku = (ku2 = null);
                                        break Label_0293;
                                    }
                                    c[i] = new kt(n2, array3);
                                }
                                ku3.c = c;
                            }
                            ku = (ku2 = ku3);
                        }
                    }
                }
                ku4 = ku2;
                if (ku == null) {
                    if (--n <= 0) {
                        this.f = true;
                    }
                    else {
                        try {
                            Thread.sleep(3000L);
                        }
                        catch (final Throwable t) {}
                    }
                }
                else {
                    n = 10;
                }
            }
            catch (final Throwable t2) {
//                final Throwable t3;
                t2.printStackTrace();
                if (--n <= 0) {
                    this.f = true;
                }
                else {
                    try {
                        Thread.sleep(1000L);
                    }
                    catch (final Throwable t4) {}
                }
                ku4 = null;
            }
            final ku ku5 = ku4;
            if (ku5 == null) {
                ct.a("[PAT] Get NULL packet on SocketReader.process()");
            }
            else {
                if (this.b == null) {
                    throw new NullPointerException("Main listener can't be NULL");
                }
                try {
                    switch ((short)ku5.b) {
                        case 0: {
                            final ku ku6 = ku5;
                            final byte a4 = ku6.a((short)0, (byte)(-1));
                            final String d = ku6.d((short)1);
                            switch (a4) {
                                case 7: {
                                    if (this.c != null) {
                                        this.c.a();
                                        continue;
                                    }
                                    continue;
                                }
                                case 3: {
                                    this.b.w();
                                    continue;
                                }
                                case 8: {
                                    this.b.b(d);
                                    continue;
                                }
                                default: {
                                    this.b.a(a4, d);
                                    continue;
                                }
                            }
//                            continue;
                        }
                        case 1: {
                            ks.a().b = 3;
                            continue;
                        }
                        case 2: {
                            ks.a().a(ku5.d((short)3));
                            continue;
                        }
                        case 5: {
                            this.c(ku5);
                            continue;
                        }
                        case 3: {
                            final byte[] c2 = ku5.c((short)2);
                            ks.a().a(ks.a().c, g.a(c2, ks.a().d), c2);
                            continue;
                        }
                        case 8: {
                            this.e(ku5);
                            continue;
                        }
                        case 9: {
                            ku5.c((short)112);
                            final byte a5;
                            if ((a5 = ku5.a((short)134, (byte)(-1))) > 0) {
                                this.b.a(this.a(ku5), a5);
                                continue;
                            }
                            this.b(ku5);
                            continue;
                        }
                        case 30: {
                            this.q(ku5);
                            continue;
                        }
                        case 29: {
                            this.b.a(ku5.d((short)9), ku5.d((short)20), ku5.a((short)21, 0, -1, 0));
                            continue;
                        }
                        case 10: {
                            this.b(ku5);
                            this.b.U();
                            continue;
                        }
                        case 27: {
                            this.b.U();
                            continue;
                        }
                        case 36: {
                            this.C(ku5);
                            continue;
                        }
                        case 42: {
                            this.r(ku5);
                            continue;
                        }
                        case 37: {
                            final byte a6;
                            if ((a6 = ku5.a((short)89, (byte)(-1))) == 0) {
                                this.b(ku5);
                                continue;
                            }
                            if (a6 != 1 && a6 != 2) {
                                continue;
                            }
                            final String[] array4 = new String[ku5.b((short)83)];
                            for (int j = 0; j < array4.length; ++j) {
                                array4[j] = ku5.b(ku5.b((short)83, j));
                            }
                            if (a6 == 1) {
                                this.b.c(array4);
                                continue;
                            }
                            this.b.d(array4);
                            continue;
                        }
                        case 48: {
                            final ku ku7 = ku5;
                            this.b.b(ku7.d((short)83), ku7.c((short)114, -1), ku7.c((short)106, -1));
                            continue;
                        }
                        case 11: {
                            this.d(ku5);
                            continue;
                        }
                        case 43: {
                            this.f(ku5);
                            continue;
                        }
                        case 6: {
                            final ku ku8 = ku5;
                            final int c3 = ku8.c((short)4, 0);
                            final int a7;
                            if ((a7 = ku8.a(ku8.b((short)7, 0), -1)) < 0) {
                                final int a8 = ku8.a(ku8.b((short)6, 0), -1);
                                final int a9 = ku8.a(ku8.b((short)5, 0), -1);
                                if (this.d == null) {
                                    continue;
                                }
                                this.d.a(c3, a8, a9);
                            }
                            else {
                                final byte[] c4 = ku8.c((short)8);
                                if (this.d == null) {
                                    continue;
                                }
                                this.d.a(c3, a7, c4);
                            }
                            continue;
                        }
                        case 13: {
                            final ku ku9 = ku5;
                            this.b.a(ku9.d((short)20), ku9.c((short)21, 0), ku9.a((short)22, (byte)0));
                            continue;
                        }
                        case 16: {
                            this.b.b(ku5.d((short)9), ku5.d((short)1));
                            continue;
                        }
                        case 17: {
                            final ku ku10 = ku5;
                            final String d2 = ku10.d((short)28);
                            final String d3 = ku10.d((short)9);
                            final String d4 = ku10.d((short)1);
                            final lh a10;
                            (a10 = this.a(ku10, 0, -1)).b = d3;
                            this.b.a(a10, d4, ku10.a((short)132, 0L), d2, ku10.a((short)167, (byte)0) > 0, ku10.a((short)169, (byte)0) > 0);
                            continue;
                        }
                        case 22: {
                            this.j(ku5);
                            continue;
                        }
                        case 18: {
                            final ku ku11 = ku5;
                            final nq nq = new nq(ku11.c((short)41, 0), (byte)0);
                            final boolean a11 = ku11.a((short)32);
                            if (ku11.a((short)39)) {
                                nq.E = true;
                            }
                            else {
                                nq.d = a11;
                            }
                            if (this.c == null) {
                                continue;
                            }
                            this.c.a(nq);
                            continue;
                        }
                        case 19: {
                            final ku ku12 = ku5;
                            final nq nq2;
                            (nq2 = new nq(ku12.c((short)41, 0), (byte)3)).i = ku12.a((short)44, 0L);
                            final int a12 = ku12.a(ku12.b((short)33, 0), -1);
                            final int a13 = ku12.a(ku12.b((short)34, 0), -1);
                            final int a14 = ku12.a(ku12.b((short)33, 1), -1);
                            final int a15 = ku12.a(ku12.b((short)34, 1), -1);
                            final nq nq3 = nq2;
                            final int n3 = a12;
                            final int n4 = a13;
                            final int n5 = a14;
                            final int m = a15;
                            final int l = n5;
                            final int k = n4;
                            final int j2 = n3;
                            final nq nq4 = nq3;
                            nq3.j = j2;
                            nq4.l = l;
                            nq4.k = k;
                            nq4.m = m;
                            this.a(ku12, nq2);
                            continue;
                        }
                        case 24: {
                            final ku ku13 = ku5;
                            ct.a("[processUpdateMatch]======================================");
                            final nq nq5 = new nq(ku13.c((short)41, 0), (byte)2);
                            b(ku13, nq5);
                            final boolean a16 = ku13.a((short)32);
                            final byte[] c5;
                            if ((c5 = ku13.c((short)39)) != null) {
                                this.c.a(nq5);
                                nq5.E = true;
                                this.a(ku13, c5[0], nq5.b);
                                continue;
                            }
                            nq5.d = a16;
                            this.c.a(nq5);
                            continue;
                        }
                        case 20: {
                            this.m(ku5);
                            continue;
                        }
                        case 44: {
                            final ku ku14 = ku5;
                            final nq nq6;
                            (nq6 = new nq(ku14.c((short)41, 0), (byte)4)).i = ku14.a((short)44, 0L);
                            nq6.e = ku14.c((short)114, 0);
                            this.a(ku14, nq6);
                            continue;
                        }
                        case 47: {
                            if (this.c == null) {
                                continue;
                            }
                            final nq nq7;
                            (nq7 = new nq((byte)1)).k = ku5.c((short)34, 2);
                            nq7.j = ku5.c((short)33, 2);
                            if (this.c != null) {
                                this.c.a(nq7);
                                continue;
                            }
                            continue;
                        }
                        case 84: {
                            final ku ku15 = ku5;
                            this.b.e(ku15.c((short)114, -1), ku15.c((short)106, -1));
                            this.b(ku15);
                            continue;
                        }
                        case 40: {
                            if (this.c == null) {
                                continue;
                            }
                            final byte[] c6;
                            if ((c6 = ku5.c((short)39)) == null) {
                                this.c.a(-1);
                                continue;
                            }
                            this.c.a(c6[0]);
                            this.a(ku5, c6[0], -1);
                            continue;
                        }
                        case 25: {
                            final String d5 = ku5.d((short)9);
                            final String d6 = ku5.d((short)1);
                            if (this.c != null) {
                                this.c.a(d5, d6);
                            }
                            this.b.c(d5, d6);
                            continue;
                        }
                        case 12: {
                            final ku ku16 = ku5;
                            final String d7 = ku16.d((short)192);
                            final String d8 = ku16.d((short)1);
                            final long n6 = ku16.c((short)157, 0);
                            final String d9 = ku16.d((short)9);
                            switch (ku16.a((short)40, (byte)(-1))) {
                                case 0: {
                                    this.b.a(d7, d9);
                                    continue;
                                }
                                case 1: {
                                    this.b.a(d7, d(ku16, ku16.b((short)9, 0), -1), d8, n6);
                                    continue;
                                }
                                case 2: {
                                    this.b.b(d7, d(ku16, ku16.b((short)9, 0), -1), d8, n6);
                                    continue;
                                }
                                case 3: {
                                    this.h(ku16);
                                    continue;
                                }
                            }
                            continue;
                        }
                        case 21: {
                            final ku ku17 = ku5;
                            this.a(ku17, new nq(ku17.c((short)41, 0), (byte)6));
                            continue;
                        }
                        case 28: {
                            this.b.V();
                            continue;
                        }
                        case 23: {
                            this.l(ku5);
                            continue;
                        }
                        case 31: {
                            this.g(ku5);
                            continue;
                        }
                        case 32: {
                            this.b.A();
                            continue;
                        }
                        case 41: {
                            this.b.B();
                            continue;
                        }
                        case 33: {
                            this.n(ku5);
                            continue;
                        }
                        case 38: {
                            o(ku5);
                            continue;
                        }
                        case 34: {
                            nu.a(new nt(ku5.c((short)80, -1), ku5.d((short)81), "", ku5.d((short)77)));
                            this.b.a(ku5.d((short)149), (byte)0);
                            continue;
                        }
                        case 35: {
                            this.p(ku5);
                            continue;
                        }
                        case 45: {
                            this.b.c(ku5.d((short)1));
                            continue;
                        }
                        case 46: {
                            final kq b = this.b;
                            ku5.d((short)9);
                            b.a(ku5.a((short)132, 0L));
                            continue;
                        }
                        case 55: {
                            this.s(ku5);
                            continue;
                        }
                        case 56: {
                            this.v(ku5);
                            continue;
                        }
                        case 57: {
                            this.t(ku5);
                            continue;
                        }
                        case 7: {
                            final ku ku18 = ku5;
                            switch (ku18.a((short)147, (byte)(-1))) {
                                case 0: {
                                    this.b.c(ku18.a((short)165, (byte)(-1)) == 1);
                                    continue;
                                }
                                case 1: {
                                    this.b.d(ku18.a((short)166, (byte)(-1)) == 1);
                                    continue;
                                }
                            }
                            continue;
                        }
                        case 125: {
                            this.b.a(ku5.d((short)149), (byte)0);
                            continue;
                        }
                        case 52: {
                            this.w(ku5);
                            continue;
                        }
                        case 128: {
                            this.b.s(ku5.d((short)1));
                            continue;
                        }
                        case 129: {
                            final ku ku19 = ku5;
                            switch (ku19.a((short)147, (byte)(-1))) {
                                case 0: {
                                    this.b.a(ku19.d((short)162), ku19.c((short)161) != null, ku19.c((short)163) != null);
                                    continue;
                                }
                                case 1: {
                                    this.b.a(ku19.d((short)162), ku19.c((short)101) != null, ku19.c((short)161) != null, ku19.c((short)163) != null);
                                    continue;
                                }
                                case 2: {
                                    this.b.b(ku19.d((short)162), ku19.c((short)101) != null, ku19.c((short)161) != null, ku19.c((short)163) != null);
                                    continue;
                                }
                            }
                            continue;
                        }
                        case 64: {
                            this.i(ku5);
                            continue;
                        }
                        case 65: {
                            final ku ku20 = ku5;
                            final String d10 = ku20.d((short)192);
                            final String d11 = ku20.d((short)1);
                            final long a17 = ku20.a((short)157, 0L);
                            final int c7 = ku20.c((short)194, 0);
                            ct.a("[processJoinRoom]  " + d11 + ":  " + a17);
                            this.b.a(d10, d11, a17, c7);
                            continue;
                        }
                        case 130: {
                            final ku ku21 = ku5;
                            this.b.a(ku21.c((short)176), ku21.c((short)2));
                            continue;
                        }
                        case 131: {
                            final String d12 = ku5.d((short)1);
                            if (this.b == null) {
                                continue;
                            }
                            this.b.o(d12);
                            continue;
                        }
                        case 4: {
                            if (this.b != null) {
                                this.b.T();
                                continue;
                            }
                            continue;
                        }
                        case 51: {
                            final ku ku22 = ku5;
                            final int c8 = ku22.c((short)114, 0);
                            final String d13 = ku22.d((short)1);
                            final String d14 = ku22.d((short)83);
                            if (c8 > 0) {
                                go.b(c8, 1);
                            }
                            if (d13 != null) {
                                this.b.v(d13);
                            }
                            if (d14 != null) {
                                final int b2 = ku22.b((short)83, 0);
                                this.b.c(a(ku22, b2, ku22.a((short)83, b2), true));
                            }
                            final lm[] a18;
                            if ((a18 = a(ku22, 1)).length <= 0) {
                                continue;
                            }
                            this.b.a(a18);
                            continue;
                        }
                        case 83: {
                            final ku ku23 = ku5;
                            this.b.f(ku23.c((short)114, -1), ku23.c((short)106, 0));
                            continue;
                        }
                        case 99: {
                            final ku ku24 = ku5;
                            final String d15 = ku24.d((short)186);
                            final String d16 = ku24.d((short)1);
                            if (ct.b()) {
                                ct.a("[processRequestUpgradeEquipment]  session  " + d15 + "  message  " + d16);
                            }
                            if (this.b == null) {
                                continue;
                            }
                            this.b.e(d15, d16);
                            continue;
                        }
                        case 100: {
                            final ku ku25 = ku5;
                            ku25.d((short)186);
                            final byte a19 = ku25.a((short)187, (byte)0);
                            final String d17 = ku25.d((short)83);
                            final int c9 = ku25.c((short)114, -1);
                            final int c10 = ku25.c((short)106, -1);
                            final long a20 = ku25.a((short)132, 0L);
                            final String d18 = ku25.d((short)1);
                            final byte a21 = ku25.a((short)188, (byte)0);
                            if (d17 != null) {
                                if (a19 == 0) {
                                    this.b.a(d17, d18, a21, a20);
                                }
                                else {
                                    this.b.b(d17, d18, a21, a20);
                                }
                            }
                            if (c9 <= 0) {
                                continue;
                            }
                            if (a19 == 0) {
                                this.b.a(d18, a21, a20);
                            }
                            else {
                                this.b.a(c9, c10, d18, a21, a20);
                            }
                            continue;
                        }
                        case 101: {
                            this.A(ku5);
                            continue;
                        }
                        case 96: {
                            final ku ku26 = ku5;
                            final String d19 = ku26.d((short)186);
                            final String d20 = ku26.d((short)83);
                            final String d21 = ku26.d((short)1);
                            if (ct.b()) {
                                ct.a("[processRequestUpgradeEquipment]  equipKey  " + d20 + " message" + d21);
                            }
                            if (this.b == null) {
                                continue;
                            }
                            this.b.a(d19, d20, d21);
                            continue;
                        }
                        case 97: {
                            final ku ku27 = ku5;
                            ku27.d((short)186);
                            final byte a22 = ku27.a((short)187, (byte)0);
                            final String d22 = ku27.d((short)83);
                            final int c11 = ku27.c((short)114, -1);
                            final int c12 = ku27.c((short)106, -1);
                            final long a23 = ku27.a((short)132, 0L);
                            final String d23 = ku27.d((short)1);
                            final byte a24 = ku27.a((short)188, (byte)0);
                            if (ct.b()) {
                                ct.a("[processModifiedUpgradeEquipment]readyStatus   " + a24);
                            }
                            if (d22 != null) {
                                if (a22 == 0) {
                                    this.b.d(d22, d23, a24, a23);
                                }
                                else {
                                    this.b.c(d22, d23, a24, a23);
                                }
                            }
                            if (c11 <= 0) {
                                continue;
                            }
                            if (a22 == 0) {
                                this.b.b(d23, a24, a23);
                            }
                            else {
                                this.b.b(c11, c12, d23, a24, a23);
                            }
                            continue;
                        }
                        case 98: {
                            this.B(ku5);
                            continue;
                        }
                        case 112: {
                            final ku ku28 = ku5;
                            final String d24;
                            if ((d24 = ku28.d((short)83)) != null) {
                                ku28.d((short)175);
                                this.b.a(d24, ku28.a((short)157, 0L));
                            }
                            final int c13;
                            if ((c13 = ku28.c((short)114, 0)) <= 0) {
                                continue;
                            }
                            ku28.d((short)175);
                            final int c14 = ku28.c((short)106, 0);
                            ku28.a((short)157, 0L);
                            this.b.g(c13, c14);
                            continue;
                        }
                        case 116: {
                            this.y(ku5);
                            continue;
                        }
                        case 113: {
                            this.x(ku5);
                            continue;
                        }
                        case 114: {
                            final ku ku29 = ku5;
                            final byte a25 = ku29.a((short)152, (byte)(-1));
                            final int c15 = ku29.c((short)106, 0);
                            ct.a("[processListMarketProducts]catid == " + a25 + "qty ==" + c15);
                            this.b.a(a25, c15, this.u(ku29));
                            continue;
                        }
                        case 115: {
                            this.z(ku5);
                            continue;
                        }
                        case 132: {
                            this.D(ku5);
                            continue;
                        }
                        case 133: {
                            this.b.w(ku5.d((short)1));
                            continue;
                        }
                    }
                }
                catch (final Throwable t5) {
//                    final Throwable t6;
                    t5.printStackTrace();
                }
            }
        }
    }
    
    private lh a(final ku ku, int a, int n) {
        a = ku.a((short)15, 0, -1, (byte)(-1));
        final lh lh;
        (lh = new lh(a)).b = ku.b(0);
        lh.c = ku.d((short)26, 0, -1);
        lh.f = ku.a((short)16, 0, -1, (byte)0);
        lh.g = ku.a((short)15, 0, -1, (byte)0);
        lh.G = ku.a((short)27, 0, -1, 0);
        lh.e = ku.a((short)24, 0, -1, (byte)0);
        lh.H = ku.a((short)43, 0, -1, 0);
        lh.s = ku.a((short)17, 0, -1, 0);
        lh.r = ku.a((short)47, 0, -1, 1);
        lh.u = ku.a((short)18, 0, -1, 0);
        lh.t = ku.a((short)48, 0, -1, 1);
        lh.w = ku.a((short)45, 0, -1, 0);
        lh.v = ku.a((short)49, 0, -1, 1);
        lh.S = ku.d((short)209);
        lh.R = ku.d((short)210);
        if (lh.Q == null) {
            if (lh.G > 100 && lh.G <= 200) {
                lh.Q = "Đại Hiệp";
            }
            else if (lh.G > 200) {
                lh.Q = "Chiến Vương";
            }
            else {
                lh.Q = "Hào Kiệt";
            }
        }
        lh.ab = ku.c((short)160, 0);
        n = ku.a((short)64, 0, -1);
        lh.E = new lv[n];
        if (n > 0) {
            int b = ku.b((short)64, 0, -1);
            for (int i = 0; i < n; ++i) {
                final int a2 = ku.a((short)64, b);
                lh.E[i] = new lv(ku.a(b, -1));
                b = a2;
            }
        }
        lh.D = new ll[ku.a((short)83, 0, -1)];
        int a3 = ku.a((short)83, 0);
        for (int j = 0; j < lh.D.length; ++j) {
            final int a4 = ku.a((short)83, a3);
            lh.D[j] = a(ku, a3, a4, false);
            a3 = a4;
        }
        final int a5 = ku.a((short)90, 0, -1);
        int a6 = ku.a((short)90, 0);
        for (int k = 0; k < a5; ++k) {
            n = ku.a((short)90, a6);
            final int a7 = ku.a(a6, 0);
            final byte a8 = ku.a((short)91, a6, n, (byte)0);
            final df w = new df(a7);
            w.d = new dg(ku.a((short)93, a6, n, 0), ku.c((short)95, a6, n));
            w.f = new dg[] { w.d };
            w.e = new dg(ku.a((short)96, a6, n, 0), ku.c((short)98, a6, n));
            switch (a8) {
                case 0: {
                    lh.U = w;
                    break;
                }
                case 1: {
                    lh.V = w;
                    break;
                }
                case 2: {
                    lh.W = w;
                    break;
                }
            }
            a6 = n;
        }
        return lh;
    }
    
    private lh b(final ku ku, int n, final int n2) {
        try {
            final lh lh;
            (lh = new lh(ku.a((short)15, n, n2, (byte)(-1)))).b = ku.b(n);
            lh.c = ku.d((short)26, n, n2);
            lh.O = (ku.c((short)36, n, n2) != null);
            lh.f = ku.a((short)16, n, n2, (byte)0);
            lh.g = ku.a((short)15, n, n2, (byte)0);
            lh.G = ku.a((short)27, n, n2, 0);
            lh.Y = ku.a((short)4, n, n2, 0);
            lh.T = ku.a((short)19, n, n2, (byte)0);
            lh.s = ku.a((short)17, n, n2, 0);
            lh.r = ku.a((short)47, n, n2, 1);
            lh.u = ku.a((short)18, n, n2, 0);
            lh.t = ku.a((short)48, n, n2, 1);
            lh.w = ku.a((short)45, n, n2, 0);
            lh.v = ku.a((short)49, n, n2, 1);
            lh.S = ku.d((short)209);
            lh.R = ku.d((short)210);
            if (lh.Q == null) {
                if (lh.G > 100 && lh.G <= 200) {
                    lh.Q = "Đại Hiệp";
                }
                else if (lh.G > 200) {
                    lh.Q = "Chiến Vương";
                }
                else {
                    lh.Q = "Hào Kiệt";
                }
            }
            final int a = ku.a((short)64, n, n2);
            lh.E = new lv[a];
            if (a > 0) {
                int b = ku.b((short)64, n, n2);
                for (int i = 0; i < a; ++i) {
                    final int a2 = ku.a((short)64, b);
                    lh.E[i] = new lv(ku.a(b, -1));
                    lh.E[i].b = ku.d((short)26, b, a2);
                    lh.E[i].d = ku.d((short)66, b, a2);
                    lh.E[i].f = ku.a((short)67, b, a2, -1);
                    lh.E[i].e = ku.a((short)68, b, a2, -1);
                    final int a3 = ku.a((short)69, b, a2);
                    lh.E[i].h = new String[a3];
                    final lv[] e = lh.E;
                    int b2 = ku.b((short)69, b, a2);
                    for (int j = 0; j < a3; ++j) {
                        final int a4 = ku.a((short)69, b2);
                        lh.E[i].h[j] = ku.b(b2);
                        b2 = a4;
                    }
                    b = a2;
                }
            }
            lh.D = new ll[ku.a((short)83, n, n2)];
            int a5 = ku.a((short)83, n);
            for (int k = 0; k < lh.D.length; ++k) {
                final int a6 = ku.a((short)83, a5);
                lh.D[k] = a(ku, a5, a6, false);
                a5 = a6;
            }
            lh.F = a(ku, 0);
            final int a7 = ku.a((short)90, n, n2);
            int a8 = ku.a((short)90, n);
            for (int l = 0; l < a7; ++l) {
                final int a9 = ku.a((short)90, a8);
                final int a10 = ku.a(a8, 0);
                final byte a11 = ku.a((short)91, a8, a9, (byte)0);
                final df w = new df(a10);
                n = ku.a((short)93, a8, a9, 0);
                w.d = new dg(n, ku.c((short)95, a8, a9));
                w.f = new dg[] { w.d };
                n = ku.a((short)96, a8, a9, 0);
                w.e = new dg(n, ku.c((short)98, a8, a9));
                switch (a11) {
                    case 0: {
                        lh.U = w;
                        break;
                    }
                    case 1: {
                        lh.V = w;
                        break;
                    }
                    case 2: {
                        lh.W = w;
                        break;
                    }
                }
                a8 = a9;
            }
            return lh;
        }
        catch (final Exception t) {
//            final Throwable t;
            t.printStackTrace();
            MGMIDlet.d().notifyDestroyed();
            return null;
        }
    }
    
    private lh c(final ku ku, int a, int a2) {
        try {
            final lh lh;
            (lh = new lh(0)).b = ku.b(a);
            lh.c = ku.d((short)26, a, a2);
            lh.O = (ku.c((short)36, a, a2) != null);
            lh.f = ku.a((short)16, a, a2, (byte)0);
            lh.g = ku.a((short)15, a, a2, (byte)0);
            lh.G = ku.a((short)27, a, a2, 0);
            lh.Y = ku.a((short)4, a, a2, 0);
            lh.T = ku.a((short)19, a, a2, (byte)0);
            lh.s = ku.a((short)17, a, a2, 0);
            lh.r = ku.a((short)47, a, a2, 1);
            lh.u = ku.a((short)18, a, a2, 0);
            lh.t = ku.a((short)48, a, a2, 1);
            lh.w = ku.a((short)45, a, a2, 0);
            lh.v = ku.a((short)49, a, a2, 1);
            lh.S = ku.d((short)209);
            lh.R = ku.d((short)210);
            if (lh.Q == null) {
                if (lh.G > 100 && lh.G <= 200) {
                    lh.Q = "Đại Hiệp";
                }
                else if (lh.G > 200) {
                    lh.Q = "Chiến Vương";
                }
                else {
                    lh.Q = "Hào Kiệt";
                }
            }
            final int a3 = ku.a((short)64, a, a2);
            lh.E = new lv[a3];
            if (a3 > 0) {
                int b = ku.b((short)64, a, a2);
                for (int i = 0; i < a3; ++i) {
                    final int a4 = ku.a((short)64, b);
                    lh.E[i] = new lv(ku.a(b, -1));
                    b = a4;
                }
            }
            lh.D = new ll[ku.a((short)83, a, a2)];
            int a5 = ku.a((short)83, a);
            for (int j = 0; j < lh.D.length; ++j) {
                final int a6 = ku.a((short)83, a5);
                lh.D[j] = a(ku, a5, a6, false);
                a5 = a6;
            }
            lh.F = new lm[ku.a((short)114, a, a2)];
            int a7 = ku.a((short)114, a);
            for (int k = 0; k < lh.F.length; ++k) {
                final int a8 = ku.a((short)114, a7);
                lh.F[k] = new lm(ku.a(a7, 0));
                lh.F[k].g = ku.a((short)106, a7, a8, 0);
                lh.F[k].j = ku.a((short)4, a7, a8, 0);
                a7 = a8;
            }
            final int a9 = ku.a((short)90, a, a2);
            int a10 = ku.a((short)90, a);
            for (int l = 0; l < a9; ++l) {
                final int a11 = ku.a((short)90, a10);
                a = ku.a(a10, 0);
                a2 = ku.a((short)91, a10, a11, (byte)0);
                final df w = new df(a);
                w.d = new dg(ku.a((short)93, a10, a11, 0), ku.c((short)95, a10, a11));
                w.f = new dg[] { w.d };
                w.e = new dg(ku.a((short)96, a10, a11, 0), ku.c((short)98, a10, a11));
                switch (a2) {
                    case 0: {
                        lh.U = w;
                        break;
                    }
                    case 1: {
                        lh.V = w;
                        break;
                    }
                    case 2: {
                        lh.W = w;
                        break;
                    }
                }
                a10 = a11;
            }
            return lh;
        }
        catch (final Exception ex) {
//            final Throwable t;
            ex.printStackTrace();
            MGMIDlet.d().notifyDestroyed();
            return null;
        }
    }
    
    private lh a(final ku ku) {
        final lh lh;
        (lh = new lh(ku.a((short)15, 0, -1, (byte)(-1)))).b = ku.d((short)9);
        lh.c = ku.d((short)26);
        lh.g = ku.a((short)15, (byte)0);
        lh.f = ku.a((short)16, (byte)0);
        lh.G = ku.c((short)27, 0);
        lh.s = ku.c((short)17, 0);
        lh.r = ku.c((short)47, 0);
        lh.u = ku.c((short)18, 0);
        lh.t = ku.c((short)48, 0);
        lh.h = ku.c((short)118, 0);
        lh.j = ku.c((short)119, 0);
        lh.i = ku.c((short)120, 0);
        lh.k = ku.c((short)121, 0);
        lh.l = ku.c((short)196, 0);
        lh.m = ku.c((short)197, 0);
        lh.n = ku.c((short)198, 0);
        lh.o = ku.c((short)199, 0);
        lh.p = ku.c((short)116, 0);
        lh.q = ku.c((short)115, 0);
        ct.a("[readFighterInf] addHealth " + lh.p + " heatlPec  " + lh.q);
        lh.J = ku.c((short)42, 0);
        lh.H = ku.c((short)43, 0);
        lh.I = ku.c((short)99, 10000);
        lh.K = ku.c((short)53, 0);
        lh.L = ku.c((short)76, 0);
        lh.M = ku.c((short)73, 0);
        lh.N = ku.c((short)74, 0);
        lh.S = ku.d((short)209);
        lh.R = ku.d((short)210);
        if (lh.Q == null) {
            if (lh.G > 100 && lh.G <= 200) {
                lh.Q = "Đại Hiệp";
            }
            else if (lh.G > 200) {
                lh.Q = "Chiến Vương";
            }
            else {
                lh.Q = "Hào Kiệt";
            }
        }
        lh.ab = ku.c((short)160, 0);
        lh.Z = (ku.a((short)165, (byte)0) == 1);
        lh.aa = (ku.a((short)166, (byte)0) == 1);
        final int b = ku.b((short)64);
        lh.E = new lv[b];
        if (b > 0) {
            int a = ku.a((short)64, 0);
            for (int i = 0; i < b; ++i) {
                final int a2 = ku.a((short)64, a);
                lh.E[i] = new lv(ku.a(a, -1));
                lh.E[i].f = ku.a((short)67, a, a2, -1);
                lh.E[i].e = ku.a((short)68, a, a2, -1);
                final lv[] e = lh.E;
                ku.a((short)89, a, a2, (byte)(-1));
                a = a2;
            }
        }
        lh.D = new ll[ku.b((short)83)];
        int b2 = ku.b((short)83, 0);
        for (int j = 0; j < lh.D.length; ++j) {
            final int a3 = ku.a((short)83, b2);
            lh.D[j] = a(ku, b2, a3, false);
            b2 = a3;
        }
        lh.F = this.k(ku);
        final int b3 = ku.b((short)90);
        int b4 = ku.b((short)90, 0);
        for (int k = 0; k < b3; ++k) {
            final int a4 = ku.a((short)90, b4);
            final int a5 = ku.a(b4, 0);
            final byte a6 = ku.a((short)91, b4, a4, (byte)0);
            final df w = new df(a5);
            w.d = new dg(ku.a((short)93, b4, a4, 0), ku.c((short)95, b4, a4));
            w.f = new dg[] { w.d };
            w.e = new dg(ku.a((short)96, b4, a4, 0), ku.c((short)98, b4, a4));
            switch (a6) {
                case 0: {
                    lh.U = w;
                    break;
                }
                case 1: {
                    lh.V = w;
                    break;
                }
                case 2: {
                    lh.W = w;
                    break;
                }
            }
            b4 = a4;
        }
        final int b5;
        final lt[] ac = new lt[b5 = ku.b((short)158)];
        int b6 = ku.b((short)158, 0);
        for (int l = 0; l < b5; ++l) {
            final int a7 = ku.a((short)158, b6);
            ac[l] = new lt();
            ku.d((short)158, b6, a7);
            ac[l].a = ku.a((short)4, b6, a7, 0);
            ac[l].b = ku.a((short)157, b6, a7, 0L);
            b6 = a7;
        }
        lh.ac = ac;
        return lh;
    }
    
    private void b(final ku ku) {
        final int c = ku.c((short)23, 0);
        final String d = ku.d((short)9);
        if ((c & 0x1) != 0x0) {
            final int b = ku.b((short)90);
            int b2 = ku.b((short)90, 0);
            final byte a = ku.a((short)15, (byte)0);
            final byte a2 = ku.a((short)16, (byte)0);
            df df = null;
            df df2 = null;
            df df3 = null;
            for (int i = 0; i < b; ++i) {
                final int a3 = ku.a((short)90, b2);
                final int a4 = ku.a(b2, 0);
                final byte a5 = ku.a((short)91, b2, a3, (byte)0);
                final df df4 = new df(a4);
                df4.d = new dg(ku.a((short)93, b2, a3, 0), ku.c((short)95, b2, a3));
                df4.f = new dg[] { df4.d };
                df4.e = new dg(ku.a((short)96, b2, a3, 0), ku.c((short)98, b2, a3));
                switch (a5) {
                    case 0: {
                        df = df4;
                        break;
                    }
                    case 1: {
                        df2 = df4;
                        break;
                    }
                    case 2: {
                        df3 = df4;
                        break;
                    }
                }
                b2 = a3;
            }
            if (this.b != null) {
                this.b.a(d, a, a2, df, df2, df3);
            }
        }
        if ((c & 0x2) != 0x0) {
            final int c2 = ku.c((short)27, 0);
            final int c3 = ku.c((short)118, 0);
            final int c4 = ku.c((short)119, 0);
            final int c5 = ku.c((short)120, 0);
            final int c6 = ku.c((short)121, 0);
            final int c7 = ku.c((short)196, 0);
            final int c8 = ku.c((short)197, 0);
            final int c9 = ku.c((short)198, 0);
            final int c10 = ku.c((short)199, 0);
            final int c11 = ku.c((short)116, 0);
            final int c12 = ku.c((short)115, 0);
            if (this.b != null) {
                this.b.a(d, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12);
            }
        }
        if ((c & 0x4) != 0x0) {
            final int c13 = ku.c((short)17, 0);
            final int c14 = ku.c((short)47, 0);
            final int c15 = ku.c((short)42, 0);
            final int c16 = ku.c((short)73, 0);
            final int c17 = ku.c((short)74, 0);
            final int c18 = ku.c((short)43, 0);
            final int c19 = ku.c((short)99, 10000);
            if (this.b != null) {
                this.b.a(d, c13, c14, c15, c16, c17, c18, c19);
            }
        }
        if ((c & 0x8) != 0x0) {
            final int c20 = ku.c((short)53, 0);
            final int c21 = ku.c((short)76, 0);
            final int c22 = ku.c((short)160, 0);
            final int c23 = ku.c((short)27, 0);
            final String d2 = ku.d((short)209);
            final String d3 = ku.d((short)210);
            String s;
            if (c23 > 100 && c23 <= 200) {
                s = "Đại Hiệp";
            }
            else if (c23 > 200) {
                s = "Chiến Vương";
            }
            else {
                s = "Hào Kiệt";
            }
            if (this.b != null) {
                this.b.a(d, c20, c21, c22, d2, d3, s);
            }
        }
        if ((c & 0x10) != 0x0) {
            this.b.c(ku.a((short)165, (byte)0) == 1);
            this.b.d(ku.a((short)166, (byte)0) == 1);
        }
        if ((c & 0x20) != 0x0) {
            final int b3;
            final lv[] array = new lv[b3 = ku.b((short)64)];
            if (b3 > 0) {
                int a6 = ku.a((short)64, 0);
                for (int j = 0; j < b3; ++j) {
                    final int a7 = ku.a((short)64, a6);
                    array[j] = new lv(ku.a(a6, -1));
                    array[j].f = ku.a((short)67, a6, a7, -1);
                    a6 = a7;
                }
            }
            if (this.b != null) {
                this.b.a(array);
            }
        }
        if ((c & 0x40) != 0x0) {
            final ll[] array2 = new ll[ku.b((short)83)];
            int b4 = ku.b((short)83, 0);
            for (int k = 0; k < array2.length; ++k) {
                final int a8 = ku.a((short)83, b4);
                array2[k] = a(ku, b4, a8, false);
                b4 = a8;
            }
            if (this.b != null) {
                this.b.a(d, array2);
            }
        }
        if ((c & 0x100) != 0x0) {
            final int b5;
            final lt[] array3 = new lt[b5 = ku.b((short)158)];
            int b6 = ku.b((short)158, 0);
            for (int l = 0; l < b5; ++l) {
                final int a9 = ku.a((short)158, b6);
                array3[l] = new lt();
                ku.d((short)158, b6, a9);
                array3[l].a = ku.a((short)4, b6, a9, 0);
                array3[l].b = ku.a((short)157, b6, a9, 0L);
                b6 = a9;
            }
            if (this.b != null) {
                this.b.a(array3);
            }
        }
        if (this.b != null) {
            this.b.U();
        }
    }
    
    private static ll a(final ku ku, final int n, final int n2, final boolean b) {
        final ll ll;
        (ll = new ll(ku.b(n), ku.a((short)84, n, n2, (byte)0))).n = ku.a((short)4, n, n2, 0);
        ll.p = ku.a((short)139, n, n2, -1);
        ll.j = ku.a((short)27, n, n2, 0);
        if (b) {
            ll.d = ku.d((short)26, n, n2);
            ll.i = ku.a((short)135, n, n2, -1);
            ll.f = ku.a((short)15, n, n2, (byte)7);
            ll.h = ku.a((short)16, n, n2, (byte)2);
            ll.m = ku.a((short)138, n, n2, (byte)0);
            ll.q = ku.a((short)144, n, n2, 0);
            ll.g = ku.d((short)117, n, n2);
            ll.s = ku.a((short)156, n, n2, (byte)(-1));
            ll.t = ku.a((short)85, n, n2, (byte)1);
            ll.k = ku.a((short)190, n, n2, (byte)(-1));
            final lb r;
            (r = new lb()).a = ku.a((short)118, n, n2, 0);
            r.b = ku.a((short)119, n, n2, 0);
            r.c = ku.a((short)120, n, n2, 0);
            r.d = ku.a((short)121, n, n2, 0);
            r.e = ku.a((short)72, n, n2, 0);
            r.f = ku.a((short)71, n, n2, 0);
            r.g = ku.a((short)126, n, n2, 0);
            r.h = ku.a((short)124, n, n2, 0);
            r.i = ku.a((short)47, n, n2, 0);
            r.j = ku.a((short)200, n, n2, 0);
            r.k = ku.a((short)201, n, n2, 0);
            r.l = ku.a((short)202, n, n2, 0);
            r.m = ku.a((short)203, n, n2, 0);
            r.n = ku.a((short)204, n, n2, 0);
            r.o = ku.a((short)221, n, n2, 0);
            ll.r = r;
        }
        return ll;
    }
    
    private void c(final ku ku) {
        final byte a = ku.a((short)12, (byte)0);
        final String d = ku.d((short)131);
        final int c = ku.c((short)41, -1);
        final int c2 = ku.c((short)13, 0);
        final int[] array = new int[ku.b((short)4)];
        int b = ku.b((short)4, 0);
        for (int i = 0; i < array.length; ++i) {
            array[i] = ku.a(b, 0);
            ++b;
        }
        this.b.a(a == 2, d, c, array, c2);
        final int c3 = ku.c((short)170, -1);
        final String[] array2;
        if ((array2 = new String[ku.b((short)1)]).length > 0) {
            int b2 = ku.b((short)1, 0);
            for (int j = 0; j < array2.length; ++j) {
                final int a2 = ku.a((short)1, b2);
                array2[j] = ku.b(b2);
                b2 = a2;
            }
        }
        this.b.a(c3, array2);
    }
    
    private void d(final ku ku) {
        try {
            final byte a = ku.a((short)12, (byte)0);
            final String d = ku.d((short)20);
            if (a == 0) {
                final jm[] array = new jm[ku.b((short)21)];
                int b = ku.b((short)21, 0);
                for (int i = 0; i < array.length; ++i) {
                    final int a2 = ku.a((short)21, b);
                    final jm jm;
                    (jm = new jm()).c = ku.a(b, -1);
                    jm.b = ku.d((short)26, b, a2);
                    jm.a = ku.a((short)22, b, a2, (byte)0);
                    jm.d = ku.a((short)102, b, a2, 0);
                    jm.e = ku.a((short)103, b, a2, 0);
                    jm.f = ku.a((short)104, b, a2, 0);
                    jm.g = ku.a((short)105, b, a2, 0);
                    jm.h = (ku.a((short)101, b, a2, (byte)0) == 1);
                    jm.i = ku.a((short)4, b, a2, 0);
                    array[i] = jm;
                    b = a2;
                }
                for (int j = 0; j < array.length - 1; ++j) {
                    for (int k = j + 1; k < array.length; ++k) {
                        if (array[j].c > array[k].c) {
                            final jm jm2 = array[j];
                            array[j] = array[k];
                            array[k] = jm2;
                        }
                    }
                }
                this.b.a(d, array);
                return;
            }
            final a a3 = new a();
            final jn jn;
            (jn = new jn()).a = d;
            jn.b = ku.d((short)26);
            jn.c = ku.c((short)41, 0);
            jn.d = ku.c((short)56, 0);
            jn.e = ku.c((short)57, 0);
            jn.h = ku.c((short)55);
            jn.i = ku.c((short)54);
            jn.j = ku.c((short)61);
            jn.k = ku.c((short)60, 0);
            jn.f = ku.c((short)63, 0);
            jn.g = ku.c((short)29, 0);
            a3.a(new Integer(jn.k));
            a3.a(new Integer(jn.f));
            a3.a(new Integer(jn.g));
            final jm[] l = new jm[ku.b((short)21)];
            int b2 = ku.b((short)21, 0);
            for (int n = 0; n < l.length; ++n) {
                final int a4 = ku.a((short)21, b2);
                final jm jm3;
                (jm3 = new jm()).c = ku.a(b2, -1);
                jm3.b = ku.d((short)26, b2, a4);
                jm3.a = ku.a((short)22, b2, a4, (byte)0);
                jm3.d = ku.a((short)102, b2, a4, 0);
                jm3.e = ku.a((short)103, b2, a4, 0);
                jm3.f = ku.a((short)104, b2, a4, 0);
                jm3.g = ku.a((short)105, b2, a4, 0);
                jm3.h = (ku.a((short)101, b2, a4, (byte)0) == 1);
                jm3.i = ku.a((short)4, b2, a4, 0);
                if (jm3.i != 0) {
                    a3.a(new Integer(jm3.i));
                }
                l[n] = jm3;
                b2 = a4;
            }
            for (int n2 = 0; n2 < l.length - 1; ++n2) {
                for (int n3 = n2 + 1; n3 < l.length; ++n3) {
                    if (l[n2].c > l[n3].c) {
                        final jm jm4 = l[n2];
                        l[n2] = l[n3];
                        l[n3] = jm4;
                    }
                }
            }
            jn.l = l;
            final int a5 = ku.a(ku.b((short)6, 0), 0);
            final int[] array2 = new int[a3.d()];
            for (int n4 = 0; n4 < array2.length; ++n4) {
//                array2[n4] = (int)a3.b(n4);
                array2[n4] = ((Integer)a3.b(n4)).intValue();
            }
            final int[] array3;
            if ((array3 = new int[ku.b((short)154)]).length > 0) {
                int b3 = ku.b((short)154, 0);
                for (int n5 = 0; n5 < array3.length; ++n5) {
                    final int a6 = ku.a((short)154, b3);
                    array3[n5] = ku.a(b3, 0);
                    b3 = a6;
                }
            }
            this.b.a(jn, array2, a5, array3, ku.a(ku.b((short)6, 1), 0));
        }
        catch (final OutOfMemoryError outOfMemoryError) {}
    }
    
    private void e(final ku ku) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        final int b;
        final df[] array = new df[b = ku.b((short)90)];
        final byte[] array2 = new byte[b];
        int b2 = ku.b((short)90, 0);
        for (int i = 0; i < b; ++i) {
            final int a = ku.a((short)90, b2);
            final int a2 = ku.a(b2, 0);
            array2[i] = ku.a((short)91, b2, a, (byte)0);
            final df df;
            (df = new df(a2)).b = ku.d((short)92, b2, a);
            df.c = ku.a((short)16, b2, a, (byte)0);
            final int a3 = ku.a((short)93, b2, a, 0);
            final String d = ku.d((short)94, b2, a);
            df.d = new dg(a3, ku.c((short)95, b2, a));
            df.d.b = d;
            df.e = df.d;
            (df.f = new dg[ku.a((short)96, b2, a)])[0] = df.d;
            int a4 = ku.a((short)96, b2);
            int n7 = 1;
            for (int j = 0; j < df.f.length; ++j) {
                final int a5 = ku.a((short)96, a4);
                final int a6 = ku.a(a4, 0);
                final String d2 = ku.d((short)97, a4, a5);
                final byte[] c = ku.c((short)98, a4, a5);
                if (a6 != a3) {
                    df.f[n7] = new dg(a6, c);
                    df.f[n7].b = d2;
                    ++n7;
                }
                a4 = a5;
            }
            if (df.c == 0) {
                switch (array2[i]) {
                    case 0: {
                        ++n2;
                        break;
                    }
                    case 1: {
                        ++n;
                        break;
                    }
                    case 2: {
                        ++n3;
                        break;
                    }
                }
            }
            else {
                switch (array2[i]) {
                    case 0: {
                        ++n5;
                        break;
                    }
                    case 1: {
                        ++n4;
                        break;
                    }
                    case 2: {
                        ++n6;
                        break;
                    }
                }
            }
            array[i] = df;
            b2 = a;
        }
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        final df[] array3 = new df[n];
        final df[] array4 = new df[n2];
        final df[] array5 = new df[n3];
        final df[] array6 = new df[n4];
        final df[] array7 = new df[n5];
        final df[] array8 = new df[n6];
        for (int k = 0; k < array.length; ++k) {
            if (array[k].c == 0) {
                switch (array2[k]) {
                    case 0: {
                        array4[n9++] = array[k];
                        break;
                    }
                    case 1: {
                        array3[n8++] = array[k];
                        break;
                    }
                    case 2: {
                        array5[n10++] = array[k];
                        break;
                    }
                }
            }
            else {
                switch (array2[k]) {
                    case 0: {
                        array7[n12++] = array[k];
                        break;
                    }
                    case 1: {
                        array6[n11++] = array[k];
                        break;
                    }
                    case 2: {
                        array8[n13++] = array[k];
                        break;
                    }
                }
            }
        }
        this.b.a(array4, array3, array5, array7, array6, array8);
    }
    
    private void f(final ku ku) {
        final String d = ku.d((short)20);
        final byte a = ku.a((short)40, (byte)3);
        final jo[] array = new jo[ku.b((short)9)];
        int b = ku.b((short)9, 0);
        for (int i = 0; i < array.length; ++i) {
            final int a2 = ku.a((short)9, b);
            final jo jo;
            (jo = new jo()).a = ku.b(b);
            jo.b = ku.d((short)26, b, a2);
            jo.d = ku.a((short)27, b, a2, 0);
            jo.c = ku.a((short)15, b, a2, (byte)0);
            jo.e = ku.a((short)129, b, a2, 0);
            jo.f = ku.a((short)106, b, a2, 0);
            jo.g = ku.a((short)107, b, a2, (byte)0);
            array[i] = jo;
            b = a2;
        }
        switch (a) {
            case 0: {
                this.b.b(array, d);
                return;
            }
            case 1: {
                this.b.c(array, d);
                return;
            }
            case 3: {
                this.b.a(array, d);
                break;
            }
        }
    }
    
    private void g(final ku ku) {
        final ns[] array = new ns[ku.b((short)77)];
        int b = ku.b((short)77, 0);
        for (int i = 0; i < array.length; ++i) {
            final int a = ku.a((short)77, b);
            final String b2 = ku.b(b);
            final String d = ku.d((short)26, b, a);
            final boolean e = ku.a((short)100, b, a, (byte)0) == 1;
            array[i] = new ns(b2, d, "", 0L);
            array[i].e = e;
            b = a;
        }
        this.b.a(array);
    }
    
    private void h(final ku ku) {
        final String d = ku.d((short)192);
        final int b;
        if ((b = ku.b((short)9)) > 0) {
            final doo[] array = new doo[b];
            int b2 = ku.b((short)9, 0);
            try {
                for (int i = 0; i < array.length; ++i) {
                    final int a = ku.a((short)9, b2);
                    array[i] = d(ku, b2, a);
                    b2 = a;
                }
                this.b.a(d, array);
            }
            catch (final OutOfMemoryError outOfMemoryError) {
                ku.c = null;
                System.gc();
            }
        }
    }
    
    private void i(final ku ku) {
        final byte a = ku.a((short)193, (byte)0);
        int b = ku.b((short)192, 0);
        final int b2;
        final lr[] array = new lr[b2 = ku.b((short)192)];
        for (int i = 0; i < b2; ++i) {
            final int a2 = ku.a((short)192, b);
            final lr[] array2 = array;
            final int n = i;
            final int n2 = b;
            final int n3 = a2;
            final int n4 = n2;
            array2[n] = new lr(ku.b(n4), ku.d((short)26, n4, n3), ku.d((short)1, n4, n3), ku.a((short)106, n4, n3, 0), ku.a((short)101, n4, n3, (byte)0), ku.a((short)143, n4, n3, (byte)0));
            b = a2;
        }
        if (a != 0) {
            this.b.b(array);
            return;
        }
        this.b.a(array);
    }
    
    private static doo d(final ku ku, final int n, final int n2) {
        final doo doo;
        (doo = new doo()).a = ku.b(n);
        doo.b = ku.a((short)27, n, n2, 0);
        doo.c = ku.a((short)24, n, n2, (byte)0);
        doo.d = ku.a((short)160, n, n2, 0);
        doo.f = ku.a((short)132, n, n2, 0);
        return doo;
    }
    
    private void j(final ku ku) {
        ct.a("[processPrepareData]======================================");
        lh lh = null;
        lh lh2 = null;
        final byte a = ku.a((short)111, (byte)0);
        final byte a2 = ku.a((short)140, (byte)0);
        boolean b = false;
        int b2 = ku.b((short)9, 0);
        for (int i = 0; i < 2; ++i) {
            final int a3 = ku.a((short)9, b2);
            final lh c = this.c(ku, b2, a3);
            if (a2 != 9) {
                if (c.b.equals(go.e)) {
                    lh = c;
                    if (lh2 == null) {
                        b = true;
                    }
                }
                else {
                    lh2 = c;
                }
            }
            else if (lh == null) {
                lh = c;
                ks.i = c.b;
            }
            else {
                lh2 = c;
            }
            b2 = a3;
        }
        ks.a().e = ku.d((short)28);
        final byte[] c2 = ku.c((short)30);
        byte[] array = null;
        byte[] array2 = null;
        for (int b3 = ku.b((short)35), j = 0; j < b3; ++j) {
            final byte[] a4 = ku.a(ku.b((short)35, j));
            if (array == null) {
                array = a4;
            }
            else {
                array2 = a4;
            }
        }
        this.b.a(lh, lh2, b, c2, array, array2, ku.a((short)70, (byte)0), a, a2);
    }
    
    private lm[] k(final ku ku) {
        return a(ku, 0);
    }
    
    private static lm[] a(final ku ku, int b) {
        final lm[] array = new lm[ku.b((short)114) - b];
        b = ku.b((short)114, b);
        for (int i = 0; i < array.length; ++i) {
            final int a = ku.a((short)114, b);
            array[i] = new lm(ku.a(b, 0));
            array[i].b = ku.d((short)26, b, a);
            array[i].d = ku.d((short)117, b, a);
            array[i].g = ku.a((short)106, b, a, 0);
            array[i].e = ku.a((short)122, b, a, (byte)(-1));
            array[i].f = ku.a((short)123, b, a, (byte)(-1));
            array[i].j = ku.a((short)4, b, a, 0);
            array[i].h = ku.a((short)145, b, a, 0);
            array[i].i = ku.a((short)106, b, a, 0);
            array[i].l = ku.a((short)82, b, a, -1);
            array[i].k = ku.a((short)132, b, a, 0L);
            array[i].m = ku.a((short)85, b, a, (byte)1);
            b = a;
        }
        return array;
    }
    
    private void l(final ku ku) {
        final int c = ku.c((short)41, 0);
        final byte[] c2 = ku.c((short)30);
        final byte[] c3 = ku.c((short)35);
        final byte[] a = ku.a(ku.b((short)35, 1));
        final lh[] array = { null };
        final lh[] array2 = { null };
        int b = ku.b((short)9, 0);
        for (int i = 0; i < 2; ++i) {
            final int a2 = ku.a((short)9, b);
            final lh b2 = this.b(ku, b, a2);
            if (oq.o != 9) {
                if (b2.b.equals(go.e)) {
                    array[0] = b2;
                }
                else {
                    array2[0] = b2;
                }
            }
            else if (array[0] == null) {
                array[0] = b2;
            }
            else {
                array2[0] = b2;
            }
            b = a2;
        }
        ku.a((short)133, (byte)0);
        final boolean b3 = ku.c((short)32) != null;
        if (this.c != null) {
            this.c.a(c2, c3, a, array, array2, b3, c);
        }
    }
    
    private void a(final ku ku, final nq nq) {
        if (this.c == null) {
            return;
        }
        final int b = ku.b((short)35);
        nq.g = new byte[b][];
        for (int i = 0; i < b; ++i) {
            final byte[] a;
            if ((a = ku.a(ku.b((short)35, i))) != null) {
                nq.g[i] = a;
            }
        }
        final byte[] c;
        if ((c = ku.c((short)30)) != null) {
            nq.h = c;
        }
        b(ku, nq);
        nq.D = ku.a((short)52, (byte)0);
        nq.F = ku.a((short)172, (byte)0);
        nq.C = ku.a((short)133, (byte)0);
        final boolean d = ku.c((short)32) != null;
        nq.a = ku.d((short)62);
        final byte[] c2;
        if ((c2 = ku.c((short)39)) != null) {
            this.c.a(nq);
            nq.E = true;
            this.a(ku, c2[0], nq.b);
            return;
        }
        nq.d = d;
        this.c.a(nq);
    }
    
    private static void b(final ku ku, final nq nq) {
        final int b = ku.b((short)9);
        int b2 = ku.b((short)9, 0);
        nq.f = new nl[b];
        for (int i = 0; i < b; ++i) {
            final int a = ku.a((short)9, b2);
            nq.f[i] = new nl(ku.b(b2), ku.a((short)46, b2, a, -1), ku.a((short)17, b2, a, -1), ku.a((short)18, b2, a, -1), ku.a((short)45, b2, a, -1), ku.a((short)19, b2, a, (byte)0));
            b2 = a;
            ct.a(new StringBuffer().append(nq.f[i]).toString());
        }
    }
    
    private void m(final ku ku) {
        final nq nq;
        (nq = new nq(ku.c((short)41, 0), (byte)5)).i = ku.a((short)44, 0L);
        final int a = ku.a(ku.b((short)64, 0), -1);
        final int a2 = ku.a(ku.b((short)75, 0), 0);
        byte[] array = new byte[0];
        byte[] array2 = new byte[0];
        final int b;
        if ((b = ku.b((short)50)) > 0) {
            array = new byte[b];
            array2 = new byte[b];
            int b2 = ku.b((short)50, 0);
            for (int i = 0; i < b; ++i) {
                final int a3 = ku.a((short)50, b2);
                array[i] = (byte)ku.a(b2, -1);
                array2[i] = (byte)ku.a((short)51, b2, a3, -1);
                b2 = a3;
            }
        }
        byte[] array3 = new byte[0];
        byte[] array4 = new byte[0];
        final int b3;
        if ((b3 = ku.b((short)33)) > 0) {
            array3 = new byte[b3];
            array4 = new byte[b3];
            int b4 = ku.b((short)33, 0);
            for (int j = 0; j < b3; ++j) {
                final int a4 = ku.a((short)33, b4);
                array3[j] = (byte)ku.a(b4, -1);
                array4[j] = (byte)ku.a((short)34, b4, a4, -1);
                b4 = a4;
            }
        }
        final nq nq2 = nq;
        final int n = a;
        final int n2 = a2;
        final byte[] array5 = array3;
        final byte[] array6 = array4;
        final byte[] array7 = array;
        final byte[] p = array2;
        final byte[] q = array7;
        final byte[] o = array6;
        final byte[] s = array5;
        final int r = n2;
        final int n3 = n;
        final nq nq3 = nq2;
        nq2.n = n3;
        nq3.r = r;
        nq3.s = s;
        nq3.o = o;
        nq3.p = p;
        nq3.q = q;
        this.a(ku, nq);
    }
    
    private void a(final ku ku, final byte t, final int n) {
        final nq nq = new nq(n, (byte)8);
        final int c = ku.c((short)42, 0);
        final int c2 = ku.c((short)43, 0);
        final int c3 = ku.c((short)110, 0);
        final int[] array2;
        final int[] array = new int[(array2 = new int[ku.b((short)73)]).length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = ku.a(ku.b((short)73, i), -1);
            array[i] = ku.a(ku.b((short)74, i), -1);
        }
        final ll[] array3 = new ll[ku.b((short)83)];
        int b = ku.b((short)83, 0);
        for (int j = 0; j < array3.length; ++j) {
            final int a = ku.a((short)83, b);
            array3[j] = a(ku, b, a, true);
            b = a;
        }
        final lm[] a2 = a(ku, 0);
        if (this.c != null) {
            final nq nq2 = nq;
            final int n2 = c;
            final int n3 = c3;
            final int n4 = c2;
            final int[] array4 = array2;
            final int[] array5 = array;
            final ll[] array6 = array3;
            final lm[] b2 = a2;
            final ll[] a3 = array6;
            final int[] z = array5;
            final int[] y = array4;
            final int w = n4;
            final int v = n3;
            final int u = n2;
            final nq nq3 = nq2;
            nq2.t = t;
            nq3.A = a3;
            nq3.v = v;
            nq3.u = u;
            nq3.w = w;
            nq3.x = 0;
            nq3.y = y;
            nq3.z = z;
            nq3.B = b2;
            this.c.a(nq);
        }
    }
    
    private void n(final ku ku) {
        final String d = ku.d((short)77);
        final String d2 = ku.d((short)26);
        final String d3 = ku.d((short)79);
        final long a = ku.a((short)132, 0L);
        final boolean b = ku.a((short)100, (byte)0) == 0;
        final ns ns = new ns(d, d2, d3, a);
        final int b2;
        if ((b2 = ku.b((short)80)) > 0) {
            final nt[] f = new nt[b2];
            int b3 = ku.b((short)80, 0);
            for (int i = 0; i < f.length; ++i) {
                final int a2 = ku.a((short)80, b3);
                f[i] = new nt(ku.a(b3, -1), ku.d((short)81, b3, a2), null, d);
                b3 = a2;
            }
            ns.f = f;
        }
        this.b.a(ns, b);
    }
    
    private static void o(final ku ku) {
        final String d = ku.d((short)77);
        final ns ns = new ns(d, "", "", 0L);
        final int b;
        if ((b = ku.b((short)80)) > 0) {
            final nt[] f = new nt[b];
            int b2 = ku.b((short)80, 0);
            for (int i = 0; i < f.length; ++i) {
                final int a = ku.a((short)80, b2);
                f[i] = new nt(ku.a(b2, -1), ku.d((short)81, b2, a), null, d);
                b2 = a;
            }
            ns.f = f;
        }
        nu.b(ns);
    }
    
    private void p(final ku ku) {
        final String d = ku.d((short)77);
        final String d2 = ku.d((short)26);
        final String[] g = new String[ku.b((short)1)];
        int b = ku.b((short)1, 0);
        for (int i = 0; i < g.length; ++i) {
            final int a = ku.a((short)1, b);
            g[i] = ku.b(b);
            b = a;
        }
        final ns ns;
        (ns = new ns(d, d2, "", 0L)).g = g;
        nu.a(ns);
        this.b.a(ku.d((short)149), (byte)0);
    }
    
    private void q(final ku ku) {
        final int b;
        final lw[] array = new lw[b = ku.b((short)64)];
        int b2 = ku.b((short)64, 0);
        for (int i = 0; i < b; ++i) {
            final int a = ku.a((short)64, b2);
            array[i] = new lw(ku.a(b2, 0));
            array[i].b = ku.d((short)26, b2, a);
            array[i].d = ku.a((short)136, b2, a, 0);
            final lx[] c = new lx[ku.a((short)67, b2, a)];
            int a2 = ku.a((short)67, b2);
            for (int j = 0; j < c.length; ++j) {
                final int a3 = ku.a((short)67, a2);
                c[j] = new lx(array[i].a);
                c[j].a = ku.a(a2, 0);
                c[j].e = ku.d((short)66, a2, a3);
                c[j].c = ku.a((short)76, a2, a3, 0);
                c[j].b = ku.a((short)135, a2, a3, 0);
                c[j].d = ku.a((short)68, a2, a3, 0);
                a2 = a3;
            }
            for (int k = 0; k < c.length; ++k) {
                for (int l = k + 1; l < c.length; ++l) {
                    if (c[k].a > c[l].a) {
                        final lx lx = c[k];
                        c[k] = c[l];
                        c[l] = lx;
                    }
                }
            }
            array[i].c = c;
            b2 = a;
        }
        this.b.a(array);
    }
    
    private void r(final ku ku) {
        ku.d((short)9);
        final ll[] array;
        if ((array = new ll[ku.b((short)83)]).length > 0) {
            int b = ku.b((short)83, 0);
            for (int i = 0; i < array.length; ++i) {
                int n;
                if ((n = ku.a((short)83, b)) < 0) {
                    n = ku.a((short)114, b);
                }
                array[i] = a(ku, b, n, true);
                b = n;
            }
        }
        this.b.a(array, a(ku, 0), ku.c((short)86, 0), ku.c((short)145, 0));
    }
    
    private void s(final ku ku) {
        switch (ku.a((short)147, (byte)(-1))) {
            case 0: {
                final String d = ku.d((short)9);
                ks.a().g.a(ku.d((short)150));
                this.b.k(d);
                return;
            }
            case 1: {
                final String d2 = ku.d((short)9);
                final String d3 = ku.d((short)150);
                if (ku.a((short)31, (byte)(-1)) == 0) {
                    this.b.m(d2);
                    return;
                }
                this.b.n(d2);
                ks.a().f = d3;
                ks.j = 0;
                return;
            }
            case 4: {
                final String d4 = ku.d((short)9);
                ks.j = ku.c((short)41, 0);
                if (d4.equals(ks.a().c)) {
                    this.b.K();
                    return;
                }
                final int c = ku.c((short)106, -1);
                final String d5 = ku.d((short)83);
                if (c > 0) {
                    this.b.b(a(ku, ku.b((short)83, 0), -1, true));
                    return;
                }
                this.b.j(d5);
                return;
            }
            case 3: {
                final String d6 = ku.d((short)9);
                ks.j = ku.c((short)41, 0);
                if (d6.equals(ks.a().c)) {
                    this.b.K();
                    return;
                }
                final lm[] a = a(ku, 0);
                final int c2;
                if ((c2 = ku.c((short)106, -1)) > 0) {
                    this.b.a(a[0], c2);
                    return;
                }
                this.b.a(a[0]);
                return;
            }
            case 2: {
                final String d7 = ku.d((short)9);
                ks.j = ku.c((short)41, 0);
                if (d7.equals(ks.a().c)) {
                    this.b.K();
                    return;
                }
                this.b.l((int)ku.a((short)132, 0L));
                return;
            }
            case 5: {
                this.b.i(ku.d((short)9));
                return;
            }
            case 6: {
                final int n = (int)ku.a((short)132, -1L);
                final ll[] array;
                if ((array = new ll[ku.b((short)83)]).length > 0) {
                    int b = ku.b((short)83, 0);
                    for (int i = 0; i < array.length; ++i) {
                        final int a2 = ku.a((short)83, b);
                        array[i] = a(ku, b, a2, true);
                        b = a2;
                    }
                }
                this.b.a(array, a(ku, 0), n);
                return;
            }
            case 7: {
                this.b.P();
                return;
            }
            case 8: {
                this.b.O();
                return;
            }
            case 9: {
                this.b.l(ku.d((short)9));
                break;
            }
        }
    }
    
    private void t(final ku ku) {
        final int b;
        if ((b = ku.b((short)147)) > 0) {
            final int[] array = new int[b];
            final String[] array2 = new String[b];
            int b2 = ku.b((short)147, 0);
            for (int i = 0; i < array.length; ++i) {
                final int a = ku.a((short)147, b2);
                array[i] = ku.a(b2, (byte)0);
                array2[i] = ku.d((short)168, b2, a);
                b2 = a;
            }
            this.b.a(array, array2);
        }
    }
    
    private static lb e(final ku ku, final int n, final int n2) {
        final lb lb;
        (lb = new lb()).a = ku.a((short)118, n, n2, 0);
        lb.b = ku.a((short)119, n, n2, 0);
        lb.c = ku.a((short)120, n, n2, 0);
        lb.d = ku.a((short)121, n, n2, 0);
        lb.e = ku.a((short)72, n, n2, 0);
        lb.f = ku.a((short)71, n, n2, 0);
        lb.g = ku.a((short)126, n, n2, 0);
        lb.h = ku.a((short)124, n, n2, 0);
        lb.i = ku.a((short)47, n, n2, 0);
        lb.j = ku.a((short)200, n, n2, 0);
        lb.k = ku.a((short)201, n, n2, 0);
        lb.l = ku.a((short)202, n, n2, 0);
        lb.m = ku.a((short)203, n, n2, 0);
        lb.n = ku.a((short)204, n, n2, 0);
        lb.o = ku.a((short)221, n, n2, 0);
        return lb;
    }
    
    private lq[] u(final ku ku) {
        final lq[] array = new lq[ku.b((short)175)];
        int b = ku.b((short)175, 0);
        for (int i = 0; i < array.length; ++i) {
            final int a = ku.a((short)175, b);
            final lq lq;
            (lq = new lq()).b = ku.b(b);
            lq.c = ku.a((short)159, b, a, (byte)(-1));
            lq.f = ku.d((short)62, b, a);
            lq.d = ku.a((short)145, b, a, -1);
            lq.g = ku.a((short)157, b, a, 0L);
            switch (lq.c) {
                case 0: {
                    final ll e;
                    (e = new ll("", ku.a((short)84, b, a, (byte)0))).b = ku.a(b, 0);
                    e.n = ku.a((short)4, b, a, 0);
                    e.j = ku.a((short)27, b, a, 0);
                    e.l = ku.a((short)145, b, a, 0);
                    e.d = ku.d((short)26, b, a);
                    e.i = ku.a((short)135, b, a, -1);
                    e.f = ku.a((short)15, b, a, (byte)7);
                    e.h = ku.a((short)16, b, a, (byte)0);
                    e.m = ku.a((short)138, b, a, (byte)0);
                    e.p = ku.a((short)139, b, a, 0);
                    e.q = ku.a((short)144, b, a, 0);
                    e.g = ku.d((short)117, b, a);
                    e.k = ku.a((short)190, b, a, (byte)(-1));
                    e.t = ku.a((short)85, b, a, (byte)1);
                    e.r = e(ku, b, a);
                    lq.e = e;
                    break;
                }
                case 1: {
                    final lm e2;
                    (e2 = new lm(ku.a((short)114, b, a, -1))).b = ku.d((short)26, b, a);
                    e2.d = ku.d((short)117, b, a);
                    e2.g = ku.a((short)106, b, a, 0);
                    e2.e = ku.a((short)122, b, a, (byte)(-1));
                    e2.f = ku.a((short)123, b, a, (byte)(-1));
                    e2.j = ku.a((short)4, b, a, 0);
                    e2.h = ku.a((short)145, b, a, 0);
                    e2.i = ku.a((short)106, b, a, 0);
                    e2.l = ku.a((short)82, b, a, -1);
                    e2.k = ku.a((short)132, b, a, 0L);
                    e2.m = ku.a((short)85, b, a, (byte)1);
                    lq.e = e2;
                    break;
                }
                case 99: {
                    final lu e3;
                    (e3 = new lu(ku.a((short)155, b, a, -1))).a = ku.d((short)26, b, a);
                    e3.b = ku.d((short)1, b, a);
                    e3.c = ku.a((short)145, b, a, 0);
                    lq.e = e3;
                    break;
                }
            }
            array[i] = lq;
            b = a;
        }
        return array;
    }
    
    private void v(final ku ku) {
        switch (ku.a((short)147, (byte)(-1))) {
            case 0: {
                final lf[] array;
                if ((array = new lf[ku.b((short)152)]).length > 0) {
                    int b = ku.b((short)152, 0);
                    for (int i = 0; i < array.length; ++i) {
                        final int a = ku.a((short)152, b);
                        array[i] = new lf(ku.a(b, (byte)(-1)), ku.d((short)26, b, a), ku.a((short)106, b, a, 0));
                        b = a;
                    }
                }
                this.b.a(array);
                return;
            }
            case 1: {
                final kq b2 = this.b;
                final byte a2 = ku.a((short)152, (byte)(-1));
                final lq[] array2 = new lq[ku.b((short)153)];
                int b3 = ku.b((short)153, 0);
                for (int j = 0; j < array2.length; ++j) {
                    final int a3 = ku.a((short)153, b3);
                    final lq lq;
                    (lq = new lq()).a = ku.a(b3, -1);
                    lq.c = ku.a((short)159, b3, a3, (byte)(-1));
                    lq.d = ku.a((short)145, b3, a3, -1);
                    switch (lq.c) {
                        case 0: {
                            final ll e;
                            (e = new ll("", ku.a((short)84, b3, a3, (byte)0))).b = ku.a(b3, 0);
                            e.n = ku.a((short)4, b3, a3, 0);
                            e.l = ku.a((short)145, b3, a3, 0);
                            e.j = ku.a((short)27, b3, a3, 0);
                            e.d = ku.d((short)26, b3, a3);
                            e.i = ku.a((short)135, b3, a3, -1);
                            e.f = ku.a((short)15, b3, a3, (byte)7);
                            e.h = ku.a((short)16, b3, a3, (byte)0);
                            e.m = ku.a((short)138, b3, a3, (byte)0);
                            e.q = ku.a((short)144, b3, a3, 0);
                            e.g = ku.d((short)117, b3, a3);
                            e.k = ku.a((short)190, b3, a3, (byte)(-1));
                            e.t = ku.a((short)85, b3, a3, (byte)1);
                            e.r = e(ku, b3, a3);
                            lq.e = e;
                            break;
                        }
                        case 1: {
                            final lm e2;
                            (e2 = new lm(ku.a((short)114, b3, a3, -1))).b = ku.d((short)26, b3, a3);
                            e2.d = ku.d((short)117, b3, a3);
                            e2.g = ku.a((short)106, b3, a3, 0);
                            e2.e = ku.a((short)122, b3, a3, (byte)(-1));
                            e2.f = ku.a((short)123, b3, a3, (byte)(-1));
                            e2.j = ku.a((short)4, b3, a3, 0);
                            e2.h = ku.a((short)145, b3, a3, 0);
                            e2.i = ku.a((short)106, b3, a3, 0);
                            e2.l = ku.a((short)82, b3, a3, -1);
                            e2.k = ku.a((short)132, b3, a3, 0L);
                            e2.m = ku.a((short)85, b3, a3, (byte)1);
                            lq.e = e2;
                            break;
                        }
                        case 99: {
                            final lu e3;
                            (e3 = new lu(ku.a((short)155, b3, a3, -1))).a = ku.d((short)26, b3, a3);
                            e3.b = ku.d((short)1, b3, a3);
                            e3.c = ku.a((short)145, b3, a3, 0);
                            lq.e = e3;
                            break;
                        }
                    }
                    array2[j] = lq;
                    b3 = a3;
                }
                b2.a(a2, array2);
                return;
            }
            case 2: {
                final int b4;
                if ((b4 = ku.b((short)114)) > 0) {
                    final int[] array3 = new int[b4];
                    final int[] array4 = new int[b4];
                    for (int k = 0; k < b4; ++k) {
                        array3[k] = ku.a(ku.b((short)114, k), -1);
                        array4[k] = ku.a(ku.b((short)106, k), -1);
                    }
                    this.b.a(array3, array4);
                }
                final int b5;
                if ((b5 = ku.b((short)83)) > 0) {
                    final String[] array5 = new String[b5];
                    final int[] array6 = new int[b5];
                    for (int l = 0; l < b5; ++l) {
                        array5[l] = ku.b(ku.b((short)83, l));
                        array6[l] = ku.a(ku.b((short)146, l), -1);
                    }
                    this.b.a(array5, array6);
                    break;
                }
                break;
            }
        }
    }
    
    private void w(final ku ku) {
        final byte a = ku.a((short)208, (byte)0);
        final int b;
        final dh[] array = new dh[b = ku.b((short)9)];
        if (b > 0) {
            int b2 = ku.b((short)9, 0);
            for (int i = 0; i < array.length; ++i) {
                final int a2 = ku.a((short)9, b2);
                array[i] = new dh(ku.a((short)148, b2, a2, 0), ku.d((short)211, b2, a2), ku.b(b2), ku.d((short)1, b2, a2));
                b2 = a2;
            }
        }
        for (int j = 0; j < array.length - 1; ++j) {
            for (int k = j + 1; k < array.length; ++k) {
                if (array[j].a > array[k].a) {
                    final dh dh = array[j];
                    array[j] = array[k];
                    array[k] = dh;
                }
            }
        }
        this.b.a(a, array);
    }
    
    private void x(final ku ku) {
        final String d = ku.d((short)175);
        final ll[] array;
        if ((array = new ll[ku.b((short)83)]).length > 0) {
            int b = ku.b((short)83, 0);
            for (int i = 0; i < array.length; ++i) {
                int n;
                if ((n = ku.a((short)83, b)) < 0) {
                    n = ku.a((short)114, b);
                }
                array[i] = a(ku, b, n, true);
                b = n;
            }
        }
        this.b.a(d, array, a(ku, 0));
    }
    
    private void y(final ku ku) {
        final lf[] array;
        if ((array = new lf[ku.b((short)152)]).length > 0) {
            int b = ku.b((short)152, 0);
            for (int i = 0; i < array.length; ++i) {
                final int a = ku.a((short)152, b);
                array[i] = new lf(ku.a(b, (byte)(-1)), ku.d((short)26, b, a), ku.a((short)106, b, a, 0));
                b = a;
            }
        }
        this.b.b(array);
    }
    
    private void z(final ku ku) {
        final String d = ku.d((short)175);
        final ll[] array;
        if ((array = new ll[ku.b((short)83)]).length > 0) {
            int b = ku.b((short)83, 0);
            for (int i = 0; i < array.length; ++i) {
                int n;
                if ((n = ku.a((short)83, b)) < 0) {
                    n = ku.a((short)114, b);
                }
                array[i] = a(ku, b, n, true);
                b = n;
            }
        }
        this.b.b(d, array, a(ku, 0));
    }
    
    private void A(final ku ku) {
        final String d = ku.d((short)186);
        final byte a = ku.a((short)189, (byte)(-1));
        final ll[] array = new ll[ku.b((short)83)];
        if (array.length > 0) {
            int b = ku.b((short)83, 0);
            for (int i = 0; i < array.length; ++i) {
                final int a2 = ku.a((short)83, b);
                array[i] = a(ku, b, a2, true);
                b = a2;
            }
        }
        this.b.a(d, array, a(ku, 0), a);
    }
    
    private void B(final ku ku) {
        final String d = ku.d((short)186);
        final byte a = ku.a((short)189, (byte)(-1));
        final ll[] array = new ll[ku.b((short)83)];
        if (array.length > 0) {
            int b = ku.b((short)83, 0);
            for (int i = 0; i < array.length; ++i) {
                final int a2 = ku.a((short)83, b);
                array[i] = a(ku, b, a2, true);
                b = a2;
            }
        }
        this.b.b(d, array, a(ku, 0), a);
    }
    
    private void C(final ku ku) {
        ku.d((short)9);
        final int b;
        final String[] array = new String[b = ku.b((short)83)];
        final int[] array2 = new int[b];
        final int[] array3 = new int[b];
        final int b2;
        final int[] array4 = new int[b2 = ku.b((short)114)];
        final int[] array5 = new int[b2];
        int b3 = ku.b((short)83, 0);
        for (int i = 0; i < array.length; ++i) {
            final int a = ku.a((short)83, b3);
            array[i] = ku.b(b3);
            array2[i] = ku.a((short)139, b3, a, 0);
            array3[i] = ku.a((short)144, b3, a, 0);
            b3 = a;
        }
        int b4 = ku.b((short)114, 0);
        for (int j = 0; j < array4.length; ++j) {
            final int a2 = ku.a((short)114, b4);
            array4[j] = ku.a(b4, 0);
            array5[j] = ku.a((short)106, b4, a2, 0);
            b4 = a2;
        }
        if (this.b != null) {
            this.b.a(array, array2, array3, array4, array5);
        }
    }
    
    private void D(final ku ku) {
        final String d = ku.d((short)182);
        final String d2 = ku.d((short)183);
        final String d3 = ku.d((short)1);
        final String[] b = i.b(d2, ";");
        String[] array = null;
        String[] array2 = null;
        if (b != null && b.length > 0 && b.length % 2 == 0) {
            array = new String[b.length / 2];
            array2 = new String[b.length / 2];
            for (int i = 0; i < b.length; i += 2) {
                array2[i / 2] = b[i];
                array[i / 2] = b[i + 1];
            }
        }
        this.b.b(d3, d, array2, array);
    }
    
    public final void a() {
        this.f = true;
        if (this.e != null) {
            final kv e = this.e;
            try {
                e.a.close();
            }
            catch (final Throwable t) {}
            this.e = null;
        }
    }
}
