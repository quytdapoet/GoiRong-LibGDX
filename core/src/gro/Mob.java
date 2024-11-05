package gro;

import java.io.IOException;
import java.util.Vector;

public final class Mob extends Entity {

    public short id;
    public byte l;
    public byte he;
    public byte levelBoss;
    public byte rangeMove;
    public byte p = -1;
    public short H;
    public short I;
    public short J;
    public short K;
    public short L;
    public short M = 0;
    public short N = 0;
    public short O = 100;
    public short P;
    public short Q;
    public short R = 0;
    public boolean S;
    public boolean paintMiniMap;
    public int hp;
    public int hpFull;
    public int level;
    public Vector X = new Vector();
    public Char Y;
    public int Z;
    public Vector aa = new Vector();
    public int ab;
    public int ac;
    public int ad;
    public boolean ae;
    public boolean af;
    public boolean ag;
    public boolean ah;
    public boolean ai;
    public boolean aj;
    public boolean ak;
    public boolean al;
    public boolean am;
    public String an;
    public vdtt_ho ao;
    public boolean ap = true;
    public int aq;
    public int ar;
    public boolean as;
    public boolean at = true;
    public int au;
    public int av;
    public boolean aw = true;
    public Char ax;
    public int ay;
    public int az = Integer.MIN_VALUE;
    public int aA;
    public int aB;

    public Mob(int var1) {
        this.id = (short) var1;
        this.setSize(this.getMobTemplate().width, this.getMobTemplate().height);
    }

    public final void b(Message var1) throws IOException {
        if (Utlis.b()) {
            this.y();
        }

        this.idEntity = var1.readShort();
        this.paintMiniMap = var1.readBoolean();
        this.an = var1.reader.readUTF();
        this.id = var1.readShort();
        this.c(var1.readShort(), var1.readShort());
        this.setSize(this.getMobTemplate().width, this.getMobTemplate().height);
        this.level = var1.readShort();
        this.he = var1.readByte();
        this.status = var1.readByte();
        this.hp = var1.readInt();
        this.hpFull = var1.readInt();
        this.levelBoss = var1.readByte();
        byte var2 = var1.readByte();

        for (int var3 = 0; var3 < var2; ++var3) {
            Effect var4 = new Effect(var1.readShort(), var1.readInt(), var1.readLong(), var1.readInt(), this);
            this.aa.add(var4);
        }

        if (Utlis.b()) {
            this.dir = 3;
        } else {
            this.dir = 2;
        }

        this.rangeMove = this.getMobTemplate().speedMoveByte;
        if (this.status != 4) {
            this.status = 2;
            this.C();
        }

    }

    public final void m() {
        XYEntity var1;
        if (this.getMobTemplate().type != 3 && this.getMobTemplate().type != 13 && this.levelBoss != 8 && (var1 = Char.b(this.cx, this.cy)) != null) {
            this.cy = var1.cy;
        }

        this.c(this.cx, this.cy);
    }

    public final void b(int var1, int var2) {
        int var3 = var1 - this.H;
        int var4 = var2 - this.I;
        this.H = this.P = (short) var1;
        this.I = this.Q = (short) var2;
        this.cx = (short) (this.cx + var3);
        this.cy = (short) (this.cy + var4);
        this.J = (short) (this.J + var3);
        this.K = (short) (this.K + var4);
    }

    public final void c(int var1, int var2) {
        this.cx = this.H = this.J = this.P = (short) var1;
        this.cy = this.I = this.K = this.Q = (short) var2;
    }

    private void y() {
        if (!this.o() && !this.z()) {
            this.status = 2;
        } else {
            this.status = 0;
        }

    }

    public final boolean n() {
        return this.getMobTemplate().type == 9 || this.getMobTemplate().type == 11;
    }

    public final boolean o() {
        return this.getMobTemplate().type == 2 || this.w() || this.getMobTemplate().type == 8;
    }

    private boolean z() {
        return this.getMobTemplate().type == 11 || this.getMobTemplate().type == 9;
    }

    public final MobTemplate getMobTemplate() {
        if (GameSrc.gI().getMapTemplate().type == 15 && GameSrc.gI().cs > 20) {
            return DataCenter.gI().mobTemplate[242 + GameSrc.gI().cs / 20];
        } else if (this.levelBoss == 8) {
            if (DataCenter.gI().mobTemplate[this.id].type == 3) {
                MobTemplate var1 = DataCenter.gI().mobTemplate[260 + this.idEntity % 2];
                XYEntity var2;
                if ((var2 = Char.b(this.H, this.I)) != null) {
                    this.status = 2;
                    this.cy = this.K = var2.cy;
                }

                return var1;
            } else {
                return DataCenter.gI().mobTemplate[260 + this.idEntity % 2];
            }
        } else {
            return DataCenter.gI().mobTemplate[this.id];
        }
    }

    public final int minX() {
        return this.cx - this.width / 2;
    }

    public final int maxX() {
        return this.cx + this.width / 2;
    }

    public final int minY() {
        return this.cy - this.height;
    }

    public final int maxY() {
        return this.cy;
    }

    public final int q() {
        return this.cy + this.height;
    }

