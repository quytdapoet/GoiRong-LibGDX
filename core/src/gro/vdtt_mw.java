package gro;

import java.util.Vector;

public final class vdtt_mw extends vdtt_jx {
   public Item[] N = new Item[2];
   public Item[] O = new Item[6];
   private vdtt_hq[] V = new vdtt_hq[3];
   private vdtt_ay W;
   public int P;
   public int Q = 0;
   public vdtt_hf R;
   public boolean S;

   public vdtt_mw(MainScreen var1) {
      super(var1, new String[]{Caption.lE, Caption.P});
      this.V[0] = new vdtt_hq((byte)1, 124, this.f() + 20, 30, 30, 30, 1, 1);
      this.V[1] = new vdtt_hq((byte)1, 14, this.f() + 20, 64, 96, 32, 3, 2);
      this.V[2] = new vdtt_hq((byte)1, 204, this.f() + 20, 30, 30, 30, 1, 1);
      this.W = this.a(this.width - 70, this.height - 33, Caption.bG, this, 0, -8);
      this.a(this.W, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].H()) {
            this.aj.add(var1[var2]);
         }
      }

   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         if (!this.S) {
            if (this.N[0] == null) {
               this.N[1] = null;
            } else {
               this.N[1] = this.N[0].a();
               byte var1 = this.N[1].level;
               this.N[1].a(0);
               this.N[1].isLock = true;
               ItemOption[] var2 = this.N[1].L();
               Vector var3 = new Vector();
               String[] var4 = new String[]{"", "168,10,-1", "169,10,-1", "170,10,-1", "171,10,-1", "172,10,-1"};
               String[] var5 = new String[]{"", "259,80,-1", "260,80,-1", "261,80,-1", "262,80,-1", "263,80,-1"};
               boolean var6 = false;
               boolean var7 = false;

               for(int var8 = 0; var8 < var2.length; ++var8) {
                  if (var2[var8].option[0] != 148) {
                     if (var2[var8].getItemOptionTemplate().type == 2 && !var6) {
                        var3.add(new ItemOption(var4[this.N[1].g]));
                        var3.add(new ItemOption("254,10,-1"));
                        var6 = true;
                     }

                     var3.add(var2[var8]);
                     if (var2[var8].getItemOptionTemplate().type == 7 && !var7) {
                        var3.add(new ItemOption("252,5,-1"));
                        var3.add(new ItemOption(var5[this.N[1].g]));
                        var7 = true;
                     }
                  }
               }

               var3.add(new ItemOption("165,0,-1"));
               this.N[1].strData = Item.a(var3);
               this.N[1].a(var1);
            }
         }

         for(int var9 = 0; var9 < this.V.length; ++var9) {
            this.V[var9].a();
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

      if (this.Q > 0) {
         --this.Q;
      }

   }

   public final void f(int var1) {
      super.f(var1);
      if (var1 != 0 && this.S) {
         this.S = false;
      }

   }

   public final void b(Graphics var1) {
      if (this.w() <= 0) {
         this.a(var1, this.cx, this.cy, this.width, this.height, Caption.y, (byte)2, this.J);
      } else {
         super.b(var1);
      }

      if (super.a.b == 0) {
         vdtt_dd.b(vdtt_dd.d, var1, Caption.lD + DataCenter.gI().itemTemplate[353].name, 14, this.f() + 11, 0, -10831436, -16777216);
         vdtt_dd.b(vdtt_dd.d, var1, Caption.lB + DataCenter.gI().itemTemplate[353].name, 89, this.f() + 65, 0, -10831436, -16777216);
         vdtt_dd.b(vdtt_dd.d, var1, Caption.lC, 89, this.f() + 80, 0, -10831436, -16777216);
         vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.pY, Utlis.c(30000000)), 89, this.f() + 95, 0, -10831436, -16777216);
         a(var1, this.V[0].cx, this.V[0].cy, this.N[0], this.V[0].k >= 0, Caption.P);
         a(var1, this.V[2].cx, this.V[0].cy, this.N[1], this.V[2].k >= 0, Caption.Q);
         vdtt_cz.a(var1, 95, 0, 170 - DataCenter.gI().h / 3 % 3, this.f() + 25, 20);
         if (this.Q > 0 && this.Q % 14 > 2) {
            vdtt_dd.b(vdtt_dd.d, var1, Caption.lZ + DataCenter.gI().itemOptionTemplate[165].text, 14, this.f() + 125, 0, -2560, -16777216);
         }

         this.a(var1, this.V[1]);
         int var2 = 0;

         for(int var3 = 0; var3 < this.V[1].i; ++var3) {
            for(int var4 = 0; var4 < this.V[1].O; ++var4) {
               b(var1, var4 * this.V[1].h, var3 * this.V[1].h, this.O[var3 * this.V[1].O + var4], var2 == this.V[1].k, Caption.zX[var4]);
               ++var2;
            }
         }

         this.a(var1);
         if (this.R != null) {
            this.R.b(var1, this.V[2].cx + this.V[2].h / 2, this.V[2].cy + this.V[2].h / 2);
         }
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         for(int var2 = 0; var2 < this.V.length; ++var2) {
            var1.addElement(this.V[var2].a(1001 + var2, this));
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
         case 0:
            vdtt_mw var4 = this;

            try {
               var2 = 0;

               for(var3 = 0; var3 < var4.O.length; ++var3) {
                  if (var4.O[var3] != null) {
                     ++var2;
                  }
               }

               if (var4.N[0] != null && var2 != 0) {
                  Message var5;
                  (var5 = new Message((byte)-35)).writeByte(var4.N[0].w);
                  var5.writeShort(var4.N[0].index);
                  var5.writeByte(var2);

                  for(var2 = 0; var2 < var4.O.length; ++var2) {
                     if (var4.O[var2] != null) {
                        var5.writeShort(var4.O[var2].index);
                     }
                  }

                  var5.send();
               } else {
                  DataCenter.gI().currentScreen.c(Caption.lD + DataCenter.gI().itemTemplate[353].name, -65536);
               }
               break;
            } catch (Exception var6) {
               Utlis.a(var6);
               return;
            }
         case 1001:
            this.P = 1;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.N[0]);
            return;
         case 1002:
            this.P = 2;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.O[var1.j.k]);
            return;
         case 1003:
            this.P = 3;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.N[1]);
         }
      }

   }

   private void a(vdtt_hp var1, int var2) {
      for(int var3 = 0; var3 < this.V.length; ++var3) {
         this.V[var3].k = -1;
      }

      var1.k = var2;
   }

   public final void d() {
      super.d();
      if (this.N[0] != null) {
         Char.gI().i(this.N[0].w)[this.N[0].index] = this.N[0];
         this.N[0] = null;
      }

      for(int var1 = 0; var1 < this.O.length; ++var1) {
         if (this.O[var1] != null) {
            int var2 = this.O[var1].index;
            Char.gI().arrItemBag[var2] = this.O[var1];
            this.O[var1] = null;
         }
      }

   }
}
