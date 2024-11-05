package gro;

import java.util.Vector;

public final class vdtt_ca extends vdtt_al {
   private vdtt_hp l;
   private vdtt_hp m;
   private Vector n;
   private vdtt_ay H;
   private String I;

   public vdtt_ca(int var1, int var2, vdtt_w var3, String var4, String var5) {
      this.I = var5;
      this.setSize(240, 155);
      this.setXY(DataCenter.gI().n / 2 - this.width / 2 - var3.cx, DataCenter.gI().o / 2 - this.height / 2 - var3.cy);
      this.a = var3;
      this.H = new vdtt_ay(this.width - 19, 5, 0, 0, "", var3, 1001, 52);
      this.n = new Vector();
      this.l = new vdtt_hp((byte)1, 5, 30, this.width - 10, 120, 12, this.n.size());
      this.m = new vdtt_hp((byte)1, this.H.cx, this.H.cy, this.H.width, this.H.height, this.H.height, 1);
      (new Thread(new vdtt_cb(this, var4))).start();
   }

   public final Vector g() {
      Vector var1;
      (var1 = new Vector()).addElement(new vdtt_hi(1000, this.l.cx, this.l.cy, this.l.cx + this.l.width, this.l.cy + this.l.height, this.l, this));
      var1.addElement(new vdtt_hi(1001, this.m.cx, this.m.cy, this.m.cx + this.m.width, this.m.cy + this.m.height, this.m, this));
      var1.addElement(new vdtt_hi(1000, 0, 0, this.width, this.height, (vdtt_hp)null, this));
      return var1;
   }

   public final void b(Graphics var1) {
      int var2 = var1.e;
      int var3 = var1.f;
      this.c(var1);
      var1.f(16577687);
      var1.a(3, 25, this.width - 3, 1);
      vdtt_dd.b(vdtt_dd.f, var1, this.I, this.width / 2, 13, 2, -2560, -16777216);
      this.a(var1, this.l);

      for(int var4 = 0; var4 < this.n.size(); ++var4) {
         if (this.l.b(var4)) {
            vdtt_dd.a(vdtt_dd.d, var1, this.n.elementAt(var4).toString(), 5, 6 + var4 * 12, 0, -1);
         }
      }

      this.a(var1);
      this.a(var1, var2, var3);
      var1.a(this.H.cx, this.H.cy);
      this.H.b(var1);
      this.a(var1, var2, var3);
   }

   public final void a_() {
      this.l.a();
      this.m.a();
      if (this.m.l != -1) {
         this.H.M = true;
      } else {
         this.H.M = false;
      }

   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      switch(var1.b) {
      case 1000:
         return;
      case 1001:
         this.a.b((vdtt_k)this);
      default:
      }
   }

   static Vector a(vdtt_ca var0) {
      return var0.n;
   }

   static vdtt_hp a(vdtt_ca var0, vdtt_hp var1) {
      return var0.l = var1;
   }

   static vdtt_hp b(vdtt_ca var0, vdtt_hp var1) {
      return var0.m = var1;
   }

   static vdtt_ay b(vdtt_ca var0) {
      return var0.H;
   }
}