    public final void r() {
        if (this.ad > 0) {
            --this.ad;
            if (this.ad == 0) {
                this.M();
            }
        }

        if (this.aA > 1) {
            --this.aA;
            if (this.aA <= 1) {
                this.aA = 0;
            }
        }

        if (this.as) {
            this.as = false;
            this.m();
        }

        if (this.ac > 0) {
            --this.ac;
        }

        if (this.ar > 0) {
            --this.ar;
        }

        try {
            try {
                if (this.aw && this.status != 4 && this.status != 5 && this.N()) {
                    if (this.cx < this.E() || this.J < this.E()) {
                        this.cx = this.J = this.P = this.E();
                    }

                    if (this.cx > this.F() || this.J > this.F()) {
                        this.cx = this.J = this.P = this.F();
                    }

                    if (this.cy < this.G() || this.K < this.G()) {
                        this.cy = this.K = this.Q = this.G();
                    }

                    if (this.cy > this.H() || this.K > this.H()) {
                        this.cy = this.K = this.Q = this.H();
                    }
                }
            } catch (Exception var5) {
            }

            this.ab = 1;
            this.ae = this.af = this.ag = this.ah = this.ai = this.aj = this.ak = this.al = this.am = false;
            if (this.ao != null && this.ao.a(this.k(), this.cy - this.height + 2)) {
                this.ao = null;
            }

            boolean var1 = false;

            int var2;
            for (var2 = 0; var2 < this.aa.size(); ++var2) {
                Effect var3;
                switch ((var3 = (Effect) this.aa.elementAt(var2)).id) {
                    case 8:
                        this.ae = true;
                        this.ab = 2;
                        break;
                    case 9:
                        this.af = true;
                        this.ab = 3;
                        break;
                    case 10:
                        this.ag = true;
                        this.ab = 4;
                        break;
                    case 11:
                        this.ah = true;
                        this.ab = 2;
                        break;
                    case 12:
                        var1 = true;
                        this.aj = true;
                        break;
                    case 35:
                    case 36:
                    case 161:
                        var1 = true;
                        break;
                    case 38:
                        var1 = true;
                        this.ai = true;
                        break;
                    case 73:
                        this.ab = 3;
                        break;
                    case 76:
                        this.ab = 2;
                        break;
                    case 109:
                    case 146:
                    case 197:
                        this.ak = true;
                        var1 = true;
                        break;
                    case 152:
                        this.al = true;
                        break;
                    case 170:
                        this.am = true;
                }

                var3.a((Entity) this);
            }

            if (this.hp <= 0 && !this.isDie()) {
                this.M();
            }

            if (this.Z > 0) {
                --this.Z;
                if (this.Z == 1) {
                    this.status = 0;
                }
            }

            switch (this.status) {
                case 0:
                    if (this.getMobTemplate().type == 6) {
                        if (Utlis.a((int) 300) == 0) {
                            this.ap = false;
                            this.status = 2;
                            this.c = 0;
                        }
                    } else if (Utlis.a((int) 80) == 0 || this.ap) {
                        this.ap = false;
                        this.y();
                    }
                    break;
                case 1:
                    short var7 = this.cx;
                    short var4 = this.cy;
                    if (this.getMobTemplate().a != null && this.c < this.getMobTemplate().a[1].length - 1) {
                        this.cx = (short) (this.cx + this.au);
                        if (this.getMobTemplate().type == 3) {
                            this.cy = (short) (this.cy + this.av);
                        }
                    } else if (this.z()) {
                        this.status = 2;
                    } else {
                        this.y();
                    }

                    if (this.getMobTemplate().type == 7) {
                        if (var7 == this.cx) {
                            this.cx = (short) (this.cx + this.au);
                        }

                        if (this.cx < 16) {
                            this.cx = 16;
                        } else if (this.cx > GameSrc.gI().maxX - 16) {
                            this.cx = (short) (GameSrc.gI().maxX - 16);
                        }
                    }

                    if (var7 != this.cx || var4 != this.cy) {
                        this.a(var7, var4);
                    }

                    if (this.getMobTemplate().type == 7) {
                        this.status = 0;
                    }
                    break;
                case 2:
                    if (!var1 && (this.ab == 0 || DataCenter.gI().h % this.ab == 0)) {
                        this.C();
                    }

                    this.P = this.cx;
                    this.Q = this.cy;
                    if (!this.N() && Char.b(this.cx, this.cy) != null) {
                        this.status = 7;
                    }
                    break;
                case 3:
                    this.B();
                case 4:
                case 6:
                default:
                    break;
                case 5:
                    this.M();
                    break;
                case 7:
                    if (!var1 && (this.ab == 0 || DataCenter.gI().h % this.ab == 0)) {
                        this.C();
                    }

                    this.P = this.cx;
                    this.Q = this.cy;
                    if (Char.b(this.cx, this.cy) == null) {
                        this.status = 2;
                    }
            }

            if (this.getMobTemplate().type != 3 && this.getMobTemplate().type != 13 && this.getMobTemplate().type != 4 && this.N() && this.status != 5 && this.status != 4) {
                this.cy = this.I;
                this.Q = this.cy;
            }

            if (this.status == 5 || this.status == 4) {
                for (int var8 = this.X.size() - 1; var8 >= 0; --var8) {
                    ItemMap var9;
                    (var9 = (ItemMap) this.X.elementAt(var8)).a(var9.l, var9.m, this.k(), this.l());
                    this.X.remove(var9);
                    GameSrc.gI().vItemMap.addElement(var9);
                }
            }

            if (this.status != 5 && this.status != 1 && this.status != 3 && this.getMobTemplate().type != 7 && this.o()) {
                this.cx = this.H;
                this.cy = this.I;
            }

            if (!this.ai && !this.ak && (this.ab == 0 || DataCenter.gI().h % this.ab == 0)) {
                this.a(var1);
            }

            XYEntity var10;
            if ((var2 = this.I()) > 0) {
                if (this.ax == null) {
                    this.ax = new Char();
                    this.ax.hp = this.ax.hpFull = 1;
                    this.ax.status = 0;
                    switch (this.id) {
                        case 75:
                        case 80:
                        case 201:
                            this.ax.br = true;
                    }
                }

                var10 = Char.b(this.cx, this.cy);
                if (this.ax.aU == null && this.ay > 0 && (var10 != null || Utlis.b(this.cy - this.I) > 100) && this.ay < 20) {
                    this.ay = 0;
                    GameSrc.gI().au.add(new vdtt_es(460, this.cx, this.cy - 30, 1));
                    this.ac = 20;
                    if (var10 != null) {
                        this.setXY(this.cx, var10.cy);
                    }
                }

                this.ax.setXY(this.cx, this.cy);
                if (this.ay > 0 && this.status == 2) {
                    this.ax.status = 0;
                } else {
                    this.ax.status = this.status;
                }

                if (this.ac > 0) {
                    if (this.ac == 10) {
                        GameSrc.gI().au.add(new vdtt_es(460, this.cx, this.cy - 30, 1));
                    }
                } else {
                    this.ax.B();
                    this.ax.bd.clear();
                    DataCenter.gI().z[var2].a(this.ax.bd, false);
                }

                if (var10 != null) {
                    this.ax.aD = 3;
                }
            }

            if (this.az == Integer.MIN_VALUE) {
                this.az = this.cy;
                if (this.getMobTemplate().type != 3 && this.getMobTemplate().type != 13 && this.getMobTemplate().type != 7 && this.getMobTemplate().type != 8 && this.levelBoss == 0) {
                    if ((var10 = Char.b(this.cx, this.cy - 5)) != null) {
                        this.az = var10.cy;
                    }

                    for (int var11 = 0; var11 < 10 && GameSrc.gI().V.a(this.cx, this.az); ++var11) {
                        --this.az;
                    }
                }
            }
        } catch (Exception var6) {
            Utlis.a(var6);
        }

    }

