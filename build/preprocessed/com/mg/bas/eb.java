package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class eb {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private ec[] h;

    public eb(String string) {
        this.a = string;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final void a(String string) {
        this.b = string;
    }

    public final String c() {
        return this.c;
    }

    public final void b(String string) {
        this.c = string;
    }

    public final String d() {
        return this.d;
    }

    public final void c(String string) {
        this.d = string;
    }

    public final void d(String string) {
        this.e = string;
    }

    public final String toString() {
        String string = "[Action] " + this.a + (this.f != null ? " [Label] " + this.f : "") + (this.b != null ? " [URL] " + this.b : "") + (this.c != null ? " [Phone No] " + this.c : "") + (this.d != null ? " [SMSC] " + this.d : "") + (this.e != null ? " [PRICE] " + this.e : "");
        if (this.h != null) {
            int n = 0;
            while (n < this.h.length) {
                string = String.valueOf(string) + " " + this.h[n].toString();
                ++n;
            }
        }
        return string;
    }

    public final String e() {
        return this.f;
    }

    public final void e(String string) {
        this.f = string;
    }

    public final ec[] f() {
        return this.h;
    }

    public final void a(ec[] ecArray) {
        this.h = ecArray;
    }

    public final String g() {
        return this.g;
    }

    public final void f(String string) {
        this.g = string;
    }
}
