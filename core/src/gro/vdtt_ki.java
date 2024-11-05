package gro;

public final class vdtt_ki extends vdtt_ap {
   private vdtt_by a;
   private vdtt_by b;
   private int c;
   private int d;
   private vdtt_bd M;
   private vdtt_hm N;
   private String[] O;
   private int[] P;

   public vdtt_ki(MainScreen var1, String[] var2, int[] var3) {
      this.H = var1;
      this.a(210, 190);
      this.P = new int[var3.length + 1];
      this.O = new String[var2.length + 1];
      this.P[0] = -1;
      this.O[0] = Caption.fi;

      for(int var4 = 0; var4 < var2.length; ++var4) {
         this.P[var4 + 1] = var3[var4];
         this.O[var4 + 1] = Caption.fj + var2[var4];
      }

      this.c = 68;
      this.d = 35;
      this.N = new vdtt_hm(2000, this.O);
      this.M = this.a(66, 35, 130, this.N.c.length, this.N, this, 0);
      this.a = this.a(66, 60, 130, "", this, 0);
      this.b = this.b(66, 85, 130, "", this, 4);
      this.a.a("");
      this.b.a("");
      this.a(Caption.i, 1002);
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1002:
         try {
            Message var4;
            (var4 = Message.c((byte)-111)).writeShort(this.P[this.M.n.b]);
            var4.writeUTF(this.a.i());
            var4.writeUTF(this.b.i());
            var4.send();
            return;
         } catch (Exception var5) {
         }
      default:
      }
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.cB, (byte)2, true);
      vdtt_dd.a(vdtt_dd.d, var1, Caption.fk, 15, this.d + 10, 0, -1);
      vdtt_dd.a(vdtt_dd.d, var1, Caption.cC, 15, this.d + 35 + 20, 0, -1);
      if (this.M.n.b == 0) {
         vdtt_dd.a(vdtt_dd.d, var1, Caption.fl, 15, this.d + 35, 0, -1);
      } else {
         vdtt_dd.a(vdtt_dd.d, var1, Caption.zD[2], 15, this.d + 35, 0, -1);
      }

   }

   public final void a_() {
   }
}
