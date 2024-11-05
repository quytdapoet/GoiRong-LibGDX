package gro;

import java.util.Vector;

public final class vdtt_jm extends vdtt_jo {
   private int al = 32;
   private int am = 0;
   private int an = -1;
   private int ao = 4;
   private vdtt_jn[] ap = new vdtt_jn[]{new vdtt_jn(this, 0, 0), new vdtt_jn(this, 1, 0), new vdtt_jn(this, 2, 0), new vdtt_jn(this, 3, 0), new vdtt_jn(this, 4, 0), new vdtt_jn(this, 5, 0), new vdtt_jn(this, 6, 0), new vdtt_jn(this, 6, 1), new vdtt_jn(this, 6, 2), new vdtt_jn(this, 6, 3), new vdtt_jn(this, 6, 4), new vdtt_jn(this, 6, 5), new vdtt_jn(this, 5, 5), new vdtt_jn(this, 4, 5), new vdtt_jn(this, 3, 5), new vdtt_jn(this, 2, 5), new vdtt_jn(this, 1, 5), new vdtt_jn(this, 0, 5), new vdtt_jn(this, 0, 4), new vdtt_jn(this, 0, 3), new vdtt_jn(this, 0, 2), new vdtt_jn(this, 0, 1)};
   private Item[] aq = new Item[22];
   private int ar;
   private int as;
   private int at = 0;
   private int au = 0;
   private int av = 10;
   private boolean aw = false;
   private boolean ax;
   private boolean ay;
   private vdtt_bs[] az = new vdtt_bs[4];
   private vdtt_ay aA;
   private vdtt_ay aB;
   private vdtt_ay aC;
   private vdtt_hl aD;
   public int N = -1;
   public int O = -1;
   public int P;
   public int Q;
   public Char R;
   private int[] aE = new int[]{1486, 1487, 1488, 1489, 1490, 1491, 1492, 1493};
   private vdtt_es aF = new vdtt_es(366, 0, 0, -1);
   private vdtt_es aG = new vdtt_es(365, 0, 0, -1);
   public int S;
   public Item[] T;
   public Item U;
   private vdtt_hq aH;
   public vdtt_ay V;
   public int W = 10;
   private vdtt_jn[] aI = new vdtt_jn[]{new vdtt_jn(this, 0, 0), new vdtt_jn(this, 1, 0), new vdtt_jn(this, 2, 0), new vdtt_jn(this, 3, 0), new vdtt_jn(this, 4, 0), new vdtt_jn(this, 5, 0), new vdtt_jn(this, 5, 1), new vdtt_jn(this, 5, 2), new vdtt_jn(this, 5, 3), new vdtt_jn(this, 5, 4), new vdtt_jn(this, 5, 5), new vdtt_jn(this, 4, 5), new vdtt_jn(this, 3, 5), new vdtt_jn(this, 2, 5), new vdtt_jn(this, 1, 5), new vdtt_jn(this, 0, 5), new vdtt_jn(this, 0, 4), new vdtt_jn(this, 0, 3), new vdtt_jn(this, 0, 2), new vdtt_jn(this, 0, 1)};
   private int aJ = -1;
   public boolean X;
   public boolean Y;
   public boolean Z;
   private long aK = 0L;
   private int aL = 160;

