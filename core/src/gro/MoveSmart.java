package gro;

import java.util.Hashtable;
import java.util.Vector;

public final class MoveSmart {
   private static int a;
   private static int b;
   private static int c;
   private static int d;
   private static int e;
   private static int f;
   private static Vector g = new Vector();
   private static Object h = new Object();
   private static boolean i;
   private static int j = 0;
   private static int k = 0;

   public static void a() {
      i = true;
      g.removeAllElements();

      try {
         (new Thread(new vdtt_fc())).start();
      } catch (Exception var1) {
         Utlis.a(var1);
      }

   }

   public static void b() {
      i = false;
      g.clear();
      m();
   }

   private static void m() {
      synchronized(h) {
         h.notify();
      }
   }

   public static void a(int var0, int var1, int var2) {
      if (k != 2) {
         a = var0;
         b = var1;
         c = var2;
         i = true;
         g.clear();
         d = GameSrc.gI().mapID;
         e = Char.gI().cx;
         f = Char.gI().cy;
         j = 0;
         if (GameSrc.gI().V.a(b, c)) {
            XYEntity var3;
            b = (var3 = GameSrc.gI().V.b(b, c)).cx;
            c = var3.cy;
         }

         if (GameSrc.gI().dd > 0) {
            g.add(XYEntity.create(e, f));
            g.add(XYEntity.create(b, c));
            i = false;
         } else {
            m();
         }
      }

   }

   public static Vector c() {
      return g;
   }

   public static void d() {
      if (g.size() > 0 && Char.gI().pointMove == null) {
         g.removeElementAt(0);
         if (g.size() > 0) {
            XYEntity var0;
            if ((var0 = (XYEntity)g.firstElement()).cx > GameSrc.gI().maxX - 17) {
               var0.cx = (short)(GameSrc.gI().maxX - 17);
            }

            if (var0.cx < 16) {
               var0.cx = 16;
            }

            short var1 = Char.gI().cx;
            short var2 = var0.cx;
            if (var1 > var2) {
               var1 = var0.cx;
               var2 = Char.gI().cx;
            }

            vdtt_gj var3 = new vdtt_gj(var0.cx, var0.cy, Char.gI().typePk, Char.gI().typePk);
            if (GameSrc.gI().dd > 0) {
               GameSrc var5 = GameSrc.gI();
               short var6 = Char.gI().cx;
               short var7 = var0.cy;
               short var8 = var0.cx;
               short var9 = Char.gI().cy;
               GameSrc var10 = var5;
               XYEntity var11 = XYEntity.create(var6, var9);
               XYEntity var12 = XYEntity.create(var8, var7);
               int var13 = 0;

               boolean var14;
               label92:
               while(true) {
                  if (var13 >= var10.dN.size()) {
                     for(var13 = 0; var13 < var10.dM.size(); ++var13) {
                        if (Utlis.a(var11, var12, ((vdtt_fw)var10.dM.get(var13)).d[0], ((vdtt_fw)var10.dM.get(var13)).d[1]) != null) {
                           var14 = true;
                           break label92;
                        }
                     }

                     var14 = false;
                     break;
                  }

                  if (Utlis.a(var11, var12, ((vdtt_fw)var10.dN.get(var13)).d[0], ((vdtt_fw)var10.dN.get(var13)).d[1]) != null) {
                     var14 = true;
                     break;
                  }

                  ++var13;
               }

               if (var14) {
                  short var15 = GameSrc.gI().maxY;

                  for(int var16 = 0; var16 < GameSrc.gI().dN.size(); ++var16) {
                     if (var1 <= ((vdtt_fw)GameSrc.gI().dN.get(var16)).d[0].cx && ((vdtt_fw)GameSrc.gI().dN.get(var16)).d[0].cx <= var2 && ((vdtt_fw)GameSrc.gI().dN.get(var16)).d[0].cy < var15) {
                        var15 = ((vdtt_fw)GameSrc.gI().dN.get(var16)).d[0].cy;
                     }
                  }

                  --var15;
                  if (Char.gI().cy <= var15) {
                     if (Char.gI().cx != var0.cx) {
                        var3 = new vdtt_gj(var0.cx, Char.gI().cy, Char.gI().typePk, Char.gI().typePk);
                     }
                  } else {
                     var3 = new vdtt_gj(Char.gI().cx, var15, Char.gI().typePk, Char.gI().typePk);
                  }

                  g.insertElementAt(var0, 0);
               }
            }

            Char.gI().pointMove = var3;
            Char.gI().a(Char.gI().pointMove);
            int var17 = Char.gI().cy - var0.cy;
            if (GameSrc.gI().dd == 0 && Utlis.b(var17) > 2) {
               if (g.size() > 1) {
                  if (((XYEntity)g.get(1)).cx < Char.gI().pointMove.cx) {
                     --Char.gI().pointMove.cx;
                  } else {
                     ++Char.gI().pointMove.cx;
                  }
               }

               short var4 = Char.gI().pointMove.cx;
               var1 = Char.gI().pointMove.cy;
               if (Utlis.b(Char.gI().pointMove.cx - Char.gI().cx) < 5) {
                  if (var17 >= 0) {
                     Char.gI().a(true, var17);
                     Char.gI().pointMove.n = var4;
                     Char.gI().pointMove.cy = var0.cy;
                     Char.gI().pointMove.j = true;
                     return;
                  }
               } else {
                  if (var17 < 0) {
                     Char.gI().a(true, GameSrc.dK);
                     Char.gI().pointMove.j = true;
                     Char.gI().pointMove.n = var4;
                     Char.gI().pointMove.o = var1;
                     return;
                  }

                  Char.gI().a(true, GameSrc.dK);
                  Char.gI().pointMove.n = var4;
               }
            }
         }
      }

   }

