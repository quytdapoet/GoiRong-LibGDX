package gro;

public final class vdtt_ar implements Runnable {
   final vdtt_aq a;

   public vdtt_ar(vdtt_aq var1) {
      this.a = var1;
   }

   public final void run() {
      if (vdtt_aq.a(this.a) != null) {
         try {
            vdtt_aq.b(this.a).setVolume(1.0F);
            vdtt_aq.a(true);
            vdtt_aq.b(this.a).writeSamples((short[])vdtt_aq.a(this.a), 0, vdtt_aq.a(this.a).length);
            this.a.dispose();
            return;
         } catch (Exception var2) {
         }
      }

   }
}
