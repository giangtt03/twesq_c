package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// UI form for displaying debug or info messages, extends Form and implements CommandListener.
import java.util.Date;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;

public final class ct
extends Form
implements CommandListener {
    private static ct a;
    private static boolean b;
    private int c;
    private int d;
    private final long e;

    static {
        b = true;
    }

    public static void a(boolean bl, int n) {
        b = false;
    }

    public static boolean a() {
        return b;
    }

    public final void commandAction(Command object, Displayable displayable) {
        if (!object.getLabel().equals("Back") && object.getLabel().equals("Clear")) {
            object = this;
            object.deleteAll();
            object.d = 0;
            object.append("Start at " + new Date(System.currentTimeMillis()).toString());
        }
    }

    public static boolean b() {
        if (a != null) {
            return (ct.a.c & 1) == 1;
        }
        return false;
    }

    public static void a(String object) {
        if (a != null) {
            String string = object;
            object = a;
            if ((((ct)((Object)object)).c & 1) == 1) {
                if (((ct)((Object)object)).d >= 30) {
                    object.delete(0);
                }
                object.append("[" + string + "]");
                System.out.println(string);
                ++((ct)((Object)object)).d;
            }
        }
    }

    public static void a(Throwable object) {
        if (a != null) {
            Throwable throwable = object;
            object = a;
            if ((((ct)((Object)object)).c & 2) == 2) {
                if (((ct)((Object)object)).d >= 30) {
                    object.delete(0);
                }
                throwable.printStackTrace();
                object.append(throwable.toString());
                ++((ct)((Object)object)).d;
            }
        }
    }

    public static boolean c() {
        if (a != null) {
            return (ct.a.c & 4) == 4;
        }
        return false;
    }

    public static void b(String object) {
        if (a != null) {
            String string = object;
            object = a;
            if ((((ct)((Object)object)).c & 4) == 4) {
                if (((ct)((Object)object)).d >= 30) {
                    object.delete(0);
                }
                System.gc();
                Runtime runtime = Runtime.getRuntime();
                long l = (runtime.totalMemory() - runtime.freeMemory()) / 1024L;
                string = "[MEM] " + string + " " + l + "K/" + ((ct)((Object)object)).e + "K";
                object.append(string);
                System.out.println(string);
            }
        }
    }
}
