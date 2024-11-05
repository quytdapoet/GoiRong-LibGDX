package gro;

import java.util.Vector;

public final class vdtt_kf extends vdtt_ka {
   public Item[] S;
   public int T;
   public int U;
   public Vector V = new Vector();
   public Vector W = new Vector();
   public Vector X = new Vector();
   public Vector Y = new Vector();
   public Vector Z = new Vector();
   public String aa;
   public vdtt_gg ab;
   private vdtt_hp[][] aj;
   private vdtt_hq ak;
   private vdtt_in al;
   private int am;
   public vdtt_hq ac;
   public vdtt_hp[] ad;
   public vdtt_ay[] ae;
   private String an;
   private String ao;
   private int ap;
   private int aq;
   private int ar;
   private int as;
   private long at;
   private String[] au;
   private int av;
   private int aw;
   private int ax;
   private int ay;
   private Vector az;
   private vdtt_bb aA;
   private vdtt_bb aB;
   private vdtt_bb aC;
   private int aD;
   private String aE;
   private int aF;
   private vdtt_ir[] aG;
   private vdtt_ay aH;
   private vdtt_ay aI;
   private vdtt_ay aJ;
   private vdtt_ay aK;
   private vdtt_ay aL;
   private vdtt_ay aM;
   private vdtt_ay aN;
   private vdtt_ay aO;
   private Vector aP;
   private boolean aQ;
   private boolean aR;
   private boolean aS;
   public int af;
   public int ag;
   private int aT;
   private int aU;
   private int aV;
   private XYEntity[] aW;
   public int ah;
   public int ai;
   private static int aX;

   public vdtt_kf(MainScreen var1, Message var2) {
      super(var1, 3, Caption.zg);
      this.an = Caption.md;
      this.ao = "";
      this.au = new String[0];
      this.az = new Vector();
      this.aP = new Vector();
      this.af = 93;
      this.ag = 50;
      this.aT = -1;
      this.aU = -1;
      this.aV = 14;
      this.H = var1;
      this.J = false;
      this.a(299, 220);
      vdtt_hm var3;
      (var3 = new vdtt_hm(1001)).c = Caption.zg;
      this.ab = new vdtt_gg(var3, this.width, 1, this.f() - 3, 87, this.h() + 6, 33, this);
      this.ab.h = true;
      this.aA = this.a(this.ab.cx + 11, this.f() + this.h() - 21, Caption.gX, 100);
      vdtt_bb var4 = this.aA;
      boolean var5 = Binary.g("clan" + Char.gI().idEntity);
      var4.m = var5;
      this.ab.a((vdtt_k)this.aA, 1);
      this.a(this.aA, 0);
      this.aB = this.a(this.ab.cx + 102, this.f() + this.h() - 21, Caption.qs, 101);
      var5 = true;
      this.aB.m = var5;
      var5 = true;
      this.aB.d = var5;
      this.ab.a((vdtt_k)this.aB, 1);
      this.a(this.aB, 0);
      this.aC = this.a(this.ab.cx + 102, this.f() + this.h() - 21, Caption.wB, 102);
      var4 = this.aC;
      var5 = mConfig.gI().a(32);
      var4.m = var5;
      this.ab.a((vdtt_k)this.aC, 1);
      this.a(this.aC, 0);
      this.aH = this.a(this.width - 57, this.height - 30, Caption.eR, this, 61, -8);
      this.ab.a((vdtt_k)this.aH, 0);
      this.a(this.aH, 0);
      this.aI = this.a(this.width - 110, this.height - 30, Caption.eS, this, 62, -8);
      this.ab.a((vdtt_k)this.aI, 0);
      this.a(this.aI, 0);
      this.aJ = this.a(this.width - 163, this.height - 30, Caption.eT, this, 60, -8);
      this.ab.a((vdtt_k)this.aJ, 0);
      this.a(this.aJ, 0);
      this.aK = this.a(this.width - 216, this.height - 30, Caption.eU, this, 63, -8);
      this.ab.a((vdtt_k)this.aK, 0);
      this.a(this.aK, 0);
      this.aM = this.a(this.width - 110, this.height - 30, Caption.eB, this, 64, -8);
      this.ab.a((vdtt_k)this.aM, 0);
      this.a(this.aM, 0);
      this.aN = this.a(this.width - 110, this.height - 30, Caption.ve, this, 66, -8);
      this.ab.a((vdtt_k)this.aN, 0);
      this.a(this.aN, 0);
      this.aO = this.a(this.width - 110, this.height - 30, Caption.L, this, 66, -8);
      this.ab.a((vdtt_k)this.aO, 0);
      this.a(this.aO, 0);
      this.aP.add(this.aK);
      this.aP.add(this.aI);
      this.aP.add(this.aH);
      this.aP.add(this.aM);
      this.aP.add(this.aJ);
      this.aP.add(this.aN);
      this.aP.add(this.aO);
      this.aj = new vdtt_hp[var3.c.length][];
      this.aL = new vdtt_ay(this.width - 98, this.height - 69, 0, 0, Caption.nt, this, 3001, 7);
      this.aL.setSize(50, 20);
      this.ab.a((vdtt_k)this.aL, 2);
      this.aW = new XYEntity[this.aV];
      int var6 = this.aV % 4;
      int var7 = (this.aV - 4) / 4;
      byte var8 = 0;
      byte var9 = 0;
      switch(this.aV) {
      case 10:
         var8 = 83;
         var9 = 80;
      case 11:
      case 13:
      default:
         break;
      case 12:
         var8 = 83;
         var9 = 54;
         break;
      case 14:
         var8 = 62;
         var9 = 54;
      }

      byte var10 = 0;
      this.aW[0] = XYEntity.create(0, 0);
      int var11 = var10 + 1;

      int var12;
      for(var12 = 0; var12 < var7 + var6 / 2; ++var12) {
         this.aW[var11] = XYEntity.create(var11 * var8, 0);
         ++var11;
      }

      this.aW[var11] = XYEntity.create((var7 + var6 / 2 + 1) * var8, 0);
      ++var11;

      for(var12 = 0; var12 < var7; ++var12) {
         this.aW[var11] = XYEntity.create((var7 + var6 / 2 + 1) * var8, (var12 + 1) * var9);
         ++var11;
      }

      this.aW[var11] = XYEntity.create((var7 + var6 / 2 + 1) * var8, (var7 + 1) * var9);
      ++var11;

      for(var12 = var7 - 1 + var6 / 2; var12 >= 0; --var12) {
         this.aW[var11] = XYEntity.create((var12 + 1) * var8, (var7 + 1) * var9);
         ++var11;
      }

      this.aW[var11] = XYEntity.create(0, (var7 + 1) * var9);
      ++var11;

      for(var12 = var7 - 1; var12 >= 0; --var12) {
         this.aW[var11] = XYEntity.create(0, (var12 + 1) * var9);
         ++var11;
      }

      this.al = new vdtt_in(new vdtt_hm(200, Caption.zY), this);
      this.a(this.aI, 0);
      this.b(var2);
      this.ab.a(GameSrc.gI().cx_);
      this.f(aX);
   }

