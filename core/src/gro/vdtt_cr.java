package gro;

public final class vdtt_cr extends vdtt_by {
   final LoginPCScreen W;

   public vdtt_cr(LoginPCScreen var1, int var2, int var3, int var4, String var5, vdtt_w var6, int var7, int var8) {
      super(var2, var3, 122, var5, var6, -11, 0);
      this.W = var1;
   }

   public final void j() {
      LoginPCScreen var1 = this.W;
      String var2 = LoginPCScreen.a(this.W).i();
      LoginPCScreen var3 = var1;

      for(int var4 = 0; var4 < var3.K.size(); ++var4) {
         String[] var5;
         if ((var5 = (String[])var3.K.elementAt(var4))[0].equals(var2)) {
            var3.J.a(var5[1]);
            return;
         }
      }

   }
}
