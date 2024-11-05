package gro;

import java.util.Collections;
import java.util.Vector;

public final class vdtt_mn extends vdtt_ka {
   private static int ad;
   private final vdtt_ay ae;
   private final vdtt_ay af;
   public vdtt_ay S;
   public vdtt_ay T;
   public vdtt_ay U;
   public vdtt_bb V;
   public vdtt_bb W;
   public vdtt_bb X;
   public Vector Y = new Vector();
   public Vector Z = new Vector();
   public Vector aa = new Vector();
   public Vector ab = new Vector();
   private vdtt_hp[][] ag;
   private vdtt_in ah;
   private String[] ai;
   private boolean aj;
   private boolean ak;
   private vdtt_bb al;
   private vdtt_bb am;
   private vdtt_bb[][] an;
   private vdtt_hp[][] ao;
   private int ap;
   private Vector aq;
   private int ar;
   public static int ac;

   public vdtt_mn(MainScreen var1) {
      super(var1, 4, Caption.zN);
      this.ai = Caption.zR;
      this.aj = true;
      this.ar = 28;
      this.H = var1;
      this.J = false;
      this.a(300, 220);
      this.ah = new vdtt_in(new vdtt_hm(1001, this.ai), this);
      this.ah.c = this.h() - 12;
      int var2 = super.width - 8 - 57;
      int var3 = this.f() + this.h() - 25;
      this.S = this.a(var2, var3, Caption.zc[2], this, 101, 15);
      this.S.setSize(54, 20);
      this.T = this.a(this.S.cx - 57, this.S.cy, Caption.kj, this, 102, 15);
      this.T.setSize(this.S.width, this.S.height);
      this.V = this.a(10, this.f() + this.h() - 21, Caption.kk, this, 104);
      this.W = this.a(80, this.f() + this.h() - 21, Caption.kl, this, 105);
      vdtt_bb var4 = this.W;
      boolean var5 = GameSrc.gI().cb;
      var4.m = var5;
      this.X = this.a(10, this.f() + this.h() - 21, Caption.dz, this, 106);
      var4 = this.X;
      var5 = mConfig.gI().a(38);
      var4.m = var5;
      vdtt_ay var6;
      (var6 = this.a(this.S.cx, this.S.cy, Caption.km, this, 103, 15)).setSize(this.S.width, this.S.height);
      this.ah.a(this.S, 0);
      this.ah.a(this.T, 0);
      this.ah.a(this.V, 0);
      this.ah.a(this.W, 0);
      this.ah.a(this.X, 1);
      this.ah.a(var6, 1);
      this.ag = new vdtt_hp[3][];
      this.ag[0] = new vdtt_hp[3];
      var5 = false;
      this.ah.a(super.b[0]);
      this.D();
      this.U = this.a(this.S.cx - 114, this.S.cy, Caption.sC, this, 1002, 7);
      this.U.setSize(this.S.width, this.S.height);
      this.a(this.U, 1);
      this.af = this.a(this.S.cx, this.S.cy, Caption.hv, this, 1004, 7);
      this.af.setSize(this.S.width, this.S.height);
      this.a(this.af, 1);
      this.a(this.af, 2);
      this.ae = this.a(this.S.cx - 57, this.S.cy, Caption.qS, this, 1005, 7);
      this.ae.setSize(this.S.width, this.S.height);
      this.a(this.ae, 1);
      this.al = this.a(this.V.cx, this.V.cy, Caption.gX, 100);
      var4 = this.al;
      var5 = Binary.g("friend" + Char.gI().idEntity);
      var4.m = var5;
      this.a(this.al, 1);
      this.am = this.a(this.V.cx, this.V.cy, Caption.gX, 101);
      var4 = this.am;
      var5 = Binary.g("enermy" + Char.gI().idEntity);
      var4.m = var5;
      this.a(this.am, 2);
      this.an = new vdtt_bb[2][];
      this.ao = new vdtt_hp[2][];
      this.ag[1] = new vdtt_hp[1];
      this.ag[2] = new vdtt_hp[1];
      this.B();
      this.C();
      this.f(ac);
      (new Message((byte)43)).send();
   }

