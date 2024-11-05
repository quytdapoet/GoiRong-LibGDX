package gro;

public final class WayPoint extends Entity {
   public short k;
   public short l;
   public short m;
   public short n;
   public short o;
   public short p;
   public int H;
   private String[] L = null;
   public int I = 0;
   public int J = 0;
   public int K;

   public WayPoint(int var1, int var2) {
      this.setXY(0, 0);
   }

   public final void a(short var1, short var2, short var3, short var4, short var5, short var6, short var7, short var8) {
      this.k = var1;
      this.l = var2;
      this.m = (short)(var3 - 5);
      this.n = (short)(var4 - 5);
      this.o = (short)(var5 + 5);
      this.p = (short)(var6 + 5);
      this.setXY(var3 + (var5 - var3) / 2, var6);
      String var9;
      if ((var9 = DataCenter.gI().mapTemplate[var2].name).length() <= 11) {
         this.L = new String[]{var9};
      } else {
         this.L = vdtt_dd.a(var9, 2);
      }

      this.I = var7;
      this.J = var8;
   }

   public final void a(short var1, short var2, short var3, short var4, short var5, short var6) {
      this.k = var1;
      this.l = var2;
      this.m = var3;
      this.n = var4;
      this.o = var5;
      this.p = var6;
      this.setXY(var3 + (var5 - var3) / 2, var4 + (var6 - var4) / 2);
   }

   public final void paintTop(Graphics var1) {
      XYEntity var2;
      if ((var2 = Char.b(this.cx, this.cy)) != null && (this.k != 58 || this.cy >= 80)) {
         this.cy = var2.cy;
      }

      int var3 = this.cx - 3;
      if (this.H > 0) {
         if (this.H % 2 == 0) {
            var1.a(1.2F, 0.5F);
         }

         --this.H;
      }

      if (this.k != 48 && this.k != 50) {
         String var4;
         int var5;
         if (this.k == 56) {
            var3 = this.cx - 30;
            int var6 = this.cy - 78;
            var4 = "";

            for(var5 = 0; var5 < this.L.length; ++var5) {
               var4 = var4 + this.L[var5];
               if (var5 < this.L.length - 1) {
                  var4 = var4 + " ";
               }
            }

            vdtt_y.a(var1, -5, 0, var3 - 45, var6, 85, (int)20);
            vdtt_dd.b(vdtt_dd.d, var1, var4, var3, var6 + 10, 2, -6488, -11184811);
         } else if (this.k == 58 && this.cy < 80) {
            var3 = this.cx - 5;
            var4 = "";

            for(var5 = 0; var5 < this.L.length; ++var5) {
               var4 = var4 + this.L[var5];
               if (var5 < this.L.length - 1) {
                  var4 = var4 + " ";
               }
            }

            vdtt_y.a(var1, -5, 0, 248, 0, 90, (int)30);
            vdtt_dd.b(vdtt_dd.d, var1, var4, var3 + 5, 12, 2, -6488, -11184811);
         } else {
            if (this.cx < 300) {
               var3 = this.cx + 4;
               vdtt_cz.a(var1, 29, -360, this.cx + 5, this.cy, 33);
            } else {
               vdtt_cz.a(var1, 29, 0, this.cx, this.cy, 33);
            }

            if (this.L.length > 1) {
               vdtt_dd.b(vdtt_dd.d, var1, this.L[0], var3 + 2, this.cy - 48, 2, -6488, -11184811);
               vdtt_dd.b(vdtt_dd.d, var1, this.L[1], var3 + 2, this.cy - 38, 2, -6488, -11184811);
            } else {
               vdtt_dd.b(vdtt_dd.d, var1, this.L[0], var3 + 2, this.cy - 43, 2, -6488, -11184811);
            }
         }

         var1.r();
      }

   }

   public final int minX() {
      return this.cx - 28;
   }

   public final int maxX() {
      return this.cx + 32;
   }

   public final int minY() {
      return this.cy - 54;
   }

   public final int maxY() {
      return this.cy - 31;
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
      return this.cy < 100 ? 3 : 4;
   }
}
