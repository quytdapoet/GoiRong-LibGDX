package gro;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import java.util.Vector;

public class EntityPanel extends XYEntity {
   public short width;
   public short height;
   private int a;
   private String b;
   private boolean c;
   public boolean s;
   public boolean t;
   public boolean u;
   public static Object v = new Object();
   public static Object w = new Object();
   public static Vector x = new Vector();
   public static Vector y = new Vector();
   public static boolean z;
   public static boolean A;
   public static boolean B;

   public static void t() {
      if (!A) {
         a();
      }

      synchronized(v) {
         v.notify();
      }
   }

   private static void a() {
      A = true;
      (new Thread(new vdtt_ad())).start();
      (new Thread(new vdtt_ae())).start();
   }

   public static void a(vdtt_ek var0) {
      mImage var1 = null;

      try {
         if (var0.g && !Binary.e(var0.e)) {
            var1 = null;
         } else {
            var1 = Binary.i(var0.e);
         }

         if (var1 == null) {
            y.add(var0);
            return;
         }

         if (var1.c == DataCenter.gI().r && var1.d == DataCenter.gI().r) {
            label205: {
               vdtt_ea var2;
               if (!var0.e.contains("char") || (var2 = (vdtt_ea)DataCenter.gI().ae.get(var0.a)).d * DataCenter.gI().r == var1.c && var2.e * DataCenter.gI().r == var1.d) {
                  if (!var0.e.contains("client") || (var2 = (vdtt_ea)DataCenter.gI().ad.get(var0.a)).d * DataCenter.gI().r == var1.c && var2.e * DataCenter.gI().r == var1.d) {
                     break label205;
                  }

                  y.add(var0);
                  return;
               }

               y.add(var0);
               return;
            }
         }

         var0.h.put(var0.a, var1);
      } catch (Exception var6) {
         return;
      } finally {
         if (var1 != null) {
            GameSrc.gI().cu.add(var1);
         }

      }

   }

   public static void b(vdtt_ek var0) {
      mImage var1 = null;

      try {
         StringBuilder var2 = (new StringBuilder()).append(DataCenter.gI().URL_SERVER).append(DataCenter.gI().URL_IMG_IOS);
         DataCenter.gI();
         String var3 = var2.append(DataCenter.a(var0.d) + 1).append("/").append(var0.d).toString();
         if (var0.g) {
            var3 = DataCenter.gI().URL_SERVER + DataCenter.gI().URL_IMG_IOS + DataCenter.gI().r + "/" + var0.d;
         }

         byte[] var4;
         if ((var4 = Binary.b(var3)) != null) {
            Binary.a(var0.e, var4);
            if (var0.h.get(var0.a) != null) {
               var1 = Binary.a(Utlis.a(var4));
               var0.h.put(var0.a, var1);
            }

            if (DataCenter.gI().currentScreen.c instanceof vdtt_lk && var0.d.startsWith("mapsmall")) {
               ((vdtt_lk)DataCenter.gI().currentScreen.c).A();
            }

            return;
         }

         return;
      } catch (Exception var8) {
      } finally {
         if (var1 != null) {
            GameSrc.gI().cu.add(var1);
         }

      }

   }

   public void setSize(int var1, int var2) {
      this.width = (short)var1;
      this.height = (short)var2;
   }

   public void a(Graphics var1, int var2, int var3) {
      var1.a(-var1.e, -var1.f);
      var1.a(var2, var3);
   }

   public final void a(Graphics var1, int var2, int var3, int var4, int var5, String var6, byte var7) {
      this.a(var1, var2, var3, var4, var5, var6, (byte)2, false);
      var2 = var1.e;
      var3 = var1.f;
      this.a(var1, var2, var3);
   }

