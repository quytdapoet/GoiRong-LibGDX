package gro;

public final class vdtt_iz extends Entity {
   public int k;
   public int l;

   public final void paintTop(Graphics var1) {
      var1.d(this.k);
      vdtt_cz.b(var1, this.l, 0, this.cx, this.cy, 3);
      var1.m = 1.0F;
   }

   public final int minX() {
      return 0;
   }

   public final int maxX() {
      return 0;
   }

   public final int minY() {
      return 0;
   }

   public final int maxY() {
      return 0;
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
      return 4;
   }
}
