package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// Class for managing sound effect playback, implements PlayerListener, handles loading and controlling audio.
import java.io.InputStream;
import javax.microedition.media.Control;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.TempoControl;
import javax.microedition.media.control.VolumeControl;

public final class cp
implements PlayerListener {
    private Player a;
    private VolumeControl b;
    private String c = "";
    private boolean d;
    private long e;
    private int f;
    private int g = 5000;
    private TempoControl h;

    public cp() {
    }

    public cp(String string) {
        this.a(string);
    }

    private void a(String string) {
        this.d = false;
        if (this.a != null && string.equals(this.c)) {
            this.c();
            return;
        }
        try {
            if (!v.O || !v.S) {
                return;
            }
            this.a();
            this.a = Manager.createPlayer((InputStream)"".getClass().getResourceAsStream("/audio/" + string + ".amr"), (String)"audio/amr");
            this.a.setLoopCount(1);
            this.a.realize();
            this.a.prefetch();
            this.a.addPlayerListener((PlayerListener)this);
            Control control = this.a.getControl("VolumeControl");
            if (control != null) {
                this.b = (VolumeControl)control;
                this.b.setLevel(v.Q);
                this.b.setMute(!v.N);
            }
            if ((control = this.a.getControl("TempoControl")) != null) {
                this.h = (TempoControl)control;
                v.R = this.h.getTempo();
            }
            this.c = string;
            cs.a(false);
            return;
        }
        catch (Throwable throwable) {
            cs.a(true);
            this.a();
            return;
        }
    }

    public final void a() {
        if (this.a != null) {
            try {
                try {
                    this.a.stop();
                    this.a.deallocate();
                }
                catch (Throwable throwable) {
                    this.a.close();
                    this.a = null;
                    this.b = null;
                    this.c = "";
                    return;
                }
            }
            finally {
                this.a.close();
                this.a = null;
                this.b = null;
                this.c = "";
            }
        }
    }

    public final void b() {
        if (!v.O || !v.S) {
            return;
        }
        this.d = true;
        if (this.a == null && !this.c.equals("")) {
            this.a(this.c);
        }
        try {
            if (v.ah) {
                co.b().c();
            }
            if (this.a == null) {
                this.a();
                return;
            }
            this.a.setMediaTime(0L);
            if (this.b != null) {
                this.b.setMute(!v.O);
                this.b.setLevel(v.Q);
            }
            this.a.start();
            this.e = System.currentTimeMillis();
            return;
        }
        catch (Throwable throwable) {
            this.a();
            cs.a(true);
            this.d = false;
            return;
        }
    }

    public final void c() {
        if (this.a != null) {
            try {
                this.d = false;
                this.a.stop();
                return;
            }
            catch (Throwable throwable) {
                this.a();
            }
        }
    }

    public final boolean d() {
        if (this.d) {
            if (this.f > 3) {
                this.c();
            } else if (System.currentTimeMillis() - this.e > (long)this.g) {
                ++this.f;
                this.c();
            }
        }
        return this.d;
    }

    public final void playerUpdate(Player player, String string, Object object) {
        if (v.O) {
            if (string.equals("endOfMedia")) {
                if (v.ah) {
                    co.b().e();
                }
                this.d = false;
                return;
            }
            string.equals("started");
        }
    }
}
