package gro;

public class vdtt_hp extends EntityPanel {
   public int a;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;
   public int g;
   public int h;
   public int i;
   public int j;
   public int k = -1;
   public int l = -1;
   public int m = -1;
   public byte n;
   public boolean o;
   public boolean p;
   public int H = 1;
   private int M;
   private int N;
   public int I = 1343692834;
   private long O;
   public int J;
   public int K;
   public int L;

   public vdtt_hp(byte var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.n = var1;
      this.setXY(var2, var3);
      this.setSize(var4, var5);
      this.a(1, var6, var7);
      this.L = var5 - 20;
   }

   public vdtt_hp(byte var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      this.n = 1;
      this.setXY(0, 2);
      this.setSize(110, 33);
      this.a(1, 11, 0);
      this.s = true;
      this.L = 27;
   }

   public void a(int var1, int var2, int var3) {
      this.g = var1;
      if (this.n == 1) {
         this.h = var2;
         this.i = var3;
         if (this.height < var3 * var2) {
            this.d = -(var2 * this.g);
            this.e = var3 * var2 - this.height;
            if (this.e % var2 != 0) {
               this.e = this.e / var2 * var2 + var2;
            }

            this.e += var2 * this.g;
         } else {
            this.d = 0;
            this.e = var3 * var2 - this.height;
         }

         if (this.e < 0) {
            this.e = 0;
         }
      } else if (this.n == 0) {
         this.g(var2, var3);
      }

   }

