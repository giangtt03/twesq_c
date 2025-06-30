package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
public final class h {
    private static int[] a;
    private static int b;
    private static int c;
    private static int d;
    private static int e;
    private static int f;
    private static int g;

    static {
        byte by;
        char[] cArray = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        a = new int[360];
        int n = 0;
        while (n <= 60) {
            by = (byte)(n * 255 / 60);
            h.a[n + 0] = h.a((byte)-1, by, (byte)0);
            ++n;
        }
        n = 0;
        while (n <= 60) {
            by = (byte)(255 - n * 255 / 60);
            h.a[n + 60] = h.a(by, (byte)-1, (byte)0);
            ++n;
        }
        n = 0;
        while (n <= 60) {
            by = (byte)(n * 255 / 60);
            h.a[n + 120] = h.a((byte)0, (byte)-1, by);
            ++n;
        }
        n = 0;
        while (n <= 60) {
            by = (byte)(255 - n * 255 / 60);
            h.a[n + 180] = h.a((byte)0, by, (byte)-1);
            ++n;
        }
        n = 0;
        while (n <= 60) {
            by = (byte)(n * 255 / 60);
            h.a[n + 240] = h.a(by, (byte)0, (byte)-1);
            ++n;
        }
        n = 0;
        while (n < 60) {
            by = (byte)(255 - n * 255 / 60);
            h.a[n + 300] = h.a((byte)-1, (byte)0, by);
            ++n;
        }
        b = 1;
        c = 2;
        d = 4;
        e = 8;
        f = 16;
        g = 32;
    }

    private static byte[] a(int n) {
        byte[] byArray = new byte[3];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(n >> 16 & 0xFF);
        byArray2[1] = (byte)(n >> 8 & 0xFF);
        byArray2[2] = (byte)n;
        return byArray2;
    }

    private static int a(byte by, byte by2, byte by3) {
        byte[] byArray = new byte[4];
        byArray[1] = by;
        byArray[2] = by2;
        byArray[3] = by3;
        byte[] byArray2 = byArray;
        return m.c(byArray);
    }

