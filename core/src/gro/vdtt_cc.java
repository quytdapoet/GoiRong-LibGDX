package gro;

import java.util.Vector;

public final class vdtt_cc extends vdtt_al {
   private vdtt_hp m;
   public String[] l;

   public vdtt_cc(int var1, int var2, vdtt_w var3, String var4) {
      this.a = var3;
      this.setXY(var1, var2);
      this.l = vdtt_dd.c(vdtt_dd.d, var4, 106);
      var1 = this.l.length > 8 ? 8 : this.l.length;
      this.setSize(120, (this.l.length > 8 ? 8 : this.l.length) * 13 + 10);
      this.m = new vdtt_hp((byte)1, 0, 5, this.width, var1 * 13, 13, this.l.length);
   }

   public final void b(Graphics var1) {
      var1.c(-3330239);
      this.a(var1, 0, 0, this.width, this.height, -12, 380, -12);
      var1.f();
      this.a(var1, this.m);

      for(int var2 = 0; var2 < this.l.length; ++var2) {
         vdtt_dd.c(vdtt_dd.d, var1, this.l[var2], 8, var2 * this.m.h + 5, 0, -3089954, 0);
      }

      this.a(var1);
   }

   public final void a_() {
      this.m.a();
   }

   public final Vector g() {
      return new Vector();
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
   }
}
