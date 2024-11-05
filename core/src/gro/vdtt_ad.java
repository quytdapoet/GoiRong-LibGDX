package gro;

final class vdtt_ad implements Runnable {
   public final void run() {
      while(true) {
         try {
            while(true) {
               synchronized(EntityPanel.v) {
                  try {
                     EntityPanel.v.wait(3600000L);
                  } catch (Exception var6) {
                     Utlis.a(var6);
                  }
               }

               while(EntityPanel.x.size() > 0) {
                  EntityPanel.a((vdtt_ek)EntityPanel.x.remove(0));
               }

               synchronized(EntityPanel.w) {
                  EntityPanel.w.notify();
               }
            }
         } catch (Exception var8) {
            Utlis.a(var8);
         }
      }
   }
}
