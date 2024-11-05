package gro;

import java.io.IOException;
import java.util.Arrays;
import java.util.Vector;

public final class Char extends Entity {

    public static int k = 0;
    private static Char bW;
    public String username;
    public byte idCharSys;
    public byte l;
    public byte m;
    public byte n;
    public byte lvPk;
    public short typePk;
    public short J;
    public short typeGiaoDich;
    public short speedMove;
    public boolean isCuuSat;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public int Z;
    public int aa = -1;
    public int ab;
    public int ac;
    public vdtt_gj pointMove;
    public vdtt_gj ae;
    public int hp;
    public int mp;
    public int hpFull;
    public int mpFull;
    public int bac;
    public int bacKhoa;
    public int vangKhoa;
    public int vang;
    public int an;
    public int ao;
    public int ap;
    public int aq;
    public int ar;
    public int as;
    public byte gioiTinh;
    public byte sys;
    public byte he;
    public byte aw = -1;
    public byte selectDanhHieu = -1;
    public byte rank;
    public byte az;
    public byte aA;
    public long exp;
    public String name;
    public byte aD;
    public byte aE;
    public int aF;
    public int aG;
    public short aH;
    public short aI;
    public int aJ;
    public short aK;
    public short aL;
    public short aM;
    public short aN;
    public Item[] arrItemBag;
    public Item[] arrItemBox;
    public Item[] arrItemBody = new Item[16];
    public Item[] arrItemBody2 = new Item[16];
    public Item[] arrItemExtra = new Item[10];
    public Item[] aT = new Item[6];
    public vdtt_if aU;
    public Vector aV = new Vector();
    public vdtt_ie aW;
    public vdtt_eb aX;
    public Skill aY;
    public vdtt_hf aZ;
    public Vector ba;
    public Vector bb;
    public Vector bc;
    public Vector bd;
    public Vector be;
    public DanhHieu[] danhhieu;
    public vdtt_el giatoc;
    public vdtt_ho bh;
    public long bi;
    public Mob bj;
    public Mob bk;
    public int bl;
    public int bm;
    public int bn;
    public int bo;
    public int bp;
    public boolean bq;
    public boolean br;
    public boolean bs;
    public Effect bt;
    public Effect bu;
    public Effect bv;
    public Effect bw;
    public Effect bx;
    public Effect by;
    public Effect bz;
    public Vector bA;
    public boolean bB;
    public boolean bC;
    public int bD;
    public int bE;
    public boolean bF;
    private int bX;
    private int bY;
    private int bZ;
    private int ca;
    private int cb;
    private int cc;
    private int cd;
    private int ce;
    public short bG;
    public short bH;
    private long cf;
    private Effect cg;
    private boolean ch;
    private boolean ci;
    private vdtt_es cj;
    private vdtt_es ck;
    private int cl;
    private byte cm;
    private Vector cn;
    private long co;
    private long cp;
    private int cq;
    public int bI;
    public int bJ;
    public int bK;
    private int cr;
    private int cs;
    private vdtt_dv ct;
    public boolean bL;
    public boolean bM;
    public boolean bN;
    public boolean bO;
    public boolean bP;
    public int bQ;
    public int bR;
    public Char bS;
    public Char bT;
    private int cu;
    private int cv;
    private int cw;
    private int cx_;
    private int cy_;
    private int cz;
    private int cA;
    private static int[] cB = new int[]{-10, -10, -10, -10, -10, -8, -5, -5, -3, -2, -2, -1, -1, -1, -1, -1};
    public int bU;
    public int bV;
    private long cC;

    public Char() {
        this.aZ = new vdtt_hf(83, this.cx, this.cy, -1);
        this.ba = new Vector();
        this.bb = new Vector();
        this.bc = new Vector();
        this.bd = new Vector();
        this.be = new Vector();
        this.danhhieu = new DanhHieu[0];
        this.bi = 0L;
        this.bo = -1;
        this.bA = new Vector();
        this.bD = 0;
        this.bE = 0;
        this.bZ = -1;
        this.ca = -1;
        this.cd = 0;
        this.bG = -1;
        this.bH = -1;
        this.cf = 0L;
        this.cj = new vdtt_es(383, 0, 0, -1);
        this.ck = new vdtt_es(442, 0, 0, -1);
        this.cl = 0;
        this.cn = new Vector();
        this.cq = 0;
        this.bU = -1;
        this.bV = 0;
        this.setSize(30, 48);
        this.aE = 3;
    }

    public Char(int var1) {
        this.aZ = new vdtt_hf(83, this.cx, this.cy, -1);
        this.ba = new Vector();
        this.bb = new Vector();
        this.bc = new Vector();
        this.bd = new Vector();
        this.be = new Vector();
        this.danhhieu = new DanhHieu[0];
        this.bi = 0L;
        this.bo = -1;
        this.bA = new Vector();
        this.bD = 0;
        this.bE = 0;
        this.bZ = -1;
        this.ca = -1;
        this.cd = 0;
        this.bG = -1;
        this.bH = -1;
        this.cf = 0L;
        this.cj = new vdtt_es(383, 0, 0, -1);
        this.ck = new vdtt_es(442, 0, 0, -1);
        this.cl = 0;
        this.cn = new Vector();
        this.cq = 0;
        this.bU = -1;
        this.bV = 0;
        this.setSize(30, 48);
        this.idEntity = var1;
    }

    public static Char gI() {
        if (bW == null) {
            bW = new Char();
        }

        return bW;
    }

    private static void a(Vector var0, int var1) {
        try {
            for (int var2 = 0; var2 < var0.size() - 1; ++var2) {
                vdtt_gz var3 = (vdtt_gz) var0.elementAt(var2);

                for (int var4 = var2 + 1; var4 < var0.size(); ++var4) {
                    vdtt_gz var5 = (vdtt_gz) var0.elementAt(var4);
                    vdtt_gz var6;
                    if (var3.h[var1].c > var5.h[var1].c) {
                        var6 = var5;
                        var5 = var3;
                        var3 = var6;
                        var0.setElementAt(var6, var2);
                        var0.setElementAt(var5, var4);
                    } else if (var3.h[var1].c == var5.h[var1].c && var5.c != 51 && var5.c != 588 && var5.c != 589) {
                        if (var3.c != 51 && var3.c != 588 && var3.c != 589) {
                            if (var3.h[var1].e < var5.h[var1].e) {
                                var6 = var5;
                                var5 = var3;
                                var3 = var6;
                                var0.setElementAt(var6, var2);
                                var0.setElementAt(var5, var4);
                            } else if (var3.h[var1].e == var5.h[var1].e && var3.h[var1].d < var5.h[var1].d) {
                                var6 = var5;
                                var5 = var3;
                                var3 = var6;
                                var0.setElementAt(var6, var2);
                                var0.setElementAt(var5, var4);
                            }
                        } else if (var5.c != 29) {
                            var6 = var5;
                            var5 = var3;
                            var3 = var6;
                            var0.setElementAt(var6, var2);
                            var0.setElementAt(var5, var4);
                        }
                    }
                }
            }
        } catch (Exception var7) {
        }

    }

    public static XYEntity b(int var0, int var1) {
        return a(var0, var1, (int) 1);
    }

    private static XYEntity a(int var0, int var1, int var2) {
        try {
            if (var0 < 16) {
                var0 = 16;
            } else if (var0 > GameSrc.gI().maxX - 16) {
                var0 = GameSrc.gI().maxX - 16;
            }

            GameSrc.gI();
            XYEntity var3;
            if ((var3 = vdtt_fk.c(var0, var1)) != null && Utlis.b(var1 - var3.cy) > var2) {
                return var3;
            }
        } catch (Exception var4) {
        }

        return null;
    }

    private int ai() {
        if (this.arrItemBody[12] != null) {
            return this.arrItemBody[12].id == 535 ? 11 : this.arrItemBody[12].id - 123;
        } else {
            return 0;
        }
    }

    public final void n() {
        this.o();
        gI().j();
    }

    public final void o() {
        this.cn.clear();
        this.bc.clear();
    }

    public final void b(Message var1) throws IOException {
        this.ba.clear();
        this.arrItemBag = null;
        this.arrItemBox = null;
        this.arrItemBody = new Item[16];
        this.arrItemBody2 = new Item[16];
        this.arrItemExtra = new Item[10];
        this.status = var1.readByte();
        this.name = var1.reader.readUTF();
        this.idCharSys = var1.readByte();
        this.gioiTinh = var1.readByte();
        this.sys = var1.readByte();
        this.m = var1.readByte();
        this.l = var1.readByte();
        this.typePk = (short) (var1.readShort() / 100);
        this.hp = var1.readInt();
        this.hpFull = var1.readInt();
        this.mp = var1.readInt();
        this.mpFull = var1.readInt();
        this.exp = var1.readLong();
        this.cx = this.aH = var1.readShort();
        this.cy = this.aI = var1.readShort();
        this.cu = this.cy;
        this.lvPk = var1.readByte();
        this.e(var1);
        a(var1, this.arrItemBody);
        if (this.status == 4) {
            this.ay();
        }

        byte var2 = var1.readByte();

        for (int var3 = 0; var3 < var2; ++var3) {
            Effect var4 = new Effect(var1.readShort(), var1.readInt(), var1.readLong(), var1.readInt(), this);
            this.a(var4);
        }

        this.f(var1);
        this.selectDanhHieu = (byte) (var1.readByte() + 1);
        this.rank = var1.readByte();
        this.bp = var1.readByte();
        this.aC();
        byte var5;
        if ((var5 = var1.readByte()) > 0) {
            GameSrc.gI().a(0, this, var5);
        }

        this.bq = var1.readBoolean();
    }

    public final void c(Message var1) throws IOException {
        GameSrc.gI().dI = false;
        GameSrc.gI().taskTuanHoan = GameSrc.gI().bA = GameSrc.gI().bB = GameSrc.gI().bz = GameSrc.gI().bC = GameSrc.gI().bD = GameSrc.gI().bE = null;
        GameSrc var2 = GameSrc.gI();
        byte var3 = 0;
        var2.dd = var3;
        this.ba.clear();
        this.username = var1.reader.readUTF();
        this.idEntity = var1.readInt();
        this.name = var1.reader.readUTF();
        this.gioiTinh = var1.readByte();
        this.idCharSys = var1.readByte();
        this.he = var1.readByte();
        this.sys = var1.readByte();
        this.m = var1.readByte();
        this.l = var1.readByte();
        this.an = var1.readInt();
        this.typePk = (short) (var1.readShort() / 100);
        this.hp = var1.readInt();
        this.hpFull = var1.readInt();
        this.mp = var1.readInt();
        this.mpFull = var1.readInt();
        this.exp = var1.readLong();
        this.bac = var1.readInt();
        this.bacKhoa = var1.readInt();
        this.vang = var1.readInt();
        this.vangKhoa = var1.readInt();
        GameSrc.gI().idTask = var1.readShort();
        GameSrc.gI().idStep = var1.readByte();
        GameSrc.gI().numStepDone = var1.readUnsignedShort();
        GameSrc.gI().mocNap = var1.readInt();
        GameSrc.gI().timeChatColor = var1.readInt();
        GameSrc.gI().R();
        int var4 = this.j(var1.readShort());
        this.arrItemBag = new Item[var4];
        Item[] var5 = this.arrItemExtra;
        Message var6 = var1;

        for (int var7 = 0; var7 < var5.length; ++var7) {
            var5[var7] = null;
        }

        byte var12 = var1.readByte();

        for (int var8 = 0; var8 < var12; ++var8) {
            Item var9;
            (var9 = new Item()).id = var6.readShort();
            var9.isLock = var6.readBoolean();
            var9.index = var6.readByte();
            var5[var9.index] = var9;
        }

        a(var1, this.arrItemBody);
        a(var1, this.arrItemBody2);
        b(var1, this.arrItemBag);
        if (this.arrItemBody[10] != null) {
            this.aw = 50;
        }

        this.ba.clear();
        byte var13 = var1.readByte();

        int var14;
        for (var14 = 0; var14 < var13; ++var14) {
            Effect var10 = new Effect(var1.readShort(), var1.readInt(), var1.readLong(), var1.readInt(), this);
            this.a(var10);
        }

        GameSrc.gI().vThu.clear();
        short var15 = var1.readShort();

        for (var14 = 0; var14 < var15; ++var14) {
            Thu var11;
            (var11 = new Thu()).a(var1);
            GameSrc.gI().vThu.add(var11);
        }

        GameSrc.gI().vFriend.clear();
        var15 = var1.readShort();

        for (var14 = 0; var14 < var15; ++var14) {
            Friend var16;
            (var16 = new Friend()).name = var1.reader.readUTF();
            var16.type = var1.readByte();
            var16.isOnline = var1.readBoolean();
            GameSrc.gI().vFriend.add(var16);
        }

        GameSrc.gI().O();
        GameSrc.gI().vEnemy.clear();
        var15 = var1.readShort();

        for (var14 = 0; var14 < var15; ++var14) {
            Enemy var17;
            (var17 = new Enemy()).name = var1.reader.readUTF();
            var17.isOnline = var1.readBoolean();
            GameSrc.gI().vEnemy.add(var17);
        }

        this.d(var1);
        this.e(var1);
        this.f(var1);
        this.selectDanhHieu = (byte) (var1.readByte() + 1);
        GameSrc.gI().di = var1.readInt();
        this.rank = var1.readByte();
        this.bp = var1.readByte();
        GameSrc.gI().capCayTao = var1.readByte();
        GameSrc.gI().timeCayTao = var1.readInt();
        GameSrc.gI().cW = var1.readInt();
        GameSrc.gI().cX = var1.readInt();
        GameSrc.gI().dk = var1.readLong();
        GameSrc.gI().cY = var1.readByte();
        this.ar = var1.readInt();
        this.ap = var1.readInt();
        this.as = var1.readInt();
        this.aq = var1.readInt();
        this.ao = var1.readByte();
        this.az = var1.readByte();
        this.aA = var1.readByte();
        GameSrc.gI().ab();
        this.be.clear();
        this.bb.clear();
        this.o();
        this.bd.clear();
        var6 = null;
        this.aU = null;
        this.bT = null;
    }

    public final void d(Message var1) throws IOException {
        GameSrc.gI().cf = var1.readLong();
        this.bG = var1.readShort();
        this.aY = DataCenter.gI().skill[1].a();
        short var2 = var1.readShort();
        Vector var3 = new Vector();
        short var4 = var1.readShort();

        int var5;
        Skill var6;
        for (var5 = 0; var5 < var4; ++var5) {
            short var7 = var1.readShort();
            (var6 = DataCenter.gI().skill[var7].a()).b = var5;
            var6.n = var1.readLong();
            if (var6.b(gI())) {
                var3.add(var6);
            }

            if (var2 == var6.c) {
                this.aY = var6;
            }
        }

        for (var5 = 0; var5 < GameSrc.gI().ae.length; ++var5) {
            GameSrc.gI().ae[var5] = null;
        }

        GameSrc.gI().af = new Skill[var3.size()];

        for (var5 = 0; var5 < GameSrc.gI().af.length; ++var5) {
            var6 = (Skill) var3.get(var5);
            GameSrc.gI().af[var5] = (Skill) var3.get(var5);
            if (var6.e < var6.getSkillTemplate().levelMax) {
                Skill[] var8;
                if (GameSrc.gI().af[var5].d == 30) {
                    var8 = GameSrc.gI().ae;
                    GameSrc.gI();
                    var8[0] = GameSrc.j(var6.d, var6.e + 1);
                } else if (GameSrc.gI().af[var5].d == 54 && gI().w() < 19) {
                    var8 = GameSrc.gI().ae;
                    GameSrc.gI();
                    var8[1] = GameSrc.j(var6.d, var6.e + 1);
                } else if (GameSrc.gI().af[var5].d == 53 && gI().w() < 19) {
                    var8 = GameSrc.gI().ae;
                    GameSrc.gI();
                    var8[2] = GameSrc.j(var6.d, var6.e + 1);
                }
            }
        }

        Arrays.sort(GameSrc.gI().af, Skill.a);
    }