   public final void B() {
      this.aa.clear();
      int var1;
      if (this.al.m) {
         for(var1 = 0; var1 < GameSrc.gI().vFriend.size(); ++var1) {
            Friend var2;
            if ((var2 = (Friend)GameSrc.gI().vFriend.elementAt(var1)).isOnline) {
               this.aa.add(var2);
            }
         }
      } else {
         this.aa.addAll(GameSrc.gI().vFriend);
      }

      Collections.sort(this.aa, Friend.a);
      this.ap = 21;
      this.ag[1][0] = new vdtt_hp((byte)1, 7, this.f() + 5, super.width - 8 - 6, this.ap * 8, this.ap, this.aa.size());
      this.an[0] = new vdtt_bb[GameSrc.gI().vFriend.size()];
      this.ao[0] = new vdtt_hp[GameSrc.gI().vFriend.size()];

      for(var1 = 0; var1 < GameSrc.gI().vFriend.size(); ++var1) {
         this.an[0][var1] = new vdtt_bb(3, 2 + var1 * this.ag[1][0].h, "", this, 0);
         this.ao[0][var1] = new vdtt_hu((byte)1, 0, 0, this.an[0][var1].width, this.an[0][var1].height, this.an[0][var1].height, 1, this.ag[1][0]);
      }

   }

   public final void C() {
      this.ab.clear();
      int var1;
      if (this.am.m) {
         for(var1 = 0; var1 < GameSrc.gI().vEnemy.size(); ++var1) {
            Enemy var2;
            if ((var2 = (Enemy)GameSrc.gI().vEnemy.elementAt(var1)).isOnline) {
               this.ab.add(var2);
            }
         }
      } else {
         this.ab.addAll(GameSrc.gI().vEnemy);
      }

      Collections.sort(this.ab, Enemy.a);
      this.ap = 21;
      this.ag[2][0] = new vdtt_hp((byte)1, 7, this.f() + 5, super.width - 8 - 6, this.ap * 8, this.ap, this.ab.size());
      this.an[1] = new vdtt_bb[GameSrc.gI().vEnemy.size()];
      this.ao[1] = new vdtt_hp[GameSrc.gI().vEnemy.size()];

      for(var1 = 0; var1 < GameSrc.gI().vEnemy.size(); ++var1) {
         this.an[1][var1] = new vdtt_bb(3, 2 + var1 * this.ag[2][0].h, "", this, 0);
         this.ao[1][var1] = new vdtt_hu((byte)1, 0, 0, this.an[1][var1].width, this.an[1][var1].height, this.an[1][var1].height, 1, this.ag[2][0]);
      }

   }

   private void E() {
      this.ag[0][0] = new vdtt_hp((byte)1, 8, this.f() + 35, this.width - 18, this.ar * 5, this.ar, GameSrc.gI().bq.vMember.size());
      vdtt_bb var1 = this.V;
      boolean var2 = GameSrc.gI().bq.c;
      var1.m = var2;
   }

   private void F() {
      this.ag[0][1] = new vdtt_hp((byte)1, 8, this.f() + 35, this.width - 18, this.ar * 5, this.ar, this.Y.size());
   }

   private void G() {
      this.Z.clear();
      this.Z.add(Char.gI());
      this.Z.addAll(GameSrc.gI().vChar);
      this.ag[0][2] = new vdtt_hp((byte)1, 8, this.f() + 35, super.width - 8 - 10, this.ar * 5, this.ar, this.Z.size());
   }

   public final void D() {
      this.E();
      this.F();
      this.G();
      if (this.ak && this.Y.size() == 0) {
         this.H.c(Caption.cz, -1);
         this.ak = false;
      }

   }

   private void H() {
      int var1 = 0;
      int var2 = super.a.b == 1 ? 0 : 1;

      for(int var3 = 0; var3 < this.an[var2].length; ++var3) {
         if (this.an[var2][var3].m) {
            this.g(var3);
            ++var1;
         }
      }

      if (var1 == 0) {
         DataCenter.gI().currentScreen.c(Caption.qa, -65536);
      }

   }

