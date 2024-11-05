package gro;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.Base64Coder;
import com.badlogic.gdx.utils.StringBuilder;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.Random;
import java.util.TimeZone;
import java.util.Vector;
import java.util.zip.Inflater;

public final class Utlis {
   private static Random d = new Random();
   private static Hashtable e = new Hashtable();
   public static long a;
   public static int b = 30000;
   public static long c = 3600000L;

   public static long a() {
      return System.currentTimeMillis() + a;
   }

   public static void a(String var0) {
      System.out.println(var0);
   }

   public static void b(String var0) {
      System.out.println(var0);
   }

   public static void a(Exception var0) {
      var0.printStackTrace();
   }

   public static void a(Exception var0, String var1) {
      var0.printStackTrace();
   }

   public static void a(long var0) {
      try {
         Thread.sleep(var0);
      } catch (Exception var3) {
      }

   }

   public static String ez(long var0) {
      SimpleDateFormat var2;
      (var2 = new SimpleDateFormat("HH:mm:ss - dd/MM/yyyy")).setTimeZone(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
      return var2.format(new Date(var0));
   }

   public static int a(int var0) {
      return var0 <= 0 ? 0 : d.nextInt(var0);
   }

   public static int a(int var0, int var1) {
      return var1 == var0 && var1 == 0 ? 0 : var0 + a(var1 - var0 + 1);
   }

   public static boolean b() {
      return d.nextInt(2) != 0;
   }

   public static int a(int[] var0) {
      return var0[a((int)3)];
   }

   public static Color b(long var0) {
      float var2 = (float)((var0 & 4278190080L) >> 24);
      float var3 = (float)((var0 & 16711680L) >> 16);
      float var4 = (float)((var0 & 65280L) >> 8);
      float var5 = (float)(var0 & 255L);
      return new Color(var3 / 255.0F, var4 / 255.0F, var5 / 255.0F, var2 / 255.0F);
   }

   public static boolean a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      return (var4 <= var0 && var0 <= var6 || var4 <= var2 && var2 <= var6 || var0 <= var4 && var2 >= var6) && (var5 <= var1 && var1 <= var7 || var5 <= var3 && var3 <= var7 || var1 <= var5 && var3 >= var7) || (var0 <= var4 && var4 <= var2 || var0 <= var6 && var6 <= var2 || var4 <= var0 && var6 >= var2) && (var1 <= var5 && var5 <= var3 || var1 <= var7 && var7 <= var3 || var5 <= var1 && var7 >= var3);
   }

   public static boolean a(int var0, int var1, int var2, int var3, int var4, int var5) {
      return var0 <= var4 && var4 <= var2 && var1 <= var5 && var5 <= var3;
   }

   public static short a(boolean var0, short var1) {
      if (var0) {
         return var1 % 360 == 0 ? -360 : (short)(-(var1 % 360));
      } else {
         return var1;
      }
   }

   public static short a(byte var0) {
      switch(var0) {
      case 0:
         return 0;
      case 1:
         return -180;
      case 2:
         return -90;
      case 3:
         return -270;
      case 4:
         return 180;
      case 5:
         return 90;
      case 6:
         return 270;
      case 7:
         return -360;
      default:
         return 0;
      }
   }

   public static int b(int var0) {
      return var0 > 0 ? var0 : -var0;
   }

   public static XYEntity[] a(XYEntity[] var0) {
      XYEntity[] var1 = new XYEntity[var0.length];
      int var2 = 0;

      for(int var3 = var1.length - 1; var3 >= 0; --var3) {
         var1[var2] = new XYEntity();
         var1[var2].cx = (short)(-var0[var3].cx);
         var1[var2].cy = var0[var3].cy;
         ++var2;
      }

      return var1;
   }

   public static int b(int var0, int var1) {
      return b(var0 - var1);
   }

   public static int a(int var0, int var1, int var2, int var3) {
      return (int)Math.sqrt((double)(b((var0 - var2) * (var0 - var2)) + b((var1 - var3) * (var1 - var3))));
   }

   private static double a(double var0, double var2, double var4, double var6) {
      return Math.sqrt(Math.abs((var0 - var4) * (var0 - var4)) + Math.abs((var2 - var6) * (var2 - var6)));
   }

