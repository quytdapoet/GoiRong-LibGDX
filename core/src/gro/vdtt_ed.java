package gro;

public final class vdtt_ed extends Entity {
   public int k;
   public int l;
   public int m;

   public final int minX() {
      return this.cx - this.width / 2;
   }

   public final int maxX() {
      return this.cx + this.width / 2;
   }

   public final int minY() {
      return this.cy - this.height / 2;
   }

   public final int maxY() {
      return this.cy + this.height / 2;
   }

   public final void m() {
      int var1 = this.cx - this.l;
      int var2 = this.cy - this.m;
      if (Utlis.b(var1) > this.k) {
         this.cx = (short)(this.cx + (var1 < 0 ? this.k : -this.k));
      }

      if (Utlis.b(var2) > this.k) {
         this.cy = (short)(this.cy + (var2 < 0 ? this.k : -this.k));
      }

   }

   public final void paintTop(Graphics var1) {
   }

   public final void paintBottom(Graphics var1) {
   }

   public final int prioritize() {
      return 0;
   }

   public final String strTop() {
      return null;
   }

   public final String strBottom() {
      return null;
   }

   public final void b(int var1, int var2) {
      this.l = var2;
      this.m = var2;
   }

   public void n() {
      if (this.l <= 16) {
         this.l = 16;
      } else if (this.l >= GameSrc.gI().maxX - 16) {
         this.l = (short)(GameSrc.gI().maxX - 16);
      }

      if (this.m <= 16) {
         this.m = 16;
      } else if (this.m >= GameSrc.gI().maxY - 16) {
         this.m = (short)(GameSrc.gI().maxY - 16);
      }

   }
}
