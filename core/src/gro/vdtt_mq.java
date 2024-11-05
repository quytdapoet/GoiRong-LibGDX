package gro;

import java.util.Vector;

public final class vdtt_mq extends vdtt_ap {
   private vdtt_bd a;
   private vdtt_bd b;
   private vdtt_kf c;

   public vdtt_mq(MainScreen var1) {
      this.c = (vdtt_kf)var1.c;
      this.e = 2;
      this.H = var1;
      this.J = false;
      this.a(220, 110);
      this.a(Caption.bi, 100);
      short[] var2 = new short[24];
      String[] var3 = new String[24];

      short var4;
      for(var4 = 0; var4 < 24; var2[var4] = var4++) {
         var3[var4] = "" + var4;
      }

      this.a = this.a(24, 40, 50, 5, new vdtt_hm(100, var2, var3), this, 0);
      if (this.c.ah >= 0) {
         this.a.a(this.c.ah);
      }

      var2 = new short[12];
      var3 = new String[12];

      for(var4 = 0; var4 < 12; ++var4) {
         var2[var4] = (short)(var4 * 5);
         var3[var4] = "" + var2[var4];
      }

      this.b = this.a(114, 40, 50, 5, new vdtt_hm(101, var2, var3), this, 0);
      if (this.c.ai >= 0) {
         this.b.a(this.c.ai / 5);
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.e(var1);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.va, 10, 20, 0, -1, -16777216);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.vb, this.a.cx + this.a.width + 5, this.b.cy + 8, 0, -1, -16777216);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.vc, this.b.cx + this.b.width + 5, this.b.cy + 8, 0, -1, -16777216);
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
            vdtt_mq var4 = this;

            try {
               Message var5;
               (var5 = Message.c((byte)-9)).writeByte(var4.a.n.b);
               var5.writeByte(var4.b.n.b);
               var5.send();
            } catch (Exception var6) {
            }

            this.k();
         }
      } catch (Exception var7) {
      }

   }
}
