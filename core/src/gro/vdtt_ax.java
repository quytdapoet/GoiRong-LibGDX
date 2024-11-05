package gro;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class vdtt_ax implements Runnable {
   final short[] a;
   final vdtt_aw b;

   vdtt_ax(vdtt_aw var1, short[] var2) {
      this.b = var1;
      this.a = var2;
   }

   public final void run() {
      try {
         if (vdtt_as.c.length() == 0 || vdtt_as.c(this.b.a.b) == 0) {
            return;
         }

         byte[] var1;
         ByteBuffer.wrap(var1 = new byte[this.a.length * 2]).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().put(this.a);
         if (Utlis.a(var1, vdtt_as.c)) {
            vdtt_as.b(this.b.a.b, this.b.a.a);
         } else {
            Utlis.a(1000L);
            if (Utlis.a(var1, vdtt_as.c)) {
               vdtt_as.b(this.b.a.b, this.b.a.a);
            }
         }

         vdtt_as.c = "";
         return;
      } catch (Exception var5) {
      } finally {
         this.b.a.b.dispose();
      }

   }
}
