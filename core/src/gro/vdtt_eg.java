package gro;

import java.util.Vector;

public final class vdtt_eg {
   public Vector a = new Vector();
   public boolean b;

   public final void a(vdtt_ej var1) {
      this.b = true;
      if (this.a.size() > 100) {
         this.a.remove(0);
      }

      this.a.addElement(var1);
   }
}