   private void g(int var1) {
      try {
         Message var2;
         if (super.a.b != 1) {
            if (super.a.b == 2) {
               (var2 = new Message((byte)-18)).writeUTF(this.h(var1));
               var2.send();
            }

            return;
         }

         (var2 = new Message((byte)76)).writeUTF(this.h(var1));
         var2.send();
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }

   private String h(int var1) {
      try {
         if (super.a.b == 1) {
            return ((Friend)this.aq.elementAt(var1)).name;
         }

         if (super.a.b == 2) {
            return ((Enemy)this.aq.elementAt(var1)).name;
         }
      } catch (Exception var3) {
         Utlis.a(var3);
      }

      return "";
   }

   public final void d() {
      super.d();
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      super.b(var1, var2, var3);
      if (super.a.b < this.w()) {
         this.c(var1, var2);
         vdtt_mn var4;
         vdtt_hm var5;
         Message var6;
         Message var7;
         Member var8;
         switch(var1) {
         case 55:
            var5 = (vdtt_hm)var2;
            var4 = this;

            try {
               var8 = var4.i(var5.a);
               GameSrc.gI();
               GameSrc.i(var8.name);
               break;
            } catch (Exception var18) {
               Utlis.a(var18);
               return;
            }
         case 56:
            var5 = (vdtt_hm)var2;
            var4 = this;

            try {
               var8 = var4.i(var5.a);
               (var6 = new Message((byte)46)).writeUTF(var8.name);
               var6.send();
               break;
            } catch (Exception var17) {
               Utlis.a(var17);
               return;
            }
         case 57:
            var5 = (vdtt_hm)var2;
            var4 = this;

            try {
               var8 = var4.i(var5.a);
               (var6 = new Message((byte)47)).writeUTF(var8.name);
               var6.send();
               break;
            } catch (Exception var16) {
               Utlis.a(var16);
               return;
            }
         case 100:
            Binary.a("friend" + Char.gI().idEntity, this.al.m);
            this.B();
            return;
         case 101:
            Binary.a("enermy" + Char.gI().idEntity, this.am.m);
            this.C();
            return;
         case 104:
            try {
               (new Message((byte)42)).send();
               break;
            } catch (Exception var15) {
               Utlis.a(var15);
               return;
            }
         case 105:
            boolean var9 = this.W.m;
            this.W.m = var9;
            GameSrc.gI().cb = this.W.m;
            return;
         case 106:
            mConfig.gI().a(38, this.X.m);
            return;
         case 2000:
            GameSrc.gI();
            vdtt_hm var10;
            GameSrc.g((var10 = (vdtt_hm)var2).f);
            break;
         case 2001:
            var5 = (vdtt_hm)var2;
            var4 = this;

            try {
               if (var4.a.b == 1) {
                  (var7 = new Message((byte)76)).writeUTF(var4.h(var5.a));
                  var7.send();
                  return;
               }

               if (var4.a.b == 2) {
                  (var7 = new Message((byte)-18)).writeUTF(var4.h(var5.a));
                  var7.send();
               }
               break;
            } catch (Exception var14) {
               Utlis.a(var14);
               return;
            }
         case 2005:
            var5 = (vdtt_hm)var2;
            var4 = this;

            try {
               if (var4.a.b == 0) {
                  Char var21 = (Char)var4.Z.elementAt(var5.a);
                  GameSrc.gI();
                  GameSrc.e(var21.name);
               } else {
                  try {
                     GameSrc.gI();
                     GameSrc.e(var4.h(var5.a));
                  } catch (Exception var19) {
                     Utlis.a(var19);
                     break;
                  }
               }
            } catch (Exception var20) {
               Utlis.a(var20);
            }

            return;
         case 2006:
            vdtt_hm var11 = (vdtt_hm)var2;

            try {
               (var7 = Message.c((byte)15)).writeUTF(var11.f);
               var7.send();
            } catch (Exception var13) {
               Utlis.a(var13);
               return;
            }
         }
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (super.a.b < this.w()) {
         int var4;
         if (var1.b >= 8000 && var1.b < 9000) {
            var4 = var1.b - 8000;
            boolean var11;
            vdtt_bb var14;
            if (super.a.b == 1) {
               var14 = this.an[0][var4];
               var11 = !this.an[0][var4].m;
               var14.m = var11;
               return;
            }

            var14 = this.an[1][var4];
            var11 = !this.an[1][var4].m;
            var14.m = var11;
            return;
         }

         switch(var1.b) {
         case 101:
            if (GameSrc.gI().bq != null && !GameSrc.gI().bq.isEmpty()) {
               this.aj = true;
               this.A();
               this.f(this.w());
               this.P.n.b = 4;
               super.O.a(3);
               this.z();
               return;
            }

            try {
               (new Message((byte)41)).send();
               break;
            } catch (Exception var10) {
               Utlis.a(var10);
               return;
            }
         case 102:
            try {
               (new Message((byte)44)).send();
               break;
            } catch (Exception var9) {
               Utlis.a(var9);
               return;
            }
         case 103:
            this.ak = true;
            K();
            return;
         case 1001:
            if (var1.j.k >= 0) {
               ad = var1.j.k;
               this.ah.a(var1.j.k);
               this.J();
               return;
            }
            break;
         case 1002:
            this.H.a((vdtt_w)(new vdtt_jg(this.H, this)));
            return;
         case 1003:
            if (var1.j.k >= 0) {
               var4 = var3;
               var3 = var2;
               var2 = var1.j.k;
               Vector var5 = new Vector();
               String var6 = "";
               if (super.a.b == 0) {
                  if (this.ah.h() == 2) {
                     Char var7;
                     if (!(var7 = (Char)this.Z.elementAt(var2)).equals(Char.gI())) {
                        if (GameSrc.gI().bq != null && !GameSrc.gI().bq.isEmpty()) {
                           if (GameSrc.gI().bq.isLeader() && !GameSrc.gI().bq.isMember(var7.name)) {
                              var5.addElement(new vdtt_ir(2005, Caption.ex));
                           }
                        } else {
                           var5.addElement(new vdtt_ir(2005, Caption.cj));
                        }

                        var6 = a(var5, var7.name);
                     }
                  } else {
                     Member var12;
                     if (!(var12 = this.i(var2)).name.equals(Char.gI().name)) {
                        if (this.ah.h() == 0 && GameSrc.gI().bq != null && GameSrc.gI().bq.isLeader()) {
                           var5.addElement(new vdtt_ir(56, Caption.kt));
                           var5.addElement(new vdtt_ir(57, Caption.ku));
                        }

                        var6 = a(var5, var12.name);
                        mParty var8;
                        if (this.ah.h() == 1 && (GameSrc.gI().bq == null || GameSrc.gI().bq.isEmpty()) && !(var8 = (mParty)this.Y.elementAt(var2)).d() && !var8.c) {
                           var5.addElement(new vdtt_ir(55, Caption.kv));
                        }
                     }
                  }
               } else if (super.a.b == 1) {
                  Friend var13;
                  if ((var13 = (Friend)this.aa.elementAt(var2)).type == 2) {
                     var5.addElement(new vdtt_ir(2000, Caption.ha));
                     var5.addElement(new vdtt_ir(2001, Caption.hb));
                  }

                  if (var13.type < 2) {
                     var5.addElement(new vdtt_ir(2001, Caption.hc));
                  }

                  if (GameSrc.gI().bq != null && !GameSrc.gI().bq.isEmpty()) {
                     if (GameSrc.gI().bq.isLeader() && !GameSrc.gI().bq.isMember(var13.name)) {
                        var5.addElement(new vdtt_ir(2005, Caption.ex));
                     }
                  } else {
                     var5.addElement(new vdtt_ir(2005, Caption.ew));
                  }

                  var5.addElement(new vdtt_ir(2006, Caption.xl));
                  var6 = a(var5, var13.name);
               } else if (super.a.b == 2) {
                  Enemy var15 = (Enemy)this.aq.elementAt(var2);
                  var5.addElement(new vdtt_ir(2001, Caption.hd));
                  if (GameSrc.gI().bq != null && !GameSrc.gI().bq.isEmpty()) {
                     if (GameSrc.gI().bq.isLeader() && !GameSrc.gI().bq.isMember(var15.name)) {
                        var5.addElement(new vdtt_ir(2005, Caption.ex));
                     }
                  } else {
                     var5.addElement(new vdtt_ir(2005, Caption.cj));
                  }

                  var6 = a(var5, var15.name);
               }

               this.a(var5, var6, var2, var3, var4);
               return;
            }
            break;
         case 1004:
            this.H();
            return;
         case 1005:
            this.I();
         }
      }

   }

   private void I() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.aa.size(); ++var2) {
         if (((Friend)this.aa.get(var2)).type == 2) {
            this.g(var2);
            ++var1;
         }
      }

      if (var1 > 0) {
         DataCenter.gI().currentScreen.c(Utlis.b(Caption.qT, String.valueOf(var1)), -1);
      }

   }

