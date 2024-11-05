package gro;

import java.util.Vector;

public final class vdtt_lw extends vdtt_ap {
   private String[] M;
   private Vector N;
   private vdtt_hp O;
   private int P;
   private int[] Q;
   public Entity a;
   public int b = -1;
   public int c = -1;
   private String[] R;
   private boolean S;
   private vdtt_ay T;
   private int U = 70;
   public boolean d;

   private void a(MainScreen var1, String var2, String[] var3) {
      this.H = var1;
      this.J = false;
      this.R = new String[var3.length];

      int var4;
      for(var4 = 0; var4 < var3.length; ++var4) {
         this.R[var4] = "";
      }

      Vector var5 = new Vector();

      int var6;
      String var7;
      for(var6 = 0; var6 < var3.length; ++var6) {
         if (var3[var6].length() > 0) {
            String[] var8;
            var7 = (var8 = Utlis.a(var3[var6], "#"))[0];
            if (var8.length > 2) {
               var7 = var8[0] + var8[2];
               this.R[var6] = var8[1];
            }

            if (vdtt_df.c(var7) == null && !this.w()) {
               var5.addElement(":-chat" + var7);
            } else {
               var5.addElement(var7);
            }
         }
      }

      this.M = new String[var5.size()];

      for(var6 = 0; var6 < var5.size(); ++var6) {
         this.M[var6] = (String)var5.elementAt(var6);
      }

      this.Q = new int[this.M.length];

      for(var6 = 0; var6 < this.Q.length; ++var6) {
         int[] var10 = this.Q;
         var10[var6] = var10[var6];
      }

      int var11;
      for(var11 = 0; var11 < var3.length; ++var11) {
         if (!(var7 = Utlis.a(var3[var11], ",")[0]).contains("#") && (var6 = vdtt_dd.c(vdtt_dd.d, var7) + 50) > this.width) {
            this.a(var6, this.height);
         }
      }

      if (this.width < 230) {
         this.width = 230;
      }

      if (var2.length() > 0) {
         this.N = vdtt_dd.a(vdtt_dd.d, var2, this.width - 18);
      } else {
         this.N = new Vector();
      }

      var11 = var3.length + this.N.size();
      int var9 = this.N.size();
      if (!this.w()) {
         this.a(230, 200);
         if (var11 >= 11) {
            var9 = 0;
            this.N.size();
            this.S = true;
         }

         var4 = var11 - var9;
         this.j();
         this.a(this.width);
         if (this.S) {
            this.O = new vdtt_hp((byte)1, 15, this.f() + var9 * 14 + 8, this.width - 20, 17 * (var4 - 1), 17, var3.length);
         } else {
            this.O = new vdtt_hp((byte)1, 15, this.f() + var9 * 14 + 8, this.width - 20, 17 * var4, 17, var3.length);
         }

         this.T = this.a(this.width - 70, this.height - 29, Caption.O, this, 1000, -8);
         this.T.b(this.S);
      } else {
         if ((var11 = var3.length) > 5) {
            var11 = 5;
            this.S = true;
         }

         var4 = var11 * this.U;
         this.a(this.width, 40);
         this.O = new vdtt_hp((byte)0, (this.width - var4) / 2, this.f() + var9 * 14 + 8, var4, this.U, this.U, var3.length);
         this.j();
      }

      vdtt_aa.gI().w();
   }

   private boolean w() {
      return this.c >= 0 && DataCenter.k() || this.d;
   }

   public vdtt_lw(MainScreen var1, String var2, String[] var3, int[] var4) {
      this.a(var1, var2, var3);
      this.Q = new int[this.M.length];

      for(int var5 = 0; var5 < this.Q.length; ++var5) {
         this.Q[var5] = var4[var5];
      }

   }

   public vdtt_lw(MainScreen var1, String var2, String[] var3, int[] var4, boolean var5) {
      this.d = true;
      this.a(var1, var2, var3);
      this.Q = new int[this.M.length];

      for(int var6 = 0; var6 < this.Q.length; ++var6) {
         this.Q[var6] = var4[var6];
      }

   }

   public vdtt_lw(MainScreen var1, String var2, String[] var3, int[] var4, Entity var5) {
      this.a(var1, var2, var3);
      this.a = var5;
      this.Q = new int[this.M.length];

      for(int var6 = 0; var6 < this.Q.length; ++var6) {
         this.Q[var6] = var4[var6];
      }

   }

   public vdtt_lw(MainScreen var1, String var2, String[] var3, int var4) {
      this.c = var4;
      this.a(var1, var2, var3);
   }

