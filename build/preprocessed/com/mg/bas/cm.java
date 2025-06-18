package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
// Runnable class for receiving and processing SMS messages, interacts with MessageConnection and cg callback.
import java.io.IOException;
import javax.wireless.messaging.BinaryMessage;
import javax.wireless.messaging.Message;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

final class cm
implements Runnable {
    private Message a;
    private MessageConnection b;
    private String c;
    private String d = "";
    private cg e;

    cm(cg cg2, MessageConnection messageConnection) {
        this.b = messageConnection;
        this.e = cg2;
    }

    public final void run() {
        while (!v.ae) {
            try {
                Thread.sleep(100L);
            }
            catch (Exception exception) {}
        }
        cm cm2 = this;
        try {
            cm2.a = cm2.b.receive();
            if (cm2.a != null) {
                cm2.c = cm2.a.getAddress();
                String cfr_ignored_0 = cm2.c;
                if (cm2.a instanceof TextMessage) {
                    cm2.d = ((TextMessage)cm2.a).getPayloadText();
                    if (cm2.e != null) {
                        cm2.e.a(cm2.d);
                        return;
                    }
                } else {
                    byte[] byArray = ((BinaryMessage)cm2.a).getPayloadData();
                    cm2.d = new String(byArray);
                    if (cm2.e != null) {
                        cm2.e.a(cm2.d);
                        return;
                    }
                }
            }
        }
        catch (IOException iOException) {}
    }
}
