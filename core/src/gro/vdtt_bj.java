package gro;

import java.util.Vector;

public final class vdtt_bj extends vdtt_al {
   private int l;
   private int m = 20;
   private vdtt_hq n;
   private int H;
   private int I = 35;

   public vdtt_bj(int var1, int var2, int var3, vdtt_w var4) {
      this.l = var3;
      this.a = var4;
      this.setXY(var1, var2);
      this.setSize(100, 80);
      this.n = new vdtt_hq((byte)1, 0, 0, this.width, this.height, this.m, Utlis.c(this.I, 5), 5);
   }

   public final void b(Graphics var1) {
      this.a(var1, -6, -6, this.width + 12, this.height + 12, 61, 22, 23, 1, 1);
      this.a(var1, this.n);
      int var2 = 0;
      int var3 = 0;

      for(int var4 = 0; var4 < this.I; ++var4) {
         if (this.n.c(var3)) {
            if (var4 == this.n.M) {
               vdtt_cz.a(var1, vdtt_ik.g[var4].c, 0, var2 + 2 + 1, var3 + 16 + 1, 36);
            } else {
               vdtt_cz.a(var1, vdtt_ik.g[var4].c, 0, var2 + 2, var3 + 16, 36);
            }
         }

         var2 += 20;
         if (var2 > this.width - 20) {
            var2 = 0;
            var3 += 20;
         }
      }

      this.a(var1);
   }

   public final void a_() {
      this.n.a();
      if (this.H > 0) {
         --this.H;
         if (this.H == 0) {
            this.a.a(this.l, vdtt_ik.g[this.n.k].d, this);
            this.a.b((vdtt_k)this);
         }
      }

   }

   public final Vector g() {
      Vector var1;
      (var1 = new Vector()).addElement(new vdtt_hi(-1002, this.n.cx, this.n.cy, this.n.cx + this.n.width, this.n.cy + this.n.height, this.n, this));
      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      if (this.H <= 0 && this.n.k >= 0 && this.n.k < this.I) {
         this.H = 4;
      }

   }
}
