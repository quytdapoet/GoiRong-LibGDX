package gro;

public final class vdtt_ho extends EntityPanel {
   private long a;
   private String[] b;
   private boolean c;
   private int d = 8;

   public vdtt_ho(String var1) {
      this.setSize(80, 20);
      boolean var2 = true;

      int var3;
      while(var2) {
         try {
            String var4 = var1.toLowerCase();
            var2 = false;
            var3 = 0;

            for(int var5 = 0; var5 < vdtt_ik.g.length; ++var5) {
               int var6;
               if ((var6 = var4.indexOf(vdtt_ik.g[var5].d)) >= 0) {
                  this.c = true;
                  ++var3;
                  if (var3 > 4) {
                     var6 = var1.toLowerCase().indexOf(vdtt_ik.g[var5].d);
                     var1 = var1.substring(0, var6) + var1.substring(var6 + vdtt_ik.g[var5].d.length(), var1.length());
                     var2 = true;
                     break;
                  }

                  var4 = var4.substring(0, var6) + var4.substring(var6 + vdtt_ik.g[var5].d.length(), var4.length());
                  var5 = -1;
               }
            }
         } catch (Exception var7) {
            break;
         }
      }

      this.a = Utlis.a();
      this.b = vdtt_dd.c(vdtt_dd.d, var1, this.width - 10);
      if ((var3 = vdtt_dd.a(vdtt_dd.b, this.b)) + 10 < this.width) {
         this.width = (short)(var3 + 10);
      }

      if (this.width < 0) {
         this.width = 0;
      }

      this.height = (short)(this.b.length * this.d + this.d);
      if (this.b.length * this.d + this.d > 20) {
         this.height = (short)(this.b.length * this.d + this.d);
      }

      if (this.c) {
         this.height = (short)(this.height + 5);
         this.width = (short)(this.width + 30);
      } else {
         this.width = (short)(this.width + 20);
      }

      if (this.width < 40) {
         this.width = 40;
      }

      if (this.height < 20) {
         this.height = 20;
      }

   }

   public final boolean a(int var1, int var2) {
      this.cx = (short)(var1 - this.width / 2);
      this.cy = (short)(var2 - this.height - 7);
      return Utlis.a() - this.a > 10000L;
   }

   public final void a(Graphics var1) {
      var1.c(-8492991);
      this.a(var1, this.cx, this.cy, this.width, this.height, -12, 380, -12);
      vdtt_cz.a(var1, 381, 0, this.cx + this.width / 2 + 1, this.cy + this.height + 5, 33);
      var1.f();
      int var2 = this.cy;
      if (this.c) {
         var2 += 2;
      }

      int var3 = -1;

      for(int var4 = 0; var4 < this.b.length; ++var4) {
         var3 = vdtt_dd.c(vdtt_dd.c, var1, this.b[var4], this.cx + this.width / 2, var2 + this.d + var4 * this.d, 2, var3, 0);
      }

   }
}
