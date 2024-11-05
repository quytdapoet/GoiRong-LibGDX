package gro;

public final class vdtt_ee extends vdtt_bf {
   private byte Q;
   private String R;
   private vdtt_by S;

   public vdtt_ee(String var1, MainScreen var2, int var3) {
      super(var1, var2, var3);
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, this.O, (byte)2, this.J);
      this.a(var1, 6, 33, this.width - 12, this.height - 48, -11, 55, 56);
      mImage var2 = this.M;
      int var3 = this.width / 2;
      int var4 = this.f() + 25;
      boolean var5 = true;
      if (var2 != null) {
         var1.a(var2, 0, 0, var2.c, var2.d, 0, var3, var4, 3);
      }

      this.a(var1, this.cx + 4, this.cy + this.f());
      vdtt_dd.c(vdtt_dd.d, var1, this.b, this.S.cx - 10, this.S.cy - 16, 1, -1, -16777216);
      vdtt_dd.c(vdtt_dd.d, var1, Utlis.b(Caption.qQ, this.R), this.width / 2, this.S.cy + 4, 2, -2560, -16777216);
      vdtt_dd.c(vdtt_dd.d, var1, Caption.qP, this.width / 2, this.S.cy + 16, 2, -2560, -16777216);
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      if (var1.b == 190) {
         vdtt_ee var4 = this;

         try {
            String var5 = "";
            vdtt_by var6;
            if ((var6 = var4.w()) != null) {
               var5 = var6.i();
               var6.a("");
            }

            Message var7;
            (var7 = Message.c(var4.Q)).writeUTF(var5);
            var7.send();
            return;
         } catch (Exception var8) {
            Utlis.a(var8);
         }
      }

   }
}
