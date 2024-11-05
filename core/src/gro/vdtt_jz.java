package gro;

import java.util.Vector;

public final class vdtt_jz extends vdtt_ap {
   public static byte[] a;
   private static vdtt_bb[] b;

   public vdtt_jz(int var1, MainScreen var2) {
      this.e = 2;
      this.H = var2;
      this.J = false;
      this.a(240, 196);
      vdtt_ay var3;
      (var3 = this.a(Caption.u, 2001)).setXY(var3.cx, var3.cy - 5);
      b = new vdtt_bb[14];

      for(var1 = 0; var1 < 7; ++var1) {
         switch(var1) {
         case 3:
            b[4 + var1] = this.a(135, 25 + var1 * 18, Caption.zq[var1], 4 + var1);
            b[var1] = this.a(20, 25 + var1 * 18, Caption.zq[4 + var1], var1);
            break;
         case 4:
         case 5:
         case 6:
            b[var1 * 2] = this.a(20, 44 + var1 * 18, Caption.zq[var1 * 2], var1 * 2);
            if (var1 * 2 + 1 != 11 && var1 * 2 + 1 != 13) {
               b[var1 * 2 + 1] = this.a(135, 44 + var1 * 18, Caption.zq[var1 * 2 + 1], var1 * 2 + 1);
            } else {
               b[var1 * 2 + 1] = this.a(135, 44 + (var1 - 1) * 18, Caption.zq[var1 * 2 + 1], var1 * 2 + 1);
            }

            vdtt_bb var4;
            boolean var5;
            if (var1 * 2 + 1 == 9) {
               var4 = b[var1 * 2 + 1];
               var5 = true;
               var4.d = var5;
            } else if (var1 * 2 == 12) {
               var4 = b[var1 * 2];
               var5 = true;
               var4.d = var5;
            }
            break;
         default:
            b[var1] = this.a(20, 25 + var1 * 18, Caption.zq[var1], var1);
            b[4 + var1] = this.a(135, 25 + var1 * 18, Caption.zq[4 + var1], 4 + var1);
         }
      }

      w();
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.e(var1);
      vdtt_dd.a(vdtt_dd.d, var1, Caption.s, 20, 15, 0, -1);
      vdtt_dd.a(vdtt_dd.d, var1, Caption.sO, 20, 105, 0, -1);
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 2001:
         mConfig.gI().a(8, true);
         mConfig.gI().a(16, false);
         mConfig.gI().a(23, false);
         mConfig.gI().a(24, false);
         x();
         A();
      default:
      }
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      if (var1 < 8) {
         vdtt_ba.m[var1] = (byte)(b[var1].m ? var1 : -1);
      } else if (var1 == 8) {
         mConfig.gI().a(8, b[var1].m);
      } else if (var1 == 10) {
         mConfig.gI().a(24, b[var1].m);
      } else if (var1 == 12) {
         mConfig.gI().a(23, b[var1].m);
      } else if (var1 == 9) {
         mConfig.gI().a(16, b[var1].m);
      } else if (var1 == 11) {
         mConfig.gI().a(1, b[var1].m);
         SettingsTab.K().x();
         vdtt_aa.gI().c(b[var1].m);
      } else if (var1 == 13) {
         mConfig.gI().a(0, b[var1].m);
         SettingsTab.K().x();
         vdtt_aa.gI().b(b[var1].m);
      }

      z();
      A();
   }

   public static void w() {
      try {
         x();
         byte[] var0;
         if ((var0 = Binary.d("chanels")) != null && var0.length == vdtt_ba.m.length) {
            for(int var1 = 0; var1 < var0.length; ++var1) {
               vdtt_ba.m[var1] = var0[var1];
            }
         }
      } catch (Exception var2) {
         Utlis.a(var2);
      }

      z();
   }

   private static void x() {
      a = new byte[]{0, 1, 6, 9, 3, 4, 5, 2};
      vdtt_ba.m = new byte[]{0, 1, 2, -1, -1, -1, -1, -1};
      z();
   }

   private static void z() {
      try {
         if (b != null) {
            vdtt_bb var0;
            boolean var1;
            for(int var2 = 0; var2 < vdtt_ba.m.length; ++var2) {
               if (b[var2] != null) {
                  var0 = b[var2];
                  var1 = vdtt_ba.m[var2] >= 0;
                  var0.m = var1;
               }
            }

            var0 = b[8];
            var1 = mConfig.gI().a(8);
            var0.m = var1;
            var0 = b[10];
            var1 = mConfig.gI().a(24);
            var0.m = var1;
            var0 = b[12];
            var1 = mConfig.gI().a(23);
            var0.m = var1;
            var0 = b[9];
            var1 = mConfig.gI().a(16);
            var0.m = var1;
            var0 = b[11];
            var1 = mConfig.gI().a(1);
            var0.m = var1;
            var0 = b[13];
            var1 = mConfig.gI().a(0);
            var0.m = var1;
         }
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }

   private static void A() {
      Binary.a("chanels", vdtt_ba.m);
   }

   public final void a_() {
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(new vdtt_hi(0, 0, 0, this.width, this.height, this.I, this));
      return var1;
   }
}
