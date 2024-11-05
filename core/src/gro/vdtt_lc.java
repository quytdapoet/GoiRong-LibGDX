package gro;

import java.util.Vector;

public final class vdtt_lc extends vdtt_ap {
   private final vdtt_bb b;
   private mImage c;
   private int d;
   private vdtt_ay M;
   private vdtt_ay N;
   private int O;
   private int P;
   boolean a;

   public vdtt_lc(MainScreen var1) {
      this.e = 2;
      this.H = var1;
      this.J = false;
      this.a(320, 185);
      this.w();
      this.O = 170;
      this.M = this.a(this.O, this.height - 21, "", this, 2006, -92);
      short var2 = -360;
      this.M.J = var2;
      this.a(this.M);
      this.P = 255;
      this.N = this.a(this.P, this.height - 21, "", this, 2007, -92);
      this.a(this.N);
      this.b = this.a(4, this.height - 20, Caption.wJ, this, 2008);
      if (mConfig.gI().b(34) == -1) {
         mConfig.gI().a(34, true);
         boolean var3 = true;
         this.b.m = var3;
         this.a = true;
      }

      this.L.setXY(this.L.cx + 10, -9);
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      switch(var1) {
      case 2008:
         mConfig.gI().a(34, this.b.m);
         this.a = true;
      default:
      }
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      int var2 = var1.e;
      int var3 = var1.f;
      this.a(var1, 0, 0);
      var1.f(0);
      var1.d(30);
      var1.c(0, 0, DataCenter.gI().n, DataCenter.gI().o);
      var1.m = 1.0F;
      this.a(var1, var2, var3);
      if (this.c != null && this.c.c > 1) {
         var1.a(this.c, 0, 0, this.c.c, this.c.d, 0, 0, 0, this.width * DataCenter.gI().r, (this.height - 25) * DataCenter.gI().r, 20);
      } else {
         this.w();
      }

      var1.f(-8492991);
      var1.c(0, this.height - 25, this.width, 25);
   }

   private void w() {
      try {
         this.c = vdtt_cz.d(41 + this.d);
      } catch (Exception var2) {
      }

   }

   public final void a_() {
      this.M.setXY(this.O - DataCenter.gI().h / 3 % 3, this.M.cy);
      this.N.setXY(this.P + DataCenter.gI().h / 3 % 3, this.N.cy);
   }

   public final Vector g() {
      return super.g();
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 2006:
         --this.d;
         if (this.d < 0) {
            this.d = 2;
         }

         this.w();
         return;
      case 2007:
         ++this.d;
         if (this.d > 2) {
            this.d = 0;
         }

         this.w();
      default:
      }
   }

   public final void d() {
      super.d();
      this.c = null;
      if (this.a) {
         GameSrc.gI().z();
         DataCenter.gI().aQ = false;
      }

   }
}
