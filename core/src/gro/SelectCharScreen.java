package gro;

import java.io.IOException;
import java.util.Vector;

public final class SelectCharScreen extends MainScreen {

    public static String d = "";
    private vdtt_by H;
    private Vector I = new Vector();
    private Vector J = new Vector();
    private int K;
    private int L;
    private int M;
    private int N;
    private Vector O = new Vector();
    private Vector P = new Vector();
    private Vector Q = new Vector();
    private Vector R = new Vector();
    private boolean S;
    private long T;
    private vdtt_ay U;
    private vdtt_ay V;
    private vdtt_ay W;
    private vdtt_ay X;
    private vdtt_ay Y;
    private int Z;
    private int aa;
    private long ab;
    private EntityPanel ac;
    private String[] ad = null;
    private vdtt_ch ae;
    private int af = -1;
    private int ag = -1;
    private int ah = -1;
    private vdtt_es ai = new vdtt_es(460, 0, 0, 1);
    private vdtt_es[] aj = new vdtt_es[]{new vdtt_es(0, 0, 0, -1), new vdtt_es(533, 0, 0, -1), new vdtt_es(534, 0, 0, -1), new vdtt_es(532, 0, 0, -1), new vdtt_es(537, 0, 0, -1), new vdtt_es(603, 0, 0, -1)};
    private int ak = 0;
    private boolean al;
    private static byte am = 29;
    private static byte an = 90;
    private Skill[] ao = new Skill[3];
    private boolean ap;

    public SelectCharScreen() {
        this.setSize(DataCenter.gI().n, DataCenter.gI().o);
        this.V = this.a(5, DataCenter.gI().o - 23, "", this, 4000, 15);
        this.V.setSize(58, 20);
        this.U = this.a(DataCenter.gI().n - this.V.width - 5, this.V.cy, "", this, 2008, -8);
        this.U.setSize(this.V.width, this.V.height);
        this.W = this.a(DataCenter.gI().n / 2 - 28, this.V.cy, Caption.aa, this, 2009, -8);
        this.W.setSize(this.V.width, this.V.height);
        this.H = this.a(DataCenter.gI().n / 2 - 60, this.height - 46, 122, Caption.as, this, 0);
        byte var1 = 12;
        this.H.l = var1;
        this.Z = DataCenter.gI().n / 2 - 85;
        this.Y = this.a(this.Z, DataCenter.gI().o - 110, "", this, 2005, -91);
        short var2 = -360;
        this.Y.J = var2;
        this.aa = DataCenter.gI().n / 2 + 62;
        this.X = this.a(this.aa, DataCenter.gI().o - 110, "", this, 2006, -91);
        this.P.clear();

        int var3;
        for (var3 = 0; var3 < w().length; ++var3) {
            vdtt_ch var4;
            vdtt_ch var5 = var4 = new vdtt_ch(this, (vdtt_cg) null);
            Char var6 = new Char();
            var5.a = var6;
            var4.a.sys = (byte) (var3 + 1);
            var4.a.name = w()[var3];
            var4.a.idCharSys = (byte) var3;
            var4.a.hp = var4.a.hpFull = 1;
            var4.a.status = 0;
            this.P.add(var4);
        }

        GameSrc.gI().setSize(AppListener.gI().inputcanvas.getWidth(), AppListener.gI().inputcanvas.getHeight());
        GameSrc.gI().K();
        CheckVersionScreen.K = true;
        AppListener.gI();
        this.ac = new EntityPanel();
        this.ac.setSize(110, 58);
        if ((var3 = DataCenter.gI().o / 2 - 108) < 10) {
            var3 = 10;
        }

        this.ac.setXY(DataCenter.gI().n / 2 - this.ac.width / 2 + 14, var3);
        this.R = new Vector();
        this.R.addElement(new vdtt_ci(this, DataCenter.gI().n / 2, DataCenter.gI().o - 70, 1));
        this.R.addElement(new vdtt_ci(this, DataCenter.gI().n / 2, DataCenter.gI().o - 70, 2));
        this.R.addElement(new vdtt_ci(this, DataCenter.gI().n / 2, DataCenter.gI().o - 70, 3));
        this.R.addElement(new vdtt_ci(this, DataCenter.gI().n / 2, DataCenter.gI().o - 70, 4));

        for (int var7 = 0; var7 < this.R.size(); ++var7) {
            for (var3 = 0; var3 < 20; ++var3) {
                ((vdtt_ci) this.R.get(var7)).a();
            }
        }

    }

