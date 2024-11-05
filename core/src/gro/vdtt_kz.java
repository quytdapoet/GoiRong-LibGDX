package gro;

import java.util.Vector;

public final class vdtt_kz extends vdtt_ap {
   private vdtt_bz a;
   private vdtt_mu b;

   public vdtt_kz(MainScreen var1, vdtt_mu var2) {
      this.e = 2;
      this.H = var1;
      this.b = var2;
      this.J = false;
      this.a(180, 137);
      this.a = new vdtt_bz(10, 45, 100, "", this, 0, 2, 0);
      byte var3 = 9;
      this.a.l = var3;
      this.a(this.a);
      this.a(26, this.height - 35, Caption.i, this, 1001, -8);
      this.a(this.width - 86, this.height - 35, Caption.D, this, 1002, -8);
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.e(var1);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.cb, 10, 30, 0, -1, -16777216);
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
         boolean var4;
         if (this.a.h() <= 0) {
            DataCenter.gI().currentScreen.c(Caption.go, -65536);
            var4 = false;
         } else if (this.a.h() > Char.gI().bac) {
            DataCenter.gI().currentScreen.c(Caption.gp, -65536);
            var4 = false;
         } else {
            Char var5 = Char.gI();
            var5.bac -= this.a.h();
            vdtt_mu var6 = this.b;
            var2 = this.a.h();
            var6.P += var2;
            var4 = true;
         }

         if (!var4) {
            break;
         }
      case 1002:
         this.k();
      }

   }
}
