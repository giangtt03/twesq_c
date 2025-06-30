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
        if (com.mg.bas.v.ah || gr.j) {
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
        final long currentTimeMillis = System.currentTimeMillis();
        int i = 0;
        while (i < this.d.d()) {
            final int a;
            if ((a = ((u)this.d.b(i)).a()) < 0) {
                if (!gr.j && a == -2) {
                    this.b();
                    final String[] listRecordStores;
                    if ((listRecordStores = RecordStore.listRecordStores()) != null) {
                        for (int j = 0; j < listRecordStores.length; ++j) {
                            final int index;
                            if (listRecordStores[j] != null && (index = listRecordStores[j].indexOf("installcacher")) >= 0) {
                                com.mg.bas.g.b(listRecordStores[j]);
                            }
                        }
                    }
                    pd.d(0);
                    pd.h(0);
                    pd.o();
                    pd.s();
                    MGMIDlet.d().notifyDestroyed();
                    return false;
                }
                a(a);
                return false;
            }
            else {
                ++i;
            }
        }
        this.u += System.currentTimeMillis() - currentTimeMillis;
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
                com.mg.bas.u.a(u2);
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
        return com.mg.bas.u.a(string, 512, 15360, 0, 0, this.r, false);
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
        return com.mg.bas.u.a("map" + string, 512, 5120);
    }

    public final Image a(int n2, boolean bl) {
        boolean bl2 = false;
        int n3 = n2;
        pa pa2 = this;
        return com.mg.bas.f.a(pa2.a(n3, bl2, false));
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
                return com.mg.bas.f.a("/offline/" + n2 + ".meta", false);
            }
            return com.mg.bas.f.b("/offline/" + n2);
        }
        return null;
    }

    public final void a(final String s, final ik g) {
        ct.b("[SQDataCacher] getMapResource");
        if (this.o) {
            return;
        }
        this.o = true;
        if (com.mg.sq.a.s().d(11111) != null) {
            com.mg.sq.a.s().v();
            com.mg.sq.a.s().a(null, (il)null);
        }
        int n = -1;
        if (!s.toUpperCase().equals("M99") && com.mg.bas.g.a("map" + s)) {
            final u b = b(s);
            int a = -1;
            int n2;
            if (b == null) {
                n2 = -1;
            }
            else {
                final byte[] a2;
                if ((a2 = b.a(-1987)) != null) {
                    a = com.mg.bas.m.a(a2, 0);
                }
                n2 = a;
            }
            n = n2;
        }
        this.g = g;
        ks.a().a(s, n);
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
                            int n7 = com.mg.bas.m.c(byArray);
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
                    nArray2[n4] = ((Integer)a2.b(n4)).intValue();
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
        com.mg.bas.g.b("map" + string);
        this.p = this.i.c;
        this.k = new byte[nArray.length][];
        this.i();
        this.c = pa.b(this.i.a);
        this.c.a(-1988, this.i.a());
        this.c.a(-1989, com.mg.bas.m.a(System.currentTimeMillis()));
        int n4 = this.c.a();
        pa.a(n4);
        this.a(1, nArray);
    }

    public final void a(final String s, final jm[] array) {
        ct.a("[SQDataCache] receiveMapUpToDate()");
        this.i = new jn();
        if (!s.toUpperCase().equals("M99")) {
            final u b;
            (b = b(s)).a(-1989, com.mg.bas.m.a(System.currentTimeMillis()));
            a(b.a());
            final jn i = this.i;
            final byte[] a = b.a(-1988);
            final jn jn = i;
            if (a != null) {
                jn.f = com.mg.bas.m.a(a, 0);
                jn.e = com.mg.bas.m.a(a, 4);
                jn.g = com.mg.bas.m.a(a, 8);
                jn.c = com.mg.bas.m.a(a, 12);
                jn.d = com.mg.bas.m.a(a, 16);
                jn.k = com.mg.bas.m.a(a, 20);
                final int a2;
                final byte[] array2 = new byte[a2 = com.mg.bas.m.a(a, 24)];
                System.arraycopy(a, 28, array2, 0, a2);
                jn.a = com.mg.bas.i.a(array2);
                int n = a2 + 28;
                final int a3 = com.mg.bas.m.a(a, n);
                n += 4;
                final byte[] array3 = new byte[a3];
                System.arraycopy(a, n, array3, 0, a3);
                jn.b = com.mg.bas.i.a(array3);
                int n2 = n + a3;
                final int a4 = com.mg.bas.m.a(a, n2);
                n2 += 4;
                System.arraycopy(a, n2, jn.h = new byte[a4], 0, a4);
                int n3 = n2 + a4;
                final int a5 = com.mg.bas.m.a(a, n3);
                n3 += 4;
                System.arraycopy(a, n3, jn.i = new byte[a5], 0, a5);
                int n4 = n3 + a5;
                final int a6 = com.mg.bas.m.a(a, n4);
                n4 += 4;
                System.arraycopy(a, n4, jn.j = new byte[a6], 0, a6);
                int n5 = n4 + a6;
                final int a7 = com.mg.bas.m.a(a, n5);
                n5 += 4;
                final byte[] array4 = new byte[a7];
                System.arraycopy(a, n5, array4, 0, a7);
                jn.m = new int[a7 / 4];
                for (int j = 0; j < jn.m.length; ++j) {
                    jn.m[j] = com.mg.bas.m.a(array4, j << 2);
                }
                int n6 = n5 + a7;
                final int a8 = com.mg.bas.m.a(a, n6);
                n6 += 4;
                final byte[] array5 = new byte[a8];
                System.arraycopy(a, n6, array5, 0, a8);
                int k = 0;
                final a a9 = new a();
                while (k < array5.length - 1) {
                    final int a10 = com.mg.bas.m.a(array5, k);
                    k += 4;
                    final byte[] array6 = new byte[a10];
                    System.arraycopy(array5, k, array6, 0, a10);
                    a9.a(array6);
                    k += a10;
                }
                jn.l = new jm[a9.d()];
                for (int l = 0; l < jn.l.length; ++l) {
                    jn.l[l] = new jm();
                    final jm jm = jn.l[l];
                    final byte[] array7 = (byte[])a9.b(l);
                    final jm jm2 = jm;
                    jm.a = com.mg.bas.m.a(array7, 0);
                    jm2.c = com.mg.bas.m.a(array7, 4);
                    jm2.d = com.mg.bas.m.a(array7, 8);
                    jm2.e = com.mg.bas.m.a(array7, 12);
                    jm2.f = com.mg.bas.m.a(array7, 16);
                    jm2.g = com.mg.bas.m.a(array7, 20);
                    final int a11;
                    final byte[] array8 = new byte[a11 = com.mg.bas.m.a(array7, 24)];
                    System.arraycopy(array7, 28, array8, 0, a11);
                    jm2.b = com.mg.bas.i.a(array8);
                }
            }
            a(this.i.l = array);
            this.j = this.i.m;
            this.k = new byte[this.j.length][];
            a(0, this.k.length);
            for (int n7 = 0; n7 < this.j.length; ++n7) {
                final al d;
                if ((d = com.mg.sq.a.s().d(11111)) != null) {
                    d.a(al.a);
                }
                this.k[n7] = b.a(this.j[n7]);
                ++nx.b;
            }
        }
        else {
            this.i.l = array;
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
                    long l2 = com.mg.bas.m.d(byArray);
                    if (l2 < l) {
                        l = l2;
                        n4 = n5;
                    }
                }
                ++n5;
            }
            if (n4 >= 0) {
                com.mg.bas.g.b((String)a2.b(n4));
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
                    this.c.a(-1987, com.mg.bas.m.a(this.i.c));
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
        this.q = true;
        this.w = true;
        final boolean f;
        if (this.j != null && (f = this.f())) {
            int n;
            if ((n = this.l) > this.j.length) {
                n = this.j.length;
            }
            pd.a(this.t + n);
        }
    }

    static void a(pa pa2) {
        pa2.k();
    }
}
