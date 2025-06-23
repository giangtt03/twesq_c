package com.mg.bas;
// Utility for managing persistent storage using RecordStore (save/load data, cache management).
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreFullException;
import javax.microedition.rms.RecordStoreNotOpenException;

public final class u {
    private final String a;
    private final int b;
    private int c;
    private int d;
    private int e;
    private a f;
    private a g;
    private a h;
    private int i;
    private int j;
    private int k;
    private Object l;
    private boolean m = false;
    private RecordStore n = null;
    private boolean o = true;
    private int p = 0;

    private u(String string, int n, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        this.c = n2;
        this.a = string;
        this.b = n;
        this.d = n3;
        this.e = n4;
        this.j = n5 - (n2 << 1) - n * 10;
        this.o = bl;
        this.p = n6;
        this.f = new a();
        this.g = new a();
        this.h = new a();
        this.l = new Object();
        this.f();
        this.e();
    }

    private byte[] a(RecordStore object) {
        byte[] byArray = new byte[this.c];
        try {
            com.mg.bas.g.a(object, 1, byArray);
            com.mg.bas.g.a(object, 2, byArray);
            com.mg.bas.g.a(object, 3, new byte[]{1});
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.i = 1;
        return byArray;
    }

    private void f() {
        if (this.n == null) {
            this.n = com.mg.bas.g.a(this.a, false);
        }
        try {
            int n2;
            byte[] byArray;
            if (this.n == null || com.mg.bas.g.a(this.n) < 3) {
                this.d();
                com.mg.bas.g.b(this.a);
                this.n = com.mg.bas.g.a(this.a, true);
                byArray = this.a(this.n);
            } else {
                this.i = 0;
                byte[] byArray2 = com.mg.bas.g.a(this.n, 3);
                if (byArray2 != null) {
                    this.i = byArray2[0];
                }
                if (this.i <= 0 || this.i > 2) {
                    this.i = 1;
                }
                if ((n2 = com.mg.bas.m.a(byArray = com.mg.bas.g.a(this.n, this.i), 0)) < this.p) {
                    this.d();
                    com.mg.bas.g.b(this.a);
                    this.f();
                    return;
                }
            }
            int n3 = com.mg.bas.g.a(this.n);
            n2 = 3;
            if (this.o) {
                this.d();
            }
            int n4 = 4;
            int n5 = com.mg.bas.m.a(byArray, 4);
            n4 += 4;
            int n6 = 0;
            while (n6 < n5) {
                t t2 = new t();
                int n7 = n4;
                byte[] byArray3 = byArray;
                t2.a = com.mg.bas.m.a(byArray3, n7);
                t2.e = com.mg.bas.m.b(byArray3, n7 += 4);
                t2.b = com.mg.bas.m.a(byArray3, n7 += 8);
                t2.c = new int[com.mg.bas.m.a(byArray3, n7 += 4)];
                int n8 = t2.c.length;
                int n9 = 0;
                while (n9 < n8) {
                    t2.c[n9] = com.mg.bas.m.a(byArray3, n7);
                    n7 += 4;
                    ++n9;
                }
                n4 = n7;
                this.g.a(new Integer(com.mg.bas.m.a(byArray, n4)));
                n4 += 4;
                ++n6;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void e(int n2) {
        boolean[] blArray = new boolean[n2 + 1];
        int n3 = this.f.d() - 1;
        while (n3 >= 0) {
            t t2 = (t)this.f.b(n3);
            int n4 = t2.c.length - 1;
            while (n4 >= 0) {
                blArray[t2.c[n4]] = true;
                --n4;
            }
            --n3;
        }
        n3 = this.g.d() - 1;
        while (n3 >= 0) {
            int n5 = ((Integer)this.g.b(n3)).intValue();
            blArray[n5] = true;
            --n3;
        }
        n3 = blArray.length - 1;
        while (n3 > 3) {
            if (!blArray[n3]) {
                this.g.a(new Integer(n3));
            }
            --n3;
        }
    }

    private t f(int n2) {
        Object object = this.f.a(n2);
        if (object != null) {
            t tObj = (t)object;
            this.k -= tObj.b;
            return tObj;
        }
        return null;
    }

    private t a(t t2) {
        int n2 = this.h(t2.a);
        if (n2 >= 0) {
            return this.f(n2);
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final byte[] a(int n2) {
        Object object = this.l;
        synchronized (object) {
            if (this.n == null) {
                this.n = com.mg.bas.g.a(this.a, false);
            }
            try {
                byte[] byArray;
                t t2 = this.g(n2);
                if (t2 == null || t2.c == null || this.n == null) {
                    this.d();
                    return null;
                }
                if (t2.d != null) {
                    byArray = t2.d;
                } else {
                    byArray = new byte[t2.b];
                    int n3 = 0;
                    int[] nArray = t2.c;
                    int n4 = 0;
                    while (n4 < nArray.length) {
                        byte[] byArray2 = com.mg.bas.g.a(this.n, nArray[n4]);
                        if (byArray2 == null) {
                            this.a(t2);
                            this.a(t2.c, 0, t2.c.length);
                            this.d();
                            return null;
                        }
                        int n5 = byArray2.length;
                        if (n5 > byArray.length - n3) {
                            n5 = byArray.length - n3;
                        }
                        System.arraycopy(byArray2, 0, byArray, n3, n5);
                        n3 += n5;
                        ++n4;
                    }
                }
                if (t2.e < System.currentTimeMillis()) {
                    t2.e = System.currentTimeMillis();
                }
                if (this.o) {
                    this.d();
                }
                return byArray;
            }
            catch (Throwable throwable) {
                this.d();
                throwable.printStackTrace();
                return null;
            }
        }
    }

    private boolean g() {
        boolean bl = false;
        this.m = true;
        while (this.f.d() >= this.e && this.f.d() > 0) {
            t t2 = (t)this.f.b(0);
            int n2 = 0;
            int n3 = 1;
            while (n3 < this.f.d()) {
                t t3 = (t)this.f.b(n3);
                if (t3.e < t2.e) {
                    t2 = t3;
                    n2 = n3;
                }
                ++n3;
            }
            if (t2 == null || t2.c == null) continue;
            this.a(t2.c, 0, t2.c.length);
            this.f(n2);
            bl = true;
        }
        return bl;
    }

    public final boolean a(int n2, byte[] byArray) {
        return this.a(n2, byArray, 0, byArray.length);
    }

    public final boolean a(int n2, long l) {
        t t2 = this.g(n2);
        if (t2 != null) {
            t2.e = Long.MAX_VALUE;
            return true;
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final boolean a(int n2, byte[] byArray, int n3, int n4) {
        Object object = this.l;
        synchronized (object) {
            int n5;
            t t2;
            block16: {
                block15: {
                    if (byArray != null) break block15;
                    return true;
                }
                if (this.d == 1) {
                    this.g();
                }
                if ((t2 = this.g(n2)) != null) {
                    if (t2.c != null) {
                        this.a(t2.c, 0, t2.c.length);
                    }
                    this.k -= t2.b;
                    t2.b = 0;
                } else {
                    t2 = new t();
                    new t().a = n2;
                    this.f.b(t2, Math.abs(this.h(n2) + 1));
                }
                n5 = this.j - this.k;
                if (n4 <= n5) break block16;
                this.a(t2);
                return false;
            }
            try {
                t2.a = n2;
                t2.e = System.currentTimeMillis();
                t2.b = n4;
                this.k += n4;
                n5 = n4 / this.b;
                if (n4 % this.b != 0) {
                    ++n5;
                }
                int[] nArray = new int[n5];
                int n6 = 0;
                while (n6 < nArray.length) {
                    int n7 = this.g.d() - 1;
                    if (n7 >= 0) {
                        nArray[n6] = ((Integer)this.g.b(n7)).intValue();
                        this.g.a(n7);
                    } else {
                        nArray[n6] = -1;
                    }
                    ++n6;
                }
                t2.c = nArray;
                t2.d = new byte[n4];
                System.arraycopy(byArray, n3, t2.d, 0, n4);
                this.m = true;
                return true;
            }
            catch (Throwable throwable) {
                this.b(n2);
                throwable.printStackTrace();
                return false;
            }
        }
    }

    public final int b(int n2, byte[] byArray, int n3, int n4) {
        this.a(n2, byArray, 0, n4);
        return this.a();
    }

    public final int b(int n2, byte[] byArray) {
        return this.b(n2, byArray, 0, byArray.length);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int a() {
        if (!this.m) {
            return 0;
        }
        this.m = false;
        Object object = this.l;
        synchronized (object) {
            if (this.n == null) {
                this.n = com.mg.bas.g.a(this.a, false);
            }
            try {
                int n2;
                if (this.n == null) {
                    this.n = com.mg.bas.g.a(this.a, true);
                    if (this.n == null) {
                        return -3;
                    }
                    this.a(this.n);
                }
                int n3 = 0;
                int n4 = this.f.d();
                while (n3 < n4) {
                    t t2 = (t)this.f.b(n3);
                    if (t2.d != null) {
                        n2 = this.a(this.n, t2.d, t2.c);
                        t2.d = null;
                        if (n2 < 0) {
                            this.d();
                            return n2;
                        }
                    }
                    ++n3;
                }
                byte[] byArray = new byte[this.c];
                n4 = 0;
                System.arraycopy(com.mg.bas.m.a(this.p), 0, byArray, 0, 4);
                System.arraycopy(com.mg.bas.m.a(this.f.d()), 0, byArray, 4, 4);
                int n5 = 0;
                n2 = this.f.d();
                while (n5 < n2) {
                    Object object2 = (t)this.f.b(n5);
                    int n6 = 20 + (((t)object2).c.length << 2);
                    byte[] byArray2 = new byte[n6];
                    int n7 = 0;
                    System.arraycopy(com.mg.bas.m.a(((t)object2).a), 0, byArray2, 0, 4);
                    n7 += 4;
                    System.arraycopy(com.mg.bas.m.a(((t)object2).e), 0, byArray2, 4, 8);
                    n7 += 8;
                    System.arraycopy(com.mg.bas.m.a(((t)object2).b), 0, byArray2, 12, 4);
                    n7 += 4;
                    System.arraycopy(com.mg.bas.m.a(((t)object2).c.length), 0, byArray2, 16, 4);
                    n7 += 4;
                    int n8 = 0;
                    while (n8 < ((t)object2).c.length) {
                        System.arraycopy(com.mg.bas.m.a(((t)object2).c[n8]), 0, byArray2, n7, 4);
                        n7 += 4;
                        ++n8;
                    }
                    object2 = byArray2;
                    System.arraycopy(byArray2, 0, byArray, n4, byArray2.length);
                    n4 += byArray2.length;
                    ++n5;
                }
                n5 = this.h.d() - 1;
                while (n5 >= 0) {
                    this.g.a(this.h.b(n5));
                    --n5;
                }
                this.h.a();
                System.arraycopy(com.mg.bas.m.a(this.g.d()), 0, byArray, n4, 4);
                n4 += 4;
                n5 = this.g.d() - 1;
                while (n5 >= 0) {
                    n2 = ((Integer)this.g.b(n5)).intValue();
                    System.arraycopy(com.mg.bas.m.a(n2), 0, byArray, n4, 4);
                    n4 += 4;
                    --n5;
                }
                n5 = this.i == 1 ? 2 : 1;
                com.mg.bas.g.a(this.n, n5, byArray);
                com.mg.bas.g.a(this.n, 3, new byte[]{(byte)n5});
                this.i = n5;
                if (this.o) {
                    this.d();
                }
                return 0;
            }
            catch (Throwable throwable) {
                this.d();
                throwable.printStackTrace();
                return 0;
            }
        }
    }

    public final void b(int n2) {
        block7: {
            try {
                n2 = this.h(n2);
                if (n2 < 0) break block7;
                t t2 = this.f(n2);
                if (t2.c != null) {
                    int n3 = t2.c.length;
                    boolean bl = false;
                    int[] nArray = t2.c;
                    u u2 = this;
                    if (nArray != null) {
                        try {
                            n3 += 0;
                            int n4 = 0;
                            while (n4 < n3) {
                                u2.g.a(new Integer(nArray[n4]));
                                ++n4;
                            }
                        }
                        catch (Throwable throwable) {
                            Throwable throwable2 = throwable;
                            throwable.printStackTrace();
                        }
                    }
                }
                this.m = true;
                return;
            }
            catch (Throwable throwable) {
                Throwable throwable3 = throwable;
                throwable.printStackTrace();
            }
        }
    }

    private t g(int n2) {
        if ((n2 = this.h(n2)) >= 0) {
            return (t)this.f.b(n2);
        }
        return null;
    }

    private void a(int[] nArray, int n2, int n3) {
        if (nArray == null) {
            return;
        }
        n3 += 0;
        n2 = 0;
        while (n2 < n3) {
            this.h.a(new Integer(nArray[n2]));
            ++n2;
        }
    }

    private int a(RecordStore recordStore, byte[] byArray, int[] nArray) {
        byte[] byArray2 = new byte[this.b];
        int n2 = 0;
        int n3 = 0;
        while (n3 < nArray.length) {
            int n4 = byArray.length - n2;
            if (n4 > byArray2.length) {
                n4 = byArray2.length;
            }
            System.arraycopy(byArray, n2, byArray2, 0, n4);
            n2 += n4;
            if (nArray[n3] > 3) {
                try {
                    com.mg.bas.g.a(recordStore, nArray[n3], byArray2);
                } catch (Exception e) {
                    return -3;
                }
            }
            try {
                nArray[n3] = com.mg.bas.g.a(recordStore, byArray2);
            } catch (Exception e) {
                return -3;
            }
            ++n3;
        }
        return 0;
    }

    public final boolean c(int n2) {
        return this.h(n2) >= 0;
    }

    private int h(int n2) {
        int n3 = 0;
        int n4 = this.f.d() - 1;
        while (n3 <= n4) {
            int n5 = n3 + n4 >>> 1;
            t t2 = (t)this.f.b(n5);
            if (t2.a < n2) {
                n3 = n5 + 1;
                continue;
            }
            if (t2.a > n2) {
                n4 = n5 - 1;
                continue;
            }
            return n5;
        }
        return -(n3 + 1);
    }

    public final String b() {
        return this.a;
    }

    public final int c() {
        return this.f.d();
    }

    public final int d(int n2) {
        t t2 = this.g(n2);
        if (t2 != null) {
            return t2.b;
        }
        return 0;
    }

    public final void d() {
        if (this.n != null) {
            Object object = this.n;
            try {
                ((RecordStore)object).closeRecordStore();
            }
            catch (Throwable throwable) {
                object = throwable;
                throwable.printStackTrace();
            }
            this.n = null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void e() {
        Object object = this.l;
        synchronized (object) {
            if (this.d == 1) {
                if (this.g()) {
                    this.a();
                }
            } else if (this.d == 2) {
                u u2 = this;
                boolean bl = false;
                u2.m = true;
                long l = System.currentTimeMillis();
                int n2 = 0;
                while (n2 < u2.f.d()) {
                    t t2 = (t)u2.f.b(n2);
                    if (t2.c != null && (l - t2.e) / 3600L >= (long)u2.e) {
                        u2.a(t2.c, 0, t2.c.length);
                        u2.f(n2);
                        --n2;
                        bl = true;
                    }
                    ++n2;
                }
                if (bl) {
                    this.a();
                }
            }
            return;
        }
    }

    public static u a(String string, int n2, int n3) {
        return u.a(string, n2, n3, 0, 0);
    }

    public static u a(String string, int n2, int n3, int n4, int n5) {
        return u.a(string, n2, n3, n4, n5, Integer.MAX_VALUE, true);
    }

    public static u a(String string, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        boolean bl2 = false;
        String string2 = string;
        return new u(string2, n2, n3, n4, n5, n6, 0, bl);
    }

    public static void a(u u2) {
        if (u2 != null) {
            u2.d();
            com.mg.bas.g.b(u2.a);
        }
    }
}
