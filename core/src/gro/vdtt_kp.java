package gro;

import java.util.Vector;

public final class vdtt_kp extends vdtt_jo {
   private vdtt_hq[] Q;
   private vdtt_ay R;
   public vdtt_hf N;
   public Item O;
   public int P = -1;

   public vdtt_kp(MainScreen var1) {
      super(var1, Caption.zM);
      this.aa = new Item[16];
      this.ab = new Item[1];
      this.Q = new vdtt_hq[2];
      this.Q[0] = new vdtt_hq((byte)1, 202, this.f() + 20, 30, 30, 30, 1, 1);
      this.Q[1] = new vdtt_hq((byte)0, 14, this.f() + 20, 128, 128, 32, 4, 4);
      this.R = this.a(this.width - 70, this.height - 33, Caption.bi, this, 0, -8);
      this.a(this.R, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].id == 310) {
            this.aj.add(var1[var2]);
         }
      }

   }

   public final void f(int var1) {
      super.f(var1);
      this.P = -1;
      this.O = null;
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
         vdtt_dd.b(vdtt_dd.d, var1, Caption.qW, 14, this.f() + 11, 0, -10831436, -16777216);
         vdtt_cz.a(var1, 95, 0, 164 - DataCenter.gI().h / 3 % 3, this.f() + 25, 20);
         if (this.P >= 0) {
            if (DataCenter.gI().h % 20 > 12) {
               vdtt_dd.b(vdtt_dd.d, var1, Caption.rk + " " + this.O.getItemTemplate().name, this.Q[0].cx - 50, this.f() + 90, 0, -2560, -16777216);
            }
         } else {
            vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.pj, Utlis.c(100000)), this.Q[0].cx - 40, this.f() + 60, 0, -1, -16777216);
            vdtt_dd.b(vdtt_dd.d, var1, Caption.fI, this.Q[0].cx - 40, this.f() + 75, 0, -1, -16777216);
         }

         a(var1, this.Q[0].cx, this.Q[0].cy, this.O, this.Q[0].k >= 0, Caption.Q);
         this.a(var1, this.Q[1]);

         for(int var2 = 0; var2 < this.Q[1].i; ++var2) {
            for(int var3 = 0; var3 < this.Q[1].O; ++var3) {
               b(var1, var3 * this.Q[1].h, var2 * this.Q[1].h, this.aa[var2 * this.Q[1].O + var3], var2 * this.Q[1].i + var3 == this.Q[1].k, "");
            }
         }

         this.a(var1);
         if (this.N != null) {
            this.N.b(var1, this.Q[0].cx + this.Q[0].h / 2, this.Q[0].cy + this.Q[0].h / 2);
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
            this.a(var1.j, var1.j.k);
            this.ac = 10;
            this.k = a(var1, this, this.O);
            return;
         case 1002:
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
            DataCenter.gI().currentScreen.c(Caption.qW, -65536);
         } else {
            Message var6;
            (var6 = Message.c((byte)-86)).writeByte(var2.size());

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
