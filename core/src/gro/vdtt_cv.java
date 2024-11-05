package gro;

final class vdtt_cv implements Runnable {
   final GameSrc a;

   vdtt_cv(GameSrc var1) {
      this.a = var1;
   }

   public final void run() {
      GameSrc.M = vdtt_y.e(String.valueOf(DataCenter.k() ? 101 : 100));
   }
}
