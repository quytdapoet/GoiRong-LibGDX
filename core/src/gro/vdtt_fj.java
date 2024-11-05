package gro;

final class vdtt_fj {
   double a;
   double b;
   double c;
   double d;
   private double j;
   private double k;
   double e;
   private double l;
   private double m;
   int f;
   boolean g;
   int h;
   final vdtt_fi i;

   public vdtt_fj(vdtt_fi var1, double var2) {
      this.i = var1;
      this.l = 2.0D;
      this.e = var2;
      this.m = var2 / 360.0D;
      if (Utlis.b()) {
         this.b(Utlis.a(DataCenter.gI().n), Utlis.b() ? -vdtt_fi.a(var1) : DataCenter.gI().o + vdtt_fi.a(var1));
      } else {
         this.b(Utlis.b() ? -vdtt_fi.a(var1) : DataCenter.gI().n + vdtt_fi.a(var1), Utlis.a(DataCenter.gI().o));
      }

   }

   public final void a(int var1, int var2) {
      this.c = (double)var1;
      this.d = (double)var2;
   }

   public final void b(int var1, int var2) {
      this.a = (double)var1;
      this.b = (double)var2;
      if (this.j == 0.0D) {
         this.j = (double)var1;
         this.k = (double)var2;
      }

   }

   public final boolean a() {
      if (Utlis.b((int)(this.c - this.a)) <= 0 && Utlis.b((int)(this.d - this.b)) <= 0) {
         this.f = 1;
      }

      return this.f == 0;
   }

   public final void b() {
      if (this.a()) {
         this.a += (this.c - this.a) / 3.0D;
         this.b += (this.d - this.b) / 3.0D;
      } else if (this.f == 2) {
         if (vdtt_fi.b(this.i) > 50) {
            this.l = 0.05000000074505806D;
         } else {
            this.l = 0.019999999552965164D;
         }

         this.a = (double)this.i.cx + (double)vdtt_fi.b(this.i) * Math.cos(this.e);
         this.b = (double)this.i.cy + (double)vdtt_fi.b(this.i) * Math.sin(this.e);
         this.m += this.l;
         if (this.m > 1.0D) {
            this.m = 0.0D;
         }

         this.e = this.m * 2.0D * 3.141592653589793D;
      }

   }
}
