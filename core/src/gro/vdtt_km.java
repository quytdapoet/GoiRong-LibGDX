package gro;

import java.util.Vector;

public final class vdtt_km extends vdtt_jx {
   private vdtt_hq[] S;
   private vdtt_ay V;
   public int[] N = new int[3];
   public vdtt_hf O;
   public Item P;
   public boolean Q;
   private int W;
   private int X;
   private String Y = "";
   private ItemOption Z;
   public boolean R;
   private vdtt_bs[] al = new vdtt_bs[3];
   private vdtt_hl am;

   public vdtt_km(MainScreen var1) {
      super(var1, new String[]{Caption.rv, Caption.P});
      this.aa = new Item[1];
      this.S = new vdtt_hq[2];
      this.S[0] = new vdtt_hq((byte)1, 14, this.f() + 20, 30, 30, 30, 1, 1);
      this.S[1] = new vdtt_hq((byte)1, 104, this.f() + 20, 30, 30, 30, 1, 1);
      this.V = this.a(this.width - 70, this.height - 33, Caption.rx, this, 300, -8);
      this.a(this.V, 0);
      this.am = new vdtt_hl(200, 0);
      this.al[0] = this.a(14, this.f() + 94, Caption.tf, this, this.am);
      this.al[1] = this.a(14, this.f() + 112, Caption.tg, this, this.am);
      this.al[2] = this.a(14, this.f() + 130, Caption.th, this, this.am);
      vdtt_hl var2 = this.am;
      boolean var3 = true;
      vdtt_hl var4 = var2;
      var2.b = 2;

      for(int var5 = 0; var5 < var4.c.size(); ++var5) {
         vdtt_bs var6 = (vdtt_bs)var4.c.elementAt(var5);
         boolean var7;
         if (var5 == 2) {
            var7 = true;
            var6.l = var7;
         } else {
            var7 = false;
            var6.l = var7;
         }
      }

      this.a(this.al[0], 0);
      this.a(this.al[1], 0);
      this.a(this.al[2], 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].ab()) {
            this.aj.add(var1[var2]);
         }
      }

   }

   public final void a_() {
      super.a_();
      int var1;
      int var3;
      if (super.a.b == 0) {
         vdtt_km var2 = this;

         for(var3 = 0; var3 < var2.al.length; ++var3) {
            vdtt_bs var4 = var2.al[var3];
            boolean var5 = true;
            var4.d = var5;
         }

         if (var2.aa[0] == null) {
            if (!var2.Q) {
               var2.P = null;
            }
         } else if (var2.P == null || !var2.Y.equals(var2.aa[0].strData)) {
            var2.Y = var2.aa[0].strData;
            var2.P = var2.aa[0].a();
            ItemOption[] var13 = var2.P.L();
            var2.Z = null;
            short var14 = 349;
            byte var15 = 4;
            byte var6 = 3;
            switch(var2.am.b) {
            case 1:
               var14 = 350;
               var15 = 7;
               var6 = 6;
               break;
            case 2:
               var14 = 298;
               var15 = 5;
               var6 = 4;
            }

            var2.W = var2.X = 0;
            ItemOption var7 = null;
            ItemOption var8 = null;
            Vector var9 = new Vector();
            int var10;
            if (var13 != null) {
               for(var10 = 0; var10 < var13.length; ++var10) {
                  if (var13[var10].option[0] == 349) {
                     var8 = var13[var10];
                  }

                  if (var13[var10].option[0] == var14) {
                     var2.Z = var13[var10];
                  }

                  ItemOption var11;
                  if ((var11 = var13[var10]).option[0] != 159 && var11.option[0] != 165 && var11.option[0] != 163 && var11.option[0] != 164 && var11.option[0] != 148) {
                     var9.add(var13[var10]);
                  } else {
                     var7 = var13[var10];
                  }
               }
            }

            if (var2.Z == null) {
               var2.Z = new ItemOption(var14 + ",0,1");
               if (var2.am.b == 0) {
                  var9.insertElementAt(var2.Z, 0);
               } else if (var2.am.b == 1) {
                  if (var8 == null) {
                     var9.insertElementAt(var2.Z, 0);
                  } else {
                     for(int var16 = var10 = var9.indexOf(var8); var16 < var13.length; ++var16) {
                        if (var13[var16].getItemOptionTemplate().type == 17) {
                           var10 = var16;
                        }
                     }

                     ++var10;
                     var9.insertElementAt(var2.Z, var10);
                  }
               } else if (var2.am.b == 2) {
                  var9.add(var2.Z);
               }
            } else if (var2.Z.f() < var15) {
               var2.Z.e(var2.Z.f() + 1);
            } else {
               var2.Z = null;
            }

            if (var2.Z.f() < var6) {
               var2.W = 250000;
            } else {
               var2.X = 250000;
            }

            if (var7 != null) {
               var9.add(var7);
            }

            var2.P.strData = Item.a(var9);
         }

         for(var1 = 0; var1 < this.S.length; ++var1) {
            this.S[var1].a();
         }
      } else {
         this.B();
      }

      if (this.O != null) {
         this.O.o();
         if (this.O.p()) {
            this.O = null;
         }
      }

      for(var1 = 0; var1 < this.N.length; ++var1) {
         if (this.N[var1] > 0) {
            int var10003 = this.N[var1]--;
         }
      }

      String var12;
      if (this.Q) {
         var12 = Caption.rG;
         this.V.l = var12;
      } else {
         var12 = Caption.rx;
         this.V.l = var12;
      }

      if (GameSrc.gI().idTask == 5) {
         if (GameSrc.gI().idStep == 9) {
            if (this.aa[0] == null) {
               if (super.a.b != 1) {
                  var3 = this.cx + 145;
                  DataCenter.gI().pointHelper.a(var3, this.cy + 14);
               } else if (this.k == null) {
                  if (this.T.h() != 0) {
                     var3 = this.cx + 90;
                     DataCenter.gI().pointHelper.a(var3, this.cy + 47);
                     DataCenter.gI().pointHelper.b = true;
                  } else {
                     var3 = this.cx + 65;
                     DataCenter.gI().pointHelper.a(var3, this.cy + 80);
                     DataCenter.gI().pointHelper.b = true;
                  }
               }
            } else if (super.a.b != 0) {
               var3 = this.cx + 80;
               DataCenter.gI().pointHelper.a(var3, this.cy + 14);
            } else if (!this.al[0].l) {
               DataCenter.gI().pointHelper.a(this.cx + this.al[0].cx + 25 + AppListener.gI().m(), this.cy + this.al[0].cy + 9);
            } else {
               DataCenter.gI().pointHelper.a(this.cx + this.V.cx + 25 + AppListener.gI().m(), this.cy + this.V.cy + 14);
            }

            DataCenter.gI().pointHelper.b = true;
            return;
         }

         if (GameSrc.gI().idStep == 10) {
            if (this.aa[0] == null) {
               if (super.a.b != 1) {
                  var3 = this.cx + 145;
                  DataCenter.gI().pointHelper.a(var3, this.cy + 14);
               } else if (this.k == null) {
                  if (this.T.h() != 0) {
                     var3 = this.cx + 90;
                     DataCenter.gI().pointHelper.a(var3, this.cy + 47);
                     DataCenter.gI().pointHelper.b = true;
                  } else {
                     var3 = this.cx + 65;
                     DataCenter.gI().pointHelper.a(var3, this.cy + 80);
                     DataCenter.gI().pointHelper.b = true;
                  }
               }
            } else if (super.a.b != 0) {
               var3 = this.cx + 80;
               DataCenter.gI().pointHelper.a(var3, this.cy + 14);
            } else if (!this.al[1].l) {
               DataCenter.gI().pointHelper.a(this.cx + this.al[1].cx + 25 + AppListener.gI().m(), this.cy + this.al[1].cy + 9);
            } else {
               DataCenter.gI().pointHelper.a(this.cx + this.V.cx + 25 + AppListener.gI().m(), this.cy + this.V.cy + 14);
            }

            DataCenter.gI().pointHelper.b = true;
            return;
         }

         if (GameSrc.gI().idStep == 11) {
            this.y();
         }
      }

   }

   public final void b(Graphics var1) {
      if (this.w() <= 0) {
         this.a(var1, this.cx, this.cy, this.width, this.height, Caption.y, (byte)2, this.J);
      } else {
         super.b(var1);
      }

      if (super.a.b == 0) {
         if (this.N[1] == 0 || this.N[1] % 12 > 5) {
            vdtt_dd.b(vdtt_dd.d, var1, Caption.rw, 14, this.f() + 11, 0, -10831436, -16777216);
         }

         if (this.Q) {
            if (this.N[2] % 12 > 5 || this.N[2] == 0) {
               vdtt_dd.b(vdtt_dd.d, var1, Caption.rA, this.S[0].cx, this.S[0].cy + 50, 0, -2560, -16777216);
            }
         } else if (this.P != null && (this.N[0] == 0 || this.N[0] % 12 > 5)) {
            if (this.Z != null) {
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.ry, "" + this.Z.f()), this.S[0].cx, this.S[0].cy + 45, 0, -1, -16777216);
            } else {
               switch(this.am.b) {
               case 0:
                  vdtt_dd.b(vdtt_dd.d, var1, Caption.ti, this.S[0].cx, this.S[0].cy + 50, 0, -2560, -16777216);
                  break;
               case 1:
                  vdtt_dd.b(vdtt_dd.d, var1, Caption.tj, this.S[0].cx, this.S[0].cy + 50, 0, -2560, -16777216);
                  break;
               case 2:
                  vdtt_dd.b(vdtt_dd.d, var1, Caption.tk, this.S[0].cx, this.S[0].cy + 50, 0, -2560, -16777216);
               }
            }

            int var2 = -1;
            if (Char.gI().bac < this.X || Char.gI().bacKhoa < this.W) {
               var2 = -65536;
            }

            if (this.X > 0) {
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.pj, Utlis.c(this.X)), this.S[0].cx, this.S[0].cy + 60, 0, var2, -16777216);
            } else if (this.W > 0) {
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.bv, Utlis.c(this.W)), this.S[0].cx, this.S[0].cy + 60, 0, var2, -16777216);
            }
         }

         vdtt_cz.a(var1, 95, 0, 65 - DataCenter.gI().h / 3 % 3, this.f() + 25, 20);
         a(var1, this.S[0].cx, this.S[0].cy, this.aa[0], this.S[0].k >= 0, Caption.bD);
         a(var1, this.S[1].cx, this.S[1].cy, this.P, this.S[1].k >= 0, Caption.qt);
         if (this.O != null) {
            this.O.b(var1, this.S[1].cx + this.S[1].h / 2, this.S[1].cy + this.S[1].h / 2);
         }
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         for(int var2 = 0; var2 < this.S.length; ++var2) {
            var1.addElement(this.S[var2].a(1001 + var2, this));
         }
      }

      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      if (super.a.b == this.w() && var1.b == 0) {
         this.d();
      }

      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         switch(var1.b) {
         case 300:
            this.a(true);
            return;
         case 1001:
            this.ac = 1;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.aa[0]);
            if (this.aa[0] == null) {
               this.f(1);
               DataCenter.gI().currentScreen.c(Caption.rw, -1);
               return;
            }
            break;
         case 1002:
            this.ac = 10;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.P);
            return;
         case 2001:
            this.a(false);
         }
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      try {
         super.b(var1, var2, var3);
         if (var1 == 200) {
            this.P = null;
            this.N[0] = 0;
         }
      } catch (Exception var5) {
         Utlis.a(var5);
      }

   }

   private void a(vdtt_hp var1, int var2) {
      for(int var3 = 0; var3 < this.S.length; ++var3) {
         this.S[var3].k = -1;
      }

      var1.k = var2;
   }

   private void a(boolean var1) {
      try {
         if (this.P == null) {
            this.N[1] = 50;
         } else if (this.Q) {
            Char.gI().i(this.P.w)[this.P.index] = null;
            this.aa[0] = this.P;
            this.Q = false;
            this.P = null;
         } else if (this.Z != null && Char.gI().bac >= this.X && Char.gI().bacKhoa >= this.W) {
            if (this.P == null) {
               DataCenter.gI().currentScreen.c(Caption.rw, -65536);
            } else {
               Message var2;
               (var2 = Message.c((byte)-42)).writeByte(this.aa[0].w);
               var2.writeShort(this.aa[0].index);
               var2.writeByte(this.am.b);
               var2.send();
            }
         } else {
            this.N[0] = 50;
         }
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }

   public final void f(int var1) {
      super.f(var1);
      if (this.Q) {
         this.Q = false;
         this.P = null;
      }

   }
}