    private void a(short var1, short var2) {
        if (this.cx < this.H - this.getMobTemplate().speedMove + 1) {
            this.cx = (short) (this.H - this.getMobTemplate().speedMove + 1);
        } else if (this.cy < this.I - this.getMobTemplate().speedMove) {
            this.cy = (short) (this.I - this.getMobTemplate().speedMove);
        } else if (this.cx > this.H + this.getMobTemplate().speedMove - 1) {
            this.cx = (short) (this.H + this.getMobTemplate().speedMove - 1);
        } else if (this.cy > this.I + this.getMobTemplate().speedMove) {
            this.cy = (short) (this.I + this.getMobTemplate().speedMove);
        }

        if (this.getMobTemplate().type != 3 && Char.b(this.cx, this.cy) != null || this.ax != null && this.ax.L()) {
            this.cx = var1;
            this.cy = var2;
        }

        this.P = this.cx;
        this.Q = this.cy;
    }

    private void A() {
        if (this.ag) {
            ++this.f;
            if (this.f >= 20) {
                this.f = 0;
            }
        }

    }

    private void B() {
        try {
            if (this.ax == null && !this.o() && this.R != 3) {
                if (this.S) {
                    if (this.R == 0) {
                        this.N = (short) (this.N + 2);
                        this.cx += this.N;
                        if (this.N >= 4) {
                            this.R = 1;
                            return;
                        }
                    } else if (this.R == 1) {
                        this.N = (short) (this.N - 2);
                        this.cx += this.N;
                        if (this.N < -3) {
                            this.R = 2;
                            return;
                        }
                    } else if (this.R == 2) {
                        ++this.N;
                        if (this.cx + this.N < this.L) {
                            this.cx += this.N;
                        } else {
                            this.cx = this.L;
                            this.R = 3;
                        }

                        return;
                    }
                } else if (this.R == 0) {
                    this.N = (short) (this.N - 2);
                    this.cx += this.N;
                    if (this.N <= -4) {
                        this.R = 1;
                        return;
                    }
                } else if (this.R == 1) {
                    this.N = (short) (this.N + 2);
                    this.cx += this.N;
                    if (this.N > 4) {
                        this.R = 2;
                        this.N = 0;
                        return;
                    }
                } else if (this.R == 2) {
                    ++this.N;
                    if (this.cx - this.N > this.L) {
                        this.cx -= this.N;
                        return;
                    }

                    this.cx = this.L;
                    this.R = 3;
                }
            }
        } catch (Exception var2) {
        }

    }

