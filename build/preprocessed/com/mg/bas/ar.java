package com.mg.bas;
// Utility class for managing an integer array and tracking progress/state.
public final class ar {
    private int a;
    private int[] b; // Thêm mảng đúng kiểu

    public ar(int[] arr) { // Constructor để truyền mảng vào
        this.b = arr;
        this.a = 0;
    }

    public final void a(int n) {
        if (b[a] == n) {
            ++a;
            if (a < b.length) {
                return;
            }
        }
        a = 0;
    }
}