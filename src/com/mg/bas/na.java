package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Image;

public final class na
extends as {
    private int s;

    public na(int n, int n2) {
        this.c(n, n2);
        int[][] nArrayArray = new int[2][];
        int[] nArray = new int[6];
        nArray[3] = 2;
        nArray[4] = 1;
        nArray[5] = 2;
        nArrayArray[0] = nArray;
        nArrayArray[1] = new int[]{2};
        this.f = nArrayArray;
        this.r = false;
        this.q = 3;
    }

    public final int a(Image image) {
        if (image == null) {
            return 0;
        }
        this.a(image, 3);
        this.r = true;
        this.d(0);
        this.g = 0;
        this.s = 45;
        return this.f[0].length + this.s;
    }

    public final void k() {
        switch (this.e) {
            case 0: {
                if (this.g < this.f[0].length - 1) break;
                this.d(1);
                return;
            }
            case 1: {
                if (this.s <= 0) break;
                --this.s;
                if (this.s != 0) break;
                this.b = null;
                this.r = false;
            }
        }
    }
}
