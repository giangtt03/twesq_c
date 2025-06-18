package com.mg.bas;
// Utility class for managing persistent storage and configuration, provides static methods for save/load.
// Decompiled with: CFR 0.152
// Class Version: 1
public class cs {
  private static int b = 10;
  public static u a;

  public static final boolean a() {
    return a.c(-14);
  }

  public static final byte[] b() {
    return a.a(-14);
  }

  public static void a(byte[] byArray) {
    a.b(-14, byArray, 0, 13);
  }

  public static void c() {
    if (!v.V) {
      return;
    }
    v.Y = 0;
    byte[] byArray = a.a(-8);
    if (byArray != null && byArray.length >= 4) {
      v.Y = m.c(byArray);
    }
    byArray = m.a(++v.Y);
    a.b(-8, byArray, 0, 4);
  }

  public static void d() {
    if (!v.V) {
      return;
    }
    cs.a(false);
  }

  public static void a(boolean bl) {
    if (!v.V) {
      return;
    }
    if (bl) {
      if (--v.T <= 0) {
        v.S = false;
        v.T = 0;
        return;
      }
    } else {
      v.S = true;
      v.T = 4;
    }
  }

  public static byte[] e() {
    return ((u) null).a(-12);
  }

  public static int[] f() {
    int[] nArray = new int[b];
    byte[] byArray = a.a(-1);
    if (byArray == null) {
      byArray = new byte[b + 1 << 2];
      byte[] byArray2 = m.a(cv.a(4) + 1);
      System.arraycopy(byArray2, 0, byArray, byArray.length - 4, 4);
      a.b(-1, byArray, 0, byArray.length);
    }
    int n = 0;
    while (n < nArray.length) {
      nArray[n] = m.a(byArray, n << 2);
      ++n;
    }
    return nArray;
  }

  /*
   * WARNING - void declaration
   */
  public static boolean a(int[] nArray) {
    if (nArray == null) {
      return false;
    }
    boolean[] blArray = new boolean[4];
    int idx = nArray.length - 1;
    while (idx >= 0) {
      if (nArray[idx] > 0 && nArray[idx] <= 4) {
        blArray[nArray[idx] - 1] = true;
      }
      --idx;
    }
    boolean result = true;
    for (int i = 0; i < 4; i++) {
      result &= blArray[i];
    }
    return result;
  }

  public static void a(int n, int n2, String string, String string2) {
    if (Math.abs(n) >= b) {
      return;
    }
    byte[] byArray = a.a(-1);
    if (byArray == null) {
      return;
    }
    Object[] objectArray = new int[b + 1];
    int[] nArray = new int[4];
    int n3 = 0;
    while (n3 < objectArray.length) {
      objectArray[n3] = m.a(byArray, n3 << 2);
      if (n3 < objectArray.length - 1 && objectArray[n3] > 0) {
        int n4 = objectArray[n3] - 1;
        nArray[n4] = nArray[n4] + 1;
      }
      ++n3;
    }
    n3 = -1;
    if (n2 != 1) {
      int n5 = Math.abs(objectArray[objectArray.length - 1]) - 1;
      int n6 = nArray[0] + nArray[1] + nArray[2] + nArray[3];
      if (n6 >= 10) {
        return;
      }
      if (n6 >= 7) {
        n6 = 0;
        while (n6 < 4) {
          if (n6 != n5 && nArray[n6] <= 0) {
            n3 = n6;
            break;
          }
          ++n6;
        }
        if (n3 == -1) {
          while ((n3 = cv.a(4)) == n5) {
          }
        }
      } else {
        while ((n3 = cv.a(4)) == n5) {
        }
      }
      ++n3;
    } else {
      if (string == null) {
        return;
      }
      n3 = Math.abs(objectArray[objectArray.length - 1]);
      objectArray = string.getBytes();
      a.a(-2, (byte[]) objectArray, 0, objectArray.length);
    }
    ct.a("index=" + n + ",luckyNum=" + n2 + ",codeWin=" + string + "recordChoose=" + n3);
    byte[] byArray2 = m.a(n3);
    System.arraycopy(byArray2, 0, byArray, n << 2, 4);
    a.a(-1, byArray, 0, byArray.length);
    if (string2 != null) {
      if (n2 == 1 && string != null) {
        byArray = string2.trim().getBytes();
        a.a(-3, byArray, 0, byArray.length);
        byArray = string.trim().getBytes();
        a.a(-2, byArray, 0, byArray.length);
      } else {
        byArray = a.a(-2);
        if (byArray == null) {
          byArray = string2.trim().getBytes();
          a.a(-3, byArray, 0, byArray.length);
        }
      }
    }
    a.a();
  }

  public static byte[] g() {
    return a.a(-2);
  }

  public static String h() {
    byte[] byArray = a.a(-3);
    if (byArray == null) {
      return null;
    }
    return new String(byArray);
  } 

  public static void i() {
    try {
      a.b(-1);
      a.b(-2);
      a.b(-3);
      a.a();
      return;
    } catch (Throwable throwable) {
      Throwable throwable2 = throwable;
      throwable.printStackTrace();
      return;
    }
  }

  public static void a(int n, be be2) {
    n = v.Y;
    ci.a("linc0", n, be2);
  }
}
