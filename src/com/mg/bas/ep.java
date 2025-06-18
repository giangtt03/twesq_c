package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Image;

public final class ep {
    private static byte[] d = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
    public Image a;
    public String b;
    public short c;

    public static ep[] a(byte[] byArray) {
        int n = m.a(byArray[0], byArray[1]);
        ep[] epArray = null;
        if (n > 0) {
            epArray = new ep[n];
            int n2 = 2;
            int n3 = 0;
            while (n3 < n) {
                int n4;
                epArray[n3] = new ep();
                epArray[n3].c = m.b(byArray[n2++], byArray[n2++]);
                if ((n4 = m.a(byArray[n2++], byArray[n2++], byArray[n2++], byArray[n2++])) > 0) {
                    epArray[n3].b = i.a(byArray, n2, n4);
                    n2 += n4;
                }
                if ((n4 = m.a(byArray[n2++], byArray[n2++], byArray[n2++], byArray[n2++])) > 0) {
                    try {
                        byte by = byArray[n2 - 1];
                        byte by2 = byArray[n2 - 2];
                        byte by3 = byArray[n2 - 3];
                        byte by4 = byArray[n2 - 4];
                        byte by5 = byArray[n2 - 5];
                        byte by6 = byArray[n2 - 6];
                        byte by7 = byArray[n2 - 7];
                        byte by8 = byArray[n2 - 8];
                        byArray[n2 - 1] = d[7];
                        byArray[n2 - 2] = d[6];
                        byArray[n2 - 3] = d[5];
                        byArray[n2 - 4] = d[4];
                        byArray[n2 - 5] = d[3];
                        byArray[n2 - 6] = d[2];
                        byArray[n2 - 7] = d[1];
                        byArray[n2 - 8] = d[0];
                        epArray[n3].a = Image.createImage((byte[])byArray, (int)(n2 - d.length), (int)(n4 + d.length));
                        byArray[n2 - 1] = by;
                        byArray[n2 - 2] = by2;
                        byArray[n2 - 3] = by3;
                        byArray[n2 - 4] = by4;
                        byArray[n2 - 5] = by5;
                        byArray[n2 - 6] = by6;
                        byArray[n2 - 7] = by7;
                        byArray[n2 - 8] = by8;
                    }
                    catch (Exception exception) {}
                    n2 += n4;
                }
                ++n3;
            }
        }
        return epArray;
    }
}
