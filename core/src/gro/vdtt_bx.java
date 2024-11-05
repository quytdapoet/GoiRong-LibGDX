package gro;

import java.util.Vector;

public final class vdtt_bx extends vdtt_al {
   private vdtt_ay[] m = new vdtt_ay[1];
   private vdtt_hp[] n;
   private vdtt_hp H;
   public String[] l;

   public vdtt_bx(int var1, int var2, int var3, vdtt_w var4, String var5) {
      this.a = var4;
      this.setXY(var1, var2);
      this.l = vdtt_dd.c(vdtt_dd.d, var5, var3 - 28);
      int var6 = this.l.length > 10 ? 10 : this.l.length;
      if ((var2 = var6 * 13 + 10) < 100) {
         var2 = 100;
      }

      this.setSize(var3, var2);
      this.m[0] = new vdtt_ay(var3 - 17, 3, 0, 0, "", var4, 2001, 52);
      this.n = a(this.m);
      this.H = new vdtt_hp((byte)1, 0, 5, var3, var6 * 13, 13, this.l.length);
   }

   public final void b(Graphics var1) {
      this.c(var1);
      int var2 = var1.e;
      int var3 = var1.f;
      this.a(var1, this.H);

      for(int var4 = 0; var4 < this.l.length; ++var4) {
         vdtt_dd.b(vdtt_dd.d, var1, this.l[var4], 8, var4 * this.H.h + 5, 0, -1, -16777216);
      }

      this.a(var1);
      this.a(var1, this.m, var2, var3);
      this.a(var1, var2, var3);
      this.H.a(var1, this, 0);
   }

   public final void a_() {
      this.H.a();
      a(this.m, this.n);
   }

   public final Vector g() {
      Vector var1;
      (var1 = new Vector()).addElement(this.n[0].a(this.m[0].m, this));
      var1.add(this.H.a(2000, this));
      var1.add(new vdtt_hi(2000, 0, 0, this.width, this.height, this.H, this));
      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      switch(var1.b) {
      case 2000:
         return;
      case 2001:
         this.a.b((vdtt_k)this);
      default:
      }
   }
}
