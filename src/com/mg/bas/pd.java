package com.mg.bas;
// Decompiled with: Procyon 0.6.0
// Class Version: 1
import java.io.InputStream;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import javax.microedition.rms.RecordStore;

public final class pd extends cs
{
    private static u b;
    
    static {
        pd.b = null;
    }
    
    private static void H() {
        pd.b = u.a("olacacher", 2048, 1024, 1, 10);
        cs.a = u.a("161b", 161, 10240);
    }
    
    public static long b(final int[] array) {
        if (array == null) {
            return 0L;
        }
        final byte[] array2 = new byte[array.length << 2];
        int n = 0;
        for (int i = 0; i < array.length; ++i) {
            System.arraycopy(m.a((int)array2[i]), 0, array2, n, 4);
            n += 4;
        }
        e.a();
        return e.a(array2);
    }
    
    public static int a(final long n) {
        long d = 0L;
        final byte[] a;
        if ((a = cs.a.a(153)) != null) {
            d = m.d(a);
        }
        if (d != n) {
            b(n);
            return 0;
        }
        int c = 0;
        final byte[] a2;
        if ((a2 = cs.a.a(154)) != null) {
            c = m.c(a2);
        }
        return c;
    }
    
    public static void b(final long n) {
        cs.a.b(153, m.a(n));
    }
    
    public static void a(final int n) {
        cs.a.b(154, m.a(n));
    }
    
    public static void j() {
        cs.a.b(153);
        cs.a.b(154);
        cs.a.a();
    }
    
    public static long k() {
        final byte[] a = cs.a.a(155);
        long n;
        if (a != null) {
            n = m.d(a);
        } else {
            n = System.currentTimeMillis();
            if (!cs.a.c(155)) {
                cs.a.b(155, m.a(n));
            }
        }
        return n;
    }
    
    public static void a(final String[] array) {
        if (array == null) {
            return;
        }
        final byte[] array2 = new byte[1000];
        int n = 0;
        System.arraycopy(m.a(array.length), 0, array2, 0, 4);
        n += 4;
        for (int i = 0; i < array.length; ++i) {
            final byte[] bytes;
            System.arraycopy(m.a((bytes = array[i].getBytes()).length), 0, array2, n, 4);
            n += 4;
            System.arraycopy(bytes, 0, array2, n, bytes.length);
            n += bytes.length;
        }
        cs.a.b(157, array2, 0, n);
    }
    
    public static String[] l() {
        final byte[] a;
        if ((a = cs.a.a(157)) != null) {
            int n = 0;
            final int a2 = m.a(a, 0);
            n += 4;
            final String[] array = new String[a2];
            for (int i = 0; i < array.length; ++i) {
                final int a3 = m.a(a, n);
                n += 4;
                array[i] = new String(a, n, a3);
                n += a3;
            }
            return array;
        }
        return null;
    }
    
    public static final void m() {
        H();
        int c = 0;
        final byte[] a;
        if ((a = cs.a.a(121)) != null) {
            c = m.c(a);
        }
        if (c < 7) {
            try {
                final String[] listRecordStores;
                if ((listRecordStores = RecordStore.listRecordStores()) != null) {
                    for (int i = 0; i < listRecordStores.length; ++i) {
                        g.b(listRecordStores[i]);
                    }
                }
            }
            catch (final Throwable t) {
//                final Throwable t2;
                t.printStackTrace();
            }
            H();
            cs.a.b(121, m.a(7));
        }
    }
    
    public static boolean n() {
        return cs.a.c(151);
    }
    
    public static void o() {
        cs.a.b(151, new byte[] { 1 });
    }
    
    public static final String p() {
        final byte[] a;
        if ((a = cs.a.a(112)) != null) {
            return i.a(a);
        }
        return null;
    }
    
    public static final void a(final String s) {
        byte[] c = null;
        try {
            c = i.c(s);
        }
        catch (final UnsupportedEncodingException ex) {}
        if (c == null || c.length <= 0) {
            c = new byte[0];
        }
        cs.a.b(112, c);
    }
    
    public static byte[] q() {
        return pd.b.a(Integer.MIN_VALUE);
    }
    
    public static void b(final byte[] array) {
        if (array == null) {
            return;
        }
        pd.b.a(Integer.MIN_VALUE, array);
        pd.b.a(Integer.MIN_VALUE, Long.MAX_VALUE);
        pd.b.a();
    }
    
