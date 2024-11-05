package gro;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Blending;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import java.util.Hashtable;
import java.util.Vector;

public final class vdtt_df {
   byte a;
   byte b;
   private byte i;
   byte c;
   private String j = "";
   private byte[] k = new byte[0];
   public Vector d = new Vector();
   public Hashtable e = new Hashtable();
   Hashtable f = new Hashtable();
   public Hashtable g = new Hashtable();
   public Hashtable h = new Hashtable();

   private mImage f(String var1) {
      return (mImage)this.f.get(var1);
   }

   private void a(String var1, mImage var2) {
      this.f.put(var1, var2);
      this.d.addElement(var1);
      if (this.f.size() > 300) {
         for(int var3 = this.d.size() - 1; var3 >= 200; --var3) {
            var1 = (String)this.d.remove(var3);
            ((mImage)this.f.remove(var1)).a();
         }
      }

   }

   public vdtt_df(int var1) {
      this.a = (byte)var1;
      this.j = "";
   }

   public final boolean a() {
      try {
         this.j = "";
         vdtt_y.a(this.e);
         vdtt_y.a(this.f);
         this.d.clear();
         this.b();
         return true;
      } catch (Exception var2) {
         Utlis.a(var2);
         return false;
      }
   }

   public final void b() {
      this.c = (byte)(Graphics.b(this.a, "Ấ") * 2);
   }

   private int a(char var1) {
      int var2;
      if ((var2 = this.j.indexOf(var1)) == -1) {
         var2 = this.j.toLowerCase().indexOf(var1);
      }

      if (var2 == -1) {
         var2 = this.j.toUpperCase().indexOf(var1);
      }

      return var2;
   }

   private int a(int var1) {
      int var2 = this.k[var1];
      if (this.k[var1] < 0) {
         var2 = this.k[var1] + 256;
      }

      return var2;
   }

   public final int a(String var1) {
      return this.b(var1);
   }

   private int g(String var1) {
      int var2 = 0;
      var1 = var1.replace("c#kim", "").replace("c#moc", "").replace("c#thuy", "").replace("c#hoa", "").replace("c#tho", "");

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         int var4;
         if ((var4 = this.a(var1.charAt(var3))) < 0) {
            var2 += this.i;
         } else {
            var2 += this.a(var4);
         }
      }

