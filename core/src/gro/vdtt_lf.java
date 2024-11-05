package gro;

import java.util.Collections;
import java.util.Vector;

public final class vdtt_lf extends vdtt_ka {
   private String[] V;
   private vdtt_in W;
   private vdtt_hp[] X;
   private vdtt_hp[][] Y;
   private Vector Z;
   private boolean aa;
   public Vector S;
   public Vector T;
   public Vector U;
   private vdtt_bb ab;
   private vdtt_bb ac;
   private static int ad;
   private vdtt_bb[][] ae;
   private int af;

   public vdtt_lf(MainScreen var1, int var2) {
      super(var1, 4, new String[]{Caption.K});
      this.V = Caption.Bv;
      this.aa = true;
      this.S = new Vector();
      this.T = new Vector();
      this.U = new Vector();
      this.H = var1;
      this.J = false;
      this.a(300, 220);
      this.W = new vdtt_in(new vdtt_hm(1001, this.V), 10, this.f() + 6, super.width - 8 - 12, 23, 33, this);
      this.W.c = this.h() - 12;
      this.ab = this.a(34, this.f() + this.h() - 20, Caption.gX, 100);
      vdtt_ay var3;
      (var3 = this.a(this.width - 68, this.f() + this.h() - 23, Caption.hv, this, 1004, 7)).setSize(60, 20);
      this.W.a(var3, 0);
      this.W.a(var3, 1);
      (var3 = this.a(this.width - 132, this.f() + this.h() - 23, Caption.qS, this, 1005, 7)).setSize(60, 20);
      this.W.a(var3, 0);
      vdtt_bb var4 = this.ab;
      boolean var5 = Binary.g("friend" + Char.gI().idEntity);
      var4.m = var5;
      this.W.a(this.ab, 0);
      this.ac = this.a(9, this.f() + this.h() - 20, Caption.gX, 100);
      var4 = this.ac;
      var5 = Binary.g("enermy" + Char.gI().idEntity);
      var4.m = var5;
      this.W.a(this.ac, 1);
      this.W.a(this.a(9, this.f() + this.h() - 22, "", this, 1002, 65), 0);
      this.ae = new vdtt_bb[2][];
      this.Y = new vdtt_hp[2][];
      this.X = new vdtt_hp[3];
      this.B();
      this.C();
      this.U.clear();
      this.U.add(Char.gI());
      this.U.addAll(GameSrc.gI().vChar);
      this.X[2] = new vdtt_hp((byte)1, 8, this.f() + 30, super.width - 8 - 8, 126, 42, this.U.size());
      var5 = false;
      this.W.a(super.b[0]);
      this.f(0);
   }

   private void B() {
      this.S.clear();
      int var1;
      if (this.ab.m) {
         for(var1 = 0; var1 < GameSrc.gI().vFriend.size(); ++var1) {
            Friend var2;
            if ((var2 = (Friend)GameSrc.gI().vFriend.elementAt(var1)).isOnline) {
               this.S.add(var2);
            }
         }
      } else {
         this.S.addAll(GameSrc.gI().vFriend);
      }

      Binary.a("friend" + Char.gI().idEntity, this.ab.m);
      Collections.sort(this.S, Friend.a);
      this.af = 21;
      this.X[0] = new vdtt_hp((byte)1, 8, this.f() + 30, super.width - 8 - 8, this.af * 6, this.af, this.S.size());
      this.ae[0] = new vdtt_bb[GameSrc.gI().vFriend.size()];
      this.Y[0] = new vdtt_hp[GameSrc.gI().vFriend.size()];

      for(var1 = 0; var1 < GameSrc.gI().vFriend.size(); ++var1) {
         this.ae[0][var1] = new vdtt_bb(2, 2 + var1 * this.X[0].h, "", this, 0);
         this.Y[0][var1] = new vdtt_hu((byte)1, 0, 0, this.ae[0][var1].width, this.ae[0][var1].height, this.ae[0][var1].height, 1, this.X[0]);
      }

   }

