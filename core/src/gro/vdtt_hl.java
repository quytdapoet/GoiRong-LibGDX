package gro;

import java.util.Vector;

public final class vdtt_hl {
   public int a;
   public int b;
   public Vector c = new Vector();

   public vdtt_hl(int var1) {
      this.a = var1;
   }

   public vdtt_hl(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public final int a() {
      for(int var1 = 0; var1 < this.c.size(); ++var1) {
         if (((vdtt_bs)this.c.elementAt(var1)).l) {
            return var1;
         }
      }

      return -1;
   }
}
