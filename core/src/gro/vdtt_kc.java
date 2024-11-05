package gro;

import java.util.Vector;

public final class vdtt_kc extends vdtt_ap {
   private int V;
   private int W;
   private vdtt_kd[] X = new vdtt_kd[]{new vdtt_kd(this, 0, 72), new vdtt_kd(this, 73, 144), new vdtt_kd(this, 145, 216), new vdtt_kd(this, 217, 288), new vdtt_kd(this, 289, 360)};
   public int a = 0;
   public int b = 50;
   public int c;
   public int d = 0;
   public int M = 0;
   public int N = 32;
   private boolean Y;
   private Item[] Z = new Item[8];
   private vdtt_hq[] aa = new vdtt_hq[2];
   private vdtt_ay ab;
   public int O;
   public int P;
   public int Q;
   public int R;
   public int S;
   public int T;
   public int U;

   public vdtt_kc(MainScreen var1) {
      this.e = 1;
      this.H = var1;
      this.J = false;
      this.a(250, 230);
      this.V = 84;
      this.W = this.f() + 75;
      this.ab = this.a(this.width / 2 - 30, this.height - 36, Caption.za[1], this, 1001, -8);
      this.aa[0] = new vdtt_hq((byte)1, 14, this.f() + 22, this.N, 4 * this.N, this.N, 4, 1);
      this.aa[1] = new vdtt_hq((byte)1, super.width - 8 - 7 - this.N, this.f() + 22, this.N, 4 * this.N, this.N, 4, 1);
      (new Message((byte)-10)).send();
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(this.aa[0].a(5001, this));
      var1.addElement(this.aa[1].a(5002, this));
      return var1;
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1001:
         if (this.R < 2) {
            this.Y = true;
            this.b = 50;
            this.a = 0;
            this.c = -1;
            this.M = Utlis.a(5, 50);
            this.aa[0].k = this.aa[1].k = -1;
         }

         return;
      case 5001:
         this.aa[1].k = -1;
         if (var1.j.k >= 0) {
            this.k = a(var1, this, this.Z[this.aa[0].k]);
            return;
         }
         break;
      case 5002:
         this.aa[0].k = -1;
         if (var1.j.k >= 0) {
            this.k = a(var1, this, this.Z[this.aa[1].k + 4]);
         }
      }

   }

   public final void a_() {
      if (this.Y) {
         this.ab.a(true);
         ++this.d;
         this.a += this.b;
         if (this.a >= 360) {
            this.a = 0;
         }

         if (this.d % 4 == 0 && this.c >= 0) {
            this.b -= 5;
            if (this.b < 5) {
               this.b = 5;
               vdtt_kd var1 = this.X[this.c];
               if (this.a - this.M >= var1.a && this.a <= var1.b) {
                  this.Y = false;
               }

               return;
            }
         }
      } else {
         this.P = this.S;
         this.Q = this.T;
         this.R = this.U;
         this.ab.a(false);
         String var4;
         if (this.R == 1) {
            var4 = Caption.eA;
            this.ab.l = var4;
         } else if (this.R == 0) {
            var4 = Caption.dh;
            this.ab.l = var4;
            if (this.O == 0) {
               this.ab.a(true);
            }
         } else if (this.R == 2) {
            var4 = Caption.eB;
            this.ab.l = var4;
         }

         Vector var2 = new Vector();
         if (this.Q > 0) {
            var2.add(new Item(164, true, this.Q));
         }

         if (this.Q > 1) {
            var2.add(new Item(364, true));
            var2.add(new Item(265, true));
            var2.add(new Item(4, true));
         }

         if (this.Q > 2) {
            var2.add(new Item(217, false));
         }

         if (this.Q > 3) {
            var2.add(new Item(218, false));
         }

         if (this.Q > 4) {
            var2.add(new Item(219, false));
         }

         if (this.Q > 5) {
            var2.add(new Item(7, false));
         }

         for(int var3 = 0; var3 < this.Z.length; ++var3) {
            if (var3 >= var2.size()) {
               this.Z[var3] = null;
            } else {
               this.Z[var3] = (Item)var2.elementAt(var3);
            }
         }
      }

   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.za[0], (byte)2);
      boolean var2 = true;
      var1.k = var2;
      vdtt_cz.a(var1, 306, this.a, 4 + (super.width - 8) / 2, this.f() + 85, 3);
      var2 = false;
      var1.k = var2;
      vdtt_cz.a(var1, 301, 0, 4 + (super.width - 8) / 2, this.f() + 88, 33);
      vdtt_dd.a(vdtt_dd.d, var1, Caption.eC + this.O, 15, this.height - 40, 0, -1);
      if (this.R > 0) {
         vdtt_dd.a(vdtt_dd.d, var1, Caption.eD + DataCenter.gI().dataNameClass[this.P].name, 15, this.height - 28, 0, -1);
         vdtt_dd.a(vdtt_dd.d, var1, Caption.eE + this.Q, 15, this.height - 16, 0, -1);
      }

      this.a(var1, this.aa[0]);

      int var3;
      for(var3 = 0; var3 < this.aa[0].i; ++var3) {
         b(var1, 2, 1 + var3 * this.aa[0].h, this.Z[var3], var3 == this.aa[0].k, Caption.F);
      }

      this.a(var1);
      this.a(var1, this.aa[1]);

      for(var3 = 0; var3 < this.aa[1].i; ++var3) {
         b(var1, 2, 1 + var3 * this.aa[1].h, this.Z[var3 + 4], var3 == this.aa[1].k, Caption.F);
      }

      this.a(var1);
      this.a(var1, this.cx + 4, this.cy + this.f());
   }
}
