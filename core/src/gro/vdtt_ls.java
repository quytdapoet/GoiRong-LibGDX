package gro;

import java.util.Vector;

public final class vdtt_ls extends vdtt_ap {
   private vdtt_bz a;
   private String b;

   public vdtt_ls(MainScreen var1, String var2) {
      this.b = var2;
      this.e = 2;
      this.H = var1;
      this.J = false;
      this.a(220, 125);
      this.a = new vdtt_bz(85, 50, 100, "", this, 0, 2, 0);
      byte var3 = 12;
      this.a.l = var3;
      this.a(this.a);
      this.a(Caption.bi, 100);
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.e(var1);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.jx, 80, 20, 1, -1, -16777216);
      vdtt_dd.b(vdtt_dd.d, var1, this.b, 85, 20, 0, -1, -16777216);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.ho, 80, 38, 1, -1, -16777216);
      vdtt_dd.b(vdtt_dd.d, var1, "1%", 85, 38, 0, -3089954, -16777216);
      a(var1, 85, 38, "1%", (byte)0);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.jy, 80, 56, 1, -1, -16777216);
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
            vdtt_ls var4 = this;

            try {
               Message var5;
               (var5 = Message.c((byte)-98)).writeUTF(var4.b);
               var5.writeInt(var4.a.h());
               var5.send();
               break;
            } catch (Exception var6) {
               DataCenter.gI().currentScreen.c(Caption.jz, -1);
            }
         default:
            return;
         }
      } catch (Exception var7) {
      }

   }
}
