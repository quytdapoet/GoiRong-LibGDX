package gro;

import java.util.Vector;

public final class vdtt_nd extends vdtt_jo {
   public Item N;
   public Item[] O = new Item[20];
   private vdtt_hq[] S = new vdtt_hq[2];
   private vdtt_ay T;
   private vdtt_ay U;
   private long V = 0L;
   private int W = 0;
   private int X = 0;
   private vdtt_bs[] Y = new vdtt_bs[2];
   private vdtt_hl Z;
   public int[] P = new int[2];
   public vdtt_hf Q;
   public vdtt_bd R;

   public vdtt_nd(MainScreen var1) {
      super(var1, new String[]{Caption.yT[0]});
      this.S[0] = new vdtt_hq((byte)1, 193, this.f() + 19, 30, 30, 30, 1, 1);
      this.S[1] = new vdtt_hq((byte)1, 14, this.f() + 19, 128, 160, 32, 5, 4);
      this.T = this.a(this.width - 70, this.height - 33, Caption.bF, this, 0, -8);
      this.a(this.T, 0);
      this.U = this.a(109, this.height - 33, Caption.lh, this, 2002, -8);
      this.a(this.U, 0);
      vdtt_hm var2;
      int var3 = (var2 = new vdtt_hm(2000, Caption.zB)).c.length;
      this.R = this.a(14, this.height - 32, 90, var3, var2, this, 1);
      this.R.a(mConfig.gI().b(7));
      this.a(this.R, 0);
      this.Z = new vdtt_hl(0, 1);
      this.Y[0] = this.a(149, this.f() + 58, Caption.bP, this, this.Z);
      this.Y[1] = this.a(149, this.f() + 78, Caption.bQ, this, this.Z);
      this.a(this.Y[0], 0);
      this.a(this.Y[1], 0);
      if (SettingsTab.P) {
         SettingsTab.P = false;
         this.C();
      }

   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].p()) {
            this.aj.add(var1[var2]);
         }
      }

   }

   private void C() {
      if (this.N != null) {
         this.i(this.N.index);
      }

      this.N = null;
      int var1 = this.R.n.b;
      int var2 = 0;
      boolean var3 = this.Z.b != 0;

      for(int var4 = 0; var4 < Char.gI().arrItemBag.length && var2 < this.O.length; ++var4) {
         if (Char.gI().arrItemBag[var4] != null && Char.gI().arrItemBag[var4].isLock == var3 && Char.gI().arrItemBag[var4].p() && Char.gI().arrItemBag[var4].getItemTemplate().id <= var1) {
            this.b(Char.gI().arrItemBag[var4]);
            ++var2;
         }
      }

      this.a_();
   }

   private void b(Item var1) {
      try {
         for(int var2 = 0; var2 < this.O.length; ++var2) {
            if (this.O[var2] == null) {
               this.O[var2] = var1;
               break;
            }
         }

         Char.gI().arrItemBag[var1.index] = null;
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }

   public final void f(int var1) {
      super.f(var1);
      if (var1 == 1) {
         if (this.N != null) {
            this.i(this.N.index);
         }

         this.N = null;
      }

   }

   public final void a_() {
      try {
         super.a_();
         int var1;
         if (super.a.b != 0) {
            this.B();
         } else {
            this.W = this.X = 0;
            this.V = 0L;

            for(var1 = 0; var1 < this.O.length; ++var1) {
               if (this.O[var1] != null) {
                  ++this.X;
                  Item var2 = this.O[var1];
                  this.V += DataCenter.gI().as[var2.id];
               }
            }

            if (this.V > 0L) {
               for(this.W = DataCenter.gI().as.length - 1; this.W >= 0 && this.V <= DataCenter.gI().as[this.W]; --this.W) {
               }
            }

            for(var1 = 0; var1 < this.S.length; ++var1) {
               this.S[var1].a();
            }
         }

         if (this.Q != null) {
            this.Q.o();
            if (this.Q.p()) {
               this.Q = null;
            }
         }

         for(var1 = 0; var1 < this.P.length; ++var1) {
            if (this.P[var1] > 0) {
               int var10003 = this.P[var1]--;
            }
         }
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }

   public final void b(Graphics var1) {
      try {
         if (this.w() <= 0) {
            this.a(var1, this.cx, this.cy, this.width, this.height, Caption.y, (byte)2, this.J);
         } else {
            super.b(var1);
         }

         if (super.a.b == 0) {
            if (this.P[1] == 0 || this.P[1] % 12 > 5) {
               vdtt_dd.b(vdtt_dd.d, var1, Caption.bE, 14, this.f() + 11, 0, -10831436, -16777216);
            }

            b(var1, this.S[0].cx, this.S[0].cy, this.N, this.S[0].k >= 0, Caption.Q);
            vdtt_cz.a(var1, 95, 0, 158 - DataCenter.gI().h / 3 % 3, this.f() + 25, 20);
            if (this.V > 0L && this.X > 1) {
               if (this.W + 1 >= DataCenter.gI().as.length) {
                  if (this.P[0] == 0 || this.P[0] % 10 > 5) {
                     vdtt_dd.b(vdtt_dd.d, var1, Caption.bM, 149, this.f() + 108, 0, -6488, -16777216);
                  }
               } else {
                  vdtt_dd.b(vdtt_dd.d, var1, Caption.bK + " " + (this.W + 2), 149, this.f() + 108, 0, -1, -16777216);
                  vdtt_dd.b(vdtt_dd.d, var1, Caption.bt + " " + this.V * 100L / DataCenter.gI().as[this.W + 1] + "%", 149, this.f() + 124, 0, -1, -16777216);
                  if (this.Z.b == 0) {
                     vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.pj, Utlis.c(DataCenter.gI().an[this.W + 1] / 3)), 149, this.f() + 140, 0, -1, -16777216);
                  } else {
                     vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.bv, Utlis.c(DataCenter.gI().an[this.W + 1])), 149, this.f() + 140, 0, -1, -16777216);
                  }
               }
            }

            this.a(var1, this.S[1]);
            int var2 = 0;

            for(int var3 = 0; var3 < this.S[1].i; ++var3) {
               for(int var4 = 0; var4 < this.S[1].O; ++var4) {
                  b(var1, var4 * this.S[1].h, var3 * this.S[1].h, this.O[var3 * this.S[1].O + var4], var2 == this.S[1].k, "");
                  ++var2;
               }
            }

            this.a(var1);
            if (this.Q != null) {
               this.Q.b(var1, this.S[0].cx + this.S[0].h / 2, this.S[0].cy + this.S[0].h / 2);
            }
         }
      } catch (Exception var5) {
         Utlis.a(var5);
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

   public final void b(int var1, Object var2, vdtt_x var3) {
      if (var1 == 2000) {
         mConfig.gI().a(7, this.R.n.b);
      }

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
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.N);
            if (this.N == null) {
               this.f(1);
               DataCenter.gI().currentScreen.c(Caption.nR, -1);
               return;
            }
            break;
         case 1002:
            try {
               this.a(var1.j, var1.j.k);
               this.k = a(var1, this, this.O[var1.j.k]);
               return;
            } catch (Exception var5) {
               return;
            }
         case 2001:
            this.a(false);
            return;
         case 2002:
            this.C();
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

      for(int var1 = 0; var1 < this.O.length; ++var1) {
         if (this.O[var1] != null) {
            int var2 = this.O[var1].index;
            Char.gI().arrItemBag[var2] = this.O[var1];
            this.O[var1] = null;
         }
      }

   }

   private void a(boolean var1) {
      try {
         if (this.X < 2) {
            this.P[1] = 50;
         } else if (this.W + 1 >= DataCenter.gI().as.length) {
            this.P[0] = 50;
         } else {
            boolean var2 = false;
            int var3;
            if (this.Z.b == 0) {
               for(var3 = 0; var3 < this.O.length; ++var3) {
                  if (this.O[var3] != null && this.O[var3].isLock) {
                     var2 = true;
                     break;
                  }
               }
            } else {
               for(var3 = 0; var3 < this.O.length; ++var3) {
                  if (this.O[var3] != null && !this.O[var3].isLock) {
                     var2 = true;
                     break;
                  }
               }
            }

            if (var1 && var2) {
               DataCenter.gI().currentScreen.a(Caption.bO, 2001, this);
            } else {
               Message var4;
               (var4 = new Message((byte)108)).writeBoolean(this.Z.b != 0);
               int var5 = 0;

               int var6;
               for(var6 = 0; var6 < this.O.length; ++var6) {
                  if (this.O[var6] != null) {
                     ++var5;
                  }
               }

               var4.writeByte(var5);

               for(var6 = 0; var6 < this.O.length; ++var6) {
                  if (this.O[var6] != null) {
                     var4.writeShort(this.O[var6].index);
                  }
               }

               var4.send();
            }
         }
      } catch (Exception var7) {
         Utlis.a(var7);
      }

   }
}
