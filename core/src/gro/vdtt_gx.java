package gro;

import java.util.Comparator;

final class vdtt_gx implements Comparator {
   public final int compare(Object var1, Object var2) {
      ItemOption var3 = (ItemOption)var1;
      ItemOption var4 = (ItemOption)var2;
      return var4.getItemOptionTemplate().text.compareTo(var3.getItemOptionTemplate().text);
   }
}
