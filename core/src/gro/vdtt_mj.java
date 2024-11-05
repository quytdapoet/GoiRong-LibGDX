package gro;

import java.util.Vector;

public final class vdtt_mj extends vdtt_jx {
   public Item[] N = new Item[2];
   public Item[] O = new Item[16];
   private vdtt_hq[] S = new vdtt_hq[3];
   private vdtt_ay V;
   private int W;
   public int P;
   public boolean Q;
   public vdtt_hf R;

   public vdtt_mj(MainScreen var1) {
      super(var1, new String[]{Caption.xw, Caption.P});
      this.S[0] = new vdtt_hq((byte)1, 162, this.f() + 20, 30, 30, 30, 1, 1);
      this.S[1] = new vdtt_hq((byte)1, 242, this.f() + 20, 30, 30, 30, 1, 1);
      this.S[2] = new vdtt_hq((byte)1, 14, this.f() + 20, 128, 128, 32, 4, 4);
      this.V = this.a(this.width - 70, this.height - 33, Caption.B, this, 0, -8);
      this.a(this.V, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].B()) {
            this.aj.add(var1[var2]);
         }
      }

   }

   public final void f(int var1) {
      super.f(var1);
      if (this.Q) {
         this.Q = false;
         this.O[1] = null;
      }

   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         int var1;
         if (!this.Q) {
            for(var1 = 0; var1 < this.O.length; ++var1) {
               this.O[var1] = null;
            }

            if (this.N[0] == null) {
               this.N[1] = null;
            } else {
               this.N[1] = this.N[0].a();
               this.N[1].a(0);
               long var2 = 0L;
               int var4 = 0;
               int var5;
               if (this.N[0].j()) {
                  for(var5 = this.N[0].level; var5 > 0; --var5) {
                     var4 += DataCenter.gI().ao[var5];
                     var2 += DataCenter.gI().at[var5];
                  }
               } else if (this.N[0].k()) {
                  for(var5 = this.N[0].level; var5 > 0; --var5) {
                     var4 += DataCenter.gI().ap[var5];
                     var2 += DataCenter.gI().au[var5];
                  }
               } else if (this.N[0].l()) {
                  for(var5 = this.N[0].level; var5 > 0; --var5) {
                     var4 += DataCenter.gI().aq[var5];
                     var2 += DataCenter.gI().av[var5];
                  }
               }

               ItemOption[] var6;
               if ((var6 = this.N[1].L()) != null) {
                  for(int var7 = 0; var7 < var6.length; ++var7) {
                     if (var6[var7].l()) {
                        this.N[1].isLock = true;
                        break;
                     }
                  }
               }

               var2 /= 3L;
               Vector var9 = new Vector();

               for(var5 = DataCenter.gI().as.length - 1; var5 >= 0 && var2 > 0L; --var5) {
                  if (var2 >= DataCenter.gI().as[var5]) {
                     var2 -= DataCenter.gI().as[var5];
                     Item var8;
                     (var8 = new Item()).id = var5;
                     var8.h = -1L;
                     var8.isLock = true;
                     var9.add(var8);
                     var5 = DataCenter.gI().as.length;
                     if (var9.size() >= 16) {
                        break;
                     }
                  }
               }

               for(var5 = 0; var5 < var9.size() && var5 < this.O.length; ++var5) {
                  this.O[var5] = (Item)var9.elementAt(var5);
               }

               this.W = var4 / 3;
            }
         }

         for(var1 = 0; var1 < this.S.length; ++var1) {
            this.S[var1].a();
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

   }

   public final void b(Graphics var1) {
      if (this.w() <= 0) {
         this.a(var1, this.cx, this.cy, this.width, this.height, Caption.y, (byte)2, this.J);
      } else {
         super.b(var1);
      }

      if (super.a.b == 0) {
         vdtt_dd.b(vdtt_dd.d, var1, Caption.bz, 14, this.f() + 11, 0, -10831436, -16777216);
         a(var1, this.S[0].cx, this.S[0].cy, this.N[0], this.S[0].k >= 0, Caption.bD);
         a(var1, this.S[1].cx, this.S[1].cy, this.N[1], this.S[1].k >= 0, Caption.Q);
         vdtt_cz.a(var1, 95, 0, 210 - DataCenter.gI().h / 3 % 3, this.f() + 25, 20);
         vdtt_dd.b(vdtt_dd.d, var1, Caption.yV[0], 14, this.f() + 156, 0, -16711681, -16777216);
         vdtt_dd.b(vdtt_dd.d, var1, Caption.yV[1], 14, this.f() + 170, 0, -16711681, -16777216);
         if (this.N[0] != null) {
            vdtt_dd.b(vdtt_dd.d, var1, Caption.bB + " " + Utlis.c(this.W), 149, this.f() + 108, 0, -1, -16777216);
         }

         this.a(var1, this.S[2]);

         for(int var2 = 0; var2 < this.S[2].i; ++var2) {
            for(int var3 = 0; var3 < this.S[2].O; ++var3) {
               b(var1, var3 * this.S[2].h, var2 * this.S[2].h, this.O[var2 * this.S[2].O + var3], var2 * this.S[2].i + var3 == this.S[2].k, "");
            }
         }

         this.a(var1);
         if (this.R != null) {
            this.R.b(var1, this.S[1].cx + this.S[1].h / 2, this.S[1].cy + this.S[1].h / 2);
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
         case 0:
            this.a(true);
            return;
         case 1001:
            this.P = 1;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.N[0]);
            if (this.N[0] == null) {
               this.f(2);
               DataCenter.gI().currentScreen.c(Caption.nU, -1);
               return;
            }
            break;
         case 1002:
            this.P = 0;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.N[1]);
            return;
         case 1003:
            try {
               this.P = 0;
               this.a(var1.j, var1.j.k);
               this.k = a(var1, this, this.O[var1.j.k]);
               return;
            } catch (Exception var5) {
               return;
            }
         case 2001:
            this.a(false);
         }
      }

   }

   private void a(vdtt_hp var1, int var2) {
      for(int var3 = 0; var3 < this.S.length; ++var3) {
         this.S[var3].k = -1;
      }

      var1.k = var2;
   }

   public final void d() {
      super.d();
      if (this.N[0] != null) {
         Char.gI().i(this.N[0].w)[this.N[0].index] = this.N[0];
         this.N[0] = null;
      }

   }

   private void a(boolean var1) {
      try {
         if (this.Q) {
            DataCenter.gI().currentScreen.c(Caption.jJ, -1);
         } else if (this.N[0] == null) {
            DataCenter.gI().currentScreen.c(Caption.jK, -65536);
         } else if (var1) {
            DataCenter.gI().currentScreen.a(Caption.jL, 2001, this);
         } else {
            Message var2;
            (var2 = new Message((byte)105)).writeByte(this.N[0].w);
            var2.writeShort(this.N[0].index);
            var2.send();
         }
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }
}
