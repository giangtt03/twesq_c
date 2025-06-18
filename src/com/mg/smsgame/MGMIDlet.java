// Decompiled with: CFR 0.152
// Class Version: 1
package com.mg.smsgame;

import java.io.IOException;
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
        v.X = true;
        if (true) {
            ci.h = 0;
            ci.g = 0;
            ci.f = 0;
            ci.e = 0;
            ci.i = 0;
            ci.j = 0;
        }
        ci.a = string;
        ci.b = string2;
        ci.d = string3;
        ci.c = string4;
        ci.k = String.valueOf(ci.a) + ci.b;
        this.e();
        this.d = false;
        Object object = this.getAppProperty("Distributor-Name");
        if (object == null || ((String)object).length() == 0) {
            object = "asao";
        }
        ci.l = object;
        this.a = Display.getDisplay((MIDlet)this);
        f = this;
        try {
            object = System.getProperty("microedition.platform");
            ct.a("Platform" + (String)object);
            v.ah = false;
            if (object != null) {
                int n = ((String)(object = ((String)object).toLowerCase().trim())).indexOf("nokia");
                if (n >= 0) {
                    v.ah = true;
                    if (((String)object).indexOf("n95") >= 0 || System.getProperty("com.nokia.mid.imei") != null || System.getProperty("com.nokia.mid.imsi") != null || System.getProperty("com.nokia.mid.networkid") != null || System.getProperty("com.nokia.mid.networksignal") != null || System.getProperty("com.nokia.mid.networkavailability") != null || System.getProperty("com.nokia.mid.batterylevel") != null || System.getProperty("com.nokia.mid.countrycode") != null) {
                        v.ah = false;
                    }
                } else {
                    n = ((String)object).indexOf("sonyericssonw810");
                    if (n >= 0) {
                        v.ah = true;
                    }
                }
            }
            ct.a("configure=" + System.getProperty("microedition.configuration"));
            ct.a("profile=" + System.getProperty("microedition.profiles"));
            ct.a("NokiaLessThanSerials60=" + v.ah);
            v.W = false;
            object = System.getProperty("com.sonyericsson.java.platform");
            if (object != null) {
                int n;
                int n2 = ((String)(object = ((String)object).substring(3))).indexOf(".");
                if (n2 > 0) {
                    object = ((String)object).substring(0, n2);
                }
                if ((n = Integer.parseInt((String)object)) < 8) {
                    v.W = true;
                }
            }
        }
        catch (Throwable throwable) {
            object = throwable;
            throwable.printStackTrace();
        }
        if (v.g) {
            if (v.X) {
                if (v.V) {
                    this.a();
                    MGMIDlet.b();
                }
                new ce();
                return;
            }
            String[] stringArray = PushRegistry.listConnections((boolean)false);
            if (!(stringArray != null && stringArray.length != 0)) {
                this.a.setCurrent((Displayable)new aj());
                return;
            }
            if (v.V) {
                MGMIDlet.b();
            }
            this.a.setCurrent((Displayable)new ce());
            return;
        }
        if (v.X) {
            new ce();
            return;
        }
        this.a.setCurrent((Displayable)new ce());
    }

    public final void a(String object) {
        ct.a("Request link: " + object);
        f.platformRequest((String)object);
        object = this;
        object.notifyDestroyed();
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
                object = "sms://:" + ci.d;
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
        s.a().b();
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
        if (b) {
            return;
        }
        MessageConnection messageConnection = PushRegistry.listConnections((boolean)true);
        if (messageConnection != null && ((String[])messageConnection).length > 0) {
            try {
                messageConnection = (MessageConnection)Connector.open((String)("sms://:" + ci.d));
                ci.a(messageConnection);
                b = true;
            }
            catch (IOException iOException) {}
        } else {
            try {
                messageConnection = (MessageConnection)Connector.open((String)("sms://:" + ci.d));
                ci.a(messageConnection);
                b = false;
            }
            catch (IOException iOException) {}
        }
        ct.a("AutoStart=" + b);
    }

    public final void c() {
        cs.c();
        this.a.setCurrent((Displayable)ag.a());
        v.a(v.v, v.w, v.G);
        cr.b();
        this.f();
        if (v.l && cr.c()) {
            cr.i();
        }
        if (v.l && !cr.a(true)) {
            cr.i();
        }
        if (v.t < v.r || v.u < v.s) {
            cr.h();
        }
        Runnable runnable = ag.a();
        runnable = new Thread(runnable);
        ((Thread)runnable).start();
    }

    public final void a(Displayable displayable, boolean bl) {
        v.c();
        v.Z = true;
        this.a.setCurrent(displayable);
    }

    public static MGMIDlet d() {
        return f;
    }

    protected abstract void e();

    protected abstract void f();
}
