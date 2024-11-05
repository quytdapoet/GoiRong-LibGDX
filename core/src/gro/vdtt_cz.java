package gro;

import java.util.Hashtable;
import java.util.Vector;

public final class vdtt_cz {
   public static mImage a = Binary.a(1, 1);
   public static Hashtable b = new Hashtable();
   public static Hashtable c = new Hashtable();
   public static Hashtable d = new Hashtable();
   public static Hashtable e = new Hashtable();
   public static Hashtable f = new Hashtable();
   public static Hashtable g = new Hashtable();
   public static Vector h = new Vector();
   private static Hashtable i = new Hashtable();

   public static boolean a(int var0) {
      return var0 <= -2;
   }

   public static mImage b(int var0) {
      mImage var1;
      if ((var1 = (mImage)g.get((short)var0)) == null) {
         a(var0, "char", g, true);
         var1 = a;
      }

      return var1;
   }

   public static mImage c(int var0) {
      short var1 = (short)var0;
      mImage var2;
      if ((var2 = (mImage)i.get(var1)) == null && (var2 = Binary.i("client_icon_" + var1)) != null) {
         i.put(var1, var2);
      }

      return var2;
   }

   public static void a() {
      vdtt_y.a(i);
   }

   public static mImage d(int var0) {
      mImage var1;
      if ((var1 = (mImage)e.get((short)var0)) == null) {
         Hashtable var2 = e;
         String var3 = "client";
         a(var0, var3, var2, false);
         var1 = a;
      }

      return var1;
   }

   public static short[] a(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
      if (var1 == 713) {
         if (DataCenter.gI().h % 24 < 12) {
            vdtt_y.a(var0, var1, var2, var3 + 4, var4 + 4, 100, (byte)3);
         } else {
            vdtt_y.a(var0, 454, var2, var3 + 4, var4 + 4, 100, (byte)3);
         }

         return new short[]{0, 0};
      } else if (a(var1)) {
         var0.a(var0, var1, var2, var3, var4, 20 * DataCenter.gI().r, 20 * DataCenter.gI().r);
         return new short[]{20, 20};
      } else {
         return a(var0, var1, var2, var3, var4, 0, 0, var5, "client", e, (byte)0, b, DataCenter.gI().ab);
      }
   }

   public static short[] a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         Short var8 = (short) var1;
         mImage var9;
         if ((var9 = (mImage)f.get(var8)) != null) {
            var0.a(var9, 0, 0, var9.c, var9.d, var2, var3 - var5 / 2, var4 - var6, var5 * DataCenter.gI().r, var6 * DataCenter.gI().r, 20);
         } else {
            Hashtable var11 = f;
            String var12 = "tree";
            a(var1, var12, var11, false);
         }

