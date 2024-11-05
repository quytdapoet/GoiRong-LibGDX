package gro;

import java.util.Vector;

public final class vdtt_ll extends vdtt_jo {
   public Item N;
   public int O;
   public int P;
   public Item[][] Q;
   public vdtt_hk[] R;
   public vdtt_ay S;
   public long T = -1L;
   public long U = -1L;
   public ItemCho[] V;
   private vdtt_hp at;
   private vdtt_hp au;
   private vdtt_hp av;
   private vdtt_hp[] aw;
   private vdtt_hp[] ax;
   private vdtt_hp[] ay;
   private vdtt_ay[] az;
   private vdtt_ay[] aA;
   private vdtt_ay[] aB;
   private vdtt_hp aC;
   public int W = -1;
   private vdtt_in aD;
   public vdtt_in X;
   private int[] aE = new int[]{10, 20, 30, 60, 100};
   private vdtt_bd[] aF = new vdtt_bd[2];
   public vdtt_bz Y;
   private vdtt_hl aG;
   private ItemCho aH;
   private vdtt_ay aI;
   private vdtt_ay aJ;
   public vdtt_hq[] Z;
   public vdtt_hp[][] al;
   public vdtt_ay[][] am;
   public int an = 102;
   public int ao = 50;
   private int aK;
   public int ap = 75;
   private int aL = -1;
   private int aM = -1;
   public boolean[] aq;
   private int aN = -1;
   private boolean aO;
   private int aP = 0;
   public boolean ar = false;
   public int as;

