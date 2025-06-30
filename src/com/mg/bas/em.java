package com.mg.bas;

// Decompiled with: Procyon 0.6.0
// Class Version: 1
import java.io.InputStream;

final class em implements Runnable
{
    private dv a;
    private ed b;
    private boolean c;
    private byte[] d;
    
    public em(final InputStream inputStream) {
        super();
        this.c = false;
        this.b = new ed(inputStream);
        this.c = false;
        new Thread(this).start();
    }
    
    public final void run() {
        int n = 10;
        this.c = false;
        while (!this.c) {
            dy dy;
            try {
                if ((dy = ((this.b == null) ? null : this.b.a())) == null) {
                    if (--n <= 0) {
                        this.c = true;
                        if (du.a().c) {
                            du.a().d();
                        }
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
                if (--n <= 0) {
                    this.c = true;
                    if (du.a().c) {
                        du.a().d();
                    }
                }
                else {
                    try {
                        Thread.sleep(3000L);
                    }
                    catch (final Throwable t3) {}
                }
                dy = null;
            }
            final dy dy2 = dy;
            if (dy2 == null) {
                continue;
            }
            try {
                if (this.a == null) {
                    continue;
                }
                switch ((short)dy2.b) {
                    case 0: {
                        final dy dy3 = dy2;
                        final byte a;
                        if ((a = dy3.a(dy3.b((short)0, 0), (short)0)) == 9) {
                            continue;
                        }
                        final String b = dy3.b((short)8);
                        final byte a2 = dy3.a(dy3.b((short)255, 0), (short)0);
                        final String b2;
                        if (!i.a(b2 = dy3.b((short)30))) {
                            a(b2);
                        }
                        this.a.a(a, b, a2);
                        continue;
                    }
                    case 95: {
                        final byte[] a3;
                        if ((a3 = dy2.a((short)42)) != null) {
                            du.a().a(String.valueOf(new StringBuffer(String.valueOf(new StringBuffer(String.valueOf(new StringBuffer(String.valueOf(new StringBuffer(String.valueOf(new StringBuffer(String.valueOf(new StringBuffer(String.valueOf("")).append(String.valueOf(m.a(a3[0]))).toString())).append(".").toString())).append(String.valueOf(m.a(a3[1]))).toString())).append(".").toString())).append(String.valueOf(m.a(a3[2]))).toString())).append(".").toString()) + String.valueOf(m.a(a3[3])));
                            continue;
                        }
                        du.a().a((String)null);
                        continue;
                    }
                    case 96: {
                        du.a().m = dy2.a((short)11);
                        du.a().a = true;
                        if (du.a().b) {
                            du.a().e();
                            continue;
                        }
                        if (this.a == null) {
                            continue;
                        }
                        this.a.h_();
                        continue;
                    }
                    case 97: {
                        final dy dy4 = dy2;
                        dy4.b((short)4);
                        dy4.b((short)22);
                        dy4.a(dy4.b((short)12, 0), (short)0);
                        dy4.a(dy4.b((short)9, 0), 0L);
                        dy4.b((short)13);
                        du.a().f();
                        du.a().c = true;
                        if (du.a().b) {
                            du.a().b = false;
                            final dv a4 = this.a;
                            du.a().j();
                            if (du.a().i != 2 || i.a(du.a().h)) {
                                continue;
                            }
                            du.a().c(du.a().h);
                        }
                        else {
                            this.a.g_();
                        }
                        continue;
                    }
                    case 9: {
                        final dy dy5 = dy2;
                        this.a.a(a(dy5, null, true, dy5.a(dy5.b((short)53, 0), (byte)0)), dy5.a(dy5.b((short)39, 0), 0));
                        continue;
                    }
                    case 10: {
                        this.C(dy2);
                        continue;
                    }
                    case 11: {
                        final dy dy6 = dy2;
                        dy6.a(dy6.b((short)255, 0), (short)0);
                        final eo eo = new eo();
                        dy6.b((short)7);
                        dy6.b((short)22);
                        eo.a = dy6.b((short)13);
                        if (i.a(eo.a)) {
                            eo.a = null;
                        }
                        dy6.a((short)23);
                        dy6.a(dy6.b((short)45, 0), (short)0);
                        dy6.a(dy6.b((short)119, 0), 0);
                        eo.b = dy6.b((short)109);
                        if (eo.b != null) {
                            dy6.a(dy6.b((short)114, 0), (short)0);
                        }
                        else {
                            dy6.b((short)110);
                        }
                        dy6.b((short)111);
                        dy6.b((short)4);
                        dy6.a(dy6.b((short)58, 0), 0L);
                        dy6.a(dy6.b((short)124, 0), 0);
                        dy6.a(dy6.b((short)125, 0), 0);
                        dy6.b((short)112);
                        dy6.b((short)113);
                        dy6.a(dy6.b((short)126, 0), 0);
                        dy6.a(dy6.b((short)127, 0), 0);
                        dy6.a(dy6.b((short)128, 0), 0);
                        dy6.a(dy6.b((short)219, 0), (byte)0);
                        dy6.a(dy6.b((short)12, 0), (byte)0);
                        final dv a5 = this.a;
                        continue;
                    }
                    case 12: {
                        final dv a6 = this.a;
                        continue;
                    }
                    case 77: {
                        final dy dy7 = dy2;
                        final byte a7 = dy7.a(dy7.b((short)45, 0), (short)0);
                        final int n2;
                        int k = (n2 = (int)(dy7.a(dy7.b((short)9, 0), 0L) / 3600000L)) / 24;
                        if (n2 % 24 != 0) {
                            ++k;
                        }
                        du.a().j = a7;
                        du.a().k = k;
                        final dv a8 = this.a;
                        continue;
                    }
                    case 79: {
                        final dy dy8 = dy2;
                        final String b3 = dy8.b((short)7);
                        final String b4 = dy8.b((short)109);
                        final boolean b5 = dy8.a(dy8.b((short)114, 0), (byte)0) == 1;
                        if (b3 == null) {
                            continue;
                        }
                        if (b4 != null) {
                            if (b5) {
                                final dv a9 = this.a;
                            }
                            else {
                                final dv a10 = this.a;
                            }
                        }
                        else if (b5) {
                            final dv a11 = this.a;
                        }
                        else {
                            final dv a12 = this.a;
                        }
                        continue;
                    }
                    case 14: {
                        this.a(dy2);
                        continue;
                    }
                    case 21: {
                        this.b(dy2);
                        continue;
                    }
                    case 23: {
                        this.c(dy2);
                        continue;
                    }
                    case 25: {
                        final du a13;
                        (a13 = du.a()).g = null;
                        a13.l = j.a(a13.m, a13.g);
                        final dv a14 = this.a;
                        continue;
                    }
                    case 6: {
                        this.d(dy2);
                        continue;
                    }
                    case 115: {
                        final dy dy9 = dy2;
                        final byte[] a15;
                        if ((a15 = dy9.a((short)214)) == null) {
                            this.d = null;
                            final dv a16 = this.a;
                            continue;
                        }
                        final int a17 = m.a(a15[0], a15[1]);
                        if (du.a().t != a17) {
                            continue;
                        }
                        final byte[] a18;
                        if ((a18 = dy9.a((short)213)) != null) {
                            du.a().s = m.a(a18);
                            if (du.a().s <= 0) {
                                du.a().s = 1;
                            }
                            final int c = m.c(dy9.a((short)37));
                            this.d = new byte[c];
                            du.a().r = c;
                        }
                        final int s = du.a().s;
                        final byte[] a19;
                        System.arraycopy(a19 = dy9.a((short)23), 0, this.d, du.a().q, a19.length);
                        final du a20 = du.a();
                        a20.q += a19.length;
                        if (a17 >= s - 1) {
                            this.a.a(dy9.a(dy9.b((short)218, 0), 0), ep.a(this.d), this.d);
                            this.d = null;
                        }
                        else {
                            du.a().c(a17);
                        }
                        continue;
                    }
                    case 22: {
                        du.a().b();
                        this.a.f_();
                        continue;
                    }
                    case 42: {
                        du.a().h();
                        continue;
                    }
                    case 50: {
                        final dy dy10 = dy2;
                        dy10.a(dy10.b((short)255, 0), (short)0);
                        if (i.a(dy10.b((short)7))) {
                            dy10.b((short)109);
                            final dv a21 = this.a;
                            continue;
                        }
                        dy10.b((short)109);
                        dy10.b((short)110);
                        dy10.b((short)111);
                        dy10.a(dy10.b((short)66, 0), (short)4);
                        dy10.a(dy10.b((short)124, 0), 0);
                        dy10.a(dy10.b((short)125, 0), 0);
                        dy10.a(dy10.b((short)126, 0), 0);
                        dy10.a(dy10.b((short)130, 0), 0L);
                        final dv a22 = this.a;
                        continue;
                    }
                    case 67: {
                        this.e(dy2);
                        continue;
                    }
                    case 15: {
                        this.f(dy2);
                        continue;
                    }
                    case 17: {
                        dy2.b((short)21);
                        final dv a23 = this.a;
                        continue;
                    }
                    case 54: {
                        this.g(dy2);
                        continue;
                    }
                    case 103: {
                        this.h(dy2);
                        continue;
                    }
                    case 116: {
                        this.i(dy2);
                        continue;
                    }
                    case 124: {
                        this.j(dy2);
                        continue;
                    }
                    case 125: {
                        final dy dy11 = dy2;
                        final String b6 = dy11.b((short)7);
                        final byte a24 = dy11.a(dy11.b((short)45, 0), (byte)0);
                        final long a25 = dy11.a(dy11.b((short)9, 0), 0L);
                        final long a26 = dy11.a(dy11.b((short)59, 0), -1L);
                        if (b6.toLowerCase().equals(du.a().f.toLowerCase())) {
                            this.a.a(a24, a25, a26);
                            continue;
                        }
                        if (a26 >= 0L) {
                            final dv a27 = this.a;
                            continue;
                        }
                        this.a.a(b6, a24, a25);
                        continue;
                    }
                    case 109: {
                        this.k(dy2);
                        continue;
                    }
                    case 117: {
                        this.l(dy2);
                        continue;
                    }
                    case 114: {
                        this.m(dy2);
                        continue;
                    }
                    case 39: {
                        final dy dy12 = dy2;
                        final String b7 = dy12.b((short)7);
                        final String b8 = dy12.b((short)24);
                        dy12.a(dy12.b((short)45, 0), (short)0);
                        long d;
                        if ((d = dy12.a(dy12.b((short)9, 0), 0L)) == 0L) {
                            d = System.currentTimeMillis();
                        }
                        final ee ee;
                        (ee = new ee()).a = b7;
                        ee.a(b8);
                        ee.d = d;
                        final String b9;
                        if (du.a().i == 2 && (b9 = dy12.b((short)109)) != null) {
                            du.a().b(b7, b9);
                        }
                        this.a.a(b7, ee);
                        continue;
                    }
                    case 104: {
                        final dy dy13 = dy2;
                        dy13.b((short)7);
                        dy13.b((short)8);
                        final dv a28 = this.a;
                        continue;
                    }
                    case 105: {
                        final dy dy14 = dy2;
                        dy14.b((short)7);
                        dy14.a((short)66);
                        final dv a29 = this.a;
                        continue;
                    }
                    case 65: {
                        final dy dy15 = dy2;
                        dy15.b((short)7);
                        this.a.a(dy15.b((short)30));
                        continue;
                    }
                    case 66: {
                        final dy dy16 = dy2;
                        this.a.a(dy16.b((short)28), dy16.a(dy16.b((short)130, 0), 0L), dy16.a(dy16.b((short)124, 0), 0));
                        continue;
                    }
                    case 129: {
                        final dy dy17 = dy2;
                        dy17.a(dy17.b((short)20, 0), (byte)0);
                        final dv a30 = this.a;
                        continue;
                    }
                    case 133: {
                        this.n(dy2);
                        continue;
                    }
                    case 136: {
                        this.a.a(i.b(dy2.b((short)4), ";"));
                        continue;
                    }
                    case 137: {
                        this.o(dy2);
                        continue;
                    }
                    case 138: {
                        this.p(dy2);
                        continue;
                    }
                    case 140: {
                        this.a.a(a(dy2, null, true, (short)0));
                        continue;
                    }
                    case 193: {
                        this.q(dy2);
                        continue;
                    }
                    case 194: {
                        final dy dy18 = dy2;
                        dy18.a(dy18.b((short)255, 0), (short)0);
                        dy18.a(dy18.b((short)72, 0), 0L);
                        final String b10;
                        if ((b10 = dy18.b((short)29)) != null) {
                            i.b(b10, ";");
                        }
                        final dv a31 = this.a;
                        continue;
                    }
                    case 199: {
                        final dy dy19 = dy2;
                        dy19.a(dy19.b((short)255, 0), (short)0);
                        dy19.b((short)109);
                        dy19.b((short)110);
                        dy19.a((short)23);
                        final dv a32 = this.a;
                        continue;
                    }
                    case 147: {
                        this.r(dy2);
                        continue;
                    }
                    case 148: {
                        final dy dy20 = dy2;
                        dy20.a(dy20.b((short)114, 0), (short)0);
                        final dv a33 = this.a;
                        continue;
                    }
                    case 158: {
                        final dy dy21 = dy2;
                        dy21.a(dy21.b((short)255, 0), (short)0);
                        dy21.b((short)129);
                        dy21.b((short)22);
                        dy21.b((short)13);
                        dy21.b((short)24);
                        final dv a34 = this.a;
                        continue;
                    }
                    case 159: {
                        final dy dy22 = dy2;
                        dy22.b((short)129);
                        dy22.b((short)7);
                        final dv a35 = this.a;
                        continue;
                    }
                    case 160: {
                        final dy dy23 = dy2;
                        dy23.b((short)129);
                        dy23.b((short)22);
                        dy23.b((short)13);
                        dy23.b((short)24);
                        final dv a36 = this.a;
                        continue;
                    }
                    case 162: {
                        final dy dy24 = dy2;
                        dy24.b((short)129);
                        final String b11 = dy24.b((short)7);
                        final String b12 = dy24.b((short)8);
                        final byte a37 = dy24.a(dy24.b((short)220, 0), (short)0);
                        dy24.a(dy24.b((short)45, 0), (short)0);
                        final ef ef;
                        (ef = new ef()).a(b11);
                        ef.b(b12);
                        ef.a(a37);
                        final String b13;
                        if (du.a().i == 2 && (b13 = dy24.b((short)109)) != null) {
                            du.a().b(b11, b13);
                        }
                        final dv a38 = this.a;
                        continue;
                    }
                    case 163: {
                        final dy dy25 = dy2;
                        dy25.b((short)129);
                        final String b14 = dy25.b((short)7);
                        dy25.b((short)24);
                        final String b15;
                        if (du.a().i == 2 && (b15 = dy25.b((short)109)) != null) {
                            du.a().b(b14, b15);
                        }
                        final dv a39 = this.a;
                        continue;
                    }
                    case 164: {
                        this.s(dy2);
                        continue;
                    }
                    case 165: {
                        this.t(dy2);
                        continue;
                    }
                    case 166: {
                        final dy dy26 = dy2;
                        dy26.b((short)111);
                        dy26.b((short)7);
                        dy26.b((short)110);
                        dy26.a(dy26.b((short)45, 0), (short)0);
                        dy26.a(dy26.b((short)114, 0), (short)0);
                        dy26.a(dy26.b((short)130, 0), 0L);
                        dy26.a(dy26.b((short)59, 0), 0L);
                        final dv a40 = this.a;
                        continue;
                    }
                    case 167: {
                        final dy dy27 = dy2;
                        dy27.b((short)7);
                        if (dy27.a(dy27.b((short)114, 0), (short)0) == 1) {
                            final dv a41 = this.a;
                            continue;
                        }
                        final dv a42 = this.a;
                        continue;
                    }
                    case 168: {
                        final dy dy28 = dy2;
                        dy28.a(dy28.b((short)124, 0), 0);
                        final dv a43 = this.a;
                        continue;
                    }
                    case 169: {
                        this.u(dy2);
                        continue;
                    }
                    case 171: {
                        this.v(dy2);
                        continue;
                    }
                    case 175: {
                        final dy dy29 = dy2;
                        dy29.a(dy29.b((short)255, 0), (short)0);
                        dy29.b((short)110);
                        dy29.b((short)28);
                        dy29.b((short)8);
                        final dv a44 = this.a;
                        continue;
                    }
                    case 35: {
                        this.w(dy2);
                        continue;
                    }
                    case 113: {
                        du.a();
                        continue;
                    }
                    case 100: {
                        this.x(dy2);
                        continue;
                    }
                    case 101: {
                        this.y(dy2);
                        continue;
                    }
                    case 102: {
                        this.z(dy2);
                        continue;
                    }
                    case 20: {
                        final dy dy30 = dy2;
                        dy30.b((short)21);
                        dy30.b((short)26);
                        final dv a45 = this.a;
                        continue;
                    }
                    case 18: {
                        dy2.b((short)21);
                        final dv a46 = this.a;
                        continue;
                    }
                    case 19: {
                        final dy dy31 = dy2;
                        dy31.b((short)7);
                        dy31.b((short)21);
                        final dv a47 = this.a;
                        continue;
                    }
                    case 92: {
                        this.A(dy2);
                        continue;
                    }
                    case 82: {
                        this.B(dy2);
                        continue;
                    }
                    case 128: {
                        this.D(dy2);
                        continue;
                    }
                    default: {
                        continue;
                    }
                }
            }
            catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    private void a(final dy dy) {
        final byte[] a = dy.a((short)53);
        short n = 0;
        if (a != null) {
            n = a[0];
        }
        final String b = dy.b((short)7);
        String b2 = dy.b((short)8);
        final byte a2 = dy.a(dy.b((short)220, 0), (short)0);
        dy.a(dy.b((short)45, 0), (short)0);
        if (b2 == null) {
            b2 = "";
        }
        final ef ef = new ef();
        boolean b3 = false;
        Label_0233: {
            if (b.toLowerCase().equals("ola".toLowerCase())) {
                b3 = true;
                final String[] a3;
                if ((a3 = i.a(b2, " ", 3, false)) == null || a3.length != 3 || !a3[0].toLowerCase().equals("LOCK".toLowerCase())) {
                    break Label_0233;
                }
                try {
                    Long.parseLong(a3[1]);
                    if (this.a != null) {
                        final dv a4 = this.a;
                    }
                    return;
                }
                catch (final Exception ex) {
                    break Label_0233;
                }
            }
            if (b.length() <= 3) {
                b3 = true;
                final String[] a5;
                final eb[] a6;
                if ((a5 = i.a(b2, "|", 2, false)) != null && a5.length == 2 && (a6 = a(a5[1])) != null && a6.length > 0) {
                    b2 = a5[0];
                    ef.a(a6);
                }
            }
        }
        final String s = b2;
        final String f = du.a().f;
        final String s2 = s;
        final String s3 = null;
        final boolean b4 = true;
        final String s4 = s3;
        final String s5 = s2;
        final String s6 = f;
        eb[] array2;
        eb[] array;
        if (i.b(s5)) {
            array = (array2 = null);
        }
        else {
            final String[] b5 = i.b(s5, " ");
            eb[] array3 = null;
            int n2 = 0;
            if (s4 != null) {
                array3 = new eb[30];
                final ee ee;
                (ee = new ee()).a(s4);
                switch (ee.f) {
                    case 1: {
                        (array3[0] = new eb("openphoto")).e("Xem ảnh");
                        ++n2;
                        break;
                    }
                    case 3: {
                        (array3[0] = new eb("openaudio")).e("Mở âm thanh");
                        ++n2;
                        break;
                    }
                    case 2: {
                        (array3[0] = new eb("openvideo")).e("Mở Video");
                        ++n2;
                        break;
                    }
                    default: {
                        (array3[0] = new eb("wap")).e("Xem WAP");
                        array3[0].a(ee.b);
                        ++n2;
                        break;
                    }
                }
            }
            if (!s6.equals(du.a().f.toLowerCase())) {
                if (array3 == null) {
                    array3 = new eb[30];
                }
                array3[n2] = new eb("chatto");
                String string;
                if ((string = s6).length() >= 14) {
                    string = String.valueOf(string.substring(0, 11)) + "...";
                }
                array3[n2].e("Chat \"" + string + "\"");
                array3[n2].a(s6);
                ++n2;
                (array3[n2] = new eb("replyto")).e("Trả lời \"" + string + "\"");
                array3[n2].a(s6);
                ++n2;
                (array3[n2] = new eb("viewme")).e("Xem \"" + string + "\"");
                array3[n2].a(s6);
                ++n2;
            }
            int n3 = 1;
            int n4 = 1;
            for (int n5 = 0; n5 < b5.length && n2 < 30; ++n5) {
                if (b5[n5].startsWith("@") && b5[n5].length() > 1 && !b5[n5].toLowerCase().equals("@" + s6)) {
                    String s7 = b5[n5].substring(1).trim();
                    for (int i = 0; i < s7.length(); ++i) {
                        if ((s7.charAt(i) < 'a' || s7.charAt(i) > 'z') && (s7.charAt(i) < 'A' || s7.charAt(i) > 'Z') && (s7.charAt(i) < '0' || s7.charAt(i) > '9') && s7.charAt(i) != '.' && s7.charAt(i) != '_') {
                            s7 = s7.substring(0, i);
                            break;
                        }
                    }
                    if (s7.length() > 0 && !s7.toLowerCase().equals(s6.toLowerCase())) {
                        if (array3 == null) {
                            array3 = new eb[30];
                        }
                        String s8;
                        if (!(s8 = s7.toLowerCase()).equals(du.a().f.toLowerCase())) {
                            int n6;
                            for (n6 = 0; n6 < n2 && (array3[n6] == null || !array3[n6].a().equals("viewme") || !array3[n6].b().toLowerCase().equals(s8)); ++n6) {}
                            if (n6 >= n2) {
                                int n8;
                                int n7;
                                for (n7 = (n8 = s8.length() - 1); n8 > 0 && s8.charAt(n8) == '.'; --n8) {}
                                if (n8 < n7) {
                                    s8 = s8.substring(0, n8 + 1);
                                }
                                String string2;
                                if ((string2 = s8).length() >= 14) {
                                    string2 = String.valueOf(string2.substring(0, 11)) + "...";
                                }
                                if (b4) {
                                    (array3[n2] = new eb("chatto")).e("Chat \"" + string2 + "\"");
                                    array3[n2].a(s8);
                                    ++n2;
                                }
                                (array3[n2] = new eb("viewme")).e("Xem \"" + string2 + "\"");
                                array3[n2].a(s8);
                                ++n2;
                            }
                        }
                    }
                }
                else if (b5[n5].startsWith("#") && b5[n5].length() > 1 && !b5[n5].toLowerCase().equals("#" + s6)) {
                    final String substring;
                    if (((substring = b5[n5].substring(1)).charAt(0) >= 'a' && substring.charAt(0) <= 'z') || (substring.charAt(0) >= 'A' && substring.charAt(0) <= 'Z') || (substring.charAt(0) >= '0' && substring.charAt(0) <= '9')) {
                        String s9 = substring.trim();
                        for (int j = 0; j < s9.length(); ++j) {
                            if ((s9.charAt(j) < 'a' || s9.charAt(j) > 'z') && (s9.charAt(j) < 'A' || s9.charAt(j) > 'Z') && (s9.charAt(j) < '0' || s9.charAt(j) > '9') && s9.charAt(j) != '.' && s9.charAt(j) != '_') {
                                s9 = s9.substring(0, j);
                                break;
                            }
                        }
                        if (s9 != null && s9.length() > 0) {
                            if (array3 == null) {
                                array3 = new eb[30];
                            }
                            String s10;
                            int n9;
                            for (s10 = s9.toLowerCase(), n9 = 0; n9 < n2 && (array3[n9] == null || !array3[n9].a().equals("viewme") || !array3[n9].b().toLowerCase().equals("#" + s10)); ++n9) {}
                            if (n9 >= n2) {
                                array3[n2] = new eb("viewme");
                                int n11;
                                int n10;
                                for (n10 = (n11 = s10.length() - 1); n11 > 0 && s10.charAt(n11) == '.'; --n11) {}
                                if (n11 < n10) {
                                    s10 = s10.substring(0, n11 + 1);
                                }
                                String string3;
                                if ((string3 = s10).length() >= 14) {
                                    string3 = String.valueOf(string3.substring(0, 11)) + "...";
                                }
                                array3[n2].e("Xem nhóm \"" + string3 + "\"");
                                array3[n2].a("#" + s10);
                                ++n2;
                            }
                        }
                    }
                }
                else {
                    final int index;
                    String s12;
                    if ((index = b5[n5].toLowerCase().indexOf("http://")) >= 0) {
                        if (array3 == null) {
                            array3 = new eb[30];
                        }
                        String s11 = "Xem WAP " + n3;
                        final int index2 = b5[n5].indexOf(10);
                        if (index > index2 && n5 + 1 < b5.length && b5[n5 + 1].startsWith("<")) {
                            for (int k = n5 + 2; k < b5.length; ++k) {
                                if (b5[k].endsWith(">")) {
                                    s11 = b5[n5 + 1].substring(1);
                                    for (int l = n5 + 2; l <= k; ++l) {
                                        String substring2 = b5[l];
                                        if (l == k) {
                                            substring2 = substring2.substring(0, substring2.length() - 1);
                                        }
                                        if ((s11 = String.valueOf(s11) + " " + substring2).length() >= 16) {
                                            s11 = String.valueOf(s11.substring(0, 13)) + "...";
                                        }
                                        --n3;
                                    }
                                }
                            }
                        }
                        array3[n2] = new eb("wap");
                        if (index > index2) {
                            s12 = b5[n5].substring(b5[n5].toLowerCase().indexOf("http://"));
                        }
                        else {
                            s12 = b5[n5].substring(b5[n5].toLowerCase().indexOf("http://"), index2);
                        }
                        ++n3;
                        array3[n2].e(s11);
                    }
                    else {
                        final int index3;
                        if ((index3 = b5[n5].toLowerCase().indexOf("rss://")) < 0) {
                            continue;
                        }
                        if (array3 == null) {
                            array3 = new eb[30];
                        }
                        String s13 = "Xem tin " + n4;
                        final int index4 = b5[n5].indexOf(10);
                        if (index3 > index4 && n5 + 1 < b5.length && b5[n5 + 1].startsWith("<")) {
                            for (int n12 = n5 + 2; n12 < b5.length; ++n12) {
                                if (b5[n12].endsWith(">")) {
                                    s13 = b5[n5 + 1].substring(1);
                                    for (int n13 = n5 + 2; n13 <= n12; ++n13) {
                                        String substring3 = b5[n13];
                                        if (n13 == n12) {
                                            substring3 = substring3.substring(0, substring3.length() - 1);
                                        }
                                        if ((s13 = String.valueOf(s13) + " " + substring3).length() >= 16) {
                                            s13 = String.valueOf(s13.substring(0, 13)) + "...";
                                        }
                                        --n4;
                                    }
                                }
                            }
                        }
                        array3[n2] = new eb("rss");
                        if (index3 > index4) {
                            s12 = b5[n5].substring(b5[n5].toLowerCase().indexOf("rss://") + 6);
                        }
                        else {
                            s12 = b5[n5].substring(b5[n5].toLowerCase().indexOf("rss://") + 6, index4);
                        }
                        ++n4;
                        array3[n2].e(s13);
                        if (s12.toLowerCase().equals("null")) {
                            s12 = null;
                        }
                    }
                    array3[n2].a(s12);
                    ++n2;
                }
            }
            if (array3 == null) {
                array3 = new eb[30];
            }
            if (0L != 0L) {
                (array3[n2] = new eb("delme")).e("Xóa");
                ++n2;
            }
            if (n2 > 0) {
                final eb[] array4 = new eb[n2];
                System.arraycopy(array3, 0, array4, 0, array4.length);
                array = (array2 = array4);
            }
            else {
                array = (array2 = null);
            }
        }
        eb[] array5 = array2;
        if (array != null) {
            final eb[] a7;
            if ((a7 = ef.a()) != null) {
                final eb[] array6 = new eb[array5.length + a7.length];
                System.arraycopy(a7, 0, array6, 0, a7.length);
                System.arraycopy(array5, 0, array6, a7.length, array5.length);
                array5 = array6;
            }
            ef.a(array5);
        }
        if (b3) {
            ef.a();
        }
        ef.a(b);
        if (b2.toLowerCase().equals("ola")) {
            b2 = "Ola!!!";
        }
        ef.b(b2);
        ef.a(System.currentTimeMillis());
        ef.a(a2);
        final String b6;
        if (du.a().i == 2 && (b6 = dy.b((short)109)) != null) {
            du.a().b(b, b6);
        }
        if (this.a != null) {
            this.a.a(ef, n);
        }
    }
    
    private void b(final dy dy) {
        final int c;
        if ((c = dy.c((short)7)) == 0) {
            return;
        }
        final ds[] array = new ds[c];
        int n = dy.b((short)7, 0);
        boolean b = false;
        int n2 = 0;
        while (!b) {
            final int n3 = n;
            if ((n = dy.a((short)7, n3)) <= 0) {
                b = true;
            }
            short a = 0;
            short a2 = 0;
            short a3 = 0;
            final String b2 = dy.b(n3);
            String b3 = null;
            String b4 = null;
            final int a4;
            if ((a4 = dy.a((short)12, n3, n)) >= 0) {
                a3 = dy.a(a4, (short)0);
                a = dy.a((short)45, n3, n, (short)0);
                a2 = dy.a((short)38, n3, n, (short)0);
                if (i.a(b3 = dy.b((short)13, n3, n))) {
                    b3 = null;
                }
                b4 = dy.b((short)86, n3, n);
            }
            dy.a((short)58, n3, n, 0L);
            (array[n2] = new ds()).a(b2);
            array[n2].a(a);
            array[n2].b(a2);
            array[n2].d(b4);
            array[n2].c(a3);
            array[n2].c(b3);
            ++n2;
        }
        this.a.a(array);
    }
    
    private void c(final dy dy) {
        dy.a(dy.b((short)200, 0), 0L);
        final int c;
        if ((c = dy.c((short)24)) > 0) {
            final ee[] array = new ee[c];
            int b = dy.b((short)24, 0);
            int b2 = dy.b((short)7, 0);
            for (int i = 0; i < c; ++i) {
                final int a = dy.a((short)24, b);
                final int a2 = dy.a((short)7, b2);
                final String b3 = dy.b(b);
                final String b4 = dy.b((short)22, b, a);
                final String b5 = dy.b(b2);
                final int a3 = dy.a((short)206, b, a, 0);
                final long a4 = dy.a((short)9, b2, a2, 0L);
                b = a;
                b2 = a2;
                (array[i] = new ee()).a(b3);
                array[i].a = b5;
                array[i].c = b4;
                array[i].e = a3;
                array[i].d = a4;
            }
        }
        final dv a5 = this.a;
    }
    
    private void d(final dy dy) {
        final byte[] a = dy.a((short)53);
        short n = 0;
        if (a != null) {
            n = a[0];
        }
        final int c = dy.c((short)7);
        ef[] array = null;
        if (c > 0) {
            array = new ef[c];
            int n2 = dy.b((short)7, 0);
            boolean b = false;
            int n3 = 0;
            while (!b) {
                boolean b2 = false;
                array[n3] = new ef();
                final int n4 = n2;
                if ((n2 = dy.a((short)7, n4)) < 0) {
                    b = true;
                }
                final String b3 = dy.b(n4);
                String b4 = dy.b((short)8, n4, n2);
                final long a2 = dy.a((short)9, n4, n2, 0L);
                final byte a3 = dy.a((short)220, n4, n2, (short)0);
                dy.a(dy.b((short)45, 0), (short)0);
                Label_0295: {
                    if (b3.toLowerCase().equals("ola".toLowerCase())) {
                        b2 = true;
                        final String[] a4;
                        if ((a4 = i.a(b4, " ", 3, false)) == null || a4.length != 3 || !a4[0].toLowerCase().equals("LOCK".toLowerCase())) {
                            break Label_0295;
                        }
                        try {
                            Long.parseLong(a4[1]);
                            final dv a5 = this.a;
                            return;
                        }
                        catch (final Exception ex) {
                            break Label_0295;
                        }
                    }
                    if (b3.length() <= 3) {
                        b2 = true;
                        final String[] a6;
                        final eb[] a7;
                        if ((a6 = i.a(b4, "|", 2, false)) != null && a6.length == 2 && (a7 = a(a6[1])) != null && a7.length > 0) {
                            b4 = a6[0];
                            array[n3].a(a7);
                        }
                    }
                }
                if (b2) {
                    array[n3].a();
                }
                array[n3].a(b3);
                array[n3].a(a2);
                array[n3].b(b4);
                array[n3].a(a3);
                ++n3;
            }
        }
        this.a.a(array, n);
    }
    
    private void e(final dy dy) {
        final int c;
        if ((c = dy.c((short)200)) > 0) {
            final dr[] array = new dr[c];
            int b = dy.b((short)200, 0);
            int n = dy.b((short)207, 0);
            for (int i = 0; i < c; ++i) {
                dy.a(b, 0L);
                final int a = dy.a((short)200, b);
                dy.b(n);
                dy.a((short)69, b, a, (short)0);
                dy.a((short)62, b, a, (short)0);
                dy.a((short)9, b, a, 0L);
                dy.a((short)205, b, a, 0);
                dy.a((short)206, b, a, 0);
                array[i] = new dr();
                n = dy.a((short)207, n);
                b = a;
            }
        }
        final dv a2 = this.a;
    }
    
    private void f(final dy dy) {
        final String b = dy.b((short)21);
        final int c = dy.c((short)7);
        ds[] array = null;
        if (c > 0) {
            array = new ds[c];
            int n = dy.b((short)7, 0);
            boolean b2 = false;
            int n2 = 0;
            while (!b2) {
                final int n3 = n;
                if ((n = dy.a((short)7, n3)) <= 0) {
                    b2 = true;
                }
                short a = 0;
                short a2 = 0;
                short a3 = 0;
                final String b3 = dy.b(n3);
                String b4 = null;
                String b5 = null;
                final int a4;
                if ((a4 = dy.a((short)12, n3, n)) >= 0) {
                    a3 = dy.a(a4, (short)0);
                    a = dy.a((short)45, n3, n, (short)0);
                    a2 = dy.a((short)38, n3, n, (short)0);
                    if (i.a(b4 = dy.b((short)13, n3, n))) {
                        b4 = null;
                    }
                    b5 = dy.b((short)86, n3, n);
                }
                (array[n2] = new ds()).a(b3);
                array[n2].b(dy.b((short)22, n3, n));
                array[n2].a(a);
                array[n2].b(a2);
                array[n2].d(b5);
                array[n2].c(a3);
                array[n2].c(b4);
                ++n2;
            }
        }
        this.a.a(array, b);
    }
    
    private void g(final dy dy) {
        final int c;
        if ((c = dy.c((short)7)) > 0) {
            final ds[] array = new ds[c];
            int n = dy.b((short)7, 0);
            int n2 = dy.b((short)22, 0);
            for (int i = 0; i < c; ++i) {
                final String b = dy.b(n);
                final String b2 = dy.b(n2);
                (array[i] = new ds()).a(b);
                array[i].b(b2);
                n = dy.a((short)7, n);
                n2 = dy.a((short)22, n2);
            }
            final dv a = this.a;
        }
    }
    
    private void h(final dy dy) {
        if (du.a().z != dy.a(dy.b((short)255, 0), (short)0)) {
            return;
        }
        String s = dy.b((short)7);
        short n = 0;
        if (s != null) {
            s = s.toLowerCase();
            if (dy.c((short)67) <= 0) {
                try {
                    byte[] array;
                    if ((array = s.getBytes("UTF-8")) == null || array.length == 0) {
                        array = s.getBytes();
                    }
                    final byte[] array2 = array;
                    if (dy.c == null) {
                        (dy.c = new dx[1])[0] = new dx();
                        dy.c[0].a = 67;
                        dy.c[0].b = array2;
                    }
                    else {
                        final dx[] c;
                        (c = new dx[dy.c.length + 1])[0] = new dx();
                        c[0].a = 67;
                        c[0].b = array2;
                        System.arraycopy(dy.c, 0, c, 1, dy.c.length);
                        dy.c = c;
                    }
                }
                catch (final Throwable t) {}
            }
        }
        final byte[] a;
        if ((a = dy.a((short)66)) != null) {
            n = a[0];
        }
        if (n == 3) {
            this.a.a(s, n, null);
            return;
        }
        final int c2 = dy.c((short)8);
        ef[] array3 = null;
        if (c2 > 0) {
            final ef[] array4 = new ef[c2];
            int n2 = 0;
            int n3 = dy.a((short)67, -1);
            boolean b = false;
            while (!b) {
                final int n4 = n3;
                if ((n3 = dy.a((short)67, n4)) < 0) {
                    b = true;
                }
                final String lowerCase = dy.b(n4).toLowerCase();
                dy.b((short)109, n4, n3);
                int n5 = dy.a((short)72, n4);
                boolean b2 = false;
                while (!b2) {
                    final int n6 = n5;
                    if ((n5 = dy.a((short)72, n6, n3)) < 0) {
                        n5 = n3;
                        b2 = true;
                    }
                    final long a2 = dy.a(n6, 0L);
                    final byte a3 = dy.a((short)221, n6, n5, (byte)0);
                    final byte a4 = dy.a((short)220, n6, n5, (byte)0);
                    final int a5 = dy.a((short)125, n6, n5, 0);
                    final int a6 = dy.a((short)124, n6, n5, 0);
                    final byte a7 = dy.a((short)90, n6, n5, (byte)0);
                    final long a8 = dy.a((short)9, n6, n5, 0L);
                    final String b3 = dy.b((short)8, n6, n5);
                    final String b4 = dy.b((short)24, n6, n5);
                    final byte a9 = dy.a((short)12, n6, n5, (short)0);
                    dy.a((short)114, n6, n5, (byte)0);
                    final String b5;
                    if (!i.b(b5 = dy.b((short)110, n6, n5))) {
                        final String[] b6 = i.b(b5, ";");
                        for (int j = 0; j < b6.length; ++j) {
                            final String[] b7;
                            if (i.a((b7 = i.b(b6[j], ":"))[0], "border")) {
                                Short.parseShort(b7[1]);
                            }
                            else if (i.a(b7[0], "color")) {
                                Short.parseShort(b7[1]);
                            }
                        }
                    }
                    final String b8 = dy.b((short)29, n6, n5);
                    (array4[n2] = new ef()).b(a2);
                    array4[n2].a(lowerCase);
                    array4[n2].a(a5);
                    array4[n2].b(a6);
                    array4[n2].c(a7);
                    array4[n2].d(b8);
                    array4[n2].b(a3);
                    array4[n2].a(a4);
                    array4[n2].a(a8);
                    array4[n2].b(b3);
                    array4[n2].c(b4);
                    array4[n2].d(a9);
                    ++n2;
                }
            }
            array3 = (ef[])g.a(array4, new ek(true));
        }
        this.a.a(s, n, array3);
    }
    
    private void j(final dy dy) {
        dy.a(dy.b((short)255, 0), (short)0);
        final String b;
            if ((b = dy.b((short)8)) != null) {
                int[] array = null;
                long[] array2 = null;
                final String[] b2;
                if ((b2 = i.b(b, ";")) != null) {
                    array = new int[b2.length];
                    array2 = new long[b2.length];
                    for (int j = 0; j < b2.length; ++j) {
                        final String[] b3 = i.b(b2[j], ":");
                        array[j] = Integer.parseInt(b3[0]);
                        array2[j] = Long.parseLong(b3[1]);
                    }
                }
            final String b4 = dy.b((short)109);
            final String b5;
            if ((b5 = dy.b((short)110)) != null) {
                i.b(b5, ";");
            }
            final String[] b6;
            final short[] array3 = new short[(b6 = i.b(b4, ";")).length];
            for (int j = 0; j < array3.length; ++j) {
                array3[j] = (short)Integer.parseInt(b6[j]);
            }
            this.a.a(array, array2, array3);
        }
    }
    
    private void k(final dy dy) {
        dy.b((short)7);
        final byte[] a;
        switch ((a = dy.a((short)209))[0]) {
            case 3: {
                final byte[] array = new byte[a.length - 3];
                System.arraycopy(a, 3, array, 0, array.length);
                dy.a(dy.b((short)45, 0), (short)0);
                final dv a2 = this.a;
                return;
            }
            case 5: {
                final byte[] array2 = new byte[a.length - 1];
                System.arraycopy(a, 1, array2, 0, array2.length);
                final String a3;
                if (i.a(a3 = i.a(array2))) {
                    break;
                }
                final String[] b = i.b(a3, ";");
                String substring = null;
                String substring2 = null;
                if (b != null && b.length > 0) {
                    for (int i = 0; i < b.length; ++i) {
                        if (b[i].startsWith("id=")) {
                            substring = b[i].substring(3);
                        }
                        if (b[i].startsWith("chatgroupId=")) {
                            substring2 = b[i].substring(12);
                        }
                    }
                }
                if (i.a(substring2) && i.a(substring)) {
                    return;
                }
                if (i.a(substring2)) {
                    final dv a4 = this.a;
                    return;
                }
                final dv a5 = this.a;
                break;
            }
        }
    }
    
    private void l(final dy dy) {
        if (du.a().A != dy.a(dy.b((short)255, 0), (short)0)) {
            return;
        }
        final String b = dy.b((short)8);
        final String b2 = dy.b((short)207);
        dy.b((short)109);
        dy.b((short)29);
        dy.a(dy.b((short)90, 0), (short)0);
        dy.a(dy.b((short)72, 0), 0L);
        dy.a(dy.b((short)124, 0), 0);
        dy.a(dy.b((short)125, 0), 0);
        final String[] b3;
        if (b != null && (b3 = i.b(b, "\n")) != null && b3.length > 0) {
            final ef[] array = new ef[b3.length];
            for (int i = 0; i < array.length; ++i) {
                (array[i] = new ef()).b(b3[i]);
            }
            this.a.a(b2, array);
        }
    }
    
    private void m(final dy dy) {
        dy.a(dy.b((short)255, 0), (short)0);
        try {
            if (du.a().d) {
                final byte[] a = dy.a((short)214);
                final int a2 = m.a(a[0], a[1]);
                int c = 0;
                if (du.a().v == a2) {
                    final byte[] a3;
                    if ((a3 = dy.a((short)213)) != null) {
                        du.a().x = m.a(a3);
                        if (du.a().x <= 0) {
                            du.a().x = 1;
                        }
                        c = m.c(dy.a((short)37));
                        du.a().n = new byte[c];
                        du.a().w = c;
                    }
                    final int x = du.a().x;
                    final byte[] a4;
                    System.arraycopy(a4 = dy.a((short)23), 0, du.a().n, du.a().u, a4.length);
                    final du a5 = du.a();
                    a5.u += a4.length;
                    if (a2 >= x - 1) {
                        du.a().d = false;
                        final dv a6 = this.a;
                        final int x2 = du.a().x;
                        final int x3 = du.a().x;
                        a6.a(du.a().u, du.a().w);
                        final ee ee = new ee();
                        final String b = dy.b((short)7);
                        String s;
                        if ((s = dy.b((short)24)) == null) {
                            s = du.a().y;
                        }
                        ee.a = b;
                        ee.a(s);
                        ee.h = du.a().n;
                        this.a.a(ee);
                        du.a().n = null;
                        return;
                    }
                    if (a2 == 0 && c >= 204800) {
                        this.a.d_();
                        return;
                    }
                    du.a().d(a2);
                }
            }
        }
        catch (final OutOfMemoryError outOfMemoryError) {
            du.a().l();
            this.a.e_();
        }
    }
    
    private void n(final dy dy) {
        dy.a(dy.b((short)20, 0), (byte)0);
        final int c;
        if ((c = dy.c((short)7)) > 0) {
            final String[] array = new String[c];
            int n = dy.b((short)7, 0);
            for (int i = 0; i < array.length; ++i) {
                array[i] = dy.b(n);
                n = dy.a((short)7, n);
            }
        }
        final dv a = this.a;
    }
    
    private void o(final dy dy) {
        try {
            final String b = dy.b((short)28);
            final String b2;
            if ((b2 = dy.b((short)30)) != null) {
                this.a.a(b, a(b2));
            }
        }
        catch (final Throwable t) {}
    }
    
    private void p(final dy dy) {
        try {
            final String b;
            if ((b = dy.b((short)83)) != null) {
                final String[] b2;
                final String[] array2;
                final String[] array = new String[(array2 = new String[(b2 = i.b(b, "|")).length / 2]).length];
                for (int i = 0; i < array2.length; ++i) {
                    array2[i] = b2[i << 1];
                    array[i] = b2[(i << 1) + 1];
                }
                this.a.a(array2, array);
            }
        }
        catch (final Throwable t) {}
    }
    
    private void q(final dy dy) {
        dy.a(dy.b((short)255, 0), (short)0);
        final int c;
        if ((c = dy.c((short)7)) > 0) {
            final ds[] array = new ds[c];
            final int b = dy.b((short)7, 0);
            final int b2 = dy.b((short)4, 0);
            for (int i = 0; i < array.length; ++i) {
                array[i] = new ds(dy.b(b));
                dy.b(b2);
            }
        }
        final dv a = this.a;
    }
    
    private void r(final dy dy) {
        dy.b((short)7);
        dy.a(dy.b((short)114, 0), (short)0);
        dy.b((short)111);
        dy.a(dy.b((short)130, 0), 0L);
        dy.a(dy.b((short)9, 0), 0L);
        final String b = dy.b((short)109);
        final String b2 = dy.b((short)110);
        final String b3 = dy.b((short)112);
        final String[] b4 = i.b(b, ";");
        final String[] b5 = i.b(b2, ";");
        String[] b6 = null;
        if (b3 != null) {
            b6 = i.b(b3, ";");
        }
        if (b4 != null && b4.length > 0) {
            final short[] array = new short[b4.length];
            final String[] array2 = new String[b4.length];
            final boolean[] array3 = new boolean[b4.length];
            for (int i = 0; i < b4.length; ++i) {
                array[i] = Short.parseShort(b4[i]);
                array2[i] = b5[i];
                if (b6 != null && b6[i] != null) {
                    array3[i] = b6[i].equals("1");
                }
                else {
                    array3[i] = false;
                }
            }
        }
        final dv a = this.a;
    }
    
    private void s(final dy dy) {
        final int c = dy.c((short)129);
        dy.b((short)21);
        dy.a(dy.b((short)39, 0), 0);
        if (c > 0) {
            final dw[] array = new dw[c];
            int b = dy.b((short)129, 0);
            for (int i = 0; i < c; ++i) {
                final int a = dy.a((short)129, b);
                dy.b(b);
                dy.b((short)22, b, a);
                dy.b((short)13, b, a);
                dy.b((short)24, b, a);
                array[i] = new dw();
                b = a;
            }
        }
        final dv a2 = this.a;
    }
    
    private void t(final dy dy) {
        dy.b((short)129);
        final int c;
        if ((c = dy.c((short)7)) > 0) {
            final ds[] array = new ds[c];
            int b = dy.b((short)7, 0);
            for (int i = 0; i < c; ++i) {
                final int a = dy.a((short)7, b);
                final String b2 = dy.b(b);
                final String b3 = dy.b((short)22, b, a);
                final byte a2 = dy.a((short)45, b, a, (short)0);
                (array[i] = new ds()).a(b2);
                array[i].b(b3);
                array[i].a(a2);
                b = a;
            }
        }
        final dv a3 = this.a;
    }
    
    private void u(final dy dy) {
        dy.a(dy.b((short)255, 0), (short)0);
        final int c;
        if ((c = dy.c((short)109)) > 0) {
            final ej[] array = new ej[c];
            int b = dy.b((short)109, 0);
            for (int j = 0; j < c; ++j) {
                final int a = dy.a((short)109, b);
                array[j] = new ej();
                dy.b(b);
                dy.b((short)112, b, a);
                dy.a((short)9, b, a, 0L);
                dy.a(dy.a((short)23, b, a));
                dy.b((short)110, b, a);
                final String b2;
                if ((b2 = dy.b((short)113, b, a)) != null) {
                    i.b(b2, ".");
                }
                final String b3;
                if (!i.a(b3 = dy.b((short)111, b, a))) {
                    a(b3);
                }
                b = a;
            }
            dy.a(dy.b((short)124, 0), 0);
            final dv a2 = this.a;
        }
    }
    
    private void v(final dy dy) {
        dy.a(dy.b((short)255, 0), (short)0);
        dy.b((short)7);
        final int c;
        if ((c = dy.c((short)110)) > 0) {
            final ei[] array = new ei[c];
            int b = dy.b((short)110, 0);
            for (int i = 0; i < c; ++i) {
                final int a = dy.a((short)110, b);
                array[i] = new ei();
                dy.b(b);
                dy.a(dy.a((short)115, b, a), (byte)0);
                dy.a(dy.a((short)115, b, a), (byte)0);
                dy.b((short)28, b, a);
                dy.b((short)30, b, a);
                dy.b((short)109, b, a);
                dy.a((short)9, b, a, 0L);
                b = a;
            }
            final dv a2 = this.a;
            return;
        }
        final dv a3 = this.a;
    }
    
    private void w(final dy dy) {
        int n = 0;
        final byte[] a = dy.a((short)31);
        short n2 = 3;
        if (a != null) {
            n2 = a[0];
        }
        final int c;
        if ((c = dy.c((short)29)) <= 0) {
            return;
        }
        final dq[] array = new dq[c];
        int n3 = dy.b((short)29, 0);
        boolean b = false;
        int n4 = 0;
        while (!b) {
            final int n5 = n3;
            if ((n3 = dy.a((short)29, n5)) < 0) {
                b = true;
            }
            final String b2 = dy.b(n5);
            final String b3 = dy.b((short)28, n5, n3);
            final byte a2 = dy.a((short)70, n5, n3, (short)1);
            n += a2;
            eb[] a3 = new eb[0];
            final String b4;
            if ((b4 = dy.b((short)30, n5, n3)) != null) {
                a3 = a(b4);
            }
            array[n4] = new dq(b3, b2, n2, a2, a3);
            ++n4;
        }
        this.a.a(n, array);
    }
    
    private void x(final dy dy) {
        final int c = dy.c((short)207);
        ea[] array = null;
        if (c > 0) {
            array = new ea[c];
            for (int i = dy.b((short)207, 0), n = dy.b((short)200, 0), n2 = dy.b((short)205, 0), n3 = 0; i >= 0; i = dy.a((short)207, i), n = dy.a((short)200, n), n2 = dy.a((short)205, n2), ++n3) {
                final String b = dy.b(i);
                final long d = m.d(dy.a(n));
                final int c2 = m.c(dy.a(n2));
                (array[n3] = new ea()).b(b);
                array[n3].b(d);
                array[n3].a(c2);
            }
        }
        this.a.a(array);
    }
    
    private void y(final dy dy) {
        final int c = dy.c((short)28);
        final long d = m.d(dy.a((short)200));
        ea[] array = null;
        if (c > 0) {
            array = new ea[c];
            for (int i = dy.b((short)28, 0), n = dy.b((short)65, 0), n2 = 0; i >= 0; i = dy.a((short)28, i), n = dy.a((short)65, n), ++n2) {
                array[n2] = new ea();
                final String b = dy.b(i);
                final long d2 = m.d(dy.a(n));
                array[n2].a(b);
                array[n2].a(d2);
            }
        }
        this.a.a(d, array);
    }
    
    private void z(final dy dy) {
        ee[] array = null;
        eb[] array2 = null;
        final String b = dy.b((short)28);
        final String b2 = dy.b((short)29);
        final int c;
        if ((c = dy.c((short)23)) > 0) {
            array = new ee[c];
            for (int i = dy.b((short)23, 0), n = 0; i >= 0; i = dy.b((short)23, i), ++n) {
                array[n] = new ee();
                array[n].h = dy.a(i);
            }
        }
        final String b3;
        if ((b3 = dy.b((short)30)) != null) {
            final String[] b4;
            array2 = new eb[(b4 = i.b(b3, "^")).length];
            for (int j = 0; j < b4.length; ++j) {
                final String[] a2;
                final String[] a;
                final String s = (a = i.a((a2 = i.a(b4[j], "|", 2, (boolean)(1 != 0)))[0], ":", 3, (boolean)(1 != 0)))[0];
                String s2 = null;
                if (a.length == 3) {
                    s2 = a[1];
                }
                String s3;
                if (a.length == 3) {
                    s3 = a[2];
                }
                else {
                    s3 = a[1];
                }
                final int index = s3.indexOf(32);
                final String substring = s3.substring(index + 1);
                final String substring2 = s3.substring(0, index);
                if (s.toLowerCase().equals("wap".toLowerCase())) {
                    (array2[j] = new eb("wap")).a(substring2);
                    array2[j].d(substring);
                    array2[j].e(s2);
                }
                else if (s.toLowerCase().equals("call".toLowerCase())) {
                    (array2[j] = new eb("call")).b(substring2);
                    array2[j].d(substring);
                    array2[j].e(s2);
                }
                else if (s.toLowerCase().equals("sms".toLowerCase())) {
                    (array2[j] = new eb("sms")).c(substring2);
                    array2[j].d(substring);
                    array2[j].e(s2);
                    final String[] b5;
                    final String s4 = (b5 = i.b(a2[1], "#"))[0];
                    if (b5.length > 1) {
                        final ec[] array3 = new ec[b5.length - 1];
                        for (int k = 1; k < b5.length; ++k) {
                            final String[] b7;
                            final String b6 = (b7 = i.b(b5[k], "|"))[0];
                            final int int1 = Integer.parseInt(b7[1]);
                            array3[k - 1] = new ec();
                            array3[k - 1].a = int1;
                            array3[k - 1].b = b6;
                            if (b7.length > 2) {
                                final String[] d = new String[(b7.length - 2) / 2];
                                final String[] e = new String[(b7.length - 2) / 2];
                                for (int n2 = 0, l = 2; l < b7.length; ++l, e[n2] = b7[l], ++n2, ++l) {
                                    d[n2] = b7[l];
                                }
                                array3[k - 1].d = d;
                                array3[k - 1].e = e;
                            }
                        }
                        array2[j].f(s4);
                        array2[j].a(array3);
                    }
                }
            }
        }
        this.a.a(b, b2, array, array2);
    }
    
    private void A(final dy dy) {
        if (du.a().z != dy.a(dy.b((short)255, 0), (short)0)) {
            return;
        }
        final int c = dy.c((short)8);
        Object o = null;
        if (c > 0) {
            final ef[] array = new ef[c];
            int n = 0;
            int n2 = dy.a((short)67, -1);
            boolean b = false;
            while (!b) {
                final int n3 = n2;
                if ((n2 = dy.a((short)67, n3)) < 0) {
                    b = true;
                }
                final String lowerCase = dy.b(n3).toLowerCase();
                int n4 = dy.a((short)72, n3);
                boolean b2 = false;
                while (!b2) {
                    final int n5 = n4;
                    if ((n4 = dy.a((short)72, n5, n2)) < 0) {
                        n4 = n2;
                        b2 = true;
                    }
                    final long a = dy.a(n5, 0L);
                    final byte a2 = dy.a((short)221, n5, n4, (byte)0);
                    final byte a3 = dy.a((short)220, n5, n4, (byte)0);
                    final int a4 = dy.a((short)125, n5, n4, 0);
                    final int a5 = dy.a((short)124, n5, n4, 0);
                    final byte a6 = dy.a((short)90, n5, n4, (byte)0);
                    final long a7 = dy.a((short)9, n5, n4, 0L);
                    final String b3 = dy.b((short)8, n5, n4);
                    final String b4 = dy.b((short)24, n5, n4);
                    dy.a((short)114, n5, n4, (byte)0);
                    final String b5;
                    if (!i.b(b5 = dy.b((short)110, n5, n4))) {
                        final String[] b6 = i.b(b5, ";");
                        for (int j = 0; j < b6.length; ++j) {
                        final String[] b7;
                        if (i.a((b7 = i.b(b6[j], ":"))[0], "border")) {
                            Short.parseShort(b7[1]);
                        }
                        else if (i.a(b7[0], "color")) {
                            Short.parseShort(b7[1]);
                        }
                    }
                    }
                    final String b8 = dy.b((short)29, n5, n4);
                    (array[n] = new ef()).b(a);
                    array[n].a(lowerCase);
                    array[n].a(a4);
                    array[n].b(a5);
                    array[n].c(a6);
                    array[n].d(b8);
                    array[n].b(a2);
                    array[n].a(a3);
                    array[n].a(a7);
                    array[n].b(b3);
                    array[n].c(b4);
                    final long p = du.a().p;
                    ++n;
                }
            }
            o = g.a(array, new ek(true));
        }
        if (o != null && ((ef[])o).length > 0) {
            ef[] efArray = (ef[]) o;
            ef ef = efArray[efArray.length - 1];
            ef[] array2 = null;
            if (efArray.length > 1) {
                array2 = new ef[efArray.length - 1];
                System.arraycopy(efArray, 0, array2, 0, array2.length);
            }
            this.a.a(ef, array2);
        }
    }
    
    private void B(final dy dy) {
        dy.a(dy.b((short)255, 0), (short)0);
        dy.b((short)109);
        final int c;
        if ((c = dy.c((short)110)) > 0) {
            final ee[] array = new ee[c];
            int n = dy.b((short)110, 0);
            int n2 = dy.b((short)23, 0);
            for (int i = 0; i < c; ++i) {
                array[i] = new ee();
                array[i].a = dy.b(n);
                array[i].h = dy.a(n2);
                n = dy.a((short)110, n);
                n2 = dy.a((short)23, n2);
            }
        }
        final dv a = this.a;
    }
    
    private void C(final dy dy) {
        final int c;
        if ((c = dy.c((short)7)) > 0) {
            final ds[] array = new ds[c];
            int n = dy.a((short)7, -1);
            int n2 = dy.a((short)58, -1);
            for (int i = 0; i < c; ++i) {
                final String b = dy.b(n);
                dy.a(n2, 0L);
                n = dy.a((short)7, n);
                n2 = dy.a((short)58, n2);
                (array[i] = new ds()).a(b);
            }
            final dv a = this.a;
        }
    }
    
    private void D(final dy dy) {
        final String b = dy.b((short)5);
        final String b2 = dy.b((short)29);
        final String[] b3;
        if ((b3 = i.b(dy.b((short)8), ";")) != null && b3.length > 0 && b3.length % 2 == 0) {
            final String[] array = new String[b3.length / 2];
            final String[] array2 = new String[b3.length / 2];
            for (int i = 0; i < b3.length; i += 2) {
                array2[i / 2] = b3[i];
                array[i / 2] = b3[i + 1];
            }
            this.a.a(b2, b, array2, array);
        }
    }
    
    public final void a() {
        this.c = true;
        if (this.b != null) {
            this.b.b();
            this.b = null;
        }
    }
    
    public final void a(final dv a) {
        this.a = a;
        if (this.b != null) {
            this.b.a(this.a);
        }
    }
    
    private static eb[] a(String s) {
        final String[] b;
        if ((b = i.b(s = s, "^")) == null || b.length == 0) {
            return null;
        }
        eb[] array = new eb[b.length];
        int n = 0;
        for (int j = 0; j < b.length; ++j) {
            final String[] a2;
            final String[] a;
            final String s2 = (a = i.a((a2 = i.a(b[j], "|", 2, (boolean)(0 != 0)))[0], ":", 3, (boolean)(0 != 0)))[0];
            String s3 = null;
            if (a.length == 3) {
                s3 = a[1];
            }
            String s4;
            if (a.length == 3) {
                s4 = a[2];
            }
            else {
                s4 = a[1];
            }
            final int index;
            String substring;
            if ((index = s4.indexOf(32)) < 0) {
                substring = s4;
            }
            else {
                substring = s4.substring(index + 1);
            }
            String s5;
            if (index <= 0) {
                s5 = "";
            }
            else {
                s5 = s4.substring(0, index);
            }
            final String lowerCase;
            if ((lowerCase = s2.toLowerCase()).equals("wap".toLowerCase())) {
                (array[n] = new eb("wap")).a(s5);
                array[n].d(substring);
                array[n].e(s3);
                ++n;
            }
            else if (lowerCase.equals("viewme".toLowerCase())) {
                (array[n] = new eb("viewme")).a(s5);
                array[n].d(substring);
                array[n].e(s3);
                ++n;
            }
            else if (lowerCase.equals("viewbox".toLowerCase())) {
                (array[n] = new eb("viewbox")).a(s5);
                array[n].d(substring);
                array[n].e(s3);
                ++n;
            }
            else if (lowerCase.equals("viewproposalrequest".toLowerCase())) {
                (array[n] = new eb("viewproposalrequest")).a(s5);
                array[n].d(substring);
                array[n].e(s3);
                ++n;
            }
            else if (lowerCase.equals("viewproposallist".toLowerCase())) {
                (array[n] = new eb("viewproposallist")).a(s5);
                array[n].d(substring);
                array[n].e(s3);
                ++n;
            }
            else if (lowerCase.equals("viewmedia".toLowerCase())) {
                array[n] = new eb("viewmedia");
                new ee().a(substring);
                array[n].e(s3);
                ++n;
            }
            else if (lowerCase.equals("xt".toLowerCase())) {
                (array[n] = new eb("xt")).a(s5);
                array[n].d(substring);
                array[n].e(s3);
                ++n;
            }
            else if (lowerCase.equals("app".toLowerCase())) {
                (array[n] = new eb("app")).a(s5);
                array[n].d(substring);
                array[n].e(s3);
                ++n;
            }
            else if (lowerCase.equals("dpk".toLowerCase())) {
                (array[n] = new eb("dpk")).a(s5);
                array[n].d(substring);
                array[n].e(s3);
                ++n;
            }
            else if (lowerCase.equals("rss".toLowerCase())) {
                (array[n] = new eb("rss")).a(s5);
                array[n].d(substring);
                array[n].e(s3);
                ++n;
            }
            else if (lowerCase.equals("vip".toLowerCase())) {
                array[n] = new eb("vip");
                if (s5 == null || s5.length() == 0) {
                    s5 = du.a().f;
                }
                array[n].a(s5);
                array[n].d(substring);
                array[n].e(s3);
                ++n;
            }
            else if (lowerCase.equals("call".toLowerCase())) {
                (array[n] = new eb("call")).b(s5);
                array[n].d(substring);
                array[n].e(s3);
                ++n;
            }
            else if (lowerCase.equals("sms".toLowerCase()) || lowerCase.equals("msg".toLowerCase())) {
                (array[n] = new eb(s2)).c(s5);
                array[n].d(substring);
                array[n].e(s3);
                final String[] b2;
                final String s6 = (b2 = i.b(a2[1], "#"))[0];
                if (b2.length > 1) {
                    final ec[] array2 = new ec[b2.length - 1];
                     for (int k = 1; k < b2.length; ++k) {
                        final String[] b4;
                        final String b3 = (b4 = i.b(b2[k], "|"))[0];
                        final int int1 = Integer.parseInt(b4[1]);
                        array2[k - 1] = new ec();
                        array2[k - 1].a = int1;
                        array2[k - 1].b = b3;
                        if (int1 == 10) {
                            if (b4.length > 2) {
                                array2[k - 1].c = b4[2];
                            } else {
                                array2[k - 1].c = du.a().f;
                            }
                        } else if ((int1 == 4 || int1 == 5 || int1 == 6) && b4.length > 2) {
                            final String[] d = new String[(b4.length - 2) / 2];
                            final String[] e = new String[(b4.length - 2) / 2];
                            for (int n2 = 0, l = 2; l < b4.length; ++l, e[n2] = b4[l], ++n2, ++l) {
                                d[n2] = b4[l];
                            }
                            array2[k - 1].d = d;
                            array2[k - 1].e = e;
                        }
                    }
                    array[n].a(array2);
                }
                array[n].f(s6);
                ++n;
            }
        }
        if (n < array.length) {
            final eb[] array3 = new eb[n];
            System.arraycopy(array, 0, array3, 0, n);
            array = array3;
        }
        return array;
    }
    
    private static dt[] a(final dy dy, final dt[] array, final boolean b, final short n) {
        final int c = dy.c((short)21);
        dt[] array2 = null;
        if (c > 0) {
            array2 = new dt[c];
            int n2 = dy.b((short)21, 0);
            for (int i = 0; i < c; ++i) {
                final int n3 = n2;
                n2 = dy.a((short)21, n3);
                (array2[i] = new dt(dy.b(n3))).a(dy.a((short)20, n3, n2, (short)0));
                final int n4 = n3;
                final int n5 = n2;
                final int n6 = n4;
                int n7 = 0;
                int n9;
                int n8;
                if (dy.c == null) {
                    n8 = (n9 = 0);
                }
                else {
                    int n10 = n6;
                    int length = n5;
                    if (n10 < 0) {
                        n10 = -1;
                    }
                    else if (n10 >= dy.c.length) {
                        n10 = dy.c.length - 1;
                    }
                    if (length < 0) {
                        length = dy.c.length;
                    }
                    if (n10 + 1 >= length) {
                        n8 = (n9 = 0);
                    }
                    else {
                        for (int n11 = n10 + 1; n11 < dy.c.length && n11 < length; ++n11) {
                            if (dy.c[n11].a == 7) {
                                ++n7;
                            }
                        }
                        n8 = (n9 = n7);
                    }
                }
                final int n12 = n9;
                if (n8 > 0) {
                    final ds[] array3 = new ds[n12];
                    int n13 = dy.a((short)7, n3);
                    for (int j = 0; j < n12; ++j) {
                        final int n14 = n13;
                        n13 = dy.a((short)7, n14);
                        final String lowerCase = dy.b(n14).toLowerCase();
                        (array3[j] = new ds()).a(lowerCase);
                        String b2;
                        if ((b2 = dy.b((short)22, n14, n13)) == null) {
                            b2 = lowerCase;
                        }
                        array3[j].b(b2);
                        short a = 0;
                        short a2 = 0;
                        short a3 = 0;
                        final int a4;
                        if ((a4 = dy.a((short)12, n14, n13)) >= 0) {
                            a3 = dy.a(a4, (short)0);
                            a = dy.a((short)45, n14, n13, (short)0);
                            a2 = dy.a((short)38, n14, n13, (short)0);
                        }
                        final String b3 = dy.b((short)13, n14, n13);
                        final String b4 = dy.b((short)86, n14, n13);
                        array3[j].a(a);
                        array3[j].b(a2);
                        array3[j].d(b4);
                        array3[j].c(a3);
                        array3[j].c(b3);
                    }
                    array2[i].a(array3);
                }
            }
            final dt[] array4 = array2;
            int n15 = 0;
            for (int k = 1; k < array4.length; ++k) {
                if (array4[k - 1].a() == 1) {
                    ++n15;
                }
                else {
                    for (int n16 = k; n16 > n15 && array4[n16].b().compareTo(array4[n16 - 1].b()) < 0; --n16) {
                        final dt dt = array4[n16 - 1];
                        array4[n16 - 1] = array4[n16];
                        array4[n16] = dt;
                    }
                }
            }
        }
        return array2;
    }
    
    // Stub method to fix 'cannot find symbol: method i(dy)'
    private void i(dy dy) {
        // TODO: implement logic for case 116 
    }
}
