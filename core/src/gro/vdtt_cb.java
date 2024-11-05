package gro;

final class vdtt_cb implements Runnable {
   final String a;
   final vdtt_ca b;

   vdtt_cb(vdtt_ca var1, String var2) {
      this.b = var1;
      this.a = var2;
   }

   public final void run() {
      try {
         String[] var1 = this.a.split("\r\n");
         vdtt_ca.a(this.b).clear();

         for(int var2 = 0; var2 < var1.length; ++var2) {
            vdtt_ca.a(this.b).addElement(var1[var2]);
         }

         vdtt_ca.a(this.b, new vdtt_hp((byte)1, 5, 30, this.b.width - 10, 120, 12, vdtt_ca.a(this.b).size()));
         vdtt_ca.b(this.b, new vdtt_hp((byte)1, vdtt_ca.b(this.b).cx, vdtt_ca.b(this.b).cy, vdtt_ca.b(this.b).width, vdtt_ca.b(this.b).height, vdtt_ca.b(this.b).height, 1));
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }
}
