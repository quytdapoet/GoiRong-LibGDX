package gro;

import java.util.Vector;

public class vdtt_li extends vdtt_jo {
   public final vdtt_ay N;
   public vdtt_by O;
   public vdtt_by P;
   public vdtt_by Q;
   public vdtt_bz R;
   private vdtt_hp T;
   public Item S;
   private boolean U;

   public vdtt_li(MainScreen var1, String[] var2) {
      super(var1, var2);
      this.J = false;
      this.a(299, 212);
      vdtt_hm var3;
      (var3 = new vdtt_hm(-1000)).c = new String[3];

      int var4;
      for(var4 = 0; var4 <= 0; ++var4) {
         var3.c[0] = var2[0];
      }

      var3.c[1] = Caption.J;
      var3.c[2] = Caption.y;
      this.a(var3, 210, 88, 3);
      this.P = this.a(65, this.f() + 5, 204, "", this, 0);
      byte var5 = 26;
      this.P.l = var5;
      this.P.b(Caption.hE);
      this.P.setSize(204, 21);
      this.a(this.P, this.w() - 1);
      this.Q = this.a(65, this.f() + 30, 204, "", this, 0);
      var5 = 26;
      this.Q.l = var5;
      this.Q.a("");
      this.Q.b(Caption.hq);
      this.Q.setSize(204, 21);
      this.a(this.Q, this.w() - 1);
      this.O = this.b(65, this.f() + 55, 204, Caption.hk, this, 3);
      this.a(this.O, this.w() - 1);
      this.a(this.ag, this.w());
      this.a(this.af, this.w());
      this.R = new vdtt_bz(65, this.O.cy + this.O.height + 3, 92, "", this, 0, 2, 0);
      this.R.a("");
      this.a(this.R, this.w() - 1);
      vdtt_ay var6 = this.a(this.width - 90, this.height - 33, Caption.D, this, 0, -8);
      this.a(var6, this.w() - 1);
      var6 = this.a(this.width - 156, this.height - 33, Caption.hl, this, 1, -8);
      this.a(var6, this.w() - 1);
      this.N = this.a(this.Q.cx + this.Q.width + 5, this.Q.cy + 1, Caption.bI, this, 2, -8);
      this.N.setSize(34, 20);
      this.a(this.N, this.w() - 1);
      this.T = new vdtt_hp((byte)1, 239, this.O.cy + this.O.height + 3, 28, 28, 28, 1);
      GameSrc.gI().ac = new Vector();
      Reader var7 = null;

      try {
         if ((var7 = Binary.a("mail_name_caches" + Char.gI().idEntity)) != null) {
            short var8 = var7.dis.readShort();

            for(var4 = 0; var4 < var8; ++var4) {
               GameSrc.gI().ac.add(Utlis.e(var7.readUTF()));
            }
         }
      } catch (Exception var12) {
         Utlis.a(var12);
      } finally {
         if (var7 != null) {
            var7.close();
         }

      }

      this.N.b(GameSrc.gI().ac.isEmpty());
   }

   public void b(int var1, Object var2) {
   }

   public void a_() {
      super.a_();
      if (super.a.b == this.w() - 1) {
         this.T.a();
      }

   }

   public void b(Graphics var1) {
      if (this.w() <= 0) {
         this.a(var1, this.cx, this.cy, this.width, this.height, Caption.y, (byte)2, this.J);
      } else {
         super.b(var1);
      }

      if (super.a.b == this.w() - 1) {
         vdtt_dd.b(vdtt_dd.d, var1, Caption.he, 60, this.f() + 14, 1, -6488, -10275328);
         vdtt_dd.b(vdtt_dd.d, var1, Caption.hm, 60, this.f() + 39, 1, -6488, -10275328);
         vdtt_dd.b(vdtt_dd.d, var1, Caption.cC, 60, this.f() + 63, 1, -6488, -10275328);
         vdtt_dd.b(vdtt_dd.d, var1, Caption.hg, 60, this.f() + 114, 1, -6488, -10275328);
         vdtt_dd.b(vdtt_dd.d, var1, Caption.hn, 233, this.f() + 114, 1, -6488, -10275328);
         vdtt_dd.b(vdtt_dd.d, var1, Caption.ho, 60, this.f() + 153, 1, -6488, -10275328);
         vdtt_dd.b(vdtt_dd.d, var1, "10", 65, this.f() + 153, 0, -3089954, -16777216);
         a(var1, 65, this.f() + 153, "10", (byte)0);
         if (this.R.h() > 0) {
            vdtt_dd.b(vdtt_dd.d, var1, "1%", 65, this.f() + 170, 0, -3089954, -16777216);
            a(var1, 65, this.f() + 170, "1%", (byte)0);
         }

         a(var1, this.T.cx, this.T.cy, this.S, this.U);
      }

   }

