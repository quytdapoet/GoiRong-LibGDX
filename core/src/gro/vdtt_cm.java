package gro;

final class vdtt_cm implements Runnable {
   final vdtt_ek a;
   final CheckVersionScreen b;

   vdtt_cm(CheckVersionScreen var1, vdtt_ek var2) {
      this.b = var1;
      this.a = var2;
   }

   public final void run() {
      try {
         StringBuilder var1 = (new StringBuilder()).append(DataCenter.gI().URL_SERVER).append(DataCenter.gI().URL_IMG_IOS);
         DataCenter.gI();
         byte[] var5;
         if ((var5 = Binary.c(var1.append(DataCenter.a(this.a.d) + 1).append("/").append(this.a.d).toString())) == null) {
            System.out.println(var1.toString());
            CheckVersionScreen.a(this.b);
         } else {
            Binary.a(var5, false);
            if (this.a.d.contains("font")) {
               vdtt_dd.a();
            }

            Binary.b("arr_check_" + this.a.a, var5.length);
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