   public vdtt_jm(MainScreen var1) {
      super(var1, Caption.Av);
      this.a(350, 230);
      this.J = false;
      this.ar = 11;
      this.as = this.f() + 9;
      this.aB = this.a(4 + (super.width - 8) - 108, this.f() + this.h() - 29, Caption.yZ[4], this, 1002, 15);
      this.aB.setSize(48, 20);
      this.a(this.aB, 0);
      this.Q = -1;
      this.aC = this.a(4 + (super.width - 8) - 57, this.f() + this.h() - 29, Caption.yZ[5], this, 1003, 15);
      this.aC.setSize(48, 20);
      this.a(this.aC, 0);
      this.aA = this.a(4 + (super.width - 8) - 88, this.f() + this.h() - 55, Caption.yZ[2], this, 1001, -8);
      this.a(this.aA, 0);
      this.aD = new vdtt_hl(0);
      this.az[0] = this.a(this.ar + 7 * this.al + 16, this.as + 56, "2 " + Caption.yZ[3], this, this.aD);
      this.az[1] = this.a(this.ar + 7 * this.al + 16, this.as + 74, "10 " + Caption.yZ[3], this, this.aD);
      this.az[2] = this.a(this.ar + 7 * this.al + 16, this.as + 92, "50 " + Caption.yZ[3], this, this.aD);
      this.az[3] = this.a(this.ar + 7 * this.al + 16, this.as + 110, "100 " + Caption.yZ[3], this, this.aD);
      this.a(this.az[0], 0);
      this.a(this.az[1], 0);
      this.a(this.az[2], 0);
      this.a(this.az[3], 0);
      this.az[0].a(false);
      this.az[1].a(false);
      this.az[2].a(false);
      this.az[3].a(false);
      this.aA.a(false);
      this.aB.a(true);
      this.aC.a(true);
      if (GameSrc.gI().bl.a >= 0 || GameSrc.gI().bl.d) {
         this.ax = true;
         this.an = GameSrc.gI().bl.b;
      }

      this.R = Char.gI();
      this.aq[0] = new Item(670);
      this.aq[1] = new Item(678);
      this.aq[2] = new Item(676);
      this.aq[3] = new Item(682);
      this.aq[4] = new Item(671);
      this.aq[5] = new Item(676);
      this.aq[6] = new Item(675);
      this.aq[7] = new Item(673);
      this.aq[8] = new Item(679);
      this.aq[9] = new Item(670);
      this.aq[10] = new Item(677);
      this.aq[11] = new Item(673);
      this.aq[12] = new Item(681);
      this.aq[13] = new Item(679);
      this.aq[14] = new Item(177);
      this.aq[15] = new Item(674);
      this.aq[16] = new Item(679);
      this.aq[17] = new Item(672);
      this.aq[18] = new Item(670);
      this.aq[19] = new Item(676);
      this.aq[20] = new Item(673);
      this.aq[21] = new Item(680);
      this.aH = new vdtt_hq((byte)1, 6, this.f() + 2, 192, 192, 32, 6, 6);
      this.V = this.a(this.width / 2 - 30, this.aH.cy + this.aH.height - 32 - 55, Caption.ss, this, 100, 15);
      this.V.setSize(60, this.V.height);
      this.a(this.V, 1);
      this.M[1] = true;
      this.M[2] = true;
      this.f(0);
   }

   public final void f(int var1) {
      super.f(var1);
      this.Q = -1;
      GameSrc.gI().bg = var1;
      this.S = 0;
      if (var1 == 1) {
         try {
            Message.c((byte)-21).send();
            return;
         } catch (Exception var3) {
         }
      }

   }

   private void C() {
      GameSrc.gI();
      int var1 = GameSrc.P();

      for(int var2 = 0; var2 < this.d.length - 1; ++var2) {
         this.d[var2] = false;
      }

      if (var1 == 1 || var1 == 3) {
         this.d[0] = true;
      }

      if (var1 == 2 || var1 == 3) {
         this.d[1] = true;
      }

   }

   public final void g(int var1) {
      this.aD.b = var1;

      vdtt_bs var2;
      boolean var3;
      for(int var4 = 0; var4 < this.az.length; ++var4) {
         var2 = this.az[var1];
         var3 = false;
         var2.l = var3;
      }

      var2 = this.az[var1];
      var3 = true;
      var2.l = var3;
   }

