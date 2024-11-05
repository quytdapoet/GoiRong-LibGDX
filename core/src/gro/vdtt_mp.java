package gro;

import java.util.Vector;

public final class vdtt_mp extends vdtt_ap {
   private vdtt_bw a;

   public vdtt_mp(MainScreen var1) {
      this.e = 2;
      this.H = var1;
      this.J = false;
      this.a(220, 125);
      this.a = this.b(10, 40, 170, "", this, 3);
      short var2 = 200;
      this.a.l = var2;
      this.a(Caption.bi, 100);
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.e(var1);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.kw, 10, 28, 0, -1, -16777216);
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

      try {
         switch(var1.b) {
         case 100:
            vdtt_mp var4 = this;

            try {
               Message var5;
               (var5 = Message.c((byte)-93)).writeUTF(var4.a.i());
               var5.send();
               break;
            } catch (Exception var6) {
               DataCenter.gI().currentScreen.c(Caption.kx, -1);
            }
         default:
            return;
         }
      } catch (Exception var7) {
      }

   }
}
