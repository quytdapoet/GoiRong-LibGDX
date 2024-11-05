package gro;

import java.util.Hashtable;
import java.util.Vector;

public final class PhucLoiScreen extends vdtt_ao {
   private final vdtt_ay X;
   private final vdtt_ay Y;
   private vdtt_hq[][] Z;
   private vdtt_hp[][][] aa;
   public vdtt_ay[][][] N;
   private vdtt_in[] ab;
   public DataPhucLoi[][][] O;
   private int ac = 50;
   private int ad = 76;
   private int ae;
   private int af;
   private int ag;
   private int ah;
   private int ai;
   private int aj;
   private int ak;
   private boolean[] al = new boolean[4];
   private int am;
   private int an;
   private int ao;
   private int ap;
   private int aq;
   public int P;
   private int ar;
   public int Q;
   private int as;
   private vdtt_ay[] at = new vdtt_ay[4];
   private long au;
   private long av;
   private long aw;
   private long ax;
   private long ay;
   private boolean az;
   private boolean aA;
   private final XYEntity[] aB;
   public int R = 0;
   public int S = 50;
   public int T = -1;
   public int U = 0;
   public int V = 0;
   public int W = 0;
   private int aC;
   private final Item[][] aD;
   private int aE = -1;

   public PhucLoiScreen(MainScreen var1, Message var2) {
      super(var1);
      vdtt_hm var3;
      (var3 = new vdtt_hm(5000)).c = new String[]{Caption.mL, Caption.nZ, Caption.oc, Caption.xF};
      this.Z = new vdtt_hq[var3.c.length][];
      this.aa = new vdtt_hp[var3.c.length][][];
      this.N = new vdtt_ay[var3.c.length][][];
      this.ab = new vdtt_in[var3.c.length];
      this.O = new DataPhucLoi[var3.c.length][][];
      this.a(310);
      this.a(var3, 170, 70, 5);
      String[][] var4 = new String[][]{Caption.An, Caption.Ar, Caption.At, Caption.Au};

      int var5;
      for(var5 = 0; var5 < this.N.length; ++var5) {
         (var3 = new vdtt_hm(1001)).c = var4[var5];
         this.ab[var5] = new vdtt_in(var3, this);
         (new vdtt_hm(1001)).c = var4[var5];
         this.Z[var5] = new vdtt_hq[this.ab[var5].j()];
         this.aa[var5] = new vdtt_hp[this.ab[var5].j()][];
         this.N[var5] = new vdtt_ay[this.ab[var5].j()][];
         this.O[var5] = new DataPhucLoi[this.ab[var5].j()][];
      }

      this.b(var2);

      int var6;
      int var7;
      int var8;
      for(var5 = 0; var5 < this.O.length; ++var5) {
         for(var6 = 0; var6 < this.O[var5].length; ++var6) {
            var8 = var6;
            var7 = var5;
            PhucLoiScreen var9 = this;
            this.ag = -1;
            this.N[var5][var6] = new vdtt_ay[this.O[var5][var6].length];
            this.aa[var5][var6] = new vdtt_hp[this.O[var5][var6].length];
            this.Z[var5][var6] = new vdtt_hq((byte)1, 14, this.f() + 34, this.ac * 5, this.ad * 2, this.ad, Utlis.c(this.O[var5][var6].length, 5), 5);
            this.ae = 0;
            this.af = 0;
            int var10 = 0;

            for(int var11 = 0; var11 < var9.Z[var7][var8].i; ++var11) {
               var9.af = var11 * var9.ad;

               for(int var12 = 0; var12 < var9.Z[var7][var8].O; ++var12) {
                  var9.ae = var12 * var9.ac;
                  var9.N[var7][var8][var10] = new vdtt_ay(var9.ae + 6, var9.af + var9.ad - 28, 0, 0, Caption.mM, var9, 1100, 7);
                  var9.N[var7][var8][var10].setSize(35, 20);
                  var9.aa[var7][var8][var10] = new vdtt_hu((byte)1, 0, 0, var9.N[var7][var8][var11].width, var9.N[var7][var8][var11].height, var9.N[var7][var8][var11].height, 1, var9.Z[var7][var8]);
                  vdtt_hp var13 = var9.aa[var7][var8][var10];
                  byte var14 = 1;
                  var13.H = var14;
                  ++var10;
                  if (var10 >= var9.N[var7][var8].length) {
                     break;
                  }
               }

               if (var10 >= var9.N[var7][var8].length) {
                  break;
               }
            }
         }
      }

      this.aa[3] = new vdtt_hp[1][3];

      for(var6 = 0; var6 < this.aa[3].length; ++var6) {
         for(var8 = 0; var8 < this.aa[3][var6].length; ++var8) {
            this.aa[3][var6][var8] = new vdtt_hp((byte)1, 87 + var8 * 34, 195, 30, 30, 1, 1);
         }
      }

      this.aD = new Item[1][4];
      this.aD[0][0] = new Item(164);
      this.aD[0][0].isLock = true;
      this.aD[0][1] = new Item(428);
      this.aD[0][1].isLock = true;
      this.aD[0][2] = new Item(159);
      this.aD[0][2].isLock = true;
      this.aD[0][3] = new Item(163);
      this.aD[0][3].isLock = true;
      this.aD[0][3].c(300000);

      for(var6 = 0; var6 < this.at.length; ++var6) {
         this.at[var6] = this.a(this.width - 74, this.height - 35, Caption.od, this, 1200 + var6, 7);
         this.at[var6].setSize(60, 22);
         this.a(this.at[var6], 2);
         this.ab[2].a(this.at[var6], var6);
      }

      this.aB = new XYEntity[8];
      var6 = 360 / this.aB.length;
      var8 = 0;

      for(var7 = 360; var7 > 0; var7 -= var6) {
         if (var8 < this.aB.length - 1) {
            this.aB[var8] = XYEntity.create(var7 - var6 + 1, var7);
         } else {
            this.aB[var8] = XYEntity.create(var7 - var6, var7);
         }

         ++var8;
      }

      this.X = this.a(this.ab[super.a.b].cx + this.ab[super.a.b].width / 2 - 26, this.ab[super.a.b].cy + (this.height - this.ab[super.a.b].cy) / 2 - 35 + 8, "", this, 1205, 738);
      this.a(this.X, 1);
      this.ab[1].a(this.X, 1);
      this.Y = new vdtt_ay(21, this.h() - 12, 0, 0, Caption.cq, this, 1027, -17);
      this.Y.setSize(60, this.Y.height);
      this.ab[1].a(this.Y, 1);
      this.M[3] = true;
      this.f(0);
   }

