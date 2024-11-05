package gro;

import java.util.Vector;

public final class vdtt_mg extends vdtt_ap {
   private vdtt_by a;
   private Item b;

   public vdtt_mg(MainScreen var1, Item var2) {
      this.e = 2;
      this.H = var1;
      this.b = var2;
      this.J = false;
      this.a(190, 120);
      this.a = this.a(54, 43, 60, "", this, 2);
      boolean var3 = true;
      this.a.R = 1;
      this.a.a("1");
      vdtt_by var4 = this.a;
      int var5 = var2.M() - 1;
      var4.S = var5;
      this.a(this.a);
      this.a(119, 46, "", this, 1001, 58);
      this.a(140, 46, "", this, 1002, 57);
      this.a(161, 46, "", this, 1003, 59);
      vdtt_ay var6;
      (var6 = this.a(Caption.i, 1004)).b(-8);
      var6.setXY(var6.cx - 27, var6.cy);
      (var6 = this.a(Caption.D, -7)).b(-8);
      var6.setXY(var6.cx + 40, var6.cy);
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
      vdtt_dd.b(vdtt_dd.e, var1, Caption.jI, 9, 20, 0, -1, -16777216);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.aM, 9, 55, 0, -10831436, -16777216);
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
         int var4;
         if ((var4 = this.a.h() - 1) <= 0) {
            var4 = 1;
         }

         this.a.a(var4);
         return;
      case 1002:
         this.a.a(this.a.h() + 1);
         return;
      case 1003:
         this.a.a(this.a.S);
         return;
      case 1004:
         this.k();
         vdtt_mg var5 = this;

         try {
            Message var6;
            (var6 = new Message((byte)118)).writeShort(var5.b.index);
            var6.writeInt(var5.a.h());
            var6.send();
            return;
         } catch (Exception var7) {
            Utlis.a(var7);
         }
      default:
      }
   }
}
