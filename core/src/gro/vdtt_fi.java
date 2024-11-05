package gro;

public final class vdtt_fi extends vdtt_es {
   private int L = 0;
   private int M;
   private float N;
   private vdtt_fj[] O;
   private int P = 100;
   private int Q = 20;
   public boolean J;
   public int K;

   public vdtt_fi() {
      super(0, DataCenter.gI().n / 2, DataCenter.gI().o / 2);
      DataCenter.gI();
      DataCenter.gI();
      this.O = new vdtt_fj[7];
      this.P = 100;
      short var1 = 663;
      boolean var2 = false;

      int var3;
      for(var3 = 0; var3 < GameSrc.gI().av.size(); ++var3) {
         vdtt_hf var4;
         if ((var4 = (vdtt_hf)GameSrc.gI().av.get(var3)).k == 449) {
            var1 = 573;
            break;
         }

         if (var4.k == 450) {
            var1 = 235;
            break;
         }

         if (var4.k == 478) {
            var2 = true;
            var1 = 277;
            break;
         }

         if (var4.k == 479) {
            var1 = 1007;
            break;
         }
      }

      for(var3 = 0; var3 < GameSrc.gI().au.size(); ++var3) {
         vdtt_es var6;
         if ((var6 = (vdtt_es)GameSrc.gI().au.get(var3)).k == 591) {
            var1 = 573;
            break;
         }

         if (var6.k == 592) {
            var1 = 235;
            break;
         }

         if (var6.k == 619) {
            var2 = true;
            var1 = 277;
            break;
         }

         if (var6.k == 621) {
            var1 = 1007;
            break;
         }
      }

      if (var2) {
         this.O = new vdtt_fj[2];
      }

      for(var3 = 0; var3 < this.O.length; ++var3) {
         this.O[var3] = new vdtt_fj(this, (double)var3 * (360.0D / (double)this.O.length));
         this.O[var3].a(Utlis.a(this.cx - 70, this.cx + 70), Utlis.a(this.cy - 70, this.cy + 70));
         vdtt_fj var7 = this.O[var3];
         int var5 = var1 + var3;
         var7.h = var5;
      }

   }

   public final int minX() {
      return this.cx;
   }

   public final int maxX() {
      return this.cx;
   }

   public final int minY() {
      return this.cy;
   }

   public final int maxY() {
      return this.cy;
   }

   public final boolean q() {
      return this.M == 4;
   }

   public final void n() {
      this.N = (float)this.L * 2.0F / 30.0F;
      vdtt_fj var1;
      boolean var2;
      int var3;
      boolean var4;
      int var5;
      byte var6;
      switch(this.M) {
      case 0:
         var2 = true;

         for(var3 = 0; var3 < this.O.length; ++var3) {
            this.O[var3].b();
            if (!this.O[var3].a()) {
               var2 = false;
            }
         }

         if (var2) {
            this.M = 1;
            this.L = 0;
         }

         return;
      case 1:
         for(var5 = 0; var5 < this.O.length; ++var5) {
            this.O[var5].b();
            var1 = this.O[var5];
            var4 = this.L % 5 > 2;
            var1.g = var4;
            this.O[var5].b((int)this.O[var5].a + Utlis.a(-3, 3), (int)this.O[var5].b + Utlis.a(-3, 3));
         }

         this.L += 2;
         if (this.L >= 40) {
            var2 = true;

            for(var3 = 0; var3 < this.O.length; ++var3) {
               this.O[var3].b();
               var1 = this.O[var3];
               var4 = false;
               var1.g = var4;
               vdtt_fj var8;
               (var8 = this.O[var3]).c = (double)var8.i.cx + (double)var8.i.P * Math.cos(var8.e);
               var8.d = (double)var8.i.cy + (double)var8.i.P * Math.sin(var8.e);
               var8.f = 0;
               if (!this.O[var3].a()) {
                  var2 = false;
               }
            }

            if (var2) {
               this.M = 2;
               this.L = 0;
            }

            return;
         }
         break;
      case 2:
         for(var5 = 0; var5 < this.O.length; ++var5) {
            this.O[var5].b();
            var1 = this.O[var5];
            var6 = 2;
            var1.f = var6;
         }

         if (this.P > 50) {
            this.P -= 4;
         }

         if (this.P <= 50) {
            this.L += 2;
         }

         if (this.L > 40) {
            if (this.P > 0) {
               this.P -= 2;
               return;
            }

            this.L = 0;
            this.M = 3;
            return;
         }
         break;
      case 3:
         if (this.L < 30) {
            this.L += 2;

            for(var5 = 0; var5 < this.O.length; ++var5) {
               var1 = this.O[var5];
               var4 = this.L % 5 > 2;
               var1.g = var4;
            }

            return;
         }

         if (this.J) {
            var2 = true;

            for(var3 = 0; var3 < this.O.length; ++var3) {
               var1 = this.O[var3];
               var4 = false;
               var1.g = var4;
               if (this.O[var3].f == 2) {
                  var1 = this.O[var3];
                  var6 = 0;
                  var1.f = var6;
                  switch(var3) {
                  case 0:
                     this.O[var3].a(-this.Q, -this.Q);
                     break;
                  case 1:
                     this.O[var3].a(DataCenter.gI().n + this.Q, DataCenter.gI().o + this.Q);
                     break;
                  case 2:
                     this.O[var3].a(DataCenter.gI().n + this.Q, -this.Q);
                     break;
                  case 3:
                     this.O[var3].a(-this.Q, DataCenter.gI().o / 2);
                     break;
                  case 4:
                     this.O[var3].a(this.Q, DataCenter.gI().o + this.Q);
                     break;
                  case 5:
                     this.O[var3].a(DataCenter.gI().n / 2, -this.Q);
                     break;
                  case 6:
                     this.O[var3].a(DataCenter.gI().n / 2, DataCenter.gI().o + this.Q);
                  }
               }

               this.O[var3].b();
               short var7;
               if (this.K != 2 && this.K != 4) {
                  var1 = this.O[var3];
                  var7 = 662;
                  var1.h = var7;
               } else {
                  var1 = this.O[var3];
                  var7 = 969;
                  var1.h = var7;
               }

               if (this.O[var3].f != 1) {
                  var2 = false;
               }
            }

            if (var2) {
               this.M = 4;
            }
         }
      }

   }

   public final boolean m() {
      return this.M == 3 && this.L >= 30 && !this.J;
   }

   public final void paintTop(Graphics var1) {
      for(int var2 = 0; var2 < this.O.length; ++var2) {
         vdtt_fj var3;
         if (!(var3 = this.O[var2]).i.m()) {
            int var4 = var1.e;
            int var5 = var1.f;
            int var6 = var1.k();
            int var7 = var1.l();
            int var8 = var1.h;
            int var9 = var1.i;
            var1.o();
            var1.d(0, 0, DataCenter.gI().n, DataCenter.gI().o);
            if (var3.g) {
               var1.a(1.2F, 0.5F);
            }

            vdtt_cz.a(var1, var3.h, 0, (int)var3.a, (int)var3.b, 3);
            if (var3.g) {
               var1.r();
            }

            var3.i.a(var1, var4, var5);
            var1.d(var6, var7, var8, var9);
         }
      }

   }

   static int a(vdtt_fi var0) {
      return var0.Q;
   }

   static int b(vdtt_fi var0) {
      return var0.P;
   }
}
