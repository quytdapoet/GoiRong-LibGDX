package gro;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Blending;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.PixmapIO;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.ScreenUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

public final class GameSrc extends MainScreen {

    public static boolean d;
    public static String H = "";
    public static String I = "";
    public static String J = "";
    public static int K;
    public static int L;
    public static byte[] M;
    public static long N;
    public static short[][] O;
    public static int P;
    private static GameSrc dO = null;
    private static mImage dP;
    private static mImage dQ;
    private static short[][] dR = new short[][]{{649, 222}, {443, 223}, {612, 223}, {684, 223}, {405, 224}, {370, 226}, {719, 226}, {336, 228}, {754, 231}, {296, 232}, {788, 235}, {261, 237}, {823, 240}, {226, 243}, {859, 245}, {892, 250}, {189, 251}, {925, 257}, {153, 259}, {954, 264}, {117, 268}, {991, 276}, {85, 279}, {1020, 294}, {57, 299}, {1033, 316}, {45, 329}, {1021, 333}};
    private static short[][] dS = new short[][]{{309, 206}, {390, 206}, {473, 206}, {553, 206}, {630, 206}, {711, 206}, {781, 206}, {855, 206}, {820, 263}, {746, 263}, {669, 263}, {425, 263}, {346, 263}, {260, 263}, {193, 324}, {294, 324}, {379, 324}, {435, 324}, {646, 324}, {711, 324}, {785, 324}, {880, 324}, {819, 175}, {744, 175}, {654, 175}, {447, 175}, {351, 175}, {266, 175}, {231, 206}};
    private final int dT = 30;
    public Vector Q = new Vector();
    public Vector R = new Vector();
    public Vector S = new Vector();
    public vdtt_ix[] T;
    public vdtt_fl[] U;
    public vdtt_fk V;
    public Vector W = new Vector();
    public Vector X = new Vector();
    public Vector Y = new Vector();
    public Vector Z = new Vector();
    public Vector vThu;
    public Vector vFriend;
    public Vector ac;
    public Vector vEnemy;
    public Skill[] ae = new Skill[3];
    public Skill[] af;
    public long timeLoadMap;
    public int mocNap;
    public int timeChatColor;
    public short mapID;
    public short maxX;
    public short maxY;
    public short zoneID;
    public short an = 4;
    public Vector vCharMove = new Vector();
    public Vector vChar = new Vector();
    public Vector vMob = new Vector();
    public Vector vNpc = new Vector();
    public Vector vItemMap = new Vector();
    public Vector at;
    public Vector au;
    public Vector av;
    public Vector vWayPoint;
    public Vector ax = new Vector();
    public Vector ay = new Vector();
    public vdtt_bk az;
    public vdtt_bk aA;
    public vdtt_bk aB;
    public vdtt_lh aC;
    public int aD;
    public vdtt_az aE;
    public vdtt_ay[] aF = new vdtt_ay[4];
    public vdtt_ay aG;
    public vdtt_ay aH;
    public vdtt_ay aI;
    public vdtt_ay aJ;
    public vdtt_ay aK;
    public vdtt_ay aL;
    public vdtt_ay aM;
    public vdtt_ay aN;
    public vdtt_ay aO;
    public vdtt_ay aP;
    public vdtt_by aQ;
    public vdtt_be aR;
    public vdtt_ba aS;
    public vdtt_bu aT;
    public vdtt_bv aU;
    public boolean aV;
    public boolean aW;
    public boolean aX;
    public boolean aY;
    public boolean aZ;
    public boolean ba;
    public int minRangeNpc = 33;
    public int minRangeItemMap = 40;
    public int bd;
    public int be;
    public int bf = 2;
    public int bg = 1;
    public Entity focusEntity;
    public Entity bi;
    public ItemCho[] bj;
    public ItemCho[] bk;
    public vdtt_dy bl = new vdtt_dy();
    public Vector bm = new Vector();
    public vdtt_es bn = new vdtt_es(208, 0, 0, -1);
    public vdtt_es bo = new vdtt_es(0, 0, 0, -1);
    public Skill bp;
    public mParty bq = new mParty();
    public vdtt_ka br;
    public int idTask;
    public int idStep;
    public int numStepDone;
    public int bv = -1;
    public vdtt_dv pointMoveMap;
    public vdtt_dv bx;
    public vdtt_ij taskTuanHoan;
    public vdtt_ij bz;
    public vdtt_ij bA;
    public vdtt_ij bB;
    public vdtt_ij bC;
    public vdtt_ij bD;
    public vdtt_ij bE;
    public boolean bF;
    public boolean bG;
    public boolean bH;
    public Vector bI;
    public int bJ;
    public int bK;
    public int bL;
    public int bM;
    public int bN = 1000;
    public int bO;
    public int bP;
    public int bQ = 0;
    public long bR;
    public int bS;
    public int bT;
    public int bU;
    public int bV;
    public int bW;
    public int bX;
    public int bY = Integer.MIN_VALUE;
    public boolean bZ;
    public boolean ca;
    public boolean cb;
    public boolean cc;
    public boolean cd;
    public long ce;
    public long cf;
    public short cg;
    public short ch;
    public int ci;
    public int cj;
    public int ck;
    public int cl;
    public String cm = "";
    public boolean cn;
    public boolean co = true;
    public boolean cp;
    public byte cq;
    public byte cr;
    public byte cs;
    public byte ct;
    public Vector cu = new Vector();
    public byte cv;
    public byte cw;
    public byte cx_;
    public int cy_ = -1;
    public boolean cz;
    public Mob cA;
    public boolean cB;
    public boolean cC;
    public int cD;
    public int cE;
    public Entity cF;
    public int cG;
    public boolean cH;
    public int cI;
    public int cJ = -1;
    public String cK = "";
    public Vector cL;
    public Vector cM = new Vector();
    public int cN = 0;
    public int cO = 0;
    public boolean cP;
    public vdtt_ay cQ;
    public vdtt_ay cR;
    public vdtt_ay cS;
    public Vector cT;
    public int capCayTao;
    public int timeCayTao;
    public int cW;
    public int cX;
    public int cY;
    public long cZ;
    public short[] da;
    public int db = 50;
    public int dc = 0;
    public int dd;
    public int de = 30;
    public Vector df = new Vector();
    public int dg = -1;
    public int dh = -1;
    public int di;
    public int dj;
    public long dk;
    public long dl;
    public vdtt_dw dm = new vdtt_dw();
    protected long dn = 0L;
    public Vector do_;
    public Vector dp;
    private Vector dU;
    public Vector dq;
    public Vector dr;
    private Vector dV;
    public vdtt_bk ds;
    public vdtt_bk dt;
    public vdtt_bk du;
    public vdtt_bk dv;
    private vdtt_ay[] dW = new vdtt_ay[4];
    public vdtt_ay dw;
    private vdtt_ay dX;
    private vdtt_ay dY;
    private int dZ;
    private int ea;
    private int eb;
    private int ec;
    private int ed;
    private int ee;
    private int ef = Integer.MIN_VALUE;
    private int eg = 0;
    private Vector eh = new Vector();
    private Vector ei = new Vector();
    private Vector ej = new Vector();
    public vdtt_ay dx;
    public vdtt_ay dy;
    public vdtt_ay dz;
    public vdtt_ay dA;
    public vdtt_ay dB;
    private long ek;
    private int el;
    private long em;
    public boolean dC;
    private int en = 0;
    private boolean eo;
    private long ep;
    private int eq = 5;
    private int er = 1;
    private long es;
    public long dD;
    public long dE;
    private vdtt_ed et;
    public String dF;
    private int eu;
    private long ev;
    public Item dG;
    private boolean ew;
    private int[][] ex;
    public Skill dH;
    private int ey = 1;
    public boolean dI = false;
    public long dJ;
    public static int dK = 120;
    public Hashtable dL = new Hashtable();
    public Vector dM = new Vector();
    public Vector dN = new Vector();

    public GameSrc() {
        this.vItemMap = new Vector();
        this.at = new Vector();
        this.au = new Vector();
        this.av = new Vector();
        this.vWayPoint = new Vector();
        this.do_ = new Vector();
        this.dp = new Vector();
        this.dU = new Vector();
        this.vThu = new Vector();
        this.vFriend = new Vector();
        this.vEnemy = new Vector();
        this.dq = new Vector();
        this.bI = new Vector();
        this.dr = new Vector();
        this.cT = new Vector();
        this.bj = new ItemCho[0];
        this.bk = new ItemCho[0];
        int[] var1 = new int[]{223, 177, 189, 276, 156, 157, 158, 166, 168, 185, 186, 162, 169, 170, 301, 159, 281, 182, 183, 184, 300, 161, 277, 285, 265, 274, 267, 266, 307};
        this.dV = new Vector();

        for (int var2 = 0; var2 < 29; ++var2) {
            this.dV.add(var1[var2]);
        }

        this.cL = new Vector();
    }

    public static GameSrc gI() {
        if (dO == null) {
            dO = new GameSrc();
        }

        return dO;
    }

    public static GameSrc w() {
        return dO;
    }

    public static int f(int var0) {
        int var1 = 0;

        for (int var2 = 0; var2 < DataCenter.gI().x.length; ++var2) {
            for (int var3 = 0; var3 < DataCenter.gI().x[var2].b.length; ++var3) {
                if (DataCenter.gI().x[var2].b[var3].a == var0) {
                    var1 = var2;
                    break;
                }
            }
        }

        if (var1 >= Caption.Br.length) {
            var1 = 0;
        }

        return var1;
    }

    public static void e(Graphics var0) {
        if (M != null) {
            dQ = Binary.a(M);
            M = null;
        }

        if (dQ != null) {
            var0.a(dQ, 0, 0, dQ.c, dQ.d, 0, 0, 0, DataCenter.gI().n * DataCenter.gI().r, DataCenter.gI().o * DataCenter.gI().r, 0);
        }

    }

    public static XYEntity g(int var0, int var1) {
        try {
            gI();
            XYEntity var2;
            if ((var2 = vdtt_fk.c(var0, var1)) != null && Utlis.b(var1 - var2.cy) > 1) {
                return var2;
            }
        } catch (Exception var3) {
        }

        return null;
    }

    private void a(Reader var1) throws IOException{
        this.T = new vdtt_ix[var1.dis.readUnsignedShort()];
        Vector var2 = new Vector();

        short var3;
        short var4;
        vdtt_fw var5;
        int var6;
        int var7;
        int var8;
        vdtt_fw[] var9;
        for (short var10 = 0; var10 < this.T.length; ++var10) {
            var2.removeAllElements();
            this.T[var10] = new vdtt_ix();
            this.T[var10].a = var1.dis.readShort();
            this.T[var10].b = var1.dis.readShort();
            this.T[var10].c = var1.dis.readByte();
            this.T[var10].d = var1.dis.readShort();
            this.T[var10].e = var1.dis.readShort();
            var3 = var1.readUnsignedByte();

            for (var6 = 0; var6 < var3; ++var6) {
                var4 = var1.readUnsignedByte();

                for (var7 = 0; var7 < var4; ++var7) {
                    (var5 = new vdtt_fw()).d = new XYEntity[var1.dis.readByte() / 2];

                    for (var8 = 0; var8 < var5.d.length; ++var8) {
                        var5.d[var8] = new XYEntity();
                        var5.d[var8].setXY(var1.dis.readShort(), var1.dis.readShort());
                        if (var8 == 0) {
                            var5.e = var5.g = var5.d[var8].cx;
                            var5.f = var5.h = var5.d[var8].cy;
                        } else {
                            if (var5.d[var8].cx < var5.e) {
                                var5.e = var5.d[var8].cx;
                            }

                            if (var5.d[var8].cx > var5.g) {
                                var5.g = var5.d[var8].cx;
                            }

                            if (var5.d[var8].cy < var5.f) {
                                var5.f = var5.d[var8].cy;
                            }

                            if (var5.d[var8].cy > var5.h) {
                                var5.h = var5.d[var8].cy;
                            }
                        }
                    }

                    var2.addElement(var5);
                }
            }

            if (var2.size() > 0) {
                var9 = new vdtt_fw[var2.size()];

                for (var6 = 0; var6 < var2.size(); ++var6) {
                    var9[var6] = (vdtt_fw) var2.elementAt(var6);
                }

                this.T[var10].f = new vdtt_fk(var9);
            }
        }

        this.U = new vdtt_fl[var1.dis.readUnsignedShort()];

        for (int var12 = 0; var12 < this.U.length; ++var12) {
            var2.removeAllElements();
            this.U[var12] = new vdtt_fl();
            this.U[var12].a = var1.dis.readShort();
            this.U[var12].b = var1.dis.readShort();
            this.U[var12].c = new vdtt_iw[var1.readUnsignedByte()];

            for (var6 = 0; var6 < this.U[var12].c.length; ++var6) {
                this.U[var12].c[var6] = new vdtt_iw(var1.dis.readShort());
                this.U[var12].c[var6].cx = this.U[var12].c[var6].m = var1.dis.readShort();
                this.U[var12].c[var6].cy = this.U[var12].c[var6].n = var1.dis.readShort();
                this.U[var12].c[var6].k = var1.dis.readByte();
                if (this.U[var12].c[var6].m().f != null) {
                    for (var7 = 0; var7 < this.U[var12].c[var6].m().f.a.size(); ++var7) {
                        var5 = ((vdtt_fw) this.U[var12].c[var6].m().f.a.get(var7)).a();
                        if (this.U[var12].c[var6].k == 7) {
                            var5.d = Utlis.a(var5.d);
                        }

                        for (var8 = 0; var8 < var5.d.length; ++var8) {
                            XYEntity var11 = var5.d[var8];
                            var11.cx += this.U[var12].c[var6].cx;
                            var11 = var5.d[var8];
                            var11.cy += this.U[var12].c[var6].cy;
                            if (var8 == 0) {
                                var5.e = var5.g = var5.d[var8].cx;
                                var5.f = var5.h = var5.d[var8].cy;
                            } else {
                                if (var5.d[var8].cx < var5.e) {
                                    var5.e = var5.d[var8].cx;
                                }

                                if (var5.d[var8].cx > var5.g) {
                                    var5.g = var5.d[var8].cx;
                                }

                                if (var5.d[var8].cy < var5.f) {
                                    var5.f = var5.d[var8].cy;
                                }

                                if (var5.d[var8].cy > var5.h) {
                                    var5.h = var5.d[var8].cy;
                                }
                            }
                        }

                        var2.addElement(var5);
                    }
                }
            }

            var3 = var1.readUnsignedByte();

            for (var6 = 0; var6 < var3; ++var6) {
                var4 = var1.readUnsignedByte();

                for (var7 = 0; var7 < var4; ++var7) {
                    (var5 = new vdtt_fw()).d = new XYEntity[var1.dis.readByte() / 2];

                    for (var8 = 0; var8 < var5.d.length; ++var8) {
                        var5.d[var8] = new XYEntity();
                        var5.d[var8].setXY(var1.dis.readShort(), var1.dis.readShort());
                        if (var8 == 0) {
                            var5.e = var5.g = var5.d[var8].cx;
                            var5.f = var5.h = var5.d[var8].cy;
                        } else {
                            if (var5.d[var8].cx < var5.e) {
                                var5.e = var5.d[var8].cx;
                            }

                            if (var5.d[var8].cx > var5.g) {
                                var5.g = var5.d[var8].cx;
                            }

                            if (var5.d[var8].cy < var5.f) {
                                var5.f = var5.d[var8].cy;
                            }

                            if (var5.d[var8].cy > var5.h) {
                                var5.h = var5.d[var8].cy;
                            }
                        }
                    }

                    var2.addElement(var5);
                }
            }

            if (var2.size() > 0) {
                var9 = new vdtt_fw[var2.size()];

                for (var6 = 0; var6 < var2.size(); ++var6) {
                    var9[var6] = (vdtt_fw) var2.elementAt(var6);
                }

                this.U[var12].d = new vdtt_fk(var9);
            }
        }

    }

    public final void x() {
        this.timeLoadMap = Utlis.a();
        Reader var1 = null;

        try {
            m = true;
            this.bH = false;
            vdtt_aa.gI().c();
            if ((var1 = Binary.a("arr_map_" + this.mapID)) == null) {
                return;
            }

            this.cN = 0;
            this.a(var1);
            this.Q.clear();
            new Vector();
            this.maxX = var1.dis.readShort();
            this.maxY = var1.dis.readShort();
            vdtt_fw[] var2;
            (var2 = new vdtt_fw[var1.readUnsignedByte() + 4])[var2.length - 1] = b(-50, -50, this.maxX + 50, 50);
            var2[var2.length - 2] = b(-50, -50, 15, this.maxY + 50);
            var2[var2.length - 3] = b(-50, this.maxY - 15, this.maxX + 50, this.maxY + 50);
            var2[var2.length - 4] = b(this.maxX - 15, -50, this.maxX + 50, this.maxY + 50);

            int var3;
            for (var3 = 0; var3 < var2.length - 4; ++var3) {
                var2[var3] = new vdtt_fw();
                var2[var3].d = new XYEntity[var1.readUnsignedByte()];

                for (int var4 = 0; var4 < var2[var3].d.length; ++var4) {
                    var2[var3].d[var4] = new XYEntity();
                    var2[var3].d[var4].setXY(var1.dis.readShort(), var1.dis.readShort());
                    if (var4 == 0) {
                        var2[var3].e = var2[var3].g = var2[var3].d[var4].cx;
                        var2[var3].f = var2[var3].h = var2[var3].d[var4].cy;
                    } else {
                        if (var2[var3].d[var4].cx < var2[var3].e) {
                            var2[var3].e = var2[var3].d[var4].cx;
                        }

                        if (var2[var3].d[var4].cx > var2[var3].g) {
                            var2[var3].g = var2[var3].d[var4].cx;
                        }

                        if (var2[var3].d[var4].cy < var2[var3].f) {
                            var2[var3].f = var2[var3].d[var4].cy;
                        }

                        if (var2[var3].d[var4].cy > var2[var3].h) {
                            var2[var3].h = var2[var3].d[var4].cy;
                        }
                    }
                }
            }

            this.V = new vdtt_fk(var2);
            vdtt_fv[] var40 = new vdtt_fv[var1.dis.readShort()];
            Vector var5 = new Vector();
            Vector var6 = new Vector();

            int var7;
            int var8;
            for (var7 = 0; var7 < var40.length; ++var7) {
                var40[var7] = new vdtt_fv();
                var40[var7].a = var1.dis.readBoolean();
                if (var40[var7].a) {
                    var6.add(var40[var7]);
                } else {
                    var5.add(var40[var7]);
                }

                var40[var7].d = new XYEntity[var1.dis.readShort()];

                for (var8 = 0; var8 < var40[var7].d.length; ++var8) {
                    var40[var7].d[var8] = new XYEntity();
                    var40[var7].d[var8].setXY(var1.dis.readShort(), var1.dis.readShort());
                }
            }

            this.dL.clear();
            this.dM.clear();
            this.dN.clear();

            vdtt_fv var9;
            for (var7 = 0; var7 < var6.size(); ++var7) {
                if ((var9 = (vdtt_fv) var6.get(var7)).d.length > 2) {
                    gI().V.a.add(new vdtt_fw(var9.d));

                    try {
                        for (var3 = 0; var3 < var9.d.length; ++var3) {
                            if (var9.d[var3].cy != var9.d[var3 + 1].cy) {
                                if (var9.d[var3].cy < var9.d[var3 + 1].cy) {
                                    this.dN.add(new vdtt_fw(new XYEntity[]{var9.d[var3], var9.d[var3 + 1]}));
                                } else {
                                    this.dN.add(new vdtt_fw(new XYEntity[]{var9.d[var3 + 1], var9.d[var3]}));
                                }

                                ++var3;
                            }
                        }
                    } catch (Exception var36) {
                    }
                } else {
                    for (var3 = 0; var3 < var9.d.length; ++var3) {
                        XYEntity var10 = var9.d[var3];
                        if (gI().V.a(var10.cx, var10.cy)) {
                            XYEntity var11 = gI().V.b(var10.cx, var10.cy);
                            var9.d[var3].cx = var11.cx;
                            var9.d[var3].cy = var11.cy;
                        }
                    }
                }
            }

            var40 = new vdtt_fv[var5.size()];

            for (var7 = 0; var7 < var5.size(); ++var7) {
                var40[var7] = (vdtt_fv) var5.get(var7);
                if (Utlis.b(var40[var7].d[0].cy - var40[var7].d[1].cy) > dK) {
                    if (var40[var7].d[0].cy > var40[var7].d[1].cy) {
                        this.a(var40[var7].d[1], var40[var7].d[0], true, this.dL);
                    } else {
                        this.a(var40[var7].d[0], var40[var7].d[1], true, this.dL);
                    }
                } else {
                    this.a(var40[var7].d[0], var40[var7].d[1], true, this.dL);
                    this.a(var40[var7].d[1], var40[var7].d[0], true, this.dL);
                }
            }

            Iterator var41 = this.dL.keySet().iterator();

            while (var41.hasNext()) {
                String var42 = (String) var41.next();
                ((vdtt_gn) this.dL.get(var42)).b = new Vector();
                ((vdtt_gn) this.dL.get(var42)).c = new Vector();
                ((vdtt_gn) this.dL.get(var42)).d = new Vector();
                ((vdtt_gn) this.dL.get(var42)).e = new Vector();
                ((vdtt_gn) this.dL.get(var42)).f = new Vector();
                ((vdtt_gn) this.dL.get(var42)).e.addAll(((vdtt_gn) this.dL.get(var42)).a);
                ((vdtt_gn) this.dL.get(var42)).f.addAll(((vdtt_gn) this.dL.get(var42)).a);
                Collections.sort(((vdtt_gn) this.dL.get(var42)).e);
                Collections.sort(((vdtt_gn) this.dL.get(var42)).f, Collections.reverseOrder());

                for (var3 = ((vdtt_gn) this.dL.get(var42)).a.size() - 1; var3 >= 0; --var3) {
                    ((vdtt_gn) this.dL.get(var42)).b.add(((vdtt_gn) this.dL.get(var42)).a.get(var3));
                }

                ((vdtt_gn) this.dL.get(var42)).c.addAll(((vdtt_gn) this.dL.get(var42)).a);
                String var12;
                if (((vdtt_gn) this.dL.get(var42)).c.size() > 0) {
                    var12 = (String) ((vdtt_gn) this.dL.get(var42)).c.get(0);
                    ((vdtt_gn) this.dL.get(var42)).c.removeElementAt(0);
                    ((vdtt_gn) this.dL.get(var42)).c.add(var12);
                }

                ((vdtt_gn) this.dL.get(var42)).d.addAll(((vdtt_gn) this.dL.get(var42)).b);
                if (((vdtt_gn) this.dL.get(var42)).d.size() > 0) {
                    var12 = (String) ((vdtt_gn) this.dL.get(var42)).d.get(0);
                    ((vdtt_gn) this.dL.get(var42)).d.removeElementAt(0);
                    ((vdtt_gn) this.dL.get(var42)).d.add(var12);
                }
            }

            this.X.clear();

            for (var7 = 0; var7 < var6.size(); ++var7) {
                var9 = (vdtt_fv) var6.get(var7);

                try {
                    for (var3 = 0; var3 < var9.d.length; var3 += 2) {
                        vdtt_fw var43;
                        (var43 = new vdtt_fw()).d = new XYEntity[2];
                        var43.d[0] = var9.d[var3];
                        var43.d[1] = var9.d[var3 + 1];
                        if (var43.d[0].cy == var43.d[1].cy && var43.d[0].cy < this.maxY - 20) {
                            this.X.add(var43);
                        }
                    }
                } catch (Exception var37) {
                }
            }

            Collections.sort(this.dN, vdtt_fw.c);
            Collections.sort(this.dM, vdtt_fw.b);
            Collections.sort(this.X, vdtt_fw.b);
            short var44 = var1.dis.readShort();

            for (var8 = 0; var8 < var44; ++var8) {
                var1.dis.readShort();
            }

            this.R.removeAllElements();
            var44 = var1.dis.readShort();
            Short var45 = null;
            int var13 = 0;
            Vector var14 = new Vector();
            int var15 = 0;
            vdtt_iw var16 = null;

            int var17;
            vdtt_iw var18;
            for (var17 = 0; var17 < var44; ++var17) {
                if (var13 == 0) {
                    var45 = var1.dis.readShort();
                    this.Q.addElement(var45);
                    var13 = var1.dis.readShort();
                }

                (var18 = new vdtt_iw(var45)).cx = var18.m = var1.dis.readShort();
                var18.cy = var18.n = var1.dis.readShort();
                var18.k = var1.dis.readByte();
                if (var18.m().e >= 0 && var18.m().d >= 6 && var18.m().d != 11) {
                    var14.add(var18);
                    if (var18.m().d == 9 || var18.m().d == 10) {
                        var16 = var18;
                        ++var15;
                    }
                } else {
                    this.R.addElement(var18);
                }

                if (var13 > 0) {
                    --var13;
                }
            }

            this.bH = true;

            for (var17 = 0; var17 < this.vMob.size(); ++var17) {
                ((Mob) this.vMob.get(var17)).m();
            }

            for (var17 = 0; var17 < this.vNpc.size(); ++var17) {
                ((Npc) this.vNpc.get(var17)).n();
            }

            this.eh.clear();
            this.ei.clear();
            short var19;
            label926:
            switch (this.getMapTemplate().typeArr) {
                case 1:
                    var7 = 0;

                    while (true) {
                        if (var7 >= 30) {
                            break label926;
                        }

                        var19 = 577;
                        if (var7 % 4 == 0) {
                            var19 = 578;
                        } else if (var7 % 5 == 0) {
                            var19 = 579;
                        }

                        this.ei.add(new vdtt_du(var19, 5, 5, 5, var7, 30, this.maxX, this.maxY, false));
                        ++var7;
                    }
                case 2:
                    var7 = 0;

                    while (true) {
                        if (var7 >= 25) {
                            break label926;
                        }

                        var19 = 580;
                        if (var7 % 4 == 0) {
                            var19 = 581;
                        } else if (var7 % 5 == 0) {
                            var19 = 582;
                        }

                        this.ei.add(new vdtt_du(var19, 4, 4, 5, var7, 25, this.maxX, this.maxY, false));
                        ++var7;
                    }
                case 3:
                    var7 = 0;

                    while (true) {
                        if (var7 >= 200) {
                            break label926;
                        }

                        byte var20 = 28;
                        if (var7 % 2 == 0) {
                            var20 = 29;
                        } else if (var7 % 3 == 0) {
                            var20 = 30;
                        }

                        this.ei.add(new vdtt_du(var20, 2, 2, 8, var7, 200, this.maxX, this.maxY, false));
                        ++var7;
                    }
                case 4:
                    var19 = 0;
                    var7 = 0;

                    while (true) {
                        if (var7 >= 60) {
                            break label926;
                        }

                        if (var7 % 2 == 0) {
                            var19 = 191;
                        } else if (var7 % 3 == 0) {
                            var19 = 192;
                        }

                        this.ei.add(new vdtt_du(var19, 4, 1, 8, var7, 60, this.maxX, this.maxY, false));
                        ++var7;
                    }
                case 5:
                    var7 = 0;

                    while (true) {
                        if (var7 >= 150) {
                            break label926;
                        }

                        if (var7 % 8 == 0) {
                            var3 = Utlis.b() ? 12 : 14;
                            this.ei.add(new vdtt_du(var3, 0, 3, 11, var7, 150, this.maxX, this.maxY, false));
                        } else {
                            var3 = Utlis.b() ? 11 : 13;
                            this.ei.add(new vdtt_du(var3, 0, 3, 11, var7, 150, this.maxX, this.maxY, false));
                        }

                        ++var7;
                    }
                case 6:
                    var7 = 0;

                    while (true) {
                        if (var7 >= 100) {
                            break label926;
                        }

                        if (var7 % 8 == 0) {
                            this.ei.add(new vdtt_du(14, 0, 3, 11, var7, 100, this.maxX, this.maxY, false));
                        } else {
                            this.ei.add(new vdtt_du(13, 0, 3, 11, var7, 100, this.maxX, this.maxY, false));
                        }

                        ++var7;
                    }
                case 7:
                    for (var7 = 0; var7 < 80; ++var7) {
                        if (var7 % 8 == 0) {
                            this.ei.add(new vdtt_du(12, 0, 3, 11, var7, 80, this.maxX, this.maxY, false));
                        } else {
                            this.ei.add(new vdtt_du(11, 0, 3, 11, var7, 80, this.maxX, this.maxY, false));
                        }
                    }
                case 8:
                default:
                    break;
                case 9:
                    for (var7 = 0; var7 < 100; ++var7) {
                        var19 = 443;
                        if (var7 % 2 == 0) {
                            var19 = 444;
                        } else if (var7 % 3 == 0) {
                            var19 = 445;
                        }

                        this.ei.add(new vdtt_du(var19, Utlis.a(1, 3), 0, 9, var7, 100, this.maxX, this.maxY, false));
                    }
            }

            if (var14.size() > 0) {
                if (var16 != null) {
                    (var18 = new vdtt_iw(var16.l)).cx = var18.m = (short) (var16.cx + var16.m().a);
                    var18.cy = var18.n = var16.cy;
                    var18.k = var16.k;
                    var14.add(var18);
                    (var18 = new vdtt_iw(var16.l)).cx = var18.m = (short) (var16.cx + var16.m().a * 2);
                    var18.cy = var18.n = var16.cy;
                    var18.k = var16.k;
                    var14.add(var18);
                    (var18 = new vdtt_iw(var16.l)).cx = var18.m = (short) (var16.cx + var16.m().a * 3);
                    var18.cy = var18.n = var16.cy;
                    var18.k = var16.k;
                    var14.add(var18);
                }

                Collections.sort(var14, XYEntity.E);

                for (var17 = 0; var17 < var14.size(); ++var17) {
                    if (((vdtt_iw) var14.get(var17)).m().d == 10) {
                        this.eh.add(new vdtt_du(DataCenter.gI().E[((vdtt_iw) var14.get(var17)).m().e].b[0].a, 1, 0, 4, var17, var15 + 3, this.maxX, ((vdtt_iw) var14.get(var17)).cy, true, ((vdtt_iw) var14.get(var17)).m().a, ((vdtt_iw) var14.get(var17)).m().b));
                    } else if (((vdtt_iw) var14.get(var17)).m().d == 9) {
                        this.eh.add(new vdtt_du(DataCenter.gI().E[((vdtt_iw) var14.get(var17)).m().e].b[0].a, 1, 0, 3, var17, var15 + 3, this.maxX, ((vdtt_iw) var14.get(var17)).cy, true, ((vdtt_iw) var14.get(var17)).m().a, ((vdtt_iw) var14.get(var17)).m().b));
                    } else if (((vdtt_iw) var14.get(var17)).m().d == 8) {
                        this.eh.add(new vdtt_du(DataCenter.gI().E[((vdtt_iw) var14.get(var17)).m().e].b[0].a, 3, 0, 2, var17, 0, this.maxX, ((vdtt_iw) var14.get(var17)).cy, true));
                    } else if (((vdtt_iw) var14.get(var17)).m().d == 7) {
                        this.eh.add(new vdtt_du(DataCenter.gI().E[((vdtt_iw) var14.get(var17)).m().e].b[0].a, 3, 0, 0, var17, 0, this.maxX, ((vdtt_iw) var14.get(var17)).cy, true));
                    } else if (((vdtt_iw) var14.get(var17)).m().d == 6) {
                        this.eh.add(new vdtt_du(DataCenter.gI().E[((vdtt_iw) var14.get(var17)).m().e].b[0].a, 3, 0, 1, var17, 0, this.maxX, ((vdtt_iw) var14.get(var17)).cy, true));
                    }
                }
            }

            if (this.mapID == 67) {
                for (var17 = 0; var17 < 25; ++var17) {
                    this.eh.add(new vdtt_du(4, 2, 0, 12, var17, 25, this.maxX, this.maxY + 30, false, (short) 112, (short) 10));
                }
            }

            this.eo = false;
            this.ej.clear();
            this.cO = 0;
            this.z();
            this.cc = false;
            if (this.aC == null) {
                this.aC = new vdtt_lh(this);
            }

            this.aC.M = true;
            m = false;
            this.cr = 1;
            this.dF = null;
            this.o.b();
            vdtt_aa var46 = vdtt_aa.gI();
            boolean var21 = false;
            var46.g = var21;
            if (gI().getMapTemplate().type != 19) {
                this.ax.clear();
            }

            return;
        } catch (Exception var38) {
            try {
                Message.e((byte) 4).send();
            } catch (Exception var35) {
            }
        } finally {
            try {
                if (var1 != null) {
                    var1.close();
                }
            } catch (Exception var34) {
            }

        }

    }

    public final void y() {
        if (this.aC != null) {
            this.aC.w();
        }

    }

    public final void z() {
        try {
            this.aA.a.removeAllElements();
            this.ds.a.removeAllElements();
            this.dt.a.removeAllElements();
            this.aB.a.removeAllElements();
            this.du.a.removeAllElements();
            this.cT.removeAllElements();
            super.f.removeAllElements();
            this.e();
            int var1 = 0;
            if (this.aT != null) {
                var1 = this.aT.l.j;
            }

            this.aT = new vdtt_bu(AppListener.gI().m(), DataCenter.gI().o / 2 - 20, 110, 31, this);
            this.aT.a(var1);
            this.aU = new vdtt_bv(AppListener.gI().m(), DataCenter.gI().o / 2 - 20, 90, 32, this);
            this.aB.d = null;
            this.aA.d = null;
            if (!DataCenter.k()) {
                this.aA.b((vdtt_k) (this.dA = this.a(this.aT.cx, this.aT.cy - 14, "", this, 1101, 715)));
            } else {
                this.aA.b((vdtt_k) (this.dA = this.a(this.aT.cx + 1, this.aT.cy - 18, "", this, 1101, 715)));
                this.dA.setSize(30, 18);
            }

            this.dA.b(DataCenter.n());
            this.aA.b((vdtt_k) (this.dB = this.a(this.aT.cx + 16, this.aT.cy - 14, Caption.L, this, 1102, 684)));
            this.aA.b((vdtt_k) (this.dw = this.a(this.aT.cx + 54, this.aT.cy - 14, Caption.Ai[9], this, 3010, 684)));
            if (this.cI != 0 && this.cI != 1) {
                if (this.cI == 2) {
                    this.a((vdtt_k) this.aU);
                    this.aA.b((vdtt_k) this.aU);
                }
            } else {
                this.a((vdtt_k) this.aT);
                this.aA.b((vdtt_k) this.aT);
            }

            this.c(this.aA.a());
            this.e(mConfig.gI().a(17));
            this.ah();
            this.aQ = this.a(-200, -200, 140, "", this, 1083, 0);
            byte var2 = 80;
            this.aQ.l = var2;
            this.aQ.b(true);
            this.aQ.T = this.aQ.U = true;
            this.dY = this.a(0, 0, "", this, 7000, -16);
            if (DataCenter.k()) {
                this.dY.d = true;
            }

            this.aF[0] = this.a(0, 0, Caption.Ax[0], this, 7001, 722);
            this.aF[1] = this.a(0, 0, Caption.Ax[1], this, 7002, 723);
            this.aF[2] = this.a(0, 0, Caption.Ax[2], this, 7003, 724);
            this.aF[3] = this.a(0, 0, Caption.Ax[3], this, 7005, 725);
            this.dX = this.a(0, this.height - 186, "", this, 1040, 712);
            short var3 = -270;
            this.dX.J = var3;
            this.dW[0] = this.a(18, this.height - 186, "", this, 1049, 373);
            this.dW[1] = this.a(70, this.height - 186, "", this, 1050, 374);
            this.dW[2] = this.a(82, this.height - 186 + 84, "", this, 1043, 38);
            this.dW[3] = this.a(101, this.height - 186 + 84, "", this, 1042, 33);
            this.A();
            this.aR = a(2, this.height - 184 + 80, 4, this, 1047);
            this.u(0);
            this.ai();
            if (!DataCenter.k()) {
                this.cQ = this.a(DataCenter.gI().n - (AppListener.gI().m > 0 ? Utlis.n(83) : Utlis.n(15)), 1, "", this, 1100, 715);
                this.cQ.setSize(Utlis.n(14), Utlis.n(14));
                var2 = 90;
                this.cQ.J = var2;
                this.aB.b((vdtt_k) this.cQ);
                int[] var4 = new int[]{1067, 1033, 1032, 1063, 6009, 1035, 1036, 1069};
                int[] var5 = new int[]{740, 688, 689, 690, 741, 674, 673, 677};

                int var6;
                vdtt_ay var7;
                for (var6 = 0; var6 < var4.length; ++var6) {
                    var7 = this.a(0, 0, "", this, var4[var6], var5[var6]);
                    if (var4[var6] == 6009) {
                        this.dy = var7;
                    }

                    this.cT.addElement(var7);
                }

                var6 = Utlis.n(24);
                int var8 = DataCenter.p() ? 1 : 4;
                int var9 = DataCenter.gI().n - Utlis.n(var8 * 25 + AppListener.gI().n());

                for (int var10 = 0; var10 < gI().cT.size(); ++var10) {
                    var7 = (vdtt_ay) gI().cT.get(var10);
                    if (var10 >= var8) {
                        var7.setXY(var9 + (var10 - var8) * Utlis.n(24), var6 + Utlis.n(24));
                    } else {
                        var7.setXY(var9 + var10 * Utlis.n(24), var6);
                    }

                    this.aB.b((vdtt_k) var7);
                }

                this.aB.b();
                this.c(this.aB.a());
                this.d(mConfig.gI().a(18));
            }
        } catch (Exception var11) {
            Utlis.a(var11);
        }

    }

    private void ah() {
        int var1;
        for (var1 = 0; var1 < this.ds.a.size(); ++var1) {
            this.b((vdtt_k) ((vdtt_k) this.ds.a.elementAt(var1)));
        }

        this.ds.a.removeAllElements();
        short var2;
        if (mConfig.gI().d()) {
            var1 = Utlis.n(50 + AppListener.gI().m() / 2);
            var2 = this.height;
            SettingsTab.K();
            this.aE = this.a(var1, var2 - Utlis.n(85 + SettingsTab.C()), "", this, 1011, 20, 19);
        } else {
            var1 = Utlis.n(35 + AppListener.gI().m() / 2);
            var2 = this.height;
            SettingsTab.K();
            this.aE = this.a(var1, var2 - Utlis.n(85 + SettingsTab.C()), "", this, 1011, 20, 19);
        }

        DataCenter.n();
        this.aE.j();
        this.ds.b((vdtt_k) this.aE);
        this.c(this.ds.a());
    }

    private void d(boolean var1) {
        mConfig.gI().a(18, var1);
        this.aB.a(!mConfig.gI().a(18));
        vdtt_ay var2;
        if (var1) {
            this.aB.g();
            var2 = (vdtt_ay) this.aB.a();
            byte var3 = 90;
            var2.J = var3;
        } else {
            this.aB.f();
            var2 = (vdtt_ay) this.aB.a();
            short var4 = 270;
            var2.J = var4;
        }

    }

    private void e(boolean var1) {
        DataCenter.n();
        mConfig.gI().a(17, var1);
        this.aA.a(!mConfig.gI().a(17));
        vdtt_ay var2;
        if (var1) {
            this.aA.g();
            var2 = (vdtt_ay) this.aA.a();
            byte var3 = 0;
            var2.J = var3;
        } else {
            this.aA.f();
            var2 = (vdtt_ay) this.aA.a();
            short var4 = 180;
            var2.J = var4;
        }

    }

    private void ai() {
        this.u(mConfig.gI().b(4));
        if (mConfig.gI().a(6)) {
            this.bG = true;
        } else {
            this.bG = false;
        }

    }

    private void f(boolean var1) {
        this.az.a(var1);

        for (int var2 = 0; var2 < this.aF.length; ++var2) {
            this.aF[var2].b(!var1);
        }

        if (Char.gI().giatoc == null || Char.gI().giatoc.d == 0) {
            this.aF[3].b(true);
        }

    }

    private void u(int var1) {
        this.aD = 2;
        this.aB.a.clear();
        this.az.a.clear();
        this.du.a.clear();
        this.b((vdtt_k) this.dX);
        this.I();

        for (var1 = 0; var1 < this.dW.length; ++var1) {
            this.b((vdtt_k) this.dW[var1]);
        }

        this.b((vdtt_k) this.aR);
        this.dY.setXY(Utlis.n(101 + AppListener.gI().m / 2), 0);
        this.aF[0].setXY(this.dY.cx + Utlis.n(9), Utlis.n(22));
        this.aF[1].setXY(this.dY.cx + Utlis.n(9), Utlis.n(38));
        this.aF[2].setXY(this.dY.cx + Utlis.n(9), Utlis.n(54));
        this.aF[3].setXY(this.dY.cx + Utlis.n(9), Utlis.n(70));
        this.az.b((vdtt_k) this.dY);
        this.az.b((vdtt_k) this.aF[0]);
        this.az.b((vdtt_k) this.aF[1]);
        this.az.b((vdtt_k) this.aF[2]);
        this.az.b((vdtt_k) this.aF[3]);
        this.f(false);
        this.dX.setXY(this.width - 16, 0);
        short var2 = this.dX.cx;
        short var3 = this.dX.cy;
        this.dW[0].setXY(var2 - 70, var3);
        this.dW[1].setXY(var2 - 18, var3);
        this.dW[2].setXY(var2 + 82 - 106, var3 + 84);
        this.dW[3].setXY(var2 + 101, var3 + 84);
        this.aQ.setXY(var2 + 20, var3 + 82 - 1);
        this.aR.setXY(var2 + 2, var3 + 80);
        this.dX.b(true);
        this.dW[1].b(true);
        this.dW[0].b(true);
        this.aD = 2;
        String var4 = gI().getMapTemplate().name;
        String var5 = "";
        if (!var4.trim().equals("") && !(var5 = vdtt_dd.c(vdtt_dd.b, var4, 43)[0].toString()).equals(var4)) {
            var5 = var5 + " ...";
        }

        this.dW[0].l = var5;
    }

    public final void A() {
        try {
            if (this.aS == null) {
                this.aS = new vdtt_ba(Utlis.n(84 + AppListener.gI().m / 2), DataCenter.gI().o - 18, DataCenter.gI().n - Utlis.n(168 + AppListener.gI().m), Utlis.n(16), this, (byte) 0, 1048, 12);
            }

            if (this.dt != null) {
                int var1;
                for (var1 = 0; var1 < this.dt.a.size(); ++var1) {
                    this.b((vdtt_k) ((vdtt_k) this.dt.a.get(var1)));
                }

                this.dt.a.clear();
                this.cT.clear();
                this.ah();
                if (this.V()) {
                    this.cR = this.a(108, 20, "", this, 1103, 566);
                    this.cR.b(true);
                    this.dt.b((vdtt_k) this.cR);
                }

                this.cS = null;
                if (gI().mapID == 83 && Gdx.app.getType() == ApplicationType.Desktop) {
                    this.cS = this.a(108, 20, "", this, 1104, 89);
                    this.cS.b(true);
                    this.dt.b((vdtt_k) this.cS);
                }

                Vector var2 = new Vector();
                Vector var3 = new Vector();
                short[] var4 = this.B();
                this.da = var4;
                var1 = -1;

                int var5;
                for (var5 = 0; var5 < this.da.length; ++var5) {
                    if (this.da[var5] >= 0) {
                        short var6 = this.da[var5];
                        if (DataCenter.gI().skillTemplate[var6].i == 1) {
                            var1 = var5;
                            break;
                        }
                    }
                }

                this.bm.clear();
                this.dH = null;

                for (var5 = 0; var5 < gI().af.length; ++var5) {
                    if (gI().af[var5].e > 0 && gI().af[var5].d()) {
                        if (gI().af[var5].l()) {
                            this.dH = gI().af[var5];
                        } else {
                            gI().bm.addElement(gI().af[var5]);
                            if (var1 != -1 && gI().af[var5].getSkillTemplate().i == 1) {
                                this.a(var1, gI().af[var5].d);
                            }
                        }
                    }
                }

                Collections.sort(gI().bm, Skill.a);
                Vector var24 = new Vector();
                var1 = 0;

                int var7;
                int var8;
                for (var7 = 0; var7 < gI().da.length; ++var7) {
                    if (gI().da[var7] != -1) {
                        boolean var9 = false;

                        for (var8 = 0; var8 < this.bm.size(); ++var8) {
                            if (((Skill) this.bm.get(var8)).d == this.da[var7]) {
                                var9 = true;
                                break;
                            }
                        }

                        if (!var9) {
                            gI().da[var7] = -1;
                        }
                    }

                    if (gI().da[var7] != -1) {
                        var24.add(gI().da[var7]);
                        var1 = var7;
                    }
                }

                int var25;
                if (var1 >= this.bm.size()) {
                    Arrays.fill(this.da, (short) -1);

                    for (var7 = 0; var7 < this.bm.size(); ++var7) {
                        this.a(var7, ((Skill) this.bm.get(var7)).d);
                    }
                } else {
                    for (var7 = 0; var7 < this.bm.size() && var24.size() < 7; ++var7) {
                        if (!var24.contains(((Skill) this.bm.get(var7)).d)) {
                            for (var25 = 0; var25 < gI().da.length; ++var25) {
                                if (gI().da[var25] == -1) {
                                    this.a(var25, ((Skill) this.bm.get(var7)).d);
                                    var24.add(((Skill) this.bm.get(var7)).d);
                                    break;
                                }
                            }
                        }
                    }
                }

                Binary.a("arr_skill_" + Char.gI().idEntity, this.da);

                vdtt_ay var10;
                for (var7 = 0; var7 < this.da.length; ++var7) {
                    if (this.da[var7] != -1) {
                        for (var25 = 0; var25 < this.bm.size(); ++var25) {
                            Skill var11;
                            if ((var11 = (Skill) this.bm.get(var25)).d == this.da[var7] && !var11.l()) {
                                (var10 = this.a(0, 0, "", this, 1021 + var7, 81)).a(var11.a(Char.gI()));
                                var3.add(var10);
                                if (var11.d == 30) {
                                    var10.a(100);
                                }

                                var2.addElement(var10);
                                break;
                            }
                        }
                    }
                }

                this.dt.a(var3);
                vdtt_bk var26 = this.dt;
                int var12 = Utlis.n(4 + AppListener.gI().m / 2);
                int var13 = DataCenter.gI().o;
                SettingsTab.K();
                var26.b((vdtt_k) (this.aM = this.a(var12, var13 - Utlis.n(16 + SettingsTab.C()), Caption.sD, this, 1012, 82)));
                this.aM.b(DataCenter.k());
                if (DataCenter.k()) {
                    var26 = this.dt;
                    var12 = Utlis.n(4 + AppListener.gI().m / 2);
                    var13 = DataCenter.gI().o;
                    SettingsTab.K();
                    var26.b((vdtt_k) (this.aN = this.a(var12, var13 - Utlis.n(16 + SettingsTab.C()), "MENU", this, 1013, -107)));
                    this.aN.b(DataCenter.n());
                }

                this.dt.b((vdtt_k) (this.aH = this.a(this.aM.cx + Utlis.n(40), this.aM.cy, Caption.xG, this, 1086, 82)));
                this.aH.b(DataCenter.k());
                var26 = this.dt;
                var12 = this.aM.cx + Utlis.n(80);
                short var14 = this.aM.cy;
                DataCenter.gI();
                var26.b((vdtt_k) (this.dx = this.a(var12, var14, "Chat", this, 1083, DataCenter.m() ? -107 : 73)));
                var26 = this.dt;
                var12 = DataCenter.gI().n - Utlis.n(40 + AppListener.gI().m / 2);
                var14 = this.aM.cy;
                String var15 = Caption.xH;
                DataCenter.gI();
                var26.b((vdtt_k) (this.aL = this.a(var12, var14, var15, this, 1082, DataCenter.m() ? -107 : 82)));
                var26 = this.dt;
                var12 = this.aL.cx - Utlis.n(40);
                var14 = this.aM.cy;
                DataCenter.gI();
                var26.b((vdtt_k) (this.aG = this.a(var12, var14, "Auto", this, 1085, DataCenter.m() ? -107 : -15)));
                this.aG.b(DataCenter.n());
                Utlis.n(96 + AppListener.gI().m / 2);
                var25 = this.aM.cy - Utlis.n(32);
                DataCenter.n();
                var8 = var2.size();
                int var16;
                switch (mConfig.gI().b(27)) {
                    case 1:
                        var1 = this.aE.h() + Utlis.n(16);
                        break;
                    case 2:
                        var1 = DataCenter.gI().n - Utlis.n(96 + AppListener.gI().m / 2) - Utlis.n(32) - (var8 - 1) * Utlis.n(32);
                        break;
                    default:
                        if ((var1 = DataCenter.gI().n / 2 - var8 * Utlis.n(16) - Utlis.n(12)) < this.aE.h()) {
                            var1 = this.aE.h() + Utlis.n(AppListener.gI().o() ? 20 : 36);
                        }

                        var7 = DataCenter.gI().n - Utlis.n(96 + AppListener.gI().m / 2) - Utlis.n(32);
                        if ((var16 = var1 + (var8 - 1) * Utlis.n(32) - var7) > 0) {
                            var1 -= var16;
                        }
                }

                var16 = 0;
                this.ex = new int[][]{{this.width - Utlis.n(34 + AppListener.gI().n()), this.aM.cy - Utlis.n(93)}, {this.width - Utlis.n(65 + AppListener.gI().n()), this.aM.cy - Utlis.n(86)}, {this.width - Utlis.n(87 + AppListener.gI().n()), this.aM.cy - Utlis.n(62)}, {this.width - Utlis.n(87 + AppListener.gI().n() + 32), this.aM.cy - Utlis.n(62)}, {this.width - Utlis.n(100 + AppListener.gI().n()), this.aM.cy - Utlis.n(93)}, {this.width - Utlis.n(71 + AppListener.gI().n()), this.aM.cy - Utlis.n(117)}, {this.width - Utlis.n(37 + AppListener.gI().n()), this.aM.cy - Utlis.n(123)}};
                DataCenter.n();
                DataCenter.n();

                for (var5 = 0; var5 < var8; ++var5) {
                    if (((vdtt_ay) var2.get(var5)).H == 100) {
                        ((vdtt_ay) var2.get(var5)).setXY(DataCenter.gI().n - Utlis.n(58 + AppListener.gI().m / 2), this.aM.cy - Utlis.n(56) + 0);
                        DataCenter.n();
                    } else {
                        if (mConfig.gI().d()) {
                            ((vdtt_ay) var2.get(var5)).setXY(this.ex[var16][0], this.ex[var16][1] + 0);
                        } else {
                            var7 = var1 + (var8 - 1 - var16) * Utlis.n(32);
                            ((vdtt_ay) var2.get(var5)).setXY(var7, var25);
                        }

                        ++var16;
                    }
                }

                this.aP = null;
                if (!mConfig.gI().d()) {
                    if (this.dH != null) {
                        this.aP = this.a(this.width - Utlis.n(34 + AppListener.gI().n()), this.aM.cy - Utlis.n(125), "", this, 1027, 81);
                        this.aP.a(this.dH.a(Char.gI()));
                        this.dt.b((vdtt_k) this.aP);
                    }
                } else {
                    if (var8 > 1 && var8 < 6) {
                        var16 = 7 - var8;

                        for (var5 = 0; var5 < var16; ++var5) {
                            int var17 = this.ex[var8 - 1 + var5][0];
                            int var18 = this.ex[var8 - 1 + var5][1] + 0;
                            DataCenter.n();
                            var10 = this.a(var17, var18, "", this, -9991, 81);
                            this.dt.b((vdtt_k) var10);
                        }
                    }

                    if (this.dH != null) {
                        this.aP = this.a(this.ex[6][0], this.ex[6][1], "", this, 1028, 81);
                        this.aP.a(this.dH.a(Char.gI()));
                        this.dt.b((vdtt_k) this.aP);
                    }
                }

                var7 = DataCenter.gI().n - Utlis.n(96 + AppListener.gI().m / 2) - Utlis.n(32);
                this.aJ = this.a(var7 + Utlis.n(32), var25, "", this, 1080, -13);
                this.dt.b((vdtt_k) this.aJ);
                if (mConfig.gI().d()) {
                    this.aI = this.a(this.aJ.cx - Utlis.n(32), this.aJ.cy, "", this, 1084, 557);
                } else {
                    this.aI = this.a(this.width - Utlis.n(34 + AppListener.gI().n()), this.aM.cy - Utlis.n(93), "", this, 1084, 557);
                }

                this.dt.b((vdtt_k) this.aI);
                if (mConfig.gI().d()) {
                    this.aO = this.a(5 + AppListener.gI().m() / 2, this.aM.cy - Utlis.n(64), "", this, 1060, 94);
                } else {
                    this.aO = this.a(this.width - Utlis.n(65 + AppListener.gI().n()), this.aM.cy - Utlis.n(86), "", this, 1060, 94);
                }

                this.dt.b((vdtt_k) this.aO);
                if (mConfig.gI().d()) {
                    this.dz = this.a(5 + AppListener.gI().m() / 2, this.aO.cy + Utlis.n(25), "", this, 1037, 672);
                } else {
                    this.dz = this.a(this.width - Utlis.n(87 + AppListener.gI().n()), this.aM.cy - Utlis.n(62), "", this, 1037, 672);
                }

                if (DataCenter.k()) {
                    this.dz.d = true;
                }

                this.dt.b((vdtt_k) this.dz);
                this.dt.b = var2;
                this.dt.b((vdtt_k) this.aS);
            }

            this.a(Binary.f("shortcutItem"), false);
            return;
        } catch (Exception var22) {
        } finally {
            this.b((vdtt_k) this.aS);
            this.a((vdtt_k) this.aS);
        }

    }

    public final Skill g(int var1) {
        for (int var2 = 0; var2 < this.af.length; ++var2) {
            Skill var3;
            if ((var3 = this.af[var2]).getSkillTemplate().id == var1) {
                return var3;
            }
        }

        return null;
    }

    public final short[] B() {
        try {
            if (this.da == null) {
                short[] var1 = new short[7];
                this.da = var1;

                for (int var2 = 0; var2 < this.da.length; ++var2) {
                    this.da[var2] = -1;
                }

                Reader var5;
                if ((var5 = Binary.a("arr_skill_" + Char.gI().idEntity)) != null) {
                    for (int var3 = 0; var3 < this.da.length; ++var3) {
                        this.da[var3] = var5.dis.readShort();
                    }
                }
            }
        } catch (Exception var4) {
        }

        return this.da;
    }

    private void a(int var1, short var2) {
        short[] var3 = this.B();
        this.da = var3;

        for (int var4 = 0; var4 < this.da.length; ++var4) {
            if (this.da[var4] == var2) {
                return;
            }
        }

        this.da[var1] = var2;
    }

    public final MapTemplate getMapTemplate() {
        return DataCenter.gI().mapTemplate[this.mapID];
    }

    public final boolean D() {
        if (!d && this.aC == null) {
            if (this.bF) {
                this.bF = false;
                this.e(this.getMapTemplate().name + "\n" + Caption.hF + this.zoneID, -2560);
            }

            return true;
        } else {
            return false;
        }
    }

    public final void a(boolean var1) {
        this.eo = true;
        this.ep = System.currentTimeMillis();
        this.cO = 35;
        int var2 = this.maxX / 20;
        int[] var3 = new int[]{573, 574, 49};

        for (int var4 = 0; var4 < var2; ++var4) {
            this.ej.add(new vdtt_du(Utlis.a(var3), 4, Utlis.a(1, 4), 10, var4, var2, this.maxX, this.maxY, false));
        }

        vdtt_aa var5;
        if (!(var5 = vdtt_aa.gI()).a) {
            var5.a(var5.b[63]);
        }

    }

    public final void j() {
        try {
            if (Char.gI().aX == null) {
                Object var1 = Char.gI();
                if (this.et != null) {
                    var1 = this.et;
                }

                int var2;
                if (Char.gI().bB) {
                    for (var2 = 0; var2 < this.cL.size(); ++var2) {
                        vdtt_hd var3;
                        if ((var3 = (vdtt_hd) this.cL.elementAt(var2)).k.p()) {
                            var1 = var3;
                            break;
                        }
                    }
                }

                int var10 = ((Entity) var1).cx - DataCenter.gI().n / 2;
                var2 = ((Entity) var1).cy - DataCenter.gI().o / 2 - ((Entity) var1).height / 2 - DataCenter.gI().o / 8;
                int var4 = ((Entity) var1).cx + DataCenter.gI().n / 2;
                int var5 = ((Entity) var1).cy + DataCenter.gI().o / 2 - ((Entity) var1).height / 2 - DataCenter.gI().o / 8;
                if (this.cO > 0 || this.eo) {
                    if (!this.eo) {
                        --this.cO;
                    }

                    var10 -= Utlis.a(this.cO);
                    var2 -= Utlis.a(this.cO);
                    var4 += Utlis.a(this.cO);
                    var5 += Utlis.a(this.cO);
                }

                if (var10 < 0) {
                    var10 = 0;
                    var4 = DataCenter.gI().n;
                }

                if (var2 < 0) {
                    var2 = 0;
                    var5 = DataCenter.gI().o;
                }

                if (var4 > this.maxX) {
                    var10 = (short) (this.maxX - DataCenter.gI().n);
                }

                if (var5 > this.maxY) {
                    var2 = (short) (this.maxY - DataCenter.gI().o);
                }

                DataCenter var6;
                if (DataCenter.gI().i != var10) {
                    this.dZ = var10 - DataCenter.gI().i << 2;
                    this.ea += this.dZ;
                    var6 = DataCenter.gI();
                    var6.i += this.ea >> 4;
                    this.ea &= 15;
                }

                if (DataCenter.gI().j != var2) {
                    this.eb = var2 - DataCenter.gI().j << 2;
                    this.ec += this.eb;
                    var6 = DataCenter.gI();
                    var6.j += this.ec >> 4;
                    this.ec &= 15;
                }

                DataCenter.gI().k = DataCenter.gI().i + DataCenter.gI().n;
                DataCenter.gI().l = DataCenter.gI().j + DataCenter.gI().o;

                for (var10 = 0; var10 < this.R.size(); ++var10) {
                    vdtt_iw var7;
                    short var8 = (var7 = (vdtt_iw) this.R.get(var10)).m;
                    if (var7.m().c != 7 && (var7.m().c != 6 || var7.m().d != -1)) {
                        if (var7.m().c == 8) {
                            var8 = (short) (var7.m + DataCenter.gI().i * 10 / 13);
                        } else if (var7.m().c == 9) {
                            var8 = (short) (var7.m + DataCenter.gI().i * 20 / 22);
                        } else if (var7.m().c == 10) {
                            var8 = (short) (var7.m + DataCenter.gI().i * 10 / 12);
                        }
                    } else {
                        var8 = (short) (var7.m + DataCenter.gI().i * 20 / 23);
                    }

                    if (var7.o != null) {
                        if (var7.m().d == 2) {
                            var8 = (short) (var7.m + DataCenter.gI().i * 20 / 23);
                        } else if (var7.m().d == 3) {
                            var8 = (short) (var7.m + DataCenter.gI().i * 10 / 13);
                        } else if (var7.m().d == 4) {
                            var8 = (short) (var7.m + DataCenter.gI().i * 20 / 22);
                        } else if (var7.m().d == 5 || var7.m().d == 11) {
                            var8 = (short) (var7.m + DataCenter.gI().i * 10 / 12);
                        }

                        var7.o.a(var8, var7.cy);
                    }

                    if (var7.p != null) {
                        if (var7.m().d == 2) {
                            var8 = (short) (var7.m + DataCenter.gI().i * 20 / 23);
                            var7.p.b(var8, var7.cy);
                        } else if (var7.m().d == 3) {
                            var8 = (short) (var7.m + DataCenter.gI().i * 10 / 13);
                            var7.p.b(var8, var7.cy);
                        } else if (var7.m().d == 4) {
                            var8 = (short) (var7.m + DataCenter.gI().i * 20 / 22);
                            var7.p.b(var8, var7.cy);
                        } else if (var7.m().d == 5) {
                            var8 = (short) (var7.m + DataCenter.gI().i * 10 / 12);
                            var7.p.b(var8, var7.cy);
                        }

                        var7.p.r();
                        var7.width = var7.p.width;
                        var7.height = var7.p.height;
                        var7.setXY(var7.p.cx, var7.p.cy);
                    }

                    var7.cx = var8;
                }
            }
        } catch (Exception var9) {
        }

    }

    public final void k() {
        if (Gdx.app.getType() == ApplicationType.Desktop && !this.aQ.d && this.aQ.cx != -200 && this.aQ.cy != -200) {
            this.aQ.setXY(-200, -200);
            this.aQ.b(true);
        } else {
            this.E();
        }

    }

    public final void E() {
        this.a(Caption.so, 20000, this);
    }

    public static void F() {
        Writer var0 = null;
        boolean var1 = false;

        label77:
        {
            try {
                var1 = true;
                Message.c((byte) -7).send();
                var0 = new Writer();
                String[] var2 = LoginPCScreen.y().x();
                var0.writeUTF(Utlis.d(var2[0]));
                var0.writeUTF(Utlis.d(var2[1]));
                var0.writeUTF(Utlis.d(Char.gI().name));
                var0.writeUTF(DataCenter.gI().ipServer);
                var0.writeShort(DataCenter.gI().portServer);
                var0.writeInt(SettingsTab.d);
                var0.writeInt(SettingsTab.M);
                var0.writeInt(SettingsTab.N);
                var0.writeShort(0);
                byte[] var3 = var0.baos.toByteArray();
                Binary.a("arr_reset", var3);
                Binary.a("arr_reset_" + Utlis.o(var2[0]), var3);
                var1 = false;
                break label77;
            } catch (Exception var7) {
                Utlis.a(var7);
                var1 = false;
            } finally {
                if (var1 && var0 != null) {
                    var0.close();
                }

            }

            if (var0 != null) {
                var0.close();
                return;
            }

            return;
        }

        var0.close();
    }

    public final void a_() {
        System.currentTimeMillis();
        if (System.currentTimeMillis() - InputCanvas.a > 900000L && !Char.gI().isDie()) {
            if (!Graphics.q) {
                gI().cr = 2;
            }

            Graphics.q = true;
        } else {
            if (Graphics.q) {
                gI().cr = 2;
            }

            Graphics.q = false;
        }

        if (this.aE != null && this.f.contains(this.aE)) {
            this.f.remove(this.aE);
            this.f.insertElementAt(this.aE, 0);
        }

        if (this.D()) {
            this.cp = false;
        } else {
            this.cp = true;
        }

        if (Char.gI().bB) {
            Char.gI().S();
        }

        if (this.eg > 0) {
            --this.eg;
            if (this.eg == 0) {
                gI().cn = false;
                Char.gI().S();
            }
        }

        try {
            if (Utlis.a() / 1000L - (long) this.bO > 300L && !DataCenter.k()) {
                this.bO = (int) (Utlis.a() / 1000L);
                (new Message((byte) -97)).send();
            }

            if (this.bN < 1000) {
                --this.bN;
                if (this.bN < 0) {
                    this.bN = 1000;
                }
            }

            this.am();
            if (this.aC != null) {
                this.U();

                try {
                    this.aC.a_();
                    if (DataCenter.gI().h % 2 == 0 && this.aC.c < 90) {
                        this.aC.w();
                    }
                } catch (Exception var12) {
                }

                if (!this.bH) {
                    return;
                }
            }

            label725:
            {
                if (mConfig.gI().a(19) && SettingsTab.K().z() && Gdx.app.getType() == ApplicationType.Desktop) {
                    if (mConfig.gI().b(21) <= 1) {
                        if (mConfig.gI().b(21) > 0) {
                            if (!this.dC) {
                                F();
                                this.dC = true;
                            }
                        } else {
                            this.em = 0L;
                        }
                        break label725;
                    }

                    if (this.em == 0L) {
                        this.em = System.currentTimeMillis();
                    }

                    if (System.currentTimeMillis() - this.em <= Utlis.c) {
                        break label725;
                    }

                    AppListener.gI().a(true);
                }

                this.em = 0L;
            }

            if (this.bP > 0) {
                --this.bP;
                if (this.bP == 0) {
                    this.U();
                }
            }

            if (DataCenter.aD == 2) {
                DataCenter.aD = 0;
                if (SettingsTab.d >= 0) {
                    this.cB = true;
                }
            }

            if (this.D() && this.bx != null && (gI().mapID == this.bx.d || gI().mapID == 86 && (this.bx.a == 59 || this.bx.d == 56 || this.bx.d == 87 || this.bx.d >= 0 && DataCenter.gI().mapTemplate[this.bx.d].e == 0))) {
                this.pointMoveMap = this.bx;
                this.bx = null;
            }

            if (gI().cZ > 0L && this.b.size() == 1) {
                vdtt_as.gI().c();
            }

            if (gI().mapID != 47 && gI().mapID != 48) {
                O = dS;
            } else {
                O = dR;
            }

            P = 0;
            this.do_.removeAllElements();
            this.dq.removeAllElements();
            this.dp.removeAllElements();
            if (this.focusEntity != null && (this.focusEntity instanceof Mob && !((Mob) this.focusEntity).v() || this.focusEntity instanceof ItemMap && ((ItemMap) this.focusEntity).item.id == 224 || !this.vItemMap.contains(this.focusEntity) && !this.vChar.contains(this.focusEntity) && !this.vNpc.contains(this.focusEntity) && !this.vMob.contains(this.focusEntity))) {
                this.focusEntity = null;
            }

            int var1;
            if (!this.ca) {
                for (var1 = 0; var1 < gI().vWayPoint.size(); ++var1) {
                    WayPoint var2;
                    if ((var2 = (WayPoint) gI().vWayPoint.elementAt(var1)) != null && Utlis.a(var2.minX() - 60, var2.minY() - 60, var2.maxX() + 60, var2.maxY() + 60, DataCenter.gI().i, DataCenter.gI().j, DataCenter.gI().k, DataCenter.gI().l)) {
                        this.do_.addElement(var2);
                    }
                }
            }

            boolean var15 = false;
            this.el = -1;
            int var3;
            if (this.bQ < 2) {
                try {
                    for (var3 = 0; var3 < gI().R.size(); ++var3) {
                        vdtt_iw var4;
                        if ((var4 = (vdtt_iw) gI().R.elementAt(var3)) != null) {
                            var4.n();
                            if (Utlis.a(var4.minX(), var4.minY(), var4.maxX(), var4.maxY(), DataCenter.gI().i, DataCenter.gI().j, DataCenter.gI().k, DataCenter.gI().l)) {
                                this.do_.addElement(var4);
                                switch (var4.m().e) {
                                    case 2:
                                        if (Utlis.a(Char.gI().minX(), Char.gI().minY(), Char.gI().maxX(), Char.gI().maxY(), var4.minX(), var4.minY(), var4.maxX(), var4.maxY()) && !var15) {
                                            var15 = true;
                                        }
                                        break;
                                    case 5:
                                        this.el = var4.m().e;
                                        break;
                                    default:
                                        if (var4.p != null && !var15) {
                                            switch (var4.p.id) {
                                                case 13:
                                                case 208:
                                                    if (this.el == -1) {
                                                        this.el = var4.p.id;
                                                    }
                                            }
                                        }
                                }
                            }
                        }
                    }

                    vdtt_aa.gI().a(var15);
                } catch (Exception var13) {
                }
            }

            Char var16 = Char.gI();
            int var5;
            Npc var6;
            if (this.D()) {
                GameSrc var7 = this;
                if (this.pointMoveMap != null) {
                    if (Char.gI().ah()) {
                        this.pointMoveMap = null;
                    } else if (this.mapID == this.pointMoveMap.d) {
                        label932:
                        {
                            if (this.pointMoveMap.a >= 0) {
                                for (var5 = 0; var5 < gI().vNpc.size(); ++var5) {
                                    if ((var6 = (Npc) gI().vNpc.elementAt(var5)).id == var7.pointMoveMap.a) {
                                        var7.pointMoveMap.e = var6.cx;
                                        var7.pointMoveMap.f = var6.cy;
                                        if (Utlis.b(Char.gI().cx, Char.gI().cy, var6.cx, var6.cy) <= var7.minRangeNpc) {
                                            if (var6.status == 6) {
                                                vdtt_ii var8;
                                                if ((var8 = gI().T()) != null && var8.a == 5 && var8.d == var6.id && Utlis.a((XYEntity) var6, (XYEntity) Char.gI()) < 100) {
                                                    gI();
                                                    l(var6.idEntity, 0);
                                                }
                                            } else {
                                                var7.focusEntity = var6;
                                                Char.gI().S();
                                                if (Utlis.b(Char.gI().cx, var6.cx) < 20) {
                                                    if (var6.cx >= Char.gI().cx) {
                                                        Char.gI().cx = (short) (var6.cx - 20);
                                                    } else {
                                                        Char.gI().cx = (short) (var6.cx + 20);
                                                    }
                                                }

                                                var7.ap();
                                                if (var7.pointMoveMap != null && var7.pointMoveMap.a == 101) {
                                                    if (var7.pointMoveMap.h == 60) {
                                                        var7.pointMoveMap.d = var7.pointMoveMap.h;
                                                        var7.pointMoveMap.a = var7.pointMoveMap.i;
                                                        var7.pointMoveMap.h = -1;
                                                        var7.pointMoveMap.i = -1;
                                                        var7.pointMoveMap.e = var7.pointMoveMap.f = 0;
                                                        l(var7.focusEntity.idEntity, 0);
                                                        break label932;
                                                    }

                                                    if (var7.pointMoveMap.h == 69) {
                                                        var7.pointMoveMap.d = var7.pointMoveMap.h;
                                                        var7.pointMoveMap.a = var7.pointMoveMap.i;
                                                        var7.pointMoveMap.h = -1;
                                                        var7.pointMoveMap.i = -1;
                                                        var7.pointMoveMap.e = var7.pointMoveMap.f = 0;
                                                        l(var7.focusEntity.idEntity, 1);
                                                        break label932;
                                                    }

                                                    if (var7.pointMoveMap.h == 85) {
                                                        var7.pointMoveMap.d = var7.pointMoveMap.h;
                                                        var7.pointMoveMap.a = var7.pointMoveMap.i;
                                                        var7.pointMoveMap.h = -1;
                                                        var7.pointMoveMap.i = -1;
                                                        var7.pointMoveMap.e = var7.pointMoveMap.f = 0;
                                                        l(var7.focusEntity.idEntity, 2);
                                                        break label932;
                                                    }

                                                    if (var7.pointMoveMap.h == 59) {
                                                        var7.pointMoveMap.d = var7.pointMoveMap.h;
                                                        var7.pointMoveMap.a = var7.pointMoveMap.i;
                                                        var7.pointMoveMap.h = -1;
                                                        var7.pointMoveMap.i = -1;
                                                        var7.pointMoveMap.e = var7.pointMoveMap.f = 0;
                                                        l(var7.focusEntity.idEntity, 3);
                                                        break label932;
                                                    }

                                                    if (var7.pointMoveMap.h == 68) {
                                                        var7.pointMoveMap.d = var7.pointMoveMap.h;
                                                        var7.pointMoveMap.a = var7.pointMoveMap.i;
                                                        var7.pointMoveMap.h = -1;
                                                        var7.pointMoveMap.i = -1;
                                                        var7.pointMoveMap.e = var7.pointMoveMap.f = 0;
                                                        l(var7.focusEntity.idEntity, 4);
                                                        break label932;
                                                    }
                                                }
                                            }

                                            var7.pointMoveMap = null;
                                        }
                                        break;
                                    }
                                }
                            }

                            if (var7.pointMoveMap != null) {
                                Mob var18;
                                if (var7.pointMoveMap.e <= 0 && var7.pointMoveMap.f <= 0 && !gI().V()) {
                                    for (var5 = 0; var5 < var7.vMob.size(); ++var5) {
                                        if ((var18 = (Mob) var7.vMob.get(var5)).id == var7.pointMoveMap.c) {
                                            var7.pointMoveMap.e = var18.cx;
                                            var7.pointMoveMap.f = var18.cy;
                                            if (var18.paintMiniMap) {
                                                break;
                                            }
                                        }
                                    }
                                }

                                if ((var7.pointMoveMap.e != 0 || var7.pointMoveMap.f != 0) && Utlis.a(Char.gI().cx, Char.gI().cy, var7.pointMoveMap.e, var7.pointMoveMap.f) >= 10) {
                                    if (!Char.gI().Z() && Char.gI().pointMove == null && Char.gI().bc.size() == 0 && MoveSmart.c().size() == 0) {
                                        Char.gI().c(var7.pointMoveMap.e, var7.pointMoveMap.f);
                                    }
                                } else {
                                    if (SettingsTab.K().F()) {
                                        SettingsTab.K().a(true);
                                    } else if (var7.pointMoveMap.c >= 0) {
                                        for (var5 = 0; var5 < var7.vMob.size(); ++var5) {
                                            if ((var18 = (Mob) var7.vMob.get(var5)).id == var7.pointMoveMap.c) {
                                                var7.cy_ = var18.id;
                                                var7.focusEntity = null;
                                                if (var18.getMobTemplate().type < 9 || var18.getMobTemplate().type > 11) {
                                                    if (var7.pointMoveMap.b >= 0) {
                                                        SettingsTab.K().b(true);
                                                    }

                                                    SettingsTab.K().a(true);
                                                }

                                                var7.cy_ = var18.id;
                                                if (var18.getMobTemplate().type == 13 || var18.getMobTemplate().type == 7) {
                                                    var7.focusEntity = var18;
                                                }
                                                break;
                                            }
                                        }
                                    }

                                    var7.pointMoveMap = null;
                                }
                            }
                        }
                    } else if (this.V()) {
                        this.pointMoveMap = null;
                    } else {
                        if (this.pointMoveMap.g == null) {
                            this.pointMoveMap.g = this.a(DataCenter.h(), this.mapID, this.pointMoveMap.d, true);
                            if (this.pointMoveMap.g.size() == 0) {
                                this.pointMoveMap.g = null;
                                if (SettingsTab.K().N() && this.mapID != this.pointMoveMap.d) {
                                    --this.cE;
                                    if (this.cE == 0 && Char.gI().ac()) {
                                        a(this.pointMoveMap);
                                        this.cD = 100;
                                    }
                                } else {
                                    this.pointMoveMap = null;
                                }
                            }
                        }

                        if (this.pointMoveMap != null && this.pointMoveMap.g != null) {
                            WayPoint var19;
                            if (!Char.gI().Z() && !MoveSmart.e()) {
                                for (var5 = 0; var5 < var7.pointMoveMap.g.size(); ++var5) {
                                    if ((var19 = (WayPoint) var7.pointMoveMap.g.elementAt(var5)).k == var7.mapID) {
                                        if (var19.K != 0) {
                                            Char.gI().c(var19.cx, var19.K);
                                        } else {
                                            XYEntity var9;
                                            if ((var9 = Char.b(var19.cx, var19.cy)) != null) {
                                                var19.K = var9.cy;
                                                if (Utlis.b(var19.K - var19.cy) > 70) {
                                                    var19.K = var19.cy;
                                                } else {
                                                    for (var5 = 0; var5 < 10 && gI().V.a(var19.cx, var19.K); ++var5) {
                                                        --var19.K;
                                                    }
                                                }

                                                Char.gI().c(var19.cx, var19.K);
                                            } else {
                                                Char.gI().c(var19.cx, var19.cy);
                                            }
                                        }
                                        break;
                                    }
                                }
                            } else {
                                for (var5 = 0; var5 < var7.pointMoveMap.g.size(); ++var5) {
                                    if ((var19 = (WayPoint) var7.pointMoveMap.g.elementAt(var5)).k == var7.mapID && Char.gI().cx == var19.cx && (Char.gI().cy == var19.cy || Char.gI().cy == var19.K)) {
                                        var7.h(var19.cx, var19.cy);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }

                var16.B();
                XYEntity var21;
                if ((var21 = Char.b(var16.cx, var16.cy)) != null && Utlis.b(var16.cy - var21.cy) < 3) {
                    var16.cy = var21.cy;

                    for (int var20 = 0; var20 < 10 && gI().V.a(var16.cx, var16.cy); ++var20) {
                        --var16.cy;
                    }
                }

                if (Char.gI().aU != null && Char.gI().aU.d.d == 19) {
                    this.t(this.de);
                }

                if (this.getMapTemplate().type != 20 && !Char.gI().ab()) {
                    boolean var23 = false;
                    long var10;
                    if ((var16.aF == 2 || var21 != null && !var16.q()) && this.dd > 0 && (var10 = System.currentTimeMillis()) - this.es > 1000L) {
                        this.es = var10;
                        var23 = true;
                    }

                    if (!var23 && this.dd < 30 && var21 == null && (var10 = System.currentTimeMillis()) - this.es > 10000L) {
                        this.es = var10;
                    }
                } else {
                    this.t(this.de);
                }
            }

            this.do_.addElement(var16);
            if (var16.status != 6 && var16.Z == 0 && !var16.E()) {
                this.do_.addElement(new vdtt_hy(var16.g, var16.aH, var16.aI, var16));
                if (var16.bk != null) {
                    this.do_.addElement(new vdtt_hy(var16.bk.g, var16.bk.P, var16.bk.Q, var16.bk));
                }

                if (var16.bT != null && !var16.bB) {
                    this.do_.addElement(new vdtt_hy(var16.bT.g, var16.bT.aH, var16.bT.aI, var16.bT));
                }
            }

            int var17 = 0;
            byte var22 = 30;
            if (gI().getMapTemplate().type == 19 || gI().getMapTemplate().type == 20) {
                var22 = 100;
            }

            for (var5 = 0; var5 < this.vChar.size(); ++var5) {
                (var16 = (Char) this.vChar.elementAt(var5)).B();
                if (Utlis.a(var16.minX(), var16.minY(), var16.maxX(), var16.maxY(), DataCenter.gI().i, DataCenter.gI().j, DataCenter.gI().k, DataCenter.gI().l) || var16.af()) {
                    var16.h = false;
                    ++var17;
                    if (var17 > var22 && !var16.equals(this.focusEntity) && !var16.equals(Char.gI())) {
                        var16.h = true;
                    }

                    this.do_.addElement(var16);
                    if (var16.status != 6 && var16.Z == 0 && !var16.E()) {
                        this.do_.addElement(new vdtt_hy(var16.g, var16.aH, var16.aI, var16));
                        if (var16.bT != null && !var16.bB) {
                            this.do_.addElement(new vdtt_hy(var16.bT.g, var16.bT.aH, var16.bT.aI, var16.bT));
                        }
                    }

                    if (!var16.af()) {
                        this.dq.add(var16);
                    }
                }
            }

            for (var5 = this.vCharMove.size() - 1; var5 >= 0; --var5) {
                var16 = (Char) this.vCharMove.elementAt(var5);
                if (!this.vChar.contains(var16)) {
                    this.vCharMove.removeElementAt(var5);
                } else if (var16.pointMove == null && var16.bc.size() == 0) {
                    this.vCharMove.removeElementAt(var5);
                    this.vChar.remove(var16);
                }
            }

            if (this.getMapTemplate().id != 46) {
                for (var5 = this.ax.size() - 1; var5 >= 0; --var5) {
                    var16 = (Char) this.ax.get(var5);
                    if (!this.do_.contains(var16) && !var16.bM) {
                        this.do_.add(var16);
                        this.do_.addElement(new vdtt_hy(var16.g, var16.aH, var16.aI, var16));
                    }
                }
            }

            if (this.aC == null) {
                for (var5 = this.cL.size() - 1; var5 >= 0; --var5) {
                    vdtt_hd var25;
                    if ((var25 = (vdtt_hd) this.cL.elementAt(var5)).m()) {
                        this.cL.remove(var25);
                    } else {
                        var25.n();
                    }
                }
            }

            this.cz = false;
            this.cA = null;
            Mob var27;
            if (this.bQ < 2) {
                for (var1 = 0; var1 < this.vMob.size(); ++var1) {
                    (var27 = (Mob) this.vMob.elementAt(var1)).r();
                    if (var27.an != null && var27.an.equals(Char.gI().name)) {
                        this.cA = var27;
                    }

                    if (Utlis.a(var27.minX(), var27.minY(), var27.maxX(), var27.q(), DataCenter.gI().i, DataCenter.gI().j, DataCenter.gI().k, DataCenter.gI().l)) {
                        this.do_.addElement(var27);
                        if (var27.status != 4 && var27.status != 6) {
                            if (var27.P == var27.cx && var27.Q == var27.cy) {
                                this.do_.addElement(new vdtt_hy(var27.g, var27.P, var27.Q - 1, var27));
                            } else {
                                this.do_.addElement(new vdtt_hy(var27.g, var27.P, var27.Q, var27));
                            }
                        }

                        if (var27.isDie()) {
                            continue;
                        }

                        this.dq.add(var27);
                    }

                    for (var3 = 0; var3 < var27.i.size(); ++var3) {
                        vdtt_iz var11;
                        vdtt_iz var24;
                        if ((var11 = var24 = (vdtt_iz) var27.i.elementAt(var3)).k > 0) {
                            if (Utlis.a() % 2L == 1L) {
                                var11.k -= 2;
                            }
                        } else {
                            var11.i.remove(var11);
                        }

                        this.do_.addElement(var24);
                    }
                }

                for (var3 = 0; var3 < this.vNpc.size(); ++var3) {
                    (var6 = (Npc) this.vNpc.elementAt(var3)).p();
                    if (Utlis.a(var6.minX(), var6.minY(), var6.maxX(), var6.cy + var6.height, DataCenter.gI().i, DataCenter.gI().j, DataCenter.gI().k, DataCenter.gI().l)) {
                        this.do_.addElement(var6);
                        if (var6.status != 6) {
                            if (var6.r()) {
                                this.do_.addElement(new vdtt_hy(var6.g, var6.cx, var6.cy - 1, var6));
                            } else {
                                this.do_.addElement(new vdtt_hy(var6.g, var6.cx, var6.cy, var6));
                            }
                        }

                        if (var6.status != 4 && var6.status != 6 && var6.status != 5) {
                            this.dq.add(var6);
                        }
                    }
                }

                for (var17 = this.vItemMap.size() - 1; var17 >= 0; --var17) {
                    ItemMap var26;
                    (var26 = (ItemMap) this.vItemMap.elementAt(var17)).m();
                    if (Utlis.a(var26.minX(), var26.minY(), var26.maxX(), var26.maxY(), DataCenter.gI().i, DataCenter.gI().j, DataCenter.gI().k, DataCenter.gI().l)) {
                        this.do_.addElement(var26);
                        if (var26.item.id != 224) {
                            this.dq.add(var26);
                        }
                    }
                }
            }

            if ((gI().mapID == 47 || gI().mapID == 48) && DataCenter.gI().h % 10 == 0 && Utlis.a((int) 10) == 0) {
                this.at.add(new vdtt_eo(78, DataCenter.gI().n + Utlis.a(DataCenter.gI().n), Utlis.a((int) this.height), new vdtt_ey(-Utlis.a(DataCenter.gI().n), Utlis.a((int) this.height)), -1, -1, false, this.at, new Vector()));
            }

            for (var3 = this.at.size() - 1; var3 >= 0; --var3) {
                vdtt_eo var28;
                (var28 = (vdtt_eo) this.at.elementAt(var3)).o();
                if (var28.n()) {
                    if (var28.N != null && var28.N.p() && var28.k == 68) {
                        az();
                    }

                    this.at.removeElement(var28);
                } else if (Utlis.a(var28.minX(), var28.minY(), var28.maxX(), var28.maxY(), DataCenter.gI().i, DataCenter.gI().j, DataCenter.gI().k, DataCenter.gI().l)) {
                    this.do_.addElement(var28);
                }
            }

            for (var17 = this.av.size() - 1; var17 >= 0; --var17) {
                vdtt_hf var29;
                if ((var29 = (vdtt_hf) this.av.elementAt(var17)) != null) {
                    var29.n();
                    if (var29.p()) {
                        this.av.removeElement(var29);
                    } else if (Utlis.a(var29.minX() - 50, var29.minY() - 50, var29.maxX() + 50, var29.maxY() + 50, DataCenter.gI().i, DataCenter.gI().j, DataCenter.gI().k, DataCenter.gI().l)) {
                        this.do_.addElement(var29);
                    }
                }
            }

            for (var5 = this.au.size() - 1; var5 >= 0; --var5) {
                vdtt_es var30;
                (var30 = (vdtt_es) this.au.elementAt(var5)).n();
                if (var30.q()) {
                    this.au.removeElement(var30);
                } else if (Utlis.a(var30.minX() - 50, var30.minY() - 50, var30.maxX() + 50, var30.maxY() + 50, DataCenter.gI().i, DataCenter.gI().j, DataCenter.gI().k, DataCenter.gI().l)) {
                    this.do_.addElement(var30);
                }
            }

            if (this.et != null) {
                this.et.m();
            }

            if (!this.bo.q()) {
                this.do_.addElement(this.bo);
            } else {
                this.bo.H = 0;
            }

            this.bn.n();
            this.bo.n();
            if (this.bJ > 0) {
                --this.bJ;
            }

            if (this.bK > 0) {
                --this.bK;
            }

            if (this.bL > 0) {
                --this.bL;
            }

            if (this.bM > 0) {
                --this.bM;
            }

            this.as();
            this.au();
            this.at();
            this.ar();

            for (var5 = 0; var5 < this.eh.size(); ++var5) {
                ((vdtt_du) this.eh.get(var5)).m();
                this.do_.add(this.eh.get(var5));
            }

            for (var5 = 0; var5 < this.ei.size(); ++var5) {
                ((vdtt_du) this.ei.get(var5)).m();
                if (Utlis.a(((vdtt_du) this.ei.get(var5)).minX() - 50, ((vdtt_du) this.ei.get(var5)).minY() - 50, ((vdtt_du) this.ei.get(var5)).maxX() + 50, ((vdtt_du) this.ei.get(var5)).maxY() + 50, DataCenter.gI().i, DataCenter.gI().j, DataCenter.gI().k, DataCenter.gI().l)) {
                    this.do_.add(this.ei.get(var5));
                }
            }

            for (var5 = 0; var5 < this.ej.size(); ++var5) {
                ((vdtt_du) this.ej.get(var5)).m();
                if (Utlis.a(((vdtt_du) this.ej.get(var5)).minX() - 50, ((vdtt_du) this.ej.get(var5)).minY() - 50, ((vdtt_du) this.ej.get(var5)).maxX() + 50, ((vdtt_du) this.ej.get(var5)).maxY() + 50, DataCenter.gI().i, DataCenter.gI().j, DataCenter.gI().k, DataCenter.gI().l)) {
                    this.do_.add(this.ej.get(var5));
                }
            }

            this.Q();
            vdtt_fd.b();
            if (this.aB != null) {
                this.aB.b();
                if (this.dy != null) {
                    DataCenter.o();
                    boolean var31 = !this.dy.d;
                    this.dy.b(!this.aB.d() || this.aB.e());
                    if (var31 && this.dy.d) {
                        this.aB.h();
                    }
                }
            }

            if (this.du != null) {
                this.du.b();
            }

            if (this.aA != null) {
                DataCenter.gI();
                DataCenter.n();
                this.aA.b();
                if (!this.cH && this.aT != null) {
                    this.cH = true;
                    if (mConfig.gI().a(13)) {
                        this.cI = 1;
                    }

                    this.aT.f();
                    this.aT.c(mConfig.gI().a(13));
                }

                if (!this.aA.e() && this.dB != null) {
                    DataCenter.n();
                    if (!DataCenter.k()) {
                        this.dB.b(!this.aA.d());
                        this.dw.b(!this.aA.d());
                        this.dB.b = this.cI < 2;
                        this.dw.b = this.cI == 2;
                    } else {
                        this.dB.b(true);
                        this.dw.b(true);
                    }
                }
            }

            if (this.ds != null) {
                this.ds.b();
            }

            if (this.dt != null) {
                this.dt.b();
            }

            if (this.cG > 0) {
                --this.cG;
                this.focusEntity = this.cF;
            } else if (this.aX && this.focusEntity != null) {
                this.ap();
            } else {
                this.aq();
            }

            this.aV = false;

            for (var1 = 0; var1 < this.vThu.size(); ++var1) {
                if (!((Thu) this.vThu.elementAt(var1)).k) {
                    this.aV = true;
                    break;
                }
            }

            if (this.cn && (Char.gI().cx >= gI().maxX || Char.gI().cx <= 0) || this.mapID == 56 && Char.gI().cx < 70 && Char.gI().cy > 484 || this.mapID == 48 && Char.gI().cx < 75 && Char.gI().cy > 500 || this.mapID == 48 && Char.gI().cx > 990 && Char.gI().cy > 500 || this.mapID == 50 && Char.gI().cx < 140 && Char.gI().cy > 534 || this.mapID == 50 && Char.gI().cx > 930 && Char.gI().cy > 534 || this.mapID == 58 && Char.gI().cx > 264 && Char.gI().cx <= 324 && Char.gI().cy < 60) {
                Char.gI().W();
                this.al();
                return;
            }

            if (this.cp) {
                this.cp = false;
                vdtt_aa.gI().v();
            }

            if (this.eo) {
                this.eo = System.currentTimeMillis() - this.ep < (long) ((this.eq + 2) * 1000);
                if (!this.eo) {
                    this.ej.clear();
                    this.cO = 0;
                }
            }

            this.dF = null;
            this.bi = null;
            if (gI().getMapTemplate().type == 21) {
                for (var1 = 0; var1 < this.vMob.size(); ++var1) {
                    if ((var27 = (Mob) this.vMob.get(var1)).status != 4 && var27.status != 6 && var27.status != 5 && var27.levelBoss > 0) {
                        this.dF = Caption.km + " " + var27.getMobTemplate().name;
                        this.bi = var27;
                        break;
                    }
                }

                if (this.dF == null) {
                    if (Char.gI().h(132) != null) {
                        this.dF = Char.gI().name + Caption.wQ;
                    } else {
                        for (var1 = 0; var1 < this.vChar.size(); ++var1) {
                            if ((var16 = (Char) this.vChar.get(var1)).h(132) != null) {
                                this.dF = var16.name + Caption.wQ;
                                this.bi = var16;
                                break;
                            }
                        }
                    }
                }
            }

            this.aj();
            if (this.cR != null) {
                this.cR.b(false);
                this.cR.setXY(DataCenter.gI().n - Utlis.n(25 + AppListener.gI().n() / 2), this.aB.d() ? 75 : 28);
            }

            if (this.cS != null) {
                this.cS.b(false);
                this.cS.setXY(DataCenter.gI().n - Utlis.n(25 + AppListener.gI().n() / 2), this.aB.d() ? 75 : 28);
            }
        } catch (Exception var14) {
            Utlis.a(var14);
        }

        this.ak();
    }

    private void aj() {
        int var1;
        if ((this.idTask != 14 && this.idTask != 9 || this.idStep != 1 || this.cR == null || !this.V()) && !this.ew) {
            if (this.b.size() <= 0 || !(this.b.lastElement() instanceof vdtt_ni) && this.aC == null && (!(this.b.lastElement() instanceof vdtt_ak) || this.b.lastElement() instanceof vdtt_gf)) {
                DataCenter.gI();
                if (!DataCenter.b()) {
                    if (this.idTask == 14 && this.V() && !Char.gI().isDie()) {
                        if (!SettingsTab.K().V) {
                            var1 = this.aG.cx + 14;
                            DataCenter.gI().pointHelper.b(var1, this.aG.cy + 7);
                        } else {
                            DataCenter.gI().pointHelper.b = false;
                        }
                    } else if (this.idTask == 0 && this.idStep == 2 && this.b.lastElement().equals(this)) {
                        var1 = this.aJ.cx + 12;
                        DataCenter.gI().pointHelper.b(var1, this.aJ.cy + 12);
                    } else if ((this.idTask == 1 && (this.idStep == 0 || this.idStep == 1) || this.idTask == 5 && this.idStep == 14) && this.b.lastElement().equals(this)) {
                        DataCenter.gI().pointHelper.b(10 + AppListener.gI().m() / 2, 10);
                    } else if (this.idTask == 5 && this.b.lastElement().equals(this)) {
                        if (this.idStep == 0) {
                            if (gI().aB.d()) {
                                DataCenter.gI().pointHelper.b(DataCenter.gI().n - Utlis.n(22), Utlis.n(37));
                                return;
                            }

                            DataCenter.gI().pointHelper.b(DataCenter.gI().n - Utlis.n(7), Utlis.n(7));
                            return;
                        }

                        if (this.idStep == 3) {
                            DataCenter.gI().pointHelper.b(AppListener.gI().m() + 10, 10);
                            return;
                        }
                    } else {
                        if (this.idTask == 3 && this.idStep == 0 && gI().idStep < 9 && this.b.lastElement().equals(this)) {
                            var1 = this.aH.cx + 14;
                            DataCenter.gI().pointHelper.b(var1, this.aH.cy + 7);
                            return;
                        }

                        if (this.idTask == 10 && gI().idStep == 1 && this.mapID != 87 && this.mapID != 57 && this.b.lastElement().equals(this)) {
                            DataCenter.gI().pointHelper.b(DataCenter.gI().n - 40, 7);
                            return;
                        }

                        if (this.idTask == 17 && this.b.lastElement().equals(this) && this.idStep <= 0) {
                            if (!this.aB.d()) {
                                DataCenter.gI().pointHelper.b(DataCenter.gI().n - Utlis.n(7), Utlis.n(7));
                                return;
                            }

                            DataCenter.gI().pointHelper.b(DataCenter.gI().n - Utlis.n(22), Utlis.n(60));
                        }
                    }
                }
            } else {
                DataCenter.gI().pointHelper.b = false;
            }
        } else {
            vdtt_w var2;
            if ((var2 = super.c) instanceof vdtt_bf) {
                vdtt_bf var3;
                if ((var3 = (vdtt_bf) var2).b.equals(Caption.tY)) {
                    var1 = var3.cx + 65;
                    int var4 = var3.cy + var3.height;
                    DataCenter.gI().pointHelper.b(var1, var4 - 20);
                }
            } else if (this.b.lastElement() instanceof GameSrc) {
                this.ew = true;
                var1 = this.cR.cx + 7;
                DataCenter.gI().pointHelper.b(var1, this.cR.cy + 7);
            } else {
                DataCenter.gI().pointHelper.b = false;
            }
        }

    }

    private void ak() {
        if (DataCenter.gI().currentScreen instanceof GameSrc) {
            int var1;
            boolean var4;
            if (this.el >= 0) {
                vdtt_aa var2 = vdtt_aa.gI();
                var1 = this.el;
                vdtt_aa var3 = var2;

                try {
                    if (!var3.a) {
                        var4 = var3.e != var1;
                        var3.e = var1;
                        if (!var4) {
                            var3.l();
                        } else {
                            boolean var5 = mConfig.gI().a(0);
                            var3 = var3;

                            try {
                                var3.j();
                                if (var5) {
                                    byte var6 = -1;
                                    switch (var3.e) {
                                        case 3:
                                        default:
                                            break;
                                        case 5:
                                            var6 = 2;
                                            break;
                                        case 13:
                                            var6 = 16;
                                    }

                                    if (var6 >= 0) {
                                        byte[] var7 = Utlis.b(Utlis.h("music/" + var6).readBytes());
                                        Binary.a("music" + var6 + ".mp3", var7);
                                        var3.c = Gdx.audio.newMusic(Utlis.i(Binary.a + "/music" + var6 + ".mp3"));
                                    }

                                    var3.l();
                                }
                            } catch (Exception var8) {
                                Utlis.a(var8);
                            }
                        }
                    }
                } catch (Exception var9) {
                    Utlis.a(var9);
                }
            } else {
                vdtt_aa.gI().f();
            }

            vdtt_aa.gI().a(this.mapID);
            short var10 = -1;
            Mob var11;
            switch (this.mapID) {
                case 57:
                case 65:
                case 71:
                case 75:
                case 83:
                    for (var1 = 0; var1 < this.do_.size(); ++var1) {
                        if (this.do_.get(var1) instanceof Mob && ((var11 = (Mob) this.do_.get(var1)).id == 160 || var11.id == 166 || var11.id == 169 || var11.id == 153 || var11.id == 152)) {
                            var10 = var11.id;
                            break;
                        }
                    }

                    if (var10 > 0) {
                        vdtt_aa.gI();
                    }
                case 58:
                case 59:
                case 60:
                case 61:
                case 64:
                case 67:
                case 68:
                case 70:
                case 72:
                case 73:
                case 74:
                case 76:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                default:
                    return;
                case 62:
                case 63:
                case 66:
                    var4 = false;

                    for (var1 = 0; var1 < this.do_.size(); ++var1) {
                        if (this.do_.get(var1) instanceof Mob && ((var11 = (Mob) this.do_.get(var1)).id == 159 || var11.id == 168 || var11.id == 161)) {
                            var4 = true;
                            break;
                        }
                    }

                    if (var4) {
                        vdtt_aa.gI().m();
                        return;
                    }

                    vdtt_aa.gI().e();
                    return;
                case 69:
                    if (Char.gI().cy >= 500) {
                        vdtt_aa.gI().m();
                        return;
                    }

                    vdtt_aa.gI().e();
                    return;
                case 77:
                    if (Char.gI().cy >= 600) {
                        vdtt_aa.gI().m();
                    } else {
                        vdtt_aa.gI().e();
                    }
            }
        }

    }

    private void al() {
        try {
            if (!Char.gI().bC) {
                long var1 = Utlis.a();
                this.i();
                if (!d && var1 - N >= 500L) {
                    d = true;
                    N = var1;
                    (new Message((byte) 127)).send();
                }
            }
        } catch (Exception var3) {
        }

    }

    private void a(Vector var1, Vector var2, int var3) {
        Vector var4 = new Vector();

        for (int var5 = var1.size() - 3; var5 >= 0; --var5) {
            WayPoint var6 = (WayPoint) var1.elementAt(var5);
            var4.clear();
            var4.addAll(var2);
            Vector var7;
            if ((var7 = this.a(var4, var6.k, var3, false)).size() > 0 && var7.size() < var1.size() - var5) {
                for (int var8 = var1.size() - 1; var8 >= var5; --var8) {
                    var1.removeElementAt(var8);
                }

                var1.addAll(var7);
                var5 = var1.size() - 2;
            }
        }

    }

    private Vector a(Vector var1, int var2, int var3, boolean var4) {
        Vector var5;
        (var5 = new Vector()).addAll(var1);
        Vector var6 = new Vector();

        while (true) {
            Vector var7 = new Vector();
            if (!this.a(var2, var3, var1, var7)) {
                var1 = new Vector();

                for (var2 = 0; var2 < var6.size(); ++var2) {
                    var7 = (Vector) var6.elementAt(var2);
                    if (var4) {
                        this.a(var7, var5, var3);
                    }

                    if (var1.size() == 0 || var7.size() < var1.size()) {
                        var1 = var7;
                    }
                }

                return var1;
            }

            var6.add(var7);
            var1.remove(K);
        }
    }

    public final int G() {
        try {
            return Char.gI().e(this.bY).index;
        } catch (Exception var2) {
            Utlis.a(var2);
            return -1;
        }
    }

    private void am() {
        this.bT = this.bW = this.bX = this.bU = this.bV = this.dc = 0;
        this.cd = false;
        this.dG = null;
        Item var1 = null;
        this.df.clear();

        try {
            System.currentTimeMillis();

            for (int var2 = 0; var2 < Char.gI().arrItemBag.length; ++var2) {
                Item var3;
                if ((var3 = Char.gI().arrItemBag[var2]) != null) {
                    if (Item.d(var3.id)) {
                        this.cd = true;
                    }

                    if (var3.id >= 165 && var3.id <= 168) {
                        var1 = var3;
                        if (this.bY < 0 || this.bY >= DataCenter.gI().itemTemplate.length) {
                            this.a(var3.id, true);
                            this.am();
                            break;
                        }
                    }

                    if (Item.d(var3.id)) {
                        this.dG = var3;
                        if (this.bY >= 165 && this.bY <= 168) {
                            this.a(var3.id, true);
                            this.am();
                            break;
                        }

                        if (Char.gI().F() && !Item.d(this.bY)) {
                            this.a(var3.id, false);
                            this.am();
                            break;
                        }
                    }

                    if (!var3.aj() && var3.id != 826) {
                        if (var3.getItemTemplate().type == 23) {
                            this.bW += var3.M();
                        } else if (var3.getItemTemplate().type == 24) {
                            this.dc += var3.M();
                        }
                    } else {
                        this.bT += var3.M();
                    }

                    if (var3.id == this.bY) {
                        this.bX += var3.M();
                    } else if (var3.id == 160) {
                        this.bU += var3.M();
                    } else if (var3.id == 711) {
                        this.bV += var3.M();
                    }

                    if (var3.getItemTemplate().type == 24) {
                        this.df.add(var3);
                    }
                }
            }
        } catch (Exception var4) {
        }

        if (this.bX == 0 && Item.d(this.bY)) {
            if (this.dG != null) {
                this.a(this.dG.id, true);
                this.am();
                return;
            }

            if (var1 != null) {
                this.a(var1.id, true);
                this.am();
                return;
            }
        } else if (!Char.gI().F() && Item.d(this.ef) && !Item.d(this.bY)) {
            this.a(this.ef, false);
        }

    }

    private boolean a(int var1, int var2, Vector var3, Vector var4) {
        if (var1 == var2) {
            return true;
        } else {
            for (int var5 = 0; var5 < var3.size(); ++var5) {
                short[] var6;
                Vector var7;
                WayPoint var8;
                if ((var6 = (short[]) var3.elementAt(var5))[0] == var1) {
                    (var7 = new Vector()).addAll(var3);
                    var7.remove(var5);
                    if (this.a(var6[5], var2, var7, var4)) {
                        K = var5;
                        (var8 = new WayPoint(0, 0)).a(var6[0], var6[5], var6[1], var6[2], var6[3], var6[4]);
                        var4.insertElementAt(var8, 0);
                        return true;
                    }
                } else if (var6[5] == var1) {
                    (var7 = new Vector()).addAll(var3);
                    var7.remove(var5);
                    if (this.a(var6[0], var2, var7, var4)) {
                        K = var5;
                        (var8 = new WayPoint(0, 0)).a(var6[5], var6[0], var6[6], var6[7], var6[8], var6[9]);
                        var4.insertElementAt(var8, 0);
                        return true;
                    }
                }
            }

            return false;
        }
    }

    private void an() {
        if (Utlis.a() >= this.dJ && !this.ay()) {
            boolean var1 = true;
            this.aW = var1;
            Collections.sort(this.dq, Entity.j);
            if (this.dq.size() <= 0) {
                this.focusEntity = null;
            } else {
                int var2 = this.dq.size();
                int var3 = -1;
                if (this.focusEntity != null) {
                    var3 = this.dq.indexOf(this.focusEntity);
                }

                int var4 = 0;

                while (true) {
                    if (var4 >= var2) {
                        return;
                    }

                    ++var3;
                    if (var3 >= this.dq.size()) {
                        var3 = 0;
                    }

                    Entity var5;
                    if ((!((var5 = (Entity) this.dq.elementAt(var3)) instanceof Mob) || ((Mob) var5).v()) && (!(var5 instanceof Char) || !((Char) var5).af())) {
                        this.focusEntity = var5;
                        break;
                    }

                    ++var4;
                }
            }
        }

    }

    private void ao() {
        if (this.dH != null && this.dH.a(Char.gI(), false) && Char.gI().aU == null) {
            Skill var1 = this.bp;
            this.a(this.dH, false);
            if (Char.gI().aU != null) {
                Char.gI().aU.j = var1;
            }
        } else if (Char.gI().pointMove == null) {
            Char.gI().c(this.focusEntity.cx, this.focusEntity.cy);
        }

    }

    private void g(boolean var1) {
        int var2 = Utlis.b(Char.gI().cx, Char.gI().cy, this.focusEntity.cx, this.focusEntity.cy);
        if (this.a((XYEntity) this.focusEntity)) {
            this.aX = false;
            this.focusEntity = null;
        } else {
            Char var11;
            Message var13;
            if (this.focusEntity instanceof Mob) {
                Mob var9 = (Mob) this.focusEntity;
                if (gI().bp == null) {
                    if (var2 <= this.minRangeNpc) {
                        this.aX = false;
                        Char.gI().S();
                        if (var9.getMobTemplate().type == 9) {
                            a(var9);
                            return;
                        }
                    } else {
                        this.ao();
                    }
                } else {
                    if (var9.getMobTemplate().type == 9 || var9.getMobTemplate().type == 10 || var9.getMobTemplate().type == 11 || var2 > gI().bp.i || var2 > gI().bp.j) {
                        if ((var9.getMobTemplate().type == 9 || var9.getMobTemplate().type == 10 || var9.getMobTemplate().type == 11) && var2 <= 40) {
                            this.aX = false;
                            Char.gI().S();
                            Char.gI().W();
                            if (var9.getMobTemplate().type == 10) {
                                if (!(super.c instanceof vdtt_ni)) {
                                    Mob var12 = var9;

                                    try {
                                        (var13 = new Message((byte) 8)).writeShort(var12.idEntity);
                                        var13.send();
                                    } catch (Exception var7) {
                                        Utlis.a(var7);
                                    }

                                    this.a((vdtt_w) (new vdtt_ni(this, var9.getMobTemplate().i, var9.getMobTemplate().detail, 0)));
                                    return;
                                }
                            } else if (var9.getMobTemplate().type == 9) {
                                if (Utlis.b(Char.gI().cx, var9.cx) < 20) {
                                    if (var9.cx >= Char.gI().cx) {
                                        Char.gI().cx = (short) (var9.cx - 20);
                                    } else {
                                        Char.gI().cx = (short) (var9.cx + 20);
                                    }
                                }

                                Char.gI().cy = var9.cy;
                                a(var9);
                            }

                            return;
                        }

                        this.ao();
                        return;
                    }

                    if (gI().bp.d == 9) {
                        if (Char.gI().U() == null) {
                            Char.gI().a(true, dK);
                            return;
                        }

                        if (Char.gI().pointMove == null || !Char.gI().pointMove.a() || SettingsTab.K().V) {
                            this.aX = false;
                            Char.gI().S();
                            Char.gI().W();
                            Char.gI().a(gI().bp, this.focusEntity, true);
                            return;
                        }
                    } else {
                        if (gI().bp.i < 90 && var9.getMobTemplate().type != 3 && var9.id != 239 && Utlis.b(Char.gI().cy - var9.cy) > 1) {
                            if (Char.gI().pointMove == null) {
                                var11 = Char.gI();
                                vdtt_gj var14 = new vdtt_gj(var9.cx, var9.cy, Char.gI().typePk);
                                var11.pointMove = var14;
                            } else {
                                Char.gI().pointMove.setXY(var9.cx, var9.az);
                            }

                            return;
                        }

                        if (!Char.gI().q() || Char.gI().r()) {
                            this.aX = false;
                            Char.gI().S();
                            Char.gI().W();
                            Char.gI().a(gI().bp, this.focusEntity, true);
                            return;
                        }
                    }
                }

                return;
            }

            if (this.focusEntity instanceof Char) {
                Char var3 = (Char) this.focusEntity;
                if (this.a(var3) && gI().bp != null) {
                    if (var2 <= gI().bp.i && var2 <= gI().bp.j) {
                        if (!SettingsTab.K().V || !mConfig.gI().a(35) || gI().V()) {
                            if (gI().bp.d == 9) {
                                if (Char.gI().U() == null) {
                                    Char.gI().a(true, dK);
                                    return;
                                }

                                if (Char.gI().pointMove == null || !Char.gI().pointMove.a() || SettingsTab.K().V) {
                                    this.aX = false;
                                    Char.gI().S();
                                    Char.gI().W();
                                    Char.gI().a(gI().bp, this.focusEntity, true);
                                    return;
                                }
                            } else if (!Char.gI().q() || Char.gI().r()) {
                                this.aX = false;
                                Char.gI().S();
                                Char.gI().W();
                                Char.gI().a(gI().bp, this.focusEntity, true);
                                return;
                            }
                        }
                    } else if (!SettingsTab.K().V || !mConfig.gI().a(35) || gI().V()) {
                        this.ao();
                    }

                    return;
                }
            }

            int var8 = this.minRangeNpc;
            if (this.focusEntity instanceof ItemMap) {
                var8 = this.minRangeItemMap;
            }

            if (var2 <= var8) {
                this.aX = false;
                Char.gI().S();
                Char.gI().W();
                if (this.focusEntity instanceof Npc) {
                    if (!SettingsTab.K().V && !this.o.a[5] && !this.o.a[15]) {
                        Npc var4;
                        (var4 = (Npc) this.focusEntity).setDir(Char.gI());
                        Char.gI().setDir(this.focusEntity);
                        Char.gI();
                        XYEntity var5;
                        if ((var5 = Char.b(Char.gI().cx, this.focusEntity.cy)) != null) {
                            Char.gI().cy = var5.cy;
                        } else {
                            Char.gI().cy = this.focusEntity.cy;
                        }

                        a(var4);
                        return;
                    }
                } else if (this.focusEntity instanceof ItemMap) {
                    if (!SettingsTab.K().V) {
                        try {
                            Char.gI().W();
                            ItemMap var10 = (ItemMap) this.focusEntity;
                            (var13 = new Message((byte) 59)).writeShort(var10.idEntity);
                            var13.send();
                            return;
                        } catch (Exception var6) {
                            return;
                        }
                    }
                } else if (this.focusEntity instanceof Char && gI().bp != null) {
                    if ((var11 = (Char) this.focusEntity) != null && (var11.status == 4 || var11.status == 5)) {
                        this.focusEntity = null;
                    }

                    return;
                }
            } else {
                this.ao();
            }
        }

    }

    private void ap() {
        this.g(false);
    }

    private static void a(ItemMap var0) {
        try {
            Char.gI().W();
            Message var1;
            (var1 = new Message((byte) 59)).writeShort(var0.idEntity);
            var1.send();
        } catch (Exception var2) {
        }

    }

    private void aq() {
        if (this.focusEntity == null) {
            this.h(false);
        } else {
            if (this.a((XYEntity) this.focusEntity) || this.focusEntity instanceof ItemMap && ((ItemMap) this.focusEntity).item.id == 224 || SettingsTab.K().V && (this.focusEntity instanceof Npc || this.focusEntity instanceof Mob && ((Mob) this.focusEntity).id == 30)) {
                this.focusEntity = null;
                return;
            }

            int var1;
            if (this.focusEntity instanceof Char) {
                Char var3;
                if (!(var3 = (Char) this.focusEntity).U && !var3.af()) {
                    if (this.getMapTemplate().type == 6 || this.getMapTemplate().type == 5 || this.getMapTemplate().type == 21 || this.getMapTemplate().type == 10) {
                        if (var3.isDie()) {
                            this.focusEntity = null;
                            return;
                        }

                        for (var1 = 0; var1 < var3.ba.size(); ++var1) {
                            if (((Effect) var3.ba.elementAt(var1)).id == 46) {
                                this.focusEntity = null;
                                return;
                            }
                        }
                    }

                    return;
                }

                this.focusEntity = null;
                return;
            }

            if (this.dq.indexOf(this.focusEntity) < 0 && !this.aW || this.focusEntity instanceof Mob && this.focusEntity.isDie()) {
                this.focusEntity = null;
                return;
            }

            if (this.focusEntity != null) {
                int var2 = Utlis.b(Char.gI().cx, Char.gI().cy, this.focusEntity.cx, this.focusEntity.cy);
                var1 = DataCenter.gI().n;
                if (SettingsTab.K().V && SettingsTab.K().E() > var1) {
                    var1 = SettingsTab.K().E();
                }

                if (var2 > var1) {
                    this.focusEntity = null;
                }

                return;
            }
        }

    }

    public final void H() {
        this.ed = Char.gI().cx;
        this.ee = Char.gI().cy;
    }

    public static void h(int var0) {
        vdtt_dv var1;
        if ((var1 = new vdtt_dv(var0, -1, -1, -1, 0, 0)).a >= 0) {
            for (int var2 = 0; var2 < gI().vNpc.size(); ++var2) {
                if (((Npc) gI().vNpc.elementAt(var2)).id == var1.a) {
                    var1.d = gI().mapID;
                    break;
                }
            }

            if (var1.d < 0) {
                gI();
                b(var1);
            }
        }

        gI().pointMoveMap = var1;
    }

    private void ar() {
        try {
            if (SettingsTab.K().F()) {
                long var1 = Utlis.a();
                Member var3;
                if (gI().bq != null && !gI().bq.isLeader() && (var3 = gI().bq.b()) != null) {
                    int var4 = 10000;
                    short var5 = 0;
                    short var6 = 0;
                    short var7 = 0;
                    Char var8;
                    if ((var8 = gI().d(var3.name)) != null) {
                        var5 = gI().mapID;
                        gI();
                        var6 = var8.cx;
                        var7 = var8.cy;
                        var4 = Utlis.a((XYEntity) var8, (XYEntity) Char.gI());
                    } else {
                        if (var3.e == 0 || var1 > this.ev) {
                            var3.e = -1;
                            Message.c((byte) -23).send();
                            this.ev = var1 + 5000L;
                        }

                        if (var3.e != 0) {
                            var5 = var3.e;
                            short var9 = var3.f;
                            var6 = var3.g;
                            var7 = var3.h;
                            if (gI().mapID == var5) {
                                gI();
                                y(var9);
                                return;
                            }
                        }
                    }

                    if (var5 > 0 && var4 > 100 && (gI().pointMoveMap == null || gI().pointMoveMap.d != var5 || gI().pointMoveMap.e != var6 || gI().pointMoveMap.f != var7)) {
                        SettingsTab.K().a(false);
                        gI().pointMoveMap = new vdtt_dv(var5, var6, var7);
                    }
                }
            }
        } catch (Exception var10) {
            var10.printStackTrace();
        }

    }

    private void as() {
        try {
            if (!SettingsTab.K().G() || Char.gI().isDie() || this.b.lastElement() instanceof vdtt_kn) {
                return;
            }
        } catch (Exception var4) {
        }

        for (int var1 = 0; var1 < this.vItemMap.size(); ++var1) {
            ItemMap var2 = (ItemMap) this.vItemMap.elementAt(var1);
            SettingsTab var3;
            if (((var3 = SettingsTab.K()).G() && var3.b[6] == -1 || !var2.item.p()) && Utlis.a((XYEntity) Char.gI(), (XYEntity) var2) < 50) {
                this.b(var2);
            }
        }

    }

    private void b(ItemMap var1) {
        if (this.bN >= 1000 && var1 != null && !this.dr.contains(var1)) {
            this.dr.add(var1);
            if (var1.item.id == 244) {
                return;
            }

            if (!Char.gI().a(var1) && (var1.I == Char.gI().idEntity || var1.I == -1)) {
                a(var1);
            }
        }

    }

    private boolean v(int var1) {
        for (int var2 = 0; var2 < gI().bq.vMember.size(); ++var2) {
            Member var3 = (Member) gI().bq.vMember.elementAt(var2);
            Char var4;
            if ((var4 = this.d(var3.name)) != null && var4.idEntity == var1) {
                return true;
            }
        }

        return false;
    }

    private void at() {
        try {
            int var1;
            if (System.currentTimeMillis() - this.ek >= 1000L && !(gI().c instanceof vdtt_na) && !(gI().c instanceof vdtt_nd) && Char.gI().rank >= 5 && (var1 = SettingsTab.K().D()) > 0) {
                for (var1 = var1; var1 >= 0 && !this.x(var1); --var1) {
                }
            }
        } catch (Exception var2) {
        }

    }

    private void au() {
        if (gI().cB && SettingsTab.d >= 0 && !Char.gI().isDie() && Char.gI().bI < 40) {
            if (this.cD > 0) {
                --this.cD;
                SettingsTab.K().a(false);
                if (this.cD == 0) {
                    this.av();
                } else {
                    SettingsTab.K().a(false);
                }
            } else {
                this.av();
            }
        } else if (Char.gI().aX == null) {
            int var1 = this.ed - SettingsTab.K().E();
            int var2 = this.ed + SettingsTab.K().E();
            int var3 = this.ee - SettingsTab.K().E();
            int var4 = this.ee + SettingsTab.K().E();
            if (SettingsTab.K().V && !Char.gI().isDie() && !(this.b.lastElement() instanceof vdtt_kn) && this.bN >= 1000) {
                if (this.b.lastElement() instanceof vdtt_ni && this.bN == 1000) {
                    SettingsTab.K();
                }

                if (!this.o.e && (SettingsTab.K().c < 0 || SettingsTab.K().c == this.mapID)) {
                    boolean var6;
                    int var8;
                    if (SettingsTab.K().b[41] != -1 && !Char.gI().g(0)) {
                        GameSrc var5 = gI();
                        var6 = false;
                        GameSrc var7 = var5;
                        if (var5.bL <= 0 && !Char.gI().isDie() && !Char.gI().g(0)) {
                            label447:
                            {
                                for (var8 = 0; var8 < var7.df.size(); ++var8) {
                                    Item var9;
                                    if ((var9 = (Item) var7.df.elementAt(var8)).getItemTemplate().levelNeed <= Char.gI().w()) {
                                        var7.bL = 50;
                                        var7.a(var9);
                                        break label447;
                                    }
                                }

                                var7.df.size();
                            }
                        }
                    }

                    int var18;
                    try {
                        Skill var19 = null;

                        for (var18 = this.af.length - 1; var18 >= 0; --var18) {
                            Skill var20;
                            if ((var20 = this.af[var18]).d == 30) {
                                var19 = var20;
                            } else if (var20 != null && var20.e > 0 && var20.d()) {
                                SettingsTab var22 = SettingsTab.K();
                                if (var20.m()) {
                                    if (!mConfig.gI().a(39)) {
                                        continue;
                                    }
                                } else if (!var22.a[1][var20.getSkillTemplate().levelNeed / 5].m) {
                                    continue;
                                }

                                if (Char.gI().status != 4 && Char.gI().status != 5 && Char.gI().w() >= var20.getSkillTemplate().levelNeed && !var20.l() && var20.a(Char.gI(), false)) {
                                    if (Char.gI().aU != null) {
                                        break;
                                    }

                                    this.a(var20, false);
                                }
                            }
                        }

                        if (Char.gI().aU == null && Char.gI().status != 4 && Char.gI().status != 5) {
                            this.a(var19, false);
                        }
                    } catch (Exception var17) {
                        Utlis.a(var17);
                    }

                    if (!MoveSmart.e()) {
                        var6 = true;
                        this.aW = var6;
                        Vector var21 = new Vector();
                        var18 = 0;
                        var8 = 0;
                        int var23 = 0;
                        int var10 = 0;
                        if (Char.gI().aY != null) {
                            var18 = Char.gI().cx - Char.gI().aY.i + 0;
                            var8 = Char.gI().cx + Char.gI().aY.i - 0;
                            var23 = Char.gI().l() - Char.gI().aY.i + 0;
                            var10 = Char.gI().l() + Char.gI().aY.i - 0;
                        }

                        Char var12;
                        if ((this.focusEntity == null || !(this.focusEntity instanceof Char) || this.focusEntity instanceof Char && !this.a((Char) this.focusEntity)) && (!mConfig.gI().a(35) || gI().V())) {
                            for (int var11 = 0; var11 < this.vChar.size(); ++var11) {
                                if ((var12 = (Char) this.vChar.elementAt(var11)) != null && this.a(var12) && Utlis.a(var12.minX(), var12.minY(), var12.maxX(), var12.cy, var1, var3, var2, var4)) {
                                    this.focusEntity = var12;
                                    break;
                                }
                            }
                        }

                        if (this.focusEntity != null && this.focusEntity instanceof Char) {
                            Char var24 = (Char) this.focusEntity;

                            for (int var26 = 0; var26 < var24.ba.size(); ++var26) {
                                if (((Effect) var24.ba.elementAt(var26)).id == 46) {
                                    this.focusEntity = null;
                                    this.h(true);
                                    break;
                                }
                            }
                        }

                        if (this.focusEntity != null) {
                            vdtt_gj var25;
                            if (this.focusEntity instanceof ItemMap) {
                                ItemMap var13 = (ItemMap) this.focusEntity;
                                if (Char.gI().a(var13) && var13.item.id != 223) {
                                    this.focusEntity = null;
                                } else {
                                    if (Utlis.b(this.focusEntity.cx, this.focusEntity.cy, Char.gI().cx, Char.gI().cy) <= 50) {
                                        this.b(var13);
                                        this.focusEntity = null;
                                        return;
                                    }

                                    Char.gI().setDir(this.focusEntity);
                                    var12 = Char.gI();
                                    var25 = new vdtt_gj(this.focusEntity.cx, this.focusEntity.cy, Char.gI().typePk);
                                    var12.pointMove = var25;
                                }
                            } else {
                                if (!(this.focusEntity instanceof Char) || this.a((Char) this.focusEntity)) {
                                    if (Char.gI().aY == null) {
                                        return;
                                    }

                                    if (Utlis.a(Char.gI().minX(), Char.gI().minY(), Char.gI().maxX(), Char.gI().cy, var18, var23, var8, var10)) {
                                        Skill var28 = Char.gI().aY;
                                        Char var14 = Char.gI();
                                        boolean var16;
                                        if (var28.n < Utlis.a() && var14.mp >= var28.g) {
                                            var16 = true;
                                        } else {
                                            var14.p();
                                            var16 = false;
                                        }

                                        if (var16 && Char.gI().status != 4 && Char.gI().status != 5) {
                                            this.a(Char.gI().aY, true);
                                            return;
                                        }

                                        return;
                                    }

                                    if (Utlis.a(Char.gI().minX(), Char.gI().minY(), Char.gI().maxX(), Char.gI().cy, var1, var3, var2, var4)) {
                                        var12 = Char.gI();
                                        var25 = new vdtt_gj(this.focusEntity.cx, this.focusEntity.cy, Char.gI().typePk);
                                        var12.pointMove = var25;
                                        return;
                                    }
                                }

                                this.focusEntity = null;
                            }
                        } else {
                            this.focusEntity = null;
                            Vector var27 = new Vector();
                            if (SettingsTab.K().G() && !Char.gI().isDie()) {
                                for (var18 = 0; var18 < this.vItemMap.size(); ++var18) {
                                    ItemMap var29;
                                    if (Utlis.a((var29 = (ItemMap) this.vItemMap.elementAt(var18)).minX(), var29.minY(), var29.maxX(), var29.cy, var1, var3, var2, var4)) {
                                        if (var29.item.id == 224) {
                                            if (var29.I != Char.gI().idEntity && var29.I != -1 && this.v(var29.I)) {
                                            }
                                        } else if (!this.a((XYEntity) var29) && !this.dr.contains(var29) && !Char.gI().a(var29) && (var29.I == Char.gI().idEntity || var29.I == -1)) {
                                            var10 = var29.item.id;
                                            Item var30;
                                            if (this.dV.contains(var10) || var29.item.getItemTemplate().isXepChong && var29.item.h == -1L && (Utlis.j((var30 = var29.item).getItemTemplate().detail) || !var30.getItemTemplate().detail.toLowerCase().equals(Caption.pV))) {
                                                var27.add(var29);
                                            }
                                        }
                                    }
                                }
                            }

                            if (var27.size() > 0) {
                                Collections.sort(var27, Entity.j);
                                this.focusEntity = (Entity) var27.firstElement();
                            } else {
                                if (var21.size() == 0) {
                                    for (var18 = 0; var18 < this.vMob.size(); ++var18) {
                                        Mob var32;
                                        if (!(var32 = (Mob) this.vMob.elementAt(var18)).isDie() && var32.getMobTemplate().type != 9 && var32.getMobTemplate().type != 10 && var32.getMobTemplate().type != 11 && (!SettingsTab.K().M() || var32.levelBoss != 3) && var32.hp != 0 && (this.dd != 0 || Utlis.b(Char.gI().cy - var32.cy) <= 40)) {
                                            Utlis.a((XYEntity) var32, (XYEntity) Char.gI());
                                            if (Utlis.a(var32.minX(), var32.minY(), var32.maxX(), var32.q(), var1, var3, var2, var4) && var32.v() && !this.a((XYEntity) var32)) {
                                                var21.add(var32);
                                            }
                                        }
                                    }
                                }

                                if (this.focusEntity == null && var21.size() > 0) {
                                    Vector var33 = new Vector();
                                    Vector var31 = new Vector();
                                    Vector var34 = new Vector();

                                    for (var4 = 0; var4 < var21.size(); ++var4) {
                                        Entity var15;
                                        var8 = Utlis.b((var15 = (Entity) var21.get(var4)).cx, Char.gI().cx);
                                        if (Utlis.b(var15.cy, Char.gI().cy) < 2) {
                                            if (var8 < 100) {
                                                var33.add(var15);
                                            } else {
                                                var31.add(var15);
                                            }
                                        } else {
                                            var34.add(var15);
                                        }
                                    }

                                    if (var33.size() > 0) {
                                        this.focusEntity = (Entity) var33.get(Utlis.a(var33.size()));
                                    } else {
                                        var21.clear();
                                        Collections.sort(var31, Entity.j);
                                        Collections.sort(var34, Entity.j);
                                        var21.addAll(var31);
                                        var21.addAll(var34);
                                        this.focusEntity = (Entity) var21.firstElement();
                                    }
                                }
                            }

                            if ((this.focusEntity == null || this.focusEntity != null && (this.focusEntity.status == 4 || this.focusEntity.status == 6 || this.focusEntity.status == 5)) && Char.gI().cx != this.ed && Char.gI().cy != this.ee) {
                                Char.gI().c(this.ed, this.ee);
                            }
                        }
                    }
                } else {
                    SettingsTab.K().a(false);
                }
            } else if (SettingsTab.K().V && this.focusEntity != null && this.focusEntity instanceof Char && !Utlis.a(this.focusEntity.minX(), this.focusEntity.minY(), this.focusEntity.maxX(), this.focusEntity.maxY(), var1, var3, var2, var4)) {
                this.focusEntity = null;
            }
        }

    }

    private void av() {
        gI().pointMoveMap = new vdtt_dv(SettingsTab.d, SettingsTab.M, SettingsTab.N);
        if (SettingsTab.d == this.mapID && SettingsTab.M == Char.gI().cx && SettingsTab.N == Char.gI().cy) {
            gI().cB = false;
            SettingsTab.K().a(true);
        } else {
            SettingsTab.K().a(false);
        }

    }

    private boolean h(boolean var1) {
        if (!SettingsTab.K().V && Utlis.a() >= this.dJ) {
            boolean var2 = false;
            this.aW = var2;
            if (Char.gI().aY.i > 200) {
                Char.gI();
            }

            Vector var3 = new Vector();
            Vector var4 = new Vector();
            Vector var5 = new Vector();

            Entity var6;
            int var7;
            for (int var8 = 0; var8 < this.dq.size(); ++var8) {
                var7 = Utlis.b((var6 = (Entity) this.dq.get(var8)).cx, Char.gI().cx);
                if (Utlis.b(var6.cy, Char.gI().cy) < 2) {
                    if (var7 < 100) {
                        var3.add(var6);
                    } else {
                        var4.add(var6);
                    }
                } else {
                    var5.add(var6);
                }
            }

            Vector var13 = new Vector();
            var7 = var3.size();

            int var9;
            for (var9 = 0; var9 < var7; ++var9) {
                var13.add(var3.remove(Utlis.a(var3.size())));
            }

            Collections.sort(var4, Entity.j);
            Collections.sort(var5, Entity.j);
            var13.addAll(var4);
            var13.addAll(var5);

            for (var9 = 0; var9 < var13.size(); ++var9) {
                var6 = (Entity) var13.elementAt(var9);
                if (!this.a((XYEntity) var6)) {
                    if (!var1) {
                        if (var6 instanceof Npc) {
                            continue;
                        }

                        if (var6 instanceof Char) {
                            Char var14;
                            if ((var14 = (Char) var6).U) {
                                this.focusEntity = null;
                                continue;
                            }

                            if (this.getMapTemplate().type == 6 || gI().getMapTemplate().type == 10 || gI().getMapTemplate().type == 7) {
                                boolean var16 = false;
                                if (var14.status == 4 || this.bq.b(var14.name)) {
                                    this.focusEntity = null;
                                    continue;
                                }

                                for (int var12 = 0; var12 < var14.ba.size(); ++var12) {
                                    if (((Effect) var14.ba.elementAt(var12)).id == 46) {
                                        this.focusEntity = null;
                                        var16 = true;
                                        break;
                                    }
                                }

                                if (var16) {
                                    continue;
                                }
                            }
                        } else if (var6 instanceof Mob) {
                            Mob var10 = (Mob) var6;
                            vdtt_ii var11 = this.T();
                            if (gI().mapID == 41 || var10.getMobTemplate().type == 11) {
                                continue;
                            }

                            if (var10.getMobTemplate().type == 10) {
                                if ((this.taskTuanHoan == null || this.taskTuanHoan.b != 2 || this.taskTuanHoan.f != var10.id) && (var11 == null || var11.a != 2 || var11.e != var10.id)) {
                                    continue;
                                }
                            } else if (SettingsTab.K().M() && var10.levelBoss == 3) {
                                continue;
                            }
                        }
                    }

                    int var15 = Utlis.b(var6.cx, var6.cy, Char.gI().cx, Char.gI().l());
                    if ((var6 instanceof Mob && ((Mob) var6).v() || var6 instanceof Char && this.a((Char) var6)) && !var6.isDie() && Char.gI().aY != null) {
                        this.focusEntity = var6;
                        return true;
                    }

                    if (var6 instanceof ItemMap && var15 < 50) {
                        this.focusEntity = var6;
                        return true;
                    }
                }
            }

            return false;
        } else {
            return false;
        }
    }

    public final void c() {
        if (this.D() && !this.cn) {
            if (this.o.a[5]) {
                if (Utlis.a() - this.dn < 200L) {
                    SettingsTab.R = true;
                    SettingsTab.K().a(true);
                    gI().focusEntity = null;
                } else {
                    this.dn = Utlis.a();
                    SettingsTab.R = false;
                    SettingsTab.K().a(false);
                    this.a(Char.gI().aY, false);
                    this.o.b();
                }
            } else {
                if (this.o.a[14]) {
                    this.an();
                }

                if (this.o.b[2]) {
                    ++this.eu;
                } else {
                    this.eu = 0;
                }

                vdtt_ed var1;
                if (this.eu > 20 && Char.gI().q() && gI().dd > 0) {
                    Char var2 = Char.gI();
                    var1 = null;
                    var2.pointMove = null;
                    Char.gI().aF = 2;
                }

                if (this.et == null) {
                    boolean var3 = false;
                    if (this.o.b[2]) {
                        Char.gI().Q();
                        this.cP = true;
                    } else if (this.o.b[8]) {
                        Char.gI().R();
                        this.cP = true;
                    } else if (this.o.b[4]) {
                        var3 = true;
                        Char.gI().M();
                        this.cP = true;
                    } else if (this.o.b[6]) {
                        var3 = true;
                        Char.gI().O();
                        this.cP = true;
                    } else if (this.cP) {
                        this.cP = false;
                    }

                    if (!var3 && Char.gI().q()) {
                        if (this.o.b[4]) {
                            Char.gI().M();
                            this.cP = true;
                        } else if (this.o.b[6]) {
                            Char.gI().O();
                            this.cP = true;
                        }
                    }
                } else {
                    vdtt_ed var4;
                    if (this.o.b[2]) {
                        var4 = var1 = this.et;
                        var4.m -= var1.k;
                        var1.n();
                        this.cP = true;
                    } else if (this.o.b[8]) {
                        var4 = var1 = this.et;
                        var4.m += var1.k;
                        var1.n();
                        this.cP = true;
                    } else if (this.o.b[4]) {
                        var4 = var1 = this.et;
                        var4.l -= var1.k;
                        var1.n();
                        this.cP = true;
                    } else if (this.o.b[6]) {
                        var4 = var1 = this.et;
                        var4.l += var1.k;
                        var1.n();
                        this.cP = true;
                    }
                }

                if (this.b.lastElement() instanceof GameSrc && Gdx.app.getType() == ApplicationType.Desktop) {
                    byte var5;
                    if (this.o.a[15]) {
                        var5 = 0;
                        this.b(var5, true);
                        return;
                    }

                    if (this.o.a[16]) {
                        var5 = 1;
                        this.b(var5, true);
                        return;
                    }

                    if (this.o.a[17]) {
                        var5 = 2;
                        this.b(var5, true);
                        return;
                    }

                    if (this.o.a[18]) {
                        var5 = 3;
                        this.b(var5, true);
                        return;
                    }

                    if (this.o.a[19]) {
                        var5 = 4;
                        this.b(var5, true);
                        return;
                    }

                    if (this.o.a[20]) {
                        var5 = 5;
                        this.b(var5, true);
                        return;
                    }

                    if (this.o.a[21]) {
                        this.an();
                        return;
                    }

                    if (this.o.a[22]) {
                        this.b(true);
                        return;
                    }

                    if (this.o.a[24]) {
                        N();
                        return;
                    }

                    if (this.o.a[23]) {
                        SettingsTab.K().a(!SettingsTab.K().V);
                    }
                }
            }
        } else if (this.p != null) {
            this.p.b = -1;
        }

    }

    public final void b(Graphics var1) {
        try {
            if (EntityPanel.B) {
                EntityPanel.B = false;
                Graphics.d();
            }

            if (AppListener.gI().f > 0) {
                --AppListener.gI().f;
                if (AppListener.gI().f == 0) {
                    DataCenter.gI().g();
                    return;
                }
            }

            GameSrc var2 = this;

            int var3;
            for (var3 = this.cu.size() - 1; var3 >= 0; --var3) {
                Binary.a((mImage) var2.cu.remove(var3));
            }

            if (var2.cr <= 0) {
                short var29 = 600;
                if (mConfig.gI().a(19)) {
                    var29 = 450;
                }

                if (vdtt_cz.e.size() > var29) {
                    vdtt_y.a(vdtt_cz.e);
                }

                if (vdtt_cz.g.size() > 750) {
                    vdtt_y.a(vdtt_cz.g);
                }
            } else {
                if (var2.cr == 2) {
                    vdtt_y.a(vdtt_cz.e);
                    vdtt_y.a(vdtt_cz.g);
                } else {
                    for (var3 = 0; var3 < DataCenter.gI().Y.size(); ++var3) {
                        mImage var4;
                        if ((var4 = (mImage) vdtt_cz.g.remove(DataCenter.gI().Y.get(var3))) != null) {
                            var4.a();
                        }
                    }
                }

                AppListener.e();
                vdtt_y.a(a);
                vdtt_cz.c();
                var2.cr = 0;
            }

            this.a(var1, 0, 0);
            if (this.aC != null) {
                this.aC.b(var1);
                if (Utlis.a() - this.timeLoadMap < 3000L) {
                    return;
                }

                this.aC = null;
            }

            if (this.D()) {
                this.aC = null;
            } else if (d) {
                return;
            }

            if (dQ != null) {
                Binary.b(dQ);
                dQ = null;
                this.K();
            }

            if (DataCenter.gI().o > this.maxY) {
                var1.f(-1);
                var1.c(0, 0, DataCenter.gI().n, DataCenter.gI().o - this.maxY);
            }

            if (this.bQ == 2) {
                var1.f(-7812062);
                var1.c(0, 0, this.width, this.height);
            }

            this.a(var1, -DataCenter.gI().i, -DataCenter.gI().j);
            int var5;
            int var30;
            if (Char.gI().h(76) != null) {
                var1.f(-1);
                var1.c(0, 0, this.maxX, this.maxY);
            } else {
                Entity var6;
                for (var30 = 0; var30 < this.do_.size(); ++var30) {
                    if ((var6 = (Entity) this.do_.elementAt(var30)) instanceof vdtt_es) {
                        vdtt_es var7 = (vdtt_es) var6;
                        if (!Utlis.e()) {
                            var7.paintTop(var1);
                        }
                    } else if (var6.h) {
                        var6.paintBottom(var1);
                    } else {
                        var6.paintTop(var1);
                    }
                }

                var6 = null;

                for (var5 = 0; var5 < this.do_.size(); ++var5) {
                    Entity var32;
                    if (!(var32 = (Entity) this.do_.elementAt(var5)).h) {
                        if (var32.equals(this.focusEntity)) {
                            var6 = var32;
                        } else {
                            var32.paintBottom(var1);
                        }
                    }
                }

                if (var6 != null) {
                    var6.paintBottom(var1);
                }
            }

            vdtt_fd.a(var1);
            if (gI().bQ == 0) {
                if (this.eo) {
                    var30 = var1.m();
                    var5 = var1.n();
                    this.a(var1, 0, 0);
                    var1.d((int) ((float) (System.currentTimeMillis() - this.ep) / 1000.0F / (float) (this.eq - this.er) * 100.0F));
                    var1.f(-16777216);
                    var1.c(0, 0, DataCenter.gI().n, DataCenter.gI().o);
                    var1.g();
                    this.a(var1, var30, var5);
                }

                int var31;
                if (!DataCenter.gI().aQ && this.bQ == 0 && this.aM != null) {
                    DataCenter.gI().aQ = true;
                    Binary.b(dP);
                    Pixmap var33;
                    (var33 = (dP = Binary.a(this.width * DataCenter.gI().r, this.height * DataCenter.gI().r)).e()).setColor(new Color(0.0F, 0.0F, 0.0F, 0.0F));
                    var33.fill();
                    mImage var8 = null;
                    var3 = Utlis.n(14);
                    SettingsTab.K();
                    int var9 = Utlis.n(16 + SettingsTab.C());
                    int var10 = DataCenter.gI().o - var9;
                    int var11 = DataCenter.gI().o - var9 / 2 - var3 / 2 - Utlis.n(1);
                    this.aM.setSize(36, (mConfig.gI().b(30) + 1) * 2 + 12);
                    if (this.aN != null) {
                        this.aN.setSize(36, (mConfig.gI().b(30) + 1) * 2 + 12);
                    }

                    this.aH.setXY(2 * this.aM.cx + Utlis.n(this.aM.width - AppListener.gI().l() / 2), this.dx.cy);
                    this.aG.setXY(DataCenter.gI().n - Utlis.n(this.aM.width + this.aM.cx), this.aG.cy);
                    this.aL.setXY(this.aG.cx - Utlis.n(this.aM.cx + this.aM.width - AppListener.gI().l() / 2), this.aL.cy);
                    if (DataCenter.k()) {
                        this.dx.setXY(this.aN.cx + Utlis.n(this.aM.width + 4), this.dx.cy);
                        if (DataCenter.m()) {
                            this.aG.setXY(this.aG.cx, this.dx.cy);
                            this.aL.setXY(this.aL.cx, this.dx.cy);
                        }

                        this.aS.setXY(this.dx.cx + Utlis.n(this.aM.width + 4), var11);
                        this.aS.setSize(this.aL.cx - this.dx.cx - this.dx.width - 8, var9);
                    } else {
                        this.dx.setXY(this.aH.cx + Utlis.n(this.aM.width + 4), this.dx.cy);
                        this.aS.setXY(this.aH.cx + Utlis.n(2 * this.aM.width) + this.aM.cx + 8, var11);
                        this.aS.setSize(this.aL.cx - this.aS.cx - 8, var9);
                        this.dx.setXY(this.dx.cx, var11);
                        this.aG.setXY(this.aG.cx, var11);
                        this.aL.setXY(this.aL.cx, var11);
                    }

                    vdtt_ba var12;
                    (var12 = this.aS).I = new vdtt_hp((byte) 1, 0, 0, var12.width, var12.height, var12.L, var12.n.size());
                    this.aM.setXY(this.aM.cx, var11);
                    this.aH.setXY(this.aH.cx, var11);
                    this.aH.setSize(this.aM.width, this.aM.height);
                    this.dx.setSize(this.aM.width, this.aM.height);
                    this.aG.setSize(this.aM.width, this.aM.height);
                    this.aL.setSize(this.aM.width, this.aM.height);
                    DataCenter.n();
                    var9 = var10 - Utlis.n(1);
                    if (!DataCenter.k()) {
                        EntityPanel var13;
                        (var13 = new EntityPanel()).setSize(DataCenter.gI().n, this.aS.height + 2);
                        var33.setColor(Utlis.b(-1274473710L));
                        var33.setBlending(Blending.SourceOver);
                        var33.fillRectangle(0 * DataCenter.gI().r, var9 * DataCenter.gI().r, var13.width * DataCenter.gI().r, var13.height * DataCenter.gI().r);
                        var9 = this.aM.cy + Utlis.n(1);
                        var8 = vdtt_cz.c(82);
                        vdtt_y.b(var33, var8, 0, 0, this.aM.width * DataCenter.gI().r, 14 * DataCenter.gI().r, this.aM.cx * DataCenter.gI().r, var9 * DataCenter.gI().r, Utlis.n(36) * DataCenter.gI().r, Utlis.n(14) * DataCenter.gI().r, Blending.SourceOver);
                        vdtt_y.b(var33, var8, 0, 0, this.aH.width * DataCenter.gI().r, var3 * DataCenter.gI().r, this.aH.cx * DataCenter.gI().r, var9 * DataCenter.gI().r, Utlis.n(36) * DataCenter.gI().r, Utlis.n(14) * DataCenter.gI().r, Blending.SourceOver);
                    }

                    short var38;
                    if (!DataCenter.m()) {
                        var9 = this.aM.cy + Utlis.n(1);
                        var8 = vdtt_cz.c(73);
                        vdtt_y.b(var33, var8, 0, 0, this.dx.width * DataCenter.gI().r, var3 * DataCenter.gI().r, this.dx.cx * DataCenter.gI().r, var9 * DataCenter.gI().r, Utlis.n(36) * DataCenter.gI().r, Utlis.n(14) * DataCenter.gI().r, Blending.SourceOver);
                        var8 = vdtt_cz.c(82);
                        vdtt_y.b(var33, var8, 0, 0, this.aL.width * DataCenter.gI().r, var3 * DataCenter.gI().r, this.aL.cx * DataCenter.gI().r, var9 * DataCenter.gI().r, Utlis.n(36) * DataCenter.gI().r, Utlis.n(14) * DataCenter.gI().r, Blending.SourceOver);
                        var38 = this.aG.cx;
                        var9 = this.aG.cy + 1;
                        SettingsTab.K().z();
                        var8 = vdtt_cz.c(82);
                        vdtt_y.b(var33, var8, 0, 0, this.aG.width * DataCenter.gI().r, var3 * DataCenter.gI().r, var38 * DataCenter.gI().r, var9 * DataCenter.gI().r, Utlis.n(36) * DataCenter.gI().r, Utlis.n(14) * DataCenter.gI().r, Blending.SourceOver);
                    }

                    if (this.aK != null) {
                        DataCenter.n();
                        vdtt_y.b(var33, var8, 0, 0, 29 * DataCenter.gI().r, 29 * DataCenter.gI().r, (this.aK.cx - Utlis.n(2)) * DataCenter.gI().r, (this.aK.cy - Utlis.n(2)) * DataCenter.gI().r, (this.aK.width + Utlis.n(4)) * DataCenter.gI().r, (this.aK.height + Utlis.n(4)) * DataCenter.gI().r, Blending.SourceOver);
                    }

                    DataCenter.n();
                    var8 = vdtt_cz.c(81);
                    vdtt_y.b(var33, var8, 0, 0, 25 * DataCenter.gI().r, 25 * DataCenter.gI().r, this.aJ.cx * DataCenter.gI().r, this.aJ.cy * DataCenter.gI().r, this.aJ.width * DataCenter.gI().r, this.aJ.height * DataCenter.gI().r, Blending.SourceOver);
                    DataCenter.n();
                    vdtt_y.b(var33, var8, 0, 0, 25 * DataCenter.gI().r, 25 * DataCenter.gI().r, this.aI.cx * DataCenter.gI().r, this.aI.cy * DataCenter.gI().r, this.aI.width * DataCenter.gI().r, this.aI.height * DataCenter.gI().r, Blending.SourceOver);
                    if (this.aK != null) {
                        vdtt_y.b(var33, var8, 0, 0, 25 * DataCenter.gI().r, 25 * DataCenter.gI().r, this.aK.cx * DataCenter.gI().r, this.aK.cy * DataCenter.gI().r, this.aK.width * DataCenter.gI().r, this.aK.height * DataCenter.gI().r, Blending.SourceOver);
                        var10 = this.aK.cx + this.aK.width / 2;
                        var9 = this.aK.cy + this.aK.height / 2;
                        var8 = vdtt_cz.c(672);
                        vdtt_y.a(var33, var8, var10 * DataCenter.gI().r - var8.f() / 2, var9 * DataCenter.gI().r - var8.g() / 2, Blending.SourceOver);
                    }

                    var10 = this.aJ.cx + this.aJ.width / 2;
                    var9 = this.aJ.cy + this.aJ.height / 2;
                    var8 = vdtt_cz.c(604);
                    vdtt_y.a(var33, var8, var10 * DataCenter.gI().r - var8.f() / 2, var9 * DataCenter.gI().r - var8.g() / 2, Blending.SourceOver);
                    DataCenter.n();
                    var10 = this.aO.cx + this.aO.width / 2;
                    var9 = this.aO.cy + this.aO.height / 2;
                    if (mConfig.gI().d()) {
                        var8 = vdtt_cz.c(256);
                        vdtt_y.a(dP, var8, var10 * DataCenter.gI().r, var9 * DataCenter.gI().r, Utlis.n(100), 3);
                    } else {
                        var8 = vdtt_cz.c(81);
                        vdtt_y.b(var33, var8, 0, 0, 25 * DataCenter.gI().r, 25 * DataCenter.gI().r, this.aO.cx * DataCenter.gI().r, this.aO.cy * DataCenter.gI().r, this.aO.width * DataCenter.gI().r, this.aO.height * DataCenter.gI().r, Blending.SourceOver);
                    }

                    var8 = vdtt_cz.c(this.aO.H);
                    if (mConfig.gI().d()) {
                        vdtt_y.a(dP, var8, var10 * DataCenter.gI().r, var9 * DataCenter.gI().r, Utlis.n(80), 3);
                    } else {
                        vdtt_y.a(var33, var8, var10 * DataCenter.gI().r - var8.f() / 2, var9 * DataCenter.gI().r - var8.g() / 2, Blending.SourceOver);
                    }

                    if (!this.dz.d) {
                        var10 = this.dz.cx + this.dz.width / 2;
                        var9 = this.dz.cy + this.dz.height / 2;
                        if (mConfig.gI().d()) {
                            var8 = vdtt_cz.c(256);
                            vdtt_y.a(dP, var8, var10 * DataCenter.gI().r, var9 * DataCenter.gI().r, Utlis.n(100), 3);
                        } else {
                            var8 = vdtt_cz.c(81);
                            vdtt_y.b(var33, var8, 0, 0, 25 * DataCenter.gI().r, 25 * DataCenter.gI().r, this.dz.cx * DataCenter.gI().r, this.dz.cy * DataCenter.gI().r, this.aO.width * DataCenter.gI().r, this.aO.height * DataCenter.gI().r, Blending.SourceOver);
                        }

                        var8 = vdtt_cz.c(this.dz.H);
                        if (mConfig.gI().d()) {
                            vdtt_y.a(dP, var8, var10 * DataCenter.gI().r, var9 * DataCenter.gI().r, Utlis.n(80), 3);
                        } else {
                            vdtt_y.a(var33, var8, var10 * DataCenter.gI().r - var8.f() / 2, var9 * DataCenter.gI().r - var8.g() / 2, Blending.SourceOver);
                        }
                    }

                    var10 = this.aI.cx + this.aI.width / 2;
                    var9 = this.aI.cy + this.aI.height / 2;
                    if (this.bY >= 0 && this.bY < DataCenter.gI().itemTemplate.length) {
                        try {
                            var8 = Binary.i("client_icon_" + DataCenter.gI().itemTemplate[this.bY].idIcon);
                            vdtt_y.a(var33, var8, var10 * DataCenter.gI().r - var8.f() / 2, var9 * DataCenter.gI().r - var8.g() / 2, Blending.SourceOver);
                            var8.a();
                        } catch (Exception var25) {
                        }
                    }

                    vdtt_ay var14;
                    if (this.aP != null) {
                        var8 = vdtt_cz.c((var14 = this.aP).H);
                        vdtt_y.b(var33, var8, 0, 0, 29 * DataCenter.gI().r, 29 * DataCenter.gI().r, var14.cx * DataCenter.gI().r, var14.cy * DataCenter.gI().r, var14.width * DataCenter.gI().r, var14.height * DataCenter.gI().r, Blending.SourceOver);
                        var8 = vdtt_cz.c(647);
                        vdtt_y.b(var33, var8, 0, 0, 25 * DataCenter.gI().r, 25 * DataCenter.gI().r, var14.cx * DataCenter.gI().r, var14.cy * DataCenter.gI().r, var14.width * DataCenter.gI().r, var14.height * DataCenter.gI().r, Blending.SourceOver);
                    }

                    short[] var15 = this.B();
                    var9 = 0;
                    if (this.dt != null && this.dt.c() != null) {
                        try {
                            for (var11 = 0; var11 < this.dt.c().size(); ++var11) {
                                short var16 = 460;

                                try {
                                    if (var11 < gI().bm.size()) {
                                        Skill var17 = null;

                                        for (var5 = 0; var5 < this.af.length; ++var5) {
                                            if ((var17 = this.af[var5]).d == var15[var9]) {
                                                ++var9;
                                                break;
                                            }
                                        }

                                        var16 = var17.a(Char.gI());
                                        if (var17.d == 30) {
                                            var14 = (vdtt_ay) this.dt.c().get(var11);
                                            DataCenter.n();
                                            var8 = vdtt_cz.c(100);
                                            vdtt_y.b(var33, var8, 0, 0, 50 * DataCenter.gI().r, 50 * DataCenter.gI().r, var14.cx * DataCenter.gI().r, var14.cy * DataCenter.gI().r, var14.width * DataCenter.gI().r, var14.height * DataCenter.gI().r, Blending.SourceOver);
                                            continue;
                                        }
                                    }

                                    if ((var14 = (vdtt_ay) this.dt.c().get(var11)).equals(this.aP)) {
                                        DataCenter.n();
                                    }

                                    if (!mConfig.gI().d() && !var14.equals(this.aP)) {
                                        var8 = vdtt_cz.c(646);
                                        vdtt_y.b(var33, var8, 0, 0, 29 * DataCenter.gI().r, 29 * DataCenter.gI().r, var14.cx * DataCenter.gI().r, var14.cy * DataCenter.gI().r, var14.width * DataCenter.gI().r, var14.height * DataCenter.gI().r, Blending.SourceOver);
                                        var8 = vdtt_cz.c(var16);
                                        vdtt_y.b(var33, var8, 0, 0, 25 * DataCenter.gI().r, 25 * DataCenter.gI().r, var14.cx * DataCenter.gI().r, var14.cy * DataCenter.gI().r, var14.width * DataCenter.gI().r, var14.height * DataCenter.gI().r, Blending.SourceOver);
                                    } else {
                                        var8 = vdtt_cz.c(var16);
                                        vdtt_y.b(var33, var8, 0, 0, 29 * DataCenter.gI().r, 29 * DataCenter.gI().r, var14.cx * DataCenter.gI().r, var14.cy * DataCenter.gI().r, var14.width * DataCenter.gI().r, var14.height * DataCenter.gI().r, Blending.SourceOver);
                                        var8 = vdtt_cz.c(647);
                                        vdtt_y.b(var33, var8, 0, 0, 25 * DataCenter.gI().r, 25 * DataCenter.gI().r, var14.cx * DataCenter.gI().r, var14.cy * DataCenter.gI().r, var14.width * DataCenter.gI().r, var14.height * DataCenter.gI().r, Blending.SourceOver);
                                    }
                                } catch (Exception var26) {
                                    Utlis.a(var26);
                                }
                            }

                            var11 = this.dt.c().size();
                            DataCenter.n();
                            if (var11 > 1 && var11 < 7 && mConfig.gI().d()) {
                                var9 = 7 - var11;

                                for (var3 = 0; var3 < var9; ++var3) {
                                    DataCenter.n();
                                    var8 = vdtt_cz.c(81);
                                    vdtt_y.b(var33, var8, 0, 0, var8.f(), var8.g(), this.ex[var11 - 1 + var3][0] * DataCenter.gI().r, (this.ex[var11 - 1 + var3][1] + 0) * DataCenter.gI().r, Utlis.n(25) * DataCenter.gI().r, Utlis.n(25) * DataCenter.gI().r, Blending.SourceOver);
                                }
                            }
                        } catch (Exception var27) {
                            Utlis.a(var27);
                        }
                    }

                    byte var40 = 0;
                    if (mConfig.gI().b() && DataCenter.gI().r == 3) {
                        var40 = 2;
                    }

                    DataCenter.n();
                    var8 = vdtt_cz.c(28);
                    vdtt_y.b(var33, var8, 0, 0, 99 * DataCenter.gI().r, 29 * DataCenter.gI().r, Utlis.n(AppListener.gI().l() / 2) * DataCenter.gI().r + 0, 0 * DataCenter.gI().r, Utlis.n(99) * DataCenter.gI().r - var40, Utlis.n(29) * DataCenter.gI().r - var40, Blending.SourceOver);
                    DataCenter.n();
                    var8 = vdtt_cz.c(Char.gI().ag());
                    vdtt_y.b(var33, var8, 0, 0, 20 * DataCenter.gI().r, 20 * DataCenter.gI().r, Utlis.n(75 + AppListener.gI().l() / 2) * DataCenter.gI().r, Utlis.n(4) * DataCenter.gI().r, Utlis.n(20) * DataCenter.gI().r, Utlis.n(20) * DataCenter.gI().r, Blending.SourceOver);
                    if (!this.dY.d) {
                        var8 = vdtt_cz.c(vdtt_ay.f());
                        switch (vdtt_ay.f()) {
                            case 722:
                                var3 = Utlis.n(9);
                                var9 = Utlis.n(9);
                                break;
                            case 723:
                                var3 = Utlis.n(11);
                                var9 = Utlis.n(8);
                                break;
                            case 724:
                                var3 = Utlis.n(10);
                                var9 = Utlis.n(9);
                                break;
                            default:
                                var3 = Utlis.n(10);
                                var9 = Utlis.n(10);
                        }

                        vdtt_y.a(var33, var8, 0, 0, var3 * DataCenter.gI().r, var9 * DataCenter.gI().r, (this.dY.cx + Utlis.n(4)) * DataCenter.gI().r, (this.dY.cy + Utlis.n(3)) * DataCenter.gI().r, var3 * DataCenter.gI().r, var9 * DataCenter.gI().r, Blending.SourceOver);
                    }

                    var3 = Utlis.n(86);
                    var9 = Utlis.n(16);
                    var10 = DataCenter.gI().n - var3;
                    EntityPanel var41;
                    (var41 = new EntityPanel()).setSize(var3 + Utlis.n(6), var9 + Utlis.n(6));
                    short var18;
                    if (!DataCenter.k()) {
                        var31 = 0 - Utlis.n(4);
                        var5 = -16777216;
                        boolean var19 = false;
                        var5 = var31 + 0;
                        var33.setColor(Utlis.b(-16777216L));
                        var33.setBlending(Blending.SourceOver);
                        var33.fillRectangle((var10 + 1) * DataCenter.gI().r, (var5 + 1) * DataCenter.gI().r, (var41.width - 2) * DataCenter.gI().r, (var41.height + 0 - 2) * DataCenter.gI().r);
                        mImage var20;
                        int var21 = (var20 = vdtt_cz.c(3)).f() / DataCenter.gI().r;
                        vdtt_y.a(var33, var20, var10 * DataCenter.gI().r, var5 * DataCenter.gI().r, Blending.SourceOver);
                        mImage var22 = mImage.b(var20, 0, 0, var20.f(), var20.g(), -360);
                        vdtt_y.a(var33, var22, (var10 + var41.width - var21) * DataCenter.gI().r, var5 * DataCenter.gI().r, Blending.SourceOver);
                        var22.a();
                        var22 = mImage.b(var20, 0, 0, var20.f(), var20.g(), -180);
                        vdtt_y.a(var33, var22, var10 * DataCenter.gI().r, (var5 + var41.height + 0 - var21) * DataCenter.gI().r, Blending.SourceOver);
                        var22.a();
                        var22 = mImage.b(var20, 0, 0, var20.f(), var20.g(), -270);
                        vdtt_y.a(var33, var22, (var10 + var41.width - var21) * DataCenter.gI().r, (var5 + var41.height + 0 - var21) * DataCenter.gI().r, Blending.SourceOver);
                        var22.a();
                        var20 = vdtt_cz.c(4);
                        vdtt_y.a(var33, var20.e(), (var10 + var21) * DataCenter.gI().r, var5 * DataCenter.gI().r, (var41.width - var21 * 2) * DataCenter.gI().r, 0, Blending.SourceOver);
                        var22 = mImage.b(var20, 0, 0, var20.f(), var20.g(), 180);
                        vdtt_y.a(var33, var22.e(), (var10 + var21) * DataCenter.gI().r, (var5 + var41.height + 0 - var20.f() / DataCenter.gI().r) * DataCenter.gI().r, (var41.width - var21 * 2) * DataCenter.gI().r, 0, Blending.SourceOver);
                        var22.a();
                        var22 = mImage.b(var20, 0, 0, var20.f(), var20.g(), 270);
                        vdtt_y.a(var33, var22.e(), var10 * DataCenter.gI().r, (var5 + var21) * DataCenter.gI().r, 0, (var41.height + 0 - var21 * 2) * DataCenter.gI().r, Blending.SourceOver);
                        var22.a();
                        var22 = mImage.b(var20, 0, 0, var20.f(), var20.g(), 90);
                        vdtt_y.a(var33, var22.e(), (var10 + var41.width - var20.f() / DataCenter.gI().r) * DataCenter.gI().r, (var5 + var21) * DataCenter.gI().r, 0, (var41.height + 0 - var21 * 2) * DataCenter.gI().r, Blending.SourceOver);
                        var22.a();
                        var8 = vdtt_cz.c(643);
                        vdtt_y.a(var33, var8, (var10 + Utlis.n(2)) * DataCenter.gI().r, 0 * DataCenter.gI().r, 0, 0, Utlis.n(84) * DataCenter.gI().r, var9 * DataCenter.gI().r, Blending.SourceOver);
                        var8 = vdtt_cz.c(715);
                        mImage var23;
                        if (this.aB.d()) {
                            var23 = mImage.b(var8, 0, 0, var8.f(), var8.g(), 90);
                        } else {
                            var23 = mImage.b(var8, 0, 0, var8.f(), var8.g(), 270);
                        }

                        vdtt_y.b(var33, var23, 0, 0, 14 * DataCenter.gI().r, 14 * DataCenter.gI().r, this.cQ.cx * DataCenter.gI().r, this.cQ.cy * DataCenter.gI().r, Utlis.n(14) * DataCenter.gI().r, Utlis.n(14) * DataCenter.gI().r, Blending.SourceOver);
                        if (this.cR != null && gI().V()) {
                            var8 = vdtt_cz.c(this.cR.H);
                            vdtt_y.a(var33, var8, 0, 0, 18 * DataCenter.gI().r, 18 * DataCenter.gI().r, this.cR.cx * DataCenter.gI().r, this.cR.cy * DataCenter.gI().r, this.cR.width * DataCenter.gI().r, this.cR.height * DataCenter.gI().r, Blending.SourceOver);
                        }

                        if (this.cS != null) {
                            var8 = vdtt_cz.c(this.cS.H);
                            vdtt_y.b(var33, var8, 0, 0, 18 * DataCenter.gI().r, 18 * DataCenter.gI().r, this.cS.cx * DataCenter.gI().r, this.cS.cy * DataCenter.gI().r, Utlis.n(18) * DataCenter.gI().r, Utlis.n(18) * DataCenter.gI().r, Blending.SourceOver);
                        }

                        DataCenter.n();
                        var38 = this.dA.cx;
                        var18 = this.dA.cy;
                        var8 = vdtt_cz.c(715);
                        if (this.aA.d()) {
                            vdtt_y.b(var33, var8, 0, 0, 14 * DataCenter.gI().r, 14 * DataCenter.gI().r, var38 * DataCenter.gI().r, var18 * DataCenter.gI().r, 14 * DataCenter.gI().r, 14 * DataCenter.gI().r, Blending.SourceOver);
                        } else {
                            var23 = mImage.b(var8, 0, 0, var8.f(), var8.g(), 180);
                            vdtt_y.b(var33, var23, 0, 0, 14 * DataCenter.gI().r, 14 * DataCenter.gI().r, var38 * DataCenter.gI().r, var18 * DataCenter.gI().r, 14 * DataCenter.gI().r, 14 * DataCenter.gI().r, Blending.SourceOver);
                        }
                    }

                    if (mConfig.gI().b(12) == 0) {
                        var8 = vdtt_cz.c(20);
                        vdtt_y.a(var33, var8, 0, 0, 60 * DataCenter.gI().r, 60 * DataCenter.gI().r, this.aE.cx * DataCenter.gI().r, this.aE.cy * DataCenter.gI().r, this.aE.width * DataCenter.gI().r, this.aE.height * DataCenter.gI().r, Blending.SourceOver);
                    }

                    if (this.aA.d() && !this.aA.e()) {
                        var38 = this.aT.cx;
                        var18 = this.aT.cy;
                        if (vdtt_bu.H == null || this.cI != 0 && this.cI != 1) {
                            if (vdtt_bv.l != null && this.cI == 2) {
                                vdtt_y.a(var33, vdtt_bv.l.e(), var38 * DataCenter.gI().r, var18 * DataCenter.gI().r, vdtt_bv.l.f(), vdtt_bv.l.g(), Blending.SourceOver);
                            }
                        } else {
                            vdtt_y.a(var33, vdtt_bu.H.e(), var38 * DataCenter.gI().r, var18 * DataCenter.gI().r, vdtt_bu.H.f(), vdtt_bu.H.g(), Blending.SourceOver);
                        }
                    }

                    vdtt_cz.a();
                    Binary.a(dP);
                }

                if (this.b.size() > 0 && this.b.lastElement().equals(this) || this.b.size() == 2 && this.b.lastElement() instanceof vdtt_v) {
                    var30 = var1.m();
                    var5 = var1.n();
                    this.a(var1, 0, 0);
                    var1.a(dP, 0, 0);
                    String var34;
                    vdtt_dd var39;
                    int var42;
                    if (EntityPanel.z) {
                        var39 = vdtt_dd.e;
                        var34 = Caption.uM;
                        var31 = DataCenter.gI().n / 2;
                        var42 = DataCenter.gI().o;
                        SettingsTab.K();
                        vdtt_dd.a(var39, var1, var34, var31, var42 - Utlis.n(60 + SettingsTab.C()), 2, -2560, 2, 1);
                    } else if (!this.ac() && !Char.gI().ah()) {
                        if (this.cz) {
                            var39 = vdtt_dd.d;
                            var34 = Caption.pf;
                            var31 = DataCenter.gI().n / 2;
                            var42 = DataCenter.gI().o;
                            SettingsTab.K();
                            vdtt_dd.a(var39, var1, var34, var31, var42 - Utlis.n(60 + SettingsTab.C()), 2, -32576, 4, 1);
                        } else if (!DataCenter.k()) {
                            if (Char.gI().F()) {
                                var39 = vdtt_dd.d;
                                var34 = Caption.U;
                                var31 = DataCenter.gI().n / 2;
                                var42 = DataCenter.gI().o;
                                SettingsTab.K();
                                vdtt_dd.a(var39, var1, var34, var31, var42 - Utlis.n(60 + SettingsTab.C()), 2, -16711681, 4, 1);
                            } else if (SettingsTab.K().z()) {
                                var39 = vdtt_dd.d;
                                var34 = Caption.T;
                                var31 = DataCenter.gI().n / 2;
                                var42 = DataCenter.gI().o;
                                SettingsTab.K();
                                vdtt_dd.a(var39, var1, var34, var31, var42 - Utlis.n(60 + SettingsTab.C()), 2, -16711808, 4, 1);
                            }
                        }
                    }

                    Graphics var35 = var1;
                    var2 = this;

                    try {
                        String var36 = Caption.tU + Char.gI().A();
                        short var37;
                        if (Char.gI().bT != null) {
                            var36 = var36 + vdtt_em.a() + Caption.wW + Utlis.c(Char.gI().y());
                            var39 = vdtt_dd.b;
                            var37 = var2.height;
                            SettingsTab.K();
                            vdtt_dd.c(var39, var35, var36, 5, var37 - Utlis.n(21 + SettingsTab.C()), 0, -2560, -10275328);
                        } else {
                            DataCenter.n();
                            var39 = vdtt_dd.b;
                            var37 = var2.height;
                            SettingsTab.K();
                            vdtt_dd.b(var39, var35, var36, 5, var37 - Utlis.n(21 + SettingsTab.C()), 0, -2560, -10275328);
                        }
                    } catch (Exception var24) {
                        Utlis.a(var24);
                    }

                    this.a(var1, var30, var5);
                    this.ds.a(var1);
                    this.az.a(var1);
                    DataCenter.gI();
                    DataCenter.n();
                    this.aA.a(var1);
                    this.dt.a(var1);
                    this.dv.a(var1);
                    if (!DataCenter.k()) {
                        this.aB.a(var1);
                    }

                    this.du.a(var1);
                }
            }
        } catch (Exception var28) {
            Utlis.a(var28);
        }

    }

    public final Vector g() {
        Vector var1 = new Vector();

        try {
            DataCenter.n();
            var1.addElement(new vdtt_hi(1001, Utlis.n(AppListener.gI().m / 2), 0, Utlis.n(99 + AppListener.gI().m / 2), Utlis.n(29), (vdtt_hp) null, this));
            int var2;
            if (this.focusEntity != null && !(this.focusEntity instanceof ItemMap) && (!(this.focusEntity instanceof Mob) || !((Mob) this.focusEntity).w()) && (!(this.focusEntity instanceof Npc) || !((Npc) this.focusEntity).s())) {
                var2 = DataCenter.gI().n - Utlis.n(186);
                if (DataCenter.k()) {
                    var2 = DataCenter.gI().n - Utlis.n(99);
                }

                var1.addElement(new vdtt_hi(1002, var2, 0, var2 + Utlis.n(100), 0 + Utlis.n(28), (vdtt_hp) null, this));
            }

            int var3;
            for (var3 = 0; var3 < Char.gI().ba.size(); ++var3) {
                Effect var4;
                if ((var4 = (Effect) Char.gI().ba.elementAt(var3)).id != 131) {
                    var1.addElement(new vdtt_hi(6000 + var3, Utlis.n(var4.cx - 2 + AppListener.gI().m / 2), Utlis.n(var4.cy - 2), Utlis.n(var4.cx + AppListener.gI().m / 2) + 15, Utlis.n(var4.cy) + 15, (vdtt_hp) null, this));
                }
            }

            if (!DataCenter.k()) {
                var3 = Utlis.n(84);
                var2 = DataCenter.gI().n - var3;
                var1.addElement(new vdtt_hi(9002, var2 - 2, 0, var2 + var3, 18, (vdtt_hp) null, this));
            }

            if (gI().getMapTemplate().type == 21 && this.bi != null) {
                var1.addElement(new vdtt_hi(9004, Utlis.n(101 + AppListener.gI().m / 2) + 3, 16, Utlis.n(101 + AppListener.gI().m / 2) + 3 + vdtt_dd.b(vdtt_dd.c, this.dF), 30, (vdtt_hp) null, this));
            }

            var1.addElement(new vdtt_hi(9000, 0, 0, DataCenter.gI().n, DataCenter.gI().o, (vdtt_hp) null, this));
        } catch (Exception var5) {
        }

        return var1;
    }

    public final void i(int var1) {
        this.cn = true;
        this.eg = var1;
    }

    public final void h(int var1, int var2) {
        if (!this.cn) {
            Char var3;
            vdtt_gj var4;
            if (var1 >= DataCenter.gI().n - 200) {
                this.cq = 2;
                if (Char.gI().typePk < 300) {
                    this.i(100);
                } else {
                    this.i(50);
                }

                var3 = Char.gI();
                var4 = new vdtt_gj((short) (gI().maxX + 20), Char.gI().cy, Char.gI().typePk);
                var3.pointMove = var4;
            } else if (var1 <= 200) {
                this.cq = 3;
                if (Char.gI().typePk < 300) {
                    this.i(100);
                } else {
                    this.i(50);
                }

                var3 = Char.gI();
                var4 = new vdtt_gj((short) -20, Char.gI().cy, Char.gI().typePk);
                var3.pointMove = var4;
            } else {
                Char.gI().W();
                this.al();
            }
        }

    }

    public final void a(int var1, int var2) {
        super.a(var1, var2);
        if (this.b.lastElement() instanceof vdtt_jy) {
            vdtt_jy var3 = (vdtt_jy) this.b.lastElement();
            var3.ay = Utlis.a(var3.width / 2 - var3.U.width / 2, 170 - var3.U.height, var3.width / 2 - var3.U.width / 2 + var3.U.width, 170, var1, var2);
        }

    }

    public final void b(int var1, int var2) {
        super.b(var1, var2);
        if (this.b.lastElement() instanceof vdtt_jy) {
            ((vdtt_jy) this.b.lastElement()).az = 0;
        }

    }

    public final void c(int var1, int var2) {
        super.c(var1, var2);
        if (this.b.lastElement() instanceof vdtt_jy) {
            vdtt_jy var3 = (vdtt_jy) this.b.lastElement();
            if (var3.ay) {
                if (var3.az == 0) {
                    var3.az = var1;
                    return;
                }

                if (Utlis.b(var1 - var3.az) > 10) {
                    var3.aB = (byte) (var3.az < var1 ? 2 : 3);
                }
            }
        }

    }

    public final void a(vdtt_hi var1, int var2, int var3) {
        if (this.D() && !this.cn) {
            this.f(false);
            int var4;
            Char var6;
            if (var1.b >= 2000 && var1.b < 6000) {
                try {
                    Message var16;
                    switch (var1.b) {
                        case 2003:
                            DataCenter.n();
                            SettingsTab.K().a(false);
                            if (this.mapID != 86) {
                                gI();
                                h(49);
                                gI().bx = gI().pointMoveMap;
                                gI();
                                q(86);
                                return;
                            }

                            gI();
                            h(49);
                            return;
                        case 2100:
                            vdtt_bu var18 = this.aT;
                            mConfig.gI().a(13, !mConfig.gI().a(13));
                            vdtt_aa.gI().n();
                            var18.d();
                            return;
                        case 2200:
                  try {
                            Message.c((byte) -18).send();
                            break;
                        } catch (Exception var13) {
                            return;
                        }
                        case 2890:
                            (var16 = Message.c((byte) -3)).writeUTF(H);
                            var16.send();
                            return;
                        case 2891:
                            (var16 = Message.c((byte) -4)).writeUTF(H);
                            var16.send();
                            return;
                        case 2985:
                            (var16 = Message.c((byte) -100)).writeUTF(H);
                            var16.send();
                            return;
                        case 2986:
                            (var16 = Message.c((byte) -102)).writeUTF(H);
                            var16.send();
                            return;
                        case 2987:
                            (var16 = Message.c((byte) -101)).writeUTF(H);
                            var16.send();
                            return;
                        case 2988:
                            (var16 = Message.c((byte) -103)).writeUTF(H);
                            var16.send();
                            return;
                        case 2989:
                            (var16 = new Message((byte) -90)).writeUTF(H);
                            var16.send();
                            return;
                        case 2990:
                            (var16 = new Message((byte) -91)).writeUTF(H);
                            var16.send();
                            return;
                        case 2991:
                            AppListener.gI();
                            AppListener.i();
                            return;
                        case 2992:
                            (var16 = new Message((byte) 30)).writeUTF(H);
                            var16.send();
                            return;
                        case 2993:
                            (var16 = new Message((byte) 31)).writeUTF(H);
                            var16.send();
                            return;
                        case 2994:
                            (var16 = new Message((byte) 40)).writeUTF(H);
                            var16.send();
                            return;
                        case 2995:
                            (var16 = new Message((byte) 41)).writeUTF(H);
                            var16.send();
                            return;
                        case 2996:
                            (var16 = new Message((byte) 38)).writeUTF(H);
                            var16.send();
                            return;
                        case 2997:
                            (var16 = new Message((byte) 39)).writeUTF(H);
                            var16.send();
                            return;
                        case 2998:
                            (new Message((byte) 85)).send();
                            return;
                        case 2999:
                            (new Message((byte) 84)).send();
                            return;
                        default:
                            if (this.ay()) {
                                return;
                            }

                            if (var1.k != null) {
                                this.focusEntity = (Entity) var1.k;
                                if (var1.k instanceof Char) {
                                    if (this.mapID != 41) {
                                        this.aw();
                                        return;
                                    }

                                    if ((var6 = (Char) var1.k).status == 4 || var6.status == 6 || this.bq.b(var6.name)) {
                                        this.focusEntity = null;
                                        return;
                                    }

                                    var6.bE = 5;
                                    this.aw();
                                } else {
                                    boolean var20;
                                    if (var1.k instanceof Npc) {
                                        SettingsTab.K().a(false);
                                        var20 = true;
                                        this.aW = var20;
                                        this.aX = true;
                                        this.g(false);
                                        return;
                                    }

                                    if (var1.k instanceof Mob && ((Mob) var1.k).v()) {
                                        if (SettingsTab.K().V && ((Mob) this.focusEntity).n()) {
                                            this.focusEntity = null;
                                            this.bp = null;
                                            return;
                                        }

                                        this.bp = null;
                                        var20 = true;
                                        this.aW = var20;
                                        this.aX = true;
                                        this.g(false);
                                        return;
                                    }

                                    if (var1.k instanceof ItemMap) {
                                        SettingsTab.K().a(false);
                                        var20 = true;
                                        this.aW = var20;
                                        this.aX = true;
                                        this.g(false);
                                        return;
                                    }

                                    if (var1.k instanceof WayPoint && !this.ca && Char.gI().status == 0) {
                                        WayPoint var22;
                                        if (Utlis.b((var22 = (WayPoint) var1.k).I, var22.J, Char.gI().cx, Char.gI().cy) > 80 && Utlis.b(var22.cx, var22.cy, Char.gI().cx, Char.gI().cy) > 80) {
                                            this.k(var22.cx, var22.cy);
                                            return;
                                        }

                                        var22.H = 5;
                                        this.h(var2, var3);
                                        return;
                                    }
                                }
                            }
                    }

                    return;
                } catch (Exception var14) {
                    Utlis.a(var14);
                }
            } else if (var1.b >= 6000 && var1.b < 7000) {
                var4 = var1.b - 6000;
                Effect var7 = (Effect) Char.gI().ba.elementAt(var4);
                vdtt_aa.gI().n();
                int var8 = var7.cx - 2;
                int var9 = var7.cy + 16;
                boolean var10 = true;
                vdtt_bi var12;
                if ((var12 = new vdtt_bi(var8, var9, this, var7)).cx > DataCenter.gI().n - var12.width - super.cx) {
                    var12.cx = (short) (DataCenter.gI().n - var12.width - super.cx);
                }

                if (var12.cx < var8 - 100) {
                    var12.cx = (short) (var8 - (var12.width + 200 + 3));
                }

                if (var12.cx < -super.cx) {
                    var12.cx = (short) (-super.cx);
                }

                if (var12.cy > DataCenter.gI().o - var12.height - super.cy) {
                    var12.cy = (short) (DataCenter.gI().o - var12.height - super.cy);
                }

                this.a((vdtt_k) var12);
                this.k = var12;
                return;
            }

            int var5;
            switch (var1.b) {
                case 1000:
                default:
                    break;
                case 1001:
                    if (DataCenter.m()) {
                        this.a((vdtt_w) (new vdtt_jy(this, Char.gI(), gI().af, 0)));
                    } else {
                        this.a((vdtt_w) (new vdtt_jy(this, Char.gI(), gI().af)));
                    }

                    vdtt_aa.gI().w();
                    break;
                case 1002:
                    this.pointMoveMap = null;
                    if (this.focusEntity == null) {
                        break;
                    }

                    vdtt_aa.gI().o();
                    if (this.focusEntity instanceof Npc) {
                        this.a((Skill) null, false);
                    } else {
                        if (!(this.focusEntity instanceof Char)) {
                            if (this.focusEntity instanceof Mob) {
                                var4 = DataCenter.gI().n - Utlis.n(186);
                                var5 = Utlis.n(29);
                                this.k = a(this, var4, var5, 200, (Mob) this.focusEntity);
                            }
                            break;
                        }

                        var6 = (Char) this.focusEntity;
                        Vector var15 = new Vector();
                        if (this.bq != null && !this.bq.isEmpty()) {
                            if (this.bq.isLeader() && !this.bq.isMember(var6.name)) {
                                var15.addElement(new vdtt_ir(50, Caption.ex));
                            }
                        } else {
                            var15.addElement(new vdtt_ir(50, Caption.cj));
                        }

                        var15.addElement(new vdtt_ir(54, Caption.bZ));
                        if (Char.gI().m == 0 && var6.m == 0 && Char.gI().aa == -1 && !var6.isCuuSat) {
                            var15.addElement(new vdtt_ir(52, Caption.hH));
                        }

                        if (Char.gI().m != 1 && Char.gI().aa == -1 && !var6.isCuuSat) {
                            var15.addElement(new vdtt_ir(58, Caption.hI));
                        }

                        if (Char.gI().giatoc == null && var6.giatoc != null && var6.giatoc.c >= 3) {
                            var15.addElement(new vdtt_ir(60, Caption.hJ));
                        }

                        if (Char.gI().giatoc != null && Char.gI().giatoc.c >= 3 && var6.giatoc == null) {
                            var15.addElement(new vdtt_ir(61, Caption.hK));
                        }

                        a((Vector) var15, (String) var6.name);
                        String[] var17 = new String[var15.size()];
                        int[] var19 = new int[var15.size()];

                        for (int var21 = 0; var21 < var15.size(); ++var21) {
                            vdtt_ir var11 = (vdtt_ir) var15.elementAt(var21);
                            var17[var21] = var11.b;
                            var19[var21] = var11.a;
                        }

                        this.a((vdtt_w) (new vdtt_lw(this, var6.name + Caption.me, var17, var19, var6)));
                    }
                    break;
                case 9000:
                    if (Gdx.app.getType() == ApplicationType.Desktop && !this.aQ.d && this.aQ.cx != -200 && this.aQ.cy != -200) {
                        this.aQ.setXY(-200, -200);
                        this.aQ.b(true);
                        break;
                    }

                    var4 = var2 + DataCenter.gI().i;
                    var5 = var3 + DataCenter.gI().j;
                    if (var4 < 16) {
                        var4 = 16;
                    }

                    if (var4 > this.maxX - 17) {
                        var4 = this.maxX - 17;
                    }

                    this.a(var4, var5, true);
                    break;
                case 9002:
                    this.a((vdtt_w) (new vdtt_lk(this)));
                    break;
                case 9004:
                    Char.gI().c(this.bi.cx, this.bi.cy);
            }

            this.o.b();
        }

    }

    public final void a(int var1, int var2, boolean var3) {
        if (!Char.gI().q() && !Char.gI().ah()) {
            int var4;
            boolean var5;
            for (var4 = 0; var4 < this.vNpc.size(); ++var4) {
                Npc var6;
                if (!(var6 = (Npc) this.vNpc.get(var4)).isDie() && Utlis.a(var6.minX(), var6.minY(), var6.maxX(), var6.maxY(), var1, var2)) {
                    this.focusEntity = var6;
                    var6.p = 5;
                    SettingsTab.K().a(false);
                    var5 = true;
                    this.aW = var5;
                    this.aX = true;
                    this.g(false);
                    return;
                }
            }

            for (var4 = this.do_.size() - 1; var4 >= 0; --var4) {
                Entity var8;
                if (!(var8 = (Entity) this.do_.elementAt(var4)).isDie() && !var8.equals(Char.gI()) && (var8 instanceof Char || var8 instanceof Npc || var8 instanceof Mob && ((Mob) var8).v() || var8 instanceof ItemMap || var8 instanceof WayPoint) && Utlis.a(var8.minX(), var8.minY(), var8.maxX(), var8.maxY(), var1, var2)) {
                    this.focusEntity = var8;
                    if (!(var8 instanceof Char)) {
                        if (var8 instanceof Npc) {
                            SettingsTab.K().a(false);
                            var5 = true;
                            this.aW = var5;
                            this.aX = true;
                            this.g(false);
                            return;
                        }

                        if (var8 instanceof Mob) {
                            if (SettingsTab.K().V && ((Mob) this.focusEntity).n()) {
                                this.focusEntity = null;
                                this.bp = null;
                                return;
                            }

                            this.bp = null;
                            var5 = true;
                            this.aW = var5;
                            this.aX = true;
                            this.g(false);
                            if (Char.gI().hp > 0) {
                                SettingsTab.K().a(true);
                                ((Mob) this.focusEntity).aB = 5;
                                return;
                            }

                            SettingsTab.K().a(false);
                            return;
                        }

                        if (var8 instanceof ItemMap) {
                            SettingsTab.K().a(false);
                            var5 = true;
                            this.aW = var5;
                            this.aX = true;
                            this.g(false);
                            return;
                        }

                        if (var8 instanceof WayPoint && !this.ca && Char.gI().status == 0) {
                            if (this.aa()) {
                                gI().a((vdtt_w) (new vdtt_kn(gI())));
                                return;
                            }

                            WayPoint var9;
                            if (Utlis.b((var9 = (WayPoint) var8).I, var9.J, Char.gI().cx, Char.gI().cy) > 80 && Utlis.b(var9.cx, var9.cy, Char.gI().cx, Char.gI().cy) > 80) {
                                this.k(var9.cx, var9.cy);
                                return;
                            }

                            var9.H = 5;
                            this.h(var1, var2);
                            vdtt_aa.gI().o();
                            return;
                        }

                        return;
                    }

                    Char var7;
                    if (!(var7 = (Char) var8).af()) {
                        if (this.mapID == 41) {
                            if (var7.status == 4 || var7.status == 6 || this.bq.b(var7.name)) {
                                this.focusEntity = null;
                                return;
                            }

                            var7.bE = 5;
                        }

                        this.aw();
                        return;
                    }

                    this.focusEntity = null;
                }
            }

            if (var3) {
                if (this.aa()) {
                    gI().a((vdtt_w) (new vdtt_kn(gI())));
                    return;
                }

                this.bo = vdtt_br.gI().b(var1, var2);
                this.bo.H = 0;
                if (gI().V.a(var1, var2)) {
                    this.bo.H = -80;
                } else {
                    this.k(var1, var2);
                }

                this.I();
            }
        }

    }

    private void aw() {
        this.bp = null;
        boolean var1 = true;
        this.aW = var1;
        this.aX = true;
        this.g(false);
        if (System.currentTimeMillis() - this.dE < 300L) {
            if (Char.gI().hp <= 0) {
                this.dE = Long.MIN_VALUE;
                SettingsTab.K().a(false);
                return;
            }

            SettingsTab.K().a(false);
            if (mConfig.gI().a(35)) {
                this.b(0, false);
            }

            SettingsTab.K().a(true);
        }

        this.dE = System.currentTimeMillis();
    }

    public final void I() {
        this.b((vdtt_k) this.aQ);
    }

    private void k(int var1, int var2) {
        if (this.et != null) {
            this.et.b(var1, var2);
        } else {
            if (Char.gI().J >= 30 && Char.gI().J <= 35) {
                Char.gI().bR = 5;
            }

            this.aE.j();
            SettingsTab.O();
            this.aX = false;
            this.pointMoveMap = null;
            SettingsTab.K().a(false);
            Char.gI().J();
            Char.gI().c(var1, var2);
            SettingsTab.K().a(false);
            this.cg = Char.gI().cx;
            this.ch = Char.gI().cy;
            this.ce = Utlis.a();
            this.bN = 1000;
            this.cB = false;
        }

    }

    public final void b(int var1, Object var2, vdtt_x var3) {
        if (this.D() && !this.cn) {
            if (var1 != 7000) {
                this.f(false);
            }

            if (var1 >= 1021 && var1 < 1029) {
                if (this.aa()) {
                    gI().a((vdtt_w) (new vdtt_kn(gI())));
                } else {
                    this.pointMoveMap = null;
                    var1 -= 1021;
                    this.b(var1, true);
                }
            } else if (!this.aa() || var1 != 1080 && var1 != 1081 && var1 != 1084 && var1 != 1085 && var1 != 1086 && var1 != 1087 && var1 != 1088 && var1 != 1037 && var1 != 1020) {
                String var4;
                int var7;
                switch (var1) {
                    case 1000:
                    case 1001:
                    case 1002:
                    case 1003:
                    case 1004:
                    case 1010:
                    case 1025:
                    case 1026:
                    case 1031:
                    case 1040:
                    case 1041:
                    case 1049:
                    default:
                        break;
                    case 1012:
                        this.E();
                        break;
                    case 1013:
                        this.a((vdtt_w) (new vdtt_lw(this, "", Caption.BZ, new int[]{805, 800, 801, 802, 803, 804}, true)));
                        break;
                    case 1020:
                        if (this.aa()) {
                            gI().a((vdtt_w) (new vdtt_kn(gI())));
                        } else {
                            if (SettingsTab.R) {
                                SettingsTab.R = false;
                            } else {
                                SettingsTab.K().a(false);
                            }

                            this.a(Char.gI().aY, false);
                        }
                        break;
                    case 1030:
                        mConfig.gI().a(5, this.du.c);
                        break;
                    case 1032:
                        this.a((vdtt_w) (new vdtt_lj(this)));
                        break;
                    case 1033:
                        o(88);
                        break;
                    case 1034:
                        o(6);
                        break;
                    case 1035:
                        this.a((vdtt_w) (new vdtt_ll(this)));
                        break;
                    case 1036:
                        this.ad();
                        break;
                    case 1037:
                        if (Char.gI().rank < 5) {
                            DataCenter.gI().currentScreen.c(Caption.uR, -1);
                        } else {
                            var4 = Caption.mJ.toLowerCase();
                            if (gI().di >= 0) {
                                var4 = Utlis.e((long) gI().di * 1000L);
                            }

                            String var13 = Utlis.b(Caption.oR, var4);
                            String[] var15 = Caption.Ap;
                            this.a((vdtt_w) (new vdtt_lw(this, var13, var15, new int[]{1, 201, 206})));
                        }
                        break;
                    case 1042:
                        this.a(this.aQ);
                        break;
                    case 1043:
                        if (Utlis.c() > gI().timeChatColor) {
                            this.c(Caption.sq, -1);
                        } else {
                            this.k = new vdtt_bj(var3.cx - 44, var3.cy - 88, 1044, this);
                            this.a((vdtt_k) this.k);
                        }
                        break;
                    case 1044:
                        this.aQ.d(var2.toString());
                        this.c(this.aQ);
                        break;
                    case 1045:
                        this.a((vdtt_w) (new vdtt_jz(1046, this)));
                        break;
                    case 1046:
                        Utlis.b("1046");
                        break;
                    case 1047:
                        this.c(this.aQ);
                        break;
                    case 1048:
                        Utlis.b("1048");
                        break;
                    case 1050:
                        if (this.aD == 0) {
                            this.u(1);
                        } else if (this.aD == 1) {
                            this.u(2);
                        } else if (this.aD == 2) {
                            this.u(0);
                            this.aT.d();
                        }

                        mConfig.gI().a(4, this.aD);
                        break;
                    case 1057:
                        gI();
                        o(6);
                        break;
                    case 1060:
                        this.ax();
                        break;
                    case 1061:
                        this.a((vdtt_w) (new vdtt_jy(this, Char.gI(), gI().af)));
                        break;
                    case 1062:
                        this.a((vdtt_w) (new vdtt_lf(this, 0)));
                        break;
                    case 1063:
                        o(111);
                        break;
                    case 1064:
                        if (this.getMapTemplate().type == 6) {
                            this.a((vdtt_w) (new vdtt_jj(this)));
                        } else {
                            this.a((vdtt_w) (new vdtt_ms(this)));
                        }
                        break;
                    case 1065:
                        this.a((vdtt_w) (new vdtt_mn(this)));
                        break;
                    case 1067:
                        gI();
                        o(86);
                        break;
                    case 1068:
                        String[] var5 = Caption.zA;
                        if (!DataCenter.aj) {
                            this.a((vdtt_w) (new vdtt_lw(this, "", var5, new int[]{903, 900, 901, 905, 902})));
                            break;
                        }

                        var5 = new String[Caption.zA.length - 1];
                        int var14 = 0;
                        var7 = 0;

                        for (; var7 < Caption.zA.length; ++var7) {
                            if (var7 != 2) {
                                var5[var14] = Caption.zA[var7];
                                ++var14;
                            }
                        }

                        this.a((vdtt_w) (new vdtt_lw(this, "", var5, new int[]{903, 900, 901, 905, 902})));
                        break;
                    case 1069:
                        o(54);
                        break;
                    case 1070:
                        Char.gI().idCharSys = Byte.valueOf(var2.toString());
                        break;
                    case 1080:
                    case 1081:
                        this.b(true);
                        break;
                    case 1082:
                        this.an();
                        break;
                    case 1083:
                        vdtt_by var6;
                        int var8;
                        if (mConfig.gI().b(9) == 0) {
                            this.aQ.a("");
                            this.aQ.b(false);
                            var6 = this.aQ;
                            var7 = DataCenter.gI().n / 2 - this.aQ.width / 2;
                            var8 = DataCenter.gI().o;
                            SettingsTab.K();
                            var6.setXY(var7, var8 - Utlis.n(127 + SettingsTab.C()));
                        } else if (mConfig.gI().b(9) == 2) {
                            this.aQ.a("");
                            this.aQ.b(false);
                            var6 = this.aQ;
                            var7 = DataCenter.gI().n / 2 - this.aQ.width / 2;
                            var8 = DataCenter.gI().o;
                            SettingsTab.K();
                            var6.setXY(var7, var8 - Utlis.n(75 + SettingsTab.C()));
                            boolean var17 = true;
                            this.aQ.b = var17;
                            this.a((vdtt_k) this.aQ);
                        }

                        vdtt_y.a(this.aQ, this.aQ.i(), Caption.hk, this.aQ.l, this.aQ.m, false);
                        break;
                    case 1084:
                        if (Char.gI().F() && Item.d(this.bY)) {
                            a(gI().pointMoveMap);
                        } else {
                            Item var16;
                            if ((var16 = Char.gI().e(this.bY)) != null) {
                                this.a(var16);
                            }
                        }
                        break;
                    case 1085:
                        SettingsTab.K().a(!SettingsTab.K().V);
                        break;
                    case 1086:
                        this.ae();
                        break;
                    case 1100:
                        this.d(!this.aB.d());
                        DataCenter.gI().aQ = false;
                        break;
                    case 1101:
                        if (!DataCenter.k()) {
                            this.dB.b(false);
                            this.dw.b(false);
                        }

                        this.e(!this.aA.d());
                        DataCenter.gI().aQ = false;
                        break;
                    case 1102:
                        if (this.dB.b) {
                            gI();
                            o(72);
                        }

                        this.r(0);
                        break;
                    case 1103:
                        this.a(Caption.tY, 2200, this);
                        break;
                    case 1104:
                        AppListener var9 = AppListener.gI();

                        try {
                            var4 = vdtt_y.a(String.format("screenshot_%d.png", System.currentTimeMillis()));
                            byte[] var10 = ScreenUtils.getFrameBufferPixels(0, 0, Gdx.graphics.getBackBufferWidth(), Gdx.graphics.getBackBufferHeight(), true);
                            Pixmap var11 = new Pixmap(Gdx.graphics.getBackBufferWidth(), Gdx.graphics.getBackBufferHeight(), Format.RGBA8888);
                            BufferUtils.copy((byte[]) var10, 0, var11.getPixels(), var10.length);
                            PixmapIO.writePNG(Utlis.i(var4), var11);
                            var11.dispose();
                            var9.h.a(var4, new vdtt_h(var9));
                        } catch (Exception var12) {
                        }
                        break;
                    case 3000:
                        this.r(0);
                        break;
                    case 3001:
                        vdtt_bu.I = 0;
                        this.r(1);
                        break;
                    case 3002:
                        vdtt_bu.I = 1;
                        this.r(1);
                        break;
                    case 3003:
                        vdtt_bu.I = 2;
                        this.r(1);
                        break;
                    case 3004:
                        gI();
                        o(72);
                        vdtt_aa.gI().w();
                        break;
                    case 3010:
                        if (this.dw.b) {
                            this.a((vdtt_w) (new vdtt_mn(this)));
                        }

                        this.r(2);
                        break;
                    case 6004:
                        g(vdtt_ba.K.b);
                        break;
                    case 6005:
                        f(vdtt_ba.K.b);
                        break;
                    case 6006:
                        vdtt_ba.J = vdtt_ba.K.b;
                        this.a((String) vdtt_ba.K.b, (vdtt_ka) (new vdtt_kb(gI(), 5)));
                        break;
                    case 6007:
                        this.h(vdtt_ba.K.b);
                        break;
                    case 6008:
                        e(vdtt_ba.K.b);
                        break;
                    case 6009:
                        System.out.println("SEND MO NAP");
                        o(89);
                        break;
                    case 7000:
                        this.f(!this.az.d());
                        break;
                    case 7001:
                        z(0);
                        break;
                    case 7002:
                        z(2);
                        break;
                    case 7003:
                        z(3);
                        break;
                    case 7004:
                        this.ax();
                        break;
                    case 7005:
                        z(4);
                        break;
                    case 7006:
                        this.a((vdtt_w) (new vdtt_lc(this)));
                }

                this.o.b();
            } else {
                gI().a((vdtt_w) (new vdtt_kn(gI())));
            }
        }

    }

    private void ax() {
        this.a((vdtt_w) (new vdtt_jp(this)));
    }

    private void b(int var1, boolean var2) {
        try {
            if (!Char.gI().isDie() && (this.focusEntity == null || !(this.focusEntity instanceof Char) || !this.focusEntity.isDie())) {
                short[] var3 = this.B();
                Skill var4 = null;
                Iterator var5;
                if (var1 == 0 && mConfig.gI().a(31)) {
                    var5 = this.bm.iterator();

                    while (var5.hasNext()) {
                        if ((var4 = (Skill) var5.next()).d >= 31 && var4.d <= 36 && Char.gI().mp >= var4.g) {
                            this.a(var4, false);
                            if (Char.gI().aU != null && var2) {
                                SettingsTab.K().a(false);
                                return;
                            }
                        }
                    }
                }

                if (var1 == 7 && this.aP != null) {
                    for (int var8 = 0; var8 < gI().af.length; ++var8) {
                        if (gI().af[var8].e > 0 && gI().af[var8].l()) {
                            var4 = gI().af[var8];
                            break;
                        }
                    }
                } else {
                    var5 = this.bm.iterator();

                    while (var5.hasNext()) {
                        Skill var6 = (Skill) var5.next();
                        if (var3[var1] == var6.d) {
                            var4 = var6;
                            break;
                        }
                    }
                }

                if (var4 != null && (Char.gI().aU == null || Char.gI().aU.d.getSkillTemplate().id != var4.getSkillTemplate().id)) {
                    if (!var4.e() && this.focusEntity != null && !(this.focusEntity instanceof Mob)) {
                        if (this.focusEntity instanceof Char && this.a((Char) this.focusEntity)) {
                            var4.o = true;
                            if (Char.gI().mp < var4.g) {
                                DataCenter.gI().currentScreen.c(Utlis.b(Caption.mB, var4.getSkillTemplate().name), -65536);
                            }

                            this.a(var4, false);
                            if (var1 == 0 && var2) {
                                SettingsTab.K().a(false);
                            }
                        }
                    } else {
                        var4.o = true;
                        if (Char.gI().mp < var4.g) {
                            DataCenter.gI().currentScreen.c(Utlis.b(Caption.mB, var4.getSkillTemplate().name), -65536);
                        }

                        this.a(var4, false);
                        if (var1 == 0 && var2) {
                            SettingsTab.K().a(false);
                            return;
                        }
                    }
                }
            }
        } catch (Exception var7) {
            Utlis.a(var7);
        }

    }

    public static void a(vdtt_dv var0) {
        try {
            Message var1;
            (var1 = Message.c((byte) -48)).writeShort(var0.d);
            var1.writeShort(var0.a);
            if (var0.b >= 0) {
                var1.writeShort(var0.b);
            } else {
                var1.writeShort(var0.c);
            }

            var1.writeShort(var0.e);
            var1.writeShort(var0.f);
            var1.send();
            Char.gI().S();
            gI().pointMoveMap = null;
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    public final void a(int var1, boolean var2) {
        try {
            if (var2) {
                this.ef = var1;
                Binary.b("shortcutItem", var1);
            } else if (this.bY < 0 || this.bY >= DataCenter.gI().itemTemplate.length) {
                this.ef = this.bY;
            }

            this.bY = var1;
            DataCenter.gI().aQ = false;
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final void a(int var1, short var2, short var3, short var4, boolean var5) {
        try {
            int var6 = gI().maxX / 255;
            if (gI().maxX % 255 != 0) {
                ++var6;
            }

            var3 = (short) (var3 + var2 % var6 * 255);
            var4 = (short) (var4 + var2 / var6 * 255);
            Char var7;
            if ((var7 = this.k(var1)) != null) {
                var7.a(var3, var4, var5);
            }
        } catch (Exception var8) {
        }

    }

    public final void b(Message var1) throws IOException {
        Char var2;
        (var2 = new Char(var1.reader.dis.readInt())).b(var1);

        int var3;
        for (var3 = 0; var3 < this.vChar.size(); ++var3) {
            if (((Char) this.vChar.elementAt(var3)).idEntity == var2.idEntity) {
                this.vChar.removeElementAt(var3);
                break;
            }
        }

        for (var3 = this.ax.size() - 1; var3 >= 0; --var3) {
            if (((Char) this.ax.get(var3)).name.equals(var2.name)) {
                this.ax.remove(var3);
                break;
            }
        }

        if (var2.idEntity != Char.gI().idEntity) {
            this.vChar.addElement(var2);
        }

    }

    public final void J() {
        this.timeLoadMap = Utlis.a();
        if (this.aC == null) {
            this.aC = new vdtt_lh(this);
        }

        DataCenter var1 = DataCenter.gI();
        GameSrc var2 = gI();
        var1.currentScreen = var2;
    }

    public final void K() {
        (new Thread(new vdtt_cv(this))).start();
    }

    public static void a(String var0) {
        try {
            Message var1;
            (var1 = new Message((byte) 21)).writeUTF(var0);
            var1.send();
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    public final void a(vdtt_by var1) {
        try {
            String var2 = var1.i();
            if (this.cK.length() > 0) {
                var2 = this.cK + var2;
            }

            if (var2.length() > 0) {
                if (var2.startsWith("/") && var2.contains(": ")) {
                    this.aR.a((byte) 5);
                    if (this.br != null) {
                        this.br.P.a((byte) 5);
                    }
                }

                var1.a("");
                byte var3 = this.aR.j();
                if (this.br != null) {
                    switch (var3 = this.br.P.j()) {
                        case 0:
                            this.cw = 0;
                            this.br.O.a(0);
                            break;
                        case 1:
                            this.cw = 1;
                            this.br.O.a(0);
                            break;
                        case 2:
                            this.br.O.a(4);
                            break;
                        case 3:
                            this.br.O.a(2);
                            break;
                        case 4:
                            this.br.O.a(3);
                            break;
                        case 5:
                            this.br.O.a(1);
                            break;
                        case 6:
                            this.cw = 6;
                            this.br.O.a(0);
                            break;
                        case 7:
                            this.cw = 7;
                            this.br.O.a(0);
                            break;
                        case 8:
                            this.cw = 8;
                            this.br.O.a(0);
                            break;
                        case 9:
                            this.br.O.a(0);
                    }
                }

                Message var4 = null;
                switch (var3) {
                    case 0:
                        a(var2);
                        return;
                    case 1:
                        (var4 = new Message((byte) 22)).writeBoolean(false);
                        break;
                    case 2:
                        var4 = new Message((byte) 24);
                        break;
                    case 3:
                        var4 = new Message((byte) 25);
                        break;
                    case 4:
                        var4 = new Message((byte) 26);
                        break;
                    case 5:
                        var4 = new Message((byte) 28);

                        try {
                            J = (J = var2.split(": ")[0]).replaceAll("/", "");
                        } catch (Exception var6) {
                            J = "";
                        }
                        break;
                    case 6:
                        this.aR.n.b = var3;
                        var4 = new Message((byte) -59);
                        break;
                    case 7:
                        (var4 = new Message((byte) 22)).writeBoolean(true);
                        break;
                    case 8:
                        var4 = new Message((byte) 23);
                        break;
                    case 9:
                        var4 = new Message((byte) 27);
                }

                var4.writeUTF(var2);
                var4.send();
            }
        } catch (Exception var7) {
            Utlis.a(var7);
        }

    }

    public final void b(int var1, Object var2) {
        if (this.D()) {
            switch (var1) {
                case 1011:
                    SettingsTab.O();
                    Char var3;
                    if (Char.gI().q() && !Char.gI().ab()) {
                        if (!this.o.b[4] && !this.o.b[6]) {
                            if (Char.gI().pointMove.i == 40 && this.dd > 0) {
                                var3 = Char.gI();
                                var2 = null;
                                var3.pointMove = (vdtt_gj) var2;
                                this.o.b();
                                Char.gI().aF = 2;
                                return;
                            }

                            if (this.aE.R.M >= 75 && this.aE.R.M <= 90 && Char.gI().r() && this.dd > 0) {
                                if (!Char.gI().P()) {
                                    this.o.b();
                                    return;
                                }

                                Char.gI().pointMove.g = 0;
                                Char.gI().aF = 2;
                                return;
                            }

                            if (this.aE.R.M >= 90 && this.aE.R.M <= 105 && Char.gI().r() && this.dd > 0) {
                                if (!Char.gI().N()) {
                                    this.o.b();
                                    return;
                                }

                                Char.gI().pointMove.g = 0;
                                Char.gI().aF = 2;
                                return;
                            }

                            if (this.aE.R.M < 90 | this.aE.R.M >= 270) {
                                Char.gI().O();
                                return;
                            }

                            Char.gI().M();
                            return;
                        }

                        return;
                    }

                    if (Char.gI().aF == 2) {
                        if (this.aE.R.M >= 15 && this.aE.R.M <= 345) {
                            if (this.aE.R.M > 75 && this.aE.R.M < 115) {
                                if (!Char.gI().Q()) {
                                    this.o.b();
                                    return;
                                }
                            } else if (this.aE.R.M > 165 && this.aE.R.M < 195) {
                                if (!Char.gI().M()) {
                                    this.o.b();
                                    return;
                                }
                            } else if (this.aE.R.M > 255 && this.aE.R.M < 285) {
                                if (!Char.gI().R()) {
                                    this.o.b();
                                    return;
                                }
                            } else if (this.aE.R.M >= 15 && this.aE.R.M <= 75) {
                                if (!Char.gI().P()) {
                                    this.o.b();
                                    return;
                                }
                            } else if (this.aE.R.M >= 115 && this.aE.R.M <= 165) {
                                if (!Char.gI().N()) {
                                    this.o.b();
                                    return;
                                }
                            } else {
                                short var4;
                                if (this.aE.R.M >= 195 && this.aE.R.M <= 255) {
                                    var3 = Char.gI();
                                    var4 = gI().getMapTemplate().type == 20 ? 10 : var3.typePk;
                                    if (!var3.a(var3.cx - var4, var3.cy + var4, (byte) 3)) {
                                        this.o.b();
                                        return;
                                    }
                                } else if (this.aE.R.M >= 285 && this.aE.R.M <= 345) {
                                    var3 = Char.gI();
                                    var4 = gI().getMapTemplate().type == 20 ? 10 : var3.typePk;
                                    if (!var3.a(var3.cx + var4, var3.cy + var4, (byte) 2)) {
                                        this.o.b();
                                        return;
                                    }
                                }
                            }
                        } else if (!Char.gI().O()) {
                            this.o.b();
                            return;
                        }
                    } else {
                        if (this.aE.R.M >= 35 && this.aE.R.M < 145) {
                            Char.gI().Q();
                            return;
                        }

                        if (this.aE.R.M >= 145 && this.aE.R.M < 260) {
                            Char.gI().M();
                            return;
                        }

                        if (this.aE.R.M >= 260 && this.aE.R.M < 280) {
                            Char.gI().R();
                            return;
                        }

                        Char.gI().O();
                    }
            }
        }

    }

    public final void r() {
        try {
            this.aE.j();
        } catch (Exception var2) {
        }

    }

    public final void c(Message var1) throws IOException {
        Vector var2 = new Vector();
        short var3 = var1.reader.dis.readShort();

        for (int var4 = 0; var4 < var3; ++var4) {
            ItemMap var5;
            (var5 = new ItemMap()).I = var1.reader.dis.readInt();
            var5.idEntity = var1.reader.dis.readShort();
            var5.cx = var5.l = var1.reader.dis.readShort();
            var5.cy = var5.m = var1.reader.dis.readShort();
            var5.item = new Item();
            var5.item.a(var1);
            var2.addElement(var5);
        }

        this.vItemMap.clear();
        this.vItemMap.addAll(var2);
    }

    public final void d(Message var1) throws IOException {
        Char.gI().T();
        Char.gI().aa = -1;
        this.zoneID = var1.reader.dis.readShort();
        this.mapID = var1.reader.dis.readShort();
        Char.gI().cx = SessionMove.a = var1.reader.dis.readShort();
        Char.gI().cy = SessionMove.b = var1.reader.dis.readShort();
        this.vItemMap.clear();
        this.vChar.clear();
        this.vMob.clear();
        this.vNpc.clear();
        this.vWayPoint.clear();
        this.dr.clear();
        short var2 = var1.reader.dis.readShort();

        int var3;
        for (var3 = 0; var3 < var2; ++var3) {
            ItemMap var4;
            (var4 = new ItemMap()).I = var1.reader.dis.readInt();
            var4.idEntity = var1.reader.dis.readShort();
            var4.cx = var4.l = var1.reader.dis.readShort();
            var4.cy = var4.m = var1.reader.dis.readShort();
            var4.item = new Item();
            var4.item.a(var1);
            if (var4.item.id != 811 || var4.I == Char.gI().idEntity) {
                this.vItemMap.addElement(var4);
            }
        }

        var2 = var1.reader.readUnsignedByte();

        for (var3 = 0; var3 < var2; ++var3) {
            this.b(var1);
        }

        var2 = var1.reader.dis.readShort();

        short var7;
        for (var7 = 0; var7 < var2; ++var7) {
            Mob var5;
            (var5 = new Mob(0)).b(var1);
            this.vMob.addElement(var5);
        }

        var2 = var1.reader.dis.readShort();

        for (var7 = 0; var7 < var2; ++var7) {
            Npc var8;
            (var8 = new Npc(var1.reader.dis.readByte(), var1.reader.dis.readShort(), var1.reader.dis.readShort(), var1.reader.dis.readShort())).idEntity = var7;
            this.vNpc.addElement(var8);
        }

        for (int var9 = 0; var9 < DataCenter.gI().V.length; ++var9) {
            WayPoint var6;
            if (DataCenter.gI().V[var9][0] == this.mapID) {
                (var6 = new WayPoint(0, 0)).a(DataCenter.gI().V[var9][0], DataCenter.gI().V[var9][5], DataCenter.gI().V[var9][1], DataCenter.gI().V[var9][2], DataCenter.gI().V[var9][3], DataCenter.gI().V[var9][4], DataCenter.gI().V[var9][10], DataCenter.gI().V[var9][11]);
                this.vWayPoint.addElement(var6);
            } else if (DataCenter.gI().V[var9][5] == this.mapID) {
                (var6 = new WayPoint(0, 0)).a(DataCenter.gI().V[var9][5], DataCenter.gI().V[var9][0], DataCenter.gI().V[var9][6], DataCenter.gI().V[var9][7], DataCenter.gI().V[var9][8], DataCenter.gI().V[var9][9], DataCenter.gI().V[var9][12], DataCenter.gI().V[var9][13]);
                this.vWayPoint.addElement(var6);
            }
        }

        this.x();
        this.R();
        this.L();
        Char.gI().m = var1.reader.dis.readByte();
        if (this.V()) {
            this.bR = var1.reader.dis.readLong();
            this.bS = var1.reader.dis.readInt();
            this.bZ = var1.reader.dis.readBoolean();
            if (this.getMapTemplate().type != 19 && this.getMapTemplate().type != 20 && this.getMapTemplate().type != 15) {
                if (gI().getMapTemplate().type == 8) {
                    gI().cs = var1.reader.dis.readByte();
                    if (gI().cs > 3) {
                        gI().a(true);
                    }
                }
            } else {
                this.cs = var1.reader.dis.readByte();
            }
        }

        this.ca = var1.reader.dis.readBoolean();
        if (this.cq != 0) {
            Char.gI().aE = Char.gI().dir = this.cq;
        } else {
            Char.gI().aE = Char.gI().dir = 2;
        }

        byte var10;
        if ((var10 = var1.reader.dis.readByte()) > 0) {
            vdtt_w var11;
            if ((var11 = super.c) instanceof vdtt_ak) {
                ((vdtt_ak) var11).k();
            }

            this.a(0, Char.gI(), var10);
        }

        Char.gI().bq = var1.reader.dis.readBoolean();
        this.ew = false;
    }

    public final void L() {
        this.h();
        d = false;
        this.cn = false;
        this.eg = 0;
    }

    public final void e(Message var1) throws IOException{
        this.cY = var1.reader.dis.readByte();
        vdtt_w var2;
        if ((var2 = super.c) instanceof vdtt_lu) {
            ((vdtt_lu) var2).k();
        }

    }

    public final void f(Message var1) throws IOException {
        int var2 = var1.reader.dis.readInt();

        for (int var3 = 0; var3 < this.vChar.size(); ++var3) {
            Char var4;
            if ((var4 = (Char) this.vChar.elementAt(var3)).idEntity == var2) {
                if (!this.ax.contains(var4)) {
                    this.ax.add(var4);
                }

                return;
            }
        }

    }

    private static vdtt_fw b(int var0, int var1, int var2, int var3) {
        vdtt_fw var4;
        (var4 = new vdtt_fw()).d = new XYEntity[5];
        var4.d[0] = XYEntity.create(var0, var1);
        var4.d[1] = XYEntity.create(var2, var1);
        var4.d[2] = XYEntity.create(var2, var3);
        var4.d[3] = XYEntity.create(var0, var3);
        var4.d[4] = XYEntity.create(var0, var1);
        return var4;
    }

    public final Mob j(int var1) {
        for (int var2 = 0; var2 < this.vMob.size(); ++var2) {
            Mob var3;
            if ((var3 = (Mob) this.vMob.elementAt(var2)).idEntity == var1) {
                return var3;
            }
        }

        return null;
    }

    private boolean ay() {
        Char var1;
        return this.focusEntity != null && this.focusEntity instanceof Char && (var1 = (Char) this.focusEntity).idEntity == Char.gI().aa && this.k(var1.idEntity) != null;
    }

    public final Char k(int var1) {
        for (int var2 = 0; var2 < this.vChar.size(); ++var2) {
            Char var3;
            if ((var3 = (Char) this.vChar.elementAt(var2)).idEntity == var1) {
                return var3;
            }
        }

        return null;
    }

    public final Npc l(int var1) {
        for (int var2 = 0; var2 < this.vNpc.size(); ++var2) {
            Npc var3;
            if ((var3 = (Npc) this.vNpc.elementAt(var2)).id == var1) {
                return var3;
            }
        }

        return null;
    }

    public final Char m(int var1) {
        return var1 == Char.gI().idEntity ? Char.gI() : this.k(var1);
    }

    public final Char d(String var1) {
        for (int var2 = 0; var2 < this.vChar.size(); ++var2) {
            Char var3;
            if ((var3 = (Char) this.vChar.elementAt(var2)).name.equals(var1)) {
                return var3;
            }
        }

        return null;
    }

    public static void a(Npc var0) {
        try {
            Char.gI().W();
            Message var1;
            (var1 = new Message((byte) 54)).writeShort(var0.idEntity);
            var1.send();
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    public final void M() {
        String var1 = Caption.hL;
        String[] var2 = Caption.zz;
        this.a((vdtt_w) (new vdtt_lw(this, var1, var2, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15})));
    }

    public final void g(Message var1) {
        try {
            byte var2;
            int var3;
            vdtt_w var4;
            MainScreen var5;
            Message var6;
            GameSrc var7;
            Message var8;
            switch (var2 = var1.reader.dis.readByte()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                    this.a(var2, var1);
                case 31:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 92:
                case 93:
                case 98:
                case 109:
                case 110:
                default:
                    break;
                case 50:
                    var6 = var1;
                    var7 = this;

                    try {
                        Char.gI().arrItemBox = new Item[var6.reader.dis.readShort()];
                        Char.gI();
                        Char.b(var6, Char.gI().arrItemBox);
                        var7.a((vdtt_w) (new vdtt_jr(var7)));
                        break;
                    } catch (Exception var25) {
                        Utlis.a(var25);
                        return;
                    }
                case 51:
                    this.a((vdtt_w) (new vdtt_la(this, Caption.hN, 0, 100)));
                    return;
                case 52:
                    this.a((vdtt_w) (new vdtt_la(this, Caption.hO, 2, 101)));
                    return;
                case 53:
                    this.a((vdtt_w) (new vdtt_ld(this)));
                    return;
                case 54:
                    var7 = this;
                    vdtt_kf var9 = null;

                    for (var3 = 0; var3 < var7.b.size(); ++var3) {
                        if (var7.b.get(var3) instanceof vdtt_kf) {
                            var9 = (vdtt_kf) var7.b.get(var3);
                            break;
                        }
                    }

                    if (var9 == null) {
                        var7.a((vdtt_w) (new vdtt_kf(var7, var1)));
                        return;
                    }

                    for (var3 = var7.b.size() - 1; var3 >= 0; --var3) {
                        if (!var7.b.get(var3).equals(var9) && var7.b.get(var3) instanceof vdtt_ap) {
                            var7.b.remove(var3);
                        }
                    }

                    var9.b(var1);
                    var7.f();
                    break;
                case 55:
                    this.a((vdtt_w) (new vdtt_la(this, Caption.hM, 0, 102)));
                    return;
                case 56:
                case 111:
                    this.a((vdtt_w) (new vdtt_jf(this, var1)));
                    return;
                case 57:
                    var7 = this;
                    vdtt_kt var10 = null;

                    for (var3 = 0; var3 < var7.b.size(); ++var3) {
                        if (var7.b.get(var3) instanceof vdtt_kt) {
                            var10 = (vdtt_kt) var7.b.get(var3);
                            break;
                        }
                    }

                    if (var10 == null) {
                        var7.a((vdtt_w) (new vdtt_kt(var7, var1)));
                        return;
                    }

                    for (var3 = var7.b.size() - 1; var3 >= 0; --var3) {
                        if (!var7.b.get(var3).equals(var10) && var7.b.get(var3) instanceof vdtt_ap) {
                            var7.b.remove(var3);
                        }
                    }

                    var10.b(var1);
                    var7.f();
                    break;
                case 58:
                    var8 = var1;

                    try {
                        (var5 = DataCenter.gI().currentScreen).h();
                        var5.a((vdtt_w) (new vdtt_mo(var5, var8)));
                        break;
                    } catch (Exception var24) {
                        return;
                    }
                case 59:
                    var6 = var1;
                    var7 = this;

                    try {
                        String var27 = var6.readUTF();
                        var7.a((vdtt_w) (new vdtt_mu(var7, var27)));
                        break;
                    } catch (Exception var23) {
                        return;
                    }
                case 60:
                    this.a((vdtt_w) (new vdtt_jw(this, new String[]{Caption.ms, Caption.P}, var2)));
                    return;
                case 61:
                    this.a((vdtt_w) (new vdtt_jw(this, new String[]{Caption.ms, Caption.P}, var2)));
                    return;
                case 62:
                    this.a((vdtt_w) (new vdtt_jw(this, new String[]{Caption.ms, Caption.P}, var2)));
                    return;
                case 63:
                    this.a((vdtt_w) (new vdtt_jw(this, new String[]{Caption.ms, Caption.P}, var2)));
                    return;
                case 64:
                    this.a((vdtt_w) (new vdtt_mw(this)));
                    return;
                case 65:
                    this.a((vdtt_w) (new vdtt_mv(this)));
                    return;
                case 66:
                    this.a((vdtt_w) (new vdtt_my(this)));
                    return;
                case 67:
                    this.a((vdtt_w) (new vdtt_mx(this)));
                    return;
                case 68:
                    this.a((vdtt_w) (new vdtt_jw(this, new String[]{Caption.mt, Caption.P}, var2)));
                    return;
                case 69:
                    this.a((vdtt_w) (new vdtt_jw(this, new String[]{Caption.mt, Caption.P}, var2)));
                    return;
                case 70:
                    this.a((vdtt_w) (new vdtt_jw(this, new String[]{Caption.mt, Caption.P}, var2)));
                    return;
                case 71:
                    this.a((vdtt_w) (new vdtt_jw(this, new String[]{Caption.mt, Caption.P}, var2)));
                    return;
                case 72:
                    vdtt_w var11;
                    if (!((var11 = super.c) instanceof vdtt_mm)) {
                        this.a((vdtt_w) (new vdtt_mm(gI(), var1)));
                        return;
                    }

                    vdtt_mm var12;
                    (var12 = (vdtt_mm) var11).b(var1);
                    break;
                case 73:
                    var8 = var1;

                    try {
                        (var5 = DataCenter.gI().currentScreen).h();
                        vdtt_la var30;
                        (var30 = new vdtt_la(var5, var8.readUTF(), 0, 300)).a = var8.reader.dis.readShort();
                        var5.a((vdtt_w) var30);
                        break;
                    } catch (Exception var22) {
                        return;
                    }
                case 74:
                    this.a((vdtt_w) (new vdtt_kq(this, var1)));
                    return;
                case 75:
                    this.a((vdtt_w) (new vdtt_kp(this)));
                    return;
                case 76:
                    this.a((vdtt_w) (new vdtt_nc(this)));
                    return;
                case 77:
                    if (Gdx.app.getType() != ApplicationType.Android && Gdx.app.getType() != ApplicationType.iOS) {
                        break;
                    }

                    AppListener.gI();
                    (new StringBuilder()).append(DataCenter.gI().aE);
                    (new StringBuilder()).append(DataCenter.gI().aF);
                    new vdtt_cw(this);
                    AppListener.gI();
                    (new StringBuilder()).append(DataCenter.gI().aE);
                    (new StringBuilder()).append(DataCenter.gI().server.name);
                    (new StringBuilder()).append(DataCenter.gI().aF);
                    Char.gI();
                    (new StringBuilder()).append(Char.gI().w());
                    return;
                case 78:
                    this.a((vdtt_w) (new vdtt_jw(this, Caption.zK, var2)));
                    return;
                case 79:
                    this.a((vdtt_w) (new vdtt_kc(this)));
                    return;
                case 80:
                    var7 = this;

                    try {
                        var7.a((vdtt_w) (new vdtt_ml(var7)));
                        break;
                    } catch (Exception var21) {
                        Utlis.a(var21);
                        return;
                    }
                case 81:
                    this.a((vdtt_w) (new vdtt_nd(this)));
                    return;
                case 82:
                    this.a((vdtt_w) (new vdtt_na(this)));
                    return;
                case 83:
                    this.a((vdtt_w) (new vdtt_nb(this)));
                    return;
                case 84:
                    this.a((vdtt_w) (new vdtt_mj(this)));
                    return;
                case 85:
                    this.a((vdtt_w) (new vdtt_kj(this)));
                    return;
                case 86:
                    var6 = var1;
                    var7 = this;

                    try {
                        byte var29 = 0;
                        if (var6.reader.dis.readBoolean()) {
                            var29 = var6.reader.dis.readByte();
                            var7.bl.a = var6.reader.dis.readByte();
                            var7.bl.b = var6.reader.dis.readByte();
                            var7.bl.c = var6.reader.dis.readByte();
                            var7.bl.d = var6.reader.dis.readBoolean();
                        } else {
                            var7.bl = new vdtt_dy();
                        }

                        vdtt_jm var32;
                        (var32 = new vdtt_jm(var7)).g(var29);
                        var7.a((vdtt_w) var32);
                        break;
                    } catch (Exception var20) {
                        Utlis.a(var20);
                        return;
                    }
                case 87:
                    this.a((vdtt_w) (new vdtt_lo(this)));
                    return;
                case 88:
                    System.out.println("MO PL");
                    this.a((vdtt_w) (new PhucLoiScreen(this, var1)));
                    return;
                case 89:
                    System.out.println("MO LOG NAP");
                    this.a((vdtt_w) (new vdtt_lq(this, var1)));
                    return;
                case 90:
                    this.a((vdtt_w) (new vdtt_mi(this)));
                    return;
                case 91:
                    this.a((vdtt_w) (new vdtt_ke(this, var1)));
                    return;
                case 94:
                    this.a((vdtt_w) (new vdtt_ks(this)));
                    return;
                case 95:
                    this.a((vdtt_w) (new vdtt_mh(this)));
                    return;
                case 96:
                    var7 = this;

                    try {
                        var7.a((vdtt_w) (new vdtt_le(var7)));
                        break;
                    } catch (Exception var19) {
                        Utlis.a(var19);
                        return;
                    }
                case 97:
                    this.a((vdtt_w) (new vdtt_lu(gI(), var1)));
                    return;
                case 99:
                    this.a((vdtt_w) (new vdtt_kl(gI())));
                    return;
                case 100:
                    this.a((vdtt_w) (new vdtt_mz(gI())));
                    return;
                case 101:
                    this.a((vdtt_w) (new vdtt_kk(this)));
                    return;
                case 102:
                    this.a((vdtt_w) (new vdtt_km(gI())));
                    return;
                case 103:
                    this.a((vdtt_w) (new vdtt_ly(gI())));
                    return;
                case 104:
                    this.a((vdtt_w) (new vdtt_kr(gI())));
                    return;
                case 105:
                    this.a((vdtt_w) (new vdtt_jh(this)));
                    return;
                case 106:
                    this.a((vdtt_w) (new vdtt_jw(this, new String[]{Caption.sh, Caption.P}, var2)));
                    return;
                case 107:
                    var7 = gI();

                    try {
                        vdtt_w var28;
                        if ((var28 = var7.c) instanceof vdtt_ap) {
                            ((vdtt_ap) var28).v();
                        }
                    } catch (Exception var18) {
                        Utlis.a(var18);
                    }

                    this.a((vdtt_w) (new vdtt_ng(this, var1)));
                    return;
                case 108:
                    vdtt_ky var13;
                    (var13 = new vdtt_ky(this)).V = var1.reader.dis.readByte();
                    this.a((vdtt_w) var13);
                    return;
                case 112:
                    if ((var4 = super.c) instanceof vdtt_kx) {
                        vdtt_kx var31;
                        (var31 = (vdtt_kx) var4).a = var1.reader.dis.readByte();
                        return;
                    }
                    break;
                case 113:
                    if ((var4 = super.c) instanceof vdtt_jf) {
                        vdtt_jf var14;
                        vdtt_jf var15 = var14 = (vdtt_jf) var4;
                        byte var16 = var1.reader.dis.readByte();
                        var14 = var15;
                        var15.f(2);
                        var15.R = var16;
                        String[] var17 = Utlis.a(vdtt_jf.P[1][var15.R], "\\n");
                        var15.O.clear();

                        for (var3 = 0; var3 < var17.length; ++var3) {
                            var14.O.addAll(vdtt_dd.a(vdtt_dd.d, var17[var3], var14.width - 8 - 35));
                        }

                        if (var14.S != null && var14.S[var14.R] != null) {
                            var14.N[2][1] = new vdtt_hp((byte) 1, 13, var14.f() + 45, var14.width - 8 - 18, 120, 15, var14.O.size());
                        } else {
                            var14.N[2][1] = new vdtt_hp((byte) 1, 13, var14.f() + 45, var14.width - 8 - 18, 150, 15, var14.O.size());
                        }

                        var14.Q = true;
                    }

                    return;
            }
        } catch (Exception var26) {
            Utlis.a(var26);
        }

    }

    private void a(byte var1, Message var2) {
        try {
            this.Z.clear();
            short var3;
            Item[][] var4 = new Item[var3 = var2.reader.dis.readShort()][3];
            boolean[] var5 = new boolean[var3];
            byte var6 = 0;
            boolean var7 = false;

            Item var8;
            for (int var9 = 0; var9 < var3; ++var9) {
                (var8 = new Item()).idBuy = var2.reader.dis.readShort();
                var8.id = var2.reader.dis.readShort();
                var8.isLock = var2.reader.dis.readBoolean();
                var8.h = var2.reader.dis.readLong();
                var8.strData = var2.reader.readUTF();
                var8.o = var2.reader.dis.readInt();
                var8.m = var2.reader.dis.readInt();
                var8.n = var2.reader.dis.readInt();
                var8.l = var2.reader.dis.readInt();
                var8.k = var2.reader.dis.readInt();
                var8.r = var2.reader.dis.readInt();
                this.Z.add(var8);
                if (var1 == 39) {
                    var5[var9] = var2.reader.dis.readBoolean();

                    for (int var10 = 0; var10 < var4[var9].length; ++var10) {
                        var4[var9][var10] = new Item();
                        var4[var9][var10].a(var2);
                    }
                } else if (var1 == 40) {
                    var8.q = var2.reader.dis.readInt();
                    var8.e = var2.reader.dis.readInt();
                    if (var8.e > 1) {
                        var8.c(var8.e);
                    }
                }
            }

            long var30 = -1L;
            long var11 = -1L;
            if (var1 == 40) {
                var30 = var2.reader.dis.readLong();
                var11 = var2.reader.dis.readLong();
                var7 = var2.reader.dis.readBoolean();
                var6 = var2.reader.dis.readByte();
            }

            byte var13 = 0;
            String var14 = "";
            int var15;
            int var16;
            int var19;
            int var20;
            switch (var1) {
                case 0:
                    var14 = Caption.yF[0];
                    break;
                case 1:
                    var14 = Caption.yF[0];
                    var13 = 1;
                    break;
                case 2:
                    var14 = Caption.yG[0];
                    break;
                case 3:
                    var14 = Caption.yG[0];
                    var13 = 1;
                    break;
                case 4:
                    var14 = Caption.yH[0];
                    break;
                case 5:
                    var14 = Caption.yH[0];
                    var13 = 1;
                case 6:
                case 31:
                default:
                    break;
                case 7:
                    var13 = 1;
                    break;
                case 8:
                case 20:
                    var14 = Caption.aE;
                    break;
                case 9:
                case 21:
                    var14 = Caption.aQ;
                    break;
                case 10:
                case 22:
                    var14 = Caption.aR;
                    break;
                case 11:
                case 23:
                    var14 = Caption.aS;
                    break;
                case 12:
                case 24:
                    var14 = Caption.aT;
                    break;
                case 13:
                case 25:
                    var14 = Caption.aU;
                    break;
                case 14:
                case 26:
                    var14 = Caption.aW;
                    break;
                case 15:
                case 27:
                    var14 = Caption.aX;
                    break;
                case 16:
                case 28:
                    var14 = Caption.aY;
                    break;
                case 17:
                case 29:
                    var14 = Caption.aZ;
                    break;
                case 18:
                    var14 = Caption.bU;
                    break;
                case 19:
                    var14 = Caption.aH;
                    var13 = 2;
                    break;
                case 30:
                    var14 = Caption.aH;
                    var13 = 3;
                    break;
                case 32:
                case 33:
                case 34:
                case 36:
                    var14 = Caption.bb;
                    break;
                case 35:
                    var14 = Caption.aH;
                    var13 = 4;
                    break;
                case 37:
                    var14 = Caption.aH;
                    var13 = 0;
                    break;
                case 38:
                    var14 = Caption.aH;
                    var13 = 1;
                    break;
                case 39:
                    var13 = 2;
                    break;
                case 40:
                    var13 = 3;
                    break;
                case 41:
                    vdtt_kf var17;
                    if (super.c instanceof vdtt_kf && (var17 = (vdtt_kf) super.c).S == null) {
                        var17.S = new Item[gI().Z.size()];
                        var17.ac = new vdtt_hq((byte) 1, 12, var17.ab.cy + 7 + 34, var17.af * 3, var17.ag * 3, var17.ag, Utlis.c(var17.S.length, 3), 3);
                        var17.ae = new vdtt_ay[var17.S.length];
                        var17.ad = new vdtt_hp[var17.S.length];
                        int var18 = 0;

                        for (var15 = 0; var15 < var17.ac.i; ++var15) {
                            var16 = var15 * var17.ag;

                            for (var19 = 0; var19 < var17.ac.O; ++var19) {
                                var20 = var19 * var17.af;
                                var17.S[var18] = (Item) gI().Z.elementAt(var18);
                                var17.ae[var18] = new vdtt_ay(var20 + 40, var16 + 14, 0, 0, "", var17, 1000, -25);
                                var17.ad[var18] = new vdtt_hu((byte) 1, 0, 0, var17.ae[var15].width, var17.ae[var15].height, var17.ae[var15].height, 1, var17.ac);
                                ++var18;
                                if (var18 >= var17.ae.length) {
                                    break;
                                }
                            }

                            if (var18 >= var17.ae.length) {
                                break;
                            }
                        }
                    }

                    return;
            }

            vdtt_w var31 = super.c;
            if (var1 != 6 && var1 != 7 && var1 != 39 && var1 != 40) {
                vdtt_me var34;
                if (var31 instanceof vdtt_me) {
                    (var34 = (vdtt_me) var31).g(var13);
                } else {
                    var34 = new vdtt_me(this, var1, var14, var13);
                    this.a((vdtt_w) var34);
                }

                if (SettingsTab.O) {
                    SettingsTab.O = false;
                    if ((var19 = Char.gI().D()) > 3) {
                        var19 = 3;
                    } else if (var19 <= 0) {
                        var19 = 1;
                    }

                    var20 = Char.gI().w() / 5 * 5;
                    int var36 = 0;

                    while (true) {
                        if (var36 >= this.Z.size()) {
                            return;
                        }

                        if ((var8 = (Item) this.Z.get(var36)).getItemTemplate().type == 24 && var8.getItemTemplate().levelNeed == var20) {
                            (var2 = new Message((byte) 121)).writeShort(var8.idBuy);
                            var2.writeShort(var19);
                            var2.send();
                            break;
                        }

                        ++var36;
                    }
                } else if (SettingsTab.Q) {
                    SettingsTab.Q = false;
                    this.bP = 10;
                }

                return;
            }

            vdtt_ll var32;
            if (var31 instanceof vdtt_ll) {
                var32 = (vdtt_ll) var31;
            } else {
                var32 = new vdtt_ll(this);
                this.a((vdtt_w) var32);
            }

            boolean[] var33 = var5;
            Item[][] var35 = var4;
            byte var21 = var13;
            vdtt_ll var22 = var32;
            if (var32.Q[var32.X.h()] == null) {
                var32.aq[var13] = false;
                var32.Q[var13] = new Item[gI().Z.size()];
                var15 = var32.ao;
                byte var23 = 3;
                if (var13 == 3) {
                    var23 = 2;
                    var15 = 75;
                }

                if (DataCenter.k()) {
                    var32.Z[var13] = new vdtt_hq((byte) 1, 10, var32.f() + 15 + 8, var32.an, var15 * var23, var15, var32.Q[var13].length, 1);
                } else {
                    var32.Z[var13] = new vdtt_hq((byte) 1, 10, var32.f() + 15 + 22, var32.an * 3, var15 * var23, var15, Utlis.c(var32.Q[var13].length, 3), 3);
                }

                var32.am[var13] = new vdtt_ay[var32.Q[var13].length];
                var32.al[var13] = new vdtt_hp[var32.Q[var13].length];
                int var24 = 0;

                int var25;
                int var26;
                int var27;
                for (int var28 = 0; var28 < var22.Z[var21].i; ++var28) {
                    var26 = var28 * var15;

                    for (var27 = 0; var27 < var22.Z[var21].O; ++var27) {
                        var25 = var27 * var22.an;
                        var22.Q[var21][var24] = (Item) gI().Z.elementAt(var24);
                        if (var21 == 3) {
                            var22.am[var21][var24] = new vdtt_ay(var25 + 38, var26 + 47, 0, 0, "", var22, 1000, var22.Q[var21][var24].d());
                            var22.al[var21][var24] = new vdtt_hu((byte) 1, 0, 0, var22.am[var21][var28].width, var22.am[var21][var28].height, var22.am[var21][var28].height, 1, var22.Z[var21]);
                        } else if (DataCenter.k()) {
                            var22.am[var21][var24] = new vdtt_ay(var25 + var22.an - 60, var26 + 14, 0, 0, "", var22, 1000, var22.Q[var21][var24].d());
                            var22.al[var21][var24] = new vdtt_hu((byte) 1, 0, 0, var22.am[var21][var28].width, var22.am[var21][var28].height, var22.am[var21][var28].height, 1, var22.Z[var21]);
                        } else {
                            var22.am[var21][var24] = new vdtt_ay(var25 + 40, var26 + 14, 0, 0, "", var22, 1000, var22.Q[var21][var24].d());
                            var22.al[var21][var24] = new vdtt_hu((byte) 1, 0, 0, var22.am[var21][var28].width, var22.am[var21][var28].height, var22.am[var21][var28].height, 1, var22.Z[var21]);
                        }

                        ++var24;
                        if (var24 >= var22.am[var21].length) {
                            break;
                        }
                    }

                    if (var24 >= var22.am[var21].length) {
                        break;
                    }
                }

                if (var21 == 2) {
                    vdtt_hk[] var37 = new vdtt_hk[var22.Q[var21].length];

                    for (var27 = 0; var27 < var35.length; ++var27) {
                        var37[var27] = new vdtt_hk(Caption.uq + (var27 + 1), var35[var27], var33[var27]);
                    }

                    var22.R = var37;
                    var22.aq[var21] = false;
                    var22.Z[var21] = new vdtt_hq((byte) 1, 10, var22.f() + 15 + 22, var22.an * 3, var15 * var23, var22.ap, Utlis.c(var37.length, 3), 3);
                    var22.al[var21] = new vdtt_hp[var37.length];
                    var24 = 0;

                    for (var27 = 0; var27 < var22.Z[var21].i; ++var27) {
                        var26 = var27 * var22.ap;

                        for (var16 = 0; var16 < var22.Z[var21].O; ++var16) {
                            var25 = var16 * var22.an;
                            var22.Q[var21][var24] = (Item) gI().Z.elementAt(var24);
                            var22.am[var21][var24] = new vdtt_ay(var25 + 51, var26 + 48, 0, 0, "", var22, 1000, var22.Q[var21][var24].d());
                            var22.am[var21][var24].a(var37[var24].c);
                            var22.al[var21][var24] = new vdtt_hu((byte) 1, 0, 0, var22.am[var21][var27].width, var22.am[var21][var27].height, var22.am[var21][var27].height, 1, var22.Z[var21]);
                            ++var24;
                            if (var24 >= var22.am[var21].length) {
                                break;
                            }
                        }

                        if (var24 >= var22.am[var21].length) {
                            break;
                        }
                    }
                }
            }

            if (var1 == 40) {
                var32.T = var30;
                var32.U = var11;
                var32.ar = var7;
                var32.as = var6;
                var32.f(2);
                var32.X.a(var13);
                var32.H();
            }
        } catch (Exception var29) {
            Utlis.a(var29);
        }

    }

    public static void n(int var0) {
        try {
            Message var1;
            (var1 = new Message((byte) 117)).writeByte(var0);
            var1.send();
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    public static void a(Item var0, boolean var1) {
        try {
            Message var2;
            (var2 = new Message((byte) 119)).writeShort(var0.index);
            var2.writeBoolean(false);
            var2.send();
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public static void h(Message var0) {
        try {
            String var1;
            if ((var1 = var0.reader.readUTF()) != null && var1.length() > 0) {
                if (Gdx.app.getType() == ApplicationType.Android) {
                    AppListener.gI();
                    var1 = null;
                } else if (Gdx.app.getType() == ApplicationType.iOS) {
                    AppListener.gI();
                }

                try {
                    Gdx.net.openURI(var1);
                } catch (Exception var3) {
                    Utlis.a(var3);
                }
            }

            Message.c((byte) 21).send();
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public static void o(int var0) {
        try {
            Message var1;
            (var1 = new Message((byte) 122)).writeByte(var0);
            var1.send();
        } catch (Exception var2) {
        }

    }

    public static void i(int var0, int var1) {
        try {
            Message var2;
            (var2 = new Message((byte) 122)).writeByte(var0);
            var2.writeByte(var1);
            var2.send();
        } catch (Exception var3) {
        }

    }

    public static void i(Message var0) {
        try {
            Char.gI().b(var0.reader.dis.readInt(), false, true);
            Char.gI().a(var0.reader.dis.readInt(), false, true);
            Char.gI().arrItemBag[var0.reader.dis.readShort()] = null;
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    public static void j(Message var0) {
        try {
            short var1 = var0.reader.dis.readShort();
            int var2 = var0.reader.dis.readInt();
            Char.gI().arrItemBag[var1].c(var2);
            Char.gI().arrItemBag[var1].index = var1;
            short var3 = var0.reader.dis.readShort();
            int var4 = var0.reader.dis.readInt();
            Char.gI().arrItemBag[var3] = Char.gI().arrItemBag[var1].a();
            Char.gI().arrItemBag[var3].c(var4);
            Char.gI().arrItemBag[var3].index = var3;
        } catch (Exception var5) {
        }

    }

    public final void k(Message var1) {
        try {
            Item[] var2 = new Item[Char.gI().j(var1.reader.dis.readShort())];

            for (int var3 = 0; var3 < Char.gI().arrItemBag.length; ++var3) {
                var2[var3] = Char.gI().arrItemBag[var3];
            }

            Char.gI().arrItemBag = var2;
            vdtt_w var5;
            if ((var5 = super.c) instanceof vdtt_jo) {
                ((vdtt_jo) var5).A();
            }
        } catch (Exception var4) {
        }

    }

    public static void l(Message var0) {
        try {
            short var1 = var0.reader.dis.readShort();
            short var2 = var0.reader.dis.readShort();
            Item var3 = Char.gI().arrItemBag[var1];
            Char.gI().arrItemBag[var1] = null;
            if (Char.gI().arrItemBox[var2] == null) {
                Char.gI().arrItemBox[var2] = var3;
                Char.gI().arrItemBox[var2].index = var2;
                return;
            }

            Char.gI().arrItemBox[var2].c(Char.gI().arrItemBox[var2].M() + var3.M());
        } catch (Exception var4) {
        }

    }

    public static void m(Message var0) {
        try {
            short var1 = var0.reader.dis.readShort();
            short var2 = var0.reader.dis.readShort();
            Item var3 = Char.gI().arrItemBox[var1];
            Char.gI().arrItemBox[var1] = null;
            if (Char.gI().arrItemBag[var2] == null) {
                Char.gI().arrItemBag[var2] = var3;
                Char.gI().arrItemBag[var2].index = var2;
                return;
            }

            Char.gI().arrItemBag[var2].c(Char.gI().arrItemBag[var2].M() + var3.M());
        } catch (Exception var4) {
        }

    }

    public static void N() {
        try {
            Message var0;
            (var0 = new Message((byte) 35)).writeByte(4);
            var0.send();
        } catch (Exception var1) {
            Utlis.a(var1);
        }

    }

    public final void n(Message var1) {
        try {
            Char var2 = this.m(var1.reader.dis.readInt());
            ItemMap var3;
            (var3 = new ItemMap()).I = var1.reader.dis.readInt();
            var3.idEntity = var1.reader.dis.readShort();
            var3.a(var1.reader.dis.readShort(), var1.reader.dis.readShort(), var2.k(), var2.l());
            var3.item = new Item();
            var3.item.a(var1);
            this.vItemMap.addElement(var3);
            vdtt_aa var4;
            if (!(var4 = vdtt_aa.gI()).a) {
                var4.a(var4.b[10]);
            }
        } catch (Exception var5) {
            Utlis.a(var5);
        }

    }

    public final void o(Message var1) {
        try {
            short var2 = var1.reader.dis.readShort();
            GameSrc var3 = this;
            int var4 = 0;

            ItemMap var5;
            while (true) {
                if (var4 >= var3.vItemMap.size()) {
                    var5 = null;
                    break;
                }

                ItemMap var6;
                if ((var6 = (ItemMap) var3.vItemMap.elementAt(var4)).idEntity == var2) {
                    var5 = var6;
                    break;
                }

                ++var4;
            }

            if (var5 != null) {
                var5.p = true;
                Char var7;
                if ((var7 = this.m(var1.reader.dis.readInt())).idEntity == Char.gI().idEntity) {
                    Item var8;
                    (var8 = new Item()).a(var1);
                    int var9 = var8.M();
                    if (var7.arrItemBag[var8.index] != null) {
                        var9 -= var7.arrItemBag[var8.index].M();
                    }

                    var7.arrItemBag[var8.index] = var8;
                    a(var9, var8);
                    vdtt_aa var10;
                    if (!(var10 = vdtt_aa.gI()).a) {
                        var10.a(var10.b[11]);
                    }
                }

                var5.H = 20;
                var5.a(var7.k(), var7.l(), var5.cx, var5.cy);
            }
        } catch (Exception var11) {
            Utlis.a(var11);
        }

    }

    public final void p(Message var1) {
        try {
            short var2 = var1.reader.dis.readShort();
            int var3 = 0;

            while (true) {
                if (var3 >= this.vItemMap.size()) {
                    return;
                }

                if (((ItemMap) this.vItemMap.elementAt(var3)).idEntity == var2) {
                    this.vItemMap.remove(var3);
                    break;
                }

                ++var3;
            }
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public static void q(Message var0) {
        try {
            int var1;
            for (var1 = 0; var1 < Char.gI().arrItemBag.length; ++var1) {
                Char.gI().arrItemBag[var1] = null;
            }

            for (var1 = 0; var1 < Char.gI().arrItemBody.length; ++var1) {
                Char.gI().arrItemBody[var1] = null;
            }

            for (var1 = 0; var1 < Char.gI().arrItemBody2.length; ++var1) {
                Char.gI().arrItemBody2[var1] = null;
            }

            Char.gI().bac = var0.reader.dis.readInt();
            short var2 = var0.reader.dis.readShort();

            for (int var3 = 0; var3 < var2; ++var3) {
                Item var4;
                (var4 = new Item()).a(var0);
                Char.gI().arrItemBag[var4.index] = var4;
            }

            Char.gI();
            Char.a(var0, Char.gI().arrItemBody);
            Char.gI();
            Char.a(var0, Char.gI().arrItemBody2);
            vdtt_w var6;
            if ((var6 = gI().c) instanceof vdtt_jo) {
                ((vdtt_jo) var6).A();
            }
        } catch (Exception var5) {
            Utlis.a(var5);
        }

    }

    public final void r(Message var1) {
        try {
            byte var2 = var1.reader.dis.readByte();

            for (int var3 = 0; var3 < var2; ++var3) {
                byte var4 = var1.reader.dis.readByte();
                Char.gI().i(var4)[var1.reader.dis.readShort()] = null;
            }

            Item var8;
            (var8 = new Item()).a(var1);
            var8.w = var1.reader.dis.readByte();
            if (var8.w == 2 || var8.w == 3) {
                var8.index = var8.getItemTemplate().type;
            }

            Char.gI().i(var8.w)[var8.index] = var8;
            vdtt_w var9;
            if ((var9 = super.c) instanceof vdtt_nc) {
                vdtt_nc var5;
                (var5 = (vdtt_nc) var9).S = true;
                var5.R = new vdtt_hf(114, 0, 0, 1);

                for (int var6 = 0; var6 < var5.aa.length; ++var6) {
                    var5.aa[var6] = null;
                }

                var5.N = var8;
            }
        } catch (Exception var7) {
        }

    }

    public final void s(Message var1) {
        try {
            byte var2 = var1.reader.dis.readByte();

            for (int var3 = 0; var3 < var2; ++var3) {
                byte var4 = var1.reader.dis.readByte();
                Char.gI().i(var4)[var1.reader.dis.readShort()] = null;
            }

            Item var8;
            (var8 = new Item()).a(var1);
            var8.w = var1.reader.dis.readByte();
            if (var8.w == 2 || var8.w == 3) {
                var8.index = var8.getItemTemplate().type;
            }

            Char.gI().i(var8.w)[var8.index] = var8;
            vdtt_w var9;
            if ((var9 = super.c) instanceof vdtt_jh) {
                vdtt_jh var5;
                (var5 = (vdtt_jh) var9).S = true;
                var5.R = new vdtt_hf(114, 0, 0, 1);

                for (int var6 = 0; var6 < var5.aa.length; ++var6) {
                    var5.aa[var6] = null;
                }

                var5.N = var8;
            }
        } catch (Exception var7) {
        }

    }

    public final void t(Message var1) {
        try {
            Char.gI().a(var1.reader.dis.readInt(), false, false);
            Char.gI().b(var1.reader.dis.readInt(), false, false);
            byte var2 = var1.reader.dis.readByte();

            for (int var3 = 0; var3 < var2; ++var3) {
                Char.gI().arrItemBag[var1.reader.dis.readShort()] = null;
            }

            Item var8;
            (var8 = new Item()).a(var1);
            Char.gI().arrItemBag[var8.index] = var8;
            vdtt_w var4;
            if (!((var4 = super.c) instanceof vdtt_nd)) {
                DataCenter.gI().currentScreen.c(Caption.pA + " " + var8.getItemTemplate().name, -2560);
                return;
            }

            vdtt_nd var5;
            (var5 = (vdtt_nd) var4).Q = new vdtt_hf(114, 0, 0, 1);

            for (int var6 = 0; var6 < var5.O.length; ++var6) {
                var5.O[var6] = null;
            }

            var5.N = var8;
        } catch (Exception var7) {
        }

    }

    public final void u(Message var1) {
        try {
            boolean var2 = var1.reader.dis.readBoolean();
            boolean var3 = var1.reader.dis.readBoolean();
            Char.gI().a(var1.reader.dis.readInt(), false, false);
            Char.gI().b(var1.reader.dis.readInt(), false, false);
            byte var4 = var1.reader.dis.readByte();
            int var5;
            if (!var3) {
                for (var5 = 0; var5 < var4; ++var5) {
                    Char.gI().arrItemBag[var1.reader.dis.readShort()] = null;
                }
            } else {
                var5 = 0;

                while (true) {
                    if (var5 >= var4) {
                        vdtt_w var6;
                        if ((var6 = super.c) instanceof vdtt_na) {
                            vdtt_na var7;
                            (var7 = (vdtt_na) var6).C();
                        }
                        break;
                    }

                    var1.reader.dis.readShort();
                    ++var5;
                }
            }

            short var12;
            if ((var12 = var1.reader.dis.readShort()) >= 0) {
                Char.gI().arrItemBag[var12] = null;
            }

            Item var13;
            (var13 = new Item()).a(var1);
            var13.w = var1.reader.dis.readByte();
            if (var13.w == 2 || var13.w == 3) {
                var13.index = var13.getItemTemplate().type;
            }

            Char.gI().i(var13.w)[var13.index] = var13;
            vdtt_w var8;
            if ((var8 = super.c) instanceof vdtt_na) {
                vdtt_na var9;
                (var9 = (vdtt_na) var8).Q[0] = 100;
                var9.S = new vdtt_hf(114, 0, 0);
                if (var2) {
                    var9.R = 1;
                } else {
                    var9.R = 2;
                }

                int var10;
                for (var10 = 0; var10 < var9.O.length; ++var10) {
                    var9.O[var10] = null;
                }

                for (var10 = 0; var10 < var9.N.length; ++var10) {
                    var9.N[var10] = null;
                }

                var9.N[0] = var13;
                Char.gI().i(var13.w)[var13.index] = null;
            }
        } catch (Exception var11) {
        }

    }

    public final void v(Message var1) {
        try {
            Char.gI().arrItemBag[var1.reader.dis.readShort()] = null;
            Item var2;
            (var2 = new Item()).a(var1);
            var2.w = var1.reader.dis.readByte();

            try {
                Char.gI().arrItemBag[var1.reader.dis.readShort()] = null;
            } catch (Exception var6) {
            }

            if (var2.w == 2 || var2.w == 3) {
                var2.index = var2.getItemTemplate().type;
            }

            Char.gI().i(var2.w)[var2.index] = var2;
            vdtt_w var3;
            if ((var3 = super.c) instanceof vdtt_lo) {
                vdtt_lo var4;
                (var4 = (vdtt_lo) var3).Q[2] = 50;
                var4.R = new vdtt_hf(114, 0, 0);

                int var5;
                for (var5 = 0; var5 < var4.O.length; ++var5) {
                    var4.O[var5] = null;
                }

                for (var5 = 0; var5 < var4.N.length; ++var5) {
                    var4.N[var5] = null;
                }

                var4.N[0] = var2;
                Char.gI().i(var2.w)[var2.index] = null;
            }
        } catch (Exception var7) {
            Utlis.a(var7);
        }

    }

    public final void w(Message var1) {
        try {
            vdtt_ky var2;
            if (!var1.reader.dis.readBoolean()) {
                vdtt_w var3;
                if ((var3 = super.c) instanceof vdtt_ky) {
                    (var2 = (vdtt_ky) var3).S = 2;
                    var2.Q[0] = 50;
                    var2.R = new vdtt_hf(114, 0, 0);
                }
            } else {
                Item var7;
                (var7 = new Item()).a(var1);
                var7.w = var1.reader.dis.readByte();
                if (var7.w == 2 || var7.w == 3) {
                    var7.index = var7.getItemTemplate().type;
                }

                Char.gI().i(var7.w)[var7.index] = null;
                (var7 = new Item()).a(var1);
                var7.w = var1.reader.dis.readByte();
                if (var7.w == 2 || var7.w == 3) {
                    var7.index = var7.getItemTemplate().type;
                }

                Char.gI().i(var7.w)[var7.index] = var7;
                vdtt_w var4;
                if ((var4 = super.c) instanceof vdtt_ky) {
                    (var2 = (vdtt_ky) var4).S = 1;
                    var2.Q[0] = 50;
                    var2.R = new vdtt_hf(114, 0, 0);

                    int var5;
                    for (var5 = 0; var5 < var2.O.length; ++var5) {
                        var2.O[var5] = null;
                    }

                    for (var5 = 0; var5 < var2.N.length; ++var5) {
                        var2.N[var5] = null;
                    }

                    var2.N[1] = var7;
                }
            }
        } catch (Exception var6) {
            Utlis.a(var6);
        }

    }

    public final void x(Message var1) {
        try {
            Item var2;
            (var2 = new Item()).a(var1);
            var2.w = var1.reader.dis.readByte();
            if (var2.w == 2 || var2.w == 3) {
                var2.index = var2.getItemTemplate().type;
            }

            Char.gI().i(var2.w)[var2.index] = var2;
            vdtt_w var3;
            if ((var3 = super.c) instanceof vdtt_mj) {
                vdtt_mj var4;
                (var4 = (vdtt_mj) var3).Q = true;
                var4.R = new vdtt_hf(114, 0, 0);

                int var5;
                for (var5 = 0; var5 < var4.O.length; ++var5) {
                    var4.O[var5] = null;
                }

                for (var5 = 0; var5 < var4.N.length; ++var5) {
                    var4.N[var5] = null;
                }

                var4.N[1] = var2;
            }
        } catch (Exception var6) {
        }

    }

    public final void y(Message var1) {
        try {
            Item var2;
            (var2 = new Item()).a(var1);
            var2.w = var1.reader.dis.readByte();
            if (var2.w == 2 || var2.w == 3) {
                var2.index = var2.getItemTemplate().type;
            }

            Char.gI().i(var2.w)[var2.index] = var2;
            vdtt_w var3;
            if ((var3 = super.c) instanceof vdtt_mi) {
                vdtt_mi var4;
                (var4 = (vdtt_mi) var3).O = true;
                var4.S[0] = 50;
                var4.P = new vdtt_hf(114, 0, 0);

                int var5;
                for (var5 = 0; var5 < var4.N.length; ++var5) {
                    var4.N[var5] = null;
                }

                for (var5 = 0; var5 < var4.ab.length; ++var5) {
                    var4.ab[var5] = null;
                }

                var4.ab[1] = var2;
            }
        } catch (Exception var6) {
        }

    }

    public final void z(Message var1) {
        try {
            Item var2;
            (var2 = new Item()).a(var1);
            var2.w = var1.reader.dis.readByte();
            if (var2.w == 2 || var2.w == 3) {
                var2.index = var2.getItemTemplate().type;
            }

            Char.gI().i(var2.w)[var2.index] = var2;
            Item var3;
            (var3 = new Item()).a(var1);
            var3.w = var1.reader.dis.readByte();
            if (var3.w == 2 || var3.w == 3) {
                var3.index = var3.getItemTemplate().type;
            }

            Char.gI().i(var3.w)[var3.index] = var3;
            Char.gI().arrItemBag[var1.reader.dis.readShort()] = null;
            vdtt_w var4;
            if ((var4 = super.c) instanceof vdtt_kj) {
                vdtt_kj var5;
                (var5 = (vdtt_kj) var4).P = true;
                var5.Q = new vdtt_hf(114, 0, 0);

                for (int var6 = 0; var6 < var5.N.length; ++var6) {
                    var5.N[var6] = null;
                }

                var5.N[0] = var2;
                var5.N[1] = var3;
            }
        } catch (Exception var7) {
        }

    }

    public final void A(Message var1) {
        try {
            Item var2;
            (var2 = new Item()).a(var1);
            var2.w = var1.reader.dis.readByte();
            if (var2.w == 2 || var2.w == 3) {
                var2.index = var2.getItemTemplate().type;
            }

            Char.gI().i(var2.w)[var2.index] = var2;
            Item var3;
            (var3 = new Item()).a(var1);
            var3.w = var1.reader.dis.readByte();
            if (var3.w == 2 || var3.w == 3) {
                var3.index = var3.getItemTemplate().type;
            }

            Char.gI().i(var3.w)[var3.index] = var3;
            Char.gI().arrItemBag[var1.reader.dis.readShort()] = null;
            vdtt_w var4;
            if ((var4 = super.c) instanceof vdtt_kk) {
                vdtt_kk var5;
                (var5 = (vdtt_kk) var4).N = true;
                var5.O = new vdtt_hf(114, 0, 0);

                for (int var6 = 0; var6 < var5.aa.length; ++var6) {
                    var5.aa[var6] = null;
                }

                var5.aa[0] = var2;
                var5.aa[1] = var3;
            }
        } catch (Exception var7) {
        }

    }

    public final void B(Message var1) {
        try {
            Item var2;
            (var2 = new Item()).a(var1);
            var2.w = var1.reader.dis.readByte();
            if (var2.w == 2 || var2.w == 3) {
                var2.index = var2.getItemTemplate().type;
            }

            Char.gI().i(var2.w)[var2.index] = var2;
            byte var3 = var1.reader.dis.readByte();

            for (int var4 = 0; var4 < var3; ++var4) {
                Char.gI().arrItemBag[var1.reader.dis.readShort()] = null;
            }

            vdtt_w var8;
            if ((var8 = super.c) instanceof vdtt_nb) {
                vdtt_nb var5;
                (var5 = (vdtt_nb) var8).Q = 100;
                var5.R = new vdtt_hf(114, 0, 0);

                for (int var6 = 0; var6 < var5.O.length; ++var6) {
                    var5.O[var6] = null;
                }

                var5.N[0] = var2;
                Char.gI().i(var2.w)[var2.index] = null;
            }
        } catch (Exception var7) {
        }

    }

    public final void C(Message var1) {
        try {
            Item var2;
            (var2 = new Item()).a(var1);
            var2.w = var1.reader.dis.readByte();
            if (var2.w == 2 || var2.w == 3) {
                var2.index = var2.getItemTemplate().type;
            }

            Char.gI().i(var2.w)[var2.index] = var2;
            byte var3 = var1.reader.dis.readByte();

            int var4;
            for (var4 = 0; var4 < var3; ++var4) {
                Char.gI().arrItemBag[var1.reader.dis.readShort()] = null;
            }

            vdtt_w var5;
            if ((var5 = super.c) instanceof vdtt_mw) {
                vdtt_mw var6;
                (var6 = (vdtt_mw) var5).R = new vdtt_hf(114, 0, 0);
                var6.Q = 200;
                var6.S = true;

                for (var4 = 0; var4 < var6.O.length; ++var4) {
                    var6.O[var4] = null;
                }

                var6.N[0] = null;
                var6.N[1] = var2;
            } else if (var5 instanceof vdtt_mv) {
                vdtt_mv var8;
                (var8 = (vdtt_mv) var5).R = new vdtt_hf(114, 0, 0);
                var8.Q = 200;
                var8.S = true;

                for (var4 = 0; var4 < var8.O.length; ++var4) {
                    var8.O[var4] = null;
                }

                var8.N[0] = null;
                var8.N[1] = var2;
            } else {
                if (!(var5 instanceof vdtt_my)) {
                    if (var5 instanceof vdtt_mx) {
                        vdtt_mx var10;
                        (var10 = (vdtt_mx) var5).R = new vdtt_hf(114, 0, 0);
                        var10.Q = 200;
                        var10.S = true;

                        for (var4 = 0; var4 < var10.O.length; ++var4) {
                            var10.O[var4] = null;
                        }

                        var10.N[0] = null;
                        var10.N[1] = var2;
                    }

                    return;
                }

                vdtt_my var9;
                (var9 = (vdtt_my) var5).R = new vdtt_hf(114, 0, 0);
                var9.Q = 200;
                var9.S = true;

                for (var4 = 0; var4 < var9.O.length; ++var4) {
                    var9.O[var4] = null;
                }

                var9.N[0] = null;
                var9.N[1] = var2;
            }
        } catch (Exception var7) {
        }

    }

    public final void D(Message var1) {
        try {
            int var2 = gI().bk.length;
            short var3 = var1.reader.dis.readShort();
            gI().bk = new ItemCho[var1.reader.dis.readShort()];

            int var4;
            for (var4 = 0; var4 < gI().bk.length; ++var4) {
                gI().bk[var4] = new ItemCho();
                gI().bk[var4].id = var1.reader.dis.readLong();
                gI().bk[var4].namePlayerSell = var1.reader.readUTF();
                gI().bk[var4].bac = var1.reader.dis.readInt();
                gI().bk[var4].time = var1.reader.dis.readInt();
                gI().bk[var4].item = new Item();
                gI().bk[var4].item.a(var1);
            }

            var4 = 0;

            while (true) {
                if (var4 >= this.b.size()) {
                    return;
                }

                if (this.b.get(var4) instanceof vdtt_ll) {
                    vdtt_ll var5 = (vdtt_ll) this.b.get(var4);
                    if (gI().bk.length > 0) {
                        var5.O = var3;
                    } else if (var2 != gI().bk.length) {
                        var5.O = var3;
                    }

                    var5.F();
                    break;
                }

                ++var4;
            }
        } catch (Exception var6) {
        }

    }

    public final void E(Message var1) {
        try {
            gI().bj = new ItemCho[var1.reader.dis.readShort()];

            int var2;
            for (var2 = 0; var2 < gI().bj.length; ++var2) {
                gI().bj[var2] = new ItemCho();
                gI().bj[var2].id = var1.reader.dis.readLong();
                gI().bj[var2].namePlayerSell = Char.gI().name;
                gI().bj[var2].bac = var1.reader.dis.readInt();
                gI().bj[var2].time = var1.reader.dis.readInt();
                gI().bj[var2].item = new Item();
                gI().bj[var2].item.a(var1);
            }

            var2 = 0;

            while (true) {
                if (var2 >= this.b.size()) {
                    return;
                }

                if (this.b.get(var2) instanceof vdtt_ll) {
                    ((vdtt_ll) this.b.get(var2)).G();
                    break;
                }

                ++var2;
            }
        } catch (Exception var3) {
        }

    }

    public final void a(Pixmap var1, EntityPanel var2, int var3, int var4, int var5) {
        a(var1, var2, 0, 0, 0, -427923391);
    }

    public static void a(Pixmap var0, EntityPanel var1, int var2, int var3, int var4, int var5) {
        var3 -= var4 / 2;
        if (DataCenter.k()) {
            var0.setColor(Utlis.b(-530423198L));
            var0.setBlending(Blending.SourceOver);
            var0.fillRectangle(var2 * DataCenter.gI().r, var3 * DataCenter.gI().r, (var1.width - 2) * DataCenter.gI().r, (var1.height + var4 - 2) * DataCenter.gI().r);
        } else {
            var0.setColor(Utlis.b((long) var5));
            var0.setBlending(Blending.SourceOver);
            var0.fillRectangle((var2 + 1) * DataCenter.gI().r, (var3 + 1) * DataCenter.gI().r, (var1.width - 2) * DataCenter.gI().r, (var1.height + var4 - 2) * DataCenter.gI().r);
            mImage var6;
            int var7 = (var6 = vdtt_cz.c(22)).c / DataCenter.gI().r;
            vdtt_y.a(var0, var6, var2 * DataCenter.gI().r, var3 * DataCenter.gI().r, Blending.SourceOver);
            mImage var8 = mImage.b(var6, 0, 0, var6.c, var6.d, -360);
            vdtt_y.a(var0, var8, (var2 + var1.width - var7) * DataCenter.gI().r, var3 * DataCenter.gI().r, Blending.SourceOver);
            var8.a();
            var8 = mImage.b(var6, 0, 0, var6.c, var6.d, -180);
            vdtt_y.a(var0, var8, var2 * DataCenter.gI().r, (var3 + var1.height + var4 - var7) * DataCenter.gI().r, Blending.SourceOver);
            var8.a();
            var8 = mImage.b(var6, 0, 0, var6.c, var6.d, -270);
            vdtt_y.a(var0, var8, (var2 + var1.width - var7) * DataCenter.gI().r, (var3 + var1.height + var4 - var7) * DataCenter.gI().r, Blending.SourceOver);
            var8.a();
            var6 = vdtt_cz.c(23);
            vdtt_y.a(var0, var6.b, (var2 + var7) * DataCenter.gI().r, var3 * DataCenter.gI().r, (var1.width - var7 * 2) * DataCenter.gI().r, 0, Blending.SourceOver);
            var8 = mImage.b(var6, 0, 0, var6.c, var6.d, 180);
            vdtt_y.a(var0, var8.b, (var2 + var7) * DataCenter.gI().r, (var3 + var1.height + var4 - var6.c / DataCenter.gI().r) * DataCenter.gI().r, (var1.width - var7 * 2) * DataCenter.gI().r, 0, Blending.SourceOver);
            var8.a();
            var8 = mImage.b(var6, 0, 0, var6.c, var6.d, 270);
            vdtt_y.a(var0, var8.b, var2 * DataCenter.gI().r, (var3 + var7) * DataCenter.gI().r, 0, (var1.height + var4 - var7 * 2) * DataCenter.gI().r, Blending.SourceOver);
            var8.a();
            var8 = mImage.b(var6, 0, 0, var6.c, var6.d, 90);
            vdtt_y.a(var0, var8.b, (var2 + var1.width - var6.c / DataCenter.gI().r) * DataCenter.gI().r, (var3 + var7) * DataCenter.gI().r, 0, (var1.height + var4 - var7 * 2) * DataCenter.gI().r, Blending.SourceOver);
            var8.a();
        }

    }

    public final void F(Message var1) {
        try {
            Char.gI().b(var1.reader.dis.readInt(), false, true);
            Char.gI().arrItemBag[var1.reader.dis.readShort()] = null;
            vdtt_w var2;
            if ((var2 = super.c) instanceof vdtt_ll) {
                vdtt_ll var3;
                (var3 = var3 = (vdtt_ll) var2).N = null;
                var3.Y.a("");
                DataCenter.gI().currentScreen.c(Caption.hR, -2560);
            }
        } catch (Exception var4) {
        }

    }

    public final void G(Message var1) {
        try {
            Char.gI().a(var1.reader.dis.readInt(), false, true);
            int var2 = 0;

            while (true) {
                if (var2 >= this.b.size()) {
                    return;
                }

                if (this.b.get(var2) instanceof vdtt_ll) {
                    vdtt_ll var3;
                    (var3 = (vdtt_ll) this.b.get(var2)).D();
                    var3.C();
                    break;
                }

                ++var2;
            }
        } catch (Exception var4) {
        }

    }

    public final void H(Message var1) {
        try {
            gI().vThu.clear();
            short var2 = var1.reader.dis.readShort();

            for (int var3 = 0; var3 < var2; ++var3) {
                Thu var4;
                (var4 = new Thu()).a(var1);
                gI().vThu.add(var4);
            }

            vdtt_w var6;
            if ((var6 = super.c) instanceof vdtt_lj) {
                vdtt_lj var7;
                (var7 = (vdtt_lj) var6).D();
            }
        } catch (Exception var5) {
        }

    }

    public static void I(Message var0) {
        try {
            Char.gI().c(var0.reader.dis.readInt(), false, false);
            Char.gI().a(var0.reader.dis.readInt(), false, true);
            Char.gI().b(var0.reader.dis.readInt(), false, false);
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    public static void J(Message var0) {
        try {
            Char.gI().c(var0.reader.dis.readInt(), false, false);
            Char.gI().a(var0.reader.dis.readInt(), false, false);
            Char.gI().b(var0.reader.dis.readInt(), false, true);
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    public static void K(Message var0) {
        try {
            Char.gI().a(var0.reader.dis.readInt(), var0.reader.dis.readBoolean(), true);
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    public static void L(Message var0) {
        try {
            Char.gI().b(var0.reader.dis.readInt(), var0.reader.dis.readBoolean(), true);
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    public static void M(Message var0) {
        try {
            Char.gI().c(var0.reader.dis.readInt(), var0.reader.dis.readBoolean(), true);
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    public static void N(Message var0) {
        try {
            Char.gI();
            int var1 = var0.reader.dis.readInt();
            boolean var2 = var0.reader.dis.readBoolean();
            boolean var3 = true;
            String var6;
            if (var1 - Char.gI().vangKhoa > 0) {
                var6 = Caption.q + " " + Utlis.c(var1 - Char.gI().vangKhoa) + " " + Caption.yO[1];
                if (Char.V()) {
                    vdtt_ba.a(9, Caption.bY, var6);
                }

                if (var2) {
                    DataCenter.gI().currentScreen.c(var6, -1);
                }

                vdtt_fd.a("+" + Utlis.c(var1 - Char.gI().vangKhoa), Char.gI(), Char.gI().aJ, 10);
            } else if (var1 - Char.gI().vangKhoa < 0) {
                var6 = Caption.dw + " " + Utlis.c(-(var1 - Char.gI().vangKhoa)) + " " + Caption.yO[1];
                if (Char.V()) {
                    vdtt_ba.a(9, Caption.bY, var6);
                }

                if (var2) {
                    DataCenter.gI().currentScreen.c(var6, -1);
                }

                vdtt_fd.a(Utlis.c(var1 - Char.gI().vangKhoa), Char.gI(), Char.gI().aJ, 10);
            }

            Char.gI().vangKhoa = var1;
        } catch (Exception var7) {
            Utlis.a(var7);
        }

    }

    public final void a(Message var1, boolean var2) {
        try {
            this.cf = var1.reader.dis.readLong();
            this.b(var1, var2);
        } catch (Exception var4) {
        }

    }

    public final void b(Message var1, boolean var2) {
        try {
            long var3 = var1.reader.dis.readLong();
            Char var5 = Char.gI();

            try {
                var5 = this.m(var1.reader.dis.readInt());
            } catch (Exception var7) {
            }

            int var6 = var5.w();
            var5.a(var3, var2);
            if (var5.w() != var6 && var5.p()) {
                this.aT.d();
                gI().A();
                if (AppListener.gI().g != null) {
                    AppListener.gI();
                    (new StringBuilder()).append(DataCenter.gI().aE);
                    (new StringBuilder()).append(DataCenter.gI().server.name);
                    (new StringBuilder()).append(DataCenter.gI().aF);
                    (new StringBuilder()).append(var5.w());
                }
            }
        } catch (Exception var8) {
        }

    }

    public static void O(Message var0) {
        try {
            GameSrc var1 = gI();
            short var2 = var0.reader.dis.readShort();
            GameSrc var3 = var1;
            int var4 = 0;

            Thu var5;
            while (true) {
                if (var4 >= var3.vThu.size()) {
                    var5 = null;
                    break;
                }

                Thu var6;
                if ((var6 = (Thu) var3.vThu.get(var4)).a == var2) {
                    var5 = var6;
                    break;
                }

                ++var4;
            }

            var5.e = null;
            var5.f = 0;
            var5.g = 0;
            var5.h = 0;
            var5.i = 0;
            var5.j = 0L;
            if (gI().c.k != null && gI().c.k instanceof vdtt_bn) {
                ((vdtt_bn) gI().c.k).d();
            }
        } catch (Exception var7) {
        }

    }

    public static void a(Item[] var0) {
        try {
            Vector var1 = new Vector();

            int var2;
            for (var2 = 0; var2 < var0.length; ++var2) {
                if (var0[var2] != null) {
                    var1.add(var0[var2]);
                }

                var0[var2] = null;
            }

            for (var2 = 0; var2 < var1.size(); ++var2) {
                Item var3;
                if ((var3 = (Item) var1.get(var2)).getItemTemplate().isXepChong) {
                    for (int var4 = var1.size() - 1; var4 > var2; --var4) {
                        Item var5;
                        if ((var5 = (Item) var1.get(var4)).id == var3.id && var5.isLock == var3.isLock && var5.h == var3.h) {
                            var3.c(var3.M() + var5.M());
                            var1.remove(var4);
                        }
                    }
                }
            }

            for (short var7 = 0; var7 < var1.size(); var0[var7].index = var7++) {
                var0[var7] = (Item) var1.get(var7);
            }
        } catch (Exception var6) {
        }

    }

    public final void P(Message var1) {
        try {
            Char.gI().a(var1.reader.dis.readInt(), false, false);
            Char.gI().b(var1.reader.dis.readInt(), false, true);
            short var2;
            if ((var2 = var1.reader.dis.readShort()) >= 0) {
                Char.gI().arrItemBag[var2] = null;
            }

            vdtt_w var3;
            if ((var3 = super.c) instanceof vdtt_li) {
                vdtt_li var4;
                vdtt_li var5 = var4 = (vdtt_li) var3;

                try {
                    String var6;
                    if ((var6 = var5.Q.i().trim()).length() > 0) {
                        gI().ac.remove(var6);
                        gI().ac.insertElementAt(var6, 0);

                        for (int var7 = gI().ac.size() - 1; var7 > 10; --var7) {
                            gI().ac.removeElementAt(var7);
                        }
                    }
                } catch (Exception var8) {
                    Utlis.a(var8);
                }

                var5.N.b(gI().ac.size() == 0);
                vdtt_li.C();
                var4.Q.a("");
                var4.P.a("");
                var4.O.a("");
                var4.R.a("");
                var4.S = null;
            }

            DataCenter.gI().currentScreen.c(Caption.hS, -2560);
        } catch (Exception var9) {
        }

    }

    public final void Q(Message var1) {
        try {
            vdtt_w var2;
            if ((var2 = super.c) instanceof vdtt_mu) {
                vdtt_mu var3;
                (var3 = (vdtt_mu) var2).k();
            }

            Char.gI().bac = var1.reader.dis.readInt();
            Char.gI();
            Char.b(var1, Char.gI().arrItemBag);
        } catch (Exception var4) {
        }

    }

    public final void R(Message var1) {
        try {
            vdtt_w var2;
            if ((var2 = super.c) instanceof vdtt_mu) {
                vdtt_mu var3;
                (var3 = (vdtt_mu) var2).k();
            }

            Char.gI().a(var1.reader.dis.readInt(), false, true);
            short var7 = var1.reader.dis.readShort();

            int var4;
            for (var4 = 0; var4 < Char.gI().arrItemBag.length; ++var4) {
                Char.gI().arrItemBag[var4] = null;
            }

            for (var4 = 0; var4 < var7; ++var4) {
                Item var5;
                (var5 = new Item()).a(var1);
                Char.gI().arrItemBag[var5.index] = var5;
            }

            DataCenter.gI().currentScreen.c(Caption.hU, -2560);
        } catch (Exception var6) {
        }

    }

    public final void S(Message var1) {
        try {
            vdtt_w var2;
            if ((var2 = super.c) instanceof vdtt_mu) {
                vdtt_mu var3;
                (var3 = (vdtt_mu) var2).O = 1;
                var3.Q = var1.reader.dis.readInt();
                byte var4 = var1.reader.dis.readByte();

                for (int var5 = 0; var5 < var4; ++var5) {
                    var3.S[var5] = new Item();
                    var3.S[var5].a(var1);
                }

                if (var3.N == var3.O) {
                    var3.U = Utlis.a() + 5999L;
                }
            }
        } catch (Exception var6) {
        }

    }

    public final void T(Message var1) {
        try {
            Enemy var2;
            (var2 = new Enemy()).name = var1.reader.readUTF();
            var2.isOnline = var1.reader.dis.readBoolean();
            gI().vEnemy.add(var2);
            vdtt_w var3;
            if ((var3 = super.c) instanceof vdtt_mn) {
                ((vdtt_mn) var3).C();
            }
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final void U(Message var1) {
        try {
            String var2 = var1.reader.readUTF();

            for (int var3 = 0; var3 < gI().vEnemy.size(); ++var3) {
                Enemy var4;
                if ((var4 = (Enemy) gI().vEnemy.elementAt(var3)).name.equals(var2)) {
                    gI().vEnemy.remove(var4);
                    break;
                }
            }

            vdtt_w var6;
            if ((var6 = super.c) instanceof vdtt_mn) {
                ((vdtt_mn) var6).C();
            }
        } catch (Exception var5) {
            Utlis.a(var5);
        }

    }

    public final void V(Message var1) {
        try {
            String var2 = var1.reader.readUTF();

            for (int var3 = 0; var3 < gI().vEnemy.size(); ++var3) {
                Enemy var4;
                if ((var4 = (Enemy) gI().vEnemy.elementAt(var3)).name.equals(var2)) {
                    var4.isOnline = var1.reader.dis.readBoolean();
                    break;
                }
            }

            vdtt_w var6;
            if ((var6 = super.c) instanceof vdtt_mn) {
                ((vdtt_mn) var6).C();
            }
        } catch (Exception var5) {
            Utlis.a(var5);
        }

    }

    public final void W(Message var1) {
        try {
            Friend var2;
            (var2 = new Friend()).name = var1.reader.readUTF();
            var2.type = var1.reader.dis.readByte();
            var2.isOnline = var1.reader.dis.readBoolean();
            gI().vFriend.add(var2);
            this.O();
            vdtt_w var3;
            if (!((var3 = super.c) instanceof vdtt_jg)) {
                if (var3 instanceof vdtt_mn) {
                    ((vdtt_mn) var3).B();
                }

                return;
            }

            vdtt_jg var4;
            (var4 = (vdtt_jg) var3).k();
            var4.a.B();
        } catch (Exception var5) {
            Utlis.a(var5);
        }

    }

    public final void X(Message var1) {
        try {
            String var2 = var1.reader.readUTF();

            for (int var3 = 0; var3 < gI().vFriend.size(); ++var3) {
                Friend var4;
                if ((var4 = (Friend) gI().vFriend.get(var3)).name.equals(var2)) {
                    var4.type = var1.reader.dis.readByte();
                    var4.isOnline = var1.reader.dis.readBoolean();
                    break;
                }
            }

            vdtt_w var6;
            if ((var6 = super.c) instanceof vdtt_jg) {
                vdtt_jg var7;
                (var7 = (vdtt_jg) var6).k();
                var7.a.B();
            } else if (var6 instanceof vdtt_mn) {
                ((vdtt_mn) var6).B();
            }

            this.O();
        } catch (Exception var5) {
            Utlis.a(var5);
        }

    }

    public final void O() {
        this.ba = false;

        for (int var1 = 0; var1 < this.vFriend.size(); ++var1) {
            if (((Friend) this.vFriend.get(var1)).type == 2) {
                this.ba = true;
                return;
            }
        }

    }

    public final void Y(Message var1) {
        try {
            Friend var2;
            (var2 = new Friend()).name = var1.reader.readUTF();
            var2.type = var1.reader.dis.readByte();
            gI().vFriend.add(var2);
            this.O();
            DataCenter.gI().currentScreen.c(var2.name + Caption.hV, -2560);
            vdtt_w var3;
            if ((var3 = gI().c) instanceof vdtt_mn) {
                ((vdtt_mn) var3).B();
            }
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final void Z(Message var1) {
        try {
            String var2 = var1.reader.readUTF();

            for (int var3 = 0; var3 < gI().vFriend.size(); ++var3) {
                Friend var4;
                if ((var4 = (Friend) gI().vFriend.get(var3)).name.equals(var2)) {
                    gI().vFriend.remove(var4);
                    break;
                }
            }

            vdtt_w var6;
            if ((var6 = gI().c) instanceof vdtt_mn) {
                vdtt_mn var7;
                (var7 = (vdtt_mn) var6).B();
            }

            this.O();
        } catch (Exception var5) {
            Utlis.a(var5);
        }

    }

    public final void aa(Message var1) {
        try {
            this.bl.a = var1.reader.dis.readByte();
            this.bl.b = var1.reader.dis.readByte();
            this.bl.c = var1.reader.dis.readByte();
            this.bl.d = var1.reader.dis.readBoolean();
            short var2 = var1.reader.dis.readShort();

            for (int var3 = 0; var3 < var2; ++var3) {
                Item var4;
                (var4 = new Item()).a(var1);
                if (var4.h == 0L) {
                    Char.gI().arrItemBag[var4.index] = null;
                } else {
                    Char.gI().arrItemBag[var4.index] = var4;
                }
            }

            vdtt_w var6;
            if ((var6 = gI().c) instanceof vdtt_jm) {
                vdtt_jm var7;
                (var7 = (vdtt_jm) var6).h(this.bl.b);
            }
        } catch (Exception var5) {
            Utlis.a(var5);
        }

    }

    public final void ab(Message var1) {
        try {
            this.bl.b = this.bl.c = this.bl.a = -1;
            this.bl.d = false;
            vdtt_w var2;
            if ((var2 = gI().c) instanceof vdtt_jm) {
                vdtt_jm var3;
                (var3 = (vdtt_jm) var2).N = var3.O = -1;
            }
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final void ac(Message var1) {
        try {
            this.bl.a = var1.reader.dis.readByte();
            this.bl.b = var1.reader.dis.readByte();
            this.bl.c = var1.reader.dis.readByte();
            this.bl.d = var1.reader.dis.readBoolean();
            vdtt_w var2;
            if ((var2 = gI().c) instanceof vdtt_jm) {
                vdtt_jm var3;
                (var3 = (vdtt_jm) var2).h(this.bl.b);
            }
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    private void a(Skill var1, boolean var2) {
        if (!this.ac() && !Char.gI().ah() && !Char.gI().bN && !Char.gI().bP) {
            this.pointMoveMap = null;
            if (Char.gI().isDie()) {
                Char.gI().H();
            } else {
                this.aX = false;
                if (!Char.gI().L()) {
                    if (var1 == null) {
                        if (this.focusEntity != null) {
                            this.aX = true;
                            this.bp = var1;
                            this.g(false);
                        }
                    } else {
                        Char var3;
                        Object var4;
                        if (var1.e()) {
                            var3 = Char.gI();
                            var4 = null;
                            var3.aU = (vdtt_if) var4;
                            Char.gI().n();
                            Char.gI().a(var1, (Entity) null, true);
                        } else if (var1.getSkillTemplate().type == 6) {
                            this.c(Caption.hW, -1);
                        } else if (this.focusEntity != null) {
                            this.aX = true;
                            this.bp = var1;
                            if (var1.i()) {
                                var3 = Char.gI();
                                var4 = null;
                                var3.aU = (vdtt_if) var4;
                                Char.gI().n();
                            }

                            this.g(var2);
                        } else {
                            this.h(false);
                        }
                    }
                }
            }
        }

    }

    public static void a(Message var0, Char var1) {
        try {
            if (var1 == null) {
                var1 = gI().k(var0.reader.dis.readInt());
            }

            var1.hpFull = var0.reader.dis.readInt();
            var1.hp = var0.reader.dis.readInt();
        } catch (Exception var3) {
        }

    }

    public final void ad(Message var1) {
        try {
            Char var2 = this.m(var1.reader.dis.readInt());
            int var3 = var1.reader.dis.readInt();
            var2.ap = var3;
            if (var2.bT != null) {
                var2.bT.hp = var3;
            }
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public static void a(Message var0, Char var1, boolean var2) {
        try {
            byte var3 = 3;
            if (var1 == null) {
                var1 = gI().k(var0.reader.dis.readInt());
                var3 = 0;
            }

            if (var1 != null) {
                int var4;
                if (var2) {
                    var4 = var0.reader.dis.readShort();
                } else {
                    var4 = var0.reader.dis.readInt();
                }

                if (var4 < var1.hp && var1.hp <= var1.hpFull) {
                    vdtt_fd.a(Utlis.c(var1.hp - var4), var1, var1.height + 28, var3);
                }

                var1.hp = var4;
                if (var1.hp <= 0) {
                    var1.aK = var0.reader.dis.readShort();
                    var1.aL = var0.reader.dis.readShort();
                    var1.a(var0.reader.readUTF());
                }
            }
        } catch (Exception var5) {
            Utlis.a(var5);
        }

    }

    public static void b(Message var0, Char var1) {
        try {
            if (var1 == null) {
                var1 = gI().k(var0.reader.dis.readInt());
            }

            if (var1 != null) {
                var1.mpFull = var0.reader.dis.readInt();
                var1.mp = var0.reader.dis.readInt();
            }
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public static void b(Message var0, Char var1, boolean var2) {
        try {
            if (var1 == null) {
                var1 = gI().k(var0.reader.dis.readInt());
            }

            if (var1 != null) {
                if (var2) {
                    var1.mp = var0.reader.dis.readShort();
                    return;
                }

                var1.mp = var0.reader.dis.readInt();
            }
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public static void ae(Message var0) {
        try {
            vdtt_w var1;
            if ((var1 = gI().c) instanceof vdtt_jy) {
                vdtt_jy var2;
                vdtt_jy var3 = var2 = (vdtt_jy) var1;
                Message var4 = var0;
                vdtt_jy var5 = var3;

                try {
                    Char.gI().bp = var4.reader.dis.readByte();
                    int[] var6;
                    (var6 = new int[21])[0] = var4.reader.dis.readInt();
                    var6[1] = var4.reader.dis.readInt();
                    var6[2] = var4.reader.dis.readShort();
                    var6[3] = var4.reader.dis.readShort();
                    var6[4] = var4.reader.dis.readShort();
                    var6[5] = var4.reader.dis.readShort();
                    var6[6] = var4.reader.dis.readShort();
                    var6[7] = var4.reader.dis.readShort();
                    var6[8] = var4.reader.dis.readShort();
                    var6[9] = var4.reader.dis.readShort();
                    var6[10] = var4.reader.dis.readShort();
                    var6[11] = var4.reader.dis.readShort();
                    var6[12] = var4.reader.dis.readShort();
                    var6[13] = var4.reader.dis.readShort();
                    var6[14] = var4.reader.dis.readShort();
                    var6[15] = var4.reader.dis.readShort();
                    var6[16] = var4.reader.dis.readShort();
                    var6[17] = var4.reader.dis.readShort();
                    var6[18] = var4.reader.dis.readShort();
                    var6[19] = var4.reader.dis.readShort();
                    var6[20] = var4.reader.dis.readShort();
                    var5.N = true;
                    var5.g(var5.al);
                    String var7 = "";

                    int var8;
                    for (var8 = 0; var8 < Caption.yx.length; ++var8) {
                        if (var8 == 0) {
                            var7 = var7 + Caption.yx[var8] + ": " + var6[var8] * 90 / 100 + " - " + var6[var8];
                        } else {
                            var7 = var7 + Caption.yx[var8] + ": " + var6[var8] + (var8 != 16 && var8 != 17 && var8 != 18 && var8 != 19 && var8 != 20 ? "" : "%");
                        }

                        if (var8 < Caption.yx.length - 1) {
                            var7 = var7 + "\n";
                        }
                    }

                    var5.at[2] = var7.split("\n");
                    var5.am[0][2] = new vdtt_hp((byte) 1, var5.an.cx + 5, var5.f() + 34, var5.width - 8 - 12, (var5.height - 70) / 15 * 15, 15, var5.at[2].length);

                    for (var8 = 0; var8 < var5.au.length; ++var8) {
                        if (var8 == var5.au.length - 1) {
                            var5.au[var8] = new vdtt_ay(var5.am[0][2].cx + var5.am[0][2].width - 35, (var5.am[0][2].i - 1) * var5.am[0][2].h, 0, 0, Caption.qt, var5, 1031 + var8, -17);
                            var5.av[var8] = new vdtt_hp((byte) 1, var5.am[0][2].cx + var5.am[0][2].width - 35, (var5.am[0][2].i - 1) * var5.am[0][2].h, 50, 15, 15, 1);
                        } else if (var8 == var5.au.length - 2) {
                            var5.au[var8] = new vdtt_ay(var5.am[0][2].cx + var5.am[0][2].width - 35, (var5.am[0][2].i - 2) * var5.am[0][2].h, 0, 0, Caption.qt, var5, 1031 + var8, -31);
                            var5.av[var8] = new vdtt_hp((byte) 1, var5.am[0][2].cx + var5.am[0][2].width - 35, (var5.am[0][2].i - 1) * var5.am[0][2].h, 50, 15, 15, 1);
                        } else if (var8 >= 5) {
                            var5.au[var8] = new vdtt_ay(var5.am[0][2].cx + var5.am[0][2].width - 35, (6 + var8) * var5.am[0][2].h, 0, 0, Caption.qt, var5, 1031 + var8, -31);
                            var5.av[var8] = new vdtt_hp((byte) 1, var5.am[0][2].cx + var5.am[0][2].width - 35, (6 + var8) * var5.am[0][2].h, 50, 15, 15, 1);
                        } else {
                            var5.au[var8] = new vdtt_ay(var5.am[0][2].cx + var5.am[0][2].width - 35, (6 + var8) * var5.am[0][2].h, 0, 0, Caption.qt, var5, 1031 + var8, -17);
                            var5.av[var8] = new vdtt_hp((byte) 1, var5.am[0][2].cx + var5.am[0][2].width - 35, (6 + var8) * var5.am[0][2].h, 50, 15, 15, 1);
                        }
                    }

                    return;
                } catch (Exception var9) {
                    Utlis.a(var9);
                }
            }
        } catch (Exception var10) {
            Utlis.a(var10);
        }

    }

    public static void af(Message var0) {
        try {
            vdtt_w var1;
            if ((var1 = gI().c) instanceof vdtt_jy) {
                vdtt_jy var2;
                vdtt_jy var3 = var2 = (vdtt_jy) var1;
                Message var4 = var0;
                vdtt_jy var5 = var3;
                long[] var6 = new long[10];

                try {
                    var5.U.hpFull = var4.reader.dis.readInt();
                    var5.U.hp = var4.reader.dis.readInt();
                    var5.U.mpFull = var4.reader.dis.readInt();
                    var5.U.mp = var4.reader.dis.readInt();
                    var5.U.l = var4.reader.dis.readByte();
                    var6[0] = (long) var4.reader.dis.readShort();
                    var6[1] = (long) var4.reader.dis.readShort();
                    var6[2] = (long) var4.reader.dis.readByte();
                    var6[3] = (long) var4.reader.dis.readInt();
                    var6[4] = (long) var4.reader.dis.readShort();
                    var6[5] = (long) var4.reader.dis.readShort();
                    var6[6] = (long) var4.reader.dis.readInt();
                    var6[7] = (long) var4.reader.dis.readInt();
                    var6[8] = (long) var4.reader.dis.readShort();
                    var6[9] = (long) var4.reader.dis.readInt();
                } catch (Exception var10) {
                }

                String var7 = "";
                var7 = var7 + Caption.zc[3] + " " + var3.U.name + "\n";
                var7 = var7 + Caption.E + ": " + DataCenter.gI().dataNameChar[var3.U.sys].name + "\n";
                StringBuilder var8 = (new StringBuilder()).append(var7).append(Caption.tU).append(var3.U.A());
                DataCenter.gI();
                var7 = var8.append(DataCenter.b(var3.U.w())).append("\n").toString();
                var7 = var7 + Caption.ef + var3.U.l + "\n";
                var7 = var7 + Caption.dU + var3.U.hp + "/" + var3.U.hpFull + "\n";
                var7 = var7 + Caption.dV + var3.U.mp + "/" + var3.U.mpFull + "\n";
                if (var3.U.giatoc != null) {
                    var7 = var7 + Caption.ei + var3.U.giatoc.a + "\n";
                    String var9 = Caption.ej;
                    if (var3.U.giatoc.c == 5) {
                        var9 = Caption.ek;
                    } else if (var3.U.giatoc.c == 4) {
                        var9 = Caption.el;
                    } else if (var3.U.giatoc.c == 3) {
                        var9 = Caption.em;
                    }

                    var7 = var7 + Caption.en + var9 + "\n";
                } else {
                    var7 = var7 + Caption.eo + "\n";
                }

                int var12;
                for (var12 = 0; var12 < Caption.yz.length; ++var12) {
                    if (var12 != 0 && var12 != 1) {
                        if (var12 == 2) {
                            var7 = var7 + Caption.yz[var12] + ": " + Utlis.c(var6[var12]) + "%";
                        } else {
                            var7 = var7 + Caption.yz[var12] + ": " + Utlis.c(var6[var12]);
                        }
                    } else if (var6[var12] % 10L == 0L) {
                        var7 = var7 + Caption.yz[var12] + ": " + var6[var12] / 10L + "%";
                    } else {
                        var7 = var7 + Caption.yz[var12] + ": " + (float) var6[var12] / 10.0F + "%";
                    }

                    if (var12 == 1 && var6[var12] < 0L) {
                        var7 = var7 + Caption.wF;
                    }

                    if (var12 < Caption.yz.length - 1) {
                        var7 = var7 + "\n";
                    }
                }

                var3.at[1] = var7.split("\n");
                var3.am[0][1] = new vdtt_hp((byte) 1, var3.an.cx + 5, var3.f() + 34, var3.width - 8 - 12, (var3.height - 70) / 15 * 15, 15, var3.at[1].length);

                for (var12 = 0; var12 < var5.aw.length; ++var12) {
                    if (var12 == var5.aw.length - 1) {
                        var5.aw[var12] = new vdtt_ay(var5.am[0][1].cx + var5.am[0][1].width - 35, (var5.am[0][1].i - 1) * var5.am[0][1].h, 0, 0, Caption.qt, var5, 1031 + var12, -17);
                        var5.av[var12] = new vdtt_hp((byte) 1, var5.am[0][2].cx + var5.am[0][1].width - 35, (var5.am[0][1].i - 1) * var5.am[0][2].h, 50, 15, 15, 1);
                    } else if (var12 == var5.aw.length - 2) {
                        var5.aw[var12] = new vdtt_ay(var5.am[0][1].cx + var5.am[0][1].width - 35, (var5.am[0][1].i - 2) * var5.am[0][2].h, 0, 0, Caption.qt, var5, 1031 + var12, -17);
                        var5.ax[var12] = new vdtt_hp((byte) 1, var5.am[0][2].cx + var5.am[0][1].width - 35, (var5.am[0][1].i - 1) * var5.am[0][2].h, 50, 15, 15, 1);
                    }
                }
            }
        } catch (Exception var11) {
            Utlis.a(var11);
        }

    }

    public final void a(int var1, short var2, short var3) {
        try {
            Char var4 = this.m(var1);
            Skill var5;
            if ((var5 = DataCenter.gI().skill[var2].a()) != null) {
                if (var5.i()) {
                    var4.o();
                }

                Mob var6;
                if ((var6 = this.j(var3)) != null) {
                    var6.Y = var4;
                }

                if (var4.idEntity != Char.gI().idEntity) {
                    if (var4.bc.size() > 0) {
                        vdtt_gj var7 = (vdtt_gj) var4.bc.lastElement();
                        var4.pointMove = var7;
                        var4.ae = var4.pointMove;
                        var4.bc.clear();
                    } else {
                        var4.ae = var4.pointMove;
                    }

                    var4.a(var5, var6, false);
                    if (this.bq != null && this.bq.a(var4)) {
                        this.bq.a = var6;
                    }
                }
            }
        } catch (Exception var8) {
            Utlis.a(var8);
        }

    }

    public static void p(int var0) {
        try {
            Item var1;
            if ((var1 = Char.gI().arrItemBody[0]) != null) {
                ItemOption[] var2 = var1.L();
                ItemOption var3 = null;
                ItemOption var4 = null;

                for (int var5 = 0; var5 < var2.length; ++var5) {
                    if (var2[var5].option[0] == 285) {
                        var3 = var2[var5];
                    } else if (var2[var5].option[0] == 407) {
                        var4 = var2[var5];
                        break;
                    }
                }

                var4.c(var4.option[1] + (var0 - var3.option[1]));
                var3.c(var0);
                var1.strData = Item.a(var2);
            }
        } catch (Exception var6) {
        }

    }

    public final void ag(Message var1) {
        try {
            this.j(var1.reader.dis.readShort()).hp = var1.reader.dis.readInt();
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public final void ah(Message var1) {
        try {
            Mob var2 = this.j(var1.reader.dis.readShort());
            int var3 = var1.reader.dis.readInt();
            boolean var4 = false;

            try {
                var4 = var1.reader.dis.readBoolean();
            } catch (Exception var6) {
            }

            a(var2, var3, var4);
        } catch (Exception var7) {
            Utlis.a(var7);
        }

    }

    public final void ai(Message var1) {
        try {
            Mob var2 = this.j(var1.reader.dis.readByte());
            short var3 = var1.reader.dis.readShort();
            boolean var4 = false;

            try {
                var4 = var1.reader.dis.readBoolean();
            } catch (Exception var6) {
            }

            a(var2, var3, var4);
        } catch (Exception var7) {
            Utlis.a(var7);
        }

    }

    private static void a(Mob var0, int var1, boolean var2) {
        if (var0 != null) {
            if (var1 == var0.hp) {
                if (var0.getMobTemplate().type != 8) {
                    vdtt_fd.a("", var0, var0.height + 10, 2);
                }
            } else if (var0.hp - var1 > 0) {
                if (var2) {
                    vdtt_fd.a(Utlis.c(var0.hp - var1), var0, var0.height + 10, 1);
                } else {
                    vdtt_fd.a(Utlis.c(Utlis.b(var0.hp - var1)), var0, var0.height + 10, 0);
                }
            }

            if (var0.hp > 0) {
                var0.hp = var1;
                return;
            }

            if (var0.hp <= 0) {
                var0.status = 4;
            }
        }

    }

    public final void aj(Message var1) {
        try {
            ItemMap var2;
            (var2 = new ItemMap()).I = var1.reader.dis.readInt();
            var2.idEntity = var1.reader.dis.readShort();
            var2.cx = var2.l = var1.reader.dis.readShort();
            var2.cy = var2.m = var1.reader.dis.readShort();
            var2.item = new Item();
            var2.item.a(var1);
            this.vItemMap.addElement(var2);
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public final void ak(Message var1) {
        try {
            this.j(var1.reader.dis.readShort());
            ItemMap var2;
            (var2 = new ItemMap()).I = var1.reader.dis.readInt();
            var2.idEntity = var1.reader.dis.readShort();
            var2.cx = var2.l = var1.reader.dis.readShort();
            var2.cy = var2.m = var1.reader.dis.readShort();
            var2.item = new Item();
            var2.item.a(var1);
            gI().vItemMap.addElement(var2);
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public final void al(Message var1) {
        try {
            Mob var2;
            (var2 = this.j(var1.reader.dis.readShort())).aa.clear();
            var2.c(var2.H, var2.I);
            var2.as = true;
            var2.level = var1.reader.dis.readShort();
            var2.hp = var1.reader.dis.readInt();
            var2.hpFull = var1.reader.dis.readInt();
            var2.levelBoss = var1.reader.dis.readByte();
            var2.status = var1.reader.dis.readByte();
            if (var2.status == 0) {
                var2.Z = 10;
                gI().au.addElement(new vdtt_es(541, var2.cx, var2.l()));
            }
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public final void am(Message var1) {
        try {
            Mob var2;
            (var2 = this.j(var1.reader.dis.readByte())).aa.clear();
            var2.c(var2.H, var2.I);
            var2.as = true;
            var2.level = var1.reader.dis.readByte();
            var2.hp = var1.reader.dis.readShort();
            var2.hpFull = var1.reader.dis.readShort();
            var2.levelBoss = var1.reader.dis.readByte();
            var2.status = var1.reader.dis.readByte();
            if (var2.status == 0) {
                var2.Z = 10;
                gI().au.addElement(new vdtt_es(541, var2.cx, var2.l()));
            }
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public final void an(Message var1) {
        try {
            Mob var2;
            (var2 = this.j(var1.reader.dis.readShort())).hp = var1.reader.dis.readInt();
            var2.hpFull = var1.reader.dis.readInt();
            var2.levelBoss = var1.reader.dis.readByte();
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public final void ao(Message var1) {
        try {
            Mob var2 = this.j(var1.reader.dis.readShort());
            Char var3 = this.m(var1.reader.dis.readInt());
            var2.a(var3);
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final void ap(Message var1) {
        try {
            Char var2 = this.m(var1.reader.dis.readInt());
            Mob var3 = this.j(var1.reader.dis.readShort());

            for (int var4 = 0; var4 < var2.ba.size(); ++var4) {
                Effect var5;
                if ((var5 = (Effect) var2.ba.get(var4)).h != null) {
                    var5.h.a(var3);
                }
            }
        } catch (Exception var6) {
            Utlis.a(var6);
        }

    }

    public final void aq(Message var1) {
        try {
            Char var2 = this.m(var1.reader.dis.readInt());
            Char var3 = this.m(var1.reader.dis.readInt());

            for (int var4 = 0; var4 < var2.ba.size(); ++var4) {
                Effect var5;
                if ((var5 = (Effect) var2.ba.get(var4)).h != null) {
                    var5.h.a(var3);
                }
            }
        } catch (Exception var6) {
            Utlis.a(var6);
        }

    }

    public final void ar(Message var1) {
        try {
            Mob var2 = this.j(var1.reader.dis.readShort());
            Mob var3 = this.j(var1.reader.dis.readShort());
            var2.a(var3);
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final void as(Message var1) {
        try {
            Char var2;
            if ((var2 = this.m(var1.reader.dis.readInt())) == null) {
                return;
            }

            int var3 = var1.reader.dis.readInt();
            int var4 = var1.reader.dis.readInt();
            boolean var5 = var1.reader.dis.readBoolean();
            if (var4 <= var2.hp) {
                if (var4 == var2.hp) {
                    vdtt_fd.a("", var2, var2.height + 10, 5);
                } else if (var5) {
                    vdtt_fd.a(Utlis.c(var2.hp - var4), var2, var2.height + 10, 4);
                } else {
                    vdtt_fd.a(Utlis.c(var2.hp - var4), var2, var2.height + 10, 3);
                }
            }

            var2.hp = var4;
            var2.mp = var3;
            if (var2.hp > 0) {
                var2.i();
                return;
            }

            var2.hp = 0;
            var2.aK = var1.reader.dis.readShort();
            var2.aL = var1.reader.dis.readShort();
            var2.a(var1.reader.readUTF());
        } catch (Exception var6) {
            Utlis.a(var6);
        }

    }

    public final void at(Message var1) {
        try {
            short var2 = var1.reader.dis.readShort();
            String[] var3 = Utlis.a(var1.reader.readUTF(), ";");
            this.a((vdtt_w) (new vdtt_lw(this, Caption.mo + " " + Char.gI().name, var3, var2)));
            if (SettingsTab.O) {
                if (((Npc) gI().vNpc.get(var2)).id == 99) {
                    l(var2, 1);
                    return;
                }

                SettingsTab.O = false;
            } else {
                SettingsTab.K();
                if (SettingsTab.Q) {
                    if (((Npc) gI().vNpc.get(var2)).id == 99) {
                        l(var2, 1);
                        return;
                    }

                    SettingsTab.Q = false;
                } else if (SettingsTab.P) {
                    if (((Npc) gI().vNpc.get(var2)).id != 28) {
                        SettingsTab.P = false;
                        return;
                    }

                    l(var2, 0);
                }
            }
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final void au(Message var1) {
        try {
            vdtt_w var2;
            if ((var2 = gI().c) instanceof vdtt_lw) {
                ((vdtt_lw) var2).k();
            }

            String var3 = var1.reader.readUTF();
            String var4;
            String[] var5;
            if ((var4 = var1.reader.readUTF()).length() > 0) {
                var5 = Utlis.a(var4, ";");
            } else {
                var5 = new String[0];
            }

            this.a((vdtt_w) (new vdtt_lw(this, var3, var5, -4)));
        } catch (Exception var6) {
            Utlis.a(var6);
        }

    }

    public final void av(Message var1) {
        try {
            vdtt_w var2;
            if ((var2 = gI().c) instanceof vdtt_lw) {
                ((vdtt_lw) var2).k();
            }

            String var3 = var1.reader.readUTF();
            String[] var4 = Utlis.a(var1.reader.readUTF(), ";");
            this.a((vdtt_w) (new vdtt_lw(this, var3, var4, -2)));
        } catch (Exception var5) {
            Utlis.a(var5);
        }

    }

    public final void a(Item var1) {
        try {
            if (super.c instanceof vdtt_jo && var1 != null && var1.ak()) {
                this.cC = true;
            }

            Message var2;
            (var2 = new Message((byte) 116)).writeShort(var1.index);
            var2.send();
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public static int P() {
        int var0 = 0;

        try {
            int var1 = 0;

            for (int var2 = 0; var2 < Char.gI().arrItemBag.length; ++var2) {
                if (Char.gI().arrItemBag[var2] != null) {
                    if (Char.gI().arrItemBag[var2].id == 176) {
                        var1 += Char.gI().arrItemBag[var2].M();
                    }

                    if (Char.gI().arrItemBag[var2].id == 160 && !Char.gI().arrItemBag[var2].isLock) {
                        Char.gI();
                    }
                }
            }

            if (var1 >= 2) {
                ++var0;
            }
        } catch (Exception var3) {
        }

        return var0;
    }

    private static Item w(int var0) {
        try {
            new Vector();

            for (int var1 = 0; var1 < Char.gI().arrItemBag.length; ++var1) {
                if (Char.gI().arrItemBag[var1] != null && Char.gI().arrItemBag[var1].id == var0) {
                    return Char.gI().arrItemBag[var1];
                }
            }
        } catch (Exception var2) {
        }

        return null;
    }

    public final void b(boolean var1) {
        if (Char.gI().isDie()) {
            if (var1) {
                Char.gI().H();
            }
        } else if (this.bJ <= 0 && !Char.gI().isDie()) {
            Char.gI();
            if (Char.Y()) {
                Item var2;
                Item var3;
                if ((var2 = w(724)) == null && (var3 = w(826)) != null && var3.M() > 0) {
                    this.a(var3);
                    var1 = false;
                }

                if (var2 != null) {
                    this.bJ = 50;
                    this.a(var2);
                    if (Char.gI().hp < Char.gI().hpFull) {
                        vdtt_aa.gI().q();
                        return;
                    }
                } else if (var1) {
                    DataCenter.n();
                    DataCenter.gI().currentScreen.a(Caption.uV, 2003, this);
                }

                return;
            }
        }

    }

    public final void aw(Message var1) {
        try {
            Char var2;
            if ((var2 = this.m(var1.reader.dis.readInt())) != null) {
                short var3 = var1.reader.dis.readShort();
                EffectTemplate var4 = DataCenter.gI().effectTemplate[var3];
                Effect var5 = new Effect(var3, var1.reader.dis.readInt(), var1.reader.dis.readLong(), var1.reader.dis.readInt(), var2);

                try {
                    var5.i = var1.reader.dis.readBoolean();
                } catch (Exception var10) {
                }

                int var6;
                for (var6 = 0; var6 < var2.ba.size(); ++var6) {
                    Effect var7;
                    if ((var7 = (Effect) var2.ba.elementAt(var6)).getEffectTemplate().type == var4.type && var7.i == var5.i) {
                        var2.ba.remove(var6);
                        break;
                    }
                }

                var2.a(var5);
                if (var5.getEffectTemplate().type == 6) {
                    this.bJ = 0;
                }

                if (var5.getEffectTemplate().type == 7) {
                    this.bK = 0;
                }

                if (var5.getEffectTemplate().type == 0) {
                    this.bL = 0;
                }

                if (var5.id == 59) {
                    var2.cy = (short) (var2.cy - 20);
                }

                vdtt_aa var13;
                if (var2.p() && var2.bx == null && var5.id >= 122 && var5.id <= 130 && !(var13 = vdtt_aa.gI()).a) {
                    var13.a(var13.b[66]);
                }

                if (var5.id == 131) {
                    var2.bS = new Char();
                    var2.bS.idEntity = var2.idEntity;
                    var2.bS.setXY(var2.cx, var2.cy);

                    try {
                        for (var6 = 0; var6 < this.vChar.size(); ++var6) {
                            Char var8;
                            if ((var8 = (Char) this.vChar.get(var6)).aU != null && var8.aU.f.equals(var2)) {
                                var8.aU.f = var2.bS;
                                if (var8.aU.h != null) {
                                    Char var9 = var2.bS;
                                    var8.aU.h.l = var9;
                                }
                            }
                        }

                        return;
                    } catch (Exception var11) {
                    }
                }
            }
        } catch (Exception var12) {
            Utlis.a(var12);
        }

    }

    public final void ax(Message var1) {
        try {
            Char var2;
            if ((var2 = this.m(var1.reader.dis.readInt())) == null) {
                return;
            }

            short var3 = var1.reader.dis.readShort();
            int var4 = 0;

            while (true) {
                if (var4 >= var2.ba.size()) {
                    return;
                }

                if (((Effect) var2.ba.elementAt(var4)).id == var3) {
                    var2.ba.remove(var4);
                    break;
                }

                ++var4;
            }
        } catch (Exception var5) {
            Utlis.a(var5);
        }

    }

    public final void ay(Message var1) {
        try {
            Mob var2 = this.j(var1.reader.dis.readShort());
            short var3 = var1.reader.dis.readShort();
            EffectTemplate var4 = DataCenter.gI().effectTemplate[var3];

            for (int var5 = 0; var5 < var2.aa.size(); ++var5) {
                if (((Effect) var2.aa.elementAt(var5)).getEffectTemplate().type == var4.type) {
                    var2.aa.remove(var5);
                    break;
                }
            }

            Effect var7 = new Effect(var3, var1.reader.dis.readInt(), var1.reader.dis.readLong(), var1.reader.dis.readInt(), var2);
            var2.aa.add(var7);
        } catch (Exception var6) {
            Utlis.a(var6);
        }

    }

    public final void az(Message var1) {
        try {
            Mob var2 = this.j(var1.reader.dis.readShort());
            if (gI().k != null && gI().k instanceof vdtt_bq) {
                vdtt_bq var3;
                (var3 = (vdtt_bq) gI().k).m = var1.reader.dis.readInt();
                var3.l = var1.reader.dis.readShort();
                var3.a(var2);
            }
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final void aA(Message var1) {
        try {
            this.j(var1.reader.dis.readShort()).status = 4;
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public final void aB(Message var1) {
        try {
            byte var2 = var1.reader.dis.readByte();
            Task var3 = this.S();
            Vector var4 = new Vector();
            String[] var5;
            if (var2 == -1) {
                var5 = Utlis.a(var3.h, "\\n");
            } else if (var2 == -2) {
                var5 = Utlis.a(var3.i, "\\n");
            } else {
                var5 = Utlis.a(((vdtt_ii) var3.p.elementAt(var2)).j, "\\n");
            }

            for (int var6 = 0; var6 < var5.length; ++var6) {
                String var7;
                String[] var8;
                if ((var8 = var5[var6].split("@")).length == 1) {
                    var7 = var5[var6].replaceAll("#", Char.gI().name).replaceAll("\\$", DataCenter.gI().dataNameChar[Char.gI().sys].name).replaceAll("\\*", Caption.Ac[Char.gI().gioiTinh]).replaceAll("\\&", Caption.Ad[Char.gI().gioiTinh]).replaceAll("\\^", Caption.Ae[Char.gI().gioiTinh]).replaceAll("\\%", Caption.Af[Char.gI().gioiTinh]).replaceAll("\\~", Caption.Ag[Char.gI().gioiTinh]).replaceAll("\\_", Caption.Ah[0]);
                    var4.addElement(new vdtt_hn(Char.gI().bd, var7, (byte) 1, Char.gI().name));
                } else {
                    var7 = (var7 = var8[1]).replaceAll("#", Char.gI().name).replaceAll("\\$", DataCenter.gI().dataNameChar[Char.gI().sys].name).replaceAll("\\*", Caption.Ac[Char.gI().gioiTinh]).replaceAll("\\&", Caption.Ad[Char.gI().gioiTinh]).replaceAll("\\^", Caption.Ae[Char.gI().gioiTinh]).replaceAll("\\%", Caption.Af[Char.gI().gioiTinh]).replaceAll("\\~", Caption.Ag[Char.gI().gioiTinh]).replaceAll("\\_", Caption.Ah[0]);
                    Npc var9 = new Npc((byte) 0, Short.parseShort(var8[0]), 0, 0);
                    var4.addElement(new vdtt_hn(var9.getNpcTemplate().b[0], var7, (byte) 0, var9.getNpcTemplate().name));
                }
            }

            this.a((vdtt_w) (new vdtt_mb(this, var4, var2)));
        } catch (Exception var10) {
            Utlis.a(var10);
        }

    }

    public final void aC(Message var1) {
        try {
            Vector var2 = new Vector();
            String[] var3 = Utlis.a(var1.readUTF(), "\\n");

            for (int var4 = 0; var4 < var3.length; ++var4) {
                String var5;
                String[] var6;
                if ((var6 = var3[var4].split("@")).length == 1) {
                    var5 = var3[var4].replaceAll("#", Char.gI().name).replaceAll("\\$", DataCenter.gI().dataNameChar[Char.gI().sys].name).replaceAll("\\*", Caption.Ac[Char.gI().gioiTinh]).replaceAll("\\&", Caption.Ad[Char.gI().gioiTinh]).replaceAll("\\^", Caption.Ae[Char.gI().gioiTinh]).replaceAll("\\%", Caption.Af[Char.gI().gioiTinh]).replaceAll("\\~", Caption.Ag[Char.gI().gioiTinh]).replaceAll("\\_", Caption.Ah[0]);
                    var2.addElement(new vdtt_hn(Char.gI().bd, var5, (byte) 1, Char.gI().name));
                } else {
                    var5 = (var5 = var6[1]).replaceAll("#", Char.gI().name).replaceAll("\\$", DataCenter.gI().dataNameChar[Char.gI().sys].name).replaceAll("\\*", Caption.Ac[Char.gI().gioiTinh]).replaceAll("\\&", Caption.Ad[Char.gI().gioiTinh]).replaceAll("\\^", Caption.Ae[Char.gI().gioiTinh]).replaceAll("\\%", Caption.Af[Char.gI().gioiTinh]).replaceAll("\\~", Caption.Ag[Char.gI().gioiTinh]).replaceAll("\\_", Caption.Ah[0]);
                    Npc var7 = new Npc((byte) 0, Short.parseShort(var6[0]), 0, 0);
                    var2.addElement(new vdtt_hn(var7.getNpcTemplate().b[0], var5, (byte) 0, var7.getNpcTemplate().name));
                }
            }

            vdtt_mb var9;
            (var9 = new vdtt_mb(this, var2, -1)).N = var1.reader.dis.readShort();
            var9.O = var1.reader.dis.readByte();
            var9.P = var1.reader.dis.readByte();
            var9.M = true;
            this.a((vdtt_w) var9);
        } catch (Exception var8) {
            Utlis.a(var8);
        }

    }

    public static void aD(Message var0) {
        try {
            vdtt_w var1;
            if ((var1 = gI().c) instanceof vdtt_ml) {
                ((vdtt_ml) var1).k();
            } else if (var1 instanceof vdtt_jw) {
                ((vdtt_jw) var1).k();
            }

            byte var2 = var0.reader.dis.readByte();

            for (int var3 = 0; var3 < var2; ++var3) {
                Char.gI().arrItemBag[var0.reader.dis.readShort()] = null;
            }
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final void aE(Message var1) {
        try {
            Char var2;
            (var2 = this.m(var1.reader.dis.readInt())).bo = -1;
            this.bN = 1000;
            if (var2.p()) {
                for (int var3 = gI().b.size() - 1; var3 >= 0; --var3) {
                    vdtt_w var4;
                    if ((var4 = (vdtt_w) gI().b.get(var3)) instanceof vdtt_ni) {
                        vdtt_ni var5;
                        (var5 = (vdtt_ni) var4).k();
                    }
                }

                gI().f();
            }
        } catch (Exception var6) {
            Utlis.a(var6);
        }

    }

    public final void aF(Message var1) {
        try {
            Mob var2 = this.j(var1.reader.dis.readShort());
            short var3 = var1.reader.dis.readShort();
            int var4 = 0;

            while (true) {
                if (var4 >= var2.aa.size()) {
                    return;
                }

                if (((Effect) var2.aa.elementAt(var4)).id == var3) {
                    var2.aa.remove(var4);
                    break;
                }

                ++var4;
            }
        } catch (Exception var5) {
            Utlis.a(var5);
        }

    }

    public final void aG(Message var1) {
        try {
            Char var2;
            (var2 = this.m(var1.reader.dis.readInt())).hp = var1.reader.dis.readInt();
            var2.mp = var1.reader.dis.readInt();
            var2.hpFull = var1.reader.dis.readInt();
            var2.mpFull = var1.reader.dis.readInt();
            var2.X();
            if (var2.p()) {
                gI().dI = false;
                vdtt_aa var3 = vdtt_aa.gI();
                float var4 = 1.0F;
                if (!var3.a) {
                    var3.a(var3.b[53], 1.0F);
                }
            }

            vdtt_w var7;
            if ((var7 = gI().c) instanceof vdtt_kn) {
                ((vdtt_kn) var7).k();
            }

            if (Char.gI().bF) {
                SettingsTab.K().a(Char.gI().bF);
                Char.gI().bF = false;
            }
        } catch (Exception var6) {
            Utlis.a(var6);
        }

    }

    public final void aH(Message var1) {
        try {
            Char var2 = this.k(var1.reader.dis.readInt());
            Char.a(var1, var2.arrItemBody);
            var2.bj = null;
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public static void e(String var0) {
        try {
            Message var1;
            (var1 = new Message((byte) 41)).writeUTF(var0);
            var1.send();
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    public static void f(String var0) {
        try {
            vdtt_lj var1;
            (var1 = new vdtt_lj(gI())).a(var0);
            gI().a((vdtt_w) var1);
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    public static void g(String var0) {
        try {
            Message var1;
            (var1 = new Message((byte) 79)).writeUTF(var0);
            var1.send();
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    public final void h(String var1) {
        try {
            if (Char.gI().name.equals(var1)) {
                this.a((vdtt_w) (new vdtt_jy(this, Char.gI(), gI().af)));
            } else {
                Message var2;
                (var2 = new Message((byte) 34)).writeUTF(var1);
                var2.send();
            }
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public static void i(String var0) {
        try {
            Message var1;
            (var1 = new Message((byte) 39)).writeUTF(var0);
            var1.send();
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    public final void j(String var1) {
        try {
            if (this.b.lastElement() instanceof vdtt_ni && this.dr.lastElement() != null && ((ItemMap) this.dr.lastElement()).item.id == 223) {
                SettingsTab.K();
            }

            Message var2;
            (var2 = new Message((byte) 86)).writeUTF(var1);
            var2.send();
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public final void aI(Message var1) {
        try {
            this.bq.vMember.clear();
            this.bq.c = var1.reader.dis.readBoolean();
            short var2 = var1.reader.readUnsignedByte();

            for (int var3 = 0; var3 < var2; ++var3) {
                Member var4;
                (var4 = new Member()).b = var1.reader.dis.readByte();
                byte var5 = var1.reader.dis.readByte();
                var4.c = var5;
                var4.d = var1.reader.dis.readShort();
                var4.name = var1.reader.readUTF();
                this.bq.vMember.addElement(var4);
            }

            vdtt_w var7;
            if ((var7 = super.c) instanceof vdtt_mn) {
                vdtt_mn var8;
                (var8 = (vdtt_mn) var7).D();
            }
        } catch (Exception var6) {
            Utlis.a(var6);
        }

    }

    public final void aJ(Message var1) {
        try {
            this.bq.vMember.clear();
            this.bq.c = false;
            vdtt_w var2;
            if ((var2 = super.c) instanceof vdtt_mn) {
                vdtt_mn var3;
                (var3 = (vdtt_mn) var2).D();
            }
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final void aK(Message var1) {
        try {
            if (this.b.lastElement() instanceof vdtt_ni && this.dr.lastElement() != null && ((ItemMap) this.dr.lastElement()).item.id == 223) {
                SettingsTab.K();
            }

            H = var1.reader.readUTF();
            if (!mConfig.gI().a(38)) {
                DataCenter.gI().currentScreen.a(H + Caption.ih, Caption.bY, 2997, 2996, this);
                return;
            }

            DataCenter.gI().currentScreen.c(Utlis.b(Caption.es, H), -2560);
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public final void aL(Message var1) {
        try {
            if (this.b.lastElement() instanceof vdtt_ni && this.dr.lastElement() != null && ((ItemMap) this.dr.lastElement()).item.id == 223) {
                SettingsTab.K();
            }

            H = var1.reader.readUTF();
            DataCenter.gI().currentScreen.a(H + Caption.ii, Caption.bY, 2993, 2992, this);
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public final void aM(Message var1) {
        try {
            long var2 = var1.reader.dis.readLong();
            long var4 = var1.reader.dis.readLong();
            long var6 = var1.reader.dis.readLong();
            String var8 = Caption.ij + Utlis.i((int) (var2 / 1000L));
            var8 = var8 + Caption.ik + Utlis.i((int) (var4 / 1000L));
            if (var2 > var4) {
                var8 = var8 + Caption.im;
            } else {
                var8 = var8 + Caption.il + Utlis.c(var6);
            }

            this.cm = var8;
        } catch (Exception var9) {
            Utlis.a(var9);
        }

    }

    public final void aN(Message var1) {
        try {
            Char var2;
            if ((var2 = this.m(var1.reader.dis.readInt())) != null) {
                var2.e(var1);
            }
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public static void aO(Message var0) {
        try {
            short var1 = var0.reader.dis.readShort();
            long var2 = var0.reader.dis.readLong();
            int var4 = 0;

            while (true) {
                if (var4 >= gI().af.length) {
                    return;
                }

                if (gI().af[var4].c == var1) {
                    gI().af[var4].n = var2;
                    break;
                }

                ++var4;
            }
        } catch (Exception var5) {
            Utlis.a(var5);
        }

    }

    public final void aP(Message var1) {
        try {
            H = var1.reader.readUTF();
            DataCenter.gI().currentScreen.a(H + Caption.in, Caption.bY, 2989, 2990, this);
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public final void aQ(Message var1) {
        try {
            if (!mConfig.gI().a(32)) {
                H = var1.reader.readUTF();
                short var2 = var1.reader.dis.readShort();
                int var3 = var1.reader.dis.readInt();
                DataCenter.gI().currentScreen.a(H + Caption.uo + DataCenter.gI().a((int) var2) + Caption.ip + Utlis.c(var3) + Caption.mr, Caption.bY, 2987, 2988, this);
            }
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final void aR(Message var1) {
        try {
            if (this.b.lastElement() instanceof vdtt_ni && this.dr.lastElement() != null && ((ItemMap) this.dr.lastElement()).item.id == 223) {
                SettingsTab.K();
            }

            H = var1.reader.readUTF();
            String var2 = var1.reader.readUTF();
            byte var3 = var1.reader.dis.readByte();
            String var4 = "";
            if (var3 == 5) {
                var4 = Caption.ek;
            } else if (var3 == 4) {
                var4 = Caption.el;
            } else if (var3 == 3) {
                var4 = Caption.em;
            }

            DataCenter.gI().currentScreen.a(H + Caption.iq + var4 + Caption.ir + var2 + Caption.is, Caption.bY, 2985, 2986, this);
        } catch (Exception var5) {
            Utlis.a(var5);
        }

    }

    public final void aS(Message var1) {
        try {
            Char var2;
            if ((var2 = this.m(var1.reader.dis.readInt())) != null) {
                var2.bL = var1.reader.dis.readBoolean();
            }
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public final void aT(Message var1) {
        try {
            if (this.b.lastElement() instanceof vdtt_ni && this.dr.lastElement() != null && ((ItemMap) this.dr.lastElement()).item.id == 223) {
                SettingsTab.K();
            }

            H = var1.reader.readUTF();
            DataCenter.gI().currentScreen.a(H + Caption.vL, Caption.bY, 2890, 2891, this);
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public final void aU(Message var1) {
        try {
            Char var2;
            (var2 = this.m(var1.reader.dis.readInt())).m = var1.reader.dis.readByte();
            Char var3;
            (var3 = this.m(var1.reader.dis.readInt())).m = var1.reader.dis.readByte();
            boolean var4;
            if (var2.idEntity != Char.gI().idEntity) {
                if (var3.idEntity == Char.gI().idEntity) {
                    var3.aa = var2.idEntity;
                    DataCenter.gI().currentScreen.c(var2.name + Caption.it, -2560);
                    this.focusEntity = var2;
                    var4 = true;
                    this.aW = var4;
                }

                return;
            }

            var2.aa = var3.idEntity;
            DataCenter.gI().currentScreen.c(var3.name + Caption.it, -2560);
            this.focusEntity = var3;
            var4 = true;
            this.aW = var4;
        } catch (Exception var5) {
            Utlis.a(var5);
        }

    }

    public final void aV(Message var1) {
        try {
            Char var2 = this.m(var1.reader.dis.readInt());
            Char var3 = this.m(var1.reader.dis.readInt());
            String var4;
            boolean var5;
            if (var2.idEntity != Char.gI().idEntity) {
                if (var3.idEntity == Char.gI().idEntity) {
                    var2.isCuuSat = true;
                    var4 = var2.name + Caption.iv;
                    vdtt_ba.a(9, Caption.bY, var4);
                    DataCenter.gI().currentScreen.c(var4, -2560);
                    if (!SettingsTab.K().V || !mConfig.gI().a(35) || gI().V()) {
                        this.focusEntity = var2;
                        var5 = true;
                        this.aW = var5;
                    }
                }

                return;
            }

            var2.aa = var3.idEntity;
            var4 = Caption.iu + var3.name + ".";
            vdtt_ba.a(9, Caption.bY, var4);
            DataCenter.gI().currentScreen.c(var4, -2560);
            if (!SettingsTab.K().V || !mConfig.gI().a(35) || gI().V()) {
                this.focusEntity = var3;
                var5 = true;
                this.aW = var5;
            }
        } catch (Exception var6) {
            Utlis.a(var6);
        }

    }

    public static void aW(Message var0) {
        try {
            short var1 = var0.reader.dis.readShort();
            int var2 = 0;

            while (true) {
                if (var2 >= gI().bm.size()) {
                    return;
                }

                Skill var3;
                if ((var3 = (Skill) gI().bm.elementAt(var2)).c == var1) {
                    var3.f();
                    break;
                }

                ++var2;
            }
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final void aX(Message var1) {
        try {
            Char.gI().d(var1);
            if (DataCenter.gI().currentScreen instanceof GameSrc) {
                gI().A();
            }

            DataCenter.gI().aQ = false;
            vdtt_w var2;
            if ((var2 = super.c) instanceof vdtt_jy) {
                vdtt_jy var3;
                (var3 = (vdtt_jy) var2).a(gI().af);
                var3.H();
            }
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final void aY(Message var1) {
        try {
            Char var2 = this.m(var1.reader.dis.readInt());
            boolean var3 = var1.reader.dis.readBoolean();
            String var4;
            if (var2.idEntity == Char.gI().idEntity) {
                var2.aa = -1;
                if (var3) {
                    var4 = Caption.iw;
                    vdtt_ba.a(9, Caption.bY, var4);
                    this.c(var4, -2560);
                    return;
                }
            } else {
                var2.isCuuSat = false;
                if (var3) {
                    var4 = var2.name + Caption.ix;
                    vdtt_ba.a(9, Caption.bY, var4);
                    this.c(var4, -2560);
                }
            }
        } catch (Exception var5) {
            Utlis.a(var5);
        }

    }

    public final void aZ(Message var1) {
        try {
            byte var2 = var1.reader.dis.readByte();
            Char var3 = this.m(var1.reader.dis.readInt());
            Char var4 = this.m(var1.reader.dis.readInt());
            String var5 = "";
            if (var2 == 1) {
                var3.n = var4.n = var2;
                if (var3 != null && var4 != null) {
                    var5 = var3.name + Caption.iy + var4.name + Caption.iz;
                }
            } else if (var2 == 2) {
                var3.n = 2;
                var4.n = 3;
                if (var3 != null && var4 != null) {
                    var5 = var3.name + Caption.iA + var4.name + ".";
                }
            } else if (var2 == 3) {
                var3.n = 3;
                var4.n = 2;
                if (var3 != null && var4 != null) {
                    var5 = var4.name + Caption.iA + var3.name + ".";
                }
            }

            if (var3 != null) {
                var3.Y = Utlis.c() + 5;
                var3.m = 0;
                var3.aa = -1;
            }

            if (var4 != null) {
                var4.Y = Utlis.c() + 5;
                var4.m = 0;
                var4.aa = -1;
            }

            if (var3 != null && var4 != null) {
                vdtt_ba.a(0, Caption.bY, var5);
            }
        } catch (Exception var6) {
            Utlis.a(var6);
        }

    }

    public final void ba(Message var1) {
        try {
            vdtt_w var2;
            if ((var2 = super.c) instanceof vdtt_mn) {
                vdtt_mn var3;
                (var3 = (vdtt_mn) var2).Y.clear();
                byte var4 = var1.reader.dis.readByte();

                for (int var5 = 0; var5 < var4; ++var5) {
                    mParty var6;
                    (var6 = new mParty()).c = var1.reader.dis.readBoolean();
                    var6.d = var1.reader.dis.readByte();
                    Member var7;
                    (var7 = new Member()).b = var1.reader.dis.readByte();
                    byte var8 = var1.reader.dis.readByte();
                    var7.c = var8;
                    var7.d = var1.reader.dis.readShort();
                    var7.name = var1.reader.readUTF();
                    var6.vMember.addElement(var7);
                    var3.Y.addElement(var6);
                }

                var3.D();
            }
        } catch (Exception var9) {
        }

    }

    public final boolean k(String var1) {
        for (int var2 = 0; var2 < this.vFriend.size(); ++var2) {
            Friend var3;
            if ((var3 = (Friend) this.vFriend.elementAt(var2)).type != 2 && var3.name.equals(var1)) {
                return true;
            }
        }

        return false;
    }

    public final void bb(Message var1) {
        try {
            H = var1.reader.readUTF();
            if (gI().bq == null || !gI().bq.isLeader() || !gI().cb) {
                DataCenter.gI().currentScreen.a(H + Caption.iB, Caption.bY, 2995, 2994, this);
                return;
            }

            (var1 = new Message((byte) 41)).writeUTF(H);
            var1.send();
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public final void bc(Message var1) {
        try {
            Char var2;
            (var2 = new Char()).name = var1.reader.readUTF();
            var2.exp = var1.reader.dis.readLong();
            var2.idCharSys = var1.reader.dis.readByte();
            var2.he = var1.reader.dis.readByte();
            var2.sys = var1.reader.dis.readByte();
            var2.gioiTinh = var1.reader.dis.readByte();
            Char.a(var1, var2.arrItemBody);
            Char.a(var1, var2.arrItemBody2);
            Skill[] var3 = new Skill[var1.reader.dis.readShort()];

            for (int var4 = 0; var4 < var3.length; ++var4) {
                short var5 = var1.reader.dis.readShort();
                Skill var6 = DataCenter.gI().skill[var5].a();
                var3[var4] = var6;
            }

            var2.e(var1);
            var2.f(var1);
            var2.selectDanhHieu = (byte) (var1.reader.dis.readByte() + 1);
            var2.bp = var1.reader.dis.readByte();
            var2.B();
            boolean var8 = var1.reader.dis.readBoolean();
            var2.bq = var1.reader.dis.readBoolean();
            var2.az = var1.reader.dis.readByte();
            Arrays.sort(var3, Skill.a);
            vdtt_jy var9;
            vdtt_jy var10;
            (var9 = var10 = new vdtt_jy(this, var2, var3)).W.m = var8;
            var9.ap.b(true);
            var9.ao.b(true);
            var9.aq.b(true);
            this.a((vdtt_w) var10);
        } catch (Exception var7) {
            Utlis.a(var7);
        }

    }

    public final void bd(Message var1) {
        try {
            Char var2;
            (var2 = this.m(var1.reader.dis.readInt())).l = var1.reader.dis.readByte();
            var2.an = var1.reader.dis.readInt();
            var2.typePk = (short) (var1.reader.dis.readShort() / 100);
            var2.lvPk = var1.reader.dis.readByte();
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public final void be(Message var1) {
        try {
            Char.gI().ab = var1.reader.dis.readByte();
            gI().mocNap = var1.reader.dis.readInt();
            if (this.aT != null) {
                this.aT.d();
            }
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public final void bf(Message var1) {
        try {
            String var2 = var1.reader.readUTF();
            String var3 = var1.reader.readUTF();
            vdtt_ba.a(0, var2, var3);
            String var4 = var2;
            GameSrc var5 = this;
            Char var6;
            if (Char.gI().name.equals(var2)) {
                var6 = Char.gI();
            } else {
                int var7 = 0;

                while (true) {
                    if (var7 >= var5.vChar.size()) {
                        var6 = null;
                        break;
                    }

                    Char var8;
                    if ((var8 = (Char) var5.vChar.elementAt(var7)).name.equals(var4)) {
                        var6 = var8;
                        break;
                    }

                    ++var7;
                }
            }

            if (var6 != null) {
                var6.bh = new vdtt_ho(var3);
            }
        } catch (Exception var9) {
        }

    }

    public static void bg(Message var0) {
        try {
            String var1 = var0.reader.readUTF();
            String var2 = var0.reader.readUTF();
            var2 = ":-loa" + var2;
            if (var1.toLowerCase().equals(Caption.cl.toLowerCase())) {
                DataCenter.gI();
                MainScreen.d("c#yellow" + var2, -7812062);
            } else {
                DataCenter.gI();
                MainScreen.d(var1 + ": c#white" + var2, -7812062);
            }

            vdtt_ba.a(6, var1, var2);
        } catch (Exception var3) {
        }

    }

    public final void bh(Message var1) {
        try {
            byte var2 = var1.reader.dis.readByte();
            String var3 = var1.reader.readUTF();
            String var4 = var1.reader.readUTF();

            ItemCho var5;
            try {
                (var5 = new ItemCho()).id = var1.reader.dis.readLong();
                var5.bac = var1.reader.dis.readInt();
                var5.item = new Item();
                var5.item.a(var1);
                this.bI.addElement(var5);
            } catch (Exception var7) {
                var5 = null;
            }

            if (var2 > 0) {
                if (var2 == 1) {
                    var4 = ":-loa" + var4;
                }

                if (var3.toLowerCase().equals(Caption.cl.toLowerCase())) {
                    DataCenter.gI();
                    MainScreen.d("c#yellow" + var4, -7812062);
                } else {
                    DataCenter.gI();
                    MainScreen.d(var3 + ": c#white" + var4, -7812062);
                }
            }

            vdtt_ba.a(1, var3, var4, (ItemCho) var5);
        } catch (Exception var8) {
        }

    }

    public static void bi(Message var0) {
        try {
            String var1 = var0.reader.readUTF();
            String var2 = var0.reader.readUTF();
            vdtt_ba.a(8, var1, var2);
        } catch (Exception var3) {
        }

    }

    public static void bj(Message var0) {
        try {
            String var1 = var0.reader.readUTF();
            String var2 = var0.reader.readUTF();
            vdtt_ba.a(2, var1, var2);
        } catch (Exception var3) {
        }

    }

    public static void bk(Message var0) {
        try {
            String var1 = var0.reader.readUTF();
            String var2 = var0.reader.readUTF();
            vdtt_ba.a(3, var1, var2);
        } catch (Exception var3) {
        }

    }

    public static void bl(Message var0) {
        try {
            String var1 = var0.reader.readUTF();
            String var2 = var0.reader.readUTF();
            vdtt_ba.a(4, var1, var2);
        } catch (Exception var3) {
        }

    }

    public static void bm(Message var0) {
        try {
            String var1 = var0.reader.readUTF();
            String var2 = var0.reader.readUTF();
            vdtt_ba.a(9, var1, var2);
        } catch (Exception var3) {
        }

    }

    public static void bn(Message var0) {
        try {
            String var1 = var0.reader.readUTF();
            String var2 = var0.reader.readUTF();
            String var3 = "";

            try {
                var3 = var0.reader.readUTF();
            } catch (Exception var5) {
                J = "";
                vdtt_ba.J = "";
            }

            if (var3.length() > 0 && J.length() > 0 && (var3.equals(J) || var1.equals(J))) {
                vdtt_ba.J = J;
            }

            vdtt_ba.a(5, var1, var2, (String) var3);
        } catch (Exception var6) {
        }

    }

    public final void c(boolean var1) {
        try {
            if (var1) {
                this.aS.d();
            }

            this.aR.n.b = this.aR.j();
            if (this.br != null) {
                this.br.z();
            }
        } catch (Exception var3) {
        }

    }

    public final boolean a(Char var1) {
        if (!var1.isDie() && !Char.gI().isDie() && var1.hp > 0 && Char.gI().hp > 0 && !var1.ah() && !Char.gI().ah()) {
            boolean var2 = this.V();
            if (Char.gI().aa == var1.idEntity) {
                return true;
            } else {
                int var3;
                Effect var4;
                for (var3 = 0; var3 < Char.gI().ba.size(); ++var3) {
                    if ((var4 = (Effect) Char.gI().ba.elementAt(var3)).id == 46 || !var2 && var4.id == 66) {
                        return false;
                    }
                }

                for (var3 = 0; var3 < var1.ba.size(); ++var3) {
                    if ((var4 = (Effect) var1.ba.elementAt(var3)).id == 46 || !var2 && var4.id == 66) {
                        return false;
                    }
                }

                if (!var1.isCuuSat && Char.gI().aa != var1.idEntity) {
                    if (this.bq != null && this.bq.b(var1.name)) {
                        return false;
                    } else if ((var1.m != 2 && var1.m != 4 || Char.gI().m != 2 && Char.gI().m != 4) && var1.m != 3 && Char.gI().m != 3) {
                        return false;
                    } else if (gI().getMapTemplate().type != 6 && gI().getMapTemplate().type != 7 && gI().getMapTemplate().type != 19 && gI().getMapTemplate().type != 10) {
                        if (var1.giatoc != null && Char.gI().giatoc != null && (var1.giatoc.a.equals(Char.gI().giatoc.a) || var1.m == 4 && var1.m == Char.gI().m && var1.giatoc.d == Char.gI().giatoc.d) || Char.gI().sys == 0 || var1.sys == 0 || Char.gI().w() < 10 || var1.w() < 10 || Utlis.b(Char.gI().w() - var1.w()) > 10 && gI().getMapTemplate().type != 21 && gI().getMapTemplate().type != 5 && gI().getMapTemplate().type != 24) {
                            return false;
                        } else {
                            return true;
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        } else {
            return false;
        }
    }

    public final void a(Entity var1) {
        this.do_.add(var1);
    }

    public final void Q() {
        try {
            Collections.sort(this.do_, XYEntity.E);
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    public static void a(String var0, vdtt_w var1) {
        try {
            if (!(var1 instanceof vdtt_ka)) {
                vdtt_ba.J = var0;
                vdtt_kb var4 = new vdtt_kb(gI(), 5);
                gI().a((String) var0, (vdtt_ka) var4);
                return;
            }

            vdtt_ka var2;
            (var2 = (vdtt_ka) var1).A();
            var2.f(var2.w());
            gI().a(var0, var2);
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public final void a(String var1, vdtt_ka var2) {
        try {
            vdtt_ba.J = var1;
            var2.O.a(1);
            var2.z();
            vdtt_w var3;
            if ((var3 = super.c) != null && !var3.equals(var2)) {
                gI().a((vdtt_w) var2);
            }

            var2.N.a((vdtt_hi) (new vdtt_hi(-1001, 0, 0, 0, 0, (vdtt_hp) null, (vdtt_x) null)), var2.N.width, 0);
            var2.N.a("/" + var1 + ": ");
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final void bo(Message var1) {
        try {
            Entity var2 = this.focusEntity;
            Char var3;
            if ((var3 = this.m(var1.reader.dis.readInt())) != null) {
                short var4 = var1.reader.dis.readShort();
                short var5 = var1.reader.dis.readShort();
                var3.a(var4, var5);
                if (var3.p()) {
                    if (var3.aU != null && var3.aU.d.d == 9) {
                        var3.aX = null;
                    }

                    this.L();
                }

                this.focusEntity = var2;
            }
        } catch (Exception var6) {
            Utlis.a(var6);
        }

    }

    public final void bp(Message var1) {
        try {
            Char var2;
            if ((var2 = this.m(var1.reader.dis.readInt())) != null) {
                var2.bp = var1.reader.dis.readByte();
            }
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public final void R() {
        try {
            Npc var1;
            for (int var2 = 0; var2 < this.vNpc.size(); ++var2) {
                for (int var3 = (var1 = (Npc) this.vNpc.elementAt(var2)).m.size() - 1; var3 >= 0; --var3) {
                    vdtt_hf var4;
                    if ((var4 = (vdtt_hf) var1.m.get(var3)).k == 112 || var4.k == 113) {
                        var1.m.remove(var4);
                    }
                }
            }

            Task var6;
            if ((var6 = this.S()) != null) {
                if (this.idStep < 0) {
                    if ((var1 = this.l(var6.d)) != null) {
                        var1.m.addElement(new vdtt_hf(112, 0, 0, -1));
                        return;
                    }
                } else if (this.idStep >= var6.p.size()) {
                    if ((var1 = this.l(var6.d)) != null) {
                        var1.m.addElement(new vdtt_hf(113, 0, 0, -1));
                        return;
                    }
                } else {
                    vdtt_ii var7;
                    if ((var7 = this.T()) != null && var7.d > 0 && (var1 = this.l(var7.d)) != null) {
                        var1.m.addElement(new vdtt_hf(112, 0, 0, -1));
                    }
                }
            }
        } catch (Exception var5) {
        }

    }

    public final void bq(Message var1) {
        try {
            byte var2 = var1.reader.dis.readByte();
            byte var3 = var1.reader.dis.readByte();
            vdtt_ij var4;
            switch (var2) {
                case 0:
                    if (var3 < 0) {
                        this.taskTuanHoan = null;
                    } else {
                        if (this.taskTuanHoan == null) {
                            vdtt_fd.a(Caption.sa, Char.gI(), Char.gI().height + 20, 14, -48128, -3089954);
                        }

                        (var4 = new vdtt_ij(var2)).b = var3;
                        var4.c = var1.reader.dis.readShort();
                        var4.d = var1.reader.dis.readShort();
                        var4.e = var1.reader.dis.readShort();
                        var4.f = var1.reader.dis.readShort();
                        var4.g = var1.reader.dis.readShort();
                        var4.h = var1.reader.dis.readShort();
                        var4.i = var1.reader.dis.readShort();
                        var4.j = var1.reader.dis.readShort();
                        var4.k = var1.reader.readUTF();
                        var4.l = var1.reader.readUTF();
                        var4.m = var1.reader.readUTF();
                        this.taskTuanHoan = var4;
                        if (var4.a()) {
                            vdtt_fd.a(Caption.jF, Char.gI(), Char.gI().height + 20, 14);
                        }
                    }

                    if (this.taskTuanHoan != null) {
                        vdtt_bu.I = var2;
                        this.aT.c(true);
                    }
                    break;
                case 1:
                    if (var3 < 0) {
                        this.bz = null;
                    } else {
                        if (this.bz == null) {
                            vdtt_fd.a(Caption.sa, Char.gI(), Char.gI().height + 20, 14, -48128, -3089954);
                        }

                        (var4 = new vdtt_ij(var2)).b = var3;
                        var4.c = var1.reader.dis.readByte();
                        var4.f = var1.reader.dis.readShort();
                        var4.g = var1.reader.dis.readShort();
                        var4.h = var1.reader.dis.readShort();
                        var4.i = var1.reader.dis.readShort();
                        var4.m = var1.reader.readUTF();
                        this.bz = var4;
                        if (var4.a()) {
                            vdtt_fd.a(Caption.jF, Char.gI(), Char.gI().height + 20, 14);
                        }
                    }

                    if (this.bz != null) {
                        vdtt_bu.I = var2;
                        this.aT.c(true);
                    }
                    break;
                case 2:
                    if (var3 < 0) {
                        this.bC = null;
                    } else {
                        if (this.bC == null) {
                            vdtt_fd.a(Caption.sa, Char.gI(), Char.gI().height + 20, 14, -48128, -3089954);
                        }

                        (var4 = new vdtt_ij(var3)).c = var1.reader.dis.readByte();
                        var4.j = var1.reader.dis.readByte();
                        this.bC = var4;
                        if (var4.a()) {
                            vdtt_fd.a(Caption.jF, Char.gI(), Char.gI().height + 20, 14);
                        }
                    }

                    if (this.bC != null) {
                        vdtt_bu.I = var2;
                        this.aT.c(true);
                    }
                    break;
                case 3:
                    if (var3 < 0) {
                        this.bA = null;
                    } else {
                        if (this.bA == null) {
                            vdtt_fd.a(Caption.sa, Char.gI(), Char.gI().height + 20, 14, -48128, -3089954);
                        }

                        (var4 = new vdtt_ij(var3)).c = var1.reader.readUnsignedByte();
                        var4.j = var1.reader.readUnsignedByte();
                        this.bA = var4;
                        if (var4.a()) {
                            vdtt_fd.a(Caption.jF, Char.gI(), Char.gI().height + 20, 14);
                        }
                    }

                    if (this.bA != null) {
                        vdtt_bu.I = var2;
                        this.aT.c(true);
                    }
                    break;
                case 4:
                    if (var3 < 0) {
                        this.bB = null;
                    } else {
                        if (this.bB == null) {
                            vdtt_fd.a(Caption.sa, Char.gI(), Char.gI().height + 20, 14, -48128, -3089954);
                        }

                        (var4 = new vdtt_ij(var3)).c = var1.reader.readUnsignedByte();
                        var4.j = var1.reader.readUnsignedByte();
                        this.bB = var4;
                        if (var4.a()) {
                            vdtt_fd.a(Caption.jF, Char.gI(), Char.gI().height + 20, 14);
                        }
                    }

                    if (this.bB != null) {
                        vdtt_bu.I = var2;
                        this.aT.c(true);
                    }
                case 5:
                default:
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    if (var3 < 0) {
                        this.bD = null;
                    } else {
                        if (this.bD == null) {
                            vdtt_fd.a(Caption.sa, Char.gI(), Char.gI().height + 20, 14, -48128, -3089954);
                        }

                        (var4 = new vdtt_ij(var3)).b = var3;
                        var4.c = var1.reader.readUnsignedByte();
                        var4.j = var1.reader.readUnsignedByte();
                        this.bD = var4;
                        if (var4.a()) {
                            vdtt_fd.a(Caption.jF, Char.gI(), Char.gI().height + 20, 14);
                        }
                    }

                    if (this.bD != null) {
                        vdtt_bu.I = var2;
                        this.aT.c(true);
                    }
                    break;
                case 11:
                    if (var3 < 0) {
                        this.bE = null;
                    } else {
                        if (this.bB == null) {
                            vdtt_fd.a(Caption.sa, Char.gI(), Char.gI().height + 20, 14, -48128, -3089954);
                        }

                        (var4 = new vdtt_ij(var3)).j = var1.reader.dis.readByte();
                        var4.c = var1.reader.dis.readByte();
                        var4.e = var1.reader.dis.readShort();
                        var4.d = var1.reader.dis.readShort();
                        var4.g = -1;
                        var4.b = var3;
                        this.bE = var4;
                        if (var4.a()) {
                            vdtt_fd.a(Caption.jF, Char.gI(), Char.gI().height + 20, 14);
                        }
                    }

                    if (this.bE != null) {
                        vdtt_bu.I = var2;
                        this.aT.c(true);
                    }
            }

            this.aT.d();
        } catch (Exception var5) {
        }

    }

    public final void br(Message var1) {
        try {
            if (super.c instanceof vdtt_lk) {
                vdtt_lk var2 = (vdtt_lk) super.c;
                Message var3 = var1;
                vdtt_lk var4 = var2;

                try {
                    short var5 = var3.reader.readUnsignedByte();
                    gI().zoneID = var3.reader.readUnsignedByte();
                    var4.P = var3.reader.readUnsignedByte();
                    vdtt_jb[] var6 = new vdtt_jb[var5];

                    for (int var7 = 0; var7 < var6.length; ++var7) {
                        var6[var7] = new vdtt_jb(0);
                    }

                    short var11 = var3.reader.readUnsignedByte();

                    for (int var8 = 0; var8 < var11; ++var8) {
                        var6[var3.reader.readUnsignedByte()].a = var3.reader.readUnsignedByte();
                    }

                    var4.O = var6;
                    var4.z();
                    return;
                } catch (Exception var9) {
                    Utlis.a(var9);
                }
            }
        } catch (Exception var10) {
        }

    }

    public final void bs(Message var1) {
        try {
            vdtt_bu.I = 5;
            this.aT.c(false);
            int var2 = this.idStep;
            this.idTask = var1.reader.dis.readShort();
            this.idStep = var1.reader.dis.readByte();
            this.numStepDone = var1.reader.dis.readUnsignedShort();
            this.R();
            if (var2 != this.idStep) {
                Task var3;
                vdtt_aa var4;
                if ((var3 = this.S()) != null && this.idStep >= var3.p.size()) {
                    if (DataCenter.gI().currentScreen instanceof GameSrc && !(var4 = vdtt_aa.gI()).a) {
                        var4.a(var4.b[22]);
                    }

                    vdtt_fd.a(Caption.jF, Char.gI(), Char.gI().height + 20, 14);
                    if (this.idTask == 3) {
                        SettingsTab.K().a(false);
                        this.focusEntity = null;
                    }
                } else if (this.idStep == 0) {
                    if (DataCenter.gI().currentScreen instanceof GameSrc && !(var4 = vdtt_aa.gI()).a) {
                        var4.a(var4.b[21]);
                    }

                    vdtt_fd.a(Caption.uG, Char.gI(), Char.gI().height + 20, 14, -48128, -3089954);
                } else {
                    if (DataCenter.gI().currentScreen instanceof GameSrc && !(var4 = vdtt_aa.gI()).a) {
                        var4.a(var4.b[9]);
                    }

                    Char.gI().be.addElement(new vdtt_hf(105, 0, 0, 2));
                }
            }

            vdtt_w var6;
            if ((var6 = super.c) instanceof vdtt_mm) {
                vdtt_mm var7;
                (var7 = (vdtt_mm) var6).w();
                var7.x();
            }

            this.aT.d();
            if (AppListener.gI().g != null) {
                int var8 = this.idTask;
                DataCenter.gI().getClass();
                if (var8 == 17 && this.idStep == -1) {
                    AppListener.gI();
                    (new StringBuilder()).append(DataCenter.gI().aE);
                    DataCenter.gI();
                }
            }
        } catch (Exception var5) {
        }

    }

    public final Task S() {
        try {
            if (this.idTask < DataCenter.gI().task.length) {
                return DataCenter.gI().task[gI().idTask];
            }
        } catch (Exception var2) {
            Utlis.a(var2);
        }

        return null;
    }

    public final vdtt_ii T() {
        try {
            Task var1;
            if ((var1 = this.S()) != null && Char.gI().w() >= var1.c && gI().idStep >= 0 && gI().idStep < var1.p.size()) {
                return (vdtt_ii) var1.p.elementAt(gI().idStep);
            }
        } catch (Exception var2) {
            Utlis.a(var2);
        }

        return null;
    }

    private static void a(Mob var0) {
        try {
            Message var1;
            (var1 = new Message((byte) -8)).writeShort(var0.idEntity);
            var1.send();
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    public final void a(vdtt_dv var1, boolean var2) {
        Char.gI().T();
        vdtt_ii var3 = gI().T();
        this.S();
        if (var2) {
            var3 = null;
        }

        if (var3 != null) {
            if (var3.a == 22) {
                this.c(Caption.iE, -2560);
            } else if (var3.a == 60) {
                this.c(Caption.uI, -2560);
            } else if (var3.a == 10) {
                if (var3.f != this.mapID) {
                    this.c(Caption.iF, -1);
                } else {
                    this.c(Caption.iG, -1);
                }
            } else if (this.idTask > 14 && !mConfig.gI().a(13) && (var3.a == 47 || (var3.a == 0 || var3.a == 51) && var3.e > 0 && DataCenter.gI().mobTemplate[var3.e].typeMob2 == 5)) {
                this.c(Caption.uH, -2560);
            } else {
                gI().pointMoveMap = var1;
            }
        } else {
            gI().pointMoveMap = var1;
        }

        if (gI().V()) {
            if (this.idTask == 14) {
                SettingsTab.K().a(true);
            } else {
                this.c(Caption.uJ, -2560);
            }
        } else if (var1.d == 67 && Char.gI().w() < 15) {
            this.c(Utlis.b(Caption.uK, DataCenter.gI().a((int) 15)), -1);
        } else if (var1.d > 0 && f(var1.d) != f(this.mapID) && this.mapID != 87) {
            if (Char.gI().ac()) {
                a(var1);
                return;
            }

            if (this.mapID != 87) {
                q(87);
                return;
            }
        } else if (var1.d > 0 && gI().mapID != var1.d) {
            MapTemplate var4 = DataCenter.gI().mapTemplate[var1.d];
            if (Char.gI().ac() && (var1.d == 84 || var1.d == 19)) {
                var1.d = 56;
                a(var1);
                return;
            }

            if (!var4.a()) {
                if (var1.b()) {
                    q(var1.d);
                    return;
                }

                if (this.idTask < 19 && gI().mapID != 57 && gI().mapID != 62 && gI().mapID != 66 && gI().mapID != 61 && (var1.d == 57 || var1.d == 62 || var1.d == 66 || var1.d == 61)) {
                    gI().pointMoveMap.a = 42;
                    gI().pointMoveMap.d = 87;
                    if (gI().mapID != 86 && gI().mapID != 87) {
                        gI().bx = gI().pointMoveMap;
                        gI();
                        q(86);
                        return;
                    }
                } else {
                    if (gI().mapID == 87 && var4.e != 0) {
                        this.c(Utlis.b(Caption.uC, Caption.BM[var4.e]) + " " + Caption.Bu[var4.e], -2560);
                        return;
                    }

                    if (var4.id == 56 && gI().getMapTemplate().e != 0) {
                        q(86);
                        return;
                    }

                    if (gI().mapID == 56 && var4.e != 0) {
                        this.c(Caption.iD + " " + Caption.Bu[var4.e], -2560);
                        return;
                    }

                    if (var4.e != gI().getMapTemplate().e) {
                        if (var4.e == 0) {
                            q(86);
                            return;
                        }

                        if (var4.id != 56) {
                            this.c(Caption.iD + " " + Caption.Bu[var4.e], -2560);
                        }
                    }
                }
            }
        }

    }

    public static void q(int var0) {
        for (int var1 = 0; var1 < Char.gI().arrItemBag.length; ++var1) {
            Item var2;
            if ((var2 = Char.gI().arrItemBag[var1]) != null && var2.id == 168) {
                try {
                    Message var3;
                    (var3 = new Message((byte) -25)).writeShort(var2.index);
                    switch (var0) {
                        case 56:
                            var3.writeByte(2);
                            break;
                        case 67:
                            var3.writeByte(1);
                            break;
                        case 86:
                            var3.writeByte(0);
                            break;
                        case 87:
                            var3.writeByte(3);
                    }

                    var3.writeByte(0);
                    var3.send();
                    Char.gI().S();
                    gI().pointMoveMap = null;
                    return;
                } catch (Exception var4) {
                    return;
                }
            }
        }

    }

    public final void bt(Message var1) {
        try {
            Char var2 = Char.gI();
            vdtt_ni var3 = new vdtt_ni(this, var1.reader.dis.readInt(), var1.readUTF(), var1.reader.dis.readByte());

            try {
                (var2 = this.m(var1.reader.dis.readInt())).bo = var1.reader.dis.readShort();
            } catch (Exception var5) {
            }

            if (var2.p()) {
                this.a((vdtt_w) var3);
            }
        } catch (Exception var6) {
            Utlis.a(var6);
        }

    }

    public final void bu(Message var1) {
        try {
            int var2 = var1.reader.dis.readInt();
            short var3;
            vdtt_hf var4;
            if ((var3 = var1.reader.dis.readShort()) == 440) {
                try {
                    vdtt_w var5;
                    if ((var5 = super.c) instanceof vdtt_kv) {
                        ((vdtt_kv) var5).k();
                    }

                    int var6;
                    for (var6 = this.av.size() - 1; var6 >= 0; --var6) {
                        vdtt_hf var7;
                        if ((var7 = var4 = (vdtt_hf) this.av.get(var6)).k == 441 || var7.k == 449 || var7.k == 450 || var7.k == 478 || var7.k == 479) {
                            this.av.remove(var4);
                        }
                    }

                    for (var6 = this.au.size() - 1; var6 >= 0; --var6) {
                        vdtt_es var11;
                        if ((var11 = (vdtt_es) this.au.get(var6)).r()) {
                            this.au.remove(var11);
                        }
                    }
                } catch (Exception var8) {
                }

                if (var2 < 0) {
                    this.dD = 0L;
                } else {
                    this.dD = System.currentTimeMillis() + 180000L;
                    this.m(var2);
                }
            } else {
                Char var10;
                if ((var10 = this.m(var2)) != null) {
                    if (var3 == 447) {
                        var4 = new vdtt_hf(var3, var10.k(), var10.l());
                    } else {
                        var4 = new vdtt_hf(var3, 0, 0);
                    }

                    var10.be.addElement(var4);
                    if (var10.p() && var4.k == 142) {
                        this.dl = Utlis.a();
                    }
                }
            }
        } catch (Exception var9) {
            Utlis.a(var9);
        }

    }

    public final void bv(Message var1) {
        try {
            vdtt_hf var2 = new vdtt_hf(var1.reader.dis.readShort(), var1.reader.dis.readShort(), var1.reader.dis.readShort(), var1.reader.dis.readByte());
            this.av.addElement(var2);
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public final void bw(Message var1) {
        try {
            Npc var2 = (Npc) this.vNpc.elementAt(var1.reader.dis.readShort());
            byte var3 = var1.reader.dis.readByte();
            if (var2.status == 9 && var3 == 0) {
                var2.cy = var2.o;
            }

            var2.status = var3;
            var2.n();
            if (var2.status == 6 && gI().focusEntity != null && gI().focusEntity.equals(var2)) {
                gI().focusEntity = null;
            }
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final void bx(Message var1) {
        try {
            Mob var2;
            (var2 = new Mob(0)).b(var1);
            var2.c(var2.cx, var2.cy);
            var2.dir = 3;
            var2.as = true;
            if (var2.id == 236) {
                var2.ar = 60;
            }

            this.vMob.addElement(var2);
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public final void by(Message var1) {
        try {
            short var2 = var1.reader.dis.readShort();

            for (int var3 = 0; var3 < this.vMob.size(); ++var3) {
                if (((Mob) this.vMob.elementAt(var3)).idEntity == var2) {
                    this.vMob.remove(var3);
                }
            }
        } catch (Exception var4) {
        }

    }

    public final void bz(Message var1) {
        try {
            Mob var2;
            if ((var2 = this.j(var1.reader.dis.readShort())) != null) {
                if (var2.rangeMove <= 0) {
                    var2.rangeMove = 1;
                }

                var2.status = 2;
                var2.J = var1.reader.dis.readShort();
                var2.K = var1.reader.dis.readShort();
                XYEntity var3;
                if ((var3 = Char.b(var2.J, var2.K)) != null) {
                    var2.J = var3.cx;
                    var2.K = var3.cy;
                }
            }
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final void bA(Message var1) {
        try {
            Mob var2;
            (var2 = this.j(var1.reader.dis.readShort())).status = var1.reader.dis.readByte();
            var2.c(var1.reader.dis.readShort(), var1.reader.dis.readShort());
            var2.as = true;
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public final void bB(Message var1) {
        try {
            vdtt_w var2;
            if ((var2 = super.c) instanceof vdtt_kc) {
                vdtt_kc var3;
                (var3 = (vdtt_kc) var2).O = var1.reader.dis.readByte();
                var3.P = var3.S = var1.reader.dis.readByte();
                var3.Q = var3.T = var1.reader.dis.readByte();
                var3.R = var3.U = var1.reader.dis.readByte();
                if (var3.R == 1) {
                    switch (var3.P) {
                        case 1:
                            var3.a = 324;
                            return;
                        case 2:
                            var3.a = 252;
                            return;
                        case 3:
                            var3.a = 180;
                            return;
                        case 4:
                            var3.a = 108;
                            return;
                        case 5:
                            var3.a = 36;
                    }
                }
            }
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final void bC(Message var1) {
        try {
            this.j(var1.reader.dis.readByte()).status = 4;
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public final void bD(Message var1) {
        try {
            Mob var2 = this.j(var1.reader.dis.readShort());
            String var3 = var1.reader.readUTF();
            var2.ao = new vdtt_ho(var3);
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final void bE(Message var1) {
        try {
            short var2 = var1.reader.dis.readShort();
            Npc var3 = (Npc) this.vNpc.elementAt(var2);
            String var4 = var1.reader.readUTF();
            var3.n = new vdtt_ho(var4);
        } catch (Exception var5) {
            Utlis.a(var5);
        }

    }

    public final void bF(Message var1) {
        try {
            int var2 = var1.reader.dis.readInt();
            short var3 = var1.reader.dis.readShort();
            short var4 = var1.reader.dis.readShort();

            for (int var5 = 0; var5 < this.vItemMap.size(); ++var5) {
                ItemMap var6;
                if ((var6 = (ItemMap) this.vItemMap.elementAt(var5)).idEntity == var3) {
                    var6.I = var2;
                    var6.item.id = var4;
                    this.dr.remove(var6);
                    break;
                }
            }

            if (var4 == 224) {
                this.bN = 1000;
                if (this.b.lastElement() instanceof vdtt_ni) {
                    this.b.remove(this.b.lastElement());
                }
            }
        } catch (Exception var7) {
            Utlis.a(var7);
        }

    }

    public final void bG(Message var1) {
        try {
            Char var2;
            if ((var2 = this.m(var1.reader.dis.readInt())) != null) {
                byte var3 = var2.m;
                var2.m = var1.reader.dis.readByte();
                if (var2.p() && var2.m != var3) {
                    DataCenter.gI().aQ = false;
                }
            }
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final void U() {
        try {
            vdtt_w var1;
            if ((var1 = super.c) instanceof vdtt_ap) {
                ((vdtt_ap) var1).k();
            }
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    public final void bH(Message var1) {
        try {
            this.a((vdtt_w) (new vdtt_nf(this, var1)));
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public final void bI(Message var1) {
        try {
            boolean var2 = var1.reader.dis.readBoolean();
            vdtt_iv[] var3 = new vdtt_iv[var1.reader.readUnsignedByte()];

            for (int var4 = 0; var4 < var3.length; ++var4) {
                var3[var4] = new vdtt_iv();
                var3[var4].a = var1.reader.dis.readByte();
                var3[var4].b = var1.reader.readUTF();
                var3[var4].d = var1.reader.dis.readLong();
                var3[var4].e = var1.reader.dis.readLong();
                var3[var4].f = var1.reader.dis.readByte();
                var3[var4].g = var1.reader.readUTF();
            }

            vdtt_w var7;
            if ((var7 = super.c) instanceof vdtt_ms) {
                vdtt_ms var5;
                (var5 = (vdtt_ms) var7).O = var2;
                var5.P = var3;
                var5.z();
            } else {
                if (!(var7 instanceof vdtt_mt)) {
                    if (var7 instanceof vdtt_jj) {
                        vdtt_jj var9;
                        (var9 = (vdtt_jj) var7).a = var3;
                        var9.w();
                    }

                    return;
                }

                vdtt_mt var8;
                (var8 = (vdtt_mt) var7).a = var3;
                var8.w();
            }
        } catch (Exception var6) {
            Utlis.a(var6);
        }

    }

    public final void bJ(Message var1) {
        try {
            var1.reader.dis.readBoolean();
            vdtt_iv[] var2 = new vdtt_iv[var1.reader.readUnsignedByte()];

            for (int var3 = 0; var3 < var2.length; ++var3) {
                var2[var3] = new vdtt_iv();
                var2[var3].a = var1.reader.dis.readByte();
                var2[var3].b = var1.reader.readUTF();
                var2[var3].d = var1.reader.dis.readLong();
                var2[var3].e = var1.reader.dis.readLong();
                var2[var3].f = var1.reader.dis.readByte();
                var2[var3].g = var1.reader.readUTF();
            }

            vdtt_jj var5;
            (var5 = new vdtt_jj(this)).a = var2;
            var5.w();
            this.a((vdtt_w) var5);
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final void bK(Message var1) {
        try {
            var1.reader.dis.readBoolean();
            vdtt_iv[] var2 = new vdtt_iv[var1.reader.readUnsignedByte()];

            for (int var3 = 0; var3 < var2.length; ++var3) {
                var2[var3] = new vdtt_iv();
                var2[var3].a = var1.reader.dis.readByte();
                var2[var3].b = var1.reader.readUTF();
                var2[var3].d = var1.reader.dis.readLong();
                var2[var3].e = var1.reader.dis.readLong();
                var2[var3].f = var1.reader.dis.readByte();
                var2[var3].g = var1.reader.readUTF();
            }

            vdtt_mk var5;
            (var5 = new vdtt_mk(this)).a = var2;
            var5.w();
            this.a((vdtt_w) var5);
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final void bL(Message var1) {
        try {
            vdtt_w var2;
            vdtt_iv[] var3;
            int var4;
            if (!((var2 = super.c) instanceof vdtt_ms)) {
                if (var2 instanceof vdtt_ji) {
                    vdtt_ji var7 = (vdtt_ji) var2;
                    var1.reader.dis.readBoolean();
                    var3 = new vdtt_iv[var1.reader.readUnsignedByte()];

                    for (var4 = 0; var4 < var3.length; ++var4) {
                        var3[var4] = new vdtt_iv();
                        var3[var4].a = var4 + 1;
                        var3[var4].b = var1.readUTF();
                        var3[var4].c = var1.reader.dis.readInt();
                        var3[var4].h = var1.reader.dis.readInt() + "%";
                        var3[var4].e = (long) var1.reader.dis.readInt();
                        var3[var4].f = var1.reader.dis.readInt();
                        var3[var4].g = var1.readUTF();
                    }

                    var7.a = var3;
                    var7.w();
                }

                return;
            }

            vdtt_ms var5;
            (var5 = (vdtt_ms) var2).O = var1.reader.dis.readBoolean();
            var3 = new vdtt_iv[var1.reader.readUnsignedByte()];

            for (var4 = 0; var4 < var3.length; ++var4) {
                var3[var4] = new vdtt_iv();
                var3[var4].a = var4 + 1;
                var3[var4].b = var1.reader.readUTF();
                var3[var4].c = var1.reader.dis.readInt();
                var3[var4].h = var1.reader.dis.readInt() + "%";
                var3[var4].e = (long) var1.reader.dis.readInt();
                var3[var4].f = var1.reader.dis.readInt();
                var3[var4].g = var1.readUTF();
            }

            var5.P = var3;
            var5.z();
        } catch (Exception var6) {
            Utlis.a(var6);
        }

    }

    public final void bM(Message var1) {
        try {
            Item var2 = Char.gI().arrItemBag[var1.reader.dis.readShort()];
            vdtt_w var3;
            if (!((var3 = super.c) instanceof vdtt_jo)) {
                if (var3 instanceof GameSrc) {
                    String[] var6 = Utlis.a(var1.reader.readUTF(), ";");
                    this.a((vdtt_w) (new vdtt_lw(this, "", var6, 30000)));
                }

                return;
            }

            vdtt_jo var4;
            (var4 = (vdtt_jo) var3).a(var2, var1.reader.readUTF());
        } catch (Exception var5) {
        }

    }

    public static void bN(Message var0) {
        try {
            short var1 = var0.reader.dis.readShort();

            for (int var2 = 0; var2 < var1; ++var2) {
                Item var3;
                (var3 = new Item()).a(var0);
                if (var3.h == 0L) {
                    Char.gI().arrItemBag[var3.index] = null;
                } else {
                    Char.gI().arrItemBag[var3.index] = var3;
                }
            }
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    private static void l(int var0, int var1) {
        try {
            Message var2;
            (var2 = new Message((byte) 53)).writeShort(var0);
            var2.writeByte(var1);
            var2.send();
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    private XYEntity a(XYEntity var1, XYEntity var2) {
        for (int var3 = 0; var3 < this.V.a.size(); ++var3) {
            XYEntity var4;
            if ((var4 = ((vdtt_fw) this.V.a.get(var3)).a(var1, var2)) != null) {
                return var4;
            }
        }

        return null;
    }

    private boolean a(XYEntity var1) {
        if (!gI().V()) {
            return false;
        } else if (var1 == null) {
            return false;
        } else if (var1 instanceof Char) {
            return false;
        } else {
            XYEntity var2;
            (var2 = new XYEntity()).setXY(var1.cx, var1.cy - 2);
            return this.a((XYEntity) Char.gI(), (XYEntity) var2) != null;
        }
    }

    public final boolean V() {
        try {
            return this.getMapTemplate().a();
        } catch (Exception var2) {
            return false;
        }
    }

    public final void bO(Message var1) {
        try {
            Char var2 = this.m(var1.reader.dis.readInt());
            int var3 = 0;
            if (var2.p() && super.c instanceof vdtt_jy) {
                var3 = var2.danhhieu.length;
            }

            var2.f(var1);
            var2.selectDanhHieu = (byte) (var1.reader.dis.readByte() + 1);
            if (var2.p() && super.c instanceof vdtt_jy && var3 != var2.danhhieu.length) {
                ((vdtt_jy) super.c).C();
            }
        } catch (Exception var4) {
        }

    }

    public final void bP(Message var1) {
        try {
            this.di = var1.reader.dis.readInt();
            Char.gI().rank = var1.reader.dis.readByte();
            SettingsTab.L();
            this.X();
        } catch (Exception var3) {
        }

    }

    public static void bQ(Message var0) {
        try {
            vdtt_w var1;
            if ((var1 = gI().c) instanceof PhucLoiScreen) {
                short var2 = var0.reader.dis.readShort();
                PhucLoiScreen var3 = (PhucLoiScreen) var1;

                for (int var4 = 0; var4 < var3.O.length; ++var4) {
                    for (int var5 = 0; var5 < var3.O[var4].length; ++var5) {
                        for (int var6 = 0; var6 < var3.O[var4][var5].length; ++var6) {
                            if (var3.O[var4][var5][var6].id == var2) {
                                var3.O[var4][var5][var6].status = 2;
                                var3.z();
                                return;
                            }
                        }
                    }
                }
            }
        } catch (Exception var7) {
            Utlis.a(var7);
        }

    }

    public static void bR(Message var0) {
        try {
            vdtt_w var1;
            if ((var1 = gI().c) instanceof PhucLoiScreen) {
                PhucLoiScreen var2;
                (var2 = (PhucLoiScreen) var1).b(var0);
            }
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public static void bS(Message var0) {
        try {
            vdtt_w var1;
            if ((var1 = gI().c) instanceof PhucLoiScreen) {
                PhucLoiScreen var2;
                PhucLoiScreen var3 = var2 = (PhucLoiScreen) var1;
                Message var4 = var0;
                PhucLoiScreen var5 = var3;

                try {
                    var5.P = var4.reader.dis.readShort();
                    var5.T = var4.reader.dis.readByte();
                    var5.Q = var4.reader.dis.readInt();
                } catch (Exception var7) {
                }

                var2.z();
            }
        } catch (Exception var8) {
            Utlis.a(var8);
        }

    }

    public final void bT(Message var1) {
        try {
            this.aZ = var1.reader.dis.readBoolean();
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public static void W() {
        try {
            Gdx.net.openURI("https://goirongplus.com");
        } catch (Exception var1) {
            Utlis.a(var1);
        }

    }

    public static void b(vdtt_dv var0) {
        switch (var0.a) {
            case 21:
            case 22:
            case 28:
            case 49:
            case 50:
            case 51:
            case 52:
            case 92:
                var0.d = 86;
                return;
            case 40:
                var0.d = 87;
            default:
                return;
            case 59:
                var0.d = 56;
                return;
            case 102:
                var0.d = 67;
        }
    }

    public final void bU(Message var1) {
        try {
            vdtt_w var2;
            if ((var2 = super.c) instanceof vdtt_jt) {
                ((vdtt_jt) var2).k();
                var2 = super.c;
            }

            if (var2 instanceof vdtt_ll) {
                vdtt_ll var3;
                (var3 = (vdtt_ll) var2).ar = var1.reader.dis.readBoolean();
            }
        } catch (Exception var4) {
        }

    }

    public final void bV(Message var1) {
        try {
            byte var2 = var1.reader.dis.readByte();
            Item var3 = null;

            for (int var4 = 0; var4 < var2; ++var4) {
                byte var5 = var1.reader.dis.readByte();
                if (var4 != 0) {
                    if (var5 == 2) {
                        Char.gI().arrItemBody[var1.reader.dis.readShort()] = null;
                    } else if (var5 == 3) {
                        Char.gI().arrItemBody2[var1.reader.dis.readShort()] = null;
                    } else {
                        Char.gI().arrItemBag[var1.reader.dis.readShort()] = null;
                    }
                } else {
                    (var3 = new Item()).a(var1);
                    var3.w = var5;
                    if (var5 == 2 || var5 == 3) {
                        var3.index = var3.getItemTemplate().type;
                    }

                    Char.gI().i(var3.w)[var3.index] = var3;
                }
            }

            vdtt_w var8;
            if ((var8 = super.c) instanceof vdtt_ks) {
                vdtt_ks var9;
                (var9 = (vdtt_ks) var8).S = true;
                var9.W[0] = 50;
                var9.Q = new vdtt_hf(114, 0, 0);

                int var6;
                for (var6 = 0; var6 < var9.O.length; ++var6) {
                    var9.O[var6] = null;
                }

                for (var6 = 0; var6 < var9.N.length; ++var6) {
                    var9.N[var6] = null;
                }

                var9.N[0] = var3;
                var9.R = var3;
            }
        } catch (Exception var7) {
        }

    }

    public final void bW(Message var1) {
        try {
            byte var2;
            if ((var2 = var1.reader.dis.readByte()) == 2) {
                Char.gI().arrItemBody[var1.reader.dis.readShort()] = null;
            } else if (var2 == 3) {
                Char.gI().arrItemBody2[var1.reader.dis.readShort()] = null;
            } else {
                Char.gI().arrItemBag[var1.reader.dis.readShort()] = null;
            }

            Item var3;
            (var3 = new Item()).a(var1);
            var3.index = -1;
            vdtt_w var4;
            if ((var4 = super.c) instanceof vdtt_mh) {
                vdtt_mh var5;
                (var5 = (vdtt_mh) var4).S = true;
                var5.R = new vdtt_hf(114, 0, 0);

                int var6;
                for (var6 = 0; var6 < var5.O.length; ++var6) {
                    var5.O[var6] = null;
                }

                for (var6 = 0; var6 < var5.N.length; ++var6) {
                    var5.N[var6] = null;
                }

                var5.P = null;
                var5.N[0] = var3;
            }
        } catch (Exception var7) {
        }

    }

    public final void bX(Message var1) {
        try {
            byte var2 = var1.reader.dis.readByte();
            short var3 = var1.reader.dis.readShort();
            Item var4;
            (var4 = new Item()).a(var1);
            var4.w = var2;
            gI().cX = var1.reader.dis.readInt();
            if (var2 == 2) {
                Char.gI().arrItemBody[var3] = var4;
                var4.index = var4.getItemTemplate().type;
            } else if (var2 == 3) {
                Char.gI().arrItemBody2[var3] = var4;
                var4.index = var4.getItemTemplate().type;
            } else {
                Char.gI().arrItemBag[var3] = var4;
            }

            vdtt_w var5;
            if ((var5 = super.c) instanceof vdtt_ju) {
                vdtt_ju var6;
                (var6 = (vdtt_ju) var5).d = new vdtt_hf(114, 0, 0);

                for (int var7 = 0; var7 < var6.a.length; ++var7) {
                    var6.a[var7] = null;
                }

                var6.O = var4;
                var6.P = true;
                var6.k();
            }

            if ((var5 = super.c) instanceof vdtt_jy) {
                vdtt_jy var9;
                vdtt_jy var10 = var9 = (vdtt_jy) var5;
                if (var2 == 2) {
                    var10.aC = new vdtt_hf(114, 32, 107);
                    return;
                }

                if (var2 == 3) {
                    var10.aC = new vdtt_hf(114, 118, 107);
                }
            }
        } catch (Exception var8) {
        }

    }

    public final void bY(Message var1) {
        try {
            byte var2 = var1.reader.dis.readByte();
            short var3 = var1.reader.dis.readShort();
            Item var4;
            (var4 = new Item()).a(var1);
            var4.w = var2;
            boolean var5 = var1.reader.dis.readBoolean();
            if (var2 == 2) {
                Char.gI().arrItemBody[var3] = var4;
                var4.index = var4.getItemTemplate().type;
            } else if (var2 == 3) {
                Char.gI().arrItemBody2[var3] = var4;
                var4.index = var4.getItemTemplate().type;
            } else {
                Char.gI().arrItemBag[var3] = var4;
            }

            vdtt_w var6;
            if ((var6 = super.c) instanceof vdtt_km) {
                vdtt_km var7;
                (var7 = (vdtt_km) var6).O = new vdtt_hf(114, 0, 0);

                for (int var8 = 0; var8 < var7.aa.length; ++var8) {
                    var7.aa[var8] = null;
                }

                var7.P = var4;
                var7.Q = true;
                var7.R = var5;
                var7.N[2] = 50;
            }
        } catch (Exception var9) {
        }

    }

    public final void bZ(Message var1) {
        try {
            byte var2 = var1.reader.dis.readByte();
            short var3 = var1.reader.dis.readShort();
            Item var4;
            (var4 = new Item()).a(var1);
            var4.w = var2;
            if (var2 == 2) {
                Char.gI().arrItemBody[var3] = var4;
                var4.index = var4.getItemTemplate().type;
            } else if (var2 == 3) {
                Char.gI().arrItemBody2[var3] = var4;
                var4.index = var4.getItemTemplate().type;
            } else {
                Char.gI().arrItemBag[var3] = var4;
            }

            vdtt_w var5;
            if ((var5 = super.c) instanceof vdtt_kr) {
                vdtt_kr var6;
                (var6 = (vdtt_kr) var5).O = new vdtt_hf(114, 0, 0);

                for (int var7 = 0; var7 < var6.aa.length; ++var7) {
                    var6.aa[var7] = null;
                }

                var6.P = var4;
                var6.Q = true;
            }
        } catch (Exception var8) {
        }

    }

    public final void ca(Message var1) {
        try {
            var1.reader.dis.readByte();
            (new Item(0)).a(var1);
        } catch (Exception var3) {
        }

    }

    public static void cb(Message var0) {
        try {
            vdtt_w var1;
            if ((var1 = DataCenter.gI().currentScreen.c) instanceof vdtt_jm) {
                vdtt_jm var2;
                vdtt_jm var3;
                (var2 = var3 = (vdtt_jm) var1).Z = true;
                var2.X = false;
                var2.Y = false;
                var2.V.a(false);
                short var4 = var0.reader.dis.readShort();
                int var5 = var0.reader.dis.readInt();
                byte var6 = var0.reader.dis.readByte();
                int var7 = var5;
                short var8 = var4;
                var2 = var3;
                var3.W = var6;

                for (int var9 = 0; var9 < var2.T.length; ++var9) {
                    if (var2.T[var9].id == var8 && var2.T[var9].amount == var7) {
                        var2.Z = false;
                        var2.U = var2.T[var9];
                        return;
                    }
                }
            }
        } catch (Exception var10) {
        }

    }

    public final void cc(Message var1) {
        try {
            byte var2 = var1.reader.dis.readByte();
            short var3 = var1.reader.dis.readShort();
            Item var4;
            (var4 = new Item()).a(var1);
            var4.w = var2;
            if (var2 == 2) {
                Char.gI().arrItemBody[var3] = var4;
                var4.index = var4.getItemTemplate().type;
            } else if (var2 == 3) {
                Char.gI().arrItemBody2[var3] = var4;
                var4.index = var4.getItemTemplate().type;
            } else {
                Char.gI().arrItemBag[var3] = var4;
            }

            vdtt_w var5;
            if ((var5 = super.c) instanceof vdtt_ly) {
                vdtt_ly var6;
                (var6 = (vdtt_ly) var5).O = new vdtt_hf(114, 0, 0);

                for (int var7 = 0; var7 < var6.aa.length; ++var7) {
                    var6.aa[var7] = null;
                }

                var6.P = var4;
                var6.Q = true;
            }
        } catch (Exception var8) {
        }

    }

    public final void cd(Message var1) {
        try {
            byte var2 = var1.reader.dis.readByte();

            for (int var3 = 0; var3 < var2; ++var3) {
                Char.gI().arrItemBag[var1.reader.dis.readShort()] = null;
            }

            byte var9 = var1.reader.dis.readByte();
            Item var4;
            (var4 = new Item()).a(var1);
            Char.gI().arrItemBag[var4.index] = var4;
            vdtt_w var5;
            if ((var5 = super.c) instanceof vdtt_kl) {
                vdtt_kl var6;
                (var6 = (vdtt_kl) var5).N = new vdtt_hf(114, 0, 0, 1);

                for (int var7 = 0; var7 < var6.aa.length; ++var7) {
                    var6.aa[var7] = null;
                }

                var6.P = var9;
                var6.O = var4;
            }
        } catch (Exception var8) {
        }

    }

    public final void ce(Message var1) {
        try {
            byte var2 = var1.reader.dis.readByte();

            for (int var3 = 0; var3 < var2; ++var3) {
                Char.gI().arrItemBag[var1.reader.dis.readShort()] = null;
            }

            Item var8;
            (var8 = new Item()).a(var1);
            Char.gI().arrItemBag[var8.index] = var8;
            vdtt_w var4;
            if ((var4 = super.c) instanceof vdtt_kp) {
                vdtt_kp var5;
                (var5 = (vdtt_kp) var4).N = new vdtt_hf(114, 0, 0, 1);

                for (int var6 = 0; var6 < var5.aa.length; ++var6) {
                    var5.aa[var6] = null;
                }

                var5.P = 0;
                var5.O = var8;
            }
        } catch (Exception var7) {
        }

    }

    public final void cf(Message var1) {
        try {
            boolean var2 = var1.reader.dis.readBoolean();
            Char.gI().bac = var1.reader.dis.readInt();
            byte var3 = var1.reader.dis.readByte();

            for (int var4 = 0; var4 < var3; ++var4) {
                Char.gI().arrItemBag[var1.reader.dis.readShort()] = null;
            }

            Item var9;
            (var9 = new Item()).a(var1);
            var9.w = var1.reader.dis.readByte();
            if (var9.w == 2 || var9.w == 3) {
                var9.index = var9.getItemTemplate().type;
            }

            Char.gI().i(var9.w)[var9.index] = var9;
            vdtt_w var5;
            if ((var5 = super.c) instanceof vdtt_mz) {
                vdtt_mz var6;
                (var6 = (vdtt_mz) var5).O = new vdtt_hf(114, 0, 0, 1);

                int var7;
                for (var7 = 0; var7 < var6.aa.length; ++var7) {
                    var6.aa[var7] = null;
                }

                for (var7 = 0; var7 < var6.ab.length; ++var7) {
                    var6.ab[var7] = null;
                }

                if (var2) {
                    var6.N = 1;
                } else {
                    var6.N = 2;
                }

                var6.ab[1] = var9;
            }
        } catch (Exception var8) {
        }

    }

    public final void cg(Message var1) {
        try {
            Item[] var2 = new Item[var1.reader.dis.readByte()];

            int var3;
            for (var3 = 0; var3 < var2.length; ++var3) {
                var2[var3] = new Item();
                var2[var3].a(var1);
            }

            vdtt_w var4;
            if ((var4 = super.c) instanceof vdtt_mh) {
                vdtt_mh var5;
                (var5 = (vdtt_mh) var4).P = var2;
                var5 = var5;
                Vector var6 = new Vector();

                try {
                    for (var3 = 1; var3 < var5.P.length; ++var3) {
                        var6.add(var3 + ". " + var5.P[var3].getItemTemplate().name);
                    }
                } catch (Exception var10) {
                }

                String[] var7;
                (var7 = new String[var6.size() + 1])[0] = Caption.ru;

                int var8;
                for (var8 = 0; var8 < var6.size(); ++var8) {
                    var7[var8 + 1] = (String) var6.get(var8);
                }

                if ((var8 = var7.length) > 8) {
                    var8 = 8;
                }

                vdtt_hm var9 = new vdtt_hm(1004, var7);
                var5.V.a(var9, var8);
            }
        } catch (Exception var11) {
        }

    }

    public final void ch(Message var1) {
        try {
            Item var2;
            (var2 = new Item()).a(var1);
            int var3 = var1.reader.dis.readInt();
            vdtt_w var4;
            if ((var4 = super.c) instanceof vdtt_ks) {
                vdtt_ks var5;
                vdtt_ks var6 = var5 = (vdtt_ks) var4;
                var6.V = var3;
                var6.N[0] = var2;
                var6.R = var2.a();
            }
        } catch (Exception var9) {
        }

    }

    public final void ci(Message var1) {
        try {
            Item var2;
            (var2 = new Item()).a(var1);
            vdtt_w var3;
            if ((var3 = super.c) instanceof vdtt_ju) {
                vdtt_ju var4;
                (var4 = var4 = (vdtt_ju) var3).O = var2.a();
                var4.k = vdtt_ju.a(var4.b[1].a(1002, var4), var4, var4.O);
            }
        } catch (Exception var5) {
        }

    }

    public final void cj(Message var1) {
        try {
            if (!vdtt_aa.gI().a) {
                int var2 = var1.reader.dis.readInt();
                boolean var3;
                if ((!(var3 = var1.reader.dis.readBoolean()) || !mConfig.gI().a(23)) && (var3 || !mConfig.gI().a(24)) && (var2 != Char.gI().idEntity || !mConfig.gI().a(8))) {
                    String var4 = var1.reader.readUTF();
                    (new Thread(new vdtt_cx(this, var4))).start();
                }
            }
        } catch (Exception var5) {
        }

    }

    public final void r(int var1) {
        try {
            if (this.aT != null && this.aU != null) {
                this.cI = var1;
                mConfig.gI().a(13, var1);
                this.aA.a((vdtt_k) this.aT);
                this.b((vdtt_k) this.aT);
                this.aA.a((vdtt_k) this.aU);
                this.b((vdtt_k) this.aU);
                this.dB.b = this.dw.b = false;
                switch (var1) {
                    case 0:
                    case 1:
                        this.a((vdtt_k) this.aT);
                        this.aA.b((vdtt_k) this.aT);
                        this.dB.b = true;
                        break;
                    case 2:
                        this.a((vdtt_k) this.aU);
                        this.aA.b((vdtt_k) this.aU);
                        this.dw.b = true;
                }

                this.aT.d();
                DataCenter.gI().aQ = false;
            }
        } catch (Exception var3) {
        }

    }

    public final void X() {
        this.A();
        DataCenter.gI().aQ = false;
    }

    public static void a(int var0, Item var1) {
        if (var1.id < 269 || var1.id > 273) {
            if (var1.id == 826) {
                vdtt_ba.a(9, Caption.bY, Caption.q + " " + var1.getItemTemplate().name);
                DataCenter.gI().currentScreen.c(Caption.q + " " + var1.getItemTemplate().name, -1);
                return;
            }

            if (var1.id >= 792 && var1.id <= 798) {
                vdtt_ba.a(9, Caption.bY, Caption.q + " " + Caption.tw + " " + var1.getItemTemplate().name);
                DataCenter.gI().currentScreen.c(Caption.q + " " + Caption.tw + " " + var1.getItemTemplate().name, -1);
                return;
            }

            if (var0 > 0) {
                vdtt_ba.a(9, Caption.bY, Caption.q + " " + Utlis.c(var0) + " " + var1.getItemTemplate().name);
                DataCenter.gI().currentScreen.c(Caption.q + " " + Utlis.c(var0) + " " + var1.getItemTemplate().name, -1);
            }
        }

    }

    private boolean x(int var1) {
        if (SettingsTab.K().D() == 0) {
            return false;
        } else {
            Vector var2 = new Vector();

            int var3;
            for (var3 = 0; var3 < Char.gI().arrItemBag.length; ++var3) {
                if (Char.gI().arrItemBag[var3] != null && Char.gI().arrItemBag[var3].p() && Char.gI().arrItemBag[var3].id <= var1) {
                    var2.add(Char.gI().arrItemBag[var3]);
                }
            }

            Collections.sort(var2, Item.comparator);
            var3 = var2.size() > 16 ? 16 : var2.size();
            int var4 = 0;
            Vector var5 = new Vector();

            for (int var6 = 0; var6 < var3; ++var6) {
                Item var7 = (Item) var2.get(var6);
                var5.add(var7);
                if ((float) ((long) ((var4 = (int) ((long) var4 + DataCenter.gI().as[var7.id])) * 100) / DataCenter.gI().as[var1 + 1]) >= (float) this.db) {
                    if (DataCenter.gI().an[var1 + 1] > Char.gI().bacKhoa) {
                        SettingsTab var12 = SettingsTab.K();
                        boolean var13 = true;
                        var13 = true;
                        var12.b[7] = -1;
                        var12.I();
                        DataCenter.gI().currentScreen.c(Caption.pB, -48128);
                        return false;
                    }

                    try {
                        this.ek = Utlis.a();
                        Message var8;
                        (var8 = new Message((byte) 108)).writeBoolean(true);
                        var8.writeByte(var5.size());

                        for (int var9 = 0; var9 < var5.size(); ++var9) {
                            var8.writeShort(((Item) var5.get(var9)).index);
                        }

                        var8.send();
                    } catch (Exception var11) {
                    }

                    return true;
                }
            }

            return false;
        }
    }

    private static void y(int var0) {
        try {
            if (var0 != gI().zoneID) {
                d = true;
                Message var1;
                (var1 = new Message((byte) -7)).writeByte(var0);
                var1.send();
            }
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    private static void z(int var0) {
        try {
            Message var1;
            (var1 = new Message((byte) -15)).writeByte(var0);
            var1.send();
        } catch (Exception var2) {
        }

    }

    public final void ck(Message var1) {
        try {
            vdtt_w var2;
            if ((var2 = super.c) instanceof vdtt_jm) {
                Item[] var3 = new Item[var1.reader.dis.readShort()];

                for (int var4 = 0; var4 < var3.length; ++var4) {
                    Item var5;
                    (var5 = new Item()).a(var1);
                    var5.index = var4;
                    var3[var5.index] = var5;
                }

                vdtt_jm var9 = (vdtt_jm) var2;
                byte var8 = var1.reader.dis.readByte();
                var9.T = var3;
                var9.W = var8;
            }
        } catch (Exception var7) {
        }

    }

    private static void az() {
        try {
            Message.c((byte) -20).send();
        } catch (Exception var1) {
        }

    }

    private boolean aA() {
        return this.getMapTemplate().type == 10 || this.getMapTemplate().type == 5 || this.getMapTemplate().type == 19 || this.getMapTemplate().type == 20 || this.getMapTemplate().type == 21 || this.getMapTemplate().type == 15 || this.getMapTemplate().type == 24;
    }

    public final void Y() {
        if (!this.aA()) {
            (new Message((byte) 49)).send();
            Char.gI().bF = SettingsTab.K().H();
        }

    }

    public final void Z() {
        if (!this.aA()) {
            (new Message((byte) 48)).send();
        }

    }

    public final boolean aa() {
        return Char.gI().isDie() && !this.aA();
    }

    public final void ab() {
        for (int var1 = 0; var1 < Char.gI().ba.size(); ++var1) {
            Effect var2;
            if ((var2 = (Effect) Char.gI().ba.get(var1)).id == 118) {
                Char.gI().ba.remove(var2);
                break;
            }
        }

        if (this.dk > 0L) {
            Effect var3 = new Effect(118, 0, Utlis.a(), (int) this.dk, Char.gI());
            Char.gI().ba.add(var3);
        }

    }

    public final boolean ac() {
        return this.getMapTemplate().type == 20 || this.getMapTemplate().id == 46;
    }

    public final void cl(Message var1) {
        try {
            vdtt_w var2;
            vdtt_mr var3;
            if ((var2 = super.c) instanceof vdtt_mr) {
                var3 = (vdtt_mr) var2;
            } else {
                var3 = new vdtt_mr(this);
            }

            var3.S = var1.reader.dis.readByte();
            var3.Q = Utlis.a();
            var3.P = var1.reader.dis.readInt();
            int var4;
            if (var3.S <= 2) {
                vdtt_iv[] var8 = new vdtt_iv[var1.reader.readUnsignedByte()];

                for (var4 = 0; var4 < var8.length; ++var4) {
                    var8[var4] = new vdtt_iv();
                    var8[var4].b = var1.reader.readUTF();
                    var8[var4].d = var1.reader.dis.readLong();
                    var8[var4].e = (long) var1.reader.dis.readShort();
                    var8[var4].g = var1.reader.readUTF();
                }

                var3.T = var8;
                var3.O = new vdtt_hp((byte) 1, 4, var3.N.i() + 30, var3.width - 8, 144, 18, var3.T.length);
                return;
            }

            var3.U.clear();
            byte var5 = var1.reader.dis.readByte();

            for (var4 = 0; var4 < var5; ++var4) {
                vdtt_fz var6;
                (var6 = new vdtt_fz()).a = var1.reader.readUTF();
                var6.c = var1.reader.dis.readShort();
                var6.b = var1.reader.readUTF();
                var6.d = var1.reader.dis.readShort();
                var6.e = var1.reader.dis.readByte();
                var3.U.add(var6);
            }

            var3.O = new vdtt_hp((byte) 1, 4, var3.N.i() + 30, var3.width - 8, 144, 18, var3.U.size());
        } catch (Exception var7) {
        }

    }

    public final void ad() {
        switch (gI().getMapTemplate().type) {
            case 6:
                this.a((vdtt_w) (new vdtt_jj(this)));
                return;
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 17:
            default:
                this.a((vdtt_w) (new vdtt_ms(this)));
                return;
            case 10:
            case 16:
                this.a((vdtt_w) (new vdtt_mt(this)));
                return;
            case 18:
                this.a((vdtt_w) (new vdtt_ji(this)));
                return;
            case 19:
            case 20:
                if (gI().getMapTemplate().id == 46) {
                    this.a((vdtt_w) (new vdtt_ms(this)));
                } else {
                    this.a((vdtt_w) (new vdtt_mr(this)));
                }

        }
    }

    public final void ae() {
        SettingsTab var1;
        (var1 = SettingsTab.K()).J();
        var1.f(L);
        var1.S = 0;
        var1.a(var1.width, var1.height);
        this.a((vdtt_w) var1);
        gI().dr.clear();
    }

    public final void s(int var1) {
        this.aS = null;
        DataCenter.gI().aQ = false;
        this.z();
    }

    public static Skill j(int var0, int var1) {
        for (int var2 = 0; var2 < DataCenter.gI().skill.length; ++var2) {
            if (DataCenter.gI().skill[var2].d == var0 && DataCenter.gI().skill[var2].e == var1) {
                return DataCenter.gI().skill[var2];
            }
        }

        return null;
    }

    public static boolean af() {
        for (int var0 = 0; var0 < gI().ae.length; ++var0) {
            Skill var1;
            if ((var1 = gI().ae[var0]) != null && var1.f <= Char.gI().w() && var1.l <= gI().cf) {
                return true;
            }
        }

        return false;
    }

    public final void a(int var1, Char var2, int var3) {
        for (int var4 = 0; var4 < this.cL.size(); ++var4) {
            if (((vdtt_hd) this.cL.get(var4)).k.equals(var2)) {
                return;
            }
        }

        this.cL.add(new vdtt_hd(var1, var2, var3));
    }

    public final void cm(Message var1) {
        try {
            vdtt_w var2;
            if ((var2 = gI().c) instanceof vdtt_lw) {
                ((vdtt_lw) var2).k();
            }

            byte var3 = var1.reader.dis.readByte();
            String var4 = Utlis.b(Caption.we, DataCenter.gI().a((int) var3));
            this.a((vdtt_w) (new vdtt_lw(this, var4, new String[0], -4)));
        } catch (Exception var5) {
        }

    }

    public static void cn(Message var0) {
        try {
            byte var1 = var0.reader.dis.readByte();
            String var2 = Utlis.b(Caption.we, DataCenter.gI().a((int) var1));
            DataCenter.gI().currentScreen.c(var2, -1);
        } catch (Exception var3) {
        }

    }

    public final void co(Message var1) {
        try {
            String[] var2 = new String[var1.reader.dis.readByte()];

            for (int var3 = 0; var3 < var2.length; ++var3) {
                var2[var3] = var1.reader.readUTF();
            }

            vdtt_kv var5 = new vdtt_kv(this, var2, Caption.wI);
            this.a((vdtt_w) var5);
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final void cp(Message var1) {
        try {
            vdtt_w var2;
            if ((var2 = super.c) instanceof vdtt_jy) {
                vdtt_jy var3;
                (var3 = (vdtt_jy) var2).aD[0] = var1.reader.dis.readInt();
                var3.aD[1] = var1.reader.dis.readInt();
                var3.aD[2] = var1.reader.dis.readInt();
                var3.aD[3] = var1.reader.dis.readInt();
                var3.aD[4] = var1.reader.dis.readInt();
                var3.aD[5] = var1.reader.dis.readInt();
                var3.aD[6] = var1.reader.dis.readShort();
                var3.aD[7] = var1.reader.dis.readShort();
                var3.aD[8] = var1.reader.dis.readShort();
                var3.aD[9] = var1.reader.dis.readShort();
                var3.aD[10] = var1.reader.dis.readShort();
                var3.aD[11] = var1.reader.dis.readShort();
                var3.aD[12] = var1.reader.dis.readShort();
                var3.aD[13] = var1.reader.dis.readShort();
                var3.aD[14] = var1.reader.dis.readShort();
                var3.aD[15] = var1.reader.dis.readShort();
                var3.aD[16] = var1.reader.dis.readShort();
                var3.aD[17] = var1.reader.dis.readShort();
                var3.aD[18] = var1.reader.dis.readShort();
                var3.aD[19] = var1.reader.dis.readShort();
                var3.aD[20] = var1.reader.dis.readShort();
                var3.aD[21] = var1.reader.dis.readShort();
                var3.aD[22] = var1.reader.dis.readShort();
                var3.aD[23] = var1.reader.dis.readShort();
                var3.aD[24] = var1.reader.dis.readShort();

                try {
                    var3.aA = var1.reader.dis.readInt();
                    if (var3.U.p()) {
                        var3.U.ao = var1.reader.dis.readByte();
                        var3.h(var3.U.ao);
                    }
                } catch (Exception var5) {
                }

                var3.I();
            }
        } catch (Exception var6) {
            Utlis.a(var6);
        }

    }

    public final void cq(Message var1) {
        try {
            Char var2;
            if ((var2 = this.m(var1.reader.dis.readInt())) != null) {
                var2.ao = var1.reader.dis.readByte();
                var2.ar = var1.reader.dis.readInt();
                var2.ap = var1.reader.dis.readInt();
                var2.as = var1.reader.dis.readInt();
                var2.aq = var1.reader.dis.readInt();
                vdtt_w var3;
                if ((var3 = super.c) instanceof vdtt_jy) {
                    vdtt_jy var4;
                    if ((var4 = (vdtt_jy) var3).U.idEntity != var2.idEntity) {
                        return;
                    }

                    var4.aD[0] = var2.ar;
                    var4.aD[1] = var2.ap;
                    var4.aD[2] = var2.as;
                    var4.aD[3] = var2.aq;
                    var4.h(var2.ao);
                    var4.I();
                }
            }
        } catch (Exception var5) {
            Utlis.a(var5);
        }

    }

    public final void cr(Message var1) {
        try {
            this.ay.clear();
            Vector var2 = new Vector();
            byte var3 = var1.reader.dis.readByte();

            int var4;
            for (var4 = 0; var4 < var3; ++var4) {
                int var5 = var1.reader.dis.readInt();
                Char var6;
                if ((var6 = this.m(var5)) != null) {
                    var2.add(var6);
                    if (var1.reader.dis.readByte() == 0) {
                        this.ay.add(var6);
                    }
                } else {
                    Message var7;
                    (var7 = Message.c((byte) 9)).writeInt(var5);
                    var7.send();
                }
            }

            if (gI().getMapTemplate().type == 20 && this.getMapTemplate().id != 46) {
                for (var4 = 0; var4 < this.vChar.size(); ++var4) {
                    Char var9;
                    if ((var9 = (Char) this.vChar.get(var4)).idEntity != Char.gI().idEntity && !var2.contains(var9) && !this.ax.contains(var9)) {
                        this.ax.add(var9);
                    }
                }
            }
        } catch (Exception var8) {
            Utlis.a(var8);
        }

    }

    public final void ag() {
        try {
            for (int var1 = this.b.size() - 1; var1 >= 0; --var1) {
                if (this.b.get(var1) instanceof vdtt_ak) {
                    ((vdtt_ak) this.b.get(var1)).k();
                } else if (!(this.b.get(var1) instanceof MainScreen)) {
                    this.b.remove(var1);
                }
            }
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    public final void a(XYEntity var1, XYEntity var2, boolean var3, Hashtable var4) {
        if (!var3 || var1.cx == var2.cx || var1.cy == var2.cy || this.V.a(var1, var2) == null) {
            String var5 = var1.cx + "_" + var1.cy;
            String var6 = var2.cx + "_" + var2.cy;
            if (!var5.equals(var6)) {
                vdtt_gn var7;
                if ((var7 = (vdtt_gn) var4.get(var5)) == null) {
                    var7 = new vdtt_gn();
                }

                if (!var7.a.contains(var6)) {
                    var7.a.add(var6);
                    if (var3 && var1.cy == var2.cy) {
                        this.dM.add(new vdtt_fw(new XYEntity[]{var1, var2}));
                    }
                }

                var4.put(var5, var7);
            }
        }

    }

    public final void cs(Message var1) {
        try {
            Char.gI().aA = var1.reader.dis.readByte();
            vdtt_w var2;
            if ((var2 = super.c) instanceof vdtt_jy) {
                vdtt_jy var3;
                (var3 = (vdtt_jy) var2).G();
            }
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final boolean a(vdtt_ay var1) {
        return this.dt != null && this.dt.b.contains(var1) && var1.H != 100;
    }

    public static void ct(Message var0) {
        try {
            vdtt_bl.J = var0.reader.readUTF();
        } catch (Exception var2) {
        }

    }

    public final void cu(Message var1) {
        try {
            this.ct = var1.reader.dis.readByte();
            vdtt_w var2;
            if (this.ct == 0 && (var2 = super.c) instanceof vdtt_mb) {
                vdtt_mb var3;
                (var3 = (vdtt_mb) var2).Q = true;
            }
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    public final void t(int var1) {
        this.dd = var1;
    }

    public final void cv(Message var1) {
        try {
            byte var2;
            if ((var2 = var1.reader.dis.readByte()) != 10) {
                String[] var8 = new String[var1.reader.readUnsignedByte()];

                for (int var9 = 0; var9 < var8.length; ++var9) {
                    var8[var9] = var1.reader.readUTF();
                }

                vdtt_w var10 = super.c;
                switch (var2) {
                    case 0:
                        if (var10 instanceof vdtt_jy) {
                            vdtt_jy var6;
                            vdtt_jy var13;
                            a((var13 = var6 = (vdtt_jy) var10).V[var13.al].h(), var8);
                            var6.g(var6.al);
                            return;
                        }
                    case 1:
                    default:
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        if (var10.k instanceof vdtt_bl) {
                            vdtt_bl var12;
                            a((var12 = (vdtt_bl) var10.k).H.L(), var8);
                            var12.d();
                            return;
                        }

                        if (var10.k instanceof vdtt_bm) {
                            vdtt_bm var11;
                            a((var11 = (vdtt_bm) var10.k).l.H.L(), var8);
                            var11.l.d();
                        }
                }

                return;
            }

            for (int var3 = 0; var3 < 200; ++var3) {
                short var4 = var1.reader.dis.readShort();
                String var5 = var1.reader.readUTF();
                DataCenter.gI().itemOptionTemplate[var4].text = "(" + var4 + ")" + var5;
            }
        } catch (Exception var7) {
        }

    }

    private static void a(ItemOption[] var0, String[] var1) {
        if (var0.length == var1.length) {
            for (int var2 = 0; var2 < var0.length; ++var2) {
                var0[var2].getItemOptionTemplate().text = "(" + var0[var2].option[0] + ")" + var1[var2];
            }
        }

    }
}
