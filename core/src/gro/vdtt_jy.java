package gro;

import java.util.Collections;
import java.util.Vector;

public final class vdtt_jy extends vdtt_jo implements vdtt_s {
   private static vdtt_jy aE;
   public boolean N;
   public int O;
   public int P;
   public int Q;
   public int R;
   public int S;
   public int T;
   public Char U;
   public Skill[] V;
   private Skill[] aF = new Skill[14];
   public vdtt_bb W;
   public int X;
   public int Y = -1;
   public int Z;
   private int aG = 32;
   private int aH = 15;
   public int al;
   private int aI = -1;
   private vdtt_hq[][] aJ;
   public vdtt_hp[][] am;
   public vdtt_gg an;
   private vdtt_in[] aK;
   private vdtt_by[] aL;
   private vdtt_ay aM;
   private vdtt_ay aN;
   private vdtt_ay aO;
   private vdtt_ay aP;
   private vdtt_ir[] aQ;
   public vdtt_ay ao;
   public vdtt_ay ap;
   public vdtt_ay aq;
   private vdtt_ay aR;
   private vdtt_ay aS;
   private vdtt_ay aT;
   private vdtt_ay aU;
   private vdtt_bd aV;
   public vdtt_bd ar;
   public Item as;
   private vdtt_hq aW;
   private boolean aX;
   public String[][] at = new String[5][0];
   private vdtt_ay[] aY = new vdtt_ay[5];
   private vdtt_ay[] aZ = new vdtt_ay[5];
   public vdtt_ay[] au = new vdtt_ay[10];
   public vdtt_hp[] av = new vdtt_hp[10];
   public vdtt_ay[] aw = new vdtt_ay[2];
   public vdtt_hp[] ax = new vdtt_hp[2];
   private int ba = 20;
   private int bb = 14;
   private XYEntity[] bc;
   private XYEntity[] bd;
   private Skill be;
   public boolean ay;
   public int az;
   public int aA;
   public byte aB;
   public vdtt_hf aC;
   public int[] aD = new int[25];

   public vdtt_jy(MainScreen var1, Char var2, Skill[] var3) {
      super(var1, Caption.yt);
      this.a(var1, var2, var3, -1);
   }

   public vdtt_jy(MainScreen var1, Char var2, Skill[] var3, int var4) {
      super(var1, Caption.yt);
      this.a(var1, var2, var3, var4);
   }

   private void a(MainScreen var1, Char var2, Skill[] var3, int var4) {
      try {
         aE = this;
         this.H = var1;
         this.U = var2;
         this.a(var3);
         this.J = false;
         this.a(299);
         vdtt_hm var5;
         (var5 = new vdtt_hm(1001)).c = Caption.yt;
         new Vector();
         this.an = new vdtt_gg(var5, this.width + 80, 1, this.f() - 3, 87, this.h() + 6, 31, this);
         this.an.h = true;
         this.C();
         this.W = this.a(this.an.cx + 62, this.f() + this.h() - 41, Caption.dE, 1234);
         boolean var6 = true;
         this.W.d = var6;
         this.aK = new vdtt_in[1];
         this.aK[0] = new vdtt_in(new vdtt_hm(2000, Caption.zL), this);
         if (DataCenter.k()) {
            this.aK[0].f = true;
         }

         int var7;
         for(var7 = 0; var7 < this.aY.length; ++var7) {
            this.aY[var7] = this.a(this.aJ[0][0].cx - 26, this.aJ[0][0].cy + 8 + var7 * 32, "", this, 1100 + var7, 287);
            vdtt_ay var8 = this.aY[var7];
            short var9 = -360;
            var8.J = var9;
            this.an.a((vdtt_k)this.aY[var7], 0);
            this.aK[0].a(this.aY[var7], 0);
            this.aY[var7].b(!this.F() || DataCenter.m());
         }

         for(var7 = 0; var7 < this.aZ.length; ++var7) {
            this.aZ[var7] = this.a(this.aJ[0][1].cx + 40, this.aJ[0][1].cy + 8 + var7 * 32, "", this, 1100 + var7, 287);
            this.an.a((vdtt_k)this.aZ[var7], 0);
            this.aK[0].a(this.aZ[var7], 0);
            this.aZ[var7].b(!this.F() || DataCenter.m());
         }

         Vector var16 = new Vector();
         this.ao = this.a(super.width - 8 - 102, 122, Caption.dC, this, 3001, 7);
         this.ao.setSize(56, 20);
         var16.addElement(this.ao);
         this.ap = this.a(super.width - 8 - 102, 144, Caption.qt, this, 3002, 7);
         this.ap.setSize(56, 20);
         var16.addElement(this.ap);
         this.aq = this.a(super.width - 8 - 102, 166, Caption.sR, this, 3003, 7);
         this.aq.setSize(56, 20);
         var16.addElement(this.aq);
         if (DataCenter.m()) {
            this.ao.setXY(this.an.cx + 12, this.f() + this.height - 61);
            this.ap.setXY(this.ao.cx + this.ao.width + 5, this.ao.cy);
            this.aq.setXY(this.ao.cx + 2 + (this.ao.width + 5) * 2, this.ao.cy);
         }

         vdtt_hm var17 = new vdtt_hm(1002, Caption.BR);
         this.ar = this.a(super.width - 8 - 102, 144, 56, 6, var17, this, 1);
         this.ar.b(true);
         var16.addElement(this.ar);
         this.an.a((Vector)var16, 2);
         this.g(0);
         var16 = new Vector();
         this.aR = this.a(super.width - 8 - 93, 122, Caption.dC, this, 2101, 7);
         this.aR.setSize(44, 18);
         var16.addElement(this.aR);
         this.aS = this.a(super.width - 8 - 93, 144, Caption.qt, this, 2102, 7);
         this.aS.setSize(44, 18);
         var16.addElement(this.aS);
         this.aT = this.a(super.width - 8 - 93, 166, Caption.sR, this, 2103, 7);
         this.aT.setSize(44, 18);
         var16.addElement(this.aT);
         this.aU = new vdtt_ay(super.width - 8 - 81, this.h() - 35, 0, 0, Caption.BQ[var2.ao], this, 2106, -17);
         var16.addElement(this.aU);
         this.an.a((Vector)var16, 1);
         this.aN = new vdtt_ay(this.width / 2 - 15, this.h() + 12, 0, 0, Caption.vt, this, 1028, -17);
         this.an.a((vdtt_k)this.aN, 0);
         this.aK[0].a(this.aN, 0);
         this.aN.b(!this.F());
         this.aN.b(DataCenter.m());
         this.aO = new vdtt_ay(15, this.h() + 12, 0, 0, Caption.tS, this, 1026, -17);
         this.an.a((vdtt_k)this.aO, 0);
         this.aK[0].a(this.aO, 0);
         this.aO.b(DataCenter.m());
         this.aP = new vdtt_ay(this.width - 45, this.h() + 12, 0, 0, Caption.tT, this, 1027, -17);
         this.an.a((vdtt_k)this.aP, 0);
         this.aK[0].a(this.aP, 0);
         this.aP.b(DataCenter.m());
         byte var10;
         int var11;
         int var12;
         int var13;
         int var14;
         if (DataCenter.k()) {
            this.ba = 6;
            var7 = this.width / this.ba;
            this.bc = new XYEntity[this.ba];

            for(var11 = 0; var11 < 6; ++var11) {
               this.bc[var11] = XYEntity.create(var11 * var7, 0);
            }
         } else {
            this.bc = new XYEntity[this.ba];
            var13 = this.ba % 4;
            var12 = (this.ba - 4) / 4;
            var7 = (this.width - 14) / (var12 + 2 + var13 / 2);
            var10 = 0;
            this.bc[0] = XYEntity.create(0, 0);
            var14 = var10 + 1;

            for(var11 = 0; var11 < var12 + var13 / 2; ++var11) {
               this.bc[var14] = XYEntity.create(var14 * var7, 0);
               ++var14;
            }

            this.bc[var14] = XYEntity.create((var12 + var13 / 2 + 1) * var7, 0);
            ++var14;

            for(var11 = 0; var11 < var12; ++var11) {
               this.bc[var14] = XYEntity.create((var12 + var13 / 2 + 1) * var7, (var11 + 1) * 32);
               ++var14;
            }

            this.bc[var14] = XYEntity.create((var12 + var13 / 2 + 1) * var7, (var12 + 1) * 32);
            ++var14;
            var11 = var12 - 1 + var13 / 2;

            label136:
            while(true) {
               if (var11 < 0) {
                  this.bc[var14] = XYEntity.create(0, (var12 + 1) * 32);
                  ++var14;
                  var11 = var12 - 1;

                  while(true) {
                     if (var11 < 0) {
                        break label136;
                     }

                     this.bc[var14] = XYEntity.create(0, (var11 + 1) * 32);
                     ++var14;
                     --var11;
                  }
               }

               this.bc[var14] = XYEntity.create((var11 + 1) * var7, (var12 + 1) * 32);
               ++var14;
               --var11;
            }
         }

         this.bd = new XYEntity[this.bb];
         var13 = this.bb % 3;
         var12 = (this.bb - 4) / 3;
         var7 = (this.width - (var13 > 0 ? 14 : 0)) / (var12 + 2 + var13 / 2);
         var10 = 0;
         this.bd[0] = XYEntity.create(0, 0);
         var14 = var10 + 1;

         for(var11 = 0; var11 < var12 + var13 / 2; ++var11) {
            this.bd[var14] = XYEntity.create(var14 * var7, 0);
            ++var14;
         }

         this.bd[var14] = XYEntity.create((var12 + var13 / 2 + 1) * var7, 0);
         ++var14;

         for(var11 = 0; var11 < var12; ++var11) {
            this.bd[var14] = XYEntity.create((var12 + var13 / 2 + 1) * var7, (var11 + 1) * 40);
            ++var14;
         }

         this.bd[var14] = XYEntity.create((var12 + var13 / 2 + 1) * var7, (var12 + 1) * 40);
         ++var14;
         this.bd[var14] = XYEntity.create(0, (var12 + 1) * 40);
         ++var14;

         for(var11 = var12 - 1; var11 >= 0; --var11) {
            this.bd[var14] = XYEntity.create(0, (var11 + 1) * 40);
            ++var14;
         }

         if (!DataCenter.m() || var4 < 0) {
            if (this.F()) {
               this.f(GameSrc.gI().bd);
               if (GameSrc.gI().bd == 1) {
                  this.O();
               }

               if (DataCenter.k()) {
                  this.M[this.M.length - 1] = true;
                  return;
               }
            } else {
               this.M[3] = true;
               this.f(0);
            }

            return;
         }

         for(var11 = 0; var11 < this.M.length; ++var11) {
            this.M[var11] = var11 != var4;
         }

         this.f(var4);
      } catch (Exception var15) {
         Utlis.a(var15);
      }

   }

   public final void a(Skill[] var1) {
      Vector var2 = new Vector();

      int var3;
      for(var3 = 0; var3 < var1.length; ++var3) {
         if (!var1[var3].l() && var1[var3].b(this.U)) {
            var2.add(var1[var3]);
         }
      }

      this.V = new Skill[var2.size()];

      for(var3 = 0; var3 < var2.size(); ++var3) {
         this.V[var3] = (Skill)var2.get(var3);
      }

   }

