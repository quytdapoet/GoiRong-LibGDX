package gro;

import java.util.Vector;

public final class vdtt_ni extends vdtt_ap {
   public int a;
   public int b;
   public int c;
   public long d;
   public String M;
   public vdtt_w N;

   public vdtt_ni(MainScreen var1, int var2, String var3, int var4) {
      this.H = var1;
      this.M = var3;
      this.c = var4;
      this.N = this.H.c;
      this.setSize(160, 14);
      this.setXY(DataCenter.gI().n / 2 - 75, DataCenter.gI().o - 30);
      this.J = false;
      this.b = var2;
      this.d = Utlis.a();
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy);
      int var2 = this.a * 100 / this.b;
      int var3 = this.width - 2;
      int var4 = this.height - 2;
      int var5 = var2 * var3 / 100;
      var1.f(-16777216);
      var1.c(1, 1, var3 + 2, var4 + 2);
      var1.c(-16711681);
      this.a(var1, 0, 0, var3 + 4, var4 + 4, -3, 3, 4, 1, 1);
      var1.f();
      vdtt_y.a(var1, 93, 0, 2, 2, var5, (int)var4);
      vdtt_dd.b(vdtt_dd.b, var1, this.M + ": " + var2 + "%", this.width / 2, this.height / 2, 2, -6488, -10275328);
   }

   public final void a_() {
      this.a = (int)(Utlis.a() - this.d);
      if (this.a > this.b) {
         this.a = this.b;
      }

   }

   public final Vector g() {
      Vector var1;
      (var1 = new Vector()).add(new vdtt_hi(1000, -this.cx, -this.cy, DataCenter.gI().n - this.cx, DataCenter.gI().o - this.cy, (vdtt_hp)null, this));
      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);

      try {
         SettingsTab.K().a(false);
         (new Message((byte)7)).send();
      } catch (Exception var5) {
      }

   }
}