   public Vector g() {
      Vector var1 = super.g();
      if (this.w() <= 0) {
         var1.removeElementAt(0);
      }

      if (super.a.b == this.w() - 1) {
         var1.add(this.T.a(2000, this));
         var1.addElement(new vdtt_hi(2002, 35, 188, 95, 215, (vdtt_hp)null, this));
         var1.add(new vdtt_hi(2001, -this.cx, -this.cy, DataCenter.gI().n * 2, DataCenter.gI().o + this.cy * 2, (vdtt_hp)null, this));
      }

      return var1;
   }

   public void a(vdtt_hi var1, int var2, int var3) {
      this.U = false;
      if (super.a.b == this.w() && var1.b == 0) {
         this.d();
      }

      super.a(var1, var2, var3);
      if (super.a.b == this.w() - 1) {
         switch(var1.b) {
         case 0:
            this.k();
            return;
         case 1:
            vdtt_li var4 = this;

            try {
               var2 = var4.R.h();
               if (Char.gI().bac < var2 + 10) {
                  DataCenter.gI().currentScreen.c(Utlis.b(Caption.hr, Utlis.c(Char.gI().bac - 10)), -65536);
               } else {
                  String var5;
                  if ((var5 = var4.P.i().trim()) == null || var5.equals("")) {
                     var5 = Caption.hj;
                  }

                  String var6 = var4.Q.i().trim();
                  String var7 = var4.O.i().trim();
                  if (var5.length() <= 0) {
                     DataCenter.gI().currentScreen.c(Caption.hs, -65536);
                  } else if (var6.length() <= 0) {
                     DataCenter.gI().currentScreen.c(Caption.ht, -65536);
                  } else {
                     Message var8;
                     (var8 = new Message((byte)87)).writeUTF(var6);
                     var8.writeUTF(var5);
                     var8.writeUTF(var7);
                     var8.writeInt(var2);
                     if (var4.S == null) {
                        var8.writeShort(-1);
                     } else {
                        var8.writeShort(var4.S.index);
                     }

                     var8.send();
                  }
               }
               break;
            } catch (Exception var9) {
               Utlis.a(var9);
               return;
            }
         case 2:
            this.H.a((vdtt_w)(new vdtt_kg(this.H, this)));
            return;
         case 2000:
            this.U = true;
            if (this.S == null) {
               this.k = b(Caption.hp, this, this.T.cx + 32, this.T.cy, 32);
               return;
            }

            this.k = c(this, var1, this.S);
            return;
         case 2002:
            this.k = b(Utlis.b(Caption.pv, Utlis.c(10)), this, var2 + 10, var3, 10);
         }
      }

   }

   public void d() {
      super.d();
      if (this.S != null) {
         Char.gI().arrItemBag[this.S.index] = this.S;
         this.S = null;
      }

   }

   public static void C() {
      Writer var0 = null;
      boolean var1 = false;

      label92: {
         try {
            var1 = true;
            (var0 = new Writer()).writeShort(GameSrc.gI().ac.size());

            for(int var2 = 0; var2 < GameSrc.gI().ac.size(); ++var2) {
               var0.writeUTF(Utlis.d((String)GameSrc.gI().ac.elementAt(var2)));
            }

            var0.close("mail_name_caches" + Char.gI().idEntity);
            var1 = false;
            break label92;
         } catch (Exception var6) {
            Utlis.a(var6);
            var1 = false;
         } finally {
            if (var1 && var0 != null) {
               var0.close();
            }

         }

         if (var0 != null) {
            var0.close();
            return;
         }

         return;
      }

      var0.close();
   }
}
