package gro;

public final class vdtt_hr extends vdtt_hp {
   private vdtt_az N;
   private short O;
   private short P;
   public int M;

   public vdtt_hr(byte var1, int var2, int var3, int var4, int var5, int var6, int var7, vdtt_az var8) {
      super((byte)0, var2, var3, var4, var5, 1, 1);
      this.O = this.cx;
      this.P = this.cy;
      this.N = var8;
   }

   public final void f() {
      this.cx = this.O;
      this.cy = this.P;
   }

   public final void a(int var1, int var2) {
      if (mConfig.gI().b(12) == 2 && !this.N.aa) {
         this.N.aa = true;
         int var3 = this.N.cx + this.N.Y / 2;
         int var4 = this.N.cy + this.N.Z / 2;
         this.N.i();
         this.N.setXY(var3 + var1 - this.N.width / 2, var4 + var2 - this.N.height / 2);
         vdtt_dj var5 = this.N.p;
         int var6 = this.N.width / 2;
         var3 = this.N.height / 2;
         var5.c = var6;
         var5.d = var3;
         this.b(0, 0);
         GameSrc.gI().a(this.N.cx + this.N.width / 2 + DataCenter.gI().i, this.N.cy + this.N.height / 2 + DataCenter.gI().j, false);
      } else {
         this.b(var1 - this.N.width / 2, var2 - this.N.height / 2);
      }

   }

   public final void b(int var1, int var2) {
      this.cx = (short)(this.O + var1);
      this.cy = (short)(this.P + var2);
      if (this.cx < 10 - this.N.cx) {
         this.cx = (short)(10 - this.N.cx);
      }

      if (this.cx > DataCenter.gI().n - this.N.cx - 10) {
         this.cx = (short)(DataCenter.gI().n - this.N.cx - 10);
      }

      if (this.cy < 10 - this.N.cy) {
         this.cy = (short)(10 - this.N.cy);
      }

      if (this.cy > DataCenter.gI().o - this.N.cy - 10) {
         this.cy = (short)(DataCenter.gI().o - this.N.cy - 10);
      }

      var1 = vdtt_az.Q / 2;
      if (this.cx > this.O + var1) {
         this.cx = (short)(this.O + var1);
      }

      if (this.cy < this.P - var1) {
         this.cy = (short)(this.P - var1);
      }

      XYEntity var3 = XYEntity.create(this.N.S + this.N.width / 2, this.N.T + this.N.height / 2);
      var2 = this.cx - var3.cx;
      int var4 = var3.cy - this.cy;
      if (Utlis.a(this.cx, this.cy, var3.cx, var3.cy) > 33) {
         if ((var2 = vdtt_eo.b(var2, var4)) > 270) {
            var2 -= 270;
            var1 = vdtt_eo.S[90 - var2] * 33 / 1000;
            var2 = vdtt_eo.S[var2] * 33 / 1000;
            if (mConfig.gI().b(12) == 1) {
               this.N.S = (short)(this.cx - var1 - this.N.width / 2);
               this.N.T = (short)(this.cy - var2 - this.N.height / 2);
            } else {
               this.cx = (short)(this.N.S + var1 + this.N.width / 2);
               this.cy = (short)(this.N.T + var2 + this.N.height / 2);
            }
         } else if (var2 > 180) {
            var2 -= 180;
            var1 = vdtt_eo.S[var2] * 33 / 1000;
            var2 = vdtt_eo.S[90 - var2] * 33 / 1000;
            if (mConfig.gI().b(12) == 1) {
               this.N.S = (short)(this.cx + var1 - this.N.width / 2);
               this.N.T = (short)(this.cy - var2 - this.N.height / 2);
            } else {
               this.cx = (short)(this.N.S - var1 + this.N.width / 2);
               this.cy = (short)(this.N.T + var2 + this.N.height / 2);
            }
         } else if (var2 > 90) {
            var2 -= 90;
            var1 = vdtt_eo.S[90 - var2] * 33 / 1000;
            var2 = vdtt_eo.S[var2] * 33 / 1000;
            if (mConfig.gI().b(12) == 1) {
               this.N.S = (short)(this.cx + var1 - this.N.width / 2);
               this.N.T = (short)(this.cy + var2 - this.N.height / 2);
            } else {
               this.cx = (short)(this.N.S - var1 + this.N.width / 2);
               this.cy = (short)(this.N.T - var2 + this.N.height / 2);
            }
         } else {
            var1 = vdtt_eo.S[var2] * 33 / 1000;
            var2 = vdtt_eo.S[90 - var2] * 33 / 1000;
            if (mConfig.gI().b(12) == 1) {
               this.N.S = (short)(this.cx - var1 - this.N.width / 2);
               this.N.T = (short)(this.cy + var2 - this.N.height / 2);
            } else {
               this.cx = (short)(this.N.S + var1 + this.N.width / 2);
               this.cy = (short)(this.N.T - var2 + this.N.height / 2);
            }
         }

         this.N.V.setXY(this.N.S, this.N.T);
      }

      var3 = XYEntity.create(this.N.S + this.N.width / 2, this.N.T + this.N.height / 2);
      var2 = this.cx - var3.cx;
      var4 = var3.cy - this.cy;
      this.M = vdtt_eo.b(var2, var4);
   }

   public final void c(int var1, int var2) {
      super.c(var1, var2);
      this.e();
      if (!Utlis.a(0, 0, this.width, this.height, var1, var2)) {
         this.k = -1;
         this.l = -1;
      } else if (this.m != this.j) {
         this.k = -1;
      } else if (this.n == 1 && this.h != 0 && this.l < this.i && this.l == (this.f + var2) / this.h || this.n == 0 && this.h != 0 && this.l < this.i && this.l == (this.f + var1) / this.h) {
         this.k = this.l;
      }

      if (this.k >= 0) {
         vdtt_aa.gI().n();
      }

   }
}
