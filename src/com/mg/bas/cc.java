package com.mg.bas;
// UI component for displaying an image at a specific position, extends at.
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class cc extends at {
  private Image a;
  
  public cc(Image paramImage, int paramInt1, int paramInt2) {
    this.m = paramInt1;
    this.n = paramInt2;
    this.o = paramImage.getWidth();
    this.p = paramImage.getHeight();
    this.a = paramImage;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramGraphics.drawImage(this.a, this.m, this.n, 0);
  }
  
  public final void i() {}
}


/* Location:              C:\Decompile\twelvefull.jar!\cc.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */