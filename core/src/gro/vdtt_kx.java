package gro;

import java.util.Vector;

public final class vdtt_kx extends vdtt_ap {
   private vdtt_hl b;
   public int a;

   public vdtt_kx(MainScreen var1, int var2) {
      this.e = 2;
      this.H = var1;
      this.a(186, 180);
      this.setXY(this.cx, this.cy + 20);
      this.b = new vdtt_hl(1000, var2);
      this.a(20, 25, Caption.vu, this, this.b);
      this.a(20, 45, Caption.vv, this, this.b);
      this.a(20, 65, Caption.vw, this, this.b);
      this.a(20, 85, Caption.vy, this, this.b);
      this.a(20, 105, Caption.xY, this, this.b);
      this.a(20, 125, Caption.xZ, this, this.b);
      this.j();
      this.a(Caption.l, 1007);
   }

   public final void a(int var1, Object var2) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      try {
         switch(var1) {
         case 1000:
            this.w();
         }
      } catch (Exception var5) {
      }

   }

   public final void b(Graphics var1) {
      this.e(var1);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.vx, 20, 12, 0, -1, -16777216);
   }

   public final void a_() {
   }

   public final Vector g() {
      if (this.I != null) {
         this.I.width = 0;
      }

      Vector var1;
      (var1 = super.g()).addElement(new vdtt_hi(0, 0, 0, this.width, this.height, this.I, this));
      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1006:
         this.w();
      default:
         return;
      case 1007:
         this.k();
      }
   }

   private void w() {
      try {
         int var1 = this.b.b;
         Message var2;
         (var2 = Message.c((byte)-58)).writeByte(var1);
         var2.send();
      } catch (Exception var3) {
      }

      this.k();
   }
}