    public final void a(Entity var1) {
        this.status = 3;
        this.c = 0;
        this.N = this.M = this.R = 0;
        this.L = this.cx;
        this.setDir(var1);
        int var2;
        int var3;
        int var4;
        int var5;
        if (this.ax == null) {
            if (Utlis.a((XYEntity) this, (XYEntity) var1) > 100) {
                var4 = 0;
                var2 = 0;
                if (this.getMobTemplate().m.length > 0) {
                    var3 = Utlis.a(this.getMobTemplate().m.length);
                    var4 = this.getMobTemplate().m[var3];
                    if (this.getMobTemplate().m.length == this.getMobTemplate().n.length) {
                        var2 = this.getMobTemplate().n[var3];
                    }
                }

                if (var4 == 0) {
                    var4 = 83;
                }

                if (var2 == 0) {
                    var2 = 445;
                }

                var3 = this.k();
                var5 = this.l();
                if (this.getMobTemplate().s != null) {
                    if (this.cx > var1.cx) {
                        var3 = this.cx + this.getMobTemplate().s.c;
                        var5 = this.cy + this.getMobTemplate().s.d;
                    } else {
                        var3 = this.cx - this.getMobTemplate().s.c;
                        var5 = this.cy + this.getMobTemplate().s.d;
                    }
                }

                GameSrc.gI().at.add(new vdtt_eo(var4, var3, var5, var1, var2, 1, false, GameSrc.gI().at, GameSrc.gI().av));
            }

            this.S = this.cx > var1.cx;
        } else {
            this.ay = 100;
            this.ax.setDir(var1);
            int[] var6 = new int[]{506, 607, 618, 629, 640, 651, 662};
            var2 = Utlis.b(80, 20, 20, 20, 20, 20, 20);
            var3 = var6[var2];
            if (this.getMobTemplate().m.length > 0 && this.getMobTemplate().m[0] != 0 && Utlis.a((int) 10) == 0) {
                var3 = this.getMobTemplate().m[Utlis.a(this.getMobTemplate().m.length)];

                for (var5 = 0; var5 < DataCenter.gI().skill.length; ++var5) {
                    if (DataCenter.gI().skill[var5].d == var3 && DataCenter.gI().skill[var5].e == 1) {
                        var3 = DataCenter.gI().skill[var5].c;
                        break;
                    }
                }
            } else if (this.ax.aU == null && (Utlis.a((XYEntity) this, (XYEntity) var1) > 80 || Utlis.b(this.cy - var1.cy) > 20)) {
                GameSrc.gI().au.add(new vdtt_es(460, this.cx, this.cy - 30, 1));
                this.ac = 20;
                short var7 = var1.cy;
                short var8 = var1.cx;
                if (Utlis.b()) {
                    var4 = var8 - Utlis.a(20, 35);
                } else {
                    var4 = var8 + Utlis.a(20, 35);
                }

                XYEntity var9;
                if ((var9 = Char.b(var4, var7)) != null && Utlis.b(var9.cy, var7) < 40) {
                    var7 = var9.cy;
                }

                this.setXY(var4, var7);
            }

            if (this.ax.aU == null) {
                this.ax.aY = DataCenter.gI().skill[var3].a();
                Char var10 = this.ax;
                vdtt_if var11 = new vdtt_if(this.ax.aY, this.ax, var1);
                var10.aU = var11;
            }
        }

    }

    private void a(boolean var1) {
        try {
            if (this.dir != 2 && this.dir != 0 && !this.w()) {
                this.g = false;
            } else {
                this.g = true;
            }

            if (this.status != 4 && this.status != 6) {
                ++this.c;
                if (this.status == 1 || this.status == 5) {
                    if (this.c >= this.getMobTemplate().a[1].length) {
                        this.c = 0;
                    }

                    this.l = (byte) this.getMobTemplate().a[1][this.c];
                    return;
                }

                if (var1 && this.status == 2) {
                    this.c = 0;
                    this.status = 0;
                }

                if (this.p > 0) {
                    if (this.c >= this.getMobTemplate().a[this.p].length) {
                        this.c = 0;
                        this.p = -1;
                        if (this.status == 3) {
                            this.y();
                        }
                    }
                } else if (this.c >= this.getMobTemplate().a[this.status].length) {
                    this.c = 0;
                    if (this.status == 3) {
                        this.y();
                    }
                }

                if (this.status == 3 && this.getMobTemplate().a.length > 4) {
                    if (this.p == -1) {
                        this.p = (byte) (this.status + Utlis.a(this.getMobTemplate().a.length - this.status));
                    }

                    this.l = (byte) this.getMobTemplate().a[this.p][this.c];
                    return;
                }

                this.l = (byte) this.getMobTemplate().a[this.status][this.c];
            }
        } catch (Exception var3) {
        }

    }