   public vdtt_ll(MainScreen var1) {
      super(var1, Caption.yX);
      this.a(323);
      GameSrc.gI().bk = new ItemCho[0];
      GameSrc.gI().bj = new ItemCho[0];
      this.aD = new vdtt_in(new vdtt_hm(1001, new String[]{"", ""}), this);
      this.aD.f = true;
      this.aF[0] = new vdtt_bd(18, 60, 85, 7, new vdtt_hm(1000, DataCenter.gI().aw[DataCenter.gI().m]), this, 0, true);
      this.aD.a(this.aF[0], 0);
      this.aG = new vdtt_hl(1000, GameSrc.gI().be);
      this.aD.a(new vdtt_bs(this.aF[0].cx, this.aF[0].cy + 38, Caption.iK, this, this.aG), 0);
      this.aD.a(new vdtt_bs(this.aF[0].cx, this.aF[0].cy + 57, Caption.iL, this, this.aG), 0);
      this.aD.a(new vdtt_bs(this.aF[0].cx, this.aF[0].cy + 76, Caption.iM, this, this.aG), 0);
      this.aD.a(new vdtt_bs(this.aF[0].cx, this.aF[0].cy + 95, Caption.iN, this, this.aG), 0);
      this.aD.a(new vdtt_bs(this.aF[0].cx, this.aF[0].cy + 114, Caption.iO, this, this.aG), 0);
      this.aD.a(new vdtt_bs(this.aF[0].cx, this.aF[0].cy + 133, Caption.py, this, this.aG), 0);
      vdtt_ay var2;
      vdtt_ay var3 = var2 = new vdtt_ay(186, this.h() + 10, 0, 0, "", this, 1012, 286);
      short var4 = -360;
      var3.J = var4;
      this.aD.a(var2, 0);
      this.aI = new vdtt_ay(161, this.h() + 10, 0, 0, "", this, 1011, 287);
      var4 = -360;
      this.aI.J = var4;
      this.aD.a(this.aI, 0);
      this.aD.a(new vdtt_ay(233, this.h() + 10, 0, 0, "", this, 1013, 286), 0);
      this.aD.a(new vdtt_ay(258, this.h() + 10, 0, 0, "", this, 1014, 287), 0);
      this.F();
      this.aC = new vdtt_hp((byte)0, this.aF[0].cx, this.aF[0].cy, 28, 28, 28, 1);
      (var2 = new vdtt_ay(this.aF[0].cx + 35, this.aF[0].cy + 5, 0, 0, Caption.aK, this, 1010, 15)).setSize(45, var2.height);
      this.aD.a(var2, 1);
      this.Y = new vdtt_bz(this.aF[0].cx, this.aF[0].cy + 45, 80, "", this, 0, 2, 0);
      this.aD.a(this.Y, 1);
      vdtt_hm var5;
      (var5 = new vdtt_hm(200)).c = Caption.yl;
      var5.b = 0;
      this.aF[1] = new vdtt_bd(this.aF[0].cx, this.aF[0].cy + 105, 80, 5, var5, this, 1, true);
      this.aD.a(this.aF[1], 1);
      this.G();
      boolean var6 = false;
      this.aD.a(super.b[0]);
      if (DataCenter.k()) {
         this.an *= 3;
      }

      this.aK = 106;
      this.X = new vdtt_in(new vdtt_hm(1001, Caption.yW), this);
      if (DataCenter.k()) {
         this.X.f = true;
      }

      this.Q = new Item[this.X.j()][];
      this.am = new vdtt_ay[this.X.j()][];
      this.al = new vdtt_hp[this.X.j()][];
      this.Z = new vdtt_hq[this.X.j()];
      this.aq = new boolean[this.X.j()];
      this.aJ = this.a(this.width - 54, this.height - 25, "", this, 999, 671);
      this.a(this.aJ, 2);
      this.f(GameSrc.gI().bf);
      if (!this.aO) {
         if (super.a.b == 0) {
            this.C();
         } else if (super.a.b == 1) {
            this.D();
         }
      }

      this.aP = this.width / 2 - 22;
      if (DataCenter.m()) {
         this.M[0] = this.M[1] = true;
      }

   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].ac()) {
            this.aj.add(var1[var2]);
         }
      }

   }

   public final void C() {
      try {
         this.aO = true;
         Message var1;
         (var1 = new Message((byte)101)).writeByte(this.aF[0].n.b);
         var1.writeByte(GameSrc.gI().be);
         var1.writeShort(this.O);
         var1.send();
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }

   private void g(int var1) {
      try {
         Message var2;
         (var2 = new Message((byte)101)).writeByte(this.aF[0].n.b);
         var2.writeByte(this.aG.b);
         var2.writeShort(var1);
         var2.send();
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }

   public final void D() {
      try {
         this.aO = true;
         (new Message((byte)100)).send();
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }

   public final int E() {
      return this.aD.h();
   }

   public final void F() {
      this.at = new vdtt_hp((byte)1, 120, 60, this.width - 132, 150, 30, GameSrc.gI().bk.length);
      this.az = new vdtt_ay[GameSrc.gI().bk.length];
      this.aw = new vdtt_hu[GameSrc.gI().bk.length];

      for(int var1 = 0; var1 < GameSrc.gI().bk.length; ++var1) {
         this.az[var1] = new vdtt_ay(158, 4 + var1 * this.at.h, 0, 0, "", this, 1000, -5);
         this.az[var1].setSize(26, 20);
         this.aw[var1] = new vdtt_hu((byte)1, 0, 0, this.az[var1].width, this.az[var1].height, this.az[var1].height, 1, this.at);
      }

      this.K();
   }

   public final void G() {
      this.au = new vdtt_hp((byte)1, 120, 60, this.width - 132, 150, 30, GameSrc.gI().bj.length);
      this.aA = new vdtt_ay[GameSrc.gI().bj.length];
      this.ax = new vdtt_hu[GameSrc.gI().bj.length];

      for(int var1 = 0; var1 < GameSrc.gI().bj.length; ++var1) {
         this.aA[var1] = new vdtt_ay(158, 4 + var1 * this.au.h, 0, 0, "", this, 1000, -5);
         this.aA[var1].setSize(26, 20);
         this.ax[var1] = new vdtt_hu((byte)1, 0, 0, this.aA[var1].width, this.aA[var1].height, this.aA[var1].height, 1, this.au);
      }

      this.K();
   }

   public final void a_() {
      try {
         super.a_();
         int var1;
         if (super.a.b < 2) {
            this.aD.e();
            this.av.a();

            for(var1 = 0; var1 < this.aB.length; ++var1) {
               this.aB[var1].a_();
               this.ay[var1].a();
               if (this.ay[var1].l != -1) {
                  this.aB[var1].M = true;
               } else {
                  this.aB[var1].M = false;
               }
            }
         } else if (super.a.b == 2) {
            this.X.e();
            if (this.aq[this.X.h()]) {
               return;
            }

            if (this.Z[this.X.h()] != null) {
               this.Z[this.X.h()].a();
            }

            if (this.am[this.X.h()] != null) {
               for(var1 = 0; var1 < this.am[this.X.h()].length; ++var1) {
                  if (this.am[this.X.h()][var1] != null) {
                     this.am[this.X.h()][var1].a_();
                     this.al[this.X.h()][var1].a();
                     if (this.al[this.X.h()][var1].l != -1) {
                        this.am[this.X.h()][var1].M = true;
                     } else {
                        this.am[this.X.h()][var1].M = false;
                     }
                  }
               }
            }
         } else {
            this.B();
         }

         if (GameSrc.gI().idTask == 5 && GameSrc.gI().idStep == 0) {
            this.y();
         }
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }

   public final void b(Graphics var1) {
      try {
         super.b(var1);
         if (super.a.b < 2) {
            this.aD.a(var1);
            if (this.aD.h() == 0) {
               vdtt_dd.b(vdtt_dd.f, var1, "" + (this.O + 1), this.aI.cx + 56, this.aI.cy + 5, 2, -1, -16777216);
            }

            this.a(var1, this.aF[0].cx - 6, this.aF[0].cy - 24, 94, this.h() - 14, -11, 22, 23, 1, 1);
            this.f(var1);
            this.a(var1, this.cx, this.cy);
            switch(this.aD.h()) {
            case 0:
               this.a(var1, this.cx + 4, this.cy + this.f());
               vdtt_dd.b(vdtt_dd.d, var1, Caption.iP, this.aF[0].cx, this.aF[0].cy - 40, 0, -6488, -10275328);
               vdtt_dd.b(vdtt_dd.d, var1, Caption.iQ, this.aF[0].cx, this.aF[0].cy, 0, -6488, -10275328);
               break;
            case 1:
               a(var1, this.aC.cx, this.aC.cy, this.N, false);
               this.a(var1, this.cx + 4, this.cy + this.f());
               int var2 = this.aC.cy + 5;
               int var3 = this.aC.cx - 2;
               vdtt_dd.b(vdtt_dd.d, var1, Caption.hn, var3, var2 - 45, 0, -6488, -10275328);
               vdtt_dd.b(vdtt_dd.d, var1, Caption.iR, var3, var2 + 5, 0, -6488, -10275328);
               vdtt_dd.b(vdtt_dd.d, var1, Caption.iS, var3, var2 + 60, 0, -6488, -10275328);
               vdtt_dd.b(vdtt_dd.d, var1, Caption.iT, var3, var2 + 100, 0, -6488, -10275328);
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(this.aE[this.aF[1].n.b]), var3 + 20, var2 + 100, 0, -3089954, -16777216);
               a(var1, var3 + 20, 166, Utlis.c(this.aE[this.aF[1].n.b]), (byte)0);
               vdtt_dd.b(vdtt_dd.d, var1, "1%", var3 + 20, var2 + 117, 0, -3089954, -16777216);
               a(var1, var3 + 20, var2 + 117, "1%", (byte)0);
               this.aC.b(var1, this);
               return;
            default:
               return;
            }
         } else if (super.a.b == 2) {
            this.X.a(var1);
            this.aJ.b(false);
            if (this.aq[this.X.h()]) {
               return;
            }

            try {
               if (this.X.h() == 3) {
                  this.h(var1);
               } else {
                  if (this.X.h() != 2) {
                     this.g(var1);
                     return;
                  }

                  this.i(var1);
               }
            } catch (Exception var4) {
            }
         }
      } catch (Exception var5) {
         Utlis.a(var5);
      }

   }

   private void f(Graphics var1) {
      try {
         this.b(var1, this.av);
         var1.f(7049372);
         this.a(var1, 0, -24, this.av.width, 21, -11, 22, 23, 1, 1);
         if (this.aD.h() == 0) {
            vdtt_dd.b(vdtt_dd.e, var1, Caption.iU, 5, -14, 0, -6488, -10275328);
         } else {
            vdtt_dd.b(vdtt_dd.e, var1, Caption.iV, 5, -14, 0, -6488, -10275328);
         }

         vdtt_dd.b(vdtt_dd.e, var1, Caption.iW, 107, -14, 0, -6488, -10275328);
         vdtt_dd.b(vdtt_dd.e, var1, Caption.iX, 161, -14, 0, -6488, -10275328);
         this.a(var1, this.av);

         for(int var2 = 0; var2 < this.av.i; ++var2) {
            if (this.av.b(var2)) {
               this.a(var1, 36, var2 * this.av.h, this.av.width - 38, this.av.h - 1, 46, 22, 23, 1, 1);
               b(var1, 5, var2 * this.av.h, this.V[var2].item, this.W == var2);
               vdtt_dd.b(vdtt_dd.d, var1, this.V[var2].namePlayerSell, 38, 8 + var2 * this.av.h, 0, -1, -16777216);
               int var3;
               int var4;
               if (this.V[var2].item.M() > 1) {
                  var3 = this.V[var2].bac / this.V[var2].item.M();
                  String var5 = Caption.aI + " " + Utlis.c(this.V[var2].bac);
                  var4 = vdtt_dd.b(vdtt_dd.b, var5);
                  vdtt_dd.b(vdtt_dd.b, var1, var5, 38, 23 + var2 * this.av.h, 0, -3089954, -16777216);
                  vdtt_dd.b(vdtt_dd.b, var1, Utlis.c(var3) + "/1", 56 + var4, 23 + var2 * this.av.h, 0, -3089954, -16777216);
                  var1.c(-3089954);
                  vdtt_cz.a(var1, 98, 90, 41 + var4, 23 + var2 * this.av.h, 6);
                  var1.f();
               } else {
                  vdtt_dd.b(vdtt_dd.d, var1, Caption.aI + " " + Utlis.c(this.V[var2].bac), 38, 23 + var2 * this.av.h, 0, -3089954, -16777216);
               }

               if ((var3 = (int)((long)this.V[var2].time - Utlis.a() / 1000L)) >= 60) {
                  vdtt_dd.b(vdtt_dd.c, var1, Caption.bX + " " + Utlis.f(var3), 127, 9 + var2 * this.av.h, 2, -6488, -10275328);
               } else {
                  vdtt_dd.b(vdtt_dd.c, var1, Caption.yY[0] + " " + Caption.yY[1], 127, 9 + var2 * this.av.h, 2, -6488, -10275328);
               }

               var3 = var1.e;
               var4 = var1.f;
               this.a(var1, var3 + this.aB[var2].cx, var4 + this.aB[var2].cy);
               this.aB[var2].b(var1);
               this.a(var1, var3, var4);
            }
         }

         this.a(var1);
         this.av.b(var1, this);
      } catch (Exception var6) {
         Utlis.a(var6);
      }

   }

   private void g(Graphics var1) {
      if (this.Z[this.X.h()] != null) {
         this.a(var1, this.Z[this.X.h()]);
         int var2 = 0;

         for(int var3 = 0; var3 < this.Z[this.X.h()].i; ++var3) {
            int var4 = var3 * this.ao;

            for(int var5 = 0; var5 < this.Z[this.X.h()].O; ++var5) {
               int var6 = var5 * this.an;
               if (this.Z[this.X.h()].b(var3)) {
                  this.a(var1, var6, var4, this.an - 3, 47, -11, 22, 23, 1, 1);
                  b(var1, var6 + 5, var4 + 5, this.Q[this.X.h()][var2], this.W == var2);
                  int var7 = var1.e;
                  int var8 = var1.f;
                  if (!DataCenter.k()) {
                     vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Utlis.a(this.Q[this.X.h()][var2].getItemTemplate().name, 30), var6 + 5, var4 + 39, 0, -6488, -10275328);
                     this.a(var1, var7 + this.am[this.X.h()][var2].cx, var8 + this.am[this.X.h()][var2].cy);
                     vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.aI + " " + Utlis.c(this.Q[this.X.h()][var2].c()), 0, -6, 0, -1, -11184811);
                  } else {
                     vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Utlis.a(this.Q[this.X.h()][var2].getItemTemplate().name, 30), var6 + 39, var4 + 9, 0, -6488, -10275328);
                     vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.aI + " " + Utlis.c(this.Q[this.X.h()][var2].c()), var6 + 39, var4 + 21, 0, -1, -11184811);
                     this.a(var1, var7 + this.am[this.X.h()][var2].cx, var8 + this.am[this.X.h()][var2].cy);
                  }

                  this.am[this.X.h()][var2].b(var1);
                  this.a(var1, var7, var8);
               }

               ++var2;
               if (var2 >= this.am[this.X.h()].length) {
                  break;
               }
            }

            if (var2 >= this.am[this.X.h()].length) {
               break;
            }
         }

         this.a(var1);
         this.Z[this.X.h()].b(var1, this);
      }

   }

   private void h(Graphics var1) {
      if (this.Q[this.X.h()].length == 0) {
         this.aJ.b(true);
         vdtt_dd.a(vdtt_dd.e, var1, Caption.oS, this.width / 2, this.height / 2 + 10, 2, -2560, 2, 1);
      } else {
         if (Utlis.a() >= this.T && Utlis.a() < this.U) {
            String var2 = "";
            String var3 = "";
            if (this.T >= 0L) {
               var2 = Caption.oO + Utlis.e(this.T);
            }

            if (this.U >= 0L) {
               var3 = Caption.oP + Utlis.e(this.U);
            }

            String var4;
            if (this.T >= 0L && this.U >= 0L) {
               var4 = var2 + " - " + var3;
            } else {
               var4 = var2 + var3;
            }

            vdtt_dd.a(var1, var4, this.width / 2 - 22, this.height - 16, 2, -2560);
         } else {
            vdtt_dd.a(var1, Caption.wm, this.width / 2 - 22, this.height - 16, 2, -2560);
         }

         this.a(var1, this.Z[this.X.h()]);
         int var11 = 0;

         for(int var12 = 0; var12 < this.Z[this.X.h()].i; ++var12) {
            int var13 = var12 * 75;

            for(int var5 = 0; var5 < this.Z[this.X.h()].O; ++var5) {
               int var6 = var5 * this.an;
               if (this.Z[this.X.h()].b(var12)) {
                  Item var7 = this.Q[this.X.h()][var11];
                  this.a(var1, var6, var13, this.an - 3, 72, -11, 22, 23, 1, 1);
                  vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.xC + (var7.r + 1), var6 + 5, var13 + 8, 0, -6488, -10275328);
                  vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.yU[0] + Utlis.c(var7.q), var6 + 38, var13 + 19, 0, -1, -10275328);
                  vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.yU[1] + Utlis.c(var7.c()), var6 + 38, var13 + 28, 0, -1, -10275328);
                  if (var7.e == 0) {
                     vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, Caption.yU[3], var6 + 38, var13 + 39, 0, -65536, -11184811);
                  } else if (var7.e > 0) {
                     vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Utlis.b(Caption.yU[2], "" + var7.e), var6 + 38, var13 + 37, 0, -16711681, -10275328);
                  }

                  b(var1, var6 + 5, var13 + 15, var7, this.W == var11);
                  vdtt_cz.a(var1, 757, 0, var6 + 7, var13 + 45, 20);
                  vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, "-" + (100 - var7.c() * 100 / var7.q) + "%", var6 + 18, var13 + 57, 2, -1, -10275328);
                  var6 = var1.e;
                  int var8 = var1.f;
                  this.a(var1, var6 + this.am[this.X.h()][var11].cx, var8 + this.am[this.X.h()][var11].cy);
                  if (var7.r == this.as) {
                     this.am[this.X.h()][var11].a(this.ar);
                  } else {
                     this.am[this.X.h()][var11].a(true);
                     String var9;
                     vdtt_ay var10;
                     if (var11 < this.as) {
                        var10 = this.am[this.X.h()][var11];
                        var9 = Caption.xD;
                        var10.l = var9;
                     } else {
                        var10 = this.am[this.X.h()][var11];
                        var9 = Caption.iJ;
                        var10.l = var9;
                     }
                  }

                  if (var7.e == 0) {
                     this.am[this.X.h()][var11].d = true;
                  } else {
                     this.am[this.X.h()][var11].b(var1);
                  }

                  this.a(var1, var6, var8);
               }

               ++var11;
               if (var11 >= this.am[this.X.h()].length) {
                  break;
               }
            }

            if (var11 >= this.am[this.X.h()].length) {
               break;
            }
         }

         this.a(var1);
         this.Z[this.X.h()].b(var1, this);
      }

   }

   private void i(Graphics var1) {
      vdtt_dd.a(var1, Caption.wO, this.aP, this.height - 16, 2, -2560);
      this.a(var1, this.Z[this.X.h()]);
      int var2 = 0;

      for(int var3 = 0; var3 < this.Z[this.X.h()].i; ++var3) {
         int var4 = var3 * 75;

         for(int var5 = 0; var5 < this.Z[this.X.h()].O; ++var5) {
            int var6 = var5 * this.an;
            if (this.Z[this.X.h()].b(var3)) {
               this.a(var1, var6, var4, this.an - 3, 72, -11, 22, 23, 1, 1);
               vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, this.R[var2].a, var6 + 5, var4 + 9, 0, -6488, -10275328);

               int var7;
               for(var7 = 0; var7 < this.R[var2].b.length; ++var7) {
                  b(var1, var6 + 4 + var7 * 31, var4 + 16, this.R[var2].b[var7], this.W == var2 && this.aM == var7);
               }

               vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.sj, var6 + 5, var4 + 53, 0, -1, -11184811);
               vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Utlis.c(this.Q[this.X.h()][var2].c()) + Caption.de, var6 + 7, var4 + 63, 0, -1, -11184811);
               var6 = var1.e;
               var7 = var1.f;
               this.a(var1, var6 + this.am[this.X.h()][var2].cx, var7 + this.am[this.X.h()][var2].cy);
               this.am[this.X.h()][var2].b(var1);
               this.a(var1, var6, var7);
            }

            ++var2;
            if (var2 >= this.am[this.X.h()].length) {
               break;
            }
         }

         if (var2 >= this.am[this.X.h()].length) {
            break;
         }
      }

      this.a(var1);
      this.Z[this.X.h()].b(var1, this);
   }

   public final Vector g() {
      Vector var1 = super.g();
      int var2;
      int var3;
      int var4;
      if (super.a.b < 2) {
         for(var4 = 0; var4 < this.aB.length; ++var4) {
            var2 = this.av.cx + this.aB[var4].cx;
            var3 = this.av.cy + this.aB[var4].cy - this.av.f;
            if (Utlis.a(this.av.cx, this.av.cy, this.av.cx + this.av.width, this.av.cy + this.av.height, var2, var3) && Utlis.a(this.av.cx, this.av.cy, this.av.cx + this.av.width, this.av.cy + this.av.height, var2 + this.aB[var4].width, var3 + this.aB[var4].height)) {
               this.ay[var4].cx = (short)var2;
               this.ay[var4].cy = (short)var3;
               var1.addElement(new vdtt_hi(7000 + var4, this.ay[var4].cx, this.ay[var4].cy, this.ay[var4].cx + this.ay[var4].width, this.ay[var4].cy + this.ay[var4].height, this.ay[var4], this));
               var1.addElement(new vdtt_hi(8000 + var4, var2 - 153, var3 - 4, var2 - 153 + 28, var3 - 4 + 28, this.av, this));
            }
         }

         var1.addElement(this.aD.f());
         var1.addElement(this.av.a(1003, this));
         switch(this.aD.h()) {
         case 1:
            var1.addElement(this.aC.a(1002, this));
            var1.addElement(new vdtt_hi(1004, this.aF[0].cx, this.aF[0].cy + 128, this.aF[0].cx + 60, this.aF[0].cy + 128 + 27, (vdtt_hp)null, this));
         }
      } else if (super.a.b == 2) {
         if (this.aq[this.X.h()]) {
            var1.addElement(this.X.f());
            return var1;
         }

         try {
            var4 = 0;
            if (this.am[this.X.h()] != null) {
               for(int var5 = 0; var5 < this.am[this.X.h()].length; ++var5) {
                  var2 = this.Z[this.X.h()].cx + this.am[this.X.h()][var5].cx;
                  var3 = this.Z[this.X.h()].cy + this.am[this.X.h()][var5].cy - this.Z[this.X.h()].f;
                  if (Utlis.a(this.Z[this.X.h()].cx, this.Z[this.X.h()].cy, this.Z[this.X.h()].cx + this.Z[this.X.h()].width, this.Z[this.X.h()].cy + this.Z[this.X.h()].height, var2, var3) && Utlis.a(this.Z[this.X.h()].cx, this.Z[this.X.h()].cy, this.Z[this.X.h()].cx + this.Z[this.X.h()].width, this.Z[this.X.h()].cy + this.Z[this.X.h()].height, var2 + this.am[this.X.h()][var5].width, var3 + this.am[this.X.h()][var5].height)) {
                     this.al[this.X.h()][var5].cx = (short)var2;
                     this.al[this.X.h()][var5].cy = (short)var3;
                     if (!this.am[this.X.h()][var5].c && !this.am[this.X.h()][var5].d) {
                        var1.addElement(new vdtt_hi(3000 + var5, this.al[this.X.h()][var5].cx, this.al[this.X.h()][var5].cy, this.al[this.X.h()][var5].cx + this.al[this.X.h()][var5].width, this.al[this.X.h()][var5].cy + this.al[this.X.h()][var5].height, this.al[this.X.h()][var5], this));
                     }

                     if (this.X.h() == 2) {
                        if (this.R[var4] != null) {
                           for(int var6 = 0; var6 < this.R[var4].b.length; ++var6) {
                              var1.addElement(new vdtt_hi(5000 + var5, var2 - 48 + var6 * 31, var3 - 30, var2 - 48 + var6 * 31 + 28, var3 - 30 + 28, this.Z[this.X.h()], this, var6));
                           }
                        }
                     } else {
                        if (this.X.h() == 3) {
                           var2 += 2;
                           var3 -= 23;
                        }

                        if (DataCenter.k()) {
                           var1.addElement(new vdtt_hi(5000 + var5, var2 - 241, var3 - 9, var2 - 241 + 28, var3 - 9 + 28, this.Z[this.X.h()], this));
                        } else {
                           var1.addElement(new vdtt_hi(5000 + var5, var2 - 35, var3 - 9, var2 - 35 + 28, var3 - 9 + 28, this.Z[this.X.h()], this));
                        }
                     }
                  }

                  ++var4;
               }
            }

            var1.addElement(this.X.f());
            if (this.Z[this.X.h()] != null) {
               var1.addElement(new vdtt_hi(1002, this.Z[this.X.h()].cx, this.Z[this.X.h()].cy, this.Z[this.X.h()].cx + this.Z[this.X.h()].width, this.Z[this.X.h()].cy + this.Z[this.X.h()].height, this.Z[this.X.h()], this));
            }
         } catch (Exception var7) {
         }
      }

      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      if (super.a.b == this.w() && var1.b == 0) {
         this.d();
      }

      super.a(var1, var2, var3);
      if (this.H.c.equals(this)) {
         if (super.a.b < 2) {
            if (var1.b == 2000) {
               this.b(false, this.V[this.W]);
            }

            this.W = -1;
            if (var1.b >= 7000 && var1.b < 8000) {
               this.P = 1;
               this.W = var1.b - 7000;
               this.b(true, this.V[this.W]);
            } else if (var1.b >= 8000 && var1.b < 9000) {
               this.P = 2;
               this.W = var1.b - 8000;
               var2 = this.av.cx + this.aB[this.W].cx - 161 + 30;
               var3 = this.av.cy + this.aB[this.W].cy - this.av.f - 4;
               this.k = c(this, var1, this.V[this.W].item);
            }

            switch(var1.b) {
            case 1001:
               if (var1.j.k >= 0) {
                  this.aD.a(var1.j.k);
                  this.K();
                  return;
               }
               break;
            case 1002:
               this.P = 3;
               if (this.N == null) {
                  this.f(this.w());
                  DataCenter.gI().currentScreen.c(Caption.bW, -1);
               } else {
                  this.k = c(this, var1, this.N);
               }

               return;
            case 1004:
               this.k = b(Utlis.b(Caption.pu, Utlis.c(this.aE[this.aF[1].n.b])), this, var2 + 10, var3, 10);
               return;
            case 1010:
               vdtt_ll var10 = this;

               try {
                  if (var10.N == null) {
                     var10.f(1);
                     DataCenter.gI().currentScreen.c(Caption.bW, -1);
                  } else if (var10.Y.h() <= 0) {
                     DataCenter.gI().currentScreen.c(Caption.iY, -65536);
                  } else {
                     var2 = var10.aE[var10.aF[1].n.b];
                     if (Char.gI().bac < var2) {
                        DataCenter.gI().currentScreen.c(Utlis.b(Caption.iZ, Utlis.c(var2)), -65536);
                     } else {
                        Message var5;
                        (var5 = new Message((byte)99)).writeShort(var10.N.index);
                        var5.writeByte(var10.aF[1].n.b);
                        var5.writeInt(var10.Y.h());
                        var5.send();
                     }
                  }
                  break;
               } catch (Exception var6) {
                  Utlis.a(var6);
                  return;
               }
            case 1011:
               this.O = 0;
               this.g(0);
               return;
            case 1012:
               if ((var2 = this.O - 1) < 0) {
                  var2 = 0;
               }

               this.g(var2);
               return;
            case 1013:
               this.g(this.O + 1);
               return;
            case 1014:
               this.g(32767);
               return;
            case 2010:
               this.a(false, this.aH);
            }

            return;
         }

         if (super.a.b == 2 && var1.b < 10000) {
            this.S = null;
            this.W = this.aL = this.aM = -1;
            if (!this.aq[this.X.h()]) {
               if (var1.b >= 5000) {
                  this.W = var1.b - 5000;
                  if (this.X.h() == 2) {
                     try {
                        this.aM = (Integer)var1.k;
                        if (this.aM >= 0) {
                           this.k = c(this, var1, this.R[this.W].b[this.aM]);
                        }
                     } catch (Exception var8) {
                     }
                  } else {
                     try {
                        if (this.W >= 0) {
                           this.k = c(this, var1, this.Q[this.X.h()][this.W]);
                        }
                     } catch (Exception var7) {
                     }
                  }
               } else if (var1.b >= 3000) {
                  this.aN = this.aL = var1.b - 3000;
                  vdtt_aa.gI().n();
                  if (this.X.h() == 2) {
                     DataCenter.gI().currentScreen.a(Utlis.b(Caption.vU.replace("@", this.Q[this.X.h()][this.aL].getItemTemplate().name), Utlis.c(this.Q[this.X.h()][this.aL].c()) + Caption.de), 2000, this);
                  } else if (this.X.h() == 3) {
                     this.H.a((vdtt_w)(new vdtt_jt(this.H, this.Q[this.X.h()][this.aL], (byte)40)));
                  } else {
                     this.H.a((vdtt_w)(new vdtt_jt(this.H, this.Q[this.X.h()][this.aL], (byte)6)));
                  }
               }
            }

            switch(var1.b) {
            case 998:
               return;
            case 999:
               GameSrc.gI();
               GameSrc.W();
               return;
            case 1000:
               return;
            case 1001:
               if (var1.j.k >= 0) {
                  this.X.a(var1.j.k);
                  this.H();
                  return;
               }
               break;
            case 1005:
               return;
            case 2000:
               try {
                  Message var4;
                  (var4 = new Message((byte)121)).writeShort(this.Q[this.X.h()][this.aN].idBuy);
                  var4.writeShort(1);
                  var4.send();
                  this.S = this.am[this.X.h()][this.aN];
                  return;
               } catch (Exception var9) {
               }
            }
         }
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      super.b(var1, var2, var3);
      switch(var1) {
      case 1000:
         this.O = 0;
         GameSrc.gI().be = this.aG.b;
         this.C();
      default:
      }
   }

   public final void f(int var1) {
      if (this.aD != null && super.a.b != var1) {
         if (var1 == 0) {
            this.C();
         } else if (var1 == 1) {
            this.D();
         }
      }

      super.f(var1);
      GameSrc.gI().bf = var1;
      if (this.aD != null && super.a.b < 2) {
         this.aD.a(var1);
         this.K();
      }

      if (super.a.b == 2) {
         this.H();
      }

   }

   public void H() {
      this.aN = this.W = this.aL = this.aM = -1;
      this.X.a(this.X.g());
      if (this.Q[this.X.h()] == null) {
         this.aq[this.X.h()] = true;
         switch(this.X.h()) {
         case 0:
            GameSrc.gI();
            GameSrc.o(6);
            return;
         case 1:
            GameSrc.gI();
            GameSrc.o(7);
            return;
         case 2:
            GameSrc.gI();
            GameSrc.o(39);
            return;
         case 3:
            GameSrc.gI();
            GameSrc.o(40);
         }
      }

   }

   private void K() {
      if (this.aD != null) {
         switch(this.aD.h()) {
         case 0:
            this.V = GameSrc.gI().bk;
            this.av = this.at;
            this.ay = this.aw;
            this.aB = this.az;
            break;
         case 1:
            this.V = GameSrc.gI().bj;
            this.av = this.au;
            this.ay = this.ax;
            this.aB = this.aA;
         }

         if (super.a.b < 2 && this.aD.h() != super.a.b) {
            this.f(this.aD.h());
         }
      }

   }

   public final void a(boolean var1, ItemCho var2) {
      try {
         this.aH = var2;
         if (var1) {
            DataCenter.gI().currentScreen.a(Caption.ja, 2010, this);
         } else {
            Message var3;
            (var3 = new Message((byte)-19)).writeLong(var2.id);
            var3.send();
         }
      } catch (Exception var4) {
         Utlis.a(var4);
      }

   }

   public final void b(boolean var1, ItemCho var2) {
      try {
         if (Char.gI().bac < var2.bac) {
            DataCenter.gI().currentScreen.c(Caption.jb, -65536);
         } else if (var1) {
            DataCenter.gI().currentScreen.a(Caption.jc + var2.item.getItemTemplate().name + Caption.jd + Utlis.c(var2.bac) + Caption.je, 2000, this);
         } else {
            Message var3;
            (var3 = new Message((byte)98)).writeLong(var2.id);
            var3.send();
         }
      } catch (Exception var4) {
         Utlis.a(var4);
      }

   }

   public final ItemCho I() {
      return this.V[this.W];
   }

   public final void d() {
      super.d();
      if (this.N != null) {
         Char.gI().arrItemBag[this.N.index] = this.N;
         this.N = null;
      }

      if (GameSrc.gI().bf == 3) {
         GameSrc.gI().bf = 2;
      }

   }

   public final boolean J() {
      return this.X.h() == 2;
   }
}