    private static String[] w() {
        return DataCenter.k() ? Caption.BK : Caption.yC;
    }

    public final void b(Message var1) throws IOException {
        byte var2 = var1.reader.dis.readByte();
        this.O.clear();
        this.Q.clear();

        try {
            for (int var3 = 0; var3 < var2; ++var3) {
                vdtt_ch var4;
                vdtt_ch var5 = var4 = new vdtt_ch(this, (vdtt_cg) null);
                Char var6 = new Char(var1.reader.dis.readInt());
                var5.a = var6;
                var4.a.b(var1);
                var4.a.cy = 0;
                var4.a.hp = var4.a.hpFull = 1;
                var4.a.status = 0;
                this.Q.add(var4);
                this.O.add(var4);
            }
        } catch (Exception var7) {
        }

        this.L = 0;
        if (var2 > 0) {
            this.h(this.L);
            vdtt_aa.gI().d(this.S);
        }

        if (this.Q.isEmpty()) {
            this.a(true);
        }

    }

    public final void j() {
    }

    public final void k() {
        this.a(false);
    }

    private void g(int var1) {
        this.ag = 0;
        this.N = this.M = var1;
        this.Q = this.P;
        this.ad = vdtt_dd.c(vdtt_dd.d, w()[var1], this.ac.width + 10);
        vdtt_ch var2;
        if (this.Q != null && this.Q.size() > 0 && this.S && (var2 = (vdtt_ch) this.Q.elementAt(var1)) != null && var2.a != null) {
            switch (var2.a.sys) {
                case 1:
                    this.ao[0] = DataCenter.gI().skill[699].a();
                    this.ao[1] = DataCenter.gI().skill[713].a();
                    this.ao[2] = DataCenter.gI().skill[743].a();
                    break;
                case 2:
                    this.ao[0] = DataCenter.gI().skill[755].a();
                    this.ao[1] = DataCenter.gI().skill[770].a();
                    this.ao[2] = DataCenter.gI().skill[777].a();
                    break;
                case 3:
                    this.ao[0] = DataCenter.gI().skill[811].a();
                    this.ao[1] = DataCenter.gI().skill[825].a();
                    this.ao[2] = DataCenter.gI().skill[844].a();
                    break;
                case 4:
                    this.ao[0] = DataCenter.gI().skill[867].a();
                    this.ao[1] = DataCenter.gI().skill[878].a();
                    this.ao[2] = DataCenter.gI().skill[911].a();
                    break;
                case 5:
                    this.ao[0] = DataCenter.gI().skill[867].a();
                    this.ao[1] = DataCenter.gI().skill[926].a();
                    this.ao[2] = DataCenter.gI().skill[911].a();
            }

            if (DataCenter.k()) {
                for (int var3 = 0; var3 < this.ao.length; ++var3) {
                    this.ao[var3] = DataCenter.gI().skill[854].a();
                }
            }

            boolean var5 = true;
            if (var2.e != null) {
                Object var4 = null;
                var2.e.m.aU = (vdtt_if) var4;
                var2.e.m.be.clear();
                var2.e.n.clear();
                var2.e.I.clear();
                var2.e = null;
            }

            this.ag = 0;
            this.ab = 0L;
            var2.f = 1;
            var2.e = new vdtt_bt(-this.cx, -this.cy, this.width, this.height, this, this.ao[1].a(), var2.a);
            var2.e.a(DataCenter.gI().n / 2, DataCenter.gI().o - 61);
        }

    }

    private void h(int var1) {
        this.ah = am + 5;
        this.L = this.N = var1;
    }