      return var2;
   }

   public final int b(String var1) {
      if (this.g.get(var1) != null) {
         return (Integer)this.g.get(var1);
      } else {
         int var2 = 0;
         String var3 = var1;

         int var4;
         for(var4 = 0; var4 < var3.length(); ++var4) {
            int[] var5;
            if ((var5 = h(var3.substring(var4))) != null) {
               vdtt_ik var6 = vdtt_ik.g[var5[0]];
               var2 += var6.a * DataCenter.gI().r + this.b;
               var3 = var3.substring(0, var5[1]) + var3.substring(var5[1] + var6.d.length());
               var4 = -1;
            }
         }

         var4 = Graphics.a(this.a, var3);
         var2 += var4;
         if (var1.length() > 1) {
            var2 -= this.b;
         }

         if (this.g.size() > 500) {
            this.g.clear();
         }

         if (var4 > 0) {
            this.g.put(var1, var2);
         }

         return var2;
      }
   }

   public final void a(int var1, int var2, int var3, int var4, Graphics var5, String var6, int var7, int var8, int var9) {
      if (!e(var6) && var4 >= 0 && var4 < var6.length()) {
         mImage var10 = this.a(-1, 0, "" + var6.charAt(var4));
         var2 = 0;
         var3 = this.a(var6);
         if (var9 == 1) {
            var2 = -var3;
         } else if (var9 == 2) {
            var2 = -var3 / 2;
         }

         for(var9 = 0; var9 < var6.length(); ++var9) {
            var3 = this.a(var6.charAt(var9));
            if (var9 == var4) {
               break;
            }

            if (var3 < 0) {
               var2 += this.i + this.b;
            } else {
               var2 += this.a(var3) + this.b;
            }
         }

         var9 = var5.e;
         var3 = var5.f;
         var5.a(var7, var8);
         var5.c(-1);
         var5.b(var10, 0, 0, var10.c, var10.d, 0, var2, 0, 6);
         var5.f();
         var5.a(-var5.e, -var5.f);
         var5.a(var9, var3);
      }

   }

   private void a(int var1, int var2, Pixmap var3, String var4, int var5, int var6, int var7, boolean var8) {
      if (!e(var4)) {
         var7 = 0;
         this.b(var4);
         int var9 = var4.length();

         for(int var10 = 0; var10 < var9; ++var10) {
            int var11;
            if ((var11 = this.a(var4.charAt(var10))) < 0) {
               var7 += this.i + this.b;
            } else {
               mImage var12 = vdtt_y.a((mImage)this.e.get(var11), var1, var2);
               vdtt_y.a(var3, var12, var7 + var5, 0 - var12.d / 2 + var6, Blending.SourceOver);
               var7 += this.a(var11) + this.b;
               var12.a();
            }
         }
      }

   }

   public final void a(int var1, int var2, Graphics var3, String var4, int var5, int var6, int var7) {
      if (!e(var4)) {
         try {
            int var8 = this.b(var4);
            mImage var9;
            if ((var9 = this.a(var1, var2, var4)) != null) {
               var2 = 0;
               if (var7 == 1) {
                  var2 = -var8;
               } else if (var7 == 2) {
                  var2 = -var8 / 2;
               }

               var7 = var3.e;
               var8 = var3.f;
               var3.a(var5, var6);
               var3.c(var1);
               var3.b(var9, 0, 0, var9.c, var9.d, 0, var2, 0, 6);
               var3.f();
               var3.a(-var3.e, -var3.f);
               var3.a(var7, var8);
            }
         } catch (Exception var10) {
            Utlis.a(var10);
         }
      }

   }

   public final void a(BitmapFont var1, int var2, int var3, Graphics var4, String var5, int var6, int var7, int var8) {
      if (var1 != null) {
         var4.a(this.a, var1, var5, (float)var6, (float)var7, var8, var2, 0.0F);
      } else {
         this.a(var2, var3, var4, var5, var6, var7, var8);
      }

   }

   public final int a(vdtt_dd var1, BitmapFont var2, int var3, int var4, Graphics var5, String var6, int var7, int var8, int var9) {
      if (e(var6)) {
         return -1;
      } else {
         int var10;
         if (var2 == null) {
            int var16 = 0;
            int var17 = this.b(var6);
            String var19 = var6 + Integer.toHexString(var3);
            if (var4 != 0) {
               var19 = var19 + Integer.toHexString(var4);
            }

            mImage var18;
            if ((var18 = this.f(var19)) == null) {
               Binary.a(var18 = this.b(var17, var3, var4, var6));
               this.a(var19, var18);
            }

            if (var9 == 1) {
               var16 = -var17;
            } else if (var9 == 2) {
               var16 = -var17 / 2;
            }

            var9 = var5.e;
            var10 = var5.f;
            var5.a(var7, var8);
            var5.b(var18, 0, 0, var18.c, var18.d, 0, var16, 0, 6);
            var5.a(-var5.e, -var5.f);
            var5.a(var9, var10);
            return this.a(var17, var3, var4, var6);
         } else {
            vdtt_ec var11 = var1.a(var6, var3, var2);
            var3 = -1;
            float var12 = 0.0F;
            float var13 = var11.b;
            if (var9 == 2) {
               var13 = -var13 / 2.0F;
            } else if (var9 == 1) {
               var13 = -var13;
            } else {
               var13 = 0.0F;
            }

            for(int var14 = 0; var14 < var11.c.size(); ++var14) {
               vdtt_il var15;
               if ((var15 = (vdtt_il)var11.c.get(var14)).c > 0) {
                  if (var15.c == 752) {
                     vdtt_cz.a(var5, 752 + DataCenter.gI().h % 24 / 6, 0, var7 + (int)((var12 + var13) / (float)DataCenter.gI().r) + DataCenter.gI().r / 2, var8, 6);
                  } else {
                     vdtt_cz.a(var5, var15.c, 0, var7 + (int)((var12 + var13) / (float)DataCenter.gI().r) + DataCenter.gI().r / 2, var8, 6);
                  }
               } else {
                  var5.a(this.a, var2, var15.a, (float)var7, (float)var8, 0, var15.b, var12 + var13);
                  if (var15.b == -16320832 || var15.b == -358383 || var15.b == -7812045 || var15.b == -2559) {
                     var5.f(var15.b);
                     var10 = var7 + (int)((var12 + var13) / (float)DataCenter.gI().r) - 1;
                     var5.a(var10, var8 + 4, var10 + (int)var15.d / DataCenter.gI().r, var8 + 5);
                  }
               }

               var12 += var15.d;
               var3 = var15.b;
            }

            return var3;
         }
      }
   }

   int a(int var1, int var2, int var3, String var4) {
      var3 = var4.length();

      for(int var5 = 0; var5 < var3; ++var5) {
         vdtt_ik var6;
         if ((var6 = c(var4.substring(var5))) == null) {
            this.a(var4.charAt(var5));
         } else {
            if (var6.d.equals("c#task") || var6.d.equals("c#item") || var6.d.equals("c#select")) {
               DataCenter.gI();
            }

            if (var6.a > 0) {
               DataCenter.gI();
            } else {
               var2 = var6.b;
            }

            var5 += var6.d.length() - 1;
         }
      }

      return var2;
   }

   mImage b(int var1, int var2, int var3, String var4) {
      var1 = var1;
      int var5 = this.c;
      int var6 = var4.length();
      int var7 = -1;
      int var8 = 0;
      if (var3 != 0) {
         var1 += 2;
         var5 += 2;
      }

      vdtt_ik var9;
      mImage var11;
      for(int var10 = 0; var10 < var6; ++var10) {
         if ((var9 = c(var4.substring(var10))) != null && var9.c > 0 && (var11 = vdtt_cz.d(var9.c)).d > var5) {
            var5 = var11.d;
         }
      }

      Color var14 = new Color();
      var11 = Binary.a(var1, var5);

      for(int var12 = 0; var12 < var6; ++var12) {
         if ((var9 = c(var4.substring(var12))) == null) {
            var1 = this.a(var4.charAt(var12));
            this.a(var2, var3, var11.b, "" + var4.charAt(var12), var8, 0 + var11.d / 2, 20, false);
            if (var1 < 0) {
               var8 += this.i + this.b;
            } else {
               var8 += this.a(var1) + this.b;
            }
         } else {
            if (!var9.d.equals("c#task") && !var9.d.equals("c#item") && !var9.d.equals("c#select")) {
               if (var7 >= 0) {
                  Color.argb8888ToColor(var14, var2);
                  var11.b.setColor(var14);
                  var11.b.fillRectangle(var7 * DataCenter.gI().r, var11.d - 1 * DataCenter.gI().r, var8 - var7 * DataCenter.gI().r, 1 * DataCenter.gI().r);
               }

               var7 = -1;
            } else {
               var7 = var8 / DataCenter.gI().r;
            }

            if (var9.a > 0) {
               mImage var13 = vdtt_cz.c(var9.c);
               vdtt_y.a(var11.b, var13, var8 + (var8 % DataCenter.gI().r != 0 ? 1 : 0), 2, 0, 0, var13.c, var13.d, Blending.SourceOver);
               var8 += var9.a * DataCenter.gI().r + this.b;
            } else {
               var2 = var9.b;
            }

            var12 += var9.d.length() - 1;
         }
      }

      if (var7 >= 0) {
         Color.argb8888ToColor(var14, var2);
         var11.b.setColor(var14);
         var11.b.fillRectangle(var7 * DataCenter.gI().r, var11.d - 1 * DataCenter.gI().r, var8 - var7 * DataCenter.gI().r, 1 * DataCenter.gI().r);
      }

      return var11;
   }

   private mImage a(int var1, int var2, String var3) {
      int var4 = 0;
      String var5 = var3 + Integer.toHexString(var1);
      if (var2 != 0) {
         var5 = var5 + Integer.toHexString(var2);
      }

      mImage var6 = this.f(var5);

      try {
         if (var3.length() == 1) {
            var1 = this.g(var3);
         } else {
            var1 = this.a(var3);
         }

         int var7 = this.c;
         if (var6 == null) {
            if (var2 != 0) {
               var1 += 2;
               var7 += 2;
            }

            Pixmap var8 = (var6 = Binary.a(var1, var7)).b;

            for(int var9 = 0; var9 < var3.length(); ++var9) {
               if ((var1 = this.a(var3.charAt(var9))) < 0) {
                  var4 += this.i + this.b;
               } else {
                  mImage var10;
                  if (var2 != 0) {
                     var10 = (mImage)this.e.get(var1 + 1000);
                  } else {
                     var10 = (mImage)this.e.get(var1);
                  }

                  vdtt_y.a(var8, var10, var4, 0, Blending.None);
                  var4 += this.a(var1) + this.b;
               }
            }

            this.a(var5, var6);
         }

         return var6;
      } catch (Exception var11) {
         if (var6 != null) {
            var6.a();
         }

         return vdtt_cz.a;
      }
   }

   public static vdtt_ik c(String var0) {
      var0 = var0.toLowerCase();

      for(int var1 = 0; var1 < vdtt_ik.g.length; ++var1) {
         vdtt_ik var2 = vdtt_ik.g[var1];
         if (var0.startsWith(var2.d)) {
            return var2;
         }
      }

      return null;
   }

   private static int[] h(String var0) {
      var0 = var0.toLowerCase();

      for(int var1 = 0; var1 < vdtt_ik.g.length; ++var1) {
         vdtt_ik var2 = vdtt_ik.g[var1];
         int var3;
         if ((var3 = var0.indexOf(var2.d)) >= 0) {
            return new int[]{var1, var3};
         }
      }

      return null;
   }

   public static vdtt_ik d(String var0) {
      var0 = var0.toLowerCase();
      vdtt_ik var1 = null;

      for(int var2 = 0; var2 < vdtt_ik.g.length; ++var2) {
         int var3;
         if ((var3 = var0.indexOf(vdtt_ik.g[var2].d)) >= 0 && (var1 == null || var3 < var0.indexOf(var1.d))) {
            var1 = vdtt_ik.g[var2];
         }
      }

      return var1;
   }

   public final Vector a(String var1, int var2) {
      var1 = var1.replaceAll("\\n", " \n ");
      String var3 = "";

      for(int var4 = 0; var4 < var1.length(); ++var4) {
         if (var1.charAt(var4) == '\\' && var4 + 1 < var1.length() && var1.charAt(var4 + 1) == 'n') {
            var3 = var3 + " \n ";
            ++var4;
         } else {
            var3 = var3 + var1.charAt(var4);
         }
      }

      var2 *= DataCenter.gI().r;
      Vector var17 = new Vector();
      String[] var5 = Utlis.a(var3, " ");
      Vector var6 = new Vector();

      int var7;
      int var8;
      for(var7 = 0; var7 < var5.length; ++var7) {
         String var9 = var5[var7];
         if (this.b(var9) < var2) {
            var6.add(var9);
         } else {
            String var10 = "";

            for(var8 = 0; var8 < var9.length(); ++var8) {
               var10 = var10 + var9.charAt(var8);
               if (this.b(var10) >= var2) {
                  if (var10.length() > 1) {
                     var6.add(var10.substring(0, var10.length() - 1));
                     var10 = "" + var9.charAt(var8);
                  } else {
                     var6.add(var10);
                     var10 = "";
                  }
               }
            }

            if (var10.length() > 0) {
               var6.add(var10);
            }
         }
      }

      var5 = new String[var6.size()];
      var1 = "";

      for(var7 = 0; var7 < var6.size(); ++var7) {
         var5[var7] = (String)var6.get(var7);
         var1 = var1 + (String)var6.get(var7);
         if (var7 < var6.size() - 1) {
            var1 = var1 + " ";
         }
      }

      vdtt_ik var18 = null;
      int var19 = 0;
      var8 = 0;
      int var11 = 0;
      boolean var12 = false;

      for(int var13 = 0; var13 < var5.length; ++var13) {
         if (var5[var13].equals("\n") || var11 + this.b(var5[var13]) > var2) {
            if (var12) {
               var17.addElement(var1.substring(var8, var19).trim());
               var12 = false;
            } else {
               var17.addElement(Utlis.f(var1.substring(var8, var19)));
            }

            var8 = var19;
            var11 = 0;
            if (var18 != null) {
               if (var5[var13].equals("\n")) {
                  var1 = var1.substring(0, var19) + var1.substring(var19, var19 + 1) + var18.d + var1.substring(var19 + 2, var1.length());
               } else {
                  var1 = var1.substring(0, var19) + var18.d + var1.substring(var19, var1.length());
               }

               var5 = Utlis.a(var1, " ");
               var18 = null;
            }

            if (var5[var13].startsWith("\n")) {
               var12 = true;
            }
         }

         for(int var14 = 0; var14 < var5[var13].length(); ++var14) {
            vdtt_ik var15;
            if ((var15 = c(var1.substring(var19))) == null) {
               int[] var16;
               if ((var16 = h(var1.substring(var19).split("\n")[0])) != null) {
                  var18 = vdtt_ik.g[var16[0]];
               }

               var7 = var19 + var5[var13].length() - var14;
               var11 += this.b(var1.substring(var19, var7) + " ");
               var19 = var7;
               break;
            }

            var11 += var15.a * DataCenter.gI().r + this.b;
            var14 += var15.d.length() - 1;
            var19 += var15.d.length() - 1;
            if (var15.a <= 0) {
               var18 = var15;
            }

            ++var19;
         }

         var11 += this.i + this.b;
         ++var19;
         if (var13 == var5.length - 1) {
            var17.addElement(Utlis.f(var1.substring(var8, var1.length())));
         }
      }

      return var17;
   }

   public final Vector b(String var1, int var2) {
      var2 *= DataCenter.gI().r;
      Vector var3 = new Vector();
      String var4 = "";

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         if (var1.charAt(var5) == '\\' && var5 + 1 < var1.length() && var1.charAt(var5 + 1) == 'n') {
            ++var5;
            var3.addElement(var4);
            var4 = "";
         } else if (var1.charAt(var5) == '\n') {
            var3.addElement(var4);
            var4 = "";
         } else {
            var4 = var4 + var1.charAt(var5);
            if (this.a(var4) > var2) {
               String var6 = "";

               int var7;
               for(var7 = var4.length() - 1; var7 >= 0; --var7) {
                  var6 = var6 + var4.charAt(var7);
                  if (var4.charAt(var7) == ' ') {
                     break;
                  }

                  if (this.b(var6) > var2) {
                     --var7;
                     break;
                  }
               }

               if (var7 < 0) {
                  var7 = var4.length() - 1;
               }

               var3.addElement(var4.substring(0, var7));
               var5 = var5 - (var4.length() - var7) + 1;
               var4 = "";
            }

            if (var5 == var1.length() - 1 && !var4.trim().equals("")) {
               var3.addElement(var4);
            }
         }
      }

      return var3;
   }

   static boolean e(String var0) {
      return var0 == null || var0.length() == 0;
   }
}
