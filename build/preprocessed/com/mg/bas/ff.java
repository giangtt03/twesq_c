package com.mg.bas;
// Decompiled with: Procyon 0.6.0

// Class Version: 1
import javax.microedition.lcdui.Graphics;
import com.mg.smsgame.MGMIDlet;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.CommandListener;

public final class ff extends aq implements bf, CommandListener
{
    private static char[][] j;
    private static final String[] k;
    private static final String[] l;
    private static final String[] m;
    private static final String[] n;
    private static final String[] o;
    private static final String[] p;
    private static final String[] q;
    private String[] r;
    private int s;
    private StringBuffer t;
    private int u;
    private d v;
    private int w;
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
    
    static {
        ff.j = new char[][] { { 'a', 'ă', 'â', 'e', 'ê', 'i', 'o', 'ô', 'ơ', 'u', 'ư', 'y', 'A', 'Ă', 'Â', 'E', 'Ê', 'I', 'O', 'Ô', 'Ơ', 'U', 'Ư', 'Y' }, { 'á', 'ắ', 'ấ', 'é', 'ế', 'í', 'ó', 'ố', 'ớ', 'ú', 'ứ', 'ý', 'Á', 'Ắ', 'Ấ', 'É', 'Ế', 'Í', 'Ó', 'Ố', 'Ớ', 'Ú', 'Ứ', 'Ý' }, { 'à', 'ằ', 'ầ', 'è', 'ề', 'ì', 'ò', 'ồ', 'ờ', 'ù', 'ừ', 'ỳ', 'À', 'Ằ', 'Ầ', 'È', 'Ề', 'Ì', 'Ò', 'Ồ', 'Ờ', 'Ù', 'Ừ', 'Ỳ' }, { 'ả', 'ẳ', 'ẩ', 'ẻ', 'ể', 'ỉ', 'ỏ', 'ổ', 'ở', 'ủ', 'ử', 'ỷ', 'Ả', 'Ẳ', 'Ẩ', 'Ẻ', 'Ể', 'Ỉ', 'Ỏ', 'Ổ', 'Ở', 'Ủ', 'Ử', 'Ỷ' }, { 'ã', 'ẵ', 'ẫ', 'ẽ', 'ễ', 'ĩ', 'õ', 'ỗ', 'ỡ', 'ũ', 'ữ', 'ỹ', 'Ã', 'Ẵ', 'Ẫ', 'Ẽ', 'Ễ', 'Ĩ', 'Õ', 'Ỗ', 'Ỡ', 'Ũ', 'Ữ', 'Ỹ' }, { 'ạ', 'ặ', 'ậ', 'ẹ', 'ệ', 'ị', 'ọ', 'ộ', 'ợ', 'ụ', 'ự', 'ỵ', 'Ạ', 'Ặ', 'Ậ', 'Ẹ', 'Ệ', 'Ị', 'Ọ', 'Ộ', 'Ợ', 'Ụ', 'Ự', 'Ỵ' } };
        k = new String[] { " 0", ".,?!'-()#@/:*+<=>;_$%&\"1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9" };
        l = new String[] { " 0", ".,?!'-()#@/:*+<=>;_$%&\"1", "abc2", "def3", "ghi4", "jkl5", "mno6", "pqrs7", "tuv8", "wxyz9" };
        m = new String[] { " 0", ".,?!'-()#@/:*+<=>;_$%&\"1", "AĂÂBC2", "DĐEÊF3", "GHI4", "JKL5", "MNOÔƠ6", "PQRS7", "TUƯV8", "WXYZ9" };
        n = new String[] { " 0", ".,?!'-()#@/:*+<=>;_$%&\"1", "aăâbc2", "dđeêf3", "ghi4", "jkl5", "mnoôơ6", "pqrs7", "tuưv8", "wxyz9" };
        o = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        p = new String[] { "abc", "Abc", "ABC", "123" };
        q = new String[] { "aăâ", "Aăâ", "AĂÂ", "123" };
    }
    
    public final void e(final boolean b) {
        if (b && com.mg.bas.v.z) {
            this.Y = pc.a(this, -3, this.c(), this.d() + 1);
        }
    }
    
    public final void a(final String z) {
        this.Z = z;
    }
    
    public final void g(final int t, final int u) {
        if (t < 0) {
            throw new IllegalArgumentException("Điểm bắt đầu không được nhỏ hơn 0");
        }
        if (u <= 0) {
            throw new IllegalArgumentException("Chiều dài không được nhỏ hơn 1");
        }
        this.R = true;
        this.S = true;
        this.T = t;
        this.U = u;
        this.w();
    }
    
    public final void a(final hp q) {
        (this.Q = q).a(this);
    }
    
    public final void h(final int m) {
        this.M = m;
    }
    
    public final void b(final boolean b) {
        super.b(b);
        this.t();
    }
    
    public static void a() {
        final String[] l = ff.l;
        final int n = 0;
        final String[] n2 = ff.n;
        final int n3 = 0;
        final String[] k = ff.k;
        final int n4 = 0;
        final String[] m = ff.m;
        final int n5 = 0;
        final String s = "+0";
        k[n4] = (m[n5] = s);
        l[n] = (n2[n3] = s);
    }
    
    public static void q() {
        final String[] l = ff.l;
        final int n = 0;
        final String[] n2 = ff.n;
        final int n3 = 0;
        final String[] k = ff.k;
        final int n4 = 0;
        final String[] m = ff.m;
        final int n5 = 0;
        final String s = " ";
        k[n4] = (m[n5] = s);
        l[n] = (n2[n3] = s);
    }
    
    public ff() {
        this("", 255, 2);
    }
    
