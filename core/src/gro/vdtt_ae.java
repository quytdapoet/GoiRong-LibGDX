package gro;

final class vdtt_ae implements Runnable {
   public final void run() {
      while(true) {
         try {
            synchronized(EntityPanel.w) {
               try {
                  EntityPanel.w.wait(3600000L);
               } catch (Exception var4) {
                  Utlis.a(var4);
               }
            }

            while(EntityPanel.y.size() > 0) {
               EntityPanel.b((vdtt_ek)EntityPanel.y.remove(0));
            }
         } catch (Exception var6) {
            Utlis.a(var6);
         }
      }
   }
}