    public final void b(int var1, Object var2, vdtt_x var3) {
        if (this.af < 0) {
            switch (var1) {
                case 2005:
                    vdtt_aa.gI().n();
                    this.ag = 0;
                    this.ab = 0L;
                    if (this.S) {
                        --this.M;
                        if (this.M < 0) {
                            this.M = this.Q.size() - 1;
                        }

                        this.g(this.M);
                    } else {
                        --this.L;
                        if (this.L < 0) {
                            this.L = this.Q.size() - 1;
                        }

                        this.h(this.L);
                    }

                    ((vdtt_ch) this.Q.get(this.N)).a.aE = 3;
                    vdtt_aa.gI().d(this.S);
                    return;
                case 2006:
                    vdtt_aa.gI().n();
                    this.ag = 0;
                    this.ab = 0L;
                    if (this.S) {
                        ++this.M;
                        if (this.M >= this.Q.size()) {
                            this.M = 0;
                        }

                        this.g(this.M);
                    } else {
                        ++this.L;
                        if (this.L >= this.Q.size()) {
                            this.L = 0;
                        }

                        this.h(this.L);
                    }

                    ((vdtt_ch) this.Q.get(this.N)).a.aE = 2;
                    ((vdtt_ch) this.Q.get(this.N)).d = 0L;
                    vdtt_aa.gI().d(this.S);
                    return;
                case 2008:
                    if (this.S) {
                        this.v();
                        return;
                    }

                    if (this.O.size() > 0) {
                        this.x();
                        return;
                    }

                    this.ag = 0;
                    this.ab = 0L;
                    this.af = this.ah = -1;
                    this.S = true;
                    this.g(Utlis.a(this.P.size()));
                    vdtt_aa.gI().d(this.S);
                    vdtt_aa.gI().p();
                    return;
                case 2009:
                    this.x();
                    return;
                case 4000:
                    this.a(false);
                    return;
            }
        }

    }

    private void a(boolean var1) {
        this.S = var1;
        if (var1) {
            vdtt_aa.gI().u();
            vdtt_aa.gI().p();
            vdtt_bt.K = null;
            this.g(Utlis.a(this.P.size()));
        } else {
            this.b((String) Caption.m).f.clear();
            CheckVersionScreen.J = true;
            DataCenter.gI().aP = true;
            AppListener.gI().f = 50;
            vdtt_aa.gI().u();
        }

    }

    public final void b(int var1, Object var2) {
    }

