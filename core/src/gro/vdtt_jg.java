package gro;

import java.util.Vector;

public final class vdtt_jg extends vdtt_ap {
   public vdtt_mn a;
   private vdtt_by b;

   public vdtt_jg(MainScreen var1, vdtt_mn var2) {
      this.e = 2;
      this.H = var1;
      this.J = false;
      this.a = var2;
      this.a(180, 112);
      this.b = this.a(10, 40, 100, "", this, 0);
      this.a(26, this.height - 35, Caption.i, this, 1001, -8);
      this.a(this.width - 86, this.height - 35, Caption.D, this, 1002, -8);
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.e(var1);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.cJ, 10, 25, 0, -1, -16777216);
   }

   public final void a_() {
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(new vdtt_hi(0, 0, 0, this.width, this.height, this.I, this));
      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1001:
         vdtt_jg var4 = this;

         try {
            if (var4.b.i().trim().length() != 0) {
               GameSrc.gI();
               GameSrc.g(var4.b.i());
            }
            break;
         } catch (Exception var6) {
            Utlis.a(var6);
            return;
         }
      case 1002:
         this.k();
      }

   }
}
