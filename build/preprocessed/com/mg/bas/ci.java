package com.mg.bas;
// Singleton class for managing SMS sending/receiving, implements bf and cg, provides static configuration and logic
// Decompiled with: CFR 0.152
// Class Version: 1
import java.util.Vector;
import javax.wireless.messaging.MessageConnection;

public final class ci
implements bf,
cg {
    public static String a = "TESTGAME";
    public static String b = "3";
    public static String c = "1";
    public static String d = "19003";
    public static int e = 0;
    public static int f = 6;
    public static int g = 5;
    public static int h = 5;
    public static int i = 5;
    public static int j = 1;
    public static String k = String.valueOf(a) + b;
    public static String l = null;
    private static ci m;

    protected ci() {
    }

    public static ci a() {
        if (m == null) {
            m = new ci();
        }
        return m;
    }

    public static void a(String string, int n, be be2) {
        try {
            String string2 = System.getProperty("microedition.platform");
            if (string2 == null) {
                string2 = "Unknown";
            } else if (string2.length() >= 80) {
                string2 = string2.substring(0, 80);
            }
            string2 = " \"m" + string2 + "\" e" + String.valueOf(System.currentTimeMillis());
            String string3 = String.valueOf(k) + " v" + "2" + " a2 o" + String.valueOf(n) + " d" + b + " p" + l;
            if (string != null) {
                string3 = String.valueOf(string3) + " r" + string;
            }
            string3 = String.valueOf(string3) + string2;
            ch.a(string3, String.valueOf(h), new cj(be2));
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public static void b(String string) {
        cr.a();
        string = "RESET " + string;
        ch.a(string, "0", new ck());
    }

    public static void a(String string, String string2, be be2) {
        cr.a();
        ch.a(string, String.valueOf(string2), new cl(be2));
    }

    public static void a(String string, String string2, String string3) {
        string = String.valueOf(string) + " " + string2 + " " + c + " " + cv.a(100);
        ci.a(string, string3, (be) null); // Disambiguate with (be) null
    }

    public final void a(String stringArray) {
        String[] stringArray2;
        int n = -1;
        String string = "\"";
        Object object = "\"";
        Object object2 = " ";
        String string3 = stringArray; // Use a String,
        boolean bl = false;
        int n2 = 0;
        Vector vector = new Vector();
        int n3 = 0;
        while (n3 < string3.length() - ((String)object2).length() + 1) {
            if (((String)object2).equals(string3.substring(n3, n3 + ((String)object2).length())) && !bl) {
                vector.addElement(string3.substring(n2, n3));
                n2 = n3 + ((String)object2).length();
                n3 = n2 - 1;
            } else if (((String)object).equals(string3.substring(n3, n3 + ((String)object).length())) && !bl) {
                vector.addElement(string3.substring(n2, n3));
                n2 = n3 + ((String)object).length();
                n3 = n2 - 1;
                bl = true;
            } else if (string.equals(string3.substring(n3, n3 + string.length())) && bl) {
                vector.addElement(string3.substring(n2, n3));
                n2 = n3 + string.length();
                n3 = n2 - 1;
                bl = false;
            }
            ++n3;
        }
        if (n2 < string3.length()) {
            vector.addElement(string3.substring(n2));
        }
        String[] stringArray3;
        if (vector.size() > 0) {
            stringArray3 = new String[vector.size()];
            n3 = 0;
            while (n3 < vector.size()) {
                stringArray3[n3] = (String)vector.elementAt(n3);
                ++n3;
            }
            stringArray2 = stringArray3;
        } else {
            stringArray2 = stringArray3 = null;
        }
        if (!stringArray2[0].toUpperCase().equals(k.toUpperCase())) {
            return;
        }
        try {
            int n4 = 0;
            object = null;
            string = null;
            String string2 = null;
            n2 = 1;
            while (n2 < stringArray3.length) {
                if (stringArray3[n2].length() != 0) {
                    char c = stringArray3[n2].charAt(0);
                    String string4 = null;
                    if (stringArray3[n2].length() > 1) {
                        string4 = stringArray3[n2].substring(1);
                    }
                    switch (c) {
                        case 'a': {
                            n4 = Integer.parseInt(string4);
                            break;
                        }
                        case 'l': {
                            object = string4;
                            break;
                        }
                        case 'c': {
                            string = string4;
                            break;
                        }
                        case 'q': {
                            break;
                        }
                        case 'r': {
                            string2 = string4;
                            break;
                        }
                        case 'i': {
                            try {
                                Integer.parseInt(string4);
                                break;
                            }
                            catch (Exception exception) {}
                        }
                    }
                }
                ++n2;
            }
            if (ag.b() != null) {
                String string5;
                n2 = n4;
                Object object3 = object;
                String string6 = string;
                String string7 = string2;
                if (string2 != null && string2.length() >= 4 && (string5 = string2.substring(0, 4).toLowerCase()).equals("reco")) {
                    ag.b().a(n2, (String)object3, string6, string7); // Pass string7
                }
                cn.a().d(0, 3);
                cr.g();
                return;
            }
        }
        catch (Exception exception) {
            object2 = exception;
            exception.printStackTrace();
            object = ag.b().a("Có lỗi", "Tin sai cú pháp", "Có", 3, 1);
            ((am)object).b(-10008);
            ((am)object).a(ci.a());
            ag.b().a((al)object);
        }
    }

    public final void d(int n, int n2) {
        if (n2 == 1) {
            ag.b().a(-10007, false);
            return;
        }
        if (n2 == 2) {
            ag.b().a(-10009, false);
            return;
        }
        if (n2 == 3) {
            ag.b().a(-10008, false);
        }
    }

    public static void a(MessageConnection messageConnection) {
        ch.a(messageConnection);
    }
}
