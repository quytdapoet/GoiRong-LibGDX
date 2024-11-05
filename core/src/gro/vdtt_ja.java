package gro;

public final class vdtt_ja extends vdtt_ap {
   private String[] a;

   public vdtt_ja(String var1, MainScreen var2) {
      this.e = 1;
      this.a(230, 150);
      this.H = var2;
      this.a = vdtt_dd.c(vdtt_dd.d, var1, 200);
      this.a(Caption.i, -7);
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 100:
         this.k();
      default:
      }
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.h, (byte)2, this.J);

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         vdtt_dd.c(vdtt_dd.d, var1, this.a[var2], 14, this.h() / 2 + 20 + var2 * 12 - this.a.length * 6, 0, -1, -16777216);
      }

   }

   public final void a_() {
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }
}
