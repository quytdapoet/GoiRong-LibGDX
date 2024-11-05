package gro;

import java.util.Vector;

public final class vdtt_ky extends vdtt_jx {
   public Item[] N = new Item[2];
   public Item[] O = new Item[1];
   private vdtt_hq[] W = new vdtt_hq[3];
   private vdtt_ay X;
   public int P;
   public int[] Q = new int[2];
   public vdtt_hf R;
   private vdtt_bs[] Y = new vdtt_bs[2];
   private vdtt_hl Z;
   private int al = 150;
   private int am = 20;
   public int S;
   public int V;

   public vdtt_ky(MainScreen var1) {
      super(var1, new String[]{Caption.tt, Caption.P});
      this.W[0] = new vdtt_hq((byte)1, 64, this.f() + 20, 30, 30, 30, 1, 1);
      this.W[1] = new vdtt_hq((byte)1, 134, this.f() + 20, 30, 30, 30, 1, 1);
      this.W[2] = new vdtt_hq((byte)1, 204, this.f() + 20, 32, 32, 32, 1, 1);
      this.X = this.a(this.width - 70, this.height - 33, Caption.tt, this, 0, -8);
      this.a(this.X, 0);
      this.Z = new vdtt_hl(200, 0);
      this.Y[0] = this.a(104, this.f() + 70, Caption.tz, this, this.Z);
      this.Y[1] = this.a(104, this.f() + 90, Caption.tA, this, this.Z);
      this.a(this.Y[0], 0);
      this.a(this.Y[1], 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         Item var3;
         if (var1[var2] != null && !(var3 = var1[var2]).ai() && !var3.x() && var3.y() && var3.level >= 14 && var3.strData.length() > 0) {
            this.aj.add(var1[var2]);
         }
      }

   }

   private void C() {
      for(int var1 = 0; var1 < this.O.length; ++var1) {
         if (this.O[var1] != null) {
            int var2 = this.O[var1].index;
            Char.gI().arrItemBag[var2] = this.O[var1];
            this.O[var1] = null;
         }
      }

   }

   private static void a(Vector var0, ItemOption var1) {
      for(int var2 = 0; var2 < var0.size(); ++var2) {
         if (((ItemOption)var0.get(var2)).option[0] == var1.option[0]) {
            ((ItemOption)var0.get(var2)).d(var1.option[1]);
            return;
         }
      }

      var0.add(var1);
   }

   private void a(Item var1, Item var2) {
      this.N[1] = var1.b();
      Vector var3 = new Vector();
      Vector var4 = new Vector();
      ItemOption[] var5 = this.N[1].L();
      ItemOption var6 = null;

      for(int var7 = 0; var7 < var5.length; ++var7) {
         if (var5[var7].option[0] == 370) {
            (var6 = var5[var7]).c(var6.option[1] + 1);
         }

         if (var5[var7].getItemOptionTemplate().type == 18) {
            var4.add(var5[var7]);
         } else {
            var3.add(var5[var7]);
         }
      }

      if (var4.size() == 0) {
         var6 = new ItemOption("370,1,-1");
         var4.add(var6);
      }

      var5 = var2.L();
      Vector var10 = new Vector();

      int var8;
      for(var8 = 0; var8 < DataCenter.gI().itemOptionTemplate.length; ++var8) {
         if (DataCenter.gI().itemOptionTemplate[var8].type == 18) {
            var10.add(DataCenter.gI().itemOptionTemplate[var8]);
         }
      }

      for(var8 = 0; var8 < var5.length; ++var8) {
         if (var5[var8].option[0] == 370) {
            var6.c(var6.option[1] + var5[var8].option[1]);
         }

         if (var5[var8].getItemOptionTemplate().type == 17) {
            for(int var9 = 0; var9 < var10.size(); ++var9) {
               if (((ItemOptionTemplate)var10.get(var9)).text.equals(var5[var8].getItemOptionTemplate().text)) {
                  a(var4, new ItemOption(((ItemOptionTemplate)var10.get(var9)).id + "," + var5[var8].option[1] + ",-1"));
                  break;
               }
            }
         } else if (var5[var8].getItemOptionTemplate().type == 18) {
            a(var4, var5[var8]);
         }
      }

      var3.addAll(var4);
      this.N[1].strData = Item.a(var3);
   }

