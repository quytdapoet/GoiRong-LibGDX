package gro;

import java.util.Comparator;

public class vdtt_fw {
   public static final Comparator b = new vdtt_fx();
   public static final Comparator c = new vdtt_fy();
   public XYEntity[] d;
   public short e;
   public short f;
   public short g;
   public short h;

   public vdtt_fw() {
   }

   public vdtt_fw(XYEntity[] var1) {
      this.d = var1;
   }

   public final vdtt_fw a() {
      vdtt_fw var1;
      (var1 = new vdtt_fw()).e = this.e;
      var1.f = this.f;
      var1.g = this.g;
      var1.h = this.h;
      var1.d = new XYEntity[this.d.length];

      for(int var2 = 0; var2 < this.d.length; ++var2) {
         var1.d[var2] = new XYEntity();
         var1.d[var2].setXY(this.d[var2].cx, this.d[var2].cy);
      }

      return var1;
   }

   public final XYEntity a(XYEntity var1, XYEntity var2) {
      for(int var3 = 0; var3 < this.d.length - 1; ++var3) {
         XYEntity var4;
         if ((var4 = Utlis.a(var1, var2, this.d[var3], this.d[var3 + 1])) != null) {
            return var4;
         }
      }

      return null;
   }

   public final boolean a(int var1, int var2) {
      return a(var1, var2, this.d);
   }

   private static boolean a(int var0, int var1, XYEntity[] var2) {
      boolean var3 = false;
      int var4 = 0;

      for(int var5 = var2.length - 1; var4 < var2.length; var5 = var4++) {
         if ((var2[var4].cy <= var1 && var1 < var2[var5].cy || var2[var5].cy <= var1 && var1 < var2[var4].cy) && var0 < (var2[var5].cx - var2[var4].cx) * (var1 - var2[var4].cy) / (var2[var5].cy - var2[var4].cy) + var2[var4].cx) {
            var3 = !var3;
         }
      }

      return var3;
   }

   public Object clone() {
      return this.a();
   }
}
