package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// Game or UI canvas class, handles rendering, input, and initialization logic. Extends Canvas and implements bf, Runnable.
import com.mg.smsgame.MGMIDlet;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;

public final class aj
extends Canvas
implements bf,
Runnable {
    private boolean a = false;
    private int b = 2;
    private al c;
    private int d;
    private int e;

    public aj() {
        this.setFullScreenMode(true);
        bx.a();
        v.z = this.hasPointerEvents();
        new Thread(this).start();
    }

    protected final void paint(Graphics object) {
        this.d = this.getWidth();
        this.e = this.getHeight();
        object.setColor(0);
        object.fillRect(0, 0, this.d, this.e);
        if (this.b > 0) {
            --this.b;
            if (this.b == 0) {
                object = this;
                v.t = object.d;
                v.u = object.e;
                try {
                    bw bw2 = new bw("Cài đặt tin nhắn");
                    bc bc2 = new bc("Máy điện thoại của bạn cần được cho phép nhận tin nhắn từ hệ thống. Hãy bấm cài đặt và sau đó chọn 'có' hoặc 'yes'.", 0);
                    bc bc3 = new bc("**Việc cho phép nhận tin nhắn để nhận vật phẩm, mua mạng chơi cũng như cơ hội nhận được phần thưởng từ hệ thống.", 0);
                    bc3.a(bx.b);
                    bc bc4 = new bc("**Việc không cho phép nhận tin nhắn từ hệ thống sẽ làm cho bạn không thể mua mạng chơi, cập nhật vật phẩm cũng như không thể nhận các giải thưởng từ hệ thống.", 0);
                    bc4.a(bx.b);
                    bw2.a(new au[]{bc2, bc3, bc4});
                    bw2.a((bf)object);
                    bw2.a(new bd("Cài đặt", -1));
                    object.c = bw2;
                    return;
                }
                catch (Exception exception) {
                    Exception exception2 = exception;
                    exception.printStackTrace();
                }
            }
            return;
        }
        this.c.h(true);
        this.c.a((Graphics)object, true);
    }

    public final void run() {
        this.a = false;
        while (!this.a) {
            try {
                long l = System.currentTimeMillis();
                this.repaint();
                long l2 = System.currentTimeMillis();
                if (l2 - l > 40L) continue;
                Thread.sleep(40L - (l2 - l));
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                ct.a(exception);
                exception2.printStackTrace();
            }
        }
        MGMIDlet.d().a();
        MGMIDlet.d();
        MGMIDlet.b();
        if (v.X) {
            new ce();
            return;
        }
        MGMIDlet.d().a((Displayable)new ce(), true);
    }

    public final void d(int n, int n2) {
        this.a = true;
    }

    protected final void keyPressed(int n) {
        if (this.a) {
            return;
        }
        n = ag.a(n, true);
        v.c[n] = 2;
    }

    protected final void keyReleased(int n) {
        if (this.a) {
            return;
        }
        n = ag.a(n, true);
        v.c[n] = 1;
    }

    protected final void pointerPressed(int n, int n2) {
        if (this.a) {
            return;
        }
        v.A = n - v.x;
        v.B = n2 - v.y;
    }

    protected final void pointerReleased(int n, int n2) {
        if (this.a) {
            return;
        }
        v.C = n - v.x;
        v.D = n2 - v.y;
    }
}
