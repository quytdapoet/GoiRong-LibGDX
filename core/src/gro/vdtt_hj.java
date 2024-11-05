package gro;

import java.util.Vector;

public final class vdtt_hj {
   public String[] a = new String[2];
   public long b;
   public long c;
   public String[] d;
   public Vector e = new Vector();
   public Vector f = new Vector();

   public final String a() {
      String var1 = "";
      String var2 = "";
      if (this.b >= 0L) {
         var1 = Caption.oO + Utlis.e(this.b);
      }

      if (this.c >= 0L) {
         var2 = Caption.oP + Utlis.e(this.c);
      }

      if (this.b >= 0L && this.c >= 0L) {
         var1 = var1 + " - " + var2;
      } else {
         var1 = var1 + var2;
      }

      return var1;
   }
}
