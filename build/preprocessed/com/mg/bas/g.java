package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import java.io.InputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;

public class g {
    public int a;
    public int b;

    public static Image a(Image object, int n2, int n3) {
        int n4 = object.getWidth();
        int n5 = object.getHeight();
        if (n4 != n2 || n5 != n3) {
            int[] nArray = new int[n4 * n5];
            object.getRGB(nArray, 0, n4, 0, 0, n4, n5);
            Object object2 = object = (Object)new int[n2 * n3];
            int n6 = n5;
            int n7 = n4;
            int n8 = n3;
            n5 = n2;
            int[] nArray2 = nArray;
            int n9 = n7 * 1024 / n5;
            int n10 = n6 * 1024 / n8;
            int n11 = 0;
            int n12 = 0;
            while (n11 < n8) {
                int n13 = (n10 * n11 >> 10) * n7;
                int n14 = 0;
                n6 = 0;
                while (n6 < n5) {
                    object2[n12 + n6] = (Image)nArray2[n13 + (n14 >> 10)];
                    n14 += n9;
                    ++n6;
                }
                n12 += n5;
                ++n11;
            }
            return Image.createRGBImage((int[])object, (int)n2, (int)n3, (boolean)true);
        }
        return object;
    }

    public static SocketConnection a(String string, int n2) {
        int n3 = 5;
        String string2 = string;
        string2 = (SocketConnection)Connector.open((String)("socket://" + string2 + ":" + n2));
        string2.setSocketOption((byte)1, 5);
        return string2;
    }

    public static int a(InputStream inputStream, byte[] byArray, int n2) {
        while (n2 < byArray.length) {
            int n3 = inputStream.read(byArray, n2, byArray.length - n2);
            if (n3 < 0) {
                return -1;
            }
            n2 += n3;
        }
        return n2;
    }