   public static int a(XYEntity var0, XYEntity var1) {
      return b(var0.cx, var0.cy, var1.cx, var1.cy);
   }

   public static int b(int var0, int var1, int var2, int var3) {
      var0 = b(var0 - var2);
      var1 = b(var1 - var3);
      return var0 > var1 ? var0 : var1;
   }

   public static void a(Vector var0, Vector var1) {
      for(int var2 = 0; var2 < var1.size(); ++var2) {
         var0.addElement(var1.elementAt(var2));
      }

   }

   public static String c(String var0) {
      try {
         Long.parseLong(var0);
      } catch (Exception var4) {
         return var0;
      }

      String var1 = "";
      String var2 = "";
      if (var0.charAt(0) == '-') {
         var2 = "-";
         var0 = var0.substring(1);
      }

      for(int var3 = var0.length() - 1; var3 >= 0; --var3) {
         if ((var0.length() - 1 - var3) % 3 == 0 && var0.length() - 1 - var3 > 0) {
            var1 = var0.charAt(var3) + "." + var1;
         } else {
            var1 = var0.charAt(var3) + var1;
         }
      }

      return var2 + var1;
   }

   public static String c(long var0) {
      return c(String.valueOf(var0));
   }

   public static String c(int var0) {
      return c(String.valueOf(var0));
   }

   public static String[] a(String var0, String var1) {
      Vector var2 = new Vector();

      for(int var3 = var0.indexOf(var1); var3 >= 0; var3 = (var0 = var0.substring(var3 + var1.length())).indexOf(var1)) {
         var2.addElement(var0.substring(0, var3));
      }

      var2.addElement(var0);
      String[] var4 = new String[var2.size()];
      var2.copyInto(var4);
      return var4;
   }

   public static int c(int var0, int var1) {
      return var0 / var1 + (var0 % var1 != 0 ? 1 : 0);
   }

   public static String b(String var0, String var1) {
      return var0.replaceAll("#", var1);
   }

   public static String a(String var0, long var1) {
      return var0.replaceAll("#", "" + var1);
   }

   public static String b(String var0, long var1) {
      return var0.replaceAll("@", "" + var1);
   }

   public static String d(String var0) {
      try {
         String var1 = AppListener.b;
         var0 = Base64Coder.encodeString(var0);
         byte[] var2 = (var1 + var0).getBytes("UTF-8");

         for(int var3 = 0; var3 < var2.length; ++var3) {
            var2[var3] = (byte)(var2[var3] + var1.length());
         }

         return Base64Coder.encodeLines(var2).replaceAll("\n", "#");
      } catch (Exception var4) {
         return null;
      }
   }

   public static String e(String var0) {
      try {
         String var1 = AppListener.b;
         byte[] var2 = Base64Coder.decodeLines(var0.replaceAll("#", "\n"));

         for(int var3 = 0; var3 < var2.length; ++var3) {
            var2[var3] = (byte)(var2[var3] - var1.length());
         }

         return Base64Coder.decodeString((new String(var2, "UTF-8")).replaceAll(var1, "")).replaceAll("#", "\n");
      } catch (Exception var4) {
         return null;
      }
   }

   public static String d(int var0) {
      String var1 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
      StringBuilder var2 = new StringBuilder(15);

      for(int var3 = 0; var3 < 15; ++var3) {
         var2.append(var1.charAt(a(var1.length())));
      }

      return var2.toString();
   }

   private static boolean a(int var0, int var1, XYEntity var2, XYEntity var3) {
      return (var3.cx > var2.cx && var2.cx <= var0 && var0 <= var3.cx || var2.cx >= var3.cx && var2.cx >= var0 && var0 >= var3.cx) && (var3.cy > var2.cy && var2.cy <= var1 && var1 <= var3.cy || var2.cy >= var3.cy && var2.cy >= var1 && var1 >= var3.cy);
   }

