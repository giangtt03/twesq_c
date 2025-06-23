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

    public ct() {
        super("Debug");
        this.e = Runtime.getRuntime().totalMemory() / 1024L;
    }

    public static void a(boolean bl, int n) {
        b = false;
    }

    public static boolean a() {
        return b;
    }

    public final void commandAction(Command command, Displayable displayable) {
        if (!command.getLabel().equals("Back") && command.getLabel().equals("Clear")) {
            this.deleteAll();
            this.d = 0;
            this.append("Start at " + new Date(System.currentTimeMillis()).toString());
        }
    }

    public static boolean b() {
        if (a != null) {
            return (ct.a.c & 1) == 1;
        }
        return false;
    }

    public static void a(String string) {
        if (a != null) {
            if ((a.c & 1) == 1) {
                if (a.d >= 30) {
                    a.delete(0);
                }
                a.append("[" + string + "]");
                System.out.println(string);
                ++a.d;
            }
        }
    }

    public static void a(Throwable throwable) {
        if (a != null) {
            if ((a.c & 2) == 2) {
                if (a.d >= 30) {
                    a.delete(0);
                }
                throwable.printStackTrace();
                a.append(throwable.toString());
                ++a.d;
            }
        }
    }

    public static boolean c() {
        if (a != null) {
            return (ct.a.c & 4) == 4;
        }
        return false;
    }

    public static void b(String string) {
        if (a != null) {
            if (a.d >= 30) {
                a.delete(0);
            }
            System.gc();
            Runtime runtime = Runtime.getRuntime();
            long l = (runtime.totalMemory() - runtime.freeMemory()) / 1024L;
            String memString = "[MEM] " + string + " " + l + "K/" + a.e + "K";
            a.append(memString);
            System.out.println(memString);
        }
    }
}
