package gro;

import java.util.Vector;

public final class vdtt_mt extends vdtt_ap {
   public vdtt_iv[] a = new vdtt_iv[0];
   private vdtt_in b;
   private vdtt_hp c;
   private vdtt_bd d;

   public vdtt_mt(MainScreen var1) {
      this.H = var1;
      this.a(316, 213);
      this.J = false;
      if (GameSrc.gI().getMapTemplate().type == 16) {
         this.b = new vdtt_in(new vdtt_hm(1001, Caption.AO), 3, this.f(), super.width - 8 + 2, 23, 60, this);
      } else {
         this.b = new vdtt_in(new vdtt_hm(1001, Caption.zS), 3, this.f(), super.width - 8 + 2, 23, 60, this);
      }

      this.d = this.a(173, this.b.i() + 4, 80, Caption.yk.length, new vdtt_hm(1002, Caption.yk), this, 0);
      this.w();
      this.f(0);
   }

   public final void w() {
      this.c = new vdtt_hp((byte)1, 4, this.b.i() + 28, super.width - 8, 126, 18, this.a.length);
   }

   private void f(int var1) {
      this.a = new vdtt_iv[0];
      this.w();
      this.b.a(var1);
      switch(var1) {
      case 0:
         this.d.d = false;
         break;
      default:
         this.d.d = true;
      }

      this.d.d = true;
      this.x();
      if (var1 > 3) {
         this.b.a.a(this.b.b.c.length);
      } else {
         this.b.a.a(0);
      }

   }

   private void x() {
      try {
         Message var1;
         (var1 = new Message((byte)-22)).writeByte(this.b.h());
         var1.writeByte(this.d.n.b);
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
         this.x();
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
      this.a(var1, 0, -28, this.c.width, 28, -11, 55, 56);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.cL, 20, -15, 2, -6488, -10275328);
      int var2;
      vdtt_iv var3;
      if (this.b.h() == 5) {
         vdtt_dd.b(vdtt_dd.e, var1, Caption.cM, 70, -15, 2, -6488, -10275328);
         vdtt_dd.b(vdtt_dd.e, var1, Caption.kC, 130, -15, 2, -6488, -10275328);
         vdtt_dd.b(vdtt_dd.e, var1, Caption.ej, 204, -15, 2, -6488, -10275328);
         vdtt_dd.b(vdtt_dd.e, var1, Caption.ek, 274, -15, 2, -6488, -10275328);
         this.a(var1, this.c);

         for(var2 = 0; var2 < this.c.i; ++var2) {
            if (this.c.b(var2)) {
               var3 = this.a[var2];
               vdtt_dd.b(vdtt_dd.d, var1, "" + (var2 + 1), 20, 8 + var2 * this.c.h, 2, -3604601, -16777216);
               vdtt_dd.b(vdtt_dd.d, var1, var3.g, 70, 8 + var2 * this.c.h, 2, -3604601, -16777216);
               vdtt_dd.b(vdtt_dd.d, var1, var3.a(), 130, 8 + var2 * this.c.h, 2, -3604601, -16777216);
               vdtt_dd.b(vdtt_dd.d, var1, var3.e + "/" + var3.f, 208, 8 + var2 * this.c.h, 2, -3604601, -16777216);
               vdtt_dd.b(vdtt_dd.d, var1, var3.b, 274, 8 + var2 * this.c.h, 2, -3604601, -16777216);
            }
         }

         this.a(var1);
         this.c.a(var1, this);
      } else {
         vdtt_dd.b(vdtt_dd.e, var1, Caption.kD, 70, -15, 2, -6488, -10275328);
         vdtt_dd.b(vdtt_dd.e, var1, Caption.kE, 130, -15, 2, -6488, -10275328);
         vdtt_dd.b(vdtt_dd.e, var1, Caption.kJ, 204, -15, 2, -6488, -10275328);
         vdtt_dd.b(vdtt_dd.e, var1, Caption.kK, 274, -15, 2, -6488, -10275328);
         this.a(var1, this.c);

         for(var2 = 0; var2 < this.c.i; ++var2) {
            if (this.c.b(var2)) {
               var3 = this.a[var2];
               vdtt_dd.b(vdtt_dd.d, var1, "" + (var2 + 1), 20, 8 + var2 * this.c.h, 2, -3604601, -16777216);
               vdtt_dd.b(vdtt_dd.d, var1, var3.b, 70, 8 + var2 * this.c.h, 2, -3604601, -16777216);
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(var3.e), 130, 8 + var2 * this.c.h, 2, -3604601, -16777216);
               int var4 = 8 + var2 * this.c.h;
               vdtt_dd.b(vdtt_dd.d, var1, DataCenter.gI().dataNameChar[var3.f].name, 208, var4, 2, -3604601, -16777216);
               vdtt_dd.b(vdtt_dd.d, var1, var3.g, 274, 8 + var2 * this.c.h, 2, -3604601, -16777216);
            }
         }

         this.a(var1);
         this.c.a(var1, this);
      }

   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1001:
         if (var1.j.k >= 0) {
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
