package com.mg.bas;
// Utility class for data serialization, caching, and record store management.
// Decompiled with: CFR 0.152
// Class Version: 1
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import javax.microedition.rms.RecordStore;

public final class pd
extends cs {
    private static u b = null;

    private static void H() {
        b = u.a("olacacher", 2048, 1024, 1, 10);
        int n = 10240;
        cs.a = u.a("161b", 161, 10240);
    }

    public static long b(int[] nArray) {
        if (nArray == null) {
            return 0L;
        }
        byte[] byArray = new byte[nArray.length << 2];
        int n = 0;
        int n2 = 0;
        while (n2 < nArray.length) {
            System.arraycopy(m.a((int)byArray[n2]), 0, byArray, n, 4);
            n += 4;
            ++n2;
        }
        e.a();
        return e.a(byArray);
    }

    public static int a(long l) {
        long l2 = 0L;
        byte[] byArray = cs.a.a(153);
        if (byArray != null) {
            l2 = m.d(byArray);
        }
        if (l2 != l) {
            pd.b(l);
            return 0;
        }
        int n = 0;
        byArray = cs.a.a(154);
        if (byArray != null) {
            n = m.c(byArray);
        }
        return n;
    }

    public static void b(long l) {
        cs.a.b(153, m.a(l));
    }

    public static void a(int n) {
        cs.a.b(154, m.a(n));
    }

    public static void j() {
        cs.a.b(153);
        cs.a.b(154);
        cs.a.a();
    }

    public static long k() {
        int n = 155;
        u u2 = cs.a;
        Object object = u2.a(155);
        Long l = object != null ? new Long(m.d(object)) : null;
        object = l;
        if (l == null) {
            object = new Long(System.currentTimeMillis());
            long l2 = object.longValue();
            if (!cs.a.c(155)) {
                cs.a.b(155, m.a(l2));
            }
        }
        return object.longValue();
    }

    public static void a(String[] stringArray) {
        if (stringArray == null) {
            return;
        }
        byte[] byArray = new byte[1000];
        int n = 0;
        System.arraycopy(m.a(stringArray.length), 0, byArray, 0, 4);
        n += 4;
        int n2 = 0;
        while (n2 < stringArray.length) {
            byte[] byArray2 = stringArray[n2].getBytes();
            System.arraycopy(m.a(byArray2.length), 0, byArray, n, 4);
            System.arraycopy(byArray2, 0, byArray, n += 4, byArray2.length);
            n += byArray2.length;
            ++n2;
        }
        cs.a.b(157, byArray, 0, n);
    }

    public static String[] l() {
        byte[] byArray = cs.a.a(157);
        if (byArray != null) {
            int n = 0;
            int n2 = m.a(byArray, 0);
            n += 4;
            String[] stringArray = new String[n2];
            int n3 = 0;
            while (n3 < stringArray.length) {
                int n4 = m.a(byArray, n);
                stringArray[n3] = new String(byArray, n += 4, n4);
                n += n4;
                ++n3;
            }
            return stringArray;
        }
        return null;
    }

    public static final void m() {
        pd.H();
        int n2 = 0;
        byte[] byArray = cs.a.a(121);
        if (byArray != null) {
            n2 = m.c(byArray);
        }
        if (n2 < 7) {
            try {
                String[] stringArray = RecordStore.listRecordStores();
                if (stringArray != null) {
                    int n3 = 0;
                    while (n3 < stringArray.length) {
                        g.b(stringArray[n3]);
                        ++n3;
                    }
                }
            }
            catch (Throwable throwable) {
                Throwable throwable2 = throwable;
                throwable.printStackTrace();
            }
            pd.H();
            byte[] byArray2 = m.a(7);
            cs.a.b(121, byArray2);
        }
    }

    public static boolean n() {
        return cs.a.c(151);
    }

    public static void o() {
        cs.a.b(151, new byte[]{1});
    }

    public static final String p() {
        byte[] byArray = cs.a.a(112);
        if (byArray != null) {
            return i.a(byArray);
        }
        return null;
    }

    public static final void a(String string) {
        byte[] byArray = null;
        try {
            byArray = i.c(string);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {}
        if (byArray == null || byArray.length <= 0) {
            byArray = new byte[]{};
        }
        cs.a.b(112, byArray);
    }

    public static byte[] q() {
        byte[] byArray = b.a(Integer.MIN_VALUE);
        return byArray;
    }

    public static void b(byte[] byArray) {
        if (byArray == null) {
            return;
        }
        b.a(Integer.MIN_VALUE, byArray);
        b.a(Integer.MIN_VALUE, Long.MAX_VALUE);
        b.a();
    }

    public static void b(String object) {
        byte[] byArray = null;
        try {
            byArray = i.c((String)object);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            object = unsupportedEncodingException;
            unsupportedEncodingException.printStackTrace();
        }
        if (byArray == null) {
            return;
        }
        cs.a.b(119, byArray);
    }

    public static String r() {
        byte[] byArray = cs.a.a(119);
        if (byArray == null) {
            return null;
        }
        return i.a(byArray);
    }

    public static void s() {
        b.b(-2147483647);
        b.b(-2147483646);
        cs.a.b(118);
        cs.a.b(112);
        cs.a.b(150);
        cs.a.a();
        b.a();
        go.d = 0;
    }

    public static void b(String[] stringArray) {
        if (stringArray == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2000);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        Object object = null;
        try {
            dataOutputStream.writeInt(stringArray.length);
            int n2 = 0;
            while (n2 < stringArray.length) {
                object = i.c(stringArray[n2]);
                dataOutputStream.writeInt(((Object)object).length);
                dataOutputStream.write((byte[])object, 0, ((Object)object).length);
                dataOutputStream.flush();
                byteArrayOutputStream.flush();
                object = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArrayOutputStream.close();
                ++n2;
            }
        }
        catch (IOException iOException) {
            try {
                dataOutputStream.close();
                byteArrayOutputStream.close();
            }
            catch (IOException iOException2) {
                object = iOException2;
                iOException2.printStackTrace();
            }
            iOException.printStackTrace();
            return;
        }
        if (object == null) {
            return;
        }
        b.a(-2147483646, (byte[])object);
        b.a(-2147483646, Long.MAX_VALUE);
        b.a();
    }

    public static String[] t() {
        String[] stringArray;
        Object object = b.a(-2147483646);
        if (object == null) {
            return null;
        }
        object = new ByteArrayInputStream((byte[])object);
        DataInputStream dataInputStream = new DataInputStream((InputStream)object);
        try {
            int n2 = dataInputStream.readInt();
            stringArray = new String[n2];
            int n3 = 0;
            while (n3 < n2) {
                byte[] byArray = new byte[dataInputStream.readInt()];
                dataInputStream.read(byArray, 0, byArray.length);
                stringArray[n3] = i.a(byArray);
                ++n3;
            }
            dataInputStream.close();
            object.close();
        }
        catch (Exception exception) {
            try {
                dataInputStream.close();
                object.close();
            }
            catch (IOException iOException) {
                IOException iOException2 = iOException;
                iOException.printStackTrace();
            }
            return null;
        }
        b.b(-2147483646);
        b.a();
        return stringArray;
    }

    public static void a(dt[] objectArray, int n2) {
        if (objectArray == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2000);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            int n3 = objectArray.length;
            int n4 = 0;
            while (n4 < objectArray.length) {
                if (objectArray[n4].a() == 1) {
                    --n3;
                }
                ++n4;
            }
            dataOutputStream.writeInt(n3);
            n4 = 0;
            while (n4 < objectArray.length) {
                if (objectArray[n4].a() != 1) {
                    byte[] byArray = i.c(objectArray[n4].b());
                    dataOutputStream.writeInt(byArray.length);
                    dataOutputStream.write(byArray, 0, byArray.length);
                    n3 = 0;
                    ds[] dsArray = objectArray[n4].c();
                    if (dsArray != null) {
                        n3 = dsArray.length;
                    }
                    dataOutputStream.writeInt(n3);
                    int n5 = 0;
                    while (n5 < n3) {
                        byte[] byArray2 = i.c(dsArray[n5].a());
                        dataOutputStream.writeInt(byArray2.length);
                        dataOutputStream.write(byArray2, 0, byArray2.length);
                        byArray2 = i.c(dsArray[n5].b());
                        if (byArray2 == null) {
                            dataOutputStream.writeInt(0);
                        } else {
                            dataOutputStream.writeInt(byArray2.length);
                            dataOutputStream.write(byArray2, 0, byArray2.length);
                        }
                        ++n5;
                    }
                }
                ++n4;
            }
            dataOutputStream.flush();
            byteArrayOutputStream.flush();
            dataOutputStream.close();
            objectArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        }
        catch (IOException iOException) {
            try {
                dataOutputStream.close();
                byteArrayOutputStream.close();
            }
            catch (IOException iOException2) {
                IOException iOException3 = iOException2;
                iOException2.printStackTrace();
            }
            objectArray = null;
            iOException.printStackTrace();
        }
        if (objectArray == null) {
            return;
        }
        b.a(-2147483647, (byte[])objectArray);
        b.a(-2147483647, Long.MAX_VALUE);
        b.a();
        int n6 = n2;
        byte[] byArray = m.a(n6);
        cs.a.b(118, byArray);
    }

    public static dt[] u() {
        dt[] dtArray;
        Object object = b.a(-2147483647);
        if (object == null) {
            return null;
        }
        object = new ByteArrayInputStream((byte[])object);
        DataInputStream dataInputStream = new DataInputStream((InputStream)object);
        try {
            int n2 = dataInputStream.readInt();
            dtArray = new dt[n2];
            int n3 = 0;
            while (n3 < n2) {
                byte[] byArray = new byte[dataInputStream.readInt()];
                dataInputStream.read(byArray, 0, byArray.length);
                dtArray[n3] = new dt(i.a(byArray));
                ds[] dsArray = new ds[dataInputStream.readInt()];
                int n4 = 0;
                while (n4 < dsArray.length) {
                    dsArray[n4] = new ds();
                    byArray = new byte[dataInputStream.readInt()];
                    dataInputStream.read(byArray, 0, byArray.length);
                    dsArray[n4].a(i.a(byArray));
                    byArray = new byte[dataInputStream.readInt()];
                    if (byArray.length > 0) {
                        dataInputStream.read(byArray, 0, byArray.length);
                        dsArray[n4].b(i.a(byArray));
                    } else {
                        dsArray[n4].b(dsArray[n4].a());
                    }
                    ++n4;
                }
                dtArray[n3].a(dsArray);
                dtArray[n3].a((short)0);
                dataInputStream.close();
                object.close();
                ++n3;
            }
        }
        catch (IOException iOException) {
            try {
                dataInputStream.close();
                object.close();
            }
            catch (IOException iOException2) {
                IOException iOException3 = iOException2;
                iOException2.printStackTrace();
            }
            iOException.printStackTrace();
            return null;
        }
        return dtArray;
    }

    public static int v() {
        byte[] byArray = cs.a.a(118);
        if (byArray == null) {
            return go.d;
        }
        return m.c(byArray);
    }

    public static final boolean b(int n2) {
        if (n2 < -2147483643) {
            n2 += 5;
        }
        return b.c(n2);
    }

    public static final void a(byte[] byArray, String object) {
        byte[] byArray2;
        if (byArray == null) {
            return;
        }
        int n2 = ((String)object).hashCode();
        if (n2 < -2147483643) {
            n2 += 5;
        }
        try {
            byArray2 = i.c((String)object);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            byArray2 = ((String)object).getBytes();
        }
        object = new byte[byArray.length + byArray2.length + 4];
        System.arraycopy(m.a(byArray2.length), 0, object, 0, 4);
        System.arraycopy(byArray2, 0, object, 4, byArray2.length);
        System.arraycopy(byArray, 0, object, 4 + byArray2.length, byArray.length);
        b.b(n2, (byte[])object);
    }

    public static final byte[] c(int n2) {
        if (n2 < -2147483643) {
            n2 += 5;
        }
        byte[] byArray = b.a(n2);
        b.e();
        return byArray;
    }

    public static final int w() {
        byte[] byArray = cs.a.a(113);
        if (byArray == null) {
            return 24;
        }
        return m.c(byArray);
    }

    public static final void d(int n2) {
        byte[] byArray = m.a(n2);
        cs.a.b(113, byArray);
    }

    public static final int x() {
        byte[] byArray = cs.a.a(120);
        if (byArray == null) {
            return 0;
        }
        return m.c(byArray);
    }

    public static final void e(int n2) {
        byte[] byArray = m.a(n2);
        cs.a.b(120, byArray);
    }

    public static final int y() {
        byte[] byArray = cs.a.a(117);
        if (byArray == null) {
            return go.b;
        }
        return m.c(byArray);
    }

    public static final void f(int n2) {
        byte[] byArray = m.a(n2);
        cs.a.b(117, byArray);
    }

    public static final void z() {
        byte[] byArray = new byte[]{1};
        cs.a.b(114, byArray);
    }

    public static final void A() {
        byte[] byArray = new byte[3];
        byArray[1] = 18;
        byte[] byArray2 = byArray;
        cs.a.b(152, byArray2);
    }

    public static final boolean B() {
        if (cs.a.c(152)) {
            byte[] byArray = cs.a.a(152);
            return byArray[0] == 0 && byArray[1] == 18 && byArray[2] == 0;
        }
        return false;
    }

    public static final void c(long l) {
        byte[] byArray = m.a(l);
        cs.a.b(160, byArray);
    }

    public static void g(int n2) {
        byte[] byArray = m.a((long)n2);
        cs.a.b(162, byArray);
    }

    public static final int C() {
        byte[] byArray;
        if (cs.a.c(162) && (byArray = cs.a.a(162)) != null) {
            return m.c(byArray);
        }
        return -1;
    }

    public static final boolean d(long l) {
        byte[] byArray;
        if (cs.a.c(160) && (byArray = cs.a.a(160)) != null) {
            long l2 = m.d(byArray);
            return l2 == l;
        }
        return false;
    }

    public static final boolean D() {
        return cs.a.c(114);
    }

    public static String[][] E() {
        String[][] stringArray = null;
        if (cs.a.c(115)) {
            byte[] byArray = cs.a.a(115);
            int n2 = 0;
            int n3 = m.a(byArray, 0);
            stringArray = new String[n3][2];
            n2 += 4;
            int n4 = 0;
            while (n4 < n3) {
                int n5 = m.a(byArray, n2);
                stringArray[n4][0] = i.a(byArray, n2 += 4, n5);
                n2 += n5;
                n5 = m.a(byArray, n2);
                stringArray[n4][1] = i.a(byArray, n2 += 4, n5);
                n2 += n5;
                ++n4;
            }
        }
        return stringArray;
    }

    public static String[][] a(String[][] stringArray, String object, String string) {
        int n2;
        String string2 = string = string == null ? "" : string;
        if (((String)object).length() > 15) {
            object = String.valueOf(((String)object).substring(0, 12)) + "...";
        }
        if (stringArray == null) {
            stringArray = "#sq".equals(string) ? new String[][]{{object, string}, {"#ola", "#ola"}} : ("#ola".equals(string) ? new String[][]{{object, string}, {"#sq", "#sq"}} : new String[][]{{object, string}, {"#sq", "#sq"}, {"#ola", "#ola"}});
        } else {
            boolean bl = false;
            int n3 = 0;
            while (n3 < stringArray.length) {
                if (stringArray[n3][1].equals(string)) {
                    n2 = n3 - 1;
                    while (n2 >= 0) {
                        stringArray[n2 + 1] = stringArray[n2];
                        --n2;
                    }
                    stringArray[0] = new String[]{object, string};
                    bl = true;
                    break;
                }
                ++n3;
            }
            if (!bl) {
                String[][] stringArray2 = new String[stringArray.length + 1][2];
                n2 = 1;
                while (n2 < stringArray2.length) {
                    stringArray2[n2] = stringArray[n2 - 1];
                    ++n2;
                }
                stringArray = stringArray2;
                stringArray2[0] = new String[]{object, string};
            }
        }
        if (stringArray.length > 5) {
            String[][] stringArray3 = new String[stringArray.length - 1][2];
            int n4 = 0;
            while (n4 < stringArray3.length) {
                stringArray3[n4] = stringArray[n4];
                ++n4;
            }
            stringArray = stringArray3;
        }
        byte[] byArray = new byte[1000];
        int n5 = 0;
        System.arraycopy(m.a(stringArray.length), 0, byArray, 0, 4);
        n5 += 4;
        n2 = 0;
        while (n2 < stringArray.length) {
            byte[] byArray2 = pd.a(stringArray[n2][0], stringArray[n2][1]);
            object = byArray2;
            System.arraycopy(byArray2, 0, byArray, n5, ((Object)object).length);
            n5 += ((Object)object).length;
            ++n2;
        }
        cs.a.b(115, byArray, 0, n5);
        return stringArray;
    }

    private static byte[] a(String object, String object2) {
        try {
            byte[] byArray = i.c((String)object);
            byte[] byArray2 = i.c((String)object2);
            object2 = byArray2;
            if (byArray2 == null) {
                object2 = new byte[0];
            }
            object = new byte[byArray.length + ((Object)object2).length + 8];
            System.arraycopy(m.a(byArray.length), 0, object, 0, 4);
            System.arraycopy(byArray, 0, object, 4, byArray.length);
            int n2 = 4 + byArray.length;
            System.arraycopy(m.a(((Object)object2).length), 0, object, n2, 4);
            System.arraycopy(object2, 0, object, n2 += 4, ((Object)object2).length);
        }
        catch (Throwable throwable) {
            Throwable throwable2 = throwable;
            throwable.printStackTrace();
            return null;
        }
        return object;
    }

    public static final int F() {
        byte[] byArray = cs.a.a(116);
        if (byArray == null) {
            return 0;
        }
        return m.c(byArray);
    }

    public static final void h(int n2) {
        byte[] byArray = m.a(n2);
        cs.a.b(116, byArray);
    }

    public static final void b(boolean bl) {
        byte[] byArray = new byte[]{(byte)(bl ? 1 : 0)};
        cs.a.a(150, byArray);
        if (go.t != bl) {
            go.t = !bl;
        }
        cs.a.a();
    }

    public static final int G() {
        byte[] byArray = cs.a.a(150);
        if (byArray == null) {
            return 0;
        }
        return byArray[0];
    }
}
