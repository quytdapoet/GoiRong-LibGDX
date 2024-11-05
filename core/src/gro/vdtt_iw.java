package gro;

public final class vdtt_iw extends Entity {
   public byte k;
   public short l;
   public short m;
   public short n;
   public vdtt_hf o;
   public Mob p;
   public int H;
   private int I;

   public final vdtt_ix m() {
      try {
         return GameSrc.gI().T == null ? null : GameSrc.gI().T[this.l];
      } catch (Exception var2) {
         return null;
      }
   }

   public vdtt_iw(int var1) {
      this.l = (short)var1;
      this.H = this.m().c;
   }

   public final int minX() {
      return this.cx - this.m().a / 2;
   }

   public final int maxX() {
      return this.cx + this.m().a / 2;
   }

   public final int minY() {
      return this.cy - this.m().b;
   }

   public final int maxY() {
      return this.cy;
   }

   public final void n() {
      try {
         if (this.m().e >= 0) {
            if (this.o == null) {
               this.o = new vdtt_hf(this.m().e, this.cx, this.cy, -1);
               this.o.p = this.k == 7;
               this.o.H = true;
            }
         } else if (this.m().e < -1) {
            if (this.p == null) {
               this.p = new Mob(-this.m().e);
               this.p.hp = 1;
               this.p.at = false;
               this.p.c(this.cx, this.cy);
               this.setSize(this.p.getMobTemplate().width, this.p.getMobTemplate().height);
               this.p.rangeMove = this.p.getMobTemplate().speedMoveByte;
               this.p.dir = (byte)(Utlis.b() ? 2 : 3);
            } else {
               this.setXY(this.p.cx, this.p.cy);
            }
         }

         if (this.o != null) {
            if (this.I > 0) {
               --this.I;
               return;
            }

            this.o.n();
            if (this.o.m == 0 && this.m().d == 11 && this.I == 0 && Utlis.a((int)10) != 0) {
               this.I = Utlis.a(10, 250);
            }

            this.width = this.o.width;
            this.height = this.o.height;
            if (this.o.p()) {
               this.o = null;
            }
         }
      } catch (Exception var2) {
      }

   }

   public final void paintTop(Graphics var1) {
      DataCenter.n();
      if (!DataCenter.k() || this.H == 10 || this.H == 5 || this.H == 7) {
         long var2 = System.currentTimeMillis();
         boolean var4 = false;
         if (GameSrc.gI().dD > var2 && DataCenter.gI().currentScreen instanceof GameSrc) {
            if (this.m().c > 5) {
               return;
            }

            var1.a(0.3F, 0.0F);
         } else if (GameSrc.gI().getMapTemplate().type == 15 && GameSrc.gI().cs == 52) {
            var1.a(0.04F, 0.0F);
            var4 = true;
         }

         if (this.I <= 0) {
            if (this.p != null) {
               this.p.paintTop(var1);
            } else if (this.o != null) {
               this.o.paintTop(var1);
            } else if (GameSrc.gI().getMapTemplate().type == 15 && this.l == 394) {
               if (GameSrc.gI().cs == 140) {
                  vdtt_cz.a(var1, 397, Utlis.a(this.k), this.cx, this.cy, this.m().a, this.m().b, 33);
               } else if (GameSrc.gI().cs >= 111) {
                  vdtt_cz.a(var1, 398, Utlis.a(this.k), this.cx, this.cy, this.m().a, this.m().b, 33);
               } else if (GameSrc.gI().cs >= 91) {
                  vdtt_cz.a(var1, 397, Utlis.a(this.k), this.cx, this.cy, this.m().a, this.m().b, 33);
               } else if (GameSrc.gI().cs >= 71) {
                  vdtt_cz.a(var1, 396, Utlis.a(this.k), this.cx, this.cy, this.m().a, this.m().b, 33);
               } else if (GameSrc.gI().cs >= 51) {
                  if (GameSrc.gI().cs != 52) {
                     var1.c(-50.0F);
                  }

                  vdtt_cz.a(var1, 395, Utlis.a(this.k), this.cx, this.cy, this.m().a, this.m().b, 33);
               } else if (GameSrc.gI().cs >= 31) {
                  vdtt_cz.a(var1, 395, Utlis.a(this.k), this.cx, this.cy, this.m().a, this.m().b, 33);
               } else {
                  vdtt_cz.a(var1, this.l, Utlis.a(this.k), this.cx, this.cy, this.m().a, this.m().b, 33);
               }
            } else {
               vdtt_cz.a(var1, this.l, Utlis.a(this.k), this.cx, this.cy, this.m().a, this.m().b, 33);
            }

            if (GameSrc.gI().dD > var2 || GameSrc.gI().getMapTemplate().type == 15 && GameSrc.gI().cs > 20 || var4) {
               var1.r();
            }

            DataCenter.n();
         }
      }

   }

   public final String strTop() {
      return null;
   }

   public final String strBottom() {
      return null;
   }

   public final void paintBottom(Graphics var1) {
   }

   public final int prioritize() {
      return this.H;
   }
}
