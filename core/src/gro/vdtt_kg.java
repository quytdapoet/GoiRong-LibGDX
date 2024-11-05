package gro;

import java.util.Collections;
import java.util.Vector;

public final class vdtt_kg extends vdtt_ap {
   private vdtt_by a;
   private vdtt_li b;
   private Vector c;
   private vdtt_hp d;
   private int M = 0;

   public vdtt_kg(MainScreen var1, vdtt_li var2) {
      this.e = 2;
      this.H = var1;
      this.b = var2;
      this.J = false;
      this.a(180, 202);
      this.a = new vdtt_by(10, 20, 115, Caption.as, this, 0, 0);
      this.a(this.a);
      this.a(this.a.cx + this.a.width + 7, this.a.cy + 1, Caption.km, this, 1002, -8).setSize(40, 20);
      this.c = new Vector();

      for(int var3 = 0; var3 < GameSrc.gI().vFriend.size(); ++var3) {
         Friend var4;
         if ((var4 = (Friend)GameSrc.gI().vFriend.elementAt(var3)).isOnline) {
            this.c.add(var4);
         }
      }

      if (GameSrc.gI().ac.size() != 0 && this.c.size() != 0) {
         Collections.sort(this.c, new vdtt_kh(this));
      }

      this.d = new vdtt_hp((byte)1, 10, this.f() + 18, super.width - 8 - 12, 147, 21, this.c.size());
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.e(var1);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.bH, 10, 10, 0, -1, -16777216);

      try {
         this.a(var1, this.d);

         for(int var2 = 0; var2 < this.d.i; ++var2) {
            if (this.d.b(var2)) {
               Friend var3 = (Friend)this.c.elementAt(var2);
               if (var2 == this.d.k) {
                  vdtt_cz.a(var1, 0, var2 * this.d.h, this.d.width, this.d.h - 1);
               }

               if (var3.isOnline) {
                  vdtt_cz.a(var1, 302, 0, 5, 6 + var2 * this.d.h, 20);
               } else if (var3.type == 1) {
                  vdtt_cz.a(var1, 304, 0, 5, 6 + var2 * this.d.h, 20);
               } else {
                  vdtt_cz.a(var1, 303, 0, 5, 6 + var2 * this.d.h, 20);
               }

               if (var2 == this.d.l) {
                  vdtt_dd.b(vdtt_dd.d, var1, var3.name + (var3.type == 2 ? Caption.gZ : ""), 20, 9 + var2 * this.d.h, 0, -3089954, -16777216);
               } else {
                  vdtt_dd.b(vdtt_dd.d, var1, var3.name + (var3.type == 2 ? Caption.gZ : ""), 19, 10 + var2 * this.d.h, 0, -3089954, -16777216);
               }
            }
         }

         this.a(var1);
      } catch (Exception var4) {
      }

      this.d.a(var1, -15, -8, -16777216);
   }

   public final void a_() {
      try {
         this.d.a();
         if (this.M != this.a.i().length()) {
            vdtt_kg var1 = this;
            String var2;
            if ((var2 = this.a.i().toLowerCase().trim()) != null && !var2.trim().equals("")) {
               for(int var3 = 0; var3 < var1.c.size(); ++var3) {
                  if (((Friend)var1.c.get(var3)).name.toLowerCase().contains(var2)) {
                     var1.d.k = var3;
                     var1.d.a(var3);
                     break;
                  }
               }
            }

            this.M = this.a.i().length();
         }
      } catch (Exception var4) {
      }

   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(this.d.a(1003, this));
      var1.addElement(new vdtt_hi(0, 0, 0, this.width, this.height, this.I, this));
      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      String var4;
      switch(var1.b) {
      case 1001:
         return;
      case 1002:
         vdtt_kg var5 = this;
         if ((var4 = this.a.i().toLowerCase().trim()) != null && !var4.trim().equals("")) {
            var3 = this.d.k + 1;

            while(true) {
               if (var3 >= var5.c.size()) {
                  return;
               }

               if (((Friend)var5.c.get(var3)).name.toLowerCase().contains(var4)) {
                  var5.d.k = var3;
                  var5.d.a(var3);
                  break;
               }

               ++var3;
            }
         }
         break;
      case 1003:
         if (var1.j.k >= 0) {
            vdtt_li var6 = this.b;
            var4 = ((Friend)this.c.elementAt(this.d.k)).name;
            var6.Q.a(var4);
            this.k();
         }
      }

   }

   static int a(vdtt_kg var0, String var1) {
      String var2 = var1;

      for(int var3 = 0; var3 < GameSrc.gI().ac.size(); ++var3) {
         if (((String)GameSrc.gI().ac.get(var3)).equals(var2)) {
            return var3;
         }
      }

      return -1;
   }
}
