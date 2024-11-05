package gro;

import java.util.Comparator;

final class vdtt_ai implements Comparator {
   public final int compare(Object var1, Object var2) {
      Entity var3 = (Entity)var1;
      Entity var4 = (Entity)var2;
      int var6 = var3.prioritize();
      int var7;
      if ((var7 = var4.prioritize()) != var6) {
         int var13 = var7 - var6;
         return var13;
      } else if (var3 instanceof vdtt_es && ((vdtt_es)var3).p && !(var4 instanceof vdtt_es)) {
         return -1;
      } else if (var4 instanceof vdtt_es && ((vdtt_es)var4).p && !(var3 instanceof vdtt_es)) {
         return 1;
      } else {
         if (var3 instanceof vdtt_es && var4 instanceof vdtt_es) {
            vdtt_es var14 = (vdtt_es)var3;
            vdtt_es var15 = (vdtt_es)var4;
            if (var14.p && var15.p) {
               return var15.p().a - var14.p().a;
            }
         } else if (var3 instanceof vdtt_iw && var4 instanceof vdtt_iw) {
            vdtt_iw var9 = (vdtt_iw)var3;
            vdtt_iw var10 = (vdtt_iw)var4;
            if (var9.m().d != var10.m().d) {
               short var11 = var9.m().d;
               short var12 = var10.m().d;
               if (var11 == 0) {
                  var11 = 20;
               }

               if (var12 == 0) {
                  var12 = 20;
               }

               return var11 - var12;
            }

            if (var3.cy == var4.cy) {
               return var4.cx - var3.cx;
            }

            if (var3.cy >= var4.cy) {
               return -1;
            }

            byte var8 = 1;
            return var8;
         }

         return var3.cy == var4.cy ? var4.cx - var3.cx : var3.cy - var4.cy;
      }
   }
}
