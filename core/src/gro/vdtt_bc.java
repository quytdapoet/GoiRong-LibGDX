package gro;

import java.util.Vector;

public final class vdtt_bc extends vdtt_al {
   private int l = 6010;
   private int m = 20;
   private vdtt_hq n;
   private int H;
   private int[] I;
   private String[] J;

   public vdtt_bc(int var1, int var2, int var3, vdtt_w var4) {
      this.a = var4;
      this.setXY(var1, var2);
      this.setSize(80, 80);
      this.I = new int[]{-1, -16742145, -16777216, -7812062, -2560, -48128, -3407617, -9942667, -16711681, -11184811, -3089954, -65536, -11393019, -10831436, -223233, -3842196};
      this.J = new String[]{"c#white", "c#blue", "c#black", "c#green", "c#yellow", "c#orange", "c#pink", "c#purple", "c#cyan", "c#grey", "c#silver", "c#red", "c#brown", "c#5ab9b4", "c#fc97ff", "c#55f6c"};
      this.n = new vdtt_hq((byte)1, 0, 0, this.width, this.height, this.m, Utlis.c(this.I.length, 4), 4);
   }

   public final void b(Graphics var1) {
      this.a(var1, -4, -4, this.width + 9, this.height + 9, 61, 22, 23, 1, 1);
      this.a(var1, this.n);
      int var2 = 0;
      int var3 = 0;

      for(int var4 = 0; var4 < this.I.length; ++var4) {
         if (this.n.c(var3)) {
            var1.f(4721926);
            var1.c(var2 + 1, var3 + 1, 20, 20);
            var1.f(this.I[var4]);
            if (var4 == this.n.M) {
               var1.c(var2 + 4, var3 + 4, 13, 13);
               var1.f(-1);
               var1.b(var2 + 1, var3 + 1, 18, 18);
            } else {
               var1.c(var2 + 3, var3 + 3, 15, 15);
               var1.f(-11184811);
               var1.b(var2 + 1, var3 + 1, 18, 18);
            }

            var1.f();
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
            GameSrc.gI().cJ = this.I[this.n.k];
            GameSrc.gI().cK = this.J[this.n.k];
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
      if (this.H <= 0 && this.n.k >= 0 && this.n.k < this.m) {
         this.H = 4;
      }

   }
}
