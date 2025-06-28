package com.mg.bas;
// Decompiled with: CFR 0.152
// Class Version: 1
import javax.microedition.lcdui.Graphics;

public final class op
extends fb
implements bf,
bg,
bn,
bq {
    private ff q;
    di p;
    private aw r;
    private ay s;
    private oj t;
    private ex u;
    private aq[] v;
    private int w;
    private dm x;
    private hp y = null;
    private int z = -1;
    private fr A;
    private long B = -1L;
    private int C = 0;
    private int D = 0;

    public op(oj oj2, int n, int n2, String string) {
        super(106, 3, string, false);
        this.t = oj2;
        this.y = new hp((byte)1);
        this.y.a(this);
        this.a(0, 0, com.mg.bas.v.t, com.mg.bas.v.u);
        this.r = new aw();
        this.r.h(3);
        this.r.a((bn)this);
        this.r.a((bq)this);
        this.r.h(10);
        this.s = new ay(0);
        this.s.a(1, 22, com.mg.bas.v.t - 2, com.mg.bas.v.u - ba.a - 22 - 20);
        this.s.b(this.r);
        this.q = new ff("", 300, 2);
        this.q.a(this);
        this.A = new fr("Bấm phím xuống để thêm KUL và phím phải để thêm SMILEY", this.q, 0);
        if (com.mg.bas.v.z) {
            this.q.a(0, com.mg.bas.v.u - ba.a - 20, com.mg.bas.v.t - 40 - 8, 20);
            this.q.e(com.mg.bas.v.z);
            this.u = new ex("Gửi", -3);
            this.u.a(this.q.e() + this.q.c() + 2, this.q.d(), 40, 20);
            this.v = new aq[]{this.s, this.q, this.u};
            this.v();
        } else {
            this.q.a(0, com.mg.bas.v.u - ba.a - 20, com.mg.bas.v.t, 20);
            this.w();
        }
        this.a(new ba());
        this.a(new gb(-1, 0));
        this.c(com.mg.sq.a.n);
        if (com.mg.bas.v.b()) {
            this.b(new gb(-10, 1));
        }
        this.a((aq)this);
    }

    public final void a() {
        this.r.q();
        this.p = null;
    }

    public final void a(di object) {
        this.p = object;
        this.j = this.p != null ? com.mg.sq.a.a(this.p.b().a(), bx.e, com.mg.bas.v.t - 120) : "Đàm Đạo";
        this.r.q();
        a aObj;
        if (this.p == null) {
            aObj = new a();
        } else {
            aObj = this.p.c(); 
        }
        Object[] objectArray = new Object[aObj.d()];
        int n = 0;
        while (n < objectArray.length) {
            objectArray[n] = aObj.b(n);
            ++n;
        }
        if (com.mg.bas.v.z) {
            this.v();
        } else {
            this.w();
        }
        if (aObj.d() > 0) {
            this.r.a(objectArray);
        }
        if (this.r.a() > 0) {
            this.r.k(this.r.a() - 1);
            if (this.r.r() != null) {
                fq fq2 = (fq)this.r.o(this.r.a() - 1);
                fq2.q();
            }
        }
        this.s.g(false);
    }

    private void v() {
        this.e(false);
        this.s.d(true);
        this.w = 0;
        this.c(true);
        this.r.k(this.r.s());
        if (this.A != null && this.A.i()) {
            fr fr2 = this.A;
            fr2.a(false);
        }
    }

    private void w() {
        boolean bl = this.q.m();
        this.e(true);
        if (!bl) {
            this.q.d(true);
            if (this.A != null) {
                this.B = System.currentTimeMillis();
            }
        }
        this.c(true);
        this.w = 2;
    }

    private void e(boolean bl) {
        if (com.mg.bas.v.z && this.v != null) {
            int n = 0;
            while (n < this.v.length) {
                if (!bl || n != 1) {
                    this.v[n].d(false);
                }
                ++n;
            }
            return;
        }
        this.s.d(false);
        if (!bl) {
            this.q.d(false);
        }
    }

    public final void a(dm dm2, boolean bl) {
        if (bl) {
            this.r.j(0);
        }
        if (dm2.c() > 1) {
            this.r.b(dm2, this.r.a() - 1);
        } else {
            this.r.a(dm2);
        }
        if (this.q.m()) {
            this.s.g(true);
            this.w();
            return;
        }
        this.v();
    }

    public final void x() {
        this.s.c(true);
        if (this.p != null && this.p.a) {
            this.p.a = false;
            this.t.A();
        }
    }

    public final void y() {
    }

    public final void c(boolean bl) {
        super.c(bl);
        this.s.c(bl);
    }

    public final void a(Graphics graphics, int n, int n2) {
        if (this.s.k()) {
            graphics.setColor(com.mg.bas.v.am);
            graphics.fillRect(0, 0, com.mg.bas.v.t, com.mg.bas.v.u - ba.a);
            pc.a(graphics, 2, 20, com.mg.bas.v.t - 4);
            if (this.p != null) {
                ds ds2 = this.p.b();
                String string = ds2.a();
                if (ds2.b() != null) {
                    string = ds2.b();
                }
                bx.d.c(true);
                bx.d.a(graphics, string, com.mg.bas.v.t >>> 1, 2, 1);
                bx.d.c();
            }
            graphics.drawImage(pc.d, com.mg.bas.v.t, com.mg.bas.v.u - ba.a, 40);
            if (!this.q.m()) {
                this.q.a(graphics, this.c(), this.d());
            }
            this.s.a(graphics, this.c(), this.d());
        }
        if (com.mg.bas.v.z) {
            this.u.a(graphics, this.c(), this.d());
        }
        if (this.q.m()) {
            this.q.a(graphics, this.c(), this.d());
            if (this.A != null) {
                this.A.a(graphics, this.c(), this.d());
            }
        }
    }

    public final void n() {
        this.q.n();
        if (this.A != null && this.B >= 0L) {
            boolean bl = this.A.i();
            this.A.n();
            if (this.q.m()) {
                if (bl) {
                    if (!this.A.i()) {
                        ++this.C;
                        if (this.C > 0) {
                            this.A = null;
                        }
                        this.B = -1L;
                        this.c(true);
                    }
                } else {
                    if (this.C > 0) {
                        this.A = null;
                        this.c(true);
                    }
                    if (System.currentTimeMillis() - this.B > 3000L && this.A != null) {
                        this.A.a();
                    }
                }
            }
        }
        this.s.n();
    }

    private void a(String string, int n) {
        boolean bl = this.p.a(string, n);
        this.a(this.p.a(this.p.d() - 1), bl);
    }

    private boolean z() {
        int n = this.z + 1;
        String string = this.q.r();
        if (!com.mg.bas.i.a(string) || n > 0) {
            string = string.trim();
            this.a(string, n);
            if (n > 0) {
                du.a().a(this.p.b().a(), string, null, (short)n);
            } else {
                du.a().a(this.p.b().a(), string, null);
            }
            this.q.c("");
            this.z = -1;
            return true;
        }
        return false;
    }

    public final boolean f(int n) {
        aq aq2;
        if (this.A != null && this.A.i()) {
            aq2 = this.A;
            aq2.a(false);
            this.c(true);
            ++this.C;
        }
        if (this.q.m()) {
            if (n == 95 && this.z()) {
                return true;
            }
            if (n == 99) {
                this.r.k(this.r.a() - 1);
                this.s.g(false);
                this.v();
                if (this.r.r() != null) {
                    aq2 = (fq)this.r.o(this.r.a() - 1);
                    ((fq)aq2).q();
                }
                return true;
            }
            if (n == 98 && oy.g) {
                this.A();
                return true;
            }
            boolean bl = this.q.f(n);
            this.B = System.currentTimeMillis();
            if (!(bl || n != 97 && n != 96)) {
                ag.a().e();
                if (n == 97) {
                    return false;
                }
                ag.b().a(this.y, false);
                return true;
            }
            return bl;
        }
        if (this.s.m()) {
            boolean bl = this.s.f(n);
            if (!bl && (n == 98 || com.mg.bas.v.ai && (n < 93 || n > 99) || n >= 148 && n <= 157)) {
                this.w();
                this.q.f(n);
                return true;
            }
            if (bl) {
                return true;
            }
        }
        return false;
    }

    private void A() {
        hp hp2 = new hp((byte)2);
        hp2.a(this);
        hp2.f(this.D);
        ag.b().a(hp2, false);
    }

    public final boolean g(int n) {
        return this.q.g(n);
    }

    public final boolean c(int n, int n2) {
        int n3 = 0;
        while (n3 < this.v.length) {
            if (this.v[n3].h().b(n, n2)) {
                this.v[n3].c(n, n2);
                if (n3 == 2) {
                    this.z();
                }
                if (this.w != n3) {
                    if (n3 == 1) {
                        this.w();
                    } else if (n3 == 0) {
                        this.v();
                    } else {
                        this.v[this.w].d(false);
                        this.w = n3;
                        this.v[this.w].d(true);
                    }
                }
                return true;
            }
            ++n3;
        }
        if (n2 > com.mg.bas.v.u - ba.a && this.q.m()) {
            this.f(98);
            return true;
        }
        return false;
    }

    public final boolean e(int n, int n2) {
        int n3 = 0;
        while (n3 < this.v.length) {
            if (this.v[n3].m()) {
                this.v[n3].e(n, n2);
            }
            ++n3;
        }
        return false;
    }

    public final boolean f(int n, int n2) {
        int n3 = 0;
        while (n3 < this.v.length) {
            if (this.v[n3].m()) {
                this.v[n3].f(n, n2);
            }
            ++n3;
        }
        return false;
    }

    public final void b(aq aq2, int n2) {
        int n3;
        Object object;
        Object object2;
        aq2 = this;
        this.x = (dm)((op)aq2).r.i(n2);
        Object[] objectArray = null;
        if (((op)aq2).x.a == 2) {
            if (com.mg.sq.a.m != null) {
                objectArray = oi.a(((op)aq2).p.b.c);
            }
        } else {
            String[] stringArray = null;
            Object object3 = ((op)aq2).x.c(((op)aq2).x.c);
            if (((op)aq2).x.b >= 0) {
                n nObj = ((o)object3).a(((op)aq2).x.b); // returns n
                stringArray = new String[] { nObj.a() };
                objectArray = null;
                int[] nArray = null;
                switch (stringArray.length) {
                    case 5: {
                        objectArray = new String[]{"Xem Bang"};
                        nArray = new int[]{10607};
                        break;
                    }
                    case 4: {
                        String s = ((o)object3).b(((op)aq2).x.b, 1); // Use correct signature: (int, int)
                        if (s.charAt(0) == '@') {
                            s = s.substring(1);
                        }
                        if (!s.equals(go.e)) {
                            objectArray = new String[]{"Chat!", "Xem ME"};
                            nArray = new int[]{10609, 10608};
                            break;
                        }
                        objectArray = new String[]{"Xem ME"};
                        nArray = new int[]{10608};
                        break;
                    }
                    case 3: {
                        objectArray = new String[]{"Xem tin", "Chép link"};
                        nArray = new int[]{10611, 10610};
                        break;
                    }
                    case 1: {
                        lo loObj = (lo)((o)object3).a(((op)aq2).x.b); // get lo object
                        if (loObj == null) break;
                        objectArray = new String[]{lo.a(loObj.i), "Gửi tiếp"};
                        nArray = new int[]{10613, 10612};
                        break;
                    }
                }
                if (objectArray != null && objectArray.length > 0) {
                    String[] tempStrArr = new String[objectArray.length + 1];
                    int[] tempIntArr = new int[nArray.length + 1];
                    for (int n4 = 0; n4 < objectArray.length; n4++) {
                        tempStrArr[n4] = (String)objectArray[n4];
                        tempIntArr[n4] = nArray[n4];
                    }
                    tempStrArr[objectArray.length] = "Chép nội dung";
                    tempIntArr[nArray.length] = 10614;
                    objectArray = tempStrArr;
                    nArray = tempIntArr;
                } else {
                    objectArray = new String[]{"Chép nội dung"};
                    nArray = new int[]{10614};
                }
                if (ff.i != null) {
                    String[] tempStrArr = new String[((String[])objectArray).length + 1];
                    int[] tempIntArr = new int[nArray.length + 1];
                    System.arraycopy(objectArray, 0, tempStrArr, 0, ((String[])objectArray).length);
                    System.arraycopy(nArray, 0, tempIntArr, 0, nArray.length);
                    tempStrArr[tempStrArr.length - 1] = "Dán";
                    tempIntArr[tempIntArr.length - 1] = 10606;
                    objectArray = tempStrArr;
                    nArray = tempIntArr;
                }
                br[] brArray = new br[((String[])objectArray).length];
                for (n3 = 0; n3 < brArray.length; n3++) {
                    brArray[n3] = new br(((String[])objectArray)[n3], nArray[n3]);
                }
                objectArray = brArray;
            } else {
                br[] brArray = new br[1];
                brArray[0] = new br("Chép nội dung", 10614);
                objectArray = brArray;
            }
        }
        if (objectArray != null) {
            bs bs2 = new bs();
            bs2.a(new gb(0, 2));
            bs2.b(new gb(1, 3));
            bs2.a((br[])objectArray);
            k sPos = this.s.r(); // Use correct type
            fq fqObj = (fq)this.r.o(n2);
            int menuX = this.r.c() + ((this.r.e() - bs2.e()) / 2); // Rename to avoid duplicate n3
            int menuY = this.r.d() + ((aq)fqObj).d() + fqObj.a();
            if (sPos != null) {
                menuY -= sPos.b;
            }
            if (this.x.b >= 0) {
                menuY += this.x.b().a(this.x.b).e();
            }
            if (menuY + bs2.f() > this.r.d() + this.r.f()) {
                menuY = this.r.d() + this.r.f() - bs2.f();
            } else if (menuY < this.r.d()) {
                menuY = this.r.d();
            }
            bs2.a_(com.mg.bas.v.t, menuY); // Use correct signature (int, int)
            bs2.d(menuX, menuY);
            bs2.a_(1); // Use correct signature (int)
            this.a(bs2);
        }
    }

    public final void a(aq aq2, int n2) {
    }

    public final void a(aq aq2, int n2, int n3) {
        aq2 = (fq)this.r.o(n3);
        if (n2 <= n3) {
            ((fq)aq2).r();
            return;
        }
        ((fq)aq2).q();
    }

    public final aq a(aw object, int n2) {
        dm dmObj = (dm)((aw)object).i(n2);
        fq fqObj = new fq(dmObj, this.r.e());
        return fqObj;
    }

    public final void d(int n2, int n3) {
        if (n2 == 999999223) {
            Object object = (hp)com.mg.sq.a.s().d(999999223);
            switch (n3) {
                case -8881: {
                    boolean bl;
                    if (object == null) break;
                    this.D = this.z = ((hp)object).v();
                    String string = gs.b[this.z];
                    object = this;
                    int n4 = ((op)object).z + 1;
                    if (!com.mg.bas.i.a(string) || n4 > 0) {
                        string = string.trim();
                        // super.a(string, n4); // This line is invalid, comment out or fix as needed
                        if (n4 > 0) {
                            du.a().a(((op)object).p.b().a(), string, null, (short)n4);
                        } else {
                            du.a().a(((op)object).p.b().a(), string, null);
                        }
                        ((op)object).z = -1;
                        bl = true;
                        break;
                    }
                    bl = false;
                    break;
                }
                case -8882: {
                    break;
                }
                case -8883: {
                    this.z = -1;
                }
            }
            ag.b().e(999999223);
            return;
        }
        switch (n3) {
            case -3: {
                if (this.y == null) {
                    this.y = new hp((byte)1);
                    this.y.a(this);
                }
                ag.b().a(this.y, false);
                return;
            }
            case -8881: {
                hp hp2 = this.y;
                if (hp2 != null) {
                    this.q.b(hp2.t());
                }
                com.mg.sq.a.s().a(241224, false);
                return;
            }
            case -8882: {
                com.mg.sq.a.s().a(241224, false);
                return;
            }
            case -1: {
                Object[] objectArray;
                Object object;
                Object object2;
                op op2 = this;
                bs bs2 = new bs();
                bs2.a(new gb(0, 2));
                bs2.b(new gb(1, 3));
                Object object3 = op2.p.b().a();
                if (op2.p.a()) {
                    if (((String)object3).length() >= 4) {
                        object3 = new String[]{"Kết Giao", "Xem", "Đóng"};
                        object2 = new int[]{10603, 10602, 10604};
                    } else {
                        object3 = new String[]{"Kết Giao", "Đóng"};
                        object2 = new int[]{10603, 10604};
                    }
                } else if (((String)object3).length() >= 4) {
                    object3 = new String[]{"Xem", "Đóng"};
                    object2 = new int[]{10602, 10604};
                } else {
                    object3 = new String[]{"Đóng"};
                    object2 = new int[]{10604};
                }
                br br2 = new br("Xem", 10602);
                br2.a(new br[]{new br("Thông tin", 10600), new br("ME", 10601)});
                // Use type-safe arrays for menu labels and actions
                String[] menuLabels = (String[])object3;
                int[] menuActions = (int[])object2;
                if (op2.p != null && op2.l() instanceof fc && ((fc)op2.l()).i(100) && (object = (ol)((fc)op2.l()).h(100)) != null /* && object.p != null && object.p.b() != 2 */ && !op2.p.b().a().equals(go.e)) {
                    String[] newLabels = new String[menuLabels.length + 2];
                    int[] newActions = new int[menuActions.length + 2];
                    System.arraycopy(menuLabels, 0, newLabels, 2, menuLabels.length);
                    System.arraycopy(menuActions, 0, newActions, 2, menuActions.length);
                    newLabels[0] = "Khiêu Chiến";
                    newActions[0] = 99024;
                    newLabels[1] = "Giao dịch";
                    newActions[1] = 99014;
                    menuLabels = newLabels;
                    menuActions = newActions;
                }
                if (oy.g && op2.q.m()) {
                    String[] newLabels = new String[menuLabels.length + 1];
                    int[] newActions = new int[menuActions.length + 1];
                    System.arraycopy(menuLabels, 0, newLabels, 0, menuLabels.length);
                    System.arraycopy(menuActions, 0, newActions, 0, menuActions.length);
                    newLabels[newLabels.length - 1] = "Thêm Kul";
                    newActions[newActions.length - 1] = 10605;
                    menuLabels = newLabels;
                    menuActions = newActions;
                }
                if (ff.i != null) {
                    String[] newLabels = new String[menuLabels.length + 1];
                    int[] newActions = new int[menuActions.length + 1];
                    System.arraycopy(menuLabels, 0, newLabels, 0, menuLabels.length);
                    System.arraycopy(menuActions, 0, newActions, 0, menuActions.length);
                    newLabels[newLabels.length - 1] = "Dán";
                    newActions[newActions.length - 1] = 10606;
                    menuLabels = newLabels;
                    menuActions = newActions;
                }
                br[] brArray = new br[menuLabels.length];
                for (int i = 0; i < brArray.length; i++) {
                    brArray[i] = new br(menuLabels[i], menuActions[i]);
                }
                object = brArray;
                int n5 = bs2.e() > bs2.f() ? bs2.e() : bs2.f();
                bs2.a_(-n5, com.mg.bas.v.u);
                bs2.d(0, com.mg.bas.v.u - ba.a - bs2.f());
                bs2.a((bf)op2);
                op2.a(bs2);
                return;
            }
            case 1: {
                this.t();
                return;
            }
            case 0: {
                this.l.f(95);
                return;
            }
            case -10: {
                ((fc)this.b).a();
            }
        }
    }

    private String B() {
        return this.x.b().b(this.x.b().a(this.x.b).b(), this.x.b);
    }

    public final void a(int n2, int n3, Object object) {
        if (object == null) {
            return;
        }
        Object object2 = (br)object;
        int n4 = this.l.b();
        switch (n3) {
            case 99024: {
                if (this.p == null) break;
                com.mg.sq.a.d(this.p.b().a());
                break;
            }
            case 99014: {
                if (this.p == null) break;
                com.mg.sq.a.p(this.p.b().a());
                break;
            }
            case 10600: {
                if (com.mg.sq.a.m == null || this.p == null) break;
                com.mg.sq.a.s().b(this.p.b().a(), this.i);
                break;
            }
            case 10601: {
                if (com.mg.sq.a.m == null || this.p == null) break;
                com.mg.sq.a.m.a(this.p.b().a(), 0L);
                break;
            }
            case 10602: {
                break;
            }
            case 10603: {
                if (!this.p.a()) break;
                this.p.a(false);
                if (com.mg.sq.a.m != null) {
                    oi.c("12 Sứ Quân Online", this.p.b().a());
                }
                object2 = ag.b().a("Thông tin", "Đã thêm nick này vào danh sách bạn bè!", "Đóng", 2, 1);
                ((am)object2).a(ag.b());
                ag.b().a((al)object2, false);
                break;
            }
            case 10604: {
                this.t.a(this.p);
                break;
            }
            case 10605: {
                this.A();
                break;
            }
            case 10606: {
                this.q.b(ff.i);
                this.s.d(false);
                this.q.d(true);
                break;
            }
            case 10607: {
                object2 = this.B();
                if (com.mg.sq.a.m == null) break;
                oi oi2 = com.mg.sq.a.m;
                oi2.p.a((String)object2, 0L);
                com.mg.sq.a.m.f(true);
                break;
            }
            case 10608: {
                if (n4 == 1) {
                    object2 = this.B();
                    if (object2 != null && ((String)object2).charAt(0) == '@') {
                        object2 = ((String)object2).substring(1);
                    }
                    if (com.mg.sq.a.m == null) break;
                    oi oi3 = com.mg.sq.a.m;
                    oi3.p.a((String)object2, 0L);
                    com.mg.sq.a.m.f(true);
                    break;
                }
                if (com.mg.sq.a.m == null || this.p == null) break;
                com.mg.sq.a.m.a(this.p.b().a(), 0L);
                break;
            }
            case 10609: {
                object2 = this.B();
                if (object2 != null && ((String)object2).charAt(0) == '@') {
                    object2 = ((String)object2).substring(1);
                }
                if (com.mg.sq.a.m == null) break;
                com.mg.sq.a.m.c((String)object2);
                break;
            }
            case 10610: {
                object2 = this.B();
                ff.i = (String)object2;
                break;
            }
            case 10611: {
                object2 = this.B();
                if (com.mg.sq.a.m == null) break;
                Object object3 = object2;
                object2 = this.p.b().a();
                oi oi4 = com.mg.sq.a.m;
                oi4.a((String)object2, (String)object3, true);
                break;
            }
            case 10612: {
                if (this.x == null) break;
                object2 = (lo)this.x.b().a(this.x.b);
                com.mg.sq.a.d("Nhập nick muốn gửi", ((lo)object2).i.a());
                break;
            }
            case 10613: {
                if (this.x == null) {
                    return;
                }
                if (((String)(object2 = ((br)object2).b())).equals("Xem Ảnh")) {
                    if (com.mg.sq.a.m == null) break;
                    object2 = (lo)this.x.b().a(this.x.b);
                    oi oi5 = com.mg.sq.a.m;
                    oi5.q.a(((lo)object2).i.a());
                    break;
                }
                com.mg.sq.a.s().C();
                break;
            }
            case 10614: {
                if (this.x == null) break;
                object2 = this.x.b().i();
                ff.i = (String)object2;
                break;
            }
            case 11399: {
                if (com.mg.sq.a.m == null || com.mg.sq.a.m.b(((br)object2).b())) break;
                com.mg.sq.a.m.b(((br)object2).b(), this.p.b.c);
                break;
            }
            default: {
                if (com.mg.sq.a.m == null) break;
                com.mg.sq.a.m.j(n3);
            }
        }
        this.t();
    }

    public final void a(bs bs2) {
        super.a(bs2);
        this.B = -1L;
    }
}
