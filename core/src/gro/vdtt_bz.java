package gro;

public final class vdtt_bz extends vdtt_by {
   private byte W;
   private String X = "";

   public vdtt_bz(int var1, int var2, int var3, String var4, vdtt_w var5, int var6, int var7, int var8) {
      super(var1, var2, var3, var4, var5, 0, 2);
      this.l = 8;
      this.W = 0;
      this.N = new vdtt_ht((byte)0, 5, 2, this.width - 10 - 22, this.height - 4, this.width, 0);
   }

   public final void c() {
      super.c();
      this.X = Utlis.c(this.h());
   }

   public final void b(Graphics var1) {
      vdtt_y.a(var1, 305, 0, 0, 2, this.width, (int)(this.height * 2 - 6));
      super.b(var1);
      if (!(this.a instanceof vdtt_v)) {
         this.a(var1, this.a.cx + this.cx, this.a.cy + this.cy);
         if (this.W == 2) {
            vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(this.h()) + " " + Caption.yO[0], 5, 29, 0, -2560, -16777216);
         } else if (this.W == 3) {
            vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(this.h()) + " " + Caption.yO[1], 5, 29, 0, -2560, -16777216);
         } else if (this.W == 0) {
            vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(this.h()) + " " + Caption.yO[2], 5, 29, 0, -3089954, -16777216);
         } else if (this.W == 1) {
            vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(this.h()) + " " + Caption.yO[3], 5, 29, 0, -3089954, -16777216);
         }
      }

   }
}
