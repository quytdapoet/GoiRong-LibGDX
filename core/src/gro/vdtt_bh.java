package gro;

import java.util.Vector;

public final class vdtt_bh extends vdtt_ak {
   public vdtt_x a;
   private vdtt_bb[] b;
   private boolean[] c;

   public final void b(Graphics var1) {
      var1.f(-11184811);
      var1.c(2, 19, this.width - 3, this.height - 29);
      var1.f(-10275328);
      var1.b(6, 23, this.width - 12, this.height - 38);
      this.a(var1, this.cx + 4, this.cy + this.f());
      if (this.b.length > 1) {
         vdtt_dd.a(var1, Caption.vA, this.width / 2, 15, 2, -1);
      } else {
         vdtt_dd.a(var1, Caption.vE, this.width / 2, 15, 2, -1);
      }

   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (var1.b >= 2000 && var1.b <= 3000) {
         for(int var4 = 0; var4 < this.b.length; ++var4) {
            if (this.b[var4] != null) {
               this.c[var4] = this.b[var4].m;
            }
         }

         Binary.a("download_full", true);
         this.k();
         this.a.a(var1, var2, var3);
      }

   }

   public final Vector g() {
      return super.g();
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void a_() {
   }
}