         return new short[]{(short)var9.c, (short)var9.d};
      } catch (Exception var13) {
         return new short[]{0, 0};
      }
   }

   public static short[] b(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
      if (var1 == 981) {
         var1 += DataCenter.gI().h / 5 % 6;
         if (GameSrc.gI().mapID >= 49 && GameSrc.gI().mapID <= 50 && var4 < 350) {
            return new short[]{0, 0};
         }
      }

      if (var1 >= 6677 && var1 <= 6686) {
         var1 = 6677 + DataCenter.gI().h / 3 % 10;
         return a(var0, var1, var2, var3, var4, 0, 0, var5, "char", g, (byte)2, d, DataCenter.gI().ac);
      } else {
         if (var1 >= 8918 && var1 <= 8923) {
            var1 = 8918;
         } else if (var1 >= 8930 && var1 <= 8934) {
            if ((var1 = DataCenter.gI().h / 4 % 100) > 4) {
               return new short[]{0, 0};
            }

            var1 += 8930;
            return a(var0, var1, var2, var3, var4, 0, 0, var5, "char", g, (byte)2, d, DataCenter.gI().ac);
         }

         return a(var0, var1, var2, var3, var4, 0, 0, var5, "char", g, (byte)2, d, DataCenter.gI().ac);
      }
   }

   private static short[] a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, String var8, Hashtable var9, byte var10, Hashtable var11, Hashtable var12) {
      try {
         Short var13 = (short) var1;
         mImage var14;
         if ((var14 = (mImage)var9.get(var13)) == null) {
            a(var1, var8, var9, false);
         }

         if (var0 != null && var14 != null && (var14.c > 1 || var14.d > 1)) {
            byte var16 = -1;
            switch(var8.hashCode()) {
            case -1357712437:
               if (var8.equals("client")) {
                  var16 = 2;
               }
               break;
            case 3052374:
               if (var8.equals("char")) {
                  var16 = 1;
               }
               break;
            case 3568542:
               if (var8.equals("tree")) {
                  var16 = 0;
               }
            }

            switch(var16) {
            case 0:
               var0.a(var14, 0, 0, var14.c, var14.d, var2, var3, var4, 20);
               break;
            case 1:
               vdtt_ea var17;
               if ((var17 = (vdtt_ea)var12.get(var13)) == null) {
                  var17 = (vdtt_ea)DataCenter.gI().ae.get(var13);
               }

               var5 = var17.d * DataCenter.gI().r;
               var1 = var17.e * DataCenter.gI().r;
               if (var0.k && var2 < 0) {
                  var0.a(var14, 0, 0, var14.c, var14.d, var2, var3, var4, var5, var1, 0, 0, var7);
                  break;
               }

               var0.a(var14, 0, 0, var14.c, var14.d, var2, var3, var4, var5, var1, var7);
               break;
            case 2:
               boolean var18 = true;
               var0.l = var18;
               var0.a(var14, 0, 0, var14.c, var14.d, var2, var3, var4, var7);
               var18 = false;
               var0.l = var18;
            }

            return new short[]{(short)var14.c, (short)var14.d};
         }
      } catch (Exception var19) {
      }

      return new short[]{0, 0};
   }

   public static short[] a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      Hashtable var8 = e;
      Hashtable var9 = b;
      Hashtable var10 = DataCenter.gI().ab;
      boolean var12 = false;
      String var14 = "client";
      return a(var0, var1, var2, var3, var4, var5, 1.0F, var6, var14, var8, (byte)0, var9, var10);
   }

   public static short[] a(Graphics var0, int var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      return a(var0, var1, var2, var3, var4, var5, var6, var7, "char", g, (byte)2, d, DataCenter.gI().ac);
   }

   public static short[] a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (a(var1)) {
         var0.a(var0, var1, 0, var3, var4, var5, var6);
         return new short[]{20, 20};
      } else {
         return a(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, "client", e, (byte)0, b, DataCenter.gI().ab);
      }
   }

   public static short[] b(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (a(var1)) {
         var0.a(var0, var1, 0, var3, var4, var5, var6);
         return new short[]{20, 20};
      } else {
         DataCenter.gI();
         var7 = var7 * DataCenter.j() / DataCenter.gI().r;
         DataCenter.gI();
         var8 = var8 * DataCenter.j() / DataCenter.gI().r;
         return a(var0, var1, 0, var3, var4, var5, var6, var7, var8, 20, 20, 0, "char", g, (byte)2, d, DataCenter.gI().ac);
      }
   }

   private static short[] a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, String var12, Hashtable var13, byte var14, Hashtable var15, Hashtable var16) {
      try {
         Short var17 = (short) var1;
         Object var18;
         if ((var18 = var13.get(var17)) != null) {
            mImage var19 = (mImage)var18;
            if (var1 > 0) {
               Graphics var20;
               mImage var21;
               int var22;
               int var23;
               int var24;
               int var25;
               label53: {
                  if (var1 != 101 && var1 != 102) {
                     var1 = DataCenter.gI().r;
                     if (var12.equals("char")) {
                        DataCenter.gI();
                        var1 = DataCenter.j();
                     }

                     var20 = var0;
                     var21 = var19;
                     var22 = var7;
                     var23 = var8;
                     var24 = var9 == 0 ? var19.c / var1 : var9;
                     if (var10 == 0) {
                        var25 = var19.d / var1;
                        break label53;
                     }
                  } else {
                     var20 = var0;
                     var21 = var19;
                     var22 = var7;
                     var23 = var8;
                     var24 = var9;
                  }

                  var25 = var10;
               }

               vdtt_y.a(var20, var21, var22, var23, var24, var25, 0, 0, var2, var3, var4, var5, var6, var11, var12.equals("char"));
            }

            return new short[]{(short)var19.c, (short)var19.d};
         }

         a(var1, var12, var13, false);
      } catch (Exception var26) {
      }

      return new short[]{0, 0};
   }

   private static short[] a(Graphics var0, int var1, int var2, int var3, int var4, int var5, float var6, int var7, String var8, Hashtable var9, byte var10, Hashtable var11, Hashtable var12) {
      try {
         Short var13 = (short) var1;
         Object var14;
         if ((var14 = var9.get(var13)) != null) {
            mImage var15 = (mImage)var14;
            if (var1 > 0) {
               boolean var16 = true;
               var0.k = var16;
               var1 = DataCenter.gI().r;
               if (var8.equals("char")) {
                  DataCenter.gI();
                  var1 = DataCenter.j();
               }

               vdtt_y.a(var0, var15, 0, 0, var15.c / var1, var15.d / var1, 0, 0, var2, var3, var4, (int)((float)(var15.c * var5 / 100) * var6), (int)((float)(var15.d * var5 / 100) * var6), var7, var8.equals("char"));
               var16 = false;
               var0.k = var16;
            }

            return new short[]{(short)var15.c, (short)var15.d};
         }

         a(var1, var8, var9, false);
      } catch (Exception var17) {
      }

      return new short[]{0, 0};
   }

   private static void a(int var0, String var1, Hashtable var2, boolean var3) {
      mImage var4 = a;
      var2.put((short) var0, var4);
      if (!mConfig.gI().a(19) || !(DataCenter.gI().currentScreen instanceof GameSrc) || !var1.toLowerCase().contains("char") && !var1.toLowerCase().contains("tree")) {
         if (var0 > 0) {
            vdtt_ek var5;
            (var5 = new vdtt_ek()).h = var2;
            var5.g = var3;
            var5.a = (short)var0;
            var5.d = "icon" + var1.substring(0, 1).toUpperCase() + var1.substring(1, var1.length()) + "/" + var0 + ".png";
            if (var1.toLowerCase().contains("tree")) {
               var5.e = var1 + "_" + var0;
            } else {
               var5.e = var1 + "_icon_" + var0;
            }

            EntityPanel.x.add(var5);
         }

         EntityPanel.t();
      }

   }

   public static void b() {
      vdtt_y.a(b);
      vdtt_y.a(e);
      vdtt_y.a(d);
      vdtt_y.a(g);
      c();
   }

   public static void c() {
      vdtt_y.a(c);
      vdtt_y.a(f);
   }

   public static int a(mImage var0) {
      return var0 == null ? 0 : var0.c / DataCenter.gI().r;
   }

   public static int b(mImage var0) {
      return var0 == null ? 0 : var0.d / DataCenter.gI().r;
   }

   public static void b(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 == 14) {
         a(var0, 46, 0, 1, var4 + 1, (var5 - 2) * DataCenter.gI().r, (var6 - 2) * DataCenter.gI().r, 0, 0, 0, 0, 20);
      }

      var3 = 0;
      mImage var7;
      if ((var7 = d(var1)) != null) {
         var3 = var7.c / DataCenter.gI().r;
      }

      vdtt_y.a(var0, var2, 0, 0 + var3, var4, var5 - var3 * 2, (int)var6);
      if (var1 != var2) {
         a(var0, var1, 0, 0, var4, 20);
         a(var0, var1, -360, 0 + var5, var4, 24);
      }

   }

   public static void c(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      var1 = 0;
      mImage var7;
      if ((var7 = d(47)) != null) {
         var1 = var7.c / DataCenter.gI().r;
      }

      vdtt_y.a(var0, 48, 0, var3 + var1, -1, var5 - var1, (int)29);
      a(var0, 47, 0, var3, -1, 20);
   }

   public static void d(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (d(47) != null) {
         DataCenter.gI();
      }

      vdtt_y.a(var0, 48, 0, var3, -1, var5, (int)29);
   }

   public static void e(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      var1 = 0;
      mImage var7;
      if ((var7 = d(47)) != null) {
         var1 = var7.c / DataCenter.gI().r;
      }

      vdtt_y.a(var0, 48, 0, var3, -1, var5 - var1, (int)29);
      a(var0, 47, -360, var3 + var5, -1, 24);
   }

   public static void a(Graphics var0, int var1, int var2, int var3, int var4) {
      vdtt_y.a(var0, -13, 0, var1, var2, var3, (int)var4);
   }

   public static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      var5 = var0.e;
      var6 = var0.f;
      var0.a(var1, var2);
      var1 = d(22).c / DataCenter.gI().r;
      if (a(23)) {
         var2 = var1;
      } else {
         var2 = d(23).c / DataCenter.gI().r;
      }

      vdtt_y.a(var0, -8492991, 90, 1, 1, var3 - 2, (int)(var4 - 2));
      vdtt_y.a(var0, 23, 0, var1, 0, var3 - var1 * 2, (int)var2);
      vdtt_y.a(var0, 23, 180, var1, var4 - var2, var3 - var1 * 2, (int)var2);
      vdtt_y.a(var0, 23, -90, 0, var1, var2, (int)(var4 - var1 * 2));
      vdtt_y.a(var0, 23, 90, var3 - var2, var1, var2, (int)(var4 - var1 * 2));
      a(var0, 22, 0, 0, 0, 20);
      a(var0, 22, -360, var3, 0, 24);
      a(var0, 22, -180, 0, var4, 36);
      a(var0, 22, 180, var3, var4, 40);
      var0.a(-var0.e, -var0.f);
      var0.a(var5, var6);
   }

   public static int[] c(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      return b(var0, var1, var2, var3, var4, var5, 0, 0, 0, 0, 0, 20, "char", g, (byte)2, d, DataCenter.gI().ac);
   }

   private static int[] b(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, String var12, Hashtable var13, byte var14, Hashtable var15, Hashtable var16) {
      try {
         Short var17 = (short) var1;
         Object var18;
         if ((var18 = var13.get(var17)) != null) {
            mImage var19 = (mImage)var18;
            int var20 = var9 == 0 ? var19.c : var9;
            int var21 = var10 == 0 ? var19.d : var10;
            int var22 = var19.d;
            DataCenter.gI();
            return var0.b(var19, var7, var8, var20, var21, var2, var3, var4, var5, var22 / DataCenter.j() * DataCenter.gI().r, var11);
         }

         a(var1, var12, var13, true);
      } catch (Exception var23) {
      }

      return null;
   }
}
