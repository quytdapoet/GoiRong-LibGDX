package gro;

import java.util.Vector;

public final class vdtt_ji extends vdtt_ap {
   public vdtt_iv[] a = new vdtt_iv[0];
   private vdtt_in b;
   private vdtt_hp c;
   private static int d;

   public vdtt_ji(MainScreen var1) {
      this.H = var1;
      this.a(316, 213);
      this.J = false;
      this.b = new vdtt_in(new vdtt_hm(1001, Caption.zH), this);
      this.w();
      this.f(d);
   }

   public final void w() {
      this.c = new vdtt_hp((byte)1, 4, this.b.i() + 28, super.width - 8, 126, 18, this.a.length);
   }

   private void f(int var1) {
      this.b.a(var1);
      this.x();
   }

   private void x() {
      try {
         Message var1;
         (var1 = new Message((byte)-22)).writeByte(this.b.h());
         var1.writeByte(0);
         var1.send();
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }

   public final void a_() {
      this.b.e();
      this.c.a();
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      this.c(var1, var2);
      switch(var1) {
      case 1002:
         this.w();
      default:
      }
   }

   public final void b(int var1, Object var2) {
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(this.b.f());
      var1.addElement(this.c.a(1003, this));
      return var1;
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.cK, (byte)2, this.J);
      this.b.a(var1);
      this.b(var1, this.c);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.cL, 20, -15, 2, -6488, -10275328);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.ek, 95, -15, 2, -6488, -10275328);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.qd, 170, -15, 2, -6488, -10275328);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.M, 245, -15, 2, -6488, -10275328);
      this.a(var1, this.c);

      for(int var2 = 0; var2 < this.c.i; ++var2) {
         if (this.c.b(var2)) {
            if (var2 == this.c.k) {
               var1.f(13136426);
               var1.c(0, var2 * this.c.h, this.c.width, this.c.h);
            }

            vdtt_iv var3 = this.a[var2];
            vdtt_dd.b(vdtt_dd.d, var1, "" + (var2 + 1), 20, 8 + var2 * this.c.h, 2, -3604601, -16777216);
            vdtt_dd.b(vdtt_dd.d, var1, var3.b, 95, 8 + var2 * this.c.h, 2, -3604601, -16777216);
            vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(var3.e), 170, 8 + var2 * this.c.h, 2, -3604601, -16777216);
            vdtt_dd.b(vdtt_dd.d, var1, var3.g, 245, 8 + var2 * this.c.h, 2, -3604601, -16777216);
         }
      }

      this.a(var1);
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1001:
         if (var1.j.k >= 0) {
            d = var1.j.k;
            this.f(var1.j.k);
            return;
         }
         break;
      case 1003:
         if (var1.j.k >= 0) {
            this.a(this.a[var1.j.k].b, var1.j.k, var2, var3);
         }
      }

   }
}