    private void C() {
        if (this.ay > 0) {
            --this.ay;
        } else {
            if (Utlis.b(this.cx - this.H) > this.getMobTemplate().speedMove + 30 && this.N()) {
                this.cx = this.H;
            }

            int var1;
            if ((var1 = Utlis.b(this.cy - this.I)) > this.getMobTemplate().speedMove + 30 && !this.N()) {
                this.cy = this.I;
            }

            if (this.getMobTemplate().type != 3 && this.getMobTemplate().type != 4 && this.getMobTemplate().type != 13 && var1 > 20 && !this.N() && this.levelBoss != 8) {
                this.cx = this.H;
                this.cy = this.I;
            }

            if (this.ar <= 0) {
                if (this.o()) {
                    this.status = 0;
                } else {
                    if (this.cx == this.J && this.cy == this.K) {
                        try {
                            if (this.getMobTemplate().type == 6) {
                                if (this.c >= this.getMobTemplate().a[this.status].length - 1) {
                                    this.status = 0;
                                }

                                return;
                            }
                        } catch (Exception var4) {
                            this.status = 0;
                            return;
                        }

                        if (this.getMobTemplate().type == 12) {
                            var1 = Utlis.a((int) 15);
                        } else {
                            var1 = Utlis.a((int) 10);
                        }

                        if (this.z()) {
                            var1 = 9;
                        }

                        short var2;
                        short var3;
                        label171:
                        {
                            var2 = this.K;
                            if (this.getMobTemplate().speedMove >= 100 && this.getMobTemplate().type == 3) {
                                if (var1 != 9) {
                                    this.J = (short) (this.H - this.getMobTemplate().speedMove + Utlis.a(this.getMobTemplate().speedMove * 2));
                                    this.K = (short) (this.I - this.getMobTemplate().speedMove + Utlis.a(this.getMobTemplate().speedMove * 2));
                                    break label171;
                                }
                            } else {
                                var3 = this.getMobTemplate().speedMove;
                                if (this.levelBoss == 8) {
                                    var3 = 30;
                                }

                                switch (var1) {
                                    case 0:
                                        this.J = (short) (this.H - var3);
                                        this.K = (short) (this.I - var3);
                                        break label171;
                                    case 1:
                                        this.J = this.H;
                                        this.K = (short) (this.I - var3);
                                        break label171;
                                    case 2:
                                        this.J = (short) (this.H + var3);
                                        this.K = (short) (this.I - var3);
                                        break label171;
                                    case 3:
                                        this.J = (short) (this.H - var3);
                                        this.K = this.I;
                                        break label171;
                                    case 4:
                                        this.J = this.H;
                                        this.K = this.I;
                                        break label171;
                                    case 5:
                                        this.J = (short) (this.H + var3);
                                        this.K = this.I;
                                        break label171;
                                    case 6:
                                        this.J = (short) (this.H - var3);
                                        this.K = (short) (this.I + var3);
                                        break label171;
                                    case 7:
                                        this.J = this.H;
                                        this.K = (short) (this.I + var3);
                                        break label171;
                                    case 8:
                                        this.J = (short) (this.H + var3);
                                        this.K = (short) (this.I + var3);
                                        break label171;
                                }
                            }

                            this.status = 0;
                        }

                        if (this.getMobTemplate().type != 3) {
                            this.K = var2;
                            if (this.at) {
                                var3 = this.cx;
                                if (this.J < this.cx) {
                                    do {
                                        if (Char.b(var3 = (short) (var3 - 5), this.K) != null) {
                                            var3 = (short) (var3 + 5);
                                            break;
                                        }
                                    } while (var3 > this.J);
                                } else {
                                    do {
                                        if (Char.b(var3 = (short) (var3 + 5), this.K) != null) {
                                            var3 = (short) (var3 - 5);
                                            break;
                                        }
                                    } while (var3 < this.J);
                                }

                                this.J = var3;
                            }
                        }
                    } else if (this.getMobTemplate().type == 1 && DataCenter.gI().h % 2 == 0 || this.getMobTemplate().type == 5 && DataCenter.gI().h % 3 == 0 || this.getMobTemplate().type != 1 && this.getMobTemplate().type != 5) {
                        this.D();
                    }

                    this.A();
                }
            }
        }

    }

    private void D() {
        if (this.cx > this.J) {
            this.cx = (short) (this.cx - this.rangeMove);
            if (this.cx < this.J) {
                this.cx = this.J;
            }

            this.dir = 3;
        } else if (this.cx < this.J) {
            this.cx = (short) (this.cx + this.rangeMove);
            if (this.cx > this.J) {
                this.cx = this.J;
            }

            this.dir = 2;
        }

        if (this.cy > this.K) {
            this.cy = (short) (this.cy - this.rangeMove);
            if (this.cy < this.K) {
                this.cy = this.K;
                return;
            }
        } else if (this.cy < this.K) {
            this.cy = (short) (this.cy + this.rangeMove);
            if (this.cy > this.K) {
                this.cy = this.K;
            }
        }

    }

    public final void i() {
        super.i();
    }