   public void a() {
      try {
         if (this.h == 0) {
            this.h = 1;
         }

         if (this.j < this.d / this.h) {
            this.j = this.d / this.h;
         }

         if (this.j > this.e / this.h) {
            this.j = this.e / this.h;
         }

         this.c = this.j * this.h;
         if (this.c < this.d) {
            this.c = this.d;
         }

         if (this.c > this.e) {
            this.c = this.e;
         }

         if (this.f != this.c) {
            this.a = this.c - this.f << 2;
            this.b += this.a;
            this.f += this.b >> 4;
            this.b &= 15;
            this.O = System.currentTimeMillis();
         }
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }

   public void a(int var1, int var2) {
      this.k = -1;
      this.e();
      this.m = this.j;
      if (this.n == 1 && this.h != 0) {
         this.l = (this.f + var2) / this.h;
      } else if (this.n == 0 && this.h != 0) {
         this.l = (this.f + var1) / this.h;
      }

   }

   public void b(int var1, int var2) {
      this.p = true;
      if (this.h > 30) {
         int var3;
         if ((var3 = this.h) > 55) {
            var3 = 55;
         }

         int var4;
         if ((var4 = 30 - (var3 - 30) / 2) <= 0) {
            var4 = 1;
         }

         var1 = var1 * var3 / var4;
         var2 = var2 * var3 / var4;
      }

      if (this.n == 1 && this.h != 0) {
         this.j = this.m - var2 / this.h;
      } else if (this.n == 0 && this.h != 0) {
         this.j = this.m - var1 / this.h;
      }

   }

   public void c(int var1, int var2) {
      this.p = false;
      this.e();
      if (this.m != this.j) {
         this.k = -1;
      } else if (this.n == 1 && this.h != 0 && this.l < this.i && this.l == (this.f + var2) / this.h || this.n == 0 && this.h != 0 && this.l < this.i && this.l == (this.f + var1) / this.h) {
         this.k = this.l;
      }

      this.b();
   }

   protected final void b() {
      if (this.k >= 0) {
         switch(this.H) {
         case -2:
            vdtt_aa.gI().o();
            return;
         case -1:
            vdtt_aa.gI().y();
            return;
         case 0:
         default:
            break;
         case 1:
            vdtt_aa.gI().n();
         }
      }

   }

   public boolean c() {
      if (this.m != this.j) {
         this.m = this.l = -1;
         return true;
      } else {
         this.m = this.l = -1;
         return false;
      }
   }

   public final void d() {
      this.e();
      this.k = -1;
      this.l = -1;
   }

   public final void a(int var1) {
      try {
         this.j = var1;
         this.e();
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }

   public void e() {
      try {
         if (this.j < 0) {
            this.j = 0;
         }

         if (this.j > this.e / this.h - 1) {
            this.j = this.e / this.h - 1;
         }
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }

   public final void g(int var1, int var2) {
      this.h = var1;
      this.i = var2;
      if (this.width < var2 * var1) {
         this.d = -(var1 * this.g);
         this.e = var2 * var1 - this.width;
         if (this.e % var1 != 0) {
            this.e = this.e / var1 * var1 + var1;
         }

         this.e += var1 * this.g;
      } else {
         this.d = 0;
         this.e = var2 * var1 - this.width;
      }

      if (this.e < 0) {
         this.e = 0;
      }

   }

   public void a(Graphics var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2 + this.cx, var3 + this.cy);
      var1.d(0, 0, var4, var5);
      if (this.n == 1) {
         var1.a(0, -this.f);
      } else if (this.n == 0) {
         var1.a(-this.f, 0);
      }

   }

   public final void b(Graphics var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2 + this.cx, var3 + this.cy);
   }

   public final vdtt_hi a(int var1, vdtt_x var2) {
      return new vdtt_hi(var1, this.cx, this.cy, this.cx + this.width, this.cy + this.height, this, var2);
   }

   public final vdtt_hi a(int var1, vdtt_x var2, Object var3) {
      return new vdtt_hi(var1, this.cx, this.cy, this.cx + this.width, this.cy + this.height, this, var2, var3);
   }

   public final vdtt_hi a(int var1, int var2, int var3, vdtt_x var4) {
      return new vdtt_hi(var1, this.cx + var2, this.cy + var3, this.cx + var2 + this.width, this.cy + var3 + this.height, this, var4);
   }

   public final boolean b(int var1) {
      int var2;
      if (this.n == 1) {
         var2 = this.height / this.h;
      } else {
         var2 = this.width / this.h;
      }

      return -1 + this.j <= var1 && var1 <= 1 + this.j + var2;
   }

   public final boolean c(int var1) {
      return this.f - this.h <= var1 && var1 <= this.f + this.h + this.height;
   }

   public final void a(Graphics var1) {
      if (this.n == 1 && this.i * this.h > this.height) {
         float var2;
         if ((var2 = (float)this.f / (float)(this.e - this.h)) < 0.0F) {
            var2 = 0.0F;
         }

         if (var2 > 1.0F - (float)this.h / (float)this.L) {
            var2 = 1.0F - (float)this.h / (float)this.L;
         }

         int var3;
         if ((var3 = (int)(var2 * (float)this.L)) < 0) {
            var3 = 0;
         }

         int var4;
         if ((var4 = (int)(100.0F - (float)(System.currentTimeMillis() - this.O) / 1000.0F * 100.0F)) < 30) {
            var4 = 30;
         }

         var1.d(var4);
         var1.f(this.I);
         var1.c(this.cx + this.width + 10 + this.M, this.cy + 20 + this.N, 2, this.L);
         var1.m = 1.0F;
         var1.f(16418833);
         var1.c(this.cx + this.width + 10 + this.M, this.cy + var3 + 20 + this.N, 2, this.h);
      }

   }

   public final void a(Graphics var1, vdtt_ak var2) {
      int var3 = var1.e;
      int var4 = var1.f;
      short var5 = var2.cx;
      short var6 = var2.cy;
      var2.a(var1, 0, 0);
      if (this.k >= 0) {
         vdtt_cz.a(var1, var5 + 7, var6 + this.k * this.h + this.cy - this.f, var2.width - 14, this.h);
      }

      this.b(var1, var2);
      this.a(var1, var3, var4);
   }

   public final void b(Graphics var1, vdtt_ak var2) {
      int var3 = var1.e;
      int var4 = var1.f;
      if (this.n == 1 && this.i * this.h > this.height) {
         short var5 = var2.cx;
         short var6 = var2.cy;
         var2.a(var1, 0, 0);
         float var7;
         if ((var7 = (float)this.f / (float)(this.e - this.h)) < 0.0F) {
            var7 = 0.0F;
         }

         if (var7 > 1.0F - (float)this.h / (float)this.L) {
            var7 = 1.0F - (float)this.h / (float)this.L;
         }

         int var8;
         if ((var8 = (int)(var7 * (float)this.L)) < 0) {
            var8 = 0;
         }

         int var9;
         if ((var9 = (int)(100.0F - (float)(System.currentTimeMillis() - this.O) / 1000.0F * 100.0F)) < 30) {
            var9 = 30;
         }

         var1.d(var9);
         var1.f(this.I);
         var1.c(var5 + var2.width - 5, var6 + this.cy + this.f() + this.N, 2, this.L);
         var1.f(16418833);
         var1.m = 1.0F;
         var1.c(var5 + var2.width - 5, var6 + this.cy + var8 + this.f() + this.N, 2, this.h);
         this.a(var1, var3, var4);
      }

   }

   private int f() {
      return this.s ? 3 : 10;
   }

   public final void a(Graphics var1, EntityPanel var2, int var3) {
      this.a(var1, var2, var3, true);
   }

   public final void a(Graphics var1, EntityPanel var2, int var3, boolean var4) {
      if (var2 instanceof vdtt_k && ((vdtt_k)var2).a instanceof vdtt_ap) {
         this.M = ((vdtt_k)var2).a.cx;
         this.N = ((vdtt_k)var2).a.cy;
      }

      if (this.n == 1 && this.i * this.h > this.height) {
         int var5 = var1.e;
         int var6 = var1.f;
         short var7 = var2.cx;
         short var8 = var2.cy;
         var2.a(var1, 0, 0);
         float var9;
         if ((var9 = (float)this.f / (float)(this.e - this.h)) < 0.0F) {
            var9 = 0.0F;
         }

         if (var9 > 1.0F - (float)this.h / (float)this.L) {
            var9 = 1.0F - (float)this.h / (float)this.L;
         }

         int var10;
         if ((var10 = (int)(var9 * (float)this.L)) < 0) {
            var10 = 0;
         }

         int var11;
         if ((var11 = (int)(100.0F - (float)(System.currentTimeMillis() - this.O) / 1000.0F * 100.0F)) < 30) {
            var11 = 30;
         }

         this.J = this.cx + this.width - 5 + var3 + this.M;
         this.K = this.cy + this.f() + this.N;
         if (var4) {
            var1.d(var11);
            var1.f(this.I);
            var1.c(var7 + this.cx + this.width - 5 + var3 + this.M, var8 + this.cy + this.f() + this.N, 2, this.L);
            var1.m = 1.0F;
         }

         var1.f(16418833);
         var1.c(var7 + this.cx + this.width - 5 + var3 + this.M, var8 + this.cy + var10 + this.f() + this.N, 2, this.h);
         this.a(var1, var5, var6);
      }

   }

   public final void a(Graphics var1, int var2, int var3, int var4) {
      this.M = var2;
      this.N = var3;
      this.I = var4;
      this.a(var1);
   }
}
