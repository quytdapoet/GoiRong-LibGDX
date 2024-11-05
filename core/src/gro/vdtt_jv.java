package gro;

public final class vdtt_jv extends vdtt_ap {
   private vdtt_by c;
   private vdtt_by d;
   private vdtt_by M;
   private int N;
   private int O;
   public String a;
   public String b;
   private static vdtt_jv P;

   public vdtt_jv(MainScreen var1) {
      this.H = var1;
      P = this;
      this.a(210, 147);
      this.N = 68;
      this.O = 35;
      this.c = this.a(74, 34, 124, "", this, 0);
      byte var2 = 16;
      this.c.l = var2;
      this.d = this.a(74, 60, 124, "", this, 1);
      this.M = this.a(74, 86, 124, "", this, 1);
      this.a(Caption.i, 1002);
   }

   public static vdtt_jv w() {
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
         this.H.i();
         vdtt_jv var4 = this;
         this.H.i();
         this.a = this.c.i();
         this.b = this.M.i();
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
      default:
      }
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.aA, (byte)2, true);
      vdtt_dd.a(vdtt_dd.d, var1, Caption.ye[0], 15, this.O + 10, 0, -1);
      vdtt_dd.a(vdtt_dd.d, var1, Caption.aB, 15, this.O + 25 + 10, 0, -1);
      vdtt_dd.a(vdtt_dd.d, var1, Caption.aC, 15, this.O + 50 + 10, 0, -1);
   }

   public final void a_() {
   }

   private Message x() {
      Message var1 = null;

      try {
         (var1 = Message.c((byte)-124)).writeUTF(this.a);
         var1.writeUTF(this.d.i());
         var1.writeUTF(this.b);
         var1.writeInt(DataCenter.gI().ver1);
         var1.writeInt(DataCenter.gI().ver2);
      } catch (Exception var3) {
         Utlis.a(var3);
      }

      return var1;
   }
}
