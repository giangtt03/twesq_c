package com.mg.bas;
// Manager for game state, persistence, and background operations (singleton, handles save/load, threading).
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.smsgame.MGMIDlet;
import java.io.InputStream;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;

public final class pa
implements il,
Runnable {
    private static int a = 2;
    private static pa b;
    private u c;
    private a d;
    private int e;
    private final Object f = new Object();
    private ik g;
    private ij h;
    private jn i;
    private int[] j;
    private byte[][] k;
    private int l;
    private int m;
    private pb n;
    private boolean o = false;
    private int p;
    private boolean q;
    private int r;
    private boolean s = false;
    private int t;
    private long u = 0L;
    private long v = 0L;
    private boolean w = false;
    private boolean x = false;
    private int y = 0;

    public static pa a() {
        if (b == null) {
            b = new pa();
        }
        return b;
    }

    protected pa() {
        this.e = pd.F();
        if (v.ah || gr.j) {
            this.r = 180000;
            a = 1;
        } else {
            this.r = Integer.MAX_VALUE;
            a = 2;
        }
        this.h();
        this.n = new pb(this);
        ks.a().a(this.n);
        Thread thread = new Thread(this);
        thread.setPriority(10);
        thread.start();
    }

    private boolean f() {
        long l = System.currentTimeMillis();
        int n2 = 0;
        while (n2 < this.d.d()) {
            u u2 = (u)this.d.b(n2);
            int n3 = u2.a();
            if (n3 < 0) {
                if (!gr.j && n3 == -2) {
                    this.b();
                    Object object = RecordStore.listRecordStores();
                    if (object != null) {
                        int n4 = 0;
                        while (n4 < ((String[])object).length) {
                            if (object[n4] != null && (n2 = object[n4].indexOf("installcacher")) >= 0) {
                                g.b(object[n4]);
                            }
                            ++n4;
                        }
                    }
                    pd.d(0);
                    pd.h(0);
                    pd.o();
                    pd.s();
                    object = MGMIDlet.d();
                    object.notifyDestroyed();
                    return false;
                }
                pa.a(n3);
                return false;
            }
            ++n2;
        }
        this.u += System.currentTimeMillis() - l;
        return true;
    }

    private static void a(int n2) {
        if (n2 == -2) {
            com.mg.sq.a.s().j(2);
            return;
        }
        if (n2 < 0) {
            com.mg.sq.a.s().j(3);
        }
    }

    public final void b() {
        if (this.d == null) {
            return;
        }
        int n2 = 0;
        while (n2 < this.d.d()) {
            u u2 = (u)this.d.b(n2);
            if (u2 != null) {
                u2.d();
            }
            ++n2;
        }
    }

    public final void c() {
        if (this.d == null) {
            return;
        }
        int n2 = 0;
        while (n2 < this.d.d()) {
            u u2 = (u)this.d.b(n2);
            if (u2 != null) {
                u.a(u2);
            }
            ++n2;
        }
    }

    private u a(u u2, int n2, byte[] byArray) {
        long l = System.currentTimeMillis();
        int n3 = 0;
        while (n3 < this.d.d()) {
            u u3 = (u)this.d.b(n3);
            if (!u3.equals(u2) && u3.c(n2)) {
                boolean bl = u3.a(n2, byArray);
                n3 = bl ? 1 : 0;
                if (!bl) break;
                return u2;
            }
            ++n3;
        }
        this.v += System.currentTimeMillis() - l;
        if (u2.c() < 300) {
            boolean bl = u2.a(n2, byArray);
            n3 = bl ? 1 : 0;
            if (bl) {
                return u2;
            }
        }
        u u4 = this.g();
        u4.a(n2, byArray);
        return u4;
    }

    private u g() {
        u u2 = this.a("installcacher" + this.e);
        ++this.e;
        pd.h(this.e);
        this.d.a(u2);
        return u2;
    }

    private u a(String string) {
        return u.a(string, 512, 15360, 0, 0, this.r, false);
    }

    private void h() {
        this.d = new a();
        String[] stringArray = RecordStore.listRecordStores();
        if (stringArray != null) {
            int n2 = 0;
            while (n2 < stringArray.length) {
                int n3;
                if (stringArray[n2] != null && (n3 = stringArray[n2].indexOf("installcacher")) >= 0 && !stringArray[n2].equals("tmpinstallcacher")) {
                    this.d.a(this.a(stringArray[n2]));
                }
                ++n2;
            }
        }
    }

    private int b(int n2) {
        if (this.d == null) {
            this.h();
        }
        int n3 = 0;
        while (n3 < this.d.d()) {
            u u2 = (u)this.d.b(n3);
            int n4 = u2.d(n2);
            if (n4 > 0) {
                return n4;
            }
            ++n3;
        }
        return 0;
    }

    private static u b(String string) {
        return u.a("map" + string, 512, 5120);
    }

    public final Image a(int n2, boolean bl) {
        boolean bl2 = false;
        int n3 = n2;
        pa pa2 = this;
        return f.a(pa2.a(n3, bl2, false));
    }

    public final byte[] b(int n2, boolean bl) {
        return this.a(n2, bl, false);
    }

    public final byte[] a(int n2, boolean bl, boolean bl2) {
        if (this.d == null) {
            this.h();
        }
        int n3 = 0;
        while (n3 < this.d.d()) {
            u u2 = (u)this.d.b(n3);
            if (u2.c(n2)) {
                return u2.a(n2);
            }
            ++n3;
        }
        if (!bl) {
            if (bl2) {
                return f.a("/offline/" + n2 + ".meta", false);
            }
            return f.b("/offline/" + n2);
        }
        return null;
    }

    public final void a(String string, ik ik2) {
        Object object;
        ct.b("[SQDataCacher] getMapResource");
        if (this.o) {
            return;
        }
        this.o = true;
        if (com.mg.sq.a.s().d(11111) != null) {
            com.mg.sq.a.s().v();
            com.mg.sq.a.s().a((String)null, (il)null);
        }
        int n2 = -1;
        if (!string.toUpperCase().equals("M99") && g.a("map" + (String)(object = string))) {
            int n3;
            object = pa.b(string);
            n2 = -1;
            if (object == null) {
                n3 = -1;
            } else {
                byte[] byArray = ((u)object).a(-1987);
                object = byArray;
                if (byArray != null) {
                    n2 = m.a((byte[])object, 0);
                }
                n3 = n2;
            }
            n2 = n3;
        }
        this.g = ik2;
        ks.a().a(string, n2);
    }

    public final void a(int n2, int[] nArray, int n3, ij ij2) {
        u u2;
        block9: {
            this.h = ij2;
            if (nArray == null) {
                if (this.h != null) {
                    this.h.a();
                }
                return;
            }
            long l = pd.b(nArray);
            this.t = pd.a(l);
            if (this.t >= nArray.length) {
                pd.j();
                pd.b(l);
                this.t = 0;
            }
            int n4 = 0;
            int n5 = 0;
            while (n5 < this.t) {
                int n6 = this.b(nArray[n5]);
                if (n6 > 0) {
                    n4 += n6;
                } else {
                    pd.j();
                    pd.b(l);
                    this.t = 0;
                    n4 = 0;
                    break;
                }
                ++n5;
            }
            if (this.t > 0) {
                int[] nArray2 = new int[nArray.length - this.t];
                System.arraycopy(nArray, this.t, nArray2, 0, nArray2.length);
                nArray = nArray2;
            }
            pa.a(n4, n3);
            pa pa2 = this;
            String string = "installcacher" + (pa2.e - 1);
            int n7 = 0;
            while (n7 < pa2.d.d()) {
                u u3 = (u)pa2.d.b(n7);
                if (u3.b().equals(string)) {
                    u2 = u3;
                    break block9;
                }
                ++n7;
            }
            u2 = pa2.g();
        }
        this.c = u2;
        this.p = n2;
        this.a(0, nArray);
    }

    private static void a(int n2, int n3) {
        nx.a = n3;
        nx.b = n2;
        nx.c = System.currentTimeMillis();
    }

    public final void a(jn jn2, int[] nArray, int n2, int[] nArray2, int n3) {
        int n4;
        jn2.m = nArray;
        jn2.n = n2;
        this.i = jn2;
        pa.a(this.i.l);
        int n5 = 0;
        a a2 = new a(10);
        if (nArray2 != null) {
            n4 = 0;
            while (n4 < nArray2.length) {
                int n6 = this.b(nArray2[n4]);
                if (n6 <= 0) {
                    try {
                        InputStream inputStream = "".getClass().getResourceAsStream("/offline/" + nArray2[n4] + ".mg");
                        if (inputStream != null) {
                            byte[] byArray = new byte[4];
                            inputStream.read(byArray, 0, 4);
                            int n7 = m.c(byArray);
                            n5 += n7;
                            inputStream.close();
                        }
                    }
                    catch (Exception exception) {
                        Exception exception2 = exception;
                        exception.printStackTrace();
                        a2.a(new Integer(nArray2[n4]));
                    }
                } else {
                    n5 += n6;
                }
                ++n4;
            }
        }
        if (a2.d() > 0) {
            this.s = true;
            jn2.n += n3 - n5;
            if (nArray2 != null && nArray2.length != a2.d()) {
                nArray2 = new int[a2.d()];
                n4 = 0;
                while (n4 < nArray2.length) {
                    nArray2[n4] = (Integer)a2.b(n4);
                    ++n4;
                }
            }
            this.a(Integer.MAX_VALUE, nArray2, jn2.n, null);
            return;
        }
        this.s = false;
        this.a(nArray, 0, n2);
    }

    private void a(int[] nArray, int n2, int n3) {
        ct.a("[SQDataCache] receiveMapInfo()");
        pa.a(n2, n3);
        String string = this.i.a;
        g.b("map" + string);
        this.p = this.i.c;
        this.k = new byte[nArray.length][];
        this.i();
        this.c = pa.b(this.i.a);
        this.c.a(-1988, this.i.a());
        this.c.a(-1989, m.a(System.currentTimeMillis()));
        int n4 = this.c.a();
        pa.a(n4);
        this.a(1, nArray);
    }

    public final void a(String string, jm[] object) {
        ct.a("[SQDataCache] receiveMapUpToDate()");
        this.i = new jn();
        if (!string.toUpperCase().equals("M99")) {
            u u2 = pa.b(string);
            u2.a(-1989, m.a(System.currentTimeMillis()));
            int n2 = u2.a();
            pa.a(n2);
            byte[] byArray = u2.a(-1988);
            jn jn2 = this.i;
            if (byArray != null) {
                jn2.f = m.a(byArray, 0);
                jn2.e = m.a(byArray, 4);
                jn2.g = m.a(byArray, 8);
                jn2.c = m.a(byArray, 12);
                jn2.d = m.a(byArray, 16);
                jn2.k = m.a(byArray, 20);
                int n3 = m.a(byArray, 24);
                byte[] byArray2 = new byte[n3];
                System.arraycopy(byArray, 28, byArray2, 0, n3);
                jn2.a = i.a(byArray2);
                int n4 = n3 + 28;
                n3 = m.a(byArray, n4);
                byArray2 = new byte[n3];
                System.arraycopy(byArray, n4 += 4, byArray2, 0, n3);
                jn2.b = i.a(byArray2);
                n4 += n3;
                n3 = m.a(byArray, n4);
                jn2.h = new byte[n3];
                System.arraycopy(byArray, n4 += 4, jn2.h, 0, n3);
                n4 += n3;
                n3 = m.a(byArray, n4);
                jn2.i = new byte[n3];
                System.arraycopy(byArray, n4 += 4, jn2.i, 0, n3);
                n4 += n3;
                n3 = m.a(byArray, n4);
                jn2.j = new byte[n3];
                System.arraycopy(byArray, n4 += 4, jn2.j, 0, n3);
                n4 += n3;
                n3 = m.a(byArray, n4);
                byArray2 = new byte[n3];
                System.arraycopy(byArray, n4 += 4, byArray2, 0, n3);
                jn2.m = new int[n3 / 4];
                int n5 = 0;
                while (n5 < jn2.m.length) {
                    jn2.m[n5] = m.a(byArray2, n5 << 2);
                    ++n5;
                }
                n4 += n3;
                n3 = m.a(byArray, n4);
                byArray2 = new byte[n3];
                System.arraycopy(byArray, n4 += 4, byArray2, 0, n3);
                n5 = 0;
                a a2 = new a();
                while (n5 < byArray2.length - 1) {
                    int n6 = m.a(byArray2, n5);
                    byte[] byArray3 = new byte[n6];
                    System.arraycopy(byArray2, n5 += 4, byArray3, 0, n6);
                    a2.a((Object)byArray3);
                    n5 += n6;
                }
                jn2.l = new jm[a2.d()];
                int n7 = 0;
                while (n7 < jn2.l.length) {
                    jn2.l[n7] = new jm();
                    byArray2 = (byte[])a2.b(n7);
                    jm jm2 = jn2.l[n7];
                    jn2.l[n7].a = m.a(byArray2, 0);
                    jm2.c = m.a(byArray2, 4);
                    jm2.d = m.a(byArray2, 8);
                    jm2.e = m.a(byArray2, 12);
                    jm2.f = m.a(byArray2, 16);
                    jm2.g = m.a(byArray2, 20);
                    n5 = m.a(byArray2, 24);
                    byte[] byArray4 = new byte[n5];
                    System.arraycopy(byArray2, 28, byArray4, 0, n5);
                    jm2.b = i.a(byArray4);
                    ++n7;
                }
            }
            this.i.l = object;
            pa.a(this.i.l);
            this.j = this.i.m;
            this.k = new byte[this.j.length][];
            int n8 = this.k.length;
            pa.a(0, n8);
            n8 = 0;
            while (n8 < this.j.length) {
                object = com.mg.sq.a.s().d(11111);
                if (object != null) {
                    ((al)object).a(al.a);
                }
                this.k[n8] = u2.a(this.j[n8]);
                ++nx.b;
                ++n8;
            }
        } else {
            this.i.l = object;
        }
        if (this.g != null) {
            this.g.a(this.i, this.k);
        }
        this.l();
    }

    private void i() {
        String[] stringArray = RecordStore.listRecordStores();
        if (stringArray == null) {
            return;
        }
        a a2 = new a();
        int n2 = 0;
        while (n2 < stringArray.length) {
            int n3;
            if (stringArray[n2] != null && (n3 = stringArray[n2].indexOf("map")) >= 0) {
                a2.a(stringArray[n2]);
            }
            ++n2;
        }
        if (a2.d() >= a) {
            long l = Long.MAX_VALUE;
            int n4 = -1;
            int n5 = 0;
            while (n5 < a2.d()) {
                Object object = (String)a2.b(n5);
                if ((object = pa.b(((String)object).substring(3))) != null && ((u)object).c(-1989)) {
                    byte[] byArray = ((u)object).a(-1989);
                    object = byArray;
                    long l2 = m.d(byArray);
                    if (l2 < l) {
                        l = l2;
                        n4 = n5;
                    }
                }
                ++n5;
            }
            if (n4 >= 0) {
                g.b((String)a2.b(n4));
            }
        }
    }

    private static void a(jm[] jmArray) {
        if (jmArray == null) {
            return;
        }
        int n2 = 0;
        while (n2 < jmArray.length) {
            jm jm2 = jmArray[n2];
            jmArray[n2].d = jm2.d - (jm2.f >> 1) - (jm2.f & 1);
            jm2.e = jm2.e - (jm2.g >> 1) - (jm2.g & 1);
            ++n2;
        }
    }

    private void a(int n2, int[] nArray) {
        this.j = nArray;
        this.m = n2;
        this.l = 0;
        pa pa2 = this;
        this.q = false;
        pa2.k();
    }

    public final void t() {
        if (this.m == 1) {
            if (this.g != null) {
                this.g.d();
            }
        } else if (this.h != null) {
            this.h.b();
        }
        this.l();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void j() {
        Object object = this.f;
        synchronized (object) {
            try {
                this.f.wait();
            }
            catch (InterruptedException interruptedException) {
                InterruptedException interruptedException2 = interruptedException;
                interruptedException.printStackTrace();
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void k() {
        Object object = this.f;
        synchronized (object) {
            this.f.notify();
            return;
        }
    }

    private void l() {
        this.y = 0;
        this.c = null;
        this.i = null;
        this.g = null;
        this.h = null;
        this.k = null;
        this.j = null;
        this.o = false;
        this.s = false;
        System.gc();
    }

    public final void run() {
        while (!this.w) {
            if (this.j != null) {
                int n2;
                while (this.l < this.j.length) {
                    n2 = this.j[this.l];
                    nx.a(String.valueOf(n2));
                    ks.a().a(n2);
                    this.j();
                    if (!this.q) {
                        al al2 = com.mg.sq.a.s().d(11111);
                        if (al2 != null) {
                            al2.a(al.a);
                        }
                        if (this.m == 1) {
                            this.k[this.l] = this.n.a;
                        } else {
                            int n3 = this.j[this.l];
                            this.c = this.a(this.c, n3, this.n.a);
                            n3 = 0;
                            ++this.y;
                            if (this.y >= 200) {
                                n3 = 1;
                                this.y = 0;
                            }
                            if (n3 != 0) {
                                boolean bl = this.f();
                                n3 = bl ? 1 : 0;
                                if (bl) {
                                    n3 = this.l + 1;
                                    if (n3 > this.j.length) {
                                        n3 = this.j.length;
                                    }
                                    pd.a(this.t + n3);
                                }
                            }
                        }
                        this.n.a = null;
                        ++this.l;
                        continue;
                    }
                    this.l();
                    break;
                }
                if (this.q || this.l < this.j.length) continue;
                if (this.m == 1) {
                    n2 = 0;
                    while (n2 < this.j.length) {
                        this.c.a(this.j[n2], this.k[n2]);
                        ++n2;
                    }
                    n2 = this.c.a();
                    pa.a(n2);
                    this.c.a(-1987, m.a(this.i.c));
                    n2 = this.c.a();
                    pa.a(n2);
                    if (this.g != null) {
                        ct.a("[sqDataCacher ]+run");
                        this.g.a(this.i, this.k);
                    }
                    ct.a("[sqDataCacher ] complete get map resource");
                } else {
                    this.f();
                    pd.j();
                    if (!this.s) {
                        pd.d(this.p);
                        if (this.h != null) {
                            this.h.a();
                        }
                        ct.a("[sqDataCacher ] complete download file install");
                    } else {
                        this.s = false;
                        this.a(this.i.m, nx.b, this.i.n);
                        this.q = false;
                        ct.a("[sqDataCacher ] download tiep map sau khi da down du monster");
                        continue;
                    }
                }
                this.l();
                continue;
            }
            this.q = false;
            this.j();
        }
    }

    public final void d() {
        this.w = true;
        this.k();
        b = null;
    }

    public final void e() {
        int n2;
        this.q = true;
        this.w = true;
        if (this.j != null && (n2 = this.f()) != 0) {
            n2 = this.l;
            if (n2 > this.j.length) {
                n2 = this.j.length;
            }
            pd.a(this.t + n2);
        }
    }

    static void a(pa pa2) {
        pa2.k();
    }
}
