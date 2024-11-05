package gro;

import com.badlogic.gdx.graphics.Pixmap;
import java.util.Vector;

public final class vdtt_bv extends vdtt_k {
   public static mImage l;
   private boolean m;
   private static int n;

   public vdtt_bv(int var1, int var2, int var3, int var4, vdtt_w var5) {
      this.setXY(var1, var2);
      this.setSize(90, 32);
      this.a = var5;
      this.m = false;
   }

   public final void b(Graphics var1) {
      try {
         if (!this.m) {
            this.m = true;
            Binary.b(l);
            Pixmap var2 = (l = mImage.a(this.width * DataCenter.gI().r, this.height * DataCenter.gI().r)).b;
            GameSrc.gI().a(var2, this, 0, 0, 0);

            try {
               if (GameSrc.gI().bq != null && GameSrc.gI().bq.vMember.size() != 0) {
                  for(int var3 = 0; var3 < GameSrc.gI().bq.vMember.size() && var3 < 6; ++var3) {
                     Member var4;
                     mImage var5 = vdtt_cz.c((var4 = (Member)GameSrc.gI().bq.vMember.get(var3)).a());
                     EntityPanel var6;
                     (var6 = new EntityPanel()).setSize(9, 9);
                     vdtt_y.a(l, var5, 3 * DataCenter.gI().r, (2 + var3 * 11) * DataCenter.gI().r, 40, 20);
                     GameSrc.gI();
                     GameSrc.a(var2, var6, 3, 2 + var3 * 11, 0, 0);
                     if (var3 == 0) {
                        vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Pixmap)var2, "c#yellow" + var4.name, 16, 6 + var3 * 11, 0, -1, -10275328);
                     } else {
                        vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Pixmap)var2, var4.name, 16, 6 + var3 * 11, 0, -1, -10275328);
                     }
                  }
               } else {
                  vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Pixmap)var2, Caption.sz + " (0)", 6, 6, 0, -6488, -10275328);
               }
            } catch (Exception var7) {
            }

            GameSrc.gI().aA.a(this.width, (short)(this.height + 14));
            DataCenter.gI().aQ = false;
         }

         if (GameSrc.gI().aA.e()) {
            var1.a(l, 0, 0);
         } else if (!GameSrc.gI().aA.d()) {
            return;
         }

         if (GameSrc.gI().bq != null && GameSrc.gI().bq.vMember.size() != 0) {
            for(int var9 = 0; var9 < GameSrc.gI().bq.vMember.size() && var9 < 6; ++var9) {
               Member var10 = (Member)GameSrc.gI().bq.vMember.get(var9);
               if (var9 == 0) {
                  vdtt_dd.d(vdtt_dd.b, var1, "c#yellow" + var10.name, 16, 7 + var9 * 11, 0, -1, -10275328);
               } else {
                  vdtt_dd.d(vdtt_dd.b, var1, var10.name, 16, 7 + var9 * 11, 0, -1, -10275328);
               }
            }

            return;
         }

         vdtt_dd.d(vdtt_dd.c, var1, Caption.sz + " (0)", this.cx + 4, 6, 0, -6488, 0);
      } catch (Exception var8) {
      }

   }

   public final void a_() {
      int var1 = 0;
      if (GameSrc.gI().bq != null) {
         var1 = GameSrc.gI().bq.vMember.size();
      }

      if (var1 > 6) {
         var1 = 6;
      }

      int var2 = var1 * 12;
      if (var1 != n || this.height != var2) {
         n = var1;
         if (var2 < 32) {
            var2 = 32;
         }

         this.setSize(this.width, var2);
         this.m = false;
      }

      if (Utlis.a(this.cx, this.cy, this.cx + this.width, this.cy + var2, DataCenter.gI().pointHelper.c, DataCenter.gI().pointHelper.d)) {
         DataCenter.gI().pointHelper.b = false;
      }

   }

   public final Vector g() {
      Vector var1 = new Vector();
      if (!GameSrc.gI().aA.d()) {
         return var1;
      } else {
         var1.addElement(new vdtt_hi(4000, 0, 0, this.width, this.height, (vdtt_hp)null, this));
         return var1;
      }
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      switch(var1.b) {
      case 4000:
         vdtt_mn.ac = 0;
         GameSrc.gI().a((vdtt_w)(new vdtt_mn(GameSrc.gI())));
         vdtt_aa.gI().o();
         vdtt_aa.gI().w();
      default:
      }
   }

   public final void r() {
      super.r();
   }
}
