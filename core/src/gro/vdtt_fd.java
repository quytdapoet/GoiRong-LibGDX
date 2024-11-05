package gro;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import java.util.Vector;

public final class vdtt_fd {
   private static Vector f = new Vector();
   public byte a;
   public String b;
   public XYEntity c;
   public int d;
   public int e;
   private int g;
   private int h;
   private int i;

   public static void a() {
      f.clear();
   }

   public static void a(String var0, XYEntity var1, int var2, int var3) {
      a(var0, var1, var2, var3, -2560, -48128);
   }

   public static void a(String var0, XYEntity var1, int var2, int var3, int var4, int var5) {
      if (Utlis.b(var1.cx, var1.cy, Char.gI().cx, Char.gI().cy) <= 300) {
         Vector var6 = new Vector();

         vdtt_fd var7;
         int var8;
         for(var8 = 0; var8 < f.size(); ++var8) {
            if ((var7 = (vdtt_fd)f.elementAt(var8)).a == 0 || var7.a == 3) {
               var6.add(var7);
            }
         }

         if ((var8 = var6.size() - 10) > 0) {
            for(int var9 = 0; var9 < var8; ++var9) {
               var7 = (vdtt_fd)var6.elementAt(var9);
               f.remove(var7);
            }
         }

         if (f.size() > 80) {
            f.remove(0);
         }

         f.addElement(new vdtt_fd(var0, var1, var2, var3, var4, var5));
      }

   }

   public static void b() {
      for(int var0 = 0; var0 < f.size(); ++var0) {
         vdtt_fd var1;
         if ((var1 = (vdtt_fd)f.elementAt(var0)).a != 0 && var1.a != 1 && var1.a != 2 && var1.a != 3 && var1.a != 4 && var1.a != 5 && var1.a != 6 && var1.a != 14) {
            ++var1.e;
            if (var1.e > 20) {
               f.removeElement(var1);
            }
         } else {
            var1.e += var1.g;
            if (DataCenter.gI().h % 5 == 0) {
               --var1.g;
            }

            if (var1.g <= 0) {
               var1.g = 1;
            }

            if (var1.e > 40) {
               f.removeElement(var1);
            }
         }
      }

   }

   public static void a(Graphics var0) {
      for(int var1 = 0; var1 < f.size(); ++var1) {
         vdtt_fd var2 = (vdtt_fd)f.elementAt(var1);
         int var3;
         if ((var3 = 40 - var2.e) < 0) {
            var3 = 0;
         }

         switch(var2.a) {
         case 0:
         case 2:
            vdtt_dd.a((BitmapFont)Graphics.b((float)(25 + var3)), (Graphics)var0, var2.b, var2.c.cx, var2.c.cy - var2.d - var2.e, 2, -337404, 0);
            break;
         case 1:
            vdtt_dd.a((BitmapFont)Graphics.b((float)(40 + var3)), (Graphics)var0, var2.b, var2.c.cx, var2.c.cy - var2.d - var2.e, 2, -721078, 0);
            break;
         case 3:
            vdtt_dd.a((BitmapFont)Graphics.b((float)(25 + var3)), (Graphics)var0, var2.b, var2.c.cx, var2.c.cy - var2.d - var2.e, 2, -246724, 0);
            break;
         case 4:
            vdtt_dd.a((BitmapFont)Graphics.b((float)(36 + var3)), (Graphics)var0, var2.b, var2.c.cx, var2.c.cy - var2.d - var2.e, 2, -48128, 0);
         case 5:
            vdtt_dd.a((BitmapFont)Graphics.b((float)(25 + var3)), (Graphics)var0, var2.b, var2.c.cx, var2.c.cy - var2.d - var2.e, 2, -337404, 0);
            break;
         case 6:
            vdtt_dd.a((BitmapFont)Graphics.b((float)(25 + var3)), (Graphics)var0, var2.b, var2.c.cx, var2.c.cy - var2.d - var2.e + 5, 2, -16647031, 0);
            break;
         case 7:
         case 8:
         case 9:
         case 10:
         case 12:
            int var4 = var0.e;
            int var5 = var0.f;
            a(var0, 0, 0);
            switch(var2.a) {
            case 7:
               var0.p();
               vdtt_dd.a((BitmapFont)Graphics.b((float)(25 + var3)), (Graphics)var0, var2.b, DataCenter.gI().n / 2, DataCenter.gI().o - 90 - var2.e, 2, 0, 0);
               var0.r();
               break;
            case 8:
               vdtt_dd.a((BitmapFont)Graphics.b((float)(25 + var3)), (Graphics)var0, var2.b, DataCenter.gI().n / 2, DataCenter.gI().o - 90 - var2.e, 2, -1, 0);
               break;
            case 9:
            case 10:
               vdtt_dd.a((BitmapFont)Graphics.b((float)(25 + var3)), (Graphics)var0, var2.b, DataCenter.gI().n / 2, DataCenter.gI().o - 90 - var2.e, 2, -76032, 0);
            case 11:
            case 12:
            }

            a(var0, var4, var5);
            break;
         case 11:
            vdtt_dd.a((BitmapFont)Graphics.b((float)(25 + var3)), (Graphics)var0, var2.b, var2.c.cx, var2.c.cy - var2.d - var2.e, 2, -337404, 0);
            break;
         case 13:
            vdtt_dd.a((BitmapFont)Graphics.b((float)(25 + var3)), (Graphics)var0, var2.b, var2.c.cx, var2.c.cy - var2.d - var2.e + 5, 2, -16742145, 0);
            break;
         case 14:
            if (DataCenter.gI().h % 10 > 5) {
               vdtt_dd.a((BitmapFont)Graphics.b((float)(25 + var3)), (Graphics)var0, var2.b, var2.c.cx, var2.c.cy - var2.d - var2.e + 5, 2, var2.h, 0);
            } else {
               vdtt_dd.a((BitmapFont)Graphics.b((float)(25 + var3)), (Graphics)var0, var2.b, var2.c.cx, var2.c.cy - var2.d - var2.e + 5, 2, var2.i, 0);
            }
         }
      }

   }

   private vdtt_fd(String var1, XYEntity var2, int var3, int var4, int var5, int var6) {
      switch(var4) {
      case 2:
      case 5:
         this.b = Caption.fN;
         break;
      case 3:
      case 4:
      case 11:
      default:
         this.b = var1;
         break;
      case 6:
         this.b = var1 + Caption.fO;
         break;
      case 7:
         this.b = var1 + Caption.fP;
         break;
      case 8:
         this.b = var1 + Caption.fQ;
         break;
      case 9:
         this.b = var1 + Caption.fR;
         break;
      case 10:
         this.b = var1 + Caption.fS;
         break;
      case 12:
         this.b = var1 + Caption.pb;
      }

      this.c = var2;
      this.d = var3;
      this.a = (byte)var4;
      this.h = var5;
      this.i = var6;
      this.g = 3;
   }

   private static void a(Graphics var0, int var1, int var2) {
      var0.a(-var0.e, -var0.f);
      var0.a(var1, var2);
   }
}
