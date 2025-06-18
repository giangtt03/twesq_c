package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class nu {
    private static final a a = new a(4);
    private static final a b = new a(4);
    private static final a c = new a(4);

    public static void a(ns ns2) {
        ct.a("QuestNotifier: add " + ns2);
        a.a(ns2);
    }

    public static void a(nt nt2) {
        ct.a("QuestNotifier: add " + nt2);
        b.a(nt2);
    }

    public static void b(ns ns2) {
        ct.a("QuestNotifier: update " + ns2);
        c.a(ns2);
    }

    public static ns a() {
        if (a.d() == 0) {
            return null;
        }
        ns ns2 = (ns)a.b(0);
        a.a(0);
        return ns2;
    }

    public static nt b() {
        if (b.d() == 0) {
            return null;
        }
        nt nt2 = (nt)b.b(0);
        b.a(0);
        return nt2;
    }

    public static ns c() {
        if (c.d() == 0) {
            return null;
        }
        ns ns2 = (ns)c.b(0);
        c.a(0);
        return ns2;
    }
}