    public final void paintTop(Graphics var1) {
        if (!Utlis.e() && this.aq != 2 && this.ac <= 0 && this.Z <= 0 && this.hp != 0) {
            if (this.al) {
                vdtt_cz.a(var1, 437, this.g ? -360 : 0, this.cx, this.cy - 22, 3);
            } else if (this.am) {
                vdtt_cz.a(var1, 382, this.g ? -360 : 0, this.cx, this.cy - 5, 3);
            } else {
                if (this.id == 215 || this.id == 216) {
                    this.g = true;
                }

                if (this.id == 217 || this.id == 218) {
                    this.g = false;
                }

                if (this.status != 4 && this.status != 6 && this.getMobTemplate().b != null) {
                    if (this.ax != null) {
                        if (this.id == 237) {
                            this.ax.bM = true;
                        }

                        if (this.ax.aU != null) {
                            this.g = this.ax.aE != 3;
                        }

                        this.ax.a(var1, this.cx, this.cy, this.ax.bd, this.ax.J, this.ax.typeGiaoDich, !this.g);
                        return;
                    }

                    if (this.aq == 1) {
                        var1.d(40);
                    }

                    if (this.aB > 0) {
                        if (this.aB % 2 == 0) {
                            var1.a(1.2F, 0.5F);
                        }

                        --this.aB;
                    }

                    if (this.ae) {
                        var1.c(-7452415);
                    } else if (this.af) {
                        var1.c(-14383350);
                    } else if (!this.ag && !this.ai) {
                        if (this.ah) {
                            var1.c(-181445);
                        } else if (this.aj) {
                            this.l = (byte) this.getMobTemplate().a[1][0];
                        }
                    } else {
                        var1.c(-14466309);
                    }

                    vdtt_fe var2 = this.getMobTemplate().b[this.l];
                    boolean var3 = true;
                    var1.k = var3;
                    if (this.levelBoss == 11) {
                        var1.c(180.0F);
                    } else if (this.levelBoss == 2) {
                        var1.c(150.0F);
                    } else if (this.levelBoss == 1) {
                        var1.c(120.0F);
                    } else if (this.levelBoss == 10) {
                        var1.c(90.0F);
                    } else if (this.levelBoss == 9) {
                        var1.c(60.0F);
                    } else if (DataCenter.k() && (this.id >= 158 && this.id <= 162 || this.id >= 66 && this.id <= 72 || this.id >= 173 && this.id <= 177)) {
                        var1.c((float) (this.id * this.id * this.id % 180));
                    }

                    int var4;
                    for (var4 = 0; var4 < var2.a.length; ++var4) {
                        short var5 = var2.a[var4].a;
                        if (this.id == 237) {
                            if (this.g) {
                                vdtt_y.c(var1, var5, var2.a[var4].a(this.g), this.cx - var2.a[var4].c * 76 / 100, this.cy + var2.a[var4].d * 76 / 100, 76, 33);
                            } else {
                                vdtt_y.c(var1, var5, var2.a[var4].a(this.g), this.cx + var2.a[var4].c * 76 / 100, this.cy + var2.a[var4].d * 76 / 100, 76, 33);
                            }
                        } else if (this.g) {
                            vdtt_cz.b(var1, var5, var2.a[var4].a(this.g), this.cx - var2.a[var4].c, this.cy + var2.a[var4].d, 33);
                        } else {
                            vdtt_cz.b(var1, var5, var2.a[var4].a(this.g), this.cx + var2.a[var4].c, this.cy + var2.a[var4].d, 33);
                        }
                    }

                    if (this.levelBoss == 11 || this.levelBoss == 2 || this.levelBoss == 1 || this.levelBoss == 10 || this.levelBoss == 9 || GameSrc.gI().focusEntity != null && GameSrc.gI().focusEntity.equals(this) || DataCenter.k() && (this.id >= 158 && this.id <= 162 || this.id >= 66 && this.id <= 72 || this.id >= 173 && this.id <= 177)) {
                        var1.r();
                    }

                    var3 = false;
                    var1.k = var3;
                    var1.m = 1.0F;
                    var1.f();
                    boolean var9 = true;
                    Mob var6 = this;

                    Effect var7;
                    label139:
                    {
                        for (var4 = 0; var4 < var6.aa.size(); ++var4) {
                            Effect var8;
                            if ((var8 = (Effect) var6.aa.get(var4)).getEffectTemplate().id == 146) {
                                var7 = var8;
                                break label139;
                            }
                        }

                        var7 = null;
                    }

                    if (var7 != null) {
                        vdtt_cz.b(var1, 5765, 0, this.cx + 2, this.cy - 9, 33);
                    }
                }
            }
        }

    }

    private short E() {
        short var1 = this.getMobTemplate().speedMove;
        if (this.levelBoss == 8) {
            var1 = 30;
        }

        return (short) (this.H - var1);
    }

    private short F() {
        short var1 = this.getMobTemplate().speedMove;
        if (this.levelBoss == 8) {
            var1 = 30;
        }

        return (short) (this.H + var1);
    }

    private short G() {
        return (short) (this.I - this.getMobTemplate().speedMove);
    }

    private short H() {
        return (short) (this.I + this.getMobTemplate().speedMove);
    }

    public final vdtt_ff s() {
        try {
            return this.getMobTemplate().b[this.getMobTemplate().a[4][0]].a[0];
        } catch (Exception var2) {
            return null;
        }
    }

    private int I() {
        try {
            int var1 = 0;

            for (int var2 = 0; var2 < this.getMobTemplate().a[5].length; ++var2) {
                var1 += this.getMobTemplate().a[5][var2];
            }

            return var1;
        } catch (Exception var3) {
            return -1;
        }
    }

