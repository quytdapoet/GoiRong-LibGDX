package gro;

final class vdtt_md implements Runnable {
   final vdtt_mc a;

   vdtt_md(vdtt_mc var1) {
      this.a = var1;
   }

   public final void run() {
      ArrayServer var1 = vdtt_mc.a(this.a)[vdtt_mc.b(this.a).b.b];

      for(int var2 = 0; var2 < var1.server.length; ++var2) {
         Server var3;
         if (Utlis.b((var3 = var1.server[var2]).ipServer, var3.portServer)) {
            var3.strSttaus = Caption.nJ;
         } else {
            var3.strSttaus = Caption.nI;
         }
      }

   }
}
