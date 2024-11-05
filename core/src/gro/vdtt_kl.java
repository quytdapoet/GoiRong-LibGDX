package gro;

import java.util.Vector;

public final class vdtt_kl extends vdtt_jo {
   private vdtt_hq[] Q;
   private vdtt_ay R;
   public vdtt_hf N;
   public Item O;
   public int P = -1;

   public vdtt_kl(MainScreen var1) {
      super(var1, new String[]{Caption.yT[8]});
      this.aa = new Item[4];
      this.ab = new Item[4];
      this.Q = new vdtt_hq[5];
      this.Q[0] = new vdtt_hq((byte)1, 114, this.f() + 20, 30, 30, 30, 1, 1);
      this.Q[1] = new vdtt_hq((byte)1, 156, this.f() + 20, 30, 30, 30, 1, 1);
      this.Q[2] = new vdtt_hq((byte)1, 198, this.f() + 20, 30, 30, 30, 1, 1);
      this.Q[3] = new vdtt_hq((byte)1, 240, this.f() + 20, 30, 30, 30, 1, 1);
      this.Q[4] = new vdtt_hq((byte)0, 14, this.f() + 20, 64, 64, 32, 2, 2);
      this.R = this.a(this.width - 70, this.height - 33, Caption.bF, this, 0, -8);
      this.a(this.R, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].id == 683) {
            this.aj.add(var1[var2]);
         }
      }

   }

   public final void f(int var1) {
      super.f(var1);
      this.P = -1;
   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         for(int var1 = 0; var1 < this.Q.length; ++var1) {
            this.Q[var1].a();
         }
      } else {
         this.B();
      }

      if (this.N != null) {
         this.N.o();
         if (this.N.p()) {
            this.N = null;
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
         vdtt_dd.b(vdtt_dd.d, var1, Caption.ra, 14, this.f() + 11, 0, -10831436, -16777216);
         vdtt_cz.a(var1, 95, 0, 87 - DataCenter.gI().h / 3 % 3, this.f() + 25, 20);
         if (this.P >= 0) {
            if (DataCenter.gI().h % 20 > 12) {
               if (this.P == 0) {
                  vdtt_dd.b(vdtt_dd.d, var1, Caption.rc, this.Q[0].cx, this.f() + 90, 0, -6488, -16777216);
               } else {
                  vdtt_dd.b(vdtt_dd.d, var1, Caption.pl + " " + this.O.getItemTemplate().name, this.Q[0].cx, this.f() + 90, 0, -2560, -16777216);
               }
            }
         } else {
            vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.pj, Utlis.c(100000)), this.Q[0].cx, this.f() + 60, 0, -1, -16777216);
            vdtt_dd.b(vdtt_dd.d, var1, Caption.qV, this.Q[0].cx, this.f() + 75, 0, -1, -16777216);
            vdtt_dd.b(vdtt_dd.d, var1, Caption.fJ, this.Q[0].cx, this.f() + 90, 0, -16742145, -16777216);
         }

         int var2;
         for(var2 = 0; var2 < this.aa.length; ++var2) {
            if (this.P == var2) {
               a(var1, this.Q[var2].cx, this.Q[var2].cy, this.O, this.Q[var2].k >= 0, Caption.AZ[var2]);
            } else {
               a(var1, this.Q[var2].cx, this.Q[var2].cy, (Item)null, this.Q[var2].k >= 0, Caption.AZ[var2]);
            }
         }

         this.a(var1, this.Q[4]);

         for(var2 = 0; var2 < this.Q[4].i; ++var2) {
            for(int var3 = 0; var3 < this.Q[4].O; ++var3) {
               b(var1, var3 * this.Q[4].h, var2 * this.Q[4].h, this.aa[var2 * this.Q[4].O + var3], var2 * this.Q[4].i + var3 == this.Q[4].k, "");
            }
         }

         this.a(var1);
         if (this.N != null && this.P >= 0) {
            this.N.b(var1, this.Q[this.P].cx + this.Q[this.P].h / 2, this.Q[this.P].cy + this.Q[this.P].h / 2);
         }
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         for(int var2 = 0; var2 < this.Q.length; ++var2) {
            var1.addElement(this.Q[var2].a(1001 + var2, this));
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
            this.a(false);
            return;
         case 1001:
         case 1002:
         case 1003:
         case 1004:
            this.a(var1.j, var1.j.k);
            var2 = var1.b - 1001;
            this.ac = var2 + 10;
            if (this.P == var2 && this.O != null) {
               this.k = a(var1, this, this.O);
               return;
            }

            this.k = b(Caption.Ba[var2], this, this.Q[var2].cx, this.Q[var2].cy + 32, 250);
            return;
         case 1005:
            try {
               this.ac = 1;
               this.a(var1.j, var1.j.k);
               var2 = var1.j.k / 5;
               var3 = var1.j.k % 5;
               this.k = b(var1, this, this.aa[var2 * 4 + var3]);
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
      for(int var3 = 0; var3 < this.Q.length; ++var3) {
         this.Q[var3].k = -1;
      }

      var1.k = var2;
   }

   private void a(boolean var1) {
      try {
         Vector var2 = new Vector();

         for(int var3 = 0; var3 < this.aa.length; ++var3) {
            if (this.aa[var3] != null) {
               var2.add(this.aa[var3]);
            }
         }

         if (var2.size() == 0) {
            DataCenter.gI().currentScreen.c(Caption.ra, -65536);
         } else {
            Message var6;
            (var6 = Message.c((byte)-45)).writeByte(var2.size());

            for(int var4 = 0; var4 < var2.size(); ++var4) {
               var6.writeShort(((Item)var2.get(var4)).index);
            }

            var6.send();
         }
      } catch (Exception var5) {
         Utlis.a(var5);
      }

   }
}