    public final String strTop() {
        return Utlis.c(this.hp);
    }

    public final String strBottom() {
        return this.getMobTemplate().name;
    }

    public final int a(int var1) {
        if (this.hpFull == 0) {
            return var1;
        } else {
            long var2 = 0L;

            try {
                if ((var2 = (long) this.hp * (long) var1 / (long) this.hpFull) > (long) var1) {
                    var2 = (long) var1;
                }
            } catch (Exception var5) {
            }

            if (var2 < 0L) {
                var2 = 0L;
            }

            return (int) var2;
        }
    }

    private boolean J() {
        return this.id == 101 || this.id == 240;
    }

    private boolean K() {
        return this.id == 102 || this.id == 241;
    }

    public final boolean v() {
        if (this.isDie() || GameSrc.gI().getMapTemplate().type == 6 && GameSrc.gI().ci == 1 && this.J() || GameSrc.gI().getMapTemplate().type == 6 && GameSrc.gI().ci == 2 && this.K()) {
            return false;
        } else if (this.getMobTemplate().type != 13) {
            return true;
        } else {
            vdtt_ii var1;
            return (var1 = GameSrc.gI().T()) != null && var1.e == this.id || GameSrc.gI().taskTuanHoan != null && GameSrc.gI().taskTuanHoan.f == this.id;
        }
    }

    private boolean L() {
        if (GameSrc.gI().getMapTemplate().type == 15 && GameSrc.gI().cs < 70 && (GameSrc.gI().bq == null || !GameSrc.gI().bq.isLeader())) {
            return false;
        } else {
            return this.id == 273 || this.levelBoss == 7 || Utlis.b(Char.gI().w() - this.level) <= 8;
        }
    }

