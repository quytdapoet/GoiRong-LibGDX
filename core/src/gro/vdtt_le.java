package gro;

import java.util.Vector;

public final class vdtt_le extends vdtt_jo {
   private vdtt_hq O;
   private vdtt_ay P;
   public Item[] N = new Item[16];

   public vdtt_le(MainScreen var1) {
      super(var1, Caption.AP);
      this.P = this.a(this.width / 2 - 35, this.height - 33, Caption.bi, this, 5002, -8);
      this.a(this.P, 0);
      this.O = new vdtt_hq((byte)1, 7, this.f() + 3, 128, 128, 32, Utlis.c(this.N.length, 4), 4);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         Item var3;
         if ((var3 = var1[var2]) != null && (var3.id == 171 || var3.id == 172 || var3.id == 173 || var3.id == 355 || var3.id == 356 || var3.id == 357 || var3.id == 358 || var3.id == 359 || var3.id == 360 || var3.id == 361 || var3.id == 362 || var3.id == 363)) {
            this.aj.add(var1[var2]);
         }
      }

   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      if (super.a.b == this.w() && var1.b == 0) {
         this.d();
      }

      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         switch(var1.b) {
         case 5001:
            this.k = a(var1, this, this.N[var1.j.k]);
            return;
         case 5002:
            vdtt_le var4 = this;

            try {
               Message var5 = Message.c((byte)-53);
               var3 = 0;

               int var6;
               for(var6 = 0; var6 < var4.N.length; ++var6) {
                  if (var4.N[var6] != null) {
                     ++var3;
                  }
               }

               var5.writeByte(var3);

               for(var6 = 0; var6 < var4.N.length; ++var6) {
                  if (var4.N[var6] != null) {
                     var5.writeShort(var4.N[var6].index);
                  }
               }

               var5.send();
               return;
            } catch (Exception var7) {
               Utlis.a(var7);
            }
         }
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      super.b(var1);
      if (super.a.b == 0) {
         vdtt_dd.b(vdtt_dd.d, var1, Caption.pN, 144, this.f() + 20, 0, -1, -16777216);
         vdtt_dd.b(vdtt_dd.d, var1, Caption.pO, 144, this.f() + 36, 0, -1, -16777216);
         vdtt_dd.b(vdtt_dd.d, var1, Caption.pP, 144, this.f() + 52, 0, -1, -16777216);
         vdtt_dd.b(vdtt_dd.d, var1, Caption.pQ, 144, this.f() + 68, 0, -1, -16777216);
         this.a(var1, this.O);

         for(int var2 = 0; var2 < this.O.i; ++var2) {
            for(int var3 = 0; var3 < this.O.O; ++var3) {
               if (this.O.b(var2)) {
                  b(var1, var3 * this.O.h, var2 * this.O.h, this.N[var2 * this.O.O + var3], var2 * this.O.O + var3 == this.O.k);
               }
            }
         }

         this.a(var1);
         this.a(var1, this.cx + 4, this.cy + this.f());
      }

   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         this.O.a();
      } else {
         this.B();
      }

      DataCenter.gI();
      if (!DataCenter.b() && this.H.b.lastElement().equals(this)) {
         if (GameSrc.gI().idTask == 1 && GameSrc.gI().idStep == 1) {
            this.g(378);
            return;
         }

         if (GameSrc.gI().idTask == 2 && GameSrc.gI().idStep == 1) {
            this.g(194);
            return;
         }

         if (GameSrc.gI().idTask == 3 && GameSrc.gI().idStep == 4) {
            this.g(379);
            return;
         }

         if (GameSrc.gI().idTask == 6 && GameSrc.gI().idStep == 3) {
            this.g(201);
            return;
         }

         boolean var1;
         int var2;
         int var3;
         if (GameSrc.gI().idTask == 7 && GameSrc.gI().idStep == 3) {
            var1 = true;
            var1 = true;
            if (super.a.b != 0) {
               if (this.k == null) {
                  int[] var4;
                  if (Char.gI().f(207) > 0) {
                     if ((var4 = Char.gI().d(207)) != null) {
                        var2 = this.cx + var4[0] + 15;
                        DataCenter.gI().pointHelper.a(var2, this.cy + 25 + var4[1] + 15);
                     }
                  } else if (Char.gI().f(208) > 0) {
                     if ((var4 = Char.gI().d(208)) != null) {
                        var2 = this.cx + var4[0] + 15;
                        DataCenter.gI().pointHelper.a(var2, this.cy + 25 + var4[1] + 15);
                     }
                  } else {
                     var2 = this.cx + 70;
                     DataCenter.gI().pointHelper.a(var2, this.cy + 10);
                  }

                  DataCenter.gI().pointHelper.b = true;
               }

               return;
            }

            if (this.h(207) > 0) {
               var2 = this.cx + this.width / 2;
               var3 = this.cy + this.height;
               DataCenter.gI().pointHelper.a(var2, var3 - 20);
            } else {
               var2 = this.cx + 160;
               DataCenter.gI().pointHelper.a(var2, this.cy + 10);
            }

            DataCenter.gI().pointHelper.b = true;
         } else {
            if (GameSrc.gI().idTask == 10 && GameSrc.gI().idStep == 5) {
               this.g(381);
               return;
            }

            if (GameSrc.gI().idTask == 11 && GameSrc.gI().idStep == 5) {
               var1 = true;
               if (super.a.b == 0) {
                  if (this.h(382) == 0) {
                     var2 = this.cx + 40;
                     var3 = this.cy + this.height;
                     DataCenter.gI().pointHelper.a(var2, var3 - 35);
                  } else {
                     var2 = this.cx + this.width / 2;
                     var3 = this.cy + this.height;
                     DataCenter.gI().pointHelper.a(var2, var3 - 20);
                  }

                  DataCenter.gI().pointHelper.b = true;
                  return;
               }

               var2 = this.cx + 70;
               DataCenter.gI().pointHelper.a(var2, this.cy + 10);
               DataCenter.gI().pointHelper.b = true;
            }
         }
      }

   }

   private void g(int var1) {
      int var2;
      if (super.a.b == 0) {
         if (this.h(var1) > 0) {
            var2 = this.cx + this.width / 2;
            int var3 = this.cy + this.height;
            DataCenter.gI().pointHelper.a(var2, var3 - 20);
         } else {
            var2 = this.cx + 160;
            DataCenter.gI().pointHelper.a(var2, this.cy + 10);
         }

         DataCenter.gI().pointHelper.b = true;
      } else if (this.k == null) {
         if (Char.gI().f(var1) > 0) {
            int[] var4;
            if ((var4 = Char.gI().d(var1)) != null) {
               var2 = this.cx + var4[0] + 15;
               DataCenter.gI().pointHelper.a(var2, this.cy + 25 + var4[1] + 15);
            }
         } else {
            var2 = this.cx + 70;
            DataCenter.gI().pointHelper.a(var2, this.cy + 10);
         }

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
