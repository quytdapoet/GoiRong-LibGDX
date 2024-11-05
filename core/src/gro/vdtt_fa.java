package gro;

import java.util.Comparator;

final class vdtt_fa implements Comparator {
   public final int compare(Object var1, Object var2) {
      Enemy var3 = (Enemy)var1;
      Enemy var4 = (Enemy)var2;
      if (var4.isOnline == var3.isOnline) {
         return var4.name.compareTo(var3.name);
      } else {
         return var4.isOnline ? 1 : -1;
      }
   }
}
