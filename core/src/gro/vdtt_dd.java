package gro;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Blending;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

public final class vdtt_dd {
   public byte a = -1;
   public static vdtt_dd b;
   public static vdtt_dd c;
   public static vdtt_dd d;
   public static vdtt_dd e;
   public static vdtt_dd f;
   public static vdtt_dd g;
   public static vdtt_dd h;
   public static vdtt_dd i;
   public static vdtt_dd[] j = new vdtt_dd[7];
   public static vdtt_df[] k = new vdtt_df[15];
   public static vdtt_dd[] l = new vdtt_dd[15];
   public static String m = " 0123456789+-*='\"\\/_?.,ˋˊ~ˀ:;|<>[]{}!@#$%^&()aáàảãạâấầẩẫậăắằẳẵặbcdđeéèẻẽẹêếềểễệfghiíìỉĩịjklmnoóòỏõọôốồổỗộơớờởỡợpqrstuúùủũụưứừửữựvxyýỳỷỹỵzwAÁÀẢÃẠÂẤẦẨẪẬĂẮẰẲẴẶBCDĐEÉÈẺẼẸÊẾỀỂỄỆFGHIÍÌỈĨỊJKLMNOÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢPQRSTUÚÙỦŨỤƯỨỪỬỮỰVXYÝỲỶỸỴZW";
   public Hashtable n = new Hashtable();
   public static Hashtable o = new Hashtable();

   private vdtt_dd(byte var1) {
   }

   private vdtt_df c() {
      if (this.a >= 0 && this.a < k.length) {
         return k[this.a];
      } else {
         return k.length > 0 ? k[0] : k[this.a];
      }
   }

   public static void a() {
      try {
         for(byte var0 = 0; var0 < k.length; ++var0) {
            if (k[var0].a()) {
               l[var0].a = var0;
            } else {
               l[var0].a = -1;
            }
         }
      } catch (Exception var1) {
      }

   }

   public static int a(vdtt_dd var0) {
      return var0.c().c / DataCenter.gI().r;
   }

   public static int a(vdtt_dd var0, String var1) {
      int var2;
      vdtt_df var3;
      if ((var3 = var0.c()).h.get(var1) != null) {
         var2 = (Integer)var3.h.get(var1);
      } else {
         int var4 = Graphics.a(var3.a, var1);
         int var5 = 0 + var4;
         if (var1.length() > 1) {
            var5 -= var3.b;
         }

         if (var3.h.size() > 500) {
            var3.h.clear();
         }

         if (var4 > 0) {
            var3.h.put(var1, var5);
         }

         var2 = var5;
      }

      return var2 / DataCenter.gI().r;
   }

   public static int b(vdtt_dd var0, String var1) {
      return var0.c().b(var1) / DataCenter.gI().r;
   }

   public static int c(vdtt_dd var0, String var1) {
      return var0.c().b(var1) / DataCenter.gI().r;
   }

   public static int a(vdtt_dd var0, String[] var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < var1.length; ++var3) {
         int var4;
         if ((var4 = c(var0, var1[var3])) > var2) {
            var2 = var4;
         }
      }

