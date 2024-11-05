package gro;

public final class vdtt_be extends vdtt_bd {
   public vdtt_be(int var1, int var2, int var3, int var4, int var5, vdtt_hm var6, vdtt_w var7, boolean var8) {
      super(var1, var2, 20, var5, var6, var7, 1, true);
      this.M = new String[var6.c.length];
      this.setXY(var1, var2);
      this.H = 100;
      this.I = var5 * this.L;

      for(var1 = 0; var1 < this.M.length; ++var1) {
         this.M[var1] = "";
         vdtt_dd.b(vdtt_dd.d, var6.c[var1]);
      }

   }

   public final void b(Graphics var1) {
      if (this.n.b < 0 || this.n.b >= this.n.d.length) {
         this.n.b = 0;
      }

      short var2 = this.n.d[this.n.b];
      if (this.e(0)) {
         var1.e(30);
      }

      vdtt_cz.a(var1, var2, 0, this.i() - 2, 2, 24);
      var1.h();
      if (this.N) {
         vdtt_cz.a(var1, this.m.cx, this.m.cy, this.m.width, this.m.height, -8492991, 22, 23, 1, 1, 90);

         int var3;
         for(var3 = 0; var3 < this.m.width - 40; var3 += 40) {
            if (this.J == 0) {
               vdtt_y.a(var1, 46, var3 / 40 % 2 == 0 ? 90 : -270, 3 + var3, 24, 34, (int)(this.m.height - 6));
            } else if (this.J == 1) {
               vdtt_y.a(var1, 46, var3 / 40 % 2 == 0 ? 90 : -270, 3 + var3, -this.m.height + 3, 34, (int)(this.m.height - 6));
            }
         }

         this.a(var1, this.m);
         byte var4 = 0;

         try {
            for(var3 = 0; var3 < this.n.c.length; ++var3) {
               if (this.m.b(var3)) {
                  if (var3 == this.m.k) {
                     vdtt_cz.a(var1, 1, var3 * this.m.h + 1, this.m.width - 2, this.m.h - 2);
                  }

                  if (var3 == this.m.l) {
                     vdtt_cz.a(var1, this.n.d[var3], 0, 11, 1 + var3 * this.m.h + this.m.h / 2, 3);
                     vdtt_dd.b(vdtt_dd.d, var1, this.n.c[var3], 26, 0 + var3 * this.m.h + this.m.h / 2, 0, -1, -11184811);
                     if (var3 == 7) {
                        vdtt_cz.a(var1, 752 + DataCenter.gI().h / 10 % 4, 0, this.m.width - 3, 1 + var3 * this.m.h + this.m.h / 2 - 3 + 1, 10);
                     }
                  } else {
                     vdtt_cz.a(var1, this.n.d[var3], 0, 10, var3 * this.m.h + this.m.h / 2, 3);
                     vdtt_dd.b(vdtt_dd.d, var1, this.n.c[var3], 25, -1 + var3 * this.m.h + this.m.h / 2, 0, -1, -11184811);
                     if (var3 == 7) {
                        vdtt_cz.a(var1, 752 + DataCenter.gI().h / 10 % 4, 0, this.m.width - 3, 1 + var3 * this.m.h + this.m.h / 2 - 3, 10);
                     }
                  }
               }
            }
         } catch (Exception var6) {
            Utlis.b("loiiii: " + this.n.d.length + ", " + this.n.c.length + ", iii: " + var4);
            Utlis.a(var6);
         }

         this.a(var1);
         this.m.a(var1, this, 0);
      }

   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      if (this.Q <= 0) {
         super.a(var1, var2, var3);

         try {
            switch(var1.b) {
            case -1002:
               if (var1.j.k >= 0) {
                  this.Q = 4;
                  if (this.m.k == 6) {
                     GameSrc.gI().c(Caption.qr, -48094);
                  } else if (this.m.k == 7) {
                     GameSrc.gI().c(Caption.pg, -16711681);
                  }
               }
               break;
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
            }

            vdtt_aa.gI().n();
         } catch (Exception var5) {
         }
      }

   }

   public final void a(byte var1) {
      this.n.b = var1;
   }

   public final byte j() {
      return (byte)this.n.b;
   }
}