   private int D() {
      return 500 + this.ap * 100;
   }

   public final void b(Message var1) {
      try {
         this.V.clear();
         this.az.clear();
         this.X.clear();
         this.Y.clear();
         this.Z.clear();
         this.an = var1.reader.readUTF();
         this.ao = var1.reader.readUTF();
         this.at = var1.readLong();
         this.ap = var1.readShort();
         this.aq = var1.readInt();
         this.ar = var1.readInt();
         this.as = var1.readInt();
         this.T = var1.readInt();
         this.au = vdtt_dd.c(vdtt_dd.d, var1.reader.readUTF(), this.width - 30);
         this.av = var1.readByte();
         this.aw = var1.readShort();
         this.ax = var1.readInt();
         this.ay = var1.readShort();
         this.aR = var1.readBoolean();
         this.aS = var1.readBoolean();
         this.ah = var1.readByte();
         this.ai = var1.readByte();
         short var2 = var1.readShort();

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            Member var4;
            (var4 = new Member()).i = var1.readByte();
            var4.b = var1.readByte();
            byte var5 = var1.readByte();
            var4.c = var5;
            var4.d = var1.readShort();
            var4.name = var1.reader.readUTF();
            var4.j = var1.readInt();
            var4.k = var1.readInt();
            var4.l = var1.readBoolean();
            var4.m = var1.readBoolean();
            this.V.addElement(var4);
            if (var4.name.toLowerCase().equals(Char.gI().name.toLowerCase())) {
               this.U = var4.i;
            }
         }

         var2 = var1.readShort();

         for(var3 = 0; var3 < var2; ++var3) {
            String var7 = "- " + var1.readUTF();
            this.az.addAll(vdtt_dd.b(vdtt_dd.d, var7, super.width - 8 - 36));
         }

         var2 = var1.readShort();

         for(var3 = 0; var3 < var2; ++var3) {
            Item var8;
            (var8 = new Item()).a(var1);
            this.X.add(var8);
         }

         var2 = var1.reader.readUnsignedByte();

         for(var3 = 0; var3 < var2; ++var3) {
            this.Y.add(Integer.valueOf(var1.readByte()));
            this.Z.add(var1.readInt());
         }
      } catch (Exception var6) {
      }

