package gro;

public final class vdtt_du extends Entity {
   public vdtt_es k;
   private byte p;
   public byte l;
   public byte m;
   public byte n;
   public byte o;
   private int H;
   private int I;
   private int J;
   private int K;
   private int L;
   private int M;
   private int N;
   private int O;
   private int P;
   private boolean Q;
   private boolean R;
   private boolean S;

   public vdtt_du(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      this.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, (short)0, (short)0);
   }

   public vdtt_du(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, short var10, short var11) {
      this.a(var1, var2, 0, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   private void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, short var10, short var11) {
      this.k = new vdtt_es(var1, Utlis.a(var7), Utlis.a(var8), -1);
      this.J = var10;
      this.K = var11;
      this.l = (byte)var2;
      this.m = (byte)var3;
      this.p = (byte)var4;
      this.H = var7;
      this.I = var8;
      this.L = var6;
      this.Q = var9;
      if (var4 == 12) {
         this.k.cx = (short)(var5 * var10 - var10 / 2);
         this.k.cy = (short)(var8 - var11 / 2);
      } else if (var4 != 3 && var4 != 4) {
         if (var4 == 7) {
            this.k.cx = (short)(GameSrc.gI().maxX / 2);
            this.k.cy = (short)(var5 * var11);
         }
      } else {
         this.k.cx = (short)(var5 * var10 - var10 / 2);
         this.k.cy = (short)(var8 + 1);
         this.I = this.k.cy;
      }

      this.a(true);
      if (var4 == 3 || var4 == 4 || var4 == 9 || var4 == 10) {
         for(var1 = 0; var1 < 1000 && !this.S; ++var1) {
            this.m();
         }
      }

   }

   private void a(boolean var1) {
      vdtt_es var2;
      boolean var3;
      vdtt_du var4;
      switch(this.p) {
      case 0:
         this.n = (byte)Utlis.a(1, this.l);
         this.o = 0;
         if (!var1) {
            this.k.setXY(this.H + Utlis.a(50, 150), Utlis.a(this.I));
         } else {
            this.k.setXY(Utlis.a(this.H), Utlis.a(this.I));
         }

         if (this.Q) {
            this.k.cy = (short)(this.I + Utlis.a((int)50) - 25);
            return;
         }

         return;
      case 1:
         this.R = Utlis.b();
         this.n = (byte)Utlis.a(1, this.l);
         this.o = 0;
         if (this.R) {
            if (!var1) {
               this.k.setXY(-Utlis.a(50, 150), Utlis.a(this.I));
            } else {
               this.k.setXY(Utlis.a(this.H), Utlis.a(this.I));
            }

            this.k.o = false;
         } else {
            this.k.o = true;
            if (!var1) {
               this.k.setXY(this.H + Utlis.a(50, 150), Utlis.a(this.I));
            } else {
               this.k.setXY(Utlis.a(this.H), Utlis.a(this.I));
            }
         }

         if (this.Q) {
            this.k.cy = (short)(this.I + Utlis.a((int)50) - 25);
            return;
         }

         return;
      case 2:
         this.R = true;
         this.k.o = false;
         this.n = (byte)Utlis.a(1, this.l);
         this.o = 0;
         if (!var1) {
            this.k.setXY(-Utlis.a(50, 150), Utlis.a(this.I));
         } else {
            this.k.setXY(Utlis.a(this.H), Utlis.a(this.I));
         }

         if (this.Q) {
            this.k.cy = (short)(this.I + Utlis.a((int)50) - 25);
            return;
         }

         return;
      case 3:
         this.n = this.l;
         this.o = 0;
         if (!var1) {
            var2 = this.k;
            var2.cx += (short)(this.L * this.J - this.n);
            return;
         }

         return;
      case 4:
         this.n = this.l;
         this.o = 0;
         if (!var1) {
            var2 = this.k;
            var2.cx -= (short)(this.L * this.J - this.n);
         }

         var4 = this;
         var3 = Utlis.b();
         break;
      case 5:
         this.n = (byte)Utlis.a(1, this.l);
         this.o = (byte)Utlis.a(1, this.m);
         if (!var1) {
            this.k.setXY(Utlis.a(this.H), 0);
            return;
         }

         this.k.setXY(Utlis.a(this.H), Utlis.a(this.I));
         return;
      case 6:
         this.n = (byte)Utlis.a(1, this.l);
         this.o = (byte)(this.m + Utlis.a(1, 5));
         if (!var1) {
            this.k.setXY(Utlis.a(this.H), 0);
            return;
         }

         this.k.setXY(Utlis.a(this.H), Utlis.a(this.I));
         return;
      case 7:
         this.n = 0;
         this.o = this.m;
         if (!var1) {
            var2 = this.k;
            var2.cy -= (short)(this.L * this.K - this.o);
            return;
         }

         return;
      case 8:
         this.n = (byte)Utlis.a(1, this.l);
         this.o = (byte)(this.m + Utlis.a(0, 2));
         if (!var1) {
            this.k.setXY(Utlis.a(this.H), 0);
            return;
         }

         this.k.setXY(Utlis.a(this.H), Utlis.a(this.I));
         return;
      case 9:
         this.n = (byte)Utlis.a(1, this.l);
         this.o = (byte)(-Utlis.a(1, 3));
         this.k.setXY(Utlis.a(this.H), this.I);
         this.R = Utlis.a((int)2) == 0;
         return;
      case 10:
         this.n = (byte)Utlis.a(-2, 2);
         this.o = (byte)(-Utlis.a(4, 7));
         this.k.setXY(Utlis.a(this.H), Utlis.a(0, this.I * 3 / 2));
         var4 = this;
         var3 = Utlis.a((int)2) == 0;
         break;
      case 11:
         this.n = (byte)Utlis.a(0, 1);
         this.o = (byte)Utlis.a(1, 3);
         if (!var1) {
            this.k.setXY(Utlis.a(this.H), 0);
            return;
         }

         this.k.setXY(Utlis.a(this.H), Utlis.a(this.I));
         return;
      case 12:
         this.n = this.l;
         this.o = 0;
         if (!var1) {
            var2 = this.k;
            var2.cx += (short)(this.L * this.J - this.n);
            return;
         }

         return;
      default:
         return;
      }

      var4.R = var3;
   }

   public final int minX() {
      return this.p != 3 && this.p != 4 && this.p != 12 ? this.k.minX() : this.k.cx - this.J;
   }

   public final int minY() {
      return this.p == 7 ? this.k.cy - this.K : this.k.minY();
   }

   public final int maxX() {
      return this.p != 3 && this.p != 4 && this.p != 12 ? this.k.maxX() : this.k.cx + this.J;
   }

   public final int maxY() {
      return this.p == 7 ? this.k.cy + this.K : this.k.maxY();
   }

   public final void m() {
      this.k.n();
      if (!this.R && (this.k.maxX() < -this.J || this.k.minY() > this.I) || this.R && (this.k.minX() > this.H + this.J || this.k.minY() > this.I) || (this.p == 9 || this.p == 10) && this.k.maxY() < 0) {
         this.a(false);
         this.S = true;
      } else {
         vdtt_es var1;
         if (this.R) {
            var1 = this.k;
            var1.cx = (short)(var1.cx + this.n);
            var1 = this.k;
            var1.cy = (short)(var1.cy + this.o);
         } else {
            var1 = this.k;
            var1.cx = (short)(var1.cx - this.n);
            var1 = this.k;
            var1.cy = (short)(var1.cy + this.o);
         }
      }

   }

   public final void paintTop(Graphics var1) {
      int var2 = var1.e;
      int var3 = var1.f;
      if (this.O != 0 || this.P != 0) {
         var1.d(this.M, this.N, this.O, this.P);
      }

      this.k.paintTop(var1);
      if (this.O != 0 || this.P != 0) {
         var1.a(-var1.e, -var1.f);
         var1.a(0, 0);
         var1.d(0, 0, DataCenter.gI().n, DataCenter.gI().o);
         var1.a(var2, var3);
      }

   }

   public final void paintBottom(Graphics var1) {
   }

   public final String strTop() {
      return null;
   }

   public final String strBottom() {
      return null;
   }

   public final int prioritize() {
      return this.k.p().a;
   }
}
