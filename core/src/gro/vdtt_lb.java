package gro;

public final class vdtt_lb extends vdtt_ap {
   private vdtt_bs a;
   private vdtt_bs b;
   private vdtt_hl c;

   public vdtt_lb(MainScreen var1) {
      this.H = var1;
      this.a(180, 100);
      this.c = new vdtt_hl(1000, mConfig.gI().b(9));
      this.a = this.a(15, 40, Caption.cE, this, this.c);
      this.b = this.a(15, 65, Caption.cF, this, this.c);
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      if (var1 == 1000) {
         mConfig.gI().a(9, this.c.b == 0);
      }

   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.zy[1], (byte)2, false);
   }

   public final void a_() {
   }
}
