package gro;

import java.util.Vector;

public final class vdtt_lp extends vdtt_ap {
   private vdtt_by a;
   private vdtt_hq b;
   private vdtt_dz c;

   public vdtt_lp(MainScreen var1, vdtt_dz var2) {
      this.e = 2;
      this.H = var1;
      this.c = var2;
      this.J = false;
      this.a(240, 200);
      this.a = this.a(69, 90, 60, "", this, 2);
      int var3 = var2.b / var2.c;
      vdtt_by var4 = this.a;
      int var5 = ("" + var3).length();
      var4.l = var5;
      boolean var6 = true;
      this.a.R = 1;
      this.a.S = var3;
      this.a.a("1");
      this.a(this.a);
      this.a(this.a.cx + 65, this.a.cy + 3, "", this, 1001, 58);
      this.a(this.a.cx + 86, this.a.cy + 3, "", this, 1002, 57);
      this.a(this.a.cx + 107, this.a.cy + 3, "", this, 1004, 59);
      vdtt_ay var7;
      (var7 = this.a(Caption.i, 1003)).b(-8);
      var7.setXY(var7.cx - 26, var7.cy);
      (var7 = this.a(Caption.D, -7)).b(-8);
      var7.setXY(var7.cx + 40, var7.cy);
      this.b = new vdtt_hq((byte)1, 9, 9, 30, 30, 30, 1, 1);
   }

   public final void a(int var1, Object var2) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final int f() {
      return 5;
   }

   public final void b(Graphics var1) {
      this.e(var1);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.fY + ":", 64, 20, 1, -1, -16777216);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.fZ + ":", 64, 40, 1, -1, -16777216);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.rW, 64, 60, 1, -1, -16777216);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.aO, 64, 80, 1, -1, -16777216);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.rY, 64, 100, 1, -1, -16777216);
      vdtt_dd.c(vdtt_dd.d, var1, Caption.db, 64, 120, 1, -1, -16777216);
      vdtt_dd.b(vdtt_dd.d, var1, this.c.a, 69, 20, 0, -1, -16777216);
      vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(this.c.b) + Caption.fh + Utlis.b(Caption.rZ, Utlis.c(this.c.b / this.c.c)), 69, 40, 0, -1, -16777216);
      vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.rX, Utlis.c(this.c.c)), 69, 60, 0, -1, -16777216);
      vdtt_dd.c(vdtt_dd.d, var1, Utlis.c(Char.gI().vang) + Caption.de, 69, 80, 0, -1, -16777216);
      vdtt_dd.c(vdtt_dd.d, var1, Caption.dc + Utlis.c(this.a.h()) + Caption.de, 69, 120, 0, -1, -16777216);
      vdtt_dd.c(vdtt_dd.d, var1, Caption.dd + Utlis.c((long)this.a.h() * (long)this.c.c * 98L / 100L) + Caption.fh, 69, 135, 0, -1, -16777216);
      vdtt_dd.c(vdtt_dd.d, var1, "- " + Caption.ho + " 2%", 69, 150, 0, -1, -16777216);
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
      case 1001:
         this.a.a(this.a.h() - 1);
         if (this.a.h() < this.a.R) {
            this.a.a(this.a.R);
            return;
         }
         break;
      case 1002:
         this.a.a(this.a.h() + 1);
         return;
      case 1003:
         vdtt_lp var4 = this;

         try {
            Message var5;
            (var5 = Message.c((byte)-88)).writeUTF(var4.c.a);
            var5.writeInt(var4.a.h());
            var5.send();
            break;
         } catch (Exception var6) {
            return;
         }
      case 1004:
         this.a.a(this.a.S);
      }

   }
}