    public static boolean a(String string) {
        if (i.a(string)) {
            return false;
        }
        String[] stringArray = RecordStore.listRecordStores();
        if (stringArray == null || string.length() <= 0) {
            return false;
        }
        string = string.toLowerCase();
        int n2 = 0;
        while (n2 < stringArray.length) {
            if (stringArray[n2].toLowerCase().equals(string)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public static RecordStore a(String object, boolean bl) {
        try {
            return RecordStore.openRecordStore((String)object, (boolean)bl);
        }
        catch (Throwable throwable) {
            object = throwable;
            throwable.printStackTrace();
            return null;
        }
    }

    public static byte[] a(RecordStore object, int n2) {
        try {
            object = object.getRecord(n2);
        }
        catch (Throwable throwable) {
            object = throwable;
            throwable.printStackTrace();
            object = null;
        }
        return object;
    }

    public static void a(RecordStore recordStore, int n2, byte[] byArray) {
        int n3 = byArray.length;
        boolean bl = false;
        RecordStore recordStore2 = recordStore;
        recordStore2.setRecord(n2, byArray, 0, n3);
    }

    public static int a(RecordStore recordStore, byte[] byArray) {
        int n2 = byArray.length;
        boolean bl = false;
        RecordStore recordStore2 = recordStore;
        return recordStore2.addRecord(byArray, 0, n2);
    }

    public static int a(RecordStore object) {
        try {
            return object.getNumRecords();
        }
        catch (Throwable throwable) {
            object = throwable;
            throwable.printStackTrace();
            return 0;
        }
    }

    public static void b(String object) {
        try {
            RecordStore.deleteRecordStore((String)object);
            return;
        }
        catch (Throwable throwable) {
            object = throwable;
            throwable.printStackTrace();
            return;
        }
    }

    public static void a(Object[] objectArray, int n2, int n3) {
        Object object = objectArray[n2];
        objectArray[n2] = objectArray[n3];
        objectArray[n3] = object;
    }

    public static Object[] a(Object[] objectArray, b b2) {
        return g.a(objectArray, 0, objectArray.length, b2);
    }

    public static Object[] a(Object[] objectArray, int n2, int n3, b b2) {
        if (objectArray != null) {
            n3 = n2 + n3;
            int n4 = n2 + 1;
            do {
                n2 = 0;
                int n5 = n4;
                while (n5 < n3) {
                    if (b2.a(objectArray[n5 - 1], objectArray[n5]) > 0) {
                        g.a(objectArray, n5 - 1, n5);
                        n2 = 1;
                    }
                    ++n5;
                }
                --n3;
                if (n2 == 0) break;
                n5 = n3 - 1;
                while (n5 >= n4) {
                    if (b2.a(objectArray[n5 - 1], objectArray[n5]) > 0) {
                        g.a(objectArray, n5 - 1, n5);
                        n2 = 1;
                    }
                    --n5;
                }
                ++n4;
            } while (n2 != 0);
        }
        return objectArray;
    }

    public static int a(Object[] objectArray, int n2, int n3, Object object, b b2) {
        n2 = 0;
        while (n2 <= n3) {
            int n4 = n2 + n3 >>> 1;
            int n5 = b2.a(objectArray[n4], object);
            if (n5 < 0) {
                n2 = n4 + 1;
                continue;
            }
            if (n5 > 0) {
                n3 = n4 - 1;
                continue;
            }
            return n4;
        }
        return -(n2 + 1);
    }

    public g() {
    }

    public g(int n2, int n3) {
        this.a(n2, n3);
    }

    public void a(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    /*
     * Unable to fully structure code
     */
public static String a(a var0, int var1_1, int var2_2, boolean var3_3) {
    if (var3_3) {
        int index = 0;
        int count = var0.d();
        while (index < count) {
            n var5_6 = (n) var0.b(index);
            if (var5_6.b() == var1_1) {
                return g.b(var0, var1_1, index, var3_3);
            }
            ++index;
        }
        return null;
    } else {
        while (var2_2 >= 0) {
            n var4_5 = (n) var0.b(var2_2);
            if (var4_5.b() == var1_1) {
                break;
            }
            --var2_2;
        }
        if (var2_2 < 0) {
            var2_2 = 0;
        }
        return g.b(var0, var1_1, var2_2, var3_3);
    }
}

    public static String b(a a2, int n2, int n3, boolean bl) {
        String string = "";
        int n4 = a2.d();
        while (n3 < n4) {
            n n5 = (n)a2.b(n3);
            if (n5.b() == n2) {
                string = String.valueOf(string) + n5.a();
            } else if (!bl) break;
            ++n3;
        }
        return string;
    }

    public static int[] a(a a2, int n2) {
        Object object;
        a a3 = new a();
        int n3 = Integer.MIN_VALUE;
        int n4 = 0;
        while (n4 < a2.d()) {
            object = (n)a2.b(n4);
            if (((n)object).c() == 4 && ((n)object).b() != n3) {
                n3 = ((n)object).b();
                String string = g.a(a2, ((n)object).b(), n4, true);
                if (!i.a(string)) {
                    boolean bl = true;
                    a a4 = a3;
                    int n5 = 0;
                    while (n5 < a4.d()) {
                        int n6 = (Integer)a4.b(n5);
                        n n7 = (n)a2.b(n6);
                        String string2 = g.a(a2, n7.b(), n6, true);
                        if (string2.equals(string)) {
                            bl = false;
                            break;
                        }
                        ++n5;
                    }
                    if (bl) {
                        a4.a(new Integer(n4));
                    }
                }
            }
            ++n4;
        }
        int[] nArray = new int[a3.d()];
        object = a3;
        int n8 = 0;
        while (n8 < ((a)object).d()) {
            nArray[n8] = (Integer)((a)object).b(n8);
            ++n8;
        }
        return nArray;
    }

    public static a c(String object) {
        Object object2;
        Object object3 = object;
        Object object4 = new a(15);
        if (!i.b((String)object3)) {
            int n2;
            object2 = ((String)object3).toLowerCase();
            while ((n2 = ((String)object2).indexOf(10)) >= 0) {
                ((a)object4).a(((String)object2).substring(0, n2));
                ((a)object4).a("\n");
                if (!i.b((String)(object2 = ((String)object2).substring(n2 + 1)))) continue;
            }
            if (!i.b((String)object2)) {
                ((a)object4).a(object2);
            }
        }
        object3 = object = object4;
        if (((a)object).d() > 0) {
            try {
                object2 = object3;
                g.a((a)object2, "rss://", " ", false, 3);
                object2 = object3;
                g.a((a)object2, "http://", " ", false, 3);
                object2 = object3;
                g.a((a)object2, "www.", " ", false, 3);
                object2 = object3;
                g.a((a)object2, "#", "#", true, 1);
                object2 = object3;
                g.a((a)object2, "@", " ", false, 4);
                object2 = object3;
                g.a((a)object2, "#", " ", false, 5);
                object2 = object3;
                int n3 = 0;
                while (n3 < ((a)object2).d()) {
                    object4 = (String)((a)object2).b(n3);
                    if (((String)object4).length() > 0 && ((String)object4).charAt(0) != '') {
                        int n4 = 0;
                        int n5 = ((String)object4).length() - 1;
                        while (n4 < n5) {
                            int n6 = ((String)object4).length() - n4;
                            char c = ((String)object4).charAt(n4);
                            char c2 = ((String)object4).charAt(n4 + 1);
                            int n7 = 3;
                            int n8 = -1;
                            switch (c) {
                                case '<': {
                                    if (c2 != '3') break;
                                    n7 = 2;
                                    n8 = 28;
                                    break;
                                }
                                case '@': {
                                    if (c2 != ';' || n6 <= 2 || ((String)object4).charAt(n4 + 2) != '-') break;
                                    n8 = 31;
                                    break;
                                }
                                case ':': {
                                    if (c2 == '-') {
                                        if (n6 <= 2) break;
                                        c = ((String)object4).charAt(n4 + 2);
                                        if (c == ')') {
                                            if (n6 > 3) {
                                                char c3 = ((String)object4).charAt(n4 + 3);
                                                n6 = c3;
                                                if (c3 == ')') {
                                                    n7 = 4;
                                                    n8 = 3;
                                                    break;
                                                }
                                            }
                                            n8 = 0;
                                            break;
                                        }
                                        if (c == 'p') {
                                            n8 = 1;
                                            break;
                                        }
                                        if (c == 'x') {
                                            n8 = 6;
                                            break;
                                        }
                                        if (c == '*') {
                                            n8 = 7;
                                            break;
                                        }
                                        if (c == '|') {
                                            n8 = 8;
                                            break;
                                        }
                                        if (c == 'd') {
                                            n8 = 9;
                                            break;
                                        }
                                        if (c == '/') {
                                            n8 = 13;
                                            break;
                                        }
                                        if (c == '<') {
                                            n8 = 14;
                                            break;
                                        }
                                        if (c == '&') {
                                            n8 = 15;
                                            break;
                                        }
                                        if (c == '(') {
                                            if (n6 > 3) {
                                                char c4 = ((String)object4).charAt(n4 + 3);
                                                n6 = c4;
                                                if (c4 == '(') {
                                                    n7 = 4;
                                                    n8 = 22;
                                                    break;
                                                }
                                            }
                                            n8 = 16;
                                            break;
                                        }
                                        if (c == 'b') {
                                            n8 = 17;
                                            break;
                                        }
                                        if (c == 'o') {
                                            n8 = 18;
                                            break;
                                        }
                                        if (c == 'h') {
                                            n8 = 19;
                                            break;
                                        }
                                        if (c == 's') {
                                            n8 = 20;
                                            break;
                                        }
                                        if (c == '?') {
                                            n8 = 21;
                                            break;
                                        }
                                        if (c != 'w') break;
                                        n8 = 25;
                                        break;
                                    }
                                    if (c2 == ')') {
                                        if (n6 > 2 && (c = ((String)object4).charAt(n4 + 2)) == ')') {
                                            n8 = 3;
                                            break;
                                        }
                                        n7 = 2;
                                        n8 = 0;
                                        break;
                                    }
                                    if (c2 == 'p') {
                                        n7 = 2;
                                        n8 = 1;
                                        break;
                                    }
                                    if (c2 == 'x') {
                                        n7 = 2;
                                        n8 = 6;
                                        break;
                                    }
                                    if (c2 == '*') {
                                        n7 = 2;
                                        n8 = 7;
                                        break;
                                    }
                                    if (c2 == '|') {
                                        n7 = 2;
                                        n8 = 8;
                                        break;
                                    }
                                    if (c2 == 'd') {
                                        n7 = 2;
                                        n8 = 9;
                                        break;
                                    }
                                    if (c2 == '(') {
                                        if (n6 > 2 && (c = ((String)object4).charAt(n4 + 2)) == '(') {
                                            n8 = 22;
                                            break;
                                        }
                                        n7 = 2;
                                        n8 = 16;
                                        break;
                                    }
                                    if (c2 == 'b') {
                                        n7 = 2;
                                        n8 = 17;
                                        break;
                                    }
                                    if (c2 == 'o') {
                                        n7 = 2;
                                        n8 = 18;
                                        break;
                                    }
                                    if (c2 == 's') {
                                        n7 = 2;
                                        n8 = 20;
                                        break;
                                    }
                                    if (c2 != '\"' || n6 <= 2 || (c = ((String)object4).charAt(n4 + 2)) != '>') break;
                                    n8 = 4;
                                    break;
                                }
                                case '>': {
                                    if (n6 <= 2) break;
                                    c = ((String)object4).charAt(n4 + 2);
                                    if (c2 != ':') break;
                                    if (n6 > 3) {
                                        n6 = ((String)object4).charAt(n4 + 3);
                                        if (c == 'd' && n6 == 60) {
                                            n7 = 4;
                                            n8 = 2;
                                            break;
                                        }
                                    }
                                    if (c != ')') break;
                                    n8 = 27;
                                    break;
                                }
                                case 'b': {
                                    if (n6 <= 2) break;
                                    c = ((String)object4).charAt(n4 + 2);
                                    if (c2 != '-' || c != ')') break;
                                    n8 = 5;
                                    break;
                                }
                                case ';': {
                                    if (n6 > 2) {
                                        c = ((String)object4).charAt(n4 + 2);
                                        if (c2 == '-' && c == ')') {
                                            n8 = 10;
                                            break;
                                        }
                                    }
                                    if (c2 != ')') break;
                                    n7 = 2;
                                    n8 = 10;
                                    break;
                                }
                                case '|': {
                                    if (n6 <= 2) break;
                                    c = ((String)object4).charAt(n4 + 2);
                                    if (c2 != '-' || c != ')') break;
                                    n8 = 11;
                                    break;
                                }
                                case '(': {
                                    if (n6 <= 2) break;
                                    c = ((String)object4).charAt(n4 + 2);
                                    if (c2 == ':' && c == '|') {
                                        n8 = 12;
                                        break;
                                    }
                                    if (c2 == 'y' && c == ')') {
                                        n8 = 29;
                                        break;
                                    }
                                    if (c2 == 'n' && c == ')') {
                                        n8 = 30;
                                        break;
                                    }
                                    if (c2 != '*' || c != ')') break;
                                    n8 = 32;
                                    break;
                                }
                                case '=': {
                                    if (n6 > 2) {
                                        c = ((String)object4).charAt(n4 + 2);
                                        if (c2 != '(' || c != '(') break;
                                        n8 = 23;
                                        break;
                                    }
                                    if (c2 != ';') break;
                                    n7 = 2;
                                    n8 = 24;
                                    break;
                                }
                                case 'X': 
                                case 'x': {
                                    if (n6 > 2) {
                                        c = ((String)object4).charAt(n4 + 2);
                                        if (c2 != '-' || c != '(') break;
                                        n8 = 26;
                                        break;
                                    }
                                    if (c2 != '(') break;
                                    n7 = 2;
                                    n8 = 26;
                                    break;
                                }
                                case 'I': 
                                case 'i': {
                                    if (n6 <= 2) break;
                                    c = ((String)object4).charAt(n4 + 2);
                                    if (c2 != '-' || c != ')') break;
                                    n8 = 11;
                                }
                            }
                            if (n8 >= 0) {
                                String string = ((String)object4).substring(0, n4);
                                String string2 = ((String)object4).substring(n4, n4 + n7);
                                object4 = ((String)object4).substring(n4 + n7);
                                string2 = "2" + (n8 < 10 ? "0" + n8 : String.valueOf(n8)) + string2;
                                if (string == null || string.length() <= 0) {
                                    ((a)object2).a(string2, n3);
                                } else {
                                    ((a)object2).a(string, n3);
                                    ((a)object2).b(string2, ++n3);
                                }
                                if (object4 == null || ((String)object4).length() <= 0) break;
                                ((a)object2).b(object4, n3 + 1);
                                break;
                            }
                            ++n4;
                        }
                    }
                    ++n3;
                }
            }
            catch (Throwable throwable) {
                object4 = throwable;
                throwable.printStackTrace();
            }
        }
        return object;
    }

    private static void a(a a2, String string, String string2, boolean bl, int n2) {
        int n3 = 0;
        while (n3 < a2.d()) {
            String string3 = (String)a2.b(n3);
            if (string3.length() > 0 && string3.charAt(0) != '') {
                int n4 = -1;
                while ((n4 = string3.indexOf(string, n4 + 1)) >= 0) {
                    String string4;
                    String string5 = null;
                    String string6 = string3.substring(0, n4);
                    int n5 = string3.indexOf(string2, n4 + string.length());
                    if (n5 >= 0) {
                        if (bl) {
                            ++n5;
                        }
                        string4 = string3.substring(n4, n5);
                        string5 = string3.substring(n5);
                    } else {
                        if (bl) continue;
                        string4 = string3.substring(n4);
                    }
                    if (string4.length() <= string.length()) continue;
                    try {
                        if (n2 == 5 || n2 == 4) {
                            char c;
                            n5 = string.length();
                            int n6 = string4.length();
                            while (n5 < n6) {
                                c = string4.charAt(n5);
                                if (!(c >= 'a' && c <= 'z' || c >= '0' && c <= '9' || c == '.') && c != '_') break;
                                ++n5;
                            }
                            if (n5 < string4.length()) {
                                if (n5 <= string.length()) {
                                    n4 += string.length() - 1;
                                    continue;
                                }
                                string4 = string3.substring(n4, n5 + n4);
                                string5 = string3.substring(n5 + n4);
                            }
                            if (string5 != null && string5.length() > 0 && string4.length() - string.length() > 1) {
                                n6 = string4.charAt(string4.length() - 1);
                                c = string5.charAt(0);
                                if (n6 == 46 && c == ' ') {
                                    string4 = string3.substring(n4, --n5 + n4);
                                    string5 = string3.substring(n5 + n4);
                                }
                            }
                        }
                    }
                    catch (Exception exception) {
                        Exception exception2 = exception;
                        exception.printStackTrace();
                    }
                    string4 = "" + n2 + string4;
                    if (string6 == null || string6.length() <= 0) {
                        a2.a(string4, n3);
                    } else {
                        a2.a(string6, n3);
                        a2.b(string4, ++n3);
                    }
                    if (string5 == null || string5.length() <= 0) break;
                    a2.b(string5, n3 + 1);
                    break;
                }
            }
            ++n3;
        }
    }

    private static n f(a a2, int n2) {
        return (n)a2.b(n2);
    }

    public static boolean a(int n2) {
        return n2 != 0 && n2 != 2;
    }

    public static int b(a a2, int n2) {
        n n3 = g.f(a2, n2);
        --n2;
        while (n2 >= 0) {
            n n4 = g.f(a2, n2);
            if (g.a(n4.c()) && n4.b() != n3.b()) {
                return n2;
            }
            --n2;
        }
        return -1;
    }

    public static int c(a a2, int n2) {
        n n3 = g.f(a2, n2);
        ++n2;
        while (n2 < a2.d()) {
            n n4 = g.f(a2, n2);
            if (g.a(n4.c()) && n4.b() != n3.b()) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    public static int d(a a2, int n2) {
        n n3 = g.f(a2, n2);
        --n2;
        while (n2 >= 0) {
            n n4 = g.f(a2, n2);
            if (g.a(n4.c()) && n4.e() < n3.e() && n4.b() != n3.b()) {
                int n5 = Math.abs(n3.d() - n4.d());
                int n6 = n2 - 1;
                while (n6 >= 0) {
                    n n7 = g.f(a2, n6);
                    if (n4.e() != n7.e()) {
                        return n2;
                    }
                    if (g.a(n7.c()) && n7.b() != n4.b()) {
                        int n8 = Math.abs(n3.d() - n7.d());
                        if (n8 > n5) {
                            return n2;
                        }
                        if (n8 < n5) {
                            n2 = n6;
                            n5 = n8;
                        }
                    }
                    --n6;
                }
                return n2;
            }
            --n2;
        }
        return -1;
    }

    public static int e(a a2, int n2) {
        n n3 = g.f(a2, n2);
        ++n2;
        while (n2 < a2.d()) {
            n n4 = g.f(a2, n2);
            if (g.a(n4.c()) && n4.e() > n3.e() && n4.b() != n3.b()) {
                int n5 = Math.abs(n3.d() - n4.d());
                int n6 = n2 + 1;
                while (n6 < a2.d()) {
                    n n7 = g.f(a2, n6);
                    if (n4.e() != n7.e()) {
                        return n2;
                    }
                    if (g.a(n7.c()) && n7.b() != n4.b()) {
                        int n8 = Math.abs(n3.d() - n7.d());
                        if (n8 > n5) {
                            return n2;
                        }
                        if (n8 < n5) {
                            n2 = n6;
                            n5 = n8;
                        }
                    }
                    ++n6;
                }
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    public static String a(a a2, int n2, boolean bl) {
        int n3 = 0;
        while (n3 < a2.d()) {
            n n4 = (n)a2.b(n3);
            if (n4.c() == n2) {
                return g.b(a2, n4.b(), n3, bl);
            }
            ++n3;
        }
        return null;
    }

    public static byte[] a(byte[] byArray, String string) {
        try {
            byte by = byArray[0];
            byte[] byArray2 = string.getBytes("UTF-8");
            byte[] byArray3 = new byte[Math.max(byArray.length - 1, byArray2.length + by) + 1];
            byte[] byArray4 = byArray3;
            byArray3[0] = (byte)byArray2.length;
            int n2 = 0;
            while (n2 < byArray4.length - 1) {
                int n3 = 17;
                int n4 = 0;
                if (n2 + 1 < byArray.length) {
                    n3 = byArray[n2 + 1];
                }
                if (n2 >= by && n2 - by < byArray2.length) {
                    n4 = byArray2[n2 - by];
                }
                byArray4[n2 + 1] = (byte)(n3 ^ n4);
                ++n2;
            }
            return byArray4;
        }
        catch (Throwable throwable) {
            try {
                byte by = byArray[0];
                byte[] byArray5 = string.getBytes();
                byte[] byArray6 = new byte[Math.max(byArray.length - 1, byArray5.length + by) + 1];
                byte[] byArray7 = byArray6;
                byArray6[0] = (byte)byArray5.length;
                int n5 = 0;
                while (n5 < byArray7.length - 1) {
                    int n6 = 17;
                    int n7 = 0;
                    if (n5 + 1 < byArray.length) {
                        n6 = byArray[n5 + 1];
                    }
                    if (n5 >= by && n5 - by < byArray5.length) {
                        n7 = byArray5[n5 - by];
                    }
                    byArray7[n5 + 1] = (byte)(n6 ^ n7);
                    ++n5;
                }
                return byArray7;
            }
            catch (Throwable throwable2) {
                return null;
            }
        }
    }

    public static String a() {
        String string;
        try {
            string = System.getProperty("Cell-ID");
            if (string == null || string.equals("null") || string.equals("")) {
                string = System.getProperty("CellID");
            }
            if (string == null || string.equals("null") || string.equals("")) {
                string = System.getProperty("com.nokia.mid.cellid");
            }
            if (string == null || string.equals("null") || string.equals("")) {
                string = System.getProperty("com.sonyericsson.net.cellid");
            }
            if (string == null || string.equals("null") || string.equals("")) {
                string = System.getProperty("phone.cid");
            }
            if (string == null || string.equals("null") || string.equals("")) {
                string = System.getProperty("com.samsung.cellid");
            }
            if (string == null || string.equals("null") || string.equals("")) {
                string = System.getProperty("com.siemens.cellid");
            }
            if (string == null || string.equals("null") || string.equals("")) {
                string = System.getProperty("cid");
            }
            if (string == null || string.equals("null") || string.equals("")) {
                return null;
            }
        }
        catch (Exception exception) {
            return null;
        }
        try {
            if (string != null) {
                int n2 = Integer.parseInt(string);
                string = Integer.toHexString(n2);
            }
        }
        catch (Exception exception) {}
        return string;
    }

    public static String b() {
        String string;
        try {
            string = System.getProperty("phone.lac");
            if (string == null || string.equals("null") || string.equals("")) {
                string = System.getProperty("com.nokia.mid.lac");
            }
            if (string == null || string.equals("null") || string.equals("")) {
                string = System.getProperty("com.sonyericsson.net.lac");
            }
            if (string == null || string.equals("null") || string.equals("")) {
                string = System.getProperty("LocAreaCode");
            }
            if (string == null || string.equals("null") || string.equals("")) {
                return null;
            }
        }
        catch (Exception exception) {
            return null;
        }
        try {
            if (string != null) {
                int n2 = Integer.parseInt(string);
                string = Integer.toHexString(n2);
            }
        }
        catch (Exception exception) {}
        return string;
    }

    public static String c() {
        String string;
        try {
            string = System.getProperty("phone.mcc");
            if (string == null || string.equals("null") || string.equals("")) {
                string = System.getProperty("com.nokia.mid.mcc");
            }
            if (string == null || string.equals("null") || string.equals("")) {
                string = System.getProperty("com.sonyericsson.net.mcc");
            }
            if (string == null || string.equals("null") || string.equals("")) {
                string = System.getProperty("mcc");
            }
            if (string == null || string.equals("null") || string.equals("")) {
                string = System.getProperty("com.nokia.mid.countrycode");
            }
            if (string == null || string.equals("null") || string.equals("")) {
                return null;
            }
        }
        catch (Exception exception) {
            return null;
        }
        return string;
    }

    public static String d() {
        String string;
        String string2;
        try {
            string2 = System.getProperty("phone.mnc");
            if (string2 == null || string2.equals("null") || string2.equals("")) {
                string2 = System.getProperty("com.nokia.mid.mnc");
            }
            if (string2 == null || string2.equals("null") || string2.equals("")) {
                string2 = System.getProperty("com.sonyericsson.net.mnc");
            }
            if (string2 == null || string2.equals("null") || string2.equals("")) {
                string2 = System.getProperty("mnc");
            }
            if (string2 == null || string2.equals("null") || string2.equals("")) {
                string2 = System.getProperty("com.nokia.mid.networkID");
            }
            if (string2 == null || string2.equals("null") || string2.equals("")) {
                string2 = System.getProperty("com.nokia.mid.networkid");
            }
            if (string2 == null || string2.equals("null") || string2.equals("")) {
                return null;
            }
        }
        catch (Exception exception) {
            return null;
        }
        if (string2 != null && (string = g.c()) != null) {
            if (!string2.equals(string) && string2.startsWith(string)) {
                string2 = string2.substring(string.length());
            }
            if (string2 != null && string2.length() > 0) {
                int n2 = 0;
                int n3 = string2.length();
                while (n2 < n3) {
                    if (string2.charAt(n2) < '0' || string2.charAt(n2) > '9') {
                        string2 = string2.substring(0, n2);
                        break;
                    }
                    ++n2;
                }
            }
        }
        return string2;
    }
}
