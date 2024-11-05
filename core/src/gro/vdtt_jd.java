package gro;

import java.util.Comparator;

final class vdtt_jd implements Comparator {
   public final int compare(Object var1, Object var2) {
      String[] var3 = (String[])var1;
      String[] var4 = (String[])var2;
      return var3[0].compareTo(var4[0]);
   }
}
