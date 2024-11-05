package gro;

final class vdtt_dh implements Runnable {
   final boolean a;
   final DataCenter b;

   vdtt_dh(DataCenter var1, boolean var2) {
      this.b = var1;
      this.a = var2;
   }

   public final void run() {
      vdtt_dd.a();
      this.b.b(this.a);
   }
}
