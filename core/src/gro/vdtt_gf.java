package gro;

import java.util.Vector;

public final class vdtt_gf extends vdtt_ap {
   private boolean a;
   private vdtt_ay[] b;

   public final void b(int var1, Object var2, vdtt_x var3) {
      vdtt_aa.gI().w();
      switch(var1) {
      case 508:
         GameSrc.gI();
         GameSrc.o(72);
         return;
      case 509:
         this.H.a((vdtt_w)(new vdtt_lf(GameSrc.gI(), 0)));
         return;
      case 510:
         this.H.a((vdtt_w)(new vdtt_mn(GameSrc.gI())));
         return;
      case 511:
         GameSrc.gI();
         GameSrc.o(54);
         return;
      case 512:
         this.H.a((vdtt_w)(new vdtt_ku(this.H)));
         return;
      case 513:
         SettingsTab var4;
         (var4 = SettingsTab.K()).J();
         var4.S = 0;
         var4.a(var4.width, var4.height);
         this.H.a((vdtt_w)var4);
         GameSrc.gI().dr.clear();
         return;
      case 514:
         this.H.a(Caption.so, 2004, this);
         return;
      case 515:
         this.H.a((vdtt_w)(new vdtt_lr(this.H)));
      default:
      }
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      vdtt_cz.b(var1, -6, -6, 0, 0, this.width, this.height * 2);
   }

   public final void a_() {
      if (this.a && this.l == null) {
         this.k();
      }

      int var1;
      int var2;
      if (GameSrc.gI().idTask == 3 && GameSrc.gI().idStep == 0) {
         var1 = this.cx + this.b[9].cx + 10;
         var2 = this.cy + this.b[9].cy;
         DataCenter.gI().pointHelper.a(var1, var2 + 10);
         DataCenter.gI().pointHelper.b = true;
      } else if (GameSrc.gI().idTask == 5 && GameSrc.gI().idStep < 9) {
         DataCenter.gI().pointHelper.a(this.cx + this.b[GameSrc.gI().idStep].cx + 10, this.cy + this.b[GameSrc.gI().idStep].cy + 10);
         DataCenter.gI().pointHelper.b = true;
      } else if (GameSrc.gI().idTask == 17 && GameSrc.gI().idStep == 0) {
         var1 = this.cx + this.b[3].cx + 10;
         var2 = this.cy + this.b[3].cy;
         DataCenter.gI().pointHelper.a(var1, var2 + 10);
         DataCenter.gI().pointHelper.b = true;
      } else {
         DataCenter.gI().pointHelper.b = false;
      }

   }

   public final Vector g() {
      Vector var1 = new Vector();
      if (!DataCenter.gI().pointHelper.b()) {
         var1.add(new vdtt_hi(1100, 0, 0, this.width, this.height, (vdtt_hp)null, this));
         var1.add(new vdtt_hi(1102, -DataCenter.gI().n * 2, -DataCenter.gI().o * 2, DataCenter.gI().n * 2, DataCenter.gI().o * 2, (vdtt_hp)null, this));
      }

      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (this.l == null) {
         if (var1.b > 1000 && var1.b < 1100) {
            this.H.b(var1.b, (Object)null, this.H);
            vdtt_aa.gI().w();
         } else {
            switch(var1.b) {
            case 508:
               GameSrc.gI();
               GameSrc.o(72);
               vdtt_aa.gI().w();
               return;
            case 509:
               this.H.a((vdtt_w)(new vdtt_lf(GameSrc.gI(), 0)));
               vdtt_aa.gI().w();
               return;
            case 510:
               this.H.a((vdtt_w)(new vdtt_mn(GameSrc.gI())));
               vdtt_aa.gI().w();
               return;
            case 511:
               GameSrc.gI();
               GameSrc.o(54);
               vdtt_aa.gI().w();
               return;
            case 512:
               this.H.a((vdtt_w)(new vdtt_ku(this.H)));
               return;
            case 513:
               GameSrc.gI().ae();
               vdtt_aa.gI().w();
               return;
            case 514:
               this.H.a(Caption.so, 2003, this);
               return;
            case 515:
               this.H.a(Caption.jB, 2004, this);
               return;
            case 1102:
               this.w();
               return;
            case 2003:
               this.k();
               this.H.b(Caption.m).f.clear();
               CheckVersionScreen.J = true;
               AppListener.gI().f = 50;
               return;
            case 2004:
               AppListener.gI();
               AppListener.i();
            }
         }
      }

   }

   public final void w() {
      this.a = true;
      this.a(3, this.cx, DataCenter.gI().o + 20);
      vdtt_aa.gI().w();
   }
}