      this.am = 14;
      this.aj[0] = new vdtt_hp[3];
      this.aj[0][0] = new vdtt_hp((byte)1, this.ab.cx + 7, this.ab.cy + 7 + 34, super.width - 8 - 15, this.am * 10, this.am, 10);
      this.aj[0][1] = new vdtt_hp((byte)1, this.ab.cx + 7, this.ab.cy + 7 + 34, super.width - 8 - 15, this.am * 10, this.am, this.au.length);
      this.aj[0][2] = new vdtt_hp((byte)1, 4, this.ab.cy + 7 + 34, super.width - 8, this.am * 11, this.am, this.az.size());
      this.E();
      this.am = 26;
      this.F();
      this.ak = new vdtt_hq((byte)1, this.ab.cx + 6, this.ab.cy + 7 + 31, 288, 160, 32, Utlis.c(this.X.size() < 45 ? 45 : this.X.size(), 9), 9);
      this.aE = Caption.ej;
      this.aD = -7812062;
      if (this.U == 5) {
         this.aE = Caption.ek;
         this.aD = -2560;
      } else if (this.U == 4) {
         this.aE = Caption.el;
         this.aD = -3407617;
      } else if (this.U == 4) {
         this.aE = Caption.em;
         this.aD = -48128;
      }

   }

   private void E() {
      this.W.clear();
      if (this.aA.m) {
         for(int var1 = 0; var1 < this.V.size(); ++var1) {
            Member var2;
            if ((var2 = (Member)this.V.elementAt(var1)).l) {
               this.W.add(var2);
            }
         }
      } else {
         this.W.addAll(this.V);
      }

      Binary.a("clan" + Char.gI().idEntity, this.aA.m);
      this.aj[1] = new vdtt_hp[1];
      if (!this.aB.m) {
         this.am = 50;
         this.aj[1][0] = new vdtt_hp((byte)1, this.ab.cx + 10, this.ab.cy + 7 + 3, super.width - 8 - 14, this.am * 3, this.am, this.W.size());
      } else {
         this.am = 30;
         this.aj[1][0] = new vdtt_hp((byte)1, this.ab.cx + 10, this.ab.cy + 7 + 3, super.width - 8 - 14, this.am * 6, this.am, this.W.size());
      }

   }

   public final void a(Item var1) {
      this.H.a((vdtt_w)(new vdtt_js(this.H, var1, (byte)0, this)));
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (super.a.b < this.w()) {
         if (this.ac != null && this.ab.b.b == 0 && this.al.h() == 4) {
            if (var1.b >= 3000) {
               this.aT = var1.b - 3000;
               this.k = c(this, var1, this.S[this.aT]);
               return;
            }

            if (var1.b >= 2000) {
               this.aU = var1.b - 2000;
               this.a(this.S[this.aU]);
               return;
            }
         } else if (var1.b >= 1011 && var1.b < 1011 + this.aW.length) {
            this.aF = var1.b - 1011;
            this.F();
            return;
         }

         int var4;
         vdtt_kf var5;
         SkillClan var6;
         Message var7;
         switch(var1.b) {
         case 60:
            GameSrc.gI().a((vdtt_w)(new vdtt_mp(this.H)));
            return;
         case 61:
            GameSrc.gI().a((vdtt_w)(new vdtt_kw(this.H)));
            return;
         case 62:
            GameSrc.gI().a((vdtt_w)(new vdtt_lz(this.H, this.T)));
            return;
         case 63:
            this.a(true);
            return;
         case 64:
            DataCenter.gI().currentScreen.a(Caption.vh, 2005, this);
            return;
         case 66:
            try {
               if (GameSrc.gI().getMapTemplate().type == 8) {
                  DataCenter.gI().currentScreen.c(Caption.vg + GameSrc.gI().getMapTemplate().name, -1);
                  return;
               }

               Message.c((byte)-10).send();
               return;
            } catch (Exception var19) {
               break;
            }
         case 200:
            if (var1.j.k >= 0) {
               var3 = var1.j.k;
               var5 = this;

               try {
                  var5.al.a(var3);
                  if (!var5.aQ && var3 == 4) {
                     var5.aQ = true;
                     GameSrc.gI().Z.clear();
                     GameSrc.gI();
                     GameSrc.o(41);
                  }
               } catch (Exception var18) {
                  return;
               }
            }
            break;
         case 1001:
            if (var1.j.k >= 0) {
               GameSrc.gI().cx_ = (byte)var1.j.k;
               this.ab.a(var1.j.k);
               return;
            }
            break;
         case 1004:
            var4 = var3 - 72;
            Vector var8 = new Vector();
            if (this.U == 5) {
               var8.addElement(new vdtt_ir(60, Caption.eR));
               var8.addElement(new vdtt_ir(61, Caption.eS));
               var8.addElement(new vdtt_ir(62, Caption.eT));
            } else if (this.U == 4) {
               var8.addElement(new vdtt_ir(60, Caption.eR));
               var8.addElement(new vdtt_ir(62, Caption.eT));
               var8.addElement(new vdtt_ir(63, Caption.eU));
            } else {
               var8.addElement(new vdtt_ir(62, Caption.eT));
               var8.addElement(new vdtt_ir(63, Caption.eU));
            }

            if (var8.size() > 0) {
               String[] var22 = new String[var8.size()];
               short[] var24 = new short[var8.size()];

               for(int var25 = 0; var25 < var8.size(); ++var25) {
                  vdtt_ir var26 = (vdtt_ir)var8.elementAt(var25);
                  var22[var25] = var26.b;
                  var24[var25] = (short)var26.a;
               }

               if (var8.size() == 2) {
                  var4 += 15;
               }

               this.k = a(this, var2 + 5, var4, new vdtt_hm(0, var24, var22));
            }

            return;
         case 1010:
            if (var1.j.k >= 0) {
               int var21 = var3;
               var3 = var1.j.k;
               Vector var23 = new Vector();
               Member var11 = this.g(var3);
               String var12 = "";
               if (!var11.name.equals(Char.gI().name)) {
                  if (this.U == 5) {
                     if (var11.i > 0) {
                        var23.addElement(new vdtt_ir(55, Caption.eJ));
                     } else {
                        var23.addElement(new vdtt_ir(65, Caption.qm));
                        var23.addElement(new vdtt_ir(56, Caption.eK));
                        var23.addElement(new vdtt_ir(57, Caption.eL));
                     }

                     var23.addElement(new vdtt_ir(58, Caption.eM));
                     var23.addElement(new vdtt_ir(59, Caption.eN));
                  } else if (this.U == 4 && var11.i <= 3) {
                     if (var11.i > 0) {
                        var23.addElement(new vdtt_ir(55, Caption.eJ));
                     } else {
                        var23.addElement(new vdtt_ir(57, Caption.eL));
                     }

                     var23.addElement(new vdtt_ir(58, Caption.eM));
                  }

                  if (this.U > 0 && this.U > var11.i) {
                     if (var11.m) {
                        var23.addElement(new vdtt_ir(64, Caption.eO));
                     } else {
                        var23.addElement(new vdtt_ir(64, Caption.eP));
                     }
                  }

                  var12 = a(var23, var11.name);
               }

               this.a(var23, var12, var3, var2, var21);
               return;
            }
            break;
         case 1100:
            return;
         case 2001:
            var5 = this;

            try {
               if (var5.aa != null) {
                  Message var20;
                  (var20 = Message.c((byte)-97)).writeUTF(var5.aa);
                  var20.send();
               }
               break;
            } catch (Exception var17) {
               return;
            }
         case 2002:
            this.a(false);
            return;
         case 2003:
            var5 = this;

            try {
               var6 = DataCenter.gI().skillClan[var5.aF];
               (var7 = Message.c((byte)-68)).writeByte(var6.a);
               var7.send();
               break;
            } catch (Exception var16) {
               return;
            }
         case 2004:
            boolean var9 = true;
            var5 = this;

            try {
               (var7 = Message.c((byte)-99)).writeUTF(var5.aa);
               var7.writeByte(5);
               var7.send();
               break;
            } catch (Exception var15) {
               return;
            }
         case 2005:
            try {
               Message.c((byte)-12).send();
               break;
            } catch (Exception var14) {
               return;
            }
         case 3001:
            var5 = this;

            try {
               if (var5.U == 5) {
                  var6 = DataCenter.gI().skillClan[var5.aF];
                  if (var5.T < var6.g) {
                     DataCenter.gI().currentScreen.c(Caption.nu, -65536);
                  } else if (var5.ap < var6.d) {
                     DataCenter.gI().currentScreen.c(Caption.nw, -65536);
                  } else {
                     DataCenter.gI().currentScreen.a(Utlis.b(Caption.nv, Utlis.c(var6.g)), 2003, var5);
                  }
               }
               break;
            } catch (Exception var13) {
               return;
            }
         case 5001:
            var4 = var1.j.k;
            vdtt_hp var10 = var1.j;
            this.ak.k = -1;
            var10.k = var4;
            if (var1.j.k >= 0 && var1.j.k < this.X.size()) {
               this.k = a(var1, this, (Item)this.X.get(var1.j.k));
               return;
            }
         }
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      super.b(var1, var2, var3);
      if (super.a.b < this.w()) {
         this.c(var1, var2);
         vdtt_kf var4;
         vdtt_hm var5;
         Member var6;
         switch(var1) {
         case 54:
            var5 = (vdtt_hm)var2;
            var4 = this;

            try {
               var6 = var4.g(var5.a);
               GameSrc.gI().h(var6.name);
               break;
            } catch (Exception var12) {
               Utlis.a(var12);
               return;
            }
         case 55:
            this.a((vdtt_hm)var2, 0);
            return;
         case 56:
            this.a((vdtt_hm)var2, 4);
            return;
         case 57:
            this.a((vdtt_hm)var2, 3);
            return;
         case 58:
            var5 = (vdtt_hm)var2;
            var4 = this;

            try {
               var6 = var4.g(var5.a);
               var4.aa = var6.name;
               DataCenter.gI().currentScreen.a(Caption.eH + var4.aa + Caption.eI, 2001, var4);
               break;
            } catch (Exception var11) {
               return;
            }
         case 59:
            var5 = (vdtt_hm)var2;
            var4 = this;

            try {
               var6 = var4.g(var5.a);
               GameSrc.gI().a((vdtt_w)(new vdtt_ls(var4.H, var6.name)));
               break;
            } catch (Exception var10) {
               return;
            }
         case 64:
            var5 = (vdtt_hm)var2;
            var4 = this;

            try {
               var6 = var4.g(var5.a);
               Message var7;
               (var7 = Message.c((byte)-91)).writeUTF(var6.name);
               var7.send();
               break;
            } catch (Exception var9) {
               return;
            }
         case 65:
            var5 = (vdtt_hm)var2;
            var4 = this;

            try {
               var6 = var4.g(var5.a);
               var4.aa = var6.name;
               DataCenter.gI().currentScreen.a(Utlis.b(Caption.qn, var4.aa), 2004, var4);
               break;
            } catch (Exception var8) {
               return;
            }
         case 100:
         case 101:
            this.E();
            return;
         case 102:
            mConfig.gI().a(32, this.aC.m);
         }
      }

   }

   private void a(boolean var1) {
      try {
         if (var1) {
            DataCenter.gI().currentScreen.a(Caption.eG, 2002, this);
         } else {
            Message.c((byte)-96).send();
         }
      } catch (Exception var3) {
      }

   }

   private void a(vdtt_hm var1, int var2) {
      try {
         Member var3 = this.g(var1.a);
         Message var4;
         (var4 = Message.c((byte)-99)).writeUTF(var3.name);
         var4.writeByte(var2);
         var4.send();
      } catch (Exception var5) {
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b < this.w()) {
         int var2;
         int var3;
         int var4;
         switch(this.ab.b.b) {
         case 0:
            var1.addElement(this.al.f());
            if (this.al.h() == 4) {
               if (this.ac != null) {
                  for(var4 = 0; var4 < this.ae.length; ++var4) {
                     var2 = this.ac.cx + this.ae[var4].cx;
                     var3 = this.ac.cy + this.ae[var4].cy - this.ac.f;
                     if (Utlis.a(this.ac.cx, this.ac.cy, this.ac.cx + this.ac.width, this.ac.cy + this.ac.height, var2, var3) && Utlis.a(this.ac.cx, this.ac.cy, this.ac.cx + this.ac.width, this.ac.cy + this.ac.height, var2 + this.ae[var4].width, var3 + this.ae[var4].height)) {
                        this.ad[var4].cx = (short)var2;
                        this.ad[var4].cy = (short)var3;
                        if (this.U == 5 || this.S[var4].d() == -32) {
                           var1.addElement(new vdtt_hi(2000 + var4, this.ad[var4].cx, this.ad[var4].cy, this.ad[var4].cx + this.ad[var4].width, this.ad[var4].cy + this.ad[var4].height, this.ad[var4], this));
                        }

                        var1.addElement(new vdtt_hi(3000 + var4, var2 - 35, var3 - 9, var2 - 35 + 28, var3 - 9 + 28, this.ac, this));
                     }
                  }

                  var1.addElement(new vdtt_hi(1002, this.ac.cx, this.ac.cy, this.ac.cx + this.ac.width, this.ac.cy + this.ac.height, this.ac, this));
               }
            } else if (this.al.h() == 3) {
               var1.addElement(this.ak.a(5001, this));
            } else {
               var1.addElement(this.aj[0][this.al.h()].a(1003, this));
            }
            break;
         case 1:
            var1.addElement(this.aj[this.ab.b.b][0].a(1010, this));
            break;
         case 2:
            var1.addElement(this.aj[2][0].a(1100, this));
            var2 = this.ab.cx + 9;
            var3 = this.ab.cy + 7 + 5;

            for(var4 = 0; var4 < this.aW.length; ++var4) {
               var1.add(new vdtt_hi(1011 + var4, var2 + this.aW[var4].cx, var3 + this.aW[var4].cy, var2 + this.aW[var4].cx + 28, var3 + this.aW[var4].cy + 28, (vdtt_hp)null, this));
            }
         }
      }

      return var1;
   }

   public final void b(Graphics var1) {
      super.b(var1);
      if (super.a.b < this.w()) {
         switch(this.ab.b.b) {
         case 0:
            Graphics var2 = var1;
            vdtt_kf var3 = this;
            this.al.a(var1);
            int var4;
            int var5;
            int var6;
            switch(this.al.h()) {
            case 0:
               this.a(var1, this.aj[0][this.al.h()]);
               vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, Caption.eX + this.an, 6, 7 + 0 * this.aj[0][this.al.h()].h, 0, -1, 0);
               if (this.aw > 0) {
                  vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, Utlis.b(Caption.um, Utlis.g((long)this.ax * 1000L)), this.width - 25, 7 + 0 * this.aj[0][this.al.h()].h, 1, -1, 0);
                  vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, Utlis.a(Caption.id, (long)(this.aw - 724)), this.width - 50, 7 + 1 * this.aj[0][this.al.h()].h, 1, -1, 0);
                  vdtt_cz.a(var1, this.aw + 12, 0, this.width - 44, 12 + 0 * this.aj[0][this.al.h()].h, 0);
               }

               if ((var4 = this.ar) == 0) {
                  var4 = 1;
               }

               vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, Caption.eZ + this.ap + ", " + Caption.fa + Utlis.c(this.aq) + "/" + Utlis.c(this.ar) + " (" + this.aq * 100 / var4 + "%)", 6, 7 + 1 * this.aj[0][this.al.h()].h, 0, -1, 0);
               String var7 = Caption.eV + Utlis.c(this.as) + "/" + Utlis.c(this.D());
               vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, var7, 6, 7 + 2 * this.aj[0][this.al.h()].h, 0, -1, 0);
               if (Char.gI().giatoc != null) {
                  var5 = this.D();
                  if (this.as >= var5) {
                     vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, "(" + Caption.fc + ")", vdtt_dd.b(vdtt_dd.d, var7) + 10, 6 + 2 * this.aj[0][this.al.h()].h, 0, -2560, 0);
                  } else {
                     vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, "(" + Caption.fb + ")", vdtt_dd.b(vdtt_dd.d, var7) + 10, 6 + 2 * this.aj[0][this.al.h()].h, 0, -48128, 0);
                  }
               }

               vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, Caption.fd + this.V.size() + "/" + (20 + this.ap), 6, 7 + 3 * this.aj[0][this.al.h()].h, 0, -1, 0);
               vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, Caption.fe + Utlis.c(this.T) + Caption.fh, 6, 7 + 4 * this.aj[0][this.al.h()].h, 0, -1, 0);
               vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, Caption.sp + this.aE, 6, 7 + 5 * this.aj[0][this.al.h()].h, 0, -1, 0);
               if (Char.gI().giatoc != null) {
                  vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, Caption.fg + Utlis.e(this.at), 6, 7 + 6 * this.aj[0][this.al.h()].h, 0, -1, 0);
               } else {
                  vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, Caption.fg, 6, 7 + 6 * this.aj[0][this.al.h()].h, 0, -1, 0);
               }

               vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, Caption.up + this.ay, 6, 7 + 7 * this.aj[0][this.al.h()].h, 0, -1, 0);
               vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, Utlis.a(Caption.uZ, (long)this.av), 6, 7 + 8 * this.aj[0][this.al.h()].h, 0, -1, 0);
               if (this.aS) {
                  vdtt_dd.c(vdtt_dd.d, var1, Caption.vf, 6, 7 + 9 * this.aj[0][this.al.h()].h, 0, -7812062, 0);
               } else if (this.ah >= 0 && this.ai >= 0) {
                  vdtt_dd.c(vdtt_dd.d, var1, Caption.ff + this.ah + " " + Caption.lj + this.ai + " " + Caption.lk, 6, 7 + 9 * this.aj[0][this.al.h()].h, 0, -1, 0);
               } else {
                  vdtt_dd.c(vdtt_dd.d, var1, Caption.vd, 6, 7 + 9 * this.aj[0][this.al.h()].h, 0, -1, 0);
               }

               this.a(var1);
               this.aj[0][this.al.h()].a(var1, this);
               return;
            case 1:
               this.a(var1, this.aj[0][this.al.h()]);

               for(var5 = 0; var5 < var3.au.length; ++var5) {
                  vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var2, var3.au[var5], 6, 7 + var5 * var3.aj[0][var3.al.h()].h, 0, -1, 0);
               }

               var3.a(var2);
               var3.aj[0][var3.al.h()].a(var2, var3);
               return;
            case 2:
               this.a(var1, this.aj[0][this.al.h()]);

               for(var5 = 0; var5 < var3.az.size(); ++var5) {
                  var6 = var5 * var3.aj[0][var3.al.h()].h;
                  if (var3.aj[0][var3.al.h()].c(var6)) {
                     vdtt_dd.a(var2, (String)var3.az.get(var5), 7, 5 + var6, 0, -1);
                  }
               }

               var3.a(var2);
               var3.aj[0][var3.al.h()].a(var2, var3);
               return;
            case 3:
               this.a(var1, this.ak);

               for(var5 = 0; var5 < var3.ak.i; ++var5) {
                  for(var6 = 0; var6 < var3.ak.O; ++var6) {
                     if (var3.ak.b(var5)) {
                        if (var5 * var3.ak.O + var6 < var3.X.size()) {
                           b(var2, var6 * var3.ak.h, var5 * var3.ak.h, (Item)var3.X.get(var5 * var3.ak.O + var6), var5 * var3.ak.O + var6 == var3.ak.k);
                        } else {
                           b(var2, var6 * var3.ak.h, var5 * var3.ak.h, (Item)null, var5 * var3.ak.O + var6 == var3.ak.k);
                        }
                     }
                  }
               }

               var3.a(var2);
               vdtt_dd.b(vdtt_dd.b, var2, Caption.su, var3.width / 2, var3.ak.cy + var3.ak.height + 4, 2, -1, -10275328);
               var3.ak.b(var2, var3);
               return;
            case 4:
               if (this.ac != null) {
                  this.a(var1, this.ac);
                  var5 = 0;

                  for(int var8 = 0; var8 < var3.ac.i; ++var8) {
                     int var9 = var8 * var3.ag;

                     for(int var10 = 0; var10 < var3.ac.O; ++var10) {
                        var4 = var10 * var3.af;
                        if (var3.ac.b(var8)) {
                           var3.a(var2, var4, var9, var3.af - 3, 47, -11, 22, 23, 1, 1);
                           b(var2, var4 + 5, var9 + 5, var3.S[var5], var3.aT == var5);
                           var6 = var2.e;
                           int var11 = var2.f;
                           vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var2, Utlis.a(var3.S[var5].getItemTemplate().name, 24), var4 + 5, var9 + 39, 0, -1, -10275328);
                           var3.a(var2, var6 + var3.ae[var5].cx, var11 + var3.ae[var5].cy);
                           vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var2, Caption.aI + " " + Utlis.c(var3.S[var5].c()), 0, -6, 0, -1, -11184811);
                           if (var3.S[var5].d() == -32) {
                              var3.ae[var5].b(var3.S[var5].d());
                           }

                           var3.ae[var5].b(var2);
                           var3.a(var2, var6, var11);
                        }

                        ++var5;
                        if (var5 >= var3.ae.length) {
                           break;
                        }
                     }

                     if (var5 >= var3.ae.length) {
                        break;
                     }
                  }

                  var3.a(var2);
                  var3.ac.b(var2, var3);
               }
            default:
               return;
            }
         case 1:
            this.f(var1);
            return;
         case 2:
            this.g(var1);
         }
      }

   }

   private void f(Graphics var1) {
      this.a(var1, this.aj[1][0]);

      for(int var2 = 0; var2 < this.W.size(); ++var2) {
         Member var3 = (Member)this.W.get(var2);
         this.a(var1, 1, var2 * this.aj[1][0].h, this.aj[1][0].width - 2, this.aj[1][0].h - 2, 46, 22, 23, 1, 1);
         if (var2 == this.aj[this.ab.b.b][0].k) {
            vdtt_cz.a(var1, 2, var2 * this.aj[this.ab.b.b][0].h + 1, this.aj[this.ab.b.b][0].width - 4, this.aj[this.ab.b.b][0].h - 4);
         }

         int var4;
         int var5;
         String var6;
         if (!this.aB.m) {
            vdtt_y.a(var1, 92, 0, 22, var2 * this.aj[this.ab.b.b][0].h + 24, 86, (byte)3);
            vdtt_y.a(var1, var3.a(), 0, 22, var2 * this.aj[this.ab.b.b][0].h + 24, 83, (byte)3);
            if (var3.l) {
               vdtt_cz.a(var1, 302, 0, 5, var2 * this.aj[this.ab.b.b][0].h + 32, 20);
            } else {
               vdtt_cz.a(var1, 304, 0, 5, var2 * this.aj[this.ab.b.b][0].h + 32, 20);
            }

            if (var3.m) {
               vdtt_cz.a(var1, 455, 0, this.aj[this.ab.b.b][0].width - 10, var2 * this.aj[this.ab.b.b][0].h + 36, 3);
            }

            var4 = 46;
            var5 = var2 * this.aj[this.ab.b.b][0].h + 8;
            if (var2 == this.aj[this.ab.b.b][0].l && !var3.name.equals(Char.gI().name)) {
               ++var4;
               ++var5;
            }

            var6 = "";
            if (var3.i == 5) {
               var6 = " (" + Caption.ek + ")";
            } else if (var3.i == 4) {
               var6 = " (" + Caption.el + ")";
            } else if (var3.i == 3) {
               var6 = " (" + Caption.em + ")";
            }

            vdtt_dd.a(vdtt_dd.d, var1, Caption.zc[3] + " " + var3.name + var6, var4, var5, 0, -1);
            vdtt_dd.a(vdtt_dd.d, var1, Caption.zc[4] + " " + DataCenter.gI().dataNameChar[var3.b].name + ", " + Caption.zc[5] + " " + var3.d, var4, var5 + 10, 0, -1);
            vdtt_dd.a(vdtt_dd.d, var1, Caption.eV + " " + Utlis.c(var3.k), var4, var5 + 20, 0, -1);
            vdtt_dd.a(vdtt_dd.d, var1, Caption.eW + " " + Utlis.c(var3.j), var4, var5 + 30, 0, -1);
         } else {
            vdtt_y.a(var1, var3.a(), 0, 10, var2 * this.aj[this.ab.b.b][0].h + 8, 60, (byte)3);
            if (var3.l) {
               vdtt_cz.a(var1, 302, 0, 10, var2 * this.aj[this.ab.b.b][0].h + 20, 3);
            } else {
               vdtt_cz.a(var1, 304, 0, 10, var2 * this.aj[this.ab.b.b][0].h + 20, 3);
            }

            if (var3.m) {
               vdtt_cz.a(var1, 455, 0, this.aj[this.ab.b.b][0].width - 10, var2 * this.aj[this.ab.b.b][0].h + 17, 3);
            }

            var4 = 19;
            var5 = var2 * this.aj[this.ab.b.b][0].h + 8;
            if (var2 == this.aj[this.ab.b.b][0].l && !var3.name.equals(Char.gI().name)) {
               ++var4;
               ++var5;
            }

            var6 = "";
            if (var3.i == 5) {
               var6 = " (" + Caption.ek + ")";
            } else if (var3.i == 4) {
               var6 = " (" + Caption.el + ")";
            } else if (var3.i == 3) {
               var6 = " (" + Caption.em + ")";
            }

            vdtt_dd.a(vdtt_dd.d, var1, Caption.zc[3] + " " + var3.name + var6 + " " + Caption.zc[4] + " " + DataCenter.gI().dataNameChar[var3.b].name + ", " + Caption.zc[5] + " " + var3.d, var4, var5, 0, -1);
            vdtt_dd.a(vdtt_dd.d, var1, Caption.eV + " " + Utlis.c(var3.k) + " " + Caption.eW + " " + Utlis.c(var3.j), var4, var5 + 11, 0, -1);
         }
      }

      this.a(var1);
      this.aj[1][0].b(var1, this);
   }

   private void F() {
      if (this.aF >= 0 && this.aF < DataCenter.gI().skillClan.length) {
         this.a(this.aF, this.Y.contains(DataCenter.gI().skillClan[this.aF].a));
         this.aj[2] = new vdtt_hp[1];
         this.aj[2][0] = new vdtt_hp((byte)1, this.ab.cx + 42, this.ab.cy + 7 + 42, super.width - 8 - 138, 113, 14, this.aG.length);
      }

   }

   private void g(Graphics var1) {
      if (Char.gI().giatoc != null) {
         vdtt_y.a(var1, 79, 0, 20, this.f() + 22, super.width - 8 - 32, (int)3);
         vdtt_y.a(var1, 79, 0, 20, this.f() + this.h() - 25, super.width - 8 - 32, (int)3);
         vdtt_y.a(var1, 79, 90, 24, this.f() + 22, 3, (int)(this.h() - 45));
         vdtt_y.a(var1, 79, 90, 4 + (super.width - 8) - 23, this.f() + 22, 3, (int)(this.h() - 45));
         int var2 = this.ab.cx + 9;
         int var3 = this.ab.cy + 7 + 5;

         int var4;
         for(var4 = 0; var4 < this.aW.length; ++var4) {
            var1.f(-16742145);
            b(var1, var2 + this.aW[var4].cx, var3 + this.aW[var4].cy, (Item)null, this.aF == var4);
            if (var4 >= DataCenter.gI().skillClan.length) {
               vdtt_cz.a(var1, 460, 0, var2 + this.aW[var4].cx + 2, var3 + this.aW[var4].cy + 2, 20);
               if (mConfig.gI().d()) {
                  vdtt_cz.a(var1, 647, 0, var2 + this.aW[var4].cx + 2, var3 + this.aW[var4].cy + 2, 20);
               }
            } else {
               SkillClan var5 = DataCenter.gI().skillClan[var4];
               int var6 = var2 + this.aW[var4].cx + 2;
               int var7 = var3 + this.aW[var4].cy + 2;
               if (mConfig.gI().d()) {
                  vdtt_cz.a(var1, var5.f, 0, var6, var7, 20);
                  vdtt_cz.a(var1, 647, 0, var6, var7, 20);
               } else {
                  vdtt_cz.a(var1, 646, 0, var6, var7, 20);
                  vdtt_cz.a(var1, var5.f, 0, var6, var7, 20);
               }
            }
         }

         this.a(var1, this.aj[2][0].cx - 1, this.aj[2][0].cy - 1, this.aj[2][0].width + 60, this.aj[2][0].height + 8, -8492991, 22, 23, 1, 1);
         this.a(var1, this.aj[2][0]);
         if (this.aF >= DataCenter.gI().skillClan.length) {
            vdtt_dd.a(vdtt_dd.e, var1, Caption.iJ, this.aj[2][0].width / 2, this.aj[2][0].height / 2 - 7, 2, -2560, 3, 0);
         } else {
            for(var2 = 0; var2 < this.aG.length; ++var2) {
               var4 = var2 * this.aj[2][0].h;
               if (this.aj[2][0].c(var4)) {
                  if (this.aG[var2].a == 0) {
                     vdtt_dd.c(vdtt_dd.e, var1, this.aG[var2].b, 5, var4 + 1 + this.aj[2][0].h / 2, 0, -1, -16777216);
                  } else {
                     vdtt_dd.c(vdtt_dd.d, var1, this.aG[var2].b, 5, var4 + 1 + this.aj[2][0].h / 2, 0, -1, -16777216);
                  }
               }
            }
         }

         this.a(var1);
         this.aj[2][0].a(var1, this, 0);
      }

   }

   public final void a_() {
      super.a_();
      if (super.a.b < this.w()) {
         this.aM.a(this.aR);
         String var1;
         if (this.aR) {
            var1 = Caption.se;
            this.aM.l = var1;
         } else {
            var1 = Caption.eB;
            this.aM.l = var1;
         }

         int var2;
         for(var2 = 0; var2 < this.aP.size(); ++var2) {
            ((vdtt_ay)this.aP.get(var2)).b(true);
         }

         this.ab.a();
         this.ak.a();

         int var3;
         for(var2 = 0; var2 < this.aj.length; ++var2) {
            if (this.aj[var2] != null) {
               for(var3 = 0; var3 < this.aj[var2].length; ++var3) {
                  if (this.aj[var2][var3] != null) {
                     this.aj[var2][var3].a();
                  }
               }
            }
         }

         if (this.ab.b.b == 0) {
            if (Char.gI().giatoc != null) {
               if (this.al.h() <= 1) {
                  this.aH.b(false);
                  this.aK.b(false);
                  this.aM.b(false);
                  this.aO.b(!this.aS);
                  if (this.U == 5) {
                     this.aJ.b(false);
                     this.aN.b(false);
                     this.aI.b(false);
                     this.aK.b(true);
                  } else if (this.U == 4) {
                     this.aJ.b(false);
                     this.aN.b(false);
                  }

                  if (this.aS) {
                     this.aN.b(true);
                  }
               }

               if (this.ac != null) {
                  this.ac.a();

                  for(var2 = 0; var2 < this.ae.length; ++var2) {
                     vdtt_ay var4;
                     boolean var5;
                     label87: {
                        this.ae[var2].a_();
                        this.ad[var2].a();
                        this.S[var2].p = this.S[var2].o;
                        if (this.S[var2].d() == -32) {
                           var4 = this.ae[var2];
                        } else {
                           var4 = this.ae[var2];
                           if (this.U != 5) {
                              var5 = true;
                              break label87;
                           }
                        }

                        var5 = false;
                     }

                     var4.a(var5);
                     if (this.ad[var2].l != -1) {
                        this.ae[var2].M = true;
                     } else {
                        this.ae[var2].M = false;
                     }
                  }
               }
            }

            var2 = 0;

            for(var3 = 0; var3 < this.aP.size(); ++var3) {
               if (!((vdtt_ay)this.aP.get(var3)).d) {
                  ++var2;
                  ((vdtt_ay)this.aP.get(var3)).setSize(50, ((vdtt_ay)this.aP.get(var3)).height);
                  ((vdtt_ay)this.aP.get(var3)).setXY(this.width - 8 - var2 * 53, ((vdtt_ay)this.aP.get(var3)).cy);
               }
            }

            this.al.e();
            return;
         }

         if (this.ab.b.b == 2) {
            if (this.aF >= 0 && this.aF < DataCenter.gI().skillClan.length) {
               this.aL.b(false);
               this.aL.H = 7;
               if (this.Y.contains(DataCenter.gI().skillClan[this.aF].a)) {
                  this.aL.a(true);
                  var1 = Caption.qD;
                  this.aL.l = var1;
                  this.aL.H = 9;
               } else {
                  if (this.U == 5) {
                     this.aL.a(false);
                     var1 = Caption.nt;
                     this.aL.l = var1;
                     return;
                  }

                  this.aL.a(true);
                  var1 = Caption.iJ;
                  this.aL.l = var1;
               }
            } else {
               this.aL.b(true);
            }
         }
      }

   }

   private Member g(int var1) {
      Member var2 = null;
      if (var1 >= 0) {
         if (this.ab.b.b == 1) {
            var2 = (Member)this.W.elementAt(var1);
         } else {
            var2 = (Member)this.V.elementAt(var1);
         }
      }

      return var2;
   }

   public final void f(int var1) {
      super.f(var1);
      aX = var1;
      if (this.ab != null) {
         this.ab.b();
         if (var1 < this.w()) {
            this.ab.a(var1);
            if (super.a.b < this.w() && this.ab.b.b != super.a.b) {
               this.f(this.ab.b.b);
            }
         }

         if (super.a.b == this.w()) {
            super.O.a(2);
            this.z();
         }
      }

   }

   public final int B() {
      return super.a.b;
   }

   public final int C() {
      return this.al.h();
   }

   private String a(int var1, boolean var2) {
      SkillClan var3 = DataCenter.gI().skillClan[var1];
      Vector var4;
      (var4 = new Vector()).addElement("c#moc" + var3.b);
      if (var3.c != null && var3.c.length() > 0) {
         var4.addElement(var3.c);
      }

      if (!var2) {
         if (DataCenter.gI().skillClan[var1].g > 0) {
            var4.addElement("c#yellow" + Caption.aI + " " + Utlis.c(DataCenter.gI().skillClan[var1].g) + " " + Caption.bw);
         }

         if (var3.h > 0) {
            var4.addElement("c#orange" + Caption.gt + DataCenter.gI().skillClan[var1].b());
         }
      } else if ((var1 = this.h(var1)) > 0) {
         var4.addElement("c#orange" + Caption.oy + Utlis.g((long)var1 * 1000L));
      }

      var4.addElement("c#green" + Caption.dL);
      this.a(var4, var3);
      Vector var5 = new Vector();

      String var6;
      int var7;
      for(var7 = 0; var7 < var4.size(); ++var7) {
         var6 = String.valueOf(var4.elementAt(var7));
         int var8;
         Vector var9;
         if (var7 == 0) {
            var9 = vdtt_dd.a(vdtt_dd.e, var6, 180);

            for(var8 = 0; var8 < var9.size(); ++var8) {
               var5.add(new vdtt_ir(0, (String)var9.elementAt(var8)));
            }
         } else {
            var9 = vdtt_dd.a(vdtt_dd.d, var6, 180);

            for(var8 = 0; var8 < var9.size(); ++var8) {
               var5.add(new vdtt_ir(1, (String)var9.elementAt(var8)));
            }
         }
      }

      var6 = "";
      this.aG = new vdtt_ir[var5.size()];

      for(var7 = 0; var7 < var5.size(); ++var7) {
         this.aG[var7] = (vdtt_ir)var5.elementAt(var7);
         var6 = var6 + this.aG[var7].b;
         if (var7 < this.aG.length - 1) {
            var6 = var6 + "\r\n";
         }
      }

      return var6;
   }

   private void a(Vector var1, SkillClan var2) {
      if (this.ap >= var2.d) {
         var1.addElement("c#white" + Caption.un + var2.d);
      } else {
         var1.addElement("c#red" + Caption.un + var2.d);
      }

      ItemOption[] var3;
      int var4 = (var3 = var2.a()).length;

      for(int var5 = 0; var5 < var4; ++var5) {
         ItemOption var6;
         String var7 = (var6 = var3[var5]).a(0);
         if (var6.getItemOptionTemplate().type == 55) {
            var7 = var6.d();
         }

         if (var7 != null && var7.length() > 0) {
            var1.addElement(var7);
         }
      }

   }

   public final void d() {
      try {
         if (GameSrc.gI().T() != null && GameSrc.gI().T().a == 44) {
            GameSrc.gI();
            GameSrc.o(93);
         }
      } catch (Exception var2) {
      }

      super.d();
   }

   private int h(int var1) {
      for(int var2 = 0; var2 < this.Y.size(); ++var2) {
         if ((Integer)this.Y.get(var2) == var1) {
            return (Integer)this.Z.get(var2);
         }
      }

      return 0;
   }
}
