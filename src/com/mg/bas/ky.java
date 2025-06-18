package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.smsgame.MGMIDlet;
import java.io.InputStream;

final class ky
implements Runnable,
kn {
    public kq b;
    public kp c;
    public ko d;
    private kv e;
    private boolean f = false;

    public ky(InputStream inputStream) {
        this.e = new kv(inputStream);
        this.f = false;
        new Thread(this).start();
    }

    public final void run() {
        int n2 = 10;
        this.f = false;
        block102: while (!this.f) {
            Object[] objectArray;
            short s;
            int n3;
            Object object;
            Object object2;
            Object object3;
            Object object4;
            try {
                Object object5;
                block144: {
                    object4 = this;
                    if (((ky)object4).e == null) {
                        ct.a("[SocketReader] input null");
                        object5 = null;
                    } else {
                        object3 = ((ky)object4).e;
                        Object[] objectArray2 = object2 = new byte[7];
                        object4 = ((kv)object3).a;
                        int n4 = g.a((InputStream)object4, objectArray2, 0);
                        object = new ku();
                        if (n4 <= 0) {
                            ct.a("[InputBuffer] readPacket() PACKET_FAIL");
                            object5 = null;
                        } else {
                            int n5;
                            ks.h += n4;
                            n3 = m.a(object2[0], object2[1]);
                            ((ku)object).a = n5 = m.a(object2[2], object2[3], object2[4], object2[5]);
                            ((ku)object).b = n4 = m.a(object2[6]);
                            if (n5 > 0) {
                                ks.h += n5;
                                object2 = new kt[n3];
                                n3 = 0;
                                while (n3 < ((byte[])object2).length) {
                                    InputStream inputStream = ((kv)object3).a;
                                    byte[] byArray = new byte[5];
                                    objectArray2 = byArray;
                                    if (g.a(inputStream, objectArray2, 0) < 0) {
                                        object5 = null;
                                        break block144;
                                    }
                                    s = (short)m.a(byArray[0]);
                                    inputStream = ((kv)object3).a;
                                    n5 = m.a(byArray[1], byArray[2], byArray[3], byArray[4]);
                                    objectArray = new byte[n5];
                                    objectArray2 = objectArray;
                                    if (g.a(inputStream, objectArray2, 0) < 0) {
                                        object5 = null;
                                        break block144;
                                    }
                                    object2[n3] = (byte)new kt(s, (byte[])objectArray);
                                    ++n3;
                                }
                                ((ku)object).c = (kt[])object2;
                            }
                            object5 = object4 = object;
                        }
                    }
                }
                if (object5 == null) {
                    if (--n2 <= 0) {
                        this.f = true;
                    } else {
                        try {
                            Thread.sleep(3000L);
                        }
                        catch (Throwable throwable) {}
                    }
                } else {
                    n2 = 10;
                }
            }
            catch (Throwable throwable) {
                object4 = throwable;
                throwable.printStackTrace();
                if (--n2 <= 0) {
                    this.f = true;
                } else {
                    try {
                        Thread.sleep(1000L);
                    }
                    catch (Throwable throwable2) {}
                }
                object4 = null;
            }
            object3 = object4;
            object4 = this;
            if (object3 == null) {
                ct.a("[PAT] Get NULL packet on SocketReader.process()");
                continue;
            }
            if (((ky)object4).b == null) {
                throw new NullPointerException("Main listener can't be NULL");
            }
            try {
                int n6 = ((ku)object3).b;
                block4 : switch (n6) {
                    case 0: {
                        n6 = ((ku)object3).a((short)0, (byte)-1);
                        object = ((ku)object3).d((short)1);
                        switch (n6) {
                            case 7: {
                                if (((ky)object4).c == null) continue block102;
                                ((ky)object4).c.a();
                                break;
                            }
                            case 3: {
                                ((ky)object4).b.w();
                                break;
                            }
                            case 8: {
                                ((ky)object4).b.b((String)object);
                                break;
                            }
                            default: {
                                ((ky)object4).b.a(n6, (String)object);
                                break;
                            }
                        }
                        continue block102;
                    }
                    case 1: {
                        ks.a().b = 3;
                        break;
                    }
                    case 2: {
                        ks.a().a(((ku)object3).d((short)3));
                        break;
                    }
                    case 5: {
                        super.c((ku)object3);
                        break;
                    }
                    case 3: {
                        object4 = ((ku)object3).c((short)2);
                        object = ks.a().c;
                        String string = ks.a().d;
                        byte[] byArray = g.a((byte[])object4, string);
                        ks.a().a((String)object, byArray, (byte[])object4);
                        break;
                    }
                    case 8: {
                        super.e((ku)object3);
                        break;
                    }
                    case 9: {
                        ((ku)object3).c((short)112);
                        byte by = ((ku)object3).a((short)134, (byte)-1);
                        n6 = by;
                        if (by > 0) {
                            lh lh2 = super.a((ku)object3);
                            ((ky)object4).b.a(lh2, (byte)n6);
                            break;
                        }
                        super.b((ku)object3);
                        break;
                    }
                    case 30: {
                        super.q((ku)object3);
                        break;
                    }
                    case 29: {
                        String string = ((ku)object3).d((short)9);
                        String string2 = ((ku)object3).d((short)20);
                        s = ((ku)object3).a((short)21, 0, -1, 0);
                        ((ky)object4).b.a(string, string2, (int)s);
                        break;
                    }
                    case 10: {
                        super.b((ku)object3);
                        ((ky)object4).b.U();
                        break;
                    }
                    case 27: {
                        ((ky)object4).b.U();
                        break;
                    }
                    case 36: {
                        super.C((ku)object3);
                        break;
                    }
                    case 42: {
                        super.r((ku)object3);
                        break;
                    }
                    case 37: {
                        byte by = ((ku)object3).a((short)89, (byte)-1);
                        if (by == 0) {
                            super.b((ku)object3);
                            break;
                        }
                        if (by != 1 && by != 2) continue block102;
                        objectArray = new String[((ku)object3).b((short)83)];
                        n6 = 0;
                        while (n6 < objectArray.length) {
                            objectArray[n6] = ((ku)object3).b(((ku)object3).b((short)83, n6));
                            ++n6;
                        }
                        if (by == 1) {
                            ((ky)object4).b.c((String[])objectArray);
                            break;
                        }
                        ((ky)object4).b.d((String[])objectArray);
                        break;
                    }
                    case 48: {
                        String string = ((ku)object3).d((short)83);
                        int n7 = ((ku)object3).c((short)114, -1);
                        int n8 = ((ku)object3).c((short)106, -1);
                        ((ky)object4).b.b(string, n7, n8);
                        break;
                    }
                    case 11: {
                        super.d((ku)object3);
                        break;
                    }
                    case 43: {
                        super.f((ku)object3);
                        break;
                    }
                    case 6: {
                        n6 = ((ku)object3).c((short)4, 0);
                        int n9 = ((ku)object3).a(((ku)object3).b((short)7, 0), -1);
                        if (n9 < 0) {
                            int n10 = ((ku)object3).a(((ku)object3).b((short)6, 0), -1);
                            int n11 = ((ku)object3).a(((ku)object3).b((short)5, 0), -1);
                            if (((ky)object4).d == null) continue block102;
                            ((ky)object4).d.a(n6, n10, n11);
                            break;
                        }
                        byte[] byArray = ((ku)object3).c((short)8);
                        if (((ky)object4).d == null) continue block102;
                        ((ky)object4).d.a(n6, n9, byArray);
                        break;
                    }
                    case 13: {
                        String string = ((ku)object3).d((short)20);
                        int n12 = ((ku)object3).c((short)21, 0);
                        byte by = ((ku)object3).a((short)22, (byte)0);
                        ((ky)object4).b.a(string, n12, (int)by);
                        break;
                    }
                    case 16: {
                        String string = ((ku)object3).d((short)9);
                        objectArray = ((ku)object3).d((short)1);
                        ((ky)object4).b.b(string, (String)objectArray);
                        break;
                    }
                    case 17: {
                        String string = ((ku)object3).d((short)28);
                        object = ((ku)object3).d((short)9);
                        String string3 = ((ku)object3).d((short)1);
                        lh lh3 = super.a((ku)object3, 0, -1);
                        super.a((ku)object3, 0, -1).b = object;
                        long l = ((ku)object3).a((short)132, 0L);
                        byte by = ((ku)object3).a((short)167, (byte)0);
                        n3 = ((ku)object3).a((short)169, (byte)0);
                        ((ky)object4).b.a(lh3, string3, l, string, by > 0, n3 > 0);
                        break;
                    }
                    case 22: {
                        super.j((ku)object3);
                        break;
                    }
                    case 18: {
                        n6 = ((ku)object3).c((short)41, 0);
                        object = new nq(n6, 0);
                        boolean bl = ((ku)object3).a((short)32);
                        if (((ku)object3).a((short)39)) {
                            ((nq)object).E = true;
                        } else {
                            ((nq)object).d = bl;
                        }
                        if (((ky)object4).c == null) continue block102;
                        ((ky)object4).c.a((nq)object);
                        break;
                    }
                    case 19: {
                        short s2;
                        n6 = ((ku)object3).c((short)41, 0);
                        object = new nq(n6, 3);
                        new nq(n6, 3).i = ((ku)object3).a((short)44, 0L);
                        int n13 = ((ku)object3).a(((ku)object3).b((short)33, 0), -1);
                        int n14 = ((ku)object3).a(((ku)object3).b((short)34, 0), -1);
                        int n15 = ((ku)object3).a(((ku)object3).b((short)33, 1), -1);
                        s = s2 = ((ku)object3).a(((ku)object3).b((short)34, 1), -1);
                        int n16 = n15;
                        n6 = n14;
                        n3 = n13;
                        Object object6 = object;
                        ((nq)object).j = n3;
                        ((nq)object6).l = n16;
                        ((nq)object6).k = n6;
                        ((nq)object6).m = s;
                        super.a((ku)object3, (nq)object);
                        break;
                    }
                    case 24: {
                        ct.a("[processUpdateMatch]======================================");
                        n6 = ((ku)object3).c((short)41, 0);
                        object = new nq(n6, 2);
                        ky.b((ku)object3, (nq)object);
                        boolean bl = ((ku)object3).a((short)32);
                        byte[] byArray = ((ku)object3).c((short)39);
                        if (byArray != null) {
                            ((ky)object4).c.a((nq)object);
                            ((nq)object).E = true;
                            super.a((ku)object3, byArray[0], ((nq)object).b);
                            break;
                        }
                        ((nq)object).d = bl;
                        ((ky)object4).c.a((nq)object);
                        break;
                    }
                    case 20: {
                        super.m((ku)object3);
                        break;
                    }
                    case 44: {
                        int n17;
                        n6 = ((ku)object3).c((short)41, 0);
                        object = new nq(n6, 4);
                        new nq(n6, 4).i = ((ku)object3).a((short)44, 0L);
                        ((nq)object).e = n17 = ((ku)object3).c((short)114, 0);
                        super.a((ku)object3, (nq)object);
                        break;
                    }
                    case 47: {
                        if (((ky)object4).c == null) continue block102;
                        nq nq2 = new nq(1);
                        new nq(1).k = ((ku)object3).c((short)34, 2);
                        nq2.j = ((ku)object3).c((short)33, 2);
                        if (((ky)object4).c == null) continue block102;
                        ((ky)object4).c.a(nq2);
                        break;
                    }
                    case 84: {
                        n6 = ((ku)object3).c((short)114, -1);
                        int n18 = ((ku)object3).c((short)106, -1);
                        ((ky)object4).b.e(n6, n18);
                        super.b((ku)object3);
                        break;
                    }
                    case 40: {
                        if (((ky)object4).c == null) continue block102;
                        byte[] byArray = ((ku)object3).c((short)39);
                        if (byArray == null) {
                            ((ky)object4).c.a(-1);
                            break;
                        }
                        ((ky)object4).c.a(byArray[0]);
                        super.a((ku)object3, byArray[0], -1);
                        break;
                    }
                    case 25: {
                        String string = ((ku)object3).d((short)9);
                        objectArray = ((ku)object3).d((short)1);
                        if (((ky)object4).c != null) {
                            ((ky)object4).c.a(string, (String)objectArray);
                        }
                        ((ky)object4).b.c(string, (String)objectArray);
                        break;
                    }
                    case 12: {
                        String string = ((ku)object3).d((short)192);
                        object = ((ku)object3).d((short)1);
                        long l = ((ku)object3).c((short)157, 0);
                        String string4 = ((ku)object3).d((short)9);
                        byte by = ((ku)object3).a((short)40, (byte)-1);
                        switch (by) {
                            case 0: {
                                ((ky)object4).b.a(string, string4);
                                break block4;
                            }
                            case 1: {
                                ((ky)object4).b.a(string, ky.d((ku)object3, ((ku)object3).b((short)9, 0), -1), (String)object, l);
                                break block4;
                            }
                            case 2: {
                                ((ky)object4).b.b(string, ky.d((ku)object3, ((ku)object3).b((short)9, 0), -1), (String)object, l);
                                break block4;
                            }
                            case 3: {
                                super.h((ku)object3);
                            }
                        }
                        break;
                    }
                    case 21: {
                        n6 = ((ku)object3).c((short)41, 0);
                        object = new nq(n6, 6);
                        super.a((ku)object3, (nq)object);
                        break;
                    }
                    case 28: {
                        ((ky)object4).b.V();
                        break;
                    }
                    case 23: {
                        super.l((ku)object3);
                        break;
                    }
                    case 31: {
                        super.g((ku)object3);
                        break;
                    }
                    case 32: {
                        ((ky)object4).b.A();
                        break;
                    }
                    case 41: {
                        ((ky)object4).b.B();
                        break;
                    }
                    case 33: {
                        super.n((ku)object3);
                        break;
                    }
                    case 38: {
                        ky.o((ku)object3);
                        break;
                    }
                    case 34: {
                        nu.a(new nt(((ku)object3).c((short)80, -1), ((ku)object3).d((short)81), "", ((ku)object3).d((short)77)));
                        String string = ((ku)object3).d((short)149);
                        ((ky)object4).b.a(string, (byte)0);
                        break;
                    }
                    case 35: {
                        super.p((ku)object3);
                        break;
                    }
                    case 45: {
                        ((ky)object4).b.c(((ku)object3).d((short)1));
                        break;
                    }
                    case 46: {
                        kq kq2 = ((ky)object4).b;
                        ((ku)object3).d((short)9);
                        kq2.a(((ku)object3).a((short)132, 0L));
                        break;
                    }
                    case 55: {
                        super.s((ku)object3);
                        break;
                    }
                    case 56: {
                        super.v((ku)object3);
                        break;
                    }
                    case 57: {
                        super.t((ku)object3);
                        break;
                    }
                    case 7: {
                        byte by = ((ku)object3).a((short)147, (byte)-1);
                        switch (by) {
                            case 0: {
                                n6 = ((ku)object3).a((short)165, (byte)-1);
                                ((ky)object4).b.c(n6 == 1);
                                break block4;
                            }
                            case 1: {
                                n6 = ((ku)object3).a((short)166, (byte)-1);
                                ((ky)object4).b.d(n6 == 1);
                            }
                        }
                        break;
                    }
                    case 125: {
                        ((ky)object4).b.a(((ku)object3).d((short)149), (byte)0);
                        break;
                    }
                    case 52: {
                        super.w((ku)object3);
                        break;
                    }
                    case 128: {
                        ((ky)object4).b.s(((ku)object3).d((short)1));
                        break;
                    }
                    case 129: {
                        byte by = ((ku)object3).a((short)147, (byte)-1);
                        n6 = by;
                        switch (by) {
                            case 0: {
                                ((ky)object4).b.a(((ku)object3).d((short)162), ((ku)object3).c((short)161) != null, ((ku)object3).c((short)163) != null);
                                break block4;
                            }
                            case 1: {
                                ((ky)object4).b.a(((ku)object3).d((short)162), ((ku)object3).c((short)101) != null, ((ku)object3).c((short)161) != null, ((ku)object3).c((short)163) != null);
                                break block4;
                            }
                            case 2: {
                                ((ky)object4).b.b(((ku)object3).d((short)162), ((ku)object3).c((short)101) != null, ((ku)object3).c((short)161) != null, ((ku)object3).c((short)163) != null);
                            }
                        }
                        break;
                    }
                    case 64: {
                        super.i((ku)object3);
                        break;
                    }
                    case 65: {
                        String string = ((ku)object3).d((short)192);
                        object = ((ku)object3).d((short)1);
                        long l = ((ku)object3).a((short)157, 0L);
                        int n19 = ((ku)object3).c((short)194, 0);
                        ct.a("[processJoinRoom]  " + (String)object + ":  " + l);
                        ((ky)object4).b.a(string, (String)object, l, n19);
                        break;
                    }
                    case 130: {
                        byte[] byArray = ((ku)object3).c((short)176);
                        object = ((ku)object3).c((short)2);
                        ((ky)object4).b.a(byArray, (byte[])object);
                        break;
                    }
                    case 131: {
                        String string = ((ku)object3).d((short)1);
                        if (((ky)object4).b == null) continue block102;
                        ((ky)object4).b.o(string);
                        break;
                    }
                    case 4: {
                        if (((ky)object4).b == null) continue block102;
                        ((ky)object4).b.T();
                        break;
                    }
                    case 51: {
                        lm[] lmArray;
                        n6 = ((ku)object3).c((short)114, 0);
                        object = ((ku)object3).d((short)1);
                        String string = ((ku)object3).d((short)83);
                        if (n6 > 0) {
                            go.b(n6, 1);
                        }
                        if (object != null) {
                            ((ky)object4).b.v((String)object);
                        }
                        if (string != null) {
                            int n20 = ((ku)object3).b((short)83, 0);
                            int n21 = ((ku)object3).a((short)83, n20);
                            ll ll2 = ky.a((ku)object3, n20, n21, true);
                            ((ky)object4).b.c(ll2);
                        }
                        if ((lmArray = ky.a((ku)object3, 1)).length <= 0) continue block102;
                        ((ky)object4).b.a(lmArray);
                        break;
                    }
                    case 83: {
                        n6 = ((ku)object3).c((short)114, -1);
                        int n22 = ((ku)object3).c((short)106, 0);
                        ((ky)object4).b.f(n6, n22);
                        break;
                    }
                    case 99: {
                        String string = ((ku)object3).d((short)186);
                        object = ((ku)object3).d((short)1);
                        if (ct.b()) {
                            ct.a("[processRequestUpgradeEquipment]  session  " + string + "  message  " + (String)object);
                        }
                        if (((ky)object4).b == null) continue block102;
                        ((ky)object4).b.e(string, (String)object);
                        break;
                    }
                    case 100: {
                        ((ku)object3).d((short)186);
                        byte by = ((ku)object3).a((short)187, (byte)0);
                        String string = ((ku)object3).d((short)83);
                        int n23 = ((ku)object3).c((short)114, -1);
                        int n24 = ((ku)object3).c((short)106, -1);
                        long l = ((ku)object3).a((short)132, 0L);
                        String string5 = ((ku)object3).d((short)1);
                        n6 = ((ku)object3).a((short)188, (byte)0);
                        if (string != null) {
                            if (by == 0) {
                                ((ky)object4).b.a(string, string5, (byte)n6, l);
                            } else {
                                ((ky)object4).b.b(string, string5, (byte)n6, l);
                            }
                        }
                        if (n23 <= 0) continue block102;
                        if (by == 0) {
                            ((ky)object4).b.a(string5, (byte)n6, l);
                            break;
                        }
                        ((ky)object4).b.a(n23, n24, string5, (byte)n6, l);
                        break;
                    }
                    case 101: {
                        super.A((ku)object3);
                        break;
                    }
                    case 96: {
                        String string = ((ku)object3).d((short)186);
                        object = ((ku)object3).d((short)83);
                        String string6 = ((ku)object3).d((short)1);
                        if (ct.b()) {
                            ct.a("[processRequestUpgradeEquipment]  equipKey  " + (String)object + " message" + string6);
                        }
                        if (((ky)object4).b == null) continue block102;
                        ((ky)object4).b.a(string, (String)object, string6);
                        break;
                    }
                    case 97: {
                        ((ku)object3).d((short)186);
                        byte by = ((ku)object3).a((short)187, (byte)0);
                        String string = ((ku)object3).d((short)83);
                        int n25 = ((ku)object3).c((short)114, -1);
                        int n26 = ((ku)object3).c((short)106, -1);
                        long l = ((ku)object3).a((short)132, 0L);
                        String string7 = ((ku)object3).d((short)1);
                        n6 = ((ku)object3).a((short)188, (byte)0);
                        if (ct.b()) {
                            ct.a("[processModifiedUpgradeEquipment]readyStatus   " + n6);
                        }
                        if (string != null) {
                            if (by == 0) {
                                ((ky)object4).b.d(string, string7, (byte)n6, l);
                            } else {
                                ((ky)object4).b.c(string, string7, (byte)n6, l);
                            }
                        }
                        if (n25 <= 0) continue block102;
                        if (by == 0) {
                            ((ky)object4).b.b(string7, (byte)n6, l);
                            break;
                        }
                        ((ky)object4).b.b(n25, n26, string7, (byte)n6, l);
                        break;
                    }
                    case 98: {
                        super.B((ku)object3);
                        break;
                    }
                    case 112: {
                        int n27;
                        String string = ((ku)object3).d((short)83);
                        if (string != null) {
                            ((ku)object3).d((short)175);
                            long l = ((ku)object3).a((short)157, 0L);
                            ((ky)object4).b.a(string, l);
                        }
                        if ((n27 = ((ku)object3).c((short)114, 0)) <= 0) continue block102;
                        ((ku)object3).d((short)175);
                        int n28 = ((ku)object3).c((short)106, 0);
                        ((ku)object3).a((short)157, 0L);
                        ((ky)object4).b.g(n27, n28);
                        break;
                    }
                    case 116: {
                        super.y((ku)object3);
                        break;
                    }
                    case 113: {
                        super.x((ku)object3);
                        break;
                    }
                    case 114: {
                        n6 = ((ku)object3).a((short)152, (byte)-1);
                        int n29 = ((ku)object3).c((short)106, 0);
                        ct.a("[processListMarketProducts]catid == " + n6 + "qty ==" + n29);
                        ((ky)object4).b.a(n6, n29, super.u((ku)object3));
                        break;
                    }
                    case 115: {
                        super.z((ku)object3);
                        break;
                    }
                    case 132: {
                        super.D((ku)object3);
                        break;
                    }
                    case 133: {
                        String string = ((ku)object3).d((short)1);
                        ((ky)object4).b.w(string);
                    }
                }
            }
            catch (Throwable throwable) {
                object2 = throwable;
                throwable.printStackTrace();
            }
        }
    }

    private lh a(ku ku2, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        n2 = ku2.a((short)15, 0, -1, (byte)-1);
        lh lh2 = new lh(n2);
        new lh(n2).b = ku2.b(0);
        lh2.c = ku2.d((short)26, 0, -1);
        lh2.f = ku2.a((short)16, 0, -1, (byte)0);
        lh2.g = ku2.a((short)15, 0, -1, (byte)0);
        lh2.G = ku2.a((short)27, 0, -1, 0);
        lh2.e = ku2.a((short)24, 0, -1, (byte)0);
        lh2.H = ku2.a((short)43, 0, -1, 0);
        lh2.s = ku2.a((short)17, 0, -1, 0);
        lh2.r = ku2.a((short)47, 0, -1, 1);
        lh2.u = ku2.a((short)18, 0, -1, 0);
        lh2.t = ku2.a((short)48, 0, -1, 1);
        lh2.w = ku2.a((short)45, 0, -1, 0);
        lh2.v = ku2.a((short)49, 0, -1, 1);
        lh2.S = ku2.d((short)209);
        lh2.R = ku2.d((short)210);
        if (lh2.Q == null) {
            lh2.Q = lh2.G > 100 && lh2.G <= 200 ? "Đại Hiệp" : (lh2.G > 200 ? "Chiến Vương" : "Hào Kiệt");
        }
        lh2.ab = ku2.c((short)160, 0);
        n3 = ku2.a((short)64, 0, -1);
        lh2.E = new lv[n3];
        if (n3 > 0) {
            n6 = ku2.b((short)64, 0, -1);
            n5 = 0;
            while (n5 < n3) {
                n4 = ku2.a((short)64, n6);
                lh2.E[n5] = new lv(ku2.a(n6, -1));
                n6 = n4;
                ++n5;
            }
        }
        lh2.D = new ll[ku2.a((short)83, 0, -1)];
        n6 = ku2.a((short)83, 0);
        n5 = 0;
        while (n5 < lh2.D.length) {
            n4 = ku2.a((short)83, n6);
            lh2.D[n5] = ky.a(ku2, n6, n4, false);
            n6 = n4;
            ++n5;
        }
        n5 = ku2.a((short)90, 0, -1);
        n6 = ku2.a((short)90, 0);
        n4 = 0;
        while (n4 < n5) {
            n3 = ku2.a((short)90, n6);
            int n7 = ku2.a(n6, 0);
            byte by = ku2.a((short)91, n6, n3, (byte)0);
            df df2 = new df(n7);
            int n8 = ku2.a((short)93, n6, n3, 0);
            byte[] byArray = ku2.c((short)95, n6, n3);
            df2.d = new dg(n8, byArray);
            df2.f = new dg[]{df2.d};
            n8 = ku2.a((short)96, n6, n3, 0);
            byte[] byArray2 = ku2.c((short)98, n6, n3);
            df2.e = new dg(n8, byArray2);
            switch (by) {
                case 0: {
                    lh2.U = df2;
                    break;
                }
                case 1: {
                    lh2.V = df2;
                    break;
                }
                case 2: {
                    lh2.W = df2;
                }
            }
            n6 = n3;
            ++n4;
        }
        return lh2;
    }

    private lh b(ku ku2, int n2, int n3) {
        try {
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            byte by = ku2.a((short)15, n2, n3, (byte)-1);
            lh lh2 = new lh(by);
            new lh(by).b = ku2.b(n2);
            lh2.c = ku2.d((short)26, n2, n3);
            lh2.O = ku2.c((short)36, n2, n3) != null;
            lh2.f = ku2.a((short)16, n2, n3, (byte)0);
            lh2.g = ku2.a((short)15, n2, n3, (byte)0);
            lh2.G = ku2.a((short)27, n2, n3, 0);
            lh2.Y = ku2.a((short)4, n2, n3, 0);
            lh2.T = ku2.a((short)19, n2, n3, (byte)0);
            lh2.s = ku2.a((short)17, n2, n3, 0);
            lh2.r = ku2.a((short)47, n2, n3, 1);
            lh2.u = ku2.a((short)18, n2, n3, 0);
            lh2.t = ku2.a((short)48, n2, n3, 1);
            lh2.w = ku2.a((short)45, n2, n3, 0);
            lh2.v = ku2.a((short)49, n2, n3, 1);
            lh2.S = ku2.d((short)209);
            lh2.R = ku2.d((short)210);
            if (lh2.Q == null) {
                lh2.Q = lh2.G > 100 && lh2.G <= 200 ? "Đại Hiệp" : (lh2.G > 200 ? "Chiến Vương" : "Hào Kiệt");
            }
            int n10 = ku2.a((short)64, n2, n3);
            lh2.E = new lv[n10];
            if (n10 > 0) {
                n9 = ku2.b((short)64, n2, n3);
                n8 = 0;
                while (n8 < n10) {
                    n7 = ku2.a((short)64, n9);
                    lh2.E[n8] = new lv(ku2.a(n9, -1));
                    lh2.E[n8].b = ku2.d((short)26, n9, n7);
                    lh2.E[n8].d = ku2.d((short)66, n9, n7);
                    lh2.E[n8].f = ku2.a((short)67, n9, n7, -1);
                    lh2.E[n8].e = ku2.a((short)68, n9, n7, -1);
                    n6 = ku2.a((short)69, n9, n7);
                    lh2.E[n8].h = new String[n6];
                    lv[] cfr_ignored_0 = lh2.E;
                    n5 = ku2.b((short)69, n9, n7);
                    n4 = 0;
                    while (n4 < n6) {
                        int n11 = ku2.a((short)69, n5);
                        lh2.E[n8].h[n4] = ku2.b(n5);
                        n5 = n11;
                        ++n4;
                    }
                    n9 = n7;
                    ++n8;
                }
            }
            lh2.D = new ll[ku2.a((short)83, n2, n3)];
            n9 = ku2.a((short)83, n2);
            n8 = 0;
            while (n8 < lh2.D.length) {
                n7 = ku2.a((short)83, n9);
                lh2.D[n8] = ky.a(ku2, n9, n7, false);
                n9 = n7;
                ++n8;
            }
            ku ku3 = ku2;
            ky ky2 = this;
            lh2.F = ky.a(ku3, 0);
            n8 = ku2.a((short)90, n2, n3);
            int n12 = ku2.a((short)90, n2);
            n7 = 0;
            while (n7 < n8) {
                n6 = ku2.a((short)90, n12);
                n5 = ku2.a(n12, 0);
                n4 = ku2.a((short)91, n12, n6, (byte)0);
                df df2 = new df(n5);
                n2 = ku2.a((short)93, n12, n6, 0);
                byte[] byArray = ku2.c((short)95, n12, n6);
                df2.d = new dg(n2, byArray);
                df2.f = new dg[]{df2.d};
                n2 = ku2.a((short)96, n12, n6, 0);
                byArray = ku2.c((short)98, n12, n6);
                df2.e = new dg(n2, byArray);
                switch (n4) {
                    case 0: {
                        lh2.U = df2;
                        break;
                    }
                    case 1: {
                        lh2.V = df2;
                        break;
                    }
                    case 2: {
                        lh2.W = df2;
                    }
                }
                n12 = n6;
                ++n7;
            }
            return lh2;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            MGMIDlet mGMIDlet = MGMIDlet.d();
            mGMIDlet.notifyDestroyed();
            return null;
        }
    }

    private lh c(ku object, int n2, int n3) {
        try {
            int n4;
            int n5;
            int n6;
            lh lh2 = new lh(0);
            new lh(0).b = ((ku)object).b(n2);
            lh2.c = ((ku)object).d((short)26, n2, n3);
            lh2.O = ((ku)object).c((short)36, n2, n3) != null;
            lh2.f = ((ku)object).a((short)16, n2, n3, (byte)0);
            lh2.g = ((ku)object).a((short)15, n2, n3, (byte)0);
            lh2.G = ((ku)object).a((short)27, n2, n3, 0);
            lh2.Y = ((ku)object).a((short)4, n2, n3, 0);
            lh2.T = ((ku)object).a((short)19, n2, n3, (byte)0);
            lh2.s = ((ku)object).a((short)17, n2, n3, 0);
            lh2.r = ((ku)object).a((short)47, n2, n3, 1);
            lh2.u = ((ku)object).a((short)18, n2, n3, 0);
            lh2.t = ((ku)object).a((short)48, n2, n3, 1);
            lh2.w = ((ku)object).a((short)45, n2, n3, 0);
            lh2.v = ((ku)object).a((short)49, n2, n3, 1);
            lh2.S = ((ku)object).d((short)209);
            lh2.R = ((ku)object).d((short)210);
            if (lh2.Q == null) {
                lh2.Q = lh2.G > 100 && lh2.G <= 200 ? "Đại Hiệp" : (lh2.G > 200 ? "Chiến Vương" : "Hào Kiệt");
            }
            int n7 = ((ku)object).a((short)64, n2, n3);
            lh2.E = new lv[n7];
            if (n7 > 0) {
                n6 = ((ku)object).b((short)64, n2, n3);
                n5 = 0;
                while (n5 < n7) {
                    n4 = ((ku)object).a((short)64, n6);
                    lh2.E[n5] = new lv(((ku)object).a(n6, -1));
                    n6 = n4;
                    ++n5;
                }
            }
            lh2.D = new ll[((ku)object).a((short)83, n2, n3)];
            n6 = ((ku)object).a((short)83, n2);
            n5 = 0;
            while (n5 < lh2.D.length) {
                n4 = ((ku)object).a((short)83, n6);
                lh2.D[n5] = ky.a((ku)object, n6, n4, false);
                n6 = n4;
                ++n5;
            }
            lh2.F = new lm[((ku)object).a((short)114, n2, n3)];
            n6 = ((ku)object).a((short)114, n2);
            n5 = 0;
            while (n5 < lh2.F.length) {
                n4 = ((ku)object).a((short)114, n6);
                n7 = ((ku)object).a(n6, 0);
                lh2.F[n5] = new lm(n7);
                lh2.F[n5].g = ((ku)object).a((short)106, n6, n4, 0);
                lh2.F[n5].j = ((ku)object).a((short)4, n6, n4, 0);
                n6 = n4;
                ++n5;
            }
            n5 = ((ku)object).a((short)90, n2, n3);
            n6 = ((ku)object).a((short)90, n2);
            n4 = 0;
            while (n4 < n5) {
                n7 = ((ku)object).a((short)90, n6);
                int n8 = ((ku)object).a(n6, 0);
                n3 = ((ku)object).a((short)91, n6, n7, (byte)0);
                df df2 = new df(n8);
                int n9 = ((ku)object).a((short)93, n6, n7, 0);
                byte[] byArray = ((ku)object).c((short)95, n6, n7);
                df2.d = new dg(n9, byArray);
                df2.f = new dg[]{df2.d};
                n9 = ((ku)object).a((short)96, n6, n7, 0);
                byte[] byArray2 = ((ku)object).c((short)98, n6, n7);
                df2.e = new dg(n9, byArray2);
                switch (n3) {
                    case 0: {
                        lh2.U = df2;
                        break;
                    }
                    case 1: {
                        lh2.V = df2;
                        break;
                    }
                    case 2: {
                        lh2.W = df2;
                    }
                }
                n6 = n7;
                ++n4;
            }
            return lh2;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            object = MGMIDlet.d();
            object.notifyDestroyed();
            return null;
        }
    }

    private lh a(ku ku2) {
        int n2;
        int n3;
        int n4;
        int n5;
        byte by = ku2.a((short)15, 0, -1, (byte)-1);
        lh lh2 = new lh(by);
        new lh(by).b = ku2.d((short)9);
        lh2.c = ku2.d((short)26);
        lh2.g = ku2.a((short)15, (byte)0);
        lh2.f = ku2.a((short)16, (byte)0);
        lh2.G = ku2.c((short)27, 0);
        lh2.s = ku2.c((short)17, 0);
        lh2.r = ku2.c((short)47, 0);
        lh2.u = ku2.c((short)18, 0);
        lh2.t = ku2.c((short)48, 0);
        lh2.h = ku2.c((short)118, 0);
        lh2.j = ku2.c((short)119, 0);
        lh2.i = ku2.c((short)120, 0);
        lh2.k = ku2.c((short)121, 0);
        lh2.l = ku2.c((short)196, 0);
        lh2.m = ku2.c((short)197, 0);
        lh2.n = ku2.c((short)198, 0);
        lh2.o = ku2.c((short)199, 0);
        lh2.p = ku2.c((short)116, 0);
        lh2.q = ku2.c((short)115, 0);
        ct.a("[readFighterInf] addHealth " + lh2.p + " heatlPec  " + lh2.q);
        lh2.J = ku2.c((short)42, 0);
        lh2.H = ku2.c((short)43, 0);
        lh2.I = ku2.c((short)99, 10000);
        lh2.K = ku2.c((short)53, 0);
        lh2.L = ku2.c((short)76, 0);
        lh2.M = ku2.c((short)73, 0);
        lh2.N = ku2.c((short)74, 0);
        lh2.S = ku2.d((short)209);
        lh2.R = ku2.d((short)210);
        if (lh2.Q == null) {
            lh2.Q = lh2.G > 100 && lh2.G <= 200 ? "Đại Hiệp" : (lh2.G > 200 ? "Chiến Vương" : "Hào Kiệt");
        }
        lh2.ab = ku2.c((short)160, 0);
        lh2.Z = ku2.a((short)165, (byte)0) == 1;
        lh2.aa = ku2.a((short)166, (byte)0) == 1;
        int n6 = ku2.b((short)64);
        lh2.E = new lv[n6];
        if (n6 > 0) {
            n5 = ku2.a((short)64, 0);
            n4 = 0;
            while (n4 < n6) {
                n3 = ku2.a((short)64, n5);
                lh2.E[n4] = new lv(ku2.a(n5, -1));
                lh2.E[n4].f = ku2.a((short)67, n5, n3, -1);
                lh2.E[n4].e = ku2.a((short)68, n5, n3, -1);
                lv[] cfr_ignored_0 = lh2.E;
                ku2.a((short)89, n5, n3, (byte)-1);
                n5 = n3;
                ++n4;
            }
        }
        lh2.D = new ll[ku2.b((short)83)];
        n5 = ku2.b((short)83, 0);
        n4 = 0;
        while (n4 < lh2.D.length) {
            n3 = ku2.a((short)83, n5);
            lh2.D[n4] = ky.a(ku2, n5, n3, false);
            n5 = n3;
            ++n4;
        }
        lh2.F = this.k(ku2);
        n4 = ku2.b((short)90);
        n5 = ku2.b((short)90, 0);
        n3 = 0;
        while (n3 < n4) {
            n6 = ku2.a((short)90, n5);
            int n7 = ku2.a(n5, 0);
            n2 = ku2.a((short)91, n5, n6, (byte)0);
            df df2 = new df(n7);
            int n8 = ku2.a((short)93, n5, n6, 0);
            byte[] byArray = ku2.c((short)95, n5, n6);
            df2.d = new dg(n8, byArray);
            df2.f = new dg[]{df2.d};
            n8 = ku2.a((short)96, n5, n6, 0);
            byte[] byArray2 = ku2.c((short)98, n5, n6);
            df2.e = new dg(n8, byArray2);
            switch (n2) {
                case 0: {
                    lh2.U = df2;
                    break;
                }
                case 1: {
                    lh2.V = df2;
                    break;
                }
                case 2: {
                    lh2.W = df2;
                }
            }
            n5 = n6;
            ++n3;
        }
        n3 = ku2.b((short)158);
        lt[] ltArray = new lt[n3];
        n5 = ku2.b((short)158, 0);
        int n9 = 0;
        while (n9 < n3) {
            n2 = ku2.a((short)158, n5);
            ltArray[n9] = new lt();
            ku2.d((short)158, n5, n2);
            ltArray[n9].a = ku2.a((short)4, n5, n2, 0);
            ltArray[n9].b = ku2.a((short)157, n5, n2, 0L);
            n5 = n2;
            ++n9;
        }
        lh2.ac = ltArray;
        return lh2;
    }

    private void b(ku ku2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9 = ku2.c((short)23, 0);
        String string = ku2.d((short)9);
        if ((n9 & 1) != 0) {
            n8 = ku2.b((short)90);
            n7 = ku2.b((short)90, 0);
            n6 = ku2.a((short)15, (byte)0);
            n5 = ku2.a((short)16, (byte)0);
            df df2 = null;
            df df3 = null;
            df df4 = null;
            n4 = 0;
            while (n4 < n8) {
                n3 = ku2.a((short)90, n7);
                int n10 = ku2.a(n7, 0);
                n2 = ku2.a((short)91, n7, n3, (byte)0);
                df df5 = new df(n10);
                int n11 = ku2.a((short)93, n7, n3, 0);
                byte[] byArray = ku2.c((short)95, n7, n3);
                df5.d = new dg(n11, byArray);
                df5.f = new dg[]{df5.d};
                n11 = ku2.a((short)96, n7, n3, 0);
                byte[] byArray2 = ku2.c((short)98, n7, n3);
                df5.e = new dg(n11, byArray2);
                switch (n2) {
                    case 0: {
                        df2 = df5;
                        break;
                    }
                    case 1: {
                        df3 = df5;
                        break;
                    }
                    case 2: {
                        df4 = df5;
                    }
                }
                n7 = n3;
                ++n4;
            }
            if (this.b != null) {
                this.b.a(string, (byte)n6, (byte)n5, df2, df3, df4);
            }
        }
        if ((n9 & 2) != 0) {
            n8 = ku2.c((short)27, 0);
            n7 = ku2.c((short)118, 0);
            n6 = ku2.c((short)119, 0);
            n5 = ku2.c((short)120, 0);
            int n12 = ku2.c((short)121, 0);
            int n13 = ku2.c((short)196, 0);
            int n14 = ku2.c((short)197, 0);
            n4 = ku2.c((short)198, 0);
            n3 = ku2.c((short)199, 0);
            int n15 = ku2.c((short)116, 0);
            n2 = ku2.c((short)115, 0);
            if (this.b != null) {
                this.b.a(string, n8, n7, n6, n5, n12, n13, n14, n4, n3, n15, n2);
            }
        }
        if ((n9 & 4) != 0) {
            n8 = ku2.c((short)17, 0);
            n7 = ku2.c((short)47, 0);
            n6 = ku2.c((short)42, 0);
            n5 = ku2.c((short)73, 0);
            int n16 = ku2.c((short)74, 0);
            int n17 = ku2.c((short)43, 0);
            int n18 = ku2.c((short)99, 10000);
            if (this.b != null) {
                this.b.a(string, n8, n7, n6, n5, n16, n17, n18);
            }
        }
        if ((n9 & 8) != 0) {
            n8 = ku2.c((short)53, 0);
            n7 = ku2.c((short)76, 0);
            n6 = ku2.c((short)160, 0);
            n5 = ku2.c((short)27, 0);
            String string2 = ku2.d((short)209);
            String string3 = ku2.d((short)210);
            String string4 = n5 > 100 && n5 <= 200 ? "Đại Hiệp" : (n5 > 200 ? "Chiến Vương" : "Hào Kiệt");
            if (this.b != null) {
                this.b.a(string, n8, n7, n6, string2, string3, string4);
            }
        }
        if ((n9 & 0x10) != 0) {
            this.b.c(ku2.a((short)165, (byte)0) == 1);
            this.b.d(ku2.a((short)166, (byte)0) == 1);
        }
        if ((n9 & 0x20) != 0) {
            n8 = ku2.b((short)64);
            lv[] lvArray = new lv[n8];
            if (n8 > 0) {
                n6 = ku2.a((short)64, 0);
                n5 = 0;
                while (n5 < n8) {
                    int n19 = ku2.a((short)64, n6);
                    lvArray[n5] = new lv(ku2.a(n6, -1));
                    lvArray[n5].f = ku2.a((short)67, n6, n19, -1);
                    n6 = n19;
                    ++n5;
                }
            }
            if (this.b != null) {
                this.b.a(lvArray);
            }
        }
        if ((n9 & 0x40) != 0) {
            ll[] llArray = new ll[ku2.b((short)83)];
            int n20 = ku2.b((short)83, 0);
            n6 = 0;
            while (n6 < llArray.length) {
                n5 = ku2.a((short)83, n20);
                llArray[n6] = ky.a(ku2, n20, n5, false);
                n20 = n5;
                ++n6;
            }
            if (this.b != null) {
                this.b.a(string, llArray);
            }
        }
        if ((n9 & 0x100) != 0) {
            int n21 = ku2.b((short)158);
            lt[] ltArray = new lt[n21];
            n6 = ku2.b((short)158, 0);
            n5 = 0;
            while (n5 < n21) {
                int n22 = ku2.a((short)158, n6);
                ltArray[n5] = new lt();
                ku2.d((short)158, n6, n22);
                ltArray[n5].a = ku2.a((short)4, n6, n22, 0);
                ltArray[n5].b = ku2.a((short)157, n6, n22, 0L);
                n6 = n22;
                ++n5;
            }
            if (this.b != null) {
                this.b.a(ltArray);
            }
        }
        if (this.b != null) {
            this.b.U();
        }
    }

    private static ll a(ku ku2, int n2, int n3, boolean bl) {
        Object object = ku2.b(n2);
        byte by = ku2.a((short)84, n2, n3, (byte)0);
        object = new ll((String)object, by);
        v0.n = ku2.a((short)4, n2, n3, 0);
        ((ll)object).p = ku2.a((short)139, n2, n3, -1);
        ((ll)object).j = ku2.a((short)27, n2, n3, 0);
        if (bl) {
            ((ll)object).d = ku2.d((short)26, n2, n3);
            ((ll)object).i = ku2.a((short)135, n2, n3, -1);
            ((ll)object).f = ku2.a((short)15, n2, n3, (byte)7);
            ((ll)object).h = ku2.a((short)16, n2, n3, (byte)2);
            ((ll)object).m = ku2.a((short)138, n2, n3, (byte)0);
            ((ll)object).q = ku2.a((short)144, n2, n3, 0);
            ((ll)object).g = ku2.d((short)117, n2, n3);
            ((ll)object).s = ku2.a((short)156, n2, n3, (byte)-1);
            ((ll)object).t = ku2.a((short)85, n2, n3, (byte)1);
            ((ll)object).k = ku2.a((short)190, n2, n3, (byte)-1);
            lb lb2 = new lb();
            new lb().a = ku2.a((short)118, n2, n3, 0);
            lb2.b = ku2.a((short)119, n2, n3, 0);
            lb2.c = ku2.a((short)120, n2, n3, 0);
            lb2.d = ku2.a((short)121, n2, n3, 0);
            lb2.e = ku2.a((short)72, n2, n3, 0);
            lb2.f = ku2.a((short)71, n2, n3, 0);
            lb2.g = ku2.a((short)126, n2, n3, 0);
            lb2.h = ku2.a((short)124, n2, n3, 0);
            lb2.i = ku2.a((short)47, n2, n3, 0);
            lb2.j = ku2.a((short)200, n2, n3, 0);
            lb2.k = ku2.a((short)201, n2, n3, 0);
            lb2.l = ku2.a((short)202, n2, n3, 0);
            lb2.m = ku2.a((short)203, n2, n3, 0);
            lb2.n = ku2.a((short)204, n2, n3, 0);
            lb2.o = ku2.a((short)221, n2, n3, 0);
            ((ll)object).r = lb2;
        }
        return object;
    }

    private void c(ku ku2) {
        byte by = ku2.a((short)12, (byte)0);
        String string = ku2.d((short)131);
        int n2 = ku2.c((short)41, -1);
        int n3 = ku2.c((short)13, 0);
        int[] nArray = new int[ku2.b((short)4)];
        int n4 = ku2.b((short)4, 0);
        int n5 = 0;
        while (n5 < nArray.length) {
            nArray[n5] = ku2.a(n4, 0);
            ++n4;
            ++n5;
        }
        this.b.a(by == 2, string, n2, nArray, n3);
        n5 = ku2.c((short)170, -1);
        String[] stringArray = new String[ku2.b((short)1)];
        if (stringArray.length > 0) {
            int n6 = ku2.b((short)1, 0);
            n2 = 0;
            while (n2 < stringArray.length) {
                n3 = ku2.a((short)1, n6);
                stringArray[n2] = ku2.b(n6);
                n6 = n3;
                ++n2;
            }
        }
        this.b.a(n5, stringArray);
    }

    private void d(ku ku2) {
        try {
            jm jm2;
            byte by = ku2.a((short)12, (byte)0);
            Object object = ku2.d((short)20);
            if (by == 0) {
                jm jm3;
                int n2;
                jm[] jmArray = new jm[ku2.b((short)21)];
                int n3 = ku2.b((short)21, 0);
                int n4 = 0;
                while (n4 < jmArray.length) {
                    n2 = ku2.a((short)21, n3);
                    jm3 = new jm();
                    new jm().c = ku2.a(n3, -1);
                    jm3.b = ku2.d((short)26, n3, n2);
                    jm3.a = ku2.a((short)22, n3, n2, (byte)0);
                    jm3.d = ku2.a((short)102, n3, n2, 0);
                    jm3.e = ku2.a((short)103, n3, n2, 0);
                    jm3.f = ku2.a((short)104, n3, n2, 0);
                    jm3.g = ku2.a((short)105, n3, n2, 0);
                    jm3.h = ku2.a((short)101, n3, n2, (byte)0) == 1;
                    jm3.i = ku2.a((short)4, n3, n2, 0);
                    jmArray[n4] = jm3;
                    n3 = n2;
                    ++n4;
                }
                n4 = 0;
                while (n4 < jmArray.length - 1) {
                    n2 = n4 + 1;
                    while (n2 < jmArray.length) {
                        if (jmArray[n4].c > jmArray[n2].c) {
                            jm3 = jmArray[n4];
                            jmArray[n4] = jmArray[n2];
                            jmArray[n2] = jm3;
                        }
                        ++n2;
                    }
                    ++n4;
                }
                this.b.a((String)object, jmArray);
                return;
            }
            a a2 = new a();
            jn jn2 = new jn();
            new jn().a = object;
            jn2.b = ku2.d((short)26);
            jn2.c = ku2.c((short)41, 0);
            jn2.d = ku2.c((short)56, 0);
            jn2.e = ku2.c((short)57, 0);
            jn2.h = ku2.c((short)55);
            jn2.i = ku2.c((short)54);
            jn2.j = ku2.c((short)61);
            jn2.k = ku2.c((short)60, 0);
            jn2.f = ku2.c((short)63, 0);
            jn2.g = ku2.c((short)29, 0);
            a2.a(new Integer(jn2.k));
            a2.a(new Integer(jn2.f));
            a2.a(new Integer(jn2.g));
            jm[] jmArray = new jm[ku2.b((short)21)];
            int n5 = ku2.b((short)21, 0);
            int n6 = 0;
            while (n6 < jmArray.length) {
                int n7 = ku2.a((short)21, n5);
                jm2 = new jm();
                new jm().c = ku2.a(n5, -1);
                jm2.b = ku2.d((short)26, n5, n7);
                jm2.a = ku2.a((short)22, n5, n7, (byte)0);
                jm2.d = ku2.a((short)102, n5, n7, 0);
                jm2.e = ku2.a((short)103, n5, n7, 0);
                jm2.f = ku2.a((short)104, n5, n7, 0);
                jm2.g = ku2.a((short)105, n5, n7, 0);
                jm2.h = ku2.a((short)101, n5, n7, (byte)0) == 1;
                jm2.i = ku2.a((short)4, n5, n7, 0);
                if (jm2.i != 0) {
                    a2.a(new Integer(jm2.i));
                }
                jmArray[n6] = jm2;
                n5 = n7;
                ++n6;
            }
            n6 = 0;
            while (n6 < jmArray.length - 1) {
                int n8 = n6 + 1;
                while (n8 < jmArray.length) {
                    if (jmArray[n6].c > jmArray[n8].c) {
                        jm2 = jmArray[n6];
                        jmArray[n6] = jmArray[n8];
                        jmArray[n8] = jm2;
                    }
                    ++n8;
                }
                ++n6;
            }
            jn2.l = jmArray;
            n6 = ku2.a(ku2.b((short)6, 0), 0);
            object = new int[a2.d()];
            int n9 = 0;
            while (n9 < ((Object)object).length) {
                object[n9] = (Integer)a2.b(n9);
                ++n9;
            }
            int[] nArray = new int[ku2.b((short)154)];
            if (nArray.length > 0) {
                n5 = ku2.b((short)154, 0);
                int n10 = 0;
                while (n10 < nArray.length) {
                    int n11 = ku2.a((short)154, n5);
                    nArray[n10] = ku2.a(n5, 0);
                    n5 = n11;
                    ++n10;
                }
            }
            int n12 = ku2.a(ku2.b((short)6, 1), 0);
            this.b.a(jn2, (int[])object, n6, nArray, n12);
            return;
        }
        catch (OutOfMemoryError outOfMemoryError) {
            return;
        }
    }

    private void e(ku ku2) {
        Object[] objectArray;
        int n2;
        int n3;
        int n4;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = ku2.b((short)90);
        df[] dfArray = new df[n11];
        byte[] byArray = new byte[n11];
        int n12 = ku2.b((short)90, 0);
        int n13 = 0;
        while (n13 < n11) {
            n4 = ku2.a((short)90, n12);
            n3 = ku2.a(n12, 0);
            byArray[n13] = ku2.a((short)91, n12, n4, (byte)0);
            df df2 = new df(n3);
            new df(n3).b = ku2.d((short)92, n12, n4);
            df2.c = ku2.a((short)16, n12, n4, (byte)0);
            n2 = ku2.a((short)93, n12, n4, 0);
            String string = ku2.d((short)94, n12, n4);
            objectArray = ku2.c((short)95, n12, n4);
            df2.d = new dg(n2, (byte[])objectArray);
            df2.d.b = string;
            df2.e = df2.d;
            df2.f = new dg[ku2.a((short)96, n12, n4)];
            df2.f[0] = df2.d;
            n12 = ku2.a((short)96, n12);
            int n14 = 1;
            int n15 = 0;
            while (n15 < df2.f.length) {
                int n16 = ku2.a((short)96, n12);
                int n17 = ku2.a(n12, 0);
                String string2 = ku2.d((short)97, n12, n16);
                byte[] byArray2 = ku2.c((short)98, n12, n16);
                if (n17 != n2) {
                    df2.f[n14] = new dg(n17, byArray2);
                    df2.f[n14].b = string2;
                    ++n14;
                }
                n12 = n16;
                ++n15;
            }
            if (df2.c == 0) {
                switch (byArray[n13]) {
                    case 0: {
                        ++n6;
                        break;
                    }
                    case 1: {
                        ++n5;
                        break;
                    }
                    case 2: {
                        ++n7;
                    }
                }
            } else {
                switch (byArray[n13]) {
                    case 0: {
                        ++n9;
                        break;
                    }
                    case 1: {
                        ++n8;
                        break;
                    }
                    case 2: {
                        ++n10;
                    }
                }
            }
            dfArray[n13] = df2;
            n12 = n4;
            ++n13;
        }
        n13 = 0;
        n4 = 0;
        n3 = 0;
        int n18 = 0;
        n2 = 0;
        int n19 = 0;
        objectArray = new df[n5];
        df[] dfArray2 = new df[n6];
        df[] dfArray3 = new df[n7];
        df[] dfArray4 = new df[n8];
        df[] dfArray5 = new df[n9];
        df[] dfArray6 = new df[n10];
        int n20 = 0;
        while (n20 < dfArray.length) {
            if (dfArray[n20].c == 0) {
                switch (byArray[n20]) {
                    case 0: {
                        dfArray2[n4++] = dfArray[n20];
                        break;
                    }
                    case 1: {
                        objectArray[n13++] = dfArray[n20];
                        break;
                    }
                    case 2: {
                        dfArray3[n3++] = dfArray[n20];
                    }
                }
            } else {
                switch (byArray[n20]) {
                    case 0: {
                        dfArray5[n2++] = dfArray[n20];
                        break;
                    }
                    case 1: {
                        dfArray4[n18++] = dfArray[n20];
                        break;
                    }
                    case 2: {
                        dfArray6[n19++] = dfArray[n20];
                    }
                }
            }
            ++n20;
        }
        this.b.a(dfArray2, (df[])objectArray, dfArray3, dfArray5, dfArray4, dfArray6);
    }

    private void f(ku ku2) {
        String string = ku2.d((short)20);
        byte by = ku2.a((short)40, (byte)3);
        jo[] joArray = new jo[ku2.b((short)9)];
        int n2 = ku2.b((short)9, 0);
        int n3 = 0;
        while (n3 < joArray.length) {
            int n4 = ku2.a((short)9, n2);
            jo jo2 = new jo();
            new jo().a = ku2.b(n2);
            jo2.b = ku2.d((short)26, n2, n4);
            jo2.d = ku2.a((short)27, n2, n4, 0);
            jo2.c = ku2.a((short)15, n2, n4, (byte)0);
            jo2.e = ku2.a((short)129, n2, n4, 0);
            jo2.f = ku2.a((short)106, n2, n4, 0);
            jo2.g = ku2.a((short)107, n2, n4, (byte)0);
            joArray[n3] = jo2;
            n2 = n4;
            ++n3;
        }
        switch (by) {
            case 0: {
                this.b.b(joArray, string);
                return;
            }
            case 1: {
                this.b.c(joArray, string);
                return;
            }
            case 3: {
                this.b.a(joArray, string);
            }
        }
    }

    private void g(ku ku2) {
        ns[] nsArray = new ns[ku2.b((short)77)];
        int n2 = ku2.b((short)77, 0);
        int n3 = 0;
        while (n3 < nsArray.length) {
            int n4 = ku2.a((short)77, n2);
            String string = ku2.b(n2);
            String string2 = ku2.d((short)26, n2, n4);
            n2 = ku2.a((short)100, n2, n4, (byte)0) == 1 ? 1 : 0;
            nsArray[n3] = new ns(string, string2, "", 0L);
            nsArray[n3].e = n2;
            n2 = n4;
            ++n3;
        }
        this.b.a(nsArray);
    }

    private void h(ku ku2) {
        String string = ku2.d((short)192);
        int n2 = ku2.b((short)9);
        if (n2 > 0) {
            doo[] dooArray = new doo[n2];
            int n3 = ku2.b((short)9, 0);
            try {
                int n4 = 0;
                while (n4 < dooArray.length) {
                    int n5 = ku2.a((short)9, n3);
                    dooArray[n4] = ky.d(ku2, n3, n5);
                    n3 = n5;
                    ++n4;
                }
                this.b.a(string, dooArray);
                return;
            }
            catch (OutOfMemoryError outOfMemoryError) {
                ku2.c = null;
                System.gc();
            }
        }
    }

    private void i(ku ku2) {
        byte by = ku2.a((short)193, (byte)0);
        int n2 = ku2.b((short)192, 0);
        int n3 = ku2.b((short)192);
        lr[] lrArray = new lr[n3];
        int n4 = 0;
        while (n4 < n3) {
            int n5;
            int n6 = n5 = ku2.a((short)192, n2);
            int n7 = n2;
            ku ku3 = ku2;
            String string = ku3.b(n7);
            String string2 = ku3.d((short)26, n7, n6);
            int n8 = ku3.a((short)106, n7, n6, 0);
            String string3 = ku3.d((short)1, n7, n6);
            byte by2 = ku3.a((short)101, n7, n6, (byte)0);
            n2 = ku3.a((short)143, n7, n6, (byte)0);
            lrArray[n4] = new lr(string, string2, string3, n8, by2, (byte)n2);
            n2 = n5;
            ++n4;
        }
        if (by != 0) {
            this.b.b(lrArray);
            return;
        }
        this.b.a(lrArray);
    }

    private static doo d(ku ku2, int n2, int n3) {
        doo doo2 = new doo();
        new doo().a = ku2.b(n2);
        doo2.b = ku2.a((short)27, n2, n3, 0);
        doo2.c = ku2.a((short)24, n2, n3, (byte)0);
        doo2.d = ku2.a((short)160, n2, n3, 0);
        doo2.f = ku2.a((short)132, n2, n3, 0);
        return doo2;
    }

    private void j(ku ku2) {
        ct.a("[processPrepareData]======================================");
        lh lh2 = null;
        lh lh3 = null;
        byte by = ku2.a((short)111, (byte)0);
        byte by2 = ku2.a((short)140, (byte)0);
        boolean bl = false;
        int n2 = ku2.b((short)9, 0);
        int n3 = 0;
        while (n3 < 2) {
            int n4 = ku2.a((short)9, n2);
            lh lh4 = this.c(ku2, n2, n4);
            if (by2 != 9) {
                if (lh4.b.equals(go.e)) {
                    lh2 = lh4;
                    if (lh3 == null) {
                        bl = true;
                    }
                } else {
                    lh3 = lh4;
                }
            } else if (lh2 == null) {
                lh2 = lh4;
                ks.i = lh4.b;
            } else {
                lh3 = lh4;
            }
            n2 = n4;
            ++n3;
        }
        ks.a().e = ku2.d((short)28);
        byte[] byArray = ku2.c((short)30);
        byte[] byArray2 = null;
        byte[] byArray3 = null;
        int n5 = ku2.b((short)35);
        int n6 = 0;
        while (n6 < n5) {
            byte[] byArray4 = ku2.a(ku2.b((short)35, n6));
            if (byArray2 == null) {
                byArray2 = byArray4;
            } else {
                byArray3 = byArray4;
            }
            ++n6;
        }
        n6 = ku2.a((short)70, (byte)0);
        this.b.a(lh2, lh3, bl, byArray, byArray2, byArray3, n6, by, by2);
    }

    private lm[] k(ku ku2) {
        return ky.a(ku2, 0);
    }

    private static lm[] a(ku ku2, int n2) {
        lm[] lmArray = new lm[ku2.b((short)114) - n2];
        n2 = ku2.b((short)114, n2);
        int n3 = 0;
        while (n3 < lmArray.length) {
            int n4 = ku2.a((short)114, n2);
            int n5 = ku2.a(n2, 0);
            lmArray[n3] = new lm(n5);
            lmArray[n3].b = ku2.d((short)26, n2, n4);
            lmArray[n3].d = ku2.d((short)117, n2, n4);
            lmArray[n3].g = ku2.a((short)106, n2, n4, 0);
            lmArray[n3].e = ku2.a((short)122, n2, n4, (byte)-1);
            lmArray[n3].f = ku2.a((short)123, n2, n4, (byte)-1);
            lmArray[n3].j = ku2.a((short)4, n2, n4, 0);
            lmArray[n3].h = ku2.a((short)145, n2, n4, 0);
            lmArray[n3].i = ku2.a((short)106, n2, n4, 0);
            lmArray[n3].l = ku2.a((short)82, n2, n4, -1);
            lmArray[n3].k = ku2.a((short)132, n2, n4, 0L);
            lmArray[n3].m = ku2.a((short)85, n2, n4, (byte)1);
            n2 = n4;
            ++n3;
        }
        return lmArray;
    }

    private void l(ku ku2) {
        int n2;
        int n3 = ku2.c((short)41, 0);
        byte[] byArray = ku2.c((short)30);
        byte[] byArray2 = ku2.c((short)35);
        byte[] byArray3 = ku2.a(ku2.b((short)35, 1));
        lh[] lhArray = new lh[1];
        lh[] lhArray2 = new lh[1];
        int n4 = ku2.b((short)9, 0);
        int n5 = 0;
        while (n5 < 2) {
            n2 = ku2.a((short)9, n4);
            lh lh2 = this.b(ku2, n4, n2);
            if (oq.o != 9) {
                if (lh2.b.equals(go.e)) {
                    lhArray[0] = lh2;
                } else {
                    lhArray2[0] = lh2;
                }
            } else if (lhArray[0] == null) {
                lhArray[0] = lh2;
            } else {
                lhArray2[0] = lh2;
            }
            n4 = n2;
            ++n5;
        }
        ku2.a((short)133, (byte)0);
        int n6 = n2 = ku2.c((short)32) != null ? 1 : 0;
        if (this.c != null) {
            this.c.a(byArray, byArray2, byArray3, lhArray, lhArray2, n2 != 0, n3);
        }
    }

    private void a(ku ku2, nq nq2) {
        if (this.c == null) {
            return;
        }
        int n2 = ku2.b((short)35);
        nq2.g = new byte[n2][];
        int n3 = 0;
        while (n3 < n2) {
            byte[] byArray = ku2.a(ku2.b((short)35, n3));
            if (byArray != null) {
                nq2.g[n3] = byArray;
            }
            ++n3;
        }
        byte[] byArray = ku2.c((short)30);
        if (byArray != null) {
            nq2.h = byArray;
        }
        ky.b(ku2, nq2);
        nq2.D = ku2.a((short)52, (byte)0);
        nq2.F = ku2.a((short)172, (byte)0);
        nq2.C = ku2.a((short)133, (byte)0);
        boolean bl = ku2.c((short)32) != null;
        nq2.a = ku2.d((short)62);
        byte[] byArray2 = ku2.c((short)39);
        if (byArray2 != null) {
            this.c.a(nq2);
            nq2.E = true;
            this.a(ku2, byArray2[0], nq2.b);
            return;
        }
        nq2.d = bl;
        this.c.a(nq2);
    }

    private static void b(ku ku2, nq nq2) {
        int n2 = ku2.b((short)9);
        int n3 = ku2.b((short)9, 0);
        nq2.f = new nl[n2];
        int n4 = 0;
        while (n4 < n2) {
            int n5 = ku2.a((short)9, n3);
            String string = ku2.b(n3);
            int n6 = ku2.a((short)46, n3, n5, -1);
            byte by = ku2.a((short)19, n3, n5, (byte)0);
            int n7 = ku2.a((short)17, n3, n5, -1);
            int n8 = ku2.a((short)18, n3, n5, -1);
            n3 = ku2.a((short)45, n3, n5, -1);
            nq2.f[n4] = new nl(string, n6, n7, n8, n3, by);
            n3 = n5;
            ct.a("" + nq2.f[n4]);
            ++n4;
        }
    }

    private void m(ku ku2) {
        int n2;
        int n3 = ku2.c((short)41, 0);
        nq nq2 = new nq(n3, 5);
        new nq(n3, 5).i = ku2.a((short)44, 0L);
        int n4 = ku2.a(ku2.b((short)64, 0), -1);
        int n5 = ku2.a(ku2.b((short)75, 0), 0);
        byte[] byArray = new byte[]{};
        byte[] byArray2 = new byte[]{};
        int n6 = ku2.b((short)50);
        if (n6 > 0) {
            byArray = new byte[n6];
            byArray2 = new byte[n6];
            int n7 = ku2.b((short)50, 0);
            int n8 = 0;
            while (n8 < n6) {
                n2 = ku2.a((short)50, n7);
                byArray[n8] = (byte)ku2.a(n7, -1);
                byArray2[n8] = (byte)ku2.a((short)51, n7, n2, -1);
                n7 = n2;
                ++n8;
            }
        }
        byte[] byArray3 = new byte[]{};
        byte[] byArray4 = new byte[]{};
        n2 = ku2.b((short)33);
        if (n2 > 0) {
            byArray3 = new byte[n2];
            byArray4 = new byte[n2];
            n6 = ku2.b((short)33, 0);
            int n9 = 0;
            while (n9 < n2) {
                int n10 = ku2.a((short)33, n6);
                byArray3[n9] = (byte)ku2.a(n6, -1);
                byArray4[n9] = (byte)ku2.a((short)34, n6, n10, -1);
                n6 = n10;
                ++n9;
            }
        }
        byte[] byArray5 = byArray3;
        byte[] byArray6 = byArray4;
        byArray4 = byArray2;
        byArray3 = byArray;
        byte[] byArray7 = byArray6;
        byArray2 = byArray5;
        int n11 = n5;
        n5 = n4;
        nq nq3 = nq2;
        nq2.n = n5;
        nq3.r = n11;
        nq3.s = byArray2;
        nq3.o = byArray7;
        nq3.p = byArray4;
        nq3.q = byArray3;
        this.a(ku2, nq2);
    }

    private void a(ku object, byte by, int n2) {
        nq nq2 = new nq(n2, 8);
        int n3 = ((ku)object).c((short)42, 0);
        int n4 = ((ku)object).c((short)43, 0);
        int n5 = ((ku)object).c((short)110, 0);
        int[] nArray = new int[((ku)object).b((short)73)];
        int[] nArray2 = new int[nArray.length];
        int n6 = 0;
        while (n6 < nArray2.length) {
            nArray[n6] = ((ku)object).a(((ku)object).b((short)73, n6), -1);
            nArray2[n6] = ((ku)object).a(((ku)object).b((short)74, n6), -1);
            ++n6;
        }
        ll[] llArray = new ll[((ku)object).b((short)83)];
        int n7 = ((ku)object).b((short)83, 0);
        int n8 = 0;
        while (n8 < llArray.length) {
            int n9 = ((ku)object).a((short)83, n7);
            llArray[n8] = ky.a((ku)object, n7, n9, true);
            n7 = n9;
            ++n8;
        }
        lm[] lmArray = object;
        object = this;
        lm[] lmArray2 = ky.a((ku)lmArray, 0);
        if (this.c != null) {
            int n10 = n5;
            lmArray = lmArray2;
            boolean bl = false;
            n5 = n4;
            n4 = n10;
            nq nq3 = nq2;
            nq2.t = by;
            nq3.A = llArray;
            nq3.v = n4;
            nq3.u = n3;
            nq3.w = n5;
            nq3.x = 0;
            nq3.y = nArray;
            nq3.z = nArray2;
            nq3.B = lmArray;
            this.c.a(nq2);
        }
    }

    private void n(ku object) {
        nt[] ntArray = ((ku)object).d((short)77);
        Object object2 = ((ku)object).d((short)26);
        String string = ((ku)object).d((short)79);
        long l = ((ku)object).a((short)132, 0L);
        boolean bl = ((ku)object).a((short)100, (byte)0) == 0;
        object2 = new ns((String)ntArray, (String)object2, string, l);
        int n2 = ((ku)object).b((short)80);
        if (n2 > 0) {
            nt[] ntArray2 = new nt[n2];
            int n3 = ((ku)object).b((short)80, 0);
            int n4 = 0;
            while (n4 < ntArray2.length) {
                int n5 = ((ku)object).a((short)80, n3);
                int n6 = ((ku)object).a(n3, -1);
                String string2 = ((ku)object).d((short)81, n3, n5);
                ntArray2[n4] = new nt(n6, string2, null, (String)ntArray);
                n3 = n5;
                ++n4;
            }
            ntArray = ntArray2;
            object = object2;
            ((ns)object2).f = ntArray;
        }
        this.b.a((ns)object2, bl);
    }

    private static void o(ku object) {
        nt[] ntArray = ((ku)object).d((short)77);
        ns ns2 = new ns((String)ntArray, "", "", 0L);
        int n2 = ((ku)object).b((short)80);
        if (n2 > 0) {
            nt[] ntArray2 = new nt[n2];
            int n3 = ((ku)object).b((short)80, 0);
            int n4 = 0;
            while (n4 < ntArray2.length) {
                int n5 = ((ku)object).a((short)80, n3);
                int n6 = ((ku)object).a(n3, -1);
                String string = ((ku)object).d((short)81, n3, n5);
                ntArray2[n4] = new nt(n6, string, null, (String)ntArray);
                n3 = n5;
                ++n4;
            }
            ntArray = ntArray2;
            object = ns2;
            ns2.f = ntArray;
        }
        nu.b(ns2);
    }

    private void p(ku ku2) {
        Object object = ku2.d((short)77);
        String[] stringArray = ku2.d((short)26);
        String[] stringArray2 = new String[ku2.b((short)1)];
        int n2 = ku2.b((short)1, 0);
        int n3 = 0;
        while (n3 < stringArray2.length) {
            int n4 = ku2.a((short)1, n2);
            stringArray2[n3] = ku2.b(n2);
            n2 = n4;
            ++n3;
        }
        ns ns2 = new ns((String)object, (String)stringArray, "", 0L);
        stringArray = stringArray2;
        object = ns2;
        ns2.g = stringArray;
        nu.a(ns2);
        String string = ku2.d((short)149);
        this.b.a(string, (byte)0);
    }

    private void q(ku ku2) {
        int n2 = ku2.b((short)64);
        lw[] lwArray = new lw[n2];
        int n3 = ku2.b((short)64, 0);
        int n4 = 0;
        while (n4 < n2) {
            int n5;
            int n6 = ku2.a((short)64, n3);
            lwArray[n4] = new lw(ku2.a(n3, 0));
            lwArray[n4].b = ku2.d((short)26, n3, n6);
            lwArray[n4].d = ku2.a((short)136, n3, n6, 0);
            lx[] lxArray = new lx[ku2.a((short)67, n3, n6)];
            n3 = ku2.a((short)67, n3);
            int n7 = 0;
            while (n7 < lxArray.length) {
                n5 = ku2.a((short)67, n3);
                lxArray[n7] = new lx(lwArray[n4].a);
                lxArray[n7].a = ku2.a(n3, 0);
                lxArray[n7].e = ku2.d((short)66, n3, n5);
                lxArray[n7].c = ku2.a((short)76, n3, n5, 0);
                lxArray[n7].b = ku2.a((short)135, n3, n5, 0);
                lxArray[n7].d = ku2.a((short)68, n3, n5, 0);
                n3 = n5;
                ++n7;
            }
            n7 = 0;
            while (n7 < lxArray.length) {
                n5 = n7 + 1;
                while (n5 < lxArray.length) {
                    if (lxArray[n7].a > lxArray[n5].a) {
                        lx lx2 = lxArray[n7];
                        lxArray[n7] = lxArray[n5];
                        lxArray[n5] = lx2;
                    }
                    ++n5;
                }
                ++n7;
            }
            lwArray[n4].c = lxArray;
            n3 = n6;
            ++n4;
        }
        this.b.a(lwArray);
    }

    private void r(ku ku2) {
        int n2;
        ku2.d((short)9);
        ll[] llArray = new ll[ku2.b((short)83)];
        if (llArray.length > 0) {
            int n3 = ku2.b((short)83, 0);
            int n4 = 0;
            while (n4 < llArray.length) {
                n2 = ku2.a((short)83, n3);
                if (n2 < 0) {
                    n2 = ku2.a((short)114, n3);
                }
                llArray[n4] = ky.a(ku2, n3, n2, true);
                n3 = n2;
                ++n4;
            }
        }
        ku ku3 = ku2;
        lm[] lmArray = this;
        lmArray = ky.a(ku3, 0);
        int n5 = ku2.c((short)86, 0);
        n2 = ku2.c((short)145, 0);
        this.b.a(llArray, lmArray, n5, n2);
    }

    private void s(ku ku2) {
        int n2 = ku2.a((short)147, (byte)-1);
        switch (n2) {
            case 0: {
                String string = ku2.d((short)9);
                String string2 = ku2.d((short)150);
                ks.a().g.a(string2);
                this.b.k(string);
                return;
            }
            case 1: {
                String string = ku2.d((short)9);
                String string3 = ku2.d((short)150);
                byte by = ku2.a((short)31, (byte)-1);
                if (by == 0) {
                    this.b.m(string);
                    return;
                }
                this.b.n(string);
                ks.a().f = string3;
                ks.j = 0;
                return;
            }
            case 4: {
                Object object = ku2.d((short)9);
                ks.j = ku2.c((short)41, 0);
                if (((String)object).equals(ks.a().c)) {
                    this.b.K();
                    return;
                }
                int n3 = ku2.c((short)106, -1);
                String string = ku2.d((short)83);
                if (n3 > 0) {
                    object = ky.a(ku2, ku2.b((short)83, 0), -1, true);
                    this.b.b((ll)object);
                    return;
                }
                this.b.j(string);
                return;
            }
            case 3: {
                Object object = ku2.d((short)9);
                ks.j = ku2.c((short)41, 0);
                if (((String)object).equals(ks.a().c)) {
                    this.b.K();
                    return;
                }
                ku ku3 = ku2;
                object = this;
                lm[] lmArray = ky.a(ku3, 0);
                int n4 = ku2.c((short)106, -1);
                if (n4 > 0) {
                    this.b.a(lmArray[0], n4);
                    return;
                }
                this.b.a(lmArray[0]);
                return;
            }
            case 2: {
                String string = ku2.d((short)9);
                ks.j = ku2.c((short)41, 0);
                if (string.equals(ks.a().c)) {
                    this.b.K();
                    return;
                }
                long l = ku2.a((short)132, 0L);
                this.b.l((int)l);
                return;
            }
            case 5: {
                String string = ku2.d((short)9);
                this.b.i(string);
                return;
            }
            case 6: {
                int n5 = (int)ku2.a((short)132, -1L);
                ll[] llArray = new ll[ku2.b((short)83)];
                if (llArray.length > 0) {
                    n2 = ku2.b((short)83, 0);
                    int n6 = 0;
                    while (n6 < llArray.length) {
                        int n7 = ku2.a((short)83, n2);
                        llArray[n6] = ky.a(ku2, n2, n7, true);
                        n2 = n7;
                        ++n6;
                    }
                }
                ku ku4 = ku2;
                lm[] lmArray = this;
                lmArray = ky.a(ku4, 0);
                this.b.a(llArray, lmArray, n5);
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
                String string = ku2.d((short)9);
                this.b.l(string);
            }
        }
    }

    private void t(ku ku2) {
        int n2 = ku2.b((short)147);
        if (n2 > 0) {
            int[] nArray = new int[n2];
            String[] stringArray = new String[n2];
            int n3 = ku2.b((short)147, 0);
            int n4 = 0;
            while (n4 < nArray.length) {
                int n5 = ku2.a((short)147, n3);
                nArray[n4] = ku2.a(n3, (byte)0);
                stringArray[n4] = ku2.d((short)168, n3, n5);
                n3 = n5;
                ++n4;
            }
            this.b.a(nArray, stringArray);
        }
    }

    private static lb e(ku ku2, int n2, int n3) {
        lb lb2 = new lb();
        new lb().a = ku2.a((short)118, n2, n3, 0);
        lb2.b = ku2.a((short)119, n2, n3, 0);
        lb2.c = ku2.a((short)120, n2, n3, 0);
        lb2.d = ku2.a((short)121, n2, n3, 0);
        lb2.e = ku2.a((short)72, n2, n3, 0);
        lb2.f = ku2.a((short)71, n2, n3, 0);
        lb2.g = ku2.a((short)126, n2, n3, 0);
        lb2.h = ku2.a((short)124, n2, n3, 0);
        lb2.i = ku2.a((short)47, n2, n3, 0);
        lb2.j = ku2.a((short)200, n2, n3, 0);
        lb2.k = ku2.a((short)201, n2, n3, 0);
        lb2.l = ku2.a((short)202, n2, n3, 0);
        lb2.m = ku2.a((short)203, n2, n3, 0);
        lb2.n = ku2.a((short)204, n2, n3, 0);
        lb2.o = ku2.a((short)221, n2, n3, 0);
        return lb2;
    }

    private lq[] u(ku ku2) {
        lq[] lqArray = new lq[ku2.b((short)175)];
        int n2 = ku2.b((short)175, 0);
        int n3 = 0;
        while (n3 < lqArray.length) {
            int n4 = ku2.a((short)175, n2);
            lq lq2 = new lq();
            new lq().b = ku2.b(n2);
            lq2.c = ku2.a((short)159, n2, n4, (byte)-1);
            lq2.f = ku2.d((short)62, n2, n4);
            lq2.d = ku2.a((short)145, n2, n4, -1);
            lq2.g = ku2.a((short)157, n2, n4, 0L);
            switch (lq2.c) {
                case 0: {
                    byte by = ku2.a((short)84, n2, n4, (byte)0);
                    Object object = new ll("", by);
                    new ll("", by).b = ku2.a(n2, 0);
                    ((ll)object).n = ku2.a((short)4, n2, n4, 0);
                    ((ll)object).j = ku2.a((short)27, n2, n4, 0);
                    ((ll)object).l = ku2.a((short)145, n2, n4, 0);
                    ((ll)object).d = ku2.d((short)26, n2, n4);
                    ((ll)object).i = ku2.a((short)135, n2, n4, -1);
                    ((ll)object).f = ku2.a((short)15, n2, n4, (byte)7);
                    ((ll)object).h = ku2.a((short)16, n2, n4, (byte)0);
                    ((ll)object).m = ku2.a((short)138, n2, n4, (byte)0);
                    ((ll)object).p = ku2.a((short)139, n2, n4, 0);
                    ((ll)object).q = ku2.a((short)144, n2, n4, 0);
                    ((ll)object).g = ku2.d((short)117, n2, n4);
                    ((ll)object).k = ku2.a((short)190, n2, n4, (byte)-1);
                    ((ll)object).t = ku2.a((short)85, n2, n4, (byte)1);
                    ((ll)object).r = ky.e(ku2, n2, n4);
                    lq2.e = object;
                    break;
                }
                case 1: {
                    int n5 = ku2.a((short)114, n2, n4, -1);
                    Object object = new lm(n5);
                    new lm(n5).b = ku2.d((short)26, n2, n4);
                    ((ld)object).d = ku2.d((short)117, n2, n4);
                    ((lm)object).g = ku2.a((short)106, n2, n4, 0);
                    ((lm)object).e = ku2.a((short)122, n2, n4, (byte)-1);
                    ((lm)object).f = ku2.a((short)123, n2, n4, (byte)-1);
                    ((lm)object).j = ku2.a((short)4, n2, n4, 0);
                    ((lm)object).h = ku2.a((short)145, n2, n4, 0);
                    ((lm)object).i = ku2.a((short)106, n2, n4, 0);
                    ((lm)object).l = ku2.a((short)82, n2, n4, -1);
                    ((lm)object).k = ku2.a((short)132, n2, n4, 0L);
                    ((lm)object).m = ku2.a((short)85, n2, n4, (byte)1);
                    lq2.e = object;
                    break;
                }
                case 99: {
                    int n6 = ku2.a((short)155, n2, n4, -1);
                    Object object = new lu(n6);
                    new lu(n6).a = ku2.d((short)26, n2, n4);
                    ((lu)object).b = ku2.d((short)1, n2, n4);
                    ((lu)object).c = ku2.a((short)145, n2, n4, 0);
                    lq2.e = object;
                }
            }
            lqArray[n3] = lq2;
            n2 = n4;
            ++n3;
        }
        return lqArray;
    }

    private void v(ku lqArray) {
        int n2 = lqArray.a((short)147, (byte)-1);
        switch (n2) {
            case 0: {
                lf[] lfArray = new lf[lqArray.b((short)152)];
                if (lfArray.length > 0) {
                    int n3 = lqArray.b((short)152, 0);
                    int n4 = 0;
                    while (n4 < lfArray.length) {
                        int n5 = lqArray.a((short)152, n3);
                        byte by = lqArray.a(n3, (byte)-1);
                        String string = lqArray.d((short)26, n3, n5);
                        n3 = lqArray.a((short)106, n3, n5, 0);
                        lfArray[n4] = new lf(by, string, n3);
                        n3 = n5;
                        ++n4;
                    }
                }
                this.b.a(lfArray);
                return;
            }
            case 1: {
                byte by = lqArray.a((short)152, (byte)-1);
                ku ku2 = lqArray;
                lqArray = this;
                lqArray = new lq[ku2.b((short)153)];
                int n6 = ku2.b((short)153, 0);
                int n7 = 0;
                while (n7 < lqArray.length) {
                    int n8 = ku2.a((short)153, n6);
                    lq lq2 = new lq();
                    new lq().a = ku2.a(n6, -1);
                    lq2.c = ku2.a((short)159, n6, n8, (byte)-1);
                    lq2.d = ku2.a((short)145, n6, n8, -1);
                    switch (lq2.c) {
                        case 0: {
                            byte by2 = ku2.a((short)84, n6, n8, (byte)0);
                            Object object = new ll("", by2);
                            new ll("", by2).b = ku2.a(n6, 0);
                            ((ll)object).n = ku2.a((short)4, n6, n8, 0);
                            ((ll)object).l = ku2.a((short)145, n6, n8, 0);
                            ((ll)object).j = ku2.a((short)27, n6, n8, 0);
                            ((ll)object).d = ku2.d((short)26, n6, n8);
                            ((ll)object).i = ku2.a((short)135, n6, n8, -1);
                            ((ll)object).f = ku2.a((short)15, n6, n8, (byte)7);
                            ((ll)object).h = ku2.a((short)16, n6, n8, (byte)0);
                            ((ll)object).m = ku2.a((short)138, n6, n8, (byte)0);
                            ((ll)object).q = ku2.a((short)144, n6, n8, 0);
                            ((ll)object).g = ku2.d((short)117, n6, n8);
                            ((ll)object).k = ku2.a((short)190, n6, n8, (byte)-1);
                            ((ll)object).t = ku2.a((short)85, n6, n8, (byte)1);
                            ((ll)object).r = ky.e(ku2, n6, n8);
                            lq2.e = object;
                            break;
                        }
                        case 1: {
                            int n9 = ku2.a((short)114, n6, n8, -1);
                            Object object = new lm(n9);
                            new lm(n9).b = ku2.d((short)26, n6, n8);
                            ((ld)object).d = ku2.d((short)117, n6, n8);
                            ((lm)object).g = ku2.a((short)106, n6, n8, 0);
                            ((lm)object).e = ku2.a((short)122, n6, n8, (byte)-1);
                            ((lm)object).f = ku2.a((short)123, n6, n8, (byte)-1);
                            ((lm)object).j = ku2.a((short)4, n6, n8, 0);
                            ((lm)object).h = ku2.a((short)145, n6, n8, 0);
                            ((lm)object).i = ku2.a((short)106, n6, n8, 0);
                            ((lm)object).l = ku2.a((short)82, n6, n8, -1);
                            ((lm)object).k = ku2.a((short)132, n6, n8, 0L);
                            ((lm)object).m = ku2.a((short)85, n6, n8, (byte)1);
                            lq2.e = object;
                            break;
                        }
                        case 99: {
                            int n10 = ku2.a((short)155, n6, n8, -1);
                            Object object = new lu(n10);
                            new lu(n10).a = ku2.d((short)26, n6, n8);
                            ((lu)object).b = ku2.d((short)1, n6, n8);
                            ((lu)object).c = ku2.a((short)145, n6, n8, 0);
                            lq2.e = object;
                        }
                    }
                    lqArray[n7] = lq2;
                    n6 = n8;
                    ++n7;
                }
                this.b.a((int)by, lqArray);
                return;
            }
            case 2: {
                int n11;
                int[] nArray;
                Object[] objectArray;
                n2 = lqArray.b((short)114);
                if (n2 > 0) {
                    objectArray = new int[n2];
                    nArray = new int[n2];
                    n11 = 0;
                    while (n11 < n2) {
                        objectArray[n11] = lqArray.a(lqArray.b((short)114, n11), -1);
                        nArray[n11] = lqArray.a(lqArray.b((short)106, n11), -1);
                        ++n11;
                    }
                    this.b.a((int[])objectArray, nArray);
                }
                if ((n2 = lqArray.b((short)83)) <= 0) break;
                objectArray = new String[n2];
                nArray = new int[n2];
                n11 = 0;
                while (n11 < n2) {
                    objectArray[n11] = (int)lqArray.b(lqArray.b((short)83, n11));
                    nArray[n11] = lqArray.a(lqArray.b((short)146, n11), -1);
                    ++n11;
                }
                this.b.a((String[])objectArray, nArray);
            }
        }
    }

    private void w(ku ku2) {
        int n2;
        int n3;
        byte by = ku2.a((short)208, (byte)0);
        int n4 = ku2.b((short)9);
        dh[] dhArray = new dh[n4];
        if (n4 > 0) {
            n3 = ku2.b((short)9, 0);
            n2 = 0;
            while (n2 < dhArray.length) {
                n4 = ku2.a((short)9, n3);
                String string = ku2.b(n3);
                int n5 = ku2.a((short)148, n3, n4, 0);
                String string2 = ku2.d((short)211, n3, n4);
                String string3 = ku2.d((short)1, n3, n4);
                dhArray[n2] = new dh(n5, string2, string, string3);
                n3 = n4;
                ++n2;
            }
        }
        n3 = 0;
        while (n3 < dhArray.length - 1) {
            n2 = n3 + 1;
            while (n2 < dhArray.length) {
                if (dhArray[n3].a > dhArray[n2].a) {
                    dh dh2 = dhArray[n3];
                    dhArray[n3] = dhArray[n2];
                    dhArray[n2] = dh2;
                }
                ++n2;
            }
            ++n3;
        }
        this.b.a((int)by, dhArray);
    }

    private void x(ku object) {
        String string = ((ku)object).d((short)175);
        ll[] llArray = new ll[((ku)object).b((short)83)];
        if (llArray.length > 0) {
            int n2 = ((ku)object).b((short)83, 0);
            int n3 = 0;
            while (n3 < llArray.length) {
                int n4 = ((ku)object).a((short)83, n2);
                if (n4 < 0) {
                    n4 = ((ku)object).a((short)114, n2);
                }
                llArray[n3] = ky.a((ku)object, n2, n4, true);
                n2 = n4;
                ++n3;
            }
        }
        lm[] lmArray = object;
        object = this;
        lmArray = ky.a((ku)lmArray, 0);
        this.b.a(string, llArray, lmArray);
    }

    private void y(ku ku2) {
        lf[] lfArray = new lf[ku2.b((short)152)];
        if (lfArray.length > 0) {
            int n2 = ku2.b((short)152, 0);
            int n3 = 0;
            while (n3 < lfArray.length) {
                int n4 = ku2.a((short)152, n2);
                byte by = ku2.a(n2, (byte)-1);
                String string = ku2.d((short)26, n2, n4);
                n2 = ku2.a((short)106, n2, n4, 0);
                lfArray[n3] = new lf(by, string, n2);
                n2 = n4;
                ++n3;
            }
        }
        this.b.b(lfArray);
    }

    private void z(ku object) {
        String string = ((ku)object).d((short)175);
        ll[] llArray = new ll[((ku)object).b((short)83)];
        if (llArray.length > 0) {
            int n2 = ((ku)object).b((short)83, 0);
            int n3 = 0;
            while (n3 < llArray.length) {
                int n4 = ((ku)object).a((short)83, n2);
                if (n4 < 0) {
                    n4 = ((ku)object).a((short)114, n2);
                }
                llArray[n3] = ky.a((ku)object, n2, n4, true);
                n2 = n4;
                ++n3;
            }
        }
        lm[] lmArray = object;
        object = this;
        lmArray = ky.a((ku)lmArray, 0);
        this.b.b(string, llArray, lmArray);
    }

    private void A(ku object) {
        String string = ((ku)object).d((short)186);
        byte by = ((ku)object).a((short)189, (byte)-1);
        ll[] llArray = new ll[((ku)object).b((short)83)];
        lm[] lmArray = null;
        if (llArray.length > 0) {
            int n2 = ((ku)object).b((short)83, 0);
            int n3 = 0;
            while (n3 < llArray.length) {
                int n4 = ((ku)object).a((short)83, n2);
                llArray[n3] = ky.a((ku)object, n2, n4, true);
                n2 = n4;
                ++n3;
            }
        }
        lmArray = object;
        object = this;
        lmArray = ky.a((ku)lmArray, 0);
        this.b.a(string, llArray, lmArray, by);
    }

    private void B(ku object) {
        String string = ((ku)object).d((short)186);
        byte by = ((ku)object).a((short)189, (byte)-1);
        ll[] llArray = new ll[((ku)object).b((short)83)];
        lm[] lmArray = null;
        if (llArray.length > 0) {
            int n2 = ((ku)object).b((short)83, 0);
            int n3 = 0;
            while (n3 < llArray.length) {
                int n4 = ((ku)object).a((short)83, n2);
                llArray[n3] = ky.a((ku)object, n2, n4, true);
                n2 = n4;
                ++n3;
            }
        }
        lmArray = object;
        object = this;
        lmArray = ky.a((ku)lmArray, 0);
        this.b.b(string, llArray, lmArray, by);
    }

    private void C(ku ku2) {
        int n2;
        ku2.d((short)9);
        int n3 = ku2.b((short)83);
        String[] stringArray = new String[n3];
        int[] nArray = new int[n3];
        int[] nArray2 = new int[n3];
        n3 = ku2.b((short)114);
        int[] nArray3 = new int[n3];
        int[] nArray4 = new int[n3];
        int n4 = ku2.b((short)83, 0);
        int n5 = 0;
        while (n5 < stringArray.length) {
            n2 = ku2.a((short)83, n4);
            stringArray[n5] = ku2.b(n4);
            nArray[n5] = ku2.a((short)139, n4, n2, 0);
            nArray2[n5] = ku2.a((short)144, n4, n2, 0);
            n4 = n2;
            ++n5;
        }
        n4 = ku2.b((short)114, 0);
        n5 = 0;
        while (n5 < nArray3.length) {
            n2 = ku2.a((short)114, n4);
            nArray3[n5] = ku2.a(n4, 0);
            nArray4[n5] = ku2.a((short)106, n4, n2, 0);
            n4 = n2;
            ++n5;
        }
        if (this.b != null) {
            this.b.a(stringArray, nArray, nArray2, nArray3, nArray4);
        }
    }

    private void D(ku object) {
        String string = ((ku)object).d((short)182);
        String[] stringArray = ((ku)object).d((short)183);
        object = ((ku)object).d((short)1);
        stringArray = i.b((String)stringArray, ";");
        String[] stringArray2 = null;
        String[] stringArray3 = null;
        if (stringArray != null && stringArray.length > 0 && stringArray.length % 2 == 0) {
            stringArray2 = new String[stringArray.length / 2];
            stringArray3 = new String[stringArray.length / 2];
            int n2 = 0;
            while (n2 < stringArray.length) {
                stringArray3[n2 / 2] = stringArray[n2];
                stringArray2[n2 / 2] = stringArray[n2 + 1];
                n2 += 2;
            }
        }
        this.b.b((String)object, string, stringArray3, stringArray2);
    }

    public final void a() {
        this.f = true;
        if (this.e != null) {
            kv kv2 = this.e;
            try {
                kv2.a.close();
            }
            catch (Throwable throwable) {}
            this.e = null;
        }
    }
}
