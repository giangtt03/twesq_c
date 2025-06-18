package com.mg.bas;
// Singleton class for managing SMS sending/receiving threads, implements bf and Runnable.
// Decompiled with: CFR 0.152
// Class Version: 1
import java.io.IOException;
import javax.microedition.io.Connector;
import javax.wireless.messaging.Message;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

final class cn
implements bf,
Runnable {
    private cf a;
    private cf b;
    private static cn c;
    private static boolean d;
    private boolean e;
    private Object f = new Object();
    private boolean g = false;

    public static cn a() {
        if (c == null) {
            c = new cn();
        }
        ag.g();
        return c;
    }

    protected cn() {
        Thread thread = new Thread(this);
        thread.start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void run() {
        this.e = false;
        while (true) {
            Object object;
            if (this.a == null) {
                try {
                    object = this.f;
                    synchronized (object) {
                        this.f.wait();
                    }
                }
                catch (Throwable throwable) {
                    object = throwable;
                    throwable.printStackTrace();
                }
                continue;
            }
            if (cr.d() && this.g) {
                this.a = null;
                v.Z = false;
                object = ag.b().a("Chú ý", "Mạng đang bị nghẽn, vui lòng thử lại sau.", "Đóng", 2, 1);
                ((am)object).a(ag.b());
                ag.b().a((al)object, false);
                ag.b().e(-10010);
                continue;
            }
            v.Z = true;
            object = ag.b().a("Chú ý", "Đang gửi tin nhắn SMS", false);
            ((am)object).b(-10001);
            ag.b().a((al)object, false);
            ag.b().e(-10010);
            object = "sms://" + this.a.a;
            ct.a("[SMS:" + this.a.a + "]" + this.a.b);
            Object object2 = null;
            try {
                Throwable throwable;
                try {
                    object2 = (MessageConnection)Connector.open((String)object);
                    throwable = (TextMessage)object2.newMessage("text");
                    throwable.setAddress((String)object);
                    throwable.setPayloadText(this.a.b);
                    object2.send((Message)throwable);
                    cr.f();
                    if (cr.d()) {
                        this.g = true;
                        this.a = null;
                        ag.b().a(-10001, false);
                        object = ag.b().a("Chú ý", "Đã gửi tin thành công, đang chờ phản hồi từ hệ thống", "Ẩn", 3, 1);
                        ((am)object).a(this);
                        ((am)object).b(-10004);
                        ag.b().a((al)object, false);
                        d = true;
                    } else {
                        ag.b().a(-10001, false);
                        if (this.a.c != null) {
                            this.a.c.a();
                        }
                        this.a = null;
                    }
                }
                catch (Throwable throwable2) {
                    throwable = throwable2;
                    throwable2.printStackTrace();
                    this.b = this.a;
                    this.a = null;
                    ag.b().a(-10001, false);
                    object = ag.b().a("Chú ý", "Không thể gửi tin SMS. Bạn có muốn gửi lại không?", "Có", 1, "Không", 2, 1);
                    ((am)object).a(this);
                    ((am)object).b(-10002);
                    ag.b().a((al)object);
                    if (object2 == null) continue;
                    try {
                        object2.close();
                    }
                    catch (IOException iOException) {
                        object2 = iOException;
                        iOException.printStackTrace();
                    }
                    continue;
                }
            }
            catch (Throwable throwable) {
                if (object2 != null) {
                    try {
                        object2.close();
                    }
                    catch (IOException iOException) {
                        object2 = iOException;
                        iOException.printStackTrace();
                    }
                }
                throw throwable;
            }
            if (object2 == null) continue;
            try {
                object2.close();
                continue;
            }
            catch (IOException iOException) {
                object2 = iOException;
                iOException.printStackTrace();
                continue;
            }
            break;
        }
    }

    final void a(cf cf2) {
        if (cf2 != null) {
            this.a = cf2;
            this.b();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void b() {
        Object object = this.f;
        synchronized (object) {
            this.f.notify();
            return;
        }
    }

    public final void d(int n, int n2) {
        if (n2 == 4) {
            ag.b().a(-10002, false);
            this.a = this.b;
            this.b = null;
            this.b();
            return;
        }
        if (n2 == 5) {
            this.b = null;
            ag.b().a(-10002, false);
            return;
        }
        if (n2 == 2) {
            ag.b().a(-10002, false);
            return;
        }
        if (n2 == 1) {
            ag.b().a(-10002, false);
            this.a(this.b);
            this.b = null;
            return;
        }
        if (n2 == 3 && d) {
            d = false;
            ag.b().a(-10004, false);
        }
    }
}