   public final void C() {
      this.aJ = new vdtt_hq[Caption.yt.length][];
      this.aJ[0] = new vdtt_hq[5];
      this.aJ[0][0] = new vdtt_hq((byte)1, this.an.cx + 48, this.f() + 40, this.aG, this.aG * 5, this.aG, 5, 1);
      this.aJ[0][1] = new vdtt_hq((byte)1, this.an.cx + 48 + 172, this.f() + 40, this.aG, this.aG * 5, this.aG, 5, 1);
      this.aJ[0][2] = new vdtt_hq((byte)1, this.an.cx + 48 + this.aG, this.f() + 40 + this.aG * 2, this.aG, this.aG * 3, this.aG, 3, 1);
      this.aJ[0][3] = new vdtt_hq((byte)1, this.an.cx + 48 + 172 - this.aG, this.f() + 40 + this.aG * 3, this.aG, this.aG * 2, this.aG, 2, 1);
      this.aJ[0][4] = new vdtt_hq((byte)1, this.an.cx + 48 + this.aG, this.f() + 40, this.aG, this.aG * 1, this.aG, 1, 1);
      this.aJ[1] = new vdtt_hq[1];
      this.aJ[1][0] = new vdtt_hq((byte)1, this.an.cx + 54, this.f() + 41 + this.aG * 4, this.aG * 6, this.aG, this.aG, this.aG, 1, 6);
      this.am = new vdtt_hp[Caption.yt.length][];
      this.am[0] = new vdtt_hp[5];
      this.am[0][1] = new vdtt_hp((byte)1, this.an.cx + 5, this.f() + 34, super.width - 8 - 12, (this.height - 70) / 15 * 15, 15, this.at[1].length);
      this.am[0][2] = new vdtt_hp((byte)1, this.an.cx + 5, this.f() + 34, super.width - 8 - 12, (this.height - 70) / 15 * 15, 15, this.at[2].length);
      this.am[0][3] = new vdtt_hp((byte)1, this.an.cx + 5, this.f() + 34, super.width - 8 - 12, (this.height - 70) / 20 * 20, 20, this.U.danhhieu.length);
      this.am[1] = new vdtt_hp[1];
      this.am[1][0] = new vdtt_hp((byte)1, this.an.cx + 82, this.an.cy + 7 + 40, 135, this.aH * 7 + 1, this.aH, 0);
      this.am[2] = new vdtt_hp[1];
      if (this.F()) {
         this.am[2][0] = new vdtt_hp((byte)1, this.an.cx + 82, this.an.cy + 7 + 40, 135, this.aH * 7 + 1, this.aH, 0);
      } else {
         this.am[2][0] = new vdtt_hp((byte)1, this.an.cx + 82, this.an.cy + 7 + 40, 190, this.aH * 7 + 1, this.aH, 0);
      }

   }

   public final int D() {
      return super.a.b;
   }

   public final int E() {
      return this.an.b.b;
   }

   private void a(vdtt_hp var1, int var2) {
      this.aX = false;

      for(int var3 = 0; var3 < this.aJ.length; ++var3) {
         if (this.aJ[var3] != null) {
            for(int var4 = 0; var4 < this.aJ[var3].length; ++var4) {
               if (this.aJ[var3][var4] != null) {
                  this.aJ[var3][var4].k = -1;
               }
            }
         }
      }

      if (var1 != null) {
         var1.k = var2;
      }

   }

