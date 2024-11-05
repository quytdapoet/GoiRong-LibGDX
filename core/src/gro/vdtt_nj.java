package gro;

import java.util.Vector;

public final class vdtt_nj extends vdtt_ak {
   public int a;
   public int b;
   public long c;
   public static Message d;
   private vdtt_es M;
   private boolean N;

   public vdtt_nj(MainScreen var1) {
      var1.b((vdtt_k)var1.k);
      if (var1.c != null) {
         var1.c.b((vdtt_k)var1.c.k);
      }

      this.e = 4;
      this.H = var1;
      this.a(200, 20);
      this.setXY(this.cx, DataCenter.gI().o - 30);
      this.j();
      this.a = 0;
      this.c = Utlis.a();
      this.M = new vdtt_es(19, DataCenter.gI().n / 2, DataCenter.gI().o / 2, -1);
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      if (Utlis.a() - this.c > 2500L) {
         if (!this.N) {
            this.b += 8;
            if (this.b == 360) {
               this.N = true;
            }
         } else {
            this.b -= 16;
            if (this.b == 40) {
               this.N = false;
            }
         }

         var1.o();
         var1.d(70);
         var1.f(0);
         var1.c(0, 0, DataCenter.gI().n, DataCenter.gI().o);
         boolean var2 = true;
         var1.k = var2;
         vdtt_cz.a(var1, 459, this.b, DataCenter.gI().n / 2, DataCenter.gI().o / 2, 3);
         var2 = false;
         var1.k = var2;
         vdtt_dd.a(vdtt_dd.b, var1, Caption.jA, DataCenter.gI().n / 2, DataCenter.gI().o / 2, 2, -48128, 2, 1, 2, 1);
         var1.m = 1.0F;
      }

   }

   public final void a_() {
      if (Utlis.a() - this.c > 15000L) {
         this.H.h();
      }

   }

   public final Vector g() {
      return new Vector();
   }
}
