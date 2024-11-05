package gro;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public final class DataCenter {

    public String ipServer;
    public int portServer;
    public String ipServerMic;
    public int portServerRecv;
    public int portServerSend;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public String s;
    public int t;
    public int ver1;
    public int ver2;
    public float w;
    public vdtt_gc[] x;
    public vdtt_gz[] y;
    public vdtt_hb[] z;
    public vdtt_ha[] A;
    public vdtt_ep[] B;
    public vdtt_et[] C;
    public Hashtable D;
    public vdtt_hh[] E;
    public NpcTemplate[] npcTemplate;
    public MobTemplate[] mobTemplate;
    public MapTemplate[] mapTemplate;
    public DataTemplateAchievement[] dataTemplateAchievement;
    public DataTaskDay[] dataTaskDay;
    public Task[] task;
    public DataNameChar[] dataNameChar;
    public DataIconChar[] dataIconChar;
    public DataNameClass[] dataNameClass;
    public ItemTemplate[] itemTemplate;
    public ItemOptionTemplate[] itemOptionTemplate;
    public SkillTemplate[] skillTemplate;
    public SkillClan[] skillClan;
    public EffectTemplate[] effectTemplate;
    public Skill[] skill;
    public DataTypeItemBody[] dataTypeItemBody;
    public short[][] V;
    public int[][] W;
    public byte[][] X;
    public Vector Y;
    public Vector Z;
    public Vector aa;
    public Hashtable ab;
    public Hashtable ac;
    public Hashtable ad;
    public Hashtable ae;
    public Hashtable af;
    public ArrayServer[] arrayServer;
    public Server ah;
    private static DataCenter aU = null;
    public MainScreen currentScreen;
    public static boolean aj;
    public static boolean ak;
    public static boolean al;
    private boolean aV;
    public int[] am;
    public int[] an;
    public int[] ao;
    public int[] ap;
    public int[] aq;
    public int[] ar;
    public long[] as;
    public long[] at;
    public long[] au;
    public long[] av;
    public String[][] aw;
    public long[] ax;
    public boolean ay;
    public boolean az;
    public PointHelper pointHelper;
    public final int aB = 17;
    public Server server;
    public static int aD;
    public int aE;
    public int aF;
    public String URL_SERVER;
    public String URL_SERVER_ASSET;
    public String URL_CHECK_ANDROID;
    public String URL_CHECK_IOS;
    public String URL_CHECK_PC;
    public String URL_IMG;
    public String URL_IMG_IOS;
    public boolean aO;
    public boolean aP;
    public boolean aQ;
    public static Vector aR = new Vector();
    public static Vector aS = new Vector();
    public static int aT;
    public int c = 0;

    public DataCenter() {
        try {
            this.ipServer = "localhost";
            this.portServer = 6868;
            this.ipServerMic = "";
            this.s = "abcdefg";
            this.t = 0;
            this.ver1 = 3;
            this.ver2 = 3;
            this.w = 1.0F;
            this.Y = new Vector();
            this.Z = new Vector();
            this.aa = new Vector();
            this.ab = new Hashtable();
            this.ac = new Hashtable();
            this.ad = new Hashtable();
            this.ae = new Hashtable();
            this.af = new Hashtable();
            this.aV = true;
            this.aw = new String[2][];
            this.az = false;
            this.URL_SERVER = new String(new byte[]{104, 116, 116, 112, 58, 47, 47, 100, 108, 46, 103, 111, 105, 114, 111, 110, 103, 112, 108, 117, 115, 46, 99, 111, 109, 47, 103, 114, 111, 47});
            this.URL_SERVER_ASSET = this.URL_SERVER + "new/";
            this.URL_CHECK_ANDROID = this.URL_SERVER;
            this.URL_CHECK_IOS = this.URL_SERVER_ASSET + "checkandroid.txt";
            this.URL_CHECK_PC = this.URL_SERVER_ASSET + "checkios.txt";
            this.URL_IMG = this.URL_SERVER_ASSET + "checkpc.txt";
            this.URL_IMG_IOS = "img/zoom";
        } catch (Exception var2) {
            System.exit(-1);
        }

    }

    public static boolean a() {
        return gI().aO;
    }

    public static boolean b() {
        if (GameSrc.gI().idTask == 14 && GameSrc.gI().idStep <= 1) {
            return false;
        } else {
            int var0 = GameSrc.gI().idTask;
            gI().getClass();
            return var0 > 17 || Char.gI().F() || Char.gI().bB;
        }
    }

    public final void c() {
        this.aQ = false;
    }

    public static DataCenter gI() {
        if (aU == null) {
            aU = new DataCenter();
        }

        return aU;
    }

    public final void createScreen(int var1, int var2, int var3) {
        try{
            this.m = 0;
            if (Gdx.app.getType() == ApplicationType.Android) {
                this.t = 0;
            } else if (Gdx.app.getType() == ApplicationType.iOS) {
                this.t = 1;
            } else {
                this.t = 2;
            }

            this.n = var2;
            this.o = var3;
            if (mConfig.gI().b(40) != 1) {
                mConfig.gI().a(40, 1);
                Binary.b();
            }

            this.currentScreen = new CheckVersionScreen();
            this.aQ = false;
            if (this.pointHelper == null) {
                this.pointHelper = new PointHelper();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public final void a(boolean var1) {
        gI().aO = false;
        (new Thread(new vdtt_dh(this, var1))).start();
    }

    private void a(Reader var1) {
        try {
            short var2 = var1.dis.readShort();
            this.Y.clear();

            for (short var3 = 0; var3 < var2; ++var3) {
                short var4 = var1.dis.readShort();
                short var5 = var1.dis.readShort();
                short var6 = var1.dis.readShort();
                byte var7 = var1.dis.readByte();
                byte var8 = var1.dis.readByte();
                short[][] var9 = new short[var1.dis.readByte()][];

                int var12;
                for (int var10 = 0; var10 < var9.length; ++var10) {
                    var9[var10] = new short[var1.dis.readShort()];
                    short var11 = 0;

                    for (var12 = 0; var12 < var9[var10].length; ++var12) {
                        short[] var13 = var9[var10];
                        short var15 = var1.readUnsignedByte();
                        var13[var12] = var15;
                        var11 = var15;
                    }

                    if (var10 == 5 && var9[var10].length > 1) {
                        var9[var10] = new short[]{(short) (var9[var10][0] * 256 + var9[var10][1])};
                    }

                    if (var10 == 1 && var9[var10].length <= 1) {
                        var9[var10] = new short[]{var11, var11, var11, var11, var11, var11, var11, var11};
                    }
                }

                vdtt_fe[] var18 = new vdtt_fe[var1.dis.readByte()];

                int var19;
                for (var19 = 0; var19 < var18.length; ++var19) {
                    var18[var19] = new vdtt_fe();
                    var18[var19].a = new vdtt_ff[var1.dis.readByte()];

                    for (var12 = 0; var12 < var18[var19].a.length; ++var12) {
                        var18[var19].a[var12] = new vdtt_ff();
                        a(var18[var19].a[var12].a = var1.dis.readShort());
                        if (!this.Y.contains(var18[var19].a[var12].a)) {
                            this.Y.add(var18[var19].a[var12].a);
                        }

                        var18[var19].a[var12].e = var1.dis.readBoolean();
                        var18[var19].a[var12].b = var1.dis.readShort();
                        var18[var19].a[var12].c = var1.dis.readShort();
                        var18[var19].a[var12].d = var1.dis.readShort();
                    }
                }

                for (var19 = 0; var19 < this.npcTemplate.length; ++var19) {
                    if (this.npcTemplate[var19].idDataIcon == var3) {
                        this.npcTemplate[var19].width = var4;
                        this.npcTemplate[var19].height = var5;
                        this.npcTemplate[var19].g = var6;
                        this.npcTemplate[var19].h = (short) var7;
                        this.npcTemplate[var19].b = var18;
                        this.npcTemplate[var19].a = var9;
                        NpcTemplate var20 = this.npcTemplate[var19];
                        var20.height = (short) (var20.height + var8);
                    }
                }

                label115:
                for (var19 = 0; var19 < this.mobTemplate.length; ++var19) {
                    if (this.mobTemplate[var19].indexData == var3) {
                        this.mobTemplate[var19].width = var4;
                        this.mobTemplate[var19].height = (short) (var5 - 3);
                        this.mobTemplate[var19].j = var6;
                        this.mobTemplate[var19].idIcon = (short) var7;
                        MobTemplate var22 = this.mobTemplate[var19];
                        var22.height = (short) (var22.height + var8);
                        this.mobTemplate[var19].b = var18;
                        this.mobTemplate[var19].a = var9;
                        MobTemplate var21 = this.mobTemplate[var19];

                        try {
                            for (int var14 = 0; var14 < var21.a[3].length; ++var14) {
                                for (int var23 = 0; var23 < var21.b[var21.a[3][var14]].a.length; ++var23) {
                                    if (var21.b[var21.a[3][var14]].a[var23].a == 0) {
                                        var21.s = var21.b[var21.a[3][var14]].a[var23];
                                        continue label115;
                                    }
                                }
                            }
                        } catch (Exception var17) {
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void b(Reader var1) {
        try {
            short var2 = var1.dis.readShort();
            this.aa.clear();

            for (short var3 = 0; var3 < var2; ++var3) {
                this.aa.add(var1.readUTF());
            }

            this.aa.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void c(Reader var1) {
        try {
            vdtt_gc[] var2 = new vdtt_gc[var1.readUnsignedByte()];

            for (int var3 = 0; var3 < var2.length; ++var3) {
                var2[var3] = new vdtt_gc();
                var2[var3].a = var1.dis.readByte();
                var2[var3].b = new vdtt_ga[var1.readUnsignedByte()];

                for (int var4 = 0; var4 < var2[var3].b.length; ++var4) {
                    var2[var3].b[var4] = new vdtt_ga();
                    var2[var3].b[var4].a = var1.dis.readShort();
                    var2[var3].b[var4].b = var1.dis.readShort();
                    var2[var3].b[var4].c = var1.dis.readShort();
                    var2[var3].b[var4].d = var1.dis.readByte();
                }
            }

            this.x = var2;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void d(Reader var1) {
        try {
            byte[][] var2 = new byte[var1.dis.readByte()][];

            for (int var3 = 0; var3 < var2.length; ++var3) {
                var2[var3] = new byte[var1.dis.readByte()];

                for (int var4 = 0; var4 < var2[var3].length; ++var4) {
                    var2[var3][var4] = var1.dis.readByte();
                }
            }

            if (this.X == null || this.X.length == 0) {
                this.X = var2;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void e(Reader var1) {
        try {
            vdtt_gz.a = var1.dis.readShort();
            vdtt_gz.b = var1.dis.readShort();
            short var2 = var1.readUnsignedByte();
            aR.clear();
            vdtt_gz[] var3 = new vdtt_gz[var1.dis.readShort()];

            byte var7;
            for (int var4 = 0; var4 < var3.length; ++var4) {
                var3[var4] = new vdtt_gz();
                var3[var4].c = var4;
                vdtt_gz var5 = var3[var4];
                vdtt_gz var6 = var3[var4];
                var7 = var1.dis.readByte();
                var6.e = var7;
                var5.d = var7;
                int var8 = var3[var4].d;
                if (var3[var4].d == 9) {
                    var3[var4].d = 1;
                } else if (var3[var4].d == 12) {
                    var3[var4].d = 1;
                    var3[var4].g = true;
                }

                var3[var4].h = new vdtt_hc[var2];

                for (short var9 = 0; var9 < var2; ++var9) {
                    var3[var4].h[var9] = new vdtt_hc(var1.dis.readShort());
                    if (var3[var4].h[var9].a != 0) {
                        var3[var4].h[var9].c = var1.dis.readByte();
                        var3[var4].h[var9].b = var1.dis.readShort();
                        var3[var4].h[var9].d = var1.dis.readShort();
                        var3[var4].h[var9].e = var1.dis.readShort();
                        var3[var4].h[var9].f = var1.dis.readBoolean();
                        a(var3[var4].h[var9].a);
                        if (var8 == 12 && !aR.contains(var3[var4].h[var9].a)) {
                            aR.add(var3[var4].h[var9].a);
                        }
                    }
                }
            }

            this.y = var3;
            vdtt_hb[] var14 = new vdtt_hb[var1.dis.readShort()];

            for (int var15 = 0; var15 < var14.length; ++var15) {
                var14[var15] = new vdtt_hb();
                byte var17 = var1.dis.readByte();
                var14[var15].a = new short[var17];

                for (var7 = 0; var7 < var17; ++var7) {
                    var14[var15].a[var7] = var1.dis.readShort();
                }

                var7 = var1.dis.readByte();
                var14[var15].b = new short[var7];

                for (byte var20 = 0; var20 < var7; ++var20) {
                    var14[var15].b[var20] = var1.dis.readShort();
                }
            }

            this.z = var14;
            vdtt_ha[] var16 = new vdtt_ha[var1.dis.readShort()];

            for (int var18 = 0; var18 < var16.length; ++var18) {
                var16[var18] = new vdtt_ha();
                String[] var19;
                String[] var21 = (var19 = var1.readUTF().split(";"))[0].split(",");
                var16[var18].a[0] = new short[var21.length];

                for (int var22 = 0; var22 < var21.length; ++var22) {
                    try {
                        var16[var18].a[0][var22] = Short.parseShort(var21[var22]);
                    } catch (Exception var12) {
                        var16[var18].a[0][var22] = 0;
                    }
                }

                if (var19.length > 1) {
                    String[] var23 = var19[1].split(",");
                    var16[var18].a[1] = new short[var23.length];

                    for (int var10 = 0; var10 < var23.length; ++var10) {
                        try {
                            var16[var18].a[1][var10] = Short.parseShort(var23[var10]);
                        } catch (Exception var13) {
                            var16[var18].a[1][var10] = 0;
                        }
                    }
                }

                var1.readUTF();
                var1.readUTF();
            }

            this.A = var16;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void f(Reader var1) {
        try {
            vdtt_ep[] var2 = new vdtt_ep[var1.dis.readShort()];

            for (int var3 = 0; var3 < var2.length; ++var3) {
                var2[var3] = new vdtt_ep();
                var2[var3].a = var1.dis.readByte();
                var2[var3].b = var1.dis.readByte();
                var2[var3].c = var1.dis.readByte();
                var2[var3].d = var1.dis.readByte();
                var2[var3].e = var1.dis.readShort();
                var2[var3].j = var1.dis.readBoolean();
                var2[var3].k = var1.dis.readBoolean();
                var2[var3].f = var1.dis.readShort();
                var2[var3].g = var1.dis.readShort();
                var2[var3].h = var1.dis.readShort();
                var2[var3].i = var1.dis.readShort();
                if (var2[var3].i < 25) {
                    var2[var3].i = 25;
                }

                var2[var3].l = new short[var1.dis.readByte()][];
                String var4 = "";

                int var5;
                int var6;
                for (var5 = 0; var5 < var2[var3].l.length; ++var5) {
                    var2[var3].l[var5] = new short[var1.dis.readByte()];

                    for (var6 = 0; var6 < var2[var3].l[var5].length; ++var6) {
                        var2[var3].l[var5][var6] = var1.dis.readShort();
                        var4 = var4 + var2[var3].l[var5][var6] + ", ";
                    }

                    var4 = var4 + "; ";
                }

                var2[var3].m = new short[var1.dis.readByte()][];

                for (var5 = 0; var5 < var2[var3].m.length; ++var5) {
                    var2[var3].m[var5] = new short[var1.dis.readByte()];

                    for (var6 = 0; var6 < var2[var3].m[var5].length; ++var6) {
                        var2[var3].m[var5][var6] = var1.dis.readShort();
                    }
                }
            }

            if (this.B == null || this.B.length == 0) {
                this.B = var2;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void g(Reader var1) {
        try {
            Vector var2 = new Vector();
            vdtt_et[] var3 = new vdtt_et[var1.dis.readShort()];

            for (int var4 = 0; var4 < var3.length; ++var4) {
                var3[var4] = new vdtt_et();
                var3[var4].a = var1.dis.readByte();
                var3[var4].b = new vdtt_eu[var1.readUnsignedByte()];

                for (int var5 = 0; var5 < var3[var4].b.length; ++var5) {
                    var3[var4].b[var5] = new vdtt_eu();
                    var3[var4].b[var5].a = var1.dis.readShort();
                    if (!var2.contains(var3[var4].b[var5].a)) {
                        var2.add(var3[var4].b[var5].a);
                    }

                    a(var3[var4].b[var5].a);
                    var3[var4].b[var5].b = var1.dis.readShort();
                    var3[var4].b[var5].c = var1.dis.readShort();
                    var3[var4].b[var5].d = var1.dis.readShort();
                    var3[var4].b[var5].e = var1.dis.readBoolean();
                }
            }

            if (this.C == null || this.C.length == 0) {
                this.C = var3;
                this.Z.clear();
                this.Z.addAll(var2);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void h(Reader var1) {
        try {
            Hashtable var2 = new Hashtable();
            short var3 = var1.dis.readShort();

            for (short var4 = 0; var4 < var3; ++var4) {
                vdtt_ic var5;
                (var5 = new vdtt_ic()).a = var1.dis.readShort();
                var5.b = var1.dis.readShort();
                var5.c = var1.dis.readShort();
                var5.d = var1.dis.readByte();
                var5.e = new vdtt_id[var1.readUnsignedByte()][];

                for (int var6 = 0; var6 < var5.e.length; ++var6) {
                    var5.e[var6] = new vdtt_id[var1.readUnsignedByte()];

                    for (int var7 = 0; var7 < var5.e[var6].length; ++var7) {
                        var5.e[var6][var7] = new vdtt_id();
                        var5.e[var6][var7].a = var1.readUnsignedByte();
                        var5.e[var6][var7].b = var1.dis.readShort();
                        var5.e[var6][var7].c = var1.dis.readShort();
                        var5.e[var6][var7].d = var1.dis.readShort();
                        var5.e[var6][var7].e = var1.dis.readShort();
                        var5.e[var6][var7].f = var1.dis.readShort();
                        var5.e[var6][var7].g = var1.dis.readShort();
                    }
                }

                var2.put(var5.a, var5);
            }

            if (this.D == null || this.D.size() == 0) {
                this.D = var2;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void i(Reader var1) throws IOException {
        vdtt_hh[] var2 = new vdtt_hh[var1.dis.readShort()];

        for (int var3 = 0; var3 < var2.length; ++var3) {
            var2[var3] = new vdtt_hh();
            var2[var3].a = var1.dis.readByte();
            var2[var3].b = new vdtt_hg[var1.readUnsignedByte()];

            for (int var4 = 0; var4 < var2[var3].b.length; ++var4) {
                var2[var3].b[var4] = new vdtt_hg();
                var2[var3].b[var4].a = var1.dis.readShort();
                var2[var3].b[var4].b = var1.dis.readByte();
                var2[var3].b[var4].c = var1.dis.readShort();
                var2[var3].b[var4].d = var1.dis.readShort();
            }
        }

        if (this.E == null || this.E.length == 0) {
            this.E = var2;
        }

    }

    private void j(Reader var1) throws IOException{
        short[][] var2 = new short[var1.dis.readShort()][14];

        for (int var3 = 0; var3 < var2.length; ++var3) {
            var2[var3][0] = var1.dis.readShort();
            var2[var3][1] = var1.dis.readShort();
            var2[var3][2] = var1.dis.readShort();
            var2[var3][3] = var1.dis.readShort();
            var2[var3][4] = var1.dis.readShort();
            var2[var3][10] = var1.dis.readShort();
            var2[var3][11] = var1.dis.readShort();
            var2[var3][5] = var1.dis.readShort();
            var2[var3][6] = var1.dis.readShort();
            var2[var3][7] = var1.dis.readShort();
            var2[var3][8] = var1.dis.readShort();
            var2[var3][9] = var1.dis.readShort();
            var2[var3][12] = var1.dis.readShort();
            var2[var3][13] = var1.dis.readShort();
        }

        if (this.V == null || this.V.length == 0) {
            this.V = var2;
        }

    }

    private static Hashtable k(Reader var0)throws IOException {
        Hashtable var1 = new Hashtable();
        short var2 = var0.dis.readShort();

        for (short var3 = 0; var3 < var2; ++var3) {
            short var4 = var0.dis.readShort();

            for (short var5 = 0; var5 < var4; ++var5) {
                var1.put(var0.dis.readShort(), new vdtt_ea(var3, var0.readUnsignedByte(), var0.readUnsignedByte(), var0.dis.readShort(), var0.dis.readShort()));
            }
        }

        return var1;
    }

    private static Hashtable l(Reader var0)throws IOException {
        Hashtable var1 = new Hashtable();
        short var2 = var0.dis.readShort();

        for (short var3 = 0; var3 < var2; ++var3) {
            var1.put(var0.dis.readShort(), new vdtt_ea((short) -1, (short) 0, (short) 0, var0.dis.readShort(), var0.dis.readShort()));
        }

        return var1;
    }

    private static void m(Reader var0) throws IOException{
        ArrayServer[] var1 = new ArrayServer[var0.dis.readByte()];

        for (int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = new ArrayServer();
            var1[var2].name = var0.readUTF();
            var1[var2].server = new Server[var0.dis.readByte()];

            for (int var3 = 0; var3 < var1[var2].server.length; ++var3) {
                var1[var2].server[var3] = new Server();
                var1[var2].server[var3].id = var0.dis.readShort();
                var1[var2].server[var3].name = var0.readUTF();
                var1[var2].server[var3].ipServer = var0.readUTF();
                var1[var2].server[var3].portServer = var0.dis.readShort();
                var1[var2].server[var3].portCheckOnline = var0.dis.readShort();
            }
        }

    }

    private static void a(short var0) {
        if (!aS.contains(var0)) {
            aS.addElement(var0);
        }

    }

    public final void readArrDataGame2(Message var1) {
        try {
            ItemOptionTemplate[] var2 = new ItemOptionTemplate[var1.readShort()];

            for (int var3 = 0; var3 < var2.length; ++var3) {
                var2[var3] = new ItemOptionTemplate(var3);
                var2[var3].text = Caption.a(var1.reader.readUTF());
                var2[var3].type = var1.readByte();
                var2[var3].level = var1.readByte();
                var2[var3].strOption = var1.reader.readUTF();
            }

            this.itemOptionTemplate = var2;
            EffectTemplate[] var11 = new EffectTemplate[var1.readShort()];

            for (int var4 = 0; var4 < var11.length; ++var4) {
                var11[var4] = new EffectTemplate(var4);
                var11[var4].name = var1.reader.readUTF();
                var11[var4].detail = var1.reader.readUTF();
                var11[var4].type = var1.reader.readUnsignedByte();
                var11[var4].idIcon = var1.readShort();
                var11[var4].idAura = var1.readShort();
            }

            this.effectTemplate = var11;
            ItemTemplate[] var12 = new ItemTemplate[var1.readShort()];

            for (int var5 = 0; var5 < var12.length; ++var5) {
                var12[var5] = new ItemTemplate(var5);
                var12[var5].name = Caption.a(var1.reader.readUTF());
                var12[var5].detail = var1.reader.readUTF();
                var12[var5].isXepChong = var1.readBoolean();
                var12[var5].gioiTinh = var1.readByte();
                var12[var5].type = var1.readByte();
                var12[var5].typeChar = var1.readByte();
                var12[var5].idIcon = var1.readShort();
                var12[var5].levelNeed = var1.reader.readUnsignedByte();
                var12[var5].phamChatNeed = var1.readUnsignedShort();
                var12[var5].width = var1.readShort();
                var12[var5].height = var1.readShort();
            }

            this.itemTemplate = var12;
            this.d(var1.reader);
            this.f(var1.reader);
            this.g(var1.reader);
            this.h(var1.reader);
            this.j(var1.reader);
        } catch (Exception var9) {
            Utlis.a(var9);
        } finally {
            if (var1 != null) {
                var1.close();
            }

        }

    }

    public final void b(boolean var1) {
        if (k()) {
            var1 = true;
        }

        Reader var2 = null;

        try {
            byte[] var5;
            try {
                if ((var2 = Binary.a("arr_data_game")) != null) {
                    if (this.c == var2.dis.available()) {
                    }

                    this.c = var2.dis.available();
                    this.dataIconChar = new DataIconChar[var2.dis.readByte()];

                    int var3;
                    for (var3 = 0; var3 < this.dataIconChar.length; ++var3) {
                        this.dataIconChar[var3] = new DataIconChar(var3);
                        this.dataIconChar[var3].idIcon = var2.dis.readShort();
                    }

                    this.dataNameClass = new DataNameClass[var2.dis.readByte()];

                    for (var3 = 0; var3 < this.dataNameClass.length; ++var3) {
                        this.dataNameClass[var3] = new DataNameClass(var3);
                        this.dataNameClass[var3].name = var2.readUTF();
                    }

                    this.dataNameChar = new DataNameChar[var2.dis.readByte()];

                    for (var3 = 0; var3 < this.dataNameChar.length; ++var3) {
                        this.dataNameChar[var3] = new DataNameChar(var3);
                        this.dataNameChar[var3].name = var2.readUTF();
                        this.dataNameChar[var3].type = var2.dis.readByte();
                        this.dataNameChar[var3].idIcon = var2.dis.readShort();
                    }

                    this.dataTemplateAchievement = new DataTemplateAchievement[var2.readUnsignedByte()];

                    for (var3 = 0; var3 < this.dataTemplateAchievement.length; ++var3) {
                        this.dataTemplateAchievement[var3] = new DataTemplateAchievement();
                        this.dataTemplateAchievement[var3].a = var2.dis.readByte();
                        this.dataTemplateAchievement[var3].b = var2.readUTF();
                        this.dataTemplateAchievement[var3].c = var2.dis.readInt();
                        this.dataTemplateAchievement[var3].d = var2.dis.readInt();
                        this.dataTemplateAchievement[var3].e = var2.dis.readInt();
                        this.dataTemplateAchievement[var3].f = var2.dis.readInt();
                        this.dataTemplateAchievement[var3].g = var2.dis.readInt();
                        this.dataTemplateAchievement[var3].h = var2.readUTF();
                    }

                    this.task = new Task[var2.dis.readShort()];

                    for (var3 = 0; var3 < this.task.length; ++var3) {
                        this.task[var3] = new Task();
                        this.task[var3].a = var3;
                        this.task[var3].b = Caption.a(var2.readUTF());
                        this.task[var3].c = var2.dis.readShort();
                        this.task[var3].d = var2.dis.readShort();
                        this.task[var3].e = var2.dis.readShort();
                        this.task[var3].f = var2.dis.readShort();
                        this.task[var3].g = var2.dis.readShort();
                        this.task[var3].h = var2.readUTF();
                        this.task[var3].i = var2.readUTF();
                        this.task[var3].j = var2.readUTF();
                        this.task[var3].k = var2.dis.readInt();
                        this.task[var3].l = var2.dis.readInt();
                        this.task[var3].m = var2.dis.readInt();
                        this.task[var3].n = var2.dis.readInt();
                        this.task[var3].o = var2.readUTF();
                        byte var16 = var2.dis.readByte();

                        for (byte var18 = 0; var18 < var16; ++var18) {
                            vdtt_ii var6;
                            (var6 = new vdtt_ii()).a = var2.dis.readByte();
                            var6.b = Caption.a(var2.readUTF());
                            var6.c = var2.dis.readShort();
                            var6.d = var2.dis.readShort();
                            var6.e = var2.dis.readShort();
                            var6.f = var2.dis.readShort();
                            var6.g = var2.dis.readShort();
                            var6.h = var2.dis.readShort();
                            var6.i = var2.dis.readShort();
                            var6.j = var2.readUTF();
                            var6.k = var2.readUTF();
                            this.task[var3].p.addElement(var6);
                        }
                    }

                    this.dataTaskDay = new DataTaskDay[var2.readUnsignedByte()];

                    for (var3 = 0; var3 < this.dataTaskDay.length; ++var3) {
                        this.dataTaskDay[var3] = new DataTaskDay();
                        this.dataTaskDay[var3].id = var2.dis.readByte();
                        this.dataTaskDay[var3].name = var2.readUTF();
                        this.dataTaskDay[var3].need = var2.dis.readShort();
                    }

                    MapTemplate[] var22 = new MapTemplate[var2.dis.readShort()];

                    for (int var17 = 0; var17 < var22.length; ++var17) {
                        var22[var17] = new MapTemplate(var17);
                        var22[var17].name = Caption.a(var2.readUTF());
                        var22[var17].typeArr = var2.readUnsignedByte();
                        var22[var17].type = var2.dis.readByte();
                        var22[var17].e = var2.dis.readByte();
                        var5 = var2.read();
                        if (var1) {
                            Binary.a("arr_map_" + var17, var5);
                        }
                    }

                    this.mapTemplate = var22;
                    ItemOptionTemplate[] var19 = new ItemOptionTemplate[var2.dis.readShort()];

                    for (int var20 = 0; var20 < var19.length; ++var20) {
                        var19[var20] = new ItemOptionTemplate(var20);
                        var19[var20].text = Caption.a(var2.readUTF());
                        var19[var20].type = var2.dis.readByte();
                        var19[var20].level = var2.dis.readByte();
                        var19[var20].strOption = var2.readUTF();
                    }

                    if (this.itemOptionTemplate == null || this.itemOptionTemplate.length == 0) {
                        this.itemOptionTemplate = var19;
                    }

                    EffectTemplate[] var23 = new EffectTemplate[var2.dis.readShort()];

                    for (int var21 = 0; var21 < var23.length; ++var21) {
                        var23[var21] = new EffectTemplate(var21);
                        var23[var21].name = var2.readUTF();
                        var23[var21].detail = var2.readUTF();
                        var23[var21].type = var2.readUnsignedByte();
                        var23[var21].idIcon = var2.dis.readShort();
                        var23[var21].idAura = var2.dis.readShort();
                    }

                    if (this.effectTemplate == null || this.effectTemplate.length == 0) {
                        this.effectTemplate = var23;
                    }

                    ItemTemplate[] var24 = new ItemTemplate[var2.dis.readShort()];

                    int var7;
                    for (var7 = 0; var7 < var24.length; ++var7) {
                        var24[var7] = new ItemTemplate(var7);
                        var24[var7].name = Caption.a(var2.readUTF());
                        var24[var7].detail = var2.readUTF();
                        var24[var7].isXepChong = var2.dis.readBoolean();
                        var24[var7].gioiTinh = var2.dis.readByte();
                        var24[var7].type = var2.dis.readByte();
                        var24[var7].typeChar = var2.dis.readByte();
                        var24[var7].idIcon = var2.dis.readShort();
                        var24[var7].levelNeed = var2.readUnsignedByte();
                        var24[var7].phamChatNeed = var2.dis.readUnsignedShort();
                        var24[var7].width = var2.dis.readShort();
                        var24[var7].height = var2.dis.readShort();
                    }

                    if (this.itemTemplate == null || this.itemTemplate.length == 0) {
                        this.itemTemplate = var24;
                    }

                    this.mobTemplate = new MobTemplate[var2.dis.readShort()];

                    for (var7 = 0; var7 < this.mobTemplate.length; ++var7) {
                        this.mobTemplate[var7] = new MobTemplate(var7);
                        this.mobTemplate[var7].timeThuHoach = var2.dis.readShort();
                        this.mobTemplate[var7].name = Caption.a(var2.readUTF());
                        this.mobTemplate[var7].detail = Caption.a(var2.readUTF());
                        this.mobTemplate[var7].speedMove = var2.dis.readShort();
                        this.mobTemplate[var7].type = var2.dis.readByte();
                        this.mobTemplate[var7].speedMoveByte = var2.dis.readByte();
                        this.mobTemplate[var7].typeMob2 = var2.dis.readByte();
                        this.mobTemplate[var7].indexData = var2.dis.readShort();
                        this.mobTemplate[var7].i = var2.dis.readShort();
                        this.mobTemplate[var7].a(var2.readUTF(), var2.readUTF());
                        if (k()) {
                            switch (var7) {
                                case 64:
                                case 66:
                                case 67:
                                case 68:
                                case 69:
                                case 70:
                                case 71:
                                case 72:
                                case 173:
                                case 174:
                                case 175:
                                case 176:
                                case 177:
                                    this.mobTemplate[var7].indexData = 674;
                                    break;
                                case 121:
                                case 122:
                                    this.mobTemplate[var7].indexData = 525;
                                    break;
                                case 156:
                                    this.mobTemplate[var7].indexData = 483;
                                    break;
                                case 157:
                                    this.mobTemplate[var7].indexData = 426;
                                    break;
                                case 158:
                                case 159:
                                case 160:
                                case 161:
                                case 162:
                                    this.mobTemplate[var7].indexData = 673;
                            }
                        }
                    }

                    this.npcTemplate = new NpcTemplate[var2.dis.readShort()];

                    for (var7 = 0; var7 < this.npcTemplate.length; ++var7) {
                        this.npcTemplate[var7] = new NpcTemplate(var7);
                        this.npcTemplate[var7].name = Caption.a(var2.readUTF());
                        this.npcTemplate[var7].detail = Caption.a(var2.readUTF());
                        this.npcTemplate[var7].idDataIcon = var2.dis.readShort();
                        this.npcTemplate[var7].hp = var2.dis.readInt();
                        this.npcTemplate[var7].mp = var2.dis.readInt();
                        this.npcTemplate[var7].i = var2.dis.readShort();
                        if (k()) {
                            switch (var7) {
                                case 27:
                                case 61:
                                    this.npcTemplate[var7].idDataIcon = 412;
                                    break;
                                case 98:
                                    this.npcTemplate[var7].idDataIcon = 411;
                                    break;
                                case 102:
                                    this.npcTemplate[var7].idDataIcon = 410;
                            }
                        }
                    }

                    this.skillTemplate = new SkillTemplate[var2.dis.readShort()];

                    for (var7 = 0; var7 < this.skillTemplate.length; ++var7) {
                        this.skillTemplate[var7] = new SkillTemplate(var7);
                        this.skillTemplate[var7].name = Caption.a(var2.readUTF().trim());
                        this.skillTemplate[var7].detail = Caption.a(var2.readUTF());
                        this.skillTemplate[var7].levelNeed = var2.dis.readShort();
                        this.skillTemplate[var7].idChar = var2.dis.readByte();
                        this.skillTemplate[var7].levelMax = var2.dis.readByte();
                        this.skillTemplate[var7].type = var2.dis.readByte();
                        this.skillTemplate[var7].idIcon = var2.dis.readShort();
                        this.skillTemplate[var7].i = var2.dis.readShort();
                    }

                    this.skill = new Skill[var2.dis.readShort()];

                    short var26;
                    for (var26 = 0; var26 < this.skill.length; ++var26) {
                        Skill var8;
                        (var8 = new Skill()).c = var2.dis.readShort();
                        var8.d = var2.dis.readShort();
                        var8.e = var2.dis.readByte();
                        var8.f = var2.readUnsignedByte();
                        var8.g = var2.dis.readShort();
                        var8.h = var2.dis.readInt();
                        var8.i = var2.dis.readShort();
                        var8.j = var2.dis.readShort();
                        var8.k = var2.dis.readByte();
                        var8.l = var2.dis.readLong();
                        var8.m = var2.readUTF();
                        this.skill[var8.c] = var8;
                    }

                    this.skillClan = new SkillClan[var2.readUnsignedByte()];

                    for (var26 = 0; var26 < this.skillClan.length; ++var26) {
                        SkillClan var25;
                        (var25 = new SkillClan()).a = var26;
                        var25.b = var2.readUTF();
                        var25.c = var2.readUTF();
                        var25.d = var2.readUnsignedByte();
                        var25.e = var2.readUTF();
                        var25.f = var2.dis.readShort();
                        var25.g = var2.dis.readInt();
                        var25.h = var2.dis.readInt();
                        this.skillClan[var26] = var25;
                    }

                    this.dataTypeItemBody = new DataTypeItemBody[var2.dis.readByte()];

                    for (var7 = 0; var7 < this.dataTypeItemBody.length; ++var7) {
                        this.dataTypeItemBody[var7] = new DataTypeItemBody();
                        this.dataTypeItemBody[var7].type = var2.dis.readByte();
                    }

                    this.ab = k(var2);
                    this.ad = l(var2);
                    this.ac = k(var2);
                    this.ae = l(var2);
                    this.c(var2);
                    this.d(var2);
                    this.e(var2);
                    this.f(var2);
                    this.g(var2);
                    this.i(var2);
                    this.h(var2);
                    this.j(var2);
                    this.a(var2);
                    this.b(var2);
                    m(var2);
                    this.am = n(var2);
                    this.an = o(var2);
                    this.ao = o(var2);
                    this.ap = o(var2);
                    this.aq = o(var2);
                    this.as = p(var2);
                    this.at = p(var2);
                    this.au = p(var2);
                    this.av = p(var2);
                    this.ar = o(var2);
                    this.aw[0] = q(var2);
                    this.aw[1] = q(var2);
                    this.ax = p(var2);
                    this.W = new int[var2.dis.readByte()][];

                    for (var7 = 0; var7 < this.W.length; ++var7) {
                        this.W[var7] = o(var2);
                    }

                    try {
                        vdtt_jf.P = new String[2][var2.dis.readByte()];

                        for (var7 = 0; var7 < vdtt_jf.P[0].length; ++var7) {
                            vdtt_jf.P[0][var7] = var2.readUTF();
                            vdtt_jf.P[1][var7] = var2.readUTF();
                        }
                    } catch (Exception var13) {
                    }

                    this.q = var2.dis.readByte();
                    return;
                }
            } catch (Exception var14) {
                AppListener var4 = AppListener.gI();
                if (Gdx.app.getType() == ApplicationType.Android && !var4.p) {
                    return;
                }

                if ((var5 = Binary.c(gI().URL_SERVER + "arr_data_game" + vdtt_y.a())) != null) {
                    Binary.a("arr_data_game", var5);
                    this.b(var1);
                }

                Utlis.a(var14);
                return;
            }
        } finally {
            if (var2 != null) {
                var2.close();
            }

            this.aO = true;
        }
    }

    private static int[] n(Reader var0)throws IOException {
        int[] var1 = new int[var0.dis.readInt()];

        for (int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = var0.dis.readShort();
        }

        return var1;
    }

    private static int[] o(Reader var0) throws IOException{
        int[] var1 = new int[var0.dis.readInt()];

        for (int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = var0.dis.readInt();
        }

        return var1;
    }

    private static long[] p(Reader var0)throws IOException {
        long[] var1 = new long[var0.dis.readInt()];

        for (int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = var0.dis.readLong();
        }

        return var1;
    }

    private static String[] q(Reader var0) throws IOException{
        String[] var1 = new String[var0.dis.readInt()];

        for (int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = var0.readUTF();
        }

        return var1;
    }

    public final void a(MainScreen var1) {
        this.currentScreen = var1;
    }

    public final MainScreen e() {
        return this.currentScreen;
    }

    public final void f() {
        Session.gI().connect(this.ipServer, this.portServer);
    }

    public final void a(Server var1) {
        this.server = var1;
        Binary.a("arr_server", this.server.ipServer + ":" + this.server.portServer);
        this.ipServer = this.server.ipServer;
        this.portServer = this.server.portServer;
    }

    public final void g() {
        try {
            gI().aP = true;
            Binary.j("arr_reset" + vdtt_y.a());
            this.ay = true;
            Message.c((byte) -126).send();
            if (Gdx.app.getType() != ApplicationType.Desktop || !(this.currentScreen instanceof vdtt_cs)) {
                this.currentScreen.i();
                return;
            }

            gI().currentScreen = LoginPCScreen.v();
        } catch (Exception var2) {
        }

    }

    public static Vector h() {
        Vector var0 = new Vector();

        for (int var1 = 0; var1 < gI().V.length; ++var1) {
            var0.add(gI().V[var1]);
        }

        return var0;
    }

    public final void i() {
        try {
            if (gI().az) {
                return;
            }

            String[] var1 = Binary.h("arr_server").split(":");

            for (int var2 = 0; var2 < gI().arrayServer.length; ++var2) {
                for (int var3 = 0; var3 < gI().arrayServer[var2].server.length; ++var3) {
                    Server var4;
                    if ((var4 = gI().arrayServer[var2].server[var3]).ipServer.toLowerCase().equals(var1[0].toLowerCase()) && var4.portServer == Integer.parseInt(var1[1])) {
                        this.server = var4;
                        this.t();
                        return;
                    }
                }
            }
        } catch (Exception var6) {
            try {
                this.t();
            } catch (Exception var5) {
            }
        }

    }

    private void t() {
        Binary.a("arr_server", this.server.ipServer + ":" + this.server.portServer);
    }

    public static int a(String var0) {
        var0 = var0.toLowerCase();
        byte var1 = mConfig.gI().b(2);
        int var2;
        if ((var2 = gI().p - 1) > 3) {
            var2 = 3;
        }

        int var3 = var2;
        if (var2 == 0) {
            return 0;
        } else if (var2 != 2 || var1 != 0 && var1 != 3) {
            if (var2 == 3 && var1 == 0) {
                return 2;
            } else {
                if (var0.contains("char")) {
                    if (var2 == 1 && (var1 == 0 || var1 == 2)) {
                        var3 = 0;
                    } else if (var2 == 2 && var1 != 2) {
                        var3 = 1;
                    } else if (var2 == 3 && var1 != 2) {
                        var3 = 2;
                    }
                } else if (var0.contains("tree") && var2 == 1 && var1 == 2) {
                    var3 = 0;
                }

                return var3;
            }
        } else {
            return var0.contains("tree") && var1 == 3 ? 0 : 1;
        }
    }

    public final boolean c(boolean var1) {
        al = true;
        aj = var1;
        this.u();
        AppListener.gI().h();
        return aj;
    }

    private void u() {
        if (aj) {
            AppListener.gI();
        }

        this.URL_SERVER = new String(new byte[]{104, 116, 116, 112, 58, 47, 47, 100, 108, 46, 103, 111, 105, 114, 111, 110, 103, 112, 108, 117, 115, 46, 99, 111, 109, 47, 103, 114, 111, 47});
        this.URL_SERVER_ASSET = this.URL_SERVER + "new/";
        this.URL_IMG = this.URL_SERVER_ASSET + "checkpc.txt";
        this.URL_CHECK_IOS = this.URL_SERVER_ASSET + "checkandroid.txt";
        this.URL_CHECK_PC = this.URL_SERVER_ASSET + "checkios.txt";
    }

    public final String a(int var1) {
        long var2 = 0L;

        for (int var4 = 0; var4 < var1; ++var4) {
            var2 += this.ax[var4];
        }

        return Utlis.c(var2 / 10L);
    }

    public static String b(int var0) {
        return Caption.Bt[var0 / 10];
    }

    public static int j() {
        int var0 = gI().p;
        int var1 = 0;
        switch (gI().p) {
            case 1:
                var1 = 1;
                break;
            case 2:
                var0 = mConfig.gI().b(2) == 1 ? 2 : 1;
                return var0;
            case 3:
                var0 = mConfig.gI().b(2) == 2 ? 3 : 2;
                return var0;
            case 4:
            case 5:
            case 6:
                var1 = mConfig.gI().b(2) == 2 ? 4 : 3;
        }

        return var1;
    }

    public static boolean k() {
        return false;
    }

    public static boolean l() {
        return aj && Gdx.app.getType() == ApplicationType.Android;
    }

    public static boolean m() {
        return false;
    }

    public static boolean n() {
        return false;
    }

    public static boolean o() {
        return false;
    }

    public static boolean p() {
        return Char.gI().w() < 20 && k();
    }

    public static boolean q() {
        if (aT == 0) {
            if (Binary.g("arr_full")) {
                aT = 1;
            } else {
                aT = 2;
            }
        }

        return aT == 1;
    }

    public static ItemTemplate b(String var0) {
        var0 = var0.toLowerCase();

        for (int var1 = 0; var1 < gI().itemTemplate.length; ++var1) {
            if (gI().itemTemplate[var1].name.toLowerCase().equals(var0)) {
                return gI().itemTemplate[var1];
            }
        }

        return null;
    }

    public static boolean c(String var0) {
        String[] var1;
        return var0 != null && (var1 = var0.split("@"))[0] != null && Utlis.l(var1[0]).equals("112246a1a984f3f6a0d2239be249d085");
    }

    public final void r() {
        String[] var1 = AppListener.q.split("\\r\\n")[1].split("=");
        this.server.name = var1[0].trim();
        String[] var2 = var1[1].split(":");
        this.server.id = Short.parseShort(var2[0].trim());
        DataCenter var3 = gI();
        Server var4 = this.server;
        String var5 = var2[1].trim();
        var4.ipServer = var5;
        var3.ipServer = var5;
        DataCenter var6 = gI();
        Server var7 = this.server;
        short var8 = Short.parseShort(var2[2].trim());
        var7.portServer = var8;
        var6.portServer = var8;
    }

    public final boolean s() {
        if (!this.aV) {
            gI();
            if (!v()) {
                return false;
            }
        }

        return true;
    }

    private static boolean v() {
        return Gdx.app.getType() == ApplicationType.iOS;
    }
}
