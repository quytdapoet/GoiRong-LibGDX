package gro;

import java.util.Vector;

public final class vdtt_bp extends vdtt_al {
   private vdtt_hm l;
   private vdtt_hp m;
   private int n;
   private String[] H;
   private String[][] I;
   private int J = 8;

   public vdtt_bp(int var1, int var2, vdtt_w var3, vdtt_hm var4) {
      this.a = var3;
      this.l = var4;
      this.setXY(var1, var2);
      this.H = new String[var4.c.length];
      this.I = new String[var4.c.length][];

      for(var1 = 0; var1 < var4.c.length; ++var1) {
         String[] var5 = Utlis.a(var4.c[var1], ",");
         this.H[var1] = var5[0];
         if (var5.length > 1) {
            this.I[var1] = new String[var5.length - 1];

            for(int var6 = 1; var6 < var5.length; ++var6) {
               this.I[var1][var6 - 1] = var5[var6];
            }
         }
      }

      this.d();
   }

   private void d() {
      int var1;
      if ((var1 = this.H.length) > this.J) {
         var1 = this.J;
      }

      this.setSize(110, 10 + var1 * 18);

      for(int var2 = 0; var2 < this.H.length; ++var2) {
         int var3;
         if ((var3 = vdtt_dd.c(vdtt_dd.d, this.H[var2]) + 20) > this.width) {
            this.width = (short)var3;
         }
      }

      this.m = new vdtt_hp((byte)1, 5, 5, this.width - 10, var1 * 18, 18, this.H.length);
   }

   public final void b(Graphics var1) {
      int var2 = var1.e;
      int var3 = var1.f;
      this.c(var1);
      this.a(var1, this.m);

      for(int var4 = 0; var4 < this.m.i; ++var4) {
         if (this.m.k == var4) {
            vdtt_cz.a(var1, -1, var4 * this.m.h, this.m.width + 2, this.m.h);
            vdtt_dd.c(vdtt_dd.d, var1, this.H[var4], 5, 7 + var4 * this.m.h, 0, -279002, -16777216);
         } else if (this.m.l == var4) {
            vdtt_cz.a(var1, 0, var4 * this.m.h, this.m.width, this.m.h - 1);
            vdtt_dd.c(vdtt_dd.d, var1, this.H[var4], 6, 8 + var4 * this.m.h, 0, -6488, -16777216);
         } else {
            vdtt_dd.c(vdtt_dd.d, var1, this.H[var4], 5, 7 + var4 * this.m.h, 0, -6488, -16777216);
         }
      }

      this.a(var1);
      this.a(var1, var2, var3);
      this.m.a(var1, this, 0);
   }

   public final void a_() {
      this.m.a();
      if (this.n > 0) {
         if (this.n == 1) {
            this.a.b((vdtt_k)this);
            return;
         }

         --this.n;
      }

   }

   public final Vector g() {
      Vector var1;
      (var1 = new Vector()).addElement(this.m.a(this.l.a, this.a));
      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      if (var1.j.k >= 0) {
         if (this.l.e == -1 && this.I[var1.j.k] != null && this.I[var1.j.k].length > 0) {
            this.l.e = var1.j.k;
            this.H = this.I[var1.j.k];
            var1.j.k = -1;
            this.d();
            return;
         }

         if (this.l.e == -1) {
            var1.b = this.l.d[var1.j.k];
         } else {
            var1.b = this.l.d[this.l.e];
            this.l.e = var1.j.k;
         }

         this.a.b(var1.b, this.l, this.a);
         this.n = 4;
      }

   }
}