    public static boolean a(byte[] byArray, int[] objectArray, int[] nArray) {
        int n;
        boolean bl;
        if (objectArray != null && nArray != null) {
            bl = false;
            n = 0;
            while (n < objectArray.length) {
                if (objectArray[n] != nArray[n]) {
                    bl = true;
                    break;
                }
                ++n;
            }
            if (!bl) {
                return false;
            }
        }
        bl = false;
        n = 0;
        int n2 = 0;
        try {
            int n3;
            byte by;
            byte by2;
            int n4;
            int n5;
            int n6 = 0;
            int n7 = byArray.length - 4;
            while (n6 < n7) {
                if (byArray[n6] == 80 && byArray[n6 + 1] == 76 && byArray[n6 + 2] == 84 && byArray[n6 + 3] == 69) {
                    n2 = n6;
                    n = m.a(byArray[n6 - 4], byArray[n6 - 3], byArray[n6 - 2], byArray[n6 - 1]);
                    break;
                }
                ++n6;
            }
            n6 = -1;
            try {
                n7 = n2 + 12 + n;
                if (byArray[n7] == 116 && byArray[n7 + 1] == 82 && byArray[n7 + 2] == 78 && byArray[n7 + 3] == 83) {
                    n6 = m.a(byArray[n7 - 4], byArray[n7 - 3], byArray[n7 - 2], byArray[n7 - 1]);
                    --n6;
                }
            }
            catch (Exception exception) {
                n6 = -1;
            }
            if (n6 >= 0) {
                n7 = 0;
                n5 = n2 + 4;
                n4 = n + n2 + 4;
                while (n5 < n4) {
                    by2 = byArray[n5];
                    by = byArray[n5 + 1];
                    n3 = byArray[n5 + 2];
                    if (by2 == 255 && by == 255 && n3 == 255) {
                        ++n7;
                    }
                    n5 += 3;
                }
                if (n7 < 2) {
                    n6 = -1;
                }
            }
            boolean[] blArray = new boolean[n / 3];
            n5 = 0;
            while (n5 < blArray.length) {
                blArray[n5] = true;
                ++n5;
            }
            n5 = 0;
            while (n5 < objectArray.length) {
                n4 = (byte)(objectArray[n5] >> 16 & 0xFF);
                by2 = (byte)(objectArray[n5] >> 8 & 0xFF);
                by = (byte)objectArray[n5];
                int n8 = n3 = n2 + 4;
                int n9 = n + n3;
                while (n8 < n9) {
                    if ((n8 - n3) / 3 != n6 && blArray[(n8 - n3) / 3] && byArray[n8] == n4 && byArray[n8 + 1] == by2 && byArray[n8 + 2] == by) {
                        byArray[n8] = (byte)(nArray[n5] >> 16 & 0xFF);
                        byArray[n8 + 1] = (byte)(nArray[n5] >> 8 & 0xFF);
                        byArray[n8 + 2] = (byte)nArray[n5];
                        blArray[(n8 - n3) / 3] = false;
                        bl = true;
                    }
                    n8 += 3;
                }
                ++n5;
            }
            byte[] tempArray = new byte[n + 4];
            int tempIndex = 0;
            while (tempIndex < n + 4) {
                tempArray[tempIndex] = byArray[n2 + tempIndex];
                ++tempIndex;
            }
            // TODO: Replace with correct PNG/checksum utility class
            // e.a();
            // long l = e.a(tempArray);
            long l = 0L; // Placeholder for checksum value
            while (n5 >= 0) {
                byArray[n2 + 4 + n + 3 - n5] = (byte)(l >> (n5 * 8) & 0xFFL);
                --n5;
            }
            return bl;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return false;
        }
    }

