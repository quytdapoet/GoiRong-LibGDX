package gro;

import com.badlogic.gdx.graphics.Pixmap;
import java.util.Vector;

public final class vdtt_bu extends vdtt_k {
   public vdtt_hp l;
   public vdtt_ir[] m;
   public Vector n = new Vector();
   private boolean K;
   private boolean L;
   public static mImage H;
   private boolean M;
   private String N = "";
   private int O;
   private int P;
   public static int I = -1;
   public boolean[] J = new boolean[7];

   public vdtt_bu(int var1, int var2, int var3, int var4, vdtt_w var5) {
      this.setXY(var1, var2);
      this.setSize(110, 31);
      this.a = var5;
      this.l = new vdtt_hp((byte)1, 0, 2, 110, 33, 11, 0, true);
      this.d();
   }

   public final void c(boolean var1) {
      GameSrc.gI().r(GameSrc.gI().cI);
      mConfig.gI().a(13, var1);
      this.d();
   }

   public final void a(int var1) {
      this.l.a(var1);
   }

   public final void d() {
      this.n.clear();
      Vector var1 = new Vector();
      Vector var2 = new Vector();
      Vector var3 = new Vector();
      Vector var4 = new Vector();
      Vector var5 = new Vector();
      Vector var6 = new Vector();
      Vector var7 = new Vector();
      this.N = Caption.jN;
      if (GameSrc.gI().idTask < DataCenter.gI().task.length) {
         Task var8 = DataCenter.gI().task[GameSrc.gI().idTask];
         String var9 = "c#cyan" + this.N + "c#white" + var8.b;
         var1.addElement(var9);
         NpcTemplate var10 = DataCenter.gI().npcTemplate[var8.d];
         if (GameSrc.gI().idStep < 0) {
            var1.addElement("c#white" + Caption.jO + "c#task" + var10.name + "c#white" + Caption.jQ);
            this.n.addElement(new vdtt_dv(var8.d, -1, -1, var8.e, var8.f, var8.g));
         } else if (Char.gI().w() < var8.c) {
            var1.addElement("c#red" + Caption.jR + DataCenter.gI().a(var8.c));
            this.n.addElement(new vdtt_dv(-1, -1, -1, Integer.MIN_VALUE, 0, 0));
         } else if (GameSrc.gI().idStep >= var8.p.size()) {
            var1.addElement("c#white" + Caption.uD + "c#task" + Caption.uE + "c#white" + Caption.uF);
            this.n.addElement(new vdtt_dv(-32768, -1, -1, var8.e, var8.f, var8.g));
         } else {
            vdtt_ii var11;
            if ((var11 = (vdtt_ii)var8.p.elementAt(GameSrc.gI().idStep)).b.length() > 0) {
               this.n.addElement(new vdtt_dv(var11.d, var11.b(), var11.e, var11.f, var11.g, var11.h));
               if (var11.i <= 1) {
                  var1.addElement("c#blue- c#task" + var11.b);
               } else {
                  var1.addElement("c#blue- c#task" + var11.b + " " + GameSrc.gI().numStepDone + "/" + var11.i);
               }
            }

            if (GameSrc.gI().idTask == 18) {
               var1.add("c#white" + Caption.ww);
            }
         }
      }

      this.N = Caption.mE;
      this.c(var2);
      this.d(var3);
      this.e(var4);
      this.f(var5);
      this.g(var6);
      this.h(var7);
      Vector var12 = new Vector();
      if (var1.size() > 0) {
         var12.addAll(this.b(var1));
         this.J[0] = true;
      }

      if (var2.size() > 0) {
         var12.addAll(this.b(var2));
         this.J[1] = true;
      }

      if (var3.size() > 0) {
         var12.addAll(this.b(var3));
         this.J[1] = true;
      }

      if (var4.size() > 0) {
         var12.addAll(this.b(var4));
         this.J[3] = true;
      }

      if (var5.size() > 0) {
         var12.addAll(this.b(var5));
         this.J[4] = true;
      }

      if (var6.size() > 0) {
         var12.addAll(this.b(var6));
         this.J[5] = true;
      }

      if (var7.size() > 0) {
         var12.addAll(this.b(var7));
         this.J[6] = true;
      }

      if (var12.size() == 0) {
         var12.add(new vdtt_ir(1, Caption.jP));
      }

      this.m = new vdtt_ir[var12.size()];

      for(int var13 = 0; var13 < var12.size(); ++var13) {
         this.m[var13] = (vdtt_ir)var12.elementAt(var13);
      }

      this.setSize(112, 39);
      this.l.a(this.l.g, this.l.h, this.m.length);
      this.M = false;
   }

