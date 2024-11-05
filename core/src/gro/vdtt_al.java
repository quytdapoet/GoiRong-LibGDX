package gro;

public abstract class vdtt_al extends vdtt_k {
   public static vdtt_hp[] a(vdtt_ay[] var0) {
      vdtt_hp[] var1 = new vdtt_hp[var0.length];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var0[var2] != null) {
            var1[var2] = new vdtt_hp((byte)1, var0[var2].cx, var0[var2].cy, var0[var2].width, var0[var2].height, var0[var2].height, 1);
         }
      }

      return var1;
   }

   public final void a(Graphics var1, vdtt_ay[] var2, int var3, int var4) {
      for(int var5 = 0; var5 < var2.length; ++var5) {
         if (var2[var5] != null) {
            this.a(var1, var3, var4);
            var1.a(var2[var5].cx, var2[var5].cy);
            var2[var5].b(var1);
         }
      }

   }

   public static void a(vdtt_ay[] var0, vdtt_hp[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var0[var2] != null) {
            var1[var2].a();
            if (var1[var2].l != -1) {
               var0[var2].M = true;
            } else {
               var0[var2].M = false;
            }
         }
      }

   }

   public final void c(Graphics var1) {
      this.a(var1, 0, 0, this.width, this.height, 61, 22, 23, 1, 1);
   }

   public final void e(Graphics var1) {
      this.a(var1, 0, 0, this.width, this.height, -11, 22, 23, 1, 1);
   }
}
