package gro;

public final class vdtt_je extends vdtt_ap {
   public vdtt_je(MainScreen var1) {
      this.H = var1;
      this.a(232, 110);
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.xO, (byte)2, this.J);

      for(int var2 = 0; var2 < Caption.Ca.length; ++var2) {
         vdtt_dd.a(vdtt_dd.d, var1, Caption.Ca[var2], 7, this.f() + 8 + var2 * 12, 0, -1);
      }

   }

   public final void a_() {
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void d() {
      super.d();
      vdtt_ii var1;
      if ((var1 = GameSrc.gI().T()) != null && var1.a == 43) {
         GameSrc.gI();
         GameSrc.o(92);
      }

   }
}
