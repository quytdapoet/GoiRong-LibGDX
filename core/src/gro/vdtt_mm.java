package gro;

import java.util.Vector;

public final class vdtt_mm extends vdtt_ap {
   private vdtt_in d;
   private vdtt_hp[] M;
   private vdtt_hp[] N;
   private vdtt_ir[][] O;
   private Item P = null;
   private vdtt_ay Q;
   private vdtt_ay[] R;
   public Vector a = new Vector();
   public Vector b = new Vector();
   public int[] c;

   public final void b(Message var1) {
      try {
         this.c = new int[DataCenter.gI().dataTemplateAchievement.length];

         for(int var2 = 0; var2 < this.c.length; ++var2) {
            switch(var2) {
            case 7:
            case 14:
            case 16:
            case 18:
               this.c[var2] = var1.readShort();
               break;
            default:
               this.c[var2] = var1.readByte();
            }
         }
      } catch (Exception var3) {
      }

      this.z();
   }

   public vdtt_mm(MainScreen var1, Message var2) {
      this.H = var1;
      this.J = false;
      this.a(300);
      this.d = new vdtt_in(new vdtt_hm(1001, Caption.zQ), this);
      this.d.c = this.h() - 12;
      this.M = new vdtt_hp[3];
      this.M[0] = new vdtt_hp((byte)1, 11, this.f() + 40, super.width - 8 - 15, 1, 15, 0);
      this.M[1] = new vdtt_hp((byte)1, 11, this.f() + 40, super.width - 8 - 15, 1, 15, 0);
      this.M[2] = new vdtt_hp((byte)1, 11, this.f() + 40, super.width - 8 - 15, 1, 15, 0);
      this.O = new vdtt_ir[3][];
      this.Q = this.a(this.width - 84, this.height - 36, Caption.jX, this, 1012, 15);
      this.d.a(this.Q, 0);
      this.R = new vdtt_ay[DataCenter.gI().dataTemplateAchievement.length];
      this.N = new vdtt_hp[DataCenter.gI().dataTemplateAchievement.length];

      int var3;
      for(var3 = 0; var3 < DataCenter.gI().dataTemplateAchievement.length; ++var3) {
         this.R[var3] = new vdtt_ay(0, 0, 65, 20, Caption.eB, this, 0, -8);
      }

      this.w();
      this.x();
      this.b(var2);
      var3 = (this.h() - 50) / 15;
      this.M[2] = new vdtt_hp((byte)1, 11, this.f() + 40, super.width - 8 - 15, var3 * 15, 15, this.O[2].length);
      this.d.a(GameSrc.gI().cv);
   }

