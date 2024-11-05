package gro;

import java.util.Vector;

public final class vdtt_ln extends vdtt_ap {
   private boolean a;
   private vdtt_hp b;
   private vdtt_hm c;
   private int d;
   private String M;
   private mImage N;
   private int O = -1;

   public vdtt_ln(MainScreen var1, vdtt_hm var2, int var3) {
      this.H = var1;
      this.c = var2;
      this.d = 0;
      int var4 = DataCenter.gI().o - 120;
      byte var5 = 55;
      if (var4 < 147) {
         var4 = 147;
         var5 = 30;
      }

      this.setSize(170, var4);
      this.a(2, DataCenter.gI().n - this.width, var5, 20);
      if ((var4 = var2.c.length) > 10) {
         var4 = 10;
      }

      int var6 = this.height / 32;
      if (var4 < var6 && this.height > var4 * 32 + 20) {
         this.height = (short)(var4 * 32 + 20);
         this.setSize(this.width, this.height);
      }

      this.b = new vdtt_hp((byte)1, this.width / 2 - 68, 10, 130, var6 * 32, 32, var4);
      this.e = 2;
      this.M = Utlis.e(DataCenter.gI().ver2);
      var1 = null;

      try {
         Reader var7 = vdtt_y.c("/4.png");
         this.N = Binary.a(var7.readFully());
         this.N = vdtt_y.b(this.N, this.N.c * DataCenter.gI().r / 4, this.N.d * DataCenter.gI().r / 4);
         return;
      } catch (Exception var11) {
      } finally {
         ;
      }

      if (var1 == null) {
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      vdtt_cz.a(var1, 374, 0, 50, 3, 33);
      vdtt_cz.a(var1, 374, 0, this.width - 50, 3, 33);
      this.b(var1, -3, 0, this.width, this.height, -28, 371, 372, 373, 3, 3, 90);
      this.b(var1, 27, this.height + 5, this.width - 30, 53, -28, 371, 372, 373, 3, 3, 90);

      int var2;
      for(var2 = 1; var2 < this.height / 20; ++var2) {
         vdtt_cz.a(var1, 375, 0, 3, var2 * 20, 3);
         vdtt_cz.a(var1, 375, 0, this.width - 8, var2 * 20, 3);
      }

      for(var2 = 1; var2 < this.width / 20; ++var2) {
         vdtt_cz.a(var1, 375, 0, var2 * 20, this.height - 3, 3);
      }

      for(var2 = 1; var2 < 4; ++var2) {
         vdtt_cz.a(var1, 375, 0, 33, this.height + 13 + var2 * 10, 3);
         vdtt_cz.a(var1, 375, 0, this.width - 7, this.height + 13 + var2 * 10, 3);
      }

      var1.a(this.N, 45, this.height + 15);
      vdtt_dd.a((vdtt_dd)vdtt_dd.e, (Graphics)var1, Caption.mR, 85, this.height + 22, 0, -2560, -10275328);
      vdtt_dd.a((vdtt_dd)vdtt_dd.e, (Graphics)var1, Caption.mi + this.M, 85, this.height + 37, 0, -2560, -10275328);
      this.a(var1, this.b);
      var2 = var1.f;

      for(int var3 = 0; var3 < this.c.c.length; ++var3) {
         vdtt_cz.a(var1, 376, 0, 22, var3 * this.b.h + 7, 24);
         if (var3 == this.b.l) {
            var1.e(30);
            vdtt_cz.a(var1, 306, 0, 22, var3 * this.b.h, 20);
            var1.h();
            vdtt_dd.a((vdtt_dd)vdtt_dd.f, (Graphics)var1, this.c.c[var3], this.width / 2 - 10 + 1, this.b.h / 2 + var3 * this.b.h - 3 + 1, 2, -6488, -10275328);
         } else {
            vdtt_cz.a(var1, 306, 0, 22, var3 * this.b.h, 20);
            vdtt_dd.a((vdtt_dd)vdtt_dd.f, (Graphics)var1, this.c.c[var3], this.width / 2 - 10, this.b.h / 2 + var3 * this.b.h - 3, 2, -6488, -10275328);
         }

         if (var3 == 1 && this.d == 1 && GameSrc.gI().ba) {
            vdtt_cz.a(var1, 713, 0, this.width / 2 + 50, this.b.h / 2 + var3 * this.b.h - 2, 20);
         }

         int var4;
         int var5;
         if (this.c.d[var3] == 12 && GameSrc.gI().idTask == 0 && GameSrc.gI().idStep == 1 && !this.n()) {
            var4 = this.width / 2 + 20;
            var5 = var2 + this.b.h / 2 + var3 * this.b.h;
            DataCenter.gI().pointHelper.a(var4, var5 + 1);
            DataCenter.gI().pointHelper.b = true;
         } else if (this.c.d[var3] == 10 && GameSrc.gI().idTask == 14 && GameSrc.gI().idStep == 0 && !this.n()) {
            var4 = this.width / 2 + 20;
            var5 = var2 + this.b.h / 2 + var3 * this.b.h;
            DataCenter.gI().pointHelper.a(var4, var5 + 1);
            DataCenter.gI().pointHelper.b = true;
         }
      }

      this.a(var1);
      this.b.b(var1, this);
   }

   public final void a_() {
      if (this.a && this.l == null) {
         this.k();
         if (this.O >= 0) {
            this.f(this.O);
            this.O = -1;
         }
      }

      this.b.a();
   }

   public final Vector g() {
      Vector var1;
      (var1 = new Vector()).add(this.b.a(1100, this));
      var1.add(new vdtt_hi(1101, 0, 0, this.width, this.height, (vdtt_hp)null, this));
      var1.add(new vdtt_hi(1101, 30, this.height + 5, this.width, this.height + 5 + 53, (vdtt_hp)null, this));
      var1.add(new vdtt_hi(1102, -DataCenter.gI().n * 2, -DataCenter.gI().o * 2, DataCenter.gI().n * 2, DataCenter.gI().o * 2, (vdtt_hp)null, this));
      return var1;
   }

   public final void d() {
      if (this.N != null) {
         this.N.a();
      }

      super.d();
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (this.l == null) {
         switch(var1.b) {
         case 1100:
            this.O = this.b.k;
            this.w();
            return;
         case 1102:
            this.w();
            return;
         case 1103:
            this.a = true;
            this.setXY(-this.width, 0);
            GameSrc.gI().a((vdtt_w)(new vdtt_jy(GameSrc.gI(), Char.gI(), GameSrc.gI().af)));
            vdtt_aa.gI().o();
            return;
         case 2001:
            Binary.b();
            return;
         case 2002:
            AppListener.gI();
            AppListener.i();
            return;
         case 2003:
            AppListener.gI().j();
            vdtt_cd var4;
            (var4 = LoginPCScreen.v()).b(1000);
            DataCenter.gI().currentScreen = var4;
         }
      }

   }

   private void w() {
      this.a = true;
      this.a(2, this.cx, -this.height - 60);
      vdtt_aa.gI().w();
   }

   private boolean f(int var1) {
      try {
         switch(this.c.d[var1]) {
         case 0:
            this.H.a((vdtt_w)(new vdtt_lm(this.H)));
            return true;
         case 1:
            this.H.a(Caption.cs, 2001, this);
            return true;
         case 2:
            this.H.a((vdtt_w)(new vdtt_lm(this.H)));
            return true;
         case 3:
            try {
               Message.c((byte)-121).send();
            } catch (Exception var4) {
               Utlis.a(var4);
            }

            return true;
         case 4:
            try {
               Message.c((byte)-71).send();
            } catch (Exception var3) {
               Utlis.a(var3);
            }

            return true;
         case 5:
            this.H.a(Caption.nB, 2003, this);
            return true;
         case 6:
            this.H.a(Caption.jB, 2002, this);
            return true;
         case 7:
            GameSrc.gI();
            GameSrc.o(72);
            return true;
         case 8:
            this.H.a((vdtt_w)(new vdtt_lf(GameSrc.gI(), 0)));
            return true;
         case 9:
            this.H.a((vdtt_w)(new vdtt_mn(GameSrc.gI())));
            return true;
         case 10:
            GameSrc.gI();
            GameSrc.o(54);
            return true;
         case 11:
            this.H.a((vdtt_w)(new vdtt_ku(this.H)));
            return true;
         case 12:
            SettingsTab var2;
            (var2 = SettingsTab.K()).J();
            var2.S = 0;
            var2.a(var2.width, var2.height);
            this.H.a((vdtt_w)var2);
            GameSrc.gI().dr.clear();
            return true;
         case 13:
            this.H.b(Caption.m).f.clear();
            CheckVersionScreen.J = true;
            AppListener.gI().f = 50;
            return true;
         case 14:
            this.H.a((vdtt_w)(new vdtt_lr(this.H)));
            return true;
         }
      } catch (Exception var5) {
      }

      return false;
   }
}
