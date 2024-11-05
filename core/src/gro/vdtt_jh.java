package gro;

import java.util.Vector;

public final class vdtt_jh extends vdtt_jx {
   public Item N;
   private vdtt_hq[] V;
   private vdtt_ay W;
   public int O = 0;
   public int P = 0;
   public int Q;
   public vdtt_hf R;
   public boolean S;

   public vdtt_jh(MainScreen var1) {
      super(var1, new String[]{Caption.fn, Caption.P});
      this.aa = new Item[2];
      this.V = new vdtt_hq[2];
      this.V[0] = new vdtt_hq((byte)1, 124, this.f() + 20, 30, 30, 30, 1, 1);
      this.V[1] = new vdtt_hq((byte)1, 14, this.f() + 20, 64, 32, 32, 1, 2);
      this.W = this.a(this.width - 70, this.height - 33, Caption.la, this, 0, -8);
      this.a(this.W, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].o()) {
            this.aj.add(var1[var2]);
         }
      }

   }

   public final void f(int var1) {
      super.f(var1);
      if (this.S) {
         this.S = false;
         this.N = null;
      }

   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         this.O = 0;
         this.P = 0;
         if (this.aa[0] != null) {
            this.N = this.aa[0].b();
            ItemOption[] var1 = this.N.L();
            Vector var2 = new Vector();
            int var3 = 0;

            for(int var4 = 0; var4 < var1.length; ++var4) {
               if (var1[var4].option[0] >= 53 && var1[var4].option[0] <= 62) {
                  var3 = var1[var4].f() + 200;
                  var1[var4].e(var3);
               }

               var2.add(var1[var4]);
            }

            switch(var3) {
            case 400:
               this.O = 150;
               this.P = 100000;
               var2.add(new ItemOption(this.N.g + 48 - 1 + ",4,4"));
               break;
            case 600:
               this.O = 300;
               this.P = 200000;
               var2.add(new ItemOption("286,10,10"));
               break;
            case 800:
               this.O = 450;
               this.P = 300000;
               var2.add(new ItemOption("29,1000,1000"));
               break;
            case 1000:
               this.O = 600;
               this.P = 400000;
               var2.add(new ItemOption("274,120,120"));
               break;
            case 1200:
               this.O = 750;
               this.P = 600000;
               var2.add(new ItemOption("287,180,180"));
               break;
            case 1400:
               this.O = 900;
               this.P = 800000;
               var2.add(new ItemOption("40,100,100"));
               break;
            case 1600:
               this.O = 1050;
               this.P = 1000000;
               var2.add(new ItemOption("47,30,30"));
            }

            this.N.strData = Item.a(var2);
         } else if (!this.S) {
            this.N = null;
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
         vdtt_dd.b(vdtt_dd.d, var1, Caption.rU, 14, this.f() + 11, 0, -10831436, -16777216);
         a(var1, this.V[0].cx, this.V[0].cy, this.N, this.V[0].k >= 0, Caption.ap);
         vdtt_cz.a(var1, 95, 0, 92 - DataCenter.gI().h / 3 % 3, this.f() + 25, 20);
         if (!this.S) {
            if (this.N != null) {
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.pj, Utlis.c(this.P)), 14, this.f() + 65, 0, -1, -16777216);
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.fp, Utlis.c(this.O)), 14, this.f() + 80, 0, -1, -16777216);
            }
         } else if (this.Q > 0 && DataCenter.gI().h % 12 > 6 || this.Q == 0) {
            vdtt_dd.b(vdtt_dd.d, var1, Caption.lc, 14, this.f() + 80, 0, -2560, -16777216);
         }

         vdtt_dd.b(vdtt_dd.d, var1, Caption.rT, 14, this.f() + 95, 0, -16742145, -16777216);
         vdtt_dd.b(vdtt_dd.d, var1, Caption.AA[0], 14, this.f() + 110, 0, -16742145, -16777216);
         vdtt_dd.b(vdtt_dd.d, var1, Caption.AA[1], 14, this.f() + 125, 0, -16742145, -16777216);
         this.a(var1, this.V[1]);

         for(int var2 = 0; var2 < this.V[1].i; ++var2) {
            for(int var3 = 0; var3 < this.V[1].O; ++var3) {
               if (var3 % 2 == 0) {
                  b(var1, var3 * this.V[1].h, var2 * this.V[1].h, this.aa[var2 * this.V[1].O + var3], var2 * this.V[1].i + var3 == this.V[1].k, Caption.bd);
               } else {
                  b(var1, var3 * this.V[1].h, var2 * this.V[1].h, this.aa[var2 * this.V[1].O + var3], var2 * this.V[1].i + var3 == this.V[1].k, Caption.fo);
               }
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
         super.d();
      }

      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         switch(var1.b) {
         case 0:
            this.a(true);
            return;
         case 1001:
            this.ac = 0;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.N);
            return;
         case 1002:
            this.ac = 1;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.aa[var1.j.k]);
            return;
         case 2001:
            this.a(false);
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
   }

   private void a(boolean var1) {
      try {
         if (this.S) {
            this.Q = 50;
         } else {
            int var2 = 0;

            for(int var3 = 0; var3 < this.aa.length; ++var3) {
               if (this.aa[var3] != null) {
                  ++var2;
               }
            }

            if (var2 < 2) {
               DataCenter.gI().currentScreen.c(Caption.rU, -65536);
            } else if (var1) {
               DataCenter.gI().currentScreen.a(Caption.lg, 2001, this);
            } else {
               Message var6;
               (var6 = Message.c((byte)-39)).writeByte(var2);

               for(int var4 = 0; var4 < this.aa.length; ++var4) {
                  if (this.aa[var4] != null) {
                     var6.writeByte(this.aa[var4].w);
                     var6.writeShort(this.aa[var4].index);
                  }
               }

               var6.send();
            }
         }
      } catch (Exception var5) {
      }

   }
}
