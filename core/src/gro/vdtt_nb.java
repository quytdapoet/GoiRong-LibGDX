package gro;

import java.util.Vector;

public final class vdtt_nb extends vdtt_jx {
   public Item[] N = new Item[2];
   public Item[] O = new Item[6];
   private vdtt_hq[] V = new vdtt_hq[2];
   private vdtt_bs[] W = new vdtt_bs[2];
   private vdtt_ay X;
   private vdtt_ay Y;
   public int P;
   private vdtt_hl Z;
   public int Q = 0;
   public vdtt_hf R;
   public vdtt_bd S;

   public vdtt_nb(MainScreen var1) {
      super(var1, new String[]{Caption.qM, Caption.P});
      this.V[0] = new vdtt_hq((byte)1, 124, this.f() + 20, 30, 30, 30, 1, 1);
      this.V[1] = new vdtt_hq((byte)1, 14, this.f() + 20, 64, 96, 32, 3, 2);
      this.X = this.a(this.width - 70, this.height - 33, Caption.bG, this, 0, -8);
      this.a(this.X, 0);
      this.Y = this.a(139, this.height - 33, Caption.lh, this, 2002, -8);
      this.a(this.Y, 0);
      vdtt_hm var2 = new vdtt_hm(2000, Caption.Ak);
      this.S = this.a(14, this.height - 32, 120, var2.c.length, var2, this, 1);
      this.S.a(0);
      this.a(this.S, 0);
      this.Z = new vdtt_hl(0);
      this.W[0] = this.a(89, this.f() + 77, "", this, this.Z);
      this.W[1] = this.a(89, this.f() + 97, "", this, this.Z);
      vdtt_bs var3 = this.W[0];
      boolean var4 = true;
      var3.d = var4;
      var3 = this.W[1];
      var4 = true;
      var3.d = var4;
      this.a(this.W[0], 0);
      this.a(this.W[1], 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].G()) {
            this.aj.add(var1[var2]);
         }
      }

   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         int var1 = 0;

         int var2;
         for(var2 = 0; var2 < this.O.length; ++var2) {
            if (this.O[var2] != null) {
               var1 += this.O[var2].M();
            }
         }

         vdtt_bs var3;
         boolean var4;
         if (this.N[0] != null) {
            ItemOption[] var5 = this.N[0].L();

            for(int var6 = 0; var6 < this.W.length; ++var6) {
               var3 = this.W[var6];
               var4 = false;
               var3.d = var4;
               if (this.W[var6].l) {
                  this.W[var6].a(var5[var6].b(var1));
               } else {
                  this.W[var6].a(var5[var6].b(0));
               }
            }
         } else {
            for(var2 = 0; var2 < this.W.length; ++var2) {
               var3 = this.W[var2];
               var4 = true;
               var3.d = var4;
            }
         }

         for(var2 = 0; var2 < this.V.length; ++var2) {
            this.V[var2].a();
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

   public final void b(Graphics var1) {
      if (this.w() <= 0) {
         this.a(var1, this.cx, this.cy, this.width, this.height, Caption.y, (byte)2, this.J);
      } else {
         super.b(var1);
      }

      if (super.a.b == 0) {
         vdtt_dd.b(vdtt_dd.d, var1, Caption.bx, 14, this.f() + 11, 0, -10831436, -16777216);
         if (this.N[0] != null) {
            vdtt_dd.b(vdtt_dd.d, var1, Caption.by, 89, this.f() + 65, 0, -10831436, -16777216);
         }

         a(var1, this.V[0].cx, this.V[0].cy, this.N[0], this.V[0].k >= 0, Caption.bd);
         vdtt_cz.a(var1, 95, 0, 92 - DataCenter.gI().h / 3 % 3, this.f() + 25, 20);
         if (this.Q > 0 && this.Q % 14 > 2) {
            vdtt_dd.b(vdtt_dd.d, var1, Caption.kX, 89, this.f() + 125, 0, -2560, -16777216);
         }

         this.a(var1, this.V[1]);
         int var2 = 0;

         for(int var3 = 0; var3 < this.V[1].i; ++var3) {
            for(int var4 = 0; var4 < this.V[1].O; ++var4) {
               b(var1, var4 * this.V[1].h, var3 * this.V[1].h, this.O[var3 * this.V[1].O + var4], var2 == this.V[1].k, "");
               ++var2;
            }
         }

         this.a(var1);
         if (this.R != null) {
            this.R.b(var1, this.V[0].cx + this.V[0].h / 2, this.V[0].cy + this.V[0].h / 2);
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
            vdtt_nb var4 = this;

            try {
               var2 = 0;

               for(var3 = 0; var3 < var4.O.length; ++var3) {
                  if (var4.O[var3] != null) {
                     ++var2;
                  }
               }

               if (var4.N[0] != null && var2 != 0) {
                  ItemOption var9;
                  if ((var9 = var4.N[0].L()[var4.Z.b]).option[1] >= var9.f()) {
                     DataCenter.gI().currentScreen.c(Caption.kZ, -2560);
                  } else {
                     Message var6;
                     (var6 = new Message((byte)106)).writeByte(var4.Z.b);
                     var6.writeByte(var4.N[0].w);
                     var6.writeShort(var4.N[0].index);
                     var6.writeByte(var2);

                     for(var2 = 0; var2 < var4.O.length; ++var2) {
                        if (var4.O[var2] != null) {
                           var6.writeShort(var4.O[var2].index);
                        }
                     }

                     var6.send();
                  }
               } else {
                  DataCenter.gI().currentScreen.c(Caption.kY, -65536);
               }
               break;
            } catch (Exception var8) {
               Utlis.a(var8);
               return;
            }
         case 1001:
            this.P = 1;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.N[0]);
            if (this.N[0] == null) {
               this.f(2);
               DataCenter.gI().currentScreen.c(Caption.nT, -1);
               return;
            }
            break;
         case 1002:
            try {
               this.P = 2;
               this.a(var1.j, var1.j.k);
               this.k = a(var1, this, this.O[var1.j.k]);
               return;
            } catch (Exception var7) {
               return;
            }
         case 2002:
            boolean var5 = this.S.n.b == 0;

            for(var2 = 0; var2 < Char.gI().arrItemBag.length; ++var2) {
               if (Char.gI().arrItemBag[var2] != null && Char.gI().arrItemBag[var2].id == 160 && Char.gI().arrItemBag[var2].isLock == var5) {
                  for(var3 = 0; var3 < this.O.length; ++var3) {
                     if (this.O[var3] == null) {
                        this.O[var3] = Char.gI().arrItemBag[var2];
                        Char.gI().arrItemBag[var2] = null;
                        break;
                     }
                  }
               }
            }
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
