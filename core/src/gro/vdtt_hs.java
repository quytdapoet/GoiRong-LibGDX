package gro;

public final class vdtt_hs extends vdtt_hp {
   public vdtt_ak M;

   public vdtt_hs(byte var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super((byte)0, 0, 0, var4, var5, 1, 1);
   }

   public final void b(int var1, int var2) {
      var1 += this.M.cx;
      var2 += this.M.cy;
      if (var1 < 50 - this.M.width) {
         var1 = 50 - this.M.width;
      }

      if (var1 > DataCenter.gI().n - 50) {
         var1 = DataCenter.gI().n - 50;
      }

      if (var2 < 50 - this.M.height) {
         var2 = 50 - this.M.height;
      }

      if (var2 > DataCenter.gI().o - 50) {
         var2 = DataCenter.gI().o - 50;
      }

      this.M.setXY(var1, var2);
      if (!this.M.J && this.M.cy < -10) {
         this.M.cy = -10;
      }

   }
}
