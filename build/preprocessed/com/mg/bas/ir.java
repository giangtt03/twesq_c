package com.mg.bas;
import javax.microedition.lcdui.Graphics;

public final class ir extends at {
    private int a;
    private int b;
    private int c;
    
    private at parentAt;        
    private as parentAs;        
    private int[] offsetArray;  
    
    public ir(at parent, as asParent, int[] offsets) {
        this.parentAt = parent;
        this.parentAs = asParent;
        this.offsetArray = offsets != null ? offsets : new int[]{0, 0}; // default offset
        this.a = 0;
        this.b = 0;
        this.c = 2; // default value cho c
    }
    
    public ir() {
        this(null, null, new int[]{0, 0});
    }
    
    public final void j(int paramInt) {
        if (parentAt != null) {
            parentAt.j(paramInt);
        }

    }
    
    public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
        // todo
    }
    
    public final void b(Graphics paramGraphics, int paramInt1, int paramInt2) {
        if (parentAt == null || !parentAt.m() || this.a < 5) {
            return;
        }
        
        if (parentAs != null && offsetArray != null && offsetArray.length >= 2) {
            parentAs.a(paramGraphics, paramInt1 + offsetArray[0], paramInt2 + offsetArray[1]);
        }
    }
    
    public final void c(Graphics paramGraphics, int paramInt1, int paramInt2) {
        if (parentAt == null || !parentAt.m() || this.a >= 5) {
            return;
        }
        
        if (parentAs != null && offsetArray != null && offsetArray.length >= 2) {
            parentAs.a(paramGraphics, paramInt1 + offsetArray[0], paramInt2 + offsetArray[1]);
        }
    }
    
    public final void i() {
        if (!this.r) {
            return;
        }
        
        if (this.b > 0) {
            this.b--;
            if (this.b == 0) {
                if (parentAt != null) {
                    parentAt.b(true);
                }
            } else {
                return;
            }
        }
        
        if (parentAs != null) {
            parentAs.i();
        }
        
        if (this.c > 0) {
            this.c--;
            return;
        }
        
        this.c = 2;
        
        if (offsetArray != null && offsetArray.length > 0) {
            this.a = (this.a + 1) % offsetArray.length;
        } else {
            this.a = (this.a + 1) % 10;
        }
    }
}