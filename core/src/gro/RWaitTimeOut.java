package gro;

final class RWaitTimeOut implements Runnable {
   final Session a;

   RWaitTimeOut(Session var1) {
      this.a = var1;
   }

   public final void run() {
      try {
         synchronized(this.a.lockTimeOut) {
            try {
               this.a.lockTimeOut.wait(20000L);
            } catch (Exception var4) {
            }
         }

         if (this.a.isConnecting) {
            this.a.close();
         }
      } catch (Exception var6) {
         Thread.currentThread().interrupt();
      }

   }
}
