package gro;

import java.util.Comparator;

final class vdtt_m implements Comparator {
   public final int compare(Object var1, Object var2) {
      Entity var3 = (Entity)var1;
      Entity var4 = (Entity)var2;
      if (var3 instanceof Mob && ((Mob)var3).id == GameSrc.gI().cy_ && (!(var4 instanceof Mob) || ((Mob)var4).id != GameSrc.gI().cy_)) {
         return -1;
      } else if (var4 instanceof Mob && ((Mob)var4).id == GameSrc.gI().cy_ && (!(var3 instanceof Mob) || ((Mob)var3).id != GameSrc.gI().cy_)) {
         return 1;
      } else {
         int var6 = Utlis.a(Char.gI().cx, Char.gI().cy, var3.cx, var3.cy);
         int var7 = Utlis.a(Char.gI().cx, Char.gI().cy, var4.cx, var4.cy);
         return var6 - var7;
      }
   }
}
