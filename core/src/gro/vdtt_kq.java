package gro;

import java.util.Vector;

public final class vdtt_kq extends vdtt_ap {
   public Item[] a;
   private vdtt_hq b;
   private vdtt_ay c;
   private vdtt_ay d;
   private int M = -1;
   private int N = 0;
   private int O;
   private int P = -1;
   private long Q;

   public vdtt_kq(MainScreen var1, Message var2) {
      try {
         this.H = var1;
         this.a(208, 200);
         this.J = false;
         this.c = this.c(Caption.pJ, 100);
         this.d = this.b(Caption.fG, 101);
         this.d.a(true);
         this.a = new Item[var2.readShort()];

         for(int var3 = 0; var3 < this.a.length; ++var3) {
            Item var4;
            (var4 = new Item()).a(var2);
            var4.index = var3;
            this.a[var4.index] = var4;
         }

         this.b = new vdtt_hq((byte)1, 9, this.f() + 5, 192, 128, 32, 6, 4);
      } catch (Exception var5) {
      }

   }

   public final void b(int var1, int var2) {
      this.M = var1;
      this.N = var2;
      this.c.a(true);
      this.d.a(false);
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.fM, (byte)2, this.J);
      this.a(var1, this.b);
      int var2 = 0;
      boolean var3 = false;

      for(int var4 = 0; var4 < this.b.O; ++var4) {
         for(int var5 = 0; var5 < this.b.i; ++var5) {
            if (var2 < this.a.length) {
               a(var1, var5 * this.b.h, var4 * this.b.h, this.a[var2], var4 * this.b.i + var5 == this.b.k, 0);
            } else {
               a(var1, var5 * this.b.h, var4 * this.b.h, (Item)null, var4 * this.b.i + var5 == this.b.k, 0);
            }

            if (!var3 && this.a[var2].id == this.M && this.a[var2].M() == this.N && DataCenter.gI().h % 10 > 5) {
               var3 = true;
               var1.f(-2560);
               var1.b(var5 * this.b.h, var4 * this.b.h, 28, 28);
            }

            ++var2;
         }
      }

      this.a(var1);
      if (this.O > 0) {
         if (this.P == -1) {
            this.P = this.a[0].getItemTemplate().idIcon;
         }

         this.P = this.a[Utlis.a(this.a.length)].getItemTemplate().idIcon;
         this.a(var1, this.width / 2 - 40, this.height / 2 - 40, 80, 80, -11, 22, 23, 1, 1);
         a(var1, this.width / 2 - 16, this.height / 2 - 16, (Item)null, false, this.P);
      }

   }

   public final void a_() {
      if (this.O > 0 && (System.currentTimeMillis() - this.Q) / 1000L > (long)this.O) {
         this.O = 0;

         try {
            Message.c((byte)-85).send();
            return;
         } catch (Exception var2) {
         }
      }

   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (this.O <= 0) {
         switch(var1.b) {
         case 100:
            this.Q = System.currentTimeMillis();
            this.O = Utlis.a(2, 4);
            break;
         case 101:
            this.M = -1;
            this.N = 0;
            this.c.a(false);
            this.d.a(true);
            break;
         case 5001:
            int var4 = var1.j.k;
            vdtt_hp var5 = var1.j;
            this.b.k = -1;
            var5.k = var4;
            if (var1.j.k >= 0) {
               Item var6 = this.a[var1.j.k];
               vdtt_bm var7;
               vdtt_hq var8;
               if (var6 != null && (var8 = (vdtt_hq)var1.j).k >= 0 && var8.k < var8.i * var8.O) {
                  var8.e();
                  var2 = var8.k % var8.i;
                  int var9 = var8.k / var8.i - (var8.j >= 0 ? var8.j : 0);
                  if (var8.n == 0) {
                     var2 = var8.k % var8.i - (var8.j >= 0 ? var8.j : 0);
                     var9 = var8.k / var8.i;
                  }

                  var2 = var2 * var8.h + var8.h + var8.cx;
                  var9 = var9 * var8.h + var8.cy;
                  var7 = EntityPanel.a(this, var2, var9, var8.h, (Item)var6);
               } else {
                  var7 = null;
               }

               this.k = var7;
               return;
            }
         }
      }

   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(this.b.a(5001, this));
      return var1;
   }
}
