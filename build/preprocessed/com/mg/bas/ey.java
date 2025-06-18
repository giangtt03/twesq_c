package com.mg.bas;
import javax.microedition.lcdui.Graphics;

public class ey extends aq {
  private boolean i;
  
  private String j;
  
  private d k = bx.d;
  
  private int l = 0;
  
  private int m = 0;
  
  public ey() {
    this("", false);
  }
  
  public ey(String paramString, boolean paramBoolean) {
    this.i = paramBoolean;
    String str = paramString;
    ey ey1;
    (ey1 = this).j = str;
    if (i.b(str)) {
      ey1.m = 0;
      return;
    } 
    ey1.m = ey1.k.a(str);
  }
  
  public final boolean a() {
    return this.i;
  }
  
  public void e(boolean paramBoolean) {
    this.i = paramBoolean;
  }
  
  public final boolean f(int paramInt) {
    if (paramInt == 95) {
      e(!this.i);
      return true;
    } 
    return false;
  }
  
  public final boolean c(int paramInt1, int paramInt2) {
    if (paramInt1 > c() && paramInt1 < c() + e() && paramInt2 > d() && paramInt2 < d() + f()) {
      if (this.g) {
        f(95);
      } else {
        d(true);
      } 
      return true;
    } 
    return false;
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramInt1 = c() + paramInt1;
    paramInt2 = d() + paramInt2;
    int i = 10323806;
    int j = 14273459;
    int k = 15722458;
    if (this.g && (this.b == null || this.b.m())) {
      if (this.m > 0) {
        i = e() + this.m + 5;
        pc.f(paramGraphics, paramInt1, paramInt2, i, f());
      } 
      i = 22523;
      j = 9287679;
      k = 13295359;
    } 
    paramGraphics.setColor(j);
    paramGraphics.fillRect(paramInt1 + 2, paramInt2 + 2, e() - 4, f() - 4);
    paramGraphics.setColor(i);
    paramGraphics.drawRect(paramInt1, paramInt2, e() - 1, f() - 1);
    paramGraphics.setColor(k);
    paramGraphics.drawRect(paramInt1 + 1, paramInt2 + 1, e() - 3, f() - 3);
    if (this.i)
      pc.f(paramGraphics, paramInt1, paramInt2, e(), f(), 0); 
    this.k.a(paramGraphics, this.j, paramInt1 + e() + 5, paramInt2, 0);
  }
  
  public final void h(int paramInt) {
    this.l = paramInt;
  }
  
  public final int q() {
    return this.l;
  }
}


/* Location:              C:\Decompile\twelvefull.jar!\ey.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */