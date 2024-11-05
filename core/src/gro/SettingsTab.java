package gro;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import java.util.Vector;

public final class SettingsTab extends vdtt_ap {
   public vdtt_bb[][] a;
   private vdtt_bd[] W;
   private vdtt_bd[] X;
   private static vdtt_hm[] Y;
   private vdtt_bs[][] Z;
   private vdtt_hl[] aa;
   private int ab;
   private int ac;
   private vdtt_in ad;
   public byte[] b;
   private String[][] ae = new String[3][];
   private static SettingsTab af;
   public short c = -1;
   public static int d = -1;
   public static int M = -1;
   public static int N = -1;
   public static boolean O;
   public static boolean P;
   public static boolean Q;
   public static boolean R;
   private vdtt_bb ag;
   private vdtt_bb ah;
   private vdtt_bb ai;
   private vdtt_bb aj;
   private vdtt_bb ak;
   private vdtt_bb al;
   private vdtt_bb am;
   private vdtt_bb an;
   public int S;
   public int T;
   private vdtt_hp ao;
   private vdtt_hp[] ap;
   private vdtt_ay[] aq;
   public vdtt_by U;
   private short[] ar;
   private vdtt_ay as;
   private boolean at;
   private int au = -1;
   private Vector av = new Vector();
   public boolean V;

   public SettingsTab() {
      try {
         af = this;
         this.J();
         this.H = GameSrc.gI();
         this.a(260);
         this.J = false;
         this.ab = 17;
         this.ac = this.f() + 9 + 30;
         this.T = 21;
         String[] var1;
         int var2;
         if (Gdx.app.getType() == ApplicationType.Desktop) {
            var1 = Caption.zo;
         } else {
            var1 = new String[Caption.zo.length - 1];

            for(var2 = 0; var2 < var1.length; ++var2) {
               var1[var2] = Caption.zo[var2];
            }
         }

         this.ad = new vdtt_in(new vdtt_hm(2000, var1), this);
         this.a = new vdtt_bb[4][];
         this.Z = new vdtt_bs[3][];
         this.aa = new vdtt_hl[3];
         this.a[0] = new vdtt_bb[Caption.zk.length];

         vdtt_bb var3;
         int var4;
         boolean var5;
         for(var2 = 0; var2 < this.a[0].length; ++var2) {
            var4 = var2;
            if (var2 <= 1) {
               var4 = var2 + 1;
            }

            switch(var2) {
            case 7:
               this.a[0][var2] = this.a(this.ab, this.ac + 6 * this.T, Caption.zk[var2], this, 300 + var2);
               break;
            case 8:
               this.a[0][var2] = this.a(132, this.ac + 3 * this.T, Caption.zk[var2], this, 300 + var2);
               break;
            case 9:
               this.a[0][var2] = this.a(132, this.ac + 5 * this.T, Caption.zk[var2], this, 300 + var2);
               var3 = this.a[0][var2];
               var5 = true;
               var3.d = var5;
               break;
            case 10:
               this.a[0][var2] = this.a(132, this.ac + 3 * this.T, Caption.zk[var2], this, 300 + var2);
               var3 = this.a[0][var2];
               var5 = true;
               var3.d = var5;
               break;
            case 11:
               this.a[0][var2] = this.a(132, this.ac + 5 * this.T, Caption.zk[var2], this, 300 + var2);
               break;
            case 12:
               this.a[0][var2] = this.a(this.ab, this.ac + 5 * this.T, Caption.zk[var2], this, 300 + var2);
               break;
            default:
               if (var2 > 3) {
                  var4 = var2 - 1;
                  this.a[0][var2] = this.a(this.ab, this.ac + var4 * this.T, Caption.zk[var2], this, 300 + var2);
                  if (var2 == 6) {
                     this.a[0][var2].setXY(132, this.a[0][5].cy);
                  }
               } else {
                  this.a[0][var2] = this.a(this.ab, this.ac + var4 * this.T, Caption.zk[var2], this, 300 + var2);
               }
            }

            this.ad.a(this.a[0][var2], 0);
         }

         var3 = this.a[0][3];
         var5 = true;
         var3.d = var5;
         var3 = this.a[0][2];
         var5 = true;
         var3.d = var5;
         var3 = this.a[0][7];
         var5 = Char.gI().rank < 5;
         var3.d = var5;
         this.a[1] = new vdtt_bb[13];

         for(var2 = 0; var2 < this.a[1].length; ++var2) {
            this.a[1][var2] = this.a(this.ab - 3, this.ac + 120 + 20 + var2 * this.T, "", this, 200 + var2);
            var3 = this.a[1][var2];
            var5 = this.b[20 + var2] >= 0;
            var3.m = var5;
            this.ad.a(this.a[1][var2], 1);
         }

         this.ak = this.a(this.ab, this.ac - 3, Caption.oi, 1007);
         var3 = this.ak;
         var5 = mConfig.gI().a(35);
         var3.m = var5;
         this.ad.a(this.ak, 1);
         this.al = this.a(138, this.ac - 3, Caption.wx, 1006);
         var3 = this.al;
         var5 = mConfig.gI().a(31);
         var3.m = var5;
         this.ad.a(this.al, 1);
         this.am = this.a(this.ab, this.ac - 3 + 22, Caption.yb, 1013);
         var3 = this.am;
         var5 = mConfig.gI().a(39);
         var3.m = var5;
         this.ad.a(this.am, 1);
         (Y = new vdtt_hm[6])[0] = new vdtt_hm(400, new String[]{"5%", "10%", "15%", "20%", "25%", "30%", "35%", "40%", "45%", "50%", "55%", "60%", "65%", "70%", "75%", "80%", "85%", "90%", "95%"});
         Y[1] = new vdtt_hm(401, new String[]{"5%", "10%", "15%", "20%", "25%", "30%", "35%", "40%", "45%", "50%", "55%", "60%", "65%", "70%", "75%", "80%", "85%", "90%", "95%"});
         Y[2] = new vdtt_hm(402, Caption.AI);
         Y[3] = new vdtt_hm(403, Caption.AH);
         Y[4] = new vdtt_hm(404, Caption.AH);
         Y[5] = new vdtt_hm(405, Caption.AK);
         this.W = new vdtt_bd[Y.length];

         for(var4 = 0; var4 < this.W.length; ++var4) {
            if (var4 == 0) {
               this.W[var4] = this.a(super.width - 8 - 120, this.ac + var4 * this.T - 1 + this.T, 55, 5, Y[var4], this, 0);
            } else if (var4 == 1) {
               this.W[var4] = this.a(super.width - 8 - 120, this.ac + this.T - 1 + this.T, 55, 5, Y[var4], this, 0);
            } else if (var4 == 2) {
               this.W[var4] = this.a(super.width - 8 - 180, this.ac + var4 * this.T - 1 - 2 * this.T, 55, 5, Y[var4], this, 0);
            } else if (var4 == 3) {
               this.W[var4] = this.a(129, this.ac - 1 + this.T, 125, 5, Y[var4], this, 0);
            } else if (var4 == 4) {
               this.W[var4] = this.a(129, this.ac + this.T - 1 + this.T, 125, 5, Y[var4], this, 0);
            } else if (var4 == 5) {
               this.W[var4] = this.a(129, this.ac + this.T * 6 - 3, 115, 5, Y[var4], this, 1);
            }

            this.ad.a(this.W[var4], 0);
         }

         this.W[2].b(DataCenter.m());
         this.W[3].b(true);
         this.W[4].b(true);
         this.ag = this.a(this.ab, this.ac, Caption.co, 1001);
         var3 = this.ag;
         var5 = mConfig.gI().a(1);
         var3.m = var5;
         this.ad.a(this.ag, 2);
         this.ah = this.a(this.ab, this.ac + 20, Caption.cp, 1002);
         var3 = this.ah;
         var5 = mConfig.gI().a(0);
         var3.m = var5;
         this.ad.a(this.ah, 2);
         this.aj = this.a(135, this.ac, Caption.cH, 1004);
         var3 = this.aj;
         var5 = mConfig.gI().a(11);
         var3.m = var5;
         this.ad.a(this.aj, 2);
         var4 = this.H instanceof GameSrc ? 20 : 0;
         this.X = new vdtt_bd[8];
         vdtt_hm var6 = new vdtt_hm(1000, new String[]{Caption.cE, Caption.cF});
         if (Gdx.app.getType() == ApplicationType.Desktop) {
            var6 = new vdtt_hm(1000, new String[]{Caption.cE, Caption.cF, Caption.pG});
         }

         this.X[2] = this.a(this.ab, this.ac + 45 + var4 + 25, 105, var6.c.length, var6, this, 0);
         this.X[2].a(mConfig.gI().b(9));
         this.ad.a(this.X[2], 2);
         int var7;
         byte var8;
         if (this.H instanceof GameSrc) {
            this.ai = this.a(135, this.ac + 20, Caption.cG, 1003);
            var3 = this.ai;
            var5 = mConfig.gI().a(10);
            var3.m = var5;
            this.ad.a(this.ai, 2);
            this.ac += 20;
            this.an = this.a(this.ab, this.ac + 20, Caption.ds, 1011);
            var3 = this.an;
            var5 = mConfig.gI().a(36);
            var3.m = var5;
            this.ad.a(this.an, 2);
            var6 = new vdtt_hm(600, Caption.Bi);
            this.X[0] = this.a(135, this.ac + 20 + 25, 105, 4, var6, this, 0);
            this.X[0].a(mConfig.gI().b(25));
            this.ad.a(this.X[0], 2);
            var6 = new vdtt_hm(1005, Caption.BC);
            this.X[3] = this.a(135, this.ac + 45 + 25, 105, var6.c.length, var6, this, 0);
            this.X[3].a(mConfig.gI().b(12));
            this.ad.a(this.X[3], 2);
            var6 = new vdtt_hm(1012, Caption.BY);
            this.X[7] = this.a(this.ab, this.ac + 70 + 25, 105, var6.c.length, var6, this, 0);
            this.X[7].a(mConfig.gI().b(37));
            this.ad.a(this.X[7], 2);
            if (Gdx.app.getType() == ApplicationType.Desktop) {
               var1 = Caption.Bh;
               var8 = 3;
            } else {
               var1 = new String[2];

               for(var7 = 0; var7 < 2; ++var7) {
                  var1[var7] = Caption.Bh[var7];
               }

               var8 = 2;
            }

            vdtt_hm var9 = new vdtt_hm(700, var1);
            this.X[1] = this.a(this.ab, this.ac + 20 + 25, 105, var8, var9, this, 0);
            this.X[1].a(mConfig.gI().b(21));
            this.ad.a(this.X[1], 2);
            var6 = new vdtt_hm(1008, Caption.zu);
            this.X[4] = this.a(135, this.ac + 45, 105, AppListener.gI().o() ? 3 : var6.c.length, var6, this, 1);
            this.X[4].a(mConfig.gI().b(29));
            this.ad.a(this.X[4], 2);
            this.X[4].b(true);
            var6 = new vdtt_hm(1010, Caption.zC);
            this.X[5] = this.a(135, this.ac + 45, 105, 3, var6, this, 0);
            this.X[5].a(mConfig.gI().b(27));
            this.ad.a(this.X[5], 2);
            this.X[5].b(true);
            var6 = new vdtt_hm(1009, Caption.zw);
            this.X[6] = this.a(135, this.ac + 45, 105, DataCenter.gI().o < 300 ? 4 : 5, var6, this, 0);
            this.X[6].a(mConfig.gI().b(30));
            this.ad.a(this.X[6], 2);
            this.X[6].b(true);
         }

         if (Gdx.app.getType() == ApplicationType.Desktop) {
            this.T = 24;
            this.U = this.a(-200, -200, 100, "", this, 1083, 0);
            var8 = 1;
            this.U.l = var8;
            this.U.b(true);
            var5 = true;
            this.U.V = true;
            this.ap = new vdtt_hp[Caption.AJ.length];
            this.ao = new vdtt_hp((byte)1, 9, this.f() + 45, this.width - 10, this.T * 5, this.T, Caption.AJ.length);
            this.aq = new vdtt_ay[this.ao.i];
            this.ar = Binary.a();
            this.P();
            this.as = this.a(this.width / 2 - 30, this.height - 38, Caption.u, this, 5000, -8);
            this.ad.a(this.as, 3);
         }

         this.Q();
         this.w();
         if (DataCenter.k()) {
            this.ad.f = true;
            if (this.a != null) {
               for(var4 = 0; var4 < this.a.length; ++var4) {
                  if (this.a[var4] != null) {
                     for(var7 = 2; var7 < this.a[var4].length; ++var7) {
                        this.a[var4][var7].d = true;
                     }
                  }
               }
            }
         }
      } catch (Exception var10) {
         Utlis.a(var10);
      }

   }

   public final void w() {
      this.f(GameSrc.L);
   }

   public final void x() {
      vdtt_bb var1 = this.ag;
      boolean var2 = mConfig.gI().a(1);
      var1.m = var2;
      var1 = this.ah;
      var2 = mConfig.gI().a(0);
      var1.m = var2;
   }

   public void f(int var1) {
      if (var1 == 2) {
         this.x();
      }

      this.ad.a(var1);
      if (this.ad.h() == 1) {
         this.av.clear();

         boolean var2;
         for(var1 = 0; var1 < this.a[1].length; ++var1) {
            vdtt_bb var3 = this.a[1][var1];
            var2 = true;
            var3.d = var2;
         }

         Vector var10 = new Vector();

         for(int var4 = 0; var4 < GameSrc.gI().af.length; ++var4) {
            if (GameSrc.gI().af[var4].e > 0 && GameSrc.gI().af[var4].getSkillTemplate().levelNeed > 0 && !GameSrc.gI().af[var4].c() && GameSrc.gI().af[var4].d != 30 && GameSrc.gI().af[var4].d != 84) {
               var10.add(GameSrc.gI().af[var4]);
            }
         }

         vdtt_bb var11 = null;

         int var5;
         vdtt_bb var6;
         int var7;
         for(var7 = 0; var7 < this.a[1].length; ++var7) {
            var6 = this.a[1][var7];

            for(var5 = 0; var5 < var10.size(); ++var5) {
               Skill var8;
               int var9;
               if (!(var8 = (Skill)var10.get(var5)).m() && (var9 = var8.getSkillTemplate().levelNeed / 5) == var7) {
                  if (var8.getSkillTemplate().i == 1) {
                     var11 = var6;
                  }

                  var6.a(var8.getSkillTemplate().name);
                  var2 = false;
                  var6.d = var2;
                  var2 = this.b[20 + var9] != -1;
                  var6.m = var2;
                  this.av.add(var6);
                  var10.remove(var5);
                  break;
               }
            }
         }

         if (var11 != null) {
            this.av.remove(var11);
            this.av.add(var11);
         }

         for(var7 = 0; var7 < this.av.size(); ++var7) {
            var6 = (vdtt_bb)this.av.get(var7);
            short var12;
            if (var7 > 5) {
               var12 = 143;
               var5 = this.f() + 80 + (var7 - 6) * 20;
            } else {
               var12 = 17;
               var5 = this.f() + 80 + var7 * 20;
            }

            var6.setXY(var12, var5);
         }

         if (this.av.size() > 0) {
            this.al.setXY(144, this.al.cy);
         }
      }

   }

   private void P() {
      for(int var1 = 0; var1 < this.ao.i; ++var1) {
         switch(this.ar[var1]) {
         case 19:
            this.aq[var1] = new vdtt_ay(this.width - 30 - 80, var1 * this.ao.h, 0, 0, "", this, 1000, -19);
            break;
         case 20:
            this.aq[var1] = new vdtt_ay(this.width - 30 - 80, var1 * this.ao.h, 0, 0, "", this, 1000, -20);
            break;
         case 21:
            this.aq[var1] = new vdtt_ay(this.width - 30 - 80, var1 * this.ao.h, 0, 0, "", this, 1000, -21);
            break;
         case 22:
            this.aq[var1] = new vdtt_ay(this.width - 30 - 80, var1 * this.ao.h, 0, 0, "", this, 1000, -22);
            break;
         default:
            if (var1 > 3 && var1 < 10) {
               this.aq[var1] = new vdtt_ay(this.width - 30 - 80, (4 + (9 - var1)) * this.ao.h, 0, 0, Keys.toString(this.ar[var1]), this, 1000, -23);
            } else {
               this.aq[var1] = new vdtt_ay(this.width - 30 - 80, var1 * this.ao.h, 0, 0, Keys.toString(this.ar[var1]), this, 1000, -23);
            }
         }

         this.aq[var1].setSize(30, this.T - 4);
         this.ap[var1] = new vdtt_hu((byte)1, 0, 0, this.aq[var1].width, this.aq[var1].height, this.aq[var1].height, 1, this.ao);
      }

   }

   private void Q() {
      vdtt_bb var1;
      int var2;
      boolean var3;
      for(var2 = 0; var2 < this.a[0].length; ++var2) {
         if (var2 == 10) {
            var1 = this.a[0][var2];
            var3 = this.b[40] != -1;
            var1.m = var3;
         } else if (var2 == 11) {
            var1 = this.a[0][var2];
            var3 = this.b[41] != -1;
            var1.m = var3;
         } else if (var2 == 12) {
            var1 = this.a[0][var2];
            var3 = this.b[42] != -1;
            var1.m = var3;
         } else {
            var1 = this.a[0][var2];
            var3 = this.b[var2] != -1;
            var1.m = var3;
         }
      }

      var1 = this.a[0][6];
      var3 = !this.a[0][5].m;
      var1.c = var3;

      for(var2 = 0; var2 < this.W.length; ++var2) {
         byte var4;
         if ((var4 = this.b[var2 + 10]) < 0) {
            var4 = 0;
         }

         this.W[var2].a(var4);
      }

   }

   public final boolean z() {
      return this.V;
   }

   public final void a(boolean var1) {
      boolean var2 = this.V != var1;
      GameSrc.gI().cy_ = -1;
      GameSrc.gI().dC = false;
      this.V = var1;
      if (var1) {
         this.c = GameSrc.gI().mapID;
         d = GameSrc.gI().mapID;
         M = Char.gI().cx;
         N = Char.gI().cy;
         GameSrc.gI().H();
         this.I();
      } else {
         this.c = -1;
      }

      GameSrc.gI().dr.clear();
      if (var2) {
         DataCenter.gI().aQ = false;
      }

   }

   public final int A() {
      if (this.b[0] == -1) {
         return 0;
      } else {
         if (this.b[10] < 0 || this.b[10] >= Y[0].c.length) {
            this.b[10] = 0;
         }

         return Integer.parseInt(Y[0].c[this.b[10]].replaceAll("%", ""));
      }
   }

   public final int B() {
      if (this.b[1] == -1) {
         return 0;
      } else {
         if (this.b[11] < 0 || this.b[11] >= Y[1].c.length) {
            this.b[11] = 0;
         }

         return Integer.parseInt(Y[1].c[this.b[11]].replaceAll("%", ""));
      }
   }

   public static int C() {
      return mConfig.gI().b(30) * Utlis.n(2);
   }

   public final int D() {
      return this.b[7] == -1 ? 0 : this.b[15] + 1;
   }

   public final int E() {
      if (!this.V) {
         return 0;
      } else {
         if (this.b[12] < 0 || this.b[12] >= Y[2].c.length) {
            this.b[12] = 0;
         }

         return this.b[12] == Y[2].c.length - 1 ? 100000 : Integer.parseInt(Y[2].c[this.b[12]].replaceAll("%", ""));
      }
   }

   public final boolean F() {
      return this.b[42] == 0;
   }

   public final boolean G() {
      return this.b[5] != -1;
   }

   public final boolean H() {
      if (DataCenter.gI().currentScreen != null) {
         for(int var1 = 0; var1 < DataCenter.gI().currentScreen.b.size(); ++var1) {
            if (DataCenter.gI().currentScreen.b.get(var1) instanceof vdtt_ee) {
               return false;
            }
         }
      }

      if (GameSrc.gI().getMapTemplate().type == 13) {
         return true;
      } else {
         return this.b[4] != -1;
      }
   }

   public void I() {
      Binary.a("arr_auto" + Char.gI().idEntity, this.b);
   }

   public final void J() {
      this.b = Binary.d("arr_auto" + Char.gI().idEntity);
      if (this.b == null || this.b.length < 50) {
         this.b = new byte[50];

         for(int var1 = 0; var1 < this.b.length; ++var1) {
            this.b[var1] = -1;
            if (var1 == 5) {
               this.b[var1] = 0;
            }

            if (var1 != 10 && var1 != 11) {
               if (var1 == 12) {
                  this.b[var1] = 5;
               } else if (var1 == 15) {
                  this.b[var1] = 0;
               } else if (var1 >= 10 && var1 <= 16) {
                  this.b[var1] = 0;
               } else if (var1 == 17) {
                  this.b[var1] = 0;
               } else if (var1 == 19) {
                  this.b[var1] = 0;
               } else if (var1 >= 20 && var1 < 32) {
                  this.b[var1] = 0;
               }
            } else {
               this.b[var1] = 5;
            }
         }
      }

   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (var1.b >= 4000 && var1.b < 5000) {
         var1.b -= 4000;
         this.au = var1.b;
         this.U.a("");
         this.U.b(false);
         this.U.setXY((super.width - 8) / 2 - this.U.width / 2, DataCenter.gI().o - 122);
         vdtt_y.a(this.U, "", "", this.U.l, this.U.m);
         vdtt_v var4 = vdtt_y.a;
         vdtt_jl var5 = new vdtt_jl(this, var1);
         var4.b = var5;
      } else {
         switch(var1.b) {
         case 2000:
            if (var1.j.k >= 0) {
               this.f(var1.j.k);
               return;
            }
            break;
         case 5000:
            this.ar = new short[]{19, 20, 21, 22, 53, 48, 46, 33, 51, 45, 29, 47, 32, 34};
            this.P();
            mInputProcessor.a(this.ar);
            this.R();
         }
      }

   }

