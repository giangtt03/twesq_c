package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class ow {
    private static int[][] a;
    private static int[][] b;
    private static int[][] c;
    private static int[][] d;
    private static int[][] e;
    private static int[][] f;

    static {
        int[][] nArrayArray = new int[13][];
        nArrayArray[0] = new int[2];
        nArrayArray[1] = new int[]{229, 1};
        nArrayArray[2] = new int[]{229, 254};
        nArrayArray[3] = new int[]{228, 255};
        nArrayArray[4] = new int[]{145, 255};
        nArrayArray[5] = new int[]{144, 254};
        nArrayArray[6] = new int[]{144, 230};
        nArrayArray[7] = new int[]{85, 230};
        nArrayArray[8] = new int[]{85, 254};
        nArrayArray[9] = new int[]{84, 255};
        nArrayArray[10] = new int[]{1, 255};
        int[] nArray = new int[2];
        nArray[1] = 254;
        nArrayArray[11] = nArray;
        int[] nArray2 = new int[2];
        nArray2[1] = 1;
        nArrayArray[12] = nArray2;
        a = nArrayArray;
        b = new int[][]{{1, 229}, {1, 253}, {2, 254}, {83, 254}, {84, 253}, {84, 229}};
        c = new int[][]{{228, 229}, {228, 253}, {227, 254}, {146, 254}, {145, 253}, {145, 229}};
        int[][] nArrayArray2 = new int[12][];
        int[] nArray3 = new int[2];
        nArray3[0] = 1;
        nArrayArray2[0] = nArray3;
        int[] nArray4 = new int[2];
        nArray4[0] = 280;
        nArrayArray2[1] = nArray4;
        nArrayArray2[2] = new int[]{281, 1};
        nArrayArray2[3] = new int[]{281, 84};
        nArrayArray2[4] = new int[]{280, 85};
        nArrayArray2[5] = new int[]{255, 85};
        nArrayArray2[6] = new int[]{255, 229};
        nArrayArray2[7] = new int[]{26, 229};
        nArrayArray2[8] = new int[]{26, 85};
        nArrayArray2[9] = new int[]{1, 85};
        int[] nArray5 = new int[2];
        nArray5[1] = 84;
        nArrayArray2[10] = nArray5;
        int[] nArray6 = new int[2];
        nArray6[1] = 1;
        nArrayArray2[11] = nArray6;
        d = nArrayArray2;
        e = new int[][]{{26, 1}, {2, 1}, {1, 2}, {1, 83}, {2, 84}, {27, 84}};
        f = new int[][]{{255, 1}, {279, 1}, {280, 2}, {280, 83}, {279, 84}, {255, 84}};
    }

    public static void a(int n, int n2, Graphics graphics) {
        ow.c((n += 5) + 3, ++n2 + 3, graphics);
        graphics.setColor(0x5A5A5A);
        graphics.fillRect(n + 3, n2 + 230, 81, 24);
        graphics.fillRect(n + 147, n2 + 230, 81, 24);
        graphics.setColor(0x9933FF);
        ow.a(n, n2, a, graphics);
        graphics.setColor(52479);
        graphics.drawRect(n + 1, n2 + 1, 228, 228);
        ow.a(n, n2, b, graphics);
        ow.a(n, n2, c, graphics);
        graphics.setColor(230911);
        graphics.drawRect(n + 2, n2 + 2, 226, 226);
        graphics.drawRect(n + 2, n2 + 229, 82, 25);
        graphics.drawRect(n + 146, n2 + 229, 82, 25);
        ow.a(n + 5, n2 + 232, graphics, false);
        ow.a(n + 5, n2 + 239, graphics, true);
        ow.a(n + 5, n2 + 246, graphics, false);
        ow.a(n + 149, n2 + 232, graphics, false);
        ow.a(n + 149, n2 + 239, graphics, true);
        ow.a(n + 149, n2 + 246, graphics, false);
    }

    public static void b(int n, int n2, Graphics graphics) {
        ow.c((n += 19) + 29, ++n2 + 3, graphics);
        graphics.setColor(0x5A5A5A);
        graphics.fillRect(n + 3, n2 + 3, 24, 81);
        graphics.fillRect(n + 256, n2 + 3, 24, 81);
        graphics.setColor(0x9933FF);
        ow.a(n, n2, d, graphics);
        graphics.setColor(52479);
        graphics.drawRect(n + 27, n2 + 1, 228, 228);
        ow.a(n, n2, e, graphics);
        ow.a(n, n2, f, graphics);
        graphics.setColor(230911);
        graphics.drawRect(n + 28, n2 + 2, 226, 226);
        graphics.drawRect(n + 2, n2 + 2, 25, 82);
        graphics.drawRect(n + 255, n2 + 2, 25, 82);
        ow.b(n + 5, n2 + 5, graphics, false);
        ow.b(n + 12, n2 + 5, graphics, true);
        ow.b(n + 19, n2 + 5, graphics, false);
        ow.b(n + 258, n2 + 5, graphics, false);
        ow.b(n + 265, n2 + 5, graphics, true);
        ow.b(n + 272, n2 + 5, graphics, false);
    }

    private static void a(int n, int n2, Graphics graphics, boolean bl) {
        graphics.drawLine(n + 1, n2, n + 74, n2);
        graphics.drawLine(n + 75, n2 + 1, n + 75, n2 + 3);
        graphics.drawLine(n + 1, n2 + 4, n + 74, n2 + 4);
        graphics.drawLine(n, n2 + 1, n, n2 + 3);
        if (bl) {
            graphics.drawLine(n + 18, n2 + 1, n + 18, n2 + 3);
            graphics.drawLine(n + 37, n2 + 1, n + 37, n2 + 3);
            graphics.drawLine(n + 56, n2 + 1, n + 56, n2 + 3);
        }
    }

    private static void b(int n, int n2, Graphics graphics, boolean bl) {
        graphics.drawLine(n, n2 + 1, n, n2 + 74);
        graphics.drawLine(n + 1, n2 + 75, n + 3, n2 + 75);
        graphics.drawLine(n + 4, n2 + 1, n + 4, n2 + 74);
        graphics.drawLine(n + 1, n2, n + 3, n2);
        if (bl) {
            graphics.drawLine(n + 1, n2 + 18, n + 3, n2 + 18);
            graphics.drawLine(n + 1, n2 + 37, n + 3, n2 + 37);
            graphics.drawLine(n + 1, n2 + 56, n + 3, n2 + 56);
        }
    }

    private static void c(int n, int n2, Graphics graphics) {
        int n3 = 0;
        while (n3 < 8) {
            int n4 = 0;
            while (n4 < 8) {
                if (n3 % 2 == 0 && n4 % 2 == 0 || n3 % 2 == 1 && n4 % 2 == 1) {
                    graphics.setColor(0x474747);
                } else {
                    graphics.setColor(0x3A3A3A);
                }
                graphics.fillRect(n + n3 * 28, n2 + n4 * 28, 28, 28);
                ++n4;
            }
            ++n3;
        }
    }

    private static void a(int n, int n2, int[][] nArray, Graphics graphics) {
        int n3 = 0;
        while (n3 < nArray.length - 1) {
            graphics.drawLine(n + nArray[n3][0], n2 + nArray[n3][1], n + nArray[n3 + 1][0], n2 + nArray[n3 + 1][1]);
            ++n3;
        }
    }
}
