package gro;

import java.util.Vector;

public class vdtt_bd extends vdtt_k {
   private boolean R;
   public int l;
   public vdtt_hp m;
   public vdtt_hm n;
   public int H;
   public int I;
   public int J;
   public int K;
   public int L = 20;
   public String[] M;
   public boolean N;
   public boolean O;
   private short S = 12;
   public int P = -1;
   public int Q;

   public vdtt_bd(int var1, int var2, int var3, int var4, vdtt_hm var5, vdtt_w var6, int var7, boolean var8) {
      this.setXY(var1, var2);
      this.a = var6;
      this.l = var3;
      this.R = var8;
      this.J = var7;
      this.a(var5, var4);
   }

   public final void a(vdtt_hm var1, int var2) {
      this.K = var2;
      this.I = var2 * this.L + this.L + 1;
      this.n = var1;
      this.M = new String[var1.c.length];

      int var3;
      for(var3 = 0; var3 < var1.c.length; ++var3) {
         if ((var2 = vdtt_dd.c(vdtt_dd.d, var1.c[var3])) + 30 > this.H) {
            this.H = var2 + 30;
         }

         if (var2 > this.l - 30) {
            this.M[var3] = vdtt_dd.c(vdtt_dd.d, var1.c[var3], this.l - 30)[0].toString() + "...";
         } else {
            this.M[var3] = var1.c[var3];
         }
      }

      if (this.H < this.l) {
         this.H = this.l;
      }

      this.h();
      if (this.m != null) {
         var3 = this.m.k;
         this.setSize(this.H, this.I);
         if (this.J == 0) {
            this.m = new vdtt_hp((byte)1, 0, 21, this.width, this.height - this.L - 1, this.L, var1.c.length);
         } else if (this.J == 1) {
            this.m = new vdtt_hp((byte)1, 0, 21 - this.height, this.width, this.height - this.L - 1, this.L, var1.c.length);
         }

         var1.b = var3;
         if (var1.c.length > 0 && (var1.b >= var1.c.length || var1.b < 0)) {
            var1.b = 0;
         }

         this.m.a(var1.b);
         this.m.k = var1.b;
      }

   }

   public final short d() {
      return this.n.d[this.n.b];
   }

   public final String f() {
      return this.n.c[this.n.b];
   }

   public final void a(int var1) {
      this.n.b = var1;
   }

   public void b(Graphics var1) {
      if (!this.d) {
         short var2 = this.S;
         this.a(var1, 0, 0, this.i() - 18, 20, 46, 22, 23, 1, 1);
         if (this.e(0)) {
            var1.e(30);
         }

         if (this.J == 0) {
            vdtt_cz.a(var1, var2, 0, this.i(), 2, 24);
         } else if (this.J == 1) {
            vdtt_cz.a(var1, var2, 180, this.i(), 2, 24);
         }

         var1.h();
         String var3;
         if (this.n.b >= 0 && this.n.b < this.n.c.length) {
            var3 = this.M[this.n.b].trim().replaceAll(":-space", "");
            if (this.O) {
               var3 = this.n.b + 1 + ". " + var3;
            }

            if (this.c) {
               vdtt_dd.c(vdtt_dd.d, var1, var3, 5, 9, 0, -3089954, 0);
            } else {
               vdtt_dd.c(vdtt_dd.d, var1, var3, 5, 9, 0, -1, -16777216);
            }
         }

         if (this.N) {
            vdtt_cz.a(var1, this.m.cx, this.m.cy, this.m.width, this.m.height, -8492991, 22, 23, 1, 1, 90);

            int var4;
            for(var4 = 0; var4 < this.m.width - 40; var4 += 40) {
               if (this.J == 0) {
                  vdtt_y.a(var1, 46, var4 / 40 % 2 == 0 ? 90 : -270, 3 + var4, 24, 34, (int)(this.m.height - 6));
               } else if (this.J == 1) {
                  vdtt_y.a(var1, 46, var4 / 40 % 2 == 0 ? 90 : -270, 3 + var4, -this.m.height + 3, 34, (int)(this.m.height - 6));
               }
            }

            this.a(var1, this.m);

            for(var4 = 0; var4 < this.n.c.length; ++var4) {
               if (this.m.b(var4)) {
                  if (var4 == this.m.k) {
                     vdtt_cz.a(var1, 1, var4 * this.m.h + 1, this.m.width - 2, this.m.h - 2);
                  }

                  var3 = this.n.c[var4];
                  if (this.O) {
                     var3 = var4 + 1 + ". " + var3;
                  }

                  if (var4 == this.m.l) {
                     vdtt_dd.c(vdtt_dd.d, var1, var3, 6, 1 + var4 * this.m.h + this.m.h / 2, 0, -1, -11184811);
                  } else {
                     vdtt_dd.c(vdtt_dd.d, var1, var3, 5, var4 * this.m.h + this.m.h / 2, 0, -1, -11184811);
                  }
               }
            }

            this.a(var1);
            this.m.a(var1, this, 0);
         }
      }

   }

   public final void a_() {
      if (!this.c) {
         if (this.N) {
            this.m.a();
         }

         if (this.Q > 0) {
            --this.Q;
            if (this.Q == 0 && this.m.k >= 0) {
               this.n.b = this.m.k;
               this.h();
               if (this.R) {
                  this.a.a(this.n.a, this.n, this);
               }
            }
         }
      }

   }

   public final void h() {
      this.N = false;
      this.setSize(this.i(), 20);
   }

   public final int i() {
      return this.H > this.l ? this.l : this.H;
   }

   public void a(vdtt_hi var1, int var2, int var3) {
      if (!this.c && !this.d && this.Q <= 0) {
         try {
            switch(var1.b) {
            case -1002:
               if (var1.j.k >= 0) {
                  this.Q = 4;
               }

               vdtt_aa.gI().n();
            default:
               return;
            case -1001:
               this.h();
               break;
            case -1000:
               this.N = true;
               this.setSize(this.H, this.I);
               if (this.m == null) {
                  if (this.J == 0) {
                     this.m = new vdtt_hp((byte)1, 0, 21, this.width, this.height - this.L, this.L, this.n.c.length);
                  } else if (this.J == 1) {
                     this.m = new vdtt_hp((byte)1, 0, 21 - this.height, this.width, this.height - this.L, this.L, this.n.c.length);
                  }
               }

               if (this.m.j < 0 || this.m.j >= this.n.c.length || this.m.j > this.n.b + this.K / 2 + 1 || this.m.j < this.n.b - (this.K / 2 + 1)) {
                  this.m.a(this.n.b);
               }

               this.m.k = this.n.b;
               vdtt_aa.gI().n();
            }
         } catch (Exception var5) {
         }
      }

   }

   public final Vector g() {
      if (!this.c && !this.d) {
         Vector var1 = new Vector();
         if (!this.N) {
            var1.addElement(new vdtt_hi(-1000, 0, 0, this.i(), 20, (vdtt_hp)null, this));
         } else {
            var1.addElement(new vdtt_hi(-1001, 0, 0, this.i(), 20, (vdtt_hp)null, this));
            var1.addElement(new vdtt_hi(-1002, this.m.cx, this.m.cy, this.m.cx + this.m.width, this.m.cy + this.m.height, this.m, this));
         }

         return var1;
      } else {
         return null;
      }
   }
}