   public final void w() {
      this.a.clear();
      this.Q.d = true;
      Vector var1 = new Vector();
      Vector var2 = new Vector();
      int var3;
      String var6;
      if (GameSrc.gI().idTask >= DataCenter.gI().task.length) {
         var2.addElement("c#white" + Caption.jY);
      } else {
         Task var4 = DataCenter.gI().task[GameSrc.gI().idTask];
         var2.addElement("c#yellow" + Caption.jZ + "c#white" + var4.b);
         DataCenter.gI();
         if (GameSrc.gI().idStep < 0) {
            this.a.addElement(new vdtt_dv(var4.d, -1, -1, var4.e, var4.f, var4.g));
         } else {
            if (Char.gI().w() < var4.c) {
               var2.addElement("c#red" + Caption.kb + DataCenter.gI().a(var4.c));
            }

            for(var3 = 0; var3 < var4.p.size(); ++var3) {
               vdtt_ii var5;
               var6 = (var5 = (vdtt_ii)var4.p.elementAt(var3)).b;
               if (var5.i <= 1) {
                  if (GameSrc.gI().idStep == var3) {
                     var2.addElement("c#green  - c#task" + var6);
                     this.a.addElement(new vdtt_dv(var5.d, var5.b(), var5.e, var5.f, var5.g, var5.h));
                  } else {
                     var2.addElement("c#white  - " + var6);
                  }
               } else if (Char.gI().w() >= var4.c) {
                  if (GameSrc.gI().idStep == var3) {
                     var2.addElement("c#green  - c#task" + var5.b + " " + GameSrc.gI().numStepDone + "/" + var5.i);
                     this.a.addElement(new vdtt_dv(var5.d, var5.b(), var5.e, var5.f, var5.g, var5.h));
                  } else if (GameSrc.gI().idStep > var3) {
                     var2.addElement("c#white  - " + var5.b + " " + var5.i + "/" + var5.i);
                  } else {
                     var2.addElement("c#white  - " + var5.b + " 0/" + var5.i);
                  }
               } else {
                  var2.addElement("c#white  - " + var5.b + " 0/" + var5.i);
               }
            }

            if (GameSrc.gI().idTask == 18 && !var4.b()) {
               var2.add(Caption.ww);
            }

            if (GameSrc.gI().idStep >= var4.p.size()) {
               var2.addElement("c#white" + Caption.uD + "c#task" + Caption.uE + "c#white" + Caption.uF);
               this.a.addElement(new vdtt_dv(-32768, -1, -1, var4.e, var4.f, var4.g));
            } else if (var4.j.length() > 0) {
               var2.addElement("c#white" + var4.j);
            }

            if (GameSrc.gI().idTask < DataCenter.gI().task.length && GameSrc.gI().idStep >= 0) {
               Item var12;
               if (var4.k > 0) {
                  (var12 = new Item(190)).c(var4.k);
                  var12.isLock = true;
                  var1.add(var12);
               }

               if (var4.l > 0) {
                  (var12 = new Item(192)).c(var4.l);
                  var12.isLock = true;
                  var1.add(var12);
               }

               if (var4.m > 0) {
                  (var12 = new Item(191)).c(var4.m);
                  var1.add(var12);
               }

               if (var4.n > 0) {
                  (var12 = new Item(163)).c(var4.n);
                  var12.isLock = true;
                  var1.add(var12);
               }

               if ((var12 = var4.a()) != null) {
                  var1.add(var12);
               }

               if (var1.size() > 0) {
                  var2.addElement("c#blue" + Caption.kh + "\n===\n");
               }
            }
         }
      }

      Vector var11 = new Vector();
      var3 = -1;

      int var13;
      for(var13 = 0; var13 < var2.size(); ++var13) {
         if ((var6 = String.valueOf(var2.elementAt(var13))).contains("c#task")) {
            ++var3;
         }

         Vector var7 = vdtt_dd.a(vdtt_dd.d, var6, this.M[0].width - 20);
         int var8 = 0;

         for(int var9 = 0; var9 < var7.size(); ++var9) {
            if ((var6 = (String)var7.elementAt(var9)).contains("c#task")) {
               ++var8;
            }

            if (var6.contains("===")) {
               var11.add(new vdtt_ir(1, "", var1));
            } else {
               var11.add(new vdtt_ir(1, var6));
            }
         }

         if (var8 > 1) {
            vdtt_dv var14 = (vdtt_dv)this.a.elementAt(var3);

            for(int var10 = 1; var10 < var8; ++var10) {
               this.a.insertElementAt(var14, var3);
               ++var3;
            }
         }
      }

      this.O[0] = new vdtt_ir[var11.size()];

      for(var13 = 0; var13 < var11.size(); ++var13) {
         this.O[0][var13] = (vdtt_ir)var11.elementAt(var13);
      }

      var13 = (this.h() - 50) / 15;
      this.M[0] = new vdtt_hp((byte)1, 11, this.f() + 40, super.width - 8 - 15, var13 * 15, 15, this.O[0].length);
   }

