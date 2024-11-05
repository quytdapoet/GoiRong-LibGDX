package gro;

import java.util.Vector;

public final class vdtt_gq extends EntityPanel {
   private static vdtt_gq f;
   public Vector a;
   public Vector b;
   public Vector c;
   public int d;
   public long e;

   public vdtt_gq() {
      this.setSize(DataCenter.gI().n - 200, 70);
      this.setXY(DataCenter.gI().n / 2 - this.width / 2, DataCenter.gI().o - 120);
      this.a = new Vector();
      this.b = new Vector();
      this.c = new Vector();
   }

   public final void a() {
      this.a.clear();
      this.b.clear();
      this.c.clear();
   }

   public static vdtt_gq gI() {
      if (f == null) {
         f = new vdtt_gq();
      }

      return f;
   }

   public final void a(Graphics var1) {
      try {
         int var2 = var1.e;
         int var3 = var1.f;
         this.a(var1, this.cx, this.cy);

         for(int var4 = 0; var4 < this.a.size(); ++var4) {
            vdtt_gr var5 = (vdtt_gr)this.a.elementAt(var4);
            var1.d(var5.e);
            if (var5.a.length() > 100) {
               for(int var6 = var5.a.length() / 2; var6 >= 0; --var6) {
                  if (var5.a.substring(var6 - 1, var6).equals(" ")) {
                     vdtt_dd.a(var5.b, var1, var5.a.substring(0, var6), this.width / 2, var5.d, 2, var5.c);
                     String var7 = var5.a;
                     vdtt_dd.a(var5.b, var1, var7.substring(var6, var7.length()), this.width / 2, var5.d + 10, 2, var5.c);
                     break;
                  }
               }
            } else {
               vdtt_dd.a(var5.b, var1, var5.a, this.width / 2, var5.d, 2, var5.c);
            }

            var1.m = 1.0F;
         }

         this.a(var1, var2, var3);
      } catch (Exception var8) {
      }

   }

   public final boolean a(String var1) {
      for(int var2 = 0; var2 < this.a.size(); ++var2) {
         if (((vdtt_gr)this.a.get(var2)).a.equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public final void a(String var1, vdtt_dd var2, int var3) {
      if (System.currentTimeMillis() - this.e < 100L) {
         if (this.c.size() > 100) {
            this.c.remove(0);
         }

         this.c.add(new vdtt_gr(this, var1, var2, var3));
      } else {
         this.e = System.currentTimeMillis();
         if (this.a.size() == 0) {
            this.a.add(new vdtt_gr(this, var1, var2, var3));
         } else {
            vdtt_gr var4;
            if ((var4 = (vdtt_gr)this.a.lastElement()).d >= this.height) {
               this.a.add(new vdtt_gr(this, var1, var2, var3, var4.d - 15));
            } else {
               this.a.add(new vdtt_gr(this, var1, var2, var3));
            }
         }
      }

   }

   public static Vector a(vdtt_gq var0) {
      return var0.a;
   }
}
