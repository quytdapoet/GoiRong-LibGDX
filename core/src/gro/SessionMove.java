package gro;

public final class SessionMove {
   public static short a;
   public static short b;
   public static Message c = null;

   public static void a(boolean var0) {
      try {
         if (Char.gI().cy < 30) {
            Char.gI().cy = 30;
         }

         if (!GameSrc.d && Char.gI().aX == null) {
            if (Char.gI().aW == null && !GameSrc.gI().cn && Utlis.a() - GameSrc.N >= 500L) {
               int var1 = Char.gI().cx - a;
               int var2 = Char.gI().cy - b;
               if ((var1 == 0 || var2 == 0) && var1 <= 127 && var1 >= -128 && var2 <= 127 && var2 >= -128) {
                  if (var1 != 0) {
                     a = Char.gI().cx;
                     b = Char.gI().cy;
                     if (Char.gI().status != 2 && Char.gI().status != 7) {
                        Session.gI().c(var1);
                     } else {
                        Session.gI().a(var1);
                     }
                  } else if (var2 != 0) {
                     a = Char.gI().cx;
                     b = Char.gI().cy;
                     if (Char.gI().status != 2 && Char.gI().status != 7) {
                        Session.gI().d(var2);
                        return;
                     }

                     Session.gI().b(var2);
                  }
               } else {
                  a = Char.gI().cx;
                  b = Char.gI().cy;
                  if (Char.gI().status != 2 && Char.gI().status != 7) {
                     Session.gI().b(a, b);
                  } else {
                     Session.gI().a(a, b);
                  }
               }
            }
         } else {
            a = Char.gI().cx;
            b = Char.gI().cy;
         }
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }
}
