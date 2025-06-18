package com.mg.bas;
// Singleton class for handling incoming SMS messages, implements MessageListener and manages MessageConnection.
// Decompiled with: CFR 0.152
// Class Version: 1
import java.io.IOException;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.MessageListener;

final class ch
implements MessageListener {
    private static ch a;
    private static cm b;
    private cg c;
    private static MessageConnection d;

    protected ch() {
        ci ci2 = ci.a();
        ch ch2 = this;
        this.c = ci2;
    }

    private static ch a() {
        if (a == null) {
            a = new ch();
        }
        return a;
    }

    public static void a(MessageConnection object) {
        MessageConnection messageConnection = object;
        object = ch.a();
        d = messageConnection;
        try {
            d.setMessageListener((MessageListener)object);
            return;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public final void notifyIncomingMessage(MessageConnection object) {
        b = new cm(this.c, (MessageConnection)object);
        object = b;
        object = new Thread((Runnable)object);
        object.start();
    }

    public static void a(String string, String string2, be be2) {
        ch.a();
        cn.a().a(new cf(string, string2, be2));
    }
}