   private void C() {
      this.T.clear();
      int var1;
      if (this.ac.m) {
         for(var1 = 0; var1 < GameSrc.gI().vEnemy.size(); ++var1) {
            Enemy var2;
            if ((var2 = (Enemy)GameSrc.gI().vEnemy.elementAt(var1)).isOnline) {
               this.T.add(var2);
            }
         }
      } else {
         this.T.addAll(GameSrc.gI().vEnemy);
      }

      Binary.a("enermy" + Char.gI().idEntity, this.ac.m);
      Collections.sort(this.T, Enemy.a);
      this.af = 21;
      this.X[1] = new vdtt_hp((byte)1, 8, this.f() + 30, super.width - 8 - 8, this.af * 6, this.af, this.T.size());
      this.ae[1] = new vdtt_bb[GameSrc.gI().vEnemy.size()];
      this.Y[1] = new vdtt_hp[GameSrc.gI().vEnemy.size()];

      for(var1 = 0; var1 < GameSrc.gI().vEnemy.size(); ++var1) {
         this.ae[1][var1] = new vdtt_bb(2, 2 + var1 * this.X[1].h, "", this, 0);
         this.Y[1][var1] = new vdtt_hu((byte)1, 0, 0, this.ae[1][var1].width, this.ae[1][var1].height, this.ae[1][var1].height, 1, this.X[1]);
      }

   }

   public final void d() {
      super.d();
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      super.b(var1, var2, var3);
      if (super.a.b == 0) {
         this.c(var1, var2);
         vdtt_lf var4;
         vdtt_hm var5;
         switch(var1) {
         case 100:
            this.B();
            this.C();
            return;
         case 2001:
            var5 = (vdtt_hm)var2;
            var4 = this;

            try {
               Message var6;
               if (var4.W.h() != 0) {
                  if (var4.W.h() == 1) {
                     (var6 = new Message((byte)-18)).writeUTF(var4.h(var5.a));
                     var6.send();
                  }
                  break;
               }

               (var6 = new Message((byte)76)).writeUTF(var4.h(var5.a));
               var6.send();
            } catch (Exception var8) {
               Utlis.a(var8);
            }

            return;
         case 2005:
            var5 = (vdtt_hm)var2;
            var4 = this;

            try {
               GameSrc.gI();
               GameSrc.e(var4.h(var5.a));
               break;
            } catch (Exception var7) {
               Utlis.a(var7);
               return;
            }
         case 2007:
            return;
         case 2008:
            var5 = (vdtt_hm)var2;
            GameSrc.gI();
            this.h(var5.a);
         }
      }

   }