    public final void b(Graphics var1) {
        if (AppListener.gI().f > 0) {
            --AppListener.gI().f;
            if (AppListener.gI().f == 0) {
                DataCenter.gI().g();
                return;
            }
        }

        mImage var2;
        try {
            if (!DataCenter.m()) {
                var2 = (mImage) AppListener.e.get(1);
                var1.a(var2, 0, 0, var2.c, var2.d, 0, 0 - this.K, 0, DataCenter.gI().n * DataCenter.gI().r, DataCenter.gI().o * DataCenter.gI().r, 0);
                var1.a(var2, 0, 0, var2.c, var2.d, 0, DataCenter.gI().n - this.K, 0, DataCenter.gI().n * DataCenter.gI().r, DataCenter.gI().o * DataCenter.gI().r, 0);
            } else {
                var2 = (mImage) AppListener.e.get(1);
                var1.a(var2, 0, 0, var2.c, var2.d, 0, 0, 0, DataCenter.gI().n * DataCenter.gI().r, DataCenter.gI().o * DataCenter.gI().r, 0);
            }
        } catch (Exception var12) {
        }

        int var3;
        for (var3 = 0; var3 < this.J.size(); ++var3) {
            ((vdtt_es) this.J.get(var3)).paintTop(var1);
        }

        for (var3 = 0; var3 < this.I.size(); ++var3) {
            ((vdtt_eo) this.I.get(var3)).paintTop(var1);
        }

        int var4;
        if (!DataCenter.k()) {
            if ((var2 = (mImage) AppListener.e.get(2)) != null) {
                if (DataCenter.k()) {
                    var1.c(-150.0F);
                    var1.a(var2, 0, 0, var2.c, var2.d, 0, DataCenter.gI().n / 2, DataCenter.gI().o + 32, var2.c * DataCenter.gI().r / 4, var2.d * DataCenter.gI().r / 4, 33);
                    var1.r();
                } else {
                    var1.a(var2, 0, 0, var2.c, var2.d, 0, DataCenter.gI().n / 2, DataCenter.gI().o + 32, var2.c * DataCenter.gI().r / 4, var2.d * DataCenter.gI().r / 4, 33);
                }
            }

            for (var4 = 0; var4 < this.R.size(); ++var4) {
                vdtt_ci var5 = (vdtt_ci) this.R.get(var4);
                Graphics var6 = var1;
                vdtt_ci var7 = var5;

                try {
                    mImage var8 = null;
                    int var9 = 0;
                    int var10 = 0;
                    switch (var7.d) {
                        case 1:
                            var9 = (var8 = (mImage) AppListener.e.get(3)).c / 4;
                            var10 = var8.d / 4;
                            break;
                        case 2:
                            var9 = (var8 = (mImage) AppListener.e.get(4)).c / 4;
                            var10 = var8.d / 4;
                            break;
                        case 3:
                            var9 = (var8 = (mImage) AppListener.e.get(5)).c / 4;
                            var10 = var8.d / 4;
                            break;
                        case 4:
                            var9 = (var8 = (mImage) AppListener.e.get(6)).c / 4;
                            var10 = var8.d / 4;
                    }

                    var6.a(var8, 0, 0, var8.c, var8.d, 0, (int) var7.a, (int) var7.b, var9 * DataCenter.gI().r, var10 * DataCenter.gI().r, 33);
                } catch (Exception var11) {
                }
            }

            this.ai.paintTop(var1);
        }

        if (this.S || !DataCenter.k()) {
            if (this.N >= 0 && this.N < this.Q.size()) {
                var3 = DataCenter.gI().n / 2;
                var4 = DataCenter.gI().o - 61;
                vdtt_ch var13;
                (var13 = (vdtt_ch) this.Q.get(this.N)).a.setXY(var3, var4);
                this.ai.setXY(var3, var4 - 30);
                this.aj[var13.a.sys].setXY(var3 - 1, var4);
                if (var13.e != null) {
                    var13.e.a(var3, var4);
                    var13.e.b(var1);
                } else {
                    if (!var13.c) {
                        var13.c = true;
                        var13.a.paintTop(var1);
                        return;
                    }

                    if (DataCenter.k() || this.af >= -1 && this.af < 6) {
                        var13.a.paintTop(var1);
                    } else if (this.af < 12 && !this.ai.q()) {
                        this.ai.n();
                        this.ai.paintTop(var1);
                    }

                    if (var13.b != null && !var13.b.q() && this.ag > 20 && this.ag < an && !DataCenter.k()) {
                        var13.b.paintTop(var1);
                    }

                    if (this.ah >= 5 && this.ah <= am && !DataCenter.k()) {
                        this.aj[var13.a.sys].paintTop(var1);
                    }
                }

                if (!this.S) {
                    vdtt_dd.b(vdtt_dd.d, var1, var13.a.name, var3, var13.a.cy - 66, 2, -1, -16777216);
                    if (var13.a.exp > 0L) {
                        if (var13.a.J == 53) {
                            var13.d += var13.a.exp / 30L;
                            if (var13.d > var13.a.exp) {
                                var13.d = var13.a.exp;
                            }
                        }

                        vdtt_dd.b(vdtt_dd.d, var1, Caption.tW + " " + Char.a(var13.d), var3, var13.a.cy - 76, 2, -2560, -16777216);
                    }
                } else if (!DataCenter.k()) {
                    vdtt_cz.a(var1, 54, 0, this.ac.cx - 38, this.ac.cy - 1, 0);
                    var3 = this.ac.cx + 5;
                    var4 = this.ac.cy + 8;

                    for (int var14 = 0; var14 < this.ad.length; ++var14) {
                        vdtt_dd.a((vdtt_dd) vdtt_dd.b, (Graphics) var1, this.ad[var14], var3, var4 + var14 * 10, 0, -4391166, 0);
                    }

                    if (!DataCenter.k() && (this.ag < an || this.ag > an + 60 || DataCenter.gI().h % 16 < 8)) {
                        vdtt_dd.a((vdtt_dd) vdtt_dd.b, (Graphics) var1, Caption.sF + " " + Utlis.c(this.ab), var3, 1 + var4 + this.ad.length * 10, 0, -4391166, 0);
                    }
                }
            }

            if (EntityPanel.z) {
                vdtt_dd.a(vdtt_dd.e, var1, Caption.uM, DataCenter.gI().n / 2, DataCenter.gI().o - Utlis.n(52), 2, -2560, 2, 1);
            }

            vdtt_aa.gI().a(-1);
        }

    }

