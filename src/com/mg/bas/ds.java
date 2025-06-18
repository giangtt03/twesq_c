package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class ds {
    private String a;
    private String b;
    private String c;
    private String d;
    private short e;
    private short f;
    private short g;

    public ds() {
        this(null);
    }

    public ds(String string) {
        this.a = string;
    }

    public final String a() {
        return this.a;
    }

    public final void a(String string) {
        this.a = string;
    }

    public final String b() {
        return this.b;
    }

    public final void b(String string) {
        this.b = string;
    }

    public final short c() {
        return this.e;
    }

    public final void a(short s) {
        this.e = s;
    }

    public final short d() {
        return this.f;
    }

    public final void b(short s) {
        this.f = s;
    }

    public final short e() {
        return this.g;
    }

    public final void c(short s) {
        this.g = s;
    }

    public final String f() {
        return this.c;
    }

    public final void c(String string) {
        this.c = string;
    }

    public final String g() {
        return this.d;
    }

    public final void d(String string) {
        this.d = string;
    }

    public static String e(String string) {
        if (string == null) {
            return null;
        }
        string = string.toLowerCase().trim();
        string = string.replace(' ', '_');
        while (string.charAt(0) == '@') {
            string = string.substring(1);
        }
        return string;
    }
}
