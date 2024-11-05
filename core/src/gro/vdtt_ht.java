package gro;

public final class vdtt_ht extends vdtt_hp {
   private int T;
   private int U;
   private int V;
   private int W;
   private int X;
   public int M;
   public int N;
   public int O;
   public int P;
   public int Q = -1;
   public int R = -1;
   public int S = -1;

   public vdtt_ht(byte var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
      this.a(0, var6, var7);
   }

   public final void a(int var1, int var2, int var3) {
      this.g = var1;
      if (this.n == 1) {
         this.g(0, 0);
         this.h(1, var3);
      } else if (this.n == 0) {
         this.g(1, var2);
         this.h(0, 0);
      } else if (this.n == 2) {
         this.g(1, var2);
         this.h(1, var3);
      }

   }

   public final void a() {
      try {
         super.a();
         if (this.P < this.W / this.N) {
            this.P = this.W / this.N;
         }

         if (this.P > this.X / this.N) {
            this.P = this.X / this.N;
         }

         this.V = this.P * this.N;
         if (this.V < this.W) {
            this.V = this.W;
         }

         if (this.V > this.X) {
            this.V = this.X;
         }

         if (this.M != this.V) {
            this.T = this.V - this.M << 2;
            this.U += this.T;
            this.M += this.U >> 4;
            this.U &= 15;
         }
      } catch (Exception var2) {
      }

   }

   public final void a(int var1, int var2) {
      this.k = this.Q = -1;
      this.e();
      this.m = this.j;
      this.S = this.P;
      if (this.h != 0) {
         this.l = (this.f + var1) / this.h;
      }

      if (this.N != 0) {
         this.R = (this.U + var2) / this.N;
      }

   }

   public final void b(int var1, int var2) {
      if (this.h != 0) {
         this.j = this.m - var1 / this.h;
      }

      if (this.N != 0) {
         this.P = this.S - var2 / this.N;
      }

   }

   public final void c(int var1, int var2) {
      this.e();
      if (!Utlis.a(0, 0, this.width, this.height, var1, var2)) {
         this.k = this.l = -1;
         this.Q = this.R = -1;
      } else if (this.m == this.j && this.S == this.P) {
         if (this.h != 0 && this.l < this.i && this.l == (this.f + var1) / this.h || this.N != 0 && this.R < this.O && this.R == (this.M + var2) / this.N) {
            this.k = this.l;
            this.Q = this.R;
         }
      } else {
         this.k = this.Q = -1;
      }

      if (this.k >= 0 && this.Q >= 0) {
         vdtt_aa.gI().n();
      }

   }

   public final boolean c() {
      if (this.m == this.j && this.S == this.P) {
         this.m = this.l = -1;
         this.S = this.R = -1;
         return false;
      } else {
         this.m = this.l = -1;
         this.S = this.R = -1;
         return true;
      }
   }

   public final void e() {
      try {
         super.e();
         if (this.P < 0) {
            this.P = 0;
         }

         if (this.P > this.X / this.N - 1) {
            this.P = this.X / this.N - 1;
         }
      } catch (Exception var2) {
      }

   }

   private void h(int var1, int var2) {
      this.N = var1;
      this.O = var2;
      if (this.height < var2 * var1) {
         this.W = -(var1 * this.g);
         this.X = var2 * var1 - this.height;
         if (this.X % var1 != 0) {
            this.X = this.X / var1 * var1 + var1;
         }

         this.X += var1 * this.g;
      } else {
         this.W = 0;
         this.X = var2 * var1 - this.height;
      }

      if (this.X < 0) {
         this.X = 0;
      }

   }

   public final void a(Graphics var1, int var2, int var3, int var4, int var5) {
      super.a(var1, var2, var3, var4, var5);
      if (this.n == 2) {
         var1.a(-this.f, -this.M);
      }

   }
}
