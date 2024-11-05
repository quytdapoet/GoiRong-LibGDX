package gro;

import java.util.Vector;

public final class vdtt_mz extends vdtt_jx {
   private vdtt_hq[] P;
   private vdtt_ay Q;
   private int R = 50000;
   public int N = 0;
   public vdtt_hf O;
   private String S = "";

   public vdtt_mz(MainScreen var1) {
      super(var1, new String[]{Caption.rd, Caption.P});
      this.aa = new Item[16];
      this.ab = new Item[2];
      this.P = new vdtt_hq[4];
      this.P[0] = new vdtt_hq((byte)1, 162, this.f() + 20, 30, 30, 30, 1, 1);
      this.P[1] = new vdtt_hq((byte)1, 242, this.f() + 20, 30, 30, 30, 1, 1);
      this.P[2] = new vdtt_hq((byte)1, 202, this.f() + 65, 30, 30, 30, 1, 1);
      this.P[3] = new vdtt_hq((byte)1, 14, this.f() + 20, 128, 128, 32, 4, 4);
      this.Q = this.a(this.width - 70, this.height - 33, Caption.bG, this, 0, -8);
      this.a(this.Q, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].F()) {
            this.aj.add(var1[var2]);
         }
      }

   }

   public final void a_() {
      try {
         super.a_();
         if (super.a.b != 0) {
            this.B();
         } else {
            int var1 = 0;

            while(true) {
               if (var1 >= this.P.length) {
                  if (this.ab[0] != null && this.ab[0].F()) {
                     if (this.ab[1] != null && this.S.equals(this.ab[0].strData)) {
                        break;
                     }

                     this.S = this.ab[0].strData;
                     this.ab[1] = this.ab[0].a();
                     this.ab[1].isLock = true;
                     if ((var1 = this.ab[1].level + 1) > 16) {
                        var1 = 16;
                     }

                     this.ab[1].a(var1);
                     break;
                  }

                  if (this.N == 0) {
                     this.ab[1] = null;
                  }
                  break;
               }

               this.P[var1].a();
               ++var1;
            }
         }

         if (this.O != null) {
            this.O.o();
            if (this.O.p()) {
               this.O = null;
            }
         }
      } catch (Exception var2) {
         Utlis.a(var2);
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
            vdtt_dd.b(vdtt_dd.d, var1, Caption.re, 14, this.f() + 11, 0, -10831436, -16777216);
            a(var1, this.P[0].cx, this.P[0].cy, this.ab[0], this.P[0].k >= 0, Caption.pI);
            a(var1, this.P[1].cx, this.P[1].cy, this.ab[1], this.P[1].k >= 0, Caption.Q);
            vdtt_cz.a(var1, 95, 0, 210 - DataCenter.gI().h / 3 % 3, this.f() + 25, 20);
            if (this.ab[1] != null) {
               vdtt_dd.b(vdtt_dd.d, var1, "(" + this.ab[1].ah() + ")", 256, this.f() + 60, 33, -1, -16777216);
            }

            if (this.N == 1) {
               if (DataCenter.gI().h % 20 > 12) {
                  vdtt_dd.c(vdtt_dd.d, var1, Caption.kX, 149, this.f() + 108, 0, -2560, -16777216);
               }
            } else if (this.N == 2) {
               if (DataCenter.gI().h % 20 > 12) {
                  vdtt_dd.c(vdtt_dd.d, var1, Caption.rj, 149, this.f() + 108, 0, -1, -16777216);
               }
            } else if (this.ab[0] != null) {
               vdtt_dd.b(vdtt_dd.d, var1, "(" + this.ab[0].ah() + ")", 176, this.f() + 60, 33, -1, -16777216);
               if (this.ab[0].F()) {
                  vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.pj, Utlis.c(this.ab[1].level * this.R)), 147, this.f() + 95, 0, -1, -16777216);
                  vdtt_dd.b(vdtt_dd.d, var1, Caption.qV, 147, this.f() + 110, 0, -1, -16777216);
                  vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.rh, "" + (64 - this.ab[0].level * 2)), 147, this.f() + 125, 0, -1, -16777216);
                  vdtt_dd.b(vdtt_dd.d, var1, Caption.ri, 147, this.f() + 140, 0, -6488, -16777216);
               } else {
                  vdtt_dd.c(vdtt_dd.d, var1, Caption.rg, 149, this.f() + 108, 0, -2560, -16777216);
               }
            }

            this.a(var1, this.P[3]);

            for(int var2 = 0; var2 < this.P[3].i; ++var2) {
               for(int var3 = 0; var3 < this.P[3].O; ++var3) {
                  b(var1, var3 * this.P[3].h, var2 * this.P[3].h, this.aa[var2 * this.P[3].O + var3], var2 * this.P[3].i + var3 == this.P[3].k, "");
               }
            }

            this.a(var1);
            if (this.O != null) {
               this.O.b(var1, this.P[1].cx + this.P[1].h / 2, this.P[1].cy + this.P[1].h / 2);
            }
         }
      } catch (Exception var4) {
         Utlis.a(var4);
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         for(int var2 = 0; var2 < this.P.length; ++var2) {
            var1.addElement(this.P[var2].a(1001 + var2, this));
         }
      }

      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      if (super.a.b == this.w() && var1.b == 0) {
         super.d();
      }

      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         switch(var1.b) {
         case 0:
            this.a(false);
            return;
         case 1001:
            this.ac = 1;
            this.a(var1.j, var1.j.k);
            if (this.ab[0] == null) {
               this.f(2);
               DataCenter.gI().currentScreen.c(Caption.rf, -1);
               return;
            }

            this.k = a(var1, this, this.ab[0]);
            return;
         case 1002:
            this.ac = 10;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.ab[1]);
            return;
         case 1004:
            try {
               this.ac = 2;
               this.a(var1.j, var1.j.k);
               this.k = a(var1, this, this.aa[var1.j.k]);
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
      for(int var3 = 0; var3 < this.P.length; ++var3) {
         this.P[var3].k = -1;
      }

      var1.k = var2;
   }

   public final void f(int var1) {
      super.f(var1);
      this.N = 0;
   }

   public final void d() {
      super.d();
   }

   private void a(boolean var1) {
      try {
         int var2 = 0;

         for(int var3 = 0; var3 < this.aa.length; ++var3) {
            if (this.aa[var3] != null) {
               ++var2;
            }
         }

         if (this.ab[0] != null && var2 != 0) {
            Message var5;
            (var5 = Message.c((byte)-44)).writeByte(this.ab[0].w);
            var5.writeShort(this.ab[0].index);
            var5.writeByte(var2);

            for(var2 = 0; var2 < this.aa.length; ++var2) {
               if (this.aa[var2] != null) {
                  var5.writeShort(this.aa[var2].index);
               }
            }

            var5.send();
         } else {
            DataCenter.gI().currentScreen.c(Caption.re, -65536);
         }
      } catch (Exception var4) {
         Utlis.a(var4);
      }

   }
}