    public static void a(byte[] byArray, int n) {
        if (n == 0) {
            return;
        }
        int n2 = 0;
        int n3 = 0;
        try {
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            int n9 = 0;
            int n10 = byArray.length - 4;
            while (n9 < n10) {
                if (byArray[n9] == 80 && byArray[n9 + 1] == 76 && byArray[n9 + 2] == 84 && byArray[n9 + 3] == 69) {
                    n3 = n9;
                    n2 = m.a(byArray[n9 - 4], byArray[n9 - 3], byArray[n9 - 2], byArray[n9 - 1]);
                    break;
                }
                ++n9;
            }
            n9 = -1;
            try {
                n10 = n3 + 12 + n2;
                if (byArray[n10] == 116 && byArray[n10 + 1] == 82 && byArray[n10 + 2] == 78 && byArray[n10 + 3] == 83) {
                    n9 = m.a(byArray[n10 - 4], byArray[n10 - 3], byArray[n10 - 2], byArray[n10 - 1]);
                    --n9;
                }
            }
            catch (Exception exception) {
                n9 = -1;
            }
            if (n9 >= 0) {
                n10 = 0;
                n8 = n3 + 4;
                n7 = n2 + n3 + 4;
                while (n8 < n7) {
                    n6 = byArray[n8];
                    n5 = byArray[n8 + 1];
                    n4 = byArray[n8 + 2];
                    if (n6 == 255 && n5 == 255 && n4 == 255) {
                        ++n10;
                    }
                    n8 += 3;
                }
                if (n10 < 2) {
                    n9 = -1;
                }
            }
            n10 = n3 + 4;
            n8 = n3 + 4 + n2;
            while (n10 < n8) {
                if (n10 != n9) {
                    int n11;
                    n7 = byArray[n10];
                    n6 = byArray[n10 + 1];
                    n5 = byArray[n10 + 2];
                    int n12 = h.a((byte)n7, (byte)n6, (byte)n5);
                    n6 = n;
                    n7 = n12;
                    n5 = n12 >> 16 & 0xFF;
                    n4 = n7 >> 8 & 0xFF;
                    int n13 = n7 & 0xFF;
                    int n14 = 0;
                    int n15 = 0;
                    if (n5 == n4 && n4 == n13) {
                        n11 = n7;
                    } else {
                        n7 = 0;
                        if (n5 >= n4 && n4 >= n13) {
                            n14 = n5;
                            n15 = n13;
                            n7 = 60 * (n4 - n13) / (n5 - n13);
                            if (n7 < 0 || n7 > 60) {
                                System.out.println("Co van de khi tinh goc hien tại o truong hop 1");
                            }
                        } else if (n4 > n5 && n5 >= n13) {
                            n14 = n4;
                            n15 = n13;
                            n7 = 120 - 60 * (n5 - n13) / (n4 - n13);
                            if (n7 < 60 || n7 > 120) {
                                System.out.println("Co van de khi tinh goc hien tại o truong hop 2");
                            }
                        } else if (n4 >= n13 && n13 > n5) {
                            n14 = n4;
                            n15 = n5;
                            n7 = 120 + 60 * (n13 - n5) / (n4 - n5);
                            if (n7 < 120 || n7 > 180) {
                                System.out.println("Co van de khi tinh goc hien tại o truong hop 3");
                            }
                        } else if (n13 > n4 && n4 > n5) {
                            n14 = n13;
                            n15 = n5;
                            n7 = 240 - 60 * (n4 - n5) / (n13 - n5);
                            if (n7 < 180 || n7 > 240) {
                                System.out.println("Co van de khi tinh goc hien tại o truong hop 4");
                            }
                        } else if (n13 > n5 && n5 >= n4) {
                            n14 = n13;
                            n15 = n4;
                            n7 = 240 + 60 * (n5 - n4) / (n13 - n4);
                            if (n7 < 240 || n7 > 320) {
                                System.out.println("Co van de khi tinh goc hien tại o truong hop 5");
                            }
                        } else if (n5 >= n13 && n13 > n4) {
                            n14 = n5;
                            n15 = n4;
                            n7 = 360 - 60 * (n13 - n4) / (n5 - n4);
                            if (n7 < 320 || n7 > 360) {
                                System.out.println("Co van de khi tinh goc hien tại o truong hop 6");
                            }
                        }
                        n7 = (n7 + n6 + 360) % 360;
                        n6 = 0;
                        n5 = 0;
                        n4 = 0;
                        if (n7 >= 0 && n7 < 60) {
                            n6 = n14;
                            n4 = n15;
                            n5 = n7 * (n6 - n4) / 60 + n4;
                        } else if (60 <= n7 && n7 < 120) {
                            n5 = n14;
                            n4 = n15;
                            n6 = (n7 - 120) * (n4 - n5) / 60 + n4;
                        } else if (120 <= n7 && n7 < 180) {
                            n5 = n14;
                            n6 = n15;
                            n4 = (n7 - 120) * (n5 - n6) / 60 + n6;
                        } else if (180 <= n7 && n7 < 240) {
                            n4 = n14;
                            n6 = n15;
                            n5 = (n7 - 240) * (n6 - n4) / 60 + n6;
                        } else if (240 <= n7 && n7 < 300) {
                            n4 = n14;
                            n5 = n15;
                            n6 = (n7 - 240) * (n4 - n5) / 60 + n5;
                        } else if (300 <= n7 && n7 < 360) {
                            n6 = n14;
                            n5 = n15;
                            n4 = (n7 - 360) * (n5 - n6) / 60 + n5;
                        }
                        n7 = 0 | n6 << 16;
                        n11 = n7 = (n7 |= n5 << 8) | n4;
                    }
                    byte[] byArray2 = h.a(n11);
                    byArray[n10] = byArray2[0];
                    byArray[n10 + 1] = byArray2[1];
                    byArray[n10 + 2] = byArray2[2];
                }
                n10 += 3;
            }
            byte[] byArray3 = new byte[n2 + 4];
            n10 = 0;
            while (n10 < n2 + 4) {
                byArray3[n10] = byArray[n3 + n10];
                ++n10;
            }
            // TODO: Replace with correct PNG/checksum utility class
            // e.a();
            // long l = e.a(byArray3);
            long l = 0L; // Placeholder for checksum value
            n5 = 3;
            while (n5 >= 0) {
                byArray[n2 + 4 + n + 3 - n5] = (byte)(l >> (n5 * 8) & 0xFFL);
                --n5;
            }
            return;
        }
        catch (Exception exception) {
            System.out.println("Co loi trong qua trinh HUE 1 file PNG");
            exception.printStackTrace();
            return;
        }
    }

