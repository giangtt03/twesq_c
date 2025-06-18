package com.mg.bas;
// Utility class for random number generation, provides static methods for random int ranges.
// Decompiled with: CFR 0.152
// Class Version: 1
import java.util.Random;

public final class cv {
    private static Random a = new Random(System.currentTimeMillis());

    public static final int a(int n) {
        return a.nextInt(n);
    }

    public static final int a() {
        return a.nextInt();
    }

    public static final int a(int n, int n2) {
        return a.nextInt(n2 - n + 1) + n;
    }
}
