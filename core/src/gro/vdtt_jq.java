package gro;

import java.util.Vector;

public final class vdtt_jq extends vdtt_ap {
   private vdtt_bz a;
   private vdtt_bd b;
   private int[] c = new int[]{10, 50, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

   public vdtt_jq(MainScreen var1) {
      this.e = 2;
      this.H = var1;
      this.J = false;
      this.a(260, 200);
      String[] var2 = new String[this.c.length];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         var2[var3] = this.c[var3] + " " + Caption.mW;
      }

      vdtt_hm var7 = new vdtt_hm(0, var2);
      this.a = new vdtt_bz(90, 25, 100, "", this, 0, 2, 0);
      byte var4 = 6;
      this.a.l = var4;
      boolean var5 = true;
      this.a.R = 1;
      int var6 = 999999;
      this.a.S = var6;
      this.a(this.a);
      this.b = this.a(90, 70, 100, 5, var7, this, 0);
      this.a(Caption.bi, 100);
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.e(var1);
      vdtt_dd.c(vdtt_dd.d, var1, Caption.cV, 9, this.f() - 15, 0, -1, -16777216);
      vdtt_dd.c(vdtt_dd.d, var1, Caption.cW, 84, this.f() + 5, 1, -1, -16777216);
      vdtt_dd.c(vdtt_dd.d, var1, Caption.cX, 84, this.f() + 50, 1, -1, -16777216);
      vdtt_dd.c(vdtt_dd.d, var1, Caption.cY, 84, this.f() + 70, 1, -1, -16777216);
      vdtt_dd.c(vdtt_dd.d, var1, Caption.rV, 94, this.f() + 70, 0, -1, -16777216);
      vdtt_dd.c(vdtt_dd.d, var1, Caption.cZ, 84, this.f() + 90, 1, -1, -16777216);
      vdtt_dd.c(vdtt_dd.d, var1, Utlis.c(Char.gI().bac) + Caption.fh, 94, this.f() + 90, 0, -1, -16777216);
      vdtt_dd.c(vdtt_dd.d, var1, Caption.db, 84, this.f() + 110, 1, -1, -16777216);
      vdtt_dd.c(vdtt_dd.d, var1, Caption.dc + Utlis.c((long)this.a.h() * (long)this.c[this.b.n.b]) + Caption.fh, 94, this.f() + 110, 0, -1, -16777216);
      vdtt_dd.c(vdtt_dd.d, var1, Caption.dd + Utlis.c(this.c[this.b.n.b]) + Caption.de, 94, this.f() + 125, 0, -1, -16777216);
   }

   public final void a_() {
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(new vdtt_hi(0, 0, 0, this.width, this.height, this.I, this));
      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 100:
         vdtt_jq var4 = this;

         try {
            Message var5;
            (var5 = Message.c((byte)-89)).writeInt(var4.a.h());
            var5.writeInt(var4.b.n.b);
            var5.send();
            return;
         } catch (Exception var6) {
         }
      default:
      }
   }
}
