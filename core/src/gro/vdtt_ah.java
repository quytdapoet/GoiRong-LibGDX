package gro;

import java.util.Comparator;

final class vdtt_ah implements Comparator {
   public final int compare(Object var1, Object var2) {
      XYEntity var3 = (XYEntity)var1;
      XYEntity var4 = (XYEntity)var2;
      return var3.cy == var4.cy ? var4.cx - var3.cx : var3.cy - var4.cy;
   }
}
