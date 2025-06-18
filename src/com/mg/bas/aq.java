package com.mg.bas;
// Abstract base class for UI/game objects with position, state, and rendering logic.
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public abstract class aq {
    protected int a;
    protected aq b;
    protected boolean c = true;
    protected k d = new k();
    protected boolean e = true;
    protected boolean f = true;
    protected boolean g = false;
    protected af h;

    public aq() {
        this.d(this.g);
    }

    public final int b() {
        return this.a;
    }

    public final void a_(int n) {
        this.a = n;
    }

    public final void a(af af2) {
        this.h = af2;
    }

    public final int c() {
        return this.d.a;
    }

    public final int d() {
        return this.d.b;
    }

    public final int e() {
        return this.d.c;
    }

    public int f() {
        return this.d.d;
    }

    public final g g() {
        return new g(this.d.c, this.d.d);
    }

    public void a(int n2, int n3, int n4, int n5) {
        this.d.a(n2, n3, n4, n5);
    }

    public final void a(k k2) {
        this.a(k2.a, k2.b, k2.c, k2.d);
    }

    public final k h() {
        return this.d;
    }

    public void a_(int n2, int n3) {
        this.b_(n2);
        this.c(n3);
    }

    public void b(int n2, int n3) {
        this.d(n2);
        this.e(n3);
    }

    public final void b_(int n2) {
        this.d.a = n2;
    }

    public final void c(int n2) {
        this.d.b = n2;
    }

    public void d(int n2) {
        this.d.c = n2;
    }

    public final void e(int n2) {
        this.d.d = n2;
    }

    public final boolean i() {
        return this.e;
    }

    public final void a(boolean bl) {
        this.e = bl;
    }

    public final boolean j() {
        return this.f;
    }

    public void b(boolean bl) {
        this.f = bl;
    }

    public boolean k() {
        return this.c;
    }

    public void c(boolean bl) {
        this.c = bl;
    }

    public final aq l() {
        return this.b;
    }

    public void a(aq aq2) {
        this.b = aq2;
    }

    public boolean m() {
        return this.g;
    }

    public void d(boolean bl) {
        this.g = bl;
    }

    public void n() {
    }

    public void a(Graphics graphics, int n2, int n3) {
        if (this.c && this.e) {
            this.c = false;
        }
    }

    public boolean f(int n2) {
        return false;
    }

    public boolean g(int n2) {
        return false;
    }

    public boolean c(int n2, int n3) {
        return false;
    }

    public boolean e(int n2, int n3) {
        return false;
    }

    public boolean f(int n2, int n3) {
        return false;
    }

    public void o() {
    }

    public void p() {
    }

    public String toString() {
        Object object = this;
        object = "Component id = " + ((aq)object).a + ";  width=" + this.d.c + ",height=" + this.d.d + ",x=" + this.d.a + ",y=" + this.d.b;
        return object;
    }
}
