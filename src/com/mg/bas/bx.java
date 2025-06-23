package com.mg.bas;
// Font and text rendering utility class, manages multiple font styles and provides text layout helpers.
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class bx {
    private static bx f = null;
    public static d a;
    public static d b;
    public static d c;
    private static d g;
    public static d d;
    public static d e;
    private static int h;
    private static String[] i;
    private static char j;
    private static char k;
    private static char l;
    private static char m;
    private static char n;
    private static char o;
    private static char p;
    private static char q;

    static {
        h = -1;
        i = null;
        j = (char)41;
        k = (char)41;
        l = (char)41;
        m = (char)41;
        n = (char)40;
        o = (char)40;
        p = (char)40;
        q = (char)40;
    }

    private bx() {
        byte[] object2;
        a = new bz();
        try {
            object2 = com.mg.bas.f.c("/_fontcap");
            c = new ca(com.mg.bas.f.a(object2));
            com.mg.bas.h.a(object2, new int[]{0xFFFFFF}, new int[]{0xFFFF68});
            b = new ca(com.mg.bas.f.a(object2));
        }
        catch (Exception exception) {}
        d d2 = b;
        g = d2;
    }

    public static void a(d d2) {
        g = d2;
    }

    public static void a() {
        if (f == null) {
            f = new bx();
        }
    }

    public static String[] a(String string, int n) {
        return bx.a(string, n, g);
    }

    public static String[] a(String string, int n, d d2) {
        int n2;
        int n3;
        a a2 = new a(10);
        int n4 = 0;
        int n5 = -1;
        String string2 = "";
        block0: while (n4 < string.length()) {
            if (n5 == n4) {
                ++n4;
            }
            while (true) {
                if (n4 >= string.length() || string.charAt(n4) != ' ') {
                    if (n4 <= 0 || a2.d() != 0 || n4 * d2.a(' ') >= n) break;
                    String string3 = "";
                    n3 = 0;
                    while (n3 < n4) {
                        string3 = String.valueOf(string3) + ' ';
                        ++n3;
                    }
                    a2.a(string3);
                    break;
                }
                n5 = n4++;
            }
            while (true) {
                if (n4 >= string.length() || string.charAt(n4) == ' ' || string.charAt(n4) == '\r') {
                    if (string2.length() > 0) {
                        if (n4 < string.length() && string.charAt(n4) == '\r') {
                            string2 = String.valueOf(string2) + '\r';
                            n5 = n4++;
                        } else {
                            string2 = String.valueOf(string2) + " ";
                        }
                        int n6 = d2.a(string2);
                        if (n6 < n) {
                            a2.a(string2);
                        } else {
                            n3 = 0;
                            String string4 = "";
                            n2 = 0;
                            while (n3 < string2.length()) {
                                if (n2 + d2.a(string2.charAt(n3)) < n) {
                                    n2 += d2.a(string2.charAt(n3));
                                    string4 = String.valueOf(string4) + string2.charAt(n3);
                                    if (++n3 < string2.length() || string4.length() <= 0) continue;
                                    a2.a(string4);
                                    break;
                                }
                                a2.a(string4);
                                n2 = 0;
                                string4 = "";
                            }
                        }
                    } else if (n4 < string.length() && string.charAt(n4) == '\r') {
                        n5 = n4++;
                    }
                    string2 = "";
                    continue block0;
                }
                string2 = String.valueOf(string2) + string.charAt(n4);
                n5 = n4++;
            }
        }
        String[] stringArray = new String[a2.d()];
        n3 = 0;
        while (n3 < stringArray.length) {
            stringArray[n3] = (String)a2.b(n3);
            ++n3;
        }
        a2 = new a(10);
        String string5 = "";
        int n7 = 0;
        n4 = 0;
        while (true) {
            if (n4 >= stringArray.length) {
                if (string5.length() <= 0) break;
                a2.a(string5);
                break;
            }
            n2 = d2.a(stringArray[n4]);
            if (n7 + n2 - d2.a(' ') < n) {
                n7 += n2;
                string5 = String.valueOf(string5) + stringArray[n4];
                if (stringArray[n4].length() > 0 && stringArray[n4].charAt(stringArray[n4].length() - 1) == '\r') {
                    a2.a(string5);
                    string5 = "";
                    n7 = 0;
                }
                ++n4;
                continue;
            }
            if (n2 - d2.a(' ') >= n) {
                a2.a(stringArray[n4]);
                ++n4;
            } else {
                a2.a(string5);
            }
            string5 = "";
            n7 = 0;
        }
        String[] stringArray2 = new String[a2.d()];
        int n8 = 0;
        while (n8 < stringArray2.length) {
            stringArray2[n8] = (String)a2.b(n8);
            ++n8;
        }
        return stringArray2;
    }

    public static void a(Graphics graphics, d d2, String string, int n, int n2, int n3, int n4, int n5) {
        String[] stringArray;
        if (string.length() == h && string.length() > 8 && j == string.charAt(1) && k == string.charAt(2) && l == string.charAt(3) && m == string.charAt(4) && bx.n == string.charAt(string.length() - 1) && o == string.charAt(string.length() - 2) && p == string.charAt(string.length() - 3) && q == string.charAt(string.length() - 4)) {
            stringArray = i;
        } else {
            stringArray = bx.a(string, n3, d2);
            if (string.length() > 4) {
                h = string.length();
                i = stringArray;
                j = string.charAt(1);
                k = string.charAt(2);
                l = string.charAt(3);
                m = string.charAt(4);
                q = string.charAt(string.length() - 4);
                p = string.charAt(string.length() - 3);
                o = string.charAt(string.length() - 2);
                bx.n = string.charAt(string.length() - 1);
            }
        }
        bx.a(graphics, d2, stringArray, n, n2, n3, n4, 0);
    }

    public static void a(Graphics graphics, d d2, String[] stringArray, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n7 == 1) {
            n3 += n5 / 2;
        } else if (n7 == 2) {
            n3 += n5;
        }
        n2 = n + n2;
        if (n2 > stringArray.length) {
            n2 = stringArray.length;
        }
        n5 = 0;
        while (n < n2) {
            d2.a(graphics, stringArray[n], n3, n4 + n5, n7);
            if ((n5 += d2.a()) > n6) break;
            ++n;
        }
    }

    public static void a(Graphics graphics, d d2, String[] stringArray, int n, int n2, int n3, int n4, int n5) {
        bx.a(graphics, d2, stringArray, 0, stringArray.length, n, n2, n3, n4, n5);
    }
}
