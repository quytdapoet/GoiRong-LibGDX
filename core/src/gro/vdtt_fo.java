package gro;

import java.util.Comparator;

final class vdtt_fo implements Comparator {
   public final int compare(Object var1, Object var2) {
      Item var3 = (Item)var1;
      Item var4 = (Item)var2;
      if (var4.getItemTemplate().levelNeed == var3.getItemTemplate().levelNeed) {
         if (var4.isLock == var3.isLock) {
            return var3.index - var4.index;
         } else {
            return var3.isLock ? -1 : 1;
         }
      } else {
         return var4.getItemTemplate().levelNeed - var3.getItemTemplate().levelNeed;
      }
   }
}