   public final void f(int var1) {
      super.f(var1);
      ac = var1;
      if (this.ah != null) {
         if (super.a.b == 0) {
            this.ah.a(ad);
            this.J();
            return;
         }

         if (super.a.b == this.w()) {
            super.O.a(3);
            this.z();
            return;
         }

         if (super.a.b == 1) {
            this.aq = this.aa;
            return;
         }

         if (super.a.b == 2) {
            this.aq = this.ab;
         }
      }

   }

   private void J() {
      if (this.ah != null) {
         switch(this.ah.h()) {
         case 1:
            K();
         }
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (!this.aj) {
         var1.removeElementAt(0);
      }

      if (super.a.b == 0) {
         var1.addElement(this.ah.f());
         var1.addElement(this.ag[0][this.ah.h()].a(1003, this));
      } else {
         int var2;
         int var3;
         int var4;
         if (super.a.b == 1) {
            for(var4 = 0; var4 < this.ao[0].length; ++var4) {
               var2 = this.ag[1][0].cx + this.an[0][var4].cx;
               var3 = this.ag[1][0].cy + this.an[0][var4].cy - this.ag[1][0].f;
               if (Utlis.a(this.ag[1][0].cx, this.ag[1][0].cy, this.ag[1][0].cx + this.ag[1][0].width, this.ag[1][0].cy + this.ag[1][0].height, var2, var3) && Utlis.a(this.ag[1][0].cx, this.ag[1][0].cy, this.ag[1][0].cx + this.ag[1][0].width, this.ag[1][0].cy + this.ag[1][0].height, var2 + this.an[0][var4].width, var3 + this.an[0][var4].height)) {
                  this.ao[0][var4].cx = (short)var2;
                  this.ao[0][var4].cy = (short)var3;
                  var1.addElement(this.ao[0][var4].a(8000 + var4, this));
               }
            }

            var1.addElement(this.ag[1][0].a(1003, this));
         } else if (super.a.b == 2) {
            for(var4 = 0; var4 < this.ao[1].length; ++var4) {
               var2 = this.ag[2][0].cx + this.an[1][var4].cx;
               var3 = this.ag[2][0].cy + this.an[1][var4].cy - this.ag[2][0].f;
               if (Utlis.a(this.ag[2][0].cx, this.ag[2][0].cy, this.ag[2][0].cx + this.ag[2][0].width, this.ag[2][0].cy + this.ag[2][0].height, var2, var3) && Utlis.a(this.ag[2][0].cx, this.ag[2][0].cy, this.ag[2][0].cx + this.ag[2][0].width, this.ag[2][0].cy + this.ag[2][0].height, var2 + this.an[1][var4].width, var3 + this.an[1][var4].height)) {
                  this.ao[1][var4].cx = (short)var2;
                  this.ao[1][var4].cy = (short)var3;
                  var1.addElement(this.ao[1][var4].a(8000 + var4, this));
               }
            }

            var1.addElement(this.ag[2][0].a(1003, this));
         }
      }

      return var1;
   }

   public final void b(Graphics var1) {
      if (this.aj) {
         super.b(var1);
      } else {
         this.a(var1, this.cx, this.cy, this.width, this.height, Caption.cj, (byte)2, this.J);
      }

      int var2;
      vdtt_mn var3;
      Graphics var4;
      int var5;
      int var6;
      int var7;
      if (super.a.b == 0) {
         this.ah.a(var1);
         this.a(var1, this.cx + 4, this.cy + this.f() + 22);
         this.a(var1, this.ag[0][this.ah.h()]);
         label120:
         switch(this.ah.h()) {
         case 0:
            var4 = var1;
            var3 = this;
            var7 = 0;

            while(true) {
               if (var7 >= var3.ag[0][var3.ah.h()].i) {
                  break label120;
               }

               if (var3.ag[0][var3.ah.h()].b(var7)) {
                  try {
                     Member var8 = (Member)GameSrc.gI().bq.vMember.elementAt(var7);
                     var3.a(var4, 2, var7 * var3.ag[0][var3.ah.h()].h, var3.ag[0][var3.ah.h()].width - 2, var3.ag[0][var3.ah.h()].h - 2, 46, 22, 23, 1, 1);
                     if (var7 == var3.ag[0][var3.ah.h()].k) {
                        vdtt_cz.a(var4, 3, 1 + var7 * var3.ag[0][var3.ah.h()].h, var3.ag[0][var3.ah.h()].width - 4, var3.ag[0][var3.ah.h()].h - 3);
                     }

                     var6 = 32;
                     var2 = var7 * var3.ag[0][var3.ah.h()].h + 8;
                     vdtt_y.a(var4, var8.a(), 0, 5, var2 - 5, 100);
                     var5 = var7 == var3.ag[0][var3.ah.h()].k ? -2560 : -1;
                     if (var7 == var3.ag[0][var3.ah.h()].l && !var8.name.equals(Char.gI().name)) {
                        ++var6;
                        ++var2;
                     }

                     vdtt_dd.a(vdtt_dd.d, var4, Caption.zc[3] + " " + var8.name, var6, var2, 0, var5);
                     vdtt_dd var9 = vdtt_dd.d;
                     StringBuilder var10 = (new StringBuilder()).append(Caption.zc[5]).append(" ").append(DataCenter.gI().a((int)var8.d));
                     DataCenter.gI();
                     vdtt_dd.a(var9, var4, var10.append(DataCenter.b(var8.d)).toString(), var6, var2 + 10, 0, var5);
                     if (var7 == 0) {
                        vdtt_dd.a(vdtt_dd.d, var4, "(" + Caption.kq + ")", var3.width - 8 - 15, var2 + var3.ag[0][var3.ah.h()].h / 2 - 15, 1, -7812062);
                        if (GameSrc.gI().bq.c) {
                           vdtt_cz.a(var4, 44, 0, var3.width - 8 - 28, var2 + var3.ag[0][var3.ah.h()].h / 2 - 9, 0);
                        }
                     }
                  } catch (Exception var12) {
                  }
               }

               ++var7;
            }
         case 1:
            this.f(var1);
            break;
         case 2:
            this.g(var1);
         }

         this.a(var1);
         this.a(var1, this.cx + 4, this.cy + this.f());
         if (this.ah.h() == 2) {
            vdtt_dd.a(vdtt_dd.d, var1, Caption.gY + this.Z.size(), 10, this.h() - 10, 0, -1);
         }

         this.ag[0][this.ah.h()].b(var1, this);
      } else if (super.a.b == 1) {
         this.a(var1, this.cx + 4, this.cy + this.f());
         this.a(var1, this.ag[1][0]);

         for(var2 = 0; var2 < this.ag[1][0].i; ++var2) {
            if (this.ag[1][0].b(var2)) {
               if (var2 == this.ag[1][0].k) {
                  vdtt_cz.a(var1, 0, var2 * this.ag[1][0].h, this.ag[1][0].width, this.ag[1][0].h - 1);
               }

               Friend var13 = (Friend)this.aq.elementAt(var2);
               var5 = var2;
               var4 = var1;
               var3 = this;

               try {
                  if (var13.isOnline) {
                     vdtt_cz.a(var4, 302, 0, 24, 6 + var5 * var3.ag[1][0].h, 20);
                  } else if (var13.type == 1) {
                     vdtt_cz.a(var4, 304, 0, 24, 6 + var5 * var3.ag[1][0].h, 20);
                  } else {
                     vdtt_cz.a(var4, 303, 0, 24, 6 + var5 * var3.ag[1][0].h, 20);
                  }

                  if (var5 == var3.ag[1][0].l) {
                     vdtt_dd.b(vdtt_dd.d, var4, var13.name + (var13.type == 2 ? Caption.gZ : ""), 37, 11 + var5 * var3.ag[1][0].h, 0, -3089954, -16777216);
                  } else {
                     vdtt_dd.b(vdtt_dd.d, var4, var13.name + (var13.type == 2 ? Caption.gZ : ""), 36, 10 + var5 * var3.ag[1][0].h, 0, -3089954, -16777216);
                  }

                  var7 = var4.e;
                  var6 = var4.f;
                  var3.a(var4, var7 + var3.an[0][var5].cx, var6 + var3.an[0][var5].cy);
                  var3.an[0][var5].b(var4);
                  var3.a(var4, var7, var6);
               } catch (Exception var11) {
                  Utlis.a(var11);
               }
            }
         }

         this.a(var1);
         vdtt_dd.a(vdtt_dd.b, var1, Caption.pH + this.aq.size(), this.V.cx, this.V.cy - 6, 0, -1);
         this.ag[1][0].b(var1, this);
      } else if (super.a.b == 2) {
         this.a(var1, this.cx + 4, this.cy + this.f());
         this.a(var1, this.ag[2][0]);

         for(var2 = 0; var2 < this.ag[2][0].i; ++var2) {
            if (this.ag[2][0].b(var2)) {
               if (var2 == this.ag[2][0].k) {
                  vdtt_cz.a(var1, 0, var2 * this.ag[2][0].h, this.ag[2][0].width, this.ag[2][0].h - 1);
               }

               Enemy var14 = (Enemy)this.aq.elementAt(var2);
               if (var14.isOnline) {
                  vdtt_cz.a(var1, 302, 0, 24, 6 + var2 * this.ag[2][0].h, 20);
               } else {
                  vdtt_cz.a(var1, 304, 0, 24, 6 + var2 * this.ag[2][0].h, 20);
               }

               if (var2 == this.ag[2][0].l) {
                  vdtt_dd.b(vdtt_dd.d, var1, var14.name, 37, 11 + var2 * this.ag[2][0].h, 0, -1, -16777216);
               } else {
                  vdtt_dd.b(vdtt_dd.d, var1, var14.name, 36, 10 + var2 * this.ag[2][0].h, 0, -1, -16777216);
               }

               var7 = var1.e;
               var6 = var1.f;
               this.a(var1, var7 + this.an[1][var2].cx, var6 + this.an[1][var2].cy);
               this.an[1][var2].b(var1);
               this.a(var1, var7, var6);
            }
         }

         this.a(var1);
         vdtt_dd.a(vdtt_dd.b, var1, Caption.pH + this.aq.size(), this.V.cx, this.V.cy - 6, 0, -1);
         this.ag[2][0].b(var1, this);
      }

   }

   private void f(Graphics var1) {
      for(int var2 = 0; var2 < this.ag[0][this.ah.h()].i; ++var2) {
         if (this.ag[0][this.ah.h()].b(var2)) {
            try {
               mParty var3;
               Member var4 = (Member)(var3 = (mParty)this.Y.elementAt(var2)).vMember.firstElement();
               this.a(var1, 2, var2 * this.ag[0][this.ah.h()].h, this.ag[0][this.ah.h()].width - 2, this.ag[0][this.ah.h()].h - 2, 46, 22, 23, 1, 1);
               if (var2 == this.ag[0][this.ah.h()].k) {
                  vdtt_cz.a(var1, 3, 1 + var2 * this.ag[0][this.ah.h()].h, this.ag[0][this.ah.h()].width - 4, this.ag[0][this.ah.h()].h - 3);
               }

               int var5 = 32;
               int var6 = var2 * this.ag[0][this.ah.h()].h + 8;
               vdtt_y.a(var1, var4.a(), 0, 5, var6 - 5, 100);
               int var7 = var2 == this.ag[0][this.ah.h()].k ? -2560 : -1;
               if (var2 == this.ag[0][this.ah.h()].l && !var4.name.equals(Char.gI().name)) {
                  ++var5;
                  ++var6;
               }

               vdtt_dd.a(vdtt_dd.d, var1, Caption.zc[3] + " " + var4.name, var5, var6, 0, var7);
               if (var3.c) {
                  vdtt_cz.a(var1, 44, 0, super.width - 8 - 28, var6 + this.ag[0][this.ah.h()].h / 2 - 9, 0);
               }

               vdtt_dd var8 = vdtt_dd.d;
               StringBuilder var9 = (new StringBuilder()).append(Caption.zc[5]).append(" ").append(DataCenter.gI().a((int)var4.d));
               DataCenter.gI();
               vdtt_dd.a(var8, var1, var9.append(DataCenter.b(var4.d)).toString(), var5, var6 + 10, 0, var7);
               if (var3.d()) {
                  vdtt_dd.a(vdtt_dd.d, var1, Caption.kr, super.width - 8 - 15, var6 + this.ag[0][this.ah.h()].h / 2 - 15, 1, -65536);
               } else {
                  vdtt_dd.a(vdtt_dd.d, var1, "(" + var3.d + Caption.ks, super.width - 8 - 15, var6 + this.ag[0][this.ah.h()].h / 2 - 15, 1, -7812062);
               }
            } catch (Exception var10) {
            }
         }
      }

   }

   private void g(Graphics var1) {
      try {
         for(int var2 = 0; var2 < this.ag[0][this.ah.h()].i; ++var2) {
            if (this.ag[0][this.ah.h()].b(var2)) {
               Char var3 = (Char)this.Z.get(var2);
               this.a(var1, 2, var2 * this.ag[0][this.ah.h()].h, this.ag[0][this.ah.h()].width - 2, this.ag[0][this.ah.h()].h - 2, 46, 22, 23, 1, 1);
               if (var2 == this.ag[0][this.ah.h()].k) {
                  vdtt_cz.a(var1, 3, 1 + var2 * this.ag[0][this.ah.h()].h, this.ag[0][this.ah.h()].width - 4, this.ag[0][this.ah.h()].h - 3);
               }

               int var4 = 32;
               int var5 = var2 * this.ag[0][this.ah.h()].h + 8;
               vdtt_y.a(var1, var3.ag(), 0, 5, var5 - 5, 100);
               int var6 = var2 == this.ag[0][this.ah.h()].k ? -2560 : -1;
               if (var2 == this.ag[0][this.ah.h()].l && !var3.name.equals(Char.gI().name)) {
                  ++var4;
                  ++var5;
               }

               vdtt_dd.a(vdtt_dd.d, var1, Caption.zc[3] + " " + var3.name, var4, var5, 0, var6);
               vdtt_dd var7 = vdtt_dd.d;
               StringBuilder var8 = (new StringBuilder()).append(Caption.zc[5]).append(" ").append(DataCenter.gI().a(var3.w()));
               DataCenter.gI();
               vdtt_dd.a(var7, var1, var8.append(DataCenter.b(var3.w())).toString(), var4, var5 + 10, 0, var6);
            }
         }
      } catch (Exception var9) {
      }

   }

   public final void a_() {
      super.a_();
      int var1;
      boolean var2;
      if (super.a.b == 0) {
         this.ah.e();

         for(var1 = 0; var1 < this.ag[0].length; ++var1) {
            this.ag[0][this.ah.h()].a();
         }

         if (GameSrc.gI().bq != null && !GameSrc.gI().bq.isEmpty()) {
            this.aj = true;
            if (GameSrc.gI().bq.isLeader()) {
               var2 = false;
               this.V.d = var2;
               var2 = false;
               this.W.d = var2;
            } else {
               var2 = true;
               this.V.d = var2;
               var2 = true;
               this.W.d = var2;
            }
         } else {
            var2 = true;
            this.V.d = var2;
            var2 = true;
            this.W.d = var2;
         }

         String var3;
         if (GameSrc.gI().bq != null && !GameSrc.gI().bq.isEmpty()) {
            if (GameSrc.gI().bq.vMember.size() == 1) {
               var3 = Caption.ko;
               this.T.l = var3;
            } else {
               var3 = Caption.kj;
               this.T.l = var3;
            }

            this.T.b(false);
            var3 = Caption.kp;
            this.S.l = var3;
         } else {
            this.T.b(true);
            var3 = Caption.kn;
            this.S.l = var3;
         }
      } else {
         int var4;
         if (super.a.b == 1) {
            this.ag[1][0].a();
            var1 = 0;

            for(var4 = 0; var4 < this.aa.size(); ++var4) {
               if (((Friend)this.aa.get(var4)).type == 2) {
                  ++var1;
               }
            }

            this.ae.a(var1 == 0);
            var1 = 0;

            for(var4 = 0; var4 < this.an[0].length; ++var4) {
               if (this.an[0][var4].m) {
                  ++var1;
               }
            }

            this.af.a(var1 == 0);
         } else if (super.a.b == 2) {
            this.ag[2][0].a();
            var1 = 0;

            for(var4 = 0; var4 < this.an[1].length; ++var4) {
               if (this.an[1][var4].m) {
                  ++var1;
               }
            }

            this.af.a(var1 == 0);
         }
      }

      if (GameSrc.gI().idTask == 5 && GameSrc.gI().idStep == 2) {
         this.y();
      }

      vdtt_bb var5 = this.W;
      var2 = GameSrc.gI().cb;
      var5.m = var2;
   }

   private Member i(int var1) {
      Member var2 = null;
      if (var1 >= 0) {
         if (this.ah.h() == 1) {
            var2 = (Member)((mParty)this.Y.elementAt(var1)).vMember.firstElement();
         } else {
            var2 = (Member)GameSrc.gI().bq.vMember.elementAt(var1);
         }
      }

      return var2;
   }

   private static void K() {
      try {
         (new Message((byte)45)).send();
      } catch (Exception var1) {
         Utlis.a(var1);
      }

   }
}
