package gro;

import java.util.Comparator;

final class vdtt_fh implements Comparator {
   public final int compare(Object var1, Object var2) {
      Friend var3 = (Friend)var1;
      Friend var4 = (Friend)var2;
      if (var4.type == var3.type) {
         if (var4.isOnline == var3.isOnline) {
            return var4.name.compareTo(var3.name);
         } else {
            return var4.isOnline ? 1 : -1;
         }
      } else {
         return var4.type - var3.type;
      }
   }
}
