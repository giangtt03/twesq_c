package com.mg.bas;
// Dynamic array class for storing Objects, similar to a simple ArrayList. Supports add, remove, and array assignment operations.
// Decompiled with: CFR 0.152
// Class Version: 1
public final class a {
    private Object[] a;
    private int b = 0;

    public a() {
    }

    public a(int n) {
        this();
        this.a = new Object[n];
    }

    public final void a(Object[] objectArray) {
        if (objectArray != null) {
            this.a = objectArray;
        }
    }

    public final void a(Object object) {
        if (this.a == null) {
            this.a = new Object[10];
        }
        if (this.b >= this.a.length) {
            Object[] objectArray = new Object[this.a.length + 10];
            System.arraycopy(this.a, 0, objectArray, 0, this.a.length);
            this.a = objectArray;
        }
        this.a[this.b] = object;
        ++this.b;
    }

    public final void a(Object object, int n) {
        a a2;
        block5: {
            block4: {
                if (n < 0) break block4;
                a2 = this;
                if (n <= a2.b) break block5;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        a2 = this;
        if (n == a2.b) {
            this.a(object);
            return;
        }
        this.a[n] = object;
    }

    public final void b(Object object, int n) {
        block5: {
            block4: {
                if (n < 0) break block4;
                a a2 = this;
                if (n <= a2.b) break block5;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        if (this.a == null) {
            this.a = new Object[10];
        }
        int n2 = this.b >= this.a.length ? this.a.length + 10 : this.a.length;
        Object[] objectArray = new Object[n2];
        System.arraycopy(this.a, 0, objectArray, 0, n);
        System.arraycopy(this.a, n, objectArray, n + 1, this.b - n);
        this.a = objectArray;
        this.a[n] = object;
        ++this.b;
    }

    public final void a(int n, int n2) {
        if (n >= 0) {
            Object object = this;
            if (n < ((a)object).b && n2 >= 0) {
                object = this;
                if (n2 < ((a)object).b) {
                    object = this.a[n];
                    this.a[n] = this.a[n2];
                    this.a[n2] = object;
                }
            }
        }
    }

    public final Object a(int n) {
        Object object;
        block6: {
            block5: {
                if (this.a == null) {
                    return null;
                }
                if (n < 0) break block5;
                object = this;
                if (n <= ((a)object).b) break block6;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        object = this.a[n];
        this.a[n] = null;
        --this.b;
        if (n < this.a.length - 1) {
            System.arraycopy(this.a, n + 1, this.a, n, this.b - n);
        }
        return object;
    }

    public final void a() {
        this.a = null;
        this.b = 0;
    }

    public final Object b(Object object) {
        if (this.a == null) {
            return null;
        }
        int n = 0;
        while (n < this.b) {
            if (this.a[n].equals(object)) {
                return this.a(n);
            }
            ++n;
        }
        return null;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    public final int c(Object object) {
        block4: {
            a a2;
            int n;
            block5: {
                if (this.a == null) {
                    return -1;
                }
                if (object == null) break block4;
                n = 0;
                if (!true) break block5;
                a2 = this;
                if (n >= a2.b) break block4;
            }
            do {
                if (object.equals(this.a[n])) {
                    return n;
                }
                ++n;
                a2 = this;
            } while (n < a2.b);
        }
        return -1;
    }

    public final Object b() {
        if (this.a == null) {
            return null;
        }
        a a2 = this;
        if (a2.b > 0) {
            return this.a[0];
        }
        return null;
    }

    public final Object c() {
        if (this.a == null) {
            return null;
        }
        a a2 = this;
        if (a2.b > 0) {
            return this.a[this.b - 1];
        }
        return null;
    }

    public final Object b(int n) {
        if (this.a == null) {
            return null;
        }
        if (n >= this.b || n < 0) {
            return null;
        }
        return this.a[n];
    }

    public final int d() {
        return this.b;
    }

    public final Object[] e() {
        Object[] objectArray = new Object[] { this };
        objectArray = new Object[this.b];
        System.arraycopy(this.a, 0, objectArray, 0, objectArray.length);
        return this.a;
    }

    public final String toString() {
        String string = "";
        a a2 = this;
        if (a2.b == 0) {
            string = "[Size]: 0";
        } else {
            int n = 0;
            while (n < this.b) {
                string = this.a[n] != null ? String.valueOf(string) + "\n[Index]: " + n + " [Object]: " + this.a[n].toString() : String.valueOf(string) + "\n[Index]: " + n + " [Object]: NULL";
                ++n;
            }
        }
        return string;
    }
}
