package gro;

import java.util.Vector;

public final class vdtt_ml extends vdtt_jo {
   private vdtt_hq O;
   private vdtt_ay P;
   private vdtt_ay Q;
   public Item[] N = new Item[16];

   public vdtt_ml(MainScreen var1) {
      super(var1, Caption.zP);
      this.P = this.a(this.width / 2 - 35, this.height - 33, Caption.bi, this, 5002, -8);
      this.a(this.P, 0);
      this.Q = this.a(6, this.height - 50, Caption.lh, this, 2002, -8);
      this.a(this.Q, 0);
      this.O = new vdtt_hq((byte)1, 7, this.f() + 3, 128, 128, 32, Utlis.c(this.N.length, 4), 4);
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      if (super.a.b == this.w() && var1.b == 0) {
         this.d();
      }

      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         int var4;
         vdtt_ml var5;
         switch(var1.b) {
         case 2002:
            var5 = this;
            Vector var6 = new Vector();
            int var7;
            int var8;
            Task var9;
            vdtt_ii var10;
            vdtt_ii var11;
            if ((var9 = GameSrc.gI().S()).b()) {
               for(var4 = 0; var4 < var9.p.size(); ++var4) {
                  if ((var11 = (vdtt_ii)var9.p.elementAt(var4)).a()) {
                     var8 = var11.b();
                     var6.add(var8);
                  }
               }
            } else if ((var10 = GameSrc.gI().T()) != null) {
               var7 = var10.b();
               var6.add(var7);
            }

            for(var4 = 0; var4 < Char.gI().arrItemBag.length; ++var4) {
               if (Char.gI().arrItemBag[var4] != null && var6.contains(Char.gI().arrItemBag[var4].id)) {
                  var5.b(Char.gI().arrItemBag[var4]);
               }
            }

            boolean var12;
            if (!var9.b()) {
               if ((var10 = GameSrc.gI().T()) != null) {
                  var7 = 0;

                  for(var8 = 0; var8 < var5.N.length; ++var8) {
                     if (var5.N[var8] != null && var5.N[var8].id == var10.b() && (var7 += var5.N[var8].M()) >= var10.i) {
                        var12 = true;
                        return;
                     }
                  }
               }
            } else {
               var4 = 0;

               while(true) {
                  if (var4 >= var9.p.size()) {
                     var12 = true;
                     return;
                  }

                  if ((var11 = (vdtt_ii)var9.p.elementAt(var4)).a()) {
                     var8 = 0;

                     for(var2 = 0; var2 < var5.N.length; ++var2) {
                        if (var5.N[var2] != null && var5.N[var2].id == var11.b()) {
                           var8 += var5.N[var2].M();
                        }
                     }

                     if (var8 < var11.i) {
                        break;
                     }
                  }

                  ++var4;
               }
            }

            var12 = false;
            break;
         case 5001:
            this.k = a(var1, this, this.N[var1.j.k]);
            return;
         case 5002:
            var5 = this;

            try {
               Message var13 = new Message((byte)10);
               var3 = 0;

               for(var4 = 0; var4 < var5.N.length; ++var4) {
                  if (var5.N[var4] != null) {
                     ++var3;
                  }
               }

               var13.writeByte(var3);

               for(var4 = 0; var4 < var5.N.length; ++var4) {
                  if (var5.N[var4] != null) {
                     var13.writeShort(var5.N[var4].index);
                  }
               }

               var13.send();
            } catch (Exception var14) {
               Utlis.a(var14);
               return;
            }
         }
      }

   }

   private void b(Item var1) {
      try {
         for(int var2 = 0; var2 < this.N.length; ++var2) {
            if (this.N[var2] == null) {
               this.N[var2] = var1;
               break;
            }
         }

         Char.gI().arrItemBag[var1.index] = null;
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      super.b(var1);
      if (super.a.b == 0) {
         this.a(var1, this.O);

         int var2;
         for(var2 = 0; var2 < this.O.i; ++var2) {
            for(int var3 = 0; var3 < this.O.O; ++var3) {
               if (this.O.b(var2)) {
                  b(var1, var3 * this.O.h, var2 * this.O.h, this.N[var2 * this.O.O + var3], var2 * this.O.O + var3 == this.O.k);
               }
            }
         }

         this.a(var1);
         this.a(var1, this.cx + 4, this.cy + this.f());
         byte var11 = 10;
         int var4 = this.O.width + 10;
         var2 = var11 + 15;
         vdtt_dd.b(vdtt_dd.d, var1, Caption.jM, var4, 25, 0, -1, -16777216);
         Task var5 = GameSrc.gI().S();
         if (GameSrc.gI().idStep >= var5.p.size()) {
            for(int var12 = 0; var12 < var5.p.size(); ++var12) {
               vdtt_ii var13;
               if ((var13 = (vdtt_ii)var5.p.elementAt(var12)).a()) {
                  int var8 = var13.b();
                  vdtt_dd var9 = vdtt_dd.d;
                  String var10 = "- " + var13.i + " " + DataCenter.gI().itemTemplate[var8].name;
                  var4 = this.O.width + 15;
                  var2 += 15;
                  vdtt_dd.b(var9, var1, var10, var4, var2, 0, -1, -16777216);
               }
            }

            return;
         }

         vdtt_ii var6;
         if ((var6 = GameSrc.gI().T()) != null) {
            int var7 = var6.b();
            vdtt_dd.b(vdtt_dd.d, var1, "- " + var6.i + " " + DataCenter.gI().itemTemplate[var7].name, this.O.width + 15, 40, 0, -1, -16777216);
         }
      }

   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         this.O.a();
      }

      DataCenter.gI();
      if (!DataCenter.b() && this.H.b.lastElement().equals(this)) {
         if (GameSrc.gI().idTask == 1 && GameSrc.gI().idStep == 1) {
            this.g(378);
         } else if (GameSrc.gI().idTask == 2 && GameSrc.gI().idStep == 1) {
            this.g(194);
         } else if (GameSrc.gI().idTask == 3 && GameSrc.gI().idStep == 1) {
            this.g(379);
         } else if (GameSrc.gI().idTask == 13 && GameSrc.gI().idStep == 2) {
            boolean var1 = true;
            var1 = true;
            int var2;
            if (super.a.b != 0) {
               var2 = this.cx + 70;
               DataCenter.gI().pointHelper.a(var2, this.cy + 10);
               DataCenter.gI().pointHelper.b = true;
               return;
            }

            int var3;
            if (this.h(194) > 0) {
               var2 = this.cx + this.width / 2;
               var3 = this.cy + this.height;
               DataCenter.gI().pointHelper.a(var2, var3 - 20);
            } else {
               var2 = this.cx + 35;
               var3 = this.cy + this.height;
               DataCenter.gI().pointHelper.a(var2, var3 - 40);
            }

            DataCenter.gI().pointHelper.b = true;
         } else {
            if (GameSrc.gI().idTask == 15 && GameSrc.gI().idStep == 1) {
               this.g(382);
               return;
            }

            if (GameSrc.gI().idTask == 16 && GameSrc.gI().idStep == 1) {
               this.g(195);
               return;
            }

            if (GameSrc.gI().idTask == 19) {
               switch(GameSrc.gI().idStep) {
               case 1:
                  this.g(383);
                  return;
               case 4:
                  this.g(384);
               }
            }
         }
      }

   }

   private void g(int var1) {
      int var2;
      if (super.a.b == 0) {
         int var3;
         if (this.h(var1) > 0) {
            var2 = this.cx + this.width / 2;
            var3 = this.cy + this.height;
            DataCenter.gI().pointHelper.a(var2, var3 - 20);
         } else {
            var2 = this.cx + 35;
            var3 = this.cy + this.height;
            DataCenter.gI().pointHelper.a(var2, var3 - 40);
         }

         DataCenter.gI().pointHelper.b = true;
      } else {
         var2 = this.cx + 70;
         DataCenter.gI().pointHelper.a(var2, this.cy + 10);
         DataCenter.gI().pointHelper.b = true;
      }

   }

   private int h(int var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < this.N.length; ++var3) {
         if (this.N[var3] != null && this.N[var3].id == var1) {
            var2 += this.N[var3].M();
         }
      }

      return var2;
   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         var1.addElement(this.O.a(5001, this));
      }

      return var1;
   }

   public final void d() {
      super.d();

      for(int var1 = 0; var1 < this.N.length; ++var1) {
         if (this.N[var1] != null) {
            int var2 = this.N[var1].index;
            Char.gI().arrItemBag[var2] = this.N[var1];
            this.N[var1] = null;
         }
      }

   }
}