    public final void c(int var1, int var2) {
        try {
            super.c(var1, var2);
            if (this.al && !this.S) {
                if (this.ak == 0) {
                    this.ak = var1;
                } else {
                    vdtt_ch var3;
                    if (Utlis.b(var1 - this.ak) > 10 && (var3 = (vdtt_ch) this.Q.get(this.N)) != null) {
                        var3.a.aE = (byte) (this.ak < var1 ? 2 : 3);
                    }
                }
            }
        } catch (Exception var4) {
        }

    }

    public final void a(int var1, int var2) {
        super.a(var1, var2);

        try {
            vdtt_ch var3;
            if ((var3 = (vdtt_ch) this.Q.get(this.N)) == null || var3.a == null) {
                this.al = false;
                return;
            }

            this.al = Utlis.a(var3.a.minX(), var3.a.minY(), var3.a.maxX(), var3.a.cy, var1, var2);
        } catch (Exception var4) {
        }

    }

    public final void b(int var1, int var2) {
        super.b(var1, var2);
        this.ak = 0;
    }

    public final void a_() {
        int var1;
        try {
            if (DataCenter.k() && this.O.size() == 1) {
                this.U.b(true);
                this.V.b(true);
                this.W.b(true);
                this.X.b(true);
                this.Y.b(true);
                this.H.b(true);
                if (!this.ap) {
                    this.f(0);
                    this.ap = true;
                }

                return;
            }

            long var2 = Utlis.a();
            if (DataCenter.aD > 0 && var2 - this.T > 5000L) {
                this.T = var2;
                if (Char.gI().name.length() == 0 && this.Q.size() > 0) {
                    DataCenter.aD = 2;
                    this.f(0);
                } else {
                    for (var1 = 0; var1 < this.Q.size(); ++var1) {
                        if (((vdtt_ch) this.Q.get(var1)).a.name.toLowerCase().equals(Char.gI().name.toLowerCase())) {
                            DataCenter.aD = 2;
                            this.f(var1);
                            break;
                        }
                    }
                }
            }
        } catch (Exception var12) {
        }

        ++this.K;
        if (this.K == DataCenter.gI().n) {
            this.K = 0;
        }

        for (var1 = 0; var1 < this.R.size(); ++var1) {
            ((vdtt_ci) this.R.get(var1)).a();
        }

        if (!DataCenter.m()) {
            if (DataCenter.gI().h % 9 == 0 && Utlis.a((int) 2) == 0) {
                this.J.add(new vdtt_es(Utlis.a(new int[]{502, 505, 506}), Utlis.a(DataCenter.gI().n), Utlis.a(DataCenter.gI().o)));
            }

            if (DataCenter.gI().h % 10 == 0 && Utlis.a((int) 3) == 0) {
                this.I.add(new vdtt_eo(78, DataCenter.gI().n + Utlis.a(DataCenter.gI().n), Utlis.a((int) this.height), new vdtt_ey(-Utlis.a(DataCenter.gI().n), Utlis.a((int) this.height)), -1, -1, false, this.I, new Vector()));
            }

            for (var1 = this.J.size() - 1; var1 >= 0; --var1) {
                vdtt_es var13;
                (var13 = (vdtt_es) this.J.get(var1)).n();
                --var13.cx;
                if (var13.q()) {
                    this.J.remove(var13);
                }
            }

            for (var1 = this.I.size() - 1; var1 >= 0; --var1) {
                vdtt_eo var14;
                (var14 = (vdtt_eo) this.I.get(var1)).o();
                if (var14.n()) {
                    this.I.remove(var14);
                }
            }
        }

        this.H.b(!this.S);
        vdtt_ay var3;
        String var15;
        if (this.S) {
            this.W.b(true);
            var15 = Caption.sE;
            this.V.l = var15;
            var15 = Caption.aq;
            this.U.l = var15;
            if (Utlis.b(this.width / 2 + 2 - this.U.cx) < 50) {
                this.U.cx = (short) (this.width / 2 + 2);
            } else if (this.U.cx < this.width / 2 + 2) {
                var3 = this.U;
                var3.cx = (short) (var3.cx + 50);
            } else if (this.U.cx > this.width / 2 + 2) {
                var3 = this.U;
                var3.cx = (short) (var3.cx - 50);
            }

            if (Utlis.b(this.width / 2 - this.V.width - 2 - this.V.cx) < 50) {
                this.V.cx = (short) (this.width / 2 - this.V.width - 2);
            } else if (this.V.cx < this.width / 2 - this.V.width - 2) {
                var3 = this.V;
                var3.cx = (short) (var3.cx + 50);
            } else if (this.V.cx > this.width / 2 - this.V.width - 2) {
                var3 = this.V;
                var3.cx = (short) (var3.cx - 50);
            }

            if (DataCenter.k()) {
                this.V.b(true);
                this.U.setXY((short) (DataCenter.gI().n / 2 - this.U.width / 2), this.U.cy);
            }
        } else {
            var15 = Caption.sE;
            this.V.l = var15;
            if (this.O.size() > 0) {
                var15 = Caption.aa;
                this.U.l = var15;
                this.W.b(true);
            } else {
                var15 = Caption.V;
                this.U.l = var15;
                this.W.b(this.Q.isEmpty());
            }

            int var4 = 5 + AppListener.gI().m / 2;
            if (Utlis.b(this.width - this.V.width - var4 - this.U.cx - AppListener.gI().m / 2) < 50) {
                this.U.cx = (short) (this.width - this.V.width - var4);
            } else if (this.U.cx < this.width - this.V.width - var4 - AppListener.gI().m / 2) {
                var3 = this.U;
                var3.cx = (short) (var3.cx + 50);
            } else if (this.U.cx > this.width - this.V.width - var4 - AppListener.gI().m / 2) {
                var3 = this.U;
                var3.cx = (short) (var3.cx - 50);
            }

            if (Utlis.b(var4 - this.V.cx) < 50) {
                this.V.cx = (short) var4;
            } else if (this.V.cx < var4) {
                var3 = this.V;
                var3.cx = (short) (var3.cx + 50);
            } else if (this.V.cx > var4) {
                var3 = this.V;
                var3.cx = (short) (var3.cx - 50);
            }

            this.N = this.L;
            this.Q = this.O;
        }

        this.Y.setXY(this.Z - DataCenter.gI().h / 3 % 3, this.Y.cy);
        this.X.setXY(this.aa + DataCenter.gI().h / 3 % 3, this.X.cy);
        if (this.Q.size() > 1) {
            this.X.b(false);
            this.Y.b(false);
        } else {
            this.X.b(true);
            this.Y.b(true);
        }

        for (var1 = 0; var1 < this.aj.length; ++var1) {
            this.aj[var1].n();
            if (DataCenter.gI().h % 2 == 0) {
                this.aj[var1].n();
            }
        }

        for (var1 = 0; var1 < this.Q.size(); ++var1) {
            vdtt_ch var16;
            if ((var16 = (vdtt_ch) this.Q.get(var1)).e != null) {
                try {
                    if (var16.equals(var16.g.Q.get(var16.g.N))) {
                        var16.e.a_();
                    }
                } catch (Exception var11) {
                }
            }

            if (var16.a != null) {
                if (var16.b == null && !DataCenter.k()) {
                    var16.b = var16.g.aj[var16.a.sys].o();
                    var16.b.setXY(var16.a.cx - 1, var16.a.cy);
                }

                var16.a.K();
                var16.a.cy = (short) (DataCenter.gI().o - 61);
                if (DataCenter.gI().h % 5 == 0 && var16.g.ag < Integer.MAX_VALUE && (var16.g.af >= 0 || var16.g.af < -1)) {
                    ++var16.g.af;
                }

                byte var5;
                if (var16.g.af >= 0) {
                    if (!DataCenter.k()) {
                        var5 = 57;
                        var16.a.J = (short) var5;
                        if (var16.g.af == 15) {
                            var16.g.f(var16.g.L);
                        }
                    } else {
                        var16.g.f(var16.g.L);
                    }
                } else if (var16.g.ah >= 0 && !DataCenter.k()) {
                    if (DataCenter.gI().h % 5 == 0) {
                        --var16.g.ah;
                    }

                    if (var16.g.ah > am) {
                        var5 = 52;
                        var16.a.J = (short) var5;
                    } else if (var16.g.ah > 5) {
                        var5 = 53;
                        var16.a.J = (short) var5;
                    } else if (var16.g.ah > 0) {
                        vdtt_aa.gI().u();
                    }
                } else {
                    long var6;
                    if (var16.g.S) {
                        if (var16.g.ag >= 0) {
                            SelectCharScreen var8;
                            if (!DataCenter.k()) {
                                short var9;
                                Char var10;
                                if (var16.g.ag < 5) {
                                    var10 = var16.a;
                                    var9 = (short) (DataCenter.gI().h / 5 % 6);
                                    var10.J = var9;
                                } else if (var16.g.ag < 10) {
                                    var5 = 52;
                                    var16.a.J = (short) var5;
                                } else if (var16.g.ag < an) {
                                    var8 = var16.g;
                                    var6 = var16.g.ab + (long) Utlis.a(0, 200000000);
                                    var8.ab = var6;
                                    var5 = 41;
                                    var16.a.J = (short) var5;
                                } else {
                                    var10 = var16.a;
                                    var9 = (short) (6 + DataCenter.gI().h / 5 % 6);
                                    var10.J = var9;
                                    vdtt_aa.gI().u();
                                }
                            } else if (var16.g.ag < an) {
                                var8 = var16.g;
                                var6 = var16.g.ab + (long) Utlis.a(0, 200000000);
                                var8.ab = var6;
                            }

                            if (DataCenter.gI().h % 5 == 0 && var16.g.ag < Integer.MAX_VALUE) {
                                ++var16.g.ag;
                            }
                        }
                    } else {
                        var6 = 0L;
                        var16.g.ab = var6;
                        boolean var17 = false;
                        var16.g.ag = 0;
                    }
                }

                var16.a.bd.clear();
                var16.a.bd.addAll(var16.a.aa());
            }

            if (var16.b != null) {
                var16.b.n();
            }
        }

    }

