package gro;

final class vdtt_d implements Runnable {
   public final void run() {
      for(int var1 = 100; var1 < 125; ++var1) {
         try {
            mImage var2;
            if ((var2 = vdtt_y.f(String.valueOf(var1))) != null) {
               AppListener.e.put(var1 - 100, var2);
            }
         } catch (Exception var3) {
            return;
         }
      }

   }
}
