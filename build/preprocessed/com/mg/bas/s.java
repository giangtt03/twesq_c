package com.mg.bas;
// Manager for scheduling and running tasks (Runnable, manages r callbacks).
public final class s
implements Runnable {
    private static s a;
    private static Object b;
    private boolean c = true;
    private r[] d;

    private s() {
        b = new Object();
        this.c = false;
    }

    public final void a(int n) {
        this.d = new r[6];
        this.c = false;
        new Thread(this).start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(r object) {
        if (this.d == null) {
            return;
        }
        int n = 0;
        while (n < this.d.length) {
            if (this.d[n] == null) {
                this.d[n] = object;
                try {
                    object = b;
                    synchronized (object) {
                        b.notify();
                        return;
                    }
                }
                catch (Exception exception) {
                    try {
                        object = b;
                        synchronized (object) {
                            b.notify();
                            return;
                        }
                    }
                    catch (Exception exception2) {
                        return;
                    }
                }
            }
            ++n;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void run() {
        while (!this.c) {
            boolean bl;
            do {
                bl = false;
                int n = 0;
                while (n < this.d.length) {
                    if (this.d[n] != null) {
                        this.d[n].a();
                        this.d[n] = null;
                        bl = true;
                    }
                    ++n;
                }
            } while (bl);
            try {
                Object object = b;
                synchronized (object) {
                    b.wait();
                }
            }
            catch (Exception exception) {}
        }
    }

    public static s a() {
        if (a == null) {
            a = new s();
        }
        return a;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void b() {
        this.c = true;
        Object object = b;
        synchronized (object) {
            b.notify();
            return;
        }
    }
}
