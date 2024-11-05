package gro;

import java.util.Vector;

public final class vdtt_lu extends vdtt_ap {
   private vdtt_by a;
   private boolean b;
   private boolean c;
   private int d;

   public vdtt_lu(MainScreen var1, Message var2) {
      try {
         this.b = var2.readBoolean();
         this.c = var2.readBoolean();
         this.d = var2.readInt();
         this.e = 2;
         this.H = var1;
         this.a(240, 160);
         this.a = this.a(62, 80, 150, "", this, 1);
         vdtt_ay var3;
         if (this.b) {
            var3 = this.c(Caption.qA, 1002);
            if (this.c) {
               var3.a(true);
            }
         } else {
            var3 = this.c(Caption.qB, 1003);
         }

         var3.setXY(this.width / 2 - var3.width / 2, var3.cy);
         (var3 = this.b(Caption.qC, 1004)).setXY(var3.cx - 30, var3.cy);
         var3.a(!this.b);
         if (this.c && this.b) {
            String var4 = Caption.qD;
            var3.l = var4;
            var3.a(true);
         }

         (var3 = this.c(Caption.qE, 1005)).setXY(var3.cx + 30, var3.cy);
         var3.a(!this.b);
      } catch (Exception var5) {
      }

   }

   public final void a(int var1, Object var2) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final int f() {
      return 5;
   }

   public final void b(Graphics var1) {
      this.e(var1);
      if (this.d > 0) {
         vdtt_dd.b(vdtt_dd.d, var1, Caption.qG + Utlis.e((long)this.d * 1000L), 12, 21, 20, -2560, -10275328);
      }

      vdtt_dd.b(vdtt_dd.d, var1, Caption.qz, 12, 37, 20, -1, -10275328);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.qH, 12, 53, 20, -1, -10275328);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.qI, 12, 69, 20, -1, -10275328);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.qx, 12, 91, 20, -1, -10275328);
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
         return;
      case 1002:
         DataCenter.gI().currentScreen.a(Caption.qJ, 2012, this);
         return;
      case 1003:
         DataCenter.gI().currentScreen.a(Caption.qK, 2013, this);
         return;
      case 1004:
         this.f(2);
         return;
      case 1005:
         DataCenter.gI().currentScreen.a(Caption.qL, 2015, this);
         return;
      case 2012:
         this.f(0);
         return;
      case 2013:
         this.f(1);
         return;
      case 2015:
         this.f(3);
      default:
      }
   }

   private void f(int var1) {
      try {
         Message var2;
         (var2 = Message.c((byte)-49)).writeByte(var1);
         var2.writeUTF(this.a.i());
         var2.send();
      } catch (Exception var3) {
      }

   }
}
