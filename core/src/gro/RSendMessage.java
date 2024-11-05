package gro;

final class RSendMessage implements Runnable {
   final Session a;

   RSendMessage(Session var1) {
      this.a = var1;
   }

   public final void run() {
      while(this.a.isConnected) {
         try {
            boolean var1 = false;

            Session var2;
            byte[] var3;
            for(this.a.waitThreadSend = false; this.a.vecMessage.size() > 0; var2.k += var3.length) {
               var3 = (byte[])this.a.vecMessage.firstElement();
               this.a.vecMessage.removeElement(var3);
               byte[] var4 = var3;
               Writer var5 = this.a.writer;

               for(int var6 = 0; var6 < var4.length; ++var6) {
                  var5.dos.writeByte(var4[var6]);
               }

               this.a.writer.dos.flush();
               var2 = this.a;
            }

            synchronized(this.a.lockSendMessage) {
               try {
                  this.a.lockSendMessage.wait(3600000L);
               } catch (Exception var8) {
                  Utlis.a(var8);
               }
            }
         } catch (Exception var10) {
            this.a.close();
            Thread.currentThread().interrupt();
         }
      }

   }
}
