package gro;

import java.util.Vector;

public final class vdtt_ge extends EntityPanel {
   public vdtt_hp a;
   public vdtt_hm b;
   public vdtt_gd c;
   public Vector[] d;
   public vdtt_w e;
   private short i = 307;
   private int j;
   public String[][] f;
   public boolean[] g;
   public boolean[] h;

   public vdtt_ge(vdtt_hm var1, int var2, int var3, int var4, int var5, int var6, int var7, vdtt_w var8) {
      boolean var9 = false;
      byte var10 = 33;
      byte var11 = 87;
      byte var12 = 1;
      vdtt_hm var13 = var1;
      vdtt_ge var14 = this;
      this.setXY(var12, var4);
      this.setSize(var11, var6);
      this.j = var2;
      this.e = var8;
      this.b = var1;
      if (var1.c.length * var10 > var6 - 20) {
         var7 = (var6 - 20) / var10 * var10;
      } else {
         var7 = var1.c.length * var10;
      }

      this.a = new vdtt_hp((byte)1, 10, 10, var11 - 18, var7, var10, var1.c.length);
      byte var15 = -1;
      this.a.H = var15;
      this.c = new vdtt_gd(0, 0, 0, 16, (byte)0, var1.c.length);
      this.d = new Vector[var1.c.length];
      this.f = new String[var1.c.length][];
      this.g = new boolean[var1.c.length];
      this.h = new boolean[var1.c.length];

      for(var3 = 0; var3 < var14.d.length; ++var3) {
         var14.d[var3] = new Vector();
         String[] var16;
         if ((var16 = var13.c[var3].trim().split(" ")).length >= 3 && !var13.c[var3].contains("\n")) {
            var14.f[var3] = new String[2];
            StringBuilder var17;
            String[] var18;
            if (var16.length >= 4) {
               var14.f[var3][0] = var16[0] + " " + var16[1];
               var14.f[var3][1] = "";

               for(var5 = 2; var5 < var16.length; ++var5) {
                  var17 = new StringBuilder();
                  var18 = var14.f[var3];
                  var18[1] = var17.append(var18[1]).append(var16[var5]).append(" ").toString();
               }

               var14.f[var3][1] = var14.f[var3][1].trim();
            } else {
               var14.f[var3][0] = var16[0];
               var14.f[var3][1] = "";

               for(var5 = 1; var5 < var16.length; ++var5) {
                  var17 = new StringBuilder();
                  var18 = var14.f[var3];
                  var18[1] = var17.append(var18[1]).append(var16[var5]).append(" ").toString();
               }

               var14.f[var3][1] = var14.f[var3][1].trim();
            }
         } else {
            var14.f[var3] = vdtt_dd.c(vdtt_dd.e, var13.c[var3], var11 - 10);
         }
      }

   }
}