   public static XYEntity a(XYEntity var0, XYEntity var1, XYEntity var2, XYEntity var3) {
      double var4 = (double)var0.cx;
      double var6 = (double)var1.cx;
      double var8 = (double)var2.cx;
      double var10 = (double)var3.cx;
      double var12 = (double)var0.cy;
      double var14 = (double)var1.cy;
      double var16 = (double)var2.cy;
      double var18 = (double)var3.cy;
      XYEntity var20;
      double var21;
      if ((var21 = (var4 - var6) * (var16 - var18) - (var12 - var14) * (var8 - var10)) == 0.0D) {
         var20 = null;
      } else {
         double var23 = ((var8 - var10) * (var4 * var14 - var12 * var6) - (var4 - var6) * (var8 * var18 - var16 * var10)) / var21;
         double var25 = ((var16 - var18) * (var4 * var14 - var12 * var6) - (var12 - var14) * (var8 * var18 - var16 * var10)) / var21;
         var20 = XYEntity.create((int)var23, (int)var25);
      }

      return var20 != null && a(var20.cx, var20.cy, var0, var1) && a(var20.cx, var20.cy, var2, var3) ? var20 : null;
   }

   public static String e(int var0) {
      String var1 = String.valueOf(var0);
      if (var0 < 99) {
         var1 = "0" + var1;
      }

      StringBuilder var2 = new StringBuilder();

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         if (var3 == 0) {
            var2.append(var1.charAt(var3));
         } else {
            var2.append("." + var1.charAt(var3));
         }
      }

