package gro;

public class vdtt_es extends Entity {
   public short k;
   protected byte l = -1;
   protected byte m = -1;
   protected byte n = 0;
   public boolean o;
   public boolean p;
   public int H;
   public int I = 100;

   public final vdtt_es o() {
      vdtt_es var1;
      (var1 = new vdtt_es(this.k, this.cx, this.cy, this.l)).n = this.n;
      var1.o = this.o;
      var1.m = this.m;
      var1.H = this.H;
      return var1;
   }

   public final vdtt_et p() {
      return DataCenter.gI().C != null && this.k < DataCenter.gI().C.length ? DataCenter.gI().C[this.k] : null;
   }

   public vdtt_es(int var1, int var2, int var3) {
      this.l = 1;
      this.k = (short)var1;
      this.setXY(var2, var3);
   }

   public vdtt_es(int var1, int var2, int var3, int var4) {
      this.l = (byte)var4;
      this.k = (short)var1;
      this.setXY(var2, var3);
   }

   public int minX() {
      return this.cx - this.width / 2;
   }

   public int maxX() {
      return this.cx + this.width / 2;
   }

   public int minY() {
      return this.cy - this.height / 2;
   }

   public int maxY() {
      return this.cy + this.height / 2;
   }

   public boolean q() {
      return this.l == 0;
   }

   public void n() {
      this.n = (byte)(this.n + 30);
      if (this.n >= 90) {
         this.n = 0;
      }

      ++this.m;
      if (this.p() != null && this.m >= this.p().b.length) {
         this.m = 0;
         if (this.l > 0) {
            --this.l;
         }
      }

   }

   public void paintTop(Graphics var1) {
      if (!this.r() || !(GameSrc.gI().c instanceof vdtt_kv) || ((vdtt_kv)GameSrc.gI().c).a.m()) {
         this.b(var1, 0, 0);
         mImage var2;
         if (this.k == 560) {
            if ((var2 = vdtt_cz.b(406)) != null) {
               var1.a(var2, 0, 0, 6 * DataCenter.gI().r, 14 * DataCenter.gI().r, (int)(System.currentTimeMillis() / 100L % 360L), this.cx - 4 + 1, this.cy - 7 + 4, 6 * DataCenter.gI().r, 14 * DataCenter.gI().r, 3 * DataCenter.gI().r, 3 * DataCenter.gI().r, 0);
            }
         } else if (this.k == 566 && (var2 = vdtt_cz.b(999)) != null) {
            var1.a(var2, 0, 0, 4 * DataCenter.gI().r, 7 * DataCenter.gI().r, (int)(System.currentTimeMillis() / 10L % 360L), this.cx - 2, this.cy - 3 + 1, 4 * DataCenter.gI().r, 7 * DataCenter.gI().r, 2 * DataCenter.gI().r, 2 * DataCenter.gI().r, 0);
         }
      }

   }

   public final void b(Graphics var1, int var2, int var3) {
      try {
         if ((!mConfig.gI().a(11) || this.k == GameSrc.gI().bn.k) && !this.q() && this.p() != null && this.m >= 0 && this.m < this.p().b.length) {
            boolean var4 = true;
            var1.k = var4;
            short var5 = 0;
            if (this.k == 464 || this.k == 465) {
               var1.c(179.0F);
            }

            if (this.k == 473 || this.k == 488 || this.k == 489 || this.k == 508 || this.k == 504) {
               var5 = 300;
            }

            if (this.k == 167) {
               int var6 = var2 + this.cx;
               int var7 = var2 + this.cy;
               vdtt_cz.a(var1, this.p().b[this.m].a, 0, var6, var7, this.I, Graphics.s(), 33);
            } else {
               short[] var9;
               if (this.H != 0) {
                  var1.c((float)this.H);
                  if (this.o) {
                     var9 = vdtt_cz.b(var1, this.p().b[this.m].a, Utlis.a(this.o != this.p().b[this.m].e, this.p().b[this.m].b), var2 + this.cx - this.p().b[this.m].c, var3 + this.cy + this.p().b[this.m].d + var5, 3);
                  } else {
                     var9 = vdtt_cz.b(var1, this.p().b[this.m].a, Utlis.a(this.o != this.p().b[this.m].e, this.p().b[this.m].b), var2 + this.cx + this.p().b[this.m].c, var3 + this.cy + this.p().b[this.m].d + var5, 3);
                  }

                  var1.r();
               } else if (this.o) {
                  var9 = vdtt_cz.b(var1, this.p().b[this.m].a, Utlis.a(this.o != this.p().b[this.m].e, this.p().b[this.m].b), var2 + this.cx - this.p().b[this.m].c, var3 + this.cy + this.p().b[this.m].d + var5, 3);
               } else {
                  var9 = vdtt_cz.b(var1, this.p().b[this.m].a, Utlis.a(this.o != this.p().b[this.m].e, this.p().b[this.m].b), var2 + this.cx + this.p().b[this.m].c, var3 + this.cy + this.p().b[this.m].d + var5, 3);
               }

               if (this.k == 464 || this.k == 465) {
                  var1.r();
               }

               var4 = false;
               var1.k = var4;
               this.width = var9[0];
               this.height = var9[1];
            }
         }
      } catch (Exception var8) {
         Utlis.a(var8);
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
      return this.p ? 3 : this.p().a;
   }

   public final boolean r() {
      return this.k == 441 || this.k == 591 || this.k == 592 || this.k == 619 || this.k == 621;
   }

   public final XYEntity u() {
      return this.o();
   }

   public Object clone() {
      return this.o();
   }
}