   public final void a_() {
      super.a_();
      if (GameSrc.gI().idTask == 5 && GameSrc.gI().idStep == 5) {
         this.y();
      }

      if (this.Z) {
         this.X = false;
         this.Y = false;
         this.U = null;
      } else {
         if (this.X && this.Y && Utlis.a() > this.aK) {
            this.Y = false;
            this.D();
         }

         if ((this.X || this.U != null) && this.X && DataCenter.gI().h % 2 == 0) {
            Vector var1 = new Vector();

            for(int var2 = 0; var2 < this.T.length; ++var2) {
               var1.add(this.T[var2]);
            }

            Item var6 = (Item)var1.lastElement();
            var1.remove(var6);
            var1.insertElementAt(var6, 0);
            Item[] var3 = new Item[this.T.length];

            for(int var4 = 0; var4 < this.T.length; ++var4) {
               var3[var4] = (Item)var1.get(var4);
            }

            this.T = var3;
            this.U = this.T[Utlis.a(this.T.length)];
         }
      }

      this.C();

      vdtt_bs var5;
      boolean var7;
      for(int var8 = 0; var8 < this.az.length; ++var8) {
         var5 = this.az[var8];
         var7 = false;
         var5.l = var7;
      }

      var5 = this.az[this.aD.b];
      var7 = true;
      var5.l = var7;
      if (this.aw) {
         vdtt_aa.gI().A();
         this.P = 0;
         if (this.N == -2) {
            this.N = this.O = -1;
         }

         if (this.ay && this.an == this.av) {
            this.ax = true;
            this.aw = false;
            vdtt_aa.gI().B();
         }

         ++this.at;
         if (this.at > this.am) {
            this.at = 0;
            ++this.au;
            if (this.au >= (this.am < 2 ? Utlis.a(30, 45) : (this.am < 4 ? 5 : (this.am < 5 ? 3 : 2)))) {
               this.au = 0;
               ++this.am;
               if (this.am >= 6) {
                  this.am = 7;
                  this.ay = true;
               }
            }

            ++this.an;
            if (this.an >= this.ap.length) {
               this.an = 0;
            }

            --this.ao;
            if (this.ao < 0) {
               this.ao = 0;
            }
         }
      } else {
         if (this.P < 3) {
            ++this.P;
         } else if (GameSrc.gI().bl != null && GameSrc.gI().bl.a >= 0) {
            this.N = GameSrc.gI().bl.a;
            this.O = GameSrc.gI().bl.c;
         } else if (this.N >= 0) {
            this.N = this.O = -2;
         }

         String var9;
         if (GameSrc.gI().bl.d) {
            var9 = Caption.df;
            this.aA.l = var9;
            this.aA.a(false);
            this.aB.a(true);
            this.aC.a(true);
            this.az[0].a(true);
            this.az[1].a(true);
            this.az[2].a(true);
            this.az[3].a(true);
         } else if (GameSrc.gI().bl.a >= 6) {
            var9 = Caption.dg;
            this.aA.l = var9;
            this.aA.a(true);
            this.aB.a(false);
            this.aC.a(false);
            this.az[0].a(true);
            this.az[1].a(true);
            this.az[2].a(true);
            this.az[3].a(true);
         } else if (GameSrc.gI().bl.a < 0) {
            var9 = Caption.dh;
            this.aA.l = var9;
            this.aA.a(false);
            this.aB.a(true);
            this.aC.a(true);
            this.az[0].a(false);
            this.az[1].a(false);
            this.az[2].a(false);
            this.az[3].a(false);
         } else {
            var9 = Caption.di;
            this.aA.l = var9;
            this.aA.a(false);
            this.aB.a(false);
            this.aC.a(false);
            this.az[0].a(true);
            this.az[1].a(true);
            this.az[2].a(true);
            this.az[3].a(true);
         }
      }

   }

