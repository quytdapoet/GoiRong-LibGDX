package gro;

import java.util.Vector;

public final class vdtt_gs extends EntityPanel {
   public Vector a = new Vector();
   public vdtt_it b;
   private String[] d;
   private boolean[] e;
   private int f;
   private int g;
   public int c;
   private static vdtt_gs h;

   public static vdtt_gs gI() {
      if (h == null) {
         h = new vdtt_gs();
      }

      return h;
   }

   public final void b() {
      this.b = null;
      this.a.clear();
   }

   public final void a(Graphics var1) {
      int var2 = var1.e;
      int var3 = var1.f;
      if (!(GameSrc.gI().c instanceof GameSrc) && !(GameSrc.gI().c instanceof vdtt_gf)) {
         this.a(var1, this.cx, DataCenter.gI().o - this.height);
      } else {
         this.a(var1, this.cx, this.cy - 10);
      }

      if (this.c != 0) {
         vdtt_y.a(var1, 18, 0, -2, -2, this.c, (int)(this.height + 6));
      }

      if (this.b != null && this.c == this.width) {
         var1.d(0, 0, this.width, this.height);

         for(int var4 = 0; var4 < this.d.length; ++var4) {
            int var5 = var4 * (vdtt_dd.a(this.b.b) + 2) + vdtt_dd.a(this.b.b) / 2 - this.g + 2;
            if (-20 <= var5 && var5 <= 20 + this.height) {
               vdtt_dd.c(this.b.b, var1, this.d[var4], this.width / 2, var5, 2, this.b.d, -16777216);
            }
         }

         this.a(var1, 0, 0);
         var1.d(0, 0, DataCenter.gI().n, DataCenter.gI().o);
      }

      this.a(var1, var2, var3);
   }

   public void c() {
      this.f = this.g = 0;
      this.b = (vdtt_it)this.a.firstElement();
      this.width = (short)(DataCenter.gI().n - 230);
      Vector var1 = vdtt_dd.a(this.b.b, this.b.a, this.width - 20);
      this.d = new String[var1.size()];
      this.e = new boolean[var1.size()];

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         this.d[var2] = (String)var1.elementAt(var2);
         if (vdtt_df.d(this.d[var2]) != null) {
            this.e[var2] = true;
         }
      }

      this.b.c = this.d.length * 150;
      if (this.b.c < 80) {
         this.b.c = 80;
      }

      this.height = (short)vdtt_dd.a(this.b.b);
      this.height = (short)(this.height + 3);
      this.setXY((DataCenter.gI().n - this.width) / 2, 55);
   }

   public final void d() {
      try {
         if (this.b == null && this.a.size() > 0) {
            this.c();
         }

         if (this.b != null && this.a.size() != 0) {
            this.c += 40;
            if (this.c < this.width) {
               return;
            }

            this.c = this.width;
         } else {
            this.c -= 40;
            if (this.c <= 0) {
               this.c = 0;
            }
         }

         if (this.b != null) {
            ++this.f;
            if (this.f % (this.b.c / this.d.length) == 0) {
               ++this.g;
            } else if (this.g % (vdtt_dd.a(this.b.b) + 2) != 0) {
               ++this.g;
            }

            if (this.g >= (this.d.length - 1) * (vdtt_dd.a(this.b.b) + 2)) {
               this.g = (this.d.length - 1) * (vdtt_dd.a(this.b.b) + 2);
            }

            if (this.f == this.b.c) {
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