   public final void a_() {
      super.a_();
      int var1;
      if (super.a.b == 0) {
         vdtt_bs var2;
         boolean var3;
         if (this.S == 0) {
            this.N[1] = null;
            if (this.N[0] != null && this.O[0] != null && this.N[0].getItemTemplate().type == this.O[0].getItemTemplate().type) {
               for(var1 = 0; var1 < this.Y.length; ++var1) {
                  var2 = this.Y[var1];
                  var3 = false;
                  var2.d = var3;
               }

               if (this.Z.a() == 0) {
                  this.a(this.N[0], this.O[0]);
               } else {
                  this.a(this.O[0], this.N[0]);
               }
            } else {
               for(var1 = 0; var1 < this.Y.length; ++var1) {
                  var2 = this.Y[var1];
                  var3 = true;
                  var2.d = var3;
               }
            }
         }

         String var4 = Caption.tt;
         this.X.l = var4;
         if (this.S > 0) {
            var4 = Caption.tI;
            this.X.l = var4;

            for(var1 = 0; var1 < this.Y.length; ++var1) {
               var2 = this.Y[var1];
               var3 = true;
               var2.d = var3;
            }
         }

         for(var1 = 0; var1 < this.W.length; ++var1) {
            this.W[var1].a();
         }
      } else {
         this.B();
      }

      if (this.R != null) {
         this.R.o();
         if (this.R.p()) {
            this.R = null;
         }
      }

      for(var1 = 0; var1 < this.Q.length; ++var1) {
         if (this.Q[var1] > 0) {
            int var10003 = this.Q[var1]--;
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
         if (this.Q[1] == 0 || this.Q[1] % 12 > 5) {
            vdtt_dd.b(vdtt_dd.d, var1, Caption.tx, this.width / 2, this.f() + 11, 2, -10831436, -16777216);
         }

         a(var1, this.W[0].cx, this.W[0].cy, this.N[0], this.W[0].k >= 0, Caption.bD);
         a(var1, this.W[1].cx, this.W[1].cy, this.N[1], this.W[1].k >= 0, Caption.Q);
         b(var1, this.W[2].cx, this.W[2].cy, this.O[0], this.W[2].k >= 0, Caption.bD);
         vdtt_dd.b(vdtt_dd.b, var1, Caption.vk, this.W[0].cx + 15, this.W[0].cy + 37, 2, -1, -16777216);
         vdtt_dd.b(vdtt_dd.b, var1, Caption.vl, this.W[2].cx + 15, this.W[2].cy + 37, 2, -1, -16777216);
         if (this.R != null) {
            this.R.b(var1, this.W[1].cx + this.W[1].h / 2, this.W[1].cy + this.W[1].h / 2);
         }

         vdtt_cz.a(var1, 95, 0, 103 + DataCenter.gI().h / 3 % 3, this.f() + 25, 20);
         vdtt_cz.a(var1, 95, -360, 174 - DataCenter.gI().h / 3 % 3, this.f() + 25, 20);
         int var2 = this.f() + 98;
         if (this.Q[0] == 0 || this.Q[0] % 12 > 5) {
            int var3 = Char.gI().f(829);
            if (this.S > 0) {
               if (this.S == 1) {
                  vdtt_dd.b(vdtt_dd.d, var1, Caption.tG, this.width / 2, var2, 2, -2560, -16777216);
               } else {
                  vdtt_dd.b(vdtt_dd.d, var1, Caption.tH, this.width / 2, var2, 2, -1, -16777216);
               }
            } else if (this.N[1] != null) {
               if (var3 < this.al) {
                  vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.np, Utlis.c(this.al)) + Utlis.b(Caption.lN, Utlis.c(var3)), this.Y[0].cx - 30, this.Y[1].cy + 26, 0, -65536, -16777216);
               } else {
                  vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.np, Utlis.c(this.al)) + Utlis.b(Caption.lN, Utlis.c(var3)), this.Y[0].cx - 30, this.Y[1].cy + 26, 0, -6488, -16777216);
               }
            } else {
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.np, Utlis.c(this.al)) + Utlis.b(Caption.lN, Utlis.c(var3)), this.Y[0].cx - 30, this.Y[1].cy + 26, 0, -6488, -16777216);
            }
         }

         vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.tB, Utlis.c(this.am)), this.Y[0].cx - 30, this.Y[1].cy + 40, 0, -6488, -16777216);
         vdtt_dd.b(vdtt_dd.d, var1, Caption.tC, this.Y[0].cx - 30, this.Y[1].cy + 54, 0, -6488, -16777216);
         vdtt_dd.b(vdtt_dd.d, var1, Caption.vj, this.Y[0].cx - 30, this.Y[1].cy + 68, 0, -6488, -16777216);
         vdtt_dd.b(vdtt_dd.d, var1, Caption.tD, this.Y[0].cx - 30, this.Y[1].cy + 82, 0, -6488, -16777216);
         vdtt_dd.b(vdtt_dd.d, var1, Utlis.a(Caption.xn, (long)(this.V + 1)), this.Y[0].cx - 30, this.Y[1].cy + 96, 0, -6488, -16777216);
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         for(int var2 = 0; var2 < this.W.length; ++var2) {
            var1.addElement(this.W[var2].a(1001 + var2, this));
         }
      }

      return var1;
   }

   public final void f(int var1) {
      super.f(var1);
      this.S = 0;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      if (super.a.b == this.w() && var1.b == 0) {
         this.d();
      }

      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         switch(var1.b) {
         case 0:
            this.a(true);
            return;
         case 1001:
            this.P = 1;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.N[0]);
            if (this.N[0] == null) {
               this.f(2);
               DataCenter.gI().currentScreen.c(Caption.ty, -1);
               return;
            }
            break;
         case 1002:
            this.P = 2;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.N[1]);
            return;
         case 1003:
            try {
               this.P = 3;
               this.a(var1.j, var1.j.k);
               if (this.O[var1.j.k] != null) {
                  this.k = a(var1, this, this.O[var1.j.k]);
                  return;
               }

               this.f(2);
               DataCenter.gI().currentScreen.c(Caption.ty, -1);
            } catch (Exception var5) {
            }
            break;
         case 2001:
            this.a(false);
            return;
         }
      }

   }

   private void a(vdtt_hp var1, int var2) {
      for(int var3 = 0; var3 < this.W.length; ++var3) {
         this.W[var3].k = -1;
      }

      var1.k = var2;
   }

   public final void d() {
      super.d();
      if (this.N[0] != null) {
         Char.gI().i(this.N[0].w)[this.N[0].index] = this.N[0];
         this.N[0] = null;
      }

      this.C();
   }

   private void a(boolean var1) {
      try {
         if (this.S > 0) {
            this.S = 0;
         } else if (this.N[1] == null) {
            this.Q[1] = 50;
         } else if (Char.gI().f(829) < this.al) {
            this.Q[0] = 50;
         } else if (!var1) {
            Message var2 = Message.c((byte)-25);
            if (this.Z.a() == 0) {
               var2.writeByte(this.N[0].w);
               var2.writeShort(this.N[0].index);
               var2.writeByte(this.O[0].w);
               var2.writeShort(this.O[0].index);
            } else {
               var2.writeByte(this.O[0].w);
               var2.writeShort(this.O[0].index);
               var2.writeByte(this.N[0].w);
               var2.writeShort(this.N[0].index);
            }

            var2.send();
         } else {
            Item var6;
            if (this.Z.a() == 0) {
               var6 = this.O[0];
            } else {
               var6 = this.N[0];
            }

            ItemOption[] var3 = var6.L();

            for(int var4 = 0; var4 < var3.length; ++var4) {
               if ((var3[var4].option[0] == 298 || var3[var4].option[0] == 350) && var3[var4].option[1] > 0) {
                  DataCenter.gI().currentScreen.a(Utlis.b(Caption.tE, Utlis.c(this.al)), 2001, this);
                  return;
               }
            }

            DataCenter.gI().currentScreen.a(Utlis.b(Caption.tE, Utlis.c(this.al)), 2001, this);
         }
      } catch (Exception var5) {
         Utlis.a(var5);
      }

   }
}
