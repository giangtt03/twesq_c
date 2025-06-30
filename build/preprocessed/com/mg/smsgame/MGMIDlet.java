// Decompiled with: CFR 0.152
// Class Version: 1
package com.mg.smsgame;

import com.mg.bas.ci;
import com.mg.bas.ct;
import java.io.IOException;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.Connector;
import javax.microedition.io.PushRegistry;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;
import javax.wireless.messaging.MessageConnection;

public abstract class MGMIDlet
extends MIDlet {
    public Display a;
    public static boolean b = false;
    private boolean d = false;
    private long e = 0L;
    public boolean c;
    private static MGMIDlet f;

    public MGMIDlet(boolean bl, String string, String string2, String string3, String string4) {
        com.mg.bas.v.X = true;
        if (true) {
            com.mg.bas.ci.h = 0;
            com.mg.bas.ci.g = 0;
            com.mg.bas.ci.f = 0;
            com.mg.bas.ci.e = 0;
            com.mg.bas.ci.i = 0;
            com.mg.bas.ci.j = 0;
        }
        com.mg.bas.ci.a = string;
        com.mg.bas.ci.b = string2;
        com.mg.bas.ci.d = string3;
        com.mg.bas.ci.c = string4;
        com.mg.bas.ci.k = String.valueOf(com.mg.bas.ci.a) + com.mg.bas.ci.b;
        this.e();
        this.d = false;
        Object object = this.getAppProperty("Distributor-Name");
        if (object == null || ((String)object).length() == 0) {
            object = "asao";
        }
        ci.l = (String) object;
        this.a = Display.getDisplay((MIDlet)this);
        f = this;
        try {
            object = System.getProperty("microedition.platform");
            com.mg.bas.ct.a("Platform" + (String)object);
            com.mg.bas.v.ah = false;
            if (object != null) {
                int n = ((String)(object = ((String)object).toLowerCase().trim())).indexOf("nokia");
                if (n >= 0) {
                    com.mg.bas.v.ah = true;
                    if (((String)object).indexOf("n95") >= 0 || System.getProperty("com.nokia.mid.imei") != null || System.getProperty("com.nokia.mid.imsi") != null || System.getProperty("com.nokia.mid.networkid") != null || System.getProperty("com.nokia.mid.networksignal") != null || System.getProperty("com.nokia.mid.networkavailability") != null || System.getProperty("com.nokia.mid.batterylevel") != null || System.getProperty("com.nokia.mid.countrycode") != null) {
                        com.mg.bas.v.ah = false;
                    }
                } else {
                    n = ((String)object).indexOf("sonyericssonw810");
                    if (n >= 0) {
                        com.mg.bas.v.ah = true;
                    }
                }
            }
            com.mg.bas.ct.a("configure=" + System.getProperty("microedition.configuration"));
            com.mg.bas.ct.a("profile=" + System.getProperty("microedition.profiles"));
            com.mg.bas.ct.a("NokiaLessThanSerials60=" + com.mg.bas.v.ah);
            com.mg.bas.v.W = false;
            object = System.getProperty("com.sonyericsson.java.platform");
            if (object != null) {
                int n;
                int n2 = ((String)(object = ((String)object).substring(3))).indexOf(".");
                if (n2 > 0) {
                    object = ((String)object).substring(0, n2);
                }
                if ((n = Integer.parseInt((String)object)) < 8) {
                    com.mg.bas.v.W = true;
                }
            }
        }
        catch (Throwable throwable) {
            object = throwable;
            throwable.printStackTrace();
        }
        if (com.mg.bas.v.g) {
            if (com.mg.bas.v.X) {
                if (com.mg.bas.v.V) {
                    this.a();
                    MGMIDlet.b();
                }
                new com.mg.bas.ce();
                return;
            }
            String[] stringArray = PushRegistry.listConnections((boolean)false);
            if (!(stringArray != null && stringArray.length != 0)) {
                this.a.setCurrent((Displayable)new com.mg.bas.aj());
                return;
            }
            if (com.mg.bas.v.V) {
                MGMIDlet.b();
            }
            this.a.setCurrent((Displayable)new com.mg.bas.ce());
            return;
        }
        if (com.mg.bas.v.X) {
            new com.mg.bas.ce();
            return;
        }
        this.a.setCurrent((Displayable)new com.mg.bas.ce());
    }

    public final void a(final String s) {
        ct.a("Request link: " + s);
        try {
            MGMIDlet.f.platformRequest(s);
        } catch (ConnectionNotFoundException ex) {
            ex.printStackTrace();
        }
        this.notifyDestroyed();
    }

    public static void b(String string) {
        try {
            f.platformRequest("tel:" + string);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void a() {
        Object object = PushRegistry.listConnections((boolean)false);
        if (object == null || ((String[])object).length == 0) {
            try {
                object = "sms://:" + com.mg.bas.ci.d;
                String string = ((Object)((Object)this)).getClass().getName();
                PushRegistry.registerConnection((String)object, (String)string, (String)"*");
                return;
            }
            catch (SecurityException securityException) {
                return;
            }
            catch (Exception exception) {}
        }
    }

    protected void destroyApp(boolean bl) {
        com.mg.bas.s.a().b();
    }

    protected void pauseApp() {
        this.e = System.currentTimeMillis();
    }

    protected void startApp() {
        if (!this.d) {
            this.d = true;
            this.c = true;
            return;
        }
        System.currentTimeMillis();
    }

    public static void b() {
        if (MGMIDlet.b) {
            return;
        }
        final String[] listConnections;
        if ((listConnections = PushRegistry.listConnections(true)) != null && listConnections.length > 0) {
            try {
                ci.a((MessageConnection)Connector.open("sms://:" + ci.d));
                MGMIDlet.b = true;
            }
            catch (final IOException ex) {}
        }
        else {
            try {
                ci.a((MessageConnection)Connector.open("sms://:" + ci.d));
                MGMIDlet.b = false;
            }
            catch (final IOException ex2) {}
        }
        ct.a("AutoStart=" + MGMIDlet.b);
    }
    

    public final void c() {
        com.mg.bas.cs.c();
        this.a.setCurrent((Displayable)com.mg.bas.ag.a());
        com.mg.bas.v.a(com.mg.bas.v.v, com.mg.bas.v.w, com.mg.bas.v.G);
        com.mg.bas.cr.b();
        this.f();
        if (com.mg.bas.v.l && com.mg.bas.cr.c()) {
            com.mg.bas.cr.i();
        }
        if (com.mg.bas.v.l && !com.mg.bas.cr.a(true)) {
            com.mg.bas.cr.i();
        }
        if (com.mg.bas.v.t < com.mg.bas.v.r || com.mg.bas.v.u < com.mg.bas.v.s) {
            com.mg.bas.cr.h();
        }
        Runnable runnable = com.mg.bas.ag.a();
        runnable = new Thread(runnable);
        ((Thread)runnable).start();
    }

    public final void a(Displayable displayable, boolean bl) {
        com.mg.bas.v.c();
        com.mg.bas.v.Z = true;
        this.a.setCurrent(displayable);
    }

    public static MGMIDlet d() {
        return f;
    }

    protected abstract void e();

    protected abstract void f();
}
