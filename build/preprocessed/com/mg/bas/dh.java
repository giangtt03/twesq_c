package com.mg.bas;
// Simple data class representing a rank or leaderboard entry, with fields for index, rank, name, and details.
// Decompiled with: CFR 0.152
// Class Version: 1
public final class dh {
    public final int a;
    public final String b;
    public String c;
    public final String d;

    public dh(int n, String string, String string2, String string3) {
        this.a = n;
        this.b = string;
        this.c = string2;
        this.d = string3;
    }

    public final String toString() {
        String string = "RankInfo[";
        string = String.valueOf(string) + "idx=" + this.a;
        string = String.valueOf(string) + ",rank=" + this.b;
        string = String.valueOf(string) + ",name=" + this.c;
        string = String.valueOf(string) + ",detail=" + this.d;
        string = String.valueOf(string) + "]";
        return string;
    }
}