   private void D() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.ae[this.W.h()].length; ++var2) {
         if (this.ae[this.W.h()][var2].m) {
            this.g(var2);
            ++var1;
         }
      }

      if (var1 == 0) {
         DataCenter.gI().currentScreen.c(Caption.qa, -65536);
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      if (this.aa) {
         super.b(var1);
      } else {
         this.a(var1, this.cx, this.cy, this.width, this.height, Caption.K, (byte)2, this.J);
      }

      if (super.a.b == 0) {
         try {
            this.W.a(var1);
            this.a(var1, this.cx + 4, this.cy + this.f() + 22);
            this.a(var1, this.X[this.W.h()]);

            for(int var2 = 0; var2 < this.X[this.W.h()].i; ++var2) {
               if (this.X[this.W.h()].b(var2)) {
                  if (var2 == this.X[this.W.h()].k && this.W.h() != 2) {
                     vdtt_cz.a(var1, 0, var2 * this.X[this.W.h()].h, this.X[this.W.h()].width, this.X[this.W.h()].h - 1);
                  }

                  int var3;
                  int var4;
                  switch(this.W.h()) {
                  case 0:
                     Friend var5 = (Friend)this.Z.elementAt(var2);
                     int var6 = var2;
                     Graphics var7 = var1;
                     vdtt_lf var8 = this;

                     try {
                        if (var5.isOnline) {
                           vdtt_cz.a(var7, 302, 0, 22, 6 + var6 * var8.X[var8.W.h()].h, 20);
                        } else if (var5.type == 1) {
                           vdtt_cz.a(var7, 304, 0, 22, 6 + var6 * var8.X[var8.W.h()].h, 20);
                        } else {
                           vdtt_cz.a(var7, 303, 0, 22, 6 + var6 * var8.X[var8.W.h()].h, 20);
                        }

                        if (var6 == var8.X[var8.W.h()].l) {
                           vdtt_dd.b(vdtt_dd.d, var7, var5.name + (var5.type == 2 ? Caption.gZ : ""), 35, 10 + var6 * var8.X[var8.W.h()].h, 0, -3089954, -16777216);
                        } else {
                           vdtt_dd.b(vdtt_dd.d, var7, var5.name + (var5.type == 2 ? Caption.gZ : ""), 34, 11 + var6 * var8.X[var8.W.h()].h, 0, -3089954, -16777216);
                        }

                        var4 = var7.e;
                        var3 = var7.f;
                        var8.a(var7, var4 + var8.ae[var8.W.h()][var6].cx, var3 + var8.ae[var8.W.h()][var6].cy);
                        var8.ae[var8.W.h()][var6].b(var7);
                        var8.a(var7, var4, var3);
                     } catch (Exception var14) {
                        Utlis.a(var14);
                     }
                     break;
                  case 1:
                     Enemy var9 = (Enemy)this.Z.elementAt(var2);
                     if (var9.isOnline) {
                        vdtt_cz.a(var1, 302, 0, 22, 6 + var2 * this.X[this.W.h()].h, 20);
                     } else {
                        vdtt_cz.a(var1, 304, 0, 22, 6 + var2 * this.X[this.W.h()].h, 20);
                     }

                     if (var2 == this.X[this.W.h()].l) {
                        vdtt_dd.b(vdtt_dd.d, var1, var9.name, 35, 10 + var2 * this.X[this.W.h()].h, 0, -1, -16777216);
                     } else {
                        vdtt_dd.b(vdtt_dd.d, var1, var9.name, 34, 11 + var2 * this.X[this.W.h()].h, 0, -1, -16777216);
                     }

                     var4 = var1.e;
                     var3 = var1.f;
                     this.a(var1, var4 + this.ae[this.W.h()][var2].cx, var3 + this.ae[this.W.h()][var2].cy);
                     this.ae[this.W.h()][var2].b(var1);
                     this.a(var1, var4, var3);
                     break;
                  case 2:
                     Char var10 = (Char)this.Z.elementAt(var2);
                     boolean var11 = var2 == this.X[this.W.h()].k;
                     this.a(var1, 0, var2 * this.X[this.W.h()].h, this.X[this.W.h()].width, 40, 46, 22, 23, 1, 1);
                     if (var11) {
                        vdtt_cz.a(var1, 1, var2 * this.X[this.W.h()].h + 1, this.X[this.W.h()].width - 2, 38);
                     }

                     vdtt_y.a(var1, var10.ag(), 0, 10, var2 * this.X[this.W.h()].h + 5, 83);
                     var3 = var2 == this.X[this.W.h()].k ? -2560 : -1;
                     var4 = 46;
                     int var13 = var2 * this.X[this.W.h()].h + 10;
                     if (var2 == this.X[this.W.h()].l && !var10.name.equals(Char.gI().name)) {
                        ++var4;
                        ++var13;
                     }

                     vdtt_dd.a(vdtt_dd.d, var1, Caption.zc[3] + " " + var10.name, var4, var13, 0, var3);
                     vdtt_dd.a(vdtt_dd.d, var1, Caption.zc[5] + " " + var10.w(), var4, var13 + 10, 0, var3);
                     vdtt_dd.a(vdtt_dd.d, var1, Caption.zc[4] + " " + DataCenter.gI().dataNameChar[var10.sys].name, var4, var13 + 20, 0, var3);
                  }
               }
            }
         } catch (Exception var15) {
         }

         this.a(var1);
         this.a(var1, this.cx + 4, this.cy + this.f());
         switch(this.W.h()) {
         case 0:
            vdtt_dd.a(vdtt_dd.d, var1, Caption.pH + this.Z.size(), 112, this.h() - 13, 0, -1);
            this.X[this.W.h()].b(var1, this);
            return;
         case 1:
            vdtt_dd.a(vdtt_dd.d, var1, Caption.pH + this.Z.size(), 97, this.h() - 13, 0, -1);
            this.X[this.W.h()].b(var1, this);
            return;
         case 2:
            vdtt_dd.a(vdtt_dd.d, var1, Caption.gY + this.U.size(), 10, this.h() - 10, 0, -1);
         }
      }

   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         this.W.e();

         for(int var1 = 0; var1 < this.X.length; ++var1) {
            this.X[this.W.h()].a();
         }
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (!this.aa) {
         var1.removeElementAt(0);
      }

      if (super.a.b == 0) {
         if (this.W.h() < 2) {
            for(int var2 = 0; var2 < this.Y[this.W.h()].length; ++var2) {
               int var3 = this.X[this.W.h()].cx + this.ae[this.W.h()][var2].cx;
               int var4 = this.X[this.W.h()].cy + this.ae[this.W.h()][var2].cy - this.X[this.W.h()].f;
               if (Utlis.a(this.X[this.W.h()].cx, this.X[this.W.h()].cy, this.X[this.W.h()].cx + this.X[this.W.h()].width, this.X[this.W.h()].cy + this.X[this.W.h()].height, var3, var4) && Utlis.a(this.X[this.W.h()].cx, this.X[this.W.h()].cy, this.X[this.W.h()].cx + this.X[this.W.h()].width, this.X[this.W.h()].cy + this.X[this.W.h()].height, var3 + this.ae[this.W.h()][var2].width, var4 + this.ae[this.W.h()][var2].height)) {
                  this.Y[this.W.h()][var2].cx = (short)var3;
                  this.Y[this.W.h()][var2].cy = (short)var4;
                  var1.addElement(this.Y[this.W.h()][var2].a(8000 + var2, this));
               }
            }
         }

         var1.addElement(this.W.f());
         var1.addElement(this.X[this.W.h()].a(1003, this));
      }

      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      int var4;
      if (var1.b >= 8000 && var1.b < 9000) {
         var4 = var1.b - 8000;
         vdtt_bb var8 = this.ae[this.W.h()][var4];
         boolean var10 = !this.ae[this.W.h()][var4].m;
         var8.m = var10;
      } else if (super.a.b == 0) {
         switch(var1.b) {
         case 1001:
            if (var1.j.k >= 0) {
               ad = var1.j.k;
               this.W.a(var1.j.k);
               this.F();
               return;
            }
            break;
         case 1002:
            return;
         case 1003:
            if (var1.j.k >= 0) {
               var4 = var3;
               var3 = var2;
               var2 = var1.j.k;
               Vector var5 = new Vector();
               String var6 = "";
               if (this.W.h() == 0) {
                  Friend var7;
                  if ((var7 = (Friend)this.S.elementAt(var2)).type == 2) {
                     var5.addElement(new vdtt_ir(2000, Caption.ha));
                     var5.addElement(new vdtt_ir(2001, Caption.hb));
                  }

                  if (var7.type < 2) {
                     var5.addElement(new vdtt_ir(2001, Caption.hc));
                  }

                  if (GameSrc.gI().bq != null && !GameSrc.gI().bq.isEmpty()) {
                     if (GameSrc.gI().bq.isLeader() && !GameSrc.gI().bq.isMember(var7.name)) {
                        var5.addElement(new vdtt_ir(2005, Caption.ex));
                     }
                  } else {
                     var5.addElement(new vdtt_ir(2005, Caption.ew));
                  }

                  var6 = a(var5, var7.name);
               } else if (this.W.h() == 1) {
                  Enemy var9 = (Enemy)this.Z.elementAt(var2);
                  var5.addElement(new vdtt_ir(2001, Caption.hd));
                  if (GameSrc.gI().bq != null && !GameSrc.gI().bq.isEmpty()) {
                     if (GameSrc.gI().bq.isLeader() && !GameSrc.gI().bq.isMember(var9.name)) {
                        var5.addElement(new vdtt_ir(2005, Caption.ex));
                     }
                  } else {
                     var5.addElement(new vdtt_ir(2005, Caption.cj));
                  }

                  var6 = a(var5, var9.name);
               } else {
                  Char var11;
                  if (this.W.h() == 2 && !(var11 = (Char)this.Z.elementAt(var2)).equals(Char.gI())) {
                     if (GameSrc.gI().bq != null && !GameSrc.gI().bq.isEmpty()) {
                        if (GameSrc.gI().bq.isLeader() && !GameSrc.gI().bq.isMember(var11.name)) {
                           var5.addElement(new vdtt_ir(2005, Caption.ex));
                        }
                     } else {
                        var5.addElement(new vdtt_ir(2005, Caption.cj));
                     }

                     var6 = a(var5, var11.name);
                  }
               }

               this.a(var5, var6, var2, var3, var4);
               return;
            }
            break;
         case 1004:
            this.D();
            return;
         case 1005:
            this.E();
         }
      }

   }

   private void E() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.S.size(); ++var2) {
         if (((Friend)this.S.get(var2)).type == 2) {
            this.g(var2);
            ++var1;
         }
      }

      DataCenter.gI().currentScreen.c(Utlis.b(Caption.qT, String.valueOf(var1)), -1);
   }

   public final void f(int var1) {
      super.f(var1);
      if (this.W != null && super.a.b == 0) {
         this.W.a(ad);
         this.F();
      }

   }

   private void F() {
      if (this.W != null) {
         switch(this.W.h()) {
         case 0:
            this.Z = this.S;
            return;
         case 1:
            this.Z = this.T;
            return;
         case 2:
            this.Z = this.U;
         }
      }

   }

   private void g(int var1) {
      try {
         Message var2;
         if (this.W.h() != 0) {
            if (this.W.h() == 1) {
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
         if (this.W.h() == 0) {
            return ((Friend)this.Z.elementAt(var1)).name;
         }

         if (this.W.h() == 1) {
            return ((Enemy)this.Z.elementAt(var1)).name;
         }

         if (this.W.h() == 2) {
            return ((Char)this.U.elementAt(var1)).name;
         }
      } catch (Exception var3) {
         Utlis.a(var3);
      }

      return "";
   }
}
