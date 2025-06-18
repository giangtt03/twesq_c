package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// Main game canvas for splash/logo screen, handles rendering, input, and game loop. Extends GameCanvas and implements Runnable.
import com.mg.smsgame.MGMIDlet;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;

public final class ce
extends GameCanvas
implements Runnable {
    private int a = 0;
    private Graphics b;
    private Image c;
    private int d;
    private int e;
    private int f;
    private int g = 0;
    private int h = 0;
    private int i = 0;
    private int j = 10;
    private int k = 1;
    private int l;
    private int m = 1;
    private int n = 160 / this.j;
    private boolean o = true;
    private boolean p = false;
    private int q = 0;
    private Font r = null;

    public ce() {
        super(false);
        this.setFullScreenMode(true);
        this.r = Font.getFont((int)0, (int)0, (int)8);
        this.q = 0;
        this.b = this.getGraphics();
        this.e = this.getWidth();
        this.d = this.getHeight();
        bx.a();
        this.c = f.a("/_mglogo");
        this.f = this.c.getHeight() / 5;
        this.n = this.c.getHeight() / 2 / this.j + 1;
        if (!v.X) {
            new Thread(this).start();
            return;
        }
        this.a();
    }

    public final void run() {
        while (this.o || !MGMIDlet.d().c) {
            Object object;
            this.b();
            if (this.q == 0) {
                if (this.g < this.n) {
                    object = this;
                    this.l = ((ce)object).d / 2 - ((ce)object).f;
                    ((ce)object).b.setColor(0xFFFFFF);
                    ((ce)object).b.fillRect(0, 0, ((ce)object).e, ((ce)object).l - ((ce)object).j / 2 - ((ce)object).g * ((ce)object).j);
                    ((ce)object).b.fillRect(0, ((ce)object).l + ((ce)object).j / 2 + ((ce)object).g * ((ce)object).j, ((ce)object).e, ((ce)object).d - ((ce)object).l + ((ce)object).j / 2 + ((ce)object).g * ((ce)object).j);
                    int n = ((ce)object).l - ((ce)object).j / 2 - ((ce)object).g * ((ce)object).j;
                    ((ce)object).b.fillRect(0, n, ((ce)object).e, ((ce)object).j / 2 - ((ce)object).k);
                    n = n + 10 - (((ce)object).j / 2 - ((ce)object).k);
                    ((ce)object).b.fillRect(0, n, ((ce)object).e, ((ce)object).j / 2 - ((ce)object).k);
                    n = ((ce)object).l - ((ce)object).j / 2 + ((ce)object).g * ((ce)object).j;
                    ((ce)object).b.fillRect(0, n, ((ce)object).e, ((ce)object).j / 2 - ((ce)object).k);
                    n = n + 10 - (((ce)object).j / 2 - ((ce)object).k);
                    ((ce)object).b.fillRect(0, n, ((ce)object).e, ((ce)object).j / 2 - ((ce)object).k);
                    ((ce)object).k += ((ce)object).m;
                    if (((ce)object).k >= ((ce)object).j / 2 || ((ce)object).k <= 0) {
                        if (((ce)object).i >= 0) {
                            ((ce)object).k = 0;
                            ++((ce)object).g;
                            ((ce)object).m = 1;
                            ((ce)object).i = 0;
                        } else {
                            ++((ce)object).i;
                            ((ce)object).m = -((ce)object).m;
                        }
                    }
                }
                this.flushGraphics();
                ++this.a;
                if (this.a > 20) {
                    this.p = false;
                }
                if (this.a > 30) {
                    object = this;
                    this.c = f.a("/_partnerLogo");
                    this.q = 1;
                    this.a = 0;
                }
            } else {
                this.flushGraphics();
                ++this.a;
                if (this.a > 30) {
                    this.o = false;
                }
            }
            try {
                Thread.sleep(40L);
            }
            catch (InterruptedException interruptedException) {
                object = interruptedException;
                interruptedException.printStackTrace();
            }
        }
        this.b();
        this.a();
    }

    private void a() {
        v.v = this.getWidth();
        v.w = this.getHeight();
        MGMIDlet.d().c();
        ce ce2 = this;
        this.c = null;
        ce2.r = null;
        System.gc();
    }

    private void b() {
        if (v.X) {
            return;
        }
        this.e = this.getWidth();
        this.d = this.getHeight();
        this.b.setClip(0, 0, this.e, this.d);
        this.b.setColor(0xFFFFFF);
        this.b.fillRect(0, 0, this.e, this.d);
        if (this.q == 0) {
            this.b.setColor(0x666666);
            this.b.setFont(this.r);
            this.b.drawString("www.microgame.com.vn", this.e / 2, this.d - 5, 65);
            this.b.drawImage(this.c, this.e / 2, this.d / 2 - this.f, 3);
            return;
        }
        this.b.drawImage(this.c, (this.e - this.c.getWidth()) / 2, (this.d - this.c.getHeight()) / 2, 0);
    }

    protected final void keyPressed(int n) {
        if (this.q == 1) {
            this.a = 30;
        }
    }

    protected final void pointerPressed(int n, int n2) {
        if (this.q == 1) {
            this.a = 30;
        }
    }
}
