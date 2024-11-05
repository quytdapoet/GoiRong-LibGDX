package gro;

import java.util.Vector;

public final class vdtt_kk extends vdtt_jx {
   private vdtt_hq[] P;
   private vdtt_ay Q;
   private int R;
   public boolean N;
   public vdtt_hf O;

   public vdtt_kk(MainScreen var1) {
      super(var1, new String[]{Caption.rm, Caption.P});
      this.aa = new Item[3];
      this.P = new vdtt_hq[3];
      this.P[0] = new vdtt_hq((byte)1, 94, this.f() + 20, 30, 30, 30, 1, 1);
      this.P[1] = new vdtt_hq((byte)1, 174, this.f() + 20, 30, 30, 30, 1, 1);
      this.P[2] = new vdtt_hq((byte)1, 134, this.f() + 65, 30, 30, 30, 1, 1);
      this.Q = this.a(this.width - 70, this.height - 33, Caption.rm, this, 0, -8);
      this.a(this.Q, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].D()) {
            this.aj.add(var1[var2]);
         }
      }

   }

   public final void a_() {
      try {
         super.a_();
         if (super.a.b == 0) {
            for(int var1 = 0; var1 < this.P.length; ++var1) {
               this.P[var1].a();
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

         if (this.R > 0) {
            --this.R;
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
            vdtt_dd.b(vdtt_dd.d, var1, Caption.rl, 4 + (super.width - 8) / 2, this.f() + 11, 2, -10831436, -16777216);
            a(var1, this.P[0].cx, this.P[0].cy, this.aa[0], this.P[0].k >= 0, Caption.pI);
            a(var1, this.P[1].cx, this.P[1].cy, this.aa[1], this.P[1].k >= 0, Caption.pI);
            a(var1, this.P[2].cx, this.P[2].cy, this.aa[2], this.P[2].k >= 0, Caption.bS);
            vdtt_cz.a(var1, 95, 0, 142 - DataCenter.gI().h / 3 % 3, this.f() + 25, 20);
            if (this.aa[0] != null) {
               vdtt_dd.b(vdtt_dd.d, var1, "(" + this.aa[0].ah() + ")", 108, this.f() + 60, 33, -1, -16777216);
            }

            if (this.aa[1] != null) {
               vdtt_dd.b(vdtt_dd.d, var1, "(" + this.aa[1].ah() + ")", 188, this.f() + 60, 33, -1, -16777216);
            }

            if (this.N && (this.R > 0 && DataCenter.gI().h % 12 > 6 || this.R == 0)) {
               vdtt_dd.c(vdtt_dd.d, var1, Utlis.b(Caption.fm, Caption.rm.toLowerCase()), this.width / 2, this.f() + 108, 2, -2560, -16777216);
            }

            if (this.O != null) {
               this.O.b(var1, this.P[1].cx + this.P[1].h / 2, this.P[1].cy + this.P[1].h / 2);
            }
         }
      } catch (Exception var3) {
         Utlis.a(var3);
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
            this.a(true);
            return;
         case 1001:
            this.ac = 1;
            this.a(var1.j, var1.j.k);
            if (this.aa[0] == null) {
               this.k = b(Caption.rp, this, var1.j.cx + 32, var1.j.cy, 100);
               return;
            }

            this.k = a(var1, this, this.aa[0]);
            return;
         case 1002:
            this.ac = 2;
            this.a(var1.j, var1.j.k);
            if (this.aa[1] == null) {
               this.k = b(Caption.rq, this, var1.j.cx + 32, var1.j.cy, 100);
               return;
            }

            this.k = a(var1, this, this.aa[1]);
            return;
         case 1003:
            this.ac = 3;
            this.a(var1.j, var1.j.k);
            if (this.aa[2] == null) {
               this.k = b(Caption.ro, this, var1.j.cx + 32, var1.j.cy, 100);
               return;
            }

            this.k = a(var1, this, this.aa[2]);
            return;
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
      if (this.N) {
         this.N = false;

         for(var1 = 0; var1 < this.aa.length; ++var1) {
            this.aa[var1] = null;
         }
      }

   }

   public final void d() {
      super.d();
   }

   private void a(boolean var1) {
      try {
         if (this.N) {
            this.R = 50;
         } else if (this.aa[0] != null && this.aa[1] != null && this.aa[2] != null) {
            if (this.aa[0].getItemTemplate().type != this.aa[1].getItemTemplate().type) {
               DataCenter.gI().currentScreen.c(Caption.fv, -65536);
            } else if (var1) {
               DataCenter.gI().currentScreen.a(Caption.pI + " " + Utlis.b(Caption.fz, Caption.rm.toLowerCase()), 2001, this);
            } else {
               Message var2;
               (var2 = Message.c((byte)-43)).writeByte(this.aa[0].w);
               var2.writeShort(this.aa[0].index);
               var2.writeByte(this.aa[1].w);
               var2.writeShort(this.aa[1].index);
               var2.writeShort(this.aa[2].index);
               var2.send();
            }
         } else {
            DataCenter.gI().currentScreen.c(Caption.rl, -65536);
         }
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }
}