   public final void x() {
      this.b.clear();
      Vector var1 = new Vector();
      String var2;
      if (Char.gI().ab > 0) {
         var1.addElement("c#yellow" + Caption.jZ + "c#white" + Caption.jS + (10 - Char.gI().ab) + "/10");
         if (GameSrc.gI().taskTuanHoan == null) {
            var1.addElement("c#white" + Caption.ka + "c#task" + DataCenter.gI().npcTemplate[102].name + "c#white" + Caption.kd);
            this.b.addElement(new vdtt_dv(102, -1, -1, 67, 0, 0, 0));
         } else {
            var2 = GameSrc.gI().taskTuanHoan.m;
            if (GameSrc.gI().taskTuanHoan.j > 1) {
               var2 = var2 + " " + GameSrc.gI().taskTuanHoan.c + "/" + GameSrc.gI().taskTuanHoan.j;
            }

            if (GameSrc.gI().taskTuanHoan.a()) {
               var1.addElement("c#white  - " + var2);
               var1.addElement("c#white" + Caption.kc + "c#task" + DataCenter.gI().npcTemplate[102].name + "c#white" + Caption.jU);
               this.b.addElement(new vdtt_dv(102, -1, -1, 67, 0, 0, 0));
            } else {
               var1.addElement("c#green  - c#task" + var2);
               if (GameSrc.gI().taskTuanHoan.g >= 0) {
                  var1.addElement(Utlis.b(Caption.mp, DataCenter.gI().mapTemplate[GameSrc.gI().taskTuanHoan.g].name));
                  this.b.addElement(new vdtt_dv(GameSrc.gI().taskTuanHoan.e, GameSrc.gI().taskTuanHoan.d, GameSrc.gI().taskTuanHoan.f, GameSrc.gI().taskTuanHoan.g, GameSrc.gI().taskTuanHoan.h, GameSrc.gI().taskTuanHoan.i, 0));
               }
            }
         }
      }

      if (GameSrc.gI().bC != null) {
         var1.addElement("c#yellow" + Caption.jZ + "c#white" + Caption.ns);
         var2 = "";
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
            this.b.addElement(new vdtt_dv(-1, -1, -1, -1, 0, 0, 2));
         } else {
            var1.addElement("c#green  - c#task" + var2);
            this.b.addElement(new vdtt_dv(-1, -1, -1, -1, 0, 0, 2));
         }
      }

      if (GameSrc.gI().bA != null) {
         var1.addElement("c#yellow" + Caption.jZ + "c#white" + Caption.wi);
         var2 = Caption.wk + " " + GameSrc.gI().bA.c + "/" + GameSrc.gI().bA.j;
         if (GameSrc.gI().bA.a()) {
            var1.addElement("c#white" + Caption.jO + "c#task" + DataCenter.gI().npcTemplate[38].name + "c#white" + Caption.jU);
            this.b.addElement(new vdtt_dv(-1, -1, -1, -1, 0, 0, 3));
         } else {
            var1.addElement("c#green  - c#task" + var2);
            this.b.addElement(new vdtt_dv(38, -1, -1, -1, 0, 0, 3));
         }
      }

      if (GameSrc.gI().bB != null) {
         var1.addElement("c#yellow" + Caption.jZ + "c#white" + Caption.wi);
         var2 = Caption.wl + " " + GameSrc.gI().bB.c + "/" + GameSrc.gI().bB.j;
         if (GameSrc.gI().bB.a()) {
            var1.addElement("c#white" + Caption.jO + "c#task" + DataCenter.gI().npcTemplate[36].name + "c#white" + Caption.jU);
            this.b.addElement(new vdtt_dv(-1, -1, -1, -1, 0, 0, 4));
         } else {
            var1.addElement("c#green  - c#task" + var2);
            this.b.addElement(new vdtt_dv(36, -1, -1, -1, 0, 0, 4));
         }
      }

      String var3;
      if (GameSrc.gI().bD != null) {
         var1.addElement("c#yellow" + Caption.jZ + "c#white" + Caption.wE);
         var2 = "";
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

         var3 = var2 + " " + GameSrc.gI().bD.c + "/" + GameSrc.gI().bD.j;
         if (GameSrc.gI().bD.a()) {
            var1.addElement("c#white" + Caption.jO + "c#task" + DataCenter.gI().npcTemplate[23].name + "c#white" + Caption.jU);
            this.b.addElement(new vdtt_dv(23, -1, -1, -1, 0, 0, GameSrc.gI().bD.b));
         } else {
            var1.addElement("c#green  - c#task" + var3);
            this.b.addElement(new vdtt_dv(-1, -1, -1, -1, 0, 0, GameSrc.gI().bD.b));
         }
      }

