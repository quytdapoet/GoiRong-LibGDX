package gro;

final class vdtt_q implements Runnable {
   final Canvas a;

   vdtt_q(Canvas var1) {
      this.a = var1;
   }

   public final void run() {
      while(true) {
         try {
            if (Canvas.a(this.a)) {
               Canvas.a(this.a, false);
               continue;
            }
         } catch (Exception var2) {
            Utlis.a(var2);
         }

         return;
      }
   }
}