   private void D() {
      try {
         this.aJ = -1;
         Message.c((byte)-35).send();
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   private void a(boolean var1) {
      this.aA.a(true);
      this.aB.a(true);
      this.aC.a(true);
      this.az[0].a(true);
      this.az[1].a(true);
      this.az[2].a(true);
      this.az[3].a(true);
   }

   public final void h(int var1) {
      GameSrc.gI();
      this.aw = true;
      this.ax = this.ay = false;
      this.av = var1;
      this.am = this.au = this.at = 0;
      this.ao = 4;
      this.a(true);
   }

   public final Vector g() {
      Vector var1 = super.g();
      int var2;
      vdtt_jn var3;
      if (super.a.b == 0) {
         for(var2 = 0; var2 < this.ap.length; ++var2) {
            var3 = this.ap[var2];
            var1.add(new vdtt_hi(3000 + var2, this.ar + var3.a * this.al, this.as + var3.b * this.al, this.ar + var3.a * this.al + this.al, this.as + var3.b * this.al + this.al, (vdtt_hp)null, this));
         }
      } else if (super.a.b == 1) {
         for(var2 = 0; var2 < this.aI.length; ++var2) {
            var3 = this.aI[var2];
            var1.add(new vdtt_hi(4000 + var2, this.ar + var3.a * this.al, this.as + var3.b * this.al, this.ar + var3.a * this.al + this.al - 3, this.as + var3.b * this.al + this.al - 3, (vdtt_hp)null, this));
         }

         var2 = this.width / 2 - 14;
         int var4 = this.height / 2 - 18;
         var1.add(new vdtt_hi(1000, var2, var4, var2 + 28, var4 + 28, (vdtt_hp)null, this));
      }

      return var1;
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.Av[0], (byte)2, this.J);
      switch(super.a.b) {
      case 0:
         Graphics var2 = var1;
         vdtt_jm var3 = this;
         this.ar = 11;
         this.as = this.f() + 9;
         vdtt_y.a(var1, 61, 0, 53, 61, 130, (int)130);
         int var4 = 0;

         vdtt_jn var5;
         for(; var4 < var3.ap.length; ++var4) {
            var5 = var3.ap[var4];
            if (var3.an == var4) {
               if (DataCenter.gI().h % 2 == 0) {
                  var3.aF.n();
                  var3.aF.H = -71;
               }

               var3.aG.n();
               var3.aq[var4].u = var3.aF;
            } else {
               var3.aq[var4].u = null;
            }

            b(var2, var3.ar + var5.a * var3.al, var3.as + var5.b * var3.al, var3.aq[var4], false);
            if (var3.an == var4) {
               var2.c((float)var3.aF.H);
               var3.aG.b(var2, var3.ar + var5.a * var3.al - 1 + 16, var3.as + var5.b * var3.al - 1 + 16);
               var2.r();
            }
         }

         if (var3.Q >= 0) {
            var5 = var3.ap[var3.Q];
            vdtt_cz.a(var2, 40, 0, var3.ar + var5.a * var3.al - 1, var3.as + var5.b * var3.al - 1, 0);
         }

         if (!var3.aw && GameSrc.gI().bl != null && GameSrc.gI().bl.d) {
            if (DataCenter.gI().h % 10 > 5) {
               vdtt_dd.b(vdtt_dd.d, var2, Caption.dj, var3.ar + 110, var3.as + 38, 2, -1, -16777216);
            } else {
               vdtt_dd.b(vdtt_dd.d, var2, Caption.dj, var3.ar + 110, var3.as + 38, 2, -2560, -16777216);
            }
         } else if (var3.N >= 0) {
            String var7 = "";
            if (var3.N < 2 && var3.O != 3) {
               var7 = Caption.dk;
            }

            if (var3.O == 0) {
               var7 = var7 + " " + Utlis.c(DataCenter.gI().W[var3.O][var3.N]) + Caption.dl + Utlis.c(DataCenter.gI().W[4][var3.N]) + Caption.dm;
            } else if (var3.O == 1) {
               var7 = var7 + " " + Utlis.c(DataCenter.gI().W[var3.O][var3.N]) + Caption.dn + Utlis.c(DataCenter.gI().W[4][var3.N]) + Caption.dm;
            } else if (var3.O == 2) {
               var7 = var7 + " " + Utlis.c(DataCenter.gI().W[var3.O][var3.N]) + Caption.do_ + Utlis.c(DataCenter.gI().W[4][var3.N]) + Caption.dm;
            } else if (var3.O == 3) {
               var7 = var7 + " " + Utlis.c(DataCenter.gI().W[var3.O][var3.N]) + Caption.dp + Utlis.c(DataCenter.gI().W[4][var3.N]) + Caption.dm;
            }

            vdtt_dd.b(vdtt_dd.d, var2, var7, var3.ar + 110, var3.as + 40, 2, -1, -16777216);
            var3.a(var2, var3.ar + 35, var3.as + 45 + var3.N * 16, 151, 17, 0, 22, 23, 1, 1);
         } else if (var3.N == -2) {
            vdtt_dd.b(vdtt_dd.d, var2, Caption.dr, var3.ar + 110, var3.as + 38, 2, -1, -16777216);
         }

         for(var4 = 1; var4 <= 7; ++var4) {
            for(int var8 = 0; var8 < var4; ++var8) {
               short var6 = 420;
               switch(var4) {
               case 2:
                  var6 = 422;
                  break;
               case 3:
                  var6 = 424;
                  break;
               case 4:
                  var6 = 426;
                  break;
               case 5:
                  var6 = 428;
                  break;
               case 6:
                  var6 = 430;
                  break;
               case 7:
                  var6 = 435;
               }

               vdtt_y.a(var2, var6, 0, var3.ar + 119 + var8 * 15 - var4 * 15 / 2, var3.as + 37 + var4 * 16, 85, (byte)3);
            }
         }

         vdtt_dd.b(vdtt_dd.d, var2, Caption.yZ[8], var3.ar + var3.al + 3, var3.as + var3.al + 5, 0, -1, -16777216);
         vdtt_dd.b(vdtt_dd.d, var2, Caption.yZ[0], var3.ar + 7 * var3.al + 13, var3.as + 5, 0, -1, -16777216);
         var3.a(var2, var3.ar + 7 * var3.al + 13 + 2, var3.as + 35 - 21, 88, 21, -11, 22, 23, 1, 1);
         vdtt_y.a(var2, 228, 0, var3.ar + 7 * var3.al + 18, var3.as + 17, 80);
         vdtt_dd.b(vdtt_dd.d, var2, Utlis.c(Char.gI().f(176)), var3.ar + 7 * var3.al + 43, var3.as + 24, 0, -1, -16777216);
         vdtt_dd.b(vdtt_dd.d, var2, Caption.yZ[1], var3.ar + 7 * var3.al + 13, var3.as + 44, 0, -1, -16777216);
         return;
      case 1:
         this.f(var1);
      default:
      }
   }

   private void f(Graphics var1) {
      try {
         this.ar = this.width / 2 - 96;
         vdtt_y.a(var1, 61, 0, 36, 61, 130, (int)130);

         int var2;
         for(var2 = 0; var2 < this.aI.length; ++var2) {
            vdtt_jn var3 = this.aI[var2];
            b(var1, this.ar + var3.a * this.al, this.as + var3.b * this.al, this.T[var2], var2 == this.aJ);
         }

         if (this.X || this.U != null) {
            int var4;
            int var5;
            Item var6;
            boolean var7;
            Graphics var9;
            label41: {
               if (this.X) {
                  var9 = var1;
                  var4 = this.width / 2 - 14;
                  var5 = this.height / 2 - 18;
                  var6 = this.U;
               } else {
                  var9 = var1;
                  var4 = this.width / 2 - 14;
                  var5 = this.height / 2 - 18;
                  var6 = this.U;
                  if (this.aJ == -2) {
                     var7 = true;
                     break label41;
                  }
               }

               var7 = false;
            }

            b(var9, var4, var5, var6, var7);
            if (DataCenter.gI().h % 10 > 5 && !this.X) {
               var1.c(-2560);
               vdtt_cz.a(var1, 40, 0, this.width / 2 - 15, this.height / 2 - 19, 0);
               var1.f();
            }
         }

         if ((var2 = Char.gI().f(this.aL)) < 50) {
            vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, "- " + Caption.aO + " " + Utlis.c(var2) + " " + DataCenter.gI().itemTemplate[this.aL].name, this.ar + this.aH.cx + 35, this.aH.cy + 133, 0, -65536, -10275328);
         } else {
            vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, "- " + Caption.aO + " " + Utlis.c(var2) + " " + DataCenter.gI().itemTemplate[this.aL].name, this.ar + this.aH.cx + 35, this.aH.cy + 133, 0, -6488, -10275328);
         }

         vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, "- " + Utlis.b(Caption.st, DataCenter.gI().itemTemplate[this.aL].name), this.ar + this.aH.cx + 35, this.aH.cy + 144, 0, -6488, -10275328);
         vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, Utlis.a(Caption.vV, (long)this.W), this.ar + this.aH.cx + 35, this.aH.cy + 155, 0, -16711681, -10275328);
      } catch (Exception var8) {
      }

   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      if (!this.aw && !this.X) {
         super.a(var1, var2, var3);
         this.Q = -1;
         if (super.a.b == 0 && var1.b >= 3000 && var1.b < 4000) {
            this.Q = var1.b - 3000;
            if (this.Q >= 0) {
               Item var10 = this.aq[this.Q];
               this.k = EntityPanel.a(this, var1.e, var1.d, 32, (Item)var10);
               vdtt_aa.gI().n();
            }
         } else if (var1.b >= 4000 && var1.b < 5000) {
            this.aJ = var1.b - 4000;
            if (!this.X && this.aJ >= 0) {
               this.k = b(this, var1, this.T[this.aJ]);
               vdtt_aa.gI().n();
            }
         } else {
            switch(super.a.b) {
            case 0:
               Message var4;
               switch(var1.b) {
               case 1001:
                  vdtt_jm var5 = this;

                  try {
                     if (GameSrc.gI().bl.d) {
                        (new Message((byte)74)).send();
                        return;
                     }

                     (var4 = new Message((byte)72)).writeByte(var5.aD.b);
                     var4.send();
                     break;
                  } catch (Exception var8) {
                     Utlis.a(var8);
                     return;
                  }
               case 1002:
                  try {
                     (var4 = new Message((byte)74)).writeByte(0);
                     var4.send();
                     break;
                  } catch (Exception var7) {
                     Utlis.a(var7);
                     return;
                  }
               case 1003:
                  try {
                     (var4 = new Message((byte)74)).writeByte(1);
                     var4.send();
                     return;
                  } catch (Exception var9) {
                     Utlis.a(var9);
                  }
               }

               return;
            case 1:
               switch(var1.b) {
               case 100:
                  if (this.W == 0 || GameSrc.gI().idTask < 15) {
                     this.D();
                     return;
                  }

                  this.aJ = -1;
                  var2 = Utlis.a(this.T.length);
                  if (Char.gI().D() > 0 && Char.gI().f(this.aL) >= 40) {
                     this.X = true;
                     this.Y = true;
                     this.Z = false;
                     this.aK = Utlis.a() + (long)Utlis.a(4000, 8000);
                     this.V.a(true);
                     return;
                  }

                  this.D();
                  break;
               case 1000:
                  if (!this.X && this.U != null) {
                     this.k = c(this, var1, this.U);
                     vdtt_aa.gI().n();
                     return;
                  }
                  break;
               case 1206:
                  if (!this.X) {
                     this.k();
                  }
               }
            }
         }
      }

   }

   public final void d() {
      super.d();
      this.aw = false;
      vdtt_aa.gI().B();
   }
}
