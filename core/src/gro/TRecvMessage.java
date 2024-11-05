package gro;

final class TRecvMessage extends Thread {
   final Session a;

   TRecvMessage(Session var1) {
      this.a = var1;
   }

   public final void run() {
      while(this.a.isConnected) {
         try {
            if (this.a.reader != null) {
               boolean var1 = false;
               this.a.waitThreadRecv = false;
               Session.a(this.a, this.a.reader, false);
            } else {
               Utlis.a(500L);
            }
         } catch (Exception var2) {
            this.a.close();
            Thread.currentThread().interrupt();
         }
      }

   }
}
