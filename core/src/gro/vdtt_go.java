package gro;

import java.util.Vector;

public final class vdtt_go extends EntityPanel {
   public Vector a = new Vector();
   public vdtt_gp b;
   private String[] d;
   private int e;
   private int f;
   private static vdtt_go g;
   public boolean c = false;

   public static vdtt_go gI() {
      if (g == null) {
         g = new vdtt_go();
      }

      return g;
   }

   public final void b() {
      this.b = null;
      this.a.clear();
   }

   public final void a(Graphics var1) {
      int var2 = var1.e;
      int var3 = var1.f;
      this.a(var1, this.cx, this.cy);
      if (this.b != null) {
         vdtt_y.a(var1, 18, 0, -80, -2, this.width + 160, (int)(this.height + 6));
         var1.d(-50, 0, this.width + 100, this.height + 10);

         for(int var4 = 0; var4 < this.d.length; ++var4) {
            int var5 = var4 * (vdtt_dd.a(this.b.b) + 2) + vdtt_dd.a(this.b.b) / 2 - this.f + 2;
            if (-20 <= var5 && var5 <= 20 + this.height) {
               vdtt_dd.a(this.b.b, var1, this.d[var4], this.width / 2, var5, 2, this.b.d, 3, 1);
            }
         }

         this.a(var1, 0, 0);
         var1.d(0, 0, DataCenter.gI().n, DataCenter.gI().o);
      }

      this.a(var1, var2, var3);
   }

   public void c() {
      this.e = this.f = 0;
      this.b = (vdtt_gp)this.a.firstElement();
      this.width = (short)vdtt_dd.b(this.b.b, this.b.a);
      if (this.width > DataCenter.gI().n - 140) {
         this.width = (short)(DataCenter.gI().n - 140);
      }

      this.d = new String[]{this.b.a};
      this.height = (short)vdtt_dd.a(this.b.b);
      this.height = (short)(this.height + 3);
      this.setXY(DataCenter.gI().n / 2 - this.width / 2, DataCenter.gI().o / 2);
   }

   public final void d() {
      try {
         if (this.c) {
            this.c = false;
            this.a.clear();
            this.b = null;
         } else {
            if (this.b == null && this.a.size() > 0) {
               this.c();
            }

            if (this.b != null) {
               ++this.e;
               if (this.e % (this.b.c / this.d.length) == 0) {
                  ++this.f;
               } else if (this.f % (vdtt_dd.a(this.b.b) + 2) != 0) {
                  ++this.f;
               }

               if (this.f >= (this.d.length - 1) * (vdtt_dd.a(this.b.b) + 2)) {
                  this.f = (this.d.length - 1) * (vdtt_dd.a(this.b.b) + 2);
               }

               if (this.e == this.b.c) {
                  this.b = null;
                  this.a.removeElementAt(0);
               }
            }
         }
      } catch (Exception var2) {
      }

   }

   public static String a(String var0, String var1, String var2) {
      StringBuffer var3;
      int var4;
      for(var3 = new StringBuffer(); (var4 = var0.indexOf(var1)) != -1; var0 = var0.substring(var4 + var1.length())) {
         var3.append(var0.substring(0, var4) + var2);
      }

      var3.append(var0);
      return var3.toString();
   }
}
