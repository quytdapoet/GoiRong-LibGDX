package gro;

import java.util.Vector;

public final class vdtt_bo extends vdtt_ak {
   private vdtt_hp a;
   private byte b;
   private vdtt_hm c;
   private int d;
   private vdtt_hi M;
   private boolean N;

   public vdtt_bo(vdtt_hm var1, MainScreen var2, byte var3, boolean var4) {
      this.H = var2;
      this.c = var1;
      this.b = 0;
      this.N = true;
      this.a(200, 200);
      this.a = new vdtt_hp((byte)1, 3, 29, this.width - 6, this.height - 62, 35, var1.c.length);
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.j, this.b, this.J);
      this.a(var1, this.a);

      for(int var2 = 0; var2 < this.c.c.length; ++var2) {
         if (var2 == this.a.k) {
            var1.f(7173754);
            var1.c(0, 2 + var2 * this.a.h, this.a.width, this.a.h - 2);
         }

         if (this.b == 2) {
            if (var2 == this.a.l) {
               vdtt_dd.a(vdtt_dd.d, var1, this.c.c[var2], 1 + this.width / 2, 1 + var2 * this.a.h + this.a.h / 2, 2, -1);
            } else {
               vdtt_dd.a(vdtt_dd.d, var1, this.c.c[var2], this.width / 2, var2 * this.a.h + this.a.h / 2, 2, -1);
            }
         } else if (this.b == 0) {
            if (var2 == this.a.l) {
               vdtt_dd.a(vdtt_dd.d, var1, this.c.c[var2], 21, 1 + var2 * this.a.h + this.a.h / 2, 0, -1);
            } else {
               vdtt_dd.a(vdtt_dd.d, var1, this.c.c[var2], 20, var2 * this.a.h + this.a.h / 2, 0, -1);
            }
         }

         var1.f(1585983);
         var1.c(15, var2 * this.a.h + this.a.h, this.a.width - 30, 1);
         var1.f(7173754);
         var1.c(15, var2 * this.a.h + this.a.h + 1, this.a.width - 30, 1);
      }

      this.a(var1);
   }

   public final void a_() {
      this.a.a();
      if (this.d > 0) {
         --this.d;
         if (this.d == 0) {
            this.c.b = this.M.j.k;
            if (this.N) {
               this.H.a(-7, this, this);
               this.H.a(this.c.a, this.c, this);
            }

            this.M = null;
         }
      }

   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (this.d <= 0) {
         try {
            switch(var1.b) {
            case -1001:
               if (var1.j.k >= 0) {
                  this.d = 4;
                  this.M = var1;
                  return;
               }
               break;
            case -1000:
               this.H.a(-7, this, this);
               this.H.a(this.c.a, this.c, this);
               return;
            default:
               super.a(var1, var2, var3);
            }
         } catch (Exception var5) {
         }
      }

   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(new vdtt_hi(-1001, this.a.cx, this.a.cy, this.a.cx + this.a.width, this.a.cy + this.a.height, this.a, this));
      return var1;
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }
}