    public static void b(byte[] byArray, int n) {
        if (n == 0) {
            return;
        }
        int n2 = 0;
        int n3 = 0;
        try {
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            int n9 = 0;
            int n10 = byArray.length - 4;
            while (n9 < n10) {
                if (byArray[n9] == 80 && byArray[n9 + 1] == 76 && byArray[n9 + 2] == 84 && byArray[n9 + 3] == 69) {
                    n3 = n9;
                    n2 = m.a(byArray[n9 - 4], byArray[n9 - 3], byArray[n9 - 2], byArray[n9 - 1]);
                    break;
                }
                ++n9;
            }
            n9 = -1;
            try {
                n10 = n3 + 12 + n2;
                if (byArray[n10] == 116 && byArray[n10 + 1] == 82 && byArray[n10 + 2] == 78 && byArray[n10 + 3] == 83) {
                    n9 = m.a(byArray[n10 - 4], byArray[n10 - 3], byArray[n10 - 2], byArray[n10 - 1]);
                    --n9;
                }
            }
            catch (Exception exception) {
                n9 = -1;
            }
            if (n9 >= 0) {
                n10 = 0;
                n8 = n3 + 4;
                n7 = n2 + n3 + 4;
                while (n8 < n7) {
                    n6 = byArray[n8];
                    n5 = byArray[n8 + 1];
                    n4 = byArray[n8 + 2];
                    if (n6 == 255 && n5 == 255 && n4 == 255) {
                        ++n10;
                    }
                    n8 += 3;
                }
                if (n10 < 2) {
                    n9 = -1;
                }
            }
            n10 = n3 + 4;
            n8 = n3 + 4 + n2;
            while (n10 < n8) {
                if (n10 != n9) {
                    int n11;
                    n7 = byArray[n10];
                    n6 = byArray[n10 + 1];
                    n5 = byArray[n10 + 2];
                    int n12 = h.a((byte)n7, (byte)n6, (byte)n5);
                    n6 = n;
                    n7 = n12;
                    if (n6 <= -100) {
                        n11 = 0;
                    } else if (n6 >= 100) {
                        n11 = 0xFFFFFF;
                    } else {
                        n5 = n7 >> 16 & 0xFF;
                        n4 = n7 >> 8 & 0xFF;
                        n7 &= 0xFF;
                        if (n6 < 0) {
                            n5 = n5 * (n6 + 100) / 100;
                            n4 = n4 * (n6 + 100) / 100;
                            n7 = n7 * (n6 + 100) / 100;
                        } else {
                            n5 += (255 - n5) * n6 / 100;
                            n4 += (255 - n4) * n6 / 100;
                            n7 += (255 - n7) * n6 / 100;
                        }
                        n6 = 0 | n5 << 16;
                        n11 = n6 = (n6 |= n4 << 8) | n7;
                    }
                    byte[] byArray2 = h.a(n11);
                    byArray[n10] = byArray2[0];
                    byArray[n10 + 1] = byArray2[1];
                    byArray[n10 + 2] = byArray2[2];
                }
                n10 += 3;
            }
            byte[] byArray3 = new byte[n2 + 4];
            n10 = 0;
            while (n10 < n2 + 4) {
                byArray3[n10] = byArray[n3 + n10];
                ++n10;
            }
            // TODO: Replace with correct PNG/checksum utility class
            // e.a();
            // long l = e.a(byArray3);
            long l3 = 0L; // Placeholder
            for (int loopN5 = 3; loopN5 >= 0; loopN5--) {
                byArray[n2 + 4 + n + 3 - loopN5] = (byte)(l3 >> (loopN5 * 8) & 0xFFL);
            }
            return;
        }
        catch (Exception exception) {
            System.out.println("Co loi trong qua trinh HUE 1 file PNG");
            exception.printStackTrace();
            return;
        }
    }

