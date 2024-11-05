package gro;

import java.util.Collections;
import java.util.Vector;

public final class vdtt_mf extends vdtt_ap {
   private int a;
   private int b;
   private int c = -1;
   private Char d;
   private vdtt_hp M;
   private Skill N;
   private vdtt_ap O;

   public vdtt_mf(MainScreen var1, vdtt_ap var2, Char var3, Skill var4) {
      this.e = 2;
      this.H = var1;
      this.d = var3;
      this.J = false;
      this.N = var4;
      this.O = var2;
      this.a(200, 118);
      this.a(this.width / 2 - 35, this.height - 25, Caption.bI, this, 1002, -8);
      this.a = this.width / 2 + 64 + 2;
      this.b = 50;
      GameSrc.gI();
      this.M = new vdtt_hp((byte)0, this.width / 2 - 96, this.b, 192, 28, 32, 6);
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.e(var1);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.sT, 10, 25, 0, -1, -16777216);
      int var2 = GameSrc.gI().bm.size();
      GameSrc.gI();
      if (var2 > 7) {
         var2 = 7;
      }

      for(int var3 = 0; var3 < var2; ++var3) {
         for(int var4 = 0; var4 < GameSrc.gI().bm.size(); ++var4) {
            Skill var5;
            if ((var5 = (Skill)GameSrc.gI().bm.get(var4)).d == GameSrc.gI().B()[var3] && var3 > 0) {
               int var6 = var3 - 1;
               vdtt_dd.b(vdtt_dd.f, var1, "" + var3, this.a - 32 * var6 + 16, this.b - 8, 2, -8847903, 0);
               b(var1, this.a - 32 * var6, this.b, (Item)null, this.c == var3);
               var5.a(var1, this.d, this.a - 32 * var6 + 2, this.b + 2);
               if (var5.d == 30) {
                  vdtt_y.a(var1, -39, 0, this.a - 32 * var6 + 1, this.b + 1, 26, (int)26);
               }
            }
         }
      }

   }

   public final void a_() {
      this.M.a();
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(this.M.a(3000, this));
      var1.addElement(new vdtt_hi(0, 0, 0, this.width, this.height, this.I, this));
      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      int var5;
      switch(var1.b) {
      case 1002:
         vdtt_mf var4 = this;
         if (this.c > 0) {
            var2 = -1;

            for(var3 = 0; var3 < GameSrc.gI().B().length; ++var3) {
               if (var4.N.d == GameSrc.gI().da[var3]) {
                  var2 = var3;
                  break;
               }
            }

            if (var2 > 0) {
               short var7 = GameSrc.gI().da[var4.c];

               for(int var6 = 0; var6 < GameSrc.gI().bm.size(); ++var6) {
                  if (((Skill)GameSrc.gI().bm.elementAt(var6)).d == var7) {
                     GameSrc.gI().da[var2] = var7;
                     GameSrc.gI().da[var4.c] = var4.N.d;
                     Collections.swap(GameSrc.gI().bm, var2, var4.c);
                     break;
                  }
               }
            } else {
               GameSrc.gI().da[var4.c] = var4.N.d;

               for(var5 = 0; var5 < GameSrc.gI().bm.size(); ++var5) {
                  if (((Skill)GameSrc.gI().bm.elementAt(var5)).d == var4.N.d) {
                     Collections.swap(GameSrc.gI().bm, var5, var4.c);
                     break;
                  }
               }
            }

            GameSrc.gI().X();
         }

         this.k();
         return;
      case 3000:
         GameSrc.gI();
         if ((var5 = 6 - var1.j.k) > 0) {
            this.c = var5;
         }
      default:
      }
   }
}