   public static boolean e() {
      return g.size() > 0;
   }

   static Object f() {
      return h;
   }

   static int a(int var0) {
      k = var0;
      return var0;
   }

   static boolean g() {
      return i;
   }

   static int h() {
      return e;
   }

   static int i() {
      return f;
   }

   static int j() {
      return b;
   }

   static int k() {
      return c;
   }

   static int b(int var0) {
      b = var0;
      return var0;
   }

   static int c(int var0) {
      c = var0;
      return var0;
   }

   static Vector l() {
      return g;
   }

   static boolean a(boolean var0) {
      i = false;
      return false;
   }

   static int d(int var0) {
      f = var0;
      return var0;
   }

   static int a(vdtt_gm var0, String var1, String var2, int var3, int var4, Hashtable var5) {
      var4 = Integer.MAX_VALUE;
      var3 = var3;
      var2 = var2;
      var0 = var0;
      var5 = (Hashtable)var5.clone();
      Vector var6;
      (var6 = new Vector()).add(new vdtt_gm(0, var1, new Vector()));
      int var7 = 0;

      while(i && var6.size() > 0) {
         ++var7;
         if (var7 > var4) {
            break;
         }

         vdtt_gm var8;
         Vector var9;
         (var9 = (var8 = (vdtt_gm)var6.remove(var6.size() - 1)).a).add(var8.c);
         if (var9.size() > 100) {
            break;
         }

         XYEntity var10;
         XYEntity var11;
         if (var9.size() > 1) {
            var10 = XYEntity.c((String)var9.get(var9.size() - 1));
            var11 = XYEntity.c((String)var9.get(var9.size() - 2));
            var8.b += Utlis.a(var10.cx, var10.cy, var11.cx, var11.cy);
            if (var8.b > var0.b) {
               continue;
            }
         }

         vdtt_gn var12;
         if ((var12 = (vdtt_gn)var5.remove(var8.c)) != null) {
            Vector var13;
            label63:
            switch(var3) {
            case 1:
               var13 = var12.b;
               break;
            case 2:
               var13 = var12.c;
               break;
            case 3:
               var13 = var12.d;
               break;
            case 4:
               var13 = var12.e;
               break;
            case 5:
               var13 = var12.f;
               break;
            case 6:
               var13 = new Vector();
               Vector var14 = new Vector(var12.a);

               while(true) {
                  if (var14.size() <= 0) {
                     break label63;
                  }

                  var13.add(var14.remove(Utlis.a(var14.size())));
               }
            default:
               var13 = var12.a;
            }

            if (var13 == null) {
               var13 = var12.a;
            }

            for(int var16 = var13.size() - 1; var16 >= 0; --var16) {
               String var15;
               if ((var15 = (String)var13.get(var16)).equals(var2)) {
                  var9.add(var2);
                  var10 = XYEntity.c((String)var9.get(var9.size() - 1));
                  var11 = XYEntity.c((String)var9.get(var9.size() - 2));
                  var8.b += Utlis.a(var10.cx, var10.cy, var11.cx, var11.cy);
                  if (var8.b < var0.b) {
                     var0.b = var8.b;
                     var0.a = var8.a;
                  }
               } else if (!var9.contains(var15)) {
                  var6.add(new vdtt_gm(var8.b, var15, new Vector(var9)));
               }
            }
         }
      }

      return var7;
   }
}