   private Vector b(Vector var1) {
      Vector var2 = new Vector();

      int var3;
      for(var3 = 0; var3 < var1.size(); ++var3) {
         String var4;
         (var4 = Caption.a(String.valueOf(var1.elementAt(var3)))).contains("c#task");
         Vector var5 = new Vector();
         if (!var4.contains(Caption.jN) && !var4.contains(Caption.mE)) {
            var5 = vdtt_dd.a(vdtt_dd.b, var4, this.l.width - 8);
         } else {
            var5.add(var4);
         }

         for(int var6 = 0; var6 < var5.size(); ++var6) {
            (var4 = (String)var5.elementAt(var6)).contains("c#task");
            var2.add(new vdtt_ir(1, var4));
            if (var2.size() >= 3) {
               return var2;
            }
         }
      }

      if (var2.size() > 0) {
         for(var3 = var2.size(); var3 < 3; ++var3) {
            var2.add(new vdtt_ir(1, ""));
         }
      }

      return var2;
   }

   private boolean c(Vector var1) {
      if (Char.gI().ab > 0) {
         var1.addElement("c#yellow" + this.N + "c#white" + Caption.jS + (10 - Char.gI().ab) + "/10");
         if (GameSrc.gI().taskTuanHoan == null) {
            var1.addElement("c#white" + Caption.jO + "c#task" + DataCenter.gI().npcTemplate[102].name + "c#white" + Caption.jQ);
            this.n.addElement(new vdtt_dv(102, -1, -1, 67, 0, 0));
         } else {
            String var2 = GameSrc.gI().taskTuanHoan.m;
            if (GameSrc.gI().taskTuanHoan.j > 1) {
               var2 = var2 + " " + GameSrc.gI().taskTuanHoan.c + "/" + GameSrc.gI().taskTuanHoan.j;
               if (GameSrc.gI().taskTuanHoan.b == 12) {
                  var2 = var2 + "c#white (" + DataCenter.gI().mapTemplate[GameSrc.gI().taskTuanHoan.g].name + ")";
               }
            }

            if (GameSrc.gI().taskTuanHoan.a()) {
               var1.addElement("c#white" + Caption.jO + "c#task" + DataCenter.gI().npcTemplate[102].name + "c#white" + Caption.jU);
               this.n.addElement(new vdtt_dv(102, -1, -1, 67, 0, 0));
            } else {
               var1.addElement("c#blue  - c#task" + var2);
               this.n.addElement(new vdtt_dv(GameSrc.gI().taskTuanHoan.e, GameSrc.gI().taskTuanHoan.d, GameSrc.gI().taskTuanHoan.f, GameSrc.gI().taskTuanHoan.g, GameSrc.gI().taskTuanHoan.h, GameSrc.gI().taskTuanHoan.i));
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean d(Vector var1) {
      if (GameSrc.gI().bC != null) {
         var1.addElement("c#yellow" + this.N + "c#white" + Caption.ns);
         String var2 = "";
         if (GameSrc.gI().bC.a == 0) {
            var2 = Caption.vY;
            if (GameSrc.gI().bC.j > 1) {
               var2 = var2 + " " + GameSrc.gI().bC.c + "/" + GameSrc.gI().bC.j;
            }

            var2 = var2 + Caption.wt;
         } else if (GameSrc.gI().bC.a == 1) {
            var2 = Caption.vZ;
            if (GameSrc.gI().bC.j > 1) {
               var2 = var2 + " " + GameSrc.gI().bC.c + "/" + GameSrc.gI().bC.j;
            }

            var2 = var2 + Caption.wu;
         } else if (GameSrc.gI().bC.a == 2) {
            var2 = Caption.wa;
            if (GameSrc.gI().bC.j > 1) {
               var2 = var2 + " " + GameSrc.gI().bC.c + "/" + GameSrc.gI().bC.j;
            }

            var2 = var2 + Caption.wv;
         }

         if (GameSrc.gI().bC.a()) {
            var1.addElement("c#white" + Caption.jO + "c#task" + DataCenter.gI().npcTemplate[60].name + "c#white" + Caption.jU);
            this.n.addElement(new vdtt_dv(60, -1, -1, 56, 0, 0));
         } else {
            var1.addElement("c#green  - c#task" + var2);
            this.n.addElement(new vdtt_dv(-1, -1, -1, -2, 0, 0));
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean e(Vector var1) {
      if (GameSrc.gI().bA != null) {
         var1.addElement("c#yellow" + this.N + "c#white" + Caption.wi);
         String var2 = Caption.wk + " " + GameSrc.gI().bA.c + "/" + GameSrc.gI().bA.j;
         if (GameSrc.gI().bA.a()) {
            var1.addElement("c#white" + Caption.jO + "c#task" + DataCenter.gI().npcTemplate[38].name + "c#white" + Caption.jU);
            this.n.addElement(new vdtt_dv(38, -1, -1, 55, 0, 0));
         } else {
            var1.addElement("c#green  - c#task" + var2);
            byte var3 = 55;
            short var4 = 163;
            if (Char.gI().w() >= 28) {
               var3 = 63;
               var4 = 167;
            } else if (Char.gI().w() >= 26) {
               var3 = 65;
               var4 = 166;
            } else if (Char.gI().w() >= 24) {
               var3 = 64;
               var4 = 165;
            }

            this.n.addElement(new vdtt_dv(-1, -1, var4, var3, 0, 0));
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean f(Vector var1) {
      if (GameSrc.gI().bB != null) {
         var1.addElement("c#yellow" + this.N + "c#white" + Caption.wj);
         String var2 = Caption.wl + " " + GameSrc.gI().bB.c + "/" + GameSrc.gI().bB.j;
         if (GameSrc.gI().bB.a()) {
            var1.addElement("c#white" + Caption.jO + "c#task" + DataCenter.gI().npcTemplate[36].name + "c#white" + Caption.jU);
            this.n.addElement(new vdtt_dv(36, -1, -1, 88, 0, 0));
         } else {
            var1.addElement("c#green  - c#task" + var2);
            this.n.addElement(new vdtt_dv(-1, -1, -1, -2, 0, 0));
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean g(Vector var1) {
      if (GameSrc.gI().bD != null) {
         var1.addElement("c#yellow" + this.N + "c#white" + Caption.wE);
         String var2 = "";
         switch(GameSrc.gI().bD.b) {
         case 6:
            var2 = Caption.BN[0];
            break;
         case 7:
            var2 = Caption.BN[1];
            break;
         case 8:
            var2 = Caption.BN[2];
            break;
         case 9:
            var2 = Caption.BN[3];
            break;
         case 10:
            var2 = Caption.BN[4];
         }

         var2 = var2 + " " + GameSrc.gI().bD.c + "/" + GameSrc.gI().bD.j;
         if (GameSrc.gI().bD.a()) {
            var1.addElement("c#white" + Caption.jO + "c#task" + DataCenter.gI().npcTemplate[23].name + "c#white" + Caption.jU);
            this.n.addElement(new vdtt_dv(23, -1, -1, 58, 0, 0));
         } else {
            var1.addElement("c#green  - c#task" + var2);
            this.n.addElement(new vdtt_dv(-1, -1, -1, -2, 0, 0));
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean h(Vector var1) {
      if (GameSrc.gI().bE != null) {
         String var2 = "";
         var1.addElement("c#yellow" + this.N + "c#white" + Caption.xo);
         if (GameSrc.gI().bE.e >= 0) {
            var2 = Caption.km;
            if (GameSrc.gI().bE.b == 66) {
               var2 = var2 + Caption.xV + "c#task" + DataCenter.gI().npcTemplate[GameSrc.gI().bE.e].name;
            } else {
               var2 = var2 + " c#task" + DataCenter.gI().npcTemplate[GameSrc.gI().bE.e].name + Caption.ji;
            }
         } else if (GameSrc.gI().bE.d >= 0) {
            var2 = Caption.km;
            var2 = var2 + " c#task" + DataCenter.gI().itemTemplate[GameSrc.gI().bE.d].name + Caption.xp;
         }

         if (GameSrc.gI().bE.a()) {
            var1.addElement("c#white" + Caption.jO + "c#task" + DataCenter.gI().npcTemplate[76].name + "c#white" + Caption.jU);
            this.n.addElement(new vdtt_dv(76, -1, -1, 86, 0, 0));
         } else {
            var1.addElement("c#green  - c#task" + var2);
            this.n.addElement(new vdtt_dv(-1, -1, -1, -2, 0, 0));
         }

         return true;
      } else {
         return false;
      }
   }

   public final void b(Graphics var1) {
      try {
         if (!this.M) {
            this.M = true;
            Binary.b(H);
            Pixmap var2 = (H = mImage.a(this.width * DataCenter.gI().r, this.height * DataCenter.gI().r)).b;
            GameSrc.gI().a(var2, this, 0, 0, 0);
            if (this.m.length > 3) {
               this.l.a(var1, this, 3);
               var2.setColor(Utlis.b((long)this.l.I));
               var2.fillRectangle(this.l.J * DataCenter.gI().r, this.l.K * DataCenter.gI().r, 2 * DataCenter.gI().r, this.l.L * DataCenter.gI().r);
            }

            GameSrc.gI().aA.a(this.width, (short)(this.height + 14));
            DataCenter.gI().aQ = false;
         }

         if (GameSrc.gI().aA.e()) {
            var1.a(H, 0, 0);
         } else if (!GameSrc.gI().aA.d()) {
            return;
         }

         this.a(var1, this.l);

         for(int var4 = 0; var4 < this.m.length; ++var4) {
            if (this.l.l != -1) {
               if (this.l.b(var4)) {
                  vdtt_dd.d(vdtt_dd.b, var1, this.m[var4].b, 4, var4 * this.l.h + this.l.h / 2, 0, -1, -10275328);
               }
            } else if (var4 >= this.l.j && var4 < this.l.j + 3) {
               vdtt_dd.d(vdtt_dd.b, var1, this.m[var4].b, 4, var4 * this.l.h + this.l.h / 2, 0, -1, -10275328);
            }
         }

         this.a(var1);
         this.l.a(var1, this, 3, false);
      } catch (Exception var3) {
      }

   }

   public final void a_() {
      int var2;
      if (this.l != null) {
         this.l.a();
         if (this.l.l == -1) {
            int var1 = this.l.j;
            if (this.l.j % 3 != 0) {
               var1 = this.l.j / 3 * 3;
               if (this.l.j > this.O) {
                  var1 += 3;
               }
            }

            this.l.a(var1);
         }

         if (I >= 0) {
            String[] var5 = new String[]{Caption.jS, "", Caption.ns, Caption.wi, Caption.wj, Caption.jN, Caption.wE, Caption.wE, Caption.wE, Caption.wE, Caption.wE, Caption.xo};

            for(var2 = 0; var2 < this.m.length; ++var2) {
               if (this.m[var2].b.contains(var5[I])) {
                  this.l.a(var2);
                  break;
               }
            }

            I = -1;
         }

         if (this.l.l == -1) {
            this.O = this.l.j;
         }

         if (this.l.p) {
            this.P = 5;
         } else if (this.P > 0) {
            --this.P;
         }
      }

      if (GameSrc.gI().aA.d()) {
         DataCenter.gI();
         if (!DataCenter.b()) {
            MainScreen var6;
            if ((var6 = (MainScreen)this.a).b.size() > 0 && var6.b.lastElement().equals(GameSrc.gI()) || var6.b.size() == 2 && var6.b.lastElement() instanceof vdtt_v) {
               this.J[0] = true;
               if (GameSrc.gI().mapID == 51 || this.l.j >= 3) {
                  DataCenter.gI().pointHelper.b = false;
                  return;
               }

               if (!GameSrc.gI().V()) {
                  var2 = this.cx + 40;
                  DataCenter.gI().pointHelper.a(var2, this.cy + 15);
                  DataCenter.gI().pointHelper.b = true;
               }

               vdtt_ii var3 = GameSrc.gI().T();
               Task var4 = GameSrc.gI().S();
               if (GameSrc.gI().idStep != 0 || Char.gI().w() >= var4.c) {
                  switch(GameSrc.gI().idTask) {
                  case 1:
                     var2 = this.cx + 40;
                     DataCenter.gI().pointHelper.a(var2, this.cy + 15);
                     DataCenter.gI().pointHelper.b = true;
                     break;
                  case 2:
                  case 3:
                     switch(GameSrc.gI().idStep) {
                     case 0:
                        if ((var3 == null || Char.gI().cx != var3.g || Char.gI().cy != var3.h) && GameSrc.gI().numStepDone <= 0) {
                           this.K = false;
                        } else {
                           this.K = true;
                        }
                        break;
                     case 1:
                        this.K = false;
                        var2 = this.cx + 40;
                        DataCenter.gI().pointHelper.a(var2, this.cy + 15);
                        DataCenter.gI().pointHelper.b = true;
                     }
                  case 4:
                  case 5:
                  case 6:
                  case 7:
                  case 8:
                  default:
                     break;
                  case 9:
                     var2 = this.cx + 50;
                     DataCenter.gI().pointHelper.a(var2, this.cy + 15);
                     DataCenter.gI().pointHelper.b = true;
                  }

                  if (!this.L && GameSrc.gI().aD == 1) {
                     var2 = this.cx + 30;
                     DataCenter.gI().pointHelper.a(var2, this.cy + 10);
                     DataCenter.gI().pointHelper.b = true;
                     return;
                  }

                  if (GameSrc.gI().aD != 1 && !this.K) {
                     return;
                  }
               }

               DataCenter.gI().pointHelper.b = false;
            }

            return;
         }
      }

      DataCenter.gI().pointHelper.b = false;
   }

   public final Vector g() {
      Vector var1 = new Vector();
      if (!GameSrc.gI().aA.d()) {
         return var1;
      } else {
         if (this.n.size() != 0) {
            var1.addElement(new vdtt_hi(4000, 0, 0, this.width, this.height, this.l, this));
         }

         return var1;
      }
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      switch(var1.b) {
      case 4000:
         if (Char.gI().bC) {
            return;
         }

         if (var1.j.k >= 0 && this.P == 0) {
            SettingsTab.K().a(false);
            this.b(var1.j.k / 3);
            return;
         }
         break;
      case 4002:
         DataCenter.gI().currentScreen.b(Caption.sb);
      }

   }

   public final boolean f() {
      try {
         if (I == 0) {
            I = 1;
            this.d();
            new Vector();
            I = 2;
            this.d();
            if (!this.d(new Vector())) {
               I = 0;
               return true;
            }
         } else {
            if (I != 1) {
               if (I == 2) {
                  I = 0;
                  return true;
               }

               return true;
            }

            I = 2;
            this.d();
            if (!this.d(new Vector())) {
               I = 0;
               return true;
            }
         }
      } catch (Exception var2) {
      }

      return false;
   }

   public final void r() {
      super.r();
      this.p.b = -1;
   }

   private vdtt_dv b(int var1) {
      vdtt_dv var2 = null;

      try {
         if (Char.gI().isDie()) {
            return null;
         }

         vdtt_dv var3;
         if (GameSrc.gI().cA != null) {
            var3 = new vdtt_dv(GameSrc.gI().mapID, GameSrc.gI().cA.cx, GameSrc.gI().cA.cy);
         } else {
            if ((var3 = (vdtt_dv)this.n.elementAt(var1)).a == -32768) {
               Message.c((byte)-11).send();
               return null;
            }

            if (var3.d == Integer.MIN_VALUE) {
               if (Char.gI().w() >= 20 && Char.gI().w() < 29) {
                  DataCenter.gI().currentScreen.b(Caption.wn);
               } else if (Char.gI().w() >= 30 && Char.gI().w() < 39) {
                  DataCenter.gI().currentScreen.b(Caption.wo);
               } else if (Char.gI().w() >= 15) {
                  DataCenter.gI().currentScreen.b(Caption.wp);
               } else {
                  DataCenter.gI().currentScreen.b(Caption.sb);
               }

               return null;
            }

            if (var3.a >= 0) {
               if (GameSrc.gI().l(var3.a) != null) {
                  var3.d = GameSrc.gI().mapID;
               }

               if (var3.d < 0) {
                  GameSrc.gI();
                  GameSrc.b(var3);
               }
            }
         }

         var2 = var3.a();
         GameSrc.gI().a(var2, var1 == 0 && this.J[0]);
      } catch (Exception var4) {
         Utlis.a(var4);
      }

      return var2;
   }
}