   private vdtt_lw(MainScreen var1, String var2, String[] var3, int var4, int var5) {
      this.b = var5;
      this.c = var4;
      this.a(var1, var2, var3);
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      if (!this.w()) {
         this.a(var1, this.cx, this.cy, this.width, this.height, "", (byte)2, this.J);
      }

      int var2;
      int var3;
      String var4;
      if (!this.w()) {
         var2 = this.f() + 10;
         if (this.S) {
            var2 = 15;
         }

         for(var3 = 0; var3 < this.N.size(); ++var3) {
            vdtt_dd.c(vdtt_dd.d, var1, (String)this.N.elementAt(var3), 10, var2 + var3 * 14, 0, -1, -16777216);
         }

         this.a(var1, this.O);

         for(var3 = 0; var3 < this.M.length; ++var3) {
            if (this.O.b(var3)) {
               if (var3 == this.O.k) {
                  vdtt_y.a(var1, -7, 0, 20, var3 * this.O.h, this.O.width - 25, (int)this.O.h);
               }

               var4 = Utlis.a(this.M[var3], ",")[0];
               if (var3 == this.O.l) {
                  vdtt_dd.c(vdtt_dd.d, var1, var4, 1, 8 + var3 * this.O.h, 0, -1, -16777216);
               } else {
                  vdtt_dd.c(vdtt_dd.d, var1, var4, 0, 7 + var3 * this.O.h, 0, -1, -16777216);
               }
            }
         }

         this.a(var1);
      } else {
         this.a(var1, this.O);

         for(var2 = 0; var2 < this.M.length; ++var2) {
            if (this.O.b(var2)) {
               this.a(var1, 3 + var2 * this.O.h, 3, this.O.h - 6, this.O.h - 6, 61, 22, 23, 1, 1);
               var4 = Utlis.a(this.M[var2], ",")[0];
               Vector var5 = vdtt_dd.a(vdtt_dd.d, var4, this.U - 12);
               var3 = (this.O.h - var5.size() * 12) / 2;

               for(int var6 = 0; var6 < var5.size(); ++var6) {
                  if (var2 == this.O.l) {
                     vdtt_dd.c(vdtt_dd.d, var1, (String)var5.get(var6), var2 * this.O.h + this.O.h / 2, 6 + var3 + var6 * 12, 2, -1, -16777216);
                  } else {
                     vdtt_dd.c(vdtt_dd.d, var1, (String)var5.get(var6), var2 * this.O.h + this.O.h / 2, 6 + var3 + var6 * 12, 2, -1, -16777216);
                  }
               }
            }
         }

         this.a(var1);
      }

   }