   public final void b(Message var1) {
      try {
         Hashtable var2 = new Hashtable();
         this.ah = var1.readInt();
         this.ai = var1.readByte();
         this.aj = var1.readInt();
         this.ak = var1.readInt();
         this.ay = var1.readLong();
         this.am = var1.readShort();
         this.an = var1.readShort();
         this.ao = var1.readShort();
         this.aq = var1.readByte();

         for(int var3 = 0; var3 < this.al.length; ++var3) {
            this.al[var3] = var1.readBoolean();
         }

         this.aw = var1.readLong();
         this.ax = var1.readLong();
         this.ab[0].e[3] = true;
         this.ab[0].e[4] = true;
         long var11 = Utlis.a();
         if ((this.aw > var11 || var11 >= this.ax) && (this.aw != -1L || this.ax != -1L)) {
            this.ab[1].e[3] = true;
         }

         if ((this.au > var11 || var11 >= this.av) && (this.au != -1L || this.av != -1L)) {
            this.ab[1].e[2] = true;
         }

         this.as = var1.readInt();
         this.ar = this.P = var1.readShort();
         short var5 = var1.readShort();

         int var6;
         Vector var7;
         for(var6 = 0; var6 < var5; ++var6) {
            DataPhucLoi var8;
            (var8 = new DataPhucLoi()).id = var1.readShort();
            var8.name = var1.readUTF();
            var8.type = var1.readShort();
            var8.item = new Item();
            var8.item.a(var1);
            var8.status = var1.readByte();
            if ((var7 = (Vector)var2.get(var8.type)) == null) {
               var7 = new Vector();
            }

            var7.add(var8);
            var2.put(var8.type, var7);
         }

         for(var6 = 0; var6 < this.O.length; ++var6) {
            for(int var12 = 0; var12 < this.O[var6].length; ++var12) {
               var7 = null;
               switch(var6) {
               case 0:
                  if (var12 == 0) {
                     var7 = (Vector)var2.get(0);
                  } else if (var12 == 1) {
                     var7 = (Vector)var2.get(1);
                  } else if (var12 == 2) {
                     var7 = (Vector)var2.get(2);
                  }
                  break;
               case 1:
                  if (var12 == 0) {
                     var7 = (Vector)var2.get(5);
                  } else if (var12 == 3) {
                     var7 = (Vector)var2.get(21);
                  } else if (var12 == 2) {
                     var7 = (Vector)var2.get(19);
                  }
                  break;
               case 2:
                  if (var12 == 0) {
                     var7 = (Vector)var2.get(15);
                  } else if (var12 == 1) {
                     var7 = (Vector)var2.get(16);
                  } else if (var12 == 2) {
                     var7 = (Vector)var2.get(17);
                  } else if (var12 == 3) {
                     var7 = (Vector)var2.get(3);
                  }
               }

               if (var7 == null) {
                  var7 = new Vector();
               }

               this.O[var6][var12] = new DataPhucLoi[var7.size()];

               for(int var9 = 0; var9 < this.O[var6][var12].length; ++var9) {
                  this.O[var6][var12][var9] = (DataPhucLoi)var7.get(var9);
               }
            }
         }

         for(var6 = 0; var6 < this.ab.length; ++var6) {
            this.ab[var6].a();
         }
      } catch (Exception var10) {
      }

      this.z();
   }

