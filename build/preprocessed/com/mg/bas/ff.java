package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import com.mg.smsgame.MGMIDlet;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.TextBox;

public final class ff
extends aq
implements bf,
CommandListener {
    private static char[][] j = new char[][]{{'a', 'ă', 'â', 'e', 'ê', 'i', 'o', 'ô', 'ơ', 'u', 'ư', 'y', 'A', 'Ă', 'Â', 'E', 'Ê', 'I', 'O', 'Ô', 'Ơ', 'U', 'Ư', 'Y'}, {'á', 'ắ', 'ấ', 'é', 'ế', 'í', 'ó', 'ố', 'ớ', 'ú', 'ứ', 'ý', 'Á', 'Ắ', 'Ấ', 'É', 'Ế', 'Í', 'Ó', 'Ố', 'Ớ', 'Ú', 'Ứ', 'Ý'}, {'à', 'ằ', 'ầ', 'è', 'ề', 'ì', 'ò', 'ồ', 'ờ', 'ù', 'ừ', 'ỳ', 'À', 'Ằ', 'Ầ', 'È', 'Ề', 'Ì', 'Ò', 'Ồ', 'Ờ', 'Ù', 'Ừ', 'Ỳ'}, {'ả', 'ẳ', 'ẩ', 'ẻ', 'ể', 'ỉ', 'ỏ', 'ổ', 'ở', 'ủ', 'ử', 'ỷ', 'Ả', 'Ẳ', 'Ẩ', 'Ẻ', 'Ể', 'Ỉ', 'Ỏ', 'Ổ', 'Ở', 'Ủ', 'Ử', 'Ỷ'}, {'ã', 'ẵ', 'ẫ', 'ẽ', 'ễ', 'ĩ', 'õ', 'ỗ', 'ỡ', 'ũ', 'ữ', 'ỹ', 'Ã', 'Ẵ', 'Ẫ', 'Ẽ', 'Ễ', 'Ĩ', 'Õ', 'Ỗ', 'Ỡ', 'Ũ', 'Ữ', 'Ỹ'}, {'ạ', 'ặ', 'ậ', 'ẹ', 'ệ', 'ị', 'ọ', 'ộ', 'ợ', 'ụ', 'ự', 'ỵ', 'Ạ', 'Ặ', 'Ậ', 'Ẹ', 'Ệ', 'Ị', 'Ọ', 'Ộ', 'Ợ', 'Ụ', 'Ự', 'Ỵ'}};
    private static final String[] k = new String[]{" 0", ".,?!'-()#@/:*+<=>;_$%&\"1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9"};
    private static final String[] l = new String[]{" 0", ".,?!'-()#@/:*+<=>;_$%&\"1", "abc2", "def3", "ghi4", "jkl5", "mno6", "pqrs7", "tuv8", "wxyz9"};
    private static final String[] m = new String[]{" 0", ".,?!'-()#@/:*+<=>;_$%&\"1", "AĂÂBC2", "DĐEÊF3", "GHI4", "JKL5", "MNOÔƠ6", "PQRS7", "TUƯV8", "WXYZ9"};
    private static final String[] n = new String[]{" 0", ".,?!'-()#@/:*+<=>;_$%&\"1", "aăâbc2", "dđeêf3", "ghi4", "jkl5", "mnoôơ6", "pqrs7", "tuưv8", "wxyz9"};
    private static final String[] o = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private static final String[] p = new String[]{"abc", "Abc", "ABC", "123"};
    private static final String[] q = new String[]{"aăâ", "Aăâ", "AĂÂ", "123"};
    private String[] r = l;
    private int s = -1;
    private StringBuffer t = new StringBuffer("");
    private int u;
    private d v = bx.d;
    private int w = -1987;
    private int x;
    private int y;
    private String z;
    private String A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private String J;
    private TextBox K;
    private String L;
    private int M;
    private int N;
    private int O;
    public static String i;
    private boolean P;
    private hp Q;
    private boolean R;
    private boolean S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    private fu Y;
    private String Z;
    private be aa;
    private boolean ab;
    private ae ac;

    public final void e(boolean bl) {
        if (bl && v.z) {
            this.Y = pc.a(this, -3, this.c(), this.d() + 1);
        }
    }

    public final void a(String string) {
        this.Z = string;
    }

    public final void g(int n, int n2) {
        if (n < 0) {
            throw new IllegalArgumentException("Điểm bắt đầu không được nhỏ hơn 0");
        }
        if (n2 <= 0) {
            throw new IllegalArgumentException("Chiều dài không được nhỏ hơn 1");
        }
        this.R = true;
        this.S = true;
        this.T = n;
        this.U = n2;
        this.w();
    }

    public final void a(hp hp2) {
        this.Q = hp2;
        hp2.a(this);
    }

    public final void h(int n) {
        this.M = n;
    }

    public final void b(boolean bl) {
        super.b(bl);
        this.t();
    }

    public static void a() {
        ff.m[0] = "+0";
        ff.k[0] = "+0";
        ff.n[0] = "+0";
        ff.l[0] = "+0";
    }

    public static void q() {
        ff.m[0] = " ";
        ff.k[0] = " ";
        ff.n[0] = " ";
        ff.l[0] = " ";
    }

    public ff() {
        this("", 255, 2);
    }

    public ff(String string, int n, int n2) {
        new k();
        this.G = -1;
        this.J = "";
        this.M = -1;
        this.N = 0xFF0000;
        this.O = 0xFFFFFF;
        this.P = false;
        this.Q = null;
        this.R = false;
        this.S = false;
        this.T = 0;
        this.U = 0;
        this.X = 15830413;
        this.Z = "";
        this.aa = null;
        this.ab = false;
        this.ac = new ae();
        this.L = string;
        this.M = n;
        this.H = n2 << 31 >>> 31;
        this.I = n2 >>> 1 << 1;
        if (this.I == 4) {
            this.i(3);
            this.y = 0;
        } else if (this.I == 2) {
            this.i(1);
            this.y = 0;
        }
        if (this.H == 1) {
            this.i(0);
            this.P = true;
            this.y = 0;
        }
        int n3 = 16354990;
        ff ff2 = this;
        this.N = 16354990;
        int n4 = 12643805;
        ff ff3 = this;
        this.O = 12643805;
    }

    public final String r() {
        return this.t.toString();
    }

    public final void b(String string) {
        if (i.a(string)) {
            return;
        }
        this.t.append(string);
        this.s();
    }

    private void s() {
        if (this.t.length() > this.M) {
            this.t.delete(0, this.t.length() - this.M);
        }
        this.u = this.t.length();
        this.w();
        this.t();
    }

    public final void c(String string) {
        if (string == null) {
            string = "";
        }
        this.t = new StringBuffer(string);
        this.s();
    }

    public final void i(int n) {
        this.C = n;
        this.y = 15;
        this.x = 0;
        String string = this.A = v.b ? q[this.C] : p[this.C];
        if (this.C == 0) {
            if (v.b) {
                this.r = ff.n;
                return;
            }
            this.r = l;
            return;
        }
        if (this.C == 1 || this.C == 2) {
            if (v.b) {
                this.r = m;
                return;
            }
            this.r = k;
            return;
        }
        this.r = o;
    }

    public final void commandAction(Command command, Displayable displayable) {
        if (i.a(command.getLabel(), "OK")) {
            this.c(this.K.getString());
            MGMIDlet.d().a((Displayable)ag.a(), true);
            return;
        }
        if (i.a(command.getLabel(), "Trở về")) {
            MGMIDlet.d().a((Displayable)ag.a(), true);
            return;
        }
        if (i.a(command.getLabel(), "Dán") && !i.a(i)) {
            this.K.insert(i, this.K.getCaretPosition());
        }
    }

    public final void f(boolean bl) {
        this.ab = true;
    }

    public final void a(be be2) {
        this.aa = be2;
    }

    public final void g(boolean bl) {
        if (!bl) {
            int n;
            int n2;
            ag.a().e();
            boolean ff2 = false;
            if (this.I == 4) {
                n2 = 2;
            }
            if (this.H == 1) {
                n = n2 | 0x10000;
            }
            this.K = new TextBox(this.L, this.t.toString(), this.M, n);
            this.K.addCommand(new Command("OK", 4, 1));
            this.K.addCommand(new Command("Trở về", 2, 1));
            if (!i.a(i)) {
                this.K.addCommand(new Command("Dán", 1, 1));
            }
            this.K.setCommandListener((CommandListener)this);
            MGMIDlet.d().a((Displayable)this.K, true);
            return;
        }
        ff ff2 = this;
        bk.b = ff2.aa;
        if (ff2.I == 4) {
            ag.a().a(ff2.d() + ff2.f(), 3);
            return;
        }
        if (ff2.u == 0 && ff2.I != 1) {
            ag.a().a(ff2.d() + ff2.f(), 1);
            return;
        }
        ag.a().a(ff2.d() + ff2.f(), 2);
    }

    private void t() {
        this.u();
        this.v();
    }

    private void u() {
        if (this.w >= 0) {
            v.c[this.w] = 0;
        }
        this.y = 0;
        this.x = 0;
        this.w = -1987;
        this.s = -1;
        this.B = false;
        if (this.H == 1) {
            this.w();
        }
        if (this.b != null) {
            this.b.c(true);
        }
    }

    /*
     * Unable to fully structure code
     */
  private void v() {
    // Nếu trạng thái C == 3 thì không làm gì
    if (this.C == 3) {
        return;
    }

    // Nếu đã có flag P bật thì không làm gì
    if (this.P) {
        return;
    }

    // Nếu độ dài chuỗi <= 0 thì bỏ qua
    if (this.u <= 0) {
        this.i(1);
        return;
    }

    boolean shouldBreak = false;

    if (this.u > 1) {
        char prevChar = this.t.charAt(this.u - 2);
        char lastChar = this.t.charAt(this.u - 1);

        // Nếu kết thúc bằng " .", " !" hoặc " ?" thì set cờ break
        if (lastChar == ' ' && (prevChar == '.' || prevChar == '!' || prevChar == '?')) {
            shouldBreak = true;
        }
    }

    if (shouldBreak) {
        this.i(1); // thực hiện hành động nào đó (có thể là xuống dòng?)
        return;
    }

    // Nếu C == 1 thì thực hiện hành động khác
    if (this.C == 1) {
        this.i(0);
    }
}


    public final void d(boolean bl) {
        if (!this.f) {
            return;
        }
        if (this.g != bl) {
            if (bl && this.R) {
                this.S = true;
                this.w();
            }
            super.d(bl);
            this.i(this.C);
            this.u();
        }
    }

    public final void a(int n, int n2, int n3, int n4) {
        super.a(n, n2, n3, n4);
        this.w();
    }

    private void l(int n) {
        if (n < 0) {
            n = 0;
        } else if (n > this.t.length()) {
            n = this.t.length();
        }
        this.u = n;
        this.w();
    }

    private void h(int n, int n2) {
        if (this.t.length() <= 0) {
            return;
        }
        if (n >= this.t.length()) {
            n = this.t.length() - 1;
        }
        if (n < 0) {
            n = 0;
        }
        if (n + n2 > this.t.length()) {
            n2 = this.t.length() - n;
        }
        this.t.delete(n, n + n2);
        this.u = n;
        this.w();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean f(int var1_1) {
        if (!this.f) {
            return false;
        }
        block0 : switch (var1_1) {
            case 95: {
                this.g(false);
                break;
            }
            case 92: 
            case 93: {
                if (this.S) {
                    this.h(this.T, this.U);
                    this.S = false;
                    return true;
                }
                if (var1_1 == 93 && v.b()) {
                    return false;
                }
                if (this.u <= 0) break;
                --this.u;
                this.t.deleteCharAt(this.u);
                this.t();
                this.w();
                break;
            }
            case 97: {
                if (this.S) {
                    this.l(this.T);
                    this.S = false;
                    return true;
                }
                if (this.u > 0) {
                    --this.u;
                    if (this.u < 0) {
                        this.u = 0;
                    }
                    this.t();
                    this.w();
                    break;
                }
                if (this.w != -1987) {
                    this.t();
                    return true;
                }
                return false;
            }
            case 96: {
                if (this.S) {
                    this.l(this.T + this.U);
                    this.S = false;
                    return true;
                }
                if (this.u < this.t.length()) {
                    ++this.u;
                    if (this.u > this.t.length()) {
                        this.u = this.t.length();
                    }
                    this.t();
                    this.w();
                    break;
                }
                if (this.w != -1987) {
                    this.t();
                    return true;
                }
                if (this.Q != null) {
                    ag.b().a(this.Q, false);
                    return true;
                }
                return false;
            }
            case 94: 
            case 98: 
            case 99: {
                return false;
            }
            default: {
                if (this.S) {
                    this.h(this.T, this.U);
                    this.S = false;
                }
                if (v.a() && var1_1 == 135 || !v.a() && var1_1 == 142) {
                    if (this.I == 4) {
                        return true;
                    }
                    if (this.B) {
                        if (v.a) {
                            v.b = v.b == false;
                        }
                        this.t();
                        this.i(this.D);
                        return true;
                    }
                    this.B = true;
                    this.w = var1_1;
                    if (!v.ai) {
                        this.D = this.C++;
                        if (this.C >= 4) {
                            this.C = 0;
                        }
                        this.i(this.C);
                        return true;
                    }
                }
                 if (!v.ai) {
        break;
    }
                  int var2_5 = var1_1;
    Object var1_2 = this;
    int var3_7 = ae.a(var2_5);

    if (this.C == 3 && (var3_7 < 48 || var3_7 > 57)) {
        break;
    }

    if (!v.b || this.u <= 0) {
        break;
    }

    int var5_10 = var3_7;
    Object var4_13 = this;
    char var1_3 = this.t.charAt(this.u - 1);
                var6_15 = -1;
                block7 : switch (var5_10) {
                    case 68: 
                    case 100: {
                        switch (var1_3) {
                            case 'd': {
                                var4_13.c('đ');
                                break block0;
                            }
                            case 'đ': {
                                var4_13.c('d');
                                break block7;
                            }
                            case 'D': {
                                var4_13.c('Đ');
                                break block0;
                            }
                            case 'Đ': {
                                var4_13.c('D');
                                break block7;
                            }
                        }

                    }
                    case 65: 
                    case 97: {
                        switch (var1_3) {
                            case 'a': 
                            case 'ă': {
                                var4_13.c('â');
                                break block0;
                            }
                            case 'á': 
                            case 'ắ': {
                                var4_13.c('ấ');
                                break block0;
                            }
                            case 'à': 
                            case 'ằ': {
                                var4_13.c('ầ');
                                break block0;
                            }
                            case 'ả': 
                            case 'ẳ': {
                                var4_13.c('ẩ');
                                break block0;
                            }
                            case 'ã': 
                            case 'ẵ': {
                                var4_13.c('ẫ');
                                break block0;
                            }
                            case 'ạ': 
                            case 'ặ': {
                                var4_13.c('ậ');
                                break block0;
                            }
                            case 'â': 
                            case 'ấ': 
                            case 'ầ': 
                            case 'ẩ': 
                            case 'ẫ': 
                            case 'ậ': {
                                var4_13.c('a');
                                break block7;
                            }
                            case 'A': 
                            case 'Ă': {
                                var4_13.c('Â');
                                break block0;
                            }
                            case 'Á': 
                            case 'Ắ': {
                                var4_13.c('Ấ');
                                break block0;
                            }
                            case 'À': 
                            case 'Ằ': {
                                var4_13.c('Ầ');
                                break block0;
                            }
                            case 'Ả': 
                            case 'Ẳ': {
                                var4_13.c('Ẩ');
                                break block0;
                            }
                            case 'Ã': 
                            case 'Ẵ': {
                                var4_13.c('Ẵ');
                                break block0;
                            }
                            case 'Ạ': 
                            case 'Ặ': {
                                var4_13.c('Ậ');
                                break block0;
                            }
                            case 'Â': 
                            case 'Ấ': 
                            case 'Ầ': 
                            case 'Ẩ': 
                            case 'Ẫ': 
                            case 'Ậ': {
                                var4_13.c('A');
                                break block7;
                            }
                        }

                    }
                    case 69: 
                    case 101: {
                        switch (var1_3) {
                            case 'e': {
                                var4_13.c('ê');
                                break block0;
                            }
                            case 'é': {
                                var4_13.c('ế');
                                break block0;
                            }
                            case 'è': {
                                var4_13.c('ề');
                                break block0;
                            }
                            case 'ẻ': {
                                var4_13.c('ể');
                                break block0;
                            }
                            case 'ẽ': {
                                var4_13.c('ễ');
                                break block0;
                            }
                            case 'ẹ': {
                                var4_13.c('ệ');
                                break block0;
                            }
                            case 'ê': 
                            case 'ế': 
                            case 'ề': 
                            case 'ể': 
                            case 'ễ': 
                            case 'ệ': {
                                var4_13.c('e');
                                break block7;
                            }
                            case 'E': {
                                var4_13.c('ế');
                                break block0;
                            }
                            case 'É': {
                                var4_13.c('ề');
                                break block0;
                            }
                            case 'È': {
                                var4_13.c('ể');
                                break block0;
                            }
                            case 'Ẻ': {
                                var4_13.c('ễ');
                                break block0;
                            }
                            case 'Ẽ': {
                                var4_13.c('ệ');
                                break block0;
                            }
                            case 'Ẹ': {
                                var4_13.c('ệ');
                                break block0;
                            }
                            case 'Ê': 
                            case 'Ế': 
                            case 'Ề': 
                            case 'Ể': 
                            case 'Ễ': 
                            case 'Ệ': {
                                var4_13.c('E');
                                break block7;
                            }
                        }

                    }
                    case 79: 
                    case 111: {
                        switch (var1_3) {
                            case 'o': 
                            case 'ơ': {
                                var4_13.c('ô');
                                break block0;
                            }
                            case 'ó': 
                            case 'ớ': {
                                var4_13.c('ố');
                                break block0;
                            }
                            case 'ò': 
                            case 'ờ': {
                                var4_13.c('ồ');
                                break block0;
                            }
                            case 'ỏ': 
                            case 'ở': {
                                var4_13.c('ổ');
                                break block0;
                            }
                            case 'õ': 
                            case 'ỡ': {
                                var4_13.c('ỗ');
                                break block0;
                            }
                            case 'ọ': 
                            case 'ợ': {
                                var4_13.c('ộ');
                                break block0;
                            }
                            case 'ô': 
                            case 'ố': 
                            case 'ồ': 
                            case 'ổ': 
                            case 'ỗ': 
                            case 'ộ': {
                                var4_13.c('o');
                                break block7;
                            }
                            case 'O': 
                            case 'Ơ': {
                                var4_13.c('Ô');
                                break block0;
                            }
                            case 'Ó': 
                            case 'Ớ': {
                                var4_13.c('Ố');
                                break block0;
                            }
                            case 'Ò': 
                            case 'Ờ': {
                                var4_13.c('Ồ');
                                break block0;
                            }
                            case 'Ỏ': 
                            case 'Ở': {
                                var4_13.c('Ổ');
                                break block0;
                            }
                            case 'Õ': 
                            case 'Ỡ': {
                                var4_13.c('Ỗ');
                                break block0;
                            }
                            case 'Ọ': 
                            case 'Ợ': {
                                var4_13.c('Ộ');
                                break block0;
                            }
                            case 'Ô': 
                            case 'Ố': 
                            case 'Ồ': 
                            case 'Ổ': 
                            case 'Ỗ': 
                            case 'Ộ': {
                                var4_13.c('O');
                                break block7;
                            }
                        }

                    }
                    case 87: 
                    case 119: {
                        switch (var1_3) {
                            case 'o': 
                            case 'ô': {
                                var4_13.c('ơ');
                                break block0;
                            }
                            case 'ó': 
                            case 'ố': {
                                var4_13.c('ớ');
                                break block0;
                            }
                            case 'ò': 
                            case 'ồ': {
                                var4_13.c('ờ');
                                break block0;
                            }
                            case 'ỏ': 
                            case 'ổ': {
                                var4_13.c('ở');
                                break block0;
                            }
                            case 'õ': 
                            case 'ỗ': {
                                var4_13.c('ỡ');
                                break block0;
                            }
                            case 'ọ': 
                            case 'ộ': {
                                var4_13.c('ợ');
                                break block0;
                            }
                            case 'ơ': 
                            case 'ớ': 
                            case 'ờ': 
                            case 'ở': 
                            case 'ỡ': 
                            case 'ợ': {
                                var4_13.c('o');
                                break block7;
                            }
                            case 'O': 
                            case 'Ô': {
                                var4_13.c('Ơ');
                                break block0;
                            }
                            case 'Ó': 
                            case 'Ố': {
                                var4_13.c('Ớ');
                                break block0;
                            }
                            case 'Ò': 
                            case 'Ồ': {
                                var4_13.c('Ờ');
                                break block0;
                            }
                            case 'Ỏ': 
                            case 'Ổ': {
                                var4_13.c('Ở');
                                break block0;
                            }
                            case 'Õ': 
                            case 'Ỗ': {
                                var4_13.c('Ỡ');
                                break block0;
                            }
                            case 'Ọ': 
                            case 'Ộ': {
                                var4_13.c('Ợ');
                                break block0;
                            }
                            case 'Ơ': 
                            case 'Ớ': 
                            case 'Ờ': 
                            case 'Ở': 
                            case 'Ỡ': 
                            case 'Ợ': {
                                var4_13.c('O');
                                break block7;
                            }
                            case 'u': {
                                var4_13.c('ư');
                                break block0;
                            }
                            case 'ú': {
                                var4_13.c('ứ');
                                break block0;
                            }
                            case 'ù': {
                                var4_13.c('ừ');
                                break block0;
                            }
                            case 'ủ': {
                                var4_13.c('ử');
                                break block0;
                            }
                            case 'ũ': {
                                var4_13.c('ữ');
                                break block0;
                            }
                            case 'ụ': {
                                var4_13.c('ự');
                                break block0;
                            }
                            case 'ư': 
                            case 'ứ': 
                            case 'ừ': 
                            case 'ử': 
                            case 'ữ': 
                            case 'ự': {
                                var4_13.c('u');
                                break block7;
                            }
                            case 'U': {
                                var4_13.c('Ư');
                                break block0;
                            }
                            case 'Ú': {
                                var4_13.c('Ứ');
                                break block0;
                            }
                            case 'Ù': {
                                var4_13.c('Ừ');
                                break block0;
                            }
                            case 'Ủ': {
                                var4_13.c('Ử');
                                break block0;
                            }
                            case 'Ũ': {
                                var4_13.c('Ữ');
                                break block0;
                            }
                            case 'Ụ': {
                                var4_13.c('Ự');
                                break block0;
                            }
                            case 'Ư': 
                            case 'Ứ': 
                            case 'Ừ': 
                            case 'Ử': 
                            case 'Ữ': 
                            case 'Ự': {
                                var4_13.c('U');
                                break block7;
                            }
                            case 'a': 
                            case 'â': {
                                var4_13.c('ă');
                                break block0;
                            }
                            case 'á': 
                            case 'ấ': {
                                var4_13.c('ắ');
                                break block0;
                            }
                            case 'à': 
                            case 'ầ': {
                                var4_13.c('ằ');
                                break block0;
                            }
                            case 'ả': 
                            case 'ẩ': {
                                var4_13.c('ẳ');
                                break block0;
                            }
                            case 'ã': 
                            case 'ẫ': {
                                var4_13.c('ẵ');
                                break block0;
                            }
                            case 'ạ': 
                            case 'ậ': {
                                var4_13.c('ặ');
                                break block0;
                            }
                            case 'ă': 
                            case 'ắ': 
                            case 'ằ': 
                            case 'ẳ': 
                            case 'ẵ': 
                            case 'ặ': {
                                var4_13.c('a');
                                break block7;
                            }
                            case 'A': 
                            case 'Â': {
                                var4_13.c('Ă');
                                break block0;
                            }
                            case 'Á': 
                            case 'Ấ': {
                                var4_13.c('Ắ');
                                break block0;
                            }
                            case 'À': 
                            case 'Ầ': {
                                var4_13.c('Ằ');
                                break block0;
                            }
                            case 'Ả': 
                            case 'Ẩ': {
                                var4_13.c('Ẳ');
                                break block0;
                            }
                            case 'Ã': 
                            case 'Ẫ': {
                                var4_13.c('Ẵ');
                                break block0;
                            }
                            case 'Ạ': 
                            case 'Ậ': {
                                var4_13.c('Ặ');
                                break block0;
                            }
                            case 'Ă': 
                            case 'Ắ': 
                            case 'Ằ': 
                            case 'Ẳ': 
                            case 'Ẵ': 
                            case 'Ặ': {
                                var4_13.c('A');
                                break block7;
                            }
                        }

                    }
                    case 90: 
                    case 122: {
                        var6_15 = 0;

                    }
                    case 83: 
                    case 115: {
                        var6_15 = 1;

                    }
                    case 70: 
                    case 102: {
                        var6_15 = 2;

                    }
                    case 82: 
                    case 114: {
                        var6_15 = 3;

                    }
                    case 88: 
                    case 120: {
                        var6_15 = 4;

                    }
                    case 74: 
                    case 106: {
                        var6_15 = 5;
                    }

                    // 12 sources

                    default: {
                        if (var6_15 < 0) break;
                        var2_5 = 5;
                        while (var2_5 >= 0) {
                            var3_7 = ff.j[0].length - 1;
                            while (var3_7 >= 0) {
                                if (var1_3 == ff.j[var2_5][var3_7]) {
                                    if (var2_5 == var6_15) {
                                        var1_3 = ff.j[0][var3_7];
                                        var4_13.c(var1_3);
                                        var4_13.d((char)var5_10);
                                        break block0;
                                    }
                                    var1_3 = ff.j[var6_15][var3_7];
                                    var4_13.c(var1_3);
                                    break block0;
                                }
                                --var3_7;
                            }
                            --var2_5;
                        }
                        break block7;
                    }
                }
                var4_13.d((char)var5_10);
                break;

                // 1 sources

                var1_2.d((char)var3_7);
                break;

                // 1 sources

                var2_6 = var1_1;
                var1_4 = this;
                switch (var2_6) {
                    case 135: 
                    case 142: 
                    case 148: 
                    case 149: 
                    case 150: 
                    case 151: 
                    case 152: 
                    case 153: 
                    case 154: 
                    case 155: 
                    case 156: 
                    case 157: {
                        if (!v.a()){break;}
                        if (var2_6 != 148 || var1_4.C == 3){break;}
                        if (var1_4.B) {
                            var1_4.c('0');
                            var1_4.t();
                            var1_4.w();
                            break block0;
                        }
                        var1_4.d(' ');
                        var1_4.w = var2_6;


                        // 1 sources

                        if (var2_6 == 142 && !v.b) {
                            if (var1_4.C == 3 || var1_4.B) {
                                var1_4.d('+');
                                var1_4.t();
                                var1_4.w();
                                break block0;
                            }
                            var1_4.w = var2_6;
                            var1_4.B = true;
                            break block0;
                        }


                        // 1 sources

                        if (var2_6 == 135) {
                            var5_11 = var1_4;
                            var5_11.d(' ');
                            var5_11.w = -1987;
                            var5_11.B = false;
                            var5_11.v();
                            break block0;
                        }



                        if (!v.b || (!v.a() || var2_6 != 142) && (v.a() || var2_6 != 148) || var1_4.u <= 0) {break;}
                        var3_8 = var1_4.t.charAt(var1_4.u - 1);
                        if (!var1_4.B){break;}
                        var5_12 = var3_8;
                        var6_16 = var5_12;
                        switch (var5_12) {
                            case 'a': 
                            case 'à': 
                            case 'á': 
                            case 'ã': 
                            case 'ạ': 
                            case 'ả': {
                                var6_16 = 97;
                                break;
                            }
                            case 'ă': 
                            case 'ắ': 
                            case 'ằ': 
                            case 'ẳ': 
                            case 'ẵ': 
                            case 'ặ': {
                                var6_16 = 259;
                                break;
                            }
                            case 'â': 
                            case 'ấ': 
                            case 'ầ': 
                            case 'ẩ': 
                            case 'ẫ': 
                            case 'ậ': {
                                var6_16 = 226;
                                break;
                            }
                            case 'o': 
                            case 'ò': 
                            case 'ó': 
                            case 'õ': 
                            case 'ọ': 
                            case 'ỏ': {
                                var6_16 = 111;
                                break;
                            }
                            case 'ơ': 
                            case 'ớ': 
                            case 'ờ': 
                            case 'ở': 
                            case 'ỡ': 
                            case 'ợ': {
                                var6_16 = 417;
                                break;
                            }
                            case 'ô': 
                            case 'ố': 
                            case 'ồ': 
                            case 'ổ': 
                            case 'ỗ': 
                            case 'ộ': {
                                var6_16 = 244;
                                break;
                            }
                            case 'e': 
                            case 'è': 
                            case 'é': 
                            case 'ẹ': 
                            case 'ẻ': 
                            case 'ẽ': {
                                var6_16 = 101;
                                break;
                            }
                            case 'ê': 
                            case 'ế': 
                            case 'ề': 
                            case 'ể': 
                            case 'ễ': 
                            case 'ệ': {
                                var6_16 = 234;
                                break;
                            }
                            case 'u': 
                            case 'ù': 
                            case 'ú': 
                            case 'ũ': 
                            case 'ụ': 
                            case 'ủ': {
                                var6_16 = 117;
                                break;
                            }
                            case 'ư': 
                            case 'ứ': 
                            case 'ừ': 
                            case 'ử': 
                            case 'ữ': 
                            case 'ự': {
                                var6_16 = 432;
                                break;
                            }
                            case 'i': 
                            case 'ì': 
                            case 'í': 
                            case 'ĩ': 
                            case 'ỉ': 
                            case 'ị': {
                                var6_16 = 105;
                                break;
                            }
                            case 'y': 
                            case 'ý': 
                            case 'ỳ': 
                            case 'ỵ': 
                            case 'ỷ': 
                            case 'ỹ': {
                                var6_16 = 121;
                                break;
                            }
                            case 'd': 
                            case 'đ': {
                                var6_16 = 100;
                                break;
                            }
                            case 'A': 
                            case 'À': 
                            case 'Á': 
                            case 'Ã': 
                            case 'Ạ': 
                            case 'Ả': {
                                var6_16 = 65;
                                break;
                            }
                            case 'Ă': 
                            case 'Ắ': 
                            case 'Ằ': 
                            case 'Ẳ': 
                            case 'Ẵ': 
                            case 'Ặ': {
                                var6_16 = 258;
                                break;
                            }
                            case 'Â': 
                            case 'Ấ': 
                            case 'Ầ': 
                            case 'Ẩ': 
                            case 'Ẫ': 
                            case 'Ậ': {
                                var6_16 = 194;
                                break;
                            }
                            case 'O': 
                            case 'Ò': 
                            case 'Ó': 
                            case 'Õ': 
                            case 'Ọ': 
                            case 'Ỏ': {
                                var6_16 = 79;
                                break;
                            }
                            case 'Ơ': 
                            case 'Ớ': 
                            case 'Ờ': 
                            case 'Ở': 
                            case 'Ỡ': 
                            case 'Ợ': {
                                var6_16 = 416;
                                break;
                            }
                            case 'Ô': 
                            case 'Ố': 
                            case 'Ồ': 
                            case 'Ổ': 
                            case 'Ỗ': 
                            case 'Ộ': {
                                var6_16 = 212;
                                break;
                            }
                            case 'E': 
                            case 'È': 
                            case 'É': 
                            case 'Ẹ': 
                            case 'Ẻ': 
                            case 'Ẽ': {
                                var6_16 = 69;
                                break;
                            }
                            case 'Ê': 
                            case 'Ế': 
                            case 'Ề': 
                            case 'Ể': 
                            case 'Ễ': 
                            case 'Ệ': {
                                var6_16 = 202;
                                break;
                            }
                            case 'U': 
                            case 'Ù': 
                            case 'Ú': 
                            case 'Ũ': 
                            case 'Ụ': 
                            case 'Ủ': {
                                var6_16 = 85;
                                break;
                            }
                            case 'Ư': 
                            case 'Ứ': 
                            case 'Ừ': 
                            case 'Ử': 
                            case 'Ữ': 
                            case 'Ự': {
                                var6_16 = 431;
                                break;
                            }
                            case 'I': 
                            case 'Ì': 
                            case 'Í': 
                            case 'Ĩ': 
                            case 'Ỉ': 
                            case 'Ị': {
                                var6_16 = 73;
                                break;
                            }
                            case 'Y': 
                            case 'Ý': 
                            case 'Ỳ': 
                            case 'Ỵ': 
                            case 'Ỷ': 
                            case 'Ỹ': {
                                var6_16 = 89;
                                break;
                            }
                            case 'D': 
                            case 'Đ': {
                                var6_16 = 68;
                            }
                        }
                        var4_14 = var6_16;
                        if (var4_14 != var3_8) {
                            var1_4.c(var4_14);
                        }


                        // 1 sources

                        var4_14 = ff.a(var3_8);
                        if (var4_14 != '') {
                            var1_4.c(var4_14);
                            var1_4.t();
                        } else {
                        // 3 sources

                        {
                            if (var1_4.B && var2_6 != var1_4.w) {
                                v.c[var2_6] = 0;
                                break block0;
                            }
                            if (var2_6 != var1_4.w) {
                                var1_4.s = -1;
                                if (var1_4.w != -1987 && v.a() && var1_4.w != 135 || !v.a() && var1_4.w != 142) {
                                    var1_4.t();
                                }
                            }
                            if (var2_6 < 148 || var2_6 > 157) break block0;
                            var1_4.x = 25;
                            var1_4.z = var3_9 = var1_4.r[var2_6 - 148];
                            var1_4.s = var1_4.B != false ? var3_9.length() - 1 : (var1_4.s + 1) % var3_9.length();
                            var4_14 = var3_9.charAt(var1_4.s);
                            if (var2_6 != var1_4.w) {
                                var1_4.d(var4_14);
                                var1_4.w = var2_6;
                            } else {
                                var1_4.c(var4_14);
                            }
                            if (var1_4.B || var3_9.length() < 2) {
                                var1_4.t();
                                var1_4.w();
                                break block0;
                            }
                        }

                        // 4 sources

                        var1_4.B = true;
                    }
                }
            }
        }
        return true;
    }
    }

    public final boolean c(int n, int n2) {
        int n3 = 0;
        if (this.Y != null) {
            this.Y.c(n, n2);
            n3 = 20;
        }
        if (this.m()) {
            this.S = false;
        }
        if (!this.f) {
            return false;
        }
        if (n > this.c() + n3 && n < this.c() + this.e() + n3 && n2 > this.d() && n2 < this.d() + this.f()) {
            if (this.g) {
                ag.a();
                this.g(!ag.f());
            } else {
                this.g(true);
            }
            return true;
        }
        return false;
    }

    public final boolean g(int n) {
        if (!this.g) {
            return false;
        }
        this.B = false;
        return true;
    }

    private static char a(char c) {
        char c2 = '';
        switch (c) {
            case 'a': {
                c2 = 'á';
                break;
            }
            case 'á': {
                c2 = 'à';
                break;
            }
            case 'à': {
                c2 = 'ả';
                break;
            }
            case 'ả': {
                c2 = 'ã';
                break;
            }
            case 'ã': {
                c2 = 'ạ';
                break;
            }
            case 'ạ': {
                c2 = 'a';
                break;
            }
            case 'ă': {
                c2 = 'ắ';
                break;
            }
            case 'ắ': {
                c2 = 'ằ';
                break;
            }
            case 'ằ': {
                c2 = 'ẳ';
                break;
            }
            case 'ẳ': {
                c2 = 'ẵ';
                break;
            }
            case 'ẵ': {
                c2 = 'ặ';
                break;
            }
            case 'ặ': {
                c2 = 'ă';
                break;
            }
            case 'â': {
                c2 = 'ấ';
                break;
            }
            case 'ấ': {
                c2 = 'ầ';
                break;
            }
            case 'ầ': {
                c2 = 'ẩ';
                break;
            }
            case 'ẩ': {
                c2 = 'ẫ';
                break;
            }
            case 'ẫ': {
                c2 = 'ậ';
                break;
            }
            case 'ậ': {
                c2 = 'â';
                break;
            }
            case 'o': {
                c2 = 'ó';
                break;
            }
            case 'ó': {
                c2 = 'ò';
                break;
            }
            case 'ò': {
                c2 = 'ỏ';
                break;
            }
            case 'ỏ': {
                c2 = 'õ';
                break;
            }
            case 'õ': {
                c2 = 'ọ';
                break;
            }
            case 'ọ': {
                c2 = 'o';
                break;
            }
            case 'ơ': {
                c2 = 'ớ';
                break;
            }
            case 'ớ': {
                c2 = 'ờ';
                break;
            }
            case 'ờ': {
                c2 = 'ở';
                break;
            }
            case 'ở': {
                c2 = 'ỡ';
                break;
            }
            case 'ỡ': {
                c2 = 'ợ';
                break;
            }
            case 'ợ': {
                c2 = 'ơ';
                break;
            }
            case 'ô': {
                c2 = 'ố';
                break;
            }
            case 'ố': {
                c2 = 'ồ';
                break;
            }
            case 'ồ': {
                c2 = 'ổ';
                break;
            }
            case 'ổ': {
                c2 = 'ỗ';
                break;
            }
            case 'ỗ': {
                c2 = 'ộ';
                break;
            }
            case 'ộ': {
                c2 = 'ô';
                break;
            }
            case 'e': {
                c2 = 'é';
                break;
            }
            case 'é': {
                c2 = 'è';
                break;
            }
            case 'è': {
                c2 = 'ẻ';
                break;
            }
            case 'ẻ': {
                c2 = 'ẽ';
                break;
            }
            case 'ẽ': {
                c2 = 'ẹ';
                break;
            }
            case 'ẹ': {
                c2 = 'e';
                break;
            }
            case 'ê': {
                c2 = 'ế';
                break;
            }
            case 'ế': {
                c2 = 'ề';
                break;
            }
            case 'ề': {
                c2 = 'ể';
                break;
            }
            case 'ể': {
                c2 = 'ễ';
                break;
            }
            case 'ễ': {
                c2 = 'ệ';
                break;
            }
            case 'ệ': {
                c2 = 'ê';
                break;
            }
            case 'u': {
                c2 = 'ú';
                break;
            }
            case 'ú': {
                c2 = 'ù';
                break;
            }
            case 'ù': {
                c2 = 'ủ';
                break;
            }
            case 'ủ': {
                c2 = 'ũ';
                break;
            }
            case 'ũ': {
                c2 = 'ụ';
                break;
            }
            case 'ụ': {
                c2 = 'u';
                break;
            }
            case 'ư': {
                c2 = 'ứ';
                break;
            }
            case 'ứ': {
                c2 = 'ừ';
                break;
            }
            case 'ừ': {
                c2 = 'ử';
                break;
            }
            case 'ử': {
                c2 = 'ữ';
                break;
            }
            case 'ữ': {
                c2 = 'ự';
                break;
            }
            case 'ự': {
                c2 = 'ư';
                break;
            }
            case 'i': {
                c2 = 'í';
                break;
            }
            case 'í': {
                c2 = 'ì';
                break;
            }
            case 'ì': {
                c2 = 'ỉ';
                break;
            }
            case 'ỉ': {
                c2 = 'ĩ';
                break;
            }
            case 'ĩ': {
                c2 = 'ị';
                break;
            }
            case 'ị': {
                c2 = 'i';
                break;
            }
            case 'y': {
                c2 = 'ý';
                break;
            }
            case 'ý': {
                c2 = 'ỳ';
                break;
            }
            case 'ỳ': {
                c2 = 'ỷ';
                break;
            }
            case 'ỷ': {
                c2 = 'ỹ';
                break;
            }
            case 'ỹ': {
                c2 = 'ỵ';
                break;
            }
            case 'ỵ': {
                c2 = 'y';
                break;
            }
            case 'd': {
                c2 = 'đ';
                break;
            }
            case 'đ': {
                c2 = 'd';
                break;
            }
            case 'A': {
                c2 = 'Á';
                break;
            }
            case 'Á': {
                c2 = 'À';
                break;
            }
            case 'À': {
                c2 = 'Ả';
                break;
            }
            case 'Ả': {
                c2 = 'Ã';
                break;
            }
            case 'Ã': {
                c2 = 'Ạ';
                break;
            }
            case 'Ạ': {
                c2 = 'A';
                break;
            }
            case 'Ă': {
                c2 = 'Ắ';
                break;
            }
            case 'Ắ': {
                c2 = 'Ằ';
                break;
            }
            case 'Ằ': {
                c2 = 'Ẳ';
                break;
            }
            case 'Ẳ': {
                c2 = 'Ẵ';
                break;
            }
            case 'Ẵ': {
                c2 = 'Ặ';
                break;
            }
            case 'Ặ': {
                c2 = 'Ă';
                break;
            }
            case 'Â': {
                c2 = 'Ấ';
                break;
            }
            case 'Ấ': {
                c2 = 'Ầ';
                break;
            }
            case 'Ầ': {
                c2 = 'Ẩ';
                break;
            }
            case 'Ẩ': {
                c2 = 'Ẫ';
                break;
            }
            case 'Ẫ': {
                c2 = 'Ậ';
                break;
            }
            case 'Ậ': {
                c2 = 'Â';
                break;
            }
            case 'O': {
                c2 = 'Ó';
                break;
            }
            case 'Ó': {
                c2 = 'Ò';
                break;
            }
            case 'Ò': {
                c2 = 'Ỏ';
                break;
            }
            case 'Ỏ': {
                c2 = 'Õ';
                break;
            }
            case 'Õ': {
                c2 = 'Ọ';
                break;
            }
            case 'Ọ': {
                c2 = 'O';
                break;
            }
            case 'Ơ': {
                c2 = 'Ớ';
                break;
            }
            case 'Ớ': {
                c2 = 'Ờ';
                break;
            }
            case 'Ờ': {
                c2 = 'Ở';
                break;
            }
            case 'Ở': {
                c2 = 'Ỡ';
                break;
            }
            case 'Ỡ': {
                c2 = 'Ợ';
                break;
            }
            case 'Ợ': {
                c2 = 'Ơ';
                break;
            }
            case 'Ô': {
                c2 = 'Ố';
                break;
            }
            case 'Ố': {
                c2 = 'Ồ';
                break;
            }
            case 'Ồ': {
                c2 = 'Ổ';
                break;
            }
            case 'Ổ': {
                c2 = 'Ỗ';
                break;
            }
            case 'Ỗ': {
                c2 = 'Ộ';
                break;
            }
            case 'Ộ': {
                c2 = 'Ô';
                break;
            }
            case 'E': {
                c2 = 'É';
                break;
            }
            case 'É': {
                c2 = 'È';
                break;
            }
            case 'È': {
                c2 = 'Ẻ';
                break;
            }
            case 'Ẻ': {
                c2 = 'Ẽ';
                break;
            }
            case 'Ẽ': {
                c2 = 'Ẹ';
                break;
            }
            case 'Ẹ': {
                c2 = 'E';
                break;
            }
            case 'Ê': {
                c2 = 'Ế';
                break;
            }
            case 'Ế': {
                c2 = 'Ề';
                break;
            }
            case 'Ề': {
                c2 = 'Ể';
                break;
            }
            case 'Ể': {
                c2 = 'Ễ';
                break;
            }
            case 'Ễ': {
                c2 = 'Ệ';
                break;
            }
            case 'Ệ': {
                c2 = 'Ê';
                break;
            }
            case 'U': {
                c2 = 'Ú';
                break;
            }
            case 'Ú': {
                c2 = 'Ù';
                break;
            }
            case 'Ù': {
                c2 = 'Ủ';
                break;
            }
            case 'Ủ': {
                c2 = 'Ũ';
                break;
            }
            case 'Ũ': {
                c2 = 'Ụ';
                break;
            }
            case 'Ụ': {
                c2 = 'U';
                break;
            }
            case 'Ư': {
                c2 = 'Ứ';
                break;
            }
            case 'Ứ': {
                c2 = 'Ừ';
                break;
            }
            case 'Ừ': {
                c2 = 'Ử';
                break;
            }
            case 'Ử': {
                c2 = 'Ữ';
                break;
            }
            case 'Ữ': {
                c2 = 'Ự';
                break;
            }
            case 'Ự': {
                c2 = 'Ư';
                break;
            }
            case 'I': {
                c2 = 'Í';
                break;
            }
            case 'Í': {
                c2 = 'Ì';
                break;
            }
            case 'Ì': {
                c2 = 'Ỉ';
                break;
            }
            case 'Ỉ': {
                c2 = 'Ĩ';
                break;
            }
            case 'Ĩ': {
                c2 = 'Ị';
                break;
            }
            case 'Ị': {
                c2 = 'I';
                break;
            }
            case 'Y': {
                c2 = 'Ý';
                break;
            }
            case 'Ý': {
                c2 = 'Ỳ';
                break;
            }
            case 'Ỳ': {
                c2 = 'Ỷ';
                break;
            }
            case 'Ỷ': {
                c2 = 'Ỹ';
                break;
            }
            case 'Ỹ': {
                c2 = 'Ỵ';
                break;
            }
            case 'Ỵ': {
                c2 = 'Y';
                break;
            }
            case 'D': {
                c2 = 'Đ';
                break;
            }
            case 'Đ': {
                c2 = 'D';
            }
        }
        return c2;
    }

    private char b(char c) {
        if (this.h == null) {
            return c;
        }
        this.ac.a(c);
        this.h.a(this.ac);
        return this.ac.a();
    }

    private void c(char c) {
        if (this.t.length() <= 0 || this.u <= 0) {
            return;
        }
        if ((c = this.b(c)) != '') {
            this.t.setCharAt(this.u - 1, c);
            this.w();
        }
    }

    private void d(char c) {
        if ((c = this.b(c)) != '') {
            if (this.t.length() + 1 > this.M) {
                this.t.delete(this.M - 1, this.t.length());
                if (this.u > this.t.length()) {
                    this.u = this.t.length();
                }
            }
            if (this.u <= this.t.length()) {
                this.t.insert(this.u, c);
            } else {
                this.t.append(c);
            }
            ++this.u;
            this.w();
        }
    }

    private void w() {
        int n = this.e() - (this.Y != null ? 20 : 0);
        this.J = "";
        if (this.H == 1) {
            int n2 = this.u - 2;
            while (n2 >= 0) {
                this.J = String.valueOf(this.J) + "*";
                --n2;
            }
            if (this.u > 0) {
                this.J = this.x > 0 ? String.valueOf(this.J) + this.t.charAt(this.u - 1) : String.valueOf(this.J) + "*";
            }
            n2 = this.t.length() - 1;
            while (n2 >= this.u) {
                this.J = String.valueOf(this.J) + "*";
                --n2;
            }
        } else {
            this.J = this.t.toString();
        }
        String string = this.J;
        if (string == null) {
            string = "";
        }
        int n3 = this.v.a(string);
        if (this.E < 0 && this.v.a(string) + this.E < n - 4 - 3) {
            this.E = n - n3;
        }
        this.G = this.v.a(string.substring(0, this.u));
        if (this.E + this.G <= 0) {
            this.E = -this.G;
            this.E += 8;
        } else if (this.E + this.G >= n - 4 - 3) {
            this.E = n - this.G - 8;
        }
        if (this.E > 0) {
            this.E = 0;
        }
        if (this.G <= 0) {
            this.G = -1;
        }
        if (this.S) {
            this.W = 0;
            this.V = 0;
            if (this.t.length() <= 0 || this.T >= this.t.length()) {
                return;
            }
            int n4 = this.T;
            int n5 = this.U;
            if (n4 < 0) {
                n4 = 0;
            }
            if (n4 + n5 > this.t.length()) {
                n5 = this.t.length() - n4;
            }
            this.V = n4 == 0 ? 0 : this.v.a(string.substring(0, n4));
            this.W = n4 + n5 >= string.length() ? n3 : this.V + this.v.a(string.substring(n4, n4 + n5));
            this.V += this.E;
            this.W += this.E;
            n -= 8;
            if (this.V < 0) {
                this.V = 0;
            }
            if (this.W > n) {
                this.W = n;
            }
        }
    }

    public final void n() {
        if (this.x > 0) {
            --this.x;
            if (this.x == 0) {
                this.t();
            }
        }
        if (this.y > 0) {
            --this.y;
            if (this.x == 0 && this.b != null) {
                this.b.c(true);
            }
        }
        if (!this.g) {
            return;
        }
        if (this.F < 12) {
            ++this.F;
            return;
        }
        this.F = 0;
    }

    public final void a(Graphics graphics, int n, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        if (!this.e) {
            return;
        }
        int n7 = this.Y != null ? 20 : 0;
        int n8 = this.c() + n + n7;
        int n9 = n6 = this.d() + n2;
        int n10 = n8;
        Graphics graphics2 = graphics;
        ff ff2 = this;
        pc.a(graphics2, n10, n9, ff2.e() - (ff2.Y != null ? 20 : 0), ff2.f(), ff2.g && ff2.f);
        n9 = n6;
        n10 = n8;
        graphics2 = graphics;
        ff2 = this;
        if (ff2.W > ff2.V && ff2.S && ff2.m()) {
            n5 = n10 + 4 + ff2.V;
            n4 = n9 + (ff2.d.d - ff2.v.a() >> 1);
            graphics2.setColor(ff2.X);
            graphics2.fillRect(n5, n4, ff2.W - ff2.V, ff2.v.a());
        }
        cw.a(graphics);
        cw.a(graphics, n8 + 4, n6, this.e() - 4 - 4 - n7, this.f());
        n9 = n6;
        n10 = n8;
        graphics2 = graphics;
        ff2 = this;
        n5 = n10 + 4 + ff2.E;
        n4 = n9 + (ff2.d.d - ff2.v.a() >> 1);
        if (ff2.J == null || ff2.J.equals("")) {
            if (ff2.Z.length() > 0) {
                bx.d.a(true);
                bx.d.a(graphics2, ff2.Z, n5, n4, 0);
                bx.d.a(false);
            }
        } else if (ff2.H == 1) {
            if (ff2.x <= 0) {
                ff2.v.a(graphics2, ff2.J, n5, n4 + 3, 0);
            } else if (ff2.J.length() > 0) {
                String string = ff2.J.substring(0, ff2.J.length() - 1);
                if (!i.b(string)) {
                    ff2.v.a(graphics2, string, n5, n4 + 3, 0);
                }
                n3 = ff2.v.a(string);
                ff2.v.a(graphics2, String.valueOf(ff2.J.charAt(ff2.J.length() - 1)), n5 + n3, n4, 0);
            }
        } else {
            ff2.v.a(graphics2, ff2.J, n5, n4, 0);
        }
        cw.b(graphics);
        n9 = n6;
        n10 = n8;
        graphics2 = graphics;
        ff2 = this;
        if (ff2.L != null && ff2.L.length() > 0) {
            ff2.v.c(false);
            ff2.v.a(graphics2, ff2.L, n10 + 2, n9 - ff2.v.a() - 4, 0);
            ff2.v.c(false);
        }
        n9 = n6;
        n10 = n8;
        graphics2 = graphics;
        ff2 = this;
        if ((!ff2.S || ff2.W <= ff2.V) && ff2.m()) {
            n5 = n10 + 4 + ff2.E;
            n4 = n9 + (ff2.d.d - ff2.v.a() >> 1);
            n7 = ff2.e() - (ff2.Y != null ? 20 : 0);
            if (ff2.g) {
                if (ff2.F < 6) {
                    graphics2.setColor(0xFF0000);
                    graphics2.drawLine(n5 += ff2.G, n4, n5, n4 + ff2.v.a() - 2);
                }
                if (ff2.x > 0) {
                    n3 = ff2.v.a(ff2.z) + 6;
                    n8 = ff2.v.a() + 6;
                    n6 = n10 + n7 - n3;
                    n5 = n9 - n8;
                    cw.b(graphics2, ff2.O, n6, n5, n3, n8 - 2);
                    graphics2.setColor(ff2.O);
                    graphics2.fillRect(n6 + 1, n5 + 1, n3 - 2, n8 - 4);
                    graphics2.setColor(0);
                    cw.b(graphics2, 0, n10 + n7 - n3, n5, n3, n8 - 2);
                    graphics2.setColor(ff2.N);
                    n9 = ff2.v.a(ff2.z.substring(0, ff2.s));
                    graphics2.fillRect(n6 + 3 + n9, n5 + 2, ff2.v.a(ff2.z.charAt(ff2.s)) - 1, n8 - 6);
                    ff2.v.a(graphics2, ff2.z, n6 + 3, n5 + 2, 0);
                } else if (ff2.y > 0) {
                    String string = ff2.A;
                    n8 = ff2.v.a(string) + 6;
                    n6 = ff2.v.a() + 6;
                    n5 = n10 + n7 - n8;
                    cw.b(graphics2, ff2.O, n5, n9 -= n6, n8, n6 - 2);
                    graphics2.setColor(ff2.O);
                    graphics2.fillRect(n5 + 1, n9 + 1, n8 - 2, n6 - 4);
                    cw.b(graphics2, 0, n10 + n7 - n8, n9, n8, n6 - 2);
                    ff2.v.a(graphics2, string, n5 + 3, n9 + 2, 0);
                } else if (ff2.ab) {
                    ff ff3 = ff2;
                    String string = String.valueOf(ff3.M - ff3.t.length());
                    int n11 = ff2.v.a(string);
                    n6 = ff2.v.a();
                    n5 = n10 + n7 - n11;
                    ff2.v.a(graphics2, string, n5, n9 -= n6, 0);
                }
            }
        }
        if (this.Y != null) {
            this.Y.a(graphics, n, n2);
        }
    }

    public final void j(int n) {
        this.I = n;
        if (n == 4) {
            this.i(3);
            this.y = 0;
        } else if (n == 2) {
            this.i(1);
            this.y = 0;
        }
        if (this.H == 1) {
            this.i(0);
            this.P = true;
            this.y = 0;
        }
    }

    public final void k(int n) {
        this.H = n;
    }

    public final void d(int n, int n2) {
        switch (n2) {
            case -8882: {
                ag.b().e(241224);
                return;
            }
            case -8881: {
                if (this.Q == null) break;
                this.b(this.Q.t());
                ag.b().e(241224);
                return;
            }
            case -3: {
                if (this.Q == null) {
                    this.Q = new hp(1);
                    this.Q.a(this);
                }
                this.Y.d(false);
                ag.b().a(this.Q, false);
            }
        }
    }
}
