package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class dy {
    public int a;
    public int b;
    public dx[] c;

    public final byte[] a(short s) {
        if (this.c == null) {
            return null;
        }
        int n = 0;
        while (n < this.c.length) {
            if (this.c[n].a == s) {
                return this.c[n].b;
            }
            ++n;
        }
        return null;
    }

    public final String b(short s) {
        return i.a(this.a(s));
    }

    public final int a(short s, int n) {
        if (this.c == null) {
            return -1;
        }
        if (n < 0) {
            n = -1;
        } else if (n >= this.c.length) {
            n = this.c.length - 1;
        }
        ++n;
        while (n < this.c.length) {
            if (this.c[n].a == s) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    public final int a(short s, int n, int n2) {
        if (this.c == null) {
            return -1;
        }
        if (n < 0) {
            n = -1;
        } else if (n >= this.c.length) {
            n = this.c.length - 1;
        }
        if (n2 < 0) {
            n2 = this.c.length;
        }
        if (n + 1 >= n2) {
            return -1;
        }
        ++n;
        while (n < this.c.length && n < n2) {
            if (this.c[n].a == s) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    public final String b(short s, int n, int n2) {
        int n3 = this.a(s, n, n2);
        s = (short)n3;
        if (n3 >= 0) {
            return this.b((int)s);
        }
        return null;
    }

    public final long a(short s, int n, int n2, long l) {
        int n3 = this.a(s, n, n2);
        s = (short)n3;
        if (n3 >= 0) {
            return this.a((int)s, 0L);
        }
        return 0L;
    }

    public final int a(short s, int n, int n2, int n3) {
        int n4 = this.a(s, n, n2);
        s = (short)n4;
        if (n4 >= 0) {
            return this.a((int)s, 0);
        }
        return 0;
    }

    public final byte a(short s, int n, int n2, byte by) {
        int n3 = this.a(s, n, n2);
        s = (short)n3;
        if (n3 >= 0) {
            return this.a((int)s, by);
        }
        return by;
    }

    public final byte a(short s, int n, int n2, short s2) {
        return this.a(s, n, n2, (byte)s2);
    }

    public final int b(short s, int n) {
        if (this.c == null) {
            return -1;
        }
        int n2 = 0;
        while (n2 < this.c.length) {
            if (this.c[n2].a == s) {
                if (n == 0) {
                    return n2;
                }
                --n;
            }
            ++n2;
        }
        return -1;
    }

    public final int c(short s) {
        int n = 0;
        if (this.c == null) {
            return 0;
        }
        int n2 = 0;
        while (n2 < this.c.length) {
            if (this.c[n2].a == s) {
                ++n;
            }
            ++n2;
        }
        return n;
    }

    public final byte[] a(int n) {
        if (this.c == null || n < 0 || n >= this.c.length) {
            return null;
        }
        return this.c[n].b;
    }

    public final String b(int n) {
        return i.a(this.a(n));
    }

    public final long a(int n, long l) {
        long l2 = l;
        byte[] byArray = this.a(n);
        if (byArray == null) {
            return l2;
        }
        return m.d(byArray);
    }

    public final int a(int n, int n2) {
        byte[] byArray = this.a(n);
        if (byArray == null) {
            return n2;
        }
        if (byArray.length == 1) {
            return m.a(byArray[0]);
        }
        if (byArray.length == 2) {
            return m.a(byArray);
        }
        if (byArray.length == 3) {
            return m.b(byArray);
        }
        return m.c(byArray);
    }

    public final byte a(int n, byte by) {
        byte[] byArray = this.a(n);
        if (byArray == null) {
            return by;
        }
        return byArray[0];
    }

    public final byte a(int n, short s) {
        return this.a(n, (byte)s);
    }

    public final String toString() {
        String string = "";
        string = String.valueOf(string) + "[Service]: " + this.b + " [Length]: " + this.a + " [Number Of Keys]: " + (this.c != null ? String.valueOf(this.c.length) : "Null");
        if (this.c != null) {
            string = String.valueOf(string) + "\n";
            int n = 0;
            while (n < this.c.length) {
                string = String.valueOf(string) + " [Key]: " + this.c[n].a + " [Value length]: " + this.c[n].b.length;
                ++n;
            }
        }
        return string;
    }
}