      return var2.toString();
   }

   public static String f(int var0) {
      int var1 = 0;
      if (var0 > 60) {
         var1 = var0 / 60;
         var0 %= 60;
      }

      int var2 = 0;
      if (var1 > 60) {
         var2 = var1 / 60;
         var1 %= 60;
      }

      int var3 = 0;
      if (var2 > 24) {
         var3 = var2 / 24;
         var2 %= 24;
      }

      String var4 = "";
      if (var3 > 0) {
         var4 = var4 + var3;
         var4 = var4 + "d";
         var4 = var4 + var2 + "h";
      } else if (var2 > 0) {
         var4 = var4 + var2;
         var4 = var4 + "h";
         var4 = var4 + var1 + "'";
      } else {
         if (var1 > 9) {
            var4 = var4 + var1;
         } else {
            var4 = var4 + "0" + var1;
         }

         var4 = var4 + ":";
         if (var0 > 9) {
            var4 = var4 + var0;
         } else {
            var4 = var4 + "0" + var0;
         }
      }

      return var4;
   }

   public static String g(int var0) {
      int var1 = 0;
      if (var0 > 60) {
         var1 = var0 / 60;
         var0 %= 60;
      }

      int var2 = 0;
      if (var1 > 60) {
         var2 = var1 / 60;
         var1 %= 60;
      }

      int var3 = 0;
      if (var2 > 24) {
         var3 = var2 / 24;
         var2 %= 24;
      }

      String var4 = "";
      if (var3 > 0) {
         var4 = var4 + var3;
         var4 = var4 + " " + Caption.li;
         var4 = var4 + var2 + " " + Caption.lj;
      } else if (var2 > 0) {
         var4 = var4 + var2;
         var4 = var4 + " " + Caption.ll;
         var4 = var4 + var1 + " " + Caption.lk;
      } else {
         if (var1 > 9) {
            var4 = var4 + var1;
         } else {
            var4 = var4 + "0" + var1;
         }

         var4 = var4 + ":";
         if (var0 > 9) {
            var4 = var4 + var0;
         } else {
            var4 = var4 + "0" + var0;
         }
      }

      return var4;
   }

   public static int c() {
      return (int)((System.currentTimeMillis() + a) / 1000L);
   }

   public static String h(int var0) {
      int var1;
      if (var0 >= 3600) {
         int var2 = var0 / 3600;
         if ((var1 = var0 % 3600) > 60) {
            var1 /= 60;
         }

         return var1 == 0 ? var2 + ":00" : var2 + ":" + (var1 < 10 ? "0" + var1 : var1);
      } else if (var0 >= 60) {
         var1 = var0 / 60;
         return (var0 %= 60) == 0 ? var1 + ":00" : var1 + ":" + (var0 < 10 ? "0" + var0 : var0);
      } else if (var0 >= 0) {
         var0 %= 60;
         return "00:" + (var0 < 10 ? "0" + var0 : var0);
      } else {
         return "0";
      }
   }

   public static String i(int var0) {
      int var1;
      int var2;
      if (var0 > 86400) {
         int var3 = var0 / 86400;
         var1 = (var0 %= 86400) / 3600;
         if ((var2 = var0 % 3600) > 60) {
            var2 /= 60;
         }

         return var2 == 0 ? var3 + Caption.lm + var1 + " " + Caption.ll : var3 + Caption.lm + var1 + " " + Caption.ll + " " + var2 + " " + Caption.lk;
      } else if (var0 >= 3600) {
         var1 = var0 / 3600;
         if ((var2 = var0 % 3600) > 60) {
            var2 /= 60;
         }

         return var2 == 0 ? var1 + " " + Caption.ll : var1 + " " + Caption.ll + " " + var2 + " " + Caption.lk;
      } else if (var0 >= 60) {
         var2 = var0 / 60;
         return (var0 %= 60) == 0 ? var2 + " " + Caption.lk : var2 + " " + Caption.lk + " " + var0 + " " + Caption.ln;
      } else if (var0 >= 0) {
         var0 %= 60;
         return var0 + " " + Caption.ln;
      } else {
         return "0 " + Caption.ln;
      }
   }

   public static String f(String var0) {
      int var1;
      for(var1 = var0.length() - 1; var1 >= 0 && Character.isWhitespace(var0.charAt(var1)); --var1) {
      }

      return var0.substring(0, var1 + 1);
   }

   public static String j(int var0) {
      return var0 % 1000 == 0 ? c(String.valueOf(var0 /= 1000)) : "" + (float)var0 / 1000.0F;
   }

   public static byte[] a(byte[] var0) {
      try {
         if (var0 != null) {
            int var1;
            if ((var1 = var0.length) > 51) {
               var1 = 51;
            }

            byte[] var2 = new byte[var1];

            int var3;
            for(var3 = 0; var3 < var2.length; ++var3) {
               var2[50 - var3] = var0[var3];
            }

            for(var3 = 0; var3 < var2.length; ++var3) {
               var0[var3] = var2[var3];
            }
         }
      } catch (Exception var4) {
      }

      return var0;
   }

   public static byte[] b(byte[] var0) {
      try {
         if (var0 != null) {
            int var1;
            byte var2;
            if ((var2 = (byte)(var1 = var0.length)) == 0) {
               var2 = 100;
            }

            byte[] var3 = new byte[var0.length];

            for(int var4 = 0; var4 < var0.length; ++var4) {
               var3[var4] = (byte)(var0[var4] - var2);
            }

            return var3;
         }
      } catch (Exception var5) {
      }

      return null;
   }

   public static FileHandle g(String var0) {
      return h(var0);
   }

   public static FileHandle h(String var0) {
      String var1 = "internal" + var0;
      if (!var0.contains("/")) {
         var0 = "resource/" + var0;
      }

      if (e.get(var1) != null) {
         return (FileHandle)e.get(var1);
      } else {
         FileHandle var2 = Gdx.files.internal(var0);
         e.put(var1, var2);
         return var2;
      }
   }

   public static FileHandle i(String var0) {
      if (!var0.startsWith(Binary.a)) {
         var0 = vdtt_y.a(var0) + var0;
      }

      String var1 = "external" + var0;
      if (e.get(var1) != null) {
         return (FileHandle)e.get(var1);
      } else {
         FileHandle var2 = Gdx.app.getType() == ApplicationType.Desktop ? Gdx.files.local(var0) : Gdx.files.external(var0);
         e.put(var1, var2);
         return var2;
      }
   }

   public static void d() {
      try {
         vdtt_lg.M = true;
         vdtt_cz.b();
         AppListener.gI().b();
         Session.gI();
      } catch (Exception var1) {
      }

   }

   public static boolean e() {
      return DataCenter.gI().currentScreen.c instanceof vdtt_mb;
   }

   public static String k(int var0) {
      return var0 < 10 ? "0" + var0 : "" + var0;
   }

   public static String d(long var0) {
      Calendar var2;
      (var2 = Calendar.getInstance()).setTime(new Date(var0));
      int var4 = var2.get(1);
      String var5 = k(var2.get(2) + 1);
      String var6 = k(var2.get(5));
      String var7 = k(var2.get(11));
      String var8 = k(var2.get(12));
      return var4 + "-" + var5 + "-" + var6 + " " + var7 + ":" + var8;
   }

   public static String e(long var0) {
      Calendar var2;
      (var2 = Calendar.getInstance()).setTime(new Date(var0));
      int var4 = var2.get(1);
      String var5 = k(var2.get(2) + 1);
      String var6 = k(var2.get(5));
      String var7 = k(var2.get(11));
      String var8 = k(var2.get(12));
      String var9 = k(var2.get(13));
      return var4 + "-" + var5 + "-" + var6 + " " + var7 + ":" + var8 + ":" + var9;
   }

   public static String l(int var0) {
      Calendar var1;
      (var1 = Calendar.getInstance()).setTime(new Date(946573200129L + (long)var0 * 1000L));
      return k(var1.get(11)) + ":" + k(var1.get(12));
   }

   public static boolean d(int var0, int var1) {
      Calendar var2;
      (var2 = Calendar.getInstance()).setTimeInMillis(System.currentTimeMillis() + a);
      var2.set(11, 0);
      var2.set(12, 0);
      var2.set(13, 0);
      var2.setTimeInMillis(var2.getTimeInMillis() + (long)var0 * 1000L);
      Calendar var3;
      (var3 = Calendar.getInstance()).setTimeInMillis(System.currentTimeMillis() + a);
      var3.set(11, 0);
      var3.set(12, 0);
      var3.set(13, 0);
      var3.setTimeInMillis(var3.getTimeInMillis() + (long)var1 * 1000L);
      long var4 = System.currentTimeMillis() + a;
      return var2.getTimeInMillis() <= var4 && var4 <= var3.getTimeInMillis();
   }

   public static int m(int var0) {
      Calendar var1;
      (var1 = Calendar.getInstance()).setTimeInMillis(System.currentTimeMillis() + a);
      var1.set(11, 0);
      var1.set(12, 0);
      var1.set(13, 0);
      var1.setTimeInMillis(var1.getTimeInMillis() + (long)var0 * 1000L);
      long var2 = System.currentTimeMillis() + a;
      return (int)(var1.getTimeInMillis() - var2) / 1000;
   }

   public static String f(long var0) {
      if (var0 >= 2592000000L) {
         return var0 / 2592000000L + " " + Caption.yS[0];
      } else if (var0 >= 604800000L) {
         return var0 / 604800000L + " " + Caption.yS[1];
      } else if (var0 >= 86400000L) {
         return var0 / 86400000L + " " + Caption.yS[2];
      } else if (var0 >= 3600000L) {
         return var0 / 3600000L + " " + Caption.yS[3];
      } else {
         return var0 >= 60000L ? var0 / 60000L + " " + Caption.yS[4] : var0 / 1000L + " " + Caption.yS[5];
      }
   }

   public static String g(long var0) {
      Calendar var2;
      (var2 = Calendar.getInstance()).setTime(new Date(var0));
      String var3 = k(var2.get(11));
      String var4 = k(var2.get(12));
      String var5 = k(var2.get(5));
      String var6 = k(var2.get(2) + 1);
      int var7 = var2.get(1);
      return var5 + "/" + var6 + "/" + var7 + " " + var3 + "h" + var4 + "'";
   }

   public static void a(Graphics var0, int var1, int var2) {
      var0.f(8732953);
      var0.b(0, 0, var1 - 1, var2 - 1);
      var0.f(6501888);
      var0.b(1, 1, var1 - 2 - 1, var2 - 2 - 1);
   }

   public static String a(String var0, int var1) {
      return (var0 = var0.substring(0, 1).toUpperCase() + var0.substring(1, var0.length()).toLowerCase()).length() > var1 ? var0.substring(0, var1) + "..." : var0;
   }

   public static boolean j(String var0) {
      return var0 == null || var0.equals("");
   }

   public static vdtt_ey a(XYEntity var0, XYEntity var1, int var2) {
      if ((var2 %= 360) < 0) {
         var2 += 360;
      }

      vdtt_ey var3 = new vdtt_ey(0, 0);
      double var4 = a((double)var0.cx, (double)var0.cy, (double)var1.cx, (double)var1.cy);
      int var6 = (int)Math.toDegrees(Math.asin(((double)var0.cx - (double)var1.cx) / var4));
      var3.cx = (short)((int)((double)var0.cx - var4 * Math.sin(Math.toRadians((double)var6))));
      var3.cy = (short)((int)((double)var0.cy - var4 * Math.cos(Math.toRadians((double)var6))));
      int var7 = var1.cx - var3.cx;
      int var8 = var1.cy - var3.cy;
      var2 = (var6 + var2) % 360;
      var3.cx = (short)((int)((double)(var7 + var0.cx) - var4 * Math.sin(Math.toRadians((double)var2))));
      var3.cy = (short)((int)((double)(var8 + var0.cy) - var4 * Math.cos(Math.toRadians((double)var2))));
      return var3;
   }

   public static XYEntity a(XYEntity var0, XYEntity var1, double var2) {
      double var4 = a((double)var0.cx, (double)var0.cy, (double)var1.cx, (double)var1.cy) / var2;
      int var6 = (int)((double)var0.cx + (double)(var1.cx - var0.cx) / var4);
      int var7 = (int)((double)var0.cy + (double)(var1.cy - var0.cy) / var4);
      return XYEntity.create(var6, var7);
   }

   public static int f() {
      Calendar var0;
      (var0 = Calendar.getInstance()).setTimeInMillis(System.currentTimeMillis() + a);
      byte var1 = 0;
      switch(var0.get(7)) {
      case 1:
         var1 = 6;
         break;
      case 2:
         var1 = 0;
         break;
      case 3:
         var1 = 1;
         break;
      case 4:
         var1 = 2;
         break;
      case 5:
         var1 = 3;
         break;
      case 6:
         var1 = 4;
         break;
      case 7:
         var1 = 5;
      }

      return var1;
   }

   public static boolean b(String var0, int var1) {
      return a((String)var0, var1, 1);
   }

   private static boolean a(String var0, int var1, int var2) {
      while(true) {
         Socket var3 = null;

         label83: {
            try {
               var3 = new Socket();
               InetSocketAddress var4 = new InetSocketAddress(var0, var1 + 1);
               var3.connect(var4, 1000 * var2);
               var3.setSoTimeout(1000 * var2);
               if (!var3.isConnected()) {
                  break label83;
               }
            } catch (Exception var15) {
               break label83;
            } finally {
               try {
                  var3.close();
               } catch (Exception var14) {
               }

            }

            return true;
         }

         if (var2 >= 5) {
            return false;
         }

         ++var2;
         var1 = var1;
         var0 = var0;
      }
   }

   public static boolean g() {
      return true;
   }

   public static boolean a(byte[] var0, String var1) {
      try {
         Socket var2 = null;
         InputStream var3 = null;
         OutputStream var4 = null;
         DataInputStream var5 = null;
         boolean var6 = false;

         label241: {
            label242: {
               try {
                  var6 = true;
                  var2 = new Socket();
                  InetSocketAddress var7 = new InetSocketAddress(DataCenter.gI().ipServerMic, DataCenter.gI().portServerRecv);
                  var2.connect(var7, 3000);
                  var3 = var2.getInputStream();
                  var5 = new DataInputStream(var3);
                  var4 = var2.getOutputStream();
                  byte[] var8 = var1.getBytes("UTF-8");
                  var4.write(new byte[]{(byte)var8.length});
                  var4.write(var8);
                  int var9 = var0.length;
                  var4.write(new byte[]{(byte)(var9 >>> 24), (byte)(var9 >>> 16), (byte)(var9 >>> 8), (byte)var9});
                  var4.write(var0);
                  var4.flush();
                  if (var5.readByte() != 1) {
                     var6 = false;
                     break label241;
                  }

                  var6 = false;
                  break label242;
               } catch (Exception var14) {
                  var6 = false;
               } finally {
                  if (var6) {
                     if (var3 != null) {
                        var3.close();
                     }

                     if (var5 != null) {
                        var5.close();
                     }

                     if (var4 != null) {
                        var4.close();
                     }

                     if (var2 != null) {
                        var2.close();
                     }
                  }

               }

               if (var3 != null) {
                  var3.close();
               }

               if (var5 != null) {
                  var5.close();
               }

               if (var4 != null) {
                  var4.close();
               }

               if (var2 != null) {
                  var2.close();
               }

               return false;
            }

            if (var3 != null) {
               var3.close();
            }

            var5.close();
            if (var4 != null) {
               var4.close();
            }

            var2.close();
            return true;
         }

         if (var3 != null) {
            var3.close();
         }

         var5.close();
         if (var4 != null) {
            var4.close();
         }

         var2.close();
      } catch (Exception var16) {
      }

      return false;
   }

   public static byte[] k(String var0) {
      try {
         Socket var1 = null;
         InputStream var2 = null;
         OutputStream var3 = null;
         DataInputStream var4 = null;
         boolean var5 = false;

         label221: {
            byte[] var6;
            try {
               var5 = true;
               var1 = new Socket();
               InetSocketAddress var7 = new InetSocketAddress(DataCenter.gI().ipServerMic, DataCenter.gI().portServerSend);
               var1.connect(var7, 3000);
               var2 = var1.getInputStream();
               var4 = new DataInputStream(var2);
               var3 = var1.getOutputStream();
               byte[] var8 = var0.getBytes("UTF-8");
               var3.write(new byte[]{(byte)var8.length});
               var3.write(var8);
               var3.flush();
               int var9;
               var8 = new byte[var9 = var4.readInt()];
               int var10 = 0;

               while(var9 > 0) {
                  int var11;
                  if (var9 - 3072 <= 0) {
                     var11 = var9;
                  } else {
                     var11 = 3072;
                  }

                  int var12;
                  if ((var12 = var4.available()) == 0) {
                     a(1L);
                  } else {
                     if (var11 > var12) {
                        var11 = var12;
                     }

                     var4.read(var8, var10, var11);
                     var10 += var11;
                     var9 -= var11;
                  }
               }

               var6 = var8;
               var5 = false;
            } catch (Exception var17) {
               var5 = false;
               break label221;
            } finally {
               if (var5) {
                  if (var2 != null) {
                     var2.close();
                  }

                  if (var4 != null) {
                     var4.close();
                  }

                  if (var3 != null) {
                     var3.close();
                  }

                  if (var1 != null) {
                     var1.close();
                  }
               }

            }

            if (var2 != null) {
               var2.close();
            }

            var4.close();
            if (var3 != null) {
               var3.close();
            }

            var1.close();
            return var6;
         }

         if (var2 != null) {
            var2.close();
         }

         if (var4 != null) {
            var4.close();
         }

         if (var3 != null) {
            var3.close();
         }

         if (var1 != null) {
            var1.close();
         }
      } catch (Exception var19) {
      }

      return null;
   }

   public static int b(int... var0) {
      try {
         int var1 = 0;

         int var2;
         for(var2 = 0; var2 < 7; ++var2) {
            var1 += var0[var2];
         }

         var2 = a(1, var1);
         int var3 = 0;

         for(int var4 = 0; var4 < 7; ++var4) {
            if ((var3 += var0[var4]) >= var2) {
               return var4;
            }
         }
      } catch (Exception var5) {
      }

      return -1;
   }

   public static String l(String var0) {
      StringBuilder var1 = new StringBuilder();

      try {
         MessageDigest var2;
         (var2 = MessageDigest.getInstance("MD5")).update(var0.getBytes("UTF8"));
         byte[] var3 = var2.digest();

         for(int var4 = 0; var4 < var3.length; ++var4) {
            if ((var3[var4] & 255) < 16) {
               var1.append("0");
            }

            var1.append(Long.toString((long)(var3[var4] & 255), 16));
         }
      } catch (Exception var5) {
      }

      return var1.toString();
   }

   public static short[] h() {
      Reader var0 = null;
      boolean var1 = false;

      short[] var2;
      label104: {
         label99: {
            short[] var5;
            try {
               var1 = true;
               String var3 = Binary.a.replace("/", "\\") + "arr_sc";
               byte[] var4;
               if ((var4 = n(var3)) != null) {
                  var0 = new Reader(var4);
                  var2 = new short[]{var0.dis.readShort(), var0.dis.readShort()};
                  var1 = false;
                  break label104;
               }

               var1 = false;
               var5 = new short[]{1024, 600};
            } catch (Exception var9) {
               var9.printStackTrace();
               var1 = false;
               break label99;
            } finally {
               if (var1 && var0 != null) {
                  var0.close();
               }

            }

            return var5;
         }

         if (var0 != null) {
            var0.close();
         }

         return new short[]{1024, 600};
      }

      var0.close();
      return var2;
   }

   public static void a(String var0, byte[] var1) {
      try {
         try {
            FileOutputStream var2;
            (var2 = new FileOutputStream(var0)).write(var1);
            var2.close();
         } catch (Exception var6) {
         }

      } finally {
         ;
      }
   }

   public static int m(String var0) {
      byte[] var1;
      return (var1 = n(var0)) != null ? var1.length : 0;
   }

   public static byte[] n(String var0) {
      FileInputStream var1 = null;
      boolean var2 = false;

      label138: {
         byte[] var3;
         try {
            var2 = true;
            File var4;
            if (!(var4 = new File(var0)).exists()) {
               Object var5 = null;
               return (byte[])var5;
            }

            var1 = new FileInputStream(var4);
            var3 = new byte[(int)var4.length()];
            var1.read(var3, 0, var3.length);
            var3 = var3;
            var2 = false;
         } catch (Exception var20) {
            var2 = false;
            break label138;
         } finally {
            if (var2) {
               try {
                  if (var1 != null) {
                     var1.close();
                  }
               } catch (Exception var18) {
               }
            }

         }

         try {
            var1.close();
         } catch (Exception var19) {
         }

         return var3;
      }

      try {
         if (var1 != null) {
            var1.close();
         }
      } catch (Exception var17) {
      }

      return null;
   }

   public static int n(int var0) {
      return (int)a((float)var0);
   }

   public static float a(float var0) {
      return mConfig.gI().a(15) ? var0 * ((float)(DataCenter.gI().r + 1) / (float)DataCenter.gI().r) : var0;
   }

   public static byte[] c(byte[] var0) {
      Inflater var1;
      (var1 = new Inflater()).setInput(var0);
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      byte[] var3 = new byte[4096];

      try {
         while(!var1.finished()) {
            int var4 = var1.inflate(var3);
            var2.write(var3, 0, var4);
         }

         byte[] var17 = var2.toByteArray();
         byte[] var5 = var17;
         return var5;
      } catch (Exception var15) {
      } finally {
         try {
            var2.close();
         } catch (Exception var14) {
         }

      }

      return var0;
   }

   public static boolean a(XYEntity[] var0, XYEntity[] var1) {
      if (var0 != null && var1 != null) {
         return var0[0].equals(var1[0]) && var0[1].equals(var1[1]);
      } else {
         return false;
      }
   }

   public static XYEntity b(XYEntity var0, XYEntity var1, int var2) {
      double var3 = (double)(var1.cx - var0.cx);
      double var5 = (double)(var1.cy - var0.cy);
      double var7 = (double)(var0.cx - var0.cx);
      double var9 = (double)(var0.cy - var0.cy);
      double var11 = var3 * var3 + var5 * var5;
      double var13 = var3 * var7 + var5 * var9;
      double var15 = var7 * var7 + var9 * var9 - (double)(var2 * var2);
      double var17 = var13 / var11;
      double var19 = var15 / var11;
      double var21;
      if ((var21 = var17 * var17 - var19) < 0.0D) {
         return null;
      } else {
         double var23 = Math.sqrt(var21);
         double var25 = -var17 + var23;
         double var27 = -var17 - var23;
         XYEntity var29;
         if (a((var29 = XYEntity.create((int)((double)var0.cx - var3 * var25), (int)((double)var0.cy - var5 * var25))).cx, var29.cy, var0, var1)) {
            return var29;
         } else {
            return var21 == 0.0D ? null : XYEntity.create((int)((double)var0.cx - var3 * var27), (int)((double)var0.cy - var5 * var27));
         }
      }
   }

   public static String o(String var0) {
      if (var0 != null && !var0.isEmpty()) {
         StringBuilder var1 = new StringBuilder();

         for(int var2 = 0; var2 < var0.length(); ++var2) {
            var1.append(Graphics.p.indexOf(var0.charAt(var2)));
         }

         return var1.toString();
      } else {
         return null;
      }
   }
}