   public final void a(Graphics var1, int var2, int var3, int var4, int var5, String var6, byte var7, boolean var8) {
      int var9 = var5;
      if (this.s) {
         var5 = DataCenter.gI().o;
         if (mConfig.gI().b(29) == 0 && var5 > 240) {
            var5 = 240;
         }
      }

      this.b = var6;
      this.a = var7;
      this.c = var8;
      this.a(var1, var2, var3);

      try {
         if (!this.s) {
            this.a(var1, 0, 0, var4, var5, 61, 3, 4, 1, 1);
         } else {
            this.a(var1, 0, 0, var4, var5, -7304835, 3, 4, 1, 1);
         }

         vdtt_y.a(var1, vdtt_cz.d(643), 0, 0, var4 - 4, 25, 0, 2, 2, (var4 - 4) * DataCenter.gI().r, 25 * DataCenter.gI().r, 20);
         if (var7 == 2) {
            vdtt_dd.a((vdtt_dd)vdtt_dd.f, (Graphics)var1, var6, var4 / 2, 14, 2, -19945, 0);
         } else if (var7 == 0) {
            vdtt_dd.a((vdtt_dd)vdtt_dd.f, (Graphics)var1, var6, 10, 14, 0, -19945, 0);
         }
      } catch (Exception var16) {
         var1.f(-8044263);
         var1.c(0, 0, var4, var5);
         var1.f(-10275328);
         var1.c(1, 1, var4 - 2, var5 - 2);
         var1.f(-4101081);
         var1.c(2, 2, var4 - 4, var5 - 4);
         var1.f(-2200046);
         var1.c(2, 2, var4 - 4, 25);
         var1.f(-199529);
         var1.c(2, 26, var4 - 4, 1);
         if (!var8) {
            vdtt_cz.a(var1, 24, 0, -1, -1, 0);
         }

         var1.f();
      }

      if (this.t) {
         this.a(var1, 7, 32, var4 - 14, var9 - 38, 61, 55, 56);
         if (mConfig.gI().b(29) > 0) {
            this.a(var1, 7, var9, var4 - 14, var5 - var9 - 7, -11, 55, 56);
         }

         if (var5 > 270) {
            var1.c(-2965602);
            this.a(var1, 10, var9 + 3, var4 - 14 - 6, var5 - var9 - 7 - 6, 61, 55, 56);
            var1.f();
            return;
         }
      } else if (this.s) {
         EntityPanel var10;
         Graphics var11;
         byte var12;
         byte var13;
         int var14;
         int var15;
         if (mConfig.gI().b(29) > 0) {
            var10 = this;
            var11 = var1;
            var12 = 7;
            var13 = 32;
            var14 = var4 - 14;
            var15 = DataCenter.gI().o - 39;
         } else {
            var10 = this;
            var11 = var1;
            var12 = 7;
            var13 = 32;
            var14 = var4 - 14;
            var15 = var5 > 200 ? 200 : var5;
         }

         var10.a(var11, var12, var13, var14, var15, 61, 55, 56);
      }

   }

