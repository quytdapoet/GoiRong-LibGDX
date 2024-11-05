package gro;

import java.util.Comparator;

final class vdtt_kh implements Comparator {
   final vdtt_kg a;

   vdtt_kh(vdtt_kg var1) {
      this.a = var1;
   }

   public final int compare(Object var1, Object var2) {
      Friend var3 = (Friend)var1;
      Friend var4 = (Friend)var2;
      return vdtt_kg.a(this.a, var3.name) - vdtt_kg.a(this.a, var4.name);
   }
}