   public final void d() {
      super.d();
      GameSrc.gI().bd = super.a.b;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      try {
         super.a(var1, var2, var3);
         if (super.a.b >= this.w()) {
            return;
         }

         if (var1.b == 1010) {
            this.X = 0;
            this.a(var1.j, var1.j.k);
            switch(var1.j.k) {
            case 0:
               this.k = a(var1, this, this.U.arrItemBody[2]);
               return;
            case 1:
               this.k = a(var1, this, this.U.arrItemBody[4]);
               return;
            case 2:
               this.k = a(var1, this, this.U.arrItemBody[6]);
               return;
            case 3:
               this.k = a(var1, this, this.U.arrItemBody[8]);
               return;
            case 4:
               this.k = a(var1, this, this.U.arrItemBody[14]);
               return;
            default:
               return;
            }
         }

         if (var1.b == 1011) {
            this.X = 1;
            this.a(var1.j, var1.j.k);
            switch(var1.j.k) {
            case 0:
               this.k = a(var1, this, this.U.arrItemBody2[2]);
               return;
            case 1:
               this.k = a(var1, this, this.U.arrItemBody2[4]);
               return;
            case 2:
               this.k = a(var1, this, this.U.arrItemBody2[6]);
               return;
            case 3:
               this.k = a(var1, this, this.U.arrItemBody2[8]);
               return;
            case 4:
               this.k = a(var1, this, this.U.arrItemBody2[14]);
               return;
            default:
               return;
            }
         }

         if (var1.b == 1012) {
            this.X = 0;
            this.a(var1.j, var1.j.k);
            switch(var1.j.k) {
            case 0:
               this.k = a(var1, this, this.U.arrItemBody[12]);
               return;
            case 1:
               this.k = a(var1, this, this.U.arrItemBody[10]);
               return;
            case 2:
               this.k = a(var1, this, this.U.arrItemBody[15]);
               return;
            default:
               return;
            }
         }

         if (var1.b == 1013) {
            this.X = 1;
            this.a(var1.j, var1.j.k);
            switch(var1.j.k) {
            case 0:
               this.k = a(var1, this, this.U.arrItemBody2[10]);
               return;
            case 1:
               this.k = a(var1, this, this.U.arrItemBody2[15]);
               return;
            default:
               return;
            }
         }

         Message var4;
         if (var1.b == 1014) {
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.U.arrItemBody[13]);
         } else if (var1.b == 1201) {
            if (this.aK[0].h() == 0) {
               if (var1.j.k < 0 || this.U.sys <= 0) {
                  return;
               }

               String var5;
               if (this.U.sys != 0 && this.U.sys != 1 && this.U.sys != 3 && this.U.sys != 5) {
                  var5 = Caption.zm[1];
               } else {
                  var5 = Caption.zm[0];
               }

               this.M();
               this.k = a(var5, this, var1.j.cx + 40, var1.j.cy, 230);
               return;
            }
         } else {
            if (var1.b == 1020) {
               this.aI = -1;
               this.a(var1.j, var1.j.k);
               switch(var1.j.k) {
               case 0:
                  this.k = a(var1, this, this.U.arrItemBody[0]);
                  break;
               case 1:
                  this.k = a(var1, this, this.U.arrItemBody[3]);
                  break;
               case 2:
                  this.k = a(var1, this, this.U.arrItemBody[5]);
                  break;
               case 3:
                  this.k = a(var1, this, this.U.arrItemBody[7]);
                  break;
               case 4:
                  this.k = a(var1, this, this.U.arrItemBody[9]);
                  break;
               case 5:
                  this.k = a(var1, this, this.U.arrItemBody[11]);
               }

               this.J();
               return;
            }

            if (var1.b == 1021) {
               this.a(var1.j, var1.j.k);
               switch(var1.j.k) {
               case 0:
                  this.k = a(var1, this, this.U.arrItemBody2[1]);
                  return;
               case 1:
                  this.k = a(var1, this, this.U.arrItemBody2[3]);
                  return;
               case 2:
                  this.k = a(var1, this, this.U.arrItemBody2[5]);
                  return;
               case 3:
                  this.k = a(var1, this, this.U.arrItemBody2[7]);
                  return;
               case 4:
                  this.k = a(var1, this, this.U.arrItemBody2[9]);
                  return;
               default:
                  return;
               }
            }

            if (var1.b == 1022) {
               this.a(var1.j, var1.j.k);
               return;
            }

            if (var1.b != 1023) {
               if (var1.b == 1024) {
                  this.a(var1.j, var1.j.k);
                  this.k = a(var1, this, this.U.arrItemBody2[14]);
               } else if (var1.b == 1025) {
                  (var4 = Message.c((byte)-73)).writeUTF(this.U.name);
                  var4.send();
                  vdtt_aa.gI().n();
               } else if (var1.b == 1026) {
                  vdtt_aa.gI().n();
                  this.k = b(Caption.sV, this, 43, this.h(), 160);
               } else if (var1.b == 1027) {
                  vdtt_aa.gI().n();
                  this.k = b(Caption.sW, this, super.width - 8 - 150, this.h(), 160);
               } else if (var1.b == 1028) {
                  if (this.U.p()) {
                     vdtt_aa.gI().n();
                     this.H.a((vdtt_w)(new vdtt_kx(this.H, this.U.bp)));
                     GameSrc.gI();
                     GameSrc.o(112);
                  }
               } else if (var1.b == 1090) {
                  this.a(var1.j, var1.j.k);
                  this.aX = true;
                  this.k = a(var1, this, this.as);
               } else {
                  if (var1.b >= 4000 && var1.b < 5000) {
                     this.al = var1.b - 4000;
                     this.g(this.al);
                     vdtt_aa.gI().n();
                     return;
                  }

                  if (var1.b >= 5000 && var1.b < 6000) {
                     this.a(this.aJ[this.an.b.b][0], -1);
                     this.al = var1.b - 5000;
                     this.K();
                     this.j(this.al);
                     vdtt_aa.gI().n();
                     return;
                  }
               }
            }
         }

         vdtt_jy var6;
         Message var31;
         switch(var1.b) {
         case 200:
            var6 = this;

            try {
               (var31 = new Message((byte)-24)).writeByte(var6.aV.n.b);
               var31.send();
            } catch (Exception var28) {
               Utlis.a(var28);
            }

            return;
         case 1001:
            if (var1.j.k >= 0) {
               this.l(var1.j.k);
            }

            return;
         case 1030:
         case 2010:
         case 2105:
         default:
            return;
         case 1031:
            if (var1.j.k >= 0 && var1.j.k < GameSrc.gI().af.length) {
               this.al = var1.j.k;
               this.H();
            }

            return;
         case 1040:
         case 1041:
         case 1042:
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, (Item)null);
            return;
         case 1100:
         case 1101:
         case 1102:
         case 1103:
         case 1104:
            if (this.Y < 0) {
               this.Y = var1.b - 1100;
               this.Z = 0;
               return;
            }

            return;
         case 1301:
            if (var1.j.k >= 0) {
               (var4 = Message.c((byte)-74)).writeByte(var1.j.k - 1);
               var4.send();
            }
            break;
         case 1400:
         case 1401:
         case 1402:
         case 1403:
         case 1404:
         case 1409:
            vdtt_aa.gI().n();
            if (this.aK[super.a.b].h() == 1) {
               this.k = b(Caption.Cc[var1.b - 1400], this, var1.a() + 20, var1.b(), 0);
            } else {
               this.k = b(Caption.BL[var1.b - 1400], this, var1.a() + 20, var1.b(), 0);
            }

            return;
         case 1405:
         case 1406:
         case 1407:
         case 1408:
            vdtt_aa.gI().n();
            this.k = a(Caption.BL[var1.b - 1400], this, var1.a() + 20, var1.b(), 160);
            return;
         case 2000:
            if (var1.j.k >= 0) {
               this.aK[0].a(var1.j.k);
               this.P();
            }

            return;
         case 2001:
            if (this.aL[0].h() - 1 >= this.aL[0].R) {
               this.aL[0].a(this.aL[0].h() - 1);
               ++this.S;
            }

            return;
         case 2002:
            if (this.S > 0) {
               this.aL[0].a(this.aL[0].h() + 1);
               --this.S;
            }

            return;
         case 2003:
            if (this.aL[1].h() - 1 >= this.aL[1].R) {
               this.aL[1].a(this.aL[1].h() - 1);
               ++this.S;
            }

            return;
         case 2004:
            if (this.S > 0) {
               this.aL[1].a(this.aL[1].h() + 1);
               --this.S;
            }

            return;
         case 2005:
            if (this.aL[2].h() - 1 >= this.aL[2].R) {
               this.aL[2].a(this.aL[2].h() - 1);
               ++this.S;
            }

            return;
         case 2006:
            if (this.S > 0) {
               this.aL[2].a(this.aL[2].h() + 1);
               --this.S;
            }

            return;
         case 2007:
            if (this.aL[3].h() - 1 >= this.aL[3].R) {
               this.aL[3].a(this.aL[3].h() - 1);
               ++this.S;
            }

            return;
         case 2008:
            if (this.S > 0) {
               this.aL[3].a(this.aL[3].h() + 1);
               --this.S;
            }

            return;
         case 2009:
            this.S += this.aL[0].h() + this.aL[1].h() + this.aL[2].h() + this.aL[3].h() - (this.O + this.P + this.R + this.Q);
            this.aL[0].a("" + this.O);
            this.aL[1].a("" + this.P);
            this.aL[2].a("" + this.R);
            this.aL[3].a("" + this.Q);
            return;
         case 2012:
            if (this.S > 10) {
               this.aL[0].a(this.aL[0].h() + 10);
               this.S -= 10;
               return;
            }

            if (this.S <= 0) {
               return;
            }

            this.aL[0].a(this.aL[0].h() + this.S);
            this.S = 0;
            return;
         case 2014:
            if (this.S > 10) {
               this.aL[1].a(this.aL[1].h() + 10);
               this.S -= 10;
            } else if (this.S > 0) {
               this.aL[1].a(this.aL[1].h() + this.S);
               this.S = 0;
               return;
            }

            return;
         case 2016:
            if (this.S > 10) {
               this.aL[2].a(this.aL[2].h() + 10);
               this.S -= 10;
            } else if (this.S > 0) {
               this.aL[2].a(this.aL[2].h() + this.S);
               this.S = 0;
               return;
            }

            return;
         case 2018:
            if (this.S > 10) {
               this.aL[3].a(this.aL[3].h() + 10);
               this.S -= 10;
            } else if (this.S > 0) {
               this.aL[3].a(this.aL[3].h() + this.S);
               this.S = 0;
               return;
            }

            return;
         case 2101:
            var6 = this;

            try {
               (var31 = new Message((byte)62)).writeByte(var6.aI);
               var31.send();
            } catch (Exception var27) {
               Utlis.a(var27);
            }

            return;
         case 2102:
            var6 = this;

            try {
               var6.k = a(var6.be.a(), var6, -28, -10, var6.width + 94, var6.height + 20, var6.U);
            } catch (Exception var26) {
            }

            return;
         case 2103:
            var6 = this;

            try {
               var6.H.a((vdtt_w)(new vdtt_mf(var6.H, var6, var6.U, var6.V[var6.al])));
            } catch (Exception var25) {
            }

            return;
         case 2104:
            this.aI = -1;
            this.a((vdtt_hp)null, -1);
            this.J();
            return;
         case 2106:
            var2 = Char.gI().s();
            int var7 = 500000;
            if ((var3 = 150 * (Char.gI().y() / 10000000)) < 150) {
               var3 = 150;
            } else if (var3 > 1500) {
               var3 = 1500;
            }

            if (var2 == 57) {
               var7 = 4000000;
            } else if (var2 == 55) {
               var7 = 2000000;
            } else if (var2 == 50) {
               var7 = 1000000;
            }

            var2 = Utlis.c();
            Vector var8 = new Vector();

            for(int var9 = 0; var9 < Caption.BQ.length; ++var9) {
               String var10 = Caption.BQ[var9];
               if (var9 == 5) {
                  var10 = var10 + Utlis.b(Caption.xc, Utlis.c(var3));
               } else if (var9 == 6) {
                  var10 = var10 + Utlis.b(Caption.xb, Utlis.c(var7));
               }

               if (GameSrc.gI().mapID != 86 && Char.gI().ao == 0 && var9 == 1) {
                  var10 = var10 + Caption.wV;
               }

               if (var9 == 3 && this.aA > var2) {
                  var10 = var10 + Utlis.b(Caption.wX, Utlis.i(this.aA - var2));
               }

               var8.addElement(new vdtt_ir(2110 + var9, var10));
            }

            String[] var32 = new String[var8.size()];
            short[] var33 = new short[var8.size()];

            for(var7 = 0; var7 < var8.size(); ++var7) {
               vdtt_ir var11 = (vdtt_ir)var8.elementAt(var7);
               var32[var7] = var11.b;
               var33[var7] = (short)var11.a;
            }

            this.k = a(this, this.aN.cx - 88, this.aN.cy - 152, new vdtt_hm(0, var33, var32));
            return;
         case 2107:
            m(5);
            return;
         case 3000:
            k(this.V[this.al].d);
            return;
         case 3001:
            var6 = this;

            try {
               (var31 = new Message((byte)14)).writeShort(var6.V[var6.al].d);
               var31.send();
            } catch (Exception var24) {
               Utlis.a(var24);
            }

            return;
         case 3002:
            var6 = this;

            try {
               var6.k = a(var6.be.a(), var6, -28, -10, var6.width + 94, var6.height + 20, var6.U);
            } catch (Exception var23) {
            }

            return;
         case 3003:
            var6 = this;

            try {
               var6.H.a((vdtt_w)(new vdtt_mf(var6.H, var6, var6.U, var6.V[var6.al])));
            } catch (Exception var22) {
            }

            return;
         }
      } catch (Exception var29) {
         Utlis.a(var29);
         return;
      } finally {
         if (!this.F() && this.k != null && this.k instanceof vdtt_bl) {
            ((vdtt_bl)this.k).f();
         }

      }

   }

   public final boolean F() {
      return this.U.name.equals(Char.gI().name);
   }

   private void a(Vector var1, Skill var2, boolean var3, int var4, long var5) {
      if (this.F()) {
         if (var4 < var2.f) {
            var1.addElement("c#red" + Caption.bu + DataCenter.gI().a((int)var2.f));
         } else if (var2.f > 1) {
            var1.addElement("c#yellow" + Caption.bu + DataCenter.gI().a((int)var2.f));
         }

         if (var3 && var5 < var2.l) {
            var1.addElement("c#red" + Caption.zd[3] + Utlis.c(var2.l) + " ki");
         } else {
            var1.addElement(Caption.zd[3] + Utlis.c(var2.l) + " ki");
         }
      } else {
         var1.addElement(Caption.bu + DataCenter.gI().a((int)var2.f));
         var1.addElement(Caption.zd[3] + Utlis.c(var2.l) + " ki");
      }

      if (var2.getSkillTemplate().type < 5) {
         var1.addElement(Caption.zd[7] + var2.g);
         if (var2.h >= 60000) {
            var1.addElement(Caption.zd[8] + Utlis.i(var2.h / 1000));
         } else if (var2.h % 1000 == 0) {
            var1.addElement(Caption.zd[8] + var2.h / 1000 + Caption.dK);
         } else {
            var1.addElement(Caption.zd[8] + (float)var2.h / 1000.0F + Caption.dK);
         }

         if (!var2.e()) {
            var1.addElement(Caption.zd[9] + var2.i);
            var1.addElement(Caption.zd[10] + var2.k);
         }
      } else if (var2.i > 0) {
         var1.addElement(Caption.dJ + var2.i);
      }

      ItemOption[] var7;
      if ((var7 = var2.h()) != null) {
         var4 = (var7 = var7).length;

         for(int var8 = 0; var8 < var4; ++var8) {
            ItemOption var9;
            if ((var9 = var7[var8]).getItemOptionTemplate().text.length() == 0) {
               try {
                  Message var12;
                  (var12 = new Message((byte)-68)).writeByte(0);
                  var12.writeShort(var2.d);
                  var12.send();
                  return;
               } catch (Exception var11) {
                  return;
               }
            }

            String var10;
            if ((var10 = var9.a(this.U.sys)) != null && var10.length() > 0) {
               var1.addElement(var10);
            }
         }
      }

   }

   public void g(int var1) {
      int var2 = 130;
      if (!this.F()) {
         var2 += 55;
      }

      try {
         this.ao.a(true);
         this.ap.a(true);
         if (var1 < this.V.length) {
            this.al = var1;
            int var3 = this.U.w();
            long var4 = GameSrc.gI().cf;
            Skill var6 = this.V[var1];
            Skill var7;
            if (!this.F()) {
               this.ao.b(true);
               this.ap.b(true);
               this.aq.b(true);
               this.ar.b(true);
            } else {
               this.ao.b(false);
               if (var6 != null) {
                  if (var6.e < var6.getSkillTemplate().levelMax) {
                     GameSrc.gI();
                     if ((var7 = GameSrc.j(var6.d, var6.e + 1)).f <= var3 && var7.l <= var4) {
                        this.ao.a(false);
                     } else {
                        this.ao.a(true);
                     }
                  } else {
                     this.ao.a(true);
                  }
               }

               this.G();
            }

            GameSrc.gI();
            var7 = GameSrc.j(var6.d, var6.e + 1);
            if (var6.e <= 0) {
               this.be = var7;
            } else {
               GameSrc.gI();
               this.be = GameSrc.j(var6.d, var6.e);
            }

            Vector var8;
            (var8 = new Vector()).addElement("c#moc" + var6.getSkillTemplate().name);
            if (var6.getSkillTemplate().detail != null && var6.getSkillTemplate().detail.length() > 0) {
               var8.addElement(var6.getSkillTemplate().detail);
            }

            var8.addElement(Caption.zd[4] + var6.e + "/" + var6.getSkillTemplate().levelMax);
            if (var6.getSkillTemplate().type >= 5) {
               var8.addElement("c#green" + Caption.dL);
            } else if (var6.e()) {
               var8.addElement("c#green" + Caption.mD);
            }

            if (var6.e == 0) {
               var8.addElement("c#grey" + Caption.dM + var7.e + Caption.dN);
               this.a(var8, var7, true, var3, var4);
            } else if (var6.e == var6.getSkillTemplate().levelMax) {
               var8.addElement("c#yellow" + Caption.dO);
               this.a(var8, var6, false, var3, var4);
            } else {
               var8.addElement("c#yellow" + Caption.dP + var6.e);
               this.a(var8, var6, false, var3, var4);
               if (var7 != null && this.F()) {
                  var8.addElement("c#grey" + Caption.dQ + var7.e + Caption.dN);
                  this.a(var8, var7, true, var3, var4);
               }
            }

            Vector var9 = new Vector();

            int var10;
            for(var10 = 0; var10 < var8.size(); ++var10) {
               String var11 = String.valueOf(var8.elementAt(var10));
               int var12;
               Vector var13;
               if (var10 == 0) {
                  var13 = vdtt_dd.a(vdtt_dd.e, var11, var2 - 5);

                  for(var12 = 0; var12 < var13.size(); ++var12) {
                     var9.add(new vdtt_ir(0, (String)var13.elementAt(var12)));
                  }
               } else {
                  var13 = vdtt_dd.a(vdtt_dd.d, var11, var2 - 5);

                  for(var12 = 0; var12 < var13.size(); ++var12) {
                     var9.add(new vdtt_ir(1, (String)var13.elementAt(var12)));
                  }
               }
            }

            this.aQ = new vdtt_ir[var9.size()];

            for(var10 = 0; var10 < var9.size(); ++var10) {
               this.aQ[var10] = (vdtt_ir)var9.elementAt(var10);
            }

            return;
         }

         this.aQ = new vdtt_ir[0];
         return;
      } catch (Exception var17) {
      } finally {
         if (DataCenter.m()) {
            this.am[2][0] = new vdtt_hp((byte)1, this.an.cx + 23, this.an.cy + 7 + 47, this.width - 50, 98, 14, this.aQ.length);
         } else {
            this.am[2][0] = new vdtt_hp((byte)1, this.an.cx + 53, this.an.cy + 7 + 41, var2, 112, 14, this.aQ.length);
         }

         this.M();
      }

   }

   public final void G() {
      if (!this.V[this.al].c()) {
         this.ap.a(false);
         if (this.N() && this.V[this.al].e > 0) {
            String[][] var1 = new String[][]{Caption.BR, Caption.BS, Caption.BT, Caption.BU, Caption.BV, Caption.BW};
            this.ar.n.c = var1[this.V[this.al].e - 1];
            this.ar.a(Char.gI().aA);
            if (this.ar.m != null) {
               this.ar.m.a(Char.gI().aA);
               this.ar.m.k = Char.gI().aA;
            }

            this.ar.a(this.ar.n, this.V[this.al].e);
            this.ap.b(true);
            this.ar.b(false);
            return;
         }

         this.ap.b(false);
         this.ar.b(true);
      }

   }

   private void J() {
      Vector var1;
      (var1 = new Vector()).add(Caption.tU + this.U.x());
      var1.add(Caption.dU + this.aD[1] + "/" + this.aD[0]);
      var1.add(Caption.dV + this.aD[3] + "/" + this.aD[2]);

      String var2;
      for(int var3 = 0; var3 < Caption.yx.length; ++var3) {
         if (var3 == 0) {
            var2 = Caption.yx[var3] + ": " + this.aD[var3 + 4] * 90 / 100 + " - " + this.aD[var3 + 4];
         } else {
            var2 = Caption.yx[var3] + ": " + this.aD[var3 + 4] + (var3 != 16 && var3 != 17 && var3 != 18 && var3 != 19 && var3 != 20 ? "" : "%");
         }

         var1.add(var2);
      }

      Vector var7 = new Vector();

      int var4;
      for(var4 = 0; var4 < var1.size(); ++var4) {
         var2 = String.valueOf(var1.elementAt(var4));
         Vector var5 = vdtt_dd.a(vdtt_dd.d, var2, 145);

         for(int var6 = 0; var6 < var5.size(); ++var6) {
            var7.add(new vdtt_ir(1, (String)var5.elementAt(var6)));
         }
      }

      this.aQ = new vdtt_ir[var7.size()];

      for(var4 = 0; var4 < var7.size(); ++var4) {
         this.aQ[var4] = (vdtt_ir)var7.elementAt(var4);
      }

      this.am[1][0] = new vdtt_hp((byte)1, this.an.cx + 53, this.an.cy + 7 + 41, 150, 112, 14, this.aQ.length);
      this.M();
   }

   private void K() {
      Item var1;
      if ((var1 = this.U.arrItemBody[0]) != null) {
         ItemOption[] var2 = var1.L();
         int var3 = 0;

         for(int var4 = 0; var4 < var2.length; ++var4) {
            if (var2[var4].option[0] == 327) {
               int var5;
               if ((var5 = var2[var4].option[1]) >= 0) {
                  int var6;
                  if ((var6 = var2[var4].f()) < 0) {
                     var6 = 0;
                  }

                  Skill[] var7 = this.aF;
                  GameSrc.gI();
                  var7[var3] = GameSrc.j(var5, var6).a();
                  this.aF[var3].p = var2[var4].f() < 0;
               } else {
                  this.aF[var3] = null;
               }

               ++var3;
               if (var3 >= this.aF.length) {
                  break;
               }
            }
         }
      }

   }

   private void j(int var1) {
      int var2 = 130;
      if (!this.F()) {
         var2 += 20;
      }

      try {
         this.aR.a(true);
         this.aS.a(true);
         if (var1 >= this.aF.length) {
            this.aQ = new vdtt_ir[0];
         } else {
            this.aI = var1;
            int var3 = this.U.v();
            long var4 = (long)this.U.z();
            Vector var6 = new Vector();
            Skill var7 = this.aF[var1];
            byte var8 = 0;
            short var9 = 0;
            switch(var1) {
            case 0:
            case 1:
            case 2:
            case 3:
               break;
            case 4:
               var9 = 750;
               var8 = 5;
               break;
            case 5:
               var9 = 750;
               var8 = 10;
               break;
            case 6:
               var9 = 100;
               var8 = 15;
               break;
            case 7:
               var9 = 200;
               var8 = 20;
               break;
            case 8:
               var9 = 300;
               var8 = 25;
               break;
            case 9:
               var9 = 750;
               var8 = 30;
               break;
            case 10:
               var9 = 400;
               var8 = 35;
               break;
            case 11:
               var9 = 750;
               var8 = 40;
               break;
            case 12:
               var9 = 500;
               var8 = 45;
               break;
            case 13:
               var9 = 750;
               var8 = 50;
               break;
            default:
               return;
            }

            String var10;
            if (var7 == null) {
               var6.addElement("c#moc" + Caption.wT);
               if (var3 < var8) {
                  var6.addElement("c#red" + Caption.bu + DataCenter.gI().a((int)var8));
               } else {
                  var6.addElement(Caption.bu + DataCenter.gI().a((int)var8));
               }

               var6.addElement("c#silver" + Utlis.b(Caption.wU, Utlis.k(var9)));
               var10 = Caption.nt;
               this.aR.l = var10;
               this.aR.b(false);
               this.aS.b(true);
               this.aT.b(true);
               this.aR.a(var3 < var8);
            } else {
               this.aR.b(false);
               this.aS.b(true);
               this.aT.b(true);
               var10 = Caption.dC;
               this.aR.l = var10;
               if (!var7.c()) {
                  this.aS.a(false);
               }

               Skill var11;
               if (!this.F()) {
                  this.aR.b(true);
                  this.aS.b(true);
                  this.aT.b(true);
               } else {
                  this.aR.b(false);
                  if (var7.e < var7.getSkillTemplate().levelMax) {
                     GameSrc.gI();
                     if ((var11 = GameSrc.j(var7.d, var7.e + 1)).f <= var3 && var11.l <= var4) {
                        this.aR.a(false);
                     } else {
                        this.aR.a(true);
                     }
                  } else {
                     this.aR.a(true);
                  }
               }

               GameSrc.gI();
               var11 = GameSrc.j(var7.d, var7.e + 1);
               if (var7.e <= 0) {
                  this.be = var11;
               } else {
                  GameSrc.gI();
                  this.be = GameSrc.j(var7.d, var7.e);
               }

               var6.addElement("c#moc" + var7.getSkillTemplate().name);
               if (var7.getSkillTemplate().detail != null && var7.getSkillTemplate().detail.length() > 0) {
                  var6.addElement(var7.getSkillTemplate().detail);
               }

               var6.addElement(Caption.zd[4] + var7.e + "/" + var7.getSkillTemplate().levelMax);
               if (var7.p) {
                  var10 = Caption.nt;
                  this.aR.l = var10;
                  this.aR.b(false);
                  this.aS.b(true);
                  this.aT.b(true);
                  this.aR.a(var3 < var8);
                  if (var3 < var11.f) {
                     var6.addElement("c#red" + Caption.bu + DataCenter.gI().a((int)var11.f));
                  } else {
                     var6.addElement(Caption.bu + DataCenter.gI().a((int)var11.f));
                  }

                  var6.addElement("c#silver" + Utlis.b(Caption.wU, Utlis.k(var9)));
               } else {
                  if (var7.getSkillTemplate().type >= 5) {
                     var6.addElement("c#green" + Caption.dL);
                  } else if (var7.e()) {
                     var6.addElement("c#green" + Caption.mD);
                  }

                  if (var7.e == 0) {
                     var6.addElement("c#grey" + Caption.dM + var11.e + Caption.dN);
                     this.a(var6, var11, true, var3, var4);
                  } else if (var7.e == var7.getSkillTemplate().levelMax) {
                     var6.addElement("c#yellow" + Caption.dO);
                     this.a(var6, var7, false, var3, var4);
                  } else {
                     var6.addElement("c#yellow" + Caption.dP + var7.e);
                     this.a(var6, var7, false, var3, var4);
                     if (var11 != null && this.F()) {
                        var6.addElement("c#grey" + Caption.dQ + var11.e + Caption.dN);
                        this.a(var6, var11, true, var3, var4);
                     }
                  }
               }
            }

            Vector var21 = new Vector();

            int var12;
            for(var12 = 0; var12 < var6.size(); ++var12) {
               String var13 = String.valueOf(var6.elementAt(var12));
               int var14;
               Vector var15;
               if (var12 == 0) {
                  var15 = vdtt_dd.a(vdtt_dd.e, var13, var2 - 5);

                  for(var14 = 0; var14 < var15.size(); ++var14) {
                     var21.add(new vdtt_ir(0, (String)var15.elementAt(var14)));
                  }
               } else {
                  var15 = vdtt_dd.a(vdtt_dd.d, var13, var2 - 5);

                  for(var14 = 0; var14 < var15.size(); ++var14) {
                     var21.add(new vdtt_ir(1, (String)var15.elementAt(var14)));
                  }
               }
            }

            this.aQ = new vdtt_ir[var21.size()];

            for(var12 = 0; var12 < var21.size(); ++var12) {
               this.aQ[var12] = (vdtt_ir)var21.elementAt(var12);
            }

         }
      } catch (Exception var19) {
      } finally {
         this.am[1][0] = new vdtt_hp((byte)1, this.an.cx + 53, this.an.cy + 7 + 41, var2, 112, 14, this.aQ.length);
         this.M();
      }
   }

   private static void k(int var0) {
      try {
         Message var1;
         (var1 = new Message((byte)126)).writeShort(var0);
         var1.send();
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      try {
         super.b(var1);
         if (super.a.b < this.w()) {
            vdtt_gg var2 = this.an;
            boolean var3 = true;
            Graphics var4 = var1;
            vdtt_gg var5 = var2;
            int var6;
            int var7;
            int var8;
            if (!var2.h) {
               var6 = var1.e;
               int var9 = var1.f;
               var2.a(var1, var2.d.cx + var2.cx, var2.d.cy + var2.cy);
               if (!var2.c.a && var2.b.c.length * var2.a.h <= var2.height - 20) {
                  var2.a.b(var1, var2.d.cx + var2.cx, var2.d.cy + var2.cy, var2.a.width + 6, var2.a.height);
               } else {
                  var2.a.a(var1, var2.d.cx + var2.cx, var2.d.cy + var2.cy, var2.a.width + 6, var2.a.height);
               }

               var7 = 0;

               while(true) {
                  if (var7 >= var5.b.c.length) {
                     if (var5.c.a || var5.b.c.length * var5.a.h > var5.height - 20) {
                        var5.a(var4, 0, 0);
                        var4.d(0, 0, DataCenter.gI().n, DataCenter.gI().o);
                     }

                     var5.a(var4, var6, var9);
                     break;
                  }

                  int var10 = var7;
                  if (!var5.g[var7]) {
                     var8 = var7 * var5.a.h + var5.a.h / 2;
                     if (var7 == var5.b.b) {
                        vdtt_cz.a(var4, 64, 0, var5.c.a(var7) - 1, var8, 6);
                     } else {
                        vdtt_cz.a(var4, 63, 0, var5.c.a(var7), var8, 6);
                     }

                     if (var5.e[var7].length >= 2) {
                        var8 -= 5;
                     }

                     for(int var11 = 0; var11 < var5.e[var10].length; ++var11) {
                        if (var10 == var5.b.b) {
                           vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var4, var5.e[var10][var11].toUpperCase(), var5.a.width / 2, var8 + var11 * 10 - 1, 2, -16647137, 0);
                        } else if (var5.a.l == var7) {
                           vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var4, var5.e[var10][var11].toUpperCase(), var5.a.width / 2 + 2, var8 + var11 * 10 - 1 + 1, 2, -9459941, 0);
                        } else {
                           vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var4, var5.e[var10][var11].toUpperCase(), var5.a.width / 2 + 1, var8 + var11 * 10 - 1, 2, -9459941, 0);
                        }
                     }

                     if (var5.f[var10]) {
                        if (var10 == var5.b.b) {
                           vdtt_cz.a(var4, 713, 0, var5.c.a(var10) + 43, var8, 0);
                        } else {
                           vdtt_cz.a(var4, 713, 0, var5.c.a(var10) + 44, var8, 0);
                        }
                     }
                  }

                  ++var7;
               }
            }

            this.an.a(var1, this.cx, this.cy);
            switch(this.an.b.b) {
            case 0:
               var4 = var1;
               vdtt_jy var17 = this;

               try {
                  var6 = var17.aK[0].cy + var17.aK[0].height + 10;
                  if (var17.as != null) {
                     a(var4, var17.aW.cx, var17.aW.cy, var17.as, var17.aX, "");
                  }

                  var17.aK[0].a(var4);
                  String var18;
                  switch(var17.aK[0].h()) {
                  case 0:
                     Item var19 = null;
                     if (var17.as != null) {
                        a(var4, var17.aW.cx, var17.aW.cy, var17.as, var17.aX, "");
                     }

                     for(var7 = 0; var7 < var17.aJ[var17.an.b.b][0].i; ++var7) {
                        var18 = Caption.yg[var7];
                        switch(var7) {
                        case 0:
                           var19 = var17.U.arrItemBody[2];
                           break;
                        case 1:
                           if (var17.U.sys == 4) {
                              var18 = Caption.yg[5];
                           }

                           var19 = var17.U.arrItemBody[4];
                           break;
                        case 2:
                           var19 = var17.U.arrItemBody[6];
                           break;
                        case 3:
                           var19 = var17.U.arrItemBody[8];
                           break;
                        case 4:
                           var19 = var17.U.arrItemBody[14];
                        }

                        var8 = var17.aJ[var17.an.b.b][0].cx;
                        if (var7 == var17.Y) {
                           var8 += var17.Z;
                        }

                        a(var4, var8, var17.aJ[var17.an.b.b][0].cy + var7 * var17.aJ[var17.an.b.b][0].h, var19, var7 == var17.aJ[var17.an.b.b][0].k, var18);
                     }

                     a(var4, var17.aJ[var17.an.b.b][4].cx, var17.aJ[var17.an.b.b][4].cy, var17.U.arrItemBody[13], 0 == var17.aJ[var17.an.b.b][4].k, Caption.dt);
                     a(var4, var17.aJ[var17.an.b.b][2].cx, var17.aJ[var17.an.b.b][2].cy, var17.U.arrItemBody[12], 0 == var17.aJ[var17.an.b.b][2].k, Caption.xm);
                     a(var4, var17.aJ[var17.an.b.b][2].cx, var17.aJ[var17.an.b.b][2].cy + var17.aJ[var17.an.b.b][2].h, var17.U.arrItemBody[10], 1 == var17.aJ[var17.an.b.b][2].k, Caption.zv[0]);
                     a(var4, var17.aJ[var17.an.b.b][2].cx, var17.aJ[var17.an.b.b][2].cy + var17.aJ[var17.an.b.b][2].h * 2, var17.U.arrItemBody[15], 2 == var17.aJ[var17.an.b.b][2].k, Caption.rK);

                     for(var7 = 0; var7 < var17.aJ[var17.an.b.b][1].i; ++var7) {
                        var18 = Caption.yg[var7];
                        switch(var7) {
                        case 0:
                           var19 = var17.U.arrItemBody2[2];
                           break;
                        case 1:
                           if (var17.U.sys == 4) {
                              var18 = Caption.yg[5];
                           }

                           var19 = var17.U.arrItemBody2[4];
                           break;
                        case 2:
                           var19 = var17.U.arrItemBody2[6];
                           break;
                        case 3:
                           var19 = var17.U.arrItemBody2[8];
                           break;
                        case 4:
                           var19 = var17.U.arrItemBody2[14];
                        }

                        var8 = var17.aJ[var17.an.b.b][1].cx;
                        if (var7 == var17.Y) {
                           var8 -= var17.Z;
                        }

                        a(var4, var8, var17.aJ[var17.an.b.b][1].cy + var7 * var17.aJ[var17.an.b.b][1].h, var19, var7 == var17.aJ[var17.an.b.b][1].k, var18);
                     }

                     a(var4, var17.aJ[var17.an.b.b][3].cx, var17.aJ[var17.an.b.b][3].cy, var17.U.arrItemBody2[10], 0 == var17.aJ[var17.an.b.b][3].k, Caption.zv[0]);
                     a(var4, var17.aJ[var17.an.b.b][3].cx, var17.aJ[var17.an.b.b][3].cy + var17.aJ[var17.an.b.b][3].h, var17.U.arrItemBody2[15], 1 == var17.aJ[var17.an.b.b][3].k, Caption.rK);
                     if (var17.aC != null) {
                        var17.aC.b(var4, var17.aC.cx, var17.aC.cy);
                     }

                     if (var17.U.bq) {
                        var4.c(-649022);
                     }

                     var17.U.a(var4, var17.width / 2, 170, var17.U.a(var17.U.arrItemBody), DataCenter.gI().h / 4 % 6, var17.U.typeGiaoDich, true, false);
                     var4.f();
                     var17.U.b(var4, var17.width / 2, 115);
                     return;
                  case 1:
                  case 2:
                     var1 = var4;
                     vdtt_jy var12 = var17;
                     var17.a(var4, var17.am[var17.an.b.b][var17.aK[0].h()]);

                     for(var6 = 0; var6 < var12.at[var12.aK[0].h()].length; ++var6) {
                        int var13 = var6 * var12.am[var12.an.b.b][var12.aK[0].h()].h;
                        if (var12.am[var12.an.b.b][var12.aK[0].h()].c(var13)) {
                           vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, var12.at[var12.aK[0].h()][var6], 10, var13 + var12.am[var12.an.b.b][var12.aK[0].h()].h / 2, 0, -1, 0);
                           var13 = var1.e;
                           int var14 = var1.f;
                           if (var12.aK[0].h() == 1) {
                              if (var6 == var12.am[var12.an.b.b][var12.aK[0].h()].i - 1) {
                                 var12.a(var1, var13 + var12.aw[var12.aw.length - 1].cx, var14 + var12.aw[var12.aw.length - 1].cy);
                                 var12.aw[var12.aw.length - 1].b(var1);
                                 var12.a(var1, var13, var14);
                              } else if (var6 == var12.am[var12.an.b.b][var12.aK[0].h()].i - 2) {
                                 var12.a(var1, var13 + var12.aw[var12.aw.length - 2].cx, var14 + var12.aw[var12.aw.length - 2].cy);
                                 var12.aw[var12.aw.length - 2].b(var1);
                                 var12.a(var1, var13, var14);
                              }
                           } else if (var12.aK[0].h() == 2) {
                              if (var6 == var12.am[var12.an.b.b][var12.aK[0].h()].i - 1) {
                                 var12.a(var1, var13 + var12.au[var12.au.length - 1].cx, var14 + var12.au[var12.au.length - 1].cy);
                                 var12.au[var12.au.length - 1].b(var1);
                                 var12.a(var1, var13, var14);
                              } else if (var6 == var12.am[var12.an.b.b][var12.aK[0].h()].i - 2) {
                                 var12.a(var1, var13 + var12.au[var12.au.length - 2].cx, var14 + var12.au[var12.au.length - 2].cy);
                                 var12.au[var12.au.length - 2].b(var1);
                                 var12.a(var1, var13, var14);
                              } else if (var6 >= 6 && var6 < 14) {
                                 var12.a(var1, var13 + var12.au[var6 - 6].cx, var14 + var12.au[var6 - 6].cy);
                                 var12.au[var6 - 6].b(var1);
                                 var12.a(var1, var13, var14);
                              }
                           }
                        }
                     }

                     var12.a((Graphics)var1);
                     var12.am[var12.an.b.b][var12.aK[0].h()].a(var1, var12);
                     return;
                  case 3:
                     var17.a(var4, var17.am[var17.an.b.b][var17.aK[0].h()]);

                     for(var7 = 0; var7 < var17.am[var17.an.b.b][var17.aK[0].h()].i; ++var7) {
                        if (var17.am[var17.an.b.b][var17.aK[0].h()].b(var7)) {
                           var6 = var7 * var17.am[var17.an.b.b][var17.aK[0].h()].h + var17.am[var17.an.b.b][var17.aK[0].h()].h / 2;
                           vdtt_cz.a(var4, 10, 0, 15, var6, 3);
                           if (var7 == var17.U.selectDanhHieu) {
                              vdtt_cz.a(var4, 11, 0, 15, var6, 3);
                           }

                           var18 = var17.U.danhhieu[var7].a;
                           if (var7 > 0) {
                              var18 = var18 + "c#yellow (" + Caption.sA + (var17.U.danhhieu[var7].b == -1 ? Caption.mJ : Utlis.g((long)var17.U.danhhieu[var7].b * 1000L)) + ")";
                           }

                           if (var17.am[var17.an.b.b][var17.aK[0].h()].l == var7) {
                              vdtt_dd.c(vdtt_dd.d, var4, var18, 29, var6 + 1, 0, -1, 0);
                           } else {
                              vdtt_dd.c(vdtt_dd.d, var4, var18, 28, var6, 0, -1, 0);
                           }
                        }
                     }

                     var17.a((Graphics)var4);
                     var17.am[var17.an.b.b][var17.aK[0].h()].b(var4, var17);
                     return;
                  default:
                     return;
                  }
               } catch (Exception var15) {
                  Utlis.a(var15);
                  return;
               }
            case 1:
               this.g(var1);
               return;
            case 2:
               this.f(var1);
            }
         }
      } catch (Exception var16) {
      }

   }

   private void f(Graphics var1) {
      int var2 = this.an.cx + (DataCenter.m() ? 12 : 16);
      int var3 = this.an.cy + 7 + 5;
      if (!this.F() && this.W.m) {
         vdtt_dd.a(vdtt_dd.d, var1, Caption.dW, this.width / 2, this.height / 2 + 10, 2, -2560, 3, 0);
      } else {
         int var4 = super.width - 8 - this.am[this.an.b.b][0].width - 102;
         int var5 = this.am[this.an.b.b][0].cx + this.am[this.an.b.b][0].width + 4;
         if (this.F()) {
            if (DataCenter.m()) {
               vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.tW + ":" + Utlis.c(Char.gI().A()), this.an.cx + 12, this.an.cy + 7 + this.height - 83, 0, -2560, 0);
               vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.pd + ": " + Utlis.c(GameSrc.gI().cf), this.an.cx + 12, this.an.cy + 7 + this.height - 83 + 10, 0, -6488, 0);
            } else {
               this.a(var1, var5, this.am[this.an.b.b][0].cy - 2, var4, 45, -11, 22, 23, 1, 1);
               this.a(var1, var5, this.am[this.an.b.b][0].cy - 2 + 46, var4, this.am[this.an.b.b][0].height - 41, -11, 22, 23, 1, 1);
               vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.tW, var5 + var4 / 2, this.am[this.an.b.b][0].cy + 5, 2, -2560, 0);
               vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Utlis.c(Char.gI().A()), var5 + var4 / 2, this.am[this.an.b.b][0].cy + 15, 2, -2560, 0);
               vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.pd, var5 + var4 / 2, this.am[this.an.b.b][0].cy + 25, 2, -6488, 0);
               vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Utlis.c(GameSrc.gI().cf), var5 + var4 / 2, this.am[this.an.b.b][0].cy + 35, 2, -6488, 0);
            }
         }

         vdtt_y.a(var1, 79, 0, 31, this.f() + 22, super.width - 8 - 54, (int)3);
         if (!DataCenter.m()) {
            vdtt_y.a(var1, 79, 0, 31, this.f() + this.h() - 25, super.width - 8 - 54, (int)3);
            vdtt_y.a(var1, 79, 90, 30, this.f() + 22, 3, (int)(this.h() - 45));
            vdtt_y.a(var1, 79, 90, 4 + (super.width - 8) - 29, this.f() + 22, 3, (int)(this.h() - 45));
         }

         for(var4 = 0; var4 < this.bc.length; ++var4) {
            var1.f(-16742145);
            b(var1, var2 + this.bc[var4].cx, var3 + this.bc[var4].cy, (Item)null, this.al == var4);
            if (var4 >= this.V.length) {
               if (!mConfig.gI().d()) {
                  vdtt_cz.a(var1, 646, 0, var2 + this.bc[var4].cx + 2, var3 + this.bc[var4].cy + 2, 20);
               }

               vdtt_cz.a(var1, 460, 0, var2 + this.bc[var4].cx + 2, var3 + this.bc[var4].cy + 2, 20);
               if (mConfig.gI().d()) {
                  vdtt_cz.a(var1, 647, 0, var2 + this.bc[var4].cx + 2, var3 + this.bc[var4].cy + 2, 20);
               }
            } else {
               this.V[var4].a(var1, this.U, var2 + this.bc[var4].cx + 2, var3 + this.bc[var4].cy + 2);
            }

            Skill var6 = null;
            if (var4 == 5) {
               var6 = GameSrc.gI().ae[0];
            } else if (var4 == 4) {
               var6 = GameSrc.gI().ae[1];
            } else if (var4 == 3) {
               var6 = GameSrc.gI().ae[2];
            }

            if (var6 != null && var6.e < var6.getSkillTemplate().levelMax) {
               GameSrc.gI();
               var6 = GameSrc.j(var6.d, var6.e + 1);
               if (this.F() && var6 != null && var6.f <= Char.gI().w() && var6.l <= GameSrc.gI().cf) {
                  vdtt_cz.a(var1, 713, 0, var2 + this.bc[var4].cx - 3, var3 + this.bc[var4].cy - 4, 0);
               }
            }
         }

         this.a(var1, this.am[this.an.b.b][0].cx - 2, this.am[this.an.b.b][0].cy - 2, this.am[this.an.b.b][0].width + 5, this.am[this.an.b.b][0].height + 5, -11, 22, 23, 1, 1);
         var1.a(this.am[this.an.b.b][0].cx, this.am[this.an.b.b][0].cy - 34);
         if (this.al >= this.V.length) {
            if (this.V.length == 0) {
               vdtt_dd.a(vdtt_dd.e, var1, Caption.vJ, this.am[this.an.b.b][0].width / 2, 80, 2, -2560, 3, 0);
            } else {
               vdtt_dd.a(vdtt_dd.e, var1, Caption.sQ, this.am[this.an.b.b][0].width / 2, 80, 2, -2560, 3, 0);
            }
         } else {
            this.a(var1, this.am[this.an.b.b][0]);

            for(var5 = 0; var5 < this.aQ.length; ++var5) {
               var4 = var5 * this.am[this.an.b.b][0].h;
               if (this.am[this.an.b.b][0].c(var4)) {
                  if (this.aQ[var5].a == 0) {
                     vdtt_dd.c(vdtt_dd.e, var1, this.aQ[var5].b, 5, var4 + 1 + this.am[this.an.b.b][0].h / 2, 0, -1, -16777216);
                  } else {
                     vdtt_dd.c(vdtt_dd.d, var1, this.aQ[var5].b, 5, var4 + 1 + this.am[this.an.b.b][0].h / 2, 0, -1, -16777216);
                  }
               }
            }

            this.a((Graphics)var1);
            this.am[this.an.b.b][0].a(var1, this, 3);
         }
      }

   }

   private void g(Graphics var1) {
      Item var2 = null;

      int var3;
      for(var3 = 0; var3 < this.aJ[this.an.b.b][0].O; ++var3) {
         switch(var3) {
         case 0:
            var2 = this.U.arrItemBody[0];
            break;
         case 1:
            var2 = this.U.arrItemBody[3];
            break;
         case 2:
            var2 = this.U.arrItemBody[5];
            break;
         case 3:
            var2 = this.U.arrItemBody[7];
            break;
         case 4:
            var2 = this.U.arrItemBody[9];
            break;
         case 5:
            var2 = this.U.arrItemBody[11];
         }

         a(var1, this.aJ[this.an.b.b][0].cx + var3 * this.aJ[this.an.b.b][0].h, this.aJ[this.an.b.b][0].cy, var2, var3 == this.aJ[this.an.b.b][0].k, Caption.BP[var3]);
      }

      if (this.U.arrItemBody[0] != null) {
         int var4 = this.an.cx + 16;
         int var5 = this.an.cy + 7 + 5;
         var3 = super.width - 8 - this.am[this.an.b.b][0].width - 102;
         int var6 = this.am[this.an.b.b][0].cx + this.am[this.an.b.b][0].width + 4;
         Item var7 = this.U.arrItemBody[0];
         if (this.F() && this.aI >= 0) {
            this.a(var1, var6, this.am[this.an.b.b][0].cy - 2, var3, 45, -11, 22, 23, 1, 1);
            this.a(var1, var6, this.am[this.an.b.b][0].cy - 2 + 46, var3, this.am[this.an.b.b][0].height - 41, -11, 22, 23, 1, 1);
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.tW, var6 + var3 / 2, this.am[this.an.b.b][0].cy + 5, 2, -2560, 0);
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Utlis.c(Char.gI().y()), var6 + var3 / 2, this.am[this.an.b.b][0].cy + 15, 2, -2560, 0);
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.pd, var6 + var3 / 2, this.am[this.an.b.b][0].cy + 25, 2, -6488, 0);
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Utlis.c(Char.gI().z()), var6 + var3 / 2, this.am[this.an.b.b][0].cy + 35, 2, -6488, 0);
         }

         vdtt_y.a(var1, 79, 0, 31, this.f() + 22, super.width - 8 - 54, (int)3);
         vdtt_y.a(var1, 79, 90, 30, this.f() + 22, 3, (int)(this.h() - 45));
         vdtt_y.a(var1, 79, 90, 4 + (super.width - 8) - 29, this.f() + 22, 3, (int)(this.h() - 45));
         if (var7 != null) {
            for(var3 = 0; var3 < this.bd.length; ++var3) {
               var1.f(-16742145);
               b(var1, var4 + this.bd[var3].cx, var5 + this.bd[var3].cy, (Item)null, this.aI == var3);
               if (var3 < this.aF.length && this.aF[var3] != null && !this.aF[var3].p) {
                  this.aF[var3].a(var1, this.U, var4 + this.bd[var3].cx + 2, var5 + this.bd[var3].cy + 2);
               } else {
                  vdtt_cz.a(var1, 460, 0, var4 + this.bd[var3].cx + 2, var5 + this.bd[var3].cy + 2, 20);
                  if (mConfig.gI().d()) {
                     vdtt_cz.a(var1, 647, 0, var4 + this.bd[var3].cx + 2, var5 + this.bd[var3].cy + 2, 20);
                  }
               }
            }

            if (this.aI >= 0 && this.aI < this.aF.length && this.F()) {
               this.a(var1, this.am[this.an.b.b][0].cx - 2, this.am[this.an.b.b][0].cy - 2, this.am[this.an.b.b][0].width + 5, this.am[this.an.b.b][0].height + 5, -11, 22, 23, 1, 1);
            } else {
               this.a(var1, this.am[this.an.b.b][0].cx - 2, this.am[this.an.b.b][0].cy - 2, this.am[this.an.b.b][0].width + 45, this.am[this.an.b.b][0].height + 5, -11, 22, 23, 1, 1);
            }

            var1.a(this.am[this.an.b.b][0].cx, this.am[this.an.b.b][0].cy - 34);
            if (this.aI >= this.aF.length) {
               if (this.aF.length == 0) {
                  vdtt_dd.a(vdtt_dd.e, var1, Caption.vJ, this.am[this.an.b.b][0].width / 2, 80, 2, -2560, 3, 0);
                  return;
               }

               vdtt_dd.a(vdtt_dd.e, var1, Caption.sQ, this.am[this.an.b.b][0].width / 2, 80, 2, -2560, 3, 0);
               return;
            }

            if (this.aI < 0 || !this.F()) {
               Char var8 = this.U;
               int var9 = this.am[this.an.b.b][0].width + 22;
               int var10 = 80 + this.am[this.an.b.b][0].cy / 2;
               Item var11;
               Char var12;
               Vector var13;
               if ((var11 = (var12 = this.U).arrItemBody[0]) != null) {
                  Vector var14 = new Vector();
                  var12.a(var14, var11.aq(), 0, true);
                  short var15 = 0;
                  if ((var11 = var12.arrItemBody[11]) != null && var11.strData != null && var11.strData.startsWith("436,")) {
                     ItemOption[] var16 = var11.L();
                     ItemOption var17;
                     int[] var18 = (var17 = var16[0]).option;
                     short var19 = DataCenter.gI().itemTemplate[var18[1]].width;
                     var18 = (var17 = var16[0]).option;
                     if (DataCenter.gI().itemTemplate[var18[1]].a() > 0) {
                        var18 = (var17 = var16[0]).option;
                        var19 = DataCenter.gI().itemTemplate[var18[1]].a();
                     }

                     short[] var20;
                     if ((var20 = DataCenter.gI().A[var19].a[0]).length == 1) {
                        if (!var11.ao() || var12.bT.bt == null) {
                           var15 = var20[0];
                        }
                     } else if (var20.length > 0) {
                        var14.clear();
                        var12.a(var14, var19, 0, true);
                     }
                  }

                  Vector var21 = new Vector();

                  for(int var22 = 0; var22 < var14.size(); ++var22) {
                     vdtt_hb var23;
                     (var23 = (vdtt_hb)var14.get(var22)).a(var21, false);
                     if (var15 > 0) {
                        var23.a(var21, var15);
                     }
                  }

                  var13 = var21;
               } else {
                  var13 = new Vector();
               }

               var8.a(var1, var9, var10, var13, DataCenter.gI().h / 4 % 6, this.U.typeGiaoDich, true, false, true, true);
            }

            this.a(var1, this.am[this.an.b.b][0]);

            for(var4 = 0; var4 < this.aQ.length; ++var4) {
               var3 = var4 * this.am[this.an.b.b][0].h;
               if (this.am[this.an.b.b][0].c(var3)) {
                  if (this.aQ[var4].a == 0) {
                     vdtt_dd.c(vdtt_dd.e, var1, this.aQ[var4].b, 5, var3 + 1 + this.am[this.an.b.b][0].h / 2, 0, -1, -16777216);
                  } else {
                     vdtt_dd.c(vdtt_dd.d, var1, this.aQ[var4].b, 5, var3 + 1 + this.am[this.an.b.b][0].h / 2, 0, -1, -16777216);
                  }
               }
            }

            this.a((Graphics)var1);
            this.am[this.an.b.b][0].a(var1, this, 3);
         }
      }

   }

   public final void a_() {
      super.a_();
      if (this.U.az > 0 && super.a.b == 0 && this.aK[0].h() == 0) {
         if (this.as == null) {
            this.as = new Item(435, true);
            this.as.strData = "207,0,-1;208,0,-1";
            if (this.U.az == 15) {
               StringBuilder var1 = new StringBuilder();
               Item var2 = this.as;
               var2.strData = var1.append(var2.strData).append(";486,5,-1").toString();
            }

            this.as.a(this.U.az);
            this.aW = new vdtt_hq((byte)1, this.an.cx + 48 + this.aG, this.f() + 8 + this.aG * 2, this.aG, this.aG, this.aG, 5, 1);
         }
      } else {
         this.as = null;
         this.aW = null;
      }

      if (this.F()) {
         boolean[] var4 = this.d;
         GameSrc.gI();
         var4[2] = GameSrc.af();
      } else {
         this.d[2] = false;
      }

      if (this.Y >= 0 && this.Z < this.aJ[0][1].cx - this.aJ[0][0].cx) {
         this.Z += 15;
         if (this.Z >= this.aJ[0][1].cx - this.aJ[0][0].cx) {
            this.Z = this.aJ[0][1].cx - this.aJ[0][0].cx;
            vdtt_jy var5 = this;

            try {
               if (var5.Y >= 0 && var5.Y < 5) {
                  Message var7;
                  (var7 = new Message((byte)35)).writeByte(var5.Y);
                  var7.send();
               }
            } catch (Exception var3) {
               Utlis.a(var3);
            }
         }
      }

      if (super.a.b < this.w()) {
         this.an.a();

         int var6;
         int var8;
         for(var6 = 0; var6 < this.aJ.length; ++var6) {
            if (this.aJ[var6] != null) {
               for(var8 = 0; var8 < this.aJ[var6].length; ++var8) {
                  if (this.aJ[var6][var8] != null) {
                     this.aJ[var6][var8].a();
                  }
               }
            }
         }

         for(var6 = 0; var6 < this.am.length; ++var6) {
            if (this.am[var6] != null) {
               for(var8 = 0; var8 < this.am[var6].length; ++var8) {
                  if (this.am[var6][var8] != null) {
                     this.am[var6][var8].a();
                  }
               }
            }
         }

         this.M();
         this.aU.b(this.U.arrItemBody[0] == null || !this.F());
      }

      this.L();
      this.F();
      if (this.aC != null) {
         this.aC.o();
         if (this.aC.p()) {
            this.aC = null;
         }
      }

   }

   private void L() {
      DataCenter.gI();
      if (!DataCenter.b()) {
         int[] var1;
         int var2;
         int[] var3;
         int var4;
         int var5;
         int var6;
         switch(GameSrc.gI().idTask) {
         case 0:
            switch(GameSrc.gI().idStep) {
            case 2:
               if (super.a.b < this.w()) {
                  DataCenter.gI().pointHelper.a(this.cx + this.width - 45, this.cy + 10);
                  DataCenter.gI().pointHelper.b = true;
                  return;
               }

               if (super.a.b == this.w() && this.k == null) {
                  var3 = this.U.d(724);
                  if (this.k == null) {
                     var5 = this.cx + var3[0] + 25;
                     DataCenter.gI().pointHelper.a(var5, this.cy + 25 + var3[1] + 45);
                     DataCenter.gI().pointHelper.b = true;
                  }

                  return;
               }
               break;
            case 3:
               this.y();
            }

            return;
         case 1:
            if (GameSrc.gI().idStep == 0) {
               this.al = 4;
               if (super.a.b != 2) {
                  var5 = this.cx + 175;
                  DataCenter.gI().pointHelper.a(var5, this.cy + 14);
                  DataCenter.gI().pointHelper.b = true;
                  return;
               }

               if (this.ao.c) {
                  this.y();
                  return;
               }

               var5 = this.cx + this.ao.cx + 25;
               var6 = this.cy + this.ao.cy;
               DataCenter.gI().pointHelper.a(var5, var6 + 12);
               DataCenter.gI().pointHelper.b = true;
               return;
            }

            if (GameSrc.gI().idStep != 1) {
               if (GameSrc.gI().idStep == 2) {
                  if (super.a.b != 3) {
                     var5 = this.cx + 230;
                     DataCenter.gI().pointHelper.a(var5, this.cy + 14);
                     DataCenter.gI().pointHelper.b = true;
                     return;
                  }

                  if (this.k == null) {
                     var3 = null;

                     for(var4 = 771; var4 <= 790; ++var4) {
                        if (!GameSrc.gI().cM.contains(var4) && (var3 = this.U.d(var4)) != null) {
                           GameSrc.gI().cM.addElement(this.U.e(var4).getItemTemplate().type);
                           break;
                        }
                     }

                     if (var3 == null) {
                        byte var14 = 0;

                        for(var2 = 0; var2 < Char.gI().arrItemBag.length; ++var2) {
                           if (Char.gI().arrItemBag[var2] != null && Char.gI().arrItemBag[var2].y() && !GameSrc.gI().cM.contains(Char.gI().arrItemBag[var2].getItemTemplate().type) && Char.gI().arrItemBag[var2].level >= var14) {
                              var3 = new int[]{var2 % 9 * 32, var2 / 9 * 32};
                              var14 = Char.gI().arrItemBag[var2].level;
                           }
                        }
                     }

                     if (var3 == null || GameSrc.gI().cM.size() >= 4) {
                        this.y();
                        return;
                     }

                     var5 = this.cx + var3[0] + 20;
                     DataCenter.gI().pointHelper.a(var5, this.cy + 50 + var3[1] + 15);
                     DataCenter.gI().pointHelper.b = true;
                  }
               }
            } else {
               if (super.a.b != 3) {
                  var5 = this.cx + 230;
                  DataCenter.gI().pointHelper.a(var5, this.cy + 14);
                  DataCenter.gI().pointHelper.b = true;
                  return;
               }

               if (this.k == null) {
                  if ((var3 = this.U.d(824)) != null) {
                     var5 = this.cx + var3[0] + 20;
                     DataCenter.gI().pointHelper.a(var5, this.cy + 50 + var3[1] + 15);
                     DataCenter.gI().pointHelper.b = true;
                  }

                  return;
               }
            }
         case 2:
         case 3:
         case 4:
         case 6:
         case 7:
         case 9:
         case 10:
         case 11:
         case 12:
         default:
            break;
         case 5:
            if (GameSrc.gI().idStep == 3) {
               if (super.a.b != 2) {
                  var5 = this.cx + 175;
                  DataCenter.gI().pointHelper.a(var5, this.cy + 14);
                  DataCenter.gI().pointHelper.b = true;
                  return;
               }

               byte var12 = 5;
               Skill var13 = this.V[5];
               GameSrc.gI();
               Skill var15 = GameSrc.j(var13.d, var13.e + 1);
               if (GameSrc.gI().cf < var15.l) {
                  var12 = 4;
               }

               if (this.al != var12) {
                  if (var12 == 5) {
                     DataCenter.gI().pointHelper.a(this.cx + this.width - 30, this.cy + 50);
                     DataCenter.gI().pointHelper.b = true;
                  } else {
                     DataCenter.gI().pointHelper.a(this.cx + this.width - 80, this.cy + 50);
                     DataCenter.gI().pointHelper.b = true;
                  }
               } else {
                  if (!this.ao.c) {
                     var5 = this.cx + this.ao.cx + 25;
                     var6 = this.cy + this.ao.cy;
                     DataCenter.gI().pointHelper.a(var5, var6 + 12);
                     DataCenter.gI().pointHelper.b = true;
                     return;
                  }

                  this.y();
               }
            }
            break;
         case 8:
            vdtt_ii var7 = GameSrc.gI().T();
            if (GameSrc.gI().idStep == 1 && var7 != null && Char.gI().cx == var7.g && Char.gI().cy == var7.h) {
               if (super.a.b < this.w()) {
                  var5 = this.cx + 135;
                  DataCenter.gI().pointHelper.a(var5, this.cy + 10);
                  DataCenter.gI().pointHelper.b = true;
                  return;
               }

               if (super.a.b == this.w() && this.k == null && var7 != null) {
                  var1 = this.U.d(var7.b());
                  var5 = this.cx + var1[0] + 15;
                  DataCenter.gI().pointHelper.a(var5, this.cy + 25 + var1[1] + 15);
                  DataCenter.gI().pointHelper.b = true;
                  return;
               }
            } else if (GameSrc.gI().idStep == 7) {
               if (super.a.b < this.w()) {
                  var5 = this.cx + 135;
                  DataCenter.gI().pointHelper.a(var5, this.cy + 10);
                  DataCenter.gI().pointHelper.b = true;
                  return;
               }

               if (super.a.b == this.w() && this.k == null) {
                  Char var8 = this.U;
                  Vector var9 = new Vector();

                  for(var2 = Char.gI().arrItemBag.length - 1; var2 >= 0; --var2) {
                     if (var8.arrItemBag[var2] != null && var8.arrItemBag[var2].getItemTemplate().type == 1 && var8.arrItemBag[var2].getItemTemplate().levelNeed <= var8.w() && var8.arrItemBag[var2].getItemTemplate().typeChar == var8.sys) {
                        var9.add(var8.arrItemBag[var2]);
                     }
                  }

                  int[] var10;
                  label207: {
                     if (var9.size() != 0) {
                        Collections.sort(var9, Item.comparator);
                        Item var11 = (Item)var9.get(0);

                        for(var4 = Char.gI().arrItemBag.length - 1; var4 >= 0; --var4) {
                           if (var8.arrItemBag[var4] != null && var8.arrItemBag[var4] == var11) {
                              var10 = new int[]{var4 % 9 * 32, var4 / 9 * 32};
                              break label207;
                           }
                        }
                     }

                     var10 = null;
                  }

                  var5 = this.cx + var10[0] + 20;
                  int var10002 = this.cy + 30;
                  DataCenter.gI().pointHelper.a(var5, var10002 + var10[1] + 15);
                  DataCenter.gI().pointHelper.b = true;
                  return;
               }
            } else if (GameSrc.gI().idStep == 8) {
               if (super.a.b < this.w()) {
                  if (this.an.b.b != 2) {
                     var5 = this.cx + 70;
                     DataCenter.gI().pointHelper.a(var5, this.cy + 155);
                     DataCenter.gI().pointHelper.b = true;
                  } else if (this.aM.c) {
                     var5 = this.cx + 280;
                     DataCenter.gI().pointHelper.a(var5, this.cy + 125);
                     DataCenter.gI().pointHelper.b = true;
                  } else {
                     var5 = this.cx + 280;
                     DataCenter.gI().pointHelper.a(var5, this.cy + 190);
                     DataCenter.gI().pointHelper.b = true;
                  }
               } else {
                  var5 = this.cx + 60;
                  DataCenter.gI().pointHelper.a(var5, this.cy + 15);
                  DataCenter.gI().pointHelper.b = true;
               }

               if (this.k != null) {
                  DataCenter.gI().pointHelper.b = false;
                  return;
               }
            } else if (GameSrc.gI().idStep == 9) {
               if (super.a.b >= this.w()) {
                  var5 = this.cx + 60;
                  DataCenter.gI().pointHelper.a(var5, this.cy + 15);
                  DataCenter.gI().pointHelper.b = true;
                  return;
               }

               if (this.an.b.b != 3) {
                  var5 = this.cx + 70;
                  DataCenter.gI().pointHelper.a(var5, this.cy + 190);
                  DataCenter.gI().pointHelper.b = true;
               } else if (this.ao.c) {
                  var5 = this.cx + 280;
                  DataCenter.gI().pointHelper.a(var5, this.cy + 80);
                  DataCenter.gI().pointHelper.b = true;
               } else {
                  var5 = this.cx + 280;
                  DataCenter.gI().pointHelper.a(var5, this.cy + 190);
                  DataCenter.gI().pointHelper.b = true;
               }

               if (this.k != null) {
                  DataCenter.gI().pointHelper.b = false;
                  return;
               }
            }
            break;
         case 13:
            if (GameSrc.gI().idStep == 1) {
               if (GameSrc.gI().bY == 205 && GameSrc.gI().numStepDone == 0) {
                  DataCenter.gI().pointHelper.a(this.cx + this.width - 5, this.cy + 5);
                  DataCenter.gI().pointHelper.b = true;
                  return;
               }

               if (super.a.b < this.w()) {
                  var5 = this.cx + 135;
                  DataCenter.gI().pointHelper.a(var5, this.cy + 10);
                  DataCenter.gI().pointHelper.b = true;
                  return;
               }

               if (super.a.b == this.w() && this.k == null && (var1 = this.U.d(205)) != null) {
                  var5 = this.cx + var1[0] + 15;
                  DataCenter.gI().pointHelper.a(var5, this.cy + 25 + var1[1] + 15);
                  DataCenter.gI().pointHelper.b = true;
               }
            }
         }
      }

   }

   private void M() {
      switch(this.an.b.b) {
      case 1:
         if (this.U.arrItemBody[0] != null && this.aI >= 0 && this.aI < this.aF.length && this.F()) {
            break;
         }

         this.aT.b(true);
         this.aR.b(true);
         this.aS.b(true);
         return;
      case 2:
         if (this.al < this.V.length) {
            this.aq.a(this.V[this.al].e <= 0 || !this.V[this.al].d() || this.V[this.al].d == 30);
            if (!this.V[this.al].c()) {
               this.ap.a(this.V[this.al].e <= 0);
               return;
            }

            this.ap.a(true);
            return;
         }
         break;
      case 3:
         this.aH = 15;
      }

   }

   private boolean N() {
      return this.V[this.al].getSkillTemplate().levelNeed == 5;
   }

   public final void f(int var1) {
      if (var1 != 3 || this.F()) {
         super.f(var1);
         if (this.an != null) {
            this.an.b();
            if (var1 < this.w()) {
               this.l(var1);
            }
         }
      }

   }

   private void O() {
      try {
         Message var1;
         (var1 = Message.c((byte)6)).writeUTF(this.U.name);
         var1.send();
      } catch (Exception var2) {
      }

   }

   private void l(int var1) {
      this.an.a(var1);
      switch(this.an.b.b) {
      case 0:
         this.aK[0].c();
         this.P();
         break;
      case 1:
         this.O();
         this.I();
         break;
      case 2:
         this.S();
         this.H();
      }

      if (this.D() < this.w() && this.an.b.b != this.D()) {
         this.f(this.an.b.b);
      }

   }

   private void P() {
      this.aK[0].a(this.aK[0].h());
      switch(this.aK[0].h()) {
      case 0:
         return;
      case 1:
         this.Q();
         return;
      case 2:
      case 3:
         this.R();
      default:
      }
   }

   private void Q() {
      try {
         Message var1;
         (var1 = Message.c((byte)-73)).writeUTF(this.U.name);
         var1.send();
      } catch (Exception var2) {
      }

   }

   private void R() {
      try {
         Message var1;
         (var1 = new Message((byte)63)).writeUTF(this.U.name);
         var1.send();
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }

   private void S() {
      try {
         if (this.F()) {
            Message var1;
            (var1 = new Message((byte)-62)).writeUTF(this.U.name);
            var1.send();
         }
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (this.Y >= 0) {
         return var1;
      } else {
         if (super.a.b < this.w()) {
            vdtt_gg var2;
            var1.addElement((var2 = this.an).h ? var2.a.a(var2.b.a, -10000, -10000, var2.d) : var2.a.a(var2.b.a, var2.cx, var2.cy, var2.d));
            int var3;
            int var4;
            int var5;
            switch(this.an.b.b) {
            case 0:
               if (this.aW != null) {
                  var1.addElement(this.aW.a(1090, this));
               }

               var1.addElement(this.aK[0].f());
               if (this.aK[0].h() == 0) {
                  for(var5 = 0; var5 < this.aJ[this.an.b.b].length; ++var5) {
                     var1.addElement(this.aJ[this.an.b.b][var5].a(1010 + var5, this));
                  }
               }

               if (this.aK[0].h() == 3) {
                  var1.addElement(this.am[this.an.b.b][this.aK[0].h()].a(1301, this));
               } else if (this.am[0][this.aK[0].h()] != null) {
                  if (this.aK[0].h() == 1) {
                     var5 = this.am[0][this.aK[0].h()].cx + this.am[0][this.aK[0].h()].width - 40;

                     for(var4 = 0; var4 < this.ax.length; ++var4) {
                        if (var4 == this.ax.length - 1) {
                           var3 = this.am[0][this.aK[0].h()].cy + (this.am[0][this.aK[0].h()].i - 1) * this.am[0][this.aK[0].h()].h - this.am[0][this.aK[0].h()].f;
                           if (Utlis.a(this.am[0][this.aK[0].h()].cx, this.am[0][this.aK[0].h()].cy, this.am[0][this.aK[0].h()].cx + this.am[0][this.aK[0].h()].width, this.am[0][this.aK[0].h()].cy + this.am[0][this.aK[0].h()].height, var5, var3) && Utlis.a(this.am[0][this.aK[0].h()].cx, this.am[0][this.aK[0].h()].cy, this.am[0][this.aK[0].h()].cx + this.am[0][this.aK[0].h()].width, this.am[0][this.aK[0].h()].cy + this.am[0][this.aK[0].h()].height, var5 + 40, var3 + 15)) {
                              var1.addElement(new vdtt_hi(1400 + var4, var5, var3, var5 + 40, 15 + var3, this.am[0][this.aK[0].h()], this));
                           }
                        } else if (var4 == this.ax.length - 2) {
                           var3 = this.am[0][this.aK[0].h()].cy + (this.am[0][this.aK[0].h()].i - 2) * this.am[0][this.aK[0].h()].h - this.am[0][this.aK[0].h()].f;
                           if (Utlis.a(this.am[0][this.aK[0].h()].cx, this.am[0][this.aK[0].h()].cy, this.am[0][this.aK[0].h()].cx + this.am[0][this.aK[0].h()].width, this.am[0][this.aK[0].h()].cy + this.am[0][this.aK[0].h()].height, var5, var3) && Utlis.a(this.am[0][this.aK[0].h()].cx, this.am[0][this.aK[0].h()].cy, this.am[0][this.aK[0].h()].cx + this.am[0][this.aK[0].h()].width, this.am[0][this.aK[0].h()].cy + this.am[0][this.aK[0].h()].height, var5 + 40, var3 + 15)) {
                              var1.addElement(new vdtt_hi(1400 + var4, var5, var3, var5 + 40, 15 + var3, this.am[0][this.aK[0].h()], this));
                           }
                        }
                     }
                  } else if (this.aK[0].h() == 2) {
                     var5 = this.am[0][this.aK[0].h()].cx + this.am[0][this.aK[0].h()].width - 40;

                     for(var4 = 0; var4 < this.av.length; ++var4) {
                        if (var4 == this.av.length - 1) {
                           var3 = this.am[0][this.aK[0].h()].cy + (this.am[0][this.aK[0].h()].i - 1) * this.am[0][this.aK[0].h()].h - this.am[0][this.aK[0].h()].f;
                           if (Utlis.a(this.am[0][this.aK[0].h()].cx, this.am[0][this.aK[0].h()].cy, this.am[0][this.aK[0].h()].cx + this.am[0][this.aK[0].h()].width, this.am[0][this.aK[0].h()].cy + this.am[0][this.aK[0].h()].height, var5, var3) && Utlis.a(this.am[0][this.aK[0].h()].cx, this.am[0][this.aK[0].h()].cy, this.am[0][this.aK[0].h()].cx + this.am[0][this.aK[0].h()].width, this.am[0][this.aK[0].h()].cy + this.am[0][this.aK[0].h()].height, var5 + 40, var3 + 15)) {
                              var1.addElement(new vdtt_hi(1400 + var4, var5, var3, var5 + 40, 15 + var3, this.am[0][this.aK[0].h()], this));
                           }
                        } else if (var4 == this.av.length - 2) {
                           var3 = this.am[0][this.aK[0].h()].cy + (this.am[0][this.aK[0].h()].i - 2) * this.am[0][this.aK[0].h()].h - this.am[0][this.aK[0].h()].f;
                           if (Utlis.a(this.am[0][this.aK[0].h()].cx, this.am[0][this.aK[0].h()].cy, this.am[0][this.aK[0].h()].cx + this.am[0][this.aK[0].h()].width, this.am[0][this.aK[0].h()].cy + this.am[0][this.aK[0].h()].height, var5, var3) && Utlis.a(this.am[0][this.aK[0].h()].cx, this.am[0][this.aK[0].h()].cy, this.am[0][this.aK[0].h()].cx + this.am[0][this.aK[0].h()].width, this.am[0][this.aK[0].h()].cy + this.am[0][this.aK[0].h()].height, var5 + 40, var3 + 15)) {
                              var1.addElement(new vdtt_hi(1400 + var4, var5, var3, var5 + 40, 15 + var3, this.am[0][this.aK[0].h()], this));
                           }
                        } else if (this.am[0][this.aK[0].h()].b(6 + var4)) {
                           var3 = this.am[0][this.aK[0].h()].cy + (6 + var4) * this.am[0][this.aK[0].h()].h - this.am[0][this.aK[0].h()].f;
                           if (Utlis.a(this.am[0][this.aK[0].h()].cx, this.am[0][this.aK[0].h()].cy, this.am[0][this.aK[0].h()].cx + this.am[0][this.aK[0].h()].width, this.am[0][this.aK[0].h()].cy + this.am[0][this.aK[0].h()].height, var5, var3) && Utlis.a(this.am[0][this.aK[0].h()].cx, this.am[0][this.aK[0].h()].cy, this.am[0][this.aK[0].h()].cx + this.am[0][this.aK[0].h()].width, this.am[0][this.aK[0].h()].cy + this.am[0][this.aK[0].h()].height, var5 + 40, var3 + 15)) {
                              var1.addElement(new vdtt_hi(1400 + var4, var5, var3, var5 + 40, 15 + var3, this.am[0][this.aK[0].h()], this));
                           }
                        }
                     }
                  }

                  var1.addElement(this.am[0][this.aK[0].h()].a(999, this));
               }
               break;
            case 1:
               for(var5 = 0; var5 < this.aJ[this.an.b.b].length; ++var5) {
                  var1.addElement(this.aJ[this.an.b.b][var5].a(1020 + var5, this));
               }

               if (this.U.arrItemBody[0] != null) {
                  var1.addElement(this.am[this.an.b.b][0].a(1230, this));
                  if (GameSrc.gI().idTask != 1 || GameSrc.gI().idStep != 0) {
                     var5 = this.an.cx + 16;
                     var3 = this.an.cy + 7 + 5;

                     for(var4 = 0; var4 < this.bd.length; ++var4) {
                        var1.add(new vdtt_hi(5000 + var4, var5 + this.bd[var4].cx, var3 + this.bd[var4].cy, var5 + this.bd[var4].cx + 28, var3 + this.bd[var4].cy + 28, (vdtt_hp)null, this));
                     }

                     if (this.aI >= 0) {
                        var1.add(new vdtt_hi(2105, this.am[this.an.b.b][0].cx + this.am[this.an.b.b][0].width, this.am[this.an.b.b][0].cy, this.am[this.an.b.b][0].cx + this.am[this.an.b.b][0].width + 65, this.am[this.an.b.b][0].cy + this.am[this.an.b.b][0].height, (vdtt_hp)null, this));
                     } else {
                        var1.add(new vdtt_hi(2105, this.am[this.an.b.b][0].cx + this.am[this.an.b.b][0].width, this.am[this.an.b.b][0].cy, this.am[this.an.b.b][0].cx + this.am[this.an.b.b][0].width + 42, this.am[this.an.b.b][0].cy + this.am[this.an.b.b][0].height, (vdtt_hp)null, this));
                     }

                     var1.add(new vdtt_hi(2104, 4, this.f(), 4 + (super.width - 8), this.f() + this.h(), (vdtt_hp)null, this));
                  }
               }
               break;
            case 2:
               if (this.F() || !this.F() && !this.W.m) {
                  var1.addElement(this.am[this.an.b.b][0].a(1030, this));
                  if (GameSrc.gI().idTask != 1 || GameSrc.gI().idStep != 0) {
                     var5 = this.an.cx + 16;
                     var3 = this.an.cy + 7 + 5;

                     for(var4 = 0; var4 < this.bc.length; ++var4) {
                        var1.add(new vdtt_hi(4000 + var4, var5 + this.bc[var4].cx, var3 + this.bc[var4].cy, var5 + this.bc[var4].cx + 28, var3 + this.bc[var4].cy + 28, (vdtt_hp)null, this));
                     }
                  }
               }
            }
         }

         return var1;
      }
   }

   public final void a(vdtt_by var1) {
      vdtt_by var2;
      int var3;
      if (var1.equals(this.aL[0])) {
         var2 = this.aL[0];
         var3 = this.aL[0].h() + this.S;
         var2.S = var3;
      } else if (var1.equals(this.aL[1])) {
         var2 = this.aL[1];
         var3 = this.aL[1].h() + this.S;
         var2.S = var3;
      } else if (var1.equals(this.aL[2])) {
         var2 = this.aL[2];
         var3 = this.aL[2].h() + this.S;
         var2.S = var3;
      } else if (var1.equals(this.aL[3])) {
         var2 = this.aL[3];
         var3 = this.aL[3].h() + this.S;
         var2.S = var3;
      }

   }

   private static void m(int var0) {
      try {
         Message var1;
         (var1 = Message.c((byte)8)).writeByte(var0);
         var1.send();
      } catch (Exception var2) {
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      super.b(var1, var2, var3);

      try {
         Message var4;
         switch(var1) {
         case 1002:
            DataCenter.gI().currentScreen.c(Caption.xB + (this.ar.n.b + 1), -2560);
            (var4 = Message.c((byte)19)).writeByte(this.ar.n.b);
            var4.send();
         default:
            return;
         case 1234:
            (var4 = Message.c((byte)-109)).writeBoolean(this.W.m);
            var4.send();
            break;
         case 2110:
         case 2111:
         case 2112:
         case 2113:
         case 2114:
         case 2116:
         case 2117:
            m(var1 - 2110);
            break;
         case 2115:
            if ((var1 = 150 * (Char.gI().y() / 10000000)) < 150) {
               var1 = 150;
            } else if (var1 > 1500) {
               var1 = 1500;
            }

            DataCenter.gI().currentScreen.a(Utlis.b(Caption.wY, Utlis.c(var1)), 2107, this);
         }
      } catch (Exception var5) {
      }

   }

   public final void b(vdtt_by var1) {
      int var2;
      if ((var2 = var1.h()) > var1.S) {
         var1.a("" + var1.S);
      }

      if (var2 < var1.R) {
         var1.a("" + var1.R);
      }

      this.S = this.T - (this.aL[0].h() - this.O + (this.aL[1].h() - this.P) + (this.aL[2].h() - this.R) + (this.aL[3].h() - this.Q));
   }

   public final void H() {
      this.g(this.al);
   }

   public final void I() {
      this.K();
      if (this.aI < 0) {
         this.J();
      } else {
         this.j(this.aI);
      }

   }

   public final void h(int var1) {
      if (this.F()) {
         String var2 = Caption.BQ[var1];
         this.aU.l = var2;
      }

   }
}
