package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;

public final class i {
    private static Date b = new Date();
    public static Calendar a = Calendar.getInstance();
    private static String[] c = new String[]{"dd", "MM", "yyyy", "hh", "mm", "ss"};

    public static boolean a(String string) {
        if (string == null) {
            return true;
        }
        return (string = string.trim()) == null || string.length() == 0;
    }

    public static boolean b(String string) {
        return string == null || string.length() == 0;
    }

    public static boolean a(String string, String string2) {
        if (string == null || string2 == null) {
            return false;
        }
        return (string = string.toUpperCase()).equals(string2 = string2.toUpperCase());
    }

    public static String[] b(String string, String string2) {
        return i.a(string, string2, -1, false);
    }

    public static String[] a(String string, String string2, int n, boolean bl) {
        if (n == 0 || i.b(string)) {
            return null;
        }
        if (string2 == null) {
            return new String[]{string};
        }
        a a2 = new a();
        String string3 = string;
        int n2 = string2.length();
        int n3 = bl ? string3.toLowerCase().indexOf(string2.toLowerCase()) : string3.indexOf(string2);
        if (n3 >= 0) {
            while (n3 >= 0) {
                if (n == 1) {
                    if (!i.b(string3)) {
                        a2.a(string3);
                    }
                    return i.a(a2);
                }
                if (n3 > 0) {
                    string = string3.substring(0, n3);
                    a2.a(string);
                    if (n > 0) {
                        --n;
                    }
                }
                string3 = string3.substring(n3 + n2);
                n3 = bl ? string3.toLowerCase().indexOf(string2.toLowerCase()) : string3.indexOf(string2);
            }
            if (!i.a(string3)) {
                a2.a(string3);
            }
            return i.a(a2);
        }
        return new String[]{string};
    }

    private static String[] a(a a2) {
        if (a2.d() == 0) {
            return null;
        }
        int n = a2.d();
        String[] stringArray = new String[n];
        int n2 = 0;
        while (n2 < n) {
            stringArray[n2] = (String)a2.b(n2);
            ++n2;
        }
        return stringArray;
    }

    public static byte[] c(String string) throws UnsupportedEncodingException {
        return i.c(string, null);
    }

    public static byte[] c(String string, String string2) throws UnsupportedEncodingException {
        if (string2 == null) {
            string2 = "UTF-8";
        }
        if (i.b(string)) {
            return null;
        }
        return string.getBytes(string2);
    }

    private static String a(byte[] byArray, int n, int n2, String string) {
        if (byArray == null) {
            return null;
        }
        if (n2 <= 0) {
            return "";
        }
        try {
            return new String(byArray, n, n2, string);
        }
        catch (Throwable throwable) {
            return new String(byArray, n, n2);
        }
    }

    public static String a(byte[] byArray, int n, int n2) {
        return i.a(byArray, n, n2, "UTF-8");
    }

    public static String a(byte[] byArray) {
        if (byArray == null) {
            return null;
        }
        return i.a(byArray, 0, byArray.length);
    }

    public static String a(String string, String string2, String[] stringArray) {
        int n;
        int n2 = 0;
        int n3 = 0;
        StringBuffer stringBuffer = new StringBuffer();
        while ((n = string.indexOf(string2, n2)) >= 0) {
            stringBuffer.append(string.substring(n2, n));
            stringBuffer.append(stringArray[n3++]);
            n2 = n + string2.length();
            if (n3 >= 4) break;
        }
        stringBuffer.append(string.substring(n2));
        return stringBuffer.toString();
    }

    public static String a(long l) {
        return i.a(l, ",");
    }

    public static String a(long l, String string) {
        if (l < 1000L) {
            return String.valueOf(l);
        }
        String string2 = "";
        while (l >= 1000L) {
            long l2 = l % 1000L;
            string2 = l2 < 10L ? String.valueOf(string) + "00" + l2 + string2 : (l2 < 100L ? String.valueOf(string) + "0" + l2 + string2 : String.valueOf(string) + l2 + string2);
            l /= 1000L;
        }
        string2 = String.valueOf(l) + string2;
        return string2;
    }

    public static String a() {
        long l = System.currentTimeMillis();
        b.setTime(l);
        a.setTime(b);
        return String.valueOf(i.a(a.get(11))) + ":" + i.a(a.get(12));
    }

    private static String a(int n) {
        if (n < 10) {
            return "0" + n;
        }
        return String.valueOf(n);
    }

    public static String b(long l, String string) {
        b.setTime(l);
        a.setTime(b);
        int[] nArray = new int[]{a.get(5), a.get(2) + 1, a.get(1), a.get(11), a.get(12), a.get(13)};
        int n = 0;
        while (n < c.length) {
            int n2 = string.indexOf(c[n]);
            if (n2 >= 0) {
                string = String.valueOf(string.substring(0, n2)) + i.a(nArray[n]) + string.substring(n2 + c[n].length());
            }
            ++n;
        }
        return string;
    }

    public static String b(long l) {
        b.setTime(l);
        a.setTime(b);
        return String.valueOf(a.get(5)) + "/" + (a.get(2) + 1) + "/" + a.get(1) + " " + a.get(11) + ":" + a.get(12) + ":" + a.get(13);
    }

    public static Calendar c(long l) {
        b.setTime(l);
        a.setTime(b);
        return a;
    }
}
