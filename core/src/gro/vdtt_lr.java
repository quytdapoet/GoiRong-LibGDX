package gro;

public final class vdtt_lr extends vdtt_ap {
   private vdtt_by a;
   private int b;
   private int c;

   public vdtt_lr(MainScreen var1) {
      this.H = var1;
      this.a(210, 120);
      this.a = this.a(88, 44, 100, "", this, 0);
      byte var2 = 30;
      this.a.l = var2;
      this.a.a("");
      this.a(this.width / 2 - 35, this.height - 28, Caption.i, this, 1001, 15);
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1001:
         vdtt_lr var4 = this;

         try {
            Message var5;
            (var5 = Message.c((byte)-110)).writeUTF(var4.a.i());
            var5.send();
            return;
         } catch (Exception var6) {
         }
      default:
      }
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.gc, (byte)2, false);
      this.b = 68;
      this.c = 35;
      vdtt_dd.a(vdtt_dd.d, var1, Caption.gd, 15, this.c + 20, 0, -1);
   }

   public final void a_() {
   }
}
