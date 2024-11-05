package gro;

import java.util.Vector;

public final class vdtt_gt extends EntityPanel {
   public Vector a = new Vector();
   public vdtt_it b;
   private String[] c;
   private int d;
   private static vdtt_gt e;

   public static vdtt_gt gI() {
      if (e == null) {
         e = new vdtt_gt();
      }

      vdtt_gt var0 = e;
      var0.setXY(var0.cx, 10);
      return e;
   }

   public final void b() {
      this.b = null;
      this.a.clear();
   }

   public final void a(Graphics var1) {
      try {
         int var2 = var1.e;
         int var3 = var1.f;
         this.a(var1, this.cx, this.cy);
         if (this.b != null) {
            this.a(var1, -10, -8, this.width + 20, this.height + 16, -11, 55, 56, 1, 1);

            for(int var4 = 0; var4 < this.c.length; ++var4) {
               vdtt_dd.a(this.b.b, var1, this.c[var4], this.width / 2, -1 + this.height / 2 + vdtt_dd.a(this.b.b) / 2 + var4 * vdtt_dd.a(this.b.b) - this.c.length * vdtt_dd.a(this.b.b) / 2, 2, this.b.d);
            }
         }

         this.a(var1, var2, var3);
      } catch (Exception var5) {
         Utlis.a(var5);
      }

   }

   public void c() {
      this.d = 0;
      this.b = (vdtt_it)this.a.firstElement();
      this.width = (short)vdtt_dd.b(this.b.b, this.b.a);
      if (this.width > DataCenter.gI().n - 200) {
         this.width = (short)(DataCenter.gI().n - 200);
      }

      this.c = vdtt_dd.c(this.b.b, this.b.a, this.width);
      this.b.c = this.c.length * 50;
      if (this.b.c < 80) {
         this.b.c = 80;
      }

      this.height = (short)(this.c.length * vdtt_dd.a(this.b.b));
      this.setXY(DataCenter.gI().n / 2 - this.width / 2, DataCenter.gI().o - this.height - 24);
   }

   public final void d() {
      try {
         if (this.b == null && this.a.size() > 0) {
            this.c();
         }

         if (this.b != null) {
            ++this.d;
            if (this.d == this.b.c) {
               this.b = null;
               this.a.removeElementAt(0);
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
