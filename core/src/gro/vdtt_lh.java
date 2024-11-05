package gro;

import java.util.Vector;

public final class vdtt_lh extends vdtt_ak {
   boolean a;
   int b;
   public int c;
   public int d;
   public boolean M;
   private String N;
   private int O;
   private long P;

   public vdtt_lh(MainScreen var1) {
      this.H = var1;
      this.setSize((DataCenter.gI().n - 240) / 14 * 14 + 192, 26);
      this.setXY(DataCenter.gI().n / 2 - this.width / 2, DataCenter.gI().o - 35);
      this.c = 0;
      this.d = 120;
      this.O = Utlis.a(Caption.Bs.length);
      this.y();
   }

   private void y() {
      if (System.currentTimeMillis() - this.P > 3000L) {
         this.P = System.currentTimeMillis();
         ++this.O;
         if (this.O > Caption.Bs.length - 1) {
            this.O = 0;
         }

         this.N = Caption.Bs[this.O];
      }

   }

   public final void w() {
      ++this.c;
      if (this.c > this.d * 99 / 100) {
         this.c = this.d * 99 / 100;
      }

   }

   public final void b(Graphics var1) {
      var1.o();
      GameSrc.e(var1);
   }

   public final int x() {
      return this.c * 100 / this.d;
   }

   public final void a_() {
      this.y();
      if (this.c < this.d / 2) {
         ++this.c;
      }

      if (this.c >= this.d) {
         if (this.H instanceof GameSrc) {
            ((GameSrc)this.H).aC = null;
         }
      } else {
         if (this.M) {
            this.c += this.d / 10;
         }

         if (this.c > this.d) {
            this.c = this.d;
         }
      }

   }

   public final Vector g() {
      return new Vector();
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }
}
