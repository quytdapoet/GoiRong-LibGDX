package gro;

public final class vdtt_ko extends vdtt_ak {
   private String[] c;
   public String a;
   public String b;

   public vdtt_ko() {
      this.b = Caption.h;
   }

   public final void a(String var1, MainScreen var2) {
      var2.b((vdtt_k)var2.k);
      if (var2.c != null) {
         var2.c.b((vdtt_k)var2.c.k);
      }

      var2.e();
      this.e = 4;
      this.H = var2;
      this.a = var1;
      this.a(200, 140);
      this.f.clear();
      this.c = var1.split("\n");
      this.b(Caption.fG, 1001);
      this.c(Caption.fH, 1002);
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, this.b, (byte)2, this.J);
      this.a(var1, this.cx + 4, this.cy + this.f());

      for(int var2 = 0; var2 < this.c.length; ++var2) {
         vdtt_dd.a(var1, this.c[var2], (super.width - 8) / 2, this.h() / 2 - 6 + var2 * 12 - this.c.length * 6, 2, -1);
      }

   }

   public final void a_() {
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1001:
         this.k();
         CheckVersionScreen.J = CheckVersionScreen.K;
         DataCenter var4 = DataCenter.gI();
         vdtt_cd var5 = LoginPCScreen.v();
         var4.currentScreen = var5;
         return;
      case 1002:
         this.k();
         AppListener.gI();
         AppListener.i();
      default:
      }
   }
}
