package gro;

final class vdtt_cl implements Runnable {
   final vdtt_ek a;
   final CheckVersionScreen b;

   vdtt_cl(CheckVersionScreen var1, vdtt_ek var2) {
      this.b = var1;
      this.a = var2;
   }

   public final void run() {
      try {
         byte[] var1;
         if ((var1 = Binary.c(DataCenter.gI().URL_SERVER_ASSET + this.a.d)) == null) {
            CheckVersionScreen.a(this.b);
         } else {
            if (!Binary.g("arr_savemap")) {
               Binary.a(this.a.e, var1);
            }

            Binary.b("arr_check_" + this.a.a, var1.length);
            DataCenter.gI().b(true);
            this.a.f = true;
            CheckVersionScreen.b(this.b);
         }
      } catch (Exception var4) {
         DataCenter var2 = DataCenter.gI();
         CheckVersionScreen var3 = new CheckVersionScreen();
         var2.currentScreen = var3;
      }

   }
}
