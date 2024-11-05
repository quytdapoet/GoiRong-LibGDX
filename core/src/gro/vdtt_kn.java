package gro;

public final class vdtt_kn extends vdtt_ap {
   public static vdtt_kn a;

   public vdtt_kn(MainScreen var1) {
      this.H = var1;
      a = this;
      this.a(240, 170);
      this.J = false;
      this.a(this.a(this.width / 2 - 37, 100, Caption.zi[1], this, 101, 7));
      this.a(this.a(this.width / 2 - 37, 130, Caption.zi[2], this, 102, 7));
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 100:
         this.k();
         return;
      case 101:
         this.k();
         GameSrc.gI().Z();
         SettingsTab.K().a(false);
         return;
      case 102:
         DataCenter.gI().currentScreen.a(Caption.fB, 2003, this);
         return;
      case 2003:
         SettingsTab.K().a(false);
         GameSrc.gI().Y();
      default:
      }
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.h, (byte)2, this.J);
      if (GameSrc.I.length() > 0) {
         vdtt_dd.b(vdtt_dd.d, var1, Caption.fC + GameSrc.I + Caption.fD, this.width / 2, 55, 2, -2560, -16777216);
      } else {
         vdtt_dd.b(vdtt_dd.d, var1, Caption.fE, this.width / 2, 55, 2, -2560, -16777216);
      }

      vdtt_dd.b(vdtt_dd.d, var1, Caption.fF, this.width / 2, 68, 2, -2560, -16777216);
   }

   public final void a_() {
   }
}