    public final boolean p() {
        return gI().equals(this);
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

    public final int a(int var1) {
        int var2 = 0;

        try {
            if ((var2 = this.hp * var1 / this.hpFull) > var1) {
                var2 = var1;
            }
        } catch (Exception var4) {
        }

        if (var2 < 0) {
            var2 = 0;
        }

        return var2;
    }

    public final boolean q() {
        return this.pointMove != null && this.pointMove.g > 0;
    }

    public final boolean r() {
        return this.pointMove != null && this.pointMove.b();
    }

    public static int b(int var0) {
        int var1 = 0;

        try {
            if ((var1 = GameSrc.gI().dd * var0 / GameSrc.gI().de) > var0) {
                var1 = var0;
            }
        } catch (Exception var3) {
        }

        if (var1 < 0) {
            var1 = 0;
        }

        return var1;
    }

    public final int c(int var1) {
        int var2 = 0;

        try {
            if ((var2 = this.mp * var1 / this.mpFull) > var1) {
                var2 = var1;
            }
        } catch (Exception var4) {
        }

        if (var2 < 0) {
            var2 = 0;
        }

        return var2;
    }

    public final int s() {
        Item var1;
        if ((var1 = this.arrItemBody[0]) != null) {
            ItemOption[] var2 = var1.L();

            for (int var3 = 0; var3 < var2.length; ++var3) {
                if (var2[var3].option[0] == 285) {
                    return var2[var3].f();
                }
            }
        }

        return 0;
    }

    public final int v() {
        Item var1;
        if ((var1 = this.arrItemBody[0]) != null) {
            ItemOption[] var2 = var1.L();

            for (int var3 = 0; var3 < var2.length; ++var3) {
                if (var2[var3].option[0] == 285) {
                    long var4 = (long) var2[var3].option[1] * 10L;

                    int var6;
                    for (var6 = 0; var6 < DataCenter.gI().ax.length && var4 >= DataCenter.gI().ax[var6]; ++var6) {
                        var4 -= DataCenter.gI().ax[var6];
                    }

                    return var6;
                }
            }
        }

        return 0;
    }

    public final int w() {
        long var1 = this.exp;

        int var3;
        for (var3 = 0; var3 < DataCenter.gI().ax.length && var1 >= DataCenter.gI().ax[var3]; ++var3) {
            var1 -= DataCenter.gI().ax[var3];
        }

        return var3;
    }

    public final String x() {
        Item var1;
        if ((var1 = this.arrItemBody[0]) != null) {
            ItemOption[] var2 = var1.L();

            for (int var3 = 0; var3 < var2.length; ++var3) {
                if (var2[var3].option[0] == 285) {
                    return Utlis.c(var2[var3].option[1]) + "/" + DataCenter.gI().a(var2[var3].f());
                }
            }
        }

        return "0";
    }

    public final int y() {
        Item var1;
        if ((var1 = this.arrItemBody[0]) != null) {
            ItemOption[] var2 = var1.L();

            for (int var3 = 0; var3 < var2.length; ++var3) {
                if (var2[var3].option[0] == 285) {
                    return var2[var3].option[1];
                }
            }
        }

        return 0;
    }

    public final int z() {
        Item var1;
        if ((var1 = this.arrItemBody[0]) != null) {
            ItemOption[] var2 = var1.L();

            for (int var3 = 0; var3 < var2.length; ++var3) {
                if (var2[var3].option[0] == 407) {
                    return var2[var3].option[1];
                }
            }
        }

        return 0;
    }

    public final String A() {
        return Utlis.c(this.exp / 10L);
    }

    public static String a(long var0) {
        return Utlis.c(var0 / 10L);
    }

    private void aj() {
        if (this.bB && (this.p() || GameSrc.gI().focusEntity == null || !GameSrc.gI().focusEntity.equals(this))) {
            if (!this.be.contains(this.aZ)) {
                this.be.addElement(this.aZ);
            }
        } else {
            this.be.removeElement(this.aZ);
        }

        for (int var1 = this.be.size() - 1; var1 >= 0; --var1) {
            vdtt_hf var2;
            (var2 = (vdtt_hf) this.be.elementAt(var1)).a(this);
            if (var2.p()) {
                this.be.removeElement(var2);
            }
        }

    }

    public final void B() {
        GameSrc.gI().dd = GameSrc.gI().de;
        if (this.p() && !this.isDie()) {
            if (this.F()) {
                if (this.cx == this.cr && this.cy == this.cs) {
                    ++this.bI;
                    if (this.bI >= 40) {
                        this.ct = GameSrc.gI().pointMoveMap;
                        GameSrc.gI().pointMoveMap = null;
                        this.j();
                    }
                } else {
                    this.cr = this.cx;
                    this.cs = this.cy;
                    this.bI = 0;
                }
            } else if (this.bI >= 40) {
                ++this.bI;
                if (this.bI > 42) {
                    this.bI = 0;
                    if (this.ct != null) {
                        GameSrc.gI().pointMoveMap = this.ct;
                    }
                }
            }
        }

        try {
            if (this.cn.size() > 0 && System.currentTimeMillis() - this.co > 1000L) {
                this.aw();
            }

            this.am();
            this.bj = null;
            this.aJ = this.height + 4;
            if (this.bh != null && this.bh.a(this.k(), this.cy - this.height - 2)) {
                this.bh = null;
            }

            int var1 = Utlis.c();
            if (this.Y < var1) {
                this.n = 0;
            }

            if (this.hp <= 0 && this.status != 4 && this.status != 5) {
                this.ay();
            }

            vdtt_iw var2;
            if (!this.isDie()) {
                if (this.aU != null) {
                    this.status = 3;
                    this.G();
                } else if (this.pointMove != null && (this.status == 0 || this.status == 2)) {
                    if (this.pointMove.cx == this.cx && this.pointMove.cy == this.cy) {
                        if (!GameSrc.gI().o.e) {
                            var2 = null;
                            this.pointMove = null;
                            this.status = 0;
                        } else if (this.status == 0) {
                            var2 = null;
                            this.pointMove = null;
                        } else {
                            this.status = 2;
                        }
                    } else {
                        this.status = 2;
                    }
                }
            } else {
                var2 = null;
                this.aU = null;
                this.aV.clear();
            }

            if (this.p() && Y()) {
                if (SettingsTab.K().A() > 0 && this.hp < (int) ((float) this.hpFull * ((float) SettingsTab.K().A() / 100.0F))) {
                    GameSrc.gI().b(false);
                } else if (SettingsTab.K().B() > 0 && this.mp < (int) ((float) this.mpFull * ((float) SettingsTab.K().B() / 100.0F))) {
                    GameSrc.gI().b(false);
                }
            }

            boolean var3 = false;
            this.N = this.O = this.P = this.Q = this.R = this.S = this.T = this.U = this.V = this.W = this.X = this.bs = this.bN = this.bO = this.bP = false;
            this.cg = this.bt = this.bu = this.bx = this.by = this.bv = this.bw = this.bz = null;
            this.bV = this.bK = 0;
            this.bA.clear();
            boolean var4 = false;
            Effect var5 = null;

            Effect var6;
            for (int var7 = 0; var7 < this.ba.size(); ++var7) {
                Effect var8;
                if ((var8 = (Effect) this.ba.elementAt(var7)).i == this.bM) {
                    if (var8.a(51) != null) {
                        this.T = true;
                    }

                    if (var8.id == 132) {
                        var5 = var8;
                    }

                    if ((var6 = var8.a(145)) != null) {
                        this.cg = var6;
                    }

                    if (var8.getEffectTemplate().type != 77 && !var8.e()) {
                        if (var8.getEffectTemplate().type == 90) {
                            this.bv = var8;
                        } else if (var8.getEffectTemplate().type == 139) {
                            this.bw = var8;
                        } else if (var8.getEffectTemplate().type == 168) {
                            this.bw = var8;
                        } else if (var8.f()) {
                            this.bA.add(var8);
                        }
                    } else {
                        this.bu = var8;
                        this.V = var8.e();
                        if (var8.getEffectTemplate().type == 77 && this.sys >= 4) {
                            this.V = true;
                        } else if (var8.id != 90 && var8.id != 91 && var8.id != 92 || this.sys != 3 || var8.k != 0 && var8.k <= 3) {
                            if (var8.id == 89 && this.sys == 2 && (var8.k == 0 || var8.k == 3)) {
                                this.V = true;
                            }
                        } else {
                            this.V = true;
                        }
                    }

                    if (var8.id >= 122 && var8.id <= 130) {
                        this.bx = var8;
                    }

                    if (var8.g() && this.bK != 910) {
                        this.bK = -var8.j;
                    }

                    switch (var8.id) {
                        case 8:
                            this.N = true;
                            break;
                        case 9:
                            this.O = true;
                            break;
                        case 10:
                            this.P = true;
                            break;
                        case 11:
                            this.Q = true;
                            break;
                        case 12:
                            this.R = true;
                            var3 = true;
                            break;
                        case 35:
                        case 36:
                            var3 = true;
                            break;
                        case 38:
                            var3 = true;
                            this.S = true;
                            if (this.speedMove == -1) {
                                this.speedMove = this.J;
                            }
                            break;
                        case 53:
                            this.U = true;
                            break;
                        case 85:
                        case 86:
                        case 147:
                            this.bt = var8;
                            break;
                        case 109:
                            this.W = true;
                            var3 = true;
                            break;
                        case 113:
                            this.bz = var8;
                            break;
                        case 131:
                            var4 = true;
                            break;
                        case 140:
                            this.by = var8;
                            break;
                        case 146:
                        case 175:
                        case 197:
                            this.X = true;
                            var3 = true;
                            break;
                        case 151:
                            this.bt = var8;
                            this.bs = true;
                            break;
                        case 152:
                            this.bN = true;
                            break;
                        case 166:
                            this.bO = true;
                            var3 = true;
                            break;
                        case 170:
                            this.bP = true;
                            break;
                        case 173:
                            this.bt = var8;
                            break;
                        case 174:
                            this.bt = var8;
                            break;
                        case 179:
                        case 180:
                        case 181:
                        case 182:
                        case 183:
                        case 184:
                            this.bV = var8.id;
                    }
                }
            }

            if (var5 != null && GameSrc.gI().getMapTemplate().type != 21) {
                this.ba.remove(var5);
            }

            if (this.af() && GameSrc.gI().mapID >= 47 && GameSrc.gI().mapID <= 50) {
                this.cg = this.bt = this.bu = this.bx = this.bv = null;
            }

            if (!var4) {
                this.bS = null;
            }

            short var17 = 0;

            int var18;
            for (var18 = 0; var18 < this.ba.size(); ++var18) {
                (var6 = (Effect) this.ba.elementAt(var18)).a((Entity) this);
                if (var6.id == 84) {
                    var17 = (short) var6.b;
                }
            }

            short var9;
            if (var17 > 0) {
                if (this.bk == null) {
                    this.bk = new Mob(var17);
                    this.bk.hp = 1;
                    this.bk.c(this.cx, this.cy);
                    this.bk.rangeMove = this.bk.getMobTemplate().speedMoveByte;
                    this.bk.cx = this.cx;
                    this.bk.cy = this.cy;
                }

                this.bk.J = (short) (this.cx + (this.g ? -35 : 35));
                this.bk.K = this.cy;
                this.bk.status = 2;
                if (Utlis.b(this.bk.cx, this.bk.cy, this.bk.J, this.bk.K) > 300) {
                    ++this.bk.rangeMove;
                    this.bk.cx = this.cx;
                    this.bk.cy = this.cy;
                } else if (Utlis.b(this.bk.cx, this.bk.cy, this.bk.J, this.bk.K) > 20) {
                    ++this.bk.rangeMove;
                } else {
                    this.bk.rangeMove = this.bk.getMobTemplate().speedMoveByte;
                }

                var9 = this.bk.cx;
                short var10 = this.bk.cy;
                this.bk.r();
                this.bk.P = this.bk.cx;
                this.bk.Q = this.bk.cy;
                if (this.bk.cx == var9 && this.bk.cy == var10) {
                    this.bk.dir = this.aE;
                }

                (var2 = new vdtt_iw(0)).setXY(this.bk.cx, this.bk.cy);
                var2.p = this.bk;
                GameSrc.gI().a((Entity) var2);
            } else {
                this.bk = null;
            }

            if (this.arrItemBody[0] != null && !this.bM && this.ao == 1 && this.by == null && (GameSrc.gI().getMapTemplate().type != 20 || !this.p()) && (GameSrc.gI().getMapTemplate().type != 20 || this.m != 0)) {
                boolean var19 = this.bT == null;
                if (this.bT == null) {
                    this.bT = new Char();
                    this.bT.idEntity = -1;
                    this.bT.setXY(this.cx, this.cy);
                    this.bT.typePk = this.typePk;
                    this.bT.cx = (short) (this.cx + (this.g ? -35 : 35));
                    this.bT.cy = this.cy;
                    this.bT.sys = this.sys;
                    this.bT.bM = true;
                }

                int var20 = 0;

                while (true) {
                    if (var20 >= this.arrItemBody.length) {
                        this.bT.ba.clear();

                        for (var20 = 0; var20 < this.ba.size(); ++var20) {
                            Effect var11;
                            if ((var11 = (Effect) this.ba.get(var20)).i) {
                                this.bT.ba.add(var11);
                            }
                        }

                        this.bT.hpFull = this.ar;
                        this.bT.hp = this.ap;
                        this.bT.mpFull = this.as;
                        this.bT.mp = this.aq;
                        if (!this.bT.isDie()) {
                            if (this.bT.aU == null) {
                                var20 = Utlis.b(this.bT.cx, this.bT.cy, this.cx, this.cy);
                                if (this.bT.pointMove != null && Utlis.b(this.bT.pointMove.cx, this.bT.pointMove.cy, this.cx, this.cy) > var20) {
                                    var2 = null;
                                    this.bT.pointMove = null;
                                }

                                if (var20 > 35) {
                                    if (var20 > 20) {
                                        this.bT.a((short) (this.cx + (this.g ? -35 : 35)), this.cy, false);
                                    } else {
                                        this.bT.a((short) (this.cx + (this.g ? -35 : 35)), this.cy, true);
                                    }
                                } else if (this.U() == null && this.bT.U() != null) {
                                    this.bT.a(this.cx, this.cy, true);
                                } else {
                                    var2 = null;
                                    this.bT.pointMove = null;
                                    this.bT.bc.clear();
                                    this.bT.status = 0;
                                }
                            }
                        } else if (!var19 && this.bT.hp > 0) {
                            this.bT.X();
                        }

                        this.bT.B();
                        if (!Utlis.e() && !this.bB) {
                            GameSrc.gI().a((Entity) this.bT);
                        }
                        break;
                    }

                    if (this.arrItemBody[var20] != null && this.arrItemBody[var20].x()) {
                        this.bT.arrItemBody[var20] = this.arrItemBody[var20];
                    } else {
                        this.bT.arrItemBody[var20] = null;
                    }

                    ++var20;
                }
            } else {
                this.bT = null;
            }

            if (!this.S) {
                this.speedMove = -1;
            }

            if (var3) {
                var5 = null;
                this.pointMove = null;
                this.o();
            }

            this.a(var3);
            if (this.Z > 0) {
                --this.Z;
            }

            this.bd.clear();
            this.bd.addAll(this.aa());

            for (var18 = 0; var18 < this.ba.size(); ++var18) {
                if ((var6 = (Effect) this.ba.elementAt(var18)).j < 0 && !var6.g()) {
                    this.a(this.bd, -var6.j, 0);
                }
            }

            this.aA();
            if (DataCenter.gI().currentScreen instanceof SelectCharScreen) {
                this.j();
            } else if (!this.p() && this.bc.size() > 0 && this.status != 2 && this.status != 7) {
                this.an();
            }

            if ((this.pointMove == null || !this.pointMove.j) && GameSrc.gI().dd == 0 && this.p() && !this.q() && !this.ah()) {
                var9 = this.cy;
                XYEntity var23;
                if ((var23 = a(this.cx, var9, (int) 1)) != null) {
                    this.aM = var23.cx;
                    this.aN = var23.cy;
                    if (this.aF == 0) {
                        this.cb = 0;
                    }

                    this.aF = 2;
                    this.status = 7;
                    if (GameSrc.gI().pointMoveMap != null && this.pointMove != null) {
                        var9 = this.pointMove.cy;
                        if (a(this.pointMove.cx, var9, (int) 1) != null) {
                            var2 = null;
                            this.pointMove = null;
                            GameSrc.gI().pointMoveMap = null;
                            GameSrc.gI().c(Caption.wh, -2560);
                        }
                    }
                }
            }

            switch (this.status) {
                case 0:
                    this.W();
                    this.au();
                    this.aH = this.cx;
                    this.aI = this.cy;
                case 1:
                default:
                    break;
                case 2:
                    if (!var3) {
                        this.an();
                    } else {
                        this.j();
                    }
                    break;
                case 3:
                    if (!this.p()) {
                        if (this.bc.size() > 0) {
                            this.pointMove = (vdtt_gj) this.bc.lastElement();
                            this.bc.clear();
                        }

                        if (this.pointMove != null) {
                            ++this.pointMove.c;
                        }

                        this.an();
                        this.status = 3;
                    }

                    this.W();
                    this.av();
                    this.aH = this.cx;
                    this.aI = this.cy;
                    break;
                case 4:
                    this.aq();
                    this.aH = this.cx;
                    this.aI = this.cy;
                    break;
                case 5:
                    this.ay();
                    break;
                case 6:
                    this.aH = this.cx;
                    this.aI = this.cy;
                    break;
                case 7:
                    if (this.q()) {
                        this.an();
                    } else {
                        this.ar();
                    }
            }

            if (this.status != 5) {
                this.ce = 0;
            }

            MoveSmart.d();
            if (this.dir == 2) {
                this.g = true;
            } else {
                this.g = false;
            }

            if (this.aW != null) {
                this.aw = -1;
                if (!this.aW.a()) {
                    this.aW = null;
                    this.W();
                }
            }

            vdtt_gj var21;
            if (this.p() && Utlis.a() - GameSrc.gI().ce > 5000L && GameSrc.gI().cg != 0 && GameSrc.gI().ch != 0 && GameSrc.gI().cg == this.cx && GameSrc.gI().ch == this.cy) {
                var21 = new vdtt_gj(GameSrc.gI().cg, GameSrc.gI().ch, this.typePk);
                this.pointMove = var21;
                GameSrc.gI().cg = GameSrc.gI().ch = 0;
            }

            if (this.aX != null && this.aX.a()) {
                if (this.bM) {
                    Utlis.b();
                    this.a((short) (this.aX.b.cx - 12), this.aX.b.cy);
                }

                this.a(this.aX.a, this.aX.b, false);
                if (this.p()) {
                    GameSrc var22 = GameSrc.gI();
                    var4 = true;
                    var22.aW = var4;
                    GameSrc.gI().focusEntity = this.aX.b;
                }

                this.aX = null;
            }

            if (!super.a(this.cx, this.cy) && !GameSrc.gI().cn) {
                var21 = new vdtt_gj(this.cx, this.cy, this.typePk);
                this.a(var21, 1, false);
                this.cx = var21.cx;
                this.cy = var21.cy;
            }

            this.aj();
            return;
        } catch (Exception var15) {
        } finally {
            gI().W();
        }

    }

    public final int[] d(int var1) {
        for (int var2 = 0; var2 < gI().arrItemBag.length; ++var2) {
            if (this.arrItemBag[var2] != null && this.arrItemBag[var2].id == var1) {
                return new int[]{var2 % 9 * 32, var2 / 9 * 32};
            }
        }

        return null;
    }

    public final Item C() {
        for (int var1 = gI().arrItemBag.length - 1; var1 >= 0; --var1) {
            if (this.arrItemBag[var1] != null && this.arrItemBag[var1].getItemTemplate().type == 1) {
                return this.arrItemBag[var1];
            }
        }

        return null;
    }

    public final boolean a(ItemMap var1) {
        for (int var2 = 0; var2 < this.arrItemBag.length; ++var2) {
            Item var3;
            if ((var3 = this.arrItemBag[var2]) == null || var1 != null && var1.item.id == var3.id && var3.getItemTemplate().isXepChong && var3.h == var1.item.h) {
                return false;
            }
        }

        return true;
    }

    public final Item e(int var1) {
        Item var2 = null;

        for (int var3 = 0; var3 < this.arrItemBag.length; ++var3) {
            if ((var2 = this.arrItemBag[var3]) != null && var2.id == var1) {
                return var2;
            }
        }

        return var2;
    }

    public final int D() {
        int var1 = 0;

        for (int var2 = 0; var2 < this.arrItemBag.length; ++var2) {
            if (this.arrItemBag[var2] == null) {
                ++var1;
            }
        }

        return var1;
    }

    public final boolean E() {
        return this.bB;
    }

    private boolean ak() {
        return this.bU > 0;
    }

    public final void paintTop(Graphics var1) {
        try {
            if ((this.p() || GameSrc.gI().mapID != 86 || this.cy < 440 || this.cy > 442 || this.cx < 1246 || this.cx > 1280 || this.status != 0) && !this.ah() && !this.ak()) {
                if (this.af()) {
                    this.bQ = GameSrc.P++;
                    if (this.bQ >= GameSrc.O.length || GameSrc.gI().getMapTemplate().id == 46 && this.m == 0) {
                        return;
                    }
                }

                if (this.aX == null && !Utlis.e() && !this.bB) {
                    if (this.status != 3 && !this.af()) {
                        byte var2;
                        if (this.bR > 0) {
                            --this.bR;
                            var2 = 30;
                            this.J = (short) var2;
                        } else if (!this.p() && this.J >= 18 && this.J <= 29 && this.cA > 0) {
                            if (this.cA > 15) {
                                this.cA = 15;
                            }

                            --this.cA;
                            var2 = 30;
                            this.J = (short) var2;
                        } else {
                            label350:
                            {
                                if (this.aD == 2) {
                                    this.p();
                                    this.cj.paintTop(var1);
                                } else if (this.J >= 30 && this.J <= 35) {
                                    ++this.cA;
                                    break label350;
                                }

                                this.cA = 0;
                            }
                        }

                        if (this.J >= 30 && this.J <= 35) {
                            short var3 = (short) (30 + DataCenter.gI().h / 4 % 6);
                            this.J = var3;
                            var2 = 20;
                            if (this.bt != null) {
                                var2 = 16;
                            }

                            if (this.aE == 3) {
                                this.ck.o = true;
                                this.ck.setXY(this.cx + var2, this.cy - 24);
                            } else {
                                this.ck.o = false;
                                this.ck.setXY(this.cx - var2, this.cy - 24);
                            }

                            this.ck.n();
                            if (this.cA > 15 || !this.p()) {
                                this.ck.paintTop(var1);
                            }
                        } else if (!this.p() && this.J >= 12 && this.J <= 17 && (this.pointMove != null && this.pointMove.cy < this.cy || this.bc.size() > 0 && ((vdtt_gj) this.bc.get(0)).cy < this.cy)) {
                            var2 = 18;
                            this.J = (short) var2;
                        }
                    }

                    if (this.p() || !(DataCenter.gI().currentScreen instanceof GameSrc) || !mConfig.gI().a(11) || GameSrc.gI().focusEntity != null && GameSrc.gI().focusEntity.equals(this) || GameSrc.gI().getMapTemplate().type == 10 && this.m != 0) {
                        label355:
                        {
                            Graphics var10 = var1;
                            Char var9 = this;
                            int var4 = this.J;
                            if (this.status == 2 && this.U() != null && var4 >= 12 && var4 <= 17) {
                                var4 += 18;
                            }

                            if (this.S) {
                                var4 = this.speedMove;
                            } else if (this.bJ > 0) {
                                --this.bJ;
                                if (this.bJ < 5 && this.aU == null && this.status == 0) {
                                    var4 = 37;
                                }
                            }

                            if (this.bE > 0) {
                                if (this.bE % 2 == 0) {
                                    var1.a(1.2F, 0.5F);
                                }

                                --this.bE;
                            }

                            int var5 = 0;
                            if (this.T) {
                                for (int var6 = 0; var6 < var9.bb.size(); ++var6) {
                                    Char var7;
                                    if ((var7 = (Char) var9.bb.get(var6)).cx != var9.cx || var7.cy != var9.cy) {
                                        ++var5;
                                        var10.d(80);
                                        var7.a(var10, var7.cx, var7.cy, var9.bd, var9.J, var7.typeGiaoDich, var9.aE == 3);
                                        var10.m = 1.0F;
                                    }
                                }

                                if (var5 > 0) {
                                    var9.bn = 0;
                                }
                            }

                            if (var9.bq) {
                                var10.c(-649022);
                            }

                            if (var9.N) {
                                var10.c(-7452415);
                            } else if (var9.O) {
                                var10.c(-5765899);
                            } else if (var9.P) {
                                var10.c(-14466309);
                            } else if (var9.Q) {
                                var10.c(-181445);
                            } else if (var9.R) {
                                if (var9.isDie()) {
                                    var4 = 36;
                                } else {
                                    var4 = 37;
                                }
                            }

                            if (var9.aX != null) {
                                if (var9.aX.c < vdtt_eb.d - 8) {
                                    vdtt_cz.b(var10, 4336, var9.aE == 3 ? -360 : 0, var9.cx, var9.cy, 33);
                                    break label355;
                                }

                                var4 = 2;
                            }

                            if (var9.U) {
                                if (!var9.p()) {
                                    break label355;
                                }

                                var10.d(40);
                            }

                            var9.a(var10, var9.cx, var9.cy, var9.bd, var4, var9.typeGiaoDich, var9.aE == 3);
                            if (var5 == 0 && var9.bn > 0) {
                                if (var9.aE == 2) {
                                    if (var9.bn < 95) {
                                        var9.a(var10, var9.cx + 40, var9.cy, var9.bd, var4, var9.typeGiaoDich, var9.aE == 3);
                                    }

                                    if (var9.bn < 90) {
                                        var9.a(var10, var9.cx - 40, var9.cy, var9.bd, var4, var9.typeGiaoDich, var9.aE == 3);
                                    }
                                } else {
                                    if (var9.bn < 95) {
                                        var9.a(var10, var9.cx - 40, var9.cy, var9.bd, var4, var9.typeGiaoDich, var9.aE == 3);
                                    }

                                    if (var9.bn < 90) {
                                        var9.a(var10, var9.cx + 40, var9.cy, var9.bd, var4, var9.typeGiaoDich, var9.aE == 3);
                                    }
                                }
                            }

                            var10.m = 1.0F;
                            var10.f();
                            if (var9.h(146) != null) {
                                vdtt_cz.b(var10, 5765, 0, var9.cx + 2, var9.cy - 9 + (!var9.isDie() ? DataCenter.gI().h / 5 % 2 : 0), 33);
                            }
                        }
                    }

                    var1.r();
                }
            }
        } catch (Exception var8) {
            Utlis.a(var8);
        }

    }

    public final boolean F() {
        return this.p() && GameSrc.gI().pointMoveMap != null;
    }

    public final void a(Graphics var1, int var2, int var3, Vector var4, int var5, int var6, boolean var7) {
        if (this.bO) {
            vdtt_cz.b(var1, 6319, 0, var2, var3, 33);
        } else if (this.bN) {
            vdtt_cz.a(var1, 437, var7 ? -360 : 0, var2, var3 - 22, 3);
        } else if (this.bP) {
            vdtt_cz.a(var1, 382, var7 ? -360 : 0, var2, var3 - 5, 3);
        } else {
            if (this.W) {
                var5 = 154;
                var7 = true;
            } else if (this.X && !this.isDie()) {
                var5 = DataCenter.gI().h / 5 % 2;
            }

            if (this.af() && GameSrc.gI().mapID >= 47 && GameSrc.gI().mapID <= 50) {
                if (this.bQ >= GameSrc.O.length) {
                    return;
                }

                var2 = GameSrc.O[this.bQ][0];
                var3 = GameSrc.O[this.bQ][1];
                var7 = var2 > GameSrc.gI().maxX / 2;
                var5 = 6 + DataCenter.gI().h / 5 % 6;
                if (GameSrc.gI().mapID >= 49 && GameSrc.gI().mapID <= 50) {
                    var5 = 36;
                }

                var6 = 0;
                if (var7) {
                    vdtt_y.c(var1, 208, 0, var2 - 15, var3 - 4, 90);
                } else {
                    vdtt_y.c(var1, 208, 0, var2 - 14, var3 - 4, 90);
                }
            }

            this.a(var1, var2, var3, var4, var5, var6, var7, false);
            if (this.af()) {
                if (GameSrc.gI().mapID >= 47 && GameSrc.gI().mapID <= 48) {
                    this.a(var1, var2, var3 - 56, 2);
                    return;
                }

                if (GameSrc.gI().mapID >= 49 && GameSrc.gI().mapID <= 50) {
                    this.a(var1, var2, var3 - 44, 2);
                }
            }
        }

    }

    public final void a(Graphics var1, int var2, int var3, Vector var4, int var5, int var6, boolean var7, boolean var8) {
        this.a(var1, var2, var3, var4, var5, var6, var7, var8, this.bM, false);
    }

    public final void a(Graphics var1, int var2, int var3, Vector var4, int var5, int var6, boolean var7, boolean var8, boolean var9, boolean var10) {
        vdtt_gz var11;
        if (DataCenter.k() || DataCenter.l()) {
            var4.clear();
            this.bt = null;
            int[] var12 = new int[]{504, 507, 506, 504, 505, 504};
            int var13 = var12[this.sys];
            var11 = DataCenter.gI().y[var13].a();
            var4.add(var11);
            var4.add(DataCenter.gI().y[920].a());
            var4.add(DataCenter.gI().y[921].a());
        }

        Effect var25 = this.bt;
        if (var10 && var9) {
            if (this.bT != null) {
                var25 = this.bT.bt;
            } else {
                var25 = null;
            }
        }

        byte var26 = 0;
        byte var14 = 50;
        boolean var15 = false;
        boolean var16 = false;

        int var17;
        for (var17 = 0; var17 < var4.size(); ++var17) {
            if ((var11 = (vdtt_gz) var4.elementAt(var17)).b()) {
                var15 = true;
            }

            if (var11.c == 588) {
                var16 = true;
                switch (var5) {
                    case 12:
                    case 13:
                        var26 = 22;
                        break;
                    case 14:
                        var26 = 23;
                        break;
                    case 15:
                        var26 = 23;
                        break;
                    case 16:
                        var26 = 21;
                        break;
                    case 17:
                        var26 = 21;
                        break;
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                        var14 = 9;
                        break;
                    case 148:
                        var26 = 23;
                        var14 = 12;
                        break;
                    case 149:
                        var26 = 19;
                        var14 = 9;
                }
            }
        }

        if (var15) {
            for (var17 = 0; var17 < var4.size(); ++var17) {
                if ((var11 = (vdtt_gz) var4.elementAt(var17)).c == 5 || var11.c == 44) {
                    var15 = false;
                    break;
                }

                if (var11.c != 72 && var11.c != 78) {
                    if (var11.c != 772 && var11.c != 780 && var11.c != 788) {
                        if (var11.c == 183) {
                            DataCenter.gI().y[424].a(var11);
                        } else if (DataCenter.gI().z[var11.c].b.length > 3) {
                            DataCenter.gI().y[DataCenter.gI().z[var11.c].b[3]].a(var11);
                        }
                    } else {
                        DataCenter.gI().y[892].a(var11);
                    }
                } else {
                    DataCenter.gI().y[425].a(var11);
                }
            }
        }

        a(var4, var5);
        var10 = true;
        var1.k = var10;

        for (var17 = 0; var17 < var4.size(); ++var17) {
            if ((!(var11 = (vdtt_gz) var4.elementAt(var17)).b() || var15) && (var11.d != 8 || !var16) && (!var11.g || !this.isDie())) {
                int var18 = var5;
                int var19 = var11.h[var5].a;
                if (var11.c()) {
                    var18 = var6;
                }

                if (var8 && var11.d == 1) {
                    var1.p();
                } else if (var11.f == -1) {
                    if (DataCenter.aR.contains((short) var19)) {
                        if (var19 >= 1591 && var19 <= 1596) {
                            var19 = 1193 + (var19 - var11.h[0].a);
                        } else {
                            var19 = 820 + (var19 - var11.h[0].a);
                        }
                    } else {
                        var1.q();
                    }
                } else if (var11.f != 0) {
                    if (var11.d == 11) {
                        var1.c((float) var11.f);
                    } else {
                        var1.c(var11.f);
                    }
                }

                if (this.bs && var19 >= 5771 && var19 <= 5831) {
                    var19 += 1814;
                }

                int var20 = var1.e;
                int var21 = var1.f;
                if (!var15 || var11.d != 10) {
                    if (var11.d == 2 && (var26 != 0 || var14 != 50) && var11.c != 588) {
                        if (var26 == 0) {
                            if (!var7) {
                                var1.d(var2 - var14, var3 + var11.h[var18].e - 36, 50 + var14, 36);
                            } else {
                                var1.d(var2 - 50, var3 + var11.h[var18].e - 36, 50 + var14, 36);
                            }
                        } else if (var7) {
                            var1.d(var2 - var14, var3 + var11.h[var18].e - 36, 50 + var14, var26);
                        } else {
                            var1.d(var2 - 50, var3 + var11.h[var18].e - 36, 50 + var14, var26);
                        }
                    }

                    if (var18 < 6 && this.ch && !var11.c()) {
                        var18 += 6;
                    }

                    if (var25 == null && var11.d == 2 && o(var18)) {
                        if (this.ae()) {
                            var1.d(var2 - 148, var3 + var11.h[var18].e - 200, 159, 200);
                        } else {
                            var1.d(var2 - 150, var3 + var11.h[var18].e - 200, 159, 200);
                        }
                    }

                    if (var11.g) {
                        var19 = var11.h[0].a + DataCenter.gI().h / 3 % 6;
                    } else if (var11.d() && var18 >= 38 && !this.W && !this.X) {
                        if (var19 != var11.h[0].a && var19 != var11.h[1].a && var19 != var11.h[2].a) {
                            if (var19 == var11.h[12].a || var19 == var11.h[13].a || var19 == var11.h[14].a) {
                                var19 = var11.h[DataCenter.gI().h / 3 % 3 + 12].a;
                            }
                        } else {
                            var19 = var11.h[DataCenter.gI().h / 3 % 3].a;
                        }
                    }

                    if (var18 >= 66 && var18 <= 72 || var18 >= 121 && var18 <= 127) {
                        if (this.aU != null) {
                            if (var11.d == 3) {
                                if (this.aU.d.d == 4) {
                                    var19 += 2;
                                } else if (this.aU.d.d == 44) {
                                    ++var19;
                                }
                            }
                        } else {
                            var18 = 0;
                            var19 = 0;
                        }
                    }

                    if (var15 && var18 != 36 && var18 != 37) {
                        var19 = this.m(var19);
                    }

                    if ((var19 = this.n(var19)) >= 5992 && var19 <= 6005) {
                        var19 = 5992 + DataCenter.gI().h / 3 % 14;
                    }

                    if (this.bz == null || !DataCenter.aR.contains((short) var19)) {
                        int var22;
                        byte var23;
                        if (var25 != null && !var11.c() && !var9) {
                            var22 = var25.d();
                            var23 = 0;
                            if (var22 < 800) {
                                if (var11.d == 1 && this.ci) {
                                    if (var11.c == 5) {
                                        var23 = 2;
                                    } else {
                                        var23 = 1;
                                    }
                                }

                                if (this.ci) {
                                    if (var7) {
                                        vdtt_y.c(var1, var19, Utlis.a(var7 != var11.h[var18].f, var11.h[var18].b), var2 - var11.h[var18].d, var3 + var23 + var11.h[var18].e * 82 / 100, 82, 33);
                                    } else {
                                        vdtt_y.c(var1, var19, Utlis.a(var7 != var11.h[var18].f, var11.h[var18].b), var2 + var11.h[var18].d, var3 + var23 + var11.h[var18].e * 82 / 100, 82, 33);
                                    }
                                } else if (var7) {
                                    vdtt_cz.b(var1, var19, Utlis.a(var7 != var11.h[var18].f, var11.h[var18].b), var2 - var11.h[var18].d, var3 + var23 + var11.h[var18].e, 33);
                                } else {
                                    vdtt_cz.b(var1, var19, Utlis.a(var7 != var11.h[var18].f, var11.h[var18].b), var2 + var11.h[var18].d, var3 + var23 + var11.h[var18].e, 33);
                                }
                            } else if (var25.e - var22 < 2500) {
                                if (var11.d == 1) {
                                    if (var11.c == 5) {
                                        var23 = 2;
                                    } else {
                                        var23 = 1;
                                    }
                                }

                                var22 = 20 - (var25.e - var22) / 150;
                                int var24;
                                if ((var24 = 100 - var22) < 82 || var22 < 0) {
                                    var24 = 82;
                                }

                                if (var7) {
                                    vdtt_y.c(var1, var19, Utlis.a(var7 != var11.h[var18].f, var11.h[var18].b), var2 - var11.h[var18].d, var3 + var23 + var11.h[var18].e * var24 / 100, var24, 33);
                                } else {
                                    vdtt_y.c(var1, var19, Utlis.a(var7 != var11.h[var18].f, var11.h[var18].b), var2 + var11.h[var18].d, var3 + var23 + var11.h[var18].e * var24 / 100, var24, 33);
                                }
                            } else if (var22 < 3000) {
                                if (var11.d == 1) {
                                    if (var11.c == 5) {
                                        var23 = 2;
                                    } else {
                                        var23 = 1;
                                    }
                                }

                                if ((var22 = 82 + var22 / 125) > 104) {
                                    var22 = 104;
                                }

                                if (var7) {
                                    vdtt_y.c(var1, var19, Utlis.a(var7 != var11.h[var18].f, var11.h[var18].b), var2 - var11.h[var18].d, var3 + var23 + var11.h[var18].e * var22 / 100, var22, 33);
                                } else {
                                    vdtt_y.c(var1, var19, Utlis.a(var7 != var11.h[var18].f, var11.h[var18].b), var2 + var11.h[var18].d, var3 + var23 + var11.h[var18].e * var22 / 100, var22, 33);
                                }
                            } else if (var7) {
                                vdtt_cz.b(var1, var19, Utlis.a(var7 != var11.h[var18].f, var11.h[var18].b), var2 - var11.h[var18].d, var3 + var11.h[var18].e, 33);
                            } else {
                                vdtt_cz.b(var1, var19, Utlis.a(var7 != var11.h[var18].f, var11.h[var18].b), var2 + var11.h[var18].d, var3 + var11.h[var18].e, 33);
                            }
                        } else {
                            if (var11.c()) {
                                if ((var19 = var11.h[var18].a) >= 7762 && var19 <= 7770) {
                                    if (this.status == 0) {
                                        var19 = 7762 + DataCenter.gI().h / 4 % 3;
                                    } else {
                                        var19 = 7765 + DataCenter.gI().h / 2 % 6;
                                    }
                                } else if (var19 >= 8164 && var19 <= 8170) {
                                    if (this.status == 0) {
                                        var19 = 8164 + DataCenter.gI().h / 6 % 2;
                                    } else {
                                        var19 = 8166 + DataCenter.gI().h / 4 % 5;
                                    }
                                }
                            }

                            if (var9) {
                                var22 = 0;
                                var23 = 78;
                                if (var25 != null) {
                                    var23 = 83;
                                } else if (var11.b()) {
                                    var23 = 79;
                                }

                                if (var25 == null) {
                                    if (var11.d == 1 && var18 >= 24 && var18 <= 29) {
                                        var22 = 1 + var18 % 2;
                                    }

                                    if (var11.d == 8 && var18 >= 18 && var18 <= 23) {
                                        var22 = -var18 % 2;
                                    }
                                } else if (var11.d == 1 && (var11.c == 44 && var18 < 18 || var18 < 12)) {
                                    var22 = 1;
                                }

                                if (var18 >= 30 && var18 <= 35) {
                                    var18 = 30;
                                }

                                if (var7) {
                                    vdtt_y.c(var1, var19, Utlis.a(var7 != var11.h[var18].f, var11.h[var18].b), var2 - var11.h[var18].d, var3 + var22 + var11.h[var18].e * var23 / 100, var23, 33);
                                } else {
                                    vdtt_y.c(var1, var19, Utlis.a(var7 != var11.h[var18].f, var11.h[var18].b), var2 + var11.h[var18].d, var3 + var22 + var11.h[var18].e * var23 / 100, var23, 33);
                                }
                            } else if (var7) {
                                vdtt_cz.b(var1, var19, Utlis.a(var7 != var11.h[var18].f, var11.h[var18].b), var2 - var11.h[var18].d, var3 + var11.h[var18].e, 33);
                            } else {
                                vdtt_cz.b(var1, var19, Utlis.a(var7 != var11.h[var18].f, var11.h[var18].b), var2 + var11.h[var18].d, var3 + var11.h[var18].e, 33);
                            }
                        }

                        if (var8 && var11.d == 1) {
                            var1.r();
                        } else if (var11.f == -1 && !DataCenter.aR.contains((short) var19)) {
                            var1.r();
                        } else if (var11.f != 0) {
                            if (var11.d == 11) {
                                var1.r();
                            } else {
                                var1.f();
                            }
                        }

                        if (var25 == null && var11.d == 2 && o(var18) || var11.d == 2 && (var26 != 0 || var14 != 50) && var11.c != 588) {
                            var1.a(-var1.e, -var1.f);
                            var1.a(0, 0);
                            var1.d(0, 0, DataCenter.gI().n, DataCenter.gI().o);
                            var1.a(var20, var21);
                        }
                    }
                }
            }
        }

        var10 = false;
        var1.k = var10;
    }

    private void al() {
        this.status = 7;
        this.aM = this.cx;
        this.aN = this.cy;
        this.aF = 1;
    }

    private void am() {
        if (DataCenter.gI().h % 4 == 0) {
            if (this.bb.size() >= 3) {
                this.bb.remove(0);
            }

            Char var1;
            (var1 = new Char()).sys = this.sys;
            var1.setXY(this.cx, this.cy);
            var1.status = this.status;
            var1.dir = this.dir;
            var1.aE = this.aE;
            short var2 = this.J;
            var1.J = var2;
            var1.bd.addAll(this.bd);
            this.bb.add(var1);
        }

        if (this.bn > 0) {
            --this.bn;
        }

    }

    private boolean an() {
        try {
            this.bX = this.cx;
            this.bY = this.cy;
            int var1 = 0;
            int var2 = 0;
            boolean var3 = false;
            if (this.arrItemBody[10] != null && this.aw <= 50) {
                ++this.aw;
            }

            if (this.pointMove != null) {
                this.a(this.pointMove);
                int var4;
                int var5;
                if (this.pointMove.c != 0) {
                    var4 = this.pointMove.c + this.bc.size();
                    var5 = this.pointMove.c + this.bc.size();
                } else {
                    var4 = this.pointMove.a;
                    var5 = this.pointMove.b;
                }

                if (this.aW != null) {
                    var4 = 11;
                    var5 = 11;
                    var3 = true;
                }

                if (this.p() && GameSrc.gI().getMapTemplate().type == 20) {
                    var4 = 10;
                    var5 = 10;
                }

                int var6;
                int var7;
                if (this.pointMove.g > 0) {
                    vdtt_gj var8;
                    if ((var8 = this.pointMove).p > 0) {
                        --var8.p;
                        this.status = 6;
                        if (var8.p <= 0) {
                            this.status = 7;
                            ++var8.g;
                        }
                    }

                    var6 = 0;
                    if (var8.g > 0) {
                        var8.d = var8.cy;
                        if (SettingsTab.K().V && !var8.k) {
                            var8.g = 0;
                        } else {
                            label389:
                            {
                                if (var8.n != 0) {
                                    if (var8.n > var8.cx) {
                                        var8.cx = (short) (var8.cx + 6);
                                    } else if (var8.n < var8.cx) {
                                        var8.cx = (short) (var8.cx - 6);
                                    }

                                    if (Utlis.b(var8.n - var8.cx) <= 6) {
                                        var8.cx = var8.n;
                                    }
                                }

                                var7 = var8.cx - this.cx;
                                int var9;
                                if (var8.a()) {
                                    var8.e = var8.d - this.cy << 2;
                                    var8.f += var8.e;
                                    var6 = var8.f >> 2;
                                    var8.f &= 15;
                                    var9 = var8.m ? 30 : 10;
                                    if (Utlis.b(var8.h - this.cy) > var8.i) {
                                        var9 = var8.c;
                                    }

                                    if (var6 < -var9) {
                                        var6 = -var9;
                                    }

                                    if (var6 >= 0) {
                                        var6 = -1;
                                    }

                                    if (this.cy + var6 <= var8.d) {
                                        if (var8.j) {
                                            this.cy = var8.cy;
                                            this.cx = var8.cx;
                                            if (var8.o != 0) {
                                                var8.cy = var8.o;
                                                var8.d = var8.cy;
                                                var8.e = var8.f = 0;
                                                var8.e = 0;
                                                ++var8.g;
                                            } else {
                                                var8.g = 0;
                                            }
                                            break label389;
                                        }

                                        var6 = 0;
                                        var8.d = var8.cy;
                                        var8.e = var8.f = 0;
                                        var8.e = 0;
                                        if (!var8.m) {
                                            ++var8.g;
                                        }
                                    }
                                } else if (var8.b()) {
                                    if (var8.o != 0) {
                                        var8.cy = var8.o;
                                    }

                                    if (!var8.l) {
                                        var6 = this.cy + 0;
                                        XYEntity var14;
                                        if ((var14 = a(this.cx, var6, (int) 1)) != null) {
                                            var8.cy = (short) (var14.cy - 1);
                                        }
                                    }

                                    if (var8.m) {
                                        var8.e += 3;
                                    } else {
                                        ++var8.e;
                                    }

                                    var6 = var8.e;
                                    if (this.cy + var6 >= var8.cy) {
                                        var6 = var8.cy - this.cy;
                                        if (!var8.l) {
                                            var8.g = 0;
                                            this.I();
                                            var8.l = false;
                                            if (var8.m) {
                                                GameSrc.gI().cO = 35;
                                            }
                                        }
                                    }
                                }

                                var9 = this.cx + var7;
                                short var10 = this.cy;
                                if (GameSrc.gI().V.a(var9, var10 + var6)) {
                                    var7 = 0;
                                }

                                this.cx = (short) (this.cx + var7);
                                if (this.cx <= 16) {
                                    this.cx = 16;
                                } else if (this.cx >= GameSrc.gI().maxX - 16) {
                                    this.cx = (short) (GameSrc.gI().maxX - 16);
                                }

                                this.cy = (short) (this.cy + var6);
                            }
                        }
                    }

                    this.K();
                } else if (this.cx != this.pointMove.cx && this.cy != this.pointMove.cy) {
                    var3 = true;
                    var6 = Utlis.b(this.cx, this.pointMove.cx);
                    var7 = Utlis.b(this.cy, this.pointMove.cy);
                    if (var6 < var4) {
                        var4 = var6;
                    }

                    if (var7 < var5) {
                        var5 = var7;
                    }

                    if (var6 > var7) {
                        var1 = var4;
                        var2 = var7 / (var6 / var4);
                    } else if (var7 > var6) {
                        var2 = var5;
                        var1 = var6 / (var7 / var5);
                    } else {
                        var1 = var4;
                        var2 = var5;
                    }

                    if (this.pointMove.cx < this.cx) {
                        var1 = -var1;
                    }

                    if (this.pointMove.cy < this.cy) {
                        var2 = -var2;
                    }
                } else {
                    if (Utlis.b(this.cx, this.cy, this.pointMove.cx, this.pointMove.cy) < 20) {
                        if (this.cy < this.pointMove.cy) {
                            var2 = var5;
                        } else if (this.cy > this.pointMove.cy) {
                            var2 = -var5;
                        } else if (this.cx < this.pointMove.cx) {
                            var1 = var4;
                        } else if (this.cx > this.pointMove.cx) {
                            var1 = -var4;
                        }
                    } else if (this.cy < this.pointMove.cy) {
                        var2 = var5;
                    } else if (this.cy > this.pointMove.cy) {
                        var2 = -var5;
                    } else if (this.cx < this.pointMove.cx) {
                        var1 = var4;
                    } else if (this.cx > this.pointMove.cx) {
                        var1 = -var4;
                    }

                    var4 = Utlis.b(this.cx, this.pointMove.cx);
                    var5 = Utlis.b(this.cy, this.pointMove.cy);
                    if (var4 < Utlis.b(var1)) {
                        var1 = var1 > 0 ? var4 : -var4;
                    }

                    if (var5 < Utlis.b(var2)) {
                        var2 = var2 > 0 ? var5 : -var5;
                    }
                }
            }

            this.cx = (short) (this.cx + var1);
            this.cy = (short) (this.cy + var2);
            this.aH = this.cx;
            this.aI = this.cy;
            XYEntity var12;
            if (var2 < 0 && var1 == 0) {
                this.aD = 3;
                this.ap();
                if (!this.p()) {
                    this.dir = 1;
                }
            } else if (var2 > 0 && (var1 == 0 || !this.p() && this.dir == 0 && this.cq < 10)) {
                this.aD = 4;
                if (!this.p()) {
                    this.dir = 0;
                }

                if (!this.af() && this.U() == null && !this.ah() && (this.pointMove == null || this.pointMove.g == 0)) {
                    this.I();
                }
            } else {
                if ((var12 = this.U()) == null) {
                    ++this.aG;
                } else {
                    this.aG = 0;
                }

                if (var12 != null || this.aF == 2 || !this.p() && (this.aG < 2 || this.cq >= 10)) {
                    this.aD = 100;
                    this.ap();
                } else {
                    this.aD = 2;
                    this.ao();
                }
            }

            if (this.pointMove != null && this.cx == this.pointMove.cx && this.cy == this.pointMove.cy || this.pointMove == null && this.bc.size() == 0) {
                if (this.pointMove == null && this.bc.size() == 0) {
                    var12 = null;
                    this.pointMove = (vdtt_gj) var12;
                    this.j();
                } else if (this.pointMove.g != 1 && this.pointMove.g != 2) {
                    var12 = null;
                    this.pointMove = (vdtt_gj) var12;
                    this.j();
                }
            }

            if (this.pointMove == null && this.bc.size() > 0) {
                vdtt_gj var13 = (vdtt_gj) this.bc.firstElement();
                this.pointMove = var13;
                if (this.cx == this.pointMove.cx && this.pointMove.cy > this.cy) {
                    if (this.cm < this.pointMove.c) {
                        this.cm = this.pointMove.c;
                    }

                    if (Utlis.a((int) 3) < 2) {
                        ++this.cm;
                    }

                    this.pointMove.c = this.cm;
                } else {
                    this.cm = 0;
                }

                this.bc.removeElement(this.pointMove);
                this.a(this.pointMove);
            }

            if (this.aD == 2) {
                this.cj.o = this.dir != 3;
                this.cj.setXY(this.cx + (this.dir == 3 ? 5 : -5), this.cy);
                this.cj.n();
            }

            ++this.f;
            if (this.f >= 20) {
                this.f = 0;
            }

            if (!var3 && this.p() && this.cx != SessionMove.a && this.cy != SessionMove.b) {
                return true;
            }
        } catch (Exception var11) {
        }

        return false;
    }

    void G() {
        if (this.p()) {
            GameSrc.gI().cp = true;
        }

    }

    private void ao() {
        if (!this.ab() && Utlis.a() - this.bi > 300L) {
            this.bi = Utlis.a();
            if (this.p() && this.status == 2) {
                vdtt_aa.gI().a(0.7F);
            }
        }

    }

    private void ap() {
        if (Utlis.a() - this.cp > 500L) {
            this.cp = Utlis.a();
            if (!this.ab()) {
                if (this.p()) {
                    if (this.ai() != 0) {
                        vdtt_aa.gI().b(0.5F);
                        return;
                    }

                    if (!this.q()) {
                        vdtt_aa.gI().a(0.2F, false);
                        return;
                    }
                }
            } else if (!this.q() && this.aB()) {
                if (!this.Z()) {
                    vdtt_aa.gI().v();
                    return;
                }

                vdtt_aa.gI().a(0.2F, this.aB());
            }
        }

    }

    public final void a(vdtt_gj var1) {
        if (Utlis.b(this.cx - var1.cx) > 1) {
            if (this.cx < var1.cx) {
                this.aE = this.dir = 2;
            } else if (this.cx > var1.cx) {
                this.aE = this.dir = 3;
            }
        }

        if (!this.p()) {
            int var2 = Utlis.b(var1.cx - this.cx);
            int var3 = Utlis.b(var1.cy - this.cy);
            short var4 = this.cy;
            if (a(this.cx, var4, (int) 1) == null) {
                this.cq = 0;
            } else if (var3 == 0 || var2 != 0 && var2 == var3) {
                ++this.cq;
            }

            if (this.cq < 10) {
                if (this.cy < var1.cy) {
                    this.dir = 0;
                    return;
                }

                if (this.cy > var1.cy) {
                    this.dir = 1;
                }
            }
        }

    }

    private void a(boolean var1) {
        if (this.status != 0 && !var1) {
            if (this.status == 2) {
                XYEntity var2;
                if ((var2 = this.U()) != null || this.aF == 2 || !this.p() && this.aG < 2) {
                    int var4;
                    if (this.dir != 1 && this.dir != 0) {
                        int var10 = Utlis.b(this.bX - this.cx);
                        var4 = Utlis.b(this.bY - this.cy);
                        if (var10 == 0) {
                            this.cA = 0;
                            if (var4 > 0) {
                                this.aD = 3;
                            } else {
                                this.aD = 4;
                            }
                        } else if (var2 == null) {
                            this.aD = 2;
                        } else {
                            this.aD = 5;
                        }
                    } else if (var2 == null) {
                        this.aD = 2;
                    } else {
                        if (this.dir == 1) {
                            this.aD = 3;
                        } else {
                            this.aD = 4;
                        }

                        if (!this.p()) {
                            if (Utlis.b(this.bX - this.cx) != 0) {
                                if (this.cA > 0) {
                                    ++this.cA;
                                } else if (this.bc.size() > 1) {
                                    vdtt_gj var3 = (vdtt_gj) this.bc.get(0);
                                    var4 = 0;
                                    int var5 = 0;
                                    int var6 = 0;

                                    for (int var7 = 1; var7 < this.bc.size(); ++var7) {
                                        vdtt_gj var8 = (vdtt_gj) this.bc.get(var7);
                                        int var9 = Utlis.b(var3.cy, var8.cy);
                                        if ((var6 = Utlis.b(var3.cx, var8.cx)) == 0) {
                                            break;
                                        }

                                        if (var4 == 0 && var9 > 0) {
                                            var4 = var9;
                                        }

                                        if (var4 > 0 && var4 == var9) {
                                            ++var5;
                                        }

                                        var3 = var8;
                                    }

                                    if (var6 > 0 && var5 >= this.bc.size() - 1) {
                                        this.aD = 5;
                                    }
                                }
                            } else {
                                this.cA = 0;
                            }
                        }
                    }

                    if (this.cy_ > 0) {
                        --this.cy_;
                        this.cA = 0;
                        if (var2 != null) {
                            this.aD = 3;
                        }
                    }

                    if (this.cz > 0) {
                        --this.cz;
                        this.cA = 0;
                        if (var2 != null) {
                            this.aD = 4;
                        }
                    }

                    this.ap();
                } else {
                    this.aD = 2;
                }

                this.K();
            } else if (this.status == 1) {
                this.aD = 7;
                this.K();
            } else if (this.status == 4) {
                this.aD = 6;
                this.K();
            }
        } else {
            if (this.U() != null) {
                this.aD = 3;
                this.ap();
            } else {
                this.aD = 0;
            }

            this.K();
        }

        this.ax();
    }

    private void aq() {
        this.cx = this.aK;
        this.cy = this.aL;
        if (this.p()) {
            GameSrc.gI().pointMoveMap = null;
        }

        XYEntity var1;
        if ((var1 = this.U()) != null) {
            this.cx = this.aK = var1.cx;
            this.cy = this.aL = var1.cy;
        } else if (this.p() && !GameSrc.gI().dI) {
            if (SettingsTab.K().H() && GameSrc.gI().getMapTemplate().type != 10 && GameSrc.gI().getMapTemplate().type != 5 && GameSrc.gI().getMapTemplate().type != 21 && (GameSrc.gI().bU > 0 || GameSrc.gI().getMapTemplate().type == 13)) {
                GameSrc.gI().Y();
                return;
            }

            if (GameSrc.gI().cB || SettingsTab.K().N() && SettingsTab.K().V && !GameSrc.gI().V()) {
                GameSrc.gI().cB = true;
                GameSrc.gI().cD = 100;
                GameSrc.gI().cE = 120;
                GameSrc.gI().Z();
                return;
            }
        }

    }

    public final void H() {
        if (!GameSrc.gI().b.contains(vdtt_kn.a) && GameSrc.gI().aa() && !SettingsTab.K().N()) {
            GameSrc.gI().a((vdtt_w) (new vdtt_kn(GameSrc.gI())));
            this.bF = SettingsTab.K().V;
            SettingsTab.K().a(false);
        }

    }

    private void ar() {
        this.bX = this.cx;
        this.bY = this.cy;
        this.ap();
        if (this.aF == 1) {
            this.g(this.aM, this.aN);
            if (this.pointMove != null || this.bc.size() > 0) {
                this.status = 2;
            }

            this.aD = 3;
        } else if (this.aF == 2) {
            this.cy = (short) (this.cy + this.cb);
            ++this.cb;
            if (this.cy > this.aN) {
                this.cy = this.aN;
            }

            this.aD = 4;
            if (this.cx == this.aM && this.cy == this.aN) {
                this.ao();
                this.aF = 0;
                this.j();
                this.G();
                if (!this.af() && !this.ah() && !this.q()) {
                    this.I();
                }
            }
        }

        this.K();
    }

    public final void I() {
        if (System.currentTimeMillis() - this.cC >= 2000L && !this.as() && !this.equals(this.bT)) {
            this.cC = System.currentTimeMillis();
            GameSrc.gI().av.add(new vdtt_hf(131, this.cx, this.cy));
        }

        if (this.p()) {
            if (!this.aB()) {
                vdtt_aa.gI().c(0.7F);
                return;
            }

            vdtt_aa.gI().v();
        }

    }

    private boolean as() {
        for (int var1 = 0; var1 < this.bd.size(); ++var1) {
            if (((vdtt_gz) this.bd.elementAt(var1)).c()) {
                return true;
            }
        }

        return false;
    }

    public final void J() {
        if (this.aF == 2) {
            this.aM = this.cx;
            this.aN = this.cy;
            this.aF = 0;
            this.j();
            this.G();
        }

    }

    public final void K() {
        try {
            if (!this.isDie() && this.pointMove != null) {
                if (this.pointMove.a()) {
                    this.aD = 3;
                } else if (this.pointMove.b()) {
                    this.aD = 4;
                }
            }

            ++this.c;
            if (this.ab()) {
                this.aD = 0;
            }

            if (this.c >= DataCenter.gI().X[this.aD].length) {
                if (this.isDie()) {
                    this.c = (short) (DataCenter.gI().X[this.aD].length - 1);
                } else {
                    this.c = 0;
                }
            }

            short var1 = this.typeGiaoDich = (short) DataCenter.gI().X[this.aD][this.c];
            this.J = var1;
        } catch (Exception var2) {
        }

    }

    private void at() {
        try {
            ++this.c;
            if (this.ab()) {
                this.aD = 0;
            }

            if (this.c >= DataCenter.gI().X[this.aD].length) {
                this.c = 0;
            }

            this.typeGiaoDich = (short) DataCenter.gI().X[this.aD][this.c];
        } catch (Exception var2) {
        }

    }

    private void au() {
        this.aD = 0;
        if (this.aB()) {
            vdtt_aa.gI().v();
        }

    }

    private void av() {
        if (this.ae != null) {
            vdtt_gj var1 = this.ae;
            this.pointMove = var1;
            if (this.p()) {
                this.ae = null;
                this.an();
                return;
            }

            ++this.pointMove.c;
            this.ae = null;
            this.an();
        }

        if (this.idEntity != Integer.MIN_VALUE) {
            if (this.aU != null) {
                this.aU.a(GameSrc.gI().at, GameSrc.gI().av);
            } else {
                this.j();
            }
        }

        this.at();
    }

    public final void c(int var1, int var2) {
        if (!this.ah()) {
            Object var3 = null;
            this.pointMove = (vdtt_gj) var3;
            if (GameSrc.gI().getMapTemplate().type == 10) {
                vdtt_fw var4;
                (var4 = new vdtt_fw()).d = new XYEntity[5];
                var4.d[0] = new XYEntity();
                var4.d[0].setXY(481, 674);
                var4.d[1] = new XYEntity();
                var4.d[1].setXY(1029, 395);
                var4.d[2] = new XYEntity();
                var4.d[2].setXY(1029, 446);
                var4.d[3] = new XYEntity();
                var4.d[3].setXY(489, 705);
                var4.d[4] = new XYEntity();
                var4.d[4].setXY(481, 674);
                if (var4.a(var1, var2)) {
                    return;
                }
            }

            if (!this.a(false, false) && this.aX == null) {
                MoveSmart.a(GameSrc.gI().mapID, var1, var2);
            }
        }

    }

    public final boolean L() {
        return this.aU != null && this.aY.d == 5;
    }

    public final boolean M() {
        MoveSmart.b();
        if (this.q()) {
            vdtt_gj var2 = this.pointMove;
            var2.cx = (short) (var2.cx - 5);
            return false;
        } else {
            short var1 = GameSrc.gI().getMapTemplate().type == 20 ? 10 : this.typePk;
            return this.a(this.cx - var1, this.cy, (byte) 3);
        }
    }

    public final boolean N() {
        short var1 = GameSrc.gI().getMapTemplate().type == 20 ? 10 : this.typePk;
        return this.a(this.cx - var1, this.cy - var1, (byte) 3);
    }

    public final boolean O() {
        MoveSmart.b();
        if (this.q()) {
            vdtt_gj var2 = this.pointMove;
            var2.cx = (short) (var2.cx + 5);
            return false;
        } else {
            short var1 = GameSrc.gI().getMapTemplate().type == 20 ? 10 : this.typePk;
            return this.a(this.cx + var1, this.cy, (byte) 2);
        }
    }

    public final boolean P() {
        short var1 = GameSrc.gI().getMapTemplate().type == 20 ? 10 : this.typePk;
        return this.a(this.cx + var1, this.cy - var1, (byte) 2);
    }

    public final boolean a(int var1, int var2, byte var3) {
        MoveSmart.b();
        if (!this.bC && !this.ah()) {
            if (!GameSrc.gI().ca && (var1 <= 15 || var1 >= GameSrc.gI().maxX - 15)) {
                for (int var4 = 0; var4 < GameSrc.gI().vWayPoint.size(); ++var4) {
                    WayPoint var5;
                    if ((var5 = (WayPoint) GameSrc.gI().vWayPoint.elementAt(var4)) != null && var5.cy - 50 <= this.cy && this.cy <= var5.cy + 5 && Utlis.b(var5.cx, var1) < 300) {
                        GameSrc.gI().h(this.cx, this.cy);
                        return false;
                    }
                }
            }

            SettingsTab.K().a(false);
            GameSrc.gI().pointMoveMap = null;
            GameSrc.gI().aX = false;
            if (gI().isDie()) {
                gI().H();
                return false;
            } else if (this.aU == null && !this.a(false, false) && this.aF != 1 && this.aX == null) {
                gI().j();
                if ((var3 == 3 || var3 == 2) && this.aE != var3) {
                    this.aE = var3;
                    return true;
                } else {
                    this.dir = var3;
                    this.status = 2;
                    boolean var8 = true;
                    GameSrc.gI().o.e = var8;
                    XYEntity var6;
                    vdtt_gj var9;
                    if (this.aF == 0 && !this.ab() && (var6 = a(var1, var2, (int) 1)) != null) {
                        for (int var10 = 0; var10 < 10 && GameSrc.gI().V.a(var6.cx, var6.cy); ++var10) {
                            --var6.cy;
                        }

                        var9 = new vdtt_gj(var6.cx, var6.cy, this.typePk);
                        this.pointMove = var9;
                        this.pointMove.g = 2;
                        return true;
                    } else {
                        vdtt_gj var7 = new vdtt_gj((short) var1, (short) var2, this.typePk, this.typePk);
                        var9 = this.b(var7);
                        this.pointMove = var9;
                        return true;
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public final void a(boolean var1, int var2) {
        if (this.ab()) {
            this.al();
        } else {
            this.status = 2;
            if (!this.q()) {
                vdtt_gj var3 = new vdtt_gj(this.cx, (short) (this.cy - var2), this.typePk, this.typePk);
                vdtt_gj var4 = this.b(var3);
                this.pointMove = var4;
                this.pointMove.a(this.cy, var2);
                this.pointMove.k = var1;
                vdtt_aa.gI().s();
            }
        }

    }

    public final boolean Q() {
        MoveSmart.b();
        if (!this.bC && !this.ah()) {
            short var1 = GameSrc.gI().getMapTemplate().type == 20 ? 10 : this.typePk;
            GameSrc.gI().pointMoveMap = null;
            GameSrc.gI().aX = false;
            SettingsTab.K().a(false);
            this.dir = 1;
            if (gI().isDie()) {
                gI().H();
                return false;
            } else if (this.aU == null && !this.a(false, false) && this.aX == null) {
                if (this.aF == 0) {
                    short var5 = this.cy;
                    if (a(this.cx, var5, (int) 1) == null) {
                        if (!this.q()) {
                            this.a(false, GameSrc.dK);
                        }
                    } else {
                        this.al();
                    }

                    return true;
                } else if (this.aF == 2) {
                    this.status = 2;
                    boolean var2 = true;
                    GameSrc.gI().o.e = var2;
                    vdtt_gj var3 = new vdtt_gj(this.cx, (short) (this.cy - var1), var1, var1);
                    vdtt_gj var4 = this.b(var3);
                    this.pointMove = var4;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public final boolean R() {
        MoveSmart.b();
        if (!this.bC && !this.ah()) {
            short var1 = GameSrc.gI().getMapTemplate().type == 20 ? 10 : this.typePk;
            GameSrc.gI().pointMoveMap = null;
            GameSrc.gI().aX = false;
            SettingsTab.K().a(false);
            this.dir = 0;
            if (gI().isDie()) {
                gI().H();
                return false;
            } else if (this.aU == null && !this.a(false, false) && this.aF != 1 && this.aX == null) {
                gI().j();
                if (this.dir != 0) {
                    this.dir = 0;
                    return true;
                } else {
                    boolean var2;
                    if (this.ab()) {
                        this.status = 2;
                        var2 = true;
                        GameSrc.gI().o.e = var2;
                        vdtt_gj var5 = new vdtt_gj(this.cx, (short) (this.cy + var1), var1, var1);
                        this.pointMove = var5;
                        return true;
                    } else {
                        XYEntity var3;
                        if ((var3 = this.U()) != null) {
                            this.status = 2;
                            var2 = true;
                            GameSrc.gI().o.e = var2;
                            vdtt_gj var4 = new vdtt_gj(this.cx, (short) (this.cy + var1), var1, var1);
                            if (!super.a(var4.cx, var4.cy)) {
                                var4 = new vdtt_gj(var3.cx, var3.cy, var1);
                            }

                            this.pointMove = var4;
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private void aw() {
        this.bc.addAll(this.cn);
        this.status = 2;
        this.cn.clear();
    }

    public final void a(short var1, short var2, boolean var3) {
        try {
            short var4 = this.typePk;
            if (!this.p()) {
                int var5 = var2 - this.cu;
                if (this.cx_ >= 15) {
                    this.cx_ = 0;
                    this.cy_ = 10;
                } else if (var5 == cB[this.cx_]) {
                    ++this.cx_;
                } else {
                    this.cx_ = 0;
                }

                if (var5 > this.cv) {
                    ++this.cw;
                    this.cv = var5;
                    if (this.cw >= 5) {
                        this.cx_ = 0;
                        this.cy_ = 0;
                        this.cz = 10;
                    }
                } else {
                    this.cv = 0;
                    this.cw = 0;
                    if (this.cz > 3) {
                        this.cz = 3;
                    }
                }

                if (this.cy_ == 0 && this.cz == 0 && this.J >= 30 && this.J <= 35 && a(var1, var2, (int) 1) != null) {
                    this.bR = 5;
                }

                if (this.aU != null && this.aU.d.l()) {
                    var4 = 15;
                }
            }

            vdtt_gj var7 = new vdtt_gj(var1, var2, var4);
            this.cn.addElement(var7);
            this.co = System.currentTimeMillis();
            if (this.cn.size() > 5 || var3) {
                this.aw();
            }

            this.cu = var2;
        } catch (Exception var6) {
        }

    }

    public final void S() {
        if (this.p()) {
            Object var1 = null;
            this.pointMove = (vdtt_gj) var1;
            this.o();
            this.j();
            MoveSmart.b();
        }

    }

    public final void T() {
        GameSrc.gI().focusEntity = null;
        GameSrc.gI().aX = false;
        this.S();
    }

    public final void j() {
        if (this.aU != null) {
            this.status = 3;
            this.G();
        } else {
            if (this.hp > 0) {
                this.status = 0;
            }

            Object var1 = null;
            this.pointMove = (vdtt_gj) var1;
        }

    }

    private void ax() {
        try {
            if (!this.af()) {
                if (!this.Z() && !this.az() && this.status != 7 && this.status != 4 && this.status != 5 && this.aU == null && this.aX == null && !this.ab() && !GameSrc.gI().cn && !SettingsTab.K().V && this.p()) {
                    XYEntity var1;
                    if ((var1 = this.U()) != null) {
                        ++this.cd;
                        if (this.cd > 10 || Utlis.b(this.cy - var1.cy) < 40) {
                            this.cd = 0;
                            this.g(this.cx, var1.cy - 1);
                        }

                        return;
                    }

                    this.aF = 0;
                }

                this.cd = 0;
            }
        } catch (Exception var2) {
        }

    }

    public final XYEntity U() {
        return this.idEntity == Integer.MIN_VALUE ? null : a(this.cx, this.cy, (int) (this.p() ? 1 : 2));
    }

    private void g(int var1, int var2) {
        this.aM = (short) var1;
        this.aN = (short) var2;
        this.aF = 2;
        this.cb = 0;
        this.status = 7;
    }

    public final vdtt_gj b(vdtt_gj var1) {
        if (!super.a(var1.cx, var1.cy)) {
            this.a(var1, 1, false);
        }

        return var1;
    }

    private XYEntity a(XYEntity var1, int var2, boolean var3) {
        try {
            for (int var4 = 1; var4 < 500; ++var4) {
                var2 = var1.cx + var4 * 1;
                short var5 = var1.cy;
                if (this.a(var2, var5)) {
                    var1.setXY(var2, var5);
                    return var1;
                }

                var2 = var1.cx - var4 * 1;
                short var6 = var1.cy;
                if (this.a(var2, var6)) {
                    var1.setXY(var2, var6);
                    return var1;
                }

                short var14 = var1.cx;
                int var7 = var1.cy + var4 * 1;
                if (this.a(var14, var7)) {
                    var1.setXY(var14, var7);
                    return var1;
                }

                var14 = var1.cx;
                int var8 = var1.cy - var4 * 1;
                if (this.a(var14, var8)) {
                    var1.setXY(var14, var8);
                    return var1;
                }

                var2 = var1.cx + var4 * 1;
                int var9 = var1.cy - var4 * 1;
                if (this.a(var2, var9)) {
                    var1.setXY(var2, var9);
                    return var1;
                }

                var2 = var1.cx + var4 * 1;
                int var10 = var1.cy + var4 * 1;
                if (this.a(var2, var10)) {
                    var1.setXY(var2, var10);
                    return var1;
                }

                var2 = var1.cx - var4 * 1;
                int var11 = var1.cy - var4 * 1;
                if (this.a(var2, var11)) {
                    var1.setXY(var2, var11);
                    return var1;
                }

                var2 = var1.cx - var4 * 1;
                int var12 = var1.cy + var4 * 1;
                if (this.a(var2, var12)) {
                    var1.setXY(var2, var12);
                    return var1;
                }
            }
        } catch (Exception var13) {
        }

        return null;
    }

    public final String strTop() {
        return Utlis.c(this.hp);
    }

    public final String strBottom() {
        return Utlis.c(this.mp);
    }

    public static void a(Message var0, Item[] var1) throws IOException {
        for (int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = null;
        }

        byte var5 = var0.readByte();

        for (int var3 = 0; var3 < var5; ++var3) {
            Item var4;
            (var4 = new Item()).id = var0.readShort();
            var4.isLock = var0.readBoolean();
            var4.h = var0.readLong();
            var4.g = var0.readByte();
            var4.level = var0.readByte();
            var4.index = var4.getItemTemplate().type;
            var4.strData = var0.reader.readUTF();
            var4.nameCreate = var0.reader.readUTF();
            var1[var4.index] = var4;
        }

    }

    public static void b(Message var0, Item[] var1) throws IOException {
        for (int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = null;
        }

        short var7 = var0.readShort();

        for (int var3 = 0; var3 < var7; ++var3) {
            Item var4;
            (var4 = new Item()).a(var0);

            try {
                var1[var4.index] = var4;
            } catch (Exception var6) {
                Utlis.a(var6);
            }
        }

    }

    public final int f(int var1) {
        int var2 = 0;

        for (int var3 = 0; var3 < this.arrItemBag.length; ++var3) {
            if (this.arrItemBag[var3] != null && this.arrItemBag[var3].id == var1) {
                var2 += this.arrItemBag[var3].M();
            }
        }

        return var2;
    }

    public static boolean V() {
        return !(GameSrc.gI().c instanceof vdtt_mo) && !(GameSrc.gI().c instanceof vdtt_jm) && !(GameSrc.gI().c instanceof vdtt_ll);
    }

    public final void a(int var1, boolean var2, boolean var3) {
        String var4;
        if (var1 - gI().bac > 0) {
            var4 = Caption.q + " " + Utlis.c(var1 - gI().bac) + " " + Caption.yO[2];
            if (V()) {
                vdtt_ba.a(9, Caption.bY, var4);
            }

            if (var2) {
                DataCenter.gI().currentScreen.c(var4, -1);
            }

            if (var3) {
                vdtt_fd.a("+" + Utlis.c(var1 - gI().bac), gI(), gI().aJ, 7);
            }
        } else if (var1 - gI().bac < 0) {
            var4 = Caption.dw + " " + Utlis.c(-(var1 - gI().bac)) + " " + Caption.yO[2];
            if (V()) {
                vdtt_ba.a(9, Caption.bY, var4);
            }

            if (var2) {
                DataCenter.gI().currentScreen.c(var4, -1);
            }

            if (var3) {
                vdtt_fd.a(Utlis.c(var1 - gI().bac), gI(), gI().aJ, 7);
            }
        }

        gI().bac = var1;
    }

    public final void b(int var1, boolean var2, boolean var3) {
        String var4;
        if (var1 - gI().bacKhoa > 0) {
            var4 = Caption.q + " " + Utlis.c(var1 - gI().bacKhoa) + " " + Caption.yO[3];
            if (V()) {
                vdtt_ba.a(9, Caption.bY, var4);
            }

            if (var2) {
                DataCenter.gI().currentScreen.c(var4, -1);
            }

            if (var3) {
                vdtt_fd.a("+" + Utlis.c(var1 - gI().bacKhoa), gI(), gI().aJ, 8);
            }
        } else if (var1 - gI().bacKhoa < 0) {
            var4 = Caption.dw + " " + Utlis.c(-(var1 - gI().bacKhoa)) + " " + Caption.yO[3];
            if (V()) {
                vdtt_ba.a(9, Caption.bY, var4);
            }

            if (var2) {
                DataCenter.gI().currentScreen.c(var4, -1);
            }

            if (var3) {
                vdtt_fd.a(Utlis.c(var1 - gI().bacKhoa), gI(), gI().aJ, 8);
            }
        }

        gI().bacKhoa = var1;
    }

    public final void c(int var1, boolean var2, boolean var3) {
        String var4;
        if (var1 - gI().vang > 0) {
            var4 = Caption.q + " " + Utlis.c(var1 - gI().vang) + " " + Caption.yO[0];
            if (V()) {
                vdtt_ba.a(9, Caption.bY, var4);
            }

            if (var2) {
                DataCenter.gI().currentScreen.c(var4, -1);
            }

            if (var3) {
                vdtt_fd.a("+" + Utlis.c(var1 - gI().vang), gI(), gI().aJ, 9);
            }
        } else if (var1 - gI().vang < 0) {
            var4 = Caption.dw + " " + Utlis.c(-(var1 - gI().vang)) + " " + Caption.yO[0];
            if (V()) {
                vdtt_ba.a(9, Caption.bY, var4);
            }

            if (var2) {
                DataCenter.gI().currentScreen.c(var4, -1);
            }

            if (var3) {
                vdtt_fd.a(Utlis.c(var1 - gI().vang), gI(), gI().aJ, 9);
            }
        }

        gI().vang = var1;
    }

    public final void a(long var1, boolean var3) {
        if (this.p()) {
            long var4;
            if ((var4 = var1 / 10L - this.exp / 10L) > 0L) {
                if (!(GameSrc.gI().c instanceof GameSrc)) {
                    vdtt_ba.a(9, Caption.bY, Caption.q + " " + Utlis.c(var4) + " " + Caption.ck);
                }

                vdtt_fd.a("+" + Utlis.c(var4), this, this.aJ, 6);
                if (var3) {
                    DataCenter.gI().currentScreen.c(Caption.q + " " + Utlis.c(var4) + " " + Caption.ck, -1);
                }
            } else if (var4 < 0L) {
                if (!(GameSrc.gI().c instanceof GameSrc)) {
                    vdtt_ba.a(9, Caption.bY, Caption.dw + " " + Utlis.c(var4) + " " + Caption.ck);
                }

                vdtt_fd.a(Utlis.c(var4), this, this.aJ, 6);
            }

            GameSrc.gI();
        }

        this.exp = var1;
    }

    public final void W() {
        if (this.p() && !this.bM && !GameSrc.gI().ac() && !gI().ah()) {
            SessionMove.a(true);
        }

    }

    public final void a(Skill var1, Entity var2, boolean var3) {
        try {
            if (!this.p() || !gI().bC) {
                if (!this.p() && this.pointMove != null) {
                    this.bc.indexOf(this.pointMove, 0);
                    Object var4 = null;
                    this.pointMove = (vdtt_gj) var4;
                }

                boolean var7 = var1.k();
                if (!this.a(true, var7) && (!this.p() || this.status != 3 || var1 != null && var1.o)) {
                    if (var1 != null) {
                        var1.o = false;
                        if (var1.a(this, var3)) {
                            this.j();
                            this.j();
                            this.setDir(var2);
                            if (!this.a(false, var7)) {
                                if (!this.p() && this.aU != null) {
                                    this.aV.add(new vdtt_if(var1, this, var2));
                                } else {
                                    vdtt_if var5 = new vdtt_if(var1, this, var2);
                                    this.aU = var5;
                                }
                            }

                            this.status = 3;
                            this.G();
                            var1.f();
                            this.aw = -1;
                            return;
                        }
                    } else if (this.p()) {
                        DataCenter.gI().currentScreen.c(Caption.dx, -2560);
                    }
                }
            }
        } catch (Exception var6) {
        }

    }

    public final void a(Entity var1, Skill var2) {
        try {
            if (this.p()) {
                if (gI().bC) {
                    return;
                }

                this.W();
                if (var1 != null) {
                    if (var1 instanceof Char) {
                        Session.gI().d(var2.b, var1.idEntity);
                    } else {
                        Session.gI().a(var2.b, var1.idEntity);
                    }

                    return;
                }

                Session.gI().e(var2.b);
            }
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final boolean g(int var1) {
        for (var1 = 0; var1 < this.ba.size(); ++var1) {
            if (((Effect) this.ba.elementAt(var1)).getEffectTemplate().type == 0) {
                return true;
            }
        }

        return false;
    }

    public final void a(String var1) {
        GameSrc.gI().aX = false;
        if (this.p()) {
            GameSrc.I = var1;
            vdtt_aa.gI().z();
        }

        byte var2 = 0;
        this.J = (short) var2;
        this.cc = 0;
        var1 = null;
        this.pointMove = null;
        this.o();
        this.aw = -1;
        this.ay();
    }

    public final void i() {
        if (this.bS == null) {
            this.bJ = 8;
            if (!DataCenter.k() && !DataCenter.aj) {
                vdtt_hf var1;
                (var1 = new vdtt_hf(442, this.k(), this.l(), 1)).I = true;
                this.be.addElement(var1);
            }
        }

    }

    private void ay() {
        this.aK = this.cx;
        this.aL = this.cy;
        this.aH = this.aK;
        this.aI = this.aL;
        if (this.p() && (!SettingsTab.K().H() || gI().vangKhoa <= 0 && gI().vang <= 0)) {
            this.H();
        }

        this.c = 0;
        if (!this.af() && this.status != 4) {
            this.be.addElement(new vdtt_hf(29, this.k(), this.l(), 1));
        }

        this.status = 4;
    }

    public final void X() {
        this.status = 0;
        this.G();
        if (!this.af()) {
            this.be.addElement(new vdtt_hf(406, this.k(), this.l(), 4));
        }

    }

    public final void setDir(XYEntity var1) {
        if (!this.a(false, false)) {
            super.setDir(var1);
            this.aE = this.dir;
        }

    }

    private boolean az() {
        int var1 = 0;

        while (var1 < this.ba.size()) {
            switch (((Effect) this.ba.elementAt(var1)).id) {
                case 12:
                case 35:
                case 36:
                case 38:
                case 161:
                    return true;
                default:
                    ++var1;
            }
        }

        return false;
    }

    private boolean a(boolean var1, boolean var2) {
        if (this.isDie() || GameSrc.gI().cz && this.p()) {
            return true;
        } else {
            for (int var3 = 0; var3 < this.ba.size(); ++var3) {
                switch (((Effect) this.ba.elementAt(var3)).id) {
                    case 12:
                    case 36:
                    case 38:
                    case 76:
                    case 146:
                    case 166:
                    case 175:
                        if (var1) {
                            return true;
                        }
                        break;
                    case 161:
                        if (!var2) {
                            return true;
                        }
                }
            }

            return false;
        }
    }

    public static boolean Y() {
        return GameSrc.gI().dl + 30000L <= Utlis.a();
    }

    public final boolean Z() {
        return this.bc.size() != 0 || this.pointMove != null || MoveSmart.e();
    }

    public final Vector aa() {
        return this.a(this.arrItemBody);
    }

    private static int k(int var0) {
        switch (var0) {
            case 21:
                return 83;
            case 30:
                return 82;
            case 31:
                return 84;
            case 42:
                return 81;
            case 98:
                return 99;
            case 140:
                return 143;
            default:
                return var0;
        }
    }

    public final Vector a(Item[] var1) {
        Vector var2 = new Vector();
        boolean var3 = this.ae();
        if (this.bt == null && this.bv != null) {
            if (var3) {
                this.a(var2, 60, 0);
            } else {
                this.a(var2, this.bv.getEffectTemplate().idAura, 0);
            }
        }

        if (this.bt == null && this.bw != null) {
            this.a(var2, this.bw.getEffectTemplate().idAura, 0);
        }

        for (int var4 = 0; var4 < this.bA.size(); ++var4) {
            if (this.bu != null && ((Effect) this.bA.get(var4)).id == 111) {
                if (this.bu.j == 11) {
                    this.a(var2, 61, 0, -1, this.bM);
                } else {
                    this.a(var2, 61, 0);
                }
            } else {
                this.a(var2, ((Effect) this.bA.get(var4)).j, 0);
            }
        }

        boolean var16 = false;
        Effect var5;
        if ((var5 = this.l(160)) == null) {
            var5 = this.l(167);
        }

        if (var5 == null) {
            var5 = this.l(138);
        }

        int var6;
        if ((this.bu == null || !this.bu.a(this) && this.by != null) && (this.bt == null || !this.ci) && !this.aD() && var1[14] != null && var1[14].aq() > 0 && !var1[14].Z()) {
            var6 = var1[14].aq();
            if (this.by == null || !this.arrItemBody[14].ag() && this.arrItemBody[14].id != 941) {
                if (!this.aE() && var1[15] != null && var1[15].aq() > 0) {
                    this.a(var2, var1[15].aq(), 0);

                    for (int var18 = 0; var18 < var2.size(); ++var18) {
                        ((vdtt_hb) var2.get(var18)).c();
                    }

                    this.a(var2, var6, 0);
                    ((vdtt_hb) var2.get(var2.size() - 1)).g();
                } else {
                    this.a(var2, var6, 0);
                    if (!((vdtt_hb) var2.get(var2.size() - 1)).f()) {
                        this.a(var2, 7, 0);
                    }
                }
            } else {
                int[] var17 = new int[]{0, 77, 77, 77, 77, 77};
                if (this.arrItemBody[0] != null && this.arrItemBody[0].ap()) {
                    var17 = new int[]{0, 135, 135, 135, 135, 135};
                }

                if (var5 != null) {
                    var17[this.sys] = var5.j;
                } else if (this.h(171) != null) {
                    var17[this.sys] = 120;
                } else if (this.h(163) != null) {
                    var17[this.sys] = 67;
                }

                this.a(var2, var17[this.sys], 0);
            }

            if (this.bu != null && !this.bu.a(this) && this.by != null) {
                this.a(var2, this.bu.j, 0);
                ((vdtt_hb) var2.get(var2.size() - 1)).b();
            }
        } else {
            if (!this.V) {
                if (!this.aE() && var1[15] != null && var1[15].aq() > 0) {
                    this.a(var2, var1[15].aq(), 0);
                } else if (var5 != null && !this.aF()) {
                    var6 = var5.j;
                    this.a(var2, var6, 0);
                } else if (this.h(163) != null) {
                    this.a(var2, 67, 0);
                } else if (var1[13] != null && var1[13].aq() > 0 && !this.aG()) {
                    if ((var6 = var1[13].aq()) == 6 && this.by != null) {
                        var6 = 87;
                    }

                    this.a(var2, var6, 0);
                } else if (!DataCenter.aj && var1[2] != null && !var1[2].Z() && var1[2].aq() > 0) {
                    if ((var6 = var1[2].aq()) == 6 && this.by != null) {
                        var6 = 87;
                    }

                    this.a(var2, var6, 0);
                } else if (!this.bM) {
                    this.a(var2, 2, 0);
                }
            }

            if (this.bu != null) {
                this.a(var2, this.bu.j, 0);
                if (this.bu.a(this) && this.by != null) {
                    vdtt_hb var7;
                    (var7 = (vdtt_hb) var2.get(var2.size() - 1)).g();
                    var7.b();
                    int[] var8 = new int[]{0, 77, 77, 77, 77, 77};
                    if (this.arrItemBody[0] != null && this.arrItemBody[0].ap()) {
                        var8 = new int[]{0, 135, 135, 135, 135, 135};
                    }

                    if (var5 != null) {
                        var8[this.sys] = var5.j;
                    } else if (this.h(163) != null) {
                        var8[this.sys] = 67;
                    }

                    this.a(var2, var8[this.sys], 0);
                } else if (this.bM) {
                    ((vdtt_hb) var2.get(var2.size() - 1)).b();
                    this.a(var2, this.arrItemBody[0].aq(), 0);
                }
            } else if (this.bM) {
                this.a(var2, this.arrItemBody[0].aq(), 0);
            } else {
                this.a(var2, 7, 0);
            }
        }

        if (this.bu != null && this.bt == null && !this.aE() && (this.bV > 0 || this.arrItemBody[15] != null && (this.arrItemBody[15].id >= 896 && this.arrItemBody[15].id <= 899 || this.arrItemBody[15].id >= 918 && this.arrItemBody[15].id <= 921 || this.arrItemBody[15].ao() && this.by != null || this.arrItemBody[15].strData.startsWith("427,896") || this.arrItemBody[15].strData.startsWith("427,897") || this.arrItemBody[15].strData.startsWith("427,898") || this.arrItemBody[15].strData.startsWith("427,899") || this.arrItemBody[15].strData.startsWith("427,918") || this.arrItemBody[15].strData.startsWith("427,919") || this.arrItemBody[15].strData.startsWith("427,920") || this.arrItemBody[15].strData.startsWith("427,921") || this.arrItemBody[15].strData.startsWith("427,309")))) {
            var2.clear();
            this.a(var2, this.bu.j, 0);
            ((vdtt_hb) var2.get(var2.size() - 1)).a();
            if (this.arrItemBody[15] != null && this.arrItemBody[15].id == 1089 && this.by != null) {
                this.a(var2, 126, 0);
            } else if (this.arrItemBody[15] != null && this.arrItemBody[15].id == 918) {
                this.a(var2, 94, 0);
            } else if (this.arrItemBody[15] != null && this.arrItemBody[15].id == 919) {
                this.a(var2, 95, 0);
            } else if (this.arrItemBody[15] != null && this.arrItemBody[15].id == 920) {
                this.a(var2, 96, 0);
            } else if (this.arrItemBody[15] != null && this.arrItemBody[15].id == 921) {
                this.a(var2, 97, 0);
            } else if (this.bV > 0) {
                if (this.bV == 179) {
                    this.a(var2, 88, 0);
                } else if (this.bV == 180) {
                    this.a(var2, 89, 0);
                } else if (this.bV == 181) {
                    this.a(var2, 90, 0);
                } else if (this.bV == 182) {
                    this.a(var2, 94, 0);
                } else if (this.bV == 183) {
                    this.a(var2, 95, 0);
                } else if (this.bV == 184) {
                    this.a(var2, 96, 0);
                }
            } else if (this.arrItemBody[15] != null) {
                if (this.arrItemBody[15].id == 896) {
                    this.a(var2, 88, 0);
                } else if (this.arrItemBody[15].id == 897) {
                    this.a(var2, 89, 0);
                } else if (this.arrItemBody[15].id == 898) {
                    this.a(var2, 90, 0);
                } else if (this.arrItemBody[15].id == 899) {
                    this.a(var2, 91, 0);
                } else if (this.arrItemBody[15].id == 1089 && this.by != null) {
                    this.a(var2, 126, 0);
                } else if (this.arrItemBody[15].id == 309 && this.by != null) {
                    this.a(var2, 114, 0);
                }
            }

            var16 = true;
        }

        if (this.bo >= 0 && DataCenter.gI().itemTemplate[this.bo].a() > 0) {
            this.a(var2, DataCenter.gI().itemTemplate[this.bo].a(), 0);
        }

        short var21 = -1;
        int var20;
        if (this.bu == null && this.bt == null) {
            Effect var9;
            if ((var9 = this.l(165)) != null && !var3 && !this.aF() && this.by == null) {
                for (var20 = 0; var20 < var2.size(); ++var20) {
                    ((vdtt_hb) var2.get(var20)).d();
                }

                this.a(var2, var9.j, 0);
            }

            if (var1[14] != null && var1[14].getItemTemplate().b() > 0 && !this.aD()) {
                this.a(var2, var1[14].getItemTemplate().b(), 0);
                if (DataCenter.aj) {
                    vdtt_hb var22 = (vdtt_hb) var2.get(var2.size() - 1);
                    if (var3) {
                        var22.h();
                        var2.clear();
                        var2.add(var22);
                    } else {
                        var22.g();

                        for (var20 = 0; var20 < var2.size() - 1; ++var20) {
                            ((vdtt_hb) var2.get(var20)).c();
                        }
                    }
                }
            } else {
                Item var10;
                if (this.bM && (var10 = this.arrItemBody[11]) != null && var10.strData != null && var10.strData.startsWith("436,")) {
                    ItemOption[] var11 = var10.L();
                    ItemOption var12;
                    int[] var13 = (var12 = var11[0]).option;
                    short var14 = DataCenter.gI().itemTemplate[var13[1]].width;
                    var13 = (var12 = var11[0]).option;
                    if (DataCenter.gI().itemTemplate[var13[1]].a() > 0) {
                        var13 = (var12 = var11[0]).option;
                        var14 = DataCenter.gI().itemTemplate[var13[1]].a();
                    }

                    short[] var15;
                    if ((var15 = DataCenter.gI().A[var14].a[0]).length == 1) {
                        if (!var10.ao() || this.bt == null) {
                            var21 = var15[0];
                        }
                    } else if (var15.length > 0) {
                        var2.clear();
                        this.a(var2, var14, 0);
                    }
                }
            }
        }

        vdtt_hb var19;
        if (this.bx != null && this.bx.g.size() > 0 && this.bt == null) {
            short var24 = 335;
            if (this.bu != null) {
                for (var20 = var2.size() - 1; var20 >= 0; --var20) {
                    (var19 = (vdtt_hb) var2.get(var20)).g();
                    if (var19.a.length == 0) {
                        var2.remove(var20);
                    } else if (var19.a[0] == 240) {
                        (var19 = DataCenter.gI().z[585].a(0)).g();
                        var2.set(var20, var19);
                    }
                }
            } else {
                var2.clear();
                (var19 = DataCenter.gI().z[((Effect) this.bx.g.get(0)).b].a(0)).a(this);
                var2.add(var19);
                if (((Effect) this.bx.g.get(0)).b == 586) {
                    var24 = 337;
                }
            }

            if (this.bu != null && this.bu.id == 102) {
                var24 = 336;
            }

            (var19 = DataCenter.gI().z[this.bx.b].a(0)).c();
            var2.add(var19);

            for (var20 = 0; var20 < var2.size(); ++var20) {
                ((vdtt_hb) var2.get(var20)).e();
            }

            var19 = DataCenter.gI().z[588].a(0);
            var2.add(var19);
            var19 = DataCenter.gI().z[589].a(0);
            var2.add(var19);
            var19 = DataCenter.gI().z[var24].a(0);
            var2.add(var19);
        } else if (!this.aE()) {
            if (var1[15] != null && var1[15].getItemTemplate().b() > 0) {
                short[] var23;
                if ((var23 = DataCenter.gI().A[var1[15].getItemTemplate().b()].a[0]).length == 1) {
                    if (!var1[15].ao() || this.bt == null) {
                        var21 = var23[0];
                    }
                } else if (var23.length > 0) {
                    this.a(var2, var1[15].getItemTemplate().b(), 0);
                }
            } else if (var21 == -1) {
                if (this.h(169) != null) {
                    var21 = 5;
                } else if (this.h(168) != null) {
                    var21 = 1;
                }
            }
        }

        int var27;
        if (this.by != null && this.bt == null) {
            boolean var25 = var1[15] != null && (var1[15].ao() || var1[15].strData.startsWith("427,309"));
            if (!var16) {
                int[] var28 = new int[]{0, 688, 690, 687, 689, 309};
                if (this.arrItemBody[0] != null && this.arrItemBody[0].ap()) {
                    var28 = new int[]{0, 1134, 1141, 1138, 1145, 303};
                }

                for (var27 = 0; var27 < var2.size(); ++var27) {
                    (var19 = (vdtt_hb) var2.get(var27)).b();
                    var19.b = new short[0];
                }

                if (var25) {
                    if (var1[15].id == 1089 && this.by != null) {
                        this.a(var2, 126, 0);
                    } else if (var1[15].id == 309 && this.by != null) {
                        this.a(var2, 114, 0);
                    }
                } else if (var1[14] != null && var1[14].id == 941) {
                    ((vdtt_hb) var2.get(var2.size() - 1)).c();
                    this.a(var2, 105, 0);
                } else if ((this.bt == null || !this.ci) && !this.aD() && var1[14] != null && var1[14].aq() > 0 && !var1[14].Z() && var1[14].ag()) {
                    var27 = k(var1[14].aq());
                    this.a(var2, var27, 0);
                } else {
                    int var29 = var28[this.sys];
                    (var19 = DataCenter.gI().z[var29].a(0)).g();
                    var2.add(var19);
                }
            }

            if (!var25) {
                var2.add(DataCenter.gI().z[331].a(0));
            }
        }

        Vector var26 = new Vector();

        for (var20 = 0; var20 < var2.size(); ++var20) {
            var27 = (var19 = (vdtt_hb) var2.get(var20)).c;
            var19.a(var26, this.bt != null);
            var19.c = var27;
            if (var21 > 0) {
                var19.a(var26, var21);
            }
        }

        return var26;
    }

    private void aA() {
        if (this.ab()) {
            if (this.bK > 0) {
                DataCenter.gI().z[this.bK].a(0).a(this.bd, false);
                return;
            }

            int var1 = 0;
            if (this.arrItemBody[10] != null) {
                var1 = (new int[]{-2, -159, -5, -20, 0, 25, 70, 71, -112, -107, -71, -60})[this.arrItemBody[10].getItemTemplate().levelNeed - 10];
            }

            DataCenter.gI().z[760].a(var1).a(this.bd, false);
        }

    }

    public final boolean ab() {
        if (this.isDie()) {
            return false;
        } else {
            return this.cg != null;
        }
    }

    private boolean aB() {
        if (this.isDie()) {
            return false;
        } else {
            return this.cg != null && this.cg.id == 145;
        }
    }

    private void a(Vector var1, int var2, int var3) {
        this.a(var1, var2, 0, 0, false);
    }

    public void a(Vector var1, int var2, int var3, boolean var4) {
        this.a(var1, var2, 0, 0, true);
    }

    private void a(Vector var1, int var2, int var3, int var4, boolean var5) {
        var3 = 0;

        try {
            var3 = vdtt_ha.a(var2, this.sys, this.ae());
        } catch (Exception var7) {
        }

        this.ci = false;
        Effect var6 = this.bt;
        if (var5) {
            if (this.bT != null) {
                var6 = this.bT.bt;
            } else {
                var6 = null;
            }
        }

        if (var6 != null) {
            if (var6.d() < 1000) {
                if (DataCenter.gI().h % 10 < 5) {
                    this.ci = false;
                } else {
                    var3 = var6.j;
                    this.ci = true;
                }
            } else {
                var3 = var6.j;
            }
        }

        var1.add(DataCenter.gI().z[var3].a(var4));
    }

    public final void e(Message var1) {
        try {
            String var2;
            if ((var2 = var1.reader.readUTF()).length() > 0) {
                this.giatoc = new vdtt_el();
                this.giatoc.a = var2;
                this.giatoc.b = var1.reader.readUTF();
                this.giatoc.c = var1.readByte();
                this.giatoc.d = var1.readShort();
            } else {
                this.giatoc = null;
            }

            this.aC();
        } catch (Exception var3) {
        }

    }

    private void aC() {
        this.bl = vdtt_dd.b(vdtt_dd.d, this.name);
        if (this.giatoc != null) {
            this.bm = vdtt_dd.b(vdtt_dd.d, this.giatoc.a);
        } else {
            this.bm = 0;
        }

    }

    public final void paintBottom(Graphics var1) {
        try {
            if (!this.ah() && this.aX == null && (this.p() || !this.U) && GameSrc.gI().bQ <= 0 && !this.bB && !this.af() && !this.ak()) {
                short var2 = this.cx;
                byte var3 = -8;
                if (this.bt != null) {
                    var3 = 8;
                } else if (this.ae()) {
                    var3 = -2;
                }

                byte var4 = var3;
                short var5 = this.cy;
                if (this.bB) {
                    var4 = 18;
                }

                int var6;
                if (this.p()) {
                    var6 = var5 - var4 - 65;
                } else {
                    if (!this.isDie()) {
                        if (this.bM) {
                            var1.f(-16777216);
                            var1.c(var2 - 15, var5 - var4 - 60, 30, 7);
                            var1.f(-65536);
                            var1.c(var2 - 14, var5 - var4 - 59, this.a(28), 2);
                            var1.f(-16742145);
                            var1.c(var2 - 14, var5 - var4 - 59 + 3, this.c(28), 2);
                        } else {
                            var1.f(-16777216);
                            var1.c(var2 - 15, var5 - var4 - 68, 30, 4);
                            if (GameSrc.gI().a(this)) {
                                var1.f(-3407617);
                            } else if (GameSrc.gI().getMapTemplate().type == 20) {
                                if (GameSrc.gI().ay.contains(this)) {
                                    var1.f(-16711681);
                                } else {
                                    var1.f(-3407617);
                                }
                            } else if (GameSrc.gI().bq != null && GameSrc.gI().bq.b(this.name)) {
                                var1.f(-16711681);
                            } else if (this.m <= 1 && gI().m <= 1) {
                                var1.f(-65536);
                            } else {
                                var1.f(-9942667);
                            }

                            var1.c(var2 - 14, var5 - var4 - 67, this.a(28), 2);
                        }
                    }

                    var6 = var5 - var4 - 70;
                }

                int var7 = this.a(var1, var2, var6, 2);
                if (this.m == 2) {
                    vdtt_cz.a(var1, 723, 0, var2 + this.bl / 2 + 3, var7, 6);
                } else if (this.m == 3) {
                    vdtt_cz.a(var1, 724, 0, var2 + this.bl / 2 + 3, var7, 6);
                } else if (this.m == 4 && this.giatoc != null) {
                    vdtt_cz.a(var1, this.giatoc.d, 0, var2 + this.bl / 2 + 3, var7, 6);
                }

                var7 -= this.c(var1, var2, var7);
                var7 = this.d(var1, var2, var7);
                var7 = this.e(var1, var2, var7);
                Vector var8 = new Vector();

                Effect var9;
                int var10;
                for (var10 = 0; var10 < this.ba.size(); ++var10) {
                    Effect var11 = var9 = (Effect) this.ba.elementAt(var10);
                    if ((!this.p() || var11.id != 154) && var11.a()) {
                        var8.add(var9);
                    }
                }

                if (var8.size() > 0) {
                    int var14 = -(var8.size() - 1) * 17 / 2;

                    for (var10 = 0; var10 < var8.size(); ++var10) {
                        short var12 = (var9 = (Effect) var8.elementAt(var10)).getEffectTemplate().idIcon;
                        if (var9.id == 76 && var9.b != 300) {
                            var12 = 545;
                        }

                        var9.a(var1, this.cx + var14 - 7 + var10 * 17, var7 - 7, var12, true);
                    }

                    var7 -= 16;
                }

                if (GameSrc.gI().focusEntity != null && GameSrc.gI().focusEntity.equals(this)) {
                    GameSrc.gI().bn.setXY(this.cx, var7 + 4);
                    GameSrc.gI().bn.paintTop(var1);
                }

                if (this.bh != null) {
                    this.bh.a(var1);
                }
            }
        } catch (Exception var13) {
            Utlis.a(var13);
        }

    }

    public final void b(Graphics var1, int var2, int var3) {
        try {
            var3 = (var3 = this.a(var1, var2, 115, 2)) - this.c(var1, var2, var3);
            var3 = this.d(var1, var2, var3);
            this.e(var1, var2, var3);
        } catch (Exception var5) {
            Utlis.a(var5);
        }

    }

    public final boolean ac() {
        for (int var1 = 0; var1 < this.arrItemBag.length; ++var1) {
            Item var2;
            if ((var2 = this.arrItemBag[var1]) != null && Item.d(var2.id)) {
                return true;
            }
        }

        return false;
    }

    private int a(Graphics var1, int var2, int var3, int var4) {
        short var5 = -1;
        if (this.equals(GameSrc.gI().focusEntity)) {
            var5 = -6488;
        }

        vdtt_dd.b(vdtt_dd.d, var1, this.name, var2, var3 - 5, 2, var5, -16777216);
        return var3 - 5;
    }

    private int c(Graphics var1, int var2, int var3) {
        if (this.giatoc != null) {
            if (this.giatoc.c >= 3 && this.giatoc.c <= 5) {
                int[] var4 = new int[]{749, 750, 751};
                vdtt_cz.a(var1, var4[this.giatoc.c - 3], 0, var2 - this.bm / 2 - 6, var3 - 10, 3);
            }

            vdtt_dd.b(vdtt_dd.d, var1, this.giatoc.a, var2, var3 - 10, 2, -223233, -16777216);
            return 10;
        } else {
            return 0;
        }
    }

    private int d(Graphics var1, int var2, int var3) {
        if (this.selectDanhHieu != 0 && this.selectDanhHieu >= 0 && this.selectDanhHieu < this.danhhieu.length) {
            vdtt_dd var4 = vdtt_dd.g;
            int var5;
            if ((var5 = this.danhhieu[this.selectDanhHieu].c) > 0) {
                var4 = vdtt_dd.h;
                var5 = -var5;
            }

            int var6;
            if ((var6 = this.danhhieu[this.selectDanhHieu].d) > 0) {
                var6 = -var6;
            }

            if (this.danhhieu[this.selectDanhHieu].f >= 0) {
                var4 = vdtt_dd.j[this.danhhieu[this.selectDanhHieu].f];
            }

            vdtt_dd.a(var4, var1, this.danhhieu[this.selectDanhHieu].a.trim(), var2, var3 - 10, 2, var5, var6, 3, 0, this.danhhieu[this.selectDanhHieu].g, this.danhhieu[this.selectDanhHieu].e, 0);
            return var3 - 12;
        } else {
            return var3 + 2;
        }
    }

    private int e(Graphics var1, int var2, int var3) {
        vdtt_hf var4 = null;
        vdtt_hf var5 = null;

        for (int var6 = 0; var6 < this.be.size(); ++var6) {
            vdtt_hf var7;
            if ((var7 = (vdtt_hf) this.be.elementAt(var6)).k == 84) {
                var4 = var7;
                break;
            }

            if (var7.k == 85) {
                var5 = var7;
                break;
            }
        }

        if (var5 != null) {
            if (var5.m > 24) {
                vdtt_dd.a(vdtt_dd.g, var1, Caption.jF, var2, var3 - 15, 2, -1, -6817632, 0, 8);
            } else if (var5.m > 19) {
                vdtt_dd.a(vdtt_dd.g, var1, Caption.jF, var2, var3 - 10, 2, -1, -6817632, 0, 8);
            } else if (var5.m > 14) {
                vdtt_dd.a(vdtt_dd.g, var1, Caption.jF, var2, var3 - 5, 2, -1, -6817632, 0, 8);
            }
        } else if (var4 != null) {
            if (var4.m > 24) {
                vdtt_dd.a(vdtt_dd.g, var1, Caption.ky + " " + this.w(), var2, var3 - 15, 2, -1, -16711681, 0, 8);
            } else if (var4.m > 19) {
                vdtt_dd.a(vdtt_dd.g, var1, Caption.ky + " " + this.w(), var2, var3 - 10, 2, -1, -16711681, 0, 8);
            } else if (var4.m > 14) {
                vdtt_dd.a(vdtt_dd.g, var1, Caption.ky + " " + this.w(), var2, var3 - 5, 2, -1, -16711681, 0, 8);
            }
        } else if (this.n != 0) {
            if (this.n == 1) {
                vdtt_dd.a(vdtt_dd.h, var1, Caption.kz, var2, var3 - 16, 2, -1, -2560, 0, 20);
            } else if (this.n == 2) {
                vdtt_dd.a(vdtt_dd.h, var1, Caption.kA, var2, var3 - 16, 2, -1, -2560, 0, 20);
            } else if (this.n == 3) {
                vdtt_dd.a(vdtt_dd.h, var1, Caption.kB, var2, var3 - 16, 2, -1, -2560, 0, 20);
            }
        } else if (this.isCuuSat) {
            vdtt_dd.a(vdtt_dd.h, var1, Caption.ml, var2, var3 - 16, 2, -1, 4, 1);
        } else if (this.m == 1) {
            vdtt_dd.a(vdtt_dd.h, var1, Caption.mk, var2, var3 - 16, 2, -1, 4, 1);
        } else if (this.lvPk > 0) {
            vdtt_dd.a(vdtt_dd.h, var1, Caption.bZ, var2, var3 - 16, 2, -1, 4, 1);
        }

        return var3 - 16;
    }

    public final int prioritize() {
        return this.af() ? 4 : 3;
    }

    public final void a(short var1, short var2) {
        this.o();
        this.j();
        if (this.p()) {
            this.T();
            SessionMove.a = var1;
            SessionMove.b = var2;
        }

        this.cx = var1;
        this.cy = var2;
    }

    public final boolean ad() {
        for (int var1 = 0; var1 < this.ba.size(); ++var1) {
            if (((Effect) this.ba.get(var1)).getEffectTemplate().type == 117) {
                return true;
            }
        }

        return false;
    }

    public final Effect h(int var1) {
        for (int var2 = 0; var2 < this.ba.size(); ++var2) {
            Effect var3;
            if ((var3 = (Effect) this.ba.get(var2)).getEffectTemplate().id == var1) {
                return var3;
            }
        }

        return null;
    }

    private Effect l(int var1) {
        for (int var2 = 0; var2 < this.ba.size(); ++var2) {
            Effect var3;
            if ((var3 = (Effect) this.ba.get(var2)).getEffectTemplate().type == var1) {
                return var3;
            }
        }

        return null;
    }

    public final void a(Effect var1) {
        for (int var2 = 0; var2 < this.ba.size(); ++var2) {
            Effect var3;
            if ((var3 = (Effect) this.ba.get(var2)).getEffectTemplate().type == 77 && var3.getEffectTemplate().name.contains(var1.getEffectTemplate().name) && var3.getEffectTemplate().idIcon == var1.getEffectTemplate().idIcon && var1.i == var3.i) {
                if (var1.id == 159) {
                    var3.k = var1.b;
                }

                switch (var1.b) {
                    case 1:
                        var3.j = 8;
                        break;
                    case 2:
                        var3.j = 9;
                        break;
                    case 3:
                        var3.j = 10;
                        break;
                    case 4:
                        var3.j = 11;
                        break;
                    case 5:
                        var3.j = 16;
                        break;
                    case 6:
                        var3.j = 20;
                }

                var3.g.add(var1);
                return;
            }

            if (var3.getEffectTemplate().name.equals(var1.getEffectTemplate().name) && var3.getEffectTemplate().idIcon == var1.getEffectTemplate().idIcon && var1.i == var3.i) {
                var3.g.add(var1);
                return;
            }
        }

        this.ba.add(var1);
    }

    public final Item[] i(int var1) {
        switch (var1) {
            case 0:
                return this.arrItemBag;
            case 1:
                return this.arrItemBox;
            case 2:
                return this.arrItemBody;
            case 3:
                return this.arrItemBody2;
            case 4:
                return this.arrItemExtra;
            default:
                return null;
        }
    }

    public final void a(Entity var1) {
        this.aX = new vdtt_eb(this.aY, var1);
        GameSrc.gI().av.add(new vdtt_hf(337, this.cx, this.cy, 3));
        if (this.p()) {
            GameSrc.gI().cF = var1;
            GameSrc.gI().cG = 100;
        }

    }

    public final int j(int var1) {
        this.ac = var1;
        if (var1 % 9 == 0) {
            var1 = var1 / 9 * 9;
        } else {
            var1 = var1 / 9 * 9 + 9;
        }

        return var1;
    }

    public final boolean ae() {
        if (this.bx == null && this.by == null) {
            return this.br || !this.aD() && this.arrItemBody[14] != null && this.arrItemBody[14].ag() || this.bu != null && this.bu.a(this);
        } else {
            return false;
        }
    }

    public final boolean af() {
        return GameSrc.gI().ac() && this.m == 0 && !this.bM || GameSrc.gI().getMapTemplate().type == 19 && GameSrc.gI().ax.contains(this) || this.ah();
    }

    public final int ag() {
        return DataCenter.gI().dataIconChar[this.idCharSys].idIcon;
    }

    private boolean aD() {
        return this.bp == 1 || this.bp == 3 || this.bp == 4 || this.bp == 5;
    }

    private boolean aE() {
        return this.bp == 2 || this.bp == 3 || this.bp == 5;
    }

    private boolean aF() {
        return this.bp == 4 || this.bp == 5;
    }

    private boolean aG() {
        return this.bp == 5;
    }

    private int m(int var1) {
        if (this.arrItemBody[15] != null) {
            switch (var1) {
                case 359:
                    var1 = 309;
                    break;
                case 360:
                    var1 = 310;
            }

            if (this.arrItemBody[15].id == 570) {
                switch (var1) {
                    case 309:
                        var1 = 377;
                        break;
                    case 310:
                        var1 = 378;
                }
            } else if (this.arrItemBody[15].id == 944) {
                switch (var1) {
                    case 309:
                        var1 = 379;
                        break;
                    case 310:
                        var1 = 380;
                }
            } else if (this.arrItemBody[15].id == 963) {
                switch (var1) {
                    case 309:
                        var1 = 6738;
                        break;
                    case 310:
                        var1 = 6739;
                }
            } else if (this.arrItemBody[15].id == 972) {
                switch (var1) {
                    case 309:
                        var1 = 6740;
                        break;
                    case 310:
                        var1 = 6741;
                }
            } else if (this.arrItemBody[15].id == 989) {
                switch (var1) {
                    case 309:
                        var1 = 3752;
                        break;
                    case 310:
                        var1 = 3753;
                }
            }
        }

        switch (var1) {
            case 309:
            case 359:
            case 6738:
                var1 += DataCenter.gI().h / 5 % 2;
                break;
            case 310:
            case 360:
            case 6739:
                var1 -= DataCenter.gI().h / 5 % 2;
        }

        return var1;
    }

    private int n(int var1) {
        if (this.bx != null || this.by != null && this.arrItemBody[15] != null && this.arrItemBody[15].ao()) {
            switch (var1) {
                case 1902:
                    var1 = 1086;
                    break;
                case 3386:
                    var1 = 1087;
                    break;
                case 4719:
                    var1 = 1088;
            }
        }

        return var1;
    }

    public final boolean ah() {
        return this.bL && this.bx != null;
    }

    private static boolean o(int var0) {
        return var0 == 92 || var0 == 147 || var0 == 151;
    }

    public final void f(Message var1) throws IOException {
        DanhHieu[] var2;
        (var2 = new DanhHieu[var1.readByte() + 1])[0] = new DanhHieu();
        var2[0].a = Caption.mI;

        for (int var3 = 1; var3 < var2.length; ++var3) {
            var2[var3] = new DanhHieu();
            String var4 = var1.reader.readUTF();
            var2[var3].a = var4;
            var2[var3].b = var1.readInt();
            if (var4.startsWith(" ")) {
                var2[var3].c = var1.readInt();
            }

            var2[var3].a();
        }

        this.danhhieu = var2;
    }
}