      return var2;
   }

   public static Vector a(vdtt_dd var0, String var1, int var2) {
      return var0.c().a(var1, var2);
   }

   public static Vector b(vdtt_dd var0, String var1, int var2) {
      return var0.c().b(var1, var2);
   }

   public static String[] c(vdtt_dd var0, String var1, int var2) {
      Vector var3;
      String[] var4 = new String[(var3 = var0.c().b(var1, var2)).size()];
      var3.copyInto(var4);
      return var4;
   }

   public static void a(vdtt_dd var0, Graphics var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      if (!d()) {
         var0.c().a(Graphics.a(var0.a), var6, var7, var1, var2, var3, var4, var5);
      }

   }

   public static void a(vdtt_dd var0, Graphics var1, String var2, int var3, int var4, int var5, int var6) {
      if (!d()) {
         var0.c().a(Graphics.a(var0.a), var6, 0, var1, var2, var3, var4, var5);
      }

   }

   public static void b(vdtt_dd var0, Graphics var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      if (!d()) {
         var0.c().a(Graphics.a(var0.a), var6, var7, var1, var2, var3, var4, var5);
      }

   }

   public static void a(BitmapFont var0, Graphics var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      if (!d()) {
         k[0].a(var0, var6, var7, var1, var2, var3, var4, var5);
      }

   }

   public static void a(vdtt_dd var0, Graphics var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (!d()) {
         a(var0, var1, var2, var3, var4, var5, var6, var7, var8, 0, 1);
      }

   }

   public static void a(vdtt_dd var0, Graphics var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if (!d()) {
         var7 = a(var2, var7, var9);
         BitmapFont var11;
         if ((var11 = Graphics.a(var0.a)) == null) {
            var0.c().a(var6, 0, var1, var2, var3, var4, var5);

            for(int var12 = 0; var12 < var10; ++var12) {
               var0.c().a(var6, -1, 0, var9 == 0 ? var7 - var12 : var7 + var12, var1, var2, var3, var4, var5);
            }
         } else {
            int[] var18 = new int[var10];

            for(var10 = 0; var10 < var18.length; ++var10) {
               if (var9 == 0) {
                  var18[var10] = var7 - var10;
               } else {
                  var18[var10] = var7 + var10;
               }
            }

            String var13 = var0.a + "#" + var2;
            vdtt_de var14 = (vdtt_de)o.get(var13);
            var3 = var3;
            if (var5 == 2) {
               if (var14 == null) {
                  var3 -= b(var0, var2) / 2;
               } else {
                  var3 -= var14.c / 2;
               }
            }

            var5 = 0;

            for(var9 = 0; var9 < var2.length(); ++var9) {
               String var15 = var2.substring(var9, var9 + 1);
               boolean var16 = false;

               for(int var17 = 0; var17 < var18.length; ++var17) {
                  if (var9 == var18[var17]) {
                     var1.a(var0.a, var11, var15, (float)(var3 + var5), (float)(var4 + var8), 0, -1, 0.0F);
                     var16 = true;
                  }
               }

               if (!var16) {
                  var1.a(var0.a, var11, var15, (float)(var3 + var5), (float)var4, 0, var6, 0.0F);
               }

               var5 += b(var0, var15);
            }

            if (var14 == null) {
               var14 = new vdtt_de(var0.a, var13, var5);
            }

            if (o.size() > 500) {
               o.clear();
            }

            o.put(var14.b, var14);
         }
      }

   }

   public static void a(vdtt_dd var0, Graphics var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      if (!d()) {
         boolean var13 = false;
         if (var0.equals(g) || var0.equals(h) || var0.equals(i)) {
            var13 = true;
         }

         var8 = a(var2, 3, var11);
         BitmapFont var14;
         if ((var14 = Graphics.a(var0.a)) == null) {
            var0.c().a(var6, 0, var1, var2, var3, var4, 2);

            for(var12 = 0; var12 < var10; ++var12) {
               var0.c().a(var6, -1, 0, var11 != 0 && var11 != 2 ? var8 + var12 : var8 - var12, var1, var2, var3, var4, 2);
            }
         } else {
            int[] var15 = new int[var10];

            for(var10 = 0; var10 < var15.length; ++var10) {
               if (var11 != 0 && var11 != 2) {
                  var15[var10] = var8 + var10;
               } else {
                  var15[var10] = var8 - var10;
               }
            }

            String var16 = var0.a + "#" + var2;
            vdtt_de var17 = (vdtt_de)o.get(var16);
            if (var17 == null) {
               var3 -= b(var0, var2) / 2;
            } else {
               var3 -= var17.c / 2;
            }

            int var18 = 0;
            if (var13) {
               var1.c((float)var6);
            }

            boolean var19 = false;

            for(int var20 = 0; var20 < var2.length(); ++var20) {
               String var21 = var2.substring(var20, var20 + 1);
               if (!var19) {
                  for(int var22 = 0; var22 < var15.length; ++var22) {
                     if (var20 == var15[var22]) {
                        var19 = true;
                        if (var13) {
                           if (var7 == -1) {
                              var1.p();
                           } else {
                              var1.c((float)var7);
                           }
                        }
                        break;
                     }
                  }
               }

               if (!var19) {
                  var1.a(var0.a, var14, var21, (float)(var3 + var18), (float)var4, 0, var6, 0.0F);
               } else {
                  var1.a(var0.a, var14, var21, (float)(var3 + var18), (float)(var4 + 0), 0, var7, 0.0F);
               }

               if (var19 && (var11 == 0 || var11 == 1)) {
                  var19 = false;
                  if (var13) {
                     var1.c((float)var6);
                  }
               }

               var18 += b(var0, var21);
            }

            if (var13) {
               var1.r();
            }

            if (var17 == null) {
               var17 = new vdtt_de(var0.a, var16, var18);
               if (o.size() > 500) {
                  o.clear();
               }

               o.put(var17.b, var17);
            }
         }
      }

   }

   public static void a(Graphics var0, String var1, int var2, int var3, int var4, int var5) {
      if (!d()) {
         var0.a(0, Graphics.a(0), var1, (float)var2, (float)var3, var4, var5, 0.0F);
      }

   }

   public static int a(vdtt_dd var0, Pixmap var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      if (d()) {
         return 0;
      } else {
         vdtt_df var8 = var0.c();
         byte var10 = 0;
         int var13 = -10275328;
         if (vdtt_df.e(var2)) {
            return -1;
         } else {
            int var16 = 0;
            int var17 = var8.b(var2);
            mImage var18 = var8.b(var17, var6, var13, var2);
            if (var10 == 1) {
               var16 = -var17;
            } else if (var10 == 2) {
               var16 = -var17 / 2;
            }

            vdtt_y.a(var1, var18, var3 * DataCenter.gI().r + var16, var4 * DataCenter.gI().r + 0 - var18.d / 2, Blending.SourceOver);
            var18.a();
            return var8.a(var17, var6, var13, var2);
         }
      }
   }

   public static int c(vdtt_dd var0, Graphics var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      return d() ? 0 : var0.c().a(var0, Graphics.a(var0.a), var6, var7, var1, var2, var3, var4, var5);
   }

   public static int d(vdtt_dd var0, Graphics var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      return d() ? 0 : var0.c().a(var0, Graphics.b(75), var6, var7, var1, var2, var3, var4, var5);
   }

   public static void a(vdtt_dd var0, Graphics var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if (!d()) {
         if (Utlis.b(DataCenter.gI().h % var9) >= var9 / 2) {
            var0.c().a(Graphics.a(var0.a), -1, 0, var1, var2, var3, var4, 2);
         } else {
            var0.c().a(Graphics.a(var0.a), var7, 0, var1, var2, var3, var4, 2);
         }
      }

   }

   private static int a(String var0, int var1, int var2) {
      int var3 = var0.length();
      if (var2 == 2 || var2 == 3) {
         ++var3;
      }

      int var4 = DataCenter.gI().h / var1 % var3;
      switch(var2) {
      case 1:
      case 3:
         var4 = DataCenter.gI().h / var1 % (var3 * 2) % var3;
         if (DataCenter.gI().h / var1 % (var3 * 2) >= var3) {
            var4 = var3 - 1 - var4;
         }
      default:
         return var4;
      }
   }

   public static String[] a(String var0, int var1) {
      Vector var2 = new Vector();

      for(int var3 = 0; var3 < var0.length(); ++var3) {
         if (var0.charAt(var3) == ' ') {
            var2.addElement(var0.substring(0, var3).trim());
            var0 = var0.substring(var3);
            var3 = 0;
         }
      }

      var2.addElement(var0.trim());
      String[] var7 = new String[2];
      int var4 = 0;
      int var5 = 0;

      for(int var6 = 0; var6 < var2.size(); ++var6) {
         if (var7[var4] == null) {
            var7[var4] = "";
         }

         var7[var4] = var7[var4] + var2.elementAt(var6).toString() + " ";
         ++var5;
         if (var5 == var2.size() / 2) {
            var7[var4] = var7[var4].trim();
            var5 = 0;
            ++var4;
            if (var4 >= 2) {
               var4 = 1;
               var7[1] = var7[1] + " ";
            }
         }
      }

      return var7;
   }

   private static boolean d() {
      try {
         if (AppListener.gI().h.c()) {
            return true;
         }

         if (DataCenter.gI().currentScreen instanceof GameSrc) {
            return Graphics.q;
         }

         Graphics.q = false;
      } catch (Exception var1) {
      }

      return false;
   }

   public final vdtt_ec a(String var1, int var2, BitmapFont var3) {
      String var4 = var2 + "_" + var1;
      vdtt_ec var5;
      if ((var5 = (vdtt_ec)this.n.get(var4)) == null) {
         (var5 = new vdtt_ec()).a = var4;
         var5.b = 0.0F;
         String var6 = var1.toLowerCase();

         for(int var7 = 0; var7 < var6.length() - 1 && var5.c.size() <= 10; ++var7) {
            for(int var8 = 2; var8 <= 8; ++var8) {
               int var9;
               if ((var9 = var7 + var8) > var1.length()) {
                  var9 = var1.length();
               }

               vdtt_ik var10;
               if ((var10 = (vdtt_ik)vdtt_ik.h.get(var6.substring(var7, var9))) != null) {
                  String var11 = var10.d;
                  String var12;
                  vdtt_il var13;
                  if ((var12 = var1.substring(0, var7)).length() > 0) {
                     var13 = new vdtt_il(this.a, var3, var12, var2);
                     var5.b += var13.d;
                     var5.c.add(var13);
                  }

                  if (var10.c > 0) {
                     var13 = new vdtt_il(var10.c, var10.a);
                     var5.b += var13.d;
                     var5.c.add(var13);
                  } else {
                     var2 = var10.b;
                  }

                  var1 = var1.substring(var7 + var11.length(), var1.length());
                  var6 = var6.substring(var7 + var10.d.length(), var6.length());
                  var7 = -1;
                  break;
               }
            }
         }

         if (var1.length() > 0) {
            vdtt_il var14 = new vdtt_il(this.a, var3, var1.substring(0, var1.length()), var2);
            var5.b += var14.d;
            var5.c.add(var14);
         }

         if (this.n.size() > 100) {
            this.n.clear();
         }

         this.n.put(var4, var5);
      }

      return var5;
   }

   public static void b() {
      o.clear();

      for(int var0 = 0; var0 < l.length; ++var0) {
         try {
            l[var0].n.clear();
            vdtt_df var1 = l[var0].c();

            try {
               Iterator var2 = var1.f.keySet().iterator();

               while(var2.hasNext()) {
                  String var3 = (String)var2.next();
                  ((mImage)var1.f.get(var3)).a();
               }

               var1.f.clear();
               var1.g.clear();
               var1.h.clear();
            } catch (Exception var4) {
            }
         } catch (Exception var5) {
         }
      }

   }

   public static String[] d(vdtt_dd var0, String var1, int var2) {
      Vector var3;
      String[] var4 = new String[(var3 = var0.c().a(var1, 60)).size()];

      for(var2 = 0; var2 < var4.length; ++var2) {
         var4[var2] = (String)var3.get(var2);
      }

      return var4;
   }

   static {
      for(int var0 = 0; var0 < l.length; ++var0) {
         l[var0] = new vdtt_dd((byte)-1);
         switch(var0) {
         case 0:
            d = l[var0];
            break;
         case 1:
            e = l[var0];
            break;
         case 2:
            f = l[var0];
            break;
         case 3:
            h = l[var0];
            break;
         case 4:
            g = l[var0];
            break;
         case 5:
            b = l[var0];
            break;
         case 6:
            c = l[var0];
            break;
         case 7:
            i = l[var0];
            break;
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
            j[var0 - 8] = l[var0];
         }

         k[var0] = new vdtt_df(var0);
      }

   }
}
