package gro;

import java.util.Vector;

public final class vdtt_kr extends vdtt_jx {
   private vdtt_hq[] R;
   private vdtt_ay S;
   public int N = 0;
   public vdtt_hf O;
   public Item P;
   public boolean Q;

   public vdtt_kr(MainScreen var1) {
      super(var1, new String[]{Caption.rK, Caption.P});
      this.aa = new Item[1];
      this.R = new vdtt_hq[2];
      this.R[0] = new vdtt_hq((byte)1, 14, this.f() + 20, 30, 30, 30, 1, 1);
      this.R[1] = new vdtt_hq((byte)1, 104, this.f() + 20, 30, 30, 30, 1, 1);
      this.S = this.a(this.width - 70, this.height - 33, Caption.rQ, this, 300, -8);
      this.a(this.S, 0);
   }

   public final void a(Item[] var1) {
   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         if (this.aa[0] != null) {
            if (this.P == null) {
               this.P = this.aa[0].b();
               if (this.P.Z()) {
                  this.P.h = Utlis.a() + 604800000L;
               } else {
                  Item var1 = this.P;
                  var1.h += 604800000L;
               }
            }
         } else if (!this.Q) {
            this.P = null;
         }

         for(int var2 = 0; var2 < this.R.length; ++var2) {
            this.R[var2].a();
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

      if (this.N > 0) {
         --this.N;
      }

   }

   public final void b(Graphics var1) {
      if (this.w() <= 0) {
         this.a(var1, this.cx, this.cy, this.width, this.height, Caption.y, (byte)2, this.J);
      } else {
         super.b(var1);
      }

      if (super.a.b == 0) {
         vdtt_dd.b(vdtt_dd.d, var1, Caption.rL, 14, this.f() + 11, 0, -10831436, -16777216);
         if (!this.Q) {
            if (this.P != null) {
               if (this.P.getItemTemplate().type == 14) {
                  vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.qN, Utlis.c(10)), this.R[0].cx, this.R[0].cy + 60, 0, -30976, -16777216);
               } else if (this.P.getItemTemplate().type == 0) {
                  vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.pj, Utlis.c(20000)), this.R[0].cx, this.R[0].cy + 60, 0, -30976, -16777216);
               } else if (this.P.getItemTemplate().type == 2) {
                  vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.pj, Utlis.c(10000)), this.R[0].cx, this.R[0].cy + 60, 0, -30976, -16777216);
               }

               vdtt_dd.b(vdtt_dd.d, var1, Caption.rO, this.R[0].cx, this.R[0].cy + 75, 0, -1, -16777216);
            }
         } else if (this.N > 0 && DataCenter.gI().h % 12 > 6 || this.N == 0) {
            vdtt_dd.b(vdtt_dd.d, var1, Caption.rR, this.R[0].cx, this.R[0].cy + 50, 0, -2560, -16777216);
         }

         vdtt_cz.a(var1, 95, 0, 65 - DataCenter.gI().h / 3 % 3, this.f() + 25, 20);
         a(var1, this.R[0].cx, this.R[0].cy, this.aa[0], this.R[0].k >= 0, Caption.rM);
         a(var1, this.R[1].cx, this.R[1].cy, this.P, this.R[1].k >= 0, Caption.qt);
         if (this.O != null) {
            this.O.b(var1, this.R[1].cx + this.R[1].h / 2, this.R[1].cy + this.R[1].h / 2);
         }
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         for(int var2 = 0; var2 < this.R.length; ++var2) {
            var1.addElement(this.R[var2].a(1001 + var2, this));
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
            this.a(false);
            return;
         case 1001:
            this.ac = 1;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.aa[0]);
            if (this.aa[0] == null) {
               this.f(2);
               DataCenter.gI().currentScreen.c(Caption.rL, -1);
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
         }
      } catch (Exception var5) {
         Utlis.a(var5);
      }

   }

   private void a(vdtt_hp var1, int var2) {
      for(int var3 = 0; var3 < this.R.length; ++var3) {
         this.R[var3].k = -1;
      }

      var1.k = var2;
   }

   private void a(boolean var1) {
      try {
         if (this.Q) {
            this.N = 50;
         } else if (this.P == null) {
            DataCenter.gI().currentScreen.c(Caption.rL, -65536);
         } else {
            Message var2;
            (var2 = Message.c((byte)-40)).writeByte(this.aa[0].w);
            var2.writeShort(this.aa[0].index);
            var2.send();
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
