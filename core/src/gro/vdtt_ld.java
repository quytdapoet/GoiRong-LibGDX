package gro;

import java.util.Vector;

public final class vdtt_ld extends vdtt_ap {
   private vdtt_by a;
   private vdtt_by b;

   public vdtt_ld(MainScreen var1) {
      this.e = 2;
      this.H = var1;
      this.J = false;
      this.a(200, 120);
      this.a = this.a(60, 40, 100, "", this, 0, 0);
      byte var2 = 12;
      this.a.l = var2;
      this.b = this.a(60, 65, 100, "", this, 0, 0);
      var2 = 3;
      this.b.l = var2;
      this.b.b(true);
      this.a(Caption.bi, 100);
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.gV, (byte)2, true);
      vdtt_dd.c(vdtt_dd.d, var1, Caption.gW, 10, this.f() + 20, 0, -1, -16777216);
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

      try {
         switch(var1.b) {
         case 100:
            Message var4;
            (var4 = Message.c((byte)-106)).writeUTF(this.a.i());
            var4.writeUTF(this.b.i());
            var4.send();
         }
      } catch (Exception var5) {
      }

   }
}
