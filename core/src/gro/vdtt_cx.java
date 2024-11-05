package gro;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class vdtt_cx implements Runnable {
   final String a;
   final GameSrc b;

   vdtt_cx(GameSrc var1, String var2) {
      this.b = var1;
      this.a = var2;
   }

   public final void run() {
      try {
         byte[] var1;
         if ((var1 = Utlis.k(this.a)) != null) {
            short[] var2 = new short[var1.length / 2];
            ByteBuffer.wrap(var1).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(var2);
            vdtt_aq var3 = new vdtt_aq(var2);
            (new Thread(new vdtt_ar(var3))).start();
         }
      } catch (Exception var4) {
         Utlis.a(var4);
      }

   }
}
