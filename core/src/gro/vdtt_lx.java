package gro;

public final class vdtt_lx extends vdtt_ap {
   private vdtt_by c;
   private vdtt_by d;
   private vdtt_by M;
   private vdtt_bb N;
   private int O;
   public String a;
   public String b;
   private static vdtt_lx P;

   public static vdtt_lx w() {
      return P;
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1002:
         if (!this.N.m) {
            DataCenter.gI().currentScreen.c(Caption.au, -1);
            return;
         } else {
            this.H.i();
            vdtt_lx var4 = this;
            this.H.i();
            this.a = this.c.i();
            this.b = this.d.i();
            LoginPCScreen.z();
            Message var5 = null;

            try {
               vdtt_nj.d = var4.x();
               (var5 = var4.x()).send();
               return;
            } catch (Exception var10) {
               Utlis.a(var10);
            } finally {
               if (var5 != null) {
                  var5.close();
               }

            }

            return;
         }
      case 1003:
         this.k = a(Caption.X, Caption.ao, this, this.width / 2 - 100, this.height / 2 - 75);
         return;
      default:
      }
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.ai, (byte)2, true);
      vdtt_dd.a(vdtt_dd.d, var1, Caption.ye[0], 15, this.O + 10, 0, -1);
      vdtt_dd.a(vdtt_dd.d, var1, Caption.yf[0], 15, this.O + 25 + 10, 0, -1);
      vdtt_dd.a(vdtt_dd.d, var1, Caption.an, 15, this.O + 50 + 10, 0, -1);
   }

   public final void a_() {
   }

   private Message x() {
      Message var1 = null;

      try {
         (var1 = Message.c((byte)-128)).writeUTF(this.a);
         var1.writeUTF(this.b);
         var1.writeUTF(this.M.i());
         var1.writeUTF(DataCenter.gI().s);
         var1.writeByte(DataCenter.gI().t);
         var1.writeInt(DataCenter.gI().ver1);
         var1.writeInt(DataCenter.gI().ver2);
      } catch (Exception var3) {
         Utlis.a(var3);
      }

      return var1;
   }
}
