package gro;

public final class vdtt_hu extends vdtt_hp {
   private vdtt_hp M;

   public vdtt_hu(byte var1, int var2, int var3, int var4, int var5, int var6, int var7, vdtt_hp var8) {
      super((byte)1, var2, var3, var4, var5, var6, 1);
      this.M = var8;
   }

   public final void a() {
      super.a();
   }

   public final void a(int var1, int var2) {
      super.a(var1, var2);
      this.M.a(var1, var2);
   }

   public final void b(int var1, int var2) {
      super.b(var1, var2);
      this.M.b(var1, var2);
      this.l = -1;
   }

   public final void c(int var1, int var2) {
      super.a(var1, var2);
      this.M.a(var1, var2);
      this.l = -1;
   }
}