   private void R() {
      Writer var1 = null;
      boolean var2 = false;

      label93: {
         try {
            var2 = true;
            var1 = new Writer();

            for(int var3 = 0; var3 < this.ar.length; ++var3) {
               var1.writeShort(this.ar[var3]);
            }

            Binary.a("arr_keys", var1.baos.toByteArray());
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

   public static SettingsTab K() {
      if (af == null) {
         L();
      }

      return af;
   }

   public static void L() {
      af = new SettingsTab();
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      try {
         if (var1 == 100 && (GameSrc.gI().idTask != 5 || GameSrc.gI().idTask == 5 && !DataCenter.gI().pointHelper.b())) {
            try {
               Message var8;
               (var8 = new Message((byte)-15)).writeByte(this.aa[2].a() == 0 ? 0 : this.aa[2].a() + 1);
               var8.send();
            } catch (Exception var6) {
            }

            this.k();
         } else {
            if (var1 >= 200 && var1 < 212) {
               var1 -= 200;
               this.b[20 + var1] = (byte)(this.a[1][var1].m ? var1 : -1);
            } else if (var1 >= 300 && var1 < 400) {
               var1 -= 300;
               if (var1 == 10) {
                  this.b[40] = (byte)(this.a[0][var1].m ? 0 : -1);
               } else if (var1 == 11) {
                  this.b[41] = (byte)(this.a[0][var1].m ? 0 : -1);
               } else if (var1 == 12) {
                  this.b[42] = (byte)(this.a[0][var1].m ? 0 : -1);
               } else {
                  this.b[var1] = (byte)(this.a[0][var1].m ? 0 : -1);
               }

               if (var1 == 2) {
                  this.a(this.a[0][var1].m);
               }

               if (var1 == 7 && this.a[0][var1].m) {
                  DataCenter.gI().currentScreen.c(Caption.pC, -2560);
               }

               if (var1 == 9 && this.a[0][var1].m) {
                  DataCenter.gI().currentScreen.c(Caption.pD, -2560);
               }

               vdtt_bb var4;
               boolean var5;
               if (var1 == 8 && this.a[0][var1].m) {
                  var4 = this.a[0][4];
                  var5 = false;
                  var4.m = var5;
                  this.b[4] = -1;
               }

               if (var1 == 4 && this.a[0][var1].m) {
                  var4 = this.a[0][8];
                  var5 = false;
                  var4.m = var5;
                  this.b[8] = -1;
               }

               if (var1 == 5) {
                  var4 = this.a[0][6];
                  var5 = !this.a[0][5].m;
                  var4.c = var5;
               }
            } else if (var1 >= 400 && var1 < 500) {
               var1 -= 400;
               this.b[var1 + 10] = (byte)this.W[var1].n.b;
            } else if (var1 < 500 || var1 >= 600) {
               if (var1 == 600) {
                  if (this.X[0].n.b == mConfig.gI().b(25)) {
                     return;
                  }

                  mConfig.gI().a(25, this.X[0].n.b);
                  Graphics.d();
               } else if (var1 == 700) {
                  if (!this.g(this.X[1].n.b)) {
                     return;
                  }
               } else if (var1 < 800 || var1 >= 804) {
                  switch(var1) {
                  case 1000:
                     mConfig.gI().a(9, this.X[2].n.b);
                     break;
                  case 1001:
                     vdtt_aa.gI().c(this.ag.m);
                     break;
                  case 1002:
                     vdtt_aa.gI().b(this.ah.m);
                     break;
                  case 1003:
                     mConfig.gI().a(10, this.ai.m);
                     break;
                  case 1004:
                     mConfig.gI().a(11, this.aj.m);
                     break;
                  case 1005:
                     mConfig.gI().a(12, this.X[3].n.b);
                     DataCenter.gI().aQ = false;
                     GameSrc.gI().aE.j();
                     break;
                  case 1006:
                     mConfig.gI().a(31, this.al.m);
                     break;
                  case 1007:
                     mConfig.gI().a(35, this.ak.m);
                     break;
                  case 1008:
                     if (mConfig.gI().b(29) != this.X[4].n.b) {
                        mConfig.gI().a(29, this.X[4].n.b);
                        this.v();
                        this.i();
                        GameSrc.gI().ae();
                        vdtt_aa.gI().w();
                     }
                     break;
                  case 1009:
                     mConfig.gI().a(30, this.X[6].n.b);
                     GameSrc.gI().X();
                     break;
                  case 1010:
                     mConfig.gI().a(27, this.X[5].n.b);
                     GameSrc.gI().X();
                     break;
                  case 1011:
                     mConfig.gI().a(28, this.an.m);
                     break;
                  case 1012:
                     mConfig.gI().a(37, this.X[7].n.b);
                     DataCenter.gI().aQ = false;
                     GameSrc.gI().A();
                     break;
                  case 1013:
                     mConfig.gI().a(39, this.am.m);
                  }
               }
            }

            if (this.ad.h() == 0 || this.ad.h() == 1) {
               this.I();
            }
         }
      } catch (Exception var7) {
      }

   }

   public final void b(boolean var1) {
      this.b[5] = (byte)(var1 ? 0 : -1);
      vdtt_bb var2 = this.a[0][5];
      boolean var3 = this.G();
      var2.m = var3;
      var2 = this.a[0][6];
      var3 = !this.G();
      var2.c = var3;
      this.I();
   }

   public final boolean M() {
      if (GameSrc.gI().V()) {
         return false;
      } else {
         return this.V && this.b[40] == 0;
      }
   }

   public final boolean N() {
      return this.b[8] == 0;
   }

   public final void b(int var1, Object var2) {
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(this.ad.f());
      if (this.ad.h() == 3) {
         for(int var2 = 0; var2 < this.aq.length; ++var2) {
            int var3 = this.ao.cx + this.aq[var2].cx;
            int var4 = this.ao.cy + this.aq[var2].cy - this.ao.f;
            if (Utlis.a(this.ao.cx, this.ao.cy, this.ao.cx + this.ao.width, this.ao.cy + this.ao.height, var3, var4) && Utlis.a(this.ao.cx, this.ao.cy, this.ao.cx + this.ao.width, this.ao.cy + this.ao.height, var3 + this.aq[var2].width, var4 + this.aq[var2].height)) {
               this.ap[var2].cx = (short)var3;
               this.ap[var2].cy = (short)var4;
               var1.addElement(new vdtt_hi(4000 + var2, this.ap[var2].cx, this.ap[var2].cy, this.ap[var2].cx + this.ap[var2].width, this.ap[var2].cy + this.ap[var2].height, this.ap[var2], this));
            }
         }

         var1.addElement(new vdtt_hi(1002, this.ao.cx, this.ao.cy, this.ao.cx + this.ao.width, this.ao.cy + this.ao.height, this.ao, this));
      }

      return var1;
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.cg, (byte)2, this.J);
      this.ad.a(var1);
      switch(this.ad.h()) {
      case 0:
         if (!DataCenter.m()) {
            vdtt_dd.b(vdtt_dd.d, var1, Caption.zk[2], this.a[0][0].cx, this.a[0][0].cy - this.T + 10, 0, -1, -16777216);
            return;
         }
         break;
      case 1:
         return;
      case 2:
         return;
      case 3:
         Graphics var2 = var1;
         SettingsTab var3 = this;
         this.a(var1, 14, this.f() + 36, super.width - 8 - 20, this.h() - 44, 0, 22, 23, 1, 1);
         this.a(var1, this.ao);
         int var4 = var1.e;
         int var5 = var1.f;

         for(int var6 = 0; var6 < var3.ao.i; ++var6) {
            vdtt_dd.b(vdtt_dd.d, var2, Caption.AJ[var6], 50, var6 * var3.ao.h + 10, 0, -1, -16777216);
            var3.a(var2, var4 + var3.aq[var6].cx, var5 + var3.aq[var6].cy);
            var3.aq[var6].b = var6 == var3.au;
            var3.aq[var6].b(var2);
            var3.a(var2, var4, var5);
         }

         var3.a(var2);
         var3.ao.b(var2, var3);
      }

   }

   public final void a_() {
      if (!this.at) {
         this.at = true;
         this.Q();
      }

      this.ad.e();
      GameSrc.L = this.ad.h();
      if (this.ao != null) {
         this.ao.a();
      }

      vdtt_bb var1 = this.a[0][7];
      boolean var2 = Char.gI().rank < 5;
      var1.d = var2;
      this.W[5].b(Char.gI().rank < 5);
      var1 = this.a[0][8];
      var2 = GameSrc.gI().dG == null;
      var1.d = var2;
      DataCenter.gI();
      if (!DataCenter.b() && !this.n()) {
         if (GameSrc.gI().idTask == 3 && GameSrc.gI().idStep == 0) {
            if (this.a[0][0].m && this.a[0][1].m) {
               this.y();
               return;
            }

            int var3;
            if (this.ad.h() != 0) {
               var3 = this.cx + 40;
               DataCenter.gI().pointHelper.a(var3, this.cy + 42);
               DataCenter.gI().pointHelper.b = true;
               return;
            }

            if (this.S == 0) {
               this.S = 1;
            }

            SettingsTab var4 = this;

            boolean var6;
            label70: {
               for(int var5 = 0; var5 < var4.W.length; ++var5) {
                  if (var4.W[var5].N) {
                     var6 = true;
                     break label70;
                  }
               }

               var6 = false;
            }

            if (!var6) {
               int var7;
               if (!this.a[0][0].m) {
                  var3 = this.cx + this.a[0][0].cx + 5;
                  var7 = this.cy + this.a[0][0].cy;
                  DataCenter.gI().pointHelper.a(var3, var7 + 5);
                  DataCenter.gI().pointHelper.b = true;
                  return;
               }

               if (!this.a[0][1].m) {
                  var3 = this.cx + this.a[0][1].cx + 5;
                  var7 = this.cy + this.a[0][1].cy;
                  DataCenter.gI().pointHelper.a(var3, var7 + 5);
                  DataCenter.gI().pointHelper.b = true;
                  return;
               }
            }
         } else if (GameSrc.gI().idTask == 5 && GameSrc.gI().idStep == 9) {
            this.y();
         }
      }

   }

   public final void d() {
      this.at = false;
      super.d();
   }

   public static void O() {
      Q = false;
      P = false;
      O = false;
   }

   private boolean g(int var1) {
      try {
         this.X[1].a(var1);
         if (this.X[1].n.b == mConfig.gI().b(21)) {
            return false;
         } else {
            mConfig.gI().a(21, this.X[1].n.b);
            mConfig.gI().a(19, this.X[1].n.b > 0);
            GameSrc.gI().dC = false;
            GameSrc.gI().cr = 2;
            return true;
         }
      } catch (Exception var3) {
         return false;
      }
   }

   static int a(SettingsTab var0, int var1) {
      return var0.au = -1;
   }

   static short[] a(SettingsTab var0) {
      return var0.ar;
   }

   static vdtt_ay[] b(SettingsTab var0) {
      return var0.aq;
   }

   static void c(SettingsTab var0) {
      var0.P();
   }

   static void d(SettingsTab var0) {
      var0.R();
   }
}
