package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class f {
    private static boolean a = false;
    private static String b = ".mg";
    private static final byte[] c = new byte[]{-119, 80, 78, 71};

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Image a(String string) {
        string = String.valueOf(string) + b;
        InputStream inputStream = null;
        // Danh sách các thư mục phổ biến trong project
        String[] folders = {
            "", // cùng package
            "/", // gốc JAR
            "/bas/",
            "/com/mg/bas/",
            "/m/",
            "/info/",
            "/play/",
            "/corner/",
            "/dialog/",
            "/offline/",
            "/audio/",
            "/f/",
        };
        for (int i = 0; i < folders.length; i++) {
            String path = folders[i].endsWith("/") ? folders[i] + string : folders[i] + string;
            inputStream = f.class.getResourceAsStream(path);
            if (inputStream != null) break;
        }
        if (inputStream == null) {
            System.out.println("[ERROR] Resource not found (tried): " + string);
            return null;
        }
        try {
            byte[] byArray = new byte[4];
            inputStream.read(byArray, 0, 4);
            int n2 = m.c(byArray);
            byte[] byArray2 = new byte[n2];
            g.a(inputStream, byArray2, 4);
            inputStream.close();
            int n3 = 0;
            while (true) {
                if (n3 >= 4) {
                    return f.a(byArray2, 0, n2);
                }
                byArray2[n3] = c[n3];
                ++n3;
            }
        } catch (Exception exception) {
            System.out.println("[ERROR] Create image: " + string);
            exception.printStackTrace();
            return null;
        }
    }

    public static byte[] b(String string) {
        return f.c(string);
    }

    public static byte[] c(String string) {
        string = String.valueOf(string) + b;
        return f.a(string, true);
    }

    /*
     * Unable to fully structure code
     */
public static byte[] a(String path, boolean useCustomHeader) {
    int offset = 0;
    byte[] data = null;
    InputStream is = null;

    try {
        is = "".getClass().getResourceAsStream(path);
        if (useCustomHeader) {
            byte[] headerBytes = new byte[4];
            is.read(headerBytes, 0, 4); // đọc 4 byte đầu
            int length = m.c(headerBytes); // hàm giải mã chiều dài từ 4 byte này
            data = new byte[length];

            // Copy header vào data nếu cần (nếu f.c chứa dữ liệu đầu vào)
            for (int i = 0; i < 4; i++) {
                data[i] = f.c[i];
            }

            offset = 4;
        } else {
            data = new byte[is.available()];
        }

        g.a(is, data, offset); // đọc dữ liệu còn lại vào data từ offset
        is.close();
    } catch (Exception e) {
        e.printStackTrace();
    }

    return data;
}


    public static Image a(byte[] byArray) {
        if (byArray == null) {
            return null;
        }
        return f.a(byArray, 0, byArray.length);
    }

    public static Image a(byte[] object, int n2, int n3) {
        if (object == null) {
            return null;
        }
        try {
            return Image.createImage((byte[])object, (int)n2, (int)n3);
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }

    public static Image d(String string) {
        return f.a(string);
    }
}
