package gro;

import java.util.Vector;

public final class vdtt_kj extends vdtt_jx {
   public Item[] N = new Item[3];
   private vdtt_hq[] R = new vdtt_hq[3];
   private vdtt_ay S;
   public int O;
   private int V;
   public boolean P;
   public vdtt_hf Q;

   public vdtt_kj(MainScreen var1) {
      super(var1, new String[]{Caption.bC, Caption.P});
      this.R[0] = new vdtt_hq((byte)1, 94, this.f() + 20, 30, 30, 30, 1, 1);
      this.R[1] = new vdtt_hq((byte)1, 174, this.f() + 20, 30, 30, 30, 1, 1);
      this.R[2] = new vdtt_hq((byte)1, 134, this.f() + 65, 30, 30, 30, 1, 1);
      this.S = this.a(this.width - 70, this.height - 33, Caption.bC, this, 0, -8);
      this.a(this.S, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].E()) {
            this.aj.add(var1[var2]);
         }
      }

   }

   public final void a_() {
      try {
         super.a_();
         if (super.a.b == 0) {
            for(int var1 = 0; var1 < this.R.length; ++var1) {
               this.R[var1].a();
            }
         } else {
            this.B();
         }

         if (this.Q != null) {
            this.Q.o();
            if (this.Q.p()) {
               this.Q = null;
            }
         }

         if (this.V > 0) {
            --this.V;
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
            vdtt_dd.b(vdtt_dd.d, var1, Caption.fu, 4 + (super.width - 8) / 2, this.f() + 11, 2, -10831436, -16777216);
            a(var1, this.R[0].cx, this.R[0].cy, this.N[0], this.R[0].k >= 0, Caption.bD);
            a(var1, this.R[1].cx, this.R[1].cy, this.N[1], this.R[1].k >= 0, Caption.bD);
            a(var1, this.R[2].cx, this.R[2].cy, this.N[2], this.R[2].k >= 0, Caption.bS);
            vdtt_cz.a(var1, 95, 0, 142 - DataCenter.gI().h / 3 % 3, this.f() + 25, 20);
            if (this.N[0] != null) {
               vdtt_dd.b(vdtt_dd.d, var1, "(" + this.N[0].ah() + ")", 108, this.f() + 60, 33, -1, -16777216);
            }

            if (this.N[1] != null) {
               vdtt_dd.b(vdtt_dd.d, var1, "(" + this.N[1].ah() + ")", 188, this.f() + 60, 33, -1, -16777216);
            }

            if (this.P && (this.V > 0 && DataCenter.gI().h % 12 > 6 || this.V == 0)) {
               vdtt_dd.c(vdtt_dd.d, var1, Utlis.b(Caption.fm, Caption.bC.toLowerCase()), this.width / 2, this.f() + 108, 2, -2560, -16777216);
            }

            if (this.Q != null) {
               this.Q.b(var1, this.R[1].cx + this.R[1].h / 2, this.R[1].cy + this.R[1].h / 2);
            }
         }
      } catch (Exception var3) {
         Utlis.a(var3);
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
         case 0:
            this.a(true);
            return;
         case 1001:
            this.O = 1;
            this.a(var1.j, var1.j.k);
            if (this.N[0] == null) {
               this.k = b(Caption.fq, this, var1.j.cx + 32, var1.j.cy, 100);
               return;
            }

            this.k = a(var1, this, this.N[0]);
            return;
         case 1002:
            this.O = 2;
            this.a(var1.j, var1.j.k);
            if (this.N[1] == null) {
               this.k = b(Caption.fr, this, var1.j.cx + 32, var1.j.cy, 100);
               return;
            }

            this.k = a(var1, this, this.N[1]);
            return;
         case 1003:
            this.O = 3;
            this.a(var1.j, var1.j.k);
            if (this.N[2] == null) {
               this.k = b(Caption.fs, this, var1.j.cx + 32, var1.j.cy, 100);
               return;
            }

            this.k = a(var1, this, this.N[2]);
            return;
         case 2001:
            this.a(false);
         }
      }

   }

   private void a(vdtt_hp var1, int var2) {
      for(int var3 = 0; var3 < this.R.length; ++var3) {
         this.R[var3].k = -1;
      }

      var1.k = var2;
   }

   public final void f(int var1) {
      super.f(var1);
      if (this.P) {
         this.P = false;

         for(var1 = 0; var1 < this.N.length; ++var1) {
            this.N[var1] = null;
         }
      }

   }

   public final void d() {
      super.d();

      for(int var1 = 0; var1 < this.N.length; ++var1) {
         if (this.N[var1] != null) {
            Char.gI().i(this.N[var1].w)[this.N[var1].index] = this.N[var1];
            this.N[var1] = null;
         }
      }

   }

   private void a(boolean var1) {
      try {
         if (this.P) {
            this.V = 50;
         } else if (this.N[0] != null && this.N[1] != null && this.N[2] != null) {
            if (this.N[0].getItemTemplate().type != this.N[1].getItemTemplate().type) {
               DataCenter.gI().currentScreen.c(Caption.fv, -65536);
            } else if (this.N[0].level > 14 && this.N[2].id != 158) {
               DataCenter.gI().currentScreen.c(Caption.fx, -65536);
            } else if (this.N[0].level > 10 && this.N[2].id != 158 && this.N[2].id != 157) {
               DataCenter.gI().currentScreen.c(Caption.fy, -65536);
            } else {
               Message var2;
               (var2 = Message.c((byte)18)).writeByte(this.N[0].w);
               var2.writeShort(this.N[0].index);
               var2.writeByte(this.N[1].w);
               var2.writeShort(this.N[1].index);
               var2.writeShort(this.N[2].index);
               var2.send();
            }
         } else {
            DataCenter.gI().currentScreen.c(Caption.fu, -65536);
         }
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }
}