    public final void paintBottom(Graphics var1) {
        if (!Utlis.e() && this.aq != 2 && this.ac <= 0 && this.Z <= 0 && this.hp != 0) {
            int var2 = 25;
            int var3 = this.getMobTemplate().height;
            if (this.id == 237) {
                var3 -= 12;
            } else if (this.levelBoss == 8) {
                var3 = this.getMobTemplate().height;
            }

            if (this.status != 4 && this.status != 6 && this.id != 240 && this.id != 241) {
                int var4 = -65536;
                if (!GameSrc.gI().V() || GameSrc.gI().getMapTemplate().type == 24) {
                    if (this.x()) {
                        var4 = -16711681;
                    } else if (!this.L()) {
                        var4 = -9942667;
                    }
                }

                int var5;
                if (this.getMobTemplate().type == 9) {
                    var5 = this.cy - var3 - 10;
                    vdtt_dd.b(vdtt_dd.d, var1, this.getMobTemplate().name, this.cx, var5, 2, -1, -16777216);
                } else if (this.getMobTemplate().type == 10) {
                    var2 = 15;
                    if (GameSrc.gI().focusEntity != null && GameSrc.gI().focusEntity.equals(this)) {
                        var5 = this.cy - var3 - 8;
                        vdtt_dd.b(vdtt_dd.d, var1, this.getMobTemplate().name, this.cx, var5, 2, -16646423, -16777216);
                        var2 = 23;
                    }
                } else if (this.levelBoss == 1) {
                    var2 = 35;
                    vdtt_dd.b(vdtt_dd.d, var1, Caption.jf, this.cx, this.cy - var3 - 18, 2, -16742145, -16777216);
                    var1.f(-16777216);
                    var1.c(this.cx - 23, this.cy - var3 - 9, 46, 6);
                    var1.f(var4);
                    var1.c(this.cx - 22, this.cy - var3 - 8, this.a(44), 4);
                } else if (this.levelBoss == 2) {
                    var2 = 35;
                    vdtt_dd.b(vdtt_dd.d, var1, Caption.jg, this.cx, this.cy - var3 - 18, 2, -3407617, -16777216);
                    var1.f(-16777216);
                    var1.c(this.cx - 27, this.cy - var3 - 10, 54, 7);
                    var1.f(var4);
                    var1.c(this.cx - 26, this.cy - var3 - 9, this.a(52), 5);
                } else if (this.levelBoss == 8) {
                    var2 = 35;
                    var5 = this.cy - var3 - 18;
                    vdtt_dd.b(vdtt_dd.d, var1, this.getMobTemplate().name, this.cx, var5, 2, -5113342, -16777216);
                    var1.f(-16777216);
                    var1.c(this.cx - 27, this.cy - var3 - 10, 54, 7);
                    var1.f(var4);
                    var1.c(this.cx - 26, this.cy - var3 - 9, this.a(52), 5);
                } else if (this.levelBoss == 9) {
                    var2 = 35;
                    vdtt_dd.b(vdtt_dd.d, var1, Caption.sf, this.cx, this.cy - var3 - 18, 2, -603281, -16777216);
                    var1.f(-16777216);
                    var1.c(this.cx - 27, this.cy - var3 - 10, 54, 7);
                    var1.f(var4);
                    var1.c(this.cx - 26, this.cy - var3 - 9, this.a(52), 5);
                } else if (this.levelBoss == 10) {
                    var2 = 35;
                    vdtt_dd.b(vdtt_dd.d, var1, Caption.sg, this.cx, this.cy - var3 - 18, 2, -9439541, -16777216);
                    var1.f(-16777216);
                    var1.c(this.cx - 23, this.cy - var3 - 12, 46, 6);
                    var1.f(var4);
                    var1.c(this.cx - 22, this.cy - var3 - 11, this.a(44), 4);
                } else if (this.levelBoss == 11) {
                    var2 = 35;
                    vdtt_dd.b(vdtt_dd.d, var1, Caption.vi, this.cx, this.cy - var3 - 18, 2, -16712436, -16777216);
                    var1.f(-16777216);
                    var1.c(this.cx - 23, this.cy - var3 - 12, 46, 6);
                    var1.f(var4);
                    var1.c(this.cx - 22, this.cy - var3 - 11, this.a(44), 4);
                } else if (this.levelBoss == 7) {
                    var2 = 35;
                    var5 = this.cy - var3 - 19;
                    vdtt_dd.b(vdtt_dd.d, var1, this.getMobTemplate().detail, this.cx, var5, 2, -5113342, -16777216);
                    var1.f(-16777216);
                    var1.c(this.cx - 23, this.cy - var3 - 12, 46, 6);
                    var1.f(var4);
                    var1.c(this.cx - 22, this.cy - var3 - 11, this.a(44), 4);
                } else if (this.levelBoss != 3 && this.levelBoss != 12) {
                    if (this.levelBoss > 0) {
                        var2 = 20;
                        var1.f(-16777216);
                        var1.c(this.cx - 23, this.cy - var3 - 9, 46, 6);
                        var1.f(var4);
                        var1.c(this.cx - 22, this.cy - var3 - 8, this.a(44), 4);
                        if (this.getMobTemplate().detail.length() > 0) {
                            var2 = 33;
                            var5 = this.cy - var3 - 17;
                            vdtt_dd.b(vdtt_dd.d, var1, this.getMobTemplate().detail, this.cx, var5, 2, -7812062, -10275328);
                        }
                    } else if (!this.w()) {
                        var1.f(-16777216);
                        var1.c(this.cx - 15, this.cy - var3 - 8, 30, 4);
                        var1.f(var4);
                        var1.c(this.cx - 14, this.cy - var3 - 7, this.a(28), 2);
                    }
                } else {
                    var2 = 40;
                    var5 = this.cy - var3 - 32;
                    vdtt_dd.b(vdtt_dd.d, var1, this.getMobTemplate().detail, this.cx, var5, 2, -16712436, -16777216);
                    var5 = this.cy - var3 - 20;
                    vdtt_dd.b(vdtt_dd.d, var1, this.getMobTemplate().name, this.cx, var5, 2, -1, -16777216);
                    var1.f(-16777216);
                    var1.c(this.cx - 23, this.cy - var3 - 12, 46, 6);
                    var1.f(var4);
                    var1.c(this.cx - 22, this.cy - var3 - 11, this.a(44), 4);
                }

                if (this.an != null && this.an.length() > 0) {
                    var2 = 35;
                    GameSrc.gI().aY = true;
                    vdtt_dd.b(vdtt_dd.d, var1, this.an + Caption.ji, this.cx, this.cy - var3 - 18, 2, -2560, -16777216);
                }

                Vector var6 = new Vector();

                int var7;
                Effect var8;
                for (var7 = 0; var7 < this.aa.size(); ++var7) {
                    if ((var8 = (Effect) this.aa.elementAt(var7)).a()) {
                        var6.add(var8);
                    }
                }

                if (var6.size() > 0) {
                    var4 = -(var6.size() - 1) * 17 / 2;

                    for (var7 = 0; var7 < var6.size(); ++var7) {
                        if ((var8 = (Effect) var6.elementAt(var7)).a()) {
                            short var9 = var8.getEffectTemplate().idIcon;
                            if (var8.id == 76 && var8.b != 300) {
                                var9 = 545;
                            }

                            var8.a(var1, this.cx + var4 - 7 + var7 * 17, this.cy - var3 - var2 - 5, var9, true);
                        }
                    }

                    var2 += 16;
                }

                if (GameSrc.gI().focusEntity != null && GameSrc.gI().focusEntity.equals(this)) {
                    int var10 = this.cy - var3 - var2;
                    GameSrc.gI().bn.setXY(this.cx, var10 + 6);
                    GameSrc.gI().bn.paintTop(var1);
                }

                if (this.ao != null) {
                    this.ao.a(var1);
                }
            }
        }

    }

    public final int prioritize() {
        return this.w() ? 4 : 3;
    }

    public final boolean w() {
        return this.getMobTemplate().type == 10 || this.getMobTemplate().type == 7 || this.getMobTemplate().type == 13 || this.id == 154;
    }

    private void M() {
        if (this.aA != 1) {
            this.aA = 0;
            this.status = 4;
        }

    }

    private boolean N() {
        return this.getMobTemplate().type != 9 && this.getMobTemplate().type != 11 && this.ax == null;
    }

    public final boolean x() {
        return (this.getMobTemplate().typeMob2 == 5 || this.getMobTemplate().typeMob2 == 12) && !this.L();
    }
}
