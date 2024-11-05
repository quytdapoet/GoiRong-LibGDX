package gro;

final class vdtt_cn implements Runnable {
   final CheckVersionScreen a;

   vdtt_cn(CheckVersionScreen var1) {
      this.a = var1;
   }

   public final void run() {
      CheckVersionScreen.c(this.a);
   }
}
