package gro;

import java.util.Vector;

public final class vdtt_bs extends vdtt_k {
   private String n;
   public boolean l;
   private vdtt_hl H;
   private short I = 10;
   public boolean m;

   public vdtt_bs(int var1, int var2, String var3, vdtt_w var4, vdtt_hl var5) {
      this.n = var3;
      this.a = var4;
      this.H = var5;
      if (var5.c.size() == var5.b) {
         this.l = true;
      }

      var5.c.addElement(this);
      this.setXY(var1, var2);
      this.setSize(18 + vdtt_dd.b(vdtt_dd.d, var3), 16);
   }

   public final void b(boolean var1) {
      this.d = var1;
   }

   public final void a(String var1) {
      this.n = var1;
      this.setSize(18 + vdtt_dd.b(vdtt_dd.d, var1), 16);
   }

   public final void a_() {
   }

   public final void b(Graphics var1) {
      if (!this.d) {
         short var2 = this.I;
         if (!this.c && this.e(0)) {
            var1.e(30);
         }

         vdtt_cz.a(var1, var2, 0, 0, 0, 20);
         var1.h();
         if (!this.c && !this.d && (this.m || this.e(0))) {
            vdtt_dd.b(vdtt_dd.d, var1, this.n, 21, 8, 0, -1, -16777216);
         } else if (this.c) {
            vdtt_dd.b(vdtt_dd.d, var1, this.n, 20, 7, 0, -3089954, -16777216);
         } else {
            vdtt_dd.b(vdtt_dd.d, var1, this.n, 20, 7, 0, -1, -16777216);
         }

         if (this.l) {
            vdtt_cz.a(var1, 11, 0, 4, 4, 20);
         }
      }

   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      if (!this.c && !this.d) {
         for(var3 = 0; var3 < this.H.c.size(); ++var3) {
            vdtt_bs var4;
            (var4 = (vdtt_bs)this.H.c.elementAt(var3)).l = false;
            if (var4.equals(this)) {
               this.H.b = var3;
            }
         }

         this.l = true;
         this.a.a(var1.b, this.H, this);
         vdtt_aa.gI().n();
      }

   }

   public final Vector g() {
      Vector var1 = new Vector();
      if (!this.c && !this.d) {
         var1.addElement(new vdtt_hi(this.H.a, 0, 0, this.width, this.height, (vdtt_hp)null, this));
      }

      return var1;
   }
}