   public final void z() {
      boolean var1 = false;

      for(int var2 = 0; var2 < this.O.length; ++var2) {
         this.d[var2] = false;

         for(int var3 = 0; var3 < this.O[var2].length; ++var3) {
            this.ab[var2].d[var3] = false;
            if (var2 == 1 && var3 == 1 && this.P > 0) {
               this.ab[var2].d[var3] = true;
               this.d[var2] = true;
               var1 = true;
            }

            for(int var4 = 0; var4 < this.O[var2][var3].length; ++var4) {
               if (this.O[var2][var3][var4].a()) {
                  this.ab[var2].d[var3] = true;
                  this.d[var2] = true;
                  var1 = true;
                  break;
               }
            }

            this.ab[var2].b();
         }
      }

      GameSrc.gI().aZ = var1;
   }

   public final void b(Graphics var1) {
      super.b(var1);
      if (super.a.b != 3) {
         this.ab[super.a.b].a(var1);
      }

      this.ab[super.a.b].a(var1, this.cx, this.cy);
      label60:
      switch(super.a.b) {
      case 0:
         switch(this.ab[super.a.b].h()) {
         case 0:
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.mX + this.ah / '\uea60' + " " + Caption.lk, 14, this.height - 14, 0, -1, 0);
            break label60;
         case 1:
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.mY + this.ai + " " + Caption.yS[2], 14, this.height - 22, 0, -1, 0);
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.mZ, 14, this.height - 14, 0, -1, 0);
            break label60;
         case 2:
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.na + this.aq, 14, this.height - 22, 0, -1, 0);
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.nq, 14, this.height - 14, 0, -1, 0);
         default:
            break label60;
         }
      case 1:
         switch(this.ab[super.a.b].h()) {
         case 0:
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.nc + Utlis.c(this.ak) + " " + Caption.mW, 14, this.height - 14, 0, -1, 0);
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.nb + Utlis.c(this.aj) + " " + Caption.mW, 14, this.height - 22, 0, -1, 0);
            break label60;
         case 1:
            boolean var4 = true;
            var1.k = var4;
            vdtt_cz.a(var1, 739, this.R, this.ab[super.a.b].cx + this.ab[super.a.b].width / 2, this.ab[super.a.b].cy + (this.height - this.ab[super.a.b].cy) / 2, 3);
            var4 = false;
            var1.k = var4;
            vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, Caption.on + this.P, this.ab[super.a.b].cx + 10, this.height - 24, 0, -7812062, 0);
            vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, Caption.dq, this.ab[super.a.b].cx + 10, this.height - 12, 0, -1, 0);
            return;
         case 2:
            int[] var3 = new int[]{10, 20, 50, 100, 200, 500, 1000};
            if (this.az) {
               vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.nc + Utlis.c(this.ak) + " " + Caption.mW + Caption.ut + this.ap + "'", 14, this.height - 14, 0, -1, 0);
            } else if (this.ap >= 7) {
               vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.ny, 14, this.height - 14, 0, -1, 0);
            } else {
               vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.nc + Utlis.c(this.ak) + " " + Caption.mW + Utlis.b(Caption.us, Utlis.k(var3[this.ap])) + (this.ap + 1) + "'", 14, this.height - 14, 0, -1, 0);
            }

            if (this.av >= 0L) {
               vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.iW + ": " + Utlis.d(this.au) + " - " + Utlis.d(this.av), 14, this.height - 22, 0, -2560, 0);
            }
            break label60;
         case 3:
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.qq, 14, this.height - 29, 0, -1, 0);
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.vN, 14, this.height - 21, 0, -1, 0);
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.wA, 14, this.height - 13, 0, -1, 0);
            if (this.ax >= 0L) {
               vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.iW + ": " + Utlis.d(this.aw) + " - " + Utlis.d(this.ax), 14, this.height - 37, 0, -2560, 0);
            }
         default:
            break label60;
         }
      case 2:
         vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.oE, 14, this.height - 22, 0, -1, 0);
         switch(this.ab[super.a.b].h()) {
         case 0:
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Utlis.a(Caption.uu, this.ay / 60000L), 14, this.height - 14, 0, -1, 0);
            break label60;
         case 1:
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Utlis.b(Caption.uv, Utlis.c(this.am)), 14, this.height - 14, 0, -1, 0);
            break label60;
         case 2:
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Utlis.b(Caption.uw, Utlis.c(this.an)), 14, this.height - 14, 0, -1, 0);
            break label60;
         case 3:
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Utlis.b(Caption.ux, Utlis.c(this.ao)), 14, this.height - 14, 0, -1, 0);
         default:
            break label60;
         }
      case 3:
         for(int var2 = 0; var2 < this.aa[super.a.b][this.ab[super.a.b].h()].length; ++var2) {
            b(var1, this.aa[super.a.b][this.ab[super.a.b].h()][var2].cx, this.aa[super.a.b][this.ab[super.a.b].h()][var2].cy, this.aD[this.ab[super.a.b].h()][var2], this.aE == var2);
         }
      }

      this.a(var1, this.Z[super.a.b][this.ab[super.a.b].h()]);
      this.f(var1);
      this.a(var1);
   }

   private void f(Graphics var1) {
      this.ae = 0;
      this.af = 0;
      int var2 = 0;

      for(int var3 = 0; var3 < this.Z[super.a.b][this.ab[super.a.b].h()].i; ++var3) {
         this.af = var3 * this.ad;

         for(int var4 = 0; var4 < this.Z[super.a.b][this.ab[super.a.b].h()].O; ++var4) {
            this.ae = var4 * this.ac;
            if (this.Z[super.a.b][this.ab[super.a.b].h()].b(var3)) {
               DataPhucLoi var5 = this.O[super.a.b][this.ab[super.a.b].h()][var2];
               this.a(var1, this.ae, this.af, this.ac - 3, this.ad - 3, -11, 22, 23, 1, 1);
               vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, var5.name, this.ae + this.ac / 2, this.af + 9, 2, -1, -10275328);
               b(var1, this.ae + 9, this.af + 16, var5.item, this.ag == var2);
               int var6 = var1.e;
               int var7 = var1.f;
               this.a(var1, var6 + this.N[super.a.b][this.ab[super.a.b].h()][var2].cx, var7 + this.N[super.a.b][this.ab[super.a.b].h()][var2].cy);
               this.N[super.a.b][this.ab[super.a.b].h()][var2].a(!var5.a());
               vdtt_ay var8;
               String var9;
               if (var5.status == 2) {
                  this.N[super.a.b][this.ab[super.a.b].h()][var2].H = 9;
                  var8 = this.N[super.a.b][this.ab[super.a.b].h()][var2];
                  var9 = "";
                  var8.l = var9;
               } else if (var5.status == 1) {
                  var8 = this.N[super.a.b][this.ab[super.a.b].h()][var2];
                  var9 = Caption.cm;
                  var8.l = var9;
               } else if (var5.status == 0) {
                  var8 = this.N[super.a.b][this.ab[super.a.b].h()][var2];
                  var9 = Caption.ur;
                  var8.l = var9;
               }

               this.N[super.a.b][this.ab[super.a.b].h()][var2].b(var1);
               this.a(var1, var6, var7);
            }

            ++var2;
            if (var2 >= this.N[super.a.b][this.ab[super.a.b].h()].length) {
               break;
            }
         }

         if (var2 >= this.N[super.a.b][this.ab[super.a.b].h()].length) {
            break;
         }
      }

   }

   private void A() {
      this.ab[super.a.b].a(this.ab[super.a.b].g());
      this.Y.b(super.a.b != 1 || this.ab[super.a.b].h() != 1);
   }

   public final void f(int var1) {
      super.f(var1);
      this.A();
      this.Y.b(super.a.b != 1 || this.ab[super.a.b].h() != 1);
   }

   public final void a_() {
      this.ab[super.a.b].e();
      this.Z[super.a.b][this.ab[super.a.b].h()].a();

      int var1;
      for(var1 = 0; var1 < this.N[super.a.b][this.ab[super.a.b].h()].length; ++var1) {
         this.N[super.a.b][this.ab[super.a.b].h()][var1].a_();
         this.aa[super.a.b][this.ab[super.a.b].h()][var1].a();
         if (this.aa[super.a.b][this.ab[super.a.b].h()][var1].l != -1) {
            this.N[super.a.b][this.ab[super.a.b].h()][var1].M = true;
         } else {
            this.N[super.a.b][this.ab[super.a.b].h()][var1].M = false;
         }
      }

      for(var1 = 0; var1 < this.al.length; ++var1) {
         if (this.al[var1]) {
            this.at[var1].l = Caption.oI;
            this.at[var1].a(true);
            this.at[var1].H = 9;
         }
      }

      if (this.aA) {
         vdtt_aa.gI().A();
         ++this.U;
         this.R += this.S;
         if (this.R >= 360) {
            this.R = 0;
         }

         if ((this.U % 5 == 0 || this.aC > 30) && this.T >= 0) {
            this.S -= 5;
            if (this.S < 5) {
               this.S = 5;
               ++this.aC;
               XYEntity var2 = this.aB[this.T];
               if (this.R - this.V >= var2.cx && this.R <= var2.cy) {
                  this.aA = false;
                  if (this.Q > 0) {
                     Item var3 = null;
                     switch(this.T) {
                     case 0:
                        var3 = new Item(23, true, 30);
                        break;
                     case 1:
                        var3 = new Item(176, true, 60);
                        break;
                     case 2:
                        var3 = new Item(191, true, 900000);
                        break;
                     case 3:
                        var3 = new Item(163, true, 4000000);
                        break;
                     case 4:
                        var3 = new Item(160, true, 600);
                        break;
                     case 5:
                        var3 = new Item(160, true, 725);
                        break;
                     case 6:
                        var3 = new Item(160, true, 850);
                        break;
                     case 7:
                        var3 = new Item(160, true, 1000);
                     }

                     String var4 = Caption.q + " " + Utlis.c(var3.M()) + " " + var3.getItemTemplate().name;
                     DataCenter.gI().currentScreen.c(var4, -2560);
                     this.Q = 0;
                  }
               }
            }
         }
      } else {
         vdtt_aa.gI().B();
      }

      if (GameSrc.gI().idTask == 5 && GameSrc.gI().idStep == 6) {
         this.y();
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final Vector g() {
      Vector var1 = super.g();
      int var2;
      if (super.a.b == 3) {
         for(var2 = 0; var2 < this.aa[super.a.b][this.ab[super.a.b].h()].length; ++var2) {
            var1.addElement(this.aa[super.a.b][this.ab[super.a.b].h()][var2].a(1004, this, var2));
         }
      } else {
         if (super.a.b != 1 || this.ab[super.a.b].h() != 1) {
            for(var2 = 0; var2 < this.O[super.a.b][this.ab[super.a.b].h()].length; ++var2) {
               int var3 = this.Z[super.a.b][this.ab[super.a.b].h()].cx + this.N[super.a.b][this.ab[super.a.b].h()][var2].cx;
               int var4 = this.Z[super.a.b][this.ab[super.a.b].h()].cy + this.N[super.a.b][this.ab[super.a.b].h()][var2].cy - this.Z[super.a.b][this.ab[super.a.b].h()].f;
               if (Utlis.a(this.Z[super.a.b][this.ab[super.a.b].h()].cx, this.Z[super.a.b][this.ab[super.a.b].h()].cy, this.Z[super.a.b][this.ab[super.a.b].h()].cx + this.Z[super.a.b][this.ab[super.a.b].h()].width, this.Z[super.a.b][this.ab[super.a.b].h()].cy + this.Z[super.a.b][this.ab[super.a.b].h()].height, var3, var4) && Utlis.a(this.Z[super.a.b][this.ab[super.a.b].h()].cx, this.Z[super.a.b][this.ab[super.a.b].h()].cy, this.Z[super.a.b][this.ab[super.a.b].h()].cx + this.Z[super.a.b][this.ab[super.a.b].h()].width, this.Z[super.a.b][this.ab[super.a.b].h()].cy + this.Z[super.a.b][this.ab[super.a.b].h()].height, var3 + this.N[super.a.b][this.ab[super.a.b].h()][var2].width, var4 + this.N[super.a.b][this.ab[super.a.b].h()][var2].height)) {
                  this.aa[super.a.b][this.ab[super.a.b].h()][var2].cx = (short)var3;
                  this.aa[super.a.b][this.ab[super.a.b].h()][var2].cy = (short)var4;
                  var1.addElement(new vdtt_hi(2000, this.aa[super.a.b][this.ab[super.a.b].h()][var2].cx, this.aa[super.a.b][this.ab[super.a.b].h()][var2].cy, this.aa[super.a.b][this.ab[super.a.b].h()][var2].cx + this.aa[super.a.b][this.ab[super.a.b].h()][var2].width, this.aa[super.a.b][this.ab[super.a.b].h()][var2].cy + this.aa[super.a.b][this.ab[super.a.b].h()][var2].height, this.aa[super.a.b][this.ab[super.a.b].h()][var2], this, this.O[super.a.b][this.ab[super.a.b].h()][var2]));
                  var1.addElement(new vdtt_hi(3000, var3 + 3, var4 - 32, var3 + 3 + 28, var4 - 32 + 28, this.Z[super.a.b][this.ab[super.a.b].h()], this, var2));
               }
            }
         }

         var1.addElement(this.ab[super.a.b].f());
         var1.addElement(new vdtt_hi(1002, this.Z[super.a.b][this.ab[super.a.b].h()].cx, this.Z[super.a.b][this.ab[super.a.b].h()].cy, this.Z[super.a.b][this.ab[super.a.b].h()].cx + this.Z[super.a.b][this.ab[super.a.b].h()].width, this.Z[super.a.b][this.ab[super.a.b].h()].cy + this.Z[super.a.b][this.ab[super.a.b].h()].height, this.Z[super.a.b][this.ab[super.a.b].h()], this));
      }

      return var1;
   }

   public final void b(int var1, Object var2) {
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      this.ag = -1;
      Message var4;
      switch(var1.b) {
      case 1000:
         try {
            Message.c((byte)22).send();
            break;
         } catch (Exception var13) {
            Utlis.a(var13);
            return;
         }
      case 1001:
         if (var1.j.k >= 0) {
            this.ab[super.a.b].a(var1.j.k);
            this.A();
            return;
         }
         break;
      case 1004:
         vdtt_bm var5;
         label79: {
            this.aE = (Integer)var1.k;
            Item var14 = this.aD[this.ab[super.a.b].h()][this.aE];
            if (var14 != null) {
               if (!(var1.j instanceof vdtt_hq)) {
                  var5 = EntityPanel.a(this, var1.e + 2, var1.d, 32, (Item)var14);
                  break label79;
               }

               vdtt_hq var15;
               if ((var15 = (vdtt_hq)var1.j).k >= 0 && var15.k < var15.i * var15.O) {
                  var15.e();
                  int var16 = var15.k % var15.O;
                  int var9 = var15.k / var15.O - (var15.j >= 0 ? var15.j : 0);
                  if (var15.n == 0) {
                     var16 = var15.k % var15.i - (var15.j >= 0 ? var15.j : 0);
                     var9 = var15.k / var15.i;
                  }

                  var16 = var16 * var15.h + var15.h + var15.cx;
                  var9 = var9 * var15.h + var15.cy;
                  var5 = EntityPanel.a(this, var16, var9, var15.h, (Item)var14);
                  break label79;
               }
            }

            var5 = null;
         }

         this.k = var5;
         vdtt_aa.gI().n();
         return;
      case 1027:
         vdtt_aa.gI().n();
         this.k = b(Caption.vn, this, this.Y.cx + 10, this.Y.cy, 160);
         return;
      case 1200:
      case 1201:
      case 1202:
      case 1203:
         int var6 = var1.b - 1200;

         try {
            (var4 = Message.c((byte)-63)).writeByte(var6);
            var4.send();
            break;
         } catch (Exception var12) {
            return;
         }
      case 1204:
         this.k = a(Caption.oJ, this, this.ab[super.a.b].width + 45, this.height - 124, 200);
         return;
      case 1205:
         PhucLoiScreen var7 = this;

         try {
            var7.ar = var7.P;
            if (!var7.aA) {
               if (var7.P > 0) {
                  var7.aA = true;
                  var7.R = var7.aC = 0;
                  var7.S = Utlis.a(35, 50);
                  var7.V = Utlis.a(1, 30);
                  var7.T = -1;
               }

               Message.c((byte)-60).send();
            }
            break;
         } catch (Exception var11) {
            return;
         }
      case 1206:
         this.k();
         return;
      case 1207:
         this.k = a(Caption.oK, this, this.ab[super.a.b].width + 45, this.height - 160, 220);
         break;
      case 2000:
         DataPhucLoi var8 = (DataPhucLoi)var1.k;

         try {
            if (var8.a()) {
               (var4 = Message.c((byte)-70)).writeShort(var8.id);
               var4.send();
            }
         } catch (Exception var10) {
         }

         vdtt_aa.gI().n();
         return;
      case 3000:
         this.ag = (Integer)var1.k;
         this.k = c(this, var1, this.O[super.a.b][this.ab[super.a.b].h()][this.ag].item);
         return;
      }

   }

   public final void d() {
      super.d();
      this.aA = false;
      vdtt_aa.gI().B();
   }
}