    public final void c() {
    }

    public final void a(vdtt_hi var1, int var2, int var3) {
        switch (var1.b) {
            case 3001:
                this.x();
            default:
        }
    }

    public final Vector g() {
        Vector var1 = new Vector();
        if (!this.S) {
            if (this.N >= 0 && this.N < this.Q.size()) {
                vdtt_ch var2 = (vdtt_ch) this.Q.get(this.N);
                var1.addElement(new vdtt_hi(3001, var2.a.cx - 20, var2.a.cy - 60, var2.a.cx + 20, var2.a.cy, (vdtt_hp) null, this, var2));
            }
        } else if (this.ac != null) {
            DataCenter.k();
        }

        return var1;
    }

    public final void v() {
        Message var1 = null;
        boolean var2 = false;

        label93:
        {
            try {
                var2 = true;

                String var3;
                for (var3 = this.H.i().trim(); var3.contains("  "); var3 = var3.replaceAll("  ", " ")) {
                }

                this.H.a(var3);
                (var1 = Message.b((byte) -128)).writeByte(((vdtt_ch) this.Q.get(this.N)).a.idCharSys);
                var1.writeUTF(var3);
                var1.send();
                this.i();
                var2 = false;
                break label93;
            } catch (Exception var7) {
                Utlis.a(var7);
                var2 = false;
            } finally {
                if (var2 && var1 != null) {
                    var1.close();
                }

            }

            if (var1 != null) {
                var1.close();
                return;
            }

            return;
        }

        var1.close();
    }

    public final void f(int var1) {
        this.af = -50;
        Message var2 = null;

        while (true) {
            boolean var3 = false;

            try {
                var3 = true;
                DataCenter.gI();
                if (!DataCenter.a()) {
                    Thread.sleep(100L);
                    continue;
                }

                (var2 = Message.d((byte) -127)).writeByte(var1);
                var2.send();
                this.i();
                var3 = false;
                break;
            } catch (Exception var8) {
                Utlis.a(var8);
                var3 = false;
            } finally {
                if (var3 && var2 != null) {
                    var2.close();
                }

            }

            if (var2 != null) {
                var2.close();
                return;
            }

            return;
        }

        var2.close();
    }

    private void x() {
        this.ae = (vdtt_ch) this.O.get(this.L);
        this.af = 0;
        vdtt_aa.gI().n();
        vdtt_aa.gI().t();
    }
}