    public ff(final String l, final int m, final int n) {
        super();
        this.r = ff.l;
        this.s = -1;
        this.t = new StringBuffer("");
        this.v = bx.d;
        this.w = -1987;
        new k();
        this.G = -1;
        this.J = "";
        this.M = -1;
        this.N = 16711680;
        this.O = 16777215;
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
        this.L = l;
        this.M = m;
        this.H = n << 31 >>> 31;
        this.I = n >>> 1 << 1;
        if (this.I == 4) {
            this.i(3);
            this.y = 0;
        }
        else if (this.I == 2) {
            this.i(1);
            this.y = 0;
        }
        if (this.H == 1) {
            this.i(0);
            this.P = true;
            this.y = 0;
        }
        this.N = 16354990;
        this.O = 12643805;
    }
    
    public final String r() {
        return this.t.toString();
    }
    
    public final void b(final String s) {
        if (com.mg.bas.i.a(s)) {
            return;
        }
        this.t.append(s);
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
    
    public final void c(String s) {
        if (s == null) {
            s = "";
        }
        this.t = new StringBuffer(s);
        this.s();
    }
    
    public final void i(final int c) {
        this.C = c;
        this.y = 15;
        this.x = 0;
        this.A = (com.mg.bas.v.b ? ff.q[this.C] : ff.p[this.C]);
        if (this.C == 0) {
            if (com.mg.bas.v.b) {
                this.r = ff.n;
                return;
            }
            this.r = ff.l;
        }
        else {
            if (this.C != 1 && this.C != 2) {
                this.r = ff.o;
                return;
            }
            if (com.mg.bas.v.b) {
                this.r = ff.m;
                return;
            }
            this.r = ff.k;
        }
    }
    
    public final void commandAction(final Command command, final Displayable displayable) {
        if (com.mg.bas.i.a(command.getLabel(), "OK")) {
            this.c(this.K.getString());
            MGMIDlet.d().a((Displayable)ag.a(), true);
            return;
        }
        if (com.mg.bas.i.a(command.getLabel(), "Trở về")) {
            MGMIDlet.d().a((Displayable)ag.a(), true);
            return;
        }
        if (com.mg.bas.i.a(command.getLabel(), "Dán") && !com.mg.bas.i.a(ff.i)) {
            this.K.insert(ff.i, this.K.getCaretPosition());
        }
    }
    
    public final void f(final boolean b) {
        this.ab = true;
    }
    
    public final void a(final be aa) {
        this.aa = aa;
    }
    
    public final void g(final boolean b) {
        if (!b) {
            ag.a().e();
            int n = 0;
            if (this.I == 4) {
                n = 2;
            }
            if (this.H == 1) {
                n |= 0x10000;
            }
            ((Displayable)(this.K = new TextBox(this.L, this.t.toString(), this.M, n))).addCommand(new Command("OK", 4, 1));
            ((Displayable)this.K).addCommand(new Command("Trở về", 2, 1));
            if (!com.mg.bas.i.a(ff.i)) {
                ((Displayable)this.K).addCommand(new Command("Dán", 1, 1));
            }
            ((Displayable)this.K).setCommandListener((CommandListener)this);
            MGMIDlet.d().a((Displayable)this.K, true);
            return;
        }
        bk.b = this.aa;
        if (this.I == 4) {
            ag.a().a(this.d() + this.f(), 3);
            return;
        }
        if (this.u == 0 && this.I != 1) {
            ag.a().a(this.d() + this.f(), 1);
            return;
        }
        ag.a().a(this.d() + this.f(), 2);
    }
    
    private void t() {
        this.u();
        this.v();
    }
    
    private void u() {
        if (this.w >= 0) {
            com.mg.bas.v.c[this.w] = 0;
        }
        final int n = 0;
        this.y = n;
        this.x = n;
        this.w = -1987;
        this.s = -1;
        this.B = false;
        if (this.H == 1) {
            this.w();
        }
        if (super.b != null) {
            super.b.c(true);
        }
    }
    
    private void v() {
        if (this.C != 3) {
            Label_0096: {
                if (!this.P) {
                    if (this.u > 0) {
                        boolean b = false;
                        Label_0087: {
                            if (this.u > 1) {
                                final char char1 = this.t.charAt(this.u - 2);
                                if (this.t.charAt(this.u - 1) == ' ' && (char1 == '.' || char1 == '!' || char1 == '?')) {
                                    b = true;
                                    break Label_0087;
                                }
                            }
                            b = false;
                        }
                        if (!b) {
                            break Label_0096;
                        }
                    }
                    this.i(1);
                    return;
                }
            }
            if (this.C == 1) {
                this.i(0);
            }
        }
    }
    
    public final void d(final boolean b) {
        if (!super.f) {
            return;
        }
        if (super.g != b) {
            if (b && this.R) {
                this.S = true;
                this.w();
            }
            super.d(b);
            this.i(this.C);
            this.u();
        }
    }
    
    public final void a(final int n, final int n2, final int n3, final int n4) {
        super.a(n, n2, n3, n4);
        this.w();
    }
    
    private void l(int length) {
        if (length < 0) {
            length = 0;
        }
        else if (length > this.t.length()) {
            length = this.t.length();
        }
        this.u = length;
        this.w();
    }
    
    private void h(int u, int n) {
        if (this.t.length() <= 0) {
            return;
        }
        if (u >= this.t.length()) {
            u = this.t.length() - 1;
        }
        if (u < 0) {
            u = 0;
        }
        if (u + n > this.t.length()) {
            n = this.t.length() - u;
        }
        this.t.delete(u, u + n);
        this.u = u;
        this.w();
    }
    
    public final boolean f(int char1) {
        if (!super.f) {
            return false;
        }
        Label_5508: {
            switch (char1) {
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
                    if (char1 == 93 && com.mg.bas.v.b()) {
                        return false;
                    }
                    if (this.u > 0) {
                        --this.u;
                        this.t.deleteCharAt(this.u);
                        this.t();
                        this.w();
                        break;
                    }
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
                    if ((com.mg.bas.v.a() && char1 == 135) || (!com.mg.bas.v.a() && char1 == 142)) {
                        if (this.I == 4) {
                            return true;
                        }
                        if (this.B) {
                            if (com.mg.bas.v.a) {
                                com.mg.bas.v.b = !com.mg.bas.v.b;
                            }
                            this.t();
                            this.i(this.D);
                            return true;
                        }
                        this.B = true;
                        this.w = char1;
                        if (!com.mg.bas.v.ai) {
                            this.D = this.C;
                            ++this.C;
                            if (this.C >= 4) {
                                this.C = 0;
                            }
                            this.i(this.C);
                            return true;
                        }
                    }
                    if (com.mg.bas.v.ai) {
                        final char a = ae.a(char1);
                        if (this.C == 3 && (a < '0' || a > '9')) {
                            break;
                        }
                        Label_3518: {
                            if (com.mg.bas.v.b && this.u > 0) {
                                final char c = a;
                                char1 = this.t.charAt(this.u - 1);
                                int n = -1;
                                Label_3510: {
                                    Label_3503: {
                                        Label_3404: {
                                            switch (c) {
                                                case 68:
                                                case 100: {
                                                    switch (char1) {
                                                        case 100: {
                                                            this.c('đ');
                                                            break Label_3518;
                                                        }
                                                        case 273: {
                                                            this.c('d');
                                                            break Label_3503;
                                                        }
                                                        case 68: {
                                                            this.c('Đ');
                                                            break Label_3518;
                                                        }
                                                        case 272: {
                                                            this.c('D');
                                                            break Label_3503;
                                                        }
                                                        default: {
                                                            break Label_3404;
                                                        }
                                                    }
//                                                    break;
                                                }
                                                case 65:
                                                case 97: {
                                                    switch (char1) {
                                                        case 97:
                                                        case 259: {
                                                            this.c('â');
                                                            break Label_3518;
                                                        }
                                                        case 225:
                                                        case 7855: {
                                                            this.c('ấ');
                                                            break Label_3518;
                                                        }
                                                        case 224:
                                                        case 7857: {
                                                            this.c('ầ');
                                                            break Label_3518;
                                                        }
                                                        case 7843:
                                                        case 7859: {
                                                            this.c('ẩ');
                                                            break Label_3518;
                                                        }
                                                        case 227:
                                                        case 7861: {
                                                            this.c('ẫ');
                                                            break Label_3518;
                                                        }
                                                        case 7841:
                                                        case 7863: {
                                                            this.c('ậ');
                                                            break Label_3518;
                                                        }
                                                        case 226:
                                                        case 7845:
                                                        case 7847:
                                                        case 7849:
                                                        case 7851:
                                                        case 7853: {
                                                            this.c('a');
                                                            break Label_3503;
                                                        }
                                                        case 65:
                                                        case 258: {
                                                            this.c('Â');
                                                            break Label_3518;
                                                        }
                                                        case 193:
                                                        case 7854: {
                                                            this.c('Ấ');
                                                            break Label_3518;
                                                        }
                                                        case 192:
                                                        case 7856: {
                                                            this.c('Ầ');
                                                            break Label_3518;
                                                        }
                                                        case 7842:
                                                        case 7858: {
                                                            this.c('Ẩ');
                                                            break Label_3518;
                                                        }
                                                        case 195:
                                                        case 7860: {
                                                            this.c('Ẵ');
                                                            break Label_3518;
                                                        }
                                                        case 7840:
                                                        case 7862: {
                                                            this.c('Ậ');
                                                            break Label_3518;
                                                        }
                                                        case 194:
                                                        case 7844:
                                                        case 7846:
                                                        case 7848:
                                                        case 7850:
                                                        case 7852: {
                                                            this.c('A');
                                                            break Label_3503;
                                                        }
                                                        default: {
                                                            break Label_3404;
                                                        }
                                                    }
//                                                    break;
                                                }
                                                case 69:
                                                case 101: {
                                                    switch (char1) {
                                                        case 101: {
                                                            this.c('ê');
                                                            break Label_3518;
                                                        }
                                                        case 233: {
                                                            this.c('ế');
                                                            break Label_3518;
                                                        }
                                                        case 232: {
                                                            this.c('ề');
                                                            break Label_3518;
                                                        }
                                                        case 7867: {
                                                            this.c('ể');
                                                            break Label_3518;
                                                        }
                                                        case 7869: {
                                                            this.c('ễ');
                                                            break Label_3518;
                                                        }
                                                        case 7865: {
                                                            this.c('ệ');
                                                            break Label_3518;
                                                        }
                                                        case 234:
                                                        case 7871:
                                                        case 7873:
                                                        case 7875:
                                                        case 7877:
                                                        case 7879: {
                                                            this.c('e');
                                                            break Label_3503;
                                                        }
                                                        case 69: {
                                                            this.c('ế');
                                                            break Label_3518;
                                                        }
                                                        case 201: {
                                                            this.c('ề');
                                                            break Label_3518;
                                                        }
                                                        case 200: {
                                                            this.c('ể');
                                                            break Label_3518;
                                                        }
                                                        case 7866: {
                                                            this.c('ễ');
                                                            break Label_3518;
                                                        }
                                                        case 7868: {
                                                            this.c('ệ');
                                                            break Label_3518;
                                                        }
                                                        case 7864: {
                                                            this.c('ệ');
                                                            break Label_3518;
                                                        }
                                                        case 202:
                                                        case 7870:
                                                        case 7872:
                                                        case 7874:
                                                        case 7876:
                                                        case 7878: {
                                                            this.c('E');
                                                            break Label_3503;
                                                        }
                                                        default: {
                                                            break Label_3404;
                                                        }
                                                    }
//                                                    break;
                                                }
                                                case 79:
                                                case 111: {
                                                    switch (char1) {
                                                        case 111:
                                                        case 417: {
                                                            this.c('ô');
                                                            break Label_3518;
                                                        }
                                                        case 243:
                                                        case 7899: {
                                                            this.c('ố');
                                                            break Label_3518;
                                                        }
                                                        case 242:
                                                        case 7901: {
                                                            this.c('ồ');
                                                            break Label_3518;
                                                        }
                                                        case 7887:
                                                        case 7903: {
                                                            this.c('ổ');
                                                            break Label_3518;
                                                        }
                                                        case 245:
                                                        case 7905: {
                                                            this.c('ỗ');
                                                            break Label_3518;
                                                        }
                                                        case 7885:
                                                        case 7907: {
                                                            this.c('ộ');
                                                            break Label_3518;
                                                        }
                                                        case 244:
                                                        case 7889:
                                                        case 7891:
                                                        case 7893:
                                                        case 7895:
                                                        case 7897: {
                                                            this.c('o');
                                                            break Label_3503;
                                                        }
                                                        case 79:
                                                        case 416: {
                                                            this.c('Ô');
                                                            break Label_3518;
                                                        }
                                                        case 211:
                                                        case 7898: {
                                                            this.c('Ố');
                                                            break Label_3518;
                                                        }
                                                        case 210:
                                                        case 7900: {
                                                            this.c('Ồ');
                                                            break Label_3518;
                                                        }
                                                        case 7886:
                                                        case 7902: {
                                                            this.c('Ổ');
                                                            break Label_3518;
                                                        }
                                                        case 213:
                                                        case 7904: {
                                                            this.c('Ỗ');
                                                            break Label_3518;
                                                        }
                                                        case 7884:
                                                        case 7906: {
                                                            this.c('Ộ');
                                                            break Label_3518;
                                                        }
                                                        case 212:
                                                        case 7888:
                                                        case 7890:
                                                        case 7892:
                                                        case 7894:
                                                        case 7896: {
                                                            this.c('O');
                                                            break Label_3503;
                                                        }
                                                        default: {
                                                            break Label_3404;
                                                        }
                                                    }
//                                                    break;
                                                }
                                                case 87:
                                                case 119: {
                                                    switch (char1) {
                                                        case 111:
                                                        case 244: {
                                                            this.c('ơ');
                                                            break Label_3518;
                                                        }
                                                        case 243:
                                                        case 7889: {
                                                            this.c('ớ');
                                                            break Label_3518;
                                                        }
                                                        case 242:
                                                        case 7891: {
                                                            this.c('ờ');
                                                            break Label_3518;
                                                        }
                                                        case 7887:
                                                        case 7893: {
                                                            this.c('ở');
                                                            break Label_3518;
                                                        }
                                                        case 245:
                                                        case 7895: {
                                                            this.c('ỡ');
                                                            break Label_3518;
                                                        }
                                                        case 7885:
                                                        case 7897: {
                                                            this.c('ợ');
                                                            break Label_3518;
                                                        }
                                                        case 417:
                                                        case 7899:
                                                        case 7901:
                                                        case 7903:
                                                        case 7905:
                                                        case 7907: {
                                                            this.c('o');
                                                            break Label_3503;
                                                        }
                                                        case 79:
                                                        case 212: {
                                                            this.c('Ơ');
                                                            break Label_3518;
                                                        }
                                                        case 211:
                                                        case 7888: {
                                                            this.c('Ớ');
                                                            break Label_3518;
                                                        }
                                                        case 210:
                                                        case 7890: {
                                                            this.c('Ờ');
                                                            break Label_3518;
                                                        }
                                                        case 7886:
                                                        case 7892: {
                                                            this.c('Ở');
                                                            break Label_3518;
                                                        }
                                                        case 213:
                                                        case 7894: {
                                                            this.c('Ỡ');
                                                            break Label_3518;
                                                        }
                                                        case 7884:
                                                        case 7896: {
                                                            this.c('Ợ');
                                                            break Label_3518;
                                                        }
                                                        case 416:
                                                        case 7898:
                                                        case 7900:
                                                        case 7902:
                                                        case 7904:
                                                        case 7906: {
                                                            this.c('O');
                                                            break Label_3503;
                                                        }
                                                        case 117: {
                                                            this.c('ư');
                                                            break Label_3518;
                                                        }
                                                        case 250: {
                                                            this.c('ứ');
                                                            break Label_3518;
                                                        }
                                                        case 249: {
                                                            this.c('ừ');
                                                            break Label_3518;
                                                        }
                                                        case 7911: {
                                                            this.c('ử');
                                                            break Label_3518;
                                                        }
                                                        case 361: {
                                                            this.c('ữ');
                                                            break Label_3518;
                                                        }
                                                        case 7909: {
                                                            this.c('ự');
                                                            break Label_3518;
                                                        }
                                                        case 432:
                                                        case 7913:
                                                        case 7915:
                                                        case 7917:
                                                        case 7919:
                                                        case 7921: {
                                                            this.c('u');
                                                            break Label_3503;
                                                        }
                                                        case 85: {
                                                            this.c('Ư');
                                                            break Label_3518;
                                                        }
                                                        case 218: {
                                                            this.c('Ứ');
                                                            break Label_3518;
                                                        }
                                                        case 217: {
                                                            this.c('Ừ');
                                                            break Label_3518;
                                                        }
                                                        case 7910: {
                                                            this.c('Ử');
                                                            break Label_3518;
                                                        }
                                                        case 360: {
                                                            this.c('Ữ');
                                                            break Label_3518;
                                                        }
                                                        case 7908: {
                                                            this.c('Ự');
                                                            break Label_3518;
                                                        }
                                                        case 431:
                                                        case 7912:
                                                        case 7914:
                                                        case 7916:
                                                        case 7918:
                                                        case 7920: {
                                                            this.c('U');
                                                            break Label_3503;
                                                        }
                                                        case 97:
                                                        case 226: {
                                                            this.c('ă');
                                                            break Label_3518;
                                                        }
                                                        case 225:
                                                        case 7845: {
                                                            this.c('ắ');
                                                            break Label_3518;
                                                        }
                                                        case 224:
                                                        case 7847: {
                                                            this.c('ằ');
                                                            break Label_3518;
                                                        }
                                                        case 7843:
                                                        case 7849: {
                                                            this.c('ẳ');
                                                            break Label_3518;
                                                        }
                                                        case 227:
                                                        case 7851: {
                                                            this.c('ẵ');
                                                            break Label_3518;
                                                        }
                                                        case 7841:
                                                        case 7853: {
                                                            this.c('ặ');
                                                            break Label_3518;
                                                        }
                                                        case 259:
                                                        case 7855:
                                                        case 7857:
                                                        case 7859:
                                                        case 7861:
                                                        case 7863: {
                                                            this.c('a');
                                                            break Label_3503;
                                                        }
                                                        case 65:
                                                        case 194: {
                                                            this.c('Ă');
                                                            break Label_3518;
                                                        }
                                                        case 193:
                                                        case 7844: {
                                                            this.c('Ắ');
                                                            break Label_3518;
                                                        }
                                                        case 192:
                                                        case 7846: {
                                                            this.c('Ằ');
                                                            break Label_3518;
                                                        }
                                                        case 7842:
                                                        case 7848: {
                                                            this.c('Ẳ');
                                                            break Label_3518;
                                                        }
                                                        case 195:
                                                        case 7850: {
                                                            this.c('Ẵ');
                                                            break Label_3518;
                                                        }
                                                        case 7840:
                                                        case 7852: {
                                                            this.c('Ặ');
                                                            break Label_3518;
                                                        }
                                                        case 258:
                                                        case 7854:
                                                        case 7856:
                                                        case 7858:
                                                        case 7860:
                                                        case 7862: {
                                                            this.c('A');
                                                            break Label_3503;
                                                        }
                                                        default: {
                                                            break Label_3404;
                                                        }
                                                    }
//                                                    break;
                                                }
                                                case 90:
                                                case 122: {
                                                    n = 0;
                                                    break;
                                                }
                                                case 83:
                                                case 115: {
                                                    n = 1;
                                                    break;
                                                }
                                                case 70:
                                                case 102: {
                                                    n = 2;
                                                    break;
                                                }
                                                case 82:
                                                case 114: {
                                                    n = 3;
                                                    break;
                                                }
                                                case 88:
                                                case 120: {
                                                    n = 4;
                                                    break;
                                                }
                                                case 74:
                                                case 106: {
                                                    n = 5;
                                                    break;
                                                }
                                            }
                                        }
                                        if (n >= 0) {
                                            final char[][] j = ff.j;
                                            for (int i = 5; i >= 0; --i) {
                                                int k = ff.j[0].length - 1;
                                                while (k >= 0) {
                                                    if (char1 == ff.j[i][k]) {
                                                        if (i == n) {
                                                            char1 = ff.j[0][k];
                                                            this.c((char)char1);
                                                            this.d(c);
                                                            break Label_3510;
                                                        }
                                                        char1 = ff.j[n][k];
                                                        this.c((char)char1);
                                                        break Label_3518;
                                                    }
                                                    else {
                                                        --k;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    this.d(c);
                                }
                            }
                            else {
                                this.d(a);
                            }
                        }
                        break;
                    }
                    else {
                        final int w = char1;
                        switch (w) {
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
                                Label_5503: {
                                    if (com.mg.bas.v.a()) {
                                        if (w == 148 && this.C != 3) {
                                            if (this.B) {
                                                this.c('0');
                                                this.t();
                                                this.w();
                                                break Label_5508;
                                            }
                                            this.d(' ');
                                            this.w = w;
                                            break Label_5503;
                                        }
                                        else if (w == 142 && !com.mg.bas.v.b) {
                                            if (this.C == 3 || this.B) {
                                                this.d('+');
                                                this.t();
                                                this.w();
                                                break Label_5508;
                                            }
                                            this.w = w;
                                            this.B = true;
                                            break Label_5508;
                                        }
                                    }
                                    else if (w == 135) {
                                        this.d(' ');
                                        this.w = -1987;
                                        this.B = false;
                                        this.v();
                                        break Label_5508;
                                    }
                                    if (com.mg.bas.v.b && ((com.mg.bas.v.a() && w == 142) || (!com.mg.bas.v.a() && w == 148)) && this.u > 0) {
                                        final char char2 = this.t.charAt(this.u - 1);
                                        if (this.B) {
                                            char c2;
                                            switch (c2 = char2) {
                                                case 'a':
                                                case 'à':
                                                case 'á':
                                                case 'ã':
                                                case 'ạ':
                                                case 'ả': {
                                                    c2 = 'a';
                                                    break;
                                                }
                                                case 'ă':
                                                case 'ắ':
                                                case 'ằ':
                                                case 'ẳ':
                                                case 'ẵ':
                                                case 'ặ': {
                                                    c2 = 'ă';
                                                    break;
                                                }
                                                case 'â':
                                                case 'ấ':
                                                case 'ầ':
                                                case 'ẩ':
                                                case 'ẫ':
                                                case 'ậ': {
                                                    c2 = 'â';
                                                    break;
                                                }
                                                case 'o':
                                                case 'ò':
                                                case 'ó':
                                                case 'õ':
                                                case 'ọ':
                                                case 'ỏ': {
                                                    c2 = 'o';
                                                    break;
                                                }
                                                case 'ơ':
                                                case 'ớ':
                                                case 'ờ':
                                                case 'ở':
                                                case 'ỡ':
                                                case 'ợ': {
                                                    c2 = 'ơ';
                                                    break;
                                                }
                                                case 'ô':
                                                case 'ố':
                                                case 'ồ':
                                                case 'ổ':
                                                case 'ỗ':
                                                case 'ộ': {
                                                    c2 = 'ô';
                                                    break;
                                                }
                                                case 'e':
                                                case 'è':
                                                case 'é':
                                                case 'ẹ':
                                                case 'ẻ':
                                                case 'ẽ': {
                                                    c2 = 'e';
                                                    break;
                                                }
                                                case 'ê':
                                                case 'ế':
                                                case 'ề':
                                                case 'ể':
                                                case 'ễ':
                                                case 'ệ': {
                                                    c2 = 'ê';
                                                    break;
                                                }
                                                case 'u':
                                                case 'ù':
                                                case 'ú':
                                                case 'ũ':
                                                case 'ụ':
                                                case 'ủ': {
                                                    c2 = 'u';
                                                    break;
                                                }
                                                case 'ư':
                                                case 'ứ':
                                                case 'ừ':
                                                case 'ử':
                                                case 'ữ':
                                                case 'ự': {
                                                    c2 = 'ư';
                                                    break;
                                                }
                                                case 'i':
                                                case 'ì':
                                                case 'í':
                                                case 'ĩ':
                                                case 'ỉ':
                                                case 'ị': {
                                                    c2 = 'i';
                                                    break;
                                                }
                                                case 'y':
                                                case 'ý':
                                                case 'ỳ':
                                                case 'ỵ':
                                                case 'ỷ':
                                                case 'ỹ': {
                                                    c2 = 'y';
                                                    break;
                                                }
                                                case 'd':
                                                case 'đ': {
                                                    c2 = 'd';
                                                    break;
                                                }
                                                case 'A':
                                                case 'À':
                                                case 'Á':
                                                case 'Ã':
                                                case 'Ạ':
                                                case 'Ả': {
                                                    c2 = 'A';
                                                    break;
                                                }
                                                case 'Ă':
                                                case 'Ắ':
                                                case 'Ằ':
                                                case 'Ẳ':
                                                case 'Ẵ':
                                                case 'Ặ': {
                                                    c2 = 'Ă';
                                                    break;
                                                }
                                                case 'Â':
                                                case 'Ấ':
                                                case 'Ầ':
                                                case 'Ẩ':
                                                case 'Ẫ':
                                                case 'Ậ': {
                                                    c2 = 'Â';
                                                    break;
                                                }
                                                case 'O':
                                                case 'Ò':
                                                case 'Ó':
                                                case 'Õ':
                                                case 'Ọ':
                                                case 'Ỏ': {
                                                    c2 = 'O';
                                                    break;
                                                }
                                                case 'Ơ':
                                                case 'Ớ':
                                                case 'Ờ':
                                                case 'Ở':
                                                case 'Ỡ':
                                                case 'Ợ': {
                                                    c2 = 'Ơ';
                                                    break;
                                                }
                                                case 'Ô':
                                                case 'Ố':
                                                case 'Ồ':
                                                case 'Ổ':
                                                case 'Ỗ':
                                                case 'Ộ': {
                                                    c2 = 'Ô';
                                                    break;
                                                }
                                                case 'E':
                                                case 'È':
                                                case 'É':
                                                case 'Ẹ':
                                                case 'Ẻ':
                                                case 'Ẽ': {
                                                    c2 = 'E';
                                                    break;
                                                }
                                                case 'Ê':
                                                case 'Ế':
                                                case 'Ề':
                                                case 'Ể':
                                                case 'Ễ':
                                                case 'Ệ': {
                                                    c2 = 'Ê';
                                                    break;
                                                }
                                                case 'U':
                                                case 'Ù':
                                                case 'Ú':
                                                case 'Ũ':
                                                case 'Ụ':
                                                case 'Ủ': {
                                                    c2 = 'U';
                                                    break;
                                                }
                                                case 'Ư':
                                                case 'Ứ':
                                                case 'Ừ':
                                                case 'Ử':
                                                case 'Ữ':
                                                case 'Ự': {
                                                    c2 = 'Ư';
                                                    break;
                                                }
                                                case 'I':
                                                case 'Ì':
                                                case 'Í':
                                                case 'Ĩ':
                                                case 'Ỉ':
                                                case 'Ị': {
                                                    c2 = 'I';
                                                    break;
                                                }
                                                case 'Y':
                                                case 'Ý':
                                                case 'Ỳ':
                                                case 'Ỵ':
                                                case 'Ỷ':
                                                case 'Ỹ': {
                                                    c2 = 'Y';
                                                    break;
                                                }
                                                case 'D':
                                                case 'Đ': {
                                                    c2 = 'D';
                                                    break;
                                                }
                                            }
                                            final char c3;
                                            if ((c3 = c2) != char2) {
                                                this.c(c3);
                                            }
                                        }
                                        else {
                                            final char a2;
                                            if ((a2 = a(char2)) != '') {
                                                this.c(a2);
                                                this.t();
                                                break Label_5503;
                                            }
                                        }
                                    }
                                    if (this.B && w != this.w) {
                                        com.mg.bas.v.c[w] = 0;
                                        break Label_5508;
                                    }
                                    if (w != this.w) {
                                        this.s = -1;
                                        if ((this.w != -1987 && com.mg.bas.v.a() && this.w != 135) || (!com.mg.bas.v.a() && this.w != 142)) {
                                            this.t();
                                        }
                                    }
                                    if (w < 148 || w > 157) {
                                        break Label_5508;
                                    }
                                    this.x = 25;
                                    final String z = this.r[w - 148];
                                    this.z = z;
                                    if (this.B) {
                                        this.s = z.length() - 1;
                                    }
                                    else {
                                        this.s = (this.s + 1) % z.length();
                                    }
                                    final char char3 = z.charAt(this.s);
                                    if (w != this.w) {
                                        this.d(char3);
                                        this.w = w;
                                    }
                                    else {
                                        this.c(char3);
                                    }
                                    if (this.B || z.length() < 2) {
                                        this.t();
                                        this.w();
                                        break Label_5508;
                                    }
                                }
                                this.B = true;
                                break Label_5508;
                            }
                        }
                    }
                    break;
                }
            }
        }
        return true;
    }
    
    public final boolean c(final int n, final int n2) {
        int n3 = 0;
        if (this.Y != null) {
            this.Y.c(n, n2);
            n3 = 20;
        }
        if (this.m()) {
            this.S = false;
        }
        if (!super.f) {
            return false;
        }
        if (n > this.c() + n3 && n < this.c() + this.e() + n3 && n2 > this.d() && n2 < this.d() + this.f()) {
            if (super.g) {
                ag.a();
                this.g(!ag.f());
            }
            else {
                this.g(true);
            }
            return true;
        }
        return false;
    }
    
    public final boolean g(final int n) {
        if (!super.g) {
            return false;
        }
        this.B = false;
        return true;
    }
    
    private static char a(final char c) {
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
                break;
            }
        }
        return c2;
    }
    
    private char b(final char c) {
        if (super.h == null) {
            return c;
        }
        this.ac.a(c);
        super.h.a(this.ac);
        return this.ac.a();
    }
    
    private void c(final char c) {
        if (this.t.length() <= 0 || this.u <= 0) {
            return;
        }
        final char b;
        if ((b = this.b(c)) != '') {
            this.t.setCharAt(this.u - 1, b);
            this.w();
        }
    }
    
    private void d(final char c) {
        final char b;
        if ((b = this.b(c)) != '') {
            if (this.t.length() + 1 > this.M) {
                this.t.delete(this.M - 1, this.t.length());
                if (this.u > this.t.length()) {
                    this.u = this.t.length();
                }
            }
            if (this.u <= this.t.length()) {
                this.t.insert(this.u, b);
            }
            else {
                this.t.append(b);
            }
            ++this.u;
            this.w();
        }
    }
    
    private void w() {
        final int n = this.e() - ((this.Y != null) ? 20 : 0);
        this.J = "";
        if (this.H == 1) {
            for (int i = this.u - 2; i >= 0; --i) {
                this.J = String.valueOf(this.J) + "*";
            }
            if (this.u > 0) {
                if (this.x > 0) {
                    this.J = String.valueOf(this.J) + this.t.charAt(this.u - 1);
                }
                else {
                    this.J = String.valueOf(this.J) + "*";
                }
            }
            for (int j = this.t.length() - 1; j >= this.u; --j) {
                this.J = String.valueOf(this.J) + "*";
            }
        }
        else {
            this.J = this.t.toString();
        }
        String k;
        if ((k = this.J) == null) {
            k = "";
        }
        final int a = this.v.a(k);
        if (this.E < 0 && this.v.a(k) + this.E < n - 4 - 3) {
            this.E = n - a;
        }
        this.G = this.v.a(k.substring(0, this.u));
        if (this.E + this.G <= 0) {
            this.E = -this.G;
            this.E += 8;
        }
        else if (this.E + this.G >= n - 4 - 3) {
            this.E = n - this.G - 8;
        }
        if (this.E > 0) {
            this.E = 0;
        }
        if (this.G <= 0) {
            this.G = -1;
        }
        if (this.S) {
            final int n2 = 0;
            this.W = n2;
            this.V = n2;
            if (this.t.length() <= 0 || this.T >= this.t.length()) {
                return;
            }
            int t = this.T;
            int u = this.U;
            if (t < 0) {
                t = 0;
            }
            if (t + u > this.t.length()) {
                u = this.t.length() - t;
            }
            if (t == 0) {
                this.V = 0;
            }
            else {
                this.V = this.v.a(k.substring(0, t));
            }
            if (t + u >= k.length()) {
                this.W = a;
            }
            else {
                this.W = this.V + this.v.a(k.substring(t, t + u));
            }
            this.V += this.E;
            this.W += this.E;
            final int w = n - 8;
            if (this.V < 0) {
                this.V = 0;
            }
            if (this.W > w) {
                this.W = w;
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
            if (this.x == 0 && super.b != null) {
                super.b.c(true);
            }
        }
        if (!super.g) {
            return;
        }
        if (this.F < 12) {
            ++this.F;
            return;
        }
        this.F = 0;
    }
    
    public final void a(final Graphics graphics, final int n, final int n2) {
        if (!super.e) {
            return;
        }
        final int n3 = (this.Y != null) ? 20 : 0;
        final int n4 = this.c() + n + n3;
        final int n5 = this.d() + n2;
        pc.a(graphics, n4, n5, this.e() - ((this.Y != null) ? 20 : 0), this.f(), super.g && super.f);
        final int n6 = n4;
        final int n7 = n5;
        final int n8 = n6;
        if (this.W > this.V && this.S && this.m()) {
            final int n9 = n8 + 4 + this.V;
            final int n10 = n7 + (super.d.d - this.v.a() >> 1);
            graphics.setColor(this.X);
            graphics.fillRect(n9, n10, this.W - this.V, this.v.a());
        }
        cw.a(graphics);
        cw.a(graphics, n4 + 4, n5, this.e() - 4 - 4 - n3, this.f());
        final int n11 = n4;
        final int n12 = n5;
        final int n13 = n11 + 4 + this.E;
        final int n14 = n12 + (super.d.d - this.v.a() >> 1);
        if (this.J == null || this.J.equals("")) {
            if (this.Z.length() > 0) {
                bx.d.a(true);
                bx.d.a(graphics, this.Z, n13, n14, 0);
                bx.d.a(false);
            }
        }
        else if (this.H == 1) {
            if (this.x <= 0) {
                this.v.a(graphics, this.J, n13, n14 + 3, 0);
            }
            else if (this.J.length() > 0) {
                final String substring;
                if (!com.mg.bas.i.b(substring = this.J.substring(0, this.J.length() - 1))) {
                    this.v.a(graphics, substring, n13, n14 + 3, 0);
                }
                this.v.a(graphics, new StringBuffer(String.valueOf(this.J.charAt(this.J.length() - 1))).toString(), n13 + this.v.a(substring), n14, 0);
            }
        }
        else {
            this.v.a(graphics, this.J, n13, n14, 0);
        }
        cw.b(graphics);
        final int n15 = n4;
        final int n16 = n5;
        final int n17 = n15;
        if (this.L != null && this.L.length() > 0) {
            this.v.c(false);
            this.v.a(graphics, this.L, n17 + 2, n16 - this.v.a() - 4, 0);
            this.v.c(false);
        }
        final int n18 = n4;
        final int n19 = n5;
        final int n20 = n18;
        if ((this.S || this.W <= this.V) && this.m()) {
            final int n21 = n20 + 4 + this.E;
            final int n22 = n19 + (super.d.d - this.v.a() >> 1);
            final int n23 = this.e() - ((this.Y != null) ? 20 : 0);
            if (super.g) {
                if (this.F < 6) {
                    final int n24 = n21 + this.G;
                    graphics.setColor(16711680);
                    graphics.drawLine(n24, n22, n24, n22 + this.v.a() - 2);
                }
                if (this.x > 0) {
                    final int n25 = this.v.a(this.z) + 6;
                    final int n26 = this.v.a() + 6;
                    final int n27 = n20 + n23 - n25;
                    final int n28 = n19 - n26;
                    cw.b(graphics, this.O, n27, n28, n25, n26 - 2);
                    graphics.setColor(this.O);
                    graphics.fillRect(n27 + 1, n28 + 1, n25 - 2, n26 - 4);
                    graphics.setColor(0);
                    cw.b(graphics, 0, n20 + n23 - n25, n28, n25, n26 - 2);
                    graphics.setColor(this.N);
                    graphics.fillRect(n27 + 3 + this.v.a(this.z.substring(0, this.s)), n28 + 2, this.v.a(this.z.charAt(this.s)) - 1, n26 - 6);
                    this.v.a(graphics, this.z, n27 + 3, n28 + 2, 0);
                }
                else if (this.y > 0) {
                    final String a = this.A;
                    final int n29 = this.v.a(a) + 6;
                    final int n30 = this.v.a() + 6;
                    final int n31 = n20 + n23 - n29;
                    final int n32 = n19 - n30;
                    cw.b(graphics, this.O, n31, n32, n29, n30 - 2);
                    graphics.setColor(this.O);
                    graphics.fillRect(n31 + 1, n32 + 1, n29 - 2, n30 - 4);
                    cw.b(graphics, 0, n20 + n23 - n29, n32, n29, n30 - 2);
                    this.v.a(graphics, a, n31 + 3, n32 + 2, 0);
                }
                else if (this.ab) {
                    final String string = new StringBuffer(String.valueOf(this.M - this.t.length())).toString();
                    this.v.a(graphics, string, n20 + n23 - this.v.a(string), n19 - this.v.a(), 0);
                }
            }
        }
        if (this.Y != null) {
            this.Y.a(graphics, n, n2);
        }
    }
    
    public final void j(final int i) {
        this.I = i;
        if (i == 4) {
            this.i(3);
            this.y = 0;
        }
        else if (i == 2) {
            this.i(1);
            this.y = 0;
        }
        if (this.H == 1) {
            this.i(0);
            this.P = true;
            this.y = 0;
        }
    }
    
    public final void k(final int h) {
        this.H = h;
    }
    
    public final void d(final int n, final int n2) {
        switch (n2) {
            case -8882: {
                ag.b().e(241224);
                return;
            }
            case -8881: {
                if (this.Q != null) {
                    this.b(this.Q.t());
                    ag.b().e(241224);
                    return;
                }
                break;
            }
            case -3: {
                if (this.Q == null) {
                    (this.Q = new hp((byte)1)).a(this);
                }
                this.Y.d(false);
                ag.b().a(this.Q, false);
                break;
            }
        }
    }
}
