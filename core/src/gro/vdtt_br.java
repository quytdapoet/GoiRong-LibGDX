package gro;

public final class vdtt_br extends vdtt_es {
   private final float J = 0.7F;
   private final float K = 1.0F;
   private float L = 0.7F;
   private int M;
   private boolean N = false;
   private mImage O;
   private mImage P;
   private static vdtt_br Q;

   private vdtt_br() {
      super(0, 0, 0);
   }

   public static vdtt_br gI() {
      if (Q == null) {
         Q = new vdtt_br();
      }

      return Q;
   }

   public final vdtt_br b(int var1, int var2) {
      this.setXY(var1, var2);
      this.l = 3;
      return Q;
   }

   public final void paintTop(Graphics var1) {
      if (!this.q()) {
         this.P = vdtt_cz.d(856);
         this.O = vdtt_cz.d(855);
         if (this.P != null && this.O != null) {
            if (this.H != 0) {
               var1.c((float)this.H);
               this.M = 0;
               this.n();
            }

            var1.a(this.O, 0, 0, this.O.c, this.O.d, 0, this.cx - 3, this.cy - 3, 6 * DataCenter.gI().r, 6 * DataCenter.gI().r, 0);
            boolean var2 = true;
            var1.k = var2;
            var1.a(this.P, 0, 0, this.P.c, this.P.d, this.M, this.cx - (int)(28.0F * this.L), this.cy - (int)(28.0F * this.L), (int)(56.0F * this.L * (float)DataCenter.gI().r), (int)(56.0F * this.L * (float)DataCenter.gI().r), 0, 0, 0);
            var2 = false;
            var1.k = var2;
            if (this.H != 0) {
               var1.r();
            }
         }
      }

   }

   public final void n() {
      if (!this.q()) {
         this.M += 15;
         if (this.M > 360) {
            this.M = 0;
         }

         if (this.N && this.L <= 0.7F || !this.N && this.L >= 1.0F) {
            --this.l;
            this.N = !this.N;
         }

         if (!this.N) {
            this.L = (float)((double)this.L + 0.03D);
         } else {
            this.L = (float)((double)this.L - 0.03D);
         }
      }

   }
}