   public final void a_() {
      try {
         this.O.a();
         DataCenter.gI();
         int var4;
         if (!DataCenter.b() && this.H.b.lastElement().equals(this)) {
            int var1 = -1;
            vdtt_ii var2;
            if ((var2 = GameSrc.gI().T()) != null) {
               var1 = var2.d;
            }

            Task var3;
            if (var1 == -1 && (var3 = GameSrc.gI().S()) != null) {
               var1 = var3.d;
            }

            Npc var5;
            if ((var5 = GameSrc.gI().l(var1)) != null && Utlis.a(Char.gI().cx, Char.gI().cy, var5.cx, var5.cy) < 40) {
               if (GameSrc.gI().idTask == 5 && GameSrc.gI().idStep == 1) {
                  var4 = this.cx + 60;
                  DataCenter.gI().pointHelper.b(var4, this.cy + 60);
               } else if (GameSrc.gI().idTask == 5 && GameSrc.gI().idStep == 2) {
                  if (this.b == -1) {
                     var4 = this.cx + 90;
                     DataCenter.gI().pointHelper.b(var4, this.cy + 109);
                  } else {
                     var4 = this.cx + 60;
                     DataCenter.gI().pointHelper.b(var4, this.cy + 45);
                  }
               } else if (GameSrc.gI().idTask == 14) {
                  if (this.b == -1) {
                     var4 = this.cx + 60;
                     DataCenter.gI().pointHelper.b(var4, this.cy + 75);
                  } else {
                     var4 = this.cx + 60;
                     DataCenter.gI().pointHelper.b(var4, this.cy + 45);
                  }
               } else if (this.N.isEmpty() && GameSrc.gI().idTask != 14) {
                  var4 = this.cx + 60;
                  DataCenter.gI().pointHelper.b(var4, this.cy + 45);
               } else {
                  var4 = this.cx + 60;
                  DataCenter.gI().pointHelper.b(var4, this.cy + 60);
               }
            } else if (GameSrc.gI().focusEntity != null && GameSrc.gI().focusEntity instanceof Npc && var2 != null && ((Npc)GameSrc.gI().focusEntity).id == 42) {
               GameSrc.gI();
               int var6 = GameSrc.f(var2.f);
               GameSrc.gI();
               if (var6 != GameSrc.f(GameSrc.gI().mapID)) {
                  var4 = this.cx + 60;
                  DataCenter.gI().pointHelper.b(var4, this.cy + 60);
               }
            }
         }

         if (this.P > 0) {
            --this.P;
            if (this.P == 0 && this.O.k >= 0 && this.O.k < this.M.length) {
               Message var31;
               Message var32;
               if (this.c >= 0) {
                  this.k();
                  if (this.b >= 0) {
                     if (this.c == 30000) {
                        (var31 = new Message((byte)-25)).writeShort(GameSrc.gI().G());
                        var31.writeByte(this.b);
                        var31.writeByte(this.O.k);
                        var31.send();
                        if (Char.gI().arrItemBag[GameSrc.gI().G()] != null && Char.gI().arrItemBag[GameSrc.gI().G()].af()) {
                           Char.gI().S();
                           GameSrc.gI().pointMoveMap = null;
                        }

                        return;
                     }

                     (var31 = new Message((byte)53)).writeShort(this.c);
                     var31.writeByte(this.b);
                     var31.writeByte(this.O.k);
                     var31.send();
                  } else {
                     String[] var38;
                     if ((var38 = Utlis.a(this.M[this.O.k], ",")).length < 2) {
                        if (this.c != 30000) {
                           (var32 = new Message((byte)53)).writeShort(this.c);
                           var32.writeByte(this.O.k);
                           var32.send();
                           return;
                        }

                        (var32 = new Message((byte)-25)).writeShort(GameSrc.gI().G());
                        var32.writeByte(this.O.k);
                        var32.send();
                        if (Char.gI().arrItemBag[GameSrc.gI().G()] != null && Char.gI().arrItemBag[GameSrc.gI().G()].af()) {
                           Char.gI().S();
                           GameSrc.gI().pointMoveMap = null;
                        }
                     } else {
                        String[] var33 = new String[var38.length - 1];

                        for(var4 = 0; var4 < var33.length; ++var4) {
                           var33[var4] = var38[var4 + 1];
                        }

                        GameSrc.gI().a((vdtt_w)(new vdtt_lw(this.H, this.R[this.O.k], var33, this.c, this.O.k)));
                     }
                  }

                  return;
               }

               if (this.c == -2) {
                  (var31 = new Message((byte)5)).writeByte(this.O.k);
                  var31.send();
                  return;
               }

               if (this.c == -3 || this.c == -4) {
                  (var31 = new Message((byte)53)).writeShort(this.c);
                  var31.writeByte(this.O.k);
                  var31.send();
                  return;
               }

               this.k();
               vdtt_lw var30;
               Char var37;
               switch(this.Q[this.O.k]) {
               case 0:
                  var30 = this;

                  try {
                     if (f(3)) {
                        var30.H.a((vdtt_w)(new vdtt_lw(var30.H, "", Caption.yF, new int[]{100, 101})));
                     }
                     break;
                  } catch (Exception var28) {
                     Utlis.a(var28);
                     return;
                  }
               case 1:
                  GameSrc.gI();
                  GameSrc.o(37);
                  return;
               case 2:
                  var30 = this;

                  try {
                     var30.H.a((vdtt_w)(new vdtt_lw(var30.H, "", Caption.yH, new int[]{104, 105})));
                     break;
                  } catch (Exception var27) {
                     Utlis.a(var27);
                     return;
                  }
               case 3:
                  var30 = this;

                  try {
                     if (f(1)) {
                        var30.H.a((vdtt_w)(new vdtt_lw(var30.H, "", Caption.yI, new int[]{106, 107, 127})));
                     }
                     break;
                  } catch (Exception var26) {
                     Utlis.a(var26);
                     return;
                  }
               case 4:
                  var30 = this;

                  try {
                     var30.H.a((vdtt_w)(new vdtt_lw(var30.H, Caption.aD, Caption.yJ, new int[]{108, 109, 110, 111, 112})));
                     break;
                  } catch (Exception var25) {
                     Utlis.a(var25);
                     return;
                  }
               case 5:
                  var30 = this;

                  try {
                     var30.H.a((vdtt_w)(new vdtt_lw(var30.H, Caption.S, Caption.yP, new int[]{113, 114, 115, 116, 117})));
                     break;
                  } catch (Exception var24) {
                     Utlis.a(var24);
                     return;
                  }
               case 6:
                  var30 = this;

                  try {
                     var30.H.a((vdtt_w)(new vdtt_lw(var30.H, Caption.be, Caption.yQ, new int[]{118, 119, 120, 121})));
                     break;
                  } catch (Exception var23) {
                     Utlis.a(var23);
                     return;
                  }
               case 7:
                  A();
                  return;
               case 8:
                  GameSrc.gI();
                  GameSrc.i(8, 0);
                  return;
               case 9:
                  A();
                  return;
               case 10:
                  this.B();
                  return;
               case 11:
                  try {
                     GameSrc.gI();
                     GameSrc.o(86);
                     break;
                  } catch (Exception var22) {
                     Utlis.a(var22);
                     return;
                  }
               case 12:
                  this.x();
                  return;
               case 13:
                  this.z();
                  return;
               case 14:
                  var30 = this;

                  try {
                     var30.H.a((vdtt_w)(new vdtt_kc(var30.H)));
                     break;
                  } catch (Exception var21) {
                     Utlis.a(var21);
                     return;
                  }
               case 15:
                  var30 = this;

                  try {
                     var30.H.a((vdtt_w)(new vdtt_ms(var30.H)));
                     break;
                  } catch (Exception var20) {
                     Utlis.a(var20);
                     return;
                  }
               case 16:
                  for(int var35 = 0; var35 < GameSrc.gI().vNpc.size(); ++var35) {
                     Npc var36;
                     if ((var36 = (Npc)GameSrc.gI().vNpc.get(var35)).id == 59) {
                        GameSrc.gI();
                        GameSrc.a(var36);
                        return;
                     }
                  }

                  return;
               case 50:
                  var30 = this;

                  try {
                     var37 = (Char)var30.a;
                     GameSrc.gI();
                     GameSrc.e(var37.name);
                     break;
                  } catch (Exception var19) {
                     Utlis.a(var19);
                     return;
                  }
               case 52:
                  var30 = this;

                  try {
                     var37 = (Char)var30.a;
                     (var32 = new Message((byte)32)).writeUTF(var37.name);
                     var32.send();
                     break;
                  } catch (Exception var18) {
                     Utlis.a(var18);
                     return;
                  }
               case 54:
                  var30 = this;

                  try {
                     var37 = (Char)var30.a;
                     GameSrc.gI().j(var37.name);
                     break;
                  } catch (Exception var17) {
                     Utlis.a(var17);
                     return;
                  }
               case 58:
                  var30 = this;

                  try {
                     var37 = (Char)var30.a;
                     (var32 = new Message((byte)19)).writeUTF(var37.name);
                     var32.send();
                     break;
                  } catch (Exception var16) {
                     Utlis.a(var16);
                     return;
                  }
               case 60:
                  var30 = this;

                  try {
                     var37 = (Char)var30.a;
                     (var32 = Message.c((byte)-104)).writeUTF(var37.name);
                     var32.send();
                     break;
                  } catch (Exception var15) {
                     Utlis.a(var15);
                     return;
                  }
               case 61:
                  var30 = this;

                  try {
                     var37 = (Char)var30.a;
                     (var32 = Message.c((byte)-105)).writeUTF(var37.name);
                     var32.send();
                     break;
                  } catch (Exception var14) {
                     Utlis.a(var14);
                     return;
                  }
               case 63:
                  var30 = this;

                  try {
                     var37 = (Char)var30.a;
                     (var32 = Message.c((byte)-5)).writeUTF(var37.name);
                     var32.send();
                     break;
                  } catch (Exception var13) {
                     Utlis.a(var13);
                     return;
                  }
               case 100:
                  GameSrc.gI();
                  GameSrc.o(0);
                  return;
               case 101:
                  GameSrc.gI();
                  GameSrc.o(1);
                  return;
               case 102:
                  GameSrc.gI();
                  GameSrc.o(2);
                  return;
               case 103:
                  GameSrc.gI();
                  GameSrc.o(3);
                  return;
               case 104:
                  GameSrc.gI();
                  GameSrc.o(4);
                  return;
               case 105:
                  GameSrc.gI();
                  GameSrc.o(5);
                  return;
               case 106:
                  GameSrc.gI();
                  GameSrc.o(18);
                  return;
               case 107:
                  GameSrc.gI();
                  GameSrc.o(19);
                  return;
               case 108:
                  GameSrc.gI();
                  GameSrc.i(8, 1);
                  return;
               case 109:
                  GameSrc.gI();
                  GameSrc.i(8, 2);
                  return;
               case 110:
                  GameSrc.gI();
                  GameSrc.i(8, 3);
                  return;
               case 111:
                  GameSrc.gI();
                  GameSrc.i(8, 4);
                  return;
               case 112:
                  GameSrc.gI();
                  GameSrc.i(8, 5);
                  return;
               case 113:
                  GameSrc.gI();
                  GameSrc.i(9, Char.gI().he);
                  return;
               case 114:
                  GameSrc.gI();
                  GameSrc.i(10, Char.gI().he);
                  return;
               case 115:
                  GameSrc.gI();
                  GameSrc.i(11, Char.gI().he);
                  return;
               case 116:
                  GameSrc.gI();
                  GameSrc.i(12, Char.gI().he);
                  return;
               case 117:
                  GameSrc.gI();
                  GameSrc.i(13, Char.gI().he);
                  return;
               case 118:
                  GameSrc.gI();
                  GameSrc.i(14, Char.gI().he);
                  return;
               case 119:
                  GameSrc.gI();
                  GameSrc.i(15, Char.gI().he);
                  return;
               case 120:
                  GameSrc.gI();
                  GameSrc.i(16, Char.gI().he);
                  return;
               case 121:
                  GameSrc.gI();
                  GameSrc.i(17, Char.gI().he);
                  return;
               case 122:
                  GameSrc.gI();
                  GameSrc.o(81);
                  return;
               case 123:
                  GameSrc.gI();
                  GameSrc.o(82);
                  return;
               case 124:
                  GameSrc.gI();
                  GameSrc.o(83);
                  return;
               case 125:
                  GameSrc.gI();
                  GameSrc.o(108);
                  return;
               case 126:
                  GameSrc.gI();
                  GameSrc.o(102);
                  return;
               case 127:
                  GameSrc.gI();
                  GameSrc.o(30);
                  return;
               case 200:
                  GameSrc.gI().a((vdtt_w)(new vdtt_jp(GameSrc.gI())));
                  return;
               case 201:
                  try {
                     if (f(4)) {
                        GameSrc.gI();
                        GameSrc.o(50);
                     }
                     break;
                  } catch (Exception var12) {
                     Utlis.a(var12);
                     return;
                  }
               case 202:
                  GameSrc.gI();
                  GameSrc.o(87);
                  return;
               case 203:
                  GameSrc.gI();
                  GameSrc.o(90);
                  return;
               case 204:
                  GameSrc.gI();
                  GameSrc.o(94);
                  return;
               case 205:
                  GameSrc.gI();
                  GameSrc.o(95);
                  return;
               case 206:
                  this.B();
                  return;
               case 207:
                  GameSrc.gI();
                  GameSrc.o(85);
                  return;
               case 208:
                  GameSrc.gI();
                  GameSrc.o(84);
                  return;
               case 209:
                  GameSrc.gI();
                  GameSrc.o(101);
                  return;
               case 301:
                  GameSrc.gI();
                  GameSrc.o(102);
                  return;
               case 302:
                  GameSrc.gI();
                  GameSrc.o(87);
                  return;
               case 303:
                  GameSrc.gI();
                  GameSrc.o(90);
                  return;
               case 401:
                  GameSrc.gI();
                  GameSrc.o(94);
                  return;
               case 402:
                  GameSrc.gI();
                  GameSrc.o(98);
                  return;
               case 501:
                  GameSrc.gI();
                  GameSrc.o(99);
                  return;
               case 502:
                  GameSrc.gI();
                  GameSrc.o(100);
                  return;
               case 503:
                  GameSrc.gI();
                  GameSrc.o(101);
                  return;
               case 504:
                  GameSrc.gI();
                  GameSrc.o(103);
                  return;
               case 601:
                  this.z();
                  return;
               case 602:
                  this.x();
                  return;
               case 603:
                  var30 = this;

                  try {
                     var30.H.a((vdtt_w)(new vdtt_jw(var30.H, Caption.Bp, (byte)106)));
                     break;
                  } catch (Exception var11) {
                     Utlis.a(var11);
                     return;
                  }
               case 800:
                  GameSrc.gI().a((vdtt_w)(new vdtt_ll(GameSrc.gI())));
                  return;
               case 801:
                  GameSrc.gI().a((vdtt_w)(new vdtt_lk(GameSrc.gI())));
                  return;
               case 802:
                  GameSrc.gI().a((vdtt_w)(new vdtt_je(GameSrc.gI())));
                  return;
               case 803:
                  GameSrc.gI().ae();
                  return;
               case 804:
                  GameSrc.gI().E();
                  return;
               case 805:
                  GameSrc.gI().a((vdtt_w)(new vdtt_jy(GameSrc.gI(), Char.gI(), GameSrc.gI().af, 2)));
                  return;
               case 900:
                  this.H.a((vdtt_w)(new vdtt_lm(this.H)));
                  return;
               case 901:
                  GameSrc.gI().b((String)Caption.m).f.clear();
                  CheckVersionScreen.J = true;
                  AppListener.gI().f = 50;
                  return;
               case 902:
                  DataCenter.gI().currentScreen.a(Caption.jB, 2991, DataCenter.gI().currentScreen);
                  return;
               case 903:
                  GameSrc.gI();
                  GameSrc.o(56);
                  return;
               case 904:
                  this.H.a((vdtt_w)(new vdtt_ku(this.H)));
                  return;
               case 905:
                  this.H.a((vdtt_w)(new vdtt_lb(this.H)));
                  break;
               case 4001:
                  var37 = (Char)this.a;
                  GameSrc.gI();
                  GameSrc.g(var37.name);
                  return;
               case 4002:
                  var30 = this;

                  try {
                     var37 = (Char)var30.a;
                     GameSrc.gI();
                     GameSrc.f(var37.name);
                     break;
                  } catch (Exception var10) {
                     Utlis.a(var10);
                     return;
                  }
               case 4003:
                  var30 = this;

                  try {
                     vdtt_ba.J = (var37 = (Char)var30.a).name;
                     vdtt_kb var34 = new vdtt_kb(GameSrc.gI(), 5);
                     GameSrc.gI().a((String)var37.name, (vdtt_ka)var34);
                     break;
                  } catch (Exception var9) {
                     Utlis.a(var9);
                     return;
                  }
               case 4004:
                  var30 = this;

                  try {
                     var37 = (Char)var30.a;
                     GameSrc.gI().h(var37.name);
                     break;
                  } catch (Exception var8) {
                     Utlis.a(var8);
                     return;
                  }
               case 4005:
                  try {
                     GameSrc.gI();
                  } catch (Exception var7) {
                     Utlis.a(var7);
                     return;
                  }
               }
            }
         }
      } catch (Exception var29) {
         Utlis.a(var29);
      }

   }