   public final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if (var6 == -11 && var7 == 22 && var8 == 23 && var9 == 1) {
         var1.c(-2965602);
         this.a(var1, var2, var3, var4, var5, 61, 55, 56, var9, 1, 0);
         var1.f();
      } else if (var6 == 61 && var7 == 22 && var8 == 23 && var9 == 1) {
         var1.c(-2965602);
         this.a(var1, var2, var3, var4, var5, 61, 22, 23, 1, 1, 0);
         var1.f();
      } else {
         this.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, 1, 0);
      }

   }

   public final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.b(var1, var2, var3, var4, var5, var6, var7, var8, var8, var9, var10, var11);
   }

   public final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      boolean var13 = false;
      if (var6 == 61) {
         var6 = -11;
         var13 = true;
      }

      var8 = var1.e;
      var9 = var1.f;
      var1.a(var2, var3);
      var2 = vdtt_cz.d(3).c / DataCenter.gI().r;
      if (vdtt_cz.a(4)) {
         var3 = var2;
      } else {
         var3 = vdtt_cz.d(4).c / DataCenter.gI().r;
      }

      if (var6 == 643) {
         vdtt_cz.a(var1, var6, -360, 0, 1, 0, 0, 0, 0, var4 - 0, var5 - 2, 20);
      } else {
         vdtt_y.a(var1, var6, var12, 0, 1, var4 - 0, (int)(var5 - 2));
      }

      vdtt_y.a(var1, 4, 0, 0, 0, var4 - var2 * 2 + var2, (int)var3);
      vdtt_y.a(var1, 4, 180, 0, var5 - var3, var4 - var2 * 2 + var2, (int)var3);
      vdtt_y.a(var1, 4, 90, var4 - var3, var2, var3, (int)(var5 - var2 * 2));
      vdtt_cz.a(var1, 3, -360, var4, 0, 24);
      vdtt_cz.a(var1, 3, 180, var4, var5, 40);
      if (var13) {
         vdtt_y.a(var1, 61, 0, (var4 - var5) / 2 + 5, 5, var5 - 10, (int)(var5 - 10));
      }

      this.a(var1, var8, var9);
   }

   public final void b(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      boolean var13 = false;
      if (var6 == 61) {
         var6 = -11;
         var13 = true;
      }

      int var14 = vdtt_cz.d(var7).c / DataCenter.gI().r;
      int var15;
      if (vdtt_cz.a(var8)) {
         var15 = var14;
      } else {
         var15 = vdtt_cz.d(var8).c / DataCenter.gI().r;
      }

      if (var14 != 0 && var15 != 0) {
         int var16 = var1.e;
         int var17 = var1.f;
         var1.a(var2, var3);
         if (var6 == 643) {
            vdtt_cz.a(var1, var6, -360, var10, var11, 0, 0, 0, 0, var4 - var10 * 2, var5 - var11 * 2, 20);
         } else {
            vdtt_y.a(var1, var6, var12, var10, var11, var4 - var10 * 2, var5 - var11 * 2);
         }

         vdtt_y.a(var1, var8, 0, var14, 0, var4 - var14 * 2, (int)var15);
         vdtt_y.a(var1, var8, 180, var14, var5 - var15, var4 - var14 * 2, (int)var15);
         vdtt_y.a(var1, var9, -90, 0, var14, var15, (int)(var5 - var14 * 2));
         vdtt_y.a(var1, var9, 90, var4 - var15, var14, var15, (int)(var5 - var14 * 2));
         vdtt_cz.a(var1, var7, 0, 0, 0, 20);
         vdtt_cz.a(var1, var7, -360, var4, 0, 24);
         vdtt_cz.a(var1, var7, -180, 0, var5, 36);
         vdtt_cz.a(var1, var7, 180, var4, var5, 40);
         if (var13) {
            var2 = var4 - 10;
            if (var4 > var5) {
               var2 = var5 - 10;
            }

            vdtt_y.a(var1, 61, 0, var4 / 2 - var2 / 2, var5 / 2 - var2 / 2, var2, (int)var2);
         }

         this.a(var1, var16, var17);
      }

   }

   public final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.a(var1, var2, var3, var4, var5, var6, var7, var8, 3, 1);
   }

   public static void a(Graphics var0, int var1, int var2, String var3, byte var4) {
      var1 = var1 + vdtt_dd.b(vdtt_dd.d, var3) + 5;
      switch(var4) {
      case 0:
         vdtt_cz.a(var0, 35, 0, var1, var2 - 8, 0);
         break;
      case 1:
         vdtt_cz.a(var0, 66, 0, var1, var2 - 8, 0);
         break;
      case 2:
      case 3:
         vdtt_cz.a(var0, 25, 0, var1 + 1, var2 - 5, 0);
         break;
      case 4:
      case 5:
         vdtt_cz.a(var0, 234, 0, var1 - 3, var2 - 6, 0);
         break;
      case 6:
         vdtt_cz.a(var0, 377, 0, var1 + 1, var2 - 6, 0);
         break;
      case 7:
         vdtt_cz.a(var0, 36, 0, var1, var2 - 8, 0);
      }

      switch(var4) {
      case 3:
         vdtt_cz.a(var0, 44, 0, var1 + 10, var2, 0);
         return;
      case 5:
         vdtt_cz.a(var0, 44, 0, var1 + 8, var2 - 2, 0);
      default:
      }
   }

   public static void a(Graphics var0, int var1, int var2, Item var3, boolean var4, int var5) {
      a(var0, var1, var2, var3, var4, true, var5, (String)null);
   }

   public static void a(Graphics var0, int var1, int var2, Item var3, boolean var4, String var5) {
      a(var0, var1, var2, var3, var4, true, -1, var5);
   }

   public static void a(Graphics var0, int var1, int var2, Item var3, boolean var4) {
      a(var0, var1, var2, var3, var4, true, -1, (String)null);
   }

   public static void b(Graphics var0, int var1, int var2, Item var3, boolean var4) {
      a(var0, var1, var2, var3, var4, false, -1, (String)null);
   }

   public static void b(Graphics var0, int var1, int var2, Item var3, boolean var4, String var5) {
      a(var0, var1, var2, var3, var4, false, -1, var5);
   }

   private static void a(Graphics var0, int var1, int var2, Item var3, boolean var4, boolean var5, int var6, String var7) {
      vdtt_cz.a(var0, 53, 0, var1, var2, 0);
      if (var6 >= 0 && var3 == null) {
         vdtt_cz.a(var0, var6, 0, var1 + 14, var2 + 14, 3);
      }

      if (var3 == null && var7 != null) {
         String[] var8;
         if ((var8 = Utlis.a(var7, " ")).length > 2) {
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var0, var8[0], var1 + 14, var2 + 7, 2, -1, -10275328);
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var0, var8[1], var1 + 14, var2 + 14, 2, -1, -10275328);
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var0, var8[2], var1 + 14, var2 + 21, 2, -1, -10275328);
         } else if (var8.length > 1) {
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var0, var8[0], var1 + 14, var2 + 10, 2, -1, -10275328);
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var0, var8[1], var1 + 14, var2 + 18, 2, -1, -10275328);
         } else {
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var0, var8[0], var1 + 14, var2 + 14, 2, -1, -10275328);
         }
      }

      int var9 = var0.e;
      var6 = var0.f;
      if (var3 != null) {
         var0.a(-var0.e + var9 + var1 + 14, -var0.f + var6 + var2 + 15);
         var3.a(var0);
      }

      var0.a(-var0.e + var9, -var0.f + var6);
      if (var3 != null) {
         if (var3.M() > 1 || var3.id == 826 && var3.isLock) {
            vdtt_dd.a((BitmapFont)Graphics.b(72), (Graphics)var0, Item.b(var3.M()), var1 + 26, var2 + 23, 1, -1, -10275328);
         }

         if (var3.isLock) {
            vdtt_y.a(var0, 44, 0, var1 + 2, var2 + 2, 6, (int)7);
         }

         if (var3.getItemTemplate().type == 11) {
            vdtt_cz.a(var0, 685, 0, var1 + 9, var2 + 2, 0);
         }
      }

      if (var4) {
         vdtt_cz.a(var0, 40, 0, var1 - 1, var2 - 1, 0);
      }

   }

   public static vdtt_bq a(vdtt_w var0, int var1, int var2, int var3, Mob var4) {
      vdtt_bq var5;
      if ((var5 = new vdtt_bq(var1, var2, var0, var4)).cx > DataCenter.gI().n - var5.width - var0.cx) {
         var5.cx = (short)(DataCenter.gI().n - var5.width - var0.cx);
      }

      if (var5.cx < var1 - 100) {
         var5.cx = (short)(var1 - (var5.width + 200 + 3));
      }

      if (var5.cx < -var0.cx) {
         var5.cx = (short)(-var0.cx);
      }

      if (var5.cy > DataCenter.gI().o - var5.height - var0.cy) {
         var5.cy = (short)(DataCenter.gI().o - var5.height - var0.cy);
      }

      var0.a(var5);
      return var5;
   }

   public static vdtt_bx a(String var0, vdtt_w var1, int var2, int var3, int var4) {
      vdtt_bx var5;
      if ((var5 = new vdtt_bx(var2, var3, var4, var1, var0)).cx > DataCenter.gI().n - var5.width - var1.cx) {
         var5.cx = (short)(DataCenter.gI().n - var5.width - var1.cx);
      }

      if (var5.cx < var2) {
         var5.cx = (short)(var2 - (var5.width + 3));
      }

      if (var5.cx < -var1.cx) {
         var5.cx = (short)(-var1.cx);
      }

      if (var5.cy > DataCenter.gI().o - var5.height - var1.cy) {
         var5.cy = (short)(DataCenter.gI().o - var5.height - var1.cy);
      }

      var1.a(var5);
      return var5;
   }

   public static vdtt_ca a(String var0, String var1, vdtt_w var2, int var3, int var4) {
      vdtt_ca var5 = new vdtt_ca(var3, var4, var2, var0, var1);
      var2.a(var5);
      return var5;
   }

   public static vdtt_cc b(String var0, vdtt_w var1, int var2, int var3, int var4) {
      vdtt_cc var5;
      if ((var5 = new vdtt_cc(var2, var3, var1, var0)).cx > DataCenter.gI().n - var5.width - var1.cx) {
         var5.cx = (short)(DataCenter.gI().n - var5.width - var1.cx);
      }

      if (var5.cx < var2 - var4 / 2) {
         var5.cx = (short)(var2 - (var5.width + var4 + 3));
      }

      if (var5.cx < -var1.cx) {
         var5.cx = (short)(-var1.cx);
      }

      if (var5.cy > DataCenter.gI().o - var5.height - var1.cy) {
         var5.cy = (short)(DataCenter.gI().o - var5.height - var1.cy);
      }

      var1.a(var5);
      return var5;
   }

   public static vdtt_bp a(vdtt_w var0, int var1, int var2, vdtt_hm var3) {
      vdtt_bp var4;
      if ((var4 = new vdtt_bp(var1, var2, var0, var3)).cx > DataCenter.gI().n - var4.width - var0.cx) {
         var4.cx = (short)(DataCenter.gI().n - var4.width - var0.cx);
      }

      if (var4.cx < -var0.cx) {
         var4.cx = (short)(-var0.cx);
      }

      if (var4.cy > DataCenter.gI().o - var4.height - var0.cy) {
         var4.cy = (short)(DataCenter.gI().o - var4.height - var0.cy);
      }

      var0.a(var4);
      return var4;
   }

   public static vdtt_bt a(Skill var0, vdtt_w var1, int var2, int var3, int var4, int var5, Char var6) {
      vdtt_bt var7 = new vdtt_bt(-28, -10, var4, var5, var1, var0, var6);
      var1.a(var7);
      return var7;
   }

   public static vdtt_bm a(vdtt_w var0, vdtt_hi var1, Item var2) {
      return a(var0, var1.e + 2, var1.d, 32, (Item)var2);
   }

   public static vdtt_bm b(vdtt_w var0, vdtt_hi var1, Item var2) {
      return a(var0, var1.e + 3, var1.d, 32, (Item)var2);
   }

   public static vdtt_bm c(vdtt_w var0, vdtt_hi var1, Item var2) {
      return a(var0, var1.e + 4, var1.d, 32, (Item)var2);
   }

   public static vdtt_bm a(vdtt_w var0, int var1, int var2, int var3, Item var4) {
      if (var4 == null) {
         return null;
      } else {
         vdtt_bl var5;
         if ((var5 = new vdtt_bl(var1, var2, 1044, var0, var4)).cx > DataCenter.gI().n - var5.width - var0.cx) {
            var5.cx = (short)(var1 - var3 - 3 - var5.width);
         } else if (var5.cx < var1 - var3 / 2) {
            var5.cx = (short)(var1 - (var5.width + 3));
         }

         if (var5.cx < -var0.cx) {
            var5.cx = (short)(-var0.cx);
         }

         if (var5.cy > DataCenter.gI().o - var5.height - var0.cy) {
            var5.cy = (short)(DataCenter.gI().o - var5.height - var0.cy);
         }

         vdtt_bm var6 = new vdtt_bm(var1 - 32, var2 + 32, var5);
         var0.a(var6);
         return var6;
      }
   }

   public static vdtt_bm a(vdtt_hi var0, vdtt_w var1, Item var2) {
      if (var2 == null) {
         return null;
      } else {
         vdtt_hq var3;
         if ((var3 = (vdtt_hq)var0.j).k >= 0 && var3.k < var3.i * var3.O) {
            var3.e();
            int var4 = var3.k % var3.O;
            int var5 = var3.k / var3.O - (var3.j >= 0 ? var3.j : 0);
            if (var3.n == 0) {
               var4 = var3.k % var3.i - (var3.j >= 0 ? var3.j : 0);
               var5 = var3.k / var3.i;
            }

            var4 = var4 * var3.h + var3.h + var3.cx;
            var5 = var5 * var3.h + var3.cy;
            return a(var1, var4, var5, var3.h, var2);
         } else {
            return null;
         }
      }
   }

   public static vdtt_bm b(vdtt_hi var0, vdtt_w var1, Item var2) {
      if (var2 == null) {
         return null;
      } else {
         vdtt_hq var3;
         if ((var3 = (vdtt_hq)var0.j).k >= 0) {
            var3.e();
            int var4 = var3.k % var3.O;
            int var5 = var3.k / var3.O - (var3.j >= 0 ? var3.j : 0);
            if (var3.n == 0) {
               var4 = var3.k % var3.i - (var3.j >= 0 ? var3.j : 0);
               var5 = var3.k / var3.i;
            }

            var4 = var4 * var3.h + var3.h + var3.cx;
            var5 = var5 * var3.h + var3.cy;
            return a(var1, var4, var5, var3.h, var2);
         } else {
            return null;
         }
      }
   }

   public static void a(Message var0) {
      try {
         if (DataCenter.q()) {
            return;
         }

         Binary.a("arr_full", true);
         DataCenter.gI().a(false);
         DataCenter.aT = 1;
         Caption.a();
         SettingsTab.L();
         GameSrc.gI();
         DataCenter.gI().aQ = false;
         GameSrc.gI().z();

         try {
            if (var0.reader.dis.readBoolean()) {
               z = true;
               B = true;
               Binary.j("arr_check_0" + vdtt_y.a());
               Binary.j("arr_check_1" + vdtt_y.a());
               Binary.j("arr_check_2" + vdtt_y.a());
               Binary.j("arr_check_3" + vdtt_y.a());
               Binary.j("arr_check_4" + vdtt_y.a());
               Binary.j("arr_check_5" + vdtt_y.a());
               (new Thread(new vdtt_af())).start();
            }
         } catch (Exception var2) {
            return;
         }
      } catch (Exception var3) {
      }

   }

   static {
      a();
   }
}