    public static void a(byte[] byArray) {
        int n = 0;
        int n2 = 0;
        try {
            int n3;
            int n4;
            int n5;
            int n6;
            int n7 = 0;
            int n8 = byArray.length - 4;
            while (n7 < n8) {
                if (byArray[n7] == 80 && byArray[n7 + 1] == 76 && byArray[n7 + 2] == 84 && byArray[n7 + 3] == 69) {
                    n2 = n7;
                    n = m.a(byArray[n7 - 4], byArray[n7 - 3], byArray[n7 - 2], byArray[n7 - 1]);
                    break;
                }
                ++n7;
            }
            n7 = -1;
            try {
                n8 = n2 + 12 + n;
                if (byArray[n8] == 116 && byArray[n8 + 1] == 82 && byArray[n8 + 2] == 78 && byArray[n8 + 3] == 83) {
                    n7 = m.a(byArray[n8 - 4], byArray[n8 - 3], byArray[n8 - 2], byArray[n8 - 1]);
                    --n7;
                }
            }
            catch (Exception exception) {
                n7 = -1;
            }
            if (n7 >= 0) {
                n8 = 0;
                n6 = n2 + 4;
                n5 = n + n2 + 4;
                while (n6 < n5) {
                    n4 = byArray[n6];
                    n3 = byArray[n6 + 1];
                    byte by = byArray[n6 + 2];
                    if (n4 == 255 && n3 == 255 && by == 255) {
                        ++n8;
                    }
                    n6 += 3;
                }
                if (n8 < 2) {
                    n7 = -1;
                }
            }
            n8 = n2 + 4;
            n6 = n2 + 4 + n;
            while (n8 < n6) {
                if (n7 != n8) {
                    n5 = byArray[n8];
                    n4 = byArray[n8 + 1];
                    n3 = byArray[n8 + 2];
                    n5 = h.a((byte)n5, (byte)n4, (byte)n3);
                    n4 = n5 >> 16 & 0xFF;
                    n3 = n5 >> 8 & 0xFF;
                    n3 = n4 = (n4 + n3 + (n5 &= 0xFF)) / 3;
                    n5 = n4;
                    n4 = 0 | n4 << 16;
                    n4 |= n3 << 8;
                    byte[] byArray2 = h.a(n4 |= n5);
                    byArray[n8] = byArray2[0];
                    byArray[n8 + 1] = byArray2[1];
                    byArray[n8 + 2] = byArray2[2];
                }
                n8 += 3;
            }
            byte[] byArray3 = new byte[n + 4];
            n8 = 0;
            while (n8 < n + 4) {
                byArray3[n8] = byArray[n2 + n8];
                ++n8;
            }
            // TODO: Replace with correct PNG/checksum utility class
            // e.a();
            // long l = e.a(byArray3);
            long l = 0L; // Placeholder for checksum value
            n5 = 3;
            while (n5 >= 0) {
                byArray[n2 + 4 + n + 3 - n5] = (byte)(l >> (n5 * 8) & 0xFFL);
                --n5;
            }
            return;
        }
        catch (Exception exception) {
            System.out.println("Co loi trong qua trinh GRAY 1 file PNG");
            exception.printStackTrace();
            return;
        }
    }
}