    public static void b(final String s) {
        byte[] c = null;
        try {
            c = i.c(s);
        }
        catch (final UnsupportedEncodingException ex) {
//            final Throwable t;
            ex.printStackTrace();
        }
        if (c == null) {
            return;
        }
        cs.a.b(119, c);
    }
    
    public static String r() {
        final byte[] a;
        if ((a = cs.a.a(119)) == null) {
            return null;
        }
        return i.a(a);
    }
    
    public static void s() {
        pd.b.b(-2147483647);
        pd.b.b(-2147483646);
        cs.a.b(118);
        cs.a.b(112);
        cs.a.b(150);
        cs.a.a();
        pd.b.a();
        go.d = 0;
    }
    
    public static void b(final String[] array) {
        if (array == null) {
            return;
        }
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2000);
        final DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        byte[] byteArray = null;
        try {
            dataOutputStream.writeInt(array.length);
            for (int i = 0; i < array.length; ++i) {
                final byte[] c = com.mg.bas.i.c(array[i]);
                dataOutputStream.writeInt(c.length);
                dataOutputStream.write(c, 0, c.length);
                dataOutputStream.flush();
                byteArrayOutputStream.flush();
                byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArrayOutputStream.close();
            }
        }
        catch (final IOException ex) {
            try {
                dataOutputStream.close();
                byteArrayOutputStream.close();
            }
            catch (final IOException ex2) {
//                final Throwable t;
                ex2.printStackTrace();
            }
            ex.printStackTrace();
            return;
        }
        if (byteArray == null) {
            return;
        }
        pd.b.a(-2147483646, byteArray);
        pd.b.a(-2147483646, Long.MAX_VALUE);
        pd.b.a();
    }
    
    public static String[] t() {
        final byte[] a;
        if ((a = pd.b.a(-2147483646)) == null) {
            return null;
        }
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a);
        final DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        String[] array;
        try {
            final int int1;
            array = new String[int1 = dataInputStream.readInt()];
            for (int i = 0; i < int1; ++i) {
                final byte[] array2 = new byte[dataInputStream.readInt()];
                dataInputStream.read(array2, 0, array2.length);
                array[i] = com.mg.bas.i.a(array2);
            }
            dataInputStream.close();
            byteArrayInputStream.close();
        }
        catch (final Exception ex) {
            try {
                dataInputStream.close();
                byteArrayInputStream.close();
            }
            catch (final IOException ex2) {
//                final Throwable t;
                ex2.printStackTrace();
            }
            return null;
        }
        pd.b.b(-2147483646);
        pd.b.a();
        return array;
    }
    
    public static void a(final dt[] array, final int n) {
        if (array == null) {
            return;
        }
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2000);
        final DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        byte[] byteArray;
        try {
            int length = array.length;
            for (int i = 0; i < array.length; ++i) {
                if (array[i].a() == 1) {
                    --length;
                }
            }
            dataOutputStream.writeInt(length);
            for (int j = 0; j < array.length; ++j) {
                if (array[j].a() != 1) {
                    final byte[] c = i.c(array[j].b());
                    dataOutputStream.writeInt(c.length);
                    dataOutputStream.write(c, 0, c.length);
                    int length2 = 0;
                    final ds[] c2;
                    if ((c2 = array[j].c()) != null) {
                        length2 = c2.length;
                    }
                    dataOutputStream.writeInt(length2);
                    for (int k = 0; k < length2; ++k) {
                        final byte[] c3 = i.c(c2[k].a());
                        dataOutputStream.writeInt(c3.length);
                        dataOutputStream.write(c3, 0, c3.length);
                        final byte[] c4;
                        if ((c4 = i.c(c2[k].b())) == null) {
                            dataOutputStream.writeInt(0);
                        }
                        else {
                            dataOutputStream.writeInt(c4.length);
                            dataOutputStream.write(c4, 0, c4.length);
                        }
                    }
                }
            }
            dataOutputStream.flush();
            byteArrayOutputStream.flush();
            dataOutputStream.close();
            byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        }
        catch (final IOException ex) {
            try {
                dataOutputStream.close();
                byteArrayOutputStream.close();
            }
            catch (final IOException ex2) {
//                final Throwable t;
                ex2.printStackTrace();
            }
            byteArray = null;
            ex.printStackTrace();
        }
        if (byteArray == null) {
            return;
        }
        pd.b.a(-2147483647, byteArray);
        pd.b.a(-2147483647, Long.MAX_VALUE);
        pd.b.a();
        cs.a.b(118, m.a(n));
    }
    
    public static dt[] u() {
        final byte[] a;
        if ((a = pd.b.a(-2147483647)) == null) {
            return null;
        }
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a);
        final DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        dt[] array;
        try {
            final int int1;
            array = new dt[int1 = dataInputStream.readInt()];
            for (int i = 0; i < int1; ++i) {
                final byte[] array2 = new byte[dataInputStream.readInt()];
                dataInputStream.read(array2, 0, array2.length);
                array[i] = new dt(com.mg.bas.i.a(array2));
                final ds[] array3 = new ds[dataInputStream.readInt()];
                for (int j = 0; j < array3.length; ++j) {
                    array3[j] = new ds();
                    final byte[] array4 = new byte[dataInputStream.readInt()];
                    dataInputStream.read(array4, 0, array4.length);
                    array3[j].a(com.mg.bas.i.a(array4));
                    final byte[] array5;
                    if ((array5 = new byte[dataInputStream.readInt()]).length > 0) {
                        dataInputStream.read(array5, 0, array5.length);
                        array3[j].b(com.mg.bas.i.a(array5));
                    }
                    else {
                        array3[j].b(array3[j].a());
                    }
                }
                array[i].a(array3);
                array[i].a((short)0);
                dataInputStream.close();
                byteArrayInputStream.close();
            }
        }
        catch (final IOException ex) {
            try {
                dataInputStream.close();
                byteArrayInputStream.close();
            }
            catch (final IOException ex2) {
//                final Throwable t;
                ex2.printStackTrace();
            }
            ex.printStackTrace();
            return null;
        }
        return array;
    }
    
    public static int v() {
        final byte[] a;
        if ((a = cs.a.a(118)) == null) {
            return go.d;
        }
        return m.c(a);
    }
    
    public static final boolean b(int n) {
        if (n < -2147483643) {
            n += 5;
        }
        return pd.b.c(n);
    }
    
    public static final void a(final byte[] array, final String s) {
        if (array == null) {
            return;
        }
        int hashCode;
        if ((hashCode = s.hashCode()) < -2147483643) {
            hashCode += 5;
        }
        byte[] array2;
        try {
            array2 = i.c(s);
        }
        catch (final UnsupportedEncodingException ex) {
            array2 = s.getBytes();
        }
        final byte[] array3 = new byte[array.length + array2.length + 4];
        System.arraycopy(m.a(array2.length), 0, array3, 0, 4);
        System.arraycopy(array2, 0, array3, 4, array2.length);
        System.arraycopy(array, 0, array3, 4 + array2.length, array.length);
        pd.b.b(hashCode, array3);
    }
    
    public static final byte[] c(int n) {
        if (n < -2147483643) {
            n += 5;
        }
        final byte[] a = pd.b.a(n);
        pd.b.e();
        return a;
    }
    
    public static final int w() {
        final byte[] a;
        if ((a = cs.a.a(113)) == null) {
            return 24;
        }
        return m.c(a);
    }
    
    public static final void d(final int n) {
        cs.a.b(113, m.a(n));
    }
    
    public static final int x() {
        final byte[] a;
        if ((a = cs.a.a(120)) == null) {
            return 0;
        }
        return m.c(a);
    }
    
    public static final void e(final int n) {
        cs.a.b(120, m.a(n));
    }
    
    public static final int y() {
        final byte[] a;
        if ((a = cs.a.a(117)) == null) {
            return go.b;
        }
        return m.c(a);
    }
    
    public static final void f(final int n) {
        cs.a.b(117, m.a(n));
    }
    
    public static final void z() {
        cs.a.b(114, new byte[] { 1 });
    }
    
    public static final void A() {
        cs.a.b(152, new byte[] { 0, 18, 0 });
    }
    
    public static final boolean B() {
        final byte[] a;
        return cs.a.c(152) && (a = cs.a.a(152))[0] == 0 && a[1] == 18 && a[2] == 0;
    }
    
    public static final void c(final long n) {
        cs.a.b(160, m.a(n));
    }
    
    public static void g(final int n) {
        cs.a.b(162, m.a((long)n));
    }
    
    public static final int C() {
        final byte[] a;
        if (cs.a.c(162) && (a = cs.a.a(162)) != null) {
            return m.c(a);
        }
        return -1;
    }
    
    public static final boolean d(final long n) {
        final byte[] a;
        return cs.a.c(160) && (a = cs.a.a(160)) != null && m.d(a) == n;
    }
    
    public static final boolean D() {
        return cs.a.c(114);
    }
    
    public static String[][] E() {
        String[][] array = null;
        if (cs.a.c(115)) {
            final byte[] a = cs.a.a(115);
            int n = 0;
            final int a2;
            array = new String[a2 = m.a(a, 0)][2];
            n += 4;
            for (int i = 0; i < a2; ++i) {
                final int a3 = m.a(a, n);
                n += 4;
                array[i][0] = com.mg.bas.i.a(a, n, a3);
                int n2 = n + a3;
                final int a4 = m.a(a, n2);
                n2 += 4;
                array[i][1] = com.mg.bas.i.a(a, n2, a4);
                n = n2 + a4;
            }
        }
        return array;
    }
    
    public static String[][] a(String[][] array, String string, String s) {
        s = ((s == null) ? "" : s);
        if (string.length() > 15) {
            string = String.valueOf(string.substring(0, 12)) + "...";
        }
        if (array == null) {
            if ("#sq".equals(s)) {
                array = new String[][] { { string, s }, { "#ola", "#ola" } };
            }
            else if ("#ola".equals(s)) {
                array = new String[][] { { string, s }, { "#sq", "#sq" } };
            }
            else {
                array = new String[][] { { string, s }, { "#sq", "#sq" }, { "#ola", "#ola" } };
            }
        }
        else {
            boolean b = false;
            for (int i = 0; i < array.length; ++i) {
                if (array[i][1].equals(s)) {
                    for (int j = i - 1; j >= 0; --j) {
                        array[j + 1] = array[j];
                    }
                    array[0] = new String[] { string, s };
                    b = true;
                    break;
                }
            }
            if (!b) {
                final String[][] array2 = new String[array.length + 1][2];
                for (int k = 1; k < array2.length; ++k) {
                    array2[k] = array[k - 1];
                }
                (array = array2)[0] = new String[] { string, s };
            }
        }
        if (array.length > 5) {
            final String[][] array3 = new String[array.length - 1][2];
            for (int l = 0; l < array3.length; ++l) {
                array3[l] = array[l];
            }
            array = array3;
        }
        final byte[] array4 = new byte[1000];
        int n = 0;
        System.arraycopy(m.a(array.length), 0, array4, 0, 4);
        n += 4;
        for (int n2 = 0; n2 < array.length; ++n2) {
            final byte[] a;
            System.arraycopy(a = a(array[n2][0], array[n2][1]), 0, array4, n, a.length);
            n += a.length;
        }
        cs.a.b(115, array4, 0, n);
        return array;
    }
    
    private static byte[] a(final String s, final String s2) {
        byte[] array;
        try {
            final byte[] c = i.c(s);
            byte[] c2;
            if ((c2 = i.c(s2)) == null) {
                c2 = new byte[0];
            }
            array = new byte[c.length + c2.length + 8];
            System.arraycopy(m.a(c.length), 0, array, 0, 4);
            System.arraycopy(c, 0, array, 4, c.length);
            int n = 4 + c.length;
            System.arraycopy(m.a(c2.length), 0, array, n, 4);
            n += 4;
            System.arraycopy(c2, 0, array, n, c2.length);
        }
        catch (final Throwable t) {
//            final Throwable t2;
            t.printStackTrace();
            return null;
        }
        return array;
    }
    
    public static final int F() {
        final byte[] a;
        if ((a = cs.a.a(116)) == null) {
            return 0;
        }
        return m.c(a);
    }
    
    public static final void h(final int n) {
        cs.a.b(116, m.a(n));
    }
    
    public static final void b(final boolean b) {
        cs.a.a(150, new byte[] { (byte)(b ? 1 : 0) });
        if (go.t != b) {
            go.t = !b;
        }
        cs.a.a();
    }
    
    public static final int G() {
        final byte[] a;
        if ((a = cs.a.a(150)) == null) {
            return 0;
        }
        return a[0];
    }
}
