package gro;

import java.util.Vector;

public final class vdtt_lq extends vdtt_ap {
   private vdtt_hp[][] a = new vdtt_hp[3][];
   private vdtt_ay[] b = new vdtt_ay[3];
   private Item[] c = new Item[9];
   private int d = -1;

   public vdtt_lq(MainScreen var1, Message var2) {
      this.H = var1;
      this.e = 2;
      this.a(279, 200);
      this.a(this.width - 50, this.height - 23, "", this, 1000, 671);
      this.I = new vdtt_hs((byte)0, 0, 0, this.width, this.height, 1, 1);
      this.I.M = this;

      int var3;
      for(var3 = 0; var3 < this.a.length; ++var3) {
         this.a[var3] = new vdtt_hp[3];
         int var4 = 50 * var3 + 55;
         this.b[var3] = this.a(122, var4 + 4, Caption.lh, this, 2002, 7);
         this.b[var3].a(true);
         vdtt_ay var5 = this.b[var3];
         String var6 = Caption.fb;
         var5.l = var6;
         if (GameSrc.gI().mocNap >= 4000 || var3 == 1 && GameSrc.gI().mocNap >= 2000 || var3 == 0 && GameSrc.gI().mocNap > 0) {
            this.b[var3].H = 9;
            var5 = this.b[var3];
            var6 = Caption.se;
            var5.l = var6;
         }

         this.b[var3].setSize(70, this.b[var3].height);

         for(int var7 = 0; var7 < this.a[var3].length; ++var7) {
            this.a[var3][var7] = new vdtt_hp((byte)1, 20 + var7 * 34, var4, 30, 30, 1, 1);
         }
      }

      try {
         for(var3 = 0; var3 < this.c.length; ++var3) {
            this.c[var3] = new Item();
            this.c[var3].a(var2);
            switch(var3) {
            case 6:
               this.c[var3].level = 8;
               break;
            case 7:
               this.c[var3].level = 12;
               break;
            case 8:
               this.c[var3].level = 14;
            }
         }
      } catch (Exception var8) {
      }

   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      this.d = -1;
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 300:
         this.d = (Integer)var1.k;
         Item var4;
         (var4 = this.c[this.d].a()).level = 0;
         var2 = this.d / 3;
         var3 = this.d % 3;
         this.k = a(this, this.a[var2][var3].cx + 32, this.a[var2][var3].cy, 30, var4);
         return;
      case 1000:
         this.k();
         GameSrc.gI();
         GameSrc.W();
      default:
      }
   }

   public final Vector g() {
      Vector var1 = new Vector();

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         for(int var3 = 0; var3 < this.a[var2].length; ++var3) {
            var1.addElement(this.a[var2][var3].a(300, this, var2 * this.a.length + var3));
         }
      }

      var1.addElement(this.I.a(-9999, this));
      return var1;
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.xA, (byte)2, this.J);

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if (var2 == 0) {
            vdtt_dd.a(vdtt_dd.i, var1, Caption.BX[var2], this.a[var2][0].cx, this.a[var2][0].cy - 12, 0, -1, 4, 0);
         } else if (var2 == 1) {
            vdtt_dd.a(vdtt_dd.i, var1, Caption.BX[var2], this.a[var2][0].cx, this.a[var2][0].cy - 12, 0, -48128, 3, 0);
         } else {
            vdtt_dd.a(vdtt_dd.i, var1, Caption.BX[var2], this.a[var2][0].cx, this.a[var2][0].cy - 12, 0, -16711681, 2, 1);
         }

         for(int var3 = 0; var3 < this.a[var2].length; ++var3) {
            b(var1, this.a[var2][var3].cx, this.a[var2][var3].cy, this.c[var2 * 3 + var3], this.d == 3 * var2 + var3);
         }
      }

   }

   public final void a_() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         for(int var2 = 0; var2 < this.a[var1].length; ++var2) {
            this.a[var1][var2].a();
         }
      }

   }
}
