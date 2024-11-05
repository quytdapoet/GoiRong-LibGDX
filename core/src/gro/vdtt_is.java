package gro;

import java.util.Comparator;

final class vdtt_is implements Comparator {
   public final int compare(Object var1, Object var2) {
      vdtt_ir var3 = (vdtt_ir)var1;
      vdtt_ir var4 = (vdtt_ir)var2;
      return var3.b.compareTo(var4.b);
   }
}
