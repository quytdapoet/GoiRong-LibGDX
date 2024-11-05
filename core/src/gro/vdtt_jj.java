package gro;

import java.util.Vector;

public final class vdtt_jj extends vdtt_ap {
   public vdtt_iv[] a = new vdtt_iv[0];
   public vdtt_iv[] b = new vdtt_iv[0];
   private vdtt_in c;
   private vdtt_hp d;
   private vdtt_bd M;
   private static int N;

   public vdtt_jj(MainScreen var1) {
      this.H = var1;
      this.a(316, 213);
      this.J = false;
      this.c = new vdtt_in(new vdtt_hm(1001, Caption.zH), 4, this.f(), super.width - 8, 23, 76, this);
      this.M = this.a(225, this.c.i() + 4, 80, 3, new vdtt_hm(1002, Caption.zI), this, 0);
      this.w();
      this.f(N);
   }

   public final void w() {
      if (this.M.n.b == 0) {
         this.b = this.a;
      } else {
         Vector var1;
         int var2;
         if (this.M.n.b == 1) {
            var1 = new Vector();

            for(var2 = 0; var2 < this.a.length; ++var2) {
               if (this.a[var2].f == 6) {
                  var1.add(this.a[var2]);
               }
            }

            this.b = new vdtt_iv[var1.size()];

            for(var2 = 0; var2 < this.b.length; ++var2) {
               this.b[var2] = (vdtt_iv)var1.get(var2);
            }
         } else if (this.M.n.b == 2) {
            var1 = new Vector();

            for(var2 = 0; var2 < this.a.length; ++var2) {
               if (this.a[var2].f == 7) {
                  var1.add(this.a[var2]);
               }
            }

            this.b = new vdtt_iv[var1.size()];

            for(var2 = 0; var2 < this.b.length; ++var2) {
               this.b[var2] = (vdtt_iv)var1.get(var2);
            }
         }
      }

      this.d = new vdtt_hp((byte)1, 4, this.c.i() + 28, super.width - 8, 126, 18, this.b.length);
   }

   private void f(int var1) {
      this.c.a(var1);
      switch(var1) {
      case 0:
         this.M.d = false;
         break;
      default:
         this.M.d = true;
      }

      this.x();
   }

   private void x() {
      try {
         Message var1;
         (var1 = new Message((byte)-53)).writeByte(this.c.h());
         var1.writeByte(this.M.n.b);
         var1.send();
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }

   public final void a_() {
      this.c.e();
      this.d.a();
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
      (var1 = super.g()).addElement(this.c.f());
      var1.addElement(this.d.a(1003, this));
      return var1;
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.cK, (byte)2, this.J);
      this.c.a(var1);
      this.b(var1, this.d);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.cL, 20, -15, 2, -6488, -10275328);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.cM, 70, -15, 2, -6488, -10275328);
      if (this.c.h() == 0) {
         vdtt_dd.b(vdtt_dd.e, var1, Caption.cN, 130, -15, 2, -6488, -10275328);
      }

      vdtt_dd.b(vdtt_dd.e, var1, Caption.M, 190, -15, 2, -6488, -10275328);
      this.a(var1, this.d);

      for(int var2 = 0; var2 < this.d.i; ++var2) {
         if (this.d.b(var2)) {
            if (var2 == this.d.k) {
               var1.f(13136426);
               var1.c(0, var2 * this.d.h, this.d.width, this.d.h);
            }

            vdtt_iv var3 = this.b[var2];
            vdtt_dd.b(vdtt_dd.d, var1, "" + (var2 + 1), 20, 8 + var2 * this.d.h, 2, -3604601, -16777216);
            vdtt_dd.b(vdtt_dd.d, var1, var3.b, 70, 8 + var2 * this.d.h, 2, -3604601, -16777216);
            if (this.c.h() == 0) {
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(var3.e), 130, 8 + var2 * this.d.h, 2, -3604601, -16777216);
            }

            vdtt_dd.b(vdtt_dd.d, var1, var3.g, 190, 8 + var2 * this.d.h, 2, -3604601, -16777216);
            if (var3.f == 6) {
               vdtt_dd.b(vdtt_dd.d, var1, Caption.cP, 255, 8 + var2 * this.d.h, 2, -3604601, -16777216);
            } else if (var3.f == 7) {
               vdtt_dd.b(vdtt_dd.d, var1, Caption.cQ, 255, 8 + var2 * this.d.h, 2, -3604601, -16777216);
            }
         }
      }

      this.a(var1);
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1001:
         if (var1.j.k >= 0) {
            N = var1.j.k;
            this.f(var1.j.k);
            return;
         }
         break;
      case 1003:
         if (var1.j.k >= 0) {
            this.a(this.b[var1.j.k].b, var1.j.k, var2, var3);
         }
      }

   }
}
