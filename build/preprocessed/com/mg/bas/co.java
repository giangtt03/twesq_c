package com.mg.bas;
// Singleton class for managing background music and sound playback, implements PlayerListener and r.
// Decompiled with: CFR 0.152
// Class Version: 1
import java.io.InputStream;
import javax.microedition.media.Control;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.TempoControl;
import javax.microedition.media.control.VolumeControl;

public final class co
implements PlayerListener,
r {
    private static co a;
    private Player b;
    private String c = "";
    private VolumeControl d;
    private TempoControl e;
    private boolean f;
    private int g;

    protected co() {
    }

    public static co b() {
        if (a == null) {
            a = new co();
        }
        return a;
    }

    public final void a(String string, int n) {
        try {
            this.b(string, n);
            return;
        }
        catch (Throwable throwable) {
            ct.a("Create Back ground 1: " + throwable);
            cq.a().b();
            cq.a().c();
            this.d();
            try {
                this.b(string, n);
                return;
            }
            catch (Throwable throwable2) {
                this.d();
                ct.a("Back ground 2: " + throwable2);
                return;
            }
        }
    }

    private void b(String string, int n) {
        if (!v.N) {
            return;
        }
        this.d();
        this.b = Manager.createPlayer((InputStream)"".getClass().getResourceAsStream("/audio/" + string + ".mid"), (String)"audio/midi");
        this.g = n;
        this.b.setLoopCount(n);
        this.b.realize();
        this.b.prefetch();
        this.b.addPlayerListener((PlayerListener)this);
        Control control = this.b.getControl("VolumeControl");
        if (control != null) {
            this.d = (VolumeControl)control;
            this.d.setLevel(v.Q);
            this.d.setMute(!v.N);
        }
        if ((control = this.b.getControl("TempoControl")) != null) {
            this.e = (TempoControl)control;
            v.R = this.e.getTempo();
        }
        this.c = string;
        this.f = false;
    }

    public final void c() {
        if (this.b != null) {
            try {
                this.b.stop();
                return;
            }
            catch (Throwable throwable) {
                this.d();
                ct.a("[STOP BK Music]: " + throwable);
            }
        }
    }

    public final void d() {
        if (this.b != null) {
            try {
                try {
                    this.b.stop();
                    this.b.deallocate();
                }
                catch (Throwable throwable) {
                    ct.a("[Destroy BK Music1]: " + throwable);
                    try {
                        this.b.deallocate();
                    }
                    catch (Throwable throwable2) {
                        ct.a("[Destroy BK Music2]: " + throwable2);
                    }
                    this.b.close();
                    this.b = null;
                    this.d = null;
                    this.e = null;
                    this.f = false;
                    return;
                }
            }
            finally {
                this.b.close();
                this.b = null;
                this.d = null;
                this.e = null;
                this.f = false;
            }
        }
    }

    public final void e() {
        if (!v.N) {
            return;
        }
        s.a().a(this);
    }

    public final void a() {
        try {
            if (this.b != null) {
                this.b.stop();
                if (v.ah) {
                    cq.a().d();
                }
                if (this.d != null) {
                    this.d.setMute(!v.N);
                    this.d.setLevel(v.Q);
                }
                this.b.start();
                return;
            }
        }
        catch (Throwable throwable) {
            ct.a("[Player BK Music2]: " + throwable);
            this.d();
            this.a(this.c, this.g);
            try {
                if (this.b != null) {
                    this.b.start();
                    return;
                }
            }
            catch (Throwable throwable2) {
                ct.a("[Player BK Music3]: " + throwable2);
                this.d();
            }
        }
    }

    public final void a(int n) {
        if (this.e != null) {
            try {
                this.e.setTempo(n);
                return;
            }
            catch (Throwable throwable) {}
        }
    }

    public final boolean f() {
        return this.f;
    }

    public final void g() {
        if (!v.N) {
            return;
        }
        if (this.d != null) {
            this.d.setLevel(v.Q);
            this.d.setMute(!v.N);
        }
    }

    public final void playerUpdate(Player player, String string, Object object) {
        if (!string.equals("endOfMedia")) {
            if (string.equals("started")) {
                this.f = true;
                return;
            }
            if (string.equals("stopped")) {
                this.f = false;
            }
        }
    }
}