      Vector var4 = new Vector();
      int var5 = -1;

      int var6;
      for(var6 = 0; var6 < var1.size(); ++var6) {
         if ((var3 = String.valueOf(var1.elementAt(var6))).contains("c#task")) {
            ++var5;
         }

         Vector var7 = vdtt_dd.a(vdtt_dd.d, var3, this.M[1].width - 20);
         int var8 = 0;

         for(int var9 = 0; var9 < var7.size(); ++var9) {
            if ((var3 = (String)var7.elementAt(var9)).contains("c#task")) {
               ++var8;
            }

            var4.add(new vdtt_ir(1, var3));
         }

         if (var8 > 1) {
            vdtt_dv var11 = (vdtt_dv)this.b.elementAt(var5);

            for(int var10 = 1; var10 < var8; ++var10) {
               this.b.insertElementAt(var11, var5);
               ++var5;
            }
         }
      }

      this.O[1] = new vdtt_ir[var4.size()];

      for(var6 = 0; var6 < var4.size(); ++var6) {
         this.O[1][var6] = (vdtt_ir)var4.elementAt(var6);
      }

      var6 = (this.h() - 50) / 15;
      this.M[1] = new vdtt_hp((byte)1, 11, this.f() + 40, super.width - 8 - 15, var6 * 15, 15, this.O[1].length);
   }

   private void z() {
      try {
         Vector var1 = new Vector();
         Vector var2 = new Vector();

         int var4;
         for(int var3 = 0; var3 < DataCenter.gI().dataTemplateAchievement.length; ++var3) {
            var4 = this.c[var3];
            Vector var5 = new Vector();
            Item var6;
            if (DataCenter.gI().dataTemplateAchievement[var3].d > 0) {
               (var6 = new Item(190)).c(DataCenter.gI().dataTemplateAchievement[var3].d);
               var6.isLock = true;
               var5.add(var6);
            }

            if (DataCenter.gI().dataTemplateAchievement[var3].e > 0) {
               (var6 = new Item(192)).c(DataCenter.gI().dataTemplateAchievement[var3].e);
               var6.isLock = true;
               var5.add(var6);
            }

            if (DataCenter.gI().dataTemplateAchievement[var3].f > 0) {
               (var6 = new Item(191)).c(DataCenter.gI().dataTemplateAchievement[var3].f);
               var5.add(var6);
            }

            if (DataCenter.gI().dataTemplateAchievement[var3].g > 0) {
               (var6 = new Item(163)).c(DataCenter.gI().dataTemplateAchievement[var3].g);
               var6.isLock = true;
               var5.add(var6);
            }

            if ((var6 = DataCenter.gI().dataTemplateAchievement[var3].a()) != null) {
               var5.add(var6);
            }

            String var7 = var3 + 1 + ". ";
            if (var3 == DataCenter.gI().dataTemplateAchievement.length - 1) {
               var7 = "";
            }

            String var8 = "";
            if (var4 >= DataCenter.gI().dataTemplateAchievement[var3].c) {
               var4 = DataCenter.gI().dataTemplateAchievement[var3].c;
               var8 = var8 + "c#yellow" + var7 + DataCenter.gI().dataTemplateAchievement[var3].b;
            } else {
               var8 = var8 + "c#white" + var7 + DataCenter.gI().dataTemplateAchievement[var3].b;
            }

            if (DataCenter.gI().dataTemplateAchievement[var3].c > 1) {
               var8 = var8 + " " + var4 + "/" + DataCenter.gI().dataTemplateAchievement[var3].c;
            }

            if (var5.size() > 0) {
               var8 = var8 + "\nc#blue" + Caption.kh + "\n===";
               var2.add(var5);
            }

            var1.add(var8);
            String var9;
            vdtt_ay var10;
            if (this.c[var3] > DataCenter.gI().dataTemplateAchievement[var3].c) {
               this.R[var3].H = 9;
               this.R[var3].a(true);
               var10 = this.R[var3];
               var9 = Caption.se;
               var10.l = var9;
            } else if (this.c[var3] == DataCenter.gI().dataTemplateAchievement[var3].c) {
               this.R[var3].a(false);
               var10 = this.R[var3];
               var9 = Caption.eB;
               var10.l = var9;
            } else {
               this.R[var3].a(true);
               var10 = this.R[var3];
               var9 = Caption.ur;
               var10.l = var9;
            }

            this.R[var3].setSize(60, 18);
         }

         Vector var12 = new Vector();

         for(var4 = 0; var4 < var1.size(); ++var4) {
            String var13 = String.valueOf(var1.elementAt(var4));
            Vector var16 = vdtt_dd.a(vdtt_dd.d, var13, this.M[1].width - 8);

            for(int var17 = 0; var17 < var16.size(); ++var17) {
               if ((var13 = (String)var16.elementAt(var17)).contains("===")) {
                  var12.add(new vdtt_ir(1, "", (Vector)var2.remove(0)));
                  this.R[var4].setXY(80, var12.size() * 15 - 18);
                  if (this.N[var4] == null) {
                     this.N[var4] = new vdtt_hp((byte)1, 75, var12.size() * 15 - 10, 50, 20, 1, 1);
                  }
               } else {
                  var12.add(new vdtt_ir(1, var13));
               }
            }
         }

         vdtt_ir[] var14 = new vdtt_ir[var12.size()];

         for(int var15 = 0; var15 < var12.size(); ++var15) {
            var14[var15] = (vdtt_ir)var12.elementAt(var15);
         }

         this.O[2] = var14;
      } catch (Exception var11) {
         Utlis.a(var11);
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (var1.b >= 3000 && var1.b < 3010) {
         var2 = var1.b - 3000;
         vdtt_mm var10 = this;

         try {
            Vector var11 = var10.a;
            vdtt_dv var6;
            if (var10.d.h() == 1) {
               vdtt_bu.I = (var6 = (vdtt_dv)var10.b.elementAt(var2)).j;
            } else {
               var6 = (vdtt_dv)var11.elementAt(var2);
            }

            if (var10.d.h() == 0) {
               vdtt_bu.I = 5;
            }

            if (var6.a == -32768) {
               Message.c((byte)-11).send();
            } else {
               GameSrc.gI().aT.c(var10.d.h() != 0);
               if (var6.a >= 0) {
                  if (GameSrc.gI().l(var6.a) != null) {
                     var6.d = GameSrc.gI().mapID;
                  }

                  if (var6.d < 0) {
                     GameSrc.gI();
                     GameSrc.b(var6);
                  }
               }

               vdtt_dv var7 = var6.a();
               GameSrc.gI().a(var7, var10.d.h() == 0);
               var10.k();
            }
         } catch (Exception var9) {
            Utlis.a(var9);
         }
      } else if (var1.b >= 4000 && var1.b < 5000) {
         int var4 = var1.b - 4000;
         if (!this.R[var4].c) {
            var4 = var4;

            try {
               Message var5;
               (var5 = Message.c((byte)-38)).writeByte(var4);
               var5.send();
            } catch (Exception var8) {
               Utlis.a(var8);
            }
         }
      } else {
         this.P = null;
         switch(var1.b) {
         case 1001:
            if (var1.j.k >= 0) {
               this.d.a(var1.j.k);
               return;
            }
            break;
         case 1012:
            if (GameSrc.gI().idTask == 11) {
               A();
               return;
            }

            DataCenter.gI().currentScreen.a(Caption.kg, 2001, this);
            return;
         case 2001:
            A();
            return;
         case 5000:
            this.P = (Item)var1.k;
            this.k = c(this, var1, this.P);
         }
      }

   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.L, (byte)2, this.J);
      this.d.a(var1);
      GameSrc.gI().cv = (byte)this.d.h();
      vdtt_mm var2;
      Graphics var3;
      int var4;
      int var5;
      switch(this.d.h()) {
      case 0:
         var3 = var1;
         var2 = this;
         this.a(var1, this.M[this.d.h()]);

         for(var4 = 0; var4 < var2.O[var2.d.h()].length; ++var4) {
            if (var2.M[var2.d.h()].b(var4)) {
               vdtt_dd.c(vdtt_dd.d, var3, var2.O[var2.d.h()][var4].b, 6, var4 * var2.M[var2.d.h()].h + var2.M[var2.d.h()].h / 2, 0, -1, -16777216);
               if (var2.O[var2.d.h()][var4].d != null) {
                  for(var5 = 0; var5 < var2.O[var2.d.h()][var4].d.size(); ++var5) {
                     Item var9 = (Item)var2.O[var2.d.h()][var4].d.get(var5);
                     b(var3, 4 + var5 * 35, var4 * var2.M[var2.d.h()].h, var9, var2.P != null && var2.P.equals(var9));
                  }
               }
            }
         }

         var2.a(var3);
         var2.M[var2.d.h()].b(var3, var2);
         break;
      case 1:
         var3 = var1;
         var2 = this;
         this.a(var1, this.M[this.d.h()]);

         for(var4 = 0; var4 < var2.O[var2.d.h()].length; ++var4) {
            if (var2.M[var2.d.h()].b(var4)) {
               vdtt_dd.c(vdtt_dd.d, var3, var2.O[var2.d.h()][var4].b, 6, var4 * var2.M[var2.d.h()].h + var2.M[var2.d.h()].h / 2, 0, -1, -16777216);
            }
         }

         var2.a(var3);
         var2.M[var2.d.h()].b(var3, var2);
         break;
      case 2:
         var3 = var1;
         var2 = this;
         this.a(var1, this.M[this.d.h()]);
         int var6 = 0;

         for(int var7 = 0; var7 < var2.O[var2.d.h()].length; ++var7) {
            if (var2.M[var2.d.h()].b(var7)) {
               if (var2.O[var2.d.h()][var7].b.contains("c#blue")) {
                  vdtt_dd.c(vdtt_dd.d, var3, var2.O[var2.d.h()][var7].b, 80, var7 * var2.M[var2.d.h()].h + var2.M[var2.d.h()].h / 2 - 2, 0, -1, -16777216);
               } else {
                  vdtt_dd.c(vdtt_dd.d, var3, var2.O[var2.d.h()][var7].b, 6, var7 * var2.M[var2.d.h()].h + var2.M[var2.d.h()].h / 2, 0, -1, -16777216);
               }

               if (var2.O[var2.d.h()][var7].d != null) {
                  var4 = 0;

                  while(true) {
                     if (var4 >= var2.O[var2.d.h()][var7].d.size()) {
                        var4 = var3.e;
                        var5 = var3.f;
                        var2.a(var3, var4 + var2.R[var6].cx, var5 + var2.R[var6].cy);
                        var2.R[var6].b(var3);
                        var2.a(var3, var4, var5);
                        break;
                     }

                     Item var8 = (Item)var2.O[var2.d.h()][var7].d.get(var4);
                     b(var3, 4 + var4 * 35 + 6, var7 * var2.M[var2.d.h()].h - 14, var8, var2.P != null && var2.P.equals(var8));
                     ++var4;
                  }
               }
            }

            if (var2.O[var2.d.h()][var7].d != null) {
               ++var6;
            }
         }

         var2.a(var3);
         var2.M[var2.d.h()].b(var3, var2);
      }

      this.a(var1, this.cx, this.cy);
      var1.o();
   }

   public final void a_() {
      this.d.e();

      int var1;
      for(var1 = 0; var1 < this.M.length; ++var1) {
         this.M[var1].a();
      }

      if (this.d.h() == 2) {
         for(var1 = 0; var1 < this.N.length; ++var1) {
            if (this.N[var1].l != -1) {
               this.R[var1].M = true;
            } else {
               this.R[var1].M = false;
            }
         }
      }

      if (GameSrc.gI().idTask == 5 && GameSrc.gI().idStep == 1) {
         this.y();
      }

   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(this.d.f());
      int var2 = -1;

      int var3;
      int var4;
      vdtt_hi var5;
      for(int var6 = 0; var6 < this.O[this.d.h()].length; ++var6) {
         String var7;
         if ((var7 = this.O[this.d.h()][var6].b).contains("c#task")) {
            try {
               ++var2;
               String[] var8 = var7.split("c#task");
               var3 = this.M[this.d.h()].cx + 5 + vdtt_dd.c(vdtt_dd.d, var8[0]);
               var4 = this.M[this.d.h()].cy + var6 * this.M[this.d.h()].h - this.M[this.d.h()].f;
               vdtt_ik var9;
               if ((var9 = vdtt_df.d(var7 = var8[1])) != null) {
                  var7 = var7.split(var9.d)[0];
               }

               var5 = new vdtt_hi(3000 + var2, var3, var4, var3 + vdtt_dd.b(vdtt_dd.d, var7), var4 + this.M[this.d.h()].h, this.M[this.d.h()], this, new vdtt_ir(0, var7));
               if (this.M[this.d.h()].b(var6) && Utlis.a(this.M[this.d.h()].cx, this.M[this.d.h()].cy, this.M[this.d.h()].cx + this.M[this.d.h()].width, this.M[this.d.h()].cy + this.M[this.d.h()].height, var5.a(), var5.b())) {
                  var1.addElement(var5);
               }
            } catch (Exception var11) {
            }
         }
      }

      Vector var12 = new Vector();
      int var13;
      if (this.d.h() == 0 && GameSrc.gI().idTask < DataCenter.gI().task.length && GameSrc.gI().idStep >= 0 || this.d.h() == 2) {
         var1.addElement(new vdtt_hi(1100, this.M[this.d.h()].cx, this.M[this.d.h()].cy - 11, this.M[this.d.h()].cx + this.M[this.d.h()].width, this.M[this.d.h()].cy, this.M[this.d.h()], this));
         var1.addElement(new vdtt_hi(1100, this.M[this.d.h()].cx, this.M[this.d.h()].cy + this.M[this.d.h()].height, this.M[this.d.h()].cx + this.M[this.d.h()].width, this.M[this.d.h()].cy + this.M[this.d.h()].height + 20, this.M[this.d.h()], this));

         for(var13 = 0; var13 < this.O[this.d.h()].length; ++var13) {
            if (this.O[this.d.h()][var13].d != null) {
               ++var2;
               if (this.M[this.d.h()].b(var13)) {
                  var3 = this.M[this.d.h()].cx + 4;
                  var4 = this.M[this.d.h()].cy + var13 * this.M[this.d.h()].h - this.M[this.d.h()].f;
                  if (this.d.h() == 2) {
                     vdtt_hi var15 = new vdtt_hi(4000 + var2, var3 + 16 + 60, var4 - 3, var3 + 16 + 60 + 60, var4 - 3 + 18, this.N[var2], this);
                     var12.addElement(var15);

                     for(int var17 = 0; var17 < this.O[this.d.h()][var13].d.size(); ++var17) {
                        Item var10 = (Item)this.O[this.d.h()][var13].d.get(var17);
                        var15 = new vdtt_hi(5000, var3 + 6, var4 - 14, var3 + 28 + 6, var4 - 14 + 28, this.M[this.d.h()], this, var10);
                        var12.addElement(var15);
                        var3 += 35;
                     }
                  } else {
                     for(int var14 = 0; var14 < this.O[this.d.h()][var13].d.size(); ++var14) {
                        Item var16 = (Item)this.O[this.d.h()][var13].d.get(var14);
                        var5 = new vdtt_hi(5000, var3, var4, var3 + 28, var4 + 28, this.M[this.d.h()], this, var16);
                        var12.addElement(var5);
                        var3 += 35;
                     }
                  }
               }
            }
         }
      }

      for(var13 = var12.size() - 1; var13 >= 0; --var13) {
         if (((vdtt_hi)var12.get(var13)).d >= this.M[this.d.h()].cy + this.M[this.d.h()].height) {
            var12.remove(var13);
         }
      }

      var1.addAll(var12);
      var1.addElement(this.M[this.d.h()].a(1100, this));
      return var1;
   }

   private static void A() {
      try {
         (new Message((byte)9)).send();
      } catch (Exception var1) {
         Utlis.a(var1);
      }

   }
}