   private void x() {
      try {
         if (f(1)) {
            GameSrc.gI();
            GameSrc.o(57);
         }
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }

   private static boolean f(int var0) {
      if (Char.gI().rank < var0) {
         switch(var0) {
         case 1:
         case 2:
            DataCenter.gI().currentScreen.c(Utlis.b(Caption.nY, Caption.ov), -1);
            break;
         case 3:
         case 4:
            DataCenter.gI().currentScreen.c(Utlis.b(Caption.nY, Caption.ow), -1);
            break;
         case 5:
            DataCenter.gI().currentScreen.c(Utlis.b(Caption.nY, Caption.ox), -1);
         }

         return false;
      } else {
         return true;
      }
   }

   public final Vector g() {
      Vector var1 = super.g();
      if (this.w()) {
         (var1 = new Vector()).addElement(this.O.a(1001, this));
         var1.addElement(new vdtt_hi(0, -this.cx, -this.cy, DataCenter.gI().n, DataCenter.gI().o, (vdtt_hp)null, this));
      } else {
         var1.addElement(this.O.a(1001, this));
      }

      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1000:
         this.k();
         return;
      case 1001:
         if (var1.j.k >= 0) {
            this.P = 3;
            return;
         }
         break;
      default:
         if (this.w()) {
            this.k();
         }
      }

   }

   private void z() {
      try {
         if (f(1)) {
            this.H.a((vdtt_w)(new vdtt_jw(this.H, Caption.zK, (byte)78)));
         }
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }

   private static void A() {
      try {
         GameSrc.gI();
         GameSrc.o(50);
      } catch (Exception var1) {
         Utlis.a(var1);
      }

   }

   private void B() {
      try {
         if (f(5)) {
            this.H.a((vdtt_w)(new vdtt_lw(this.H, "", Caption.yT, new int[]{122, 123, 125, 126, 202, 203, 204, 205, 207, 208, 209})));
         }
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }
}
